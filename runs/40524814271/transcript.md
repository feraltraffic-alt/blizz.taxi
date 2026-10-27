# Sandbox transcript (2026-10-27T14:50:04Z, 54293ad)

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
  "correlation_id": "d4932656-12f4-4f0e-8afc-8e801dba5392"
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
  "session_id": "b1e1a919-66e8-4d2c-8085-19d769cdf05a",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MDUsImlhdCI6MTc5MzExMjYwNSwianRpIjoiY2JiZGM3ODQtOWM0NC00NWIwLWE4YWUtZWFjZjBjZTJkNzE5Iiwic2lkIjoiYjFlMWE5MTktNjZlOC00ZDJjLTgwODUtMTlkNzY5Y2RmMDVhIn0.aQcvr52swfiP7ro_Lcl-w4gpHan2ekC7dqLbwhhyg60",
  "access_expires_at": "2026-10-27T15:05:05.046508479Z",
  "refresh_token": "IISYSuRNizCI-IeiPXsqK6DKJDvMm-q5jGyTTuqxjqU",
  "refresh_expires_at": "2026-10-28T02:50:05.044692996Z",
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
  "session_id": "974ab5a0-54f8-410e-91ec-31e285e8340b",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MDYsImlhdCI6MTc5MzExMjYwNiwianRpIjoiMzBkODJlYzItNDM5Ni00OTM5LWEzZTktYjk4NGVhYzczYzM2Iiwic2lkIjoiOTc0YWI1YTAtNTRmOC00MTBlLTkxZWMtMzFlMjg1ZTgzNDBiIn0._byNtkoCpXDrYABDZxmvgjMRQqHU88QGMy4OjgSKchQ",
  "access_expires_at": "2026-10-27T15:05:06.191459284Z",
  "refresh_token": "HWNTtQQizUqum2VANkCn84g33EGbJnlKVIar9RmTPyY",
  "refresh_expires_at": "2026-10-28T02:50:06.190626819Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "bd20feba-7943-4238-8efd-6cc4b446a9d6",
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
  "id": "6e280ad1-c60a-498a-9585-a1450fcc1aca",
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
  "created_by": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
  "created_at": "2026-10-27T14:50:06.252702Z",
  "updated_at": "2026-10-27T14:50:06.252702Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634463641",
  "device_ref": "sandbox-22178"
}
```

```json
{
  "challenge_id": "8b6df605-3210-4d01-bc6a-5308b1e842b4",
  "expires_at": "2026-10-27T14:55:06.295537821Z",
  "resend_available_at": "2026-10-27T14:50:07.295537821Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634463641` → **200**

```json
{
  "phone": "+380634463641",
  "audience": "CLIENT",
  "code": "050733",
  "sent_at": "2026-10-27T14:50:06.301276011Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b6df605-3210-4d01-bc6a-5308b1e842b4",
  "code": "050733",
  "device_ref": "sandbox-22178"
}
```

```json
{
  "session_id": "0aef5d13-13b6-4e99-a8b6-fbbbe3c4a5b4",
  "subject": {
    "type": "CLIENT",
    "id": "1b376c31-2745-4024-ab97-c6e7dddfd03a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjM3NmMzMS0yNzQ1LTQwMjQtYWI5Ny1jNmU3ZGRkZmQwM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzNTA2LCJpYXQiOjE3OTMxMTI2MDYsImp0aSI6IjRjNThlODA4LWU1ZDItNDBlOS1iYzJlLWRkM2JlNjU5MGUxNCIsInNpZCI6IjBhZWY1ZDEzLTEzYjYtNGU5OS1hOGI2LWZiYmJlM2M0YTViNCJ9.KC37-7Wo9vMa8qvMErQXwtwt7p0LuwXAu_JxKAOrK8c",
  "access_expires_at": "2026-10-27T15:05:06.373160441Z",
  "refresh_token": "L-pm4JADcTsl3MOJf8XtboF4sr8hlZ1Wvh5P_sNIRdA",
  "refresh_expires_at": "2026-11-26T14:50:06.372135375Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634463641` → **200**

```json
{
  "client_id": "1b376c31-2745-4024-ab97-c6e7dddfd03a"
}
```

`POST /api/admin/v1/rider-wallets/1b376c31-2745-4024-ab97-c6e7dddfd03a/top-ups` → **201**

```json
{
  "command_id": "fae12fc2-551a-424d-a605-023b61aae4e0",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1b376c31-2745-4024-ab97-c6e7dddfd03a",
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
      "id": "91fbc4ac-f90a-4251-a7cc-60db9017681e",
      "at": "2026-10-27T14:50:06.447584Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aab5f02d-4d53-4066-8351-620fef480834",
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
  "id": "72f7fb78-631e-47fb-a7c9-221da5d16a0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:55:06.686945Z",
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
      "id": "6e280ad1-c60a-498a-9585-a1450fcc1aca",
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
  "device_ref": "sandbox-24585"
}
```

```json
{
  "challenge_id": "72bf305d-a34a-4ce0-a847-396107436d9c",
  "expires_at": "2026-10-27T14:55:06.751281598Z",
  "resend_available_at": "2026-10-27T14:50:07.751281598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "730673",
  "sent_at": "2026-10-27T14:50:06.75459083Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72bf305d-a34a-4ce0-a847-396107436d9c",
  "code": "730673",
  "device_ref": "sandbox-24585"
}
```

```json
{
  "session_id": "998f718d-957a-4193-bed7-e76b7b09143f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUwNiwiaWF0IjoxNzkzMTEyNjA2LCJqdGkiOiIxMGQzMGYwYi0wYzNhLTQ3ODgtYWRkZi05MGU4ZTllNTg0N2MiLCJzaWQiOiI5OThmNzE4ZC05NTdhLTQxOTMtYmVkNy1lNzZiN2IwOTE0M2YifQ.zk553oJG_AqdHe9Hz3FK3KV44C48MSXeRBPJ9oieFm8",
  "access_expires_at": "2026-10-27T15:05:06.807055397Z",
  "refresh_token": "u6x-8xQM8hFUtIzcIApya9IfLe1eVAN6qlbbaDJh32k",
  "refresh_expires_at": "2026-11-26T14:50:06.806148599Z",
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
  "command_id": "e035bec1-99f2-4bb3-bcca-46f7e5f5ed70",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:06Z",
    "sequence": 1793112606861
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c370e639-053b-4136-bfb7-21bd92dcddc4",
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
  "last_heartbeat_at": "2026-10-27T14:50:06.898879Z",
  "last_location_at": "2026-10-27T14:50:06.898879Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0b2bf3a8-a2d5-4a39-bdb1-bc44df793464",
  "quote_id": "72f7fb78-631e-47fb-a7c9-221da5d16a0f",
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
  "id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b376c31-2745-4024-ab97-c6e7dddfd03a",
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
  "created_at": "2026-10-27T14:50:06.966728Z",
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
  "client_id": "1b376c31-2745-4024-ab97-c6e7dddfd03a",
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
      "id": "91fbc4ac-f90a-4251-a7cc-60db9017681e",
      "at": "2026-10-27T14:50:06.447584Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
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
    "id": "11276619-7a10-407a-ba41-f8f32e74f241",
    "order_id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4",
    "expires_at": "2026-10-27T14:50:21.977838Z",
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

`POST /api/driver/v1/offers/11276619-7a10-407a-ba41-f8f32e74f241/accept` → **200**

```json
{
  "command_id": "1bb4fe9c-d0ad-4624-bd05-52c76b101216"
}
```

```json
{
  "id": "9cb51933-0845-45f2-9082-727a38ce1110",
  "order_id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "78b2e616-2a50-4d4a-9289-b46c98e985ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "78b2e616-2a50-4d4a-9289-b46c98e985ed",
  "order_id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4",
  "assignment_id": "9cb51933-0845-45f2-9082-727a38ce1110",
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

`POST /api/driver/v1/work-sessions/c370e639-053b-4136-bfb7-21bd92dcddc4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:07Z",
    "sequence": 1793112607127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c370e639-053b-4136-bfb7-21bd92dcddc4",
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
  "last_heartbeat_at": "2026-10-27T14:50:07.148724Z",
  "last_location_at": "2026-10-27T14:50:07.148724Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/78b2e616-2a50-4d4a-9289-b46c98e985ed/arrive` → **200**

```json
{
  "command_id": "b0a6abb1-0888-479f-9453-b1d1ad66b6ee",
  "expected_version": 0
}
```

```json
{
  "id": "78b2e616-2a50-4d4a-9289-b46c98e985ed",
  "order_id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4",
  "assignment_id": "9cb51933-0845-45f2-9082-727a38ce1110",
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
  "arrived_at": "2026-10-27T14:50:07.190907Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/78b2e616-2a50-4d4a-9289-b46c98e985ed/start` → **200**

```json
{
  "command_id": "2ff7e51e-a06e-4946-a48c-b77c4f987e27",
  "expected_version": 1
}
```

```json
{
  "id": "78b2e616-2a50-4d4a-9289-b46c98e985ed",
  "order_id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4",
  "assignment_id": "9cb51933-0845-45f2-9082-727a38ce1110",
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
  "arrived_at": "2026-10-27T14:50:07.190907Z",
  "started_at": "2026-10-27T14:50:07.230187Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/78b2e616-2a50-4d4a-9289-b46c98e985ed/complete` → **200**

```json
{
  "command_id": "d6cc0ff2-2b00-41ec-9ee1-b905bfb794a9",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:50:07Z",
  "cash_received": true
}
```

```json
{
  "id": "78b2e616-2a50-4d4a-9289-b46c98e985ed",
  "order_id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4",
  "assignment_id": "9cb51933-0845-45f2-9082-727a38ce1110",
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
  "arrived_at": "2026-10-27T14:50:07.190907Z",
  "started_at": "2026-10-27T14:50:07.230187Z",
  "completed_at": "2026-10-27T14:50:07.480098Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1b376c31-2745-4024-ab97-c6e7dddfd03a",
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
      "id": "2ba735b0-2379-4b58-a041-b31d940589ce",
      "at": "2026-10-27T14:50:07.70272Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4"
    },
    {
      "id": "91fbc4ac-f90a-4251-a7cc-60db9017681e",
      "at": "2026-10-27T14:50:06.447584Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/6e280ad1-c60a-498a-9585-a1450fcc1aca/archive` → **200**

```json
{
  "command_id": "66c073b1-2382-44f0-8897-9a5d3e01ddb5",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "6e280ad1-c60a-498a-9585-a1450fcc1aca",
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
  "created_by": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
  "created_at": "2026-10-27T14:50:06.252702Z",
  "updated_at": "2026-10-27T14:50:10.564831Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c370e639-053b-4136-bfb7-21bd92dcddc4",
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
  "last_heartbeat_at": "2026-10-27T14:50:07.148724Z",
  "last_location_at": "2026-10-27T14:50:07.148724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c370e639-053b-4136-bfb7-21bd92dcddc4/close` → **200**

```json
{
  "command_id": "4a5b809c-858d-4db8-bf15-41f0e3e7f1d2",
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

Done: order 8a4cf28c-ae48-4b66-8894-b4835acd6cf4.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630456159",
  "device_ref": "sandbox-26584"
}
```

```json
{
  "challenge_id": "ac3564f2-3805-4e7a-a3e5-79b78d60625a",
  "expires_at": "2026-10-27T14:55:10.681415281Z",
  "resend_available_at": "2026-10-27T14:50:11.681415281Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630456159` → **200**

```json
{
  "phone": "+380630456159",
  "audience": "CLIENT",
  "code": "011102",
  "sent_at": "2026-10-27T14:50:10.68424627Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac3564f2-3805-4e7a-a3e5-79b78d60625a",
  "code": "011102",
  "device_ref": "sandbox-26584"
}
```

```json
{
  "session_id": "9a0f8d0a-2bdb-4caa-8145-76157f671f4e",
  "subject": {
    "type": "CLIENT",
    "id": "56109e64-1a2c-4aa8-b29a-20510af33b32"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NjEwOWU2NC0xYTJjLTRhYTgtYjI5YS0yMDUxMGFmMzNiMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzNTEwLCJpYXQiOjE3OTMxMTI2MTAsImp0aSI6IjA2ZDAyODI4LWEzYjYtNGI1NC04MTlmLTUyY2QxN2NkMjRlMiIsInNpZCI6IjlhMGY4ZDBhLTJiZGItNGNhYS04MTQ1LTc2MTU3ZjY3MWY0ZSJ9.AO9fva4JMdJnLWUWhhC-jKR4gbiSAqsM24zRAe1aTaU",
  "access_expires_at": "2026-10-27T15:05:10.735681387Z",
  "refresh_token": "jeERMXgvR7yU1arYdlS7gHm_HaP039TSuY5RsMYZFps",
  "refresh_expires_at": "2026-11-26T14:50:10.734996994Z",
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
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport"
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
  "device_ref": "sandbox-3461"
}
```

```json
{
  "challenge_id": "6733d60d-4c77-4874-a6c1-7102c09482e7",
  "expires_at": "2026-10-27T14:55:10.78825922Z",
  "resend_available_at": "2026-10-27T14:50:11.78825922Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "842786",
  "sent_at": "2026-10-27T14:50:10.79749088Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6733d60d-4c77-4874-a6c1-7102c09482e7",
  "code": "842786",
  "device_ref": "sandbox-3461"
}
```

```json
{
  "session_id": "f7c4b4dc-bdb2-4cc9-b87f-f9222f143ffc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUxMCwiaWF0IjoxNzkzMTEyNjEwLCJqdGkiOiJmYzZjZjk4MS1lMzkzLTQzYTktOTRmYS00NGYyNzk0MzI5ODkiLCJzaWQiOiJmN2M0YjRkYy1iZGIyLTRjYzktYjg3Zi1mOTIyMmYxNDNmZmMifQ.MV5yvXYZzugZc2oX4K-0Q5FTy-sGLmYQsWes57riCBA",
  "access_expires_at": "2026-10-27T15:05:10.849942737Z",
  "refresh_token": "XiC_3m8KzvTmYb5x3i4n5tm0Ze2f7mt1bbR-B-AbRwk",
  "refresh_expires_at": "2026-11-26T14:50:10.84932901Z",
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
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup"
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
  "session_id": "1e8ce187-cfd1-4513-9fce-472a38345883",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MTEsImlhdCI6MTc5MzExMjYxMSwianRpIjoiMjkzNzBhNjQtOGIzMy00NmQ4LWFmODUtYmY1ZWRlODc2OTc3Iiwic2lkIjoiMWU4Y2UxODctY2ZkMS00NTEzLTlmY2UtNDcyYTM4MzQ1ODgzIn0.wR5N97NxAX2NR1gRx2W483z5ZPrNB7QJyFxqMh4iPLQ",
  "access_expires_at": "2026-10-27T15:05:11.157102667Z",
  "refresh_token": "yq5hSCF9U6xBEClTZ_nmC70CLD47F3Um7gyGNS04cfY",
  "refresh_expires_at": "2026-10-28T02:50:11.156493782Z",
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
  "session_id": "5df810ce-9b18-431d-a221-d896afd6439e",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MTEsImlhdCI6MTc5MzExMjYxMSwianRpIjoiNjQ2YzQ3OGEtNTdjNi00ZmU0LWFjNGEtMTc3MzFiYzQzY2M0Iiwic2lkIjoiNWRmODEwY2UtOWIxOC00MzFkLWEyMjEtZDg5NmFmZDY0MzllIn0.3KCTY8SYsLc3y-Gk8VmEcnijSlvqv8hUbv_DWYDhKSA",
  "access_expires_at": "2026-10-27T15:05:11.44378789Z",
  "refresh_token": "LbHUpzk4M3yY1WCTGvKFDx7ayN_9O1o5tpwFIV3PDRs",
  "refresh_expires_at": "2026-10-28T02:50:11.443147974Z",
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
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident"
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
  "command_id": "524f58df-d9a4-46de-8d9c-55224a81ba8b",
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
  "id": "b865d1bc-2dc5-4cca-a8cc-6d214166039b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:55:11.504425Z",
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
  "command_id": "2c7192bf-c1f5-4237-85b7-4c40ccf67920",
  "quote_id": "b865d1bc-2dc5-4cca-a8cc-6d214166039b",
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
  "id": "3c9db7a6-9538-4253-a72f-7996ad94aa73",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56109e64-1a2c-4aa8-b29a-20510af33b32",
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
  "created_at": "2026-10-27T14:50:11.542263Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3c9db7a6-9538-4253-a72f-7996ad94aa73` → **200**

```json
{
  "id": "3c9db7a6-9538-4253-a72f-7996ad94aa73",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56109e64-1a2c-4aa8-b29a-20510af33b32",
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
  "created_at": "2026-10-27T14:50:11.542263Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/3c9db7a6-9538-4253-a72f-7996ad94aa73/cancel` → **200**

```json
{
  "command_id": "c24c7f51-20d0-461e-9473-05651377a19b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "3c9db7a6-9538-4253-a72f-7996ad94aa73",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "56109e64-1a2c-4aa8-b29a-20510af33b32",
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
  "created_at": "2026-10-27T14:50:11.542263Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long"
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
  "command_id": "b09ada68-23d5-405f-a0dd-36a6567e9b85",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:11Z",
    "sequence": 1793112611669
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbca04a4-5666-41e9-8321-407f7b9504e2",
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
  "last_heartbeat_at": "2026-10-27T14:50:11.686898Z",
  "last_location_at": "2026-10-27T14:50:11.686898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12832"
}
```

```json
{
  "challenge_id": "62db9d05-2365-4017-9ffb-d0e8264f3483",
  "expires_at": "2026-10-27T14:55:11.716485703Z",
  "resend_available_at": "2026-10-27T14:50:12.716485703Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "727803",
  "sent_at": "2026-10-27T14:50:11.719095743Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62db9d05-2365-4017-9ffb-d0e8264f3483",
  "code": "727803",
  "device_ref": "sandbox-12832"
}
```

```json
{
  "session_id": "72c72993-a3e7-4aed-ab91-b8c1c8843620",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUxMSwiaWF0IjoxNzkzMTEyNjExLCJqdGkiOiJjODQ5ZjNlMC01ZGU3LTRkMTgtYmNjNS0zNmMzMDFiMmUwZTYiLCJzaWQiOiI3MmM3Mjk5My1hM2U3LTRhZWQtYWI5MS1iOGMxYzg4NDM2MjAifQ.BrRPQWy_i_RDwFwt2C8-oBpeTw3L09KaOlkFdAfifXo",
  "access_expires_at": "2026-10-27T15:05:11.848428163Z",
  "refresh_token": "XKcedxcGILTlWhbghPTMghyqTvST7c9n3Pbrq21NGfQ",
  "refresh_expires_at": "2026-11-26T14:50:11.84752163Z",
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
  "command_id": "6351f74c-3cd5-47b3-8891-aaabf455cd90",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:11Z",
    "sequence": 1793112611900
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:11.918613Z",
  "last_location_at": "2026-10-27T14:50:11.918613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f83c390d-0997-4f10-8f79-dea8d432a4bf",
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
  "id": "8e7f48d2-a334-4554-85bd-e4f71030c067",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:55:11.955062Z",
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
  "command_id": "df344fce-462a-4255-ab76-f2466789dfef",
  "quote_id": "8e7f48d2-a334-4554-85bd-e4f71030c067",
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
  "id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56109e64-1a2c-4aa8-b29a-20510af33b32",
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
  "created_at": "2026-10-27T14:50:11.990523Z",
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
    "id": "1e79e892-3ab5-4095-b771-dcacffad519d",
    "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
    "expires_at": "2026-10-27T14:50:26.994363Z",
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

`POST /api/driver/v1/offers/1e79e892-3ab5-4095-b771-dcacffad519d/accept` → **200**

```json
{
  "command_id": "3cdbf829-4fee-4bc3-873d-eda1d4ce7871"
}
```

```json
{
  "id": "56ec8cd4-0abf-430d-b6dc-2aec11ae2d79",
  "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30f967d9-8e04-4bf4-8362-4c735e8f9bb0",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30f967d9-8e04-4bf4-8362-4c735e8f9bb0",
  "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
  "assignment_id": "56ec8cd4-0abf-430d-b6dc-2aec11ae2d79",
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

`POST /api/driver/v1/trips/30f967d9-8e04-4bf4-8362-4c735e8f9bb0/cancel` → **200**

```json
{
  "command_id": "96389235-a27c-485e-aebe-3b3f5ec967cb",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "30f967d9-8e04-4bf4-8362-4c735e8f9bb0",
  "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
  "assignment_id": "56ec8cd4-0abf-430d-b6dc-2aec11ae2d79",
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

`GET /api/rider/v1/orders/b1e954dd-c216-41a8-85ff-030f9627a0a9` → **200**

```json
{
  "id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "56109e64-1a2c-4aa8-b29a-20510af33b32",
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
    "id": "56ec8cd4-0abf-430d-b6dc-2aec11ae2d79",
    "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "30f967d9-8e04-4bf4-8362-4c735e8f9bb0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T14:50:11.990523Z",
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
    "id": "ec6f0a92-2239-47c0-967b-28deb6c26da3",
    "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
    "expires_at": "2026-10-27T14:50:27.12905Z",
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

`POST /api/driver/v1/offers/ec6f0a92-2239-47c0-967b-28deb6c26da3/accept` → **200**

```json
{
  "command_id": "e9b99a1e-e55f-49f0-a73f-618c5a639310"
}
```

```json
{
  "id": "d455c7a0-7db0-4745-88d6-f2cdcd40ca64",
  "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fc8bda82-ebfc-4ae5-92ed-8ce24cda61a4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fc8bda82-ebfc-4ae5-92ed-8ce24cda61a4",
  "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
  "assignment_id": "d455c7a0-7db0-4745-88d6-f2cdcd40ca64",
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

`POST /api/driver/v1/trips/fc8bda82-ebfc-4ae5-92ed-8ce24cda61a4/cancel` → **200**

```json
{
  "command_id": "a33e0d5f-b6e0-4b95-a327-87f3fbfcae6b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "fc8bda82-ebfc-4ae5-92ed-8ce24cda61a4",
  "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
  "assignment_id": "d455c7a0-7db0-4745-88d6-f2cdcd40ca64",
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
    "id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:50:11.990523Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "3c9db7a6-9538-4253-a72f-7996ad94aa73",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:50:11.542263Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/b1e954dd-c216-41a8-85ff-030f9627a0a9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:50:11.991183Z",
      "actor": {
        "type": "CLIENT",
        "id": "56109e64-1a2c-4aa8-b29a-20510af33b32",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
        "quote_id": "8e7f48d2-a334-4554-85bd-e4f71030c067",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:50:11.993395Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
        "attempt_id": "b0c6f826-1303-40b4-a9e9-f7606897f840",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:50:11.999942Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1e79e892-3ab5-4095-b771-dcacffad519d",
        "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:50:12.058658Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1e79e892-3ab5-4095-b771-dcacffad519d",
        "order_id": "b1e954dd-c216-41a8-85ff-030f9627a0a9",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "56ec8cd4-0abf-430d-b6dc-2aec11ae2d79"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 3c9db7a6-9538-4253-a72f-7996ad94aa73, b1e954dd-c216-41a8-85ff-030f9627a0a9.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732225926",
  "device_ref": "sandbox-29632"
}
```

```json
{
  "challenge_id": "70a074c9-c658-4429-891b-c7a039021346",
  "expires_at": "2026-10-27T14:55:12.388386723Z",
  "resend_available_at": "2026-10-27T14:50:13.388386723Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732225926` → **200**

```json
{
  "phone": "+380732225926",
  "audience": "CLIENT",
  "code": "726169",
  "sent_at": "2026-10-27T14:50:12.404406159Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70a074c9-c658-4429-891b-c7a039021346",
  "code": "726169",
  "device_ref": "sandbox-29632"
}
```

```json
{
  "session_id": "7bfd57da-93dd-47a6-a7a4-0491b185d8e0",
  "subject": {
    "type": "CLIENT",
    "id": "4acdfd33-3de4-47fc-a56c-da57263882e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWNkZmQzMy0zZGU0LTQ3ZmMtYTU2Yy1kYTU3MjYzODgyZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzNTEyLCJpYXQiOjE3OTMxMTI2MTIsImp0aSI6ImExODZmODRmLWFkMGMtNGU3Zi04Y2ZiLTRjYTIxYTVkMjBmMyIsInNpZCI6IjdiZmQ1N2RhLTkzZGQtNDdhNi1hN2E0LTA0OTFiMTg1ZDhlMCJ9.x7gMix8W0S-30aEUYMINEqV97OfDaz7KZLX_seP_ETI",
  "access_expires_at": "2026-10-27T15:05:12.45820196Z",
  "refresh_token": "jLpNRrOCTAt_A00dfklb0A6XSo89DbhBnfL-kFdMxbc",
  "refresh_expires_at": "2026-11-26T14:50:12.457461362Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "11884f7c-c86a-4bd5-aafa-dc6a7ba77d4f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "34ac709f-d395-48d4-85e5-2da5a448e54d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-34ac709f-d395-48d4-85e5-2da5a448e54d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4181435c30bcd29ab31b2b08da4aeb44",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=34ac709f-d395-48d4-85e5-2da5a448e54d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732225926"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=34ac709f-d395-48d4-85e5-2da5a448e54d",
  "expires_at": "2026-10-27T15:20:12.496433Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/34ac709f-d395-48d4-85e5-2da5a448e54d` → **200**

```json
{
  "id": "34ac709f-d395-48d4-85e5-2da5a448e54d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T15:20:12.496433Z",
  "card": {
    "id": "40af6ec4-b685-4a86-baf3-8e2061e2d76f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4527",
    "card_type": "Visa",
    "created_at": "2026-10-27T14:50:12.538592Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "40af6ec4-b685-4a86-baf3-8e2061e2d76f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4527",
      "card_type": "Visa",
      "created_at": "2026-10-27T14:50:12.538592Z"
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
  "device_ref": "sandbox-6013"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "4af40409-4537-4cc5-b773-6995af722bfa",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6013"
}
```

```json
{
  "challenge_id": "6c857e00-7045-4b6b-987d-34c7b6d70872",
  "expires_at": "2026-10-27T14:55:13.645101466Z",
  "resend_available_at": "2026-10-27T14:50:14.645101466Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "262181",
  "sent_at": "2026-10-27T14:50:13.676215458Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c857e00-7045-4b6b-987d-34c7b6d70872",
  "code": "262181",
  "device_ref": "sandbox-6013"
}
```

```json
{
  "session_id": "1684992d-b0f2-4981-a353-171210761842",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUxMywiaWF0IjoxNzkzMTEyNjEzLCJqdGkiOiJjZTMxMWE2NC03ODViLTQxYjctYTk5Yi1jNTAzMjkxY2M3N2QiLCJzaWQiOiIxNjg0OTkyZC1iMGYyLTQ5ODEtYTM1My0xNzEyMTA3NjE4NDIifQ.qnZpCNQdkvZrIllTLThrsgmnSgG8vvVWwa3IonOJgDA",
  "access_expires_at": "2026-10-27T15:05:13.730325759Z",
  "refresh_token": "OwsvAQoQvaeS8ce3AQu9vzgSy9Sec9Wb32ePMtqmtes",
  "refresh_expires_at": "2026-11-26T14:50:13.729827718Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:11.918613Z",
  "last_location_at": "2026-10-27T14:50:11.918613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df3a3a0f-128c-4657-b8b9-3d7e6b7378d9/handover` → **200**

```json
{
  "command_id": "8ea30919-c77c-44be-a564-4cdb17c6ca1b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:11.918613Z",
  "last_location_at": "2026-10-27T14:50:11.918613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df3a3a0f-128c-4657-b8b9-3d7e6b7378d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:13Z",
    "sequence": 1793112613815
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:13.834769Z",
  "last_location_at": "2026-10-27T14:50:13.834769Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a5b1ea73-60dc-42e4-9eea-d900896aefa8",
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
  "id": "1ad576b3-a57c-469c-b776-91be9484c4c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T14:55:13.869719Z",
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
  "command_id": "4310d3a5-9c81-4fa0-8c6d-64317d8301a1",
  "quote_id": "1ad576b3-a57c-469c-b776-91be9484c4c7",
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
  "id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4acdfd33-3de4-47fc-a56c-da57263882e3",
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
  "created_at": "2026-10-27T14:50:13.90498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c2e5d585-f3f2-46a1-bb9c-033c7dfe985d` → **200**

```json
{
  "id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4acdfd33-3de4-47fc-a56c-da57263882e3",
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
  "created_at": "2026-10-27T14:50:13.90498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c2e5d585-f3f2-46a1-bb9c-033c7dfe985d` → **200**

```json
{
  "id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4acdfd33-3de4-47fc-a56c-da57263882e3",
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
  "created_at": "2026-10-27T14:50:13.90498Z",
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
    "id": "753f4f79-f23d-4121-97d6-ef1079a2d313",
    "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
    "expires_at": "2026-10-27T14:50:28.934712Z",
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

`POST /api/driver/v1/offers/753f4f79-f23d-4121-97d6-ef1079a2d313/accept` → **200**

```json
{
  "command_id": "14f57b64-ab60-40c3-a352-0a9a28aae278"
}
```

```json
{
  "id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
  "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "161b681a-475f-453a-a73a-ae8abdf99e64",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "161b681a-475f-453a-a73a-ae8abdf99e64",
  "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "assignment_id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
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

`POST /api/driver/v1/work-sessions/df3a3a0f-128c-4657-b8b9-3d7e6b7378d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:15Z",
    "sequence": 1793112615738
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:15.090748Z",
  "last_location_at": "2026-10-27T14:50:15.090748Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/161b681a-475f-453a-a73a-ae8abdf99e64/arrive` → **200**

```json
{
  "command_id": "db011258-3ef8-4e0c-88f3-8eefb23ff787",
  "expected_version": 0
}
```

```json
{
  "id": "161b681a-475f-453a-a73a-ae8abdf99e64",
  "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "assignment_id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
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
  "arrived_at": "2026-10-27T14:50:15.123067Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/161b681a-475f-453a-a73a-ae8abdf99e64/start` → **200**

```json
{
  "command_id": "2d874c4c-1a04-4645-acbe-7fb8747cf94f",
  "expected_version": 1
}
```

```json
{
  "id": "161b681a-475f-453a-a73a-ae8abdf99e64",
  "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "assignment_id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
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
  "arrived_at": "2026-10-27T14:50:15.123067Z",
  "started_at": "2026-10-27T14:50:15.158754Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/161b681a-475f-453a-a73a-ae8abdf99e64/complete` → **200**

```json
{
  "command_id": "136d197c-04f9-4b05-b116-489cf8068dc5",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:50:15Z"
}
```

```json
{
  "id": "161b681a-475f-453a-a73a-ae8abdf99e64",
  "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "assignment_id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
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
  "arrived_at": "2026-10-27T14:50:15.123067Z",
  "started_at": "2026-10-27T14:50:15.158754Z",
  "completed_at": "2026-10-27T14:50:15.196692Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c2e5d585-f3f2-46a1-bb9c-033c7dfe985d` → **200**

```json
{
  "id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4acdfd33-3de4-47fc-a56c-da57263882e3",
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
    "id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
    "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "161b681a-475f-453a-a73a-ae8abdf99e64",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:50:13.90498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c2e5d585-f3f2-46a1-bb9c-033c7dfe985d` → **200**

```json
{
  "id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4acdfd33-3de4-47fc-a56c-da57263882e3",
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
    "id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
    "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "161b681a-475f-453a-a73a-ae8abdf99e64",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:50:13.90498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c2e5d585-f3f2-46a1-bb9c-033c7dfe985d` → **200**

```json
{
  "id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4acdfd33-3de4-47fc-a56c-da57263882e3",
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
    "id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
    "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "161b681a-475f-453a-a73a-ae8abdf99e64",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:50:13.90498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c2e5d585-f3f2-46a1-bb9c-033c7dfe985d` → **200**

```json
{
  "id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4acdfd33-3de4-47fc-a56c-da57263882e3",
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
    "id": "7adb0890-9fd9-4e0f-a9bf-d9aa5cdf6c69",
    "order_id": "c2e5d585-f3f2-46a1-bb9c-033c7dfe985d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "161b681a-475f-453a-a73a-ae8abdf99e64",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:50:13.90498Z",
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

Done: card order c2e5d585-f3f2-46a1-bb9c-033c7dfe985d.

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
  "device_ref": "sandbox-22875"
}
```

```json
{
  "challenge_id": "d69bf69a-7ab3-44de-8912-de9287c5c590",
  "expires_at": "2026-10-27T14:55:18.39275203Z",
  "resend_available_at": "2026-10-27T14:50:19.39275203Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "924706",
  "sent_at": "2026-10-27T14:50:18.395467726Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d69bf69a-7ab3-44de-8912-de9287c5c590",
  "code": "924706",
  "device_ref": "sandbox-22875"
}
```

```json
{
  "session_id": "8104e8fc-d5b3-462f-a219-cc8978fc6a9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUxOCwiaWF0IjoxNzkzMTEyNjE4LCJqdGkiOiI2MzI2OTRjYy0yYWRkLTQwZGYtYjFhYy1kODliZDg4MmFlMjMiLCJzaWQiOiI4MTA0ZThmYy1kNWIzLTQ2MmYtYTIxOS1jYzg5NzhmYzZhOWQifQ.zf0-95NjrcHFSLVu6ypIe9wjMlK3xBJ12JmoXIjKZBM",
  "access_expires_at": "2026-10-27T15:05:18.446219283Z",
  "refresh_token": "OjDYGQzIKrT0NY1eHL864rNZ3vvS2-_DKHNDnmVtAvk",
  "refresh_expires_at": "2026-11-26T14:50:18.4456935Z",
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
  "command_id": "ffe0f7ae-67d9-4a84-b7a6-2fa7e0af03f9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:18Z",
    "sequence": 1793112618493
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:18.51002Z",
  "last_location_at": "2026-10-27T14:50:18.51002Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674967277",
  "device_ref": "sandbox-17856"
}
```

```json
{
  "challenge_id": "7c19d6a6-eb7e-49b9-90e6-9135347ad6ff",
  "expires_at": "2026-10-27T14:55:18.53959617Z",
  "resend_available_at": "2026-10-27T14:50:19.53959617Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674967277` → **200**

```json
{
  "phone": "+380674967277",
  "audience": "CLIENT",
  "code": "275374",
  "sent_at": "2026-10-27T14:50:18.542066897Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c19d6a6-eb7e-49b9-90e6-9135347ad6ff",
  "code": "275374",
  "device_ref": "sandbox-17856"
}
```

```json
{
  "session_id": "34033297-3945-45d1-ad38-ba240d34ae61",
  "subject": {
    "type": "CLIENT",
    "id": "f2b4ed3b-3c26-436e-a0ae-199b98a1c569"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMmI0ZWQzYi0zYzI2LTQzNmUtYTBhZS0xOTliOThhMWM1NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzNTE4LCJpYXQiOjE3OTMxMTI2MTgsImp0aSI6IjZkOWEyZDY0LTQxNTYtNDg0My1hNTVmLTE5Mjg4MmQ3OGMwOSIsInNpZCI6IjM0MDMzMjk3LTM5NDUtNDVkMS1hZDM4LWJhMjQwZDM0YWU2MSJ9.IWH3aIdjEYNdlCADbn6O48tZ9oZeGpmbD71F_1-FHrQ",
  "access_expires_at": "2026-10-27T15:05:18.59151634Z",
  "refresh_token": "i83F3xH9kjDsNi8eYYBB_M9ffvyhHqiM6dVXU6ldJHo",
  "refresh_expires_at": "2026-11-26T14:50:18.590987252Z",
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
  "command_id": "13dfe5eb-e7db-406e-a264-9617670076a9",
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
  "id": "b5785ee2-0bc2-4db4-83cd-0b142def95e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:55:18.650068Z",
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
  "command_id": "c1e3fecf-7072-4174-9fbc-8aa97003128a",
  "platform": "ANDROID",
  "token": "sandbox-driver-56156af3-c43e-4db3-aad3-7d14d31e2fb9"
}
```

```json
{
  "id": "6a94756e-f87a-4a53-b7d1-1f402233f35f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T14:50:18.689592Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "dd471ca8-d759-45d3-883f-d6c699d315eb",
  "platform": "ANDROID",
  "token": "sandbox-rider-ce5fcebb-bc67-435e-90a2-b2f5dd3b6438"
}
```

```json
{
  "id": "ad8701b3-ce42-4e49-81d3-c19ed345a56d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T14:50:18.725002Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2f4f72d0-7a3c-4bdb-9c73-43e6851ea3c0",
  "quote_id": "b5785ee2-0bc2-4db4-83cd-0b142def95e7",
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
  "id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f2b4ed3b-3c26-436e-a0ae-199b98a1c569",
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
  "created_at": "2026-10-27T14:50:18.761505Z",
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
    "id": "6fcf8383-c136-49bb-a75f-4d7e45108887",
    "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
    "expires_at": "2026-10-27T14:50:33.76461Z",
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

`POST /api/driver/v1/offers/6fcf8383-c136-49bb-a75f-4d7e45108887/accept` → **200**

```json
{
  "command_id": "c45aaf63-d1c3-4c3c-9f9b-4b526fe32620"
}
```

```json
{
  "id": "665c58d9-48e9-49de-b27d-6bbe7121d21c",
  "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "749c7024-856a-4f3e-9063-1b0bdcdac83e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T14:50:18.742Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T14:50:18.742Z` → **200**

```json
[
  {
    "at": "2026-10-27T14:50:19.701993125Z",
    "token_suffix": "1e2fb9",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "c474c846-165c-4416-b2e0-61b4c8eff3a2",
      "order_version": "2",
      "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674967277&after=2026-10-27T14:50:18.742Z` → **200**

```json
[
  {
    "at": "2026-10-27T14:50:19.700562187Z",
    "token_suffix": "3b6438",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "2a9369f8-59f1-4dbe-b6d4-04081751d01a",
      "order_version": "3",
      "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/35eb011d-709e-4ea6-810d-a34b92a0a3ad/messages` → **201**

```json
{
  "command_id": "2432d468-fb9d-4023-a679-0b50d42cd1d3",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "07db2436-11de-4ed9-89d8-19e65256d61a",
  "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T14:50:19.940831577Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "749c7024-856a-4f3e-9063-1b0bdcdac83e",
  "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "assignment_id": "665c58d9-48e9-49de-b27d-6bbe7121d21c",
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

`POST /api/driver/v1/trips/749c7024-856a-4f3e-9063-1b0bdcdac83e/messages` → **201**

```json
{
  "command_id": "422b45a3-dbe4-4db9-8ad9-b83fdd650f00",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a8cb0544-9004-460d-a08e-a874d72739bf",
  "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T14:50:19.991915145Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/35eb011d-709e-4ea6-810d-a34b92a0a3ad/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/749c7024-856a-4f3e-9063-1b0bdcdac83e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674967277"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:20Z",
    "sequence": 1793112620652
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:20.082762Z",
  "last_location_at": "2026-10-27T14:50:20.082762Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "749c7024-856a-4f3e-9063-1b0bdcdac83e",
  "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "assignment_id": "665c58d9-48e9-49de-b27d-6bbe7121d21c",
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

`POST /api/driver/v1/trips/749c7024-856a-4f3e-9063-1b0bdcdac83e/arrive` → **200**

```json
{
  "command_id": "d88ba84c-bf1b-40c6-9532-e28dca6685e1",
  "expected_version": 0
}
```

```json
{
  "id": "749c7024-856a-4f3e-9063-1b0bdcdac83e",
  "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "assignment_id": "665c58d9-48e9-49de-b27d-6bbe7121d21c",
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
  "arrived_at": "2026-10-27T14:50:20.132684Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/749c7024-856a-4f3e-9063-1b0bdcdac83e/start` → **200**

```json
{
  "command_id": "2a716e44-b0c6-4a44-9f73-4ae5a6cba2d3",
  "expected_version": 1
}
```

```json
{
  "id": "749c7024-856a-4f3e-9063-1b0bdcdac83e",
  "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "assignment_id": "665c58d9-48e9-49de-b27d-6bbe7121d21c",
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
  "arrived_at": "2026-10-27T14:50:20.132684Z",
  "started_at": "2026-10-27T14:50:20.163476Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:20Z",
    "sequence": 1793112620653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:20.201493Z",
  "last_location_at": "2026-10-27T14:50:20.201493Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/749c7024-856a-4f3e-9063-1b0bdcdac83e/complete` → **200**

```json
{
  "command_id": "a96f7bbc-419a-4438-be78-ba870c39e0cf",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:50:20Z",
  "cash_received": true
}
```

```json
{
  "id": "749c7024-856a-4f3e-9063-1b0bdcdac83e",
  "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "assignment_id": "665c58d9-48e9-49de-b27d-6bbe7121d21c",
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
  "arrived_at": "2026-10-27T14:50:20.132684Z",
  "started_at": "2026-10-27T14:50:20.163476Z",
  "completed_at": "2026-10-27T14:50:20.234075Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/35eb011d-709e-4ea6-810d-a34b92a0a3ad` → **200**

```json
{
  "id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f2b4ed3b-3c26-436e-a0ae-199b98a1c569",
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
    "id": "665c58d9-48e9-49de-b27d-6bbe7121d21c",
    "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "749c7024-856a-4f3e-9063-1b0bdcdac83e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:50:18.761505Z",
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
    "id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:50:18.761505Z",
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
    "id": "749c7024-856a-4f3e-9063-1b0bdcdac83e",
    "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
    "order_short_number": 5,
    "created_at": "2026-10-27T14:50:18.824542Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "78b2e616-2a50-4d4a-9289-b46c98e985ed",
    "order_id": "8a4cf28c-ae48-4b66-8894-b4835acd6cf4",
    "order_short_number": 1,
    "created_at": "2026-10-27T14:50:07.082694Z",
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
  "session_id": "f1693dc5-90fb-4c32-8fb3-62b1cedba9a9",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MjMsImlhdCI6MTc5MzExMjYyMywianRpIjoiZWUxOTQ0OWYtMTkyMi00M2E5LThmODYtMzczYWMwMGQwMzYzIiwic2lkIjoiZjE2OTNkYzUtOTBmYi00YzMyLThmYjMtNjJiMWNlZGJhOWE5In0.cd9fC9FDugeD4B7kXetztvA_-fI064OZGdx_oMvUsCg",
  "access_expires_at": "2026-10-27T15:05:23.640240746Z",
  "refresh_token": "7u9hNxNk3i2salhte8il6OBOFsp3T8tWLUgHURBmP6w",
  "refresh_expires_at": "2026-10-28T02:50:23.639685919Z",
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
  "session_id": "6188b717-7435-4890-983d-6460a7b2afb7",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MjMsImlhdCI6MTc5MzExMjYyMywianRpIjoiYWYyNjE5YTYtZTdiMC00NTI0LThjMGItMjkwMmRlYzRiYjUxIiwic2lkIjoiNjE4OGI3MTctNzQzNS00ODkwLTk4M2QtNjQ2MGE3YjJhZmI3In0.4WGOJer8oyNY67ujAFdlcpXThfMa_bjVtgxtc09vUfY",
  "access_expires_at": "2026-10-27T15:05:23.928429733Z",
  "refresh_token": "VT10QNTOp9a6WQhdr0wizX6XAMEhw7_D313Si6hUPyo",
  "refresh_expires_at": "2026-10-28T02:50:23.927915117Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/35eb011d-709e-4ea6-810d-a34b92a0a3ad/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:50:18.762082Z",
      "actor": {
        "type": "CLIENT",
        "id": "f2b4ed3b-3c26-436e-a0ae-199b98a1c569",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
        "quote_id": "b5785ee2-0bc2-4db4-83cd-0b142def95e7",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:50:18.763773Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
        "attempt_id": "1e931110-973a-4330-963d-83b2bdbc968f",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:50:18.768785Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6fcf8383-c136-49bb-a75f-4d7e45108887",
        "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:50:18.826329Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6fcf8383-c136-49bb-a75f-4d7e45108887",
        "order_id": "35eb011d-709e-4ea6-810d-a34b92a0a3ad",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "665c58d9-48e9-49de-b27d-6bbe7121d21c"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 35eb011d-709e-4ea6-810d-a34b92a0a3ad.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6137"
}
```

```json
{
  "challenge_id": "bb201665-5448-466f-894e-503181420047",
  "expires_at": "2026-10-27T14:55:23.988707959Z",
  "resend_available_at": "2026-10-27T14:50:24.988707959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "866838",
  "sent_at": "2026-10-27T14:50:23.99106208Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb201665-5448-466f-894e-503181420047",
  "code": "866838",
  "device_ref": "sandbox-6137"
}
```

```json
{
  "session_id": "45dd705b-8935-4730-b2a5-6d6a2b68dc3a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUyNCwiaWF0IjoxNzkzMTEyNjI0LCJqdGkiOiJhMWU3MDViNy03NjM0LTQ3MmYtYmJiZS1iODBlNGNmYjY5MTEiLCJzaWQiOiI0NWRkNzA1Yi04OTM1LTQ3MzAtYjJhNS02ZDZhMmI2OGRjM2EifQ.h7S3Ds3S1M7U04tK5LVK0aNz62X--c0kNMlSsrJCry8",
  "access_expires_at": "2026-10-27T15:05:24.040725706Z",
  "refresh_token": "I_8k1dnZmlOEL_VXu-TuF6ckYRUoHrsDmNyQ8ctDEFA",
  "refresh_expires_at": "2026-11-26T14:50:24.040185787Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:20.201493Z",
  "last_location_at": "2026-10-27T14:50:20.201493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/handover` → **200**

```json
{
  "command_id": "b686d7f5-3fb6-4591-9b55-7dbdf0ff2c62",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:20.201493Z",
  "last_location_at": "2026-10-27T14:50:20.201493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:24Z",
    "sequence": 1793112624117
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:24.135904Z",
  "last_location_at": "2026-10-27T14:50:24.135904Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666367336",
  "device_ref": "sandbox-30080"
}
```

```json
{
  "challenge_id": "d0f593ea-7ffd-4a82-a22a-e577daf7e792",
  "expires_at": "2026-10-27T14:55:24.159159606Z",
  "resend_available_at": "2026-10-27T14:50:25.159159606Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666367336` → **200**

```json
{
  "phone": "+380666367336",
  "audience": "CLIENT",
  "code": "253885",
  "sent_at": "2026-10-27T14:50:24.161316509Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0f593ea-7ffd-4a82-a22a-e577daf7e792",
  "code": "253885",
  "device_ref": "sandbox-30080"
}
```

```json
{
  "session_id": "ecdaa80c-f814-49d6-b817-0ed0bc1ad217",
  "subject": {
    "type": "CLIENT",
    "id": "0c1f28c8-5371-4250-a1b9-6cea8cad12ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzFmMjhjOC01MzcxLTQyNTAtYTFiOS02Y2VhOGNhZDEyY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzNTI0LCJpYXQiOjE3OTMxMTI2MjQsImp0aSI6IjZmNWU2YTMyLWE5NjItNGY1ZC04OTIyLTdjMmM0YmYzZDliYyIsInNpZCI6ImVjZGFhODBjLWY4MTQtNDlkNi1iODE3LTBlZDBiYzFhZDIxNyJ9.blOssQaae9pTMLKlWa09wuTFfWmOMItdMTTWcWzfTAs",
  "access_expires_at": "2026-10-27T15:05:24.212957728Z",
  "refresh_token": "Oik2-i_C4XqnOZmY9pzGQd7tCp88keyrSPPKHit0Cxk",
  "refresh_expires_at": "2026-11-26T14:50:24.212524495Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b19ee504-e52d-4cef-addb-438358c3a47c",
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
  "id": "5ea36516-6b1c-47c3-9cf4-f0b338d86147",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T14:55:24.244158Z",
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
  "command_id": "57821fd1-8af3-41d7-97ae-f10adcbb5c60",
  "quote_id": "5ea36516-6b1c-47c3-9cf4-f0b338d86147",
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
  "id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c1f28c8-5371-4250-a1b9-6cea8cad12ca",
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
  "created_at": "2026-10-27T14:50:24.277262Z",
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
    "id": "a10c1b20-f23b-4ae7-a006-31d3d514fd4a",
    "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
    "expires_at": "2026-10-27T14:50:39.279741Z",
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

`POST /api/driver/v1/offers/a10c1b20-f23b-4ae7-a006-31d3d514fd4a/accept` → **200**

```json
{
  "command_id": "e9e91ea1-8fd7-4e53-ae42-136faff4459b"
}
```

```json
{
  "id": "50a77261-6519-4d3d-8aa3-ee965fb574f6",
  "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c2365983-af47-4973-8a78-686547270e80",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c2365983-af47-4973-8a78-686547270e80",
  "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
  "assignment_id": "50a77261-6519-4d3d-8aa3-ee965fb574f6",
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

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:24Z",
    "sequence": 1793112624376
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:24.393212Z",
  "last_location_at": "2026-10-27T14:50:24.393212Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c2365983-af47-4973-8a78-686547270e80/arrive` → **200**

```json
{
  "command_id": "ef07b23c-012e-4093-85d8-b2b63a0cd35d",
  "expected_version": 0
}
```

```json
{
  "id": "c2365983-af47-4973-8a78-686547270e80",
  "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
  "assignment_id": "50a77261-6519-4d3d-8aa3-ee965fb574f6",
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
  "arrived_at": "2026-10-27T14:50:24.425756Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/c2365983-af47-4973-8a78-686547270e80/start` → **200**

```json
{
  "command_id": "00139498-568f-4f8c-a88c-42d12c35ccb5",
  "expected_version": 1
}
```

```json
{
  "id": "c2365983-af47-4973-8a78-686547270e80",
  "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
  "assignment_id": "50a77261-6519-4d3d-8aa3-ee965fb574f6",
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
  "arrived_at": "2026-10-27T14:50:24.425756Z",
  "started_at": "2026-10-27T14:50:24.461077Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:24Z",
    "sequence": 1793112624484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:24.500953Z",
  "last_location_at": "2026-10-27T14:50:24.500953Z",
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
  "device_ref": "sandbox-25429"
}
```

```json
{
  "challenge_id": "37d123fd-d8ea-461f-a045-8d125f079183",
  "expires_at": "2026-10-27T14:55:24.522836089Z",
  "resend_available_at": "2026-10-27T14:50:25.522836089Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "276382",
  "sent_at": "2026-10-27T14:50:24.524809845Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37d123fd-d8ea-461f-a045-8d125f079183",
  "code": "276382",
  "device_ref": "sandbox-25429"
}
```

```json
{
  "session_id": "869f34c2-11a2-4a96-8ed0-5144f4cb0bfd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUyNCwiaWF0IjoxNzkzMTEyNjI0LCJqdGkiOiJhNTYyNjBiZS0yOGQxLTQ3MDctYWIwMy04MWRhNzhhMDE2NmYiLCJzaWQiOiI4NjlmMzRjMi0xMWEyLTRhOTYtOGVkMC01MTQ0ZjRjYjBiZmQifQ.DaQy4JK6hWkVS_2sSvXym8LFyqPTL0CnnbNU9wnw7Ts",
  "access_expires_at": "2026-10-27T15:05:24.574884362Z",
  "refresh_token": "QNz1URE5QhAeqmWNAHmNHq_0qwxugVqxME7vdpNiqpU",
  "refresh_expires_at": "2026-11-26T14:50:24.574457518Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbca04a4-5666-41e9-8321-407f7b9504e2",
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
  "last_heartbeat_at": "2026-10-27T14:50:11.686898Z",
  "last_location_at": "2026-10-27T14:50:11.686898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dbca04a4-5666-41e9-8321-407f7b9504e2/handover` → **200**

```json
{
  "command_id": "f9a09b6b-b9f1-4db0-8b3c-6fdd45527987",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbca04a4-5666-41e9-8321-407f7b9504e2",
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
  "last_heartbeat_at": "2026-10-27T14:50:11.686898Z",
  "last_location_at": "2026-10-27T14:50:11.686898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dbca04a4-5666-41e9-8321-407f7b9504e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:24Z",
    "sequence": 1793112624652
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbca04a4-5666-41e9-8321-407f7b9504e2",
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
  "last_heartbeat_at": "2026-10-27T14:50:24.668985Z",
  "last_location_at": "2026-10-27T14:50:24.668985Z",
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
  "session_id": "49939ea0-92c9-4503-b2b5-b7f34c70e0f9",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MjQsImlhdCI6MTc5MzExMjYyNCwianRpIjoiYWU2NzBjYmUtNDJiYy00Y2I2LTkzNmQtZGI2NWVlYjFmNDUxIiwic2lkIjoiNDk5MzllYTAtOTJjOS00NTAzLWIyYjUtYjdmMzRjNzBlMGY5In0._3xjxkgc2p-Vjm5Ni-bUAfaVbs-grs7o5GdeuxrqPSU",
  "access_expires_at": "2026-10-27T15:05:24.95416577Z",
  "refresh_token": "ka92vKsh1_0mILc3hydGZdbM_KW_z15bswgVGXJ7ArY",
  "refresh_expires_at": "2026-10-28T02:50:24.95373481Z",
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
  "session_id": "61cc09f4-8ca7-476b-9620-c47ad697e778",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MjUsImlhdCI6MTc5MzExMjYyNSwianRpIjoiMjhjYTE4MzEtNTQ2My00N2M1LWJkOTYtM2NlYWZmNTM0OTUxIiwic2lkIjoiNjFjYzA5ZjQtOGNhNy00NzZiLTk2MjAtYzQ3YWQ2OTdlNzc4In0.SUrlubLVL5YRIzhixcw-x_1K4Ih1i3HupH9EMte3VDk",
  "access_expires_at": "2026-10-27T15:05:25.334387388Z",
  "refresh_token": "_Z6nGBVKUeswZyOUxUuF0psf5Z-bA5J3nQIl2DEqXiM",
  "refresh_expires_at": "2026-10-28T02:50:25.333951861Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3701330e-98a8-41b2-bed1-bb5906eb2787` → **200**

```json
{
  "id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0c1f28c8-5371-4250-a1b9-6cea8cad12ca",
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
    "id": "50a77261-6519-4d3d-8aa3-ee965fb574f6",
    "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c2365983-af47-4973-8a78-686547270e80",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T14:50:24.277262Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3701330e-98a8-41b2-bed1-bb5906eb2787/interrupt` → **200**

```json
{
  "command_id": "2c7a0b77-8fe9-4332-a845-56140905cb18",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "0c1f28c8-5371-4250-a1b9-6cea8cad12ca",
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
      "id": "50a77261-6519-4d3d-8aa3-ee965fb574f6",
      "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "c2365983-af47-4973-8a78-686547270e80",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T14:50:24.277262Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "22f69a4a-b856-40d2-8b1c-70171b5e0b85",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "0c1f28c8-5371-4250-a1b9-6cea8cad12ca",
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
    "id": "87bacf0c-6776-4345-bb5b-4fc2654fc821",
    "order_id": "22f69a4a-b856-40d2-8b1c-70171b5e0b85",
    "expires_at": "2026-10-27T14:50:40.41113Z",
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

`POST /api/driver/v1/offers/87bacf0c-6776-4345-bb5b-4fc2654fc821/accept` → **200**

```json
{
  "command_id": "bf45f071-3aef-4dc3-b512-c378a7bf43f4"
}
```

```json
{
  "id": "780aa951-2330-4861-a21c-818c02185f53",
  "order_id": "22f69a4a-b856-40d2-8b1c-70171b5e0b85",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bb1dbbde-36dd-4706-8b68-3a22fb69503e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bb1dbbde-36dd-4706-8b68-3a22fb69503e",
  "order_id": "22f69a4a-b856-40d2-8b1c-70171b5e0b85",
  "assignment_id": "780aa951-2330-4861-a21c-818c02185f53",
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
  "session_id": "dbca04a4-5666-41e9-8321-407f7b9504e2",
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
  "last_heartbeat_at": "2026-10-27T14:50:24.668985Z",
  "last_location_at": "2026-10-27T14:50:24.668985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/dbca04a4-5666-41e9-8321-407f7b9504e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:25Z",
    "sequence": 1793112625530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbca04a4-5666-41e9-8321-407f7b9504e2",
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
  "last_heartbeat_at": "2026-10-27T14:50:25.547431Z",
  "last_location_at": "2026-10-27T14:50:25.547431Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bb1dbbde-36dd-4706-8b68-3a22fb69503e/arrive` → **200**

```json
{
  "command_id": "2c29feb1-7dde-433a-8ecc-b0f317a106db",
  "expected_version": 0
}
```

```json
{
  "id": "bb1dbbde-36dd-4706-8b68-3a22fb69503e",
  "order_id": "22f69a4a-b856-40d2-8b1c-70171b5e0b85",
  "assignment_id": "780aa951-2330-4861-a21c-818c02185f53",
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
  "arrived_at": "2026-10-27T14:50:25.579758Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/bb1dbbde-36dd-4706-8b68-3a22fb69503e/start` → **200**

```json
{
  "command_id": "7faecc35-4617-448a-b69b-a1111faa3bcc",
  "expected_version": 1
}
```

```json
{
  "id": "bb1dbbde-36dd-4706-8b68-3a22fb69503e",
  "order_id": "22f69a4a-b856-40d2-8b1c-70171b5e0b85",
  "assignment_id": "780aa951-2330-4861-a21c-818c02185f53",
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
  "arrived_at": "2026-10-27T14:50:25.579758Z",
  "started_at": "2026-10-27T14:50:25.615471Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/bb1dbbde-36dd-4706-8b68-3a22fb69503e/complete` → **200**

```json
{
  "command_id": "ba0dc425-5b12-444b-b74c-18fa8b251bab",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:50:25Z"
}
```

```json
{
  "id": "bb1dbbde-36dd-4706-8b68-3a22fb69503e",
  "order_id": "22f69a4a-b856-40d2-8b1c-70171b5e0b85",
  "assignment_id": "780aa951-2330-4861-a21c-818c02185f53",
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
  "arrived_at": "2026-10-27T14:50:25.579758Z",
  "started_at": "2026-10-27T14:50:25.615471Z",
  "completed_at": "2026-10-27T14:50:25.655053Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "22f69a4a-b856-40d2-8b1c-70171b5e0b85",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:50:25.40232Z",
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
    "id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:50:24.277262Z",
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
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
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
      "balance_minor": 11113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/3701330e-98a8-41b2-bed1-bb5906eb2787/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:50:24.277704Z",
      "actor": {
        "type": "CLIENT",
        "id": "0c1f28c8-5371-4250-a1b9-6cea8cad12ca",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
        "quote_id": "5ea36516-6b1c-47c3-9cf4-f0b338d86147",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:50:24.279144Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
        "attempt_id": "e0a8c442-8bc7-4e01-8847-d9abf67feb7c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:50:24.28354Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a10c1b20-f23b-4ae7-a006-31d3d514fd4a",
        "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:50:24.337343Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a10c1b20-f23b-4ae7-a006-31d3d514fd4a",
        "order_id": "3701330e-98a8-41b2-bed1-bb5906eb2787",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "50a77261-6519-4d3d-8aa3-ee965fb574f6"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 3701330e-98a8-41b2-bed1-bb5906eb2787, follow-up 22f69a4a-b856-40d2-8b1c-70171b5e0b85.

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
  "session_id": "1e97f7f5-dacf-40cc-9575-fc19ddf349b7",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MjksImlhdCI6MTc5MzExMjYyOSwianRpIjoiMGFmMWRjZGYtYjBhOC00ZWIwLWJhYTEtNTYzZjQ0MjVjOWI3Iiwic2lkIjoiMWU5N2Y3ZjUtZGFjZi00MGNjLTk1NzUtZmMxOWRkZjM0OWI3In0.UFC2cpT6qfQcMbDig3Wq33Vq_dkU36f2EgcW60B-Qz8",
  "access_expires_at": "2026-10-27T15:05:29.027418298Z",
  "refresh_token": "TgG-bS4hPaobNPCFXtxWtQWnBRPIpdqJm6O2vF0PH94",
  "refresh_expires_at": "2026-10-28T02:50:29.026908029Z",
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
  "session_id": "1e37b9e2-c4ff-40d5-ab28-ded7b172b764",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MjksImlhdCI6MTc5MzExMjYyOSwianRpIjoiNDFmOWIxM2YtZGZmMi00ZjA1LWI1MTgtN2U2ZWMxMGRjNDVlIiwic2lkIjoiMWUzN2I5ZTItYzRmZi00MGQ1LWFiMjgtZGVkN2IxNzJiNzY0In0.7lb2oEEwljrqGEiYFfdxVlsLsjf9DSVsh8dpbDA79uw",
  "access_expires_at": "2026-10-27T15:05:29.425380112Z",
  "refresh_token": "0cHWfLd4B35RgmEmjrJCiTQlXlTgZfL9IPq_-cCKpDA",
  "refresh_expires_at": "2026-10-28T02:50:29.424872036Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15418"
}
```

```json
{
  "challenge_id": "a3933bac-c9b5-4255-b6f8-a0d26e283fdf",
  "expires_at": "2026-10-27T14:55:29.447163668Z",
  "resend_available_at": "2026-10-27T14:50:30.447163668Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "036359",
  "sent_at": "2026-10-27T14:50:29.449079087Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3933bac-c9b5-4255-b6f8-a0d26e283fdf",
  "code": "036359",
  "device_ref": "sandbox-15418"
}
```

```json
{
  "session_id": "8c06d955-db1d-45ab-b9ca-40db87510cde",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUyOSwiaWF0IjoxNzkzMTEyNjI5LCJqdGkiOiJlMTVkZWQxNS02MTgxLTQ3NjQtYTBhZC1lODA3N2RkMjk4MjgiLCJzaWQiOiI4YzA2ZDk1NS1kYjFkLTQ1YWItYjljYS00MGRiODc1MTBjZGUifQ.TsBW0ul8xDUaxyi06DuBswXc_WOUHnEHzzRab12U_uI",
  "access_expires_at": "2026-10-27T15:05:29.501108441Z",
  "refresh_token": "Mhc-UjIMd9cuIzagDL4I8t68cHwBA7oQRjzB5sicPCc",
  "refresh_expires_at": "2026-11-26T14:50:29.500662138Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:24.500953Z",
  "last_location_at": "2026-10-27T14:50:24.500953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/handover` → **200**

```json
{
  "command_id": "ce125c61-22dd-44f4-84ee-0c992b4fb2b5",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:24.500953Z",
  "last_location_at": "2026-10-27T14:50:24.500953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:29Z",
    "sequence": 1793112629735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:29.752511Z",
  "last_location_at": "2026-10-27T14:50:29.752511Z",
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
  "command_id": "c50154d5-c80a-4f4f-b3b9-fb4cecb504b4",
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
  "effective_at": "2026-10-27T14:50:29.99046Z",
  "changed_by": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T14:50:30.018552898Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7e2014f4-5799-45d4-8173-0a491a535e17",
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
  "id": "babf35cd-e023-407a-b151-6c1ceaaf2e84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:55:30.056527Z",
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
  "command_id": "696720fc-ac9d-4238-bc1b-49aa93886d4a",
  "quote_id": "babf35cd-e023-407a-b151-6c1ceaaf2e84",
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
    "phone": "+3806711122260"
  }
}
```

```json
{
  "id": "0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7",
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
  "created_at": "2026-10-27T14:50:30.100872Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122260"
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
    "id": "21602753-fb4d-4800-9116-b54927f5f9db",
    "order_id": "0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7",
    "expires_at": "2026-10-27T14:50:45.104751Z",
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

`POST /api/driver/v1/offers/21602753-fb4d-4800-9116-b54927f5f9db/accept` → **200**

```json
{
  "command_id": "129ffb66-b0b5-4598-a1b5-c0f8a3aa2cf6"
}
```

```json
{
  "id": "31fa224b-6854-44de-b47c-a364bb143ac5",
  "order_id": "0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2c939425-c411-4326-ac59-5785aa9be9ba",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2c939425-c411-4326-ac59-5785aa9be9ba",
  "order_id": "0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7",
  "assignment_id": "31fa224b-6854-44de-b47c-a364bb143ac5",
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

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:30Z",
    "sequence": 1793112630205
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:30.222638Z",
  "last_location_at": "2026-10-27T14:50:30.222638Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2c939425-c411-4326-ac59-5785aa9be9ba/arrive` → **200**

```json
{
  "command_id": "ecc05fef-b508-4122-932f-f89b4bb16b0e",
  "expected_version": 0
}
```

```json
{
  "id": "2c939425-c411-4326-ac59-5785aa9be9ba",
  "order_id": "0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7",
  "assignment_id": "31fa224b-6854-44de-b47c-a364bb143ac5",
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
  "arrived_at": "2026-10-27T14:50:30.25701Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/2c939425-c411-4326-ac59-5785aa9be9ba/start` → **200**

```json
{
  "command_id": "b7f92917-9407-47ad-8788-f6db804eff3f",
  "expected_version": 1
}
```

```json
{
  "id": "2c939425-c411-4326-ac59-5785aa9be9ba",
  "order_id": "0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7",
  "assignment_id": "31fa224b-6854-44de-b47c-a364bb143ac5",
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
  "arrived_at": "2026-10-27T14:50:30.25701Z",
  "started_at": "2026-10-27T14:50:30.294775Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/2c939425-c411-4326-ac59-5785aa9be9ba/complete` → **200**

```json
{
  "command_id": "f76e0f12-ad99-4370-9146-56eadb85e320",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:50:30Z",
  "cash_received": true
}
```

```json
{
  "id": "2c939425-c411-4326-ac59-5785aa9be9ba",
  "order_id": "0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7",
  "assignment_id": "31fa224b-6854-44de-b47c-a364bb143ac5",
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
  "arrived_at": "2026-10-27T14:50:30.25701Z",
  "started_at": "2026-10-27T14:50:30.294775Z",
  "completed_at": "2026-10-27T14:50:30.335349Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9edbf9c8-1a3b-47dc-9b52-e759b6d7dd6d",
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
  "id": "f5e54063-1024-46e4-b20a-9f0d1a227887",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:55:30.445995Z",
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
  "command_id": "16d94430-3bd1-4b31-b132-d0d895ae5b1a",
  "quote_id": "f5e54063-1024-46e4-b20a-9f0d1a227887",
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
    "phone": "+3806711111319"
  }
}
```

```json
{
  "id": "e02f169e-21b4-43cd-8b22-9b1cccd0f6c3",
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
  "created_at": "2026-10-27T14:50:30.480368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111319"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e02f169e-21b4-43cd-8b22-9b1cccd0f6c3` → **200**

```json
{
  "id": "e02f169e-21b4-43cd-8b22-9b1cccd0f6c3",
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
  "created_at": "2026-10-27T14:50:30.480368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111319"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e02f169e-21b4-43cd-8b22-9b1cccd0f6c3/cancel` → **200**

```json
{
  "command_id": "571e3b62-a0bb-4e07-bcbd-fbe56cb1bc89",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "e02f169e-21b4-43cd-8b22-9b1cccd0f6c3",
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
  "created_at": "2026-10-27T14:50:30.480368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111319"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error"
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
  "staff_id": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T14:50:30.342914Z",
  "last_entries": [
    {
      "order_id": "e02f169e-21b4-43cd-8b22-9b1cccd0f6c3",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T14:50:30.553038Z"
    },
    {
      "order_id": "0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T14:50:30.342914Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fcb8fe30-010d-4819-a759-9e3d30251877",
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
  "last_heartbeat_at": "2026-10-27T14:50:30.222638Z",
  "last_location_at": "2026-10-27T14:50:30.222638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fcb8fe30-010d-4819-a759-9e3d30251877/close` → **200**

```json
{
  "command_id": "7e7602be-02c0-4ff3-9e87-baffa3c141a8",
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

Done: operator bonus for fulfilled 0ca223d6-1d01-41d1-aa85-9dbd2e9c8ac7 and operator-fault cancellation e02f169e-21b4-43cd-8b22-9b1cccd0f6c3.

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
  "session_id": "55784393-941b-462a-875b-fff092201a63",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MzIsImlhdCI6MTc5MzExMjYzMiwianRpIjoiYzY0NGY5OTEtNDI5NC00NTYxLThmMTktYTJhNGZiOTAxMDU3Iiwic2lkIjoiNTU3ODQzOTMtOTQxYi00NjJhLTg3NWItZmZmMDkyMjAxYTYzIn0.nhYGW9OPkaZhxa29nrjHB4GOF4aZ2tEHWAHcbQg2x94",
  "access_expires_at": "2026-10-27T15:05:32.963437245Z",
  "refresh_token": "qBM4s9l7_hRgYPS-u9e984dZPFlHo3980iyV3_8p-Pw",
  "refresh_expires_at": "2026-10-28T02:50:32.96301649Z",
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
  "command_id": "ae6f7a7d-67d3-4b07-bc08-fb412fc017de",
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
  "changed_by": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T14:50:33.025148685Z"
}
```

## The rider books the airport for 2026-10-27T17:50:32Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600577030",
  "device_ref": "sandbox-13114"
}
```

```json
{
  "challenge_id": "40bca5fe-c1eb-4da4-8232-7b440b300dad",
  "expires_at": "2026-10-27T14:55:33.054493286Z",
  "resend_available_at": "2026-10-27T14:50:34.054493286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600577030` → **200**

```json
{
  "phone": "+48600577030",
  "audience": "CLIENT",
  "code": "530545",
  "sent_at": "2026-10-27T14:50:33.056524038Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40bca5fe-c1eb-4da4-8232-7b440b300dad",
  "code": "530545",
  "device_ref": "sandbox-13114"
}
```

```json
{
  "session_id": "b2e8d044-1606-4ca3-ac0b-3ed109e2812d",
  "subject": {
    "type": "CLIENT",
    "id": "bd38ed35-e0bb-4e50-a0bb-3e02a0ad6519"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDM4ZWQzNS1lMGJiLTRlNTAtYTBiYi0zZTAyYTBhZDY1MTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzNTMzLCJpYXQiOjE3OTMxMTI2MzMsImp0aSI6IjI2ZjUyNTI0LTdlYzktNDQ1Ni05N2ZmLTUzOGQyZTA0MDRiZSIsInNpZCI6ImIyZThkMDQ0LTE2MDYtNGNhMy1hYzBiLTNlZDEwOWUyODEyZCJ9.sl0a25T7tJ8rGRN9m2ISCnLrGYb1ESo0LHcMBuNgOOU",
  "access_expires_at": "2026-10-27T15:05:33.104696208Z",
  "refresh_token": "USXc6luTqTVoVsv7M-HdqIoqG86uQP0m7UmOtRpocYg",
  "refresh_expires_at": "2026-11-26T14:50:33.104189633Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ca193182-7680-4242-b5b9-ef38f03be72e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T17:50:32Z"
}
```

```json
{
  "id": "dc5144e3-1aca-4a2b-8e56-9e1ee99712c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T14:55:33.136224Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T17:50:32Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f5ae2e37-d65a-4fad-a3e1-8744904316b5",
  "quote_id": "dc5144e3-1aca-4a2b-8e56-9e1ee99712c4",
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
  "pickup_at": "2026-10-27T17:50:32Z"
}
```

```json
{
  "id": "4bd1f647-32ce-49ea-acd1-64adfb4fc6e2",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bd38ed35-e0bb-4e50-a0bb-3e02a0ad6519",
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
  "created_at": "2026-10-27T14:50:33.169781Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T17:50:32Z",
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
  "device_ref": "sandbox-7909"
}
```

```json
{
  "challenge_id": "f170376b-06ab-4883-a1ea-0d69f950d4ed",
  "expires_at": "2026-10-27T14:55:33.199491798Z",
  "resend_available_at": "2026-10-27T14:50:34.199491798Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "330421",
  "sent_at": "2026-10-27T14:50:33.201133004Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f170376b-06ab-4883-a1ea-0d69f950d4ed",
  "code": "330421",
  "device_ref": "sandbox-7909"
}
```

```json
{
  "session_id": "6d3aa88c-f375-48b7-9b9f-b458a8e58eec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUzMywiaWF0IjoxNzkzMTEyNjMzLCJqdGkiOiI1OTIxZmJkMC1mNDkyLTRiYjItOTFiOS1jYTNjODFhZjBmOWIiLCJzaWQiOiI2ZDNhYTg4Yy1mMzc1LTQ4YjctOWI5Zi1iNDU4YThlNThlZWMifQ.WwDa58URuZhwi8udx1kQATbruHZ-c49BEq8Wrsu0i5Y",
  "access_expires_at": "2026-10-27T15:05:33.247795962Z",
  "refresh_token": "8avm98XLM0jTUpH_inLLO6D6WuBSo2uFWVVSNc0dxvc",
  "refresh_expires_at": "2026-11-26T14:50:33.247398111Z",
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
  "command_id": "1dc7fe81-ee2f-483d-a6d0-b9aff7364da1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:33Z",
    "sequence": 1793112633290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be26d963-40b7-4e0a-b131-8127d0a3c576",
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
  "last_heartbeat_at": "2026-10-27T14:50:33.305706Z",
  "last_location_at": "2026-10-27T14:50:33.305706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "4bd1f647-32ce-49ea-acd1-64adfb4fc6e2",
      "short_number": 10,
      "pickup_at": "2026-10-27T17:50:32Z",
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

`POST /api/driver/v1/preorders/4bd1f647-32ce-49ea-acd1-64adfb4fc6e2/reserve` → **200**

```json
{
  "command_id": "ccb70618-8480-4711-8ab0-5e5938eef483"
}
```

```json
{
  "id": "a584e0e4-dabd-4081-ae13-ece2d3d1cfd6",
  "state": "RESERVED",
  "order": {
    "order_id": "4bd1f647-32ce-49ea-acd1-64adfb4fc6e2",
    "short_number": 10,
    "pickup_at": "2026-10-27T17:50:32Z",
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
  "reserved_at": "2026-10-27T14:50:33.361386Z",
  "confirm_from": "2026-10-27T17:20:32Z",
  "confirm_until": "2026-10-27T17:30:32Z",
  "drop_until": "2026-10-27T16:50:32Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "a584e0e4-dabd-4081-ae13-ece2d3d1cfd6",
      "state": "RESERVED",
      "order": {
        "order_id": "4bd1f647-32ce-49ea-acd1-64adfb4fc6e2",
        "short_number": 10,
        "pickup_at": "2026-10-27T17:50:32Z",
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
      "reserved_at": "2026-10-27T14:50:33.361386Z",
      "confirm_from": "2026-10-27T17:20:32Z",
      "confirm_until": "2026-10-27T17:30:32Z",
      "drop_until": "2026-10-27T16:50:32Z"
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
      "id": "a584e0e4-dabd-4081-ae13-ece2d3d1cfd6",
      "state": "RESERVED",
      "order": {
        "order_id": "4bd1f647-32ce-49ea-acd1-64adfb4fc6e2",
        "short_number": 10,
        "pickup_at": "2026-10-27T17:50:32Z",
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
      "reserved_at": "2026-10-27T14:50:33.361386Z",
      "confirm_from": "2026-10-27T17:20:32Z",
      "confirm_until": "2026-10-27T17:30:32Z",
      "drop_until": "2026-10-27T16:50:32Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/a584e0e4-dabd-4081-ae13-ece2d3d1cfd6/confirm` → **409**

```json
{
  "command_id": "67926def-b825-4f8a-a6a0-f213e096db77"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/a584e0e4-dabd-4081-ae13-ece2d3d1cfd6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0bd23e9b-0cbc-4792-bfe5-35f3d9394426"
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
  "session_id": "023e8566-aedc-415c-a662-b4c870eec343",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MzMsImlhdCI6MTc5MzExMjYzMywianRpIjoiMDE0MDk3YzktMWM5OS00ODY3LWIxNDAtMDM5OGVkYWQ2MWRkIiwic2lkIjoiMDIzZTg1NjYtYWVkYy00MTVjLWE2NjItYjRjODcwZWVjMzQzIn0.iXg_EnCjkLljH7VtjmlELkQS1Eum6BXC1sQ0LYRnuUw",
  "access_expires_at": "2026-10-27T15:05:33.716711407Z",
  "refresh_token": "-G5u0cSVMhvFvFY3qIcY8UagGo3BDp4iIEwL6qSbeK8",
  "refresh_expires_at": "2026-10-28T02:50:33.71626528Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4bd1f647-32ce-49ea-acd1-64adfb4fc6e2` → **200**

```json
{
  "id": "4bd1f647-32ce-49ea-acd1-64adfb4fc6e2",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "bd38ed35-e0bb-4e50-a0bb-3e02a0ad6519",
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
  "created_at": "2026-10-27T14:50:33.169781Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T17:50:32Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "a584e0e4-dabd-4081-ae13-ece2d3d1cfd6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T14:50:33.361386Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4bd1f647-32ce-49ea-acd1-64adfb4fc6e2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T14:50:33.170993Z",
      "actor": {
        "type": "CLIENT",
        "id": "bd38ed35-e0bb-4e50-a0bb-3e02a0ad6519",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "4bd1f647-32ce-49ea-acd1-64adfb4fc6e2",
        "preorder": true,
        "quote_id": "dc5144e3-1aca-4a2b-8e56-9e1ee99712c4",
        "pickup_at": "2026-10-27T17:50:32Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T14:50:33.362273Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4bd1f647-32ce-49ea-acd1-64adfb4fc6e2",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "a584e0e4-dabd-4081-ae13-ece2d3d1cfd6"
      }
    }
  ]
}
```

Done: pre-order 4bd1f647-32ce-49ea-acd1-64adfb4fc6e2, reservation a584e0e4-dabd-4081-ae13-ece2d3d1cfd6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1164"
}
```

```json
{
  "challenge_id": "9866ac88-f349-4584-b9a1-4c34d4d52aa0",
  "expires_at": "2026-10-27T14:55:33.800487147Z",
  "resend_available_at": "2026-10-27T14:50:34.800487147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "361706",
  "sent_at": "2026-10-27T14:50:33.802239881Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9866ac88-f349-4584-b9a1-4c34d4d52aa0",
  "code": "361706",
  "device_ref": "sandbox-1164"
}
```

```json
{
  "session_id": "0cf6cc8a-204b-4227-bd6a-7f7b60384509",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUzMywiaWF0IjoxNzkzMTEyNjMzLCJqdGkiOiJiMzEzZmIyYi1jNWFlLTQ3M2QtYTBiOS0yYjEyYTVjMjIzYmMiLCJzaWQiOiIwY2Y2Y2M4YS0yMDRiLTQyMjctYmQ2YS03ZjdiNjAzODQ1MDkifQ.BHzlkSjoY3VgdOeaaTGtq1mxjQcpFo-uVEm26nzPaR8",
  "access_expires_at": "2026-10-27T15:05:33.851319708Z",
  "refresh_token": "PRrzFmqi1yJMvDccBtpkDHx0U8E8MmQ9ugwPr6E0fiU",
  "refresh_expires_at": "2026-11-26T14:50:33.850885323Z",
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
  "command_id": "2f1c438c-acf7-4827-8f7d-ffdb8f88cfd5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:33Z",
    "sequence": 1793112633897
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b6f66e-ce4b-4870-9f2f-aabca7146d41",
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
  "last_heartbeat_at": "2026-10-27T14:50:33.912776Z",
  "last_location_at": "2026-10-27T14:50:33.912776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673427313",
  "device_ref": "sandbox-21090"
}
```

```json
{
  "challenge_id": "afc0b760-302f-46d0-97e8-b0f73b341ab3",
  "expires_at": "2026-10-27T14:55:33.939166218Z",
  "resend_available_at": "2026-10-27T14:50:34.939166218Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673427313` → **200**

```json
{
  "phone": "+380673427313",
  "audience": "CLIENT",
  "code": "840936",
  "sent_at": "2026-10-27T14:50:34.003246221Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "afc0b760-302f-46d0-97e8-b0f73b341ab3",
  "code": "840936",
  "device_ref": "sandbox-21090"
}
```

```json
{
  "session_id": "d0100eed-9824-4339-afb0-fcaf7098e575",
  "subject": {
    "type": "CLIENT",
    "id": "9240d9f7-8799-4af6-b2bf-7f7635e1567b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MjQwZDlmNy04Nzk5LTRhZjYtYjJiZi03Zjc2MzVlMTU2N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzNTM0LCJpYXQiOjE3OTMxMTI2MzQsImp0aSI6ImUyMGEyOTAxLTA0MTQtNGE5MS1iYjliLWY3ODYwMWU3OTA4MyIsInNpZCI6ImQwMTAwZWVkLTk4MjQtNDMzOS1hZmIwLWZjYWY3MDk4ZTU3NSJ9.aUtCUMNdDQXUL04qh58v7own6JGpQo1SYVGW_djF6PA",
  "access_expires_at": "2026-10-27T15:05:34.053768335Z",
  "refresh_token": "ol3ONZI-8vW_hrfK3o3BLUU_E87hPY4UPhFoHullbGI",
  "refresh_expires_at": "2026-11-26T14:50:34.053371636Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a50d245a-861f-4d50-b0dd-ae5b31dab646",
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
  "id": "666068bf-ea95-48cc-9c02-e35cb242a922",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:55:34.086136Z",
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
  "command_id": "18a13004-4c90-4451-8b3c-02a2e921bf3b",
  "quote_id": "666068bf-ea95-48cc-9c02-e35cb242a922",
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
  "id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9240d9f7-8799-4af6-b2bf-7f7635e1567b",
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
  "created_at": "2026-10-27T14:50:34.116861Z",
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
    "id": "e628043f-a8a6-44e1-b567-ba93eb26d925",
    "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
    "expires_at": "2026-10-27T14:50:49.119294Z",
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

`POST /api/driver/v1/offers/e628043f-a8a6-44e1-b567-ba93eb26d925/accept` → **200**

```json
{
  "command_id": "1af880ce-bbd0-4947-96a5-0255a488692e"
}
```

```json
{
  "id": "2b5982bf-2d0c-4cb9-9351-229876a1f482",
  "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "139c0ae1-7592-487d-ac83-db5012f97932",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "139c0ae1-7592-487d-ac83-db5012f97932",
  "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "assignment_id": "2b5982bf-2d0c-4cb9-9351-229876a1f482",
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

`POST /api/driver/v1/work-sessions/04b6f66e-ce4b-4870-9f2f-aabca7146d41/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:34Z",
    "sequence": 1793112634295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b6f66e-ce4b-4870-9f2f-aabca7146d41",
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
  "last_heartbeat_at": "2026-10-27T14:50:34.312476Z",
  "last_location_at": "2026-10-27T14:50:34.312476Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "139c0ae1-7592-487d-ac83-db5012f97932",
  "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "assignment_id": "2b5982bf-2d0c-4cb9-9351-229876a1f482",
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

`POST /api/driver/v1/trips/139c0ae1-7592-487d-ac83-db5012f97932/arrive` → **200**

```json
{
  "command_id": "b3fefff6-dda0-407a-8b76-c69de4efe49c",
  "expected_version": 0
}
```

```json
{
  "id": "139c0ae1-7592-487d-ac83-db5012f97932",
  "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "assignment_id": "2b5982bf-2d0c-4cb9-9351-229876a1f482",
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
  "arrived_at": "2026-10-27T14:50:34.358208Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/139c0ae1-7592-487d-ac83-db5012f97932/start` → **200**

```json
{
  "command_id": "6bc52715-4964-486f-9f2a-c3fc3f5d135c",
  "expected_version": 1
}
```

```json
{
  "id": "139c0ae1-7592-487d-ac83-db5012f97932",
  "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "assignment_id": "2b5982bf-2d0c-4cb9-9351-229876a1f482",
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
  "arrived_at": "2026-10-27T14:50:34.358208Z",
  "started_at": "2026-10-27T14:50:34.387445Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/04b6f66e-ce4b-4870-9f2f-aabca7146d41/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:34Z",
    "sequence": 1793112634407
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b6f66e-ce4b-4870-9f2f-aabca7146d41",
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
  "last_heartbeat_at": "2026-10-27T14:50:34.424206Z",
  "last_location_at": "2026-10-27T14:50:34.424206Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/139c0ae1-7592-487d-ac83-db5012f97932/complete` → **200**

```json
{
  "command_id": "6669166d-1850-42bc-be6a-1462f7d730f1",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:50:34Z",
  "cash_received": true
}
```

```json
{
  "id": "139c0ae1-7592-487d-ac83-db5012f97932",
  "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "assignment_id": "2b5982bf-2d0c-4cb9-9351-229876a1f482",
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
  "arrived_at": "2026-10-27T14:50:34.358208Z",
  "started_at": "2026-10-27T14:50:34.387445Z",
  "completed_at": "2026-10-27T14:50:34.452697Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/a8d7cee2-bdab-4223-beca-68679e675b0a/rating` → **200**

```json
{
  "command_id": "700171d0-5b00-4093-bcb6-248fc84dece2",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "score": 5,
  "created_at": "2026-10-27T14:50:34.505089923Z"
}
```

`POST /api/driver/v1/orders/a8d7cee2-bdab-4223-beca-68679e675b0a/rating` → **200**

```json
{
  "command_id": "07bf185b-1dc5-44e3-90a1-41332f2c7006",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
  "score": 4,
  "created_at": "2026-10-27T14:50:34.535619076Z"
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
  "session_id": "5fe40d69-4daa-43e1-9af8-fbed0da8b24e",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MzQsImlhdCI6MTc5MzExMjYzNCwianRpIjoiZjE0NTZkZDUtYmFlMi00NWFlLTlhYTYtOTFmYjg0OTFhNjczIiwic2lkIjoiNWZlNDBkNjktNGRhYS00M2UxLTlhZjgtZmJlZDBkYThiMjRlIn0.aneNd6wKoWW0QDIQVQM3HO6YV1cHpH4e8GvNZs0hswg",
  "access_expires_at": "2026-10-27T15:05:34.850689075Z",
  "refresh_token": "V0uWMC2je8NFVyIX_B9LaAphMOOJiAnc52O0F8NAVNk",
  "refresh_expires_at": "2026-10-28T02:50:34.850139751Z",
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
  "session_id": "28d5d799-c04b-4b33-94bd-b3cf7c7f7a9c",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MzUsImlhdCI6MTc5MzExMjYzNSwianRpIjoiMTFiMGU4ZmYtMzM2OS00ZDY0LThkZWQtNDE1YmVhYjJiNTY1Iiwic2lkIjoiMjhkNWQ3OTktYzA0Yi00YjMzLTk0YmQtYjNjZjdjN2Y3YTljIn0.vswFSRLO-fEbjJ8Fz6q2Lyfy7P74nx2dLTUB3l0DTAQ",
  "access_expires_at": "2026-10-27T15:05:35.132858449Z",
  "refresh_token": "FNZRU6eRVeHf2MYxXpEv6v1FhANZXc74IxzrOYP6z2Q",
  "refresh_expires_at": "2026-10-28T02:50:35.132440098Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a8d7cee2-bdab-4223-beca-68679e675b0a/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
      "author_type": "RIDER",
      "author_id": "9240d9f7-8799-4af6-b2bf-7f7635e1567b",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T14:50:34.50509Z"
    },
    {
      "order_id": "a8d7cee2-bdab-4223-beca-68679e675b0a",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "9240d9f7-8799-4af6-b2bf-7f7635e1567b",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T14:50:34.535619Z"
    }
  ]
}
```

Done: ratings for order a8d7cee2-bdab-4223-beca-68679e675b0a.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679207673",
  "device_ref": "sandbox-21443"
}
```

```json
{
  "challenge_id": "7fb909e0-b5d5-4f7d-8628-1b61c5847a39",
  "expires_at": "2026-10-27T14:55:35.205313895Z",
  "resend_available_at": "2026-10-27T14:50:36.205313895Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679207673` → **200**

```json
{
  "phone": "+380679207673",
  "audience": "CLIENT",
  "code": "254067",
  "sent_at": "2026-10-27T14:50:35.207036052Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fb909e0-b5d5-4f7d-8628-1b61c5847a39",
  "code": "254067",
  "device_ref": "sandbox-21443"
}
```

```json
{
  "session_id": "363235e3-0dad-4e20-98ca-f3068cd0ced6",
  "subject": {
    "type": "CLIENT",
    "id": "17807a0c-faf5-4378-aa10-aea357853959"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzgwN2EwYy1mYWY1LTQzNzgtYWExMC1hZWEzNTc4NTM5NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzNTM1LCJpYXQiOjE3OTMxMTI2MzUsImp0aSI6ImJjMTcwMWQyLTU3YTEtNDkxNC1hYTdlLWJmYTA3MmM4ZmQwYyIsInNpZCI6IjM2MzIzNWUzLTBkYWQtNGUyMC05OGNhLWYzMDY4Y2QwY2VkNiJ9.hhcAP53PM3c64utHo6ECbcIi5C4FjIY4kvJhSCxQWlM",
  "access_expires_at": "2026-10-27T15:05:35.25557207Z",
  "refresh_token": "62mPxU2iUxyRcd5JsNa5Nx3h3yOY_s26xNGdktzquH0",
  "refresh_expires_at": "2026-11-26T14:50:35.255176914Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "fe0e153d-dcf6-41ba-87ed-09fc3f49d446",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "000ec156-75b6-47d0-9444-81da586fefc6",
  "upload_path": "/api/rider/v1/uploads/000ec156-75b6-47d0-9444-81da586fefc6",
  "expires_at": "2026-10-27T15:05:35.287845413Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/000ec156-75b6-47d0-9444-81da586fefc6` → **200**

```json
{
  "file_id": "000ec156-75b6-47d0-9444-81da586fefc6",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "d5cebdde-7ee4-4d34-8ec8-801946f83958",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "000ec156-75b6-47d0-9444-81da586fefc6"
  ]
}
```

```json
{
  "id": "cba5e716-bd68-4ebc-be62-acca9aff4dd3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "17807a0c-faf5-4378-aa10-aea357853959",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:50:35.353818Z",
  "updated_at": "2026-10-27T14:50:35.353818Z",
  "messages": [
    {
      "id": "0cc3789c-c1cb-4c1e-82a4-7f4d5382ca4e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "17807a0c-faf5-4378-aa10-aea357853959",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:50:35.355285Z",
      "attachments": [
        {
          "file_id": "000ec156-75b6-47d0-9444-81da586fefc6",
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
  "session_id": "43492722-8c2c-42f6-90ad-c4601b0a7f06",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MzUsImlhdCI6MTc5MzExMjYzNSwianRpIjoiYWVjNDc3OTMtZTgwYS00OTAyLTlmNGUtZjgzYjUxZjIyMDZlIiwic2lkIjoiNDM0OTI3MjItOGMyYy00MmY2LTkwYWQtYzQ2MDFiMGE3ZjA2In0.EdlYVyTbWe3-atfcH-lGLd3yZ3qApY06xOZOMGOGCuE",
  "access_expires_at": "2026-10-27T15:05:35.852494193Z",
  "refresh_token": "FacSopiPC5KjiaNhim1ghsgpLucZZEzcaOfxyc0frnQ",
  "refresh_expires_at": "2026-10-28T02:50:35.852048861Z",
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
  "session_id": "05f85397-d5c8-446d-8922-8807834a305b",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MzYsImlhdCI6MTc5MzExMjYzNiwianRpIjoiYTc1OTQ5YTQtZDRmYS00ZDMwLWI4MzctYWY5OTJiOWEyODk0Iiwic2lkIjoiMDVmODUzOTctZDVjOC00NDZkLTg5MjItODgwNzgzNGEzMDViIn0.RSmJDKkzSEYJxZc6hgHMsg9-AMsmoz1WYaccD73h4Hs",
  "access_expires_at": "2026-10-27T15:05:36.135791605Z",
  "refresh_token": "3a1yXpxwMIyIcm6iR4SgF9m1gbf2fQGrgOkpV2_hOaI",
  "refresh_expires_at": "2026-10-28T02:50:36.135279388Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/cba5e716-bd68-4ebc-be62-acca9aff4dd3/attachments/000ec156-75b6-47d0-9444-81da586fefc6` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "7c8f15f0-9b35-4ec1-bdee-def1fa9f6fab",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "20cd4021-b614-4fe4-a5d8-c3e41418e3ec",
  "upload_path": "/api/operator/v1/uploads/20cd4021-b614-4fe4-a5d8-c3e41418e3ec",
  "expires_at": "2026-10-27T15:05:36.183287389Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/20cd4021-b614-4fe4-a5d8-c3e41418e3ec` → **200**

```json
{
  "file_id": "20cd4021-b614-4fe4-a5d8-c3e41418e3ec",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/cba5e716-bd68-4ebc-be62-acca9aff4dd3` → **200**

```json
{
  "id": "cba5e716-bd68-4ebc-be62-acca9aff4dd3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "17807a0c-faf5-4378-aa10-aea357853959",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:50:35.353818Z",
  "updated_at": "2026-10-27T14:50:35.353818Z",
  "messages": [
    {
      "id": "0cc3789c-c1cb-4c1e-82a4-7f4d5382ca4e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "17807a0c-faf5-4378-aa10-aea357853959",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:50:35.355285Z",
      "attachments": [
        {
          "file_id": "000ec156-75b6-47d0-9444-81da586fefc6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/cba5e716-bd68-4ebc-be62-acca9aff4dd3/comments` → **200**

```json
{
  "command_id": "5d26b1cb-37e8-43ef-af48-ff4b35d61412",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "20cd4021-b614-4fe4-a5d8-c3e41418e3ec"
  ]
}
```

```json
{
  "id": "cba5e716-bd68-4ebc-be62-acca9aff4dd3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "17807a0c-faf5-4378-aa10-aea357853959",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:50:35.353818Z",
  "updated_at": "2026-10-27T14:50:36.370093Z",
  "messages": [
    {
      "id": "0cc3789c-c1cb-4c1e-82a4-7f4d5382ca4e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "17807a0c-faf5-4378-aa10-aea357853959",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:50:35.355285Z",
      "attachments": [
        {
          "file_id": "000ec156-75b6-47d0-9444-81da586fefc6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "0b6a9d66-6d50-4029-832e-994415f6cb95",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "38bff901-eff8-44b6-9dbe-1602eb8909c3",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:50:36.369807Z",
      "attachments": [
        {
          "file_id": "20cd4021-b614-4fe4-a5d8-c3e41418e3ec",
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

`GET /api/rider/v1/support/cases/cba5e716-bd68-4ebc-be62-acca9aff4dd3` → **200**

```json
{
  "id": "cba5e716-bd68-4ebc-be62-acca9aff4dd3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "17807a0c-faf5-4378-aa10-aea357853959",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:50:35.353818Z",
  "updated_at": "2026-10-27T14:50:36.370093Z",
  "messages": [
    {
      "id": "0cc3789c-c1cb-4c1e-82a4-7f4d5382ca4e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "17807a0c-faf5-4378-aa10-aea357853959",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:50:35.355285Z",
      "attachments": [
        {
          "file_id": "000ec156-75b6-47d0-9444-81da586fefc6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "0b6a9d66-6d50-4029-832e-994415f6cb95",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:50:36.369807Z",
      "attachments": [
        {
          "file_id": "20cd4021-b614-4fe4-a5d8-c3e41418e3ec",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/cba5e716-bd68-4ebc-be62-acca9aff4dd3/attachments/20cd4021-b614-4fe4-a5d8-c3e41418e3ec` → **200**

Done: support case cba5e716-bd68-4ebc-be62-acca9aff4dd3, rider attachment 000ec156-75b6-47d0-9444-81da586fefc6, operator attachment 20cd4021-b614-4fe4-a5d8-c3e41418e3ec.

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
  "session_id": "4fcddabc-48e2-4aa0-8d4a-b115bc253c14",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MzYsImlhdCI6MTc5MzExMjYzNiwianRpIjoiODAyOTg5ZjMtZTFkNi00MTJmLThhNDctOGRmZjFmNDc3ZDU1Iiwic2lkIjoiNGZjZGRhYmMtNDhlMi00YWEwLThkNGEtYjExNWJjMjUzYzE0In0.1LjjvxDeifgQQGXELCOx5TDPtjFJJG8gcE9xyG8AFV0",
  "access_expires_at": "2026-10-27T15:05:36.715910696Z",
  "refresh_token": "0XEhP2MijaMmPHBcD1LGJw4sl_ek_91x1RltKEsYqwk",
  "refresh_expires_at": "2026-10-28T02:50:36.71551576Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30197"
}
```

```json
{
  "challenge_id": "045b519d-a688-4a52-85e7-e7f1338ad93d",
  "expires_at": "2026-10-27T14:55:36.739526906Z",
  "resend_available_at": "2026-10-27T14:50:37.739526906Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "916989",
  "sent_at": "2026-10-27T14:50:36.741148362Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "045b519d-a688-4a52-85e7-e7f1338ad93d",
  "code": "916989",
  "device_ref": "sandbox-30197"
}
```

```json
{
  "session_id": "1ba27160-5634-4de0-8abe-b3d0175a9f72",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUzNiwiaWF0IjoxNzkzMTEyNjM2LCJqdGkiOiJkMTBlMzgyYy0xZTkyLTRiZWItYmZhZS1hZjU1NjIzMTY0MDEiLCJzaWQiOiIxYmEyNzE2MC01NjM0LTRkZTAtOGFiZS1iM2QwMTc1YTlmNzIifQ.bS39rIhmzguVgWw-h_RLasXKeiZOfa9BN1Az6s-IsDQ",
  "access_expires_at": "2026-10-27T15:05:36.787525533Z",
  "refresh_token": "8Sm_lRLLjkqb7Dha4awwO-NAYes8D-JwFe-wR9YfItk",
  "refresh_expires_at": "2026-11-26T14:50:36.787143527Z",
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
  "command_id": "c7a91cbd-088d-405f-9e80-1a536cb152d9",
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
  "device_ref": "sandbox-802"
}
```

```json
{
  "challenge_id": "a9c55d8b-6beb-403f-9744-d8ec7a8ea244",
  "expires_at": "2026-10-27T14:55:36.897622599Z",
  "resend_available_at": "2026-10-27T14:50:37.897622599Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "135816",
  "sent_at": "2026-10-27T14:50:36.899265783Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9c55d8b-6beb-403f-9744-d8ec7a8ea244",
  "code": "135816",
  "device_ref": "sandbox-802"
}
```

```json
{
  "session_id": "9b6b6621-9baf-4251-9d6a-9d2bd8c7c26b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzUzNiwiaWF0IjoxNzkzMTEyNjM2LCJqdGkiOiI0MjA4YjI4Mi1mMjQ1LTQ5MjgtYmMwOS1kYjBjMWM2NzA1NGMiLCJzaWQiOiI5YjZiNjYyMS05YmFmLTQyNTEtOWQ2YS05ZDJiZDhjN2MyNmIifQ.UR2FV0TUQOkxIddcOTZHPGiLBpbr7llv0HPzjnL0HgI",
  "access_expires_at": "2026-10-27T15:05:36.945287027Z",
  "refresh_token": "M8rOeXXEQGUVWcwIa6D7PKYsoNlCyitt-OJmlh_NBKU",
  "refresh_expires_at": "2026-11-26T14:50:36.944836347Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b6f66e-ce4b-4870-9f2f-aabca7146d41",
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
  "last_heartbeat_at": "2026-10-27T14:50:34.424206Z",
  "last_location_at": "2026-10-27T14:50:34.424206Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/04b6f66e-ce4b-4870-9f2f-aabca7146d41/handover` → **200**

```json
{
  "command_id": "87af43e8-5f38-418c-b917-e5c7b2372dfb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b6f66e-ce4b-4870-9f2f-aabca7146d41",
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
  "last_heartbeat_at": "2026-10-27T14:50:34.424206Z",
  "last_location_at": "2026-10-27T14:50:34.424206Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/04b6f66e-ce4b-4870-9f2f-aabca7146d41/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:37Z",
    "sequence": 1793112637168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "04b6f66e-ce4b-4870-9f2f-aabca7146d41",
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
  "last_heartbeat_at": "2026-10-27T14:50:37.03301Z",
  "last_location_at": "2026-10-27T14:50:37.03301Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:15.090748Z",
  "last_location_at": "2026-10-27T14:50:15.090748Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/df3a3a0f-128c-4657-b8b9-3d7e6b7378d9/handover` → **200**

```json
{
  "command_id": "46312e17-5e1a-489b-af9c-9db7f3c9b2fa",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:15.090748Z",
  "last_location_at": "2026-10-27T14:50:15.090748Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/df3a3a0f-128c-4657-b8b9-3d7e6b7378d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:37Z",
    "sequence": 1793112637169
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:37.119978Z",
  "last_location_at": "2026-10-27T14:50:37.119978Z",
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
  "session_id": "c1eb5129-7f3c-4af1-8853-e194f71c4bbd",
  "subject": {
    "type": "STAFF",
    "id": "38bff901-eff8-44b6-9dbe-1602eb8909c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGJmZjkwMS1lZmY4LTQ0YjYtOWRiZS0xNjAyZWI4OTA5YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTM1MzcsImlhdCI6MTc5MzExMjYzNywianRpIjoiMGExMTljYjktOGZiMC00YzE0LTk4ZGQtYWMwMjFjM2E4ZTNkIiwic2lkIjoiYzFlYjUxMjktN2YzYy00YWYxLTg4NTMtZTE5NGY3MWM0YmJkIn0.uB5VNr1yDAuQL12NObMMc3RKCm-GmgspLTRCUWwhLFo",
  "access_expires_at": "2026-10-27T15:05:37.4063639Z",
  "refresh_token": "k_U5K0-I_J1QDnC6fhG6O_k_YuH44dvkuQrCZYkGsQA",
  "refresh_expires_at": "2026-10-28T02:50:37.405846439Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c902328a-0b66-49a7-a915-7e4cc820d8f7",
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
  "id": "458dd1b3-8e36-462a-8f9d-a693651ee9e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:55:37.435237Z",
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
  "command_id": "516781e2-97b6-4bb5-aaa4-2eecdad8b49c",
  "quote_id": "458dd1b3-8e36-462a-8f9d-a693651ee9e2",
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
  "id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
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
  "created_at": "2026-10-27T14:50:37.467587Z",
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
    "id": "01821070-05dc-41a2-b8de-f88e1cc993f7",
    "order_id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
    "expires_at": "2026-10-27T14:50:52.470489Z",
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

`POST /api/driver/v1/offers/01821070-05dc-41a2-b8de-f88e1cc993f7/accept` → **200**

```json
{
  "command_id": "23141f8c-d7f9-470d-9994-4c0424a0a67b"
}
```

```json
{
  "id": "28dcccb2-77d8-4d94-baba-4ea084fa4038",
  "order_id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "efe62059-fec0-40f7-bf49-3415a1d65e7c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "efe62059-fec0-40f7-bf49-3415a1d65e7c",
  "order_id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
  "assignment_id": "28dcccb2-77d8-4d94-baba-4ea084fa4038",
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

`POST /api/driver/v1/work-sessions/df3a3a0f-128c-4657-b8b9-3d7e6b7378d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:50:37Z",
    "sequence": 1793112637587
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:37.60365Z",
  "last_location_at": "2026-10-27T14:50:37.60365Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/efe62059-fec0-40f7-bf49-3415a1d65e7c/arrive` → **200**

```json
{
  "command_id": "948f13e1-1621-426b-95eb-1e8c7f55ebb5",
  "expected_version": 0
}
```

```json
{
  "id": "efe62059-fec0-40f7-bf49-3415a1d65e7c",
  "order_id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
  "assignment_id": "28dcccb2-77d8-4d94-baba-4ea084fa4038",
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
  "arrived_at": "2026-10-27T14:50:37.633851Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/efe62059-fec0-40f7-bf49-3415a1d65e7c/start` → **200**

```json
{
  "command_id": "1b9dd251-fe05-4a0a-a1f7-389df6d8acdb",
  "expected_version": 1
}
```

```json
{
  "id": "efe62059-fec0-40f7-bf49-3415a1d65e7c",
  "order_id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
  "assignment_id": "28dcccb2-77d8-4d94-baba-4ea084fa4038",
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
  "arrived_at": "2026-10-27T14:50:37.633851Z",
  "started_at": "2026-10-27T14:50:37.785108Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/efe62059-fec0-40f7-bf49-3415a1d65e7c/complete` → **200**

```json
{
  "command_id": "f50807b8-ca2e-4591-8de8-de5b8f09a661",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:50:37Z",
  "cash_received": true
}
```

```json
{
  "id": "efe62059-fec0-40f7-bf49-3415a1d65e7c",
  "order_id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
  "assignment_id": "28dcccb2-77d8-4d94-baba-4ea084fa4038",
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
  "arrived_at": "2026-10-27T14:50:37.633851Z",
  "started_at": "2026-10-27T14:50:37.785108Z",
  "completed_at": "2026-10-27T14:50:37.821965Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/d9dbf488-d9a0-4feb-82fd-87f85bebd8f7` → **200**

```json
{
  "id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
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
    "id": "28dcccb2-77d8-4d94-baba-4ea084fa4038",
    "order_id": "d9dbf488-d9a0-4feb-82fd-87f85bebd8f7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "efe62059-fec0-40f7-bf49-3415a1d65e7c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:50:37.467587Z",
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
  "session_id": "04b6f66e-ce4b-4870-9f2f-aabca7146d41",
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
  "last_heartbeat_at": "2026-10-27T14:50:37.03301Z",
  "last_location_at": "2026-10-27T14:50:37.03301Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/04b6f66e-ce4b-4870-9f2f-aabca7146d41/close` → **200**

```json
{
  "command_id": "f53f47be-a1a4-41a4-b0ea-5d1aaff5d6f4",
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
  "session_id": "df3a3a0f-128c-4657-b8b9-3d7e6b7378d9",
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
  "last_heartbeat_at": "2026-10-27T14:50:37.60365Z",
  "last_location_at": "2026-10-27T14:50:37.60365Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df3a3a0f-128c-4657-b8b9-3d7e6b7378d9/close` → **200**

```json
{
  "command_id": "88c6c332-11ea-452f-b4a7-310c4a3bc401",
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

Done: terminal order d9dbf488-d9a0-4feb-82fd-87f85bebd8f7 by Andrii (5a000000-0000-4000-8000-000000000403).
