# Sandbox transcript (2026-10-27T16:46:41Z, 79e0798)

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
  "correlation_id": "63ca5927-1570-4b18-8e58-1ba76d3f1677"
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
  "session_id": "a9f9649f-bd65-4a75-b6e7-676b061a6b44",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MDEsImlhdCI6MTc5MzExOTYwMSwianRpIjoiOTc5NjU1MmQtNjEwYi00N2FmLTg0ZDUtMzBhMWZlNTIxODIwIiwic2lkIjoiYTlmOTY0OWYtYmQ2NS00YTc1LWI2ZTctNjc2YjA2MWE2YjQ0In0.l7bmF85mAn0S1urH1MPZuHCyUMxvZUpotk9SiV8hLjA",
  "access_expires_at": "2026-10-27T17:01:41.97879541Z",
  "refresh_token": "OZWGq8NpiFWhJEiCYmTTw2YGNPV260hDv2v-ZuSHGuM",
  "refresh_expires_at": "2026-10-28T04:46:41.976074232Z",
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
  "session_id": "1dee8908-ea7f-4c7e-aa40-0bb6bdb1191e",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MDMsImlhdCI6MTc5MzExOTYwMywianRpIjoiM2FkMzJhMmItMDQ1Ny00OTQ3LWIzMTItOWM2MzliZWM0YzU2Iiwic2lkIjoiMWRlZTg5MDgtZWE3Zi00YzdlLWFhNDAtMGJiNmJkYjExOTFlIn0.gFDdocWnysNqjx47RsiypxqaQKZGHariYIa68V39r6E",
  "access_expires_at": "2026-10-27T17:01:43.328319764Z",
  "refresh_token": "9WErzhsE2waI9K4vy1LiMzec9m4hzujboYaFWgWTE7I",
  "refresh_expires_at": "2026-10-28T04:46:43.32671542Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0e25e1f1-53da-41ea-89a7-1ea130c2daa9",
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
  "id": "02500533-52fb-438b-beeb-236e72c66100",
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
  "created_by": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
  "created_at": "2026-10-27T16:46:43.410693Z",
  "updated_at": "2026-10-27T16:46:43.410693Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630599395",
  "device_ref": "sandbox-17739"
}
```

```json
{
  "challenge_id": "e9c99fcb-3a8d-46d0-9deb-07b32ba17cac",
  "expires_at": "2026-10-27T16:51:43.475681089Z",
  "resend_available_at": "2026-10-27T16:46:44.475681089Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630599395` → **200**

```json
{
  "phone": "+380630599395",
  "audience": "CLIENT",
  "code": "063574",
  "sent_at": "2026-10-27T16:46:43.484055747Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9c99fcb-3a8d-46d0-9deb-07b32ba17cac",
  "code": "063574",
  "device_ref": "sandbox-17739"
}
```

```json
{
  "session_id": "89ad3b9b-a157-4f6f-a11d-082e2686f171",
  "subject": {
    "type": "CLIENT",
    "id": "a5ae0821-e122-42d8-98f7-7801a40deb73"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNWFlMDgyMS1lMTIyLTQyZDgtOThmNy03ODAxYTQwZGViNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTAzLCJpYXQiOjE3OTMxMTk2MDMsImp0aSI6ImRlYWVmMzg4LWU3YTgtNDM1Yi04Y2M3LTUxNTVmNWUxYmEwMCIsInNpZCI6Ijg5YWQzYjliLWExNTctNGY2Zi1hMTFkLTA4MmUyNjg2ZjE3MSJ9.y_-n_RwFa-f6uOk_3-gNkEOmSwcs9wj0FtgPhGYkgwI",
  "access_expires_at": "2026-10-27T17:01:43.590119168Z",
  "refresh_token": "_t4MqlBdedew6vO0YFLDMrAN5aTuaS23ppvBZmpDyew",
  "refresh_expires_at": "2026-11-26T16:46:43.588564538Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630599395` → **200**

```json
{
  "client_id": "a5ae0821-e122-42d8-98f7-7801a40deb73"
}
```

`POST /api/admin/v1/rider-wallets/a5ae0821-e122-42d8-98f7-7801a40deb73/top-ups` → **201**

```json
{
  "command_id": "27bc4d72-1963-45dc-9199-8691dfd296db",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "a5ae0821-e122-42d8-98f7-7801a40deb73",
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
      "id": "5e1791df-fcb8-42b2-8b98-43383610c755",
      "at": "2026-10-27T16:46:43.701225Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5a0eb255-db0e-491b-a202-fa8423e35555",
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
  "id": "a255c056-6589-484e-b135-2c5b7a56acac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:51:43.873215Z",
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
      "id": "02500533-52fb-438b-beeb-236e72c66100",
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
  "device_ref": "sandbox-2093"
}
```

```json
{
  "challenge_id": "28d84f8e-4150-4440-b37e-13d961d7d4f9",
  "expires_at": "2026-10-27T16:51:43.985487078Z",
  "resend_available_at": "2026-10-27T16:46:44.985487078Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "183407",
  "sent_at": "2026-10-27T16:46:43.992515185Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28d84f8e-4150-4440-b37e-13d961d7d4f9",
  "code": "183407",
  "device_ref": "sandbox-2093"
}
```

```json
{
  "session_id": "ebe176ab-81be-4d75-a344-ce7aa003b1e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUwNCwiaWF0IjoxNzkzMTE5NjA0LCJqdGkiOiJmMjVkOGJkNS01NDBlLTQ2NmQtYTg2NS1iM2YyZmM0NjEyMzMiLCJzaWQiOiJlYmUxNzZhYi04MWJlLTRkNzUtYTM0NC1jZTdhYTAwM2IxZTAifQ.KxM2cKU8feT_t0R_M3AkiLuYsU5zzvksks-YUASyU5o",
  "access_expires_at": "2026-10-27T17:01:44.077912452Z",
  "refresh_token": "wR1GSKIPMsxTBLZuu6OSFdPR9ExeAoVyTNHAYan8oBs",
  "refresh_expires_at": "2026-11-26T16:46:44.076659231Z",
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
  "command_id": "82fb9ce7-d4ff-4d32-bfc0-dff001fab79e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:46:44Z",
    "sequence": 1793119604161
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "30b0838b-a732-4e1f-8691-b5703a3c1106",
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
  "last_heartbeat_at": "2026-10-27T16:46:44.214581Z",
  "last_location_at": "2026-10-27T16:46:44.214581Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b3692b8d-e56c-435d-b2cc-406fd09f4354",
  "quote_id": "a255c056-6589-484e-b135-2c5b7a56acac",
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
  "id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a5ae0821-e122-42d8-98f7-7801a40deb73",
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
  "created_at": "2026-10-27T16:46:44.32234Z",
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
  "client_id": "a5ae0821-e122-42d8-98f7-7801a40deb73",
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
      "id": "5e1791df-fcb8-42b2-8b98-43383610c755",
      "at": "2026-10-27T16:46:43.701225Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
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
    "id": "c22c4e1c-bae4-41c7-8ecc-93b6dc1e2778",
    "order_id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1",
    "expires_at": "2026-10-27T16:46:59.340029Z",
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

`POST /api/driver/v1/offers/c22c4e1c-bae4-41c7-8ecc-93b6dc1e2778/accept` → **200**

```json
{
  "command_id": "28bad012-3152-442e-8de9-d3681d05eadd"
}
```

```json
{
  "id": "2616b056-e73a-4671-8712-d08fe50260fb",
  "order_id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d8a598f-91cf-47dd-9f2c-311692ff4a21",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d8a598f-91cf-47dd-9f2c-311692ff4a21",
  "order_id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1",
  "assignment_id": "2616b056-e73a-4671-8712-d08fe50260fb",
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

`POST /api/driver/v1/work-sessions/30b0838b-a732-4e1f-8691-b5703a3c1106/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:46:44Z",
    "sequence": 1793119604540
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "30b0838b-a732-4e1f-8691-b5703a3c1106",
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
  "last_heartbeat_at": "2026-10-27T16:46:44.568453Z",
  "last_location_at": "2026-10-27T16:46:44.568453Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9d8a598f-91cf-47dd-9f2c-311692ff4a21/arrive` → **200**

```json
{
  "command_id": "026abda9-43a1-4251-bb93-02a757ef9555",
  "expected_version": 0
}
```

```json
{
  "id": "9d8a598f-91cf-47dd-9f2c-311692ff4a21",
  "order_id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1",
  "assignment_id": "2616b056-e73a-4671-8712-d08fe50260fb",
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
  "arrived_at": "2026-10-27T16:46:44.628389Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d8a598f-91cf-47dd-9f2c-311692ff4a21/start` → **200**

```json
{
  "command_id": "7d8fd844-110a-4b25-bab4-8411f98d96d7",
  "expected_version": 1
}
```

```json
{
  "id": "9d8a598f-91cf-47dd-9f2c-311692ff4a21",
  "order_id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1",
  "assignment_id": "2616b056-e73a-4671-8712-d08fe50260fb",
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
  "arrived_at": "2026-10-27T16:46:44.628389Z",
  "started_at": "2026-10-27T16:46:44.685043Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9d8a598f-91cf-47dd-9f2c-311692ff4a21/complete` → **200**

```json
{
  "command_id": "f1e83b72-92ff-45e7-9e75-66bf2fe987ad",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:46:44Z",
  "cash_received": true
}
```

```json
{
  "id": "9d8a598f-91cf-47dd-9f2c-311692ff4a21",
  "order_id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1",
  "assignment_id": "2616b056-e73a-4671-8712-d08fe50260fb",
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
  "arrived_at": "2026-10-27T16:46:44.628389Z",
  "started_at": "2026-10-27T16:46:44.685043Z",
  "completed_at": "2026-10-27T16:46:44.766658Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a5ae0821-e122-42d8-98f7-7801a40deb73",
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
      "id": "8ddb5b2b-f9ff-494a-8b4d-c9b53a62a007",
      "at": "2026-10-27T16:46:45.148142Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1"
    },
    {
      "id": "5e1791df-fcb8-42b2-8b98-43383610c755",
      "at": "2026-10-27T16:46:43.701225Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/02500533-52fb-438b-beeb-236e72c66100/archive` → **200**

```json
{
  "command_id": "09f93628-133b-4067-9a13-9e5ce08287c6",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "02500533-52fb-438b-beeb-236e72c66100",
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
  "created_by": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
  "created_at": "2026-10-27T16:46:43.410693Z",
  "updated_at": "2026-10-27T16:46:47.891714Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "30b0838b-a732-4e1f-8691-b5703a3c1106",
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
  "last_heartbeat_at": "2026-10-27T16:46:44.568453Z",
  "last_location_at": "2026-10-27T16:46:44.568453Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/30b0838b-a732-4e1f-8691-b5703a3c1106/close` → **200**

```json
{
  "command_id": "4edb2d02-2ea7-41fc-bf53-4c12a4714d41",
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

Done: order a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634920600",
  "device_ref": "sandbox-3031"
}
```

```json
{
  "challenge_id": "371fb124-d72f-48e1-a2cc-89f5e974592f",
  "expires_at": "2026-10-27T16:51:48.041447199Z",
  "resend_available_at": "2026-10-27T16:46:49.041447199Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634920600` → **200**

```json
{
  "phone": "+380634920600",
  "audience": "CLIENT",
  "code": "480156",
  "sent_at": "2026-10-27T16:46:48.045774143Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "371fb124-d72f-48e1-a2cc-89f5e974592f",
  "code": "480156",
  "device_ref": "sandbox-3031"
}
```

```json
{
  "session_id": "21a05013-761b-4a58-a02d-7c319c8f3449",
  "subject": {
    "type": "CLIENT",
    "id": "1a417fb1-3229-4509-8587-3a2db7d6e211"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTQxN2ZiMS0zMjI5LTQ1MDktODU4Ny0zYTJkYjdkNmUyMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTA4LCJpYXQiOjE3OTMxMTk2MDgsImp0aSI6ImVkZjU4OGQxLTAzZmEtNDRhOS04MTFmLWQwZGI4NGU2MmE3NiIsInNpZCI6IjIxYTA1MDEzLTc2MWItNGE1OC1hMDJkLTdjMzE5YzhmMzQ0OSJ9.R111tHgbkp1yL6k_l2UujfhkaZnlkg9Y1FuDWO2kRuw",
  "access_expires_at": "2026-10-27T17:01:48.115066178Z",
  "refresh_token": "SfqixWq_QK0MV4h4LvxU6qlQYci36pG9igAl6jOXP5A",
  "refresh_expires_at": "2026-11-26T16:46:48.114069005Z",
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
  "device_ref": "sandbox-9885"
}
```

```json
{
  "challenge_id": "87d5f982-5a8f-4531-8c42-2a7b17d20c1e",
  "expires_at": "2026-10-27T16:51:48.182242662Z",
  "resend_available_at": "2026-10-27T16:46:49.182242662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "609317",
  "sent_at": "2026-10-27T16:46:48.18628647Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87d5f982-5a8f-4531-8c42-2a7b17d20c1e",
  "code": "609317",
  "device_ref": "sandbox-9885"
}
```

```json
{
  "session_id": "9bca3936-d9b1-473c-8f10-f824abc19f44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUwOCwiaWF0IjoxNzkzMTE5NjA4LCJqdGkiOiI0NTc0NzllOS05Y2I1LTRlZGYtOWVjOC1hYWQwZGExZDg2ZDQiLCJzaWQiOiI5YmNhMzkzNi1kOWIxLTQ3M2MtOGYxMC1mODI0YWJjMTlmNDQifQ.gpWaA-5pKeadaAgr7L7al8exMByR9yhMnUl79K5LL5M",
  "access_expires_at": "2026-10-27T17:01:48.255424746Z",
  "refresh_token": "LrBghb-XJnXBa69P269UPNAKpXhmBbW-b2IDOI15jgs",
  "refresh_expires_at": "2026-11-26T16:46:48.254446859Z",
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
  "session_id": "13fca72e-d1bb-4bf4-95c5-173be97678af",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MDgsImlhdCI6MTc5MzExOTYwOCwianRpIjoiNGY1NzdlZmQtMzFiOC00ZjQ5LWEyNjEtMTUyMDNkODhhZjY2Iiwic2lkIjoiMTNmY2E3MmUtZDFiYi00YmY0LTk1YzUtMTczYmU5NzY3OGFmIn0.09_KuLUOedeY5zAl2sH-Edp8fMjufbKe6nvfq0l3mXk",
  "access_expires_at": "2026-10-27T17:01:48.611674578Z",
  "refresh_token": "qDYdQQ2TkRNrOSyqRGuAI9phB9W5irC2ddVwd5FFqFE",
  "refresh_expires_at": "2026-10-28T04:46:48.610787623Z",
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
  "session_id": "848dcabc-463b-4282-895d-b54f7adecea3",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MDgsImlhdCI6MTc5MzExOTYwOCwianRpIjoiZjFiOWJkODktYjlmNi00NzM4LWE4ZjgtZmMyOGE5Y2U4ZmM0Iiwic2lkIjoiODQ4ZGNhYmMtNDYzYi00MjgyLTg5NWQtYjU0ZjdhZGVjZWEzIn0.U0WDQuFxhOZ9Lp2j8xIBxRmbWXGQHu5oBsnwYFBYHFI",
  "access_expires_at": "2026-10-27T17:01:48.939782753Z",
  "refresh_token": "rbxavANlJq7nI8pSX_RXcnh8da_cLom7RDkovCzESCc",
  "refresh_expires_at": "2026-10-28T04:46:48.938846646Z",
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
  "command_id": "7449af22-10dc-42c8-ba3c-442b0d4d1a53",
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
  "id": "42cd72bf-d65c-4f21-98ad-4a277dc3e3fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T16:51:49.023005Z",
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
  "command_id": "f66e1057-c96f-41ec-8ab7-79ee9d54b046",
  "quote_id": "42cd72bf-d65c-4f21-98ad-4a277dc3e3fe",
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
  "id": "58d1fb6c-4afb-482f-9b16-19b09e653644",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a417fb1-3229-4509-8587-3a2db7d6e211",
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
  "created_at": "2026-10-27T16:46:49.081327Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/58d1fb6c-4afb-482f-9b16-19b09e653644` → **200**

```json
{
  "id": "58d1fb6c-4afb-482f-9b16-19b09e653644",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a417fb1-3229-4509-8587-3a2db7d6e211",
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
  "created_at": "2026-10-27T16:46:49.081327Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/58d1fb6c-4afb-482f-9b16-19b09e653644/cancel` → **200**

```json
{
  "command_id": "acb89ee7-5091-41b2-aafc-967ddbc3059a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "58d1fb6c-4afb-482f-9b16-19b09e653644",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1a417fb1-3229-4509-8587-3a2db7d6e211",
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
  "created_at": "2026-10-27T16:46:49.081327Z",
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
  "command_id": "a6b069de-9dad-44cd-a53a-a258327406bb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:46:49Z",
    "sequence": 1793119609255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:46:49.277636Z",
  "last_location_at": "2026-10-27T16:46:49.277636Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4917"
}
```

```json
{
  "challenge_id": "c6d199b1-6586-4fed-83eb-6c8f374566e2",
  "expires_at": "2026-10-27T16:51:49.312000324Z",
  "resend_available_at": "2026-10-27T16:46:50.312000324Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "339182",
  "sent_at": "2026-10-27T16:46:49.315579173Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6d199b1-6586-4fed-83eb-6c8f374566e2",
  "code": "339182",
  "device_ref": "sandbox-4917"
}
```

```json
{
  "session_id": "5a8f14db-f433-410d-9495-8033f6d10aa3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUwOSwiaWF0IjoxNzkzMTE5NjA5LCJqdGkiOiI0NDYwYzNmZi01MTI3LTRjNzMtYjlhYy02NDdhMmQyOGNkMjciLCJzaWQiOiI1YThmMTRkYi1mNDMzLTQxMGQtOTQ5NS04MDMzZjZkMTBhYTMifQ.iO7MdqF9VB4lwETDQoqQEtPVD6wgrXcsEOs6EYXm9t8",
  "access_expires_at": "2026-10-27T17:01:49.381500017Z",
  "refresh_token": "LGa7VhvXbVcxbcnMOsWihHt4TGJeuzacYyaskz2kW-w",
  "refresh_expires_at": "2026-11-26T16:46:49.380659829Z",
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
  "command_id": "7d907047-5936-4e44-8142-5a781d8907ff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:46:49Z",
    "sequence": 1793119609442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41612de3-bd39-42c1-8fc6-8c9e7a16d3aa",
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
  "last_heartbeat_at": "2026-10-27T16:46:49.463915Z",
  "last_location_at": "2026-10-27T16:46:49.463915Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab4b8983-f76c-4b44-a9f7-4f258398b367",
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
  "id": "b2242038-a8e2-452b-9b0c-00f824b18066",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T16:51:49.510989Z",
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
  "command_id": "6c3ed39d-e65c-43ac-a6fb-00b21553ed00",
  "quote_id": "b2242038-a8e2-452b-9b0c-00f824b18066",
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
  "id": "c5f82311-7308-43c4-959c-aa5d89178d85",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a417fb1-3229-4509-8587-3a2db7d6e211",
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
  "created_at": "2026-10-27T16:46:49.55764Z",
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
    "id": "3ea5f33c-5543-4765-b75f-ec5403fecb1e",
    "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
    "expires_at": "2026-10-27T16:47:04.562496Z",
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

`POST /api/driver/v1/offers/3ea5f33c-5543-4765-b75f-ec5403fecb1e/accept` → **200**

```json
{
  "command_id": "b11a467f-aee7-4ff3-9bfc-3fd68564df7d"
}
```

```json
{
  "id": "9123096c-9a6e-4ccb-bc7d-2c8b1a5b19c4",
  "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dd707f57-91a1-4f2a-89cd-56950a19fc48",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dd707f57-91a1-4f2a-89cd-56950a19fc48",
  "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
  "assignment_id": "9123096c-9a6e-4ccb-bc7d-2c8b1a5b19c4",
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

`POST /api/driver/v1/trips/dd707f57-91a1-4f2a-89cd-56950a19fc48/cancel` → **200**

```json
{
  "command_id": "188c984e-22f7-4cd8-be7b-54cde63427b5",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "dd707f57-91a1-4f2a-89cd-56950a19fc48",
  "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
  "assignment_id": "9123096c-9a6e-4ccb-bc7d-2c8b1a5b19c4",
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

`GET /api/rider/v1/orders/c5f82311-7308-43c4-959c-aa5d89178d85` → **200**

```json
{
  "id": "c5f82311-7308-43c4-959c-aa5d89178d85",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1a417fb1-3229-4509-8587-3a2db7d6e211",
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
    "id": "9123096c-9a6e-4ccb-bc7d-2c8b1a5b19c4",
    "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dd707f57-91a1-4f2a-89cd-56950a19fc48",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T16:46:49.55764Z",
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
    "id": "1ea5389f-0aa8-458c-bb93-d0554dd3a433",
    "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
    "expires_at": "2026-10-27T16:47:04.755443Z",
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

`POST /api/driver/v1/offers/1ea5389f-0aa8-458c-bb93-d0554dd3a433/accept` → **200**

```json
{
  "command_id": "c7266472-4d87-4371-98c2-2cff73c178fb"
}
```

```json
{
  "id": "ee87dcba-4619-4b8f-aa3c-2325f9d1bdaa",
  "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f561da9e-39bb-43af-819f-7184920658ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f561da9e-39bb-43af-819f-7184920658ed",
  "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
  "assignment_id": "ee87dcba-4619-4b8f-aa3c-2325f9d1bdaa",
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

`POST /api/driver/v1/trips/f561da9e-39bb-43af-819f-7184920658ed/cancel` → **200**

```json
{
  "command_id": "69f84f5a-1f5d-449d-9fd5-23189cea1b16",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f561da9e-39bb-43af-819f-7184920658ed",
  "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
  "assignment_id": "ee87dcba-4619-4b8f-aa3c-2325f9d1bdaa",
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
    "id": "c5f82311-7308-43c4-959c-aa5d89178d85",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:46:49.55764Z",
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
    "id": "58d1fb6c-4afb-482f-9b16-19b09e653644",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:46:49.081327Z",
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

`GET /api/operator/v1/orders/c5f82311-7308-43c4-959c-aa5d89178d85/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:46:49.558471Z",
      "actor": {
        "type": "CLIENT",
        "id": "1a417fb1-3229-4509-8587-3a2db7d6e211",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
        "quote_id": "b2242038-a8e2-452b-9b0c-00f824b18066",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:46:49.561212Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
        "attempt_id": "a40c555a-3bec-4d9e-9e04-3365f9366e9f",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:46:49.568453Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3ea5f33c-5543-4765-b75f-ec5403fecb1e",
        "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:46:49.666504Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3ea5f33c-5543-4765-b75f-ec5403fecb1e",
        "order_id": "c5f82311-7308-43c4-959c-aa5d89178d85",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "9123096c-9a6e-4ccb-bc7d-2c8b1a5b19c4"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 58d1fb6c-4afb-482f-9b16-19b09e653644, c5f82311-7308-43c4-959c-aa5d89178d85.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734643224",
  "device_ref": "sandbox-22891"
}
```

```json
{
  "challenge_id": "e179d0ff-e3a1-46d8-8492-033e2c51af6f",
  "expires_at": "2026-10-27T16:51:50.099898444Z",
  "resend_available_at": "2026-10-27T16:46:51.099898444Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734643224` → **200**

```json
{
  "phone": "+380734643224",
  "audience": "CLIENT",
  "code": "587542",
  "sent_at": "2026-10-27T16:46:50.103098334Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e179d0ff-e3a1-46d8-8492-033e2c51af6f",
  "code": "587542",
  "device_ref": "sandbox-22891"
}
```

```json
{
  "session_id": "f14c2ce7-3c34-41f0-89a8-e0f161b35a49",
  "subject": {
    "type": "CLIENT",
    "id": "b753c0db-69e6-4a32-a73f-b4e034dfec0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzUzYzBkYi02OWU2LTRhMzItYTczZi1iNGUwMzRkZmVjMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTEwLCJpYXQiOjE3OTMxMTk2MTAsImp0aSI6IjIzOWFkMmUzLTJjZjQtNDVhNC1iNjdkLTUyOGNmMTQyMTBlNSIsInNpZCI6ImYxNGMyY2U3LTNjMzQtNDFmMC04OWE4LWUwZjE2MWIzNWE0OSJ9.W0B-BZL6WLV4duyA3IuTpUdAkv7K7vzBEUTFkcVRP6M",
  "access_expires_at": "2026-10-27T17:01:50.169022031Z",
  "refresh_token": "yjna6UrKRJ9JAaO_FwAiYq7CwFVmxxtsPDVBOkslA5I",
  "refresh_expires_at": "2026-11-26T16:46:50.168158309Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f1ac35eb-dec5-4b98-8437-a004e74c2525",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b374b107-d5dd-47e2-adec-033d24792e42",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b374b107-d5dd-47e2-adec-033d24792e42",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f67e29c669c8d4148956ef483dbcf487",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b374b107-d5dd-47e2-adec-033d24792e42",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734643224"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b374b107-d5dd-47e2-adec-033d24792e42",
  "expires_at": "2026-10-27T17:16:50.209917Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b374b107-d5dd-47e2-adec-033d24792e42` → **200**

```json
{
  "id": "b374b107-d5dd-47e2-adec-033d24792e42",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T17:16:50.209917Z",
  "card": {
    "id": "e9bff820-443b-4730-b1b7-1c5aa7967b87",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6856",
    "card_type": "Visa",
    "created_at": "2026-10-27T16:46:50.277403Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e9bff820-443b-4730-b1b7-1c5aa7967b87",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6856",
      "card_type": "Visa",
      "created_at": "2026-10-27T16:46:50.277403Z"
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
  "device_ref": "sandbox-28296"
}
```

```json
{
  "challenge_id": "de9a1374-cfad-44e4-9efa-0e044a33a346",
  "expires_at": "2026-10-27T16:51:50.368535694Z",
  "resend_available_at": "2026-10-27T16:46:51.368535694Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "289632",
  "sent_at": "2026-10-27T16:46:50.371830303Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de9a1374-cfad-44e4-9efa-0e044a33a346",
  "code": "289632",
  "device_ref": "sandbox-28296"
}
```

```json
{
  "session_id": "8c7d4d8b-dde0-4059-a7da-02ba5f1a10a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUxMCwiaWF0IjoxNzkzMTE5NjEwLCJqdGkiOiJjOWZmOTA3YS1hZjFlLTQ4NWEtODY0ZC01NDI3OGQ2ZTIxMDIiLCJzaWQiOiI4YzdkNGQ4Yi1kZGUwLTQwNTktYTdkYS0wMmJhNWYxYTEwYTgifQ.G27bIL9yWjrR4TNWFFnituvgSRhx9legekg30HCND20",
  "access_expires_at": "2026-10-27T17:01:50.437215645Z",
  "refresh_token": "Dc6AY6wctByULrpyB2FWJlLFaMPYEiokfwN8d_LBNuc",
  "refresh_expires_at": "2026-11-26T16:46:50.436508265Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41612de3-bd39-42c1-8fc6-8c9e7a16d3aa",
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
  "last_heartbeat_at": "2026-10-27T16:46:49.463915Z",
  "last_location_at": "2026-10-27T16:46:49.463915Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41612de3-bd39-42c1-8fc6-8c9e7a16d3aa/handover` → **200**

```json
{
  "command_id": "3e21cc84-6413-4f41-89f8-01d3d2543193",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41612de3-bd39-42c1-8fc6-8c9e7a16d3aa",
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
  "last_heartbeat_at": "2026-10-27T16:46:49.463915Z",
  "last_location_at": "2026-10-27T16:46:49.463915Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41612de3-bd39-42c1-8fc6-8c9e7a16d3aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:46:50Z",
    "sequence": 1793119610540
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41612de3-bd39-42c1-8fc6-8c9e7a16d3aa",
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
  "last_heartbeat_at": "2026-10-27T16:46:50.562919Z",
  "last_location_at": "2026-10-27T16:46:50.562919Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "01389f56-5c3d-4acf-9af2-6599a32f14dc",
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
  "id": "910788fb-a91c-4535-9882-3065c3f13329",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T16:51:50.606054Z",
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
  "command_id": "af7da783-6ba9-482c-aba0-24cf15d28368",
  "quote_id": "910788fb-a91c-4535-9882-3065c3f13329",
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
  "id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b753c0db-69e6-4a32-a73f-b4e034dfec0a",
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
  "created_at": "2026-10-27T16:46:50.654067Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727` → **200**

```json
{
  "id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b753c0db-69e6-4a32-a73f-b4e034dfec0a",
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
  "created_at": "2026-10-27T16:46:50.654067Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727` → **200**

```json
{
  "id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b753c0db-69e6-4a32-a73f-b4e034dfec0a",
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
  "created_at": "2026-10-27T16:46:50.654067Z",
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
    "id": "4e8d00c6-ca2c-4768-b440-ef64b03f0487",
    "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
    "expires_at": "2026-10-27T16:47:06.312556Z",
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

`POST /api/driver/v1/offers/4e8d00c6-ca2c-4768-b440-ef64b03f0487/accept` → **200**

```json
{
  "command_id": "c3dedcd0-7e4d-4c5e-93cb-2258569c569e"
}
```

```json
{
  "id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eb69f690-f27d-4e05-a18a-a76d53916190",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eb69f690-f27d-4e05-a18a-a76d53916190",
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "assignment_id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
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

`POST /api/driver/v1/work-sessions/41612de3-bd39-42c1-8fc6-8c9e7a16d3aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:46:51Z",
    "sequence": 1793119611867
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41612de3-bd39-42c1-8fc6-8c9e7a16d3aa",
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
  "last_heartbeat_at": "2026-10-27T16:46:51.891625Z",
  "last_location_at": "2026-10-27T16:46:51.891625Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/eb69f690-f27d-4e05-a18a-a76d53916190/arrive` → **200**

```json
{
  "command_id": "f91e2022-14dc-4991-b1c7-e0acc7786851",
  "expected_version": 0
}
```

```json
{
  "id": "eb69f690-f27d-4e05-a18a-a76d53916190",
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "assignment_id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
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
  "arrived_at": "2026-10-27T16:46:51.938959Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/eb69f690-f27d-4e05-a18a-a76d53916190/start` → **200**

```json
{
  "command_id": "889b9452-4098-4588-b55d-23ede69a6a4c",
  "expected_version": 1
}
```

```json
{
  "id": "eb69f690-f27d-4e05-a18a-a76d53916190",
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "assignment_id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
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
  "arrived_at": "2026-10-27T16:46:51.938959Z",
  "started_at": "2026-10-27T16:46:51.992156Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/eb69f690-f27d-4e05-a18a-a76d53916190/complete` → **200**

```json
{
  "command_id": "3a5edb0b-9ae5-40d4-8b7b-48894493b4bd",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:46:52Z"
}
```

```json
{
  "id": "eb69f690-f27d-4e05-a18a-a76d53916190",
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "assignment_id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
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
  "arrived_at": "2026-10-27T16:46:51.938959Z",
  "started_at": "2026-10-27T16:46:51.992156Z",
  "completed_at": "2026-10-27T16:46:52.054554Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727` → **200**

```json
{
  "id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b753c0db-69e6-4a32-a73f-b4e034dfec0a",
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
    "id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
    "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "eb69f690-f27d-4e05-a18a-a76d53916190",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:46:50.654067Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727` → **200**

```json
{
  "id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b753c0db-69e6-4a32-a73f-b4e034dfec0a",
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
    "id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
    "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "eb69f690-f27d-4e05-a18a-a76d53916190",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:46:50.654067Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727` → **200**

```json
{
  "id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b753c0db-69e6-4a32-a73f-b4e034dfec0a",
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
    "id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
    "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "eb69f690-f27d-4e05-a18a-a76d53916190",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:46:50.654067Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727` → **200**

```json
{
  "id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b753c0db-69e6-4a32-a73f-b4e034dfec0a",
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
    "id": "cea2a8c2-c263-44c6-b942-1273abe1585c",
    "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "eb69f690-f27d-4e05-a18a-a76d53916190",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:46:50.654067Z",
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
      "id": "2fd3d250-4a2c-4029-a97d-205bb43361cf",
      "at": "2026-10-27T16:46:52.356909Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727/tip` → **200**

```json
{
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
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
  "available_until": "2026-10-28T16:46:52.054554Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727/tip` → **201**

```json
{
  "command_id": "9c22577b-249a-4920-ab4a-8f9099028573",
  "amount_minor": 2500
}
```

```json
{
  "id": "ed4af2df-f006-4b79-8d4a-d6b19abca37a",
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T16:46:55.349972Z"
}
```

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727/tip` → **200**

```json
{
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
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
  "available_until": "2026-10-28T16:46:52.054554Z",
  "open": false,
  "tip": {
    "id": "ed4af2df-f006-4b79-8d4a-d6b19abca37a",
    "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T16:46:55.349972Z"
  }
}
```

`GET /api/rider/v1/orders/d64724a2-0f33-4f82-8d69-252398cb9727/tip` → **200**

```json
{
  "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
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
  "available_until": "2026-10-28T16:46:52.054554Z",
  "open": false,
  "tip": {
    "id": "ed4af2df-f006-4b79-8d4a-d6b19abca37a",
    "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T16:46:55.349972Z"
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
      "id": "ec341f0c-8e62-4794-bc2f-e9388e07627d",
      "at": "2026-10-27T16:46:56.438941Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
      "counterpart_id": null
    },
    {
      "id": "2fd3d250-4a2c-4029-a97d-205bb43361cf",
      "at": "2026-10-27T16:46:52.356909Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d64724a2-0f33-4f82-8d69-252398cb9727",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41612de3-bd39-42c1-8fc6-8c9e7a16d3aa",
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
  "last_heartbeat_at": "2026-10-27T16:46:51.891625Z",
  "last_location_at": "2026-10-27T16:46:51.891625Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41612de3-bd39-42c1-8fc6-8c9e7a16d3aa/close` → **200**

```json
{
  "command_id": "5eb35522-c46b-443b-a8fc-ed26b22919ad",
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

Done: card order d64724a2-0f33-4f82-8d69-252398cb9727.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736776609",
  "device_ref": "sandbox-22736"
}
```

```json
{
  "challenge_id": "43b4f5a3-9e18-4694-b28b-d314b11cfa47",
  "expires_at": "2026-10-27T16:51:56.572963337Z",
  "resend_available_at": "2026-10-27T16:46:57.572963337Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736776609` → **200**

```json
{
  "phone": "+380736776609",
  "audience": "CLIENT",
  "code": "345966",
  "sent_at": "2026-10-27T16:46:56.576178617Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43b4f5a3-9e18-4694-b28b-d314b11cfa47",
  "code": "345966",
  "device_ref": "sandbox-22736"
}
```

```json
{
  "session_id": "d062c38f-b116-4a25-97c7-47a81ab4dfa6",
  "subject": {
    "type": "CLIENT",
    "id": "d49631fd-e296-4166-83c1-48490420a79f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNDk2MzFmZC1lMjk2LTQxNjYtODNjMS00ODQ5MDQyMGE3OWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTE2LCJpYXQiOjE3OTMxMTk2MTYsImp0aSI6IjNiZDhiM2YyLWRmYmMtNGNhNi05ZDA4LWM0MzdlZWQzZTVmYyIsInNpZCI6ImQwNjJjMzhmLWIxMTYtNGEyNS05N2M3LTQ3YTgxYWI0ZGZhNiJ9.hNadz9uVZ1KDarZvAeAr-8GxDZx4n8yCHZ30NYUWzT4",
  "access_expires_at": "2026-10-27T17:01:56.640970042Z",
  "refresh_token": "smzY8YcqANlN3NPVbfsQWdbB9amD1G-3FJQbkQAQn3k",
  "refresh_expires_at": "2026-11-26T16:46:56.639785024Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "123aae86-1ab0-4b21-8da4-7322bccd78f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "b2deadd2-8c54-4cc3-8b24-4e6a6ee1f6c8",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b2deadd2-8c54-4cc3-8b24-4e6a6ee1f6c8",
    "orderDate": "1793119616",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "dd349f1a2ea2ec42bd7c4c14cf878616",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b2deadd2-8c54-4cc3-8b24-4e6a6ee1f6c8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736776609"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b2deadd2-8c54-4cc3-8b24-4e6a6ee1f6c8",
  "created_at": "2026-10-27T16:46:56.683506Z",
  "expires_at": "2026-10-27T17:16:56.683506Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/b2deadd2-8c54-4cc3-8b24-4e6a6ee1f6c8` → **200**

```json
{
  "id": "b2deadd2-8c54-4cc3-8b24-4e6a6ee1f6c8",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T16:46:56.683506Z",
  "expires_at": "2026-10-27T17:16:56.683506Z",
  "completed_at": "2026-10-27T16:46:56.725696Z",
  "masked_pan": "41****7588",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d49631fd-e296-4166-83c1-48490420a79f",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d49631fd-e296-4166-83c1-48490420a79f",
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
      "id": "9717bb87-11c1-45f4-a576-c2adbc9c7a61",
      "at": "2026-10-27T16:46:57.454613Z",
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
  "client_id": "d49631fd-e296-4166-83c1-48490420a79f",
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
      "id": "9717bb87-11c1-45f4-a576-c2adbc9c7a61",
      "at": "2026-10-27T16:46:57.454613Z",
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
  "device_ref": "sandbox-11338"
}
```

```json
{
  "challenge_id": "5d68682a-5cd6-4f3a-b07b-9356bec1de5c",
  "expires_at": "2026-10-27T16:51:57.883667677Z",
  "resend_available_at": "2026-10-27T16:46:58.883667677Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "668803",
  "sent_at": "2026-10-27T16:46:57.886878678Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d68682a-5cd6-4f3a-b07b-9356bec1de5c",
  "code": "668803",
  "device_ref": "sandbox-11338"
}
```

```json
{
  "session_id": "52d208eb-4161-47f7-a633-9866b1fe8bcc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUxNywiaWF0IjoxNzkzMTE5NjE3LCJqdGkiOiI5MWU2YTU4Mi1kNzQ1LTQ3NWUtYTA4Ny1kYzU3Y2RiNjVhODgiLCJzaWQiOiI1MmQyMDhlYi00MTYxLTQ3ZjctYTYzMy05ODY2YjFmZThiY2MifQ.a2JzzWK1jYL9WmQyahPi2k5XvTUFrPwL6aphq8k4rRM",
  "access_expires_at": "2026-10-27T17:01:57.953347145Z",
  "refresh_token": "eZFhbG8vLR-m4UqvMYkWNvsBiCysQhMMAlNtxS18WP0",
  "refresh_expires_at": "2026-11-26T16:46:57.952684088Z",
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
  "command_id": "3edcbcf0-9154-4d40-8957-f4e7a8d8794e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "07da38e3-6e70-463e-937a-9f47cefe8095",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-07da38e3-6e70-463e-937a-9f47cefe8095",
    "orderDate": "1793119618",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "2a574c573537eeced399c8b849fcda20",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=07da38e3-6e70-463e-937a-9f47cefe8095",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=07da38e3-6e70-463e-937a-9f47cefe8095",
  "created_at": "2026-10-27T16:46:58.019548Z",
  "expires_at": "2026-10-27T17:16:58.019548Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/07da38e3-6e70-463e-937a-9f47cefe8095` → **200**

```json
{
  "id": "07da38e3-6e70-463e-937a-9f47cefe8095",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T16:46:58.019548Z",
  "expires_at": "2026-10-27T17:16:58.019548Z",
  "completed_at": "2026-10-27T16:46:58.057236Z",
  "masked_pan": "41****4289",
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
      "id": "8f708b36-9d10-45bb-a015-1773385371c7",
      "at": "2026-10-27T16:46:58.465441Z",
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
  "command_id": "79dda947-9172-4305-88ca-60f267bcb5a8",
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
  "correlation_id": "59a29da6-dd36-47ef-be75-cbe4fa5a3475"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670970898",
  "device_ref": "sandbox-7758"
}
```

```json
{
  "challenge_id": "ce4b3442-8536-4ac1-b7ba-c83b569027e6",
  "expires_at": "2026-10-27T16:51:59.254204619Z",
  "resend_available_at": "2026-10-27T16:47:00.254204619Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670970898` → **200**

```json
{
  "phone": "+380670970898",
  "audience": "CLIENT",
  "code": "811100",
  "sent_at": "2026-10-27T16:46:59.257162398Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce4b3442-8536-4ac1-b7ba-c83b569027e6",
  "code": "811100",
  "device_ref": "sandbox-7758"
}
```

```json
{
  "session_id": "e8252590-6ac1-4b5f-a57e-f78cbebbc5e3",
  "subject": {
    "type": "CLIENT",
    "id": "cc8b91f0-58b3-4312-b8a1-942e94865197"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYzhiOTFmMC01OGIzLTQzMTItYjhhMS05NDJlOTQ4NjUxOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTE5LCJpYXQiOjE3OTMxMTk2MTksImp0aSI6IjRlMDg2ODkyLTU2ZWEtNGQ4Yy1hNDdkLTllMmMyNDVlYTJmZSIsInNpZCI6ImU4MjUyNTkwLTZhYzEtNGI1Zi1hNTdlLWY3OGNiZWJiYzVlMyJ9.QBeNI9avSJfTReinTdOYmsQp3maRJszXxJpClK_Qvq4",
  "access_expires_at": "2026-10-27T17:01:59.320761761Z",
  "refresh_token": "NClqYw4NQLpCPT6Z9GubhZMk5rLLLA_UEtl6Ig0aut0",
  "refresh_expires_at": "2026-11-26T16:46:59.320046967Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cc8b91f0-58b3-4312-b8a1-942e94865197",
  "session_id": "e8252590-6ac1-4b5f-a57e-f78cbebbc5e3",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b55f53d8-db6f-447b-9b89-a3741db845ac",
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
  "id": "d8e107f5-caf1-4cb3-ad95-c040ecdda751",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:51:59.390662Z",
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
  "challenge_id": "00030171-3b5a-4830-8c9d-efad514e8acd",
  "expires_at": "2026-10-27T16:52:01.434429576Z",
  "resend_available_at": "2026-10-27T16:47:02.434429576Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670970898` → **200**

```json
{
  "phone": "+380670970898",
  "audience": "CLIENT",
  "code": "731100",
  "sent_at": "2026-10-27T16:47:01.437337878Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "ed12ac2e-2152-4977-ab15-b7878f34557a",
  "challenge_id": "00030171-3b5a-4830-8c9d-efad514e8acd",
  "otp_code": "731100"
}
```

```json
{
  "client_id": "cc8b91f0-58b3-4312-b8a1-942e94865197",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T16:47:01.516191521Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "41ed5c6a-23bc-4fd6-b867-1d93b58a127a",
  "quote_id": "d8e107f5-caf1-4cb3-ad95-c040ecdda751",
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
  "correlation_id": "9221931d-5056-4b1c-82b4-8a81bc61ea46"
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
  "session_id": "d7ff9e0f-7488-4ea1-b1ce-e0bc95641699",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MjEsImlhdCI6MTc5MzExOTYyMSwianRpIjoiZGU3Zjk3NDItNTkxZC00NWFhLWI3NGUtZTk1YmJlZmQxYzg0Iiwic2lkIjoiZDdmZjllMGYtNzQ4OC00ZWExLWIxY2UtZTBiYzk1NjQxNjk5In0.XRMuBry2j0b9v0bX30IHg7Sg_e-apTTkR6aiUeSaXqE",
  "access_expires_at": "2026-10-27T17:02:01.894629572Z",
  "refresh_token": "jrSLIK_BdxPDrTk8t0VGkajaQ3vaR4z9F3etVRS-7IY",
  "refresh_expires_at": "2026-10-28T04:47:01.893826112Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "cc8b91f0-58b3-4312-b8a1-942e94865197",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T16:47:01.516192Z",
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

`POST /api/admin/v1/client-deletions/cc8b91f0-58b3-4312-b8a1-942e94865197/complete` → **200**

```json
{
  "command_id": "9502f1d2-5140-4fde-9969-10cd1a0691d7",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "cc8b91f0-58b3-4312-b8a1-942e94865197",
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
  "correlation_id": "2452c912-58e8-40d9-af34-6e57f6371451"
}
```

Done: client cc8b91f0-58b3-4312-b8a1-942e94865197 anonymized.

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
  "device_ref": "sandbox-3347"
}
```

```json
{
  "challenge_id": "15e2a876-cd75-4ec6-8083-dfc6c4a8bcb0",
  "expires_at": "2026-10-27T16:52:02.106901188Z",
  "resend_available_at": "2026-10-27T16:47:03.106901188Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "105115",
  "sent_at": "2026-10-27T16:47:02.11052159Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15e2a876-cd75-4ec6-8083-dfc6c4a8bcb0",
  "code": "105115",
  "device_ref": "sandbox-3347"
}
```

```json
{
  "session_id": "cc239980-2be2-46ab-82b5-a9a6ee7b1120",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUyMiwiaWF0IjoxNzkzMTE5NjIyLCJqdGkiOiI5YzU5YmRjZC1iZTdhLTQwMzUtODY2MS0xZWFjMjNjOTA5ZDEiLCJzaWQiOiJjYzIzOTk4MC0yYmUyLTQ2YWItODJiNS1hOWE2ZWU3YjExMjAifQ.2g2Aje62fYMDHKsJB1Fxow6A-Wh2JfksMgEMEh4VmZM",
  "access_expires_at": "2026-10-27T17:02:02.176702597Z",
  "refresh_token": "kD8WPpXpC0gC5Cf2uSJYV2_rj2Ew5IUOoZtPQMhAhlI",
  "refresh_expires_at": "2026-11-26T16:47:02.176108508Z",
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
  "command_id": "752d1ef7-0d54-40c5-9cfa-a34d84584149",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:02Z",
    "sequence": 1793119622235
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:02.259138Z",
  "last_location_at": "2026-10-27T16:47:02.259138Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678883937",
  "device_ref": "sandbox-22594"
}
```

```json
{
  "challenge_id": "f6a0c64f-e410-4859-b7eb-598132f0a854",
  "expires_at": "2026-10-27T16:52:02.2972784Z",
  "resend_available_at": "2026-10-27T16:47:03.2972784Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678883937` → **200**

```json
{
  "phone": "+380678883937",
  "audience": "CLIENT",
  "code": "525043",
  "sent_at": "2026-10-27T16:47:02.300103319Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6a0c64f-e410-4859-b7eb-598132f0a854",
  "code": "525043",
  "device_ref": "sandbox-22594"
}
```

```json
{
  "session_id": "d6aaf711-8207-4b53-8faf-2bbfea87a17e",
  "subject": {
    "type": "CLIENT",
    "id": "55db55e3-7cb2-4c2b-ac49-b154738a3c71"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWRiNTVlMy03Y2IyLTRjMmItYWM0OS1iMTU0NzM4YTNjNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTIyLCJpYXQiOjE3OTMxMTk2MjIsImp0aSI6IjAxMjA5Mjk2LTllNWQtNGExYi1hYzI5LTMzYWE1NGE2MTJlOCIsInNpZCI6ImQ2YWFmNzExLTgyMDctNGI1My04ZmFmLTJiYmZlYTg3YTE3ZSJ9.wwSifeYhTBc6N9jNuLbuyGSnuK2JjedZ8jCX27B1jrg",
  "access_expires_at": "2026-10-27T17:02:02.368112161Z",
  "refresh_token": "pfIyRIxmPFW7nv0b8L_Qlh1WlyW6hlnYq4GuqC0Hz0A",
  "refresh_expires_at": "2026-11-26T16:47:02.367338507Z",
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
  "command_id": "2f9b8476-9384-43aa-91d1-10c5c33614ca",
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
  "id": "32c69581-31d8-4b84-98a4-76cf7d0eefd1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:52:02.444193Z",
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
  "command_id": "10fe85c5-b7b0-4090-8df4-613d2caf5139",
  "platform": "ANDROID",
  "token": "sandbox-driver-60d2b76e-8f86-45a0-8186-e82cb3f3caf9"
}
```

```json
{
  "id": "d2a3febb-bf55-4afa-bbed-bc0b1bb546d2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T16:47:02.498702Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "de8b0999-fa13-4eda-a12d-a32f7f942976",
  "platform": "ANDROID",
  "token": "sandbox-rider-b8f00bc3-5193-4957-973b-fd246d04fa38"
}
```

```json
{
  "id": "5c357bc6-5fe9-4e04-8d67-fc90e6f581fb",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T16:47:02.541911Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "033fbb7f-a892-49db-912d-1757404d90b7",
  "quote_id": "32c69581-31d8-4b84-98a4-76cf7d0eefd1",
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
  "id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55db55e3-7cb2-4c2b-ac49-b154738a3c71",
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
  "created_at": "2026-10-27T16:47:02.590883Z",
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
    "id": "d3a0b8b1-2feb-4a7c-aac9-e2c89493c6b1",
    "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
    "expires_at": "2026-10-27T16:47:17.595613Z",
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

`POST /api/driver/v1/offers/d3a0b8b1-2feb-4a7c-aac9-e2c89493c6b1/accept` → **200**

```json
{
  "command_id": "1b304282-e517-403b-9c60-fc322b50dc38"
}
```

```json
{
  "id": "8b6beb22-a953-4ffc-ad24-e866472d0c88",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "580a58a3-3601-454f-a4ab-a5deba5645ba",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:47:02.563Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:47:02.563Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T16:47:02.563Z` → **200**

```json
[
  {
    "at": "2026-10-27T16:47:04.172167272Z",
    "token_suffix": "f3caf9",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "a23a8ffc-01a0-4cc2-bb6a-bc82c9c9acb5",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678883937&after=2026-10-27T16:47:02.563Z` → **200**

```json
[
  {
    "at": "2026-10-27T16:47:04.169081995Z",
    "token_suffix": "04fa38",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "ae773b30-3849-4909-bd2e-00b834bcea6a",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/ed2e58e6-7751-445a-98c5-5fded73f1e51/messages` → **201**

```json
{
  "command_id": "d41055f5-d96b-4339-99b7-e20e991dbe15",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "3d197764-7052-4e05-b48d-70af626f752c",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T16:47:04.846100817Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "580a58a3-3601-454f-a4ab-a5deba5645ba",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "assignment_id": "8b6beb22-a953-4ffc-ad24-e866472d0c88",
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

`POST /api/driver/v1/trips/580a58a3-3601-454f-a4ab-a5deba5645ba/messages` → **201**

```json
{
  "command_id": "e5e11de5-8b93-4fa7-8746-aeeee6145544",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d3d863bc-7deb-4733-8a2f-fa3f19f423ba",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T16:47:04.908632362Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/ed2e58e6-7751-445a-98c5-5fded73f1e51/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/580a58a3-3601-454f-a4ab-a5deba5645ba/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678883937"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:04Z",
    "sequence": 1793119624999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:05.021666Z",
  "last_location_at": "2026-10-27T16:47:05.021666Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "580a58a3-3601-454f-a4ab-a5deba5645ba",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "assignment_id": "8b6beb22-a953-4ffc-ad24-e866472d0c88",
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

`POST /api/driver/v1/trips/580a58a3-3601-454f-a4ab-a5deba5645ba/arrive` → **200**

```json
{
  "command_id": "7308a928-144a-45df-9875-67fd57dc8d8d",
  "expected_version": 0
}
```

```json
{
  "id": "580a58a3-3601-454f-a4ab-a5deba5645ba",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "assignment_id": "8b6beb22-a953-4ffc-ad24-e866472d0c88",
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
  "arrived_at": "2026-10-27T16:47:05.085329Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/580a58a3-3601-454f-a4ab-a5deba5645ba/start` → **200**

```json
{
  "command_id": "3a30daa7-b771-4962-b7de-8ef90f643da1",
  "expected_version": 1
}
```

```json
{
  "id": "580a58a3-3601-454f-a4ab-a5deba5645ba",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "assignment_id": "8b6beb22-a953-4ffc-ad24-e866472d0c88",
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
  "arrived_at": "2026-10-27T16:47:05.085329Z",
  "started_at": "2026-10-27T16:47:05.125773Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:05Z",
    "sequence": 1793119625154
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:05.17634Z",
  "last_location_at": "2026-10-27T16:47:05.17634Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/580a58a3-3601-454f-a4ab-a5deba5645ba/complete` → **200**

```json
{
  "command_id": "e11ea646-2250-4ff7-b3b4-557e2968acff",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:47:05Z",
  "cash_received": true
}
```

```json
{
  "id": "580a58a3-3601-454f-a4ab-a5deba5645ba",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "assignment_id": "8b6beb22-a953-4ffc-ad24-e866472d0c88",
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
  "arrived_at": "2026-10-27T16:47:05.085329Z",
  "started_at": "2026-10-27T16:47:05.125773Z",
  "completed_at": "2026-10-27T16:47:05.219278Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/ed2e58e6-7751-445a-98c5-5fded73f1e51` → **200**

```json
{
  "id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "55db55e3-7cb2-4c2b-ac49-b154738a3c71",
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
    "id": "8b6beb22-a953-4ffc-ad24-e866472d0c88",
    "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "580a58a3-3601-454f-a4ab-a5deba5645ba",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:47:02.590883Z",
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
    "id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T16:47:02.590883Z",
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
    "id": "580a58a3-3601-454f-a4ab-a5deba5645ba",
    "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
    "order_short_number": 5,
    "created_at": "2026-10-27T16:47:02.671261Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9d8a598f-91cf-47dd-9f2c-311692ff4a21",
    "order_id": "a15000a5-2a9f-49c8-ab4a-63c6bf3b6ca1",
    "order_short_number": 1,
    "created_at": "2026-10-27T16:46:44.480749Z",
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

`GET /api/rider/v1/orders/ed2e58e6-7751-445a-98c5-5fded73f1e51/tip` → **200**

```json
{
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
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
  "available_until": "2026-10-28T16:47:05.219278Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ed2e58e6-7751-445a-98c5-5fded73f1e51/tip` → **201**

```json
{
  "command_id": "08ed1403-b951-4d14-ad81-0e33fb4ed410",
  "amount_minor": 1100
}
```

```json
{
  "id": "1d0d3a73-e1d9-43a0-9209-eccc1e2642ff",
  "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T16:47:08.460905Z"
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
  "session_id": "511e5b2c-e579-4bc4-a96e-501b421e4238",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MjgsImlhdCI6MTc5MzExOTYyOCwianRpIjoiNmVmNjcyMTQtOTI5NS00NTljLWE1YjEtZDI5OGNmMjY2OThiIiwic2lkIjoiNTExZTViMmMtZTU3OS00YmM0LWE5NmUtNTAxYjQyMWU0MjM4In0.Ql0niUEXY-AVQxM6IYXjkt5YOa_IZpMsI5o8eZh7lKg",
  "access_expires_at": "2026-10-27T17:02:08.796515627Z",
  "refresh_token": "rrS-Wu9GGG3EH1JnaDMLjUFM-hbt-DkpnjJyFiduDzU",
  "refresh_expires_at": "2026-10-28T04:47:08.795809783Z",
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
  "session_id": "66cd7b3c-6cdf-4111-b88b-01945642193b",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MjksImlhdCI6MTc5MzExOTYyOSwianRpIjoiMTEyYTkxZjctYTY5Ni00N2ZkLWFmNTQtMjU3YWQyN2Q0ZDNhIiwic2lkIjoiNjZjZDdiM2MtNmNkZi00MTExLWI4OGItMDE5NDU2NDIxOTNiIn0.6vMvKzqmEeqADNA4omYOsSYrv54DyXREuQD5yYptElk",
  "access_expires_at": "2026-10-27T17:02:09.120589821Z",
  "refresh_token": "uaaV1YLHlt16aMxz3wFU6GrvgYXJx39Lud20iCieq74",
  "refresh_expires_at": "2026-10-28T04:47:09.119994149Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ed2e58e6-7751-445a-98c5-5fded73f1e51/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:47:02.591671Z",
      "actor": {
        "type": "CLIENT",
        "id": "55db55e3-7cb2-4c2b-ac49-b154738a3c71",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
        "quote_id": "32c69581-31d8-4b84-98a4-76cf7d0eefd1",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:47:02.594152Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
        "attempt_id": "cc224c0d-a624-48ca-b664-eeafb3d21d14",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:47:02.60137Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d3a0b8b1-2feb-4a7c-aac9-e2c89493c6b1",
        "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:47:02.673512Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d3a0b8b1-2feb-4a7c-aac9-e2c89493c6b1",
        "order_id": "ed2e58e6-7751-445a-98c5-5fded73f1e51",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8b6beb22-a953-4ffc-ad24-e866472d0c88"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order ed2e58e6-7751-445a-98c5-5fded73f1e51.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16358"
}
```

```json
{
  "challenge_id": "e3da1090-4c42-4bd9-acd5-c0be969b99d6",
  "expires_at": "2026-10-27T16:52:09.199168973Z",
  "resend_available_at": "2026-10-27T16:47:10.199168973Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "165414",
  "sent_at": "2026-10-27T16:47:09.201661574Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3da1090-4c42-4bd9-acd5-c0be969b99d6",
  "code": "165414",
  "device_ref": "sandbox-16358"
}
```

```json
{
  "session_id": "55e413d8-dcb2-44d3-9825-6ccb2a941dd4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUyOSwiaWF0IjoxNzkzMTE5NjI5LCJqdGkiOiI5MDVkMDBlMS03NWJlLTQzMjYtOTYyYy01MTczZWQzNGI0NmYiLCJzaWQiOiI1NWU0MTNkOC1kY2IyLTQ0ZDMtOTgyNS02Y2NiMmE5NDFkZDQifQ.6M6Q8Xbvt7kJ0VmTrHg7qEA_yE-_LUqiwLWgRoyQoIc",
  "access_expires_at": "2026-10-27T17:02:09.26405073Z",
  "refresh_token": "iMzohNXKwrTa-OhHj9VEzrWRww_W12hKYlORljxGSrM",
  "refresh_expires_at": "2026-11-26T16:47:09.263453546Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:05.17634Z",
  "last_location_at": "2026-10-27T16:47:05.17634Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/handover` → **200**

```json
{
  "command_id": "00fff038-3a81-4b5e-9a50-6a2000b1f72c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:05.17634Z",
  "last_location_at": "2026-10-27T16:47:05.17634Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:09Z",
    "sequence": 1793119629371
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:09.39407Z",
  "last_location_at": "2026-10-27T16:47:09.39407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663186421",
  "device_ref": "sandbox-32411"
}
```

```json
{
  "challenge_id": "58f13926-0efe-44ee-bdc0-2981ab99f11c",
  "expires_at": "2026-10-27T16:52:09.42190618Z",
  "resend_available_at": "2026-10-27T16:47:10.42190618Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663186421` → **200**

```json
{
  "phone": "+380663186421",
  "audience": "CLIENT",
  "code": "145025",
  "sent_at": "2026-10-27T16:47:09.424341094Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58f13926-0efe-44ee-bdc0-2981ab99f11c",
  "code": "145025",
  "device_ref": "sandbox-32411"
}
```

```json
{
  "session_id": "ab3582e3-2020-4036-b4c7-5626c4c58b1b",
  "subject": {
    "type": "CLIENT",
    "id": "447802e7-ae59-4c2d-bae4-144de02817d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDc4MDJlNy1hZTU5LTRjMmQtYmFlNC0xNDRkZTAyODE3ZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTI5LCJpYXQiOjE3OTMxMTk2MjksImp0aSI6IjUzNjA4YmY0LTBmODQtNDcwNi1hMDI1LWE3NTc5ZTc0NmMxYyIsInNpZCI6ImFiMzU4MmUzLTIwMjAtNDAzNi1iNGM3LTU2MjZjNGM1OGIxYiJ9.3CoZBjM4hX3EKDGOMJbhOiQMycYJpJXvKf62rq8aMZM",
  "access_expires_at": "2026-10-27T17:02:09.486431885Z",
  "refresh_token": "xSuOwChuOIkIDqxOougBpWeVDBBc_UKuWLEWuY9HAKI",
  "refresh_expires_at": "2026-11-26T16:47:09.485830764Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da5193dc-65ba-4495-ad01-632908ec38ff",
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
  "id": "6f5412f9-fd29-4406-a72e-38b962d736b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T16:52:09.527406Z",
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
  "command_id": "1407eb91-3da8-4b9f-8567-648dfc2eb063",
  "quote_id": "6f5412f9-fd29-4406-a72e-38b962d736b3",
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
  "id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "447802e7-ae59-4c2d-bae4-144de02817d3",
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
  "created_at": "2026-10-27T16:47:09.573704Z",
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
    "id": "489828a8-c121-4204-a857-bc703ad73caa",
    "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
    "expires_at": "2026-10-27T16:47:24.577199Z",
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

`POST /api/driver/v1/offers/489828a8-c121-4204-a857-bc703ad73caa/accept` → **200**

```json
{
  "command_id": "67c3cce6-ec0b-41c0-880f-5473216918f0"
}
```

```json
{
  "id": "aa05b524-7310-4b90-b8ff-dc64ff60dbfb",
  "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ba4b541-ef6c-4d17-a08e-1d889207458e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ba4b541-ef6c-4d17-a08e-1d889207458e",
  "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
  "assignment_id": "aa05b524-7310-4b90-b8ff-dc64ff60dbfb",
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

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:09Z",
    "sequence": 1793119629703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:09.726385Z",
  "last_location_at": "2026-10-27T16:47:09.726385Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8ba4b541-ef6c-4d17-a08e-1d889207458e/arrive` → **200**

```json
{
  "command_id": "d0ebc5c4-70d8-4fc0-b96d-1cc5506664cb",
  "expected_version": 0
}
```

```json
{
  "id": "8ba4b541-ef6c-4d17-a08e-1d889207458e",
  "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
  "assignment_id": "aa05b524-7310-4b90-b8ff-dc64ff60dbfb",
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
  "arrived_at": "2026-10-27T16:47:09.769922Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8ba4b541-ef6c-4d17-a08e-1d889207458e/start` → **200**

```json
{
  "command_id": "49d6a1fb-a10d-470e-8b73-f08959e2a9a6",
  "expected_version": 1
}
```

```json
{
  "id": "8ba4b541-ef6c-4d17-a08e-1d889207458e",
  "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
  "assignment_id": "aa05b524-7310-4b90-b8ff-dc64ff60dbfb",
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
  "arrived_at": "2026-10-27T16:47:09.769922Z",
  "started_at": "2026-10-27T16:47:09.813002Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:09Z",
    "sequence": 1793119629842
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:09.864459Z",
  "last_location_at": "2026-10-27T16:47:09.864459Z",
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
  "device_ref": "sandbox-4911"
}
```

```json
{
  "challenge_id": "096a682d-d933-4517-916d-82e8a9f1149b",
  "expires_at": "2026-10-27T16:52:09.892373601Z",
  "resend_available_at": "2026-10-27T16:47:10.892373601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "949209",
  "sent_at": "2026-10-27T16:47:09.895202439Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "096a682d-d933-4517-916d-82e8a9f1149b",
  "code": "949209",
  "device_ref": "sandbox-4911"
}
```

```json
{
  "session_id": "9650a8fc-a91d-4188-9828-6fd2f77a4430",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUyOSwiaWF0IjoxNzkzMTE5NjI5LCJqdGkiOiI2YzM4YmVkNC04MjBlLTRhYmQtOWRjOS1lODRhZjRhNzIzNWUiLCJzaWQiOiI5NjUwYThmYy1hOTFkLTQxODgtOTgyOC02ZmQyZjc3YTQ0MzAifQ.irB2MIaZQV5C8bFGghw4Duz4lij0E5lwWiOPraUtVhQ",
  "access_expires_at": "2026-10-27T17:02:09.957595756Z",
  "refresh_token": "XxMbEUV9NNe4b9mUNp4GYiYSMGUow-yM-X25GlsH2S0",
  "refresh_expires_at": "2026-11-26T16:47:09.957011486Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:46:49.277636Z",
  "last_location_at": "2026-10-27T16:46:49.277636Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bf6047a1-d9a6-4186-a598-17bb3d6057e9/handover` → **200**

```json
{
  "command_id": "7c9c60e4-fa6e-4c26-912f-7cdece4a77b7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:46:49.277636Z",
  "last_location_at": "2026-10-27T16:46:49.277636Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bf6047a1-d9a6-4186-a598-17bb3d6057e9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:10Z",
    "sequence": 1793119630580
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:47:10.082254Z",
  "last_location_at": "2026-10-27T16:47:10.082254Z",
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
  "session_id": "d7604809-f120-4e87-9400-e2095e247c34",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MzAsImlhdCI6MTc5MzExOTYzMCwianRpIjoiYWVkOWVkNjEtMWViYi00NWRkLThkMjYtMzI0ZTM2YWMwZGEyIiwic2lkIjoiZDc2MDQ4MDktZjEyMC00ZTg3LTk0MDAtZTIwOTVlMjQ3YzM0In0.9LrqtdPWYdoiHrwJ8_qoeGDvUUy3_DppgPtjzSHzRiI",
  "access_expires_at": "2026-10-27T17:02:10.411196367Z",
  "refresh_token": "Zpjt5Lk_6DRc67OvXuvYSaZpxsO5hQvvlkKuS8d6NRQ",
  "refresh_expires_at": "2026-10-28T04:47:10.41039944Z",
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
  "session_id": "5c4ffac7-0870-4949-b14f-904a29f380b8",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MzAsImlhdCI6MTc5MzExOTYzMCwianRpIjoiZGNlMzk4ZDAtOTYwNi00ZGEwLWIzODEtN2M3YjI4MDIyMDhmIiwic2lkIjoiNWM0ZmZhYzctMDg3MC00OTQ5LWIxNGYtOTA0YTI5ZjM4MGI4In0.kGm6Z6F4KkVL1BHLnobxb9V790EB8jLWezlXFQ8nkYg",
  "access_expires_at": "2026-10-27T17:02:10.737540669Z",
  "refresh_token": "sDhsSJQFRsZvrhA0D1MKfQAeeYXpVZ9jU5pk0I0Hqn4",
  "refresh_expires_at": "2026-10-28T04:47:10.736890245Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/191cf445-3fc6-4bae-a1ff-ce0ef66ef476` → **200**

```json
{
  "id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "447802e7-ae59-4c2d-bae4-144de02817d3",
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
    "id": "aa05b524-7310-4b90-b8ff-dc64ff60dbfb",
    "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8ba4b541-ef6c-4d17-a08e-1d889207458e",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T16:47:09.573704Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/191cf445-3fc6-4bae-a1ff-ce0ef66ef476/interrupt` → **200**

```json
{
  "command_id": "07e3f0af-cbee-4857-869e-a1351548f63b",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "447802e7-ae59-4c2d-bae4-144de02817d3",
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
      "id": "aa05b524-7310-4b90-b8ff-dc64ff60dbfb",
      "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "8ba4b541-ef6c-4d17-a08e-1d889207458e",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T16:47:09.573704Z",
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
    "id": "fc238ea8-89b7-407d-97ac-6f5be48b0114",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "447802e7-ae59-4c2d-bae4-144de02817d3",
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
    "id": "91d25efd-e9c2-4707-963e-19d6ad98e584",
    "order_id": "fc238ea8-89b7-407d-97ac-6f5be48b0114",
    "expires_at": "2026-10-27T16:47:25.836712Z",
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

`POST /api/driver/v1/offers/91d25efd-e9c2-4707-963e-19d6ad98e584/accept` → **200**

```json
{
  "command_id": "b99cc1ef-b54b-4709-9e25-9234530cca65"
}
```

```json
{
  "id": "7da92216-6fbd-4953-8ad5-5df05b471069",
  "order_id": "fc238ea8-89b7-407d-97ac-6f5be48b0114",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d8eaeba5-bbd8-4164-971a-64aa4b9c6b7c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d8eaeba5-bbd8-4164-971a-64aa4b9c6b7c",
  "order_id": "fc238ea8-89b7-407d-97ac-6f5be48b0114",
  "assignment_id": "7da92216-6fbd-4953-8ad5-5df05b471069",
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
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:47:10.082254Z",
  "last_location_at": "2026-10-27T16:47:10.082254Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/bf6047a1-d9a6-4186-a598-17bb3d6057e9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:10Z",
    "sequence": 1793119630998
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:47:11.021098Z",
  "last_location_at": "2026-10-27T16:47:11.021098Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d8eaeba5-bbd8-4164-971a-64aa4b9c6b7c/arrive` → **200**

```json
{
  "command_id": "2f8e83f9-9ae6-4be4-bbf1-48ab3fe62403",
  "expected_version": 0
}
```

```json
{
  "id": "d8eaeba5-bbd8-4164-971a-64aa4b9c6b7c",
  "order_id": "fc238ea8-89b7-407d-97ac-6f5be48b0114",
  "assignment_id": "7da92216-6fbd-4953-8ad5-5df05b471069",
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
  "arrived_at": "2026-10-27T16:47:11.064981Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d8eaeba5-bbd8-4164-971a-64aa4b9c6b7c/start` → **200**

```json
{
  "command_id": "45b39fc1-5037-4888-9ff1-6c08b25cf336",
  "expected_version": 1
}
```

```json
{
  "id": "d8eaeba5-bbd8-4164-971a-64aa4b9c6b7c",
  "order_id": "fc238ea8-89b7-407d-97ac-6f5be48b0114",
  "assignment_id": "7da92216-6fbd-4953-8ad5-5df05b471069",
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
  "arrived_at": "2026-10-27T16:47:11.064981Z",
  "started_at": "2026-10-27T16:47:11.111164Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d8eaeba5-bbd8-4164-971a-64aa4b9c6b7c/complete` → **200**

```json
{
  "command_id": "2f461df0-e668-4811-8a27-50f8d64f920b",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:47:11Z"
}
```

```json
{
  "id": "d8eaeba5-bbd8-4164-971a-64aa4b9c6b7c",
  "order_id": "fc238ea8-89b7-407d-97ac-6f5be48b0114",
  "assignment_id": "7da92216-6fbd-4953-8ad5-5df05b471069",
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
  "arrived_at": "2026-10-27T16:47:11.064981Z",
  "started_at": "2026-10-27T16:47:11.111164Z",
  "completed_at": "2026-10-27T16:47:11.160316Z",
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
    "id": "fc238ea8-89b7-407d-97ac-6f5be48b0114",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T16:47:10.82522Z",
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
    "id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T16:47:09.573704Z",
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

`GET /api/operator/v1/orders/191cf445-3fc6-4bae-a1ff-ce0ef66ef476/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T16:47:09.574299Z",
      "actor": {
        "type": "CLIENT",
        "id": "447802e7-ae59-4c2d-bae4-144de02817d3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
        "quote_id": "6f5412f9-fd29-4406-a72e-38b962d736b3",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T16:47:09.576209Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
        "attempt_id": "9462be5c-35cc-43b4-81ba-ff356cb995a1",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T16:47:09.583229Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "489828a8-c121-4204-a857-bc703ad73caa",
        "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T16:47:09.652207Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "489828a8-c121-4204-a857-bc703ad73caa",
        "order_id": "191cf445-3fc6-4bae-a1ff-ce0ef66ef476",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "aa05b524-7310-4b90-b8ff-dc64ff60dbfb"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 191cf445-3fc6-4bae-a1ff-ce0ef66ef476, follow-up fc238ea8-89b7-407d-97ac-6f5be48b0114.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-20895"
}
```

```json
{
  "challenge_id": "4ba47989-93d5-44fd-8e84-bab4c5d3d3b1",
  "expires_at": "2026-10-27T16:52:14.299558392Z",
  "resend_available_at": "2026-10-27T16:47:15.299558392Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "844762",
  "sent_at": "2026-10-27T16:47:14.302306388Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ba47989-93d5-44fd-8e84-bab4c5d3d3b1",
  "code": "844762",
  "device_ref": "sandbox-20895"
}
```

```json
{
  "session_id": "d92d6026-d515-4616-8e47-ef1e93a8cb05",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUzNCwiaWF0IjoxNzkzMTE5NjM0LCJqdGkiOiIzMzk2MzQ3YS0wYTg4LTQyMmYtOTZhZS04ODBiY2VjMDM5YTEiLCJzaWQiOiJkOTJkNjAyNi1kNTE1LTQ2MTYtOGU0Ny1lZjFlOTNhOGNiMDUifQ.x9hw6FYbRFuCedpe_m92nT1OBOuxPgKUwwCKscwgkQs",
  "access_expires_at": "2026-10-27T17:02:14.366403514Z",
  "refresh_token": "eFFAVWTeJZo6n2CdW1oXI6EQSFXHpc5hu7hZTicm6xU",
  "refresh_expires_at": "2026-11-26T16:47:14.365813132Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:47:11.021098Z",
  "last_location_at": "2026-10-27T16:47:11.021098Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf6047a1-d9a6-4186-a598-17bb3d6057e9/handover` → **200**

```json
{
  "command_id": "c0cd4f08-7045-4e9a-8d48-7c7d1945ab60",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:47:11.021098Z",
  "last_location_at": "2026-10-27T16:47:11.021098Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf6047a1-d9a6-4186-a598-17bb3d6057e9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:14Z",
    "sequence": 1793119634472
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:47:14.494066Z",
  "last_location_at": "2026-10-27T16:47:14.494066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679653780",
  "device_ref": "sandbox-18817"
}
```

```json
{
  "challenge_id": "1bdb85a4-eb13-4bc2-81ee-cc6288a54a7d",
  "expires_at": "2026-10-27T16:52:14.527185842Z",
  "resend_available_at": "2026-10-27T16:47:15.527185842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679653780` → **200**

```json
{
  "phone": "+380679653780",
  "audience": "CLIENT",
  "code": "126500",
  "sent_at": "2026-10-27T16:47:14.529880611Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bdb85a4-eb13-4bc2-81ee-cc6288a54a7d",
  "code": "126500",
  "device_ref": "sandbox-18817"
}
```

```json
{
  "session_id": "1acc9127-3e0a-4b91-8602-be6adcbfa789",
  "subject": {
    "type": "CLIENT",
    "id": "891c974d-af0d-4760-a2ab-d66166d2eaaf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTFjOTc0ZC1hZjBkLTQ3NjAtYTJhYi1kNjYxNjZkMmVhYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTM0LCJpYXQiOjE3OTMxMTk2MzQsImp0aSI6IjFjZWQyNjFjLWQxMDEtNDM5My05YTVlLTVkODRhM2RhYmM4ZSIsInNpZCI6IjFhY2M5MTI3LTNlMGEtNGI5MS04NjAyLWJlNmFkY2JmYTc4OSJ9.HuxnStu2ENousMwlFm2dzfCWza2tz72ou21w2atIxqE",
  "access_expires_at": "2026-10-27T17:02:14.591712847Z",
  "refresh_token": "AKAwCuJL5_23-skcTAarsYvRS-MoWeaEZu63OivSTNA",
  "refresh_expires_at": "2026-11-26T16:47:14.591091505Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c0b391c8-2388-4806-bede-d46f0683570f",
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
  "id": "cbb30ca4-a8da-49ea-bbcc-ef1d193f8656",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:52:14.630980Z",
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
  "command_id": "0e843bbf-157a-4577-a9a6-134ca31095f3",
  "quote_id": "cbb30ca4-a8da-49ea-bbcc-ef1d193f8656",
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
    "phone": "+380673012268"
  }
}
```

```json
{
  "id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
  "created_at": "2026-10-27T16:47:14.679218Z",
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
    "id": "b0e0c8d6-61b0-4bfa-82d0-45364e8ec87a",
    "order_id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
    "expires_at": "2026-10-27T16:47:29.683258Z",
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

`POST /api/driver/v1/offers/b0e0c8d6-61b0-4bfa-82d0-45364e8ec87a/accept` → **200**

```json
{
  "command_id": "46834af2-0b1b-4999-a3a5-4a7aee9ed0aa"
}
```

```json
{
  "id": "74f6b316-f90c-4587-9c17-828a60e43701",
  "order_id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7d41b3bb-ceae-4587-8b4d-8327972f4453",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7d41b3bb-ceae-4587-8b4d-8327972f4453",
  "order_id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
  "assignment_id": "74f6b316-f90c-4587-9c17-828a60e43701",
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
    "phone": "+380673012268"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "069f1502-c727-4f01-b2ac-88b1ec870e0c",
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
  "id": "d6a5cc98-46c4-4078-ad96-7f17ac215e18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:52:14.840399Z",
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
  "command_id": "a0e319af-b718-480f-8b2e-d8eeff4b5377",
  "quote_id": "d6a5cc98-46c4-4078-ad96-7f17ac215e18",
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
  "id": "2264e138-6dec-4ccd-9820-e7e4c1aca4f1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
  "created_at": "2026-10-27T16:47:14.882199Z",
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
  "command_id": "7a697843-7a3c-4323-9247-db5ff7c45d5c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T19:47:14Z"
}
```

```json
{
  "id": "d6790313-8cad-476b-af6a-efb71790021f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:52:14.936447Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T19:47:14Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6cc63abb-24c7-49aa-9d25-d830d38291c2",
  "quote_id": "d6790313-8cad-476b-af6a-efb71790021f",
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
  "pickup_at": "2026-10-27T19:47:14Z"
}
```

```json
{
  "id": "ac22d309-ca42-41b2-a4c0-13b7e19657ed",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
  "created_at": "2026-10-27T16:47:14.982Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:47:14Z",
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
  "command_id": "59f1cfd6-b245-4955-9bb9-9e25be268d25",
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
  "id": "d4384d5f-2d91-4d26-8453-36a67adb02ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:52:15.027691Z",
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
  "command_id": "6397f346-d819-4840-9842-37bc80e96759",
  "quote_id": "d4384d5f-2d91-4d26-8453-36a67adb02ab",
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
  "correlation_id": "b3c67e6d-0690-4921-8551-6d2c1b0c89fe"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "ac22d309-ca42-41b2-a4c0-13b7e19657ed",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
      "created_at": "2026-10-27T16:47:14.982Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T19:47:14Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "2264e138-6dec-4ccd-9820-e7e4c1aca4f1",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
      "created_at": "2026-10-27T16:47:14.882199Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "2264e138-6dec-4ccd-9820-e7e4c1aca4f1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
  "created_at": "2026-10-27T16:47:14.882199Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef` → **200**

```json
{
  "id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
    "id": "74f6b316-f90c-4587-9c17-828a60e43701",
    "order_id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7d41b3bb-ceae-4587-8b4d-8327972f4453",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T16:47:14.679218Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef/cancel` → **200**

```json
{
  "command_id": "83e1fb27-a77f-4980-b438-eb60aec9f55c",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
    "id": "74f6b316-f90c-4587-9c17-828a60e43701",
    "order_id": "69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7d41b3bb-ceae-4587-8b4d-8327972f4453",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T16:47:14.679218Z",
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

`GET /api/rider/v1/orders/2264e138-6dec-4ccd-9820-e7e4c1aca4f1` → **200**

```json
{
  "id": "2264e138-6dec-4ccd-9820-e7e4c1aca4f1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
  "created_at": "2026-10-27T16:47:14.882199Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/2264e138-6dec-4ccd-9820-e7e4c1aca4f1/cancel` → **200**

```json
{
  "command_id": "8dbbc48d-4044-48f9-b464-dde872155638",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2264e138-6dec-4ccd-9820-e7e4c1aca4f1",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
  "created_at": "2026-10-27T16:47:14.882199Z",
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

`GET /api/rider/v1/orders/ac22d309-ca42-41b2-a4c0-13b7e19657ed` → **200**

```json
{
  "id": "ac22d309-ca42-41b2-a4c0-13b7e19657ed",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
  "created_at": "2026-10-27T16:47:14.982Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:47:14Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ac22d309-ca42-41b2-a4c0-13b7e19657ed/cancel` → **200**

```json
{
  "command_id": "1b6199c5-aff6-4a0b-ac64-945c7593e365",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ac22d309-ca42-41b2-a4c0-13b7e19657ed",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "891c974d-af0d-4760-a2ab-d66166d2eaaf",
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
  "created_at": "2026-10-27T16:47:14.982Z",
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
  "pickup_at": "2026-10-27T19:47:14Z",
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
  "session_id": "bf6047a1-d9a6-4186-a598-17bb3d6057e9",
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
  "last_heartbeat_at": "2026-10-27T16:47:14.494066Z",
  "last_location_at": "2026-10-27T16:47:14.494066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf6047a1-d9a6-4186-a598-17bb3d6057e9/close` → **200**

```json
{
  "command_id": "7d8569bb-64f0-4c5a-8b57-38b7408d0d5c",
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

Done: orders 69a66c50-c5e0-4ebf-bac6-6d69df2cd0ef, 2264e138-6dec-4ccd-9820-e7e4c1aca4f1, ac22d309-ca42-41b2-a4c0-13b7e19657ed.

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
  "session_id": "ff80862f-8884-4fcf-b9e6-11446bd368c3",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MzUsImlhdCI6MTc5MzExOTYzNSwianRpIjoiOWQyOTdiZDMtZmJhNi00YjczLWFiNTItODQ3YzAyYTcxMmI4Iiwic2lkIjoiZmY4MDg2MmYtODg4NC00ZmNmLWI5ZTYtMTE0NDZiZDM2OGMzIn0.d8SrMLzhyeyMl-Y8xSmyn6oBcmwVApORyu4fsV95CPY",
  "access_expires_at": "2026-10-27T17:02:15.739472474Z",
  "refresh_token": "fnR7j4o_MwdhtHSZD9nSwZNoNT3uusgjxHcks3rZjmU",
  "refresh_expires_at": "2026-10-28T04:47:15.738897702Z",
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
  "session_id": "bc5292dd-538d-4702-8e2f-07efcaa27f95",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MzYsImlhdCI6MTc5MzExOTYzNiwianRpIjoiMjRiYzhhZTctYTYwZi00NjIxLTk5ZjMtMDdlYjNmYzk1NTZlIiwic2lkIjoiYmM1MjkyZGQtNTM4ZC00NzAyLThlMmYtMDdlZmNhYTI3Zjk1In0.aJh1C75gTjNjXDm2CyLgcei059uzApt9TBoipwu2n-c",
  "access_expires_at": "2026-10-27T17:02:16.064086468Z",
  "refresh_token": "2RVnlas8U1yw5ESLtrVqAZVLLWzkV0hBvhc0lxPK84o",
  "refresh_expires_at": "2026-10-28T04:47:16.063412921Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2954"
}
```

```json
{
  "challenge_id": "21184531-8598-4c08-b7cd-3c3e99b7859b",
  "expires_at": "2026-10-27T16:52:16.090074276Z",
  "resend_available_at": "2026-10-27T16:47:17.090074276Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "069182",
  "sent_at": "2026-10-27T16:47:16.09229654Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21184531-8598-4c08-b7cd-3c3e99b7859b",
  "code": "069182",
  "device_ref": "sandbox-2954"
}
```

```json
{
  "session_id": "e1eb5b91-83a0-4daa-a365-b852c4a590ce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDUzNiwiaWF0IjoxNzkzMTE5NjM2LCJqdGkiOiIyMDU0YmZlMS1mYmVmLTQ4ZjItYTIxMC00YWZlY2JiNTFmYTYiLCJzaWQiOiJlMWViNWI5MS04M2EwLTRkYWEtYTM2NS1iODUyYzRhNTkwY2UifQ.19f9qUBdDg8vZTif_L6wHYBsh0XJVuP_aDR3WtjF6dQ",
  "access_expires_at": "2026-10-27T17:02:16.152525976Z",
  "refresh_token": "xbBGSmp-OwmlRtC87Sk3EgKiS58KEnMaz_UT0Rw9a94",
  "refresh_expires_at": "2026-11-26T16:47:16.151978915Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:09.864459Z",
  "last_location_at": "2026-10-27T16:47:09.864459Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/handover` → **200**

```json
{
  "command_id": "ee15262c-4916-41da-b6fe-2522c3a1d9e8",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:09.864459Z",
  "last_location_at": "2026-10-27T16:47:09.864459Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:16Z",
    "sequence": 1793119636259
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:16.281787Z",
  "last_location_at": "2026-10-27T16:47:16.281787Z",
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
  "command_id": "ec6016d3-0fbf-4cc1-83a0-dc4da5fe9985",
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
  "effective_at": "2026-10-27T16:47:16.365657Z",
  "changed_by": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T16:47:16.402530973Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6d20aa54-a2b5-4f96-b18c-e3f1e27cbf33",
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
  "id": "3332fb50-1785-4ad8-b20e-409d40fb7962",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:52:16.450784Z",
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
  "command_id": "f2107051-a7d3-42bf-92b7-062a7e007358",
  "quote_id": "3332fb50-1785-4ad8-b20e-409d40fb7962",
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
    "phone": "+3806711131429"
  }
}
```

```json
{
  "id": "6afc816f-9dcc-441e-a1ee-14e78303b71d",
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
  "created_at": "2026-10-27T16:47:16.507273Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131429"
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
    "id": "3ac0ffb4-564b-4b35-bcd2-e6ec87672ce8",
    "order_id": "6afc816f-9dcc-441e-a1ee-14e78303b71d",
    "expires_at": "2026-10-27T16:47:31.512105Z",
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

`POST /api/driver/v1/offers/3ac0ffb4-564b-4b35-bcd2-e6ec87672ce8/accept` → **200**

```json
{
  "command_id": "c0fd98d3-8c69-404d-a327-d8bf31c33078"
}
```

```json
{
  "id": "60e8477a-83b7-4165-9d0e-65b8fa07293f",
  "order_id": "6afc816f-9dcc-441e-a1ee-14e78303b71d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4c388fbe-17f4-4a0c-86e4-51aeab26abf1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4c388fbe-17f4-4a0c-86e4-51aeab26abf1",
  "order_id": "6afc816f-9dcc-441e-a1ee-14e78303b71d",
  "assignment_id": "60e8477a-83b7-4165-9d0e-65b8fa07293f",
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
    "phone": "+3806711131429"
  }
}
```

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:16Z",
    "sequence": 1793119636624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:16.644615Z",
  "last_location_at": "2026-10-27T16:47:16.644615Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4c388fbe-17f4-4a0c-86e4-51aeab26abf1/arrive` → **200**

```json
{
  "command_id": "4944a1c9-44ed-46af-9fff-e724fbe179cd",
  "expected_version": 0
}
```

```json
{
  "id": "4c388fbe-17f4-4a0c-86e4-51aeab26abf1",
  "order_id": "6afc816f-9dcc-441e-a1ee-14e78303b71d",
  "assignment_id": "60e8477a-83b7-4165-9d0e-65b8fa07293f",
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
  "arrived_at": "2026-10-27T16:47:16.685144Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131429"
  }
}
```

`POST /api/driver/v1/trips/4c388fbe-17f4-4a0c-86e4-51aeab26abf1/start` → **200**

```json
{
  "command_id": "091f0f2a-3813-40f3-9ec6-5f831d78e756",
  "expected_version": 1
}
```

```json
{
  "id": "4c388fbe-17f4-4a0c-86e4-51aeab26abf1",
  "order_id": "6afc816f-9dcc-441e-a1ee-14e78303b71d",
  "assignment_id": "60e8477a-83b7-4165-9d0e-65b8fa07293f",
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
  "arrived_at": "2026-10-27T16:47:16.685144Z",
  "started_at": "2026-10-27T16:47:16.737793Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131429"
  }
}
```

`POST /api/driver/v1/trips/4c388fbe-17f4-4a0c-86e4-51aeab26abf1/complete` → **200**

```json
{
  "command_id": "61e39979-f239-4465-844f-bf2ee446ec8b",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:47:16Z",
  "cash_received": true
}
```

```json
{
  "id": "4c388fbe-17f4-4a0c-86e4-51aeab26abf1",
  "order_id": "6afc816f-9dcc-441e-a1ee-14e78303b71d",
  "assignment_id": "60e8477a-83b7-4165-9d0e-65b8fa07293f",
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
  "arrived_at": "2026-10-27T16:47:16.685144Z",
  "started_at": "2026-10-27T16:47:16.737793Z",
  "completed_at": "2026-10-27T16:47:16.784215Z",
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
  "command_id": "5cae4da4-3379-41c0-94f7-cdefabcd4a99",
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
  "id": "6564e07c-878d-4a3b-87b9-cf373d8fef3c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:52:16.831501Z",
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
  "command_id": "a9d0a1d5-8b76-4ef6-8b1b-ecdafc6d2e2d",
  "quote_id": "6564e07c-878d-4a3b-87b9-cf373d8fef3c",
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
    "phone": "+3806711122900"
  }
}
```

```json
{
  "id": "d7c2beb8-faae-4331-935e-80d8c241a9a6",
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
  "created_at": "2026-10-27T16:47:16.873103Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122900"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d7c2beb8-faae-4331-935e-80d8c241a9a6` → **200**

```json
{
  "id": "d7c2beb8-faae-4331-935e-80d8c241a9a6",
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
  "created_at": "2026-10-27T16:47:16.873103Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122900"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d7c2beb8-faae-4331-935e-80d8c241a9a6/cancel` → **200**

```json
{
  "command_id": "c8b657e4-5d4d-48e0-ad3b-0ad6095cd8f7",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d7c2beb8-faae-4331-935e-80d8c241a9a6",
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
  "created_at": "2026-10-27T16:47:16.873103Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122900"
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
  "staff_id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T16:47:16.954138Z",
  "last_entries": [
    {
      "order_id": "d7c2beb8-faae-4331-935e-80d8c241a9a6",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T16:47:16.954138Z"
    },
    {
      "order_id": "6afc816f-9dcc-441e-a1ee-14e78303b71d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T16:47:16.789998Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc38a6be-7a1b-444d-9ca7-739dfff295aa",
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
  "last_heartbeat_at": "2026-10-27T16:47:16.644615Z",
  "last_location_at": "2026-10-27T16:47:16.644615Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc38a6be-7a1b-444d-9ca7-739dfff295aa/close` → **200**

```json
{
  "command_id": "d4f4060b-5841-4804-af5b-3e0502744338",
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

Done: operator bonus for fulfilled 6afc816f-9dcc-441e-a1ee-14e78303b71d and operator-fault cancellation d7c2beb8-faae-4331-935e-80d8c241a9a6.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635811789",
  "device_ref": "sandbox-12207"
}
```

```json
{
  "challenge_id": "5c656aba-6aeb-43e7-b27e-b84b7d0ec9a1",
  "expires_at": "2026-10-27T16:52:19.130503023Z",
  "resend_available_at": "2026-10-27T16:47:20.130503023Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635811789` → **200**

```json
{
  "phone": "+380635811789",
  "audience": "CLIENT",
  "code": "268834",
  "sent_at": "2026-10-27T16:47:19.13304336Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c656aba-6aeb-43e7-b27e-b84b7d0ec9a1",
  "code": "268834",
  "device_ref": "sandbox-12207"
}
```

```json
{
  "session_id": "24faf783-5f57-48d6-8bff-93451e326790",
  "subject": {
    "type": "CLIENT",
    "id": "ba7cd063-4817-4643-a455-ee6bc8bb205f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTdjZDA2My00ODE3LTQ2NDMtYTQ1NS1lZTZiYzhiYjIwNWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTM5LCJpYXQiOjE3OTMxMTk2MzksImp0aSI6IjUwYzVlNjM3LWVlMTAtNDY1ZC1iZjI5LTJhY2M4ODlhZWQ4MCIsInNpZCI6IjI0ZmFmNzgzLTVmNTctNDhkNi04YmZmLTkzNDUxZTMyNjc5MCJ9.HpEzue9RTnddoZ60uXuuL8T32cD7qVqEvQ-hZk88NqU",
  "access_expires_at": "2026-10-27T17:02:19.200719899Z",
  "refresh_token": "neXW01mlKa7nrTpi1J9kb_uVvcWGToKxr0I8IK0A9_s",
  "refresh_expires_at": "2026-11-26T16:47:19.200062913Z",
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
  "session_id": "d79a5241-58f5-4765-8ec2-04d256cf8102",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1MzksImlhdCI6MTc5MzExOTYzOSwianRpIjoiMDU0Y2M1YWUtOGI4OC00YjQwLTkxNTMtYjNhN2M3ZjJkMjYyIiwic2lkIjoiZDc5YTUyNDEtNThmNS00NzY1LThlYzItMDRkMjU2Y2Y4MTAyIn0.1IV_P6NkWK29edxNqyPC9XPNQmP_BmOuRlxzb-w8ZoM",
  "access_expires_at": "2026-10-27T17:02:19.631370664Z",
  "refresh_token": "S2s4v5ZeAaMC-0w6wGhsiEhf9eOoDxpBECXKbMoYOpE",
  "refresh_expires_at": "2026-10-28T04:47:19.630726181Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635811789` → **200**

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
  "correlation_id": "d72738d7-d5e3-4131-952b-45e934dc3fee"
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
  "session_id": "7aab5cb3-0e2b-4e85-b0d9-946dea591979",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDAsImlhdCI6MTc5MzExOTY0MCwianRpIjoiNWU3YjZmMTgtZGIxNi00N2YzLWE4OGQtYjdmMjMxZjVmZWNhIiwic2lkIjoiN2FhYjVjYjMtMGUyYi00ZTg1LWIwZDktOTQ2ZGVhNTkxOTc5In0.W3vXpB-AAA4pxxAHEPTa3un16fHf9pHpgGlxzY9u5HY",
  "access_expires_at": "2026-10-27T17:02:20.036084344Z",
  "refresh_token": "2CmFOobFt1eYNGHBlc21QubVolah2GPdFZeQrNdG1Ew",
  "refresh_expires_at": "2026-10-28T04:47:20.035339184Z",
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
  "command_id": "bb59b262-f627-4978-a410-8e0c0bb78624",
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
  "changed_by": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T16:47:20.123460755Z"
}
```

## The rider books the airport for 2026-10-27T19:47:19Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600530446",
  "device_ref": "sandbox-9983"
}
```

```json
{
  "challenge_id": "721c7338-e49f-46dd-9a2d-d7e2f1b8051c",
  "expires_at": "2026-10-27T16:52:20.160295602Z",
  "resend_available_at": "2026-10-27T16:47:21.160295602Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600530446` → **200**

```json
{
  "phone": "+48600530446",
  "audience": "CLIENT",
  "code": "856067",
  "sent_at": "2026-10-27T16:47:20.163235678Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "721c7338-e49f-46dd-9a2d-d7e2f1b8051c",
  "code": "856067",
  "device_ref": "sandbox-9983"
}
```

```json
{
  "session_id": "e0b25a4c-ab20-44dc-8eb1-51604117137f",
  "subject": {
    "type": "CLIENT",
    "id": "91ef0ad7-2ec8-4f8a-8e6d-683b34f7b9f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWVmMGFkNy0yZWM4LTRmOGEtOGU2ZC02ODNiMzRmN2I5ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTQwLCJpYXQiOjE3OTMxMTk2NDAsImp0aSI6IjdiNzQ3NjVlLTAwNDYtNDdkNC05OGQxLWYwOTllZTc1MGJlYSIsInNpZCI6ImUwYjI1YTRjLWFiMjAtNDRkYy04ZWIxLTUxNjA0MTE3MTM3ZiJ9.eCE2ebZL2sZmUxuBM9mmq7pXvpk2NKC4V0rfXFF9OEI",
  "access_expires_at": "2026-10-27T17:02:20.225196993Z",
  "refresh_token": "a8Q7Jv34w2mnOEGASGzPBtH_t4oTNSq020VpC0QCwf0",
  "refresh_expires_at": "2026-11-26T16:47:20.22448849Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28cadc28-0492-4101-b024-1971a76cbb9a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T19:47:19Z"
}
```

```json
{
  "id": "78f7c210-474f-4982-b4e8-4b7624746386",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T16:52:20.265497Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T19:47:19Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b3aedb9a-54c5-419e-86b1-54bc995733c4",
  "quote_id": "78f7c210-474f-4982-b4e8-4b7624746386",
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
  "pickup_at": "2026-10-27T19:47:19Z"
}
```

```json
{
  "id": "247eb21a-1183-4524-9209-5b1c3ea24b82",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "91ef0ad7-2ec8-4f8a-8e6d-683b34f7b9f9",
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
  "created_at": "2026-10-27T16:47:20.308296Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T19:47:19Z",
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
  "device_ref": "sandbox-8009"
}
```

```json
{
  "challenge_id": "4c0ea968-3edc-4f31-80dc-a98cda709448",
  "expires_at": "2026-10-27T16:52:20.345276915Z",
  "resend_available_at": "2026-10-27T16:47:21.345276915Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "820868",
  "sent_at": "2026-10-27T16:47:20.347540589Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c0ea968-3edc-4f31-80dc-a98cda709448",
  "code": "820868",
  "device_ref": "sandbox-8009"
}
```

```json
{
  "session_id": "68e74c8b-c1fd-41b2-b449-47bc80eec883",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDU0MCwiaWF0IjoxNzkzMTE5NjQwLCJqdGkiOiJlYmFlY2UxNS0wYTMyLTRhZGItOTJlYy1hZWYzNTY2NGY4OWMiLCJzaWQiOiI2OGU3NGM4Yi1jMWZkLTQxYjItYjQ0OS00N2JjODBlZWM4ODMifQ.vAdBgZ8KZ3USTDc8VeNiEzv1O962M_Wa3uh6Spup2g8",
  "access_expires_at": "2026-10-27T17:02:20.410000927Z",
  "refresh_token": "qqPbP4gn0II67J8OP01UckEIJaiMuk49Pq7wAwZK2gk",
  "refresh_expires_at": "2026-11-26T16:47:20.409385258Z",
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
  "command_id": "01305b3b-9918-40a9-8292-7ead4f3e5b2c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:20Z",
    "sequence": 1793119640467
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2954a6eb-f63f-405a-bc6c-a0bd954de088",
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
  "last_heartbeat_at": "2026-10-27T16:47:20.488099Z",
  "last_location_at": "2026-10-27T16:47:20.488099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "247eb21a-1183-4524-9209-5b1c3ea24b82",
      "short_number": 13,
      "pickup_at": "2026-10-27T19:47:19Z",
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

`POST /api/driver/v1/preorders/247eb21a-1183-4524-9209-5b1c3ea24b82/reserve` → **200**

```json
{
  "command_id": "99e0b868-86c9-40b1-bc4d-dd7589e64db2"
}
```

```json
{
  "id": "85a10ed9-c68e-4a9c-b74c-4982a4a38b37",
  "state": "RESERVED",
  "order": {
    "order_id": "247eb21a-1183-4524-9209-5b1c3ea24b82",
    "short_number": 13,
    "pickup_at": "2026-10-27T19:47:19Z",
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
  "reserved_at": "2026-10-27T16:47:20.566163Z",
  "confirm_from": "2026-10-27T19:17:19Z",
  "confirm_until": "2026-10-27T19:27:19Z",
  "drop_until": "2026-10-27T18:47:19Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "85a10ed9-c68e-4a9c-b74c-4982a4a38b37",
      "state": "RESERVED",
      "order": {
        "order_id": "247eb21a-1183-4524-9209-5b1c3ea24b82",
        "short_number": 13,
        "pickup_at": "2026-10-27T19:47:19Z",
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
      "reserved_at": "2026-10-27T16:47:20.566163Z",
      "confirm_from": "2026-10-27T19:17:19Z",
      "confirm_until": "2026-10-27T19:27:19Z",
      "drop_until": "2026-10-27T18:47:19Z"
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
      "id": "85a10ed9-c68e-4a9c-b74c-4982a4a38b37",
      "state": "RESERVED",
      "order": {
        "order_id": "247eb21a-1183-4524-9209-5b1c3ea24b82",
        "short_number": 13,
        "pickup_at": "2026-10-27T19:47:19Z",
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
      "reserved_at": "2026-10-27T16:47:20.566163Z",
      "confirm_from": "2026-10-27T19:17:19Z",
      "confirm_until": "2026-10-27T19:27:19Z",
      "drop_until": "2026-10-27T18:47:19Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/85a10ed9-c68e-4a9c-b74c-4982a4a38b37/confirm` → **409**

```json
{
  "command_id": "6343f918-5b32-444a-b796-5d81fe6f0e6c"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/85a10ed9-c68e-4a9c-b74c-4982a4a38b37/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fb44fb41-455b-43f9-96cf-d9f087282eea"
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
  "session_id": "478ab9ce-f6b1-49fe-ac7f-388f236bc3ea",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDAsImlhdCI6MTc5MzExOTY0MCwianRpIjoiY2UyZTU0ZmMtYTI4Ni00MmU2LThjOWYtNTY2ZTYzMGEyNzY2Iiwic2lkIjoiNDc4YWI5Y2UtZjZiMS00OWZlLWFjN2YtMzg4ZjIzNmJjM2VhIn0.tI2ZUvq5Ua0LRyDTEGHcoi0rsaoDKtMis5jzcqgl9dI",
  "access_expires_at": "2026-10-27T17:02:20.993245989Z",
  "refresh_token": "gjnK89bPuYUzn1lIhvwdGHly6FNlM07JSVeda_nrib8",
  "refresh_expires_at": "2026-10-28T04:47:20.99267799Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/247eb21a-1183-4524-9209-5b1c3ea24b82` → **200**

```json
{
  "id": "247eb21a-1183-4524-9209-5b1c3ea24b82",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "91ef0ad7-2ec8-4f8a-8e6d-683b34f7b9f9",
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
  "created_at": "2026-10-27T16:47:20.308296Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T19:47:19Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "85a10ed9-c68e-4a9c-b74c-4982a4a38b37",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T16:47:20.566163Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/247eb21a-1183-4524-9209-5b1c3ea24b82/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T16:47:20.309568Z",
      "actor": {
        "type": "CLIENT",
        "id": "91ef0ad7-2ec8-4f8a-8e6d-683b34f7b9f9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "247eb21a-1183-4524-9209-5b1c3ea24b82",
        "preorder": true,
        "quote_id": "78f7c210-474f-4982-b4e8-4b7624746386",
        "pickup_at": "2026-10-27T19:47:19Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T16:47:20.567477Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "247eb21a-1183-4524-9209-5b1c3ea24b82",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "85a10ed9-c68e-4a9c-b74c-4982a4a38b37"
      }
    }
  ]
}
```

Done: pre-order 247eb21a-1183-4524-9209-5b1c3ea24b82, reservation 85a10ed9-c68e-4a9c-b74c-4982a4a38b37.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7557"
}
```

```json
{
  "challenge_id": "8d488196-6e43-436d-bbe2-cf2a208d8f99",
  "expires_at": "2026-10-27T16:52:21.094388037Z",
  "resend_available_at": "2026-10-27T16:47:22.094388037Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "895339",
  "sent_at": "2026-10-27T16:47:21.097558059Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d488196-6e43-436d-bbe2-cf2a208d8f99",
  "code": "895339",
  "device_ref": "sandbox-7557"
}
```

```json
{
  "session_id": "c11b80b9-c131-4b2d-b104-14a5a6123414",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDU0MSwiaWF0IjoxNzkzMTE5NjQxLCJqdGkiOiI4NzNhMWUyZC03MGI4LTRjYTAtYTA3ZC1kZmI2ZTg0MTFmNGQiLCJzaWQiOiJjMTFiODBiOS1jMTMxLTRiMmQtYjEwNC0xNGE1YTYxMjM0MTQifQ.acTEKVXEcQrbiHsVIQKOULKObw35cF-0Jgc4j-MPnmE",
  "access_expires_at": "2026-10-27T17:02:21.162503029Z",
  "refresh_token": "5IvLCgwsYvhuLazLjS-9oG8QCN4DfXR_fwhblLzCSUU",
  "refresh_expires_at": "2026-11-26T16:47:21.161859378Z",
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
  "command_id": "8d0e24d3-06fb-44b1-a6c5-417adbfac54f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:21Z",
    "sequence": 1793119641223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fbdabbf-6b90-4e28-88d8-236be755bc2c",
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
  "last_heartbeat_at": "2026-10-27T16:47:21.24537Z",
  "last_location_at": "2026-10-27T16:47:21.24537Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670364745",
  "device_ref": "sandbox-29896"
}
```

```json
{
  "challenge_id": "cf4b8a63-8ebc-4ef9-a7bb-901877e78a42",
  "expires_at": "2026-10-27T16:52:21.277489795Z",
  "resend_available_at": "2026-10-27T16:47:22.277489795Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670364745` → **200**

```json
{
  "phone": "+380670364745",
  "audience": "CLIENT",
  "code": "152717",
  "sent_at": "2026-10-27T16:47:21.279874832Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf4b8a63-8ebc-4ef9-a7bb-901877e78a42",
  "code": "152717",
  "device_ref": "sandbox-29896"
}
```

```json
{
  "session_id": "f0da1128-b020-4331-b71c-d1a89dc170eb",
  "subject": {
    "type": "CLIENT",
    "id": "5a3b9d4e-9819-4287-a569-9f5e1168e7e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTNiOWQ0ZS05ODE5LTQyODctYTU2OS05ZjVlMTE2OGU3ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTQxLCJpYXQiOjE3OTMxMTk2NDEsImp0aSI6IjU0M2VkOTdjLWI3YTYtNGI0My1iODc1LTk5M2IwMWZlOWM0YyIsInNpZCI6ImYwZGExMTI4LWIwMjAtNDMzMS1iNzFjLWQxYTg5ZGMxNzBlYiJ9.xJvT4p2NFNdP81hxbeD28_VABpMcu3BtCeZrCpwLxbA",
  "access_expires_at": "2026-10-27T17:02:21.343675848Z",
  "refresh_token": "tCNIxBlaWYlIHVdRY8h4c5lMnRgxO7TLOtqQIbPbTf0",
  "refresh_expires_at": "2026-11-26T16:47:21.343083565Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e2699c8f-61bc-4699-b526-cf0fdbedd041",
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
  "id": "bd9450bb-ce7b-454a-b974-d9ce34be5070",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T16:52:21.385651Z",
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
  "command_id": "112b962b-3038-40c8-a579-775bacb4f5cd",
  "quote_id": "bd9450bb-ce7b-454a-b974-d9ce34be5070",
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
  "id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a3b9d4e-9819-4287-a569-9f5e1168e7e3",
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
  "created_at": "2026-10-27T16:47:21.427099Z",
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
    "id": "74fc5a43-5b12-4bd2-8f31-1b3358d82f75",
    "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
    "expires_at": "2026-10-27T16:47:36.430376Z",
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

`POST /api/driver/v1/offers/74fc5a43-5b12-4bd2-8f31-1b3358d82f75/accept` → **200**

```json
{
  "command_id": "6cf5a5b3-5f65-429b-b995-cfa5961f97fe"
}
```

```json
{
  "id": "2482251a-20a7-40f8-8acd-f6c0e6994251",
  "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b892a780-bbde-42bf-8623-3397938a63f8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b892a780-bbde-42bf-8623-3397938a63f8",
  "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "assignment_id": "2482251a-20a7-40f8-8acd-f6c0e6994251",
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

`POST /api/driver/v1/work-sessions/3fbdabbf-6b90-4e28-88d8-236be755bc2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:21Z",
    "sequence": 1793119641552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fbdabbf-6b90-4e28-88d8-236be755bc2c",
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
  "last_heartbeat_at": "2026-10-27T16:47:21.574592Z",
  "last_location_at": "2026-10-27T16:47:21.574592Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b892a780-bbde-42bf-8623-3397938a63f8",
  "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "assignment_id": "2482251a-20a7-40f8-8acd-f6c0e6994251",
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

`POST /api/driver/v1/trips/b892a780-bbde-42bf-8623-3397938a63f8/arrive` → **200**

```json
{
  "command_id": "35b7eba4-394b-4aa6-b5aa-c77c2ef3b859",
  "expected_version": 0
}
```

```json
{
  "id": "b892a780-bbde-42bf-8623-3397938a63f8",
  "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "assignment_id": "2482251a-20a7-40f8-8acd-f6c0e6994251",
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
  "arrived_at": "2026-10-27T16:47:21.635026Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b892a780-bbde-42bf-8623-3397938a63f8/start` → **200**

```json
{
  "command_id": "c2269f3c-0726-430a-a671-de0afb729ed2",
  "expected_version": 1
}
```

```json
{
  "id": "b892a780-bbde-42bf-8623-3397938a63f8",
  "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "assignment_id": "2482251a-20a7-40f8-8acd-f6c0e6994251",
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
  "arrived_at": "2026-10-27T16:47:21.635026Z",
  "started_at": "2026-10-27T16:47:21.673424Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3fbdabbf-6b90-4e28-88d8-236be755bc2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:21Z",
    "sequence": 1793119641700
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fbdabbf-6b90-4e28-88d8-236be755bc2c",
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
  "last_heartbeat_at": "2026-10-27T16:47:21.722491Z",
  "last_location_at": "2026-10-27T16:47:21.722491Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b892a780-bbde-42bf-8623-3397938a63f8/complete` → **200**

```json
{
  "command_id": "857c5c5c-1d6f-43ad-b61d-e61a05ed0a03",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:47:21Z",
  "cash_received": true
}
```

```json
{
  "id": "b892a780-bbde-42bf-8623-3397938a63f8",
  "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "assignment_id": "2482251a-20a7-40f8-8acd-f6c0e6994251",
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
  "arrived_at": "2026-10-27T16:47:21.635026Z",
  "started_at": "2026-10-27T16:47:21.673424Z",
  "completed_at": "2026-10-27T16:47:21.761699Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/1beb50c5-beda-4870-bfad-1fe17a1b2de3/rating` → **200**

```json
{
  "command_id": "cd806242-e7e0-477f-ab3a-34827f341596",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "score": 5,
  "created_at": "2026-10-27T16:47:21.830234829Z"
}
```

`POST /api/driver/v1/orders/1beb50c5-beda-4870-bfad-1fe17a1b2de3/rating` → **200**

```json
{
  "command_id": "6f05d54f-be1d-4fb8-99f6-a9a52c51a1ea",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
  "score": 4,
  "created_at": "2026-10-27T16:47:21.873157633Z"
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
  "session_id": "3984d1d7-99e3-4d67-9e1b-5f628f969c42",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDIsImlhdCI6MTc5MzExOTY0MiwianRpIjoiNzc0MmQ0NGQtODAyYS00ODExLWEzZDUtMzY5OTUyOWJlZDI2Iiwic2lkIjoiMzk4NGQxZDctOTllMy00ZDY3LTllMWItNWY2MjhmOTY5YzQyIn0.UWlhtDNd5BxJqLt4tySwWF2NGdWZZ3WD5lHbOliYcLo",
  "access_expires_at": "2026-10-27T17:02:22.242948023Z",
  "refresh_token": "FyPRycLkXAqeOdU5RBxHvNi1S4PswXMzilGDri6OsYo",
  "refresh_expires_at": "2026-10-28T04:47:22.242281931Z",
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
  "session_id": "9b168193-8c8c-460d-99f5-d1b1c3201448",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDIsImlhdCI6MTc5MzExOTY0MiwianRpIjoiZjk3ODMyZDEtNDA0ZS00YzBlLWE2ZDUtZmI5MDVkOTE4YWRmIiwic2lkIjoiOWIxNjgxOTMtOGM4Yy00NjBkLTk5ZjUtZDFiMWMzMjAxNDQ4In0.96s2-PY1VyDn7K7mJuJDks1_sPqKy7PkQqd4MxxKjSE",
  "access_expires_at": "2026-10-27T17:02:22.568410769Z",
  "refresh_token": "DVwG6C2UZlwGW6nXwWLs92z1R8cpzdBpmqmgWN3K3Ds",
  "refresh_expires_at": "2026-10-28T04:47:22.567619073Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1beb50c5-beda-4870-bfad-1fe17a1b2de3/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
      "author_type": "RIDER",
      "author_id": "5a3b9d4e-9819-4287-a569-9f5e1168e7e3",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T16:47:21.830235Z"
    },
    {
      "order_id": "1beb50c5-beda-4870-bfad-1fe17a1b2de3",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "5a3b9d4e-9819-4287-a569-9f5e1168e7e3",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T16:47:21.873158Z"
    }
  ]
}
```

Done: ratings for order 1beb50c5-beda-4870-bfad-1fe17a1b2de3.

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
  "session_id": "8b0c37c9-26a6-49d8-ac97-bb99cb10776e",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDIsImlhdCI6MTc5MzExOTY0MiwianRpIjoiMTFkMjQ3MDAtYzAwZS00MWJkLWIzNzktOGRkNGExOWQxNWMwIiwic2lkIjoiOGIwYzM3YzktMjZhNi00OWQ4LWFjOTctYmI5OWNiMTA3NzZlIn0.fEke21DNwzDanYB9dSTGclHfzrCZ6OQE4JrCUp_IFdg",
  "access_expires_at": "2026-10-27T17:02:22.955893424Z",
  "refresh_token": "CWSaL5T7yhiIjwbEdDpWBz7G831xio4bQ6pY5_-jnd4",
  "refresh_expires_at": "2026-10-28T04:47:22.955154171Z",
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
  "command_id": "e85e7e02-d36f-4082-85bc-d66c1944dc6d",
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
  "changed_by": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T16:47:23.039853Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "e85e7e02-d36f-4082-85bc-d66c1944dc6d",
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
  "changed_by": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T16:47:23.039853Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48480561627",
  "device_ref": "sandbox-15423"
}
```

```json
{
  "challenge_id": "74986468-3186-4c51-a6cd-26deb7fc0f34",
  "expires_at": "2026-10-27T16:52:23.128466001Z",
  "resend_available_at": "2026-10-27T16:47:24.128466001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48480561627` → **200**

```json
{
  "phone": "+48480561627",
  "audience": "CLIENT",
  "code": "163037",
  "sent_at": "2026-10-27T16:47:23.131090556Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74986468-3186-4c51-a6cd-26deb7fc0f34",
  "code": "163037",
  "device_ref": "sandbox-15423"
}
```

```json
{
  "session_id": "edf426fd-77d8-4236-82c5-f933e7849225",
  "subject": {
    "type": "CLIENT",
    "id": "4b0592e6-60e9-426c-b784-dda4e31f9077"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjA1OTJlNi02MGU5LTQyNmMtYjc4NC1kZGE0ZTMxZjkwNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTQzLCJpYXQiOjE3OTMxMTk2NDMsImp0aSI6IjgzNWJlMmJiLTdmNWUtNGY1Yy04MTM2LTJkY2JhOTIzOWZkMiIsInNpZCI6ImVkZjQyNmZkLTc3ZDgtNDIzNi04MmM1LWY5MzNlNzg0OTIyNSJ9.cNp7nU6uj8OXJrzXQiljOlV1Sou8Y8vfoxGmFrbhYrA",
  "access_expires_at": "2026-10-27T17:02:23.194272552Z",
  "refresh_token": "bjPffupmkTURGMxo3VEVz6izb72pfNfVV12U-e0HIvE",
  "refresh_expires_at": "2026-11-26T16:47:23.193701277Z",
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
  "correlation_id": "32732494-2f46-4631-82e8-cb16d070b5eb"
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
  "device_ref": "sandbox-26399"
}
```

```json
{
  "challenge_id": "01dd1e43-ab67-4998-b877-531d2679429c",
  "expires_at": "2026-10-27T16:52:23.290005197Z",
  "resend_available_at": "2026-10-27T16:47:24.290005197Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "470569",
  "sent_at": "2026-10-27T16:47:23.292287322Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01dd1e43-ab67-4998-b877-531d2679429c",
  "code": "470569",
  "device_ref": "sandbox-26399"
}
```

```json
{
  "session_id": "1c196526-8edd-4c67-9036-cb768e07a5de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDU0MywiaWF0IjoxNzkzMTE5NjQzLCJqdGkiOiJhMTVlYTEyMi0yZTk5LTQ0MzktODY0ZS1jMzVhMzhmNTdiZGIiLCJzaWQiOiIxYzE5NjUyNi04ZWRkLTRjNjctOTAzNi1jYjc2OGUwN2E1ZGUifQ.Gl1u4MXG__9XWKlzNqoYWtrwR0ZHNuYBhSokrJOJjZY",
  "access_expires_at": "2026-10-27T17:02:23.357014706Z",
  "refresh_token": "_SOLTV-yTFUNdm2RrLHQsMS1dCbzTSF9B8EjOVuKOZI",
  "refresh_expires_at": "2026-11-26T16:47:23.356372608Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2954a6eb-f63f-405a-bc6c-a0bd954de088",
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
  "last_heartbeat_at": "2026-10-27T16:47:20.488099Z",
  "last_location_at": "2026-10-27T16:47:20.488099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2954a6eb-f63f-405a-bc6c-a0bd954de088/handover` → **200**

```json
{
  "command_id": "f73ac8d3-8d6e-4bf4-b9fa-3b5f3ec6842f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2954a6eb-f63f-405a-bc6c-a0bd954de088",
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
  "last_heartbeat_at": "2026-10-27T16:47:20.488099Z",
  "last_location_at": "2026-10-27T16:47:20.488099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2954a6eb-f63f-405a-bc6c-a0bd954de088/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:23Z",
    "sequence": 1793119643454
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2954a6eb-f63f-405a-bc6c-a0bd954de088",
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
  "last_heartbeat_at": "2026-10-27T16:47:23.475483Z",
  "last_location_at": "2026-10-27T16:47:23.475483Z",
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
  "session_id": "2954a6eb-f63f-405a-bc6c-a0bd954de088",
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
  "last_heartbeat_at": "2026-10-27T16:47:23.475483Z",
  "last_location_at": "2026-10-27T16:47:23.475483Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2954a6eb-f63f-405a-bc6c-a0bd954de088/close` → **200**

```json
{
  "command_id": "ad1be834-40fd-4245-aa97-2f0cf0311b91",
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
  "correlation_id": "249848f0-522e-482a-af33-d02a44f4e853"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676238749",
  "device_ref": "sandbox-29266"
}
```

```json
{
  "challenge_id": "3a1bd0b0-35e5-4f5c-83fe-9b73b0400c24",
  "expires_at": "2026-10-27T16:52:23.666608767Z",
  "resend_available_at": "2026-10-27T16:47:24.666608767Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676238749` → **200**

```json
{
  "phone": "+380676238749",
  "audience": "CLIENT",
  "code": "574848",
  "sent_at": "2026-10-27T16:47:23.668717189Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a1bd0b0-35e5-4f5c-83fe-9b73b0400c24",
  "code": "574848",
  "device_ref": "sandbox-29266"
}
```

```json
{
  "session_id": "06e551a0-999c-4c2a-aba8-8ff3dbe8e7ef",
  "subject": {
    "type": "CLIENT",
    "id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OGQxYTMwOC0yNTdhLTQ1ZTgtOWJmZi05MWM2YzlkZmFhZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTIwNTQzLCJpYXQiOjE3OTMxMTk2NDMsImp0aSI6ImRjZjg1NzFlLTJkNDctNDc1Yi05NThlLTEyOGZmNTllMDI1NyIsInNpZCI6IjA2ZTU1MWEwLTk5OWMtNGMyYS1hYmE4LThmZjNkYmU4ZTdlZiJ9.GhltU1Dj0hezfYpjsgN8d0pHXipVieZfFmzxeUJARls",
  "access_expires_at": "2026-10-27T17:02:23.733293752Z",
  "refresh_token": "8je_2dL1-8Q1r0kVKtSTLZFWsfJ-J5yv3060Yj5nXm8",
  "refresh_expires_at": "2026-11-26T16:47:23.732671592Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "667094d6-df10-4660-a236-b1705280b4d6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f77a2d27-9a2f-4303-8383-796fb35b6a89",
  "upload_path": "/api/rider/v1/uploads/f77a2d27-9a2f-4303-8383-796fb35b6a89",
  "expires_at": "2026-10-27T17:02:23.774985646Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/f77a2d27-9a2f-4303-8383-796fb35b6a89` → **200**

```json
{
  "file_id": "f77a2d27-9a2f-4303-8383-796fb35b6a89",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2aefd45e-ce73-4b1a-94a7-a0e70fad1f07",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "f77a2d27-9a2f-4303-8383-796fb35b6a89"
  ]
}
```

```json
{
  "id": "d9d09198-a7a9-48ce-b143-4e93e0c965e2",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T16:47:23.856985Z",
  "updated_at": "2026-10-27T16:47:23.856985Z",
  "messages": [
    {
      "id": "958cb634-d76c-47a5-bfc1-5f5513fc12d0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:47:23.858896Z",
      "attachments": [
        {
          "file_id": "f77a2d27-9a2f-4303-8383-796fb35b6a89",
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
  "session_id": "524a06e5-b5a8-4fdd-ad60-382aea74ceac",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDQsImlhdCI6MTc5MzExOTY0NCwianRpIjoiNWE3YjljNmEtMTVkOC00NDg0LWE2NmEtNTVlZmY2YjE0ZGRhIiwic2lkIjoiNTI0YTA2ZTUtYjVhOC00ZmRkLWFkNjAtMzgyYWVhNzRjZWFjIn0.0_T8gxnvAcfd6z7jJtxqMlncyCTsNBNPUtx4uMvwZC0",
  "access_expires_at": "2026-10-27T17:02:24.21696464Z",
  "refresh_token": "359wUT9fZUyPaBLboDsb7PfxObUFwi03RBUyOGfrWSc",
  "refresh_expires_at": "2026-10-28T04:47:24.216194701Z",
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
  "session_id": "04da4a8c-b659-4b10-b057-cc6453140016",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDQsImlhdCI6MTc5MzExOTY0NCwianRpIjoiY2Q1N2I0MGItZmI4NC00MDNhLTgzMzgtMDFjNWFkMjI1ODE0Iiwic2lkIjoiMDRkYTRhOGMtYjY1OS00YjEwLWIwNTctY2M2NDUzMTQwMDE2In0.g5W5Rlmp0SpGxGXkmP040O33Po01vpchNQTC7FGD-rI",
  "access_expires_at": "2026-10-27T17:02:24.545083419Z",
  "refresh_token": "ovKUA_avmMXk7Kk-_LT4PoHXyKKVNGhu5-EJb3SfTow",
  "refresh_expires_at": "2026-10-28T04:47:24.544266916Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/d9d09198-a7a9-48ce-b143-4e93e0c965e2/attachments/f77a2d27-9a2f-4303-8383-796fb35b6a89` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d3d32551-1ed7-4a3c-846f-9bfc23d311ff",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7388070e-717a-40e2-8ec9-f551cd1c15f2",
  "upload_path": "/api/operator/v1/uploads/7388070e-717a-40e2-8ec9-f551cd1c15f2",
  "expires_at": "2026-10-27T17:02:24.607694614Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/7388070e-717a-40e2-8ec9-f551cd1c15f2` → **200**

```json
{
  "file_id": "7388070e-717a-40e2-8ec9-f551cd1c15f2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/d9d09198-a7a9-48ce-b143-4e93e0c965e2` → **200**

```json
{
  "id": "d9d09198-a7a9-48ce-b143-4e93e0c965e2",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T16:47:23.856985Z",
  "updated_at": "2026-10-27T16:47:23.856985Z",
  "messages": [
    {
      "id": "958cb634-d76c-47a5-bfc1-5f5513fc12d0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:47:23.858896Z",
      "attachments": [
        {
          "file_id": "f77a2d27-9a2f-4303-8383-796fb35b6a89",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/d9d09198-a7a9-48ce-b143-4e93e0c965e2/comments` → **200**

```json
{
  "command_id": "8d71986f-410c-4741-a13d-040b0f2302f3",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "7388070e-717a-40e2-8ec9-f551cd1c15f2"
  ]
}
```

```json
{
  "id": "d9d09198-a7a9-48ce-b143-4e93e0c965e2",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T16:47:23.856985Z",
  "updated_at": "2026-10-27T16:47:24.7225Z",
  "messages": [
    {
      "id": "958cb634-d76c-47a5-bfc1-5f5513fc12d0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:47:23.858896Z",
      "attachments": [
        {
          "file_id": "f77a2d27-9a2f-4303-8383-796fb35b6a89",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d22f2d28-9ecb-47fd-8d18-06cda941042d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T16:47:24.72212Z",
      "attachments": [
        {
          "file_id": "7388070e-717a-40e2-8ec9-f551cd1c15f2",
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

`GET /api/rider/v1/support/cases/d9d09198-a7a9-48ce-b143-4e93e0c965e2` → **200**

```json
{
  "id": "d9d09198-a7a9-48ce-b143-4e93e0c965e2",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T16:47:23.856985Z",
  "updated_at": "2026-10-27T16:47:24.7225Z",
  "messages": [
    {
      "id": "958cb634-d76c-47a5-bfc1-5f5513fc12d0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "98d1a308-257a-45e8-9bff-91c6c9dfaaf1",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T16:47:23.858896Z",
      "attachments": [
        {
          "file_id": "f77a2d27-9a2f-4303-8383-796fb35b6a89",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "d22f2d28-9ecb-47fd-8d18-06cda941042d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T16:47:24.72212Z",
      "attachments": [
        {
          "file_id": "7388070e-717a-40e2-8ec9-f551cd1c15f2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/d9d09198-a7a9-48ce-b143-4e93e0c965e2/attachments/7388070e-717a-40e2-8ec9-f551cd1c15f2` → **200**

Done: support case d9d09198-a7a9-48ce-b143-4e93e0c965e2, rider attachment f77a2d27-9a2f-4303-8383-796fb35b6a89, operator attachment 7388070e-717a-40e2-8ec9-f551cd1c15f2.

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
  "session_id": "07ebdd12-17e9-4929-b100-b4d096cd0a27",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDUsImlhdCI6MTc5MzExOTY0NSwianRpIjoiMzA3MjU5YjgtMGY0ZC00ZTYzLTlmYjctYzk4YTI4Nzg5MWE4Iiwic2lkIjoiMDdlYmRkMTItMTdlOS00OTI5LWIxMDAtYjRkMDk2Y2QwYTI3In0.vj2OmSWjCOyw99dHlCuaf6nzFerFERpBU64l8IQ7SCU",
  "access_expires_at": "2026-10-27T17:02:25.126166715Z",
  "refresh_token": "KSOrFFUWuLlQOBogMmAnBGG-7hDQLmCSZVgA7EfOy8Y",
  "refresh_expires_at": "2026-10-28T04:47:25.125552522Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15769"
}
```

```json
{
  "challenge_id": "714ceb36-8e4e-4a9b-8517-50d9e5ec88c8",
  "expires_at": "2026-10-27T16:52:25.156030011Z",
  "resend_available_at": "2026-10-27T16:47:26.156030011Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "693769",
  "sent_at": "2026-10-27T16:47:25.158599593Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "714ceb36-8e4e-4a9b-8517-50d9e5ec88c8",
  "code": "693769",
  "device_ref": "sandbox-15769"
}
```

```json
{
  "session_id": "f9d7a81a-7757-4858-83fe-d30a84d721cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDU0NSwiaWF0IjoxNzkzMTE5NjQ1LCJqdGkiOiI5MTZmMWQyNy00ZjczLTRmZTUtYjZkYS02MmI5MDhjOTY3NDMiLCJzaWQiOiJmOWQ3YTgxYS03NzU3LTQ4NTgtODNmZS1kMzBhODRkNzIxY2QifQ.UWZSn9jrFqgO-6ha9zomSDKti6mEl6gZOuPgonp4AwE",
  "access_expires_at": "2026-10-27T17:02:25.220371593Z",
  "refresh_token": "gqLl18reY-jlVISz9A8WNVHSvEMlQa5IBqypPb21ieA",
  "refresh_expires_at": "2026-11-26T16:47:25.219793064Z",
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
  "command_id": "ee82eb81-af04-4246-8136-d2e055494342",
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
  "device_ref": "sandbox-25220"
}
```

```json
{
  "challenge_id": "68f59566-7545-4274-ba88-6a6fe0bac749",
  "expires_at": "2026-10-27T16:52:25.365605566Z",
  "resend_available_at": "2026-10-27T16:47:26.365605566Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "442346",
  "sent_at": "2026-10-27T16:47:25.367858149Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "68f59566-7545-4274-ba88-6a6fe0bac749",
  "code": "442346",
  "device_ref": "sandbox-25220"
}
```

```json
{
  "session_id": "210f6f92-3138-4817-a97f-79943906f01e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyMDU0NSwiaWF0IjoxNzkzMTE5NjQ1LCJqdGkiOiJkZTRiZGMyZi0zN2MxLTRhOWYtODBkNC1jMDAwYTdmYTYyOWYiLCJzaWQiOiIyMTBmNmY5Mi0zMTM4LTQ4MTctYTk3Zi03OTk0MzkwNmYwMWUifQ.9Wl47cL9Z8aI2TyY3m-leX9ZSLZMiXrsBZzIfqN3wXU",
  "access_expires_at": "2026-10-27T17:02:25.428288857Z",
  "refresh_token": "UOVD0vDlE_tDUlkVirEgnY_whTM1LMcTZUVyob-ynwM",
  "refresh_expires_at": "2026-11-26T16:47:25.427682588Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fbdabbf-6b90-4e28-88d8-236be755bc2c",
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
  "last_heartbeat_at": "2026-10-27T16:47:21.722491Z",
  "last_location_at": "2026-10-27T16:47:21.722491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3fbdabbf-6b90-4e28-88d8-236be755bc2c/handover` → **200**

```json
{
  "command_id": "1186cd7a-748d-4d94-849c-4d2285539b82",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fbdabbf-6b90-4e28-88d8-236be755bc2c",
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
  "last_heartbeat_at": "2026-10-27T16:47:21.722491Z",
  "last_location_at": "2026-10-27T16:47:21.722491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3fbdabbf-6b90-4e28-88d8-236be755bc2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:25Z",
    "sequence": 1793119645525
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3fbdabbf-6b90-4e28-88d8-236be755bc2c",
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
  "last_heartbeat_at": "2026-10-27T16:47:25.547174Z",
  "last_location_at": "2026-10-27T16:47:25.547174Z",
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
  "command_id": "dabe500b-1736-44b4-8c48-2581e23548cb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:25Z",
    "sequence": 1793119645601
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b4d73178-72bd-4caf-8982-c38ff74cae9d",
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
  "last_heartbeat_at": "2026-10-27T16:47:25.621278Z",
  "last_location_at": "2026-10-27T16:47:25.621278Z",
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
  "session_id": "7ab395d4-aefa-4493-ad4d-2118d04ef542",
  "subject": {
    "type": "STAFF",
    "id": "1f26c824-8de4-4c4f-b7eb-910c71ded7e9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjI2YzgyNC04ZGU0LTRjNGYtYjdlYi05MTBjNzFkZWQ3ZTkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjA1NDUsImlhdCI6MTc5MzExOTY0NSwianRpIjoiOTJjNDlmNjMtYzA0MC00OTMzLThlNWUtNTNiNDgyYjY4NTU2Iiwic2lkIjoiN2FiMzk1ZDQtYWVmYS00NDkzLWFkNGQtMjExOGQwNGVmNTQyIn0.rbsDmvo3NCp5plIjhAlkISAIkCx7HTJas9pTwZcmu5E",
  "access_expires_at": "2026-10-27T17:02:25.949594423Z",
  "refresh_token": "SOTu1vlyG-zxjkDSpeB-HDJyollI0rJ7NHUhqsEWN7k",
  "refresh_expires_at": "2026-10-28T04:47:25.949003811Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d3d2ce70-e5b3-4e5d-b3d0-1bea5ae9a148",
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
  "id": "75d29c44-5350-4251-9d1b-a17f35a07f3b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T16:52:25.986705Z",
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
  "command_id": "45127064-c9bf-42fd-b336-0820526f4ba6",
  "quote_id": "75d29c44-5350-4251-9d1b-a17f35a07f3b",
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
  "id": "d0c0f85f-689d-4006-a907-851db1820d41",
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
  "created_at": "2026-10-27T16:47:26.030378Z",
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
    "id": "55e899bd-5ea4-4ac0-b076-9a447c98dce7",
    "order_id": "d0c0f85f-689d-4006-a907-851db1820d41",
    "expires_at": "2026-10-27T16:47:41.033989Z",
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

`POST /api/driver/v1/offers/55e899bd-5ea4-4ac0-b076-9a447c98dce7/accept` → **200**

```json
{
  "command_id": "6752bad5-4934-468e-9ef2-2819802de02a"
}
```

```json
{
  "id": "34a6389c-5ab2-4ebf-9296-a6937707be9a",
  "order_id": "d0c0f85f-689d-4006-a907-851db1820d41",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d6bd2295-dd73-4e9b-903f-774d22e93ec8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d6bd2295-dd73-4e9b-903f-774d22e93ec8",
  "order_id": "d0c0f85f-689d-4006-a907-851db1820d41",
  "assignment_id": "34a6389c-5ab2-4ebf-9296-a6937707be9a",
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

`POST /api/driver/v1/work-sessions/b4d73178-72bd-4caf-8982-c38ff74cae9d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T16:47:26Z",
    "sequence": 1793119646182
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b4d73178-72bd-4caf-8982-c38ff74cae9d",
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
  "last_heartbeat_at": "2026-10-27T16:47:26.203573Z",
  "last_location_at": "2026-10-27T16:47:26.203573Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d6bd2295-dd73-4e9b-903f-774d22e93ec8/arrive` → **200**

```json
{
  "command_id": "025eb3ca-f356-4ab9-a3af-f9a3a57a2bfc",
  "expected_version": 0
}
```

```json
{
  "id": "d6bd2295-dd73-4e9b-903f-774d22e93ec8",
  "order_id": "d0c0f85f-689d-4006-a907-851db1820d41",
  "assignment_id": "34a6389c-5ab2-4ebf-9296-a6937707be9a",
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
  "arrived_at": "2026-10-27T16:47:26.244239Z",
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

`POST /api/driver/v1/trips/d6bd2295-dd73-4e9b-903f-774d22e93ec8/start` → **200**

```json
{
  "command_id": "bb191e98-4b7a-4c51-b36a-23a6e08cb709",
  "expected_version": 1
}
```

```json
{
  "id": "d6bd2295-dd73-4e9b-903f-774d22e93ec8",
  "order_id": "d0c0f85f-689d-4006-a907-851db1820d41",
  "assignment_id": "34a6389c-5ab2-4ebf-9296-a6937707be9a",
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
  "arrived_at": "2026-10-27T16:47:26.244239Z",
  "started_at": "2026-10-27T16:47:26.288961Z",
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

`POST /api/driver/v1/trips/d6bd2295-dd73-4e9b-903f-774d22e93ec8/complete` → **200**

```json
{
  "command_id": "9c8be700-35c9-4fac-98ee-7576ab7daa20",
  "expected_version": 2,
  "reported_at": "2026-10-27T16:47:26Z",
  "cash_received": true
}
```

```json
{
  "id": "d6bd2295-dd73-4e9b-903f-774d22e93ec8",
  "order_id": "d0c0f85f-689d-4006-a907-851db1820d41",
  "assignment_id": "34a6389c-5ab2-4ebf-9296-a6937707be9a",
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
  "arrived_at": "2026-10-27T16:47:26.244239Z",
  "started_at": "2026-10-27T16:47:26.288961Z",
  "completed_at": "2026-10-27T16:47:26.337722Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d0c0f85f-689d-4006-a907-851db1820d41` → **200**

```json
{
  "id": "d0c0f85f-689d-4006-a907-851db1820d41",
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
    "id": "34a6389c-5ab2-4ebf-9296-a6937707be9a",
    "order_id": "d0c0f85f-689d-4006-a907-851db1820d41",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d6bd2295-dd73-4e9b-903f-774d22e93ec8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T16:47:26.030378Z",
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
  "session_id": "3fbdabbf-6b90-4e28-88d8-236be755bc2c",
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
  "last_heartbeat_at": "2026-10-27T16:47:25.547174Z",
  "last_location_at": "2026-10-27T16:47:25.547174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3fbdabbf-6b90-4e28-88d8-236be755bc2c/close` → **200**

```json
{
  "command_id": "733ec142-0014-4346-9560-7a6e72750ec2",
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
  "session_id": "b4d73178-72bd-4caf-8982-c38ff74cae9d",
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
  "last_heartbeat_at": "2026-10-27T16:47:26.203573Z",
  "last_location_at": "2026-10-27T16:47:26.203573Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4d73178-72bd-4caf-8982-c38ff74cae9d/close` → **200**

```json
{
  "command_id": "8d97d0ee-8809-4eeb-aa56-4f709d12d796",
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

Done: terminal order d0c0f85f-689d-4006-a907-851db1820d41 by Andrii (5a000000-0000-4000-8000-000000000403).
