# Sandbox transcript (2026-10-28T08:06:06Z, a18c667)

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
  "correlation_id": "91d60842-e380-4464-95c8-fbacc8aa2ab5"
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
  "session_id": "878427b0-f1a6-4646-8237-ebda2e207475",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NjcsImlhdCI6MTc5MzE3NDc2NywianRpIjoiOWQ2YTI5OTQtM2RlMS00YjJjLTk4MTItZjFkZGYwMjAzMWEwIiwic2lkIjoiODc4NDI3YjAtZjFhNi00NjQ2LTgyMzctZWJkYTJlMjA3NDc1In0.mcAv2lrgtrkB6FIcSXczqhyPexCLc-suCUn51YmuZao",
  "access_expires_at": "2026-10-28T08:21:07.390853368Z",
  "refresh_token": "WrGGrYsgWp0sbNJYA_26P8fN5jyWFiMt7-zp_AJtH6k",
  "refresh_expires_at": "2026-10-28T20:06:07.388299127Z",
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
  "session_id": "d35922ac-b031-4b7e-bd5e-a7994a47c2de",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NjgsImlhdCI6MTc5MzE3NDc2OCwianRpIjoiZTJhM2YyZGYtY2Q0MS00YjM1LWFkYzAtMGYwNzIzYmZiNDUzIiwic2lkIjoiZDM1OTIyYWMtYjAzMS00YjdlLWJkNWUtYTc5OTRhNDdjMmRlIn0.1GNHebIJCJqtOlFfHOhZ_EHLWwOfAikkhU9SFS1L7pc",
  "access_expires_at": "2026-10-28T08:21:08.724511075Z",
  "refresh_token": "OImA5UfhB7JZ9TN3zyJPKrsNcHQE-Tx5YFGgnPOcaMk",
  "refresh_expires_at": "2026-10-28T20:06:08.723545757Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "1412e085-372a-4391-88c2-f4781c0d1dc1",
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
  "id": "60eaa731-bbb0-4cc5-bf36-4f79e199256d",
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
  "created_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "created_at": "2026-10-28T08:06:08.794341Z",
  "updated_at": "2026-10-28T08:06:08.794341Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632210648",
  "device_ref": "sandbox-28926"
}
```

```json
{
  "challenge_id": "86de8a8d-e4c2-4cd3-8add-30c7a20dfc28",
  "expires_at": "2026-10-28T08:11:08.843527252Z",
  "resend_available_at": "2026-10-28T08:06:09.843527252Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632210648` → **200**

```json
{
  "phone": "+380632210648",
  "audience": "CLIENT",
  "code": "695593",
  "sent_at": "2026-10-28T08:06:08.854121146Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86de8a8d-e4c2-4cd3-8add-30c7a20dfc28",
  "code": "695593",
  "device_ref": "sandbox-28926"
}
```

```json
{
  "session_id": "03050bba-d110-4ef8-a406-2e3d5ef70d4d",
  "subject": {
    "type": "CLIENT",
    "id": "471cf7aa-44cd-44e1-a3a8-351276b7ee74"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NzFjZjdhYS00NGNkLTQ0ZTEtYTNhOC0zNTEyNzZiN2VlNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NjY4LCJpYXQiOjE3OTMxNzQ3NjgsImp0aSI6ImY0YTYxNjY4LWNiYjAtNDA0Ni1iNTE2LTg3OTRhNzlkZmJhOSIsInNpZCI6IjAzMDUwYmJhLWQxMTAtNGVmOC1hNDA2LTJlM2Q1ZWY3MGQ0ZCJ9.PsJGZWtvjbZdm1uvFvJW8DQ5PSIUqBylgYXBd32N9jQ",
  "access_expires_at": "2026-10-28T08:21:08.944089526Z",
  "refresh_token": "T6VUZzlLk9T0ATw856VZ8nlQr6-92cKl5StRrWjQR2I",
  "refresh_expires_at": "2026-11-27T08:06:08.941947452Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632210648` → **200**

```json
{
  "client_id": "471cf7aa-44cd-44e1-a3a8-351276b7ee74"
}
```

`POST /api/admin/v1/rider-wallets/471cf7aa-44cd-44e1-a3a8-351276b7ee74/top-ups` → **201**

```json
{
  "command_id": "315a5353-fdf6-4a99-a3f9-74d506de7492",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "471cf7aa-44cd-44e1-a3a8-351276b7ee74",
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
      "id": "b6217b5c-0063-4398-8473-bf4061a24695",
      "at": "2026-10-28T08:06:09.033392Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6b55ee04-4694-4256-a973-d5289e598258",
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
  "id": "766a0613-5c3b-4b21-bd2f-ace5041ab468",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:09.146752Z",
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
      "id": "60eaa731-bbb0-4cc5-bf36-4f79e199256d",
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
  "device_ref": "sandbox-18069"
}
```

```json
{
  "challenge_id": "d7310218-2640-4f19-8156-7c5bd88585ef",
  "expires_at": "2026-10-28T08:11:09.215856921Z",
  "resend_available_at": "2026-10-28T08:06:10.215856921Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "568261",
  "sent_at": "2026-10-28T08:06:09.219726702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7310218-2640-4f19-8156-7c5bd88585ef",
  "code": "568261",
  "device_ref": "sandbox-18069"
}
```

```json
{
  "session_id": "df46509d-4804-4c87-847d-ce98eb84eadd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY2OSwiaWF0IjoxNzkzMTc0NzY5LCJqdGkiOiJjMjBiNGUyOC00YzZhLTQwMDUtYTIyOS1lOGEzYjI2Zjc4YTAiLCJzaWQiOiJkZjQ2NTA5ZC00ODA0LTRjODctODQ3ZC1jZTk4ZWI4NGVhZGQifQ.dRF8YfEdW7TpIWTDwAlWM4ZLNz7p3bo9hZzgoxA2Zjk",
  "access_expires_at": "2026-10-28T08:21:09.278785744Z",
  "refresh_token": "cCHHePVMqnl8bduPyuoK6VPUm-NCI6Z28UOxISQTXAE",
  "refresh_expires_at": "2026-11-27T08:06:09.277912358Z",
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
  "command_id": "3032532d-75a5-47a7-884b-4786f0384529",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:09Z",
    "sequence": 1793174769345
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbae90b6-ab9b-4e91-8f06-d2b9970ea675",
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
  "last_heartbeat_at": "2026-10-28T08:06:09.391437Z",
  "last_location_at": "2026-10-28T08:06:09.391437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0d08ebb2-eb9d-4a91-8045-ea4203ef61f4",
  "quote_id": "766a0613-5c3b-4b21-bd2f-ace5041ab468",
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
  "id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "471cf7aa-44cd-44e1-a3a8-351276b7ee74",
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
  "created_at": "2026-10-28T08:06:09.493739Z",
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
  "client_id": "471cf7aa-44cd-44e1-a3a8-351276b7ee74",
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
      "id": "b6217b5c-0063-4398-8473-bf4061a24695",
      "at": "2026-10-28T08:06:09.033392Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
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
    "id": "ae5b3e5b-1fbc-4691-9a75-158b3a64210c",
    "order_id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef",
    "expires_at": "2026-10-28T08:06:24.507752Z",
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

`POST /api/driver/v1/offers/ae5b3e5b-1fbc-4691-9a75-158b3a64210c/accept` → **200**

```json
{
  "command_id": "7785e02b-d9f4-402a-b4c1-07f2169942d0"
}
```

```json
{
  "id": "70d11916-3d22-4d7e-8508-d4db429e26a9",
  "order_id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1a1c440f-1be9-4ce5-b1ee-26ef421747be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a1c440f-1be9-4ce5-b1ee-26ef421747be",
  "order_id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef",
  "assignment_id": "70d11916-3d22-4d7e-8508-d4db429e26a9",
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

`POST /api/driver/v1/work-sessions/dbae90b6-ab9b-4e91-8f06-d2b9970ea675/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:09Z",
    "sequence": 1793174769703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbae90b6-ab9b-4e91-8f06-d2b9970ea675",
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
  "last_heartbeat_at": "2026-10-28T08:06:09.72904Z",
  "last_location_at": "2026-10-28T08:06:09.72904Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1a1c440f-1be9-4ce5-b1ee-26ef421747be/arrive` → **200**

```json
{
  "command_id": "5aaefc8d-a552-4c47-a15d-779134e47da6",
  "expected_version": 0
}
```

```json
{
  "id": "1a1c440f-1be9-4ce5-b1ee-26ef421747be",
  "order_id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef",
  "assignment_id": "70d11916-3d22-4d7e-8508-d4db429e26a9",
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
  "arrived_at": "2026-10-28T08:06:09.779834Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1a1c440f-1be9-4ce5-b1ee-26ef421747be/start` → **200**

```json
{
  "command_id": "96dd6e38-484c-4efe-8b05-b7c648d9dffd",
  "expected_version": 1
}
```

```json
{
  "id": "1a1c440f-1be9-4ce5-b1ee-26ef421747be",
  "order_id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef",
  "assignment_id": "70d11916-3d22-4d7e-8508-d4db429e26a9",
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
  "arrived_at": "2026-10-28T08:06:09.779834Z",
  "started_at": "2026-10-28T08:06:09.825363Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1a1c440f-1be9-4ce5-b1ee-26ef421747be/complete` → **200**

```json
{
  "command_id": "5316f772-9864-481a-b9fa-785fb4b191e1",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:06:09Z",
  "cash_received": true
}
```

```json
{
  "id": "1a1c440f-1be9-4ce5-b1ee-26ef421747be",
  "order_id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef",
  "assignment_id": "70d11916-3d22-4d7e-8508-d4db429e26a9",
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
  "arrived_at": "2026-10-28T08:06:09.779834Z",
  "started_at": "2026-10-28T08:06:09.825363Z",
  "completed_at": "2026-10-28T08:06:09.89589Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "471cf7aa-44cd-44e1-a3a8-351276b7ee74",
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
      "id": "f8449c57-1ecc-4b1d-9072-591798213607",
      "at": "2026-10-28T08:06:10.52766Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef"
    },
    {
      "id": "b6217b5c-0063-4398-8473-bf4061a24695",
      "at": "2026-10-28T08:06:09.033392Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/60eaa731-bbb0-4cc5-bf36-4f79e199256d/archive` → **200**

```json
{
  "command_id": "05198f85-161f-4199-b547-67a699a55126",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "60eaa731-bbb0-4cc5-bf36-4f79e199256d",
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
  "created_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "created_at": "2026-10-28T08:06:08.794341Z",
  "updated_at": "2026-10-28T08:06:12.993824Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbae90b6-ab9b-4e91-8f06-d2b9970ea675",
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
  "last_heartbeat_at": "2026-10-28T08:06:09.72904Z",
  "last_location_at": "2026-10-28T08:06:09.72904Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dbae90b6-ab9b-4e91-8f06-d2b9970ea675/close` → **200**

```json
{
  "command_id": "fdb00bd0-480d-444a-814b-e7d5673feb8e",
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

Done: order 506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef.

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
  "session_id": "65e54b74-ed1a-4a3d-a9e9-a8a9658d93a3",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NzMsImlhdCI6MTc5MzE3NDc3MywianRpIjoiOWU3ZjI5MmYtMmJhNy00ZGVlLTgzOWEtNjQ0NmI4NGZmMDM1Iiwic2lkIjoiNjVlNTRiNzQtZWQxYS00YTNkLWE5ZTktYThhOTY1OGQ5M2EzIn0.9RJPK2vyah3iLwg_75mnOyhHgcw1GapY51m6ww3zugU",
  "access_expires_at": "2026-10-28T08:21:13.41749268Z",
  "refresh_token": "8LaWUorOFTe-tOvOqBOp-WtUuPcnLTO7lJbdYnlhd4Y",
  "refresh_expires_at": "2026-10-28T20:06:13.416525448Z",
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
  "command_id": "65607347-ad6d-467a-a52f-eb78d8b138f7",
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
  "session_id": "16d459d4-eb8d-438a-87dd-1dedfceb5c1a",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NzMsImlhdCI6MTc5MzE3NDc3MywianRpIjoiMWEwMTU4NjgtNGZkNi00MzY1LWI5NTAtZGVkYjY4YzU3OGMyIiwic2lkIjoiMTZkNDU5ZDQtZWI4ZC00MzhhLTg3ZGQtMWRlZGZjZWI1YzFhIn0.JcP_1oibFZQua_tUqbfiKgAyRwJutwcILi958XwYcvM",
  "access_expires_at": "2026-10-28T08:21:13.824119289Z",
  "refresh_token": "0lq0-r82PSsb75CXDrZxfToaR52SuNCtGAc-YDFT8Cg",
  "refresh_expires_at": "2026-10-28T20:06:13.823263721Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.265005853",
    "linkedid": "1730052700.265005853",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671701581"
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
    "id": "1730052700.265005853",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "d04badf0-671c-4823-9e9a-55b4c7038247",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671701581",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:06:13.854408Z",
      "answered_at": null,
      "ended_at": "2026-10-28T08:06:13.879963Z",
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
    "id": "1730052600.168721082",
    "linkedid": "1730052600.168721082",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671701581"
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
      "id": "f039e9c3-7088-4096-be36-8ca86f608aea",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671701581",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:06:13.946861Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/f039e9c3-7088-4096-be36-8ca86f608aea/answer` → **200**

```json
{
  "command_id": "0b249d37-d942-4828-bee6-f403a7d99816"
}
```

```json
{
  "id": "f039e9c3-7088-4096-be36-8ca86f608aea",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671701581",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "order_ids": [],
  "started_at": "2026-10-28T08:06:13.946861Z",
  "answered_at": "2026-10-28T08:06:14.011681Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.168721082",
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
    "id": "1730052600.168721082",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f039e9c3-7088-4096-be36-8ca86f608aea",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671701581",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [],
      "started_at": "2026-10-28T08:06:13.946861Z",
      "answered_at": "2026-10-28T08:06:14.011681Z",
      "ended_at": "2026-10-28T08:06:14.064952Z",
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
      "id": "f039e9c3-7088-4096-be36-8ca86f608aea",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671701581",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [],
      "started_at": "2026-10-28T08:06:13.946861Z",
      "answered_at": "2026-10-28T08:06:14.011681Z",
      "ended_at": "2026-10-28T08:06:14.064952Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:06:15.33997Z"
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
      "id": "f039e9c3-7088-4096-be36-8ca86f608aea",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671701581",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [],
      "started_at": "2026-10-28T08:06:13.946861Z",
      "answered_at": "2026-10-28T08:06:14.011681Z",
      "ended_at": "2026-10-28T08:06:14.064952Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:06:15.33997Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/f039e9c3-7088-4096-be36-8ca86f608aea/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/f039e9c3-7088-4096-be36-8ca86f608aea/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=f039e9c3-7088-4096-be36-8ca86f608aea` → **200**

```json
{
  "changes": [
    {
      "id": "8ce122e9-7081-4331-8317-36f719ec083d",
      "occurred_at": "2026-10-28T08:06:16.231653Z",
      "actor_type": "STAFF",
      "actor_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f039e9c3-7088-4096-be36-8ca86f608aea",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"be8061f3-34f2-49b8-8167-9582cc8c7308\", \"order_ids\": []}",
      "correlation_id": "c846599b-e8b4-4976-9af8-e8fdf74d7715"
    },
    {
      "id": "924bd16e-1571-46de-a9ef-8c3673edd9f7",
      "occurred_at": "2026-10-28T08:06:16.194111Z",
      "actor_type": "STAFF",
      "actor_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "f039e9c3-7088-4096-be36-8ca86f608aea",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"be8061f3-34f2-49b8-8167-9582cc8c7308\", \"order_ids\": []}",
      "correlation_id": "6a86e6b1-36ee-48e0-8e5d-6ea70e35cbcc"
    }
  ]
}
```

Done: call f039e9c3-7088-4096-be36-8ca86f608aea recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638127320",
  "device_ref": "sandbox-28471"
}
```

```json
{
  "challenge_id": "0b837125-f049-4a69-a921-192f5c7d1c6a",
  "expires_at": "2026-10-28T08:11:16.310895273Z",
  "resend_available_at": "2026-10-28T08:06:17.310895273Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638127320` → **200**

```json
{
  "phone": "+380638127320",
  "audience": "CLIENT",
  "code": "855338",
  "sent_at": "2026-10-28T08:06:16.314943238Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b837125-f049-4a69-a921-192f5c7d1c6a",
  "code": "855338",
  "device_ref": "sandbox-28471"
}
```

```json
{
  "session_id": "0aa64cd9-ec6d-4ede-afd7-85177241d54b",
  "subject": {
    "type": "CLIENT",
    "id": "fc9d7028-94a8-48ed-88ab-9a9a038c7bb0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzlkNzAyOC05NGE4LTQ4ZWQtODhhYi05YTlhMDM4YzdiYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njc2LCJpYXQiOjE3OTMxNzQ3NzYsImp0aSI6IjA2OWFmYzkwLTNlMGEtNGYwNS05NzZiLWRlZmM1ZWM4OTdmMiIsInNpZCI6IjBhYTY0Y2Q5LWVjNmQtNGVkZS1hZmQ3LTg1MTc3MjQxZDU0YiJ9.3_VrH2VNwAs_qLLeT9AVsNaDJ9sOvhkTTQLtkiWeVkc",
  "access_expires_at": "2026-10-28T08:21:16.385071332Z",
  "refresh_token": "ijdUPk66eeexTa9lOpjGaIG1szmctLeL2g5zY-p0Yrg",
  "refresh_expires_at": "2026-11-27T08:06:16.384376104Z",
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
  "device_ref": "sandbox-25805"
}
```

```json
{
  "challenge_id": "381d3ad1-eff6-4c82-8f63-6d151fbb2c39",
  "expires_at": "2026-10-28T08:11:16.445786907Z",
  "resend_available_at": "2026-10-28T08:06:17.445786907Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "197154",
  "sent_at": "2026-10-28T08:06:16.449300159Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "381d3ad1-eff6-4c82-8f63-6d151fbb2c39",
  "code": "197154",
  "device_ref": "sandbox-25805"
}
```

```json
{
  "session_id": "31b45260-83ce-4c68-a926-1854cfdad74a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY3NiwiaWF0IjoxNzkzMTc0Nzc2LCJqdGkiOiI4YjFjZmQ0Yy03ZGMxLTRlYTktOWU0Yi02ZDJkYTdjZThhNTciLCJzaWQiOiIzMWI0NTI2MC04M2NlLTRjNjgtYTkyNi0xODU0Y2ZkYWQ3NGEifQ.3tMZwRdNIo8QPICmyOq2fYsczPnAcRIc6TjTLf3M1xo",
  "access_expires_at": "2026-10-28T08:21:16.512317433Z",
  "refresh_token": "QVdv0lmTNu_M3SL-IPAHFsI6RVB5wlaOHd2SgCZCerU",
  "refresh_expires_at": "2026-11-27T08:06:16.511528018Z",
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
  "session_id": "a5e65e18-b736-4699-b261-04f0836ec4a6",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NzYsImlhdCI6MTc5MzE3NDc3NiwianRpIjoiMjVmMDI1MjYtOWMxZS00ZDE5LWI3YTItZTgwYzliY2JkYTEwIiwic2lkIjoiYTVlNjVlMTgtYjczNi00Njk5LWIyNjEtMDRmMDgzNmVjNGE2In0.6yfSc-bhzSfppALGubsUZ8R38zX0N0O_Bv2yvOU-eH8",
  "access_expires_at": "2026-10-28T08:21:16.859112163Z",
  "refresh_token": "_glC3dyNKVCz9N5QdwFClbA1X_RW_Vlm8arZ5u-q3Cs",
  "refresh_expires_at": "2026-10-28T20:06:16.858281422Z",
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
  "session_id": "69249faf-375d-4663-8019-d55a776abc26",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2NzcsImlhdCI6MTc5MzE3NDc3NywianRpIjoiODE4Yzg3NGYtZjM5Mi00NjliLTgzYTgtZmNiYWEwYThlNDhjIiwic2lkIjoiNjkyNDlmYWYtMzc1ZC00NjYzLTgwMTktZDU1YTc3NmFiYzI2In0.Dz5-4n-X8ywah0-1sZDcgSzkz-qmE7NMfkSuF7txwY4",
  "access_expires_at": "2026-10-28T08:21:17.180216714Z",
  "refresh_token": "QEYR2G8ay_PLoxWqeq74BDlNkBBA3eoU4BNSzzVhM4Q",
  "refresh_expires_at": "2026-10-28T20:06:17.179426811Z",
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
  "command_id": "ea633f07-636c-4dc6-abef-d235eb67928e",
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
  "id": "7f8b144f-e921-42fd-949d-399069b31f65",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:11:17.248015Z",
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
  "command_id": "516c70b3-ea99-459e-bffb-5be6c1f4b351",
  "quote_id": "7f8b144f-e921-42fd-949d-399069b31f65",
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
  "id": "28bdf63e-d9c4-49eb-ac17-17959026da4c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc9d7028-94a8-48ed-88ab-9a9a038c7bb0",
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
  "created_at": "2026-10-28T08:06:17.29212Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/28bdf63e-d9c4-49eb-ac17-17959026da4c` → **200**

```json
{
  "id": "28bdf63e-d9c4-49eb-ac17-17959026da4c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc9d7028-94a8-48ed-88ab-9a9a038c7bb0",
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
  "created_at": "2026-10-28T08:06:17.29212Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/28bdf63e-d9c4-49eb-ac17-17959026da4c/cancel` → **200**

```json
{
  "command_id": "d9b2c40d-93a6-4b96-a46f-096deda081e7",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "28bdf63e-d9c4-49eb-ac17-17959026da4c",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fc9d7028-94a8-48ed-88ab-9a9a038c7bb0",
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
  "created_at": "2026-10-28T08:06:17.29212Z",
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
  "command_id": "1626dd86-c1e1-4eba-a42f-7398d3096e9b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:17Z",
    "sequence": 1793174777431
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:06:17.451073Z",
  "last_location_at": "2026-10-28T08:06:17.451073Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26378"
}
```

```json
{
  "challenge_id": "4249415b-bd49-4a54-a79b-19b3b5a63c72",
  "expires_at": "2026-10-28T08:11:17.483767223Z",
  "resend_available_at": "2026-10-28T08:06:18.483767223Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "574331",
  "sent_at": "2026-10-28T08:06:17.486891398Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4249415b-bd49-4a54-a79b-19b3b5a63c72",
  "code": "574331",
  "device_ref": "sandbox-26378"
}
```

```json
{
  "session_id": "64399b1a-dea9-484b-bc95-321c4e24860b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY3NywiaWF0IjoxNzkzMTc0Nzc3LCJqdGkiOiJkZGQ2OTE0Ni0wY2IwLTQxZGEtOTdiOC1lN2I3NzcyYTE0YzAiLCJzaWQiOiI2NDM5OWIxYS1kZWE5LTQ4NGItYmM5NS0zMjFjNGUyNDg2MGIifQ.wRPmTOMit9izY7h3TG6Jk8HpcemKtoN4_XttxTd0XpE",
  "access_expires_at": "2026-10-28T08:21:17.545793781Z",
  "refresh_token": "-zaJqzzOUjyK8Z3bdPVleUe9EGkz_KfCiPuFH9ahSpk",
  "refresh_expires_at": "2026-11-27T08:06:17.545168601Z",
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
  "command_id": "577b3747-85ef-4bc2-86b6-4555aa6c4b59",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:17Z",
    "sequence": 1793174777603
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "91ef02b6-270e-49bb-90b5-da0007e18174",
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
  "last_heartbeat_at": "2026-10-28T08:06:17.623983Z",
  "last_location_at": "2026-10-28T08:06:17.623983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ddf4d0ca-986b-4026-b1c8-241b8571e193",
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
  "id": "97304d96-062e-42e4-b8e3-4cac0c6ebe05",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:11:17.667486Z",
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
  "command_id": "a6444024-5e90-49cb-876d-349049112ba9",
  "quote_id": "97304d96-062e-42e4-b8e3-4cac0c6ebe05",
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
  "id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fc9d7028-94a8-48ed-88ab-9a9a038c7bb0",
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
  "created_at": "2026-10-28T08:06:17.710621Z",
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
    "id": "80064e74-4dba-405a-b528-53e525179cef",
    "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
    "expires_at": "2026-10-28T08:06:32.715834Z",
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

`POST /api/driver/v1/offers/80064e74-4dba-405a-b528-53e525179cef/accept` → **200**

```json
{
  "command_id": "cae7d4cb-bee5-41b9-b394-39199f5bbf00"
}
```

```json
{
  "id": "a3b77c20-6cc1-43af-b641-26ee6f18e8d6",
  "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ad5c9bec-7c89-4e33-b75b-352a6521dcaf",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ad5c9bec-7c89-4e33-b75b-352a6521dcaf",
  "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
  "assignment_id": "a3b77c20-6cc1-43af-b641-26ee6f18e8d6",
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

`POST /api/driver/v1/trips/ad5c9bec-7c89-4e33-b75b-352a6521dcaf/cancel` → **200**

```json
{
  "command_id": "df5881d1-cd37-4777-a6c0-36f5a3112954",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "ad5c9bec-7c89-4e33-b75b-352a6521dcaf",
  "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
  "assignment_id": "a3b77c20-6cc1-43af-b641-26ee6f18e8d6",
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

`GET /api/rider/v1/orders/0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db` → **200**

```json
{
  "id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fc9d7028-94a8-48ed-88ab-9a9a038c7bb0",
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
    "id": "a3b77c20-6cc1-43af-b641-26ee6f18e8d6",
    "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ad5c9bec-7c89-4e33-b75b-352a6521dcaf",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:06:17.710621Z",
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
    "id": "6af22953-2584-480c-a4d0-4a4eed46cd4a",
    "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
    "expires_at": "2026-10-28T08:06:32.862949Z",
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

`POST /api/driver/v1/offers/6af22953-2584-480c-a4d0-4a4eed46cd4a/accept` → **200**

```json
{
  "command_id": "1154ed1a-39e2-411f-a624-bc272c6c23bb"
}
```

```json
{
  "id": "9246856a-9dc4-4afa-b400-a2a365954f81",
  "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f0d0c1d3-3288-49b2-a494-c3e722787761",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f0d0c1d3-3288-49b2-a494-c3e722787761",
  "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
  "assignment_id": "9246856a-9dc4-4afa-b400-a2a365954f81",
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

`POST /api/driver/v1/trips/f0d0c1d3-3288-49b2-a494-c3e722787761/cancel` → **200**

```json
{
  "command_id": "59cb99a3-4ba5-42e6-9097-590d7bf41d2e",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f0d0c1d3-3288-49b2-a494-c3e722787761",
  "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
  "assignment_id": "9246856a-9dc4-4afa-b400-a2a365954f81",
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
    "id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:06:17.710621Z",
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
    "id": "28bdf63e-d9c4-49eb-ac17-17959026da4c",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:06:17.29212Z",
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

`GET /api/operator/v1/orders/0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:06:17.711518Z",
      "actor": {
        "type": "CLIENT",
        "id": "fc9d7028-94a8-48ed-88ab-9a9a038c7bb0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
        "quote_id": "97304d96-062e-42e4-b8e3-4cac0c6ebe05",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:06:17.71453Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
        "attempt_id": "35a11f60-51fe-46ca-9659-868b13e47050",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:06:17.721154Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "80064e74-4dba-405a-b528-53e525179cef",
        "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:06:17.785804Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "80064e74-4dba-405a-b528-53e525179cef",
        "order_id": "0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "a3b77c20-6cc1-43af-b641-26ee6f18e8d6"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 28bdf63e-d9c4-49eb-ac17-17959026da4c, 0192e4ad-1f7a-4b48-888c-7a0f2fa1e6db.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731892520",
  "device_ref": "sandbox-14495"
}
```

```json
{
  "challenge_id": "6898a9c2-8c1c-4f17-b9b9-f824c6038ca0",
  "expires_at": "2026-10-28T08:11:18.130247526Z",
  "resend_available_at": "2026-10-28T08:06:19.130247526Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731892520` → **200**

```json
{
  "phone": "+380731892520",
  "audience": "CLIENT",
  "code": "119137",
  "sent_at": "2026-10-28T08:06:18.133216331Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6898a9c2-8c1c-4f17-b9b9-f824c6038ca0",
  "code": "119137",
  "device_ref": "sandbox-14495"
}
```

```json
{
  "session_id": "41d689df-f63f-4714-8513-18a359106f92",
  "subject": {
    "type": "CLIENT",
    "id": "59faa549-4918-44ee-aa0e-3702ec85d50c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWZhYTU0OS00OTE4LTQ0ZWUtYWEwZS0zNzAyZWM4NWQ1MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njc4LCJpYXQiOjE3OTMxNzQ3NzgsImp0aSI6Ijk5YmYzNTEwLWQyMmQtNDZjMS05NTlhLTRjY2RjMWRkNGY4OSIsInNpZCI6IjQxZDY4OWRmLWY2M2YtNDcxNC04NTEzLTE4YTM1OTEwNmY5MiJ9.5QmJc5Zbx0r8pbhLw_JMkD3B1JKXVy-RCPLZ4MnTIWY",
  "access_expires_at": "2026-10-28T08:21:18.191173501Z",
  "refresh_token": "I3irirNBwFLwUcG-8OdGGNaTRX87kTqFzDn4s12R-yM",
  "refresh_expires_at": "2026-11-27T08:06:18.190458646Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d853cf9c-19be-4e34-a02b-573fd903a7d2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6d0876a3-d7a9-4233-97d1-e1dffd0495c3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6d0876a3-d7a9-4233-97d1-e1dffd0495c3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "637a4bfd58a2843ecbcff4ea813fcdf7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6d0876a3-d7a9-4233-97d1-e1dffd0495c3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731892520"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6d0876a3-d7a9-4233-97d1-e1dffd0495c3",
  "expires_at": "2026-10-28T08:36:18.22834Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/6d0876a3-d7a9-4233-97d1-e1dffd0495c3` → **200**

```json
{
  "id": "6d0876a3-d7a9-4233-97d1-e1dffd0495c3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:36:18.22834Z",
  "card": {
    "id": "d4d483e6-04a6-4837-bd63-ee2be971b30f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8904",
    "card_type": "Visa",
    "created_at": "2026-10-28T08:06:18.275739Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "d4d483e6-04a6-4837-bd63-ee2be971b30f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8904",
      "card_type": "Visa",
      "created_at": "2026-10-28T08:06:18.275739Z"
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
  "device_ref": "sandbox-11681"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "04ab7250-f489-47bc-b3de-e4ffa62e1454",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11681"
}
```

```json
{
  "challenge_id": "f04298ca-10bc-40dd-a45e-c6c0391f598e",
  "expires_at": "2026-10-28T08:11:19.394372358Z",
  "resend_available_at": "2026-10-28T08:06:20.394372358Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "826155",
  "sent_at": "2026-10-28T08:06:19.397733942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f04298ca-10bc-40dd-a45e-c6c0391f598e",
  "code": "826155",
  "device_ref": "sandbox-11681"
}
```

```json
{
  "session_id": "b3add3b7-8540-468c-aebb-2e10eba61f4d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY3OSwiaWF0IjoxNzkzMTc0Nzc5LCJqdGkiOiI3YTcxNzg5Mi0yNWY2LTRkMmQtOTc5My0zMGI4MmRmODc3MDciLCJzaWQiOiJiM2FkZDNiNy04NTQwLTQ2OGMtYWViYi0yZTEwZWJhNjFmNGQifQ.owRS6ysffYbdKXST5vkXzue9OZuL-A1Pl2woqRBXVek",
  "access_expires_at": "2026-10-28T08:21:19.459621823Z",
  "refresh_token": "p102mQj4IDXQUnF_OYftlFdpgPf0Q2lh6makqFUCqxk",
  "refresh_expires_at": "2026-11-27T08:06:19.45886393Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "91ef02b6-270e-49bb-90b5-da0007e18174",
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
  "last_heartbeat_at": "2026-10-28T08:06:17.623983Z",
  "last_location_at": "2026-10-28T08:06:17.623983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/91ef02b6-270e-49bb-90b5-da0007e18174/handover` → **200**

```json
{
  "command_id": "a68d51ed-23f4-4bfa-b65b-737ccb42da7f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "91ef02b6-270e-49bb-90b5-da0007e18174",
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
  "last_heartbeat_at": "2026-10-28T08:06:17.623983Z",
  "last_location_at": "2026-10-28T08:06:17.623983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/91ef02b6-270e-49bb-90b5-da0007e18174/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:19Z",
    "sequence": 1793174779564
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "91ef02b6-270e-49bb-90b5-da0007e18174",
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
  "last_heartbeat_at": "2026-10-28T08:06:19.58524Z",
  "last_location_at": "2026-10-28T08:06:19.58524Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "034bcef6-77c4-4af5-a3c6-ff314029c0f9",
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
  "id": "e1858548-0af8-490c-9ccf-2975f4fa58c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T08:11:19.625428Z",
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
  "command_id": "6043523f-8987-4451-b00b-9ad2a2a579de",
  "quote_id": "e1858548-0af8-490c-9ccf-2975f4fa58c9",
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
  "id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "59faa549-4918-44ee-aa0e-3702ec85d50c",
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
  "created_at": "2026-10-28T08:06:19.667647Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db` → **200**

```json
{
  "id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "59faa549-4918-44ee-aa0e-3702ec85d50c",
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
  "created_at": "2026-10-28T08:06:19.667647Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db` → **200**

```json
{
  "id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "59faa549-4918-44ee-aa0e-3702ec85d50c",
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
  "created_at": "2026-10-28T08:06:19.667647Z",
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
    "id": "7828ff1b-48b0-48c6-89f4-275dde6ecffd",
    "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
    "expires_at": "2026-10-28T08:06:35.660027Z",
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

`POST /api/driver/v1/offers/7828ff1b-48b0-48c6-89f4-275dde6ecffd/accept` → **200**

```json
{
  "command_id": "d0e7ed8b-d2ff-4d51-bb45-c58702a93cbb"
}
```

```json
{
  "id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "assignment_id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
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

`POST /api/driver/v1/work-sessions/91ef02b6-270e-49bb-90b5-da0007e18174/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:20Z",
    "sequence": 1793174780846
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "91ef02b6-270e-49bb-90b5-da0007e18174",
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
  "last_heartbeat_at": "2026-10-28T08:06:20.86672Z",
  "last_location_at": "2026-10-28T08:06:20.86672Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3412d59f-2c38-4e73-92bc-d3d403e4b905/arrive` → **200**

```json
{
  "command_id": "46ea8d20-df61-4819-8a1f-2326b16a6b73",
  "expected_version": 0
}
```

```json
{
  "id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "assignment_id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
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
  "arrived_at": "2026-10-28T08:06:20.904143Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3412d59f-2c38-4e73-92bc-d3d403e4b905/start` → **200**

```json
{
  "command_id": "6af7ee1b-03fc-4c1e-bb0e-665c2355be1c",
  "expected_version": 1
}
```

```json
{
  "id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "assignment_id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
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
  "arrived_at": "2026-10-28T08:06:20.904143Z",
  "started_at": "2026-10-28T08:06:20.944995Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3412d59f-2c38-4e73-92bc-d3d403e4b905/complete` → **200**

```json
{
  "command_id": "2adfd933-6de3-46b2-b8d0-e7f48236c006",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:06:20Z"
}
```

```json
{
  "id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "assignment_id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
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
  "arrived_at": "2026-10-28T08:06:20.904143Z",
  "started_at": "2026-10-28T08:06:20.944995Z",
  "completed_at": "2026-10-28T08:06:20.989616Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db` → **200**

```json
{
  "id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "59faa549-4918-44ee-aa0e-3702ec85d50c",
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
    "id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
    "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:19.667647Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db` → **200**

```json
{
  "id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "59faa549-4918-44ee-aa0e-3702ec85d50c",
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
    "id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
    "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:19.667647Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db` → **200**

```json
{
  "id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "59faa549-4918-44ee-aa0e-3702ec85d50c",
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
    "id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
    "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:19.667647Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db` → **200**

```json
{
  "id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "59faa549-4918-44ee-aa0e-3702ec85d50c",
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
    "id": "033bb3eb-48e4-4a55-a2b9-4dc8fa6bdb64",
    "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3412d59f-2c38-4e73-92bc-d3d403e4b905",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:19.667647Z",
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
      "id": "f0b75133-c323-4b7b-bf50-c511d3c798fb",
      "at": "2026-10-28T08:06:21.69772Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db/tip` → **200**

```json
{
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
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
  "available_until": "2026-10-29T08:06:20.989616Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db/tip` → **201**

```json
{
  "command_id": "e473868c-73d0-4953-b343-042d12827b69",
  "amount_minor": 2500
}
```

```json
{
  "id": "6907ecdf-6b92-4f55-b318-9b3888497e3a",
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T08:06:24.23902Z"
}
```

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db/tip` → **200**

```json
{
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
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
  "available_until": "2026-10-29T08:06:20.989616Z",
  "open": false,
  "tip": {
    "id": "6907ecdf-6b92-4f55-b318-9b3888497e3a",
    "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T08:06:24.23902Z"
  }
}
```

`GET /api/rider/v1/orders/c015dd53-c306-48ef-a09a-9ba23e1450db/tip` → **200**

```json
{
  "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
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
  "available_until": "2026-10-29T08:06:20.989616Z",
  "open": false,
  "tip": {
    "id": "6907ecdf-6b92-4f55-b318-9b3888497e3a",
    "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T08:06:24.23902Z"
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
      "id": "f0b75133-c323-4b7b-bf50-c511d3c798fb",
      "at": "2026-10-28T08:06:21.69772Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
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
      "id": "a417a1d4-888b-43d8-8d16-6075662d3373",
      "at": "2026-10-28T08:06:25.759312Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
      "counterpart_id": null
    },
    {
      "id": "f0b75133-c323-4b7b-bf50-c511d3c798fb",
      "at": "2026-10-28T08:06:21.69772Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c015dd53-c306-48ef-a09a-9ba23e1450db",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "91ef02b6-270e-49bb-90b5-da0007e18174",
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
  "last_heartbeat_at": "2026-10-28T08:06:20.86672Z",
  "last_location_at": "2026-10-28T08:06:20.86672Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/91ef02b6-270e-49bb-90b5-da0007e18174/close` → **200**

```json
{
  "command_id": "2d4303bb-a913-43d3-8132-c1d8b1625b8a",
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

Done: card order c015dd53-c306-48ef-a09a-9ba23e1450db.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736989807",
  "device_ref": "sandbox-21859"
}
```

```json
{
  "challenge_id": "6075ead5-53fa-4698-a1ce-96b0c4b61731",
  "expires_at": "2026-10-28T08:11:26.462280241Z",
  "resend_available_at": "2026-10-28T08:06:27.462280241Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736989807` → **200**

```json
{
  "phone": "+380736989807",
  "audience": "CLIENT",
  "code": "172412",
  "sent_at": "2026-10-28T08:06:26.46517642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6075ead5-53fa-4698-a1ce-96b0c4b61731",
  "code": "172412",
  "device_ref": "sandbox-21859"
}
```

```json
{
  "session_id": "60531601-cc57-4835-8320-2b754336710e",
  "subject": {
    "type": "CLIENT",
    "id": "069302db-02fa-47dc-873d-e2ad06247762"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNjkzMDJkYi0wMmZhLTQ3ZGMtODczZC1lMmFkMDYyNDc3NjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njg2LCJpYXQiOjE3OTMxNzQ3ODYsImp0aSI6IjU5OGJlNDE1LTE4MDItNDkwMi05MmMzLWVhMDIwM2VlZGQxZCIsInNpZCI6IjYwNTMxNjAxLWNjNTctNDgzNS04MzIwLTJiNzU0MzM2NzEwZSJ9.57VxMrTEqXp7TRxn0XDyBSCTFaEyIN3Glvo7RrCMMiQ",
  "access_expires_at": "2026-10-28T08:21:26.523813836Z",
  "refresh_token": "0uxbmfpcF_tU5hOQaJJ1Dgn9Ej-halWVFZEK9X1yNms",
  "refresh_expires_at": "2026-11-27T08:06:26.523106605Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "845e3fe2-a09a-4717-a530-0a67fd7f8bd2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "c07a2697-62cb-4a1b-96f5-e302cfb020b0",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c07a2697-62cb-4a1b-96f5-e302cfb020b0",
    "orderDate": "1793174786",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "6e580a81701608f8b3f6f24410d35986",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c07a2697-62cb-4a1b-96f5-e302cfb020b0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736989807"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c07a2697-62cb-4a1b-96f5-e302cfb020b0",
  "created_at": "2026-10-28T08:06:26.563522Z",
  "expires_at": "2026-10-28T08:36:26.563522Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/c07a2697-62cb-4a1b-96f5-e302cfb020b0` → **200**

```json
{
  "id": "c07a2697-62cb-4a1b-96f5-e302cfb020b0",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:06:26.563522Z",
  "expires_at": "2026-10-28T08:36:26.563522Z",
  "completed_at": "2026-10-28T08:06:26.605356Z",
  "masked_pan": "41****6954",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "069302db-02fa-47dc-873d-e2ad06247762",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "069302db-02fa-47dc-873d-e2ad06247762",
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
      "id": "b3bd2886-e84e-4eea-a26b-af3148000b01",
      "at": "2026-10-28T08:06:26.771021Z",
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
  "client_id": "069302db-02fa-47dc-873d-e2ad06247762",
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
      "id": "b3bd2886-e84e-4eea-a26b-af3148000b01",
      "at": "2026-10-28T08:06:26.771021Z",
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
  "device_ref": "sandbox-6744"
}
```

```json
{
  "challenge_id": "a1cf73fe-c018-49f3-b7be-d2f1cf82806b",
  "expires_at": "2026-10-28T08:11:27.749039717Z",
  "resend_available_at": "2026-10-28T08:06:28.749039717Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "628363",
  "sent_at": "2026-10-28T08:06:27.752272328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1cf73fe-c018-49f3-b7be-d2f1cf82806b",
  "code": "628363",
  "device_ref": "sandbox-6744"
}
```

```json
{
  "session_id": "8cdc00c1-a9f6-4598-8f02-8181dc4f91c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTY4NywiaWF0IjoxNzkzMTc0Nzg3LCJqdGkiOiI5MDg1MTkwNC1hYmY0LTQ3MjItYWE1YS1iMDVmNTA3YWZjMzYiLCJzaWQiOiI4Y2RjMDBjMS1hOWY2LTQ1OTgtOGYwMi04MTgxZGM0ZjkxYzQifQ.qGdezqzkUFnmol7J0d1sJw9B7JvjM2PsedzsMMB32Ck",
  "access_expires_at": "2026-10-28T08:21:27.816974979Z",
  "refresh_token": "Qw7xtXcgE1EUv2mW9kTlOtORBf7rZecI4e_V-ZfP3-A",
  "refresh_expires_at": "2026-11-27T08:06:27.816165718Z",
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
  "command_id": "c793fbc5-291f-437e-a631-d8f6f16b7e1f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "500a9774-83af-4994-9801-c0e82d20f0ef",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-500a9774-83af-4994-9801-c0e82d20f0ef",
    "orderDate": "1793174787",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6c56410a4efe94c7c750835dd6692473",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=500a9774-83af-4994-9801-c0e82d20f0ef",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=500a9774-83af-4994-9801-c0e82d20f0ef",
  "created_at": "2026-10-28T08:06:27.877532Z",
  "expires_at": "2026-10-28T08:36:27.877532Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/500a9774-83af-4994-9801-c0e82d20f0ef` → **200**

```json
{
  "id": "500a9774-83af-4994-9801-c0e82d20f0ef",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:06:27.877532Z",
  "expires_at": "2026-10-28T08:36:27.877532Z",
  "completed_at": "2026-10-28T08:06:27.92705Z",
  "masked_pan": "41****5359",
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
      "id": "74035792-59e8-4b35-a0a2-8b1b8aa1028b",
      "at": "2026-10-28T08:06:28.783975Z",
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
  "command_id": "0cb1d596-ec06-4d45-8afb-d22b5ac18ad8",
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
  "correlation_id": "d407e264-12d0-4ec5-81e7-9bd8beefa9f1"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674057762",
  "device_ref": "sandbox-3348"
}
```

```json
{
  "challenge_id": "3aa0f5d0-f09b-428e-b22c-492ec038f199",
  "expires_at": "2026-10-28T08:11:29.079166516Z",
  "resend_available_at": "2026-10-28T08:06:30.079166516Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674057762` → **200**

```json
{
  "phone": "+380674057762",
  "audience": "CLIENT",
  "code": "738163",
  "sent_at": "2026-10-28T08:06:29.082666504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3aa0f5d0-f09b-428e-b22c-492ec038f199",
  "code": "738163",
  "device_ref": "sandbox-3348"
}
```

```json
{
  "session_id": "73abee8f-91ab-45c2-821f-c6dba2c19e40",
  "subject": {
    "type": "CLIENT",
    "id": "45b60211-3b3b-4b99-a89d-f1e8c7e8e37e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NWI2MDIxMS0zYjNiLTRiOTktYTg5ZC1mMWU4YzdlOGUzN2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njg5LCJpYXQiOjE3OTMxNzQ3ODksImp0aSI6IjMyM2Q3ZTVmLWU0MmQtNGU3Ni1hOGJmLTllZmI5YWYwYzY5NSIsInNpZCI6IjczYWJlZThmLTkxYWItNDVjMi04MjFmLWM2ZGJhMmMxOWU0MCJ9.JADNMHs4zGIuN54wDQuKkRvDYYe3pmNrLeymAa0T55E",
  "access_expires_at": "2026-10-28T08:21:29.142722222Z",
  "refresh_token": "enqQHm6bBSs9nlJnHrFdsMi7gvKPAd69R8_xyl9v4yA",
  "refresh_expires_at": "2026-11-27T08:06:29.14204667Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "45b60211-3b3b-4b99-a89d-f1e8c7e8e37e",
  "session_id": "73abee8f-91ab-45c2-821f-c6dba2c19e40",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1aa101eb-615e-4794-87d2-14f1ebb5e25a",
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
  "id": "c2f1e7ce-b35b-4e44-b258-20ccf8ef2cf3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:29.208455Z",
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
  "challenge_id": "23438866-aaf4-442a-8cd8-3dbce72ae0cd",
  "expires_at": "2026-10-28T08:11:31.248132856Z",
  "resend_available_at": "2026-10-28T08:06:32.248132856Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674057762` → **200**

```json
{
  "phone": "+380674057762",
  "audience": "CLIENT",
  "code": "336465",
  "sent_at": "2026-10-28T08:06:31.250487622Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "98d09666-4ed3-46df-80a0-e3c06c765c93",
  "challenge_id": "23438866-aaf4-442a-8cd8-3dbce72ae0cd",
  "otp_code": "336465"
}
```

```json
{
  "client_id": "45b60211-3b3b-4b99-a89d-f1e8c7e8e37e",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T08:06:31.322488381Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "5cb4740c-efd0-4afa-985d-e6d964bd42bb",
  "quote_id": "c2f1e7ce-b35b-4e44-b258-20ccf8ef2cf3",
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
  "correlation_id": "fae161a3-77bb-406f-83a6-60b660b3355d"
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
  "session_id": "9f6f5bfd-e98f-41c4-8bfd-a63e682b5733",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2OTEsImlhdCI6MTc5MzE3NDc5MSwianRpIjoiMjkxZGNjYjAtMDc1Mi00NzYzLTljYmYtMmQxZGI0YmU2Y2FiIiwic2lkIjoiOWY2ZjViZmQtZTk4Zi00MWM0LThiZmQtYTYzZTY4MmI1NzMzIn0.2MBrGX7t9yNt2AZKN4Ru7bqdyvSfy1rZpgyfqqWr3L4",
  "access_expires_at": "2026-10-28T08:21:31.686320457Z",
  "refresh_token": "GDo6cPhQiUWaAYCoh1WntyTVdygf0JYZx-uJeTfh8Fs",
  "refresh_expires_at": "2026-10-28T20:06:31.6857064Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "45b60211-3b3b-4b99-a89d-f1e8c7e8e37e",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T08:06:31.322488Z",
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

`POST /api/admin/v1/client-deletions/45b60211-3b3b-4b99-a89d-f1e8c7e8e37e/complete` → **200**

```json
{
  "command_id": "1ea3ee04-d96c-4595-8a38-2544d6eae61e",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "45b60211-3b3b-4b99-a89d-f1e8c7e8e37e",
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
  "correlation_id": "741c7ce9-3ffa-46d2-b7db-e78d59f443e6"
}
```

Done: client 45b60211-3b3b-4b99-a89d-f1e8c7e8e37e anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662737845",
  "device_ref": "sandbox-3766"
}
```

```json
{
  "challenge_id": "4397c8c1-51fa-4fd8-801a-512682815f56",
  "expires_at": "2026-10-28T08:11:31.838703423Z",
  "resend_available_at": "2026-10-28T08:06:32.838703423Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662737845` → **200**

```json
{
  "phone": "+380662737845",
  "audience": "CLIENT",
  "code": "952909",
  "sent_at": "2026-10-28T08:06:31.841359871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4397c8c1-51fa-4fd8-801a-512682815f56",
  "code": "952909",
  "device_ref": "sandbox-3766"
}
```

```json
{
  "session_id": "d67077bc-c420-4757-b8f8-c788a7e234b9",
  "subject": {
    "type": "CLIENT",
    "id": "53076e1c-1709-443f-8844-0c31196e56a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzA3NmUxYy0xNzA5LTQ0M2YtODg0NC0wYzMxMTk2ZTU2YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NjkxLCJpYXQiOjE3OTMxNzQ3OTEsImp0aSI6IjI4ZjU3YmJjLTA3YjEtNDM0OC04MTVmLTY2NTMyMmY3NTE2YyIsInNpZCI6ImQ2NzA3N2JjLWM0MjAtNDc1Ny1iOGY4LWM3ODhhN2UyMzRiOSJ9.m7Gm3y_cUc9VOqqYRv1PIsSQuCidvbr6pNGjso6aOas",
  "access_expires_at": "2026-10-28T08:21:31.901424657Z",
  "refresh_token": "HkEwVG_Gy2xMzz1uftunZSrK34SwCGYwBEF4-PQuIjU",
  "refresh_expires_at": "2026-11-27T08:06:31.900738796Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "53076e1c-1709-443f-8844-0c31196e56a7",
  "session_id": "d67077bc-c420-4757-b8f8-c788a7e234b9",
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
  "session_id": "4191c08b-8392-4877-ac48-2ca2b701cd67",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU2OTIsImlhdCI6MTc5MzE3NDc5MiwianRpIjoiYWE5MDkyZmUtMzZlYy00ZGQ1LTg0OWEtMWNlMWZjZTU2ZTYxIiwic2lkIjoiNDE5MWMwOGItODM5Mi00ODc3LWFjNDgtMmNhMmI3MDFjZDY3In0.FFNM_QyCOFmc9kbMCwREe2FMCbk7177j7TAGbiZaV4A",
  "access_expires_at": "2026-10-28T08:21:32.251626996Z",
  "refresh_token": "IqFMmEM-p0GuMIACMKvv2vF3n6IFR4H2laxVBr2Ppw4",
  "refresh_expires_at": "2026-10-28T20:06:32.25105114Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2737845&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "53076e1c-1709-443f-8844-0c31196e56a7",
      "phone": "+380662737845",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T08:06:31.898639Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/53076e1c-1709-443f-8844-0c31196e56a7` → **200**

```json
{
  "client": {
    "id": "53076e1c-1709-443f-8844-0c31196e56a7",
    "phone": "+380662737845",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T08:06:31.898639Z",
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

`POST /api/admin/v1/clients/53076e1c-1709-443f-8844-0c31196e56a7/block` → **400**

```json
{
  "command_id": "79115ef9-7e11-4bab-af83-be5ddb698a22",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/53076e1c-1709-443f-8844-0c31196e56a7/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "051eb499-fa0a-4356-90e5-abad8bd5b9be",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/53076e1c-1709-443f-8844-0c31196e56a7/block` → **200**

```json
{
  "command_id": "ed736778-6e23-4651-912d-3d0d054126d0",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "53076e1c-1709-443f-8844-0c31196e56a7",
  "phone": "+380662737845",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T08:06:31.898639Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T08:06:32.415312Z",
    "by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
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
  "correlation_id": "7df5ed63-911d-43e0-b175-b0758c9f6919"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662737845",
  "device_ref": "sandbox-29170"
}
```

```json
{
  "challenge_id": "1302b741-6e53-4761-89d8-05befc170d56",
  "expires_at": "2026-10-28T08:11:34.480968941Z",
  "resend_available_at": "2026-10-28T08:06:35.480968941Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662737845` → **200**

```json
{
  "phone": "+380662737845",
  "audience": "CLIENT",
  "code": "892838",
  "sent_at": "2026-10-28T08:06:34.484041278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1302b741-6e53-4761-89d8-05befc170d56",
  "code": "892838",
  "device_ref": "sandbox-29170"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "c99e0e1b-1767-4889-a418-c65584a4c399"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/53076e1c-1709-443f-8844-0c31196e56a7` → **200**

```json
{
  "client": {
    "id": "53076e1c-1709-443f-8844-0c31196e56a7",
    "phone": "+380662737845",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T08:06:31.898639Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T08:06:32.415312Z",
      "by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
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

`POST /api/admin/v1/clients/53076e1c-1709-443f-8844-0c31196e56a7/unblock` → **200**

```json
{
  "command_id": "18a65539-b9fe-4e50-89d7-fbecf35bda26",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "53076e1c-1709-443f-8844-0c31196e56a7",
  "phone": "+380662737845",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T08:06:31.898639Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662737845",
  "device_ref": "sandbox-17274"
}
```

```json
{
  "challenge_id": "0bc5257b-ca28-45a7-9966-e2390332b3ae",
  "expires_at": "2026-10-28T08:11:36.664199217Z",
  "resend_available_at": "2026-10-28T08:06:37.664199217Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662737845` → **200**

```json
{
  "phone": "+380662737845",
  "audience": "CLIENT",
  "code": "153028",
  "sent_at": "2026-10-28T08:06:36.666814391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bc5257b-ca28-45a7-9966-e2390332b3ae",
  "code": "153028",
  "device_ref": "sandbox-17274"
}
```

```json
{
  "session_id": "13ab06be-7c2d-4aae-8e9a-f0309bb7d80b",
  "subject": {
    "type": "CLIENT",
    "id": "53076e1c-1709-443f-8844-0c31196e56a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzA3NmUxYy0xNzA5LTQ0M2YtODg0NC0wYzMxMTk2ZTU2YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njk2LCJpYXQiOjE3OTMxNzQ3OTYsImp0aSI6IjZiZjYxMjk4LWNhYjgtNGY2NS05ZGU5LWNjOTgyZDAwNGVkYiIsInNpZCI6IjEzYWIwNmJlLTdjMmQtNGFhZS04ZTlhLWYwMzA5YmI3ZDgwYiJ9.1_qFxXyyLf72tte4-THC5J9LvkITknBI3jJhylddSdU",
  "access_expires_at": "2026-10-28T08:21:36.725312854Z",
  "refresh_token": "cF3Moz9Tptqy12rAHJguIN1hZy2Iy1--b60nuFjhN7c",
  "refresh_expires_at": "2026-11-27T08:06:36.724653913Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "53076e1c-1709-443f-8844-0c31196e56a7",
  "session_id": "13ab06be-7c2d-4aae-8e9a-f0309bb7d80b",
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
  "phone": "+380635325685",
  "device_ref": "sandbox-16336"
}
```

```json
{
  "challenge_id": "40625ed8-747d-4a49-af09-a3be12735f9e",
  "expires_at": "2026-10-28T08:11:36.789071601Z",
  "resend_available_at": "2026-10-28T08:06:37.789071601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635325685` → **200**

```json
{
  "phone": "+380635325685",
  "audience": "CLIENT",
  "code": "994389",
  "sent_at": "2026-10-28T08:06:36.792346393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40625ed8-747d-4a49-af09-a3be12735f9e",
  "code": "994389",
  "device_ref": "sandbox-16336"
}
```

```json
{
  "session_id": "2761796e-11e5-4e47-9d90-c4cfb088ebed",
  "subject": {
    "type": "CLIENT",
    "id": "2014dd81-1b71-4080-a46d-45de98864d9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDE0ZGQ4MS0xYjcxLTQwODAtYTQ2ZC00NWRlOTg4NjRkOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1Njk2LCJpYXQiOjE3OTMxNzQ3OTYsImp0aSI6ImYwNTAxZjc3LTFhMWQtNDJmOC1iZDAxLTNmNjg2ZmY3Yzk5NCIsInNpZCI6IjI3NjE3OTZlLTExZTUtNGU0Ny05ZDkwLWM0Y2ZiMDg4ZWJlZCJ9.5dVZ2NDH2TIZUs1axtoZrm0o1otN3OWyh1TlkGCkNj4",
  "access_expires_at": "2026-10-28T08:21:36.84841531Z",
  "refresh_token": "nbLjo1VYhTxOE9uIei7gOyGT4WVsFqLkFAZtHOg43g8",
  "refresh_expires_at": "2026-11-27T08:06:36.847879349Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "1612186f-7590-48b0-886a-3766edecd7ae",
  "expires_at": "2026-10-28T08:11:38.8793126Z",
  "resend_available_at": "2026-10-28T08:06:39.8793126Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635325685` → **200**

```json
{
  "phone": "+380635325685",
  "audience": "CLIENT",
  "code": "332471",
  "sent_at": "2026-10-28T08:06:38.881339257Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "fbe61f2d-e5b6-4878-8d4e-2c48b4324556",
  "challenge_id": "1612186f-7590-48b0-886a-3766edecd7ae",
  "otp_code": "332471"
}
```

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec` → **200**

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec` → **200**

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec` → **200**

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec` → **200**

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec` → **200**

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec` → **200**

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec` → **200**

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "PENDING",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec` → **200**

```json
{
  "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
  "state": "READY",
  "created_at": "2026-10-28T08:06:38.94602Z",
  "ready_at": "2026-10-28T08:06:45.344994Z",
  "expires_at": "2026-11-04T08:06:45.344994Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639604149",
  "device_ref": "sandbox-27254"
}
```

```json
{
  "challenge_id": "b675e1c1-62ce-4ffd-891d-04d84a24d1ec",
  "expires_at": "2026-10-28T08:11:46.212797427Z",
  "resend_available_at": "2026-10-28T08:06:47.212797427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639604149` → **200**

```json
{
  "phone": "+380639604149",
  "audience": "CLIENT",
  "code": "576564",
  "sent_at": "2026-10-28T08:06:46.215627749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b675e1c1-62ce-4ffd-891d-04d84a24d1ec",
  "code": "576564",
  "device_ref": "sandbox-27254"
}
```

```json
{
  "session_id": "27592bcd-e858-4ccf-a448-06543afb3174",
  "subject": {
    "type": "CLIENT",
    "id": "109d4eba-9bd5-4645-9b66-7fec994db40c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDlkNGViYS05YmQ1LTQ2NDUtOWI2Ni03ZmVjOTk0ZGI0MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzA2LCJpYXQiOjE3OTMxNzQ4MDYsImp0aSI6IjU5MmI5ZjFmLWFkYTgtNGRiMC04MjhkLWJiNjc2ZTZlOTJkNSIsInNpZCI6IjI3NTkyYmNkLWU4NTgtNGNjZi1hNDQ4LTA2NTQzYWZiMzE3NCJ9.1jYICnQBZ41DAntnGsr8NEH_oRfxQHgAEdH8kjbgbho",
  "access_expires_at": "2026-10-28T08:21:46.271312222Z",
  "refresh_token": "VWqsc8oHv_oRDI7Y7Wfk1i3TXlvP6Qm_ljzvFa3WjKU",
  "refresh_expires_at": "2026-11-27T08:06:46.270699155Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/61f92bf2-08da-4dee-a482-00b4b453c1ec/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ba4eaeb0-3dd2-442b-ac00-3db57997f293"
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
  "session_id": "9b4e3fc9-1e9f-4cc5-8995-d8560b916798",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MDYsImlhdCI6MTc5MzE3NDgwNiwianRpIjoiYjU0MTliNzQtNzM5YS00MGQ1LWIyOTUtMTA5NDMzZjNmY2Y5Iiwic2lkIjoiOWI0ZTNmYzktMWU5Zi00Y2M1LTg5OTUtZDg1NjBiOTE2Nzk4In0.79ZE-Chbx8P-gn85duGzRBi_FRtiUwifv-QE0SdtlWY",
  "access_expires_at": "2026-10-28T08:21:46.618205501Z",
  "refresh_token": "aZ5Se25oIKstPv9riK-tp7etSvJ1F-VUjHy8USHp238",
  "refresh_expires_at": "2026-10-28T20:06:46.61761086Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2014dd81-1b71-4080-a46d-45de98864d9d",
  "session_id": "2761796e-11e5-4e47-9d90-c4cfb088ebed",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/2014dd81-1b71-4080-a46d-45de98864d9d/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "61f92bf2-08da-4dee-a482-00b4b453c1ec",
      "state": "READY",
      "created_at": "2026-10-28T08:06:38.94602Z",
      "ready_at": "2026-10-28T08:06:45.344994Z",
      "expires_at": "2026-11-04T08:06:45.344994Z",
      "size_bytes": 1032
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
  "device_ref": "sandbox-24885"
}
```

```json
{
  "challenge_id": "92b0d4f8-8612-4349-b4b9-c117a78e9e76",
  "expires_at": "2026-10-28T08:11:46.737835975Z",
  "resend_available_at": "2026-10-28T08:06:47.737835975Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "376568",
  "sent_at": "2026-10-28T08:06:46.740204499Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92b0d4f8-8612-4349-b4b9-c117a78e9e76",
  "code": "376568",
  "device_ref": "sandbox-24885"
}
```

```json
{
  "session_id": "b33453ce-c207-422d-ad28-d925b531fddc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcwNiwiaWF0IjoxNzkzMTc0ODA2LCJqdGkiOiIxOGM3MzZjYy1mMjhiLTQ5NWUtYmZiMy0yZDlmMThlNzM0NmUiLCJzaWQiOiJiMzM0NTNjZS1jMjA3LTQyMmQtYWQyOC1kOTI1YjUzMWZkZGMifQ.2busIe1kd4Y5WrsZfEpcGXPKb5c3CwCsrbnLuJg3-Nw",
  "access_expires_at": "2026-10-28T08:21:46.797253879Z",
  "refresh_token": "FTbIc6AXjjC3MegUziCY71hi5N3ObkoTttn-vesq4J8",
  "refresh_expires_at": "2026-11-27T08:06:46.796607171Z",
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
  "command_id": "8e2a0761-2a5d-42ea-ac99-6f27088f4fd3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:46Z",
    "sequence": 1793174806847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:46.866336Z",
  "last_location_at": "2026-10-28T08:06:46.866336Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675660514",
  "device_ref": "sandbox-15536"
}
```

```json
{
  "challenge_id": "a4fb0926-b8d6-450e-8b17-8c14272e35b3",
  "expires_at": "2026-10-28T08:11:46.898961884Z",
  "resend_available_at": "2026-10-28T08:06:47.898961884Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675660514` → **200**

```json
{
  "phone": "+380675660514",
  "audience": "CLIENT",
  "code": "909905",
  "sent_at": "2026-10-28T08:06:46.901239639Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4fb0926-b8d6-450e-8b17-8c14272e35b3",
  "code": "909905",
  "device_ref": "sandbox-15536"
}
```

```json
{
  "session_id": "d75da4d8-6fa1-4f6e-ba1c-3e6d2d76a67d",
  "subject": {
    "type": "CLIENT",
    "id": "bb263656-81f6-4d8c-9cd7-b80d4c846968"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYjI2MzY1Ni04MWY2LTRkOGMtOWNkNy1iODBkNGM4NDY5NjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzA2LCJpYXQiOjE3OTMxNzQ4MDYsImp0aSI6IjUyYTE1N2E5LTg3Y2EtNDljZC04ZTJkLTYzNjMzMGU0YTI0OCIsInNpZCI6ImQ3NWRhNGQ4LTZmYTEtNGY2ZS1iYTFjLTNlNmQyZDc2YTY3ZCJ9.tprSh-G-EUKcaKRa9RbKCLedKXVwO-aVRVohem56VgU",
  "access_expires_at": "2026-10-28T08:21:46.956896397Z",
  "refresh_token": "BoJVN4ndyvPNWbe5pghP3mXOJ6VWqdH7Lmgi_9ZhK7Q",
  "refresh_expires_at": "2026-11-27T08:06:46.956311132Z",
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
  "command_id": "8d683085-a573-4179-b0f0-5ffc11d326b8",
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
  "id": "8b8ed837-8a14-4ede-9b20-55181f5f1de8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:47.020612Z",
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
  "command_id": "de063aa9-5fc9-4573-b6cc-79b6e6503eb4",
  "platform": "ANDROID",
  "token": "sandbox-driver-35aa6410-01cb-4643-9f9a-e19c0d57cbd7"
}
```

```json
{
  "id": "ffd0cd19-b8a3-4fe5-a6be-035f451b97cc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:06:47.062891Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "9041407e-0602-45ee-8e53-de8fbf0a9e01",
  "platform": "ANDROID",
  "token": "sandbox-rider-c34e0649-146d-4615-a6a0-3634414929e0"
}
```

```json
{
  "id": "e236d8dc-b45c-4b2a-8442-e86d0b54e34b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T08:06:47.099789Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "82306b0d-0b7f-4682-a81f-0ab7f8411178",
  "quote_id": "8b8ed837-8a14-4ede-9b20-55181f5f1de8",
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
  "id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bb263656-81f6-4d8c-9cd7-b80d4c846968",
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
  "created_at": "2026-10-28T08:06:47.143799Z",
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
    "id": "aec934ce-1f59-47c0-bb92-9d638cff2cde",
    "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
    "expires_at": "2026-10-28T08:07:02.147322Z",
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

`POST /api/driver/v1/offers/aec934ce-1f59-47c0-bb92-9d638cff2cde/accept` → **200**

```json
{
  "command_id": "4d3160fa-e6a8-4582-879c-00c1ca3f7bfb"
}
```

```json
{
  "id": "e8a1e243-02d7-4ee8-bb44-1bcabf247803",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b9644227-5927-4e42-9019-c18c83e6c187",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:06:47.119Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:06:47.119Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T08:06:47.119Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:06:48.525819748Z",
    "token_suffix": "57cbd7",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "cc25b3e1-84f1-40ce-881a-6167e7dbf88e",
      "order_version": "2",
      "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675660514&after=2026-10-28T08:06:47.119Z` → **200**

```json
[
  {
    "at": "2026-10-28T08:06:48.528266668Z",
    "token_suffix": "4929e0",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "71197da0-da93-46f1-94cc-6063c4337d5d",
      "order_version": "3",
      "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/06306bcc-8da9-4795-9ba5-419c22c90fee/messages` → **201**

```json
{
  "command_id": "a0f13bf4-415b-413c-9424-4497bfbbb654",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "2b9d1b5e-9028-43e3-b3c7-c5d12e44ffdb",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T08:06:49.367824187Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b9644227-5927-4e42-9019-c18c83e6c187",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "assignment_id": "e8a1e243-02d7-4ee8-bb44-1bcabf247803",
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

`POST /api/driver/v1/trips/b9644227-5927-4e42-9019-c18c83e6c187/messages` → **201**

```json
{
  "command_id": "f777a8f5-9f9e-4704-b78b-18035622562e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ec688dbd-0b87-4d36-b66c-a654c45a3434",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T08:06:49.420410558Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/06306bcc-8da9-4795-9ba5-419c22c90fee/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b9644227-5927-4e42-9019-c18c83e6c187/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675660514"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:49Z",
    "sequence": 1793174809499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:49.518961Z",
  "last_location_at": "2026-10-28T08:06:49.518961Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b9644227-5927-4e42-9019-c18c83e6c187",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "assignment_id": "e8a1e243-02d7-4ee8-bb44-1bcabf247803",
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

`POST /api/driver/v1/trips/b9644227-5927-4e42-9019-c18c83e6c187/arrive` → **200**

```json
{
  "command_id": "013ac6cf-6ad1-4242-a41b-f7088024478e",
  "expected_version": 0
}
```

```json
{
  "id": "b9644227-5927-4e42-9019-c18c83e6c187",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "assignment_id": "e8a1e243-02d7-4ee8-bb44-1bcabf247803",
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
  "arrived_at": "2026-10-28T08:06:49.572928Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b9644227-5927-4e42-9019-c18c83e6c187/start` → **200**

```json
{
  "command_id": "7be05dca-99fe-41f4-b68a-dcfa373eae80",
  "expected_version": 1
}
```

```json
{
  "id": "b9644227-5927-4e42-9019-c18c83e6c187",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "assignment_id": "e8a1e243-02d7-4ee8-bb44-1bcabf247803",
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
  "arrived_at": "2026-10-28T08:06:49.572928Z",
  "started_at": "2026-10-28T08:06:49.610558Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:49Z",
    "sequence": 1793174809635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:49.655891Z",
  "last_location_at": "2026-10-28T08:06:49.655891Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b9644227-5927-4e42-9019-c18c83e6c187/complete` → **200**

```json
{
  "command_id": "83b81885-0046-4835-909d-0fd955d62a43",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:06:49Z",
  "cash_received": true
}
```

```json
{
  "id": "b9644227-5927-4e42-9019-c18c83e6c187",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "assignment_id": "e8a1e243-02d7-4ee8-bb44-1bcabf247803",
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
  "arrived_at": "2026-10-28T08:06:49.572928Z",
  "started_at": "2026-10-28T08:06:49.610558Z",
  "completed_at": "2026-10-28T08:06:49.693789Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/06306bcc-8da9-4795-9ba5-419c22c90fee` → **200**

```json
{
  "id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bb263656-81f6-4d8c-9cd7-b80d4c846968",
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
    "id": "e8a1e243-02d7-4ee8-bb44-1bcabf247803",
    "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b9644227-5927-4e42-9019-c18c83e6c187",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:06:47.143799Z",
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
    "id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:06:47.143799Z",
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
    "id": "b9644227-5927-4e42-9019-c18c83e6c187",
    "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
    "order_short_number": 5,
    "created_at": "2026-10-28T08:06:47.215401Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1a1c440f-1be9-4ce5-b1ee-26ef421747be",
    "order_id": "506cd57f-f8bb-454b-bfbd-ba21d8c1c5ef",
    "order_short_number": 1,
    "created_at": "2026-10-28T08:06:09.649352Z",
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

`GET /api/rider/v1/orders/06306bcc-8da9-4795-9ba5-419c22c90fee/tip` → **200**

```json
{
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
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
  "available_until": "2026-10-29T08:06:49.693789Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/06306bcc-8da9-4795-9ba5-419c22c90fee/tip` → **201**

```json
{
  "command_id": "efe8eaf1-331c-4c2d-8289-91287baae14c",
  "amount_minor": 1100
}
```

```json
{
  "id": "04f70dbc-d959-495b-99b1-433404a938ff",
  "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T08:06:52.911397Z"
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
  "session_id": "0a9c8d77-4247-4ac1-8449-cae0fd49e9ad",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTMsImlhdCI6MTc5MzE3NDgxMywianRpIjoiNzcyOTg3MjUtMGJlNS00OGNkLTljZjgtZmI3MTU2ZDVjZjljIiwic2lkIjoiMGE5YzhkNzctNDI0Ny00YWMxLTg0NDktY2FlMGZkNDllOWFkIn0.OtuYgw_Z64DCrS6ysJ1k7qStr-4PkdpCg8VUonGEhaQ",
  "access_expires_at": "2026-10-28T08:21:53.245555612Z",
  "refresh_token": "XsaIqeWT3-_RUBVWYDjW8XrYRjz01bsJy3zJ2OvpJ5c",
  "refresh_expires_at": "2026-10-28T20:06:53.245020994Z",
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
  "generated_at": "2026-10-28T08:06:53.277677473Z"
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
  "generated_at": "2026-10-28T08:06:53.31071147Z"
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
  "session_id": "5de83884-5328-424c-ab99-cff583566b12",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTMsImlhdCI6MTc5MzE3NDgxMywianRpIjoiNzEzODY0MjAtOTkyOS00MzU3LTk1MDQtODk3MzBjMDYwMzZmIiwic2lkIjoiNWRlODM4ODQtNTMyOC00MjRjLWFiOTktY2ZmNTgzNTY2YjEyIn0.pO8Tmx1R4yVmlujFU-qac_K83Lo6vTshaS91hCAz9Z0",
  "access_expires_at": "2026-10-28T08:21:53.635461995Z",
  "refresh_token": "sTeAa2zVp7BlhBo7kaAVCzm76-NDaQkwZknNE-ahjFE",
  "refresh_expires_at": "2026-10-28T20:06:53.634822541Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/06306bcc-8da9-4795-9ba5-419c22c90fee/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:06:47.144495Z",
      "actor": {
        "type": "CLIENT",
        "id": "bb263656-81f6-4d8c-9cd7-b80d4c846968",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
        "quote_id": "8b8ed837-8a14-4ede-9b20-55181f5f1de8",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:06:47.146368Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
        "attempt_id": "abcdbadb-7152-4f55-ab21-956bf5b164ac",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:06:47.152118Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "aec934ce-1f59-47c0-bb92-9d638cff2cde",
        "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:06:47.217408Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "aec934ce-1f59-47c0-bb92-9d638cff2cde",
        "order_id": "06306bcc-8da9-4795-9ba5-419c22c90fee",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e8a1e243-02d7-4ee8-bb44-1bcabf247803"
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
  "at": "2026-10-28T08:06:53.688193284Z",
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
      "last_location_at": "2026-10-28T08:06:49.655891Z",
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
      "last_location_at": "2026-10-28T08:06:17.451073Z",
      "order_id": null
    }
  ]
}
```

Done: order 06306bcc-8da9-4795-9ba5-419c22c90fee.

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
  "session_id": "8f66349e-7328-4039-8494-1e660914a675",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTQsImlhdCI6MTc5MzE3NDgxNCwianRpIjoiYTdkZDE4YzEtZTRmNy00MGFkLTlkODktNDNiOGY1MDNmZTJhIiwic2lkIjoiOGY2NjM0OWUtNzMyOC00MDM5LTg0OTQtMWU2NjA5MTRhNjc1In0.oSonoiBmLiVUTMfQE_u32Yy-xaNDF5sBWdcXpbd0Dfo",
  "access_expires_at": "2026-10-28T08:21:54.025054718Z",
  "refresh_token": "BIRjhSYsVf-m9ioUvanVKwSv_IJNIVn0GIAX5GVH4wk",
  "refresh_expires_at": "2026-10-28T20:06:54.024402725Z",
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
  "command_id": "3fef5ac0-1980-4483-9a7f-66ea1f25fe26",
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
  "timestamp": "2026-10-28T08:06:54.000+0000",
  "channel": {
    "id": "1730052000.609518350",
    "linkedid": "1730052000.609518350",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671495954"
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
  "timestamp": "2026-10-28T08:06:54.000+0000",
  "channel": {
    "id": "1730052000.609518350",
    "linkedid": "1730052000.609518350",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671495954"
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
  "session_id": "f0c4db40-01d2-43a5-98b3-ed45e7d70962",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTQsImlhdCI6MTc5MzE3NDgxNCwianRpIjoiNjYxNjQ4MTktYmEyYi00OTc5LWE3ZWEtYzFjZDUxZmY3YmVhIiwic2lkIjoiZjBjNGRiNDAtMDFkMi00M2E1LTk4YjMtZWQ0NWU3ZDcwOTYyIn0.H26AUe_3y6-V1wZPEus5lkCPUcJZ-WvPOhrNiNSIHtc",
  "access_expires_at": "2026-10-28T08:21:54.466812822Z",
  "refresh_token": "KI8Xnu11uecq0aXtdxzrxK11zZRTXCA7r2Y7BNnllfc",
  "refresh_expires_at": "2026-10-28T20:06:54.466153911Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "9a0b2fdb-a0be-4910-84c2-39af89554c72",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671495954",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:06:54Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/9a0b2fdb-a0be-4910-84c2-39af89554c72/answer` → **200**

```json
{
  "command_id": "bfa18241-162e-4cf0-8176-5620fcfed00e"
}
```

```json
{
  "id": "9a0b2fdb-a0be-4910-84c2-39af89554c72",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671495954",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "order_ids": [],
  "started_at": "2026-10-28T08:06:54Z",
  "answered_at": "2026-10-28T08:06:54.536421Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.609518350",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f959f971-d495-4739-9b56-3010e6d175ff",
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
  "id": "e6771c44-09c1-407d-a461-dad313dbceb1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:11:54.604050Z",
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
  "command_id": "fb894a5f-5d80-475e-ac9f-c5431e634aa0",
  "quote_id": "e6771c44-09c1-407d-a461-dad313dbceb1",
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
    "phone": "+380671495954"
  },
  "call_id": "9a0b2fdb-a0be-4910-84c2-39af89554c72"
}
```

```json
{
  "id": "3facfc9f-3321-4507-a927-741fd24e6acf",
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
  "created_at": "2026-10-28T08:06:54.65676Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671495954"
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
    "id": "1730052000.609518350",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9a0b2fdb-a0be-4910-84c2-39af89554c72",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671495954",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [
        "3facfc9f-3321-4507-a927-741fd24e6acf"
      ],
      "started_at": "2026-10-28T08:06:54Z",
      "answered_at": "2026-10-28T08:06:54.536421Z",
      "ended_at": "2026-10-28T08:06:54.706369Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "f039e9c3-7088-4096-be36-8ca86f608aea",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671701581",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [],
      "started_at": "2026-10-28T08:06:13.946861Z",
      "answered_at": "2026-10-28T08:06:14.011681Z",
      "ended_at": "2026-10-28T08:06:14.064952Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:06:15.33997Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/3facfc9f-3321-4507-a927-741fd24e6acf` → **200**

```json
{
  "id": "3facfc9f-3321-4507-a927-741fd24e6acf",
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
  "created_at": "2026-10-28T08:06:54.65676Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671495954"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/3facfc9f-3321-4507-a927-741fd24e6acf` → **200**

```json
{
  "id": "3facfc9f-3321-4507-a927-741fd24e6acf",
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
  "created_at": "2026-10-28T08:06:54.65676Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671495954"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3facfc9f-3321-4507-a927-741fd24e6acf/cancel` → **200**

```json
{
  "command_id": "6c9ed9a7-68e4-437a-a1da-37847c8b7dc5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3facfc9f-3321-4507-a927-741fd24e6acf",
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
  "created_at": "2026-10-28T08:06:54.65676Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671495954"
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

Done: call 9a0b2fdb-a0be-4910-84c2-39af89554c72 with order 3facfc9f-3321-4507-a927-741fd24e6acf.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26721"
}
```

```json
{
  "challenge_id": "2fedaf8d-5cee-4535-806b-d4870a9569be",
  "expires_at": "2026-10-28T08:11:54.869910616Z",
  "resend_available_at": "2026-10-28T08:06:55.869910616Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "334208",
  "sent_at": "2026-10-28T08:06:54.872249224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fedaf8d-5cee-4535-806b-d4870a9569be",
  "code": "334208",
  "device_ref": "sandbox-26721"
}
```

```json
{
  "session_id": "9cb366d7-c51b-4e55-9e86-d35d870663b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcxNCwiaWF0IjoxNzkzMTc0ODE0LCJqdGkiOiJhYjJmYjE2Ny1iYWRjLTQ4ZTYtOTlhNS0yOGE1NjlkYmNlMTUiLCJzaWQiOiI5Y2IzNjZkNy1jNTFiLTRlNTUtOWU4Ni1kMzVkODcwNjYzYjgifQ.8emwGj0y8G86CMZwu-4l162-Qb_arZQ1renYfZqmn0k",
  "access_expires_at": "2026-10-28T08:21:54.935265981Z",
  "refresh_token": "47u9D9MyNsBXdtr9czPs6aJ9AWBGAVOPIUALcvsNt_Q",
  "refresh_expires_at": "2026-11-27T08:06:54.934624207Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:49.655891Z",
  "last_location_at": "2026-10-28T08:06:49.655891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/handover` → **200**

```json
{
  "command_id": "aa86e508-8e62-4d45-bc63-f9556897173e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:49.655891Z",
  "last_location_at": "2026-10-28T08:06:49.655891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:55Z",
    "sequence": 1793174815213
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:55.04019Z",
  "last_location_at": "2026-10-28T08:06:55.04019Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662630982",
  "device_ref": "sandbox-30723"
}
```

```json
{
  "challenge_id": "5170902a-6a8a-46a4-b0bc-8757793b71de",
  "expires_at": "2026-10-28T08:11:55.065135435Z",
  "resend_available_at": "2026-10-28T08:06:56.065135435Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662630982` → **200**

```json
{
  "phone": "+380662630982",
  "audience": "CLIENT",
  "code": "482189",
  "sent_at": "2026-10-28T08:06:55.067454188Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5170902a-6a8a-46a4-b0bc-8757793b71de",
  "code": "482189",
  "device_ref": "sandbox-30723"
}
```

```json
{
  "session_id": "cee6acf7-1a02-4cb8-92d8-006af27847ca",
  "subject": {
    "type": "CLIENT",
    "id": "59f6b274-b2d3-4512-9ec5-9714ec9ac219"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWY2YjI3NC1iMmQzLTQ1MTItOWVjNS05NzE0ZWM5YWMyMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzE1LCJpYXQiOjE3OTMxNzQ4MTUsImp0aSI6ImNlYTQwYTUzLWViODEtNDczYi04ZDA4LTUzNmU3NmU2M2ZiMSIsInNpZCI6ImNlZTZhY2Y3LTFhMDItNGNiOC05MmQ4LTAwNmFmMjc4NDdjYSJ9.9awdswEanAnwgDPCcZlYzVgcgv6F4DJtq2yVrbp7t2c",
  "access_expires_at": "2026-10-28T08:21:55.123473829Z",
  "refresh_token": "mRKqKxsLyjg-qgrEJ3B5MZOKEX87aWar-vpxuI0Pxfs",
  "refresh_expires_at": "2026-11-27T08:06:55.122828476Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d4c81194-800a-4ad4-952c-2461f90fb1a8",
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
  "id": "c266fc58-6fb7-4878-a284-f80009871c74",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T08:11:55.160426Z",
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
  "command_id": "4b11d0b5-1eed-415a-855d-102c220c290f",
  "quote_id": "c266fc58-6fb7-4878-a284-f80009871c74",
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
  "id": "48393566-913d-454c-a519-32c3f5aa6537",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "59f6b274-b2d3-4512-9ec5-9714ec9ac219",
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
  "created_at": "2026-10-28T08:06:55.199349Z",
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
    "id": "ef280115-91fe-4542-987b-99afe280482c",
    "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
    "expires_at": "2026-10-28T08:07:10.203222Z",
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

`POST /api/driver/v1/offers/ef280115-91fe-4542-987b-99afe280482c/accept` → **200**

```json
{
  "command_id": "4cbea430-5ae8-4f06-a302-1c02894285a1"
}
```

```json
{
  "id": "bb7b1a96-b15d-4314-a72b-08547d3ca9cb",
  "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "931264fe-ab4c-4c2c-9b04-90e7297c4fa9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "931264fe-ab4c-4c2c-9b04-90e7297c4fa9",
  "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
  "assignment_id": "bb7b1a96-b15d-4314-a72b-08547d3ca9cb",
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

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:55Z",
    "sequence": 1793174815310
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:55.329273Z",
  "last_location_at": "2026-10-28T08:06:55.329273Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/931264fe-ab4c-4c2c-9b04-90e7297c4fa9/arrive` → **200**

```json
{
  "command_id": "9494440a-a835-4f5b-95c6-af40bb870887",
  "expected_version": 0
}
```

```json
{
  "id": "931264fe-ab4c-4c2c-9b04-90e7297c4fa9",
  "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
  "assignment_id": "bb7b1a96-b15d-4314-a72b-08547d3ca9cb",
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
  "arrived_at": "2026-10-28T08:06:55.372805Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/931264fe-ab4c-4c2c-9b04-90e7297c4fa9/start` → **200**

```json
{
  "command_id": "7cf14e43-c5c0-466c-8c9c-df622c7c5f14",
  "expected_version": 1
}
```

```json
{
  "id": "931264fe-ab4c-4c2c-9b04-90e7297c4fa9",
  "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
  "assignment_id": "bb7b1a96-b15d-4314-a72b-08547d3ca9cb",
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
  "arrived_at": "2026-10-28T08:06:55.372805Z",
  "started_at": "2026-10-28T08:06:55.411478Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:55Z",
    "sequence": 1793174815437
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:55.456428Z",
  "last_location_at": "2026-10-28T08:06:55.456428Z",
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
  "device_ref": "sandbox-5497"
}
```

```json
{
  "challenge_id": "83cad612-2848-4d82-8fa0-3db934b83306",
  "expires_at": "2026-10-28T08:11:55.484146707Z",
  "resend_available_at": "2026-10-28T08:06:56.484146707Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "702227",
  "sent_at": "2026-10-28T08:06:55.490185717Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83cad612-2848-4d82-8fa0-3db934b83306",
  "code": "702227",
  "device_ref": "sandbox-5497"
}
```

```json
{
  "session_id": "5b648465-5546-4003-90b0-c99f70aa19e2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcxNSwiaWF0IjoxNzkzMTc0ODE1LCJqdGkiOiIyMWFmMWYzNS01OWJlLTQ4N2UtODFjMS0xZGNlNmVkOTIyMWUiLCJzaWQiOiI1YjY0ODQ2NS01NTQ2LTQwMDMtOTBiMC1jOTlmNzBhYTE5ZTIifQ.XKDOiSoLTzZNjBorh9C5Xh-NLxLhLQFIKdSqjE3-wpE",
  "access_expires_at": "2026-10-28T08:21:55.546952715Z",
  "refresh_token": "ukFf01YqZIZZObsVlwbmfEpzFD6NrDHI5vcEUhaAkhk",
  "refresh_expires_at": "2026-11-27T08:06:55.54635337Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:06:17.451073Z",
  "last_location_at": "2026-10-28T08:06:17.451073Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b2153055-cda3-498d-8d89-5f6f7a402734/handover` → **200**

```json
{
  "command_id": "bdf82c7a-d773-400f-8a60-257c4665ef13",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:06:17.451073Z",
  "last_location_at": "2026-10-28T08:06:17.451073Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b2153055-cda3-498d-8d89-5f6f7a402734/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:55Z",
    "sequence": 1793174815636
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:06:55.655951Z",
  "last_location_at": "2026-10-28T08:06:55.655951Z",
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
  "session_id": "60ed0990-846d-4c08-ab0d-afb8c8c8679e",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTUsImlhdCI6MTc5MzE3NDgxNSwianRpIjoiYmZjMzljODAtMzE1Ni00ZGI5LThkYTEtODNkOGRjZDRmYTVkIiwic2lkIjoiNjBlZDA5OTAtODQ2ZC00YzA4LWFiMGQtYWZiOGM4Yzg2NzllIn0.h60OiTJYygXFDUMvAUQBdoVhXvtU5TRkpOt9gT_Pgcw",
  "access_expires_at": "2026-10-28T08:21:55.978878667Z",
  "refresh_token": "shvmW5WkcrIRcsHr6tBBjcmyToTpHsjKUfz0NtiZEmY",
  "refresh_expires_at": "2026-10-28T20:06:55.97829668Z",
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
  "session_id": "5cc86ac6-5d45-48ee-b4ce-ea0585618ba7",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MTYsImlhdCI6MTc5MzE3NDgxNiwianRpIjoiMTgzMTkzOWUtNDg1MS00NmE4LTk3YjUtZDBkZjFkNjgzMTliIiwic2lkIjoiNWNjODZhYzYtNWQ0NS00OGVlLWI0Y2UtZWEwNTg1NjE4YmE3In0.zHwCk7zGCtUFRWVR0AHpD5pV5SaIIu0MjxhUPc2bSr4",
  "access_expires_at": "2026-10-28T08:21:56.297271751Z",
  "refresh_token": "vHFV9sizE5Ikx5N526xE4whA8S58vG-W_OUVBXL8Zxs",
  "refresh_expires_at": "2026-10-28T20:06:56.296671866Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/48393566-913d-454c-a519-32c3f5aa6537` → **200**

```json
{
  "id": "48393566-913d-454c-a519-32c3f5aa6537",
  "short_number": 7,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "59f6b274-b2d3-4512-9ec5-9714ec9ac219",
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
    "id": "bb7b1a96-b15d-4314-a72b-08547d3ca9cb",
    "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "931264fe-ab4c-4c2c-9b04-90e7297c4fa9",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T08:06:55.199349Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/48393566-913d-454c-a519-32c3f5aa6537/interrupt` → **200**

```json
{
  "command_id": "fcb168e2-a59c-49c4-8896-e59289acc3b1",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "48393566-913d-454c-a519-32c3f5aa6537",
    "short_number": 7,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "59f6b274-b2d3-4512-9ec5-9714ec9ac219",
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
      "id": "bb7b1a96-b15d-4314-a72b-08547d3ca9cb",
      "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "931264fe-ab4c-4c2c-9b04-90e7297c4fa9",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T08:06:55.199349Z",
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
    "id": "a48cd817-f4c3-4dee-82fc-39c58895545c",
    "short_number": 8,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "59f6b274-b2d3-4512-9ec5-9714ec9ac219",
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
    "id": "a95915bc-bcb0-4c38-8fd2-bbaf92212eef",
    "order_id": "a48cd817-f4c3-4dee-82fc-39c58895545c",
    "expires_at": "2026-10-28T08:07:11.380063Z",
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

`POST /api/driver/v1/offers/a95915bc-bcb0-4c38-8fd2-bbaf92212eef/accept` → **200**

```json
{
  "command_id": "bbcda719-37ac-4dff-967b-2d285b4a36dc"
}
```

```json
{
  "id": "2ed05bad-afda-4de0-a9f8-9fe5baf2e564",
  "order_id": "a48cd817-f4c3-4dee-82fc-39c58895545c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fd8775bb-ad9a-4d08-b5d9-5fce0ad385df",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fd8775bb-ad9a-4d08-b5d9-5fce0ad385df",
  "order_id": "a48cd817-f4c3-4dee-82fc-39c58895545c",
  "assignment_id": "2ed05bad-afda-4de0-a9f8-9fe5baf2e564",
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
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:06:55.655951Z",
  "last_location_at": "2026-10-28T08:06:55.655951Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b2153055-cda3-498d-8d89-5f6f7a402734/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:06:56Z",
    "sequence": 1793174816517
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:06:56.535601Z",
  "last_location_at": "2026-10-28T08:06:56.535601Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fd8775bb-ad9a-4d08-b5d9-5fce0ad385df/arrive` → **200**

```json
{
  "command_id": "b81f714c-f9bc-4467-a7b0-7a8f20f37b3b",
  "expected_version": 0
}
```

```json
{
  "id": "fd8775bb-ad9a-4d08-b5d9-5fce0ad385df",
  "order_id": "a48cd817-f4c3-4dee-82fc-39c58895545c",
  "assignment_id": "2ed05bad-afda-4de0-a9f8-9fe5baf2e564",
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
  "arrived_at": "2026-10-28T08:06:56.571328Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fd8775bb-ad9a-4d08-b5d9-5fce0ad385df/start` → **200**

```json
{
  "command_id": "8d4eb297-0af9-4ad1-ae59-90641aeddce9",
  "expected_version": 1
}
```

```json
{
  "id": "fd8775bb-ad9a-4d08-b5d9-5fce0ad385df",
  "order_id": "a48cd817-f4c3-4dee-82fc-39c58895545c",
  "assignment_id": "2ed05bad-afda-4de0-a9f8-9fe5baf2e564",
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
  "arrived_at": "2026-10-28T08:06:56.571328Z",
  "started_at": "2026-10-28T08:06:56.611901Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fd8775bb-ad9a-4d08-b5d9-5fce0ad385df/complete` → **200**

```json
{
  "command_id": "b925aa4f-b36c-4308-94df-da44740e8de0",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:06:56Z"
}
```

```json
{
  "id": "fd8775bb-ad9a-4d08-b5d9-5fce0ad385df",
  "order_id": "a48cd817-f4c3-4dee-82fc-39c58895545c",
  "assignment_id": "2ed05bad-afda-4de0-a9f8-9fe5baf2e564",
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
  "arrived_at": "2026-10-28T08:06:56.571328Z",
  "started_at": "2026-10-28T08:06:56.611901Z",
  "completed_at": "2026-10-28T08:06:56.654354Z",
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
    "id": "a48cd817-f4c3-4dee-82fc-39c58895545c",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-28T08:06:56.370046Z",
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
    "id": "48393566-913d-454c-a519-32c3f5aa6537",
    "short_number": 7,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:06:55.199349Z",
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

`GET /api/operator/v1/orders/48393566-913d-454c-a519-32c3f5aa6537/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:06:55.199881Z",
      "actor": {
        "type": "CLIENT",
        "id": "59f6b274-b2d3-4512-9ec5-9714ec9ac219",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
        "quote_id": "c266fc58-6fb7-4878-a284-f80009871c74",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:06:55.202106Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
        "attempt_id": "adc6434b-32ff-4d99-8a3f-dce08082da76",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:06:55.208314Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ef280115-91fe-4542-987b-99afe280482c",
        "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:06:55.267313Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ef280115-91fe-4542-987b-99afe280482c",
        "order_id": "48393566-913d-454c-a519-32c3f5aa6537",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "bb7b1a96-b15d-4314-a72b-08547d3ca9cb"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 48393566-913d-454c-a519-32c3f5aa6537, follow-up a48cd817-f4c3-4dee-82fc-39c58895545c.

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
  "session_id": "11e47f88-c5ae-431b-a461-b81db1d0cb69",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjAsImlhdCI6MTc5MzE3NDgyMCwianRpIjoiMzBkZWJmYWMtMTcwMC00ZWRhLWE4NTktYjFmMjlmNTA1NjhhIiwic2lkIjoiMTFlNDdmODgtYzVhZS00MzFiLWE0NjEtYjgxZGIxZDBjYjY5In0.HS7kb8yn0bjz3KkPeoPeTsmlgHIOsHIMMKxp6kOs0hY",
  "access_expires_at": "2026-10-28T08:22:00.068830172Z",
  "refresh_token": "2oGfDLAqrfA-mv_0Eh_1ivNgjjpdxR_7Y7WmZEL_47I",
  "refresh_expires_at": "2026-10-28T20:07:00.06823507Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "8959f6fb-1a71-4223-8016-2b8580e9d28b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:07:00Z"
}
```

```json
{
  "id": "5bc3f5ec-8e5c-4d42-9e54-d18008258e0a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:07:00Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/5bc3f5ec-8e5c-4d42-9e54-d18008258e0a/publish` → **200**

```json
{
  "command_id": "273f6a18-ddd4-437d-98f6-a6403d71b25c",
  "expected_version": 0
}
```

```json
{
  "id": "5bc3f5ec-8e5c-4d42-9e54-d18008258e0a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:07:00.165697Z",
  "published_at": "2026-10-28T08:07:00.165697Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "5bc3f5ec-8e5c-4d42-9e54-d18008258e0a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T08:07:00.165697Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639834836",
  "device_ref": "sandbox-8079"
}
```

```json
{
  "challenge_id": "b7b5bc8d-31fa-4b2d-8674-81e4c0301b3d",
  "expires_at": "2026-10-28T08:12:00.227711084Z",
  "resend_available_at": "2026-10-28T08:07:01.227711084Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639834836` → **200**

```json
{
  "phone": "+380639834836",
  "audience": "CLIENT",
  "code": "834525",
  "sent_at": "2026-10-28T08:07:00.229986435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7b5bc8d-31fa-4b2d-8674-81e4c0301b3d",
  "code": "834525",
  "device_ref": "sandbox-8079"
}
```

```json
{
  "session_id": "9100c4c7-7cfe-4025-8e33-8748acee126c",
  "subject": {
    "type": "CLIENT",
    "id": "387d4fdc-4094-4c1d-9ad1-bc81442bc14b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODdkNGZkYy00MDk0LTRjMWQtOWFkMS1iYzgxNDQyYmMxNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzIwLCJpYXQiOjE3OTMxNzQ4MjAsImp0aSI6ImJhODhhYmYzLWRjODctNDVhZi04MTNiLTBhZWFiZDkwYmFmMyIsInNpZCI6IjkxMDBjNGM3LTdjZmUtNDAyNS04ZTMzLTg3NDhhY2VlMTI2YyJ9._EMB379JIPvlIzyoK1r8yq0qsOJEGq9B1hGhr2QlYb8",
  "access_expires_at": "2026-10-28T08:22:00.28482318Z",
  "refresh_token": "jZ2NE0AByH0dHFKg6HDB6nI25c_litWkQ9FT4McBZTo",
  "refresh_expires_at": "2026-11-27T08:07:00.284173005Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "5bc3f5ec-8e5c-4d42-9e54-d18008258e0a",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T08:07:00.165697Z",
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
  "command_id": "63880ab1-39c4-4cd5-b660-761996bff8fc",
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
  "id": "c85d4d87-226b-4069-a539-30eec8719d4e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:12:00.346250Z",
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
  "command_id": "324f61ee-e617-44c6-841b-0cfdd8a8c2c1",
  "quote_id": "c85d4d87-226b-4069-a539-30eec8719d4e",
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
  "correlation_id": "c61e71a7-fb29-4128-8545-75079ff4a244"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ed7e27fb-89cc-4abb-982e-540634d53bd8",
  "version_id": "5bc3f5ec-8e5c-4d42-9e54-d18008258e0a",
  "language": "uk"
}
```

```json
{
  "version_id": "5bc3f5ec-8e5c-4d42-9e54-d18008258e0a",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T08:07:00.419363Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a89c0122-5bc3-4008-8cae-c4e0234e6a52",
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
  "id": "880b1edf-93da-41af-9ffb-3f793117204d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:12:00.457117Z",
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
  "command_id": "ada51793-03b4-44f6-96a0-ded5b8c6af45",
  "quote_id": "880b1edf-93da-41af-9ffb-3f793117204d",
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
  "id": "fff18ee8-88c0-418d-bbaa-dc4952b005d9",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "387d4fdc-4094-4c1d-9ad1-bc81442bc14b",
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
  "created_at": "2026-10-28T08:07:00.492112Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fff18ee8-88c0-418d-bbaa-dc4952b005d9` → **200**

```json
{
  "id": "fff18ee8-88c0-418d-bbaa-dc4952b005d9",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "387d4fdc-4094-4c1d-9ad1-bc81442bc14b",
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
  "created_at": "2026-10-28T08:07:00.492112Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/fff18ee8-88c0-418d-bbaa-dc4952b005d9/cancel` → **200**

```json
{
  "command_id": "2899d797-ccf1-4e4f-8c47-4dd9877ff48a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fff18ee8-88c0-418d-bbaa-dc4952b005d9",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "387d4fdc-4094-4c1d-9ad1-bc81442bc14b",
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
  "created_at": "2026-10-28T08:07:00.492112Z",
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

## A published version never changes

`POST /api/admin/v1/legal-documents/5bc3f5ec-8e5c-4d42-9e54-d18008258e0a` → **409**

```json
{
  "command_id": "61d8cbff-2b35-4707-a0c3-230a0783fc73",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T08:07:00Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/5bc3f5ec-8e5c-4d42-9e54-d18008258e0a",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e5cf5798-789e-41af-a267-558f40fbb9f9"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "cfb93469-e9cf-4450-a605-00d3fa2711a8",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:07:00Z"
}
```

```json
{
  "id": "85b4bc98-f7df-421d-a040-41048e37f9a8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:07:00Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/85b4bc98-f7df-421d-a040-41048e37f9a8/publish` → **200**

```json
{
  "command_id": "efd184fd-9d04-4b3d-a341-9e52df5236d6",
  "expected_version": 0
}
```

```json
{
  "id": "85b4bc98-f7df-421d-a040-41048e37f9a8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T08:07:00.675262Z",
  "published_at": "2026-10-28T08:07:00.675262Z",
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
  "device_ref": "sandbox-22899"
}
```

```json
{
  "challenge_id": "af9097ff-fa2f-45b4-a6ba-27275e9451c4",
  "expires_at": "2026-10-28T08:12:00.712265299Z",
  "resend_available_at": "2026-10-28T08:07:01.712265299Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "111051",
  "sent_at": "2026-10-28T08:07:00.714627862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af9097ff-fa2f-45b4-a6ba-27275e9451c4",
  "code": "111051",
  "device_ref": "sandbox-22899"
}
```

```json
{
  "session_id": "2e93cf22-a9fc-42d9-ae67-4e1748caf4d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcyMCwiaWF0IjoxNzkzMTc0ODIwLCJqdGkiOiJiMDc2OGY2Zi0zMTc4LTRiNGUtODVlOC01YjIwMWM3NzBlNDIiLCJzaWQiOiIyZTkzY2YyMi1hOWZjLTQyZDktYWU2Ny00ZTE3NDhjYWY0ZDAifQ.OgyA3VKwzZs5mG0lYYunM4TahjQ4ZbjMFE6CRuCakNM",
  "access_expires_at": "2026-10-28T08:22:00.769169106Z",
  "refresh_token": "sWYmUoyMDWYR8C_s7sKY2OiYwFZ0rw9A67ozX2zuATg",
  "refresh_expires_at": "2026-11-27T08:07:00.768569596Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:06:56.535601Z",
  "last_location_at": "2026-10-28T08:06:56.535601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2153055-cda3-498d-8d89-5f6f7a402734/handover` → **200**

```json
{
  "command_id": "51289bc1-f770-40ff-8f0c-c1aef8610efb",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:06:56.535601Z",
  "last_location_at": "2026-10-28T08:06:56.535601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2153055-cda3-498d-8d89-5f6f7a402734/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:00Z",
    "sequence": 1793174820852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:07:00.87031Z",
  "last_location_at": "2026-10-28T08:07:00.87031Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670718883",
  "device_ref": "sandbox-29217"
}
```

```json
{
  "challenge_id": "615d9499-f910-496e-b17f-9ab548e92923",
  "expires_at": "2026-10-28T08:12:00.896895767Z",
  "resend_available_at": "2026-10-28T08:07:01.896895767Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670718883` → **200**

```json
{
  "phone": "+380670718883",
  "audience": "CLIENT",
  "code": "226259",
  "sent_at": "2026-10-28T08:07:00.899423774Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "615d9499-f910-496e-b17f-9ab548e92923",
  "code": "226259",
  "device_ref": "sandbox-29217"
}
```

```json
{
  "session_id": "136af176-4a13-4b57-84f7-304847624f0d",
  "subject": {
    "type": "CLIENT",
    "id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjFlOWNmNy02YWE3LTRmMGQtOTAwNi05YzRhYjc4OWE5NjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzIwLCJpYXQiOjE3OTMxNzQ4MjAsImp0aSI6IjM3ZjcwYmY4LWJkMjUtNDNiMi1iNmExLTZjNTRmYWE3YzljOCIsInNpZCI6IjEzNmFmMTc2LTRhMTMtNGI1Ny04NGY3LTMwNDg0NzYyNGYwZCJ9.9U3YYJssYQ7s_bYBJnx_C8zX-6AAbv1xU5BNMpKMKgM",
  "access_expires_at": "2026-10-28T08:22:00.9550999Z",
  "refresh_token": "hgdrzUeTj0pYjTrOrVpFckIZYKlvG-HyFmQQbM2XwV8",
  "refresh_expires_at": "2026-11-27T08:07:00.954417277Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c5cd6753-6648-48ca-87a9-bad4a4961dfe",
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
  "id": "8a6dfe95-d317-471c-8068-a8becd6559e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:12:00.990061Z",
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
  "command_id": "b41ffe22-cf72-4fed-b7a6-76d50a235758",
  "quote_id": "8a6dfe95-d317-471c-8068-a8becd6559e8",
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
    "phone": "+380679173000"
  }
}
```

```json
{
  "id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
  "created_at": "2026-10-28T08:07:01.034835Z",
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
    "id": "0f4cb3bd-7972-4550-958a-b792ee458ec5",
    "order_id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
    "expires_at": "2026-10-28T08:07:16.038425Z",
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

`POST /api/driver/v1/offers/0f4cb3bd-7972-4550-958a-b792ee458ec5/accept` → **200**

```json
{
  "command_id": "1fdd1689-8e19-49a1-8091-04dfa5a45200"
}
```

```json
{
  "id": "483593ba-98de-437c-98e8-affa16f949a7",
  "order_id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c3564cbe-afe1-41f3-b024-b3b4c93dce1f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c3564cbe-afe1-41f3-b024-b3b4c93dce1f",
  "order_id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
  "assignment_id": "483593ba-98de-437c-98e8-affa16f949a7",
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
    "phone": "+380679173000"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2083509a-6c3e-4c0b-8e4d-8f1f679714cd",
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
  "id": "30760a76-d2e9-4d58-b091-2b3c4eb8f68c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:12:01.175614Z",
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
  "command_id": "b65e8f2e-bb3d-4fd5-9717-4c3970e5fbc2",
  "quote_id": "30760a76-d2e9-4d58-b091-2b3c4eb8f68c",
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
  "id": "54ceb90b-cfa5-4145-ad51-fcce80c92255",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
  "created_at": "2026-10-28T08:07:01.21548Z",
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
  "command_id": "b693ef4f-9d28-44fb-a42e-9a0ba5fac490",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T11:07:01Z"
}
```

```json
{
  "id": "09bf547f-25d1-4827-835f-fe302c53017d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:12:01.263070Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:07:01Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a702d89d-501d-4286-bd14-6e4d4280d9ed",
  "quote_id": "09bf547f-25d1-4827-835f-fe302c53017d",
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
  "pickup_at": "2026-10-28T11:07:01Z"
}
```

```json
{
  "id": "0bff19a9-87c3-4971-9f69-38c6b07db1a7",
  "short_number": 12,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
  "created_at": "2026-10-28T08:07:01.303675Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:07:01Z",
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
  "command_id": "7c65be9b-9225-4e7c-8153-6ced13c5cad8",
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
  "id": "77017ee6-2134-464a-9c0a-32b07075a865",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:12:01.348555Z",
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
  "command_id": "f03b2f79-a5eb-4f1d-8b51-314b988a9185",
  "quote_id": "77017ee6-2134-464a-9c0a-32b07075a865",
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
  "correlation_id": "ca32dbb1-e68f-48db-967b-2916e6bb8a54"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "0bff19a9-87c3-4971-9f69-38c6b07db1a7",
      "short_number": 12,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
      "created_at": "2026-10-28T08:07:01.303675Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T11:07:01Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "54ceb90b-cfa5-4145-ad51-fcce80c92255",
      "short_number": 11,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
      "created_at": "2026-10-28T08:07:01.21548Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
      "short_number": 10,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "54ceb90b-cfa5-4145-ad51-fcce80c92255",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
  "created_at": "2026-10-28T08:07:01.21548Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/5cc912d6-b35a-452a-bd60-beeec2affae7` → **200**

```json
{
  "id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
    "id": "483593ba-98de-437c-98e8-affa16f949a7",
    "order_id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c3564cbe-afe1-41f3-b024-b3b4c93dce1f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T08:07:01.034835Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5cc912d6-b35a-452a-bd60-beeec2affae7/cancel` → **200**

```json
{
  "command_id": "52bad912-f09a-469e-a362-52ad3776aceb",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
    "id": "483593ba-98de-437c-98e8-affa16f949a7",
    "order_id": "5cc912d6-b35a-452a-bd60-beeec2affae7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c3564cbe-afe1-41f3-b024-b3b4c93dce1f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:07:01.034835Z",
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

`GET /api/rider/v1/orders/54ceb90b-cfa5-4145-ad51-fcce80c92255` → **200**

```json
{
  "id": "54ceb90b-cfa5-4145-ad51-fcce80c92255",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
  "created_at": "2026-10-28T08:07:01.21548Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/54ceb90b-cfa5-4145-ad51-fcce80c92255/cancel` → **200**

```json
{
  "command_id": "63b7f5eb-630b-4aa0-a012-ad689cfa6915",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "54ceb90b-cfa5-4145-ad51-fcce80c92255",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
  "created_at": "2026-10-28T08:07:01.21548Z",
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

`GET /api/rider/v1/orders/0bff19a9-87c3-4971-9f69-38c6b07db1a7` → **200**

```json
{
  "id": "0bff19a9-87c3-4971-9f69-38c6b07db1a7",
  "short_number": 12,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
  "created_at": "2026-10-28T08:07:01.303675Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:07:01Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0bff19a9-87c3-4971-9f69-38c6b07db1a7/cancel` → **200**

```json
{
  "command_id": "7f8df643-57ea-4df1-a5c9-d9ddf0938f83",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0bff19a9-87c3-4971-9f69-38c6b07db1a7",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "4f1e9cf7-6aa7-4f0d-9006-9c4ab789a966",
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
  "created_at": "2026-10-28T08:07:01.303675Z",
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
  "pickup_at": "2026-10-28T11:07:01Z",
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
  "session_id": "b2153055-cda3-498d-8d89-5f6f7a402734",
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
  "last_heartbeat_at": "2026-10-28T08:07:00.87031Z",
  "last_location_at": "2026-10-28T08:07:00.87031Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b2153055-cda3-498d-8d89-5f6f7a402734/close` → **200**

```json
{
  "command_id": "7f735c35-0015-4344-9d78-7f320298c2f1",
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

Done: orders 5cc912d6-b35a-452a-bd60-beeec2affae7, 54ceb90b-cfa5-4145-ad51-fcce80c92255, 0bff19a9-87c3-4971-9f69-38c6b07db1a7.

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
  "session_id": "53608cd7-61a7-41c0-8289-226298d77375",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjIsImlhdCI6MTc5MzE3NDgyMiwianRpIjoiYWZiYThiZGItNmY1MS00ZTI5LTg3ZDQtNzk0MTA3NDBhZWI5Iiwic2lkIjoiNTM2MDhjZDctNjFhNy00MWMwLTgyODktMjI2Mjk4ZDc3Mzc1In0.r9I38L6xnjlJuxZPAS5UiHhpUQ2_rkD_Zb7_4T3PBQ8",
  "access_expires_at": "2026-10-28T08:22:02.006411005Z",
  "refresh_token": "dNj5NgkhZZ60J-k7J1b1FKf63JzgyfYmMIHTc02Okdw",
  "refresh_expires_at": "2026-10-28T20:07:02.005867489Z",
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
  "session_id": "81803671-1907-4075-b868-4c5eb017b491",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjIsImlhdCI6MTc5MzE3NDgyMiwianRpIjoiYWY1NWIwMzYtMWM5Yi00MWJiLWEzNzEtYWZkMjViOGQ4OTZjIiwic2lkIjoiODE4MDM2NzEtMTkwNy00MDc1LWI4NjgtNGM1ZWIwMTdiNDkxIn0.xIsT8oBo1DsuhnIVWfwtT7nPEn27dn8qDKvqzEDXbs0",
  "access_expires_at": "2026-10-28T08:22:02.330426962Z",
  "refresh_token": "D1iG-PG9dzrmvPlSTZaPU-S-kNUjShI3foMPFFYvSak",
  "refresh_expires_at": "2026-10-28T20:07:02.329840747Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5523"
}
```

```json
{
  "challenge_id": "48f00d54-f7d7-4d11-9b99-0caa9f8cf70e",
  "expires_at": "2026-10-28T08:12:02.354860037Z",
  "resend_available_at": "2026-10-28T08:07:03.354860037Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "622609",
  "sent_at": "2026-10-28T08:07:02.357933873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48f00d54-f7d7-4d11-9b99-0caa9f8cf70e",
  "code": "622609",
  "device_ref": "sandbox-5523"
}
```

```json
{
  "session_id": "1d2ca48f-5fa3-4252-bbbd-dc2c79426a53",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTcyMiwiaWF0IjoxNzkzMTc0ODIyLCJqdGkiOiI5ZDM4YjBiYS1jZDExLTQyNjItYjE0NC1kYmNmNzkwZWRjYTciLCJzaWQiOiIxZDJjYTQ4Zi01ZmEzLTQyNTItYmJiZC1kYzJjNzk0MjZhNTMifQ.Q4JidfeAmK1vDMct38BRtMB-iHSOyi1mwfNnwchNAHo",
  "access_expires_at": "2026-10-28T08:22:02.414731458Z",
  "refresh_token": "QNpMwsDsXrfcFY1sOODjmMmvjcFmYuaBvhw-9s1xIK8",
  "refresh_expires_at": "2026-11-27T08:07:02.414164779Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:55.456428Z",
  "last_location_at": "2026-10-28T08:06:55.456428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/handover` → **200**

```json
{
  "command_id": "a5ab6544-61bb-44cd-aee6-26a66572d936",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:06:55.456428Z",
  "last_location_at": "2026-10-28T08:06:55.456428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:02Z",
    "sequence": 1793174822502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:07:02.521474Z",
  "last_location_at": "2026-10-28T08:07:02.521474Z",
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
  "command_id": "15f413b0-e3be-49be-96e8-b9469f557ebe",
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
  "effective_at": "2026-10-28T08:07:02.591637Z",
  "changed_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T08:07:02.623003307Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bfbea2b7-9ea7-400b-8d9a-8b32338b4da0",
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
  "id": "f9ba0728-49af-47b9-9f39-01ea43181a35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:12:02.661294Z",
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
  "command_id": "b06edd9c-f966-426c-98d8-54c24243b8f4",
  "quote_id": "f9ba0728-49af-47b9-9f39-01ea43181a35",
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
    "phone": "+3806711115212"
  }
}
```

```json
{
  "id": "6fbccb0b-6301-4edf-9e67-4ff0c815ad5b",
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
  "created_at": "2026-10-28T08:07:02.698095Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115212"
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
    "id": "4619b648-d478-4a02-8b2d-05a129a7c9ac",
    "order_id": "6fbccb0b-6301-4edf-9e67-4ff0c815ad5b",
    "expires_at": "2026-10-28T08:07:17.701658Z",
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

`POST /api/driver/v1/offers/4619b648-d478-4a02-8b2d-05a129a7c9ac/accept` → **200**

```json
{
  "command_id": "ab74cd5e-6f56-40d2-83d7-2899526eb546"
}
```

```json
{
  "id": "153fc47c-9386-42ae-81d2-84a3006ce92c",
  "order_id": "6fbccb0b-6301-4edf-9e67-4ff0c815ad5b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b5156511-c81c-4fd3-a67d-c662c7705a01",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b5156511-c81c-4fd3-a67d-c662c7705a01",
  "order_id": "6fbccb0b-6301-4edf-9e67-4ff0c815ad5b",
  "assignment_id": "153fc47c-9386-42ae-81d2-84a3006ce92c",
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
    "phone": "+3806711115212"
  }
}
```

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:02Z",
    "sequence": 1793174822806
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:07:02.825246Z",
  "last_location_at": "2026-10-28T08:07:02.825246Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b5156511-c81c-4fd3-a67d-c662c7705a01/arrive` → **200**

```json
{
  "command_id": "632341a4-79a7-4ba6-b7cd-2b373c7728b5",
  "expected_version": 0
}
```

```json
{
  "id": "b5156511-c81c-4fd3-a67d-c662c7705a01",
  "order_id": "6fbccb0b-6301-4edf-9e67-4ff0c815ad5b",
  "assignment_id": "153fc47c-9386-42ae-81d2-84a3006ce92c",
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
  "arrived_at": "2026-10-28T08:07:02.860872Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115212"
  }
}
```

`POST /api/driver/v1/trips/b5156511-c81c-4fd3-a67d-c662c7705a01/start` → **200**

```json
{
  "command_id": "50c21185-f7bd-4c76-9fa4-70c8b1dd5e59",
  "expected_version": 1
}
```

```json
{
  "id": "b5156511-c81c-4fd3-a67d-c662c7705a01",
  "order_id": "6fbccb0b-6301-4edf-9e67-4ff0c815ad5b",
  "assignment_id": "153fc47c-9386-42ae-81d2-84a3006ce92c",
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
  "arrived_at": "2026-10-28T08:07:02.860872Z",
  "started_at": "2026-10-28T08:07:02.899614Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115212"
  }
}
```

`POST /api/driver/v1/trips/b5156511-c81c-4fd3-a67d-c662c7705a01/complete` → **200**

```json
{
  "command_id": "8de9ea17-d1fa-404e-8d2f-e4089397d447",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:07:02Z",
  "cash_received": true
}
```

```json
{
  "id": "b5156511-c81c-4fd3-a67d-c662c7705a01",
  "order_id": "6fbccb0b-6301-4edf-9e67-4ff0c815ad5b",
  "assignment_id": "153fc47c-9386-42ae-81d2-84a3006ce92c",
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
  "arrived_at": "2026-10-28T08:07:02.860872Z",
  "started_at": "2026-10-28T08:07:02.899614Z",
  "completed_at": "2026-10-28T08:07:02.943996Z",
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
  "command_id": "1cdd41b0-462d-4c56-9b33-c80829e591f9",
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
  "id": "5f467fbb-41c1-4cdb-8ad7-a40107422a41",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:12:02.987285Z",
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
  "command_id": "0747d0af-cd5f-4f29-ba49-816410bb0cfb",
  "quote_id": "5f467fbb-41c1-4cdb-8ad7-a40107422a41",
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
    "phone": "+3806711114882"
  }
}
```

```json
{
  "id": "ebc57cd8-7b6a-46f2-828a-aaefbc45d2d2",
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
  "created_at": "2026-10-28T08:07:03.028248Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114882"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ebc57cd8-7b6a-46f2-828a-aaefbc45d2d2` → **200**

```json
{
  "id": "ebc57cd8-7b6a-46f2-828a-aaefbc45d2d2",
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
  "created_at": "2026-10-28T08:07:03.028248Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114882"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ebc57cd8-7b6a-46f2-828a-aaefbc45d2d2/cancel` → **200**

```json
{
  "command_id": "032c3a4f-9b8c-4030-9c9d-42dc1c5a8d22",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ebc57cd8-7b6a-46f2-828a-aaefbc45d2d2",
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
  "created_at": "2026-10-28T08:07:03.028248Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114882"
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
  "staff_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T08:07:02.949368Z",
  "last_entries": [
    {
      "order_id": "ebc57cd8-7b6a-46f2-828a-aaefbc45d2d2",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T08:07:03.111294Z"
    },
    {
      "order_id": "6fbccb0b-6301-4edf-9e67-4ff0c815ad5b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T08:07:02.949368Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5267a762-c2dc-4bf8-9187-221bf3817e00",
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
  "last_heartbeat_at": "2026-10-28T08:07:02.825246Z",
  "last_location_at": "2026-10-28T08:07:02.825246Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5267a762-c2dc-4bf8-9187-221bf3817e00/close` → **200**

```json
{
  "command_id": "9fbefb02-4488-4f6a-b525-44522b09c0c8",
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

Done: operator bonus for fulfilled 6fbccb0b-6301-4edf-9e67-4ff0c815ad5b and operator-fault cancellation ebc57cd8-7b6a-46f2-828a-aaefbc45d2d2.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672495022",
  "device_ref": "sandbox-10003"
}
```

```json
{
  "challenge_id": "4a9c1b98-0b77-4603-bc5d-0c109f471b26",
  "expires_at": "2026-10-28T08:12:05.270289803Z",
  "resend_available_at": "2026-10-28T08:07:06.270289803Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672495022` → **200**

```json
{
  "phone": "+380672495022",
  "audience": "CLIENT",
  "code": "641163",
  "sent_at": "2026-10-28T08:07:05.272646993Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674870099",
  "device_ref": "sandbox-1019",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "87b6a54f-a5cb-4e6f-a109-0010eeed43df",
  "expires_at": "2026-10-28T08:12:05.32911329Z",
  "resend_available_at": "2026-10-28T08:07:06.32911329Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674870099` → **200**

```json
{
  "phone": "+380674870099",
  "audience": "CLIENT",
  "code": "330318",
  "sent_at": "2026-10-28T08:07:05.331637976Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678410000",
  "device_ref": "sandbox-15045"
}
```

```json
{
  "challenge_id": "8de7dc27-75b7-4ddf-b991-a4740b0f3d29",
  "expires_at": "2026-10-28T08:12:05.388282504Z",
  "resend_available_at": "2026-10-28T08:07:06.388282504Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678410000` → **200**

```json
{
  "phone": "+380678410000",
  "audience": "CLIENT",
  "code": "410189",
  "sent_at": "2026-10-28T08:07:05.391012191Z",
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
  "session_id": "d719dcce-1824-48d0-b729-083267616c55",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjUsImlhdCI6MTc5MzE3NDgyNSwianRpIjoiYzAzMmI1ZTUtYmY2MC00MjJjLWI5Y2MtYTY0OTBjMTU1NzNjIiwic2lkIjoiZDcxOWRjY2UtMTgyNC00OGQwLWI3MjktMDgzMjY3NjE2YzU1In0.VfSpcOivBfUHVGI-xg0X_q7IW_YBrZuDm8py8bW85M0",
  "access_expires_at": "2026-10-28T08:22:05.754636283Z",
  "refresh_token": "Y4wPA8KDUKhXlxvrv-LjgD_1p2CALXJA8fRDvtWdiis",
  "refresh_expires_at": "2026-10-28T20:07:05.75396027Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678410000` → **200**

```json
{
  "deliveries": [
    {
      "id": "c7fb8836-cf81-4f15-a1d5-1d6f617d9fad",
      "challenge_id": "8de7dc27-75b7-4ddf-b991-a4740b0f3d29",
      "phone": "+380678410000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-813ca0bb-bde7-4eca-bacd-d99f64bc2ee1",
      "error": null,
      "attempted_at": "2026-10-28T08:07:05.391332Z"
    },
    {
      "id": "1017db96-5045-4351-9316-1555da78e6ab",
      "challenge_id": "8de7dc27-75b7-4ddf-b991-a4740b0f3d29",
      "phone": "+380678410000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T08:07:05.390492Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678410000` → **200**

```json
{
  "phone": "+380678410000",
  "audience": "CLIENT",
  "code": "410189",
  "sent_at": "2026-10-28T08:07:05.391012191Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674870099` → **200**

```json
{
  "deliveries": [
    {
      "id": "c4e3d2b9-65ac-459d-b690-a312d7cdfbdb",
      "challenge_id": "87b6a54f-a5cb-4e6f-a109-0010eeed43df",
      "phone": "+380674870099",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7023281a-d1e0-4d70-aa58-c5d46aec1c0d",
      "error": null,
      "attempted_at": "2026-10-28T08:07:05.331855Z"
    }
  ]
}
```

Done: SMS to +380672495022, a call to +380674870099, SMS then a call to +380678410000.

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
  "session_id": "f082890e-b509-4e4b-a2f6-5a5904027b74",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjYsImlhdCI6MTc5MzE3NDgyNiwianRpIjoiOTRlY2M3MDMtYzliZS00OTVjLTllMjAtZTg0MmViMGQ3NGFkIiwic2lkIjoiZjA4Mjg5MGUtYjUwOS00ZTRiLWEyZjYtNWE1OTA0MDI3Yjc0In0.skNrBgjr_75MUTjHmW7d9iM4bobqK8cHTz9nVYZfkB8",
  "access_expires_at": "2026-10-28T08:22:06.178871857Z",
  "refresh_token": "wgyU1HxzBZ8IzavA7pxTMhrcrzpCvM-E4v8h_5TGQu0",
  "refresh_expires_at": "2026-10-28T20:07:06.178301672Z",
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
  "session_id": "2200d43f-8dcb-4f82-add2-e9840c7308b5",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MjYsImlhdCI6MTc5MzE3NDgyNiwianRpIjoiYTljZjM3ZTEtMmMwYy00ZWMwLThmNmUtMjUxODY1MTRjYzM1Iiwic2lkIjoiMjIwMGQ0M2YtOGRjYi00ZjgyLWFkZDItZTk4NDBjNzMwOGI1In0.vJU0EMzujJb6M0VCgmXa6kfipxoPmxfciwLcyVvj7Pk",
  "access_expires_at": "2026-10-28T08:22:06.496187555Z",
  "refresh_token": "4JKVJKPX5EWg9E8Vj3l7VpI9DJolrcZbtJ-k4FMrHNw",
  "refresh_expires_at": "2026-10-28T20:07:06.495619574Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
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

`POST /api/admin/v1/staff-extensions/6e58bf30-74af-49b1-b760-4df8b5cf7cd6` → **200**

```json
{
  "command_id": "7e4f6912-c2b2-4618-ad25-7f41c2f6bb83",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "e27c8e72-e95b-4e68-80bf-7835ecb5b84f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:07:06.6305Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T08:07:06.6305Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "02e7e28e-c129-43ec-99bf-d7c9749744b4",
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
  "id": "e1e865f6-ea8f-48f0-949c-1bf86b2adcca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:12:06.694210Z",
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
  "command_id": "d17f2bc0-0d31-4d7f-9029-ac7c2623eeb1",
  "quote_id": "e1e865f6-ea8f-48f0-949c-1bf86b2adcca",
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
    "phone": "+380677418060"
  }
}
```

```json
{
  "id": "6e9d551e-1ff5-4d23-a058-89d5fa251f2f",
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
  "created_at": "2026-10-28T08:07:06.731079Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677418060"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/6e9d551e-1ff5-4d23-a058-89d5fa251f2f/calls` → **201**

```json
{
  "command_id": "09539311-5ccd-48c6-96ff-557c59aef4a5",
  "to": "CALLER"
}
```

```json
{
  "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "order_ids": [
    "6e9d551e-1ff5-4d23-a058-89d5fa251f2f"
  ],
  "started_at": "2026-10-28T08:07:06.778651Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/6e9d551e-1ff5-4d23-a058-89d5fa251f2f/calls` → **201**

```json
{
  "command_id": "09539311-5ccd-48c6-96ff-557c59aef4a5",
  "to": "CALLER"
}
```

```json
{
  "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "order_ids": [
    "6e9d551e-1ff5-4d23-a058-89d5fa251f2f"
  ],
  "started_at": "2026-10-28T08:07:06.778651Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677418060",
    "at": "2026-10-28T08:07:06.780702514Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.25508",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=6e9d551e-1ff5-4d23-a058-89d5fa251f2f` → **200**

```json
{
  "calls": [
    {
      "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [
        "6e9d551e-1ff5-4d23-a058-89d5fa251f2f"
      ],
      "started_at": "2026-10-28T08:07:06.778651Z",
      "answered_at": "2026-10-28T08:07:06.915024Z",
      "ended_at": "2026-10-28T08:07:06.935654Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6e9d551e-1ff5-4d23-a058-89d5fa251f2f` → **200**

```json
{
  "calls": [
    {
      "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [
        "6e9d551e-1ff5-4d23-a058-89d5fa251f2f"
      ],
      "started_at": "2026-10-28T08:07:06.778651Z",
      "answered_at": "2026-10-28T08:07:06.915024Z",
      "ended_at": "2026-10-28T08:07:06.935654Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6e9d551e-1ff5-4d23-a058-89d5fa251f2f` → **200**

```json
{
  "calls": [
    {
      "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [
        "6e9d551e-1ff5-4d23-a058-89d5fa251f2f"
      ],
      "started_at": "2026-10-28T08:07:06.778651Z",
      "answered_at": "2026-10-28T08:07:06.915024Z",
      "ended_at": "2026-10-28T08:07:06.935654Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6e9d551e-1ff5-4d23-a058-89d5fa251f2f` → **200**

```json
{
  "calls": [
    {
      "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [
        "6e9d551e-1ff5-4d23-a058-89d5fa251f2f"
      ],
      "started_at": "2026-10-28T08:07:06.778651Z",
      "answered_at": "2026-10-28T08:07:06.915024Z",
      "ended_at": "2026-10-28T08:07:06.935654Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6e9d551e-1ff5-4d23-a058-89d5fa251f2f` → **200**

```json
{
  "calls": [
    {
      "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [
        "6e9d551e-1ff5-4d23-a058-89d5fa251f2f"
      ],
      "started_at": "2026-10-28T08:07:06.778651Z",
      "answered_at": "2026-10-28T08:07:06.915024Z",
      "ended_at": "2026-10-28T08:07:06.935654Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=6e9d551e-1ff5-4d23-a058-89d5fa251f2f` → **200**

```json
{
  "calls": [
    {
      "id": "c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "order_ids": [
        "6e9d551e-1ff5-4d23-a058-89d5fa251f2f"
      ],
      "started_at": "2026-10-28T08:07:06.778651Z",
      "answered_at": "2026-10-28T08:07:06.915024Z",
      "ended_at": "2026-10-28T08:07:06.935654Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:07:15.363727Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/6e9d551e-1ff5-4d23-a058-89d5fa251f2f` → **200**

```json
{
  "id": "6e9d551e-1ff5-4d23-a058-89d5fa251f2f",
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
  "created_at": "2026-10-28T08:07:06.731079Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677418060"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6e9d551e-1ff5-4d23-a058-89d5fa251f2f/cancel` → **200**

```json
{
  "command_id": "e3b1206c-c23f-468e-b84d-fb18e0632651",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6e9d551e-1ff5-4d23-a058-89d5fa251f2f",
  "short_number": 15,
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
  "created_at": "2026-10-28T08:07:06.731079Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677418060"
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

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ec7263bb-0f26-4131-8ce6-0b6598587a82",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T08:07:17.239934Z",
  "extension": "101"
}
```

Done: outgoing call c55d7faf-a3a7-4824-afb7-c2e8c4ba49dd from order 6e9d551e-1ff5-4d23-a058-89d5fa251f2f, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630669446",
  "device_ref": "sandbox-6808"
}
```

```json
{
  "challenge_id": "d116baeb-22ba-4738-9b40-ab9152ef7859",
  "expires_at": "2026-10-28T08:12:17.282875457Z",
  "resend_available_at": "2026-10-28T08:07:18.282875457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630669446` → **200**

```json
{
  "phone": "+380630669446",
  "audience": "CLIENT",
  "code": "949995",
  "sent_at": "2026-10-28T08:07:17.285917832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d116baeb-22ba-4738-9b40-ab9152ef7859",
  "code": "949995",
  "device_ref": "sandbox-6808"
}
```

```json
{
  "session_id": "17c33296-bc7b-4d7d-af45-e852d7e1c610",
  "subject": {
    "type": "CLIENT",
    "id": "197d7e29-4fa1-42e4-8af2-2af4a5087695"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOTdkN2UyOS00ZmExLTQyZTQtOGFmMi0yYWY0YTUwODc2OTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzM3LCJpYXQiOjE3OTMxNzQ4MzcsImp0aSI6Ijg3NDJkYmUxLTNlNTYtNDhhNC04YzU1LTRjZjlmMzIyNDMzYSIsInNpZCI6IjE3YzMzMjk2LWJjN2ItNGQ3ZC1hZjQ1LWU4NTJkN2UxYzYxMCJ9.CuEV6wJ1N3jl1Lcw7f7HUIKoVGQkXp87V15foy_L2sc",
  "access_expires_at": "2026-10-28T08:22:17.340285554Z",
  "refresh_token": "JTaBDd7r2myoLcWQR3FX7TEJI23Weq56C_jiEKwaS5I",
  "refresh_expires_at": "2026-11-27T08:07:17.339777335Z",
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
  "session_id": "eaa8a3e2-77bf-4f0e-9784-47f00d8ac780",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzcsImlhdCI6MTc5MzE3NDgzNywianRpIjoiMGY3NzRlNmMtMTk4YS00YmJiLWI0YmMtZWM3NmYxNmI2MjE5Iiwic2lkIjoiZWFhOGEzZTItNzdiZi00ZjBlLTk3ODQtNDdmMDBkOGFjNzgwIn0.gMu2HTP6Zd-yF13_vK1hIZ1w-AFV2kEnI_EPImkpkyE",
  "access_expires_at": "2026-10-28T08:22:17.738307129Z",
  "refresh_token": "7WCRim8ZHxlq5IAQNVzMujuD04MKX1brSxgUG-vf6S0",
  "refresh_expires_at": "2026-10-28T20:07:17.73779909Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630669446` → **200**

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
  "correlation_id": "4ab44298-38db-45e8-9150-7b9115112e6b"
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
  "session_id": "b5727af8-df00-4c70-a199-1713a9577a63",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzgsImlhdCI6MTc5MzE3NDgzOCwianRpIjoiMzgyOTNlZDYtYTNlZC00NmQ5LThkNGMtY2NjOTgxNzEzZjY0Iiwic2lkIjoiYjU3MjdhZjgtZGYwMC00YzcwLWExOTktMTcxM2E5NTc3YTYzIn0.rUFe5Avndn27_zAFuMar0BBjxw2lODMCFxHasOCuFFU",
  "access_expires_at": "2026-10-28T08:22:18.12694981Z",
  "refresh_token": "sOmLWL-aRm4seenvK2hX4yJ0qr8z2J3DNkVuoipr518",
  "refresh_expires_at": "2026-10-28T20:07:18.126262621Z",
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
  "command_id": "e5d94bfb-abab-4478-9275-5147c718bd97",
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
  "changed_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T08:07:18.208862282Z"
}
```

## The rider books the airport for 2026-10-28T11:07:17Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600290221",
  "device_ref": "sandbox-12028"
}
```

```json
{
  "challenge_id": "97fef8c3-e0b0-44ba-a71e-862fdf4f2793",
  "expires_at": "2026-10-28T08:12:18.242146045Z",
  "resend_available_at": "2026-10-28T08:07:19.242146045Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600290221` → **200**

```json
{
  "phone": "+48600290221",
  "audience": "CLIENT",
  "code": "656441",
  "sent_at": "2026-10-28T08:07:18.244644774Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97fef8c3-e0b0-44ba-a71e-862fdf4f2793",
  "code": "656441",
  "device_ref": "sandbox-12028"
}
```

```json
{
  "session_id": "3d752895-4ff4-4b2d-a36a-f3849ce083b0",
  "subject": {
    "type": "CLIENT",
    "id": "8b982235-dcb6-43da-9dfb-13b026fd94d0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjk4MjIzNS1kY2I2LTQzZGEtOWRmYi0xM2IwMjZmZDk0ZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzM4LCJpYXQiOjE3OTMxNzQ4MzgsImp0aSI6ImQwNDdmMDNhLWEzNmEtNGI0Mi1hZjcwLTZiYWI2MzBmMjMyOSIsInNpZCI6IjNkNzUyODk1LTRmZjQtNGIyZC1hMzZhLWYzODQ5Y2UwODNiMCJ9.GLALHbJ2IClUbWx5RoEzPvfGo-3muJjSkCTtPUi8L_U",
  "access_expires_at": "2026-10-28T08:22:18.30090082Z",
  "refresh_token": "_CuovTpMbEtzp1gEM395aRzuKQmNioFLFcM0-eVhcWU",
  "refresh_expires_at": "2026-11-27T08:07:18.300341054Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c19f95c0-7907-4e08-94d1-1e2e474f7133",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T11:07:17Z"
}
```

```json
{
  "id": "c2350db6-082b-41d0-9627-b73162a13512",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T08:12:18.335831Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T11:07:17Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c5729190-fc3f-4405-8de6-5fca8f5aaba0",
  "quote_id": "c2350db6-082b-41d0-9627-b73162a13512",
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
  "pickup_at": "2026-10-28T11:07:17Z"
}
```

```json
{
  "id": "ddf83271-154c-430a-a75b-cd4c8c43d498",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8b982235-dcb6-43da-9dfb-13b026fd94d0",
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
  "created_at": "2026-10-28T08:07:18.375492Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T11:07:17Z",
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
  "device_ref": "sandbox-11612"
}
```

```json
{
  "challenge_id": "030ca969-006f-4a99-a058-c59236bdcb20",
  "expires_at": "2026-10-28T08:12:18.407614085Z",
  "resend_available_at": "2026-10-28T08:07:19.407614085Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "710790",
  "sent_at": "2026-10-28T08:07:18.410028846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "030ca969-006f-4a99-a058-c59236bdcb20",
  "code": "710790",
  "device_ref": "sandbox-11612"
}
```

```json
{
  "session_id": "475bc396-fc01-464b-a339-65f38c8a446f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTczOCwiaWF0IjoxNzkzMTc0ODM4LCJqdGkiOiI4MWFiMTNmYi1lMGE5LTQ1NmQtYjIzNi0zNmE1NzJkODU5MGEiLCJzaWQiOiI0NzViYzM5Ni1mYzAxLTQ2NGItYTMzOS02NWYzOGM4YTQ0NmYifQ.ewhsCBCBbgTmk5bKaAUOkIzh14vfYXnYhv2B1b73wnA",
  "access_expires_at": "2026-10-28T08:22:18.464279175Z",
  "refresh_token": "veTQ7zJRvBjREmDXLdnZNq9GcZUI3SgoC43GH-F0ayU",
  "refresh_expires_at": "2026-11-27T08:07:18.463783449Z",
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
  "command_id": "7a0640e1-588d-4c07-a16e-e527b2a699f3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:18Z",
    "sequence": 1793174838513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "98679371-f402-48e3-be30-ae192ffdc220",
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
  "last_heartbeat_at": "2026-10-28T08:07:18.530365Z",
  "last_location_at": "2026-10-28T08:07:18.530365Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "ddf83271-154c-430a-a75b-cd4c8c43d498",
      "short_number": 16,
      "pickup_at": "2026-10-28T11:07:17Z",
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

`POST /api/driver/v1/preorders/ddf83271-154c-430a-a75b-cd4c8c43d498/reserve` → **200**

```json
{
  "command_id": "84c07734-0190-4b9b-8ea2-c5fb56c9e27a"
}
```

```json
{
  "id": "dffa3c0e-dc6c-41e4-a7e7-b4911984164d",
  "state": "RESERVED",
  "order": {
    "order_id": "ddf83271-154c-430a-a75b-cd4c8c43d498",
    "short_number": 16,
    "pickup_at": "2026-10-28T11:07:17Z",
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
  "reserved_at": "2026-10-28T08:07:18.593003Z",
  "confirm_from": "2026-10-28T10:37:17Z",
  "confirm_until": "2026-10-28T10:47:17Z",
  "drop_until": "2026-10-28T10:07:17Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "dffa3c0e-dc6c-41e4-a7e7-b4911984164d",
      "state": "RESERVED",
      "order": {
        "order_id": "ddf83271-154c-430a-a75b-cd4c8c43d498",
        "short_number": 16,
        "pickup_at": "2026-10-28T11:07:17Z",
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
      "reserved_at": "2026-10-28T08:07:18.593003Z",
      "confirm_from": "2026-10-28T10:37:17Z",
      "confirm_until": "2026-10-28T10:47:17Z",
      "drop_until": "2026-10-28T10:07:17Z"
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
      "id": "dffa3c0e-dc6c-41e4-a7e7-b4911984164d",
      "state": "RESERVED",
      "order": {
        "order_id": "ddf83271-154c-430a-a75b-cd4c8c43d498",
        "short_number": 16,
        "pickup_at": "2026-10-28T11:07:17Z",
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
      "reserved_at": "2026-10-28T08:07:18.593003Z",
      "confirm_from": "2026-10-28T10:37:17Z",
      "confirm_until": "2026-10-28T10:47:17Z",
      "drop_until": "2026-10-28T10:07:17Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/dffa3c0e-dc6c-41e4-a7e7-b4911984164d/confirm` → **409**

```json
{
  "command_id": "dc58f17e-4909-4b57-8899-fed49460016e"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/dffa3c0e-dc6c-41e4-a7e7-b4911984164d/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3ccc112b-2fb0-44bd-9639-445516786aa6"
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
  "session_id": "b5eb5bf0-78c3-4202-9ab7-59d8aa49249d",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3MzgsImlhdCI6MTc5MzE3NDgzOCwianRpIjoiNTdhYmI2MWQtZTRmZS00YWRmLWFiNTktYWVjZjZhODllMWJhIiwic2lkIjoiYjVlYjViZjAtNzhjMy00MjAyLTlhYjctNTlkOGFhNDkyNDlkIn0.5HNZaGbQo3FdX5re49MsQ0JNDWOeG3bYD0-8RT6wtsw",
  "access_expires_at": "2026-10-28T08:22:18.99597928Z",
  "refresh_token": "Gxql723JpSAlwhTKCPHpuuriGZ_QDJdCrWX4nUcftQ0",
  "refresh_expires_at": "2026-10-28T20:07:18.995393101Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ddf83271-154c-430a-a75b-cd4c8c43d498` → **200**

```json
{
  "id": "ddf83271-154c-430a-a75b-cd4c8c43d498",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8b982235-dcb6-43da-9dfb-13b026fd94d0",
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
  "created_at": "2026-10-28T08:07:18.375492Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T11:07:17Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "dffa3c0e-dc6c-41e4-a7e7-b4911984164d",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T08:07:18.593003Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ddf83271-154c-430a-a75b-cd4c8c43d498/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T08:07:18.376787Z",
      "actor": {
        "type": "CLIENT",
        "id": "8b982235-dcb6-43da-9dfb-13b026fd94d0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "ddf83271-154c-430a-a75b-cd4c8c43d498",
        "preorder": true,
        "quote_id": "c2350db6-082b-41d0-9627-b73162a13512",
        "pickup_at": "2026-10-28T11:07:17Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T08:07:18.594154Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ddf83271-154c-430a-a75b-cd4c8c43d498",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "dffa3c0e-dc6c-41e4-a7e7-b4911984164d"
      }
    }
  ]
}
```

Done: pre-order ddf83271-154c-430a-a75b-cd4c8c43d498, reservation dffa3c0e-dc6c-41e4-a7e7-b4911984164d.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11758"
}
```

```json
{
  "challenge_id": "71a6e7a5-a56c-4aed-ac3b-631af83e2630",
  "expires_at": "2026-10-28T08:12:19.08267977Z",
  "resend_available_at": "2026-10-28T08:07:20.08267977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "211148",
  "sent_at": "2026-10-28T08:07:19.084799744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71a6e7a5-a56c-4aed-ac3b-631af83e2630",
  "code": "211148",
  "device_ref": "sandbox-11758"
}
```

```json
{
  "session_id": "bf50af6c-6fbb-438c-9ce3-8dd914dced5d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTczOSwiaWF0IjoxNzkzMTc0ODM5LCJqdGkiOiJiMzhiNDA4Zi0yMmU1LTQxMjktODA4OC1lNWJmZTc3MzVmZmQiLCJzaWQiOiJiZjUwYWY2Yy02ZmJiLTQzOGMtOWNlMy04ZGQ5MTRkY2VkNWQifQ.-x7Z7WKGelA3UFf7QXvf1Q5JtkeimHjxvSnm9w1wABE",
  "access_expires_at": "2026-10-28T08:22:19.140597037Z",
  "refresh_token": "MUnsZwD8kyVjDCrJoD-1NC-PLgWU7rRXxE38TEBP_rI",
  "refresh_expires_at": "2026-11-27T08:07:19.140092194Z",
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
  "command_id": "d1c1f6e0-abef-4c6f-9dde-cf99a26e8851",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:19Z",
    "sequence": 1793174839199
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5cf3c70-8924-49f7-97a0-375e16a57040",
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
  "last_heartbeat_at": "2026-10-28T08:07:19.216537Z",
  "last_location_at": "2026-10-28T08:07:19.216537Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676431906",
  "device_ref": "sandbox-6572"
}
```

```json
{
  "challenge_id": "f4357fa1-cae7-45fc-bcf4-1c083efbebb5",
  "expires_at": "2026-10-28T08:12:19.245171506Z",
  "resend_available_at": "2026-10-28T08:07:20.245171506Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676431906` → **200**

```json
{
  "phone": "+380676431906",
  "audience": "CLIENT",
  "code": "829922",
  "sent_at": "2026-10-28T08:07:19.247336129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4357fa1-cae7-45fc-bcf4-1c083efbebb5",
  "code": "829922",
  "device_ref": "sandbox-6572"
}
```

```json
{
  "session_id": "afc064ba-b4de-452b-b753-898eaa25b5b2",
  "subject": {
    "type": "CLIENT",
    "id": "f806eb15-80d8-4c16-a268-18e2af9b1db9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODA2ZWIxNS04MGQ4LTRjMTYtYTI2OC0xOGUyYWY5YjFkYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzM5LCJpYXQiOjE3OTMxNzQ4MzksImp0aSI6IjYwOWE4YzE1LTZmYzktNDExOS1hZWYzLWM4MmJjMTczYjQ1ZSIsInNpZCI6ImFmYzA2NGJhLWI0ZGUtNDUyYi1iNzUzLTg5OGVhYTI1YjViMiJ9.eqim3wU8rT1EQdynlsNXzguLaZ9i63DNI8ZwNQ5r6HA",
  "access_expires_at": "2026-10-28T08:22:19.301326515Z",
  "refresh_token": "xi4y8h9EE7pXODGd7cjeJeltd_x4-RTpDrrO_Mx0S9A",
  "refresh_expires_at": "2026-11-27T08:07:19.300754743Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04db839f-232d-4dfe-851f-db28fff51b02",
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
  "id": "8095484a-c366-444b-a138-def7c0aeccbb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:12:19.338237Z",
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
  "command_id": "15ed5231-9bc8-4600-bfc8-a2796e6fdd44",
  "quote_id": "8095484a-c366-444b-a138-def7c0aeccbb",
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
  "id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f806eb15-80d8-4c16-a268-18e2af9b1db9",
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
  "created_at": "2026-10-28T08:07:19.375862Z",
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
    "id": "bbc23bb9-2956-4be2-b447-f45a3dbb5ee4",
    "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
    "expires_at": "2026-10-28T08:07:34.378952Z",
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

`POST /api/driver/v1/offers/bbc23bb9-2956-4be2-b447-f45a3dbb5ee4/accept` → **200**

```json
{
  "command_id": "ceedf066-9ae3-4d43-8580-f4c9094391d2"
}
```

```json
{
  "id": "5eaeda90-0ee5-43b0-a3d2-14fc754ce33e",
  "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "018ba6cb-51ce-41f0-af59-e59825b1145c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "018ba6cb-51ce-41f0-af59-e59825b1145c",
  "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "assignment_id": "5eaeda90-0ee5-43b0-a3d2-14fc754ce33e",
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

`POST /api/driver/v1/work-sessions/c5cf3c70-8924-49f7-97a0-375e16a57040/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:19Z",
    "sequence": 1793174839486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5cf3c70-8924-49f7-97a0-375e16a57040",
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
  "last_heartbeat_at": "2026-10-28T08:07:19.504181Z",
  "last_location_at": "2026-10-28T08:07:19.504181Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "018ba6cb-51ce-41f0-af59-e59825b1145c",
  "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "assignment_id": "5eaeda90-0ee5-43b0-a3d2-14fc754ce33e",
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

`POST /api/driver/v1/trips/018ba6cb-51ce-41f0-af59-e59825b1145c/arrive` → **200**

```json
{
  "command_id": "0a9d227b-6837-43e4-90eb-52535062175e",
  "expected_version": 0
}
```

```json
{
  "id": "018ba6cb-51ce-41f0-af59-e59825b1145c",
  "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "assignment_id": "5eaeda90-0ee5-43b0-a3d2-14fc754ce33e",
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
  "arrived_at": "2026-10-28T08:07:19.554107Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/018ba6cb-51ce-41f0-af59-e59825b1145c/start` → **200**

```json
{
  "command_id": "5c7f4158-1427-41fc-ab92-dc463a31070e",
  "expected_version": 1
}
```

```json
{
  "id": "018ba6cb-51ce-41f0-af59-e59825b1145c",
  "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "assignment_id": "5eaeda90-0ee5-43b0-a3d2-14fc754ce33e",
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
  "arrived_at": "2026-10-28T08:07:19.554107Z",
  "started_at": "2026-10-28T08:07:19.589356Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c5cf3c70-8924-49f7-97a0-375e16a57040/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:19Z",
    "sequence": 1793174839619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5cf3c70-8924-49f7-97a0-375e16a57040",
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
  "last_heartbeat_at": "2026-10-28T08:07:19.649613Z",
  "last_location_at": "2026-10-28T08:07:19.649613Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/018ba6cb-51ce-41f0-af59-e59825b1145c/complete` → **200**

```json
{
  "command_id": "482f7c26-7aa1-4466-b726-4b27bcef51b3",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:07:19Z",
  "cash_received": true
}
```

```json
{
  "id": "018ba6cb-51ce-41f0-af59-e59825b1145c",
  "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "assignment_id": "5eaeda90-0ee5-43b0-a3d2-14fc754ce33e",
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
  "arrived_at": "2026-10-28T08:07:19.554107Z",
  "started_at": "2026-10-28T08:07:19.589356Z",
  "completed_at": "2026-10-28T08:07:19.68711Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/8773feb2-500d-4da9-a93c-fa7f1077af98/rating` → **200**

```json
{
  "command_id": "5f1636a4-05fb-42f9-a095-f4ee3a23ec1c",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "score": 5,
  "created_at": "2026-10-28T08:07:19.736047246Z"
}
```

`POST /api/driver/v1/orders/8773feb2-500d-4da9-a93c-fa7f1077af98/rating` → **200**

```json
{
  "command_id": "afc9aa09-36ad-423c-9d06-e48de3e0bc8d",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
  "score": 4,
  "created_at": "2026-10-28T08:07:19.769673314Z"
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
  "session_id": "7fa20cfd-acd2-4672-a32b-df8bdbf6f162",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NDAsImlhdCI6MTc5MzE3NDg0MCwianRpIjoiNWZhY2FlZWEtMDZkOS00ZTA5LWJmY2MtYmQ4ZTEwZTc3Mzk5Iiwic2lkIjoiN2ZhMjBjZmQtYWNkMi00NjcyLWEzMmItZGY4YmRiZjZmMTYyIn0.8djUrN3oKhaMrL1mw7EkqL7-473SCoaM7y_1AlFX9yE",
  "access_expires_at": "2026-10-28T08:22:20.122699807Z",
  "refresh_token": "EnrfKcrgXv0ZgwiUkmSjY6wD_b6jLL0KoApYT1ut2Qc",
  "refresh_expires_at": "2026-10-28T20:07:20.122108465Z",
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
  "session_id": "0af48c1b-1726-4180-a5e0-c04b31f2fbe0",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NDAsImlhdCI6MTc5MzE3NDg0MCwianRpIjoiMDE3YTEzODAtZjI3Ny00MjMwLWIyY2UtNzViZWI3ZjZhMTZmIiwic2lkIjoiMGFmNDhjMWItMTcyNi00MTgwLWE1ZTAtYzA0YjMxZjJmYmUwIn0.dpt1RYZpQPqkB5T8KwmRwf3XnAPwlfioVPSwQOYdV24",
  "access_expires_at": "2026-10-28T08:22:20.449065069Z",
  "refresh_token": "gbh3UgzChdLgQUS1yHMBYKrKpz1XfqqId_PGMzXOut4",
  "refresh_expires_at": "2026-10-28T20:07:20.448531623Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8773feb2-500d-4da9-a93c-fa7f1077af98/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
      "author_type": "RIDER",
      "author_id": "f806eb15-80d8-4c16-a268-18e2af9b1db9",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T08:07:19.736047Z"
    },
    {
      "order_id": "8773feb2-500d-4da9-a93c-fa7f1077af98",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "f806eb15-80d8-4c16-a268-18e2af9b1db9",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T08:07:19.769673Z"
    }
  ]
}
```

Done: ratings for order 8773feb2-500d-4da9-a93c-fa7f1077af98.

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
  "session_id": "b024aaa5-ceb7-47aa-b89e-890c3b0b76cd",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NDAsImlhdCI6MTc5MzE3NDg0MCwianRpIjoiMWVhMGZmYmMtMWMzMC00NDYxLWFjZGMtMzUyMTYwYWE2OWE1Iiwic2lkIjoiYjAyNGFhYTUtY2ViNy00N2FhLWI4OWUtODkwYzNiMGI3NmNkIn0._rJt60KU60PzcYohtVaLKatHNCW50t5EVA3mcfYbSbg",
  "access_expires_at": "2026-10-28T08:22:20.815743216Z",
  "refresh_token": "5mxzEGenepqLTGFc8eb0xTFJ4MbvzH4vO3Qa3m_rPmI",
  "refresh_expires_at": "2026-10-28T20:07:20.815205802Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "35a59bf2-3c08-4335-8a99-88f42037a85e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "df99156e-d887-48cf-a328-092054f53063",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:20.856092Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/df99156e-d887-48cf-a328-092054f53063` → **200**

```json
{
  "id": "df99156e-d887-48cf-a328-092054f53063",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:20.856092Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/df99156e-d887-48cf-a328-092054f53063` → **200**

```json
{
  "id": "df99156e-d887-48cf-a328-092054f53063",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:20.856092Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/df99156e-d887-48cf-a328-092054f53063` → **200**

```json
{
  "id": "df99156e-d887-48cf-a328-092054f53063",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:20.856092Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/df99156e-d887-48cf-a328-092054f53063` → **200**

```json
{
  "id": "df99156e-d887-48cf-a328-092054f53063",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:20.856092Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/df99156e-d887-48cf-a328-092054f53063` → **200**

```json
{
  "id": "df99156e-d887-48cf-a328-092054f53063",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:20.856092Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/df99156e-d887-48cf-a328-092054f53063` → **200**

```json
{
  "id": "df99156e-d887-48cf-a328-092054f53063",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:07:20.856092Z",
  "ready_at": "2026-10-28T08:07:25.376339Z",
  "expires_at": "2026-10-29T08:07:25.376339Z"
}
```

`GET /api/admin/v1/reports/exports/df99156e-d887-48cf-a328-092054f53063/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,16,6,10,0,0,12,4,0,14,1,0,1,5,1,4
total,16,6,10,0,0,12,4,0,14,1,0,1,5,1,4
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a10cabe4-62fd-4e8a-8db6-570ccf913340",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "c2c6b095-0098-4811-a38c-e1531e9177bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:26.079933Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c2c6b095-0098-4811-a38c-e1531e9177bd` → **200**

```json
{
  "id": "c2c6b095-0098-4811-a38c-e1531e9177bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:26.079933Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c2c6b095-0098-4811-a38c-e1531e9177bd` → **200**

```json
{
  "id": "c2c6b095-0098-4811-a38c-e1531e9177bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:26.079933Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c2c6b095-0098-4811-a38c-e1531e9177bd` → **200**

```json
{
  "id": "c2c6b095-0098-4811-a38c-e1531e9177bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:26.079933Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c2c6b095-0098-4811-a38c-e1531e9177bd` → **200**

```json
{
  "id": "c2c6b095-0098-4811-a38c-e1531e9177bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:26.079933Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c2c6b095-0098-4811-a38c-e1531e9177bd` → **200**

```json
{
  "id": "c2c6b095-0098-4811-a38c-e1531e9177bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T08:07:26.079933Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/c2c6b095-0098-4811-a38c-e1531e9177bd` → **200**

```json
{
  "id": "c2c6b095-0098-4811-a38c-e1531e9177bd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T08:07:26.079933Z",
  "ready_at": "2026-10-28T08:07:30.384292Z",
  "expires_at": "2026-10-29T08:07:30.384292Z"
}
```

`GET /api/admin/v1/reports/exports/c2c6b095-0098-4811-a38c-e1531e9177bd/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/67cfc933-9526-4682-9a89-1d97caa98333` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/67cfc933-9526-4682-9a89-1d97caa98333",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9c1c0eed-6ed6-47a7-97fb-1692989985e0"
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
  "session_id": "305a1b8e-d4cf-45dc-9f35-edb4703c93aa",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NTEsImlhdCI6MTc5MzE3NDg1MSwianRpIjoiM2M0MDVjMzgtZTc1MC00MDAwLThiYjEtNjNjZjZlN2E4ODJjIiwic2lkIjoiMzA1YTFiOGUtZDRjZi00NWRjLTlmMzUtZWRiNDcwM2M5M2FhIn0.UmPzu5i7z8DqvZDlprQNpGsaXbL3khxClpIu9ViWh0g",
  "access_expires_at": "2026-10-28T08:22:31.626907279Z",
  "refresh_token": "xv7SqyqMh9dYIuO9cP1Q9fXfYzg53ZX4QmJCgG_kkG4",
  "refresh_expires_at": "2026-10-28T20:07:31.626376447Z",
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
  "command_id": "02728330-4b1d-4c9f-bebf-7d99bcb1c49c",
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
  "changed_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:07:31.696696Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "02728330-4b1d-4c9f-bebf-7d99bcb1c49c",
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
  "changed_by": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T08:07:31.696696Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48998260455",
  "device_ref": "sandbox-8569"
}
```

```json
{
  "challenge_id": "c77b14c6-800c-4b11-8704-8af2f6a13166",
  "expires_at": "2026-10-28T08:12:31.771770937Z",
  "resend_available_at": "2026-10-28T08:07:32.771770937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48998260455` → **200**

```json
{
  "phone": "+48998260455",
  "audience": "CLIENT",
  "code": "305538",
  "sent_at": "2026-10-28T08:07:31.774066729Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c77b14c6-800c-4b11-8704-8af2f6a13166",
  "code": "305538",
  "device_ref": "sandbox-8569"
}
```

```json
{
  "session_id": "f2be36aa-d496-4b95-8778-2709dee5b612",
  "subject": {
    "type": "CLIENT",
    "id": "f5474216-3936-4274-a916-6223475d499e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTQ3NDIxNi0zOTM2LTQyNzQtYTkxNi02MjIzNDc1ZDQ5OWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzUxLCJpYXQiOjE3OTMxNzQ4NTEsImp0aSI6IjAyNDU0YjAwLWEyODYtNGM1YS05NzVhLThjNGUzN2RlMzJkYiIsInNpZCI6ImYyYmUzNmFhLWQ0OTYtNGI5NS04Nzc4LTI3MDlkZWU1YjYxMiJ9.JfyR5AcrQe4HCUb9Xjw679ItDJqhVjwBWCqEEyse2Ok",
  "access_expires_at": "2026-10-28T08:22:31.82724301Z",
  "refresh_token": "FaS7YNS8nbdEoDcmbLp_Gn2-p8hQW_tM08FUugLO3s8",
  "refresh_expires_at": "2026-11-27T08:07:31.82675669Z",
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
  "correlation_id": "46092a64-dd4d-4d0d-af0b-f0342ef47c1f"
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
  "device_ref": "sandbox-2963"
}
```

```json
{
  "challenge_id": "31e5e490-c360-4484-b148-a22a246a7e64",
  "expires_at": "2026-10-28T08:12:31.90477581Z",
  "resend_available_at": "2026-10-28T08:07:32.90477581Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "074763",
  "sent_at": "2026-10-28T08:07:31.906973025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31e5e490-c360-4484-b148-a22a246a7e64",
  "code": "074763",
  "device_ref": "sandbox-2963"
}
```

```json
{
  "session_id": "6d2ddd9e-7ee9-4b61-89e8-be43a08ba0f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTc1MSwiaWF0IjoxNzkzMTc0ODUxLCJqdGkiOiI0NmI0YmZmYS05ZjQwLTQwMDItOWI2MS0yOGQ1NjU5OTRiM2IiLCJzaWQiOiI2ZDJkZGQ5ZS03ZWU5LTRiNjEtODllOC1iZTQzYTA4YmEwZjMifQ.Ac48ycy0kzO5USEAOnM6CQnbzb57fDAgEI8iWCddJFc",
  "access_expires_at": "2026-10-28T08:22:31.962032678Z",
  "refresh_token": "AwQy3WmnG4MfsOys7MT8FsN1C_oR_XDj6dE254hnpZo",
  "refresh_expires_at": "2026-11-27T08:07:31.96134686Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "98679371-f402-48e3-be30-ae192ffdc220",
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
  "last_heartbeat_at": "2026-10-28T08:07:18.530365Z",
  "last_location_at": "2026-10-28T08:07:18.530365Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/98679371-f402-48e3-be30-ae192ffdc220/handover` → **200**

```json
{
  "command_id": "b795cccc-975b-4262-a32a-6e7b9543df76",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "98679371-f402-48e3-be30-ae192ffdc220",
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
  "last_heartbeat_at": "2026-10-28T08:07:18.530365Z",
  "last_location_at": "2026-10-28T08:07:18.530365Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/98679371-f402-48e3-be30-ae192ffdc220/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:32Z",
    "sequence": 1793174852451
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "98679371-f402-48e3-be30-ae192ffdc220",
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
  "last_heartbeat_at": "2026-10-28T08:07:32.065059Z",
  "last_location_at": "2026-10-28T08:07:32.065059Z",
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
  "session_id": "98679371-f402-48e3-be30-ae192ffdc220",
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
  "last_heartbeat_at": "2026-10-28T08:07:32.065059Z",
  "last_location_at": "2026-10-28T08:07:32.065059Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/98679371-f402-48e3-be30-ae192ffdc220/close` → **200**

```json
{
  "command_id": "337cd231-cc19-4878-8630-e50e2d791c8e",
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
  "correlation_id": "1038f4d4-ec59-4dbc-84b4-1f03f1868625"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679058772",
  "device_ref": "sandbox-12526"
}
```

```json
{
  "challenge_id": "d0f41f58-b0da-4537-b9db-a8a0d191f180",
  "expires_at": "2026-10-28T08:12:32.223766173Z",
  "resend_available_at": "2026-10-28T08:07:33.223766173Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679058772` → **200**

```json
{
  "phone": "+380679058772",
  "audience": "CLIENT",
  "code": "653640",
  "sent_at": "2026-10-28T08:07:32.225967585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0f41f58-b0da-4537-b9db-a8a0d191f180",
  "code": "653640",
  "device_ref": "sandbox-12526"
}
```

```json
{
  "session_id": "34774dd3-640f-41d1-92b7-86889e940dac",
  "subject": {
    "type": "CLIENT",
    "id": "ca3576ea-8044-4990-a765-a9740e5e9b1b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM1NzZlYS04MDQ0LTQ5OTAtYTc2NS1hOTc0MGU1ZTliMWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc1NzUyLCJpYXQiOjE3OTMxNzQ4NTIsImp0aSI6IjhlNGY2MDQ5LWJjZmMtNDEwMy05MTNmLWIyZjE0OGUzNzM5NyIsInNpZCI6IjM0Nzc0ZGQzLTY0MGYtNDFkMS05MmI3LTg2ODg5ZTk0MGRhYyJ9.6EDmjyn9kY-SwOlXn_nnp8h_lCtHFup_E_0WYClOQYY",
  "access_expires_at": "2026-10-28T08:22:32.28146026Z",
  "refresh_token": "DA1SFq6mVdg7X5aftAgXpFgL0QeKP-NMbejzy0lEvlI",
  "refresh_expires_at": "2026-11-27T08:07:32.280938385Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "90ca54ce-0d19-4d53-b90f-a01b9347c23a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b",
  "upload_path": "/api/rider/v1/uploads/32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b",
  "expires_at": "2026-10-28T08:22:32.318077873Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b` → **200**

```json
{
  "file_id": "32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "54263e54-9bfa-4ee2-8b93-ffd4c09688ee",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b"
  ]
}
```

```json
{
  "id": "8eca44d9-4733-4a84-aa60-a7d7d0981f12",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ca3576ea-8044-4990-a765-a9740e5e9b1b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:07:32.387808Z",
  "updated_at": "2026-10-28T08:07:32.387808Z",
  "messages": [
    {
      "id": "6a8b5421-072f-47fc-be97-d83a497db63a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ca3576ea-8044-4990-a765-a9740e5e9b1b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:07:32.389093Z",
      "attachments": [
        {
          "file_id": "32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b",
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
  "session_id": "303ba78a-da67-4523-9913-b4ba93438d52",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NTIsImlhdCI6MTc5MzE3NDg1MiwianRpIjoiZmRiNWUyYWYtMTU5NC00NTIwLThlNDktYjBlYzdkOWYwYTgyIiwic2lkIjoiMzAzYmE3OGEtZGE2Ny00NTIzLTk5MTMtYjRiYTkzNDM4ZDUyIn0.TDRdtBId0N0OEpYHVIZ5jcM0k6Vw-UoEL8GHyl9_vMY",
  "access_expires_at": "2026-10-28T08:22:32.726393659Z",
  "refresh_token": "ksMP4KjbBxJ9opjYF_533PCoJB1UgnJxUVrb3IkUgpI",
  "refresh_expires_at": "2026-10-28T20:07:32.725834945Z",
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
  "session_id": "825ced6e-94e8-487c-87a2-1a4c86685c55",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NTMsImlhdCI6MTc5MzE3NDg1MywianRpIjoiYzg3Y2UzZTQtOWRjZC00MTllLWI4MjEtOTcxNmNhYjI2Njk5Iiwic2lkIjoiODI1Y2VkNmUtOTRlOC00ODdjLTg3YTItMWE0Yzg2Njg1YzU1In0._tcqitMf9CXBS-EAlMJQh879ypge9SOposYFHQTbNlo",
  "access_expires_at": "2026-10-28T08:22:33.04364288Z",
  "refresh_token": "u6dEUVQaA0q-lbf5XljPyq8e-6JmUEa6cxdtAwygYCk",
  "refresh_expires_at": "2026-10-28T20:07:33.043053018Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8eca44d9-4733-4a84-aa60-a7d7d0981f12/attachments/32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "fc29d9a5-42f4-48d1-a2df-423fd5390459",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "50ae5cc7-e74f-480d-80d4-989ad8b8f5ee",
  "upload_path": "/api/operator/v1/uploads/50ae5cc7-e74f-480d-80d4-989ad8b8f5ee",
  "expires_at": "2026-10-28T08:22:33.090287719Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/50ae5cc7-e74f-480d-80d4-989ad8b8f5ee` → **200**

```json
{
  "file_id": "50ae5cc7-e74f-480d-80d4-989ad8b8f5ee",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8eca44d9-4733-4a84-aa60-a7d7d0981f12` → **200**

```json
{
  "id": "8eca44d9-4733-4a84-aa60-a7d7d0981f12",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ca3576ea-8044-4990-a765-a9740e5e9b1b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T08:07:32.387808Z",
  "updated_at": "2026-10-28T08:07:32.387808Z",
  "messages": [
    {
      "id": "6a8b5421-072f-47fc-be97-d83a497db63a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ca3576ea-8044-4990-a765-a9740e5e9b1b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:07:32.389093Z",
      "attachments": [
        {
          "file_id": "32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8eca44d9-4733-4a84-aa60-a7d7d0981f12/comments` → **200**

```json
{
  "command_id": "708c293f-cc7a-48a2-a6f2-e98f2d6fec5a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "50ae5cc7-e74f-480d-80d4-989ad8b8f5ee"
  ]
}
```

```json
{
  "id": "8eca44d9-4733-4a84-aa60-a7d7d0981f12",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ca3576ea-8044-4990-a765-a9740e5e9b1b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:07:32.387808Z",
  "updated_at": "2026-10-28T08:07:33.188309Z",
  "messages": [
    {
      "id": "6a8b5421-072f-47fc-be97-d83a497db63a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ca3576ea-8044-4990-a765-a9740e5e9b1b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:07:32.389093Z",
      "attachments": [
        {
          "file_id": "32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cdd4a94c-0f87-4afc-a235-4374a04e7c5d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:07:33.187826Z",
      "attachments": [
        {
          "file_id": "50ae5cc7-e74f-480d-80d4-989ad8b8f5ee",
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

`GET /api/rider/v1/support/cases/8eca44d9-4733-4a84-aa60-a7d7d0981f12` → **200**

```json
{
  "id": "8eca44d9-4733-4a84-aa60-a7d7d0981f12",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "ca3576ea-8044-4990-a765-a9740e5e9b1b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T08:07:32.387808Z",
  "updated_at": "2026-10-28T08:07:33.188309Z",
  "messages": [
    {
      "id": "6a8b5421-072f-47fc-be97-d83a497db63a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "ca3576ea-8044-4990-a765-a9740e5e9b1b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T08:07:32.389093Z",
      "attachments": [
        {
          "file_id": "32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cdd4a94c-0f87-4afc-a235-4374a04e7c5d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T08:07:33.187826Z",
      "attachments": [
        {
          "file_id": "50ae5cc7-e74f-480d-80d4-989ad8b8f5ee",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8eca44d9-4733-4a84-aa60-a7d7d0981f12/attachments/50ae5cc7-e74f-480d-80d4-989ad8b8f5ee` → **200**

Done: support case 8eca44d9-4733-4a84-aa60-a7d7d0981f12, rider attachment 32ddbb5f-4d0a-4c33-8734-92b7d8b23b7b, operator attachment 50ae5cc7-e74f-480d-80d4-989ad8b8f5ee.

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
  "session_id": "be068473-78b5-4817-84ae-f6b82c818ff5",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NTMsImlhdCI6MTc5MzE3NDg1MywianRpIjoiYTFjMDE3YzMtZTc1Zi00OTg4LWI0ZDUtY2I3YTdjNWM4ZDJhIiwic2lkIjoiYmUwNjg0NzMtNzhiNS00ODE3LTg0YWUtZjZiODJjODE4ZmY1In0.6_t3UE85e5ZXvXHAiGnAeNUYAn29lu_8Hauhcf0_HU0",
  "access_expires_at": "2026-10-28T08:22:33.57724385Z",
  "refresh_token": "9XmI20hj3oyhpNtkHMem_DcZmTsmxfrAj-lks1gK924",
  "refresh_expires_at": "2026-10-28T20:07:33.576660811Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-32038"
}
```

```json
{
  "challenge_id": "cdca9b3d-439c-4490-a47f-543dbf311104",
  "expires_at": "2026-10-28T08:12:33.605676548Z",
  "resend_available_at": "2026-10-28T08:07:34.605676548Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "190955",
  "sent_at": "2026-10-28T08:07:33.608346521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdca9b3d-439c-4490-a47f-543dbf311104",
  "code": "190955",
  "device_ref": "sandbox-32038"
}
```

```json
{
  "session_id": "39f994c4-8b2b-4fa2-9e08-47c2f2d06f6b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTc1MywiaWF0IjoxNzkzMTc0ODUzLCJqdGkiOiJmOTY2MmFmMy1kM2M2LTRkNTYtYjNlMS05Nzc3ZWE3MmM2ZWYiLCJzaWQiOiIzOWY5OTRjNC04YjJiLTRmYTItOWUwOC00N2MyZjJkMDZmNmIifQ.CNaf5mc6DNdecc-tZuMH5MeGU1bFj7z5zEJDHfsDO2c",
  "access_expires_at": "2026-10-28T08:22:33.668385704Z",
  "refresh_token": "x_LyG--3sTUkyabAjZtSYdKoYl7KMzRnJSMH0c028mQ",
  "refresh_expires_at": "2026-11-27T08:07:33.667805733Z",
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
  "command_id": "cde9f222-81b6-4205-a380-71456e138a3c",
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
  "device_ref": "sandbox-19939"
}
```

```json
{
  "challenge_id": "fdb2cafc-ec3c-4dc6-bd0c-eea6fd63b964",
  "expires_at": "2026-10-28T08:12:33.812699296Z",
  "resend_available_at": "2026-10-28T08:07:34.812699296Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "889745",
  "sent_at": "2026-10-28T08:07:33.815099406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdb2cafc-ec3c-4dc6-bd0c-eea6fd63b964",
  "code": "889745",
  "device_ref": "sandbox-19939"
}
```

```json
{
  "session_id": "678108bb-469b-4960-bf6d-0b39508ec8bf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NTc1MywiaWF0IjoxNzkzMTc0ODUzLCJqdGkiOiI3NjVhZjZjOS0xZTU5LTQ3NWUtYjQ5My0yZWI3ZmRjYWNjZjciLCJzaWQiOiI2NzgxMDhiYi00NjliLTQ5NjAtYmY2ZC0wYjM5NTA4ZWM4YmYifQ.7jvc0VLXD_hg2N_6EE6zbKg-ikywaudxECPaeSgmx3o",
  "access_expires_at": "2026-10-28T08:22:33.874095539Z",
  "refresh_token": "18-I2QNAZOPL4FKRoYsJ7axXDkxGktsop9ee4Ev1NHg",
  "refresh_expires_at": "2026-11-27T08:07:33.872716316Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5cf3c70-8924-49f7-97a0-375e16a57040",
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
  "last_heartbeat_at": "2026-10-28T08:07:19.649613Z",
  "last_location_at": "2026-10-28T08:07:19.649613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5cf3c70-8924-49f7-97a0-375e16a57040/handover` → **200**

```json
{
  "command_id": "b1a4ee0f-2e6a-48c9-b01e-f2d01deb0c8f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5cf3c70-8924-49f7-97a0-375e16a57040",
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
  "last_heartbeat_at": "2026-10-28T08:07:19.649613Z",
  "last_location_at": "2026-10-28T08:07:19.649613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5cf3c70-8924-49f7-97a0-375e16a57040/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:33Z",
    "sequence": 1793174853967
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c5cf3c70-8924-49f7-97a0-375e16a57040",
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
  "last_heartbeat_at": "2026-10-28T08:07:33.986369Z",
  "last_location_at": "2026-10-28T08:07:33.986369Z",
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
  "command_id": "05b61667-681f-4c55-a0af-170f621398bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:34Z",
    "sequence": 1793174854372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a947b808-a755-45a8-8c1b-83c7dd15e4c5",
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
  "last_heartbeat_at": "2026-10-28T08:07:34.054866Z",
  "last_location_at": "2026-10-28T08:07:34.054866Z",
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
  "session_id": "d9ea4ddb-7059-4aa3-82f5-669acfcf45f1",
  "subject": {
    "type": "STAFF",
    "id": "6e58bf30-74af-49b1-b760-4df8b5cf7cd6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTU4YmYzMC03NGFmLTQ5YjEtYjc2MC00ZGY4YjVjZjdjZDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzU3NTQsImlhdCI6MTc5MzE3NDg1NCwianRpIjoiYWQzOTlhNTctN2MzOC00YWQwLWI1OTctYTE4MDg2MDViZTcxIiwic2lkIjoiZDllYTRkZGItNzA1OS00YWEzLTgyZjUtNjY5YWNmY2Y0NWYxIn0.VDzDco0F2PGlWFnTYkKEnQ7j4T0HBU4mdi6JW_dAlwA",
  "access_expires_at": "2026-10-28T08:22:34.388035878Z",
  "refresh_token": "0tFF1q1fDx5iDBexeovNc4JgXOZnVXTwji3i_GSVOFw",
  "refresh_expires_at": "2026-10-28T20:07:34.387419033Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "da0ccfcc-c503-41c9-9513-10cd888097a5",
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
  "id": "5cf0531b-0cdf-4265-90ac-e6aa702622e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T08:12:34.422387Z",
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
  "command_id": "a5abbcc8-9e96-4f51-b13c-cfc09859ba18",
  "quote_id": "5cf0531b-0cdf-4265-90ac-e6aa702622e1",
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
  "id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
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
  "created_at": "2026-10-28T08:07:34.464002Z",
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
    "id": "00d611a4-bf0b-4e45-9cde-33d41ec825a9",
    "order_id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
    "expires_at": "2026-10-28T08:07:49.467986Z",
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

`POST /api/driver/v1/offers/00d611a4-bf0b-4e45-9cde-33d41ec825a9/accept` → **200**

```json
{
  "command_id": "fcfdd518-da1e-4667-889a-f7ff11d79dc7"
}
```

```json
{
  "id": "aba7e30d-7fe5-4e59-9aa1-7485a890934d",
  "order_id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82",
  "order_id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
  "assignment_id": "aba7e30d-7fe5-4e59-9aa1-7485a890934d",
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

`POST /api/driver/v1/work-sessions/a947b808-a755-45a8-8c1b-83c7dd15e4c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:07:34Z",
    "sequence": 1793174854602
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a947b808-a755-45a8-8c1b-83c7dd15e4c5",
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
  "last_heartbeat_at": "2026-10-28T08:07:34.62106Z",
  "last_location_at": "2026-10-28T08:07:34.62106Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82/arrive` → **200**

```json
{
  "command_id": "52e7d830-a036-4120-a1b5-70082bd9cd1e",
  "expected_version": 0
}
```

```json
{
  "id": "9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82",
  "order_id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
  "assignment_id": "aba7e30d-7fe5-4e59-9aa1-7485a890934d",
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
  "arrived_at": "2026-10-28T08:07:34.658228Z",
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

`POST /api/driver/v1/trips/9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82/start` → **200**

```json
{
  "command_id": "ab9d0ff9-de65-46f0-8e2f-7e1a524e09e4",
  "expected_version": 1
}
```

```json
{
  "id": "9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82",
  "order_id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
  "assignment_id": "aba7e30d-7fe5-4e59-9aa1-7485a890934d",
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
  "arrived_at": "2026-10-28T08:07:34.658228Z",
  "started_at": "2026-10-28T08:07:34.697053Z",
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

`POST /api/driver/v1/trips/9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82/complete` → **200**

```json
{
  "command_id": "838a5652-db22-444a-b772-0c2e7f069840",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:07:34Z",
  "cash_received": true
}
```

```json
{
  "id": "9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82",
  "order_id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
  "assignment_id": "aba7e30d-7fe5-4e59-9aa1-7485a890934d",
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
  "arrived_at": "2026-10-28T08:07:34.658228Z",
  "started_at": "2026-10-28T08:07:34.697053Z",
  "completed_at": "2026-10-28T08:07:34.737715Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/fe0310d2-80b6-4a92-bc31-157d712bd7e8` → **200**

```json
{
  "id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
  "short_number": 18,
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
    "id": "aba7e30d-7fe5-4e59-9aa1-7485a890934d",
    "order_id": "fe0310d2-80b6-4a92-bc31-157d712bd7e8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e3c0621-a7f4-4f9a-91bc-1bcfecc10f82",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:07:34.464002Z",
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
  "session_id": "c5cf3c70-8924-49f7-97a0-375e16a57040",
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
  "last_heartbeat_at": "2026-10-28T08:07:33.986369Z",
  "last_location_at": "2026-10-28T08:07:33.986369Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c5cf3c70-8924-49f7-97a0-375e16a57040/close` → **200**

```json
{
  "command_id": "a463b0ba-78ea-4b97-a4d6-55d99b911635",
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
  "session_id": "a947b808-a755-45a8-8c1b-83c7dd15e4c5",
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
  "last_heartbeat_at": "2026-10-28T08:07:34.62106Z",
  "last_location_at": "2026-10-28T08:07:34.62106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a947b808-a755-45a8-8c1b-83c7dd15e4c5/close` → **200**

```json
{
  "command_id": "d6163225-9a91-4d69-a92e-1f0a7f6ecabe",
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

Done: terminal order fe0310d2-80b6-4a92-bc31-157d712bd7e8 by Andrii (5a000000-0000-4000-8000-000000000403).
