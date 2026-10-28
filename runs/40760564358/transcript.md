# Sandbox transcript (2026-10-28T20:09:09Z, 266c403)

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
  "correlation_id": "8c86bcf8-24a0-43a2-b046-343a19933b03"
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
  "session_id": "f042e64e-96ac-4948-9feb-ec3acd7e59d0",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkwNTQsImlhdCI6MTc5MzIxODE1NCwianRpIjoiOTNkMzVlNDAtNDBiYi00NjljLThjZmMtYjk3ODY5YjQ2MmY0Iiwic2lkIjoiZjA0MmU2NGUtOTZhYy00OTQ4LTlmZWItZWMzYWNkN2U1OWQwIn0.yK3Fo7NLljA56nQhBniaS9oJ98wmLgAqcIJbqvlzxB4",
  "access_expires_at": "2026-10-28T20:24:14.163183429Z",
  "refresh_token": "3k00tTzHNGaugiX4KLsgorkrm2s3n3SO7HRm4ah1Q4U",
  "refresh_expires_at": "2026-10-29T08:09:14.161790958Z",
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
  "session_id": "c6c33a91-e355-4459-bcae-5e4d65cdbee7",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkwNTUsImlhdCI6MTc5MzIxODE1NSwianRpIjoiYWRjYmUwMWQtZDQzNi00MzM1LWFiZDUtNmU3YmE2ZWNhNTE4Iiwic2lkIjoiYzZjMzNhOTEtZTM1NS00NDU5LWJjYWUtNWU0ZDY1Y2RiZWU3In0.GUT0IZrDP4m6y78L5Je8VpqlSIgEWVkpeAsl6z7SXSg",
  "access_expires_at": "2026-10-28T20:24:15.191715922Z",
  "refresh_token": "xo-KRet8Xuc3P9J7Ym3kK1jcyYGKJACXpaQW-nmfXhM",
  "refresh_expires_at": "2026-10-29T08:09:15.191107032Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "99f00d1a-86a4-42f1-b656-64b91499c1ce",
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
  "id": "cd66cf12-e170-45db-8972-fb2ac478912c",
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
  "created_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "created_at": "2026-10-28T20:09:15.390104Z",
  "updated_at": "2026-10-28T20:09:15.390104Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638222074",
  "device_ref": "sandbox-231"
}
```

```json
{
  "challenge_id": "8d2db98e-8ff5-491a-945e-127b86019b1b",
  "expires_at": "2026-10-28T20:14:15.579666197Z",
  "resend_available_at": "2026-10-28T20:09:16.579666197Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638222074` → **200**

```json
{
  "phone": "+380638222074",
  "audience": "CLIENT",
  "code": "442636",
  "sent_at": "2026-10-28T20:09:15.587396905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d2db98e-8ff5-491a-945e-127b86019b1b",
  "code": "442636",
  "device_ref": "sandbox-231"
}
```

```json
{
  "session_id": "16b550cd-df37-47aa-961d-e4808e60df86",
  "subject": {
    "type": "CLIENT",
    "id": "fcbd5d36-9979-4c9f-8add-a8f2280c680c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2JkNWQzNi05OTc5LTRjOWYtOGFkZC1hOGYyMjgwYzY4MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MDU1LCJpYXQiOjE3OTMyMTgxNTUsImp0aSI6IjY0YzAzMmFhLTdmZjEtNGE1Ni1iZmJlLTc3NGNiNzlhNTg0YiIsInNpZCI6IjE2YjU1MGNkLWRmMzctNDdhYS05NjFkLWU0ODA4ZTYwZGY4NiJ9.BaaeY0X4dzqp5TEcyV6NkBJrqQGtkTqp8AQ0n_cBXTk",
  "access_expires_at": "2026-10-28T20:24:15.791908408Z",
  "refresh_token": "JPHd_loAlzCywN4R5sjPJg8cF2QHaZ7myBiiVKO68MM",
  "refresh_expires_at": "2026-11-27T20:09:15.791217875Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638222074` → **200**

```json
{
  "client_id": "fcbd5d36-9979-4c9f-8add-a8f2280c680c"
}
```

`POST /api/admin/v1/rider-wallets/fcbd5d36-9979-4c9f-8add-a8f2280c680c/top-ups` → **201**

```json
{
  "command_id": "09c78692-9d8c-4edb-98c5-1f7dbbe6cdc9",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "fcbd5d36-9979-4c9f-8add-a8f2280c680c",
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
      "id": "1d89793a-0af4-4b51-995d-fc05d3fc1211",
      "at": "2026-10-28T20:09:16.151126Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "565656c4-4226-44ec-9ceb-017d071fc602",
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
  "id": "dffcb63e-124d-461c-9282-c2302a8b4af2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:14:16.399247Z",
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
      "id": "cd66cf12-e170-45db-8972-fb2ac478912c",
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
  "device_ref": "sandbox-7613"
}
```

```json
{
  "challenge_id": "32780368-3afa-4358-81dc-526b98169c7e",
  "expires_at": "2026-10-28T20:14:16.633234122Z",
  "resend_available_at": "2026-10-28T20:09:17.633234122Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "340729",
  "sent_at": "2026-10-28T20:09:16.636242003Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32780368-3afa-4358-81dc-526b98169c7e",
  "code": "340729",
  "device_ref": "sandbox-7613"
}
```

```json
{
  "session_id": "23383378-00a7-4e9f-9f3c-136e3f4d0322",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTA1NiwiaWF0IjoxNzkzMjE4MTU2LCJqdGkiOiI1N2I5MzRiMS1jNzJmLTQ4YmYtYTExMy03NDNjOTNiNzUxNWUiLCJzaWQiOiIyMzM4MzM3OC0wMGE3LTRlOWYtOWYzYy0xMzZlM2Y0ZDAzMjIifQ.op5OyahGO5X7OP1O8-pUP-h1-2MpM-JLpahF96dR2jE",
  "access_expires_at": "2026-10-28T20:24:16.845388821Z",
  "refresh_token": "7mEUAaZEsewKR7MvWjYcTZXQVK9Ec6U1mPwGhy0ZAoM",
  "refresh_expires_at": "2026-11-27T20:09:16.844630775Z",
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
  "command_id": "23fbbf15-3f7a-411e-ad0c-d04c3b8af9bc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:17Z",
    "sequence": 1793218157226
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e26677ec-2bb2-48a8-b1b9-1695e5c89c94",
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
  "last_heartbeat_at": "2026-10-28T20:09:17.289859Z",
  "last_location_at": "2026-10-28T20:09:17.289859Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "58c5a22e-d20f-465f-accf-779e6c75c20d",
  "quote_id": "dffcb63e-124d-461c-9282-c2302a8b4af2",
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
  "id": "12914dda-00b5-4939-a556-f0776d1e348c",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fcbd5d36-9979-4c9f-8add-a8f2280c680c",
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
  "created_at": "2026-10-28T20:09:17.564467Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "pickup_eta": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fcbd5d36-9979-4c9f-8add-a8f2280c680c",
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
      "id": "1d89793a-0af4-4b51-995d-fc05d3fc1211",
      "at": "2026-10-28T20:09:16.151126Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
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
    "id": "63b8fc9a-e74a-4901-8c6f-a7577852f796",
    "order_id": "12914dda-00b5-4939-a556-f0776d1e348c",
    "expires_at": "2026-10-28T20:09:32.575643Z",
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

`POST /api/driver/v1/offers/63b8fc9a-e74a-4901-8c6f-a7577852f796/accept` → **200**

```json
{
  "command_id": "475b3bcd-a5ff-4e48-a022-dda2b34d2a33"
}
```

```json
{
  "id": "fcfa0353-9faa-4521-b1f1-94f705ce6a37",
  "order_id": "12914dda-00b5-4939-a556-f0776d1e348c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55",
  "order_id": "12914dda-00b5-4939-a556-f0776d1e348c",
  "assignment_id": "fcfa0353-9faa-4521-b1f1-94f705ce6a37",
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

`POST /api/driver/v1/work-sessions/e26677ec-2bb2-48a8-b1b9-1695e5c89c94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:18Z",
    "sequence": 1793218158467
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e26677ec-2bb2-48a8-b1b9-1695e5c89c94",
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
  "last_heartbeat_at": "2026-10-28T20:09:18.486793Z",
  "last_location_at": "2026-10-28T20:09:18.486793Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55/arrive` → **200**

```json
{
  "command_id": "b423b8f4-a6cd-4e88-ab85-1326a14148a7",
  "expected_version": 0
}
```

```json
{
  "id": "a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55",
  "order_id": "12914dda-00b5-4939-a556-f0776d1e348c",
  "assignment_id": "fcfa0353-9faa-4521-b1f1-94f705ce6a37",
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
  "arrived_at": "2026-10-28T20:09:18.669899Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55/start` → **200**

```json
{
  "command_id": "e4df49cc-7cb7-479c-b994-77ad8b360c31",
  "expected_version": 1
}
```

```json
{
  "id": "a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55",
  "order_id": "12914dda-00b5-4939-a556-f0776d1e348c",
  "assignment_id": "fcfa0353-9faa-4521-b1f1-94f705ce6a37",
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
  "arrived_at": "2026-10-28T20:09:18.669899Z",
  "started_at": "2026-10-28T20:09:18.856747Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55/complete` → **200**

```json
{
  "command_id": "c0b5c0d9-3368-4eda-86fb-cb0f4278842b",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:09:19Z",
  "cash_received": true
}
```

```json
{
  "id": "a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55",
  "order_id": "12914dda-00b5-4939-a556-f0776d1e348c",
  "assignment_id": "fcfa0353-9faa-4521-b1f1-94f705ce6a37",
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
  "arrived_at": "2026-10-28T20:09:18.669899Z",
  "started_at": "2026-10-28T20:09:18.856747Z",
  "completed_at": "2026-10-28T20:09:19.068714Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fcbd5d36-9979-4c9f-8add-a8f2280c680c",
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
      "id": "5023fb36-6e2c-4740-a114-f78d26e589a8",
      "at": "2026-10-28T20:09:20.047981Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "12914dda-00b5-4939-a556-f0776d1e348c"
    },
    {
      "id": "1d89793a-0af4-4b51-995d-fc05d3fc1211",
      "at": "2026-10-28T20:09:16.151126Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/cd66cf12-e170-45db-8972-fb2ac478912c/archive` → **200**

```json
{
  "command_id": "0d423714-57b7-4c4d-b350-ebc8b91cff9c",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "cd66cf12-e170-45db-8972-fb2ac478912c",
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
  "created_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "created_at": "2026-10-28T20:09:15.390104Z",
  "updated_at": "2026-10-28T20:09:22.44275Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e26677ec-2bb2-48a8-b1b9-1695e5c89c94",
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
  "last_heartbeat_at": "2026-10-28T20:09:18.486793Z",
  "last_location_at": "2026-10-28T20:09:18.486793Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e26677ec-2bb2-48a8-b1b9-1695e5c89c94/close` → **200**

```json
{
  "command_id": "ee359e5f-5ddc-468e-bf8f-05896e1c1e1b",
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

Done: order 12914dda-00b5-4939-a556-f0776d1e348c.

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
  "session_id": "0bf52748-3548-40b6-8654-104df8135c26",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkwNjMsImlhdCI6MTc5MzIxODE2MywianRpIjoiYWM5YTM0MWEtNWE2Ny00MmIxLWE0YmUtMDNmYmJkN2NhZWIyIiwic2lkIjoiMGJmNTI3NDgtMzU0OC00MGI2LTg2NTQtMTA0ZGY4MTM1YzI2In0.blJF_ffdr3aOtHyraoNBYYF0rvMyX6FdRHmQj7UnYzU",
  "access_expires_at": "2026-10-28T20:24:23.17221352Z",
  "refresh_token": "R-YSPkY6WXRop9CtbQ9tLOIaWAP3SD4RqrjESll4Tg0",
  "refresh_expires_at": "2026-10-29T08:09:23.171695068Z",
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
  "command_id": "81bcb0db-116a-420f-bfd4-23d2070cb5a8",
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
  "session_id": "729695ac-db8d-4dd6-a1fd-c38612984dec",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkwNjMsImlhdCI6MTc5MzIxODE2MywianRpIjoiY2U1YTVhYmEtNDI4Mi00NGQzLWFmMjktZjgwNjkxZTMzNzk2Iiwic2lkIjoiNzI5Njk1YWMtZGI4ZC00ZGQ2LWExZmQtYzM4NjEyOTg0ZGVjIn0.Qg_z9lb3Wbca-a37RwXqw5l6US6hij40W19iAw9jqyg",
  "access_expires_at": "2026-10-28T20:24:23.917008668Z",
  "refresh_token": "8ZyUUJP4bCKVpgJmxMIz4ohnJKthTyKyVXlnLL377Zc",
  "refresh_expires_at": "2026-10-29T08:09:23.916459665Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.57213197",
    "linkedid": "1730052700.57213197",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678530063"
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
    "id": "1730052700.57213197",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "2f02f068-3d4f-4f9d-abce-10f2fb63aef0",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678530063",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T20:09:24.087593Z",
      "answered_at": null,
      "ended_at": "2026-10-28T20:09:24.107111Z",
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
    "id": "1730052600.2228316283",
    "linkedid": "1730052600.2228316283",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678530063"
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
      "id": "599ac68b-207f-4223-8497-dc13d38a9007",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678530063",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T20:09:24.316365Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/599ac68b-207f-4223-8497-dc13d38a9007/answer` → **200**

```json
{
  "command_id": "e753527d-6d22-4604-be71-daf5bff5ed77"
}
```

```json
{
  "id": "599ac68b-207f-4223-8497-dc13d38a9007",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678530063",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "order_ids": [],
  "started_at": "2026-10-28T20:09:24.316365Z",
  "answered_at": "2026-10-28T20:09:24.537198Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2228316283",
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
    "id": "1730052600.2228316283",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "599ac68b-207f-4223-8497-dc13d38a9007",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678530063",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [],
      "started_at": "2026-10-28T20:09:24.316365Z",
      "answered_at": "2026-10-28T20:09:24.537198Z",
      "ended_at": "2026-10-28T20:09:24.737604Z",
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
      "id": "599ac68b-207f-4223-8497-dc13d38a9007",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678530063",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [],
      "started_at": "2026-10-28T20:09:24.316365Z",
      "answered_at": "2026-10-28T20:09:24.537198Z",
      "ended_at": "2026-10-28T20:09:24.737604Z",
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
      "id": "599ac68b-207f-4223-8497-dc13d38a9007",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678530063",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [],
      "started_at": "2026-10-28T20:09:24.316365Z",
      "answered_at": "2026-10-28T20:09:24.537198Z",
      "ended_at": "2026-10-28T20:09:24.737604Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:09:27.897826Z"
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
      "id": "599ac68b-207f-4223-8497-dc13d38a9007",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678530063",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [],
      "started_at": "2026-10-28T20:09:24.316365Z",
      "answered_at": "2026-10-28T20:09:24.537198Z",
      "ended_at": "2026-10-28T20:09:24.737604Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:09:27.897826Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/599ac68b-207f-4223-8497-dc13d38a9007/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/599ac68b-207f-4223-8497-dc13d38a9007/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=599ac68b-207f-4223-8497-dc13d38a9007` → **200**

```json
{
  "changes": [
    {
      "id": "c393adca-05c8-4767-b358-89be3c4d4531",
      "occurred_at": "2026-10-28T20:09:29.536976Z",
      "actor_type": "STAFF",
      "actor_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "599ac68b-207f-4223-8497-dc13d38a9007",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"89b10806-cfb0-4ba7-ac13-0e6b633b7346\", \"order_ids\": []}",
      "correlation_id": "44852e85-6191-431e-849a-732e291fbad0"
    },
    {
      "id": "904a0d49-9e0b-4594-8420-9b06255e2edb",
      "occurred_at": "2026-10-28T20:09:29.512614Z",
      "actor_type": "STAFF",
      "actor_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "599ac68b-207f-4223-8497-dc13d38a9007",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"89b10806-cfb0-4ba7-ac13-0e6b633b7346\", \"order_ids\": []}",
      "correlation_id": "d3440578-ae90-4928-920e-bbc9cb13bcf4"
    }
  ]
}
```

Done: call 599ac68b-207f-4223-8497-dc13d38a9007 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12417"
}
```

```json
{
  "challenge_id": "0d4c3d57-6251-4afc-8ae5-424263b68c93",
  "expires_at": "2026-10-28T20:14:29.740419185Z",
  "resend_available_at": "2026-10-28T20:09:30.740419185Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "303600",
  "sent_at": "2026-10-28T20:09:29.743405044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d4c3d57-6251-4afc-8ae5-424263b68c93",
  "code": "303600",
  "device_ref": "sandbox-12417"
}
```

```json
{
  "session_id": "9d4a6f00-5662-4d4c-b903-0819011893e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTA2OSwiaWF0IjoxNzkzMjE4MTY5LCJqdGkiOiIyYmU5ZGY5Zi0zZjNhLTRlYjgtOGFkYy0wNDMzZjc5MjBjZjUiLCJzaWQiOiI5ZDRhNmYwMC01NjYyLTRkNGMtYjkwMy0wODE5MDExODkzZTgifQ.ANwVIMr13DIrgLu-E2I3etZpyZcccIOXm5-GrPuF2uU",
  "access_expires_at": "2026-10-28T20:24:29.930694996Z",
  "refresh_token": "uLpjfNgUudQFm6rnEy8TbEzKbFkphbEkj1x_CF2RVyk",
  "refresh_expires_at": "2026-11-27T20:09:29.930188017Z",
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
  "command_id": "0ccf1d2b-3403-4bc2-a977-e2bbad46385a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:30Z",
    "sequence": 1793218170260
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fab6b7e-0a6b-4635-a22a-44fd8397deca",
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
  "last_heartbeat_at": "2026-10-28T20:09:30.275957Z",
  "last_location_at": "2026-10-28T20:09:30.275957Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator takes a phone order for a caller without the app

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
  "session_id": "c06accd4-ef65-48fa-8deb-82c841b7602a",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkwNzAsImlhdCI6MTc5MzIxODE3MCwianRpIjoiNjk2NWE3Y2EtMGIzYy00ODhjLWE2M2YtNTgzMjJlMDdkNTYzIiwic2lkIjoiYzA2YWNjZDQtZWY2NS00OGZhLThkZWItODJjODQxYjc2MDJhIn0.EFrkKfVHwVSo6AKp9htwuqBxHcvwiiTcvfxwP6oIsbQ",
  "access_expires_at": "2026-10-28T20:24:30.647977733Z",
  "refresh_token": "gxwUmaygLd2b0hRbv2QczRbQtzy5pi3Gdm6bub6Bvkc",
  "refresh_expires_at": "2026-10-29T08:09:30.647635266Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a4ce8c44-c81f-4925-b4e5-66db267b7dd8",
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
  "id": "efc7e870-06e2-410d-be5b-43b83a62622f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:14:30.820836Z",
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
  "command_id": "dbd381bc-d1fe-4403-9981-80c752cf774b",
  "quote_id": "efc7e870-06e2-410d-be5b-43b83a62622f",
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
    "name": "Олена",
    "phone": "+380677443454"
  }
}
```

```json
{
  "id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
  "short_number": 2,
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
  "created_at": "2026-10-28T20:09:31.009495Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677443454"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Ivan accepts: the caller gets the car and the plate by SMS

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a87e6d9f-72cc-4a55-b6a0-169a28280b2d",
    "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
    "expires_at": "2026-10-28T20:09:46.013509Z",
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
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/a87e6d9f-72cc-4a55-b6a0-169a28280b2d/accept` → **200**

```json
{
  "command_id": "6ac6237f-e321-475c-b2ff-e4b9f5c34a6e"
}
```

```json
{
  "id": "675fc010-fe67-40f4-a1f6-d08d2bcefded",
  "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6adda46f-d59b-46bf-a37d-2bfbbf5b99ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[
  {
    "phone": "+380677443454",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:33.015116462Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[
  {
    "phone": "+380677443454",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:33.015116462Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[
  {
    "phone": "+380677443454",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:33.015116462Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6adda46f-d59b-46bf-a37d-2bfbbf5b99ed",
  "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
  "assignment_id": "675fc010-fe67-40f4-a1f6-d08d2bcefded",
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
    "name": "Олена",
    "phone": "+380677443454"
  }
}
```

`POST /api/driver/v1/work-sessions/4fab6b7e-0a6b-4635-a22a-44fd8397deca/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:33Z",
    "sequence": 1793218173791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fab6b7e-0a6b-4635-a22a-44fd8397deca",
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
  "last_heartbeat_at": "2026-10-28T20:09:33.808168Z",
  "last_location_at": "2026-10-28T20:09:33.808168Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6adda46f-d59b-46bf-a37d-2bfbbf5b99ed/arrive` → **200**

```json
{
  "command_id": "44b698d2-2cc4-4deb-9a20-ca1f7d41e23e",
  "expected_version": 0
}
```

```json
{
  "id": "6adda46f-d59b-46bf-a37d-2bfbbf5b99ed",
  "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
  "assignment_id": "675fc010-fe67-40f4-a1f6-d08d2bcefded",
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
  "arrived_at": "2026-10-28T20:09:33.9856Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677443454"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[
  {
    "phone": "+380677443454",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:33.015116462Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[
  {
    "phone": "+380677443454",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:33.015116462Z"
  },
  {
    "phone": "+380677443454",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:35.021096826Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[
  {
    "phone": "+380677443454",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:33.015116462Z"
  },
  {
    "phone": "+380677443454",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:35.021096826Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677443454` → **200**

```json
[
  {
    "phone": "+380677443454",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:33.015116462Z"
  },
  {
    "phone": "+380677443454",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:09:35.021096826Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/6adda46f-d59b-46bf-a37d-2bfbbf5b99ed/start` → **200**

```json
{
  "command_id": "f318bd97-d944-4b68-89a0-061f5773e1a8",
  "expected_version": 1
}
```

```json
{
  "id": "6adda46f-d59b-46bf-a37d-2bfbbf5b99ed",
  "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
  "assignment_id": "675fc010-fe67-40f4-a1f6-d08d2bcefded",
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
  "arrived_at": "2026-10-28T20:09:33.9856Z",
  "started_at": "2026-10-28T20:09:35.286088Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677443454"
  }
}
```

`POST /api/driver/v1/trips/6adda46f-d59b-46bf-a37d-2bfbbf5b99ed/complete` → **200**

```json
{
  "command_id": "a5a3ecfb-3f5b-4ebb-9577-7aa800811744",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:09:35Z",
  "cash_received": true
}
```

```json
{
  "id": "6adda46f-d59b-46bf-a37d-2bfbbf5b99ed",
  "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
  "assignment_id": "675fc010-fe67-40f4-a1f6-d08d2bcefded",
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
  "arrived_at": "2026-10-28T20:09:33.9856Z",
  "started_at": "2026-10-28T20:09:35.286088Z",
  "completed_at": "2026-10-28T20:09:35.467394Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: two SMS to the caller of a phone order.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fab6b7e-0a6b-4635-a22a-44fd8397deca",
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
  "last_heartbeat_at": "2026-10-28T20:09:33.808168Z",
  "last_location_at": "2026-10-28T20:09:33.808168Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4fab6b7e-0a6b-4635-a22a-44fd8397deca/close` → **200**

```json
{
  "command_id": "2e49efd6-fe44-4f45-bbb0-7872c37eb27b",
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

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635987516",
  "device_ref": "sandbox-17818"
}
```

```json
{
  "challenge_id": "7a1f93ae-7b9b-4a11-a217-ad98af67acd0",
  "expires_at": "2026-10-28T20:14:35.998164513Z",
  "resend_available_at": "2026-10-28T20:09:36.998164513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635987516` → **200**

```json
{
  "phone": "+380635987516",
  "audience": "CLIENT",
  "code": "051338",
  "sent_at": "2026-10-28T20:09:36.000754372Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a1f93ae-7b9b-4a11-a217-ad98af67acd0",
  "code": "051338",
  "device_ref": "sandbox-17818"
}
```

```json
{
  "session_id": "ff35634d-3a8b-4e2e-9f23-70ac18fe28f1",
  "subject": {
    "type": "CLIENT",
    "id": "a47f4a93-11c8-4e7d-a1d7-16656c8961c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDdmNGE5My0xMWM4LTRlN2QtYTFkNy0xNjY1NmM4OTYxYzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MDc2LCJpYXQiOjE3OTMyMTgxNzYsImp0aSI6IjNhZmU1NjI3LTlhNzctNGQxNy1iOWFkLTZkNjliOWY0YWQyNyIsInNpZCI6ImZmMzU2MzRkLTNhOGItNGUyZS05ZjIzLTcwYWMxOGZlMjhmMSJ9.1BaGw1Znua9UMzufK3Cqp0GD_eOp-eNf4IG3yChOLCE",
  "access_expires_at": "2026-10-28T20:24:36.189898071Z",
  "refresh_token": "1k7o5y0mGHgw-FSlAYAhCTJOPQfOQ6mQKqOmCElvdFA",
  "refresh_expires_at": "2026-11-27T20:09:36.189449475Z",
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
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-29213"
}
```

```json
{
  "challenge_id": "3d94a646-dcdb-4234-abe8-6ded717338f6",
  "expires_at": "2026-10-28T20:14:36.521117959Z",
  "resend_available_at": "2026-10-28T20:09:37.521117959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "238691",
  "sent_at": "2026-10-28T20:09:36.523500089Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d94a646-dcdb-4234-abe8-6ded717338f6",
  "code": "238691",
  "device_ref": "sandbox-29213"
}
```

```json
{
  "session_id": "220ff16f-b19f-4984-914c-aa4df672cf4d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTA3NiwiaWF0IjoxNzkzMjE4MTc2LCJqdGkiOiJlMmY4ZDU0ZS01YTZmLTQ0ODMtYTVhMi1lNWQ4YWQyMThkYzkiLCJzaWQiOiIyMjBmZjE2Zi1iMTlmLTQ5ODQtOTE0Yy1hYTRkZjY3MmNmNGQifQ.j7TPsD_X7Je_0KYx4_3jePHcPuGMEkLz0p7wF8B4H9w",
  "access_expires_at": "2026-10-28T20:24:36.712489942Z",
  "refresh_token": "NP7pckyGEQS7eWU-PE0SP0Nstj6k90TLO6_ayo2KgwU",
  "refresh_expires_at": "2026-11-27T20:09:36.711906332Z",
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
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
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
  "session_id": "96cd9b78-1cfd-4501-8530-78875a9afb60",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkwNzcsImlhdCI6MTc5MzIxODE3NywianRpIjoiNTZlOGE5NmEtOTRiYS00MDc2LWEzMzgtODExMWY5NzA4ODg5Iiwic2lkIjoiOTZjZDliNzgtMWNmZC00NTAxLTg1MzAtNzg4NzVhOWFmYjYwIn0.o_1QrRaD-4Ob7o9_QnnpQjsXCgHhyuDN-Jao5W2CTbE",
  "access_expires_at": "2026-10-28T20:24:37.248867971Z",
  "refresh_token": "Ze1K0BuJ5GY_7liYUkTSpl_XE74q80pA0JsZ44qKuVM",
  "refresh_expires_at": "2026-10-29T08:09:37.248357297Z",
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
  "session_id": "6bab7c00-e058-465b-bafe-ab302bb0234a",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkwNzcsImlhdCI6MTc5MzIxODE3NywianRpIjoiOGVlNWJmOGUtMTYzYi00NDdkLWE2ZTEtZmI5YWI1ZmRmMGVlIiwic2lkIjoiNmJhYjdjMDAtZTA1OC00NjViLWJhZmUtYWIzMDJiYjAyMzRhIn0.PDqTIj5TyO_g5Q6-BlfTdeuVxyVA-JrfgwiV9f0mKnA",
  "access_expires_at": "2026-10-28T20:24:37.632791511Z",
  "refresh_token": "ijlcQIdv9fgFqZ1kEbdGv2YFCx9nYGIxW_KR-0YR9ms",
  "refresh_expires_at": "2026-10-29T08:09:37.632458619Z",
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
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП",
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
  "command_id": "7097c62e-dc09-4d77-930f-59bb6e7b4b51",
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
  "id": "d2d5aedc-bf49-45a1-ae61-db1a9e663b7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:14:37.981904Z",
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
  "command_id": "78cf5613-94e3-42ec-aa94-1450ce95f44a",
  "quote_id": "d2d5aedc-bf49-45a1-ae61-db1a9e663b7b",
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
  "id": "7eccd386-e0b5-4404-a781-912e89e7223f",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a47f4a93-11c8-4e7d-a1d7-16656c8961c0",
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
  "created_at": "2026-10-28T20:09:38.161794Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7eccd386-e0b5-4404-a781-912e89e7223f` → **200**

```json
{
  "id": "7eccd386-e0b5-4404-a781-912e89e7223f",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a47f4a93-11c8-4e7d-a1d7-16656c8961c0",
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
  "created_at": "2026-10-28T20:09:38.161794Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7eccd386-e0b5-4404-a781-912e89e7223f/cancel` → **200**

```json
{
  "command_id": "866351b5-a775-4986-a768-54dd6e49f3f8",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "7eccd386-e0b5-4404-a781-912e89e7223f",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a47f4a93-11c8-4e7d-a1d7-16656c8961c0",
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
  "created_at": "2026-10-28T20:09:38.161794Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
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
  "command_id": "dce06bd8-c5f5-4f71-ad12-5a2caf6b6b60",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:38Z",
    "sequence": 1793218178904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19a08a59-09cb-42ec-8bd7-fcfa4f950cd8",
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
  "last_heartbeat_at": "2026-10-28T20:09:38.920389Z",
  "last_location_at": "2026-10-28T20:09:38.920389Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19233"
}
```

```json
{
  "challenge_id": "ebe7b952-278d-4585-877a-f11d41bf6b86",
  "expires_at": "2026-10-28T20:14:39.096375095Z",
  "resend_available_at": "2026-10-28T20:09:40.096375095Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "128321",
  "sent_at": "2026-10-28T20:09:39.098505926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebe7b952-278d-4585-877a-f11d41bf6b86",
  "code": "128321",
  "device_ref": "sandbox-19233"
}
```

```json
{
  "session_id": "2d7dc8f1-751d-4868-91be-48f49ac9e0be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTA3OSwiaWF0IjoxNzkzMjE4MTc5LCJqdGkiOiIyMWYyZjg0ZC0zODM0LTRhMTYtOTI4Ni1kNjNmN2NmNDgwZTgiLCJzaWQiOiIyZDdkYzhmMS03NTFkLTQ4NjgtOTFiZS00OGY0OWFjOWUwYmUifQ.vAE0BD2Kz6MMAqQ08Qdu7xnsin50D27F0e3bup_rpmc",
  "access_expires_at": "2026-10-28T20:24:39.283031887Z",
  "refresh_token": "PdFep3hgR0vyaOJZM6JwuLUPPwLsOKmTQUcKL5CxWiA",
  "refresh_expires_at": "2026-11-27T20:09:39.28261296Z",
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
  "command_id": "98070337-c006-444e-9ac4-2c4fcb5bd709",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:39Z",
    "sequence": 1793218179614
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4b05e89b-5344-4e81-9ad8-3176c5211a50",
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
  "last_heartbeat_at": "2026-10-28T20:09:39.630482Z",
  "last_location_at": "2026-10-28T20:09:39.630482Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "479df781-600c-43e5-9f10-ee61ffae1300",
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
  "id": "3ca88235-c628-4cef-b955-516e6b265432",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:14:39.805733Z",
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
  "command_id": "4c2ef692-7ee1-4973-b76d-03ac40d2fcbb",
  "quote_id": "3ca88235-c628-4cef-b955-516e6b265432",
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
  "id": "35ddb530-9162-42a1-9585-06d433553b56",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a47f4a93-11c8-4e7d-a1d7-16656c8961c0",
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
  "created_at": "2026-10-28T20:09:39.98857Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "15b54cb7-4b88-447d-8667-adf370397214",
    "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
    "expires_at": "2026-10-28T20:09:54.991536Z",
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

`POST /api/driver/v1/offers/15b54cb7-4b88-447d-8667-adf370397214/accept` → **200**

```json
{
  "command_id": "43aea544-a2d1-4d2e-9fe6-a7dabed26e7a"
}
```

```json
{
  "id": "1a4557b5-dfa4-4864-bce6-5ed2eddbe4e9",
  "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "18fd7c08-075f-49da-be3a-d8f9962542a8",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "18fd7c08-075f-49da-be3a-d8f9962542a8",
  "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
  "assignment_id": "1a4557b5-dfa4-4864-bce6-5ed2eddbe4e9",
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

`POST /api/driver/v1/trips/18fd7c08-075f-49da-be3a-d8f9962542a8/cancel` → **200**

```json
{
  "command_id": "c659964e-1bf0-4a7c-9b96-b0f7d7d426a5",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "18fd7c08-075f-49da-be3a-d8f9962542a8",
  "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
  "assignment_id": "1a4557b5-dfa4-4864-bce6-5ed2eddbe4e9",
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

`GET /api/rider/v1/orders/35ddb530-9162-42a1-9585-06d433553b56` → **200**

```json
{
  "id": "35ddb530-9162-42a1-9585-06d433553b56",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a47f4a93-11c8-4e7d-a1d7-16656c8961c0",
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
    "id": "1a4557b5-dfa4-4864-bce6-5ed2eddbe4e9",
    "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "18fd7c08-075f-49da-be3a-d8f9962542a8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T20:09:39.98857Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "962a657f-33ba-4390-bc11-64a29fa4ce97",
    "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
    "expires_at": "2026-10-28T20:09:55.701377Z",
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

`POST /api/driver/v1/offers/962a657f-33ba-4390-bc11-64a29fa4ce97/accept` → **200**

```json
{
  "command_id": "d0055cc0-42ae-4b72-87c9-ee8dc85eb407"
}
```

```json
{
  "id": "7aba572e-e4c2-4968-ade1-7c108ec17668",
  "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c264028a-0759-4e27-a2d3-c7cdfc6e4254",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c264028a-0759-4e27-a2d3-c7cdfc6e4254",
  "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
  "assignment_id": "7aba572e-e4c2-4968-ade1-7c108ec17668",
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

`POST /api/driver/v1/trips/c264028a-0759-4e27-a2d3-c7cdfc6e4254/cancel` → **200**

```json
{
  "command_id": "7cb5cab9-742d-4d02-9590-473ce0d0d267",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "c264028a-0759-4e27-a2d3-c7cdfc6e4254",
  "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
  "assignment_id": "7aba572e-e4c2-4968-ade1-7c108ec17668",
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
    "id": "35ddb530-9162-42a1-9585-06d433553b56",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T20:09:39.98857Z",
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
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "7eccd386-e0b5-4404-a781-912e89e7223f",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T20:09:38.161794Z",
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
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/35ddb530-9162-42a1-9585-06d433553b56/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:09:39.989215Z",
      "actor": {
        "type": "CLIENT",
        "id": "a47f4a93-11c8-4e7d-a1d7-16656c8961c0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
        "quote_id": "3ca88235-c628-4cef-b955-516e6b265432",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "73ef446e-6ab4-46eb-91bc-9c126ccba1bb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:09:39.990834Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
        "attempt_id": "a0af1b83-f9e9-4ad5-bad8-d94c89e9ecec",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "73ef446e-6ab4-46eb-91bc-9c126ccba1bb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:09:39.995928Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "15b54cb7-4b88-447d-8667-adf370397214",
        "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "73ef446e-6ab4-46eb-91bc-9c126ccba1bb"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T20:09:40.351751Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "15b54cb7-4b88-447d-8667-adf370397214",
        "order_id": "35ddb530-9162-42a1-9585-06d433553b56",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "1a4557b5-dfa4-4864-bce6-5ed2eddbe4e9"
      },
      "correlation_id": "c1c04e65-0fc2-406e-9cfe-aef39715d90b"
```

Done: orders 7eccd386-e0b5-4404-a781-912e89e7223f, 35ddb530-9162-42a1-9585-06d433553b56.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735546722",
  "device_ref": "sandbox-14510"
}
```

```json
{
  "challenge_id": "6279e6dc-e9d0-433c-b623-0533854f952a",
  "expires_at": "2026-10-28T20:14:42.139866349Z",
  "resend_available_at": "2026-10-28T20:09:43.139866349Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735546722` → **200**

```json
{
  "phone": "+380735546722",
  "audience": "CLIENT",
  "code": "593160",
  "sent_at": "2026-10-28T20:09:42.142199007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6279e6dc-e9d0-433c-b623-0533854f952a",
  "code": "593160",
  "device_ref": "sandbox-14510"
}
```

```json
{
  "session_id": "5afeeca2-6211-4e39-8543-8db63726de65",
  "subject": {
    "type": "CLIENT",
    "id": "e157baf7-d67f-49a9-9844-8b21866babed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTU3YmFmNy1kNjdmLTQ5YTktOTg0NC04YjIxODY2YmFiZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MDgyLCJpYXQiOjE3OTMyMTgxODIsImp0aSI6Ijg2MGUyYjNmLTM3ZTMtNDczYi04MzY1LWY4NGVhYWE0MTJlNSIsInNpZCI6IjVhZmVlY2EyLTYyMTEtNGUzOS04NTQzLThkYjYzNzI2ZGU2NSJ9.YJACUelJ9E_oJsX-m13bHzpsUlOwpVgkkg0yx41kNRg",
  "access_expires_at": "2026-10-28T20:24:42.336759682Z",
  "refresh_token": "DF4vaKZrpFWxvDDWtDR0gDcsGmuCspZWsYxZgozYsS8",
  "refresh_expires_at": "2026-11-27T20:09:42.336314806Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c02b864b-8f4a-4f52-9862-6ab509bbbbe8",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "403748c8-afe1-4771-a237-e1c1da7b3447",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-403748c8-afe1-4771-a237-e1c1da7b3447",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "133419bdda69d80d046d14ed1f02acef",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=403748c8-afe1-4771-a237-e1c1da7b3447",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735546722"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=403748c8-afe1-4771-a237-e1c1da7b3447",
  "expires_at": "2026-10-28T20:39:42.525073Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/403748c8-afe1-4771-a237-e1c1da7b3447` → **200**

```json
{
  "id": "403748c8-afe1-4771-a237-e1c1da7b3447",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T20:39:42.525073Z",
  "card": {
    "id": "daa3173e-da5b-4efa-8689-211ef7d21061",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4499",
    "card_type": "Visa",
    "created_at": "2026-10-28T20:09:42.710695Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "daa3173e-da5b-4efa-8689-211ef7d21061",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4499",
      "card_type": "Visa",
      "created_at": "2026-10-28T20:09:42.710695Z"
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
  "device_ref": "sandbox-3546"
}
```

```json
{
  "challenge_id": "4305ca2a-4cd8-4139-b357-79811bfb2dce",
  "expires_at": "2026-10-28T20:14:43.067346036Z",
  "resend_available_at": "2026-10-28T20:09:44.067346036Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "961044",
  "sent_at": "2026-10-28T20:09:43.069407337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4305ca2a-4cd8-4139-b357-79811bfb2dce",
  "code": "961044",
  "device_ref": "sandbox-3546"
}
```

```json
{
  "session_id": "8bfda270-8859-4de0-b224-8422d851e17c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTA4MywiaWF0IjoxNzkzMjE4MTgzLCJqdGkiOiJkMWM3YjQ4My0wYWExLTRkMWQtODA5YS02NzA2NTg3MTdjYmMiLCJzaWQiOiI4YmZkYTI3MC04ODU5LTRkZTAtYjIyNC04NDIyZDg1MWUxN2MifQ.e1DFwh1cjxQ6J24aZ-AJHae123astFitGaO6yE-W5UY",
  "access_expires_at": "2026-10-28T20:24:43.257673985Z",
  "refresh_token": "R9iM1F1JNAFjHpW06AraZ9bDAn5q6E7lFj1DZTVD9rY",
  "refresh_expires_at": "2026-11-27T20:09:43.257101892Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4b05e89b-5344-4e81-9ad8-3176c5211a50",
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
  "last_heartbeat_at": "2026-10-28T20:09:39.630482Z",
  "last_location_at": "2026-10-28T20:09:39.630482Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b05e89b-5344-4e81-9ad8-3176c5211a50/handover` → **200**

```json
{
  "command_id": "4b781c37-1173-4bcc-9c28-e59829391c81",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4b05e89b-5344-4e81-9ad8-3176c5211a50",
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
  "last_heartbeat_at": "2026-10-28T20:09:39.630482Z",
  "last_location_at": "2026-10-28T20:09:39.630482Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b05e89b-5344-4e81-9ad8-3176c5211a50/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:43Z",
    "sequence": 1793218183756
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4b05e89b-5344-4e81-9ad8-3176c5211a50",
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
  "last_heartbeat_at": "2026-10-28T20:09:43.772495Z",
  "last_location_at": "2026-10-28T20:09:43.772495Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "543a7ba3-e884-4c00-8e0e-9db768c6045b",
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
  "id": "ce42f40f-de3b-466a-b58b-d7f96daaae1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:14:43.945493Z",
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
  "command_id": "2c06d8dd-6212-41ef-92f9-fdfd75910dca",
  "quote_id": "ce42f40f-de3b-466a-b58b-d7f96daaae1e",
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
  "payment_method": "CARD",
  "wallet_minor": 0
}
```

```json
{
  "id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
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
  "created_at": "2026-10-28T20:09:44.130583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f` → **200**

```json
{
  "id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
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
  "created_at": "2026-10-28T20:09:44.130583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f` → **200**

```json
{
  "id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
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
  "created_at": "2026-10-28T20:09:44.130583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "be12b7fd-8cdc-4a5a-a296-e4a9afb3680d",
    "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
    "expires_at": "2026-10-28T20:09:59.439597Z",
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

`POST /api/driver/v1/offers/be12b7fd-8cdc-4a5a-a296-e4a9afb3680d/accept` → **200**

```json
{
  "command_id": "787b79ce-d7a6-4365-a19f-a95a17cc2738"
}
```

```json
{
  "id": "e9667507-2f63-4215-94ad-88d1c45f960b",
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "741615cc-dfc2-457a-8905-d1ab2dd6ea38",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "741615cc-dfc2-457a-8905-d1ab2dd6ea38",
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "assignment_id": "e9667507-2f63-4215-94ad-88d1c45f960b",
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

`POST /api/driver/v1/work-sessions/4b05e89b-5344-4e81-9ad8-3176c5211a50/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:46Z",
    "sequence": 1793218186170
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4b05e89b-5344-4e81-9ad8-3176c5211a50",
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
  "last_heartbeat_at": "2026-10-28T20:09:46.185857Z",
  "last_location_at": "2026-10-28T20:09:46.185857Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/741615cc-dfc2-457a-8905-d1ab2dd6ea38/arrive` → **200**

```json
{
  "command_id": "0b1267fd-f001-4928-9d72-469b36d25f24",
  "expected_version": 0
}
```

```json
{
  "id": "741615cc-dfc2-457a-8905-d1ab2dd6ea38",
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "assignment_id": "e9667507-2f63-4215-94ad-88d1c45f960b",
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
  "arrived_at": "2026-10-28T20:09:46.359884Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/741615cc-dfc2-457a-8905-d1ab2dd6ea38/start` → **200**

```json
{
  "command_id": "2b77852a-9777-490e-9dd3-c8cdedad5c7f",
  "expected_version": 1
}
```

```json
{
  "id": "741615cc-dfc2-457a-8905-d1ab2dd6ea38",
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "assignment_id": "e9667507-2f63-4215-94ad-88d1c45f960b",
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
  "arrived_at": "2026-10-28T20:09:46.359884Z",
  "started_at": "2026-10-28T20:09:46.537533Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/741615cc-dfc2-457a-8905-d1ab2dd6ea38/complete` → **200**

```json
{
  "command_id": "bc8db2ac-cc1e-4620-9cd5-1bf0c34490de",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:09:46Z",
  "cash_received": true
}
```

```json
{
  "id": "741615cc-dfc2-457a-8905-d1ab2dd6ea38",
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "assignment_id": "e9667507-2f63-4215-94ad-88d1c45f960b",
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
  "arrived_at": "2026-10-28T20:09:46.359884Z",
  "started_at": "2026-10-28T20:09:46.537533Z",
  "completed_at": "2026-10-28T20:09:46.72255Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f` → **200**

```json
{
  "id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
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
    "id": "e9667507-2f63-4215-94ad-88d1c45f960b",
    "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "741615cc-dfc2-457a-8905-d1ab2dd6ea38",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:09:44.130583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f` → **200**

```json
{
  "id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
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
    "id": "e9667507-2f63-4215-94ad-88d1c45f960b",
    "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "741615cc-dfc2-457a-8905-d1ab2dd6ea38",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:09:44.130583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f` → **200**

```json
{
  "id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
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
    "id": "e9667507-2f63-4215-94ad-88d1c45f960b",
    "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "741615cc-dfc2-457a-8905-d1ab2dd6ea38",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:09:44.130583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
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

`GET /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f/tip` → **200**

```json
{
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
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
  "available_until": "2026-10-29T20:09:46.72255Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f/tip` → **201**

```json
{
  "command_id": "42cdb777-5bc0-4d9c-b57c-8a4830e3023d",
  "amount_minor": 2500
}
```

```json
{
  "id": "a5099b89-85ca-446f-a063-292057ac4be2",
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T20:09:49.77617Z"
}
```

`GET /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f/tip` → **200**

```json
{
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
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
  "available_until": "2026-10-29T20:09:46.72255Z",
  "open": false,
  "tip": {
    "id": "a5099b89-85ca-446f-a063-292057ac4be2",
    "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T20:09:49.77617Z"
  }
}
```

`GET /api/rider/v1/orders/e27f2b17-5a88-4d08-9278-b02289c1fe6f/tip` → **200**

```json
{
  "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
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
  "available_until": "2026-10-29T20:09:46.72255Z",
  "open": false,
  "tip": {
    "id": "a5099b89-85ca-446f-a063-292057ac4be2",
    "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T20:09:49.77617Z"
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
      "id": "06d61fe2-9548-42cc-ac3b-38a6beb15119",
      "at": "2026-10-28T20:09:47.483177Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
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
      "id": "248b6840-3288-4ab5-aa2c-b4bd16fec454",
      "at": "2026-10-28T20:09:51.524584Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
      "counterpart_id": null
    },
    {
      "id": "06d61fe2-9548-42cc-ac3b-38a6beb15119",
      "at": "2026-10-28T20:09:47.483177Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "344e8cc2-0b85-4eef-904d-7449165b42e7",
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
  "id": "30b53281-683f-459b-a8db-be0608177b07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:14:52.661639Z",
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

## Bonuses cover the fare; 300 minor units remain for a larger card tip

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
  "session_id": "e57b20ce-8acc-40c4-8dd9-b8c95a8ffaac",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkwOTMsImlhdCI6MTc5MzIxODE5MywianRpIjoiMjcxNDNjNTctMWE2My00YzVhLWE4NGUtZjgxZjJiYzQ1Y2Y3Iiwic2lkIjoiZTU3YjIwY2UtOGFjYy00MGM0LThkZDktYjhjOTVhOGZmYWFjIn0.vqJpBRA5T--uscpaZT-QJcm-A27LJMIgF8gBrNCNO-o",
  "access_expires_at": "2026-10-28T20:24:53.035654501Z",
  "refresh_token": "VBSu8YO5jRTm2B7iLblbkOCzp3tw7llDGkrjKvEaCho",
  "refresh_expires_at": "2026-10-29T08:09:53.035244573Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735546722` → **200**

```json
{
  "client_id": "e157baf7-d67f-49a9-9844-8b21866babed"
}
```

`POST /api/admin/v1/rider-wallets/e157baf7-d67f-49a9-9844-8b21866babed/top-ups` → **201**

```json
{
  "command_id": "acd7fc12-b1eb-49c3-a988-dbc16fd8d8d2",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 0,
      "available_minor": 16597
    }
  ],
  "entries": [
    {
      "id": "6c45a55e-ca1e-49a1-8dd8-a0c347562550",
      "at": "2026-10-28T20:09:53.367967Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0253ac96-4b8e-448a-98ed-bd78d44aa5e0",
  "quote_id": "30b53281-683f-459b-a8db-be0608177b07",
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
  "payment_method": "CARD",
  "wallet_minor": 16297
}
```

```json
{
  "id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T20:09:53.546756Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342` → **200**

```json
{
  "id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T20:09:53.546756Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "01f6ce55-bd0f-4f23-8310-3bef51072113",
    "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
    "expires_at": "2026-10-28T20:10:08.549649Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CASH",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 11
  }
]
```

`POST /api/driver/v1/offers/01f6ce55-bd0f-4f23-8310-3bef51072113/accept` → **200**

```json
{
  "command_id": "82bfe721-304e-4fd3-9088-c0cb30b176b1"
}
```

```json
{
  "id": "a52361a5-78de-4ad2-aa31-2d947e384391",
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d7908aec-1e8c-4a06-8bcc-934c13bcad5b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d7908aec-1e8c-4a06-8bcc-934c13bcad5b",
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
  "assignment_id": "a52361a5-78de-4ad2-aa31-2d947e384391",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4b05e89b-5344-4e81-9ad8-3176c5211a50/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:09:54Z",
    "sequence": 1793218194401
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4b05e89b-5344-4e81-9ad8-3176c5211a50",
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
  "last_heartbeat_at": "2026-10-28T20:09:54.417277Z",
  "last_location_at": "2026-10-28T20:09:54.417277Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d7908aec-1e8c-4a06-8bcc-934c13bcad5b/arrive` → **200**

```json
{
  "command_id": "b3d64bdc-34b7-48ae-a243-e9c713d213cd",
  "expected_version": 0
}
```

```json
{
  "id": "d7908aec-1e8c-4a06-8bcc-934c13bcad5b",
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
  "assignment_id": "a52361a5-78de-4ad2-aa31-2d947e384391",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T20:09:54.600372Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d7908aec-1e8c-4a06-8bcc-934c13bcad5b/start` → **200**

```json
{
  "command_id": "3851716b-ae04-4038-b917-433fffa3b4f2",
  "expected_version": 1
}
```

```json
{
  "id": "d7908aec-1e8c-4a06-8bcc-934c13bcad5b",
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
  "assignment_id": "a52361a5-78de-4ad2-aa31-2d947e384391",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T20:09:54.600372Z",
  "started_at": "2026-10-28T20:09:54.77824Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d7908aec-1e8c-4a06-8bcc-934c13bcad5b/complete` → **200**

```json
{
  "command_id": "1665083a-4d58-4796-b562-89568f07c96f",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:09:54Z",
  "cash_received": true
}
```

```json
{
  "id": "d7908aec-1e8c-4a06-8bcc-934c13bcad5b",
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
  "assignment_id": "a52361a5-78de-4ad2-aa31-2d947e384391",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T20:09:54.600372Z",
  "started_at": "2026-10-28T20:09:54.77824Z",
  "completed_at": "2026-10-28T20:09:54.965647Z",
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e157baf7-d67f-49a9-9844-8b21866babed",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 16297,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "6c45a55e-ca1e-49a1-8dd8-a0c347562550",
      "at": "2026-10-28T20:09:53.367967Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_id": null
    }
  ]
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16352,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342/tip` → **200**

```json
{
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
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
  "method": "WALLET",
  "available_until": "2026-10-29T20:09:54.965647Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342/tip` → **201**

```json
{
  "command_id": "f09a547a-91c3-4ef6-b4f2-ec70e2288a51",
  "amount_minor": 2500
}
```

```json
{
  "id": "3db04128-cb28-46b4-bf83-208a1b895284",
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T20:09:55.690027Z"
}
```

`GET /api/rider/v1/orders/0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342/tip` → **200**

```json
{
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
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
  "method": "WALLET",
  "available_until": "2026-10-29T20:09:54.965647Z",
  "open": false,
  "tip": {
    "id": "3db04128-cb28-46b4-bf83-208a1b895284",
    "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T20:09:55.690027Z"
  }
}
```

`GET /api/rider/v1/orders/0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342/tip` → **200**

```json
{
  "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
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
  "method": "WALLET",
  "available_until": "2026-10-29T20:09:54.965647Z",
  "open": false,
  "tip": {
    "id": "3db04128-cb28-46b4-bf83-208a1b895284",
    "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T20:09:55.690027Z"
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "75ddfcfd-6b66-4a6b-b187-72e5a73ba1b9",
      "at": "2026-10-28T20:09:55.56978Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
      "counterpart_id": null
    },
    {
      "id": "248b6840-3288-4ab5-aa2c-b4bd16fec454",
      "at": "2026-10-28T20:09:51.524584Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
      "counterpart_id": null
    },
    {
      "id": "06d61fe2-9548-42cc-ac3b-38a6beb15119",
      "at": "2026-10-28T20:09:47.483177Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "12c7ada5-4ce7-4da3-9dca-fb1ee9c3d3a9",
      "at": "2026-10-28T20:09:57.593311Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
      "counterpart_id": null
    },
    {
      "id": "75ddfcfd-6b66-4a6b-b187-72e5a73ba1b9",
      "at": "2026-10-28T20:09:55.56978Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342",
      "counterpart_id": null
    },
    {
      "id": "248b6840-3288-4ab5-aa2c-b4bd16fec454",
      "at": "2026-10-28T20:09:51.524584Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
      "counterpart_id": null
    },
    {
      "id": "06d61fe2-9548-42cc-ac3b-38a6beb15119",
      "at": "2026-10-28T20:09:47.483177Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e27f2b17-5a88-4d08-9278-b02289c1fe6f",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4b05e89b-5344-4e81-9ad8-3176c5211a50",
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
  "last_heartbeat_at": "2026-10-28T20:09:54.417277Z",
  "last_location_at": "2026-10-28T20:09:54.417277Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b05e89b-5344-4e81-9ad8-3176c5211a50/close` → **200**

```json
{
  "command_id": "b5489ac6-030e-4812-ab9b-ec1fd6527269",
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

Done: card order 0e3a2a9c-8cc9-4f28-b662-a44aa7ed3342.

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

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734775368",
  "device_ref": "sandbox-8536"
}
```

```json
{
  "challenge_id": "9f4642c3-18c5-4487-8be4-9a8491ae9a1a",
  "expires_at": "2026-10-28T20:14:59.140817457Z",
  "resend_available_at": "2026-10-28T20:10:00.140817457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734775368` → **200**

```json
{
  "phone": "+380734775368",
  "audience": "CLIENT",
  "code": "232509",
  "sent_at": "2026-10-28T20:09:59.143227232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f4642c3-18c5-4487-8be4-9a8491ae9a1a",
  "code": "232509",
  "device_ref": "sandbox-8536"
}
```

```json
{
  "session_id": "9db6c3f5-2f24-4d4f-b4dc-1d1b1173b5fa",
  "subject": {
    "type": "CLIENT",
    "id": "8f14883c-de51-4ed5-9a97-2da2d2aea845"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjE0ODgzYy1kZTUxLTRlZDUtOWE5Ny0yZGEyZDJhZWE4NDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MDk5LCJpYXQiOjE3OTMyMTgxOTksImp0aSI6IjgzOTdiNjhlLTNkM2UtNDE0NS05ZmIzLTAyMDU0NDczYjI5OSIsInNpZCI6IjlkYjZjM2Y1LTJmMjQtNGQ0Zi1iNGRjLTFkMWIxMTczYjVmYSJ9.S2DlOprpVLqjyTwnUwar3ip6OKOCHsaD092QNC5MvLo",
  "access_expires_at": "2026-10-28T20:24:59.329653884Z",
  "refresh_token": "h3LQcIO2o6GnOBB3aaSYYy3rLx_vXTuDq3B_XQVKc3M",
  "refresh_expires_at": "2026-11-27T20:09:59.329177696Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "ee902e5c-eb7a-4f15-ba5a-b83a8611c9b9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "07eff946-364a-4250-b16a-678c80a65626",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-07eff946-364a-4250-b16a-678c80a65626",
    "orderDate": "1793218199",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "cfaec0e376363f1d72eae33ac4a34e87",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=07eff946-364a-4250-b16a-678c80a65626",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734775368"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=07eff946-364a-4250-b16a-678c80a65626",
  "created_at": "2026-10-28T20:09:59.500152Z",
  "expires_at": "2026-10-28T20:39:59.500152Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/07eff946-364a-4250-b16a-678c80a65626` → **200**

```json
{
  "id": "07eff946-364a-4250-b16a-678c80a65626",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T20:09:59.500152Z",
  "expires_at": "2026-10-28T20:39:59.500152Z",
  "completed_at": "2026-10-28T20:09:59.674076Z",
  "masked_pan": "41****2839",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8f14883c-de51-4ed5-9a97-2da2d2aea845",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8f14883c-de51-4ed5-9a97-2da2d2aea845",
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
      "id": "a3a39ca2-5b1e-4004-b0f3-018484f1ac78",
      "at": "2026-10-28T20:10:00.610828Z",
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
  "client_id": "8f14883c-de51-4ed5-9a97-2da2d2aea845",
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
      "id": "a3a39ca2-5b1e-4004-b0f3-018484f1ac78",
      "at": "2026-10-28T20:10:00.610828Z",
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
  "device_ref": "sandbox-21401"
}
```

```json
{
  "challenge_id": "f3c8a3b9-4852-4a38-aad0-3dd4a2f28ae6",
  "expires_at": "2026-10-28T20:15:01.356620951Z",
  "resend_available_at": "2026-10-28T20:10:02.356620951Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "169113",
  "sent_at": "2026-10-28T20:10:01.360042747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3c8a3b9-4852-4a38-aad0-3dd4a2f28ae6",
  "code": "169113",
  "device_ref": "sandbox-21401"
}
```

```json
{
  "session_id": "cde82246-90cd-41d0-a3d2-76243b4111e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTEwMSwiaWF0IjoxNzkzMjE4MjAxLCJqdGkiOiIwOGU1ZWFjZC0wYjE3LTRjNDYtODExZC03ZTExZTI1OWJiZmQiLCJzaWQiOiJjZGU4MjI0Ni05MGNkLTQxZDAtYTNkMi03NjI0M2I0MTExZTkifQ.mUJMKWGjKWTRIbqdLK3OO0NgjqSgVii7rseFsfGF1IM",
  "access_expires_at": "2026-10-28T20:25:01.550813907Z",
  "refresh_token": "yRE8kYP8ZIqpOJ-LVj8uQC0uVX5JFYeVgBeC8U1w36U",
  "refresh_expires_at": "2026-11-27T20:10:01.550357659Z",
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
  "command_id": "98f4af4b-6c4e-4208-b445-b41af6e3cdad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "0e6178bc-bbbb-411a-aeca-12572092d45a",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0e6178bc-bbbb-411a-aeca-12572092d45a",
    "orderDate": "1793218201",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "ab86ff3d14a5bc6cd413de6688f913e2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0e6178bc-bbbb-411a-aeca-12572092d45a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0e6178bc-bbbb-411a-aeca-12572092d45a",
  "created_at": "2026-10-28T20:10:01.88816Z",
  "expires_at": "2026-10-28T20:40:01.88816Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/0e6178bc-bbbb-411a-aeca-12572092d45a` → **200**

```json
{
  "id": "0e6178bc-bbbb-411a-aeca-12572092d45a",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T20:10:01.88816Z",
  "expires_at": "2026-10-28T20:40:01.88816Z",
  "completed_at": "2026-10-28T20:10:02.056488Z",
  "masked_pan": "41****4288",
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
      "id": "cfee4abf-0ecc-48f7-93f8-98b2f48fee89",
      "at": "2026-10-28T20:10:02.626049Z",
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
  "command_id": "2e7fb3b2-27d1-4d33-8fbd-2fae916a2e90",
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
  "correlation_id": "96a05d10-33a3-4b04-89fb-9a3236fe0977"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: city-operations

## Staff open Warsaw's operations (version 0 until the first change: around the clock, every method)

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
  "session_id": "ee1e1739-3df2-4878-909f-22372e6e04c0",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMDMsImlhdCI6MTc5MzIxODIwMywianRpIjoiNDk3OGJkNDQtMmZjMy00NDY3LTk1N2UtNmFhYmMyMjk2MjJiIiwic2lkIjoiZWUxZTE3MzktM2RmMi00ODc4LTkwOWYtMjIzNzJlNmUwNGMwIn0.qwTTkvNxbrTV848P_tNyyP8YZiMjHdaohsoPXNpovtU",
  "access_expires_at": "2026-10-28T20:25:03.94068329Z",
  "refresh_token": "5_f5LdJf5_InV6J1UinJSdipogFDsjuAYtiC9j3g41s",
  "refresh_expires_at": "2026-10-29T08:10:03.940305775Z",
  "password_change_required": false
}
```

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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600306331",
  "device_ref": "sandbox-27824"
}
```

```json
{
  "challenge_id": "ee15d900-e0d1-4224-ac6c-40fd96f44f23",
  "expires_at": "2026-10-28T20:15:04.455954219Z",
  "resend_available_at": "2026-10-28T20:10:05.455954219Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600306331` → **200**

```json
{
  "phone": "+48600306331",
  "audience": "CLIENT",
  "code": "561851",
  "sent_at": "2026-10-28T20:10:04.457960591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee15d900-e0d1-4224-ac6c-40fd96f44f23",
  "code": "561851",
  "device_ref": "sandbox-27824"
}
```

```json
{
  "session_id": "22f34675-0da1-4d15-9842-2d61147b2718",
  "subject": {
    "type": "CLIENT",
    "id": "f5a9f9b7-4e91-44ba-afb6-46c6911c8691"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWE5ZjliNy00ZTkxLTQ0YmEtYWZiNi00NmM2OTExYzg2OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTA0LCJpYXQiOjE3OTMyMTgyMDQsImp0aSI6ImIzM2U4YzZlLTU2YzQtNDU3Zi04ZTI5LWZjODUyZTI3NjAyOCIsInNpZCI6IjIyZjM0Njc1LTBkYTEtNGQxNS05ODQyLTJkNjExNDdiMjcxOCJ9.2r-4-HmPiJoh34GgMoMU0T-zNFm2ZywV_zS8S2xiZ6Y",
  "access_expires_at": "2026-10-28T20:25:04.642940436Z",
  "refresh_token": "8GB7mlBl9vdMDtXMEPs4LF72YoDWQrY87jeoCy_nWKc",
  "refresh_expires_at": "2026-11-27T20:10:04.642647214Z",
  "account_created": true
}
```

## Staff pause new orders: a reason is required

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **400**

```json
{
  "command_id": "45c08f29-1983-4abc-b160-7087a083c1a8",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6a53c1db-121b-4611-8168-0ffcaaf0b0ed",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **200**

```json
{
  "command_id": "4aa92d35-93fa-4106-a31d-1febb72ebb88",
  "expected_version": 0,
  "reason": "Storm warning"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-28T20:10:05.333975558Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": true
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28be48ee-eb33-44a5-9c37-63c396bccb1a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "38cb5a2e-4c9b-4c9c-81be-ec2eac91f03f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:05.681974Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "84a3d352-d50d-4ce3-a171-0f2108e4dec1",
  "quote_id": "38cb5a2e-4c9b-4c9c-81be-ec2eac91f03f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City paused",
  "type": "https://errors.blizz.taxi/city-paused",
  "code": "CITY_PAUSED",
  "correlation_id": "3821362b-b878-4e7f-89a4-076cc233b358"
}
```

## Staff lift the pause

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-28T20:10:05.333976Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "14905b51-d13d-4e2f-8f4c-5d935bd93bb9",
  "expected_version": 1,
  "reason": "Storm over"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

## Warsaw offers only cards for now: a cash order is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "daa8c9ab-11a4-4525-92bb-db8b63228692",
  "expected_version": 2,
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "reason": "Cash collection paused"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2fcde52b-7517-4bb5-8a84-1baae9202773",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "c9022f69-bcfa-4f04-8082-893dc60963ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:06.745013Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "873a52f4-ae27-4118-98b5-a54841244e85",
  "quote_id": "c9022f69-bcfa-4f04-8082-893dc60963ca",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "cd79f8fd-925a-4faa-b13d-206a88f70020"
}
```

## Working hours that do not include now: an order for now is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "5f040a63-2539-4830-bb48-1be874e10993",
  "expected_version": 3,
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "23:00",
      "to": "00:00"
    }
  ],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "One hour a day"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "23:00",
      "to": "00:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "01a1b8ce-e0d5-45db-aab5-2e3b46fb71a3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "b35c9d7d-2fb0-4a02-afa4-40773a8af6db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:07.469021Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "b458e3af-5f6c-4233-8ce5-2d6bc0b8b0a7",
  "quote_id": "b35c9d7d-2fb0-4a02-afa4-40773a8af6db",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City closed",
  "type": "https://errors.blizz.taxi/city-closed",
  "code": "CITY_CLOSED",
  "correlation_id": "8f8e43e6-5a59-4016-855b-74c67b47f0e6"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "9d6303c0-cc27-439d-90a7-7580f0123928",
  "expected_version": 0,
  "reason": "stale"
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "b462878c-f9a7-44c1-a804-48ce28e275f4"
}
```

Done: paused and resumed, a method not offered and closed hours refused orders; Warsaw is restored on exit.

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "23:00",
      "to": "00:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "c49abd39-1663-4398-9451-c28388beaf67",
  "expected_version": 4,
  "working_hours": [],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "Sandbox clean-up"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 5
}
```

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671887505",
  "device_ref": "sandbox-23360"
}
```

```json
{
  "challenge_id": "da928386-a1d8-4c60-afb5-e3fe4b96eb68",
  "expires_at": "2026-10-28T20:15:08.359533239Z",
  "resend_available_at": "2026-10-28T20:10:09.359533239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671887505` → **200**

```json
{
  "phone": "+380671887505",
  "audience": "CLIENT",
  "code": "232780",
  "sent_at": "2026-10-28T20:10:08.361153445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da928386-a1d8-4c60-afb5-e3fe4b96eb68",
  "code": "232780",
  "device_ref": "sandbox-23360"
}
```

```json
{
  "session_id": "9fdb7542-052f-490f-af85-b090a600bfbd",
  "subject": {
    "type": "CLIENT",
    "id": "d80c8cf7-974c-46a4-9f49-954d93f0927f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkODBjOGNmNy05NzRjLTQ2YTQtOWY0OS05NTRkOTNmMDkyN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTA4LCJpYXQiOjE3OTMyMTgyMDgsImp0aSI6IjA2YTNmNjgzLTAzMGEtNDZmYi05M2M1LWUzOGZiZDJhNDllZSIsInNpZCI6IjlmZGI3NTQyLTA1MmYtNDkwZi1hZjg1LWIwOTBhNjAwYmZiZCJ9.Rcef6iP-WQxY9MZH9HEIZAx3Sz6EESk-HMq2j2CxbkI",
  "access_expires_at": "2026-10-28T20:25:08.541117011Z",
  "refresh_token": "O6cUapeE4RWDY_a-sMO6-27_wO_q7iqaQ4Ivxc3h7A4",
  "refresh_expires_at": "2026-11-27T20:10:08.540834144Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d80c8cf7-974c-46a4-9f49-954d93f0927f",
  "session_id": "9fdb7542-052f-490f-af85-b090a600bfbd",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "75809b35-4e25-42da-b4a7-01101915aeba",
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
  "id": "8f0b4a53-4712-4e95-954a-85d05ba99c38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:08.881057Z",
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
  "challenge_id": "fc8f9853-8eab-4962-a547-f6be5a58e191",
  "expires_at": "2026-10-28T20:15:11.057579722Z",
  "resend_available_at": "2026-10-28T20:10:12.057579722Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671887505` → **200**

```json
{
  "phone": "+380671887505",
  "audience": "CLIENT",
  "code": "402738",
  "sent_at": "2026-10-28T20:10:11.059020878Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "21e6e467-9f91-48d8-9f30-db543fae8f52",
  "challenge_id": "fc8f9853-8eab-4962-a547-f6be5a58e191",
  "otp_code": "402738"
}
```

```json
{
  "client_id": "d80c8cf7-974c-46a4-9f49-954d93f0927f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T20:10:11.249644087Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "3a8f6c0b-c39b-4105-a271-15ecbc27ba0c",
  "quote_id": "8f0b4a53-4712-4e95-954a-85d05ba99c38",
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
  "correlation_id": "8fea2a21-e254-4a47-92e6-56a73dfc9306"
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
  "session_id": "9e56bd90-15b6-4bec-acb2-5c4c99aaad1b",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMTEsImlhdCI6MTc5MzIxODIxMSwianRpIjoiYzRlMTUyNWItNmExMC00OGMzLThkMGItODkzMWNmZTQwODI3Iiwic2lkIjoiOWU1NmJkOTAtMTViNi00YmVjLWFjYjItNWM0Yzk5YWFhZDFiIn0.ZWVQqMBh8M0UTNIMhr1by8WtePwxyXP7_mnEGynHJAI",
  "access_expires_at": "2026-10-28T20:25:11.792670357Z",
  "refresh_token": "hWFageZMpamyMZmGvByivAOEzYK-hCqwI6xTtcxIP-4",
  "refresh_expires_at": "2026-10-29T08:10:11.792377895Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d80c8cf7-974c-46a4-9f49-954d93f0927f",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T20:10:11.249644Z",
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

`POST /api/admin/v1/client-deletions/d80c8cf7-974c-46a4-9f49-954d93f0927f/complete` → **200**

```json
{
  "command_id": "b730e2f4-5007-459d-af44-a2b2146a413d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d80c8cf7-974c-46a4-9f49-954d93f0927f",
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
  "correlation_id": "2b6c8b95-6c03-460b-8dff-2a6db5e016a1"
}
```

Done: client d80c8cf7-974c-46a4-9f49-954d93f0927f anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668289953",
  "device_ref": "sandbox-18666"
}
```

```json
{
  "challenge_id": "c0e0a671-a22e-499b-bd84-4901966e22a7",
  "expires_at": "2026-10-28T20:15:12.491068152Z",
  "resend_available_at": "2026-10-28T20:10:13.491068152Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668289953` → **200**

```json
{
  "phone": "+380668289953",
  "audience": "CLIENT",
  "code": "815513",
  "sent_at": "2026-10-28T20:10:12.492911109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0e0a671-a22e-499b-bd84-4901966e22a7",
  "code": "815513",
  "device_ref": "sandbox-18666"
}
```

```json
{
  "session_id": "34f65e9f-cc76-44d6-af94-aee05aa727c1",
  "subject": {
    "type": "CLIENT",
    "id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODllMDMyYy03NWI2LTQ4ZDMtYTZjYy03ZDhiZjY4ZTk4ZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTEyLCJpYXQiOjE3OTMyMTgyMTIsImp0aSI6IjAzZjU0YThlLTc0OTMtNGIwYi04NmI0LWY3MGQwZmQ5MDhhOCIsInNpZCI6IjM0ZjY1ZTlmLWNjNzYtNDRkNi1hZjk0LWFlZTA1YWE3MjdjMSJ9.YmLuukY9csGyzaWpYkcYu2DhUCWfROxEjwUszjTQPAM",
  "access_expires_at": "2026-10-28T20:25:12.698834838Z",
  "refresh_token": "ebRonHdExmuhpMbQKu3eQ4J1YyT9OzzLW3Tm0y3VLIs",
  "refresh_expires_at": "2026-11-27T20:10:12.698443287Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8",
  "session_id": "34f65e9f-cc76-44d6-af94-aee05aa727c1",
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
  "session_id": "23e9c5a4-1fdd-4b34-85c0-61e6a3831057",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMTMsImlhdCI6MTc5MzIxODIxMywianRpIjoiMmEzNTc5N2EtYzRhNy00OGIxLTg0Y2QtNTYwOTliN2VhNmE3Iiwic2lkIjoiMjNlOWM1YTQtMWZkZC00YjM0LTg1YzAtNjFlNmEzODMxMDU3In0.8QXcLhoDhi7RXufW9nrrrl1y-YLtXVrS-2gzBD-3F2g",
  "access_expires_at": "2026-10-28T20:25:13.228441272Z",
  "refresh_token": "_rSYxrZ56CxJTUbc2rKyeBta2lCD28lDmA_Di9xttfI",
  "refresh_expires_at": "2026-10-29T08:10:13.22810889Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8289953&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8",
      "phone": "+380668289953",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T20:10:12.687253Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a89e032c-75b6-48d3-a6cc-7d8bf68e98f8` → **200**

```json
{
  "client": {
    "id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8",
    "phone": "+380668289953",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T20:10:12.687253Z",
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

`POST /api/admin/v1/clients/a89e032c-75b6-48d3-a6cc-7d8bf68e98f8/block` → **400**

```json
{
  "command_id": "9d3b9910-db43-4456-bb5c-89c517856dba",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a89e032c-75b6-48d3-a6cc-7d8bf68e98f8/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "18b42309-9f6a-44a1-aa84-f361fbb09616",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a89e032c-75b6-48d3-a6cc-7d8bf68e98f8/block` → **200**

```json
{
  "command_id": "af52feb4-c1df-4403-bb6f-4a797b6ae115",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8",
  "phone": "+380668289953",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T20:10:12.687253Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T20:10:13.991096Z",
    "by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
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
  "correlation_id": "b6a1d287-114c-420f-aca0-5bdb8a46f94f"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668289953",
  "device_ref": "sandbox-8861"
}
```

```json
{
  "challenge_id": "121b2c22-f124-4197-a057-29b0e646ac58",
  "expires_at": "2026-10-28T20:15:16.329321264Z",
  "resend_available_at": "2026-10-28T20:10:17.329321264Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668289953` → **200**

```json
{
  "phone": "+380668289953",
  "audience": "CLIENT",
  "code": "366492",
  "sent_at": "2026-10-28T20:10:16.331202253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "121b2c22-f124-4197-a057-29b0e646ac58",
  "code": "366492",
  "device_ref": "sandbox-8861"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "33dc69b3-855f-4bad-9486-1d94f3fcf7b6"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a89e032c-75b6-48d3-a6cc-7d8bf68e98f8` → **200**

```json
{
  "client": {
    "id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8",
    "phone": "+380668289953",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T20:10:12.687253Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T20:10:13.991096Z",
      "by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
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

`POST /api/admin/v1/clients/a89e032c-75b6-48d3-a6cc-7d8bf68e98f8/unblock` → **200**

```json
{
  "command_id": "a765e90d-d44c-4eb6-a61b-98e119722dcf",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8",
  "phone": "+380668289953",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T20:10:12.687253Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668289953",
  "device_ref": "sandbox-30836"
}
```

```json
{
  "challenge_id": "d408a273-d36b-4830-bea5-7610da40a4a7",
  "expires_at": "2026-10-28T20:15:19.050881219Z",
  "resend_available_at": "2026-10-28T20:10:20.050881219Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668289953` → **200**

```json
{
  "phone": "+380668289953",
  "audience": "CLIENT",
  "code": "008773",
  "sent_at": "2026-10-28T20:10:19.052400747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d408a273-d36b-4830-bea5-7610da40a4a7",
  "code": "008773",
  "device_ref": "sandbox-30836"
}
```

```json
{
  "session_id": "62efab86-0b80-4dae-a71e-23d8f364af45",
  "subject": {
    "type": "CLIENT",
    "id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODllMDMyYy03NWI2LTQ4ZDMtYTZjYy03ZDhiZjY4ZTk4ZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTE5LCJpYXQiOjE3OTMyMTgyMTksImp0aSI6IjNkMTA3ZDlhLTZkZjgtNDA4OS1hMWZjLTNmY2M5YWNlMmI0MyIsInNpZCI6IjYyZWZhYjg2LTBiODAtNGRhZS1hNzFlLTIzZDhmMzY0YWY0NSJ9.-rdKYy548Si28jsh4Nwl1lRF-U0SfL9c6DhIYqSlE4o",
  "access_expires_at": "2026-10-28T20:25:19.237483789Z",
  "refresh_token": "bCkLwmF5Rv3YQC5kva62dVq6mFXip2Aj_wawVe7tPv8",
  "refresh_expires_at": "2026-11-27T20:10:19.237106489Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a89e032c-75b6-48d3-a6cc-7d8bf68e98f8",
  "session_id": "62efab86-0b80-4dae-a71e-23d8f364af45",
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
  "phone": "+380666904892",
  "device_ref": "sandbox-27722"
}
```

```json
{
  "challenge_id": "17ccec35-6ad9-4fef-a847-9aa27b3dfe15",
  "expires_at": "2026-10-28T20:15:19.572074626Z",
  "resend_available_at": "2026-10-28T20:10:20.572074626Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666904892` → **200**

```json
{
  "phone": "+380666904892",
  "audience": "CLIENT",
  "code": "792129",
  "sent_at": "2026-10-28T20:10:19.574035245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17ccec35-6ad9-4fef-a847-9aa27b3dfe15",
  "code": "792129",
  "device_ref": "sandbox-27722"
}
```

```json
{
  "session_id": "a90213b0-b877-4e8c-8756-55738987c2fb",
  "subject": {
    "type": "CLIENT",
    "id": "01049cef-6836-4c0f-92ac-8b447afb2919"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTA0OWNlZi02ODM2LTRjMGYtOTJhYy04YjQ0N2FmYjI5MTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTE5LCJpYXQiOjE3OTMyMTgyMTksImp0aSI6IjQxZmExMTI2LTc3ZmEtNGEwZi04YWFjLTc4YzlhMDRkYjBjMSIsInNpZCI6ImE5MDIxM2IwLWI4NzctNGU4Yy04NzU2LTU1NzM4OTg3YzJmYiJ9.jeC73pQ4O74tvdkzgrIB1vsaZdS-pLjjl9bg1yqbsmU",
  "access_expires_at": "2026-10-28T20:25:19.762506061Z",
  "refresh_token": "3gIQtH6IBT1MHHPRIxDr40PjXPJv__M7H7ic7C0aTtQ",
  "refresh_expires_at": "2026-11-27T20:10:19.762102267Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b7af4b30-9c2d-4245-a96d-26094842114f",
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
  "id": "1faeb526-9d02-4096-a584-83fad3818aac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:19.944213Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: bcb77b66-54b9-4017-8a03-8e7ae859b69d) → **201**

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
  "session_id": "ad4623ec-1f0f-4cb0-acdc-019111b6ac96",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMjAsImlhdCI6MTc5MzIxODIyMCwianRpIjoiNGE2OTkyZjctNjRkNC00NmUyLTliYjUtOWYzNTc0NmNiODEyIiwic2lkIjoiYWQ0NjIzZWMtMWYwZi00Y2IwLWFjZGMtMDE5MTExYjZhYzk2In0.caLNKFZwSyQOpCVLvDCvYMZnHyFJSpog2Z91pttUWqY",
  "access_expires_at": "2026-10-28T20:25:20.342390534Z",
  "refresh_token": "qcoceIPxmKe-9q0lp0mwNrIpND6qaepl0t7XCQxOdhk",
  "refresh_expires_at": "2026-10-29T08:10:20.342018422Z",
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
  "session_id": "fa39ff6a-b5c8-4c61-9ea3-22808bd4abac",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMjAsImlhdCI6MTc5MzIxODIyMCwianRpIjoiM2FkNTE1OTAtOWUwMC00OTZkLTllMGMtNWUxN2E3NmFmYTE3Iiwic2lkIjoiZmEzOWZmNmEtYjVjOC00YzYxLTllYTMtMjI4MDhiZDRhYmFjIn0.1mYb7SbD0CeVz87wzzLjdxt_csJB-V9FTmy7dRIyLls",
  "access_expires_at": "2026-10-28T20:25:20.693626221Z",
  "refresh_token": "Y-TrdMmZxcEdJsJdxB7osFYM4K9BtUVDJDKWScc3B9s",
  "refresh_expires_at": "2026-10-29T08:10:20.693319618Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/10d4cb59-d724-4bef-a7b3-4e9fbb56d901/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:10:20.119447Z",
      "actor": {
        "type": "CLIENT",
        "id": "01049cef-6836-4c0f-92ac-8b447afb2919",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901",
        "quote_id": "1faeb526-9d02-4096-a584-83fad3818aac",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "bcb77b66-54b9-4017-8a03-8e7ae859b69d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:10:20.120778Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901",
        "attempt_id": "bdfb2bb9-5caf-4c97-abdc-5636394ee100",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "bcb77b66-54b9-4017-8a03-8e7ae859b69d"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T20:10:20.126888Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901",
        "attempt_id": "bdfb2bb9-5caf-4c97-abdc-5636394ee100"
      },
      "correlation_id": "bcb77b66-54b9-4017-8a03-8e7ae859b69d"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "bdfb2bb9-5caf-4c97-abdc-5636394ee100",
        "generation": 1,
        "started_at": "2026-10-28T20:10:20.120135Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T20:10:20.126888Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T20:10:20.121424Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/bcb77b66-54b9-4017-8a03-8e7ae859b69d` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901:0",
      "order_id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901",
      "at": "2026-10-28T20:10:20.119447Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901:1",
      "order_id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901",
      "at": "2026-10-28T20:10:20.120778Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901:2",
      "order_id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901",
      "at": "2026-10-28T20:10:20.126888Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/451c5f27-20e0-45a6-9615-917c91ac699a` → **200**

```json
{
  "found": []
}
```

Done: request bcb77b66-54b9-4017-8a03-8e7ae859b69d — order 10d4cb59-d724-4bef-a7b3-4e9fbb56d901 found by its id.

`GET /api/rider/v1/orders/10d4cb59-d724-4bef-a7b3-4e9fbb56d901` → **200**

```json
{
  "id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "01049cef-6836-4c0f-92ac-8b447afb2919",
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
  "created_at": "2026-10-28T20:10:20.119059Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/10d4cb59-d724-4bef-a7b3-4e9fbb56d901/cancel` → **200**

```json
{
  "command_id": "0c62c391-b8a7-49b1-9132-20845d87cc28",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "10d4cb59-d724-4bef-a7b3-4e9fbb56d901",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "01049cef-6836-4c0f-92ac-8b447afb2919",
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
  "created_at": "2026-10-28T20:10:20.119059Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638937613",
  "device_ref": "sandbox-17709"
}
```

```json
{
  "challenge_id": "2549a7fa-94c1-45ca-9eb7-c6bfcaa74ffc",
  "expires_at": "2026-10-28T20:15:21.729073049Z",
  "resend_available_at": "2026-10-28T20:10:22.729073049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638937613` → **200**

```json
{
  "phone": "+380638937613",
  "audience": "CLIENT",
  "code": "596022",
  "sent_at": "2026-10-28T20:10:21.731619493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2549a7fa-94c1-45ca-9eb7-c6bfcaa74ffc",
  "code": "596022",
  "device_ref": "sandbox-17709"
}
```

```json
{
  "session_id": "f7a2422f-af3d-4a78-95e4-9a4b1363f515",
  "subject": {
    "type": "CLIENT",
    "id": "189d2aa1-26a3-4dce-95f7-9c21fec8998b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODlkMmFhMS0yNmEzLTRkY2UtOTVmNy05YzIxZmVjODk5OGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTIxLCJpYXQiOjE3OTMyMTgyMjEsImp0aSI6IjAxZWM3MmMzLTMwYTQtNDllYS1iYjE4LTM4M2Q5M2JiYzFlMiIsInNpZCI6ImY3YTI0MjJmLWFmM2QtNGE3OC05NWU0LTlhNGIxMzYzZjUxNSJ9.QV6H5vPQFr0ZvcT96iOhA7TlWeMStVhB8wq_VNcWIUE",
  "access_expires_at": "2026-10-28T20:25:21.914814044Z",
  "refresh_token": "lUDsDBQdOc2GdsbDeRU6Su4xtCvy1RpGVn-qJTUYpzc",
  "refresh_expires_at": "2026-11-27T20:10:21.914401382Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "6b76314f-5fb7-42f9-8e9d-4fb3c97ff3fd",
  "expires_at": "2026-10-28T20:15:24.077656589Z",
  "resend_available_at": "2026-10-28T20:10:25.077656589Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638937613` → **200**

```json
{
  "phone": "+380638937613",
  "audience": "CLIENT",
  "code": "742626",
  "sent_at": "2026-10-28T20:10:24.078956159Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "31f86f05-75ce-4792-b458-661329564af2",
  "challenge_id": "6b76314f-5fb7-42f9-8e9d-4fb3c97ff3fd",
  "otp_code": "742626"
}
```

```json
{
  "id": "18884e21-4adc-4d4f-a8e9-eacb988102eb",
  "state": "PENDING",
  "created_at": "2026-10-28T20:10:24.277198Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/18884e21-4adc-4d4f-a8e9-eacb988102eb` → **200**

```json
{
  "id": "18884e21-4adc-4d4f-a8e9-eacb988102eb",
  "state": "PENDING",
  "created_at": "2026-10-28T20:10:24.277198Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/18884e21-4adc-4d4f-a8e9-eacb988102eb` → **200**

```json
{
  "id": "18884e21-4adc-4d4f-a8e9-eacb988102eb",
  "state": "PENDING",
  "created_at": "2026-10-28T20:10:24.277198Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/18884e21-4adc-4d4f-a8e9-eacb988102eb` → **200**

```json
{
  "id": "18884e21-4adc-4d4f-a8e9-eacb988102eb",
  "state": "PENDING",
  "created_at": "2026-10-28T20:10:24.277198Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/18884e21-4adc-4d4f-a8e9-eacb988102eb` → **200**

```json
{
  "id": "18884e21-4adc-4d4f-a8e9-eacb988102eb",
  "state": "READY",
  "created_at": "2026-10-28T20:10:24.277198Z",
  "ready_at": "2026-10-28T20:10:27.908118Z",
  "expires_at": "2026-11-04T20:10:27.908118Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/18884e21-4adc-4d4f-a8e9-eacb988102eb/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634539879",
  "device_ref": "sandbox-23918"
}
```

```json
{
  "challenge_id": "4cd7ef26-b528-4f39-9723-46044534ac47",
  "expires_at": "2026-10-28T20:15:28.122068215Z",
  "resend_available_at": "2026-10-28T20:10:29.122068215Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634539879` → **200**

```json
{
  "phone": "+380634539879",
  "audience": "CLIENT",
  "code": "818761",
  "sent_at": "2026-10-28T20:10:28.124041953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cd7ef26-b528-4f39-9723-46044534ac47",
  "code": "818761",
  "device_ref": "sandbox-23918"
}
```

```json
{
  "session_id": "d7c4cfcb-1b5c-4a64-8254-d39bd5d50d40",
  "subject": {
    "type": "CLIENT",
    "id": "b8847ba4-d61c-4a2b-bb66-108263733510"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODg0N2JhNC1kNjFjLTRhMmItYmI2Ni0xMDgyNjM3MzM1MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTI4LCJpYXQiOjE3OTMyMTgyMjgsImp0aSI6IjQ1NTdiOGZiLTVlMmYtNDQyYi1iNDg4LTZhYmU4MDE1MmM2NSIsInNpZCI6ImQ3YzRjZmNiLTFiNWMtNGE2NC04MjU0LWQzOWJkNWQ1MGQ0MCJ9.OkHTfmj5ZoEmbO6yKXbuYKFiAUoL9DIxSUour-2nuyA",
  "access_expires_at": "2026-10-28T20:25:28.307835115Z",
  "refresh_token": "tk32JBiY5jTiJq9LT4VUtEnlASR4VlMAGLnvdBY6690",
  "refresh_expires_at": "2026-11-27T20:10:28.307479213Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/18884e21-4adc-4d4f-a8e9-eacb988102eb/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/18884e21-4adc-4d4f-a8e9-eacb988102eb/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "18cebe6b-8e57-4bbe-8646-4e7c2fe357c1"
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
  "session_id": "6d400c33-a4d7-4d5e-ab5b-f27e014cd67c",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMjgsImlhdCI6MTc5MzIxODIyOCwianRpIjoiMTMwMmI0MWYtM2Y1Yi00YTA4LWIyZjYtODY2OTU1YmM1NDI1Iiwic2lkIjoiNmQ0MDBjMzMtYTRkNy00ZDVlLWFiNWItZjI3ZTAxNGNkNjdjIn0.vf10sAgIPyHU2p8vm8MTVFWkO55xC8kY5Szzk66VCmw",
  "access_expires_at": "2026-10-28T20:25:28.842325106Z",
  "refresh_token": "Yzq7sYgo2B5Onja_l5-EDz6j14N-NlAZiqMf_MWx6ZY",
  "refresh_expires_at": "2026-10-29T08:10:28.840701537Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "189d2aa1-26a3-4dce-95f7-9c21fec8998b",
  "session_id": "f7a2422f-af3d-4a78-95e4-9a4b1363f515",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/189d2aa1-26a3-4dce-95f7-9c21fec8998b/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "18884e21-4adc-4d4f-a8e9-eacb988102eb",
      "state": "READY",
      "created_at": "2026-10-28T20:10:24.277198Z",
      "ready_at": "2026-10-28T20:10:27.908118Z",
      "expires_at": "2026-11-04T20:10:27.908118Z",
      "size_bytes": 1032
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
  "device_ref": "sandbox-27187"
}
```

```json
{
  "challenge_id": "9c9ada23-6eac-485d-b593-5d1bbcc8d789",
  "expires_at": "2026-10-28T20:15:29.356641661Z",
  "resend_available_at": "2026-10-28T20:10:30.356641661Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "220373",
  "sent_at": "2026-10-28T20:10:29.358601223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c9ada23-6eac-485d-b593-5d1bbcc8d789",
  "code": "220373",
  "device_ref": "sandbox-27187"
}
```

```json
{
  "session_id": "aa6986d2-1c48-4b79-ad8e-7aa4d0c11948",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTEyOSwiaWF0IjoxNzkzMjE4MjI5LCJqdGkiOiIzZmFhZmJiMi1iNjQxLTQwYzAtOTJkYS00OTZmYTQ3N2JlZDMiLCJzaWQiOiJhYTY5ODZkMi0xYzQ4LTRiNzktYWQ4ZS03YWE0ZDBjMTE5NDgifQ.DxTz20_4S8wqEKezRxmqUJxkUNi0VpNCurnvzXQlcrY",
  "access_expires_at": "2026-10-28T20:25:29.546104286Z",
  "refresh_token": "JAuXKjqsKkX0JYpCWlPk3XWmfYGC7r2w6aEHimYg4nA",
  "refresh_expires_at": "2026-11-27T20:10:29.545666445Z",
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
  "device_ref": "sandbox-11877"
}
```

```json
{
  "challenge_id": "b9f82af0-0a24-43bd-933a-0dc3c5009113",
  "expires_at": "2026-10-28T20:15:29.872075397Z",
  "resend_available_at": "2026-10-28T20:10:30.872075397Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "491700",
  "sent_at": "2026-10-28T20:10:29.873918627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9f82af0-0a24-43bd-933a-0dc3c5009113",
  "code": "491700",
  "device_ref": "sandbox-11877"
}
```

```json
{
  "session_id": "97926cad-b6c8-481a-873e-13198173cdf7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTEzMCwiaWF0IjoxNzkzMjE4MjMwLCJqdGkiOiI2YWRiYTI2Yi01ZDg1LTRiN2UtYTcwZC0yY2NhNzljM2EzNWMiLCJzaWQiOiI5NzkyNmNhZC1iNmM4LTQ4MWEtODczZS0xMzE5ODE3M2NkZjcifQ.8aBmQhoz0bpka6zxy4PHHmsrBCePBELi0WcBFH2-Tfw",
  "access_expires_at": "2026-10-28T20:25:30.056153058Z",
  "refresh_token": "xlqTSG0YpjIrmmv0kQIdlr_co_wXdGXj_ivQ0nIFGf4",
  "refresh_expires_at": "2026-11-27T20:10:30.055846786Z",
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
  "command_id": "614b94ac-7c32-4431-937e-c80ffc8acc9b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:30Z",
    "sequence": 1793218230381
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b2b2eb5c-bcf1-4d5d-997c-fd1e5cfe753a",
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
  "last_heartbeat_at": "2026-10-28T20:10:30.39564Z",
  "last_location_at": "2026-10-28T20:10:30.39564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-29842"
}
```

```json
{
  "challenge_id": "40d7183e-e129-4403-ab16-ace274748f44",
  "expires_at": "2026-10-28T20:15:30.562212025Z",
  "resend_available_at": "2026-10-28T20:10:31.562212025Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "460990",
  "sent_at": "2026-10-28T20:10:30.564047129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40d7183e-e129-4403-ab16-ace274748f44",
  "code": "460990",
  "device_ref": "sandbox-29842"
}
```

```json
{
  "session_id": "7afc13a2-0634-4900-8168-1758ea21aec6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTEzMCwiaWF0IjoxNzkzMjE4MjMwLCJqdGkiOiJkNmUxYWIxZi04MjU4LTQ0OTMtYTAzZC04MjRhNzRjMzRlMGUiLCJzaWQiOiI3YWZjMTNhMi0wNjM0LTQ5MDAtODE2OC0xNzU4ZWEyMWFlYzYifQ.qJTz6cSEpVxUYzT1O4abiesfF47zKTcOTF0N7VFR4Ek",
  "access_expires_at": "2026-10-28T20:25:30.752132523Z",
  "refresh_token": "a_85YzZ4rq5Xu4p0tuBTl0-8fGTiznwsZP6M4W6NV0g",
  "refresh_expires_at": "2026-11-27T20:10:30.751751354Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19a08a59-09cb-42ec-8bd7-fcfa4f950cd8",
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
  "last_heartbeat_at": "2026-10-28T20:09:38.920389Z",
  "last_location_at": "2026-10-28T20:09:38.920389Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/19a08a59-09cb-42ec-8bd7-fcfa4f950cd8/handover` → **200**

```json
{
  "command_id": "61ddb964-9b0a-4d78-b6c8-c5d695a1bed1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19a08a59-09cb-42ec-8bd7-fcfa4f950cd8",
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
  "last_heartbeat_at": "2026-10-28T20:09:38.920389Z",
  "last_location_at": "2026-10-28T20:09:38.920389Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/19a08a59-09cb-42ec-8bd7-fcfa4f950cd8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:31Z",
    "sequence": 1793218231251
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19a08a59-09cb-42ec-8bd7-fcfa4f950cd8",
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
  "last_heartbeat_at": "2026-10-28T20:10:31.265812Z",
  "last_location_at": "2026-10-28T20:10:31.265812Z",
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
  "session_id": "817a96e4-7866-49c9-88ee-783b65b4063a",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMzEsImlhdCI6MTc5MzIxODIzMSwianRpIjoiNmQ4YzIzMWUtYjdiMi00OWE3LWE0YzYtNDk1OTM5NTE1MDQzIiwic2lkIjoiODE3YTk2ZTQtNzg2Ni00OWM5LTg4ZWUtNzgzYjY1YjQwNjNhIn0.TZXhvxLhP0XP0KM1eqN-dgiVZ-cevua6s-w3K0ktZ_w",
  "access_expires_at": "2026-10-28T20:25:31.621377561Z",
  "refresh_token": "aiQs72qNkRFhjtpD_9PBFh__QSnl-n572m2YtPY-GA0",
  "refresh_expires_at": "2026-10-29T08:10:31.621066903Z",
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
  "session_id": "4a6e321c-eae1-4e4d-95fe-9b19bf118909",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMzEsImlhdCI6MTc5MzIxODIzMSwianRpIjoiODUxYzJhYzYtNjVhNy00NDRlLThjYWUtZTQxYThkOTgyZDQ1Iiwic2lkIjoiNGE2ZTMyMWMtZWFlMS00ZTRkLTk1ZmUtOWIxOWJmMTE4OTA5In0.V4wzCD5-xeNmHgB5jGFdmvkQ0jbMbG4yXKFkGFucPtE",
  "access_expires_at": "2026-10-28T20:25:31.990539681Z",
  "refresh_token": "I0CCi_vP-b6qTrxeeT07mu6OD5ivT2uKnacr8rSecfY",
  "refresh_expires_at": "2026-10-29T08:10:31.990177285Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689865399",
  "device_ref": "sandbox-30395"
}
```

```json
{
  "challenge_id": "8ba0ae3d-6c12-4f77-a1f8-a4d5afed129f",
  "expires_at": "2026-10-28T20:15:32.156593893Z",
  "resend_available_at": "2026-10-28T20:10:33.156593893Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689865399` → **200**

```json
{
  "phone": "+380689865399",
  "audience": "CLIENT",
  "code": "529863",
  "sent_at": "2026-10-28T20:10:32.158230557Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ba0ae3d-6c12-4f77-a1f8-a4d5afed129f",
  "code": "529863",
  "device_ref": "sandbox-30395"
}
```

```json
{
  "session_id": "9c053bc6-8686-4195-a4aa-94c533804af5",
  "subject": {
    "type": "CLIENT",
    "id": "606d15a9-960c-4a34-aef9-ccf9cd231263"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDZkMTVhOS05NjBjLTRhMzQtYWVmOS1jY2Y5Y2QyMzEyNjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTMyLCJpYXQiOjE3OTMyMTgyMzIsImp0aSI6ImExZjRkMTYzLTQ0MjgtNDczMC04MzRlLTE3MmU1YjM2MDgyYSIsInNpZCI6IjljMDUzYmM2LTg2ODYtNDE5NS1hNGFhLTk0YzUzMzgwNGFmNSJ9.vgzUHeszdYsg37nHkcJBzEt7Hk1vNHYikJ0ab9RLxkA",
  "access_expires_at": "2026-10-28T20:25:32.344740273Z",
  "refresh_token": "0Ul8kVESZffYpQjY7e3PjfCPNfezaNMseTEXdsCH5ZQ",
  "refresh_expires_at": "2026-11-27T20:10:32.344395143Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "97fa0b28-30eb-41d3-8afe-7f8d1a5f5ecf",
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
  "id": "15aa0cff-2c03-4652-ac63-31b99dfccac0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:32.515596Z",
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
  "command_id": "4cc57414-c5c6-46d8-bfa5-92bd1294f066",
  "quote_id": "15aa0cff-2c03-4652-ac63-31b99dfccac0",
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
  "id": "2944731c-7d9f-464b-8308-46deacdb537f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "606d15a9-960c-4a34-aef9-ccf9cd231263",
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
  "created_at": "2026-10-28T20:10:32.703997Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "61d83482-94d1-4cfc-9560-9b72c99e636f",
    "order_id": "2944731c-7d9f-464b-8308-46deacdb537f",
    "expires_at": "2026-10-28T20:10:47.707113Z",
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

`POST /api/driver/v1/offers/61d83482-94d1-4cfc-9560-9b72c99e636f/reject` → **204**

```json
{
  "command_id": "12281487-0f31-4b7d-a793-4662b4de1bec"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7967a41a-ce0d-4d56-b8f2-8e13dca98722",
    "order_id": "2944731c-7d9f-464b-8308-46deacdb537f",
    "expires_at": "2026-10-28T20:10:48.078884Z",
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

`POST /api/driver/v1/offers/7967a41a-ce0d-4d56-b8f2-8e13dca98722/accept` → **200**

```json
{
  "command_id": "90a12310-891b-481a-9903-1cd20159d90f"
}
```

```json
{
  "id": "a4e78da5-85ce-406f-9eb5-6c1789c78840",
  "order_id": "2944731c-7d9f-464b-8308-46deacdb537f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb158ade-e45e-462a-be0f-2b191bd09432",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/2944731c-7d9f-464b-8308-46deacdb537f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:10:32.704543Z",
      "actor": {
        "type": "CLIENT",
        "id": "606d15a9-960c-4a34-aef9-ccf9cd231263",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2944731c-7d9f-464b-8308-46deacdb537f",
        "quote_id": "15aa0cff-2c03-4652-ac63-31b99dfccac0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e60c9421-f17e-489f-b2fa-ac42fd01488e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:10:32.706448Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2944731c-7d9f-464b-8308-46deacdb537f",
        "attempt_id": "746599e5-a8b9-44a6-b0ad-2eae2ae66251",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e60c9421-f17e-489f-b2fa-ac42fd01488e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:10:32.71117Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "61d83482-94d1-4cfc-9560-9b72c99e636f",
        "order_id": "2944731c-7d9f-464b-8308-46deacdb537f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "e60c9421-f17e-489f-b2fa-ac42fd01488e"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T20:10:33.078093Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "61d83482-94d1-4cfc-9560-9b72c99e636f",
        "order_id": "2944731c-7d9f-464b-8308-46deacdb537f"
      },
      "correlation_id": "51bddcfd-0c58-4fe8-8b4f-e58e8a50ac71"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 2944731c-7d9f-464b-8308-46deacdb537f — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/2944731c-7d9f-464b-8308-46deacdb537f` → **200**

```json
{
  "id": "2944731c-7d9f-464b-8308-46deacdb537f",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "606d15a9-960c-4a34-aef9-ccf9cd231263",
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
    "id": "a4e78da5-85ce-406f-9eb5-6c1789c78840",
    "order_id": "2944731c-7d9f-464b-8308-46deacdb537f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "fb158ade-e45e-462a-be0f-2b191bd09432",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T20:10:32.703997Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2944731c-7d9f-464b-8308-46deacdb537f/cancel` → **200**

```json
{
  "command_id": "c4290adb-dd43-4339-ba12-a47929d735ee",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2944731c-7d9f-464b-8308-46deacdb537f",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "606d15a9-960c-4a34-aef9-ccf9cd231263",
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
    "id": "a4e78da5-85ce-406f-9eb5-6c1789c78840",
    "order_id": "2944731c-7d9f-464b-8308-46deacdb537f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "fb158ade-e45e-462a-be0f-2b191bd09432",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T20:10:32.703997Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "session_id": "b2b2eb5c-bcf1-4d5d-997c-fd1e5cfe753a",
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
  "last_heartbeat_at": "2026-10-28T20:10:30.39564Z",
  "last_location_at": "2026-10-28T20:10:30.39564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2b2eb5c-bcf1-4d5d-997c-fd1e5cfe753a/close` → **200**

```json
{
  "command_id": "3b5bc78b-d089-4f68-a7dc-dbf267a85724",
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
  "session_id": "19a08a59-09cb-42ec-8bd7-fcfa4f950cd8",
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
  "last_heartbeat_at": "2026-10-28T20:10:31.265812Z",
  "last_location_at": "2026-10-28T20:10:31.265812Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19a08a59-09cb-42ec-8bd7-fcfa4f950cd8/close` → **200**

```json
{
  "command_id": "751e53d6-0174-4940-bae2-4e2ef3840d56",
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

# Scenario: feature-flags

## The admin looks at the feature flags

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
  "session_id": "6f011aa7-b72f-4dba-85fc-b684245de41f",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxMzQsImlhdCI6MTc5MzIxODIzNCwianRpIjoiNTJmM2E5MDktMGU3Yi00NWYwLWI5ODAtNjc0NjRiNzg2N2Y4Iiwic2lkIjoiNmYwMTFhYTctYjcyZi00ZGJhLTg1ZmMtYjY4NDI0NWRlNDFmIn0.cOG84YSsDCuvB9ooyJuqeJg5ySAasHT2fk6t-3DpBk4",
  "access_expires_at": "2026-10-28T20:25:34.906327949Z",
  "refresh_token": "s4dtT_EtjOBg8JnoLie0gErFzAv5294-AhHE-aPQDqg",
  "refresh_expires_at": "2026-10-29T08:10:34.905944776Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 0,
      "changed_by": null,
      "reason": null,
      "changed_at": null
    }
  ]
}
```

card-payments: {"enabled":true,"owner":"payments","review_by":"2027-06-30","version":0}

## Card payments are switched off for a provider incident

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "660b8005-5f3b-46c2-91b3-ee1bf1a175e6",
  "expected_version": 0,
  "enabled": false,
  "reason": "Sandbox: provider incident"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": false,
  "version": 1,
  "changed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T20:10:35.255538Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "c0046293-bf6c-4071-8686-a7fc6fb80ba6",
  "expected_version": 0,
  "enabled": false,
  "reason": "An old version"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/card-payments/change",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "16817a9d-e372-4a77-8884-7fe129cb5943"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "9d951fb5-e62d-499c-af5a-a6a1d37af941",
  "expected_version": 0,
  "enabled": false,
  "reason": "x"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/no-such-flag/change",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "53d9ec8b-d895-4cb7-897b-9df31439a057"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638675097",
  "device_ref": "sandbox-25436"
}
```

```json
{
  "challenge_id": "98de5f81-5b28-449b-9992-9ff532ea84f1",
  "expires_at": "2026-10-28T20:15:35.772987953Z",
  "resend_available_at": "2026-10-28T20:10:36.772987953Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638675097` → **200**

```json
{
  "phone": "+380638675097",
  "audience": "CLIENT",
  "code": "299444",
  "sent_at": "2026-10-28T20:10:35.774632053Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98de5f81-5b28-449b-9992-9ff532ea84f1",
  "code": "299444",
  "device_ref": "sandbox-25436"
}
```

```json
{
  "session_id": "c161109e-d4ae-4e84-bca2-915bfeec935f",
  "subject": {
    "type": "CLIENT",
    "id": "8f8ff79d-531a-49a7-9546-341964012b16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjhmZjc5ZC01MzFhLTQ5YTctOTU0Ni0zNDE5NjQwMTJiMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTM1LCJpYXQiOjE3OTMyMTgyMzUsImp0aSI6ImNkNjRkZjc2LWFhYjQtNDc4Ny1hNTk5LTc1NTljYTRkZjQ0NiIsInNpZCI6ImMxNjExMDllLWQ0YWUtNGU4NC1iY2EyLTkxNWJmZWVjOTM1ZiJ9.CgHy01txX8f9kCKhTv8LXp8ur7SA-1Gy3DkBzouOr3o",
  "access_expires_at": "2026-10-28T20:25:35.959134892Z",
  "refresh_token": "8SZmBX59XJovnKFbKehoge9jQmlbF5EOInbUPExCk-Q",
  "refresh_expires_at": "2026-11-27T20:10:35.958797398Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a09fb9a1-49ab-488a-b8fb-a917c7382a92",
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
  "id": "5b19be38-4420-41b0-9a21-cc3423439cb6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:36.128164Z",
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

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "42ec2da0-ff60-4811-9192-1b89481391ca",
  "quote_id": "5b19be38-4420-41b0-9a21-cc3423439cb6",
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
  "payment_method": "CARD"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "d13b3c62-8566-477e-98ea-c4a01efc1412"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c4e68609-2438-4c4d-8877-6047212776f0",
  "quote_id": "5b19be38-4420-41b0-9a21-cc3423439cb6",
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
  "id": "0b809961-12bb-4eed-9e50-5d229e3f2ed4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f8ff79d-531a-49a7-9546-341964012b16",
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
  "created_at": "2026-10-28T20:10:36.518012Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0b809961-12bb-4eed-9e50-5d229e3f2ed4/cancel` → **200**

```json
{
  "command_id": "6cab5a4c-70f7-4e63-ae68-cf63888fced9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0b809961-12bb-4eed-9e50-5d229e3f2ed4",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8f8ff79d-531a-49a7-9546-341964012b16",
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
  "created_at": "2026-10-28T20:10:36.518012Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "d01222d5-c050-4b71-b09e-5cdbd5c422dc",
  "expected_version": 1,
  "enabled": true,
  "reason": "Sandbox: incident over"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": true,
  "version": 2,
  "changed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T20:10:36.893733Z"
}
```

Done: a new card order refused while the flag was off; a cash order went through; the flag is on again.

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 2,
      "changed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T20:10:36.893733Z"
    }
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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
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
  "device_ref": "sandbox-4920"
}
```

```json
{
  "challenge_id": "0c118222-2714-480e-87ec-d8b6105f508f",
  "expires_at": "2026-10-28T20:15:37.410624739Z",
  "resend_available_at": "2026-10-28T20:10:38.410624739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "916737",
  "sent_at": "2026-10-28T20:10:37.412316671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c118222-2714-480e-87ec-d8b6105f508f",
  "code": "916737",
  "device_ref": "sandbox-4920"
}
```

```json
{
  "session_id": "6228e2da-20a3-4eed-9a15-f8d6a7142104",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTEzNywiaWF0IjoxNzkzMjE4MjM3LCJqdGkiOiJhZjY1NDJlNi00NGIxLTRkNmQtODkzZS0yNjg5MTljOTEzZTEiLCJzaWQiOiI2MjI4ZTJkYS0yMGEzLTRlZWQtOWExNS1mOGQ2YTcxNDIxMDQifQ.l-n9Q4RR3auiPDsLEQN7wtebmpF9nRPc0gO_LoRtJ00",
  "access_expires_at": "2026-10-28T20:25:37.597017389Z",
  "refresh_token": "lYmFbVfFK4o9QAr3FCcuxG0B7VqPKNut4Burbmi_yrM",
  "refresh_expires_at": "2026-11-27T20:10:37.59664315Z",
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
  "command_id": "ad755b3f-e073-4c63-ad75-2bc71c89b33f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:37Z",
    "sequence": 1793218237927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:37.943061Z",
  "last_location_at": "2026-10-28T20:10:37.943061Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672650185",
  "device_ref": "sandbox-16394"
}
```

```json
{
  "challenge_id": "07ed23ee-cf6f-4230-a1ae-1bb24290d573",
  "expires_at": "2026-10-28T20:15:38.117838328Z",
  "resend_available_at": "2026-10-28T20:10:39.117838328Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672650185` → **200**

```json
{
  "phone": "+380672650185",
  "audience": "CLIENT",
  "code": "496782",
  "sent_at": "2026-10-28T20:10:38.119476458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07ed23ee-cf6f-4230-a1ae-1bb24290d573",
  "code": "496782",
  "device_ref": "sandbox-16394"
}
```

```json
{
  "session_id": "707e0d51-e847-48a9-8f65-b65b5590496f",
  "subject": {
    "type": "CLIENT",
    "id": "ce0ed10c-2b35-49bd-a5be-0fdb12259a2a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTBlZDEwYy0yYjM1LTQ5YmQtYTViZS0wZmRiMTIyNTlhMmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTM4LCJpYXQiOjE3OTMyMTgyMzgsImp0aSI6IjMzZjBlNjVjLWU2MzgtNGNjNy1iODFlLTg3YjQ0YzZkYTcxZCIsInNpZCI6IjcwN2UwZDUxLWU4NDctNDhhOS04ZjY1LWI2NWI1NTkwNDk2ZiJ9.q9CksLrgYKeCRvfyvjRfTpcGV03rYbYKiOuXDDn0JR4",
  "access_expires_at": "2026-10-28T20:25:38.308891337Z",
  "refresh_token": "XeJvEG1momGC6fSWZ5a5gf2x4sfvf_rbGOlfASsniKE",
  "refresh_expires_at": "2026-11-27T20:10:38.308499071Z",
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
  "command_id": "ccc5040b-85a1-4886-ac74-99a05442f743",
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
  "id": "d94d307d-9267-44d2-90df-ea8f578d3b8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:38.651739Z",
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
  "command_id": "c3284c4d-371d-4dac-bf41-3e6d7fcb0905",
  "platform": "ANDROID",
  "token": "sandbox-driver-9259333b-014b-4eeb-9ebf-1637c6713a4b"
}
```

```json
{
  "id": "cfa86c30-77c2-4f86-9d4b-bbfee84a3cd0",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T20:10:38.828558Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "385e1b1b-1332-4bb7-ba67-2426bf5e15c7",
  "platform": "ANDROID",
  "token": "sandbox-rider-e2d2b2fb-2586-492e-a500-71a23017a8fe"
}
```

```json
{
  "id": "3abaabbb-01c2-4728-a3dd-96202fa599c4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T20:10:38.99486Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a730a2f3-15c1-4433-b4e8-baa423a2cd5c",
  "quote_id": "d94d307d-9267-44d2-90df-ea8f578d3b8e",
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
  "id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce0ed10c-2b35-49bd-a5be-0fdb12259a2a",
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
  "created_at": "2026-10-28T20:10:39.168025Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6d396ec3-2ac0-4a09-bb8a-41338134a184",
    "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
    "expires_at": "2026-10-28T20:10:54.170122Z",
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

`POST /api/driver/v1/offers/6d396ec3-2ac0-4a09-bb8a-41338134a184/accept` → **200**

```json
{
  "command_id": "5ef09c66-6ae4-4833-bda8-c28a9bde3236"
}
```

```json
{
  "id": "ce193d3a-5266-4c25-8685-3529537707f8",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b1a8d04e-dc25-4f61-b9bc-58a01436c449",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T20:10:39.150Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T20:10:39.150Z` → **200**

```json
[
  {
    "at": "2026-10-28T20:10:40.157017714Z",
    "token_suffix": "713a4b",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "c90ab7d6-06fa-4d14-8e29-8069f702b8a3",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672650185&after=2026-10-28T20:10:39.150Z` → **200**

```json
[
  {
    "at": "2026-10-28T20:10:40.158545258Z",
    "token_suffix": "17a8fe",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "7efe33f7-366c-4959-973c-3c663d1563d4",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/8e9b0fac-bec6-419e-bfac-c23bc95cb1ec/messages` → **201**

```json
{
  "command_id": "c08f2f85-49db-43b4-a61b-0bfeacd9d893",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "081526a7-9d82-4aa5-a228-17fa1b07c6ae",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T20:10:40.751875052Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b1a8d04e-dc25-4f61-b9bc-58a01436c449",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "assignment_id": "ce193d3a-5266-4c25-8685-3529537707f8",
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

`POST /api/driver/v1/trips/b1a8d04e-dc25-4f61-b9bc-58a01436c449/messages` → **201**

```json
{
  "command_id": "d8ce57fd-bbe0-4711-afd4-90add5cb6412",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a0788f6e-b7af-44de-a2d7-b0d7ee06d55e",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T20:10:41.086578818Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/8e9b0fac-bec6-419e-bfac-c23bc95cb1ec/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b1a8d04e-dc25-4f61-b9bc-58a01436c449/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672650185"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/58cd8493-77cc-4785-978e-073f21eb69f5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:41Z",
    "sequence": 1793218241572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:41.588297Z",
  "last_location_at": "2026-10-28T20:10:41.588297Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b1a8d04e-dc25-4f61-b9bc-58a01436c449",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "assignment_id": "ce193d3a-5266-4c25-8685-3529537707f8",
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

`POST /api/driver/v1/trips/b1a8d04e-dc25-4f61-b9bc-58a01436c449/arrive` → **200**

```json
{
  "command_id": "70772c85-c2b5-41fb-b7fc-eb3f312945c1",
  "expected_version": 0
}
```

```json
{
  "id": "b1a8d04e-dc25-4f61-b9bc-58a01436c449",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "assignment_id": "ce193d3a-5266-4c25-8685-3529537707f8",
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
  "arrived_at": "2026-10-28T20:10:41.955257Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b1a8d04e-dc25-4f61-b9bc-58a01436c449/start` → **200**

```json
{
  "command_id": "3b1e5615-fbb1-472c-8d2d-1864a553874d",
  "expected_version": 1
}
```

```json
{
  "id": "b1a8d04e-dc25-4f61-b9bc-58a01436c449",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "assignment_id": "ce193d3a-5266-4c25-8685-3529537707f8",
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
  "arrived_at": "2026-10-28T20:10:41.955257Z",
  "started_at": "2026-10-28T20:10:42.125736Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/58cd8493-77cc-4785-978e-073f21eb69f5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:42Z",
    "sequence": 1793218242292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:42.306525Z",
  "last_location_at": "2026-10-28T20:10:42.306525Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b1a8d04e-dc25-4f61-b9bc-58a01436c449/complete` → **200**

```json
{
  "command_id": "6914802c-c0bd-4264-b017-9fce6e313882",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:10:42Z",
  "cash_received": true
}
```

```json
{
  "id": "b1a8d04e-dc25-4f61-b9bc-58a01436c449",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "assignment_id": "ce193d3a-5266-4c25-8685-3529537707f8",
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
  "arrived_at": "2026-10-28T20:10:41.955257Z",
  "started_at": "2026-10-28T20:10:42.125736Z",
  "completed_at": "2026-10-28T20:10:42.47676Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/8e9b0fac-bec6-419e-bfac-c23bc95cb1ec` → **200**

```json
{
  "id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ce0ed10c-2b35-49bd-a5be-0fdb12259a2a",
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
    "id": "ce193d3a-5266-4c25-8685-3529537707f8",
    "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b1a8d04e-dc25-4f61-b9bc-58a01436c449",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:10:39.168025Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T20:10:39.168025Z",
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
    "id": "b1a8d04e-dc25-4f61-b9bc-58a01436c449",
    "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
    "order_short_number": 10,
    "created_at": "2026-10-28T20:10:39.512686Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6adda46f-d59b-46bf-a37d-2bfbbf5b99ed",
    "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
    "order_short_number": 2,
    "created_at": "2026-10-28T20:09:31.370874Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a3ecf1aa-02ad-4cd2-8261-752c6b1a4d55",
    "order_id": "12914dda-00b5-4939-a556-f0776d1e348c",
    "order_short_number": 1,
    "created_at": "2026-10-28T20:09:18.133061Z",
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
      "balance_minor": -1682,
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
        "trips": 3,
        "fare_minor": 31551,
        "commission_minor": 4734,
        "driver_share_minor": 26817,
        "cash_minor": 28499,
        "cashless_minor": 3052,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -1682
      }
    }
  ],
  "total": {
    "trips": 3,
    "fare_minor": 31551,
    "commission_minor": 4734,
    "driver_share_minor": 26817,
    "cash_minor": 28499,
    "cashless_minor": 3052,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -1682
  },
  "balance_minor": -1682
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/8e9b0fac-bec6-419e-bfac-c23bc95cb1ec/tip` → **200**

```json
{
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
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
  "available_until": "2026-10-29T20:10:42.47676Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/8e9b0fac-bec6-419e-bfac-c23bc95cb1ec/tip` → **201**

```json
{
  "command_id": "8b42c5ae-1516-4f9c-a47f-4f760360c3b5",
  "amount_minor": 1100
}
```

```json
{
  "id": "253d577e-5512-4330-840b-698c7a08ed88",
  "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T20:10:46.676034Z"
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
  "session_id": "6da2838a-2ee8-4f51-aa76-cec62e57a53a",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNDcsImlhdCI6MTc5MzIxODI0NywianRpIjoiYzk1YTZiNzctMWU1NC00MjI0LTkxNTAtZWZmNGY1ZjYzYzFlIiwic2lkIjoiNmRhMjgzOGEtMmVlOC00ZjUxLWFhNzYtY2VjNjJlNTdhNTNhIn0.Iaq7_nGq_Z2etlmwsrnbJs3NRsxUql9xpsgykiV0X80",
  "access_expires_at": "2026-10-28T20:25:47.045776504Z",
  "refresh_token": "cWmwyvhpylFGk23kyYAg4euC6oqcKCh77yfDoSY588s",
  "refresh_expires_at": "2026-10-29T08:10:47.045407698Z",
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
        "created": 10,
        "fulfilled": 5,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 9,
          "PHONE": 1
        },
        "by_payment": {
          "CASH": 9,
          "CARD": 1
        },
        "cancelled_by": {
          "RIDER": 3,
          "DRIVER": 1,
          "STAFF": 1
        }
      }
    }
  ],
  "total": {
    "created": 10,
    "fulfilled": 5,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 9,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 9,
      "CARD": 1
    },
    "cancelled_by": {
      "RIDER": 3,
      "DRIVER": 1,
      "STAFF": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 2
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
  "generated_at": "2026-10-28T20:10:47.220767196Z"
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
        "trips": 5,
        "fares_minor": 64145,
        "service_rides_minor": 0,
        "commission_minor": 9624,
        "driver_share_minor": 54521,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 28499,
        "tips_minor": 5000,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 5,
    "fares_minor": 64145,
    "service_rides_minor": 0,
    "commission_minor": 9624,
    "driver_share_minor": 54521,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 28499,
    "tips_minor": 5000,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-10-28T20:10:47.391022329Z"
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
  "session_id": "7db8479d-8557-4baf-98d3-1c7ee2f13a33",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNDcsImlhdCI6MTc5MzIxODI0NywianRpIjoiNGVhNWY2ZDAtNmFkNi00NmQxLTk5YzAtN2M1MjUwODA0M2Y1Iiwic2lkIjoiN2RiODQ3OWQtODU1Ny00YmFmLTk4ZDMtMWM3ZWUyZjEzYTMzIn0.mzrAc2DIjR1_luRubE-FG3PX5LFKX9YyFqVKXadNggU",
  "access_expires_at": "2026-10-28T20:25:47.761890426Z",
  "refresh_token": "OZisUctOIf9sl4Hv7_79CM2Y9PKJVxBdVVwgO9sMMd8",
  "refresh_expires_at": "2026-10-29T08:10:47.760703727Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8e9b0fac-bec6-419e-bfac-c23bc95cb1ec/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:10:39.168395Z",
      "actor": {
        "type": "CLIENT",
        "id": "ce0ed10c-2b35-49bd-a5be-0fdb12259a2a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
        "quote_id": "d94d307d-9267-44d2-90df-ea8f578d3b8e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "31e512cd-89d2-4952-97d4-23696e590de7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:10:39.169718Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
        "attempt_id": "8b00050e-951a-43ea-9fab-2b3be5fe3852",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "31e512cd-89d2-4952-97d4-23696e590de7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:10:39.171324Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6d396ec3-2ac0-4a09-bb8a-41338134a184",
        "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "31e512cd-89d2-4952-97d4-23696e590de7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T20:10:39.513547Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6d396ec3-2ac0-4a09-bb8a-41338134a184",
        "order_id": "8e9b0fac-bec6-419e-bfac-c23bc95cb1ec",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ce193d3a-5266-4c25-8685-3529537707f8"
      },
      "correlation_id": "bb672b67-5c40-4d42-b057-6d567be8b60d"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T20:10:48.119254299Z",
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
      "last_location_at": "2026-10-28T20:10:42.306525Z",
      "order_id": null
    }
  ]
}
```

Done: order 8e9b0fac-bec6-419e-bfac-c23bc95cb1ec.

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
  "session_id": "af24f4bf-510f-4985-975e-ed2035d441e3",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNDgsImlhdCI6MTc5MzIxODI0OCwianRpIjoiZmIzZGNlNDgtOTJiZi00OTY2LTk1OTYtNWY0OGY4NmE0ZGZhIiwic2lkIjoiYWYyNGY0YmYtNTEwZi00OTg1LTk3NWUtZWQyMDM1ZDQ0MWUzIn0.yN0qn8XFXsbBhCcT_h5Bew2DHMGw5x5dFMWwJASXnVE",
  "access_expires_at": "2026-10-28T20:25:48.500859359Z",
  "refresh_token": "5CI-TbVK5xLsqjbS1wXr94aJVRZ_7AgdTBQI37RqyPA",
  "refresh_expires_at": "2026-10-29T08:10:48.500546768Z",
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
  "command_id": "1a0d3c61-ba50-4497-9d27-84e7f9d78c66",
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
  "timestamp": "2026-10-28T20:10:48.000+0000",
  "channel": {
    "id": "1730052000.2532024466",
    "linkedid": "1730052000.2532024466",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678474188"
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
  "timestamp": "2026-10-28T20:10:48.000+0000",
  "channel": {
    "id": "1730052000.2532024466",
    "linkedid": "1730052000.2532024466",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678474188"
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
  "session_id": "e502ff5a-3c49-4c1d-a3c6-af912a6b5d40",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNDksImlhdCI6MTc5MzIxODI0OSwianRpIjoiNGFmZDQ2ZDgtMzlhMy00OTMwLWI2MTItOTQyODYyYzljYmQyIiwic2lkIjoiZTUwMmZmNWEtM2M0OS00YzFkLWEzYzYtYWY5MTJhNmI1ZDQwIn0.QnbS9mUUUMMKctnxEvBDMTNNdBs2eK6Ws3kzLCGuHEE",
  "access_expires_at": "2026-10-28T20:25:49.230664181Z",
  "refresh_token": "TqHqIW8vHHKa2ZHXyO-SJLAwfY7Oe8AtONcKgZvAHv4",
  "refresh_expires_at": "2026-10-29T08:10:49.230316397Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "9b3292a6-dc99-4a30-808b-0eee8dc06b9a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678474188",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T20:10:48Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/9b3292a6-dc99-4a30-808b-0eee8dc06b9a/answer` → **200**

```json
{
  "command_id": "f322cf61-6b13-44eb-9077-e7100f8a4d40"
}
```

```json
{
  "id": "9b3292a6-dc99-4a30-808b-0eee8dc06b9a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678474188",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "order_ids": [],
  "started_at": "2026-10-28T20:10:48Z",
  "answered_at": "2026-10-28T20:10:49.578352Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2532024466",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "621b42d8-11fe-4b7b-9928-c86f3d1a9699",
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
  "id": "9ebdbf69-32cf-4aa5-b21a-3b68c50980a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:49.771528Z",
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
  "command_id": "50623be9-9991-4345-aca8-e3fe9934dfab",
  "quote_id": "9ebdbf69-32cf-4aa5-b21a-3b68c50980a7",
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
    "phone": "+380678474188"
  },
  "call_id": "9b3292a6-dc99-4a30-808b-0eee8dc06b9a"
}
```

```json
{
  "id": "34eb86ec-489b-4741-8e58-ea121ab9b46e",
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
  "created_at": "2026-10-28T20:10:49.947647Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678474188"
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
    "id": "1730052000.2532024466",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9b3292a6-dc99-4a30-808b-0eee8dc06b9a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678474188",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [
        "34eb86ec-489b-4741-8e58-ea121ab9b46e"
      ],
      "started_at": "2026-10-28T20:10:48Z",
      "answered_at": "2026-10-28T20:10:49.578352Z",
      "ended_at": "2026-10-28T20:10:50.133655Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "599ac68b-207f-4223-8497-dc13d38a9007",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678530063",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [],
      "started_at": "2026-10-28T20:09:24.316365Z",
      "answered_at": "2026-10-28T20:09:24.537198Z",
      "ended_at": "2026-10-28T20:09:24.737604Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:09:27.897826Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/34eb86ec-489b-4741-8e58-ea121ab9b46e` → **200**

```json
{
  "id": "34eb86ec-489b-4741-8e58-ea121ab9b46e",
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
  "created_at": "2026-10-28T20:10:49.947647Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678474188"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/34eb86ec-489b-4741-8e58-ea121ab9b46e` → **200**

```json
{
  "id": "34eb86ec-489b-4741-8e58-ea121ab9b46e",
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
  "created_at": "2026-10-28T20:10:49.947647Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678474188"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/34eb86ec-489b-4741-8e58-ea121ab9b46e/cancel` → **200**

```json
{
  "command_id": "3a3625dd-6e23-4ced-840e-3dd75088574d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "34eb86ec-489b-4741-8e58-ea121ab9b46e",
  "short_number": 11,
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
  "created_at": "2026-10-28T20:10:49.947647Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678474188"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 9b3292a6-dc99-4a30-808b-0eee8dc06b9a with order 34eb86ec-489b-4741-8e58-ea121ab9b46e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12260"
}
```

```json
{
  "challenge_id": "f4827dd9-f652-4a90-af0d-56d4481642da",
  "expires_at": "2026-10-28T20:15:50.868843648Z",
  "resend_available_at": "2026-10-28T20:10:51.868843648Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "454592",
  "sent_at": "2026-10-28T20:10:50.870490832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4827dd9-f652-4a90-af0d-56d4481642da",
  "code": "454592",
  "device_ref": "sandbox-12260"
}
```

```json
{
  "session_id": "b36b407e-3396-4d9e-b733-fcaf1f31f60a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTE1MSwiaWF0IjoxNzkzMjE4MjUxLCJqdGkiOiI2NmMwODU5Mi02ZTlmLTQ5NTQtYmUyZC01ZGFiMmI2MmE1M2EiLCJzaWQiOiJiMzZiNDA3ZS0zMzk2LTRkOWUtYjczMy1mY2FmMWYzMWY2MGEifQ.KbEHWBNGNsTgueqMrWS5Q1_Wgt8xzC69VXTIQuyYAVE",
  "access_expires_at": "2026-10-28T20:25:51.058452854Z",
  "refresh_token": "jihsWltIqtbT88SGYlEfocWVezlcxKB__oM_el1lH-I",
  "refresh_expires_at": "2026-11-27T20:10:51.057961033Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:42.306525Z",
  "last_location_at": "2026-10-28T20:10:42.306525Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/58cd8493-77cc-4785-978e-073f21eb69f5/handover` → **200**

```json
{
  "command_id": "2fa386b5-c2da-4386-a270-4b6c82b32b25",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:42.306525Z",
  "last_location_at": "2026-10-28T20:10:42.306525Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/58cd8493-77cc-4785-978e-073f21eb69f5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:51Z",
    "sequence": 1793218251558
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:51.572664Z",
  "last_location_at": "2026-10-28T20:10:51.572664Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668275205",
  "device_ref": "sandbox-26704"
}
```

```json
{
  "challenge_id": "60369bb0-4988-4e3a-9951-b8e5b1ba30c3",
  "expires_at": "2026-10-28T20:15:51.740816749Z",
  "resend_available_at": "2026-10-28T20:10:52.740816749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668275205` → **200**

```json
{
  "phone": "+380668275205",
  "audience": "CLIENT",
  "code": "469596",
  "sent_at": "2026-10-28T20:10:51.742512585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60369bb0-4988-4e3a-9951-b8e5b1ba30c3",
  "code": "469596",
  "device_ref": "sandbox-26704"
}
```

```json
{
  "session_id": "0f866a5a-8d0d-41e3-9fbf-f3fd532c1739",
  "subject": {
    "type": "CLIENT",
    "id": "63e2b1aa-c22a-4dcf-b265-8c1c88a60223"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2M2UyYjFhYS1jMjJhLTRkY2YtYjI2NS04YzFjODhhNjAyMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTUxLCJpYXQiOjE3OTMyMTgyNTEsImp0aSI6ImU1MjlkZTlhLWZmZDMtNGZjOS1hMzJiLTU5MjJjMDNiYTA4ZSIsInNpZCI6IjBmODY2YTVhLThkMGQtNDFlMy05ZmJmLWYzZmQ1MzJjMTczOSJ9.xqllAJsXgQ6xQxK1TPuEMjaqEB1gVMUK1SxsybdAk9o",
  "access_expires_at": "2026-10-28T20:25:51.92607833Z",
  "refresh_token": "oNeWGI8g0xumCwEw0dfAYtvD6aaQY786yQPKSYTVX9M",
  "refresh_expires_at": "2026-11-27T20:10:51.925700481Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b20ec254-59db-4cf7-8bda-3f4cd3906260",
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
  "id": "1326ef9f-df40-4224-a876-a20f68511943",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:15:52.102806Z",
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
  "command_id": "c9313fa1-acc9-4c71-9abd-1a9a1a53106c",
  "quote_id": "1326ef9f-df40-4224-a876-a20f68511943",
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
  "id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63e2b1aa-c22a-4dcf-b265-8c1c88a60223",
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
  "created_at": "2026-10-28T20:10:52.276762Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2f305fc4-0a8b-40a3-a65d-785a1e93d712",
    "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
    "expires_at": "2026-10-28T20:11:07.27868Z",
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

`POST /api/driver/v1/offers/2f305fc4-0a8b-40a3-a65d-785a1e93d712/accept` → **200**

```json
{
  "command_id": "7aa97698-f3a4-42f2-98cf-cb4f811eac24"
}
```

```json
{
  "id": "451e22e5-0ab2-4255-a572-241a0014b1cf",
  "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "817250cb-829b-4a5a-9406-2008350062ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "817250cb-829b-4a5a-9406-2008350062ac",
  "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
  "assignment_id": "451e22e5-0ab2-4255-a572-241a0014b1cf",
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

`POST /api/driver/v1/work-sessions/58cd8493-77cc-4785-978e-073f21eb69f5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:52Z",
    "sequence": 1793218252944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:52.959462Z",
  "last_location_at": "2026-10-28T20:10:52.959462Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/817250cb-829b-4a5a-9406-2008350062ac/arrive` → **200**

```json
{
  "command_id": "0bed20f9-2a4d-419c-940f-c9e98a5b65eb",
  "expected_version": 0
}
```

```json
{
  "id": "817250cb-829b-4a5a-9406-2008350062ac",
  "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
  "assignment_id": "451e22e5-0ab2-4255-a572-241a0014b1cf",
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
  "arrived_at": "2026-10-28T20:10:53.147771Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/817250cb-829b-4a5a-9406-2008350062ac/start` → **200**

```json
{
  "command_id": "2890924f-59ea-471d-b239-c5a71aab374a",
  "expected_version": 1
}
```

```json
{
  "id": "817250cb-829b-4a5a-9406-2008350062ac",
  "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
  "assignment_id": "451e22e5-0ab2-4255-a572-241a0014b1cf",
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
  "arrived_at": "2026-10-28T20:10:53.147771Z",
  "started_at": "2026-10-28T20:10:53.331513Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/58cd8493-77cc-4785-978e-073f21eb69f5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:53Z",
    "sequence": 1793218253497
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:53.512091Z",
  "last_location_at": "2026-10-28T20:10:53.512091Z",
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
  "device_ref": "sandbox-4647"
}
```

```json
{
  "challenge_id": "d4e3f883-ff39-47a4-aa0f-ee058f9b54bb",
  "expires_at": "2026-10-28T20:15:53.681351054Z",
  "resend_available_at": "2026-10-28T20:10:54.681351054Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "985835",
  "sent_at": "2026-10-28T20:10:53.683038419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4e3f883-ff39-47a4-aa0f-ee058f9b54bb",
  "code": "985835",
  "device_ref": "sandbox-4647"
}
```

```json
{
  "session_id": "e69e2d8a-0ced-4857-9595-2946c5814ee0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTE1MywiaWF0IjoxNzkzMjE4MjUzLCJqdGkiOiIxM2U0YmMyNy01Y2JhLTQxMjctYTFkMS1hZGEzZjMyM2MyZWEiLCJzaWQiOiJlNjllMmQ4YS0wY2VkLTQ4NTctOTU5NS0yOTQ2YzU4MTRlZTAifQ.R2AgAH8UWe6eShekL_I5VcfgEM1Q9hVB4prHBF6R5Iw",
  "access_expires_at": "2026-10-28T20:25:53.872562633Z",
  "refresh_token": "0u25arcE72bM6GpcMMnAw0pkU4rJJhFRGk_QUbt5OHg",
  "refresh_expires_at": "2026-11-27T20:10:53.872223051Z",
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
  "command_id": "64c5856c-4250-4243-adb4-3ffa69abde0e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:54Z",
    "sequence": 1793218254195
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "31359c72-a98d-4f29-a87f-ca686db16cad",
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
  "last_heartbeat_at": "2026-10-28T20:10:54.208827Z",
  "last_location_at": "2026-10-28T20:10:54.208827Z",
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
  "session_id": "ac5c8c59-4b21-4f71-8ded-e233de33bdac",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNTQsImlhdCI6MTc5MzIxODI1NCwianRpIjoiZmM1OTAxNDYtODlkNy00OWZjLWI4MjQtMjFiNmY5ODYxZjgzIiwic2lkIjoiYWM1YzhjNTktNGIyMS00ZjcxLThkZWQtZTIzM2RlMzNiZGFjIn0.iXYY2Iz2URtJM305ohS_ISV4-QQO03Vku1FuYdGdBZw",
  "access_expires_at": "2026-10-28T20:25:54.573530216Z",
  "refresh_token": "aA1-xOwpY2Kt0jpAOvLzgfrg2pAZ96hmK4a-Bd7n34Y",
  "refresh_expires_at": "2026-10-29T08:10:54.573077924Z",
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
  "session_id": "37fbba83-196c-4c35-8936-2b9166b4712b",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNTQsImlhdCI6MTc5MzIxODI1NCwianRpIjoiNTM5ZjRlZGEtZWExMi00YWFlLWFmMzQtMmYyNTc4YzA0YmQ4Iiwic2lkIjoiMzdmYmJhODMtMTk2Yy00YzM1LTg5MzYtMmI5MTY2YjQ3MTJiIn0.SvUaYQQFq-cQXTxSSB51XAno_as6VH2WrDoEmWWXy9g",
  "access_expires_at": "2026-10-28T20:25:54.933564061Z",
  "refresh_token": "a9tLRtXnbfZogMod9vF42XngyGX-8LiRUPU20qEcwJQ",
  "refresh_expires_at": "2026-10-29T08:10:54.933238091Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a555f0e8-7e44-47cf-b6a1-1b7963064097` → **200**

```json
{
  "id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
  "short_number": 12,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "63e2b1aa-c22a-4dcf-b265-8c1c88a60223",
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
    "id": "451e22e5-0ab2-4255-a572-241a0014b1cf",
    "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "817250cb-829b-4a5a-9406-2008350062ac",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T20:10:52.276762Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a555f0e8-7e44-47cf-b6a1-1b7963064097/interrupt` → **200**

```json
{
  "command_id": "08d17c48-5cc2-49d1-b4da-ba520dad5e90",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
    "short_number": 12,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "63e2b1aa-c22a-4dcf-b265-8c1c88a60223",
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
      "id": "451e22e5-0ab2-4255-a572-241a0014b1cf",
      "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "817250cb-829b-4a5a-9406-2008350062ac",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T20:10:52.276762Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "2827e648-7eb9-4135-b55b-063bfea990d1",
    "short_number": 13,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "63e2b1aa-c22a-4dcf-b265-8c1c88a60223",
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
    "id": "33bf6083-0687-4cb9-a274-aac63779b717",
    "order_id": "2827e648-7eb9-4135-b55b-063bfea990d1",
    "expires_at": "2026-10-28T20:11:10.305207Z",
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

`POST /api/driver/v1/offers/33bf6083-0687-4cb9-a274-aac63779b717/accept` → **200**

```json
{
  "command_id": "17a98a83-a0d3-41d9-9f76-8396731d7a78"
}
```

```json
{
  "id": "2723bb9b-801b-47fd-b894-1b4413f43097",
  "order_id": "2827e648-7eb9-4135-b55b-063bfea990d1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6ff0da44-f6f0-49ae-9269-955edc43ff10",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6ff0da44-f6f0-49ae-9269-955edc43ff10",
  "order_id": "2827e648-7eb9-4135-b55b-063bfea990d1",
  "assignment_id": "2723bb9b-801b-47fd-b894-1b4413f43097",
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
  "session_id": "31359c72-a98d-4f29-a87f-ca686db16cad",
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
  "last_heartbeat_at": "2026-10-28T20:10:54.208827Z",
  "last_location_at": "2026-10-28T20:10:54.208827Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/31359c72-a98d-4f29-a87f-ca686db16cad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:10:56Z",
    "sequence": 1793218256160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "31359c72-a98d-4f29-a87f-ca686db16cad",
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
  "last_heartbeat_at": "2026-10-28T20:10:56.174713Z",
  "last_location_at": "2026-10-28T20:10:56.174713Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6ff0da44-f6f0-49ae-9269-955edc43ff10/arrive` → **200**

```json
{
  "command_id": "161de603-38e0-476f-b1cf-807638fac0b2",
  "expected_version": 0
}
```

```json
{
  "id": "6ff0da44-f6f0-49ae-9269-955edc43ff10",
  "order_id": "2827e648-7eb9-4135-b55b-063bfea990d1",
  "assignment_id": "2723bb9b-801b-47fd-b894-1b4413f43097",
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
  "arrived_at": "2026-10-28T20:10:56.351649Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6ff0da44-f6f0-49ae-9269-955edc43ff10/start` → **200**

```json
{
  "command_id": "7c6ad997-239c-4f77-ab68-c51e11db71f2",
  "expected_version": 1
}
```

```json
{
  "id": "6ff0da44-f6f0-49ae-9269-955edc43ff10",
  "order_id": "2827e648-7eb9-4135-b55b-063bfea990d1",
  "assignment_id": "2723bb9b-801b-47fd-b894-1b4413f43097",
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
  "arrived_at": "2026-10-28T20:10:56.351649Z",
  "started_at": "2026-10-28T20:10:56.533713Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6ff0da44-f6f0-49ae-9269-955edc43ff10/complete` → **200**

```json
{
  "command_id": "6776569e-b4c3-4eaf-8f35-d728ef1f8c26",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:10:56Z"
}
```

```json
{
  "id": "6ff0da44-f6f0-49ae-9269-955edc43ff10",
  "order_id": "2827e648-7eb9-4135-b55b-063bfea990d1",
  "assignment_id": "2723bb9b-801b-47fd-b894-1b4413f43097",
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
  "arrived_at": "2026-10-28T20:10:56.351649Z",
  "started_at": "2026-10-28T20:10:56.533713Z",
  "completed_at": "2026-10-28T20:10:56.704933Z",
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
    "id": "2827e648-7eb9-4135-b55b-063bfea990d1",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-28T20:10:55.299648Z",
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
    "id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
    "short_number": 12,
    "status": "CANCELLED",
    "created_at": "2026-10-28T20:10:52.276762Z",
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
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
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
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/a555f0e8-7e44-47cf-b6a1-1b7963064097/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:10:52.277098Z",
      "actor": {
        "type": "CLIENT",
        "id": "63e2b1aa-c22a-4dcf-b265-8c1c88a60223",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
        "quote_id": "1326ef9f-df40-4224-a876-a20f68511943",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "b1bc33bd-09f9-4e09-880b-8607f5904f25"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:10:52.278233Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
        "attempt_id": "310124a7-d6df-4004-af67-384d65bd2b1e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b1bc33bd-09f9-4e09-880b-8607f5904f25"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:10:52.279844Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2f305fc4-0a8b-40a3-a65d-785a1e93d712",
        "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "b1bc33bd-09f9-4e09-880b-8607f5904f25"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T20:10:52.622702Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2f305fc4-0a8b-40a3-a65d-785a1e93d712",
        "order_id": "a555f0e8-7e44-47cf-b6a1-1b7963064097",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "451e22e5-0ab2-4255-a572-241a0014b1cf"
      },
      "correlation_id": "7e7abc5f-d91a-498c-b480-f1a793f0bfa2"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/2827e648-7eb9-4135-b55b-063bfea990d1/tip` → **200**

```json
{
  "order_id": "2827e648-7eb9-4135-b55b-063bfea990d1",
  "currency": "UAH",
  "trip_cost_minor": 13074,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1400
    },
    {
      "percent": 15,
      "amount_minor": 2000
    },
    {
      "percent": 20,
      "amount_minor": 2700
    },
    {
      "percent": 25,
      "amount_minor": 3300
    }
  ],
  "min_minor": 100,
  "max_minor": 13100,
  "method": null,
  "available_until": "2026-10-29T20:10:56.704933Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/2827e648-7eb9-4135-b55b-063bfea990d1/tip` → **409**

```json
{
  "command_id": "3dbbfec6-0241-4c11-8c7f-c0d1837b6e70",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/2827e648-7eb9-4135-b55b-063bfea990d1/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "acbe40dc-c2c8-4c5a-b302-70e25b99ad8d"
}
```

Done: interrupted a555f0e8-7e44-47cf-b6a1-1b7963064097, follow-up 2827e648-7eb9-4135-b55b-063bfea990d1.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58cd8493-77cc-4785-978e-073f21eb69f5",
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
  "last_heartbeat_at": "2026-10-28T20:10:53.512091Z",
  "last_location_at": "2026-10-28T20:10:53.512091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/58cd8493-77cc-4785-978e-073f21eb69f5/close` → **200**

```json
{
  "command_id": "bcc96d57-02f8-4234-a543-b57e09a99e23",
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
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "31359c72-a98d-4f29-a87f-ca686db16cad",
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
  "last_heartbeat_at": "2026-10-28T20:10:56.174713Z",
  "last_location_at": "2026-10-28T20:10:56.174713Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/31359c72-a98d-4f29-a87f-ca686db16cad/close` → **200**

```json
{
  "command_id": "64e4f532-014a-48e2-819e-51be892a64eb",
  "expected_version": 0
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
  "session_id": "234e66f4-98be-46cf-b552-632303908b1f",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNjEsImlhdCI6MTc5MzIxODI2MSwianRpIjoiZGU1MWFjZDYtYTU2Yi00MzE1LThiY2EtZTI0ZDM2ZWI3MzI3Iiwic2lkIjoiMjM0ZTY2ZjQtOThiZS00NmNmLWI1NTItNjMyMzAzOTA4YjFmIn0.YBM7HF67SJkQavZPn9Mqq1fUlyF9FFi4NOPEccYSjYA",
  "access_expires_at": "2026-10-28T20:26:01.621353772Z",
  "refresh_token": "RqqC3xyVJBLMQh-LAwfvt-lPRQr5JlWF-MsoW-hnCeg",
  "refresh_expires_at": "2026-10-29T08:11:01.621035802Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "48816e0f-81ba-411d-9048-0df23f145c7a",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T20:11:01Z"
}
```

```json
{
  "id": "904f673d-67c2-4f51-a272-3d58f905e797",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T20:11:01Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/904f673d-67c2-4f51-a272-3d58f905e797/publish` → **200**

```json
{
  "command_id": "99a39dca-720f-4ebf-84ac-5056955012ef",
  "expected_version": 0
}
```

```json
{
  "id": "904f673d-67c2-4f51-a272-3d58f905e797",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T20:11:01.973513Z",
  "published_at": "2026-10-28T20:11:01.973513Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "904f673d-67c2-4f51-a272-3d58f905e797",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T20:11:01.973513Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638313747",
  "device_ref": "sandbox-6984"
}
```

```json
{
  "challenge_id": "ff0120c9-18f8-4ed0-8570-cfd951e4d6f1",
  "expires_at": "2026-10-28T20:16:02.303458502Z",
  "resend_available_at": "2026-10-28T20:11:03.303458502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638313747` → **200**

```json
{
  "phone": "+380638313747",
  "audience": "CLIENT",
  "code": "248294",
  "sent_at": "2026-10-28T20:11:02.305255582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff0120c9-18f8-4ed0-8570-cfd951e4d6f1",
  "code": "248294",
  "device_ref": "sandbox-6984"
}
```

```json
{
  "session_id": "707014fe-6f33-4480-baab-d8a81f092fc9",
  "subject": {
    "type": "CLIENT",
    "id": "bc7855f9-2d65-434d-b223-d2306651e604"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzc4NTVmOS0yZDY1LTQzNGQtYjIyMy1kMjMwNjY1MWU2MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTYyLCJpYXQiOjE3OTMyMTgyNjIsImp0aSI6IjQ5MWIxMjIyLTdjY2QtNDg5Ny1iNGM1LTdjNTM1YzQ4OGQzZSIsInNpZCI6IjcwNzAxNGZlLTZmMzMtNDQ4MC1iYWFiLWQ4YTgxZjA5MmZjOSJ9.r7vfQXAwT_epz98mBgsjK_yJXb6bIQgnzOczCLfVuKg",
  "access_expires_at": "2026-10-28T20:26:02.485856438Z",
  "refresh_token": "ck1hWoKpCzBqm3gQzKoqoCsN77PCw-RA7VXfUoHeT40",
  "refresh_expires_at": "2026-11-27T20:11:02.485513496Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "904f673d-67c2-4f51-a272-3d58f905e797",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T20:11:01.973513Z",
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
  "command_id": "e0575794-0f27-4067-93d4-95cb46aa07bc",
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
  "id": "8cade8c4-e2b8-42d7-8442-34fbc3998591",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:02.821072Z",
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
  "command_id": "e661bd45-2f24-4a89-9dd6-5a04244a5714",
  "quote_id": "8cade8c4-e2b8-42d7-8442-34fbc3998591",
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
  "correlation_id": "b0bbe870-55b5-4d29-a218-4048988f60ad"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "cfa561f1-90bf-4b9e-83a0-f5227f5c0ffe",
  "version_id": "904f673d-67c2-4f51-a272-3d58f905e797",
  "language": "uk"
}
```

```json
{
  "version_id": "904f673d-67c2-4f51-a272-3d58f905e797",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T20:11:03.231555Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c66c2c22-382e-4a9d-b421-ca79e38d2a80",
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
  "id": "32e625ca-5072-41a0-966e-01a1b3fe0964",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:03.410476Z",
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
  "command_id": "53c08fc0-7569-460c-a561-96c037e43025",
  "quote_id": "32e625ca-5072-41a0-966e-01a1b3fe0964",
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
  "id": "5ede09cd-1add-4af6-9699-cb1d10460bdb",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc7855f9-2d65-434d-b223-d2306651e604",
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
  "created_at": "2026-10-28T20:11:03.587882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5ede09cd-1add-4af6-9699-cb1d10460bdb` → **200**

```json
{
  "id": "5ede09cd-1add-4af6-9699-cb1d10460bdb",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc7855f9-2d65-434d-b223-d2306651e604",
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
  "created_at": "2026-10-28T20:11:03.587882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5ede09cd-1add-4af6-9699-cb1d10460bdb/cancel` → **200**

```json
{
  "command_id": "39d464a2-ca57-444a-8a9b-582e9c28b603",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5ede09cd-1add-4af6-9699-cb1d10460bdb",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bc7855f9-2d65-434d-b223-d2306651e604",
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
  "created_at": "2026-10-28T20:11:03.587882Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/904f673d-67c2-4f51-a272-3d58f905e797` → **409**

```json
{
  "command_id": "d0d23ac1-b2ca-4ff8-9308-04e98b71574e",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T20:11:04Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/904f673d-67c2-4f51-a272-3d58f905e797",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ee4285db-7e96-4892-8480-7fef3145c396"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2d1dc0cf-19de-494d-8f02-2ff9bf004c02",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T20:11:04Z"
}
```

```json
{
  "id": "dc9cbb64-ecfc-44b8-8f0a-d6fc2df42805",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T20:11:04Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/dc9cbb64-ecfc-44b8-8f0a-d6fc2df42805/publish` → **200**

```json
{
  "command_id": "6433ed40-44ee-4964-ac3e-5d39e66f1beb",
  "expected_version": 0
}
```

```json
{
  "id": "dc9cbb64-ecfc-44b8-8f0a-d6fc2df42805",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T20:11:04.549511Z",
  "published_at": "2026-10-28T20:11:04.549511Z",
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
  "device_ref": "sandbox-27244"
}
```

```json
{
  "challenge_id": "ac7710e5-d068-44e2-85c5-b05e72bea7cb",
  "expires_at": "2026-10-28T20:16:04.724745221Z",
  "resend_available_at": "2026-10-28T20:11:05.724745221Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "050500",
  "sent_at": "2026-10-28T20:11:04.726471602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac7710e5-d068-44e2-85c5-b05e72bea7cb",
  "code": "050500",
  "device_ref": "sandbox-27244"
}
```

```json
{
  "session_id": "919695fd-399e-4fa5-a715-bb864d264778",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTE2NCwiaWF0IjoxNzkzMjE4MjY0LCJqdGkiOiIzNWUwNTRjZS0yNGIxLTQ2NzYtYjNhMS1iMjBkYjM0MzZlMDYiLCJzaWQiOiI5MTk2OTVmZC0zOTllLTRmYTUtYTcxNS1iYjg2NGQyNjQ3NzgifQ.4SeQq4OsK4lOuSo6uFZn-zMuZaCci7g3IyvcmE588Ds",
  "access_expires_at": "2026-10-28T20:26:04.905954445Z",
  "refresh_token": "snoACJWuwNMirT-I7Qj9mkOePqj47LTAWkJMSBtsU0k",
  "refresh_expires_at": "2026-11-27T20:11:04.905537712Z",
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
  "command_id": "140a10fe-cabf-4c86-ab5b-fcfdefddbe8b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:11:05Z",
    "sequence": 1793218265221
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5d5f3824-592a-4818-b877-4448b4611f37",
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
  "last_heartbeat_at": "2026-10-28T20:11:05.235406Z",
  "last_location_at": "2026-10-28T20:11:05.235406Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676450615",
  "device_ref": "sandbox-24195"
}
```

```json
{
  "challenge_id": "c9a8a6a3-84ff-4520-91cf-5c23dd35d5df",
  "expires_at": "2026-10-28T20:16:05.399163559Z",
  "resend_available_at": "2026-10-28T20:11:06.399163559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676450615` → **200**

```json
{
  "phone": "+380676450615",
  "audience": "CLIENT",
  "code": "889952",
  "sent_at": "2026-10-28T20:11:05.402110759Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9a8a6a3-84ff-4520-91cf-5c23dd35d5df",
  "code": "889952",
  "device_ref": "sandbox-24195"
}
```

```json
{
  "session_id": "709184a5-f26a-41ce-9651-1889dbe615f8",
  "subject": {
    "type": "CLIENT",
    "id": "e9c3adaf-117b-458a-8af4-2536c0281185"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOWMzYWRhZi0xMTdiLTQ1OGEtOGFmNC0yNTM2YzAyODExODUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTY1LCJpYXQiOjE3OTMyMTgyNjUsImp0aSI6IjRjMjBjMmQ3LTBlMWEtNGRlYS1hMDdkLTgxZmYyM2NjZTVmYyIsInNpZCI6IjcwOTE4NGE1LWYyNmEtNDFjZS05NjUxLTE4ODlkYmU2MTVmOCJ9.1XOoavALsbHUw6IEgsz58VaEiF7tljlOejxygmzdM2Y",
  "access_expires_at": "2026-10-28T20:26:05.586978942Z",
  "refresh_token": "Js8VrylfyUlGP8ZffSY1CkVFz7fWYyTtsNvq-5GXWUc",
  "refresh_expires_at": "2026-11-27T20:11:05.586687272Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "667cb7d2-5a1d-4735-bff4-05e241900982",
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
  "id": "8e69ee05-a83f-4ee8-9e53-048b13057d39",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:05.756711Z",
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
  "command_id": "d752a738-d8e3-42bf-976d-5722af1d3ffe",
  "quote_id": "8e69ee05-a83f-4ee8-9e53-048b13057d39",
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
    "phone": "+380670558638"
  }
}
```

```json
{
  "id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
  "created_at": "2026-10-28T20:11:05.938397Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4e12cfef-6e7a-4add-9f60-aaf14f12bff6",
    "order_id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
    "expires_at": "2026-10-28T20:11:20.940346Z",
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

`POST /api/driver/v1/offers/4e12cfef-6e7a-4add-9f60-aaf14f12bff6/accept` → **200**

```json
{
  "command_id": "312ea9c7-917f-43e4-8c39-d9581002a6b6"
}
```

```json
{
  "id": "cd9fa105-4877-42ec-b053-11514c23882a",
  "order_id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2d126c5a-d270-4ea6-a45d-3798859ce8b7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2d126c5a-d270-4ea6-a45d-3798859ce8b7",
  "order_id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
  "assignment_id": "cd9fa105-4877-42ec-b053-11514c23882a",
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
    "phone": "+380670558638"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5627b5fe-bf8b-4bbd-9c3c-e3af16c32131",
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
  "id": "e7b62fa1-604e-40d9-a647-43db4ab57249",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:06.626235Z",
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
  "command_id": "01ad41f9-e2c6-4810-82d8-c50c10185fcc",
  "quote_id": "e7b62fa1-604e-40d9-a647-43db4ab57249",
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
  "id": "56239ae4-f6f1-4d6c-85aa-6b093b46a777",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
  "created_at": "2026-10-28T20:11:06.799074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "382808cb-97a8-496f-bfe5-8fde206c275d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T23:11:06Z"
}
```

```json
{
  "id": "8acfecb3-e310-49b5-a3fb-714019ec64ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:06.985340Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T23:11:06Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "275beb5b-23e8-4e87-9b6a-993057e8f104",
  "quote_id": "8acfecb3-e310-49b5-a3fb-714019ec64ca",
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
  "pickup_at": "2026-10-28T23:11:06Z"
}
```

```json
{
  "id": "176d085a-ebe0-4f47-984e-5ad4bfccba9f",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
  "created_at": "2026-10-28T20:11:07.166267Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T23:11:06Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f646673a-a0b7-4105-92e8-3a0c3ead7446",
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
  "id": "7deec472-c6f4-4d21-9c0d-66c26122e36a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:07.363641Z",
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
  "command_id": "93c8e4aa-1489-4a49-bb3f-746612431161",
  "quote_id": "7deec472-c6f4-4d21-9c0d-66c26122e36a",
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
  "correlation_id": "459f3fa2-6946-417f-b54d-ff55c76aa515"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "176d085a-ebe0-4f47-984e-5ad4bfccba9f",
      "short_number": 17,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
      "created_at": "2026-10-28T20:11:07.166267Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T23:11:06Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "56239ae4-f6f1-4d6c-85aa-6b093b46a777",
      "short_number": 16,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
      "created_at": "2026-10-28T20:11:06.799074Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
      "short_number": 15,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "56239ae4-f6f1-4d6c-85aa-6b093b46a777",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
  "created_at": "2026-10-28T20:11:06.799074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/6dfd0f09-0246-4411-a5e9-aa975788507b` → **200**

```json
{
  "id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
    "id": "cd9fa105-4877-42ec-b053-11514c23882a",
    "order_id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2d126c5a-d270-4ea6-a45d-3798859ce8b7",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T20:11:05.938397Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": {
    "seconds": 40,
    "distance_metres": 275,
    "source": "STRAIGHT_LINE",
    "location_at": "2026-10-28T20:11:05.235406Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/6dfd0f09-0246-4411-a5e9-aa975788507b/cancel` → **200**

```json
{
  "command_id": "bf07e3d5-3246-4ad2-927e-5dcca0d0066e",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
    "id": "cd9fa105-4877-42ec-b053-11514c23882a",
    "order_id": "6dfd0f09-0246-4411-a5e9-aa975788507b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2d126c5a-d270-4ea6-a45d-3798859ce8b7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T20:11:05.938397Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56239ae4-f6f1-4d6c-85aa-6b093b46a777` → **200**

```json
{
  "id": "56239ae4-f6f1-4d6c-85aa-6b093b46a777",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
  "created_at": "2026-10-28T20:11:06.799074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/56239ae4-f6f1-4d6c-85aa-6b093b46a777/cancel` → **200**

```json
{
  "command_id": "df92d028-6b2b-4418-bfd3-09c9347ffda6",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "56239ae4-f6f1-4d6c-85aa-6b093b46a777",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
  "created_at": "2026-10-28T20:11:06.799074Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/176d085a-ebe0-4f47-984e-5ad4bfccba9f` → **200**

```json
{
  "id": "176d085a-ebe0-4f47-984e-5ad4bfccba9f",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
  "created_at": "2026-10-28T20:11:07.166267Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T23:11:06Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/176d085a-ebe0-4f47-984e-5ad4bfccba9f/cancel` → **200**

```json
{
  "command_id": "12d4fe38-0549-46f6-9798-fa7da99e8a53",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "176d085a-ebe0-4f47-984e-5ad4bfccba9f",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e9c3adaf-117b-458a-8af4-2536c0281185",
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
  "created_at": "2026-10-28T20:11:07.166267Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-28T23:11:06Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5d5f3824-592a-4818-b877-4448b4611f37",
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
  "last_heartbeat_at": "2026-10-28T20:11:05.235406Z",
  "last_location_at": "2026-10-28T20:11:05.235406Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5d5f3824-592a-4818-b877-4448b4611f37/close` → **200**

```json
{
  "command_id": "6fca161c-25ef-4e0f-998e-969696fb52f7",
  "expected_version": 0
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

Done: orders 6dfd0f09-0246-4411-a5e9-aa975788507b, 56239ae4-f6f1-4d6c-85aa-6b093b46a777, 176d085a-ebe0-4f47-984e-5ad4bfccba9f.

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
  "session_id": "68048c5f-94f8-4d03-b04a-6337f0065847",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNjksImlhdCI6MTc5MzIxODI2OSwianRpIjoiMjc0N2Y2MmQtY2JmMi00ZThlLTg3ODAtNjkyYjQ5NTEzZTkyIiwic2lkIjoiNjgwNDhjNWYtOTRmOC00ZDAzLWIwNGEtNjMzN2YwMDY1ODQ3In0.ovPgBDwBpFm7lnobzzL3GYn-5YiZML8YxA5ZIFAoAws",
  "access_expires_at": "2026-10-28T20:26:09.68046549Z",
  "refresh_token": "-uyn40SJ24MrRgQJzB2djOn3q-kIf8JB3FS_IS2fJNk",
  "refresh_expires_at": "2026-10-29T08:11:09.680137675Z",
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
  "session_id": "0d83515a-fa6e-4706-877a-66006e2cfe17",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNzAsImlhdCI6MTc5MzIxODI3MCwianRpIjoiYmY1YTRhNjgtMDAyZS00OTZkLTg4OTMtN2M5NDNmYWFjNDZlIiwic2lkIjoiMGQ4MzUxNWEtZmE2ZS00NzA2LTg3N2EtNjYwMDZlMmNmZTE3In0.xYYOXCj6CPgUJmsDdF61B8Cb4fYsnoZ0AHhgIBN7p8w",
  "access_expires_at": "2026-10-28T20:26:10.037416044Z",
  "refresh_token": "4AEX9uKOhOlBOMsq0wNPuVYDn0wyccnOxgII6WOFVgY",
  "refresh_expires_at": "2026-10-29T08:11:10.037032551Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17000"
}
```

```json
{
  "challenge_id": "4f484e99-cd8f-4e21-8f72-faa4f7aa507b",
  "expires_at": "2026-10-28T20:16:10.196771071Z",
  "resend_available_at": "2026-10-28T20:11:11.196771071Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "710599",
  "sent_at": "2026-10-28T20:11:10.198459026Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f484e99-cd8f-4e21-8f72-faa4f7aa507b",
  "code": "710599",
  "device_ref": "sandbox-17000"
}
```

```json
{
  "session_id": "3312975f-4971-4611-8b6a-9e8facd41d94",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTE3MCwiaWF0IjoxNzkzMjE4MjcwLCJqdGkiOiJmOTUxZWQ5OS00OTA3LTQ4YjctYjNkOC1jZjg2NDkzZjJiMjciLCJzaWQiOiIzMzEyOTc1Zi00OTcxLTQ2MTEtOGI2YS05ZThmYWNkNDFkOTQifQ.Lko_Ye1cUBI7rKGnYdFCoUnGFIy2By3VORuF29cCo7o",
  "access_expires_at": "2026-10-28T20:26:10.382720389Z",
  "refresh_token": "0iGVt3Q4epM2Z9NsRD6mlLcD0PLEGJKjDokkEtNBoz0",
  "refresh_expires_at": "2026-11-27T20:11:10.382407978Z",
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
  "command_id": "b5eb0feb-8e23-41fd-8a3c-2122c18e8ba0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:11:10Z",
    "sequence": 1793218270703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "570224ac-c175-4f0a-9906-7a66151822b4",
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
  "last_heartbeat_at": "2026-10-28T20:11:10.71753Z",
  "last_location_at": "2026-10-28T20:11:10.71753Z",
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
  "command_id": "32ec7930-4273-470f-8f7d-4c9c15759857",
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
  "effective_at": "2026-10-28T20:11:11.062623Z",
  "changed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T20:09:35.473074Z",
  "last_entries": [
    {
      "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T20:09:35.473074Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7ef8e042-1dca-40e1-ae0e-125713a11472",
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
  "id": "16d443a0-fe64-4187-bdf3-32c5bc9d7ce6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:11.399626Z",
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
  "command_id": "5f2ee981-de82-4688-a8f6-577722779b6f",
  "quote_id": "16d443a0-fe64-4187-bdf3-32c5bc9d7ce6",
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
    "phone": "+380671114377"
  }
}
```

```json
{
  "id": "daed2a1a-6505-4a21-9fc9-f602f6d8efd4",
  "short_number": 18,
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
  "created_at": "2026-10-28T20:11:11.573578Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114377"
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
    "id": "c2716ff2-cfa3-419e-818b-deab3a3efba5",
    "order_id": "daed2a1a-6505-4a21-9fc9-f602f6d8efd4",
    "expires_at": "2026-10-28T20:11:26.575867Z",
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

`POST /api/driver/v1/offers/c2716ff2-cfa3-419e-818b-deab3a3efba5/accept` → **200**

```json
{
  "command_id": "76acf873-b8c5-43b7-981d-074790e102e8"
}
```

```json
{
  "id": "f8e9095b-88b6-4d9a-93b3-fe6dc6fae4ac",
  "order_id": "daed2a1a-6505-4a21-9fc9-f602f6d8efd4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "13f2f7f4-8a44-4e77-8ad2-97e0cb002eae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "13f2f7f4-8a44-4e77-8ad2-97e0cb002eae",
  "order_id": "daed2a1a-6505-4a21-9fc9-f602f6d8efd4",
  "assignment_id": "f8e9095b-88b6-4d9a-93b3-fe6dc6fae4ac",
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
    "phone": "+380671114377"
  }
}
```

`POST /api/driver/v1/work-sessions/570224ac-c175-4f0a-9906-7a66151822b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:11:12Z",
    "sequence": 1793218272254
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "570224ac-c175-4f0a-9906-7a66151822b4",
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
  "last_heartbeat_at": "2026-10-28T20:11:12.269942Z",
  "last_location_at": "2026-10-28T20:11:12.269942Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/13f2f7f4-8a44-4e77-8ad2-97e0cb002eae/arrive` → **200**

```json
{
  "command_id": "68887d63-cb8b-4de8-b9a4-ce7286901b30",
  "expected_version": 0
}
```

```json
{
  "id": "13f2f7f4-8a44-4e77-8ad2-97e0cb002eae",
  "order_id": "daed2a1a-6505-4a21-9fc9-f602f6d8efd4",
  "assignment_id": "f8e9095b-88b6-4d9a-93b3-fe6dc6fae4ac",
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
  "arrived_at": "2026-10-28T20:11:12.440944Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114377"
  }
}
```

`POST /api/driver/v1/trips/13f2f7f4-8a44-4e77-8ad2-97e0cb002eae/start` → **200**

```json
{
  "command_id": "934e4dc2-0829-4fd1-913e-34c9d1e159f5",
  "expected_version": 1
}
```

```json
{
  "id": "13f2f7f4-8a44-4e77-8ad2-97e0cb002eae",
  "order_id": "daed2a1a-6505-4a21-9fc9-f602f6d8efd4",
  "assignment_id": "f8e9095b-88b6-4d9a-93b3-fe6dc6fae4ac",
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
  "arrived_at": "2026-10-28T20:11:12.440944Z",
  "started_at": "2026-10-28T20:11:12.612787Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114377"
  }
}
```

`POST /api/driver/v1/trips/13f2f7f4-8a44-4e77-8ad2-97e0cb002eae/complete` → **200**

```json
{
  "command_id": "cd2e0cd8-4d88-49f4-9673-7e2f845c821f",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:11:12Z",
  "cash_received": true
}
```

```json
{
  "id": "13f2f7f4-8a44-4e77-8ad2-97e0cb002eae",
  "order_id": "daed2a1a-6505-4a21-9fc9-f602f6d8efd4",
  "assignment_id": "f8e9095b-88b6-4d9a-93b3-fe6dc6fae4ac",
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
  "arrived_at": "2026-10-28T20:11:12.440944Z",
  "started_at": "2026-10-28T20:11:12.612787Z",
  "completed_at": "2026-10-28T20:11:12.800918Z",
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
  "command_id": "e18e4b71-9c04-4ff4-aee4-e51decc7eb6d",
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
  "id": "1f431f88-5f46-4f1b-83e0-fdecf4c1af98",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:12.980475Z",
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
  "command_id": "45f519b4-1ca0-4a15-a960-da49e4d42402",
  "quote_id": "1f431f88-5f46-4f1b-83e0-fdecf4c1af98",
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
    "phone": "+3806711113913"
  }
}
```

```json
{
  "id": "39e56457-c0b6-46c6-abec-08b0aae27b6b",
  "short_number": 19,
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
  "created_at": "2026-10-28T20:11:13.165417Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113913"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/39e56457-c0b6-46c6-abec-08b0aae27b6b` → **200**

```json
{
  "id": "39e56457-c0b6-46c6-abec-08b0aae27b6b",
  "short_number": 19,
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
  "created_at": "2026-10-28T20:11:13.165417Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113913"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/39e56457-c0b6-46c6-abec-08b0aae27b6b/cancel` → **200**

```json
{
  "command_id": "675fe6a5-e033-4734-98da-cb9a6d5bb56b",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "39e56457-c0b6-46c6-abec-08b0aae27b6b",
  "short_number": 19,
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
  "created_at": "2026-10-28T20:11:13.165417Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113913"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
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
  "staff_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T20:09:35.473074Z",
  "last_entries": [
    {
      "order_id": "39e56457-c0b6-46c6-abec-08b0aae27b6b",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T20:11:13.541833Z"
    },
    {
      "order_id": "daed2a1a-6505-4a21-9fc9-f602f6d8efd4",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T20:11:12.803797Z"
    },
    {
      "order_id": "af69b321-adac-405b-b1a7-f115e6c11bdd",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T20:09:35.473074Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "570224ac-c175-4f0a-9906-7a66151822b4",
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
  "last_heartbeat_at": "2026-10-28T20:11:12.269942Z",
  "last_location_at": "2026-10-28T20:11:12.269942Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/570224ac-c175-4f0a-9906-7a66151822b4/close` → **200**

```json
{
  "command_id": "3cd83894-c6a2-4846-8bd0-0a343ab1e5fb",
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

Done: operator bonus for fulfilled daed2a1a-6505-4a21-9fc9-f602f6d8efd4 and operator-fault cancellation 39e56457-c0b6-46c6-abec-08b0aae27b6b.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672178289",
  "device_ref": "sandbox-4160"
}
```

```json
{
  "challenge_id": "2b24f4e4-ba41-4468-8886-93ef98579a91",
  "expires_at": "2026-10-28T20:16:16.248209786Z",
  "resend_available_at": "2026-10-28T20:11:17.248209786Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672178289` → **200**

```json
{
  "phone": "+380672178289",
  "audience": "CLIENT",
  "code": "520814",
  "sent_at": "2026-10-28T20:11:16.249636817Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679080395",
  "device_ref": "sandbox-8260",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "23c3e38f-70fd-479f-88b5-41c34343cce1",
  "expires_at": "2026-10-28T20:16:16.43049837Z",
  "resend_available_at": "2026-10-28T20:11:17.43049837Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679080395` → **200**

```json
{
  "phone": "+380679080395",
  "audience": "CLIENT",
  "code": "602953",
  "sent_at": "2026-10-28T20:11:16.432077024Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677780000",
  "device_ref": "sandbox-9124"
}
```

```json
{
  "challenge_id": "4343c8be-ec66-43e3-8e4d-c4be74412d60",
  "expires_at": "2026-10-28T20:16:16.6125961Z",
  "resend_available_at": "2026-10-28T20:11:17.6125961Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677780000` → **200**

```json
{
  "phone": "+380677780000",
  "audience": "CLIENT",
  "code": "317057",
  "sent_at": "2026-10-28T20:11:16.615132242Z",
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
  "session_id": "7417c1e7-70d5-412a-99a4-20a6e1a4342d",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNzYsImlhdCI6MTc5MzIxODI3NiwianRpIjoiNmY3ZGFkOWUtMmJhNS00NWRlLThkMTgtZTI0OWY5NzA3ZjczIiwic2lkIjoiNzQxN2MxZTctNzBkNS00MTJhLTk5YTQtMjBhNmUxYTQzNDJkIn0.x-SxXrEAgbwCXyy5ahSIsKveNMHScA-CG-xGpV0Yqeo",
  "access_expires_at": "2026-10-28T20:26:16.998457847Z",
  "refresh_token": "47nL5R7etgVNQgWYYX1LG-byGtwQ4LHc44NG2GrkeMc",
  "refresh_expires_at": "2026-10-29T08:11:16.998040212Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677780000` → **200**

```json
{
  "deliveries": [
    {
      "id": "1cefd997-2bad-4185-8c7a-589ef8b1d23f",
      "challenge_id": "4343c8be-ec66-43e3-8e4d-c4be74412d60",
      "phone": "+380677780000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-131b1b6b-7839-433a-92f0-c4830c0aa307",
      "error": null,
      "attempted_at": "2026-10-28T20:11:16.615378Z"
    },
    {
      "id": "7442ea23-38e4-4a5e-a3a0-2c2c6bd6c2be",
      "challenge_id": "4343c8be-ec66-43e3-8e4d-c4be74412d60",
      "phone": "+380677780000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T20:11:16.614347Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677780000` → **200**

```json
{
  "phone": "+380677780000",
  "audience": "CLIENT",
  "code": "317057",
  "sent_at": "2026-10-28T20:11:16.615132242Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679080395` → **200**

```json
{
  "deliveries": [
    {
      "id": "f53988e7-8003-481e-8521-13d65f3c018c",
      "challenge_id": "23c3e38f-70fd-479f-88b5-41c34343cce1",
      "phone": "+380679080395",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bf8c1b68-cc9a-4e80-92c0-32743f607f27",
      "error": null,
      "attempted_at": "2026-10-28T20:11:16.432355Z"
    }
  ]
}
```

Done: SMS to +380672178289, a call to +380679080395, SMS then a call to +380677780000.

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
  "session_id": "341e9ca9-f49e-41b7-a0f5-42f8514ef86c",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNzcsImlhdCI6MTc5MzIxODI3NywianRpIjoiNzYzODIxZjEtZDA2Yi00ZTlhLWE2MGEtMzExNjQzOWE3YTNlIiwic2lkIjoiMzQxZTljYTktZjQ5ZS00MWI3LWEwZjUtNDJmODUxNGVmODZjIn0.rq7QvWQ1VdwifILAE-ekVGssugOudQuFulTWQ2NsUBM",
  "access_expires_at": "2026-10-28T20:26:17.724542354Z",
  "refresh_token": "Ouw4jBpHcWELlCRFQ0MXk_jGP_RGw2sfECWYTxhh5Z0",
  "refresh_expires_at": "2026-10-29T08:11:17.724198801Z",
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
  "session_id": "07ee9033-6643-4bda-a57e-cab493633919",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxNzgsImlhdCI6MTc5MzIxODI3OCwianRpIjoiMDlmOWY2NzYtODY2Yy00ODVkLTlhODUtZWViZTZlMWY1ZTk3Iiwic2lkIjoiMDdlZTkwMzMtNjY0My00YmRhLWE1N2UtY2FiNDkzNjMzOTE5In0.-tpb3-H5b89APhq9wH1AF_oTTQ6neEcBIrXxfwWmx9U",
  "access_expires_at": "2026-10-28T20:26:18.083325314Z",
  "refresh_token": "yXBWjFnuW_go6ubUbtvgsoKSVm7_BZFXmyGScAiGym8",
  "refresh_expires_at": "2026-10-29T08:11:18.083007395Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
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
    "payments.retry",
    "promotions.manage",
    "support.manage",
    "clients.manage",
    "clients.delete",
    "operator-bonuses.manage",
    "settings.manage",
    "flags.manage",
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

`POST /api/admin/v1/staff-extensions/9fa8bf63-3a19-4ee8-a4b0-db2fd3561583` → **200**

```json
{
  "command_id": "369bf3eb-3d19-4a36-aed3-e52a9547d7f9",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "578bd48f-b481-43f6-ad93-c09fbe4d02c4",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T20:11:18.773074Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T20:11:18.773074Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9e352b84-19f6-4fb2-a805-553793451158",
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
  "id": "676de559-1583-497e-b392-915980e380c1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:19.110440Z",
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
  "command_id": "3f97a798-5d52-484d-b253-a85c969edb2f",
  "quote_id": "676de559-1583-497e-b392-915980e380c1",
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
    "phone": "+380671004094"
  }
}
```

```json
{
  "id": "d841f812-fa28-4ef1-9e40-97d0b094147c",
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
  "created_at": "2026-10-28T20:11:19.284979Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671004094"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/d841f812-fa28-4ef1-9e40-97d0b094147c/calls` → **201**

```json
{
  "command_id": "6f1cc9b6-42fd-464e-b06b-cc904b3fa852",
  "to": "CALLER"
}
```

```json
{
  "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "order_ids": [
    "d841f812-fa28-4ef1-9e40-97d0b094147c"
  ],
  "started_at": "2026-10-28T20:11:19.4699Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/d841f812-fa28-4ef1-9e40-97d0b094147c/calls` → **201**

```json
{
  "command_id": "6f1cc9b6-42fd-464e-b06b-cc904b3fa852",
  "to": "CALLER"
}
```

```json
{
  "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "order_ids": [
    "d841f812-fa28-4ef1-9e40-97d0b094147c"
  ],
  "started_at": "2026-10-28T20:11:19.4699Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "177b5190-861a-4ae9-b22b-ad90054a3631",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671004094",
    "at": "2026-10-28T20:11:19.471769305Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.24352",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "177b5190-861a-4ae9-b22b-ad90054a3631"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=d841f812-fa28-4ef1-9e40-97d0b094147c` → **200**

```json
{
  "calls": [
    {
      "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [
        "d841f812-fa28-4ef1-9e40-97d0b094147c"
      ],
      "started_at": "2026-10-28T20:11:19.4699Z",
      "answered_at": "2026-10-28T20:11:19.863374Z",
      "ended_at": "2026-10-28T20:11:19.878736Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d841f812-fa28-4ef1-9e40-97d0b094147c` → **200**

```json
{
  "calls": [
    {
      "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [
        "d841f812-fa28-4ef1-9e40-97d0b094147c"
      ],
      "started_at": "2026-10-28T20:11:19.4699Z",
      "answered_at": "2026-10-28T20:11:19.863374Z",
      "ended_at": "2026-10-28T20:11:19.878736Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d841f812-fa28-4ef1-9e40-97d0b094147c` → **200**

```json
{
  "calls": [
    {
      "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [
        "d841f812-fa28-4ef1-9e40-97d0b094147c"
      ],
      "started_at": "2026-10-28T20:11:19.4699Z",
      "answered_at": "2026-10-28T20:11:19.863374Z",
      "ended_at": "2026-10-28T20:11:19.878736Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d841f812-fa28-4ef1-9e40-97d0b094147c` → **200**

```json
{
  "calls": [
    {
      "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [
        "d841f812-fa28-4ef1-9e40-97d0b094147c"
      ],
      "started_at": "2026-10-28T20:11:19.4699Z",
      "answered_at": "2026-10-28T20:11:19.863374Z",
      "ended_at": "2026-10-28T20:11:19.878736Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d841f812-fa28-4ef1-9e40-97d0b094147c` → **200**

```json
{
  "calls": [
    {
      "id": "177b5190-861a-4ae9-b22b-ad90054a3631",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "order_ids": [
        "d841f812-fa28-4ef1-9e40-97d0b094147c"
      ],
      "started_at": "2026-10-28T20:11:19.4699Z",
      "answered_at": "2026-10-28T20:11:19.863374Z",
      "ended_at": "2026-10-28T20:11:19.878736Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:11:27.921433Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/d841f812-fa28-4ef1-9e40-97d0b094147c` → **200**

```json
{
  "id": "d841f812-fa28-4ef1-9e40-97d0b094147c",
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
  "created_at": "2026-10-28T20:11:19.284979Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671004094"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d841f812-fa28-4ef1-9e40-97d0b094147c/cancel` → **200**

```json
{
  "command_id": "16e1ab6b-25f5-481c-8e71-ef386bf63ced",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d841f812-fa28-4ef1-9e40-97d0b094147c",
  "short_number": 20,
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
  "created_at": "2026-10-28T20:11:19.284979Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671004094"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "command_id": "ab04cf44-23f1-488c-bdca-47e42209c080",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T20:11:29.179267Z",
  "extension": "101"
}
```

Done: outgoing call 177b5190-861a-4ae9-b22b-ad90054a3631 from order d841f812-fa28-4ef1-9e40-97d0b094147c, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637595864",
  "device_ref": "sandbox-19842"
}
```

```json
{
  "challenge_id": "50154c0c-2926-40cc-af37-6443b4114635",
  "expires_at": "2026-10-28T20:16:29.396259885Z",
  "resend_available_at": "2026-10-28T20:11:30.396259885Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637595864` → **200**

```json
{
  "phone": "+380637595864",
  "audience": "CLIENT",
  "code": "957457",
  "sent_at": "2026-10-28T20:11:29.398938883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50154c0c-2926-40cc-af37-6443b4114635",
  "code": "957457",
  "device_ref": "sandbox-19842"
}
```

```json
{
  "session_id": "a78204dc-399e-41f6-b363-424a33c428b2",
  "subject": {
    "type": "CLIENT",
    "id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2M1OGY1My1kNDgxLTRiNmQtOGYyZi1hNmVlYzJmYjFjMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTg5LCJpYXQiOjE3OTMyMTgyODksImp0aSI6ImM5MThkN2Y0LTZkN2MtNGEwNi1hZDU0LTdhMjA2YjhkZGRmOSIsInNpZCI6ImE3ODIwNGRjLTM5OWUtNDFmNi1iMzYzLTQyNGEzM2M0MjhiMiJ9.36TrZWGrVJUUSQYk6IIRqxf1EsyUmT2H2as7x1xEAmg",
  "access_expires_at": "2026-10-28T20:26:29.586847307Z",
  "refresh_token": "IRSaqN2XnAjVvkBp87g1O3OXLz1m1ObaCX5XlPQPz7U",
  "refresh_expires_at": "2026-11-27T20:11:29.586237633Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15",
  "session_id": "a78204dc-399e-41f6-b363-424a33c428b2",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637595864",
  "device_ref": "sandbox-30087"
}
```

```json
{
  "challenge_id": "967a523d-1955-4b5e-b7b2-531e4fca83a1",
  "expires_at": "2026-10-28T20:16:31.91840379Z",
  "resend_available_at": "2026-10-28T20:11:32.91840379Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637595864` → **200**

```json
{
  "phone": "+380637595864",
  "audience": "CLIENT",
  "code": "105095",
  "sent_at": "2026-10-28T20:11:31.919786684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "967a523d-1955-4b5e-b7b2-531e4fca83a1",
  "code": "105095",
  "device_ref": "sandbox-30087"
}
```

```json
{
  "session_id": "79678928-d6cb-40b8-a3cc-96203f9f99b5",
  "subject": {
    "type": "CLIENT",
    "id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2M1OGY1My1kNDgxLTRiNmQtOGYyZi1hNmVlYzJmYjFjMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTkyLCJpYXQiOjE3OTMyMTgyOTIsImp0aSI6ImM0MDIwZjE3LTk2MjYtNDc4Yi1hMTUwLTBlZmE0YzY2YWVjMCIsInNpZCI6Ijc5Njc4OTI4LWQ2Y2ItNDBiOC1hM2NjLTk2MjAzZjlmOTliNSJ9.M_SVgUwPCCilBAB6O3ZgtPMijNUfwjhI2VYV9GQm3co",
  "access_expires_at": "2026-10-28T20:26:32.10177389Z",
  "refresh_token": "GgOUb_obJ1eTMX8G8ho3Es9bxh0kTgdN5n79dm778sc",
  "refresh_expires_at": "2026-11-27T20:11:32.10138515Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "1afbf9d0-f4cf-4da4-bdd1-3bfce52c045c",
  "expires_at": "2026-10-28T20:16:34.268795624Z",
  "resend_available_at": "2026-10-28T20:11:35.268795624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637595864` → **200**

```json
{
  "phone": "+380637595864",
  "audience": "CLIENT",
  "code": "728281",
  "sent_at": "2026-10-28T20:11:34.270242525Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632999042"
}
```

```json
{
  "challenge_id": "815d004c-aeeb-41ce-a7b1-07b6a723c633",
  "expires_at": "2026-10-28T20:16:34.453017353Z",
  "resend_available_at": "2026-10-28T20:11:35.453017353Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632999042` → **200**

```json
{
  "phone": "+380632999042",
  "audience": "CLIENT",
  "code": "270943",
  "sent_at": "2026-10-28T20:11:34.454520759Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "52c96267-2793-4a1b-a32d-b312e3024036",
  "current_challenge_id": "1afbf9d0-f4cf-4da4-bdd1-3bfce52c045c",
  "current_code": "000000",
  "new_challenge_id": "815d004c-aeeb-41ce-a7b1-07b6a723c633",
  "new_code": "270943"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "5e2b7adc-e3a8-40d1-bcd7-e00b9d1719db"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "0037d27c-8567-402c-ba61-e6e3a58609c9",
  "current_challenge_id": "1afbf9d0-f4cf-4da4-bdd1-3bfce52c045c",
  "current_code": "728281",
  "new_challenge_id": "815d004c-aeeb-41ce-a7b1-07b6a723c633",
  "new_code": "270943"
}
```

```json
{
  "subject_id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15",
  "phone": "+380632999042",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15",
  "session_id": "a78204dc-399e-41f6-b363-424a33c428b2",
  "account_state": "ACTIVE"
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
  "correlation_id": "58e1c8ed-ab03-41df-b807-a1457bccb21e"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632999042",
  "device_ref": "sandbox-26899"
}
```

```json
{
  "challenge_id": "91b8336a-f031-4ca9-9523-08fc7ffca256",
  "expires_at": "2026-10-28T20:16:37.312279433Z",
  "resend_available_at": "2026-10-28T20:11:38.312279433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632999042` → **200**

```json
{
  "phone": "+380632999042",
  "audience": "CLIENT",
  "code": "285854",
  "sent_at": "2026-10-28T20:11:37.313918804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91b8336a-f031-4ca9-9523-08fc7ffca256",
  "code": "285854",
  "device_ref": "sandbox-26899"
}
```

```json
{
  "session_id": "3ac4f764-fbea-46fa-91e5-b33b2b415799",
  "subject": {
    "type": "CLIENT",
    "id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2M1OGY1My1kNDgxLTRiNmQtOGYyZi1hNmVlYzJmYjFjMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTk3LCJpYXQiOjE3OTMyMTgyOTcsImp0aSI6ImVkOGEyNDNlLTg0MmYtNDUzZC05YzM5LWU3NDU4MGVkNzIyMCIsInNpZCI6IjNhYzRmNzY0LWZiZWEtNDZmYS05MWU1LWIzM2IyYjQxNTc5OSJ9.LLic9CfcOLz4sPJ4K1u5VAKaL6eu8tXUeFzCYt73kOY",
  "access_expires_at": "2026-10-28T20:26:37.506902781Z",
  "refresh_token": "UPJQfQ1tKHBuEJFZTqz_4hccMORlS7ff1xXrvG5ittE",
  "refresh_expires_at": "2026-11-27T20:11:37.506446333Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15",
  "session_id": "3ac4f764-fbea-46fa-91e5-b33b2b415799",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support sets another after checking who it is

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
  "session_id": "3f835c85-ab13-4dd0-a30f-9e0e8933d7ee",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkxOTgsImlhdCI6MTc5MzIxODI5OCwianRpIjoiYjA5ZDY5NWYtNmZlMC00YWExLTljZDgtNjY2MTg5NzRlN2NkIiwic2lkIjoiM2Y4MzVjODUtYWIxMy00ZGQwLWEzMGYtOWUwZTg5MzNkN2VlIn0.Tyca31jqu0FV0Dqz5OLg4ipd7K3mWigupu-lsGOmkTs",
  "access_expires_at": "2026-10-28T20:26:38.037298127Z",
  "refresh_token": "0RRUUjynjOCE_1XsmRlYxM3lV-XZ9I4czzkbygUSuLc",
  "refresh_expires_at": "2026-10-29T08:11:38.036899547Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15` → **200**

```json
{
  "client": {
    "id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15",
    "phone": "+380632999042",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T20:11:29.584694Z",
    "version": 3,
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

`POST /api/admin/v1/clients/7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15/phone` → **400**

```json
{
  "command_id": "385ee3af-5331-4993-b9a2-409c479cd273",
  "expected_version": 3,
  "phone": "+380635369388",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d394396d-64ad-4265-93eb-b98e0fcb402e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15/phone` → **200**

```json
{
  "command_id": "7f0bfce7-fb4a-4664-bcf2-fe27f47c2c0e",
  "expected_version": 3,
  "phone": "+380635369388",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15",
  "phone": "+380635369388",
  "version": 4
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
  "correlation_id": "6bea5b70-6ae0-451c-8869-4f3df6c18b59"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635369388",
  "device_ref": "sandbox-28855"
}
```

```json
{
  "challenge_id": "f4c30433-d174-4fdf-89ee-cabefd533839",
  "expires_at": "2026-10-28T20:16:38.916375793Z",
  "resend_available_at": "2026-10-28T20:11:39.916375793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635369388` → **200**

```json
{
  "phone": "+380635369388",
  "audience": "CLIENT",
  "code": "922251",
  "sent_at": "2026-10-28T20:11:38.918039781Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4c30433-d174-4fdf-89ee-cabefd533839",
  "code": "922251",
  "device_ref": "sandbox-28855"
}
```

```json
{
  "session_id": "d7035ca9-dfbd-4a7f-8a84-9b7330a96e2f",
  "subject": {
    "type": "CLIENT",
    "id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Y2M1OGY1My1kNDgxLTRiNmQtOGYyZi1hNmVlYzJmYjFjMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTk5LCJpYXQiOjE3OTMyMTgyOTksImp0aSI6IjY5NGNhNzk2LWYwOTktNDU4Yy05N2RhLWQxMjQxZjNiMTIxMSIsInNpZCI6ImQ3MDM1Y2E5LWRmYmQtNGE3Zi04YTg0LTliNzMzMGE5NmUyZiJ9.H5pzWs0GdGboSK7Pw1UxuShB0QyTvTQcL474HsxNv0Q",
  "access_expires_at": "2026-10-28T20:26:39.116587075Z",
  "refresh_token": "OXOq8qA8Hox1kjBuKHHe86jPc4ErpDb4X5ddH8215bo",
  "refresh_expires_at": "2026-11-27T20:11:39.116075936Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7cc58f53-d481-4b6d-8f2f-a6eec2fb1c15",
  "session_id": "d7035ca9-dfbd-4a7f-8a84-9b7330a96e2f",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638701729",
  "device_ref": "sandbox-9686"
}
```

```json
{
  "challenge_id": "b6dc91fa-2834-4676-8569-2358861ee867",
  "expires_at": "2026-10-28T20:16:39.457212404Z",
  "resend_available_at": "2026-10-28T20:11:40.457212404Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638701729` → **200**

```json
{
  "phone": "+380638701729",
  "audience": "CLIENT",
  "code": "377151",
  "sent_at": "2026-10-28T20:11:39.459102497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6dc91fa-2834-4676-8569-2358861ee867",
  "code": "377151",
  "device_ref": "sandbox-9686"
}
```

```json
{
  "session_id": "6869e79d-64cb-4f46-8561-6c62489ff83f",
  "subject": {
    "type": "CLIENT",
    "id": "8eae1be2-5609-4bbd-b93e-6af41bf2be50"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWFlMWJlMi01NjA5LTRiYmQtYjkzZS02YWY0MWJmMmJlNTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MTk5LCJpYXQiOjE3OTMyMTgyOTksImp0aSI6IjFmNGUxMWZhLTIzZjktNDA2NC1iOGQ1LTMwZDg5NThlNWQ5NiIsInNpZCI6IjY4NjllNzlkLTY0Y2ItNGY0Ni04NTYxLTZjNjI0ODlmZjgzZiJ9.1e0G1gJ8w9MgeM2nxNA3r2yVFgZuRxmVyTQ9jn6EN78",
  "access_expires_at": "2026-10-28T20:26:39.644364663Z",
  "refresh_token": "_GU61Y-xzdPWC-KceR5WRt9xDSNsiKGOhRpQEEDII-I",
  "refresh_expires_at": "2026-11-27T20:11:39.643973724Z",
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
  "session_id": "d83c0ded-c16c-4269-a1fa-62f95afb7741",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMDAsImlhdCI6MTc5MzIxODMwMCwianRpIjoiOTQ0NmU5M2EtODQzNS00ZTlmLWIzNDctYTQ2ZTEwYzVkYTg5Iiwic2lkIjoiZDgzYzBkZWQtYzE2Yy00MjY5LWExZmEtNjJmOTVhZmI3NzQxIn0.8_uMrizdhXi2CJUYQJ6Ir62R6wLXgLVxyoFoQAgUu6E",
  "access_expires_at": "2026-10-28T20:26:40.368418083Z",
  "refresh_token": "ZbIg3_0m1edlVzU8NjAH2UgZQ4qqjG4O9L2UAMJmMjk",
  "refresh_expires_at": "2026-10-29T08:11:40.367906462Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638701729` → **200**

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
  "correlation_id": "033c0d99-5a13-4651-b48f-e3e43bc9b5fc"
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
  "session_id": "d01ab264-0fff-4a57-9593-71ca3d56c5c1",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMDEsImlhdCI6MTc5MzIxODMwMSwianRpIjoiMzVmMGE2NWItYWJlOS00ODhmLWE5OGItMzc3MTBkNzM4NzVjIiwic2lkIjoiZDAxYWIyNjQtMGZmZi00YTU3LTk1OTMtNzFjYTNkNTZjNWMxIn0.Q3_VsE37eEQAnsidm6DjRRZWQRLzNsVMfqKAOBcDKSE",
  "access_expires_at": "2026-10-28T20:26:41.080061642Z",
  "refresh_token": "-RYpDr_5kHdcsaY-SA-mxSt-lvj7szDtQmNreww22Rc",
  "refresh_expires_at": "2026-10-29T08:11:41.079693722Z",
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
  "command_id": "687538ce-70e0-4ddf-8400-193f37b689f1",
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
  "changed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T20:11:41.441895924Z"
}
```

## The rider books the airport for 2026-10-28T23:11:40Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600421264",
  "device_ref": "sandbox-13119"
}
```

```json
{
  "challenge_id": "20927574-bcc1-4b76-817e-04d35ad9647f",
  "expires_at": "2026-10-28T20:16:41.627202091Z",
  "resend_available_at": "2026-10-28T20:11:42.627202091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600421264` → **200**

```json
{
  "phone": "+48600421264",
  "audience": "CLIENT",
  "code": "122995",
  "sent_at": "2026-10-28T20:11:41.641470362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20927574-bcc1-4b76-817e-04d35ad9647f",
  "code": "122995",
  "device_ref": "sandbox-13119"
}
```

```json
{
  "session_id": "51317981-110a-4cad-97ac-f258c43b7284",
  "subject": {
    "type": "CLIENT",
    "id": "91edf729-21ea-4c73-b1d8-6f6c25a756d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWVkZjcyOS0yMWVhLTRjNzMtYjFkOC02ZjZjMjVhNzU2ZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MjAxLCJpYXQiOjE3OTMyMTgzMDEsImp0aSI6ImNhNGVjMmMxLWZiY2UtNDczYi05OWY2LWVkZmY0MzE2NWE3OSIsInNpZCI6IjUxMzE3OTgxLTExMGEtNGNhZC05N2FjLWYyNThjNDNiNzI4NCJ9.la-U92LIYS3WSpdmnLaCEk8lh6Ilg1XjLZerYdD4hmo",
  "access_expires_at": "2026-10-28T20:26:41.834946445Z",
  "refresh_token": "QLsWMwY_vpg4NkR4-bQvQAR6aR8r4b1-fqzwF7B1gJw",
  "refresh_expires_at": "2026-11-27T20:11:41.834631591Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3abb092d-084b-41c0-ad4d-6c1233cb91aa",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T23:11:40Z"
}
```

```json
{
  "id": "7446760c-d570-43da-80ef-a0574b3f8c2a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:42.016462Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T23:11:40Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5b221dcb-60d6-4a90-bcad-1a351331486b",
  "quote_id": "7446760c-d570-43da-80ef-a0574b3f8c2a",
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
  "pickup_at": "2026-10-28T23:11:40Z"
}
```

```json
{
  "id": "bacd785a-6499-49cc-8756-c4d165ed6300",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "91edf729-21ea-4c73-b1d8-6f6c25a756d3",
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
  "created_at": "2026-10-28T20:11:42.209976Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T23:11:40Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-3833"
}
```

```json
{
  "challenge_id": "4fada9ee-485f-4f9c-a6bc-03d85d72cd62",
  "expires_at": "2026-10-28T20:16:42.401274328Z",
  "resend_available_at": "2026-10-28T20:11:43.401274328Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "050051",
  "sent_at": "2026-10-28T20:11:42.403082692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fada9ee-485f-4f9c-a6bc-03d85d72cd62",
  "code": "050051",
  "device_ref": "sandbox-3833"
}
```

```json
{
  "session_id": "0cf890e9-d4f3-4fe7-b861-e2b1d5346aca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTIwMiwiaWF0IjoxNzkzMjE4MzAyLCJqdGkiOiI3MTQ2MWQ2Mi1hNmY4LTRkZDAtODgzMy0xYzVlNjljNWU5ZGUiLCJzaWQiOiIwY2Y4OTBlOS1kNGYzLTRmZTctYjg2MS1lMmIxZDUzNDZhY2EifQ.Plc_DGWHENvs4EDGzkgsQgY1Hn7z_6E3E0yOf5womFs",
  "access_expires_at": "2026-10-28T20:26:42.587795681Z",
  "refresh_token": "TOu5krMIE-aGzniVCUU1wr7Ct7srIuglwRSNfuN7dzA",
  "refresh_expires_at": "2026-11-27T20:11:42.587461126Z",
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
  "command_id": "a16f5f09-7405-4d40-8408-33645e28e12b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:11:42Z",
    "sequence": 1793218302935
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8435fe1-ce48-4be9-94b1-0124e90a2f0d",
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
  "last_heartbeat_at": "2026-10-28T20:11:42.950564Z",
  "last_location_at": "2026-10-28T20:11:42.950564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "bacd785a-6499-49cc-8756-c4d165ed6300",
      "short_number": 21,
      "pickup_at": "2026-10-28T23:11:40Z",
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

`POST /api/driver/v1/preorders/bacd785a-6499-49cc-8756-c4d165ed6300/reserve` → **200**

```json
{
  "command_id": "4393890d-b9d6-4f2b-b1fb-b78a967143a2"
}
```

```json
{
  "id": "4bda17fb-4831-4b76-9520-5a03be78b935",
  "state": "RESERVED",
  "order": {
    "order_id": "bacd785a-6499-49cc-8756-c4d165ed6300",
    "short_number": 21,
    "pickup_at": "2026-10-28T23:11:40Z",
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
  "reserved_at": "2026-10-28T20:11:43.315876Z",
  "confirm_from": "2026-10-28T22:41:40Z",
  "confirm_until": "2026-10-28T22:51:40Z",
  "drop_until": "2026-10-28T22:11:40Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "4bda17fb-4831-4b76-9520-5a03be78b935",
      "state": "RESERVED",
      "order": {
        "order_id": "bacd785a-6499-49cc-8756-c4d165ed6300",
        "short_number": 21,
        "pickup_at": "2026-10-28T23:11:40Z",
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
      "reserved_at": "2026-10-28T20:11:43.315876Z",
      "confirm_from": "2026-10-28T22:41:40Z",
      "confirm_until": "2026-10-28T22:51:40Z",
      "drop_until": "2026-10-28T22:11:40Z"
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
      "id": "4bda17fb-4831-4b76-9520-5a03be78b935",
      "state": "RESERVED",
      "order": {
        "order_id": "bacd785a-6499-49cc-8756-c4d165ed6300",
        "short_number": 21,
        "pickup_at": "2026-10-28T23:11:40Z",
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
      "reserved_at": "2026-10-28T20:11:43.315876Z",
      "confirm_from": "2026-10-28T22:41:40Z",
      "confirm_until": "2026-10-28T22:51:40Z",
      "drop_until": "2026-10-28T22:11:40Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/4bda17fb-4831-4b76-9520-5a03be78b935/confirm` → **409**

```json
{
  "command_id": "32a590ec-0a4c-4000-abc4-726afdcb4a29"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/4bda17fb-4831-4b76-9520-5a03be78b935/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "05db708d-a62d-4eec-9d59-e0fae77c8c28"
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
  "session_id": "926c97e0-7f53-4d87-8193-f06381ead84c",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMDQsImlhdCI6MTc5MzIxODMwNCwianRpIjoiM2E3M2U5NjctNjk4ZS00MWFmLTgyOTMtNzhhMDUyMjNkMDA4Iiwic2lkIjoiOTI2Yzk3ZTAtN2Y1My00ZDg3LTgxOTMtZjA2MzgxZWFkODRjIn0.P5-eUxVxhCGe3zx7JASIabrGfgriszPIXytIbf9eXBI",
  "access_expires_at": "2026-10-28T20:26:44.241501194Z",
  "refresh_token": "IgZzmtofMTf9ke17l6e24qkakrXwufOFHjjPjohCd6A",
  "refresh_expires_at": "2026-10-29T08:11:44.241117697Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bacd785a-6499-49cc-8756-c4d165ed6300` → **200**

```json
{
  "id": "bacd785a-6499-49cc-8756-c4d165ed6300",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "91edf729-21ea-4c73-b1d8-6f6c25a756d3",
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
  "created_at": "2026-10-28T20:11:42.209976Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T23:11:40Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "4bda17fb-4831-4b76-9520-5a03be78b935",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T20:11:43.315876Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/bacd785a-6499-49cc-8756-c4d165ed6300/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T20:11:42.211094Z",
      "actor": {
        "type": "CLIENT",
        "id": "91edf729-21ea-4c73-b1d8-6f6c25a756d3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "bacd785a-6499-49cc-8756-c4d165ed6300",
        "preorder": true,
        "quote_id": "7446760c-d570-43da-80ef-a0574b3f8c2a",
        "pickup_at": "2026-10-28T23:11:40Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "202e47e1-4b57-4207-89a4-03c5076ec87e"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T20:11:43.316839Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bacd785a-6499-49cc-8756-c4d165ed6300",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "4bda17fb-4831-4b76-9520-5a03be78b935"
      },
      "correlation_id": "52e64646-d0da-4f09-a459-d16b9ef508c1"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order bacd785a-6499-49cc-8756-c4d165ed6300, reservation 4bda17fb-4831-4b76-9520-5a03be78b935.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28772"
}
```

```json
{
  "challenge_id": "535ebab3-e65b-4366-b8a3-a58d7e97134e",
  "expires_at": "2026-10-28T20:16:44.785035547Z",
  "resend_available_at": "2026-10-28T20:11:45.785035547Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "659252",
  "sent_at": "2026-10-28T20:11:44.787103482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "535ebab3-e65b-4366-b8a3-a58d7e97134e",
  "code": "659252",
  "device_ref": "sandbox-28772"
}
```

```json
{
  "session_id": "47708830-6320-443f-89c6-1ccc9eab3247",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTIwNCwiaWF0IjoxNzkzMjE4MzA0LCJqdGkiOiI0MTA2NWVjMi04MzZmLTQ3MWEtYmEzNy00ZTY5ZTFiZWU2NjQiLCJzaWQiOiI0NzcwODgzMC02MzIwLTQ0M2YtODljNi0xY2NjOWVhYjMyNDcifQ.tbu9QdvrXezHYuQ6dHYFkRwXK21N1GWwMdzxttd3PaY",
  "access_expires_at": "2026-10-28T20:26:44.976627458Z",
  "refresh_token": "OSL9YwBPfO34VozwheKrfca3XaAMK5ogQEpyaEF9M_Y",
  "refresh_expires_at": "2026-11-27T20:11:44.976134045Z",
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
  "command_id": "22f0fb92-a396-41e4-8703-aa23d80cc207",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:11:45Z",
    "sequence": 1793218305313
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "861fd16f-66a7-4635-aa89-db56a2160924",
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
  "last_heartbeat_at": "2026-10-28T20:11:45.327996Z",
  "last_location_at": "2026-10-28T20:11:45.327996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675914284",
  "device_ref": "sandbox-26492"
}
```

```json
{
  "challenge_id": "615431a8-b4dd-491c-942c-e9b97115b7a1",
  "expires_at": "2026-10-28T20:16:45.502199336Z",
  "resend_available_at": "2026-10-28T20:11:46.502199336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675914284` → **200**

```json
{
  "phone": "+380675914284",
  "audience": "CLIENT",
  "code": "190919",
  "sent_at": "2026-10-28T20:11:45.503982373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "615431a8-b4dd-491c-942c-e9b97115b7a1",
  "code": "190919",
  "device_ref": "sandbox-26492"
}
```

```json
{
  "session_id": "38d03d18-d948-408e-99b8-2938a628403f",
  "subject": {
    "type": "CLIENT",
    "id": "731f49c1-2edb-44f7-b5e7-b1930b74e65a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzFmNDljMS0yZWRiLTQ0ZjctYjVlNy1iMTkzMGI3NGU2NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MjA1LCJpYXQiOjE3OTMyMTgzMDUsImp0aSI6IjkyYzBhMDg3LTdhZWYtNDYxMS1hMDYwLWM2ZDNkZWM5M2E0MiIsInNpZCI6IjM4ZDAzZDE4LWQ5NDgtNDA4ZS05OWI4LTI5MzhhNjI4NDAzZiJ9.EjiY8VlDWkT81TdNEyYHVhpJNFBSxhLeu53IjrX521U",
  "access_expires_at": "2026-10-28T20:26:45.699190518Z",
  "refresh_token": "99K6TWNfDdQ4jQr-64U9G4vdQCl4dFPM7cOpfitYIoQ",
  "refresh_expires_at": "2026-11-27T20:11:45.698869985Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "513c1c69-3bdd-4cad-a5cd-a7c3eac6c7c1",
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
  "id": "ed702470-0edb-4a7b-bb8f-a50a000604d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:16:45.876903Z",
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
  "command_id": "8c6f137c-11f3-42fe-80f6-89e362bf7c26",
  "quote_id": "ed702470-0edb-4a7b-bb8f-a50a000604d1",
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
  "id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "731f49c1-2edb-44f7-b5e7-b1930b74e65a",
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
  "created_at": "2026-10-28T20:11:46.061555Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e0e39692-23da-4ca2-a2ea-a57e5db4e401",
    "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
    "expires_at": "2026-10-28T20:12:01.063799Z",
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

`POST /api/driver/v1/offers/e0e39692-23da-4ca2-a2ea-a57e5db4e401/accept` → **200**

```json
{
  "command_id": "bcb748b5-f0e1-4da3-9c71-8b879150bccd"
}
```

```json
{
  "id": "7a1be4e4-b0e1-4ff3-8725-9311511e792a",
  "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bf524c3a-8a64-44ae-80b1-8f651d48e9a6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bf524c3a-8a64-44ae-80b1-8f651d48e9a6",
  "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "assignment_id": "7a1be4e4-b0e1-4ff3-8725-9311511e792a",
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

`POST /api/driver/v1/work-sessions/861fd16f-66a7-4635-aa89-db56a2160924/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:11:46Z",
    "sequence": 1793218306794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "861fd16f-66a7-4635-aa89-db56a2160924",
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
  "last_heartbeat_at": "2026-10-28T20:11:46.809017Z",
  "last_location_at": "2026-10-28T20:11:46.809017Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bf524c3a-8a64-44ae-80b1-8f651d48e9a6",
  "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "assignment_id": "7a1be4e4-b0e1-4ff3-8725-9311511e792a",
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

`POST /api/driver/v1/trips/bf524c3a-8a64-44ae-80b1-8f651d48e9a6/arrive` → **200**

```json
{
  "command_id": "33329ebe-5f60-47d0-a60d-0461e4d8b599",
  "expected_version": 0
}
```

```json
{
  "id": "bf524c3a-8a64-44ae-80b1-8f651d48e9a6",
  "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "assignment_id": "7a1be4e4-b0e1-4ff3-8725-9311511e792a",
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
  "arrived_at": "2026-10-28T20:11:47.141116Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bf524c3a-8a64-44ae-80b1-8f651d48e9a6/start` → **200**

```json
{
  "command_id": "07adf834-79d1-4880-b489-2e9d8ce7d2cf",
  "expected_version": 1
}
```

```json
{
  "id": "bf524c3a-8a64-44ae-80b1-8f651d48e9a6",
  "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "assignment_id": "7a1be4e4-b0e1-4ff3-8725-9311511e792a",
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
  "arrived_at": "2026-10-28T20:11:47.141116Z",
  "started_at": "2026-10-28T20:11:47.318943Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/861fd16f-66a7-4635-aa89-db56a2160924/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:11:47Z",
    "sequence": 1793218307488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "861fd16f-66a7-4635-aa89-db56a2160924",
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
  "last_heartbeat_at": "2026-10-28T20:11:47.502966Z",
  "last_location_at": "2026-10-28T20:11:47.502966Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/bf524c3a-8a64-44ae-80b1-8f651d48e9a6/complete` → **200**

```json
{
  "command_id": "de36bc2e-3bdb-4a35-8909-2929f9470c3e",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:11:47Z",
  "cash_received": true
}
```

```json
{
  "id": "bf524c3a-8a64-44ae-80b1-8f651d48e9a6",
  "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "assignment_id": "7a1be4e4-b0e1-4ff3-8725-9311511e792a",
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
  "arrived_at": "2026-10-28T20:11:47.141116Z",
  "started_at": "2026-10-28T20:11:47.318943Z",
  "completed_at": "2026-10-28T20:11:47.667803Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3faa570f-1cf1-4a78-8517-823798abf326/rating` → **200**

```json
{
  "command_id": "f75989a0-89ca-4afa-afb2-4513e624b538",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "score": 5,
  "created_at": "2026-10-28T20:11:47.850953263Z"
}
```

`POST /api/driver/v1/orders/3faa570f-1cf1-4a78-8517-823798abf326/rating` → **200**

```json
{
  "command_id": "d6db8605-dd88-4478-8e89-4d5d759b8a7f",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
  "score": 4,
  "created_at": "2026-10-28T20:11:48.02306871Z"
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
  "session_id": "347e1b33-8692-4c20-b2cc-bbce602bff8d",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMDgsImlhdCI6MTc5MzIxODMwOCwianRpIjoiOGM1Yjc0YjItZWI2Zi00ZDFlLWJkYmItYjhmMWExNTliZjlkIiwic2lkIjoiMzQ3ZTFiMzMtODY5Mi00YzIwLWIyY2MtYmJjZTYwMmJmZjhkIn0.HQIsIFAFkVsNATrkoDreDpp2ZVOsgfgVj1ny7iSXhwo",
  "access_expires_at": "2026-10-28T20:26:48.559040501Z",
  "refresh_token": "iv_buBBRBW0WtaBazKYqoZXfFsVkmHu9_N3WSAiYgbg",
  "refresh_expires_at": "2026-10-29T08:11:48.558728842Z",
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
  "session_id": "949413cd-c196-45ff-9fb3-f584608a02c3",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMDgsImlhdCI6MTc5MzIxODMwOCwianRpIjoiODY2ZTliMGEtY2Y4Ni00ZWY4LWJlNDAtY2JiNWNkMzExMDJkIiwic2lkIjoiOTQ5NDEzY2QtYzE5Ni00NWZmLTlmYjMtZjU4NDYwOGEwMmMzIn0.u8rhJO7tC36b-FmhlnbQQ8yMgo8hVrBIeNtjSrEL4nk",
  "access_expires_at": "2026-10-28T20:26:48.928906193Z",
  "refresh_token": "ApM7w_gy8QsKxBpD0xrbq6g_sOjhqDV47Yo6h-yDkPs",
  "refresh_expires_at": "2026-10-29T08:11:48.928590367Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3faa570f-1cf1-4a78-8517-823798abf326/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
      "author_type": "RIDER",
      "author_id": "731f49c1-2edb-44f7-b5e7-b1930b74e65a",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T20:11:47.850953Z"
    },
    {
      "order_id": "3faa570f-1cf1-4a78-8517-823798abf326",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "731f49c1-2edb-44f7-b5e7-b1930b74e65a",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T20:11:48.023069Z"
    }
  ]
}
```

Done: ratings for order 3faa570f-1cf1-4a78-8517-823798abf326.

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
  "session_id": "b86d15cf-d8dc-47e8-bbfd-ca8707a0f2b1",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMDksImlhdCI6MTc5MzIxODMwOSwianRpIjoiNTUyMTRlNmYtZjQyOC00MmQwLTljNzEtMTliNTY0NmE5NThjIiwic2lkIjoiYjg2ZDE1Y2YtZDhkYy00N2U4LWJiZmQtY2E4NzA3YTBmMmIxIn0.xUWBTHCLi4zFQP-8AIhM60lYnkU-fMBB2uj802Gowes",
  "access_expires_at": "2026-10-28T20:26:49.469026912Z",
  "refresh_token": "t7wU9K0Gba6ObVWiwk-uq6efeMmhUto63SVkgHg-f64",
  "refresh_expires_at": "2026-10-29T08:11:49.468734601Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "21797de2-0950-4cba-883f-129f3df71700",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "ff0b9ad0-807f-44e7-84c7-02262e303aaf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:49.641042Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff0b9ad0-807f-44e7-84c7-02262e303aaf` → **200**

```json
{
  "id": "ff0b9ad0-807f-44e7-84c7-02262e303aaf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:49.641042Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff0b9ad0-807f-44e7-84c7-02262e303aaf` → **200**

```json
{
  "id": "ff0b9ad0-807f-44e7-84c7-02262e303aaf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:49.641042Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff0b9ad0-807f-44e7-84c7-02262e303aaf` → **200**

```json
{
  "id": "ff0b9ad0-807f-44e7-84c7-02262e303aaf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:49.641042Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ff0b9ad0-807f-44e7-84c7-02262e303aaf` → **200**

```json
{
  "id": "ff0b9ad0-807f-44e7-84c7-02262e303aaf",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T20:11:49.641042Z",
  "ready_at": "2026-10-28T20:11:52.933792Z",
  "expires_at": "2026-10-29T20:11:52.933792Z"
}
```

`GET /api/admin/v1/reports/exports/ff0b9ad0-807f-44e7-84c7-02262e303aaf/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
total,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1ac5f1df-b523-47cb-beec-fc49a8090789",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "876eaf92-dc1c-4a19-ac8e-393b1a5138e4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:53.50127Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/876eaf92-dc1c-4a19-ac8e-393b1a5138e4` → **200**

```json
{
  "id": "876eaf92-dc1c-4a19-ac8e-393b1a5138e4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:53.50127Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/876eaf92-dc1c-4a19-ac8e-393b1a5138e4` → **200**

```json
{
  "id": "876eaf92-dc1c-4a19-ac8e-393b1a5138e4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:53.50127Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/876eaf92-dc1c-4a19-ac8e-393b1a5138e4` → **200**

```json
{
  "id": "876eaf92-dc1c-4a19-ac8e-393b1a5138e4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:53.50127Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/876eaf92-dc1c-4a19-ac8e-393b1a5138e4` → **200**

```json
{
  "id": "876eaf92-dc1c-4a19-ac8e-393b1a5138e4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:11:53.50127Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/876eaf92-dc1c-4a19-ac8e-393b1a5138e4` → **200**

```json
{
  "id": "876eaf92-dc1c-4a19-ac8e-393b1a5138e4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T20:11:53.50127Z",
  "ready_at": "2026-10-28T20:11:57.939297Z",
  "expires_at": "2026-10-29T20:11:57.939297Z"
}
```

`GET /api/admin/v1/reports/exports/876eaf92-dc1c-4a19-ac8e-393b1a5138e4/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9f98c35a-3b84-42a7-8256-0f51a85ba1c0` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9f98c35a-3b84-42a7-8256-0f51a85ba1c0",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9f795a94-2564-4468-827a-03287af3cdd6"
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
  "device_ref": "sandbox-7285"
}
```

```json
{
  "challenge_id": "445f900e-aada-45d4-8f48-39d3fbddfa1f",
  "expires_at": "2026-10-28T20:16:58.704573175Z",
  "resend_available_at": "2026-10-28T20:11:59.704573175Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "371505",
  "sent_at": "2026-10-28T20:11:58.70677242Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "445f900e-aada-45d4-8f48-39d3fbddfa1f",
  "code": "371505",
  "device_ref": "sandbox-7285"
}
```

```json
{
  "session_id": "b989e18d-da99-4df0-a5ac-d4405702f4f0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTIxOCwiaWF0IjoxNzkzMjE4MzE4LCJqdGkiOiI5YTMxNmI1ZC1iZGE1LTRjNzUtOTFlMC0xNzM5NTFlNmI0N2UiLCJzaWQiOiJiOTg5ZTE4ZC1kYTk5LTRkZjAtYTVhYy1kNDQwNTcwMmY0ZjAifQ.I0iWAdFWXDcsE9CRBhUE2cDwWIj72ryTXiu4zIh8qQs",
  "access_expires_at": "2026-10-28T20:26:58.889153891Z",
  "refresh_token": "O4_fnYrp96LRk5CvlrWuVNccw8Gl3qlq11ED26H56z4",
  "refresh_expires_at": "2026-11-27T20:11:58.888832848Z",
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
  "command_id": "b76c0386-9792-41b5-9faf-f892297d6952",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:11:59Z",
    "sequence": 1793218319367
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "67c4f557-fa82-4675-96db-f0f47d5dc0dc",
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
  "last_heartbeat_at": "2026-10-28T20:11:59.381018Z",
  "last_location_at": "2026-10-28T20:11:59.381018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "51bf83ce-5283-4dba-8cc6-6422c7288c27",
  "points": [
    {
      "sequence": 1793218321552,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T20:11:01Z"
    },
    {
      "sequence": 1793218321557,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T20:12:01Z"
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
  "session_id": "c284332d-bf5d-4c27-92bb-63082da7bb47",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMjEsImlhdCI6MTc5MzIxODMyMSwianRpIjoiNWFiNzYxZjEtZGJlOC00N2FjLTkyMzQtZDU5NzcyMTc4YWZmIiwic2lkIjoiYzI4NDMzMmQtYmY1ZC00YzI3LTkyYmItNjMwODJkYTdiYjQ3In0.-A2B5IV1uliAlA2WbrkTHeKvPzwlM0xbFzZWfKsVECk",
  "access_expires_at": "2026-10-28T20:27:01.940493642Z",
  "refresh_token": "ZphyOtGmHynL17RIHB7-cqAzkLVc5pCn-cQ7xsny9zg",
  "refresh_expires_at": "2026-10-29T08:12:01.940118277Z",
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
      "id": "947e8ed7-1cda-4961-9d56-16bc616cbec2",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T20:12:01Z",
        "track_point_id": "27af3354-d009-4085-b5ee-aa379cf9d366",
        "work_session_id": "67c4f557-fa82-4675-96db-f0f47d5dc0dc"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T20:12:01Z",
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

`POST /api/admin/v1/driver-risk-flags/947e8ed7-1cda-4961-9d56-16bc616cbec2/confirm` → **200**

```json
{
  "command_id": "64aa9cc0-1e8e-4cf9-9494-f25766c86bcd",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "947e8ed7-1cda-4961-9d56-16bc616cbec2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T20:12:01Z",
    "track_point_id": "27af3354-d009-4085-b5ee-aa379cf9d366",
    "work_session_id": "67c4f557-fa82-4675-96db-f0f47d5dc0dc"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T20:12:01Z",
  "reason": null,
  "reviewed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "reviewed_at": "2026-10-28T20:12:03.6555Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/947e8ed7-1cda-4961-9d56-16bc616cbec2/dismiss` → **409**

```json
{
  "command_id": "42139bcf-eb26-46cf-9f33-5425582ecb4f",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/947e8ed7-1cda-4961-9d56-16bc616cbec2/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "71de6514-d008-41c7-b9bd-1893e060892f"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "57a89e9e-c261-4ce3-a248-585ea8a6856b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "87691c43-1a1a-4e70-a4e7-3da7b4918e3e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "raised_at": "2026-10-28T20:12:04.027455Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/87691c43-1a1a-4e70-a4e7-3da7b4918e3e/dismiss` → **200**

```json
{
  "command_id": "10a651f5-e53b-4ac0-93bb-9f8485f3221c",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "87691c43-1a1a-4e70-a4e7-3da7b4918e3e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "raised_at": "2026-10-28T20:12:04.027455Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "reviewed_at": "2026-10-28T20:12:04.20864Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "e4cad009-e2b1-4b21-b5b7-503c743229ae",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "947e8ed7-1cda-4961-9d56-16bc616cbec2"
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
      "actor_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T20:12:04.394215Z"
    }
  ]
}
```

Done: flag 947e8ed7-1cda-4961-9d56-16bc616cbec2 confirmed, suspension named it, driver reinstated.

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
  "session_id": "322d4248-128d-45b6-9505-2cfbd96440b3",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMjQsImlhdCI6MTc5MzIxODMyNCwianRpIjoiZmVlMTNlMjktMDQ4NS00OGZjLWJjYjUtZDA1OGY3NDkwMDM1Iiwic2lkIjoiMzIyZDQyNDgtMTI4ZC00NWI2LTk1MDUtMmNmYmQ5NjQ0MGIzIn0.ui-FMYGvtWFBhgJM4A1uG3oG9Q_vGlLBk0I5T-_ScRQ",
  "access_expires_at": "2026-10-28T20:27:04.943401134Z",
  "refresh_token": "oTHX6GeLdL0UjSY4rDU6NjAP8StayDH7RBDLHJiBvXM",
  "refresh_expires_at": "2026-10-29T08:12:04.943073611Z",
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
      "actor_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T20:12:04.394215Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "62f70a6b-fb31-44da-9919-f7e02b754c9a",
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
  "session_id": "67c4f557-fa82-4675-96db-f0f47d5dc0dc",
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
  "last_heartbeat_at": "2026-10-28T20:11:59.381018Z",
  "last_location_at": "2026-10-28T20:11:59.381018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/67c4f557-fa82-4675-96db-f0f47d5dc0dc/close` → **200**

```json
{
  "command_id": "b49adee0-a2d1-479f-9e51-5bcbf98b4901",
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
  "session_id": "f9d47680-7a15-4726-8046-9fb5df312ffa",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMjUsImlhdCI6MTc5MzIxODMyNSwianRpIjoiYTQ3YTEyNWItMThiZC00M2Y4LTlmMjItNzUzNzdjYjljY2MxIiwic2lkIjoiZjlkNDc2ODAtN2ExNS00NzI2LTgwNDYtOWZiNWRmMzEyZmZhIn0.1fG4cv9rCbgHO1dCFXOEqsOgx0zYlGWvFgQAUea69u4",
  "access_expires_at": "2026-10-28T20:27:05.976204747Z",
  "refresh_token": "Hf4Zz-jTOdJxz3ghp31a8qaZwCS5S0G90xNENZpIECI",
  "refresh_expires_at": "2026-10-29T08:12:05.975836262Z",
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
  "command_id": "8f29f0cf-6fa4-43e5-8bdc-ea3503972dc5",
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
  "changed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T20:12:06.324206Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "8f29f0cf-6fa4-43e5-8bdc-ea3503972dc5",
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
  "changed_by": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T20:12:06.324206Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48836097932",
  "device_ref": "sandbox-14929"
}
```

```json
{
  "challenge_id": "c4b1c9c2-dbd9-40bf-9ca5-5dbb48914bf2",
  "expires_at": "2026-10-28T20:17:06.673219586Z",
  "resend_available_at": "2026-10-28T20:12:07.673219586Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48836097932` → **200**

```json
{
  "phone": "+48836097932",
  "audience": "CLIENT",
  "code": "431192",
  "sent_at": "2026-10-28T20:12:06.67492806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4b1c9c2-dbd9-40bf-9ca5-5dbb48914bf2",
  "code": "431192",
  "device_ref": "sandbox-14929"
}
```

```json
{
  "session_id": "649b2a5d-0bc5-449e-a9c1-71f4426abb9f",
  "subject": {
    "type": "CLIENT",
    "id": "c65d767f-a4c5-404c-8a8e-d32a2b8e9add"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjVkNzY3Zi1hNGM1LTQwNGMtOGE4ZS1kMzJhMmI4ZTlhZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MjI2LCJpYXQiOjE3OTMyMTgzMjYsImp0aSI6ImQ1YzMwMDhiLTEwOTgtNDEwZS1iY2Q3LWI5OGI5ZTU0MGM2ZiIsInNpZCI6IjY0OWIyYTVkLTBiYzUtNDQ5ZS1hOWMxLTcxZjQ0MjZhYmI5ZiJ9.ub2Hap9fQrXgnMdBb0KduGAzL8TucnHoT8gYRGuFVWI",
  "access_expires_at": "2026-10-28T20:27:06.863554297Z",
  "refresh_token": "gojp8oa9GHK6ePLoVDJDTRO8r_S-23EXn_hV_sk_0L8",
  "refresh_expires_at": "2026-11-27T20:12:06.863111179Z",
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
  "correlation_id": "d81415fc-3775-4d9e-844c-bc97f57564b7"
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
  "device_ref": "sandbox-19995"
}
```

```json
{
  "challenge_id": "3844c736-51f6-4b0b-a2bf-49b414560cc7",
  "expires_at": "2026-10-28T20:17:07.356930611Z",
  "resend_available_at": "2026-10-28T20:12:08.356930611Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "861640",
  "sent_at": "2026-10-28T20:12:07.358514286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3844c736-51f6-4b0b-a2bf-49b414560cc7",
  "code": "861640",
  "device_ref": "sandbox-19995"
}
```

```json
{
  "session_id": "5a570bda-b4a3-4a36-8d78-163f1e3ce120",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTIyNywiaWF0IjoxNzkzMjE4MzI3LCJqdGkiOiIyMDQ0Y2YzNS1hMWQyLTRhMDQtYTZmOC1hOGI4MWI1Yjc0Y2UiLCJzaWQiOiI1YTU3MGJkYS1iNGEzLTRhMzYtOGQ3OC0xNjNmMWUzY2UxMjAifQ.Nlb-AaM0LiTJkBYPamuFURdfHoLDb5XfCrn0fGd0q2o",
  "access_expires_at": "2026-10-28T20:27:07.544500555Z",
  "refresh_token": "sB6RptJgkgqEJ3dBwYkFDsnHOkgD5Dpfm8JwstvX4JA",
  "refresh_expires_at": "2026-11-27T20:12:07.543922776Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8435fe1-ce48-4be9-94b1-0124e90a2f0d",
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
  "last_heartbeat_at": "2026-10-28T20:11:42.950564Z",
  "last_location_at": "2026-10-28T20:11:42.950564Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c8435fe1-ce48-4be9-94b1-0124e90a2f0d/handover` → **200**

```json
{
  "command_id": "38f91934-be62-403c-8a58-a53b259b10fb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8435fe1-ce48-4be9-94b1-0124e90a2f0d",
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
  "last_heartbeat_at": "2026-10-28T20:11:42.950564Z",
  "last_location_at": "2026-10-28T20:11:42.950564Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c8435fe1-ce48-4be9-94b1-0124e90a2f0d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:12:08Z",
    "sequence": 1793218328381
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "c8435fe1-ce48-4be9-94b1-0124e90a2f0d",
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
  "last_heartbeat_at": "2026-10-28T20:12:08.052949Z",
  "last_location_at": "2026-10-28T20:12:08.052949Z",
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
  "session_id": "c8435fe1-ce48-4be9-94b1-0124e90a2f0d",
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
  "last_heartbeat_at": "2026-10-28T20:12:08.052949Z",
  "last_location_at": "2026-10-28T20:12:08.052949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8435fe1-ce48-4be9-94b1-0124e90a2f0d/close` → **200**

```json
{
  "command_id": "709752ef-1d01-4c0f-b2bb-a6cd10d6491c",
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
  "correlation_id": "34b75aea-cc94-4dc6-a80e-48cc777bec9e"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670321208",
  "device_ref": "sandbox-15346"
}
```

```json
{
  "challenge_id": "a51e413b-8ce4-46ab-8d01-4a884f494cb6",
  "expires_at": "2026-10-28T20:17:08.90413028Z",
  "resend_available_at": "2026-10-28T20:12:09.90413028Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670321208` → **200**

```json
{
  "phone": "+380670321208",
  "audience": "CLIENT",
  "code": "119661",
  "sent_at": "2026-10-28T20:12:08.90581673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a51e413b-8ce4-46ab-8d01-4a884f494cb6",
  "code": "119661",
  "device_ref": "sandbox-15346"
}
```

```json
{
  "session_id": "8f016b2c-38a9-401a-a054-0e2690c61f68",
  "subject": {
    "type": "CLIENT",
    "id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzUyYzkwMi01ODc0LTRkMWMtYTVlYS0zZjAzZGUxYjJhZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MjI5LCJpYXQiOjE3OTMyMTgzMjksImp0aSI6IjBjMmQ3NzM1LWExYjUtNDlhMC05YjMxLTUyM2YwN2ExMzIxNyIsInNpZCI6IjhmMDE2YjJjLTM4YTktNDAxYS1hMDU0LTBlMjY5MGM2MWY2OCJ9.r4Bt_ptlB-p_uxPjkvpCrfsqVg0cF9f5z-F2cMzy_sQ",
  "access_expires_at": "2026-10-28T20:27:09.087097617Z",
  "refresh_token": "AiMxuUtH6eyp7ba2o6XXou9vQBiup03H9ku5NT7OPpA",
  "refresh_expires_at": "2026-11-27T20:12:09.086761671Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "ecbe5b9d-f300-406f-8de0-04ba0c7d60d3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a654ab2f-e920-41d3-a9b2-4e601ef5636f",
  "upload_path": "/api/rider/v1/uploads/a654ab2f-e920-41d3-a9b2-4e601ef5636f",
  "expires_at": "2026-10-28T20:27:09.25464922Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/a654ab2f-e920-41d3-a9b2-4e601ef5636f` → **200**

```json
{
  "file_id": "a654ab2f-e920-41d3-a9b2-4e601ef5636f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "773d0543-b198-4cc5-8658-5110cf57f530",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "a654ab2f-e920-41d3-a9b2-4e601ef5636f"
  ]
}
```

```json
{
  "id": "ffda23cc-db31-4b18-9fdb-9d33fcfde09f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T20:12:09.45336Z",
  "updated_at": "2026-10-28T20:12:09.45336Z",
  "respond_by": "2026-10-29T00:12:09.45336Z",
  "messages": [
    {
      "id": "ae6591a3-ddc5-464c-a439-a15a9c93f2f6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T20:12:09.454683Z",
      "attachments": [
        {
          "file_id": "a654ab2f-e920-41d3-a9b2-4e601ef5636f",
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
  "session_id": "5ab6d4fa-a0ea-46cd-88a6-9d878762fc66",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMjksImlhdCI6MTc5MzIxODMyOSwianRpIjoiYzc3NzRhMGItZjcxZS00YmYyLTk5MDgtOTY5YTkxNWU0ZTM5Iiwic2lkIjoiNWFiNmQ0ZmEtYTBlYS00NmNkLTg4YTYtOWQ4Nzg3NjJmYzY2In0.RstPrvKVeEmoV0GDbCYe_ETVUJeRp1nepqSiRWS73Gc",
  "access_expires_at": "2026-10-28T20:27:09.84327317Z",
  "refresh_token": "WXUEV1j_LxzRbv6uLtqYcLkDFUXHsoBD1epYlyS9gRY",
  "refresh_expires_at": "2026-10-29T08:12:09.842971615Z",
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
  "session_id": "7c95f06c-565a-4162-83b2-207a7cbea236",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMzAsImlhdCI6MTc5MzIxODMzMCwianRpIjoiYTZjMTQyMGYtNTIxOS00NjM2LWIxM2EtNWRlMGUxOWZhNjJiIiwic2lkIjoiN2M5NWYwNmMtNTY1YS00MTYyLTgzYjItMjA3YTdjYmVhMjM2In0.sz7hSgz6lspjcx-eIJxoJ2MVyNAajvuUo451byMwnJk",
  "access_expires_at": "2026-10-28T20:27:10.203851741Z",
  "refresh_token": "Q5mR1E6TyJ8oysVq3l4ACIBA3baC8DHhKXViicdYXEY",
  "refresh_expires_at": "2026-10-29T08:12:10.203521834Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/ffda23cc-db31-4b18-9fdb-9d33fcfde09f/attachments/a654ab2f-e920-41d3-a9b2-4e601ef5636f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "8de47fa2-1456-4637-bec7-68cc5bba1c4b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5b1a8747-6d3b-44ff-b790-75926dea2e6a",
  "upload_path": "/api/operator/v1/uploads/5b1a8747-6d3b-44ff-b790-75926dea2e6a",
  "expires_at": "2026-10-28T20:27:10.385000889Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5b1a8747-6d3b-44ff-b790-75926dea2e6a` → **200**

```json
{
  "file_id": "5b1a8747-6d3b-44ff-b790-75926dea2e6a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/ffda23cc-db31-4b18-9fdb-9d33fcfde09f` → **200**

```json
{
  "id": "ffda23cc-db31-4b18-9fdb-9d33fcfde09f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T20:12:09.45336Z",
  "updated_at": "2026-10-28T20:12:09.45336Z",
  "respond_by": "2026-10-29T00:12:09.45336Z",
  "messages": [
    {
      "id": "ae6591a3-ddc5-464c-a439-a15a9c93f2f6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T20:12:09.454683Z",
      "attachments": [
        {
          "file_id": "a654ab2f-e920-41d3-a9b2-4e601ef5636f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/ffda23cc-db31-4b18-9fdb-9d33fcfde09f/comments` → **200**

```json
{
  "command_id": "f7a0342d-6250-4b62-8a5b-67e9b8698d1b",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5b1a8747-6d3b-44ff-b790-75926dea2e6a"
  ]
}
```

```json
{
  "id": "ffda23cc-db31-4b18-9fdb-9d33fcfde09f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T20:12:09.45336Z",
  "updated_at": "2026-10-28T20:12:10.742645Z",
  "respond_by": "2026-10-29T00:12:09.45336Z",
  "messages": [
    {
      "id": "ae6591a3-ddc5-464c-a439-a15a9c93f2f6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T20:12:09.454683Z",
      "attachments": [
        {
          "file_id": "a654ab2f-e920-41d3-a9b2-4e601ef5636f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c59b0801-7bb3-4169-8d75-f9727936c92b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T20:12:10.742321Z",
      "attachments": [
        {
          "file_id": "5b1a8747-6d3b-44ff-b790-75926dea2e6a",
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

`GET /api/rider/v1/support/cases/ffda23cc-db31-4b18-9fdb-9d33fcfde09f` → **200**

```json
{
  "id": "ffda23cc-db31-4b18-9fdb-9d33fcfde09f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T20:12:09.45336Z",
  "updated_at": "2026-10-28T20:12:10.742645Z",
  "respond_by": "2026-10-29T00:12:09.45336Z",
  "messages": [
    {
      "id": "ae6591a3-ddc5-464c-a439-a15a9c93f2f6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "fc52c902-5874-4d1c-a5ea-3f03de1b2aea",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T20:12:09.454683Z",
      "attachments": [
        {
          "file_id": "a654ab2f-e920-41d3-a9b2-4e601ef5636f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c59b0801-7bb3-4169-8d75-f9727936c92b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T20:12:10.742321Z",
      "attachments": [
        {
          "file_id": "5b1a8747-6d3b-44ff-b790-75926dea2e6a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/ffda23cc-db31-4b18-9fdb-9d33fcfde09f/attachments/5b1a8747-6d3b-44ff-b790-75926dea2e6a` → **200**

Done: support case ffda23cc-db31-4b18-9fdb-9d33fcfde09f, rider attachment a654ab2f-e920-41d3-a9b2-4e601ef5636f, operator attachment 5b1a8747-6d3b-44ff-b790-75926dea2e6a.

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
  "session_id": "723124ba-2a40-4d26-abd2-42fc2c40ea49",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMzEsImlhdCI6MTc5MzIxODMzMSwianRpIjoiNWFjMTRmZTItODAwNS00YTE3LTg5ODAtZmMyYzE0Zjc3NTc2Iiwic2lkIjoiNzIzMTI0YmEtMmE0MC00ZDI2LWFiZDItNDJmYzJjNDBlYTQ5In0.n8nYEHm-qDYap5Iye4RnBhUp_wv091-mN6aW14j1gQU",
  "access_expires_at": "2026-10-28T20:27:11.301036075Z",
  "refresh_token": "QJuQqEXtmB6yFdxaDi-KdVfYkU_P0n-yw7nkoBNssk8",
  "refresh_expires_at": "2026-10-29T08:12:11.300693338Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17072"
}
```

```json
{
  "challenge_id": "6ce74c1e-38b3-433f-8ae8-217e9231af93",
  "expires_at": "2026-10-28T20:17:11.466055514Z",
  "resend_available_at": "2026-10-28T20:12:12.466055514Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "777734",
  "sent_at": "2026-10-28T20:12:11.467721243Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ce74c1e-38b3-433f-8ae8-217e9231af93",
  "code": "777734",
  "device_ref": "sandbox-17072"
}
```

```json
{
  "session_id": "985c82e5-3acb-4116-bbb3-45de4de73321",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTIzMSwiaWF0IjoxNzkzMjE4MzMxLCJqdGkiOiI3NmY5YjFlMC02MTQ1LTQ2ZTYtYTc5Yy1jMjY5YzRhODVmYmMiLCJzaWQiOiI5ODVjODJlNS0zYWNiLTQxMTYtYmJiMy00NWRlNGRlNzMzMjEifQ.Lex3cCBauG59CdxLiIipY5lAOMyVnncz3FDnu6BieK8",
  "access_expires_at": "2026-10-28T20:27:11.652330097Z",
  "refresh_token": "7YwrRz6FMBgAzMAMz0RyLm9XY6MpCfUnXXxyvP8rq6I",
  "refresh_expires_at": "2026-11-27T20:12:11.651870225Z",
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
      "actor_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T20:12:04.394215Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T20:12:05.27691Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "03db02fc-a45a-40ad-8089-deb452a036eb",
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
  "device_ref": "sandbox-30856"
}
```

```json
{
  "challenge_id": "18f62b65-6762-4744-9353-2263b18c3694",
  "expires_at": "2026-10-28T20:17:12.329403538Z",
  "resend_available_at": "2026-10-28T20:12:13.329403538Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "518131",
  "sent_at": "2026-10-28T20:12:12.331193744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18f62b65-6762-4744-9353-2263b18c3694",
  "code": "518131",
  "device_ref": "sandbox-30856"
}
```

```json
{
  "session_id": "3aa84363-b2a1-49b6-82a4-bbc732720a49",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTIzMiwiaWF0IjoxNzkzMjE4MzMyLCJqdGkiOiI0ZGQ3NjIzZC1mYTkzLTQ4MTEtYmU1Ny01MzljODFmNTRmMWYiLCJzaWQiOiIzYWE4NDM2My1iMmExLTQ5YjYtODJhNC1iYmM3MzI3MjBhNDkifQ.X0uCgJFlpINcyu5-bUp1n1xip0yxiTm-72BIsGtmooA",
  "access_expires_at": "2026-10-28T20:27:12.513298663Z",
  "refresh_token": "qBQ_bA_MdwD9ibb6D9gjMwEfxFBgHmh6268elxtoGeY",
  "refresh_expires_at": "2026-11-27T20:12:12.512981966Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "861fd16f-66a7-4635-aa89-db56a2160924",
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
  "last_heartbeat_at": "2026-10-28T20:11:47.502966Z",
  "last_location_at": "2026-10-28T20:11:47.502966Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/861fd16f-66a7-4635-aa89-db56a2160924/handover` → **200**

```json
{
  "command_id": "f93ec651-947a-410a-ba58-81cfca10fd9d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "861fd16f-66a7-4635-aa89-db56a2160924",
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
  "last_heartbeat_at": "2026-10-28T20:11:47.502966Z",
  "last_location_at": "2026-10-28T20:11:47.502966Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/861fd16f-66a7-4635-aa89-db56a2160924/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:12:13Z",
    "sequence": 1793218333133
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "861fd16f-66a7-4635-aa89-db56a2160924",
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
  "last_heartbeat_at": "2026-10-28T20:12:13.027053Z",
  "last_location_at": "2026-10-28T20:12:13.027053Z",
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
  "command_id": "23e6fd9a-0a4b-4250-9792-3c7dda2a78c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:12:13Z",
    "sequence": 1793218333342
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f2329b4-a39d-4fc1-bdb1-f23231de7c83",
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
  "last_heartbeat_at": "2026-10-28T20:12:13.356163Z",
  "last_location_at": "2026-10-28T20:12:13.356163Z",
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
  "session_id": "e4616521-99bc-41b0-bf00-05f025729051",
  "subject": {
    "type": "STAFF",
    "id": "9fa8bf63-3a19-4ee8-a4b0-db2fd3561583"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmE4YmY2My0zYTE5LTRlZTgtYTRiMC1kYjJmZDM1NjE1ODMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTkyMzMsImlhdCI6MTc5MzIxODMzMywianRpIjoiMWI1MDEwZDItMjhjMC00NDQwLWFlNTEtOTkyMTFhMThlZTIyIiwic2lkIjoiZTQ2MTY1MjEtOTliYy00MWIwLWJmMDAtMDVmMDI1NzI5MDUxIn0.kCjOwAAkgp0OU3Yp2CHLqpIQ3-habl-cCfLdnrA-u2o",
  "access_expires_at": "2026-10-28T20:27:13.720517754Z",
  "refresh_token": "fJepJ-ODLEQkVj6Idu_bpi0lwPgs817gCVVud1o8clU",
  "refresh_expires_at": "2026-10-29T08:12:13.720102558Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0f48d1a2-847b-4938-af3a-0c9a1b04b95c",
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
  "id": "86767d47-ffde-461e-8389-daef6f1eca63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:17:13.892401Z",
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
  "command_id": "598fa8e9-9ffc-4c48-bede-87829b78c0d3",
  "quote_id": "86767d47-ffde-461e-8389-daef6f1eca63",
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
  "id": "9866572e-ad4c-444d-bef1-def564987b66",
  "short_number": 23,
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
  "created_at": "2026-10-28T20:12:14.069361Z",
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
    "id": "1ece84fb-e28e-4706-b40e-dc93ca6e8cfe",
    "order_id": "9866572e-ad4c-444d-bef1-def564987b66",
    "expires_at": "2026-10-28T20:12:29.071263Z",
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

`POST /api/driver/v1/offers/1ece84fb-e28e-4706-b40e-dc93ca6e8cfe/accept` → **200**

```json
{
  "command_id": "0cf0396f-9e2e-4335-9090-2ab54104d6f1"
}
```

```json
{
  "id": "8d7d1328-f4b7-4bf9-baa1-5ac3412c8b48",
  "order_id": "9866572e-ad4c-444d-bef1-def564987b66",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "50c52b93-dcfd-47a6-ab09-e7df4a1f7479",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "50c52b93-dcfd-47a6-ab09-e7df4a1f7479",
  "order_id": "9866572e-ad4c-444d-bef1-def564987b66",
  "assignment_id": "8d7d1328-f4b7-4bf9-baa1-5ac3412c8b48",
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

`POST /api/driver/v1/work-sessions/1f2329b4-a39d-4fc1-bdb1-f23231de7c83/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:12:14Z",
    "sequence": 1793218334929
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f2329b4-a39d-4fc1-bdb1-f23231de7c83",
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
  "last_heartbeat_at": "2026-10-28T20:12:14.944677Z",
  "last_location_at": "2026-10-28T20:12:14.944677Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/50c52b93-dcfd-47a6-ab09-e7df4a1f7479/arrive` → **200**

```json
{
  "command_id": "50ca3b73-25f6-49c9-9b5f-a88c8fdabead",
  "expected_version": 0
}
```

```json
{
  "id": "50c52b93-dcfd-47a6-ab09-e7df4a1f7479",
  "order_id": "9866572e-ad4c-444d-bef1-def564987b66",
  "assignment_id": "8d7d1328-f4b7-4bf9-baa1-5ac3412c8b48",
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
  "arrived_at": "2026-10-28T20:12:15.122879Z",
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

`POST /api/driver/v1/trips/50c52b93-dcfd-47a6-ab09-e7df4a1f7479/start` → **200**

```json
{
  "command_id": "fc7478cf-0586-49bc-b136-49fe524d30c3",
  "expected_version": 1
}
```

```json
{
  "id": "50c52b93-dcfd-47a6-ab09-e7df4a1f7479",
  "order_id": "9866572e-ad4c-444d-bef1-def564987b66",
  "assignment_id": "8d7d1328-f4b7-4bf9-baa1-5ac3412c8b48",
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
  "arrived_at": "2026-10-28T20:12:15.122879Z",
  "started_at": "2026-10-28T20:12:15.300577Z",
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

`POST /api/driver/v1/trips/50c52b93-dcfd-47a6-ab09-e7df4a1f7479/complete` → **200**

```json
{
  "command_id": "6a130b97-f7a9-4656-963e-ade657ff6f28",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:12:15Z",
  "cash_received": true
}
```

```json
{
  "id": "50c52b93-dcfd-47a6-ab09-e7df4a1f7479",
  "order_id": "9866572e-ad4c-444d-bef1-def564987b66",
  "assignment_id": "8d7d1328-f4b7-4bf9-baa1-5ac3412c8b48",
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
  "arrived_at": "2026-10-28T20:12:15.122879Z",
  "started_at": "2026-10-28T20:12:15.300577Z",
  "completed_at": "2026-10-28T20:12:15.496136Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/9866572e-ad4c-444d-bef1-def564987b66` → **200**

```json
{
  "id": "9866572e-ad4c-444d-bef1-def564987b66",
  "short_number": 23,
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
    "id": "8d7d1328-f4b7-4bf9-baa1-5ac3412c8b48",
    "order_id": "9866572e-ad4c-444d-bef1-def564987b66",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "50c52b93-dcfd-47a6-ab09-e7df4a1f7479",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:12:14.069361Z",
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
      "balance_minor": 28209,
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
  "session_id": "861fd16f-66a7-4635-aa89-db56a2160924",
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
  "last_heartbeat_at": "2026-10-28T20:12:13.027053Z",
  "last_location_at": "2026-10-28T20:12:13.027053Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/861fd16f-66a7-4635-aa89-db56a2160924/close` → **200**

```json
{
  "command_id": "edd21706-815b-427a-8e8b-e954e087b3bf",
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
  "session_id": "1f2329b4-a39d-4fc1-bdb1-f23231de7c83",
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
  "last_heartbeat_at": "2026-10-28T20:12:14.944677Z",
  "last_location_at": "2026-10-28T20:12:14.944677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f2329b4-a39d-4fc1-bdb1-f23231de7c83/close` → **200**

```json
{
  "command_id": "1eef96d9-af26-4f55-8e2b-499b68d60f0e",
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

Done: terminal order 9866572e-ad4c-444d-bef1-def564987b66 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26391"
}
```

```json
{
  "challenge_id": "db68a526-91c2-479a-bac6-a303c4c0bab7",
  "expires_at": "2026-10-28T20:17:19.75424633Z",
  "resend_available_at": "2026-10-28T20:12:20.75424633Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "530544",
  "sent_at": "2026-10-28T20:12:19.756061718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db68a526-91c2-479a-bac6-a303c4c0bab7",
  "code": "530544",
  "device_ref": "sandbox-26391"
}
```

```json
{
  "session_id": "f925b328-999b-4dee-b3ac-2ed9055deaeb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTIzOSwiaWF0IjoxNzkzMjE4MzM5LCJqdGkiOiI3NmUzYmI2MC03ZGY0LTRiY2ItYTYzYy1mZWYwZjE3YjE0NzYiLCJzaWQiOiJmOTI1YjMyOC05OTliLTRkZWUtYjNhYy0yZWQ5MDU1ZGVhZWIifQ.2zH8rpgu3R4OGI56-a4MNjccdqBhSn3wfOvt_NIom0o",
  "access_expires_at": "2026-10-28T20:27:19.938294592Z",
  "refresh_token": "O9MzoWxcEgZFU5g2sUc9zgGimiuytv10GcmZlQlnZ2g",
  "refresh_expires_at": "2026-11-27T20:12:19.937972167Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-8674"
}
```

```json
{
  "challenge_id": "0590915f-7cca-4472-a913-1cda504bd3ac",
  "expires_at": "2026-10-28T20:17:20.264154518Z",
  "resend_available_at": "2026-10-28T20:12:21.264154518Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "444760",
  "sent_at": "2026-10-28T20:12:20.265741947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0590915f-7cca-4472-a913-1cda504bd3ac",
  "code": "444760",
  "device_ref": "sandbox-8674"
}
```

```json
{
  "session_id": "7fb2949e-69eb-4673-bc6b-7bc1bdc673b0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTI0MCwiaWF0IjoxNzkzMjE4MzQwLCJqdGkiOiI2NzQ4YzZjOC0yYTI3LTQ3MTMtYjU2NC1mOTJjYTZmY2JjZmEiLCJzaWQiOiI3ZmIyOTQ5ZS02OWViLTQ2NzMtYmM2Yi03YmMxYmRjNjczYjAifQ.rLdmOagqQnWByl4LQJdcyHqt4bFJmYEDCW852TaP7js",
  "access_expires_at": "2026-10-28T20:27:20.451848997Z",
  "refresh_token": "231BNtIqaKqHw1NrVj0FvXFFNqZunIPgVHrz_j_fmUo",
  "refresh_expires_at": "2026-11-27T20:12:20.451483752Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31360"
}
```

```json
{
  "challenge_id": "bdc8f260-9e45-43d7-9b9c-483340a39e80",
  "expires_at": "2026-10-28T20:17:20.774203703Z",
  "resend_available_at": "2026-10-28T20:12:21.774203703Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "327119",
  "sent_at": "2026-10-28T20:12:20.775927875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdc8f260-9e45-43d7-9b9c-483340a39e80",
  "code": "327119",
  "device_ref": "sandbox-31360"
}
```

```json
{
  "session_id": "50b7e3ba-d49a-4bd3-99ec-3b01defd000f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxOTI0MCwiaWF0IjoxNzkzMjE4MzQwLCJqdGkiOiI1NjVjOGE2YS02MzYxLTRlZTMtODE3Mi1jY2RiMjQzNjg0NzgiLCJzaWQiOiI1MGI3ZTNiYS1kNDlhLTRiZDMtOTllYy0zYjAxZGVmZDAwMGYifQ.JqO6kx3JVHYSvoFPCaFe1RKJvd70nOIe_vrJt4I_DKM",
  "access_expires_at": "2026-10-28T20:27:20.958586645Z",
  "refresh_token": "5ybOxwY8wLvKXR9y9HQUTL34kYXL-wkgmvS49oeWmAU",
  "refresh_expires_at": "2026-11-27T20:12:20.958253764Z",
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
  "audience": "CLIENT",
  "phone": "+380696809525",
  "device_ref": "sandbox-19148"
}
```

```json
{
  "challenge_id": "42217c99-cd98-4818-a4f6-a7b937189d25",
  "expires_at": "2026-10-28T20:17:21.284092296Z",
  "resend_available_at": "2026-10-28T20:12:22.284092296Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380696809525` → **200**

```json
{
  "phone": "+380696809525",
  "audience": "CLIENT",
  "code": "437320",
  "sent_at": "2026-10-28T20:12:21.285770964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42217c99-cd98-4818-a4f6-a7b937189d25",
  "code": "437320",
  "device_ref": "sandbox-19148"
}
```

```json
{
  "session_id": "8f39754e-5b67-4cee-85a4-fbf737ad2fc1",
  "subject": {
    "type": "CLIENT",
    "id": "21260fde-bebe-4e26-99f4-bd8a2ab12870"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTI2MGZkZS1iZWJlLTRlMjYtOTlmNC1iZDhhMmFiMTI4NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE5MjQxLCJpYXQiOjE3OTMyMTgzNDEsImp0aSI6ImMxYmVmOWZiLTViM2MtNGZiNS05NzA3LTgwY2QzNzE4OGI2YyIsInNpZCI6IjhmMzk3NTRlLTViNjctNGNlZS04NWE0LWZiZjczN2FkMmZjMSJ9.Qv7kmfl6EaRF4ZAq6D_qqzVg77FYB4x0aViGnRTTvlc",
  "access_expires_at": "2026-10-28T20:27:21.466510094Z",
  "refresh_token": "wB9TUcSEJkEwLZGwwIq-7-ciuxQCnXiaqpEmyBrg4Gc",
  "refresh_expires_at": "2026-11-27T20:12:21.466153036Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "74e5cbb8-34c4-4977-a2c1-bdac5ab0aab8",
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
  "id": "071753d6-6907-4dd9-8b0b-4e682c6bbb72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:17:21.643049Z",
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
  "command_id": "43b40638-f8b3-4a9f-bc8e-779b731d87f1",
  "quote_id": "071753d6-6907-4dd9-8b0b-4e682c6bbb72",
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
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## All eight metrics are non-zero, with closed labels and no ids/phones
Metric validator: good scrape accepted; missing, unknown, id/phone, extra, zero and NaN rejected
{
  "blizz_orders_total": 24,
  "blizz_orders_cancelled_total": 13,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 15,
  "blizz_dispatch_assigned_seconds_count": 14,
  "blizz_offers_total": 17,
  "blizz_dispatch_excluded_total": 6,
  "blizz_sms_sent_total": 63
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 14
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 7.745520361
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 15
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.082897281
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 14.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 16.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 56.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/80b5092b-e3d0-4b6e-a86b-c78aee8f68d4` → **200**

```json
{
  "id": "80b5092b-e3d0-4b6e-a86b-c78aee8f68d4",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "21260fde-bebe-4e26-99f4-bd8a2ab12870",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-28T20:12:21.820121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793218647993E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793218648053E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793218648053E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793218648054E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793218648053E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
