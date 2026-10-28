# Sandbox transcript (2026-10-28T20:01:36Z, 6efdff3)

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
  "correlation_id": "879c514f-2ffd-40f2-8c32-ce19b5f50269"
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
  "session_id": "0ef0f3f2-7dde-4016-b370-302d61e769e6",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2MDEsImlhdCI6MTc5MzIxNzcwMSwianRpIjoiMDI5MzU3ZGYtODA0MS00Y2UyLTlmYTYtMTMwOGE1ODQxMTJmIiwic2lkIjoiMGVmMGYzZjItN2RkZS00MDE2LWIzNzAtMzAyZDYxZTc2OWU2In0.o1eGC0BYtcCKg7etVm_TCsxquw50zs9QH12RKMmlAqY",
  "access_expires_at": "2026-10-28T20:16:41.49090826Z",
  "refresh_token": "2CQ3iQaIm2RMe90RUtYv_0tj5pnI5950EyllVH_Nwyo",
  "refresh_expires_at": "2026-10-29T08:01:41.489076993Z",
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
  "session_id": "e0ebf823-b408-4cab-bfd8-986b4755ea44",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2MDIsImlhdCI6MTc5MzIxNzcwMiwianRpIjoiYjMwMTJjMWItNTRjOS00MmFhLWE5MGQtNmY2ZWM3Njg5ZThjIiwic2lkIjoiZTBlYmY4MjMtYjQwOC00Y2FiLWJmZDgtOTg2YjQ3NTVlYTQ0In0.SGJdvsfITJpU3WcWE7uLmawsXonwFE0XWxSEgGPfE2M",
  "access_expires_at": "2026-10-28T20:16:42.60863183Z",
  "refresh_token": "MhsarlZFzdNXvhX_XP8srtjSzD0WLBC4CA5_MERRYVw",
  "refresh_expires_at": "2026-10-29T08:01:42.607934415Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c2bef88f-38fb-4a6d-959e-170cde176743",
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
  "id": "611c291a-e12a-4e35-8bef-fd751dcc7ebc",
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
  "created_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
  "created_at": "2026-10-28T20:01:42.880534Z",
  "updated_at": "2026-10-28T20:01:42.880534Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638275812",
  "device_ref": "sandbox-26520"
}
```

```json
{
  "challenge_id": "45eb385a-886d-4606-a539-a3db0513cdfd",
  "expires_at": "2026-10-28T20:06:43.106780887Z",
  "resend_available_at": "2026-10-28T20:01:44.106780887Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638275812` → **200**

```json
{
  "phone": "+380638275812",
  "audience": "CLIENT",
  "code": "083236",
  "sent_at": "2026-10-28T20:01:43.115308089Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45eb385a-886d-4606-a539-a3db0513cdfd",
  "code": "083236",
  "device_ref": "sandbox-26520"
}
```

```json
{
  "session_id": "8949f36c-c8fc-4ccf-b957-5efefd44e8cd",
  "subject": {
    "type": "CLIENT",
    "id": "c342319c-4e16-48b8-8e16-0921b87d7933"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzQyMzE5Yy00ZTE2LTQ4YjgtOGUxNi0wOTIxYjg3ZDc5MzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjAzLCJpYXQiOjE3OTMyMTc3MDMsImp0aSI6ImVkMjc4Nzk1LTQ0NjUtNDg3Ny05ZGVlLWE0ZGEzZWM4OTUwMCIsInNpZCI6Ijg5NDlmMzZjLWM4ZmMtNGNjZi1iOTU3LTVlZmVmZDQ0ZThjZCJ9.GIQ_Pu6kMr3BJ_N0gsLzCBan4Y3sdZgT_otS9Ms1PKc",
  "access_expires_at": "2026-10-28T20:16:43.361444453Z",
  "refresh_token": "TPZDsx5WvK6Uxj2lRl_N7CnRRJjjrZtrRLhbkdgy900",
  "refresh_expires_at": "2026-11-27T20:01:43.360447792Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638275812` → **200**

```json
{
  "client_id": "c342319c-4e16-48b8-8e16-0921b87d7933"
}
```

`POST /api/admin/v1/rider-wallets/c342319c-4e16-48b8-8e16-0921b87d7933/top-ups` → **201**

```json
{
  "command_id": "733b1b6e-4223-4bbc-856a-70253f9b960e",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "c342319c-4e16-48b8-8e16-0921b87d7933",
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
      "id": "8dc726c8-d4f9-4e40-a997-b71d7830aedc",
      "at": "2026-10-28T20:01:43.780456Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "93990a66-2678-4501-977e-3d92e5678cf0",
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
  "id": "7a88c3e4-767d-47ee-8570-cd2698dd5ed7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:06:44.099604Z",
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
      "id": "611c291a-e12a-4e35-8bef-fd751dcc7ebc",
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
  "device_ref": "sandbox-18790"
}
```

```json
{
  "challenge_id": "f5a68b1f-2ed1-4d85-9d22-e20adb05d7d6",
  "expires_at": "2026-10-28T20:06:44.321226509Z",
  "resend_available_at": "2026-10-28T20:01:45.321226509Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "704766",
  "sent_at": "2026-10-28T20:01:44.324095599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5a68b1f-2ed1-4d85-9d22-e20adb05d7d6",
  "code": "704766",
  "device_ref": "sandbox-18790"
}
```

```json
{
  "session_id": "fdea3812-623c-4ec5-93e4-afa88bfa2a3c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODYwNCwiaWF0IjoxNzkzMjE3NzA0LCJqdGkiOiIxNzQxZTgxMy05MDQ2LTQzNWQtYjA0OS00M2YwYWY3ODA4NmIiLCJzaWQiOiJmZGVhMzgxMi02MjNjLTRlYzUtOTNlNC1hZmE4OGJmYTJhM2MifQ.gnqKYXzFLXlEzvZgVJFi1LmpPl-J9s36Mc3f2tWouwk",
  "access_expires_at": "2026-10-28T20:16:44.542612413Z",
  "refresh_token": "41OyH-bzNbd8RDDIXUOSdFRq7fA92Xeh-ne31ONTbfo",
  "refresh_expires_at": "2026-11-27T20:01:44.541825446Z",
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
  "command_id": "b11d1e8d-8640-49ff-992e-5061b753f123",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:01:44Z",
    "sequence": 1793217704923
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b9e4a6c-5484-426f-9bca-caa658c64979",
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
  "last_heartbeat_at": "2026-10-28T20:01:44.962921Z",
  "last_location_at": "2026-10-28T20:01:44.962921Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "715299bc-9efc-411d-a3ca-3500156a18cc",
  "quote_id": "7a88c3e4-767d-47ee-8570-cd2698dd5ed7",
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
  "id": "e65fd56f-eca4-405f-b749-b6d658d6f70e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c342319c-4e16-48b8-8e16-0921b87d7933",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:01:45.198982Z",
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
  "client_id": "c342319c-4e16-48b8-8e16-0921b87d7933",
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
      "id": "8dc726c8-d4f9-4e40-a997-b71d7830aedc",
      "at": "2026-10-28T20:01:43.780456Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
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
    "id": "a70adfb5-7cac-4ff8-be62-04c17f94a6bd",
    "order_id": "e65fd56f-eca4-405f-b749-b6d658d6f70e",
    "expires_at": "2026-10-28T20:02:00.21014Z",
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

`POST /api/driver/v1/offers/a70adfb5-7cac-4ff8-be62-04c17f94a6bd/accept` → **200**

```json
{
  "command_id": "8be2a866-7dae-45e2-9d1d-8737cfb1c21c"
}
```

```json
{
  "id": "63576240-7f62-4967-85a5-70a75b3ae933",
  "order_id": "e65fd56f-eca4-405f-b749-b6d658d6f70e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "79d3f988-f0af-4096-806f-f1f3c2d7938b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "79d3f988-f0af-4096-806f-f1f3c2d7938b",
  "order_id": "e65fd56f-eca4-405f-b749-b6d658d6f70e",
  "assignment_id": "63576240-7f62-4967-85a5-70a75b3ae933",
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

`POST /api/driver/v1/work-sessions/4b9e4a6c-5484-426f-9bca-caa658c64979/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:01:46Z",
    "sequence": 1793217706244
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b9e4a6c-5484-426f-9bca-caa658c64979",
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
  "last_heartbeat_at": "2026-10-28T20:01:46.268525Z",
  "last_location_at": "2026-10-28T20:01:46.268525Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/79d3f988-f0af-4096-806f-f1f3c2d7938b/arrive` → **200**

```json
{
  "command_id": "04269dbc-59bd-488a-9e81-5202eef62100",
  "expected_version": 0
}
```

```json
{
  "id": "79d3f988-f0af-4096-806f-f1f3c2d7938b",
  "order_id": "e65fd56f-eca4-405f-b749-b6d658d6f70e",
  "assignment_id": "63576240-7f62-4967-85a5-70a75b3ae933",
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
  "arrived_at": "2026-10-28T20:01:46.48855Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/79d3f988-f0af-4096-806f-f1f3c2d7938b/start` → **200**

```json
{
  "command_id": "10b4f1b2-9abd-4898-a6ff-e29af693913a",
  "expected_version": 1
}
```

```json
{
  "id": "79d3f988-f0af-4096-806f-f1f3c2d7938b",
  "order_id": "e65fd56f-eca4-405f-b749-b6d658d6f70e",
  "assignment_id": "63576240-7f62-4967-85a5-70a75b3ae933",
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
  "arrived_at": "2026-10-28T20:01:46.48855Z",
  "started_at": "2026-10-28T20:01:46.751033Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/79d3f988-f0af-4096-806f-f1f3c2d7938b/complete` → **200**

```json
{
  "command_id": "3e74910c-4d4c-464b-893e-d11f61041f5a",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:01:46Z",
  "cash_received": true
}
```

```json
{
  "id": "79d3f988-f0af-4096-806f-f1f3c2d7938b",
  "order_id": "e65fd56f-eca4-405f-b749-b6d658d6f70e",
  "assignment_id": "63576240-7f62-4967-85a5-70a75b3ae933",
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
  "arrived_at": "2026-10-28T20:01:46.48855Z",
  "started_at": "2026-10-28T20:01:46.751033Z",
  "completed_at": "2026-10-28T20:01:46.984888Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c342319c-4e16-48b8-8e16-0921b87d7933",
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
      "id": "5a0fa06a-ef12-4f48-b569-c7171384b696",
      "at": "2026-10-28T20:01:47.075841Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e65fd56f-eca4-405f-b749-b6d658d6f70e"
    },
    {
      "id": "8dc726c8-d4f9-4e40-a997-b71d7830aedc",
      "at": "2026-10-28T20:01:43.780456Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/611c291a-e12a-4e35-8bef-fd751dcc7ebc/archive` → **200**

```json
{
  "command_id": "42a21c5e-2d31-4106-9115-88ff4f6d1c23",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "611c291a-e12a-4e35-8bef-fd751dcc7ebc",
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
  "created_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
  "created_at": "2026-10-28T20:01:42.880534Z",
  "updated_at": "2026-10-28T20:01:50.46529Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b9e4a6c-5484-426f-9bca-caa658c64979",
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
  "last_heartbeat_at": "2026-10-28T20:01:46.268525Z",
  "last_location_at": "2026-10-28T20:01:46.268525Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b9e4a6c-5484-426f-9bca-caa658c64979/close` → **200**

```json
{
  "command_id": "d427a486-d903-444d-a5bd-25e675bb5aba",
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

Done: order e65fd56f-eca4-405f-b749-b6d658d6f70e.

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
  "session_id": "a8446340-3115-43c0-8d5f-35fbf3d7b18e",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2MTEsImlhdCI6MTc5MzIxNzcxMSwianRpIjoiMDU2YmVjNmQtNTdjYS00YTUxLWFkZjYtZTBiY2Q2NjQ0MjBjIiwic2lkIjoiYTg0NDYzNDAtMzExNS00M2MwLThkNWYtMzVmYmYzZDdiMThlIn0.JwtrfwBV5pqickIJRpkwFMaZROHkTBbP5HilG_2CIik",
  "access_expires_at": "2026-10-28T20:16:51.327389623Z",
  "refresh_token": "2UYMQEr1L0OInE2gynsC0_Sdt0j_vd-Dh-7QmDqtlXM",
  "refresh_expires_at": "2026-10-29T08:01:51.326629369Z",
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
  "command_id": "c5ebfec1-20b7-4877-b0f5-b97955bae4e3",
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
  "session_id": "07e8fccb-cdf0-4e7d-9b56-d27363e96dfb",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2MTIsImlhdCI6MTc5MzIxNzcxMiwianRpIjoiYTUyMjUwNWMtMWU3Zi00MmI1LTk3M2EtMTFmNzlhMDk2ZmQ1Iiwic2lkIjoiMDdlOGZjY2ItY2RmMC00ZTdkLTliNTYtZDI3MzYzZTk2ZGZiIn0.PXHys7v_EVuebnUre7AtPQpl8Aa9rLbQjouqnUa_nvU",
  "access_expires_at": "2026-10-28T20:16:52.141759721Z",
  "refresh_token": "eVZWRPvIkq0vmsxFJG8qfpL0C-pm7D9aUoFrDxlGyT8",
  "refresh_expires_at": "2026-10-29T08:01:52.141152382Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.796929995",
    "linkedid": "1730052700.796929995",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671285894"
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
    "id": "1730052700.796929995",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "3d84b749-86d7-499c-aed4-374d02391723",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671285894",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T20:01:52.346479Z",
      "answered_at": null,
      "ended_at": "2026-10-28T20:01:52.370313Z",
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
    "id": "1730052600.1344229531",
    "linkedid": "1730052600.1344229531",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671285894"
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
      "id": "ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671285894",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T20:01:52.604919Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2/answer` → **200**

```json
{
  "command_id": "40aa7ccc-062b-45a8-9648-5ad4a4726e19"
}
```

```json
{
  "id": "ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671285894",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
  "order_ids": [],
  "started_at": "2026-10-28T20:01:52.604919Z",
  "answered_at": "2026-10-28T20:01:52.843901Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1344229531",
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
    "id": "1730052600.1344229531",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671285894",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "order_ids": [],
      "started_at": "2026-10-28T20:01:52.604919Z",
      "answered_at": "2026-10-28T20:01:52.843901Z",
      "ended_at": "2026-10-28T20:01:53.0713Z",
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
      "id": "ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671285894",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "order_ids": [],
      "started_at": "2026-10-28T20:01:52.604919Z",
      "answered_at": "2026-10-28T20:01:52.843901Z",
      "ended_at": "2026-10-28T20:01:53.0713Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:01:54.864191Z"
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
      "id": "ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671285894",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "order_ids": [],
      "started_at": "2026-10-28T20:01:52.604919Z",
      "answered_at": "2026-10-28T20:01:52.843901Z",
      "ended_at": "2026-10-28T20:01:53.0713Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:01:54.864191Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2` → **200**

```json
{
  "changes": [
    {
      "id": "988a648f-cd24-4d5c-ae1d-854549b88d61",
      "occurred_at": "2026-10-28T20:01:55.738352Z",
      "actor_type": "STAFF",
      "actor_id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"df221f28-073d-4517-b55e-311385a2ae95\", \"order_ids\": []}",
      "correlation_id": "4524ee60-3a88-48d2-b3a4-3c06dc822bd7"
    },
    {
      "id": "5a54aeec-9d18-4ba7-af9a-30c425808b33",
      "occurred_at": "2026-10-28T20:01:55.706924Z",
      "actor_type": "STAFF",
      "actor_id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"df221f28-073d-4517-b55e-311385a2ae95\", \"order_ids\": []}",
      "correlation_id": "e33ae37c-4ce0-47a8-97a5-ae4b23dbfefe"
    }
  ]
}
```

Done: call ea6a5baa-cb6c-47fa-8654-f7bbac34b8b2 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14817"
}
```

```json
{
  "challenge_id": "133e06b4-f646-4455-a7da-03831662db33",
  "expires_at": "2026-10-28T20:06:55.971642505Z",
  "resend_available_at": "2026-10-28T20:01:56.971642505Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "820885",
  "sent_at": "2026-10-28T20:01:55.974978308Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "133e06b4-f646-4455-a7da-03831662db33",
  "code": "820885",
  "device_ref": "sandbox-14817"
}
```

```json
{
  "session_id": "23c3eeaa-ad8a-4b97-86ed-4ca556e3277e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODYxNiwiaWF0IjoxNzkzMjE3NzE2LCJqdGkiOiIxMTg3MjRiNC05NzY1LTQ2ZjQtODVhZC1kMTM4NzExN2VhMmMiLCJzaWQiOiIyM2MzZWVhYS1hZDhhLTRiOTctODZlZC00Y2E1NTZlMzI3N2UifQ.N-08GkSzYnHkt5LGA9yMSwdryVdzfsJVVeHYFfqTEP0",
  "access_expires_at": "2026-10-28T20:16:56.197114534Z",
  "refresh_token": "6YVvyjlZNXvHqhWg6dzSSc-ZCkFMWFwAuJKIpEAqnzg",
  "refresh_expires_at": "2026-11-27T20:01:56.196619045Z",
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
  "command_id": "52e346de-1266-4b8f-99c0-5763d036d775",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:01:56Z",
    "sequence": 1793217716570
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11a0b533-9582-4fd5-b209-f0a25aca6a2c",
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
  "last_heartbeat_at": "2026-10-28T20:01:56.588199Z",
  "last_location_at": "2026-10-28T20:01:56.588199Z",
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
  "session_id": "eb67efe7-f5b6-40f5-bc35-11939f46e105",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2MTYsImlhdCI6MTc5MzIxNzcxNiwianRpIjoiYTFhYzM3NGYtODA2Zi00YjkwLWFmMWMtNWVhMjRiMzFlNWFjIiwic2lkIjoiZWI2N2VmZTctZjViNi00MGY1LWJjMzUtMTE5MzlmNDZlMTA1In0.4CJQOptyByqv6-ooUPb0ErEnIUPD66hMFBIqUfWwY9k",
  "access_expires_at": "2026-10-28T20:16:56.991903662Z",
  "refresh_token": "9ZSVl8qBle87UMGzRIxJS-rFgHltL1AIM2IYkOoAs3I",
  "refresh_expires_at": "2026-10-29T08:01:56.991418148Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4c058cb3-f2db-44b9-89d7-42bf9381fdd9",
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
  "id": "c98cf6db-6f54-4017-b6a6-5377347bd14a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:06:57.198712Z",
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
  "command_id": "42dd16db-091f-4a2f-94e2-804e2a64e492",
  "quote_id": "c98cf6db-6f54-4017-b6a6-5377347bd14a",
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
    "phone": "+380675395507"
  }
}
```

```json
{
  "id": "806e67be-b412-4201-9140-c5f72678cc3d",
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
  "created_at": "2026-10-28T20:01:57.429549Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675395507"
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
    "id": "530ccf75-e8c6-48a1-adff-a23647b15061",
    "order_id": "806e67be-b412-4201-9140-c5f72678cc3d",
    "expires_at": "2026-10-28T20:02:12.434656Z",
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

`POST /api/driver/v1/offers/530ccf75-e8c6-48a1-adff-a23647b15061/accept` → **200**

```json
{
  "command_id": "3e463569-db48-4456-a8f9-3239abf43af9"
}
```

```json
{
  "id": "111b2c46-4dd7-4195-86e3-dba2aba2554f",
  "order_id": "806e67be-b412-4201-9140-c5f72678cc3d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0b61ebd9-f5a8-4d77-b476-5138fbbd4488",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[
  {
    "phone": "+380675395507",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:01:58.997329317Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[
  {
    "phone": "+380675395507",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:01:58.997329317Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[
  {
    "phone": "+380675395507",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:01:58.997329317Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0b61ebd9-f5a8-4d77-b476-5138fbbd4488",
  "order_id": "806e67be-b412-4201-9140-c5f72678cc3d",
  "assignment_id": "111b2c46-4dd7-4195-86e3-dba2aba2554f",
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
    "phone": "+380675395507"
  }
}
```

`POST /api/driver/v1/work-sessions/11a0b533-9582-4fd5-b209-f0a25aca6a2c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:01:59Z",
    "sequence": 1793217719323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11a0b533-9582-4fd5-b209-f0a25aca6a2c",
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
  "last_heartbeat_at": "2026-10-28T20:01:59.342863Z",
  "last_location_at": "2026-10-28T20:01:59.342863Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0b61ebd9-f5a8-4d77-b476-5138fbbd4488/arrive` → **200**

```json
{
  "command_id": "5ea1f9c4-ed9b-411f-a422-7f5f9900dd84",
  "expected_version": 0
}
```

```json
{
  "id": "0b61ebd9-f5a8-4d77-b476-5138fbbd4488",
  "order_id": "806e67be-b412-4201-9140-c5f72678cc3d",
  "assignment_id": "111b2c46-4dd7-4195-86e3-dba2aba2554f",
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
  "arrived_at": "2026-10-28T20:01:59.550574Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675395507"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[
  {
    "phone": "+380675395507",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:01:58.997329317Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[
  {
    "phone": "+380675395507",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:01:58.997329317Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[
  {
    "phone": "+380675395507",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:01:58.997329317Z"
  },
  {
    "phone": "+380675395507",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:02:01.00473597Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[
  {
    "phone": "+380675395507",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:01:58.997329317Z"
  },
  {
    "phone": "+380675395507",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:02:01.00473597Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675395507` → **200**

```json
[
  {
    "phone": "+380675395507",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:01:58.997329317Z"
  },
  {
    "phone": "+380675395507",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:02:01.00473597Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/0b61ebd9-f5a8-4d77-b476-5138fbbd4488/start` → **200**

```json
{
  "command_id": "98041574-fc1e-4541-b1ca-39865908a644",
  "expected_version": 1
}
```

```json
{
  "id": "0b61ebd9-f5a8-4d77-b476-5138fbbd4488",
  "order_id": "806e67be-b412-4201-9140-c5f72678cc3d",
  "assignment_id": "111b2c46-4dd7-4195-86e3-dba2aba2554f",
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
  "arrived_at": "2026-10-28T20:01:59.550574Z",
  "started_at": "2026-10-28T20:02:01.995992Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675395507"
  }
}
```

`POST /api/driver/v1/trips/0b61ebd9-f5a8-4d77-b476-5138fbbd4488/complete` → **200**

```json
{
  "command_id": "1dc1293f-d193-4458-acee-f74d1130277b",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:02:02Z",
  "cash_received": true
}
```

```json
{
  "id": "0b61ebd9-f5a8-4d77-b476-5138fbbd4488",
  "order_id": "806e67be-b412-4201-9140-c5f72678cc3d",
  "assignment_id": "111b2c46-4dd7-4195-86e3-dba2aba2554f",
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
  "arrived_at": "2026-10-28T20:01:59.550574Z",
  "started_at": "2026-10-28T20:02:01.995992Z",
  "completed_at": "2026-10-28T20:02:02.207179Z",
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
  "session_id": "11a0b533-9582-4fd5-b209-f0a25aca6a2c",
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
  "last_heartbeat_at": "2026-10-28T20:01:59.342863Z",
  "last_location_at": "2026-10-28T20:01:59.342863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/11a0b533-9582-4fd5-b209-f0a25aca6a2c/close` → **200**

```json
{
  "command_id": "a86314ba-a4e0-41f8-9d97-1a7cc80385b6",
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
  "phone": "+380638937770",
  "device_ref": "sandbox-30821"
}
```

```json
{
  "challenge_id": "b2cf13d7-b9ef-4046-91d9-5600331f95a6",
  "expires_at": "2026-10-28T20:07:02.867054208Z",
  "resend_available_at": "2026-10-28T20:02:03.867054208Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638937770` → **200**

```json
{
  "phone": "+380638937770",
  "audience": "CLIENT",
  "code": "433329",
  "sent_at": "2026-10-28T20:02:02.870273356Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2cf13d7-b9ef-4046-91d9-5600331f95a6",
  "code": "433329",
  "device_ref": "sandbox-30821"
}
```

```json
{
  "session_id": "2ba6557d-d6a9-4dbd-93fb-628df7e7104a",
  "subject": {
    "type": "CLIENT",
    "id": "8af986d9-5ee7-43d1-baf7-17c8565fdb84"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YWY5ODZkOS01ZWU3LTQzZDEtYmFmNy0xN2M4NTY1ZmRiODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjIzLCJpYXQiOjE3OTMyMTc3MjMsImp0aSI6Ijc2MTE2MDFkLTUzMWYtNDg4OS1iZjdhLWI3NzY1NDBlN2VlMCIsInNpZCI6IjJiYTY1NTdkLWQ2YTktNGRiZC05M2ZiLTYyOGRmN2U3MTA0YSJ9.4nmH2KQ0tsHjhBErEWcS-QVT9gQRJMUOcuqSUm9m47k",
  "access_expires_at": "2026-10-28T20:17:03.098352113Z",
  "refresh_token": "uQbTYpZ8sYoaoUhCx0De0wl8rYu2K5JtW4fCyinn9iM",
  "refresh_expires_at": "2026-11-27T20:02:03.097693812Z",
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
  "device_ref": "sandbox-3502"
}
```

```json
{
  "challenge_id": "90f680fa-e4eb-4525-a782-fa34a070d96a",
  "expires_at": "2026-10-28T20:07:03.491341495Z",
  "resend_available_at": "2026-10-28T20:02:04.491341495Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "019028",
  "sent_at": "2026-10-28T20:02:03.494061622Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90f680fa-e4eb-4525-a782-fa34a070d96a",
  "code": "019028",
  "device_ref": "sandbox-3502"
}
```

```json
{
  "session_id": "a33decb9-602a-45f4-a0c2-6d596f0c52af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODYyMywiaWF0IjoxNzkzMjE3NzIzLCJqdGkiOiJiMDc3Y2JlYi05YzY0LTQyNGItYTcwZC00ZWU4YzFjNTQzOWUiLCJzaWQiOiJhMzNkZWNiOS02MDJhLTQ1ZjQtYTBjMi02ZDU5NmYwYzUyYWYifQ.D6WkDa5AHPQ2Fklyt-o8bIHBNyNBBO5p8zj46L4oIAw",
  "access_expires_at": "2026-10-28T20:17:03.722048449Z",
  "refresh_token": "fCQiOdbTTqHMZfVuiZBmy96VC5Bmoedw9Xki8h71nfk",
  "refresh_expires_at": "2026-11-27T20:02:03.721515558Z",
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
  "session_id": "a15456f1-9ddc-421d-8e38-185e2d1b460f",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2MjQsImlhdCI6MTc5MzIxNzcyNCwianRpIjoiZGZjZGU5N2ItNGRmZi00ZDZkLWEyMDAtODE3YmRmNjA2N2VhIiwic2lkIjoiYTE1NDU2ZjEtOWRkYy00MjFkLThlMzgtMTg1ZTJkMWI0NjBmIn0.u4Hk4c3g6w4WeEMpkXvznLby9MOPwhMTpTjGfOV-L9E",
  "access_expires_at": "2026-10-28T20:17:04.318592536Z",
  "refresh_token": "WR2_THNx1REMV6mg9j2YHbYubC3I2pNqsrIBN7EdxDI",
  "refresh_expires_at": "2026-10-29T08:02:04.318161685Z",
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
  "session_id": "211e683f-77b2-431e-bcef-a1481dc1d205",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2MjQsImlhdCI6MTc5MzIxNzcyNCwianRpIjoiMWIzOGE2YTQtYzk2OS00Zjc1LTk1ZDctYzZlYWZkNDE3NDBkIiwic2lkIjoiMjExZTY4M2YtNzdiMi00MzFlLWJjZWYtYTE0ODFkYzFkMjA1In0.thKhFiclvCFXR5y83s1p2-nCviuFaIg2u1xXv-OCn9I",
  "access_expires_at": "2026-10-28T20:17:04.71357196Z",
  "refresh_token": "wLbeP5TEoLHx-fA9JB0FfLxVqfY35gRnKcNUQJDIjNQ",
  "refresh_expires_at": "2026-10-29T08:02:04.713180959Z",
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
  "command_id": "a7a37e7c-09d1-4ecd-a1f9-13d5286bdeaf",
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
  "id": "02437085-f5f3-43bd-9b45-a3b532464682",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:05.119040Z",
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
  "command_id": "038f29fe-7726-40eb-bedb-f9d39b22d446",
  "quote_id": "02437085-f5f3-43bd-9b45-a3b532464682",
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
  "id": "876dad93-5101-4766-a614-c7b80f562b14",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8af986d9-5ee7-43d1-baf7-17c8565fdb84",
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
  "created_at": "2026-10-28T20:02:05.330457Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/876dad93-5101-4766-a614-c7b80f562b14` → **200**

```json
{
  "id": "876dad93-5101-4766-a614-c7b80f562b14",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8af986d9-5ee7-43d1-baf7-17c8565fdb84",
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
  "created_at": "2026-10-28T20:02:05.330457Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/876dad93-5101-4766-a614-c7b80f562b14/cancel` → **200**

```json
{
  "command_id": "cf2d758d-7508-4105-9fd2-d01b9e4e883b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "876dad93-5101-4766-a614-c7b80f562b14",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8af986d9-5ee7-43d1-baf7-17c8565fdb84",
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
  "created_at": "2026-10-28T20:02:05.330457Z",
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
  "command_id": "554284ad-be04-431d-a1f0-b29e5c38e209",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:02:06Z",
    "sequence": 1793217726170
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f15321c4-e1bd-4119-a996-602b000ab807",
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
  "last_heartbeat_at": "2026-10-28T20:02:06.187522Z",
  "last_location_at": "2026-10-28T20:02:06.187522Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18626"
}
```

```json
{
  "challenge_id": "7c087369-a912-4134-b282-68f187158a35",
  "expires_at": "2026-10-28T20:07:06.38052319Z",
  "resend_available_at": "2026-10-28T20:02:07.38052319Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "445071",
  "sent_at": "2026-10-28T20:02:06.383156439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c087369-a912-4134-b282-68f187158a35",
  "code": "445071",
  "device_ref": "sandbox-18626"
}
```

```json
{
  "session_id": "e94ed148-d4db-436f-9f2f-077504543f87",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODYyNiwiaWF0IjoxNzkzMjE3NzI2LCJqdGkiOiI1NmFhODVjNC00MzliLTRjMjEtYmI4Yi0wM2I5ZjRhN2YyMzgiLCJzaWQiOiJlOTRlZDE0OC1kNGRiLTQzNmYtOWYyZi0wNzc1MDQ1NDNmODcifQ.uDSYh5tkLe6IEdtnLMOFrDoGXq22EpylfyEBtUFcOkE",
  "access_expires_at": "2026-10-28T20:17:06.612115125Z",
  "refresh_token": "Xj-ufqUx0tXyDh8tXcs5qBiYn_aRJ87s0angn2kg5q8",
  "refresh_expires_at": "2026-11-27T20:02:06.611597008Z",
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
  "command_id": "c5a7e716-9a63-4b8d-b514-7feb1c8ad05c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:02:06Z",
    "sequence": 1793217726983
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9b92dad-556f-4394-ada4-a4cd74eacbab",
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
  "last_heartbeat_at": "2026-10-28T20:02:07.00229Z",
  "last_location_at": "2026-10-28T20:02:07.00229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "368fd6b1-34f1-46e2-ac50-9e5dcfc1a255",
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
  "id": "b1e72370-df7a-42d0-967c-0076fb32d25f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:07.206366Z",
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
  "command_id": "d8c19b8e-68cc-4e81-8553-e0884897c982",
  "quote_id": "b1e72370-df7a-42d0-967c-0076fb32d25f",
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
  "id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8af986d9-5ee7-43d1-baf7-17c8565fdb84",
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
  "created_at": "2026-10-28T20:02:07.431744Z",
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
    "id": "c5498916-2ad2-451a-9a4d-e2c72a7dfca0",
    "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
    "expires_at": "2026-10-28T20:02:22.435325Z",
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

`POST /api/driver/v1/offers/c5498916-2ad2-451a-9a4d-e2c72a7dfca0/accept` → **200**

```json
{
  "command_id": "8ad0cb92-c0f0-48ba-93a6-71209477330a"
}
```

```json
{
  "id": "6f43cee1-dabd-4733-83f9-5fe93f07d85d",
  "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ae0f5abe-c358-4c6d-ad74-1959b6f5653c",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ae0f5abe-c358-4c6d-ad74-1959b6f5653c",
  "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
  "assignment_id": "6f43cee1-dabd-4733-83f9-5fe93f07d85d",
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

`POST /api/driver/v1/trips/ae0f5abe-c358-4c6d-ad74-1959b6f5653c/cancel` → **200**

```json
{
  "command_id": "11e17041-4047-42d1-870c-4cc36dcf8224",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "ae0f5abe-c358-4c6d-ad74-1959b6f5653c",
  "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
  "assignment_id": "6f43cee1-dabd-4733-83f9-5fe93f07d85d",
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

`GET /api/rider/v1/orders/bab74460-1b30-400e-af70-2d0bc2ba72ca` → **200**

```json
{
  "id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8af986d9-5ee7-43d1-baf7-17c8565fdb84",
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
    "id": "6f43cee1-dabd-4733-83f9-5fe93f07d85d",
    "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ae0f5abe-c358-4c6d-ad74-1959b6f5653c",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T20:02:07.431744Z",
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
    "id": "f83b3a2b-5bcc-4848-b598-b631c3dfde1c",
    "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
    "expires_at": "2026-10-28T20:02:23.297363Z",
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

`POST /api/driver/v1/offers/f83b3a2b-5bcc-4848-b598-b631c3dfde1c/accept` → **200**

```json
{
  "command_id": "569fd1a6-3d64-425d-aafd-1de7dc8cb02e"
}
```

```json
{
  "id": "c1d23311-905a-4e9e-8b05-ddb6bf4676b6",
  "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b4a4249e-43ff-4c18-b352-39e6b5403305",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b4a4249e-43ff-4c18-b352-39e6b5403305",
  "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
  "assignment_id": "c1d23311-905a-4e9e-8b05-ddb6bf4676b6",
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

`POST /api/driver/v1/trips/b4a4249e-43ff-4c18-b352-39e6b5403305/cancel` → **200**

```json
{
  "command_id": "b90b5c45-cc7e-4450-8e8b-116048dfb3ea",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "b4a4249e-43ff-4c18-b352-39e6b5403305",
  "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
  "assignment_id": "c1d23311-905a-4e9e-8b05-ddb6bf4676b6",
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
    "id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T20:02:07.431744Z",
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
    "id": "876dad93-5101-4766-a614-c7b80f562b14",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T20:02:05.330457Z",
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

`GET /api/operator/v1/orders/bab74460-1b30-400e-af70-2d0bc2ba72ca/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:02:07.432367Z",
      "actor": {
        "type": "CLIENT",
        "id": "8af986d9-5ee7-43d1-baf7-17c8565fdb84",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
        "quote_id": "b1e72370-df7a-42d0-967c-0076fb32d25f",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "4e3d99e7-20c5-4622-ab97-24c82f92dc26"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:02:07.434466Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
        "attempt_id": "cc5aac62-8d1c-446e-b8d2-c476bf59a36f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4e3d99e7-20c5-4622-ab97-24c82f92dc26"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:02:07.440547Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c5498916-2ad2-451a-9a4d-e2c72a7dfca0",
        "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "4e3d99e7-20c5-4622-ab97-24c82f92dc26"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T20:02:07.852793Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c5498916-2ad2-451a-9a4d-e2c72a7dfca0",
        "order_id": "bab74460-1b30-400e-af70-2d0bc2ba72ca",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6f43cee1-dabd-4733-83f9-5fe93f07d85d"
      },
      "correlation_id": "1012a387-9914-4b98-aa30-4782efe9f2fa"
```

Done: orders 876dad93-5101-4766-a614-c7b80f562b14, bab74460-1b30-400e-af70-2d0bc2ba72ca.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733260035",
  "device_ref": "sandbox-26996"
}
```

```json
{
  "challenge_id": "205cc248-2694-4bc3-b5a1-34e24b7a48df",
  "expires_at": "2026-10-28T20:07:09.977458663Z",
  "resend_available_at": "2026-10-28T20:02:10.977458663Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733260035` → **200**

```json
{
  "phone": "+380733260035",
  "audience": "CLIENT",
  "code": "369029",
  "sent_at": "2026-10-28T20:02:09.980246202Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "205cc248-2694-4bc3-b5a1-34e24b7a48df",
  "code": "369029",
  "device_ref": "sandbox-26996"
}
```

```json
{
  "session_id": "5d625e0b-7fd6-4de4-a5c1-eaba275d22ae",
  "subject": {
    "type": "CLIENT",
    "id": "49b0121d-5dab-47b4-a75d-f6912f687501"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OWIwMTIxZC01ZGFiLTQ3YjQtYTc1ZC1mNjkxMmY2ODc1MDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjMwLCJpYXQiOjE3OTMyMTc3MzAsImp0aSI6IjM2MDRlNmE3LWU1ZTQtNDY4OS1iZjNlLTA1MWFkNWY0NDYxZCIsInNpZCI6IjVkNjI1ZTBiLTdmZDYtNGRlNC1hNWMxLWVhYmEyNzVkMjJhZSJ9.YVAwbK3pb9sv5rQ_Z7XHCDphCVq-q4lzb_jKzfGFHnM",
  "access_expires_at": "2026-10-28T20:17:10.211758116Z",
  "refresh_token": "sPXapjxQ2Jk90dnlVqbYeQGHpp-cP0aLFPPEw0NDFOE",
  "refresh_expires_at": "2026-11-27T20:02:10.211183478Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c696dd3f-f60a-4b46-b77d-1883a0f03f78",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ec9d040c-5208-4359-9e85-6a2173adc698",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ec9d040c-5208-4359-9e85-6a2173adc698",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "fb2fe92a5b8d6b70559dc4900232ead7",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ec9d040c-5208-4359-9e85-6a2173adc698",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733260035"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ec9d040c-5208-4359-9e85-6a2173adc698",
  "expires_at": "2026-10-28T20:32:10.421407Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ec9d040c-5208-4359-9e85-6a2173adc698` → **200**

```json
{
  "id": "ec9d040c-5208-4359-9e85-6a2173adc698",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T20:32:10.421407Z",
  "card": {
    "id": "ef33b29a-b46c-447d-b738-72cdd9b7f37c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9213",
    "card_type": "Visa",
    "created_at": "2026-10-28T20:02:10.642234Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "ef33b29a-b46c-447d-b738-72cdd9b7f37c",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9213",
      "card_type": "Visa",
      "created_at": "2026-10-28T20:02:10.642234Z"
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
  "device_ref": "sandbox-30398"
}
```

```json
{
  "challenge_id": "cd021d8e-eb0c-42aa-974c-22f0b4285761",
  "expires_at": "2026-10-28T20:07:11.069895913Z",
  "resend_available_at": "2026-10-28T20:02:12.069895913Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "527790",
  "sent_at": "2026-10-28T20:02:11.072680357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd021d8e-eb0c-42aa-974c-22f0b4285761",
  "code": "527790",
  "device_ref": "sandbox-30398"
}
```

```json
{
  "session_id": "ec3b4743-03c8-4abf-a5f9-1c2280adab01",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODYzMSwiaWF0IjoxNzkzMjE3NzMxLCJqdGkiOiI0ZGYwZWExMy01ZjA0LTRkMDctOWYyYy1hYzY3ZGRkNzgzOGQiLCJzaWQiOiJlYzNiNDc0My0wM2M4LTRhYmYtYTVmOS0xYzIyODBhZGFiMDEifQ.OLIvzYCQYllfBhRO3kuiNXHtxaoDV6rGYJfiYnl06RE",
  "access_expires_at": "2026-10-28T20:17:11.300789713Z",
  "refresh_token": "3PkfSMOGph5Y7p-V62HQF0kTOghSheQtYxAUE5Tcgys",
  "refresh_expires_at": "2026-11-27T20:02:11.300368447Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9b92dad-556f-4394-ada4-a4cd74eacbab",
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
  "last_heartbeat_at": "2026-10-28T20:02:07.00229Z",
  "last_location_at": "2026-10-28T20:02:07.00229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a9b92dad-556f-4394-ada4-a4cd74eacbab/handover` → **200**

```json
{
  "command_id": "d98ac3f9-cd91-46e1-81dc-c47a92b96de7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9b92dad-556f-4394-ada4-a4cd74eacbab",
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
  "last_heartbeat_at": "2026-10-28T20:02:07.00229Z",
  "last_location_at": "2026-10-28T20:02:07.00229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a9b92dad-556f-4394-ada4-a4cd74eacbab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:02:11Z",
    "sequence": 1793217731948
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9b92dad-556f-4394-ada4-a4cd74eacbab",
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
  "last_heartbeat_at": "2026-10-28T20:02:11.967738Z",
  "last_location_at": "2026-10-28T20:02:11.967738Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e96b7cc-f0da-41b3-84c1-68caed74e806",
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
  "id": "e17bb4d1-89f2-4e98-aba0-c88aaf1336be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:12.176193Z",
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
  "command_id": "10426bff-3bbc-48e1-9948-9c4843106ff5",
  "quote_id": "e17bb4d1-89f2-4e98-aba0-c88aaf1336be",
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
  "id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
  "created_at": "2026-10-28T20:02:12.396359Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d` → **200**

```json
{
  "id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
  "created_at": "2026-10-28T20:02:12.396359Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d` → **200**

```json
{
  "id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
  "created_at": "2026-10-28T20:02:12.396359Z",
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
    "id": "3672ae14-8573-45cb-b978-a58e74e79d28",
    "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
    "expires_at": "2026-10-28T20:02:28.390091Z",
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

`POST /api/driver/v1/offers/3672ae14-8573-45cb-b978-a58e74e79d28/accept` → **200**

```json
{
  "command_id": "e7f691ee-d67b-4e4e-864a-7998f6e5c991"
}
```

```json
{
  "id": "33ad920d-1342-4b5a-9619-cc9a3b1c11cb",
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "15ede9cc-cd56-4853-9fcf-45174154d86f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "15ede9cc-cd56-4853-9fcf-45174154d86f",
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "assignment_id": "33ad920d-1342-4b5a-9619-cc9a3b1c11cb",
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

`POST /api/driver/v1/work-sessions/a9b92dad-556f-4394-ada4-a4cd74eacbab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:02:14Z",
    "sequence": 1793217734635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9b92dad-556f-4394-ada4-a4cd74eacbab",
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
  "last_heartbeat_at": "2026-10-28T20:02:14.652875Z",
  "last_location_at": "2026-10-28T20:02:14.652875Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/15ede9cc-cd56-4853-9fcf-45174154d86f/arrive` → **200**

```json
{
  "command_id": "eb9b43da-fa3e-40f2-8d89-89d3a2fbb58e",
  "expected_version": 0
}
```

```json
{
  "id": "15ede9cc-cd56-4853-9fcf-45174154d86f",
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "assignment_id": "33ad920d-1342-4b5a-9619-cc9a3b1c11cb",
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
  "arrived_at": "2026-10-28T20:02:14.855029Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/15ede9cc-cd56-4853-9fcf-45174154d86f/start` → **200**

```json
{
  "command_id": "b38514db-dcf0-4660-8af6-350ec2a0976d",
  "expected_version": 1
}
```

```json
{
  "id": "15ede9cc-cd56-4853-9fcf-45174154d86f",
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "assignment_id": "33ad920d-1342-4b5a-9619-cc9a3b1c11cb",
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
  "arrived_at": "2026-10-28T20:02:14.855029Z",
  "started_at": "2026-10-28T20:02:15.083669Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/15ede9cc-cd56-4853-9fcf-45174154d86f/complete` → **200**

```json
{
  "command_id": "05a888d6-b9ba-4f73-add2-22408a2f3796",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:02:15Z",
  "cash_received": true
}
```

```json
{
  "id": "15ede9cc-cd56-4853-9fcf-45174154d86f",
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "assignment_id": "33ad920d-1342-4b5a-9619-cc9a3b1c11cb",
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
  "arrived_at": "2026-10-28T20:02:14.855029Z",
  "started_at": "2026-10-28T20:02:15.083669Z",
  "completed_at": "2026-10-28T20:02:15.297864Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d` → **200**

```json
{
  "id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
    "id": "33ad920d-1342-4b5a-9619-cc9a3b1c11cb",
    "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "15ede9cc-cd56-4853-9fcf-45174154d86f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:02:12.396359Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d` → **200**

```json
{
  "id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
    "id": "33ad920d-1342-4b5a-9619-cc9a3b1c11cb",
    "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "15ede9cc-cd56-4853-9fcf-45174154d86f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:02:12.396359Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d` → **200**

```json
{
  "id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
    "id": "33ad920d-1342-4b5a-9619-cc9a3b1c11cb",
    "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "15ede9cc-cd56-4853-9fcf-45174154d86f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:02:12.396359Z",
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

`GET /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d/tip` → **200**

```json
{
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
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
  "available_until": "2026-10-29T20:02:15.297864Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d/tip` → **201**

```json
{
  "command_id": "1b21388c-5356-40c2-b565-878923a6a798",
  "amount_minor": 2500
}
```

```json
{
  "id": "5ea7e4b4-8077-43c1-b8b6-ea9cde48dabb",
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T20:02:18.528803Z"
}
```

`GET /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d/tip` → **200**

```json
{
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
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
  "available_until": "2026-10-29T20:02:15.297864Z",
  "open": false,
  "tip": {
    "id": "5ea7e4b4-8077-43c1-b8b6-ea9cde48dabb",
    "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T20:02:18.528803Z"
  }
}
```

`GET /api/rider/v1/orders/aa3c8b7f-bb75-477c-889c-523b82ae855d/tip` → **200**

```json
{
  "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
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
  "available_until": "2026-10-29T20:02:15.297864Z",
  "open": false,
  "tip": {
    "id": "5ea7e4b4-8077-43c1-b8b6-ea9cde48dabb",
    "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T20:02:18.528803Z"
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
      "id": "0ece5cc2-c0de-4c73-91ad-f69dc81ec173",
      "at": "2026-10-28T20:02:15.435274Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
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
      "id": "84d6c5bd-d373-4011-aed9-84b714ff57bc",
      "at": "2026-10-28T20:02:20.501777Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
      "counterpart_id": null
    },
    {
      "id": "0ece5cc2-c0de-4c73-91ad-f69dc81ec173",
      "at": "2026-10-28T20:02:15.435274Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9fbab355-702c-4363-85a2-de1301379073",
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
  "id": "b2119912-aa3b-4bfc-add9-a27c5f0ab3ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:21.526521Z",
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
  "session_id": "ba475617-3a7f-4c15-b059-f7f2de08a422",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2NDEsImlhdCI6MTc5MzIxNzc0MSwianRpIjoiZDg3Y2NjMTgtMmIzZi00NTI0LTk2YWItNjVhOGVjODc2YmJjIiwic2lkIjoiYmE0NzU2MTctM2E3Zi00YzE1LWIwNTktZjdmMmRlMDhhNDIyIn0.UzHwAtlqsb5hWikH7kXBuU3fQDkZUtfWSV1bEtGeNzM",
  "access_expires_at": "2026-10-28T20:17:21.990489635Z",
  "refresh_token": "TNTF2gOwhJsjNDOp_pDwxGnsEztCRV0uMdIhX8qHcaY",
  "refresh_expires_at": "2026-10-29T08:02:21.989921272Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733260035` → **200**

```json
{
  "client_id": "49b0121d-5dab-47b4-a75d-f6912f687501"
}
```

`POST /api/admin/v1/rider-wallets/49b0121d-5dab-47b4-a75d-f6912f687501/top-ups` → **201**

```json
{
  "command_id": "3baba289-d519-4082-85e2-5004e15c6385",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
      "id": "6ecf6609-070c-4556-bd8d-403ef657ef22",
      "at": "2026-10-28T20:02:22.436304Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "271c24d1-612f-4448-8983-d978cba449ca",
  "quote_id": "b2119912-aa3b-4bfc-add9-a27c5f0ab3ff",
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
  "id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
  "created_at": "2026-10-28T20:02:22.661872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/67cc7853-54df-461f-bc58-6240e1f85ad6` → **200**

```json
{
  "id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
  "created_at": "2026-10-28T20:02:22.661872Z",
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
    "id": "10bee767-3d59-4702-a8f3-70578dac5105",
    "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
    "expires_at": "2026-10-28T20:02:37.665636Z",
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

`POST /api/driver/v1/offers/10bee767-3d59-4702-a8f3-70578dac5105/accept` → **200**

```json
{
  "command_id": "eec31d1e-bb93-4c41-af4c-ee76a60b2d96"
}
```

```json
{
  "id": "21e050a3-2aec-4718-a65c-0bd8e3a8e11a",
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cae46cc0-2326-44ea-bd72-a0ca0a844d8e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cae46cc0-2326-44ea-bd72-a0ca0a844d8e",
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
  "assignment_id": "21e050a3-2aec-4718-a65c-0bd8e3a8e11a",
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

`POST /api/driver/v1/work-sessions/a9b92dad-556f-4394-ada4-a4cd74eacbab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:02:23Z",
    "sequence": 1793217743807
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9b92dad-556f-4394-ada4-a4cd74eacbab",
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
  "last_heartbeat_at": "2026-10-28T20:02:23.826272Z",
  "last_location_at": "2026-10-28T20:02:23.826272Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cae46cc0-2326-44ea-bd72-a0ca0a844d8e/arrive` → **200**

```json
{
  "command_id": "4f0d7820-0b1c-4648-959e-9c9e2a61f952",
  "expected_version": 0
}
```

```json
{
  "id": "cae46cc0-2326-44ea-bd72-a0ca0a844d8e",
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
  "assignment_id": "21e050a3-2aec-4718-a65c-0bd8e3a8e11a",
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
  "arrived_at": "2026-10-28T20:02:24.029632Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cae46cc0-2326-44ea-bd72-a0ca0a844d8e/start` → **200**

```json
{
  "command_id": "4e1fb912-1015-4f2f-8a2c-d6c4cd591729",
  "expected_version": 1
}
```

```json
{
  "id": "cae46cc0-2326-44ea-bd72-a0ca0a844d8e",
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
  "assignment_id": "21e050a3-2aec-4718-a65c-0bd8e3a8e11a",
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
  "arrived_at": "2026-10-28T20:02:24.029632Z",
  "started_at": "2026-10-28T20:02:24.238275Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cae46cc0-2326-44ea-bd72-a0ca0a844d8e/complete` → **200**

```json
{
  "command_id": "c82c19c4-d7eb-4b74-9a1b-640402fea64b",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:02:24Z",
  "cash_received": true
}
```

```json
{
  "id": "cae46cc0-2326-44ea-bd72-a0ca0a844d8e",
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
  "assignment_id": "21e050a3-2aec-4718-a65c-0bd8e3a8e11a",
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
  "arrived_at": "2026-10-28T20:02:24.029632Z",
  "started_at": "2026-10-28T20:02:24.238275Z",
  "completed_at": "2026-10-28T20:02:24.449346Z",
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
  "client_id": "49b0121d-5dab-47b4-a75d-f6912f687501",
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
      "id": "92302d77-34b5-45bb-81cf-d71a2530825a",
      "at": "2026-10-28T20:02:24.565091Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6"
    },
    {
      "id": "6ecf6609-070c-4556-bd8d-403ef657ef22",
      "at": "2026-10-28T20:02:22.436304Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
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

`GET /api/rider/v1/orders/67cc7853-54df-461f-bc58-6240e1f85ad6/tip` → **200**

```json
{
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
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
  "available_until": "2026-10-29T20:02:24.449346Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/67cc7853-54df-461f-bc58-6240e1f85ad6/tip` → **201**

```json
{
  "command_id": "76ffdd8e-a8d7-4e79-8d70-5d498e9fa30f",
  "amount_minor": 2500
}
```

```json
{
  "id": "5e56c231-a6ee-49d8-af74-5321071bd002",
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T20:02:25.261109Z"
}
```

`GET /api/rider/v1/orders/67cc7853-54df-461f-bc58-6240e1f85ad6/tip` → **200**

```json
{
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
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
  "available_until": "2026-10-29T20:02:24.449346Z",
  "open": false,
  "tip": {
    "id": "5e56c231-a6ee-49d8-af74-5321071bd002",
    "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T20:02:25.261109Z"
  }
}
```

`GET /api/rider/v1/orders/67cc7853-54df-461f-bc58-6240e1f85ad6/tip` → **200**

```json
{
  "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
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
  "available_until": "2026-10-29T20:02:24.449346Z",
  "open": false,
  "tip": {
    "id": "5e56c231-a6ee-49d8-af74-5321071bd002",
    "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T20:02:25.261109Z"
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
      "id": "cb878d02-db5a-4081-9b2b-2d90c26ebc42",
      "at": "2026-10-28T20:02:26.599597Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
      "counterpart_id": null
    },
    {
      "id": "5e16f2be-494d-4358-a246-8ee51a9e152b",
      "at": "2026-10-28T20:02:24.557057Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "67cc7853-54df-461f-bc58-6240e1f85ad6",
      "counterpart_id": null
    },
    {
      "id": "84d6c5bd-d373-4011-aed9-84b714ff57bc",
      "at": "2026-10-28T20:02:20.501777Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
      "counterpart_id": null
    },
    {
      "id": "0ece5cc2-c0de-4c73-91ad-f69dc81ec173",
      "at": "2026-10-28T20:02:15.435274Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "aa3c8b7f-bb75-477c-889c-523b82ae855d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a9b92dad-556f-4394-ada4-a4cd74eacbab",
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
  "last_heartbeat_at": "2026-10-28T20:02:23.826272Z",
  "last_location_at": "2026-10-28T20:02:23.826272Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a9b92dad-556f-4394-ada4-a4cd74eacbab/close` → **200**

```json
{
  "command_id": "14641758-4eb8-4638-9958-0ab661859147",
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

Done: card order 67cc7853-54df-461f-bc58-6240e1f85ad6.

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
  "phone": "+380738877376",
  "device_ref": "sandbox-17472"
}
```

```json
{
  "challenge_id": "a0ef4d7d-377a-42ff-b261-dac3c102998e",
  "expires_at": "2026-10-28T20:07:27.666271662Z",
  "resend_available_at": "2026-10-28T20:02:28.666271662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738877376` → **200**

```json
{
  "phone": "+380738877376",
  "audience": "CLIENT",
  "code": "734447",
  "sent_at": "2026-10-28T20:02:27.669235279Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0ef4d7d-377a-42ff-b261-dac3c102998e",
  "code": "734447",
  "device_ref": "sandbox-17472"
}
```

```json
{
  "session_id": "9097b2d1-6113-4e94-a032-1c331c1cb36a",
  "subject": {
    "type": "CLIENT",
    "id": "9da75621-a74f-4145-87e5-22d08743728f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGE3NTYyMS1hNzRmLTQxNDUtODdlNS0yMmQwODc0MzcyOGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjQ3LCJpYXQiOjE3OTMyMTc3NDcsImp0aSI6ImRkYTlhNGIyLWZmYjUtNDQxOC1hYTRhLTBlN2FjNTdhMmYxYiIsInNpZCI6IjkwOTdiMmQxLTYxMTMtNGU5NC1hMDMyLTFjMzMxYzFjYjM2YSJ9.t37e89FiVqGekz8Wg03Atr24OQQECJlVDgGWSfrqUvc",
  "access_expires_at": "2026-10-28T20:17:27.887837053Z",
  "refresh_token": "JohYcaz144mDAlfSrilAeRAM26mRM3V1UMQA5BkFiO8",
  "refresh_expires_at": "2026-11-27T20:02:27.887499273Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "1b9e4a07-dcec-4275-a8a1-7123fc02cbc0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "dd062418-3270-42f5-8ae0-5c391318a378",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-dd062418-3270-42f5-8ae0-5c391318a378",
    "orderDate": "1793217748",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "c777841bd1ef7d0ec812e27a95428bd4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=dd062418-3270-42f5-8ae0-5c391318a378",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738877376"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=dd062418-3270-42f5-8ae0-5c391318a378",
  "created_at": "2026-10-28T20:02:28.088204Z",
  "expires_at": "2026-10-28T20:32:28.088204Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/dd062418-3270-42f5-8ae0-5c391318a378` → **200**

```json
{
  "id": "dd062418-3270-42f5-8ae0-5c391318a378",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T20:02:28.088204Z",
  "expires_at": "2026-10-28T20:32:28.088204Z",
  "completed_at": "2026-10-28T20:02:28.298152Z",
  "masked_pan": "41****4221",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9da75621-a74f-4145-87e5-22d08743728f",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9da75621-a74f-4145-87e5-22d08743728f",
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
      "id": "9624bf9c-d1a7-43aa-bc9b-d72e0d336aeb",
      "at": "2026-10-28T20:02:28.619441Z",
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
  "client_id": "9da75621-a74f-4145-87e5-22d08743728f",
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
      "id": "9624bf9c-d1a7-43aa-bc9b-d72e0d336aeb",
      "at": "2026-10-28T20:02:28.619441Z",
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
  "device_ref": "sandbox-2904"
}
```

```json
{
  "challenge_id": "87e708c3-4bef-4616-8e2d-5d42214de609",
  "expires_at": "2026-10-28T20:07:30.119521889Z",
  "resend_available_at": "2026-10-28T20:02:31.119521889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "222787",
  "sent_at": "2026-10-28T20:02:30.121759084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87e708c3-4bef-4616-8e2d-5d42214de609",
  "code": "222787",
  "device_ref": "sandbox-2904"
}
```

```json
{
  "session_id": "0bcd5624-5c2d-4178-82af-7db6681aa458",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODY1MCwiaWF0IjoxNzkzMjE3NzUwLCJqdGkiOiIzOTUxMDg0NC0wMDk4LTQ5ZWEtYjgwYy00ZDEyMWFkY2FkNGQiLCJzaWQiOiIwYmNkNTYyNC01YzJkLTQxNzgtODJhZi03ZGI2NjgxYWE0NTgifQ.syyorceDdHURg2v79Uks77aT_H3P2lLl21wlm9G-4fU",
  "access_expires_at": "2026-10-28T20:17:30.339468272Z",
  "refresh_token": "5uRPNzHRwkxae8JKhNMISM2IEFMgkm4WMmYystIWJJg",
  "refresh_expires_at": "2026-11-27T20:02:30.339012063Z",
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
  "command_id": "b032affb-4aea-490d-83cc-9a2d02270dc5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "9e99e34c-4993-4952-a269-0ceee4de5910",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9e99e34c-4993-4952-a269-0ceee4de5910",
    "orderDate": "1793217750",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "666954dd7ae7c2fd7b771eb814429243",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9e99e34c-4993-4952-a269-0ceee4de5910",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9e99e34c-4993-4952-a269-0ceee4de5910",
  "created_at": "2026-10-28T20:02:30.746752Z",
  "expires_at": "2026-10-28T20:32:30.746752Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/9e99e34c-4993-4952-a269-0ceee4de5910` → **200**

```json
{
  "id": "9e99e34c-4993-4952-a269-0ceee4de5910",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T20:02:30.746752Z",
  "expires_at": "2026-10-28T20:32:30.746752Z",
  "completed_at": "2026-10-28T20:02:30.946109Z",
  "masked_pan": "41****8267",
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
      "id": "2dec7417-beeb-4c02-83ea-f77736d5a531",
      "at": "2026-10-28T20:02:31.639442Z",
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
  "command_id": "807fc59f-5e7e-43d0-8207-396eac8724e1",
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
  "correlation_id": "c1c2eb10-ae48-4f15-83b6-5c86fac2804a"
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
  "session_id": "723fc2df-36be-4ee6-8c59-db50b9490d12",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2NTMsImlhdCI6MTc5MzIxNzc1MywianRpIjoiMWQ0OTMwMjMtNjc1Zi00N2ZhLTlkOGYtNWRmZTA5MGYxODlkIiwic2lkIjoiNzIzZmMyZGYtMzZiZS00ZWU2LThjNTktZGI1MGI5NDkwZDEyIn0.sfp1Y8inbkPryp9GZArSj7WiWYi9wB9vU8G064b8KDU",
  "access_expires_at": "2026-10-28T20:17:33.062218768Z",
  "refresh_token": "zZReh5mEpp06UY3NbrszeInDny2oEWOEabyBq18vyCU",
  "refresh_expires_at": "2026-10-29T08:02:33.061789751Z",
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
  "phone": "+48600474146",
  "device_ref": "sandbox-15739"
}
```

```json
{
  "challenge_id": "58f71cc4-7618-44db-94b5-84ebde3c69ca",
  "expires_at": "2026-10-28T20:07:33.661937757Z",
  "resend_available_at": "2026-10-28T20:02:34.661937757Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600474146` → **200**

```json
{
  "phone": "+48600474146",
  "audience": "CLIENT",
  "code": "174517",
  "sent_at": "2026-10-28T20:02:33.664088264Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58f71cc4-7618-44db-94b5-84ebde3c69ca",
  "code": "174517",
  "device_ref": "sandbox-15739"
}
```

```json
{
  "session_id": "3bbcef25-72f1-4f16-a1ac-51f29090b616",
  "subject": {
    "type": "CLIENT",
    "id": "eb379af2-a961-4052-9429-927d5350cae1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjM3OWFmMi1hOTYxLTQwNTItOTQyOS05MjdkNTM1MGNhZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjUzLCJpYXQiOjE3OTMyMTc3NTMsImp0aSI6ImQwYzg2YzNmLWZiMzEtNGEwNi04YTc5LTQ1NzMxYjhlMTUxYSIsInNpZCI6IjNiYmNlZjI1LTcyZjEtNGYxNi1hMWFjLTUxZjI5MDkwYjYxNiJ9.dw0rAuyY6z2ytadg_DFgy8KFXrwDYz1KoRUEwBDPj6o",
  "access_expires_at": "2026-10-28T20:17:33.882348846Z",
  "refresh_token": "3ObCvDPfaZQvkAiLjswFgxxQUo7ie5obNQXX10CTK_M",
  "refresh_expires_at": "2026-11-27T20:02:33.881984626Z",
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
  "command_id": "1554b2e4-99db-4f9e-9eae-609b3d63dfd9",
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
  "correlation_id": "1c4e025b-5a60-4490-93f3-6812055a47c2",
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
  "command_id": "04168041-27e3-4fac-9956-be0a169cf18a",
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
  "paused_at": "2026-10-28T20:02:34.715104649Z",
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
  "command_id": "5580587f-a74b-448a-b74b-96562725a44d",
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
  "id": "0269e6bb-f784-41ba-9371-db57046e2f84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:35.144069Z",
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
  "command_id": "3f6aa447-f109-4ea6-9e80-35feb408815c",
  "quote_id": "0269e6bb-f784-41ba-9371-db57046e2f84",
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
  "correlation_id": "a8ef05f1-4c7d-4550-ba7b-3032b00edef6"
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
  "paused_at": "2026-10-28T20:02:34.715105Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "4644b8cc-e791-408d-9053-eaee2944696e",
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
  "command_id": "db3f0493-c7a3-4f05-ba94-046dec2ccfd7",
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
  "command_id": "f0363c8e-3606-417a-9c72-7e9362b8140d",
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
  "id": "d2ebdf68-a1e5-40ad-8200-d39b081f0c01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:36.409086Z",
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
  "command_id": "83e477f1-04e3-4247-bbd4-13dd656a9ec8",
  "quote_id": "d2ebdf68-a1e5-40ad-8200-d39b081f0c01",
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
  "correlation_id": "99455298-dcb1-419c-9e39-62d6130d8198"
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
  "command_id": "a7e80d95-a32c-4524-94ef-b57498d6373e",
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
  "command_id": "4fb516ce-6d4f-4dec-828e-6a6ec8da22b7",
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
  "id": "c992e83e-cbb3-494a-89c5-8d12a97954b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:37.221103Z",
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
  "command_id": "e3ab8a6a-cdac-471a-bde4-ae3824480a74",
  "quote_id": "c992e83e-cbb3-494a-89c5-8d12a97954b0",
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
  "correlation_id": "2536e9a9-a64b-4c18-882f-443075605033"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "7a05dd99-edf2-450e-8ad2-274cd68e972f",
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
  "correlation_id": "d44c315d-9195-49a6-9051-d16134c00b8d"
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
  "command_id": "7019e096-87b2-4580-9bcd-584509b29a05",
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
  "phone": "+380675941756",
  "device_ref": "sandbox-30885"
}
```

```json
{
  "challenge_id": "1080fe21-f8c0-454a-b648-3d1aa1cbb96a",
  "expires_at": "2026-10-28T20:07:38.267884931Z",
  "resend_available_at": "2026-10-28T20:02:39.267884931Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675941756` → **200**

```json
{
  "phone": "+380675941756",
  "audience": "CLIENT",
  "code": "079951",
  "sent_at": "2026-10-28T20:02:38.270028749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1080fe21-f8c0-454a-b648-3d1aa1cbb96a",
  "code": "079951",
  "device_ref": "sandbox-30885"
}
```

```json
{
  "session_id": "b4afbb65-a986-47c0-8322-9383bd1569d8",
  "subject": {
    "type": "CLIENT",
    "id": "18a27909-216f-4a30-90eb-ef99a6d0350e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOGEyNzkwOS0yMTZmLTRhMzAtOTBlYi1lZjk5YTZkMDM1MGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjU4LCJpYXQiOjE3OTMyMTc3NTgsImp0aSI6Ijc5Mjg2MThjLWM0Y2QtNDJmMC1hMzVjLTdkNzY1MzIxM2E4NyIsInNpZCI6ImI0YWZiYjY1LWE5ODYtNDdjMC04MzIyLTkzODNiZDE1NjlkOCJ9.jJbEf5MSnJtrKf_DxAy_Z9Hy9lfxSY_mYqiVQJecngo",
  "access_expires_at": "2026-10-28T20:17:38.48769717Z",
  "refresh_token": "_sgDawT8MnZH0e4B535CPx-BBnL4pWhIX6MCC6Qswpo",
  "refresh_expires_at": "2026-11-27T20:02:38.487250876Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "18a27909-216f-4a30-90eb-ef99a6d0350e",
  "session_id": "b4afbb65-a986-47c0-8322-9383bd1569d8",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "de48c6b1-05e5-4e64-b8d3-435c17cac4d5",
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
  "id": "858a188d-5f7b-472d-baf3-a9804a02cd43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:38.884497Z",
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
  "challenge_id": "15d25b85-fd49-4919-8f45-38c3020f1889",
  "expires_at": "2026-10-28T20:07:41.09271876Z",
  "resend_available_at": "2026-10-28T20:02:42.09271876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675941756` → **200**

```json
{
  "phone": "+380675941756",
  "audience": "CLIENT",
  "code": "475743",
  "sent_at": "2026-10-28T20:02:41.094687132Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "af854252-1f3f-49fb-96a4-d73475e5dc43",
  "challenge_id": "15d25b85-fd49-4919-8f45-38c3020f1889",
  "otp_code": "475743"
}
```

```json
{
  "client_id": "18a27909-216f-4a30-90eb-ef99a6d0350e",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T20:02:41.326814563Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "564b05c5-c5f9-4f8d-a386-d056cb9894ea",
  "quote_id": "858a188d-5f7b-472d-baf3-a9804a02cd43",
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
  "correlation_id": "25d2d813-19a2-4125-9293-a7965ed3655a"
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
  "session_id": "b9b05000-2dee-474c-ab25-421ba12d2fd1",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2NjEsImlhdCI6MTc5MzIxNzc2MSwianRpIjoiMzllZGU1YWUtNDU4Ni00YWEyLWFhZjUtODBhZDNkNjUxZTk0Iiwic2lkIjoiYjliMDUwMDAtMmRlZS00NzRjLWFiMjUtNDIxYmExMmQyZmQxIn0.zI_w4fiEQvTIc7Vpt51m0mwz6LL8SlRSeUP3IJVETVA",
  "access_expires_at": "2026-10-28T20:17:41.953317498Z",
  "refresh_token": "Z97Do8K97jnlVFeBWlKmYl-5tNyLpsEMHhDjOlqhq0A",
  "refresh_expires_at": "2026-10-29T08:02:41.952948221Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "18a27909-216f-4a30-90eb-ef99a6d0350e",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T20:02:41.326815Z",
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

`POST /api/admin/v1/client-deletions/18a27909-216f-4a30-90eb-ef99a6d0350e/complete` → **200**

```json
{
  "command_id": "825ec7cc-155e-4d44-974d-817a41d36e7f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "18a27909-216f-4a30-90eb-ef99a6d0350e",
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
  "correlation_id": "1acc5325-3017-4754-afe0-755fe30971f6"
}
```

Done: client 18a27909-216f-4a30-90eb-ef99a6d0350e anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667398292",
  "device_ref": "sandbox-15348"
}
```

```json
{
  "challenge_id": "63c7b470-73df-40e9-9d90-e1d49ac92a72",
  "expires_at": "2026-10-28T20:07:42.790431185Z",
  "resend_available_at": "2026-10-28T20:02:43.790431185Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667398292` → **200**

```json
{
  "phone": "+380667398292",
  "audience": "CLIENT",
  "code": "327775",
  "sent_at": "2026-10-28T20:02:42.792596685Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63c7b470-73df-40e9-9d90-e1d49ac92a72",
  "code": "327775",
  "device_ref": "sandbox-15348"
}
```

```json
{
  "session_id": "8bffc3d3-e446-4a17-92d8-efa320b731ad",
  "subject": {
    "type": "CLIENT",
    "id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjE5MzkxZC0yOWU4LTRkNmUtYWJjNy05YjVjZjdkYjExNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjYzLCJpYXQiOjE3OTMyMTc3NjMsImp0aSI6IjhjOTZhYmJjLTRhZDQtNGNiMC05NzA3LTU3NTc3YzRlNDQ5MCIsInNpZCI6IjhiZmZjM2QzLWU0NDYtNGExNy05MmQ4LWVmYTMyMGI3MzFhZCJ9.ie10CxknUgeW_ZlY9LHRB7j8C-0lLWK6bObpH8zI4cI",
  "access_expires_at": "2026-10-28T20:17:43.010177896Z",
  "refresh_token": "LDnojalErdAdPylrDEpHdxhSN1xAZUHlmGHndSHP7Vk",
  "refresh_expires_at": "2026-11-27T20:02:43.009710571Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160",
  "session_id": "8bffc3d3-e446-4a17-92d8-efa320b731ad",
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
  "session_id": "3a52cfbe-963a-4642-91db-05577170256e",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2NjMsImlhdCI6MTc5MzIxNzc2MywianRpIjoiZWZkY2Y3YzgtNmMxNi00ZTU1LWIxNmMtMjQ5NDMzZTJkNDUyIiwic2lkIjoiM2E1MmNmYmUtOTYzYS00NjQyLTkxZGItMDU1NzcxNzAyNTZlIn0.yYxshXTDQdnRvPiq3704_akMGf3qa1W8lpUarWTZ0j0",
  "access_expires_at": "2026-10-28T20:17:43.586373855Z",
  "refresh_token": "732PtRo1vv_8Le3d2kFv8TxqoQnUljJ4UedYfW6c4Zc",
  "refresh_expires_at": "2026-10-29T08:02:43.585968913Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7398292&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160",
      "phone": "+380667398292",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T20:02:43.007897Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c219391d-29e8-4d6e-abc7-9b5cf7db1160` → **200**

```json
{
  "client": {
    "id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160",
    "phone": "+380667398292",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T20:02:43.007897Z",
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

`POST /api/admin/v1/clients/c219391d-29e8-4d6e-abc7-9b5cf7db1160/block` → **400**

```json
{
  "command_id": "4a005119-ece4-4d72-b146-5b7ccd5339b6",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c219391d-29e8-4d6e-abc7-9b5cf7db1160/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "560b034e-edb8-4726-ba97-5e67271c5dd1",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c219391d-29e8-4d6e-abc7-9b5cf7db1160/block` → **200**

```json
{
  "command_id": "646ed655-0d88-4672-bdcd-1eae18787170",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160",
  "phone": "+380667398292",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T20:02:43.007897Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T20:02:44.426602Z",
    "by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
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
  "correlation_id": "cd287d0a-30b9-4960-a6ba-51a8ec7198d9"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667398292",
  "device_ref": "sandbox-25177"
}
```

```json
{
  "challenge_id": "7f278a1e-e90f-4fcf-8e20-51d5b3bd15f5",
  "expires_at": "2026-10-28T20:07:46.797107743Z",
  "resend_available_at": "2026-10-28T20:02:47.797107743Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667398292` → **200**

```json
{
  "phone": "+380667398292",
  "audience": "CLIENT",
  "code": "305915",
  "sent_at": "2026-10-28T20:02:46.799006885Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "7f278a1e-e90f-4fcf-8e20-51d5b3bd15f5",
  "code": "305915",
  "device_ref": "sandbox-25177"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "77daf7c9-9a54-4948-99bb-cd2e4f312064"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c219391d-29e8-4d6e-abc7-9b5cf7db1160` → **200**

```json
{
  "client": {
    "id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160",
    "phone": "+380667398292",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T20:02:43.007897Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T20:02:44.426602Z",
      "by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
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

`POST /api/admin/v1/clients/c219391d-29e8-4d6e-abc7-9b5cf7db1160/unblock` → **200**

```json
{
  "command_id": "3561313e-3cd7-42a3-87a3-55b1d64ff922",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160",
  "phone": "+380667398292",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T20:02:43.007897Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667398292",
  "device_ref": "sandbox-4357"
}
```

```json
{
  "challenge_id": "a73544ff-3064-4d90-bfa1-3dc2b5347b8e",
  "expires_at": "2026-10-28T20:07:49.616803783Z",
  "resend_available_at": "2026-10-28T20:02:50.616803783Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667398292` → **200**

```json
{
  "phone": "+380667398292",
  "audience": "CLIENT",
  "code": "684076",
  "sent_at": "2026-10-28T20:02:49.61845959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a73544ff-3064-4d90-bfa1-3dc2b5347b8e",
  "code": "684076",
  "device_ref": "sandbox-4357"
}
```

```json
{
  "session_id": "00a6b81b-233a-4f0d-a7f6-1b079856d371",
  "subject": {
    "type": "CLIENT",
    "id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjE5MzkxZC0yOWU4LTRkNmUtYWJjNy05YjVjZjdkYjExNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjY5LCJpYXQiOjE3OTMyMTc3NjksImp0aSI6IjI2YmYzOWI1LWY3YjEtNGJhZS1iMzdmLWVlOGZmMzBlMjhlZCIsInNpZCI6IjAwYTZiODFiLTIzM2EtNGYwZC1hN2Y2LTFiMDc5ODU2ZDM3MSJ9.saTh30ZR1p6KV-O_SfdaXKZT47HsubHgbd1cXLpEVaM",
  "access_expires_at": "2026-10-28T20:17:49.820726536Z",
  "refresh_token": "RT7LzSbpkat-LuT5hLTezLG4566oUALP3sN7CMGFC7I",
  "refresh_expires_at": "2026-11-27T20:02:49.820248492Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c219391d-29e8-4d6e-abc7-9b5cf7db1160",
  "session_id": "00a6b81b-233a-4f0d-a7f6-1b079856d371",
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
  "phone": "+380664318215",
  "device_ref": "sandbox-27313"
}
```

```json
{
  "challenge_id": "3b8ed199-b086-430e-86d7-a528674ecc8e",
  "expires_at": "2026-10-28T20:07:50.194092548Z",
  "resend_available_at": "2026-10-28T20:02:51.194092548Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664318215` → **200**

```json
{
  "phone": "+380664318215",
  "audience": "CLIENT",
  "code": "627048",
  "sent_at": "2026-10-28T20:02:50.195986825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b8ed199-b086-430e-86d7-a528674ecc8e",
  "code": "627048",
  "device_ref": "sandbox-27313"
}
```

```json
{
  "session_id": "d02e7af6-4bf3-4756-8bb6-64a7f420954c",
  "subject": {
    "type": "CLIENT",
    "id": "b238fe95-463d-426e-beda-a1494fd16600"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjM4ZmU5NS00NjNkLTQyNmUtYmVkYS1hMTQ5NGZkMTY2MDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjcwLCJpYXQiOjE3OTMyMTc3NzAsImp0aSI6ImU0N2UzYmIwLTI2NDAtNDFiYy04NTFmLTRiODUzMmYwMDI3NyIsInNpZCI6ImQwMmU3YWY2LTRiZjMtNDc1Ni04YmI2LTY0YTdmNDIwOTU0YyJ9.nd7JBtX9v_-O_FWIS7fae4ycf8AZn5186j4zLx3kkOo",
  "access_expires_at": "2026-10-28T20:17:50.411136405Z",
  "refresh_token": "QbHTxRZFzM-R2gyICNOrQS5dNGfgyJl_tEh57qGhR4o",
  "refresh_expires_at": "2026-11-27T20:02:50.410669823Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f742d999-d8f9-4c8a-99fa-87cb1bb6bc5c",
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
  "id": "0b9e92d0-5b02-4813-8e92-0412af7908b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:07:50.603294Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: b25c81a9-fb30-42e3-91cf-51b56ecdd3a8) → **201**

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
  "session_id": "00fce9a2-4478-4048-af71-b9f03fa63044",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2NzEsImlhdCI6MTc5MzIxNzc3MSwianRpIjoiMzI2NTM1YzktY2ZhZi00ZjhmLTg0OTAtMzg4MmY3MTkyNGM5Iiwic2lkIjoiMDBmY2U5YTItNDQ3OC00MDQ4LWFmNzEtYjlmMDNmYTYzMDQ0In0.qLUSCoFZJW104KzJQSUfG-C9WCPXaqQoi3b89y_Rc-E",
  "access_expires_at": "2026-10-28T20:17:51.032586119Z",
  "refresh_token": "-W6zEMrwZKlcXQHatWp_39oIyIDf2v1dlMMvL-M5gOI",
  "refresh_expires_at": "2026-10-29T08:02:51.032165746Z",
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
  "session_id": "55cdca71-c091-4dbf-a2f5-88e9527419a4",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2NzEsImlhdCI6MTc5MzIxNzc3MSwianRpIjoiOWZjN2VmNmQtZDkxYS00NzQxLTk3YmItMTNkNDFiNGU1YTk0Iiwic2lkIjoiNTVjZGNhNzEtYzA5MS00ZGJmLWEyZjUtODhlOTUyNzQxOWE0In0.Z2a5cDcSuR2hqQ_qCk1RIkrhZ7cX7tBzhuZ6oKpXsPA",
  "access_expires_at": "2026-10-28T20:17:51.489411519Z",
  "refresh_token": "WDj4b-CValbAtYKBiIo8EXKZ7gpF6vnchqnLFjhWZNs",
  "refresh_expires_at": "2026-10-29T08:02:51.489025075Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/81490543-1e76-4fea-a4f0-0530300c5a7f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:02:50.799218Z",
      "actor": {
        "type": "CLIENT",
        "id": "b238fe95-463d-426e-beda-a1494fd16600",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "81490543-1e76-4fea-a4f0-0530300c5a7f",
        "quote_id": "0b9e92d0-5b02-4813-8e92-0412af7908b2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b25c81a9-fb30-42e3-91cf-51b56ecdd3a8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:02:50.80098Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "81490543-1e76-4fea-a4f0-0530300c5a7f",
        "attempt_id": "4ea1f843-07a3-4121-bf7a-5e0b71fd9c10",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b25c81a9-fb30-42e3-91cf-51b56ecdd3a8"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T20:02:50.807871Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "81490543-1e76-4fea-a4f0-0530300c5a7f",
        "attempt_id": "4ea1f843-07a3-4121-bf7a-5e0b71fd9c10"
      },
      "correlation_id": "b25c81a9-fb30-42e3-91cf-51b56ecdd3a8"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "4ea1f843-07a3-4121-bf7a-5e0b71fd9c10",
        "generation": 1,
        "started_at": "2026-10-28T20:02:50.800252Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T20:02:50.807871Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T20:02:50.801661Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/b25c81a9-fb30-42e3-91cf-51b56ecdd3a8` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "81490543-1e76-4fea-a4f0-0530300c5a7f:0",
      "order_id": "81490543-1e76-4fea-a4f0-0530300c5a7f",
      "at": "2026-10-28T20:02:50.799218Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "81490543-1e76-4fea-a4f0-0530300c5a7f:1",
      "order_id": "81490543-1e76-4fea-a4f0-0530300c5a7f",
      "at": "2026-10-28T20:02:50.80098Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "81490543-1e76-4fea-a4f0-0530300c5a7f:2",
      "order_id": "81490543-1e76-4fea-a4f0-0530300c5a7f",
      "at": "2026-10-28T20:02:50.807871Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/91d8e3d2-bff8-429e-883f-a27d4143fec5` → **200**

```json
{
  "found": []
}
```

Done: request b25c81a9-fb30-42e3-91cf-51b56ecdd3a8 — order 81490543-1e76-4fea-a4f0-0530300c5a7f found by its id.

`GET /api/rider/v1/orders/81490543-1e76-4fea-a4f0-0530300c5a7f` → **200**

```json
{
  "id": "81490543-1e76-4fea-a4f0-0530300c5a7f",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b238fe95-463d-426e-beda-a1494fd16600",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:02:50.798727Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/81490543-1e76-4fea-a4f0-0530300c5a7f/cancel` → **200**

```json
{
  "command_id": "77b38598-b6f1-44c9-943b-be853ce6301e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "81490543-1e76-4fea-a4f0-0530300c5a7f",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b238fe95-463d-426e-beda-a1494fd16600",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:02:50.798727Z",
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
  "phone": "+380638753874",
  "device_ref": "sandbox-2234"
}
```

```json
{
  "challenge_id": "93646736-75af-4d45-82e2-a0279ed1c061",
  "expires_at": "2026-10-28T20:07:52.722827791Z",
  "resend_available_at": "2026-10-28T20:02:53.722827791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638753874` → **200**

```json
{
  "phone": "+380638753874",
  "audience": "CLIENT",
  "code": "585784",
  "sent_at": "2026-10-28T20:02:52.725540382Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93646736-75af-4d45-82e2-a0279ed1c061",
  "code": "585784",
  "device_ref": "sandbox-2234"
}
```

```json
{
  "session_id": "e536f9c1-0f67-4b4a-a37a-344243934ac2",
  "subject": {
    "type": "CLIENT",
    "id": "929ebd53-4949-4f7b-88a3-9f6786e39e73"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MjllYmQ1My00OTQ5LTRmN2ItODhhMy05ZjY3ODZlMzllNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjcyLCJpYXQiOjE3OTMyMTc3NzIsImp0aSI6ImJjNzA5MzkxLWEwMjUtNGE1NS05MTY2LWNhMTUzYzRiOGIxMiIsInNpZCI6ImU1MzZmOWMxLTBmNjctNGI0YS1hMzdhLTM0NDI0MzkzNGFjMiJ9.n68gQfS3AiCnIlaaCdzKxEIGvCNQMH4eKYVry2BRQK4",
  "access_expires_at": "2026-10-28T20:17:52.996073086Z",
  "refresh_token": "8cXrSMxmbwq2hLlbRi1ovFJ2V698EhAfzFpxvp2w_sM",
  "refresh_expires_at": "2026-11-27T20:02:52.995601895Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b7162c39-9deb-40cc-8115-03b8f347b9eb",
  "expires_at": "2026-10-28T20:07:55.185247755Z",
  "resend_available_at": "2026-10-28T20:02:56.185247755Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638753874` → **200**

```json
{
  "phone": "+380638753874",
  "audience": "CLIENT",
  "code": "968504",
  "sent_at": "2026-10-28T20:02:55.186715095Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "0446bcfa-edc5-4495-ad0a-dfc479b0ac37",
  "challenge_id": "b7162c39-9deb-40cc-8115-03b8f347b9eb",
  "otp_code": "968504"
}
```

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "PENDING",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436` → **200**

```json
{
  "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
  "state": "READY",
  "created_at": "2026-10-28T20:02:55.404423Z",
  "ready_at": "2026-10-28T20:03:04.880978Z",
  "expires_at": "2026-11-04T20:03:04.880978Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630094652",
  "device_ref": "sandbox-20198"
}
```

```json
{
  "challenge_id": "2e60d634-725d-4dd2-9bcc-b35fe7bfd45c",
  "expires_at": "2026-10-28T20:08:05.317559979Z",
  "resend_available_at": "2026-10-28T20:03:06.317559979Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630094652` → **200**

```json
{
  "phone": "+380630094652",
  "audience": "CLIENT",
  "code": "022011",
  "sent_at": "2026-10-28T20:03:05.320468599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e60d634-725d-4dd2-9bcc-b35fe7bfd45c",
  "code": "022011",
  "device_ref": "sandbox-20198"
}
```

```json
{
  "session_id": "6a17867e-a3cf-438f-87f2-b7c708c0d9b4",
  "subject": {
    "type": "CLIENT",
    "id": "83dbc389-7c55-4d2b-ab48-aec621b838ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2RiYzM4OS03YzU1LTRkMmItYWI0OC1hZWM2MjFiODM4YWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4Njg1LCJpYXQiOjE3OTMyMTc3ODUsImp0aSI6ImZkNWMzN2Q2LWU4YTEtNDhlNS1hMjY5LTY4ZTQ2YTNlNDJlYiIsInNpZCI6IjZhMTc4NjdlLWEzY2YtNDM4Zi04N2YyLWI3YzcwOGMwZDliNCJ9.LLUEHN9oUhhDw1JC2g4RzHGJQUuilYbl3hxqj3AYqGE",
  "access_expires_at": "2026-10-28T20:18:05.541174725Z",
  "refresh_token": "zRLt9QV6dCJk02SA4-FW9oAkLSFxZibI90y-OoT-jBE",
  "refresh_expires_at": "2026-11-27T20:03:05.540838778Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/8c2251dd-8950-4741-b783-48da9d3f6436/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "220cd798-6332-465a-a8e6-ac083a9b5344"
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
  "session_id": "cf13454b-6044-4928-b495-9eff07d0e649",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2ODYsImlhdCI6MTc5MzIxNzc4NiwianRpIjoiMjVmMWJjNjgtNjQ2Mi00YzI5LTkyYTEtYzAwY2ZhN2U0N2NjIiwic2lkIjoiY2YxMzQ1NGItNjA0NC00OTI4LWI0OTUtOWVmZjA3ZDBlNjQ5In0.FLxXct3XzL33pClkMsdzABo1VkM__bvRQ2P1I1WMzQE",
  "access_expires_at": "2026-10-28T20:18:06.14424016Z",
  "refresh_token": "KJBhDpfqczobvqqYQwK4G28OXxv_yAv2KxCkKkgLuFE",
  "refresh_expires_at": "2026-10-29T08:03:06.14387585Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "929ebd53-4949-4f7b-88a3-9f6786e39e73",
  "session_id": "e536f9c1-0f67-4b4a-a37a-344243934ac2",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/929ebd53-4949-4f7b-88a3-9f6786e39e73/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "8c2251dd-8950-4741-b783-48da9d3f6436",
      "state": "READY",
      "created_at": "2026-10-28T20:02:55.404423Z",
      "ready_at": "2026-10-28T20:03:04.880978Z",
      "expires_at": "2026-11-04T20:03:04.880978Z",
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
  "device_ref": "sandbox-2299"
}
```

```json
{
  "challenge_id": "97b8c819-fea1-46ef-9cf0-4e22411b7ba9",
  "expires_at": "2026-10-28T20:08:06.737028131Z",
  "resend_available_at": "2026-10-28T20:03:07.737028131Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "179494",
  "sent_at": "2026-10-28T20:03:06.738890632Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97b8c819-fea1-46ef-9cf0-4e22411b7ba9",
  "code": "179494",
  "device_ref": "sandbox-2299"
}
```

```json
{
  "session_id": "f4a7f929-027f-493f-959c-8ee64a4f3de2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODY4NiwiaWF0IjoxNzkzMjE3Nzg2LCJqdGkiOiJlNDE3ZTcxMC1hMWM3LTQ4YzUtODA3YS05NTFiNGFkZDEyMzAiLCJzaWQiOiJmNGE3ZjkyOS0wMjdmLTQ5M2YtOTU5Yy04ZWU2NGE0ZjNkZTIifQ.hGWnrmhxsrY1Oa5ol5UKDFgP4dNaOF1oG6uqKKBnRRM",
  "access_expires_at": "2026-10-28T20:18:06.96001568Z",
  "refresh_token": "Ac9Vwc99TPVm0wbhI__-mJpZ6MISwrzUcNOfvIvCBJA",
  "refresh_expires_at": "2026-11-27T20:03:06.959625061Z",
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
  "device_ref": "sandbox-30457"
}
```

```json
{
  "challenge_id": "b4c281db-f6ba-47ec-8e68-ad4448ed32be",
  "expires_at": "2026-10-28T20:08:07.346266376Z",
  "resend_available_at": "2026-10-28T20:03:08.346266376Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "721975",
  "sent_at": "2026-10-28T20:03:07.348192453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4c281db-f6ba-47ec-8e68-ad4448ed32be",
  "code": "721975",
  "device_ref": "sandbox-30457"
}
```

```json
{
  "session_id": "041b790c-893a-46e7-81d6-f798b9e52577",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODY4NywiaWF0IjoxNzkzMjE3Nzg3LCJqdGkiOiI4ZTRmNmE2Ni0yY2JmLTQ3ODUtODM2NS0xZmRmNTYwNzQwZWQiLCJzaWQiOiIwNDFiNzkwYy04OTNhLTQ2ZTctODFkNi1mNzk4YjllNTI1NzcifQ.iC8pidt0r_wZJjVijn6hsSm7WY_P7Ix-uvsI8zHBq-Q",
  "access_expires_at": "2026-10-28T20:18:07.589534666Z",
  "refresh_token": "2-ty0yhtx8aCvK3kN80Ri7aXdLL0d8eu_t0vMa4vv_M",
  "refresh_expires_at": "2026-11-27T20:03:07.588822972Z",
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
  "command_id": "8686447b-cf02-4b88-a5d3-77f1e8b6f216",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:03:07Z",
    "sequence": 1793217787990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4a9d014-3f54-418b-8ec1-6a6f302acd66",
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
  "last_heartbeat_at": "2026-10-28T20:03:08.009497Z",
  "last_location_at": "2026-10-28T20:03:08.009497Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-13872"
}
```

```json
{
  "challenge_id": "2f575a13-2c21-438b-9a70-8663f194313c",
  "expires_at": "2026-10-28T20:08:08.218279674Z",
  "resend_available_at": "2026-10-28T20:03:09.218279674Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "067751",
  "sent_at": "2026-10-28T20:03:08.22047705Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f575a13-2c21-438b-9a70-8663f194313c",
  "code": "067751",
  "device_ref": "sandbox-13872"
}
```

```json
{
  "session_id": "51ac5331-e190-4568-ba86-f6cd47650713",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODY4OCwiaWF0IjoxNzkzMjE3Nzg4LCJqdGkiOiI3MjIxYmE5Ny00MWI0LTRlZmYtOGQ0ZS1hYWNjMWYyMjdiZTMiLCJzaWQiOiI1MWFjNTMzMS1lMTkwLTQ1NjgtYmE4Ni1mNmNkNDc2NTA3MTMifQ.tIxxNVK9i5In-XPFYZSoT9g3xq6TsziTpO4taADZGyE",
  "access_expires_at": "2026-10-28T20:18:08.439594214Z",
  "refresh_token": "9AymMfX50bdAqy7GWtMaphc6nhMF9Ux59q3yjKJHGgY",
  "refresh_expires_at": "2026-11-27T20:03:08.439143323Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f15321c4-e1bd-4119-a996-602b000ab807",
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
  "last_heartbeat_at": "2026-10-28T20:02:06.187522Z",
  "last_location_at": "2026-10-28T20:02:06.187522Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f15321c4-e1bd-4119-a996-602b000ab807/handover` → **200**

```json
{
  "command_id": "90983fbc-5aa8-4aa6-ad91-bcd7a6365a04",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f15321c4-e1bd-4119-a996-602b000ab807",
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
  "last_heartbeat_at": "2026-10-28T20:02:06.187522Z",
  "last_location_at": "2026-10-28T20:02:06.187522Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f15321c4-e1bd-4119-a996-602b000ab807/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:03:09Z",
    "sequence": 1793217789401
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f15321c4-e1bd-4119-a996-602b000ab807",
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
  "last_heartbeat_at": "2026-10-28T20:03:09.058435Z",
  "last_location_at": "2026-10-28T20:03:09.058435Z",
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
  "session_id": "16a82f5c-f4fc-4b14-837f-f2d8ec8b12b9",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2ODksImlhdCI6MTc5MzIxNzc4OSwianRpIjoiMGUwNTdlN2MtZGFlZS00N2Y1LWIyZWYtYWZhMDM4YjkzYjY2Iiwic2lkIjoiMTZhODJmNWMtZjRmYy00YjE0LTgzN2YtZjJkOGVjOGIxMmI5In0.VbdPECw-hMt4JX_DnYNHyWyFE-lsan8YzL2zJDtnxkQ",
  "access_expires_at": "2026-10-28T20:18:09.461580062Z",
  "refresh_token": "d-adZYmgWqN4g1vIfkNBkmfGr-dz135QByMr4N4m-Sg",
  "refresh_expires_at": "2026-10-29T08:03:09.461149913Z",
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
  "session_id": "9a421af1-5518-4032-a6bf-5879b43257f8",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2ODksImlhdCI6MTc5MzIxNzc4OSwianRpIjoiZGZjOWZkOGMtNTI5ZS00NzAwLTg0NDctNGIwZmQxZWY5N2IyIiwic2lkIjoiOWE0MjFhZjEtNTUxOC00MDMyLWE2YmYtNTg3OWI0MzI1N2Y4In0.5fqID1V-wGmvxBFrKwP81Ni92_h8ty4QvzBoR4qrcFM",
  "access_expires_at": "2026-10-28T20:18:09.864501409Z",
  "refresh_token": "k64u7lvMNuveViTAaIt2bXolJFoNj6tpKyqd66ENKwU",
  "refresh_expires_at": "2026-10-29T08:03:09.864145022Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684709300",
  "device_ref": "sandbox-28545"
}
```

```json
{
  "challenge_id": "29ee964c-0b08-4496-8cb5-6d25cd6b1ca1",
  "expires_at": "2026-10-28T20:08:10.065159302Z",
  "resend_available_at": "2026-10-28T20:03:11.065159302Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380684709300` → **200**

```json
{
  "phone": "+380684709300",
  "audience": "CLIENT",
  "code": "208629",
  "sent_at": "2026-10-28T20:03:10.067117548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29ee964c-0b08-4496-8cb5-6d25cd6b1ca1",
  "code": "208629",
  "device_ref": "sandbox-28545"
}
```

```json
{
  "session_id": "76492fa6-0638-485b-8ba8-3254c66ceb0a",
  "subject": {
    "type": "CLIENT",
    "id": "9b6ae403-da0b-45c3-9229-19fc0ad66865"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjZhZTQwMy1kYTBiLTQ1YzMtOTIyOS0xOWZjMGFkNjY4NjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4NjkwLCJpYXQiOjE3OTMyMTc3OTAsImp0aSI6IjE2MWFmYzU2LWZkNWYtNDBhNy04NGMyLWIzZjRkNGNkMDYwMSIsInNpZCI6Ijc2NDkyZmE2LTA2MzgtNDg1Yi04YmE4LTMyNTRjNjZjZWIwYSJ9.Op3fAS5As2QPj1Jvi-FzcNVfbIxlLutPXW2zz0HIlKc",
  "access_expires_at": "2026-10-28T20:18:10.28693002Z",
  "refresh_token": "3ETTK5fyCgFjOCkjM_qPEzHnuYYkKCwTpXCGjOV7muc",
  "refresh_expires_at": "2026-11-27T20:03:10.2865656Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e7b70cd-4718-43cb-82a5-f4c4c6507dff",
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
  "id": "038c0ec8-4ad9-42e4-89df-5827c5462091",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:08:10.491020Z",
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
  "command_id": "88a3cbc9-c657-48c2-a8bf-2900da453fc0",
  "quote_id": "038c0ec8-4ad9-42e4-89df-5827c5462091",
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
  "id": "b98e9448-1ab6-405b-8479-59e848d87391",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9b6ae403-da0b-45c3-9229-19fc0ad66865",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:03:10.708236Z",
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
    "id": "98e7754a-051a-460c-957c-48747fa96492",
    "order_id": "b98e9448-1ab6-405b-8479-59e848d87391",
    "expires_at": "2026-10-28T20:03:25.711559Z",
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

`POST /api/driver/v1/offers/98e7754a-051a-460c-957c-48747fa96492/reject` → **204**

```json
{
  "command_id": "138870f3-8900-44dd-8b01-17988cc7a4cf"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6808cf5b-822c-4162-ac7b-04d5c7d33b1d",
    "order_id": "b98e9448-1ab6-405b-8479-59e848d87391",
    "expires_at": "2026-10-28T20:03:26.137947Z",
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

`POST /api/driver/v1/offers/6808cf5b-822c-4162-ac7b-04d5c7d33b1d/accept` → **200**

```json
{
  "command_id": "cd32447a-3a7b-4af0-bf61-b18aaa9760d8"
}
```

```json
{
  "id": "5d988ecb-e6ef-4a9b-b528-58ac2cdb993b",
  "order_id": "b98e9448-1ab6-405b-8479-59e848d87391",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "66cb1c6a-1215-4a16-834b-56bc8684780b",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/b98e9448-1ab6-405b-8479-59e848d87391/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:03:10.70872Z",
      "actor": {
        "type": "CLIENT",
        "id": "9b6ae403-da0b-45c3-9229-19fc0ad66865",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b98e9448-1ab6-405b-8479-59e848d87391",
        "quote_id": "038c0ec8-4ad9-42e4-89df-5827c5462091",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "19393067-3be3-4d74-aee8-c9aa5d7b2845"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:03:10.710712Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b98e9448-1ab6-405b-8479-59e848d87391",
        "attempt_id": "b023c709-c08c-4a7e-8fe8-fd025c27ae57",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "19393067-3be3-4d74-aee8-c9aa5d7b2845"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:03:10.716205Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "98e7754a-051a-460c-957c-48747fa96492",
        "order_id": "b98e9448-1ab6-405b-8479-59e848d87391",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "19393067-3be3-4d74-aee8-c9aa5d7b2845"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T20:03:11.137053Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "98e7754a-051a-460c-957c-48747fa96492",
        "order_id": "b98e9448-1ab6-405b-8479-59e848d87391"
      },
      "correlation_id": "86393d12-cde3-476e-ac80-5904111b4ea2"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order b98e9448-1ab6-405b-8479-59e848d87391 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/b98e9448-1ab6-405b-8479-59e848d87391` → **200**

```json
{
  "id": "b98e9448-1ab6-405b-8479-59e848d87391",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9b6ae403-da0b-45c3-9229-19fc0ad66865",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5d988ecb-e6ef-4a9b-b528-58ac2cdb993b",
    "order_id": "b98e9448-1ab6-405b-8479-59e848d87391",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "66cb1c6a-1215-4a16-834b-56bc8684780b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T20:03:10.708236Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b98e9448-1ab6-405b-8479-59e848d87391/cancel` → **200**

```json
{
  "command_id": "7024f90e-4a2b-40bc-848d-2c4497fa454a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b98e9448-1ab6-405b-8479-59e848d87391",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9b6ae403-da0b-45c3-9229-19fc0ad66865",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5d988ecb-e6ef-4a9b-b528-58ac2cdb993b",
    "order_id": "b98e9448-1ab6-405b-8479-59e848d87391",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "66cb1c6a-1215-4a16-834b-56bc8684780b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T20:03:10.708236Z",
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
  "session_id": "a4a9d014-3f54-418b-8ec1-6a6f302acd66",
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
  "last_heartbeat_at": "2026-10-28T20:03:08.009497Z",
  "last_location_at": "2026-10-28T20:03:08.009497Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4a9d014-3f54-418b-8ec1-6a6f302acd66/close` → **200**

```json
{
  "command_id": "4b6c7df0-7757-4b2c-9beb-d02ef323bb89",
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
  "session_id": "f15321c4-e1bd-4119-a996-602b000ab807",
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
  "last_heartbeat_at": "2026-10-28T20:03:09.058435Z",
  "last_location_at": "2026-10-28T20:03:09.058435Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f15321c4-e1bd-4119-a996-602b000ab807/close` → **200**

```json
{
  "command_id": "a19febe2-d57a-4d85-8637-63660a93c7b5",
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
  "session_id": "eb1033ab-b483-434c-bd0a-68a133d4707e",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg2OTMsImlhdCI6MTc5MzIxNzc5MywianRpIjoiMzY4Nzk0NjMtNGQ0Ni00NmM4LTgwZDgtZGM0M2JjYzFjZGJmIiwic2lkIjoiZWIxMDMzYWItYjQ4My00MzRjLWJkMGEtNjhhMTMzZDQ3MDdlIn0.LISV60fGjqRiMTO-pQycN4sGN0xp1A29xcwtD_Y3bmI",
  "access_expires_at": "2026-10-28T20:18:13.228974421Z",
  "refresh_token": "nn-8bgSE0XVgVO24fX_65wPuyJUU6YUH1DCHUhh6Xmk",
  "refresh_expires_at": "2026-10-29T08:03:13.228654618Z",
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
  "command_id": "8b1733b9-f8c8-4fa9-8a89-276b293d96c6",
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
  "changed_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T20:03:13.619775Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "0dbbc5dc-6afe-49ce-ab21-7948f6cc1031",
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
  "correlation_id": "e7d2d1e0-b601-4f51-bac5-48aef75d77bb"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "b1f77b40-e690-446e-a122-3d05d1f63d8a",
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
  "correlation_id": "935e6b14-faed-429d-b886-f0b37e055aaa"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631054120",
  "device_ref": "sandbox-19090"
}
```

```json
{
  "challenge_id": "2dee3415-4a86-4a04-a8fa-94be2e795521",
  "expires_at": "2026-10-28T20:08:14.204804172Z",
  "resend_available_at": "2026-10-28T20:03:15.204804172Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631054120` → **200**

```json
{
  "phone": "+380631054120",
  "audience": "CLIENT",
  "code": "795015",
  "sent_at": "2026-10-28T20:03:14.2066384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2dee3415-4a86-4a04-a8fa-94be2e795521",
  "code": "795015",
  "device_ref": "sandbox-19090"
}
```

```json
{
  "session_id": "7f08ea5b-ea50-4f97-81a1-b370a8b0df08",
  "subject": {
    "type": "CLIENT",
    "id": "9f6b4ce0-8fff-4a7e-ad93-9ab14b398024"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjZiNGNlMC04ZmZmLTRhN2UtYWQ5My05YWIxNGIzOTgwMjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4Njk0LCJpYXQiOjE3OTMyMTc3OTQsImp0aSI6IjZkMTM0NDMwLTRmYjMtNGJkYi1hMjhmLTM0M2ZiZDU5NGNmNCIsInNpZCI6IjdmMDhlYTViLWVhNTAtNGY5Ny04MWExLWIzNzBhOGIwZGYwOCJ9._xiTY1TMIKpmDqNJQuZR6bV5VoF241wHUe434m5RD4k",
  "access_expires_at": "2026-10-28T20:18:14.429246564Z",
  "refresh_token": "pZVB7LPy_4vCGHHogLF9Hi37qUMHmSy3a8LuadHhWJY",
  "refresh_expires_at": "2026-11-27T20:03:14.428736599Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bde73776-57e2-4eb3-ad28-60ca1522a3c5",
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
  "id": "77537f51-9544-4c44-858f-9e9d3a39888d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:08:14.629684Z",
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
  "command_id": "62baeb80-7bbd-496b-8802-670db806affd",
  "quote_id": "77537f51-9544-4c44-858f-9e9d3a39888d",
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
  "correlation_id": "5a9d3dbc-54e3-4fba-952a-7f7a0730d9db"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "27526e35-7cc8-47f4-8645-8b3e0dd9be89",
  "quote_id": "77537f51-9544-4c44-858f-9e9d3a39888d",
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
  "id": "f0ab37c0-4046-44af-ac7e-f48b96adb285",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9f6b4ce0-8fff-4a7e-ad93-9ab14b398024",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:03:15.052972Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f0ab37c0-4046-44af-ac7e-f48b96adb285/cancel` → **200**

```json
{
  "command_id": "4edc1433-5ee8-48e8-868c-1a81ab1916d7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f0ab37c0-4046-44af-ac7e-f48b96adb285",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9f6b4ce0-8fff-4a7e-ad93-9ab14b398024",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:03:15.052972Z",
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
  "command_id": "a2520ae9-e607-42e1-bbbd-5b4f7ffb15a2",
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
  "changed_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T20:03:15.504953Z"
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
      "changed_by": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T20:03:15.504953Z"
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
  "device_ref": "sandbox-20230"
}
```

```json
{
  "challenge_id": "6cb1d40f-687c-4906-a70a-4c140427f277",
  "expires_at": "2026-10-28T20:08:16.129434Z",
  "resend_available_at": "2026-10-28T20:03:17.129434Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "189676",
  "sent_at": "2026-10-28T20:03:16.131162558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cb1d40f-687c-4906-a70a-4c140427f277",
  "code": "189676",
  "device_ref": "sandbox-20230"
}
```

```json
{
  "session_id": "f6f04c92-0f98-4b2b-b925-eb59da301ec9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxODY5NiwiaWF0IjoxNzkzMjE3Nzk2LCJqdGkiOiI4YzUzODA5Ni04ODJjLTQxYWMtOWEyZi0wOGNlYTdiODI3OWMiLCJzaWQiOiJmNmYwNGM5Mi0wZjk4LTRiMmItYjkyNS1lYjU5ZGEzMDFlYzkifQ.uCWS0CE1m1JJu1YiDlXTu3EDLSR7m-QOMhv3KeseJac",
  "access_expires_at": "2026-10-28T20:18:16.350996861Z",
  "refresh_token": "86i5dF5-3BEizbJtLzRQxeO78S54xl3-byG74LE_Q4o",
  "refresh_expires_at": "2026-11-27T20:03:16.350551865Z",
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
  "command_id": "9ba066b9-2889-4bb6-9525-5b34100cb23a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:03:16Z",
    "sequence": 1793217796737
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccf532c-9d04-49e1-93a9-b70eda028e40",
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
  "last_heartbeat_at": "2026-10-28T20:03:16.755362Z",
  "last_location_at": "2026-10-28T20:03:16.755362Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670467901",
  "device_ref": "sandbox-22327"
}
```

```json
{
  "challenge_id": "85657232-6b71-4b33-a709-6ba0daaf098d",
  "expires_at": "2026-10-28T20:08:16.957586518Z",
  "resend_available_at": "2026-10-28T20:03:17.957586518Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670467901` → **200**

```json
{
  "phone": "+380670467901",
  "audience": "CLIENT",
  "code": "119154",
  "sent_at": "2026-10-28T20:03:16.959453986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85657232-6b71-4b33-a709-6ba0daaf098d",
  "code": "119154",
  "device_ref": "sandbox-22327"
}
```

```json
{
  "session_id": "ff7967c7-1b46-4387-9176-41da6a745eac",
  "subject": {
    "type": "CLIENT",
    "id": "bfb8d4a5-1b3c-4c98-9d77-b086b325ff93"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZmI4ZDRhNS0xYjNjLTRjOTgtOWQ3Ny1iMDg2YjMyNWZmOTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE4Njk3LCJpYXQiOjE3OTMyMTc3OTcsImp0aSI6ImNjNTgwZjE3LTUyN2MtNDRmYi05NWE0LTE0YTA5MDBiNDE5MiIsInNpZCI6ImZmNzk2N2M3LTFiNDYtNDM4Ny05MTc2LTQxZGE2YTc0NWVhYyJ9.vGgNS59St8smpQ1qVYqv1hIFe70vw31pDK0THUtTUbE",
  "access_expires_at": "2026-10-28T20:18:17.17392092Z",
  "refresh_token": "oZB-9KbgXu4kstpOmkESaAGqGu68KzxumnS9sioR0ws",
  "refresh_expires_at": "2026-11-27T20:03:17.173507796Z",
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
  "command_id": "c2ba1c0a-b648-41e8-91fe-afca6dc6a02b",
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
  "id": "95004477-097c-4eff-8f7a-53f438cfbae0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:08:17.559154Z",
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
  "command_id": "b3edc367-cd48-4c53-bf94-44555d02b8d3",
  "platform": "ANDROID",
  "token": "sandbox-driver-539a7c18-7ffe-4682-bafb-b137ef1add72"
}
```

```json
{
  "id": "52ecfe5f-acaa-4c49-9808-cec80737d23e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T20:03:17.774071Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "5b641f3e-3f2e-479f-a062-460e32e17a7d",
  "platform": "ANDROID",
  "token": "sandbox-rider-b81e19dc-9bde-4972-95fb-39eedd6e88eb"
}
```

```json
{
  "id": "fd6dda67-8f23-4658-9b27-614359ef7bc3",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T20:03:17.970489Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3b1fbec9-5529-462e-9055-d86d0ee0d2e5",
  "quote_id": "95004477-097c-4eff-8f7a-53f438cfbae0",
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
  "id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bfb8d4a5-1b3c-4c98-9d77-b086b325ff93",
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
  "created_at": "2026-10-28T20:03:18.175783Z",
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
    "id": "ec34427a-5559-43f7-9ebf-ed2ba45321c7",
    "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
    "expires_at": "2026-10-28T20:03:33.178121Z",
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

`POST /api/driver/v1/offers/ec34427a-5559-43f7-9ebf-ed2ba45321c7/accept` → **200**

```json
{
  "command_id": "085f0b65-c05a-4bb7-9818-ebd2c44fca94"
}
```

```json
{
  "id": "8553776f-35a2-432c-afaa-3feb5f6e0320",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "041d80e8-657d-4e8d-b7a4-b288fba2b8f6",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T20:03:18.152Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T20:03:18.152Z` → **200**

```json
[
  {
    "at": "2026-10-28T20:03:19.193896175Z",
    "token_suffix": "1add72",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "f08ffde8-0e78-4cdc-9376-9d459b14cac5",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670467901&after=2026-10-28T20:03:18.152Z` → **200**

```json
[
  {
    "at": "2026-10-28T20:03:19.195945688Z",
    "token_suffix": "6e88eb",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "528dfd36-10de-4346-9c79-cd1cecc79e71",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/2794766e-4b3a-43e8-a003-c78e090db991/messages` → **201**

```json
{
  "command_id": "accad337-0e00-41a2-a74c-82fd23947cb7",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "436371e4-ea1f-45e2-86c7-dca48679a7d7",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T20:03:19.858135382Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "041d80e8-657d-4e8d-b7a4-b288fba2b8f6",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "assignment_id": "8553776f-35a2-432c-afaa-3feb5f6e0320",
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

`POST /api/driver/v1/trips/041d80e8-657d-4e8d-b7a4-b288fba2b8f6/messages` → **201**

```json
{
  "command_id": "861c2e54-af85-498b-9a41-da90da68ffa7",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "0f50d915-4a96-46e1-b0a4-4790c7a469ea",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T20:03:20.224068317Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/2794766e-4b3a-43e8-a003-c78e090db991/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/041d80e8-657d-4e8d-b7a4-b288fba2b8f6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670467901"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/eccf532c-9d04-49e1-93a9-b70eda028e40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:03:20Z",
    "sequence": 1793217800780
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccf532c-9d04-49e1-93a9-b70eda028e40",
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
  "last_heartbeat_at": "2026-10-28T20:03:20.796602Z",
  "last_location_at": "2026-10-28T20:03:20.796602Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "041d80e8-657d-4e8d-b7a4-b288fba2b8f6",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "assignment_id": "8553776f-35a2-432c-afaa-3feb5f6e0320",
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

`POST /api/driver/v1/trips/041d80e8-657d-4e8d-b7a4-b288fba2b8f6/arrive` → **200**

```json
{
  "command_id": "692117b0-fc67-4f70-9331-a6730c9c8652",
  "expected_version": 0
}
```

```json
{
  "id": "041d80e8-657d-4e8d-b7a4-b288fba2b8f6",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "assignment_id": "8553776f-35a2-432c-afaa-3feb5f6e0320",
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
  "arrived_at": "2026-10-28T20:03:21.17342Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/041d80e8-657d-4e8d-b7a4-b288fba2b8f6/start` → **200**

```json
{
  "command_id": "e926a6ba-8a64-4b19-886c-b7d898ad7af7",
  "expected_version": 1
}
```

```json
{
  "id": "041d80e8-657d-4e8d-b7a4-b288fba2b8f6",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "assignment_id": "8553776f-35a2-432c-afaa-3feb5f6e0320",
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
  "arrived_at": "2026-10-28T20:03:21.17342Z",
  "started_at": "2026-10-28T20:03:21.35793Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/eccf532c-9d04-49e1-93a9-b70eda028e40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:03:21Z",
    "sequence": 1793217801546
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "eccf532c-9d04-49e1-93a9-b70eda028e40",
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
  "last_heartbeat_at": "2026-10-28T20:03:21.564041Z",
  "last_location_at": "2026-10-28T20:03:21.564041Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/041d80e8-657d-4e8d-b7a4-b288fba2b8f6/complete` → **200**

```json
{
  "command_id": "2a66f98a-5354-4f4e-b421-45dab7bc1f97",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:03:21Z",
  "cash_received": true
}
```

```json
{
  "id": "041d80e8-657d-4e8d-b7a4-b288fba2b8f6",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "assignment_id": "8553776f-35a2-432c-afaa-3feb5f6e0320",
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
  "arrived_at": "2026-10-28T20:03:21.17342Z",
  "started_at": "2026-10-28T20:03:21.35793Z",
  "completed_at": "2026-10-28T20:03:21.763863Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/2794766e-4b3a-43e8-a003-c78e090db991` → **200**

```json
{
  "id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bfb8d4a5-1b3c-4c98-9d77-b086b325ff93",
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
    "id": "8553776f-35a2-432c-afaa-3feb5f6e0320",
    "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "041d80e8-657d-4e8d-b7a4-b288fba2b8f6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:03:18.175783Z",
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
    "id": "2794766e-4b3a-43e8-a003-c78e090db991",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T20:03:18.175783Z",
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
    "id": "041d80e8-657d-4e8d-b7a4-b288fba2b8f6",
    "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
    "order_short_number": 10,
    "created_at": "2026-10-28T20:03:18.578796Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0b61ebd9-f5a8-4d77-b476-5138fbbd4488",
    "order_id": "806e67be-b412-4201-9140-c5f72678cc3d",
    "order_short_number": 2,
    "created_at": "2026-10-28T20:01:57.843376Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "79d3f988-f0af-4096-806f-f1f3c2d7938b",
    "order_id": "e65fd56f-eca4-405f-b749-b6d658d6f70e",
    "order_short_number": 1,
    "created_at": "2026-10-28T20:01:45.814202Z",
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

`GET /api/rider/v1/orders/2794766e-4b3a-43e8-a003-c78e090db991/tip` → **200**

```json
{
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
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
  "available_until": "2026-10-29T20:03:21.763863Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2794766e-4b3a-43e8-a003-c78e090db991/tip` → **201**

```json
{
  "command_id": "1ea3d622-d457-495b-b273-72b7a98e67f8",
  "amount_minor": 1100
}
```

```json
{
  "id": "a76c42dd-6507-4f1f-9494-48c324704bf9",
  "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T20:03:26.168028Z"
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
  "session_id": "6ffad93c-d14e-4f5c-a2c7-2008d4efd490",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg3MDYsImlhdCI6MTc5MzIxNzgwNiwianRpIjoiMDQ1YzAyMmEtZGRjYi00N2I1LTlhNDMtMzcxMzU2OGI1ZTY0Iiwic2lkIjoiNmZmYWQ5M2MtZDE0ZS00ZjVjLWEyYzctMjAwOGQ0ZWZkNDkwIn0.QmmUSQCQDCTBSzG2pX2cr66sxst9P4fi2du0m7-ZuQ0",
  "access_expires_at": "2026-10-28T20:18:26.55885137Z",
  "refresh_token": "k9O9bj3r3pik4ZsHq-Xc5jbLmi_lGNisNMByzKToSn4",
  "refresh_expires_at": "2026-10-29T08:03:26.558436644Z",
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
  "generated_at": "2026-10-28T20:03:26.747508646Z"
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
  "generated_at": "2026-10-28T20:03:26.955945093Z"
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
  "session_id": "512772d6-fb47-4185-938b-1494b92446c9",
  "subject": {
    "type": "STAFF",
    "id": "4f8f0e82-dfc7-4c9b-a166-18da86aff9f2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjhmMGU4Mi1kZmM3LTRjOWItYTE2Ni0xOGRhODZhZmY5ZjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTg3MDcsImlhdCI6MTc5MzIxNzgwNywianRpIjoiZDEyNTEyZDUtNjBkMy00ODk2LTllNzYtZTMyM2Q0ODUwODljIiwic2lkIjoiNTEyNzcyZDYtZmI0Ny00MTg1LTkzOGItMTQ5NGI5MjQ0NmM5In0.Yp7yJnWRcd7QgfETnctf1PHi2NpBiOVX5skXQMOKcVs",
  "access_expires_at": "2026-10-28T20:18:27.362157569Z",
  "refresh_token": "XHSTCOS_aVnHbs2Bs36gmm4OeKetAWOAxc1Prn7L6G4",
  "refresh_expires_at": "2026-10-29T08:03:27.361718366Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2794766e-4b3a-43e8-a003-c78e090db991/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:03:18.176172Z",
      "actor": {
        "type": "CLIENT",
        "id": "bfb8d4a5-1b3c-4c98-9d77-b086b325ff93",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
        "quote_id": "95004477-097c-4eff-8f7a-53f438cfbae0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "97a7e889-67df-476a-9426-f404fc5b5036"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:03:18.177618Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
        "attempt_id": "03ddde17-9c7f-42f9-b6ea-b1b85fbf8e79",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "97a7e889-67df-476a-9426-f404fc5b5036"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:03:18.1795Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ec34427a-5559-43f7-9ebf-ed2ba45321c7",
        "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "97a7e889-67df-476a-9426-f404fc5b5036"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T20:03:18.579798Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ec34427a-5559-43f7-9ebf-ed2ba45321c7",
        "order_id": "2794766e-4b3a-43e8-a003-c78e090db991",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8553776f-35a2-432c-afaa-3feb5f6e0320"
      },
      "correlation_id": "09aa145c-3fce-4546-be71-cf437e8e47b6"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T20:03:27.758493618Z",
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
      "last_location_at": "2026-10-28T20:03:21.564041Z",
      "order_id": null
    }
  ]
}
```

Done: order 2794766e-4b3a-43e8-a003-c78e090db991.
