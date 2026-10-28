# Sandbox transcript (2026-10-28T07:40:43Z, f1f079d)

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
  "correlation_id": "97c9eaee-fe64-4109-b680-cd69e5ef952d"
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
  "session_id": "8ebfdc7d-9121-4e25-b943-db119872cd59",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxNDQsImlhdCI6MTc5MzE3MzI0NCwianRpIjoiYTdkNWNjMGEtZTEzOC00ODE5LTg3MDktYzM2MDhjMmJiYzFhIiwic2lkIjoiOGViZmRjN2QtOTEyMS00ZTI1LWI5NDMtZGIxMTk4NzJjZDU5In0.TuQpBjrEGTui5xsSRqtyHNzMB8trX2ukHthyI5ua0qo",
  "access_expires_at": "2026-10-28T07:55:44.508800861Z",
  "refresh_token": "9G6cTlcHlJftHtz1FYOp73FOaVhee24b1ceHOthYCEI",
  "refresh_expires_at": "2026-10-28T19:40:44.506647483Z",
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
  "session_id": "a300eb2b-deb7-4fbf-b898-42b2c48b057e",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxNDUsImlhdCI6MTc5MzE3MzI0NSwianRpIjoiZmI5ZTI2NjQtYmJjNC00Yzc5LWI5NWQtODdhMDUzZTBiNTUxIiwic2lkIjoiYTMwMGViMmItZGViNy00ZmJmLWI4OTgtNDJiMmM0OGIwNTdlIn0.2IVg-FEU5yuJmKt8h9HtRbTuF5-pIwSlCcqdeW3lvsA",
  "access_expires_at": "2026-10-28T07:55:45.810162539Z",
  "refresh_token": "oX-oNE0izUflO7ESCN9qiSbFDijNcn26NjtvxE857TA",
  "refresh_expires_at": "2026-10-28T19:40:45.809070955Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "f2332cc0-62f8-4e04-86fe-37b03f7ed2ae",
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
  "id": "a54cdcd7-b633-43ac-8441-1e92b0444c40",
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
  "created_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "created_at": "2026-10-28T07:40:45.882804Z",
  "updated_at": "2026-10-28T07:40:45.882804Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634545552",
  "device_ref": "sandbox-2416"
}
```

```json
{
  "challenge_id": "d5214895-13dc-4387-ad62-bc538ba614e7",
  "expires_at": "2026-10-28T07:45:45.933110383Z",
  "resend_available_at": "2026-10-28T07:40:46.933110383Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634545552` → **200**

```json
{
  "phone": "+380634545552",
  "audience": "CLIENT",
  "code": "748784",
  "sent_at": "2026-10-28T07:40:45.941824125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5214895-13dc-4387-ad62-bc538ba614e7",
  "code": "748784",
  "device_ref": "sandbox-2416"
}
```

```json
{
  "session_id": "60fb58c1-748e-47c0-bfc9-5ae7d108911a",
  "subject": {
    "type": "CLIENT",
    "id": "13b76f18-866e-4dfc-9fa2-d33916a9ffa0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxM2I3NmYxOC04NjZlLTRkZmMtOWZhMi1kMzM5MTZhOWZmYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTQ2LCJpYXQiOjE3OTMxNzMyNDYsImp0aSI6IjgwOGRjODQ4LWMyM2QtNGQ5Zi1hODU0LTU2OGQ5NDQ3NGIyZSIsInNpZCI6IjYwZmI1OGMxLTc0OGUtNDdjMC1iZmM5LTVhZTdkMTA4OTExYSJ9.LzQ69N27wOlHJR3erzNauo1MHy_Eh61TvxLVUULcXGs",
  "access_expires_at": "2026-10-28T07:55:46.025950941Z",
  "refresh_token": "-2iqVMNdiPK0C0zm5ARXvFJ-EbHF4oDdBo1Pj7KEJCs",
  "refresh_expires_at": "2026-11-27T07:40:46.024460222Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634545552` → **200**

```json
{
  "client_id": "13b76f18-866e-4dfc-9fa2-d33916a9ffa0"
}
```

`POST /api/admin/v1/rider-wallets/13b76f18-866e-4dfc-9fa2-d33916a9ffa0/top-ups` → **201**

```json
{
  "command_id": "944dac8a-f0cf-4907-986b-ac6e918e2bd2",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "13b76f18-866e-4dfc-9fa2-d33916a9ffa0",
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
      "id": "3340f7cc-cf10-43b4-8788-a077af87bdf7",
      "at": "2026-10-28T07:40:46.117694Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f94dc681-b522-466d-a0c2-4deab0a096a9",
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
  "id": "3b0465d3-4d5f-4438-a443-c3fae10e5471",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:45:46.271378Z",
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
      "id": "a54cdcd7-b633-43ac-8441-1e92b0444c40",
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
  "device_ref": "sandbox-32557"
}
```

```json
{
  "challenge_id": "dab4829c-315e-459e-b1d3-e735dd231e40",
  "expires_at": "2026-10-28T07:45:46.336401538Z",
  "resend_available_at": "2026-10-28T07:40:47.336401538Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "135169",
  "sent_at": "2026-10-28T07:40:46.340564796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dab4829c-315e-459e-b1d3-e735dd231e40",
  "code": "135169",
  "device_ref": "sandbox-32557"
}
```

```json
{
  "session_id": "b49e67cf-5685-4bcb-96f9-852795718d8b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE0NiwiaWF0IjoxNzkzMTczMjQ2LCJqdGkiOiI2N2FjOTNkMi1lOGM2LTQ3YjEtYjViYi03ZTM2NTViY2MwZWMiLCJzaWQiOiJiNDllNjdjZi01Njg1LTRiY2ItOTZmOS04NTI3OTU3MThkOGIifQ.XfZHA889AhPUWo22hYT9esba3iXkW9iuZr-sBFBVmwE",
  "access_expires_at": "2026-10-28T07:55:46.400600149Z",
  "refresh_token": "KyD7p-scSu-vYAljPu5ZjhW3BGucHwXIzB22y4IJJLU",
  "refresh_expires_at": "2026-11-27T07:40:46.399147942Z",
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
  "command_id": "2451d706-a0c7-404f-90b5-d41b47436698",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:40:46Z",
    "sequence": 1793173246468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "327e552a-0827-4833-8597-952a70fb0740",
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
  "last_heartbeat_at": "2026-10-28T07:40:46.515832Z",
  "last_location_at": "2026-10-28T07:40:46.515832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4b9414b5-4f1d-402b-a13c-9b4111b42d4f",
  "quote_id": "3b0465d3-4d5f-4438-a443-c3fae10e5471",
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
  "id": "73885b5a-10b4-4dea-af08-8f87650633dc",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13b76f18-866e-4dfc-9fa2-d33916a9ffa0",
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
  "created_at": "2026-10-28T07:40:46.623629Z",
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
  "client_id": "13b76f18-866e-4dfc-9fa2-d33916a9ffa0",
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
      "id": "3340f7cc-cf10-43b4-8788-a077af87bdf7",
      "at": "2026-10-28T07:40:46.117694Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
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
    "id": "30cae015-cda9-4d82-a8b4-910dacb1a858",
    "order_id": "73885b5a-10b4-4dea-af08-8f87650633dc",
    "expires_at": "2026-10-28T07:41:01.637979Z",
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

`POST /api/driver/v1/offers/30cae015-cda9-4d82-a8b4-910dacb1a858/accept` → **200**

```json
{
  "command_id": "011d48d9-c97b-450e-9163-7556146d6dfb"
}
```

```json
{
  "id": "8e7421ae-5771-4a59-8ef4-407fc9f928f7",
  "order_id": "73885b5a-10b4-4dea-af08-8f87650633dc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f25ddb2-2b3c-4d61-aff7-25a719668f8f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6f25ddb2-2b3c-4d61-aff7-25a719668f8f",
  "order_id": "73885b5a-10b4-4dea-af08-8f87650633dc",
  "assignment_id": "8e7421ae-5771-4a59-8ef4-407fc9f928f7",
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

`POST /api/driver/v1/work-sessions/327e552a-0827-4833-8597-952a70fb0740/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:40:46Z",
    "sequence": 1793173246836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "327e552a-0827-4833-8597-952a70fb0740",
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
  "last_heartbeat_at": "2026-10-28T07:40:46.8638Z",
  "last_location_at": "2026-10-28T07:40:46.8638Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6f25ddb2-2b3c-4d61-aff7-25a719668f8f/arrive` → **200**

```json
{
  "command_id": "70d73170-aece-42ff-b26c-125838acd210",
  "expected_version": 0
}
```

```json
{
  "id": "6f25ddb2-2b3c-4d61-aff7-25a719668f8f",
  "order_id": "73885b5a-10b4-4dea-af08-8f87650633dc",
  "assignment_id": "8e7421ae-5771-4a59-8ef4-407fc9f928f7",
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
  "arrived_at": "2026-10-28T07:40:46.92413Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6f25ddb2-2b3c-4d61-aff7-25a719668f8f/start` → **200**

```json
{
  "command_id": "fea9de96-ea02-4d91-9191-ac993e98cc5c",
  "expected_version": 1
}
```

```json
{
  "id": "6f25ddb2-2b3c-4d61-aff7-25a719668f8f",
  "order_id": "73885b5a-10b4-4dea-af08-8f87650633dc",
  "assignment_id": "8e7421ae-5771-4a59-8ef4-407fc9f928f7",
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
  "arrived_at": "2026-10-28T07:40:46.92413Z",
  "started_at": "2026-10-28T07:40:46.969877Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/6f25ddb2-2b3c-4d61-aff7-25a719668f8f/complete` → **200**

```json
{
  "command_id": "ec2322ea-1a24-4067-ae64-e1370c79bec2",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:40:47Z",
  "cash_received": true
}
```

```json
{
  "id": "6f25ddb2-2b3c-4d61-aff7-25a719668f8f",
  "order_id": "73885b5a-10b4-4dea-af08-8f87650633dc",
  "assignment_id": "8e7421ae-5771-4a59-8ef4-407fc9f928f7",
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
  "arrived_at": "2026-10-28T07:40:46.92413Z",
  "started_at": "2026-10-28T07:40:46.969877Z",
  "completed_at": "2026-10-28T07:40:47.039503Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "13b76f18-866e-4dfc-9fa2-d33916a9ffa0",
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
      "id": "d0f70289-f27a-4d88-bacc-9f69dbceef1c",
      "at": "2026-10-28T07:40:47.759661Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "73885b5a-10b4-4dea-af08-8f87650633dc"
    },
    {
      "id": "3340f7cc-cf10-43b4-8788-a077af87bdf7",
      "at": "2026-10-28T07:40:46.117694Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/a54cdcd7-b633-43ac-8441-1e92b0444c40/archive` → **200**

```json
{
  "command_id": "d7e90f14-e24d-43d4-a71c-23a569ef53e9",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "a54cdcd7-b633-43ac-8441-1e92b0444c40",
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
  "created_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "created_at": "2026-10-28T07:40:45.882804Z",
  "updated_at": "2026-10-28T07:40:50.134299Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "327e552a-0827-4833-8597-952a70fb0740",
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
  "last_heartbeat_at": "2026-10-28T07:40:46.8638Z",
  "last_location_at": "2026-10-28T07:40:46.8638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/327e552a-0827-4833-8597-952a70fb0740/close` → **200**

```json
{
  "command_id": "6ae29787-1c22-4ae9-be20-399c0163c7db",
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

Done: order 73885b5a-10b4-4dea-af08-8f87650633dc.

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
  "session_id": "7b2c5dda-07ba-4c6c-a1b1-e6266821e1b1",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxNTAsImlhdCI6MTc5MzE3MzI1MCwianRpIjoiZWExMDE2ZTItYjdhZC00MjgyLTg2OWUtMjU3MjI3M2Y5NTE4Iiwic2lkIjoiN2IyYzVkZGEtMDdiYS00YzZjLWExYjEtZTYyNjY4MjFlMWIxIn0.yQoeUHf6nfevMBfrxAOgsDYdCZPQPANkUx5lQX_aCT8",
  "access_expires_at": "2026-10-28T07:55:50.554434528Z",
  "refresh_token": "M1VWt5__UInXx9inDyL2zE5CuTQr56OWjE6jNPMNE1U",
  "refresh_expires_at": "2026-10-28T19:40:50.55353703Z",
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
  "command_id": "1700022e-411a-4124-94dd-9f9ceaa38552",
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
  "session_id": "2daf10db-1615-46f9-9830-2d34be871d59",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxNTAsImlhdCI6MTc5MzE3MzI1MCwianRpIjoiYzVhMjA3YjQtZmQ3Mi00ZDhkLWI5MWEtY2FjN2FkMDQ0NTIzIiwic2lkIjoiMmRhZjEwZGItMTYxNS00NmY5LTk4MzAtMmQzNGJlODcxZDU5In0.rtiAT0dA5zr7jmbhYkXc8Qh1-v4aXwShlfgodPjuIKI",
  "access_expires_at": "2026-10-28T07:55:50.958420654Z",
  "refresh_token": "CabajzoECy3SRoHC01Vy7cNMKybXTYAv8HPsvwhcN0M",
  "refresh_expires_at": "2026-10-28T19:40:50.957365801Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.223176847",
    "linkedid": "1730052700.223176847",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676950539"
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
    "id": "1730052700.223176847",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "7af51600-f58e-4d29-b001-c5f9c3f89bf0",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676950539",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:40:50.988688Z",
      "answered_at": null,
      "ended_at": "2026-10-28T07:40:51.014106Z",
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
    "id": "1730052600.673923643",
    "linkedid": "1730052600.673923643",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676950539"
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
      "id": "3cfd652f-de08-44f2-a40a-0cda6a893fa9",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676950539",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:40:51.084524Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/3cfd652f-de08-44f2-a40a-0cda6a893fa9/answer` → **200**

```json
{
  "command_id": "3d5a23c1-9630-4804-9cc5-ef29cdc3cfa5"
}
```

```json
{
  "id": "3cfd652f-de08-44f2-a40a-0cda6a893fa9",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676950539",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "order_ids": [],
  "started_at": "2026-10-28T07:40:51.084524Z",
  "answered_at": "2026-10-28T07:40:51.14862Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.673923643",
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
    "id": "1730052600.673923643",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3cfd652f-de08-44f2-a40a-0cda6a893fa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676950539",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [],
      "started_at": "2026-10-28T07:40:51.084524Z",
      "answered_at": "2026-10-28T07:40:51.14862Z",
      "ended_at": "2026-10-28T07:40:51.201943Z",
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
      "id": "3cfd652f-de08-44f2-a40a-0cda6a893fa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676950539",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [],
      "started_at": "2026-10-28T07:40:51.084524Z",
      "answered_at": "2026-10-28T07:40:51.14862Z",
      "ended_at": "2026-10-28T07:40:51.201943Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:40:52.475037Z"
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
      "id": "3cfd652f-de08-44f2-a40a-0cda6a893fa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676950539",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [],
      "started_at": "2026-10-28T07:40:51.084524Z",
      "answered_at": "2026-10-28T07:40:51.14862Z",
      "ended_at": "2026-10-28T07:40:51.201943Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:40:52.475037Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/3cfd652f-de08-44f2-a40a-0cda6a893fa9/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/3cfd652f-de08-44f2-a40a-0cda6a893fa9/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=3cfd652f-de08-44f2-a40a-0cda6a893fa9` → **200**

```json
{
  "changes": [
    {
      "id": "f02acb65-cca5-40f0-861c-e914dd61a901",
      "occurred_at": "2026-10-28T07:40:53.358705Z",
      "actor_type": "STAFF",
      "actor_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "3cfd652f-de08-44f2-a40a-0cda6a893fa9",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"dd07f843-7b67-41e3-a024-34f41f6fffba\", \"order_ids\": []}",
      "correlation_id": "d951a4b3-3d28-4d66-a21a-17f834a282c5"
    },
    {
      "id": "2d93a17f-07b2-4289-886f-fd97db45e640",
      "occurred_at": "2026-10-28T07:40:53.325493Z",
      "actor_type": "STAFF",
      "actor_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "3cfd652f-de08-44f2-a40a-0cda6a893fa9",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"dd07f843-7b67-41e3-a024-34f41f6fffba\", \"order_ids\": []}",
      "correlation_id": "15c12886-542a-453b-be04-c13ca249908e"
    }
  ]
}
```

Done: call 3cfd652f-de08-44f2-a40a-0cda6a893fa9 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636735689",
  "device_ref": "sandbox-12139"
}
```

```json
{
  "challenge_id": "e9bd1cb6-d273-48ba-b14b-0f9068974e65",
  "expires_at": "2026-10-28T07:45:53.435561593Z",
  "resend_available_at": "2026-10-28T07:40:54.435561593Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636735689` → **200**

```json
{
  "phone": "+380636735689",
  "audience": "CLIENT",
  "code": "171029",
  "sent_at": "2026-10-28T07:40:53.439172196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9bd1cb6-d273-48ba-b14b-0f9068974e65",
  "code": "171029",
  "device_ref": "sandbox-12139"
}
```

```json
{
  "session_id": "17ba91f4-1f67-4a32-ab9e-ab603048fc90",
  "subject": {
    "type": "CLIENT",
    "id": "0f5c3711-b51e-4746-b67f-f784c6f54484"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZjVjMzcxMS1iNTFlLTQ3NDYtYjY3Zi1mNzg0YzZmNTQ0ODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTUzLCJpYXQiOjE3OTMxNzMyNTMsImp0aSI6ImFlN2RkMjg3LTQ3YmItNDE4MC1hMWRhLTE5Y2E2ZjYxYzc3OCIsInNpZCI6IjE3YmE5MWY0LTFmNjctNGEzMi1hYjllLWFiNjAzMDQ4ZmM5MCJ9.ojWjR1QopdrkJU6PiYojTyCYVs1ckqgqtrrXrM8-qn4",
  "access_expires_at": "2026-10-28T07:55:53.496722711Z",
  "refresh_token": "3my_CaSRug49Lzvk8No0yodKBwvRuFu0nx8VCBLkMVE",
  "refresh_expires_at": "2026-11-27T07:40:53.495926031Z",
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
  "device_ref": "sandbox-16101"
}
```

```json
{
  "challenge_id": "b2318e1a-00e3-441e-b23b-7aeffe5f3b2b",
  "expires_at": "2026-10-28T07:45:53.552717467Z",
  "resend_available_at": "2026-10-28T07:40:54.552717467Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "066245",
  "sent_at": "2026-10-28T07:40:53.556240475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2318e1a-00e3-441e-b23b-7aeffe5f3b2b",
  "code": "066245",
  "device_ref": "sandbox-16101"
}
```

```json
{
  "session_id": "97790279-7c3f-42ae-a0f7-f946b8c7df75",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE1MywiaWF0IjoxNzkzMTczMjUzLCJqdGkiOiJlYjI1YTVkZC0yMThkLTRhYWUtOWZiZS1iMDQ1NjUxOTdiMjciLCJzaWQiOiI5Nzc5MDI3OS03YzNmLTQyYWUtYTBmNy1mOTQ2YjhjN2RmNzUifQ.uD3fMj9e3cnsc0SyIkj6CQ54buPj-RxZHXooJbFGptM",
  "access_expires_at": "2026-10-28T07:55:53.613626588Z",
  "refresh_token": "u1YZkNSwwIN0Ba4_Cfl9-yhLyMh2RbgxfPhpUm70MmE",
  "refresh_expires_at": "2026-11-27T07:40:53.612820571Z",
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
  "session_id": "3d604d8e-285a-4a25-a802-fa1926477f90",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxNTMsImlhdCI6MTc5MzE3MzI1MywianRpIjoiNjBhYzNmMDktNjk4Zi00M2E4LThmYjAtODNiNjI1Yjk2NDNiIiwic2lkIjoiM2Q2MDRkOGUtMjg1YS00YTI1LWE4MDItZmExOTI2NDc3ZjkwIn0.vPVVDSNOsK7okhnt2i0RptjGpA6biLD39FLkLDkTtGc",
  "access_expires_at": "2026-10-28T07:55:53.962175946Z",
  "refresh_token": "gkl-not9pJ8UAT_8ijLRqzItvisGSaOf3ymKfFjNkWY",
  "refresh_expires_at": "2026-10-28T19:40:53.961377312Z",
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
  "session_id": "56c0b32a-42f4-4d16-9098-2e996c5eca6b",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxNTQsImlhdCI6MTc5MzE3MzI1NCwianRpIjoiMTQ2NDA5NzAtNjQyYy00ZjZkLWExMGEtN2FlNzBmYzczOGRiIiwic2lkIjoiNTZjMGIzMmEtNDJmNC00ZDE2LTkwOTgtMmU5OTZjNWVjYTZiIn0.vqEj8WvAWApBSJ0UXA_VZ5jmK7Ons8zk0C7yYDtmInA",
  "access_expires_at": "2026-10-28T07:55:54.28520044Z",
  "refresh_token": "03B6AaMTbApIVxZ454_vng9hpc22vvhSJiuVDBMXmTE",
  "refresh_expires_at": "2026-10-28T19:40:54.284495802Z",
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
  "command_id": "cc41b61d-22eb-4e30-b24a-eeef53afabee",
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
  "id": "96ab34c2-6774-44af-8f6a-0bf7cb0a5e02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:45:54.350089Z",
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
  "command_id": "76db54e2-3f6c-4399-a622-863f036356c5",
  "quote_id": "96ab34c2-6774-44af-8f6a-0bf7cb0a5e02",
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
  "id": "68a483d3-4843-498b-8ea2-0e7d35bb1b78",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5c3711-b51e-4746-b67f-f784c6f54484",
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
  "created_at": "2026-10-28T07:40:54.395669Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/68a483d3-4843-498b-8ea2-0e7d35bb1b78` → **200**

```json
{
  "id": "68a483d3-4843-498b-8ea2-0e7d35bb1b78",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5c3711-b51e-4746-b67f-f784c6f54484",
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
  "created_at": "2026-10-28T07:40:54.395669Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/68a483d3-4843-498b-8ea2-0e7d35bb1b78/cancel` → **200**

```json
{
  "command_id": "984a0580-2649-4e82-8bfb-1e09b23c4524",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "68a483d3-4843-498b-8ea2-0e7d35bb1b78",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0f5c3711-b51e-4746-b67f-f784c6f54484",
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
  "created_at": "2026-10-28T07:40:54.395669Z",
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
  "command_id": "bfa20653-d632-4398-a587-80fcabf4381d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:40:54Z",
    "sequence": 1793173254539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:40:54.560022Z",
  "last_location_at": "2026-10-28T07:40:54.560022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28084"
}
```

```json
{
  "challenge_id": "5c9d534e-48d3-4831-84ae-a27d247e8527",
  "expires_at": "2026-10-28T07:45:54.591545447Z",
  "resend_available_at": "2026-10-28T07:40:55.591545447Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "723966",
  "sent_at": "2026-10-28T07:40:54.595997021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c9d534e-48d3-4831-84ae-a27d247e8527",
  "code": "723966",
  "device_ref": "sandbox-28084"
}
```

```json
{
  "session_id": "39c2852d-9876-40d4-a38b-308a78b6ed1e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE1NCwiaWF0IjoxNzkzMTczMjU0LCJqdGkiOiI3N2ExMGNiNC1lZTI1LTRiNDQtOTNiNS03ZDUzM2JmNTBkMjIiLCJzaWQiOiIzOWMyODUyZC05ODc2LTQwZDQtYTM4Yi0zMDhhNzhiNmVkMWUifQ.1uQyUzEwIpTPl4r82NQs73F-LVI3gZ7uTmAv2UEew4M",
  "access_expires_at": "2026-10-28T07:55:54.658116322Z",
  "refresh_token": "Ge_UmVtOSDunM2-RDg1cBEWVkeoLLP5dJKMc7pjJCiU",
  "refresh_expires_at": "2026-11-27T07:40:54.657370056Z",
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
  "command_id": "eb90949f-809f-4add-8696-ba69bac9ae85",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:40:54Z",
    "sequence": 1793173254713
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2de6e4fa-995f-43d9-a8f2-ff60aaaefc83",
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
  "last_heartbeat_at": "2026-10-28T07:40:54.734844Z",
  "last_location_at": "2026-10-28T07:40:54.734844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a9efbd75-dbec-47ee-ba46-000f60778ad9",
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
  "id": "86b7e435-fe38-4d35-a041-bafeb5a09388",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:45:54.778705Z",
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
  "command_id": "0d78fa70-3580-4030-8831-cdee346afe75",
  "quote_id": "86b7e435-fe38-4d35-a041-bafeb5a09388",
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
  "id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0f5c3711-b51e-4746-b67f-f784c6f54484",
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
  "created_at": "2026-10-28T07:40:54.830238Z",
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
    "id": "417e5d48-de54-4ce1-aecb-103ee280d89e",
    "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
    "expires_at": "2026-10-28T07:41:09.836424Z",
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

`POST /api/driver/v1/offers/417e5d48-de54-4ce1-aecb-103ee280d89e/accept` → **200**

```json
{
  "command_id": "b46526c1-2732-4a9d-a989-f84f48b65cb1"
}
```

```json
{
  "id": "80ce1f35-3de3-4276-9ab4-eed919dd7396",
  "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e57449dd-a1c5-40a1-b6a8-9dab1f5cd8b7",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e57449dd-a1c5-40a1-b6a8-9dab1f5cd8b7",
  "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
  "assignment_id": "80ce1f35-3de3-4276-9ab4-eed919dd7396",
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

`POST /api/driver/v1/trips/e57449dd-a1c5-40a1-b6a8-9dab1f5cd8b7/cancel` → **200**

```json
{
  "command_id": "04eeb8bd-30d2-49e8-a830-28d6f3e0dff7",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "e57449dd-a1c5-40a1-b6a8-9dab1f5cd8b7",
  "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
  "assignment_id": "80ce1f35-3de3-4276-9ab4-eed919dd7396",
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

`GET /api/rider/v1/orders/7b07a1d7-4850-4e06-8470-47ba6a661c52` → **200**

```json
{
  "id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0f5c3711-b51e-4746-b67f-f784c6f54484",
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
    "id": "80ce1f35-3de3-4276-9ab4-eed919dd7396",
    "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e57449dd-a1c5-40a1-b6a8-9dab1f5cd8b7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:40:54.830238Z",
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
    "id": "5f75c982-e77b-4cf3-8b49-8f99fac4bb1b",
    "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
    "expires_at": "2026-10-28T07:41:09.991846Z",
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

`POST /api/driver/v1/offers/5f75c982-e77b-4cf3-8b49-8f99fac4bb1b/accept` → **200**

```json
{
  "command_id": "29ebfba5-6586-4bed-8338-36ff1a41b5d3"
}
```

```json
{
  "id": "19b7bbfe-75f7-410d-b7b2-29553a98943d",
  "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "99ceac7d-96b8-4460-8efe-8127c00f244a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "99ceac7d-96b8-4460-8efe-8127c00f244a",
  "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
  "assignment_id": "19b7bbfe-75f7-410d-b7b2-29553a98943d",
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

`POST /api/driver/v1/trips/99ceac7d-96b8-4460-8efe-8127c00f244a/cancel` → **200**

```json
{
  "command_id": "109cf109-3106-45e0-bd56-192ac5dbc89f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "99ceac7d-96b8-4460-8efe-8127c00f244a",
  "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
  "assignment_id": "19b7bbfe-75f7-410d-b7b2-29553a98943d",
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
    "id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:40:54.830238Z",
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
    "id": "68a483d3-4843-498b-8ea2-0e7d35bb1b78",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:40:54.395669Z",
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

`GET /api/operator/v1/orders/7b07a1d7-4850-4e06-8470-47ba6a661c52/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:40:54.831436Z",
      "actor": {
        "type": "CLIENT",
        "id": "0f5c3711-b51e-4746-b67f-f784c6f54484",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
        "quote_id": "86b7e435-fe38-4d35-a041-bafeb5a09388",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:40:54.835028Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
        "attempt_id": "c9453ad5-88a0-4287-88ec-2ceb7aff3971",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:40:54.844897Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "417e5d48-de54-4ce1-aecb-103ee280d89e",
        "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:40:54.914715Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "417e5d48-de54-4ce1-aecb-103ee280d89e",
        "order_id": "7b07a1d7-4850-4e06-8470-47ba6a661c52",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "80ce1f35-3de3-4276-9ab4-eed919dd7396"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 68a483d3-4843-498b-8ea2-0e7d35bb1b78, 7b07a1d7-4850-4e06-8470-47ba6a661c52.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738469717",
  "device_ref": "sandbox-30160"
}
```

```json
{
  "challenge_id": "eaa8eccc-1896-4f71-8902-f8bc646e5424",
  "expires_at": "2026-10-28T07:45:55.253718001Z",
  "resend_available_at": "2026-10-28T07:40:56.253718001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738469717` → **200**

```json
{
  "phone": "+380738469717",
  "audience": "CLIENT",
  "code": "070467",
  "sent_at": "2026-10-28T07:40:55.256844796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eaa8eccc-1896-4f71-8902-f8bc646e5424",
  "code": "070467",
  "device_ref": "sandbox-30160"
}
```

```json
{
  "session_id": "2c3f6974-4ef1-4241-bc61-ed1874a7822c",
  "subject": {
    "type": "CLIENT",
    "id": "7e9b2062-f499-4821-90ab-94d8e9c39909"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTliMjA2Mi1mNDk5LTQ4MjEtOTBhYi05NGQ4ZTljMzk5MDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTU1LCJpYXQiOjE3OTMxNzMyNTUsImp0aSI6ImI3NTAwMGNjLTlhYjEtNGQ3YS1hZDU5LTFhOGJiMDY3NTA0YSIsInNpZCI6IjJjM2Y2OTc0LTRlZjEtNDI0MS1iYzYxLWVkMTg3NGE3ODIyYyJ9.vTz04GWwAYBflIJVmh6i7EBEYamH3B-wlXapCvNqxrI",
  "access_expires_at": "2026-10-28T07:55:55.313448825Z",
  "refresh_token": "GT4GaZsc_K_-ld8QAKqximhYqn0z7mnLqHU1hbIn86I",
  "refresh_expires_at": "2026-11-27T07:40:55.312700025Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "2b43d7cf-82d4-479f-8310-8de349ec2f93",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "49b476b2-0a90-403f-a7f9-36f565be5c8f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-49b476b2-0a90-403f-a7f9-36f565be5c8f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "775206028bd405a5f50e20d4c312db5e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=49b476b2-0a90-403f-a7f9-36f565be5c8f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738469717"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=49b476b2-0a90-403f-a7f9-36f565be5c8f",
  "expires_at": "2026-10-28T08:10:55.34939Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/49b476b2-0a90-403f-a7f9-36f565be5c8f` → **200**

```json
{
  "id": "49b476b2-0a90-403f-a7f9-36f565be5c8f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:10:55.34939Z",
  "card": {
    "id": "5eefcfee-0491-4b22-9895-ac43b97653bd",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2129",
    "card_type": "Visa",
    "created_at": "2026-10-28T07:40:55.400994Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "5eefcfee-0491-4b22-9895-ac43b97653bd",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2129",
      "card_type": "Visa",
      "created_at": "2026-10-28T07:40:55.400994Z"
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
  "device_ref": "sandbox-27251"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "7a744547-27c2-42d7-86d2-d2cfa1d6c5ab",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27251"
}
```

```json
{
  "challenge_id": "6044e477-f955-47ba-8289-09398ae669ea",
  "expires_at": "2026-10-28T07:45:56.521211415Z",
  "resend_available_at": "2026-10-28T07:40:57.521211415Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "163063",
  "sent_at": "2026-10-28T07:40:56.524101049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6044e477-f955-47ba-8289-09398ae669ea",
  "code": "163063",
  "device_ref": "sandbox-27251"
}
```

```json
{
  "session_id": "a89c272d-bebb-485f-be47-dc8b7993273b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE1NiwiaWF0IjoxNzkzMTczMjU2LCJqdGkiOiJkMGU2ZWE5OC1mZjAyLTQ4MWEtYmNhZi1jNzA0Njg5NmM3MDAiLCJzaWQiOiJhODljMjcyZC1iZWJiLTQ4NWYtYmU0Ny1kYzhiNzk5MzI3M2IifQ.f1EI6zmk3gmNk5UwKr4f8mWla_qjPHTvqMBUM0ryjqU",
  "access_expires_at": "2026-10-28T07:55:56.580423422Z",
  "refresh_token": "bkSnaV6WLbhyumYdZRfXLOZ6RQd3Uap7VKLufCXyI9g",
  "refresh_expires_at": "2026-11-27T07:40:56.579467083Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2de6e4fa-995f-43d9-a8f2-ff60aaaefc83",
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
  "last_heartbeat_at": "2026-10-28T07:40:54.734844Z",
  "last_location_at": "2026-10-28T07:40:54.734844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2de6e4fa-995f-43d9-a8f2-ff60aaaefc83/handover` → **200**

```json
{
  "command_id": "060584e6-c92c-4dc4-8c76-e0ccf4d39b47",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2de6e4fa-995f-43d9-a8f2-ff60aaaefc83",
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
  "last_heartbeat_at": "2026-10-28T07:40:54.734844Z",
  "last_location_at": "2026-10-28T07:40:54.734844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2de6e4fa-995f-43d9-a8f2-ff60aaaefc83/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:40:56Z",
    "sequence": 1793173256674
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2de6e4fa-995f-43d9-a8f2-ff60aaaefc83",
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
  "last_heartbeat_at": "2026-10-28T07:40:56.695312Z",
  "last_location_at": "2026-10-28T07:40:56.695312Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "301884d4-bc8f-4b09-883a-af607096f4ec",
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
  "id": "22117a31-8989-4395-a8d1-84c7ca973516",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T07:45:56.736123Z",
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
  "command_id": "d874b59f-6c2a-4024-b3be-4d47793bdd7e",
  "quote_id": "22117a31-8989-4395-a8d1-84c7ca973516",
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
  "id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7e9b2062-f499-4821-90ab-94d8e9c39909",
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
  "created_at": "2026-10-28T07:40:56.777528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34` → **200**

```json
{
  "id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7e9b2062-f499-4821-90ab-94d8e9c39909",
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
  "created_at": "2026-10-28T07:40:56.777528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34` → **200**

```json
{
  "id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7e9b2062-f499-4821-90ab-94d8e9c39909",
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
  "created_at": "2026-10-28T07:40:56.777528Z",
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
    "id": "3cd0f893-72a5-4156-80f1-c0e95a149d4c",
    "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
    "expires_at": "2026-10-28T07:41:11.876767Z",
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

`POST /api/driver/v1/offers/3cd0f893-72a5-4156-80f1-c0e95a149d4c/accept` → **200**

```json
{
  "command_id": "b60b2fe0-ec33-45af-bce7-c7edca985f3c"
}
```

```json
{
  "id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "assignment_id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
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

`POST /api/driver/v1/work-sessions/2de6e4fa-995f-43d9-a8f2-ff60aaaefc83/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:40:57Z",
    "sequence": 1793173257965
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2de6e4fa-995f-43d9-a8f2-ff60aaaefc83",
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
  "last_heartbeat_at": "2026-10-28T07:40:57.986061Z",
  "last_location_at": "2026-10-28T07:40:57.986061Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab/arrive` → **200**

```json
{
  "command_id": "0d8c9a2c-d96b-4be6-9ade-0c40e7b009fb",
  "expected_version": 0
}
```

```json
{
  "id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "assignment_id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
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
  "arrived_at": "2026-10-28T07:40:58.026697Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab/start` → **200**

```json
{
  "command_id": "1fed95cb-691d-4b37-9a99-8d63bf1b7070",
  "expected_version": 1
}
```

```json
{
  "id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "assignment_id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
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
  "arrived_at": "2026-10-28T07:40:58.026697Z",
  "started_at": "2026-10-28T07:40:58.072777Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab/complete` → **200**

```json
{
  "command_id": "d203c0b0-a4d0-472f-94c8-a05b0026694c",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:40:58Z"
}
```

```json
{
  "id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "assignment_id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
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
  "arrived_at": "2026-10-28T07:40:58.026697Z",
  "started_at": "2026-10-28T07:40:58.072777Z",
  "completed_at": "2026-10-28T07:40:58.122437Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34` → **200**

```json
{
  "id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7e9b2062-f499-4821-90ab-94d8e9c39909",
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
    "id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
    "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:40:56.777528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34` → **200**

```json
{
  "id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7e9b2062-f499-4821-90ab-94d8e9c39909",
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
    "id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
    "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:40:56.777528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34` → **200**

```json
{
  "id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7e9b2062-f499-4821-90ab-94d8e9c39909",
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
    "id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
    "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:40:56.777528Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34` → **200**

```json
{
  "id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7e9b2062-f499-4821-90ab-94d8e9c39909",
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
    "id": "0c2b2045-cf40-451d-b94e-8457ec78b9d1",
    "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9d988f6d-a9c0-4667-8b62-5cdeeba5a9ab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:40:56.777528Z",
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
      "id": "37de07be-6308-486c-81c1-cd938741ee5c",
      "at": "2026-10-28T07:40:58.910932Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34/tip` → **200**

```json
{
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
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
  "available_until": "2026-10-29T07:40:58.122437Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34/tip` → **201**

```json
{
  "command_id": "f48fa233-62f9-4346-8731-d3a17aa19f62",
  "amount_minor": 2500
}
```

```json
{
  "id": "69197fce-0cfe-4101-bf52-df506537e521",
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T07:41:01.379565Z"
}
```

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34/tip` → **200**

```json
{
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
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
  "available_until": "2026-10-29T07:40:58.122437Z",
  "open": false,
  "tip": {
    "id": "69197fce-0cfe-4101-bf52-df506537e521",
    "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T07:41:01.379565Z"
  }
}
```

`GET /api/rider/v1/orders/4041dc89-3df8-4671-8cbb-ab1d974d7b34/tip` → **200**

```json
{
  "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
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
  "available_until": "2026-10-29T07:40:58.122437Z",
  "open": false,
  "tip": {
    "id": "69197fce-0cfe-4101-bf52-df506537e521",
    "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T07:41:01.379565Z"
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
      "id": "37de07be-6308-486c-81c1-cd938741ee5c",
      "at": "2026-10-28T07:40:58.910932Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
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
      "id": "f07c5e29-b560-47c1-b0ab-4177204b8ba3",
      "at": "2026-10-28T07:41:02.986289Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
      "counterpart_id": null
    },
    {
      "id": "37de07be-6308-486c-81c1-cd938741ee5c",
      "at": "2026-10-28T07:40:58.910932Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4041dc89-3df8-4671-8cbb-ab1d974d7b34",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2de6e4fa-995f-43d9-a8f2-ff60aaaefc83",
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
  "last_heartbeat_at": "2026-10-28T07:40:57.986061Z",
  "last_location_at": "2026-10-28T07:40:57.986061Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2de6e4fa-995f-43d9-a8f2-ff60aaaefc83/close` → **200**

```json
{
  "command_id": "4344346c-ee58-4be8-9e8f-2fea231c6761",
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

Done: card order 4041dc89-3df8-4671-8cbb-ab1d974d7b34.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730716170",
  "device_ref": "sandbox-29808"
}
```

```json
{
  "challenge_id": "71838b91-810c-42ec-9bd0-81ab2f30cdb3",
  "expires_at": "2026-10-28T07:46:03.603824479Z",
  "resend_available_at": "2026-10-28T07:41:04.603824479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730716170` → **200**

```json
{
  "phone": "+380730716170",
  "audience": "CLIENT",
  "code": "210725",
  "sent_at": "2026-10-28T07:41:03.606905194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71838b91-810c-42ec-9bd0-81ab2f30cdb3",
  "code": "210725",
  "device_ref": "sandbox-29808"
}
```

```json
{
  "session_id": "172cde71-2925-404c-b4fc-39c7aa3aaa9e",
  "subject": {
    "type": "CLIENT",
    "id": "a46b7e4f-a334-4db6-b08c-9ceb7c385a43"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDZiN2U0Zi1hMzM0LTRkYjYtYjA4Yy05Y2ViN2MzODVhNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTYzLCJpYXQiOjE3OTMxNzMyNjMsImp0aSI6IjNiNzg5ZTIzLWE5NTYtNDgzYS05ODE1LTdmZDMwOWYwYjA0OSIsInNpZCI6IjE3MmNkZTcxLTI5MjUtNDA0Yy1iNGZjLTM5YzdhYTNhYWE5ZSJ9.IlaGokhWt9BI-mUTGXRKyLf_O4AqEuuycxH0V4wutwc",
  "access_expires_at": "2026-10-28T07:56:03.663936599Z",
  "refresh_token": "e976gwFOuIIN06chP2N8wMgth2Vjzl858QtrnAoVac0",
  "refresh_expires_at": "2026-11-27T07:41:03.663251658Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "13c24cac-6d5a-4608-8a45-60d267937dd9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "133943c0-52ab-46b0-8360-bdf69378daab",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-133943c0-52ab-46b0-8360-bdf69378daab",
    "orderDate": "1793173263",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "c65516956e13b1cd77b3ec88ed30c901",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=133943c0-52ab-46b0-8360-bdf69378daab",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730716170"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=133943c0-52ab-46b0-8360-bdf69378daab",
  "created_at": "2026-10-28T07:41:03.70176Z",
  "expires_at": "2026-10-28T08:11:03.70176Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/133943c0-52ab-46b0-8360-bdf69378daab` → **200**

```json
{
  "id": "133943c0-52ab-46b0-8360-bdf69378daab",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:41:03.70176Z",
  "expires_at": "2026-10-28T08:11:03.70176Z",
  "completed_at": "2026-10-28T07:41:03.742848Z",
  "masked_pan": "41****6089",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a46b7e4f-a334-4db6-b08c-9ceb7c385a43",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a46b7e4f-a334-4db6-b08c-9ceb7c385a43",
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
      "id": "d7cc62b7-29be-4dfb-ac34-01929855d3ad",
      "at": "2026-10-28T07:41:03.997842Z",
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
  "client_id": "a46b7e4f-a334-4db6-b08c-9ceb7c385a43",
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
      "id": "d7cc62b7-29be-4dfb-ac34-01929855d3ad",
      "at": "2026-10-28T07:41:03.997842Z",
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
  "device_ref": "sandbox-19135"
}
```

```json
{
  "challenge_id": "d13a027f-0f11-48c6-ac7b-218c0601e0f2",
  "expires_at": "2026-10-28T07:46:04.875735982Z",
  "resend_available_at": "2026-10-28T07:41:05.875735982Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "144279",
  "sent_at": "2026-10-28T07:41:04.878829576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d13a027f-0f11-48c6-ac7b-218c0601e0f2",
  "code": "144279",
  "device_ref": "sandbox-19135"
}
```

```json
{
  "session_id": "b117d028-33c2-4ed1-9d1f-51e70f1865eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE2NCwiaWF0IjoxNzkzMTczMjY0LCJqdGkiOiI0ODAyYzAwMC1hY2NkLTRmZjYtODhmYi03YTBlZTdlZDNiNjYiLCJzaWQiOiJiMTE3ZDAyOC0zM2MyLTRlZDEtOWQxZi01MWU3MGYxODY1ZWIifQ.wb-QwJJNaW6o31GvhzwAWt8KJ_MbFOR6WyDD39Dm1f8",
  "access_expires_at": "2026-10-28T07:56:04.935679767Z",
  "refresh_token": "Uuoeu0udcIpCtQQO2ro3lqL1Mxp7-LC123Lbr4DO_XU",
  "refresh_expires_at": "2026-11-27T07:41:04.934927319Z",
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
  "command_id": "564395c8-b75d-44aa-82df-5d1323bd09e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "4a286f21-2542-41e7-b795-0b5265254a63",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4a286f21-2542-41e7-b795-0b5265254a63",
    "orderDate": "1793173264",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "9396af4b93fff6733cc5c96b61b55910",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4a286f21-2542-41e7-b795-0b5265254a63",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4a286f21-2542-41e7-b795-0b5265254a63",
  "created_at": "2026-10-28T07:41:04.991112Z",
  "expires_at": "2026-10-28T08:11:04.991112Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/4a286f21-2542-41e7-b795-0b5265254a63` → **200**

```json
{
  "id": "4a286f21-2542-41e7-b795-0b5265254a63",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T07:41:04.991112Z",
  "expires_at": "2026-10-28T08:11:04.991112Z",
  "completed_at": "2026-10-28T07:41:05.027117Z",
  "masked_pan": "41****2695",
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
      "id": "e7b44524-8a92-4d8f-9b3a-e7cf04b24787",
      "at": "2026-10-28T07:41:06.010719Z",
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
  "command_id": "03436e52-55ad-46a1-8253-4d679c134417",
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
  "correlation_id": "40e69035-6220-4549-8007-ecd69d406e2a"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676341878",
  "device_ref": "sandbox-22133"
}
```

```json
{
  "challenge_id": "aca0a0df-8eb0-4f11-b2f6-b8663963d133",
  "expires_at": "2026-10-28T07:46:06.174785005Z",
  "resend_available_at": "2026-10-28T07:41:07.174785005Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676341878` → **200**

```json
{
  "phone": "+380676341878",
  "audience": "CLIENT",
  "code": "137705",
  "sent_at": "2026-10-28T07:41:06.177806491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aca0a0df-8eb0-4f11-b2f6-b8663963d133",
  "code": "137705",
  "device_ref": "sandbox-22133"
}
```

```json
{
  "session_id": "037d2ef7-4d97-418e-9da1-261acd31b87e",
  "subject": {
    "type": "CLIENT",
    "id": "32983fc2-f615-4943-a086-94b0be9615c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjk4M2ZjMi1mNjE1LTQ5NDMtYTA4Ni05NGIwYmU5NjE1YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTY2LCJpYXQiOjE3OTMxNzMyNjYsImp0aSI6IjA2YThhYTQwLTI3NzQtNGNlZC1iMjUwLTNkOTYwYjgzNjBlYSIsInNpZCI6IjAzN2QyZWY3LTRkOTctNDE4ZS05ZGExLTI2MWFjZDMxYjg3ZSJ9.K2F-ZZaxvQn-0H2YwWcyhKkHzP9jmJs7IC1knd8igpc",
  "access_expires_at": "2026-10-28T07:56:06.233543743Z",
  "refresh_token": "-Lry0GbYwG_1efGPKcGcK8FzZVg-CalkrLc5rcXwIZk",
  "refresh_expires_at": "2026-11-27T07:41:06.232859524Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "32983fc2-f615-4943-a086-94b0be9615c2",
  "session_id": "037d2ef7-4d97-418e-9da1-261acd31b87e",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73ba54d8-a0df-4d2a-8a14-78530bd40543",
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
  "id": "bc4ec91e-1a67-4972-989d-83eab6f3769d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:06.293432Z",
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
  "challenge_id": "82c325a9-609c-4c25-b795-8092364ba613",
  "expires_at": "2026-10-28T07:46:08.332298757Z",
  "resend_available_at": "2026-10-28T07:41:09.332298757Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676341878` → **200**

```json
{
  "phone": "+380676341878",
  "audience": "CLIENT",
  "code": "776114",
  "sent_at": "2026-10-28T07:41:08.33464403Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "58b63575-3908-4ec7-93f9-db7c33c79efa",
  "challenge_id": "82c325a9-609c-4c25-b795-8092364ba613",
  "otp_code": "776114"
}
```

```json
{
  "client_id": "32983fc2-f615-4943-a086-94b0be9615c2",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T07:41:08.405775793Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "6ab2737b-5c35-4dc2-a974-91f9a915ad3e",
  "quote_id": "bc4ec91e-1a67-4972-989d-83eab6f3769d",
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
  "correlation_id": "17f47b9f-c0d7-4435-a1a2-bafafbb12abb"
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
  "session_id": "8594fd52-b1b9-4c73-aef0-21749a96640e",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxNjgsImlhdCI6MTc5MzE3MzI2OCwianRpIjoiODMzMDI3MWQtZDkxOC00YjVkLTllNDgtYjkyZjg5MGM4NzRjIiwic2lkIjoiODU5NGZkNTItYjFiOS00YzczLWFlZjAtMjE3NDlhOTY2NDBlIn0.jA_C0Xmwn58TitaQcW709lyx42Wfg5KNqFUJYZl-uJU",
  "access_expires_at": "2026-10-28T07:56:08.773312854Z",
  "refresh_token": "haMbPEtiZzB-PiH-op8Gppxf1flLyEo9NtOlJmDEYSA",
  "refresh_expires_at": "2026-10-28T19:41:08.772700269Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "32983fc2-f615-4943-a086-94b0be9615c2",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T07:41:08.405776Z",
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

`POST /api/admin/v1/client-deletions/32983fc2-f615-4943-a086-94b0be9615c2/complete` → **200**

```json
{
  "command_id": "305911fb-0764-4cd7-af78-f7550a6ac0cc",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "32983fc2-f615-4943-a086-94b0be9615c2",
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
  "correlation_id": "7ef8d43c-4879-4d80-917a-6bbfdce9d59a"
}
```

Done: client 32983fc2-f615-4943-a086-94b0be9615c2 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660039033",
  "device_ref": "sandbox-174"
}
```

```json
{
  "challenge_id": "e2a13cbb-59bb-423e-90ea-22ddb0cca69e",
  "expires_at": "2026-10-28T07:46:08.918159355Z",
  "resend_available_at": "2026-10-28T07:41:09.918159355Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660039033` → **200**

```json
{
  "phone": "+380660039033",
  "audience": "CLIENT",
  "code": "066597",
  "sent_at": "2026-10-28T07:41:08.920814475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2a13cbb-59bb-423e-90ea-22ddb0cca69e",
  "code": "066597",
  "device_ref": "sandbox-174"
}
```

```json
{
  "session_id": "96a80968-448b-4faf-9b4f-0dfdbb04df60",
  "subject": {
    "type": "CLIENT",
    "id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWZkZjdkYy1kNzk3LTRmMWItOWQxMy0wMDk4MTVmZDA1NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTY4LCJpYXQiOjE3OTMxNzMyNjgsImp0aSI6IjliMGRjMTUyLTY4ZWUtNDAyYy04ODg4LTNkNWQ2ZjQwMmFmMiIsInNpZCI6Ijk2YTgwOTY4LTQ0OGItNGZhZi05YjRmLTBkZmRiYjA0ZGY2MCJ9.GsHQPhXCWaxWyDGaC2BpbcCgS8myBqb33l6C0LYfqSM",
  "access_expires_at": "2026-10-28T07:56:08.976588012Z",
  "refresh_token": "QgiXQ0Cwc-vHsjwdhIE98dVdo5IUvJpb1Lc4VfD-A0k",
  "refresh_expires_at": "2026-11-27T07:41:08.975970889Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569",
  "session_id": "96a80968-448b-4faf-9b4f-0dfdbb04df60",
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
  "session_id": "f425a455-f121-4bff-83cb-49e8122c3023",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxNjksImlhdCI6MTc5MzE3MzI2OSwianRpIjoiNGVjMDU4MjgtZDI4Mi00ZjliLWE0YTktNDdkNmFlYzIzY2Y4Iiwic2lkIjoiZjQyNWE0NTUtZjEyMS00YmZmLTgzY2ItNDllODEyMmMzMDIzIn0.VF1jFLp5e4SofSslo9RqGqxE31jFMNu8IcvdGqbaKVc",
  "access_expires_at": "2026-10-28T07:56:09.32633558Z",
  "refresh_token": "njRMPd6Tx0LQXvUaIBsp2yZA8b_TXJ0xrUeqGl9jyoc",
  "refresh_expires_at": "2026-10-28T19:41:09.325661611Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0039033&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569",
      "phone": "+380660039033",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T07:41:08.973773Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a1fdf7dc-d797-4f1b-9d13-009815fd0569` → **200**

```json
{
  "client": {
    "id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569",
    "phone": "+380660039033",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T07:41:08.973773Z",
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

`POST /api/admin/v1/clients/a1fdf7dc-d797-4f1b-9d13-009815fd0569/block` → **400**

```json
{
  "command_id": "75bf613a-7fa1-47f9-bfbf-ab652afdf7b5",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a1fdf7dc-d797-4f1b-9d13-009815fd0569/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "df1e372f-6607-45b6-8b51-4dd4ab3ffbe4",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a1fdf7dc-d797-4f1b-9d13-009815fd0569/block` → **200**

```json
{
  "command_id": "1d86a819-13bd-40f9-aced-d45de6fe25a0",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569",
  "phone": "+380660039033",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T07:41:08.973773Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T07:41:09.490246Z",
    "by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
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
  "correlation_id": "15a509e9-ff71-44da-8360-eaca20541ee1"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660039033",
  "device_ref": "sandbox-11221"
}
```

```json
{
  "challenge_id": "0b6e3329-eee9-4241-8256-7e0d64463551",
  "expires_at": "2026-10-28T07:46:11.55027212Z",
  "resend_available_at": "2026-10-28T07:41:12.55027212Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660039033` → **200**

```json
{
  "phone": "+380660039033",
  "audience": "CLIENT",
  "code": "205974",
  "sent_at": "2026-10-28T07:41:11.552933931Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "0b6e3329-eee9-4241-8256-7e0d64463551",
  "code": "205974",
  "device_ref": "sandbox-11221"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "8f8282f9-e8a4-4fc4-897f-0e4dab798af3"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a1fdf7dc-d797-4f1b-9d13-009815fd0569` → **200**

```json
{
  "client": {
    "id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569",
    "phone": "+380660039033",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T07:41:08.973773Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T07:41:09.490246Z",
      "by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
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

`POST /api/admin/v1/clients/a1fdf7dc-d797-4f1b-9d13-009815fd0569/unblock` → **200**

```json
{
  "command_id": "2e9e845b-1b90-401f-9314-a5e50b75cbf6",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569",
  "phone": "+380660039033",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T07:41:08.973773Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660039033",
  "device_ref": "sandbox-13957"
}
```

```json
{
  "challenge_id": "3c978b4d-2258-42cd-b80a-66805fe612d2",
  "expires_at": "2026-10-28T07:46:13.705988396Z",
  "resend_available_at": "2026-10-28T07:41:14.705988396Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660039033` → **200**

```json
{
  "phone": "+380660039033",
  "audience": "CLIENT",
  "code": "023977",
  "sent_at": "2026-10-28T07:41:13.708552511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c978b4d-2258-42cd-b80a-66805fe612d2",
  "code": "023977",
  "device_ref": "sandbox-13957"
}
```

```json
{
  "session_id": "374347f0-47d8-401b-b09e-51a13ce194fd",
  "subject": {
    "type": "CLIENT",
    "id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWZkZjdkYy1kNzk3LTRmMWItOWQxMy0wMDk4MTVmZDA1NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTczLCJpYXQiOjE3OTMxNzMyNzMsImp0aSI6ImI4ZTliZmUxLThlNDQtNDZlZC1iZTViLTQzNTcwY2RlOTNhMyIsInNpZCI6IjM3NDM0N2YwLTQ3ZDgtNDAxYi1iMDllLTUxYTEzY2UxOTRmZCJ9.qSKS6LR7g23GntyFR5ckOEAH5N1Tfz309Z94ONP3xQo",
  "access_expires_at": "2026-10-28T07:56:13.764821424Z",
  "refresh_token": "A9VZKt6G9UnZzMJx26efs6DFL6mE140SQrqSAIobuuo",
  "refresh_expires_at": "2026-11-27T07:41:13.764064288Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a1fdf7dc-d797-4f1b-9d13-009815fd0569",
  "session_id": "374347f0-47d8-401b-b09e-51a13ce194fd",
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
  "phone": "+380638154326",
  "device_ref": "sandbox-18452"
}
```

```json
{
  "challenge_id": "513fbc85-ca04-4a1e-998c-837656eae1f7",
  "expires_at": "2026-10-28T07:46:13.826769241Z",
  "resend_available_at": "2026-10-28T07:41:14.826769241Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638154326` → **200**

```json
{
  "phone": "+380638154326",
  "audience": "CLIENT",
  "code": "896664",
  "sent_at": "2026-10-28T07:41:13.829436809Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "513fbc85-ca04-4a1e-998c-837656eae1f7",
  "code": "896664",
  "device_ref": "sandbox-18452"
}
```

```json
{
  "session_id": "edb8cd8f-c4cd-4735-91db-a91138240943",
  "subject": {
    "type": "CLIENT",
    "id": "11b39996-1504-45de-956c-a9139422f68e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMWIzOTk5Ni0xNTA0LTQ1ZGUtOTU2Yy1hOTEzOTQyMmY2OGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTczLCJpYXQiOjE3OTMxNzMyNzMsImp0aSI6IjMyMjg4YmUzLWRjYjktNDRmYy1hN2NkLTU0NWI1YmFmMzgyNyIsInNpZCI6ImVkYjhjZDhmLWM0Y2QtNDczNS05MWRiLWE5MTEzODI0MDk0MyJ9.8PJl_k4rxQvUg5mVGiOUdnlX0b-dbvtI0HJbZltOb8o",
  "access_expires_at": "2026-10-28T07:56:13.885334281Z",
  "refresh_token": "rOwDPUpPbWWUC2jMDNoIqQHc6Jl3FsGcRcsK1ij56Zc",
  "refresh_expires_at": "2026-11-27T07:41:13.884575752Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "27638b80-49d8-4b16-bdfc-41e087619dea",
  "expires_at": "2026-10-28T07:46:15.916948839Z",
  "resend_available_at": "2026-10-28T07:41:16.916948839Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638154326` → **200**

```json
{
  "phone": "+380638154326",
  "audience": "CLIENT",
  "code": "887058",
  "sent_at": "2026-10-28T07:41:15.919049605Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "0b823374-5f8d-4572-9994-f33b5eceafe4",
  "challenge_id": "27638b80-49d8-4b16-bdfc-41e087619dea",
  "otp_code": "887058"
}
```

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "PENDING",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2` → **200**

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "PENDING",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2` → **200**

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "PENDING",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2` → **200**

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "PENDING",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2` → **200**

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "PENDING",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2` → **200**

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "PENDING",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2` → **200**

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "PENDING",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2` → **200**

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "PENDING",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2` → **200**

```json
{
  "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
  "state": "READY",
  "created_at": "2026-10-28T07:41:15.979765Z",
  "ready_at": "2026-10-28T07:41:22.474713Z",
  "expires_at": "2026-11-04T07:41:22.474713Z",
  "size_bytes": 1008
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632390202",
  "device_ref": "sandbox-28852"
}
```

```json
{
  "challenge_id": "88c25bb3-15a1-4a38-9057-b5cde1b56fac",
  "expires_at": "2026-10-28T07:46:23.249815998Z",
  "resend_available_at": "2026-10-28T07:41:24.249815998Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632390202` → **200**

```json
{
  "phone": "+380632390202",
  "audience": "CLIENT",
  "code": "099574",
  "sent_at": "2026-10-28T07:41:23.253250034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88c25bb3-15a1-4a38-9057-b5cde1b56fac",
  "code": "099574",
  "device_ref": "sandbox-28852"
}
```

```json
{
  "session_id": "70ec418e-d439-461f-a684-e788069cbc98",
  "subject": {
    "type": "CLIENT",
    "id": "5ced49c7-ef54-45f9-b049-c3e6b7e33476"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Y2VkNDljNy1lZjU0LTQ1ZjktYjA0OS1jM2U2YjdlMzM0NzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTgzLCJpYXQiOjE3OTMxNzMyODMsImp0aSI6ImVlMDdjMGMyLTVjMzUtNDFhNC1iY2M1LWFkNzcyZDM0NmU4MyIsInNpZCI6IjcwZWM0MThlLWQ0MzktNDYxZi1hNjg0LWU3ODgwNjljYmM5OCJ9.zBZhMNDOSscgy0PjX66CEaDC-bm9mF7u0ZcolR6rPPk",
  "access_expires_at": "2026-10-28T07:56:23.309112744Z",
  "refresh_token": "FtukBbcnqoDcns6WbFrW7s-DDKLEBtfp7SBZ28egZZs",
  "refresh_expires_at": "2026-11-27T07:41:23.308474267Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7d228c14-e126-4bb1-87bd-313b03a1bb6a"
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
  "session_id": "d315c95f-3b94-4c58-9944-7858fe0c4724",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxODMsImlhdCI6MTc5MzE3MzI4MywianRpIjoiODRhMDFhYzMtN2M0My00MmFlLWIzMTItYTM2MTMzYjM5ZGYyIiwic2lkIjoiZDMxNWM5NWYtM2I5NC00YzU4LTk5NDQtNzg1OGZlMGM0NzI0In0.2K_6t3xnf-jJ0NZTckZH2puqeH9QVtzYv5cmYOsdp3s",
  "access_expires_at": "2026-10-28T07:56:23.659531388Z",
  "refresh_token": "pvWf1wx_9LwdQ5Sah_qEE4T0pIEtpDySfBHMq6ZiJyM",
  "refresh_expires_at": "2026-10-28T19:41:23.658848878Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "11b39996-1504-45de-956c-a9139422f68e",
  "session_id": "edb8cd8f-c4cd-4735-91db-a91138240943",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/11b39996-1504-45de-956c-a9139422f68e/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "3ada5bac-b7f4-4389-877e-1cc4bc2d2ca2",
      "state": "READY",
      "created_at": "2026-10-28T07:41:15.979765Z",
      "ready_at": "2026-10-28T07:41:22.474713Z",
      "expires_at": "2026-11-04T07:41:22.474713Z",
      "size_bytes": 1008
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
  "device_ref": "sandbox-20711"
}
```

```json
{
  "challenge_id": "38b56b31-9d48-45a0-bb01-c85af0480d73",
  "expires_at": "2026-10-28T07:46:23.7829522Z",
  "resend_available_at": "2026-10-28T07:41:24.7829522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "168772",
  "sent_at": "2026-10-28T07:41:23.785557422Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38b56b31-9d48-45a0-bb01-c85af0480d73",
  "code": "168772",
  "device_ref": "sandbox-20711"
}
```

```json
{
  "session_id": "27b59482-fbde-41cf-b2a4-d7295238c29b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE4MywiaWF0IjoxNzkzMTczMjgzLCJqdGkiOiI1MjIyNGJkZS01ZGQxLTQwNzMtODAzOC1jNGRkZmJmMWM0YTUiLCJzaWQiOiIyN2I1OTQ4Mi1mYmRlLTQxY2YtYjJhNC1kNzI5NTIzOGMyOWIifQ.uGNC4rRG5aOgNUTc-CIqGugYWZa4iSlc-9O83DeSRQ8",
  "access_expires_at": "2026-10-28T07:56:23.843482475Z",
  "refresh_token": "WEiU7BVwAwqx2lHALl5JqkYoxK8RZeF_TfA8foey9LE",
  "refresh_expires_at": "2026-11-27T07:41:23.842749224Z",
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
  "command_id": "585f1255-8411-45c0-8fb0-fe1804563ee6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:23Z",
    "sequence": 1793173283894
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:23.91257Z",
  "last_location_at": "2026-10-28T07:41:23.91257Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672768426",
  "device_ref": "sandbox-32180"
}
```

```json
{
  "challenge_id": "b5eba40f-894b-4adf-8b95-3458da04ce57",
  "expires_at": "2026-10-28T07:46:23.944737999Z",
  "resend_available_at": "2026-10-28T07:41:24.944737999Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672768426` → **200**

```json
{
  "phone": "+380672768426",
  "audience": "CLIENT",
  "code": "178319",
  "sent_at": "2026-10-28T07:41:23.947138939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5eba40f-894b-4adf-8b95-3458da04ce57",
  "code": "178319",
  "device_ref": "sandbox-32180"
}
```

```json
{
  "session_id": "b3a247ef-7959-4653-82ce-62dc97d8fea0",
  "subject": {
    "type": "CLIENT",
    "id": "f6692937-db91-41fe-bad4-726afd4aaa96"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjY5MjkzNy1kYjkxLTQxZmUtYmFkNC03MjZhZmQ0YWFhOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTg0LCJpYXQiOjE3OTMxNzMyODQsImp0aSI6ImE2YzA2MzU5LTU3OTgtNDQ2OC04YjdmLWIyYmVhZmMzOWQ1NyIsInNpZCI6ImIzYTI0N2VmLTc5NTktNDY1My04MmNlLTYyZGM5N2Q4ZmVhMCJ9.7ebrPnZNdPWjsYfKgTVru6ozYMkzmknQ-4QJd4hq7KY",
  "access_expires_at": "2026-10-28T07:56:24.003518024Z",
  "refresh_token": "7JgJdYLljNhcoCRpzLj4939nFI-zeTqGf_Z95xBrCvo",
  "refresh_expires_at": "2026-11-27T07:41:24.002886033Z",
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
  "command_id": "9b0c7553-3b29-4246-b462-0220f6a5127b",
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
  "id": "c135d58e-8b80-4e13-9af0-488c6e45d0d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:24.067355Z",
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
  "command_id": "a884879a-d2d7-4b74-9e31-0e078c8b55fa",
  "platform": "ANDROID",
  "token": "sandbox-driver-1b942467-8d7c-4b86-b886-f6ecce8b515e"
}
```

```json
{
  "id": "c689eb0a-2b25-40a6-b1ea-0697326be376",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:41:24.114957Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "a679e4d1-4d70-4c20-9d1a-5b51d0bb5a6d",
  "platform": "ANDROID",
  "token": "sandbox-rider-eff09ed6-1d49-4faa-b660-9bed94a4e05c"
}
```

```json
{
  "id": "7c2b4daf-4bbc-451a-b9eb-481de21264b3",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T07:41:24.152523Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ca78e373-524e-4ac1-8a7f-4347e0b9f297",
  "quote_id": "c135d58e-8b80-4e13-9af0-488c6e45d0d4",
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
  "id": "67f117df-5341-4907-924c-ed9935f38f80",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6692937-db91-41fe-bad4-726afd4aaa96",
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
  "created_at": "2026-10-28T07:41:24.195453Z",
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
    "id": "289d59d8-6191-483a-9954-404f99e69a74",
    "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
    "expires_at": "2026-10-28T07:41:39.199091Z",
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

`POST /api/driver/v1/offers/289d59d8-6191-483a-9954-404f99e69a74/accept` → **200**

```json
{
  "command_id": "08630b86-3ce3-481a-b66c-26ae841e5bb4"
}
```

```json
{
  "id": "3df08479-eab6-4b92-8601-8ea2f8f614ad",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5dd326c6-cf43-4bea-b085-b96dff2f9ebf",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:41:24.171Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:41:24.171Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T07:41:24.171Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:41:25.708838123Z",
    "token_suffix": "8b515e",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
      "order_version": "2",
      "event_id": "be8fcc96-4bd4-4de5-9f3d-78b419ae5d1d",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672768426&after=2026-10-28T07:41:24.171Z` → **200**

```json
[
  {
    "at": "2026-10-28T07:41:25.710604457Z",
    "token_suffix": "a4e05c",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
      "order_version": "3",
      "event_id": "e566af17-ded5-4d29-bd0c-017e3bb31cfb",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/67f117df-5341-4907-924c-ed9935f38f80/messages` → **201**

```json
{
  "command_id": "ff4819bc-11b1-4428-a247-4cbf1e7ac08e",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "a30fa5e2-a84f-4c26-b755-5574f2bea2ae",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T07:41:26.412525501Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5dd326c6-cf43-4bea-b085-b96dff2f9ebf",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "assignment_id": "3df08479-eab6-4b92-8601-8ea2f8f614ad",
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

`POST /api/driver/v1/trips/5dd326c6-cf43-4bea-b085-b96dff2f9ebf/messages` → **201**

```json
{
  "command_id": "916dc100-c193-412b-b915-05f7cdfec3ab",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "85ce216d-af15-4924-afed-48d920f6e702",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T07:41:26.465738437Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/67f117df-5341-4907-924c-ed9935f38f80/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/5dd326c6-cf43-4bea-b085-b96dff2f9ebf/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672768426"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:26Z",
    "sequence": 1793173286541
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:26.559918Z",
  "last_location_at": "2026-10-28T07:41:26.559918Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5dd326c6-cf43-4bea-b085-b96dff2f9ebf",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "assignment_id": "3df08479-eab6-4b92-8601-8ea2f8f614ad",
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

`POST /api/driver/v1/trips/5dd326c6-cf43-4bea-b085-b96dff2f9ebf/arrive` → **200**

```json
{
  "command_id": "6f0e7c20-a0dd-4067-a484-1e6578f7861a",
  "expected_version": 0
}
```

```json
{
  "id": "5dd326c6-cf43-4bea-b085-b96dff2f9ebf",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "assignment_id": "3df08479-eab6-4b92-8601-8ea2f8f614ad",
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
  "arrived_at": "2026-10-28T07:41:26.613968Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5dd326c6-cf43-4bea-b085-b96dff2f9ebf/start` → **200**

```json
{
  "command_id": "dccb4732-958f-413b-838e-0cbb4150c165",
  "expected_version": 1
}
```

```json
{
  "id": "5dd326c6-cf43-4bea-b085-b96dff2f9ebf",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "assignment_id": "3df08479-eab6-4b92-8601-8ea2f8f614ad",
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
  "arrived_at": "2026-10-28T07:41:26.613968Z",
  "started_at": "2026-10-28T07:41:26.648841Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:26Z",
    "sequence": 1793173286672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:26.692256Z",
  "last_location_at": "2026-10-28T07:41:26.692256Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/5dd326c6-cf43-4bea-b085-b96dff2f9ebf/complete` → **200**

```json
{
  "command_id": "ba111044-3245-406a-9deb-5008e3184922",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:41:26Z",
  "cash_received": true
}
```

```json
{
  "id": "5dd326c6-cf43-4bea-b085-b96dff2f9ebf",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "assignment_id": "3df08479-eab6-4b92-8601-8ea2f8f614ad",
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
  "arrived_at": "2026-10-28T07:41:26.613968Z",
  "started_at": "2026-10-28T07:41:26.648841Z",
  "completed_at": "2026-10-28T07:41:26.729039Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/67f117df-5341-4907-924c-ed9935f38f80` → **200**

```json
{
  "id": "67f117df-5341-4907-924c-ed9935f38f80",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f6692937-db91-41fe-bad4-726afd4aaa96",
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
    "id": "3df08479-eab6-4b92-8601-8ea2f8f614ad",
    "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5dd326c6-cf43-4bea-b085-b96dff2f9ebf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:41:24.195453Z",
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
    "id": "67f117df-5341-4907-924c-ed9935f38f80",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:41:24.195453Z",
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
    "id": "5dd326c6-cf43-4bea-b085-b96dff2f9ebf",
    "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
    "order_short_number": 5,
    "created_at": "2026-10-28T07:41:24.26552Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6f25ddb2-2b3c-4d61-aff7-25a719668f8f",
    "order_id": "73885b5a-10b4-4dea-af08-8f87650633dc",
    "order_short_number": 1,
    "created_at": "2026-10-28T07:40:46.775541Z",
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

`GET /api/rider/v1/orders/67f117df-5341-4907-924c-ed9935f38f80/tip` → **200**

```json
{
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
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
  "available_until": "2026-10-29T07:41:26.729039Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/67f117df-5341-4907-924c-ed9935f38f80/tip` → **201**

```json
{
  "command_id": "ac47a6e2-1618-4d9e-89ad-3f59745198e0",
  "amount_minor": 1100
}
```

```json
{
  "id": "73315b8a-b0ac-485e-b68f-ffe6083fc0b2",
  "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T07:41:29.940972Z"
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
  "session_id": "365bad10-89ca-4168-8515-6d318e5be734",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTAsImlhdCI6MTc5MzE3MzI5MCwianRpIjoiY2Q5OGU1NjQtMTk2Ny00YzA5LWIzNGUtYzU2OWUzYTNjMjA2Iiwic2lkIjoiMzY1YmFkMTAtODljYS00MTY4LTg1MTUtNmQzMThlNWJlNzM0In0.nwBFEKwEQV5s7RveObGu9jaA3Ahcv89J0xlu60aYegc",
  "access_expires_at": "2026-10-28T07:56:30.271969759Z",
  "refresh_token": "GofAUw5XVOSJOtA_FwDNAX7U3O8yHBBHJk-XlBM6n_4",
  "refresh_expires_at": "2026-10-28T19:41:30.271320815Z",
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
  "generated_at": "2026-10-28T07:41:30.304816366Z"
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
  "generated_at": "2026-10-28T07:41:30.336561939Z"
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
  "session_id": "0899af6d-982f-4be1-a818-a0930844cc9e",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTAsImlhdCI6MTc5MzE3MzI5MCwianRpIjoiM2E2MTYyNDAtMDhmNS00OWQ3LWFkYTYtNTQxZjYwNGYyODBiIiwic2lkIjoiMDg5OWFmNmQtOTgyZi00YmUxLWE4MTgtYTA5MzA4NDRjYzllIn0.BAZNtT1SvoKLZm2heRNVWx_0NbaVwtj3bgVkBGiWBqU",
  "access_expires_at": "2026-10-28T07:56:30.66310534Z",
  "refresh_token": "dz-lWfynHIuXsq_61Tc0Oz_tkJaS-sWgo_QloBdpRIc",
  "refresh_expires_at": "2026-10-28T19:41:30.662310503Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/67f117df-5341-4907-924c-ed9935f38f80/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:41:24.19626Z",
      "actor": {
        "type": "CLIENT",
        "id": "f6692937-db91-41fe-bad4-726afd4aaa96",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
        "quote_id": "c135d58e-8b80-4e13-9af0-488c6e45d0d4",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:41:24.198145Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
        "attempt_id": "9c5d9180-dc8f-419e-843b-a6aba8242054",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:41:24.204405Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "289d59d8-6191-483a-9954-404f99e69a74",
        "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:41:24.267657Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "289d59d8-6191-483a-9954-404f99e69a74",
        "order_id": "67f117df-5341-4907-924c-ed9935f38f80",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "3df08479-eab6-4b92-8601-8ea2f8f614ad"
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
  "at": "2026-10-28T07:41:30.71755482Z",
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
      "last_location_at": "2026-10-28T07:41:26.692256Z",
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
      "last_location_at": "2026-10-28T07:40:54.560022Z",
      "order_id": null
    }
  ]
}
```

Done: order 67f117df-5341-4907-924c-ed9935f38f80.

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
  "session_id": "54f4396f-c249-4361-b93f-4505e31edf79",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTEsImlhdCI6MTc5MzE3MzI5MSwianRpIjoiMjJlMDU2ZTAtZjljNi00YzFmLThkYzItYzZiNGI4NTYyNmRjIiwic2lkIjoiNTRmNDM5NmYtYzI0OS00MzYxLWI5M2YtNDUwNWUzMWVkZjc5In0.t7CYn45oDKycqx4XoYehozC6Lm55QZfbWPrYNtOMSL8",
  "access_expires_at": "2026-10-28T07:56:31.060775446Z",
  "refresh_token": "r-gY7M3FIG9XlT8nsV1sAP9xyvsfZQE6z2kI6puTN5k",
  "refresh_expires_at": "2026-10-28T19:41:31.060163521Z",
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
  "command_id": "d40ddab0-97a3-43f8-8307-ecc63790b6d2",
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
  "timestamp": "2026-10-28T07:41:31.000+0000",
  "channel": {
    "id": "1730052000.2037321334",
    "linkedid": "1730052000.2037321334",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677237316"
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
  "timestamp": "2026-10-28T07:41:31.000+0000",
  "channel": {
    "id": "1730052000.2037321334",
    "linkedid": "1730052000.2037321334",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677237316"
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
  "session_id": "6c393e9c-ccd5-48b0-bcfa-419e30555517",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTEsImlhdCI6MTc5MzE3MzI5MSwianRpIjoiMDcyMTFlMDgtYTA5ZS00OWQ2LWE0ZGEtMDkxZjc3YTNjMTZjIiwic2lkIjoiNmMzOTNlOWMtY2NkNS00OGIwLWJjZmEtNDE5ZTMwNTU1NTE3In0.UArCBSCHiOTJxS6xEbg2wfufbTGuGhy4ykxuPPP_A8k",
  "access_expires_at": "2026-10-28T07:56:31.494572417Z",
  "refresh_token": "6aDIueMxLeLhsVNquP3imRbX5WcUmJCiZS_fordKLaY",
  "refresh_expires_at": "2026-10-28T19:41:31.493975901Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "742e9567-ab32-4b96-8dfd-e45680cc2443",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677237316",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T07:41:31Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/742e9567-ab32-4b96-8dfd-e45680cc2443/answer` → **200**

```json
{
  "command_id": "fffe20e8-e218-4ca0-a5fd-741f9693d13d"
}
```

```json
{
  "id": "742e9567-ab32-4b96-8dfd-e45680cc2443",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677237316",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "order_ids": [],
  "started_at": "2026-10-28T07:41:31Z",
  "answered_at": "2026-10-28T07:41:31.562769Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2037321334",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d9f7783a-58a0-451e-a319-81a733006f34",
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
  "id": "592f0c69-f58f-45b6-96c0-cd0eaafda82c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:31.629914Z",
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
  "command_id": "654b077a-97aa-45c8-b552-d14294547e5e",
  "quote_id": "592f0c69-f58f-45b6-96c0-cd0eaafda82c",
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
    "phone": "+380677237316"
  },
  "call_id": "742e9567-ab32-4b96-8dfd-e45680cc2443"
}
```

```json
{
  "id": "bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7",
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
  "created_at": "2026-10-28T07:41:31.689178Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677237316"
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
    "id": "1730052000.2037321334",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "742e9567-ab32-4b96-8dfd-e45680cc2443",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677237316",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [
        "bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7"
      ],
      "started_at": "2026-10-28T07:41:31Z",
      "answered_at": "2026-10-28T07:41:31.562769Z",
      "ended_at": "2026-10-28T07:41:31.741177Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "3cfd652f-de08-44f2-a40a-0cda6a893fa9",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676950539",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [],
      "started_at": "2026-10-28T07:40:51.084524Z",
      "answered_at": "2026-10-28T07:40:51.14862Z",
      "ended_at": "2026-10-28T07:40:51.201943Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:40:52.475037Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7` → **200**

```json
{
  "id": "bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7",
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
  "created_at": "2026-10-28T07:41:31.689178Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677237316"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7` → **200**

```json
{
  "id": "bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7",
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
  "created_at": "2026-10-28T07:41:31.689178Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677237316"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7/cancel` → **200**

```json
{
  "command_id": "fb0045ca-7a75-45c9-8a64-648b56e4f6e7",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7",
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
  "created_at": "2026-10-28T07:41:31.689178Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677237316"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 742e9567-ab32-4b96-8dfd-e45680cc2443 with order bc2abbdd-7ffb-4b99-80fb-20b1a5578fc7.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5848"
}
```

```json
{
  "challenge_id": "137abe12-af8e-486e-a0c1-363a2bf50785",
  "expires_at": "2026-10-28T07:46:31.911158865Z",
  "resend_available_at": "2026-10-28T07:41:32.911158865Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "023708",
  "sent_at": "2026-10-28T07:41:31.91349288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "137abe12-af8e-486e-a0c1-363a2bf50785",
  "code": "023708",
  "device_ref": "sandbox-5848"
}
```

```json
{
  "session_id": "c8709e2f-2869-4bd0-b9d4-dc712da45f0b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE5MSwiaWF0IjoxNzkzMTczMjkxLCJqdGkiOiIwODMwYmEzZi02YTM2LTQzOTQtOGZmYS04NjgzZmMzNzI0ZTQiLCJzaWQiOiJjODcwOWUyZi0yODY5LTRiZDAtYjlkNC1kYzcxMmRhNDVmMGIifQ.llWMDHq05DxVDlar9YZzH9W_eeJ7kshqtROMkkIxWpc",
  "access_expires_at": "2026-10-28T07:56:31.96860557Z",
  "refresh_token": "sdqll2C0eeGhw9ck7XpfNvcQqkjJtQ-ew7uN9KIa3LM",
  "refresh_expires_at": "2026-11-27T07:41:31.967993856Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:26.692256Z",
  "last_location_at": "2026-10-28T07:41:26.692256Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/handover` → **200**

```json
{
  "command_id": "87d011a8-95d7-4865-88f6-aed72e4eae54",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:26.692256Z",
  "last_location_at": "2026-10-28T07:41:26.692256Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:32Z",
    "sequence": 1793173292528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:32.072609Z",
  "last_location_at": "2026-10-28T07:41:32.072609Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660286276",
  "device_ref": "sandbox-9736"
}
```

```json
{
  "challenge_id": "2f6853dc-5bad-4fed-9566-3c4873ec90f4",
  "expires_at": "2026-10-28T07:46:32.09800249Z",
  "resend_available_at": "2026-10-28T07:41:33.09800249Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660286276` → **200**

```json
{
  "phone": "+380660286276",
  "audience": "CLIENT",
  "code": "827007",
  "sent_at": "2026-10-28T07:41:32.100763847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f6853dc-5bad-4fed-9566-3c4873ec90f4",
  "code": "827007",
  "device_ref": "sandbox-9736"
}
```

```json
{
  "session_id": "ddedcbcf-3c42-4ef8-8757-4fdc0c14c27b",
  "subject": {
    "type": "CLIENT",
    "id": "3fc83f41-8836-49a5-8fff-e0a66c52adac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmM4M2Y0MS04ODM2LTQ5YTUtOGZmZi1lMGE2NmM1MmFkYWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTkyLCJpYXQiOjE3OTMxNzMyOTIsImp0aSI6ImNmMGJlNzA3LWVkNDMtNGU3Mi04ZGU2LTczMzI5NDljZjg1OSIsInNpZCI6ImRkZWRjYmNmLTNjNDItNGVmOC04NzU3LTRmZGMwYzE0YzI3YiJ9._X867X6MH2_yNCsMJah7B_LRayR3AchyV2mcEsQo_S8",
  "access_expires_at": "2026-10-28T07:56:32.167807195Z",
  "refresh_token": "wugGTHK5Kg0hWiJRVUGxoHY_ZPRkLYUj6QbZ3pQwTes",
  "refresh_expires_at": "2026-11-27T07:41:32.167159123Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2086d68a-aa9e-46bd-9f7c-c39fba9fa380",
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
  "id": "65c8ed4b-9e4c-4e49-9dd8-82731af4e7bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T07:46:32.205447Z",
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
  "command_id": "b291e948-1ce8-4613-aa7e-297c3f16b190",
  "quote_id": "65c8ed4b-9e4c-4e49-9dd8-82731af4e7bf",
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
  "id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fc83f41-8836-49a5-8fff-e0a66c52adac",
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
  "created_at": "2026-10-28T07:41:32.247005Z",
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
    "id": "8001e5ec-cfab-44a1-9b2c-6e0bf98a2f85",
    "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
    "expires_at": "2026-10-28T07:41:47.250651Z",
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

`POST /api/driver/v1/offers/8001e5ec-cfab-44a1-9b2c-6e0bf98a2f85/accept` → **200**

```json
{
  "command_id": "1b7f3884-3c62-48fb-a396-156048cff406"
}
```

```json
{
  "id": "41d58896-14a4-4569-8e08-2fe1ca0c4afd",
  "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c52ba12e-b897-4a2a-b22d-d8448862f595",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c52ba12e-b897-4a2a-b22d-d8448862f595",
  "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
  "assignment_id": "41d58896-14a4-4569-8e08-2fe1ca0c4afd",
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

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:32Z",
    "sequence": 1793173292529
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:32.376366Z",
  "last_location_at": "2026-10-28T07:41:32.376366Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c52ba12e-b897-4a2a-b22d-d8448862f595/arrive` → **200**

```json
{
  "command_id": "314cbad6-bbfd-422f-97ea-c1b27b5ea6cb",
  "expected_version": 0
}
```

```json
{
  "id": "c52ba12e-b897-4a2a-b22d-d8448862f595",
  "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
  "assignment_id": "41d58896-14a4-4569-8e08-2fe1ca0c4afd",
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
  "arrived_at": "2026-10-28T07:41:32.413394Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c52ba12e-b897-4a2a-b22d-d8448862f595/start` → **200**

```json
{
  "command_id": "03a6b5e6-2c68-4d6d-a58e-984f6ef85e33",
  "expected_version": 1
}
```

```json
{
  "id": "c52ba12e-b897-4a2a-b22d-d8448862f595",
  "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
  "assignment_id": "41d58896-14a4-4569-8e08-2fe1ca0c4afd",
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
  "arrived_at": "2026-10-28T07:41:32.413394Z",
  "started_at": "2026-10-28T07:41:32.452673Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:32Z",
    "sequence": 1793173292530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:32.499189Z",
  "last_location_at": "2026-10-28T07:41:32.499189Z",
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
  "device_ref": "sandbox-15211"
}
```

```json
{
  "challenge_id": "75ee8319-a852-4499-95ba-10bfdb3bef92",
  "expires_at": "2026-10-28T07:46:32.525487283Z",
  "resend_available_at": "2026-10-28T07:41:33.525487283Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "255067",
  "sent_at": "2026-10-28T07:41:32.528026999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75ee8319-a852-4499-95ba-10bfdb3bef92",
  "code": "255067",
  "device_ref": "sandbox-15211"
}
```

```json
{
  "session_id": "8a0365c5-a0a2-4cea-8eb3-fd83df5de645",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE5MiwiaWF0IjoxNzkzMTczMjkyLCJqdGkiOiJkZDZiNTYwZi1iNWQxLTQ4YjgtYjNmYi03YzczYWM1NzQ5YzEiLCJzaWQiOiI4YTAzNjVjNS1hMGEyLTRjZWEtOGViMy1mZDgzZGY1ZGU2NDUifQ.0V0DYktXM7Z4O6DECsgTD-k3qJbwtcvBLIEgnuCPkNI",
  "access_expires_at": "2026-10-28T07:56:32.584414592Z",
  "refresh_token": "jYiqIL8H0UBYz61vq9cUYfWRnL1_bLJf5eLO0bQx3u8",
  "refresh_expires_at": "2026-11-27T07:41:32.583800715Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:40:54.560022Z",
  "last_location_at": "2026-10-28T07:40:54.560022Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/45f138b1-f48d-4c68-9870-db2a8e564797/handover` → **200**

```json
{
  "command_id": "e7555368-b7fa-4b42-845e-ad43f64b3690",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:40:54.560022Z",
  "last_location_at": "2026-10-28T07:40:54.560022Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/45f138b1-f48d-4c68-9870-db2a8e564797/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:32Z",
    "sequence": 1793173292669
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:41:32.688587Z",
  "last_location_at": "2026-10-28T07:41:32.688587Z",
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
  "session_id": "d21d4b73-47a5-4fda-96c7-26d72e26ea7d",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTMsImlhdCI6MTc5MzE3MzI5MywianRpIjoiZDViZjA5YjAtYTJlYy00MTM3LTlmMzAtNWYwNjZhOWQxZDEzIiwic2lkIjoiZDIxZDRiNzMtNDdhNS00ZmRhLTk2YzctMjZkNzJlMjZlYTdkIn0.5thtZ6W3UhxNXAhStqq4QNDXuk3tHU_C2ArMtjespJg",
  "access_expires_at": "2026-10-28T07:56:33.011630669Z",
  "refresh_token": "MYliKj8Xv8o2rzHN_GLKgF7ca9WGOjpgaOoPvPYaCC4",
  "refresh_expires_at": "2026-10-28T19:41:33.01097875Z",
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
  "session_id": "c3f1e7fc-5f5f-48d8-826d-4ed2afed27c7",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTMsImlhdCI6MTc5MzE3MzI5MywianRpIjoiZDA0MmZhNzItMWVmZC00MmMyLWI3ZjUtMTViMjgyMzdhNTE5Iiwic2lkIjoiYzNmMWU3ZmMtNWY1Zi00OGQ4LTgyNmQtNGVkMmFmZWQyN2M3In0.2Z_JjNIvz_SAgeCxbhV9n9GupJvhIjIHYiyo_0aDd0E",
  "access_expires_at": "2026-10-28T07:56:33.338037031Z",
  "refresh_token": "mph2x-S8c4WTnsmYD2gRGAK9mAYRk8P4gRR9VF4eTQY",
  "refresh_expires_at": "2026-10-28T19:41:33.337365642Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d` → **200**

```json
{
  "id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
  "short_number": 7,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3fc83f41-8836-49a5-8fff-e0a66c52adac",
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
    "id": "41d58896-14a4-4569-8e08-2fe1ca0c4afd",
    "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c52ba12e-b897-4a2a-b22d-d8448862f595",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T07:41:32.247005Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d/interrupt` → **200**

```json
{
  "command_id": "3601d896-0752-464e-862e-9cd5635416c4",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
    "short_number": 7,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "3fc83f41-8836-49a5-8fff-e0a66c52adac",
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
      "id": "41d58896-14a4-4569-8e08-2fe1ca0c4afd",
      "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "c52ba12e-b897-4a2a-b22d-d8448862f595",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T07:41:32.247005Z",
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
    "id": "4c834d00-0034-42eb-8026-496b7d13969a",
    "short_number": 8,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "3fc83f41-8836-49a5-8fff-e0a66c52adac",
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
    "id": "5e5f8ddc-338a-4337-a4cc-04f51106dcb1",
    "order_id": "4c834d00-0034-42eb-8026-496b7d13969a",
    "expires_at": "2026-10-28T07:41:48.419173Z",
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

`POST /api/driver/v1/offers/5e5f8ddc-338a-4337-a4cc-04f51106dcb1/accept` → **200**

```json
{
  "command_id": "34756bb0-0967-415f-a18d-6ca4873d70c7"
}
```

```json
{
  "id": "2d5d97c3-a205-4110-aede-8e10bf5a0472",
  "order_id": "4c834d00-0034-42eb-8026-496b7d13969a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ed791d5d-6c72-45c5-bd9c-73f9e637f2d6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ed791d5d-6c72-45c5-bd9c-73f9e637f2d6",
  "order_id": "4c834d00-0034-42eb-8026-496b7d13969a",
  "assignment_id": "2d5d97c3-a205-4110-aede-8e10bf5a0472",
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
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:41:32.688587Z",
  "last_location_at": "2026-10-28T07:41:32.688587Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/45f138b1-f48d-4c68-9870-db2a8e564797/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:33Z",
    "sequence": 1793173293549
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:41:33.56786Z",
  "last_location_at": "2026-10-28T07:41:33.56786Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ed791d5d-6c72-45c5-bd9c-73f9e637f2d6/arrive` → **200**

```json
{
  "command_id": "372836ca-3f81-4709-8a3c-9e9f82e811ac",
  "expected_version": 0
}
```

```json
{
  "id": "ed791d5d-6c72-45c5-bd9c-73f9e637f2d6",
  "order_id": "4c834d00-0034-42eb-8026-496b7d13969a",
  "assignment_id": "2d5d97c3-a205-4110-aede-8e10bf5a0472",
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
  "arrived_at": "2026-10-28T07:41:33.604412Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ed791d5d-6c72-45c5-bd9c-73f9e637f2d6/start` → **200**

```json
{
  "command_id": "6113912e-1c4b-4cad-af3d-cfd981721f2b",
  "expected_version": 1
}
```

```json
{
  "id": "ed791d5d-6c72-45c5-bd9c-73f9e637f2d6",
  "order_id": "4c834d00-0034-42eb-8026-496b7d13969a",
  "assignment_id": "2d5d97c3-a205-4110-aede-8e10bf5a0472",
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
  "arrived_at": "2026-10-28T07:41:33.604412Z",
  "started_at": "2026-10-28T07:41:33.643178Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ed791d5d-6c72-45c5-bd9c-73f9e637f2d6/complete` → **200**

```json
{
  "command_id": "217ddd43-2999-4355-b665-1c7b556d68c1",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:41:33Z"
}
```

```json
{
  "id": "ed791d5d-6c72-45c5-bd9c-73f9e637f2d6",
  "order_id": "4c834d00-0034-42eb-8026-496b7d13969a",
  "assignment_id": "2d5d97c3-a205-4110-aede-8e10bf5a0472",
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
  "arrived_at": "2026-10-28T07:41:33.604412Z",
  "started_at": "2026-10-28T07:41:33.643178Z",
  "completed_at": "2026-10-28T07:41:33.685861Z",
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
    "id": "4c834d00-0034-42eb-8026-496b7d13969a",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-28T07:41:33.408632Z",
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
    "id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
    "short_number": 7,
    "status": "CANCELLED",
    "created_at": "2026-10-28T07:41:32.247005Z",
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

`GET /api/operator/v1/orders/4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T07:41:32.247611Z",
      "actor": {
        "type": "CLIENT",
        "id": "3fc83f41-8836-49a5-8fff-e0a66c52adac",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
        "quote_id": "65c8ed4b-9e4c-4e49-9dd8-82731af4e7bf",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T07:41:32.249705Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
        "attempt_id": "e458dfcf-cf46-4ee1-9368-120e7088e010",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T07:41:32.256377Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8001e5ec-cfab-44a1-9b2c-6e0bf98a2f85",
        "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T07:41:32.315621Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8001e5ec-cfab-44a1-9b2c-6e0bf98a2f85",
        "order_id": "4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "41d58896-14a4-4569-8e08-2fe1ca0c4afd"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 4ae7dbbd-8fcb-4a27-bf7f-36f2e8345e3d, follow-up 4c834d00-0034-42eb-8026-496b7d13969a.

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
  "session_id": "f0a47447-f0e7-4803-bd56-6fecca15de99",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTcsImlhdCI6MTc5MzE3MzI5NywianRpIjoiNjYwYjM1NTgtM2NlYi00OTUzLTlkZTMtMDMzMzZlYmY5YzFjIiwic2lkIjoiZjBhNDc0NDctZjBlNy00ODAzLWJkNTYtNmZlY2NhMTVkZTk5In0.p2mA8PA30F0ajc0rSOGJ0WR4BBGSq6YI22dEKt_S2LE",
  "access_expires_at": "2026-10-28T07:56:37.107426726Z",
  "refresh_token": "h6SprMSS7W01JqM_3htq-kfvZLfCTtYe5L3L4TJ4F1A",
  "refresh_expires_at": "2026-10-28T19:41:37.106804923Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "1d286c00-5929-40e7-9188-3e90c729ad51",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T07:41:37Z"
}
```

```json
{
  "id": "47c3cbf3-465b-4088-90f6-2e654b308720",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T07:41:37Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/47c3cbf3-465b-4088-90f6-2e654b308720/publish` → **200**

```json
{
  "command_id": "99cdd978-8e84-44ea-bdd3-03d9aae98d51",
  "expected_version": 0
}
```

```json
{
  "id": "47c3cbf3-465b-4088-90f6-2e654b308720",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T07:41:37.212422Z",
  "published_at": "2026-10-28T07:41:37.212422Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "47c3cbf3-465b-4088-90f6-2e654b308720",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T07:41:37.212422Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634345777",
  "device_ref": "sandbox-27650"
}
```

```json
{
  "challenge_id": "df6dcc98-39b8-4fed-b1fa-7de68dca8409",
  "expires_at": "2026-10-28T07:46:37.273819483Z",
  "resend_available_at": "2026-10-28T07:41:38.273819483Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634345777` → **200**

```json
{
  "phone": "+380634345777",
  "audience": "CLIENT",
  "code": "668214",
  "sent_at": "2026-10-28T07:41:37.276325377Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df6dcc98-39b8-4fed-b1fa-7de68dca8409",
  "code": "668214",
  "device_ref": "sandbox-27650"
}
```

```json
{
  "session_id": "dc5d2fb7-de6b-4b5a-8488-69c5afc8f99c",
  "subject": {
    "type": "CLIENT",
    "id": "014b408d-5b91-4eb2-9c5e-e31ed1638ef7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTRiNDA4ZC01YjkxLTRlYjItOWM1ZS1lMzFlZDE2MzhlZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTk3LCJpYXQiOjE3OTMxNzMyOTcsImp0aSI6IjQ1Nzg3OTBkLTczMjQtNGQ1YS1iZjM4LTkxZWUwYjk5ODM0NiIsInNpZCI6ImRjNWQyZmI3LWRlNmItNGI1YS04NDg4LTY5YzVhZmM4Zjk5YyJ9.u6C0v5N4Vm7i5tkS66ld79QfhWZdG5m_JJzvJkDLIqM",
  "access_expires_at": "2026-10-28T07:56:37.330045595Z",
  "refresh_token": "cshYx3wqVkfEuGEvZ-FQZIj0W3brptufuqnvMqiu-cc",
  "refresh_expires_at": "2026-11-27T07:41:37.329482682Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "47c3cbf3-465b-4088-90f6-2e654b308720",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T07:41:37.212422Z",
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
  "command_id": "68dab2ed-ce2b-4747-8854-10aea6549791",
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
  "id": "4544b1e0-d2bb-4aa0-93c7-3ceb9ebb45e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:46:37.389603Z",
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
  "command_id": "765debed-37e6-4190-9fc1-855e824dc20a",
  "quote_id": "4544b1e0-d2bb-4aa0-93c7-3ceb9ebb45e5",
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
  "correlation_id": "a9f692b2-971c-4f81-9a83-ad422a9070be"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "8e497d20-fea1-428c-9298-0d0662f93139",
  "version_id": "47c3cbf3-465b-4088-90f6-2e654b308720",
  "language": "uk"
}
```

```json
{
  "version_id": "47c3cbf3-465b-4088-90f6-2e654b308720",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T07:41:37.461351Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6817efff-d1bf-4297-814b-87295b20f70e",
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
  "id": "7f638e16-483d-46cb-8c4e-684c117add84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T07:46:37.498175Z",
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
  "command_id": "4e7093c5-1fc4-4a20-ac4d-880f38218845",
  "quote_id": "7f638e16-483d-46cb-8c4e-684c117add84",
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
  "id": "4e4ea69b-ce13-4850-beac-805ddfda4ff0",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "014b408d-5b91-4eb2-9c5e-e31ed1638ef7",
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
  "created_at": "2026-10-28T07:41:37.532578Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4e4ea69b-ce13-4850-beac-805ddfda4ff0` → **200**

```json
{
  "id": "4e4ea69b-ce13-4850-beac-805ddfda4ff0",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "014b408d-5b91-4eb2-9c5e-e31ed1638ef7",
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
  "created_at": "2026-10-28T07:41:37.532578Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4e4ea69b-ce13-4850-beac-805ddfda4ff0/cancel` → **200**

```json
{
  "command_id": "fb12a201-a86f-4451-b726-f3c81b7dc266",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4e4ea69b-ce13-4850-beac-805ddfda4ff0",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "014b408d-5b91-4eb2-9c5e-e31ed1638ef7",
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
  "created_at": "2026-10-28T07:41:37.532578Z",
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

## A published version never changes

`POST /api/admin/v1/legal-documents/47c3cbf3-465b-4088-90f6-2e654b308720` → **409**

```json
{
  "command_id": "0849ef62-cd14-4da7-8cd8-5d7d2e900156",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T07:41:37Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/47c3cbf3-465b-4088-90f6-2e654b308720",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3623efa5-e8ee-4edf-a94f-7b4208a73685"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2768b0d1-4a47-4c63-b731-12cd6c8f6182",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T07:41:37Z"
}
```

```json
{
  "id": "a1a7a752-06eb-4a42-846c-57a0af5c8c7b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T07:41:37Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/a1a7a752-06eb-4a42-846c-57a0af5c8c7b/publish` → **200**

```json
{
  "command_id": "e005776f-86b3-41af-98b0-57244461ccc6",
  "expected_version": 0
}
```

```json
{
  "id": "a1a7a752-06eb-4a42-846c-57a0af5c8c7b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T07:41:37.722016Z",
  "published_at": "2026-10-28T07:41:37.722016Z",
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
  "device_ref": "sandbox-31863"
}
```

```json
{
  "challenge_id": "2cbcab72-5043-40ac-866c-a0c5683e160d",
  "expires_at": "2026-10-28T07:46:37.759363149Z",
  "resend_available_at": "2026-10-28T07:41:38.759363149Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "963079",
  "sent_at": "2026-10-28T07:41:37.761560088Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2cbcab72-5043-40ac-866c-a0c5683e160d",
  "code": "963079",
  "device_ref": "sandbox-31863"
}
```

```json
{
  "session_id": "d5571133-0e9e-48dc-9053-4ad9b8436d43",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE5NywiaWF0IjoxNzkzMTczMjk3LCJqdGkiOiJiNGRmYWM3Zi1hN2VhLTRkOTAtOTQ3Yi03ZWY2MTQ1MzI0ZGYiLCJzaWQiOiJkNTU3MTEzMy0wZTllLTQ4ZGMtOTA1My00YWQ5Yjg0MzZkNDMifQ.IfrI40sgftXQGHAZP_5SoaDGAWl-8h5RYsPiGzoXUGE",
  "access_expires_at": "2026-10-28T07:56:37.815864484Z",
  "refresh_token": "68SJ_VyQ4MyCHsro0RIYfpT2wc-7_9e9NIcbuTp5Pbw",
  "refresh_expires_at": "2026-11-27T07:41:37.81512259Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:41:33.56786Z",
  "last_location_at": "2026-10-28T07:41:33.56786Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/45f138b1-f48d-4c68-9870-db2a8e564797/handover` → **200**

```json
{
  "command_id": "7e33e06d-1e45-4b37-a040-732464c6fda0",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:41:33.56786Z",
  "last_location_at": "2026-10-28T07:41:33.56786Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/45f138b1-f48d-4c68-9870-db2a8e564797/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:37Z",
    "sequence": 1793173297899
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:41:37.918453Z",
  "last_location_at": "2026-10-28T07:41:37.918453Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679405721",
  "device_ref": "sandbox-18760"
}
```

```json
{
  "challenge_id": "47926186-cd78-45b3-bf14-deb255d58b8f",
  "expires_at": "2026-10-28T07:46:37.945370186Z",
  "resend_available_at": "2026-10-28T07:41:38.945370186Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679405721` → **200**

```json
{
  "phone": "+380679405721",
  "audience": "CLIENT",
  "code": "499400",
  "sent_at": "2026-10-28T07:41:37.947852202Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47926186-cd78-45b3-bf14-deb255d58b8f",
  "code": "499400",
  "device_ref": "sandbox-18760"
}
```

```json
{
  "session_id": "df41bb47-8d35-4efe-b199-fdacd8d88efe",
  "subject": {
    "type": "CLIENT",
    "id": "8cf27193-3439-4996-bc97-d870d253fe94"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Y2YyNzE5My0zNDM5LTQ5OTYtYmM5Ny1kODcwZDI1M2ZlOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MTk4LCJpYXQiOjE3OTMxNzMyOTgsImp0aSI6IjUxODk0OGE5LTVlNzMtNGRjNS1hMjg5LTA1YzQ3YjQzMWY5NyIsInNpZCI6ImRmNDFiYjQ3LThkMzUtNGVmZS1iMTk5LWZkYWNkOGQ4OGVmZSJ9.mquxeV7uaLVe6BxlmxTIixm6Bay6_V4o7idur0R5Bzw",
  "access_expires_at": "2026-10-28T07:56:38.00217375Z",
  "refresh_token": "Vsu42W4NXPNwN5J6EktgEU_AUGghrC-uW79edN6fwek",
  "refresh_expires_at": "2026-11-27T07:41:38.001640943Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7720a0e0-650d-42c9-88af-afbf476cc58d",
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
  "id": "3ce7de72-d99d-4307-af7c-d12fe2a3baac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:38.035571Z",
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
  "command_id": "f3c26943-a4e6-4066-805d-91ebcfc9a68f",
  "quote_id": "3ce7de72-d99d-4307-af7c-d12fe2a3baac",
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
    "phone": "+380675201323"
  }
}
```

```json
{
  "id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
  "created_at": "2026-10-28T07:41:38.074198Z",
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
    "id": "023cf402-0aff-41fb-b43c-49dbbfbab21d",
    "order_id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
    "expires_at": "2026-10-28T07:41:53.077905Z",
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

`POST /api/driver/v1/offers/023cf402-0aff-41fb-b43c-49dbbfbab21d/accept` → **200**

```json
{
  "command_id": "a2d66e5f-5f8d-43aa-899a-3c711428e405"
}
```

```json
{
  "id": "36fadabf-d452-44fd-9d6c-2cd2057ef508",
  "order_id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "44e15bc1-b21f-40de-af4b-aa860afcab1e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44e15bc1-b21f-40de-af4b-aa860afcab1e",
  "order_id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
  "assignment_id": "36fadabf-d452-44fd-9d6c-2cd2057ef508",
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
    "phone": "+380675201323"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8930dfa8-b325-42a7-8003-2efe4402d5f8",
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
  "id": "c559f080-74ec-4832-bf09-a7ca25bf4431",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:38.213112Z",
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
  "command_id": "fb01a9ad-55ae-4466-b116-643e05183870",
  "quote_id": "c559f080-74ec-4832-bf09-a7ca25bf4431",
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
  "id": "dfb715f6-83eb-418e-8da3-dd7c969d267e",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
  "created_at": "2026-10-28T07:41:38.259983Z",
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
  "command_id": "bf3f4e1e-6cb4-4c84-83aa-0346e0e1f6ca",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T10:41:38Z"
}
```

```json
{
  "id": "a6d7cf63-6ab3-42d4-9e79-7e8c9a5a08a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:38.317076Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:41:38Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8b214790-a4c5-422a-a984-f2d0b914866c",
  "quote_id": "a6d7cf63-6ab3-42d4-9e79-7e8c9a5a08a7",
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
  "pickup_at": "2026-10-28T10:41:38Z"
}
```

```json
{
  "id": "eed6e16e-6c0f-43b5-9241-35021d4527b6",
  "short_number": 12,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
  "created_at": "2026-10-28T07:41:38.3579Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:41:38Z",
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
  "command_id": "63a2fbd7-b96b-4612-b0ba-974ce102ce0a",
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
  "id": "c78ca3aa-4a84-4932-b200-0f2e5cdd899d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:38.397351Z",
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
  "command_id": "fdc4ac8d-c70f-45fb-a6d1-cdb81dcf5af9",
  "quote_id": "c78ca3aa-4a84-4932-b200-0f2e5cdd899d",
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
  "correlation_id": "9e72a6f0-96a1-4971-a9e1-3bfb440d4114"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "eed6e16e-6c0f-43b5-9241-35021d4527b6",
      "short_number": 12,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
      "created_at": "2026-10-28T07:41:38.3579Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T10:41:38Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "dfb715f6-83eb-418e-8da3-dd7c969d267e",
      "short_number": 11,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
      "created_at": "2026-10-28T07:41:38.259983Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
      "short_number": 10,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "dfb715f6-83eb-418e-8da3-dd7c969d267e",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
  "created_at": "2026-10-28T07:41:38.259983Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/73c3d1c2-b129-4fd4-8727-f1e5d0b7be06` → **200**

```json
{
  "id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
    "id": "36fadabf-d452-44fd-9d6c-2cd2057ef508",
    "order_id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "44e15bc1-b21f-40de-af4b-aa860afcab1e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T07:41:38.074198Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/73c3d1c2-b129-4fd4-8727-f1e5d0b7be06/cancel` → **200**

```json
{
  "command_id": "f1af169f-8fac-437e-b88e-f995de4f36dd",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
    "id": "36fadabf-d452-44fd-9d6c-2cd2057ef508",
    "order_id": "73c3d1c2-b129-4fd4-8727-f1e5d0b7be06",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "44e15bc1-b21f-40de-af4b-aa860afcab1e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T07:41:38.074198Z",
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

`GET /api/rider/v1/orders/dfb715f6-83eb-418e-8da3-dd7c969d267e` → **200**

```json
{
  "id": "dfb715f6-83eb-418e-8da3-dd7c969d267e",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
  "created_at": "2026-10-28T07:41:38.259983Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/dfb715f6-83eb-418e-8da3-dd7c969d267e/cancel` → **200**

```json
{
  "command_id": "4f58d855-e15a-4ba0-aa3c-233fe4093adc",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dfb715f6-83eb-418e-8da3-dd7c969d267e",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
  "created_at": "2026-10-28T07:41:38.259983Z",
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

`GET /api/rider/v1/orders/eed6e16e-6c0f-43b5-9241-35021d4527b6` → **200**

```json
{
  "id": "eed6e16e-6c0f-43b5-9241-35021d4527b6",
  "short_number": 12,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
  "created_at": "2026-10-28T07:41:38.3579Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:41:38Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/eed6e16e-6c0f-43b5-9241-35021d4527b6/cancel` → **200**

```json
{
  "command_id": "d7b4f8be-8960-4696-a9a3-d323db365e41",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "eed6e16e-6c0f-43b5-9241-35021d4527b6",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8cf27193-3439-4996-bc97-d870d253fe94",
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
  "created_at": "2026-10-28T07:41:38.3579Z",
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
  "pickup_at": "2026-10-28T10:41:38Z",
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
  "session_id": "45f138b1-f48d-4c68-9870-db2a8e564797",
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
  "last_heartbeat_at": "2026-10-28T07:41:37.918453Z",
  "last_location_at": "2026-10-28T07:41:37.918453Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/45f138b1-f48d-4c68-9870-db2a8e564797/close` → **200**

```json
{
  "command_id": "3775258a-00d8-42e2-90d4-16581f9fb650",
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

Done: orders 73c3d1c2-b129-4fd4-8727-f1e5d0b7be06, dfb715f6-83eb-418e-8da3-dd7c969d267e, eed6e16e-6c0f-43b5-9241-35021d4527b6.

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
  "session_id": "d7051a56-f602-4589-b99d-e21f33b4a449",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTksImlhdCI6MTc5MzE3MzI5OSwianRpIjoiOWNkODU2ZjktYzRlYS00ZTJlLThhZGItN2UyYTI0ODAzYzA4Iiwic2lkIjoiZDcwNTFhNTYtZjYwMi00NTg5LWI5OWQtZTIxZjMzYjRhNDQ5In0.tSeaOLZDWJkTL_Po7bPIIm2b8ECqIsCal8Z6ncpDehM",
  "access_expires_at": "2026-10-28T07:56:39.049043976Z",
  "refresh_token": "I-KS4flsrcTUv73FPDUedZPzloHD-3Bt1wvklZWIeqM",
  "refresh_expires_at": "2026-10-28T19:41:39.048444194Z",
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
  "session_id": "3af551b5-2d51-4005-b104-83970299a4e3",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQxOTksImlhdCI6MTc5MzE3MzI5OSwianRpIjoiODlhMmI3M2ItMTUyYS00MjY2LWFhMjctZTU3ZGVkMTVhNGU2Iiwic2lkIjoiM2FmNTUxYjUtMmQ1MS00MDA1LWIxMDQtODM5NzAyOTlhNGUzIn0.RKqZkFXCDTsWF7AbMZXC2OnThWmxrlCV09XqAwjFlpE",
  "access_expires_at": "2026-10-28T07:56:39.373718198Z",
  "refresh_token": "8PXiKCjSKne1Jd01qm3V33sKUDTpV9T9rxxJ8CD249E",
  "refresh_expires_at": "2026-10-28T19:41:39.373150236Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3013"
}
```

```json
{
  "challenge_id": "b82683bb-d2c2-4a96-9e8b-d220dbf1bdc3",
  "expires_at": "2026-10-28T07:46:39.397100786Z",
  "resend_available_at": "2026-10-28T07:41:40.397100786Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "018094",
  "sent_at": "2026-10-28T07:41:39.39926807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b82683bb-d2c2-4a96-9e8b-d220dbf1bdc3",
  "code": "018094",
  "device_ref": "sandbox-3013"
}
```

```json
{
  "session_id": "f823db37-e04f-45a4-ba48-b9d0ddba0fe1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDE5OSwiaWF0IjoxNzkzMTczMjk5LCJqdGkiOiIzYWI0NTJjZS00M2Y2LTQ3NzYtOTY3YS0yZDllZjJkYWU3OWQiLCJzaWQiOiJmODIzZGIzNy1lMDRmLTQ1YTQtYmE0OC1iOWQwZGRiYTBmZTEifQ.6hv7aYLRDkiCxwFhnMy1mRWVBiCtB5Iu5zHI_Hb8gzw",
  "access_expires_at": "2026-10-28T07:56:39.454823295Z",
  "refresh_token": "5D-7R5PsZUcQOzb3joeNCVI6jf9XiE8bSGWx3ZyoUGo",
  "refresh_expires_at": "2026-11-27T07:41:39.454268908Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:32.499189Z",
  "last_location_at": "2026-10-28T07:41:32.499189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/handover` → **200**

```json
{
  "command_id": "93aeb4ed-7b62-4890-be7e-a93d7e252d1a",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:32.499189Z",
  "last_location_at": "2026-10-28T07:41:32.499189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:39Z",
    "sequence": 1793173299537
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:39.555443Z",
  "last_location_at": "2026-10-28T07:41:39.555443Z",
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
  "command_id": "dd1e4316-0e92-49cb-9829-2463b9f0199a",
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
  "effective_at": "2026-10-28T07:41:39.622277Z",
  "changed_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T07:41:39.651128741Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "61b578e7-17da-447c-adb4-61b4169e7ec7",
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
  "id": "0dac64e3-42c1-4fbd-b364-c9a84c9aa7e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:46:39.688873Z",
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
  "command_id": "2f57f4bb-2729-471d-b806-d7c36238cb12",
  "quote_id": "0dac64e3-42c1-4fbd-b364-c9a84c9aa7e8",
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
    "phone": "+3806711130877"
  }
}
```

```json
{
  "id": "42265245-8ff5-4141-84d7-59330045d9ca",
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
  "created_at": "2026-10-28T07:41:39.725622Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130877"
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
    "id": "78e01995-264c-4406-941b-17b8356884cc",
    "order_id": "42265245-8ff5-4141-84d7-59330045d9ca",
    "expires_at": "2026-10-28T07:41:54.729863Z",
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

`POST /api/driver/v1/offers/78e01995-264c-4406-941b-17b8356884cc/accept` → **200**

```json
{
  "command_id": "c92c73e0-4fa3-4d77-9b1a-f96b207b0234"
}
```

```json
{
  "id": "c71d5d32-de3d-4d82-8346-824bcae8119c",
  "order_id": "42265245-8ff5-4141-84d7-59330045d9ca",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "90f9c424-e48f-45bb-9661-029ec036e482",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "90f9c424-e48f-45bb-9661-029ec036e482",
  "order_id": "42265245-8ff5-4141-84d7-59330045d9ca",
  "assignment_id": "c71d5d32-de3d-4d82-8346-824bcae8119c",
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
    "phone": "+3806711130877"
  }
}
```

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:39Z",
    "sequence": 1793173299830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:39.848593Z",
  "last_location_at": "2026-10-28T07:41:39.848593Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/90f9c424-e48f-45bb-9661-029ec036e482/arrive` → **200**

```json
{
  "command_id": "0ebd1b38-fb94-493d-89fc-5311f57b4c46",
  "expected_version": 0
}
```

```json
{
  "id": "90f9c424-e48f-45bb-9661-029ec036e482",
  "order_id": "42265245-8ff5-4141-84d7-59330045d9ca",
  "assignment_id": "c71d5d32-de3d-4d82-8346-824bcae8119c",
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
  "arrived_at": "2026-10-28T07:41:39.885189Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711130877"
  }
}
```

`POST /api/driver/v1/trips/90f9c424-e48f-45bb-9661-029ec036e482/start` → **200**

```json
{
  "command_id": "0488d55f-db21-4df3-a972-24b916e49ac1",
  "expected_version": 1
}
```

```json
{
  "id": "90f9c424-e48f-45bb-9661-029ec036e482",
  "order_id": "42265245-8ff5-4141-84d7-59330045d9ca",
  "assignment_id": "c71d5d32-de3d-4d82-8346-824bcae8119c",
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
  "arrived_at": "2026-10-28T07:41:39.885189Z",
  "started_at": "2026-10-28T07:41:39.924832Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711130877"
  }
}
```

`POST /api/driver/v1/trips/90f9c424-e48f-45bb-9661-029ec036e482/complete` → **200**

```json
{
  "command_id": "0ac8a5b4-b154-40fd-9919-7999027d09ee",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:41:39Z",
  "cash_received": true
}
```

```json
{
  "id": "90f9c424-e48f-45bb-9661-029ec036e482",
  "order_id": "42265245-8ff5-4141-84d7-59330045d9ca",
  "assignment_id": "c71d5d32-de3d-4d82-8346-824bcae8119c",
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
  "arrived_at": "2026-10-28T07:41:39.885189Z",
  "started_at": "2026-10-28T07:41:39.924832Z",
  "completed_at": "2026-10-28T07:41:39.96756Z",
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
  "command_id": "608798e0-36d5-4fee-8e3e-752c602226b1",
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
  "id": "3d512eee-80b6-422d-a90d-b5ca999139f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:46:40.015924Z",
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
  "command_id": "6ee01746-b25a-422d-b848-a6b306c76315",
  "quote_id": "3d512eee-80b6-422d-a90d-b5ca999139f2",
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
    "phone": "+3806711131938"
  }
}
```

```json
{
  "id": "ad0a9080-8ba2-4590-a430-0d1693ffb3d8",
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
  "created_at": "2026-10-28T07:41:40.053142Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131938"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ad0a9080-8ba2-4590-a430-0d1693ffb3d8` → **200**

```json
{
  "id": "ad0a9080-8ba2-4590-a430-0d1693ffb3d8",
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
  "created_at": "2026-10-28T07:41:40.053142Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131938"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ad0a9080-8ba2-4590-a430-0d1693ffb3d8/cancel` → **200**

```json
{
  "command_id": "fc5cc06b-04f3-41e1-91a7-e239ebd69789",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ad0a9080-8ba2-4590-a430-0d1693ffb3d8",
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
  "created_at": "2026-10-28T07:41:40.053142Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131938"
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
  "staff_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T07:41:40.123725Z",
  "last_entries": [
    {
      "order_id": "ad0a9080-8ba2-4590-a430-0d1693ffb3d8",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T07:41:40.123725Z"
    },
    {
      "order_id": "42265245-8ff5-4141-84d7-59330045d9ca",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T07:41:39.973722Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8385d8eb-2343-4d65-bc12-a6b5298ab50f",
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
  "last_heartbeat_at": "2026-10-28T07:41:39.848593Z",
  "last_location_at": "2026-10-28T07:41:39.848593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8385d8eb-2343-4d65-bc12-a6b5298ab50f/close` → **200**

```json
{
  "command_id": "e2b1cc5f-800d-456e-b9f4-810ecdddfe46",
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

Done: operator bonus for fulfilled 42265245-8ff5-4141-84d7-59330045d9ca and operator-fault cancellation ad0a9080-8ba2-4590-a430-0d1693ffb3d8.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673562489",
  "device_ref": "sandbox-30609"
}
```

```json
{
  "challenge_id": "7dae3cea-4fcc-4a10-a185-42a267f9574e",
  "expires_at": "2026-10-28T07:46:42.284103356Z",
  "resend_available_at": "2026-10-28T07:41:43.284103356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673562489` → **200**

```json
{
  "phone": "+380673562489",
  "audience": "CLIENT",
  "code": "295968",
  "sent_at": "2026-10-28T07:41:42.286574327Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676700304",
  "device_ref": "sandbox-16680",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c6f49501-67c1-4629-ac6b-39417e2806b0",
  "expires_at": "2026-10-28T07:46:42.342099651Z",
  "resend_available_at": "2026-10-28T07:41:43.342099651Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676700304` → **200**

```json
{
  "phone": "+380676700304",
  "audience": "CLIENT",
  "code": "430697",
  "sent_at": "2026-10-28T07:41:42.344378222Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676690000",
  "device_ref": "sandbox-7486"
}
```

```json
{
  "challenge_id": "661e8a85-2936-4db5-b4ba-02b258f29049",
  "expires_at": "2026-10-28T07:46:42.396335138Z",
  "resend_available_at": "2026-10-28T07:41:43.396335138Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676690000` → **200**

```json
{
  "phone": "+380676690000",
  "audience": "CLIENT",
  "code": "748931",
  "sent_at": "2026-10-28T07:41:42.39941278Z",
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
  "session_id": "a1347d94-dbb3-4c1a-bcee-40bcf9db65a0",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMDIsImlhdCI6MTc5MzE3MzMwMiwianRpIjoiZTM4MTU3MjAtZGIxNi00YTViLTg0ZTMtNDhhZTFmYTg3ZWI5Iiwic2lkIjoiYTEzNDdkOTQtZGJiMy00YzFhLWJjZWUtNDBiY2Y5ZGI2NWEwIn0.h_X5aVKjnnOug4uLtbLgbZtgpj5INmU6OpNQYHHHgOg",
  "access_expires_at": "2026-10-28T07:56:42.746862925Z",
  "refresh_token": "xNWkGfB8v4DzE0nKs85Uf4tsLY1AkrWLXyNSebna63c",
  "refresh_expires_at": "2026-10-28T19:41:42.746251612Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676690000` → **200**

```json
{
  "deliveries": [
    {
      "id": "32b979b3-4c61-4cb1-9592-ae1b25dcf1d5",
      "challenge_id": "661e8a85-2936-4db5-b4ba-02b258f29049",
      "phone": "+380676690000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d79bbab2-7ab3-437d-ab36-1505063504d8",
      "error": null,
      "attempted_at": "2026-10-28T07:41:42.399614Z"
    },
    {
      "id": "a646b91e-2e63-4a9c-b7d8-7e396cf9ced0",
      "challenge_id": "661e8a85-2936-4db5-b4ba-02b258f29049",
      "phone": "+380676690000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T07:41:42.398876Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676690000` → **200**

```json
{
  "phone": "+380676690000",
  "audience": "CLIENT",
  "code": "748931",
  "sent_at": "2026-10-28T07:41:42.39941278Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676700304` → **200**

```json
{
  "deliveries": [
    {
      "id": "b0b81011-d8bc-4bed-aef9-03afe4b0da58",
      "challenge_id": "c6f49501-67c1-4629-ac6b-39417e2806b0",
      "phone": "+380676700304",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c588199c-c04d-4f67-9817-4e6b56fa522e",
      "error": null,
      "attempted_at": "2026-10-28T07:41:42.344545Z"
    }
  ]
}
```

Done: SMS to +380673562489, a call to +380676700304, SMS then a call to +380676690000.

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
  "session_id": "820f01fd-3efe-498a-b006-8d3159a3b69b",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMDMsImlhdCI6MTc5MzE3MzMwMywianRpIjoiODdmZmFiMTQtOGU3Yi00YWUyLWJkMjItYjJkNDUxMTZiY2ZiIiwic2lkIjoiODIwZjAxZmQtM2VmZS00OThhLWIwMDYtOGQzMTU5YTNiNjliIn0.ZOYmEBcsx-peBHv4lIdA962qqWlXPMM1LNZtcuwPdK4",
  "access_expires_at": "2026-10-28T07:56:43.171359512Z",
  "refresh_token": "Qibt-9FPWXkJP8wXaHvHu-A3t6puA5q40ghp42CZfrQ",
  "refresh_expires_at": "2026-10-28T19:41:43.170744942Z",
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
  "session_id": "39426905-6d66-4e52-bbca-8ce9212fa70f",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMDMsImlhdCI6MTc5MzE3MzMwMywianRpIjoiYTg2OTcxOTctZWU4MC00Nzk0LTkzMTAtYzE4Mzg1YjJjZjEzIiwic2lkIjoiMzk0MjY5MDUtNmQ2Ni00ZTUyLWJiY2EtOGNlOTIxMmZhNzBmIn0.0RilcIfhUuHDtXtDg9BwpdesxFGc7ki8v25RcFLylZ0",
  "access_expires_at": "2026-10-28T07:56:43.494013492Z",
  "refresh_token": "Ldal7p1r3zMov1ebZSoG5VGDNRX9YbZ670tYXZ2CgOY",
  "refresh_expires_at": "2026-10-28T19:41:43.493385106Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
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

`POST /api/admin/v1/staff-extensions/d68ae6b1-4ce6-449d-9dfb-cc079f0e5153` → **200**

```json
{
  "command_id": "a1ec7a73-73a3-4b9a-a6e0-8ca20e6d2179",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "1f30eebe-edc7-49e7-9af2-ba336cb92476",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T07:41:43.638088Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T07:41:43.638088Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6305d3e4-c2a2-4d81-8390-295f7f2b39af",
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
  "id": "9e5811e2-d4cb-436a-8666-f7c067b877ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:43.702730Z",
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
  "command_id": "b34c8eef-0615-4213-a934-96a1348f49de",
  "quote_id": "9e5811e2-d4cb-436a-8666-f7c067b877ce",
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
    "phone": "+380670456436"
  }
}
```

```json
{
  "id": "7f78e355-ec36-4616-aab7-f4d8d1fca797",
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
  "created_at": "2026-10-28T07:41:43.741902Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670456436"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/7f78e355-ec36-4616-aab7-f4d8d1fca797/calls` → **201**

```json
{
  "command_id": "857bc4a0-572d-4914-9b66-14fbf821bd80",
  "to": "CALLER"
}
```

```json
{
  "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "order_ids": [
    "7f78e355-ec36-4616-aab7-f4d8d1fca797"
  ],
  "started_at": "2026-10-28T07:41:43.791073Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/7f78e355-ec36-4616-aab7-f4d8d1fca797/calls` → **201**

```json
{
  "command_id": "857bc4a0-572d-4914-9b66-14fbf821bd80",
  "to": "CALLER"
}
```

```json
{
  "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "order_ids": [
    "7f78e355-ec36-4616-aab7-f4d8d1fca797"
  ],
  "started_at": "2026-10-28T07:41:43.791073Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380670456436",
    "at": "2026-10-28T07:41:43.794268026Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.4386",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "6c667bf1-1298-4fb9-a1ea-510bab26e788"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=7f78e355-ec36-4616-aab7-f4d8d1fca797` → **200**

```json
{
  "calls": [
    {
      "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [
        "7f78e355-ec36-4616-aab7-f4d8d1fca797"
      ],
      "started_at": "2026-10-28T07:41:43.791073Z",
      "answered_at": "2026-10-28T07:41:43.931621Z",
      "ended_at": "2026-10-28T07:41:43.953193Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7f78e355-ec36-4616-aab7-f4d8d1fca797` → **200**

```json
{
  "calls": [
    {
      "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [
        "7f78e355-ec36-4616-aab7-f4d8d1fca797"
      ],
      "started_at": "2026-10-28T07:41:43.791073Z",
      "answered_at": "2026-10-28T07:41:43.931621Z",
      "ended_at": "2026-10-28T07:41:43.953193Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7f78e355-ec36-4616-aab7-f4d8d1fca797` → **200**

```json
{
  "calls": [
    {
      "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [
        "7f78e355-ec36-4616-aab7-f4d8d1fca797"
      ],
      "started_at": "2026-10-28T07:41:43.791073Z",
      "answered_at": "2026-10-28T07:41:43.931621Z",
      "ended_at": "2026-10-28T07:41:43.953193Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7f78e355-ec36-4616-aab7-f4d8d1fca797` → **200**

```json
{
  "calls": [
    {
      "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [
        "7f78e355-ec36-4616-aab7-f4d8d1fca797"
      ],
      "started_at": "2026-10-28T07:41:43.791073Z",
      "answered_at": "2026-10-28T07:41:43.931621Z",
      "ended_at": "2026-10-28T07:41:43.953193Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7f78e355-ec36-4616-aab7-f4d8d1fca797` → **200**

```json
{
  "calls": [
    {
      "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [
        "7f78e355-ec36-4616-aab7-f4d8d1fca797"
      ],
      "started_at": "2026-10-28T07:41:43.791073Z",
      "answered_at": "2026-10-28T07:41:43.931621Z",
      "ended_at": "2026-10-28T07:41:43.953193Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7f78e355-ec36-4616-aab7-f4d8d1fca797` → **200**

```json
{
  "calls": [
    {
      "id": "6c667bf1-1298-4fb9-a1ea-510bab26e788",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "order_ids": [
        "7f78e355-ec36-4616-aab7-f4d8d1fca797"
      ],
      "started_at": "2026-10-28T07:41:43.791073Z",
      "answered_at": "2026-10-28T07:41:43.931621Z",
      "ended_at": "2026-10-28T07:41:43.953193Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T07:41:52.495073Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/7f78e355-ec36-4616-aab7-f4d8d1fca797` → **200**

```json
{
  "id": "7f78e355-ec36-4616-aab7-f4d8d1fca797",
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
  "created_at": "2026-10-28T07:41:43.741902Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670456436"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7f78e355-ec36-4616-aab7-f4d8d1fca797/cancel` → **200**

```json
{
  "command_id": "be140129-acc9-4547-b681-b05abe3a3091",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7f78e355-ec36-4616-aab7-f4d8d1fca797",
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
  "created_at": "2026-10-28T07:41:43.741902Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670456436"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
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
  "command_id": "b532635b-64c4-43c4-a200-1eb3aa3f323c",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T07:41:54.26019Z",
  "extension": "101"
}
```

Done: outgoing call 6c667bf1-1298-4fb9-a1ea-510bab26e788 from order 7f78e355-ec36-4616-aab7-f4d8d1fca797, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636101871",
  "device_ref": "sandbox-26882"
}
```

```json
{
  "challenge_id": "2f69d75a-0a63-4b81-b849-97bf2547e00f",
  "expires_at": "2026-10-28T07:46:54.304457559Z",
  "resend_available_at": "2026-10-28T07:41:55.304457559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636101871` → **200**

```json
{
  "phone": "+380636101871",
  "audience": "CLIENT",
  "code": "755454",
  "sent_at": "2026-10-28T07:41:54.307576389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f69d75a-0a63-4b81-b849-97bf2547e00f",
  "code": "755454",
  "device_ref": "sandbox-26882"
}
```

```json
{
  "session_id": "838c41ac-06d3-4a7f-bf79-4b47e5accdce",
  "subject": {
    "type": "CLIENT",
    "id": "b83d68da-8ebb-4443-a882-5b7012532b94"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODNkNjhkYS04ZWJiLTQ0NDMtYTg4Mi01YjcwMTI1MzJiOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MjE0LCJpYXQiOjE3OTMxNzMzMTQsImp0aSI6ImNiZDA1ZmEzLWZkODMtNDQ0YS1hZWEzLTcwZjVjZjNkYTMwMiIsInNpZCI6IjgzOGM0MWFjLTA2ZDMtNGE3Zi1iZjc5LTRiNDdlNWFjY2RjZSJ9.Jbp4354Fc_8dT0TWJKlm71ln_WfoFfF75VyXzhW1Cgc",
  "access_expires_at": "2026-10-28T07:56:54.361656619Z",
  "refresh_token": "HHcS_oULhGa1dxzbjnaTOLIPdo6pIVxdLRXuz9CQEOU",
  "refresh_expires_at": "2026-11-27T07:41:54.361099045Z",
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
  "session_id": "e11a04c2-4bfb-4e94-b348-a3824e9ebb3d",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMTQsImlhdCI6MTc5MzE3MzMxNCwianRpIjoiNjcxMjUyZTYtZDM2NS00Y2NhLWE1MjktMGMxMzZhNmY0Mjg4Iiwic2lkIjoiZTExYTA0YzItNGJmYi00ZTk0LWIzNDgtYTM4MjRlOWViYjNkIn0.UbF109UR_ER2HlC27_biOzPI2TpBNt4OGI2tLoI1M_g",
  "access_expires_at": "2026-10-28T07:56:54.766859895Z",
  "refresh_token": "6bEGRbpvsp0OX-tRiVozXiuLEeXfycIJEQDG3KHcTNg",
  "refresh_expires_at": "2026-10-28T19:41:54.766309094Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380636101871` → **200**

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
  "correlation_id": "205c8c7c-e85c-4255-a044-a104e967d52f"
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
  "session_id": "1403ca39-0080-4e45-81e6-99a12155d27e",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMTUsImlhdCI6MTc5MzE3MzMxNSwianRpIjoiNzQyOTI3MWQtMjkyOC00MTA4LWFkNGEtNjIzMGE1NmQxNTIxIiwic2lkIjoiMTQwM2NhMzktMDA4MC00ZTQ1LTgxZTYtOTlhMTIxNTVkMjdlIn0.g4Vk5CrkPcXedFGPm3iXIZdEEK9KNYBiF57CrzZXJ8Q",
  "access_expires_at": "2026-10-28T07:56:55.158622427Z",
  "refresh_token": "P9tcNMTwciAk1Lg5RR1cfi8YkZqCc7X27ArHLNtWz2A",
  "refresh_expires_at": "2026-10-28T19:41:55.158059695Z",
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
  "command_id": "cff8470d-a461-4fe3-8db2-d256a9463887",
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
  "changed_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T07:41:55.229844548Z"
}
```

## The rider books the airport for 2026-10-28T10:41:54Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600819023",
  "device_ref": "sandbox-16682"
}
```

```json
{
  "challenge_id": "f25cc473-5fc6-4d03-b428-dfffc77fa32f",
  "expires_at": "2026-10-28T07:46:55.262140575Z",
  "resend_available_at": "2026-10-28T07:41:56.262140575Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600819023` → **200**

```json
{
  "phone": "+48600819023",
  "audience": "CLIENT",
  "code": "084241",
  "sent_at": "2026-10-28T07:41:55.265245941Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f25cc473-5fc6-4d03-b428-dfffc77fa32f",
  "code": "084241",
  "device_ref": "sandbox-16682"
}
```

```json
{
  "session_id": "595d9ec0-50bf-47b6-b81b-e1978fb91fe3",
  "subject": {
    "type": "CLIENT",
    "id": "91cdaf51-74f3-4277-9b4c-dfe0c8836106"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWNkYWY1MS03NGYzLTQyNzctOWI0Yy1kZmUwYzg4MzYxMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MjE1LCJpYXQiOjE3OTMxNzMzMTUsImp0aSI6IjYwN2I3ZjNhLTA3ZjgtNGFmOS04ZmNkLWI4YjIyZTdkMGY3MCIsInNpZCI6IjU5NWQ5ZWMwLTUwYmYtNDdiNi1iODFiLWUxOTc4ZmI5MWZlMyJ9.xJlV01LYMq4HLIfHAsHqI4L4hqU7Lze59QnXIckac8w",
  "access_expires_at": "2026-10-28T07:56:55.31941695Z",
  "refresh_token": "cQohrsTuVmv0pc_oBpTcD8kZX1DJswlTZYa4b_FqoL0",
  "refresh_expires_at": "2026-11-27T07:41:55.318847584Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b473c4cf-3ad3-42b5-aa5c-9da700cc5a39",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T10:41:54Z"
}
```

```json
{
  "id": "fb185bec-99c9-41fc-88e9-5c6dd1df7a9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T07:46:55.353925Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T10:41:54Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "62f98afb-8e5e-436b-b3f3-c9704beee516",
  "quote_id": "fb185bec-99c9-41fc-88e9-5c6dd1df7a9b",
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
  "pickup_at": "2026-10-28T10:41:54Z"
}
```

```json
{
  "id": "9b44bf12-d8cb-49c4-9232-406df7a6cfa0",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "91cdaf51-74f3-4277-9b4c-dfe0c8836106",
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
  "created_at": "2026-10-28T07:41:55.392123Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T10:41:54Z",
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
  "device_ref": "sandbox-24710"
}
```

```json
{
  "challenge_id": "40e1a576-4f9f-44b8-a9bb-f543437f147b",
  "expires_at": "2026-10-28T07:46:55.424683242Z",
  "resend_available_at": "2026-10-28T07:41:56.424683242Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "708566",
  "sent_at": "2026-10-28T07:41:55.427054786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40e1a576-4f9f-44b8-a9bb-f543437f147b",
  "code": "708566",
  "device_ref": "sandbox-24710"
}
```

```json
{
  "session_id": "7ab7670c-043f-4ddf-b1d6-7d6e571cb851",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDIxNSwiaWF0IjoxNzkzMTczMzE1LCJqdGkiOiIzYmVkMTkwZC00OTllLTRhYTgtYTk0ZC1jY2QwZjkxYzUyMGMiLCJzaWQiOiI3YWI3NjcwYy0wNDNmLTRkZGYtYjFkNi03ZDZlNTcxY2I4NTEifQ.MNdqsCJMUIx743adW3dbi4aCXZ6dKDD6mrKp5d9moKI",
  "access_expires_at": "2026-10-28T07:56:55.482182795Z",
  "refresh_token": "RVi6W-iax6KWIIvEXxpwg5gMJwk1HMkydWZiiwl_i9U",
  "refresh_expires_at": "2026-11-27T07:41:55.481576832Z",
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
  "command_id": "f1fe517b-cec7-4c5e-9ce7-841100379320",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:55Z",
    "sequence": 1793173315532
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ac270eae-c85c-4a60-94cd-83ace8fc8399",
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
  "last_heartbeat_at": "2026-10-28T07:41:55.549761Z",
  "last_location_at": "2026-10-28T07:41:55.549761Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9b44bf12-d8cb-49c4-9232-406df7a6cfa0",
      "short_number": 16,
      "pickup_at": "2026-10-28T10:41:54Z",
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

`POST /api/driver/v1/preorders/9b44bf12-d8cb-49c4-9232-406df7a6cfa0/reserve` → **200**

```json
{
  "command_id": "e5193987-8921-495e-8314-c1edcf807c04"
}
```

```json
{
  "id": "087080e6-db80-4f3a-9563-0ecd1f01b0d9",
  "state": "RESERVED",
  "order": {
    "order_id": "9b44bf12-d8cb-49c4-9232-406df7a6cfa0",
    "short_number": 16,
    "pickup_at": "2026-10-28T10:41:54Z",
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
  "reserved_at": "2026-10-28T07:41:55.617694Z",
  "confirm_from": "2026-10-28T10:11:54Z",
  "confirm_until": "2026-10-28T10:21:54Z",
  "drop_until": "2026-10-28T09:41:54Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "087080e6-db80-4f3a-9563-0ecd1f01b0d9",
      "state": "RESERVED",
      "order": {
        "order_id": "9b44bf12-d8cb-49c4-9232-406df7a6cfa0",
        "short_number": 16,
        "pickup_at": "2026-10-28T10:41:54Z",
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
      "reserved_at": "2026-10-28T07:41:55.617694Z",
      "confirm_from": "2026-10-28T10:11:54Z",
      "confirm_until": "2026-10-28T10:21:54Z",
      "drop_until": "2026-10-28T09:41:54Z"
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
      "id": "087080e6-db80-4f3a-9563-0ecd1f01b0d9",
      "state": "RESERVED",
      "order": {
        "order_id": "9b44bf12-d8cb-49c4-9232-406df7a6cfa0",
        "short_number": 16,
        "pickup_at": "2026-10-28T10:41:54Z",
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
      "reserved_at": "2026-10-28T07:41:55.617694Z",
      "confirm_from": "2026-10-28T10:11:54Z",
      "confirm_until": "2026-10-28T10:21:54Z",
      "drop_until": "2026-10-28T09:41:54Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/087080e6-db80-4f3a-9563-0ecd1f01b0d9/confirm` → **409**

```json
{
  "command_id": "1eaabd17-65f3-4bb3-aa50-a5f06b9a5379"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/087080e6-db80-4f3a-9563-0ecd1f01b0d9/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0c355425-27ff-4cbc-aa1c-e8057dbaf60a"
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
  "session_id": "28c01dcd-84a1-439b-9e62-297f3def8f7a",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMTYsImlhdCI6MTc5MzE3MzMxNiwianRpIjoiMzUyOTM2MzYtOGE3YS00NDZlLTk2YmItMzNhZGQ5YTRmMjI2Iiwic2lkIjoiMjhjMDFkY2QtODRhMS00MzliLTllNjItMjk3ZjNkZWY4ZjdhIn0.XBBs8LknfS1pn2iRbkcmAv5_resohZCwn6tAgOJMVwc",
  "access_expires_at": "2026-10-28T07:56:56.022773077Z",
  "refresh_token": "t1AqHlOxKbWnGn_HxEqGqv2VLTwh78gafuGDaOTeOkM",
  "refresh_expires_at": "2026-10-28T19:41:56.02219721Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9b44bf12-d8cb-49c4-9232-406df7a6cfa0` → **200**

```json
{
  "id": "9b44bf12-d8cb-49c4-9232-406df7a6cfa0",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "91cdaf51-74f3-4277-9b4c-dfe0c8836106",
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
  "created_at": "2026-10-28T07:41:55.392123Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T10:41:54Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "087080e6-db80-4f3a-9563-0ecd1f01b0d9",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T07:41:55.617694Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9b44bf12-d8cb-49c4-9232-406df7a6cfa0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T07:41:55.393348Z",
      "actor": {
        "type": "CLIENT",
        "id": "91cdaf51-74f3-4277-9b4c-dfe0c8836106",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9b44bf12-d8cb-49c4-9232-406df7a6cfa0",
        "preorder": true,
        "quote_id": "fb185bec-99c9-41fc-88e9-5c6dd1df7a9b",
        "pickup_at": "2026-10-28T10:41:54Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T07:41:55.619154Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9b44bf12-d8cb-49c4-9232-406df7a6cfa0",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "087080e6-db80-4f3a-9563-0ecd1f01b0d9"
      }
    }
  ]
}
```

Done: pre-order 9b44bf12-d8cb-49c4-9232-406df7a6cfa0, reservation 087080e6-db80-4f3a-9563-0ecd1f01b0d9.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23571"
}
```

```json
{
  "challenge_id": "74ff96c5-adc3-4d50-82c8-b0405f6c7573",
  "expires_at": "2026-10-28T07:46:56.110907638Z",
  "resend_available_at": "2026-10-28T07:41:57.110907638Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "548407",
  "sent_at": "2026-10-28T07:41:56.113059833Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74ff96c5-adc3-4d50-82c8-b0405f6c7573",
  "code": "548407",
  "device_ref": "sandbox-23571"
}
```

```json
{
  "session_id": "2c5314aa-bc36-451b-af81-ea592db8267b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDIxNiwiaWF0IjoxNzkzMTczMzE2LCJqdGkiOiJlOTQyNjMzZi1hNTAyLTQ0NWMtOTMyNC1mNWE0MTg2ZmEwMjMiLCJzaWQiOiIyYzUzMTRhYS1iYzM2LTQ1MWItYWY4MS1lYTU5MmRiODI2N2IifQ.IGPvdpyg2XEq0Ckq2Pf_K1Yvdu_1e91LUnxGZlmPGMM",
  "access_expires_at": "2026-10-28T07:56:56.168051436Z",
  "refresh_token": "-j8F4Xc_njDY85FGxaIYrpAX_VSp5XnzqGQcBHvhOCw",
  "refresh_expires_at": "2026-11-27T07:41:56.167491649Z",
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
  "command_id": "4afd20a9-f9bc-41be-a50f-60ba73943453",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:56Z",
    "sequence": 1793173316218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b",
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
  "last_heartbeat_at": "2026-10-28T07:41:56.237081Z",
  "last_location_at": "2026-10-28T07:41:56.237081Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671548385",
  "device_ref": "sandbox-21982"
}
```

```json
{
  "challenge_id": "467c557f-b0e9-456f-be3c-14a3b5c215ff",
  "expires_at": "2026-10-28T07:46:56.266777767Z",
  "resend_available_at": "2026-10-28T07:41:57.266777767Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671548385` → **200**

```json
{
  "phone": "+380671548385",
  "audience": "CLIENT",
  "code": "696325",
  "sent_at": "2026-10-28T07:41:56.269592251Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "467c557f-b0e9-456f-be3c-14a3b5c215ff",
  "code": "696325",
  "device_ref": "sandbox-21982"
}
```

```json
{
  "session_id": "924e64cc-5222-428c-8f0a-9e352b6b1f1a",
  "subject": {
    "type": "CLIENT",
    "id": "88ab0b52-dac3-46e6-999b-2d223cea5a3e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGFiMGI1Mi1kYWMzLTQ2ZTYtOTk5Yi0yZDIyM2NlYTVhM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MjE2LCJpYXQiOjE3OTMxNzMzMTYsImp0aSI6IjI0OGE3OWVlLWNjMDgtNGQxYy1iZmIyLWZmNzkzMmU3ZTNhNiIsInNpZCI6IjkyNGU2NGNjLTUyMjItNDI4Yy04ZjBhLTllMzUyYjZiMWYxYSJ9.zCO1v1v7hK2hBZRXttq0ez22WCdXISJCu1qNk5xQ-dE",
  "access_expires_at": "2026-10-28T07:56:56.324205306Z",
  "refresh_token": "ulai3dYDaC0woMJ9wpyFeAQwRM1DZof8FfOHTyvsxug",
  "refresh_expires_at": "2026-11-27T07:41:56.323660938Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bd63c9ab-de89-4e6c-8343-68138c0d584f",
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
  "id": "c41b2b19-6ba3-4e45-aa40-b8b8cd76de82",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T07:46:56.359675Z",
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
  "command_id": "1d8b88c8-cc87-4de3-8718-9d50a516c2e1",
  "quote_id": "c41b2b19-6ba3-4e45-aa40-b8b8cd76de82",
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
  "id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "88ab0b52-dac3-46e6-999b-2d223cea5a3e",
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
  "created_at": "2026-10-28T07:41:56.397384Z",
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
    "id": "510d3459-5748-4b2b-8e14-5f6eab24425f",
    "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
    "expires_at": "2026-10-28T07:42:11.400404Z",
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

`POST /api/driver/v1/offers/510d3459-5748-4b2b-8e14-5f6eab24425f/accept` → **200**

```json
{
  "command_id": "00d56bd6-ec2e-4974-a207-7e7d7799cfaa"
}
```

```json
{
  "id": "7e5b379a-5866-4e33-8a9e-463f882599a4",
  "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "28f49771-4fe2-43a3-bf0a-bbd15b1c8766",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "28f49771-4fe2-43a3-bf0a-bbd15b1c8766",
  "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "assignment_id": "7e5b379a-5866-4e33-8a9e-463f882599a4",
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

`POST /api/driver/v1/work-sessions/1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:56Z",
    "sequence": 1793173316506
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b",
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
  "last_heartbeat_at": "2026-10-28T07:41:56.525404Z",
  "last_location_at": "2026-10-28T07:41:56.525404Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "28f49771-4fe2-43a3-bf0a-bbd15b1c8766",
  "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "assignment_id": "7e5b379a-5866-4e33-8a9e-463f882599a4",
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

`POST /api/driver/v1/trips/28f49771-4fe2-43a3-bf0a-bbd15b1c8766/arrive` → **200**

```json
{
  "command_id": "c7f28b5b-25ff-4098-8d5c-18952ebebf18",
  "expected_version": 0
}
```

```json
{
  "id": "28f49771-4fe2-43a3-bf0a-bbd15b1c8766",
  "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "assignment_id": "7e5b379a-5866-4e33-8a9e-463f882599a4",
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
  "arrived_at": "2026-10-28T07:41:56.578815Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/28f49771-4fe2-43a3-bf0a-bbd15b1c8766/start` → **200**

```json
{
  "command_id": "bed4a26f-3a12-433f-852d-8bc8d7a3256e",
  "expected_version": 1
}
```

```json
{
  "id": "28f49771-4fe2-43a3-bf0a-bbd15b1c8766",
  "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "assignment_id": "7e5b379a-5866-4e33-8a9e-463f882599a4",
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
  "arrived_at": "2026-10-28T07:41:56.578815Z",
  "started_at": "2026-10-28T07:41:56.612202Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:41:56Z",
    "sequence": 1793173316636
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b",
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
  "last_heartbeat_at": "2026-10-28T07:41:56.654164Z",
  "last_location_at": "2026-10-28T07:41:56.654164Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/28f49771-4fe2-43a3-bf0a-bbd15b1c8766/complete` → **200**

```json
{
  "command_id": "f813a70b-2cfe-45c9-a7cc-d58165413968",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:41:56Z",
  "cash_received": true
}
```

```json
{
  "id": "28f49771-4fe2-43a3-bf0a-bbd15b1c8766",
  "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "assignment_id": "7e5b379a-5866-4e33-8a9e-463f882599a4",
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
  "arrived_at": "2026-10-28T07:41:56.578815Z",
  "started_at": "2026-10-28T07:41:56.612202Z",
  "completed_at": "2026-10-28T07:41:56.687509Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/1438d79b-8d83-4809-986d-6b7c55094ff8/rating` → **200**

```json
{
  "command_id": "bae02829-e4e6-4fb0-8dd1-c34383805645",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "score": 5,
  "created_at": "2026-10-28T07:41:56.737179758Z"
}
```

`POST /api/driver/v1/orders/1438d79b-8d83-4809-986d-6b7c55094ff8/rating` → **200**

```json
{
  "command_id": "d7a5239f-978c-47e3-b06c-3420c6bac692",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
  "score": 4,
  "created_at": "2026-10-28T07:41:56.773261431Z"
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
  "session_id": "227fee60-c66a-49c1-82b9-f79bb812f88b",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMTcsImlhdCI6MTc5MzE3MzMxNywianRpIjoiMjM1ZGY4MmItYTI5Ny00N2Y2LTg4NGYtYTdjY2FmMzViNjAyIiwic2lkIjoiMjI3ZmVlNjAtYzY2YS00OWMxLTgyYjktZjc5YmI4MTJmODhiIn0.Laf4oUKXD4GDq2AU7yv2I0LvYI0HSaAvPhhDgOJov2A",
  "access_expires_at": "2026-10-28T07:56:57.132848101Z",
  "refresh_token": "HMqjrX0ntCxJReL32R1SBbCPpZvd7lildtRqsDY7btc",
  "refresh_expires_at": "2026-10-28T19:41:57.132340061Z",
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
  "session_id": "ce5c7915-debe-41c6-99bc-c0adef779a19",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMTcsImlhdCI6MTc5MzE3MzMxNywianRpIjoiYzhlNjJhZjMtNzQ4My00YjUwLThmOWYtODdiYTgwMmIzMTYwIiwic2lkIjoiY2U1Yzc5MTUtZGViZS00MWM2LTk5YmMtYzBhZGVmNzc5YTE5In0.8YVryP6w5GJK3pK_VHEuumD6JyI7rKA1Z0J7n_B-9rg",
  "access_expires_at": "2026-10-28T07:56:57.455894642Z",
  "refresh_token": "D2NqlRivmQS3sqzSrEoQnIyu1CnWM3ZdkxNofEj1esI",
  "refresh_expires_at": "2026-10-28T19:41:57.455211294Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1438d79b-8d83-4809-986d-6b7c55094ff8/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
      "author_type": "RIDER",
      "author_id": "88ab0b52-dac3-46e6-999b-2d223cea5a3e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T07:41:56.73718Z"
    },
    {
      "order_id": "1438d79b-8d83-4809-986d-6b7c55094ff8",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "88ab0b52-dac3-46e6-999b-2d223cea5a3e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T07:41:56.773261Z"
    }
  ]
}
```

Done: ratings for order 1438d79b-8d83-4809-986d-6b7c55094ff8.

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
  "session_id": "2031499a-46a9-49bd-b507-5a1d14262c14",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMTcsImlhdCI6MTc5MzE3MzMxNywianRpIjoiNjc1N2UzZDMtMjJmZi00NDM2LWIxYTktZTI4YzViOWQxMjdhIiwic2lkIjoiMjAzMTQ5OWEtNDZhOS00OWJkLWI1MDctNWExZDE0MjYyYzE0In0._N4Gx12tHMKRFM5kH0r5lkBbI-lxTWIezVgcC8gPSwY",
  "access_expires_at": "2026-10-28T07:56:57.826967704Z",
  "refresh_token": "rjkjUfqCyrDFEke24mqqGALrwnkQYHV0U8Y6ul2AGM0",
  "refresh_expires_at": "2026-10-28T19:41:57.826423326Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "2aa34412-8a5f-4a64-988d-e32e6d3d6c60",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "a1752ea8-8f0c-4530-9fa2-110060459d01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:41:57.866708Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1752ea8-8f0c-4530-9fa2-110060459d01` → **200**

```json
{
  "id": "a1752ea8-8f0c-4530-9fa2-110060459d01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:41:57.866708Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1752ea8-8f0c-4530-9fa2-110060459d01` → **200**

```json
{
  "id": "a1752ea8-8f0c-4530-9fa2-110060459d01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:41:57.866708Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1752ea8-8f0c-4530-9fa2-110060459d01` → **200**

```json
{
  "id": "a1752ea8-8f0c-4530-9fa2-110060459d01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:41:57.866708Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1752ea8-8f0c-4530-9fa2-110060459d01` → **200**

```json
{
  "id": "a1752ea8-8f0c-4530-9fa2-110060459d01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:41:57.866708Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1752ea8-8f0c-4530-9fa2-110060459d01` → **200**

```json
{
  "id": "a1752ea8-8f0c-4530-9fa2-110060459d01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:41:57.866708Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1752ea8-8f0c-4530-9fa2-110060459d01` → **200**

```json
{
  "id": "a1752ea8-8f0c-4530-9fa2-110060459d01",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:41:57.866708Z",
  "ready_at": "2026-10-28T07:42:02.50894Z",
  "expires_at": "2026-10-29T07:42:02.50894Z"
}
```

`GET /api/admin/v1/reports/exports/a1752ea8-8f0c-4530-9fa2-110060459d01/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,16,6,10,0,0,12,4,0,14,1,0,1,5,1,4
total,16,6,10,0,0,12,4,0,14,1,0,1,5,1,4
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c0578720-0f54-42b0-b025-a7079881e133",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "71b68c62-70a6-43b1-813b-1b80bdc59186",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:42:03.097018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/71b68c62-70a6-43b1-813b-1b80bdc59186` → **200**

```json
{
  "id": "71b68c62-70a6-43b1-813b-1b80bdc59186",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:42:03.097018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/71b68c62-70a6-43b1-813b-1b80bdc59186` → **200**

```json
{
  "id": "71b68c62-70a6-43b1-813b-1b80bdc59186",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:42:03.097018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/71b68c62-70a6-43b1-813b-1b80bdc59186` → **200**

```json
{
  "id": "71b68c62-70a6-43b1-813b-1b80bdc59186",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:42:03.097018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/71b68c62-70a6-43b1-813b-1b80bdc59186` → **200**

```json
{
  "id": "71b68c62-70a6-43b1-813b-1b80bdc59186",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:42:03.097018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/71b68c62-70a6-43b1-813b-1b80bdc59186` → **200**

```json
{
  "id": "71b68c62-70a6-43b1-813b-1b80bdc59186",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T07:42:03.097018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/71b68c62-70a6-43b1-813b-1b80bdc59186` → **200**

```json
{
  "id": "71b68c62-70a6-43b1-813b-1b80bdc59186",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T07:42:03.097018Z",
  "ready_at": "2026-10-28T07:42:07.516503Z",
  "expires_at": "2026-10-29T07:42:07.516503Z"
}
```

`GET /api/admin/v1/reports/exports/71b68c62-70a6-43b1-813b-1b80bdc59186/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/aeb94dcf-9794-4036-88e6-5bc711226904` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/aeb94dcf-9794-4036-88e6-5bc711226904",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9d23106a-e0c8-4753-9675-5809c86d9341"
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
  "session_id": "d754902c-dd56-49d8-b54d-e88bcb38e068",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMjgsImlhdCI6MTc5MzE3MzMyOCwianRpIjoiZDAwYzRiNDUtZmEzYy00MGQ2LTgxNTItMDI4MjI5ZDI0NzBjIiwic2lkIjoiZDc1NDkwMmMtZGQ1Ni00OWQ4LWI1NGQtZTg4YmNiMzhlMDY4In0.CuW6iT4J6tzCgv14clHW5uUB6cYv3AxoupXMtdlliwA",
  "access_expires_at": "2026-10-28T07:57:08.647479011Z",
  "refresh_token": "FsyiNPZ_k4nLIXGqR8QdrE_o96wGvpaA43DZXbyQSH4",
  "refresh_expires_at": "2026-10-28T19:42:08.646891377Z",
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
  "command_id": "e87f1d7d-3abb-461a-8f40-4eefe368b72f",
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
  "changed_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:42:08.731496Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "e87f1d7d-3abb-461a-8f40-4eefe368b72f",
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
  "changed_by": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T07:42:08.731496Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48786682610",
  "device_ref": "sandbox-25033"
}
```

```json
{
  "challenge_id": "b81c3089-554f-4004-bb61-541dabd65f8e",
  "expires_at": "2026-10-28T07:47:08.807590259Z",
  "resend_available_at": "2026-10-28T07:42:09.807590259Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48786682610` → **200**

```json
{
  "phone": "+48786682610",
  "audience": "CLIENT",
  "code": "139203",
  "sent_at": "2026-10-28T07:42:08.810251406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b81c3089-554f-4004-bb61-541dabd65f8e",
  "code": "139203",
  "device_ref": "sandbox-25033"
}
```

```json
{
  "session_id": "d9fe5123-d678-44b6-a146-29cdfb91a3e7",
  "subject": {
    "type": "CLIENT",
    "id": "def68f65-285a-47e7-b301-8e9d05554021"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZWY2OGY2NS0yODVhLTQ3ZTctYjMwMS04ZTlkMDU1NTQwMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MjI4LCJpYXQiOjE3OTMxNzMzMjgsImp0aSI6ImU1MmY1ZjBiLWQ4MjEtNGY1MS1iNWE4LTU4MzA2NWM1MTgxOCIsInNpZCI6ImQ5ZmU1MTIzLWQ2NzgtNDRiNi1hMTQ2LTI5Y2RmYjkxYTNlNyJ9._smSkCZZnGGgzxJcPv5tlc8s3ul0K9jNNqOn718HM4Y",
  "access_expires_at": "2026-10-28T07:57:08.865493071Z",
  "refresh_token": "JmkGa-HYquCCBWv70_IIzrzXmIj2qKpoE3rwdRWbbTQ",
  "refresh_expires_at": "2026-11-27T07:42:08.864921512Z",
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
  "correlation_id": "6e76c647-20b5-4221-b673-cec71bdca83e"
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
  "device_ref": "sandbox-9876"
}
```

```json
{
  "challenge_id": "a381ec18-28dc-4abe-9abd-050e4bd25184",
  "expires_at": "2026-10-28T07:47:08.943785038Z",
  "resend_available_at": "2026-10-28T07:42:09.943785038Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "703041",
  "sent_at": "2026-10-28T07:42:08.945870498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a381ec18-28dc-4abe-9abd-050e4bd25184",
  "code": "703041",
  "device_ref": "sandbox-9876"
}
```

```json
{
  "session_id": "d6b8c990-7f49-4f9c-a245-6e330cd62b9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDIyOCwiaWF0IjoxNzkzMTczMzI4LCJqdGkiOiJkYjMwMmNhZi01OTM4LTRiNjYtOGRhNi0zZDczNWI4ZjA5MWYiLCJzaWQiOiJkNmI4Yzk5MC03ZjQ5LTRmOWMtYTI0NS02ZTMzMGNkNjJiOWQifQ.iN_rjmLycG6knVpNo-3jbwcsraPf2eKdQgiPvOwjavE",
  "access_expires_at": "2026-10-28T07:57:08.999861726Z",
  "refresh_token": "q7u5Y9pLtZBzlR-ObrRRSOxSv5Iss7LUXzOZc_SIfYc",
  "refresh_expires_at": "2026-11-27T07:42:08.99934524Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ac270eae-c85c-4a60-94cd-83ace8fc8399",
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
  "last_heartbeat_at": "2026-10-28T07:41:55.549761Z",
  "last_location_at": "2026-10-28T07:41:55.549761Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ac270eae-c85c-4a60-94cd-83ace8fc8399/handover` → **200**

```json
{
  "command_id": "b764e010-eeda-4c40-8dc5-9ebd0c95d68c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ac270eae-c85c-4a60-94cd-83ace8fc8399",
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
  "last_heartbeat_at": "2026-10-28T07:41:55.549761Z",
  "last_location_at": "2026-10-28T07:41:55.549761Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ac270eae-c85c-4a60-94cd-83ace8fc8399/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:42:09Z",
    "sequence": 1793173329836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ac270eae-c85c-4a60-94cd-83ace8fc8399",
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
  "last_heartbeat_at": "2026-10-28T07:42:09.101957Z",
  "last_location_at": "2026-10-28T07:42:09.101957Z",
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
  "session_id": "ac270eae-c85c-4a60-94cd-83ace8fc8399",
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
  "last_heartbeat_at": "2026-10-28T07:42:09.101957Z",
  "last_location_at": "2026-10-28T07:42:09.101957Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ac270eae-c85c-4a60-94cd-83ace8fc8399/close` → **200**

```json
{
  "command_id": "8f72359f-f951-4388-83ac-c9251a97e0f4",
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
  "correlation_id": "56559723-204c-42c7-bf3d-abdd4f5bbf94"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674471835",
  "device_ref": "sandbox-3295"
}
```

```json
{
  "challenge_id": "72665a12-0dfe-4eab-92bc-86ecd42f7aa8",
  "expires_at": "2026-10-28T07:47:09.26434932Z",
  "resend_available_at": "2026-10-28T07:42:10.26434932Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674471835` → **200**

```json
{
  "phone": "+380674471835",
  "audience": "CLIENT",
  "code": "722522",
  "sent_at": "2026-10-28T07:42:09.266547133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72665a12-0dfe-4eab-92bc-86ecd42f7aa8",
  "code": "722522",
  "device_ref": "sandbox-3295"
}
```

```json
{
  "session_id": "bf0e42d3-9949-427f-8197-ea5ed724fba6",
  "subject": {
    "type": "CLIENT",
    "id": "82b0eb26-003e-4587-a18a-948bab8ec5c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmIwZWIyNi0wMDNlLTQ1ODctYTE4YS05NDhiYWI4ZWM1YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc0MjI5LCJpYXQiOjE3OTMxNzMzMjksImp0aSI6ImU4ZDY3Y2Y0LTRmMmQtNDhiNi04OTk5LWE2MjkzMTYyNDI5YyIsInNpZCI6ImJmMGU0MmQzLTk5NDktNDI3Zi04MTk3LWVhNWVkNzI0ZmJhNiJ9.MOFU5TL_PVjsSZyX6ox1tn8CpGsHeWVmlTt1s-E7Wdw",
  "access_expires_at": "2026-10-28T07:57:09.320822327Z",
  "refresh_token": "hgNdhhrJQ4YqXDgRujHi1Gz-iz_Q_wTvZezQu1O0u9w",
  "refresh_expires_at": "2026-11-27T07:42:09.320188121Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "28dfc314-5d7d-4139-b7a6-9a1912f699a9",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0cd66782-2438-4733-b8a6-5525b75e0516",
  "upload_path": "/api/rider/v1/uploads/0cd66782-2438-4733-b8a6-5525b75e0516",
  "expires_at": "2026-10-28T07:57:09.357011749Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/0cd66782-2438-4733-b8a6-5525b75e0516` → **200**

```json
{
  "file_id": "0cd66782-2438-4733-b8a6-5525b75e0516",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2206fa38-48bc-4cda-924d-3dd0139b5431",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "0cd66782-2438-4733-b8a6-5525b75e0516"
  ]
}
```

```json
{
  "id": "084abad4-d056-49ee-9281-da1f4926e831",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "82b0eb26-003e-4587-a18a-948bab8ec5c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:42:09.422637Z",
  "updated_at": "2026-10-28T07:42:09.422637Z",
  "messages": [
    {
      "id": "3e380fc2-e777-48d4-a464-c70acf0b9be6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "82b0eb26-003e-4587-a18a-948bab8ec5c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:42:09.423958Z",
      "attachments": [
        {
          "file_id": "0cd66782-2438-4733-b8a6-5525b75e0516",
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
  "session_id": "c07b4317-637b-4a54-8992-2d2fc6eef5f3",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMjksImlhdCI6MTc5MzE3MzMyOSwianRpIjoiYTI2ZDU5ZjgtMWUxMi00NTIyLTlhOTQtZGIzOGI5ZDQ1ZGQ2Iiwic2lkIjoiYzA3YjQzMTctNjM3Yi00YTU0LTg5OTItMmQyZmM2ZWVmNWYzIn0.LRBf-ne5XIPamGgYPuUiWSk-3W5IU9P6Xik3FhQw3tA",
  "access_expires_at": "2026-10-28T07:57:09.769141483Z",
  "refresh_token": "AhJRzqmtNaWTg4LF4vbt-eaMF3Q1ZS_eB28t-_bEQZ0",
  "refresh_expires_at": "2026-10-28T19:42:09.768590593Z",
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
  "session_id": "4afa0183-db18-49db-82ea-bc2c8a2225ed",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMzAsImlhdCI6MTc5MzE3MzMzMCwianRpIjoiOTBjOWU3NGItNTk1Ni00NWNkLWJjZjQtZDIwMDU1N2IzMDAzIiwic2lkIjoiNGFmYTAxODMtZGIxOC00OWRiLTgyZWEtYmMyYzhhMjIyNWVkIn0.bpVIZdKmPD4g-HbsRvPBtYC4yiuj-KXPV6xHItmtNfE",
  "access_expires_at": "2026-10-28T07:57:10.090349156Z",
  "refresh_token": "n4IhMKdjZgx9PfqjNtMIN9rh3Xt7OjINmZQGHqd8Xc8",
  "refresh_expires_at": "2026-10-28T19:42:10.089743183Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/084abad4-d056-49ee-9281-da1f4926e831/attachments/0cd66782-2438-4733-b8a6-5525b75e0516` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "0762d1c8-e8ac-4ec3-8952-190cfb41f18a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b305f9ad-431a-4bca-8f5d-b9d7ccecb302",
  "upload_path": "/api/operator/v1/uploads/b305f9ad-431a-4bca-8f5d-b9d7ccecb302",
  "expires_at": "2026-10-28T07:57:10.136052902Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b305f9ad-431a-4bca-8f5d-b9d7ccecb302` → **200**

```json
{
  "file_id": "b305f9ad-431a-4bca-8f5d-b9d7ccecb302",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/084abad4-d056-49ee-9281-da1f4926e831` → **200**

```json
{
  "id": "084abad4-d056-49ee-9281-da1f4926e831",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "82b0eb26-003e-4587-a18a-948bab8ec5c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T07:42:09.422637Z",
  "updated_at": "2026-10-28T07:42:09.422637Z",
  "messages": [
    {
      "id": "3e380fc2-e777-48d4-a464-c70acf0b9be6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "82b0eb26-003e-4587-a18a-948bab8ec5c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:42:09.423958Z",
      "attachments": [
        {
          "file_id": "0cd66782-2438-4733-b8a6-5525b75e0516",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/084abad4-d056-49ee-9281-da1f4926e831/comments` → **200**

```json
{
  "command_id": "37a30144-46ab-4221-97d4-2db6397e6de8",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b305f9ad-431a-4bca-8f5d-b9d7ccecb302"
  ]
}
```

```json
{
  "id": "084abad4-d056-49ee-9281-da1f4926e831",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "82b0eb26-003e-4587-a18a-948bab8ec5c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:42:09.422637Z",
  "updated_at": "2026-10-28T07:42:10.232908Z",
  "messages": [
    {
      "id": "3e380fc2-e777-48d4-a464-c70acf0b9be6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "82b0eb26-003e-4587-a18a-948bab8ec5c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:42:09.423958Z",
      "attachments": [
        {
          "file_id": "0cd66782-2438-4733-b8a6-5525b75e0516",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "18facba7-9dd9-4be4-919d-21a32542cba5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:42:10.232564Z",
      "attachments": [
        {
          "file_id": "b305f9ad-431a-4bca-8f5d-b9d7ccecb302",
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

`GET /api/rider/v1/support/cases/084abad4-d056-49ee-9281-da1f4926e831` → **200**

```json
{
  "id": "084abad4-d056-49ee-9281-da1f4926e831",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "82b0eb26-003e-4587-a18a-948bab8ec5c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T07:42:09.422637Z",
  "updated_at": "2026-10-28T07:42:10.232908Z",
  "messages": [
    {
      "id": "3e380fc2-e777-48d4-a464-c70acf0b9be6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "82b0eb26-003e-4587-a18a-948bab8ec5c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T07:42:09.423958Z",
      "attachments": [
        {
          "file_id": "0cd66782-2438-4733-b8a6-5525b75e0516",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "18facba7-9dd9-4be4-919d-21a32542cba5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T07:42:10.232564Z",
      "attachments": [
        {
          "file_id": "b305f9ad-431a-4bca-8f5d-b9d7ccecb302",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/084abad4-d056-49ee-9281-da1f4926e831/attachments/b305f9ad-431a-4bca-8f5d-b9d7ccecb302` → **200**

Done: support case 084abad4-d056-49ee-9281-da1f4926e831, rider attachment 0cd66782-2438-4733-b8a6-5525b75e0516, operator attachment b305f9ad-431a-4bca-8f5d-b9d7ccecb302.

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
  "session_id": "35dad561-f43a-41db-8d56-165394fc2fc9",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMzAsImlhdCI6MTc5MzE3MzMzMCwianRpIjoiZjhhNmQyMDgtMDQ3NS00NjI5LWE1NmUtYTNjMWYyMDg0YjZiIiwic2lkIjoiMzVkYWQ1NjEtZjQzYS00MWRiLThkNTYtMTY1Mzk0ZmMyZmM5In0.TtD0A3p8uFAxUwe6wmBdVWsIBkOHESmN8lpF1ZVqwf4",
  "access_expires_at": "2026-10-28T07:57:10.617489542Z",
  "refresh_token": "BL2BdXY2t6YCchuB2vEv2tiOHi1oh4iFZrFUS-q_mgs",
  "refresh_expires_at": "2026-10-28T19:42:10.616904568Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11805"
}
```

```json
{
  "challenge_id": "20be282d-983a-489c-a088-07bb21383c26",
  "expires_at": "2026-10-28T07:47:10.644677663Z",
  "resend_available_at": "2026-10-28T07:42:11.644677663Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "008072",
  "sent_at": "2026-10-28T07:42:10.649931939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20be282d-983a-489c-a088-07bb21383c26",
  "code": "008072",
  "device_ref": "sandbox-11805"
}
```

```json
{
  "session_id": "e6e78574-ab63-41c2-a518-03a97ec57ad9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDIzMCwiaWF0IjoxNzkzMTczMzMwLCJqdGkiOiIzMzA3MjdjYi0zY2ViLTRmZjUtYjY4Ny03MDRjMTAwYjUxOTciLCJzaWQiOiJlNmU3ODU3NC1hYjYzLTQxYzItYTUxOC0wM2E5N2VjNTdhZDkifQ.Q5BWVQqRfLZWv_fQ_l6tY07OjEECEeSXOdYqlkuiqxc",
  "access_expires_at": "2026-10-28T07:57:10.704454073Z",
  "refresh_token": "am9VG8VT5INJh07oKPsVkj2f9x9J61Fq_DEvvakRtWw",
  "refresh_expires_at": "2026-11-27T07:42:10.703868398Z",
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
  "command_id": "a9333af4-c79d-45ba-af50-cba96b599b81",
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
  "device_ref": "sandbox-11672"
}
```

```json
{
  "challenge_id": "b19a5e55-f690-40e1-84b0-66661ed00801",
  "expires_at": "2026-10-28T07:47:10.829613791Z",
  "resend_available_at": "2026-10-28T07:42:11.829613791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "849101",
  "sent_at": "2026-10-28T07:42:10.831933691Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b19a5e55-f690-40e1-84b0-66661ed00801",
  "code": "849101",
  "device_ref": "sandbox-11672"
}
```

```json
{
  "session_id": "546fee02-eb18-443a-8f68-4789215dc553",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NDIzMCwiaWF0IjoxNzkzMTczMzMwLCJqdGkiOiJmNTQ4ZTQ0ZC01ZGNiLTRjOGItYWY4NS1kZTliMDNjMDYxYzAiLCJzaWQiOiI1NDZmZWUwMi1lYjE4LTQ0M2EtOGY2OC00Nzg5MjE1ZGM1NTMifQ.ePwD40clKUGl6cflgrMW_ccp1L6tHgLX55eg-oX_38k",
  "access_expires_at": "2026-10-28T07:57:10.888790464Z",
  "refresh_token": "_Q6qrsBZqQFLN5psENTD9duxYkL7kmYuhuqStqoJIIs",
  "refresh_expires_at": "2026-11-27T07:42:10.888092287Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b",
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
  "last_heartbeat_at": "2026-10-28T07:41:56.654164Z",
  "last_location_at": "2026-10-28T07:41:56.654164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b/handover` → **200**

```json
{
  "command_id": "1bb728eb-a629-4b65-978a-69026b273e2b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b",
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
  "last_heartbeat_at": "2026-10-28T07:41:56.654164Z",
  "last_location_at": "2026-10-28T07:41:56.654164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:42:10Z",
    "sequence": 1793173330969
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b",
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
  "last_heartbeat_at": "2026-10-28T07:42:10.986605Z",
  "last_location_at": "2026-10-28T07:42:10.986605Z",
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
  "command_id": "e6ca6efe-8a64-4ee8-bb4f-a17c227f964e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:42:11Z",
    "sequence": 1793173331336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcbb6299-0a28-4ea3-ada2-571f06a5110e",
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
  "last_heartbeat_at": "2026-10-28T07:42:11.050825Z",
  "last_location_at": "2026-10-28T07:42:11.050825Z",
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
  "session_id": "735a0dba-b19c-44bb-a1f1-d88c0e7a3d81",
  "subject": {
    "type": "STAFF",
    "id": "d68ae6b1-4ce6-449d-9dfb-cc079f0e5153"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjhhZTZiMS00Y2U2LTQ0OWQtOWRmYi1jYzA3OWYwZTUxNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzQyMzEsImlhdCI6MTc5MzE3MzMzMSwianRpIjoiNjg2NTQ1ZGEtZDYyOS00MDVhLTg2ZDMtOGY3YmE3YzY3MzM4Iiwic2lkIjoiNzM1YTBkYmEtYjE5Yy00NGJiLWExZjEtZDg4YzBlN2EzZDgxIn0.tbDHwKthS8YXScDkSzIFltbuIPwuCxrwlkl3Fvu566E",
  "access_expires_at": "2026-10-28T07:57:11.375626606Z",
  "refresh_token": "CGdPrK3tW77ux5cFm0dux44GBJkFUBlG_ibXPG7zApU",
  "refresh_expires_at": "2026-10-28T19:42:11.375041892Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "99254428-dd91-4b1c-8c21-b78cb3cde0a0",
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
  "id": "588d019b-4a52-4a95-869b-9723bfd05aad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T07:47:11.406369Z",
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
  "command_id": "91499035-68b0-4ce1-9697-92f82fbe15ae",
  "quote_id": "588d019b-4a52-4a95-869b-9723bfd05aad",
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
  "id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
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
  "created_at": "2026-10-28T07:42:11.442267Z",
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
    "id": "92dfb03f-0992-425e-a5bb-a4c7f2b4577d",
    "order_id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
    "expires_at": "2026-10-28T07:42:26.445658Z",
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

`POST /api/driver/v1/offers/92dfb03f-0992-425e-a5bb-a4c7f2b4577d/accept` → **200**

```json
{
  "command_id": "6ffee748-5110-49cb-8926-6cac6e6925ac"
}
```

```json
{
  "id": "a4cf6a26-473a-4192-a16b-56129a8d50df",
  "order_id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ee7144e-07b7-420c-b60f-dbea27b313a0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ee7144e-07b7-420c-b60f-dbea27b313a0",
  "order_id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
  "assignment_id": "a4cf6a26-473a-4192-a16b-56129a8d50df",
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

`POST /api/driver/v1/work-sessions/bcbb6299-0a28-4ea3-ada2-571f06a5110e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T07:42:11Z",
    "sequence": 1793173331577
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcbb6299-0a28-4ea3-ada2-571f06a5110e",
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
  "last_heartbeat_at": "2026-10-28T07:42:11.594553Z",
  "last_location_at": "2026-10-28T07:42:11.594553Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4ee7144e-07b7-420c-b60f-dbea27b313a0/arrive` → **200**

```json
{
  "command_id": "e5779921-f005-4c10-b01a-a0ac25b52628",
  "expected_version": 0
}
```

```json
{
  "id": "4ee7144e-07b7-420c-b60f-dbea27b313a0",
  "order_id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
  "assignment_id": "a4cf6a26-473a-4192-a16b-56129a8d50df",
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
  "arrived_at": "2026-10-28T07:42:11.629264Z",
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

`POST /api/driver/v1/trips/4ee7144e-07b7-420c-b60f-dbea27b313a0/start` → **200**

```json
{
  "command_id": "8d2606d2-f27b-4bb4-af40-8a8892a1339d",
  "expected_version": 1
}
```

```json
{
  "id": "4ee7144e-07b7-420c-b60f-dbea27b313a0",
  "order_id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
  "assignment_id": "a4cf6a26-473a-4192-a16b-56129a8d50df",
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
  "arrived_at": "2026-10-28T07:42:11.629264Z",
  "started_at": "2026-10-28T07:42:11.667813Z",
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

`POST /api/driver/v1/trips/4ee7144e-07b7-420c-b60f-dbea27b313a0/complete` → **200**

```json
{
  "command_id": "abbcfd00-0802-4dd9-8a41-55cf22b51a95",
  "expected_version": 2,
  "reported_at": "2026-10-28T07:42:11Z",
  "cash_received": true
}
```

```json
{
  "id": "4ee7144e-07b7-420c-b60f-dbea27b313a0",
  "order_id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
  "assignment_id": "a4cf6a26-473a-4192-a16b-56129a8d50df",
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
  "arrived_at": "2026-10-28T07:42:11.629264Z",
  "started_at": "2026-10-28T07:42:11.667813Z",
  "completed_at": "2026-10-28T07:42:11.708853Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/8a4466d5-bfda-407b-bb4e-2770ac5a5f8e` → **200**

```json
{
  "id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
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
    "id": "a4cf6a26-473a-4192-a16b-56129a8d50df",
    "order_id": "8a4466d5-bfda-407b-bb4e-2770ac5a5f8e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4ee7144e-07b7-420c-b60f-dbea27b313a0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T07:42:11.442267Z",
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
  "session_id": "1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b",
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
  "last_heartbeat_at": "2026-10-28T07:42:10.986605Z",
  "last_location_at": "2026-10-28T07:42:10.986605Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1cb78af4-a0bd-4f1d-a0f7-13d427d9b71b/close` → **200**

```json
{
  "command_id": "1885a1ec-1dc3-4b45-8ce3-ef13261c8564",
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
  "session_id": "bcbb6299-0a28-4ea3-ada2-571f06a5110e",
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
  "last_heartbeat_at": "2026-10-28T07:42:11.594553Z",
  "last_location_at": "2026-10-28T07:42:11.594553Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bcbb6299-0a28-4ea3-ada2-571f06a5110e/close` → **200**

```json
{
  "command_id": "470d3917-27a6-4ffc-a990-0718ac7375bf",
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

Done: terminal order 8a4466d5-bfda-407b-bb4e-2770ac5a5f8e by Andrii (5a000000-0000-4000-8000-000000000403).
