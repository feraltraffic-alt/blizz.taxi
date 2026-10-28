# Sandbox transcript (2026-10-28T19:12:53Z, c71acbd)

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
  "correlation_id": "88c31ad8-6e0d-4b6f-947c-ff17cb9a0029"
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
  "session_id": "afa36a1d-19f3-4453-9a6c-a5783fdebb9a",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU2ODEsImlhdCI6MTc5MzIxNDc4MSwianRpIjoiZGNjN2U2MmYtODdmNS00M2U0LThhMjctOWM4MTk1ZjEwOTI2Iiwic2lkIjoiYWZhMzZhMWQtMTlmMy00NDUzLTlhNmMtYTU3ODNmZGViYjlhIn0.1P5DPwNKrOcsgVbWznmjRnTsfzkm46XAaakcrc-rvHU",
  "access_expires_at": "2026-10-28T19:28:01.113377787Z",
  "refresh_token": "fOO0uteFMGGvxjzf-1yRNNoMOUsis6_F1VV9bVXVq90",
  "refresh_expires_at": "2026-10-29T07:13:01.110856696Z",
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
  "session_id": "d8b67b90-bd38-4ec7-90b2-5ec47b2fc674",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU2ODIsImlhdCI6MTc5MzIxNDc4MiwianRpIjoiODdiMzhmZDUtZGExNS00MzE5LWFiNTUtYjJlZmNhYzhlMjhiIiwic2lkIjoiZDhiNjdiOTAtYmQzOC00ZWM3LTkwYjItNWVjNDdiMmZjNjc0In0.pEVL1xoNmZ-KPZxue7vCPvcv8NpmDKja0KDyDkt7EM8",
  "access_expires_at": "2026-10-28T19:28:02.647357986Z",
  "refresh_token": "PSZ7jPhCdhWMFzPsqegV-bHvwdmQiLdRkhroggzRGDE",
  "refresh_expires_at": "2026-10-29T07:13:02.646291113Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "67cae105-6ae1-4639-91b8-a8ba83087f3e",
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
  "id": "4361221a-7adb-4d18-a84b-92bce3c3b04b",
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
  "created_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "created_at": "2026-10-28T19:13:02.977869Z",
  "updated_at": "2026-10-28T19:13:02.977869Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630015211",
  "device_ref": "sandbox-21075"
}
```

```json
{
  "challenge_id": "80f98d3c-5d6d-4cc6-bb77-e93221c5cbe7",
  "expires_at": "2026-10-28T19:18:03.278251844Z",
  "resend_available_at": "2026-10-28T19:13:04.278251844Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630015211` → **200**

```json
{
  "phone": "+380630015211",
  "audience": "CLIENT",
  "code": "979403",
  "sent_at": "2026-10-28T19:13:03.288058708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80f98d3c-5d6d-4cc6-bb77-e93221c5cbe7",
  "code": "979403",
  "device_ref": "sandbox-21075"
}
```

```json
{
  "session_id": "d8c8a11f-1325-4c35-bf8f-f12f8983e356",
  "subject": {
    "type": "CLIENT",
    "id": "0a17c3d4-0d94-44d7-8088-51d414fa13aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTE3YzNkNC0wZDk0LTQ0ZDctODA4OC01MWQ0MTRmYTEzYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NjgzLCJpYXQiOjE3OTMyMTQ3ODMsImp0aSI6IjBjOGQwNGUwLWVjMTEtNDE1Yy04NmU1LTkyMTU2NGVkNjc4MSIsInNpZCI6ImQ4YzhhMTFmLTEzMjUtNGMzNS1iZjhmLWYxMmY4OTgzZTM1NiJ9.nboWZkQXFElq9-PMZd_acYYYAJyDzZOwJsayWrnnfS8",
  "access_expires_at": "2026-10-28T19:28:03.622824072Z",
  "refresh_token": "Nr-bLBJmU_Ob3tughGBCEKWOIYt9Snc4oTCKI0Lr0aM",
  "refresh_expires_at": "2026-11-27T19:13:03.621775768Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630015211` → **200**

```json
{
  "client_id": "0a17c3d4-0d94-44d7-8088-51d414fa13aa"
}
```

`POST /api/admin/v1/rider-wallets/0a17c3d4-0d94-44d7-8088-51d414fa13aa/top-ups` → **201**

```json
{
  "command_id": "cc20f98f-21aa-4f36-8a90-6fe39e7057d3",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "0a17c3d4-0d94-44d7-8088-51d414fa13aa",
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
      "id": "8a9d4f86-4b16-49ff-ad3a-28f0608893c2",
      "at": "2026-10-28T19:13:04.196396Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f2fada58-e9a8-479b-930a-aedf5b224f14",
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
  "id": "79f4f73c-d8b1-4c53-88f3-c1c7ebd87f1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:18:04.624336Z",
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
      "id": "4361221a-7adb-4d18-a84b-92bce3c3b04b",
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
  "device_ref": "sandbox-1222"
}
```

```json
{
  "challenge_id": "e038b6b0-eb86-42bc-a7e3-498d5cfe9d7b",
  "expires_at": "2026-10-28T19:18:04.974988998Z",
  "resend_available_at": "2026-10-28T19:13:05.974988998Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "250675",
  "sent_at": "2026-10-28T19:13:04.978969881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e038b6b0-eb86-42bc-a7e3-498d5cfe9d7b",
  "code": "250675",
  "device_ref": "sandbox-1222"
}
```

```json
{
  "session_id": "32c7d479-d416-4d9e-bad4-eea59f264db9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTY4NSwiaWF0IjoxNzkzMjE0Nzg1LCJqdGkiOiJlYzcyYzYzZi1jMTgwLTRiOGMtOWYyYy0yMWMyMzM4MTg0ODUiLCJzaWQiOiIzMmM3ZDQ3OS1kNDE2LTRkOWUtYmFkNC1lZWE1OWYyNjRkYjkifQ.vre--X0fv46yQqj1A9WKUPj4R6uWLDvYAs1L8aSg1pk",
  "access_expires_at": "2026-10-28T19:28:05.293870543Z",
  "refresh_token": "x3uVXYNxwIEEaXCOMZ6a2NKysGw5LEjI05bX-21nXt0",
  "refresh_expires_at": "2026-11-27T19:13:05.292704537Z",
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
  "command_id": "92e7ee1b-41a2-41ae-ae7c-bafc841c2e9d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:05Z",
    "sequence": 1793214785870
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc2993da-ed04-4e3b-aff8-30c3ffdbcb01",
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
  "last_heartbeat_at": "2026-10-28T19:13:05.920307Z",
  "last_location_at": "2026-10-28T19:13:05.920307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1b70c717-f96b-4921-87e0-bd7c0eb28fc4",
  "quote_id": "79f4f73c-d8b1-4c53-88f3-c1c7ebd87f1e",
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
  "id": "08269044-5f3d-427d-80e3-4e931a8d4959",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0a17c3d4-0d94-44d7-8088-51d414fa13aa",
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
  "created_at": "2026-10-28T19:13:06.267609Z",
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
  "client_id": "0a17c3d4-0d94-44d7-8088-51d414fa13aa",
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
      "id": "8a9d4f86-4b16-49ff-ad3a-28f0608893c2",
      "at": "2026-10-28T19:13:04.196396Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
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
    "id": "8e1ca47b-57dc-4211-ac7d-a9bec8bcf0aa",
    "order_id": "08269044-5f3d-427d-80e3-4e931a8d4959",
    "expires_at": "2026-10-28T19:13:21.280401Z",
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

`POST /api/driver/v1/offers/8e1ca47b-57dc-4211-ac7d-a9bec8bcf0aa/accept` → **200**

```json
{
  "command_id": "751ed898-d102-4c3e-abee-f418fe33bb33"
}
```

```json
{
  "id": "89c9a33d-44d8-4116-8560-a68a4e4fc7f6",
  "order_id": "08269044-5f3d-427d-80e3-4e931a8d4959",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "85f96a7f-f01d-4c73-adbd-e3232bae434f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85f96a7f-f01d-4c73-adbd-e3232bae434f",
  "order_id": "08269044-5f3d-427d-80e3-4e931a8d4959",
  "assignment_id": "89c9a33d-44d8-4116-8560-a68a4e4fc7f6",
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

`POST /api/driver/v1/work-sessions/bc2993da-ed04-4e3b-aff8-30c3ffdbcb01/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:07Z",
    "sequence": 1793214787746
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc2993da-ed04-4e3b-aff8-30c3ffdbcb01",
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
  "last_heartbeat_at": "2026-10-28T19:13:07.7737Z",
  "last_location_at": "2026-10-28T19:13:07.7737Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/85f96a7f-f01d-4c73-adbd-e3232bae434f/arrive` → **200**

```json
{
  "command_id": "1a0a9e83-04cb-4496-bd0c-7f8daa5f056b",
  "expected_version": 0
}
```

```json
{
  "id": "85f96a7f-f01d-4c73-adbd-e3232bae434f",
  "order_id": "08269044-5f3d-427d-80e3-4e931a8d4959",
  "assignment_id": "89c9a33d-44d8-4116-8560-a68a4e4fc7f6",
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
  "arrived_at": "2026-10-28T19:13:08.087276Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/85f96a7f-f01d-4c73-adbd-e3232bae434f/start` → **200**

```json
{
  "command_id": "79624ac8-4f17-477f-9c90-6192d7d0c200",
  "expected_version": 1
}
```

```json
{
  "id": "85f96a7f-f01d-4c73-adbd-e3232bae434f",
  "order_id": "08269044-5f3d-427d-80e3-4e931a8d4959",
  "assignment_id": "89c9a33d-44d8-4116-8560-a68a4e4fc7f6",
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
  "arrived_at": "2026-10-28T19:13:08.087276Z",
  "started_at": "2026-10-28T19:13:08.391729Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/85f96a7f-f01d-4c73-adbd-e3232bae434f/complete` → **200**

```json
{
  "command_id": "a58d90d9-c75c-42d9-bcca-9531128ad020",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:13:08Z",
  "cash_received": true
}
```

```json
{
  "id": "85f96a7f-f01d-4c73-adbd-e3232bae434f",
  "order_id": "08269044-5f3d-427d-80e3-4e931a8d4959",
  "assignment_id": "89c9a33d-44d8-4116-8560-a68a4e4fc7f6",
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
  "arrived_at": "2026-10-28T19:13:08.087276Z",
  "started_at": "2026-10-28T19:13:08.391729Z",
  "completed_at": "2026-10-28T19:13:08.705341Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "0a17c3d4-0d94-44d7-8088-51d414fa13aa",
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
      "id": "7cbb9fee-f468-4acf-adad-aa1796e1e72d",
      "at": "2026-10-28T19:13:09.020948Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "08269044-5f3d-427d-80e3-4e931a8d4959"
    },
    {
      "id": "8a9d4f86-4b16-49ff-ad3a-28f0608893c2",
      "at": "2026-10-28T19:13:04.196396Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/4361221a-7adb-4d18-a84b-92bce3c3b04b/archive` → **200**

```json
{
  "command_id": "ab367d80-2405-428e-87ca-9f5efa05f782",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "4361221a-7adb-4d18-a84b-92bce3c3b04b",
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
  "created_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "created_at": "2026-10-28T19:13:02.977869Z",
  "updated_at": "2026-10-28T19:13:12.325427Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc2993da-ed04-4e3b-aff8-30c3ffdbcb01",
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
  "last_heartbeat_at": "2026-10-28T19:13:07.7737Z",
  "last_location_at": "2026-10-28T19:13:07.7737Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc2993da-ed04-4e3b-aff8-30c3ffdbcb01/close` → **200**

```json
{
  "command_id": "9a2873e1-e3a2-4634-b1c5-9a9e640abd71",
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

Done: order 08269044-5f3d-427d-80e3-4e931a8d4959.

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
  "session_id": "999b8fe8-9ea9-46be-ba7b-556f769b84ef",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU2OTMsImlhdCI6MTc5MzIxNDc5MywianRpIjoiYzVlNmVlMzUtMzNkNS00MTliLTkwOWMtZjVjZDg2YjcwNWJlIiwic2lkIjoiOTk5YjhmZTgtOWVhOS00NmJlLWJhN2ItNTU2Zjc2OWI4NGVmIn0.FJWG-D_LNjcp6AyEAEBkVLqaxEWkA_tWhKkBLT3qFg4",
  "access_expires_at": "2026-10-28T19:28:13.505668387Z",
  "refresh_token": "aVTy9EK61TwO-VG5ArvVjmRT0K3iT_ixyo3ejJAXnC0",
  "refresh_expires_at": "2026-10-29T07:13:13.504798751Z",
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
  "command_id": "4eaac48f-0bbb-4874-b132-a6cc2de68297",
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
  "session_id": "cd8780e1-81ca-4a6a-807f-9c337b9c3a27",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU2OTQsImlhdCI6MTc5MzIxNDc5NCwianRpIjoiNjVlZTM1NjktOTkwMi00YzJmLThhMjYtMDVmZDA4MjA2MTJhIiwic2lkIjoiY2Q4NzgwZTEtODFjYS00YTZhLTgwN2YtOWMzMzdiOWMzYTI3In0.BWzVgmSh1qHNTjQUTu3U-YaR69w-xYw6gZjMH9W4L5Y",
  "access_expires_at": "2026-10-28T19:28:14.652111833Z",
  "refresh_token": "DiwJb4jDoaRgL5OF2r4ZTwJSgT0WG5Z3u2TCVGAoqIs",
  "refresh_expires_at": "2026-10-29T07:13:14.651324015Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3268813697",
    "linkedid": "1730052700.3268813697",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676666966"
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
    "id": "1730052700.3268813697",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "247606a3-d03a-4f44-bc3c-6973fc683d58",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676666966",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:13:14.930243Z",
      "answered_at": null,
      "ended_at": "2026-10-28T19:13:14.958303Z",
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
    "id": "1730052600.2875215561",
    "linkedid": "1730052600.2875215561",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676666966"
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
      "id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676666966",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:13:15.293105Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66/answer` → **200**

```json
{
  "command_id": "a82b3f70-fc80-4c0f-8d96-aa754dff1d8d"
}
```

```json
{
  "id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676666966",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "order_ids": [],
  "started_at": "2026-10-28T19:13:15.293105Z",
  "answered_at": "2026-10-28T19:13:15.625221Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2875215561",
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
    "id": "1730052600.2875215561",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676666966",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [],
      "started_at": "2026-10-28T19:13:15.293105Z",
      "answered_at": "2026-10-28T19:13:15.625221Z",
      "ended_at": "2026-10-28T19:13:15.9608Z",
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
      "id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676666966",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [],
      "started_at": "2026-10-28T19:13:15.293105Z",
      "answered_at": "2026-10-28T19:13:15.625221Z",
      "ended_at": "2026-10-28T19:13:15.9608Z",
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
      "id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676666966",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [],
      "started_at": "2026-10-28T19:13:15.293105Z",
      "answered_at": "2026-10-28T19:13:15.625221Z",
      "ended_at": "2026-10-28T19:13:15.9608Z",
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
      "id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676666966",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [],
      "started_at": "2026-10-28T19:13:15.293105Z",
      "answered_at": "2026-10-28T19:13:15.625221Z",
      "ended_at": "2026-10-28T19:13:15.9608Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:13:22.792399Z"
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
      "id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676666966",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [],
      "started_at": "2026-10-28T19:13:15.293105Z",
      "answered_at": "2026-10-28T19:13:15.625221Z",
      "ended_at": "2026-10-28T19:13:15.9608Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:13:22.792399Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66` → **200**

```json
{
  "changes": [
    {
      "id": "bb1e392a-399b-451c-8de5-5e4ab147baff",
      "occurred_at": "2026-10-28T19:13:23.480224Z",
      "actor_type": "STAFF",
      "actor_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e1b52b97-ebb7-4718-9244-837ace4c40de\", \"order_ids\": []}",
      "correlation_id": "aa4fc9f0-4bd7-4cf5-bf15-f08d444a0710"
    },
    {
      "id": "dc1e0156-41d8-4a6a-a284-fda486ebe58b",
      "occurred_at": "2026-10-28T19:13:23.44316Z",
      "actor_type": "STAFF",
      "actor_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e1b52b97-ebb7-4718-9244-837ace4c40de\", \"order_ids\": []}",
      "correlation_id": "86289182-e531-4407-aad5-3cab93aab094"
    }
  ]
}
```

Done: call 86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11995"
}
```

```json
{
  "challenge_id": "fa28bedd-e0ba-49db-9d0f-fd23bdc8de5e",
  "expires_at": "2026-10-28T19:18:23.800445218Z",
  "resend_available_at": "2026-10-28T19:13:24.800445218Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "569323",
  "sent_at": "2026-10-28T19:13:23.804600269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa28bedd-e0ba-49db-9d0f-fd23bdc8de5e",
  "code": "569323",
  "device_ref": "sandbox-11995"
}
```

```json
{
  "session_id": "53bda1c7-2770-4b23-81bc-434617e4bb3c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTcwNCwiaWF0IjoxNzkzMjE0ODA0LCJqdGkiOiJlZTM4ZDlkOC02ODM3LTRkMTItYjQ1Ny0zMzI4NDdjNGU4MDUiLCJzaWQiOiI1M2JkYTFjNy0yNzcwLTRiMjMtODFiYy00MzQ2MTdlNGJiM2MifQ.a8kiEFb_0-F2J11xWf5eH_xrt1lkAUy1MbY4e1Wz6Us",
  "access_expires_at": "2026-10-28T19:28:24.111521233Z",
  "refresh_token": "lbDg2eexx7rva_yHhCIJV-HCuJG66zS4t3tzooPMVIM",
  "refresh_expires_at": "2026-11-27T19:13:24.110809862Z",
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
  "command_id": "e19994ce-9354-4925-8074-55c332a5b2c0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:24Z",
    "sequence": 1793214804649
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0e91b67-87ec-4c3f-9c81-cdfc8224b688",
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
  "last_heartbeat_at": "2026-10-28T19:13:24.670523Z",
  "last_location_at": "2026-10-28T19:13:24.670523Z",
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
  "session_id": "904ee00d-0047-45ac-960e-d3f51a83e820",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3MDUsImlhdCI6MTc5MzIxNDgwNSwianRpIjoiZGRkMmUwNjYtNTFiYS00ZGFjLTk1YWItMzBmZTFmNDViOGFjIiwic2lkIjoiOTA0ZWUwMGQtMDA0Ny00NWFjLTk2MGUtZDNmNTFhODNlODIwIn0.ah7vatr2A8OPC5eTwzn4a3khO40e67xsawzDOeXpiwA",
  "access_expires_at": "2026-10-28T19:28:25.261732115Z",
  "refresh_token": "S6h22fotWnnNlL7l_RI7T6g1IHHg20Luy1FSDmlDFkM",
  "refresh_expires_at": "2026-10-29T07:13:25.261063891Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4036f8fb-2fa3-4a4b-a35a-e689d8d56cd2",
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
  "id": "65906a08-820e-477b-9463-11a5039a15b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:18:25.550576Z",
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
  "command_id": "eaad4f8d-45c8-42ca-b6d1-e7ca993c79ca",
  "quote_id": "65906a08-820e-477b-9463-11a5039a15b4",
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
    "phone": "+380673989887"
  }
}
```

```json
{
  "id": "4337e1a0-6958-405c-b953-a152e5614a17",
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
  "created_at": "2026-10-28T19:13:25.868444Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673989887"
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
    "id": "0e660d7e-6eef-47ef-b88b-e96d9823b2e7",
    "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
    "expires_at": "2026-10-28T19:13:40.875288Z",
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

`POST /api/driver/v1/offers/0e660d7e-6eef-47ef-b88b-e96d9823b2e7/accept` → **200**

```json
{
  "command_id": "575417da-d060-4d49-86a1-ea98994c3d25"
}
```

```json
{
  "id": "492f06f5-9968-4fe3-8568-a4c0a36561d7",
  "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8dc2ae25-b858-4a9b-9e81-a256297e699e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[
  {
    "phone": "+380673989887",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:27.98440342Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[
  {
    "phone": "+380673989887",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:27.98440342Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[
  {
    "phone": "+380673989887",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:27.98440342Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8dc2ae25-b858-4a9b-9e81-a256297e699e",
  "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
  "assignment_id": "492f06f5-9968-4fe3-8568-a4c0a36561d7",
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
    "phone": "+380673989887"
  }
}
```

`POST /api/driver/v1/work-sessions/e0e91b67-87ec-4c3f-9c81-cdfc8224b688/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:29Z",
    "sequence": 1793214809172
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e0e91b67-87ec-4c3f-9c81-cdfc8224b688",
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
  "last_heartbeat_at": "2026-10-28T19:13:29.193367Z",
  "last_location_at": "2026-10-28T19:13:29.193367Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8dc2ae25-b858-4a9b-9e81-a256297e699e/arrive` → **200**

```json
{
  "command_id": "cf8d312d-92ec-4196-934f-cbd109622f9d",
  "expected_version": 0
}
```

```json
{
  "id": "8dc2ae25-b858-4a9b-9e81-a256297e699e",
  "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
  "assignment_id": "492f06f5-9968-4fe3-8568-a4c0a36561d7",
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
  "arrived_at": "2026-10-28T19:13:29.486341Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673989887"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[
  {
    "phone": "+380673989887",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:27.98440342Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[
  {
    "phone": "+380673989887",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:27.98440342Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[
  {
    "phone": "+380673989887",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:27.98440342Z"
  },
  {
    "phone": "+380673989887",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:30.995567722Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[
  {
    "phone": "+380673989887",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:27.98440342Z"
  },
  {
    "phone": "+380673989887",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:30.995567722Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673989887` → **200**

```json
[
  {
    "phone": "+380673989887",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:27.98440342Z"
  },
  {
    "phone": "+380673989887",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:13:30.995567722Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/8dc2ae25-b858-4a9b-9e81-a256297e699e/start` → **200**

```json
{
  "command_id": "29f317d7-34c7-480f-9ec1-eeec513199bb",
  "expected_version": 1
}
```

```json
{
  "id": "8dc2ae25-b858-4a9b-9e81-a256297e699e",
  "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
  "assignment_id": "492f06f5-9968-4fe3-8568-a4c0a36561d7",
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
  "arrived_at": "2026-10-28T19:13:29.486341Z",
  "started_at": "2026-10-28T19:13:31.909608Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673989887"
  }
}
```

`POST /api/driver/v1/trips/8dc2ae25-b858-4a9b-9e81-a256297e699e/complete` → **200**

```json
{
  "command_id": "cb42d72f-a5b6-4f55-b599-e05bcec01f01",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:13:32Z",
  "cash_received": true
}
```

```json
{
  "id": "8dc2ae25-b858-4a9b-9e81-a256297e699e",
  "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
  "assignment_id": "492f06f5-9968-4fe3-8568-a4c0a36561d7",
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
  "arrived_at": "2026-10-28T19:13:29.486341Z",
  "started_at": "2026-10-28T19:13:31.909608Z",
  "completed_at": "2026-10-28T19:13:32.216566Z",
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
  "session_id": "e0e91b67-87ec-4c3f-9c81-cdfc8224b688",
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
  "last_heartbeat_at": "2026-10-28T19:13:29.193367Z",
  "last_location_at": "2026-10-28T19:13:29.193367Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0e91b67-87ec-4c3f-9c81-cdfc8224b688/close` → **200**

```json
{
  "command_id": "59db59b7-66cd-4dd3-b480-a9908379c6af",
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
  "phone": "+380638600749",
  "device_ref": "sandbox-1814"
}
```

```json
{
  "challenge_id": "861a35b7-b9f2-4958-acff-da0b4a6bb2cc",
  "expires_at": "2026-10-28T19:18:33.09005705Z",
  "resend_available_at": "2026-10-28T19:13:34.09005705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638600749` → **200**

```json
{
  "phone": "+380638600749",
  "audience": "CLIENT",
  "code": "691132",
  "sent_at": "2026-10-28T19:13:33.094133898Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "861a35b7-b9f2-4958-acff-da0b4a6bb2cc",
  "code": "691132",
  "device_ref": "sandbox-1814"
}
```

```json
{
  "session_id": "5576d3e0-e815-4e23-80b6-b178f73094dd",
  "subject": {
    "type": "CLIENT",
    "id": "5862060c-a8fb-4fd8-af13-df245bd3f81e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ODYyMDYwYy1hOGZiLTRmZDgtYWYxMy1kZjI0NWJkM2Y4MWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzEzLCJpYXQiOjE3OTMyMTQ4MTMsImp0aSI6IjUwMGRhZDY2LWViOGQtNDAxZi05YWEwLWNlYmY0NmFmM2ZlZiIsInNpZCI6IjU1NzZkM2UwLWU4MTUtNGUyMy04MGI2LWIxNzhmNzMwOTRkZCJ9.h6b31zsAAu7pCDHfu2WDtij7ONV6U4wyazC4ZO234UI",
  "access_expires_at": "2026-10-28T19:28:33.455172289Z",
  "refresh_token": "e3ywOXdyNA4BXrS7bPWdonkAYdP87ucD12R-tiLANnI",
  "refresh_expires_at": "2026-11-27T19:13:33.454329999Z",
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
  "device_ref": "sandbox-17282"
}
```

```json
{
  "challenge_id": "b5185343-d73a-4838-9667-412ef367fb5a",
  "expires_at": "2026-10-28T19:18:34.059816691Z",
  "resend_available_at": "2026-10-28T19:13:35.059816691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "423843",
  "sent_at": "2026-10-28T19:13:34.063842107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5185343-d73a-4838-9667-412ef367fb5a",
  "code": "423843",
  "device_ref": "sandbox-17282"
}
```

```json
{
  "session_id": "2dd752ed-c175-48e2-962d-762981f5e9a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTcxNCwiaWF0IjoxNzkzMjE0ODE0LCJqdGkiOiJiYjRlOTU5NS04MDVlLTQ3MTYtYjFiYi0xMTU0ODIxMjFiZjkiLCJzaWQiOiIyZGQ3NTJlZC1jMTc1LTQ4ZTItOTYyZC03NjI5ODFmNWU5YTcifQ.uORd-8ZR5IjPdG73y4qf0s-ntEdS9IsUs0GmoRzdJk0",
  "access_expires_at": "2026-10-28T19:28:34.391800297Z",
  "refresh_token": "Sp7f8thdY2l7Wgf4cZdnVFXo99TffO67H__31W4FiUQ",
  "refresh_expires_at": "2026-11-27T19:13:34.39109339Z",
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
  "session_id": "3621548c-f27f-4205-81aa-1248ce0f8a15",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3MTUsImlhdCI6MTc5MzIxNDgxNSwianRpIjoiOWUxYzY1OTMtNjI0NS00MTFiLWE3N2EtZDJlNzg4YzM3MTc3Iiwic2lkIjoiMzYyMTU0OGMtZjI3Zi00MjA1LTgxYWEtMTI0OGNlMGY4YTE1In0.PRF3trLCHbvoQ1DdyRUTjxpgS-Esdd_WWbnWLlN9vp8",
  "access_expires_at": "2026-10-28T19:28:35.227942214Z",
  "refresh_token": "wgyq_4tWj5qMTWpHPCE0mpC2HQCYPTuUvt1f3yL4fXc",
  "refresh_expires_at": "2026-10-29T07:13:35.227172497Z",
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
  "session_id": "35f46629-102e-41b1-a7f9-ae997d93c19d",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3MTUsImlhdCI6MTc5MzIxNDgxNSwianRpIjoiYWI5OThmY2ItZDY1MS00NjAzLTgxM2UtOWNhOWU4MzZkODI3Iiwic2lkIjoiMzVmNDY2MjktMTAyZS00MWIxLWE3ZjktYWU5OTdkOTNjMTlkIn0.nn_69gR43bxtiZRAMDuq-RmY0lLPU55ctm-GZXrfYv4",
  "access_expires_at": "2026-10-28T19:28:35.789854074Z",
  "refresh_token": "nWljFDS3Tb9DBdAXOCOS7abUKAAHcw8SCOfP9VgoiZg",
  "refresh_expires_at": "2026-10-29T07:13:35.789204906Z",
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
  "command_id": "b7eda312-349c-4bd5-bf52-77f8daf39d7c",
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
  "id": "cd13f547-e4a5-4f3b-9926-6c21560776a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:18:36.369168Z",
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
  "command_id": "ae7026a1-6798-41c4-9e93-55913a49ab02",
  "quote_id": "cd13f547-e4a5-4f3b-9926-6c21560776a8",
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
  "id": "9941dc36-f9ec-4f7c-bcd9-e31140c320d5",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5862060c-a8fb-4fd8-af13-df245bd3f81e",
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
  "created_at": "2026-10-28T19:13:36.659074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9941dc36-f9ec-4f7c-bcd9-e31140c320d5` → **200**

```json
{
  "id": "9941dc36-f9ec-4f7c-bcd9-e31140c320d5",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5862060c-a8fb-4fd8-af13-df245bd3f81e",
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
  "created_at": "2026-10-28T19:13:36.659074Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9941dc36-f9ec-4f7c-bcd9-e31140c320d5/cancel` → **200**

```json
{
  "command_id": "9e966939-fa2d-4728-9f12-6496e32da3da",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "9941dc36-f9ec-4f7c-bcd9-e31140c320d5",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5862060c-a8fb-4fd8-af13-df245bd3f81e",
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
  "created_at": "2026-10-28T19:13:36.659074Z",
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
  "command_id": "28664eeb-8e82-4c1e-a1db-52846565c70c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:37Z",
    "sequence": 1793214817864
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b310b933-23a4-446d-b165-3581e54bf567",
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
  "last_heartbeat_at": "2026-10-28T19:13:37.883449Z",
  "last_location_at": "2026-10-28T19:13:37.883449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26411"
}
```

```json
{
  "challenge_id": "7a7aaf43-c264-41be-aa9a-5c8ca09951c5",
  "expires_at": "2026-10-28T19:18:38.160496899Z",
  "resend_available_at": "2026-10-28T19:13:39.160496899Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "782035",
  "sent_at": "2026-10-28T19:13:38.164033062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a7aaf43-c264-41be-aa9a-5c8ca09951c5",
  "code": "782035",
  "device_ref": "sandbox-26411"
}
```

```json
{
  "session_id": "d257f3b1-8d89-4879-8b21-c93b76ab8d37",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTcxOCwiaWF0IjoxNzkzMjE0ODE4LCJqdGkiOiJjOTNhOTgxMS1iNDdmLTRmMjEtYjRiNC0xYzFhM2ViN2ZmYjYiLCJzaWQiOiJkMjU3ZjNiMS04ZDg5LTQ4NzktOGIyMS1jOTNiNzZhYjhkMzcifQ.yUJWCEX0r2f-PxO9HFkazJ-t1W_BVLKwn_6OMzKY6qc",
  "access_expires_at": "2026-10-28T19:28:38.473122443Z",
  "refresh_token": "3MQfMPOZCraY71tgz5GcQzhgQjpsluP0Bzy9nBWPous",
  "refresh_expires_at": "2026-11-27T19:13:38.472447126Z",
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
  "command_id": "0e549bf8-01c8-47ba-be39-cd23e069d240",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:39Z",
    "sequence": 1793214819263
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d9f0f244-91f5-4e79-82db-dd6fe058c3cd",
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
  "last_heartbeat_at": "2026-10-28T19:13:39.046359Z",
  "last_location_at": "2026-10-28T19:13:39.046359Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fc52e544-d88a-413e-9b02-1ae8a01de9fa",
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
  "id": "f3f130c6-3a13-4c48-9c6a-43230c03f9a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:18:39.349810Z",
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
  "command_id": "ab84ee84-a397-4285-ae98-c5278f4b5fe5",
  "quote_id": "f3f130c6-3a13-4c48-9c6a-43230c03f9a8",
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
  "id": "abbf45a3-8990-44dc-b84e-60518078bea8",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5862060c-a8fb-4fd8-af13-df245bd3f81e",
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
  "created_at": "2026-10-28T19:13:39.665368Z",
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
    "id": "c94cac3a-d571-461f-ac7d-e2c09dd6b8d1",
    "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
    "expires_at": "2026-10-28T19:13:54.669779Z",
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

`POST /api/driver/v1/offers/c94cac3a-d571-461f-ac7d-e2c09dd6b8d1/accept` → **200**

```json
{
  "command_id": "bc7e5eae-63ed-4bc2-88c6-d6d6c4b5447b"
}
```

```json
{
  "id": "ba195f88-6e9c-416c-9db2-5c4d2fd21e72",
  "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bb58c4be-39b4-47d5-bf08-e16f7a458e7f",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bb58c4be-39b4-47d5-bf08-e16f7a458e7f",
  "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
  "assignment_id": "ba195f88-6e9c-416c-9db2-5c4d2fd21e72",
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

`POST /api/driver/v1/trips/bb58c4be-39b4-47d5-bf08-e16f7a458e7f/cancel` → **200**

```json
{
  "command_id": "f3f44d93-1d8d-48a3-bd9d-ba37d27af458",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "bb58c4be-39b4-47d5-bf08-e16f7a458e7f",
  "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
  "assignment_id": "ba195f88-6e9c-416c-9db2-5c4d2fd21e72",
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

`GET /api/rider/v1/orders/abbf45a3-8990-44dc-b84e-60518078bea8` → **200**

```json
{
  "id": "abbf45a3-8990-44dc-b84e-60518078bea8",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5862060c-a8fb-4fd8-af13-df245bd3f81e",
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
    "id": "ba195f88-6e9c-416c-9db2-5c4d2fd21e72",
    "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "bb58c4be-39b4-47d5-bf08-e16f7a458e7f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:13:39.665368Z",
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
    "id": "ca481fe9-9f74-416c-977c-ef35302bb5d8",
    "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
    "expires_at": "2026-10-28T19:13:55.856104Z",
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

`POST /api/driver/v1/offers/ca481fe9-9f74-416c-977c-ef35302bb5d8/accept` → **200**

```json
{
  "command_id": "f56583cb-83c0-4af6-b81a-4956ae539d3d"
}
```

```json
{
  "id": "840c6b59-f6df-43db-93e7-aefa778d763b",
  "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "68101e8d-2e84-462d-a4d6-f2393cdc9ebe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "68101e8d-2e84-462d-a4d6-f2393cdc9ebe",
  "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
  "assignment_id": "840c6b59-f6df-43db-93e7-aefa778d763b",
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

`POST /api/driver/v1/trips/68101e8d-2e84-462d-a4d6-f2393cdc9ebe/cancel` → **200**

```json
{
  "command_id": "64ce6ba8-ac71-494b-8056-6581e3b355d9",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "68101e8d-2e84-462d-a4d6-f2393cdc9ebe",
  "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
  "assignment_id": "840c6b59-f6df-43db-93e7-aefa778d763b",
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
    "id": "abbf45a3-8990-44dc-b84e-60518078bea8",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:13:39.665368Z",
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
    "id": "9941dc36-f9ec-4f7c-bcd9-e31140c320d5",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:13:36.659074Z",
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

`GET /api/operator/v1/orders/abbf45a3-8990-44dc-b84e-60518078bea8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:13:39.666157Z",
      "actor": {
        "type": "CLIENT",
        "id": "5862060c-a8fb-4fd8-af13-df245bd3f81e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
        "quote_id": "f3f130c6-3a13-4c48-9c6a-43230c03f9a8",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "a326c911-da05-490d-8eb0-aa0aca8af12e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:13:39.668771Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
        "attempt_id": "2e2f1985-721d-46bc-a646-9e44c593e1d8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a326c911-da05-490d-8eb0-aa0aca8af12e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:13:39.676626Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c94cac3a-d571-461f-ac7d-e2c09dd6b8d1",
        "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "a326c911-da05-490d-8eb0-aa0aca8af12e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:13:40.269121Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c94cac3a-d571-461f-ac7d-e2c09dd6b8d1",
        "order_id": "abbf45a3-8990-44dc-b84e-60518078bea8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "ba195f88-6e9c-416c-9db2-5c4d2fd21e72"
      },
      "correlation_id": "fe6658ce-557d-4223-86c5-c6d3b9575a6f"
```

Done: orders 9941dc36-f9ec-4f7c-bcd9-e31140c320d5, abbf45a3-8990-44dc-b84e-60518078bea8.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739572769",
  "device_ref": "sandbox-10412"
}
```

```json
{
  "challenge_id": "24fb5d27-cad4-4542-963f-559c4ffc9810",
  "expires_at": "2026-10-28T19:18:43.262654466Z",
  "resend_available_at": "2026-10-28T19:13:44.262654466Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739572769` → **200**

```json
{
  "phone": "+380739572769",
  "audience": "CLIENT",
  "code": "886478",
  "sent_at": "2026-10-28T19:13:43.265875859Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24fb5d27-cad4-4542-963f-559c4ffc9810",
  "code": "886478",
  "device_ref": "sandbox-10412"
}
```

```json
{
  "session_id": "abe47739-5f37-4e90-8553-f8c0619dc36c",
  "subject": {
    "type": "CLIENT",
    "id": "db8d4900-c0a8-492b-bc8e-bde5237a394c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjhkNDkwMC1jMGE4LTQ5MmItYmM4ZS1iZGU1MjM3YTM5NGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzIzLCJpYXQiOjE3OTMyMTQ4MjMsImp0aSI6IjA4MTAzMDVkLWU4NjMtNDZjNC1iMWI3LWFiOTM3M2MzNGIyMSIsInNpZCI6ImFiZTQ3NzM5LTVmMzctNGU5MC04NTUzLWY4YzA2MTlkYzM2YyJ9.5S7N4fT0fnQbJnVUTyeuuedEC2SYqjzB2odvFlUcsSM",
  "access_expires_at": "2026-10-28T19:28:43.57133981Z",
  "refresh_token": "zzbpsjY1fDzXAOmwZJyMiwiN3qpkp5K3HMhtaCvCAjg",
  "refresh_expires_at": "2026-11-27T19:13:43.570701509Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "93a5326a-f8e5-443b-9073-c083267a5bd4",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0cd29de9-8f56-49fa-8f87-d680e0bdeb7f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0cd29de9-8f56-49fa-8f87-d680e0bdeb7f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ae52c1c8d959051a355c25eb0082d3d0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0cd29de9-8f56-49fa-8f87-d680e0bdeb7f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739572769"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0cd29de9-8f56-49fa-8f87-d680e0bdeb7f",
  "expires_at": "2026-10-28T19:43:43.866753Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/0cd29de9-8f56-49fa-8f87-d680e0bdeb7f` → **200**

```json
{
  "id": "0cd29de9-8f56-49fa-8f87-d680e0bdeb7f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T19:43:43.866753Z",
  "card": {
    "id": "5e9de096-f0cd-4210-a2aa-115bf06965d9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3188",
    "card_type": "Visa",
    "created_at": "2026-10-28T19:13:44.164015Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "5e9de096-f0cd-4210-a2aa-115bf06965d9",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3188",
      "card_type": "Visa",
      "created_at": "2026-10-28T19:13:44.164015Z"
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
  "device_ref": "sandbox-14124"
}
```

```json
{
  "challenge_id": "165d4d91-b039-469e-8885-8acb4675c8f9",
  "expires_at": "2026-10-28T19:18:44.752456207Z",
  "resend_available_at": "2026-10-28T19:13:45.752456207Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "895880",
  "sent_at": "2026-10-28T19:13:44.755451055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "165d4d91-b039-469e-8885-8acb4675c8f9",
  "code": "895880",
  "device_ref": "sandbox-14124"
}
```

```json
{
  "session_id": "6e6508f3-e2f1-4498-8fe2-b1abf95a4e74",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTcyNSwiaWF0IjoxNzkzMjE0ODI1LCJqdGkiOiIxOGVhMjEzZS03N2IwLTRkNWUtYjE3Yi1kN2M1ZWIyMDljMDgiLCJzaWQiOiI2ZTY1MDhmMy1lMmYxLTQ0OTgtOGZlMi1iMWFiZjk1YTRlNzQifQ.i2rACV3JttOUb5jTM3M2_b2BkMvJyMfhSVqFlJNUWiw",
  "access_expires_at": "2026-10-28T19:28:45.061999205Z",
  "refresh_token": "j98ROhh5TL1RtvTKmNiK1-OUndSv54CW_vpKKCNV7Nc",
  "refresh_expires_at": "2026-11-27T19:13:45.061336456Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d9f0f244-91f5-4e79-82db-dd6fe058c3cd",
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
  "last_heartbeat_at": "2026-10-28T19:13:39.046359Z",
  "last_location_at": "2026-10-28T19:13:39.046359Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d9f0f244-91f5-4e79-82db-dd6fe058c3cd/handover` → **200**

```json
{
  "command_id": "431478cb-dea9-4dee-a705-15ec8be2314d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d9f0f244-91f5-4e79-82db-dd6fe058c3cd",
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
  "last_heartbeat_at": "2026-10-28T19:13:39.046359Z",
  "last_location_at": "2026-10-28T19:13:39.046359Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d9f0f244-91f5-4e79-82db-dd6fe058c3cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:45Z",
    "sequence": 1793214825919
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d9f0f244-91f5-4e79-82db-dd6fe058c3cd",
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
  "last_heartbeat_at": "2026-10-28T19:13:45.939994Z",
  "last_location_at": "2026-10-28T19:13:45.939994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "17405422-fe34-4a99-bb85-9d8b226b61a5",
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
  "id": "cea9ea9c-2a4e-4399-a1d8-39825b3e0cae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:18:46.244196Z",
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
  "command_id": "ef4b4fb2-f41b-450b-b825-220546ecc7bd",
  "quote_id": "cea9ea9c-2a4e-4399-a1d8-39825b3e0cae",
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
  "id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
  "created_at": "2026-10-28T19:13:46.563951Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/acb66ff2-87cc-47cb-87af-d34f7c893954` → **200**

```json
{
  "id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
  "created_at": "2026-10-28T19:13:46.563951Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/acb66ff2-87cc-47cb-87af-d34f7c893954` → **200**

```json
{
  "id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
  "created_at": "2026-10-28T19:13:46.563951Z",
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
    "id": "476bcd0d-2519-466d-a3ef-7b9625d84dae",
    "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
    "expires_at": "2026-10-28T19:14:02.315524Z",
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

`POST /api/driver/v1/offers/476bcd0d-2519-466d-a3ef-7b9625d84dae/accept` → **200**

```json
{
  "command_id": "d619e83f-7b6a-4284-b6c9-908a384127a2"
}
```

```json
{
  "id": "9d83ecb5-8124-4bd7-bdf8-a40771305682",
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "47630060-8f02-45e8-b237-b6c2ac184a65",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "47630060-8f02-45e8-b237-b6c2ac184a65",
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "assignment_id": "9d83ecb5-8124-4bd7-bdf8-a40771305682",
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

`POST /api/driver/v1/work-sessions/d9f0f244-91f5-4e79-82db-dd6fe058c3cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:49Z",
    "sequence": 1793214829287
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d9f0f244-91f5-4e79-82db-dd6fe058c3cd",
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
  "last_heartbeat_at": "2026-10-28T19:13:49.308393Z",
  "last_location_at": "2026-10-28T19:13:49.308393Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/47630060-8f02-45e8-b237-b6c2ac184a65/arrive` → **200**

```json
{
  "command_id": "d5a2981d-370f-4c10-9619-327ae7efc9d7",
  "expected_version": 0
}
```

```json
{
  "id": "47630060-8f02-45e8-b237-b6c2ac184a65",
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "assignment_id": "9d83ecb5-8124-4bd7-bdf8-a40771305682",
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
  "arrived_at": "2026-10-28T19:13:49.604859Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/47630060-8f02-45e8-b237-b6c2ac184a65/start` → **200**

```json
{
  "command_id": "4a165724-6004-4cb4-a406-33f5fc1e022f",
  "expected_version": 1
}
```

```json
{
  "id": "47630060-8f02-45e8-b237-b6c2ac184a65",
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "assignment_id": "9d83ecb5-8124-4bd7-bdf8-a40771305682",
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
  "arrived_at": "2026-10-28T19:13:49.604859Z",
  "started_at": "2026-10-28T19:13:49.910358Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/47630060-8f02-45e8-b237-b6c2ac184a65/complete` → **200**

```json
{
  "command_id": "c46c092d-27d3-47d6-9e35-f2be5a1b7250",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:13:50Z",
  "cash_received": true
}
```

```json
{
  "id": "47630060-8f02-45e8-b237-b6c2ac184a65",
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "assignment_id": "9d83ecb5-8124-4bd7-bdf8-a40771305682",
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
  "arrived_at": "2026-10-28T19:13:49.604859Z",
  "started_at": "2026-10-28T19:13:49.910358Z",
  "completed_at": "2026-10-28T19:13:50.219669Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/acb66ff2-87cc-47cb-87af-d34f7c893954` → **200**

```json
{
  "id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
    "id": "9d83ecb5-8124-4bd7-bdf8-a40771305682",
    "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "47630060-8f02-45e8-b237-b6c2ac184a65",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:13:46.563951Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/acb66ff2-87cc-47cb-87af-d34f7c893954` → **200**

```json
{
  "id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
    "id": "9d83ecb5-8124-4bd7-bdf8-a40771305682",
    "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "47630060-8f02-45e8-b237-b6c2ac184a65",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:13:46.563951Z",
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

`GET /api/rider/v1/orders/acb66ff2-87cc-47cb-87af-d34f7c893954/tip` → **200**

```json
{
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
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
  "available_until": "2026-10-29T19:13:50.219669Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/acb66ff2-87cc-47cb-87af-d34f7c893954/tip` → **201**

```json
{
  "command_id": "4a781eac-e332-4ec5-be9e-abb67c64966f",
  "amount_minor": 2500
}
```

```json
{
  "id": "bfafa024-5317-4122-94d8-8f4dc1ef26fb",
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T19:13:52.714112Z"
}
```

`GET /api/rider/v1/orders/acb66ff2-87cc-47cb-87af-d34f7c893954/tip` → **200**

```json
{
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
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
  "available_until": "2026-10-29T19:13:50.219669Z",
  "open": false,
  "tip": {
    "id": "bfafa024-5317-4122-94d8-8f4dc1ef26fb",
    "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T19:13:52.714112Z"
  }
}
```

`GET /api/rider/v1/orders/acb66ff2-87cc-47cb-87af-d34f7c893954/tip` → **200**

```json
{
  "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
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
  "available_until": "2026-10-29T19:13:50.219669Z",
  "open": false,
  "tip": {
    "id": "bfafa024-5317-4122-94d8-8f4dc1ef26fb",
    "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T19:13:52.714112Z"
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
      "id": "fe26c676-fd3a-49db-8995-9acaa758591a",
      "at": "2026-10-28T19:13:54.455724Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
      "counterpart_id": null
    },
    {
      "id": "b00284bf-0f3f-4659-81ab-ab2356230e21",
      "at": "2026-10-28T19:13:50.375365Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4fefb69d-401f-4f50-9c5c-36a974e94280",
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
  "id": "1c7c857d-f60c-4478-b196-120d38dd6bd6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:18:54.894816Z",
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
  "session_id": "eb051024-b08f-446b-8853-e04084714fe7",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3MzUsImlhdCI6MTc5MzIxNDgzNSwianRpIjoiZTc2Y2E5MGYtNjM2YS00NWQzLTllZDktMTMwY2M4ODlhMmFiIiwic2lkIjoiZWIwNTEwMjQtYjA4Zi00NDZiLTg4NTMtZTA0MDg0NzE0ZmU3In0.AoDI8Io3151n_83DAFP7_ew96w5DVUzxmBFjt0qd1Pk",
  "access_expires_at": "2026-10-28T19:28:55.49925193Z",
  "refresh_token": "quk10mU5FYrFUkOuLoxQIG3xMu0BG8PlaShzH1POoFg",
  "refresh_expires_at": "2026-10-29T07:13:55.498689688Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739572769` → **200**

```json
{
  "client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c"
}
```

`POST /api/admin/v1/rider-wallets/db8d4900-c0a8-492b-bc8e-bde5237a394c/top-ups` → **201**

```json
{
  "command_id": "96e44fc9-2a3c-4fdd-92d8-e967b86239d7",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
      "id": "59abf702-f129-40c9-97d1-1dd08c19125f",
      "at": "2026-10-28T19:13:56.056846Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6f981f99-752d-46fe-ba29-46403e58ac7c",
  "quote_id": "1c7c857d-f60c-4478-b196-120d38dd6bd6",
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
  "id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
  "created_at": "2026-10-28T19:13:56.368542Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/245f6c7c-2905-450d-acb7-c49a0e374d4d` → **200**

```json
{
  "id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
  "created_at": "2026-10-28T19:13:56.368542Z",
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
    "id": "819d7020-67f0-4e97-b99a-f4b8fd425f44",
    "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
    "expires_at": "2026-10-28T19:14:11.374931Z",
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

`POST /api/driver/v1/offers/819d7020-67f0-4e97-b99a-f4b8fd425f44/accept` → **200**

```json
{
  "command_id": "b0fd7f1d-2026-45d6-95f4-09e15284ab10"
}
```

```json
{
  "id": "0ed8a42c-2afe-45f2-a973-5d23afe64894",
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8054624e-3ba3-4eff-97c3-9a749b8472ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8054624e-3ba3-4eff-97c3-9a749b8472ed",
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
  "assignment_id": "0ed8a42c-2afe-45f2-a973-5d23afe64894",
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

`POST /api/driver/v1/work-sessions/d9f0f244-91f5-4e79-82db-dd6fe058c3cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:13:57Z",
    "sequence": 1793214837845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d9f0f244-91f5-4e79-82db-dd6fe058c3cd",
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
  "last_heartbeat_at": "2026-10-28T19:13:57.866094Z",
  "last_location_at": "2026-10-28T19:13:57.866094Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8054624e-3ba3-4eff-97c3-9a749b8472ed/arrive` → **200**

```json
{
  "command_id": "2d957e5a-4ac9-41e4-a386-c7f8f0eca314",
  "expected_version": 0
}
```

```json
{
  "id": "8054624e-3ba3-4eff-97c3-9a749b8472ed",
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
  "assignment_id": "0ed8a42c-2afe-45f2-a973-5d23afe64894",
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
  "arrived_at": "2026-10-28T19:13:58.161928Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8054624e-3ba3-4eff-97c3-9a749b8472ed/start` → **200**

```json
{
  "command_id": "9d4e0a20-81f7-4009-99d3-67ca49c5ad77",
  "expected_version": 1
}
```

```json
{
  "id": "8054624e-3ba3-4eff-97c3-9a749b8472ed",
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
  "assignment_id": "0ed8a42c-2afe-45f2-a973-5d23afe64894",
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
  "arrived_at": "2026-10-28T19:13:58.161928Z",
  "started_at": "2026-10-28T19:13:58.466647Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8054624e-3ba3-4eff-97c3-9a749b8472ed/complete` → **200**

```json
{
  "command_id": "25e7b586-0966-45e3-8f57-fdb2ddb03283",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:13:58Z",
  "cash_received": true
}
```

```json
{
  "id": "8054624e-3ba3-4eff-97c3-9a749b8472ed",
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
  "assignment_id": "0ed8a42c-2afe-45f2-a973-5d23afe64894",
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
  "arrived_at": "2026-10-28T19:13:58.161928Z",
  "started_at": "2026-10-28T19:13:58.466647Z",
  "completed_at": "2026-10-28T19:13:58.773626Z",
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
  "client_id": "db8d4900-c0a8-492b-bc8e-bde5237a394c",
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
      "id": "59abf702-f129-40c9-97d1-1dd08c19125f",
      "at": "2026-10-28T19:13:56.056846Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
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

`GET /api/rider/v1/orders/245f6c7c-2905-450d-acb7-c49a0e374d4d/tip` → **200**

```json
{
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
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
  "available_until": "2026-10-29T19:13:58.773626Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/245f6c7c-2905-450d-acb7-c49a0e374d4d/tip` → **201**

```json
{
  "command_id": "e3e0620e-0415-4fbb-b4f3-e48002e67486",
  "amount_minor": 2500
}
```

```json
{
  "id": "9b9f2038-7f84-41e1-81bd-48e1381d4eee",
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T19:13:59.938812Z"
}
```

`GET /api/rider/v1/orders/245f6c7c-2905-450d-acb7-c49a0e374d4d/tip` → **200**

```json
{
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
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
  "available_until": "2026-10-29T19:13:58.773626Z",
  "open": false,
  "tip": {
    "id": "9b9f2038-7f84-41e1-81bd-48e1381d4eee",
    "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T19:13:59.938812Z"
  }
}
```

`GET /api/rider/v1/orders/245f6c7c-2905-450d-acb7-c49a0e374d4d/tip` → **200**

```json
{
  "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
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
  "available_until": "2026-10-29T19:13:58.773626Z",
  "open": false,
  "tip": {
    "id": "9b9f2038-7f84-41e1-81bd-48e1381d4eee",
    "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T19:13:59.938812Z"
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "2452ca44-c6ee-438f-9124-e91319a8d012",
      "at": "2026-10-28T19:14:01.53459Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
      "counterpart_id": null
    },
    {
      "id": "21989d84-9117-46e1-851f-894952bff5bc",
      "at": "2026-10-28T19:13:59.501136Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "245f6c7c-2905-450d-acb7-c49a0e374d4d",
      "counterpart_id": null
    },
    {
      "id": "fe26c676-fd3a-49db-8995-9acaa758591a",
      "at": "2026-10-28T19:13:54.455724Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
      "counterpart_id": null
    },
    {
      "id": "b00284bf-0f3f-4659-81ab-ab2356230e21",
      "at": "2026-10-28T19:13:50.375365Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "acb66ff2-87cc-47cb-87af-d34f7c893954",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d9f0f244-91f5-4e79-82db-dd6fe058c3cd",
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
  "last_heartbeat_at": "2026-10-28T19:13:57.866094Z",
  "last_location_at": "2026-10-28T19:13:57.866094Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d9f0f244-91f5-4e79-82db-dd6fe058c3cd/close` → **200**

```json
{
  "command_id": "dd4813cc-3147-4a8c-9e15-ecc40bb61245",
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

Done: card order 245f6c7c-2905-450d-acb7-c49a0e374d4d.

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
  "phone": "+380737214868",
  "device_ref": "sandbox-6282"
}
```

```json
{
  "challenge_id": "fdf7839f-365b-4bab-b0b9-74f90c1f03e9",
  "expires_at": "2026-10-28T19:19:02.970950739Z",
  "resend_available_at": "2026-10-28T19:14:03.970950739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737214868` → **200**

```json
{
  "phone": "+380737214868",
  "audience": "CLIENT",
  "code": "808853",
  "sent_at": "2026-10-28T19:14:02.974115762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdf7839f-365b-4bab-b0b9-74f90c1f03e9",
  "code": "808853",
  "device_ref": "sandbox-6282"
}
```

```json
{
  "session_id": "b5d0a508-d337-4747-87d9-f5fd2afad1ec",
  "subject": {
    "type": "CLIENT",
    "id": "eacf199e-b700-4a1d-a10a-20163e003773"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYWNmMTk5ZS1iNzAwLTRhMWQtYTEwYS0yMDE2M2UwMDM3NzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzQzLCJpYXQiOjE3OTMyMTQ4NDMsImp0aSI6ImI1MzVkNDAwLWMwMzItNDY3Yi1iN2RiLTU0NTc4ZDMwY2E5YyIsInNpZCI6ImI1ZDBhNTA4LWQzMzctNDc0Ny04N2Q5LWY1ZmQyYWZhZDFlYyJ9.bM878s8xxOzXB0D-VXYriOs0GeUQc6cQ52vZ5jvJLPI",
  "access_expires_at": "2026-10-28T19:29:03.28892906Z",
  "refresh_token": "XBpBE9AOTGO9p11msrb6lVd_TuMoi5-I3iSSLC1_mTc",
  "refresh_expires_at": "2026-11-27T19:14:03.288208194Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "2ad1608f-4b78-4398-ad22-42cebf062748",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "03c7935f-9118-48da-a69f-eb6bd1ca880a",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-03c7935f-9118-48da-a69f-eb6bd1ca880a",
    "orderDate": "1793214843",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "1f10e7f9bacd113dd38cfe050fa6d3bd",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=03c7935f-9118-48da-a69f-eb6bd1ca880a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737214868"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=03c7935f-9118-48da-a69f-eb6bd1ca880a",
  "created_at": "2026-10-28T19:14:03.583242Z",
  "expires_at": "2026-10-28T19:44:03.583242Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/03c7935f-9118-48da-a69f-eb6bd1ca880a` → **200**

```json
{
  "id": "03c7935f-9118-48da-a69f-eb6bd1ca880a",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T19:14:03.583242Z",
  "expires_at": "2026-10-28T19:44:03.583242Z",
  "completed_at": "2026-10-28T19:14:03.88345Z",
  "masked_pan": "41****9636",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "eacf199e-b700-4a1d-a10a-20163e003773",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "eacf199e-b700-4a1d-a10a-20163e003773",
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
      "id": "c769ff3b-e0af-4680-8de8-9f9f6067fd9c",
      "at": "2026-10-28T19:14:04.550371Z",
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
  "client_id": "eacf199e-b700-4a1d-a10a-20163e003773",
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
      "id": "c769ff3b-e0af-4680-8de8-9f9f6067fd9c",
      "at": "2026-10-28T19:14:04.550371Z",
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
  "device_ref": "sandbox-3676"
}
```

```json
{
  "challenge_id": "f1f29e17-3a46-40e2-b3cb-86b2f6c11421",
  "expires_at": "2026-10-28T19:19:06.075693828Z",
  "resend_available_at": "2026-10-28T19:14:07.075693828Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "517642",
  "sent_at": "2026-10-28T19:14:06.078498539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1f29e17-3a46-40e2-b3cb-86b2f6c11421",
  "code": "517642",
  "device_ref": "sandbox-3676"
}
```

```json
{
  "session_id": "e51f6cf7-1fc0-4c38-9227-a693fcef11c1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTc0NiwiaWF0IjoxNzkzMjE0ODQ2LCJqdGkiOiJmODg1ZmE4My1kMWZlLTRiN2MtOWY0Yy0wY2E3MWFlYTlhNmMiLCJzaWQiOiJlNTFmNmNmNy0xZmMwLTRjMzgtOTIyNy1hNjkzZmNlZjExYzEifQ.GyIdK55d6mJxY2x_IrygC4lVti-Jnw2dpE_NClkxD9U",
  "access_expires_at": "2026-10-28T19:29:06.383345397Z",
  "refresh_token": "nVaIqg5-4IPD3ZZFKxdLlNv2a20WWavMCsfyHPg0In4",
  "refresh_expires_at": "2026-11-27T19:14:06.382578774Z",
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
  "command_id": "e3998be5-33a2-4137-b6e8-a851b3867e08",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "48ed8d22-492b-4736-8912-e458a7ee5921",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-48ed8d22-492b-4736-8912-e458a7ee5921",
    "orderDate": "1793214846",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "633dcf0cf18334eaf64d18cf16a951dd",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=48ed8d22-492b-4736-8912-e458a7ee5921",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=48ed8d22-492b-4736-8912-e458a7ee5921",
  "created_at": "2026-10-28T19:14:06.95821Z",
  "expires_at": "2026-10-28T19:44:06.95821Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/48ed8d22-492b-4736-8912-e458a7ee5921` → **200**

```json
{
  "id": "48ed8d22-492b-4736-8912-e458a7ee5921",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T19:14:06.95821Z",
  "expires_at": "2026-10-28T19:44:06.95821Z",
  "completed_at": "2026-10-28T19:14:07.243218Z",
  "masked_pan": "41****9238",
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
      "id": "3bfad130-ad54-47dd-a622-aa3a910e48cf",
      "at": "2026-10-28T19:14:07.558079Z",
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
  "command_id": "13495b79-5c4c-4ef6-be4f-9b366eca531a",
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
  "correlation_id": "fffbf563-3656-4d97-a475-0ba00a5ec775"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: cash-dispute

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29316"
}
```

```json
{
  "challenge_id": "baaff0c0-a98c-428d-bcd7-d3c27507c875",
  "expires_at": "2026-10-28T19:19:08.152274048Z",
  "resend_available_at": "2026-10-28T19:14:09.152274048Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "176539",
  "sent_at": "2026-10-28T19:14:08.154743571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "baaff0c0-a98c-428d-bcd7-d3c27507c875",
  "code": "176539",
  "device_ref": "sandbox-29316"
}
```

```json
{
  "session_id": "bcd2bd82-44e0-4936-ba3c-5a76d25d16a0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTc0OCwiaWF0IjoxNzkzMjE0ODQ4LCJqdGkiOiJkMjEyOTdkMS0wYmM3LTRhZWEtODA5Yy0yZjBjYzEzYjMzM2UiLCJzaWQiOiJiY2QyYmQ4Mi00NGUwLTQ5MzYtYmEzYy01YTc2ZDI1ZDE2YTAifQ.rFIXvlc5L88bPzo9keyrNn8j2ZDMTKg452SpJDVg7TI",
  "access_expires_at": "2026-10-28T19:29:08.454260427Z",
  "refresh_token": "qGk2hnVpcu0ZHrOEBlLP8d1t2k1Sim6372PU5Mvql3c",
  "refresh_expires_at": "2026-11-27T19:14:08.453711578Z",
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
  "command_id": "4ecb4d2c-ae7a-4e0b-880b-49ad75dd5b0a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:14:09Z",
    "sequence": 1793214849102
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f15ec72-8f4d-4078-b7b3-bfa8fbc57bf5",
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
  "last_heartbeat_at": "2026-10-28T19:14:09.029805Z",
  "last_location_at": "2026-10-28T19:14:09.029805Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635695433",
  "device_ref": "sandbox-403"
}
```

```json
{
  "challenge_id": "e172411e-a7fe-40bb-bcd2-c14e6728589a",
  "expires_at": "2026-10-28T19:19:09.325915934Z",
  "resend_available_at": "2026-10-28T19:14:10.325915934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635695433` → **200**

```json
{
  "phone": "+380635695433",
  "audience": "CLIENT",
  "code": "207988",
  "sent_at": "2026-10-28T19:14:09.328251536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e172411e-a7fe-40bb-bcd2-c14e6728589a",
  "code": "207988",
  "device_ref": "sandbox-403"
}
```

```json
{
  "session_id": "8dbfd789-71c9-4e2b-b5d7-d03c3e60849b",
  "subject": {
    "type": "CLIENT",
    "id": "b12a6f47-cb2d-41d8-8313-6ae96f08e2b7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTJhNmY0Ny1jYjJkLTQxZDgtODMxMy02YWU5NmYwOGUyYjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzQ5LCJpYXQiOjE3OTMyMTQ4NDksImp0aSI6ImRlZjQzYjgzLWQ2NDgtNGIwZC1iYWM3LWJlZGZmYjBlNzM2YSIsInNpZCI6IjhkYmZkNzg5LTcxYzktNGUyYi1iNWQ3LWQwM2MzZTYwODQ5YiJ9.l8UXi3v3JMSZq3CY6pkS41UqIlDTsiH_bxozpD85sBw",
  "access_expires_at": "2026-10-28T19:29:09.645906902Z",
  "refresh_token": "3Kwvv4OOrPStAeQscsAjwSJigXMpA2RXo_o97AIsijc",
  "refresh_expires_at": "2026-11-27T19:14:09.645226355Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a562c424-cac3-4c04-8e0f-9fd731f0bf16",
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
  "id": "dd429165-a43c-4135-ae08-65000a3fb4b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:19:09.939007Z",
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
  "command_id": "5931ed65-94a1-42cb-b490-b36ea043a33a",
  "quote_id": "dd429165-a43c-4135-ae08-65000a3fb4b7",
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
  "id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b12a6f47-cb2d-41d8-8313-6ae96f08e2b7",
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
  "created_at": "2026-10-28T19:14:10.239851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Ivan drives; at the end the rider has no money and leaves

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b7c61417-4bae-4874-8e5e-de13e2520c1b",
    "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
    "expires_at": "2026-10-28T19:14:25.243228Z",
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

`POST /api/driver/v1/offers/b7c61417-4bae-4874-8e5e-de13e2520c1b/accept` → **200**

```json
{
  "command_id": "bbe5d8f3-47e2-44bd-9793-9c8b5c7ab019"
}
```

```json
{
  "id": "b8e6c72a-00a7-458a-be4e-0ed305efdf43",
  "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "70f4ddbe-65a0-4e78-b612-7ed9830f775f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "70f4ddbe-65a0-4e78-b612-7ed9830f775f",
  "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
  "assignment_id": "b8e6c72a-00a7-458a-be4e-0ed305efdf43",
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
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7f15ec72-8f4d-4078-b7b3-bfa8fbc57bf5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:14:11Z",
    "sequence": 1793214851395
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f15ec72-8f4d-4078-b7b3-bfa8fbc57bf5",
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
  "last_heartbeat_at": "2026-10-28T19:14:11.415928Z",
  "last_location_at": "2026-10-28T19:14:11.415928Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/70f4ddbe-65a0-4e78-b612-7ed9830f775f/arrive` → **200**

```json
{
  "command_id": "29a2b870-f8d2-47a5-ae50-ac657d2a707f",
  "expected_version": 0
}
```

```json
{
  "id": "70f4ddbe-65a0-4e78-b612-7ed9830f775f",
  "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
  "assignment_id": "b8e6c72a-00a7-458a-be4e-0ed305efdf43",
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
  "arrived_at": "2026-10-28T19:14:11.724099Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/70f4ddbe-65a0-4e78-b612-7ed9830f775f/start` → **200**

```json
{
  "command_id": "da37a87c-f9d0-483c-a2fc-ccc1d5ff0f70",
  "expected_version": 1
}
```

```json
{
  "id": "70f4ddbe-65a0-4e78-b612-7ed9830f775f",
  "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
  "assignment_id": "b8e6c72a-00a7-458a-be4e-0ed305efdf43",
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
  "arrived_at": "2026-10-28T19:14:11.724099Z",
  "started_at": "2026-10-28T19:14:12.026388Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/70f4ddbe-65a0-4e78-b612-7ed9830f775f/complete` → **200**

```json
{
  "command_id": "4df45a27-be6c-4c41-99af-370818c81e9a",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:14:12Z",
  "cash_received": false
}
```

```json
{
  "id": "70f4ddbe-65a0-4e78-b612-7ed9830f775f",
  "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
  "assignment_id": "b8e6c72a-00a7-458a-be4e-0ed305efdf43",
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
  "arrived_at": "2026-10-28T19:14:11.724099Z",
  "started_at": "2026-10-28T19:14:12.026388Z",
  "completed_at": "2026-10-28T19:14:12.325713Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Finance sees the dispute, with its deadline

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
  "session_id": "8db48617-44d7-4b19-80a0-f48aa3223791",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3NTIsImlhdCI6MTc5MzIxNDg1MiwianRpIjoiMDExMTYxZjQtMzhmOC00YmQ3LTlhNjUtZWFlYWE3Y2MxMDc0Iiwic2lkIjoiOGRiNDg2MTctNDRkNy00YjE5LTgwYTAtZjQ4YWEzMjIzNzkxIn0.BTgtS8PQGOlIw5dIJmhvViy4TS2atHdYWfWgs7w461I",
  "access_expires_at": "2026-10-28T19:29:12.91162425Z",
  "refresh_token": "L75OgqZzqp3GQUEL3966_GWo0sY3M8XQaU_IT-DpBd0",
  "refresh_expires_at": "2026-10-29T07:14:12.910911885Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e/cash-dispute` → **200**

```json
{
  "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "b12a6f47-cb2d-41d8-8313-6ae96f08e2b7",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T19:14:12.605871Z",
  "decide_by": "2026-11-11T19:14:12.605871Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-11T19:14:12.605871Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "b12a6f47-cb2d-41d8-8313-6ae96f08e2b7",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-28T19:14:12.605871Z",
      "decide_by": "2026-11-11T19:14:12.605871Z",
      "decision": null,
      "decided_by": null,
      "reason": null,
      "decided_at": null,
      "version": 1
    }
  ]
}
```

## Finance decides: the rider did not pay, the service pays the driver

`POST /api/admin/v1/orders/ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e/cash-dispute/decide` → **400**

```json
{
  "command_id": "01669190-00f5-4128-a8ef-e9695f518859",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7b8648c5-b14d-451a-bd7e-c7ca9a77f10c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e/cash-dispute/decide` → **200**

```json
{
  "command_id": "19d1cad9-c6f9-4e40-9bc2-ab362ffcb524",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "b12a6f47-cb2d-41d8-8313-6ae96f08e2b7",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T19:14:12.605871Z",
  "decide_by": "2026-11-11T19:14:12.605871Z",
  "decision": "PAY_DRIVER",
  "decided_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-28T19:14:14.08277Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e/cash-dispute/decide` → **409**

```json
{
  "command_id": "e5d2aae4-2527-4a90-aaa5-ed13fd587980",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3c71db75-6bb8-425f-8a63-065a1f9bf69b"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f15ec72-8f4d-4078-b7b3-bfa8fbc57bf5",
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
  "last_heartbeat_at": "2026-10-28T19:14:11.415928Z",
  "last_location_at": "2026-10-28T19:14:11.415928Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7f15ec72-8f4d-4078-b7b3-bfa8fbc57bf5/close` → **200**

```json
{
  "command_id": "35a49db3-fc30-4f82-8ffa-b22ba0e95ce5",
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
  "session_id": "c7877c4c-111c-4527-930b-791700b81589",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3NTUsImlhdCI6MTc5MzIxNDg1NSwianRpIjoiN2FkMDE0YTktYzBiOC00OTRhLTk0ZTAtMzRkZGI2OTVhNTUyIiwic2lkIjoiYzc4NzdjNGMtMTExYy00NTI3LTkzMGItNzkxNzAwYjgxNTg5In0.eAuQfMy7r79I2EqrLPKe0YqET7KxVIFE_ckFHoXCqFU",
  "access_expires_at": "2026-10-28T19:29:15.568675761Z",
  "refresh_token": "1wSvpqyIEbwsNVTGtd_67JA4kXpQHxnPh0eutR1oDRc",
  "refresh_expires_at": "2026-10-29T07:14:15.566637876Z",
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
  "phone": "+48600871601",
  "device_ref": "sandbox-19289"
}
```

```json
{
  "challenge_id": "10b6a71f-3984-45de-b648-c0fa254e1538",
  "expires_at": "2026-10-28T19:19:16.421141834Z",
  "resend_available_at": "2026-10-28T19:14:17.421141834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600871601` → **200**

```json
{
  "phone": "+48600871601",
  "audience": "CLIENT",
  "code": "331503",
  "sent_at": "2026-10-28T19:14:16.423487311Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10b6a71f-3984-45de-b648-c0fa254e1538",
  "code": "331503",
  "device_ref": "sandbox-19289"
}
```

```json
{
  "session_id": "dd1f1b12-3755-4bca-a077-b760762a7f6f",
  "subject": {
    "type": "CLIENT",
    "id": "a0611ca5-9848-4eea-be45-84cf5fa04b37"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMDYxMWNhNS05ODQ4LTRlZWEtYmU0NS04NGNmNWZhMDRiMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzU2LCJpYXQiOjE3OTMyMTQ4NTYsImp0aSI6ImQ5MDQ2ZDYxLWM1N2EtNDQzZi05MzAyLThiYjNmMDkxZTUxMiIsInNpZCI6ImRkMWYxYjEyLTM3NTUtNGJjYS1hMDc3LWI3NjA3NjJhN2Y2ZiJ9._n8jRkzU4G00pQTTiLkdE32KQA3MdSdBNB3_DcJ3mo8",
  "access_expires_at": "2026-10-28T19:29:16.739098622Z",
  "refresh_token": "u7GmykLbP40hrIGSfA1Bdy0H6tyWdsUiYLecMBdNNfg",
  "refresh_expires_at": "2026-11-27T19:14:16.738525077Z",
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
  "command_id": "096fb2eb-ca17-4389-87a0-01752f161ddd",
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
  "correlation_id": "70c99f36-c5bf-458e-97bf-1f6ab224aea3",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
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
  "command_id": "48bd8139-8eaf-4d81-b726-6b2fa407d171",
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
  "paused_at": "2026-10-28T19:14:17.885261575Z",
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
  "command_id": "36f01c7f-6093-4273-abde-7b011fe52be8",
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
  "id": "d6e2333c-fbb9-4085-9130-9223d5a6a053",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:19:18.470757Z",
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
  "command_id": "2ae0957e-ee20-40fa-aed2-28f035149f52",
  "quote_id": "d6e2333c-fbb9-4085-9130-9223d5a6a053",
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
  "correlation_id": "fb5051a2-35f7-4476-8eff-ba2c988f8ded"
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
  "paused_at": "2026-10-28T19:14:17.885262Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "de419c27-1d1e-4e07-aa7a-c1797e946cab",
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
  "command_id": "3d78a81d-f6fc-43fa-991c-25b5a728ef25",
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
  "command_id": "dcc3e221-c0ce-4ab1-8c0c-1449ad1a68f0",
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
  "id": "f5a9ab2a-7c93-41e3-80a7-36a344e25e56",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:19:20.185218Z",
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
  "command_id": "880b2a3f-6aef-4f87-b4da-8f506974b49a",
  "quote_id": "f5a9ab2a-7c93-41e3-80a7-36a344e25e56",
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
  "correlation_id": "921a8287-72dc-49da-a85c-6e827500e2a1"
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
  "command_id": "2da6c3da-dc5e-4018-9596-9f1479e240bb",
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
      "from": "22:00",
      "to": "23:00"
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
      "from": "22:00",
      "to": "23:00"
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
  "command_id": "0c508c7a-bbd5-49e7-9e6f-d37d450ef483",
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
  "id": "167c0ddd-d2f0-4b7a-a0eb-ee6a955e8f43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:19:21.343182Z",
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
  "command_id": "bcb83970-8ba1-4395-9039-7c5ddd570be0",
  "quote_id": "167c0ddd-d2f0-4b7a-a0eb-ee6a955e8f43",
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
  "correlation_id": "54ab19d5-4366-4a1a-926c-a9f0fdf13378"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "45172750-0b9c-43ad-bcd4-4a7c5e4b464b",
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
  "correlation_id": "aaa784c2-e35f-4bbf-bc2e-53e76531da81"
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
      "from": "22:00",
      "to": "23:00"
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
  "command_id": "64569ab2-2d72-4692-8d48-866b95b671e8",
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
  "phone": "+380670011482",
  "device_ref": "sandbox-20015"
}
```

```json
{
  "challenge_id": "b6c16490-1e39-4c82-b2c7-f026613bcc62",
  "expires_at": "2026-10-28T19:19:22.848188907Z",
  "resend_available_at": "2026-10-28T19:14:23.848188907Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670011482` → **200**

```json
{
  "phone": "+380670011482",
  "audience": "CLIENT",
  "code": "837561",
  "sent_at": "2026-10-28T19:14:22.850951889Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6c16490-1e39-4c82-b2c7-f026613bcc62",
  "code": "837561",
  "device_ref": "sandbox-20015"
}
```

```json
{
  "session_id": "6e3c32b0-6518-4139-8efc-a2b3433c9d01",
  "subject": {
    "type": "CLIENT",
    "id": "ac456826-5480-4dc2-bc68-965913734e32"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzQ1NjgyNi01NDgwLTRkYzItYmM2OC05NjU5MTM3MzRlMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzYzLCJpYXQiOjE3OTMyMTQ4NjMsImp0aSI6IjkwMmViNDE1LTFjMjktNGE4NS05MzA5LWM0ZDlmMmFlNTAyMSIsInNpZCI6IjZlM2MzMmIwLTY1MTgtNDEzOS04ZWZjLWEyYjM0MzNjOWQwMSJ9.2VBI6jH88JRzwiApvROoAcJRMihOhoFpIs-L47rkQso",
  "access_expires_at": "2026-10-28T19:29:23.161695685Z",
  "refresh_token": "xAXXaO8dXj8Sinm6vkTuLurOOwzg9q8HO19Y_HmqcB8",
  "refresh_expires_at": "2026-11-27T19:14:23.161059291Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ac456826-5480-4dc2-bc68-965913734e32",
  "session_id": "6e3c32b0-6518-4139-8efc-a2b3433c9d01",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "09cff2ac-43d5-463e-bfc8-260cf49c3141",
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
  "id": "48d611d3-cdda-4d13-a691-fc6f23d4cd22",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:19:23.727072Z",
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
  "challenge_id": "713f9355-6347-439f-9d7a-f0e435c59c68",
  "expires_at": "2026-10-28T19:19:26.025562626Z",
  "resend_available_at": "2026-10-28T19:14:27.025562626Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670011482` → **200**

```json
{
  "phone": "+380670011482",
  "audience": "CLIENT",
  "code": "757377",
  "sent_at": "2026-10-28T19:14:26.027686493Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "0a56a9c9-a495-47c9-afe6-686c47196652",
  "challenge_id": "713f9355-6347-439f-9d7a-f0e435c59c68",
  "otp_code": "757377"
}
```

```json
{
  "client_id": "ac456826-5480-4dc2-bc68-965913734e32",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T19:14:26.342582012Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "2d6d24c5-18b4-4c55-a6fe-463441bdc7ab",
  "quote_id": "48d611d3-cdda-4d13-a691-fc6f23d4cd22",
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
  "correlation_id": "860fb41b-27c6-4a2d-9c17-f89e1e3f57d5"
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
  "session_id": "6e8ae46e-4657-4554-81ad-c27e9670ba40",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3NjcsImlhdCI6MTc5MzIxNDg2NywianRpIjoiY2Q5YzM1OTUtNTAxMS00ZGZjLTgzM2UtOWY1Y2FjMWU1ZTY5Iiwic2lkIjoiNmU4YWU0NmUtNDY1Ny00NTU0LTgxYWQtYzI3ZTk2NzBiYTQwIn0.Wa6I2YE3A_yidkp6x4sL57CbOURV1RsJb2EBsEX6rF0",
  "access_expires_at": "2026-10-28T19:29:27.22231062Z",
  "refresh_token": "sFnMI3ycVBHt68pkTpnl87AmJmJPQTI6ZOl3fcc5qXU",
  "refresh_expires_at": "2026-10-29T07:14:27.22177176Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "ac456826-5480-4dc2-bc68-965913734e32",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T19:14:26.342582Z",
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

`POST /api/admin/v1/client-deletions/ac456826-5480-4dc2-bc68-965913734e32/complete` → **200**

```json
{
  "command_id": "77dc32bb-9e12-464b-8c17-65ec2d709453",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "ac456826-5480-4dc2-bc68-965913734e32",
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
  "correlation_id": "d2084f30-b8fa-4aa9-bb6d-2eba882faa07"
}
```

Done: client ac456826-5480-4dc2-bc68-965913734e32 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661715832",
  "device_ref": "sandbox-24122"
}
```

```json
{
  "challenge_id": "21089325-b334-4903-a000-8d06eb806ea5",
  "expires_at": "2026-10-28T19:19:28.371924319Z",
  "resend_available_at": "2026-10-28T19:14:29.371924319Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661715832` → **200**

```json
{
  "phone": "+380661715832",
  "audience": "CLIENT",
  "code": "661395",
  "sent_at": "2026-10-28T19:14:28.374556101Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21089325-b334-4903-a000-8d06eb806ea5",
  "code": "661395",
  "device_ref": "sandbox-24122"
}
```

```json
{
  "session_id": "caf0f983-edf0-492f-8c7a-7994ae2752d1",
  "subject": {
    "type": "CLIENT",
    "id": "c5b54092-5243-4290-ae8c-4c353118d672"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWI1NDA5Mi01MjQzLTQyOTAtYWU4Yy00YzM1MzExOGQ2NzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzY4LCJpYXQiOjE3OTMyMTQ4NjgsImp0aSI6IjJjNTcxYjBiLTIyYzctNGI2Yy1iODViLTc5YjUyMzM1ODEzNyIsInNpZCI6ImNhZjBmOTgzLWVkZjAtNDkyZi04YzdhLTc5OTRhZTI3NTJkMSJ9.n4WlcIez0ifyePme4pq3SifPo2FeC4M70JAkiLGJxFY",
  "access_expires_at": "2026-10-28T19:29:28.685117555Z",
  "refresh_token": "lxwuxF_0-x8we6_ybWjIo6mV7ad65y4DuZHc-hhoKoo",
  "refresh_expires_at": "2026-11-27T19:14:28.68441932Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c5b54092-5243-4290-ae8c-4c353118d672",
  "session_id": "caf0f983-edf0-492f-8c7a-7994ae2752d1",
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
  "session_id": "760cd755-a31d-4540-a4bb-994f22f47c70",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3NjksImlhdCI6MTc5MzIxNDg2OSwianRpIjoiOGI3YTAyMGItZTMzZC00ZjI1LWE3YjQtODgzYmMwYzljZTViIiwic2lkIjoiNzYwY2Q3NTUtYTMxZC00NTQwLWE0YmItOTk0ZjIyZjQ3YzcwIn0.K0P7P2UzXuEl11rK8nVPRjAFSYfyq6AGojGnXBw2YLg",
  "access_expires_at": "2026-10-28T19:29:29.544097748Z",
  "refresh_token": "NpCA2IN4I57RW8bs95CWdI_MUjunRGKSjGWSV8_-qt8",
  "refresh_expires_at": "2026-10-29T07:14:29.543516058Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1715832&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c5b54092-5243-4290-ae8c-4c353118d672",
      "phone": "+380661715832",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T19:14:28.682337Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c5b54092-5243-4290-ae8c-4c353118d672` → **200**

```json
{
  "client": {
    "id": "c5b54092-5243-4290-ae8c-4c353118d672",
    "phone": "+380661715832",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T19:14:28.682337Z",
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

`POST /api/admin/v1/clients/c5b54092-5243-4290-ae8c-4c353118d672/block` → **400**

```json
{
  "command_id": "ff6382a9-39b4-435f-81f0-36881a4259a7",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c5b54092-5243-4290-ae8c-4c353118d672/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "994bc8ea-85e4-47fd-b3cc-4c327ecddd3e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c5b54092-5243-4290-ae8c-4c353118d672/block` → **200**

```json
{
  "command_id": "fec2765f-63fd-472b-81ee-6982c7d991c0",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c5b54092-5243-4290-ae8c-4c353118d672",
  "phone": "+380661715832",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T19:14:28.682337Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T19:14:30.741128Z",
    "by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
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
  "correlation_id": "d31979a4-153d-435d-aa82-d8126b4e3996"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661715832",
  "device_ref": "sandbox-23417"
}
```

```json
{
  "challenge_id": "3780c7bc-474f-4bf4-b939-0c33d6f93364",
  "expires_at": "2026-10-28T19:19:33.326298859Z",
  "resend_available_at": "2026-10-28T19:14:34.326298859Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661715832` → **200**

```json
{
  "phone": "+380661715832",
  "audience": "CLIENT",
  "code": "825122",
  "sent_at": "2026-10-28T19:14:33.328490389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "3780c7bc-474f-4bf4-b939-0c33d6f93364",
  "code": "825122",
  "device_ref": "sandbox-23417"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "8e57d8bd-d4b4-466c-91a8-d42c387e7e78"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c5b54092-5243-4290-ae8c-4c353118d672` → **200**

```json
{
  "client": {
    "id": "c5b54092-5243-4290-ae8c-4c353118d672",
    "phone": "+380661715832",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T19:14:28.682337Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T19:14:30.741128Z",
      "by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
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

`POST /api/admin/v1/clients/c5b54092-5243-4290-ae8c-4c353118d672/unblock` → **200**

```json
{
  "command_id": "885d8c92-39c0-443b-8420-bc5dbfa72ed9",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c5b54092-5243-4290-ae8c-4c353118d672",
  "phone": "+380661715832",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T19:14:28.682337Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661715832",
  "device_ref": "sandbox-5264"
}
```

```json
{
  "challenge_id": "5d698bb3-b3be-4abc-9903-46598a72556d",
  "expires_at": "2026-10-28T19:19:36.635386599Z",
  "resend_available_at": "2026-10-28T19:14:37.635386599Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661715832` → **200**

```json
{
  "phone": "+380661715832",
  "audience": "CLIENT",
  "code": "034216",
  "sent_at": "2026-10-28T19:14:36.638483068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d698bb3-b3be-4abc-9903-46598a72556d",
  "code": "034216",
  "device_ref": "sandbox-5264"
}
```

```json
{
  "session_id": "ae772231-2f0f-4dc8-b6c3-6e363ec40aac",
  "subject": {
    "type": "CLIENT",
    "id": "c5b54092-5243-4290-ae8c-4c353118d672"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWI1NDA5Mi01MjQzLTQyOTAtYWU4Yy00YzM1MzExOGQ2NzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1Nzc2LCJpYXQiOjE3OTMyMTQ4NzYsImp0aSI6IjVmNjZhMzI3LWZjMDAtNDQyMi1iY2NhLWIzZWY1NjU1ZmEzMCIsInNpZCI6ImFlNzcyMjMxLTJmMGYtNGRjOC1iNmMzLTZlMzYzZWM0MGFhYyJ9.goAwZZRAnEf-VwsiuEu_rh9LruAYnYl-CEidc2EEkH4",
  "access_expires_at": "2026-10-28T19:29:36.941259866Z",
  "refresh_token": "6m58ShP_0kknEv0wfs87KQKmAJtoGsJ6P9Izd9M44c4",
  "refresh_expires_at": "2026-11-27T19:14:36.940611352Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c5b54092-5243-4290-ae8c-4c353118d672",
  "session_id": "ae772231-2f0f-4dc8-b6c3-6e363ec40aac",
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
  "phone": "+380667575986",
  "device_ref": "sandbox-26224"
}
```

```json
{
  "challenge_id": "3356db6c-f653-40c1-939a-a67dcd264d65",
  "expires_at": "2026-10-28T19:19:37.535554275Z",
  "resend_available_at": "2026-10-28T19:14:38.535554275Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667575986` → **200**

```json
{
  "phone": "+380667575986",
  "audience": "CLIENT",
  "code": "133254",
  "sent_at": "2026-10-28T19:14:37.537836143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3356db6c-f653-40c1-939a-a67dcd264d65",
  "code": "133254",
  "device_ref": "sandbox-26224"
}
```

```json
{
  "session_id": "309a59fc-4ed4-4846-bc1c-9124d22ec9b0",
  "subject": {
    "type": "CLIENT",
    "id": "d3eeca1a-2137-45f8-baba-0303fd0cc70e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2VlY2ExYS0yMTM3LTQ1ZjgtYmFiYS0wMzAzZmQwY2M3MGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1Nzc3LCJpYXQiOjE3OTMyMTQ4NzcsImp0aSI6ImIyMzNlMTU0LTEyYmUtNGIyYS04NDg2LWQ0NWZjMTI2YjNjMyIsInNpZCI6IjMwOWE1OWZjLTRlZDQtNDg0Ni1iYzFjLTkxMjRkMjJlYzliMCJ9.uM0N7Y-1CY1XUGi-PGeqwZFIN0fxLxA3pZ04nVxa8_I",
  "access_expires_at": "2026-10-28T19:29:37.852287115Z",
  "refresh_token": "BwQx6vdJxZXz3UTyn1OEUMFoPuxOfW8gH6T9SU61EwI",
  "refresh_expires_at": "2026-11-27T19:14:37.851747504Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9de86f5b-8040-48a2-abb7-80fd05b5f036",
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
  "id": "a8b84167-e603-4d1d-86ae-85f2ed26d363",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:19:38.137873Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: e6387bef-3c9c-4a05-ba08-b3c5a2ee1e9f) → **201**

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
  "session_id": "1d9ebf7d-7499-41ce-a710-8b4cb826a258",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3NzgsImlhdCI6MTc5MzIxNDg3OCwianRpIjoiY2IwZTI2NTUtY2ViYy00ZWZlLWFhNTItOWM0ZDU4Mzc4Y2NkIiwic2lkIjoiMWQ5ZWJmN2QtNzQ5OS00MWNlLWE3MTAtOGI0Y2I4MjZhMjU4In0.6e8suiyxc2bGypKNb8VvNMTD4eOtvjfsOd9GY6nKcQQ",
  "access_expires_at": "2026-10-28T19:29:38.771134159Z",
  "refresh_token": "_jhZJ2lompCN6pEsoyRCBsfKLETbhSHw1sNSJddN1qM",
  "refresh_expires_at": "2026-10-29T07:14:38.770450591Z",
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
  "session_id": "5cb4b310-8e9c-4b93-b410-90459aab9978",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3NzksImlhdCI6MTc5MzIxNDg3OSwianRpIjoiNjY5OGYxZTUtMDNiYi00MDFiLWE0MzQtZGE4NThkMzEzNzNmIiwic2lkIjoiNWNiNGIzMTAtOGU5Yy00YjkzLWI0MTAtOTA0NTlhYWI5OTc4In0.oB0vXO5PgEeehbZMv605jiLuwq5v-YtPBMJB-jxC0G4",
  "access_expires_at": "2026-10-28T19:29:39.337103167Z",
  "refresh_token": "FrQXs_vc9ubQADjnLZv1uRm8yMBU0YSUYaKvSmnqOO0",
  "refresh_expires_at": "2026-10-29T07:14:39.336510676Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e08c2829-a48b-4dff-aabc-356204e31b1f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:14:38.435932Z",
      "actor": {
        "type": "CLIENT",
        "id": "d3eeca1a-2137-45f8-baba-0303fd0cc70e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e08c2829-a48b-4dff-aabc-356204e31b1f",
        "quote_id": "a8b84167-e603-4d1d-86ae-85f2ed26d363",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e6387bef-3c9c-4a05-ba08-b3c5a2ee1e9f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:14:38.438262Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e08c2829-a48b-4dff-aabc-356204e31b1f",
        "attempt_id": "902bf168-4dc9-480d-85c7-026bf8ef1881",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e6387bef-3c9c-4a05-ba08-b3c5a2ee1e9f"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T19:14:38.452284Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e08c2829-a48b-4dff-aabc-356204e31b1f",
        "attempt_id": "902bf168-4dc9-480d-85c7-026bf8ef1881"
      },
      "correlation_id": "e6387bef-3c9c-4a05-ba08-b3c5a2ee1e9f"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "902bf168-4dc9-480d-85c7-026bf8ef1881",
        "generation": 1,
        "started_at": "2026-10-28T19:14:38.437065Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T19:14:38.452284Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T19:14:38.439311Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/e6387bef-3c9c-4a05-ba08-b3c5a2ee1e9f` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "e08c2829-a48b-4dff-aabc-356204e31b1f:0",
      "order_id": "e08c2829-a48b-4dff-aabc-356204e31b1f",
      "at": "2026-10-28T19:14:38.435932Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e08c2829-a48b-4dff-aabc-356204e31b1f:1",
      "order_id": "e08c2829-a48b-4dff-aabc-356204e31b1f",
      "at": "2026-10-28T19:14:38.438262Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e08c2829-a48b-4dff-aabc-356204e31b1f:2",
      "order_id": "e08c2829-a48b-4dff-aabc-356204e31b1f",
      "at": "2026-10-28T19:14:38.452284Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/e871adb5-7ddd-48d3-97f2-6b57ef7fd42a` → **200**

```json
{
  "found": []
}
```

Done: request e6387bef-3c9c-4a05-ba08-b3c5a2ee1e9f — order e08c2829-a48b-4dff-aabc-356204e31b1f found by its id.

`GET /api/rider/v1/orders/e08c2829-a48b-4dff-aabc-356204e31b1f` → **200**

```json
{
  "id": "e08c2829-a48b-4dff-aabc-356204e31b1f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d3eeca1a-2137-45f8-baba-0303fd0cc70e",
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
  "created_at": "2026-10-28T19:14:38.435282Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e08c2829-a48b-4dff-aabc-356204e31b1f/cancel` → **200**

```json
{
  "command_id": "c2ecd5cb-1774-416e-afdf-610baa242795",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e08c2829-a48b-4dff-aabc-356204e31b1f",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d3eeca1a-2137-45f8-baba-0303fd0cc70e",
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
  "created_at": "2026-10-28T19:14:38.435282Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "phone": "+380632693890",
  "device_ref": "sandbox-28203"
}
```

```json
{
  "challenge_id": "de9ce806-465f-4070-88c8-b5e395c5ba75",
  "expires_at": "2026-10-28T19:19:41.161576867Z",
  "resend_available_at": "2026-10-28T19:14:42.161576867Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632693890` → **200**

```json
{
  "phone": "+380632693890",
  "audience": "CLIENT",
  "code": "301389",
  "sent_at": "2026-10-28T19:14:41.164514298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de9ce806-465f-4070-88c8-b5e395c5ba75",
  "code": "301389",
  "device_ref": "sandbox-28203"
}
```

```json
{
  "session_id": "a6e43cff-2d5f-4fb6-884a-3cc59ed6a64a",
  "subject": {
    "type": "CLIENT",
    "id": "29c14db5-89d0-4d7a-94f9-95e4abc14db3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWMxNGRiNS04OWQwLTRkN2EtOTRmOS05NWU0YWJjMTRkYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzgxLCJpYXQiOjE3OTMyMTQ4ODEsImp0aSI6IjUyMzBjNGQwLTQyNjgtNDI5MS1iNzdmLTY0YjNmYmUxOGZjNyIsInNpZCI6ImE2ZTQzY2ZmLTJkNWYtNGZiNi04ODRhLTNjYzU5ZWQ2YTY0YSJ9._Z_FjOj7cHr4fx0YH9F2ovHwyDwMHO6aBg0cknYovBY",
  "access_expires_at": "2026-10-28T19:29:41.485368089Z",
  "refresh_token": "0eaQNZn4b8hQYt6ym80FGgwO1OiYQ5aDUTAuYy9LbMc",
  "refresh_expires_at": "2026-11-27T19:14:41.484608933Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "4fbbf01b-b049-4840-be7a-d136debeb167",
  "expires_at": "2026-10-28T19:19:43.77457523Z",
  "resend_available_at": "2026-10-28T19:14:44.77457523Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632693890` → **200**

```json
{
  "phone": "+380632693890",
  "audience": "CLIENT",
  "code": "285296",
  "sent_at": "2026-10-28T19:14:43.776904418Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1e7173f4-b9f5-45fc-b77c-458f7c9a2275",
  "challenge_id": "4fbbf01b-b049-4840-be7a-d136debeb167",
  "otp_code": "285296"
}
```

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "PENDING",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12` → **200**

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "PENDING",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12` → **200**

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "PENDING",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12` → **200**

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "PENDING",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12` → **200**

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "PENDING",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12` → **200**

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "PENDING",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12` → **200**

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "PENDING",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12` → **200**

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "PENDING",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12` → **200**

```json
{
  "id": "3e8ac555-585e-424b-a970-7774d7268f12",
  "state": "READY",
  "created_at": "2026-10-28T19:14:44.09236Z",
  "ready_at": "2026-10-28T19:14:52.814388Z",
  "expires_at": "2026-11-04T19:14:52.814388Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633815743",
  "device_ref": "sandbox-31118"
}
```

```json
{
  "challenge_id": "f84eb614-0458-4053-a1aa-b8f0987d9674",
  "expires_at": "2026-10-28T19:19:53.60284305Z",
  "resend_available_at": "2026-10-28T19:14:54.60284305Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633815743` → **200**

```json
{
  "phone": "+380633815743",
  "audience": "CLIENT",
  "code": "603959",
  "sent_at": "2026-10-28T19:14:53.605632773Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f84eb614-0458-4053-a1aa-b8f0987d9674",
  "code": "603959",
  "device_ref": "sandbox-31118"
}
```

```json
{
  "session_id": "4338cd24-49bd-48b4-a73d-b75501de5776",
  "subject": {
    "type": "CLIENT",
    "id": "ee900d99-1db3-4b21-82bd-6aaab2c45575"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTkwMGQ5OS0xZGIzLTRiMjEtODJiZC02YWFhYjJjNDU1NzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1NzkzLCJpYXQiOjE3OTMyMTQ4OTMsImp0aSI6IjUyNDk5ODA0LWQxODYtNGM4Yi1iYWUyLWYyMmUwZjgyOWQyMiIsInNpZCI6IjQzMzhjZDI0LTQ5YmQtNDhiNC1hNzNkLWI3NTUwMWRlNTc3NiJ9.-238WrM0toX7p_vnKCHrPKXLxHuMqXxev_09UHZYqXE",
  "access_expires_at": "2026-10-28T19:29:53.903985002Z",
  "refresh_token": "POUeNwgUm6ms2Dh1HuZ4CeWrXtEVrQlt9MEP4TPMYWU",
  "refresh_expires_at": "2026-11-27T19:14:53.903414954Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/3e8ac555-585e-424b-a970-7774d7268f12/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fb2be017-608e-449d-a8bb-7379b09d2bf3"
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
  "session_id": "d950f7a6-7c4d-4fae-bf7c-740c201e0095",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3OTQsImlhdCI6MTc5MzIxNDg5NCwianRpIjoiZmVlNjFiYTUtMjNjNy00ZmQ0LWJiNjYtMjU4OWM5OTQyOGU2Iiwic2lkIjoiZDk1MGY3YTYtN2M0ZC00ZmFlLWJmN2MtNzQwYzIwMWUwMDk1In0.E13lxrufOto1a4A-WJ6SJUkoNLo-p6tgs4RoviksDjs",
  "access_expires_at": "2026-10-28T19:29:54.75274322Z",
  "refresh_token": "HIE7KWRRzcDT2JndZY99iGV8-26LqfNSpiTlPch4xBI",
  "refresh_expires_at": "2026-10-29T07:14:54.752170377Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "29c14db5-89d0-4d7a-94f9-95e4abc14db3",
  "session_id": "a6e43cff-2d5f-4fb6-884a-3cc59ed6a64a",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/29c14db5-89d0-4d7a-94f9-95e4abc14db3/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "3e8ac555-585e-424b-a970-7774d7268f12",
      "state": "READY",
      "created_at": "2026-10-28T19:14:44.09236Z",
      "ready_at": "2026-10-28T19:14:52.814388Z",
      "expires_at": "2026-11-04T19:14:52.814388Z",
      "size_bytes": 1031
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
  "device_ref": "sandbox-1635"
}
```

```json
{
  "challenge_id": "7b439453-d251-4d6a-ac0e-0cdda7f79ab8",
  "expires_at": "2026-10-28T19:19:55.593846041Z",
  "resend_available_at": "2026-10-28T19:14:56.593846041Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "169075",
  "sent_at": "2026-10-28T19:14:55.596093648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b439453-d251-4d6a-ac0e-0cdda7f79ab8",
  "code": "169075",
  "device_ref": "sandbox-1635"
}
```

```json
{
  "session_id": "c8622b38-d980-4068-9cf3-ab3e7a19cb6f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTc5NSwiaWF0IjoxNzkzMjE0ODk1LCJqdGkiOiJmY2Y3MjZlNS03YmJiLTRmN2EtYWViMi00ZDI5YTlmZTY2NzciLCJzaWQiOiJjODYyMmIzOC1kOTgwLTQwNjgtOWNmMy1hYjNlN2ExOWNiNmYifQ.v2e4fjloDhfIjdGQKyjAxBRE9TkANyFGtGAxI5_vAxQ",
  "access_expires_at": "2026-10-28T19:29:55.901039397Z",
  "refresh_token": "YNYi3VDUDgQIueoqLb6qEZS0MIUwrExlyMxS6LwJGzo",
  "refresh_expires_at": "2026-11-27T19:14:55.900524191Z",
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
  "device_ref": "sandbox-24836"
}
```

```json
{
  "challenge_id": "4d0d266f-af55-4b14-8a18-21020958f641",
  "expires_at": "2026-10-28T19:19:56.461890598Z",
  "resend_available_at": "2026-10-28T19:14:57.461890598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "539014",
  "sent_at": "2026-10-28T19:14:56.464154285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d0d266f-af55-4b14-8a18-21020958f641",
  "code": "539014",
  "device_ref": "sandbox-24836"
}
```

```json
{
  "session_id": "096fbf80-bfa5-40f9-be04-87b51c5d572e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTc5NiwiaWF0IjoxNzkzMjE0ODk2LCJqdGkiOiIwMThjYjRjOC0yYjhiLTQ3NDctOTg3ZS0yOTQxNzFmNjU2ZWEiLCJzaWQiOiIwOTZmYmY4MC1iZmE1LTQwZjktYmUwNC04N2I1MWM1ZDU3MmUifQ.2YTet5JLffAuUXF7FbiCy0F3HjzyMZtGov-pL70PKp8",
  "access_expires_at": "2026-10-28T19:29:56.76718799Z",
  "refresh_token": "oyPQDtD306h4ES9PmXXzdoaJSSYM-KpvFAJpJzP9vvA",
  "refresh_expires_at": "2026-11-27T19:14:56.766666553Z",
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
  "command_id": "7331b59a-32c5-4f7d-b28e-280d06387cf2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:14:57Z",
    "sequence": 1793214897336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62e5b24c-39e4-48c2-a00b-fb9493d8e5e0",
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
  "last_heartbeat_at": "2026-10-28T19:14:57.356444Z",
  "last_location_at": "2026-10-28T19:14:57.356444Z",
  "eligible": true,
  "ineligible_reasons": []
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
  "challenge_id": "c1cd93fc-7830-4990-95d6-68375a5ee2a6",
  "expires_at": "2026-10-28T19:19:57.633374477Z",
  "resend_available_at": "2026-10-28T19:14:58.633374477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "048919",
  "sent_at": "2026-10-28T19:14:57.635635403Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1cd93fc-7830-4990-95d6-68375a5ee2a6",
  "code": "048919",
  "device_ref": "sandbox-20655"
}
```

```json
{
  "session_id": "6c65a5bf-c6f2-4dae-96ba-0a92d06eae66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTc5NywiaWF0IjoxNzkzMjE0ODk3LCJqdGkiOiIwNTc2ZjQ1MC1kYjUwLTRkNWMtOGNiNy0zODIwNzQ4ZjViN2MiLCJzaWQiOiI2YzY1YTViZi1jNmYyLTRkYWUtOTZiYS0wYTkyZDA2ZWFlNjYifQ.zoJpm6_VuZUxrazCONu8l0Hfjk6TNKfLEcBHxvBOmiA",
  "access_expires_at": "2026-10-28T19:29:57.93566882Z",
  "refresh_token": "deNBkHyn6lJXdguD91c9rz_cgJ4QjIJjfNwLHvt9UjQ",
  "refresh_expires_at": "2026-11-27T19:14:57.935071851Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b310b933-23a4-446d-b165-3581e54bf567",
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
  "last_heartbeat_at": "2026-10-28T19:13:37.883449Z",
  "last_location_at": "2026-10-28T19:13:37.883449Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b310b933-23a4-446d-b165-3581e54bf567/handover` → **200**

```json
{
  "command_id": "bf10cb13-4f4a-4a41-98a2-a460dffc06be",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b310b933-23a4-446d-b165-3581e54bf567",
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
  "last_heartbeat_at": "2026-10-28T19:13:37.883449Z",
  "last_location_at": "2026-10-28T19:13:37.883449Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b310b933-23a4-446d-b165-3581e54bf567/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:14:58Z",
    "sequence": 1793214898772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b310b933-23a4-446d-b165-3581e54bf567",
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
  "last_heartbeat_at": "2026-10-28T19:14:58.792256Z",
  "last_location_at": "2026-10-28T19:14:58.792256Z",
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
  "session_id": "a914c5e8-40fc-4068-b2d9-50ecf504734b",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3OTksImlhdCI6MTc5MzIxNDg5OSwianRpIjoiZmE0MjZiNGQtZDJiYy00N2Q4LTljMWUtYWQxMDkwN2Q0ZGJjIiwic2lkIjoiYTkxNGM1ZTgtNDBmYy00MDY4LWIyZDktNTBlY2Y1MDQ3MzRiIn0.YG8bT6ugxYBXu7oq5AthQNyhoJCSBlEA3atnifxjJLc",
  "access_expires_at": "2026-10-28T19:29:59.356883647Z",
  "refresh_token": "2Sa2BY4ZaduivKXHnLZuuobjKSR8KgJy1XvL2ic24jg",
  "refresh_expires_at": "2026-10-29T07:14:59.356157494Z",
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
  "session_id": "044f914f-ede9-4abf-b163-96390be46542",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU3OTksImlhdCI6MTc5MzIxNDg5OSwianRpIjoiZmJhNmRkYzYtOWNmNS00ZWVhLTk5OGQtMzA0ODM3YjM2Zjc2Iiwic2lkIjoiMDQ0ZjkxNGYtZWRlOS00YWJmLWIxNjMtOTYzOTBiZTQ2NTQyIn0.m4VY7vocKlgHCjf1lhyqyFsL0pU2ay_t-ZRVYztALOw",
  "access_expires_at": "2026-10-28T19:29:59.945701862Z",
  "refresh_token": "nJy0havdwgIZF6Mx20H1yNERA9H_NZ7kseZk4OIfIIo",
  "refresh_expires_at": "2026-10-29T07:14:59.945041936Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687232102",
  "device_ref": "sandbox-27971"
}
```

```json
{
  "challenge_id": "80d48636-f4d3-4dfe-b3b5-0ddff6538ace",
  "expires_at": "2026-10-28T19:20:00.227954863Z",
  "resend_available_at": "2026-10-28T19:15:01.227954863Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380687232102` → **200**

```json
{
  "phone": "+380687232102",
  "audience": "CLIENT",
  "code": "281420",
  "sent_at": "2026-10-28T19:15:00.230696156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80d48636-f4d3-4dfe-b3b5-0ddff6538ace",
  "code": "281420",
  "device_ref": "sandbox-27971"
}
```

```json
{
  "session_id": "5a579b3f-35fc-46ea-8e1c-a226f22c9cef",
  "subject": {
    "type": "CLIENT",
    "id": "86d2ac1f-0a06-4bf2-9921-23c73e6c0740"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmQyYWMxZi0wYTA2LTRiZjItOTkyMS0yM2M3M2U2YzA3NDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODAwLCJpYXQiOjE3OTMyMTQ5MDAsImp0aSI6ImI1N2JiODM5LWU0NDMtNDIxOS05ZDI5LTAxODhiMjU1YjA2NCIsInNpZCI6IjVhNTc5YjNmLTM1ZmMtNDZlYS04ZTFjLWEyMjZmMjJjOWNlZiJ9.3a3Rmc7TqM07jkNf-ns4-0e6SATjmVKQF2x9Xt3h_Og",
  "access_expires_at": "2026-10-28T19:30:00.534833014Z",
  "refresh_token": "9nE6nr-VHDS3pe6HccyqFBDl_PRn7csLloVGr3MDUFA",
  "refresh_expires_at": "2026-11-27T19:15:00.534264198Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f2c528f8-3197-4e8d-bba8-0c9c46cfd740",
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
  "id": "8e597205-cd53-42f4-9b82-563418a21fc2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:00.810058Z",
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
  "command_id": "7ad98523-feb4-4f60-b6c8-9478ddaeaee7",
  "quote_id": "8e597205-cd53-42f4-9b82-563418a21fc2",
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
  "id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86d2ac1f-0a06-4bf2-9921-23c73e6c0740",
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
  "created_at": "2026-10-28T19:15:01.101675Z",
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
    "id": "3dc9d4ca-861e-4b1f-bc86-304cc0644f76",
    "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
    "expires_at": "2026-10-28T19:15:16.105708Z",
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

`POST /api/driver/v1/offers/3dc9d4ca-861e-4b1f-bc86-304cc0644f76/reject` → **204**

```json
{
  "command_id": "dc7b55f2-ac91-4f01-ac6d-14cda817df21"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "28d63b8a-ff9a-491c-b234-bd8c592522dd",
    "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
    "expires_at": "2026-10-28T19:15:16.683749Z",
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

`POST /api/driver/v1/offers/28d63b8a-ff9a-491c-b234-bd8c592522dd/accept` → **200**

```json
{
  "command_id": "0d0be3e2-7dff-49d0-8360-2c9f5882edf0"
}
```

```json
{
  "id": "56f69168-a478-413c-a9fe-978bcacc4d13",
  "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9522a156-e8e4-46b9-b049-07b6731cfbdc",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/69fac16f-b1f3-413a-9668-85e18ac330a8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:15:01.102235Z",
      "actor": {
        "type": "CLIENT",
        "id": "86d2ac1f-0a06-4bf2-9921-23c73e6c0740",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
        "quote_id": "8e597205-cd53-42f4-9b82-563418a21fc2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "da07b2ba-568c-48c5-b448-387fe48133d0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:15:01.104818Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
        "attempt_id": "28a55cbe-510a-446b-8aab-a06943246ba7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "da07b2ba-568c-48c5-b448-387fe48133d0"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:15:01.11182Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3dc9d4ca-861e-4b1f-bc86-304cc0644f76",
        "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "da07b2ba-568c-48c5-b448-387fe48133d0"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T19:15:01.682654Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3dc9d4ca-861e-4b1f-bc86-304cc0644f76",
        "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8"
      },
      "correlation_id": "b573c8f3-785a-451a-984a-e1835cffff0e"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 69fac16f-b1f3-413a-9668-85e18ac330a8 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/69fac16f-b1f3-413a-9668-85e18ac330a8` → **200**

```json
{
  "id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
  "short_number": 9,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "86d2ac1f-0a06-4bf2-9921-23c73e6c0740",
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
    "id": "56f69168-a478-413c-a9fe-978bcacc4d13",
    "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9522a156-e8e4-46b9-b049-07b6731cfbdc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T19:15:01.101675Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/69fac16f-b1f3-413a-9668-85e18ac330a8/cancel` → **200**

```json
{
  "command_id": "b2adfab2-c498-4279-a562-0fa730411d57",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "86d2ac1f-0a06-4bf2-9921-23c73e6c0740",
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
    "id": "56f69168-a478-413c-a9fe-978bcacc4d13",
    "order_id": "69fac16f-b1f3-413a-9668-85e18ac330a8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9522a156-e8e4-46b9-b049-07b6731cfbdc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:15:01.101675Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "session_id": "62e5b24c-39e4-48c2-a00b-fb9493d8e5e0",
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
  "last_heartbeat_at": "2026-10-28T19:14:57.356444Z",
  "last_location_at": "2026-10-28T19:14:57.356444Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62e5b24c-39e4-48c2-a00b-fb9493d8e5e0/close` → **200**

```json
{
  "command_id": "62d0078b-f4d7-42d7-bbc2-141ce989560d",
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
  "session_id": "b310b933-23a4-446d-b165-3581e54bf567",
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
  "last_heartbeat_at": "2026-10-28T19:14:58.792256Z",
  "last_location_at": "2026-10-28T19:14:58.792256Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b310b933-23a4-446d-b165-3581e54bf567/close` → **200**

```json
{
  "command_id": "9cadc7f9-d44d-441b-8424-74bd9c4f719f",
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
  "session_id": "b0205ac9-0c8f-411b-bec9-251cf7b05e41",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4MDQsImlhdCI6MTc5MzIxNDkwNCwianRpIjoiODY4NDU3YWQtZWEyZC00ZjJiLWIzNWMtZGIzMDgyZThmNDc0Iiwic2lkIjoiYjAyMDVhYzktMGM4Zi00MTFiLWJlYzktMjUxY2Y3YjA1ZTQxIn0.EsdOLf5Re4SvwIs0CPPZXcfBlH6qsVMvV1P-Xc72vNI",
  "access_expires_at": "2026-10-28T19:30:04.667937383Z",
  "refresh_token": "qzb8mIUBDcP5Lbi0s7XrC435U-6wQlONmJ-ZWHabXRs",
  "refresh_expires_at": "2026-10-29T07:15:04.667180086Z",
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
  "command_id": "2a65ed16-2aa1-4a4a-97bd-a61fd8e897ba",
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
  "changed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T19:15:05.237122Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "d14f1a33-4d49-4b8f-83f1-370984c178f1",
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
  "correlation_id": "1ad361c7-80c2-4ed4-bcda-e510b7300e73"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "99919d99-62af-4385-a8fa-b5ffd95d6ce5",
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
  "correlation_id": "a0afc631-960a-49b5-bc9b-907eecdc5fd2"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639566942",
  "device_ref": "sandbox-10556"
}
```

```json
{
  "challenge_id": "eaed1c2a-b4f3-436b-a82c-83d9a5fe7c23",
  "expires_at": "2026-10-28T19:20:06.100901125Z",
  "resend_available_at": "2026-10-28T19:15:07.100901125Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639566942` → **200**

```json
{
  "phone": "+380639566942",
  "audience": "CLIENT",
  "code": "790590",
  "sent_at": "2026-10-28T19:15:06.10334973Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eaed1c2a-b4f3-436b-a82c-83d9a5fe7c23",
  "code": "790590",
  "device_ref": "sandbox-10556"
}
```

```json
{
  "session_id": "ed8d7edb-b815-4b39-b8b1-fa7099f84276",
  "subject": {
    "type": "CLIENT",
    "id": "0bb679b1-df9a-4d09-8e6c-381ac164058f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmI2NzliMS1kZjlhLTRkMDktOGU2Yy0zODFhYzE2NDA1OGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODA2LCJpYXQiOjE3OTMyMTQ5MDYsImp0aSI6Ijc3MDAxZDRjLWQwMWQtNDcxMC1hNzRiLTAzZWQzYTMyNmMzMCIsInNpZCI6ImVkOGQ3ZWRiLWI4MTUtNGIzOS1iOGIxLWZhNzA5OWY4NDI3NiJ9.CAUwY9dxXYeeUguZfS7ksbw2hf_rXRb6YDfF7mq4Pak",
  "access_expires_at": "2026-10-28T19:30:06.411692218Z",
  "refresh_token": "BGtcHKBOqfutT-MeZ8bAfP-vMlA-4TGH8TQV0UW27Zw",
  "refresh_expires_at": "2026-11-27T19:15:06.411105367Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f3b154a0-15fa-4011-87be-b7dfa3998ec7",
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
  "id": "1a1b81c2-d071-42f8-b5af-cc7f3e56604b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:06.692393Z",
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
  "command_id": "e3a209ce-cc08-472f-a63e-8cf3ffdf5c35",
  "quote_id": "1a1b81c2-d071-42f8-b5af-cc7f3e56604b",
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
  "correlation_id": "3d15ac6e-3183-4906-9c6b-d95dffae8099"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c9dbbe61-bee3-406f-84e7-5f5f51d8313b",
  "quote_id": "1a1b81c2-d071-42f8-b5af-cc7f3e56604b",
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
  "id": "e077e694-b472-4f07-82aa-c8c534e2965f",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0bb679b1-df9a-4d09-8e6c-381ac164058f",
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
  "created_at": "2026-10-28T19:15:07.262528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e077e694-b472-4f07-82aa-c8c534e2965f/cancel` → **200**

```json
{
  "command_id": "76ca4a2c-e198-4193-b755-e7a923125f67",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e077e694-b472-4f07-82aa-c8c534e2965f",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0bb679b1-df9a-4d09-8e6c-381ac164058f",
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
  "created_at": "2026-10-28T19:15:07.262528Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "command_id": "b93df8bd-c3c4-4de3-9e89-679462c8ef39",
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
  "changed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T19:15:07.882391Z"
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
      "changed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T19:15:07.882391Z"
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
  "device_ref": "sandbox-29061"
}
```

```json
{
  "challenge_id": "fbbcc70b-a5c7-4a36-9a9e-75f215a50f4e",
  "expires_at": "2026-10-28T19:20:08.726133434Z",
  "resend_available_at": "2026-10-28T19:15:09.726133434Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "320747",
  "sent_at": "2026-10-28T19:15:08.728499602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbbcc70b-a5c7-4a36-9a9e-75f215a50f4e",
  "code": "320747",
  "device_ref": "sandbox-29061"
}
```

```json
{
  "session_id": "24ffef33-07c1-4ecb-81fd-adf5548e598a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTgwOSwiaWF0IjoxNzkzMjE0OTA5LCJqdGkiOiJkYWYxMjcwMS1lNjNiLTQzMDYtOGY1Zi1jYWEzNjA4YWM5NGQiLCJzaWQiOiIyNGZmZWYzMy0wN2MxLTRlY2ItODFmZC1hZGY1NTQ4ZTU5OGEifQ.GOztHCBh2iWA0maFpn2Vnnfm6yVeWip3WCvzVSSG4vc",
  "access_expires_at": "2026-10-28T19:30:09.033254595Z",
  "refresh_token": "tWiRHl9L_ZAoYiCnCaTMXjXdtOVvHEop9hngDtFQXTY",
  "refresh_expires_at": "2026-11-27T19:15:09.032597472Z",
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
  "command_id": "87033b80-6fd4-44d9-a1ad-7de6163efbb2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:09Z",
    "sequence": 1793214909581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:09.599602Z",
  "last_location_at": "2026-10-28T19:15:09.599602Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674413141",
  "device_ref": "sandbox-22011"
}
```

```json
{
  "challenge_id": "3a3623bd-ad22-4621-8dfe-591c01f8cf38",
  "expires_at": "2026-10-28T19:20:09.880291805Z",
  "resend_available_at": "2026-10-28T19:15:10.880291805Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674413141` → **200**

```json
{
  "phone": "+380674413141",
  "audience": "CLIENT",
  "code": "598602",
  "sent_at": "2026-10-28T19:15:09.882525156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a3623bd-ad22-4621-8dfe-591c01f8cf38",
  "code": "598602",
  "device_ref": "sandbox-22011"
}
```

```json
{
  "session_id": "6a661806-e849-4851-adf9-b4ae01df5693",
  "subject": {
    "type": "CLIENT",
    "id": "9e2d3c3d-fef1-4c87-b7f1-58f92bc5fc9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTJkM2MzZC1mZWYxLTRjODctYjdmMS01OGY5MmJjNWZjOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODEwLCJpYXQiOjE3OTMyMTQ5MTAsImp0aSI6IjgwM2JjYzg1LWM3NzEtNDE2Mi1hMTA1LTI1Y2JiZThjNDJlMiIsInNpZCI6IjZhNjYxODA2LWU4NDktNDg1MS1hZGY5LWI0YWUwMWRmNTY5MyJ9.ouD_13bQkFDDsri6hPMGRUE0uvxte8kLFiHZZyxdWfU",
  "access_expires_at": "2026-10-28T19:30:10.179232696Z",
  "refresh_token": "STXTbutBRVD4joj915hbuEfLqi1f5zoecOg0kxbjO-8",
  "refresh_expires_at": "2026-11-27T19:15:10.178711425Z",
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
  "command_id": "d42fe63a-ddf9-46cc-8181-ea91d4924c7c",
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
  "id": "e075f7ad-5921-46a6-a242-693881713c7a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:10.726616Z",
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
  "command_id": "be7f6ec7-29ba-4c4c-9431-93e9ee53dc8e",
  "platform": "ANDROID",
  "token": "sandbox-driver-5a2f0f6b-5e8a-477a-a4dc-8ac30f323712"
}
```

```json
{
  "id": "63a64571-817f-461a-ac92-3f2bc92b83d5",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T19:15:11.017754Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "a55b9ff7-4e54-494b-a027-5bf96f8b96ed",
  "platform": "ANDROID",
  "token": "sandbox-rider-26228b00-202c-492e-8d0d-68d8d530f35c"
}
```

```json
{
  "id": "1869abe1-bfde-4bab-95c9-641c0dab81ff",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T19:15:11.300648Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a2c82a23-2ba9-4c4b-8f6c-7ad7a8d020c8",
  "quote_id": "e075f7ad-5921-46a6-a242-693881713c7a",
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
  "id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e2d3c3d-fef1-4c87-b7f1-58f92bc5fc9d",
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
  "created_at": "2026-10-28T19:15:11.589929Z",
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
    "id": "8f3e3fad-e5e7-4747-93f8-ed1db648748a",
    "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
    "expires_at": "2026-10-28T19:15:26.593211Z",
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

`POST /api/driver/v1/offers/8f3e3fad-e5e7-4747-93f8-ed1db648748a/accept` → **200**

```json
{
  "command_id": "49fd48da-9a32-481a-8dae-5cab41c5e9ef"
}
```

```json
{
  "id": "574011b9-f99a-4f87-9862-a78f401dcac4",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "24184e1a-79a7-4bb0-87dd-af2ed584cc2a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T19:15:11.566Z` → **200**

```json
[
  {
    "at": "2026-10-28T19:15:12.286724662Z",
    "token_suffix": "323712",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "ddace67e-60f4-42f7-9776-ac4cc7c0e50d",
      "order_version": "2",
      "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674413141&after=2026-10-28T19:15:11.566Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674413141&after=2026-10-28T19:15:11.566Z` → **200**

```json
[
  {
    "at": "2026-10-28T19:15:13.294051983Z",
    "token_suffix": "30f35c",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "39abd1de-6488-41c0-aa76-f05f5b9b9331",
      "order_version": "3",
      "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/351857ab-3e59-491d-b5cc-4345eecc03f8/messages` → **201**

```json
{
  "command_id": "b4e8b5a7-8a5f-4763-b383-217dcce77c1c",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "70e64751-7ece-476f-a40f-4bea605c4298",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T19:15:13.526522548Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24184e1a-79a7-4bb0-87dd-af2ed584cc2a",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "assignment_id": "574011b9-f99a-4f87-9862-a78f401dcac4",
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

`POST /api/driver/v1/trips/24184e1a-79a7-4bb0-87dd-af2ed584cc2a/messages` → **201**

```json
{
  "command_id": "9be3560c-faaf-416b-854b-4c75267778ea",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "e8ddca1d-a212-4990-b6ad-737185c791a9",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T19:15:14.071901667Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/351857ab-3e59-491d-b5cc-4345eecc03f8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/24184e1a-79a7-4bb0-87dd-af2ed584cc2a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674413141"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/fe0092f1-9fac-43a5-890f-4ea5ed528811/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:14Z",
    "sequence": 1793214914877
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:14.895565Z",
  "last_location_at": "2026-10-28T19:15:14.895565Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24184e1a-79a7-4bb0-87dd-af2ed584cc2a",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "assignment_id": "574011b9-f99a-4f87-9862-a78f401dcac4",
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

`POST /api/driver/v1/trips/24184e1a-79a7-4bb0-87dd-af2ed584cc2a/arrive` → **200**

```json
{
  "command_id": "8c17e2ff-0937-4614-bc29-d41edeab5cf4",
  "expected_version": 0
}
```

```json
{
  "id": "24184e1a-79a7-4bb0-87dd-af2ed584cc2a",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "assignment_id": "574011b9-f99a-4f87-9862-a78f401dcac4",
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
  "arrived_at": "2026-10-28T19:15:15.456903Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/24184e1a-79a7-4bb0-87dd-af2ed584cc2a/start` → **200**

```json
{
  "command_id": "209eb43c-6a10-4c88-85a3-a466a310eabc",
  "expected_version": 1
}
```

```json
{
  "id": "24184e1a-79a7-4bb0-87dd-af2ed584cc2a",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "assignment_id": "574011b9-f99a-4f87-9862-a78f401dcac4",
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
  "arrived_at": "2026-10-28T19:15:15.456903Z",
  "started_at": "2026-10-28T19:15:15.741918Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fe0092f1-9fac-43a5-890f-4ea5ed528811/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:16Z",
    "sequence": 1793214916246
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:16.043018Z",
  "last_location_at": "2026-10-28T19:15:16.043018Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/24184e1a-79a7-4bb0-87dd-af2ed584cc2a/complete` → **200**

```json
{
  "command_id": "8df48c74-301f-4811-8c57-3f5f77a8ba9f",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:15:16Z",
  "cash_received": true
}
```

```json
{
  "id": "24184e1a-79a7-4bb0-87dd-af2ed584cc2a",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "assignment_id": "574011b9-f99a-4f87-9862-a78f401dcac4",
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
  "arrived_at": "2026-10-28T19:15:15.456903Z",
  "started_at": "2026-10-28T19:15:15.741918Z",
  "completed_at": "2026-10-28T19:15:16.331383Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/351857ab-3e59-491d-b5cc-4345eecc03f8` → **200**

```json
{
  "id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9e2d3c3d-fef1-4c87-b7f1-58f92bc5fc9d",
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
    "id": "574011b9-f99a-4f87-9862-a78f401dcac4",
    "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "24184e1a-79a7-4bb0-87dd-af2ed584cc2a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:15:11.589929Z",
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
    "id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
    "short_number": 11,
    "status": "FULFILLED",
    "created_at": "2026-10-28T19:15:11.589929Z",
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
    "id": "24184e1a-79a7-4bb0-87dd-af2ed584cc2a",
    "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
    "order_short_number": 11,
    "created_at": "2026-10-28T19:15:12.1566Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "70f4ddbe-65a0-4e78-b612-7ed9830f775f",
    "order_id": "ff5dba4d-e4fc-47f8-81fd-b8f0cbb94b6e",
    "order_short_number": 7,
    "created_at": "2026-10-28T19:14:10.838665Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8dc2ae25-b858-4a9b-9e81-a256297e699e",
    "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
    "order_short_number": 2,
    "created_at": "2026-10-28T19:13:26.493919Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "85f96a7f-f01d-4c73-adbd-e3232bae434f",
    "order_id": "08269044-5f3d-427d-80e3-4e931a8d4959",
    "order_short_number": 1,
    "created_at": "2026-10-28T19:13:07.189813Z",
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
      "balance_minor": 7257,
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
        "trips": 4,
        "fare_minor": 42068,
        "commission_minor": 6312,
        "driver_share_minor": 35756,
        "cash_minor": 28499,
        "cashless_minor": 13569,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": 7257
      }
    }
  ],
  "total": {
    "trips": 4,
    "fare_minor": 42068,
    "commission_minor": 6312,
    "driver_share_minor": 35756,
    "cash_minor": 28499,
    "cashless_minor": 13569,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": 7257
  },
  "balance_minor": 7257
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/351857ab-3e59-491d-b5cc-4345eecc03f8/tip` → **200**

```json
{
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
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
  "available_until": "2026-10-29T19:15:16.331383Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/351857ab-3e59-491d-b5cc-4345eecc03f8/tip` → **201**

```json
{
  "command_id": "d82560f2-223c-48e2-9083-229d3c8b4d16",
  "amount_minor": 1100
}
```

```json
{
  "id": "a4852fca-2676-4667-96b9-b0e77de3964a",
  "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T19:15:21.342806Z"
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
  "session_id": "19c05c61-146b-45e4-b7fb-2437e76039c4",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4MjEsImlhdCI6MTc5MzIxNDkyMSwianRpIjoiMmY3MThhMWQtODkzNS00MzQ3LTlmNGQtOTFjNzlmZjIxZTdlIiwic2lkIjoiMTljMDVjNjEtMTQ2Yi00NWU0LWI3ZmItMjQzN2U3NjAzOWM0In0.t3O4JMAMaQ1wJV_r3Mrw0HwOyqYzGseCHVlOY6S34jE",
  "access_expires_at": "2026-10-28T19:30:21.913380964Z",
  "refresh_token": "fW1IPAelqmp7jAR8f2gysKR4YIgrdWcEooobPSHu_ng",
  "refresh_expires_at": "2026-10-29T07:15:21.912841706Z",
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
        "created": 11,
        "fulfilled": 6,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "PHONE": 1,
          "APP": 10
        },
        "by_payment": {
          "CASH": 10,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 3,
          "STAFF": 1
        }
      }
    }
  ],
  "total": {
    "created": 11,
    "fulfilled": 6,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "PHONE": 1,
      "APP": 10
    },
    "by_payment": {
      "CASH": 10,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 3,
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
  "generated_at": "2026-10-28T19:15:22.189696482Z"
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
        "trips": 6,
        "fares_minor": 74662,
        "service_rides_minor": 0,
        "commission_minor": 11202,
        "driver_share_minor": 63460,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 28499,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 6,
    "fares_minor": 74662,
    "service_rides_minor": 0,
    "commission_minor": 11202,
    "driver_share_minor": 63460,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 28499,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-28T19:15:22.47675939Z"
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
  "session_id": "4d286cbc-dda6-4b2a-a1ed-7b3e91caf6af",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4MjMsImlhdCI6MTc5MzIxNDkyMywianRpIjoiYmQ3MDdlYjktNmI3My00YzY0LTgxZWQtZThlMmViZjUxODc2Iiwic2lkIjoiNGQyODZjYmMtZGRhNi00YjJhLWExZWQtN2IzZTkxY2FmNmFmIn0.lCYgVkcERvX5aQzBpJSj1QBXMvGWpSbpeNOjC1W3e4g",
  "access_expires_at": "2026-10-28T19:30:23.064651194Z",
  "refresh_token": "CC7LZZ8RXrPSDsZgpSvRDSFHPrb5VMzhH4gb732lmyg",
  "refresh_expires_at": "2026-10-29T07:15:23.064067112Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/351857ab-3e59-491d-b5cc-4345eecc03f8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:15:11.590381Z",
      "actor": {
        "type": "CLIENT",
        "id": "9e2d3c3d-fef1-4c87-b7f1-58f92bc5fc9d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
        "quote_id": "e075f7ad-5921-46a6-a242-693881713c7a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f90995db-d1b6-4f2b-a3f6-eba2b4b27764"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:15:11.592401Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
        "attempt_id": "e8276e20-adc0-46e0-9325-6acf5cf03441",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f90995db-d1b6-4f2b-a3f6-eba2b4b27764"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:15:11.595379Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8f3e3fad-e5e7-4747-93f8-ed1db648748a",
        "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "f90995db-d1b6-4f2b-a3f6-eba2b4b27764"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:15:12.158612Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8f3e3fad-e5e7-4747-93f8-ed1db648748a",
        "order_id": "351857ab-3e59-491d-b5cc-4345eecc03f8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "574011b9-f99a-4f87-9862-a78f401dcac4"
      },
      "correlation_id": "2ff923d7-95b2-418b-9d1e-f17c9952ab6c"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T19:15:23.629999149Z",
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
      "last_location_at": "2026-10-28T19:15:16.043018Z",
      "order_id": null
    }
  ]
}
```

Done: order 351857ab-3e59-491d-b5cc-4345eecc03f8.

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
  "session_id": "a8ccca38-a7cc-4ce5-9df7-0e47e1cc4e3f",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4MjQsImlhdCI6MTc5MzIxNDkyNCwianRpIjoiYWJkOTI1YzEtM2QxYi00N2Q0LWE2YmUtYjkxYWQwOTM1MWZlIiwic2lkIjoiYThjY2NhMzgtYTdjYy00Y2U1LTlkZjctMGU0N2UxY2M0ZTNmIn0.CpVa6NLZnv5_tOg3g2AzBb200qRUlwvrFZJ7cpDaXCE",
  "access_expires_at": "2026-10-28T19:30:24.219227455Z",
  "refresh_token": "oLUcPgEYvIJMpdDilxD8Nz7Ou3x7pOfQwpjUU8c0FWQ",
  "refresh_expires_at": "2026-10-29T07:15:24.218696732Z",
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
  "command_id": "5cf27f90-c943-408b-ab4e-c57f071ce7b8",
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
  "timestamp": "2026-10-28T19:15:25.000+0000",
  "channel": {
    "id": "1730052000.2476322881",
    "linkedid": "1730052000.2476322881",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670470648"
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
  "timestamp": "2026-10-28T19:15:25.000+0000",
  "channel": {
    "id": "1730052000.2476322881",
    "linkedid": "1730052000.2476322881",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670470648"
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
  "session_id": "6e8905e1-28a0-4a7a-ab7b-ab2f96b62c7e",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4MjUsImlhdCI6MTc5MzIxNDkyNSwianRpIjoiODAxYTVjYmQtYjkyYy00Y2FjLWE1MTItNGI1NWIxYTU5OTNkIiwic2lkIjoiNmU4OTA1ZTEtMjhhMC00YTdhLWFiN2ItYWIyZjk2YjYyYzdlIn0.0Zz0ZU_OLyuO5bLRO-49nMdx7Sd_ModmtCu8JkgCA18",
  "access_expires_at": "2026-10-28T19:30:25.383068567Z",
  "refresh_token": "A4lSymeOGxYH25pC-rsEuvI-81T62ZC4l40-yKcdo9M",
  "refresh_expires_at": "2026-10-29T07:15:25.382461559Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "3761ce29-5ed0-4886-ab37-d94ee79da9ca",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670470648",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:15:25Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/3761ce29-5ed0-4886-ab37-d94ee79da9ca/answer` → **200**

```json
{
  "command_id": "ef659b67-404a-49f7-b303-aa367a6aa5ff"
}
```

```json
{
  "id": "3761ce29-5ed0-4886-ab37-d94ee79da9ca",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670470648",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "order_ids": [],
  "started_at": "2026-10-28T19:15:25Z",
  "answered_at": "2026-10-28T19:15:25.947109Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2476322881",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2f622e07-c354-4f31-93d4-b16e54978616",
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
  "id": "39288723-c13c-48a0-be3f-e6de6d0f86ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:26.257992Z",
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
  "command_id": "ae3861b7-bf75-41ef-9f2d-4d3b22dd33bf",
  "quote_id": "39288723-c13c-48a0-be3f-e6de6d0f86ef",
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
    "phone": "+380670470648"
  },
  "call_id": "3761ce29-5ed0-4886-ab37-d94ee79da9ca"
}
```

```json
{
  "id": "0ecac07e-5b52-4c06-a435-6e01506562a0",
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
  "created_at": "2026-10-28T19:15:26.548715Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670470648"
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
    "id": "1730052000.2476322881",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3761ce29-5ed0-4886-ab37-d94ee79da9ca",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670470648",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [
        "0ecac07e-5b52-4c06-a435-6e01506562a0"
      ],
      "started_at": "2026-10-28T19:15:25Z",
      "answered_at": "2026-10-28T19:15:25.947109Z",
      "ended_at": "2026-10-28T19:15:26.864875Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "86ff81b7-e4d6-4ed3-97f2-6be3fdef7b66",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676666966",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [],
      "started_at": "2026-10-28T19:13:15.293105Z",
      "answered_at": "2026-10-28T19:13:15.625221Z",
      "ended_at": "2026-10-28T19:13:15.9608Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:13:22.792399Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/0ecac07e-5b52-4c06-a435-6e01506562a0` → **200**

```json
{
  "id": "0ecac07e-5b52-4c06-a435-6e01506562a0",
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
  "created_at": "2026-10-28T19:15:26.548715Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670470648"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/0ecac07e-5b52-4c06-a435-6e01506562a0` → **200**

```json
{
  "id": "0ecac07e-5b52-4c06-a435-6e01506562a0",
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
  "created_at": "2026-10-28T19:15:26.548715Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670470648"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0ecac07e-5b52-4c06-a435-6e01506562a0/cancel` → **200**

```json
{
  "command_id": "8bf1827a-b882-429d-9fd5-f0191de717cc",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0ecac07e-5b52-4c06-a435-6e01506562a0",
  "short_number": 12,
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
  "created_at": "2026-10-28T19:15:26.548715Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670470648"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 3761ce29-5ed0-4886-ab37-d94ee79da9ca with order 0ecac07e-5b52-4c06-a435-6e01506562a0.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10589"
}
```

```json
{
  "challenge_id": "ff20b021-0f8b-4049-9d36-26ecaa0205b7",
  "expires_at": "2026-10-28T19:20:28.092257847Z",
  "resend_available_at": "2026-10-28T19:15:29.092257847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "020426",
  "sent_at": "2026-10-28T19:15:28.094566987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff20b021-0f8b-4049-9d36-26ecaa0205b7",
  "code": "020426",
  "device_ref": "sandbox-10589"
}
```

```json
{
  "session_id": "b7381fa0-dd3a-403e-841c-79934e1e6608",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTgyOCwiaWF0IjoxNzkzMjE0OTI4LCJqdGkiOiIzYmFiYzk4ZC0yOWM1LTQyNTgtOTM3Ny05NDBiNzMzMWExYjYiLCJzaWQiOiJiNzM4MWZhMC1kZDNhLTQwM2UtODQxYy03OTkzNGUxZTY2MDgifQ.epHetlbaUThsgDLd-CH04YNYtgRFTOjTO6D1trji1jI",
  "access_expires_at": "2026-10-28T19:30:28.384613552Z",
  "refresh_token": "YDA-ldYx8Z2vo6mUfeNTBVRJvTd9snzpZ9KW-vp1M8k",
  "refresh_expires_at": "2026-11-27T19:15:28.384055791Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:16.043018Z",
  "last_location_at": "2026-10-28T19:15:16.043018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fe0092f1-9fac-43a5-890f-4ea5ed528811/handover` → **200**

```json
{
  "command_id": "b640a0bc-9cc1-402f-882f-4810f01abb78",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:16.043018Z",
  "last_location_at": "2026-10-28T19:15:16.043018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fe0092f1-9fac-43a5-890f-4ea5ed528811/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:29Z",
    "sequence": 1793214929217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:29.236386Z",
  "last_location_at": "2026-10-28T19:15:29.236386Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667674196",
  "device_ref": "sandbox-6372"
}
```

```json
{
  "challenge_id": "d9075c9c-168b-4d26-9e3c-adc4041fa907",
  "expires_at": "2026-10-28T19:20:29.514592937Z",
  "resend_available_at": "2026-10-28T19:15:30.514592937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667674196` → **200**

```json
{
  "phone": "+380667674196",
  "audience": "CLIENT",
  "code": "501623",
  "sent_at": "2026-10-28T19:15:29.516693311Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9075c9c-168b-4d26-9e3c-adc4041fa907",
  "code": "501623",
  "device_ref": "sandbox-6372"
}
```

```json
{
  "session_id": "d5c0da1a-89f7-4457-97bf-b11f094de46a",
  "subject": {
    "type": "CLIENT",
    "id": "466861a2-e048-47da-9021-2d23efa336df"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NjY4NjFhMi1lMDQ4LTQ3ZGEtOTAyMS0yZDIzZWZhMzM2ZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODI5LCJpYXQiOjE3OTMyMTQ5MjksImp0aSI6ImU4YzAzMzEyLWM2OGQtNDI5NC04NDRlLTliM2ZmMjVkMjk5NyIsInNpZCI6ImQ1YzBkYTFhLTg5ZjctNDQ1Ny05N2JmLWIxMWYwOTRkZTQ2YSJ9.hMGYUun-J1oCsnjZ-jwKBCilO5nC1PfrsXg_0b23czU",
  "access_expires_at": "2026-10-28T19:30:29.809162978Z",
  "refresh_token": "1C0zBwJOyvKM4tEm3ywXMInG0PR5-93r50Yj4zytKxo",
  "refresh_expires_at": "2026-11-27T19:15:29.808606944Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "36381c50-0105-455a-bd75-741a19238d8d",
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
  "id": "a1546a63-27bb-41da-a7fe-ba957e0802c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:30.091019Z",
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
  "command_id": "0f5ce63d-d293-48bc-87fe-0409e6191fdf",
  "quote_id": "a1546a63-27bb-41da-a7fe-ba957e0802c2",
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
  "id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "466861a2-e048-47da-9021-2d23efa336df",
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
  "created_at": "2026-10-28T19:15:30.378351Z",
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
    "id": "ffacb07d-9042-4919-aac4-f9d04092a650",
    "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
    "expires_at": "2026-10-28T19:15:45.381424Z",
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

`POST /api/driver/v1/offers/ffacb07d-9042-4919-aac4-f9d04092a650/accept` → **200**

```json
{
  "command_id": "75a23bcd-8148-43ca-b71b-6faec2ed1036"
}
```

```json
{
  "id": "643bf2c6-cee5-40d1-967b-854d730fb233",
  "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a15d3c4f-412e-49f2-8054-295b391a1d23",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a15d3c4f-412e-49f2-8054-295b391a1d23",
  "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
  "assignment_id": "643bf2c6-cee5-40d1-967b-854d730fb233",
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

`POST /api/driver/v1/work-sessions/fe0092f1-9fac-43a5-890f-4ea5ed528811/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:31Z",
    "sequence": 1793214931498
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:31.517787Z",
  "last_location_at": "2026-10-28T19:15:31.517787Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a15d3c4f-412e-49f2-8054-295b391a1d23/arrive` → **200**

```json
{
  "command_id": "83c071d3-3f4e-43d1-aaf4-e32e759091cd",
  "expected_version": 0
}
```

```json
{
  "id": "a15d3c4f-412e-49f2-8054-295b391a1d23",
  "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
  "assignment_id": "643bf2c6-cee5-40d1-967b-854d730fb233",
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
  "arrived_at": "2026-10-28T19:15:31.804823Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a15d3c4f-412e-49f2-8054-295b391a1d23/start` → **200**

```json
{
  "command_id": "9bf9a111-9906-4852-b5ae-6e950f9f02ca",
  "expected_version": 1
}
```

```json
{
  "id": "a15d3c4f-412e-49f2-8054-295b391a1d23",
  "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
  "assignment_id": "643bf2c6-cee5-40d1-967b-854d730fb233",
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
  "arrived_at": "2026-10-28T19:15:31.804823Z",
  "started_at": "2026-10-28T19:15:32.100495Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/fe0092f1-9fac-43a5-890f-4ea5ed528811/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:32Z",
    "sequence": 1793214932378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:32.39705Z",
  "last_location_at": "2026-10-28T19:15:32.39705Z",
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
  "device_ref": "sandbox-20905"
}
```

```json
{
  "challenge_id": "189ed227-0c51-4218-81a9-cd65d54cfb72",
  "expires_at": "2026-10-28T19:20:32.666239551Z",
  "resend_available_at": "2026-10-28T19:15:33.666239551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "386405",
  "sent_at": "2026-10-28T19:15:32.668679351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "189ed227-0c51-4218-81a9-cd65d54cfb72",
  "code": "386405",
  "device_ref": "sandbox-20905"
}
```

```json
{
  "session_id": "1fb1660d-9493-47fc-bd85-ce2eb51804af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTgzMywiaWF0IjoxNzkzMjE0OTMzLCJqdGkiOiJhMDdlOTJhMC1lOTVjLTQwZDktOTk2YS1lYmI5YzJlOTU0NGIiLCJzaWQiOiIxZmIxNjYwZC05NDkzLTQ3ZmMtYmQ4NS1jZTJlYjUxODA0YWYifQ.MhBHYld8SUEoQ2IdCwR_41MYcXKcLyfy5NZSeE6auTU",
  "access_expires_at": "2026-10-28T19:30:33.006763386Z",
  "refresh_token": "8C8UWXW-mRzNQyzN2SGI95TKV6e0cZomxraGNCyklUc",
  "refresh_expires_at": "2026-11-27T19:15:33.006224166Z",
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
  "command_id": "93f732cd-fe10-4e85-811e-d5c29b24e5f9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:33Z",
    "sequence": 1793214933629
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a11fda03-5bc2-4a8f-be88-8d6d1c3ebfef",
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
  "last_heartbeat_at": "2026-10-28T19:15:33.649063Z",
  "last_location_at": "2026-10-28T19:15:33.649063Z",
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
  "session_id": "05b19f78-34c0-49fd-817c-bd7fa54d7020",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4MzQsImlhdCI6MTc5MzIxNDkzNCwianRpIjoiZTZlZjhjMWUtYWU2Ny00MGEwLWFkNzItOWE2ZjYxYWRlYjQ1Iiwic2lkIjoiMDViMTlmNzgtMzRjMC00OWZkLTgxN2MtYmQ3ZmE1NGQ3MDIwIn0.UKYyr445jIinEiHd1C6UCtd4cnzx71vw3Ok1i-oQD-M",
  "access_expires_at": "2026-10-28T19:30:34.263482863Z",
  "refresh_token": "H6rWMvXgvKrpFKI974hLtoNUwSyHmzuD0TyNBpJcspM",
  "refresh_expires_at": "2026-10-29T07:15:34.262949894Z",
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
  "session_id": "691eaf9a-1d00-4295-88d7-31cc57cd118b",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4MzQsImlhdCI6MTc5MzIxNDkzNCwianRpIjoiOWRiZWU5ODgtNWI4OS00MzQ5LWI2ZjgtY2I2NjM5YzM3MDA2Iiwic2lkIjoiNjkxZWFmOWEtMWQwMC00Mjk1LTg4ZDctMzFjYzU3Y2QxMThiIn0.jsRmwBTtF3GoksvvIx1Bh6jTuCW_SreY5OPDmfD6dY8",
  "access_expires_at": "2026-10-28T19:30:34.826052231Z",
  "refresh_token": "b3SWYui5D52gn6KkRCnYz5CI_U8dlkWFMSr5YE8iCB8",
  "refresh_expires_at": "2026-10-29T07:15:34.825527007Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8c564bcb-2cf3-4716-8943-70bc1880ede0` → **200**

```json
{
  "id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
  "short_number": 13,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "466861a2-e048-47da-9021-2d23efa336df",
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
    "id": "643bf2c6-cee5-40d1-967b-854d730fb233",
    "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a15d3c4f-412e-49f2-8054-295b391a1d23",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T19:15:30.378351Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8c564bcb-2cf3-4716-8943-70bc1880ede0/interrupt` → **200**

```json
{
  "command_id": "2b596672-0b90-479d-9e59-e63e796f9d0d",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
    "short_number": 13,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "466861a2-e048-47da-9021-2d23efa336df",
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
      "id": "643bf2c6-cee5-40d1-967b-854d730fb233",
      "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "a15d3c4f-412e-49f2-8054-295b391a1d23",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T19:15:30.378351Z",
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
    "id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
    "short_number": 14,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "466861a2-e048-47da-9021-2d23efa336df",
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
    "id": "e805b5a5-ec54-477d-9f61-80090ea3ce63",
    "order_id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
    "expires_at": "2026-10-28T19:15:50.415185Z",
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

`POST /api/driver/v1/offers/e805b5a5-ec54-477d-9f61-80090ea3ce63/accept` → **200**

```json
{
  "command_id": "ecf5865e-89ac-4d90-be3c-e6566ae27b1d"
}
```

```json
{
  "id": "5a641c14-db4a-477c-b34f-05d0b78db03f",
  "order_id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f7570bcd-76bf-4e4d-baa0-8106a351f375",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f7570bcd-76bf-4e4d-baa0-8106a351f375",
  "order_id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
  "assignment_id": "5a641c14-db4a-477c-b34f-05d0b78db03f",
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
  "session_id": "a11fda03-5bc2-4a8f-be88-8d6d1c3ebfef",
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
  "last_heartbeat_at": "2026-10-28T19:15:33.649063Z",
  "last_location_at": "2026-10-28T19:15:33.649063Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a11fda03-5bc2-4a8f-be88-8d6d1c3ebfef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:36Z",
    "sequence": 1793214936832
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a11fda03-5bc2-4a8f-be88-8d6d1c3ebfef",
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
  "last_heartbeat_at": "2026-10-28T19:15:36.851323Z",
  "last_location_at": "2026-10-28T19:15:36.851323Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f7570bcd-76bf-4e4d-baa0-8106a351f375/arrive` → **200**

```json
{
  "command_id": "9a338eb6-6ae5-4845-b070-bc4f0b296223",
  "expected_version": 0
}
```

```json
{
  "id": "f7570bcd-76bf-4e4d-baa0-8106a351f375",
  "order_id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
  "assignment_id": "5a641c14-db4a-477c-b34f-05d0b78db03f",
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
  "arrived_at": "2026-10-28T19:15:37.140132Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f7570bcd-76bf-4e4d-baa0-8106a351f375/start` → **200**

```json
{
  "command_id": "b492e5c1-e527-4bb8-aa22-5ebf6f9c608e",
  "expected_version": 1
}
```

```json
{
  "id": "f7570bcd-76bf-4e4d-baa0-8106a351f375",
  "order_id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
  "assignment_id": "5a641c14-db4a-477c-b34f-05d0b78db03f",
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
  "arrived_at": "2026-10-28T19:15:37.140132Z",
  "started_at": "2026-10-28T19:15:37.429455Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f7570bcd-76bf-4e4d-baa0-8106a351f375/complete` → **200**

```json
{
  "command_id": "52026fba-73be-409c-9e5b-22b187712bb4",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:15:37Z"
}
```

```json
{
  "id": "f7570bcd-76bf-4e4d-baa0-8106a351f375",
  "order_id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
  "assignment_id": "5a641c14-db4a-477c-b34f-05d0b78db03f",
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
  "arrived_at": "2026-10-28T19:15:37.140132Z",
  "started_at": "2026-10-28T19:15:37.429455Z",
  "completed_at": "2026-10-28T19:15:37.716266Z",
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
    "id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-28T19:15:35.405666Z",
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
    "id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
    "short_number": 13,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:15:30.378351Z",
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
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/8c564bcb-2cf3-4716-8943-70bc1880ede0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:15:30.378883Z",
      "actor": {
        "type": "CLIENT",
        "id": "466861a2-e048-47da-9021-2d23efa336df",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
        "quote_id": "a1546a63-27bb-41da-a7fe-ba957e0802c2",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "84b9ee2d-1247-4b71-a8e8-82045e3c6cfc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:15:30.380741Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
        "attempt_id": "4f614927-9d19-424b-befd-94227e2add37",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "84b9ee2d-1247-4b71-a8e8-82045e3c6cfc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:15:30.383362Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ffacb07d-9042-4919-aac4-f9d04092a650",
        "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "84b9ee2d-1247-4b71-a8e8-82045e3c6cfc"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:15:30.95352Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ffacb07d-9042-4919-aac4-f9d04092a650",
        "order_id": "8c564bcb-2cf3-4716-8943-70bc1880ede0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "643bf2c6-cee5-40d1-967b-854d730fb233"
      },
      "correlation_id": "d65463d1-5802-4277-85e6-a070fb66bf56"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/721e4a8f-af2d-48e8-94f9-b01b4ca38bb0/tip` → **200**

```json
{
  "order_id": "721e4a8f-af2d-48e8-94f9-b01b4ca38bb0",
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
  "available_until": "2026-10-29T19:15:37.716266Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/721e4a8f-af2d-48e8-94f9-b01b4ca38bb0/tip` → **409**

```json
{
  "command_id": "93633d18-e91c-4e17-8d94-489c12e81aa0",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/721e4a8f-af2d-48e8-94f9-b01b4ca38bb0/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "52407693-fb7c-4290-9004-700afc7d4fdf"
}
```

Done: interrupted 8c564bcb-2cf3-4716-8943-70bc1880ede0, follow-up 721e4a8f-af2d-48e8-94f9-b01b4ca38bb0.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fe0092f1-9fac-43a5-890f-4ea5ed528811",
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
  "last_heartbeat_at": "2026-10-28T19:15:32.39705Z",
  "last_location_at": "2026-10-28T19:15:32.39705Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fe0092f1-9fac-43a5-890f-4ea5ed528811/close` → **200**

```json
{
  "command_id": "4c14ba9c-6030-40fb-a094-a73a259232e2",
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
  "session_id": "a11fda03-5bc2-4a8f-be88-8d6d1c3ebfef",
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
  "last_heartbeat_at": "2026-10-28T19:15:36.851323Z",
  "last_location_at": "2026-10-28T19:15:36.851323Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a11fda03-5bc2-4a8f-be88-8d6d1c3ebfef/close` → **200**

```json
{
  "command_id": "7691fc04-464e-4faf-b17e-782ef9d4ceb8",
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
  "session_id": "68e86efc-b42b-4b9e-8313-cae9002313af",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4NDMsImlhdCI6MTc5MzIxNDk0MywianRpIjoiMDQwMDdiNzEtODNhNi00NWEyLWE4NjgtOGZjMzJmNGE3YzBjIiwic2lkIjoiNjhlODZlZmMtYjQyYi00YjllLTgzMTMtY2FlOTAwMjMxM2FmIn0.8sv6iOYYrYQGQfv4H2UbbFvyfX18DQ2Z10qzVAHGyDo",
  "access_expires_at": "2026-10-28T19:30:43.870197908Z",
  "refresh_token": "4nAuxN87XZzi8jcYG-LaZQW2jgdjWT0N5GpLbF2Tq4o",
  "refresh_expires_at": "2026-10-29T07:15:43.869643459Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a47e4b9d-2ad1-4be8-9189-511a0564c990",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:15:44Z"
}
```

```json
{
  "id": "b3a7f2f6-971b-4469-a9b9-d7be3542052d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:15:44Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b3a7f2f6-971b-4469-a9b9-d7be3542052d/publish` → **200**

```json
{
  "command_id": "eda263ca-94f6-4349-980a-0c7386d081bd",
  "expected_version": 0
}
```

```json
{
  "id": "b3a7f2f6-971b-4469-a9b9-d7be3542052d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:15:44.456625Z",
  "published_at": "2026-10-28T19:15:44.456625Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "b3a7f2f6-971b-4469-a9b9-d7be3542052d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T19:15:44.456625Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635242875",
  "device_ref": "sandbox-1186"
}
```

```json
{
  "challenge_id": "6e52a7dc-9ac7-4dd6-b669-b2086cdcaca2",
  "expires_at": "2026-10-28T19:20:45.007332705Z",
  "resend_available_at": "2026-10-28T19:15:46.007332705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635242875` → **200**

```json
{
  "phone": "+380635242875",
  "audience": "CLIENT",
  "code": "929451",
  "sent_at": "2026-10-28T19:15:45.009751906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e52a7dc-9ac7-4dd6-b669-b2086cdcaca2",
  "code": "929451",
  "device_ref": "sandbox-1186"
}
```

```json
{
  "session_id": "6aa4567e-e7ce-4d70-911f-96ee5f2d1fb8",
  "subject": {
    "type": "CLIENT",
    "id": "4fdfa1fe-8fc0-48d7-a658-3420904582b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZmRmYTFmZS04ZmMwLTQ4ZDctYTY1OC0zNDIwOTA0NTgyYjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODQ1LCJpYXQiOjE3OTMyMTQ5NDUsImp0aSI6IjMxMTI4NDBmLWU2NzktNGY5ZC1iNWM1LWQwOWVkZDQ0YWJjZiIsInNpZCI6IjZhYTQ1NjdlLWU3Y2UtNGQ3MC05MTFmLTk2ZWU1ZjJkMWZiOCJ9.1BCfn7aBuB--VBkmtyUk1P1Qa8dnvQaaRQu0y1V5nuM",
  "access_expires_at": "2026-10-28T19:30:45.325745974Z",
  "refresh_token": "JoI2S2nrkvZxZ1cC4PDMu8J2eagzSsiD8Mpv-lwgJLA",
  "refresh_expires_at": "2026-11-27T19:15:45.325184132Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "b3a7f2f6-971b-4469-a9b9-d7be3542052d",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T19:15:44.456625Z",
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
  "command_id": "fceff3b1-c18d-4953-b6b8-fdd5c1a94771",
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
  "id": "17182889-b33c-44ff-b05a-4b9852d2b0db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:45.880850Z",
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
  "command_id": "2425141a-1553-4fdd-8778-c8f5cb84c246",
  "quote_id": "17182889-b33c-44ff-b05a-4b9852d2b0db",
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
  "correlation_id": "561f0fb5-3958-40e2-853d-972b4ecb4e30"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "75174aef-1c71-489e-87b9-17feb1c09ef8",
  "version_id": "b3a7f2f6-971b-4469-a9b9-d7be3542052d",
  "language": "uk"
}
```

```json
{
  "version_id": "b3a7f2f6-971b-4469-a9b9-d7be3542052d",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T19:15:46.445155Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f3e99590-8970-4a89-9d8b-729531520ea2",
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
  "id": "adeebf43-1712-4ee7-934f-bbee1832c675",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:46.727089Z",
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
  "command_id": "2b3cd704-498d-48d6-a554-9cd500a4cb39",
  "quote_id": "adeebf43-1712-4ee7-934f-bbee1832c675",
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
  "id": "297a4f9d-a2e8-4346-a86d-fabe9c21e1dc",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4fdfa1fe-8fc0-48d7-a658-3420904582b4",
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
  "created_at": "2026-10-28T19:15:47.017665Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/297a4f9d-a2e8-4346-a86d-fabe9c21e1dc` → **200**

```json
{
  "id": "297a4f9d-a2e8-4346-a86d-fabe9c21e1dc",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4fdfa1fe-8fc0-48d7-a658-3420904582b4",
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
  "created_at": "2026-10-28T19:15:47.017665Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/297a4f9d-a2e8-4346-a86d-fabe9c21e1dc/cancel` → **200**

```json
{
  "command_id": "fc0c4547-6f21-4fb1-96cb-d2f2983bfb66",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "297a4f9d-a2e8-4346-a86d-fabe9c21e1dc",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4fdfa1fe-8fc0-48d7-a658-3420904582b4",
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
  "created_at": "2026-10-28T19:15:47.017665Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`POST /api/admin/v1/legal-documents/b3a7f2f6-971b-4469-a9b9-d7be3542052d` → **409**

```json
{
  "command_id": "85a4517b-6b87-46a4-aed4-827e44a88459",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:15:47Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/b3a7f2f6-971b-4469-a9b9-d7be3542052d",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "96121d3a-1a20-4e09-8e67-f323fd9bb56d"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2a425a34-308d-466d-9668-158bd4abd98f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:15:48Z"
}
```

```json
{
  "id": "28a854d8-c15b-4a80-96a6-33f2ce6b80a7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:15:48Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/28a854d8-c15b-4a80-96a6-33f2ce6b80a7/publish` → **200**

```json
{
  "command_id": "22f3bb99-51cd-46cd-aaff-9911098ec8a8",
  "expected_version": 0
}
```

```json
{
  "id": "28a854d8-c15b-4a80-96a6-33f2ce6b80a7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:15:48.527311Z",
  "published_at": "2026-10-28T19:15:48.527311Z",
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
  "device_ref": "sandbox-4835"
}
```

```json
{
  "challenge_id": "632f1a03-4b0b-4669-8d15-55b3ba51b167",
  "expires_at": "2026-10-28T19:20:48.815566502Z",
  "resend_available_at": "2026-10-28T19:15:49.815566502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "367430",
  "sent_at": "2026-10-28T19:15:48.817875246Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "632f1a03-4b0b-4669-8d15-55b3ba51b167",
  "code": "367430",
  "device_ref": "sandbox-4835"
}
```

```json
{
  "session_id": "3780a34a-9f4a-4082-84cc-7a8ee4e90068",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTg0OSwiaWF0IjoxNzkzMjE0OTQ5LCJqdGkiOiIwMGI1MzU2YS1hMWZkLTRjNmEtYjlhZC1mYjc1NjliNTUzZjAiLCJzaWQiOiIzNzgwYTM0YS05ZjRhLTQwODItODRjYy03YThlZTRlOTAwNjgifQ.YEtirIg8AuCXi_r6wJ6YjBtfAe7gn_9Tcf62iDAp7M0",
  "access_expires_at": "2026-10-28T19:30:49.113395499Z",
  "refresh_token": "Q3YMMpL_9lLgYkJCjvEO0dvu_k0l3YVmNlnrx16NF6s",
  "refresh_expires_at": "2026-11-27T19:15:49.112807795Z",
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
  "command_id": "d2d5857d-9e1a-4748-9c9a-a34eb02ac639",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:49Z",
    "sequence": 1793214949653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4a818b46-12e9-4628-a3cb-d82a307a164e",
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
  "last_heartbeat_at": "2026-10-28T19:15:49.671408Z",
  "last_location_at": "2026-10-28T19:15:49.671408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677143786",
  "device_ref": "sandbox-13621"
}
```

```json
{
  "challenge_id": "61a821cb-e723-4c96-ac5e-af20c343e734",
  "expires_at": "2026-10-28T19:20:49.951515559Z",
  "resend_available_at": "2026-10-28T19:15:50.951515559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677143786` → **200**

```json
{
  "phone": "+380677143786",
  "audience": "CLIENT",
  "code": "707453",
  "sent_at": "2026-10-28T19:15:49.953675677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61a821cb-e723-4c96-ac5e-af20c343e734",
  "code": "707453",
  "device_ref": "sandbox-13621"
}
```

```json
{
  "session_id": "8564d1b4-e1df-4c46-b8b0-828e0abb5cc0",
  "subject": {
    "type": "CLIENT",
    "id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGRhMGE4Zi0yMDdlLTRiZTQtODgwMS1kZjQ5YzRmYjViMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODUwLCJpYXQiOjE3OTMyMTQ5NTAsImp0aSI6ImZjZDA1ZDVmLTNkMjgtNGRiMi04M2I4LTU4YTZkZTE2ZWMwMiIsInNpZCI6Ijg1NjRkMWI0LWUxZGYtNGM0Ni1iOGIwLTgyOGUwYWJiNWNjMCJ9.19DhuRp6rrs-ygPZ6Up1GN_36Or53Ir_eL-tnEst-RU",
  "access_expires_at": "2026-10-28T19:30:50.252432846Z",
  "refresh_token": "jh0CP59Y5uCbAlueMX9ZUiVNIhU5pUMNAsVPYgJ2jgY",
  "refresh_expires_at": "2026-11-27T19:15:50.251905398Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df515caa-b388-4377-ba7f-9b76eebea757",
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
  "id": "1ad797e0-83a9-4ace-b817-fc0eaa59a297",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:50.535364Z",
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
  "command_id": "0c8e9c29-a5c4-4ead-91a1-ff5cd52e036d",
  "quote_id": "1ad797e0-83a9-4ace-b817-fc0eaa59a297",
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
    "phone": "+380672520719"
  }
}
```

```json
{
  "id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
  "created_at": "2026-10-28T19:15:50.823926Z",
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
    "id": "f82c6d24-e3f7-4023-bfec-db00b5a2d461",
    "order_id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
    "expires_at": "2026-10-28T19:16:05.827609Z",
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

`POST /api/driver/v1/offers/f82c6d24-e3f7-4023-bfec-db00b5a2d461/accept` → **200**

```json
{
  "command_id": "5803277b-9a21-4ecc-bc61-a559dd335426"
}
```

```json
{
  "id": "32e7d0b6-c35a-4b53-8731-c6eb15f8b652",
  "order_id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7c5b01f8-889c-42bd-8ac8-58c04b7a5cfb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c5b01f8-889c-42bd-8ac8-58c04b7a5cfb",
  "order_id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
  "assignment_id": "32e7d0b6-c35a-4b53-8731-c6eb15f8b652",
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
    "phone": "+380672520719"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad27164a-d892-441c-b882-0a1dedd36760",
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
  "id": "ef38e76a-4f9a-4cda-9fd3-74fd0bede3e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:51.999525Z",
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
  "command_id": "104884e5-eff9-4eff-8e51-dfa68ca56e75",
  "quote_id": "ef38e76a-4f9a-4cda-9fd3-74fd0bede3e1",
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
  "id": "e0294b18-6183-466b-8fd0-659166334779",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
  "created_at": "2026-10-28T19:15:52.283257Z",
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
  "command_id": "071dccdf-5568-4009-aeb0-891c9afa9b69",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T22:15:52Z"
}
```

```json
{
  "id": "d6fd863e-173c-40a8-a646-af9e495ea0ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:52.589430Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T22:15:52Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d5f34218-b3a6-473b-acd6-96431a2fb375",
  "quote_id": "d6fd863e-173c-40a8-a646-af9e495ea0ad",
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
  "pickup_at": "2026-10-28T22:15:52Z"
}
```

```json
{
  "id": "ae5e948b-35e1-4f11-8df7-46375d27eb1f",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
  "created_at": "2026-10-28T19:15:52.882087Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:15:52Z",
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
  "command_id": "e97a21f8-ec40-41f6-97ed-6d42ad22635b",
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
  "id": "d26bc8f1-b4b2-42b3-95c4-15958fff1158",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:53.193952Z",
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
  "command_id": "13f6d995-8207-4c00-9a5a-454716f0634a",
  "quote_id": "d26bc8f1-b4b2-42b3-95c4-15958fff1158",
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
  "correlation_id": "393bfaaa-7385-4e53-ac9c-d18f4fad529f"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "ae5e948b-35e1-4f11-8df7-46375d27eb1f",
      "short_number": 18,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
      "created_at": "2026-10-28T19:15:52.882087Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T22:15:52Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e0294b18-6183-466b-8fd0-659166334779",
      "short_number": 17,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
      "created_at": "2026-10-28T19:15:52.283257Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
      "short_number": 16,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "e0294b18-6183-466b-8fd0-659166334779",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
  "created_at": "2026-10-28T19:15:52.283257Z",
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

`GET /api/rider/v1/orders/e522a209-74c0-4aeb-937c-5c6ea6104733` → **200**

```json
{
  "id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
    "id": "32e7d0b6-c35a-4b53-8731-c6eb15f8b652",
    "order_id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7c5b01f8-889c-42bd-8ac8-58c04b7a5cfb",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T19:15:50.823926Z",
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
    "location_at": "2026-10-28T19:15:49.671408Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/e522a209-74c0-4aeb-937c-5c6ea6104733/cancel` → **200**

```json
{
  "command_id": "561d64a8-661c-48f5-9221-d683ccd373a7",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
    "id": "32e7d0b6-c35a-4b53-8731-c6eb15f8b652",
    "order_id": "e522a209-74c0-4aeb-937c-5c6ea6104733",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7c5b01f8-889c-42bd-8ac8-58c04b7a5cfb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:15:50.823926Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/e0294b18-6183-466b-8fd0-659166334779` → **200**

```json
{
  "id": "e0294b18-6183-466b-8fd0-659166334779",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
  "created_at": "2026-10-28T19:15:52.283257Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e0294b18-6183-466b-8fd0-659166334779/cancel` → **200**

```json
{
  "command_id": "95d53aef-a555-465c-b58e-9ec7dcb6a18e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e0294b18-6183-466b-8fd0-659166334779",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
  "created_at": "2026-10-28T19:15:52.283257Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/ae5e948b-35e1-4f11-8df7-46375d27eb1f` → **200**

```json
{
  "id": "ae5e948b-35e1-4f11-8df7-46375d27eb1f",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
  "created_at": "2026-10-28T19:15:52.882087Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:15:52Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ae5e948b-35e1-4f11-8df7-46375d27eb1f/cancel` → **200**

```json
{
  "command_id": "6e19a40c-d0b4-4cff-b59b-7705c791c44a",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ae5e948b-35e1-4f11-8df7-46375d27eb1f",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e4da0a8f-207e-4be4-8801-df49c4fb5b01",
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
  "created_at": "2026-10-28T19:15:52.882087Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-28T22:15:52Z",
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
  "session_id": "4a818b46-12e9-4628-a3cb-d82a307a164e",
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
  "last_heartbeat_at": "2026-10-28T19:15:49.671408Z",
  "last_location_at": "2026-10-28T19:15:49.671408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a818b46-12e9-4628-a3cb-d82a307a164e/close` → **200**

```json
{
  "command_id": "4e0e062e-7557-4904-ba89-0e51dd5908df",
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

Done: orders e522a209-74c0-4aeb-937c-5c6ea6104733, e0294b18-6183-466b-8fd0-659166334779, ae5e948b-35e1-4f11-8df7-46375d27eb1f.

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
  "session_id": "f97503e4-490a-414b-afce-9c40ef5c3fc1",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4NTYsImlhdCI6MTc5MzIxNDk1NiwianRpIjoiNGI4ZTIzZWItNzhlYy00Zjc2LWI0N2QtOTdlMDY0ZDQ5ODc5Iiwic2lkIjoiZjk3NTAzZTQtNDkwYS00MTRiLWFmY2UtOWM0MGVmNWMzZmMxIn0.VW2v7iqgXU6uU5iv11jlWZRlgWe5WOeXk0UCpe5QE6Y",
  "access_expires_at": "2026-10-28T19:30:56.929054947Z",
  "refresh_token": "gi2GzI9GyX2XKwbGRg5H9DlWPjLVH-nlg8SkoM-tcXM",
  "refresh_expires_at": "2026-10-29T07:15:56.928540434Z",
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
  "session_id": "60f0af97-0347-4b9b-82ea-962385d8ee5e",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4NTcsImlhdCI6MTc5MzIxNDk1NywianRpIjoiYjYzZTMwNzAtM2E0ZS00MmE5LTgwZjEtMzY2ZWEzY2E2OTgzIiwic2lkIjoiNjBmMGFmOTctMDM0Ny00YjliLTgyZWEtOTYyMzg1ZDhlZTVlIn0.JHkSGtsq5fY0wK36ciuh7T8LZv_ZyN9ifo3pr2GzAd4",
  "access_expires_at": "2026-10-28T19:30:57.499275627Z",
  "refresh_token": "D21N0Kn1y4t1JM3iUNoE2rSU8_2-YQbyN4QAzqPV9-w",
  "refresh_expires_at": "2026-10-29T07:15:57.49832388Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15982"
}
```

```json
{
  "challenge_id": "c4e5883e-8a49-4769-ab47-a769ca303466",
  "expires_at": "2026-10-28T19:20:57.776905812Z",
  "resend_available_at": "2026-10-28T19:15:58.776905812Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "403069",
  "sent_at": "2026-10-28T19:15:57.780161244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4e5883e-8a49-4769-ab47-a769ca303466",
  "code": "403069",
  "device_ref": "sandbox-15982"
}
```

```json
{
  "session_id": "d08ef6ff-73a5-4841-af44-43c022b127c3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTg1OCwiaWF0IjoxNzkzMjE0OTU4LCJqdGkiOiJiZWVlNDI2Ni1kY2I4LTQ1NDQtYmEyOC03MDQ3MjUxMDEzZTAiLCJzaWQiOiJkMDhlZjZmZi03M2E1LTQ4NDEtYWY0NC00M2MwMjJiMTI3YzMifQ.Wrc04EHxEGUZQlVtNISt1lS6koyh3wqajSpN6ekkzyo",
  "access_expires_at": "2026-10-28T19:30:58.096364306Z",
  "refresh_token": "04CWQnegZ_Pg451IGavHj7l0_yT9mEtsw_ndnkRaMAk",
  "refresh_expires_at": "2026-11-27T19:15:58.0957526Z",
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
  "command_id": "37e96cbf-9062-4321-97d7-1e26015ff866",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:15:58Z",
    "sequence": 1793214958657
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c3165b3-4740-41d8-9af5-f186ea7c7ccd",
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
  "last_heartbeat_at": "2026-10-28T19:15:58.676034Z",
  "last_location_at": "2026-10-28T19:15:58.676034Z",
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
  "command_id": "e70c3ad7-2aee-42eb-8fa0-6a85d85dca20",
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
  "effective_at": "2026-10-28T19:15:59.261583Z",
  "changed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T19:13:32.222892Z",
  "last_entries": [
    {
      "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T19:13:32.222892Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "63a8c429-5089-4f62-ab23-69343a050015",
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
  "id": "8a97bfd7-8520-470e-966d-90741233923e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:20:59.834375Z",
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
  "command_id": "8ddfd436-2194-450b-8af9-dac14dfaf5c0",
  "quote_id": "8a97bfd7-8520-470e-966d-90741233923e",
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
    "phone": "+380671115494"
  }
}
```

```json
{
  "id": "d4d95719-8111-4f65-be30-3204e9b4e52c",
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
  "created_at": "2026-10-28T19:16:00.12252Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115494"
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
    "id": "747e7514-1fe7-4525-bda5-6a637908e886",
    "order_id": "d4d95719-8111-4f65-be30-3204e9b4e52c",
    "expires_at": "2026-10-28T19:16:15.127064Z",
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

`POST /api/driver/v1/offers/747e7514-1fe7-4525-bda5-6a637908e886/accept` → **200**

```json
{
  "command_id": "a8b4363f-3f3b-4314-a1b2-8f8338b03c93"
}
```

```json
{
  "id": "611a2848-df19-48e7-8053-8b7749513a19",
  "order_id": "d4d95719-8111-4f65-be30-3204e9b4e52c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0dbe9ff0-beaa-4df2-9e06-d05a4a2ba199",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0dbe9ff0-beaa-4df2-9e06-d05a4a2ba199",
  "order_id": "d4d95719-8111-4f65-be30-3204e9b4e52c",
  "assignment_id": "611a2848-df19-48e7-8053-8b7749513a19",
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
    "phone": "+380671115494"
  }
}
```

`POST /api/driver/v1/work-sessions/8c3165b3-4740-41d8-9af5-f186ea7c7ccd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:16:01Z",
    "sequence": 1793214961274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c3165b3-4740-41d8-9af5-f186ea7c7ccd",
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
  "last_heartbeat_at": "2026-10-28T19:16:01.292887Z",
  "last_location_at": "2026-10-28T19:16:01.292887Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0dbe9ff0-beaa-4df2-9e06-d05a4a2ba199/arrive` → **200**

```json
{
  "command_id": "90c63b6b-7159-4553-8f94-575455fe2d5d",
  "expected_version": 0
}
```

```json
{
  "id": "0dbe9ff0-beaa-4df2-9e06-d05a4a2ba199",
  "order_id": "d4d95719-8111-4f65-be30-3204e9b4e52c",
  "assignment_id": "611a2848-df19-48e7-8053-8b7749513a19",
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
  "arrived_at": "2026-10-28T19:16:01.573439Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115494"
  }
}
```

`POST /api/driver/v1/trips/0dbe9ff0-beaa-4df2-9e06-d05a4a2ba199/start` → **200**

```json
{
  "command_id": "7a57ec26-bc14-43bb-a006-bc287f9f1218",
  "expected_version": 1
}
```

```json
{
  "id": "0dbe9ff0-beaa-4df2-9e06-d05a4a2ba199",
  "order_id": "d4d95719-8111-4f65-be30-3204e9b4e52c",
  "assignment_id": "611a2848-df19-48e7-8053-8b7749513a19",
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
  "arrived_at": "2026-10-28T19:16:01.573439Z",
  "started_at": "2026-10-28T19:16:01.867152Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115494"
  }
}
```

`POST /api/driver/v1/trips/0dbe9ff0-beaa-4df2-9e06-d05a4a2ba199/complete` → **200**

```json
{
  "command_id": "05933d0e-d84d-4179-b84b-4e4ec7626320",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:16:02Z",
  "cash_received": true
}
```

```json
{
  "id": "0dbe9ff0-beaa-4df2-9e06-d05a4a2ba199",
  "order_id": "d4d95719-8111-4f65-be30-3204e9b4e52c",
  "assignment_id": "611a2848-df19-48e7-8053-8b7749513a19",
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
  "arrived_at": "2026-10-28T19:16:01.573439Z",
  "started_at": "2026-10-28T19:16:01.867152Z",
  "completed_at": "2026-10-28T19:16:02.171444Z",
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
  "command_id": "e20895d3-1317-4760-9cc5-ee2eb7f15b13",
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
  "id": "7d591949-7f6d-4d1e-a9f2-06f9fce8d8f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:21:02.462942Z",
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
  "command_id": "84e17306-ea8e-4038-bc58-6ae149248896",
  "quote_id": "7d591949-7f6d-4d1e-a9f2-06f9fce8d8f3",
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
    "phone": "+3806711122831"
  }
}
```

```json
{
  "id": "0430e107-49ba-4ae4-82c7-e322545c26dc",
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
  "created_at": "2026-10-28T19:16:02.752256Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122831"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0430e107-49ba-4ae4-82c7-e322545c26dc` → **200**

```json
{
  "id": "0430e107-49ba-4ae4-82c7-e322545c26dc",
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
  "created_at": "2026-10-28T19:16:02.752256Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122831"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0430e107-49ba-4ae4-82c7-e322545c26dc/cancel` → **200**

```json
{
  "command_id": "814d06af-f577-4102-9070-31a6db272fae",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0430e107-49ba-4ae4-82c7-e322545c26dc",
  "short_number": 20,
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
  "created_at": "2026-10-28T19:16:02.752256Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122831"
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
  "staff_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T19:13:32.222892Z",
  "last_entries": [
    {
      "order_id": "0430e107-49ba-4ae4-82c7-e322545c26dc",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T19:16:03.401534Z"
    },
    {
      "order_id": "d4d95719-8111-4f65-be30-3204e9b4e52c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T19:16:02.176768Z"
    },
    {
      "order_id": "4337e1a0-6958-405c-b953-a152e5614a17",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T19:13:32.222892Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c3165b3-4740-41d8-9af5-f186ea7c7ccd",
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
  "last_heartbeat_at": "2026-10-28T19:16:01.292887Z",
  "last_location_at": "2026-10-28T19:16:01.292887Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8c3165b3-4740-41d8-9af5-f186ea7c7ccd/close` → **200**

```json
{
  "command_id": "601a812d-5403-48c4-a914-51a82c5a9857",
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

Done: operator bonus for fulfilled d4d95719-8111-4f65-be30-3204e9b4e52c and operator-fault cancellation 0430e107-49ba-4ae4-82c7-e322545c26dc.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676323802",
  "device_ref": "sandbox-24313"
}
```

```json
{
  "challenge_id": "cdb0fd3b-6e54-4b78-846e-5bf1c9da446a",
  "expires_at": "2026-10-28T19:21:06.557338948Z",
  "resend_available_at": "2026-10-28T19:16:07.557338948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676323802` → **200**

```json
{
  "phone": "+380676323802",
  "audience": "CLIENT",
  "code": "355412",
  "sent_at": "2026-10-28T19:16:06.559825391Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673793450",
  "device_ref": "sandbox-4556",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b858bec5-2f03-4384-91c5-1144b49d018b",
  "expires_at": "2026-10-28T19:21:06.85380159Z",
  "resend_available_at": "2026-10-28T19:16:07.85380159Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673793450` → **200**

```json
{
  "phone": "+380673793450",
  "audience": "CLIENT",
  "code": "543816",
  "sent_at": "2026-10-28T19:16:06.855856169Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674550000",
  "device_ref": "sandbox-24268"
}
```

```json
{
  "challenge_id": "ef945618-6154-4367-ad49-da492b9b866d",
  "expires_at": "2026-10-28T19:21:07.159458134Z",
  "resend_available_at": "2026-10-28T19:16:08.159458134Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674550000` → **200**

```json
{
  "phone": "+380674550000",
  "audience": "CLIENT",
  "code": "635702",
  "sent_at": "2026-10-28T19:16:07.162596083Z",
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
  "session_id": "bb925956-efef-48ec-b41b-44fab9c3d14a",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4NjcsImlhdCI6MTc5MzIxNDk2NywianRpIjoiNTZhYTNlYjYtMjc3ZS00MGI3LTg4MjctYjQ3MDhiYjdhZGZkIiwic2lkIjoiYmI5MjU5NTYtZWZlZi00OGVjLWI0MWItNDRmYWI5YzNkMTRhIn0.lLC48a68L-VCGAf3Jy77Yw3XHZgf60h3zt5-ApPh0_g",
  "access_expires_at": "2026-10-28T19:31:07.753790949Z",
  "refresh_token": "-1OMjVQI8nVDYnK-vfpzQpaSlB-BK9MTKoOD9uwiSDo",
  "refresh_expires_at": "2026-10-29T07:16:07.753086118Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674550000` → **200**

```json
{
  "deliveries": [
    {
      "id": "851cd3b5-1446-43ee-b139-68e3f80f9e95",
      "challenge_id": "ef945618-6154-4367-ad49-da492b9b866d",
      "phone": "+380674550000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-96efe367-bcb7-46d7-b986-8b0783a0ef58",
      "error": null,
      "attempted_at": "2026-10-28T19:16:07.162833Z"
    },
    {
      "id": "999563fa-5076-4925-a10a-5cb189cba7d9",
      "challenge_id": "ef945618-6154-4367-ad49-da492b9b866d",
      "phone": "+380674550000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T19:16:07.161626Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674550000` → **200**

```json
{
  "phone": "+380674550000",
  "audience": "CLIENT",
  "code": "635702",
  "sent_at": "2026-10-28T19:16:07.162596083Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673793450` → **200**

```json
{
  "deliveries": [
    {
      "id": "78555af4-a5b9-473c-95b2-c935dae13961",
      "challenge_id": "b858bec5-2f03-4384-91c5-1144b49d018b",
      "phone": "+380673793450",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3f610863-9946-4898-93e3-196d405ee73a",
      "error": null,
      "attempted_at": "2026-10-28T19:16:06.856109Z"
    }
  ]
}
```

Done: SMS to +380676323802, a call to +380673793450, SMS then a call to +380674550000.

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
  "session_id": "6e70d36c-c7d5-42e7-9bb2-b30cf3c65fe9",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4NjgsImlhdCI6MTc5MzIxNDk2OCwianRpIjoiNTI2OGM5YWMtZDQ1ZS00YmIzLTg4OTAtZjRkOWVjMjEyOGM5Iiwic2lkIjoiNmU3MGQzNmMtYzdkNS00MmU3LTliYjItYjMwY2YzYzY1ZmU5In0.KLJBpyxqTOL1STKhpQccVhF3Tmgqc_zMJk-I43OAOzc",
  "access_expires_at": "2026-10-28T19:31:08.927910636Z",
  "refresh_token": "2lEreGwOXT3IkJqHyZz_Jbf1oZBA-gvhu-vYjr20jx8",
  "refresh_expires_at": "2026-10-29T07:16:08.927331681Z",
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
  "session_id": "56d04599-5a3c-4e0c-bf75-71b3d6a32924",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4NjksImlhdCI6MTc5MzIxNDk2OSwianRpIjoiOTA3MTNhNjItNjI4Yy00ZTE4LWFmYjMtYWY1YzZkNmFiM2YxIiwic2lkIjoiNTZkMDQ1OTktNWEzYy00ZTBjLWJmNzUtNzFiM2Q2YTMyOTI0In0.tQrC0fMuvHFhjGNLOT5GEkLSXzfjJMsKRznoBVe49CA",
  "access_expires_at": "2026-10-28T19:31:09.49920694Z",
  "refresh_token": "TMyicaXt_Jmo3s_93REd9bGU_sSjSwIw4EKmIKC7AWI",
  "refresh_expires_at": "2026-10-29T07:16:09.498564256Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
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

`POST /api/admin/v1/staff-extensions/8f3fddcd-1f48-4efc-90a6-6a26322de5c3` → **200**

```json
{
  "command_id": "5fa8f0fe-9683-43f1-9a69-e4f417c81331",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "d4a4ad5c-a8b7-4e6a-97ed-e78485e2e96f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T19:16:10.61216Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T19:16:10.61216Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "de218e8f-5aa3-458a-b143-1c6c0793d35e",
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
  "id": "1cfcf5f3-424b-4c59-99c2-8778b976f1a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:21:11.155255Z",
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
  "command_id": "48471d86-e56f-46fb-a612-248a102e047e",
  "quote_id": "1cfcf5f3-424b-4c59-99c2-8778b976f1a8",
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
    "phone": "+380675514397"
  }
}
```

```json
{
  "id": "25d6b0aa-3eee-4101-828b-e3dbc9da590b",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:16:11.446296Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675514397"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/25d6b0aa-3eee-4101-828b-e3dbc9da590b/calls` → **201**

```json
{
  "command_id": "cee35601-8144-4b29-b007-067d656a688b",
  "to": "CALLER"
}
```

```json
{
  "id": "49f085da-ecee-49e9-bc86-8315c6957860",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "order_ids": [
    "25d6b0aa-3eee-4101-828b-e3dbc9da590b"
  ],
  "started_at": "2026-10-28T19:16:11.767215Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/25d6b0aa-3eee-4101-828b-e3dbc9da590b/calls` → **201**

```json
{
  "command_id": "cee35601-8144-4b29-b007-067d656a688b",
  "to": "CALLER"
}
```

```json
{
  "id": "49f085da-ecee-49e9-bc86-8315c6957860",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "order_ids": [
    "25d6b0aa-3eee-4101-828b-e3dbc9da590b"
  ],
  "started_at": "2026-10-28T19:16:11.767215Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "49f085da-ecee-49e9-bc86-8315c6957860",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675514397",
    "at": "2026-10-28T19:16:11.769410569Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "49f085da-ecee-49e9-bc86-8315c6957860",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.10770",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "49f085da-ecee-49e9-bc86-8315c6957860"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "49f085da-ecee-49e9-bc86-8315c6957860",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=25d6b0aa-3eee-4101-828b-e3dbc9da590b` → **200**

```json
{
  "calls": [
    {
      "id": "49f085da-ecee-49e9-bc86-8315c6957860",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [
        "25d6b0aa-3eee-4101-828b-e3dbc9da590b"
      ],
      "started_at": "2026-10-28T19:16:11.767215Z",
      "answered_at": "2026-10-28T19:16:12.407657Z",
      "ended_at": "2026-10-28T19:16:12.429102Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=25d6b0aa-3eee-4101-828b-e3dbc9da590b` → **200**

```json
{
  "calls": [
    {
      "id": "49f085da-ecee-49e9-bc86-8315c6957860",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "order_ids": [
        "25d6b0aa-3eee-4101-828b-e3dbc9da590b"
      ],
      "started_at": "2026-10-28T19:16:11.767215Z",
      "answered_at": "2026-10-28T19:16:12.407657Z",
      "ended_at": "2026-10-28T19:16:12.429102Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:16:12.842689Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/25d6b0aa-3eee-4101-828b-e3dbc9da590b` → **200**

```json
{
  "id": "25d6b0aa-3eee-4101-828b-e3dbc9da590b",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:16:11.446296Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675514397"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/25d6b0aa-3eee-4101-828b-e3dbc9da590b/cancel` → **200**

```json
{
  "command_id": "0f1c05a4-3c71-4bb0-8085-69d07c1133fb",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "25d6b0aa-3eee-4101-828b-e3dbc9da590b",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:16:11.446296Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675514397"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "command_id": "126b747b-e761-4131-a191-574cb32f16d7",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T19:16:15.61407Z",
  "extension": "101"
}
```

Done: outgoing call 49f085da-ecee-49e9-bc86-8315c6957860 from order 25d6b0aa-3eee-4101-828b-e3dbc9da590b, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636861566",
  "device_ref": "sandbox-25250"
}
```

```json
{
  "challenge_id": "54f769f4-8f2f-43a5-b40d-faf01ab39477",
  "expires_at": "2026-10-28T19:21:15.915885789Z",
  "resend_available_at": "2026-10-28T19:16:16.915885789Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636861566` → **200**

```json
{
  "phone": "+380636861566",
  "audience": "CLIENT",
  "code": "342194",
  "sent_at": "2026-10-28T19:16:15.91841577Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54f769f4-8f2f-43a5-b40d-faf01ab39477",
  "code": "342194",
  "device_ref": "sandbox-25250"
}
```

```json
{
  "session_id": "19dfe084-698e-4e5b-a314-b66b639aeda7",
  "subject": {
    "type": "CLIENT",
    "id": "89f3ae90-e219-41e9-968e-59121d95c6cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWYzYWU5MC1lMjE5LTQxZTktOTY4ZS01OTEyMWQ5NWM2Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODc2LCJpYXQiOjE3OTMyMTQ5NzYsImp0aSI6IjY0MTE1Yzg0LTk5MWYtNDA4MC1hMzM0LTgyYmIwODZjYzBkNSIsInNpZCI6IjE5ZGZlMDg0LTY5OGUtNGU1Yi1hMzE0LWI2NmI2MzlhZWRhNyJ9.ViT37FsUVQH_6EvUSFL723F6nHbBYwOR7BeKpCSkHqY",
  "access_expires_at": "2026-10-28T19:31:16.217226205Z",
  "refresh_token": "ac1xXk1pZLDLYSf4D3JkAE9wiKAnb6UJWVc8w3C_2qs",
  "refresh_expires_at": "2026-11-27T19:16:16.216650577Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "89f3ae90-e219-41e9-968e-59121d95c6cf",
  "session_id": "19dfe084-698e-4e5b-a314-b66b639aeda7",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636861566",
  "device_ref": "sandbox-22296"
}
```

```json
{
  "challenge_id": "325c50be-9758-4d93-a5b6-16d001e51013",
  "expires_at": "2026-10-28T19:21:18.746384361Z",
  "resend_available_at": "2026-10-28T19:16:19.746384361Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636861566` → **200**

```json
{
  "phone": "+380636861566",
  "audience": "CLIENT",
  "code": "769024",
  "sent_at": "2026-10-28T19:16:18.748567017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "325c50be-9758-4d93-a5b6-16d001e51013",
  "code": "769024",
  "device_ref": "sandbox-22296"
}
```

```json
{
  "session_id": "a45eac8a-1941-493b-800b-b3c7270fae36",
  "subject": {
    "type": "CLIENT",
    "id": "89f3ae90-e219-41e9-968e-59121d95c6cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWYzYWU5MC1lMjE5LTQxZTktOTY4ZS01OTEyMWQ5NWM2Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODc5LCJpYXQiOjE3OTMyMTQ5NzksImp0aSI6ImNkNzQ5ZDhlLTQ5OTItNDY1My1hYjllLTk3YzNiZGE1OTRiMiIsInNpZCI6ImE0NWVhYzhhLTE5NDEtNDkzYi04MDBiLWIzYzcyNzBmYWUzNiJ9.c8arrEgTO1gMGhiOlUhJs8cGbEefJPbvs0UGHl6Vyx8",
  "access_expires_at": "2026-10-28T19:31:19.052165445Z",
  "refresh_token": "LvC4_Gng567JRSoyHpuZ_KYYvOtxNFr5QOSptHNhIC8",
  "refresh_expires_at": "2026-11-27T19:16:19.051655765Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "26d9598f-098f-48b1-acd2-8f89748c56d2",
  "expires_at": "2026-10-28T19:21:21.328898252Z",
  "resend_available_at": "2026-10-28T19:16:22.328898252Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636861566` → **200**

```json
{
  "phone": "+380636861566",
  "audience": "CLIENT",
  "code": "532700",
  "sent_at": "2026-10-28T19:16:21.330897307Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380635097801"
}
```

```json
{
  "challenge_id": "ada3dfa4-62c1-46ed-b0f9-7d52e6b3a0c8",
  "expires_at": "2026-10-28T19:21:21.616116817Z",
  "resend_available_at": "2026-10-28T19:16:22.616116817Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635097801` → **200**

```json
{
  "phone": "+380635097801",
  "audience": "CLIENT",
  "code": "710119",
  "sent_at": "2026-10-28T19:16:21.618229314Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "f03f96bb-2d52-4a30-9d2c-14015d2a15f7",
  "current_challenge_id": "26d9598f-098f-48b1-acd2-8f89748c56d2",
  "current_code": "000000",
  "new_challenge_id": "ada3dfa4-62c1-46ed-b0f9-7d52e6b3a0c8",
  "new_code": "710119"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "49bff2b2-3153-4ace-8d1e-6e6cecfa781b"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "3a5145c6-e88e-4e03-b440-552968aff391",
  "current_challenge_id": "26d9598f-098f-48b1-acd2-8f89748c56d2",
  "current_code": "532700",
  "new_challenge_id": "ada3dfa4-62c1-46ed-b0f9-7d52e6b3a0c8",
  "new_code": "710119"
}
```

```json
{
  "subject_id": "89f3ae90-e219-41e9-968e-59121d95c6cf",
  "phone": "+380635097801",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "89f3ae90-e219-41e9-968e-59121d95c6cf",
  "session_id": "19dfe084-698e-4e5b-a314-b66b639aeda7",
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
  "correlation_id": "c66ff723-7aac-49c0-9ea5-bb9e9ec0ce67"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635097801",
  "device_ref": "sandbox-1660"
}
```

```json
{
  "challenge_id": "0f33f2e0-a6b0-4fcf-9bc4-69ddcfba42d5",
  "expires_at": "2026-10-28T19:21:25.032437043Z",
  "resend_available_at": "2026-10-28T19:16:26.032437043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635097801` → **200**

```json
{
  "phone": "+380635097801",
  "audience": "CLIENT",
  "code": "399312",
  "sent_at": "2026-10-28T19:16:25.034603383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f33f2e0-a6b0-4fcf-9bc4-69ddcfba42d5",
  "code": "399312",
  "device_ref": "sandbox-1660"
}
```

```json
{
  "session_id": "6e387d8a-eafb-4572-849d-00c466d71df6",
  "subject": {
    "type": "CLIENT",
    "id": "89f3ae90-e219-41e9-968e-59121d95c6cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWYzYWU5MC1lMjE5LTQxZTktOTY4ZS01OTEyMWQ5NWM2Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODg1LCJpYXQiOjE3OTMyMTQ5ODUsImp0aSI6IjNmNjk1ODNkLTlhMzQtNGE0Yi04NDRhLTQzYzAyMmJlY2ExNyIsInNpZCI6IjZlMzg3ZDhhLWVhZmItNDU3Mi04NDlkLTAwYzQ2NmQ3MWRmNiJ9.mhWbBO21JbqLe0OUExEt5ZMB7Z8WlI3QwCqzqQTH7gs",
  "access_expires_at": "2026-10-28T19:31:25.332035837Z",
  "refresh_token": "1fpZNq-JD3CR-qW0OPYOT10-2Phrxd2wUTBAaihXhtc",
  "refresh_expires_at": "2026-11-27T19:16:25.331443445Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "89f3ae90-e219-41e9-968e-59121d95c6cf",
  "session_id": "6e387d8a-eafb-4572-849d-00c466d71df6",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support checks who it is and sends a code to the new phone

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
  "session_id": "3612cabc-7fd9-4781-ac9c-2fd506747651",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4ODYsImlhdCI6MTc5MzIxNDk4NiwianRpIjoiMTI1OWZiZDUtMTE4Ni00ZmE1LThiNjQtMDI5NzA5ZjE2NWY5Iiwic2lkIjoiMzYxMmNhYmMtN2ZkOS00NzgxLWFjOWMtMmZkNTA2NzQ3NjUxIn0._AowsYmWq619_G4ZEvPy72udv1cY42wY6f43vJlEXJ0",
  "access_expires_at": "2026-10-28T19:31:26.153899941Z",
  "refresh_token": "mwenWG4TjyK9CwPvwCg_1TuIA1Yjhwqb6-GKalLF9Mk",
  "refresh_expires_at": "2026-10-29T07:16:26.153348538Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/89f3ae90-e219-41e9-968e-59121d95c6cf` → **200**

```json
{
  "client": {
    "id": "89f3ae90-e219-41e9-968e-59121d95c6cf",
    "phone": "+380635097801",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T19:16:16.215068Z",
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

`POST /api/admin/v1/clients/89f3ae90-e219-41e9-968e-59121d95c6cf/phone/new-code` → **201**

```json
{
  "phone": "+380639413964"
}
```

```json
{
  "challenge_id": "91823405-07fd-408b-82b9-eec13b8974fd",
  "expires_at": "2026-10-28T19:21:26.726135054Z",
  "resend_available_at": "2026-10-28T19:16:27.726135054Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639413964` → **200**

```json
{
  "phone": "+380639413964",
  "audience": "CLIENT",
  "code": "359700",
  "sent_at": "2026-10-28T19:16:26.728172254Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/89f3ae90-e219-41e9-968e-59121d95c6cf/phone` → **422**

```json
{
  "command_id": "32000663-04b1-4bb4-85e3-770164c28e55",
  "expected_version": 3,
  "new_challenge_id": "91823405-07fd-408b-82b9-eec13b8974fd",
  "new_code": "359701",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/89f3ae90-e219-41e9-968e-59121d95c6cf/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "79ed3b67-da22-476a-9058-5e4399ab9a37"
}
```

`POST /api/admin/v1/clients/89f3ae90-e219-41e9-968e-59121d95c6cf/phone` → **400**

```json
{
  "command_id": "3e90de81-e75e-4fb8-9d79-70f88baf70da",
  "expected_version": 3,
  "new_challenge_id": "91823405-07fd-408b-82b9-eec13b8974fd",
  "new_code": "359700",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/89f3ae90-e219-41e9-968e-59121d95c6cf/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5e13479c-3b8a-467a-8b5d-99d54b416c16",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/89f3ae90-e219-41e9-968e-59121d95c6cf/phone` → **200**

```json
{
  "command_id": "bdf007c9-cc9c-4495-a2f5-d2656463e575",
  "expected_version": 3,
  "new_challenge_id": "91823405-07fd-408b-82b9-eec13b8974fd",
  "new_code": "359700",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "89f3ae90-e219-41e9-968e-59121d95c6cf",
  "phone": "+380639413964",
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
  "correlation_id": "e145d756-8a56-4cf4-8ffe-c7a20db917c8"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639413964",
  "device_ref": "sandbox-26092"
}
```

```json
{
  "challenge_id": "3beea021-b1df-476b-bea8-0f41a8dd41b9",
  "expires_at": "2026-10-28T19:21:28.130006825Z",
  "resend_available_at": "2026-10-28T19:16:29.130006825Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639413964` → **200**

```json
{
  "phone": "+380639413964",
  "audience": "CLIENT",
  "code": "761578",
  "sent_at": "2026-10-28T19:16:28.132131107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3beea021-b1df-476b-bea8-0f41a8dd41b9",
  "code": "761578",
  "device_ref": "sandbox-26092"
}
```

```json
{
  "session_id": "3cce4e6d-40e9-4dde-9686-2e5d4c8ad066",
  "subject": {
    "type": "CLIENT",
    "id": "89f3ae90-e219-41e9-968e-59121d95c6cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWYzYWU5MC1lMjE5LTQxZTktOTY4ZS01OTEyMWQ5NWM2Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODg4LCJpYXQiOjE3OTMyMTQ5ODgsImp0aSI6Ijc3ZDE1NzZmLTY4YTctNGQ2OS05YTk5LWU4ZDNmZGQwNTU3MCIsInNpZCI6IjNjY2U0ZTZkLTQwZTktNGRkZS05Njg2LTJlNWQ0YzhhZDA2NiJ9.Eoe33I2gwMs5Rcnltjb1lWnVuKhAy9VwaPJUeJ_sUJ8",
  "access_expires_at": "2026-10-28T19:31:28.431187887Z",
  "refresh_token": "MmaamzqCrjMz3i-MjKCe9oiTiwx7nWSHBv83xPquv3c",
  "refresh_expires_at": "2026-11-27T19:16:28.430684665Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "89f3ae90-e219-41e9-968e-59121d95c6cf",
  "session_id": "3cce4e6d-40e9-4dde-9686-2e5d4c8ad066",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a code to the new phone and a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634818918",
  "device_ref": "sandbox-15983"
}
```

```json
{
  "challenge_id": "642a7cd1-5424-4534-977e-2c01e8b8cf61",
  "expires_at": "2026-10-28T19:21:28.984177203Z",
  "resend_available_at": "2026-10-28T19:16:29.984177203Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634818918` → **200**

```json
{
  "phone": "+380634818918",
  "audience": "CLIENT",
  "code": "353997",
  "sent_at": "2026-10-28T19:16:28.986561232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "642a7cd1-5424-4534-977e-2c01e8b8cf61",
  "code": "353997",
  "device_ref": "sandbox-15983"
}
```

```json
{
  "session_id": "d2261cb6-e1e6-4247-b524-c4e2ec87e38c",
  "subject": {
    "type": "CLIENT",
    "id": "9f87d13d-5446-42f8-835a-db43a479ecb1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Zjg3ZDEzZC01NDQ2LTQyZjgtODM1YS1kYjQzYTQ3OWVjYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODg5LCJpYXQiOjE3OTMyMTQ5ODksImp0aSI6IjVhNTY1MDc2LWIwMDktNGIzZS1iYWUxLTJhYzc1NGI3ZGJkZiIsInNpZCI6ImQyMjYxY2I2LWUxZTYtNDI0Ny1iNTI0LWM0ZTJlYzg3ZTM4YyJ9.K_hgkwDit-N-g4C3ufbccA4yL5qEmdmU2Dzo9ESJgH0",
  "access_expires_at": "2026-10-28T19:31:29.289432356Z",
  "refresh_token": "9SLPlHsLcGqaxp9Zf1papmkAvN69KQ13-hDWH1GRnYo",
  "refresh_expires_at": "2026-11-27T19:16:29.288924485Z",
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
  "session_id": "5c606f3d-d8ff-4e6d-8d0a-aa054a5954c4",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4OTAsImlhdCI6MTc5MzIxNDk5MCwianRpIjoiZDRkMjAwNmYtYjE3YS00MjU2LTliMzMtZjM4MDhkNWNkMDI1Iiwic2lkIjoiNWM2MDZmM2QtZDhmZi00ZTZkLThkMGEtYWEwNTRhNTk1NGM0In0.IizFIkoA7klIw0tDJ619KcuuWii-5SON_bDHgEhWlI4",
  "access_expires_at": "2026-10-28T19:31:30.422301843Z",
  "refresh_token": "Yezl9Wk7xxMSW07XFv-DC2R9U5w9e_7Ah32rrZ6Re04",
  "refresh_expires_at": "2026-10-29T07:16:30.421761902Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634818918` → **200**

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
  "correlation_id": "98bbf8f5-4ca0-4b7f-96bc-17c1229450b5"
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
  "session_id": "963e389e-ea1e-4915-824d-4b61a581d492",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4OTEsImlhdCI6MTc5MzIxNDk5MSwianRpIjoiNDMyZDAzYTMtNTM1ZC00MTFlLWIyOTAtNWJlYjg5M2E1MmM0Iiwic2lkIjoiOTYzZTM4OWUtZWExZS00OTE1LTgyNGQtNGI2MWE1ODFkNDkyIn0.NIG-_fAdQjuKmWY_ErAAw2KTzFihaYtxsnj4KOmKSfI",
  "access_expires_at": "2026-10-28T19:31:31.559031366Z",
  "refresh_token": "Xg0kD4uM3fc35Zvt9JY2n55mR6yCEbEt85p-l7Vvv-4",
  "refresh_expires_at": "2026-10-29T07:16:31.558512254Z",
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
  "command_id": "8a85bcf8-1e39-4253-ba8a-cd476bd25108",
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    }
  },
  "changed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T19:16:32.125400535Z"
}
```

## The rider books the airport for 2026-10-28T22:16:31Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600800341",
  "device_ref": "sandbox-29760"
}
```

```json
{
  "challenge_id": "113de9aa-c719-4721-b1f6-c7da1839ec83",
  "expires_at": "2026-10-28T19:21:32.41681504Z",
  "resend_available_at": "2026-10-28T19:16:33.41681504Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600800341` → **200**

```json
{
  "phone": "+48600800341",
  "audience": "CLIENT",
  "code": "743069",
  "sent_at": "2026-10-28T19:16:32.419149033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "113de9aa-c719-4721-b1f6-c7da1839ec83",
  "code": "743069",
  "device_ref": "sandbox-29760"
}
```

```json
{
  "session_id": "30661cb1-4f38-4a7e-8a13-bfd68530a80e",
  "subject": {
    "type": "CLIENT",
    "id": "d7bc008e-d686-4ba3-9a67-5675b51c120f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkN2JjMDA4ZS1kNjg2LTRiYTMtOWE2Ny01Njc1YjUxYzEyMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODkyLCJpYXQiOjE3OTMyMTQ5OTIsImp0aSI6ImQxZWNhNzRhLTg2YTktNGNhOS1iNThhLTc4OGQ3YzViOGQ0YyIsInNpZCI6IjMwNjYxY2IxLTRmMzgtNGE3ZS04YTEzLWJmZDY4NTMwYTgwZSJ9.BR6dbGcILiR4VLfWWWHHar0Cq_wmzLdcX2fP4dHK_Mc",
  "access_expires_at": "2026-10-28T19:31:32.723614346Z",
  "refresh_token": "CTaiqd-6U032nlteonWMGowSaghZdDZIUMwWstqzZQs",
  "refresh_expires_at": "2026-11-27T19:16:32.723046076Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d604b5e-b4b3-46f4-9ad0-3ad1a5500c45",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T22:16:31Z"
}
```

```json
{
  "id": "6e4ef45d-6527-4e46-830d-e3a84312ddea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:21:33.001644Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T22:16:31Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0c7edc01-9458-46d9-af6f-dc42badda545",
  "quote_id": "6e4ef45d-6527-4e46-830d-e3a84312ddea",
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
  "pickup_at": "2026-10-28T22:16:31Z"
}
```

```json
{
  "id": "19e46092-ee75-41a4-98f3-7412b8062a83",
  "short_number": 22,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d7bc008e-d686-4ba3-9a67-5675b51c120f",
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
  "created_at": "2026-10-28T19:16:33.320746Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:16:31Z",
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
  "device_ref": "sandbox-23149"
}
```

```json
{
  "challenge_id": "32d9fc50-b5b4-4b25-91f5-9a0d50b31ea4",
  "expires_at": "2026-10-28T19:21:33.650322777Z",
  "resend_available_at": "2026-10-28T19:16:34.650322777Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "421991",
  "sent_at": "2026-10-28T19:16:33.653368853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32d9fc50-b5b4-4b25-91f5-9a0d50b31ea4",
  "code": "421991",
  "device_ref": "sandbox-23149"
}
```

```json
{
  "session_id": "037f2fcc-5058-464e-a8c8-6d7f60cdb7c1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTg5NCwiaWF0IjoxNzkzMjE0OTk0LCJqdGkiOiJkMDQzZWQ5Ny1iNzM0LTQzODAtYWZiOC0xN2Y5YWE5MWQxYWMiLCJzaWQiOiIwMzdmMmZjYy01MDU4LTQ2NGUtYThjOC02ZDdmNjBjZGI3YzEifQ.WxXR98Riqoii3DeLtLP4NjeoaimD1h6XGb94rvvtlKY",
  "access_expires_at": "2026-10-28T19:31:34.012700065Z",
  "refresh_token": "9mVQior6pbDTjS-ahwOHrnNg8ZRv1Hyuki4N1A3iIOg",
  "refresh_expires_at": "2026-11-27T19:16:34.01209252Z",
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
  "command_id": "1e825a2f-07f5-4911-8a15-0b9f13d13c94",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:16:34Z",
    "sequence": 1793214994580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e8bbaea2-fad7-407e-a3fd-104e150bf456",
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
  "last_heartbeat_at": "2026-10-28T19:16:34.598375Z",
  "last_location_at": "2026-10-28T19:16:34.598375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "19e46092-ee75-41a4-98f3-7412b8062a83",
      "short_number": 22,
      "pickup_at": "2026-10-28T22:16:31Z",
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

`POST /api/driver/v1/preorders/19e46092-ee75-41a4-98f3-7412b8062a83/reserve` → **200**

```json
{
  "command_id": "7ccafcf5-9c3e-4e9f-bb9b-cbd8aae31976"
}
```

```json
{
  "id": "1f1514a3-dcd8-4cb1-b2fe-e4274d5bd25d",
  "state": "RESERVED",
  "order": {
    "order_id": "19e46092-ee75-41a4-98f3-7412b8062a83",
    "short_number": 22,
    "pickup_at": "2026-10-28T22:16:31Z",
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
  "reserved_at": "2026-10-28T19:16:35.145511Z",
  "confirm_from": "2026-10-28T21:46:31Z",
  "confirm_until": "2026-10-28T21:56:31Z",
  "drop_until": "2026-10-28T21:16:31Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "1f1514a3-dcd8-4cb1-b2fe-e4274d5bd25d",
      "state": "RESERVED",
      "order": {
        "order_id": "19e46092-ee75-41a4-98f3-7412b8062a83",
        "short_number": 22,
        "pickup_at": "2026-10-28T22:16:31Z",
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
      "reserved_at": "2026-10-28T19:16:35.145511Z",
      "confirm_from": "2026-10-28T21:46:31Z",
      "confirm_until": "2026-10-28T21:56:31Z",
      "drop_until": "2026-10-28T21:16:31Z"
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
      "id": "1f1514a3-dcd8-4cb1-b2fe-e4274d5bd25d",
      "state": "RESERVED",
      "order": {
        "order_id": "19e46092-ee75-41a4-98f3-7412b8062a83",
        "short_number": 22,
        "pickup_at": "2026-10-28T22:16:31Z",
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
      "reserved_at": "2026-10-28T19:16:35.145511Z",
      "confirm_from": "2026-10-28T21:46:31Z",
      "confirm_until": "2026-10-28T21:56:31Z",
      "drop_until": "2026-10-28T21:16:31Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/1f1514a3-dcd8-4cb1-b2fe-e4274d5bd25d/confirm` → **409**

```json
{
  "command_id": "32190ac7-bf0e-4d59-9f03-3716e707c7ac"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/1f1514a3-dcd8-4cb1-b2fe-e4274d5bd25d/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "780547a1-762b-4301-b06d-c30390f411e7"
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
  "session_id": "a075cb79-190e-415b-a045-79fe71c632ff",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU4OTYsImlhdCI6MTc5MzIxNDk5NiwianRpIjoiOGEwMmIyMDMtZTk1MC00Yjg2LWI1NjUtM2U4OTNlYTliMDI1Iiwic2lkIjoiYTA3NWNiNzktMTkwZS00MTViLWEwNDUtNzlmZTcxYzYzMmZmIn0.Oc5lIODj0lk0A4zt8lBnN_uKiddvZm1Tq3QLviCA8LY",
  "access_expires_at": "2026-10-28T19:31:36.558173813Z",
  "refresh_token": "sKTxa1wyBTMceFwirLwonexgzpB0LRut5CJ_DKJrPcE",
  "refresh_expires_at": "2026-10-29T07:16:36.557660624Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/19e46092-ee75-41a4-98f3-7412b8062a83` → **200**

```json
{
  "id": "19e46092-ee75-41a4-98f3-7412b8062a83",
  "short_number": 22,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d7bc008e-d686-4ba3-9a67-5675b51c120f",
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
  "created_at": "2026-10-28T19:16:33.320746Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T22:16:31Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "1f1514a3-dcd8-4cb1-b2fe-e4274d5bd25d",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T19:16:35.145511Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/19e46092-ee75-41a4-98f3-7412b8062a83/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T19:16:33.321985Z",
      "actor": {
        "type": "CLIENT",
        "id": "d7bc008e-d686-4ba3-9a67-5675b51c120f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "19e46092-ee75-41a4-98f3-7412b8062a83",
        "preorder": true,
        "quote_id": "6e4ef45d-6527-4e46-830d-e3a84312ddea",
        "pickup_at": "2026-10-28T22:16:31Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "e37ee750-8093-495c-a5cd-89136a354de2"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T19:16:35.146713Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "19e46092-ee75-41a4-98f3-7412b8062a83",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "1f1514a3-dcd8-4cb1-b2fe-e4274d5bd25d"
      },
      "correlation_id": "9846b1ec-cb8d-4d33-a590-84558b4f4785"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 19e46092-ee75-41a4-98f3-7412b8062a83, reservation 1f1514a3-dcd8-4cb1-b2fe-e4274d5bd25d.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23088"
}
```

```json
{
  "challenge_id": "dd610f0d-ed79-4a15-9eb9-85eb340ea10f",
  "expires_at": "2026-10-28T19:21:37.415045583Z",
  "resend_available_at": "2026-10-28T19:16:38.415045583Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "757096",
  "sent_at": "2026-10-28T19:16:37.417180333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd610f0d-ed79-4a15-9eb9-85eb340ea10f",
  "code": "757096",
  "device_ref": "sandbox-23088"
}
```

```json
{
  "session_id": "2cd16ae9-1459-436f-aec8-001d6a3c9242",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTg5NywiaWF0IjoxNzkzMjE0OTk3LCJqdGkiOiI1NmE0OTEzZi0zOGUzLTQxNDMtODcyYi0zMWE5NGExNTgyZjAiLCJzaWQiOiIyY2QxNmFlOS0xNDU5LTQzNmYtYWVjOC0wMDFkNmEzYzkyNDIifQ.x8Lj7dociax_YS1BaL9kapLGawF3tJgfv5gEPbAZAsc",
  "access_expires_at": "2026-10-28T19:31:37.720649688Z",
  "refresh_token": "4cGKWJEH8i8SfAberFDzLIddwY0TVGpGPtbqnbTlLGY",
  "refresh_expires_at": "2026-11-27T19:16:37.720100089Z",
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
  "command_id": "4c7bd44b-cc13-4520-878d-d275c2578de1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:16:38Z",
    "sequence": 1793214998262
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b944d73a-0d25-452c-b2b3-1975118144db",
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
  "last_heartbeat_at": "2026-10-28T19:16:38.279712Z",
  "last_location_at": "2026-10-28T19:16:38.279712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675091514",
  "device_ref": "sandbox-17036"
}
```

```json
{
  "challenge_id": "e62b06a3-69be-46c6-b892-747b6a207367",
  "expires_at": "2026-10-28T19:21:38.562428096Z",
  "resend_available_at": "2026-10-28T19:16:39.562428096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675091514` → **200**

```json
{
  "phone": "+380675091514",
  "audience": "CLIENT",
  "code": "208730",
  "sent_at": "2026-10-28T19:16:38.565813009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e62b06a3-69be-46c6-b892-747b6a207367",
  "code": "208730",
  "device_ref": "sandbox-17036"
}
```

```json
{
  "session_id": "ebec34a0-59e1-4dc8-a631-6c8bd6471c65",
  "subject": {
    "type": "CLIENT",
    "id": "65092686-b8ab-4c2f-93d3-ac77f9caf960"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTA5MjY4Ni1iOGFiLTRjMmYtOTNkMy1hYzc3ZjljYWY5NjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1ODk4LCJpYXQiOjE3OTMyMTQ5OTgsImp0aSI6ImMyZTE5OWE3LTc5NTEtNGE2Yy1iZDBhLWM4M2M1MjgyNmRjMSIsInNpZCI6ImViZWMzNGEwLTU5ZTEtNGRjOC1hNjMxLTZjOGJkNjQ3MWM2NSJ9.pu6q2Cy1Tnb8yUzlsg1SCeXRV83igEKshbYSAArmdCc",
  "access_expires_at": "2026-10-28T19:31:38.874587373Z",
  "refresh_token": "cxDpubCF0fsSsBdwyskx9zlkAp2uSKZBSrR24B45xvg",
  "refresh_expires_at": "2026-11-27T19:16:38.873986277Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "70c0e9f9-3a84-4dfa-915f-01f3b49afa75",
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
  "id": "2e4bc79a-506f-4e2c-9d37-e9ade23df73c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:21:39.159496Z",
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
  "command_id": "21e7347a-ae78-4c1e-bbfb-fdd5ae068d58",
  "quote_id": "2e4bc79a-506f-4e2c-9d37-e9ade23df73c",
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
  "id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65092686-b8ab-4c2f-93d3-ac77f9caf960",
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
  "created_at": "2026-10-28T19:16:39.458556Z",
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
    "id": "e9805558-c0e9-4ebd-bc48-f53e060bdbde",
    "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
    "expires_at": "2026-10-28T19:16:54.461623Z",
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

`POST /api/driver/v1/offers/e9805558-c0e9-4ebd-bc48-f53e060bdbde/accept` → **200**

```json
{
  "command_id": "e76929ac-b14d-4186-9e13-cd15246c30dc"
}
```

```json
{
  "id": "d3dfceb8-4aa6-47cf-a187-c22b418d8d9e",
  "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "05ff6633-1bfa-42f7-9435-f2d1518953c8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "05ff6633-1bfa-42f7-9435-f2d1518953c8",
  "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "assignment_id": "d3dfceb8-4aa6-47cf-a187-c22b418d8d9e",
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

`POST /api/driver/v1/work-sessions/b944d73a-0d25-452c-b2b3-1975118144db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:16:40Z",
    "sequence": 1793215000582
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b944d73a-0d25-452c-b2b3-1975118144db",
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
  "last_heartbeat_at": "2026-10-28T19:16:40.600246Z",
  "last_location_at": "2026-10-28T19:16:40.600246Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "05ff6633-1bfa-42f7-9435-f2d1518953c8",
  "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "assignment_id": "d3dfceb8-4aa6-47cf-a187-c22b418d8d9e",
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

`POST /api/driver/v1/trips/05ff6633-1bfa-42f7-9435-f2d1518953c8/arrive` → **200**

```json
{
  "command_id": "acec0134-8c51-4167-b08f-4434838d02eb",
  "expected_version": 0
}
```

```json
{
  "id": "05ff6633-1bfa-42f7-9435-f2d1518953c8",
  "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "assignment_id": "d3dfceb8-4aa6-47cf-a187-c22b418d8d9e",
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
  "arrived_at": "2026-10-28T19:16:41.139179Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/05ff6633-1bfa-42f7-9435-f2d1518953c8/start` → **200**

```json
{
  "command_id": "f9791eee-27cb-474c-b925-7f0f6b940f80",
  "expected_version": 1
}
```

```json
{
  "id": "05ff6633-1bfa-42f7-9435-f2d1518953c8",
  "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "assignment_id": "d3dfceb8-4aa6-47cf-a187-c22b418d8d9e",
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
  "arrived_at": "2026-10-28T19:16:41.139179Z",
  "started_at": "2026-10-28T19:16:41.426415Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/b944d73a-0d25-452c-b2b3-1975118144db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:16:41Z",
    "sequence": 1793215001693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b944d73a-0d25-452c-b2b3-1975118144db",
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
  "last_heartbeat_at": "2026-10-28T19:16:41.711325Z",
  "last_location_at": "2026-10-28T19:16:41.711325Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/05ff6633-1bfa-42f7-9435-f2d1518953c8/complete` → **200**

```json
{
  "command_id": "5e2a21ea-df01-4cfd-8592-53d0b6e42175",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:16:41Z",
  "cash_received": true
}
```

```json
{
  "id": "05ff6633-1bfa-42f7-9435-f2d1518953c8",
  "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "assignment_id": "d3dfceb8-4aa6-47cf-a187-c22b418d8d9e",
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
  "arrived_at": "2026-10-28T19:16:41.139179Z",
  "started_at": "2026-10-28T19:16:41.426415Z",
  "completed_at": "2026-10-28T19:16:41.985629Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/d49f5214-9ebe-492f-877a-b7aed58fee6f/rating` → **200**

```json
{
  "command_id": "a166acde-f430-4a31-9279-01b24be1d803",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "score": 5,
  "created_at": "2026-10-28T19:16:42.291697628Z"
}
```

`POST /api/driver/v1/orders/d49f5214-9ebe-492f-877a-b7aed58fee6f/rating` → **200**

```json
{
  "command_id": "bc447940-effb-4d36-bf55-8f26d45d857f",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
  "score": 4,
  "created_at": "2026-10-28T19:16:42.5760258Z"
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
  "session_id": "04fa30c1-958d-4162-ada9-4a1c765549cc",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MDMsImlhdCI6MTc5MzIxNTAwMywianRpIjoiNmEzMjhkZTMtMGQzZC00M2I0LTlmYzMtOTI3ZmYzMGU3OTQ3Iiwic2lkIjoiMDRmYTMwYzEtOTU4ZC00MTYyLWFkYTktNGExYzc2NTU0OWNjIn0.qHEpChkHH4IAbK5-4Qo0wUONKJ8aYw655gG3YjoqyYE",
  "access_expires_at": "2026-10-28T19:31:43.414993753Z",
  "refresh_token": "bcSV6oz1IDsXnM3y1txnPN60q9V-b458Os1g1K_zMbw",
  "refresh_expires_at": "2026-10-29T07:16:43.414459663Z",
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
  "session_id": "8bdf9ec7-d1b8-455b-9d44-0bba8fdc593c",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MDMsImlhdCI6MTc5MzIxNTAwMywianRpIjoiMzhkNDMwMDMtOTMxZi00ZDVkLWE5MzQtZTQ1ODRiNWQ0ZWQ0Iiwic2lkIjoiOGJkZjllYzctZDFiOC00NTViLTlkNDQtMGJiYThmZGM1OTNjIn0.9xA5M-xZC4OBNSf5oSdCnvfREQLFBNIS7Iq7VGtmDYY",
  "access_expires_at": "2026-10-28T19:31:43.971828728Z",
  "refresh_token": "1zVLG99MqQaMQ_E7Se2izqm7ur14yqA5kE9Z5EK92DA",
  "refresh_expires_at": "2026-10-29T07:16:43.971079735Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d49f5214-9ebe-492f-877a-b7aed58fee6f/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
      "author_type": "RIDER",
      "author_id": "65092686-b8ab-4c2f-93d3-ac77f9caf960",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T19:16:42.291698Z"
    },
    {
      "order_id": "d49f5214-9ebe-492f-877a-b7aed58fee6f",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "65092686-b8ab-4c2f-93d3-ac77f9caf960",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T19:16:42.576026Z"
    }
  ]
}
```

Done: ratings for order d49f5214-9ebe-492f-877a-b7aed58fee6f.

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
  "session_id": "7d586951-9f03-4148-a29a-cb1c01e964e1",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MDQsImlhdCI6MTc5MzIxNTAwNCwianRpIjoiN2M2MTc0OWYtZmMwMi00YjgzLWFkMWMtMTJhNGVjMzBkYzE5Iiwic2lkIjoiN2Q1ODY5NTEtOWYwMy00MTQ4LWEyOWEtY2IxYzAxZTk2NGUxIn0.c1n7dZWQ4Pj23oG3YubGoYxTywcSMtVzfc6ArLDtFLQ",
  "access_expires_at": "2026-10-28T19:31:44.865422087Z",
  "refresh_token": "mxuXdWfSb42qOWDUDMaGRHW6Dpq5vWXK6oQrxpicNyA",
  "refresh_expires_at": "2026-10-29T07:16:44.864790694Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6e75717e-c5a1-45ce-b49e-9983d1a5b482",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "17c6e7b4-0bb3-44d9-950e-6748943a40c3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:16:45.151423Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/17c6e7b4-0bb3-44d9-950e-6748943a40c3` → **200**

```json
{
  "id": "17c6e7b4-0bb3-44d9-950e-6748943a40c3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:16:45.151423Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/17c6e7b4-0bb3-44d9-950e-6748943a40c3` → **200**

```json
{
  "id": "17c6e7b4-0bb3-44d9-950e-6748943a40c3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:16:45.151423Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/17c6e7b4-0bb3-44d9-950e-6748943a40c3` → **200**

```json
{
  "id": "17c6e7b4-0bb3-44d9-950e-6748943a40c3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T19:16:45.151423Z",
  "ready_at": "2026-10-28T19:16:47.869806Z",
  "expires_at": "2026-10-29T19:16:47.869806Z"
}
```

`GET /api/admin/v1/reports/exports/17c6e7b4-0bb3-44d9-950e-6748943a40c3/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,22,9,13,0,0,17,5,0,20,1,0,1,7,1,5
total,22,9,13,0,0,17,5,0,20,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6b350f74-4c77-4913-a83e-724821b51b09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "be18d0a8-a867-4195-ba87-ba7e4ba21437",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:16:48.288599Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/be18d0a8-a867-4195-ba87-ba7e4ba21437` → **200**

```json
{
  "id": "be18d0a8-a867-4195-ba87-ba7e4ba21437",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:16:48.288599Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/be18d0a8-a867-4195-ba87-ba7e4ba21437` → **200**

```json
{
  "id": "be18d0a8-a867-4195-ba87-ba7e4ba21437",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:16:48.288599Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/be18d0a8-a867-4195-ba87-ba7e4ba21437` → **200**

```json
{
  "id": "be18d0a8-a867-4195-ba87-ba7e4ba21437",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:16:48.288599Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/be18d0a8-a867-4195-ba87-ba7e4ba21437` → **200**

```json
{
  "id": "be18d0a8-a867-4195-ba87-ba7e4ba21437",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:16:48.288599Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/be18d0a8-a867-4195-ba87-ba7e4ba21437` → **200**

```json
{
  "id": "be18d0a8-a867-4195-ba87-ba7e4ba21437",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T19:16:48.288599Z",
  "ready_at": "2026-10-28T19:16:52.8774Z",
  "expires_at": "2026-10-29T19:16:52.8774Z"
}
```

`GET /api/admin/v1/reports/exports/be18d0a8-a867-4195-ba87-ba7e4ba21437/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,9,1282.20,130.74,192.36,1089.84,10.52,0.00,162.97,182.97,689.83,50.00,105.17
total,UAH,9,1282.20,130.74,192.36,1089.84,10.52,0.00,162.97,182.97,689.83,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/fdb8ac5e-13ac-4570-ab1d-52260bb72f19` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/fdb8ac5e-13ac-4570-ab1d-52260bb72f19",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "19cf09bd-e5e7-48cf-adf1-34a8a0af1d51"
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
  "device_ref": "sandbox-19135"
}
```

```json
{
  "challenge_id": "95bca63d-135b-4b1f-8d0d-c372972a6563",
  "expires_at": "2026-10-28T19:21:54.272047411Z",
  "resend_available_at": "2026-10-28T19:16:55.272047411Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "353369",
  "sent_at": "2026-10-28T19:16:54.274408071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95bca63d-135b-4b1f-8d0d-c372972a6563",
  "code": "353369",
  "device_ref": "sandbox-19135"
}
```

```json
{
  "session_id": "0c53dfc8-19ba-49cf-847d-107df3eaebf6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTkxNCwiaWF0IjoxNzkzMjE1MDE0LCJqdGkiOiI1NjAzZmIzOC0zZjU5LTRiNDAtYTUyOS00OGQ2MzkwZDk2MTUiLCJzaWQiOiIwYzUzZGZjOC0xOWJhLTQ5Y2YtODQ3ZC0xMDdkZjNlYWViZjYifQ.R8uk6o14G5VvQKsFI7IJRVX1n7JAe-lrq0C6g13wybs",
  "access_expires_at": "2026-10-28T19:31:54.570569025Z",
  "refresh_token": "-dPw-ihuir12xXLgcBwhsWfcrubI6QlTBhaiNHsbwEI",
  "refresh_expires_at": "2026-11-27T19:16:54.569973861Z",
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
  "command_id": "349291ac-f795-4fe4-9538-afdf567d867d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:16:55Z",
    "sequence": 1793215015422
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "10ca9960-b0ad-47d1-9cbf-34ae90e109aa",
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
  "last_heartbeat_at": "2026-10-28T19:16:55.439695Z",
  "last_location_at": "2026-10-28T19:16:55.439695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "9dd0a6d0-16e4-4461-af13-3a5e101f3520",
  "points": [
    {
      "sequence": 1793215017727,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T19:15:57Z"
    },
    {
      "sequence": 1793215017735,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T19:16:57Z"
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
  "session_id": "7c223336-54ec-4466-ad70-59b6c4502884",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MTgsImlhdCI6MTc5MzIxNTAxOCwianRpIjoiOTVjYjZmN2YtNWM2MC00ZjI4LWIzYmYtMTg0ZmE4M2RiZmRkIiwic2lkIjoiN2MyMjMzMzYtNTRlYy00NDY2LWFkNzAtNTliNmM0NTAyODg0In0.CQG32Kc4w7C-XUeZ7QWw91J-9X_eXf3v5PnIl0dplZ8",
  "access_expires_at": "2026-10-28T19:31:58.335834574Z",
  "refresh_token": "ECecTY2lIKVolh4aI_wUdkoAtWrJuBYIGNn6XwZ7BHs",
  "refresh_expires_at": "2026-10-29T07:16:58.335245862Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "a33b5dbc-d936-41ec-8257-2ca8c5244b61",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T19:16:57Z",
        "track_point_id": "ab17a32f-6006-4c16-ba16-2599432c3e83",
        "work_session_id": "10ca9960-b0ad-47d1-9cbf-34ae90e109aa"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T19:16:57Z",
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

`POST /api/admin/v1/driver-risk-flags/a33b5dbc-d936-41ec-8257-2ca8c5244b61/confirm` → **200**

```json
{
  "command_id": "8500252e-8a74-4f0a-80f2-2a2756557f4e",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "a33b5dbc-d936-41ec-8257-2ca8c5244b61",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T19:16:57Z",
    "track_point_id": "ab17a32f-6006-4c16-ba16-2599432c3e83",
    "work_session_id": "10ca9960-b0ad-47d1-9cbf-34ae90e109aa"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T19:16:57Z",
  "reason": null,
  "reviewed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reviewed_at": "2026-10-28T19:16:59.204535Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/a33b5dbc-d936-41ec-8257-2ca8c5244b61/dismiss` → **409**

```json
{
  "command_id": "a2ce2a1f-9569-42d8-bd6f-86a5aba351e4",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/a33b5dbc-d936-41ec-8257-2ca8c5244b61/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3b677916-e65e-4bba-9d22-185c6b130e1c"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "8e90d3c8-f4d0-4d6e-acbc-b9b03ee04302",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "e19c5ebd-46a9-4882-ae3b-c67d922c3c32",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "raised_at": "2026-10-28T19:16:59.791522Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/e19c5ebd-46a9-4882-ae3b-c67d922c3c32/dismiss` → **200**

```json
{
  "command_id": "c4d074fd-9435-4b8c-9363-a658e0f3d9dd",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "e19c5ebd-46a9-4882-ae3b-c67d922c3c32",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "raised_at": "2026-10-28T19:16:59.791522Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reviewed_at": "2026-10-28T19:17:00.083332Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "633821f4-7ff8-4b62-9b66-47a4c1076406",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "a33b5dbc-d936-41ec-8257-2ca8c5244b61"
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
      "actor_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:17:00.394751Z"
    }
  ]
}
```

Done: flag a33b5dbc-d936-41ec-8257-2ca8c5244b61 confirmed, suspension named it, driver reinstated.

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
  "session_id": "216283e9-f631-47aa-b694-66b2758d8f89",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MjEsImlhdCI6MTc5MzIxNTAyMSwianRpIjoiMjUyYjc4OGUtNjllYS00OTkwLWFiMzctMzllODcxNmU0MGNhIiwic2lkIjoiMjE2MjgzZTktZjYzMS00N2FhLWI2OTQtNjZiMjc1OGQ4Zjg5In0.dm-0Y0j0mXcTgNmn66fCUufna-WQev4NcRApn1Z5uow",
  "access_expires_at": "2026-10-28T19:32:01.248583966Z",
  "refresh_token": "pGXZYcIi_2LJl4oIkAmgemL5VvN-G1PqTJvJlXI225s",
  "refresh_expires_at": "2026-10-29T07:17:01.247643203Z",
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
      "actor_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:17:00.394751Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "d9425e48-3f62-4a4d-8c1b-64571eb17689",
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
  "session_id": "10ca9960-b0ad-47d1-9cbf-34ae90e109aa",
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
  "last_heartbeat_at": "2026-10-28T19:16:55.439695Z",
  "last_location_at": "2026-10-28T19:16:55.439695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/10ca9960-b0ad-47d1-9cbf-34ae90e109aa/close` → **200**

```json
{
  "command_id": "af0ca2a1-ea3a-46eb-bf14-47d93ee37d3f",
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
  "session_id": "4d4f4cf4-5330-496a-bdec-216cf7412f0b",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MjIsImlhdCI6MTc5MzIxNTAyMiwianRpIjoiOWM4YmZhYWQtOGMxYi00NDM1LWI0YTMtZTkyY2FiNjE1MTBiIiwic2lkIjoiNGQ0ZjRjZjQtNTMzMC00OTZhLWJkZWMtMjE2Y2Y3NDEyZjBiIn0.yBreixpVeg6aLjR-o6aiSrnoG6IWpmSgUFyyrlfY_gY",
  "access_expires_at": "2026-10-28T19:32:02.979076646Z",
  "refresh_token": "VuurutLYp41RjM9uZrNpkY2S3FpcOuZIJmg6Swl3XuY",
  "refresh_expires_at": "2026-10-29T07:17:02.976215429Z",
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
  "command_id": "6da7adfa-e11e-4eb8-b0bb-f9e13d950e73",
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
  "changed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T19:17:03.550896Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "6da7adfa-e11e-4eb8-b0bb-f9e13d950e73",
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
  "changed_by": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T19:17:03.550896Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48806615765",
  "device_ref": "sandbox-3887"
}
```

```json
{
  "challenge_id": "30158742-1a9d-4ce2-84ea-dc7b6256833e",
  "expires_at": "2026-10-28T19:22:04.138328726Z",
  "resend_available_at": "2026-10-28T19:17:05.138328726Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48806615765` → **200**

```json
{
  "phone": "+48806615765",
  "audience": "CLIENT",
  "code": "248095",
  "sent_at": "2026-10-28T19:17:04.140858832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30158742-1a9d-4ce2-84ea-dc7b6256833e",
  "code": "248095",
  "device_ref": "sandbox-3887"
}
```

```json
{
  "session_id": "3d4870ac-9c30-4d90-b52f-4ad889c124f4",
  "subject": {
    "type": "CLIENT",
    "id": "1db87e54-27f3-423d-89cc-c10bfc12e3d2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZGI4N2U1NC0yN2YzLTQyM2QtODljYy1jMTBiZmMxMmUzZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1OTI0LCJpYXQiOjE3OTMyMTUwMjQsImp0aSI6ImQ2OTk0ZDYxLWU1N2EtNGIxOC1iNjA0LWJjMmFjNDViNTc0ZSIsInNpZCI6IjNkNDg3MGFjLTljMzAtNGQ5MC1iNTJmLTRhZDg4OWMxMjRmNCJ9.ReJfGRQ_WyqnaI_FG2lMQPrxSBpyl3RCYmbNLEYSt6Y",
  "access_expires_at": "2026-10-28T19:32:04.459411791Z",
  "refresh_token": "ivrGAaAE0Jj1FqtqqXe_zJvPKiR5c5hd7vjAnzz4bpE",
  "refresh_expires_at": "2026-11-27T19:17:04.458891757Z",
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
  "correlation_id": "19a3d977-7d0d-4b45-a2b4-5adae9ed2ea3"
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
  "device_ref": "sandbox-317"
}
```

```json
{
  "challenge_id": "56616f99-56f3-465f-8d2b-87eaada31daa",
  "expires_at": "2026-10-28T19:22:05.274347852Z",
  "resend_available_at": "2026-10-28T19:17:06.274347852Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "691214",
  "sent_at": "2026-10-28T19:17:05.276610261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56616f99-56f3-465f-8d2b-87eaada31daa",
  "code": "691214",
  "device_ref": "sandbox-317"
}
```

```json
{
  "session_id": "6348aab1-b3e0-4a73-b0de-7bdfd17255f6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTkyNSwiaWF0IjoxNzkzMjE1MDI1LCJqdGkiOiIxNTc3NGFkYi02Mzk5LTQ2YzgtODUxNS1jMWU0ODJkNTA3MjciLCJzaWQiOiI2MzQ4YWFiMS1iM2UwLTRhNzMtYjBkZS03YmRmZDE3MjU1ZjYifQ._MgoBaNZLcmFdMdMnX1q1IH-WXd5wwrnEQ8OTrgoVUs",
  "access_expires_at": "2026-10-28T19:32:05.579424302Z",
  "refresh_token": "t49wWZizpub_1J_r2-6l9JLfoxRQz0-Ij1sWMDPaf3c",
  "refresh_expires_at": "2026-11-27T19:17:05.578710045Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e8bbaea2-fad7-407e-a3fd-104e150bf456",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T19:16:34.598375Z",
  "last_location_at": "2026-10-28T19:16:34.598375Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e8bbaea2-fad7-407e-a3fd-104e150bf456/handover` → **200**

```json
{
  "command_id": "983487c5-fa4c-4dd7-b745-0bb6eed6239a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e8bbaea2-fad7-407e-a3fd-104e150bf456",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T19:16:34.598375Z",
  "last_location_at": "2026-10-28T19:16:34.598375Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e8bbaea2-fad7-407e-a3fd-104e150bf456/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:17:06Z",
    "sequence": 1793215026401
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e8bbaea2-fad7-407e-a3fd-104e150bf456",
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
  "last_heartbeat_at": "2026-10-28T19:17:06.420724Z",
  "last_location_at": "2026-10-28T19:17:06.420724Z",
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
  "session_id": "e8bbaea2-fad7-407e-a3fd-104e150bf456",
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
  "last_heartbeat_at": "2026-10-28T19:17:06.420724Z",
  "last_location_at": "2026-10-28T19:17:06.420724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8bbaea2-fad7-407e-a3fd-104e150bf456/close` → **200**

```json
{
  "command_id": "eb139b79-092a-4321-b229-18245ec18699",
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
  "correlation_id": "21233622-db7d-4cc0-9f41-c3c6fa44693c"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678658588",
  "device_ref": "sandbox-21643"
}
```

```json
{
  "challenge_id": "c95cd3c9-961e-4160-9a00-3318672ba982",
  "expires_at": "2026-10-28T19:22:07.82929276Z",
  "resend_available_at": "2026-10-28T19:17:08.82929276Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678658588` → **200**

```json
{
  "phone": "+380678658588",
  "audience": "CLIENT",
  "code": "698549",
  "sent_at": "2026-10-28T19:17:07.831495114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c95cd3c9-961e-4160-9a00-3318672ba982",
  "code": "698549",
  "device_ref": "sandbox-21643"
}
```

```json
{
  "session_id": "8b4ba101-93dd-42ac-af69-df8b86848bf1",
  "subject": {
    "type": "CLIENT",
    "id": "485e6577-e43b-47ee-b0a5-919a547639e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODVlNjU3Ny1lNDNiLTQ3ZWUtYjBhNS05MTlhNTQ3NjM5ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1OTI4LCJpYXQiOjE3OTMyMTUwMjgsImp0aSI6ImFmMjAxOWJlLWIyZWYtNGQ4NS04MTU3LTUwYzFiNzdmNDE1YyIsInNpZCI6IjhiNGJhMTAxLTkzZGQtNDJhYy1hZjY5LWRmOGI4Njg0OGJmMSJ9.Ozgma7_x9EfrmwXiUcdHii1NIUT_bCBYyxBs7nEXzXI",
  "access_expires_at": "2026-10-28T19:32:08.131914342Z",
  "refresh_token": "FNVJsLCSza-Qt7bIbFl5y44Px06pYHXh7bEhDIM_kFg",
  "refresh_expires_at": "2026-11-27T19:17:08.131329405Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "ff40fdfc-73f3-4f6a-8e0c-b3055dd53755",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "605432c6-860e-4203-8b62-3cb7b2f5ff38",
  "upload_path": "/api/rider/v1/uploads/605432c6-860e-4203-8b62-3cb7b2f5ff38",
  "expires_at": "2026-10-28T19:32:08.41660372Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/605432c6-860e-4203-8b62-3cb7b2f5ff38` → **200**

```json
{
  "file_id": "605432c6-860e-4203-8b62-3cb7b2f5ff38",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "43cdecd9-374d-46a9-83fc-1786df699c22",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "605432c6-860e-4203-8b62-3cb7b2f5ff38"
  ]
}
```

```json
{
  "id": "0c022204-98f6-40b9-9ac5-18728dc2b57e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "485e6577-e43b-47ee-b0a5-919a547639e3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T19:17:08.72766Z",
  "updated_at": "2026-10-28T19:17:08.72766Z",
  "respond_by": "2026-10-28T23:17:08.72766Z",
  "messages": [
    {
      "id": "713bcb14-6b50-44bc-86e2-c3dd242f219c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "485e6577-e43b-47ee-b0a5-919a547639e3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:17:08.728692Z",
      "attachments": [
        {
          "file_id": "605432c6-860e-4203-8b62-3cb7b2f5ff38",
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
  "session_id": "5701207d-0559-4ecb-bbf9-2bceb64b85f9",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MjksImlhdCI6MTc5MzIxNTAyOSwianRpIjoiMTM5MWNkYjctZGMwNi00NTg5LWE4NDEtZTc2ZTcxMDZjZmZkIiwic2lkIjoiNTcwMTIwN2QtMDU1OS00ZWNiLWJiZjktMmJjZWI2NGI4NWY5In0.0L4RJkbjfNOqpgRBSFWnp8o0FId9rf2l-Os6nYo_MeE",
  "access_expires_at": "2026-10-28T19:32:09.314277638Z",
  "refresh_token": "TGE3KBC1xFuELXx555XNh6h50tKKDVtrl9WWJ6fK6gg",
  "refresh_expires_at": "2026-10-29T07:17:09.313592505Z",
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
  "session_id": "fdfe98b2-77d7-40be-83c0-1ecdef1b6402",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MjksImlhdCI6MTc5MzIxNTAyOSwianRpIjoiNjUyODY0NGUtYjQ1Ni00MDZkLWI3YjctY2I3YTJlOWI4ZjJhIiwic2lkIjoiZmRmZTk4YjItNzdkNy00MGJlLTgzYzAtMWVjZGVmMWI2NDAyIn0.M8aRIHbm7AAqGR35HmkXQheeNwdOLJwt4pthFMGVcxE",
  "access_expires_at": "2026-10-28T19:32:09.883498938Z",
  "refresh_token": "dgoeHY4JS5mmHNdkwO7B7I7-auHN2IhukIvgsmVf4E4",
  "refresh_expires_at": "2026-10-29T07:17:09.882922819Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/0c022204-98f6-40b9-9ac5-18728dc2b57e/attachments/605432c6-860e-4203-8b62-3cb7b2f5ff38` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "b79162c8-c5cd-4488-86e6-80568b43f61a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b200a6bb-40cd-44c2-b08c-5d6d6b16125b",
  "upload_path": "/api/operator/v1/uploads/b200a6bb-40cd-44c2-b08c-5d6d6b16125b",
  "expires_at": "2026-10-28T19:32:10.176349627Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b200a6bb-40cd-44c2-b08c-5d6d6b16125b` → **200**

```json
{
  "file_id": "b200a6bb-40cd-44c2-b08c-5d6d6b16125b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/0c022204-98f6-40b9-9ac5-18728dc2b57e` → **200**

```json
{
  "id": "0c022204-98f6-40b9-9ac5-18728dc2b57e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "485e6577-e43b-47ee-b0a5-919a547639e3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T19:17:08.72766Z",
  "updated_at": "2026-10-28T19:17:08.72766Z",
  "respond_by": "2026-10-28T23:17:08.72766Z",
  "messages": [
    {
      "id": "713bcb14-6b50-44bc-86e2-c3dd242f219c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "485e6577-e43b-47ee-b0a5-919a547639e3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:17:08.728692Z",
      "attachments": [
        {
          "file_id": "605432c6-860e-4203-8b62-3cb7b2f5ff38",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/0c022204-98f6-40b9-9ac5-18728dc2b57e/comments` → **200**

```json
{
  "command_id": "82bd5c68-95b0-4c05-91cd-6ed90c2fc96a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b200a6bb-40cd-44c2-b08c-5d6d6b16125b"
  ]
}
```

```json
{
  "id": "0c022204-98f6-40b9-9ac5-18728dc2b57e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "485e6577-e43b-47ee-b0a5-919a547639e3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T19:17:08.72766Z",
  "updated_at": "2026-10-28T19:17:10.776531Z",
  "respond_by": "2026-10-28T23:17:08.72766Z",
  "messages": [
    {
      "id": "713bcb14-6b50-44bc-86e2-c3dd242f219c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "485e6577-e43b-47ee-b0a5-919a547639e3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:17:08.728692Z",
      "attachments": [
        {
          "file_id": "605432c6-860e-4203-8b62-3cb7b2f5ff38",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "64a784c4-5cfb-484e-bca7-213345e16b9f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T19:17:10.776073Z",
      "attachments": [
        {
          "file_id": "b200a6bb-40cd-44c2-b08c-5d6d6b16125b",
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

`GET /api/rider/v1/support/cases/0c022204-98f6-40b9-9ac5-18728dc2b57e` → **200**

```json
{
  "id": "0c022204-98f6-40b9-9ac5-18728dc2b57e",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "485e6577-e43b-47ee-b0a5-919a547639e3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T19:17:08.72766Z",
  "updated_at": "2026-10-28T19:17:10.776531Z",
  "respond_by": "2026-10-28T23:17:08.72766Z",
  "messages": [
    {
      "id": "713bcb14-6b50-44bc-86e2-c3dd242f219c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "485e6577-e43b-47ee-b0a5-919a547639e3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:17:08.728692Z",
      "attachments": [
        {
          "file_id": "605432c6-860e-4203-8b62-3cb7b2f5ff38",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "64a784c4-5cfb-484e-bca7-213345e16b9f",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T19:17:10.776073Z",
      "attachments": [
        {
          "file_id": "b200a6bb-40cd-44c2-b08c-5d6d6b16125b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/0c022204-98f6-40b9-9ac5-18728dc2b57e/attachments/b200a6bb-40cd-44c2-b08c-5d6d6b16125b` → **200**

Done: support case 0c022204-98f6-40b9-9ac5-18728dc2b57e, rider attachment 605432c6-860e-4203-8b62-3cb7b2f5ff38, operator attachment b200a6bb-40cd-44c2-b08c-5d6d6b16125b.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734905160",
  "device_ref": "sandbox-770"
}
```

```json
{
  "challenge_id": "90539a37-0a63-4d62-8b47-e9019bcf08b9",
  "expires_at": "2026-10-28T19:22:11.387892294Z",
  "resend_available_at": "2026-10-28T19:17:12.387892294Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734905160` → **200**

```json
{
  "phone": "+380734905160",
  "audience": "CLIENT",
  "code": "514657",
  "sent_at": "2026-10-28T19:17:11.3901827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90539a37-0a63-4d62-8b47-e9019bcf08b9",
  "code": "514657",
  "device_ref": "sandbox-770"
}
```

```json
{
  "session_id": "ecf5bf5f-1b25-4874-9e38-cd8edaf19cd2",
  "subject": {
    "type": "CLIENT",
    "id": "44a65a12-3f56-49bb-b49d-8990d4b14132"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGE2NWExMi0zZjU2LTQ5YmItYjQ5ZC04OTkwZDRiMTQxMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1OTMxLCJpYXQiOjE3OTMyMTUwMzEsImp0aSI6IjlkZDQzYWExLWNlYjAtNDgzNC1iYTRmLTQ3NThhZjBmNWY5MCIsInNpZCI6ImVjZjViZjVmLTFiMjUtNDg3NC05ZTM4LWNkOGVkYWYxOWNkMiJ9.aPhEwtmd2QSX7XYGF0B7KObmiA2r3nQeJv1D8zSuf2o",
  "access_expires_at": "2026-10-28T19:32:11.684857899Z",
  "refresh_token": "JZMsQ7YKbYgD6wxQvN-xKVdBPQIBNbp3F_avxNjcntE",
  "refresh_expires_at": "2026-11-27T19:17:11.684322446Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4aafc255-0121-4dc6-b6f5-e956a00de6b5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8b151f18-b19f-4de5-b506-66a3d468d625",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8b151f18-b19f-4de5-b506-66a3d468d625",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5c8ccb3ae93887c2a02d51ce2dd1a3a3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8b151f18-b19f-4de5-b506-66a3d468d625",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734905160"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8b151f18-b19f-4de5-b506-66a3d468d625",
  "expires_at": "2026-10-28T19:47:11.962861Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/8b151f18-b19f-4de5-b506-66a3d468d625` → **200**

```json
{
  "id": "8b151f18-b19f-4de5-b506-66a3d468d625",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T19:47:11.962861Z",
  "card": {
    "id": "0ed36ef6-a776-407a-93ab-c99de8a5cd19",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5803",
    "card_type": "Visa",
    "created_at": "2026-10-28T19:17:12.239734Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "229a41d9-2f99-45f9-9d25-7a88632f5bb7",
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
  "id": "e4f023bd-3389-4b28-972f-000476bd8b72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:22:12.538259Z",
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
  "command_id": "fb5cd671-0533-4576-8436-629caae9ffdc",
  "quote_id": "e4f023bd-3389-4b28-972f-000476bd8b72",
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
  "id": "e0745156-1137-4e71-a9af-f1b55133667b",
  "short_number": 24,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "44a65a12-3f56-49bb-b49d-8990d4b14132",
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
  "created_at": "2026-10-28T19:17:12.830449Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e0745156-1137-4e71-a9af-f1b55133667b` → **200**

```json
{
  "id": "e0745156-1137-4e71-a9af-f1b55133667b",
  "short_number": 24,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "44a65a12-3f56-49bb-b49d-8990d4b14132",
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
  "created_at": "2026-10-28T19:17:12.830449Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e0745156-1137-4e71-a9af-f1b55133667b` → **200**

```json
{
  "id": "e0745156-1137-4e71-a9af-f1b55133667b",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "44a65a12-3f56-49bb-b49d-8990d4b14132",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:17:12.830449Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider decides to pay in cash

`GET /api/rider/v1/orders/e0745156-1137-4e71-a9af-f1b55133667b` → **200**

```json
{
  "id": "e0745156-1137-4e71-a9af-f1b55133667b",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "44a65a12-3f56-49bb-b49d-8990d4b14132",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:17:12.830449Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e0745156-1137-4e71-a9af-f1b55133667b/switch-to-cash` → **200**

```json
{
  "command_id": "11bf23cb-b44e-4e5c-a3b7-4bbb41223e1c",
  "expected_version": 3
}
```

```json
{
  "id": "e0745156-1137-4e71-a9af-f1b55133667b",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "44a65a12-3f56-49bb-b49d-8990d4b14132",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:17:12.830449Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e0745156-1137-4e71-a9af-f1b55133667b/switch-to-cash` → **409**

```json
{
  "command_id": "bd46471d-c3f2-4da6-a711-82af1b64f488",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/e0745156-1137-4e71-a9af-f1b55133667b/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "374f1cb2-5d0e-4edc-bfa5-feec45d65037"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/e0745156-1137-4e71-a9af-f1b55133667b` → **200**

```json
{
  "id": "e0745156-1137-4e71-a9af-f1b55133667b",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "44a65a12-3f56-49bb-b49d-8990d4b14132",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:17:12.830449Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e0745156-1137-4e71-a9af-f1b55133667b/cancel` → **200**

```json
{
  "command_id": "40be7285-1449-40d1-9cf0-ca58e7f37e53",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e0745156-1137-4e71-a9af-f1b55133667b",
  "short_number": 24,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "44a65a12-3f56-49bb-b49d-8990d4b14132",
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T19:17:12.830449Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "session_id": "f3b41a23-0ee8-4219-8e36-6d9cab0ad614",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5MzYsImlhdCI6MTc5MzIxNTAzNiwianRpIjoiZmM3NjRmMzYtZTFiYS00NGRjLWIxZmEtYjA4NGFkOGQyYzFhIiwic2lkIjoiZjNiNDFhMjMtMGVlOC00MjE5LThlMzYtNmQ5Y2FiMGFkNjE0In0.ieD7nKG8fu6rVNpCkhI5ym714B_qKrvovdP74FQ9aPU",
  "access_expires_at": "2026-10-28T19:32:16.467522355Z",
  "refresh_token": "0BTb4SamxFtRaMg01dBf3NLDUebg6mFBIQ5CuV1Lbs0",
  "refresh_expires_at": "2026-10-29T07:17:16.466944203Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13478"
}
```

```json
{
  "challenge_id": "a75b584b-bc24-420a-abe5-497c1ec31fb2",
  "expires_at": "2026-10-28T19:22:16.74245263Z",
  "resend_available_at": "2026-10-28T19:17:17.74245263Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "305316",
  "sent_at": "2026-10-28T19:17:16.744910988Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a75b584b-bc24-420a-abe5-497c1ec31fb2",
  "code": "305316",
  "device_ref": "sandbox-13478"
}
```

```json
{
  "session_id": "a809a946-d007-461d-b97d-dd2601605877",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTkzNywiaWF0IjoxNzkzMjE1MDM3LCJqdGkiOiJlNzhjNjBjYy05M2NhLTQwZjEtOGJjYy03NzBlNTMzZjE5NDMiLCJzaWQiOiJhODA5YTk0Ni1kMDA3LTQ2MWQtYjk3ZC1kZDI2MDE2MDU4NzcifQ.zebfMkNQkE7KrQVIcRCoIeEUoSX-Bas7XaF-bobHtmk",
  "access_expires_at": "2026-10-28T19:32:17.03960282Z",
  "refresh_token": "le0sEXjTA7_HYyhm0wC2RVvTxA8J8pumRHd9rcNEpv0",
  "refresh_expires_at": "2026-11-27T19:17:17.039014528Z",
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
      "actor_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:17:00.394751Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T19:17:01.82732Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "9e69c507-460d-4ac9-aab8-9b7d36b19129",
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
  "device_ref": "sandbox-1301"
}
```

```json
{
  "challenge_id": "f7dfcec7-6cdf-4759-9efb-4dc765b31f0a",
  "expires_at": "2026-10-28T19:22:18.164953852Z",
  "resend_available_at": "2026-10-28T19:17:19.164953852Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "790788",
  "sent_at": "2026-10-28T19:17:18.16700359Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7dfcec7-6cdf-4759-9efb-4dc765b31f0a",
  "code": "790788",
  "device_ref": "sandbox-1301"
}
```

```json
{
  "session_id": "8b430fa1-99f9-4822-a768-9bbf4bfc4428",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTkzOCwiaWF0IjoxNzkzMjE1MDM4LCJqdGkiOiI1NTI1OGIzMS1iNzJmLTQ2N2QtYjAxMC1lMmEzYTA2YTg1OGQiLCJzaWQiOiI4YjQzMGZhMS05OWY5LTQ4MjItYTc2OC05YmJmNGJmYzQ0MjgifQ.tT4SLFezybitkkyUEpbHdFBGE9Hn6vnlNmsuz16mgP8",
  "access_expires_at": "2026-10-28T19:32:18.461171498Z",
  "refresh_token": "_wGLTKyK0RzQS-gZTlmpiiev4cFw1MGLl3yBPtIMFSo",
  "refresh_expires_at": "2026-11-27T19:17:18.460589932Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b944d73a-0d25-452c-b2b3-1975118144db",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T19:16:41.711325Z",
  "last_location_at": "2026-10-28T19:16:41.711325Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b944d73a-0d25-452c-b2b3-1975118144db/handover` → **200**

```json
{
  "command_id": "9fb34d13-d0e1-4324-8413-50373bc78b6f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b944d73a-0d25-452c-b2b3-1975118144db",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T19:16:41.711325Z",
  "last_location_at": "2026-10-28T19:16:41.711325Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b944d73a-0d25-452c-b2b3-1975118144db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:17:19Z",
    "sequence": 1793215039276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b944d73a-0d25-452c-b2b3-1975118144db",
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
  "last_heartbeat_at": "2026-10-28T19:17:19.294295Z",
  "last_location_at": "2026-10-28T19:17:19.294295Z",
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
  "command_id": "0cc2e736-6689-4e74-9a8d-f593ce029ef7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:17:19Z",
    "sequence": 1793215039850
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5da10167-c9c6-456e-8189-378f115ae5a1",
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
  "last_heartbeat_at": "2026-10-28T19:17:19.86795Z",
  "last_location_at": "2026-10-28T19:17:19.86795Z",
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
  "session_id": "6e767534-d97e-4865-9364-026ec2ffac81",
  "subject": {
    "type": "STAFF",
    "id": "8f3fddcd-1f48-4efc-90a6-6a26322de5c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjNmZGRjZC0xZjQ4LTRlZmMtOTBhNi02YTI2MzIyZGU1YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTU5NDAsImlhdCI6MTc5MzIxNTA0MCwianRpIjoiMzFjNmNmYWEtOGQzYy00ZjYwLTkyMTEtNzk2NWI2N2IxNTk4Iiwic2lkIjoiNmU3Njc1MzQtZDk3ZS00ODY1LTkzNjQtMDI2ZWMyZmZhYzgxIn0.baL1Hjzur6He8NfuNbNvF58n_o9UFqyGn-nmHavHrhQ",
  "access_expires_at": "2026-10-28T19:32:20.43755519Z",
  "refresh_token": "Yxs6XI_fCmbAc8snuwPFdzQcybrVbdfuCQTZSVALKPk",
  "refresh_expires_at": "2026-10-29T07:17:20.436958914Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fa865a9b-9100-4aa4-b6cd-3d561629ae2b",
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
  "id": "b0129d38-3f63-4af3-9859-1d62557d6ca6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:22:20.717073Z",
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
  "command_id": "5c3d543a-88b0-43b1-88df-8157941dc14d",
  "quote_id": "b0129d38-3f63-4af3-9859-1d62557d6ca6",
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
  "id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
  "short_number": 25,
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
  "created_at": "2026-10-28T19:17:21.002179Z",
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
    "id": "7e47a213-b1de-46b7-85b5-58fb780cb9ac",
    "order_id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
    "expires_at": "2026-10-28T19:17:36.006192Z",
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

`POST /api/driver/v1/offers/7e47a213-b1de-46b7-85b5-58fb780cb9ac/accept` → **200**

```json
{
  "command_id": "afcaf5f1-d3b4-444e-acb6-8164ca1e9e02"
}
```

```json
{
  "id": "8263580b-62a7-4c7c-a0fe-ca6cb0b44a30",
  "order_id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6afc4d64-a0fc-450b-bc9a-f4a0be6bed87",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6afc4d64-a0fc-450b-bc9a-f4a0be6bed87",
  "order_id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
  "assignment_id": "8263580b-62a7-4c7c-a0fe-ca6cb0b44a30",
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

`POST /api/driver/v1/work-sessions/5da10167-c9c6-456e-8189-378f115ae5a1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:17:22Z",
    "sequence": 1793215042396
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5da10167-c9c6-456e-8189-378f115ae5a1",
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
  "last_heartbeat_at": "2026-10-28T19:17:22.413559Z",
  "last_location_at": "2026-10-28T19:17:22.413559Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6afc4d64-a0fc-450b-bc9a-f4a0be6bed87/arrive` → **200**

```json
{
  "command_id": "a1793928-a699-4602-b7f4-7cd949539597",
  "expected_version": 0
}
```

```json
{
  "id": "6afc4d64-a0fc-450b-bc9a-f4a0be6bed87",
  "order_id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
  "assignment_id": "8263580b-62a7-4c7c-a0fe-ca6cb0b44a30",
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
  "arrived_at": "2026-10-28T19:17:22.70577Z",
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

`POST /api/driver/v1/trips/6afc4d64-a0fc-450b-bc9a-f4a0be6bed87/start` → **200**

```json
{
  "command_id": "a55affa9-0a6a-4e7e-95e3-6a62aa4aeaaa",
  "expected_version": 1
}
```

```json
{
  "id": "6afc4d64-a0fc-450b-bc9a-f4a0be6bed87",
  "order_id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
  "assignment_id": "8263580b-62a7-4c7c-a0fe-ca6cb0b44a30",
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
  "arrived_at": "2026-10-28T19:17:22.70577Z",
  "started_at": "2026-10-28T19:17:22.991224Z",
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

`POST /api/driver/v1/trips/6afc4d64-a0fc-450b-bc9a-f4a0be6bed87/complete` → **200**

```json
{
  "command_id": "4dfdf439-4bf7-49d7-9d22-4b1cf03d87a7",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:17:23Z",
  "cash_received": true
}
```

```json
{
  "id": "6afc4d64-a0fc-450b-bc9a-f4a0be6bed87",
  "order_id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
  "assignment_id": "8263580b-62a7-4c7c-a0fe-ca6cb0b44a30",
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
  "arrived_at": "2026-10-28T19:17:22.70577Z",
  "started_at": "2026-10-28T19:17:22.991224Z",
  "completed_at": "2026-10-28T19:17:23.295606Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/f7afd7f6-3c7f-417a-aff3-99349d768325` → **200**

```json
{
  "id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
  "short_number": 25,
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
    "id": "8263580b-62a7-4c7c-a0fe-ca6cb0b44a30",
    "order_id": "f7afd7f6-3c7f-417a-aff3-99349d768325",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6afc4d64-a0fc-450b-bc9a-f4a0be6bed87",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:17:21.002179Z",
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
  "session_id": "b944d73a-0d25-452c-b2b3-1975118144db",
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
  "last_heartbeat_at": "2026-10-28T19:17:19.294295Z",
  "last_location_at": "2026-10-28T19:17:19.294295Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b944d73a-0d25-452c-b2b3-1975118144db/close` → **200**

```json
{
  "command_id": "414645d7-a7a1-41c7-9a28-1ac8943b46a4",
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
  "session_id": "5da10167-c9c6-456e-8189-378f115ae5a1",
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
  "last_heartbeat_at": "2026-10-28T19:17:22.413559Z",
  "last_location_at": "2026-10-28T19:17:22.413559Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5da10167-c9c6-456e-8189-378f115ae5a1/close` → **200**

```json
{
  "command_id": "4bbdb567-b6a1-45e5-a132-e32f20be4352",
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

Done: terminal order f7afd7f6-3c7f-417a-aff3-99349d768325 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5786"
}
```

```json
{
  "challenge_id": "2573aa40-0da7-4960-9e54-dc2768e9bc6c",
  "expires_at": "2026-10-28T19:22:28.279286877Z",
  "resend_available_at": "2026-10-28T19:17:29.279286877Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "041628",
  "sent_at": "2026-10-28T19:17:28.28177002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2573aa40-0da7-4960-9e54-dc2768e9bc6c",
  "code": "041628",
  "device_ref": "sandbox-5786"
}
```

```json
{
  "session_id": "060d210c-ade4-4d41-a521-039382a4a7bd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTk0OCwiaWF0IjoxNzkzMjE1MDQ4LCJqdGkiOiJiNTAxYjFiZi1jYTY3LTQzNzYtOWU4Yi02MGI4OTU3MGJhZmUiLCJzaWQiOiIwNjBkMjEwYy1hZGU0LTRkNDEtYTUyMS0wMzkzODJhNGE3YmQifQ.r5k511REvlr1Yr-wvcwwIulZDPyMlqbGfwJz-6X1qEs",
  "access_expires_at": "2026-10-28T19:32:28.569188525Z",
  "refresh_token": "JuhKKmY_AAz8aG2VCNRN6PvkZGPKKHbpS9kx3AQPT2E",
  "refresh_expires_at": "2026-11-27T19:17:28.568664975Z",
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
  "device_ref": "sandbox-16878"
}
```

```json
{
  "challenge_id": "8498dfcb-63b4-42b1-a04c-812c63d95fd8",
  "expires_at": "2026-10-28T19:22:29.109279042Z",
  "resend_available_at": "2026-10-28T19:17:30.109279042Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "174644",
  "sent_at": "2026-10-28T19:17:29.111418901Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8498dfcb-63b4-42b1-a04c-812c63d95fd8",
  "code": "174644",
  "device_ref": "sandbox-16878"
}
```

```json
{
  "session_id": "3b0a419a-9592-4e77-9bd8-cbf0ec19bf52",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTk0OSwiaWF0IjoxNzkzMjE1MDQ5LCJqdGkiOiIzMzc0YTNlOC01ZWQ2LTRiM2QtOTgwMy05NTExYjZkODdhZmQiLCJzaWQiOiIzYjBhNDE5YS05NTkyLTRlNzctOWJkOC1jYmYwZWMxOWJmNTIifQ.0kdGCpfcw4lzi4wMo4mYgNgmQJHk6JKrOILFSAIdQco",
  "access_expires_at": "2026-10-28T19:32:29.414254948Z",
  "refresh_token": "Q8KRc9lVAEABozZnEOF-88ff_5PKSSHPc5ISJB2DLx0",
  "refresh_expires_at": "2026-11-27T19:17:29.413706582Z",
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
  "device_ref": "sandbox-31253"
}
```

```json
{
  "challenge_id": "cda9276c-0abb-4140-8ad3-975957f45187",
  "expires_at": "2026-10-28T19:22:29.962748103Z",
  "resend_available_at": "2026-10-28T19:17:30.962748103Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "291799",
  "sent_at": "2026-10-28T19:17:29.964884233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cda9276c-0abb-4140-8ad3-975957f45187",
  "code": "291799",
  "device_ref": "sandbox-31253"
}
```

```json
{
  "session_id": "8a4f8efd-db9b-4293-9442-626b509c93f7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNTk1MCwiaWF0IjoxNzkzMjE1MDUwLCJqdGkiOiJiMGNjYjljMC0xNmQ3LTQ2MzQtOGMzNy1kMjk2MDNkYmM1MGEiLCJzaWQiOiI4YTRmOGVmZC1kYjliLTQyOTMtOTQ0Mi02MjZiNTA5YzkzZjcifQ.SmLhoO2YiydJElntrHrr1iJT7Q4sXcfW9eG8de9OG4A",
  "access_expires_at": "2026-10-28T19:32:30.266875936Z",
  "refresh_token": "jNoWxMBZDOJCh-HafS0EM0JKiJS5OaIOa8xT7DauBfM",
  "refresh_expires_at": "2026-11-27T19:17:30.266269355Z",
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
  "phone": "+380698044345",
  "device_ref": "sandbox-1180"
}
```

```json
{
  "challenge_id": "e09b4c1a-326d-42e3-bb80-bfbdecb7e007",
  "expires_at": "2026-10-28T19:22:30.810728854Z",
  "resend_available_at": "2026-10-28T19:17:31.810728854Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380698044345` → **200**

```json
{
  "phone": "+380698044345",
  "audience": "CLIENT",
  "code": "446624",
  "sent_at": "2026-10-28T19:17:30.813100654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e09b4c1a-326d-42e3-bb80-bfbdecb7e007",
  "code": "446624",
  "device_ref": "sandbox-1180"
}
```

```json
{
  "session_id": "c4be24ce-a2df-4c25-af09-29ddf42e4244",
  "subject": {
    "type": "CLIENT",
    "id": "17c2a977-f690-4105-96a9-59ed241937c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2MyYTk3Ny1mNjkwLTQxMDUtOTZhOS01OWVkMjQxOTM3YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE1OTUxLCJpYXQiOjE3OTMyMTUwNTEsImp0aSI6ImI5NDUzNDk2LWUyZjYtNDZlYy04ZDYzLTNiYjc3MmFlNzI3MSIsInNpZCI6ImM0YmUyNGNlLWEyZGYtNGMyNS1hZjA5LTI5ZGRmNDJlNDI0NCJ9.pRlXLEjGS4LejlEj3l29ValvozBjzMS1_1M7BpYHHVQ",
  "access_expires_at": "2026-10-28T19:32:31.111670927Z",
  "refresh_token": "MLdMldzSnFdHHKRxtWmiOtbYUcnhqSNhDmYypDk8MFI",
  "refresh_expires_at": "2026-11-27T19:17:31.111127169Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "91fdf58c-8930-43ee-bfb3-be28cf2d7011",
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
  "id": "6800448e-a159-4e0d-a108-216950460153",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:22:31.406048Z",
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
  "command_id": "83bd4bdf-5f49-4d35-89fa-4a7999242f5e",
  "quote_id": "6800448e-a159-4e0d-a108-216950460153",
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
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
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
  "blizz_orders_total": 26,
  "blizz_orders_cancelled_total": 14,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 16,
  "blizz_dispatch_assigned_seconds_count": 15,
  "blizz_offers_total": 18,
  "blizz_dispatch_excluded_total": 9,
  "blizz_sms_sent_total": 67
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 15
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 12.506279088
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 16
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.140095456
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 15.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 18.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 60.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/57077e85-28a1-4be9-8b69-a015dae2f019` → **200**

```json
{
  "id": "57077e85-28a1-4be9-8b69-a015dae2f019",
  "short_number": 26,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "17c2a977-f690-4105-96a9-59ed241937c2",
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
  "created_at": "2026-10-28T19:17:31.699011Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
