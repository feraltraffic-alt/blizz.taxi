# Sandbox transcript (2026-10-28T16:35:24Z, ab9a75e)

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
  "correlation_id": "46a639f1-b0ab-4dd6-9381-cd411552c172"
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
  "session_id": "c02da47b-dfdb-4090-9a87-ebdbc303cb9c",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyMzMsImlhdCI6MTc5MzIwNTMzMywianRpIjoiNmNjYjFhOGYtYTc0Zi00MjJiLTllNTAtNzhiMzhmZTM5MmMzIiwic2lkIjoiYzAyZGE0N2ItZGZkYi00MDkwLTlhODctZWJkYmMzMDNjYjljIn0.1dZWyWSHAKsLWpqPH9sgjxyfzwpAdMyBwgjTgDo8f3g",
  "access_expires_at": "2026-10-28T16:50:33.643364666Z",
  "refresh_token": "qt5yqDTzYIXTsERHWpwlAvfzAd8F4qy-IUNyo-xN-6g",
  "refresh_expires_at": "2026-10-29T04:35:33.64148097Z",
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
  "session_id": "f043da56-ee66-46b4-ab81-a8d3cdf4914b",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyMzUsImlhdCI6MTc5MzIwNTMzNSwianRpIjoiODExNzg1ZmYtNmYxMS00MzE4LTlkZDktY2VhYjQ3NGJjZTZjIiwic2lkIjoiZjA0M2RhNTYtZWU2Ni00NmI0LWFiODEtYThkM2NkZjQ5MTRiIn0.8TXh8GeuRKXslq1DtXONFMvNtjKDQMXreLmtQccUB00",
  "access_expires_at": "2026-10-28T16:50:35.091412414Z",
  "refresh_token": "pjOeLhR3sQ9YdXxCFu81oEk11tzZVLrMQMoCa9JuHL4",
  "refresh_expires_at": "2026-10-29T04:35:35.090453424Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "3a895dfb-2bce-4bd2-bb3f-15b06673877f",
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
  "id": "962d45df-10fd-4916-84b2-159ef696c511",
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
  "created_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "created_at": "2026-10-28T16:35:35.377221Z",
  "updated_at": "2026-10-28T16:35:35.377221Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633898306",
  "device_ref": "sandbox-6336"
}
```

```json
{
  "challenge_id": "1a858c73-694f-4995-918f-bb548198b1ce",
  "expires_at": "2026-10-28T16:40:35.653800672Z",
  "resend_available_at": "2026-10-28T16:35:36.653800672Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633898306` → **200**

```json
{
  "phone": "+380633898306",
  "audience": "CLIENT",
  "code": "078814",
  "sent_at": "2026-10-28T16:35:35.663540764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a858c73-694f-4995-918f-bb548198b1ce",
  "code": "078814",
  "device_ref": "sandbox-6336"
}
```

```json
{
  "session_id": "bc06a3c2-07fd-46e2-a9fe-e2d026bfe1ad",
  "subject": {
    "type": "CLIENT",
    "id": "c1faff0c-4a67-4a51-81dd-c6b35d31bad5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWZhZmYwYy00YTY3LTRhNTEtODFkZC1jNmIzNWQzMWJhZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjM1LCJpYXQiOjE3OTMyMDUzMzUsImp0aSI6ImIyMDlhNGIzLWYwODQtNGVjOC05OTI5LTZiMzVkNTM5MWUzOSIsInNpZCI6ImJjMDZhM2MyLTA3ZmQtNDZlMi1hOWZlLWUyZDAyNmJmZTFhZCJ9.WWKUVxMxDV3vGtvR_Z4XZ11XyQL8SjG9_5ss4q78BgE",
  "access_expires_at": "2026-10-28T16:50:35.959580269Z",
  "refresh_token": "Enh_DX7OzmnBKtJHNE5IdPBT-D-bNScPdBF9M3hcYLA",
  "refresh_expires_at": "2026-11-27T16:35:35.958572148Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633898306` → **200**

```json
{
  "client_id": "c1faff0c-4a67-4a51-81dd-c6b35d31bad5"
}
```

`POST /api/admin/v1/rider-wallets/c1faff0c-4a67-4a51-81dd-c6b35d31bad5/top-ups` → **201**

```json
{
  "command_id": "5d60b927-618c-4931-a83c-0b8ad02ba2c8",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "c1faff0c-4a67-4a51-81dd-c6b35d31bad5",
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
      "id": "7d8ed75f-0da8-458d-bd47-5ecd7b85d19c",
      "at": "2026-10-28T16:35:36.478538Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dcfa1af5-7180-4aeb-a21f-6caf26349eb3",
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
  "id": "94b63176-6a0c-4f8a-89c9-6df0d396d3bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:36.811313Z",
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
      "id": "962d45df-10fd-4916-84b2-159ef696c511",
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
  "device_ref": "sandbox-6441"
}
```

```json
{
  "challenge_id": "c8581832-0180-4427-bbfe-552152bf9d14",
  "expires_at": "2026-10-28T16:40:37.097829689Z",
  "resend_available_at": "2026-10-28T16:35:38.097829689Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "987264",
  "sent_at": "2026-10-28T16:35:37.102024839Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8581832-0180-4427-bbfe-552152bf9d14",
  "code": "987264",
  "device_ref": "sandbox-6441"
}
```

```json
{
  "session_id": "0ae2e701-57af-44e7-9463-cb0fd2848722",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjIzNywiaWF0IjoxNzkzMjA1MzM3LCJqdGkiOiJkYzk3NTJjMi02YzAxLTRlMTctYjg1My04OWE2NzE2YTA5YjIiLCJzaWQiOiIwYWUyZTcwMS01N2FmLTQ0ZTctOTQ2My1jYjBmZDI4NDg3MjIifQ.-iqlgg1XwPWjk5wht1RzDHChGtGYoLSJOo7myqRaJz0",
  "access_expires_at": "2026-10-28T16:50:37.37817121Z",
  "refresh_token": "MWotCwza__wVXwFP1gS-_Mh_v7DdmvP4WYm6cuyJlf8",
  "refresh_expires_at": "2026-11-27T16:35:37.377210507Z",
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
  "command_id": "73502ee5-8cc9-40c0-87e2-d0458f7caf0c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:37Z",
    "sequence": 1793205337895
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59ab08ee-2d5f-4de4-bf11-6f22c59aa34c",
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
  "last_heartbeat_at": "2026-10-28T16:35:37.939531Z",
  "last_location_at": "2026-10-28T16:35:37.939531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5c6d86c0-7330-4dd4-9b1a-837b37636424",
  "quote_id": "94b63176-6a0c-4f8a-89c9-6df0d396d3bc",
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
  "id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c1faff0c-4a67-4a51-81dd-c6b35d31bad5",
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
  "created_at": "2026-10-28T16:35:38.248535Z",
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
  "client_id": "c1faff0c-4a67-4a51-81dd-c6b35d31bad5",
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
      "id": "7d8ed75f-0da8-458d-bd47-5ecd7b85d19c",
      "at": "2026-10-28T16:35:36.478538Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
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
    "id": "9d98a800-04d1-435b-9d66-9e0b413a0b71",
    "order_id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9",
    "expires_at": "2026-10-28T16:35:53.264159Z",
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

`POST /api/driver/v1/offers/9d98a800-04d1-435b-9d66-9e0b413a0b71/accept` → **200**

```json
{
  "command_id": "3f619732-2b7c-4bee-a804-a155825ec22d"
}
```

```json
{
  "id": "a1f2b8e1-1f30-4b6e-831f-0f124a0a4d07",
  "order_id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e802685d-e45a-49f3-ba74-b6126c6c4822",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e802685d-e45a-49f3-ba74-b6126c6c4822",
  "order_id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9",
  "assignment_id": "a1f2b8e1-1f30-4b6e-831f-0f124a0a4d07",
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

`POST /api/driver/v1/work-sessions/59ab08ee-2d5f-4de4-bf11-6f22c59aa34c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:39Z",
    "sequence": 1793205339588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59ab08ee-2d5f-4de4-bf11-6f22c59aa34c",
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
  "last_heartbeat_at": "2026-10-28T16:35:39.610943Z",
  "last_location_at": "2026-10-28T16:35:39.610943Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e802685d-e45a-49f3-ba74-b6126c6c4822/arrive` → **200**

```json
{
  "command_id": "dc44fb9c-7728-46a8-a8ea-dffbf22c3562",
  "expected_version": 0
}
```

```json
{
  "id": "e802685d-e45a-49f3-ba74-b6126c6c4822",
  "order_id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9",
  "assignment_id": "a1f2b8e1-1f30-4b6e-831f-0f124a0a4d07",
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
  "arrived_at": "2026-10-28T16:35:39.875223Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e802685d-e45a-49f3-ba74-b6126c6c4822/start` → **200**

```json
{
  "command_id": "c66b8da7-e6b1-4f4b-8274-1420fb5abead",
  "expected_version": 1
}
```

```json
{
  "id": "e802685d-e45a-49f3-ba74-b6126c6c4822",
  "order_id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9",
  "assignment_id": "a1f2b8e1-1f30-4b6e-831f-0f124a0a4d07",
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
  "arrived_at": "2026-10-28T16:35:39.875223Z",
  "started_at": "2026-10-28T16:35:40.147714Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/e802685d-e45a-49f3-ba74-b6126c6c4822/complete` → **200**

```json
{
  "command_id": "255c3c0f-d390-4134-a515-31d1461c8082",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:35:40Z",
  "cash_received": true
}
```

```json
{
  "id": "e802685d-e45a-49f3-ba74-b6126c6c4822",
  "order_id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9",
  "assignment_id": "a1f2b8e1-1f30-4b6e-831f-0f124a0a4d07",
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
  "arrived_at": "2026-10-28T16:35:39.875223Z",
  "started_at": "2026-10-28T16:35:40.147714Z",
  "completed_at": "2026-10-28T16:35:40.446615Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c1faff0c-4a67-4a51-81dd-c6b35d31bad5",
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
      "id": "a5c37ae8-0c05-473f-948a-ae417047ab98",
      "at": "2026-10-28T16:35:41.357062Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9"
    },
    {
      "id": "7d8ed75f-0da8-458d-bd47-5ecd7b85d19c",
      "at": "2026-10-28T16:35:36.478538Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/962d45df-10fd-4916-84b2-159ef696c511/archive` → **200**

```json
{
  "command_id": "7a18f931-fbdf-40be-bdb7-aa09b37dc792",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "962d45df-10fd-4916-84b2-159ef696c511",
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
  "created_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "created_at": "2026-10-28T16:35:35.377221Z",
  "updated_at": "2026-10-28T16:35:43.988469Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59ab08ee-2d5f-4de4-bf11-6f22c59aa34c",
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
  "last_heartbeat_at": "2026-10-28T16:35:39.610943Z",
  "last_location_at": "2026-10-28T16:35:39.610943Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/59ab08ee-2d5f-4de4-bf11-6f22c59aa34c/close` → **200**

```json
{
  "command_id": "3b7d3f91-c0d2-4bf4-9626-bf5eef9d75b4",
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

Done: order 1dec3d34-2954-46e2-9fd0-dc042e97f6c9.

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
  "session_id": "4c429527-ca48-4c13-bb94-c6ecab22ad8f",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNDUsImlhdCI6MTc5MzIwNTM0NSwianRpIjoiMmJiNGRjMGQtZDNlZi00NmFlLWE0OGItM2JjYTVlY2IyYWY1Iiwic2lkIjoiNGM0Mjk1MjctY2E0OC00YzEzLWJiOTQtYzZlY2FiMjJhZDhmIn0.MoVA-pz_KrV5gbIifsF5_Q9zpKq7nICJyx4_JNqbSjw",
  "access_expires_at": "2026-10-28T16:50:45.039664127Z",
  "refresh_token": "KKcwU9BwciRD9-Dj804GOlYMixpOSw0aKrZBnEX_1SY",
  "refresh_expires_at": "2026-10-29T04:35:45.038766264Z",
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
  "command_id": "e05bd07c-2fb3-4c39-a8dd-e216832af7fa",
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
  "session_id": "38ae43af-1b49-48fd-859e-60271071d7be",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNDYsImlhdCI6MTc5MzIwNTM0NiwianRpIjoiZDFhZmExZDEtZDI0YS00NmJmLWFkOWYtMDlmMjFjOGY4OWE3Iiwic2lkIjoiMzhhZTQzYWYtMWI0OS00OGZkLTg1OWUtNjAyNzEwNzFkN2JlIn0.fFaJuCx61LzUippXKUL1Aod9JeSA9_6MKLHz8R1x4Ps",
  "access_expires_at": "2026-10-28T16:50:46.090872254Z",
  "refresh_token": "g0S01tot2ychl-aRrSJY5axG6qk84Y22isqR_ZP3bxg",
  "refresh_expires_at": "2026-10-29T04:35:46.0901784Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.207707867",
    "linkedid": "1730052700.207707867",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679113662"
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
    "id": "1730052700.207707867",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "e18ac630-60f4-48d9-b4aa-67d98f34e2c2",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.345004Z",
      "answered_at": null,
      "ended_at": "2026-10-28T16:35:46.366018Z",
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
    "id": "1730052600.169888197",
    "linkedid": "1730052600.169888197",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679113662"
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
      "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.654217Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/7ff20a39-0576-420a-a4c9-1df7507db47e/answer` → **200**

```json
{
  "command_id": "55234e19-1d2c-4a98-b655-72692c13c07f"
}
```

```json
{
  "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679113662",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "order_ids": [],
  "started_at": "2026-10-28T16:35:46.654217Z",
  "answered_at": "2026-10-28T16:35:46.940081Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.169888197",
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
    "id": "1730052600.169888197",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.654217Z",
      "answered_at": "2026-10-28T16:35:46.940081Z",
      "ended_at": "2026-10-28T16:35:47.209585Z",
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
      "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.654217Z",
      "answered_at": "2026-10-28T16:35:46.940081Z",
      "ended_at": "2026-10-28T16:35:47.209585Z",
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
      "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.654217Z",
      "answered_at": "2026-10-28T16:35:46.940081Z",
      "ended_at": "2026-10-28T16:35:47.209585Z",
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
      "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.654217Z",
      "answered_at": "2026-10-28T16:35:46.940081Z",
      "ended_at": "2026-10-28T16:35:47.209585Z",
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
      "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.654217Z",
      "answered_at": "2026-10-28T16:35:46.940081Z",
      "ended_at": "2026-10-28T16:35:47.209585Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:35:54.161938Z"
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
      "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.654217Z",
      "answered_at": "2026-10-28T16:35:46.940081Z",
      "ended_at": "2026-10-28T16:35:47.209585Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:35:54.161938Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/7ff20a39-0576-420a-a4c9-1df7507db47e/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/7ff20a39-0576-420a-a4c9-1df7507db47e/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=7ff20a39-0576-420a-a4c9-1df7507db47e` → **200**

```json
{
  "changes": [
    {
      "id": "88d239fc-70b0-4389-92e8-8dddfad6e71a",
      "occurred_at": "2026-10-28T16:35:56.830655Z",
      "actor_type": "STAFF",
      "actor_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"fed04745-1270-4e8f-844e-218cabed8990\", \"order_ids\": []}",
      "correlation_id": "3d3267cd-a89e-442a-be16-beaf8f0045b7"
    },
    {
      "id": "5a591bc3-1d0d-4f8f-a51e-55a1fcfe5e3d",
      "occurred_at": "2026-10-28T16:35:56.802279Z",
      "actor_type": "STAFF",
      "actor_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"fed04745-1270-4e8f-844e-218cabed8990\", \"order_ids\": []}",
      "correlation_id": "df7fe095-49ef-4c3d-a9bf-f6a955a52d2b"
    }
  ]
}
```

Done: call 7ff20a39-0576-420a-a4c9-1df7507db47e recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32478"
}
```

```json
{
  "challenge_id": "a5b469a2-a2da-4dd7-bbfa-8093c6352e8d",
  "expires_at": "2026-10-28T16:40:57.145698883Z",
  "resend_available_at": "2026-10-28T16:35:58.145698883Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "993935",
  "sent_at": "2026-10-28T16:35:57.150513407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5b469a2-a2da-4dd7-bbfa-8093c6352e8d",
  "code": "993935",
  "device_ref": "sandbox-32478"
}
```

```json
{
  "session_id": "5bf78d3b-90c2-4bb8-9f17-efe049584d88",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI1NywiaWF0IjoxNzkzMjA1MzU3LCJqdGkiOiIzYTNmNzhiNS1jMjZjLTRjYzQtOThiOS1lNTllOTdjNjA1MjMiLCJzaWQiOiI1YmY3OGQzYi05MGMyLTRiYjgtOWYxNy1lZmUwNDk1ODRkODgifQ.HZoUCLp8jNCmzhfswtKQQj4estcaHzA-8KTl8U4oAkQ",
  "access_expires_at": "2026-10-28T16:50:57.422978556Z",
  "refresh_token": "kSTxXJcbrqBDFKF8WyJmss-4aIikF7HvpRecVKdY5rQ",
  "refresh_expires_at": "2026-11-27T16:35:57.422278311Z",
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
  "command_id": "e60de9a2-2c6d-4ed3-95c2-1a44cd05c796",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:35:57Z",
    "sequence": 1793205357906
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "598c511a-e99e-4139-ac25-28045cb0665d",
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
  "last_heartbeat_at": "2026-10-28T16:35:57.924315Z",
  "last_location_at": "2026-10-28T16:35:57.924315Z",
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
  "session_id": "a6b548cd-88cd-4663-96d0-8538a5c9d0f3",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNTgsImlhdCI6MTc5MzIwNTM1OCwianRpIjoiNDMwMTJmMWUtODk5MS00NDJmLTgzMWItMTgxYTI0Nzk2ZDdlIiwic2lkIjoiYTZiNTQ4Y2QtODhjZC00NjYzLTk2ZDAtODUzOGE1YzlkMGYzIn0.Xe_FwO3GeRGPMgpRG-o7BqVuO3MLyF0ufuJ5k4GqP5w",
  "access_expires_at": "2026-10-28T16:50:58.454196526Z",
  "refresh_token": "NC4-Vie0yUShalWO6tvWxAzHiH-hB-NZdlmyaK980KI",
  "refresh_expires_at": "2026-10-29T04:35:58.453461672Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "225b99c6-8e5c-4b37-8c24-abe7b8245576",
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
  "id": "3eaa8807-47b9-4455-a544-52bd3fa34fb3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:40:58.709738Z",
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
  "command_id": "a67a4c0a-b328-400c-b0ba-3e30fc1c141c",
  "quote_id": "3eaa8807-47b9-4455-a544-52bd3fa34fb3",
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
    "phone": "+380671829576"
  }
}
```

```json
{
  "id": "47420504-2ace-4425-bd84-39fe5e68ccac",
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
  "created_at": "2026-10-28T16:35:58.991324Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671829576"
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
    "id": "a1e02283-56ff-42d5-809d-39f596ee90c0",
    "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
    "expires_at": "2026-10-28T16:36:13.99712Z",
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

`POST /api/driver/v1/offers/a1e02283-56ff-42d5-809d-39f596ee90c0/accept` → **200**

```json
{
  "command_id": "f30b831d-a50a-4a48-9e5d-dcfabe95009f"
}
```

```json
{
  "id": "4af70434-eabd-4011-91b9-5423a1810aa0",
  "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "45184dad-2251-47d9-ae05-18f146b917f1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[
  {
    "phone": "+380671829576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:01.318337907Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[
  {
    "phone": "+380671829576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:01.318337907Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[
  {
    "phone": "+380671829576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:01.318337907Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "45184dad-2251-47d9-ae05-18f146b917f1",
  "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
  "assignment_id": "4af70434-eabd-4011-91b9-5423a1810aa0",
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
    "phone": "+380671829576"
  }
}
```

`POST /api/driver/v1/work-sessions/598c511a-e99e-4139-ac25-28045cb0665d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:02Z",
    "sequence": 1793205362117
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "598c511a-e99e-4139-ac25-28045cb0665d",
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
  "last_heartbeat_at": "2026-10-28T16:36:02.134463Z",
  "last_location_at": "2026-10-28T16:36:02.134463Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/45184dad-2251-47d9-ae05-18f146b917f1/arrive` → **200**

```json
{
  "command_id": "5cd238b8-e13f-499a-a1ad-677742828a99",
  "expected_version": 0
}
```

```json
{
  "id": "45184dad-2251-47d9-ae05-18f146b917f1",
  "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
  "assignment_id": "4af70434-eabd-4011-91b9-5423a1810aa0",
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
  "arrived_at": "2026-10-28T16:36:02.385184Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671829576"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[
  {
    "phone": "+380671829576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:01.318337907Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[
  {
    "phone": "+380671829576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:01.318337907Z"
  },
  {
    "phone": "+380671829576",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:03.326927605Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[
  {
    "phone": "+380671829576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:01.318337907Z"
  },
  {
    "phone": "+380671829576",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:03.326927605Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671829576` → **200**

```json
[
  {
    "phone": "+380671829576",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:01.318337907Z"
  },
  {
    "phone": "+380671829576",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T16:36:03.326927605Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/45184dad-2251-47d9-ae05-18f146b917f1/start` → **200**

```json
{
  "command_id": "6b1fb566-65b8-4edc-ac59-fad2a5e2a3a5",
  "expected_version": 1
}
```

```json
{
  "id": "45184dad-2251-47d9-ae05-18f146b917f1",
  "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
  "assignment_id": "4af70434-eabd-4011-91b9-5423a1810aa0",
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
  "arrived_at": "2026-10-28T16:36:02.385184Z",
  "started_at": "2026-10-28T16:36:03.728763Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671829576"
  }
}
```

`POST /api/driver/v1/trips/45184dad-2251-47d9-ae05-18f146b917f1/complete` → **200**

```json
{
  "command_id": "7831e74e-63a0-4831-8768-07b6a1623bca",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:36:03Z",
  "cash_received": true
}
```

```json
{
  "id": "45184dad-2251-47d9-ae05-18f146b917f1",
  "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
  "assignment_id": "4af70434-eabd-4011-91b9-5423a1810aa0",
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
  "arrived_at": "2026-10-28T16:36:02.385184Z",
  "started_at": "2026-10-28T16:36:03.728763Z",
  "completed_at": "2026-10-28T16:36:03.990388Z",
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
  "session_id": "598c511a-e99e-4139-ac25-28045cb0665d",
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
  "last_heartbeat_at": "2026-10-28T16:36:02.134463Z",
  "last_location_at": "2026-10-28T16:36:02.134463Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/598c511a-e99e-4139-ac25-28045cb0665d/close` → **200**

```json
{
  "command_id": "62343513-7e69-4d9f-8d42-74a58b0ccad7",
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
  "phone": "+380634926930",
  "device_ref": "sandbox-18821"
}
```

```json
{
  "challenge_id": "b5367921-5296-4e62-b325-238b21a39542",
  "expires_at": "2026-10-28T16:41:04.76856163Z",
  "resend_available_at": "2026-10-28T16:36:05.76856163Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634926930` → **200**

```json
{
  "phone": "+380634926930",
  "audience": "CLIENT",
  "code": "593169",
  "sent_at": "2026-10-28T16:36:04.77219733Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5367921-5296-4e62-b325-238b21a39542",
  "code": "593169",
  "device_ref": "sandbox-18821"
}
```

```json
{
  "session_id": "a4be2dcb-f979-4529-9492-4012bf065117",
  "subject": {
    "type": "CLIENT",
    "id": "38a073bd-5093-4771-ba6d-f25b64bc2744"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGEwNzNiZC01MDkzLTQ3NzEtYmE2ZC1mMjViNjRiYzI3NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjY1LCJpYXQiOjE3OTMyMDUzNjUsImp0aSI6ImU5MDVkY2YwLTM2MTYtNDVkOC1hZGFkLWMxYzA2NDNmNjFiNyIsInNpZCI6ImE0YmUyZGNiLWY5NzktNDUyOS05NDkyLTQwMTJiZjA2NTExNyJ9.mtigfC5UnhuOMcHXWD5z3_omW0o6fIcKfFTNbUkDtf0",
  "access_expires_at": "2026-10-28T16:51:05.03656374Z",
  "refresh_token": "KMS0ia4ouKCmIn76DKRwmVglSh6jTGsJpL-JzNXa9mQ",
  "refresh_expires_at": "2026-11-27T16:36:05.03581792Z",
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
  "device_ref": "sandbox-10991"
}
```

```json
{
  "challenge_id": "eaba5818-55df-4aa9-988c-00326e395c11",
  "expires_at": "2026-10-28T16:41:05.535546761Z",
  "resend_available_at": "2026-10-28T16:36:06.535546761Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "714419",
  "sent_at": "2026-10-28T16:36:05.538932341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eaba5818-55df-4aa9-988c-00326e395c11",
  "code": "714419",
  "device_ref": "sandbox-10991"
}
```

```json
{
  "session_id": "166f6021-e0e6-46d2-a7cc-95774d948457",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI2NSwiaWF0IjoxNzkzMjA1MzY1LCJqdGkiOiI2Yjk1NzlhNy1mYTJmLTQ4NzItOWU4YS05OTRmYWQ1Mjc4OGIiLCJzaWQiOiIxNjZmNjAyMS1lMGU2LTQ2ZDItYTdjYy05NTc3NGQ5NDg0NTcifQ.H0stTcU0Jtgg_Q-FE64B2jfi7XjdTja7s-Xaip005qA",
  "access_expires_at": "2026-10-28T16:51:05.801003647Z",
  "refresh_token": "Dncr5McE9XJHqzTUINc_8Z-aeHYn8Ccx13WKRHODNqo",
  "refresh_expires_at": "2026-11-27T16:36:05.800415075Z",
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
  "session_id": "f807da6d-0d89-409c-afc8-2651df8f0155",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNjYsImlhdCI6MTc5MzIwNTM2NiwianRpIjoiMzQ2YjZhYzgtOWQxYi00ODUyLTkwZTctZDQyZGE0M2YxYWMxIiwic2lkIjoiZjgwN2RhNmQtMGQ4OS00MDljLWFmYzgtMjY1MWRmOGYwMTU1In0.3i87IO0nZHqugUfp5EjgozYxkKC0_Sog_47V1mlmpkw",
  "access_expires_at": "2026-10-28T16:51:06.55940259Z",
  "refresh_token": "uRNSvjYcBnB0kcuenUT2bbgkG2ddOqnX7b2ZD5IQ1LE",
  "refresh_expires_at": "2026-10-29T04:36:06.558827733Z",
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
  "session_id": "e88da65a-f66d-4fbf-ad30-8d5a46345ac9",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyNjcsImlhdCI6MTc5MzIwNTM2NywianRpIjoiMDJkOTZkNmItNWZhNS00YjY2LWJlNmMtMzcxOTdmNmIzNzlhIiwic2lkIjoiZTg4ZGE2NWEtZjY2ZC00ZmJmLWFkMzAtOGQ1YTQ2MzQ1YWM5In0.UzUQcCiNMMLhtMqLT809QVChWPMTxUSE_5l1KMlQ-OY",
  "access_expires_at": "2026-10-28T16:51:07.088447104Z",
  "refresh_token": "PJgGvOd5uTO_U1sGB-VeY2sp_Px4dEfftASH86NYsDg",
  "refresh_expires_at": "2026-10-29T04:36:07.087891461Z",
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
  "command_id": "09e613ac-5428-4112-b39e-b0ef82c5892d",
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
  "id": "cb82d5bc-7849-4a73-a414-c541e4092756",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:07.611438Z",
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
  "command_id": "b2fb0115-9f83-4932-8476-2221d29421a2",
  "quote_id": "cb82d5bc-7849-4a73-a414-c541e4092756",
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
  "id": "87825341-6f8e-41c6-afc1-74abfed40a14",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38a073bd-5093-4771-ba6d-f25b64bc2744",
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
  "created_at": "2026-10-28T16:36:07.872506Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/87825341-6f8e-41c6-afc1-74abfed40a14` → **200**

```json
{
  "id": "87825341-6f8e-41c6-afc1-74abfed40a14",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38a073bd-5093-4771-ba6d-f25b64bc2744",
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
  "created_at": "2026-10-28T16:36:07.872506Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/87825341-6f8e-41c6-afc1-74abfed40a14/cancel` → **200**

```json
{
  "command_id": "bf32ac87-3459-4512-93d9-176159be16be",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "87825341-6f8e-41c6-afc1-74abfed40a14",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "38a073bd-5093-4771-ba6d-f25b64bc2744",
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
  "created_at": "2026-10-28T16:36:07.872506Z",
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
  "command_id": "c7155624-7f2a-4907-99db-93b4bb4b53ff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:08Z",
    "sequence": 1793205368958
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6bd06c4b-5bff-4744-9378-65e42c35e847",
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
  "last_heartbeat_at": "2026-10-28T16:36:08.97488Z",
  "last_location_at": "2026-10-28T16:36:08.97488Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16330"
}
```

```json
{
  "challenge_id": "f1a366f6-7ffe-426d-9e82-ce1dc3bd9a6e",
  "expires_at": "2026-10-28T16:41:09.234257773Z",
  "resend_available_at": "2026-10-28T16:36:10.234257773Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "281820",
  "sent_at": "2026-10-28T16:36:09.237207732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1a366f6-7ffe-426d-9e82-ce1dc3bd9a6e",
  "code": "281820",
  "device_ref": "sandbox-16330"
}
```

```json
{
  "session_id": "b1f0a362-f8a2-4e7f-8f12-39913030a0b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI2OSwiaWF0IjoxNzkzMjA1MzY5LCJqdGkiOiJjMjAzMGI2My1hMjM3LTQwZGQtODYyMi01NmQ2ZWExOTJkNzgiLCJzaWQiOiJiMWYwYTM2Mi1mOGEyLTRlN2YtOGYxMi0zOTkxMzAzMGEwYjIifQ.if9BWtaRayKT2V3VVnwBByaEOCHe3rl1rSsSpJWHMyA",
  "access_expires_at": "2026-10-28T16:51:09.514092502Z",
  "refresh_token": "0GSe0E603dQsM1uyZ4pUY60IKawEKQZVfJ_cKYnvSLk",
  "refresh_expires_at": "2026-11-27T16:36:09.513376863Z",
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
  "command_id": "6078dc31-b39f-45e0-ba1e-5b5aa1b53db8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:09Z",
    "sequence": 1793205369986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39f911b-b1ab-4b72-aeba-840fe2e849b1",
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
  "last_heartbeat_at": "2026-10-28T16:36:10.002695Z",
  "last_location_at": "2026-10-28T16:36:10.002695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d443888-9464-40fa-8add-0090e5bce4ca",
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
  "id": "c31b5bb7-2146-4724-8962-1c0bcdbcbf73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:10.258676Z",
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
  "command_id": "5afed8cd-d119-40a6-9314-2b44e97c4828",
  "quote_id": "c31b5bb7-2146-4724-8962-1c0bcdbcbf73",
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
  "id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38a073bd-5093-4771-ba6d-f25b64bc2744",
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
  "created_at": "2026-10-28T16:36:10.531391Z",
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
    "id": "36d85ce6-28bd-487c-b7cc-ce3c3deaa928",
    "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
    "expires_at": "2026-10-28T16:36:25.535449Z",
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

`POST /api/driver/v1/offers/36d85ce6-28bd-487c-b7cc-ce3c3deaa928/accept` → **200**

```json
{
  "command_id": "0babbd93-b8a3-43b4-81b1-48793005df7f"
}
```

```json
{
  "id": "aee85c58-81b2-446d-bcf3-b0105e597b4c",
  "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "91722e98-7a81-4433-9f72-79949cbf2b3d",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "91722e98-7a81-4433-9f72-79949cbf2b3d",
  "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
  "assignment_id": "aee85c58-81b2-446d-bcf3-b0105e597b4c",
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

`POST /api/driver/v1/trips/91722e98-7a81-4433-9f72-79949cbf2b3d/cancel` → **200**

```json
{
  "command_id": "b255246a-7c36-4180-8298-9d3e500a434f",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "91722e98-7a81-4433-9f72-79949cbf2b3d",
  "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
  "assignment_id": "aee85c58-81b2-446d-bcf3-b0105e597b4c",
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

`GET /api/rider/v1/orders/6efb43e5-e361-47cc-9fbe-7e55fac3f70f` → **200**

```json
{
  "id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "38a073bd-5093-4771-ba6d-f25b64bc2744",
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
    "id": "aee85c58-81b2-446d-bcf3-b0105e597b4c",
    "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "91722e98-7a81-4433-9f72-79949cbf2b3d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:36:10.531391Z",
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
    "id": "ca8c3bf8-4b8e-4494-a6d8-1a8920eec32d",
    "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
    "expires_at": "2026-10-28T16:36:26.591062Z",
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

`POST /api/driver/v1/offers/ca8c3bf8-4b8e-4494-a6d8-1a8920eec32d/accept` → **200**

```json
{
  "command_id": "b2247e8a-5e2c-4fa7-8786-c48757d6370b"
}
```

```json
{
  "id": "2983ef4a-03f7-4686-b0c5-47ca9166be2a",
  "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9de9482a-73c0-49c4-96c0-e9da27d0bbae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9de9482a-73c0-49c4-96c0-e9da27d0bbae",
  "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
  "assignment_id": "2983ef4a-03f7-4686-b0c5-47ca9166be2a",
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

`POST /api/driver/v1/trips/9de9482a-73c0-49c4-96c0-e9da27d0bbae/cancel` → **200**

```json
{
  "command_id": "f0630607-f117-487b-be48-7fe080015d58",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "9de9482a-73c0-49c4-96c0-e9da27d0bbae",
  "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
  "assignment_id": "2983ef4a-03f7-4686-b0c5-47ca9166be2a",
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
    "id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:36:10.531391Z",
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
    "id": "87825341-6f8e-41c6-afc1-74abfed40a14",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:36:07.872506Z",
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

`GET /api/operator/v1/orders/6efb43e5-e361-47cc-9fbe-7e55fac3f70f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:36:10.532068Z",
      "actor": {
        "type": "CLIENT",
        "id": "38a073bd-5093-4771-ba6d-f25b64bc2744",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
        "quote_id": "c31b5bb7-2146-4724-8962-1c0bcdbcbf73",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "9b59014f-4ace-43e3-9a18-7cc3f8d6e61d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:36:10.534426Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
        "attempt_id": "d7d5c4a7-7f52-4dd2-b522-210bb8017ac6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9b59014f-4ace-43e3-9a18-7cc3f8d6e61d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:36:10.541736Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "36d85ce6-28bd-487c-b7cc-ce3c3deaa928",
        "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "9b59014f-4ace-43e3-9a18-7cc3f8d6e61d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:36:11.051674Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "36d85ce6-28bd-487c-b7cc-ce3c3deaa928",
        "order_id": "6efb43e5-e361-47cc-9fbe-7e55fac3f70f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "aee85c58-81b2-446d-bcf3-b0105e597b4c"
      },
      "correlation_id": "3dc34492-bf20-4dde-b7e0-20364f684bc3"
```

Done: orders 87825341-6f8e-41c6-afc1-74abfed40a14, 6efb43e5-e361-47cc-9fbe-7e55fac3f70f.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737235713",
  "device_ref": "sandbox-23685"
}
```

```json
{
  "challenge_id": "b6fbaabe-4219-429b-a40a-0992372d5858",
  "expires_at": "2026-10-28T16:41:13.664329292Z",
  "resend_available_at": "2026-10-28T16:36:14.664329292Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737235713` → **200**

```json
{
  "phone": "+380737235713",
  "audience": "CLIENT",
  "code": "250438",
  "sent_at": "2026-10-28T16:36:13.667233819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6fbaabe-4219-429b-a40a-0992372d5858",
  "code": "250438",
  "device_ref": "sandbox-23685"
}
```

```json
{
  "session_id": "94005436-ebd2-43f1-a795-168e4139da63",
  "subject": {
    "type": "CLIENT",
    "id": "12dd152f-05fe-4aec-8a52-c1e5dac11351"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMmRkMTUyZi0wNWZlLTRhZWMtOGE1Mi1jMWU1ZGFjMTEzNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjczLCJpYXQiOjE3OTMyMDUzNzMsImp0aSI6IjYwNWU1YWE1LTFjNjctNDdmOS1hY2FkLTBhNjAyYWFjMTMwMyIsInNpZCI6Ijk0MDA1NDM2LWViZDItNDNmMS1hNzk1LTE2OGU0MTM5ZGE2MyJ9.DAXeIhf2WohJbIIG7UUDtPb0R1nDd24PiGhfQ_phpNM",
  "access_expires_at": "2026-10-28T16:51:13.925349691Z",
  "refresh_token": "A986qHuG82gmp4JvAv4APk1nZ1ZvhAC2eumMSqiriTk",
  "refresh_expires_at": "2026-11-27T16:36:13.924762856Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "af6ac146-e87c-4027-9e24-1a30e03938df",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a4a34d59-103d-4d6d-9c84-ac8ac553d28f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a4a34d59-103d-4d6d-9c84-ac8ac553d28f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "17ca965627cf5a96ba2340493a7d6a88",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a4a34d59-103d-4d6d-9c84-ac8ac553d28f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737235713"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a4a34d59-103d-4d6d-9c84-ac8ac553d28f",
  "expires_at": "2026-10-28T17:06:14.180366Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/a4a34d59-103d-4d6d-9c84-ac8ac553d28f` → **200**

```json
{
  "id": "a4a34d59-103d-4d6d-9c84-ac8ac553d28f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T17:06:14.180366Z",
  "card": {
    "id": "9df5f5ba-2685-4030-9b61-9d3d9e47a857",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9013",
    "card_type": "Visa",
    "created_at": "2026-10-28T16:36:14.445023Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "9df5f5ba-2685-4030-9b61-9d3d9e47a857",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9013",
      "card_type": "Visa",
      "created_at": "2026-10-28T16:36:14.445023Z"
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
  "device_ref": "sandbox-24263"
}
```

```json
{
  "challenge_id": "e130a70b-1a3a-4613-a570-71e22a778ccb",
  "expires_at": "2026-10-28T16:41:14.961877464Z",
  "resend_available_at": "2026-10-28T16:36:15.961877464Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "327643",
  "sent_at": "2026-10-28T16:36:14.965210915Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e130a70b-1a3a-4613-a570-71e22a778ccb",
  "code": "327643",
  "device_ref": "sandbox-24263"
}
```

```json
{
  "session_id": "5ff07fa8-069f-47a4-b135-caaa28baea98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI3NSwiaWF0IjoxNzkzMjA1Mzc1LCJqdGkiOiIyNTM4ZWI0Ny0yNjhjLTRlM2YtOGY4OS02ZjViN2IyNzY5MGUiLCJzaWQiOiI1ZmYwN2ZhOC0wNjlmLTQ3YTQtYjEzNS1jYWFhMjhiYWVhOTgifQ.atrtZTgcjYW0nUhw5ZSShZET1j8GTuvQD1wvunCYN9g",
  "access_expires_at": "2026-10-28T16:51:15.230301096Z",
  "refresh_token": "auGLOfRCng0Bfk1Z4uXjV3SnH-KV9apHPVwrYmWyKr8",
  "refresh_expires_at": "2026-11-27T16:36:15.229571659Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39f911b-b1ab-4b72-aeba-840fe2e849b1",
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
  "last_heartbeat_at": "2026-10-28T16:36:10.002695Z",
  "last_location_at": "2026-10-28T16:36:10.002695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c39f911b-b1ab-4b72-aeba-840fe2e849b1/handover` → **200**

```json
{
  "command_id": "25d52652-25a6-4d67-a493-9746d071b482",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39f911b-b1ab-4b72-aeba-840fe2e849b1",
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
  "last_heartbeat_at": "2026-10-28T16:36:10.002695Z",
  "last_location_at": "2026-10-28T16:36:10.002695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c39f911b-b1ab-4b72-aeba-840fe2e849b1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:15Z",
    "sequence": 1793205375983
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39f911b-b1ab-4b72-aeba-840fe2e849b1",
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
  "last_heartbeat_at": "2026-10-28T16:36:15.999977Z",
  "last_location_at": "2026-10-28T16:36:15.999977Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8241998-5196-481c-b847-8ce407e7eacc",
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
  "id": "6a4385b2-14fe-4523-9a3c-e83b0402bfc9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:16.263398Z",
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
  "command_id": "263ca438-f542-4722-b832-c2041342d038",
  "quote_id": "6a4385b2-14fe-4523-9a3c-e83b0402bfc9",
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
  "id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
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
  "created_at": "2026-10-28T16:36:16.529569Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6aae30b0-9358-404f-8afb-0d0123ac8dce` → **200**

```json
{
  "id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
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
  "created_at": "2026-10-28T16:36:16.529569Z",
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
    "id": "aecffe7b-3959-45f5-838f-ea5c5051b4b8",
    "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
    "expires_at": "2026-10-28T16:36:31.595066Z",
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

`POST /api/driver/v1/offers/aecffe7b-3959-45f5-838f-ea5c5051b4b8/accept` → **200**

```json
{
  "command_id": "4e7373c4-3d9a-4524-a32b-07ddddf3fef1"
}
```

```json
{
  "id": "33872911-7d7e-4624-9bde-9df4b04d8e9a",
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7648e51b-c746-4564-8faf-8cab077716de",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7648e51b-c746-4564-8faf-8cab077716de",
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "assignment_id": "33872911-7d7e-4624-9bde-9df4b04d8e9a",
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

`POST /api/driver/v1/work-sessions/c39f911b-b1ab-4b72-aeba-840fe2e849b1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:17Z",
    "sequence": 1793205377823
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39f911b-b1ab-4b72-aeba-840fe2e849b1",
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
  "last_heartbeat_at": "2026-10-28T16:36:17.838751Z",
  "last_location_at": "2026-10-28T16:36:17.838751Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7648e51b-c746-4564-8faf-8cab077716de/arrive` → **200**

```json
{
  "command_id": "eb43765d-bcb4-4e5f-bc14-fb743b3c3aa0",
  "expected_version": 0
}
```

```json
{
  "id": "7648e51b-c746-4564-8faf-8cab077716de",
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "assignment_id": "33872911-7d7e-4624-9bde-9df4b04d8e9a",
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
  "arrived_at": "2026-10-28T16:36:18.093942Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7648e51b-c746-4564-8faf-8cab077716de/start` → **200**

```json
{
  "command_id": "cca9e9e2-6700-49b2-80fc-ff3c75ca7214",
  "expected_version": 1
}
```

```json
{
  "id": "7648e51b-c746-4564-8faf-8cab077716de",
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "assignment_id": "33872911-7d7e-4624-9bde-9df4b04d8e9a",
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
  "arrived_at": "2026-10-28T16:36:18.093942Z",
  "started_at": "2026-10-28T16:36:18.360837Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7648e51b-c746-4564-8faf-8cab077716de/complete` → **200**

```json
{
  "command_id": "fe30ed95-8541-49f7-b929-d6251a163ed2",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:36:18Z",
  "cash_received": true
}
```

```json
{
  "id": "7648e51b-c746-4564-8faf-8cab077716de",
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "assignment_id": "33872911-7d7e-4624-9bde-9df4b04d8e9a",
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
  "arrived_at": "2026-10-28T16:36:18.093942Z",
  "started_at": "2026-10-28T16:36:18.360837Z",
  "completed_at": "2026-10-28T16:36:18.631131Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/6aae30b0-9358-404f-8afb-0d0123ac8dce` → **200**

```json
{
  "id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
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
    "id": "33872911-7d7e-4624-9bde-9df4b04d8e9a",
    "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7648e51b-c746-4564-8faf-8cab077716de",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:36:16.529569Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6aae30b0-9358-404f-8afb-0d0123ac8dce` → **200**

```json
{
  "id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
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
    "id": "33872911-7d7e-4624-9bde-9df4b04d8e9a",
    "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7648e51b-c746-4564-8faf-8cab077716de",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:36:16.529569Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6aae30b0-9358-404f-8afb-0d0123ac8dce` → **200**

```json
{
  "id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
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
    "id": "33872911-7d7e-4624-9bde-9df4b04d8e9a",
    "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7648e51b-c746-4564-8faf-8cab077716de",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:36:16.529569Z",
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

`GET /api/rider/v1/orders/6aae30b0-9358-404f-8afb-0d0123ac8dce/tip` → **200**

```json
{
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
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
  "available_until": "2026-10-29T16:36:18.631131Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6aae30b0-9358-404f-8afb-0d0123ac8dce/tip` → **201**

```json
{
  "command_id": "1dd721d3-c665-4957-8820-d86d9943c040",
  "amount_minor": 2500
}
```

```json
{
  "id": "328afd4f-c701-4c27-8ba8-7d0281c88beb",
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T16:36:22.198849Z"
}
```

`GET /api/rider/v1/orders/6aae30b0-9358-404f-8afb-0d0123ac8dce/tip` → **200**

```json
{
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
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
  "available_until": "2026-10-29T16:36:18.631131Z",
  "open": false,
  "tip": {
    "id": "328afd4f-c701-4c27-8ba8-7d0281c88beb",
    "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T16:36:22.198849Z"
  }
}
```

`GET /api/rider/v1/orders/6aae30b0-9358-404f-8afb-0d0123ac8dce/tip` → **200**

```json
{
  "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
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
  "available_until": "2026-10-29T16:36:18.631131Z",
  "open": false,
  "tip": {
    "id": "328afd4f-c701-4c27-8ba8-7d0281c88beb",
    "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T16:36:22.198849Z"
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
      "id": "8d6e0301-1b96-416a-a75f-8b62e4eb2db2",
      "at": "2026-10-28T16:36:23.708965Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
      "counterpart_id": null
    },
    {
      "id": "8e4514c6-487d-4d86-bf81-e2749498c025",
      "at": "2026-10-28T16:36:19.653722Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7aecfdb8-008e-4eb5-996e-77c53cbdaee3",
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
  "id": "5772efe1-5420-428a-adca-4f21650e43d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:24.230662Z",
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
  "session_id": "096cc01d-2fb6-4ff6-8088-b95228361835",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyODQsImlhdCI6MTc5MzIwNTM4NCwianRpIjoiNjhmYmQxNDAtMDYyOC00MDE1LThjODgtYmM4ZDk5MDQ4ODM1Iiwic2lkIjoiMDk2Y2MwMWQtMmZiNi00ZmY2LTgwODgtYjk1MjI4MzYxODM1In0.wQNVE94JGdAo9okYI0QCLIUi50LLWZiwpNvUtt1MtUg",
  "access_expires_at": "2026-10-28T16:51:24.776276195Z",
  "refresh_token": "62LBS8suSKI0lcEQLglkqzdPE90fjPGacDUabjDyTEY",
  "refresh_expires_at": "2026-10-29T04:36:24.775654285Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737235713` → **200**

```json
{
  "client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351"
}
```

`POST /api/admin/v1/rider-wallets/12dd152f-05fe-4aec-8a52-c1e5dac11351/top-ups` → **201**

```json
{
  "command_id": "18f8617f-c754-4fdc-aa6e-7c49bdcfb8a7",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
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
      "id": "ab265376-0f1f-413f-81d9-c85ed9d8fc10",
      "at": "2026-10-28T16:36:25.282833Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2ccf0c36-b29f-4cd0-8326-1bed49c91c11",
  "quote_id": "5772efe1-5420-428a-adca-4f21650e43d3",
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
  "id": "af53ae58-870f-4a34-9620-6e18419410e3",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
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
  "created_at": "2026-10-28T16:36:25.546368Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/af53ae58-870f-4a34-9620-6e18419410e3` → **200**

```json
{
  "id": "af53ae58-870f-4a34-9620-6e18419410e3",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
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
  "created_at": "2026-10-28T16:36:25.546368Z",
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
    "id": "1116e7d1-18f7-4a49-9c78-69423b1d7810",
    "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
    "expires_at": "2026-10-28T16:36:40.55052Z",
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

`POST /api/driver/v1/offers/1116e7d1-18f7-4a49-9c78-69423b1d7810/accept` → **200**

```json
{
  "command_id": "59de4b61-3028-453c-9db8-4925750dde37"
}
```

```json
{
  "id": "cb2fd5fa-beec-4983-a544-1a4ff7e87586",
  "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "215cb3e4-4d78-4dd1-a314-dae3e3039add",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "215cb3e4-4d78-4dd1-a314-dae3e3039add",
  "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
  "assignment_id": "cb2fd5fa-beec-4983-a544-1a4ff7e87586",
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

`POST /api/driver/v1/work-sessions/c39f911b-b1ab-4b72-aeba-840fe2e849b1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:36:26Z",
    "sequence": 1793205386842
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39f911b-b1ab-4b72-aeba-840fe2e849b1",
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
  "last_heartbeat_at": "2026-10-28T16:36:26.858552Z",
  "last_location_at": "2026-10-28T16:36:26.858552Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/215cb3e4-4d78-4dd1-a314-dae3e3039add/arrive` → **200**

```json
{
  "command_id": "10860d3a-2d60-47af-9382-33e5d2546dfa",
  "expected_version": 0
}
```

```json
{
  "id": "215cb3e4-4d78-4dd1-a314-dae3e3039add",
  "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
  "assignment_id": "cb2fd5fa-beec-4983-a544-1a4ff7e87586",
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
  "arrived_at": "2026-10-28T16:36:27.116129Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/215cb3e4-4d78-4dd1-a314-dae3e3039add/start` → **200**

```json
{
  "command_id": "c2be3c20-2f4d-42ee-b8c3-fc66d48cab98",
  "expected_version": 1
}
```

```json
{
  "id": "215cb3e4-4d78-4dd1-a314-dae3e3039add",
  "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
  "assignment_id": "cb2fd5fa-beec-4983-a544-1a4ff7e87586",
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
  "arrived_at": "2026-10-28T16:36:27.116129Z",
  "started_at": "2026-10-28T16:36:27.37722Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/215cb3e4-4d78-4dd1-a314-dae3e3039add/complete` → **200**

```json
{
  "command_id": "7e0ad7c2-be11-4118-a7aa-094a00b490e9",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:36:27Z",
  "cash_received": true
}
```

```json
{
  "id": "215cb3e4-4d78-4dd1-a314-dae3e3039add",
  "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
  "assignment_id": "cb2fd5fa-beec-4983-a544-1a4ff7e87586",
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
  "arrived_at": "2026-10-28T16:36:27.116129Z",
  "started_at": "2026-10-28T16:36:27.37722Z",
  "completed_at": "2026-10-28T16:36:27.649391Z",
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
  "client_id": "12dd152f-05fe-4aec-8a52-c1e5dac11351",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 300,
      "reserved_minor": 0,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "712fbc32-742b-4b32-9c0e-9f1ff71329de",
      "at": "2026-10-28T16:36:27.748337Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "af53ae58-870f-4a34-9620-6e18419410e3"
    },
    {
      "id": "ab265376-0f1f-413f-81d9-c85ed9d8fc10",
      "at": "2026-10-28T16:36:25.282833Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
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
      "balance_minor": 30204,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/af53ae58-870f-4a34-9620-6e18419410e3/tip` → **200**

```json
{
  "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
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
  "available_until": "2026-10-29T16:36:27.649391Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/af53ae58-870f-4a34-9620-6e18419410e3/tip` → **201**

```json
{
  "command_id": "c0f4f4fe-b683-4767-8af0-940c14cc146c",
  "amount_minor": 2500
}
```

```json
{
  "id": "45063c6c-974a-4fcd-8dea-2ee913b4a651",
  "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T16:36:28.676059Z"
}
```

`GET /api/rider/v1/orders/af53ae58-870f-4a34-9620-6e18419410e3/tip` → **200**

```json
{
  "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
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
  "available_until": "2026-10-29T16:36:27.649391Z",
  "open": false,
  "tip": {
    "id": "45063c6c-974a-4fcd-8dea-2ee913b4a651",
    "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T16:36:28.676059Z"
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
      "id": "8a756986-b416-4285-a4c3-39767c8b2dd8",
      "at": "2026-10-28T16:36:27.744435Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
      "counterpart_id": null
    },
    {
      "id": "8d6e0301-1b96-416a-a75f-8b62e4eb2db2",
      "at": "2026-10-28T16:36:23.708965Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
      "counterpart_id": null
    },
    {
      "id": "8e4514c6-487d-4d86-bf81-e2749498c025",
      "at": "2026-10-28T16:36:19.653722Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
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
      "id": "9313c3ee-3641-43ec-944f-fe4e10ed388d",
      "at": "2026-10-28T16:36:29.775377Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
      "counterpart_id": null
    },
    {
      "id": "8a756986-b416-4285-a4c3-39767c8b2dd8",
      "at": "2026-10-28T16:36:27.744435Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "af53ae58-870f-4a34-9620-6e18419410e3",
      "counterpart_id": null
    },
    {
      "id": "8d6e0301-1b96-416a-a75f-8b62e4eb2db2",
      "at": "2026-10-28T16:36:23.708965Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
      "counterpart_id": null
    },
    {
      "id": "8e4514c6-487d-4d86-bf81-e2749498c025",
      "at": "2026-10-28T16:36:19.653722Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "6aae30b0-9358-404f-8afb-0d0123ac8dce",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c39f911b-b1ab-4b72-aeba-840fe2e849b1",
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
  "last_heartbeat_at": "2026-10-28T16:36:26.858552Z",
  "last_location_at": "2026-10-28T16:36:26.858552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c39f911b-b1ab-4b72-aeba-840fe2e849b1/close` → **200**

```json
{
  "command_id": "6662d48a-65bb-4b1c-82d3-4a2d3da2cd68",
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

Done: card order af53ae58-870f-4a34-9620-6e18419410e3.

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
  "phone": "+380734874595",
  "device_ref": "sandbox-15626"
}
```

```json
{
  "challenge_id": "fe9fe762-959d-45ac-959b-7f9ecc0e7b79",
  "expires_at": "2026-10-28T16:41:31.426345524Z",
  "resend_available_at": "2026-10-28T16:36:32.426345524Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734874595` → **200**

```json
{
  "phone": "+380734874595",
  "audience": "CLIENT",
  "code": "615582",
  "sent_at": "2026-10-28T16:36:31.428727444Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe9fe762-959d-45ac-959b-7f9ecc0e7b79",
  "code": "615582",
  "device_ref": "sandbox-15626"
}
```

```json
{
  "session_id": "8467a023-8050-49bc-923e-3e6e555ffece",
  "subject": {
    "type": "CLIENT",
    "id": "3ce0e61d-40dc-4598-8e2f-6db9746a02f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzY2UwZTYxZC00MGRjLTQ1OTgtOGUyZi02ZGI5NzQ2YTAyZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MjkxLCJpYXQiOjE3OTMyMDUzOTEsImp0aSI6IjllMDA5MTk0LTk1MzAtNDQyOC05YjE2LTRiMzk0YTFmZjgxZCIsInNpZCI6Ijg0NjdhMDIzLTgwNTAtNDliYy05MjNlLTNlNmU1NTVmZmVjZSJ9.fitbUeoCIUX0I6FjhUEuBwPX4EUSNCYGrOWVAaZstKM",
  "access_expires_at": "2026-10-28T16:51:31.689192655Z",
  "refresh_token": "OIoE5d-ToT1exfRHfrgwXoE0z6ud0a1gY6XDk_knojU",
  "refresh_expires_at": "2026-11-27T16:36:31.688646129Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "dfc5bc9d-bb3f-4d0d-83db-fa173d50fe2c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "6416d534-dc1a-4542-97ee-190f34d2cf21",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6416d534-dc1a-4542-97ee-190f34d2cf21",
    "orderDate": "1793205391",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "33d15a54153e6f3d64b0dc524725b237",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6416d534-dc1a-4542-97ee-190f34d2cf21",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734874595"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6416d534-dc1a-4542-97ee-190f34d2cf21",
  "created_at": "2026-10-28T16:36:31.935187Z",
  "expires_at": "2026-10-28T17:06:31.935187Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/6416d534-dc1a-4542-97ee-190f34d2cf21` → **200**

```json
{
  "id": "6416d534-dc1a-4542-97ee-190f34d2cf21",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:36:31.935187Z",
  "expires_at": "2026-10-28T17:06:31.935187Z",
  "completed_at": "2026-10-28T16:36:32.197595Z",
  "masked_pan": "41****7491",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3ce0e61d-40dc-4598-8e2f-6db9746a02f7",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3ce0e61d-40dc-4598-8e2f-6db9746a02f7",
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
      "id": "8a4d3a4c-ab61-4e01-a877-2895e22aaf42",
      "at": "2026-10-28T16:36:32.793209Z",
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
  "client_id": "3ce0e61d-40dc-4598-8e2f-6db9746a02f7",
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
      "id": "8a4d3a4c-ab61-4e01-a877-2895e22aaf42",
      "at": "2026-10-28T16:36:32.793209Z",
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
  "device_ref": "sandbox-10513"
}
```

```json
{
  "challenge_id": "df0ff9fb-be13-493b-bc73-0ae5d882cca3",
  "expires_at": "2026-10-28T16:41:34.200824935Z",
  "resend_available_at": "2026-10-28T16:36:35.200824935Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "035880",
  "sent_at": "2026-10-28T16:36:34.203765705Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df0ff9fb-be13-493b-bc73-0ae5d882cca3",
  "code": "035880",
  "device_ref": "sandbox-10513"
}
```

```json
{
  "session_id": "5c11e611-40bf-4b82-aea6-a11784bbbbc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjI5NCwiaWF0IjoxNzkzMjA1Mzk0LCJqdGkiOiJmNDk4MGRhMy1hODBlLTRjZWItOGY5NS0xMmM5MmZmZjU4MTMiLCJzaWQiOiI1YzExZTYxMS00MGJmLTRiODItYWVhNi1hMTE3ODRiYmJiYzEifQ.VuIe1cFKGturAwxMsxTLExhwzTo8jFXUAIUJ1YLGdcE",
  "access_expires_at": "2026-10-28T16:51:34.461609887Z",
  "refresh_token": "Hnw2IuToQDrrWaB6i33gC6Trqfo7BfHYjX8dDq27PRE",
  "refresh_expires_at": "2026-11-27T16:36:34.460969827Z",
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
  "command_id": "b8d7da38-6615-44f6-a056-32f46921cb41",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "e65fe7c0-eacb-435e-9f4f-8febc10b2606",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e65fe7c0-eacb-435e-9f4f-8febc10b2606",
    "orderDate": "1793205394",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "995f811c670b1fa3a6fb3163299c8509",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e65fe7c0-eacb-435e-9f4f-8febc10b2606",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e65fe7c0-eacb-435e-9f4f-8febc10b2606",
  "created_at": "2026-10-28T16:36:34.955341Z",
  "expires_at": "2026-10-28T17:06:34.955341Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/e65fe7c0-eacb-435e-9f4f-8febc10b2606` → **200**

```json
{
  "id": "e65fe7c0-eacb-435e-9f4f-8febc10b2606",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T16:36:34.955341Z",
  "expires_at": "2026-10-28T17:06:34.955341Z",
  "completed_at": "2026-10-28T16:36:35.204172Z",
  "masked_pan": "41****2824",
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
      "id": "55e89a81-2fc1-4137-8d18-92cd85c4d319",
      "at": "2026-10-28T16:36:35.801731Z",
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
  "command_id": "36d2371a-e2d6-41c9-8b7e-ddf667a93f04",
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
  "correlation_id": "16d24f40-95fc-46df-9766-73b4acebd2de"
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
  "session_id": "16ce759d-6b40-4468-867f-e2c1febc6a88",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYyOTcsImlhdCI6MTc5MzIwNTM5NywianRpIjoiNTFmOWEwNzktYjVmOS00NjBhLTk5YzgtZWZmNDA5ZmFmMTVmIiwic2lkIjoiMTZjZTc1OWQtNmI0MC00NDY4LTg2N2YtZTJjMWZlYmM2YTg4In0.3jpGy-jTDrJLRtcWdqMIPLPZv4iIPp0Wg6JOubaJKis",
  "access_expires_at": "2026-10-28T16:51:37.519065358Z",
  "refresh_token": "NBbS52gL9QQ35cFTyC57_72vDjKB1XKv_yzqhp4cB5c",
  "refresh_expires_at": "2026-10-29T04:36:37.518488711Z",
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
  "phone": "+48600941361",
  "device_ref": "sandbox-31487"
}
```

```json
{
  "challenge_id": "f6c36394-5d84-49a0-a042-4c063796334f",
  "expires_at": "2026-10-28T16:41:38.284492503Z",
  "resend_available_at": "2026-10-28T16:36:39.284492503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600941361` → **200**

```json
{
  "phone": "+48600941361",
  "audience": "CLIENT",
  "code": "600447",
  "sent_at": "2026-10-28T16:36:38.287031531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6c36394-5d84-49a0-a042-4c063796334f",
  "code": "600447",
  "device_ref": "sandbox-31487"
}
```

```json
{
  "session_id": "a5667991-713c-45e9-bf50-0e87a70731b6",
  "subject": {
    "type": "CLIENT",
    "id": "b6f45250-137d-4331-b7c1-05776fd6e59c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNmY0NTI1MC0xMzdkLTQzMzEtYjdjMS0wNTc3NmZkNmU1OWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2Mjk4LCJpYXQiOjE3OTMyMDUzOTgsImp0aSI6IjBkYjc0ZmY0LWI2NGItNGVhMC1iYjE4LThmNjBmODc1YzNhZiIsInNpZCI6ImE1NjY3OTkxLTcxM2MtNDVlOS1iZjUwLTBlODdhNzA3MzFiNiJ9.w-yIBCriJiAokk1EAwImrrSWiI6cbLJE4ZPcTVoGkOA",
  "access_expires_at": "2026-10-28T16:51:38.570190838Z",
  "refresh_token": "1prKv8OHFs9IMvpLuGYVWuJvcJLQwpKmvFm2brqYxzo",
  "refresh_expires_at": "2026-11-27T16:36:38.569638373Z",
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
  "command_id": "f36f2342-c217-4c23-a902-d6f5f07aae2e",
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
  "correlation_id": "67e4d519-0744-4cff-9eaa-6914e673cbb1",
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
  "command_id": "b0ffc02a-aa94-44d5-a5f6-30554e4c8c0f",
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
  "paused_at": "2026-10-28T16:36:39.591305736Z",
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
  "command_id": "fc6cb4ab-4f83-4814-a832-f4bbbaba520d",
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
  "id": "0deeb91c-a69b-418d-8183-e57f70c9427b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:40.105386Z",
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
  "command_id": "68a28ac3-96fe-486f-905c-0a08adc64742",
  "quote_id": "0deeb91c-a69b-418d-8183-e57f70c9427b",
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
  "correlation_id": "5d410804-35dc-4da7-98f2-7c8c6285bee2"
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
  "paused_at": "2026-10-28T16:36:39.591306Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "1ce69208-d3cb-4a5a-b501-a68a32a3e0ac",
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
  "command_id": "f7876cf9-fc62-4412-9d0e-ee6a702ff9ae",
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
  "command_id": "5563c7fe-75dd-412e-b0ca-7fb5cd072ffe",
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
  "id": "1e84f16e-c8ad-41a8-b281-bfe1661bc479",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:41.629070Z",
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
  "command_id": "a3731ad0-71f9-4aae-bd02-dde394c910ad",
  "quote_id": "1e84f16e-c8ad-41a8-b281-bfe1661bc479",
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
  "correlation_id": "e34ed023-1a05-4478-ad25-c0d7f2c53556"
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
  "command_id": "337e3f21-50b7-4d42-a932-61c56227da44",
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
      "from": "19:00",
      "to": "20:00"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "45419e4f-95b3-4b09-bfed-48fd3beba7aa",
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
  "id": "1eb13565-6d05-4d5a-8f7e-2e84b3cd1096",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:42.660043Z",
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
  "command_id": "1a4c5bf8-8fc6-487a-ab9f-ff084ab9341a",
  "quote_id": "1eb13565-6d05-4d5a-8f7e-2e84b3cd1096",
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
  "correlation_id": "1ac991be-414e-484d-8dfd-19507196835b"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "98541f0e-3198-45da-a3b5-c137ecbf8f58",
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
  "correlation_id": "dcf5c3f9-2e9d-437f-b043-83404d4ca575"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "2b44303a-5cf2-4b16-bd11-47053beb5fe4",
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
  "phone": "+380672320189",
  "device_ref": "sandbox-28590"
}
```

```json
{
  "challenge_id": "5ff83189-9952-4941-b1f2-665f955e118f",
  "expires_at": "2026-10-28T16:41:43.959329595Z",
  "resend_available_at": "2026-10-28T16:36:44.959329595Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672320189` → **200**

```json
{
  "phone": "+380672320189",
  "audience": "CLIENT",
  "code": "820507",
  "sent_at": "2026-10-28T16:36:43.961549025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ff83189-9952-4941-b1f2-665f955e118f",
  "code": "820507",
  "device_ref": "sandbox-28590"
}
```

```json
{
  "session_id": "32d16bb9-fda1-4900-9396-ad6ec2d76977",
  "subject": {
    "type": "CLIENT",
    "id": "38763c8b-e3d0-43d7-8b63-27f2183d5001"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODc2M2M4Yi1lM2QwLTQzZDctOGI2My0yN2YyMTgzZDUwMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzA0LCJpYXQiOjE3OTMyMDU0MDQsImp0aSI6ImNlYjdmMmZkLWMzZTgtNGMxZC05YjI3LTg1NmMwNjU0ZmY0NCIsInNpZCI6IjMyZDE2YmI5LWZkYTEtNDkwMC05Mzk2LWFkNmVjMmQ3Njk3NyJ9.U1303JWAMPLJqgLmR44r16geAqM42vEA5JJzNUL21xU",
  "access_expires_at": "2026-10-28T16:51:44.230638406Z",
  "refresh_token": "4abMzeO-0UFffYMF1lLm1ie5Mci25OVCSGVXyTrPZPI",
  "refresh_expires_at": "2026-11-27T16:36:44.230095004Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "38763c8b-e3d0-43d7-8b63-27f2183d5001",
  "session_id": "32d16bb9-fda1-4900-9396-ad6ec2d76977",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e27bee6-1787-43e1-bf73-a62c3e548314",
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
  "id": "d0d86476-ae1b-43ce-bfd2-00eb57be3ce0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:44.722686Z",
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
  "challenge_id": "a9b0e2ad-82d9-436e-aab5-d8dda83de73f",
  "expires_at": "2026-10-28T16:41:47.001289992Z",
  "resend_available_at": "2026-10-28T16:36:48.001289992Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672320189` → **200**

```json
{
  "phone": "+380672320189",
  "audience": "CLIENT",
  "code": "762084",
  "sent_at": "2026-10-28T16:36:47.003520033Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "82c5ea8c-9f65-4cff-99cb-a1a38aca81d0",
  "challenge_id": "a9b0e2ad-82d9-436e-aab5-d8dda83de73f",
  "otp_code": "762084"
}
```

```json
{
  "client_id": "38763c8b-e3d0-43d7-8b63-27f2183d5001",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T16:36:47.275346638Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "2758c869-ec69-415c-84a5-160afddfefbe",
  "quote_id": "d0d86476-ae1b-43ce-bfd2-00eb57be3ce0",
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
  "correlation_id": "2bf6ce07-4395-4468-942d-bce99811ae0a"
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
  "session_id": "dc67a85c-1de2-4835-a2be-54d2f11691f5",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzMDgsImlhdCI6MTc5MzIwNTQwOCwianRpIjoiOWZhOGIwZTQtZmRjZS00YWY3LThhZjctZmU1NTZhZjJkZjUyIiwic2lkIjoiZGM2N2E4NWMtMWRlMi00ODM1LWEyYmUtNTRkMmYxMTY5MWY1In0.4OUaNT2dzvHTIf_xAdPcmY4_PNu138jJ2n70gSBHmJo",
  "access_expires_at": "2026-10-28T16:51:48.046655199Z",
  "refresh_token": "bkf4LMf99jm4k_lRYoFqmO5Ga1eADtKO24xos1KkNQE",
  "refresh_expires_at": "2026-10-29T04:36:48.045927194Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "38763c8b-e3d0-43d7-8b63-27f2183d5001",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T16:36:47.275347Z",
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

`POST /api/admin/v1/client-deletions/38763c8b-e3d0-43d7-8b63-27f2183d5001/complete` → **200**

```json
{
  "command_id": "b0801f13-dcb4-4bf6-9624-5666534beb14",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "38763c8b-e3d0-43d7-8b63-27f2183d5001",
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
  "correlation_id": "6ead3f96-1c01-4b47-aae5-091a15e1ac8f"
}
```

Done: client 38763c8b-e3d0-43d7-8b63-27f2183d5001 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667013045",
  "device_ref": "sandbox-22940"
}
```

```json
{
  "challenge_id": "8e52cb1d-6833-4c6d-ba86-a15680239774",
  "expires_at": "2026-10-28T16:41:49.068791616Z",
  "resend_available_at": "2026-10-28T16:36:50.068791616Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667013045` → **200**

```json
{
  "phone": "+380667013045",
  "audience": "CLIENT",
  "code": "220037",
  "sent_at": "2026-10-28T16:36:49.071090375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e52cb1d-6833-4c6d-ba86-a15680239774",
  "code": "220037",
  "device_ref": "sandbox-22940"
}
```

```json
{
  "session_id": "4d504809-6d82-4579-aeb4-640c417189e5",
  "subject": {
    "type": "CLIENT",
    "id": "3e3783f3-38f2-4eda-be78-674b7841424a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTM3ODNmMy0zOGYyLTRlZGEtYmU3OC02NzRiNzg0MTQyNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzA5LCJpYXQiOjE3OTMyMDU0MDksImp0aSI6ImQyOWIwOWQ1LWEwODItNDNiZS05YzliLTAxMzZjM2VlNDY1MiIsInNpZCI6IjRkNTA0ODA5LTZkODItNDU3OS1hZWI0LTY0MGM0MTcxODllNSJ9.qyknFTUD-rJq9tZGHnGNDILF-3NcPiKhjd8wmUb24zE",
  "access_expires_at": "2026-10-28T16:51:49.333999762Z",
  "refresh_token": "jmi1J-VrBs2bg8zRb1pH__dKw27nFy39bKgmcVxSpmA",
  "refresh_expires_at": "2026-11-27T16:36:49.333419487Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3e3783f3-38f2-4eda-be78-674b7841424a",
  "session_id": "4d504809-6d82-4579-aeb4-640c417189e5",
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
  "session_id": "a3b5a28f-31f3-43cc-9762-a963014a7751",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzMTAsImlhdCI6MTc5MzIwNTQxMCwianRpIjoiZDgwZTU3ZGQtOGMyYy00YTRjLWFiMDYtNzJlZmQ5ZDlmYjA0Iiwic2lkIjoiYTNiNWEyOGYtMzFmMy00M2NjLTk3NjItYTk2MzAxNGE3NzUxIn0.7f3u8lWtUCP75gzko6HOVBPwAJdR6ZMe4tCJjdb4wXc",
  "access_expires_at": "2026-10-28T16:51:50.095882334Z",
  "refresh_token": "mhcP5mFgFU_DlUw9uRs2uhqUzdfzMjsdmtoKpwaM1rw",
  "refresh_expires_at": "2026-10-29T04:36:50.095316557Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7013045&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "3e3783f3-38f2-4eda-be78-674b7841424a",
      "phone": "+380667013045",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T16:36:49.331272Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/3e3783f3-38f2-4eda-be78-674b7841424a` → **200**

```json
{
  "client": {
    "id": "3e3783f3-38f2-4eda-be78-674b7841424a",
    "phone": "+380667013045",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:36:49.331272Z",
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

`POST /api/admin/v1/clients/3e3783f3-38f2-4eda-be78-674b7841424a/block` → **400**

```json
{
  "command_id": "751dd9e5-f745-4c2d-af3a-a56f8bddff45",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/3e3783f3-38f2-4eda-be78-674b7841424a/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3a34a4c5-61d7-49e2-be55-7b1642ef7f50",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/3e3783f3-38f2-4eda-be78-674b7841424a/block` → **200**

```json
{
  "command_id": "85f11a0f-e4ef-488f-8961-c32c64b1f959",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "3e3783f3-38f2-4eda-be78-674b7841424a",
  "phone": "+380667013045",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T16:36:49.331272Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T16:36:51.140925Z",
    "by": "2c53af99-a0d3-452b-870b-4332aa3e3979"
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
  "correlation_id": "b21ad44c-6cfe-43b6-aaff-ba9e71838d4d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667013045",
  "device_ref": "sandbox-3550"
}
```

```json
{
  "challenge_id": "0e4e26a1-b8f0-4742-bcc4-4653fc9ec4bd",
  "expires_at": "2026-10-28T16:41:53.635568791Z",
  "resend_available_at": "2026-10-28T16:36:54.635568791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667013045` → **200**

```json
{
  "phone": "+380667013045",
  "audience": "CLIENT",
  "code": "540219",
  "sent_at": "2026-10-28T16:36:53.638870633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "0e4e26a1-b8f0-4742-bcc4-4653fc9ec4bd",
  "code": "540219",
  "device_ref": "sandbox-3550"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "bb565751-db71-4811-99cb-3d0f46f597f2"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/3e3783f3-38f2-4eda-be78-674b7841424a` → **200**

```json
{
  "client": {
    "id": "3e3783f3-38f2-4eda-be78-674b7841424a",
    "phone": "+380667013045",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T16:36:49.331272Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T16:36:51.140925Z",
      "by": "2c53af99-a0d3-452b-870b-4332aa3e3979"
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

`POST /api/admin/v1/clients/3e3783f3-38f2-4eda-be78-674b7841424a/unblock` → **200**

```json
{
  "command_id": "18e61947-5c39-4df5-a2ca-a28f9dcbd54b",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "3e3783f3-38f2-4eda-be78-674b7841424a",
  "phone": "+380667013045",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T16:36:49.331272Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667013045",
  "device_ref": "sandbox-16500"
}
```

```json
{
  "challenge_id": "9222bdb0-0fe2-4d4b-981e-00e78bb9de6a",
  "expires_at": "2026-10-28T16:41:56.7254938Z",
  "resend_available_at": "2026-10-28T16:36:57.7254938Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667013045` → **200**

```json
{
  "phone": "+380667013045",
  "audience": "CLIENT",
  "code": "942562",
  "sent_at": "2026-10-28T16:36:56.727486437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9222bdb0-0fe2-4d4b-981e-00e78bb9de6a",
  "code": "942562",
  "device_ref": "sandbox-16500"
}
```

```json
{
  "session_id": "bc40c226-b1e6-48d5-93f0-9f962cf2a2fc",
  "subject": {
    "type": "CLIENT",
    "id": "3e3783f3-38f2-4eda-be78-674b7841424a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTM3ODNmMy0zOGYyLTRlZGEtYmU3OC02NzRiNzg0MTQyNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzE2LCJpYXQiOjE3OTMyMDU0MTYsImp0aSI6IjI2ZTNkYTU0LTNkMDYtNGFlZC05M2RmLWI5ZmEzZDBmMWFlZiIsInNpZCI6ImJjNDBjMjI2LWIxZTYtNDhkNS05M2YwLTlmOTYyY2YyYTJmYyJ9.-MxkooadBZHRmFWXJJ6M4afFrr1s7sjiL8_1S4_FDa8",
  "access_expires_at": "2026-10-28T16:51:56.991281425Z",
  "refresh_token": "h_TGk2EHis2fPeejSYujx_tvTLj6cTITJiQP_LKUbb4",
  "refresh_expires_at": "2026-11-27T16:36:56.990738927Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3e3783f3-38f2-4eda-be78-674b7841424a",
  "session_id": "bc40c226-b1e6-48d5-93f0-9f962cf2a2fc",
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
  "phone": "+380668061070",
  "device_ref": "sandbox-21150"
}
```

```json
{
  "challenge_id": "fb23cf6c-5e0c-41de-8163-b9f06d7a8c4f",
  "expires_at": "2026-10-28T16:41:57.491119904Z",
  "resend_available_at": "2026-10-28T16:36:58.491119904Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668061070` → **200**

```json
{
  "phone": "+380668061070",
  "audience": "CLIENT",
  "code": "967087",
  "sent_at": "2026-10-28T16:36:57.493232921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb23cf6c-5e0c-41de-8163-b9f06d7a8c4f",
  "code": "967087",
  "device_ref": "sandbox-21150"
}
```

```json
{
  "session_id": "de1bfe31-8a4e-4999-b74f-9743701cec1f",
  "subject": {
    "type": "CLIENT",
    "id": "92bddae5-aed9-4f50-934d-3d708e700eb4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MmJkZGFlNS1hZWQ5LTRmNTAtOTM0ZC0zZDcwOGU3MDBlYjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzE3LCJpYXQiOjE3OTMyMDU0MTcsImp0aSI6IjdjYTgwODc5LTAyNWEtNDQ5NS05NGVmLTlhZDVmY2MzNTM1YyIsInNpZCI6ImRlMWJmZTMxLThhNGUtNDk5OS1iNzRmLTk3NDM3MDFjZWMxZiJ9.otlZMt6ZhfEfBBietGjZCcPlJrV77ugBHSHrrcFqnS4",
  "access_expires_at": "2026-10-28T16:51:57.761345381Z",
  "refresh_token": "iAHYCkcKM0PYtjpY3EXTvO3TVzh-CIJx6yNnA_D34bs",
  "refresh_expires_at": "2026-11-27T16:36:57.760883236Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f461c04-82aa-4b2f-9356-ee2bb1cbf0cf",
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
  "id": "eda7087a-f8a7-4d5a-b676-d1e49756a050",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:41:58.015501Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 88f72549-d6eb-478b-8d2d-7d15bc091a55) → **201**

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
  "session_id": "6ca46b00-0c75-4fc0-8f87-1c6b58bfa46c",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzMTgsImlhdCI6MTc5MzIwNTQxOCwianRpIjoiZDU3YzJjZjYtMzBjOS00YTRlLWI3MzMtMjgzNjQwNjgzOGZmIiwic2lkIjoiNmNhNDZiMDAtMGM3NS00ZmMwLThmODctMWM2YjU4YmZhNDZjIn0.dy9S9oiGtmHF5QpJodv-4ZFrBMCo0lm58ZmAgFefl7c",
  "access_expires_at": "2026-10-28T16:51:58.58536086Z",
  "refresh_token": "5jDsxAPPP4kXJAOO3j5QqXPoUeDOk87_ZU88NGI6bbs",
  "refresh_expires_at": "2026-10-29T04:36:58.584797858Z",
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
  "session_id": "16bb6aac-d49b-4bed-bbeb-60042439b817",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzMTksImlhdCI6MTc5MzIwNTQxOSwianRpIjoiMWQwOGFmNDktMDQ1Yi00MDIxLTg0NzAtZjdkNTAwMDhiNzRiIiwic2lkIjoiMTZiYjZhYWMtZDQ5Yi00YmVkLWJiZWItNjAwNDI0MzliODE3In0.wIi5HmELrS2Clw5JlweqmeNKNq1hO7LaxH7mnEyl7Hs",
  "access_expires_at": "2026-10-28T16:51:59.114455139Z",
  "refresh_token": "ZF0FgQgfzvkCqntRbsV9Gv8fnOXYYR2c9rFm0ACLSEg",
  "refresh_expires_at": "2026-10-29T04:36:59.11393362Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e041ec1b-fd14-4d34-9eca-da9c07839fb1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:36:58.277218Z",
      "actor": {
        "type": "CLIENT",
        "id": "92bddae5-aed9-4f50-934d-3d708e700eb4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1",
        "quote_id": "eda7087a-f8a7-4d5a-b676-d1e49756a050",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "88f72549-d6eb-478b-8d2d-7d15bc091a55"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:36:58.279281Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1",
        "attempt_id": "a53c0e91-e983-4124-911a-53b181b98de6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "88f72549-d6eb-478b-8d2d-7d15bc091a55"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T16:36:58.288312Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1",
        "attempt_id": "a53c0e91-e983-4124-911a-53b181b98de6"
      },
      "correlation_id": "88f72549-d6eb-478b-8d2d-7d15bc091a55"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "a53c0e91-e983-4124-911a-53b181b98de6",
        "generation": 1,
        "started_at": "2026-10-28T16:36:58.27836Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T16:36:58.288312Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T16:36:58.28027Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/88f72549-d6eb-478b-8d2d-7d15bc091a55` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1:0",
      "order_id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1",
      "at": "2026-10-28T16:36:58.277218Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1:1",
      "order_id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1",
      "at": "2026-10-28T16:36:58.279281Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1:2",
      "order_id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1",
      "at": "2026-10-28T16:36:58.288312Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/266fd70a-cdf8-438d-a0c4-3fe8619ccf41` → **200**

```json
{
  "found": []
}
```

Done: request 88f72549-d6eb-478b-8d2d-7d15bc091a55 — order e041ec1b-fd14-4d34-9eca-da9c07839fb1 found by its id.

`GET /api/rider/v1/orders/e041ec1b-fd14-4d34-9eca-da9c07839fb1` → **200**

```json
{
  "id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "92bddae5-aed9-4f50-934d-3d708e700eb4",
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
  "created_at": "2026-10-28T16:36:58.276652Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e041ec1b-fd14-4d34-9eca-da9c07839fb1/cancel` → **200**

```json
{
  "command_id": "ab44a832-a70b-4918-9210-6abd95a242da",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e041ec1b-fd14-4d34-9eca-da9c07839fb1",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "92bddae5-aed9-4f50-934d-3d708e700eb4",
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
  "created_at": "2026-10-28T16:36:58.276652Z",
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
  "phone": "+380630854569",
  "device_ref": "sandbox-26509"
}
```

```json
{
  "challenge_id": "75f48bb7-5416-4d93-a8fd-16d5319129d8",
  "expires_at": "2026-10-28T16:42:00.646200572Z",
  "resend_available_at": "2026-10-28T16:37:01.646200572Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630854569` → **200**

```json
{
  "phone": "+380630854569",
  "audience": "CLIENT",
  "code": "030518",
  "sent_at": "2026-10-28T16:37:00.649041454Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75f48bb7-5416-4d93-a8fd-16d5319129d8",
  "code": "030518",
  "device_ref": "sandbox-26509"
}
```

```json
{
  "session_id": "feb05f83-203d-4d1b-98b3-b0322fccf6d2",
  "subject": {
    "type": "CLIENT",
    "id": "3383f8a9-c25a-42f0-a718-77bb86f9780c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzgzZjhhOS1jMjVhLTQyZjAtYTcxOC03N2JiODZmOTc4MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzIwLCJpYXQiOjE3OTMyMDU0MjAsImp0aSI6IjE5ZGVjNWY0LTkwNDgtNDIwOS1iNmU4LWE1MjllZDBhOTU3OSIsInNpZCI6ImZlYjA1ZjgzLTIwM2QtNGQxYi05OGIzLWIwMzIyZmNjZjZkMiJ9.7N1OID4AaFhiYE6zAuyQuHdR-rYv8ifca2qQLMX8sdE",
  "access_expires_at": "2026-10-28T16:52:00.920950665Z",
  "refresh_token": "h-5SQHkgQRtsHrF1nBh94fk6cIy_QSrQGQBCbygc8g4",
  "refresh_expires_at": "2026-11-27T16:37:00.920401229Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "8ba8ec26-49a4-4676-b210-e541d2ef488a",
  "expires_at": "2026-10-28T16:42:03.167592579Z",
  "resend_available_at": "2026-10-28T16:37:04.167592579Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630854569` → **200**

```json
{
  "phone": "+380630854569",
  "audience": "CLIENT",
  "code": "475610",
  "sent_at": "2026-10-28T16:37:03.169680964Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "0d731f23-154e-4095-863f-0236bd64e06a",
  "challenge_id": "8ba8ec26-49a4-4676-b210-e541d2ef488a",
  "otp_code": "475610"
}
```

```json
{
  "id": "7ca63e49-2dfd-4d77-9d79-04eafd1593e8",
  "state": "PENDING",
  "created_at": "2026-10-28T16:37:03.455385Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/7ca63e49-2dfd-4d77-9d79-04eafd1593e8` → **200**

```json
{
  "id": "7ca63e49-2dfd-4d77-9d79-04eafd1593e8",
  "state": "PENDING",
  "created_at": "2026-10-28T16:37:03.455385Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7ca63e49-2dfd-4d77-9d79-04eafd1593e8` → **200**

```json
{
  "id": "7ca63e49-2dfd-4d77-9d79-04eafd1593e8",
  "state": "READY",
  "created_at": "2026-10-28T16:37:03.455385Z",
  "ready_at": "2026-10-28T16:37:04.166439Z",
  "expires_at": "2026-11-04T16:37:04.166439Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/7ca63e49-2dfd-4d77-9d79-04eafd1593e8/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632896665",
  "device_ref": "sandbox-8714"
}
```

```json
{
  "challenge_id": "917da9a7-2803-445e-8708-5b0340b69083",
  "expires_at": "2026-10-28T16:42:05.22863559Z",
  "resend_available_at": "2026-10-28T16:37:06.22863559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632896665` → **200**

```json
{
  "phone": "+380632896665",
  "audience": "CLIENT",
  "code": "831361",
  "sent_at": "2026-10-28T16:37:05.231314647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "917da9a7-2803-445e-8708-5b0340b69083",
  "code": "831361",
  "device_ref": "sandbox-8714"
}
```

```json
{
  "session_id": "522f7cfe-fd85-4cc3-9005-de42664d6215",
  "subject": {
    "type": "CLIENT",
    "id": "6a05313c-bc3c-4aeb-bb47-42394f191d07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTA1MzEzYy1iYzNjLTRhZWItYmI0Ny00MjM5NGYxOTFkMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzI1LCJpYXQiOjE3OTMyMDU0MjUsImp0aSI6IjM0OTFmZjI1LTA3NmMtNGZmNC1hZGU5LTMzOTBjMjgzNzcxYyIsInNpZCI6IjUyMmY3Y2ZlLWZkODUtNGNjMy05MDA1LWRlNDI2NjRkNjIxNSJ9.DS1gf6dGbGCPcDCE-RDFbgRRgBVeLbTJy5Q1rNhH6dw",
  "access_expires_at": "2026-10-28T16:52:05.503597449Z",
  "refresh_token": "LUG7Rzjvqz6HC-gDSVr_nGhqJdYzKY1x9P55EpMQQmo",
  "refresh_expires_at": "2026-11-27T16:37:05.503129578Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/7ca63e49-2dfd-4d77-9d79-04eafd1593e8/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/7ca63e49-2dfd-4d77-9d79-04eafd1593e8/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3b083831-57f2-44d4-bd96-39d28b6517d2"
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
  "session_id": "7edd1df9-27b6-4794-9d12-08d8eebaae73",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzMjYsImlhdCI6MTc5MzIwNTQyNiwianRpIjoiZTJmZTZkZTgtNjlkYS00MmJjLTgxYzktMTg0Y2ZlNThhMTdhIiwic2lkIjoiN2VkZDFkZjktMjdiNi00Nzk0LTlkMTItMDhkOGVlYmFhZTczIn0.2sPhwMQzWkuEecSrCPa-5aY77b4QP4SnbNimrdJmoUk",
  "access_expires_at": "2026-10-28T16:52:06.291044315Z",
  "refresh_token": "JxC-m2HI-usUOXdqOhhZ8n1Br7s8O5AnlKXMYkRayOs",
  "refresh_expires_at": "2026-10-29T04:37:06.290490461Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3383f8a9-c25a-42f0-a718-77bb86f9780c",
  "session_id": "feb05f83-203d-4d1b-98b3-b0322fccf6d2",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/3383f8a9-c25a-42f0-a718-77bb86f9780c/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "7ca63e49-2dfd-4d77-9d79-04eafd1593e8",
      "state": "READY",
      "created_at": "2026-10-28T16:37:03.455385Z",
      "ready_at": "2026-10-28T16:37:04.166439Z",
      "expires_at": "2026-11-04T16:37:04.166439Z",
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
  "device_ref": "sandbox-17144"
}
```

```json
{
  "challenge_id": "65a7d0ca-1790-4c83-9b3e-35aa6395692c",
  "expires_at": "2026-10-28T16:42:07.031073304Z",
  "resend_available_at": "2026-10-28T16:37:08.031073304Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "920571",
  "sent_at": "2026-10-28T16:37:07.033954791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65a7d0ca-1790-4c83-9b3e-35aa6395692c",
  "code": "920571",
  "device_ref": "sandbox-17144"
}
```

```json
{
  "session_id": "8c0cdf3a-5190-4d5c-91b6-ad7b095d0ac7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjMyNywiaWF0IjoxNzkzMjA1NDI3LCJqdGkiOiIyYjVhNDZkNy1lNDk1LTQxNjYtODJiYi1mOTllNjI2Mjc4MTIiLCJzaWQiOiI4YzBjZGYzYS01MTkwLTRkNWMtOTFiNi1hZDdiMDk1ZDBhYzcifQ.aFT7DQYRC2GUgB1mrO8kc3yebs2nrJnSjgg_QEvV4Oo",
  "access_expires_at": "2026-10-28T16:52:07.290469218Z",
  "refresh_token": "sand3trwo3M9gFGGVm7RU-BVpa1w2idD8gKiiVsPlWE",
  "refresh_expires_at": "2026-11-27T16:37:07.290009112Z",
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
  "device_ref": "sandbox-25491"
}
```

```json
{
  "challenge_id": "967c5820-c162-4460-830a-791e7abfd5db",
  "expires_at": "2026-10-28T16:42:07.790062854Z",
  "resend_available_at": "2026-10-28T16:37:08.790062854Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "437622",
  "sent_at": "2026-10-28T16:37:07.792303111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "967c5820-c162-4460-830a-791e7abfd5db",
  "code": "437622",
  "device_ref": "sandbox-25491"
}
```

```json
{
  "session_id": "f396fd78-2009-4fcd-9de7-a7b595d4831c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjMyOCwiaWF0IjoxNzkzMjA1NDI4LCJqdGkiOiIyOGEwN2UyMi00ODUyLTQ0OGQtYTNkOS02NWM2YjY5MTlhOGUiLCJzaWQiOiJmMzk2ZmQ3OC0yMDA5LTRmY2QtOWRlNy1hN2I1OTVkNDgzMWMifQ.LcoJsfseOpsKkWhB4OMGnkdGxq-FqTNPiOSrMUVP2iY",
  "access_expires_at": "2026-10-28T16:52:08.058615671Z",
  "refresh_token": "wgJOIrlLqG41vSTS37OaDxcsRs9p6um1qKGobXQ3hbc",
  "refresh_expires_at": "2026-11-27T16:37:08.058071064Z",
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
  "command_id": "40db6e8b-8708-43eb-8da1-a8cb09d08fe6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:08Z",
    "sequence": 1793205428547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fb6145cd-8aa5-4b37-961b-11a803602b1f",
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
  "last_heartbeat_at": "2026-10-28T16:37:08.562647Z",
  "last_location_at": "2026-10-28T16:37:08.562647Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-13471"
}
```

```json
{
  "challenge_id": "509e5402-a227-4d99-8d6d-d189837c2376",
  "expires_at": "2026-10-28T16:42:08.815204086Z",
  "resend_available_at": "2026-10-28T16:37:09.815204086Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "839154",
  "sent_at": "2026-10-28T16:37:08.81729281Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "509e5402-a227-4d99-8d6d-d189837c2376",
  "code": "839154",
  "device_ref": "sandbox-13471"
}
```

```json
{
  "session_id": "5f279418-f462-44a1-bdee-aa4a82d0faa4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjMyOSwiaWF0IjoxNzkzMjA1NDI5LCJqdGkiOiI4YWI4Y2I1Ny04YzhjLTQ2NmMtOTBjYy0xZWEyNTJkZDRmN2QiLCJzaWQiOiI1ZjI3OTQxOC1mNDYyLTQ0YTEtYmRlZS1hYTRhODJkMGZhYTQifQ.KJMluiRhT6MExnceOjaUhHlGBuK0r1hnyMaLM24HHC0",
  "access_expires_at": "2026-10-28T16:52:09.094511948Z",
  "refresh_token": "ofdy6zoIf8i4PWjhbUOgsPVdQcN3SvDSWomty6y5iPY",
  "refresh_expires_at": "2026-11-27T16:37:09.093977799Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6bd06c4b-5bff-4744-9378-65e42c35e847",
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
  "last_heartbeat_at": "2026-10-28T16:36:08.97488Z",
  "last_location_at": "2026-10-28T16:36:08.97488Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6bd06c4b-5bff-4744-9378-65e42c35e847/handover` → **200**

```json
{
  "command_id": "b4d8161e-7a6b-4672-9b0e-725a830c183e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6bd06c4b-5bff-4744-9378-65e42c35e847",
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
  "last_heartbeat_at": "2026-10-28T16:36:08.97488Z",
  "last_location_at": "2026-10-28T16:36:08.97488Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6bd06c4b-5bff-4744-9378-65e42c35e847/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:09Z",
    "sequence": 1793205429840
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6bd06c4b-5bff-4744-9378-65e42c35e847",
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
  "last_heartbeat_at": "2026-10-28T16:37:09.855775Z",
  "last_location_at": "2026-10-28T16:37:09.855775Z",
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
  "session_id": "5e429f64-3c01-4b3b-bd96-0cba6bd8cc1b",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzMzAsImlhdCI6MTc5MzIwNTQzMCwianRpIjoiZjQ5YzYyMTgtM2ZhMi00M2E4LWI1MDgtM2IzMzkxYzM2MGYxIiwic2lkIjoiNWU0MjlmNjQtM2MwMS00YjNiLWJkOTYtMGNiYTZiZDhjYzFiIn0.9jWZ2k0jtmHkUbQ3MZ8ByeAs-orRfRB9ChPzhOVJB84",
  "access_expires_at": "2026-10-28T16:52:10.379756425Z",
  "refresh_token": "yyGbjvnXx04mj_eHhWdt7Gt-9jV4OqN79h5rm4yrmaY",
  "refresh_expires_at": "2026-10-29T04:37:10.379253725Z",
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
  "session_id": "ded0a144-0752-4bb0-8983-2bed5dbb1285",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzMzAsImlhdCI6MTc5MzIwNTQzMCwianRpIjoiMDdkNzhjY2EtZDZlNS00YTg5LWFhNjEtYzgxM2I0OWUwZmRhIiwic2lkIjoiZGVkMGExNDQtMDc1Mi00YmIwLTg5ODMtMmJlZDVkYmIxMjg1In0.Nmy4dodXA2BbSQBhQ5gYjkb3_z7zblODSkJBS5NpTCE",
  "access_expires_at": "2026-10-28T16:52:10.89622378Z",
  "refresh_token": "U2FCOccrZNwcxwFVrHiqJ6nGZpW1rblSn4l1NY5hanQ",
  "refresh_expires_at": "2026-10-29T04:37:10.895722489Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683757547",
  "device_ref": "sandbox-11711"
}
```

```json
{
  "challenge_id": "e5b712b7-5667-44f4-bf44-e1028430fb10",
  "expires_at": "2026-10-28T16:42:11.143801026Z",
  "resend_available_at": "2026-10-28T16:37:12.143801026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683757547` → **200**

```json
{
  "phone": "+380683757547",
  "audience": "CLIENT",
  "code": "685871",
  "sent_at": "2026-10-28T16:37:11.145845925Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5b712b7-5667-44f4-bf44-e1028430fb10",
  "code": "685871",
  "device_ref": "sandbox-11711"
}
```

```json
{
  "session_id": "4e556521-9346-44b9-96c5-44123bcf68bf",
  "subject": {
    "type": "CLIENT",
    "id": "9a38ffc0-2150-4be1-860c-c6420e1ebe19"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTM4ZmZjMC0yMTUwLTRiZTEtODYwYy1jNjQyMGUxZWJlMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzMxLCJpYXQiOjE3OTMyMDU0MzEsImp0aSI6IjI0OTQyNDcyLWIxMDMtNGM0Yy1iOTQ4LWEyMzk1YWNjODJlZiIsInNpZCI6IjRlNTU2NTIxLTkzNDYtNDRiOS05NmM1LTQ0MTIzYmNmNjhiZiJ9.zSyyXpjw2jf_mZmKL_iTLtJZl4fVaFyHDS4p-b0c2Is",
  "access_expires_at": "2026-10-28T16:52:11.412325993Z",
  "refresh_token": "yezJ5qZCozsggOSKqvjy9sdXwi8OS3qKpda2sfdmYIU",
  "refresh_expires_at": "2026-11-27T16:37:11.411802009Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a0c48b68-b6e3-4458-bad4-d5b7ce5713e2",
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
  "id": "2be7025b-4c25-4383-9a3b-e34400e880e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:11.671510Z",
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
  "command_id": "30b18122-3bb9-4bcc-817f-193c543ea760",
  "quote_id": "2be7025b-4c25-4383-9a3b-e34400e880e7",
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
  "id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a38ffc0-2150-4be1-860c-c6420e1ebe19",
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
  "created_at": "2026-10-28T16:37:11.939694Z",
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
    "id": "d0ad01d7-e482-4868-aae2-0fac20f2bf7b",
    "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
    "expires_at": "2026-10-28T16:37:26.943131Z",
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

`POST /api/driver/v1/offers/d0ad01d7-e482-4868-aae2-0fac20f2bf7b/reject` → **204**

```json
{
  "command_id": "2d1aa131-46da-4cf0-89ee-0f6e35aba87c"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "54940b96-dd0b-4996-86b1-6f7cb7613acb",
    "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
    "expires_at": "2026-10-28T16:37:27.467779Z",
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

`POST /api/driver/v1/offers/54940b96-dd0b-4996-86b1-6f7cb7613acb/accept` → **200**

```json
{
  "command_id": "e615e77b-0eb2-45f2-9401-e41b75693862"
}
```

```json
{
  "id": "590a3ed3-bff2-4721-81d9-a1bbddb0a047",
  "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "345dc9d3-92c1-4574-9938-cd72b97df7e7",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/29b90d4d-dbdf-4d56-bc9b-b5a521876ec0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:37:11.940209Z",
      "actor": {
        "type": "CLIENT",
        "id": "9a38ffc0-2150-4be1-860c-c6420e1ebe19",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
        "quote_id": "2be7025b-4c25-4383-9a3b-e34400e880e7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0694b4c8-72f1-493a-8f29-2c2322993433"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:37:11.942293Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
        "attempt_id": "352e22b2-600e-4f41-a3c7-d647b4b59475",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0694b4c8-72f1-493a-8f29-2c2322993433"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:37:11.948598Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d0ad01d7-e482-4868-aae2-0fac20f2bf7b",
        "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "0694b4c8-72f1-493a-8f29-2c2322993433"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T16:37:12.466792Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d0ad01d7-e482-4868-aae2-0fac20f2bf7b",
        "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0"
      },
      "correlation_id": "2c0d08ed-b1b1-4dda-a5e7-eec53f6f3a2b"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 29b90d4d-dbdf-4d56-bc9b-b5a521876ec0 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/29b90d4d-dbdf-4d56-bc9b-b5a521876ec0` → **200**

```json
{
  "id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9a38ffc0-2150-4be1-860c-c6420e1ebe19",
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
    "id": "590a3ed3-bff2-4721-81d9-a1bbddb0a047",
    "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "345dc9d3-92c1-4574-9938-cd72b97df7e7",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:37:11.939694Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/29b90d4d-dbdf-4d56-bc9b-b5a521876ec0/cancel` → **200**

```json
{
  "command_id": "a31e1dc1-52ec-4dc3-87d0-3224ae1b8b06",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9a38ffc0-2150-4be1-860c-c6420e1ebe19",
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
    "id": "590a3ed3-bff2-4721-81d9-a1bbddb0a047",
    "order_id": "29b90d4d-dbdf-4d56-bc9b-b5a521876ec0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "345dc9d3-92c1-4574-9938-cd72b97df7e7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:37:11.939694Z",
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
  "session_id": "fb6145cd-8aa5-4b37-961b-11a803602b1f",
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
  "last_heartbeat_at": "2026-10-28T16:37:08.562647Z",
  "last_location_at": "2026-10-28T16:37:08.562647Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fb6145cd-8aa5-4b37-961b-11a803602b1f/close` → **200**

```json
{
  "command_id": "815a65dd-744e-43eb-8238-60d0054d9f99",
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
  "session_id": "6bd06c4b-5bff-4744-9378-65e42c35e847",
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
  "last_heartbeat_at": "2026-10-28T16:37:09.855775Z",
  "last_location_at": "2026-10-28T16:37:09.855775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6bd06c4b-5bff-4744-9378-65e42c35e847/close` → **200**

```json
{
  "command_id": "fd5448e2-06d0-412e-98e2-ce7ceb131325",
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
  "session_id": "477f60a4-2766-4c4c-bdcf-12304f0a9eb2",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzMzUsImlhdCI6MTc5MzIwNTQzNSwianRpIjoiMjY1OGMxZWYtZTQzYi00OTJhLWJmMTAtYmZmMTVjNGY3ZjRkIiwic2lkIjoiNDc3ZjYwYTQtMjc2Ni00YzRjLWJkY2YtMTIzMDRmMGE5ZWIyIn0.yUkny5U0psvcIc65CIbyxvAl5lxkL8NY8cajAe8Aqvk",
  "access_expires_at": "2026-10-28T16:52:15.145317141Z",
  "refresh_token": "vVFSiZHd4CIiVKDJIkeIFQg0kgbETh1qxy5h4WP7g9w",
  "refresh_expires_at": "2026-10-29T04:37:15.144776088Z",
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
  "command_id": "3059ea75-bd4b-412e-91a6-e54a54d34a80",
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
  "changed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T16:37:15.650733Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "2bd14961-32b0-4a8c-a039-bbf5cbb5c30b",
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
  "correlation_id": "8fdf6bfd-e697-42cf-b844-072f7aa53d40"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "a33bc460-212b-482f-b65e-bcb3a93bff92",
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
  "correlation_id": "40817d08-2edc-4c96-9236-ec6f8d5e1898"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633980619",
  "device_ref": "sandbox-150"
}
```

```json
{
  "challenge_id": "94037a94-6348-4b5d-97be-ab2ef021fd42",
  "expires_at": "2026-10-28T16:42:16.416932462Z",
  "resend_available_at": "2026-10-28T16:37:17.416932462Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633980619` → **200**

```json
{
  "phone": "+380633980619",
  "audience": "CLIENT",
  "code": "616158",
  "sent_at": "2026-10-28T16:37:16.419099259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94037a94-6348-4b5d-97be-ab2ef021fd42",
  "code": "616158",
  "device_ref": "sandbox-150"
}
```

```json
{
  "session_id": "845aee17-e9e9-4a7c-9926-84c82ffcd5ae",
  "subject": {
    "type": "CLIENT",
    "id": "ceb7acca-5d45-4ede-897f-28baac5815bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWI3YWNjYS01ZDQ1LTRlZGUtODk3Zi0yOGJhYWM1ODE1YmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzM2LCJpYXQiOjE3OTMyMDU0MzYsImp0aSI6IjI0NzQzZTNjLWRiZjktNDYwOC04MGE1LTIyMTA5NWQwMThmZCIsInNpZCI6Ijg0NWFlZTE3LWU5ZTktNGE3Yy05OTI2LTg0YzgyZmZjZDVhZSJ9.oWuGaAHCfbab7GBPBBWKVL_ObSnpOGVv9MuAJBEUTOg",
  "access_expires_at": "2026-10-28T16:52:16.683797484Z",
  "refresh_token": "fSnCHmAyTWduGrpk-1Kotf4WblZInBW__4APP4Ernm8",
  "refresh_expires_at": "2026-11-27T16:37:16.683255561Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3565487b-94a6-4f7c-b961-d518fafc4d1d",
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
  "id": "3f469a26-8868-4fe2-a4c7-9c4f430de0c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:16.947381Z",
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
  "command_id": "1ade8d72-b58d-469f-9450-09c9f8668abc",
  "quote_id": "3f469a26-8868-4fe2-a4c7-9c4f430de0c5",
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
  "correlation_id": "ba82bef8-86b7-45ec-90dc-022982f20110"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "da570c97-429f-4b52-9c3a-4e447076cc0d",
  "quote_id": "3f469a26-8868-4fe2-a4c7-9c4f430de0c5",
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
  "id": "ba10f551-b2f0-4926-a358-d1666d7438c1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ceb7acca-5d45-4ede-897f-28baac5815bf",
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
  "created_at": "2026-10-28T16:37:17.452762Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ba10f551-b2f0-4926-a358-d1666d7438c1/cancel` → **200**

```json
{
  "command_id": "65c082b0-ed91-466a-8438-8f55e756b11e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ba10f551-b2f0-4926-a358-d1666d7438c1",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ceb7acca-5d45-4ede-897f-28baac5815bf",
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
  "created_at": "2026-10-28T16:37:17.452762Z",
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
  "command_id": "2d1b1a16-9bae-46f1-9b83-a41ab8d8ffbe",
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
  "changed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T16:37:17.989488Z"
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
      "changed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T16:37:17.989488Z"
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
  "device_ref": "sandbox-19236"
}
```

```json
{
  "challenge_id": "87f0c84f-a8bb-483c-b7a4-4b6fc49b963e",
  "expires_at": "2026-10-28T16:42:18.750630677Z",
  "resend_available_at": "2026-10-28T16:37:19.750630677Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "435222",
  "sent_at": "2026-10-28T16:37:18.752993526Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87f0c84f-a8bb-483c-b7a4-4b6fc49b963e",
  "code": "435222",
  "device_ref": "sandbox-19236"
}
```

```json
{
  "session_id": "4dc61a4c-76b3-49e4-a449-ca37c3244806",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjMzOSwiaWF0IjoxNzkzMjA1NDM5LCJqdGkiOiI1N2NhMWQ3Yy02ZDlkLTRiY2YtYmU5OS0yYWE2YzRmYzE1MTAiLCJzaWQiOiI0ZGM2MWE0Yy03NmIzLTQ5ZTQtYTQ0OS1jYTM3YzMyNDQ4MDYifQ.kTP63EePBZpGEXyg9P33VJp7KaPT1fhaZHM1PnQgnYI",
  "access_expires_at": "2026-10-28T16:52:19.007995286Z",
  "refresh_token": "gTJcpZld8dUFL5CtRips63rPoQJE5A3-lVEQYXOxgXs",
  "refresh_expires_at": "2026-11-27T16:37:19.007526744Z",
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
  "command_id": "41a8f021-fe55-43a8-9ae8-07adffa2e807",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:19Z",
    "sequence": 1793205439518
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:19.533819Z",
  "last_location_at": "2026-10-28T16:37:19.533819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675037086",
  "device_ref": "sandbox-16246"
}
```

```json
{
  "challenge_id": "a486b8df-097c-4c29-9593-4c6bc0cd8eeb",
  "expires_at": "2026-10-28T16:42:19.786368276Z",
  "resend_available_at": "2026-10-28T16:37:20.786368276Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675037086` → **200**

```json
{
  "phone": "+380675037086",
  "audience": "CLIENT",
  "code": "401493",
  "sent_at": "2026-10-28T16:37:19.78842871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a486b8df-097c-4c29-9593-4c6bc0cd8eeb",
  "code": "401493",
  "device_ref": "sandbox-16246"
}
```

```json
{
  "session_id": "3b7a32aa-f9f3-4b52-849c-dd744a66132f",
  "subject": {
    "type": "CLIENT",
    "id": "ec9c311a-2b34-46a9-be6b-e174c71a883d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYzljMzExYS0yYjM0LTQ2YTktYmU2Yi1lMTc0YzcxYTg4M2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzQwLCJpYXQiOjE3OTMyMDU0NDAsImp0aSI6IjQwMGNlNWI1LTBmMGItNDkzNy1hZWMyLTM4ZTgwZWNjMjFmMCIsInNpZCI6IjNiN2EzMmFhLWY5ZjMtNGI1Mi04NDljLWRkNzQ0YTY2MTMyZiJ9.DtK9q99_6tJecUUW5PsUUct6cmNkIuL0Yw32NkkWqi8",
  "access_expires_at": "2026-10-28T16:52:20.058268171Z",
  "refresh_token": "IQeLRxsz8QFoQkdo0rXX7wMIirgpKgnK97AKbABnmJY",
  "refresh_expires_at": "2026-11-27T16:37:20.057751062Z",
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
  "command_id": "718e1b53-7dd1-4ac7-bb60-abfb3fdf3106",
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
  "id": "6a234dee-7796-409c-a8a5-7bdf7af4d0f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:20.557238Z",
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
  "command_id": "a59c05f8-d6d0-451e-be59-114fbef50c86",
  "platform": "ANDROID",
  "token": "sandbox-driver-7c1bd99f-8dd0-4f67-8523-9fb1eff40c06"
}
```

```json
{
  "id": "b9380328-d9f7-4d4c-be64-59913bf0c98b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:37:20.814081Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "8b458cbf-5913-44af-8838-4160837bec62",
  "platform": "ANDROID",
  "token": "sandbox-rider-da46fe5b-822b-4ac9-af6a-29bb8edc4958"
}
```

```json
{
  "id": "48709f9e-b7a2-4616-a73e-631d4725c8b7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T16:37:21.073632Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6495597b-03d2-4a5a-9b0a-7d72a699830f",
  "quote_id": "6a234dee-7796-409c-a8a5-7bdf7af4d0f3",
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
  "id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec9c311a-2b34-46a9-be6b-e174c71a883d",
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
  "created_at": "2026-10-28T16:37:21.322761Z",
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
    "id": "35cf8561-e8b2-46ac-b639-aafa1b7b0ef2",
    "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
    "expires_at": "2026-10-28T16:37:36.326732Z",
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

`POST /api/driver/v1/offers/35cf8561-e8b2-46ac-b639-aafa1b7b0ef2/accept` → **200**

```json
{
  "command_id": "e73d0b9b-e8e7-4de5-acf6-3ccadda3dd8f"
}
```

```json
{
  "id": "d3cb0ce3-4318-4abd-83ce-079f2a12a2eb",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f9c4d3af-52f3-4409-83ff-adf858642b69",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:37:21.302Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T16:37:21.302Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:37:22.529577831Z",
    "token_suffix": "f40c06",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "41075a2b-0f61-4ad1-b683-b58378a04dfa",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675037086&after=2026-10-28T16:37:21.302Z` → **200**

```json
[
  {
    "at": "2026-10-28T16:37:22.532047253Z",
    "token_suffix": "dc4958",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "3556d714-5c46-416b-9281-fb03ef043e38",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/ece4186d-e358-4924-9b1c-c5093758be91/messages` → **201**

```json
{
  "command_id": "0451e1d1-f56c-480c-aae8-5b5dcdb3cf89",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "c3440cd7-4465-4cd9-86c7-5f513c858d49",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T16:37:23.166146726Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f9c4d3af-52f3-4409-83ff-adf858642b69",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "assignment_id": "d3cb0ce3-4318-4abd-83ce-079f2a12a2eb",
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

`POST /api/driver/v1/trips/f9c4d3af-52f3-4409-83ff-adf858642b69/messages` → **201**

```json
{
  "command_id": "51fe47ff-e087-4435-a9e2-978cfda78139",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "e4f19532-d0f4-41d2-9751-256e1d311366",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T16:37:23.659686672Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/ece4186d-e358-4924-9b1c-c5093758be91/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/f9c4d3af-52f3-4409-83ff-adf858642b69/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675037086"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e6294dd0-9b69-40d6-b6d6-1b76421a6234/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:24Z",
    "sequence": 1793205444387
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:24.402402Z",
  "last_location_at": "2026-10-28T16:37:24.402402Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f9c4d3af-52f3-4409-83ff-adf858642b69",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "assignment_id": "d3cb0ce3-4318-4abd-83ce-079f2a12a2eb",
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

`POST /api/driver/v1/trips/f9c4d3af-52f3-4409-83ff-adf858642b69/arrive` → **200**

```json
{
  "command_id": "ca828f5c-cba2-4364-9eac-5219b5148802",
  "expected_version": 0
}
```

```json
{
  "id": "f9c4d3af-52f3-4409-83ff-adf858642b69",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "assignment_id": "d3cb0ce3-4318-4abd-83ce-079f2a12a2eb",
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
  "arrived_at": "2026-10-28T16:37:24.895427Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f9c4d3af-52f3-4409-83ff-adf858642b69/start` → **200**

```json
{
  "command_id": "412c0408-0d75-4d9a-8df3-6cafa201595a",
  "expected_version": 1
}
```

```json
{
  "id": "f9c4d3af-52f3-4409-83ff-adf858642b69",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "assignment_id": "d3cb0ce3-4318-4abd-83ce-079f2a12a2eb",
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
  "arrived_at": "2026-10-28T16:37:24.895427Z",
  "started_at": "2026-10-28T16:37:25.152705Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e6294dd0-9b69-40d6-b6d6-1b76421a6234/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:25Z",
    "sequence": 1793205445401
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:25.417124Z",
  "last_location_at": "2026-10-28T16:37:25.417124Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/f9c4d3af-52f3-4409-83ff-adf858642b69/complete` → **200**

```json
{
  "command_id": "66b16741-3660-437d-81da-29b4b42e94ee",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:37:25Z",
  "cash_received": true
}
```

```json
{
  "id": "f9c4d3af-52f3-4409-83ff-adf858642b69",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "assignment_id": "d3cb0ce3-4318-4abd-83ce-079f2a12a2eb",
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
  "arrived_at": "2026-10-28T16:37:24.895427Z",
  "started_at": "2026-10-28T16:37:25.152705Z",
  "completed_at": "2026-10-28T16:37:25.677312Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/ece4186d-e358-4924-9b1c-c5093758be91` → **200**

```json
{
  "id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ec9c311a-2b34-46a9-be6b-e174c71a883d",
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
    "id": "d3cb0ce3-4318-4abd-83ce-079f2a12a2eb",
    "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f9c4d3af-52f3-4409-83ff-adf858642b69",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:37:21.322761Z",
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
    "id": "ece4186d-e358-4924-9b1c-c5093758be91",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:37:21.322761Z",
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
    "id": "f9c4d3af-52f3-4409-83ff-adf858642b69",
    "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
    "order_short_number": 10,
    "created_at": "2026-10-28T16:37:21.844885Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "45184dad-2251-47d9-ae05-18f146b917f1",
    "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
    "order_short_number": 2,
    "created_at": "2026-10-28T16:35:59.52394Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e802685d-e45a-49f3-ba74-b6126c6c4822",
    "order_id": "1dec3d34-2954-46e2-9fd0-dc042e97f6c9",
    "order_short_number": 1,
    "created_at": "2026-10-28T16:35:39.054929Z",
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

`GET /api/rider/v1/orders/ece4186d-e358-4924-9b1c-c5093758be91/tip` → **200**

```json
{
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
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
  "available_until": "2026-10-29T16:37:25.677312Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ece4186d-e358-4924-9b1c-c5093758be91/tip` → **201**

```json
{
  "command_id": "3b909213-2d5d-4615-ae16-090b7adb580c",
  "amount_minor": 1100
}
```

```json
{
  "id": "f4d593af-09e2-4ee8-a7f4-cfbcccf4c212",
  "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T16:37:30.453715Z"
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
  "session_id": "b73b8569-c34c-4694-b2ce-9f43a0be71fc",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzNTAsImlhdCI6MTc5MzIwNTQ1MCwianRpIjoiMjU0NDU4ZjYtMWMyYi00Mjk4LTg3MTUtMzY3NWRmMzRhOTA0Iiwic2lkIjoiYjczYjg1NjktYzM0Yy00Njk0LWIyY2UtOWY0M2EwYmU3MWZjIn0.w62eJBgeMbA_MjwenBlDvxUlpO1Qs09MRci8ec-Gxxs",
  "access_expires_at": "2026-10-28T16:52:30.976279332Z",
  "refresh_token": "Imw66vYkxFaIQa0BBhh4g7ucpA6OyXv9wGrPdaPY1l8",
  "refresh_expires_at": "2026-10-29T04:37:30.975746254Z",
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
          "PHONE": 1,
          "APP": 9
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
      "PHONE": 1,
      "APP": 9
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
  "generated_at": "2026-10-28T16:37:31.219908482Z"
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
  "generated_at": "2026-10-28T16:37:31.469186325Z"
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
  "session_id": "c775ff4f-998e-4d67-b931-6f4add7ffa56",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzNTEsImlhdCI6MTc5MzIwNTQ1MSwianRpIjoiNzI5NGZjOWMtMjBjZi00NzNiLWFlYTItYmJlNzRmNTA3NGM5Iiwic2lkIjoiYzc3NWZmNGYtOTk4ZS00ZDY3LWI5MzEtNmY0YWRkN2ZmYTU2In0.JM5J4ycXm3mpgC0Dn-wwdVKbOsS-0-8tYGx4vOydeDw",
  "access_expires_at": "2026-10-28T16:52:31.988923613Z",
  "refresh_token": "nxFjX0oZ1TSPCTLkT0BVCz9joxvgDlg1vKXkzjuwlFM",
  "refresh_expires_at": "2026-10-29T04:37:31.988340202Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ece4186d-e358-4924-9b1c-c5093758be91/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:37:21.323264Z",
      "actor": {
        "type": "CLIENT",
        "id": "ec9c311a-2b34-46a9-be6b-e174c71a883d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
        "quote_id": "6a234dee-7796-409c-a8a5-7bdf7af4d0f3",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6353ebc4-0c04-4caa-8330-5194476ea82c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:37:21.325734Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
        "attempt_id": "c778055e-6a7c-4f77-a0dd-268f9b40c46b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6353ebc4-0c04-4caa-8330-5194476ea82c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:37:21.329427Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "35cf8561-e8b2-46ac-b639-aafa1b7b0ef2",
        "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "6353ebc4-0c04-4caa-8330-5194476ea82c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:37:21.846801Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "35cf8561-e8b2-46ac-b639-aafa1b7b0ef2",
        "order_id": "ece4186d-e358-4924-9b1c-c5093758be91",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d3cb0ce3-4318-4abd-83ce-079f2a12a2eb"
      },
      "correlation_id": "38e7109a-aba4-4efa-9a20-b9c65030873f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T16:37:32.48265108Z",
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
      "last_location_at": "2026-10-28T16:37:25.417124Z",
      "order_id": null
    }
  ]
}
```

Done: order ece4186d-e358-4924-9b1c-c5093758be91.

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
  "session_id": "9712a044-2066-45af-8df0-c3d97314d28f",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzNTMsImlhdCI6MTc5MzIwNTQ1MywianRpIjoiYjFhMThhYmItY2QxZC00ZWU0LWJiMzktNDUwOGRjM2RkZjI4Iiwic2lkIjoiOTcxMmEwNDQtMjA2Ni00NWFmLThkZjAtYzNkOTczMTRkMjhmIn0.79ToDCxP4e_B6Gc23PQd5_5sHpgbHTYtNEPZaQVc6ug",
  "access_expires_at": "2026-10-28T16:52:33.024833754Z",
  "refresh_token": "bIfxa7Bc9a5NScq_5TXOJ6wbDjT5xSrijTSBrK9MquM",
  "refresh_expires_at": "2026-10-29T04:37:33.024310563Z",
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
  "command_id": "91ebcc0b-6405-4492-bdae-827585d3d0e4",
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
  "timestamp": "2026-10-28T16:37:33.000+0000",
  "channel": {
    "id": "1730052000.974821229",
    "linkedid": "1730052000.974821229",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670434882"
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
  "timestamp": "2026-10-28T16:37:33.000+0000",
  "channel": {
    "id": "1730052000.974821229",
    "linkedid": "1730052000.974821229",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670434882"
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
  "session_id": "e7c87de5-5948-44c5-b705-57fde0c2a19b",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzNTQsImlhdCI6MTc5MzIwNTQ1NCwianRpIjoiYTdhYzBkZTgtNTVhNC00ODczLTlmYzktN2YyZDEyNjgwMWFhIiwic2lkIjoiZTdjODdkZTUtNTk0OC00NGM1LWI3MDUtNTdmZGUwYzJhMTliIn0.rUKp6buoe9Ad5I5QSSxDgqUmwujQgccnn2DkN2t_4Hw",
  "access_expires_at": "2026-10-28T16:52:34.083229309Z",
  "refresh_token": "aUupTrJHuv8_eHrMIIhNEx2MfWBsAi-wxqsTeIwrDRQ",
  "refresh_expires_at": "2026-10-29T04:37:34.08270017Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "fcc4aec8-4fe8-4e27-8310-7e1623c1f325",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670434882",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T16:37:33Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/fcc4aec8-4fe8-4e27-8310-7e1623c1f325/answer` → **200**

```json
{
  "command_id": "820ac582-59ed-4d35-8010-6e09bed8759f"
}
```

```json
{
  "id": "fcc4aec8-4fe8-4e27-8310-7e1623c1f325",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670434882",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "order_ids": [],
  "started_at": "2026-10-28T16:37:33Z",
  "answered_at": "2026-10-28T16:37:34.606011Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.974821229",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d728dc3e-528c-4027-85b9-8aab0ecf8d5f",
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
  "id": "3c26f30c-a859-48ae-9fb0-9cf0dfcf1f14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:34.881083Z",
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
  "command_id": "ad403887-3dd1-49df-b9c7-1b091ea707a9",
  "quote_id": "3c26f30c-a859-48ae-9fb0-9cf0dfcf1f14",
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
    "phone": "+380670434882"
  },
  "call_id": "fcc4aec8-4fe8-4e27-8310-7e1623c1f325"
}
```

```json
{
  "id": "52dbc5e2-1458-4bd1-8bb7-80ce39af1889",
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
  "created_at": "2026-10-28T16:37:35.140224Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670434882"
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
    "id": "1730052000.974821229",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fcc4aec8-4fe8-4e27-8310-7e1623c1f325",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670434882",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [
        "52dbc5e2-1458-4bd1-8bb7-80ce39af1889"
      ],
      "started_at": "2026-10-28T16:37:33Z",
      "answered_at": "2026-10-28T16:37:34.606011Z",
      "ended_at": "2026-10-28T16:37:35.412459Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "7ff20a39-0576-420a-a4c9-1df7507db47e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679113662",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [],
      "started_at": "2026-10-28T16:35:46.654217Z",
      "answered_at": "2026-10-28T16:35:46.940081Z",
      "ended_at": "2026-10-28T16:35:47.209585Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:35:54.161938Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/52dbc5e2-1458-4bd1-8bb7-80ce39af1889` → **200**

```json
{
  "id": "52dbc5e2-1458-4bd1-8bb7-80ce39af1889",
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
  "created_at": "2026-10-28T16:37:35.140224Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670434882"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/52dbc5e2-1458-4bd1-8bb7-80ce39af1889` → **200**

```json
{
  "id": "52dbc5e2-1458-4bd1-8bb7-80ce39af1889",
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
  "created_at": "2026-10-28T16:37:35.140224Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670434882"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/52dbc5e2-1458-4bd1-8bb7-80ce39af1889/cancel` → **200**

```json
{
  "command_id": "6dbe8e34-7892-42ef-80e4-991f16f4eb8e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "52dbc5e2-1458-4bd1-8bb7-80ce39af1889",
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
  "created_at": "2026-10-28T16:37:35.140224Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670434882"
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

Done: call fcc4aec8-4fe8-4e27-8310-7e1623c1f325 with order 52dbc5e2-1458-4bd1-8bb7-80ce39af1889.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22088"
}
```

```json
{
  "challenge_id": "624119f2-49f4-41b5-896e-d33f734300e7",
  "expires_at": "2026-10-28T16:42:36.503290842Z",
  "resend_available_at": "2026-10-28T16:37:37.503290842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "954646",
  "sent_at": "2026-10-28T16:37:36.50598943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "624119f2-49f4-41b5-896e-d33f734300e7",
  "code": "954646",
  "device_ref": "sandbox-22088"
}
```

```json
{
  "session_id": "a34eb85d-bdaf-4e5d-946d-0049316d8402",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjM1NiwiaWF0IjoxNzkzMjA1NDU2LCJqdGkiOiI1MGNhZjg1NS04MzZkLTRmZjItOWZkMi0zYmJmMjIwMmMyMzMiLCJzaWQiOiJhMzRlYjg1ZC1iZGFmLTRlNWQtOTQ2ZC0wMDQ5MzE2ZDg0MDIifQ.ohQVh11-flixV2ING2V7PmttWCZePhENbJJxstGHwXU",
  "access_expires_at": "2026-10-28T16:52:36.775436435Z",
  "refresh_token": "gX04kSl2jkGHqhpRwWa-b4Kemy7WlujgK3Nki110UXE",
  "refresh_expires_at": "2026-11-27T16:37:36.775001009Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:25.417124Z",
  "last_location_at": "2026-10-28T16:37:25.417124Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6294dd0-9b69-40d6-b6d6-1b76421a6234/handover` → **200**

```json
{
  "command_id": "f0c4c471-e822-4fbb-b2bb-588e371eb076",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:25.417124Z",
  "last_location_at": "2026-10-28T16:37:25.417124Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6294dd0-9b69-40d6-b6d6-1b76421a6234/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:37Z",
    "sequence": 1793205457514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:37.529729Z",
  "last_location_at": "2026-10-28T16:37:37.529729Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666317910",
  "device_ref": "sandbox-7282"
}
```

```json
{
  "challenge_id": "1ef1377c-ae65-4abe-b706-d57e9c07ed4f",
  "expires_at": "2026-10-28T16:42:37.783781012Z",
  "resend_available_at": "2026-10-28T16:37:38.783781012Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666317910` → **200**

```json
{
  "phone": "+380666317910",
  "audience": "CLIENT",
  "code": "555820",
  "sent_at": "2026-10-28T16:37:37.786032882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ef1377c-ae65-4abe-b706-d57e9c07ed4f",
  "code": "555820",
  "device_ref": "sandbox-7282"
}
```

```json
{
  "session_id": "7409633b-6478-40b0-8793-e53b91286c12",
  "subject": {
    "type": "CLIENT",
    "id": "80fa8577-86fc-4172-a05f-ce98e24d68b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MGZhODU3Ny04NmZjLTQxNzItYTA1Zi1jZTk4ZTI0ZDY4YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzU4LCJpYXQiOjE3OTMyMDU0NTgsImp0aSI6IjFlM2NhY2Y3LWI1OTctNDYyMi1hM2I1LTgxOTU3MGU2YmFhYSIsInNpZCI6Ijc0MDk2MzNiLTY0NzgtNDBiMC04NzkzLWU1M2I5MTI4NmMxMiJ9.pKBt1VoSX-qNN5wGRgS2-PLU5YID2g0P3MrI7r-nqcM",
  "access_expires_at": "2026-10-28T16:52:38.057650507Z",
  "refresh_token": "DJjL1mv7RjfgVjCn4Vq3SXGFy1tzgkTlFS6ztE3nD38",
  "refresh_expires_at": "2026-11-27T16:37:38.05711026Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1f73c329-6543-4a47-9c26-a5e79f1a316f",
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
  "id": "b20dfbec-94f8-42ff-a707-c7c66a26af86",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:38.307369Z",
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
  "command_id": "3f579d85-ba4d-4ceb-b8d6-8537c1aefe26",
  "quote_id": "b20dfbec-94f8-42ff-a707-c7c66a26af86",
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
  "id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "80fa8577-86fc-4172-a05f-ce98e24d68b0",
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
  "created_at": "2026-10-28T16:37:38.570683Z",
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
    "id": "5e62ad9f-db52-4579-9483-76aa46087098",
    "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
    "expires_at": "2026-10-28T16:37:53.57363Z",
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

`POST /api/driver/v1/offers/5e62ad9f-db52-4579-9483-76aa46087098/accept` → **200**

```json
{
  "command_id": "fdf173f5-f7ae-4ddc-a5dd-02fed9f89a63"
}
```

```json
{
  "id": "feec89f0-f6fd-46cf-91a5-fa31015cba47",
  "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c0218f9-512f-4998-9f1d-55966d60a4b2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c0218f9-512f-4998-9f1d-55966d60a4b2",
  "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
  "assignment_id": "feec89f0-f6fd-46cf-91a5-fa31015cba47",
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

`POST /api/driver/v1/work-sessions/e6294dd0-9b69-40d6-b6d6-1b76421a6234/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:39Z",
    "sequence": 1793205459586
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:39.601136Z",
  "last_location_at": "2026-10-28T16:37:39.601136Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6c0218f9-512f-4998-9f1d-55966d60a4b2/arrive` → **200**

```json
{
  "command_id": "c9f3eb53-1253-489b-99e8-1e81fbdcefd2",
  "expected_version": 0
}
```

```json
{
  "id": "6c0218f9-512f-4998-9f1d-55966d60a4b2",
  "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
  "assignment_id": "feec89f0-f6fd-46cf-91a5-fa31015cba47",
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
  "arrived_at": "2026-10-28T16:37:39.862775Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c0218f9-512f-4998-9f1d-55966d60a4b2/start` → **200**

```json
{
  "command_id": "695eb062-8805-41cd-9670-9263129185bd",
  "expected_version": 1
}
```

```json
{
  "id": "6c0218f9-512f-4998-9f1d-55966d60a4b2",
  "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
  "assignment_id": "feec89f0-f6fd-46cf-91a5-fa31015cba47",
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
  "arrived_at": "2026-10-28T16:37:39.862775Z",
  "started_at": "2026-10-28T16:37:40.119376Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e6294dd0-9b69-40d6-b6d6-1b76421a6234/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:40Z",
    "sequence": 1793205460361
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:40.376218Z",
  "last_location_at": "2026-10-28T16:37:40.376218Z",
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
  "device_ref": "sandbox-7584"
}
```

```json
{
  "challenge_id": "29dbceb0-ca8c-4dd9-b438-68f43256b1b4",
  "expires_at": "2026-10-28T16:42:40.612547816Z",
  "resend_available_at": "2026-10-28T16:37:41.612547816Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "754651",
  "sent_at": "2026-10-28T16:37:40.614695925Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29dbceb0-ca8c-4dd9-b438-68f43256b1b4",
  "code": "754651",
  "device_ref": "sandbox-7584"
}
```

```json
{
  "session_id": "2078711f-3739-442b-9819-ab99ebfdec9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjM2MCwiaWF0IjoxNzkzMjA1NDYwLCJqdGkiOiIwZmYxMjMyNi1iMzIyLTRlZWYtOTUwNS1kZjExODJjMGFmYmYiLCJzaWQiOiIyMDc4NzExZi0zNzM5LTQ0MmItOTgxOS1hYjk5ZWJmZGVjOWQifQ.rn7adNW8peAZjvr7AV5i4VqF9PYy36zy1D55FKhwwA8",
  "access_expires_at": "2026-10-28T16:52:40.888209428Z",
  "refresh_token": "pErEIUKpelpG5_FWJ9PtVAvfVKnvHr3U_HCKn8SUk9A",
  "refresh_expires_at": "2026-11-27T16:37:40.887662429Z",
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
  "command_id": "cce452ca-3ee7-4960-ab9d-f82ee2584ee7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:41Z",
    "sequence": 1793205461369
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "30766998-d69f-4714-9236-7fd8e6979d78",
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
  "last_heartbeat_at": "2026-10-28T16:37:41.384523Z",
  "last_location_at": "2026-10-28T16:37:41.384523Z",
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
  "session_id": "c1dcf190-355d-4aee-a9a4-8b68212ad0fe",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzNjEsImlhdCI6MTc5MzIwNTQ2MSwianRpIjoiZjQ5MzJjMjEtYzk1Ny00N2RmLThlOGUtNDIwMGFjMWE3ZjY1Iiwic2lkIjoiYzFkY2YxOTAtMzU1ZC00YWVlLWE5YTQtOGI2ODIxMmFkMGZlIn0.HvyfJuKr9ivBYah7pEFcEusW99gXhuuRlBOARY5gpuA",
  "access_expires_at": "2026-10-28T16:52:41.904198211Z",
  "refresh_token": "fi8pyyv4-bf9bV4FX4GcIgbMfd9Ki0DqHscnz5XDqpU",
  "refresh_expires_at": "2026-10-29T04:37:41.903518126Z",
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
  "session_id": "35adda9e-0e71-4106-b8f7-c5e40847abc1",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzNjIsImlhdCI6MTc5MzIwNTQ2MiwianRpIjoiYzUzMjMyODMtMTk1MS00YWEwLTgxZmMtNTdmNTQyNGEzMTMzIiwic2lkIjoiMzVhZGRhOWUtMGU3MS00MTA2LWI4ZjctYzVlNDA4NDdhYmMxIn0.GmrzT4YshIvgJVhfw_yxX1Rwt4JrKBWsRAJw_Y0__uo",
  "access_expires_at": "2026-10-28T16:52:42.423971487Z",
  "refresh_token": "mQ0m6iiwNRQpCMk8Ykrrl6eY3jjoRtRMGe-byoNBd-w",
  "refresh_expires_at": "2026-10-29T04:37:42.423484877Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d09f6591-0d62-48ba-af11-9cc7d6566faa` → **200**

```json
{
  "id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
  "short_number": 12,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "80fa8577-86fc-4172-a05f-ce98e24d68b0",
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
    "id": "feec89f0-f6fd-46cf-91a5-fa31015cba47",
    "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6c0218f9-512f-4998-9f1d-55966d60a4b2",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T16:37:38.570683Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d09f6591-0d62-48ba-af11-9cc7d6566faa/interrupt` → **200**

```json
{
  "command_id": "db850b08-e27f-4348-9e4c-f7f22f2ae402",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
    "short_number": 12,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "80fa8577-86fc-4172-a05f-ce98e24d68b0",
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
      "id": "feec89f0-f6fd-46cf-91a5-fa31015cba47",
      "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "6c0218f9-512f-4998-9f1d-55966d60a4b2",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T16:37:38.570683Z",
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
    "id": "4a968fe7-449a-415c-99ca-a89a17080f03",
    "short_number": 13,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "80fa8577-86fc-4172-a05f-ce98e24d68b0",
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
    "id": "744d1b31-f7ed-42f1-b31e-5a2e15c86aa4",
    "order_id": "4a968fe7-449a-415c-99ca-a89a17080f03",
    "expires_at": "2026-10-28T16:37:57.952794Z",
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

`POST /api/driver/v1/offers/744d1b31-f7ed-42f1-b31e-5a2e15c86aa4/accept` → **200**

```json
{
  "command_id": "903dc2d6-8c79-4470-a75d-fc1cec0b9b3d"
}
```

```json
{
  "id": "31a98f5d-03b5-4a9d-be28-5ce5445e1ed2",
  "order_id": "4a968fe7-449a-415c-99ca-a89a17080f03",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "807fed0a-108c-4dda-a5cd-26438350288d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "807fed0a-108c-4dda-a5cd-26438350288d",
  "order_id": "4a968fe7-449a-415c-99ca-a89a17080f03",
  "assignment_id": "31a98f5d-03b5-4a9d-be28-5ce5445e1ed2",
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
  "session_id": "30766998-d69f-4714-9236-7fd8e6979d78",
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
  "last_heartbeat_at": "2026-10-28T16:37:41.384523Z",
  "last_location_at": "2026-10-28T16:37:41.384523Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/30766998-d69f-4714-9236-7fd8e6979d78/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:44Z",
    "sequence": 1793205464200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "30766998-d69f-4714-9236-7fd8e6979d78",
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
  "last_heartbeat_at": "2026-10-28T16:37:44.215304Z",
  "last_location_at": "2026-10-28T16:37:44.215304Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/807fed0a-108c-4dda-a5cd-26438350288d/arrive` → **200**

```json
{
  "command_id": "95c16ce5-3648-4cf6-a92e-9338dd5b35b4",
  "expected_version": 0
}
```

```json
{
  "id": "807fed0a-108c-4dda-a5cd-26438350288d",
  "order_id": "4a968fe7-449a-415c-99ca-a89a17080f03",
  "assignment_id": "31a98f5d-03b5-4a9d-be28-5ce5445e1ed2",
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
  "arrived_at": "2026-10-28T16:37:44.477501Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/807fed0a-108c-4dda-a5cd-26438350288d/start` → **200**

```json
{
  "command_id": "04857199-f0fb-4198-ad07-bb990b2f75b7",
  "expected_version": 1
}
```

```json
{
  "id": "807fed0a-108c-4dda-a5cd-26438350288d",
  "order_id": "4a968fe7-449a-415c-99ca-a89a17080f03",
  "assignment_id": "31a98f5d-03b5-4a9d-be28-5ce5445e1ed2",
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
  "arrived_at": "2026-10-28T16:37:44.477501Z",
  "started_at": "2026-10-28T16:37:44.734335Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/807fed0a-108c-4dda-a5cd-26438350288d/complete` → **200**

```json
{
  "command_id": "805d173a-26c0-45f5-a60b-1bb7251c5dbb",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:37:44Z"
}
```

```json
{
  "id": "807fed0a-108c-4dda-a5cd-26438350288d",
  "order_id": "4a968fe7-449a-415c-99ca-a89a17080f03",
  "assignment_id": "31a98f5d-03b5-4a9d-be28-5ce5445e1ed2",
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
  "arrived_at": "2026-10-28T16:37:44.477501Z",
  "started_at": "2026-10-28T16:37:44.734335Z",
  "completed_at": "2026-10-28T16:37:45.01217Z",
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
    "id": "4a968fe7-449a-415c-99ca-a89a17080f03",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-28T16:37:42.943699Z",
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
    "id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
    "short_number": 12,
    "status": "CANCELLED",
    "created_at": "2026-10-28T16:37:38.570683Z",
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

`GET /api/operator/v1/orders/d09f6591-0d62-48ba-af11-9cc7d6566faa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T16:37:38.571174Z",
      "actor": {
        "type": "CLIENT",
        "id": "80fa8577-86fc-4172-a05f-ce98e24d68b0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
        "quote_id": "b20dfbec-94f8-42ff-a707-c7c66a26af86",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "efc9548e-5c22-4017-ac0d-fcad6897f4fb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T16:37:38.572913Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
        "attempt_id": "de6d1e65-c066-4306-af5c-725ae2cca35d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "efc9548e-5c22-4017-ac0d-fcad6897f4fb"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T16:37:38.575816Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5e62ad9f-db52-4579-9483-76aa46087098",
        "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "efc9548e-5c22-4017-ac0d-fcad6897f4fb"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T16:37:39.093623Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5e62ad9f-db52-4579-9483-76aa46087098",
        "order_id": "d09f6591-0d62-48ba-af11-9cc7d6566faa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "feec89f0-f6fd-46cf-91a5-fa31015cba47"
      },
      "correlation_id": "6848f1cc-0386-4d8b-a1b0-ba697ca696d8"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/4a968fe7-449a-415c-99ca-a89a17080f03/tip` → **200**

```json
{
  "order_id": "4a968fe7-449a-415c-99ca-a89a17080f03",
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
  "available_until": "2026-10-29T16:37:45.01217Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/4a968fe7-449a-415c-99ca-a89a17080f03/tip` → **409**

```json
{
  "command_id": "5429dc9d-0555-493e-b3ce-a26340fbe92f",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/4a968fe7-449a-415c-99ca-a89a17080f03/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "22e321fe-5bee-4d0e-99c8-058f3da301c5"
}
```

Done: interrupted d09f6591-0d62-48ba-af11-9cc7d6566faa, follow-up 4a968fe7-449a-415c-99ca-a89a17080f03.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6294dd0-9b69-40d6-b6d6-1b76421a6234",
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
  "last_heartbeat_at": "2026-10-28T16:37:40.376218Z",
  "last_location_at": "2026-10-28T16:37:40.376218Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6294dd0-9b69-40d6-b6d6-1b76421a6234/close` → **200**

```json
{
  "command_id": "07e4632b-0a1e-4113-b2a6-8db7681085db",
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
  "session_id": "30766998-d69f-4714-9236-7fd8e6979d78",
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
  "last_heartbeat_at": "2026-10-28T16:37:44.215304Z",
  "last_location_at": "2026-10-28T16:37:44.215304Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/30766998-d69f-4714-9236-7fd8e6979d78/close` → **200**

```json
{
  "command_id": "a4ed3cd5-d8ce-4411-ad4d-f1a7e2de8d02",
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
  "session_id": "31e175fd-8f8f-46d6-b0c8-c873e27d4349",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzNzAsImlhdCI6MTc5MzIwNTQ3MCwianRpIjoiODFmMTRhOWMtMmUxZi00YzIyLTk5YjMtZWY2MDMyZGMxN2NlIiwic2lkIjoiMzFlMTc1ZmQtOGY4Zi00NmQ2LWIwYzgtYzg3M2UyN2Q0MzQ5In0.y-ZB1YBk9E2mdPh0YJBbPFl3798oUSXZ2gd9luz-B54",
  "access_expires_at": "2026-10-28T16:52:50.860693168Z",
  "refresh_token": "uXj-F4vd-q--x8RgXT2BIdj5G3HQytKllQ6xgLeASdk",
  "refresh_expires_at": "2026-10-29T04:37:50.860174347Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "779b250e-ac96-456b-84b2-756b0e3f5a67",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:37:51Z"
}
```

```json
{
  "id": "3439f32b-257a-4ca0-937e-ae6acea1c55b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:37:51Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3439f32b-257a-4ca0-937e-ae6acea1c55b/publish` → **200**

```json
{
  "command_id": "7fa296e4-3699-4532-92db-22b92412cc4d",
  "expected_version": 0
}
```

```json
{
  "id": "3439f32b-257a-4ca0-937e-ae6acea1c55b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:37:51.396171Z",
  "published_at": "2026-10-28T16:37:51.396171Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "3439f32b-257a-4ca0-937e-ae6acea1c55b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T16:37:51.396171Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631432681",
  "device_ref": "sandbox-29853"
}
```

```json
{
  "challenge_id": "7437ffe7-60d8-4132-b6ba-7c4242bc1eed",
  "expires_at": "2026-10-28T16:42:51.874376707Z",
  "resend_available_at": "2026-10-28T16:37:52.874376707Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631432681` → **200**

```json
{
  "phone": "+380631432681",
  "audience": "CLIENT",
  "code": "669150",
  "sent_at": "2026-10-28T16:37:51.876524708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7437ffe7-60d8-4132-b6ba-7c4242bc1eed",
  "code": "669150",
  "device_ref": "sandbox-29853"
}
```

```json
{
  "session_id": "c61738e8-1f7d-44f6-8158-6d89c2f99720",
  "subject": {
    "type": "CLIENT",
    "id": "ab923883-8609-439f-af2a-19d0c0f3bf94"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYjkyMzg4My04NjA5LTQzOWYtYWYyYS0xOWQwYzBmM2JmOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2MzcyLCJpYXQiOjE3OTMyMDU0NzIsImp0aSI6IjAwNDQ1M2Y1LWFiNTMtNDk3OS04NWE5LTc0MzYwNzU2MGFmNCIsInNpZCI6ImM2MTczOGU4LTFmN2QtNDRmNi04MTU4LTZkODljMmY5OTcyMCJ9.TVaBYBQf7pO_XKJkx7ZSZOi_yaZ6nFfb00DB7q-lzEE",
  "access_expires_at": "2026-10-28T16:52:52.147936863Z",
  "refresh_token": "yZfPJbhc3Ss6O1GxT-nnjmlBBgRLf_4utZ02zxv0XKM",
  "refresh_expires_at": "2026-11-27T16:37:52.147314871Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "3439f32b-257a-4ca0-937e-ae6acea1c55b",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T16:37:51.396171Z",
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
  "command_id": "3bcdceea-524a-4054-902d-df3871c5eccd",
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
  "id": "824223c7-2e74-48d2-aef2-3b10f6a27588",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:52.648862Z",
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
  "command_id": "957ea475-671a-4ff4-8ec9-75a1939fb358",
  "quote_id": "824223c7-2e74-48d2-aef2-3b10f6a27588",
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
  "correlation_id": "dd2be392-58fa-498f-9241-16cda5404fb8"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "23eac87b-5973-4093-9573-c803a950e20c",
  "version_id": "3439f32b-257a-4ca0-937e-ae6acea1c55b",
  "language": "uk"
}
```

```json
{
  "version_id": "3439f32b-257a-4ca0-937e-ae6acea1c55b",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T16:37:53.16428Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ee51b477-5911-4804-8736-8b81d4fd6da9",
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
  "id": "f9fda6fd-6be3-4410-bc75-73bd1da055a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:53.411817Z",
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
  "command_id": "935e8672-fdaa-484c-a7c8-1dd7d799bfe8",
  "quote_id": "f9fda6fd-6be3-4410-bc75-73bd1da055a5",
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
  "id": "1c13d270-9202-4b44-9512-3633d80d2264",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ab923883-8609-439f-af2a-19d0c0f3bf94",
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
  "created_at": "2026-10-28T16:37:53.662469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1c13d270-9202-4b44-9512-3633d80d2264` → **200**

```json
{
  "id": "1c13d270-9202-4b44-9512-3633d80d2264",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ab923883-8609-439f-af2a-19d0c0f3bf94",
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
  "created_at": "2026-10-28T16:37:53.662469Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1c13d270-9202-4b44-9512-3633d80d2264/cancel` → **200**

```json
{
  "command_id": "aadf6778-2843-45b0-a10c-7538c04415a2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1c13d270-9202-4b44-9512-3633d80d2264",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ab923883-8609-439f-af2a-19d0c0f3bf94",
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
  "created_at": "2026-10-28T16:37:53.662469Z",
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

`POST /api/admin/v1/legal-documents/3439f32b-257a-4ca0-937e-ae6acea1c55b` → **409**

```json
{
  "command_id": "32cecbce-be77-433a-86fc-5a19e9e85d0b",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T16:37:54Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/3439f32b-257a-4ca0-937e-ae6acea1c55b",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2e9d9813-f119-4be7-b56d-42ab2c6505c3"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "13f1a332-39d4-45f7-bd3a-f0c0119f0a8f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:37:54Z"
}
```

```json
{
  "id": "ec6564c5-6af4-4d63-8dd7-b1726db8da06",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:37:54Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/ec6564c5-6af4-4d63-8dd7-b1726db8da06/publish` → **200**

```json
{
  "command_id": "469037e6-24eb-4780-b995-9a3430ad73de",
  "expected_version": 0
}
```

```json
{
  "id": "ec6564c5-6af4-4d63-8dd7-b1726db8da06",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T16:37:54.975563Z",
  "published_at": "2026-10-28T16:37:54.975563Z",
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
  "device_ref": "sandbox-10290"
}
```

```json
{
  "challenge_id": "06355a71-33d4-4bd8-be9f-09f7de2352ef",
  "expires_at": "2026-10-28T16:42:55.226936049Z",
  "resend_available_at": "2026-10-28T16:37:56.226936049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "761780",
  "sent_at": "2026-10-28T16:37:55.229347391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "06355a71-33d4-4bd8-be9f-09f7de2352ef",
  "code": "761780",
  "device_ref": "sandbox-10290"
}
```

```json
{
  "session_id": "2a14f07e-0f01-46ed-afff-5672364371d7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjM3NSwiaWF0IjoxNzkzMjA1NDc1LCJqdGkiOiJlMTY5OGY3ZS1hMWJmLTRkMzktYmQxYy0yNzA5Njg3ZWQxNzMiLCJzaWQiOiIyYTE0ZjA3ZS0wZjAxLTQ2ZWQtYWZmZi01NjcyMzY0MzcxZDcifQ.Idg2h0GyN36m3haJ64ZVKnL_22coeUMfK0WvC_2SrmU",
  "access_expires_at": "2026-10-28T16:52:55.520457772Z",
  "refresh_token": "lwUSQRtIqg0gM77w7kcp8FKc8-e8C4xO_6IpgMIFvTI",
  "refresh_expires_at": "2026-11-27T16:37:55.519877941Z",
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
  "command_id": "680b9125-e319-4195-9f10-23dff55ff7b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:37:56Z",
    "sequence": 1793205476232
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d48c3b85-85ff-434f-a296-4bb44780906f",
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
  "last_heartbeat_at": "2026-10-28T16:37:56.016695Z",
  "last_location_at": "2026-10-28T16:37:56.016695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671586148",
  "device_ref": "sandbox-6286"
}
```

```json
{
  "challenge_id": "78ed7bac-6018-4627-8635-d92113e0d7d5",
  "expires_at": "2026-10-28T16:42:56.268195498Z",
  "resend_available_at": "2026-10-28T16:37:57.268195498Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671586148` → **200**

```json
{
  "phone": "+380671586148",
  "audience": "CLIENT",
  "code": "591269",
  "sent_at": "2026-10-28T16:37:56.270181193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78ed7bac-6018-4627-8635-d92113e0d7d5",
  "code": "591269",
  "device_ref": "sandbox-6286"
}
```

```json
{
  "session_id": "04fe7413-53a2-4c14-9b8c-bed8f042bc8f",
  "subject": {
    "type": "CLIENT",
    "id": "55fce3be-f4c6-415a-8669-b90e94950d59"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWZjZTNiZS1mNGM2LTQxNWEtODY2OS1iOTBlOTQ5NTBkNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2Mzc2LCJpYXQiOjE3OTMyMDU0NzYsImp0aSI6IjYxMWQzOWFhLWQ2MGEtNDgzNy04MGYzLTcxYzQyNjE3ZGU2OSIsInNpZCI6IjA0ZmU3NDEzLTUzYTItNGMxNC05YjhjLWJlZDhmMDQyYmM4ZiJ9.0K3H5Tx4Eoo11ZwlMJes0oVBOXJ_zEgFOqJjXCVx1GU",
  "access_expires_at": "2026-10-28T16:52:56.529996058Z",
  "refresh_token": "TwxCMLyIsdHAlEgehaTJR-Lcy-s9hialnVvZtrOZWj4",
  "refresh_expires_at": "2026-11-27T16:37:56.529351689Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b41dfec-9dc8-405f-af29-e18641bf3293",
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
  "id": "f30897e9-35d9-4470-8ce1-6e96fc3a3138",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:56.785901Z",
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
  "command_id": "0cab699c-b5bf-409b-9aa1-4aaac9c737af",
  "quote_id": "f30897e9-35d9-4470-8ce1-6e96fc3a3138",
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
    "phone": "+380670319816"
  }
}
```

```json
{
  "id": "69028968-3a74-421b-a75f-c0c271df3057",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
  "created_at": "2026-10-28T16:37:57.054118Z",
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
    "id": "e18cf603-94f9-44fa-a513-c3567ffc68d3",
    "order_id": "69028968-3a74-421b-a75f-c0c271df3057",
    "expires_at": "2026-10-28T16:38:12.057184Z",
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

`POST /api/driver/v1/offers/e18cf603-94f9-44fa-a513-c3567ffc68d3/accept` → **200**

```json
{
  "command_id": "c2753d65-d3cd-49f3-881b-ec9786550efb"
}
```

```json
{
  "id": "e3cfd146-5e30-46b6-a566-88e391e5712b",
  "order_id": "69028968-3a74-421b-a75f-c0c271df3057",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "641393fb-ba6e-4624-a079-d1f242190266",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "641393fb-ba6e-4624-a079-d1f242190266",
  "order_id": "69028968-3a74-421b-a75f-c0c271df3057",
  "assignment_id": "e3cfd146-5e30-46b6-a566-88e391e5712b",
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
    "phone": "+380670319816"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "edbdd108-efb9-4df4-a417-f8602dbb1fc1",
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
  "id": "040d1f2c-6dbd-4e8a-81c8-58d343da1c7a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:58.071271Z",
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
  "command_id": "afe3077c-2dd6-4e57-a666-6947756579d2",
  "quote_id": "040d1f2c-6dbd-4e8a-81c8-58d343da1c7a",
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
  "id": "d13e23b2-0b1d-44c9-9a3d-1e99a726cbaf",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
  "created_at": "2026-10-28T16:37:58.336634Z",
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
  "command_id": "dd6c1e6b-e911-416e-93df-8daf89284b3c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T19:37:58Z"
}
```

```json
{
  "id": "e8f9f112-e037-47d3-b385-ace7852d06c6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:58.608472Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:37:58Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "94a0f1b0-5388-4da2-9f5a-c66fd9a05aff",
  "quote_id": "e8f9f112-e037-47d3-b385-ace7852d06c6",
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
  "pickup_at": "2026-10-28T19:37:58Z"
}
```

```json
{
  "id": "c89d26de-60af-44aa-8bb4-93d2108dc753",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
  "created_at": "2026-10-28T16:37:58.866291Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:37:58Z",
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
  "command_id": "ee169c02-b167-4389-bac8-eec61788da48",
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
  "id": "3b1c5c85-0b04-4353-9f98-27f3d57c69d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:42:59.132646Z",
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
  "command_id": "4bfc450f-21fe-463b-9bc6-82bc6454ab50",
  "quote_id": "3b1c5c85-0b04-4353-9f98-27f3d57c69d6",
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
  "correlation_id": "521aff8c-0598-49a5-8f50-158be03d76d5"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "c89d26de-60af-44aa-8bb4-93d2108dc753",
      "short_number": 17,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
      "created_at": "2026-10-28T16:37:58.866291Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T19:37:58Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d13e23b2-0b1d-44c9-9a3d-1e99a726cbaf",
      "short_number": 16,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
      "created_at": "2026-10-28T16:37:58.336634Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "69028968-3a74-421b-a75f-c0c271df3057",
      "short_number": 15,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d13e23b2-0b1d-44c9-9a3d-1e99a726cbaf",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
  "created_at": "2026-10-28T16:37:58.336634Z",
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

`GET /api/rider/v1/orders/69028968-3a74-421b-a75f-c0c271df3057` → **200**

```json
{
  "id": "69028968-3a74-421b-a75f-c0c271df3057",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
    "id": "e3cfd146-5e30-46b6-a566-88e391e5712b",
    "order_id": "69028968-3a74-421b-a75f-c0c271df3057",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "641393fb-ba6e-4624-a079-d1f242190266",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T16:37:57.054118Z",
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
    "location_at": "2026-10-28T16:37:56.016695Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/69028968-3a74-421b-a75f-c0c271df3057/cancel` → **200**

```json
{
  "command_id": "2d5fe014-6f35-4f36-8051-a502159b3aa5",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "69028968-3a74-421b-a75f-c0c271df3057",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
    "id": "e3cfd146-5e30-46b6-a566-88e391e5712b",
    "order_id": "69028968-3a74-421b-a75f-c0c271df3057",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "641393fb-ba6e-4624-a079-d1f242190266",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T16:37:57.054118Z",
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

`GET /api/rider/v1/orders/d13e23b2-0b1d-44c9-9a3d-1e99a726cbaf` → **200**

```json
{
  "id": "d13e23b2-0b1d-44c9-9a3d-1e99a726cbaf",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
  "created_at": "2026-10-28T16:37:58.336634Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d13e23b2-0b1d-44c9-9a3d-1e99a726cbaf/cancel` → **200**

```json
{
  "command_id": "4bf1fde1-79cd-4f21-9e5f-09bc44eb1aea",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d13e23b2-0b1d-44c9-9a3d-1e99a726cbaf",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
  "created_at": "2026-10-28T16:37:58.336634Z",
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

`GET /api/rider/v1/orders/c89d26de-60af-44aa-8bb4-93d2108dc753` → **200**

```json
{
  "id": "c89d26de-60af-44aa-8bb4-93d2108dc753",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
  "created_at": "2026-10-28T16:37:58.866291Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:37:58Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c89d26de-60af-44aa-8bb4-93d2108dc753/cancel` → **200**

```json
{
  "command_id": "ccfae428-b6bc-498e-a0b6-a7dacf480013",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c89d26de-60af-44aa-8bb4-93d2108dc753",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "55fce3be-f4c6-415a-8669-b90e94950d59",
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
  "created_at": "2026-10-28T16:37:58.866291Z",
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
  "pickup_at": "2026-10-28T19:37:58Z",
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
  "session_id": "d48c3b85-85ff-434f-a296-4bb44780906f",
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
  "last_heartbeat_at": "2026-10-28T16:37:56.016695Z",
  "last_location_at": "2026-10-28T16:37:56.016695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d48c3b85-85ff-434f-a296-4bb44780906f/close` → **200**

```json
{
  "command_id": "0b7cc0a1-6548-4a3c-9e4b-27cede49ee5f",
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

Done: orders 69028968-3a74-421b-a75f-c0c271df3057, d13e23b2-0b1d-44c9-9a3d-1e99a726cbaf, c89d26de-60af-44aa-8bb4-93d2108dc753.

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
  "session_id": "6ce74c7d-130c-49ea-a9be-c7e81e63ac9c",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzODIsImlhdCI6MTc5MzIwNTQ4MiwianRpIjoiMThhM2MwMzItYjAwYS00NzAyLTllNDktZTE5MjU4NzQzMzQ1Iiwic2lkIjoiNmNlNzRjN2QtMTMwYy00OWVhLWE5YmUtYzdlODFlNjNhYzljIn0.tMe7xxs9HDU3PznZMqVHwEEbNGg1o0L_pwUzVRxBQzU",
  "access_expires_at": "2026-10-28T16:53:02.507927328Z",
  "refresh_token": "jHJ9RGvxiJQDM1Wb_XzYDm9vGVs-ZG0UA469avgKWro",
  "refresh_expires_at": "2026-10-29T04:38:02.507417122Z",
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
  "session_id": "3c996cc9-45bb-48a4-b901-7138a5cb2986",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzODMsImlhdCI6MTc5MzIwNTQ4MywianRpIjoiZDZiYTY5ZTctM2U2OC00YTIxLTgxNjItOTFkZjgzNTRhZGFlIiwic2lkIjoiM2M5OTZjYzktNDViYi00OGE0LWI5MDEtNzEzOGE1Y2IyOTg2In0.S_z3dhkSuz1PX4m7tMUgnmCQOyR0zrPbCd156uAGA7c",
  "access_expires_at": "2026-10-28T16:53:03.025434357Z",
  "refresh_token": "k2PNM7Kn_1tl_KLnjtpIB9cDOV_12dfehSxWP41zcWo",
  "refresh_expires_at": "2026-10-29T04:38:03.024926044Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13502"
}
```

```json
{
  "challenge_id": "57cf9676-ad85-4b37-8308-c069612a8308",
  "expires_at": "2026-10-28T16:43:03.265699786Z",
  "resend_available_at": "2026-10-28T16:38:04.265699786Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "203768",
  "sent_at": "2026-10-28T16:38:03.267771763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57cf9676-ad85-4b37-8308-c069612a8308",
  "code": "203768",
  "device_ref": "sandbox-13502"
}
```

```json
{
  "session_id": "1456e41a-72fe-4fa9-b112-ff468fa0bfe6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjM4MywiaWF0IjoxNzkzMjA1NDgzLCJqdGkiOiI0MWQyMGYwZC1jMTk5LTRlNTQtYjIyYy1lZjI4M2I2MzM1NDkiLCJzaWQiOiIxNDU2ZTQxYS03MmZlLTRmYTktYjExMi1mZjQ2OGZhMGJmZTYifQ.obBBAKT_UJaiPXFUfrOlMxvZWmro4bmqWaB1V0H_XGM",
  "access_expires_at": "2026-10-28T16:53:03.530660968Z",
  "refresh_token": "D1fuOI3MFjESE5I5BHZx4tgOGMhG4iRbq01w0qe78t8",
  "refresh_expires_at": "2026-11-27T16:38:03.530096168Z",
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
  "command_id": "459b0eb7-1d85-4671-8a17-a6b978efbf62",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:04Z",
    "sequence": 1793205484339
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "da327ae7-4b3e-4b48-b59d-9b24de6af91e",
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
  "last_heartbeat_at": "2026-10-28T16:38:04.048585Z",
  "last_location_at": "2026-10-28T16:38:04.048585Z",
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
  "command_id": "d1163b7f-a332-401f-91d0-52e2985e2f47",
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
  "effective_at": "2026-10-28T16:38:04.561588Z",
  "changed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T16:36:03.996589Z",
  "last_entries": [
    {
      "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T16:36:03.996589Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "70200dbc-3e6a-4162-b3a4-7eb688f2ad6c",
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
  "id": "52e3ab32-c5c1-416f-97fb-8047c1939458",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:43:05.079255Z",
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
  "command_id": "1c58213d-a25b-4854-a92e-3fa4d69e5788",
  "quote_id": "52e3ab32-c5c1-416f-97fb-8047c1939458",
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
    "phone": "+3806711117922"
  }
}
```

```json
{
  "id": "6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27",
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
  "created_at": "2026-10-28T16:38:05.348658Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117922"
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
    "id": "74092cc3-5180-40ab-90ea-f36a478230bf",
    "order_id": "6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27",
    "expires_at": "2026-10-28T16:38:20.351943Z",
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

`POST /api/driver/v1/offers/74092cc3-5180-40ab-90ea-f36a478230bf/accept` → **200**

```json
{
  "command_id": "3416f4a8-2a65-4c84-9853-c8443786cccc"
}
```

```json
{
  "id": "18376a79-6a2e-4344-81e0-b609609f76c5",
  "order_id": "6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "954ba01b-dbf8-40ac-8113-05be377ef3dc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "954ba01b-dbf8-40ac-8113-05be377ef3dc",
  "order_id": "6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27",
  "assignment_id": "18376a79-6a2e-4344-81e0-b609609f76c5",
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
    "phone": "+3806711117922"
  }
}
```

`POST /api/driver/v1/work-sessions/da327ae7-4b3e-4b48-b59d-9b24de6af91e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:06Z",
    "sequence": 1793205486339
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "da327ae7-4b3e-4b48-b59d-9b24de6af91e",
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
  "last_heartbeat_at": "2026-10-28T16:38:06.354461Z",
  "last_location_at": "2026-10-28T16:38:06.354461Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/954ba01b-dbf8-40ac-8113-05be377ef3dc/arrive` → **200**

```json
{
  "command_id": "a5e4cb7e-996b-4daa-9c0e-424dc6ec5f19",
  "expected_version": 0
}
```

```json
{
  "id": "954ba01b-dbf8-40ac-8113-05be377ef3dc",
  "order_id": "6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27",
  "assignment_id": "18376a79-6a2e-4344-81e0-b609609f76c5",
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
  "arrived_at": "2026-10-28T16:38:06.60845Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711117922"
  }
}
```

`POST /api/driver/v1/trips/954ba01b-dbf8-40ac-8113-05be377ef3dc/start` → **200**

```json
{
  "command_id": "9bd0af7b-3a9b-4e4f-b48b-3b2cf3ecafda",
  "expected_version": 1
}
```

```json
{
  "id": "954ba01b-dbf8-40ac-8113-05be377ef3dc",
  "order_id": "6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27",
  "assignment_id": "18376a79-6a2e-4344-81e0-b609609f76c5",
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
  "arrived_at": "2026-10-28T16:38:06.60845Z",
  "started_at": "2026-10-28T16:38:06.87348Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711117922"
  }
}
```

`POST /api/driver/v1/trips/954ba01b-dbf8-40ac-8113-05be377ef3dc/complete` → **200**

```json
{
  "command_id": "a0d90217-8749-46e4-b99e-61b1229b153a",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:38:07Z",
  "cash_received": true
}
```

```json
{
  "id": "954ba01b-dbf8-40ac-8113-05be377ef3dc",
  "order_id": "6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27",
  "assignment_id": "18376a79-6a2e-4344-81e0-b609609f76c5",
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
  "arrived_at": "2026-10-28T16:38:06.60845Z",
  "started_at": "2026-10-28T16:38:06.87348Z",
  "completed_at": "2026-10-28T16:38:07.133047Z",
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
  "command_id": "a76e610f-2413-42b5-9f80-b92af39a9ee8",
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
  "id": "129f439a-e52d-4c01-bb5b-808e8524e5d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:43:07.400076Z",
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
  "command_id": "fbf2018f-bae0-40d9-b302-4305acefd853",
  "quote_id": "129f439a-e52d-4c01-bb5b-808e8524e5d3",
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
    "phone": "+3806711131876"
  }
}
```

```json
{
  "id": "19122d32-0d56-4369-afcd-69c3b9f1e428",
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
  "created_at": "2026-10-28T16:38:07.653766Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131876"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/19122d32-0d56-4369-afcd-69c3b9f1e428` → **200**

```json
{
  "id": "19122d32-0d56-4369-afcd-69c3b9f1e428",
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
  "created_at": "2026-10-28T16:38:07.653766Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131876"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/19122d32-0d56-4369-afcd-69c3b9f1e428/cancel` → **200**

```json
{
  "command_id": "bc7f8677-1d34-4ce9-b02d-b8ae8de9612d",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "19122d32-0d56-4369-afcd-69c3b9f1e428",
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
  "created_at": "2026-10-28T16:38:07.653766Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131876"
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
  "staff_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T16:36:03.996589Z",
  "last_entries": [
    {
      "order_id": "19122d32-0d56-4369-afcd-69c3b9f1e428",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T16:38:08.186237Z"
    },
    {
      "order_id": "6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T16:38:07.137498Z"
    },
    {
      "order_id": "47420504-2ace-4425-bd84-39fe5e68ccac",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T16:36:03.996589Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "da327ae7-4b3e-4b48-b59d-9b24de6af91e",
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
  "last_heartbeat_at": "2026-10-28T16:38:06.354461Z",
  "last_location_at": "2026-10-28T16:38:06.354461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/da327ae7-4b3e-4b48-b59d-9b24de6af91e/close` → **200**

```json
{
  "command_id": "31bda4a8-6b75-4690-83b0-4b671f4b2015",
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

Done: operator bonus for fulfilled 6d1a6c3f-0e7e-43a0-a7a9-248d51ae6f27 and operator-fault cancellation 19122d32-0d56-4369-afcd-69c3b9f1e428.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677266859",
  "device_ref": "sandbox-11469"
}
```

```json
{
  "challenge_id": "c5ca8bcc-e11a-4af8-8752-2430bb117ffe",
  "expires_at": "2026-10-28T16:43:11.229426752Z",
  "resend_available_at": "2026-10-28T16:38:12.229426752Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677266859` → **200**

```json
{
  "phone": "+380677266859",
  "audience": "CLIENT",
  "code": "972644",
  "sent_at": "2026-10-28T16:38:11.2317701Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675656799",
  "device_ref": "sandbox-926",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "f794cb4b-5c62-4f86-a834-1ca35a09ecb9",
  "expires_at": "2026-10-28T16:43:11.506111479Z",
  "resend_available_at": "2026-10-28T16:38:12.506111479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675656799` → **200**

```json
{
  "phone": "+380675656799",
  "audience": "CLIENT",
  "code": "176453",
  "sent_at": "2026-10-28T16:38:11.508607951Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670100000",
  "device_ref": "sandbox-20602"
}
```

```json
{
  "challenge_id": "49b58d3a-abfc-4631-b8f7-adee19621101",
  "expires_at": "2026-10-28T16:43:11.776130224Z",
  "resend_available_at": "2026-10-28T16:38:12.776130224Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670100000` → **200**

```json
{
  "phone": "+380670100000",
  "audience": "CLIENT",
  "code": "159758",
  "sent_at": "2026-10-28T16:38:11.779049511Z",
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
  "session_id": "ea01f974-4560-48e7-a695-edf7438393bb",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzOTIsImlhdCI6MTc5MzIwNTQ5MiwianRpIjoiZmI2OGE5MzUtZjA0OS00ZTQ2LThhZGEtMzRmNTkwMTU2ODlmIiwic2lkIjoiZWEwMWY5NzQtNDU2MC00OGU3LWE2OTUtZWRmNzQzODM5M2JiIn0.CM5l8Bb56quuQIHPAqbPC9tR7Gg8I5eu6fyK5ArRqB8",
  "access_expires_at": "2026-10-28T16:53:12.323056415Z",
  "refresh_token": "F9LTQIKQe57qwCtUfpHmNw0MJpccqNQvn5dKWuXAs3w",
  "refresh_expires_at": "2026-10-29T04:38:12.322491097Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670100000` → **200**

```json
{
  "deliveries": [
    {
      "id": "ef03f32e-4063-4746-9a7c-10356e3bc416",
      "challenge_id": "49b58d3a-abfc-4631-b8f7-adee19621101",
      "phone": "+380670100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d8f6b891-a67e-414a-af7d-259ebafcc90c",
      "error": null,
      "attempted_at": "2026-10-28T16:38:11.779271Z"
    },
    {
      "id": "991ca85f-9a51-4ae3-bb78-a54d620ce697",
      "challenge_id": "49b58d3a-abfc-4631-b8f7-adee19621101",
      "phone": "+380670100000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T16:38:11.778195Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670100000` → **200**

```json
{
  "phone": "+380670100000",
  "audience": "CLIENT",
  "code": "159758",
  "sent_at": "2026-10-28T16:38:11.779049511Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675656799` → **200**

```json
{
  "deliveries": [
    {
      "id": "24058c56-a759-45b3-bd34-003d1c186f00",
      "challenge_id": "f794cb4b-5c62-4f86-a834-1ca35a09ecb9",
      "phone": "+380675656799",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b21d10af-74a1-4f7f-b017-58bc69588ffc",
      "error": null,
      "attempted_at": "2026-10-28T16:38:11.508962Z"
    }
  ]
}
```

Done: SMS to +380677266859, a call to +380675656799, SMS then a call to +380670100000.

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
  "session_id": "f3b82916-62c8-4834-a3be-bed179dcbd57",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzOTMsImlhdCI6MTc5MzIwNTQ5MywianRpIjoiYzIyNjViNTMtOWQzNC00MWE4LWEwYTgtNjg5YzE0MzRjZDFlIiwic2lkIjoiZjNiODI5MTYtNjJjOC00ODM0LWEzYmUtYmVkMTc5ZGNiZDU3In0.dSqwvWsYCFn1IkBa1W3fM15thpDWLTrlm-rfhTT4gTA",
  "access_expires_at": "2026-10-28T16:53:13.366604531Z",
  "refresh_token": "pe41lsttR7Kt3IGRN3br-XCAi-UFEJQMYJ8xtG2NSSs",
  "refresh_expires_at": "2026-10-29T04:38:13.366125517Z",
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
  "session_id": "7cfd458d-cd77-4f3d-836c-bbdc7fb766a8",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDYzOTMsImlhdCI6MTc5MzIwNTQ5MywianRpIjoiODhmOWM2OTItNDRiNy00OGQ1LTkyMTItYjNlYmQ4ZmNjNTk2Iiwic2lkIjoiN2NmZDQ1OGQtY2Q3Ny00ZjNkLTgzNmMtYmJkYzdmYjc2NmE4In0.mEcEPqZIZMhk7azyJTcXyaoZ7YtoAgKtYG-f65omLTs",
  "access_expires_at": "2026-10-28T16:53:13.887883044Z",
  "refresh_token": "5yv9RpfDZk9WyIgez1Cf1TFCHssn1CurtTkoQV3MOXo",
  "refresh_expires_at": "2026-10-29T04:38:13.887362355Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
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

`POST /api/admin/v1/staff-extensions/2c53af99-a0d3-452b-870b-4332aa3e3979` → **200**

```json
{
  "command_id": "829d790c-902d-4253-8b7c-4d8e2e73fbc3",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "558a3330-570c-417f-86da-0982ae26cd10",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:38:14.927047Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T16:38:14.927047Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "81bf5204-f7b5-4b8b-b135-2399f9a4e09d",
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
  "id": "72e9985c-fa12-488f-8950-7b2e4c436dbc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:43:15.432942Z",
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
  "command_id": "6a737a42-3638-4c30-a12d-694491336c96",
  "quote_id": "72e9985c-fa12-488f-8950-7b2e4c436dbc",
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
    "phone": "+380675038819"
  }
}
```

```json
{
  "id": "0cb3efa4-1ea6-44da-a73b-e0656e060d05",
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
  "created_at": "2026-10-28T16:38:15.69094Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675038819"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/0cb3efa4-1ea6-44da-a73b-e0656e060d05/calls` → **201**

```json
{
  "command_id": "36726bc7-033e-41e2-a0d8-11fcf0302983",
  "to": "CALLER"
}
```

```json
{
  "id": "15780689-12e4-4265-add0-91ca226c627e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "order_ids": [
    "0cb3efa4-1ea6-44da-a73b-e0656e060d05"
  ],
  "started_at": "2026-10-28T16:38:15.980309Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/0cb3efa4-1ea6-44da-a73b-e0656e060d05/calls` → **201**

```json
{
  "command_id": "36726bc7-033e-41e2-a0d8-11fcf0302983",
  "to": "CALLER"
}
```

```json
{
  "id": "15780689-12e4-4265-add0-91ca226c627e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "order_ids": [
    "0cb3efa4-1ea6-44da-a73b-e0656e060d05"
  ],
  "started_at": "2026-10-28T16:38:15.980309Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "15780689-12e4-4265-add0-91ca226c627e",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675038819",
    "at": "2026-10-28T16:38:15.982598596Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "15780689-12e4-4265-add0-91ca226c627e",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.29754",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "15780689-12e4-4265-add0-91ca226c627e"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "15780689-12e4-4265-add0-91ca226c627e",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=0cb3efa4-1ea6-44da-a73b-e0656e060d05` → **200**

```json
{
  "calls": [
    {
      "id": "15780689-12e4-4265-add0-91ca226c627e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [
        "0cb3efa4-1ea6-44da-a73b-e0656e060d05"
      ],
      "started_at": "2026-10-28T16:38:15.980309Z",
      "answered_at": "2026-10-28T16:38:16.558912Z",
      "ended_at": "2026-10-28T16:38:16.576287Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0cb3efa4-1ea6-44da-a73b-e0656e060d05` → **200**

```json
{
  "calls": [
    {
      "id": "15780689-12e4-4265-add0-91ca226c627e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [
        "0cb3efa4-1ea6-44da-a73b-e0656e060d05"
      ],
      "started_at": "2026-10-28T16:38:15.980309Z",
      "answered_at": "2026-10-28T16:38:16.558912Z",
      "ended_at": "2026-10-28T16:38:16.576287Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0cb3efa4-1ea6-44da-a73b-e0656e060d05` → **200**

```json
{
  "calls": [
    {
      "id": "15780689-12e4-4265-add0-91ca226c627e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [
        "0cb3efa4-1ea6-44da-a73b-e0656e060d05"
      ],
      "started_at": "2026-10-28T16:38:15.980309Z",
      "answered_at": "2026-10-28T16:38:16.558912Z",
      "ended_at": "2026-10-28T16:38:16.576287Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0cb3efa4-1ea6-44da-a73b-e0656e060d05` → **200**

```json
{
  "calls": [
    {
      "id": "15780689-12e4-4265-add0-91ca226c627e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [
        "0cb3efa4-1ea6-44da-a73b-e0656e060d05"
      ],
      "started_at": "2026-10-28T16:38:15.980309Z",
      "answered_at": "2026-10-28T16:38:16.558912Z",
      "ended_at": "2026-10-28T16:38:16.576287Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0cb3efa4-1ea6-44da-a73b-e0656e060d05` → **200**

```json
{
  "calls": [
    {
      "id": "15780689-12e4-4265-add0-91ca226c627e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "order_ids": [
        "0cb3efa4-1ea6-44da-a73b-e0656e060d05"
      ],
      "started_at": "2026-10-28T16:38:15.980309Z",
      "answered_at": "2026-10-28T16:38:16.558912Z",
      "ended_at": "2026-10-28T16:38:16.576287Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T16:38:24.194759Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/0cb3efa4-1ea6-44da-a73b-e0656e060d05` → **200**

```json
{
  "id": "0cb3efa4-1ea6-44da-a73b-e0656e060d05",
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
  "created_at": "2026-10-28T16:38:15.69094Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675038819"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0cb3efa4-1ea6-44da-a73b-e0656e060d05/cancel` → **200**

```json
{
  "command_id": "750d033f-3a81-4fec-b8fb-b14c8e52bd97",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0cb3efa4-1ea6-44da-a73b-e0656e060d05",
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
  "created_at": "2026-10-28T16:38:15.69094Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675038819"
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
  "command_id": "b3627d4f-8f4e-4068-a3d3-c47bba9b41e2",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T16:38:26.411882Z",
  "extension": "101"
}
```

Done: outgoing call 15780689-12e4-4265-add0-91ca226c627e from order 0cb3efa4-1ea6-44da-a73b-e0656e060d05, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631073940",
  "device_ref": "sandbox-1739"
}
```

```json
{
  "challenge_id": "a3212f66-aa10-4170-a8f0-1dee792affed",
  "expires_at": "2026-10-28T16:43:26.669028354Z",
  "resend_available_at": "2026-10-28T16:38:27.669028354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631073940` → **200**

```json
{
  "phone": "+380631073940",
  "audience": "CLIENT",
  "code": "173633",
  "sent_at": "2026-10-28T16:38:26.671309591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3212f66-aa10-4170-a8f0-1dee792affed",
  "code": "173633",
  "device_ref": "sandbox-1739"
}
```

```json
{
  "session_id": "ed9c451b-ab60-4dfc-a6af-b59453951397",
  "subject": {
    "type": "CLIENT",
    "id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3M2QwOGQ0Yy0wOTAyLTQ3MGQtOGQyZS1kODFjNWQ1NWRhOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDA2LCJpYXQiOjE3OTMyMDU1MDYsImp0aSI6ImU2YmU3N2I1LTM4OTQtNDY1Yi1iNTY2LWJkMTBlMWVmNmIyZCIsInNpZCI6ImVkOWM0NTFiLWFiNjAtNGRmYy1hNmFmLWI1OTQ1Mzk1MTM5NyJ9.l1KfgXjK8hAOZ7JmrrZ_6nbENXecEw3OOcpodecHSBc",
  "access_expires_at": "2026-10-28T16:53:26.941705199Z",
  "refresh_token": "jSvHrS21qxSwntGjMaCMo0mZroB0AuXHT787lnR7lIE",
  "refresh_expires_at": "2026-11-27T16:38:26.941114914Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b",
  "session_id": "ed9c451b-ab60-4dfc-a6af-b59453951397",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631073940",
  "device_ref": "sandbox-1315"
}
```

```json
{
  "challenge_id": "f25e56ba-7aff-4a84-8a79-e760b9f2739d",
  "expires_at": "2026-10-28T16:43:29.443156849Z",
  "resend_available_at": "2026-10-28T16:38:30.443156849Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631073940` → **200**

```json
{
  "phone": "+380631073940",
  "audience": "CLIENT",
  "code": "837963",
  "sent_at": "2026-10-28T16:38:29.445039681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f25e56ba-7aff-4a84-8a79-e760b9f2739d",
  "code": "837963",
  "device_ref": "sandbox-1315"
}
```

```json
{
  "session_id": "1497d19e-2589-481d-87b0-5673a87d3e2b",
  "subject": {
    "type": "CLIENT",
    "id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3M2QwOGQ0Yy0wOTAyLTQ3MGQtOGQyZS1kODFjNWQ1NWRhOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDA5LCJpYXQiOjE3OTMyMDU1MDksImp0aSI6IjY1NDdjYzMyLTIxZjAtNDdmMS05ZjdhLWI2NDFhZWViZTkwNyIsInNpZCI6IjE0OTdkMTllLTI1ODktNDgxZC04N2IwLTU2NzNhODdkM2UyYiJ9.VZPB4FqOcz9BHsGMDF2aG720osJsUuyDe0yOqmtMeJY",
  "access_expires_at": "2026-10-28T16:53:29.722162357Z",
  "refresh_token": "s8-2UoeUm7I0vWdmTVJFhsSZBni4VfgGaZBkphv9Dyk",
  "refresh_expires_at": "2026-11-27T16:38:29.721667011Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "7b97b494-7397-47fe-8f50-6839734bd2df",
  "expires_at": "2026-10-28T16:43:31.98173354Z",
  "resend_available_at": "2026-10-28T16:38:32.98173354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631073940` → **200**

```json
{
  "phone": "+380631073940",
  "audience": "CLIENT",
  "code": "650201",
  "sent_at": "2026-10-28T16:38:31.984034617Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380633675014"
}
```

```json
{
  "challenge_id": "3f7f93ad-ae7f-400f-a9ce-942a414d2676",
  "expires_at": "2026-10-28T16:43:32.244739711Z",
  "resend_available_at": "2026-10-28T16:38:33.244739711Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633675014` → **200**

```json
{
  "phone": "+380633675014",
  "audience": "CLIENT",
  "code": "895976",
  "sent_at": "2026-10-28T16:38:32.246817451Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "78f53e82-d821-4986-9822-8ade7fd904f6",
  "current_challenge_id": "7b97b494-7397-47fe-8f50-6839734bd2df",
  "current_code": "000000",
  "new_challenge_id": "3f7f93ad-ae7f-400f-a9ce-942a414d2676",
  "new_code": "895976"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "446c2f14-1e2f-42e8-a515-8fb106fe490b"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "4a2ceaf7-058d-4284-817b-11d163a00879",
  "current_challenge_id": "7b97b494-7397-47fe-8f50-6839734bd2df",
  "current_code": "650201",
  "new_challenge_id": "3f7f93ad-ae7f-400f-a9ce-942a414d2676",
  "new_code": "895976"
}
```

```json
{
  "subject_id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b",
  "phone": "+380633675014",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b",
  "session_id": "ed9c451b-ab60-4dfc-a6af-b59453951397",
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
  "correlation_id": "f20893b5-33a1-4c37-ba97-38f325f64f4f"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633675014",
  "device_ref": "sandbox-28622"
}
```

```json
{
  "challenge_id": "04355107-ebd8-40b8-8b16-5f0e605593da",
  "expires_at": "2026-10-28T16:43:35.518370825Z",
  "resend_available_at": "2026-10-28T16:38:36.518370825Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633675014` → **200**

```json
{
  "phone": "+380633675014",
  "audience": "CLIENT",
  "code": "518922",
  "sent_at": "2026-10-28T16:38:35.520349113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04355107-ebd8-40b8-8b16-5f0e605593da",
  "code": "518922",
  "device_ref": "sandbox-28622"
}
```

```json
{
  "session_id": "51d694d7-8f64-403f-adc4-05287f41b280",
  "subject": {
    "type": "CLIENT",
    "id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3M2QwOGQ0Yy0wOTAyLTQ3MGQtOGQyZS1kODFjNWQ1NWRhOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDE1LCJpYXQiOjE3OTMyMDU1MTUsImp0aSI6IjdiMTg3OWRlLTdkYzktNDViNy04ZDFkLTM0MGNkMWNjZTEwYyIsInNpZCI6IjUxZDY5NGQ3LThmNjQtNDAzZi1hZGM0LTA1Mjg3ZjQxYjI4MCJ9.-nevjnohOzy8rfYSrMVepxmuD8-SecC1KW32kc8uSf0",
  "access_expires_at": "2026-10-28T16:53:35.792769445Z",
  "refresh_token": "TBb95-N-YofgxpI4wnqkzDZe0fhvBR_plJ7_yekzFgA",
  "refresh_expires_at": "2026-11-27T16:38:35.792005338Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b",
  "session_id": "51d694d7-8f64-403f-adc4-05287f41b280",
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
  "session_id": "143cdf98-d372-4a8b-a003-3c44dd21468b",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MTYsImlhdCI6MTc5MzIwNTUxNiwianRpIjoiZGZlNWQwZWUtY2Q5Yy00ZGZiLWJlMTMtYjVmNWZiNzQzYzQ1Iiwic2lkIjoiMTQzY2RmOTgtZDM3Mi00YThiLWEwMDMtM2M0NGRkMjE0NjhiIn0.9icsotvea3nEh69HOV_hHPiek82h6tzo-_WycDsNKEg",
  "access_expires_at": "2026-10-28T16:53:36.537421303Z",
  "refresh_token": "jCE2D57YHDtMQteTd94oTXCmU2Cu6CXBvR3GyoErSyM",
  "refresh_expires_at": "2026-10-29T04:38:36.536870452Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/73d08d4c-0902-470d-8d2e-d81c5d55da9b` → **200**

```json
{
  "client": {
    "id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b",
    "phone": "+380633675014",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T16:38:26.939321Z",
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

`POST /api/admin/v1/clients/73d08d4c-0902-470d-8d2e-d81c5d55da9b/phone/new-code` → **201**

```json
{
  "phone": "+380633625384"
}
```

```json
{
  "challenge_id": "00b16110-313d-42a1-8166-926d4e0cb6f8",
  "expires_at": "2026-10-28T16:43:37.066123428Z",
  "resend_available_at": "2026-10-28T16:38:38.066123428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633625384` → **200**

```json
{
  "phone": "+380633625384",
  "audience": "CLIENT",
  "code": "512816",
  "sent_at": "2026-10-28T16:38:37.067970458Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/73d08d4c-0902-470d-8d2e-d81c5d55da9b/phone` → **422**

```json
{
  "command_id": "0ee26616-4624-48b0-89d9-a11d9c1f1564",
  "expected_version": 3,
  "new_challenge_id": "00b16110-313d-42a1-8166-926d4e0cb6f8",
  "new_code": "512817",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/73d08d4c-0902-470d-8d2e-d81c5d55da9b/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "2edb87d1-c02a-443b-8a81-bf3ab1da6e2d"
}
```

`POST /api/admin/v1/clients/73d08d4c-0902-470d-8d2e-d81c5d55da9b/phone` → **400**

```json
{
  "command_id": "76aa6645-621c-4d3b-bbae-5d0ef59ae0ce",
  "expected_version": 3,
  "new_challenge_id": "00b16110-313d-42a1-8166-926d4e0cb6f8",
  "new_code": "512816",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/73d08d4c-0902-470d-8d2e-d81c5d55da9b/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ed47c2a2-562e-4bd4-a54d-42b983968d97",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/73d08d4c-0902-470d-8d2e-d81c5d55da9b/phone` → **200**

```json
{
  "command_id": "5421bac0-2f73-4605-a32f-f50ee4f2efcd",
  "expected_version": 3,
  "new_challenge_id": "00b16110-313d-42a1-8166-926d4e0cb6f8",
  "new_code": "512816",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b",
  "phone": "+380633625384",
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
  "correlation_id": "d79015ed-c79e-4217-b910-97095314977b"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633625384",
  "device_ref": "sandbox-30779"
}
```

```json
{
  "challenge_id": "a413e3a4-afa6-491b-a05e-ae0ea3d0caae",
  "expires_at": "2026-10-28T16:43:38.300601124Z",
  "resend_available_at": "2026-10-28T16:38:39.300601124Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633625384` → **200**

```json
{
  "phone": "+380633625384",
  "audience": "CLIENT",
  "code": "492522",
  "sent_at": "2026-10-28T16:38:38.30273528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a413e3a4-afa6-491b-a05e-ae0ea3d0caae",
  "code": "492522",
  "device_ref": "sandbox-30779"
}
```

```json
{
  "session_id": "90f479c5-1dc2-42ba-8286-394d3f3ed528",
  "subject": {
    "type": "CLIENT",
    "id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3M2QwOGQ0Yy0wOTAyLTQ3MGQtOGQyZS1kODFjNWQ1NWRhOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDE4LCJpYXQiOjE3OTMyMDU1MTgsImp0aSI6ImExM2FlZWFmLWM2NWEtNGU1Yy1iZDlhLWNjODg0NGNlYjRiNyIsInNpZCI6IjkwZjQ3OWM1LTFkYzItNDJiYS04Mjg2LTM5NGQzZjNlZDUyOCJ9.Mil_YtykASXGKpi7bTn7YhM2-PRkJBJwJacVAA-56JU",
  "access_expires_at": "2026-10-28T16:53:38.559601066Z",
  "refresh_token": "4qo8RbwMx8iyKdJjTa1-7N-eCxxRf4O2rtNjCtTzvTw",
  "refresh_expires_at": "2026-11-27T16:38:38.559060613Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "73d08d4c-0902-470d-8d2e-d81c5d55da9b",
  "session_id": "90f479c5-1dc2-42ba-8286-394d3f3ed528",
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
  "phone": "+380631128881",
  "device_ref": "sandbox-25990"
}
```

```json
{
  "challenge_id": "06b0c95f-1d65-4601-92ef-c95452eed17e",
  "expires_at": "2026-10-28T16:43:39.048680479Z",
  "resend_available_at": "2026-10-28T16:38:40.048680479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631128881` → **200**

```json
{
  "phone": "+380631128881",
  "audience": "CLIENT",
  "code": "853283",
  "sent_at": "2026-10-28T16:38:39.050673288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "06b0c95f-1d65-4601-92ef-c95452eed17e",
  "code": "853283",
  "device_ref": "sandbox-25990"
}
```

```json
{
  "session_id": "71e90e5f-ceeb-4b43-af3e-868c27db94f4",
  "subject": {
    "type": "CLIENT",
    "id": "28e0d272-cce1-4747-95c5-d91b8df9e83a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOGUwZDI3Mi1jY2UxLTQ3NDctOTVjNS1kOTFiOGRmOWU4M2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDE5LCJpYXQiOjE3OTMyMDU1MTksImp0aSI6IjNhNGRmNzU1LThmN2ItNDU3ZS1hMzY4LWYyMzBkZWY4OTNjNSIsInNpZCI6IjcxZTkwZTVmLWNlZWItNGI0My1hZjNlLTg2OGMyN2RiOTRmNCJ9.eJxKxgUAyx1rwpWlrEVPuNBMFMGVD8FxCtVbNxopqd0",
  "access_expires_at": "2026-10-28T16:53:39.315877724Z",
  "refresh_token": "5kiR4OOBENDZd5Y9xDgxHtZJAWmFUMr6rddqrdyPyCc",
  "refresh_expires_at": "2026-11-27T16:38:39.3153738Z",
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
  "session_id": "364f0dc5-95f7-4ead-8b58-3885260e23e8",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MjAsImlhdCI6MTc5MzIwNTUyMCwianRpIjoiNjBlMzE3Y2UtMzhhYy00MzVkLWFmNWUtOGEwOGQ1Yjk1Y2NhIiwic2lkIjoiMzY0ZjBkYzUtOTVmNy00ZWFkLThiNTgtMzg4NTI2MGUyM2U4In0.TSTXbLCOk9dhsUPZJqlEsmXV-9XvDzJaB08Fkf1n8rI",
  "access_expires_at": "2026-10-28T16:53:40.359660087Z",
  "refresh_token": "Pd5kWTwvbUsY5ZoU_ald-MX44AGBVOHiqCGC1ZPLJFg",
  "refresh_expires_at": "2026-10-29T04:38:40.358965693Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631128881` → **200**

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
  "correlation_id": "2ac97f39-6aa2-4c8b-a887-793459dd5bc1"
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
  "session_id": "cd84ae0d-abd1-4f35-a071-a3527dd4b662",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MjEsImlhdCI6MTc5MzIwNTUyMSwianRpIjoiMDM3NDVmNjMtYzE4NS00MTllLTk5NDAtNmM4NGE5ZWI4Njk4Iiwic2lkIjoiY2Q4NGFlMGQtYWJkMS00ZjM1LWEwNzEtYTM1MjdkZDRiNjYyIn0.Nm1k_yc6w1a4o6AL0iX6yYuTw2IxNH7ORtuyEQACFAA",
  "access_expires_at": "2026-10-28T16:53:41.378923162Z",
  "refresh_token": "L0O977n78x7SFh91eYtckZ0L6Kl9aaxqrB4fUaHba3c",
  "refresh_expires_at": "2026-10-29T04:38:41.37828654Z",
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
  "command_id": "55492a97-38f9-441f-b640-c560d9158593",
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
  "changed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T16:38:41.907894013Z"
}
```

## The rider books the airport for 2026-10-28T19:38:41Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600499736",
  "device_ref": "sandbox-20779"
}
```

```json
{
  "challenge_id": "cefc704b-3104-46f3-b2f2-652aa57a7ac0",
  "expires_at": "2026-10-28T16:43:42.165965405Z",
  "resend_available_at": "2026-10-28T16:38:43.165965405Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600499736` → **200**

```json
{
  "phone": "+48600499736",
  "audience": "CLIENT",
  "code": "790048",
  "sent_at": "2026-10-28T16:38:42.168323439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cefc704b-3104-46f3-b2f2-652aa57a7ac0",
  "code": "790048",
  "device_ref": "sandbox-20779"
}
```

```json
{
  "session_id": "c5e80d1d-cb4a-4881-9094-68fe4034d693",
  "subject": {
    "type": "CLIENT",
    "id": "bd9b3b3d-a6ba-4253-bda8-2eeff64c0afb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDliM2IzZC1hNmJhLTQyNTMtYmRhOC0yZWVmZjY0YzBhZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDIyLCJpYXQiOjE3OTMyMDU1MjIsImp0aSI6IjQ4NWMwZWY3LWE4YTQtNDI5MC1hNmJlLTBiNzY3YjUxZWMxYSIsInNpZCI6ImM1ZTgwZDFkLWNiNGEtNDg4MS05MDk0LTY4ZmU0MDM0ZDY5MyJ9.Gwv4m865HV16bGarc4av1NrbhTztDoP3UKjKeQF67bk",
  "access_expires_at": "2026-10-28T16:53:42.434153907Z",
  "refresh_token": "_h7Uyk_5_d7nlUb_2OBQcVOqnWEGA1Gl4ZQoh1sfFBc",
  "refresh_expires_at": "2026-11-27T16:38:42.433647736Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "30b9e98b-5cb2-4cc2-98b2-bf2fdb6c6850",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T19:38:41Z"
}
```

```json
{
  "id": "7a3c3f09-74d7-4b08-86c0-d8905ea8c967",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:43:42.681150Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T19:38:41Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6b0fa7ed-9ca3-458e-abc9-0364500c3a98",
  "quote_id": "7a3c3f09-74d7-4b08-86c0-d8905ea8c967",
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
  "pickup_at": "2026-10-28T19:38:41Z"
}
```

```json
{
  "id": "57dbabbe-2677-4b34-874c-64fdef3b4854",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bd9b3b3d-a6ba-4253-bda8-2eeff64c0afb",
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
  "created_at": "2026-10-28T16:38:42.939175Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T19:38:41Z",
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
  "device_ref": "sandbox-11067"
}
```

```json
{
  "challenge_id": "e984acd0-cb0b-4bdf-926a-7d43fd730eac",
  "expires_at": "2026-10-28T16:43:43.193455855Z",
  "resend_available_at": "2026-10-28T16:38:44.193455855Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "837643",
  "sent_at": "2026-10-28T16:38:43.195364274Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e984acd0-cb0b-4bdf-926a-7d43fd730eac",
  "code": "837643",
  "device_ref": "sandbox-11067"
}
```

```json
{
  "session_id": "fe2d7693-2af2-47c7-b7ee-a965a36ea987",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQyMywiaWF0IjoxNzkzMjA1NTIzLCJqdGkiOiI0ZGE4YmQ0Yi03NDcyLTRiOGQtYmQ2OS0wYzdmNTkyMzNmMDQiLCJzaWQiOiJmZTJkNzY5My0yYWYyLTQ3YzctYjdlZS1hOTY1YTM2ZWE5ODcifQ.dqE0ZJbPHxOgxfORrWj6XsDvCLl_AS-WQojooGjZw28",
  "access_expires_at": "2026-10-28T16:53:43.455474111Z",
  "refresh_token": "-s4QmvYrKRNezR3msSedoCiE4FnGNDkWvcUSIHuzI1k",
  "refresh_expires_at": "2026-11-27T16:38:43.454975729Z",
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
  "command_id": "82fc466f-dfa5-4639-a429-628b462c6a2a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:43Z",
    "sequence": 1793205523935
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bdc79fd4-1edf-4eb4-85c8-823fbdff6db6",
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
  "last_heartbeat_at": "2026-10-28T16:38:43.949839Z",
  "last_location_at": "2026-10-28T16:38:43.949839Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "57dbabbe-2677-4b34-874c-64fdef3b4854",
      "short_number": 21,
      "pickup_at": "2026-10-28T19:38:41Z",
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

`POST /api/driver/v1/preorders/57dbabbe-2677-4b34-874c-64fdef3b4854/reserve` → **200**

```json
{
  "command_id": "6561138f-e265-43dc-bfe0-e57b54b356da"
}
```

```json
{
  "id": "1d06c8f6-381c-467c-bac3-fefaddc384f4",
  "state": "RESERVED",
  "order": {
    "order_id": "57dbabbe-2677-4b34-874c-64fdef3b4854",
    "short_number": 21,
    "pickup_at": "2026-10-28T19:38:41Z",
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
  "reserved_at": "2026-10-28T16:38:44.444502Z",
  "confirm_from": "2026-10-28T19:08:41Z",
  "confirm_until": "2026-10-28T19:18:41Z",
  "drop_until": "2026-10-28T18:38:41Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "1d06c8f6-381c-467c-bac3-fefaddc384f4",
      "state": "RESERVED",
      "order": {
        "order_id": "57dbabbe-2677-4b34-874c-64fdef3b4854",
        "short_number": 21,
        "pickup_at": "2026-10-28T19:38:41Z",
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
      "reserved_at": "2026-10-28T16:38:44.444502Z",
      "confirm_from": "2026-10-28T19:08:41Z",
      "confirm_until": "2026-10-28T19:18:41Z",
      "drop_until": "2026-10-28T18:38:41Z"
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
      "id": "1d06c8f6-381c-467c-bac3-fefaddc384f4",
      "state": "RESERVED",
      "order": {
        "order_id": "57dbabbe-2677-4b34-874c-64fdef3b4854",
        "short_number": 21,
        "pickup_at": "2026-10-28T19:38:41Z",
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
      "reserved_at": "2026-10-28T16:38:44.444502Z",
      "confirm_from": "2026-10-28T19:08:41Z",
      "confirm_until": "2026-10-28T19:18:41Z",
      "drop_until": "2026-10-28T18:38:41Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/1d06c8f6-381c-467c-bac3-fefaddc384f4/confirm` → **409**

```json
{
  "command_id": "3bd80846-8d33-4262-a6de-e23b3622ef88"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/1d06c8f6-381c-467c-bac3-fefaddc384f4/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "00cecd38-a454-4420-9f90-23aef85d3858"
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
  "session_id": "b894b0e8-a5f7-4d59-a5bd-312e44b91f80",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MjUsImlhdCI6MTc5MzIwNTUyNSwianRpIjoiMWJhNmZiOTUtYWI0MC00Mjk4LTk2N2YtMDI5MDQ4MGU4NzVlIiwic2lkIjoiYjg5NGIwZTgtYTVmNy00ZDU5LWE1YmQtMzEyZTQ0YjkxZjgwIn0.VVXQqmhCJiaDsaXc8o2OceKsglt6F5MxDr4gyQ1DTsc",
  "access_expires_at": "2026-10-28T16:53:45.811515376Z",
  "refresh_token": "j6B_61VAyzVes-VCdxS7gjl1QsaqHIKKzBMlXJnv3ZQ",
  "refresh_expires_at": "2026-10-29T04:38:45.810904646Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/57dbabbe-2677-4b34-874c-64fdef3b4854` → **200**

```json
{
  "id": "57dbabbe-2677-4b34-874c-64fdef3b4854",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "bd9b3b3d-a6ba-4253-bda8-2eeff64c0afb",
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
  "created_at": "2026-10-28T16:38:42.939175Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T19:38:41Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "1d06c8f6-381c-467c-bac3-fefaddc384f4",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T16:38:44.444502Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/57dbabbe-2677-4b34-874c-64fdef3b4854/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T16:38:42.940265Z",
      "actor": {
        "type": "CLIENT",
        "id": "bd9b3b3d-a6ba-4253-bda8-2eeff64c0afb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "57dbabbe-2677-4b34-874c-64fdef3b4854",
        "preorder": true,
        "quote_id": "7a3c3f09-74d7-4b08-86c0-d8905ea8c967",
        "pickup_at": "2026-10-28T19:38:41Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "60c0bb83-dc15-43da-a8ac-36904f7e2f98"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T16:38:44.445592Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "57dbabbe-2677-4b34-874c-64fdef3b4854",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "1d06c8f6-381c-467c-bac3-fefaddc384f4"
      },
      "correlation_id": "36a444fb-1ff5-4fb5-b23a-225c227eeb56"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 57dbabbe-2677-4b34-874c-64fdef3b4854, reservation 1d06c8f6-381c-467c-bac3-fefaddc384f4.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19222"
}
```

```json
{
  "challenge_id": "1fe29a08-9f04-4e67-a13d-e88b5bd44d4b",
  "expires_at": "2026-10-28T16:43:46.600191168Z",
  "resend_available_at": "2026-10-28T16:38:47.600191168Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "339827",
  "sent_at": "2026-10-28T16:38:46.602409012Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fe29a08-9f04-4e67-a13d-e88b5bd44d4b",
  "code": "339827",
  "device_ref": "sandbox-19222"
}
```

```json
{
  "session_id": "46f56d00-f4b1-4005-bf01-d0d11a9af0de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQyNiwiaWF0IjoxNzkzMjA1NTI2LCJqdGkiOiIxMjU0ZjYyNy01NTE2LTRkZGMtYjgyYi05ZGM5NDhmNzUzMWEiLCJzaWQiOiI0NmY1NmQwMC1mNGIxLTQwMDUtYmYwMS1kMGQxMWE5YWYwZGUifQ.LpCJ08OPPMpjonDCYnNDwwnV6Ma15owgAT4vDo1aGjc",
  "access_expires_at": "2026-10-28T16:53:46.873709542Z",
  "refresh_token": "BeKdu5t8i44p_X0f_Pex_P0Pe5HGaPw4dXUDvTjGbz4",
  "refresh_expires_at": "2026-11-27T16:38:46.873257841Z",
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
  "command_id": "1a146b43-8ab8-46d2-bcd8-a439c9068d27",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:47Z",
    "sequence": 1793205527370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "470cfdcf-ce5c-4d93-ae6d-94416644da71",
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
  "last_heartbeat_at": "2026-10-28T16:38:47.385285Z",
  "last_location_at": "2026-10-28T16:38:47.385285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674845483",
  "device_ref": "sandbox-879"
}
```

```json
{
  "challenge_id": "ec2aafad-5d93-4bc1-a0af-8286d389a399",
  "expires_at": "2026-10-28T16:43:47.642368128Z",
  "resend_available_at": "2026-10-28T16:38:48.642368128Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674845483` → **200**

```json
{
  "phone": "+380674845483",
  "audience": "CLIENT",
  "code": "061576",
  "sent_at": "2026-10-28T16:38:47.644947188Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec2aafad-5d93-4bc1-a0af-8286d389a399",
  "code": "061576",
  "device_ref": "sandbox-879"
}
```

```json
{
  "session_id": "06a5c796-a61b-4ea1-855b-9720f14ccaad",
  "subject": {
    "type": "CLIENT",
    "id": "1fb2eb7c-9d51-42b4-a748-7e07c22d862a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmIyZWI3Yy05ZDUxLTQyYjQtYTc0OC03ZTA3YzIyZDg2MmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDI3LCJpYXQiOjE3OTMyMDU1MjcsImp0aSI6ImVkMDU1NDJhLWUwMTUtNDA4Mi1hYjk5LWU0ZTNlN2ZkNDA2NCIsInNpZCI6IjA2YTVjNzk2LWE2MWItNGVhMS04NTViLTk3MjBmMTRjY2FhZCJ9.CbyTRiDqORdBlsUWJxm115GO4S5Y6sSFYG2QemFk_hc",
  "access_expires_at": "2026-10-28T16:53:47.92094879Z",
  "refresh_token": "01L1OU4qc52gVRtBx8NPppoQJ_bKN8daDqIfjPV2Szk",
  "refresh_expires_at": "2026-11-27T16:38:47.920442043Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "816a6c4f-da93-46ab-975a-be4470f2a4b7",
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
  "id": "99437384-f912-4ae7-9949-e120cec4f580",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:43:48.169969Z",
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
  "command_id": "6e330f4b-6eb6-45ab-b9a6-8e70bc238177",
  "quote_id": "99437384-f912-4ae7-9949-e120cec4f580",
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
  "id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1fb2eb7c-9d51-42b4-a748-7e07c22d862a",
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
  "created_at": "2026-10-28T16:38:48.432446Z",
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
    "id": "6e3d9126-891a-4aee-acf7-8e00e04754a8",
    "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
    "expires_at": "2026-10-28T16:39:03.435589Z",
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

`POST /api/driver/v1/offers/6e3d9126-891a-4aee-acf7-8e00e04754a8/accept` → **200**

```json
{
  "command_id": "723d5b38-4c1d-4d9c-a118-3535f3f395d5"
}
```

```json
{
  "id": "9078902b-775d-4301-b07d-d27224451e9a",
  "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c7927677-f95c-4206-b9fb-19c8cb7ca7f2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c7927677-f95c-4206-b9fb-19c8cb7ca7f2",
  "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "assignment_id": "9078902b-775d-4301-b07d-d27224451e9a",
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

`POST /api/driver/v1/work-sessions/470cfdcf-ce5c-4d93-ae6d-94416644da71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:49Z",
    "sequence": 1793205529431
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "470cfdcf-ce5c-4d93-ae6d-94416644da71",
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
  "last_heartbeat_at": "2026-10-28T16:38:49.446381Z",
  "last_location_at": "2026-10-28T16:38:49.446381Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c7927677-f95c-4206-b9fb-19c8cb7ca7f2",
  "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "assignment_id": "9078902b-775d-4301-b07d-d27224451e9a",
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

`POST /api/driver/v1/trips/c7927677-f95c-4206-b9fb-19c8cb7ca7f2/arrive` → **200**

```json
{
  "command_id": "fb23290f-4df9-40e8-ad74-dfb9a3b49c4b",
  "expected_version": 0
}
```

```json
{
  "id": "c7927677-f95c-4206-b9fb-19c8cb7ca7f2",
  "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "assignment_id": "9078902b-775d-4301-b07d-d27224451e9a",
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
  "arrived_at": "2026-10-28T16:38:49.946475Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c7927677-f95c-4206-b9fb-19c8cb7ca7f2/start` → **200**

```json
{
  "command_id": "362e3f16-96e3-48a2-af3e-cb57737106ad",
  "expected_version": 1
}
```

```json
{
  "id": "c7927677-f95c-4206-b9fb-19c8cb7ca7f2",
  "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "assignment_id": "9078902b-775d-4301-b07d-d27224451e9a",
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
  "arrived_at": "2026-10-28T16:38:49.946475Z",
  "started_at": "2026-10-28T16:38:50.208376Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/470cfdcf-ce5c-4d93-ae6d-94416644da71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:38:50Z",
    "sequence": 1793205530470
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "470cfdcf-ce5c-4d93-ae6d-94416644da71",
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
  "last_heartbeat_at": "2026-10-28T16:38:50.485072Z",
  "last_location_at": "2026-10-28T16:38:50.485072Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/c7927677-f95c-4206-b9fb-19c8cb7ca7f2/complete` → **200**

```json
{
  "command_id": "dae7b842-752c-4b05-8861-e25efbe767c6",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:38:50Z",
  "cash_received": true
}
```

```json
{
  "id": "c7927677-f95c-4206-b9fb-19c8cb7ca7f2",
  "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "assignment_id": "9078902b-775d-4301-b07d-d27224451e9a",
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
  "arrived_at": "2026-10-28T16:38:49.946475Z",
  "started_at": "2026-10-28T16:38:50.208376Z",
  "completed_at": "2026-10-28T16:38:50.736141Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3070ef05-6d0c-4298-9ba5-80ae4cce84d2/rating` → **200**

```json
{
  "command_id": "ef8ad352-98a6-4f12-94fd-4024f50d91c4",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "score": 5,
  "created_at": "2026-10-28T16:38:50.994320794Z"
}
```

`POST /api/driver/v1/orders/3070ef05-6d0c-4298-9ba5-80ae4cce84d2/rating` → **200**

```json
{
  "command_id": "22d8c457-d95d-40c1-8619-2e718b9f4e82",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
  "score": 4,
  "created_at": "2026-10-28T16:38:51.24304504Z"
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
  "session_id": "00e3a919-bc7c-4676-9d26-9540ec542f00",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MzIsImlhdCI6MTc5MzIwNTUzMiwianRpIjoiMzUwMzRmNGMtMWI4OC00NDY3LThmOGMtOGQzOTVmOGNlZWUxIiwic2lkIjoiMDBlM2E5MTktYmM3Yy00Njc2LTlkMjYtOTU0MGVjNTQyZjAwIn0.0ktHAsiBKm3Gov3tnI6wRkZ49sMKkkjTNaQO73synP8",
  "access_expires_at": "2026-10-28T16:53:52.013581899Z",
  "refresh_token": "2fE60gBfI4LuaDVKVSF4iX9hzChP1xMvZSv_dnczG40",
  "refresh_expires_at": "2026-10-29T04:38:52.013086236Z",
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
  "session_id": "5accb575-9a61-499e-b1e7-fb21931d434d",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MzIsImlhdCI6MTc5MzIwNTUzMiwianRpIjoiNzZmYTQ0NDUtYWI4NS00MGExLTkzNzMtMGQ4MjA1NGIyZTMwIiwic2lkIjoiNWFjY2I1NzUtOWE2MS00OTllLWIxZTctZmIyMTkzMWQ0MzRkIn0.EzZCfnPal_f1OvqrmkhZdigvuzkh5NXOyqfx6QfHb0k",
  "access_expires_at": "2026-10-28T16:53:52.525312264Z",
  "refresh_token": "n1Z1rq7PdzkbzE0Psv97AJ7KH_VcXZNguxqmXWfe3iY",
  "refresh_expires_at": "2026-10-29T04:38:52.524754557Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3070ef05-6d0c-4298-9ba5-80ae4cce84d2/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
      "author_type": "RIDER",
      "author_id": "1fb2eb7c-9d51-42b4-a748-7e07c22d862a",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T16:38:50.994321Z"
    },
    {
      "order_id": "3070ef05-6d0c-4298-9ba5-80ae4cce84d2",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "1fb2eb7c-9d51-42b4-a748-7e07c22d862a",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T16:38:51.243045Z"
    }
  ]
}
```

Done: ratings for order 3070ef05-6d0c-4298-9ba5-80ae4cce84d2.

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
  "session_id": "2880cefd-4482-43c5-92b9-fed2b47de860",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0MzMsImlhdCI6MTc5MzIwNTUzMywianRpIjoiZjdlZDgxNGQtODQ3YS00Y2FhLWI4MjgtODhlNzYzYTJjY2ExIiwic2lkIjoiMjg4MGNlZmQtNDQ4Mi00M2M1LTkyYjktZmVkMmI0N2RlODYwIn0.1RKFx9NI3Ie_YOuy52WNSil8crkKmYTvM9TuDtpvaQc",
  "access_expires_at": "2026-10-28T16:53:53.329063811Z",
  "refresh_token": "VKD_Lm7K8ABHPG0OXWS6hGuyhE91mjcVjsCucczcvCE",
  "refresh_expires_at": "2026-10-29T04:38:53.328579423Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "db3b2bd3-cbb7-4ccc-9e7c-b6befbc43ffc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "2761ba0f-1898-44b6-a458-fd5628d3383a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:38:53.586323Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2761ba0f-1898-44b6-a458-fd5628d3383a` → **200**

```json
{
  "id": "2761ba0f-1898-44b6-a458-fd5628d3383a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:38:53.586323Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2761ba0f-1898-44b6-a458-fd5628d3383a` → **200**

```json
{
  "id": "2761ba0f-1898-44b6-a458-fd5628d3383a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:38:53.586323Z",
  "ready_at": "2026-10-28T16:38:54.23144Z",
  "expires_at": "2026-10-29T16:38:54.23144Z"
}
```

`GET /api/admin/v1/reports/exports/2761ba0f-1898-44b6-a458-fd5628d3383a/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
total,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a5f96b7f-c544-487d-966a-25813d1d1fba",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "6fca62c2-b9e9-422f-bc9d-54f32faf5167",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:38:55.373403Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6fca62c2-b9e9-422f-bc9d-54f32faf5167` → **200**

```json
{
  "id": "6fca62c2-b9e9-422f-bc9d-54f32faf5167",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:38:55.373403Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6fca62c2-b9e9-422f-bc9d-54f32faf5167` → **200**

```json
{
  "id": "6fca62c2-b9e9-422f-bc9d-54f32faf5167",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:38:55.373403Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6fca62c2-b9e9-422f-bc9d-54f32faf5167` → **200**

```json
{
  "id": "6fca62c2-b9e9-422f-bc9d-54f32faf5167",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T16:38:55.373403Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6fca62c2-b9e9-422f-bc9d-54f32faf5167` → **200**

```json
{
  "id": "6fca62c2-b9e9-422f-bc9d-54f32faf5167",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T16:38:55.373403Z",
  "ready_at": "2026-10-28T16:38:59.240126Z",
  "expires_at": "2026-10-29T16:38:59.240126Z"
}
```

`GET /api/admin/v1/reports/exports/6fca62c2-b9e9-422f-bc9d-54f32faf5167/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4e5c6f5d-24c0-4801-ac29-42911299ca78` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4e5c6f5d-24c0-4801-ac29-42911299ca78",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3c1fbe44-ffeb-4aaa-afe0-89e7c2a6270d"
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
  "device_ref": "sandbox-13296"
}
```

```json
{
  "challenge_id": "4f1ef970-1ada-493f-a3c0-8b9071649c0a",
  "expires_at": "2026-10-28T16:43:59.891513325Z",
  "resend_available_at": "2026-10-28T16:39:00.891513325Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "703225",
  "sent_at": "2026-10-28T16:38:59.894085369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f1ef970-1ada-493f-a3c0-8b9071649c0a",
  "code": "703225",
  "device_ref": "sandbox-13296"
}
```

```json
{
  "session_id": "74835d99-2f3d-4996-af24-8a7ab5e9b8de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ0MCwiaWF0IjoxNzkzMjA1NTQwLCJqdGkiOiI2M2M5Yzk5NS01ZWY1LTQ1ZmYtOTNlNS0xYjNlNzRkNDVjNTAiLCJzaWQiOiI3NDgzNWQ5OS0yZjNkLTQ5OTYtYWYyNC04YTdhYjVlOWI4ZGUifQ.T80T-PUt8gf0pf4AKZVluwDs2Bpj8h3Ux0zfRIXA5hk",
  "access_expires_at": "2026-10-28T16:54:00.163950073Z",
  "refresh_token": "Q206m8jPjvEdh5YxZ7YpzpzILI6OGYPuuYei--YNXqY",
  "refresh_expires_at": "2026-11-27T16:39:00.163425335Z",
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
  "command_id": "558c6797-d070-4b7d-8bd7-862c1c680950",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:00Z",
    "sequence": 1793205540925
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "47cb5c45-45a1-4121-b3b4-b5b8689f95a2",
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
  "last_heartbeat_at": "2026-10-28T16:39:00.939437Z",
  "last_location_at": "2026-10-28T16:39:00.939437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "09bac4b5-90e0-4591-ae45-55e6414d015c",
  "points": [
    {
      "sequence": 1793205543191,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:38:03Z"
    },
    {
      "sequence": 1793205543197,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T16:39:03Z"
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
  "session_id": "42383714-25b0-404d-b079-61dd26fa7e14",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NDMsImlhdCI6MTc5MzIwNTU0MywianRpIjoiM2ZhMzJiOGItZjE3Zi00YTE3LTk3ZjAtZmFlNDU4MGQ1OTkxIiwic2lkIjoiNDIzODM3MTQtMjViMC00MDRkLWIwNzktNjFkZDI2ZmE3ZTE0In0.YH4AGVa-W7L4Svk5FU0yPDGvoRuEzydIvTBB-9wprp4",
  "access_expires_at": "2026-10-28T16:54:03.757239045Z",
  "refresh_token": "jtPORHl29JE1LxeIvIvnEg9a3lgoDFspiCH3uKQLKus",
  "refresh_expires_at": "2026-10-29T04:39:03.756804399Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "ec43b0e1-a9e7-439e-b773-92b2fdf010e6",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T16:39:03Z",
        "track_point_id": "4b1c735c-2e3c-496d-8a90-d133671a9c24",
        "work_session_id": "47cb5c45-45a1-4121-b3b4-b5b8689f95a2"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T16:39:03Z",
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

`POST /api/admin/v1/driver-risk-flags/ec43b0e1-a9e7-439e-b773-92b2fdf010e6/confirm` → **200**

```json
{
  "command_id": "3bd64fd3-f448-4d78-a3cb-559905b2930c",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "ec43b0e1-a9e7-439e-b773-92b2fdf010e6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T16:39:03Z",
    "track_point_id": "4b1c735c-2e3c-496d-8a90-d133671a9c24",
    "work_session_id": "47cb5c45-45a1-4121-b3b4-b5b8689f95a2"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T16:39:03Z",
  "reason": null,
  "reviewed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "reviewed_at": "2026-10-28T16:39:04.5412Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/ec43b0e1-a9e7-439e-b773-92b2fdf010e6/dismiss` → **409**

```json
{
  "command_id": "c9f66c85-2e35-4ea9-8ce3-eff4f7bae18e",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/ec43b0e1-a9e7-439e-b773-92b2fdf010e6/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5db60e77-3b54-4a1c-a7f8-835b6808473a"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "fb3a6510-3602-464f-abc6-f26cc11b0784",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "56dfe707-b09d-49af-a7a3-416ca84e1f0f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "raised_at": "2026-10-28T16:39:05.05309Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/56dfe707-b09d-49af-a7a3-416ca84e1f0f/dismiss` → **200**

```json
{
  "command_id": "b187f67c-c02e-45ae-ad38-1059dddaa802",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "56dfe707-b09d-49af-a7a3-416ca84e1f0f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "raised_at": "2026-10-28T16:39:05.05309Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "reviewed_at": "2026-10-28T16:39:05.302199Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "2544a369-ccd9-4c96-9a3a-948831e4c9b4",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "ec43b0e1-a9e7-439e-b773-92b2fdf010e6"
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
      "actor_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:39:05.571097Z"
    }
  ]
}
```

Done: flag ec43b0e1-a9e7-439e-b773-92b2fdf010e6 confirmed, suspension named it, driver reinstated.

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
  "session_id": "85c10a13-e106-4bf1-8965-324eaa28d089",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NDYsImlhdCI6MTc5MzIwNTU0NiwianRpIjoiOWNkMjFiYjYtYmUxNi00OGQwLTkyMGItYmU5ODE2MmE2Yjk2Iiwic2lkIjoiODVjMTBhMTMtZTEwNi00YmYxLTg5NjUtMzI0ZWFhMjhkMDg5In0.fF_RKqeLrTAtp7b_5tqVb03nQ36B-7XzH9UdplVel-0",
  "access_expires_at": "2026-10-28T16:54:06.373735622Z",
  "refresh_token": "7ifXh3Jke8xkNjSW5p87Q0YcuP2S0Ikywcc7eescZvg",
  "refresh_expires_at": "2026-10-29T04:39:06.373229452Z",
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
      "actor_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:39:05.571097Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f40c0bf2-de62-4572-8fec-756e1bb27e6a",
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
  "session_id": "47cb5c45-45a1-4121-b3b4-b5b8689f95a2",
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
  "last_heartbeat_at": "2026-10-28T16:39:00.939437Z",
  "last_location_at": "2026-10-28T16:39:00.939437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/47cb5c45-45a1-4121-b3b4-b5b8689f95a2/close` → **200**

```json
{
  "command_id": "1fa79b42-108c-4578-8e1f-c86c5a12728f",
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
  "session_id": "fc3871c5-d0be-4c52-957d-c46dfed96f99",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NDcsImlhdCI6MTc5MzIwNTU0NywianRpIjoiYzlmY2E0YTktYjU2Mi00ZjExLWEyNzAtMTdhZTE2MWMwYzVjIiwic2lkIjoiZmMzODcxYzUtZDBiZS00YzUyLTk1N2QtYzQ2ZGZlZDk2Zjk5In0.yX8hi4kGzXLs20N9B_IVKQ9hOJvQeBJ6dV09unNdOss",
  "access_expires_at": "2026-10-28T16:54:07.942245642Z",
  "refresh_token": "EgBh2zlyJGnFwi6ige-c5wDGN8mj9-o2PPbwcYMI8Xw",
  "refresh_expires_at": "2026-10-29T04:39:07.941695972Z",
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
  "command_id": "9f9032b2-ffee-4e88-9544-18f5dae376a9",
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
  "changed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:39:08.465493Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "9f9032b2-ffee-4e88-9544-18f5dae376a9",
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
  "changed_by": "2c53af99-a0d3-452b-870b-4332aa3e3979",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T16:39:08.465493Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48120780438",
  "device_ref": "sandbox-11596"
}
```

```json
{
  "challenge_id": "cdbae72b-eb79-470e-810f-f72fe64e3145",
  "expires_at": "2026-10-28T16:44:08.975650871Z",
  "resend_available_at": "2026-10-28T16:39:09.975650871Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48120780438` → **200**

```json
{
  "phone": "+48120780438",
  "audience": "CLIENT",
  "code": "751145",
  "sent_at": "2026-10-28T16:39:08.977733585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdbae72b-eb79-470e-810f-f72fe64e3145",
  "code": "751145",
  "device_ref": "sandbox-11596"
}
```

```json
{
  "session_id": "9464fc32-5fce-4387-b1fc-ac28120484cc",
  "subject": {
    "type": "CLIENT",
    "id": "b796832b-db4a-4915-9182-e9fabaa77007"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzk2ODMyYi1kYjRhLTQ5MTUtOTE4Mi1lOWZhYmFhNzcwMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDQ5LCJpYXQiOjE3OTMyMDU1NDksImp0aSI6ImZiZWJhZjJjLTIyNzYtNDA2ZC04MTBlLTUxMDExOGI4YjI3ZiIsInNpZCI6Ijk0NjRmYzMyLTVmY2UtNDM4Ny1iMWZjLWFjMjgxMjA0ODRjYyJ9.mSedOFyv1ROO11Ed26GA838JkbF_4MaPCNTiYLfCx8E",
  "access_expires_at": "2026-10-28T16:54:09.245581972Z",
  "refresh_token": "1GmuYuzbKM5exA1X91VQMEO4JgmJwB0fkSF8r-dVe5E",
  "refresh_expires_at": "2026-11-27T16:39:09.245106802Z",
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
  "correlation_id": "74403812-f9a5-4e82-94d5-c8124fe7d16b"
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
  "device_ref": "sandbox-14847"
}
```

```json
{
  "challenge_id": "41b45dc1-0a6e-42fb-9052-4c6294ae0fd6",
  "expires_at": "2026-10-28T16:44:10.006260312Z",
  "resend_available_at": "2026-10-28T16:39:11.006260312Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "049278",
  "sent_at": "2026-10-28T16:39:10.008291155Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41b45dc1-0a6e-42fb-9052-4c6294ae0fd6",
  "code": "049278",
  "device_ref": "sandbox-14847"
}
```

```json
{
  "session_id": "879e1b0f-720e-4f63-99ba-e3b183e35df6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ1MCwiaWF0IjoxNzkzMjA1NTUwLCJqdGkiOiIzYWYxNDcxMi1lNTJhLTQ1N2MtODdmMy1hYWE1NjhmZGI2NzQiLCJzaWQiOiI4NzllMWIwZi03MjBlLTRmNjMtOTliYS1lM2IxODNlMzVkZjYifQ.g6W1tU5e26WBeNS4zEvu85TSBSbRgLwUEm1O5YHeZzg",
  "access_expires_at": "2026-10-28T16:54:10.271024661Z",
  "refresh_token": "raKMbnbp4Xem_8V6kAUzgRPlMOkPRfSd9Mct3BJe6pM",
  "refresh_expires_at": "2026-11-27T16:39:10.270392243Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bdc79fd4-1edf-4eb4-85c8-823fbdff6db6",
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
  "last_heartbeat_at": "2026-10-28T16:38:43.949839Z",
  "last_location_at": "2026-10-28T16:38:43.949839Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bdc79fd4-1edf-4eb4-85c8-823fbdff6db6/handover` → **200**

```json
{
  "command_id": "0eac9a98-1b11-4f6f-a00e-c6a5377703cf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bdc79fd4-1edf-4eb4-85c8-823fbdff6db6",
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
  "last_heartbeat_at": "2026-10-28T16:38:43.949839Z",
  "last_location_at": "2026-10-28T16:38:43.949839Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bdc79fd4-1edf-4eb4-85c8-823fbdff6db6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:11Z",
    "sequence": 1793205551338
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bdc79fd4-1edf-4eb4-85c8-823fbdff6db6",
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
  "last_heartbeat_at": "2026-10-28T16:39:11.048401Z",
  "last_location_at": "2026-10-28T16:39:11.048401Z",
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
  "session_id": "bdc79fd4-1edf-4eb4-85c8-823fbdff6db6",
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
  "last_heartbeat_at": "2026-10-28T16:39:11.048401Z",
  "last_location_at": "2026-10-28T16:39:11.048401Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bdc79fd4-1edf-4eb4-85c8-823fbdff6db6/close` → **200**

```json
{
  "command_id": "dd260221-9c08-4d7e-88c4-bb7cf94a2de7",
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
  "correlation_id": "bbb2c85d-2cb9-4277-ab9b-8aeb63b1dd9a"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672752373",
  "device_ref": "sandbox-18289"
}
```

```json
{
  "challenge_id": "83f51335-bee0-432d-88b3-0b2b1741c9b4",
  "expires_at": "2026-10-28T16:44:12.292525161Z",
  "resend_available_at": "2026-10-28T16:39:13.292525161Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672752373` → **200**

```json
{
  "phone": "+380672752373",
  "audience": "CLIENT",
  "code": "420413",
  "sent_at": "2026-10-28T16:39:12.294625839Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83f51335-bee0-432d-88b3-0b2b1741c9b4",
  "code": "420413",
  "device_ref": "sandbox-18289"
}
```

```json
{
  "session_id": "4dd8c6a5-07f0-4ef3-a973-1446b414b769",
  "subject": {
    "type": "CLIENT",
    "id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzdkY2ZjYy1jYWMyLTQ3ZDEtOGI2YS03NmQ3ZjEzZWZjNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDUyLCJpYXQiOjE3OTMyMDU1NTIsImp0aSI6IjBhN2ZkMDk0LTMyZDMtNGFiNC04NmE2LWM2NDgzOGUwNzk3NSIsInNpZCI6IjRkZDhjNmE1LTA3ZjAtNGVmMy1hOTczLTE0NDZiNDE0Yjc2OSJ9.YEVy93mwvXzFFFdoY-O4D8PE49qdprooQWiZKJwWNRk",
  "access_expires_at": "2026-10-28T16:54:12.562567037Z",
  "refresh_token": "u_z6X_vT0MVPiYNX6fuD2yJR0Sr6Vhp3Pn3KqiFPEKU",
  "refresh_expires_at": "2026-11-27T16:39:12.562125219Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "bf7ec18b-6ddd-4071-aa68-981d7c31be13",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "48f97344-2995-4b54-8293-d22851341aa3",
  "upload_path": "/api/rider/v1/uploads/48f97344-2995-4b54-8293-d22851341aa3",
  "expires_at": "2026-10-28T16:54:12.810646681Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/48f97344-2995-4b54-8293-d22851341aa3` → **200**

```json
{
  "file_id": "48f97344-2995-4b54-8293-d22851341aa3",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "8017338e-f726-42ee-9319-f15d50a929f9",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "48f97344-2995-4b54-8293-d22851341aa3"
  ]
}
```

```json
{
  "id": "93a7242c-70d3-42dd-a253-2358c21e3933",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:39:13.092692Z",
  "updated_at": "2026-10-28T16:39:13.092692Z",
  "respond_by": "2026-10-28T20:39:13.092692Z",
  "messages": [
    {
      "id": "d92d8373-9bd3-4a90-8f70-75430662c500",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:39:13.094344Z",
      "attachments": [
        {
          "file_id": "48f97344-2995-4b54-8293-d22851341aa3",
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
  "session_id": "af30dbfc-6913-4b68-84a6-501de7e36b4b",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NTMsImlhdCI6MTc5MzIwNTU1MywianRpIjoiYjcxMmI0ZmMtYzBhYS00NDBlLThhNDUtNjIzNzZjZGU5ZjI5Iiwic2lkIjoiYWYzMGRiZmMtNjkxMy00YjY4LTg0YTYtNTAxZGU3ZTM2YjRiIn0.1RXljj058IiyvlV7uQ812UiylM3TCIKfKvKavKp9O2M",
  "access_expires_at": "2026-10-28T16:54:13.638561637Z",
  "refresh_token": "jsmdtUiT1B1bEhU18nOptNLRRiKM-6WqLtRZbqMgWQk",
  "refresh_expires_at": "2026-10-29T04:39:13.638097027Z",
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
  "session_id": "6b6a2840-3a95-4d18-a557-ae270e20f1ac",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NTQsImlhdCI6MTc5MzIwNTU1NCwianRpIjoiZmFkZWUxOGMtNjdhMy00YjE3LWJlN2MtODIzMjAzODViYjA0Iiwic2lkIjoiNmI2YTI4NDAtM2E5NS00ZDE4LWE1NTctYWUyNzBlMjBmMWFjIn0._0txz6Um1oyEl4NEBYF_-Z713Kns11gWljG9IlMLNQ4",
  "access_expires_at": "2026-10-28T16:54:14.162388001Z",
  "refresh_token": "1JE3zaESBGTKE4KAf4Dah5njLK1XNiWTgwDw-H2m2QM",
  "refresh_expires_at": "2026-10-29T04:39:14.161698485Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/93a7242c-70d3-42dd-a253-2358c21e3933/attachments/48f97344-2995-4b54-8293-d22851341aa3` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "8fbc5d11-c8f3-476a-bb42-644710eb53f6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "8ce27fc6-d0ba-46e9-91e8-213ad9dbb023",
  "upload_path": "/api/operator/v1/uploads/8ce27fc6-d0ba-46e9-91e8-213ad9dbb023",
  "expires_at": "2026-10-28T16:54:14.424548485Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/8ce27fc6-d0ba-46e9-91e8-213ad9dbb023` → **200**

```json
{
  "file_id": "8ce27fc6-d0ba-46e9-91e8-213ad9dbb023",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/93a7242c-70d3-42dd-a253-2358c21e3933` → **200**

```json
{
  "id": "93a7242c-70d3-42dd-a253-2358c21e3933",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T16:39:13.092692Z",
  "updated_at": "2026-10-28T16:39:13.092692Z",
  "respond_by": "2026-10-28T20:39:13.092692Z",
  "messages": [
    {
      "id": "d92d8373-9bd3-4a90-8f70-75430662c500",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:39:13.094344Z",
      "attachments": [
        {
          "file_id": "48f97344-2995-4b54-8293-d22851341aa3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/93a7242c-70d3-42dd-a253-2358c21e3933/comments` → **200**

```json
{
  "command_id": "e728c824-d863-46ee-b002-295895e34a6e",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "8ce27fc6-d0ba-46e9-91e8-213ad9dbb023"
  ]
}
```

```json
{
  "id": "93a7242c-70d3-42dd-a253-2358c21e3933",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:39:13.092692Z",
  "updated_at": "2026-10-28T16:39:14.956561Z",
  "respond_by": "2026-10-28T20:39:13.092692Z",
  "messages": [
    {
      "id": "d92d8373-9bd3-4a90-8f70-75430662c500",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:39:13.094344Z",
      "attachments": [
        {
          "file_id": "48f97344-2995-4b54-8293-d22851341aa3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "a29192ef-ca9e-47e2-a570-149c5c189835",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:39:14.95608Z",
      "attachments": [
        {
          "file_id": "8ce27fc6-d0ba-46e9-91e8-213ad9dbb023",
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

`GET /api/rider/v1/support/cases/93a7242c-70d3-42dd-a253-2358c21e3933` → **200**

```json
{
  "id": "93a7242c-70d3-42dd-a253-2358c21e3933",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T16:39:13.092692Z",
  "updated_at": "2026-10-28T16:39:14.956561Z",
  "respond_by": "2026-10-28T20:39:13.092692Z",
  "messages": [
    {
      "id": "d92d8373-9bd3-4a90-8f70-75430662c500",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "537dcfcc-cac2-47d1-8b6a-76d7f13efc5d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T16:39:13.094344Z",
      "attachments": [
        {
          "file_id": "48f97344-2995-4b54-8293-d22851341aa3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "a29192ef-ca9e-47e2-a570-149c5c189835",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T16:39:14.95608Z",
      "attachments": [
        {
          "file_id": "8ce27fc6-d0ba-46e9-91e8-213ad9dbb023",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/93a7242c-70d3-42dd-a253-2358c21e3933/attachments/8ce27fc6-d0ba-46e9-91e8-213ad9dbb023` → **200**

Done: support case 93a7242c-70d3-42dd-a253-2358c21e3933, rider attachment 48f97344-2995-4b54-8293-d22851341aa3, operator attachment 8ce27fc6-d0ba-46e9-91e8-213ad9dbb023.

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
  "session_id": "37c23d65-9996-4c7b-aeba-f04938a058cc",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NTUsImlhdCI6MTc5MzIwNTU1NSwianRpIjoiOTUyZTRjZTEtYWI0ZC00MGE4LWI3ZmItNGI3MWUzZWIzMWI1Iiwic2lkIjoiMzdjMjNkNjUtOTk5Ni00YzdiLWFlYmEtZjA0OTM4YTA1OGNjIn0.-Jdvh5TV0GwVm5Up_fc75_N99dVVL5HN18TwEZLyg2M",
  "access_expires_at": "2026-10-28T16:54:15.759335655Z",
  "refresh_token": "gu3mR56XqcH4rVINHUSAMBbQINHEliThwix3r3dGYzw",
  "refresh_expires_at": "2026-10-29T04:39:15.758800494Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24404"
}
```

```json
{
  "challenge_id": "7ba8c7b6-3810-4aea-90b9-67404135caf4",
  "expires_at": "2026-10-28T16:44:16.008659509Z",
  "resend_available_at": "2026-10-28T16:39:17.008659509Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "361441",
  "sent_at": "2026-10-28T16:39:16.010831379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ba8c7b6-3810-4aea-90b9-67404135caf4",
  "code": "361441",
  "device_ref": "sandbox-24404"
}
```

```json
{
  "session_id": "b157ddb1-a192-446e-a91d-d74fcd85751e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ1NiwiaWF0IjoxNzkzMjA1NTU2LCJqdGkiOiI1OTZkNGRjOS0zNjUxLTQ5ZTEtOTMyNi1jODg1Zjg0NTY2MWMiLCJzaWQiOiJiMTU3ZGRiMS1hMTkyLTQ0NmUtYTkxZC1kNzRmY2Q4NTc1MWUifQ.64oOCkx4fE9hiFZWv50wDM2SjSkNM3B8pg6Wcpw5YUI",
  "access_expires_at": "2026-10-28T16:54:16.269211546Z",
  "refresh_token": "nBhxIPTLgGQzmgis1sSVHoQXfDf1OSm0iHjpS_iCYGo",
  "refresh_expires_at": "2026-11-27T16:39:16.268683771Z",
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
      "actor_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T16:39:05.571097Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "2c53af99-a0d3-452b-870b-4332aa3e3979",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T16:39:06.893139Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "9036db4e-c3d8-46f2-9f8e-fcb570608deb",
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
  "device_ref": "sandbox-31024"
}
```

```json
{
  "challenge_id": "f914ccb0-0f8a-43c8-a36e-e07fd2b2183f",
  "expires_at": "2026-10-28T16:44:17.271032534Z",
  "resend_available_at": "2026-10-28T16:39:18.271032534Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "674683",
  "sent_at": "2026-10-28T16:39:17.273059794Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f914ccb0-0f8a-43c8-a36e-e07fd2b2183f",
  "code": "674683",
  "device_ref": "sandbox-31024"
}
```

```json
{
  "session_id": "01b862a2-51ff-482f-843a-9fbd5f53ba80",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ1NywiaWF0IjoxNzkzMjA1NTU3LCJqdGkiOiI5ZDc5OWI1ZS04ZWNlLTRiMmMtYjc4OS00M2QyZDI4MTU2YTkiLCJzaWQiOiIwMWI4NjJhMi01MWZmLTQ4MmYtODQzYS05ZmJkNWY1M2JhODAifQ.z1dK1GgngjxX8C0h0dqxZbxQ_V-tUC4dP5NR9FK-lgA",
  "access_expires_at": "2026-10-28T16:54:17.545763798Z",
  "refresh_token": "AVu_4nMjVt2Czc5Sxm6J_meZHu77U1ncEkYE62toV6I",
  "refresh_expires_at": "2026-11-27T16:39:17.545296801Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "470cfdcf-ce5c-4d93-ae6d-94416644da71",
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
  "last_heartbeat_at": "2026-10-28T16:38:50.485072Z",
  "last_location_at": "2026-10-28T16:38:50.485072Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/470cfdcf-ce5c-4d93-ae6d-94416644da71/handover` → **200**

```json
{
  "command_id": "3e19f068-36e5-4963-bef1-e242f306e4ef",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "470cfdcf-ce5c-4d93-ae6d-94416644da71",
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
  "last_heartbeat_at": "2026-10-28T16:38:50.485072Z",
  "last_location_at": "2026-10-28T16:38:50.485072Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/470cfdcf-ce5c-4d93-ae6d-94416644da71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:18Z",
    "sequence": 1793205558286
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "470cfdcf-ce5c-4d93-ae6d-94416644da71",
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
  "last_heartbeat_at": "2026-10-28T16:39:18.301631Z",
  "last_location_at": "2026-10-28T16:39:18.301631Z",
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
  "command_id": "63e193c5-49a3-48a9-9e6d-53ae107f24f2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:18Z",
    "sequence": 1793205558805
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "04f828c4-f06c-4f9b-80a8-902feed42756",
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
  "last_heartbeat_at": "2026-10-28T16:39:18.820088Z",
  "last_location_at": "2026-10-28T16:39:18.820088Z",
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
  "session_id": "8756708b-c680-4469-94cb-9a947a9ed0b0",
  "subject": {
    "type": "STAFF",
    "id": "2c53af99-a0d3-452b-870b-4332aa3e3979"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzUzYWY5OS1hMGQzLTQ1MmItODcwYi00MzMyYWEzZTM5NzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDY0NTksImlhdCI6MTc5MzIwNTU1OSwianRpIjoiMzQ4ZjU3NTAtYjM4OS00Y2RiLWJmMDItNGNjMWRiNzVhOThjIiwic2lkIjoiODc1NjcwOGItYzY4MC00NDY5LTk0Y2ItOWE5NDdhOWVkMGIwIn0.WQhO9biVzD3oASYtqDQUeNSM8pbNZ58Enc0-hENhl7c",
  "access_expires_at": "2026-10-28T16:54:19.344546834Z",
  "refresh_token": "GOSqm2MxvET07rba4H6r8QPhUyf0H8OlEUdClFRzGX0",
  "refresh_expires_at": "2026-10-29T04:39:19.343891925Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6d3e073c-82a4-4bb6-9ce2-d5cdaf4eb3aa",
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
  "id": "ac007673-41ed-4d2d-84ca-faef1f139c9a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:19.595832Z",
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
  "command_id": "2292455a-dd73-4ad8-801d-7edbfcb77d64",
  "quote_id": "ac007673-41ed-4d2d-84ca-faef1f139c9a",
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
  "id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
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
  "created_at": "2026-10-28T16:39:19.86293Z",
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
    "id": "e2535b04-12f9-4c53-849b-03dcec9d7c92",
    "order_id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
    "expires_at": "2026-10-28T16:39:34.866984Z",
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

`POST /api/driver/v1/offers/e2535b04-12f9-4c53-849b-03dcec9d7c92/accept` → **200**

```json
{
  "command_id": "b1acfd58-9418-4d08-adc6-608c3c93bccf"
}
```

```json
{
  "id": "36a2ffb3-19c3-4248-a777-c7d1e4abcc40",
  "order_id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9166cba0-944c-47c2-bb5e-e0a2aa233fb3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9166cba0-944c-47c2-bb5e-e0a2aa233fb3",
  "order_id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
  "assignment_id": "36a2ffb3-19c3-4248-a777-c7d1e4abcc40",
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

`POST /api/driver/v1/work-sessions/04f828c4-f06c-4f9b-80a8-902feed42756/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T16:39:21Z",
    "sequence": 1793205561129
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "04f828c4-f06c-4f9b-80a8-902feed42756",
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
  "last_heartbeat_at": "2026-10-28T16:39:21.144152Z",
  "last_location_at": "2026-10-28T16:39:21.144152Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9166cba0-944c-47c2-bb5e-e0a2aa233fb3/arrive` → **200**

```json
{
  "command_id": "8fbd49db-f6bb-468e-b451-0bba25cc6669",
  "expected_version": 0
}
```

```json
{
  "id": "9166cba0-944c-47c2-bb5e-e0a2aa233fb3",
  "order_id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
  "assignment_id": "36a2ffb3-19c3-4248-a777-c7d1e4abcc40",
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
  "arrived_at": "2026-10-28T16:39:21.400661Z",
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

`POST /api/driver/v1/trips/9166cba0-944c-47c2-bb5e-e0a2aa233fb3/start` → **200**

```json
{
  "command_id": "1b89f1b6-3369-4fc0-8dea-0b2398508608",
  "expected_version": 1
}
```

```json
{
  "id": "9166cba0-944c-47c2-bb5e-e0a2aa233fb3",
  "order_id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
  "assignment_id": "36a2ffb3-19c3-4248-a777-c7d1e4abcc40",
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
  "arrived_at": "2026-10-28T16:39:21.400661Z",
  "started_at": "2026-10-28T16:39:21.671035Z",
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

`POST /api/driver/v1/trips/9166cba0-944c-47c2-bb5e-e0a2aa233fb3/complete` → **200**

```json
{
  "command_id": "8fe7b4b8-05b0-49da-bf06-9f3680ddca5a",
  "expected_version": 2,
  "reported_at": "2026-10-28T16:39:21Z",
  "cash_received": true
}
```

```json
{
  "id": "9166cba0-944c-47c2-bb5e-e0a2aa233fb3",
  "order_id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
  "assignment_id": "36a2ffb3-19c3-4248-a777-c7d1e4abcc40",
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
  "arrived_at": "2026-10-28T16:39:21.400661Z",
  "started_at": "2026-10-28T16:39:21.671035Z",
  "completed_at": "2026-10-28T16:39:21.935395Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/18f731d3-8bd6-4a71-af06-53f082fe11d6` → **200**

```json
{
  "id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
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
    "id": "36a2ffb3-19c3-4248-a777-c7d1e4abcc40",
    "order_id": "18f731d3-8bd6-4a71-af06-53f082fe11d6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9166cba0-944c-47c2-bb5e-e0a2aa233fb3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T16:39:19.86293Z",
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
  "session_id": "470cfdcf-ce5c-4d93-ae6d-94416644da71",
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
  "last_heartbeat_at": "2026-10-28T16:39:18.301631Z",
  "last_location_at": "2026-10-28T16:39:18.301631Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/470cfdcf-ce5c-4d93-ae6d-94416644da71/close` → **200**

```json
{
  "command_id": "ce4637ea-76a1-46e9-bc26-bf2ebcd67205",
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
  "session_id": "04f828c4-f06c-4f9b-80a8-902feed42756",
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
  "last_heartbeat_at": "2026-10-28T16:39:21.144152Z",
  "last_location_at": "2026-10-28T16:39:21.144152Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/04f828c4-f06c-4f9b-80a8-902feed42756/close` → **200**

```json
{
  "command_id": "8c456d41-7852-47dd-b25c-caebe49f70a3",
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

Done: terminal order 18f731d3-8bd6-4a71-af06-53f082fe11d6 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20790"
}
```

```json
{
  "challenge_id": "b2fddf54-9abb-4c8a-b2eb-06923e17cea0",
  "expires_at": "2026-10-28T16:44:26.720843229Z",
  "resend_available_at": "2026-10-28T16:39:27.720843229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "963662",
  "sent_at": "2026-10-28T16:39:26.723467244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2fddf54-9abb-4c8a-b2eb-06923e17cea0",
  "code": "963662",
  "device_ref": "sandbox-20790"
}
```

```json
{
  "session_id": "2547d313-e714-4235-8c9c-d31530befad3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ2NiwiaWF0IjoxNzkzMjA1NTY2LCJqdGkiOiI3OWViZTMyZC0zMDU1LTRlMjUtODU3MS03ZDllYWFkYjZmNjUiLCJzaWQiOiIyNTQ3ZDMxMy1lNzE0LTQyMzUtOGM5Yy1kMzE1MzBiZWZhZDMifQ.DeLFpbZZf1uiw1Fa7eqcsWhHwbfVXxb0bISGc6l8txQ",
  "access_expires_at": "2026-10-28T16:54:26.998797271Z",
  "refresh_token": "4peiUkFoNSkTPwo6g0CeXrCpItBqiKwQqCWbg6BsIsk",
  "refresh_expires_at": "2026-11-27T16:39:26.998281715Z",
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
  "device_ref": "sandbox-15687"
}
```

```json
{
  "challenge_id": "fa001087-2ea1-4c3d-9b7a-c9c21d05644c",
  "expires_at": "2026-10-28T16:44:27.488203449Z",
  "resend_available_at": "2026-10-28T16:39:28.488203449Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "449735",
  "sent_at": "2026-10-28T16:39:27.490206426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa001087-2ea1-4c3d-9b7a-c9c21d05644c",
  "code": "449735",
  "device_ref": "sandbox-15687"
}
```

```json
{
  "session_id": "110606dd-87c0-44a9-b521-737bf24ca4e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ2NywiaWF0IjoxNzkzMjA1NTY3LCJqdGkiOiIzZDk5YTFkOS1iZDE2LTQ1ZWQtOTU3My04NWVlZGViOGMxYTAiLCJzaWQiOiIxMTA2MDZkZC04N2MwLTQ0YTktYjUyMS03MzdiZjI0Y2E0ZTMifQ.EDD4ZAGUW-0t1mlwRJOQSYe0E68QyveIm4ohbSW9uH4",
  "access_expires_at": "2026-10-28T16:54:27.75765923Z",
  "refresh_token": "whOTZxLTmZHhT3A_BO8J21H_ZqqC4UnCwZpYPGC693g",
  "refresh_expires_at": "2026-11-27T16:39:27.757115026Z",
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
  "device_ref": "sandbox-2880"
}
```

```json
{
  "challenge_id": "95ff98ba-7a10-47e9-8b3a-18349e3599f5",
  "expires_at": "2026-10-28T16:44:28.248009425Z",
  "resend_available_at": "2026-10-28T16:39:29.248009425Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "886684",
  "sent_at": "2026-10-28T16:39:28.249987853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95ff98ba-7a10-47e9-8b3a-18349e3599f5",
  "code": "886684",
  "device_ref": "sandbox-2880"
}
```

```json
{
  "session_id": "369d217a-39d8-4cf8-95d1-177fd7d231de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwNjQ2OCwiaWF0IjoxNzkzMjA1NTY4LCJqdGkiOiIyM2EwNWRjMS1hZmU5LTQzNDQtYTFhMS04OGU4YzExYWUwMzkiLCJzaWQiOiIzNjlkMjE3YS0zOWQ4LTRjZjgtOTVkMS0xNzdmZDdkMjMxZGUifQ.4gCyXUePmlaiQ7gq_Gj--st9AlNSa_lYzI1Vl6JYe_4",
  "access_expires_at": "2026-10-28T16:54:28.509075126Z",
  "refresh_token": "o1L729yOpkPqArP6WOZKld7OV0brTFUinozTteB91tE",
  "refresh_expires_at": "2026-11-27T16:39:28.508620255Z",
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
  "phone": "+380693740022",
  "device_ref": "sandbox-519"
}
```

```json
{
  "challenge_id": "0140aeb1-9731-4687-90c7-7398b1360cb8",
  "expires_at": "2026-10-28T16:44:29.002454611Z",
  "resend_available_at": "2026-10-28T16:39:30.002454611Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380693740022` → **200**

```json
{
  "phone": "+380693740022",
  "audience": "CLIENT",
  "code": "766106",
  "sent_at": "2026-10-28T16:39:29.004501152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0140aeb1-9731-4687-90c7-7398b1360cb8",
  "code": "766106",
  "device_ref": "sandbox-519"
}
```

```json
{
  "session_id": "715ce8bc-a59f-4993-b027-0034a9dfe0e8",
  "subject": {
    "type": "CLIENT",
    "id": "65c72e1f-f23f-4f0c-ab54-4413b5516049"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWM3MmUxZi1mMjNmLTRmMGMtYWI1NC00NDEzYjU1MTYwNDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjA2NDY5LCJpYXQiOjE3OTMyMDU1NjksImp0aSI6ImJmNWYwYTBhLWYwZWMtNDYwZi1iNzZlLTYxZjQ3NzQyZDg2YiIsInNpZCI6IjcxNWNlOGJjLWE1OWYtNDk5My1iMDI3LTAwMzRhOWRmZTBlOCJ9.Gm3K3GkrFjOeN_xlVNFg0sCE7DRvzqpaLG3hYjvifro",
  "access_expires_at": "2026-10-28T16:54:29.27045866Z",
  "refresh_token": "v4N_omNeR3bMERtuqxrb-L2lNIYOYmo2i4X8lr0hu28",
  "refresh_expires_at": "2026-11-27T16:39:29.26998245Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "652f3b7b-96d7-4439-938e-570f43e08199",
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
  "id": "79708398-ca3f-47d8-b945-328c27cff725",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T16:44:29.538869Z",
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
  "command_id": "304e526b-86b6-442d-9b47-f35e0b1723d1",
  "quote_id": "79708398-ca3f-47d8-b945-328c27cff725",
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
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
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
  "blizz_dispatch_excluded_total": 7,
  "blizz_sms_sent_total": 64
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 14
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 9.888935929
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 2.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 15
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.118815357
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 57.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/f4106d18-74ac-4119-b929-eef4d4db3200` → **200**

```json
{
  "id": "f4106d18-74ac-4119-b929-eef4d4db3200",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "65c72e1f-f23f-4f0c-ab54-4413b5516049",
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
  "created_at": "2026-10-28T16:39:29.797748Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
