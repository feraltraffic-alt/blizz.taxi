# Sandbox transcript (2026-10-27T16:09:02Z, 141aa7e)

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
  "correlation_id": "97b6763d-d178-4b80-a1ae-10feadae7ec4"
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
  "session_id": "2969deb3-1f46-4662-974a-28a678b0a12c",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNDMsImlhdCI6MTc5MzExNzM0MywianRpIjoiNjU2MThmNGMtNGRmOC00ZmZmLTkzNDAtNzhiOGY4ZjE4YzNhIiwic2lkIjoiMjk2OWRlYjMtMWY0Ni00NjYyLTk3NGEtMjhhNjc4YjBhMTJjIn0.FPjjS0HnG5qutSYPjRLtoKqWJEWDhoYNuecj0ASaM5s",
  "access_expires_at": "2026-10-27T16:24:03.538268424Z",
  "refresh_token": "RVy7fFvya_q4Ibv-sMQuT7EkuoQcVylt7gBT6ZOF9MU",
  "refresh_expires_at": "2026-10-28T04:09:03.535881605Z",
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
  "session_id": "de5783f8-1edc-48fc-99ce-251b4a986909",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNDQsImlhdCI6MTc5MzExNzM0NCwianRpIjoiMzJiZTJmYmUtNjYwOC00MzljLThiNjAtMThhMWNmMjIxNWU0Iiwic2lkIjoiZGU1NzgzZjgtMWVkYy00OGZjLTk5Y2UtMjUxYjRhOTg2OTA5In0.klE3cXwfv9qJnfL_68SnAtKY63y-9_VgfytIa0wDIQs",
  "access_expires_at": "2026-10-27T16:24:04.753795997Z",
  "refresh_token": "28GEoCpRrlCzqP3olDQD24T9dIZStiQ4j9G2y3p-WtM",
  "refresh_expires_at": "2026-10-28T04:09:04.752726408Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "6d23727a-d3df-4c9b-9682-263b3f78fb56",
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
  "id": "b8b54d5f-d784-4dd1-8c35-953de07d7914",
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
  "created_by": "d1a28922-3c22-484f-a013-6679adc0ed55",
  "created_at": "2026-10-27T16:09:04.813364Z",
  "updated_at": "2026-10-27T16:09:04.813364Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638405484",
  "device_ref": "sandbox-1972"
}
```

```json
{
  "challenge_id": "058f0c06-b02a-4228-ac43-a3d36563898c",
  "expires_at": "2026-10-27T16:14:04.851774504Z",
  "resend_available_at": "2026-10-27T16:09:05.851774504Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638405484` → **200**

```json
{
  "phone": "+380638405484",
  "audience": "CLIENT",
  "code": "045030",
  "sent_at": "2026-10-27T16:09:04.85748152Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "058f0c06-b02a-4228-ac43-a3d36563898c",
  "code": "045030",
  "device_ref": "sandbox-1972"
}
```

```json
{
  "session_id": "57791467-97fc-4cc5-a3be-322ba0a6ddcd",
  "subject": {
    "type": "CLIENT",
    "id": "f9fd9f22-ad87-4fb0-9889-af14d4268aff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOWZkOWYyMi1hZDg3LTRmYjAtOTg4OS1hZjE0ZDQyNjhhZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjQ0LCJpYXQiOjE3OTMxMTczNDQsImp0aSI6IjBkOTY5NzMyLTVhYWQtNDE5NC04NzIxLWJjOTlmMzRmZGI0NiIsInNpZCI6IjU3NzkxNDY3LTk3ZmMtNGNjNS1hM2JlLTMyMmJhMGE2ZGRjZCJ9.HDX_vJ5mCfjB9dApdj7TqEDJWJJP94dqKEoGiZPlJPg",
  "access_expires_at": "2026-10-27T16:24:04.920579385Z",
  "refresh_token": "7lfKVUjreCu1RqoPUmkJNrNQSxfeV9EAy_uFpbMv8yk",
  "refresh_expires_at": "2026-11-26T16:09:04.919491867Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638405484` → **200**

```json
{
  "client_id": "f9fd9f22-ad87-4fb0-9889-af14d4268aff"
}
```

`POST /api/admin/v1/rider-wallets/f9fd9f22-ad87-4fb0-9889-af14d4268aff/top-ups` → **201**

```json
{
  "command_id": "3bad3f09-cc0c-4853-8b16-b5a7c0987a6f",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "f9fd9f22-ad87-4fb0-9889-af14d4268aff",
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
      "id": "ffa32601-c0c6-4da2-933b-81b6bcb5009b",
      "at": "2026-10-27T16:09:04.986929Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d1a28922-3c22-484f-a013-6679adc0ed55",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73254ca8-3238-4eae-9b6a-761926350ee6",
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
  "id": "3206c821-7991-44d6-a648-1d70b15803f7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:14:05.166955Z",
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
      "id": "b8b54d5f-d784-4dd1-8c35-953de07d7914",
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
  "device_ref": "sandbox-8923"
}
```

```json
{
  "challenge_id": "393e4dc8-8beb-48a7-b6e7-5591be257903",
  "expires_at": "2026-10-27T16:14:05.226234194Z",
  "resend_available_at": "2026-10-27T16:09:06.226234194Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "048252",
  "sent_at": "2026-10-27T16:09:05.229527436Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "393e4dc8-8beb-48a7-b6e7-5591be257903",
  "code": "048252",
  "device_ref": "sandbox-8923"
}
```

```json
{
  "session_id": "47ea001d-c07a-4d45-9912-cdcd41282e72",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI0NSwiaWF0IjoxNzkzMTE3MzQ1LCJqdGkiOiJjNzg1OGU4My1lNjEyLTRmNDAtYjgyZi01NDM5OTJiMjQ1MjYiLCJzaWQiOiI0N2VhMDAxZC1jMDdhLTRkNDUtOTkxMi1jZGNkNDEyODJlNzIifQ.EvmhN_1h1JdAzlHvKxnxG0MXoGfayxxT0M3GQncXDZo",
  "access_expires_at": "2026-10-27T16:24:05.27826942Z",
  "refresh_token": "qf2U91tYL74rYD4K3ENZbDBsNP-eQdt7pMsVSJ8RJS8",
  "refresh_expires_at": "2026-11-26T16:09:05.277266447Z",
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
  "command_id": "9e6cb67b-1b30-4f2a-9a92-385f43a2cc14",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:05Z",
    "sequence": 1793117345330
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e08c85b-811c-44dd-a0d6-6c42a97b235d",
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
  "last_heartbeat_at": "2026-10-27T16:09:05.365627Z",
  "last_location_at": "2026-10-27T16:09:05.365627Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b53dfd96-d70c-4547-808e-e6f15574c1c9",
  "quote_id": "3206c821-7991-44d6-a648-1d70b15803f7",
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
  "id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f9fd9f22-ad87-4fb0-9889-af14d4268aff",
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
  "created_at": "2026-10-27T16:09:05.431407Z",
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
  "client_id": "f9fd9f22-ad87-4fb0-9889-af14d4268aff",
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
      "id": "ffa32601-c0c6-4da2-933b-81b6bcb5009b",
      "at": "2026-10-27T16:09:04.986929Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d1a28922-3c22-484f-a013-6679adc0ed55",
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
    "id": "54a821a6-d5ca-4ecd-8e2a-51f9b598bf13",
    "order_id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3",
    "expires_at": "2026-10-27T16:09:20.446787Z",
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

`POST /api/driver/v1/offers/54a821a6-d5ca-4ecd-8e2a-51f9b598bf13/accept` → **200**

```json
{
  "command_id": "28ad98c3-de82-4b98-ab40-44c26ff9825a"
}
```

```json
{
  "id": "ef87d70e-b60c-45a6-b2bd-3b2ab761592e",
  "order_id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd",
  "order_id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3",
  "assignment_id": "ef87d70e-b60c-45a6-b2bd-3b2ab761592e",
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

`POST /api/driver/v1/work-sessions/1e08c85b-811c-44dd-a0d6-6c42a97b235d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:05Z",
    "sequence": 1793117345588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e08c85b-811c-44dd-a0d6-6c42a97b235d",
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
  "last_heartbeat_at": "2026-10-27T16:09:05.609848Z",
  "last_location_at": "2026-10-27T16:09:05.609848Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd/arrive` → **200**

```json
{
  "command_id": "2690d419-f5bf-4053-8b83-0bdd6a71e5e4",
  "expected_version": 0
}
```

```json
{
  "id": "f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd",
  "order_id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3",
  "assignment_id": "ef87d70e-b60c-45a6-b2bd-3b2ab761592e",
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
  "arrived_at": "2026-10-27T16:09:05.653336Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd/start` → **200**

```json
{
  "command_id": "dac2690b-d169-4c66-aa11-fa856b343eed",
  "expected_version": 1
}
```

```json
{
  "id": "f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd",
  "order_id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3",
  "assignment_id": "ef87d70e-b60c-45a6-b2bd-3b2ab761592e",
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
  "arrived_at": "2026-10-27T16:09:05.653336Z",
  "started_at": "2026-10-27T16:09:05.705762Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd/complete` → **200**

```json
{
  "command_id": "d4457e23-7d6f-4fbb-9fa1-c37baf837185",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:09:05Z",
  "cash_received": true
}
```

```json
{
  "id": "f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd",
  "order_id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3",
  "assignment_id": "ef87d70e-b60c-45a6-b2bd-3b2ab761592e",
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
  "arrived_at": "2026-10-27T16:09:05.653336Z",
  "started_at": "2026-10-27T16:09:05.705762Z",
  "completed_at": "2026-10-27T16:09:05.758823Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f9fd9f22-ad87-4fb0-9889-af14d4268aff",
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
      "id": "cef5a89e-0de3-4719-a579-040d46a83116",
      "at": "2026-10-27T16:09:06.731316Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3"
    },
    {
      "id": "ffa32601-c0c6-4da2-933b-81b6bcb5009b",
      "at": "2026-10-27T16:09:04.986929Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d1a28922-3c22-484f-a013-6679adc0ed55",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/b8b54d5f-d784-4dd1-8c35-953de07d7914/archive` → **200**

```json
{
  "command_id": "e7466067-d6a7-42f2-b447-e84d02dc51c7",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "b8b54d5f-d784-4dd1-8c35-953de07d7914",
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
  "created_by": "d1a28922-3c22-484f-a013-6679adc0ed55",
  "created_at": "2026-10-27T16:09:04.813364Z",
  "updated_at": "2026-10-27T16:09:08.840458Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e08c85b-811c-44dd-a0d6-6c42a97b235d",
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
  "last_heartbeat_at": "2026-10-27T16:09:05.609848Z",
  "last_location_at": "2026-10-27T16:09:05.609848Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1e08c85b-811c-44dd-a0d6-6c42a97b235d/close` → **200**

```json
{
  "command_id": "2a58f442-f06f-444e-9ddc-95111051ee0b",
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

Done: order 7cd4305b-14d6-4969-8552-ff4fb7db90e3.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630488800",
  "device_ref": "sandbox-4464"
}
```

```json
{
  "challenge_id": "8a30ca59-58e4-4ba8-b10f-6d44527414d6",
  "expires_at": "2026-10-27T16:14:08.943266941Z",
  "resend_available_at": "2026-10-27T16:09:09.943266941Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630488800` → **200**

```json
{
  "phone": "+380630488800",
  "audience": "CLIENT",
  "code": "689142",
  "sent_at": "2026-10-27T16:09:08.946319537Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a30ca59-58e4-4ba8-b10f-6d44527414d6",
  "code": "689142",
  "device_ref": "sandbox-4464"
}
```

```json
{
  "session_id": "8024f0c8-8043-4f6c-b3e0-8054986a8fef",
  "subject": {
    "type": "CLIENT",
    "id": "3a255be6-8671-4e16-adbb-b1bd24bdede3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTI1NWJlNi04NjcxLTRlMTYtYWRiYi1iMWJkMjRiZGVkZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjQ4LCJpYXQiOjE3OTMxMTczNDgsImp0aSI6ImI4YmJiM2E3LTc0YWMtNGUxMy05NWY4LTYxZWM1ZTQxMTM3ZSIsInNpZCI6IjgwMjRmMGM4LTgwNDMtNGY2Yy1iM2UwLTgwNTQ5ODZhOGZlZiJ9.XwSwe9AtzcAYvrs_wT3WkqiRI-XpdC6vHRDXh3f8e7Q",
  "access_expires_at": "2026-10-27T16:24:08.992190274Z",
  "refresh_token": "ehbt_G02sVrliJ9wUNscdIORM4ef7rm8ACnUo3CQ33s",
  "refresh_expires_at": "2026-11-26T16:09:08.991163286Z",
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
  "device_ref": "sandbox-4214"
}
```

```json
{
  "challenge_id": "e44893bc-a9ef-4c21-907e-e916939458dd",
  "expires_at": "2026-10-27T16:14:09.041395114Z",
  "resend_available_at": "2026-10-27T16:09:10.041395114Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "182552",
  "sent_at": "2026-10-27T16:09:09.044264921Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e44893bc-a9ef-4c21-907e-e916939458dd",
  "code": "182552",
  "device_ref": "sandbox-4214"
}
```

```json
{
  "session_id": "25e599ef-cae8-4a2a-82cc-9556b8eb4fb8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI0OSwiaWF0IjoxNzkzMTE3MzQ5LCJqdGkiOiJhZjY4ZDc2MC1iYWIxLTQzNTAtOTIwMC04MjBiNDE3ZjhiOGEiLCJzaWQiOiIyNWU1OTllZi1jYWU4LTRhMmEtODJjYy05NTU2YjhlYjRmYjgifQ.i3aUxIUxBW7esZshRhQkwgi_WRtCC1QJvZOfhOzreKQ",
  "access_expires_at": "2026-10-27T16:24:09.089947787Z",
  "refresh_token": "itVPRxYS-eXiR4Y_TvpBBr9-5ZmTffffaC7mpLwfNvI",
  "refresh_expires_at": "2026-11-26T16:09:09.089148374Z",
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
  "session_id": "7ae8c7bf-1490-452c-861f-3e83a3747c19",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNDksImlhdCI6MTc5MzExNzM0OSwianRpIjoiZjZhOTJkZWEtOWQ1Ny00Y2ZjLWIwYWYtMWU2MGM1ZTc1ZDZiIiwic2lkIjoiN2FlOGM3YmYtMTQ5MC00NTJjLTg2MWYtM2U4M2EzNzQ3YzE5In0.k-kQ5mAH0OG8-CT1ofPfCBpEgCKryYZ4Wq3U4g0xAMM",
  "access_expires_at": "2026-10-27T16:24:09.404909626Z",
  "refresh_token": "lfC13dV4jb00u0ST14jaz8vml5sE7P86PoEiRMAY4C0",
  "refresh_expires_at": "2026-10-28T04:09:09.404013854Z",
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
  "session_id": "99e116e5-07e2-406b-a23a-281d8f067cb0",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNDksImlhdCI6MTc5MzExNzM0OSwianRpIjoiOTJmYTg0MDMtOWVhNi00NzY1LTlkNjYtNzE5NDM0OGQ2NGZkIiwic2lkIjoiOTllMTE2ZTUtMDdlMi00MDZiLWEyM2EtMjgxZDhmMDY3Y2IwIn0.Ome0z0fr_NbOZT31mAy58RwTa8Wx-HfjSn61tgpXKZY",
  "access_expires_at": "2026-10-27T16:24:09.706816392Z",
  "refresh_token": "WHcJ3dTo0eEhpeSHq5J6o_g9wd6hX1RYRJFTJAT1MJU",
  "refresh_expires_at": "2026-10-28T04:09:09.70625107Z",
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
  "command_id": "2dd83d8b-908f-4891-bc7d-5e84f6d7e248",
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
  "id": "b5eb4421-27dd-4277-bb8d-b0726f2d8615",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T16:14:09.765909Z",
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
  "command_id": "bbea455b-fb02-4e76-b64f-9c5f30f9ca0d",
  "quote_id": "b5eb4421-27dd-4277-bb8d-b0726f2d8615",
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
  "id": "4fc03e3e-f19f-4600-a488-5d9156eb08f6",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a255be6-8671-4e16-adbb-b1bd24bdede3",
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
  "created_at": "2026-10-27T16:09:09.799879Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4fc03e3e-f19f-4600-a488-5d9156eb08f6` → **200**

```json
{
  "id": "4fc03e3e-f19f-4600-a488-5d9156eb08f6",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a255be6-8671-4e16-adbb-b1bd24bdede3",
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
  "created_at": "2026-10-27T16:09:09.799879Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4fc03e3e-f19f-4600-a488-5d9156eb08f6/cancel` → **200**

```json
{
  "command_id": "ce0de00e-eb60-4090-9d97-34908ead3a9b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "4fc03e3e-f19f-4600-a488-5d9156eb08f6",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3a255be6-8671-4e16-adbb-b1bd24bdede3",
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
  "created_at": "2026-10-27T16:09:09.799879Z",
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
  "command_id": "2ab6a21c-cda3-4e4e-885e-562b80259772",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:09Z",
    "sequence": 1793117349916
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bda963eb-7509-462f-bb20-eb4ccea87a1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:09.931615Z",
  "last_location_at": "2026-10-27T16:09:09.931615Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18638"
}
```

```json
{
  "challenge_id": "6995b82b-250f-4b7f-99fc-76c04f975efd",
  "expires_at": "2026-10-27T16:14:09.954783784Z",
  "resend_available_at": "2026-10-27T16:09:10.954783784Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "012641",
  "sent_at": "2026-10-27T16:09:09.957548398Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6995b82b-250f-4b7f-99fc-76c04f975efd",
  "code": "012641",
  "device_ref": "sandbox-18638"
}
```

```json
{
  "session_id": "9d02ff8b-0f41-47ff-a49b-bbc1511f5c63",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI1MCwiaWF0IjoxNzkzMTE3MzUwLCJqdGkiOiI3N2QxODFmMC1iODcwLTQ0NDYtYjA3Yi1lM2U5ZGZmM2FhNmEiLCJzaWQiOiI5ZDAyZmY4Yi0wZjQxLTQ3ZmYtYTQ5Yi1iYmMxNTExZjVjNjMifQ.IoRoFsSEc2oHr5C3swcCVYciHCcJUI0EHYMYXIsT338",
  "access_expires_at": "2026-10-27T16:24:10.001670726Z",
  "refresh_token": "yrtlIgF9GLEsVyhqPlIhJFEd-3j6V9-HT55zrgRJMDE",
  "refresh_expires_at": "2026-11-26T16:09:10.000757201Z",
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
  "command_id": "5c11cebc-5a20-43b4-a5b0-b4bbdf7d2eeb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:10Z",
    "sequence": 1793117350432
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab51b1e3-d4b5-4047-95e6-95e442201b38",
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
  "last_heartbeat_at": "2026-10-27T16:09:10.059183Z",
  "last_location_at": "2026-10-27T16:09:10.059183Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2e0f261e-33eb-44d1-bb72-ca9009b31682",
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
  "id": "da076a30-e76d-4b74-aa86-51943d173e8f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T16:14:10.092068Z",
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
  "command_id": "f79abd44-29b9-4d42-bd84-c1348604a461",
  "quote_id": "da076a30-e76d-4b74-aa86-51943d173e8f",
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
  "id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3a255be6-8671-4e16-adbb-b1bd24bdede3",
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
  "created_at": "2026-10-27T16:09:10.122577Z",
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
    "id": "cdcae369-e767-4309-9122-bd07bf188e68",
    "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
    "expires_at": "2026-10-27T16:09:25.12617Z",
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

`POST /api/driver/v1/offers/cdcae369-e767-4309-9122-bd07bf188e68/accept` → **200**

```json
{
  "command_id": "5a4fedf2-dd3e-4c77-bb6a-02530b0242f9"
}
```

```json
{
  "id": "0b00e344-419e-4664-8c98-c2adab4fb1dd",
  "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f395247d-b12f-4f44-b8c1-0563fe2c5ad2",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f395247d-b12f-4f44-b8c1-0563fe2c5ad2",
  "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
  "assignment_id": "0b00e344-419e-4664-8c98-c2adab4fb1dd",
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

`POST /api/driver/v1/trips/f395247d-b12f-4f44-b8c1-0563fe2c5ad2/cancel` → **200**

```json
{
  "command_id": "2348da0d-2442-4575-a4e7-939cafe55314",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "f395247d-b12f-4f44-b8c1-0563fe2c5ad2",
  "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
  "assignment_id": "0b00e344-419e-4664-8c98-c2adab4fb1dd",
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

`GET /api/rider/v1/orders/fb6a439a-88db-4ec0-994f-f9b7eddb4d55` → **200**

```json
{
  "id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3a255be6-8671-4e16-adbb-b1bd24bdede3",
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
    "id": "0b00e344-419e-4664-8c98-c2adab4fb1dd",
    "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f395247d-b12f-4f44-b8c1-0563fe2c5ad2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T16:09:10.122577Z",
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
    "id": "e1d2967a-8a7f-46a5-a620-d58a50c6be60",
    "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
    "expires_at": "2026-10-27T16:09:25.237774Z",
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

`POST /api/driver/v1/offers/e1d2967a-8a7f-46a5-a620-d58a50c6be60/accept` → **200**

```json
{
  "command_id": "da035516-eddd-4f13-8b2b-ad806e5828b9"
}
```

```json
{
  "id": "66731c4e-6a96-47b7-b6c5-3562eed95e27",
  "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2d619746-36a3-42c3-8060-f25053a654c3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2d619746-36a3-42c3-8060-f25053a654c3",
  "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
  "assignment_id": "66731c4e-6a96-47b7-b6c5-3562eed95e27",
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

`POST /api/driver/v1/trips/2d619746-36a3-42c3-8060-f25053a654c3/cancel` → **200**

```json
{
  "command_id": "887d3e8e-29b5-43fb-8485-65bcf2e21846",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "2d619746-36a3-42c3-8060-f25053a654c3",
  "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
  "assignment_id": "66731c4e-6a96-47b7-b6c5-3562eed95e27",
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
    "id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:09:10.122577Z",
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
    "id": "4fc03e3e-f19f-4600-a488-5d9156eb08f6",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:09:09.799879Z",
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

`GET /api/operator/v1/orders/fb6a439a-88db-4ec0-994f-f9b7eddb4d55/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:09:10.123138Z",
      "actor": {
        "type": "CLIENT",
        "id": "3a255be6-8671-4e16-adbb-b1bd24bdede3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
        "quote_id": "da076a30-e76d-4b74-aa86-51943d173e8f",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:09:10.12528Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
        "attempt_id": "98dd5c2f-02f5-4c0e-9b12-1ef67b524e32",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:09:10.130277Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cdcae369-e767-4309-9122-bd07bf188e68",
        "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:09:10.178763Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cdcae369-e767-4309-9122-bd07bf188e68",
        "order_id": "fb6a439a-88db-4ec0-994f-f9b7eddb4d55",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0b00e344-419e-4664-8c98-c2adab4fb1dd"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 4fc03e3e-f19f-4600-a488-5d9156eb08f6, fb6a439a-88db-4ec0-994f-f9b7eddb4d55.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734498214",
  "device_ref": "sandbox-29845"
}
```

```json
{
  "challenge_id": "9a340f89-ec95-4f8f-8c61-3debab7115dd",
  "expires_at": "2026-10-27T16:14:10.440105165Z",
  "resend_available_at": "2026-10-27T16:09:11.440105165Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734498214` → **200**

```json
{
  "phone": "+380734498214",
  "audience": "CLIENT",
  "code": "451227",
  "sent_at": "2026-10-27T16:09:10.453299732Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a340f89-ec95-4f8f-8c61-3debab7115dd",
  "code": "451227",
  "device_ref": "sandbox-29845"
}
```

```json
{
  "session_id": "b09bf642-403e-445d-ae26-191fe2776480",
  "subject": {
    "type": "CLIENT",
    "id": "76f5ba6d-dfa5-4d13-ae58-f2ea4e938572"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmY1YmE2ZC1kZmE1LTRkMTMtYWU1OC1mMmVhNGU5Mzg1NzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjUwLCJpYXQiOjE3OTMxMTczNTAsImp0aSI6ImYyNTQyNDUwLTgwNjEtNDg5Yi04ZTg2LWViMGY4OGUxNDczNiIsInNpZCI6ImIwOWJmNjQyLTQwM2UtNDQ1ZC1hZTI2LTE5MWZlMjc3NjQ4MCJ9.uqeR6Ybs2M_J-WiEzMQjlVdI6tdotOF1d4_rL2bK5Do",
  "access_expires_at": "2026-10-27T16:24:10.498547975Z",
  "refresh_token": "QEixHezDWd3BVWuXvpBoONuM3s8Uzox7sfpHpNSAbuA",
  "refresh_expires_at": "2026-11-26T16:09:10.49784974Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "7e16c8a5-c9f7-4f05-b474-cc4af88a47a9",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "37be1847-d2e7-4caf-8285-e3ab2a70a1af",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-37be1847-d2e7-4caf-8285-e3ab2a70a1af",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9e0f97787266d23a9bddf94c1efdcdf6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=37be1847-d2e7-4caf-8285-e3ab2a70a1af",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734498214"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=37be1847-d2e7-4caf-8285-e3ab2a70a1af",
  "expires_at": "2026-10-27T16:39:10.52847Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/37be1847-d2e7-4caf-8285-e3ab2a70a1af` → **200**

```json
{
  "id": "37be1847-d2e7-4caf-8285-e3ab2a70a1af",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T16:39:10.52847Z",
  "card": {
    "id": "dad290d4-2bd3-4f18-aef9-f1fb761aac9d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5895",
    "card_type": "Visa",
    "created_at": "2026-10-27T16:09:10.566907Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "dad290d4-2bd3-4f18-aef9-f1fb761aac9d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5895",
      "card_type": "Visa",
      "created_at": "2026-10-27T16:09:10.566907Z"
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
  "device_ref": "sandbox-13926"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "e1ed1c8d-7598-4b32-9874-4d50876941dc",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13926"
}
```

```json
{
  "challenge_id": "5690b827-ee0f-4333-ba8c-ca8a5453f19a",
  "expires_at": "2026-10-27T16:14:11.655773254Z",
  "resend_available_at": "2026-10-27T16:09:12.655773254Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "712929",
  "sent_at": "2026-10-27T16:09:11.658319575Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5690b827-ee0f-4333-ba8c-ca8a5453f19a",
  "code": "712929",
  "device_ref": "sandbox-13926"
}
```

```json
{
  "session_id": "98a0894c-a04d-4f16-910d-2873d5313ccd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI1MSwiaWF0IjoxNzkzMTE3MzUxLCJqdGkiOiJmZjkzNmIyMC0yZDRjLTRlYTYtOWViOS1iYzQwMmRkNGVlYTciLCJzaWQiOiI5OGEwODk0Yy1hMDRkLTRmMTYtOTEwZC0yODczZDUzMTNjY2QifQ.Ap8o3-44OhwyE4HNBAz6dWuXH03iP3YzzmoEec9Hi5Y",
  "access_expires_at": "2026-10-27T16:24:11.702177827Z",
  "refresh_token": "0ch0P771Jnl8HJ1lAmZmX1ZjQ0I5EfKXcAUue44ek8A",
  "refresh_expires_at": "2026-11-26T16:09:11.70156814Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab51b1e3-d4b5-4047-95e6-95e442201b38",
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
  "last_heartbeat_at": "2026-10-27T16:09:10.059183Z",
  "last_location_at": "2026-10-27T16:09:10.059183Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab51b1e3-d4b5-4047-95e6-95e442201b38/handover` → **200**

```json
{
  "command_id": "5f10256b-f2c2-441a-bd38-c87213bf4260",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab51b1e3-d4b5-4047-95e6-95e442201b38",
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
  "last_heartbeat_at": "2026-10-27T16:09:10.059183Z",
  "last_location_at": "2026-10-27T16:09:10.059183Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab51b1e3-d4b5-4047-95e6-95e442201b38/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:11Z",
    "sequence": 1793117351769
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab51b1e3-d4b5-4047-95e6-95e442201b38",
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
  "last_heartbeat_at": "2026-10-27T16:09:11.784651Z",
  "last_location_at": "2026-10-27T16:09:11.784651Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "473f6839-0a31-4a17-ba8d-8fb5beb908fd",
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
  "id": "04760116-9537-4ea2-a584-f869795f6c1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T16:14:11.814671Z",
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
  "command_id": "245f8c20-83d9-4736-887c-9463b2603981",
  "quote_id": "04760116-9537-4ea2-a584-f869795f6c1f",
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
  "id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "76f5ba6d-dfa5-4d13-ae58-f2ea4e938572",
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
  "created_at": "2026-10-27T16:09:11.850238Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149` → **200**

```json
{
  "id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "76f5ba6d-dfa5-4d13-ae58-f2ea4e938572",
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
  "created_at": "2026-10-27T16:09:11.850238Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149` → **200**

```json
{
  "id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "76f5ba6d-dfa5-4d13-ae58-f2ea4e938572",
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
  "created_at": "2026-10-27T16:09:11.850238Z",
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
    "id": "03ede9b1-c98e-4cd3-a589-4707f623dcd1",
    "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
    "expires_at": "2026-10-27T16:09:27.833595Z",
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

`POST /api/driver/v1/offers/03ede9b1-c98e-4cd3-a589-4707f623dcd1/accept` → **200**

```json
{
  "command_id": "3097205c-2858-4df0-ab99-06e1a93dfa8d"
}
```

```json
{
  "id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "assignment_id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
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

`POST /api/driver/v1/work-sessions/ab51b1e3-d4b5-4047-95e6-95e442201b38/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:12Z",
    "sequence": 1793117352994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab51b1e3-d4b5-4047-95e6-95e442201b38",
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
  "last_heartbeat_at": "2026-10-27T16:09:13.009827Z",
  "last_location_at": "2026-10-27T16:09:13.009827Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c914478b-54a3-4ad6-98dc-38485cf863e9/arrive` → **200**

```json
{
  "command_id": "72f6729e-5970-451f-b942-261b584a87a3",
  "expected_version": 0
}
```

```json
{
  "id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "assignment_id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
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
  "arrived_at": "2026-10-27T16:09:13.040508Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/c914478b-54a3-4ad6-98dc-38485cf863e9/start` → **200**

```json
{
  "command_id": "1d49d564-a315-473c-9c5c-919717bc0108",
  "expected_version": 1
}
```

```json
{
  "id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "assignment_id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
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
  "arrived_at": "2026-10-27T16:09:13.040508Z",
  "started_at": "2026-10-27T16:09:13.071473Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/c914478b-54a3-4ad6-98dc-38485cf863e9/complete` → **200**

```json
{
  "command_id": "d0f9044d-13b3-4dc7-9e61-32244927078c",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:09:13Z"
}
```

```json
{
  "id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "assignment_id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
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
  "arrived_at": "2026-10-27T16:09:13.040508Z",
  "started_at": "2026-10-27T16:09:13.071473Z",
  "completed_at": "2026-10-27T16:09:13.107379Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149` → **200**

```json
{
  "id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "76f5ba6d-dfa5-4d13-ae58-f2ea4e938572",
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
    "id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
    "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:09:11.850238Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149` → **200**

```json
{
  "id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "76f5ba6d-dfa5-4d13-ae58-f2ea4e938572",
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
    "id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
    "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:09:11.850238Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149` → **200**

```json
{
  "id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "76f5ba6d-dfa5-4d13-ae58-f2ea4e938572",
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
    "id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
    "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:09:11.850238Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149` → **200**

```json
{
  "id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "76f5ba6d-dfa5-4d13-ae58-f2ea4e938572",
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
    "id": "37b50bf0-062b-41fd-befa-afcbb16d6cd4",
    "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c914478b-54a3-4ad6-98dc-38485cf863e9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:09:11.850238Z",
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
      "id": "4ce1d4a3-cc25-4cad-ad5f-4eb32ee00b23",
      "at": "2026-10-27T16:09:13.86926Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149/tip` → **200**

```json
{
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
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
  "available_until": "2026-10-28T16:09:13.107379Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149/tip` → **201**

```json
{
  "command_id": "4ccedccb-f7c4-485d-ab1e-812c1332a352",
  "amount_minor": 2500
}
```

```json
{
  "id": "64d0c323-0f4b-4a99-9917-9a9d7ec61e8e",
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T16:09:16.324534Z"
}
```

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149/tip` → **200**

```json
{
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
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
  "available_until": "2026-10-28T16:09:13.107379Z",
  "open": false,
  "tip": {
    "id": "64d0c323-0f4b-4a99-9917-9a9d7ec61e8e",
    "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T16:09:16.324534Z"
  }
}
```

`GET /api/rider/v1/orders/347d8b09-a401-4ad7-a085-d33f19e34149/tip` → **200**

```json
{
  "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
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
  "available_until": "2026-10-28T16:09:13.107379Z",
  "open": false,
  "tip": {
    "id": "64d0c323-0f4b-4a99-9917-9a9d7ec61e8e",
    "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T16:09:16.324534Z"
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
      "id": "4ce1d4a3-cc25-4cad-ad5f-4eb32ee00b23",
      "at": "2026-10-27T16:09:13.86926Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
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
      "id": "49190cfb-dde3-49c5-bb31-721409c6a307",
      "at": "2026-10-27T16:09:17.945293Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
      "counterpart_id": null
    },
    {
      "id": "4ce1d4a3-cc25-4cad-ad5f-4eb32ee00b23",
      "at": "2026-10-27T16:09:13.86926Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "347d8b09-a401-4ad7-a085-d33f19e34149",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab51b1e3-d4b5-4047-95e6-95e442201b38",
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
  "last_heartbeat_at": "2026-10-27T16:09:13.009827Z",
  "last_location_at": "2026-10-27T16:09:13.009827Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab51b1e3-d4b5-4047-95e6-95e442201b38/close` → **200**

```json
{
  "command_id": "76e7c366-ddf5-4ba4-a9b1-9b6027580817",
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

Done: card order 347d8b09-a401-4ad7-a085-d33f19e34149.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734874416",
  "device_ref": "sandbox-29030"
}
```

```json
{
  "challenge_id": "b0c08409-58d8-41a7-abee-73a8d7994128",
  "expires_at": "2026-10-27T16:14:18.503399555Z",
  "resend_available_at": "2026-10-27T16:09:19.503399555Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734874416` → **200**

```json
{
  "phone": "+380734874416",
  "audience": "CLIENT",
  "code": "375259",
  "sent_at": "2026-10-27T16:09:18.50583163Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0c08409-58d8-41a7-abee-73a8d7994128",
  "code": "375259",
  "device_ref": "sandbox-29030"
}
```

```json
{
  "session_id": "40847364-6758-40d2-947d-fd0fd00198a8",
  "subject": {
    "type": "CLIENT",
    "id": "9b78833b-7984-41b8-91d8-89afd74eb333"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Yjc4ODMzYi03OTg0LTQxYjgtOTFkOC04OWFmZDc0ZWIzMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjU4LCJpYXQiOjE3OTMxMTczNTgsImp0aSI6IjkxYWVkZjc1LWU1YWEtNGY1NS04YTVhLTc3MTQ2NTVmMGQ2MiIsInNpZCI6IjQwODQ3MzY0LTY3NTgtNDBkMi05NDdkLWZkMGZkMDAxOThhOCJ9.VP7zg2OULW757yT0owMrhDrKN9wINdyvlZB1K4KYamU",
  "access_expires_at": "2026-10-27T16:24:18.550151045Z",
  "refresh_token": "T9MSKkVnO4ECvapMs0_rmlFdf_BBzuv3LvzXpISaCW0",
  "refresh_expires_at": "2026-11-26T16:09:18.549425694Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "05f91262-6f0b-46c2-b737-011a7241e406",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "d1d81fce-ccb9-4358-88b5-76c8b5454e76",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d1d81fce-ccb9-4358-88b5-76c8b5454e76",
    "orderDate": "1793117358",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "1c877327a738cce619f5366370b4e18c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d1d81fce-ccb9-4358-88b5-76c8b5454e76",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734874416"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d1d81fce-ccb9-4358-88b5-76c8b5454e76",
  "created_at": "2026-10-27T16:09:18.579076Z",
  "expires_at": "2026-10-27T16:39:18.579076Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/d1d81fce-ccb9-4358-88b5-76c8b5454e76` → **200**

```json
{
  "id": "d1d81fce-ccb9-4358-88b5-76c8b5454e76",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T16:09:18.579076Z",
  "expires_at": "2026-10-27T16:39:18.579076Z",
  "completed_at": "2026-10-27T16:09:18.608976Z",
  "masked_pan": "41****1525",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9b78833b-7984-41b8-91d8-89afd74eb333",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9b78833b-7984-41b8-91d8-89afd74eb333",
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
      "id": "b29d7e3e-4980-4355-bc04-e7a0c7fe8752",
      "at": "2026-10-27T16:09:18.957216Z",
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
  "client_id": "9b78833b-7984-41b8-91d8-89afd74eb333",
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
      "id": "b29d7e3e-4980-4355-bc04-e7a0c7fe8752",
      "at": "2026-10-27T16:09:18.957216Z",
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
  "device_ref": "sandbox-3232"
}
```

```json
{
  "challenge_id": "821c2b05-0944-4498-a032-0d51e2c390e1",
  "expires_at": "2026-10-27T16:14:19.718198677Z",
  "resend_available_at": "2026-10-27T16:09:20.718198677Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "293371",
  "sent_at": "2026-10-27T16:09:19.720767617Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "821c2b05-0944-4498-a032-0d51e2c390e1",
  "code": "293371",
  "device_ref": "sandbox-3232"
}
```

```json
{
  "session_id": "3b7640f5-77b7-44b2-9110-f9f6697e4440",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI1OSwiaWF0IjoxNzkzMTE3MzU5LCJqdGkiOiI5YzRhMThiMS1kOTcyLTQ5YTgtOGE1NC1jMWIwMTMxYTM1YTQiLCJzaWQiOiIzYjc2NDBmNS03N2I3LTQ0YjItOTExMC1mOWY2Njk3ZTQ0NDAifQ.i5gZmJaHfNse5rD_49Jy66X8tJVfSwmh72ro47dw7yQ",
  "access_expires_at": "2026-10-27T16:24:19.765561808Z",
  "refresh_token": "3xux06PB1eAlvgaALOnwtu_N-rWWA081pwReHcD9xlw",
  "refresh_expires_at": "2026-11-26T16:09:19.765015743Z",
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
  "command_id": "a8d54794-00dc-4df6-b0cb-187907aa55bd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "01275d23-31e8-4472-9c13-69aa9645cbe9",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-01275d23-31e8-4472-9c13-69aa9645cbe9",
    "orderDate": "1793117359",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "20806020e1e0d41c0762773316bd5de4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=01275d23-31e8-4472-9c13-69aa9645cbe9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=01275d23-31e8-4472-9c13-69aa9645cbe9",
  "created_at": "2026-10-27T16:09:19.810955Z",
  "expires_at": "2026-10-27T16:39:19.810955Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/01275d23-31e8-4472-9c13-69aa9645cbe9` → **200**

```json
{
  "id": "01275d23-31e8-4472-9c13-69aa9645cbe9",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T16:09:19.810955Z",
  "expires_at": "2026-10-27T16:39:19.810955Z",
  "completed_at": "2026-10-27T16:09:19.852841Z",
  "masked_pan": "41****3221",
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
      "id": "1b4ef273-844c-4bd8-ba99-40abd160a22c",
      "at": "2026-10-27T16:09:19.965066Z",
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
  "command_id": "8a6168ac-ff0b-4db2-8e49-9414868db703",
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
  "correlation_id": "b9838d94-afa1-4f5b-8601-b9d7903b23b6"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673861980",
  "device_ref": "sandbox-14837"
}
```

```json
{
  "challenge_id": "3c5e44f6-d798-41e5-8cff-a90914f7bb62",
  "expires_at": "2026-10-27T16:14:20.97148086Z",
  "resend_available_at": "2026-10-27T16:09:21.97148086Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673861980` → **200**

```json
{
  "phone": "+380673861980",
  "audience": "CLIENT",
  "code": "357057",
  "sent_at": "2026-10-27T16:09:20.973438055Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c5e44f6-d798-41e5-8cff-a90914f7bb62",
  "code": "357057",
  "device_ref": "sandbox-14837"
}
```

```json
{
  "session_id": "99f00e57-c75f-41a6-acfb-d0d545e5cd07",
  "subject": {
    "type": "CLIENT",
    "id": "ac68bc5c-018e-4eb6-b8ac-dcb859b25c21"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzY4YmM1Yy0wMThlLTRlYjYtYjhhYy1kY2I4NTliMjVjMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjYxLCJpYXQiOjE3OTMxMTczNjEsImp0aSI6IjhjYTM2YTc2LTYyZDctNDE2NC05MmQ5LWRiMWFlYmM0MjcyYiIsInNpZCI6Ijk5ZjAwZTU3LWM3NWYtNDFhNi1hY2ZiLWQwZDU0NWU1Y2QwNyJ9.qLVLH6a9Exj4U25ouLud4Ru5MJWmsL5CbcS8udU7ZyA",
  "access_expires_at": "2026-10-27T16:24:21.01688424Z",
  "refresh_token": "amkn9788BVdiliVJp4at4OO2rVZM_Y2KwH92fCUVxxg",
  "refresh_expires_at": "2026-11-26T16:09:21.016077632Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ac68bc5c-018e-4eb6-b8ac-dcb859b25c21",
  "session_id": "99f00e57-c75f-41a6-acfb-d0d545e5cd07",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5e3a9fc6-d629-44d6-b525-1120084e46ea",
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
  "id": "bdbb5b7b-2e82-4403-82e1-95453ed4c435",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:14:21.065072Z",
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
  "challenge_id": "c598c6dd-7b2d-49e0-bad2-3d1036b9d932",
  "expires_at": "2026-10-27T16:14:23.099244752Z",
  "resend_available_at": "2026-10-27T16:09:24.099244752Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673861980` → **200**

```json
{
  "phone": "+380673861980",
  "audience": "CLIENT",
  "code": "297444",
  "sent_at": "2026-10-27T16:09:23.101566665Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "59a7caf2-7ac5-42e4-8fe9-9d489949c0e9",
  "challenge_id": "c598c6dd-7b2d-49e0-bad2-3d1036b9d932",
  "otp_code": "297444"
}
```

```json
{
  "client_id": "ac68bc5c-018e-4eb6-b8ac-dcb859b25c21",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T16:09:23.157700048Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d2cc329c-11af-4722-974a-af5883a3eea5",
  "quote_id": "bdbb5b7b-2e82-4403-82e1-95453ed4c435",
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
  "correlation_id": "0d4d20da-4bdc-45dc-96c1-b3eb3372751c"
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
  "session_id": "7a4f30c4-9cea-442b-82c2-ad07b6b783a5",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNjMsImlhdCI6MTc5MzExNzM2MywianRpIjoiOTRjNDVjNzMtYzU0ZC00NGVhLTk0OWItZTg3ZDIzMzlkZWUwIiwic2lkIjoiN2E0ZjMwYzQtOWNlYS00NDJiLTgyYzItYWQwN2I2Yjc4M2E1In0.WP9B7dMoxEJV9z0qLrZNl7WDuRf1bixyvLIaQRwGJW4",
  "access_expires_at": "2026-10-27T16:24:23.497556851Z",
  "refresh_token": "wJT81aqsJErqxEmPkLCFM-7Fozb4AR9oFOlzeyih6sI",
  "refresh_expires_at": "2026-10-28T04:09:23.496922193Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "ac68bc5c-018e-4eb6-b8ac-dcb859b25c21",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T16:09:23.1577Z",
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

`POST /api/admin/v1/client-deletions/ac68bc5c-018e-4eb6-b8ac-dcb859b25c21/complete` → **200**

```json
{
  "command_id": "3a1480bd-0da1-411e-940b-0f29731110c3",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "ac68bc5c-018e-4eb6-b8ac-dcb859b25c21",
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
  "correlation_id": "7c0754ea-7af8-400c-9e80-1a7edef09e17"
}
```

Done: client ac68bc5c-018e-4eb6-b8ac-dcb859b25c21 anonymized.

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
  "device_ref": "sandbox-16153"
}
```

```json
{
  "challenge_id": "7a57f3a4-5dc9-481c-957e-c37d332d3813",
  "expires_at": "2026-10-27T16:14:23.650785833Z",
  "resend_available_at": "2026-10-27T16:09:24.650785833Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "237175",
  "sent_at": "2026-10-27T16:09:23.653702326Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a57f3a4-5dc9-481c-957e-c37d332d3813",
  "code": "237175",
  "device_ref": "sandbox-16153"
}
```

```json
{
  "session_id": "7eb41585-44c1-443b-94c3-697f1e6b8d17",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI2MywiaWF0IjoxNzkzMTE3MzYzLCJqdGkiOiJkZWYyNTMxZC02NWVkLTRiYWMtOWI3MS0yMWJkNGEzZmUxMDQiLCJzaWQiOiI3ZWI0MTU4NS00NGMxLTQ0M2ItOTRjMy02OTdmMWU2YjhkMTcifQ.dooutCwkk5PiHf16KAPlpfqzVUIYskFE4anIOZr21fw",
  "access_expires_at": "2026-10-27T16:24:23.70029785Z",
  "refresh_token": "1x1xWMvNeovXRfU0My0wU0S_r74A_T-9V8k07adjNy4",
  "refresh_expires_at": "2026-11-26T16:09:23.699543658Z",
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
  "command_id": "17c2c144-a069-40f5-84e7-fb2919417d86",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:23Z",
    "sequence": 1793117363739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:23.752717Z",
  "last_location_at": "2026-10-27T16:09:23.752717Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671212417",
  "device_ref": "sandbox-23109"
}
```

```json
{
  "challenge_id": "f8b82466-fe95-4cbe-a836-ce10b1ec2d83",
  "expires_at": "2026-10-27T16:14:23.778723391Z",
  "resend_available_at": "2026-10-27T16:09:24.778723391Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671212417` → **200**

```json
{
  "phone": "+380671212417",
  "audience": "CLIENT",
  "code": "871276",
  "sent_at": "2026-10-27T16:09:23.780998992Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8b82466-fe95-4cbe-a836-ce10b1ec2d83",
  "code": "871276",
  "device_ref": "sandbox-23109"
}
```

```json
{
  "session_id": "99362ad0-f540-4201-89c1-46678808c9f4",
  "subject": {
    "type": "CLIENT",
    "id": "50434a52-88c3-4dc7-8ece-84da2a5113dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDQzNGE1Mi04OGMzLTRkYzctOGVjZS04NGRhMmE1MTEzZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjYzLCJpYXQiOjE3OTMxMTczNjMsImp0aSI6IjQzNjJjN2NjLTNlOGQtNDUxOS1iMzQ2LWU0Y2VkZjE1MmFmOCIsInNpZCI6Ijk5MzYyYWQwLWY1NDAtNDIwMS04OWMxLTQ2Njc4ODA4YzlmNCJ9.5DWM6NSLcr8orInuL9SuDO6-mFqF0CaUCpv09MlTNaY",
  "access_expires_at": "2026-10-27T16:24:23.82503257Z",
  "refresh_token": "AsKLhGA4tjj1wVX0dW4kgOMoqILNazsapmN9-IA7s7I",
  "refresh_expires_at": "2026-11-26T16:09:23.824509209Z",
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
  "command_id": "f4e6f6b2-c7b6-42ab-8044-37ce4b496f00",
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
  "id": "289276aa-5213-4202-b8ef-e08433696185",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:14:23.874880Z",
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
  "command_id": "d9a9086a-f974-4f4d-88a4-dd1e387a759e",
  "platform": "ANDROID",
  "token": "sandbox-driver-43868e67-cc59-44f9-8422-4303f44feb2e"
}
```

```json
{
  "id": "450ca2e1-e943-4df0-93c6-cf888146353d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T16:09:23.912433Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "c2069a68-b5b9-406c-85d8-3570cdbe761e",
  "platform": "ANDROID",
  "token": "sandbox-rider-3168558f-0b05-43a5-9db4-22cb27514a6a"
}
```

```json
{
  "id": "c2d53a61-73f9-40a7-8946-96169ea3b7f4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T16:09:23.942931Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8548b071-3968-45fe-beb7-05191417fa79",
  "quote_id": "289276aa-5213-4202-b8ef-e08433696185",
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
  "id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50434a52-88c3-4dc7-8ece-84da2a5113dc",
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
  "created_at": "2026-10-27T16:09:23.978607Z",
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
    "id": "1a6b9ff7-d2e7-4ac6-87a7-9d81cc67967f",
    "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
    "expires_at": "2026-10-27T16:09:38.984627Z",
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

`POST /api/driver/v1/offers/1a6b9ff7-d2e7-4ac6-87a7-9d81cc67967f/accept` → **200**

```json
{
  "command_id": "05e005e9-69dd-4440-91f7-bff3a21b3e3f"
}
```

```json
{
  "id": "95527832-944e-46d4-ab00-7769c429ff4c",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c574116b-8bf3-426a-86d9-a52ac4188f7a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:09:23.959Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:09:23.959Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:09:23.959Z` → **200**

```json
[
  {
    "at": "2026-10-27T16:09:25.703132968Z",
    "token_suffix": "4feb2e",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "bd32356e-6bac-4463-8246-7eeff59094af",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671212417&after=2026-10-27T16:09:23.959Z` → **200**

```json
[
  {
    "at": "2026-10-27T16:09:25.705113012Z",
    "token_suffix": "514a6a",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "67f821f7-12b7-4ebd-93df-6cadbb0cd22c",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed/messages` → **201**

```json
{
  "command_id": "dbaec129-a56d-4706-945e-b8c10942b08f",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "bb032822-dac2-4f07-a24e-b7c0b9756805",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T16:09:26.166775355Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c574116b-8bf3-426a-86d9-a52ac4188f7a",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "assignment_id": "95527832-944e-46d4-ab00-7769c429ff4c",
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

`POST /api/driver/v1/trips/c574116b-8bf3-426a-86d9-a52ac4188f7a/messages` → **201**

```json
{
  "command_id": "87adb6e7-512f-4cd0-8d77-94c06ce977a2",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ba7817cb-e749-40c3-9291-2d08e1088fb5",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T16:09:26.210473009Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c574116b-8bf3-426a-86d9-a52ac4188f7a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671212417"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:26Z",
    "sequence": 1793117366272
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:26.28825Z",
  "last_location_at": "2026-10-27T16:09:26.28825Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c574116b-8bf3-426a-86d9-a52ac4188f7a",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "assignment_id": "95527832-944e-46d4-ab00-7769c429ff4c",
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

`POST /api/driver/v1/trips/c574116b-8bf3-426a-86d9-a52ac4188f7a/arrive` → **200**

```json
{
  "command_id": "504eca44-24f8-4122-a971-2c4e1bd7f0df",
  "expected_version": 0
}
```

```json
{
  "id": "c574116b-8bf3-426a-86d9-a52ac4188f7a",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "assignment_id": "95527832-944e-46d4-ab00-7769c429ff4c",
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
  "arrived_at": "2026-10-27T16:09:26.331099Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/c574116b-8bf3-426a-86d9-a52ac4188f7a/start` → **200**

```json
{
  "command_id": "197f3ac2-fa3e-4e0d-a12b-80ad48854fbf",
  "expected_version": 1
}
```

```json
{
  "id": "c574116b-8bf3-426a-86d9-a52ac4188f7a",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "assignment_id": "95527832-944e-46d4-ab00-7769c429ff4c",
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
  "arrived_at": "2026-10-27T16:09:26.331099Z",
  "started_at": "2026-10-27T16:09:26.36239Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:26Z",
    "sequence": 1793117366382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:26.399722Z",
  "last_location_at": "2026-10-27T16:09:26.399722Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c574116b-8bf3-426a-86d9-a52ac4188f7a/complete` → **200**

```json
{
  "command_id": "b5b2babb-e695-4ca7-ab78-57f426fd84cb",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:09:26Z",
  "cash_received": true
}
```

```json
{
  "id": "c574116b-8bf3-426a-86d9-a52ac4188f7a",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "assignment_id": "95527832-944e-46d4-ab00-7769c429ff4c",
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
  "arrived_at": "2026-10-27T16:09:26.331099Z",
  "started_at": "2026-10-27T16:09:26.36239Z",
  "completed_at": "2026-10-27T16:09:26.42746Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed` → **200**

```json
{
  "id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "50434a52-88c3-4dc7-8ece-84da2a5113dc",
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
    "id": "95527832-944e-46d4-ab00-7769c429ff4c",
    "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c574116b-8bf3-426a-86d9-a52ac4188f7a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:09:23.978607Z",
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
    "id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T16:09:23.978607Z",
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
    "id": "c574116b-8bf3-426a-86d9-a52ac4188f7a",
    "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
    "order_short_number": 5,
    "created_at": "2026-10-27T16:09:24.041622Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f49ed85e-fed9-4bfd-aa5c-07e8ccbd62dd",
    "order_id": "7cd4305b-14d6-4969-8552-ff4fb7db90e3",
    "order_short_number": 1,
    "created_at": "2026-10-27T16:09:05.546666Z",
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

`GET /api/rider/v1/orders/c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed/tip` → **200**

```json
{
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
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
  "available_until": "2026-10-28T16:09:26.42746Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed/tip` → **201**

```json
{
  "command_id": "1ef63444-9955-40ef-9043-3c1910b0349a",
  "amount_minor": 1100
}
```

```json
{
  "id": "aeae3a34-278a-4349-a699-90dde3c01fc1",
  "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T16:09:29.574528Z"
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
  "session_id": "0c646143-d875-46d0-a098-ca7afb849049",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNjksImlhdCI6MTc5MzExNzM2OSwianRpIjoiOThlYzEzMDItOWYzMC00NDhhLWJjZTgtODMyZTlmZjg3YTFlIiwic2lkIjoiMGM2NDYxNDMtZDg3NS00NmQwLWEwOTgtY2E3YWZiODQ5MDQ5In0.-T1u-1JQfASAVFEpYXrEGwBlnY0qB-Pq0SqOTQJm9Rc",
  "access_expires_at": "2026-10-27T16:24:29.897244014Z",
  "refresh_token": "AV9SjpmSdOSnA5g_QOl3MvqtzbpOfYzFe4hcZw3vlFc",
  "refresh_expires_at": "2026-10-28T04:09:29.896700949Z",
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
  "session_id": "d0b71d38-8227-48d7-b262-6f5deb089419",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNzAsImlhdCI6MTc5MzExNzM3MCwianRpIjoiMGE2M2E4YTMtYmE0Yy00NDU1LWJmMGQtZDYwYmM4N2MzYzBiIiwic2lkIjoiZDBiNzFkMzgtODIyNy00OGQ3LWIyNjItNmY1ZGViMDg5NDE5In0.RhaFDN3FITYvAclOOKbNWVwvdBsYcIgbaOVB38oamJA",
  "access_expires_at": "2026-10-27T16:24:30.214978652Z",
  "refresh_token": "nArYZZXCh_1mnbTVt5Z_c25C3S8Q6aw-2j5_553Ypoc",
  "refresh_expires_at": "2026-10-28T04:09:30.214558738Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:09:23.97954Z",
      "actor": {
        "type": "CLIENT",
        "id": "50434a52-88c3-4dc7-8ece-84da2a5113dc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
        "quote_id": "289276aa-5213-4202-b8ef-e08433696185",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:09:23.983201Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
        "attempt_id": "4ee64e20-0a08-40ae-9d91-06bff01561d6",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:09:23.991089Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1a6b9ff7-d2e7-4ac6-87a7-9d81cc67967f",
        "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:09:24.043591Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1a6b9ff7-d2e7-4ac6-87a7-9d81cc67967f",
        "order_id": "c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "95527832-944e-46d4-ab00-7769c429ff4c"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order c9a2c1e8-28a0-43c2-b42d-1bdaf87d89ed.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31914"
}
```

```json
{
  "challenge_id": "4d1fbe4e-4cf9-47e5-918d-62c939127146",
  "expires_at": "2026-10-27T16:14:30.274299649Z",
  "resend_available_at": "2026-10-27T16:09:31.274299649Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "830487",
  "sent_at": "2026-10-27T16:09:30.276578652Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d1fbe4e-4cf9-47e5-918d-62c939127146",
  "code": "830487",
  "device_ref": "sandbox-31914"
}
```

```json
{
  "session_id": "43ef92d7-d800-48af-aaef-c8d676ca9404",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI3MCwiaWF0IjoxNzkzMTE3MzcwLCJqdGkiOiIyZmZlMzMxMS1mZDMwLTQxZjktYjUxZi1mZDJlYjM1MmViZjkiLCJzaWQiOiI0M2VmOTJkNy1kODAwLTQ4YWYtYWFlZi1jOGQ2NzZjYTk0MDQifQ.anAJYcVGvvri1xudqzVAkdN1VWmm5_im1ayIZy16_Xg",
  "access_expires_at": "2026-10-27T16:24:30.321639455Z",
  "refresh_token": "mlPFyndAHHFEFhJSWR3dbMFrEmqGZqpnJ4WGG3cSFLo",
  "refresh_expires_at": "2026-11-26T16:09:30.321132047Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:26.399722Z",
  "last_location_at": "2026-10-27T16:09:26.399722Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/handover` → **200**

```json
{
  "command_id": "01ed2d85-516f-416a-8a06-935ebd06028e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:26.399722Z",
  "last_location_at": "2026-10-27T16:09:26.399722Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:30Z",
    "sequence": 1793117370405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:30.421038Z",
  "last_location_at": "2026-10-27T16:09:30.421038Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666435111",
  "device_ref": "sandbox-17632"
}
```

```json
{
  "challenge_id": "d775770c-8abc-4275-9308-5f1edacc3853",
  "expires_at": "2026-10-27T16:14:30.442912915Z",
  "resend_available_at": "2026-10-27T16:09:31.442912915Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666435111` → **200**

```json
{
  "phone": "+380666435111",
  "audience": "CLIENT",
  "code": "449825",
  "sent_at": "2026-10-27T16:09:30.44493583Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d775770c-8abc-4275-9308-5f1edacc3853",
  "code": "449825",
  "device_ref": "sandbox-17632"
}
```

```json
{
  "session_id": "71730097-f059-43fa-aec7-69f35edf1711",
  "subject": {
    "type": "CLIENT",
    "id": "9cd15bb9-5a9c-4baf-9547-c1266bf05e39"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Y2QxNWJiOS01YTljLTRiYWYtOTU0Ny1jMTI2NmJmMDVlMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjcwLCJpYXQiOjE3OTMxMTczNzAsImp0aSI6ImU4YmQxNjE0LTlhMzAtNDUzNi1iZWViLTAyMWY4YTZlOTE2OSIsInNpZCI6IjcxNzMwMDk3LWYwNTktNDNmYS1hZWM3LTY5ZjM1ZWRmMTcxMSJ9.-ylV31B3g7FaDn38A_okbLoeFjf8d2jmpfqq1tWP4HQ",
  "access_expires_at": "2026-10-27T16:24:30.491131418Z",
  "refresh_token": "v9qN655RhTB_QJ5LgG8JSbxi92yvooesy4yBbY28too",
  "refresh_expires_at": "2026-11-26T16:09:30.490453198Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e6199cfa-6af3-496a-aa5c-7444d3cc0732",
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
  "id": "f4189e5c-8584-4564-a3e7-543c797b4b0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T16:14:30.520479Z",
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
  "command_id": "39763d36-364e-49e6-a85b-61234f2eb331",
  "quote_id": "f4189e5c-8584-4564-a3e7-543c797b4b0f",
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
  "id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9cd15bb9-5a9c-4baf-9547-c1266bf05e39",
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
  "created_at": "2026-10-27T16:09:30.552749Z",
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
    "id": "d6a79b36-56de-4be4-b066-ffb036fa2e79",
    "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
    "expires_at": "2026-10-27T16:09:45.556741Z",
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

`POST /api/driver/v1/offers/d6a79b36-56de-4be4-b066-ffb036fa2e79/accept` → **200**

```json
{
  "command_id": "391a98f6-21a0-4434-b558-2778ddc131b5"
}
```

```json
{
  "id": "33afea1d-403f-4fec-bebd-a70493e17d42",
  "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2a4df265-0c3d-422b-9ba5-f3ee9a7975e0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2a4df265-0c3d-422b-9ba5-f3ee9a7975e0",
  "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
  "assignment_id": "33afea1d-403f-4fec-bebd-a70493e17d42",
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

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:30Z",
    "sequence": 1793117370654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:30.670331Z",
  "last_location_at": "2026-10-27T16:09:30.670331Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2a4df265-0c3d-422b-9ba5-f3ee9a7975e0/arrive` → **200**

```json
{
  "command_id": "8621fd76-c8f0-42cb-8b7d-08f8991da6e9",
  "expected_version": 0
}
```

```json
{
  "id": "2a4df265-0c3d-422b-9ba5-f3ee9a7975e0",
  "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
  "assignment_id": "33afea1d-403f-4fec-bebd-a70493e17d42",
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
  "arrived_at": "2026-10-27T16:09:30.700812Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/2a4df265-0c3d-422b-9ba5-f3ee9a7975e0/start` → **200**

```json
{
  "command_id": "f4ed178f-5494-4564-b9d9-ace56be976e6",
  "expected_version": 1
}
```

```json
{
  "id": "2a4df265-0c3d-422b-9ba5-f3ee9a7975e0",
  "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
  "assignment_id": "33afea1d-403f-4fec-bebd-a70493e17d42",
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
  "arrived_at": "2026-10-27T16:09:30.700812Z",
  "started_at": "2026-10-27T16:09:30.738452Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:30Z",
    "sequence": 1793117370758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:30.773893Z",
  "last_location_at": "2026-10-27T16:09:30.773893Z",
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
  "device_ref": "sandbox-15132"
}
```

```json
{
  "challenge_id": "4b895336-a26e-4921-b45c-0a442ec5344a",
  "expires_at": "2026-10-27T16:14:30.79909194Z",
  "resend_available_at": "2026-10-27T16:09:31.79909194Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "835046",
  "sent_at": "2026-10-27T16:09:30.801015744Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b895336-a26e-4921-b45c-0a442ec5344a",
  "code": "835046",
  "device_ref": "sandbox-15132"
}
```

```json
{
  "session_id": "9c71ab42-afc8-48eb-a531-e92ba88663dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI3MCwiaWF0IjoxNzkzMTE3MzcwLCJqdGkiOiI1NWRkZjYxNC02MGM5LTQxZWUtYWVhZC1jZDVhMmYzYTVkNGEiLCJzaWQiOiI5YzcxYWI0Mi1hZmM4LTQ4ZWItYTUzMS1lOTJiYTg4NjYzZGQifQ.vC8cddNNSOz2OQ7DNo8mlbp0-oGNwAPaXFNQbyXUM3c",
  "access_expires_at": "2026-10-27T16:24:30.880648001Z",
  "refresh_token": "KrKTDzjRU5pg-JLLKACEMhu7ZqtxEdAGHyV1VO7aMks",
  "refresh_expires_at": "2026-11-26T16:09:30.879975081Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bda963eb-7509-462f-bb20-eb4ccea87a1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:09.931615Z",
  "last_location_at": "2026-10-27T16:09:09.931615Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bda963eb-7509-462f-bb20-eb4ccea87a1e/handover` → **200**

```json
{
  "command_id": "bcbacf20-4693-4843-93f8-4fed07789ba6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bda963eb-7509-462f-bb20-eb4ccea87a1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:09.931615Z",
  "last_location_at": "2026-10-27T16:09:09.931615Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bda963eb-7509-462f-bb20-eb4ccea87a1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:30Z",
    "sequence": 1793117370949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bda963eb-7509-462f-bb20-eb4ccea87a1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:30.964862Z",
  "last_location_at": "2026-10-27T16:09:30.964862Z",
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
  "session_id": "19f6be6c-5679-4635-9bfa-3c209105b627",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNzEsImlhdCI6MTc5MzExNzM3MSwianRpIjoiNWNmMTM5YWUtNjFlNy00MDU5LWE1ZDctOTM3YjQ4MWE1YzU1Iiwic2lkIjoiMTlmNmJlNmMtNTY3OS00NjM1LTliZmEtM2MyMDkxMDViNjI3In0.vSgoFIaodd5M9T_la8hXVI0Nm7cXcSP5SNhAqIRWK2A",
  "access_expires_at": "2026-10-27T16:24:31.279628232Z",
  "refresh_token": "SGqBxU8mPu8_RD_r5h4cmUYIi2XP5cKsmUF-jcW-nms",
  "refresh_expires_at": "2026-10-28T04:09:31.279098816Z",
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
  "session_id": "418abc4c-ce9f-40b4-b03e-439afd4862ee",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNzEsImlhdCI6MTc5MzExNzM3MSwianRpIjoiMGUzNGVlOTItNDcwYS00MTJhLTk3MWUtNjhjM2RjOWZkZDJiIiwic2lkIjoiNDE4YWJjNGMtY2U5Zi00MGI0LWIwM2UtNDM5YWZkNDg2MmVlIn0.bfi4eC8LlvOm9E28yyRgL0BjOh3jiWPh5uPXssf3fiw",
  "access_expires_at": "2026-10-27T16:24:31.598059086Z",
  "refresh_token": "wVKvPKak9hsHvAFTESa5rKyBYRWEA2f1ORDuHYl3c4M",
  "refresh_expires_at": "2026-10-28T04:09:31.597588151Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d5a42ab7-0040-41b9-8e90-e1c494612b38` → **200**

```json
{
  "id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9cd15bb9-5a9c-4baf-9547-c1266bf05e39",
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
    "id": "33afea1d-403f-4fec-bebd-a70493e17d42",
    "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2a4df265-0c3d-422b-9ba5-f3ee9a7975e0",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T16:09:30.552749Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d5a42ab7-0040-41b9-8e90-e1c494612b38/interrupt` → **200**

```json
{
  "command_id": "1dc53a95-35e2-4d29-bce9-00821edd03f0",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "9cd15bb9-5a9c-4baf-9547-c1266bf05e39",
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
      "id": "33afea1d-403f-4fec-bebd-a70493e17d42",
      "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "2a4df265-0c3d-422b-9ba5-f3ee9a7975e0",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T16:09:30.552749Z",
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
    "id": "db34e549-f0fe-48e8-9f8e-f74122b80360",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "9cd15bb9-5a9c-4baf-9547-c1266bf05e39",
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
    "id": "180b2c67-a8a5-404a-a84c-86284024bc7c",
    "order_id": "db34e549-f0fe-48e8-9f8e-f74122b80360",
    "expires_at": "2026-10-27T16:09:46.678858Z",
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

`POST /api/driver/v1/offers/180b2c67-a8a5-404a-a84c-86284024bc7c/accept` → **200**

```json
{
  "command_id": "4b6ab841-d62d-4b09-a655-2f194bddcb20"
}
```

```json
{
  "id": "df7a3e38-359b-42ed-8101-9e8cf6e707c3",
  "order_id": "db34e549-f0fe-48e8-9f8e-f74122b80360",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f6be6f0a-93c3-48de-a0db-0b29ddb61059",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f6be6f0a-93c3-48de-a0db-0b29ddb61059",
  "order_id": "db34e549-f0fe-48e8-9f8e-f74122b80360",
  "assignment_id": "df7a3e38-359b-42ed-8101-9e8cf6e707c3",
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
  "session_id": "bda963eb-7509-462f-bb20-eb4ccea87a1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:30.964862Z",
  "last_location_at": "2026-10-27T16:09:30.964862Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/bda963eb-7509-462f-bb20-eb4ccea87a1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:31Z",
    "sequence": 1793117371808
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bda963eb-7509-462f-bb20-eb4ccea87a1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:31.824851Z",
  "last_location_at": "2026-10-27T16:09:31.824851Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f6be6f0a-93c3-48de-a0db-0b29ddb61059/arrive` → **200**

```json
{
  "command_id": "d5ea8257-7f6b-4bbe-8f79-2f250d259431",
  "expected_version": 0
}
```

```json
{
  "id": "f6be6f0a-93c3-48de-a0db-0b29ddb61059",
  "order_id": "db34e549-f0fe-48e8-9f8e-f74122b80360",
  "assignment_id": "df7a3e38-359b-42ed-8101-9e8cf6e707c3",
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
  "arrived_at": "2026-10-27T16:09:31.8548Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/f6be6f0a-93c3-48de-a0db-0b29ddb61059/start` → **200**

```json
{
  "command_id": "ec71d5f2-24d1-4002-bb65-4ef972eb7f2a",
  "expected_version": 1
}
```

```json
{
  "id": "f6be6f0a-93c3-48de-a0db-0b29ddb61059",
  "order_id": "db34e549-f0fe-48e8-9f8e-f74122b80360",
  "assignment_id": "df7a3e38-359b-42ed-8101-9e8cf6e707c3",
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
  "arrived_at": "2026-10-27T16:09:31.8548Z",
  "started_at": "2026-10-27T16:09:31.88672Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/f6be6f0a-93c3-48de-a0db-0b29ddb61059/complete` → **200**

```json
{
  "command_id": "c6305a52-adad-4b04-aede-db0636adc14f",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:09:31Z"
}
```

```json
{
  "id": "f6be6f0a-93c3-48de-a0db-0b29ddb61059",
  "order_id": "db34e549-f0fe-48e8-9f8e-f74122b80360",
  "assignment_id": "df7a3e38-359b-42ed-8101-9e8cf6e707c3",
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
  "arrived_at": "2026-10-27T16:09:31.8548Z",
  "started_at": "2026-10-27T16:09:31.88672Z",
  "completed_at": "2026-10-27T16:09:31.922211Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "db34e549-f0fe-48e8-9f8e-f74122b80360",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T16:09:31.667614Z",
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
    "id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:09:30.552749Z",
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

`GET /api/operator/v1/orders/d5a42ab7-0040-41b9-8e90-e1c494612b38/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:09:30.553568Z",
      "actor": {
        "type": "CLIENT",
        "id": "9cd15bb9-5a9c-4baf-9547-c1266bf05e39",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
        "quote_id": "f4189e5c-8584-4564-a3e7-543c797b4b0f",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:09:30.555758Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
        "attempt_id": "e5d9144a-b31b-44a8-aa42-65d8ab11e87c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:09:30.561576Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d6a79b36-56de-4be4-b066-ffb036fa2e79",
        "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:09:30.617731Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d6a79b36-56de-4be4-b066-ffb036fa2e79",
        "order_id": "d5a42ab7-0040-41b9-8e90-e1c494612b38",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "33afea1d-403f-4fec-bebd-a70493e17d42"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted d5a42ab7-0040-41b9-8e90-e1c494612b38, follow-up db34e549-f0fe-48e8-9f8e-f74122b80360.

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
  "session_id": "5df0b8af-0cb7-492c-842f-a5b76aa325b8",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNzUsImlhdCI6MTc5MzExNzM3NSwianRpIjoiZGU4Y2E3ZTYtOTkwOS00NWMyLWEzZjgtZDFlZWU2ZmU5MGRiIiwic2lkIjoiNWRmMGI4YWYtMGNiNy00OTJjLTg0MmYtYTViNzZhYTMyNWI4In0.DzrVLkd0MP6TcU0fGa6BZvrT6BValv1lMwx29XMlYdk",
  "access_expires_at": "2026-10-27T16:24:35.290357906Z",
  "refresh_token": "XF07D4vCUudAoIMI0JG9pC9ehKeTzNakaUkI_ky0I9Y",
  "refresh_expires_at": "2026-10-28T04:09:35.289805084Z",
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
  "session_id": "4664619b-09ae-4cae-98cf-ab6cdf6b0b33",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNzUsImlhdCI6MTc5MzExNzM3NSwianRpIjoiNDAzMzRjMjItMDY0MC00MmI2LTkxOWYtZTg0MTdlYmQ1YTIwIiwic2lkIjoiNDY2NDYxOWItMDlhZS00Y2FlLTk4Y2YtYWI2Y2RmNmIwYjMzIn0.R9p-IDLFrCaWv8nSPAMXxPvcmqkuWI0L28ml_oc86C4",
  "access_expires_at": "2026-10-27T16:24:35.594658467Z",
  "refresh_token": "TJX7sESq0mKdK_tCPFGGELS4Jem4g8jiITPdHYbS_jQ",
  "refresh_expires_at": "2026-10-28T04:09:35.594010756Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2028"
}
```

```json
{
  "challenge_id": "fcbaf878-0169-4d6d-862e-de0648acdd62",
  "expires_at": "2026-10-27T16:14:35.616826273Z",
  "resend_available_at": "2026-10-27T16:09:36.616826273Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "544464",
  "sent_at": "2026-10-27T16:09:35.618693587Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcbaf878-0169-4d6d-862e-de0648acdd62",
  "code": "544464",
  "device_ref": "sandbox-2028"
}
```

```json
{
  "session_id": "f16bb1ef-7d23-487b-8f97-ee9dc5b70fb3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI3NSwiaWF0IjoxNzkzMTE3Mzc1LCJqdGkiOiI3MzIyZjk3ZC0wODQ0LTQ3NDAtOWQ1NC01MjM3ZmUxMjMwMmMiLCJzaWQiOiJmMTZiYjFlZi03ZDIzLTQ4N2ItOGY5Ny1lZTlkYzViNzBmYjMifQ.8k0xTHAfWbkvQ_evZij-FHrkItWyOu4zdst-HUJ2CQ4",
  "access_expires_at": "2026-10-27T16:24:35.663208769Z",
  "refresh_token": "tDjSU_0kyFaE447oSJ-spPk8Rcycy1QTCoI4-sDOfjw",
  "refresh_expires_at": "2026-11-26T16:09:35.662836551Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:30.773893Z",
  "last_location_at": "2026-10-27T16:09:30.773893Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/handover` → **200**

```json
{
  "command_id": "7c1b9ffb-93e2-457d-9f0e-0eb172b84ef4",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:30.773893Z",
  "last_location_at": "2026-10-27T16:09:30.773893Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:35Z",
    "sequence": 1793117375727
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:35.741164Z",
  "last_location_at": "2026-10-27T16:09:35.741164Z",
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
  "command_id": "a5bda4a8-5590-482b-9263-53b066f71b00",
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
  "effective_at": "2026-10-27T16:09:35.802479Z",
  "changed_by": "d1a28922-3c22-484f-a013-6679adc0ed55",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "d1a28922-3c22-484f-a013-6679adc0ed55",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T16:09:35.829482156Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bb5b7ab8-e6b8-49b7-a1d2-0e49707069a7",
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
  "id": "ea82a746-084a-4edb-87e3-59dd6d727476",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:14:35.865608Z",
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
  "command_id": "a23f5715-13e3-48f9-bd62-e787e47f20db",
  "quote_id": "ea82a746-084a-4edb-87e3-59dd6d727476",
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
    "phone": "+3806711115077"
  }
}
```

```json
{
  "id": "6d000f83-91b0-4c14-ad7b-d658d95ee152",
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
  "created_at": "2026-10-27T16:09:35.911968Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115077"
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
    "id": "87879592-5189-4794-838d-d464816b4546",
    "order_id": "6d000f83-91b0-4c14-ad7b-d658d95ee152",
    "expires_at": "2026-10-27T16:09:50.916091Z",
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

`POST /api/driver/v1/offers/87879592-5189-4794-838d-d464816b4546/accept` → **200**

```json
{
  "command_id": "abf42f13-e903-447e-8059-35a5ab8a486b"
}
```

```json
{
  "id": "29505c9a-3333-4faf-a3af-1c39ef30709d",
  "order_id": "6d000f83-91b0-4c14-ad7b-d658d95ee152",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "35bc3352-792f-43ec-ae80-9a435b74851b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "35bc3352-792f-43ec-ae80-9a435b74851b",
  "order_id": "6d000f83-91b0-4c14-ad7b-d658d95ee152",
  "assignment_id": "29505c9a-3333-4faf-a3af-1c39ef30709d",
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

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:35Z",
    "sequence": 1793117375999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:36.013919Z",
  "last_location_at": "2026-10-27T16:09:36.013919Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/35bc3352-792f-43ec-ae80-9a435b74851b/arrive` → **200**

```json
{
  "command_id": "819b16f4-80c4-43ad-9c94-19cba0887ef9",
  "expected_version": 0
}
```

```json
{
  "id": "35bc3352-792f-43ec-ae80-9a435b74851b",
  "order_id": "6d000f83-91b0-4c14-ad7b-d658d95ee152",
  "assignment_id": "29505c9a-3333-4faf-a3af-1c39ef30709d",
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
  "arrived_at": "2026-10-27T16:09:36.042846Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/35bc3352-792f-43ec-ae80-9a435b74851b/start` → **200**

```json
{
  "command_id": "30572d27-c87d-441f-8853-c28f21dec193",
  "expected_version": 1
}
```

```json
{
  "id": "35bc3352-792f-43ec-ae80-9a435b74851b",
  "order_id": "6d000f83-91b0-4c14-ad7b-d658d95ee152",
  "assignment_id": "29505c9a-3333-4faf-a3af-1c39ef30709d",
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
  "arrived_at": "2026-10-27T16:09:36.042846Z",
  "started_at": "2026-10-27T16:09:36.074593Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/35bc3352-792f-43ec-ae80-9a435b74851b/complete` → **200**

```json
{
  "command_id": "935bbf71-828c-45d9-8f8d-20b954d96540",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:09:36Z",
  "cash_received": true
}
```

```json
{
  "id": "35bc3352-792f-43ec-ae80-9a435b74851b",
  "order_id": "6d000f83-91b0-4c14-ad7b-d658d95ee152",
  "assignment_id": "29505c9a-3333-4faf-a3af-1c39ef30709d",
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
  "arrived_at": "2026-10-27T16:09:36.042846Z",
  "started_at": "2026-10-27T16:09:36.074593Z",
  "completed_at": "2026-10-27T16:09:36.110013Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ce6229b8-84ca-4c22-9bbb-2cccc0448583",
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
  "id": "13f1752d-6916-4adb-8039-2578d3070138",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:14:36.152556Z",
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
  "command_id": "a9f333ec-a2af-40e7-8409-6f744b3e67a8",
  "quote_id": "13f1752d-6916-4adb-8039-2578d3070138",
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
    "phone": "+380671111524"
  }
}
```

```json
{
  "id": "f6b4d712-e476-4321-8e10-020b2074d624",
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
  "created_at": "2026-10-27T16:09:36.183375Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111524"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f6b4d712-e476-4321-8e10-020b2074d624` → **200**

```json
{
  "id": "f6b4d712-e476-4321-8e10-020b2074d624",
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
  "created_at": "2026-10-27T16:09:36.183375Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111524"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f6b4d712-e476-4321-8e10-020b2074d624/cancel` → **200**

```json
{
  "command_id": "9d9e69c6-b88d-464a-beea-5584496769f7",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "f6b4d712-e476-4321-8e10-020b2074d624",
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
  "created_at": "2026-10-27T16:09:36.183375Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111524"
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
  "staff_id": "d1a28922-3c22-484f-a013-6679adc0ed55",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T16:09:36.118212Z",
  "last_entries": [
    {
      "order_id": "f6b4d712-e476-4321-8e10-020b2074d624",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T16:09:36.248505Z"
    },
    {
      "order_id": "6d000f83-91b0-4c14-ad7b-d658d95ee152",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T16:09:36.118212Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba33a1c5-5687-47b3-8084-4c002272be1e",
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
  "last_heartbeat_at": "2026-10-27T16:09:36.013919Z",
  "last_location_at": "2026-10-27T16:09:36.013919Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba33a1c5-5687-47b3-8084-4c002272be1e/close` → **200**

```json
{
  "command_id": "99536e1b-cb0f-4a9b-a343-c496854f7bc4",
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

Done: operator bonus for fulfilled 6d000f83-91b0-4c14-ad7b-d658d95ee152 and operator-fault cancellation f6b4d712-e476-4321-8e10-020b2074d624.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630408436",
  "device_ref": "sandbox-28397"
}
```

```json
{
  "challenge_id": "f746daa3-22bf-44d5-a438-d53c4237d8e9",
  "expires_at": "2026-10-27T16:14:38.387711691Z",
  "resend_available_at": "2026-10-27T16:09:39.387711691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630408436` → **200**

```json
{
  "phone": "+380630408436",
  "audience": "CLIENT",
  "code": "389090",
  "sent_at": "2026-10-27T16:09:38.389470064Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f746daa3-22bf-44d5-a438-d53c4237d8e9",
  "code": "389090",
  "device_ref": "sandbox-28397"
}
```

```json
{
  "session_id": "c7390bfe-c39d-4b28-b21c-ca7cf193b09d",
  "subject": {
    "type": "CLIENT",
    "id": "5c060972-23d6-41ea-a282-f67d550cd1c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzA2MDk3Mi0yM2Q2LTQxZWEtYTI4Mi1mNjdkNTUwY2QxYzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4Mjc4LCJpYXQiOjE3OTMxMTczNzgsImp0aSI6ImRhZTNmNjkxLTRlMjItNGRiNC1hMjhhLTM1ZjdkMWVhYTg3NyIsInNpZCI6ImM3MzkwYmZlLWMzOWQtNGIyOC1iMjFjLWNhN2NmMTkzYjA5ZCJ9.fMcX3KRDILak9saVPyq-MHJX78ZMMtOSoiAraggAeXg",
  "access_expires_at": "2026-10-27T16:24:38.432943657Z",
  "refresh_token": "OIzGDZ_Cd53kGGjNGT9pv-w0Jo0HLfcnb9Tf4TXkO3g",
  "refresh_expires_at": "2026-11-26T16:09:38.432392091Z",
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
  "session_id": "3bc4fb42-0211-4a67-8fc6-aa434984d599",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNzgsImlhdCI6MTc5MzExNzM3OCwianRpIjoiMTU2ZjU5OGYtZjBlOS00NGRkLTkyNWQtZjQzZjBlYWU0ZDA2Iiwic2lkIjoiM2JjNGZiNDItMDIxMS00YTY3LThmYzYtYWE0MzQ5ODRkNTk5In0.PfGydesP_psWWvcJYD1uySxNh_seaXizELyu3yxh4hU",
  "access_expires_at": "2026-10-27T16:24:38.812142879Z",
  "refresh_token": "Y2prQoPdrRjCF0_lVhryeTGicpXBN_D8FX7-YUIkGVs",
  "refresh_expires_at": "2026-10-28T04:09:38.811709198Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630408436` → **200**

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
  "correlation_id": "99386987-ec9b-45dd-a650-94c87ea30cd6"
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
  "session_id": "d646edfa-e2ef-4577-855b-9eaf6082bdf8",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNzksImlhdCI6MTc5MzExNzM3OSwianRpIjoiZTQwMTFjNDAtY2RlNC00MWU5LTg1ZWEtOWQ4YzM0Njc3NTFlIiwic2lkIjoiZDY0NmVkZmEtZTJlZi00NTc3LTg1NWItOWVhZjYwODJiZGY4In0.PZJY1ma3RCm3VHqphC0QTtELzXDpSusOr1T7rlDr2ZE",
  "access_expires_at": "2026-10-27T16:24:39.170444614Z",
  "refresh_token": "_2fhe80wyuEyThOYMQVUSj50nY9-KA9TdSC_oMNtYbM",
  "refresh_expires_at": "2026-10-28T04:09:39.169883855Z",
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
  "command_id": "06189239-be4b-41a9-8642-44c60a105c28",
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
  "changed_by": "d1a28922-3c22-484f-a013-6679adc0ed55",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T16:09:39.228229496Z"
}
```

## The rider books the airport for 2026-10-27T19:09:38Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600087643",
  "device_ref": "sandbox-3889"
}
```

```json
{
  "challenge_id": "5ab9f65d-1d41-4842-95a0-e0d4d0d81dc7",
  "expires_at": "2026-10-27T16:14:39.252503433Z",
  "resend_available_at": "2026-10-27T16:09:40.252503433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600087643` → **200**

```json
{
  "phone": "+48600087643",
  "audience": "CLIENT",
  "code": "198680",
  "sent_at": "2026-10-27T16:09:39.254036721Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ab9f65d-1d41-4842-95a0-e0d4d0d81dc7",
  "code": "198680",
  "device_ref": "sandbox-3889"
}
```

```json
{
  "session_id": "7cc5b5ef-2217-4f25-8cca-a527679bc770",
  "subject": {
    "type": "CLIENT",
    "id": "aaa62d17-0f17-48fb-885d-d5c6113baa4b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWE2MmQxNy0wZjE3LTQ4ZmItODg1ZC1kNWM2MTEzYmFhNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4Mjc5LCJpYXQiOjE3OTMxMTczNzksImp0aSI6Ijg0NGY5ZGExLWU3MWItNDIwNy04NGNiLTEzMjkzOWZkMDkxMyIsInNpZCI6IjdjYzViNWVmLTIyMTctNGYyNS04Y2NhLWE1Mjc2NzliYzc3MCJ9.vnF0Td6zAnYLybbYfwWNb8kw-npZPBzLjDakeeK9MdQ",
  "access_expires_at": "2026-10-27T16:24:39.303525945Z",
  "refresh_token": "57VazMZ8QNvZ71r8OWVKKhlnV_SzisU7WqvZ0r5c4Do",
  "refresh_expires_at": "2026-11-26T16:09:39.303028504Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3d019db9-f610-418a-a624-280ed8995996",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T19:09:38Z"
}
```

```json
{
  "id": "dc33b185-d33b-4f2d-b480-5807973323fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T16:14:39.331600Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T19:09:38Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "77bd8818-88b6-41e4-aa46-054f0cded369",
  "quote_id": "dc33b185-d33b-4f2d-b480-5807973323fa",
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
  "pickup_at": "2026-10-27T19:09:38Z"
}
```

```json
{
  "id": "5ee252bb-fda1-413f-9503-61d448f85a39",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "aaa62d17-0f17-48fb-885d-d5c6113baa4b",
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
  "created_at": "2026-10-27T16:09:39.362919Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:09:38Z",
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
  "device_ref": "sandbox-29071"
}
```

```json
{
  "challenge_id": "14ef6df5-87a0-4e43-b7f3-b04c5cc8ee31",
  "expires_at": "2026-10-27T16:14:39.38733127Z",
  "resend_available_at": "2026-10-27T16:09:40.38733127Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "806205",
  "sent_at": "2026-10-27T16:09:39.389645012Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14ef6df5-87a0-4e43-b7f3-b04c5cc8ee31",
  "code": "806205",
  "device_ref": "sandbox-29071"
}
```

```json
{
  "session_id": "682a53c9-1b76-4dab-89bc-a2bb4876b051",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI3OSwiaWF0IjoxNzkzMTE3Mzc5LCJqdGkiOiIzNzU5NTRhYy0yODgyLTRhNGMtOWUwYi1iMDQ5MTQyMjNiNDEiLCJzaWQiOiI2ODJhNTNjOS0xYjc2LTRkYWItODliYy1hMmJiNDg3NmIwNTEifQ.0GfeCxBbbibx3jIJHTwjSfSW77z9aP5UCWRTQHgC8ig",
  "access_expires_at": "2026-10-27T16:24:39.436497977Z",
  "refresh_token": "o1Z6Kf4_gAmCv_n1aSM1Oz5VxCqqFresz1KwswRQuR8",
  "refresh_expires_at": "2026-11-26T16:09:39.435883172Z",
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
  "command_id": "5010b51c-1050-48a7-a3df-7a58274645c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:39Z",
    "sequence": 1793117379481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "36f58ebc-c94e-46ef-9ad4-814ac65b36af",
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
  "last_heartbeat_at": "2026-10-27T16:09:39.4954Z",
  "last_location_at": "2026-10-27T16:09:39.4954Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "5ee252bb-fda1-413f-9503-61d448f85a39",
      "short_number": 10,
      "pickup_at": "2026-10-27T19:09:38Z",
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

`POST /api/driver/v1/preorders/5ee252bb-fda1-413f-9503-61d448f85a39/reserve` → **200**

```json
{
  "command_id": "04e6fd3b-8782-4672-beb3-3c31cf93abd3"
}
```

```json
{
  "id": "c43190b8-fbb6-4ff9-90db-69d262a5ba11",
  "state": "RESERVED",
  "order": {
    "order_id": "5ee252bb-fda1-413f-9503-61d448f85a39",
    "short_number": 10,
    "pickup_at": "2026-10-27T19:09:38Z",
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
  "reserved_at": "2026-10-27T16:09:39.550344Z",
  "confirm_from": "2026-10-27T18:39:38Z",
  "confirm_until": "2026-10-27T18:49:38Z",
  "drop_until": "2026-10-27T18:09:38Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c43190b8-fbb6-4ff9-90db-69d262a5ba11",
      "state": "RESERVED",
      "order": {
        "order_id": "5ee252bb-fda1-413f-9503-61d448f85a39",
        "short_number": 10,
        "pickup_at": "2026-10-27T19:09:38Z",
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
      "reserved_at": "2026-10-27T16:09:39.550344Z",
      "confirm_from": "2026-10-27T18:39:38Z",
      "confirm_until": "2026-10-27T18:49:38Z",
      "drop_until": "2026-10-27T18:09:38Z"
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
      "id": "c43190b8-fbb6-4ff9-90db-69d262a5ba11",
      "state": "RESERVED",
      "order": {
        "order_id": "5ee252bb-fda1-413f-9503-61d448f85a39",
        "short_number": 10,
        "pickup_at": "2026-10-27T19:09:38Z",
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
      "reserved_at": "2026-10-27T16:09:39.550344Z",
      "confirm_from": "2026-10-27T18:39:38Z",
      "confirm_until": "2026-10-27T18:49:38Z",
      "drop_until": "2026-10-27T18:09:38Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c43190b8-fbb6-4ff9-90db-69d262a5ba11/confirm` → **409**

```json
{
  "command_id": "d0f02abb-39a6-4933-8778-7c2a014e2210"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c43190b8-fbb6-4ff9-90db-69d262a5ba11/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "00bcb8ac-32c9-4e21-a55a-2c6cefc920c7"
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
  "session_id": "acd44f4c-03ce-4eee-91f3-af7eccabb629",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyNzksImlhdCI6MTc5MzExNzM3OSwianRpIjoiNjkwN2JlOWMtOWQyNy00MjhlLWFlNWEtZWNhNjE0YjcxZTg1Iiwic2lkIjoiYWNkNDRmNGMtMDNjZS00ZWVlLTkxZjMtYWY3ZWNjYWJiNjI5In0.GqEFvKfFwwsvRV9U0eusZUqFfuDMIquVdk832lwyBvQ",
  "access_expires_at": "2026-10-27T16:24:39.911737262Z",
  "refresh_token": "uhcdPoR4lhtxw3s-9J-kwbuZMNIVABk7B5EE-LjLaXs",
  "refresh_expires_at": "2026-10-28T04:09:39.911218467Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5ee252bb-fda1-413f-9503-61d448f85a39` → **200**

```json
{
  "id": "5ee252bb-fda1-413f-9503-61d448f85a39",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "aaa62d17-0f17-48fb-885d-d5c6113baa4b",
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
  "created_at": "2026-10-27T16:09:39.362919Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T19:09:38Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c43190b8-fbb6-4ff9-90db-69d262a5ba11",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T16:09:39.550344Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5ee252bb-fda1-413f-9503-61d448f85a39/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T16:09:39.364315Z",
      "actor": {
        "type": "CLIENT",
        "id": "aaa62d17-0f17-48fb-885d-d5c6113baa4b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "5ee252bb-fda1-413f-9503-61d448f85a39",
        "preorder": true,
        "quote_id": "dc33b185-d33b-4f2d-b480-5807973323fa",
        "pickup_at": "2026-10-27T19:09:38Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T16:09:39.551354Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5ee252bb-fda1-413f-9503-61d448f85a39",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c43190b8-fbb6-4ff9-90db-69d262a5ba11"
      }
    }
  ]
}
```

Done: pre-order 5ee252bb-fda1-413f-9503-61d448f85a39, reservation c43190b8-fbb6-4ff9-90db-69d262a5ba11.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31064"
}
```

```json
{
  "challenge_id": "c8e0f328-67b8-43c3-9928-eaa84cd51189",
  "expires_at": "2026-10-27T16:14:39.984955202Z",
  "resend_available_at": "2026-10-27T16:09:40.984955202Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "278701",
  "sent_at": "2026-10-27T16:09:39.986564232Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8e0f328-67b8-43c3-9928-eaa84cd51189",
  "code": "278701",
  "device_ref": "sandbox-31064"
}
```

```json
{
  "session_id": "f838ad74-ce62-43fa-8fd9-4b04031df941",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI4MCwiaWF0IjoxNzkzMTE3MzgwLCJqdGkiOiI0OGE3YzFkNS1hM2U5LTQ2ZTUtOTg4Ny1hZDc1NzhlNjc2YzYiLCJzaWQiOiJmODM4YWQ3NC1jZTYyLTQzZmEtOGZkOS00YjA0MDMxZGY5NDEifQ.b-suH97hZ__r02Gj1wagsuouHAJ4oDBNePTVd1VirNg",
  "access_expires_at": "2026-10-27T16:24:40.030375052Z",
  "refresh_token": "3PsLNqgf87ZMwG-x80cfWMAqbDYr0t30dnRyCDuXys8",
  "refresh_expires_at": "2026-11-26T16:09:40.029738515Z",
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
  "command_id": "6502aac4-cdec-4898-9be1-84a0e595b0c9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:40Z",
    "sequence": 1793117380692
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd7e022e-6fa7-4e68-8e9f-b117593013bb",
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
  "last_heartbeat_at": "2026-10-27T16:09:40.082628Z",
  "last_location_at": "2026-10-27T16:09:40.082628Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678388863",
  "device_ref": "sandbox-2114"
}
```

```json
{
  "challenge_id": "6dc908d8-37eb-4459-8cb4-cd3c035bbf08",
  "expires_at": "2026-10-27T16:14:40.104214568Z",
  "resend_available_at": "2026-10-27T16:09:41.104214568Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678388863` → **200**

```json
{
  "phone": "+380678388863",
  "audience": "CLIENT",
  "code": "247462",
  "sent_at": "2026-10-27T16:09:40.105901301Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6dc908d8-37eb-4459-8cb4-cd3c035bbf08",
  "code": "247462",
  "device_ref": "sandbox-2114"
}
```

```json
{
  "session_id": "eff1cfe2-e45c-4730-bc1d-19ce07656c86",
  "subject": {
    "type": "CLIENT",
    "id": "39eaf1f9-7e85-4683-b348-6da19cf3c8e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOWVhZjFmOS03ZTg1LTQ2ODMtYjM0OC02ZGExOWNmM2M4ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjgwLCJpYXQiOjE3OTMxMTczODAsImp0aSI6IjRmZTUxZDg5LTA0ZmUtNDZlNy1hZjI2LTE4MjRjN2JjZDM1YSIsInNpZCI6ImVmZjFjZmUyLWU0NWMtNDczMC1iYzFkLTE5Y2UwNzY1NmM4NiJ9.54epHLwMSBbTo3f9MoIf0-tu0eLZQ9nkGhdOGfJwE58",
  "access_expires_at": "2026-10-27T16:24:40.147885558Z",
  "refresh_token": "Sq8yxJqVDXG9GSrD5lKU84K225Tn8r36MEaDcHwUVHI",
  "refresh_expires_at": "2026-11-26T16:09:40.147296021Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "12d24a1c-5902-4cf9-8b47-237ba6a26121",
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
  "id": "ecac0bb3-2d0a-417d-8d5f-b0bef2f4e4c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:14:40.176077Z",
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
  "command_id": "465b8b2e-5281-4540-a9e4-0e177f46ae3a",
  "quote_id": "ecac0bb3-2d0a-417d-8d5f-b0bef2f4e4c3",
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
  "id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "39eaf1f9-7e85-4683-b348-6da19cf3c8e2",
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
  "created_at": "2026-10-27T16:09:40.202639Z",
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
    "id": "b8261f8d-d4f5-48d4-a634-8ecf166e8560",
    "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
    "expires_at": "2026-10-27T16:09:55.205233Z",
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

`POST /api/driver/v1/offers/b8261f8d-d4f5-48d4-a634-8ecf166e8560/accept` → **200**

```json
{
  "command_id": "90acfb08-5078-4e86-b017-78e5d0578fa0"
}
```

```json
{
  "id": "8387be2b-a8fc-46ef-a540-541c72d86a34",
  "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "24a418ea-1234-4505-b088-e8a95f55c2ee",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24a418ea-1234-4505-b088-e8a95f55c2ee",
  "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "assignment_id": "8387be2b-a8fc-46ef-a540-541c72d86a34",
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

`POST /api/driver/v1/work-sessions/fd7e022e-6fa7-4e68-8e9f-b117593013bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:40Z",
    "sequence": 1793117380693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd7e022e-6fa7-4e68-8e9f-b117593013bb",
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
  "last_heartbeat_at": "2026-10-27T16:09:40.293953Z",
  "last_location_at": "2026-10-27T16:09:40.293953Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24a418ea-1234-4505-b088-e8a95f55c2ee",
  "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "assignment_id": "8387be2b-a8fc-46ef-a540-541c72d86a34",
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

`POST /api/driver/v1/trips/24a418ea-1234-4505-b088-e8a95f55c2ee/arrive` → **200**

```json
{
  "command_id": "032621c9-faff-4e85-99e5-945e0045311b",
  "expected_version": 0
}
```

```json
{
  "id": "24a418ea-1234-4505-b088-e8a95f55c2ee",
  "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "assignment_id": "8387be2b-a8fc-46ef-a540-541c72d86a34",
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
  "arrived_at": "2026-10-27T16:09:40.333269Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/24a418ea-1234-4505-b088-e8a95f55c2ee/start` → **200**

```json
{
  "command_id": "9278ed36-ac76-443b-a6ca-085d883b13b0",
  "expected_version": 1
}
```

```json
{
  "id": "24a418ea-1234-4505-b088-e8a95f55c2ee",
  "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "assignment_id": "8387be2b-a8fc-46ef-a540-541c72d86a34",
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
  "arrived_at": "2026-10-27T16:09:40.333269Z",
  "started_at": "2026-10-27T16:09:40.357951Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/fd7e022e-6fa7-4e68-8e9f-b117593013bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:40Z",
    "sequence": 1793117380694
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd7e022e-6fa7-4e68-8e9f-b117593013bb",
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
  "last_heartbeat_at": "2026-10-27T16:09:40.389065Z",
  "last_location_at": "2026-10-27T16:09:40.389065Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/24a418ea-1234-4505-b088-e8a95f55c2ee/complete` → **200**

```json
{
  "command_id": "aa9092ab-cef1-464d-8f65-550ce403c759",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:09:40Z",
  "cash_received": true
}
```

```json
{
  "id": "24a418ea-1234-4505-b088-e8a95f55c2ee",
  "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "assignment_id": "8387be2b-a8fc-46ef-a540-541c72d86a34",
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
  "arrived_at": "2026-10-27T16:09:40.333269Z",
  "started_at": "2026-10-27T16:09:40.357951Z",
  "completed_at": "2026-10-27T16:09:40.413304Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3b0882b3-2973-433e-baf5-660e2981f8b8/rating` → **200**

```json
{
  "command_id": "79e674be-5e0d-4451-879d-3d4995455aee",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "score": 5,
  "created_at": "2026-10-27T16:09:40.453322215Z"
}
```

`POST /api/driver/v1/orders/3b0882b3-2973-433e-baf5-660e2981f8b8/rating` → **200**

```json
{
  "command_id": "cea1db23-7074-4f58-a49d-1476ebd8f46a",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
  "score": 4,
  "created_at": "2026-10-27T16:09:40.480209004Z"
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
  "session_id": "34aa1753-bb05-465e-882d-7b43e6873b91",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyODAsImlhdCI6MTc5MzExNzM4MCwianRpIjoiMWRiMzIyYzItNjUyNi00YWEzLWI1MTQtNjM3NjQ0OGY5NjZjIiwic2lkIjoiMzRhYTE3NTMtYmIwNS00NjVlLTg4MmQtN2I0M2U2ODczYjkxIn0.CvhA6sBLydiVryXXbbKX75NM__o8C5xVxaL0OOE1pzQ",
  "access_expires_at": "2026-10-27T16:24:40.808125957Z",
  "refresh_token": "fbijHHieedS-ys-ucmayHTDCNFEJHC0cu1ZpgCgGfzs",
  "refresh_expires_at": "2026-10-28T04:09:40.807644131Z",
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
  "session_id": "b9233fc4-d261-4aff-b719-c959ce222209",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyODEsImlhdCI6MTc5MzExNzM4MSwianRpIjoiZWZkMTdjYmUtMzU3OS00MzAyLWExYTAtMzA0NjI2NzhjMzE2Iiwic2lkIjoiYjkyMzNmYzQtZDI2MS00YWZmLWI3MTktYzk1OWNlMjIyMjA5In0.SiKJ0IOcS_mU57U4M1cCtDyqfiL6aGIFhY_tSLN4Bd0",
  "access_expires_at": "2026-10-27T16:24:41.106145896Z",
  "refresh_token": "0Ah2vgY2qJSjOe5r0Wwa09sRM-etJPA-afik7c4OCtE",
  "refresh_expires_at": "2026-10-28T04:09:41.105701395Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3b0882b3-2973-433e-baf5-660e2981f8b8/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
      "author_type": "RIDER",
      "author_id": "39eaf1f9-7e85-4683-b348-6da19cf3c8e2",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T16:09:40.453322Z"
    },
    {
      "order_id": "3b0882b3-2973-433e-baf5-660e2981f8b8",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "39eaf1f9-7e85-4683-b348-6da19cf3c8e2",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T16:09:40.480209Z"
    }
  ]
}
```

Done: ratings for order 3b0882b3-2973-433e-baf5-660e2981f8b8.

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
  "session_id": "606c99fb-de5b-4e65-8f8c-fa9cee2f9a18",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyODEsImlhdCI6MTc5MzExNzM4MSwianRpIjoiNDc0YTkxODAtN2I1OC00Njg0LTgyNGEtMWYyMmZiMGFlNzRkIiwic2lkIjoiNjA2Yzk5ZmItZGU1Yi00ZTY1LThmOGMtZmE5Y2VlMmY5YTE4In0.aKaPt4lAKO4HMLXwtiPGOt041kea0eE_EW4wUwoI7CY",
  "access_expires_at": "2026-10-27T16:24:41.442689664Z",
  "refresh_token": "ZwexSujg3SJcixHinLj4fnfKLGIF1t6koFtHEN-Unwg",
  "refresh_expires_at": "2026-10-28T04:09:41.442235011Z",
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
  "command_id": "2e35e459-a32f-4490-8a3d-720130561523",
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
  "changed_by": "d1a28922-3c22-484f-a013-6679adc0ed55",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T16:09:41.504791Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "2e35e459-a32f-4490-8a3d-720130561523",
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
  "changed_by": "d1a28922-3c22-484f-a013-6679adc0ed55",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T16:09:41.504791Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48417212258",
  "device_ref": "sandbox-10013"
}
```

```json
{
  "challenge_id": "1b099313-869c-4c9f-9f3f-82945cb370ed",
  "expires_at": "2026-10-27T16:14:41.574706951Z",
  "resend_available_at": "2026-10-27T16:09:42.574706951Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48417212258` → **200**

```json
{
  "phone": "+48417212258",
  "audience": "CLIENT",
  "code": "379443",
  "sent_at": "2026-10-27T16:09:41.576403731Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b099313-869c-4c9f-9f3f-82945cb370ed",
  "code": "379443",
  "device_ref": "sandbox-10013"
}
```

```json
{
  "session_id": "223a7fdd-e923-4d00-bfaf-40319e9202d0",
  "subject": {
    "type": "CLIENT",
    "id": "43f05856-fc71-4607-82fe-2e387bb40482"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0M2YwNTg1Ni1mYzcxLTQ2MDctODJmZS0yZTM4N2JiNDA0ODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjgxLCJpYXQiOjE3OTMxMTczODEsImp0aSI6ImJmMGM3YjMxLTdiZGMtNDE5OC1hNzA2LWU1MTI1MDgxYjRhNSIsInNpZCI6IjIyM2E3ZmRkLWU5MjMtNGQwMC1iZmFmLTQwMzE5ZTkyMDJkMCJ9.UDgvs_sWbkITo32ewfHqiq4FhUBPTwv_lWjew4TPzXQ",
  "access_expires_at": "2026-10-27T16:24:41.619633311Z",
  "refresh_token": "PcNLSinXopgCEpMIe9RZ11930ctWN486jn8GOjZ5UkU",
  "refresh_expires_at": "2026-11-26T16:09:41.619174798Z",
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
  "correlation_id": "4ccd5033-536e-43f3-a1f1-4d0b30bac0c4"
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
  "device_ref": "sandbox-30041"
}
```

```json
{
  "challenge_id": "ffd9c69d-9b68-4efb-981b-bd466decff81",
  "expires_at": "2026-10-27T16:14:41.680098632Z",
  "resend_available_at": "2026-10-27T16:09:42.680098632Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "890507",
  "sent_at": "2026-10-27T16:09:41.681550383Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffd9c69d-9b68-4efb-981b-bd466decff81",
  "code": "890507",
  "device_ref": "sandbox-30041"
}
```

```json
{
  "session_id": "52b97cb2-ac4e-445c-87a3-9fc7d52b1385",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI4MSwiaWF0IjoxNzkzMTE3MzgxLCJqdGkiOiI4YTNmNGVjMC1jZWVlLTQ0YmMtYmZhMi1kYTJiYmRmYzFlZGUiLCJzaWQiOiI1MmI5N2NiMi1hYzRlLTQ0NWMtODdhMy05ZmM3ZDUyYjEzODUifQ.CVPacQJ9VMBbLf6C0esiZb2OffFtmHZW8VeHj5DTRCo",
  "access_expires_at": "2026-10-27T16:24:41.734321172Z",
  "refresh_token": "4itlHx1_V4UFgtUOnAimFOp-im9j7WNhuccWTqH9_cA",
  "refresh_expires_at": "2026-11-26T16:09:41.733822928Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "36f58ebc-c94e-46ef-9ad4-814ac65b36af",
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
  "last_heartbeat_at": "2026-10-27T16:09:39.4954Z",
  "last_location_at": "2026-10-27T16:09:39.4954Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/36f58ebc-c94e-46ef-9ad4-814ac65b36af/handover` → **200**

```json
{
  "command_id": "a6f5fd6e-4ad2-49ed-a83c-f1d5b3f47b91",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "36f58ebc-c94e-46ef-9ad4-814ac65b36af",
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
  "last_heartbeat_at": "2026-10-27T16:09:39.4954Z",
  "last_location_at": "2026-10-27T16:09:39.4954Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/36f58ebc-c94e-46ef-9ad4-814ac65b36af/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:41Z",
    "sequence": 1793117381797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "36f58ebc-c94e-46ef-9ad4-814ac65b36af",
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
  "last_heartbeat_at": "2026-10-27T16:09:41.811745Z",
  "last_location_at": "2026-10-27T16:09:41.811745Z",
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
  "session_id": "36f58ebc-c94e-46ef-9ad4-814ac65b36af",
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
  "last_heartbeat_at": "2026-10-27T16:09:41.811745Z",
  "last_location_at": "2026-10-27T16:09:41.811745Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/36f58ebc-c94e-46ef-9ad4-814ac65b36af/close` → **200**

```json
{
  "command_id": "95e373a7-9209-4011-9367-a61057c36eb9",
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
  "correlation_id": "cfdc4a36-76e5-4109-a4d5-07d1c5cc1ab9"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677711779",
  "device_ref": "sandbox-31310"
}
```

```json
{
  "challenge_id": "fb51e476-ce58-4da9-bf62-f37f64621204",
  "expires_at": "2026-10-27T16:14:41.930140973Z",
  "resend_available_at": "2026-10-27T16:09:42.930140973Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677711779` → **200**

```json
{
  "phone": "+380677711779",
  "audience": "CLIENT",
  "code": "691463",
  "sent_at": "2026-10-27T16:09:41.931771687Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb51e476-ce58-4da9-bf62-f37f64621204",
  "code": "691463",
  "device_ref": "sandbox-31310"
}
```

```json
{
  "session_id": "7bcf34d1-5918-4612-b249-489a41319aa9",
  "subject": {
    "type": "CLIENT",
    "id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlM2UyZjhhNi0zMmFiLTQ3MzgtYmIwZS1hZTZiYjE1ZGIyZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE4MjgxLCJpYXQiOjE3OTMxMTczODEsImp0aSI6ImI5ZDQzNjkzLWY0M2MtNGY2NC04OTE0LWY1NDg3Njc5YTc5NCIsInNpZCI6IjdiY2YzNGQxLTU5MTgtNDYxMi1iMjQ5LTQ4OWE0MTMxOWFhOSJ9.sd_n8fMzrU78cnfqS111J93pVNVxhx5U1r-zs1R7rNw",
  "access_expires_at": "2026-10-27T16:24:41.971497035Z",
  "refresh_token": "clqtJKYCRH8QHx9Ekq7IBrXFBELuTJKb7JR_ICwzbZw",
  "refresh_expires_at": "2026-11-26T16:09:41.970946604Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "da720653-08e3-448c-8651-b4a49d97c469",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ec74a5f5-05c7-448c-b2e7-b4f329d3aef0",
  "upload_path": "/api/rider/v1/uploads/ec74a5f5-05c7-448c-b2e7-b4f329d3aef0",
  "expires_at": "2026-10-27T16:24:41.999970638Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/ec74a5f5-05c7-448c-b2e7-b4f329d3aef0` → **200**

```json
{
  "file_id": "ec74a5f5-05c7-448c-b2e7-b4f329d3aef0",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "3d85a7a2-6908-4c4f-a598-8317ab7d4894",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "ec74a5f5-05c7-448c-b2e7-b4f329d3aef0"
  ]
}
```

```json
{
  "id": "26102528-bd73-4c4e-9886-313973029d05",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T16:09:42.05447Z",
  "updated_at": "2026-10-27T16:09:42.05447Z",
  "messages": [
    {
      "id": "501698f8-8c44-4e6f-8d84-847fd6198962",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:09:42.055959Z",
      "attachments": [
        {
          "file_id": "ec74a5f5-05c7-448c-b2e7-b4f329d3aef0",
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
  "session_id": "57b0a9dc-ed90-4da1-961e-8ce02b89792d",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyODIsImlhdCI6MTc5MzExNzM4MiwianRpIjoiMTFiMjQyOGMtMTNlMi00YzhiLTk0ZTgtZGI2ZWYyNDRmZTc5Iiwic2lkIjoiNTdiMGE5ZGMtZWQ5MC00ZGExLTk2MWUtOGNlMDJiODk3OTJkIn0.fThrQB0pE8s9YbJi4Y0TAFoQiahJwexKCTNi3bO9i_Y",
  "access_expires_at": "2026-10-27T16:24:42.361200037Z",
  "refresh_token": "wZl3nzLOE21MoJOXJno9BdqdPcacyL7R87kvjSLdNcc",
  "refresh_expires_at": "2026-10-28T04:09:42.360712576Z",
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
  "session_id": "6d3582ae-2fa6-4813-a688-28adf1b5c994",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyODIsImlhdCI6MTc5MzExNzM4MiwianRpIjoiY2Y4MzZlNGQtYWJhMC00ZWEwLTg5MmEtMGE0YThjMDJkYzhjIiwic2lkIjoiNmQzNTgyYWUtMmZhNi00ODEzLWE2ODgtMjhhZGYxYjVjOTk0In0.ny9A4zxHKMbg71gWkOH1TtKrikQiZeDROior7rLUnZI",
  "access_expires_at": "2026-10-27T16:24:42.653118626Z",
  "refresh_token": "fJnUCanJU6jKRDuQd9iHn-hVp-FGw3juerPqjrOTV0o",
  "refresh_expires_at": "2026-10-28T04:09:42.652538561Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/26102528-bd73-4c4e-9886-313973029d05/attachments/ec74a5f5-05c7-448c-b2e7-b4f329d3aef0` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "266b42f4-db68-488c-a528-f184f104817c",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a5176001-11d5-42c3-b2a8-ad9ba6b43232",
  "upload_path": "/api/operator/v1/uploads/a5176001-11d5-42c3-b2a8-ad9ba6b43232",
  "expires_at": "2026-10-27T16:24:42.695028895Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/a5176001-11d5-42c3-b2a8-ad9ba6b43232` → **200**

```json
{
  "file_id": "a5176001-11d5-42c3-b2a8-ad9ba6b43232",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/26102528-bd73-4c4e-9886-313973029d05` → **200**

```json
{
  "id": "26102528-bd73-4c4e-9886-313973029d05",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T16:09:42.05447Z",
  "updated_at": "2026-10-27T16:09:42.05447Z",
  "messages": [
    {
      "id": "501698f8-8c44-4e6f-8d84-847fd6198962",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:09:42.055959Z",
      "attachments": [
        {
          "file_id": "ec74a5f5-05c7-448c-b2e7-b4f329d3aef0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/26102528-bd73-4c4e-9886-313973029d05/comments` → **200**

```json
{
  "command_id": "c01babed-6f10-4003-92f7-82d8279c40e0",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "a5176001-11d5-42c3-b2a8-ad9ba6b43232"
  ]
}
```

```json
{
  "id": "26102528-bd73-4c4e-9886-313973029d05",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T16:09:42.05447Z",
  "updated_at": "2026-10-27T16:09:42.773476Z",
  "messages": [
    {
      "id": "501698f8-8c44-4e6f-8d84-847fd6198962",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:09:42.055959Z",
      "attachments": [
        {
          "file_id": "ec74a5f5-05c7-448c-b2e7-b4f329d3aef0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "12bc630d-145a-4192-ae23-66214f82ba27",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "d1a28922-3c22-484f-a013-6679adc0ed55",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T16:09:42.773092Z",
      "attachments": [
        {
          "file_id": "a5176001-11d5-42c3-b2a8-ad9ba6b43232",
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

`GET /api/rider/v1/support/cases/26102528-bd73-4c4e-9886-313973029d05` → **200**

```json
{
  "id": "26102528-bd73-4c4e-9886-313973029d05",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T16:09:42.05447Z",
  "updated_at": "2026-10-27T16:09:42.773476Z",
  "messages": [
    {
      "id": "501698f8-8c44-4e6f-8d84-847fd6198962",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e3e2f8a6-32ab-4738-bb0e-ae6bb15db2e9",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:09:42.055959Z",
      "attachments": [
        {
          "file_id": "ec74a5f5-05c7-448c-b2e7-b4f329d3aef0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "12bc630d-145a-4192-ae23-66214f82ba27",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T16:09:42.773092Z",
      "attachments": [
        {
          "file_id": "a5176001-11d5-42c3-b2a8-ad9ba6b43232",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/26102528-bd73-4c4e-9886-313973029d05/attachments/a5176001-11d5-42c3-b2a8-ad9ba6b43232` → **200**

Done: support case 26102528-bd73-4c4e-9886-313973029d05, rider attachment ec74a5f5-05c7-448c-b2e7-b4f329d3aef0, operator attachment a5176001-11d5-42c3-b2a8-ad9ba6b43232.

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
  "session_id": "023dd557-11f4-4b20-bbae-bef6de2828db",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyODMsImlhdCI6MTc5MzExNzM4MywianRpIjoiNDYxYjg1ZTgtOWJlZC00NjU4LWE1OGItZTk3NTEzNGYyODE2Iiwic2lkIjoiMDIzZGQ1NTctMTFmNC00YjIwLWJiYWUtYmVmNmRlMjgyOGRiIn0.dqTo0zv45eRGZJucvbr5ioxWbvYaBdhQyzj9boMzb3I",
  "access_expires_at": "2026-10-27T16:24:43.120874868Z",
  "refresh_token": "lC_Tmn4-bpin34w3JltTLP33h53cEtLE5ke7vGZATpw",
  "refresh_expires_at": "2026-10-28T04:09:43.120464881Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10703"
}
```

```json
{
  "challenge_id": "c6ebce03-6d16-4d7a-8827-b20eef184068",
  "expires_at": "2026-10-27T16:14:43.143279188Z",
  "resend_available_at": "2026-10-27T16:09:44.143279188Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "427237",
  "sent_at": "2026-10-27T16:09:43.144967958Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6ebce03-6d16-4d7a-8827-b20eef184068",
  "code": "427237",
  "device_ref": "sandbox-10703"
}
```

```json
{
  "session_id": "8d5de6d3-537b-46d8-b7d3-c77b3a510af4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI4MywiaWF0IjoxNzkzMTE3MzgzLCJqdGkiOiI5NmU1NzhhMC0xODMyLTQwNTUtOWU2NC1iNzI2ZTVmMWRmNTIiLCJzaWQiOiI4ZDVkZTZkMy01MzdiLTQ2ZDgtYjdkMy1jNzdiM2E1MTBhZjQifQ.9Ex7ArHjcwHbdqyK6-K8tByccPCmLRW8ClRVG6yGtQM",
  "access_expires_at": "2026-10-27T16:24:43.192126022Z",
  "refresh_token": "wmAZUk9Kqbz2J7a2_S6ZnEDJdOHWW8PZV9Izlp0XTAc",
  "refresh_expires_at": "2026-11-26T16:09:43.191592028Z",
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
  "command_id": "0db21705-96fa-48bf-9f89-de5ce182be38",
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
  "device_ref": "sandbox-8340"
}
```

```json
{
  "challenge_id": "ed3768c1-7cdc-4336-95f3-93db39b49a14",
  "expires_at": "2026-10-27T16:14:43.292410506Z",
  "resend_available_at": "2026-10-27T16:09:44.292410506Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "389206",
  "sent_at": "2026-10-27T16:09:43.302714456Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed3768c1-7cdc-4336-95f3-93db39b49a14",
  "code": "389206",
  "device_ref": "sandbox-8340"
}
```

```json
{
  "session_id": "7007a789-92cf-4e46-9cd8-9a56c0eeed3e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExODI4MywiaWF0IjoxNzkzMTE3MzgzLCJqdGkiOiJiMDMwZjdjYS1iMDY3LTQyNmMtOGE1Mi0wNzdlZmIxZGRlNTMiLCJzaWQiOiI3MDA3YTc4OS05MmNmLTRlNDYtOWNkOC05YTU2YzBlZWVkM2UifQ.mbL6bMOPlMMljK7ofy9g5onDW6nKm9eJD11EENGbHfg",
  "access_expires_at": "2026-10-27T16:24:43.343536258Z",
  "refresh_token": "yIN0d4uIpeDDA-WmOBYUxYeMos5ZA2vXMWdtukOrpqY",
  "refresh_expires_at": "2026-11-26T16:09:43.342970318Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd7e022e-6fa7-4e68-8e9f-b117593013bb",
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
  "last_heartbeat_at": "2026-10-27T16:09:40.389065Z",
  "last_location_at": "2026-10-27T16:09:40.389065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd7e022e-6fa7-4e68-8e9f-b117593013bb/handover` → **200**

```json
{
  "command_id": "3ccf0438-d03c-4983-b5ab-351ba012b88c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd7e022e-6fa7-4e68-8e9f-b117593013bb",
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
  "last_heartbeat_at": "2026-10-27T16:09:40.389065Z",
  "last_location_at": "2026-10-27T16:09:40.389065Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd7e022e-6fa7-4e68-8e9f-b117593013bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:43Z",
    "sequence": 1793117383409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd7e022e-6fa7-4e68-8e9f-b117593013bb",
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
  "last_heartbeat_at": "2026-10-27T16:09:43.423338Z",
  "last_location_at": "2026-10-27T16:09:43.423338Z",
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
  "command_id": "76f5043b-9381-4e38-b471-af9c88a6bcb9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:43Z",
    "sequence": 1793117383457
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6e48c0b2-5c1c-4dbe-9ba5-8b273a411b43",
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
  "last_heartbeat_at": "2026-10-27T16:09:43.470242Z",
  "last_location_at": "2026-10-27T16:09:43.470242Z",
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
  "session_id": "7565b80a-c413-424d-acc3-4175d3ad004f",
  "subject": {
    "type": "STAFF",
    "id": "d1a28922-3c22-484f-a013-6679adc0ed55"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWEyODkyMi0zYzIyLTQ4NGYtYTAxMy02Njc5YWRjMGVkNTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTgyODMsImlhdCI6MTc5MzExNzM4MywianRpIjoiZDgwOGM5NzctYmRiMC00MTRjLWI1MDctN2EzMWNmMDNiOWY0Iiwic2lkIjoiNzU2NWI4MGEtYzQxMy00MjRkLWFjYzMtNDE3NWQzYWQwMDRmIn0._PFUaMOJGs4O804357SmlRSQdal6QZ_a46SFVWqSLpk",
  "access_expires_at": "2026-10-27T16:24:43.765464245Z",
  "refresh_token": "yi7_L4eSktdJXQwp-4qNZqJy3UOd8esZHwpg5RQg9oU",
  "refresh_expires_at": "2026-10-28T04:09:43.765057006Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "94b54e2b-f128-4bc5-a50d-4bf1d1b60517",
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
  "id": "105a4dc5-f82f-4bc2-97b7-cd8b0c276f0d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:14:43.791090Z",
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
  "command_id": "4f2e39e9-6704-4c5c-bbd5-bcb0d2fc92b1",
  "quote_id": "105a4dc5-f82f-4bc2-97b7-cd8b0c276f0d",
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
  "id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
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
  "created_at": "2026-10-27T16:09:43.820602Z",
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
    "id": "b1cbe086-a9ef-464f-9cec-6065a5627633",
    "order_id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
    "expires_at": "2026-10-27T16:09:58.823756Z",
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

`POST /api/driver/v1/offers/b1cbe086-a9ef-464f-9cec-6065a5627633/accept` → **200**

```json
{
  "command_id": "60e77c32-5d88-4817-82cc-57e433b71dee"
}
```

```json
{
  "id": "ef3a46d6-4797-454d-bcc0-edaf3d94e422",
  "order_id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9078ba27-ab91-4164-891f-5d85ab3d9d72",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9078ba27-ab91-4164-891f-5d85ab3d9d72",
  "order_id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
  "assignment_id": "ef3a46d6-4797-454d-bcc0-edaf3d94e422",
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

`POST /api/driver/v1/work-sessions/6e48c0b2-5c1c-4dbe-9ba5-8b273a411b43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:09:43Z",
    "sequence": 1793117383919
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6e48c0b2-5c1c-4dbe-9ba5-8b273a411b43",
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
  "last_heartbeat_at": "2026-10-27T16:09:43.932953Z",
  "last_location_at": "2026-10-27T16:09:43.932953Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9078ba27-ab91-4164-891f-5d85ab3d9d72/arrive` → **200**

```json
{
  "command_id": "e54f9e91-092b-4d25-a482-0352f3350b85",
  "expected_version": 0
}
```

```json
{
  "id": "9078ba27-ab91-4164-891f-5d85ab3d9d72",
  "order_id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
  "assignment_id": "ef3a46d6-4797-454d-bcc0-edaf3d94e422",
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
  "arrived_at": "2026-10-27T16:09:43.959593Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/9078ba27-ab91-4164-891f-5d85ab3d9d72/start` → **200**

```json
{
  "command_id": "5ecfaa6a-f5a0-4baa-a0af-792b91f2c9fc",
  "expected_version": 1
}
```

```json
{
  "id": "9078ba27-ab91-4164-891f-5d85ab3d9d72",
  "order_id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
  "assignment_id": "ef3a46d6-4797-454d-bcc0-edaf3d94e422",
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
  "arrived_at": "2026-10-27T16:09:43.959593Z",
  "started_at": "2026-10-27T16:09:43.987888Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/9078ba27-ab91-4164-891f-5d85ab3d9d72/complete` → **200**

```json
{
  "command_id": "0b43c159-2dac-433a-bbae-8431b270ca13",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:09:44Z",
  "cash_received": true
}
```

```json
{
  "id": "9078ba27-ab91-4164-891f-5d85ab3d9d72",
  "order_id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
  "assignment_id": "ef3a46d6-4797-454d-bcc0-edaf3d94e422",
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
  "arrived_at": "2026-10-27T16:09:43.959593Z",
  "started_at": "2026-10-27T16:09:43.987888Z",
  "completed_at": "2026-10-27T16:09:44.017658Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/ee998c9d-ef21-48b4-a2a0-dcd895787433` → **200**

```json
{
  "id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
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
    "id": "ef3a46d6-4797-454d-bcc0-edaf3d94e422",
    "order_id": "ee998c9d-ef21-48b4-a2a0-dcd895787433",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9078ba27-ab91-4164-891f-5d85ab3d9d72",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:09:43.820602Z",
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
  "session_id": "fd7e022e-6fa7-4e68-8e9f-b117593013bb",
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
  "last_heartbeat_at": "2026-10-27T16:09:43.423338Z",
  "last_location_at": "2026-10-27T16:09:43.423338Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd7e022e-6fa7-4e68-8e9f-b117593013bb/close` → **200**

```json
{
  "command_id": "60cecd19-b877-4d69-85b8-01f06c0fcc57",
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
  "session_id": "6e48c0b2-5c1c-4dbe-9ba5-8b273a411b43",
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
  "last_heartbeat_at": "2026-10-27T16:09:43.932953Z",
  "last_location_at": "2026-10-27T16:09:43.932953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e48c0b2-5c1c-4dbe-9ba5-8b273a411b43/close` → **200**

```json
{
  "command_id": "5c67016d-27cd-4840-a689-36b8a1aa81db",
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

Done: terminal order ee998c9d-ef21-48b4-a2a0-dcd895787433 by Andrii (5a000000-0000-4000-8000-000000000403).
