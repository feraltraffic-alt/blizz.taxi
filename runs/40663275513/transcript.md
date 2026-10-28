# Sandbox transcript (2026-10-28T09:19:45Z, ccfdc46)

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
  "correlation_id": "e03d0fee-4937-4e01-893c-6adeee32dfa8"
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
  "session_id": "ebdcaa41-c10d-4104-89c2-6ccdb0f7ce1e",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAwODYsImlhdCI6MTc5MzE3OTE4NiwianRpIjoiOTEwZmI2ZDItZjYwMi00ZjU5LWIzMTYtMDMxOTJlM2M2ZDFmIiwic2lkIjoiZWJkY2FhNDEtYzEwZC00MTA0LTg5YzItNmNjZGIwZjdjZTFlIn0.OiteHARSf5ylJN5DktsUeZlzqgCPm7snWnABUQ6HZ7s",
  "access_expires_at": "2026-10-28T09:34:46.615869701Z",
  "refresh_token": "4R2yzVw01ml94srOUi2Gz2cadT0cnt-uzady4w3C87k",
  "refresh_expires_at": "2026-10-28T21:19:46.613701527Z",
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
  "session_id": "b6298db6-a28a-4b22-be29-76c0d835d9fd",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAwODcsImlhdCI6MTc5MzE3OTE4NywianRpIjoiMzM5MWZhYmYtZDk2MC00ZTk4LWI0ZTQtOTZmNGNhMWI1MjNlIiwic2lkIjoiYjYyOThkYjYtYTI4YS00YjIyLWJlMjktNzZjMGQ4MzVkOWZkIn0.dGgwj3IOCDnEwH5KamWIf3wv_owfdKlZHMGHpUeLCV4",
  "access_expires_at": "2026-10-28T09:34:47.912373044Z",
  "refresh_token": "rqU5RV_nql0YtrStCg5Iu10xX_VGzTYdCo4DRLGDqpw",
  "refresh_expires_at": "2026-10-28T21:19:47.911151374Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "782e9046-36b1-4e65-9390-c95d94898b74",
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
  "id": "311c323b-729d-406c-bdf2-8109db0a98fd",
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
  "created_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "created_at": "2026-10-28T09:19:47.993465Z",
  "updated_at": "2026-10-28T09:19:47.993465Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634839989",
  "device_ref": "sandbox-26984"
}
```

```json
{
  "challenge_id": "7a8522d1-fe9a-4f92-b00c-2f80702782bf",
  "expires_at": "2026-10-28T09:24:48.045466527Z",
  "resend_available_at": "2026-10-28T09:19:49.045466527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634839989` → **200**

```json
{
  "phone": "+380634839989",
  "audience": "CLIENT",
  "code": "023914",
  "sent_at": "2026-10-28T09:19:48.053284888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a8522d1-fe9a-4f92-b00c-2f80702782bf",
  "code": "023914",
  "device_ref": "sandbox-26984"
}
```

```json
{
  "session_id": "eeef9737-0071-4757-9165-99ba35724559",
  "subject": {
    "type": "CLIENT",
    "id": "32e03447-c269-4c04-89ff-9750eb94795d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMmUwMzQ0Ny1jMjY5LTRjMDQtODlmZi05NzUwZWI5NDc5NWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMDg4LCJpYXQiOjE3OTMxNzkxODgsImp0aSI6ImQ0YjhmMDBlLWQ1MjktNDNjMC05MDIyLTMxODY5M2VhMGU5MSIsInNpZCI6ImVlZWY5NzM3LTAwNzEtNDc1Ny05MTY1LTk5YmEzNTcyNDU1OSJ9.klGi5Na5aK5wNsB_LY_0uuaDR0nlOVBToq4uJhUqYJQ",
  "access_expires_at": "2026-10-28T09:34:48.139654914Z",
  "refresh_token": "iO02Vymfn52YJjRJm4T1sHFtXLBa_bM-3bYv11O8HTQ",
  "refresh_expires_at": "2026-11-27T09:19:48.137646753Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634839989` → **200**

```json
{
  "client_id": "32e03447-c269-4c04-89ff-9750eb94795d"
}
```

`POST /api/admin/v1/rider-wallets/32e03447-c269-4c04-89ff-9750eb94795d/top-ups` → **201**

```json
{
  "command_id": "1111328b-3894-4bf6-9385-a18c471ee76d",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "32e03447-c269-4c04-89ff-9750eb94795d",
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
      "id": "4a4f7e71-7fb1-479f-a324-1b070cf75677",
      "at": "2026-10-28T09:19:48.231884Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a8af4ea3-fc73-48ae-b674-8add37489788",
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
  "id": "6532b8f8-cbba-4a56-86f6-41132209e534",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:24:48.377305Z",
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
      "id": "311c323b-729d-406c-bdf2-8109db0a98fd",
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
  "device_ref": "sandbox-22126"
}
```

```json
{
  "challenge_id": "6f845d48-94a2-4671-8065-9f584e3f1284",
  "expires_at": "2026-10-28T09:24:48.450072811Z",
  "resend_available_at": "2026-10-28T09:19:49.450072811Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "130016",
  "sent_at": "2026-10-28T09:19:48.454008627Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f845d48-94a2-4671-8065-9f584e3f1284",
  "code": "130016",
  "device_ref": "sandbox-22126"
}
```

```json
{
  "session_id": "a85f4790-af4b-4cd0-8f7a-a57e0f2e14fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDA4OCwiaWF0IjoxNzkzMTc5MTg4LCJqdGkiOiI5YjgwZDNlOS02YTFjLTRmZTQtODdlNi0xYjlkMmZlODIwNzYiLCJzaWQiOiJhODVmNDc5MC1hZjRiLTRjZDAtOGY3YS1hNTdlMGYyZTE0ZmMifQ.EGQe7ikeV7OVQpNVETpC8O_Re1imHprYB7M5RgEXIA0",
  "access_expires_at": "2026-10-28T09:34:48.515626843Z",
  "refresh_token": "6x9P9eXMYPpJc6IrQgWNKTr1vqXuvFKFDo5nEWOP70M",
  "refresh_expires_at": "2026-11-27T09:19:48.514579461Z",
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
  "command_id": "99f08ddc-43a2-43c4-a9dd-6fd6d68ec082",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:19:48Z",
    "sequence": 1793179188584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d6e7cbb-dd72-4f31-82f6-fb72c5c00b50",
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
  "last_heartbeat_at": "2026-10-28T09:19:48.634155Z",
  "last_location_at": "2026-10-28T09:19:48.634155Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "71fcb302-d2de-46ef-af37-e3b3cab22f0a",
  "quote_id": "6532b8f8-cbba-4a56-86f6-41132209e534",
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
  "id": "a145e4c5-14af-4c66-b206-181cf93b29bd",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32e03447-c269-4c04-89ff-9750eb94795d",
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
  "created_at": "2026-10-28T09:19:48.734067Z",
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
  "client_id": "32e03447-c269-4c04-89ff-9750eb94795d",
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
      "id": "4a4f7e71-7fb1-479f-a324-1b070cf75677",
      "at": "2026-10-28T09:19:48.231884Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
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
    "id": "ef691b32-0e3a-4723-b1aa-46eda7a93fd1",
    "order_id": "a145e4c5-14af-4c66-b206-181cf93b29bd",
    "expires_at": "2026-10-28T09:20:03.748552Z",
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

`POST /api/driver/v1/offers/ef691b32-0e3a-4723-b1aa-46eda7a93fd1/accept` → **200**

```json
{
  "command_id": "6fbae363-1dfa-4990-bb98-92b2749b2014"
}
```

```json
{
  "id": "82a01b31-13ff-4261-b623-1883ab7945fd",
  "order_id": "a145e4c5-14af-4c66-b206-181cf93b29bd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ae5ebb76-18ac-4a9e-839e-fe6838b0541d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ae5ebb76-18ac-4a9e-839e-fe6838b0541d",
  "order_id": "a145e4c5-14af-4c66-b206-181cf93b29bd",
  "assignment_id": "82a01b31-13ff-4261-b623-1883ab7945fd",
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

`POST /api/driver/v1/work-sessions/3d6e7cbb-dd72-4f31-82f6-fb72c5c00b50/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:19:48Z",
    "sequence": 1793179188939
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d6e7cbb-dd72-4f31-82f6-fb72c5c00b50",
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
  "last_heartbeat_at": "2026-10-28T09:19:48.964677Z",
  "last_location_at": "2026-10-28T09:19:48.964677Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ae5ebb76-18ac-4a9e-839e-fe6838b0541d/arrive` → **200**

```json
{
  "command_id": "f701e30f-cbdd-42af-9b7a-e2b7630c6166",
  "expected_version": 0
}
```

```json
{
  "id": "ae5ebb76-18ac-4a9e-839e-fe6838b0541d",
  "order_id": "a145e4c5-14af-4c66-b206-181cf93b29bd",
  "assignment_id": "82a01b31-13ff-4261-b623-1883ab7945fd",
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
  "arrived_at": "2026-10-28T09:19:49.015942Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ae5ebb76-18ac-4a9e-839e-fe6838b0541d/start` → **200**

```json
{
  "command_id": "8c277fc0-05a7-45b4-8edf-d77af9d8ebab",
  "expected_version": 1
}
```

```json
{
  "id": "ae5ebb76-18ac-4a9e-839e-fe6838b0541d",
  "order_id": "a145e4c5-14af-4c66-b206-181cf93b29bd",
  "assignment_id": "82a01b31-13ff-4261-b623-1883ab7945fd",
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
  "arrived_at": "2026-10-28T09:19:49.015942Z",
  "started_at": "2026-10-28T09:19:49.063926Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/ae5ebb76-18ac-4a9e-839e-fe6838b0541d/complete` → **200**

```json
{
  "command_id": "bc958cfd-231f-4da5-ba57-bc5a24ee7267",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:19:49Z",
  "cash_received": true
}
```

```json
{
  "id": "ae5ebb76-18ac-4a9e-839e-fe6838b0541d",
  "order_id": "a145e4c5-14af-4c66-b206-181cf93b29bd",
  "assignment_id": "82a01b31-13ff-4261-b623-1883ab7945fd",
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
  "arrived_at": "2026-10-28T09:19:49.015942Z",
  "started_at": "2026-10-28T09:19:49.063926Z",
  "completed_at": "2026-10-28T09:19:49.133711Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "32e03447-c269-4c04-89ff-9750eb94795d",
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
      "id": "e3583d73-6b60-4838-b2e8-3c1bb3ca9145",
      "at": "2026-10-28T09:19:49.24134Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "a145e4c5-14af-4c66-b206-181cf93b29bd"
    },
    {
      "id": "4a4f7e71-7fb1-479f-a324-1b070cf75677",
      "at": "2026-10-28T09:19:48.231884Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/311c323b-729d-406c-bdf2-8109db0a98fd/archive` → **200**

```json
{
  "command_id": "96560b42-f7bf-4d53-84ef-73ec94cf8ef1",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "311c323b-729d-406c-bdf2-8109db0a98fd",
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
  "created_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "created_at": "2026-10-28T09:19:47.993465Z",
  "updated_at": "2026-10-28T09:19:52.237597Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d6e7cbb-dd72-4f31-82f6-fb72c5c00b50",
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
  "last_heartbeat_at": "2026-10-28T09:19:48.964677Z",
  "last_location_at": "2026-10-28T09:19:48.964677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d6e7cbb-dd72-4f31-82f6-fb72c5c00b50/close` → **200**

```json
{
  "command_id": "5e5edfdb-0f4c-4110-91c5-f58dc5ecb1d3",
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

Done: order a145e4c5-14af-4c66-b206-181cf93b29bd.

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
  "session_id": "a7c604bd-91da-4550-8aec-9b4e5b4f72b5",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAwOTIsImlhdCI6MTc5MzE3OTE5MiwianRpIjoiZTg2YmNmNjUtZDY4Zi00NTU3LWI0MWEtZjc1YTAwYjdlMTI1Iiwic2lkIjoiYTdjNjA0YmQtOTFkYS00NTUwLThhZWMtOWI0ZTViNGY3MmI1In0.70j3SJhOrNst5DAkLjSugMxlKXSEXUPmZy0F23CGrKs",
  "access_expires_at": "2026-10-28T09:34:52.657711389Z",
  "refresh_token": "oYM8wQ4CUQKEHFyqgu_1Durg3h48MNxX74i2Fnbgh5o",
  "refresh_expires_at": "2026-10-28T21:19:52.656812641Z",
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
  "command_id": "330f1b60-2ea2-4a0a-bd0d-aacf866fd7f1",
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
  "session_id": "a0bc161c-2bbc-4c51-a6d9-5680da479ff1",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAwOTMsImlhdCI6MTc5MzE3OTE5MywianRpIjoiMzE1MTdlN2MtY2NiYi00NDYyLTliNzEtY2Q3MGY0NTk0MmZkIiwic2lkIjoiYTBiYzE2MWMtMmJiYy00YzUxLWE2ZDktNTY4MGRhNDc5ZmYxIn0.zMXdKUC_vrJiK5rF_bJFufgIkvdceL6Q5vRjGh6aWI0",
  "access_expires_at": "2026-10-28T09:34:53.059284455Z",
  "refresh_token": "9QWqBFwnJB6bm_430f3Rju7Ds-h2LPrXMrB28yeEAbc",
  "refresh_expires_at": "2026-10-28T21:19:53.058423738Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.93187812",
    "linkedid": "1730052700.93187812",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670209713"
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
    "id": "1730052700.93187812",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "5f614fb0-087a-4770-842f-3af6a03217ed",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670209713",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:19:53.089675Z",
      "answered_at": null,
      "ended_at": "2026-10-28T09:19:53.115397Z",
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
    "id": "1730052600.11584521",
    "linkedid": "1730052600.11584521",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670209713"
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
      "id": "e57c6a7e-c3c6-4bee-ac90-02403264afb1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670209713",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:19:53.187216Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/e57c6a7e-c3c6-4bee-ac90-02403264afb1/answer` → **200**

```json
{
  "command_id": "6ec34cab-5624-4ac1-b0db-905ed8d36c74"
}
```

```json
{
  "id": "e57c6a7e-c3c6-4bee-ac90-02403264afb1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670209713",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "order_ids": [],
  "started_at": "2026-10-28T09:19:53.187216Z",
  "answered_at": "2026-10-28T09:19:53.25613Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.11584521",
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
    "id": "1730052600.11584521",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e57c6a7e-c3c6-4bee-ac90-02403264afb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670209713",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [],
      "started_at": "2026-10-28T09:19:53.187216Z",
      "answered_at": "2026-10-28T09:19:53.25613Z",
      "ended_at": "2026-10-28T09:19:53.314428Z",
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
      "id": "e57c6a7e-c3c6-4bee-ac90-02403264afb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670209713",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [],
      "started_at": "2026-10-28T09:19:53.187216Z",
      "answered_at": "2026-10-28T09:19:53.25613Z",
      "ended_at": "2026-10-28T09:19:53.314428Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:19:55.09572Z"
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
      "id": "e57c6a7e-c3c6-4bee-ac90-02403264afb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670209713",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [],
      "started_at": "2026-10-28T09:19:53.187216Z",
      "answered_at": "2026-10-28T09:19:53.25613Z",
      "ended_at": "2026-10-28T09:19:53.314428Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:19:55.09572Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/e57c6a7e-c3c6-4bee-ac90-02403264afb1/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/e57c6a7e-c3c6-4bee-ac90-02403264afb1/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=e57c6a7e-c3c6-4bee-ac90-02403264afb1` → **200**

```json
{
  "changes": [
    {
      "id": "4a4656bf-5d85-40fe-a023-d14bf9780725",
      "occurred_at": "2026-10-28T09:19:55.472408Z",
      "actor_type": "STAFF",
      "actor_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e57c6a7e-c3c6-4bee-ac90-02403264afb1",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"74adb2fc-5351-48c1-8e06-9604a6ae0ebb\", \"order_ids\": []}",
      "correlation_id": "23ab7952-9072-4b4a-b097-e2ad10966a4a"
    },
    {
      "id": "1af839c6-5d91-4328-b345-c81fc709dab6",
      "occurred_at": "2026-10-28T09:19:55.439603Z",
      "actor_type": "STAFF",
      "actor_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e57c6a7e-c3c6-4bee-ac90-02403264afb1",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"74adb2fc-5351-48c1-8e06-9604a6ae0ebb\", \"order_ids\": []}",
      "correlation_id": "ff113927-2140-4531-9908-c5befd67a17c"
    }
  ]
}
```

Done: call e57c6a7e-c3c6-4bee-ac90-02403264afb1 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636127654",
  "device_ref": "sandbox-15417"
}
```

```json
{
  "challenge_id": "a2098d61-ecac-44eb-9f5d-ad5f920dacc0",
  "expires_at": "2026-10-28T09:24:55.546483835Z",
  "resend_available_at": "2026-10-28T09:19:56.546483835Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636127654` → **200**

```json
{
  "phone": "+380636127654",
  "audience": "CLIENT",
  "code": "441005",
  "sent_at": "2026-10-28T09:19:55.549896052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2098d61-ecac-44eb-9f5d-ad5f920dacc0",
  "code": "441005",
  "device_ref": "sandbox-15417"
}
```

```json
{
  "session_id": "6a01a685-fa08-4525-ae54-82fe84b9d1c1",
  "subject": {
    "type": "CLIENT",
    "id": "256b2763-c8eb-4b86-b711-083e0ed9d57e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTZiMjc2My1jOGViLTRiODYtYjcxMS0wODNlMGVkOWQ1N2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMDk1LCJpYXQiOjE3OTMxNzkxOTUsImp0aSI6IjRlN2Q1MTc2LWY0ZTgtNGM0Yi1hZWZmLTVmY2I0Y2I1YzBiNyIsInNpZCI6IjZhMDFhNjg1LWZhMDgtNDUyNS1hZTU0LTgyZmU4NGI5ZDFjMSJ9.fIF6bgo8Sg584nmG5M6o1vG9WOPC0kmneUl8qF96d6g",
  "access_expires_at": "2026-10-28T09:34:55.608415884Z",
  "refresh_token": "SRYiawUFHAsqw7dyThcSQ-NG7w5q-Jaea7qYuDJMG5E",
  "refresh_expires_at": "2026-11-27T09:19:55.60772216Z",
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
        "en": "Changed my mind",
        "uk": "Передумав їхати",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-14972"
}
```

```json
{
  "challenge_id": "0083edbc-7512-48d2-93d3-1b4a7c59ec3b",
  "expires_at": "2026-10-28T09:24:55.668972527Z",
  "resend_available_at": "2026-10-28T09:19:56.668972527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "865797",
  "sent_at": "2026-10-28T09:19:55.672433037Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0083edbc-7512-48d2-93d3-1b4a7c59ec3b",
  "code": "865797",
  "device_ref": "sandbox-14972"
}
```

```json
{
  "session_id": "b5e2fb9e-baff-4052-a451-53bb548a8efb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDA5NSwiaWF0IjoxNzkzMTc5MTk1LCJqdGkiOiJhMWUyMzc1OS0wZDY4LTRlY2QtYWI1YS1lYTE4OWU3OTAzZGYiLCJzaWQiOiJiNWUyZmI5ZS1iYWZmLTQwNTItYTQ1MS01M2JiNTQ4YThlZmIifQ.L_3-U-ArVIAmjmG0srJc11361uJChV0GWpZ8taHzLyY",
  "access_expires_at": "2026-10-28T09:34:55.732502849Z",
  "refresh_token": "tbJAWMkG3R3kObaeKdkdrM2mg-9Gl-Q10K4AIvzqcn0",
  "refresh_expires_at": "2026-11-27T09:19:55.731677107Z",
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
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
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
  "session_id": "43bd6c6d-f691-47f3-9606-28d7d3d3d07f",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAwOTYsImlhdCI6MTc5MzE3OTE5NiwianRpIjoiM2NiZGNiMTctZjJkZS00OGQ2LTgwYTQtMDNhYjNkM2MwMzgyIiwic2lkIjoiNDNiZDZjNmQtZjY5MS00N2YzLTk2MDYtMjhkN2QzZDNkMDdmIn0.jGpKNN17k0UZRYlofNzuBV7DE48i3t9YHTWWksqapEw",
  "access_expires_at": "2026-10-28T09:34:56.080144724Z",
  "refresh_token": "cQLq94mEHfsxh7DBF51edCXztEC_bwfM77f0eOXcP7g",
  "refresh_expires_at": "2026-10-28T21:19:56.079371839Z",
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
  "session_id": "c53a45e0-a6f8-4050-bcaf-c5e8f5553bd2",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAwOTYsImlhdCI6MTc5MzE3OTE5NiwianRpIjoiNzhhZjk4MWMtN2Y4ZS00Zjg0LThmZDUtZjQwZTYyNGJjOGM2Iiwic2lkIjoiYzUzYTQ1ZTAtYTZmOC00MDUwLWJjYWYtYzVlOGY1NTUzYmQyIn0.uYypCadeLmlXEYgKkpDCX1Ysz8We9fd7WiJZVRgSB8Y",
  "access_expires_at": "2026-10-28T09:34:56.403778772Z",
  "refresh_token": "LUmynZC-tqfY3TNaM0JsbQ1RG8DgERjuj11-4FfsK_k",
  "refresh_expires_at": "2026-10-28T21:19:56.403102109Z",
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
        "en": "Passenger asked",
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "en": "Accident",
        "uk": "ДТП",
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
  "command_id": "f243d3a8-878c-4c13-af59-26564f61ae52",
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
  "id": "d71d9d51-0ea3-43e3-8c67-8815de1b1355",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:24:56.472874Z",
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
  "command_id": "2fe2e725-b601-4f97-8836-8cc4194802df",
  "quote_id": "d71d9d51-0ea3-43e3-8c67-8815de1b1355",
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
  "id": "4488e2d3-2edd-49bc-971e-adc5197da082",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "256b2763-c8eb-4b86-b711-083e0ed9d57e",
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
  "created_at": "2026-10-28T09:19:56.518269Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/4488e2d3-2edd-49bc-971e-adc5197da082` → **200**

```json
{
  "id": "4488e2d3-2edd-49bc-971e-adc5197da082",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "256b2763-c8eb-4b86-b711-083e0ed9d57e",
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
  "created_at": "2026-10-28T09:19:56.518269Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4488e2d3-2edd-49bc-971e-adc5197da082/cancel` → **200**

```json
{
  "command_id": "0ccbd066-607e-496a-a00e-bf9630120247",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "4488e2d3-2edd-49bc-971e-adc5197da082",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "256b2763-c8eb-4b86-b711-083e0ed9d57e",
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
  "created_at": "2026-10-28T09:19:56.518269Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
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
  "command_id": "1c603dde-afe8-4519-966f-81c3522d504d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:19:56Z",
    "sequence": 1793179196666
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8beed4a9-2dbc-4109-bc1e-41101e79265c",
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
  "last_heartbeat_at": "2026-10-28T09:19:56.686267Z",
  "last_location_at": "2026-10-28T09:19:56.686267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22550"
}
```

```json
{
  "challenge_id": "a1d73e33-c755-4fdd-abc3-da908da31792",
  "expires_at": "2026-10-28T09:24:56.718117749Z",
  "resend_available_at": "2026-10-28T09:19:57.718117749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "614514",
  "sent_at": "2026-10-28T09:19:56.721482476Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1d73e33-c755-4fdd-abc3-da908da31792",
  "code": "614514",
  "device_ref": "sandbox-22550"
}
```

```json
{
  "session_id": "597963e9-d780-46ee-bb64-9151764bf648",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDA5NiwiaWF0IjoxNzkzMTc5MTk2LCJqdGkiOiIzOWRiNjYyZS00OWMwLTQ4NDYtOTc1Zi00NTJmZDkxMzdkMDMiLCJzaWQiOiI1OTc5NjNlOS1kNzgwLTQ2ZWUtYmI2NC05MTUxNzY0YmY2NDgifQ.g1fOzH4XpqMxF9X8VQ3_0DfMKXh6wX8KiwgOE0kebGc",
  "access_expires_at": "2026-10-28T09:34:56.780107928Z",
  "refresh_token": "buyNmDJQOAgA2nvZBBTxiAilRZF3YdkQE9mVsLr7lfk",
  "refresh_expires_at": "2026-11-27T09:19:56.779357647Z",
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
  "command_id": "d06d2841-513e-42b8-88a2-fcd821bfe796",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:19:56Z",
    "sequence": 1793179196834
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a0af4c5f-abc9-452d-bc1b-745de95f21f0",
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
  "last_heartbeat_at": "2026-10-28T09:19:56.854106Z",
  "last_location_at": "2026-10-28T09:19:56.854106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7bb365d6-31df-41c4-9205-b2a9bd4df4f9",
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
  "id": "23451672-99f7-4126-a1c2-8b3a0d20968d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:24:56.897360Z",
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
  "command_id": "be12ead9-b8b4-4a97-8213-4a94da610c1e",
  "quote_id": "23451672-99f7-4126-a1c2-8b3a0d20968d",
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
  "id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "256b2763-c8eb-4b86-b711-083e0ed9d57e",
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
  "created_at": "2026-10-28T09:19:56.941505Z",
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
    "id": "be8b8f5f-ba80-4238-8756-18e9bc2d1d5a",
    "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
    "expires_at": "2026-10-28T09:20:11.946072Z",
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

`POST /api/driver/v1/offers/be8b8f5f-ba80-4238-8756-18e9bc2d1d5a/accept` → **200**

```json
{
  "command_id": "80e0bc66-ba5d-4e9e-9200-8fff3921f827"
}
```

```json
{
  "id": "6b39eff7-51c7-466a-b0fb-b5b8494cbde5",
  "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7eb729c8-79d6-4ec2-a7fb-ec3804c5dfc5",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7eb729c8-79d6-4ec2-a7fb-ec3804c5dfc5",
  "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
  "assignment_id": "6b39eff7-51c7-466a-b0fb-b5b8494cbde5",
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

`POST /api/driver/v1/trips/7eb729c8-79d6-4ec2-a7fb-ec3804c5dfc5/cancel` → **200**

```json
{
  "command_id": "46f6038f-1b07-44fd-95bb-e375f1be5f22",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "7eb729c8-79d6-4ec2-a7fb-ec3804c5dfc5",
  "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
  "assignment_id": "6b39eff7-51c7-466a-b0fb-b5b8494cbde5",
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

`GET /api/rider/v1/orders/d687aebb-56c9-450c-8e5f-f29bcf3315ab` → **200**

```json
{
  "id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "256b2763-c8eb-4b86-b711-083e0ed9d57e",
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
    "id": "6b39eff7-51c7-466a-b0fb-b5b8494cbde5",
    "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7eb729c8-79d6-4ec2-a7fb-ec3804c5dfc5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:19:56.941505Z",
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
    "id": "af07ea52-27fc-4e4f-be92-3204a3831086",
    "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
    "expires_at": "2026-10-28T09:20:12.108107Z",
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

`POST /api/driver/v1/offers/af07ea52-27fc-4e4f-be92-3204a3831086/accept` → **200**

```json
{
  "command_id": "f87112b1-54e1-4998-9ce7-4b8229aa3ded"
}
```

```json
{
  "id": "a732e808-fab5-4ce7-b428-bdded856d281",
  "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f12308c-d29e-4402-bbda-f2b9fc4b4497",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f12308c-d29e-4402-bbda-f2b9fc4b4497",
  "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
  "assignment_id": "a732e808-fab5-4ce7-b428-bdded856d281",
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

`POST /api/driver/v1/trips/1f12308c-d29e-4402-bbda-f2b9fc4b4497/cancel` → **200**

```json
{
  "command_id": "80a1c8f1-240a-46f0-93cb-6a4c9cf98059",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1f12308c-d29e-4402-bbda-f2b9fc4b4497",
  "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
  "assignment_id": "a732e808-fab5-4ce7-b428-bdded856d281",
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
    "id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:19:56.941505Z",
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
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie"
      }
    },
    "pickup_at": null
  },
  {
    "id": "4488e2d3-2edd-49bc-971e-adc5197da082",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:19:56.518269Z",
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
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/d687aebb-56c9-450c-8e5f-f29bcf3315ab/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:19:56.942224Z",
      "actor": {
        "type": "CLIENT",
        "id": "256b2763-c8eb-4b86-b711-083e0ed9d57e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
        "quote_id": "23451672-99f7-4126-a1c2-8b3a0d20968d",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "b9991a08-9599-4ef1-a517-2edc11619032"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:19:56.944865Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
        "attempt_id": "c217e188-ea08-4a27-afe2-7b558d0ef5c5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b9991a08-9599-4ef1-a517-2edc11619032"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:19:56.954014Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "be8b8f5f-ba80-4238-8756-18e9bc2d1d5a",
        "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "b9991a08-9599-4ef1-a517-2edc11619032"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:19:57.020303Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "be8b8f5f-ba80-4238-8756-18e9bc2d1d5a",
        "order_id": "d687aebb-56c9-450c-8e5f-f29bcf3315ab",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6b39eff7-51c7-466a-b0fb-b5b8494cbde5"
      },
      "correlation_id": "b0d5ffc8-f72c-4ff5-8ac4-c7600fa731d4"
```

Done: orders 4488e2d3-2edd-49bc-971e-adc5197da082, d687aebb-56c9-450c-8e5f-f29bcf3315ab.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738775124",
  "device_ref": "sandbox-5843"
}
```

```json
{
  "challenge_id": "03341a0c-3e0c-4974-a379-e6fbf3e48783",
  "expires_at": "2026-10-28T09:24:57.513119065Z",
  "resend_available_at": "2026-10-28T09:19:58.513119065Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738775124` → **200**

```json
{
  "phone": "+380738775124",
  "audience": "CLIENT",
  "code": "288417",
  "sent_at": "2026-10-28T09:19:57.518414737Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03341a0c-3e0c-4974-a379-e6fbf3e48783",
  "code": "288417",
  "device_ref": "sandbox-5843"
}
```

```json
{
  "session_id": "b4d374fc-10c2-4350-a07a-05ff627175cf",
  "subject": {
    "type": "CLIENT",
    "id": "76743fef-b6bd-4c0b-882b-2a2a7b2fe745"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Njc0M2ZlZi1iNmJkLTRjMGItODgyYi0yYTJhN2IyZmU3NDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMDk3LCJpYXQiOjE3OTMxNzkxOTcsImp0aSI6IjY3YzgxNDViLTMwNjAtNDg1NS04ODlmLTgwZjMzYzczOGIxMiIsInNpZCI6ImI0ZDM3NGZjLTEwYzItNDM1MC1hMDdhLTA1ZmY2MjcxNzVjZiJ9.otaGUGUmnZU8KP32vBo43Ypdggr5z53vrD0qNuwlgw4",
  "access_expires_at": "2026-10-28T09:34:57.588100609Z",
  "refresh_token": "XuWnxa30_RKwfJSJvcKFyrYLv909xHgQshkPYegLco4",
  "refresh_expires_at": "2026-11-27T09:19:57.587422624Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "219a7f2a-0760-4162-a267-75e474b103da",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "999ecb86-c1e0-4a12-a5b5-47be2e771e66",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-999ecb86-c1e0-4a12-a5b5-47be2e771e66",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5f1c2ec3d4047247bc089f65f98341a0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=999ecb86-c1e0-4a12-a5b5-47be2e771e66",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738775124"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=999ecb86-c1e0-4a12-a5b5-47be2e771e66",
  "expires_at": "2026-10-28T09:49:57.630908Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/999ecb86-c1e0-4a12-a5b5-47be2e771e66` → **200**

```json
{
  "id": "999ecb86-c1e0-4a12-a5b5-47be2e771e66",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T09:49:57.630908Z",
  "card": {
    "id": "1db01452-94c4-46eb-86dd-94cdaa97cc66",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2993",
    "card_type": "Visa",
    "created_at": "2026-10-28T09:19:57.683121Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "1db01452-94c4-46eb-86dd-94cdaa97cc66",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2993",
      "card_type": "Visa",
      "created_at": "2026-10-28T09:19:57.683121Z"
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
  "device_ref": "sandbox-6180"
}
```

```json
{
  "challenge_id": "49d70cf0-f3a5-40c6-9e0a-d1d9ea4e9102",
  "expires_at": "2026-10-28T09:24:57.769898331Z",
  "resend_available_at": "2026-10-28T09:19:58.769898331Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "808129",
  "sent_at": "2026-10-28T09:19:57.773825571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49d70cf0-f3a5-40c6-9e0a-d1d9ea4e9102",
  "code": "808129",
  "device_ref": "sandbox-6180"
}
```

```json
{
  "session_id": "6b46f7ab-aaac-443b-a997-851686da504f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDA5NywiaWF0IjoxNzkzMTc5MTk3LCJqdGkiOiJjOWUwZmFhOC1lNzExLTRiOWItYWFmMi00M2M4MjQxNmNjNjciLCJzaWQiOiI2YjQ2ZjdhYi1hYWFjLTQ0M2ItYTk5Ny04NTE2ODZkYTUwNGYifQ.BKQ4zvoHzh2-SF0tbTEokqteuDlbZM6sKjkJm-e1Tio",
  "access_expires_at": "2026-10-28T09:34:57.839199343Z",
  "refresh_token": "3Rf1WJ-kKlvhjN6HrHnN9zxzGAVSco18RbFj9VcUPuY",
  "refresh_expires_at": "2026-11-27T09:19:57.838427515Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a0af4c5f-abc9-452d-bc1b-745de95f21f0",
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
  "last_heartbeat_at": "2026-10-28T09:19:56.854106Z",
  "last_location_at": "2026-10-28T09:19:56.854106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a0af4c5f-abc9-452d-bc1b-745de95f21f0/handover` → **200**

```json
{
  "command_id": "79c90ffc-b1c4-4259-9601-6fed7f2bc95f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a0af4c5f-abc9-452d-bc1b-745de95f21f0",
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
  "last_heartbeat_at": "2026-10-28T09:19:56.854106Z",
  "last_location_at": "2026-10-28T09:19:56.854106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a0af4c5f-abc9-452d-bc1b-745de95f21f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:19:57Z",
    "sequence": 1793179197943
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a0af4c5f-abc9-452d-bc1b-745de95f21f0",
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
  "last_heartbeat_at": "2026-10-28T09:19:57.965506Z",
  "last_location_at": "2026-10-28T09:19:57.965506Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c542a5e4-2776-4ea9-82df-210857ede3db",
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
  "id": "204c2dc9-deae-48ea-b382-26caa5569507",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:24:58.010362Z",
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
  "command_id": "2c0f46ab-3431-4e23-9748-381636eb6426",
  "quote_id": "204c2dc9-deae-48ea-b382-26caa5569507",
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
  "id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "76743fef-b6bd-4c0b-882b-2a2a7b2fe745",
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
  "created_at": "2026-10-28T09:19:58.055717Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab` → **200**

```json
{
  "id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "76743fef-b6bd-4c0b-882b-2a2a7b2fe745",
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
  "created_at": "2026-10-28T09:19:58.055717Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab` → **200**

```json
{
  "id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "76743fef-b6bd-4c0b-882b-2a2a7b2fe745",
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
  "created_at": "2026-10-28T09:19:58.055717Z",
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
    "id": "177eb139-38bd-47e3-a9f7-d77a7faf715f",
    "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
    "expires_at": "2026-10-28T09:20:13.398328Z",
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

`POST /api/driver/v1/offers/177eb139-38bd-47e3-a9f7-d77a7faf715f/accept` → **200**

```json
{
  "command_id": "e10ba7b3-c312-4ec3-a067-5ae28d60fd88"
}
```

```json
{
  "id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "assignment_id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
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

`POST /api/driver/v1/work-sessions/a0af4c5f-abc9-452d-bc1b-745de95f21f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:19:59Z",
    "sequence": 1793179199241
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a0af4c5f-abc9-452d-bc1b-745de95f21f0",
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
  "last_heartbeat_at": "2026-10-28T09:19:59.261379Z",
  "last_location_at": "2026-10-28T09:19:59.261379Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5fb87de8-f02a-4228-a5b8-026f9c1f2fab/arrive` → **200**

```json
{
  "command_id": "3349e822-8805-47ca-bfe8-ff1853a18613",
  "expected_version": 0
}
```

```json
{
  "id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "assignment_id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
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
  "arrived_at": "2026-10-28T09:19:59.300212Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5fb87de8-f02a-4228-a5b8-026f9c1f2fab/start` → **200**

```json
{
  "command_id": "ffa9ec37-52d7-4920-a2cb-ee6dfb20921f",
  "expected_version": 1
}
```

```json
{
  "id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "assignment_id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
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
  "arrived_at": "2026-10-28T09:19:59.300212Z",
  "started_at": "2026-10-28T09:19:59.342493Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5fb87de8-f02a-4228-a5b8-026f9c1f2fab/complete` → **200**

```json
{
  "command_id": "bffa0ca7-22f2-4cd0-918f-32d227bf0e3c",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:19:59Z"
}
```

```json
{
  "id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "assignment_id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
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
  "arrived_at": "2026-10-28T09:19:59.300212Z",
  "started_at": "2026-10-28T09:19:59.342493Z",
  "completed_at": "2026-10-28T09:19:59.38669Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab` → **200**

```json
{
  "id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "76743fef-b6bd-4c0b-882b-2a2a7b2fe745",
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
    "id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
    "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:19:58.055717Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab` → **200**

```json
{
  "id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "76743fef-b6bd-4c0b-882b-2a2a7b2fe745",
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
    "id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
    "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:19:58.055717Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab` → **200**

```json
{
  "id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "76743fef-b6bd-4c0b-882b-2a2a7b2fe745",
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
    "id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
    "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:19:58.055717Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab` → **200**

```json
{
  "id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "76743fef-b6bd-4c0b-882b-2a2a7b2fe745",
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
    "id": "37ac4afb-8050-44b3-8a13-9f288271e76b",
    "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5fb87de8-f02a-4228-a5b8-026f9c1f2fab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:19:58.055717Z",
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
      "id": "8e02c015-685f-44a9-821d-ad862f230934",
      "at": "2026-10-28T09:19:59.434696Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab/tip` → **200**

```json
{
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
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
  "available_until": "2026-10-29T09:19:59.38669Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab/tip` → **201**

```json
{
  "command_id": "ad12a041-28d3-4517-9ebc-4f230e0cc38b",
  "amount_minor": 2500
}
```

```json
{
  "id": "baabf830-d5d2-4062-8545-57c29d4b40df",
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T09:20:02.653635Z"
}
```

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab/tip` → **200**

```json
{
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
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
  "available_until": "2026-10-29T09:19:59.38669Z",
  "open": false,
  "tip": {
    "id": "baabf830-d5d2-4062-8545-57c29d4b40df",
    "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T09:20:02.653635Z"
  }
}
```

`GET /api/rider/v1/orders/e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab/tip` → **200**

```json
{
  "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
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
  "available_until": "2026-10-29T09:19:59.38669Z",
  "open": false,
  "tip": {
    "id": "baabf830-d5d2-4062-8545-57c29d4b40df",
    "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T09:20:02.653635Z"
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
      "id": "8e02c015-685f-44a9-821d-ad862f230934",
      "at": "2026-10-28T09:19:59.434696Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
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
      "id": "46a15040-4279-43a8-a829-87c655beaa6f",
      "at": "2026-10-28T09:20:04.525432Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
      "counterpart_id": null
    },
    {
      "id": "8e02c015-685f-44a9-821d-ad862f230934",
      "at": "2026-10-28T09:19:59.434696Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a0af4c5f-abc9-452d-bc1b-745de95f21f0",
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
  "last_heartbeat_at": "2026-10-28T09:19:59.261379Z",
  "last_location_at": "2026-10-28T09:19:59.261379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a0af4c5f-abc9-452d-bc1b-745de95f21f0/close` → **200**

```json
{
  "command_id": "a1b77457-4096-46e7-8275-a00046025aad",
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

Done: card order e606a4aa-14f4-4dca-b91e-8f1bdffcb4ab.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739041101",
  "device_ref": "sandbox-11222"
}
```

```json
{
  "challenge_id": "222e1d51-a1a6-4e5c-aca5-03dca082c1c7",
  "expires_at": "2026-10-28T09:25:04.884369653Z",
  "resend_available_at": "2026-10-28T09:20:05.884369653Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739041101` → **200**

```json
{
  "phone": "+380739041101",
  "audience": "CLIENT",
  "code": "812681",
  "sent_at": "2026-10-28T09:20:04.887647596Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "222e1d51-a1a6-4e5c-aca5-03dca082c1c7",
  "code": "812681",
  "device_ref": "sandbox-11222"
}
```

```json
{
  "session_id": "f5172ed6-66ca-4682-81eb-a4c95f0dee8d",
  "subject": {
    "type": "CLIENT",
    "id": "8de2103d-0876-40ce-b019-5f61cee3656e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGUyMTAzZC0wODc2LTQwY2UtYjAxOS01ZjYxY2VlMzY1NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTA0LCJpYXQiOjE3OTMxNzkyMDQsImp0aSI6ImQ0ODRkZDg2LWQxODUtNDIzYS05ZTZjLTRkNWYyZTlmN2U5NSIsInNpZCI6ImY1MTcyZWQ2LTY2Y2EtNDY4Mi04MWViLWE0Yzk1ZjBkZWU4ZCJ9.vKe059n86wAFHqrw9w1de-zwbuZyWHsEEddpPuv9Lh8",
  "access_expires_at": "2026-10-28T09:35:04.949056131Z",
  "refresh_token": "QFlz5du3pu2H1pEPZa-av1TlPAC1WXtnZfeT3PYl3ro",
  "refresh_expires_at": "2026-11-27T09:20:04.948358429Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "53e7c705-25ec-42a2-a74a-58710162f94f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "5edc0048-0e32-4df9-9f2c-21a0373fd947",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5edc0048-0e32-4df9-9f2c-21a0373fd947",
    "orderDate": "1793179204",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "ccd01f388045f1934d20f15a89f0735e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5edc0048-0e32-4df9-9f2c-21a0373fd947",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739041101"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5edc0048-0e32-4df9-9f2c-21a0373fd947",
  "created_at": "2026-10-28T09:20:04.98607Z",
  "expires_at": "2026-10-28T09:50:04.98607Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/5edc0048-0e32-4df9-9f2c-21a0373fd947` → **200**

```json
{
  "id": "5edc0048-0e32-4df9-9f2c-21a0373fd947",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:20:04.98607Z",
  "expires_at": "2026-10-28T09:50:04.98607Z",
  "completed_at": "2026-10-28T09:20:05.025908Z",
  "masked_pan": "41****4926",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8de2103d-0876-40ce-b019-5f61cee3656e",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8de2103d-0876-40ce-b019-5f61cee3656e",
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
      "id": "b605d969-edb4-4101-ac41-c135f5f1fcc4",
      "at": "2026-10-28T09:20:05.544609Z",
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
  "client_id": "8de2103d-0876-40ce-b019-5f61cee3656e",
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
      "id": "b605d969-edb4-4101-ac41-c135f5f1fcc4",
      "at": "2026-10-28T09:20:05.544609Z",
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
  "device_ref": "sandbox-13255"
}
```

```json
{
  "challenge_id": "38660380-6ef3-418d-857d-5c00ce106ef8",
  "expires_at": "2026-10-28T09:25:06.165127178Z",
  "resend_available_at": "2026-10-28T09:20:07.165127178Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "552269",
  "sent_at": "2026-10-28T09:20:06.167882302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38660380-6ef3-418d-857d-5c00ce106ef8",
  "code": "552269",
  "device_ref": "sandbox-13255"
}
```

```json
{
  "session_id": "2002c696-d811-46b4-a818-fcd9ef99da76",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDEwNiwiaWF0IjoxNzkzMTc5MjA2LCJqdGkiOiI4YTRkODY5Ni03MGI4LTQ5MGEtOGE1Yy0zOGU4ZWE3NGQ1MzEiLCJzaWQiOiIyMDAyYzY5Ni1kODExLTQ2YjQtYTgxOC1mY2Q5ZWY5OWRhNzYifQ.EaNQyIC58yHxOAQZqGoJuO-kN5GWii4Qx-6ltsb8pto",
  "access_expires_at": "2026-10-28T09:35:06.226284479Z",
  "refresh_token": "3QuFZHFZ_MAc0e_cgU34Dp2nYahMZBBGyrnKxM1pT0o",
  "refresh_expires_at": "2026-11-27T09:20:06.225576588Z",
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
  "command_id": "035a7157-8be3-4f45-958a-57555f19910c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "22c289d9-18fe-493d-99cb-a1410147f8d5",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-22c289d9-18fe-493d-99cb-a1410147f8d5",
    "orderDate": "1793179206",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "3caba8911797a7b64d563a29c9934601",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=22c289d9-18fe-493d-99cb-a1410147f8d5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=22c289d9-18fe-493d-99cb-a1410147f8d5",
  "created_at": "2026-10-28T09:20:06.285516Z",
  "expires_at": "2026-10-28T09:50:06.285516Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/22c289d9-18fe-493d-99cb-a1410147f8d5` → **200**

```json
{
  "id": "22c289d9-18fe-493d-99cb-a1410147f8d5",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:20:06.285516Z",
  "expires_at": "2026-10-28T09:50:06.285516Z",
  "completed_at": "2026-10-28T09:20:06.320688Z",
  "masked_pan": "41****3239",
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
      "id": "1c0944a5-df01-47bf-b933-853905f22e12",
      "at": "2026-10-28T09:20:06.550065Z",
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
  "command_id": "d218b02c-a779-4ae0-be1b-83e4feb5f3a6",
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
  "correlation_id": "611bfea7-890a-46d6-8ce7-e7e4e28b09c4"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673377258",
  "device_ref": "sandbox-22596"
}
```

```json
{
  "challenge_id": "880c115a-b4f4-4950-a683-82644d31a1ee",
  "expires_at": "2026-10-28T09:25:07.472280732Z",
  "resend_available_at": "2026-10-28T09:20:08.472280732Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673377258` → **200**

```json
{
  "phone": "+380673377258",
  "audience": "CLIENT",
  "code": "289421",
  "sent_at": "2026-10-28T09:20:07.475429942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "880c115a-b4f4-4950-a683-82644d31a1ee",
  "code": "289421",
  "device_ref": "sandbox-22596"
}
```

```json
{
  "session_id": "026fb52a-ab7c-43ac-840d-4c5f51223bda",
  "subject": {
    "type": "CLIENT",
    "id": "e2a9c843-8168-4873-b68d-857af5f77489"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMmE5Yzg0My04MTY4LTQ4NzMtYjY4ZC04NTdhZjVmNzc0ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTA3LCJpYXQiOjE3OTMxNzkyMDcsImp0aSI6IjQxM2Y0ODUxLTRmNmItNDFlMS05ZWRlLTgzNTE5OWMxZjFhOCIsInNpZCI6IjAyNmZiNTJhLWFiN2MtNDNhYy04NDBkLTRjNWY1MTIyM2JkYSJ9.uUIQmYXtfkV7Hc9XATGjJMYeG4S6Y3fMkK7TbLgTU2w",
  "access_expires_at": "2026-10-28T09:35:07.535279176Z",
  "refresh_token": "jWUpJ3bRsOJfiiXinzENx6AJTgoorphbrJoaOqGEGtI",
  "refresh_expires_at": "2026-11-27T09:20:07.534640641Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e2a9c843-8168-4873-b68d-857af5f77489",
  "session_id": "026fb52a-ab7c-43ac-840d-4c5f51223bda",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b0e3f56-7292-4718-be7c-2c4994bcaf92",
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
  "id": "8b2e7499-a115-44df-b17a-fde082f60c70",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:07.599240Z",
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
  "challenge_id": "60fd0beb-e74d-493c-9916-7cedfa761ebc",
  "expires_at": "2026-10-28T09:25:09.638545336Z",
  "resend_available_at": "2026-10-28T09:20:10.638545336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673377258` → **200**

```json
{
  "phone": "+380673377258",
  "audience": "CLIENT",
  "code": "111800",
  "sent_at": "2026-10-28T09:20:09.641193407Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "32cd21ef-befb-4495-8603-16c175d017ce",
  "challenge_id": "60fd0beb-e74d-493c-9916-7cedfa761ebc",
  "otp_code": "111800"
}
```

```json
{
  "client_id": "e2a9c843-8168-4873-b68d-857af5f77489",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T09:20:09.713632417Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "15c487d1-21cc-48da-ac4c-8ff0a04d3304",
  "quote_id": "8b2e7499-a115-44df-b17a-fde082f60c70",
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
  "correlation_id": "5a29b12f-20e7-4fc0-af8d-267065aea70f"
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
  "session_id": "0b8c220a-c5f6-466c-93b6-6577b245a366",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMTAsImlhdCI6MTc5MzE3OTIxMCwianRpIjoiY2E2NjAzYmItOWUzOS00MjBlLWJmZTEtNDU3Njk2MGJmYTA4Iiwic2lkIjoiMGI4YzIyMGEtYzVmNi00NjZjLTkzYjYtNjU3N2IyNDVhMzY2In0.qblE9Z3U7iBgaAoBgyXDWLXmEiJbm86bE_YXghmQ_cE",
  "access_expires_at": "2026-10-28T09:35:10.083355145Z",
  "refresh_token": "8LBa3qtfSgAdyUGJ8goDSlYLN14eGVdnhAj9piSMIos",
  "refresh_expires_at": "2026-10-28T21:20:10.082650613Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "e2a9c843-8168-4873-b68d-857af5f77489",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T09:20:09.713632Z",
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

`POST /api/admin/v1/client-deletions/e2a9c843-8168-4873-b68d-857af5f77489/complete` → **200**

```json
{
  "command_id": "c74ba7e3-efb8-4722-9720-a6b0e903ab63",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "e2a9c843-8168-4873-b68d-857af5f77489",
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
  "correlation_id": "a70f1a24-c699-443a-8ff3-4e9d33b20eaa"
}
```

Done: client e2a9c843-8168-4873-b68d-857af5f77489 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666280448",
  "device_ref": "sandbox-22959"
}
```

```json
{
  "challenge_id": "1036eb7c-8ec7-4aa1-bf7d-4fdb2cfd4122",
  "expires_at": "2026-10-28T09:25:10.239018079Z",
  "resend_available_at": "2026-10-28T09:20:11.239018079Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666280448` → **200**

```json
{
  "phone": "+380666280448",
  "audience": "CLIENT",
  "code": "588831",
  "sent_at": "2026-10-28T09:20:10.241549303Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1036eb7c-8ec7-4aa1-bf7d-4fdb2cfd4122",
  "code": "588831",
  "device_ref": "sandbox-22959"
}
```

```json
{
  "session_id": "9dd8a7a5-2364-45e0-bdb7-ea8b332af035",
  "subject": {
    "type": "CLIENT",
    "id": "1e8e3295-a2ed-490b-8cee-df73a7151591"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZThlMzI5NS1hMmVkLTQ5MGItOGNlZS1kZjczYTcxNTE1OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTEwLCJpYXQiOjE3OTMxNzkyMTAsImp0aSI6IjMyMzUzMmJlLWZkMGEtNGJlZS1hYjM5LTVhN2RkZjE1NmMyOCIsInNpZCI6IjlkZDhhN2E1LTIzNjQtNDVlMC1iZGI3LWVhOGIzMzJhZjAzNSJ9.vWOzMK-uXZ-wm7jRpGuJrwy2sqFcKpzZAM3F1bDHGXA",
  "access_expires_at": "2026-10-28T09:35:10.298155388Z",
  "refresh_token": "Tudg-Z7Sa1DLyVMowo8FL-RhuQOGOhgD0N79tgh6KWs",
  "refresh_expires_at": "2026-11-27T09:20:10.297577503Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1e8e3295-a2ed-490b-8cee-df73a7151591",
  "session_id": "9dd8a7a5-2364-45e0-bdb7-ea8b332af035",
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
  "session_id": "79bb08cd-69d5-4b7b-abd3-06713cf45d2e",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMTAsImlhdCI6MTc5MzE3OTIxMCwianRpIjoiMDg2MmRjM2EtOTUxNy00NDc0LWE2OTMtZDM3ZTgwNGZmNzA4Iiwic2lkIjoiNzliYjA4Y2QtNjlkNS00YjdiLWFiZDMtMDY3MTNjZjQ1ZDJlIn0.0XcPOVLGEncXHyZthVK7Ad928teB4BsUf9oL6Fzu3QM",
  "access_expires_at": "2026-10-28T09:35:10.646125943Z",
  "refresh_token": "qTkg_1c7s7J6BARyk1Wj1JoZD5g1wdVXQb3UclRyT30",
  "refresh_expires_at": "2026-10-28T21:20:10.645506818Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6280448&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "1e8e3295-a2ed-490b-8cee-df73a7151591",
      "phone": "+380666280448",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T09:20:10.295685Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/1e8e3295-a2ed-490b-8cee-df73a7151591` → **200**

```json
{
  "client": {
    "id": "1e8e3295-a2ed-490b-8cee-df73a7151591",
    "phone": "+380666280448",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T09:20:10.295685Z",
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

`POST /api/admin/v1/clients/1e8e3295-a2ed-490b-8cee-df73a7151591/block` → **400**

```json
{
  "command_id": "d0e785ce-e5e3-478a-a3f4-d503f4626586",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/1e8e3295-a2ed-490b-8cee-df73a7151591/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "729af8b0-fa14-436b-95dd-2175a1b58323",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/1e8e3295-a2ed-490b-8cee-df73a7151591/block` → **200**

```json
{
  "command_id": "ec6c305a-5b16-41c6-8a22-cc09263f9067",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "1e8e3295-a2ed-490b-8cee-df73a7151591",
  "phone": "+380666280448",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T09:20:10.295685Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T09:20:10.818998Z",
    "by": "ce308942-008b-4303-ba6d-11fe07cde8e7"
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
  "correlation_id": "f0491d01-0f06-4951-913c-5071612598be"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666280448",
  "device_ref": "sandbox-18944"
}
```

```json
{
  "challenge_id": "51e8fe5f-68de-4088-bf0b-27346dff71ff",
  "expires_at": "2026-10-28T09:25:12.880808944Z",
  "resend_available_at": "2026-10-28T09:20:13.880808944Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666280448` → **200**

```json
{
  "phone": "+380666280448",
  "audience": "CLIENT",
  "code": "282596",
  "sent_at": "2026-10-28T09:20:12.883435194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "51e8fe5f-68de-4088-bf0b-27346dff71ff",
  "code": "282596",
  "device_ref": "sandbox-18944"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "2dd6f732-e8b3-4e7f-935c-44360672ca9d"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/1e8e3295-a2ed-490b-8cee-df73a7151591` → **200**

```json
{
  "client": {
    "id": "1e8e3295-a2ed-490b-8cee-df73a7151591",
    "phone": "+380666280448",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T09:20:10.295685Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T09:20:10.818998Z",
      "by": "ce308942-008b-4303-ba6d-11fe07cde8e7"
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

`POST /api/admin/v1/clients/1e8e3295-a2ed-490b-8cee-df73a7151591/unblock` → **200**

```json
{
  "command_id": "3fa4dc33-a6eb-4f10-afa4-67e3217b0cc8",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "1e8e3295-a2ed-490b-8cee-df73a7151591",
  "phone": "+380666280448",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T09:20:10.295685Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666280448",
  "device_ref": "sandbox-32654"
}
```

```json
{
  "challenge_id": "8f1ef3a9-8b2e-4a75-9739-7238855f0ecd",
  "expires_at": "2026-10-28T09:25:15.042105529Z",
  "resend_available_at": "2026-10-28T09:20:16.042105529Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666280448` → **200**

```json
{
  "phone": "+380666280448",
  "audience": "CLIENT",
  "code": "689762",
  "sent_at": "2026-10-28T09:20:15.044696524Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f1ef3a9-8b2e-4a75-9739-7238855f0ecd",
  "code": "689762",
  "device_ref": "sandbox-32654"
}
```

```json
{
  "session_id": "60e33c2b-a3aa-450b-9740-cdd2b1cc0e98",
  "subject": {
    "type": "CLIENT",
    "id": "1e8e3295-a2ed-490b-8cee-df73a7151591"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZThlMzI5NS1hMmVkLTQ5MGItOGNlZS1kZjczYTcxNTE1OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTE1LCJpYXQiOjE3OTMxNzkyMTUsImp0aSI6IjhmYmY1ZWEwLWQyMGYtNGQ5YS05ZDliLWVhYjUzMTUwZGQ0NSIsInNpZCI6IjYwZTMzYzJiLWEzYWEtNDUwYi05NzQwLWNkZDJiMWNjMGU5OCJ9.2sXPzxUK5NeNltSmRS9H3v5ngkyjsikrChjdZfenSwI",
  "access_expires_at": "2026-10-28T09:35:15.107804808Z",
  "refresh_token": "6k2XFMtf5iuSKPQRx_XBEycEaQRSnIapt4rp2Z-Y4HM",
  "refresh_expires_at": "2026-11-27T09:20:15.10700178Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1e8e3295-a2ed-490b-8cee-df73a7151591",
  "session_id": "60e33c2b-a3aa-450b-9740-cdd2b1cc0e98",
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
  "phone": "+380632217666",
  "device_ref": "sandbox-26978"
}
```

```json
{
  "challenge_id": "a6cacfad-52cf-49e6-a0f8-347c487fcdb6",
  "expires_at": "2026-10-28T09:25:15.17115199Z",
  "resend_available_at": "2026-10-28T09:20:16.17115199Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632217666` → **200**

```json
{
  "phone": "+380632217666",
  "audience": "CLIENT",
  "code": "652222",
  "sent_at": "2026-10-28T09:20:15.174259309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6cacfad-52cf-49e6-a0f8-347c487fcdb6",
  "code": "652222",
  "device_ref": "sandbox-26978"
}
```

```json
{
  "session_id": "bb7d890e-fd5c-4f64-8d70-a13df520e71e",
  "subject": {
    "type": "CLIENT",
    "id": "89f7f8fc-dfc5-49ca-9a77-68961ce8fcd8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWY3ZjhmYy1kZmM1LTQ5Y2EtOWE3Ny02ODk2MWNlOGZjZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTE1LCJpYXQiOjE3OTMxNzkyMTUsImp0aSI6ImVhOGRhZjBhLTI3ZGItNDAxOS05MTI5LTMyOTRkNjAwMDk5MyIsInNpZCI6ImJiN2Q4OTBlLWZkNWMtNGY2NC04ZDcwLWExM2RmNTIwZTcxZSJ9.HiyIUME8tbXWLryEd7rSwXKaTcqt3IBhjkPQUKtbIxE",
  "access_expires_at": "2026-10-28T09:35:15.233522118Z",
  "refresh_token": "iUIubBQM2ukXNCn38w1R9a6dFXgmZ5Id8iinSJ7dL5M",
  "refresh_expires_at": "2026-11-27T09:20:15.232918171Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "8caf1458-0f1b-4279-bfa4-73c591e77562",
  "expires_at": "2026-10-28T09:25:17.265605567Z",
  "resend_available_at": "2026-10-28T09:20:18.265605567Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632217666` → **200**

```json
{
  "phone": "+380632217666",
  "audience": "CLIENT",
  "code": "037393",
  "sent_at": "2026-10-28T09:20:17.267824848Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "52234ecb-a192-4335-bd4d-6f08739a506c",
  "challenge_id": "8caf1458-0f1b-4279-bfa4-73c591e77562",
  "otp_code": "037393"
}
```

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "PENDING",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547` → **200**

```json
{
  "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
  "state": "READY",
  "created_at": "2026-10-28T09:20:17.331488Z",
  "ready_at": "2026-10-28T09:20:25.109243Z",
  "expires_at": "2026-11-04T09:20:25.109243Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633500360",
  "device_ref": "sandbox-10359"
}
```

```json
{
  "challenge_id": "2b8db491-4306-4973-aeec-537a3e91c5d7",
  "expires_at": "2026-10-28T09:25:25.626356652Z",
  "resend_available_at": "2026-10-28T09:20:26.626356652Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633500360` → **200**

```json
{
  "phone": "+380633500360",
  "audience": "CLIENT",
  "code": "561793",
  "sent_at": "2026-10-28T09:20:25.629250443Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b8db491-4306-4973-aeec-537a3e91c5d7",
  "code": "561793",
  "device_ref": "sandbox-10359"
}
```

```json
{
  "session_id": "a972c7ae-6d2d-4ee7-95cb-2b6946d40f87",
  "subject": {
    "type": "CLIENT",
    "id": "9f385be7-33dd-4198-9fdc-5c97019756b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjM4NWJlNy0zM2RkLTQxOTgtOWZkYy01Yzk3MDE5NzU2YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTI1LCJpYXQiOjE3OTMxNzkyMjUsImp0aSI6IjYxZjM5NWI1LWRhOGItNGZhNi04NDdmLTVhMzEzZWM4ZjEzYyIsInNpZCI6ImE5NzJjN2FlLTZkMmQtNGVlNy05NWNiLTJiNjk0NmQ0MGY4NyJ9.SqJcSKDFS6n4egYX_EmINiDJMatOu8Sv9dKlhPDRWaU",
  "access_expires_at": "2026-10-28T09:35:25.686447434Z",
  "refresh_token": "t3HquJuvN9yu-FRd0wnajPp5PeroXIturTB9eJzcazk",
  "refresh_expires_at": "2026-11-27T09:20:25.685856942Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/40b7628b-6770-4a99-bca5-8e99be63d547/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "04ac4e3e-74c3-433b-aca2-ae109e2636eb"
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
  "session_id": "f7a78cab-84c3-491d-87fe-4209ef328817",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMjYsImlhdCI6MTc5MzE3OTIyNiwianRpIjoiOWY0MjA3ODktYjM0Ny00NThhLWI5OWYtN2VjOTVlMzhiNjY3Iiwic2lkIjoiZjdhNzhjYWItODRjMy00OTFkLTg3ZmUtNDIwOWVmMzI4ODE3In0.FroGaBA-XDcNgPRRU5xDZkr8Dlzl8fh6gj-wNBMPUjA",
  "access_expires_at": "2026-10-28T09:35:26.036691284Z",
  "refresh_token": "PChT9aZ3_mUnMBj9d0DZOcdWFMtm-Z8m3JcGaYio20Q",
  "refresh_expires_at": "2026-10-28T21:20:26.035208137Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "89f7f8fc-dfc5-49ca-9a77-68961ce8fcd8",
  "session_id": "bb7d890e-fd5c-4f64-8d70-a13df520e71e",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/89f7f8fc-dfc5-49ca-9a77-68961ce8fcd8/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "40b7628b-6770-4a99-bca5-8e99be63d547",
      "state": "READY",
      "created_at": "2026-10-28T09:20:17.331488Z",
      "ready_at": "2026-10-28T09:20:25.109243Z",
      "expires_at": "2026-11-04T09:20:25.109243Z",
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
  "device_ref": "sandbox-2863"
}
```

```json
{
  "challenge_id": "7050d10d-4509-4d9e-9ec2-1b73433fa7d5",
  "expires_at": "2026-10-28T09:25:26.135092983Z",
  "resend_available_at": "2026-10-28T09:20:27.135092983Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "140319",
  "sent_at": "2026-10-28T09:20:26.137536253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7050d10d-4509-4d9e-9ec2-1b73433fa7d5",
  "code": "140319",
  "device_ref": "sandbox-2863"
}
```

```json
{
  "session_id": "cc6f21ed-e9cb-44bf-868d-eb36667286d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDEyNiwiaWF0IjoxNzkzMTc5MjI2LCJqdGkiOiI4ZDFlZjhlYi1kMzgzLTQ0ZjgtYjQ0Ni1hZmM2NWMyMGRlMWYiLCJzaWQiOiJjYzZmMjFlZC1lOWNiLTQ0YmYtODY4ZC1lYjM2NjY3Mjg2ZDAifQ.xQQ8N-xWtN92qDl00Gdt2p9OTXi8p25zIZAdJYt1_4c",
  "access_expires_at": "2026-10-28T09:35:26.196691534Z",
  "refresh_token": "KdaUK16SiRmPww3zitY_VYea6fEVeLfG75ceXz0k6BI",
  "refresh_expires_at": "2026-11-27T09:20:26.196095016Z",
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
  "device_ref": "sandbox-10927"
}
```

```json
{
  "challenge_id": "3db122e4-06fe-4519-bec0-1c35d2494a97",
  "expires_at": "2026-10-28T09:25:26.250039678Z",
  "resend_available_at": "2026-10-28T09:20:27.250039678Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "460090",
  "sent_at": "2026-10-28T09:20:26.252480484Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3db122e4-06fe-4519-bec0-1c35d2494a97",
  "code": "460090",
  "device_ref": "sandbox-10927"
}
```

```json
{
  "session_id": "0d9970c4-b6d2-4bba-8e37-04878f28b54a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDEyNiwiaWF0IjoxNzkzMTc5MjI2LCJqdGkiOiJlM2U0ZDZiOC0xZTM4LTQ2NjYtOWRmZC05YjhlMzZmMDJlZTkiLCJzaWQiOiIwZDk5NzBjNC1iNmQyLTRiYmEtOGUzNy0wNDg3OGYyOGI1NGEifQ.o80GNly2c7sqRnYC-2kBOleLkIEz2M6E24zco25Zndw",
  "access_expires_at": "2026-10-28T09:35:26.313281451Z",
  "refresh_token": "5bEEax6rzbSRlIl2VFuH9LAgD3BAZFfGAJVeEYkJzOE",
  "refresh_expires_at": "2026-11-27T09:20:26.312682192Z",
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
  "command_id": "6b8fe3c5-29a8-4df2-abaa-d445f3cec695",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:26Z",
    "sequence": 1793179226366
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8b46b62f-4b3d-4e6d-8035-b721746c5fc6",
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
  "last_heartbeat_at": "2026-10-28T09:20:26.385727Z",
  "last_location_at": "2026-10-28T09:20:26.385727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-6903"
}
```

```json
{
  "challenge_id": "6996ae5b-6e6d-4fc6-9cf2-1e59302918f6",
  "expires_at": "2026-10-28T09:25:26.415985451Z",
  "resend_available_at": "2026-10-28T09:20:27.415985451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "941526",
  "sent_at": "2026-10-28T09:20:26.418421486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6996ae5b-6e6d-4fc6-9cf2-1e59302918f6",
  "code": "941526",
  "device_ref": "sandbox-6903"
}
```

```json
{
  "session_id": "aa883b49-acc2-4995-98dc-01d0ca62ca15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDEyNiwiaWF0IjoxNzkzMTc5MjI2LCJqdGkiOiJjZDZlOTRkNi05MTI0LTRlNzUtYjgxMi0yMGE2Nzg1Y2U2ZjkiLCJzaWQiOiJhYTg4M2I0OS1hY2MyLTQ5OTUtOThkYy0wMWQwY2E2MmNhMTUifQ.ibW_lmbgEiqIrXqGiu0tHQerv6IkIdMYpJtO5-8z20o",
  "access_expires_at": "2026-10-28T09:35:26.476568831Z",
  "refresh_token": "b-Rk08_7HagCJd5qwyV0JDSeak60euxpXI_Eb_ioKkg",
  "refresh_expires_at": "2026-11-27T09:20:26.475965696Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8beed4a9-2dbc-4109-bc1e-41101e79265c",
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
  "last_heartbeat_at": "2026-10-28T09:19:56.686267Z",
  "last_location_at": "2026-10-28T09:19:56.686267Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8beed4a9-2dbc-4109-bc1e-41101e79265c/handover` → **200**

```json
{
  "command_id": "0a2ab492-2318-4797-bcbb-270cca889896",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8beed4a9-2dbc-4109-bc1e-41101e79265c",
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
  "last_heartbeat_at": "2026-10-28T09:19:56.686267Z",
  "last_location_at": "2026-10-28T09:19:56.686267Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8beed4a9-2dbc-4109-bc1e-41101e79265c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:26Z",
    "sequence": 1793179226566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8beed4a9-2dbc-4109-bc1e-41101e79265c",
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
  "last_heartbeat_at": "2026-10-28T09:20:26.585909Z",
  "last_location_at": "2026-10-28T09:20:26.585909Z",
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
  "session_id": "5ae3b9e3-a628-463d-86f1-e15456410b5a",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMjYsImlhdCI6MTc5MzE3OTIyNiwianRpIjoiYzEyZTRmMjktMjgxMS00ZDk4LWE4NDItYjVhNDM3Mzc3MTBlIiwic2lkIjoiNWFlM2I5ZTMtYTYyOC00NjNkLTg2ZjEtZTE1NDU2NDEwYjVhIn0.mI6RsqtCyaLXdfeUbpVk7P4z7N7aZPZR1icG900Xfms",
  "access_expires_at": "2026-10-28T09:35:26.907799374Z",
  "refresh_token": "840QtZolH8aHPcEY9AX9IUUAAwtzzI9s-CPfidbIOm0",
  "refresh_expires_at": "2026-10-28T21:20:26.907201839Z",
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
  "session_id": "b4e8cf18-28f1-420c-a5ab-853b023edd34",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMjcsImlhdCI6MTc5MzE3OTIyNywianRpIjoiNzcyM2Q3NzgtMzBmMy00MTA3LTk1NmQtYjA4NWU0YjliMGRkIiwic2lkIjoiYjRlOGNmMTgtMjhmMS00MjBjLWE1YWItODUzYjAyM2VkZDM0In0.HUS6NS_RytTFoeZGKPDsm9MdYtHHMmrZFSqiKmTcyJE",
  "access_expires_at": "2026-10-28T09:35:27.226501362Z",
  "refresh_token": "52hyuEGx3cuyrpnHDYecJaFfnpM65faxvAb_8APIV_U",
  "refresh_expires_at": "2026-10-28T21:20:27.225930486Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689921185",
  "device_ref": "sandbox-13407"
}
```

```json
{
  "challenge_id": "9d5d5cab-c68f-4d28-a7a7-b82dfb43beab",
  "expires_at": "2026-10-28T09:25:27.253995801Z",
  "resend_available_at": "2026-10-28T09:20:28.253995801Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689921185` → **200**

```json
{
  "phone": "+380689921185",
  "audience": "CLIENT",
  "code": "478021",
  "sent_at": "2026-10-28T09:20:27.256399508Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d5d5cab-c68f-4d28-a7a7-b82dfb43beab",
  "code": "478021",
  "device_ref": "sandbox-13407"
}
```

```json
{
  "session_id": "8b3b7293-ddb5-4b38-853e-b2033f1a8702",
  "subject": {
    "type": "CLIENT",
    "id": "c8c66e39-65dd-4ec6-aa28-44a1224f31ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGM2NmUzOS02NWRkLTRlYzYtYWEyOC00NGExMjI0ZjMxZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTI3LCJpYXQiOjE3OTMxNzkyMjcsImp0aSI6IjkwODJjNDZkLTc3MzgtNGZiMi05ZTZlLTNmZDhhYmEyYzk3OSIsInNpZCI6IjhiM2I3MjkzLWRkYjUtNGIzOC04NTNlLWIyMDMzZjFhODcwMiJ9.5IAUKwDfVQggLq4ZsgY22uWAHwe17yzPpzo71_N0-ro",
  "access_expires_at": "2026-10-28T09:35:27.314123653Z",
  "refresh_token": "Gg_HS0tRte6zFpdW3uHnc_GRFZVA1mZBL9qGwJxiUjw",
  "refresh_expires_at": "2026-11-27T09:20:27.313459973Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0f8c90ae-b0c1-4121-a20d-742239f99c84",
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
  "id": "31c6be1e-b75e-4799-8a15-34355bd89ef6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:27.352328Z",
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
  "command_id": "78728a40-45ac-4238-afdd-c1e891482dcd",
  "quote_id": "31c6be1e-b75e-4799-8a15-34355bd89ef6",
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
  "id": "21607223-c8bf-42af-b8de-b5c665aa634b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c8c66e39-65dd-4ec6-aa28-44a1224f31ef",
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
  "created_at": "2026-10-28T09:20:27.393314Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "402c437f-7c61-468b-855d-ddd0934dc682",
    "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b",
    "expires_at": "2026-10-28T09:20:42.397337Z",
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

`POST /api/driver/v1/offers/402c437f-7c61-468b-855d-ddd0934dc682/reject` → **204**

```json
{
  "command_id": "57fd46dd-953a-4b52-93f9-e964d5349de6"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "f76f46cc-f283-4984-9e27-23871ed17d6e",
    "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b",
    "expires_at": "2026-10-28T09:20:42.473158Z",
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

`POST /api/driver/v1/offers/f76f46cc-f283-4984-9e27-23871ed17d6e/accept` → **200**

```json
{
  "command_id": "dae5e776-5abe-408c-a07b-7a70a3bc19de"
}
```

```json
{
  "id": "85c9494e-6af6-43a5-b9b9-c0a45eb46547",
  "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4acf6378-29b2-420e-8b88-396d49d26d1f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/21607223-c8bf-42af-b8de-b5c665aa634b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:20:27.394009Z",
      "actor": {
        "type": "CLIENT",
        "id": "c8c66e39-65dd-4ec6-aa28-44a1224f31ef",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b",
        "quote_id": "31c6be1e-b75e-4799-8a15-34355bd89ef6",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "59344eed-12d6-4f66-b3a7-ebaccb257f49"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:20:27.396192Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b",
        "attempt_id": "f9645bc1-7bcd-4a22-8582-8b746d3a370a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "59344eed-12d6-4f66-b3a7-ebaccb257f49"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:20:27.404482Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "402c437f-7c61-468b-855d-ddd0934dc682",
        "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "59344eed-12d6-4f66-b3a7-ebaccb257f49"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T09:20:27.471853Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "402c437f-7c61-468b-855d-ddd0934dc682",
        "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b"
      },
      "correlation_id": "b4fb55f3-01e5-410e-a865-5136d9e74b54"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 21607223-c8bf-42af-b8de-b5c665aa634b — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/21607223-c8bf-42af-b8de-b5c665aa634b` → **200**

```json
{
  "id": "21607223-c8bf-42af-b8de-b5c665aa634b",
  "short_number": 5,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c8c66e39-65dd-4ec6-aa28-44a1224f31ef",
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
    "id": "85c9494e-6af6-43a5-b9b9-c0a45eb46547",
    "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4acf6378-29b2-420e-8b88-396d49d26d1f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:20:27.393314Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/21607223-c8bf-42af-b8de-b5c665aa634b/cancel` → **200**

```json
{
  "command_id": "b976eb6b-17dc-4f2e-a4d6-0d59ce6b371a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "21607223-c8bf-42af-b8de-b5c665aa634b",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c8c66e39-65dd-4ec6-aa28-44a1224f31ef",
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
    "id": "85c9494e-6af6-43a5-b9b9-c0a45eb46547",
    "order_id": "21607223-c8bf-42af-b8de-b5c665aa634b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4acf6378-29b2-420e-8b88-396d49d26d1f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:20:27.393314Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "session_id": "8b46b62f-4b3d-4e6d-8035-b721746c5fc6",
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
  "last_heartbeat_at": "2026-10-28T09:20:26.385727Z",
  "last_location_at": "2026-10-28T09:20:26.385727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8b46b62f-4b3d-4e6d-8035-b721746c5fc6/close` → **200**

```json
{
  "command_id": "9712566f-bfe3-4a13-869e-0291fff35839",
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
  "session_id": "8beed4a9-2dbc-4109-bc1e-41101e79265c",
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
  "last_heartbeat_at": "2026-10-28T09:20:26.585909Z",
  "last_location_at": "2026-10-28T09:20:26.585909Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8beed4a9-2dbc-4109-bc1e-41101e79265c/close` → **200**

```json
{
  "command_id": "2305447d-56af-40a3-96cb-7989f779dfbb",
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
  "device_ref": "sandbox-3189"
}
```

```json
{
  "challenge_id": "62e5bf60-9445-4af1-8456-97a7ce7937bd",
  "expires_at": "2026-10-28T09:25:27.892922593Z",
  "resend_available_at": "2026-10-28T09:20:28.892922593Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "430841",
  "sent_at": "2026-10-28T09:20:27.895211717Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62e5bf60-9445-4af1-8456-97a7ce7937bd",
  "code": "430841",
  "device_ref": "sandbox-3189"
}
```

```json
{
  "session_id": "0fbb6deb-34f5-4f7f-a0b0-755b5fb3facb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDEyNywiaWF0IjoxNzkzMTc5MjI3LCJqdGkiOiJmYzdjMWI1OS05Zjk1LTQ3ZmYtOTExNi01ZDk0YmY5OGVlZDQiLCJzaWQiOiIwZmJiNmRlYi0zNGY1LTRmN2YtYTBiMC03NTViNWZiM2ZhY2IifQ._AwCsOMNPWREvVvG1SlnTEHT0iMy3NvOUmib7lMjntI",
  "access_expires_at": "2026-10-28T09:35:27.950871869Z",
  "refresh_token": "XxGXMYQv_ZkZceYyITq32douk1QyS8mTONO7Urdi2fM",
  "refresh_expires_at": "2026-11-27T09:20:27.950195888Z",
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
  "command_id": "593390f7-5144-4b3b-a4c4-70282f0a3a66",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:27Z",
    "sequence": 1793179228187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:28.02047Z",
  "last_location_at": "2026-10-28T09:20:28.02047Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675732975",
  "device_ref": "sandbox-20367"
}
```

```json
{
  "challenge_id": "9bf5a341-da9d-474c-b4ee-1f13a58f582a",
  "expires_at": "2026-10-28T09:25:28.053173914Z",
  "resend_available_at": "2026-10-28T09:20:29.053173914Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675732975` → **200**

```json
{
  "phone": "+380675732975",
  "audience": "CLIENT",
  "code": "167736",
  "sent_at": "2026-10-28T09:20:28.055419787Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9bf5a341-da9d-474c-b4ee-1f13a58f582a",
  "code": "167736",
  "device_ref": "sandbox-20367"
}
```

```json
{
  "session_id": "03cc2b1f-a926-4a22-a800-ccb29a290371",
  "subject": {
    "type": "CLIENT",
    "id": "e9b557b6-1674-42d7-be7a-2f337e8f41ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOWI1NTdiNi0xNjc0LTQyZDctYmU3YS0yZjMzN2U4ZjQxY2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTI4LCJpYXQiOjE3OTMxNzkyMjgsImp0aSI6IjA3ZDBiM2JkLTQ4YmYtNDAyOS1iNjQ4LWQ2NGExZTVlMzJjNiIsInNpZCI6IjAzY2MyYjFmLWE5MjYtNGEyMi1hODAwLWNjYjI5YTI5MDM3MSJ9.m6dOAjH_lsXCmMkTTgPtlEjb_AUir-sUGr8qIBqPMWQ",
  "access_expires_at": "2026-10-28T09:35:28.112320002Z",
  "refresh_token": "TO18dygpQhwWfRkRuUFMeWMHTJaUrBMO4YeWQ_KY8Pw",
  "refresh_expires_at": "2026-11-27T09:20:28.111709042Z",
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
  "command_id": "a75f8ab7-8db1-4d57-90ed-7e8e75a8121d",
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
  "id": "8c208d3d-c751-4a3a-b345-94dfaff9fec5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:28.194957Z",
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
  "command_id": "9a822213-72ec-40bb-b8fc-85462a53559c",
  "platform": "ANDROID",
  "token": "sandbox-driver-35ef3f88-880b-4dd5-9d96-3378668f5030"
}
```

```json
{
  "id": "3eb9df49-2884-4e7f-85c1-f10fe56436a0",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:20:28.239627Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "11208157-5258-4a9c-82d8-ff6c4ef0e918",
  "platform": "ANDROID",
  "token": "sandbox-rider-93565c83-c569-4a0f-b08f-7cd7a9459ec3"
}
```

```json
{
  "id": "280199e5-ae2b-4718-a804-4a3c8c9745fd",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:20:28.277293Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2017de1a-bae2-4b07-a589-886a8377ecd3",
  "quote_id": "8c208d3d-c751-4a3a-b345-94dfaff9fec5",
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
  "id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e9b557b6-1674-42d7-be7a-2f337e8f41ca",
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
  "created_at": "2026-10-28T09:20:28.320722Z",
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
    "id": "55490c22-96a4-4fa3-b698-83e0e98d434d",
    "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
    "expires_at": "2026-10-28T09:20:43.324324Z",
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

`POST /api/driver/v1/offers/55490c22-96a4-4fa3-b698-83e0e98d434d/accept` → **200**

```json
{
  "command_id": "f045d999-eff4-47fb-b721-c97c8e7ab4e1"
}
```

```json
{
  "id": "233a874f-8a7e-4b2c-9105-7e2063fb6dfb",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3152abec-5310-4057-944a-f60f8baeba2e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:20:28.296Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:20:28.296Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:20:29.231502799Z",
    "token_suffix": "8f5030",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "de09bdd5-0263-48fe-b42e-3bb3d4f59c60",
      "order_version": "2",
      "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675732975&after=2026-10-28T09:20:28.296Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:20:29.234015997Z",
    "token_suffix": "459ec3",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "d177650a-76e5-4793-88f0-e984718e1030",
      "order_version": "3",
      "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/35d59c43-d8e0-424b-b9e2-3b7efe22146d/messages` → **201**

```json
{
  "command_id": "87ad1405-d7ba-4349-ae3c-1a4f714c3010",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "b15e3c1b-c7eb-49eb-9adc-e881fb7e5c49",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T09:20:29.522792204Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3152abec-5310-4057-944a-f60f8baeba2e",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "assignment_id": "233a874f-8a7e-4b2c-9105-7e2063fb6dfb",
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

`POST /api/driver/v1/trips/3152abec-5310-4057-944a-f60f8baeba2e/messages` → **201**

```json
{
  "command_id": "ba7ce174-fc63-48ef-bc54-2dbc2e378b0e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ca93b03a-837e-40c5-8066-744c95e5a8ef",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T09:20:29.577235008Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/35d59c43-d8e0-424b-b9e2-3b7efe22146d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/3152abec-5310-4057-944a-f60f8baeba2e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675732975"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:29Z",
    "sequence": 1793179229656
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:29.676653Z",
  "last_location_at": "2026-10-28T09:20:29.676653Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3152abec-5310-4057-944a-f60f8baeba2e",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "assignment_id": "233a874f-8a7e-4b2c-9105-7e2063fb6dfb",
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

`POST /api/driver/v1/trips/3152abec-5310-4057-944a-f60f8baeba2e/arrive` → **200**

```json
{
  "command_id": "b64dbf82-8037-44de-b9dd-db9de4f28562",
  "expected_version": 0
}
```

```json
{
  "id": "3152abec-5310-4057-944a-f60f8baeba2e",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "assignment_id": "233a874f-8a7e-4b2c-9105-7e2063fb6dfb",
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
  "arrived_at": "2026-10-28T09:20:29.733228Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3152abec-5310-4057-944a-f60f8baeba2e/start` → **200**

```json
{
  "command_id": "972e8b20-c63b-4e5d-9669-945624f068a5",
  "expected_version": 1
}
```

```json
{
  "id": "3152abec-5310-4057-944a-f60f8baeba2e",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "assignment_id": "233a874f-8a7e-4b2c-9105-7e2063fb6dfb",
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
  "arrived_at": "2026-10-28T09:20:29.733228Z",
  "started_at": "2026-10-28T09:20:29.775081Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:29Z",
    "sequence": 1793179229803
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:29.824271Z",
  "last_location_at": "2026-10-28T09:20:29.824271Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/3152abec-5310-4057-944a-f60f8baeba2e/complete` → **200**

```json
{
  "command_id": "b21f3410-f62c-4e9d-ac76-4ecb55c4a592",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:20:29Z",
  "cash_received": true
}
```

```json
{
  "id": "3152abec-5310-4057-944a-f60f8baeba2e",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "assignment_id": "233a874f-8a7e-4b2c-9105-7e2063fb6dfb",
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
  "arrived_at": "2026-10-28T09:20:29.733228Z",
  "started_at": "2026-10-28T09:20:29.775081Z",
  "completed_at": "2026-10-28T09:20:29.86496Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/35d59c43-d8e0-424b-b9e2-3b7efe22146d` → **200**

```json
{
  "id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e9b557b6-1674-42d7-be7a-2f337e8f41ca",
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
    "id": "233a874f-8a7e-4b2c-9105-7e2063fb6dfb",
    "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3152abec-5310-4057-944a-f60f8baeba2e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:20:28.320722Z",
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
    "id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:20:28.320722Z",
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
    "id": "3152abec-5310-4057-944a-f60f8baeba2e",
    "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
    "order_short_number": 6,
    "created_at": "2026-10-28T09:20:28.394309Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ae5ebb76-18ac-4a9e-839e-fe6838b0541d",
    "order_id": "a145e4c5-14af-4c66-b206-181cf93b29bd",
    "order_short_number": 1,
    "created_at": "2026-10-28T09:19:48.885486Z",
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

`GET /api/rider/v1/orders/35d59c43-d8e0-424b-b9e2-3b7efe22146d/tip` → **200**

```json
{
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
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
  "available_until": "2026-10-29T09:20:29.86496Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/35d59c43-d8e0-424b-b9e2-3b7efe22146d/tip` → **201**

```json
{
  "command_id": "4daec10d-a0ca-4c86-8b09-edf6d067caf2",
  "amount_minor": 1100
}
```

```json
{
  "id": "2d6366d5-8ffc-4be1-94e4-99cb887b2961",
  "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T09:20:33.090046Z"
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
  "session_id": "ddf49a47-ae0c-40ba-822b-2a9e7ff55f91",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMzMsImlhdCI6MTc5MzE3OTIzMywianRpIjoiOWViNzIxMTItYWYyNy00OGRhLTg2ZTktOWYzOTA2NTFjOTRjIiwic2lkIjoiZGRmNDlhNDctYWUwYy00MGJhLTgyMmItMmE5ZTdmZjU1ZjkxIn0.AMUDo1YD7qmNQgFcTs4VPEONQfoax24Tm1YQM4Psq4k",
  "access_expires_at": "2026-10-28T09:35:33.419689187Z",
  "refresh_token": "tdGe79iCeTjo578Ni2sbvt3PvJF0WTWJn9mvWR1vDPQ",
  "refresh_expires_at": "2026-10-28T21:20:33.419055676Z",
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
        "created": 6,
        "fulfilled": 3,
        "cancelled": 3,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 6
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 5
        },
        "cancelled_by": {
          "RIDER": 1,
          "STAFF": 1,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 6,
    "fulfilled": 3,
    "cancelled": 3,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 6
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 5
    },
    "cancelled_by": {
      "RIDER": 1,
      "STAFF": 1,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
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
  "generated_at": "2026-10-28T09:20:33.453888637Z"
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
  "generated_at": "2026-10-28T09:20:33.485667922Z"
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
  "session_id": "97de888c-8e79-4ddf-987a-f99019b8bea0",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMzMsImlhdCI6MTc5MzE3OTIzMywianRpIjoiYjk2Mzc0MTItMDBlNC00NzIyLWE0ZWItM2M1YzI0MTQxNjkxIiwic2lkIjoiOTdkZTg4OGMtOGU3OS00ZGRmLTk4N2EtZjk5MDE5YjhiZWEwIn0.fsfBB_YtYR-R8MGxlgjmT-2RzuNyzAeEpTyCVk-L4MY",
  "access_expires_at": "2026-10-28T09:35:33.810050318Z",
  "refresh_token": "Im6bwm-W3J1Ojzcv0yYL2g_t0clvt9aiKvB8C8U9cTM",
  "refresh_expires_at": "2026-10-28T21:20:33.809311551Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/35d59c43-d8e0-424b-b9e2-3b7efe22146d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:20:28.321272Z",
      "actor": {
        "type": "CLIENT",
        "id": "e9b557b6-1674-42d7-be7a-2f337e8f41ca",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
        "quote_id": "8c208d3d-c751-4a3a-b345-94dfaff9fec5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c28e98a4-9df2-4f9b-8875-039c82c1df81"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:20:28.323381Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
        "attempt_id": "09f2388c-d4f7-4ef3-a64d-117514ca9b40",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c28e98a4-9df2-4f9b-8875-039c82c1df81"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:20:28.330395Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "55490c22-96a4-4fa3-b698-83e0e98d434d",
        "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c28e98a4-9df2-4f9b-8875-039c82c1df81"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:20:28.396382Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "55490c22-96a4-4fa3-b698-83e0e98d434d",
        "order_id": "35d59c43-d8e0-424b-b9e2-3b7efe22146d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "233a874f-8a7e-4b2c-9105-7e2063fb6dfb"
      },
      "correlation_id": "93b301a5-e818-4b59-a382-a5e3ba2f401f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T09:20:33.86763684Z",
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
      "last_location_at": "2026-10-28T09:20:29.824271Z",
      "order_id": null
    }
  ]
}
```

Done: order 35d59c43-d8e0-424b-b9e2-3b7efe22146d.

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
  "session_id": "aa66abe7-81ae-4386-b02e-63b6e584c66b",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMzQsImlhdCI6MTc5MzE3OTIzNCwianRpIjoiY2VjMzFmZDMtZjdhMS00YjczLTg4ZWQtMTdmYjA4NTg1YzMxIiwic2lkIjoiYWE2NmFiZTctODFhZS00Mzg2LWIwMmUtNjNiNmU1ODRjNjZiIn0.ywNc6AgpDEq9zAMI7xH1jcYkh93cpM9XVvaVA1sYJfY",
  "access_expires_at": "2026-10-28T09:35:34.207875972Z",
  "refresh_token": "_zBMSB5CouMTc82_dW6ibFhb-gb4DOZouwWNTxJi-W8",
  "refresh_expires_at": "2026-10-28T21:20:34.207242421Z",
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
  "command_id": "c4bd144e-eac7-47bc-b397-19a6f54cd592",
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
  "timestamp": "2026-10-28T09:20:34.000+0000",
  "channel": {
    "id": "1730052000.273317622",
    "linkedid": "1730052000.273317622",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673475485"
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
  "timestamp": "2026-10-28T09:20:34.000+0000",
  "channel": {
    "id": "1730052000.273317622",
    "linkedid": "1730052000.273317622",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673475485"
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
  "session_id": "ef9d63a7-3c7a-403d-880e-c5efce5ac01e",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMzQsImlhdCI6MTc5MzE3OTIzNCwianRpIjoiZWQ0ODE4YjItOTVlOC00NWIxLThjZDEtMTAxYjQ1YmZjMmY1Iiwic2lkIjoiZWY5ZDYzYTctM2M3YS00MDNkLTg4MGUtYzVlZmNlNWFjMDFlIn0.wtasoevaba0xLrbGpMzBTUT2ontElwnmvI8eeMbH4d4",
  "access_expires_at": "2026-10-28T09:35:34.646771558Z",
  "refresh_token": "zDgMUhb-MNb-TyzLk3gSDdY4bTZ_b6ZePhNfwq2Cp4g",
  "refresh_expires_at": "2026-10-28T21:20:34.646200412Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "ac087d29-0389-476b-8125-96da3bbe98d1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673475485",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:20:34Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/ac087d29-0389-476b-8125-96da3bbe98d1/answer` → **200**

```json
{
  "command_id": "17487e61-692f-4c4c-a779-9ea6735e1a88"
}
```

```json
{
  "id": "ac087d29-0389-476b-8125-96da3bbe98d1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673475485",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "order_ids": [],
  "started_at": "2026-10-28T09:20:34Z",
  "answered_at": "2026-10-28T09:20:34.718522Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.273317622",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e2adc099-8edf-474e-b2f3-ed20b6d10e4b",
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
  "id": "3ce08e57-15cb-4754-9111-d4133dfc6c0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:34.785324Z",
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
  "command_id": "04e1db76-6d89-4589-b3e1-4fb847c5ede5",
  "quote_id": "3ce08e57-15cb-4754-9111-d4133dfc6c0f",
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
    "phone": "+380673475485"
  },
  "call_id": "ac087d29-0389-476b-8125-96da3bbe98d1"
}
```

```json
{
  "id": "cf941b83-b43c-4f87-84fc-308482712d0e",
  "short_number": 7,
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
  "created_at": "2026-10-28T09:20:34.841821Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673475485"
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
    "id": "1730052000.273317622",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ac087d29-0389-476b-8125-96da3bbe98d1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673475485",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [
        "cf941b83-b43c-4f87-84fc-308482712d0e"
      ],
      "started_at": "2026-10-28T09:20:34Z",
      "answered_at": "2026-10-28T09:20:34.718522Z",
      "ended_at": "2026-10-28T09:20:34.896331Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "e57c6a7e-c3c6-4bee-ac90-02403264afb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670209713",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [],
      "started_at": "2026-10-28T09:19:53.187216Z",
      "answered_at": "2026-10-28T09:19:53.25613Z",
      "ended_at": "2026-10-28T09:19:53.314428Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:19:55.09572Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/cf941b83-b43c-4f87-84fc-308482712d0e` → **200**

```json
{
  "id": "cf941b83-b43c-4f87-84fc-308482712d0e",
  "short_number": 7,
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
  "created_at": "2026-10-28T09:20:34.841821Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673475485"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/cf941b83-b43c-4f87-84fc-308482712d0e` → **200**

```json
{
  "id": "cf941b83-b43c-4f87-84fc-308482712d0e",
  "short_number": 7,
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
  "created_at": "2026-10-28T09:20:34.841821Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673475485"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cf941b83-b43c-4f87-84fc-308482712d0e/cancel` → **200**

```json
{
  "command_id": "f47cea4c-43a0-451a-8e5c-761fbd61a511",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "cf941b83-b43c-4f87-84fc-308482712d0e",
  "short_number": 7,
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
  "created_at": "2026-10-28T09:20:34.841821Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673475485"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call ac087d29-0389-476b-8125-96da3bbe98d1 with order cf941b83-b43c-4f87-84fc-308482712d0e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15712"
}
```

```json
{
  "challenge_id": "6cae9852-b9fa-4db0-bccf-ff1b72eec366",
  "expires_at": "2026-10-28T09:25:35.053706138Z",
  "resend_available_at": "2026-10-28T09:20:36.053706138Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "397177",
  "sent_at": "2026-10-28T09:20:35.056127744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cae9852-b9fa-4db0-bccf-ff1b72eec366",
  "code": "397177",
  "device_ref": "sandbox-15712"
}
```

```json
{
  "session_id": "8564b8bb-f41e-4dbc-a784-24119e524a1b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDEzNSwiaWF0IjoxNzkzMTc5MjM1LCJqdGkiOiIzOWQxODJlNC1hYWEzLTRjYzktYjZhZS02NzljZmIyZTAxN2EiLCJzaWQiOiI4NTY0YjhiYi1mNDFlLTRkYmMtYTc4NC0yNDExOWU1MjRhMWIifQ.Fd7Oe7_CtNBt0jrnyoiMKmR9kZi5JS3gnTryXg4Chhk",
  "access_expires_at": "2026-10-28T09:35:35.114294803Z",
  "refresh_token": "OLjTg21C41LGrKC4y4E2mss65VgT2ZdceeAqhXpzpLo",
  "refresh_expires_at": "2026-11-27T09:20:35.11359605Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:29.824271Z",
  "last_location_at": "2026-10-28T09:20:29.824271Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/handover` → **200**

```json
{
  "command_id": "f852195c-16a6-4f53-a7c2-9c26d8ee79b8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:29.824271Z",
  "last_location_at": "2026-10-28T09:20:29.824271Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:35Z",
    "sequence": 1793179235210
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:35.230775Z",
  "last_location_at": "2026-10-28T09:20:35.230775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665890784",
  "device_ref": "sandbox-5444"
}
```

```json
{
  "challenge_id": "7cd96625-1318-42e9-80a0-0a766a532bb3",
  "expires_at": "2026-10-28T09:25:35.2584709Z",
  "resend_available_at": "2026-10-28T09:20:36.2584709Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665890784` → **200**

```json
{
  "phone": "+380665890784",
  "audience": "CLIENT",
  "code": "689779",
  "sent_at": "2026-10-28T09:20:35.260905134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cd96625-1318-42e9-80a0-0a766a532bb3",
  "code": "689779",
  "device_ref": "sandbox-5444"
}
```

```json
{
  "session_id": "7dc42021-dc7b-49e9-b6a7-c1c6b6c212de",
  "subject": {
    "type": "CLIENT",
    "id": "7c7c6c52-35cc-43c4-a6da-15ab09d23e53"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzdjNmM1Mi0zNWNjLTQzYzQtYTZkYS0xNWFiMDlkMjNlNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTM1LCJpYXQiOjE3OTMxNzkyMzUsImp0aSI6IjM0NGRkODIyLTJjNzctNGRlMy1hMWI0LWU5MGUwMTJjNWY4NSIsInNpZCI6IjdkYzQyMDIxLWRjN2ItNDllOS1iNmE3LWMxYzZiNmMyMTJkZSJ9.rCeGdYbDrZxdhCMa0s9soB9VbtBsZKXjFHJrUKyZkTg",
  "access_expires_at": "2026-10-28T09:35:35.318809495Z",
  "refresh_token": "RwIVhnDoAFQ4YLSkYwWjV-KOAdb1EP2WPe8MOvJG6V4",
  "refresh_expires_at": "2026-11-27T09:20:35.318243729Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e34f42f2-b1d3-4d02-a1cc-c7bd9672af3f",
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
  "id": "e12551e8-79ef-4894-aafd-9323fe67778e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:35.355762Z",
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
  "command_id": "47d5e97c-cb03-4e58-8f61-57950d428678",
  "quote_id": "e12551e8-79ef-4894-aafd-9323fe67778e",
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
  "id": "a5262b28-f474-42ff-aba1-066d5983b10f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c7c6c52-35cc-43c4-a6da-15ab09d23e53",
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
  "created_at": "2026-10-28T09:20:35.39486Z",
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
    "id": "2943a9a5-2a38-40c9-ab7d-7dae29e284cd",
    "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
    "expires_at": "2026-10-28T09:20:50.398513Z",
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

`POST /api/driver/v1/offers/2943a9a5-2a38-40c9-ab7d-7dae29e284cd/accept` → **200**

```json
{
  "command_id": "7a7cb785-34be-421c-9b5b-34a88ff8aad2"
}
```

```json
{
  "id": "53007ad1-a81a-42e6-9e75-1591b0c3e90a",
  "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "24b6293e-aa46-44cf-bd0c-f2d0cc18c7d6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24b6293e-aa46-44cf-bd0c-f2d0cc18c7d6",
  "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
  "assignment_id": "53007ad1-a81a-42e6-9e75-1591b0c3e90a",
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

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:35Z",
    "sequence": 1793179235505
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:35.524132Z",
  "last_location_at": "2026-10-28T09:20:35.524132Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/24b6293e-aa46-44cf-bd0c-f2d0cc18c7d6/arrive` → **200**

```json
{
  "command_id": "1dcb46ea-3144-4ef5-9320-4186b542699e",
  "expected_version": 0
}
```

```json
{
  "id": "24b6293e-aa46-44cf-bd0c-f2d0cc18c7d6",
  "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
  "assignment_id": "53007ad1-a81a-42e6-9e75-1591b0c3e90a",
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
  "arrived_at": "2026-10-28T09:20:35.561308Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/24b6293e-aa46-44cf-bd0c-f2d0cc18c7d6/start` → **200**

```json
{
  "command_id": "39133d78-4cdc-4dcd-9f96-fcaf67437381",
  "expected_version": 1
}
```

```json
{
  "id": "24b6293e-aa46-44cf-bd0c-f2d0cc18c7d6",
  "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
  "assignment_id": "53007ad1-a81a-42e6-9e75-1591b0c3e90a",
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
  "arrived_at": "2026-10-28T09:20:35.561308Z",
  "started_at": "2026-10-28T09:20:35.601114Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:35Z",
    "sequence": 1793179235627
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:35.646345Z",
  "last_location_at": "2026-10-28T09:20:35.646345Z",
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
  "device_ref": "sandbox-9112"
}
```

```json
{
  "challenge_id": "630099c0-97e2-4245-a700-ab1a34f85366",
  "expires_at": "2026-10-28T09:25:35.671102659Z",
  "resend_available_at": "2026-10-28T09:20:36.671102659Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "490349",
  "sent_at": "2026-10-28T09:20:35.673265605Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "630099c0-97e2-4245-a700-ab1a34f85366",
  "code": "490349",
  "device_ref": "sandbox-9112"
}
```

```json
{
  "session_id": "c3d31eaa-144d-4463-8573-d0741c3873ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDEzNSwiaWF0IjoxNzkzMTc5MjM1LCJqdGkiOiJmZDViNTExOS00NjlkLTQ0MWQtODM0Yi1lODUzNWE2OWYwMzAiLCJzaWQiOiJjM2QzMWVhYS0xNDRkLTQ0NjMtODU3My1kMDc0MWMzODczZWQifQ.9gwZB5fBP7sR0KSzoD-SoH2JU4Ra1AqW-90kAwJublk",
  "access_expires_at": "2026-10-28T09:35:35.740886829Z",
  "refresh_token": "wW7uL9zg4z5dBAIMxrJDIHwdtI9kyvehe6qBGFaZr-s",
  "refresh_expires_at": "2026-11-27T09:20:35.740247145Z",
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
  "command_id": "bb1d1280-897d-41f6-a21e-39878381e051",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:35Z",
    "sequence": 1793179235800
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d108556a-984b-4bed-9210-4debce873105",
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
  "last_heartbeat_at": "2026-10-28T09:20:35.819045Z",
  "last_location_at": "2026-10-28T09:20:35.819045Z",
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
  "session_id": "bf0a0972-fdb4-43a8-bfa6-ae2bed57aaa8",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMzYsImlhdCI6MTc5MzE3OTIzNiwianRpIjoiYTg3Y2UwNTMtNjgwMi00ZDUzLTk2YjItN2JhNDFkZjI1N2ZmIiwic2lkIjoiYmYwYTA5NzItZmRiNC00M2E4LWJmYTYtYWUyYmVkNTdhYWE4In0.VHIo5MPRTdkk9VsBxkG0NI63MdxG7P5NUCEyU-_rMqA",
  "access_expires_at": "2026-10-28T09:35:36.143559955Z",
  "refresh_token": "H6B1sjUWos6aNSO7zmB8t809LNqDKThMxghHwDt1JYI",
  "refresh_expires_at": "2026-10-28T21:20:36.142959215Z",
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
  "session_id": "dc2d10ec-59d4-4ee6-8d9a-2079f5bc2931",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxMzYsImlhdCI6MTc5MzE3OTIzNiwianRpIjoiYzY3NzU4M2EtZGQ2ZC00MmU4LWJjNWMtMDg1MzExYTllMzFmIiwic2lkIjoiZGMyZDEwZWMtNTlkNC00ZWU2LThkOWEtMjA3OWY1YmMyOTMxIn0.qR_OBInAkAR2wlQCyipzgQOH7X6mco0ZVt0VejEXu5A",
  "access_expires_at": "2026-10-28T09:35:36.462851346Z",
  "refresh_token": "ecyzFS1RUf0TJwiSoIkdNdGRqW8-ywd8PLSvgDOPQyg",
  "refresh_expires_at": "2026-10-28T21:20:36.462166482Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a5262b28-f474-42ff-aba1-066d5983b10f` → **200**

```json
{
  "id": "a5262b28-f474-42ff-aba1-066d5983b10f",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7c7c6c52-35cc-43c4-a6da-15ab09d23e53",
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
    "id": "53007ad1-a81a-42e6-9e75-1591b0c3e90a",
    "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "24b6293e-aa46-44cf-bd0c-f2d0cc18c7d6",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T09:20:35.39486Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a5262b28-f474-42ff-aba1-066d5983b10f/interrupt` → **200**

```json
{
  "command_id": "7310c236-674a-49cc-b168-e32b776d2ac6",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a5262b28-f474-42ff-aba1-066d5983b10f",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "7c7c6c52-35cc-43c4-a6da-15ab09d23e53",
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
      "id": "53007ad1-a81a-42e6-9e75-1591b0c3e90a",
      "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "24b6293e-aa46-44cf-bd0c-f2d0cc18c7d6",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T09:20:35.39486Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "7c7c6c52-35cc-43c4-a6da-15ab09d23e53",
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
    "id": "d4be060a-bb14-45d2-b368-531329f5acc4",
    "order_id": "b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b",
    "expires_at": "2026-10-28T09:20:51.54532Z",
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

`POST /api/driver/v1/offers/d4be060a-bb14-45d2-b368-531329f5acc4/accept` → **200**

```json
{
  "command_id": "98bd7961-be0c-4ce9-a167-dab444f9db3d"
}
```

```json
{
  "id": "99452e12-01d4-4ab3-81fb-f1c71f2563f2",
  "order_id": "b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9f80f25-c661-437a-95f2-64de4bf9ca9b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9f80f25-c661-437a-95f2-64de4bf9ca9b",
  "order_id": "b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b",
  "assignment_id": "99452e12-01d4-4ab3-81fb-f1c71f2563f2",
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
  "session_id": "d108556a-984b-4bed-9210-4debce873105",
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
  "last_heartbeat_at": "2026-10-28T09:20:35.819045Z",
  "last_location_at": "2026-10-28T09:20:35.819045Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/d108556a-984b-4bed-9210-4debce873105/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:36Z",
    "sequence": 1793179236683
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d108556a-984b-4bed-9210-4debce873105",
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
  "last_heartbeat_at": "2026-10-28T09:20:36.702089Z",
  "last_location_at": "2026-10-28T09:20:36.702089Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a9f80f25-c661-437a-95f2-64de4bf9ca9b/arrive` → **200**

```json
{
  "command_id": "d6025732-624c-40f0-aa49-2917a649a361",
  "expected_version": 0
}
```

```json
{
  "id": "a9f80f25-c661-437a-95f2-64de4bf9ca9b",
  "order_id": "b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b",
  "assignment_id": "99452e12-01d4-4ab3-81fb-f1c71f2563f2",
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
  "arrived_at": "2026-10-28T09:20:36.739651Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a9f80f25-c661-437a-95f2-64de4bf9ca9b/start` → **200**

```json
{
  "command_id": "45b466e1-247b-455c-85a2-c04bb93638ea",
  "expected_version": 1
}
```

```json
{
  "id": "a9f80f25-c661-437a-95f2-64de4bf9ca9b",
  "order_id": "b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b",
  "assignment_id": "99452e12-01d4-4ab3-81fb-f1c71f2563f2",
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
  "arrived_at": "2026-10-28T09:20:36.739651Z",
  "started_at": "2026-10-28T09:20:36.785489Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a9f80f25-c661-437a-95f2-64de4bf9ca9b/complete` → **200**

```json
{
  "command_id": "79263b2c-97c4-4c3d-a2c9-8133f273bb1a",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:20:36Z"
}
```

```json
{
  "id": "a9f80f25-c661-437a-95f2-64de4bf9ca9b",
  "order_id": "b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b",
  "assignment_id": "99452e12-01d4-4ab3-81fb-f1c71f2563f2",
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
  "arrived_at": "2026-10-28T09:20:36.739651Z",
  "started_at": "2026-10-28T09:20:36.785489Z",
  "completed_at": "2026-10-28T09:20:36.828679Z",
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
    "id": "b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:20:36.533906Z",
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
    "id": "a5262b28-f474-42ff-aba1-066d5983b10f",
    "short_number": 8,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:20:35.39486Z",
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
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
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

`GET /api/operator/v1/orders/a5262b28-f474-42ff-aba1-066d5983b10f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:20:35.395373Z",
      "actor": {
        "type": "CLIENT",
        "id": "7c7c6c52-35cc-43c4-a6da-15ab09d23e53",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
        "quote_id": "e12551e8-79ef-4894-aafd-9323fe67778e",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "aabf4084-5e49-4803-aebf-90bc5a5d023e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:20:35.397519Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
        "attempt_id": "c500a114-258e-4b41-99ed-a87152805937",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "aabf4084-5e49-4803-aebf-90bc5a5d023e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:20:35.401675Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2943a9a5-2a38-40c9-ab7d-7dae29e284cd",
        "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "aabf4084-5e49-4803-aebf-90bc5a5d023e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:20:35.46319Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2943a9a5-2a38-40c9-ab7d-7dae29e284cd",
        "order_id": "a5262b28-f474-42ff-aba1-066d5983b10f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "53007ad1-a81a-42e6-9e75-1591b0c3e90a"
      },
      "correlation_id": "e81f8f2e-d400-4831-87dc-d2d398aa342b"
```

Done: interrupted a5262b28-f474-42ff-aba1-066d5983b10f, follow-up b7f4b0e2-a53f-4039-a6be-9d7c1a5f0b2b.

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
  "session_id": "6b4f0a1c-6853-44d5-bed7-f476b0b5aa00",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNDAsImlhdCI6MTc5MzE3OTI0MCwianRpIjoiZjViMTAxZDEtNDY2Zi00NGY5LWEwM2EtNGQ2YmFmMjNmYjQ0Iiwic2lkIjoiNmI0ZjBhMWMtNjg1My00NGQ1LWJlZDctZjQ3NmIwYjVhYTAwIn0.F-3m-E1rPQnN-Ut7eXU_shurv1GNiZ5UKB__IMMu4i0",
  "access_expires_at": "2026-10-28T09:35:40.256384484Z",
  "refresh_token": "nJrXEJRUSRQuZ6s02W4ZSQdn3Fuw3mWMNwLJU5U656g",
  "refresh_expires_at": "2026-10-28T21:20:40.255854015Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ef122e14-9a0e-45c9-9128-adee54ec12e6",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:20:40Z"
}
```

```json
{
  "id": "c2a4d50e-0c1e-44ff-8a84-f49af8c0455f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:20:40Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c2a4d50e-0c1e-44ff-8a84-f49af8c0455f/publish` → **200**

```json
{
  "command_id": "a29bfc2e-03ee-4179-89dc-3c05c8c06cb7",
  "expected_version": 0
}
```

```json
{
  "id": "c2a4d50e-0c1e-44ff-8a84-f49af8c0455f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:20:40.348777Z",
  "published_at": "2026-10-28T09:20:40.348777Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "c2a4d50e-0c1e-44ff-8a84-f49af8c0455f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T09:20:40.348777Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633926648",
  "device_ref": "sandbox-760"
}
```

```json
{
  "challenge_id": "980077f1-aeab-4464-828f-856cd1932390",
  "expires_at": "2026-10-28T09:25:40.408998987Z",
  "resend_available_at": "2026-10-28T09:20:41.408998987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633926648` → **200**

```json
{
  "phone": "+380633926648",
  "audience": "CLIENT",
  "code": "355215",
  "sent_at": "2026-10-28T09:20:40.411232203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "980077f1-aeab-4464-828f-856cd1932390",
  "code": "355215",
  "device_ref": "sandbox-760"
}
```

```json
{
  "session_id": "9d90fbf9-6933-469c-9cd1-b3877381e5b5",
  "subject": {
    "type": "CLIENT",
    "id": "5e72848c-60db-4383-8a78-aeeee6ab377b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTcyODQ4Yy02MGRiLTQzODMtOGE3OC1hZWVlZTZhYjM3N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTQwLCJpYXQiOjE3OTMxNzkyNDAsImp0aSI6IjEwZWUxZjQ0LWI0MTEtNDRmNi05MjM4LTJhYjQ5OWE4YTI4NyIsInNpZCI6IjlkOTBmYmY5LTY5MzMtNDY5Yy05Y2QxLWIzODc3MzgxZTViNSJ9.FFDZKxYqhiBvE0hbdn9c4_7KpiKJoe_pSPZoHo5bN9o",
  "access_expires_at": "2026-10-28T09:35:40.467659141Z",
  "refresh_token": "sDsX81aMqcdVptnjaQeSR_lYeTq0yFXMru0ZpsolFWE",
  "refresh_expires_at": "2026-11-27T09:20:40.467131558Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "c2a4d50e-0c1e-44ff-8a84-f49af8c0455f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T09:20:40.348777Z",
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
  "command_id": "98fd3424-9000-4489-91a5-702806d13473",
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
  "id": "dde6c710-c722-47ae-930c-ac4611d301c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:40.527546Z",
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
  "command_id": "103ef7e2-b732-48cb-8807-36ff411bb9d0",
  "quote_id": "dde6c710-c722-47ae-930c-ac4611d301c2",
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
  "correlation_id": "eef5f955-63cf-45d2-ba1a-4d6d2d5cda1f"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0d486a85-fc02-43bf-b40a-84029b247dee",
  "version_id": "c2a4d50e-0c1e-44ff-8a84-f49af8c0455f",
  "language": "uk"
}
```

```json
{
  "version_id": "c2a4d50e-0c1e-44ff-8a84-f49af8c0455f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T09:20:40.602216Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3da32ff8-8375-4b10-8edd-25067c64c759",
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
  "id": "ad269858-87b9-4c92-b6ed-f8e2a24ba560",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:40.642053Z",
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
  "command_id": "8f6e1fdb-35ad-4dd0-ac93-d9b78d2d025f",
  "quote_id": "ad269858-87b9-4c92-b6ed-f8e2a24ba560",
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
  "id": "88c27c5b-f60f-45c6-a6cf-ea136112508c",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5e72848c-60db-4383-8a78-aeeee6ab377b",
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
  "created_at": "2026-10-28T09:20:40.679432Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/88c27c5b-f60f-45c6-a6cf-ea136112508c` → **200**

```json
{
  "id": "88c27c5b-f60f-45c6-a6cf-ea136112508c",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5e72848c-60db-4383-8a78-aeeee6ab377b",
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
  "created_at": "2026-10-28T09:20:40.679432Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/88c27c5b-f60f-45c6-a6cf-ea136112508c/cancel` → **200**

```json
{
  "command_id": "3d5f2887-8944-4f78-a308-59b924337702",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "88c27c5b-f60f-45c6-a6cf-ea136112508c",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5e72848c-60db-4383-8a78-aeeee6ab377b",
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
  "created_at": "2026-10-28T09:20:40.679432Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
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

`POST /api/admin/v1/legal-documents/c2a4d50e-0c1e-44ff-8a84-f49af8c0455f` → **409**

```json
{
  "command_id": "93a78f64-14f5-450e-974d-981dd7b9346d",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:20:40Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/c2a4d50e-0c1e-44ff-8a84-f49af8c0455f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "db2d2c87-a368-4454-a22c-967dd4196297"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c372737d-dca5-4c78-94d4-4c7dfb17c942",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:20:40Z"
}
```

```json
{
  "id": "8f330079-41f5-407b-8852-1e8a57c3f5ae",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:20:40Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/8f330079-41f5-407b-8852-1e8a57c3f5ae/publish` → **200**

```json
{
  "command_id": "82f9d10a-ffae-437c-bac5-88a801888892",
  "expected_version": 0
}
```

```json
{
  "id": "8f330079-41f5-407b-8852-1e8a57c3f5ae",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:20:40.88747Z",
  "published_at": "2026-10-28T09:20:40.88747Z",
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
  "device_ref": "sandbox-21850"
}
```

```json
{
  "challenge_id": "2e718c99-6028-4737-8ff1-ee4387a910ed",
  "expires_at": "2026-10-28T09:25:40.924803611Z",
  "resend_available_at": "2026-10-28T09:20:41.924803611Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "705906",
  "sent_at": "2026-10-28T09:20:40.927048368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e718c99-6028-4737-8ff1-ee4387a910ed",
  "code": "705906",
  "device_ref": "sandbox-21850"
}
```

```json
{
  "session_id": "ddefc387-504d-4b85-b451-ed0e2c7e789b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDE0MCwiaWF0IjoxNzkzMTc5MjQwLCJqdGkiOiJjODZkYzQ4MC1mZDY1LTQzN2ItYTY2ZS00Y2E0MDc4NDAzYWMiLCJzaWQiOiJkZGVmYzM4Ny01MDRkLTRiODUtYjQ1MS1lZDBlMmM3ZTc4OWIifQ.0vt1qetsCgDFbPx_ABbpsiXf4HDSNQUUggcaw89rHGA",
  "access_expires_at": "2026-10-28T09:35:40.982431541Z",
  "refresh_token": "JamGAmSJ0EMz-MUQDdrrrY_m5UVFZ4p-n6Nfv5gblEY",
  "refresh_expires_at": "2026-11-27T09:20:40.981875666Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d108556a-984b-4bed-9210-4debce873105",
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
  "last_heartbeat_at": "2026-10-28T09:20:36.702089Z",
  "last_location_at": "2026-10-28T09:20:36.702089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d108556a-984b-4bed-9210-4debce873105/handover` → **200**

```json
{
  "command_id": "35a51e23-0ab0-4974-bf80-935780b48225",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d108556a-984b-4bed-9210-4debce873105",
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
  "last_heartbeat_at": "2026-10-28T09:20:36.702089Z",
  "last_location_at": "2026-10-28T09:20:36.702089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d108556a-984b-4bed-9210-4debce873105/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:41Z",
    "sequence": 1793179241675
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d108556a-984b-4bed-9210-4debce873105",
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
  "last_heartbeat_at": "2026-10-28T09:20:41.08593Z",
  "last_location_at": "2026-10-28T09:20:41.08593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673151602",
  "device_ref": "sandbox-6538"
}
```

```json
{
  "challenge_id": "7848a7f5-27a1-4cbb-8d44-12a45ed73477",
  "expires_at": "2026-10-28T09:25:41.113837672Z",
  "resend_available_at": "2026-10-28T09:20:42.113837672Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673151602` → **200**

```json
{
  "phone": "+380673151602",
  "audience": "CLIENT",
  "code": "275439",
  "sent_at": "2026-10-28T09:20:41.116061468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7848a7f5-27a1-4cbb-8d44-12a45ed73477",
  "code": "275439",
  "device_ref": "sandbox-6538"
}
```

```json
{
  "session_id": "cedcee87-1e17-404a-bab2-b4b4237b743c",
  "subject": {
    "type": "CLIENT",
    "id": "7efba2ad-08d7-4453-b457-cdf04daff471"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZWZiYTJhZC0wOGQ3LTQ0NTMtYjQ1Ny1jZGYwNGRhZmY0NzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTQxLCJpYXQiOjE3OTMxNzkyNDEsImp0aSI6IjY4YjFjZmUzLWMyZWItNGNhOC1iMWJkLWE4M2NmMzVmNmZiMyIsInNpZCI6ImNlZGNlZTg3LTFlMTctNDA0YS1iYWIyLWI0YjQyMzdiNzQzYyJ9.bR8T4iJlpWLTHupPG9-E2-2drf2WKGfBjkWSrb4f_e0",
  "access_expires_at": "2026-10-28T09:35:41.171824594Z",
  "refresh_token": "vVgzN1YWFkWFKVDfvV7vG884C_kmhOtSHQR4tPeOR5Y",
  "refresh_expires_at": "2026-11-27T09:20:41.171268416Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a10b5197-c9b1-456a-966f-4bad118b397a",
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
  "id": "8fdbd844-4e47-4547-8dc4-874040246262",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:41.208350Z",
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
  "command_id": "2077aadb-878f-4052-8b48-6df661be4bba",
  "quote_id": "8fdbd844-4e47-4547-8dc4-874040246262",
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
    "phone": "+380677663724"
  }
}
```

```json
{
  "id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
  "created_at": "2026-10-28T09:20:41.248348Z",
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
    "id": "e11a9e49-f639-4343-83a2-26a966a1aa4e",
    "order_id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
    "expires_at": "2026-10-28T09:20:56.251554Z",
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

`POST /api/driver/v1/offers/e11a9e49-f639-4343-83a2-26a966a1aa4e/accept` → **200**

```json
{
  "command_id": "3ffb639b-9d80-4f29-9eda-311dd3515c75"
}
```

```json
{
  "id": "dd3e5125-ceea-4e78-aeed-89f52d97c685",
  "order_id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b6577cb7-a088-4ad3-81ab-ef18dc80004f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b6577cb7-a088-4ad3-81ab-ef18dc80004f",
  "order_id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
  "assignment_id": "dd3e5125-ceea-4e78-aeed-89f52d97c685",
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
    "phone": "+380677663724"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c017a1df-875d-4ffb-b782-dcad93e7cec8",
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
  "id": "cdc409b3-df20-4273-bc10-6b003cf271c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:41.392681Z",
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
  "command_id": "8ff7944c-8952-4b2f-9600-e4f27c7b33c6",
  "quote_id": "cdc409b3-df20-4273-bc10-6b003cf271c3",
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
  "id": "880b6625-f9f9-417b-bb28-fa249e943943",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
  "created_at": "2026-10-28T09:20:41.430473Z",
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
  "command_id": "28e696be-acba-4551-9e23-f84463a4bd62",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T12:20:41Z"
}
```

```json
{
  "id": "34d872af-f4c4-430e-8ed3-3a5c35e0c21a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:41.478570Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:20:41Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bca5217f-300a-4ee5-8830-cb3c6c9746cd",
  "quote_id": "34d872af-f4c4-430e-8ed3-3a5c35e0c21a",
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
  "pickup_at": "2026-10-28T12:20:41Z"
}
```

```json
{
  "id": "49c6f076-e779-4c7f-a845-a9d5be721905",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
  "created_at": "2026-10-28T09:20:41.521813Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:20:41Z",
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
  "command_id": "ae271765-3ee7-4d1d-b19b-76d2c224d6c5",
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
  "id": "f20c628f-7ca3-460a-8ea8-ac10577f4e5f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:41.565946Z",
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
  "command_id": "a1378852-39dc-4eac-8e4b-c1463d4b62f0",
  "quote_id": "f20c628f-7ca3-460a-8ea8-ac10577f4e5f",
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
  "correlation_id": "bc1bb88a-6dd7-4331-a191-4baeb55b5e4a"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "49c6f076-e779-4c7f-a845-a9d5be721905",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
      "created_at": "2026-10-28T09:20:41.521813Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T12:20:41Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "880b6625-f9f9-417b-bb28-fa249e943943",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
      "created_at": "2026-10-28T09:20:41.430473Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "880b6625-f9f9-417b-bb28-fa249e943943",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
  "created_at": "2026-10-28T09:20:41.430473Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/d52c262a-262f-4a1a-93b8-01f3d4ec5274` → **200**

```json
{
  "id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
    "id": "dd3e5125-ceea-4e78-aeed-89f52d97c685",
    "order_id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b6577cb7-a088-4ad3-81ab-ef18dc80004f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:20:41.248348Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d52c262a-262f-4a1a-93b8-01f3d4ec5274/cancel` → **200**

```json
{
  "command_id": "b38df9eb-209b-4aee-ad6d-11bbd05f3111",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
    "id": "dd3e5125-ceea-4e78-aeed-89f52d97c685",
    "order_id": "d52c262a-262f-4a1a-93b8-01f3d4ec5274",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b6577cb7-a088-4ad3-81ab-ef18dc80004f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:20:41.248348Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/880b6625-f9f9-417b-bb28-fa249e943943` → **200**

```json
{
  "id": "880b6625-f9f9-417b-bb28-fa249e943943",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
  "created_at": "2026-10-28T09:20:41.430473Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/880b6625-f9f9-417b-bb28-fa249e943943/cancel` → **200**

```json
{
  "command_id": "16d5c59a-89a1-4d03-94aa-17aaf1a53ad2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "880b6625-f9f9-417b-bb28-fa249e943943",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
  "created_at": "2026-10-28T09:20:41.430473Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/49c6f076-e779-4c7f-a845-a9d5be721905` → **200**

```json
{
  "id": "49c6f076-e779-4c7f-a845-a9d5be721905",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
  "created_at": "2026-10-28T09:20:41.521813Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:20:41Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/49c6f076-e779-4c7f-a845-a9d5be721905/cancel` → **200**

```json
{
  "command_id": "305ed407-741f-4f0b-9ed3-5d1836f5a0ac",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "49c6f076-e779-4c7f-a845-a9d5be721905",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "7efba2ad-08d7-4453-b457-cdf04daff471",
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
  "created_at": "2026-10-28T09:20:41.521813Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-28T12:20:41Z",
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
  "session_id": "d108556a-984b-4bed-9210-4debce873105",
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
  "last_heartbeat_at": "2026-10-28T09:20:41.08593Z",
  "last_location_at": "2026-10-28T09:20:41.08593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d108556a-984b-4bed-9210-4debce873105/close` → **200**

```json
{
  "command_id": "af9c4249-3579-452b-93e1-b76ceea150a2",
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

Done: orders d52c262a-262f-4a1a-93b8-01f3d4ec5274, 880b6625-f9f9-417b-bb28-fa249e943943, 49c6f076-e779-4c7f-a845-a9d5be721905.

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
  "session_id": "c1a70402-565c-410b-ace0-1c627fb7a0c3",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNDIsImlhdCI6MTc5MzE3OTI0MiwianRpIjoiODQzMGI1MmQtYzRkYy00MDU2LTk2NjEtNGYzMGJiMDlmNGQ3Iiwic2lkIjoiYzFhNzA0MDItNTY1Yy00MTBiLWFjZTAtMWM2MjdmYjdhMGMzIn0.qpIUWQL00pCe85xaisjp0f0qNd_CGwyjYPs0PgRt4r0",
  "access_expires_at": "2026-10-28T09:35:42.24169237Z",
  "refresh_token": "TB9tVyd82PSX7-04TnES0KTOHhcaKVcw5nCT9osNfgw",
  "refresh_expires_at": "2026-10-28T21:20:42.241164194Z",
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
  "session_id": "75d1b512-b11a-40fc-bb8e-67b0e4eedb92",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNDIsImlhdCI6MTc5MzE3OTI0MiwianRpIjoiZjFhZWMxYzktNzM0ZS00YjBkLTk1ZDMtMTA2N2YzNTRiNDVhIiwic2lkIjoiNzVkMWI1MTItYjExYS00MGZjLWJiOGUtNjdiMGU0ZWVkYjkyIn0.EvwITobbkisvfBLaQtX4uOB2FnzMueaLIvnmKqQFOOI",
  "access_expires_at": "2026-10-28T09:35:42.563657211Z",
  "refresh_token": "ICZOYy0c7M9YUnx4LtkOLMgZ_lds818saVDbM2Wu1e4",
  "refresh_expires_at": "2026-10-28T21:20:42.563147209Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18400"
}
```

```json
{
  "challenge_id": "0396f534-33c1-4179-b0f0-a85d313550ad",
  "expires_at": "2026-10-28T09:25:42.587197905Z",
  "resend_available_at": "2026-10-28T09:20:43.587197905Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "735363",
  "sent_at": "2026-10-28T09:20:42.589644779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0396f534-33c1-4179-b0f0-a85d313550ad",
  "code": "735363",
  "device_ref": "sandbox-18400"
}
```

```json
{
  "session_id": "e5366663-8893-4967-ab4f-2d87da4c6d5b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDE0MiwiaWF0IjoxNzkzMTc5MjQyLCJqdGkiOiI5YTJmOTQ0OC0zOWNjLTQ1ODYtOWE4Ny1iY2ExZWQwZDkzYmUiLCJzaWQiOiJlNTM2NjY2My04ODkzLTQ5NjctYWI0Zi0yZDg3ZGE0YzZkNWIifQ.JWB4Zq0XooSpZ5BNWavLmXPqzXQosYKKUSuMjZJ8TD4",
  "access_expires_at": "2026-10-28T09:35:42.644365146Z",
  "refresh_token": "d4jCNth7P-7DN_AyIoE9ByCvpwHdfnZNlrk0ik53aRM",
  "refresh_expires_at": "2026-11-27T09:20:42.643820189Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:35.646345Z",
  "last_location_at": "2026-10-28T09:20:35.646345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/handover` → **200**

```json
{
  "command_id": "4a52ec7c-3b52-438c-ae8e-e8dc7158990a",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:35.646345Z",
  "last_location_at": "2026-10-28T09:20:35.646345Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:42Z",
    "sequence": 1793179242731
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:42.75064Z",
  "last_location_at": "2026-10-28T09:20:42.75064Z",
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
  "command_id": "d42e575e-ddae-4ea4-8516-d13013131e47",
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
  "effective_at": "2026-10-28T09:20:42.82042Z",
  "changed_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T09:20:42.851474729Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "32de6786-38e4-44fa-8f4e-18249d2f0eb8",
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
  "id": "49305b47-8355-4440-babb-b6cdc1942a47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:42.889571Z",
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
  "command_id": "3d667098-9f50-4db8-b707-4e9f2464eed7",
  "quote_id": "49305b47-8355-4440-babb-b6cdc1942a47",
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
    "phone": "+3806711115677"
  }
}
```

```json
{
  "id": "a19e72a8-23c3-408d-9cc9-5beb1538d1f9",
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
  "created_at": "2026-10-28T09:20:42.928519Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115677"
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
    "id": "f544dfac-3a11-47e6-9fbd-e3dd7f181d0a",
    "order_id": "a19e72a8-23c3-408d-9cc9-5beb1538d1f9",
    "expires_at": "2026-10-28T09:20:57.932325Z",
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

`POST /api/driver/v1/offers/f544dfac-3a11-47e6-9fbd-e3dd7f181d0a/accept` → **200**

```json
{
  "command_id": "fb652d75-4855-441a-9d1f-161b10ee5264"
}
```

```json
{
  "id": "2f219cdc-7a97-41eb-897c-6fe2b5612816",
  "order_id": "a19e72a8-23c3-408d-9cc9-5beb1538d1f9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "50bf53cc-5066-44c4-9005-5babd7666dd3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "50bf53cc-5066-44c4-9005-5babd7666dd3",
  "order_id": "a19e72a8-23c3-408d-9cc9-5beb1538d1f9",
  "assignment_id": "2f219cdc-7a97-41eb-897c-6fe2b5612816",
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
    "phone": "+3806711115677"
  }
}
```

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:43Z",
    "sequence": 1793179243354
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:43.05409Z",
  "last_location_at": "2026-10-28T09:20:43.05409Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/50bf53cc-5066-44c4-9005-5babd7666dd3/arrive` → **200**

```json
{
  "command_id": "1bf79efa-70fa-4dc1-9403-51d913f5a7b7",
  "expected_version": 0
}
```

```json
{
  "id": "50bf53cc-5066-44c4-9005-5babd7666dd3",
  "order_id": "a19e72a8-23c3-408d-9cc9-5beb1538d1f9",
  "assignment_id": "2f219cdc-7a97-41eb-897c-6fe2b5612816",
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
  "arrived_at": "2026-10-28T09:20:43.089943Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115677"
  }
}
```

`POST /api/driver/v1/trips/50bf53cc-5066-44c4-9005-5babd7666dd3/start` → **200**

```json
{
  "command_id": "5b3ba64c-cd5a-4fe4-bce8-2b345ded44d3",
  "expected_version": 1
}
```

```json
{
  "id": "50bf53cc-5066-44c4-9005-5babd7666dd3",
  "order_id": "a19e72a8-23c3-408d-9cc9-5beb1538d1f9",
  "assignment_id": "2f219cdc-7a97-41eb-897c-6fe2b5612816",
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
  "arrived_at": "2026-10-28T09:20:43.089943Z",
  "started_at": "2026-10-28T09:20:43.129307Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115677"
  }
}
```

`POST /api/driver/v1/trips/50bf53cc-5066-44c4-9005-5babd7666dd3/complete` → **200**

```json
{
  "command_id": "7c3e1265-38dc-4195-83a3-e8b07671d8f2",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:20:43Z",
  "cash_received": true
}
```

```json
{
  "id": "50bf53cc-5066-44c4-9005-5babd7666dd3",
  "order_id": "a19e72a8-23c3-408d-9cc9-5beb1538d1f9",
  "assignment_id": "2f219cdc-7a97-41eb-897c-6fe2b5612816",
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
  "arrived_at": "2026-10-28T09:20:43.089943Z",
  "started_at": "2026-10-28T09:20:43.129307Z",
  "completed_at": "2026-10-28T09:20:43.173348Z",
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
  "command_id": "1f8c4cea-29ac-40c9-a1f9-d5d3830150c4",
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
  "id": "c650396a-147f-4807-b670-b39714b5193b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:43.216894Z",
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
  "command_id": "d1cb8f6b-b85b-477b-9af2-c824397e689e",
  "quote_id": "c650396a-147f-4807-b670-b39714b5193b",
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
    "phone": "+3806711132084"
  }
}
```

```json
{
  "id": "d820f0e1-fa55-4f14-b173-014e650c766a",
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
  "created_at": "2026-10-28T09:20:43.258581Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132084"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d820f0e1-fa55-4f14-b173-014e650c766a` → **200**

```json
{
  "id": "d820f0e1-fa55-4f14-b173-014e650c766a",
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
  "created_at": "2026-10-28T09:20:43.258581Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132084"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d820f0e1-fa55-4f14-b173-014e650c766a/cancel` → **200**

```json
{
  "command_id": "54ccf4c2-91cb-4e02-8d91-25b6770abb84",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d820f0e1-fa55-4f14-b173-014e650c766a",
  "short_number": 15,
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
  "created_at": "2026-10-28T09:20:43.258581Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132084"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "en": "Operator error",
      "uk": "Помилка оператора",
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
  "staff_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T09:20:43.329168Z",
  "last_entries": [
    {
      "order_id": "d820f0e1-fa55-4f14-b173-014e650c766a",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T09:20:43.329168Z"
    },
    {
      "order_id": "a19e72a8-23c3-408d-9cc9-5beb1538d1f9",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T09:20:43.178637Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12c17a7d-aebc-49e9-8005-53c855557133",
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
  "last_heartbeat_at": "2026-10-28T09:20:43.05409Z",
  "last_location_at": "2026-10-28T09:20:43.05409Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12c17a7d-aebc-49e9-8005-53c855557133/close` → **200**

```json
{
  "command_id": "7759ca1d-e58e-4ed5-a573-f14de74b5c30",
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

Done: operator bonus for fulfilled a19e72a8-23c3-408d-9cc9-5beb1538d1f9 and operator-fault cancellation d820f0e1-fa55-4f14-b173-014e650c766a.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670737079",
  "device_ref": "sandbox-20751"
}
```

```json
{
  "challenge_id": "ce3de163-0823-45b6-9641-cd06643139fd",
  "expires_at": "2026-10-28T09:25:45.484302467Z",
  "resend_available_at": "2026-10-28T09:20:46.484302467Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670737079` → **200**

```json
{
  "phone": "+380670737079",
  "audience": "CLIENT",
  "code": "572372",
  "sent_at": "2026-10-28T09:20:45.48661969Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678644418",
  "device_ref": "sandbox-4780",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b3809414-fd2c-4157-8269-8842896d7c41",
  "expires_at": "2026-10-28T09:25:45.539238062Z",
  "resend_available_at": "2026-10-28T09:20:46.539238062Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678644418` → **200**

```json
{
  "phone": "+380678644418",
  "audience": "CLIENT",
  "code": "362453",
  "sent_at": "2026-10-28T09:20:45.541525353Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677150000",
  "device_ref": "sandbox-23033"
}
```

```json
{
  "challenge_id": "eecab5c8-aee3-4e97-bdb6-cd6cfb621604",
  "expires_at": "2026-10-28T09:25:45.593329074Z",
  "resend_available_at": "2026-10-28T09:20:46.593329074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677150000` → **200**

```json
{
  "phone": "+380677150000",
  "audience": "CLIENT",
  "code": "947613",
  "sent_at": "2026-10-28T09:20:45.596147801Z",
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
  "session_id": "aac46c9b-9374-4be7-9674-0435a5bf3d99",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNDUsImlhdCI6MTc5MzE3OTI0NSwianRpIjoiYTk3OWY0YWEtNGJiYy00ZGNlLWEwZDQtMTMzYjc4MDExNjNjIiwic2lkIjoiYWFjNDZjOWItOTM3NC00YmU3LTk2NzQtMDQzNWE1YmYzZDk5In0.ezf63hDXpoZfkuSv7U33WHYpp8iXGJGTVTLV466aXYQ",
  "access_expires_at": "2026-10-28T09:35:45.939371223Z",
  "refresh_token": "Xs_tpZa7_UNmOykKiKZLlHJVV6cM0U0V79JBwRuzBUQ",
  "refresh_expires_at": "2026-10-28T21:20:45.938881139Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677150000` → **200**

```json
{
  "deliveries": [
    {
      "id": "52c13a2a-c770-4a3e-9f94-ea6eb2315d8e",
      "challenge_id": "eecab5c8-aee3-4e97-bdb6-cd6cfb621604",
      "phone": "+380677150000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-66c306f6-c893-478e-801a-a5e37c031e5b",
      "error": null,
      "attempted_at": "2026-10-28T09:20:45.596416Z"
    },
    {
      "id": "ec20dfb1-905f-4071-8ffa-952b0c1d30a5",
      "challenge_id": "eecab5c8-aee3-4e97-bdb6-cd6cfb621604",
      "phone": "+380677150000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T09:20:45.595511Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677150000` → **200**

```json
{
  "phone": "+380677150000",
  "audience": "CLIENT",
  "code": "947613",
  "sent_at": "2026-10-28T09:20:45.596147801Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678644418` → **200**

```json
{
  "deliveries": [
    {
      "id": "f984b775-4944-4a6e-84ce-4f292f4edb99",
      "challenge_id": "b3809414-fd2c-4157-8269-8842896d7c41",
      "phone": "+380678644418",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2e1fe955-8538-498b-ad45-b4c7e8dd1cbf",
      "error": null,
      "attempted_at": "2026-10-28T09:20:45.541775Z"
    }
  ]
}
```

Done: SMS to +380670737079, a call to +380678644418, SMS then a call to +380677150000.

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
  "session_id": "849fccc5-d842-483b-8c08-8fe1315f50af",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNDYsImlhdCI6MTc5MzE3OTI0NiwianRpIjoiNTNkYzZkNmQtNjczMC00MTk4LWIxNzAtZjY1OGQ4ZjFkY2FiIiwic2lkIjoiODQ5ZmNjYzUtZDg0Mi00ODNiLThjMDgtOGZlMTMxNWY1MGFmIn0.z0JZGs4Vll3bO1Sn0Zj96otK3a7PQ-S7lt7XRMJAL4g",
  "access_expires_at": "2026-10-28T09:35:46.358654919Z",
  "refresh_token": "yFbHibPmA8SEiD1OzoVb-veft3hPQ6zAx74J7TFdNdw",
  "refresh_expires_at": "2026-10-28T21:20:46.358091626Z",
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
  "session_id": "19d3b74c-3362-447d-905f-6e98b04d2cf4",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNDYsImlhdCI6MTc5MzE3OTI0NiwianRpIjoiMDk4OWMxNmEtMzA4NS00MThiLWJkOGEtYTdlMWQ5NmI5MDFiIiwic2lkIjoiMTlkM2I3NGMtMzM2Mi00NDdkLTkwNWYtNmU5OGIwNGQyY2Y0In0.OTOCFujdzMGDlE8Wo9DlYBmLtHxOjnu_qoqIMEVLVLo",
  "access_expires_at": "2026-10-28T09:35:46.676474398Z",
  "refresh_token": "2tTaLN04bvNhrMrE4RFWQr67TWj4o-FZUZOkTNdQokQ",
  "refresh_expires_at": "2026-10-28T21:20:46.675920216Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
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

`POST /api/admin/v1/staff-extensions/ce308942-008b-4303-ba6d-11fe07cde8e7` → **200**

```json
{
  "command_id": "f2b92352-10b3-42db-9aab-de7de8add0ae",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "62c1ce66-9a4e-4952-bc2a-bf0a358aa524",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:20:46.809795Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:20:46.809795Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "16b83e41-0ae9-4c46-8cb9-349974b6e5fe",
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
  "id": "d8e74d90-70c6-4aea-98ba-ac712a282c7c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:46.877822Z",
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
  "command_id": "d031a9bc-78cd-44d8-b76b-c4c51bf92ca9",
  "quote_id": "d8e74d90-70c6-4aea-98ba-ac712a282c7c",
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
    "phone": "+380674345032"
  }
}
```

```json
{
  "id": "4458d195-2066-4df9-8503-d91a6e2561d0",
  "short_number": 16,
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
  "created_at": "2026-10-28T09:20:46.916109Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674345032"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/4458d195-2066-4df9-8503-d91a6e2561d0/calls` → **201**

```json
{
  "command_id": "e17dbd45-d9c0-4072-8b3e-2bc9d687bb23",
  "to": "CALLER"
}
```

```json
{
  "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "order_ids": [
    "4458d195-2066-4df9-8503-d91a6e2561d0"
  ],
  "started_at": "2026-10-28T09:20:46.969403Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/4458d195-2066-4df9-8503-d91a6e2561d0/calls` → **201**

```json
{
  "command_id": "e17dbd45-d9c0-4072-8b3e-2bc9d687bb23",
  "to": "CALLER"
}
```

```json
{
  "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "order_ids": [
    "4458d195-2066-4df9-8503-d91a6e2561d0"
  ],
  "started_at": "2026-10-28T09:20:46.969403Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674345032",
    "at": "2026-10-28T09:20:46.971382072Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.18848",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "eb559f34-7481-4a5a-8af5-51f1f3b03292"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=4458d195-2066-4df9-8503-d91a6e2561d0` → **200**

```json
{
  "calls": [
    {
      "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [
        "4458d195-2066-4df9-8503-d91a6e2561d0"
      ],
      "started_at": "2026-10-28T09:20:46.969403Z",
      "answered_at": "2026-10-28T09:20:47.123309Z",
      "ended_at": "2026-10-28T09:20:47.144135Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4458d195-2066-4df9-8503-d91a6e2561d0` → **200**

```json
{
  "calls": [
    {
      "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [
        "4458d195-2066-4df9-8503-d91a6e2561d0"
      ],
      "started_at": "2026-10-28T09:20:46.969403Z",
      "answered_at": "2026-10-28T09:20:47.123309Z",
      "ended_at": "2026-10-28T09:20:47.144135Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4458d195-2066-4df9-8503-d91a6e2561d0` → **200**

```json
{
  "calls": [
    {
      "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [
        "4458d195-2066-4df9-8503-d91a6e2561d0"
      ],
      "started_at": "2026-10-28T09:20:46.969403Z",
      "answered_at": "2026-10-28T09:20:47.123309Z",
      "ended_at": "2026-10-28T09:20:47.144135Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4458d195-2066-4df9-8503-d91a6e2561d0` → **200**

```json
{
  "calls": [
    {
      "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [
        "4458d195-2066-4df9-8503-d91a6e2561d0"
      ],
      "started_at": "2026-10-28T09:20:46.969403Z",
      "answered_at": "2026-10-28T09:20:47.123309Z",
      "ended_at": "2026-10-28T09:20:47.144135Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4458d195-2066-4df9-8503-d91a6e2561d0` → **200**

```json
{
  "calls": [
    {
      "id": "eb559f34-7481-4a5a-8af5-51f1f3b03292",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "order_ids": [
        "4458d195-2066-4df9-8503-d91a6e2561d0"
      ],
      "started_at": "2026-10-28T09:20:46.969403Z",
      "answered_at": "2026-10-28T09:20:47.123309Z",
      "ended_at": "2026-10-28T09:20:47.144135Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:20:55.128001Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/4458d195-2066-4df9-8503-d91a6e2561d0` → **200**

```json
{
  "id": "4458d195-2066-4df9-8503-d91a6e2561d0",
  "short_number": 16,
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
  "created_at": "2026-10-28T09:20:46.916109Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674345032"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4458d195-2066-4df9-8503-d91a6e2561d0/cancel` → **200**

```json
{
  "command_id": "616a2d00-d069-4f4f-9c43-0655ef0a6b46",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4458d195-2066-4df9-8503-d91a6e2561d0",
  "short_number": 16,
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
  "created_at": "2026-10-28T09:20:46.916109Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674345032"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut"
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
  "command_id": "3ad101d7-2116-438d-8952-3ddcb7361ef3",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T09:20:55.41101Z",
  "extension": "101"
}
```

Done: outgoing call eb559f34-7481-4a5a-8af5-51f1f3b03292 from order 4458d195-2066-4df9-8503-d91a6e2561d0, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639229261",
  "device_ref": "sandbox-31534"
}
```

```json
{
  "challenge_id": "dc52b480-870c-4f94-84df-bfe572f7b409",
  "expires_at": "2026-10-28T09:25:55.452126829Z",
  "resend_available_at": "2026-10-28T09:20:56.452126829Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639229261` → **200**

```json
{
  "phone": "+380639229261",
  "audience": "CLIENT",
  "code": "956090",
  "sent_at": "2026-10-28T09:20:55.454327084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc52b480-870c-4f94-84df-bfe572f7b409",
  "code": "956090",
  "device_ref": "sandbox-31534"
}
```

```json
{
  "session_id": "575167dd-b4a9-47e7-9751-7b0c2fcbd833",
  "subject": {
    "type": "CLIENT",
    "id": "4e21ff4c-f98b-4ccf-8d5b-54f5672c69b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTIxZmY0Yy1mOThiLTRjY2YtOGQ1Yi01NGY1NjcyYzY5YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTU1LCJpYXQiOjE3OTMxNzkyNTUsImp0aSI6IjY2MDg3OTMxLWU2NmEtNGQ2Yy04ODBjLTk0OGVmNWI3MGQ0NCIsInNpZCI6IjU3NTE2N2RkLWI0YTktNDdlNy05NzUxLTdiMGMyZmNiZDgzMyJ9.1hXw1V430AFpSXGtAsMySrEbmQ7IZrVqjET3uYAWjvY",
  "access_expires_at": "2026-10-28T09:35:55.509353717Z",
  "refresh_token": "eWNhxVXhu75EB9BIWGqC09PKc0jq9iPgXjxfl0LoBrw",
  "refresh_expires_at": "2026-11-27T09:20:55.50878762Z",
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
  "session_id": "da057f6c-9be1-4ca1-a7ba-f65f06b2cbd7",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNTUsImlhdCI6MTc5MzE3OTI1NSwianRpIjoiMzEyYjE4MmMtM2ZjYy00YTZiLTkwOWItN2Q5YWFjOGFiOGMzIiwic2lkIjoiZGEwNTdmNmMtOWJlMS00Y2ExLWE3YmEtZjY1ZjA2YjJjYmQ3In0.7c7gcZR3MU995dnkDyTdKLLQrFWu0YCtTkoPTfKaDnA",
  "access_expires_at": "2026-10-28T09:35:55.912987771Z",
  "refresh_token": "TE0gqRtqbulbewELdS6ns1efu_f_PtF648OFmusWqr4",
  "refresh_expires_at": "2026-10-28T21:20:55.912433617Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639229261` → **200**

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
  "correlation_id": "0cb86f9d-81e0-459c-afc4-3f627dae3b71"
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
  "session_id": "d0de5fca-9303-47f0-a2cb-330445b6f6b7",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNTYsImlhdCI6MTc5MzE3OTI1NiwianRpIjoiNjk0YWVkMzEtZGYwMS00ZDk0LTkyMGUtYmEwM2RiMDE0OWU2Iiwic2lkIjoiZDBkZTVmY2EtOTMwMy00N2YwLWEyY2ItMzMwNDQ1YjZmNmI3In0.WWbQyXMzAZQ30RA9nPMwLLXzEQ4zgRfcqTYKZmAtIME",
  "access_expires_at": "2026-10-28T09:35:56.321567987Z",
  "refresh_token": "n6EEU3vB8ds3FCnfW1AP4T_DYNQt5HiQRSRhOjGIyPw",
  "refresh_expires_at": "2026-10-28T21:20:56.320973939Z",
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
  "command_id": "8f8ceae1-76d7-455b-8884-8ab0b33fb834",
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
  "changed_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T09:20:56.400525313Z"
}
```

## The rider books the airport for 2026-10-28T12:20:55Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600917958",
  "device_ref": "sandbox-7322"
}
```

```json
{
  "challenge_id": "5893b011-4dcb-45d6-b8ed-4795dd76e6ad",
  "expires_at": "2026-10-28T09:25:56.431482921Z",
  "resend_available_at": "2026-10-28T09:20:57.431482921Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600917958` → **200**

```json
{
  "phone": "+48600917958",
  "audience": "CLIENT",
  "code": "006117",
  "sent_at": "2026-10-28T09:20:56.433899019Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5893b011-4dcb-45d6-b8ed-4795dd76e6ad",
  "code": "006117",
  "device_ref": "sandbox-7322"
}
```

```json
{
  "session_id": "22fa4bcc-76d7-450c-8a91-c59451d13294",
  "subject": {
    "type": "CLIENT",
    "id": "08f6a8a5-2628-4173-a3ae-a6912cbf333f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOGY2YThhNS0yNjI4LTQxNzMtYTNhZS1hNjkxMmNiZjMzM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTU2LCJpYXQiOjE3OTMxNzkyNTYsImp0aSI6IjNlMjcyYTZhLWRmMTAtNGRkMy1hMDNhLTEyYzNkZjk0ODIyMCIsInNpZCI6IjIyZmE0YmNjLTc2ZDctNDUwYy04YTkxLWM1OTQ1MWQxMzI5NCJ9.xzz2OZWIkAb2HrXskarf3Z8bnUKIMlPWL6k_JKjMnLY",
  "access_expires_at": "2026-10-28T09:35:56.488596774Z",
  "refresh_token": "WqF8eqeW638xgOifRr8ieZOq3iOd7digrvpWImoNlNo",
  "refresh_expires_at": "2026-11-27T09:20:56.48808004Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9030ec0e-84e6-44d1-99fd-d7a8e25afe81",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T12:20:55Z"
}
```

```json
{
  "id": "8cb3ca19-503f-46cc-bdee-06e4677d618c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:56.524936Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:20:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a4e4eaa9-1cce-4fab-9bca-44c93a7d92fe",
  "quote_id": "8cb3ca19-503f-46cc-bdee-06e4677d618c",
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
  "pickup_at": "2026-10-28T12:20:55Z"
}
```

```json
{
  "id": "9b701f2a-689e-46da-989a-0c3831c60d02",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "08f6a8a5-2628-4173-a3ae-a6912cbf333f",
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
  "created_at": "2026-10-28T09:20:56.568719Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:20:55Z",
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
  "device_ref": "sandbox-13018"
}
```

```json
{
  "challenge_id": "357b14a3-b9c3-4fdd-aa48-1d23a19521f7",
  "expires_at": "2026-10-28T09:25:56.602828555Z",
  "resend_available_at": "2026-10-28T09:20:57.602828555Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "567847",
  "sent_at": "2026-10-28T09:20:56.605529021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "357b14a3-b9c3-4fdd-aa48-1d23a19521f7",
  "code": "567847",
  "device_ref": "sandbox-13018"
}
```

```json
{
  "session_id": "5ed82be4-2481-426e-9a6d-c5ec44fccc3a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDE1NiwiaWF0IjoxNzkzMTc5MjU2LCJqdGkiOiIyNWZlYjViMy0wZWMwLTRhNTEtOWRkYS1hYzk0MzQzZDlhYWUiLCJzaWQiOiI1ZWQ4MmJlNC0yNDgxLTQyNmUtOWE2ZC1jNWVjNDRmY2NjM2EifQ.oIp7QuIgzmzc4dxaEkzNq0N6yW-EK_gqcpQekywE_uc",
  "access_expires_at": "2026-10-28T09:35:56.665605915Z",
  "refresh_token": "JzwpT8ZFVd_hKzftychB4XyBx0AVUd7eVovBrWEPRxI",
  "refresh_expires_at": "2026-11-27T09:20:56.664987989Z",
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
  "command_id": "bfc653a8-bdb1-49d0-a774-f5a27ca5afb6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:56Z",
    "sequence": 1793179256721
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ed8c50d0-3e2f-4260-aa84-5ef3bf803b31",
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
  "last_heartbeat_at": "2026-10-28T09:20:56.741514Z",
  "last_location_at": "2026-10-28T09:20:56.741514Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9b701f2a-689e-46da-989a-0c3831c60d02",
      "short_number": 17,
      "pickup_at": "2026-10-28T12:20:55Z",
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

`POST /api/driver/v1/preorders/9b701f2a-689e-46da-989a-0c3831c60d02/reserve` → **200**

```json
{
  "command_id": "587fb6d1-2203-4960-b643-4a9b407cb82d"
}
```

```json
{
  "id": "82af61bb-5e05-4ea5-9422-01ce1ec544a0",
  "state": "RESERVED",
  "order": {
    "order_id": "9b701f2a-689e-46da-989a-0c3831c60d02",
    "short_number": 17,
    "pickup_at": "2026-10-28T12:20:55Z",
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
  "reserved_at": "2026-10-28T09:20:56.813438Z",
  "confirm_from": "2026-10-28T11:50:55Z",
  "confirm_until": "2026-10-28T12:00:55Z",
  "drop_until": "2026-10-28T11:20:55Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "82af61bb-5e05-4ea5-9422-01ce1ec544a0",
      "state": "RESERVED",
      "order": {
        "order_id": "9b701f2a-689e-46da-989a-0c3831c60d02",
        "short_number": 17,
        "pickup_at": "2026-10-28T12:20:55Z",
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
      "reserved_at": "2026-10-28T09:20:56.813438Z",
      "confirm_from": "2026-10-28T11:50:55Z",
      "confirm_until": "2026-10-28T12:00:55Z",
      "drop_until": "2026-10-28T11:20:55Z"
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
      "id": "82af61bb-5e05-4ea5-9422-01ce1ec544a0",
      "state": "RESERVED",
      "order": {
        "order_id": "9b701f2a-689e-46da-989a-0c3831c60d02",
        "short_number": 17,
        "pickup_at": "2026-10-28T12:20:55Z",
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
      "reserved_at": "2026-10-28T09:20:56.813438Z",
      "confirm_from": "2026-10-28T11:50:55Z",
      "confirm_until": "2026-10-28T12:00:55Z",
      "drop_until": "2026-10-28T11:20:55Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/82af61bb-5e05-4ea5-9422-01ce1ec544a0/confirm` → **409**

```json
{
  "command_id": "28eacccf-1e31-4d05-8305-9c6d93052896"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/82af61bb-5e05-4ea5-9422-01ce1ec544a0/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "31223da8-06e3-470f-a446-ef113f4e1f24"
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
  "session_id": "c051b6b8-58eb-47ab-b2de-ed9398598b15",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNTcsImlhdCI6MTc5MzE3OTI1NywianRpIjoiYjQ1MzdkOWMtYTJhYy00MGU0LWFhZWUtMWYzZWM4OGU5NmVlIiwic2lkIjoiYzA1MWI2YjgtNThlYi00N2FiLWIyZGUtZWQ5Mzk4NTk4YjE1In0.8Rj9XBMUZvTPIULMTeQjuGdbSUwEnCoaPed4eRlkmAo",
  "access_expires_at": "2026-10-28T09:35:57.245317089Z",
  "refresh_token": "He2q7BTucMRMsW6LtjBmvfeY_Ftl4ddnvGAuRseCozQ",
  "refresh_expires_at": "2026-10-28T21:20:57.244750732Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9b701f2a-689e-46da-989a-0c3831c60d02` → **200**

```json
{
  "id": "9b701f2a-689e-46da-989a-0c3831c60d02",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "08f6a8a5-2628-4173-a3ae-a6912cbf333f",
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
  "created_at": "2026-10-28T09:20:56.568719Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T12:20:55Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "82af61bb-5e05-4ea5-9422-01ce1ec544a0",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T09:20:56.813438Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9b701f2a-689e-46da-989a-0c3831c60d02/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T09:20:56.570185Z",
      "actor": {
        "type": "CLIENT",
        "id": "08f6a8a5-2628-4173-a3ae-a6912cbf333f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9b701f2a-689e-46da-989a-0c3831c60d02",
        "preorder": true,
        "quote_id": "8cb3ca19-503f-46cc-bdee-06e4677d618c",
        "pickup_at": "2026-10-28T12:20:55Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "b7dc83c2-9ce0-424b-b01a-7c83e91668f9"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T09:20:56.814608Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9b701f2a-689e-46da-989a-0c3831c60d02",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "82af61bb-5e05-4ea5-9422-01ce1ec544a0"
      },
      "correlation_id": "ecbac19b-3baf-41e8-af10-a794de08f861"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9b701f2a-689e-46da-989a-0c3831c60d02, reservation 82af61bb-5e05-4ea5-9422-01ce1ec544a0.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18319"
}
```

```json
{
  "challenge_id": "398f7dad-d382-4f6e-8780-2a5fa0e5aca3",
  "expires_at": "2026-10-28T09:25:57.338913769Z",
  "resend_available_at": "2026-10-28T09:20:58.338913769Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "079597",
  "sent_at": "2026-10-28T09:20:57.341257324Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "398f7dad-d382-4f6e-8780-2a5fa0e5aca3",
  "code": "079597",
  "device_ref": "sandbox-18319"
}
```

```json
{
  "session_id": "bc2e9303-e75b-41ad-b3bc-fc48048ea845",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDE1NywiaWF0IjoxNzkzMTc5MjU3LCJqdGkiOiI3ODZiYzE3OC02ZTdjLTQ3Y2EtYTk1ZC01MmU5ZDI0N2IyNWQiLCJzaWQiOiJiYzJlOTMwMy1lNzViLTQxYWQtYjNiYy1mYzQ4MDQ4ZWE4NDUifQ.XV_Q0-YE-wR6rHEgSqHYA9JNceqU-GGXZEUaBivxM0U",
  "access_expires_at": "2026-10-28T09:35:57.400046224Z",
  "refresh_token": "topB1vSxbRrvvICESZzAseS2Xo84U3J0ueDPMXh2ErE",
  "refresh_expires_at": "2026-11-27T09:20:57.399455231Z",
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
  "command_id": "59cfba19-6992-4fa9-8683-eb49432a190c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:57Z",
    "sequence": 1793179257453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f278cae9-aedc-4681-b927-e5821519d13d",
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
  "last_heartbeat_at": "2026-10-28T09:20:57.471422Z",
  "last_location_at": "2026-10-28T09:20:57.471422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675465967",
  "device_ref": "sandbox-16420"
}
```

```json
{
  "challenge_id": "51e765fe-8044-4d17-9275-8a711c6078dd",
  "expires_at": "2026-10-28T09:25:57.502354635Z",
  "resend_available_at": "2026-10-28T09:20:58.502354635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675465967` → **200**

```json
{
  "phone": "+380675465967",
  "audience": "CLIENT",
  "code": "823565",
  "sent_at": "2026-10-28T09:20:57.507174379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51e765fe-8044-4d17-9275-8a711c6078dd",
  "code": "823565",
  "device_ref": "sandbox-16420"
}
```

```json
{
  "session_id": "3b9aae95-06a9-45c8-b594-166947f951f3",
  "subject": {
    "type": "CLIENT",
    "id": "eb57f573-48e7-4b08-8fee-ee55ceb6fc28"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjU3ZjU3My00OGU3LTRiMDgtOGZlZS1lZTU1Y2ViNmZjMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTU3LCJpYXQiOjE3OTMxNzkyNTcsImp0aSI6IjExOTgxYmQ5LTU2OGQtNGY3Yy05YjVlLTNkNzc3MjBmZjJiZSIsInNpZCI6IjNiOWFhZTk1LTA2YTktNDVjOC1iNTk0LTE2Njk0N2Y5NTFmMyJ9.WciU7YrR0q-HHLHhEx9QzRPnYgRkkabH6xiD9Qaq908",
  "access_expires_at": "2026-10-28T09:35:57.566842441Z",
  "refresh_token": "aW97_ZPZr_-gzzwLC_8aMm0PCoaWWXh4ILCXlESJFuk",
  "refresh_expires_at": "2026-11-27T09:20:57.566205972Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab398368-9b49-4cc7-a58d-1210b69ddc6b",
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
  "id": "efcf29e7-1a24-45ac-9cf3-32c20a2081a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:25:57.607100Z",
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
  "command_id": "99a3edee-8c29-48ad-96d4-21e7401d93ce",
  "quote_id": "efcf29e7-1a24-45ac-9cf3-32c20a2081a7",
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
  "id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eb57f573-48e7-4b08-8fee-ee55ceb6fc28",
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
  "created_at": "2026-10-28T09:20:57.647909Z",
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
    "id": "bd1c1e72-48d2-46f9-9a1e-50ef0888bb9e",
    "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
    "expires_at": "2026-10-28T09:21:12.652152Z",
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

`POST /api/driver/v1/offers/bd1c1e72-48d2-46f9-9a1e-50ef0888bb9e/accept` → **200**

```json
{
  "command_id": "1a183792-8f57-4190-8b03-a34ba3e89de8"
}
```

```json
{
  "id": "188b3565-a5f1-4cdf-b724-493a776d14a1",
  "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bfa728b8-2b18-4103-853f-a2bb767d22b5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bfa728b8-2b18-4103-853f-a2bb767d22b5",
  "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "assignment_id": "188b3565-a5f1-4cdf-b724-493a776d14a1",
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

`POST /api/driver/v1/work-sessions/f278cae9-aedc-4681-b927-e5821519d13d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:57Z",
    "sequence": 1793179257771
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f278cae9-aedc-4681-b927-e5821519d13d",
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
  "last_heartbeat_at": "2026-10-28T09:20:57.790498Z",
  "last_location_at": "2026-10-28T09:20:57.790498Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bfa728b8-2b18-4103-853f-a2bb767d22b5",
  "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "assignment_id": "188b3565-a5f1-4cdf-b724-493a776d14a1",
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

`POST /api/driver/v1/trips/bfa728b8-2b18-4103-853f-a2bb767d22b5/arrive` → **200**

```json
{
  "command_id": "02f1b2de-e2fd-4028-909d-8bd1b8c115f7",
  "expected_version": 0
}
```

```json
{
  "id": "bfa728b8-2b18-4103-853f-a2bb767d22b5",
  "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "assignment_id": "188b3565-a5f1-4cdf-b724-493a776d14a1",
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
  "arrived_at": "2026-10-28T09:20:57.843537Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bfa728b8-2b18-4103-853f-a2bb767d22b5/start` → **200**

```json
{
  "command_id": "382e9dee-86e4-47c5-b499-6952af47ddfc",
  "expected_version": 1
}
```

```json
{
  "id": "bfa728b8-2b18-4103-853f-a2bb767d22b5",
  "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "assignment_id": "188b3565-a5f1-4cdf-b724-493a776d14a1",
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
  "arrived_at": "2026-10-28T09:20:57.843537Z",
  "started_at": "2026-10-28T09:20:57.876805Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f278cae9-aedc-4681-b927-e5821519d13d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:20:57Z",
    "sequence": 1793179257899
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f278cae9-aedc-4681-b927-e5821519d13d",
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
  "last_heartbeat_at": "2026-10-28T09:20:57.917509Z",
  "last_location_at": "2026-10-28T09:20:57.917509Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/bfa728b8-2b18-4103-853f-a2bb767d22b5/complete` → **200**

```json
{
  "command_id": "1d92f0a3-fbe1-4181-b577-fcc9851c31f3",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:20:57Z",
  "cash_received": true
}
```

```json
{
  "id": "bfa728b8-2b18-4103-853f-a2bb767d22b5",
  "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "assignment_id": "188b3565-a5f1-4cdf-b724-493a776d14a1",
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
  "arrived_at": "2026-10-28T09:20:57.843537Z",
  "started_at": "2026-10-28T09:20:57.876805Z",
  "completed_at": "2026-10-28T09:20:57.949311Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/ccbcd3a0-5d95-4b7f-8f12-106ea28317f8/rating` → **200**

```json
{
  "command_id": "0f543eee-7846-46e9-b29d-65737d7c7190",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "score": 5,
  "created_at": "2026-10-28T09:20:58.003932895Z"
}
```

`POST /api/driver/v1/orders/ccbcd3a0-5d95-4b7f-8f12-106ea28317f8/rating` → **200**

```json
{
  "command_id": "2d8c4871-6e75-4540-b50f-2f51ce7a2545",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
  "score": 4,
  "created_at": "2026-10-28T09:20:58.041457294Z"
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
  "session_id": "84f75375-d8fd-491f-8060-1d1118415a7d",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNTgsImlhdCI6MTc5MzE3OTI1OCwianRpIjoiMTBjYzI4ZjktNjQ5My00NDIyLWJjNjctNzlmNzMxNjQwNjQzIiwic2lkIjoiODRmNzUzNzUtZDhmZC00OTFmLTgwNjAtMWQxMTE4NDE1YTdkIn0.0syP0TOawXYefK7Dv42xeVsHv5jt7l2YT8BNhFHM3J4",
  "access_expires_at": "2026-10-28T09:35:58.402105753Z",
  "refresh_token": "atLeSzAPESrJsfQm4ptrBNQRFRdas8v7MMBOP38y5mM",
  "refresh_expires_at": "2026-10-28T21:20:58.401091643Z",
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
  "session_id": "2fbe32d0-69ba-49b7-bbf8-dd88020e155f",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNTgsImlhdCI6MTc5MzE3OTI1OCwianRpIjoiNzA5MTMxNDUtNjViYy00OWRlLTkzNjMtN2IwODAxNDM3ODRhIiwic2lkIjoiMmZiZTMyZDAtNjliYS00OWI3LWJiZjgtZGQ4ODAyMGUxNTVmIn0.egJSNBCUGxmiHcT89epX4zHgEDN8bk7AhKGhot571YU",
  "access_expires_at": "2026-10-28T09:35:58.721670345Z",
  "refresh_token": "KTD5feDg6ehtAnF1r8IpcodXIxorg55eVPQklK0bR9k",
  "refresh_expires_at": "2026-10-28T21:20:58.721080756Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ccbcd3a0-5d95-4b7f-8f12-106ea28317f8/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
      "author_type": "RIDER",
      "author_id": "eb57f573-48e7-4b08-8fee-ee55ceb6fc28",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T09:20:58.003933Z"
    },
    {
      "order_id": "ccbcd3a0-5d95-4b7f-8f12-106ea28317f8",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "eb57f573-48e7-4b08-8fee-ee55ceb6fc28",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T09:20:58.041457Z"
    }
  ]
}
```

Done: ratings for order ccbcd3a0-5d95-4b7f-8f12-106ea28317f8.

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
  "session_id": "f1652696-aa90-4067-ad4e-2549c4847771",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNTksImlhdCI6MTc5MzE3OTI1OSwianRpIjoiZDIzMmUyZGMtZmMwNy00YTUwLWFlNzQtYWYzZDA1MTM1Zjk3Iiwic2lkIjoiZjE2NTI2OTYtYWE5MC00MDY3LWFkNGUtMjU0OWM0ODQ3NzcxIn0.NZBw2kxvcIsO6H-WiJG-gwebbZUFKUDphDDic3zf8mM",
  "access_expires_at": "2026-10-28T09:35:59.089228882Z",
  "refresh_token": "GwQD-uklX0AD8YKuFf2PVM8Bj-qj0X5ewPH7rA0kt2s",
  "refresh_expires_at": "2026-10-28T21:20:59.088655162Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "bacf0de4-56a0-4288-a984-0fcdebd1c335",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "e19a25dc-5b12-4b58-a651-00ad96ee46b7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:20:59.129282Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e19a25dc-5b12-4b58-a651-00ad96ee46b7` → **200**

```json
{
  "id": "e19a25dc-5b12-4b58-a651-00ad96ee46b7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:20:59.129282Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e19a25dc-5b12-4b58-a651-00ad96ee46b7` → **200**

```json
{
  "id": "e19a25dc-5b12-4b58-a651-00ad96ee46b7",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:20:59.129282Z",
  "ready_at": "2026-10-28T09:21:00.138491Z",
  "expires_at": "2026-10-29T09:21:00.138491Z"
}
```

`GET /api/admin/v1/reports/exports/e19a25dc-5b12-4b58-a651-00ad96ee46b7/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
total,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a8b36ba3-668e-431f-a422-968377525f09",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "967f5175-68a8-48f6-ac2b-cae88c294f06",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:21:00.252639Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/967f5175-68a8-48f6-ac2b-cae88c294f06` → **200**

```json
{
  "id": "967f5175-68a8-48f6-ac2b-cae88c294f06",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:21:00.252639Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/967f5175-68a8-48f6-ac2b-cae88c294f06` → **200**

```json
{
  "id": "967f5175-68a8-48f6-ac2b-cae88c294f06",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:21:00.252639Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/967f5175-68a8-48f6-ac2b-cae88c294f06` → **200**

```json
{
  "id": "967f5175-68a8-48f6-ac2b-cae88c294f06",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:21:00.252639Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/967f5175-68a8-48f6-ac2b-cae88c294f06` → **200**

```json
{
  "id": "967f5175-68a8-48f6-ac2b-cae88c294f06",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:21:00.252639Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/967f5175-68a8-48f6-ac2b-cae88c294f06` → **200**

```json
{
  "id": "967f5175-68a8-48f6-ac2b-cae88c294f06",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:21:00.252639Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/967f5175-68a8-48f6-ac2b-cae88c294f06` → **200**

```json
{
  "id": "967f5175-68a8-48f6-ac2b-cae88c294f06",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:21:00.252639Z",
  "ready_at": "2026-10-28T09:21:05.146097Z",
  "expires_at": "2026-10-29T09:21:05.146097Z"
}
```

`GET /api/admin/v1/reports/exports/967f5175-68a8-48f6-ac2b-cae88c294f06/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/d9dc74f4-25cd-4977-8626-e970f53f0a99` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/d9dc74f4-25cd-4977-8626-e970f53f0a99",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f6533341-695c-4d42-a519-a04c36e4d423"
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
  "device_ref": "sandbox-23919"
}
```

```json
{
  "challenge_id": "ba1a3dd1-eb5b-4f4d-a6d0-b539d6af93bb",
  "expires_at": "2026-10-28T09:26:05.510371737Z",
  "resend_available_at": "2026-10-28T09:21:06.510371737Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "939169",
  "sent_at": "2026-10-28T09:21:05.51340541Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba1a3dd1-eb5b-4f4d-a6d0-b539d6af93bb",
  "code": "939169",
  "device_ref": "sandbox-23919"
}
```

```json
{
  "session_id": "f10cb6f5-e830-4292-b290-1b96a9fa9e00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDE2NSwiaWF0IjoxNzkzMTc5MjY1LCJqdGkiOiI1YWVkNDFlYi03ODZlLTQ4OTAtOWRjYi05MTMwZTg5ODZkMGMiLCJzaWQiOiJmMTBjYjZmNS1lODMwLTQyOTItYjI5MC0xYjk2YTlmYTllMDAifQ.EqlprwyROYwE8z5VpHrFbGaerzjbm1J16MCjj0ebkuA",
  "access_expires_at": "2026-10-28T09:36:05.569177853Z",
  "refresh_token": "qtSCih7UEOIC8pH4rxNO33GC_mURCdQBInzWPw4jF8A",
  "refresh_expires_at": "2026-11-27T09:21:05.568518202Z",
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
  "command_id": "d115ff31-adce-4360-9043-dc741b8378cd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:21:05Z",
    "sequence": 1793179265645
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "717a3f64-22c0-40f0-b31a-d95f6ddb3568",
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
  "last_heartbeat_at": "2026-10-28T09:21:05.663224Z",
  "last_location_at": "2026-10-28T09:21:05.663224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "66a80b74-3ddf-4725-b43b-963d3c6a53e4",
  "points": [
    {
      "sequence": 1793179267697,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:20:07Z"
    },
    {
      "sequence": 1793179267704,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:21:07Z"
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
  "session_id": "d3ef7d07-6d25-4df4-8291-6755e38299bd",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNjgsImlhdCI6MTc5MzE3OTI2OCwianRpIjoiMzY5MjVmMDgtNWVlNS00MDMzLTkwYjYtNTI0OTkyYTE4OTYzIiwic2lkIjoiZDNlZjdkMDctNmQyNS00ZGY0LTgyOTEtNjc1NWUzODI5OWJkIn0.w7qN8WAAXUivI7d7NwBmzWsKtAO_YeWWXvRVcyZtH74",
  "access_expires_at": "2026-10-28T09:36:08.07459636Z",
  "refresh_token": "Q7OayH_8TWL300YYkpemSR1q8z2RTlSD2VoIWfJNJNY",
  "refresh_expires_at": "2026-10-28T21:21:08.074014004Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "bea06841-5227-47a4-ac08-b4713c3d5976",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T09:21:07Z",
        "track_point_id": "544f1eb6-6cbb-41be-ac17-47dbe1a30657",
        "work_session_id": "717a3f64-22c0-40f0-b31a-d95f6ddb3568"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T09:21:07Z",
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

`POST /api/admin/v1/driver-risk-flags/bea06841-5227-47a4-ac08-b4713c3d5976/confirm` → **200**

```json
{
  "command_id": "8c07b61b-23a7-4737-ad44-58bb2c5f64a2",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "bea06841-5227-47a4-ac08-b4713c3d5976",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T09:21:07Z",
    "track_point_id": "544f1eb6-6cbb-41be-ac17-47dbe1a30657",
    "work_session_id": "717a3f64-22c0-40f0-b31a-d95f6ddb3568"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T09:21:07Z",
  "reason": null,
  "reviewed_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "reviewed_at": "2026-10-28T09:21:08.201103Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/bea06841-5227-47a4-ac08-b4713c3d5976/dismiss` → **409**

```json
{
  "command_id": "93782caa-0889-4579-87cb-29cd1240fd9c",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/bea06841-5227-47a4-ac08-b4713c3d5976/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "23ed6bb7-22dd-4fa3-8650-4374d5279b6e"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "6b1ebc20-6fcc-4e8d-b19f-eef64f84eff3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "b59fe814-0b35-4cf5-90ea-62b98798f6e2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "raised_at": "2026-10-28T09:21:08.281671Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/b59fe814-0b35-4cf5-90ea-62b98798f6e2/dismiss` → **200**

```json
{
  "command_id": "9fc20bee-caf0-4b82-bcbd-11018be6425d",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "b59fe814-0b35-4cf5-90ea-62b98798f6e2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "raised_at": "2026-10-28T09:21:08.281671Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "reviewed_at": "2026-10-28T09:21:08.324828Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "52d86fd1-6022-4bf4-a217-56e58c55fdd3",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "bea06841-5227-47a4-ac08-b4713c3d5976"
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
      "actor_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:21:08.371503Z"
    }
  ]
}
```

Done: flag bea06841-5227-47a4-ac08-b4713c3d5976 confirmed, suspension named it, driver reinstated.

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
  "session_id": "24692807-23fd-4905-989e-52b23dad20d7",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNjgsImlhdCI6MTc5MzE3OTI2OCwianRpIjoiMDI2ZjQ1N2ItOGY2ZC00NGRjLWEyNTQtNzU1MWFkYjdmMjM4Iiwic2lkIjoiMjQ2OTI4MDctMjNmZC00OTA1LTk4OWUtNTJiMjNkYWQyMGQ3In0.quez8WhEbFPzctFqgZALMCgYhFrOe4P73uxgvSqBWko",
  "access_expires_at": "2026-10-28T09:36:08.726969231Z",
  "refresh_token": "dLT-0_G3FPXZPXxiWlaOJycGQOzQthQmDNtQHVI1Ne0",
  "refresh_expires_at": "2026-10-28T21:21:08.726311435Z",
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
      "actor_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:21:08.371503Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "556546f9-8eee-4f5a-b6ed-a69c63a7a898",
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
  "session_id": "717a3f64-22c0-40f0-b31a-d95f6ddb3568",
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
  "last_heartbeat_at": "2026-10-28T09:21:05.663224Z",
  "last_location_at": "2026-10-28T09:21:05.663224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/717a3f64-22c0-40f0-b31a-d95f6ddb3568/close` → **200**

```json
{
  "command_id": "579db46b-f21e-4f52-8b53-e7f9d0fff99d",
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
  "session_id": "d31c2dca-ef6a-45d8-8e3c-aa7b2b17f2d8",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNjksImlhdCI6MTc5MzE3OTI2OSwianRpIjoiMTg3YWNhZmItYjY2MC00MzcwLWI4NjUtMDYxZmU4ZDQyZmE1Iiwic2lkIjoiZDMxYzJkY2EtZWY2YS00NWQ4LThlM2MtYWE3YjJiMTdmMmQ4In0.T9w8sI-HfhxamzP9q1TXJ7-YLZ9hD8g1vHW3sYqGTxs",
  "access_expires_at": "2026-10-28T09:36:09.190552622Z",
  "refresh_token": "OzZiDUNAU8ZckpbrHj_PMKstE9gFjDPIN4C9F2AkPAg",
  "refresh_expires_at": "2026-10-28T21:21:09.189895105Z",
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
  "command_id": "3af8cf9a-989f-4299-98a1-8962455c5c06",
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
  "changed_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:21:09.25999Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "3af8cf9a-989f-4299-98a1-8962455c5c06",
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
  "changed_by": "ce308942-008b-4303-ba6d-11fe07cde8e7",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:21:09.25999Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48403189417",
  "device_ref": "sandbox-9150"
}
```

```json
{
  "challenge_id": "97e674ba-7362-4116-90d0-9579a7f10461",
  "expires_at": "2026-10-28T09:26:09.337098333Z",
  "resend_available_at": "2026-10-28T09:21:10.337098333Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48403189417` → **200**

```json
{
  "phone": "+48403189417",
  "audience": "CLIENT",
  "code": "789205",
  "sent_at": "2026-10-28T09:21:09.339332471Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97e674ba-7362-4116-90d0-9579a7f10461",
  "code": "789205",
  "device_ref": "sandbox-9150"
}
```

```json
{
  "session_id": "0efb924a-7a6e-4535-a46b-c82de34e20f4",
  "subject": {
    "type": "CLIENT",
    "id": "bdb469a0-4d6c-45f4-bf73-71aa3f2a1cb8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZGI0NjlhMC00ZDZjLTQ1ZjQtYmY3My03MWFhM2YyYTFjYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTY5LCJpYXQiOjE3OTMxNzkyNjksImp0aSI6IjkwMmUxZTlkLWQ3YWItNDYwOS04MTc3LTgyNTc1Mzc4MWE2NCIsInNpZCI6IjBlZmI5MjRhLTdhNmUtNDUzNS1hNDZiLWM4MmRlMzRlMjBmNCJ9.BVCFzbLpEUGpVnC0sQia_D50nF8UtC73n708eHbmOQQ",
  "access_expires_at": "2026-10-28T09:36:09.394004926Z",
  "refresh_token": "VWuxWKiY-7mnsPiiWK6aP0xBgk4_cqqAKIoAmohlsGY",
  "refresh_expires_at": "2026-11-27T09:21:09.393400718Z",
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
  "correlation_id": "511a1152-5fa1-4e44-bf43-30df8f353272"
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
  "device_ref": "sandbox-20902"
}
```

```json
{
  "challenge_id": "a6941cbb-d85e-49a3-8020-1f0ae2dbdd63",
  "expires_at": "2026-10-28T09:26:09.473150044Z",
  "resend_available_at": "2026-10-28T09:21:10.473150044Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "536684",
  "sent_at": "2026-10-28T09:21:09.475800209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6941cbb-d85e-49a3-8020-1f0ae2dbdd63",
  "code": "536684",
  "device_ref": "sandbox-20902"
}
```

```json
{
  "session_id": "4d45cd98-95da-4060-ad45-2daedb494106",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDE2OSwiaWF0IjoxNzkzMTc5MjY5LCJqdGkiOiI4MDAwMGVhOS1lNDhmLTRhMjgtYmQ2ZC1lNDNkMzdlY2VmOTYiLCJzaWQiOiI0ZDQ1Y2Q5OC05NWRhLTQwNjAtYWQ0NS0yZGFlZGI0OTQxMDYifQ.Woox_3pD6oxTN0zSwkjHoHM3GKpY1JoIZEzwRlhD9so",
  "access_expires_at": "2026-10-28T09:36:09.531184016Z",
  "refresh_token": "uigNtF9UVENm0oa29OBc7weqlvxTG4mc9p0JoVIEvXQ",
  "refresh_expires_at": "2026-11-27T09:21:09.530529582Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ed8c50d0-3e2f-4260-aa84-5ef3bf803b31",
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
  "last_heartbeat_at": "2026-10-28T09:20:56.741514Z",
  "last_location_at": "2026-10-28T09:20:56.741514Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed8c50d0-3e2f-4260-aa84-5ef3bf803b31/handover` → **200**

```json
{
  "command_id": "d41eac0f-6e68-41ce-97b8-c2813a45819b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ed8c50d0-3e2f-4260-aa84-5ef3bf803b31",
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
  "last_heartbeat_at": "2026-10-28T09:20:56.741514Z",
  "last_location_at": "2026-10-28T09:20:56.741514Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed8c50d0-3e2f-4260-aa84-5ef3bf803b31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:21:09Z",
    "sequence": 1793179269615
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ed8c50d0-3e2f-4260-aa84-5ef3bf803b31",
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
  "last_heartbeat_at": "2026-10-28T09:21:09.633438Z",
  "last_location_at": "2026-10-28T09:21:09.633438Z",
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
  "session_id": "ed8c50d0-3e2f-4260-aa84-5ef3bf803b31",
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
  "last_heartbeat_at": "2026-10-28T09:21:09.633438Z",
  "last_location_at": "2026-10-28T09:21:09.633438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed8c50d0-3e2f-4260-aa84-5ef3bf803b31/close` → **200**

```json
{
  "command_id": "11fe66ef-bb66-4fee-bb06-460b6950369a",
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
  "correlation_id": "e63129be-2bee-480e-add2-adc93404eabf"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677489237",
  "device_ref": "sandbox-24921"
}
```

```json
{
  "challenge_id": "ccc6b07d-a7a4-493f-90a6-75a2f5d87d62",
  "expires_at": "2026-10-28T09:26:09.799311548Z",
  "resend_available_at": "2026-10-28T09:21:10.799311548Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677489237` → **200**

```json
{
  "phone": "+380677489237",
  "audience": "CLIENT",
  "code": "618248",
  "sent_at": "2026-10-28T09:21:09.802818379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ccc6b07d-a7a4-493f-90a6-75a2f5d87d62",
  "code": "618248",
  "device_ref": "sandbox-24921"
}
```

```json
{
  "session_id": "7ee83146-0cf5-485c-83c5-89fceb1cef31",
  "subject": {
    "type": "CLIENT",
    "id": "478a3805-8d20-4a6d-9385-c867924571fd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NzhhMzgwNS04ZDIwLTRhNmQtOTM4NS1jODY3OTI0NTcxZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgwMTY5LCJpYXQiOjE3OTMxNzkyNjksImp0aSI6IjA5OTY4ZWYwLTk0ZDAtNGQ5My04MzcxLTE4OTcwZmFmMTU3ZiIsInNpZCI6IjdlZTgzMTQ2LTBjZjUtNDg1Yy04M2M1LTg5ZmNlYjFjZWYzMSJ9.H4XarAVMva2926OlhIBpfAZDylm-MV3SCGIQuMXRERY",
  "access_expires_at": "2026-10-28T09:36:09.859990774Z",
  "refresh_token": "kLBgjvk3RkKJvZMIZ92FlyT106XhxS8IhV3_9iLfZbA",
  "refresh_expires_at": "2026-11-27T09:21:09.859271282Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "54de57f4-cf60-445d-920a-377e1d7ac6ce",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6a2a77cc-e11a-432b-a327-6d62d9e6dbee",
  "upload_path": "/api/rider/v1/uploads/6a2a77cc-e11a-432b-a327-6d62d9e6dbee",
  "expires_at": "2026-10-28T09:36:09.898037668Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/6a2a77cc-e11a-432b-a327-6d62d9e6dbee` → **200**

```json
{
  "file_id": "6a2a77cc-e11a-432b-a327-6d62d9e6dbee",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "cea003f5-3d9e-4b6d-b00b-406f9c49a54a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "6a2a77cc-e11a-432b-a327-6d62d9e6dbee"
  ]
}
```

```json
{
  "id": "95f543d3-c249-467b-a214-aa2d9f8923bc",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "478a3805-8d20-4a6d-9385-c867924571fd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:21:09.968217Z",
  "updated_at": "2026-10-28T09:21:09.968217Z",
  "messages": [
    {
      "id": "d0057a7c-86ec-44eb-81fb-4b98e4467c61",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "478a3805-8d20-4a6d-9385-c867924571fd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:21:09.969576Z",
      "attachments": [
        {
          "file_id": "6a2a77cc-e11a-432b-a327-6d62d9e6dbee",
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
  "session_id": "44a54287-01e5-485e-a416-a501e9507e5f",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNzAsImlhdCI6MTc5MzE3OTI3MCwianRpIjoiMWMxOGMwN2EtNzAwZC00ZDcxLWE1ZTQtODBhYzhiNmMzYzhjIiwic2lkIjoiNDRhNTQyODctMDFlNS00ODVlLWE0MTYtYTUwMWU5NTA3ZTVmIn0.7ziBxcr1pi5RDQ6enRTzrjJ2tHI7jdwrGFgMBYR_eqk",
  "access_expires_at": "2026-10-28T09:36:10.307998905Z",
  "refresh_token": "7Y9SGXPWuRIUwpYDU8yaqJ7oy8kfBpx-7-aJN6XqTHA",
  "refresh_expires_at": "2026-10-28T21:21:10.307423742Z",
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
  "session_id": "0bff8cb8-7d7c-471f-9ed8-44760aae3b6b",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNzAsImlhdCI6MTc5MzE3OTI3MCwianRpIjoiY2QzZjk2ODctNjUzMy00MmRiLTlmNmQtOGVkZTI5YWRhYzE4Iiwic2lkIjoiMGJmZjhjYjgtN2Q3Yy00NzFmLTllZDgtNDQ3NjBhYWUzYjZiIn0.UQ1WE1kGzmVTUt1DJHcgNSh5NgG2br6q9gJ-jFdAUk0",
  "access_expires_at": "2026-10-28T09:36:10.626630447Z",
  "refresh_token": "xVmv50f1qSvPtVjeo_BXRbMEFRYOvBaJiIHd6o_4xco",
  "refresh_expires_at": "2026-10-28T21:21:10.626001193Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/95f543d3-c249-467b-a214-aa2d9f8923bc/attachments/6a2a77cc-e11a-432b-a327-6d62d9e6dbee` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "f4c2441b-2631-4813-8bf8-f443d4fc34bb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "53566783-4461-41a3-b6d1-167d32d877e5",
  "upload_path": "/api/operator/v1/uploads/53566783-4461-41a3-b6d1-167d32d877e5",
  "expires_at": "2026-10-28T09:36:10.675501441Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/53566783-4461-41a3-b6d1-167d32d877e5` → **200**

```json
{
  "file_id": "53566783-4461-41a3-b6d1-167d32d877e5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/95f543d3-c249-467b-a214-aa2d9f8923bc` → **200**

```json
{
  "id": "95f543d3-c249-467b-a214-aa2d9f8923bc",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "478a3805-8d20-4a6d-9385-c867924571fd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:21:09.968217Z",
  "updated_at": "2026-10-28T09:21:09.968217Z",
  "messages": [
    {
      "id": "d0057a7c-86ec-44eb-81fb-4b98e4467c61",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "478a3805-8d20-4a6d-9385-c867924571fd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:21:09.969576Z",
      "attachments": [
        {
          "file_id": "6a2a77cc-e11a-432b-a327-6d62d9e6dbee",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/95f543d3-c249-467b-a214-aa2d9f8923bc/comments` → **200**

```json
{
  "command_id": "bba71aae-1ec4-443e-92b8-81c7c1bcf2b0",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "53566783-4461-41a3-b6d1-167d32d877e5"
  ]
}
```

```json
{
  "id": "95f543d3-c249-467b-a214-aa2d9f8923bc",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "478a3805-8d20-4a6d-9385-c867924571fd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:21:09.968217Z",
  "updated_at": "2026-10-28T09:21:10.774173Z",
  "messages": [
    {
      "id": "d0057a7c-86ec-44eb-81fb-4b98e4467c61",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "478a3805-8d20-4a6d-9385-c867924571fd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:21:09.969576Z",
      "attachments": [
        {
          "file_id": "6a2a77cc-e11a-432b-a327-6d62d9e6dbee",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c829b284-b0a2-4acf-aafb-b5c03184b517",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:21:10.773779Z",
      "attachments": [
        {
          "file_id": "53566783-4461-41a3-b6d1-167d32d877e5",
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

`GET /api/rider/v1/support/cases/95f543d3-c249-467b-a214-aa2d9f8923bc` → **200**

```json
{
  "id": "95f543d3-c249-467b-a214-aa2d9f8923bc",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "478a3805-8d20-4a6d-9385-c867924571fd",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:21:09.968217Z",
  "updated_at": "2026-10-28T09:21:10.774173Z",
  "messages": [
    {
      "id": "d0057a7c-86ec-44eb-81fb-4b98e4467c61",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "478a3805-8d20-4a6d-9385-c867924571fd",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:21:09.969576Z",
      "attachments": [
        {
          "file_id": "6a2a77cc-e11a-432b-a327-6d62d9e6dbee",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c829b284-b0a2-4acf-aafb-b5c03184b517",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:21:10.773779Z",
      "attachments": [
        {
          "file_id": "53566783-4461-41a3-b6d1-167d32d877e5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/95f543d3-c249-467b-a214-aa2d9f8923bc/attachments/53566783-4461-41a3-b6d1-167d32d877e5` → **200**

Done: support case 95f543d3-c249-467b-a214-aa2d9f8923bc, rider attachment 6a2a77cc-e11a-432b-a327-6d62d9e6dbee, operator attachment 53566783-4461-41a3-b6d1-167d32d877e5.

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
  "session_id": "3052654b-4288-4c69-b2cb-96ba759d7055",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNzEsImlhdCI6MTc5MzE3OTI3MSwianRpIjoiM2Q4OWQwN2UtY2EyYi00NjJiLWJkYWUtODMzNDRkYjE0YjQxIiwic2lkIjoiMzA1MjY1NGItNDI4OC00YzY5LWIyY2ItOTZiYTc1OWQ3MDU1In0.n1P09dLWrzGzUJuQOTK5OOz3mUAwSE13z1faEW3Oul8",
  "access_expires_at": "2026-10-28T09:36:11.16621704Z",
  "refresh_token": "wIxAqd3UkPFbe1EYmjwMD-LKATayzH5FUOHF-tRuCCQ",
  "refresh_expires_at": "2026-10-28T21:21:11.165647798Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14808"
}
```

```json
{
  "challenge_id": "6f5ff92b-2697-41ef-b9b6-eae209dd32ac",
  "expires_at": "2026-10-28T09:26:11.193624737Z",
  "resend_available_at": "2026-10-28T09:21:12.193624737Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "243254",
  "sent_at": "2026-10-28T09:21:11.196131927Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f5ff92b-2697-41ef-b9b6-eae209dd32ac",
  "code": "243254",
  "device_ref": "sandbox-14808"
}
```

```json
{
  "session_id": "5499cf02-5ce5-48fb-b1cb-3f366df31f98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDE3MSwiaWF0IjoxNzkzMTc5MjcxLCJqdGkiOiIxMTMyNjBmYi0yNzc1LTRkZjktYmIwZi1hZWYzZDY1NWUzMDkiLCJzaWQiOiI1NDk5Y2YwMi01Y2U1LTQ4ZmItYjFjYi0zZjM2NmRmMzFmOTgifQ.2O8ByuJdOz_RV7eytRdfFv-JQdW3BPVTFrDhyCjxEas",
  "access_expires_at": "2026-10-28T09:36:11.251615727Z",
  "refresh_token": "gw4XesIrcZFKpubN3c7xfOFDnIMLgXSCFnet8HYvWa0",
  "refresh_expires_at": "2026-11-27T09:21:11.251090004Z",
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
      "actor_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:21:08.371503Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "ce308942-008b-4303-ba6d-11fe07cde8e7",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T09:21:08.791816Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "8e4a632e-9ab1-4293-972f-30c672e2a05f",
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
  "device_ref": "sandbox-26656"
}
```

```json
{
  "challenge_id": "ec87c974-66c2-4d83-8dad-735555c3c238",
  "expires_at": "2026-10-28T09:26:11.372651562Z",
  "resend_available_at": "2026-10-28T09:21:12.372651562Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "677370",
  "sent_at": "2026-10-28T09:21:11.374725341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec87c974-66c2-4d83-8dad-735555c3c238",
  "code": "677370",
  "device_ref": "sandbox-26656"
}
```

```json
{
  "session_id": "511bccec-a16a-4b9f-ac3d-7688a3ba875d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MDE3MSwiaWF0IjoxNzkzMTc5MjcxLCJqdGkiOiI2NmFmNTcwMi1mNDhkLTQ5NTYtYTI4ZS04ZGEwNDI4MzlmZDEiLCJzaWQiOiI1MTFiY2NlYy1hMTZhLTRiOWYtYWMzZC03Njg4YTNiYTg3NWQifQ.U7zHQM3F0PLRQErCxyrjiiGPiZMhfeFZPtX_QC764CQ",
  "access_expires_at": "2026-10-28T09:36:11.430364784Z",
  "refresh_token": "mUkH0Xgl5nFH9MLU13DjLBRBY45-Yz6X9gNj7jsaot4",
  "refresh_expires_at": "2026-11-27T09:21:11.429690056Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f278cae9-aedc-4681-b927-e5821519d13d",
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
  "last_heartbeat_at": "2026-10-28T09:20:57.917509Z",
  "last_location_at": "2026-10-28T09:20:57.917509Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f278cae9-aedc-4681-b927-e5821519d13d/handover` → **200**

```json
{
  "command_id": "f781ef27-ed0f-4dd2-850d-1e662deb29c5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f278cae9-aedc-4681-b927-e5821519d13d",
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
  "last_heartbeat_at": "2026-10-28T09:20:57.917509Z",
  "last_location_at": "2026-10-28T09:20:57.917509Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f278cae9-aedc-4681-b927-e5821519d13d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:21:11Z",
    "sequence": 1793179271515
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f278cae9-aedc-4681-b927-e5821519d13d",
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
  "last_heartbeat_at": "2026-10-28T09:21:11.533856Z",
  "last_location_at": "2026-10-28T09:21:11.533856Z",
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
  "command_id": "7d09bba9-0bf7-4302-a704-86e668fc2b36",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:21:11Z",
    "sequence": 1793179271582
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a86ba4f4-5a8f-4a75-9fee-4ed5e74dc8b0",
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
  "last_heartbeat_at": "2026-10-28T09:21:11.599783Z",
  "last_location_at": "2026-10-28T09:21:11.599783Z",
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
  "session_id": "bcd2c843-ddd1-490f-a668-6d5b63f7749e",
  "subject": {
    "type": "STAFF",
    "id": "ce308942-008b-4303-ba6d-11fe07cde8e7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTMwODk0Mi0wMDhiLTQzMDMtYmE2ZC0xMWZlMDdjZGU4ZTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODAxNzEsImlhdCI6MTc5MzE3OTI3MSwianRpIjoiYzcxYjE0YjgtYmJlMS00OTc3LTkxODctNTgxZTRjMTQyYjY3Iiwic2lkIjoiYmNkMmM4NDMtZGRkMS00OTBmLWE2NjgtNmQ1YjYzZjc3NDllIn0.QsRevn6T-bpDBvspN8sIWLkttouveF26luLmPTY5D1Y",
  "access_expires_at": "2026-10-28T09:36:11.922877251Z",
  "refresh_token": "_KQUKKkO6hmUVhFjq8HaxTX2ny_dHhfmLKtKIE-Ym_g",
  "refresh_expires_at": "2026-10-28T21:21:11.922160393Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2896f493-98e2-482a-bea4-ef809ac2d806",
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
  "id": "a2b3d19b-8f28-4eda-a7a1-4d0ff32d66c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:26:11.954784Z",
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
  "command_id": "670f60cc-9f57-4479-88aa-f89212843fb3",
  "quote_id": "a2b3d19b-8f28-4eda-a7a1-4d0ff32d66c5",
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
  "id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
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
  "created_at": "2026-10-28T09:21:11.994123Z",
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
    "id": "5a7fc47b-49d7-4ae6-85fd-2e5a5dc37402",
    "order_id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
    "expires_at": "2026-10-28T09:21:26.998264Z",
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

`POST /api/driver/v1/offers/5a7fc47b-49d7-4ae6-85fd-2e5a5dc37402/accept` → **200**

```json
{
  "command_id": "ea169503-871c-4ffc-a62f-c6e7f6ed12ec"
}
```

```json
{
  "id": "9405c7bb-e214-400b-b9bc-a7ab70395ad1",
  "order_id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0facf7a4-28cb-4f3a-a0a8-9eae30f104a6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0facf7a4-28cb-4f3a-a0a8-9eae30f104a6",
  "order_id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
  "assignment_id": "9405c7bb-e214-400b-b9bc-a7ab70395ad1",
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

`POST /api/driver/v1/work-sessions/a86ba4f4-5a8f-4a75-9fee-4ed5e74dc8b0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:21:12Z",
    "sequence": 1793179272139
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a86ba4f4-5a8f-4a75-9fee-4ed5e74dc8b0",
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
  "last_heartbeat_at": "2026-10-28T09:21:12.157821Z",
  "last_location_at": "2026-10-28T09:21:12.157821Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0facf7a4-28cb-4f3a-a0a8-9eae30f104a6/arrive` → **200**

```json
{
  "command_id": "364919df-8250-459d-a4e1-4357e7ecd54c",
  "expected_version": 0
}
```

```json
{
  "id": "0facf7a4-28cb-4f3a-a0a8-9eae30f104a6",
  "order_id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
  "assignment_id": "9405c7bb-e214-400b-b9bc-a7ab70395ad1",
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
  "arrived_at": "2026-10-28T09:21:12.195463Z",
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

`POST /api/driver/v1/trips/0facf7a4-28cb-4f3a-a0a8-9eae30f104a6/start` → **200**

```json
{
  "command_id": "afeda7da-5d9c-40d6-b697-291dab879f80",
  "expected_version": 1
}
```

```json
{
  "id": "0facf7a4-28cb-4f3a-a0a8-9eae30f104a6",
  "order_id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
  "assignment_id": "9405c7bb-e214-400b-b9bc-a7ab70395ad1",
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
  "arrived_at": "2026-10-28T09:21:12.195463Z",
  "started_at": "2026-10-28T09:21:12.235001Z",
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

`POST /api/driver/v1/trips/0facf7a4-28cb-4f3a-a0a8-9eae30f104a6/complete` → **200**

```json
{
  "command_id": "5e6d1005-ed78-4fe8-8e48-ef7e6358a915",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:21:12Z",
  "cash_received": true
}
```

```json
{
  "id": "0facf7a4-28cb-4f3a-a0a8-9eae30f104a6",
  "order_id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
  "assignment_id": "9405c7bb-e214-400b-b9bc-a7ab70395ad1",
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
  "arrived_at": "2026-10-28T09:21:12.195463Z",
  "started_at": "2026-10-28T09:21:12.235001Z",
  "completed_at": "2026-10-28T09:21:12.278247Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/0dcc29da-c989-47a6-bb30-8c1e80dae83c` → **200**

```json
{
  "id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
  "short_number": 19,
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
    "id": "9405c7bb-e214-400b-b9bc-a7ab70395ad1",
    "order_id": "0dcc29da-c989-47a6-bb30-8c1e80dae83c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0facf7a4-28cb-4f3a-a0a8-9eae30f104a6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:21:11.994123Z",
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
  "session_id": "f278cae9-aedc-4681-b927-e5821519d13d",
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
  "last_heartbeat_at": "2026-10-28T09:21:11.533856Z",
  "last_location_at": "2026-10-28T09:21:11.533856Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f278cae9-aedc-4681-b927-e5821519d13d/close` → **200**

```json
{
  "command_id": "25c66faf-b418-4055-ba40-c1cef5e57659",
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
  "session_id": "a86ba4f4-5a8f-4a75-9fee-4ed5e74dc8b0",
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
  "last_heartbeat_at": "2026-10-28T09:21:12.157821Z",
  "last_location_at": "2026-10-28T09:21:12.157821Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a86ba4f4-5a8f-4a75-9fee-4ed5e74dc8b0/close` → **200**

```json
{
  "command_id": "47c36187-70ca-4802-b1dc-af86a9193044",
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

Done: terminal order 0dcc29da-c989-47a6-bb30-8c1e80dae83c by Andrii (5a000000-0000-4000-8000-000000000403).
