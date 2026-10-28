# Sandbox transcript (2026-10-28T09:59:11Z, c2f1b7e)

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
  "correlation_id": "8f08ba56-a19c-47c7-be71-bc20a5a61dd1"
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
  "session_id": "be63a07c-0ec1-4654-b3fa-1dba5852940d",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI0NTcsImlhdCI6MTc5MzE4MTU1NywianRpIjoiMzI1MTU4M2MtNWJjOC00ZDVkLTk5NTItOGFkNWVmNDQwM2JlIiwic2lkIjoiYmU2M2EwN2MtMGVjMS00NjU0LWIzZmEtMWRiYTU4NTI5NDBkIn0.7L7FrmsfMlbfqqbYG_vHquGVrcEJulFj0JxhJvfCEF0",
  "access_expires_at": "2026-10-28T10:14:17.006772898Z",
  "refresh_token": "seUuExD-kM3UVIsOZaXTEMTnA7EFcvc9xiDt0UNegzM",
  "refresh_expires_at": "2026-10-28T21:59:17.0050533Z",
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
  "session_id": "294f60b9-41e0-42ab-b3fd-4c7988f17434",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI0NTgsImlhdCI6MTc5MzE4MTU1OCwianRpIjoiNmU5YzBkYzYtNjdhNy00YjY0LWEwYTYtZDJlOTcwMzMxZTc1Iiwic2lkIjoiMjk0ZjYwYjktNDFlMC00MmFiLWIzZmQtNGM3OTg4ZjE3NDM0In0.yB1VHCJgjoy5J3o9MjdiNGl24slfKhRM5XYpQnNfkqM",
  "access_expires_at": "2026-10-28T10:14:18.063373454Z",
  "refresh_token": "5ThZgtJH78QhJYobRlZovxdJr515eYygSz2aEgEuOco",
  "refresh_expires_at": "2026-10-28T21:59:18.062543049Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "ed48d779-c0b9-48a0-ae2a-67c60ee363a7",
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
  "id": "bbded375-938b-405c-89a8-ffeb3c4edbd7",
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
  "created_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "created_at": "2026-10-28T09:59:18.243371Z",
  "updated_at": "2026-10-28T09:59:18.243371Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634029008",
  "device_ref": "sandbox-4844"
}
```

```json
{
  "challenge_id": "fdb9f4b4-7f3f-42c9-8225-bc656cd334cd",
  "expires_at": "2026-10-28T10:04:18.433260191Z",
  "resend_available_at": "2026-10-28T09:59:19.433260191Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634029008` → **200**

```json
{
  "phone": "+380634029008",
  "audience": "CLIENT",
  "code": "360528",
  "sent_at": "2026-10-28T09:59:18.439729401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdb9f4b4-7f3f-42c9-8225-bc656cd334cd",
  "code": "360528",
  "device_ref": "sandbox-4844"
}
```

```json
{
  "session_id": "d081a9fc-03ee-4169-b6e0-bf7d92a51f57",
  "subject": {
    "type": "CLIENT",
    "id": "251e4885-5e65-418d-b244-c7e69ce4afa1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTFlNDg4NS01ZTY1LTQxOGQtYjI0NC1jN2U2OWNlNGFmYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNDU4LCJpYXQiOjE3OTMxODE1NTgsImp0aSI6IjRmYzI5ZTMzLTNhOTQtNDViMi1hNzY3LTlmOTY2ODU5MWE0OCIsInNpZCI6ImQwODFhOWZjLTAzZWUtNDE2OS1iNmUwLWJmN2Q5MmE1MWY1NyJ9.CrNKT6m8Bz1ezRmmQ17iv0MUXG9xmoXRHUmP9cmoRwk",
  "access_expires_at": "2026-10-28T10:14:18.631934292Z",
  "refresh_token": "q9cOTsq-fU3FCJ_WkS8BZIs2TsZya01qMF1RfIU1yoU",
  "refresh_expires_at": "2026-11-27T09:59:18.631112766Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634029008` → **200**

```json
{
  "client_id": "251e4885-5e65-418d-b244-c7e69ce4afa1"
}
```

`POST /api/admin/v1/rider-wallets/251e4885-5e65-418d-b244-c7e69ce4afa1/top-ups` → **201**

```json
{
  "command_id": "ae59d853-1475-4c9c-b914-27f908c6de55",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "251e4885-5e65-418d-b244-c7e69ce4afa1",
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
      "id": "42840a7e-c140-4713-a1ee-283da48552e8",
      "at": "2026-10-28T09:59:18.949358Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a1be69d1-52c8-4d87-ae97-a63ba94c0be6",
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
  "id": "2d85296a-eaf6-4d44-bcff-f85c1dbeab96",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:04:19.249782Z",
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
      "id": "bbded375-938b-405c-89a8-ffeb3c4edbd7",
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
  "device_ref": "sandbox-15118"
}
```

```json
{
  "challenge_id": "c4bda0ba-4ae8-49a8-a358-d4db85415c4d",
  "expires_at": "2026-10-28T10:04:19.437978807Z",
  "resend_available_at": "2026-10-28T09:59:20.437978807Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "453628",
  "sent_at": "2026-10-28T09:59:19.440854129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4bda0ba-4ae8-49a8-a358-d4db85415c4d",
  "code": "453628",
  "device_ref": "sandbox-15118"
}
```

```json
{
  "session_id": "5092e1b1-afea-42d2-a8a8-f6b69704bc69",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjQ1OSwiaWF0IjoxNzkzMTgxNTU5LCJqdGkiOiIwNWI1NTc3OS01MGZkLTQzZGQtYTE0Mi1kZjRiZTQwNWMwMTkiLCJzaWQiOiI1MDkyZTFiMS1hZmVhLTQyZDItYThhOC1mNmI2OTcwNGJjNjkifQ._7g6W1PaWG5Z-1nV2XiuynddadsRxtgoHHXYGzPhVo4",
  "access_expires_at": "2026-10-28T10:14:19.614150861Z",
  "refresh_token": "C86bRAAC1ZMGFxn3pd-CCLOiZfjvAMuKXeobOsmr3QM",
  "refresh_expires_at": "2026-11-27T09:59:19.613246004Z",
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
  "command_id": "a0e5161f-5a5f-400f-96ff-bbb0d83f8a30",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:59:19Z",
    "sequence": 1793181559922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1214ac1a-49b3-49da-8efd-974e57a8cb0c",
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
  "last_heartbeat_at": "2026-10-28T09:59:19.959783Z",
  "last_location_at": "2026-10-28T09:59:19.959783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "aac009f2-8417-4e42-a4c7-d61b8f5986eb",
  "quote_id": "2d85296a-eaf6-4d44-bcff-f85c1dbeab96",
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
  "id": "730d2dad-f841-45d1-9b71-839959a90027",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "251e4885-5e65-418d-b244-c7e69ce4afa1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T09:59:20.153893Z",
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
  "client_id": "251e4885-5e65-418d-b244-c7e69ce4afa1",
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
      "id": "42840a7e-c140-4713-a1ee-283da48552e8",
      "at": "2026-10-28T09:59:18.949358Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
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
    "id": "f10fc823-51ce-4bbf-b6b4-05217aff1585",
    "order_id": "730d2dad-f841-45d1-9b71-839959a90027",
    "expires_at": "2026-10-28T09:59:35.165007Z",
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

`POST /api/driver/v1/offers/f10fc823-51ce-4bbf-b6b4-05217aff1585/accept` → **200**

```json
{
  "command_id": "0594e037-2db8-47d0-8134-424a249cf184"
}
```

```json
{
  "id": "84f0963d-70c3-4f28-86cb-f0bc568cf564",
  "order_id": "730d2dad-f841-45d1-9b71-839959a90027",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c822fbe6-0cbf-4da3-97f1-7a669d3b6088",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c822fbe6-0cbf-4da3-97f1-7a669d3b6088",
  "order_id": "730d2dad-f841-45d1-9b71-839959a90027",
  "assignment_id": "84f0963d-70c3-4f28-86cb-f0bc568cf564",
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

`POST /api/driver/v1/work-sessions/1214ac1a-49b3-49da-8efd-974e57a8cb0c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:59:20Z",
    "sequence": 1793181560947
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1214ac1a-49b3-49da-8efd-974e57a8cb0c",
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
  "last_heartbeat_at": "2026-10-28T09:59:20.968852Z",
  "last_location_at": "2026-10-28T09:59:20.968852Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c822fbe6-0cbf-4da3-97f1-7a669d3b6088/arrive` → **200**

```json
{
  "command_id": "3c703e3b-6446-499c-a2b7-093d7728edad",
  "expected_version": 0
}
```

```json
{
  "id": "c822fbe6-0cbf-4da3-97f1-7a669d3b6088",
  "order_id": "730d2dad-f841-45d1-9b71-839959a90027",
  "assignment_id": "84f0963d-70c3-4f28-86cb-f0bc568cf564",
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
  "arrived_at": "2026-10-28T09:59:21.135172Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c822fbe6-0cbf-4da3-97f1-7a669d3b6088/start` → **200**

```json
{
  "command_id": "fc27971e-9556-4e47-8bc3-255cf8443a45",
  "expected_version": 1
}
```

```json
{
  "id": "c822fbe6-0cbf-4da3-97f1-7a669d3b6088",
  "order_id": "730d2dad-f841-45d1-9b71-839959a90027",
  "assignment_id": "84f0963d-70c3-4f28-86cb-f0bc568cf564",
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
  "arrived_at": "2026-10-28T09:59:21.135172Z",
  "started_at": "2026-10-28T09:59:21.299919Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/c822fbe6-0cbf-4da3-97f1-7a669d3b6088/complete` → **200**

```json
{
  "command_id": "da131192-b1e2-4c19-8b7d-6cd3f82806c3",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:59:21Z",
  "cash_received": true
}
```

```json
{
  "id": "c822fbe6-0cbf-4da3-97f1-7a669d3b6088",
  "order_id": "730d2dad-f841-45d1-9b71-839959a90027",
  "assignment_id": "84f0963d-70c3-4f28-86cb-f0bc568cf564",
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
  "arrived_at": "2026-10-28T09:59:21.135172Z",
  "started_at": "2026-10-28T09:59:21.299919Z",
  "completed_at": "2026-10-28T09:59:21.491243Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "251e4885-5e65-418d-b244-c7e69ce4afa1",
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
      "id": "82bf6385-7fcf-4523-b9f2-e6dafd78edc6",
      "at": "2026-10-28T09:59:22.534209Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "730d2dad-f841-45d1-9b71-839959a90027"
    },
    {
      "id": "42840a7e-c140-4713-a1ee-283da48552e8",
      "at": "2026-10-28T09:59:18.949358Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/bbded375-938b-405c-89a8-ffeb3c4edbd7/archive` → **200**

```json
{
  "command_id": "b3b22234-23bf-4d21-a629-e91fa5b1e706",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "bbded375-938b-405c-89a8-ffeb3c4edbd7",
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
  "created_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "created_at": "2026-10-28T09:59:18.243371Z",
  "updated_at": "2026-10-28T09:59:24.832454Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1214ac1a-49b3-49da-8efd-974e57a8cb0c",
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
  "last_heartbeat_at": "2026-10-28T09:59:20.968852Z",
  "last_location_at": "2026-10-28T09:59:20.968852Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1214ac1a-49b3-49da-8efd-974e57a8cb0c/close` → **200**

```json
{
  "command_id": "67be1c70-ba94-4378-8eed-38ddb7964d61",
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

Done: order 730d2dad-f841-45d1-9b71-839959a90027.

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
  "session_id": "e9f34e87-e1fa-4e79-9cce-ec9b46a5de65",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI0NjUsImlhdCI6MTc5MzE4MTU2NSwianRpIjoiMjFhOWRkMGYtZjdjYi00ZTg3LThmMDUtMjAyOWM0ZTQxNzgwIiwic2lkIjoiZTlmMzRlODctZTFmYS00ZTc5LTljY2UtZWM5YjQ2YTVkZTY1In0.-W_lgyi5Stn1eiQRZAz2XyCzRbo6V-2EzT_02Nntteg",
  "access_expires_at": "2026-10-28T10:14:25.532374732Z",
  "refresh_token": "MHRbAgsE78dADB0L0eHH3zWobmnoPtLm5fCXSRTm98k",
  "refresh_expires_at": "2026-10-28T21:59:25.531763822Z",
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
  "command_id": "72a45a56-8f66-4377-bbbc-9cdf9062f865",
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
  "session_id": "65ad0d4d-3251-4786-b404-88a595203144",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI0NjYsImlhdCI6MTc5MzE4MTU2NiwianRpIjoiYTIwZGFhZjUtMWIyYy00OTM4LTliNWQtN2Y1ZmU0NzQ1MzIwIiwic2lkIjoiNjVhZDBkNGQtMzI1MS00Nzg2LWI0MDQtODhhNTk1MjAzMTQ0In0.M8uHtI8x_UOvmu3y1GID9JblST_GQfhYiAKgi6WNjRU",
  "access_expires_at": "2026-10-28T10:14:26.222491147Z",
  "refresh_token": "7jMFur1syOlV8nrp7aUSPav9UPKfHQ0QP9e80m6idjI",
  "refresh_expires_at": "2026-10-28T21:59:26.221795064Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3225910187",
    "linkedid": "1730052700.3225910187",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670123939"
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
    "id": "1730052700.3225910187",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "579bdd2a-d6f5-469a-9fd8-3f6fcf5b8390",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670123939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:59:26.371305Z",
      "answered_at": null,
      "ended_at": "2026-10-28T09:59:26.393324Z",
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
    "id": "1730052600.263416523",
    "linkedid": "1730052600.263416523",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670123939"
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
      "id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670123939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:59:26.581784Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/9c43fbda-4725-4a2d-bc43-d2e346e8d471/answer` → **200**

```json
{
  "command_id": "e142e52e-2b67-4557-a492-584d1fbe75e0"
}
```

```json
{
  "id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670123939",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "order_ids": [],
  "started_at": "2026-10-28T09:59:26.581784Z",
  "answered_at": "2026-10-28T09:59:26.775425Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.263416523",
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
    "id": "1730052600.263416523",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670123939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [],
      "started_at": "2026-10-28T09:59:26.581784Z",
      "answered_at": "2026-10-28T09:59:26.775425Z",
      "ended_at": "2026-10-28T09:59:26.952312Z",
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
      "id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670123939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [],
      "started_at": "2026-10-28T09:59:26.581784Z",
      "answered_at": "2026-10-28T09:59:26.775425Z",
      "ended_at": "2026-10-28T09:59:26.952312Z",
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
      "id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670123939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [],
      "started_at": "2026-10-28T09:59:26.581784Z",
      "answered_at": "2026-10-28T09:59:26.775425Z",
      "ended_at": "2026-10-28T09:59:26.952312Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:59:30.352103Z"
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
      "id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670123939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [],
      "started_at": "2026-10-28T09:59:26.581784Z",
      "answered_at": "2026-10-28T09:59:26.775425Z",
      "ended_at": "2026-10-28T09:59:26.952312Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:59:30.352103Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/9c43fbda-4725-4a2d-bc43-d2e346e8d471/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/9c43fbda-4725-4a2d-bc43-d2e346e8d471/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=9c43fbda-4725-4a2d-bc43-d2e346e8d471` → **200**

```json
{
  "changes": [
    {
      "id": "3b49cb1a-cd81-4104-9103-b9755643035a",
      "occurred_at": "2026-10-28T09:59:31.690953Z",
      "actor_type": "STAFF",
      "actor_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"758fb68b-7eb1-4755-8d21-dcd03b6bb09c\", \"order_ids\": []}",
      "correlation_id": "422c8e0c-c382-4e0a-90dc-858a40b1d2ad"
    },
    {
      "id": "a63f0fa9-b855-4cbf-ad1d-893111d3bdb8",
      "occurred_at": "2026-10-28T09:59:31.661692Z",
      "actor_type": "STAFF",
      "actor_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"758fb68b-7eb1-4755-8d21-dcd03b6bb09c\", \"order_ids\": []}",
      "correlation_id": "1f94ea92-973c-43a1-a95a-6ec8d881b466"
    }
  ]
}
```

Done: call 9c43fbda-4725-4a2d-bc43-d2e346e8d471 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630047787",
  "device_ref": "sandbox-9311"
}
```

```json
{
  "challenge_id": "5e73971a-3c20-4da8-99a7-5c61a6f47ba4",
  "expires_at": "2026-10-28T10:04:31.883241644Z",
  "resend_available_at": "2026-10-28T09:59:32.883241644Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630047787` → **200**

```json
{
  "phone": "+380630047787",
  "audience": "CLIENT",
  "code": "682815",
  "sent_at": "2026-10-28T09:59:31.886170467Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e73971a-3c20-4da8-99a7-5c61a6f47ba4",
  "code": "682815",
  "device_ref": "sandbox-9311"
}
```

```json
{
  "session_id": "9c829aff-e55a-4454-9bf9-4357f71a7e10",
  "subject": {
    "type": "CLIENT",
    "id": "86626860-03da-4bfa-b360-4782e03b730b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjYyNjg2MC0wM2RhLTRiZmEtYjM2MC00NzgyZTAzYjczMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNDcyLCJpYXQiOjE3OTMxODE1NzIsImp0aSI6IjNjZDQ5YWI1LWZhNTktNDk5MS04YWQ2LWJmNTEyMDI3ZTM4MiIsInNpZCI6IjljODI5YWZmLWU1NWEtNDQ1NC05YmY5LTQzNTdmNzFhN2UxMCJ9.CV2Epgxkxk-yUp1qCDKzOh7QFnradE3T9ORbHj3_4Xo",
  "access_expires_at": "2026-10-28T10:14:32.053777554Z",
  "refresh_token": "sEKmHQB2bqa0jBjFNQs0AL74ScATbV78CS093ZOYDRU",
  "refresh_expires_at": "2026-11-27T09:59:32.053325564Z",
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
  "device_ref": "sandbox-19744"
}
```

```json
{
  "challenge_id": "02cd064f-e7d0-4da9-b109-7bc6aa4b8faf",
  "expires_at": "2026-10-28T10:04:32.351149934Z",
  "resend_available_at": "2026-10-28T09:59:33.351149934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "137195",
  "sent_at": "2026-10-28T09:59:32.353715671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02cd064f-e7d0-4da9-b109-7bc6aa4b8faf",
  "code": "137195",
  "device_ref": "sandbox-19744"
}
```

```json
{
  "session_id": "994a627a-f9e3-48ad-90e4-e8f247293401",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjQ3MiwiaWF0IjoxNzkzMTgxNTcyLCJqdGkiOiJiZWQ0YzY2YS1jZTMyLTQyNTUtYWUzNi01MmQyMWNmZjhiMzQiLCJzaWQiOiI5OTRhNjI3YS1mOWUzLTQ4YWQtOTBlNC1lOGYyNDcyOTM0MDEifQ.1ZhBM0GHhpT2bh0oBDN9IqBQBi4BNwdZnsII2itf_0c",
  "access_expires_at": "2026-10-28T10:14:32.525353671Z",
  "refresh_token": "47sxG5es1-Ty9-asJv3FoIpaCz0xTRtODJHM_tY8yMk",
  "refresh_expires_at": "2026-11-27T09:59:32.524798726Z",
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
  "session_id": "f673f4fc-2c71-4af9-823f-fb3957a6105a",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI0NzMsImlhdCI6MTc5MzE4MTU3MywianRpIjoiMWM1MTMzYWMtYmU3ZS00Nzg4LWI4MzYtN2I5MGQ3YjAwNDFiIiwic2lkIjoiZjY3M2Y0ZmMtMmM3MS00YWY5LTgyM2YtZmIzOTU3YTYxMDVhIn0.zlWMoxut3Mes5WKGeSyAODBE78GIARgjDjMLdSSTdgQ",
  "access_expires_at": "2026-10-28T10:14:33.026572749Z",
  "refresh_token": "4dtHwAGNxeqlt_fQAyLhaPCxonuI_MA59rb9KGEivk8",
  "refresh_expires_at": "2026-10-28T21:59:33.025934203Z",
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
  "session_id": "617a5e57-f7f6-48f7-8d22-24930fafa562",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI0NzMsImlhdCI6MTc5MzE4MTU3MywianRpIjoiZjUwNDEyYzEtY2NiYi00MTlhLTllYTktNjE5NDhmYjRlYmI4Iiwic2lkIjoiNjE3YTVlNTctZjdmNi00OGY3LThkMjItMjQ5MzBmYWZhNTYyIn0.St-svHJrEJlvAqQbUrsqHAGbKnY4h4mug4EoaA5DbOM",
  "access_expires_at": "2026-10-28T10:14:33.380267098Z",
  "refresh_token": "z4l33iUYGP70O-PlXo9eIFr38IMPqpCuNgYwmndot-0",
  "refresh_expires_at": "2026-10-28T21:59:33.379761557Z",
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
  "command_id": "d5c603fb-b05a-4826-8696-2dac9050fca2",
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
  "id": "d988419d-4373-4622-9ae7-465d1a7e76cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:04:33.689176Z",
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
  "command_id": "22e90d2c-d852-4e13-8554-8b0d5a40f7d0",
  "quote_id": "d988419d-4373-4622-9ae7-465d1a7e76cb",
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
  "id": "b90c6573-4bca-406b-97a8-92ee4b4672d7",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86626860-03da-4bfa-b360-4782e03b730b",
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
  "created_at": "2026-10-28T09:59:33.855373Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b90c6573-4bca-406b-97a8-92ee4b4672d7` → **200**

```json
{
  "id": "b90c6573-4bca-406b-97a8-92ee4b4672d7",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86626860-03da-4bfa-b360-4782e03b730b",
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
  "created_at": "2026-10-28T09:59:33.855373Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b90c6573-4bca-406b-97a8-92ee4b4672d7/cancel` → **200**

```json
{
  "command_id": "295a39db-9cbe-4ec0-a937-b9ff28b407fc",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "b90c6573-4bca-406b-97a8-92ee4b4672d7",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "86626860-03da-4bfa-b360-4782e03b730b",
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
  "created_at": "2026-10-28T09:59:33.855373Z",
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
  "command_id": "b2331e4c-8fcf-4204-b92b-65b9c62d0fd8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:59:34Z",
    "sequence": 1793181574499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404236b1-e40d-4f24-ba7a-9bae21c456cb",
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
  "last_heartbeat_at": "2026-10-28T09:59:34.516506Z",
  "last_location_at": "2026-10-28T09:59:34.516506Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3067"
}
```

```json
{
  "challenge_id": "c2dd97d6-86d3-4196-90ec-b19396fac90d",
  "expires_at": "2026-10-28T10:04:34.671571808Z",
  "resend_available_at": "2026-10-28T09:59:35.671571808Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "614472",
  "sent_at": "2026-10-28T09:59:34.674153715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2dd97d6-86d3-4196-90ec-b19396fac90d",
  "code": "614472",
  "device_ref": "sandbox-3067"
}
```

```json
{
  "session_id": "8cecbd0a-3ec2-4c2d-af0b-676de61ba47c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjQ3NCwiaWF0IjoxNzkzMTgxNTc0LCJqdGkiOiJhMjM4ZWU5Ni1jYmU0LTRlZmYtYTI1My0xNWQ3ZDBlZWIyMDQiLCJzaWQiOiI4Y2VjYmQwYS0zZWMyLTRjMmQtYWYwYi02NzZkZTYxYmE0N2MifQ.xMzY3aP2aTOIMu_uYWnl1B45bxne4Jg2oCVPpRFSxHA",
  "access_expires_at": "2026-10-28T10:14:34.84568924Z",
  "refresh_token": "Gd21vzCaQ0U-e7YKJgRatc4A-s-7Y558OB3ZEOgIGTM",
  "refresh_expires_at": "2026-11-27T09:59:34.845300014Z",
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
  "command_id": "d19a8d2f-69ec-4e16-bc2d-230d6da4ca59",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:59:35Z",
    "sequence": 1793181575135
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c903eb8e-f698-413b-bf68-a73d9286dfaa",
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
  "last_heartbeat_at": "2026-10-28T09:59:35.152208Z",
  "last_location_at": "2026-10-28T09:59:35.152208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3f5d43f6-77a3-4fcb-8e1c-b37e26e0bee4",
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
  "id": "a0ffafd4-2983-4600-9a3d-b22194574b1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:04:35.306454Z",
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
  "command_id": "06b59a8a-c240-47e0-b080-23a6bc7b307d",
  "quote_id": "a0ffafd4-2983-4600-9a3d-b22194574b1a",
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
  "id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86626860-03da-4bfa-b360-4782e03b730b",
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
  "created_at": "2026-10-28T09:59:35.551108Z",
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
    "id": "36b724a9-8a5e-4303-8165-bb98f90f9826",
    "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
    "expires_at": "2026-10-28T09:59:50.554449Z",
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

`POST /api/driver/v1/offers/36b724a9-8a5e-4303-8165-bb98f90f9826/accept` → **200**

```json
{
  "command_id": "f29cd67a-13f0-41c4-8619-fd2cd7124e7c"
}
```

```json
{
  "id": "3fe2f6c8-d9f3-41eb-bbf2-a3d63cdbe394",
  "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1cafde91-8942-49f2-ab26-2d6125bedb81",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1cafde91-8942-49f2-ab26-2d6125bedb81",
  "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
  "assignment_id": "3fe2f6c8-d9f3-41eb-bbf2-a3d63cdbe394",
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

`POST /api/driver/v1/trips/1cafde91-8942-49f2-ab26-2d6125bedb81/cancel` → **200**

```json
{
  "command_id": "33c10086-d493-47a0-a0d2-e5a582751d36",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "1cafde91-8942-49f2-ab26-2d6125bedb81",
  "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
  "assignment_id": "3fe2f6c8-d9f3-41eb-bbf2-a3d63cdbe394",
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

`GET /api/rider/v1/orders/2ef84a7b-ba98-4c33-a992-fb8023e6b2b4` → **200**

```json
{
  "id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "86626860-03da-4bfa-b360-4782e03b730b",
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
    "id": "3fe2f6c8-d9f3-41eb-bbf2-a3d63cdbe394",
    "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1cafde91-8942-49f2-ab26-2d6125bedb81",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:59:35.551108Z",
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
    "id": "de3d0aa8-697a-4ccf-b065-81c4865d6017",
    "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
    "expires_at": "2026-10-28T09:59:51.299398Z",
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

`POST /api/driver/v1/offers/de3d0aa8-697a-4ccf-b065-81c4865d6017/accept` → **200**

```json
{
  "command_id": "4155b724-7797-477b-938e-2c4107bc60f5"
}
```

```json
{
  "id": "6f74a18b-9cec-44f4-96ce-2fb73316d170",
  "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4828529b-a248-4b3a-a7d4-33c90eed3477",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4828529b-a248-4b3a-a7d4-33c90eed3477",
  "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
  "assignment_id": "6f74a18b-9cec-44f4-96ce-2fb73316d170",
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

`POST /api/driver/v1/trips/4828529b-a248-4b3a-a7d4-33c90eed3477/cancel` → **200**

```json
{
  "command_id": "ba489805-f7bc-4ae4-aa93-353cc224a3c5",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "4828529b-a248-4b3a-a7d4-33c90eed3477",
  "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
  "assignment_id": "6f74a18b-9cec-44f4-96ce-2fb73316d170",
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
    "id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:59:35.551108Z",
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
    "id": "b90c6573-4bca-406b-97a8-92ee4b4672d7",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:59:33.855373Z",
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

`GET /api/operator/v1/orders/2ef84a7b-ba98-4c33-a992-fb8023e6b2b4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:59:35.551679Z",
      "actor": {
        "type": "CLIENT",
        "id": "86626860-03da-4bfa-b360-4782e03b730b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
        "quote_id": "a0ffafd4-2983-4600-9a3d-b22194574b1a",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "ad45aa9c-ba99-4b81-bc43-04e5e6229b36"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:59:35.553521Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
        "attempt_id": "a21fc959-4d0f-4ffd-8413-7777ce39ed37",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ad45aa9c-ba99-4b81-bc43-04e5e6229b36"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:59:35.55959Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "36b724a9-8a5e-4303-8165-bb98f90f9826",
        "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "ad45aa9c-ba99-4b81-bc43-04e5e6229b36"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:59:35.986714Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "36b724a9-8a5e-4303-8165-bb98f90f9826",
        "order_id": "2ef84a7b-ba98-4c33-a992-fb8023e6b2b4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "3fe2f6c8-d9f3-41eb-bbf2-a3d63cdbe394"
      },
      "correlation_id": "1a997d09-5f11-4a3f-bc55-c8ec0ce99451"
```

Done: orders b90c6573-4bca-406b-97a8-92ee4b4672d7, 2ef84a7b-ba98-4c33-a992-fb8023e6b2b4.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739920832",
  "device_ref": "sandbox-22593"
}
```

```json
{
  "challenge_id": "5984a947-5091-4aca-af68-d0610a8198cf",
  "expires_at": "2026-10-28T10:04:37.576560687Z",
  "resend_available_at": "2026-10-28T09:59:38.576560687Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739920832` → **200**

```json
{
  "phone": "+380739920832",
  "audience": "CLIENT",
  "code": "580616",
  "sent_at": "2026-10-28T09:59:37.579001532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5984a947-5091-4aca-af68-d0610a8198cf",
  "code": "580616",
  "device_ref": "sandbox-22593"
}
```

```json
{
  "session_id": "19a1ec4e-c771-4a73-9530-ecc6003c50e5",
  "subject": {
    "type": "CLIENT",
    "id": "f44ca330-a3b6-4425-bb0a-58f6e27a2e02"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNDRjYTMzMC1hM2I2LTQ0MjUtYmIwYS01OGY2ZTI3YTJlMDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNDc3LCJpYXQiOjE3OTMxODE1NzcsImp0aSI6ImNkN2FkMWVkLTY4OWYtNGEyZS1iNmE5LWNiNmEyMTM0YmIzMyIsInNpZCI6IjE5YTFlYzRlLWM3NzEtNGE3My05NTMwLWVjYzYwMDNjNTBlNSJ9.LUOIbMJhbwMDvLwdZqaYzrblanP4B_OcghxHvKYZzSg",
  "access_expires_at": "2026-10-28T10:14:37.753325905Z",
  "refresh_token": "d3q0PX5OpU9GrzYZauWpyf7PQuCfGhLyaVrhsLcwdnM",
  "refresh_expires_at": "2026-11-27T09:59:37.752949348Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5a98e1b7-0ac8-4633-867d-a473db35a9ab",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ecd5f2eb-dc79-4975-8149-73938d109934",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ecd5f2eb-dc79-4975-8149-73938d109934",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c69b2701309efe653995a795717f46ab",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ecd5f2eb-dc79-4975-8149-73938d109934",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739920832"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ecd5f2eb-dc79-4975-8149-73938d109934",
  "expires_at": "2026-10-28T10:29:37.911843Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ecd5f2eb-dc79-4975-8149-73938d109934` → **200**

```json
{
  "id": "ecd5f2eb-dc79-4975-8149-73938d109934",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:29:37.911843Z",
  "card": {
    "id": "c5d41330-3b95-48f7-a769-5876eb0cb339",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0763",
    "card_type": "Visa",
    "created_at": "2026-10-28T09:59:38.073972Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c5d41330-3b95-48f7-a769-5876eb0cb339",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0763",
      "card_type": "Visa",
      "created_at": "2026-10-28T09:59:38.073972Z"
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
  "device_ref": "sandbox-7592"
}
```

```json
{
  "challenge_id": "837a4741-ce12-4ba8-b93e-a06bbb842258",
  "expires_at": "2026-10-28T10:04:38.389035659Z",
  "resend_available_at": "2026-10-28T09:59:39.389035659Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "349198",
  "sent_at": "2026-10-28T09:59:38.39150048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "837a4741-ce12-4ba8-b93e-a06bbb842258",
  "code": "349198",
  "device_ref": "sandbox-7592"
}
```

```json
{
  "session_id": "45d26c05-cecb-4a77-b9e4-b2642372b0e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjQ3OCwiaWF0IjoxNzkzMTgxNTc4LCJqdGkiOiI5M2I0MDVmNy04NGExLTRiOGItODhmOC02ZGE3ZmNhODI3ZGQiLCJzaWQiOiI0NWQyNmMwNS1jZWNiLTRhNzctYjllNC1iMjY0MjM3MmIwZTkifQ.Ur40BlViz_Lfz6D7zb9QLR0MxR3m-z77Qj1kVS_ngSQ",
  "access_expires_at": "2026-10-28T10:14:38.583622331Z",
  "refresh_token": "rYyFPYAiL2RiQmdVGuwXWDCMMgI2CvTX2Vj3giQt11s",
  "refresh_expires_at": "2026-11-27T09:59:38.583150491Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c903eb8e-f698-413b-bf68-a73d9286dfaa",
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
  "last_heartbeat_at": "2026-10-28T09:59:35.152208Z",
  "last_location_at": "2026-10-28T09:59:35.152208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c903eb8e-f698-413b-bf68-a73d9286dfaa/handover` → **200**

```json
{
  "command_id": "7a532860-da39-497f-a249-85b76de54859",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c903eb8e-f698-413b-bf68-a73d9286dfaa",
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
  "last_heartbeat_at": "2026-10-28T09:59:35.152208Z",
  "last_location_at": "2026-10-28T09:59:35.152208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c903eb8e-f698-413b-bf68-a73d9286dfaa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:59:39Z",
    "sequence": 1793181579317
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c903eb8e-f698-413b-bf68-a73d9286dfaa",
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
  "last_heartbeat_at": "2026-10-28T09:59:39.05001Z",
  "last_location_at": "2026-10-28T09:59:39.05001Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "75e096ab-559e-4259-9081-9dbcbde4e46f",
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
  "id": "8e913bb7-635d-4673-90c0-e4ebc35edd11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:04:39.220424Z",
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
  "command_id": "edde4931-5e8d-4312-b504-aed196324b80",
  "quote_id": "8e913bb7-635d-4673-90c0-e4ebc35edd11",
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
  "id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f44ca330-a3b6-4425-bb0a-58f6e27a2e02",
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
  "created_at": "2026-10-28T09:59:39.382943Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/38a7c697-b9bc-4c76-a2aa-7b098befad9c` → **200**

```json
{
  "id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f44ca330-a3b6-4425-bb0a-58f6e27a2e02",
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
  "created_at": "2026-10-28T09:59:39.382943Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/38a7c697-b9bc-4c76-a2aa-7b098befad9c` → **200**

```json
{
  "id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f44ca330-a3b6-4425-bb0a-58f6e27a2e02",
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
  "created_at": "2026-10-28T09:59:39.382943Z",
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
    "id": "bce3334b-68be-40e3-93f8-21697b52a3ec",
    "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
    "expires_at": "2026-10-28T09:59:54.823011Z",
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

`POST /api/driver/v1/offers/bce3334b-68be-40e3-93f8-21697b52a3ec/accept` → **200**

```json
{
  "command_id": "4c3661dd-b420-453d-93c5-e29f3e2a6624"
}
```

```json
{
  "id": "9b915a22-1a0f-4460-85aa-b17e6aeea931",
  "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "78c4c991-2e45-4efc-b9a9-2fb097890f4f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "78c4c991-2e45-4efc-b9a9-2fb097890f4f",
  "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "assignment_id": "9b915a22-1a0f-4460-85aa-b17e6aeea931",
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

`POST /api/driver/v1/work-sessions/c903eb8e-f698-413b-bf68-a73d9286dfaa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:59:41Z",
    "sequence": 1793181581290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c903eb8e-f698-413b-bf68-a73d9286dfaa",
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
  "last_heartbeat_at": "2026-10-28T09:59:41.308088Z",
  "last_location_at": "2026-10-28T09:59:41.308088Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/78c4c991-2e45-4efc-b9a9-2fb097890f4f/arrive` → **200**

```json
{
  "command_id": "7db4277c-73f3-4e3b-b783-9da3c293c09d",
  "expected_version": 0
}
```

```json
{
  "id": "78c4c991-2e45-4efc-b9a9-2fb097890f4f",
  "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "assignment_id": "9b915a22-1a0f-4460-85aa-b17e6aeea931",
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
  "arrived_at": "2026-10-28T09:59:41.466198Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/78c4c991-2e45-4efc-b9a9-2fb097890f4f/start` → **200**

```json
{
  "command_id": "4cc841b6-2f44-4e44-8cd3-9b69f8e039d6",
  "expected_version": 1
}
```

```json
{
  "id": "78c4c991-2e45-4efc-b9a9-2fb097890f4f",
  "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "assignment_id": "9b915a22-1a0f-4460-85aa-b17e6aeea931",
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
  "arrived_at": "2026-10-28T09:59:41.466198Z",
  "started_at": "2026-10-28T09:59:41.625664Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/78c4c991-2e45-4efc-b9a9-2fb097890f4f/complete` → **200**

```json
{
  "command_id": "4ffccc76-db9f-4aae-a6d4-210a2937577d",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:59:41Z"
}
```

```json
{
  "id": "78c4c991-2e45-4efc-b9a9-2fb097890f4f",
  "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "assignment_id": "9b915a22-1a0f-4460-85aa-b17e6aeea931",
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
  "arrived_at": "2026-10-28T09:59:41.466198Z",
  "started_at": "2026-10-28T09:59:41.625664Z",
  "completed_at": "2026-10-28T09:59:41.791156Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/38a7c697-b9bc-4c76-a2aa-7b098befad9c` → **200**

```json
{
  "id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f44ca330-a3b6-4425-bb0a-58f6e27a2e02",
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
    "id": "9b915a22-1a0f-4460-85aa-b17e6aeea931",
    "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "78c4c991-2e45-4efc-b9a9-2fb097890f4f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:59:39.382943Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/38a7c697-b9bc-4c76-a2aa-7b098befad9c` → **200**

```json
{
  "id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "f44ca330-a3b6-4425-bb0a-58f6e27a2e02",
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
    "id": "9b915a22-1a0f-4460-85aa-b17e6aeea931",
    "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "78c4c991-2e45-4efc-b9a9-2fb097890f4f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:59:39.382943Z",
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
      "id": "adf51460-5ab4-46d4-924d-d4c34db6f54e",
      "at": "2026-10-28T09:59:41.862665Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/38a7c697-b9bc-4c76-a2aa-7b098befad9c/tip` → **200**

```json
{
  "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
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
  "available_until": "2026-10-29T09:59:41.791156Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/38a7c697-b9bc-4c76-a2aa-7b098befad9c/tip` → **201**

```json
{
  "command_id": "46df4206-7e22-44a4-8558-4931493fca80",
  "amount_minor": 2500
}
```

```json
{
  "id": "0bd6fccb-bff0-4330-a6a2-6ea14d9760d2",
  "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T09:59:43.778878Z"
}
```

`GET /api/rider/v1/orders/38a7c697-b9bc-4c76-a2aa-7b098befad9c/tip` → **200**

```json
{
  "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
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
  "available_until": "2026-10-29T09:59:41.791156Z",
  "open": false,
  "tip": {
    "id": "0bd6fccb-bff0-4330-a6a2-6ea14d9760d2",
    "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T09:59:43.778878Z"
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
      "id": "adf51460-5ab4-46d4-924d-d4c34db6f54e",
      "at": "2026-10-28T09:59:41.862665Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
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
      "id": "e857d6e7-aa98-4a95-a9a9-6066f7ad25af",
      "at": "2026-10-28T09:59:44.939344Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
      "counterpart_id": null
    },
    {
      "id": "adf51460-5ab4-46d4-924d-d4c34db6f54e",
      "at": "2026-10-28T09:59:41.862665Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "38a7c697-b9bc-4c76-a2aa-7b098befad9c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c903eb8e-f698-413b-bf68-a73d9286dfaa",
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
  "last_heartbeat_at": "2026-10-28T09:59:41.308088Z",
  "last_location_at": "2026-10-28T09:59:41.308088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c903eb8e-f698-413b-bf68-a73d9286dfaa/close` → **200**

```json
{
  "command_id": "a2b50e27-e132-4f2f-8ad6-15b0d1e76f1f",
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

Done: card order 38a7c697-b9bc-4c76-a2aa-7b098befad9c.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735897578",
  "device_ref": "sandbox-8237"
}
```

```json
{
  "challenge_id": "1396facf-44ca-4ae1-8d7b-07fb2a2e763a",
  "expires_at": "2026-10-28T10:04:45.734587637Z",
  "resend_available_at": "2026-10-28T09:59:46.734587637Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735897578` → **200**

```json
{
  "phone": "+380735897578",
  "audience": "CLIENT",
  "code": "106887",
  "sent_at": "2026-10-28T09:59:45.736921956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1396facf-44ca-4ae1-8d7b-07fb2a2e763a",
  "code": "106887",
  "device_ref": "sandbox-8237"
}
```

```json
{
  "session_id": "2ffc68b1-846e-4ad1-85ea-3ceabfa6e950",
  "subject": {
    "type": "CLIENT",
    "id": "4b1bc29a-ce17-4011-a97a-93102b057afc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjFiYzI5YS1jZTE3LTQwMTEtYTk3YS05MzEwMmIwNTdhZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNDg1LCJpYXQiOjE3OTMxODE1ODUsImp0aSI6IjAwMzI3MWM4LWY1MzQtNGQyMy1hZTQwLTE4OTQ4YTMzOTg4MiIsInNpZCI6IjJmZmM2OGIxLTg0NmUtNGFkMS04NWVhLTNjZWFiZmE2ZTk1MCJ9.XV3h_4AGZ4v60WxUTW55asytJSRf9trZFr5Sjh0ip6Y",
  "access_expires_at": "2026-10-28T10:14:45.916769631Z",
  "refresh_token": "PYiwclOU-yu_zw6hWxuOJ6mIoaNBzfsLe1nxyggcEOo",
  "refresh_expires_at": "2026-11-27T09:59:45.916355488Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c3ff3cde-7b0f-4838-a90c-f733b55c9f83",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "0173e078-2fa0-40e5-b02e-3733aebc41c5",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0173e078-2fa0-40e5-b02e-3733aebc41c5",
    "orderDate": "1793181586",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "af27916084df37a01a4f218e264a9e2c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0173e078-2fa0-40e5-b02e-3733aebc41c5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735897578"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0173e078-2fa0-40e5-b02e-3733aebc41c5",
  "created_at": "2026-10-28T09:59:46.067773Z",
  "expires_at": "2026-10-28T10:29:46.067773Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/0173e078-2fa0-40e5-b02e-3733aebc41c5` → **200**

```json
{
  "id": "0173e078-2fa0-40e5-b02e-3733aebc41c5",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:59:46.067773Z",
  "expires_at": "2026-10-28T10:29:46.067773Z",
  "completed_at": "2026-10-28T09:59:46.250521Z",
  "masked_pan": "41****4070",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4b1bc29a-ce17-4011-a97a-93102b057afc",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4b1bc29a-ce17-4011-a97a-93102b057afc",
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
      "id": "4f2ed766-193d-43f8-bf84-64b16bf8196c",
      "at": "2026-10-28T09:59:46.954459Z",
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
  "client_id": "4b1bc29a-ce17-4011-a97a-93102b057afc",
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
      "id": "4f2ed766-193d-43f8-bf84-64b16bf8196c",
      "at": "2026-10-28T09:59:46.954459Z",
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
  "device_ref": "sandbox-24484"
}
```

```json
{
  "challenge_id": "b4569b72-163a-4f0b-97bb-2bd61b220071",
  "expires_at": "2026-10-28T10:04:47.862051131Z",
  "resend_available_at": "2026-10-28T09:59:48.862051131Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "273337",
  "sent_at": "2026-10-28T09:59:47.864213186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4569b72-163a-4f0b-97bb-2bd61b220071",
  "code": "273337",
  "device_ref": "sandbox-24484"
}
```

```json
{
  "session_id": "8b9ab5f5-5e38-4c2b-9f95-fd922b439407",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjQ4OCwiaWF0IjoxNzkzMTgxNTg4LCJqdGkiOiI1MjQ2ZWM2My0zYjAwLTRkYjUtOWI5OC0wNTNlNDZkYjI0OTkiLCJzaWQiOiI4YjlhYjVmNS01ZTM4LTRjMmItOWY5NS1mZDkyMmI0Mzk0MDcifQ.yAcAcInpufvRS59D2yVXMh_3kQyJR8kjg3MIjbsyvRg",
  "access_expires_at": "2026-10-28T10:14:48.042034906Z",
  "refresh_token": "_0Ow6sHjEAvQ6rXX_yjXmD4AlwgmAC6h0HN_mRy2Wnc",
  "refresh_expires_at": "2026-11-27T09:59:48.041623637Z",
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
  "command_id": "84ed5fc6-6de3-4e48-827d-d87337fb6a1d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ef8f428b-ffce-4e6b-af8c-7ff5933234da",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ef8f428b-ffce-4e6b-af8c-7ff5933234da",
    "orderDate": "1793181588",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "501e3cad2b92fe926fcf44149d14d44a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ef8f428b-ffce-4e6b-af8c-7ff5933234da",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ef8f428b-ffce-4e6b-af8c-7ff5933234da",
  "created_at": "2026-10-28T09:59:48.345265Z",
  "expires_at": "2026-10-28T10:29:48.345265Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ef8f428b-ffce-4e6b-af8c-7ff5933234da` → **200**

```json
{
  "id": "ef8f428b-ffce-4e6b-af8c-7ff5933234da",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:59:48.345265Z",
  "expires_at": "2026-10-28T10:29:48.345265Z",
  "completed_at": "2026-10-28T09:59:48.501043Z",
  "masked_pan": "41****0468",
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
      "id": "454dedb7-3be9-4eb6-b157-90d0df87dfa7",
      "at": "2026-10-28T09:59:48.96094Z",
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
  "command_id": "70f700da-ddd6-49fc-b629-604cf25ef26c",
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
  "correlation_id": "d6670042-d629-4dfc-a25b-8447b5f2ff31"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674724025",
  "device_ref": "sandbox-29714"
}
```

```json
{
  "challenge_id": "12b3d098-5d8b-4031-bd26-6577f1cf792b",
  "expires_at": "2026-10-28T10:04:50.160561237Z",
  "resend_available_at": "2026-10-28T09:59:51.160561237Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674724025` → **200**

```json
{
  "phone": "+380674724025",
  "audience": "CLIENT",
  "code": "514459",
  "sent_at": "2026-10-28T09:59:50.162963812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12b3d098-5d8b-4031-bd26-6577f1cf792b",
  "code": "514459",
  "device_ref": "sandbox-29714"
}
```

```json
{
  "session_id": "b93bfcb2-3326-42c9-b6c3-278fa32bdd71",
  "subject": {
    "type": "CLIENT",
    "id": "1b1a0f72-4b8a-40b4-a4cb-86fd926b11ce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjFhMGY3Mi00YjhhLTQwYjQtYTRjYi04NmZkOTI2YjExY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNDkwLCJpYXQiOjE3OTMxODE1OTAsImp0aSI6IjA3MGFhZjQ3LWQyMTMtNGNkNi04YWY2LTQwOWUzYjM4YzY3NCIsInNpZCI6ImI5M2JmY2IyLTMzMjYtNDJjOS1iNmMzLTI3OGZhMzJiZGQ3MSJ9.eGg97lBaojsi7QpweCD6gFhb2dcgm3D4JwUvSHh6Rck",
  "access_expires_at": "2026-10-28T10:14:50.32949859Z",
  "refresh_token": "kLirJ55DtBjpDeAkKiJt5eQ4zX25rcfij5pyOo5vnMg",
  "refresh_expires_at": "2026-11-27T09:59:50.329157908Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1b1a0f72-4b8a-40b4-a4cb-86fd926b11ce",
  "session_id": "b93bfcb2-3326-42c9-b6c3-278fa32bdd71",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d4779ee6-338d-4dc0-b06b-8c1cac958684",
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
  "id": "9e1abe7e-1123-49ee-b48a-72dc81a2863c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:04:50.631368Z",
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
  "challenge_id": "d70d40a1-e58a-4d56-880d-ddd2dac8d691",
  "expires_at": "2026-10-28T10:04:52.790743482Z",
  "resend_available_at": "2026-10-28T09:59:53.790743482Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674724025` → **200**

```json
{
  "phone": "+380674724025",
  "audience": "CLIENT",
  "code": "679569",
  "sent_at": "2026-10-28T09:59:52.792453701Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "71cda75f-325a-48cd-9d76-0efc3fe211ce",
  "challenge_id": "d70d40a1-e58a-4d56-880d-ddd2dac8d691",
  "otp_code": "679569"
}
```

```json
{
  "client_id": "1b1a0f72-4b8a-40b4-a4cb-86fd926b11ce",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T09:59:52.976218437Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "f19c3f56-486b-4517-bb98-6f6550adfa24",
  "quote_id": "9e1abe7e-1123-49ee-b48a-72dc81a2863c",
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
  "correlation_id": "4bc8dacc-5454-4917-962d-0ee9f1859e4f"
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
  "session_id": "6de77a1c-856a-4e02-b603-794bc634a55f",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI0OTMsImlhdCI6MTc5MzE4MTU5MywianRpIjoiODU1NjVlZTEtM2M0My00MjdmLTllMTQtMjJkYWRmZDEwM2NmIiwic2lkIjoiNmRlNzdhMWMtODU2YS00ZTAyLWI2MDMtNzk0YmM2MzRhNTVmIn0.ZX_SsG44BxrnJrkPpJ03a1esU404V8576eMZGFQeISc",
  "access_expires_at": "2026-10-28T10:14:53.513909376Z",
  "refresh_token": "Y8f_-aXwcNI_AE0bmofH58hheFkjPTuWs2tdtDsv5Qo",
  "refresh_expires_at": "2026-10-28T21:59:53.513545809Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1b1a0f72-4b8a-40b4-a4cb-86fd926b11ce",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T09:59:52.976218Z",
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

`POST /api/admin/v1/client-deletions/1b1a0f72-4b8a-40b4-a4cb-86fd926b11ce/complete` → **200**

```json
{
  "command_id": "076a831a-1b88-4147-9982-482d8eb6cae0",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1b1a0f72-4b8a-40b4-a4cb-86fd926b11ce",
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
  "correlation_id": "57f44d2b-e244-42dc-add6-1ddbfd7b1074"
}
```

Done: client 1b1a0f72-4b8a-40b4-a4cb-86fd926b11ce anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662974961",
  "device_ref": "sandbox-25753"
}
```

```json
{
  "challenge_id": "912c7edb-28be-47a0-b411-425201a269e3",
  "expires_at": "2026-10-28T10:04:54.169197924Z",
  "resend_available_at": "2026-10-28T09:59:55.169197924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662974961` → **200**

```json
{
  "phone": "+380662974961",
  "audience": "CLIENT",
  "code": "334422",
  "sent_at": "2026-10-28T09:59:54.171267469Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "912c7edb-28be-47a0-b411-425201a269e3",
  "code": "334422",
  "device_ref": "sandbox-25753"
}
```

```json
{
  "session_id": "93fc4e47-49c8-4d40-993c-6d32b34b1e8f",
  "subject": {
    "type": "CLIENT",
    "id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWIxYmU5NS0wZWJkLTQ2OTgtOGJmZi1iMzBlMWVhNzk1NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNDk0LCJpYXQiOjE3OTMxODE1OTQsImp0aSI6IjVkZDFmM2NlLWE1M2EtNDBiMy1iYzhjLTgzMzBiYTIyM2U2NCIsInNpZCI6IjkzZmM0ZTQ3LTQ5YzgtNGQ0MC05OTNjLTZkMzJiMzRiMWU4ZiJ9.3FGmyDG2r2U45S_HKG4LbCBXwIUL0GV6Byg8iOVEt34",
  "access_expires_at": "2026-10-28T10:14:54.342016442Z",
  "refresh_token": "GmaC3djzjJZl41odrWnglCwHtm77DMDatYQtd2z2wmc",
  "refresh_expires_at": "2026-11-27T09:59:54.341623751Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a",
  "session_id": "93fc4e47-49c8-4d40-993c-6d32b34b1e8f",
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
  "session_id": "802bfac9-c8cf-404c-a45e-097129f1a7eb",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI0OTQsImlhdCI6MTc5MzE4MTU5NCwianRpIjoiODE3Y2YyOTUtZDViYy00NTc3LTllNGUtM2Q0YzUxMjg5NWRmIiwic2lkIjoiODAyYmZhYzktYzhjZi00MDRjLWE0NWUtMDk3MTI5ZjFhN2ViIn0.Vtn_2PCJ018rHkD_U3XDL4DLBmLnGBVqQqUIlGY8Lzo",
  "access_expires_at": "2026-10-28T10:14:54.844190223Z",
  "refresh_token": "xHCj5ndCLhpesMaADbX63uc23k9wSKv4Xjza9GQyjx0",
  "refresh_expires_at": "2026-10-28T21:59:54.843855769Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2974961&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a",
      "phone": "+380662974961",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T09:59:54.339543Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/8eb1be95-0ebd-4698-8bff-b30e1ea7955a` → **200**

```json
{
  "client": {
    "id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a",
    "phone": "+380662974961",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T09:59:54.339543Z",
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

`POST /api/admin/v1/clients/8eb1be95-0ebd-4698-8bff-b30e1ea7955a/block` → **400**

```json
{
  "command_id": "c0c79a89-a392-451c-a8d8-cc0cb7111f14",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8eb1be95-0ebd-4698-8bff-b30e1ea7955a/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d548c942-b1c0-4ea9-8b98-e3053bdb3d0d",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/8eb1be95-0ebd-4698-8bff-b30e1ea7955a/block` → **200**

```json
{
  "command_id": "8f3e814d-54c0-4f7e-8fb3-ad3575c57b5d",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a",
  "phone": "+380662974961",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T09:59:54.339543Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T09:59:55.51671Z",
    "by": "314e0a1f-41b3-4a08-9bab-60b699abf030"
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
  "correlation_id": "877a9ea7-1d79-442d-bc70-b9f5e85f40b7"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662974961",
  "device_ref": "sandbox-25616"
}
```

```json
{
  "challenge_id": "c4f63293-e37a-4f91-929d-dd918f8d5b4f",
  "expires_at": "2026-10-28T10:04:57.821020087Z",
  "resend_available_at": "2026-10-28T09:59:58.821020087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662974961` → **200**

```json
{
  "phone": "+380662974961",
  "audience": "CLIENT",
  "code": "667191",
  "sent_at": "2026-10-28T09:59:57.823091541Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c4f63293-e37a-4f91-929d-dd918f8d5b4f",
  "code": "667191",
  "device_ref": "sandbox-25616"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "2bc24a15-7570-466a-97c6-bbe33101f96e"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/8eb1be95-0ebd-4698-8bff-b30e1ea7955a` → **200**

```json
{
  "client": {
    "id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a",
    "phone": "+380662974961",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T09:59:54.339543Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T09:59:55.51671Z",
      "by": "314e0a1f-41b3-4a08-9bab-60b699abf030"
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

`POST /api/admin/v1/clients/8eb1be95-0ebd-4698-8bff-b30e1ea7955a/unblock` → **200**

```json
{
  "command_id": "afdbcee7-956d-43b9-95b8-ffe3d4e2a37f",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a",
  "phone": "+380662974961",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T09:59:54.339543Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662974961",
  "device_ref": "sandbox-24900"
}
```

```json
{
  "challenge_id": "7e656698-95ee-4356-9e4b-5aae08ce92b3",
  "expires_at": "2026-10-28T10:05:00.487077252Z",
  "resend_available_at": "2026-10-28T10:00:01.487077252Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662974961` → **200**

```json
{
  "phone": "+380662974961",
  "audience": "CLIENT",
  "code": "100121",
  "sent_at": "2026-10-28T10:00:00.488732871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e656698-95ee-4356-9e4b-5aae08ce92b3",
  "code": "100121",
  "device_ref": "sandbox-24900"
}
```

```json
{
  "session_id": "09c764ff-e96d-487e-9f3d-a2bb7faccd56",
  "subject": {
    "type": "CLIENT",
    "id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWIxYmU5NS0wZWJkLTQ2OTgtOGJmZi1iMzBlMWVhNzk1NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTAwLCJpYXQiOjE3OTMxODE2MDAsImp0aSI6IjA2MjYyM2U3LTFlMmMtNDA4Ni1hNTljLTY3ODNiZTliZGY1YyIsInNpZCI6IjA5Yzc2NGZmLWU5NmQtNDg3ZS05ZjNkLWEyYmI3ZmFjY2Q1NiJ9.QpgFvhao26WhQIyU57fVWS4dJ0_MXVgmiDHzv114aA4",
  "access_expires_at": "2026-10-28T10:15:00.665030252Z",
  "refresh_token": "u5bLLaihP4nCRzti74-PB1n5kFQ99OCl80pGt-N0bb4",
  "refresh_expires_at": "2026-11-27T10:00:00.664607957Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8eb1be95-0ebd-4698-8bff-b30e1ea7955a",
  "session_id": "09c764ff-e96d-487e-9f3d-a2bb7faccd56",
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
  "phone": "+380660305053",
  "device_ref": "sandbox-28072"
}
```

```json
{
  "challenge_id": "6d4e5e3c-581a-4118-b6c7-f2b27b28c6bd",
  "expires_at": "2026-10-28T10:05:00.974082826Z",
  "resend_available_at": "2026-10-28T10:00:01.974082826Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660305053` → **200**

```json
{
  "phone": "+380660305053",
  "audience": "CLIENT",
  "code": "797171",
  "sent_at": "2026-10-28T10:00:00.976085857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d4e5e3c-581a-4118-b6c7-f2b27b28c6bd",
  "code": "797171",
  "device_ref": "sandbox-28072"
}
```

```json
{
  "session_id": "c24786e2-8d80-4c18-bb2d-73fbba9ed9ae",
  "subject": {
    "type": "CLIENT",
    "id": "c7c1ed6d-3cd4-47a0-927c-04a62a410a61"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2MxZWQ2ZC0zY2Q0LTQ3YTAtOTI3Yy0wNGE2MmE0MTBhNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTAxLCJpYXQiOjE3OTMxODE2MDEsImp0aSI6Ijg1ODk3ZmM4LWUzMGUtNDNhNi05MzNiLTY2Y2U0ZTNkZDFiZCIsInNpZCI6ImMyNDc4NmUyLThkODAtNGMxOC1iYjJkLTczZmJiYTllZDlhZSJ9.iOkG7qcFuqkMEe9Fpj0Df67EnDvCCcIREyJkVmqXTnc",
  "access_expires_at": "2026-10-28T10:15:01.153055193Z",
  "refresh_token": "vnQYHHToJwLhID-BrVPsjKUbIFOfnY47dQ7MIdMk2mw",
  "refresh_expires_at": "2026-11-27T10:00:01.15258781Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0dd0fc64-0584-4b97-b285-ad819fc56199",
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
  "id": "6e846798-d5d2-4bc8-b97d-ab40fd18dbb8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:01.309940Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 32c3916a-cba3-4a2a-b5f1-ef0d7744ea66) → **201**

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
  "session_id": "8d007ce3-5715-4382-b504-17f7905d4ce1",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MDEsImlhdCI6MTc5MzE4MTYwMSwianRpIjoiNDJhOTM4NjgtZjM2MS00ODFmLWIwMTctNzAyMmQ4NjZhOTFkIiwic2lkIjoiOGQwMDdjZTMtNTcxNS00MzgyLWI1MDQtMTdmNzkwNWQ0Y2UxIn0.pkPGbBs5f3xxd1AyRlNi09wY_rbzcmpczfE2-IKGGEQ",
  "access_expires_at": "2026-10-28T10:15:01.714062853Z",
  "refresh_token": "taJdt1bJ_Ghr6MBJ122QUqJMlq9DBi7XoBZCFrfHHSg",
  "refresh_expires_at": "2026-10-28T22:00:01.713609882Z",
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
  "session_id": "0fb576ff-c2bd-4d9e-ac14-440e6b1de2e3",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MDIsImlhdCI6MTc5MzE4MTYwMiwianRpIjoiODQzNmQxMjYtNWE2ZS00ZDY3LTllYmYtOGYyYTQ3YjVlNGU0Iiwic2lkIjoiMGZiNTc2ZmYtYzJiZC00ZDllLWFjMTQtNDQwZTZiMWRlMmUzIn0.wlwb-2-fOWXwD1yOIEg_aX9MgToHkC4cGzzhVdi497o",
  "access_expires_at": "2026-10-28T10:15:02.077865112Z",
  "refresh_token": "OUglWaODxzVCxt588CrpPnuA-zyrai2iz4y4XdbMLiQ",
  "refresh_expires_at": "2026-10-28T22:00:02.077436468Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/53f51253-e228-493e-9ac4-d882edb27d09/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:00:01.470187Z",
      "actor": {
        "type": "CLIENT",
        "id": "c7c1ed6d-3cd4-47a0-927c-04a62a410a61",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "53f51253-e228-493e-9ac4-d882edb27d09",
        "quote_id": "6e846798-d5d2-4bc8-b97d-ab40fd18dbb8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "32c3916a-cba3-4a2a-b5f1-ef0d7744ea66"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:00:01.471463Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "53f51253-e228-493e-9ac4-d882edb27d09",
        "attempt_id": "0ccba944-b643-432f-bd2c-90cd6cf48cea",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "32c3916a-cba3-4a2a-b5f1-ef0d7744ea66"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:00:01.47847Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "53f51253-e228-493e-9ac4-d882edb27d09",
        "attempt_id": "0ccba944-b643-432f-bd2c-90cd6cf48cea"
      },
      "correlation_id": "32c3916a-cba3-4a2a-b5f1-ef0d7744ea66"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "0ccba944-b643-432f-bd2c-90cd6cf48cea",
        "generation": 1,
        "started_at": "2026-10-28T10:00:01.470724Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:00:01.47847Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:00:01.472194Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/32c3916a-cba3-4a2a-b5f1-ef0d7744ea66` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "53f51253-e228-493e-9ac4-d882edb27d09:0",
      "order_id": "53f51253-e228-493e-9ac4-d882edb27d09",
      "at": "2026-10-28T10:00:01.470187Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "53f51253-e228-493e-9ac4-d882edb27d09:1",
      "order_id": "53f51253-e228-493e-9ac4-d882edb27d09",
      "at": "2026-10-28T10:00:01.471463Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "53f51253-e228-493e-9ac4-d882edb27d09:2",
      "order_id": "53f51253-e228-493e-9ac4-d882edb27d09",
      "at": "2026-10-28T10:00:01.47847Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/6b3836e4-2749-4a84-8a2b-1c974058dce7` → **200**

```json
{
  "found": []
}
```

Done: request 32c3916a-cba3-4a2a-b5f1-ef0d7744ea66 — order 53f51253-e228-493e-9ac4-d882edb27d09 found by its id.

`GET /api/rider/v1/orders/53f51253-e228-493e-9ac4-d882edb27d09` → **200**

```json
{
  "id": "53f51253-e228-493e-9ac4-d882edb27d09",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7c1ed6d-3cd4-47a0-927c-04a62a410a61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:00:01.469702Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/53f51253-e228-493e-9ac4-d882edb27d09/cancel` → **200**

```json
{
  "command_id": "d3871e09-e70d-4d1d-bb21-b90a2c5bdeea",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "53f51253-e228-493e-9ac4-d882edb27d09",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c7c1ed6d-3cd4-47a0-927c-04a62a410a61",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:00:01.469702Z",
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

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633825288",
  "device_ref": "sandbox-27396"
}
```

```json
{
  "challenge_id": "e201be17-49d1-4ea0-b161-e12b2c034d27",
  "expires_at": "2026-10-28T10:05:03.020747999Z",
  "resend_available_at": "2026-10-28T10:00:04.020747999Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633825288` → **200**

```json
{
  "phone": "+380633825288",
  "audience": "CLIENT",
  "code": "657828",
  "sent_at": "2026-10-28T10:00:03.022695285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e201be17-49d1-4ea0-b161-e12b2c034d27",
  "code": "657828",
  "device_ref": "sandbox-27396"
}
```

```json
{
  "session_id": "016d9937-6ad7-46bb-bced-c401065f7766",
  "subject": {
    "type": "CLIENT",
    "id": "2d618f9b-89da-4a26-bea9-924435a7c62a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDYxOGY5Yi04OWRhLTRhMjYtYmVhOS05MjQ0MzVhN2M2MmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTAzLCJpYXQiOjE3OTMxODE2MDMsImp0aSI6ImFjNGExYzVkLTYzNzgtNDc5ZS04NWE0LWIxMWE4YzU1MGEzZiIsInNpZCI6IjAxNmQ5OTM3LTZhZDctNDZiYi1iY2VkLWM0MDEwNjVmNzc2NiJ9.K-9ZUJeZGBacFc0n8HPKVgNuhvZDDtQ1VaTqW4mLbII",
  "access_expires_at": "2026-10-28T10:15:03.194544657Z",
  "refresh_token": "USMFN0lh7SAdg61lvbB_UnjN3ftauxmPYHq2W2OMgiM",
  "refresh_expires_at": "2026-11-27T10:00:03.194091931Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "f65cb935-e45c-4b0e-a0d4-89f666b23485",
  "expires_at": "2026-10-28T10:05:05.344726133Z",
  "resend_available_at": "2026-10-28T10:00:06.344726133Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633825288` → **200**

```json
{
  "phone": "+380633825288",
  "audience": "CLIENT",
  "code": "651097",
  "sent_at": "2026-10-28T10:00:05.34674374Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "e41d3732-47e6-4b2f-a8b1-7dc5184f9c0e",
  "challenge_id": "f65cb935-e45c-4b0e-a0d4-89f666b23485",
  "otp_code": "651097"
}
```

```json
{
  "id": "c464d9a3-e911-4582-ba33-72de06bf5ef8",
  "state": "PENDING",
  "created_at": "2026-10-28T10:00:05.52592Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8` → **200**

```json
{
  "id": "c464d9a3-e911-4582-ba33-72de06bf5ef8",
  "state": "PENDING",
  "created_at": "2026-10-28T10:00:05.52592Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8` → **200**

```json
{
  "id": "c464d9a3-e911-4582-ba33-72de06bf5ef8",
  "state": "PENDING",
  "created_at": "2026-10-28T10:00:05.52592Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8` → **200**

```json
{
  "id": "c464d9a3-e911-4582-ba33-72de06bf5ef8",
  "state": "PENDING",
  "created_at": "2026-10-28T10:00:05.52592Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8` → **200**

```json
{
  "id": "c464d9a3-e911-4582-ba33-72de06bf5ef8",
  "state": "PENDING",
  "created_at": "2026-10-28T10:00:05.52592Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8` → **200**

```json
{
  "id": "c464d9a3-e911-4582-ba33-72de06bf5ef8",
  "state": "PENDING",
  "created_at": "2026-10-28T10:00:05.52592Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8` → **200**

```json
{
  "id": "c464d9a3-e911-4582-ba33-72de06bf5ef8",
  "state": "READY",
  "created_at": "2026-10-28T10:00:05.52592Z",
  "ready_at": "2026-10-28T10:00:10.379451Z",
  "expires_at": "2026-11-04T10:00:10.379451Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639916435",
  "device_ref": "sandbox-10202"
}
```

```json
{
  "challenge_id": "10c48f05-7484-4c70-8ab4-077bfd23abb4",
  "expires_at": "2026-10-28T10:05:11.582529407Z",
  "resend_available_at": "2026-10-28T10:00:12.582529407Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639916435` → **200**

```json
{
  "phone": "+380639916435",
  "audience": "CLIENT",
  "code": "520984",
  "sent_at": "2026-10-28T10:00:11.585167918Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10c48f05-7484-4c70-8ab4-077bfd23abb4",
  "code": "520984",
  "device_ref": "sandbox-10202"
}
```

```json
{
  "session_id": "d9f0d3f7-679f-4567-8681-1376805d6977",
  "subject": {
    "type": "CLIENT",
    "id": "0b3ced9b-2aba-4567-886f-0cfa9b274621"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjNjZWQ5Yi0yYWJhLTQ1NjctODg2Zi0wY2ZhOWIyNzQ2MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTExLCJpYXQiOjE3OTMxODE2MTEsImp0aSI6IjhiYjFlOTk3LTc0ZDgtNDIwYS05Y2IxLWZjZWMxNDI0MzczZiIsInNpZCI6ImQ5ZjBkM2Y3LTY3OWYtNDU2Ny04NjgxLTEzNzY4MDVkNjk3NyJ9.dl-JX3fU38mWUi_oT-OeokCwS20Zk83JaKUl_lT8v5I",
  "access_expires_at": "2026-10-28T10:15:11.751409346Z",
  "refresh_token": "-hAYBEIkXk1-IN7hF0WaZPVTc2zWIW-Q2tWZAd6o0No",
  "refresh_expires_at": "2026-11-27T10:00:11.750962815Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c464d9a3-e911-4582-ba33-72de06bf5ef8/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3cc2e76a-2b9e-43ce-9d5c-0e7496afdfec"
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
  "session_id": "94019c02-1152-4997-9985-1942fe4f1f98",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MTIsImlhdCI6MTc5MzE4MTYxMiwianRpIjoiZjRiODg4MTQtMWFkZi00OTcwLWI0ZDktNTJhZTk1ZGNiN2ViIiwic2lkIjoiOTQwMTljMDItMTE1Mi00OTk3LTk5ODUtMTk0MmZlNGYxZjk4In0.WI6ADb8Q-BIbFq2rk4Sp1hNX2_Uagc0FBB8ak3hsEX8",
  "access_expires_at": "2026-10-28T10:15:12.271470635Z",
  "refresh_token": "TAE0TY7s7Snex2HsivZxMe5vb_uptfnL0tRSEfezWgI",
  "refresh_expires_at": "2026-10-28T22:00:12.271061749Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2d618f9b-89da-4a26-bea9-924435a7c62a",
  "session_id": "016d9937-6ad7-46bb-bced-c401065f7766",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/2d618f9b-89da-4a26-bea9-924435a7c62a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c464d9a3-e911-4582-ba33-72de06bf5ef8",
      "state": "READY",
      "created_at": "2026-10-28T10:00:05.52592Z",
      "ready_at": "2026-10-28T10:00:10.379451Z",
      "expires_at": "2026-11-04T10:00:10.379451Z",
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
  "device_ref": "sandbox-23027"
}
```

```json
{
  "challenge_id": "aa8b14d2-1285-4940-a9b1-4f7b12cc5fda",
  "expires_at": "2026-10-28T10:05:12.716859909Z",
  "resend_available_at": "2026-10-28T10:00:13.716859909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "853013",
  "sent_at": "2026-10-28T10:00:12.718616853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa8b14d2-1285-4940-a9b1-4f7b12cc5fda",
  "code": "853013",
  "device_ref": "sandbox-23027"
}
```

```json
{
  "session_id": "d49f52da-4c55-4889-8110-8ed9fb7f50da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjUxMiwiaWF0IjoxNzkzMTgxNjEyLCJqdGkiOiI1MmFmMTkxOC04NGQyLTQ2N2UtYWE2NS1jNThlOGYzMGEzNjEiLCJzaWQiOiJkNDlmNTJkYS00YzU1LTQ4ODktODExMC04ZWQ5ZmI3ZjUwZGEifQ.Y619MBYTrIU6d6dEy0yK-HdWB9c8ZS6fUq28Qt9JicE",
  "access_expires_at": "2026-10-28T10:15:12.887657034Z",
  "refresh_token": "YW3ZbHmhju6f0UpFVnxWPvDRvhytF7jiwihRIA6SgvY",
  "refresh_expires_at": "2026-11-27T10:00:12.8872956Z",
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
  "device_ref": "sandbox-22921"
}
```

```json
{
  "challenge_id": "faa30695-3739-48bf-9513-199d17ac9fe0",
  "expires_at": "2026-10-28T10:05:13.172416972Z",
  "resend_available_at": "2026-10-28T10:00:14.172416972Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "755239",
  "sent_at": "2026-10-28T10:00:13.174385449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "faa30695-3739-48bf-9513-199d17ac9fe0",
  "code": "755239",
  "device_ref": "sandbox-22921"
}
```

```json
{
  "session_id": "0eeea499-fa02-4d7c-8620-33b2bc74d267",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjUxMywiaWF0IjoxNzkzMTgxNjEzLCJqdGkiOiJlMjNjZGY3OS1lYmE1LTRhMDItOWI2NS1mM2VhMDYzNjljMDgiLCJzaWQiOiIwZWVlYTQ5OS1mYTAyLTRkN2MtODYyMC0zM2IyYmM3NGQyNjcifQ._D5V8W5gAUjijR8JGhlyrQEVOz9Iym1HqnUPzacLsRg",
  "access_expires_at": "2026-10-28T10:15:13.344990866Z",
  "refresh_token": "fMBpOBfTi5Q3T7uxSjjWZLLjZOt47XMlL_arWcW8UJE",
  "refresh_expires_at": "2026-11-27T10:00:13.34458895Z",
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
  "command_id": "e64ce89d-3d05-4a34-815d-f4aa6e68c417",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:13Z",
    "sequence": 1793181613651
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e57e076a-3cce-4546-b2a3-c4cb1488262b",
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
  "last_heartbeat_at": "2026-10-28T10:00:13.667191Z",
  "last_location_at": "2026-10-28T10:00:13.667191Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-22610"
}
```

```json
{
  "challenge_id": "abbe203b-0024-49bc-93b7-e3d726d29623",
  "expires_at": "2026-10-28T10:05:13.818830969Z",
  "resend_available_at": "2026-10-28T10:00:14.818830969Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "166171",
  "sent_at": "2026-10-28T10:00:13.821186133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abbe203b-0024-49bc-93b7-e3d726d29623",
  "code": "166171",
  "device_ref": "sandbox-22610"
}
```

```json
{
  "session_id": "6bfb1732-6723-4058-9de1-8f02716c3c02",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjUxNCwiaWF0IjoxNzkzMTgxNjE0LCJqdGkiOiIzN2RiYWIyNy03MmZkLTQxM2ItYTgzMC02YjNlNTU4MTE3Y2YiLCJzaWQiOiI2YmZiMTczMi02NzIzLTQwNTgtOWRlMS04ZjAyNzE2YzNjMDIifQ.Nqjflbun32HJhiuiGhOQsm-6vHFjWNOchH_gms-x3cs",
  "access_expires_at": "2026-10-28T10:15:14.000501958Z",
  "refresh_token": "Aw8Ee4hC-cGuz7cyi_KOVq_QwfnQgM8k5n3cFbejeHo",
  "refresh_expires_at": "2026-11-27T10:00:14.000033792Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404236b1-e40d-4f24-ba7a-9bae21c456cb",
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
  "last_heartbeat_at": "2026-10-28T09:59:34.516506Z",
  "last_location_at": "2026-10-28T09:59:34.516506Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/404236b1-e40d-4f24-ba7a-9bae21c456cb/handover` → **200**

```json
{
  "command_id": "91ce1169-f3ca-4c62-a61e-adfdc4a8cf38",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404236b1-e40d-4f24-ba7a-9bae21c456cb",
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
  "last_heartbeat_at": "2026-10-28T09:59:34.516506Z",
  "last_location_at": "2026-10-28T09:59:34.516506Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/404236b1-e40d-4f24-ba7a-9bae21c456cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:14Z",
    "sequence": 1793181614484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404236b1-e40d-4f24-ba7a-9bae21c456cb",
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
  "last_heartbeat_at": "2026-10-28T10:00:14.500811Z",
  "last_location_at": "2026-10-28T10:00:14.500811Z",
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
  "session_id": "c2db50b5-8f7f-4158-ad03-12a5c0099013",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MTQsImlhdCI6MTc5MzE4MTYxNCwianRpIjoiMTI3YjY0OTMtZTFiNi00YTVkLThiMmEtYTAzNjQwM2MyOTg0Iiwic2lkIjoiYzJkYjUwYjUtOGY3Zi00MTU4LWFkMDMtMTJhNWMwMDk5MDEzIn0.1OEqaFWAnVNwrIeGcAZ4MSyz66IePebqFh1Ewp2pVag",
  "access_expires_at": "2026-10-28T10:15:14.863912254Z",
  "refresh_token": "K1ySBCGuVD58ZqUvahEU0AHGnGasz5n712wOoOF1qcM",
  "refresh_expires_at": "2026-10-28T22:00:14.863404248Z",
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
  "session_id": "b2721cc0-c15b-49b8-81cc-78bd47d02783",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MTUsImlhdCI6MTc5MzE4MTYxNSwianRpIjoiNDkwZDA2OTUtMmM2Zi00MjFmLWJiZDUtNGM5N2FmNTEyMmRjIiwic2lkIjoiYjI3MjFjYzAtYzE1Yi00OWI4LTgxY2MtNzhiZDQ3ZDAyNzgzIn0.knXcK5AIKcWjyd0pWfvQbnFdAPEbCkzApfA27nMOaC0",
  "access_expires_at": "2026-10-28T10:15:15.230988883Z",
  "refresh_token": "xE3CzsIsXAJvQrus-vubbdtGsmZk4y18l5L_ZZPb5tI",
  "refresh_expires_at": "2026-10-28T22:00:15.230633358Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681566129",
  "device_ref": "sandbox-10519"
}
```

```json
{
  "challenge_id": "8fcd3846-9735-47fb-b6a0-d3b3b2491ec0",
  "expires_at": "2026-10-28T10:05:15.379034671Z",
  "resend_available_at": "2026-10-28T10:00:16.379034671Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681566129` → **200**

```json
{
  "phone": "+380681566129",
  "audience": "CLIENT",
  "code": "655686",
  "sent_at": "2026-10-28T10:00:15.381254526Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fcd3846-9735-47fb-b6a0-d3b3b2491ec0",
  "code": "655686",
  "device_ref": "sandbox-10519"
}
```

```json
{
  "session_id": "43d9bb46-7411-410f-af91-57c4e03538cb",
  "subject": {
    "type": "CLIENT",
    "id": "1e33f48e-ab99-437d-8609-f347ea6586da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTMzZjQ4ZS1hYjk5LTQzN2QtODYwOS1mMzQ3ZWE2NTg2ZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTE1LCJpYXQiOjE3OTMxODE2MTUsImp0aSI6ImI4ZDgxOGY1LWY0OWMtNDBjYi1iMzdmLWY4ZTA4ZDAxNjFlOCIsInNpZCI6IjQzZDliYjQ2LTc0MTEtNDEwZi1hZjkxLTU3YzRlMDM1MzhjYiJ9.qYoVXjXeeNUBcUq4G8FfNSTckbqY-9HjeR1_3bv1B54",
  "access_expires_at": "2026-10-28T10:15:15.558550432Z",
  "refresh_token": "2nEj3bJ8UYH8Blu7CK1RpAyjbS7e6sVYAs7uJ5uiXJI",
  "refresh_expires_at": "2026-11-27T10:00:15.558128847Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "165395c7-5932-4836-a24a-89a7de871522",
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
  "id": "ea718514-e8e8-44b7-b1a0-6096febb59e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:15.724922Z",
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
  "command_id": "a71ed7ef-65f1-4c84-9e6c-b6fe208352b4",
  "quote_id": "ea718514-e8e8-44b7-b1a0-6096febb59e1",
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
  "id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1e33f48e-ab99-437d-8609-f347ea6586da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:00:15.903144Z",
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
    "id": "94a234f7-c1f8-4595-92fe-591dc8378fc2",
    "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
    "expires_at": "2026-10-28T10:00:30.90563Z",
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

`POST /api/driver/v1/offers/94a234f7-c1f8-4595-92fe-591dc8378fc2/reject` → **204**

```json
{
  "command_id": "06c5c20e-f171-4463-a094-3a0f60c9895c"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1e97d6b4-04df-4909-b437-e93bda11dcd2",
    "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
    "expires_at": "2026-10-28T10:00:31.230964Z",
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

`POST /api/driver/v1/offers/1e97d6b4-04df-4909-b437-e93bda11dcd2/accept` → **200**

```json
{
  "command_id": "5e3cd2da-1971-49b0-b97a-84e9c3593f3a"
}
```

```json
{
  "id": "5286483e-d6ab-4dc7-be2e-8043bf4ea87f",
  "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1bbbfa43-82c5-4296-9000-ec8580eecfa0",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/79f19c01-f842-4e4b-a372-d41aaab75cf6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:00:15.903652Z",
      "actor": {
        "type": "CLIENT",
        "id": "1e33f48e-ab99-437d-8609-f347ea6586da",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
        "quote_id": "ea718514-e8e8-44b7-b1a0-6096febb59e1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "33a1db58-7a88-4885-9416-22335cb3b1b6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:00:15.905034Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
        "attempt_id": "5265ca8e-a685-4b36-81fb-aa74237721c9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "33a1db58-7a88-4885-9416-22335cb3b1b6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:00:15.909702Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "94a234f7-c1f8-4595-92fe-591dc8378fc2",
        "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "33a1db58-7a88-4885-9416-22335cb3b1b6"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:00:16.230138Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "94a234f7-c1f8-4595-92fe-591dc8378fc2",
        "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6"
      },
      "correlation_id": "34fdb2fa-a192-412c-a130-205c1fc83c50"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 79f19c01-f842-4e4b-a372-d41aaab75cf6 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/79f19c01-f842-4e4b-a372-d41aaab75cf6` → **200**

```json
{
  "id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1e33f48e-ab99-437d-8609-f347ea6586da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5286483e-d6ab-4dc7-be2e-8043bf4ea87f",
    "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1bbbfa43-82c5-4296-9000-ec8580eecfa0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:00:15.903144Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/79f19c01-f842-4e4b-a372-d41aaab75cf6/cancel` → **200**

```json
{
  "command_id": "811e6e2f-edef-4549-9b31-f1ce4d3ed39e",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1e33f48e-ab99-437d-8609-f347ea6586da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5286483e-d6ab-4dc7-be2e-8043bf4ea87f",
    "order_id": "79f19c01-f842-4e4b-a372-d41aaab75cf6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1bbbfa43-82c5-4296-9000-ec8580eecfa0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:00:15.903144Z",
  "caller": null,
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e57e076a-3cce-4546-b2a3-c4cb1488262b",
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
  "last_heartbeat_at": "2026-10-28T10:00:13.667191Z",
  "last_location_at": "2026-10-28T10:00:13.667191Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e57e076a-3cce-4546-b2a3-c4cb1488262b/close` → **200**

```json
{
  "command_id": "5431b974-7f74-4d18-a83a-ffc95328f9cb",
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
  "session_id": "404236b1-e40d-4f24-ba7a-9bae21c456cb",
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
  "last_heartbeat_at": "2026-10-28T10:00:14.500811Z",
  "last_location_at": "2026-10-28T10:00:14.500811Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/404236b1-e40d-4f24-ba7a-9bae21c456cb/close` → **200**

```json
{
  "command_id": "4367fd98-29c2-4d61-90f8-46e55c55963c",
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
  "device_ref": "sandbox-28596"
}
```

```json
{
  "challenge_id": "04be72a7-c992-4786-b6e4-0515ef59b65c",
  "expires_at": "2026-10-28T10:05:17.931714188Z",
  "resend_available_at": "2026-10-28T10:00:18.931714188Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "920103",
  "sent_at": "2026-10-28T10:00:17.933543424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04be72a7-c992-4786-b6e4-0515ef59b65c",
  "code": "920103",
  "device_ref": "sandbox-28596"
}
```

```json
{
  "session_id": "19cb3bb7-fbb0-4df3-9283-fe5e558da954",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjUxOCwiaWF0IjoxNzkzMTgxNjE4LCJqdGkiOiI0ZTM5OTg2OC1lZThiLTQ3MmUtOTllMC05ZDlkZTZiYzEzNDkiLCJzaWQiOiIxOWNiM2JiNy1mYmIwLTRkZjMtOTI4My1mZTVlNTU4ZGE5NTQifQ.qb6dE8GKtQpP4JQ4zvaApnS2iFaq71v7EO5UCMTc9M8",
  "access_expires_at": "2026-10-28T10:15:18.104558772Z",
  "refresh_token": "vM0jW28EqkSeZqGc9fkJ016ntF9Qb_z8pmrA8uRxfqw",
  "refresh_expires_at": "2026-11-27T10:00:18.10415884Z",
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
  "command_id": "77ec631f-925d-41e4-b6fb-dcb45832e590",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:18Z",
    "sequence": 1793181618394
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:18.409917Z",
  "last_location_at": "2026-10-28T10:00:18.409917Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677587539",
  "device_ref": "sandbox-15376"
}
```

```json
{
  "challenge_id": "916fd49c-fb1c-41ad-8e37-1e8df636751e",
  "expires_at": "2026-10-28T10:05:18.562271369Z",
  "resend_available_at": "2026-10-28T10:00:19.562271369Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677587539` → **200**

```json
{
  "phone": "+380677587539",
  "audience": "CLIENT",
  "code": "416048",
  "sent_at": "2026-10-28T10:00:18.563885729Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "916fd49c-fb1c-41ad-8e37-1e8df636751e",
  "code": "416048",
  "device_ref": "sandbox-15376"
}
```

```json
{
  "session_id": "aee12176-033b-4530-8c9b-33121ec0c4de",
  "subject": {
    "type": "CLIENT",
    "id": "ac8e9664-0ef6-48ee-a6b7-b47856ac4f10"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzhlOTY2NC0wZWY2LTQ4ZWUtYTZiNy1iNDc4NTZhYzRmMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTE4LCJpYXQiOjE3OTMxODE2MTgsImp0aSI6IjM1YWNmNjY5LTk2ZGMtNDhmNC1iNDFjLTJkNTQwOWY0ZjYxNiIsInNpZCI6ImFlZTEyMTc2LTAzM2ItNDUzMC04YzliLTMzMTIxZWMwYzRkZSJ9.YHT-gvF2zBFfQ6ttxVJR_jfAw0rzvydNA9ZYmopcxbQ",
  "access_expires_at": "2026-10-28T10:15:18.736265265Z",
  "refresh_token": "FWPe0v3Xhslef1K3alSXV8yvSL7miMY5CVe79XG20HY",
  "refresh_expires_at": "2026-11-27T10:00:18.73583619Z",
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
  "command_id": "d29ffb5a-b3ef-405f-9386-bbc4533077a1",
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
  "id": "0af60f75-95d9-4e04-974b-dfafa0c4e197",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:19.046402Z",
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
  "command_id": "94d3d97f-2186-462c-a2a3-4875d9600d61",
  "platform": "ANDROID",
  "token": "sandbox-driver-b53007ad-df36-47da-920d-128a04fc0053"
}
```

```json
{
  "id": "cd998751-ec68-411e-8583-03a42f8bab7c",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:00:19.209793Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "c16779cd-ce3b-497b-bbb5-569b77c97130",
  "platform": "ANDROID",
  "token": "sandbox-rider-39996e7d-5327-4441-b96f-d7d95a523bb9"
}
```

```json
{
  "id": "10d79c2a-befa-4b0a-b3b5-7424805d062d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:00:19.36147Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "56a5c5b7-83c9-4096-abc8-9cffc88a9ce5",
  "quote_id": "0af60f75-95d9-4e04-974b-dfafa0c4e197",
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
  "id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ac8e9664-0ef6-48ee-a6b7-b47856ac4f10",
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
  "created_at": "2026-10-28T10:00:19.520714Z",
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
    "id": "f46241c1-3cba-4fa4-bab9-9e6191b966ed",
    "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
    "expires_at": "2026-10-28T10:00:34.5235Z",
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

`POST /api/driver/v1/offers/f46241c1-3cba-4fa4-bab9-9e6191b966ed/accept` → **200**

```json
{
  "command_id": "57292e22-b2e4-4a30-99bc-4e9337fa0ef9"
}
```

```json
{
  "id": "2da5a22a-227d-4c5b-868f-f776f44aabe6",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fac76c27-3753-4daa-b2e7-650d58389660",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:00:19.499Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:00:19.499Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:00:20.557600856Z",
    "token_suffix": "fc0053",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
      "order_version": "2",
      "event_id": "26b67661-1e2d-4906-b93f-ba960bcc4e1e",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677587539&after=2026-10-28T10:00:19.499Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:00:20.555805023Z",
    "token_suffix": "523bb9",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
      "order_version": "3",
      "event_id": "e6e74dea-4a77-4d1a-a1b5-6925afa6355c",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a3aae673-4433-4db7-8c20-ef1c74387542/messages` → **201**

```json
{
  "command_id": "9e8926a8-5e4b-4533-bca7-19801a0466c2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "6deae1f8-3250-4094-9020-75da07cfaaf4",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:00:21.064263015Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fac76c27-3753-4daa-b2e7-650d58389660",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "assignment_id": "2da5a22a-227d-4c5b-868f-f776f44aabe6",
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

`POST /api/driver/v1/trips/fac76c27-3753-4daa-b2e7-650d58389660/messages` → **201**

```json
{
  "command_id": "b07f6b83-5ca7-48aa-8037-1a892e8f2fc4",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "21bfc996-ebc3-48e1-8b23-2df4a1d375a2",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:00:21.360277429Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a3aae673-4433-4db7-8c20-ef1c74387542/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/fac76c27-3753-4daa-b2e7-650d58389660/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677587539"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:21Z",
    "sequence": 1793181621794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:21.813871Z",
  "last_location_at": "2026-10-28T10:00:21.813871Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fac76c27-3753-4daa-b2e7-650d58389660",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "assignment_id": "2da5a22a-227d-4c5b-868f-f776f44aabe6",
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

`POST /api/driver/v1/trips/fac76c27-3753-4daa-b2e7-650d58389660/arrive` → **200**

```json
{
  "command_id": "4c286405-24f7-4479-aeef-73ece6bc220c",
  "expected_version": 0
}
```

```json
{
  "id": "fac76c27-3753-4daa-b2e7-650d58389660",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "assignment_id": "2da5a22a-227d-4c5b-868f-f776f44aabe6",
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
  "arrived_at": "2026-10-28T10:00:22.100967Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fac76c27-3753-4daa-b2e7-650d58389660/start` → **200**

```json
{
  "command_id": "353473d5-c389-4725-8412-cd60b7fb1504",
  "expected_version": 1
}
```

```json
{
  "id": "fac76c27-3753-4daa-b2e7-650d58389660",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "assignment_id": "2da5a22a-227d-4c5b-868f-f776f44aabe6",
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
  "arrived_at": "2026-10-28T10:00:22.100967Z",
  "started_at": "2026-10-28T10:00:22.254001Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:22Z",
    "sequence": 1793181622396
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:22.412901Z",
  "last_location_at": "2026-10-28T10:00:22.412901Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/fac76c27-3753-4daa-b2e7-650d58389660/complete` → **200**

```json
{
  "command_id": "9c413617-99bf-4e89-bcbe-ea43fc4f83a1",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:00:22Z",
  "cash_received": true
}
```

```json
{
  "id": "fac76c27-3753-4daa-b2e7-650d58389660",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "assignment_id": "2da5a22a-227d-4c5b-868f-f776f44aabe6",
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
  "arrived_at": "2026-10-28T10:00:22.100967Z",
  "started_at": "2026-10-28T10:00:22.254001Z",
  "completed_at": "2026-10-28T10:00:22.572053Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a3aae673-4433-4db7-8c20-ef1c74387542` → **200**

```json
{
  "id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ac8e9664-0ef6-48ee-a6b7-b47856ac4f10",
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
    "id": "2da5a22a-227d-4c5b-868f-f776f44aabe6",
    "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fac76c27-3753-4daa-b2e7-650d58389660",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:00:19.520714Z",
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
    "id": "a3aae673-4433-4db7-8c20-ef1c74387542",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:00:19.520714Z",
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
    "id": "fac76c27-3753-4daa-b2e7-650d58389660",
    "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:00:19.830546Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "c822fbe6-0cbf-4da3-97f1-7a669d3b6088",
    "order_id": "730d2dad-f841-45d1-9b71-839959a90027",
    "order_short_number": 1,
    "created_at": "2026-10-28T09:59:20.66064Z",
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

`GET /api/rider/v1/orders/a3aae673-4433-4db7-8c20-ef1c74387542/tip` → **200**

```json
{
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
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
  "available_until": "2026-10-29T10:00:22.572053Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a3aae673-4433-4db7-8c20-ef1c74387542/tip` → **201**

```json
{
  "command_id": "cef596fd-9b53-4d74-a3be-7c8288312668",
  "amount_minor": 1100
}
```

```json
{
  "id": "b36a6aec-a34c-4cad-a186-62045a47d05c",
  "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:00:26.681773Z"
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
  "session_id": "081da27c-6508-4a56-ab4d-d5b5c9d95e4c",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MjcsImlhdCI6MTc5MzE4MTYyNywianRpIjoiNzc0YzFhNjItNTBmOS00ODVjLWJiZDQtNThjNDczOWVhMWJhIiwic2lkIjoiMDgxZGEyN2MtNjUwOC00YTU2LWFiNGQtZDViNWM5ZDk1ZTRjIn0.rrOAbry3DEt0Ik2CXhLgpprIgTPDTWa92x1HZZyFliE",
  "access_expires_at": "2026-10-28T10:15:27.052093008Z",
  "refresh_token": "VZkU-pjbGDRTZibjUGJ0OUuXgLVh2SDnNyRdRl4Ux4M",
  "refresh_expires_at": "2026-10-28T22:00:27.05172909Z",
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
        "created": 7,
        "fulfilled": 3,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 7
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 6
        },
        "cancelled_by": {
          "STAFF": 1,
          "RIDER": 2,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 7,
    "fulfilled": 3,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 7
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 6
    },
    "cancelled_by": {
      "STAFF": 1,
      "RIDER": 2,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 1
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
  "generated_at": "2026-10-28T10:00:27.207179135Z"
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
  "generated_at": "2026-10-28T10:00:27.389824918Z"
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
  "session_id": "5e86a9ad-60bb-428f-be8a-3e7c5d716343",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MjcsImlhdCI6MTc5MzE4MTYyNywianRpIjoiNGQ5MTA4MDYtOTJjZi00OWMzLWE5ZjAtYjc1MDIwY2QxNDU4Iiwic2lkIjoiNWU4NmE5YWQtNjBiYi00MjhmLWJlOGEtM2U3YzVkNzE2MzQzIn0.q2NM_Q1fq5NdpGPtuHh1RhMwvgeSJVQnuXuijMNqfk0",
  "access_expires_at": "2026-10-28T10:15:27.754163938Z",
  "refresh_token": "jskCXrLnC9TuAJ3UiD4bJTdgpyYTKyrOsE-pPKNuGis",
  "refresh_expires_at": "2026-10-28T22:00:27.753725839Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a3aae673-4433-4db7-8c20-ef1c74387542/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:00:19.521305Z",
      "actor": {
        "type": "CLIENT",
        "id": "ac8e9664-0ef6-48ee-a6b7-b47856ac4f10",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
        "quote_id": "0af60f75-95d9-4e04-974b-dfafa0c4e197",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "32cf9b61-ae55-44c4-a5e6-3bc273cd731a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:00:19.522867Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
        "attempt_id": "ccca089b-987a-44fd-b932-7c52c26977ae",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "32cf9b61-ae55-44c4-a5e6-3bc273cd731a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:00:19.527391Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f46241c1-3cba-4fa4-bab9-9e6191b966ed",
        "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "32cf9b61-ae55-44c4-a5e6-3bc273cd731a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:00:19.831747Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f46241c1-3cba-4fa4-bab9-9e6191b966ed",
        "order_id": "a3aae673-4433-4db7-8c20-ef1c74387542",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "2da5a22a-227d-4c5b-868f-f776f44aabe6"
      },
      "correlation_id": "80f6ca25-4a90-4062-9f7c-a9a1e5caa6ac"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:00:28.050953371Z",
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
      "last_location_at": "2026-10-28T10:00:22.412901Z",
      "order_id": null
    }
  ]
}
```

Done: order a3aae673-4433-4db7-8c20-ef1c74387542.

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
  "session_id": "0395954f-5e9e-44a4-90f5-e91a33213ee8",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MjgsImlhdCI6MTc5MzE4MTYyOCwianRpIjoiMmMyZWU5N2EtYjJhNy00MjQzLTkzNmItYmFmNGZhMWE5ZTRjIiwic2lkIjoiMDM5NTk1NGYtNWU5ZS00NGE0LTkwZjUtZTkxYTMzMjEzZWU4In0.fP_LfopS2f8ZMYVMDZS8gLCosPbEg6i4IvxBDZeq0RA",
  "access_expires_at": "2026-10-28T10:15:28.425529121Z",
  "refresh_token": "UgMVdzcE0rN7JEYZDoUI6Ftj9JBnDdX0JP5KNYw5zxk",
  "refresh_expires_at": "2026-10-28T22:00:28.425082228Z",
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
  "command_id": "62dff5ec-9b45-49f2-bd79-b68878ad7b26",
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
  "timestamp": "2026-10-28T10:00:28.000+0000",
  "channel": {
    "id": "1730052000.2814932647",
    "linkedid": "1730052000.2814932647",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679167273"
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
  "timestamp": "2026-10-28T10:00:28.000+0000",
  "channel": {
    "id": "1730052000.2814932647",
    "linkedid": "1730052000.2814932647",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679167273"
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
  "session_id": "cd461c0c-8988-4b6d-bd63-5adf048259ee",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MjksImlhdCI6MTc5MzE4MTYyOSwianRpIjoiNjg3ZDMwNWMtNzU0ZC00ZDViLWJlMTEtZjhmZWViYTE3NjViIiwic2lkIjoiY2Q0NjFjMGMtODk4OC00YjZkLWJkNjMtNWFkZjA0ODI1OWVlIn0.TyVVaeR-mPalDwf5BP9K-nQw1QdREd9z10ThUnoB17Y",
  "access_expires_at": "2026-10-28T10:15:29.139895346Z",
  "refresh_token": "Ecj0UjmSrPNllnvhoyJj4uqjcvgbv2pIvpFRrRaNdKU",
  "refresh_expires_at": "2026-10-28T22:00:29.13948926Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "f9d625b3-bc06-4c98-83fb-ee5672fb3673",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679167273",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:00:28Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/f9d625b3-bc06-4c98-83fb-ee5672fb3673/answer` → **200**

```json
{
  "command_id": "b45132e1-caee-4e39-8966-e22bef677298"
}
```

```json
{
  "id": "f9d625b3-bc06-4c98-83fb-ee5672fb3673",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679167273",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "order_ids": [],
  "started_at": "2026-10-28T10:00:28Z",
  "answered_at": "2026-10-28T10:00:29.445599Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2814932647",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9737d021-4dd3-4fda-8040-f5138ac02cb4",
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
  "id": "c55dbc90-ab84-4eca-974b-68499d49a13e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:29.620502Z",
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
  "command_id": "2fc67e23-dbd9-491f-8061-6b9ef9b9bbeb",
  "quote_id": "c55dbc90-ab84-4eca-974b-68499d49a13e",
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
    "phone": "+380679167273"
  },
  "call_id": "f9d625b3-bc06-4c98-83fb-ee5672fb3673"
}
```

```json
{
  "id": "a23ede17-62bf-4ff2-8aaa-1cf033741247",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:00:29.789393Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679167273"
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
    "id": "1730052000.2814932647",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f9d625b3-bc06-4c98-83fb-ee5672fb3673",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679167273",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [
        "a23ede17-62bf-4ff2-8aaa-1cf033741247"
      ],
      "started_at": "2026-10-28T10:00:28Z",
      "answered_at": "2026-10-28T10:00:29.445599Z",
      "ended_at": "2026-10-28T10:00:29.955964Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "9c43fbda-4725-4a2d-bc43-d2e346e8d471",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670123939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [],
      "started_at": "2026-10-28T09:59:26.581784Z",
      "answered_at": "2026-10-28T09:59:26.775425Z",
      "ended_at": "2026-10-28T09:59:26.952312Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:59:30.352103Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/a23ede17-62bf-4ff2-8aaa-1cf033741247` → **200**

```json
{
  "id": "a23ede17-62bf-4ff2-8aaa-1cf033741247",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:00:29.789393Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679167273"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/a23ede17-62bf-4ff2-8aaa-1cf033741247` → **200**

```json
{
  "id": "a23ede17-62bf-4ff2-8aaa-1cf033741247",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:00:29.789393Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679167273"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a23ede17-62bf-4ff2-8aaa-1cf033741247/cancel` → **200**

```json
{
  "command_id": "3835283e-fbc6-41e0-969d-93ebd99fb011",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a23ede17-62bf-4ff2-8aaa-1cf033741247",
  "short_number": 8,
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
  "created_at": "2026-10-28T10:00:29.789393Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679167273"
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

Done: call f9d625b3-bc06-4c98-83fb-ee5672fb3673 with order a23ede17-62bf-4ff2-8aaa-1cf033741247.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5710"
}
```

```json
{
  "challenge_id": "467f0444-ca6a-4b2e-93e5-aac302db7217",
  "expires_at": "2026-10-28T10:05:30.628362213Z",
  "resend_available_at": "2026-10-28T10:00:31.628362213Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "572717",
  "sent_at": "2026-10-28T10:00:30.63021718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "467f0444-ca6a-4b2e-93e5-aac302db7217",
  "code": "572717",
  "device_ref": "sandbox-5710"
}
```

```json
{
  "session_id": "aa5d17bf-3631-445a-8cfe-52291a563a9e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjUzMCwiaWF0IjoxNzkzMTgxNjMwLCJqdGkiOiJjMTkyY2M5Yy00MTFiLTRlYTQtYTIwYS1jMmVlNTE1MzNkNTEiLCJzaWQiOiJhYTVkMTdiZi0zNjMxLTQ0NWEtOGNmZS01MjI5MWE1NjNhOWUifQ.yUJS9YH7d21MYD2ToTg31h7Qs9sn0Lk7kUga3k0V0hY",
  "access_expires_at": "2026-10-28T10:15:30.808125134Z",
  "refresh_token": "5LWX6RS8sUPdVS2-uubl8ySS99jmwPXP3m_kSVsekS8",
  "refresh_expires_at": "2026-11-27T10:00:30.807719954Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:22.412901Z",
  "last_location_at": "2026-10-28T10:00:22.412901Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/handover` → **200**

```json
{
  "command_id": "d18fc403-2865-43ef-9861-4fc9baa51851",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:22.412901Z",
  "last_location_at": "2026-10-28T10:00:22.412901Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:31Z",
    "sequence": 1793181631276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:31.292344Z",
  "last_location_at": "2026-10-28T10:00:31.292344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665103031",
  "device_ref": "sandbox-5712"
}
```

```json
{
  "challenge_id": "bdb07f2e-bf48-4457-994d-01bfeb937a24",
  "expires_at": "2026-10-28T10:05:31.439380761Z",
  "resend_available_at": "2026-10-28T10:00:32.439380761Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665103031` → **200**

```json
{
  "phone": "+380665103031",
  "audience": "CLIENT",
  "code": "802271",
  "sent_at": "2026-10-28T10:00:31.441156985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdb07f2e-bf48-4457-994d-01bfeb937a24",
  "code": "802271",
  "device_ref": "sandbox-5712"
}
```

```json
{
  "session_id": "32c289ff-f61a-4ce1-bf47-b9dcfecabf8f",
  "subject": {
    "type": "CLIENT",
    "id": "405b3bfe-8ba7-442d-b9a0-07d7796cbcc3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDViM2JmZS04YmE3LTQ0MmQtYjlhMC0wN2Q3Nzk2Y2JjYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTMxLCJpYXQiOjE3OTMxODE2MzEsImp0aSI6IjNjYzE3N2E1LTk5ZGUtNGExNy04MWQyLTk1ODU2NGE1OWU1MSIsInNpZCI6IjMyYzI4OWZmLWY2MWEtNGNlMS1iZjQ3LWI5ZGNmZWNhYmY4ZiJ9.yvkG-wHkgNvLEaPpwvcfDzPMsWrRyOy3Q_B4Lsm0ku0",
  "access_expires_at": "2026-10-28T10:15:31.614739677Z",
  "refresh_token": "ApsnscHVvqn-vPLvbz-NhfKQ9w6N0IkRL4kcyFM8Jb8",
  "refresh_expires_at": "2026-11-27T10:00:31.61433325Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a2c99ec-89be-46b3-9f98-ead3a5034e63",
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
  "id": "deecc511-21fb-491b-9288-1fcbb61835a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:31.765117Z",
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
  "command_id": "914ff68c-2482-4282-b86c-90282b688499",
  "quote_id": "deecc511-21fb-491b-9288-1fcbb61835a5",
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
  "id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "405b3bfe-8ba7-442d-b9a0-07d7796cbcc3",
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
  "created_at": "2026-10-28T10:00:31.927626Z",
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
    "id": "d96c801e-b4df-49b7-8206-a66b1a6a7604",
    "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
    "expires_at": "2026-10-28T10:00:46.930083Z",
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

`POST /api/driver/v1/offers/d96c801e-b4df-49b7-8206-a66b1a6a7604/accept` → **200**

```json
{
  "command_id": "754143ef-3413-4465-84d9-6e5e2c383d0b"
}
```

```json
{
  "id": "a9a742c0-1524-4178-abb3-8be828cddc39",
  "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb41cf0d-e339-4ad8-9228-016c3aa76cee",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb41cf0d-e339-4ad8-9228-016c3aa76cee",
  "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
  "assignment_id": "a9a742c0-1524-4178-abb3-8be828cddc39",
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

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:32Z",
    "sequence": 1793181632528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:32.545949Z",
  "last_location_at": "2026-10-28T10:00:32.545949Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fb41cf0d-e339-4ad8-9228-016c3aa76cee/arrive` → **200**

```json
{
  "command_id": "e85ed6dc-a7c1-4107-8e5f-45fd52b09397",
  "expected_version": 0
}
```

```json
{
  "id": "fb41cf0d-e339-4ad8-9228-016c3aa76cee",
  "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
  "assignment_id": "a9a742c0-1524-4178-abb3-8be828cddc39",
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
  "arrived_at": "2026-10-28T10:00:32.704726Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fb41cf0d-e339-4ad8-9228-016c3aa76cee/start` → **200**

```json
{
  "command_id": "a6addefb-a19e-47a8-82a2-2ab77ee9c124",
  "expected_version": 1
}
```

```json
{
  "id": "fb41cf0d-e339-4ad8-9228-016c3aa76cee",
  "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
  "assignment_id": "a9a742c0-1524-4178-abb3-8be828cddc39",
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
  "arrived_at": "2026-10-28T10:00:32.704726Z",
  "started_at": "2026-10-28T10:00:32.861409Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:33Z",
    "sequence": 1793181633123
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:33.02899Z",
  "last_location_at": "2026-10-28T10:00:33.02899Z",
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
  "device_ref": "sandbox-7367"
}
```

```json
{
  "challenge_id": "207b263a-f049-46eb-8166-4c3eecc9cff9",
  "expires_at": "2026-10-28T10:05:33.177639697Z",
  "resend_available_at": "2026-10-28T10:00:34.177639697Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "947152",
  "sent_at": "2026-10-28T10:00:33.179429101Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "207b263a-f049-46eb-8166-4c3eecc9cff9",
  "code": "947152",
  "device_ref": "sandbox-7367"
}
```

```json
{
  "session_id": "44842b3c-fcc3-412d-8d87-ac1dbe41a0a3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjUzMywiaWF0IjoxNzkzMTgxNjMzLCJqdGkiOiJjNGJmY2Q0Yi0zMzU4LTRlZDgtYmU2NS1hMjE1ZWQyNTUwMjYiLCJzaWQiOiI0NDg0MmIzYy1mY2MzLTQxMmQtOGQ4Ny1hYzFkYmU0MWEwYTMifQ.rJDr4AHR2nAKW8Ksb46ia-qQgQ8HoqE1_zi4hEGOnfk",
  "access_expires_at": "2026-10-28T10:15:33.358569591Z",
  "refresh_token": "UG4gRV8FCFhdNVN3IkYm0iNA94418uuTS9lBCrGsGlE",
  "refresh_expires_at": "2026-11-27T10:00:33.358076168Z",
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
  "command_id": "97d42cc1-4714-4b1d-9386-de7a24ba6798",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:33Z",
    "sequence": 1793181633649
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7263897-1882-46f0-bfc0-5eb9ee1bc5d5",
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
  "last_heartbeat_at": "2026-10-28T10:00:33.66612Z",
  "last_location_at": "2026-10-28T10:00:33.66612Z",
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
  "session_id": "9a3a0d25-6983-4dbf-91ca-1ef9942b37e8",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MzQsImlhdCI6MTc5MzE4MTYzNCwianRpIjoiMWQ3MjVlNjItYTMwMS00YTlmLWIwYmYtNDk1YzY5MWJhMGQwIiwic2lkIjoiOWEzYTBkMjUtNjk4My00ZGJmLTkxY2EtMWVmOTk0MmIzN2U4In0.SJxJfjtgFn-XLM3GpEbCXaa5O9RNLfjpeC2jStZ4sd4",
  "access_expires_at": "2026-10-28T10:15:34.022877211Z",
  "refresh_token": "cZY2GQGx9QmsoBB4_Ivyp8hxQKvs0fIx17FlbWlVoaU",
  "refresh_expires_at": "2026-10-28T22:00:34.022409071Z",
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
  "session_id": "526d3035-3a19-4d06-89fa-e4111f0ed2c9",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MzQsImlhdCI6MTc5MzE4MTYzNCwianRpIjoiMjFmMDVkMjItOGQ4OS00NWYzLTkwYjktNzc0ZjIwZmE2ZTk1Iiwic2lkIjoiNTI2ZDMwMzUtM2ExOS00ZDA2LTg5ZmEtZTQxMTFmMGVkMmM5In0.LQvjgO4bvaCOoLwj7xqVPde5lVAJz3-j_bpXsbyvujU",
  "access_expires_at": "2026-10-28T10:15:34.396841101Z",
  "refresh_token": "EOVROhThpRZB8ehhO0BqVdEf52fWZbrKZWWHMZYsEOM",
  "refresh_expires_at": "2026-10-28T22:00:34.396456082Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5726bca5-1a14-45dc-9f53-6a16c03af223` → **200**

```json
{
  "id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "405b3bfe-8ba7-442d-b9a0-07d7796cbcc3",
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
    "id": "a9a742c0-1524-4178-abb3-8be828cddc39",
    "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "fb41cf0d-e339-4ad8-9228-016c3aa76cee",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T10:00:31.927626Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5726bca5-1a14-45dc-9f53-6a16c03af223/interrupt` → **200**

```json
{
  "command_id": "37a61272-54bd-48c7-af0b-9803e9025967",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "405b3bfe-8ba7-442d-b9a0-07d7796cbcc3",
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
      "id": "a9a742c0-1524-4178-abb3-8be828cddc39",
      "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "fb41cf0d-e339-4ad8-9228-016c3aa76cee",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T10:00:31.927626Z",
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
    "id": "4e279271-8a9c-4294-8756-4a21bf513d13",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "405b3bfe-8ba7-442d-b9a0-07d7796cbcc3",
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
    "id": "482301d1-ddc3-4591-a99f-ed7dad69f470",
    "order_id": "4e279271-8a9c-4294-8756-4a21bf513d13",
    "expires_at": "2026-10-28T10:00:49.716619Z",
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

`POST /api/driver/v1/offers/482301d1-ddc3-4591-a99f-ed7dad69f470/accept` → **200**

```json
{
  "command_id": "cbe0f266-3b4c-4b39-a6d9-c016eef16cc2"
}
```

```json
{
  "id": "e2202f8c-4468-4209-bd3e-2a3e3f226d0a",
  "order_id": "4e279271-8a9c-4294-8756-4a21bf513d13",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8852b45a-462a-49ae-8304-08f06818b1f3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8852b45a-462a-49ae-8304-08f06818b1f3",
  "order_id": "4e279271-8a9c-4294-8756-4a21bf513d13",
  "assignment_id": "e2202f8c-4468-4209-bd3e-2a3e3f226d0a",
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
  "session_id": "d7263897-1882-46f0-bfc0-5eb9ee1bc5d5",
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
  "last_heartbeat_at": "2026-10-28T10:00:33.66612Z",
  "last_location_at": "2026-10-28T10:00:33.66612Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/d7263897-1882-46f0-bfc0-5eb9ee1bc5d5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:35Z",
    "sequence": 1793181635487
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7263897-1882-46f0-bfc0-5eb9ee1bc5d5",
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
  "last_heartbeat_at": "2026-10-28T10:00:35.503504Z",
  "last_location_at": "2026-10-28T10:00:35.503504Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8852b45a-462a-49ae-8304-08f06818b1f3/arrive` → **200**

```json
{
  "command_id": "004830a4-5cd7-4b17-9d33-0d0b63df52fa",
  "expected_version": 0
}
```

```json
{
  "id": "8852b45a-462a-49ae-8304-08f06818b1f3",
  "order_id": "4e279271-8a9c-4294-8756-4a21bf513d13",
  "assignment_id": "e2202f8c-4468-4209-bd3e-2a3e3f226d0a",
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
  "arrived_at": "2026-10-28T10:00:35.666065Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8852b45a-462a-49ae-8304-08f06818b1f3/start` → **200**

```json
{
  "command_id": "8c69b5dd-0a63-4481-9ccd-97abe9cf31a0",
  "expected_version": 1
}
```

```json
{
  "id": "8852b45a-462a-49ae-8304-08f06818b1f3",
  "order_id": "4e279271-8a9c-4294-8756-4a21bf513d13",
  "assignment_id": "e2202f8c-4468-4209-bd3e-2a3e3f226d0a",
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
  "arrived_at": "2026-10-28T10:00:35.666065Z",
  "started_at": "2026-10-28T10:00:35.827091Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8852b45a-462a-49ae-8304-08f06818b1f3/complete` → **200**

```json
{
  "command_id": "1e743838-f4a7-4e48-a535-e7d4044e011b",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:00:35Z"
}
```

```json
{
  "id": "8852b45a-462a-49ae-8304-08f06818b1f3",
  "order_id": "4e279271-8a9c-4294-8756-4a21bf513d13",
  "assignment_id": "e2202f8c-4468-4209-bd3e-2a3e3f226d0a",
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
  "arrived_at": "2026-10-28T10:00:35.666065Z",
  "started_at": "2026-10-28T10:00:35.827091Z",
  "completed_at": "2026-10-28T10:00:35.989523Z",
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
    "id": "4e279271-8a9c-4294-8756-4a21bf513d13",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:00:34.710555Z",
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
    "id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:00:31.927626Z",
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

`GET /api/operator/v1/orders/5726bca5-1a14-45dc-9f53-6a16c03af223/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:00:31.928Z",
      "actor": {
        "type": "CLIENT",
        "id": "405b3bfe-8ba7-442d-b9a0-07d7796cbcc3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
        "quote_id": "deecc511-21fb-491b-9288-1fcbb61835a5",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "5ea45f87-7703-4813-b6f2-9722bc8bc70d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:00:31.929456Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
        "attempt_id": "28239aa2-12f4-4c7e-a693-b0cfe752bcec",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5ea45f87-7703-4813-b6f2-9722bc8bc70d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:00:31.932108Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d96c801e-b4df-49b7-8206-a66b1a6a7604",
        "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "5ea45f87-7703-4813-b6f2-9722bc8bc70d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:00:32.242421Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d96c801e-b4df-49b7-8206-a66b1a6a7604",
        "order_id": "5726bca5-1a14-45dc-9f53-6a16c03af223",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a9a742c0-1524-4178-abb3-8be828cddc39"
      },
      "correlation_id": "cdd093e0-901c-49be-860f-6be0df86674b"
```

Done: interrupted 5726bca5-1a14-45dc-9f53-6a16c03af223, follow-up 4e279271-8a9c-4294-8756-4a21bf513d13.

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
  "session_id": "0ce027f0-5fdf-47b1-93c7-ccd122715122",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1MzksImlhdCI6MTc5MzE4MTYzOSwianRpIjoiNTczZDdkYTAtOTk3Zi00ODAxLTkwNTEtZGMwZDA5M2NkZTIwIiwic2lkIjoiMGNlMDI3ZjAtNWZkZi00N2IxLTkzYzctY2NkMTIyNzE1MTIyIn0.mYANiyx2wG6qg5qkOtE8pYXXFgz7j0_hzSxaMK-Hikw",
  "access_expires_at": "2026-10-28T10:15:39.832575155Z",
  "refresh_token": "PJ8rA27drbZkf1n4TrP0oW860rwm8OZHmLpbdwLNA_U",
  "refresh_expires_at": "2026-10-28T22:00:39.832154702Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "627de6f2-cbc9-480e-8fb9-34abcfe04478",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:00:39Z"
}
```

```json
{
  "id": "edc46d53-9dab-4601-b14b-ee8c37cbfba7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:00:39Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/edc46d53-9dab-4601-b14b-ee8c37cbfba7/publish` → **200**

```json
{
  "command_id": "b26e62fa-c903-4390-83cb-569559312380",
  "expected_version": 0
}
```

```json
{
  "id": "edc46d53-9dab-4601-b14b-ee8c37cbfba7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:00:40.161169Z",
  "published_at": "2026-10-28T10:00:40.161169Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "edc46d53-9dab-4601-b14b-ee8c37cbfba7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:00:40.161169Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633337151",
  "device_ref": "sandbox-7572"
}
```

```json
{
  "challenge_id": "e19f624d-71e4-43d0-9895-2bc7458d6b14",
  "expires_at": "2026-10-28T10:05:40.459425747Z",
  "resend_available_at": "2026-10-28T10:00:41.459425747Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633337151` → **200**

```json
{
  "phone": "+380633337151",
  "audience": "CLIENT",
  "code": "530703",
  "sent_at": "2026-10-28T10:00:40.461204604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e19f624d-71e4-43d0-9895-2bc7458d6b14",
  "code": "530703",
  "device_ref": "sandbox-7572"
}
```

```json
{
  "session_id": "f9014313-9234-48f2-9602-9616c1591b9f",
  "subject": {
    "type": "CLIENT",
    "id": "5f1f03d7-b9be-4077-ad24-3c076346a82b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjFmMDNkNy1iOWJlLTQwNzctYWQyNC0zYzA3NjM0NmE4MmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTQwLCJpYXQiOjE3OTMxODE2NDAsImp0aSI6IjdmY2U3N2ExLWI1ODQtNDgwYy05MjQ0LTAyNjgzZDdhODA2OCIsInNpZCI6ImY5MDE0MzEzLTkyMzQtNDhmMi05NjAyLTk2MTZjMTU5MWI5ZiJ9.TlKeMkcmZXPs-ZVd-4Skf8ATvcfTdmCEKgI_VcqjJDk",
  "access_expires_at": "2026-10-28T10:15:40.629365942Z",
  "refresh_token": "yh_b5BAvVs5_f9tL3S4L7TVIj2UXb_uOELe34Iaiwvo",
  "refresh_expires_at": "2026-11-27T10:00:40.628980491Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "edc46d53-9dab-4601-b14b-ee8c37cbfba7",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:00:40.161169Z",
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
  "command_id": "458c2df1-6cee-4c03-a7c2-cb145ca25540",
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
  "id": "4428b883-549b-46e8-8398-c46bdd9736fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:40.919459Z",
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
  "command_id": "ec7b6fe0-1955-41d8-8088-aad40385eaa8",
  "quote_id": "4428b883-549b-46e8-8398-c46bdd9736fa",
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
  "correlation_id": "77eda6d8-19b1-40f9-8a39-cdf44e6b1e1b"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "86e796fd-e0d1-47f2-ad49-69778216d5c6",
  "version_id": "edc46d53-9dab-4601-b14b-ee8c37cbfba7",
  "language": "uk"
}
```

```json
{
  "version_id": "edc46d53-9dab-4601-b14b-ee8c37cbfba7",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:00:41.237012Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aad0e448-d820-4c76-8f9c-c8b19631b908",
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
  "id": "e25944db-49b5-4291-9fa3-6a62ed578c47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:41.427346Z",
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
  "command_id": "a3d2d021-6cfa-4f51-af7f-9d2deabbb69f",
  "quote_id": "e25944db-49b5-4291-9fa3-6a62ed578c47",
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
  "id": "fc0aacf3-330f-4b88-b4bb-015346a7437a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f1f03d7-b9be-4077-ad24-3c076346a82b",
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
  "created_at": "2026-10-28T10:00:41.583425Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fc0aacf3-330f-4b88-b4bb-015346a7437a` → **200**

```json
{
  "id": "fc0aacf3-330f-4b88-b4bb-015346a7437a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f1f03d7-b9be-4077-ad24-3c076346a82b",
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
  "created_at": "2026-10-28T10:00:41.583425Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/fc0aacf3-330f-4b88-b4bb-015346a7437a/cancel` → **200**

```json
{
  "command_id": "58558fd2-c8cf-4908-b618-00c7e9698092",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fc0aacf3-330f-4b88-b4bb-015346a7437a",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5f1f03d7-b9be-4077-ad24-3c076346a82b",
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
  "created_at": "2026-10-28T10:00:41.583425Z",
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

`POST /api/admin/v1/legal-documents/edc46d53-9dab-4601-b14b-ee8c37cbfba7` → **409**

```json
{
  "command_id": "d44adcc9-49e1-4154-afaa-40fc8592ef2b",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:00:42Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/edc46d53-9dab-4601-b14b-ee8c37cbfba7",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "73209ba2-b239-41ec-9bef-a3ee9286abfd"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "1fcf308b-9ccd-484b-b65a-ec37f89f4157",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:00:42Z"
}
```

```json
{
  "id": "54e49222-5964-4439-ae49-2014bef4cafd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:00:42Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/54e49222-5964-4439-ae49-2014bef4cafd/publish` → **200**

```json
{
  "command_id": "e2c85d73-78c2-420c-b894-47228b97516b",
  "expected_version": 0
}
```

```json
{
  "id": "54e49222-5964-4439-ae49-2014bef4cafd",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:00:42.369442Z",
  "published_at": "2026-10-28T10:00:42.369442Z",
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
  "device_ref": "sandbox-3952"
}
```

```json
{
  "challenge_id": "aee8c851-349d-49c8-9029-a30b4b30aa52",
  "expires_at": "2026-10-28T10:05:42.522874524Z",
  "resend_available_at": "2026-10-28T10:00:43.522874524Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "989892",
  "sent_at": "2026-10-28T10:00:42.524658189Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aee8c851-349d-49c8-9029-a30b4b30aa52",
  "code": "989892",
  "device_ref": "sandbox-3952"
}
```

```json
{
  "session_id": "da56c6b3-8871-420d-a01a-6a0887cad602",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjU0MiwiaWF0IjoxNzkzMTgxNjQyLCJqdGkiOiI3Y2UyNjkzNi1jODE2LTRmYzQtYTNjNC03M2RkZDU5NzkwOTYiLCJzaWQiOiJkYTU2YzZiMy04ODcxLTQyMGQtYTAxYS02YTA4ODdjYWQ2MDIifQ.3r-DM56li9X0tz2gct0zlAFsLvx_cndxYT5k3xpB28k",
  "access_expires_at": "2026-10-28T10:15:42.692290871Z",
  "refresh_token": "0WaW5ukvE4NcKcnbcllD6gGNurjL1PBXc73j2rEEiGg",
  "refresh_expires_at": "2026-11-27T10:00:42.691882376Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7263897-1882-46f0-bfc0-5eb9ee1bc5d5",
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
  "last_heartbeat_at": "2026-10-28T10:00:35.503504Z",
  "last_location_at": "2026-10-28T10:00:35.503504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7263897-1882-46f0-bfc0-5eb9ee1bc5d5/handover` → **200**

```json
{
  "command_id": "0d4614d9-f538-4fb6-9d0b-4c122ac1804e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7263897-1882-46f0-bfc0-5eb9ee1bc5d5",
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
  "last_heartbeat_at": "2026-10-28T10:00:35.503504Z",
  "last_location_at": "2026-10-28T10:00:35.503504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7263897-1882-46f0-bfc0-5eb9ee1bc5d5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:43Z",
    "sequence": 1793181643134
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d7263897-1882-46f0-bfc0-5eb9ee1bc5d5",
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
  "last_heartbeat_at": "2026-10-28T10:00:43.150849Z",
  "last_location_at": "2026-10-28T10:00:43.150849Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676683630",
  "device_ref": "sandbox-10538"
}
```

```json
{
  "challenge_id": "c7f7973a-6b46-42dc-9c03-69b9aa0f9c65",
  "expires_at": "2026-10-28T10:05:43.296796566Z",
  "resend_available_at": "2026-10-28T10:00:44.296796566Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676683630` → **200**

```json
{
  "phone": "+380676683630",
  "audience": "CLIENT",
  "code": "769375",
  "sent_at": "2026-10-28T10:00:43.300721017Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7f7973a-6b46-42dc-9c03-69b9aa0f9c65",
  "code": "769375",
  "device_ref": "sandbox-10538"
}
```

```json
{
  "session_id": "e02e4b6f-6a9b-4d76-960a-f89f97dd5c86",
  "subject": {
    "type": "CLIENT",
    "id": "1ef6e90c-d798-4f53-b4c6-622d1adec866"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZWY2ZTkwYy1kNzk4LTRmNTMtYjRjNi02MjJkMWFkZWM4NjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTQzLCJpYXQiOjE3OTMxODE2NDMsImp0aSI6ImYzMDk2YjM3LTJlMmMtNDc1Mi1hYWM1LWEwMTZkZTFlOGMwNiIsInNpZCI6ImUwMmU0YjZmLTZhOWItNGQ3Ni05NjBhLWY4OWY5N2RkNWM4NiJ9.uhj90rALpK0phLc3ZwoB0WsAq8uitZxRtNYixcHXrpU",
  "access_expires_at": "2026-10-28T10:15:43.474120384Z",
  "refresh_token": "QmikrskTZlvu7amt6cobDnnGMJtRKHzEaxPoT9uSJD0",
  "refresh_expires_at": "2026-11-27T10:00:43.473755059Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f88d559f-759c-405f-9690-3617eef26862",
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
  "id": "ab71775a-1f99-4b81-ad03-df8c7e38e182",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:43.644221Z",
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
  "command_id": "5fa551bf-6e49-43aa-ac01-71bd3411de66",
  "quote_id": "ab71775a-1f99-4b81-ad03-df8c7e38e182",
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
    "phone": "+380676765408"
  }
}
```

```json
{
  "id": "62daff22-e7d9-4b4d-b0be-f8ace57f263e",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ef6e90c-d798-4f53-b4c6-622d1adec866",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:00:43.806849Z",
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
    "id": "90e4443d-916c-477a-8100-4b40eeb18e40",
    "order_id": "62daff22-e7d9-4b4d-b0be-f8ace57f263e",
    "expires_at": "2026-10-28T10:00:58.809264Z",
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

`POST /api/driver/v1/offers/90e4443d-916c-477a-8100-4b40eeb18e40/accept` → **200**

```json
{
  "command_id": "a3f33c15-ae73-4642-83d1-0835509d48b3"
}
```

```json
{
  "id": "2bb8ad28-6f26-4dbd-aa71-c52bd9b51c56",
  "order_id": "62daff22-e7d9-4b4d-b0be-f8ace57f263e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "21bad8fe-9a1d-48af-a8fa-1d140048254f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "21bad8fe-9a1d-48af-a8fa-1d140048254f",
  "order_id": "62daff22-e7d9-4b4d-b0be-f8ace57f263e",
  "assignment_id": "2bb8ad28-6f26-4dbd-aa71-c52bd9b51c56",
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
    "phone": "+380676765408"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2eb66db3-6355-48ac-adb8-8f5ab3676af9",
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
  "id": "efe31011-4039-4fb4-8b07-233f7c1107bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:44.467497Z",
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
  "command_id": "2737a39e-e99f-4f2b-a979-6c9d82fb1010",
  "quote_id": "efe31011-4039-4fb4-8b07-233f7c1107bf",
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
  "id": "e2862607-154b-4c53-b4f1-94919a8f8801",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ef6e90c-d798-4f53-b4c6-622d1adec866",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:00:44.62388Z",
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
  "command_id": "ef9a09b6-ed81-4b04-965d-d75b0977f447",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:00:44Z"
}
```

```json
{
  "id": "a177f1da-c136-4e5a-ab32-04ddb2f87ec5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:44.786844Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:00:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "84946828-6441-4047-b809-b0089c154206",
  "quote_id": "a177f1da-c136-4e5a-ab32-04ddb2f87ec5",
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
  "pickup_at": "2026-10-28T13:00:44Z"
}
```

```json
{
  "id": "cf6fda25-15e8-4502-b03d-bbf2bbf67798",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1ef6e90c-d798-4f53-b4c6-622d1adec866",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:00:44.942541Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:00:44Z",
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
  "command_id": "352257dd-ed78-405d-aab1-e17477f95fc0",
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
  "id": "00a16e2d-2691-4e97-9232-13be7698ec7f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:45.100945Z",
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
  "command_id": "77010ec2-8746-4cde-b2f0-00f044d46d05",
  "quote_id": "00a16e2d-2691-4e97-9232-13be7698ec7f",
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
  "correlation_id": "c596b22a-47ba-4089-beb3-2bae88e87390"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "cf6fda25-15e8-4502-b03d-bbf2bbf67798",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "1ef6e90c-d798-4f53-b4c6-622d1adec866",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T10:00:44.942541Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:00:44Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "e2862607-154b-4c53-b4f1-94919a8f8801",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "1ef6e90c-d798-4f53-b4c6-622d1adec866",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T10:00:44.62388Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "62daff22-e7d9-4b4d-b0be-f8ace57f263e",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "1ef6e90c-d798-4f53-b4c6-622d1adec866",
```

**Contract validation failed — scenario stopped.**

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
  "session_id": "3330fef6-44b6-42f7-9195-2c26a4c20859",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NDUsImlhdCI6MTc5MzE4MTY0NSwianRpIjoiOWQ0ZDcxNDktMWYzOS00YTkzLWJhZWQtMjlkNGQwZjYzZmZiIiwic2lkIjoiMzMzMGZlZjYtNDRiNi00MmY3LTkxOTUtMmMyNmE0YzIwODU5In0.tQua6zqZX-Kpr3aAqir3rua1nc42eLhQP5txc369uGU",
  "access_expires_at": "2026-10-28T10:15:45.758878816Z",
  "refresh_token": "4Cg8kSmLfGzYtrCSPL-ttVtHu3yzT9EOqlBX43GORW4",
  "refresh_expires_at": "2026-10-28T22:00:45.758530422Z",
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
  "session_id": "87375af3-10bf-4637-bb94-f1aa4b00e3d0",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NDYsImlhdCI6MTc5MzE4MTY0NiwianRpIjoiNTQ1YmNhZDktM2M1Ny00MTJkLTk0YTMtMTkzNjU3Y2U3MGNkIiwic2lkIjoiODczNzVhZjMtMTBiZi00NjM3LWJiOTQtZjFhYTRiMDBlM2QwIn0.ksPv7oO73JELus2fjX9Sn4i5iLUxfejzq_JJFk99vtY",
  "access_expires_at": "2026-10-28T10:15:46.106104204Z",
  "refresh_token": "TK4ObqUlj_ZiHS7FRKoWqp80YQaJMtduFKvIGrinJn8",
  "refresh_expires_at": "2026-10-28T22:00:46.105712965Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23043"
}
```

```json
{
  "challenge_id": "43193d08-7331-4df0-8c3e-a35a70a3ea2b",
  "expires_at": "2026-10-28T10:05:46.24593291Z",
  "resend_available_at": "2026-10-28T10:00:47.24593291Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "429014",
  "sent_at": "2026-10-28T10:00:46.247733358Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43193d08-7331-4df0-8c3e-a35a70a3ea2b",
  "code": "429014",
  "device_ref": "sandbox-23043"
}
```

```json
{
  "session_id": "012c05cd-b666-42b6-8eb3-1795d7681d70",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjU0NiwiaWF0IjoxNzkzMTgxNjQ2LCJqdGkiOiI3Njk1NjljNC1lNTRkLTQzODQtOWE4My0zNjQxMmMyM2EyZmIiLCJzaWQiOiIwMTJjMDVjZC1iNjY2LTQyYjYtOGViMy0xNzk1ZDc2ODFkNzAifQ.DA_CkdjsN5izcID0m0DB9-3yPMLXLjHhT9jyXC6DNPk",
  "access_expires_at": "2026-10-28T10:15:46.411521155Z",
  "refresh_token": "UKPjxzvElodpPL7FC3WsV3A7m0U-Y5wKcAhV_O9lUhc",
  "refresh_expires_at": "2026-11-27T10:00:46.411170057Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:00:33.02899Z",
  "last_location_at": "2026-10-28T10:00:33.02899Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/handover` → **200**

```json
{
  "command_id": "6b3878a5-ebb7-43c7-8612-1f1752509ad2",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:00:33.02899Z",
  "last_location_at": "2026-10-28T10:00:33.02899Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:46Z",
    "sequence": 1793181646838
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:00:46.854735Z",
  "last_location_at": "2026-10-28T10:00:46.854735Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
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
  "command_id": "e24901cd-c45e-4d95-911f-5307f2a99efb",
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
  "effective_at": "2026-10-28T10:00:47.160093Z",
  "changed_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:00:47.308278186Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a08cfe5c-4c1c-47a9-9b15-977ba95d0b67",
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
  "id": "ce89983b-b643-4cf6-995e-46731601b3d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:47.473498Z",
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
  "command_id": "d998c9c1-026c-4755-acdf-90dbe9b1cc2e",
  "quote_id": "ce89983b-b643-4cf6-995e-46731601b3d1",
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
    "phone": "+380671110599"
  }
}
```

```json
{
  "id": "a41d8775-d178-4079-87b2-752f4839fca7",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:00:47.629566Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110599"
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
    "id": "d1c2d13d-f5c0-486f-8a4b-0448a6d234d0",
    "order_id": "e2862607-154b-4c53-b4f1-94919a8f8801",
    "expires_at": "2026-10-28T10:00:59.625727Z",
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
    "distance_m": 4462
  }
]
```

`POST /api/driver/v1/offers/d1c2d13d-f5c0-486f-8a4b-0448a6d234d0/accept` → **200**

```json
{
  "command_id": "ec55cd7d-5f98-4112-b7cb-3250b04e1b3b"
}
```

```json
{
  "id": "774d4b26-91fd-424d-a710-bda8803b5a85",
  "order_id": "e2862607-154b-4c53-b4f1-94919a8f8801",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e40c7d57-60f4-44e0-a38f-b92cee520da6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e40c7d57-60f4-44e0-a38f-b92cee520da6",
  "order_id": "e2862607-154b-4c53-b4f1-94919a8f8801",
  "assignment_id": "774d4b26-91fd-424d-a710-bda8803b5a85",
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

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:00:48Z",
    "sequence": 1793181648200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
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
  "last_heartbeat_at": "2026-10-28T10:00:48.216262Z",
  "last_location_at": "2026-10-28T10:00:48.216262Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e40c7d57-60f4-44e0-a38f-b92cee520da6/arrive` → **200**

```json
{
  "command_id": "8b856b7c-ab76-4413-9a41-b2171f3c2b90",
  "expected_version": 0
}
```

```json
{
  "id": "e40c7d57-60f4-44e0-a38f-b92cee520da6",
  "order_id": "e2862607-154b-4c53-b4f1-94919a8f8801",
  "assignment_id": "774d4b26-91fd-424d-a710-bda8803b5a85",
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
  "arrived_at": "2026-10-28T10:00:48.367325Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e40c7d57-60f4-44e0-a38f-b92cee520da6/start` → **200**

```json
{
  "command_id": "123d3282-fa83-488f-80e3-d0aeb078744e",
  "expected_version": 1
}
```

```json
{
  "id": "e40c7d57-60f4-44e0-a38f-b92cee520da6",
  "order_id": "e2862607-154b-4c53-b4f1-94919a8f8801",
  "assignment_id": "774d4b26-91fd-424d-a710-bda8803b5a85",
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
  "arrived_at": "2026-10-28T10:00:48.367325Z",
  "started_at": "2026-10-28T10:00:48.517917Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e40c7d57-60f4-44e0-a38f-b92cee520da6/complete` → **200**

```json
{
  "command_id": "26ad48fd-f6bd-42d1-bad7-2ccc031faf12",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:00:48Z",
  "cash_received": true
}
```

```json
{
  "id": "e40c7d57-60f4-44e0-a38f-b92cee520da6",
  "order_id": "e2862607-154b-4c53-b4f1-94919a8f8801",
  "assignment_id": "774d4b26-91fd-424d-a710-bda8803b5a85",
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
  "arrived_at": "2026-10-28T10:00:48.367325Z",
  "started_at": "2026-10-28T10:00:48.517917Z",
  "completed_at": "2026-10-28T10:00:48.669137Z",
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
  "command_id": "11b5f343-5a46-471d-a501-76e4b22d2fee",
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
  "id": "dda8f3e0-302b-4303-88de-338cec34977d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:48.824355Z",
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
  "command_id": "a0cb2b15-729a-4a68-a57b-7f18988234c8",
  "quote_id": "dda8f3e0-302b-4303-88de-338cec34977d",
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
    "phone": "+380671119056"
  }
}
```

```json
{
  "id": "0ac7c2c7-837c-4fe8-b41b-8b25912251bd",
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
  "created_at": "2026-10-28T10:00:48.978775Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119056"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0ac7c2c7-837c-4fe8-b41b-8b25912251bd` → **200**

```json
{
  "id": "0ac7c2c7-837c-4fe8-b41b-8b25912251bd",
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
  "created_at": "2026-10-28T10:00:48.978775Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119056"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0ac7c2c7-837c-4fe8-b41b-8b25912251bd/cancel` → **200**

```json
{
  "command_id": "523886d0-6b88-4e7e-af6c-ba0da6fa2441",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0ac7c2c7-837c-4fe8-b41b-8b25912251bd",
  "short_number": 16,
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
  "created_at": "2026-10-28T10:00:48.978775Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119056"
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
  "staff_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "balance": -3,
  "fulfilled_count": 0,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T10:00:49.297559Z",
  "last_entries": [
    {
      "order_id": "0ac7c2c7-837c-4fe8-b41b-8b25912251bd",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T10:00:49.297559Z"
    }
  ]
}
```

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677744901",
  "device_ref": "sandbox-12628"
}
```

```json
{
  "challenge_id": "357715ab-bc83-4136-b10d-cf7a81055362",
  "expires_at": "2026-10-28T10:05:51.626885236Z",
  "resend_available_at": "2026-10-28T10:00:52.626885236Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677744901` → **200**

```json
{
  "phone": "+380677744901",
  "audience": "CLIENT",
  "code": "556117",
  "sent_at": "2026-10-28T10:00:51.628429776Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670350107",
  "device_ref": "sandbox-25406",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "88c7f1ee-ead6-44a4-a761-5e9a8adef356",
  "expires_at": "2026-10-28T10:05:51.787021753Z",
  "resend_available_at": "2026-10-28T10:00:52.787021753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670350107` → **200**

```json
{
  "phone": "+380670350107",
  "audience": "CLIENT",
  "code": "705868",
  "sent_at": "2026-10-28T10:00:51.78887642Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676650000",
  "device_ref": "sandbox-14636"
}
```

```json
{
  "challenge_id": "8c95246e-7294-4626-add4-10832556b7fb",
  "expires_at": "2026-10-28T10:05:51.988543543Z",
  "resend_available_at": "2026-10-28T10:00:52.988543543Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676650000` → **200**

```json
{
  "phone": "+380676650000",
  "audience": "CLIENT",
  "code": "867538",
  "sent_at": "2026-10-28T10:00:51.990907401Z",
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
  "session_id": "68f8276f-4cab-4d44-b231-ba9f45757fc6",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NTIsImlhdCI6MTc5MzE4MTY1MiwianRpIjoiMTBhY2U4YTItYmQzYy00OWU4LWJhMDQtZTcwM2E2MGZlOWRmIiwic2lkIjoiNjhmODI3NmYtNGNhYi00ZDQ0LWIyMzEtYmE5ZjQ1NzU3ZmM2In0.s9qJvDcj3mptfJwbXd4X_5kdXKr4Crcfr4_iQsrz90E",
  "access_expires_at": "2026-10-28T10:15:52.368112418Z",
  "refresh_token": "nNnGzDxKdhl4i11DUvJpL-NotGWaYIvGykNnnXlij5Y",
  "refresh_expires_at": "2026-10-28T22:00:52.367771105Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676650000` → **200**

```json
{
  "deliveries": [
    {
      "id": "d9c47c02-27fe-4571-9814-02a9a9fe4fc8",
      "challenge_id": "8c95246e-7294-4626-add4-10832556b7fb",
      "phone": "+380676650000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-16413047-c8c0-40bc-89ce-92a311b4bd45",
      "error": null,
      "attempted_at": "2026-10-28T10:00:51.991159Z"
    },
    {
      "id": "3a82f560-bd52-4890-aaa8-00dd4b0e2900",
      "challenge_id": "8c95246e-7294-4626-add4-10832556b7fb",
      "phone": "+380676650000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:00:51.990478Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676650000` → **200**

```json
{
  "phone": "+380676650000",
  "audience": "CLIENT",
  "code": "867538",
  "sent_at": "2026-10-28T10:00:51.990907401Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670350107` → **200**

```json
{
  "deliveries": [
    {
      "id": "9f08552f-9ed7-4963-82e4-34645619704f",
      "challenge_id": "88c7f1ee-ead6-44a4-a761-5e9a8adef356",
      "phone": "+380670350107",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-565cfa0f-ff34-4976-80a0-17b4d4578281",
      "error": null,
      "attempted_at": "2026-10-28T10:00:51.789142Z"
    }
  ]
}
```

Done: SMS to +380677744901, a call to +380670350107, SMS then a call to +380676650000.

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
  "session_id": "a294b120-5c85-4003-abfc-4b634baa2698",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NTMsImlhdCI6MTc5MzE4MTY1MywianRpIjoiNzg5NDVkOTMtNzMwZC00NjllLThiM2QtYzYyMGViNDg3ZjkyIiwic2lkIjoiYTI5NGIxMjAtNWM4NS00MDAzLWFiZmMtNGI2MzRiYWEyNjk4In0.yZ4XZ6t5AS2GyU0nP53Q10mdrkaW0x5wSzRjeJjYc2E",
  "access_expires_at": "2026-10-28T10:15:53.066269377Z",
  "refresh_token": "E3suvtuKEgVVFfD_pClHxn1kGUb67Xh4VWaUUFq9yoE",
  "refresh_expires_at": "2026-10-28T22:00:53.065792669Z",
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
  "session_id": "79dfd952-a9c3-4ddd-a240-a3eae3e2dd1d",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NTMsImlhdCI6MTc5MzE4MTY1MywianRpIjoiYjVlMWM2N2YtNmQ0OC00NjIxLThkMzUtMDE3ZTA2YTFhZjAxIiwic2lkIjoiNzlkZmQ5NTItYTljMy00ZGRkLWEyNDAtYTNlYWUzZTJkZDFkIn0.6RJevuvbW6B9f3d3Z4psjFAQXy34deSZbEAPPU6I2BM",
  "access_expires_at": "2026-10-28T10:15:53.411802975Z",
  "refresh_token": "YLijObCL92AgsNnDn7ektdqfS0wMZ-DbvOsIGL0ijgw",
  "refresh_expires_at": "2026-10-28T22:00:53.411319473Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
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

`POST /api/admin/v1/staff-extensions/314e0a1f-41b3-4a08-9bab-60b699abf030` → **200**

```json
{
  "command_id": "d6c79a8f-f668-4d83-871a-a65881f0ab4b",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "ebea6993-d176-4a47-8fc6-836b0226678f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:00:54.011812Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:00:54.011812Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "db771e47-863f-4649-9161-0850992be09e",
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
  "id": "597fc4e4-949a-4fed-ad56-7de1e1f30b8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:05:54.299163Z",
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
  "command_id": "a9cfed57-7ac6-405b-a0e0-b9fbc3f0e52c",
  "quote_id": "597fc4e4-949a-4fed-ad56-7de1e1f30b8e",
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
    "phone": "+380675269833"
  }
}
```

```json
{
  "id": "68efe506-dd96-435d-9062-a462aa07996e",
  "short_number": 17,
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
  "created_at": "2026-10-28T10:00:54.462182Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675269833"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/68efe506-dd96-435d-9062-a462aa07996e/calls` → **201**

```json
{
  "command_id": "fa2c57ad-0154-4c38-8450-14c6e51aa75b",
  "to": "CALLER"
}
```

```json
{
  "id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "order_ids": [
    "68efe506-dd96-435d-9062-a462aa07996e"
  ],
  "started_at": "2026-10-28T10:00:54.637581Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/68efe506-dd96-435d-9062-a462aa07996e/calls` → **201**

```json
{
  "command_id": "fa2c57ad-0154-4c38-8450-14c6e51aa75b",
  "to": "CALLER"
}
```

```json
{
  "id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "order_ids": [
    "68efe506-dd96-435d-9062-a462aa07996e"
  ],
  "started_at": "2026-10-28T10:00:54.637581Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675269833",
    "at": "2026-10-28T10:00:54.639455671Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.28549",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=68efe506-dd96-435d-9062-a462aa07996e` → **200**

```json
{
  "calls": [
    {
      "id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [
        "68efe506-dd96-435d-9062-a462aa07996e"
      ],
      "started_at": "2026-10-28T10:00:54.637581Z",
      "answered_at": "2026-10-28T10:00:55.002946Z",
      "ended_at": "2026-10-28T10:00:55.020454Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=68efe506-dd96-435d-9062-a462aa07996e` → **200**

```json
{
  "calls": [
    {
      "id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [
        "68efe506-dd96-435d-9062-a462aa07996e"
      ],
      "started_at": "2026-10-28T10:00:54.637581Z",
      "answered_at": "2026-10-28T10:00:55.002946Z",
      "ended_at": "2026-10-28T10:00:55.020454Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=68efe506-dd96-435d-9062-a462aa07996e` → **200**

```json
{
  "calls": [
    {
      "id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [
        "68efe506-dd96-435d-9062-a462aa07996e"
      ],
      "started_at": "2026-10-28T10:00:54.637581Z",
      "answered_at": "2026-10-28T10:00:55.002946Z",
      "ended_at": "2026-10-28T10:00:55.020454Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=68efe506-dd96-435d-9062-a462aa07996e` → **200**

```json
{
  "calls": [
    {
      "id": "55d07cdf-b8e8-4d97-baa9-80e7dac628ca",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "order_ids": [
        "68efe506-dd96-435d-9062-a462aa07996e"
      ],
      "started_at": "2026-10-28T10:00:54.637581Z",
      "answered_at": "2026-10-28T10:00:55.002946Z",
      "ended_at": "2026-10-28T10:00:55.020454Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:01:00.402455Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/68efe506-dd96-435d-9062-a462aa07996e` → **200**

```json
{
  "id": "68efe506-dd96-435d-9062-a462aa07996e",
  "short_number": 17,
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
  "created_at": "2026-10-28T10:00:54.462182Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675269833"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/68efe506-dd96-435d-9062-a462aa07996e/cancel` → **200**

```json
{
  "command_id": "2ba55d71-fa9f-4763-a637-1e7b3ffb671c",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "68efe506-dd96-435d-9062-a462aa07996e",
  "short_number": 17,
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
  "created_at": "2026-10-28T10:00:54.462182Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675269833"
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
  "command_id": "234b5276-18d5-4cde-96ff-e3424441ff02",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T10:01:01.994535Z",
  "extension": "101"
}
```

Done: outgoing call 55d07cdf-b8e8-4d97-baa9-80e7dac628ca from order 68efe506-dd96-435d-9062-a462aa07996e, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634607579",
  "device_ref": "sandbox-26203"
}
```

```json
{
  "challenge_id": "84fb0c1a-b825-4c1a-a315-e5dc2260d603",
  "expires_at": "2026-10-28T10:06:02.145883571Z",
  "resend_available_at": "2026-10-28T10:01:03.145883571Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634607579` → **200**

```json
{
  "phone": "+380634607579",
  "audience": "CLIENT",
  "code": "896534",
  "sent_at": "2026-10-28T10:01:02.147588296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84fb0c1a-b825-4c1a-a315-e5dc2260d603",
  "code": "896534",
  "device_ref": "sandbox-26203"
}
```

```json
{
  "session_id": "cc2a51db-ebd1-4ba5-94ea-24b2c142a5cf",
  "subject": {
    "type": "CLIENT",
    "id": "2f6b668d-5a7d-4beb-b65e-bc44e5c61d9a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjZiNjY4ZC01YTdkLTRiZWItYjY1ZS1iYzQ0ZTVjNjFkOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTYyLCJpYXQiOjE3OTMxODE2NjIsImp0aSI6ImRkODdiODEzLTIyYTctNGZlMi1hYWQ4LTYxNzVmNzY5OTZmMyIsInNpZCI6ImNjMmE1MWRiLWViZDEtNGJhNS05NGVhLTI0YjJjMTQyYTVjZiJ9.jWm3JVRiXXy9Pzbp4ctiStFje3pOAvP7y0NDboXEe9E",
  "access_expires_at": "2026-10-28T10:16:02.312973758Z",
  "refresh_token": "8s42sT2IgIYxS8UL2l_bsCVlVa1Iv2ywuBZXBkG-bsU",
  "refresh_expires_at": "2026-11-27T10:01:02.312671624Z",
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
  "session_id": "63b87162-1dc3-4811-b546-8cc0f6b38bb0",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NjIsImlhdCI6MTc5MzE4MTY2MiwianRpIjoiNTIyMWU4ZjYtY2YzNS00NTI4LTllZDctNWM0NDEzNGI2YjBlIiwic2lkIjoiNjNiODcxNjItMWRjMy00ODExLWI1NDYtOGNjMGY2YjM4YmIwIn0.ATDrc9HdpRHmgSA_oJg5GNrg3tNU4uVDRxjdZgmVBEs",
  "access_expires_at": "2026-10-28T10:16:02.973426972Z",
  "refresh_token": "O3f42fqGBXwyuK6f_58Uzww5RZ0JsR-H2uLhXCwPzEI",
  "refresh_expires_at": "2026-10-28T22:01:02.973043806Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634607579` → **200**

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
  "correlation_id": "69c12264-4152-4d87-b586-54e40fd9f79e"
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
  "session_id": "cb4ad977-2fab-4047-b16d-71d53ce306e4",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NjMsImlhdCI6MTc5MzE4MTY2MywianRpIjoiMjQ1OWU5N2UtNWQxMi00NjYyLWFmMjktZTBkYTA5ZTcxNTdmIiwic2lkIjoiY2I0YWQ5NzctMmZhYi00MDQ3LWIxNmQtNzFkNTNjZTMwNmU0In0.FVMZU4wqocLAfxQaFH5hnPP00Vf-0WjoTCK27XfPerQ",
  "access_expires_at": "2026-10-28T10:16:03.678412402Z",
  "refresh_token": "_YAgYLlwnN9aZwYhIlQ5EvXff0gaHqYOpqeVVVahusY",
  "refresh_expires_at": "2026-10-28T22:01:03.678088685Z",
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
  "command_id": "e55d3e05-dc6c-45f5-af7c-b90bec9870e8",
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
  "changed_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:01:03.980149395Z"
}
```

## The rider books the airport for 2026-10-28T13:01:03Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600388428",
  "device_ref": "sandbox-21223"
}
```

```json
{
  "challenge_id": "4986a633-a349-43b7-b48d-04736191254c",
  "expires_at": "2026-10-28T10:06:04.130974094Z",
  "resend_available_at": "2026-10-28T10:01:05.130974094Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600388428` → **200**

```json
{
  "phone": "+48600388428",
  "audience": "CLIENT",
  "code": "991109",
  "sent_at": "2026-10-28T10:01:04.1329115Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4986a633-a349-43b7-b48d-04736191254c",
  "code": "991109",
  "device_ref": "sandbox-21223"
}
```

```json
{
  "session_id": "4b097ce5-2c46-4db8-ac4c-0987202b550a",
  "subject": {
    "type": "CLIENT",
    "id": "71d03797-05c6-40c1-971b-f621cea01c84"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MWQwMzc5Ny0wNWM2LTQwYzEtOTcxYi1mNjIxY2VhMDFjODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTY0LCJpYXQiOjE3OTMxODE2NjQsImp0aSI6IjQ1OGNlY2VlLTYwYjUtNGY3Ny04ZjIzLTQ3Y2VkMDU1YjdhMiIsInNpZCI6IjRiMDk3Y2U1LTJjNDYtNGRiOC1hYzRjLTA5ODcyMDJiNTUwYSJ9.WcBjS2j4ggm4wlgyKyNrosriVA_1WiK0LFdPh-_l2Nk",
  "access_expires_at": "2026-10-28T10:16:04.295769767Z",
  "refresh_token": "3m4jO4yfAaHV_LXeSDO-UEpR1tntgbs_I1CSakueTeI",
  "refresh_expires_at": "2026-11-27T10:01:04.295398284Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b091e51-47ae-442e-8e64-2b042c0e6025",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:01:03Z"
}
```

```json
{
  "id": "127ef3f2-a8ee-4628-89d3-39cd6800bbe2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:06:04.448088Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:01:03Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a74568a1-87ab-491e-983f-1b7e9d2e9876",
  "quote_id": "127ef3f2-a8ee-4628-89d3-39cd6800bbe2",
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
  "pickup_at": "2026-10-28T13:01:03Z"
}
```

```json
{
  "id": "4f5044b6-d0c3-466a-b56a-cb00cba740a0",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "71d03797-05c6-40c1-971b-f621cea01c84",
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
  "created_at": "2026-10-28T10:01:04.608881Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:01:03Z",
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
  "device_ref": "sandbox-24103"
}
```

```json
{
  "challenge_id": "9fce268c-e709-4bcf-94ac-fe7a33e2fbb0",
  "expires_at": "2026-10-28T10:06:04.762019695Z",
  "resend_available_at": "2026-10-28T10:01:05.762019695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "748506",
  "sent_at": "2026-10-28T10:01:04.76374735Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9fce268c-e709-4bcf-94ac-fe7a33e2fbb0",
  "code": "748506",
  "device_ref": "sandbox-24103"
}
```

```json
{
  "session_id": "9e212e23-a93e-4f8c-8383-9922e05eaa4a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjU2NCwiaWF0IjoxNzkzMTgxNjY0LCJqdGkiOiI4YWQxZTMzZi0zZDBlLTQ3YTItOGE3Yi1jZjMyZGNiNTZkYjIiLCJzaWQiOiI5ZTIxMmUyMy1hOTNlLTRmOGMtODM4My05OTIyZTA1ZWFhNGEifQ.mGB-pm0VnI382BpWiQtFspLWRMyRLpkGWkrIgS57E_s",
  "access_expires_at": "2026-10-28T10:16:04.933511707Z",
  "refresh_token": "wYXTiCF4UOwnxOx0fVgaLtQorwtbR6Vv8w9IPkYyUlQ",
  "refresh_expires_at": "2026-11-27T10:01:04.933039622Z",
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
  "command_id": "29e407a6-cb4c-4385-8a17-a1f58deadf26",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:05Z",
    "sequence": 1793181665222
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "dc1dc05f-bea8-44b4-96e6-b93f5bb960ba",
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
  "last_heartbeat_at": "2026-10-28T10:01:05.238808Z",
  "last_location_at": "2026-10-28T10:01:05.238808Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "4f5044b6-d0c3-466a-b56a-cb00cba740a0",
      "short_number": 18,
      "pickup_at": "2026-10-28T13:01:03Z",
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

`POST /api/driver/v1/preorders/4f5044b6-d0c3-466a-b56a-cb00cba740a0/reserve` → **200**

```json
{
  "command_id": "a376fcd4-8b76-4b94-8eb4-a978850492d2"
}
```

```json
{
  "id": "71e3a73c-8946-4971-bed0-2d7501144fc2",
  "state": "RESERVED",
  "order": {
    "order_id": "4f5044b6-d0c3-466a-b56a-cb00cba740a0",
    "short_number": 18,
    "pickup_at": "2026-10-28T13:01:03Z",
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
  "reserved_at": "2026-10-28T10:01:05.54509Z",
  "confirm_from": "2026-10-28T12:31:03Z",
  "confirm_until": "2026-10-28T12:41:03Z",
  "drop_until": "2026-10-28T12:01:03Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "71e3a73c-8946-4971-bed0-2d7501144fc2",
      "state": "RESERVED",
      "order": {
        "order_id": "4f5044b6-d0c3-466a-b56a-cb00cba740a0",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:01:03Z",
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
      "reserved_at": "2026-10-28T10:01:05.54509Z",
      "confirm_from": "2026-10-28T12:31:03Z",
      "confirm_until": "2026-10-28T12:41:03Z",
      "drop_until": "2026-10-28T12:01:03Z"
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
      "id": "71e3a73c-8946-4971-bed0-2d7501144fc2",
      "state": "RESERVED",
      "order": {
        "order_id": "4f5044b6-d0c3-466a-b56a-cb00cba740a0",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:01:03Z",
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
      "reserved_at": "2026-10-28T10:01:05.54509Z",
      "confirm_from": "2026-10-28T12:31:03Z",
      "confirm_until": "2026-10-28T12:41:03Z",
      "drop_until": "2026-10-28T12:01:03Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/71e3a73c-8946-4971-bed0-2d7501144fc2/confirm` → **409**

```json
{
  "command_id": "b169c164-e7e2-4812-bcd0-4a3305ee2593"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/71e3a73c-8946-4971-bed0-2d7501144fc2/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "114694b8-0d30-4607-8695-9b01ea2cbd2a"
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
  "session_id": "4cc9ffec-ee2f-4ec6-a590-2a58e0722659",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NjYsImlhdCI6MTc5MzE4MTY2NiwianRpIjoiZDkzYTBkNDAtN2VlZC00OTNlLWJhYzktZTRmY2I1OGVmN2NjIiwic2lkIjoiNGNjOWZmZWMtZWUyZi00ZWM2LWE1OTAtMmE1OGUwNzIyNjU5In0.0y57ZG9Y2m0S230pCYeOipeyK5Qs1LnVc9hS9uOigks",
  "access_expires_at": "2026-10-28T10:16:06.350831025Z",
  "refresh_token": "tefz7GDt3W19G19zbpLraZWhfzw6QY-BVQ-ephaGTMw",
  "refresh_expires_at": "2026-10-28T22:01:06.350489421Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4f5044b6-d0c3-466a-b56a-cb00cba740a0` → **200**

```json
{
  "id": "4f5044b6-d0c3-466a-b56a-cb00cba740a0",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "71d03797-05c6-40c1-971b-f621cea01c84",
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
  "created_at": "2026-10-28T10:01:04.608881Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:01:03Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "71e3a73c-8946-4971-bed0-2d7501144fc2",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:01:05.54509Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4f5044b6-d0c3-466a-b56a-cb00cba740a0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:01:04.609672Z",
      "actor": {
        "type": "CLIENT",
        "id": "71d03797-05c6-40c1-971b-f621cea01c84",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "4f5044b6-d0c3-466a-b56a-cb00cba740a0",
        "preorder": true,
        "quote_id": "127ef3f2-a8ee-4628-89d3-39cd6800bbe2",
        "pickup_at": "2026-10-28T13:01:03Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "4ff69c03-f0f6-4ad2-92b6-ec3116569a63"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:01:05.552509Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4f5044b6-d0c3-466a-b56a-cb00cba740a0",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "71e3a73c-8946-4971-bed0-2d7501144fc2"
      },
      "correlation_id": "c64b498e-0861-49fc-bf42-e275e5d6eb39"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 4f5044b6-d0c3-466a-b56a-cb00cba740a0, reservation 71e3a73c-8946-4971-bed0-2d7501144fc2.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6070"
}
```

```json
{
  "challenge_id": "5ced20bd-8710-46e6-95d8-81954887bf73",
  "expires_at": "2026-10-28T10:06:06.816658542Z",
  "resend_available_at": "2026-10-28T10:01:07.816658542Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "192460",
  "sent_at": "2026-10-28T10:01:06.818487384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ced20bd-8710-46e6-95d8-81954887bf73",
  "code": "192460",
  "device_ref": "sandbox-6070"
}
```

```json
{
  "session_id": "88510553-d190-424e-8ef8-3d760f60128f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjU2NiwiaWF0IjoxNzkzMTgxNjY2LCJqdGkiOiJkZjU1MDI4Yi00OTg5LTQxZTYtYjhmNS0xYTYyNjIwYTI5YTUiLCJzaWQiOiI4ODUxMDU1My1kMTkwLTQyNGUtOGVmOC0zZDc2MGY2MDEyOGYifQ.HhSwC99eReN6MkOSM0tK5A6ypQeflziSMlCI_lZYfnI",
  "access_expires_at": "2026-10-28T10:16:06.986107143Z",
  "refresh_token": "OP-5iWs07vVLvmiTBleBKRf7SCnQH0r76cLTOtFNgRI",
  "refresh_expires_at": "2026-11-27T10:01:06.985758248Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:00:48.216262Z",
  "last_location_at": "2026-10-28T10:00:48.216262Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/handover` → **200**

```json
{
  "command_id": "d3cf95d2-dba8-4189-9f83-46feb6a22f4b",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:00:48.216262Z",
  "last_location_at": "2026-10-28T10:00:48.216262Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:07Z",
    "sequence": 1793181667417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:01:07.432781Z",
  "last_location_at": "2026-10-28T10:01:07.432781Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675733729",
  "device_ref": "sandbox-5"
}
```

```json
{
  "challenge_id": "9b5418a8-9243-4bc9-a1f7-1651e7dd7b4b",
  "expires_at": "2026-10-28T10:06:07.57602261Z",
  "resend_available_at": "2026-10-28T10:01:08.57602261Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675733729` → **200**

```json
{
  "phone": "+380675733729",
  "audience": "CLIENT",
  "code": "553440",
  "sent_at": "2026-10-28T10:01:07.577799084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b5418a8-9243-4bc9-a1f7-1651e7dd7b4b",
  "code": "553440",
  "device_ref": "sandbox-5"
}
```

```json
{
  "session_id": "e0686b8f-4b99-43cf-83b7-2ff576c222c3",
  "subject": {
    "type": "CLIENT",
    "id": "2a010df3-fdbf-4b95-81cf-b44b85df7f75"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTAxMGRmMy1mZGJmLTRiOTUtODFjZi1iNDRiODVkZjdmNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTY3LCJpYXQiOjE3OTMxODE2NjcsImp0aSI6ImUwYzI2MWMwLTAzZGItNDkxZC04ZjhkLTRhNGFhYWFmODRmNSIsInNpZCI6ImUwNjg2YjhmLTRiOTktNDNjZi04M2I3LTJmZjU3NmMyMjJjMyJ9.kBRnY2LRpFvyaxPnxvsfG6OvR41QLmtawcl2dwOPHFM",
  "access_expires_at": "2026-10-28T10:16:07.746621158Z",
  "refresh_token": "3zBL6c7EF16scuabww_7Gd5HsP1GhN5rAzvgyECP_44",
  "refresh_expires_at": "2026-11-27T10:01:07.746257245Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2127094b-e9d5-4b52-b007-3ea0214bd051",
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
  "id": "77eff7d1-05cf-442c-9ec7-f1b5e654e6f9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:06:07.897656Z",
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
  "command_id": "b8829fb8-74bc-4d47-a4f0-dbcc7b1d65fe",
  "quote_id": "77eff7d1-05cf-442c-9ec7-f1b5e654e6f9",
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
  "id": "843632f4-182d-446b-826c-b98769d11c9e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a010df3-fdbf-4b95-81cf-b44b85df7f75",
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
  "created_at": "2026-10-28T10:01:08.048461Z",
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
    "id": "489b81d8-c5cf-4051-9280-4f527a141d5e",
    "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
    "expires_at": "2026-10-28T10:01:23.050315Z",
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

`POST /api/driver/v1/offers/489b81d8-c5cf-4051-9280-4f527a141d5e/accept` → **200**

```json
{
  "command_id": "3b0711d4-6b6f-486c-9857-70153c028ea1"
}
```

```json
{
  "id": "d431aaa9-e25f-4cb9-97d9-ae2927c2a990",
  "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "44d2c8cf-119c-4925-9576-b09b12aebddb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44d2c8cf-119c-4925-9576-b09b12aebddb",
  "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
  "assignment_id": "d431aaa9-e25f-4cb9-97d9-ae2927c2a990",
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

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:08Z",
    "sequence": 1793181668640
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:01:08.657374Z",
  "last_location_at": "2026-10-28T10:01:08.657374Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44d2c8cf-119c-4925-9576-b09b12aebddb",
  "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
  "assignment_id": "d431aaa9-e25f-4cb9-97d9-ae2927c2a990",
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

`POST /api/driver/v1/trips/44d2c8cf-119c-4925-9576-b09b12aebddb/arrive` → **200**

```json
{
  "command_id": "09041174-9925-428c-9c3d-74049866ad0f",
  "expected_version": 0
}
```

```json
{
  "id": "44d2c8cf-119c-4925-9576-b09b12aebddb",
  "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
  "assignment_id": "d431aaa9-e25f-4cb9-97d9-ae2927c2a990",
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
  "arrived_at": "2026-10-28T10:01:08.942611Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/44d2c8cf-119c-4925-9576-b09b12aebddb/start` → **200**

```json
{
  "command_id": "460285cb-9050-4697-9405-e726ee70d700",
  "expected_version": 1
}
```

```json
{
  "id": "44d2c8cf-119c-4925-9576-b09b12aebddb",
  "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
  "assignment_id": "d431aaa9-e25f-4cb9-97d9-ae2927c2a990",
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
  "arrived_at": "2026-10-28T10:01:08.942611Z",
  "started_at": "2026-10-28T10:01:09.093064Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:09Z",
    "sequence": 1793181669236
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:01:09.253007Z",
  "last_location_at": "2026-10-28T10:01:09.253007Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/44d2c8cf-119c-4925-9576-b09b12aebddb/complete` → **200**

```json
{
  "command_id": "8c45e447-af1f-490c-87c5-078e67fc54c9",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:01:09Z",
  "cash_received": true
}
```

```json
{
  "id": "44d2c8cf-119c-4925-9576-b09b12aebddb",
  "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
  "assignment_id": "d431aaa9-e25f-4cb9-97d9-ae2927c2a990",
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
  "arrived_at": "2026-10-28T10:01:08.942611Z",
  "started_at": "2026-10-28T10:01:09.093064Z",
  "completed_at": "2026-10-28T10:01:09.401036Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/843632f4-182d-446b-826c-b98769d11c9e/rating` → **200**

```json
{
  "command_id": "9526bbad-e2a0-465a-a87b-bd64d2e8f7ce",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
  "score": 5,
  "created_at": "2026-10-28T10:01:09.566348081Z"
}
```

`POST /api/driver/v1/orders/843632f4-182d-446b-826c-b98769d11c9e/rating` → **200**

```json
{
  "command_id": "b22b5aa1-151c-43e8-97a4-d72fdf742fb7",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
  "score": 4,
  "created_at": "2026-10-28T10:01:09.714790578Z"
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
  "session_id": "ac62d60e-6875-49a9-a234-86161ad1855b",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NzAsImlhdCI6MTc5MzE4MTY3MCwianRpIjoiNzJlZTQ5NTAtN2IxYy00NzZjLWFjMTEtN2M2MmRiYmExYWMwIiwic2lkIjoiYWM2MmQ2MGUtNjg3NS00OWE5LWEyMzQtODYxNjFhZDE4NTViIn0.92YL5CwISTFHliIzA4zF09zcO8y5cD57Ta9P_1oY5NQ",
  "access_expires_at": "2026-10-28T10:16:10.208977878Z",
  "refresh_token": "jj_t7hCeJDt9iRKQkJojSDx-sHosz9f1izWOI2g7Qus",
  "refresh_expires_at": "2026-10-28T22:01:10.208600019Z",
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
  "session_id": "63eed361-a938-4db0-8481-c1f3c3868aed",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NzAsImlhdCI6MTc5MzE4MTY3MCwianRpIjoiYTM1ODNkOWYtMGJjYi00YjE1LTg0NDQtNTA1MTUzYzhkODhlIiwic2lkIjoiNjNlZWQzNjEtYTkzOC00ZGIwLTg0ODEtYzFmM2MzODY4YWVkIn0.nnY9wS02R4KsKPoRCmAtp0cmX64sc9t3GwqFdkCyi5c",
  "access_expires_at": "2026-10-28T10:16:10.552727977Z",
  "refresh_token": "D01tlsQdA5yCwrZAcjCGQB5Y91ezd2VaPosDWWXZnjo",
  "refresh_expires_at": "2026-10-28T22:01:10.552321335Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/843632f4-182d-446b-826c-b98769d11c9e/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
      "author_type": "RIDER",
      "author_id": "2a010df3-fdbf-4b95-81cf-b44b85df7f75",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T10:01:09.566348Z"
    },
    {
      "order_id": "843632f4-182d-446b-826c-b98769d11c9e",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "2a010df3-fdbf-4b95-81cf-b44b85df7f75",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T10:01:09.714791Z"
    }
  ]
}
```

Done: ratings for order 843632f4-182d-446b-826c-b98769d11c9e.

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
  "session_id": "a0d22352-0ca0-4842-a9b2-c3fe30e15171",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1NzEsImlhdCI6MTc5MzE4MTY3MSwianRpIjoiZjQ4MzJjZjMtMjdlMS00MzJhLWJmNmYtYTY5ZWYyMDJjZTQxIiwic2lkIjoiYTBkMjIzNTItMGNhMC00ODQyLWE5YjItYzNmZTMwZTE1MTcxIn0.l2NJB1AlmFCSZ6wXkinDwcFuFceCKLP70_0XfpM3Afk",
  "access_expires_at": "2026-10-28T10:16:11.068084723Z",
  "refresh_token": "VCQnXiumC7CS4KRkPjzuT2KSkPDIR9tnSQ3_JPVA49E",
  "refresh_expires_at": "2026-10-28T22:01:11.067712473Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "cae4bb1c-b94c-48b4-af7f-e27e9088c410",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "91518774-4614-4292-b573-2a987e5271e0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:11.218865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/91518774-4614-4292-b573-2a987e5271e0` → **200**

```json
{
  "id": "91518774-4614-4292-b573-2a987e5271e0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:11.218865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/91518774-4614-4292-b573-2a987e5271e0` → **200**

```json
{
  "id": "91518774-4614-4292-b573-2a987e5271e0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:11.218865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/91518774-4614-4292-b573-2a987e5271e0` → **200**

```json
{
  "id": "91518774-4614-4292-b573-2a987e5271e0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:11.218865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/91518774-4614-4292-b573-2a987e5271e0` → **200**

```json
{
  "id": "91518774-4614-4292-b573-2a987e5271e0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:11.218865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/91518774-4614-4292-b573-2a987e5271e0` → **200**

```json
{
  "id": "91518774-4614-4292-b573-2a987e5271e0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:01:11.218865Z",
  "ready_at": "2026-10-28T10:01:15.424074Z",
  "expires_at": "2026-10-29T10:01:15.424074Z"
}
```

`GET /api/admin/v1/reports/exports/91518774-4614-4292-b573-2a987e5271e0/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,9,0,3,14,4,0,16,1,0,1,3,1,5
total,18,6,9,0,3,14,4,0,16,1,0,1,3,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "44bbe5de-d247-4bd9-be2f-c4cd24a09921",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "5721cb4a-96b7-49d1-bc86-bce3452020dd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:16.143094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5721cb4a-96b7-49d1-bc86-bce3452020dd` → **200**

```json
{
  "id": "5721cb4a-96b7-49d1-bc86-bce3452020dd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:16.143094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5721cb4a-96b7-49d1-bc86-bce3452020dd` → **200**

```json
{
  "id": "5721cb4a-96b7-49d1-bc86-bce3452020dd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:16.143094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5721cb4a-96b7-49d1-bc86-bce3452020dd` → **200**

```json
{
  "id": "5721cb4a-96b7-49d1-bc86-bce3452020dd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:16.143094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5721cb4a-96b7-49d1-bc86-bce3452020dd` → **200**

```json
{
  "id": "5721cb4a-96b7-49d1-bc86-bce3452020dd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:01:16.143094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5721cb4a-96b7-49d1-bc86-bce3452020dd` → **200**

```json
{
  "id": "5721cb4a-96b7-49d1-bc86-bce3452020dd",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:01:16.143094Z",
  "ready_at": "2026-10-28T10:01:20.430496Z",
  "expires_at": "2026-10-29T10:01:20.430496Z"
}
```

`GET /api/admin/v1/reports/exports/5721cb4a-96b7-49d1-bc86-bce3452020dd/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,714.39,130.74,107.18,607.21,10.52,0.00,162.97,20.00,390.16,25.00,0.00
total,UAH,6,714.39,130.74,107.18,607.21,10.52,0.00,162.97,20.00,390.16,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/52a43cde-69e9-45ce-89df-23ec6c8f5499` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/52a43cde-69e9-45ce-89df-23ec6c8f5499",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f68ed3e3-a1c9-4eeb-a6f5-169124d4a022"
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
  "device_ref": "sandbox-18889"
}
```

```json
{
  "challenge_id": "f17b6b33-7139-44b6-99f6-c3457222efbd",
  "expires_at": "2026-10-28T10:06:21.187423245Z",
  "resend_available_at": "2026-10-28T10:01:22.187423245Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "554974",
  "sent_at": "2026-10-28T10:01:21.189210224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f17b6b33-7139-44b6-99f6-c3457222efbd",
  "code": "554974",
  "device_ref": "sandbox-18889"
}
```

```json
{
  "session_id": "295eabe3-1f6c-4671-944c-c52c7b395261",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjU4MSwiaWF0IjoxNzkzMTgxNjgxLCJqdGkiOiI0MmY1NDE5MS1kMDBmLTQxMjUtYWM4Zi1kN2EyMjFiY2E3NGEiLCJzaWQiOiIyOTVlYWJlMy0xZjZjLTQ2NzEtOTQ0Yy1jNTJjN2IzOTUyNjEifQ.iecyhQ_Sq-JwGIhj85oW3_qMMuhiOBZHJHaRimBnIiY",
  "access_expires_at": "2026-10-28T10:16:21.353303375Z",
  "refresh_token": "hjDF8B59w-exyUHWaBoA30Ij19QTFxwuMHY24RD6AxY",
  "refresh_expires_at": "2026-11-27T10:01:21.35294754Z",
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
  "command_id": "4dfb0774-d7cd-42d6-87f4-5b70d9d48ee8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:21Z",
    "sequence": 1793181681777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "55dd0e19-dfcb-47ac-8f36-335dc1a402cf",
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
  "last_heartbeat_at": "2026-10-28T10:01:21.792832Z",
  "last_location_at": "2026-10-28T10:01:21.792832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "84540ad8-1c2d-4002-839c-79a9548b0b0a",
  "points": [
    {
      "sequence": 1793181683941,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:00:23Z"
    },
    {
      "sequence": 1793181683947,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:01:23Z"
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
  "session_id": "6f665051-a4a4-45af-8415-f8f605195f49",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1ODQsImlhdCI6MTc5MzE4MTY4NCwianRpIjoiOTFhNDljM2MtMDcwMC00OTE2LWIwYTYtZmFlZjNiMzgyZmUzIiwic2lkIjoiNmY2NjUwNTEtYTRhNC00NWFmLTg0MTUtZjhmNjA1MTk1ZjQ5In0.G6LFLqElIVujwdTsXkNTeYx4MZDzAuYo6ue-RWwpLfA",
  "access_expires_at": "2026-10-28T10:16:24.340500294Z",
  "refresh_token": "wlw-VgnDRqapKLLiwkPLek7fV5MUqQcwsGWuUC2l1qc",
  "refresh_expires_at": "2026-10-28T22:01:24.340062194Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "3c89bb69-90ae-4f47-b49c-a3e00acd98ae",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:01:23Z",
        "track_point_id": "3c2582a0-8561-4052-b513-71e78f6e47e7",
        "work_session_id": "55dd0e19-dfcb-47ac-8f36-335dc1a402cf"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:01:23Z",
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

`POST /api/admin/v1/driver-risk-flags/3c89bb69-90ae-4f47-b49c-a3e00acd98ae/confirm` → **200**

```json
{
  "command_id": "1029accf-c85c-4166-b6c7-da89255cbd13",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "3c89bb69-90ae-4f47-b49c-a3e00acd98ae",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:01:23Z",
    "track_point_id": "3c2582a0-8561-4052-b513-71e78f6e47e7",
    "work_session_id": "55dd0e19-dfcb-47ac-8f36-335dc1a402cf"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:01:23Z",
  "reason": null,
  "reviewed_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "reviewed_at": "2026-10-28T10:01:24.83386Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/3c89bb69-90ae-4f47-b49c-a3e00acd98ae/dismiss` → **409**

```json
{
  "command_id": "e5972b45-c847-48b7-99c6-d0df55200f83",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/3c89bb69-90ae-4f47-b49c-a3e00acd98ae/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a449283b-afed-462e-8eec-ad508d81916f"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "a322b7f8-aad0-43d0-8178-90f383f492f4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "93213c5b-70bd-40ce-886f-1e551c175d6f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "raised_at": "2026-10-28T10:01:25.152578Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/93213c5b-70bd-40ce-886f-1e551c175d6f/dismiss` → **200**

```json
{
  "command_id": "5745e1a4-f579-40f5-a15f-8ceff76e79e1",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "93213c5b-70bd-40ce-886f-1e551c175d6f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "raised_at": "2026-10-28T10:01:25.152578Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "reviewed_at": "2026-10-28T10:01:25.318493Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1550ff8c-9bfa-43b4-b02d-b0ac45824f8f",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "3c89bb69-90ae-4f47-b49c-a3e00acd98ae"
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
      "actor_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:01:25.486977Z"
    }
  ]
}
```

Done: flag 3c89bb69-90ae-4f47-b49c-a3e00acd98ae confirmed, suspension named it, driver reinstated.

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
  "session_id": "8a04cfac-a791-4231-958b-e5f3afe6fb8d",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1ODYsImlhdCI6MTc5MzE4MTY4NiwianRpIjoiZGY1Y2M5MmYtMTA2ZS00ZTU4LWI4NWMtNmJiNjU5YWViZDU3Iiwic2lkIjoiOGEwNGNmYWMtYTc5MS00MjMxLTk1OGItZTVmM2FmZTZmYjhkIn0.P6b3XRzXKzew4feeYhGzWAwWByDwybD5i-VIt1NV-Ac",
  "access_expires_at": "2026-10-28T10:16:26.001841827Z",
  "refresh_token": "Un1a0i3Tg6_AcMKA1YX8FHNcWrbh--LcpW3u1EAPxQI",
  "refresh_expires_at": "2026-10-28T22:01:26.001220191Z",
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
      "actor_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:01:25.486977Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "3ed68b7c-9588-41d7-8661-4b146b6434f1",
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
  "session_id": "55dd0e19-dfcb-47ac-8f36-335dc1a402cf",
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
  "last_heartbeat_at": "2026-10-28T10:01:21.792832Z",
  "last_location_at": "2026-10-28T10:01:21.792832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/55dd0e19-dfcb-47ac-8f36-335dc1a402cf/close` → **200**

```json
{
  "command_id": "4045c0d1-77d2-46c3-b69e-90b9c6fc5102",
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
  "session_id": "baa6d970-cf8b-4d8f-b2d3-15663e64dca5",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1ODYsImlhdCI6MTc5MzE4MTY4NiwianRpIjoiMzE4NTc2Y2YtZTE2Zi00ZDU3LWEwNzktOTU2MzczZWZhMDQ3Iiwic2lkIjoiYmFhNmQ5NzAtY2Y4Yi00ZDhmLWIyZDMtMTU2NjNlNjRkY2E1In0.axjzgGa7qoysU5FjbSwrSQsAe8RcYX5ikjgcxCFerRc",
  "access_expires_at": "2026-10-28T10:16:26.989473369Z",
  "refresh_token": "QuS4AI0UArZghej5mLxlmyiQxv-_UXNCF-EkLfWNFhE",
  "refresh_expires_at": "2026-10-28T22:01:26.988803191Z",
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
  "command_id": "ac180b49-a0e3-44c0-a780-59e5cd35d42e",
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
  "changed_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:01:27.293468Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "ac180b49-a0e3-44c0-a780-59e5cd35d42e",
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
  "changed_by": "314e0a1f-41b3-4a08-9bab-60b699abf030",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:01:27.293468Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48268470640",
  "device_ref": "sandbox-30332"
}
```

```json
{
  "challenge_id": "839c6345-8eee-4033-8586-74f5fe071853",
  "expires_at": "2026-10-28T10:06:27.610452031Z",
  "resend_available_at": "2026-10-28T10:01:28.610452031Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48268470640` → **200**

```json
{
  "phone": "+48268470640",
  "audience": "CLIENT",
  "code": "421713",
  "sent_at": "2026-10-28T10:01:27.613101984Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "839c6345-8eee-4033-8586-74f5fe071853",
  "code": "421713",
  "device_ref": "sandbox-30332"
}
```

```json
{
  "session_id": "f8420cc4-2484-43db-941c-cfffa3cd6b0d",
  "subject": {
    "type": "CLIENT",
    "id": "b014330d-5eaf-4032-9b2a-a50871a68f05"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDE0MzMwZC01ZWFmLTQwMzItOWIyYS1hNTA4NzFhNjhmMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTg3LCJpYXQiOjE3OTMxODE2ODcsImp0aSI6Ijk3ZWY3YzQwLTA4ZTItNDBhMC05M2ZlLWJjOTNhNjQ1Y2VhYiIsInNpZCI6ImY4NDIwY2M0LTI0ODQtNDNkYi05NDFjLWNmZmZhM2NkNmIwZCJ9.tXSSA2qpBZ0kbxNzoJ7sGhNUOPkGaktjvmsqdpv2ePc",
  "access_expires_at": "2026-10-28T10:16:27.785524901Z",
  "refresh_token": "fj1b0NUvlKtgUohG9JRrZsP6LcNuAaqqVmHlgkQ2_EI",
  "refresh_expires_at": "2026-11-27T10:01:27.785079961Z",
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
  "correlation_id": "7ecc7dfd-05cd-4b10-8507-3772aae6f5cc"
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
  "device_ref": "sandbox-1438"
}
```

```json
{
  "challenge_id": "57864683-a908-46fe-9098-801a5f7db278",
  "expires_at": "2026-10-28T10:06:28.232414974Z",
  "resend_available_at": "2026-10-28T10:01:29.232414974Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "002456",
  "sent_at": "2026-10-28T10:01:28.23405309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57864683-a908-46fe-9098-801a5f7db278",
  "code": "002456",
  "device_ref": "sandbox-1438"
}
```

```json
{
  "session_id": "ca7d8222-c927-493b-9784-35a96732642b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjU4OCwiaWF0IjoxNzkzMTgxNjg4LCJqdGkiOiI0NjhkNGY2Ni04NzgxLTQ4NGYtOWUxZS0yYjkzYzNlYTY5Y2UiLCJzaWQiOiJjYTdkODIyMi1jOTI3LTQ5M2ItOTc4NC0zNWE5NjczMjY0MmIifQ.s91_hYDOaSTFX7eny6818VhZ38zE914O-kVwjp_OiUQ",
  "access_expires_at": "2026-10-28T10:16:28.404718301Z",
  "refresh_token": "-w5A5yKolu0WdYBlMkBfI2pKq4CkhkM4bs7y0P1hVus",
  "refresh_expires_at": "2026-11-27T10:01:28.404264253Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "dc1dc05f-bea8-44b4-96e6-b93f5bb960ba",
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
  "last_heartbeat_at": "2026-10-28T10:01:05.238808Z",
  "last_location_at": "2026-10-28T10:01:05.238808Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dc1dc05f-bea8-44b4-96e6-b93f5bb960ba/handover` → **200**

```json
{
  "command_id": "d6d0eebe-8e3a-4e59-83b7-9272b3142153",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "dc1dc05f-bea8-44b4-96e6-b93f5bb960ba",
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
  "last_heartbeat_at": "2026-10-28T10:01:05.238808Z",
  "last_location_at": "2026-10-28T10:01:05.238808Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dc1dc05f-bea8-44b4-96e6-b93f5bb960ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:28Z",
    "sequence": 1793181688839
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "dc1dc05f-bea8-44b4-96e6-b93f5bb960ba",
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
  "last_heartbeat_at": "2026-10-28T10:01:28.855577Z",
  "last_location_at": "2026-10-28T10:01:28.855577Z",
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
  "session_id": "dc1dc05f-bea8-44b4-96e6-b93f5bb960ba",
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
  "last_heartbeat_at": "2026-10-28T10:01:28.855577Z",
  "last_location_at": "2026-10-28T10:01:28.855577Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc1dc05f-bea8-44b4-96e6-b93f5bb960ba/close` → **200**

```json
{
  "command_id": "a0321998-7442-41a3-9a50-706d597a0438",
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
  "correlation_id": "83198b45-0691-44b1-960b-9f4578408bd1"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676312079",
  "device_ref": "sandbox-29488"
}
```

```json
{
  "challenge_id": "166d30d5-cf34-451e-82d2-78f4f65878c5",
  "expires_at": "2026-10-28T10:06:29.659898949Z",
  "resend_available_at": "2026-10-28T10:01:30.659898949Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676312079` → **200**

```json
{
  "phone": "+380676312079",
  "audience": "CLIENT",
  "code": "907409",
  "sent_at": "2026-10-28T10:01:29.661514701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "166d30d5-cf34-451e-82d2-78f4f65878c5",
  "code": "907409",
  "device_ref": "sandbox-29488"
}
```

```json
{
  "session_id": "4f15682f-043a-4a48-a8df-8794cea5ff99",
  "subject": {
    "type": "CLIENT",
    "id": "59af9733-dd27-4b42-8580-ffd3ccb654b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWFmOTczMy1kZDI3LTRiNDItODU4MC1mZmQzY2NiNjU0YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNTg5LCJpYXQiOjE3OTMxODE2ODksImp0aSI6IjViZGZlOGRjLWE3MTItNGZmZC05ZTZkLTliZDNjYWIyNjhlMSIsInNpZCI6IjRmMTU2ODJmLTA0M2EtNGE0OC1hOGRmLTg3OTRjZWE1ZmY5OSJ9.UYba8_MUAS-qXTJxnH0WSRQ_5OwAasyaIdO9ekJyeaA",
  "access_expires_at": "2026-10-28T10:16:29.829469649Z",
  "refresh_token": "k4AmSiJJ2BKXPVCM0ipFayMeGJ1oACGqzOsDXZ41htY",
  "refresh_expires_at": "2026-11-27T10:01:29.829010628Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f4d7427c-8ede-4762-87d8-96e67722ad8c",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "640d5a45-52ec-4235-915b-a7a28c9b3fc9",
  "upload_path": "/api/rider/v1/uploads/640d5a45-52ec-4235-915b-a7a28c9b3fc9",
  "expires_at": "2026-10-28T10:16:29.984147276Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/640d5a45-52ec-4235-915b-a7a28c9b3fc9` → **200**

```json
{
  "file_id": "640d5a45-52ec-4235-915b-a7a28c9b3fc9",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "4d93e2f6-f5d7-478a-8061-c1de1c38b8df",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "640d5a45-52ec-4235-915b-a7a28c9b3fc9"
  ]
}
```

```json
{
  "id": "9b24afd0-ae36-4a13-bde6-77d06077d5f8",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "59af9733-dd27-4b42-8580-ffd3ccb654b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:01:30.166857Z",
  "updated_at": "2026-10-28T10:01:30.166857Z",
  "messages": [
    {
      "id": "bc6cbed8-2496-462e-b43f-ebb64ebd5aed",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "59af9733-dd27-4b42-8580-ffd3ccb654b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:01:30.168178Z",
      "attachments": [
        {
          "file_id": "640d5a45-52ec-4235-915b-a7a28c9b3fc9",
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
  "session_id": "ca399a9b-e847-4c0b-967b-09408b394bad",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1OTAsImlhdCI6MTc5MzE4MTY5MCwianRpIjoiZGUwYmI3MTktNjViZC00YjBjLTlkYWItMjYxMDJmYzU0MmFlIiwic2lkIjoiY2EzOTlhOWItZTg0Ny00YzBiLTk2N2ItMDk0MDhiMzk0YmFkIn0.yLCoRYpNyt7dFeC5m_WqiXgGzhDsG6eMDwfAOvQyq0A",
  "access_expires_at": "2026-10-28T10:16:30.54203325Z",
  "refresh_token": "Sr8zzzfnBcKS8WWIK3jXMq8ZtOX2dXk4IQcjnE_D4wc",
  "refresh_expires_at": "2026-10-28T22:01:30.541600284Z",
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
  "session_id": "b6e0d2cb-a3e9-4a43-8195-ab248a3bec6a",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1OTAsImlhdCI6MTc5MzE4MTY5MCwianRpIjoiYTkwMDIyMDQtYzFiNS00ODU1LTk5ZGQtNTExZDljYTgxNGQxIiwic2lkIjoiYjZlMGQyY2ItYTNlOS00YTQzLTgxOTUtYWIyNDhhM2JlYzZhIn0.rQsdObWDINgUT_MTdfZgdxIsfyBhjUMnLrV22_9soaY",
  "access_expires_at": "2026-10-28T10:16:30.915829236Z",
  "refresh_token": "L763R26D9grM2t_s9uXmR8c9mD3u5uuIQDOmPiJtpRs",
  "refresh_expires_at": "2026-10-28T22:01:30.91542653Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/9b24afd0-ae36-4a13-bde6-77d06077d5f8/attachments/640d5a45-52ec-4235-915b-a7a28c9b3fc9` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "5df1206d-b872-49c7-b08c-faab24f0dec8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "312de5e8-a4d1-49be-8c8d-8b4434b1e8b6",
  "upload_path": "/api/operator/v1/uploads/312de5e8-a4d1-49be-8c8d-8b4434b1e8b6",
  "expires_at": "2026-10-28T10:16:31.092291151Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/312de5e8-a4d1-49be-8c8d-8b4434b1e8b6` → **200**

```json
{
  "file_id": "312de5e8-a4d1-49be-8c8d-8b4434b1e8b6",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/9b24afd0-ae36-4a13-bde6-77d06077d5f8` → **200**

```json
{
  "id": "9b24afd0-ae36-4a13-bde6-77d06077d5f8",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "59af9733-dd27-4b42-8580-ffd3ccb654b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:01:30.166857Z",
  "updated_at": "2026-10-28T10:01:30.166857Z",
  "messages": [
    {
      "id": "bc6cbed8-2496-462e-b43f-ebb64ebd5aed",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "59af9733-dd27-4b42-8580-ffd3ccb654b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:01:30.168178Z",
      "attachments": [
        {
          "file_id": "640d5a45-52ec-4235-915b-a7a28c9b3fc9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/9b24afd0-ae36-4a13-bde6-77d06077d5f8/comments` → **200**

```json
{
  "command_id": "031b0f4f-8f5a-476b-b801-8b2c9374535d",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "312de5e8-a4d1-49be-8c8d-8b4434b1e8b6"
  ]
}
```

```json
{
  "id": "9b24afd0-ae36-4a13-bde6-77d06077d5f8",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "59af9733-dd27-4b42-8580-ffd3ccb654b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:01:30.166857Z",
  "updated_at": "2026-10-28T10:01:31.44808Z",
  "messages": [
    {
      "id": "bc6cbed8-2496-462e-b43f-ebb64ebd5aed",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "59af9733-dd27-4b42-8580-ffd3ccb654b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:01:30.168178Z",
      "attachments": [
        {
          "file_id": "640d5a45-52ec-4235-915b-a7a28c9b3fc9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "80b13bd3-89b8-4b68-8fc7-e8185243baa5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:01:31.447852Z",
      "attachments": [
        {
          "file_id": "312de5e8-a4d1-49be-8c8d-8b4434b1e8b6",
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

`GET /api/rider/v1/support/cases/9b24afd0-ae36-4a13-bde6-77d06077d5f8` → **200**

```json
{
  "id": "9b24afd0-ae36-4a13-bde6-77d06077d5f8",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "59af9733-dd27-4b42-8580-ffd3ccb654b5",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:01:30.166857Z",
  "updated_at": "2026-10-28T10:01:31.44808Z",
  "messages": [
    {
      "id": "bc6cbed8-2496-462e-b43f-ebb64ebd5aed",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "59af9733-dd27-4b42-8580-ffd3ccb654b5",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:01:30.168178Z",
      "attachments": [
        {
          "file_id": "640d5a45-52ec-4235-915b-a7a28c9b3fc9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "80b13bd3-89b8-4b68-8fc7-e8185243baa5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:01:31.447852Z",
      "attachments": [
        {
          "file_id": "312de5e8-a4d1-49be-8c8d-8b4434b1e8b6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/9b24afd0-ae36-4a13-bde6-77d06077d5f8/attachments/312de5e8-a4d1-49be-8c8d-8b4434b1e8b6` → **200**

Done: support case 9b24afd0-ae36-4a13-bde6-77d06077d5f8, rider attachment 640d5a45-52ec-4235-915b-a7a28c9b3fc9, operator attachment 312de5e8-a4d1-49be-8c8d-8b4434b1e8b6.

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
  "session_id": "45aae1f4-1e24-4df3-b11e-d17b825e2c60",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1OTIsImlhdCI6MTc5MzE4MTY5MiwianRpIjoiOGNlOWY4MmQtNTI1NS00ZWUyLTk5MDUtODMyYzNlYjU2OWI3Iiwic2lkIjoiNDVhYWUxZjQtMWUyNC00ZGYzLWIxMWUtZDE3YjgyNWUyYzYwIn0.hZrwOPSogs6FyfifC210uNRcqpJQCF6WM-8AEheUo7Y",
  "access_expires_at": "2026-10-28T10:16:32.025263648Z",
  "refresh_token": "cbkmA_hlAeUIwS8erlXApNJGQ3ZE0P1LXYEIcwQ62qk",
  "refresh_expires_at": "2026-10-28T22:01:32.024836295Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4096"
}
```

```json
{
  "challenge_id": "48a43258-5e4a-4c1a-ae32-913632f31232",
  "expires_at": "2026-10-28T10:06:32.169310777Z",
  "resend_available_at": "2026-10-28T10:01:33.169310777Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "703986",
  "sent_at": "2026-10-28T10:01:32.170972568Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48a43258-5e4a-4c1a-ae32-913632f31232",
  "code": "703986",
  "device_ref": "sandbox-4096"
}
```

```json
{
  "session_id": "2900777d-7664-45db-874c-322208d709f9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjU5MiwiaWF0IjoxNzkzMTgxNjkyLCJqdGkiOiIwZWJlNmI4OC1iOWMyLTQwZDUtYjkzMi00MTA4NWM4ZGUzODciLCJzaWQiOiIyOTAwNzc3ZC03NjY0LTQ1ZGItODc0Yy0zMjIyMDhkNzA5ZjkifQ.9jO9eYItuEZRXCHT0HTQmUO833PTL_-eHfFAa7ICyHU",
  "access_expires_at": "2026-10-28T10:16:32.343979429Z",
  "refresh_token": "T0Fms22evb4jeQbuvmZnbYCnPKFGmEty5qT3Kq_I4Hs",
  "refresh_expires_at": "2026-11-27T10:01:32.343592737Z",
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
      "actor_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:01:25.486977Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "314e0a1f-41b3-4a08-9bab-60b699abf030",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:01:26.309681Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "6e58b3b8-b929-4026-ae50-eb2219dc7581",
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
  "device_ref": "sandbox-26431"
}
```

```json
{
  "challenge_id": "72f47847-9179-497f-8953-0ee6abcaf530",
  "expires_at": "2026-10-28T10:06:32.957114251Z",
  "resend_available_at": "2026-10-28T10:01:33.957114251Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "644584",
  "sent_at": "2026-10-28T10:01:32.969439924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72f47847-9179-497f-8953-0ee6abcaf530",
  "code": "644584",
  "device_ref": "sandbox-26431"
}
```

```json
{
  "session_id": "344d9d50-da15-488c-894b-5532080f9efd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjU5MywiaWF0IjoxNzkzMTgxNjkzLCJqdGkiOiIzYWJiNDVmMS1hOGFmLTQ1MmQtYTU5ZC0wODQxYjVjMTBjOTMiLCJzaWQiOiIzNDRkOWQ1MC1kYTE1LTQ4OGMtODk0Yi01NTMyMDgwZjllZmQifQ.colxbkNp6hdswp1vrZX11azmS3iVAHxPTKnDgDXo0Zo",
  "access_expires_at": "2026-10-28T10:16:33.138635204Z",
  "refresh_token": "ASSK7tl5D_xfqXQHj3SaBU_t4JN_bQv7FzryXfm5WaU",
  "refresh_expires_at": "2026-11-27T10:01:33.138278267Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:01:09.253007Z",
  "last_location_at": "2026-10-28T10:01:09.253007Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/handover` → **200**

```json
{
  "command_id": "f6075466-27ac-4622-a593-698df79b2e3d",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:01:09.253007Z",
  "last_location_at": "2026-10-28T10:01:09.253007Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:33Z",
    "sequence": 1793181693581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:01:33.597161Z",
  "last_location_at": "2026-10-28T10:01:33.597161Z",
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
  "command_id": "35b13041-0779-4f10-965c-586e797cab16",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:33Z",
    "sequence": 1793181693891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4785bc02-0576-402f-a1eb-8365c18d1345",
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
  "last_heartbeat_at": "2026-10-28T10:01:33.906686Z",
  "last_location_at": "2026-10-28T10:01:33.906686Z",
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
  "session_id": "c1311ff0-2496-46b0-9e52-37f179698361",
  "subject": {
    "type": "STAFF",
    "id": "314e0a1f-41b3-4a08-9bab-60b699abf030"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMTRlMGExZi00MWIzLTRhMDgtOWJhYi02MGI2OTlhYmYwMzAiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI1OTQsImlhdCI6MTc5MzE4MTY5NCwianRpIjoiZjE3MGJjOWYtM2I5NS00NjA0LTkyMmItOTYwODA3N2Q1Yzk3Iiwic2lkIjoiYzEzMTFmZjAtMjQ5Ni00NmIwLTllNTItMzdmMTc5Njk4MzYxIn0._TU9vVvrdcmQOT9HySXiUdL1WZ_vJQ-YmeWuheEmDBM",
  "access_expires_at": "2026-10-28T10:16:34.28528105Z",
  "refresh_token": "54kjWqtpaMyfghsVmR8x1heuPbuYTbFUuV6GPbx385k",
  "refresh_expires_at": "2026-10-28T22:01:34.284839696Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6252e67e-d0b5-4297-a5cb-f0cc0c2e6ca2",
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
  "id": "ab7af120-d0f7-44c1-b0a5-08f07b4d8878",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:06:34.432758Z",
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
  "command_id": "a05a51e4-c602-4edb-aa45-d38e9c8df908",
  "quote_id": "ab7af120-d0f7-44c1-b0a5-08f07b4d8878",
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
  "id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
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
  "created_at": "2026-10-28T10:01:34.612878Z",
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
    "id": "39dafff3-002f-4ee5-ad58-9bc0afe43eda",
    "order_id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
    "expires_at": "2026-10-28T10:01:49.616164Z",
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

`POST /api/driver/v1/offers/39dafff3-002f-4ee5-ad58-9bc0afe43eda/accept` → **200**

```json
{
  "command_id": "a94ac88a-7220-43bb-8421-21cac7a58f33"
}
```

```json
{
  "id": "9463de1d-b66b-4f0a-95ca-9e4d1dd62a18",
  "order_id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "71fc424d-68f9-4ac9-9fdc-b8789cb6f01c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "71fc424d-68f9-4ac9-9fdc-b8789cb6f01c",
  "order_id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
  "assignment_id": "9463de1d-b66b-4f0a-95ca-9e4d1dd62a18",
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

`POST /api/driver/v1/work-sessions/4785bc02-0576-402f-a1eb-8365c18d1345/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:01:35Z",
    "sequence": 1793181695397
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4785bc02-0576-402f-a1eb-8365c18d1345",
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
  "last_heartbeat_at": "2026-10-28T10:01:35.414386Z",
  "last_location_at": "2026-10-28T10:01:35.414386Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/71fc424d-68f9-4ac9-9fdc-b8789cb6f01c/arrive` → **200**

```json
{
  "command_id": "1c781f95-c670-4b91-8d64-f43442b9e6e5",
  "expected_version": 0
}
```

```json
{
  "id": "71fc424d-68f9-4ac9-9fdc-b8789cb6f01c",
  "order_id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
  "assignment_id": "9463de1d-b66b-4f0a-95ca-9e4d1dd62a18",
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
  "arrived_at": "2026-10-28T10:01:35.566825Z",
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

`POST /api/driver/v1/trips/71fc424d-68f9-4ac9-9fdc-b8789cb6f01c/start` → **200**

```json
{
  "command_id": "0e6016e1-8680-4b42-84e9-8cd5d4403e1b",
  "expected_version": 1
}
```

```json
{
  "id": "71fc424d-68f9-4ac9-9fdc-b8789cb6f01c",
  "order_id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
  "assignment_id": "9463de1d-b66b-4f0a-95ca-9e4d1dd62a18",
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
  "arrived_at": "2026-10-28T10:01:35.566825Z",
  "started_at": "2026-10-28T10:01:35.729691Z",
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

`POST /api/driver/v1/trips/71fc424d-68f9-4ac9-9fdc-b8789cb6f01c/complete` → **200**

```json
{
  "command_id": "3bf18c34-be97-4503-9628-c43d4b817118",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:01:35Z",
  "cash_received": true
}
```

```json
{
  "id": "71fc424d-68f9-4ac9-9fdc-b8789cb6f01c",
  "order_id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
  "assignment_id": "9463de1d-b66b-4f0a-95ca-9e4d1dd62a18",
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
  "arrived_at": "2026-10-28T10:01:35.566825Z",
  "started_at": "2026-10-28T10:01:35.729691Z",
  "completed_at": "2026-10-28T10:01:35.887585Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/a5d1adf0-0adc-4a5f-81d5-000714df2094` → **200**

```json
{
  "id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
  "short_number": 20,
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
    "id": "9463de1d-b66b-4f0a-95ca-9e4d1dd62a18",
    "order_id": "a5d1adf0-0adc-4a5f-81d5-000714df2094",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "71fc424d-68f9-4ac9-9fdc-b8789cb6f01c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:01:34.612878Z",
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
  "session_id": "2ecf9258-1a37-4c38-8406-2a80c9c0deb3",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:01:33.597161Z",
  "last_location_at": "2026-10-28T10:01:33.597161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ecf9258-1a37-4c38-8406-2a80c9c0deb3/close` → **200**

```json
{
  "command_id": "8bd8058b-08f0-45f9-9e7b-2584bf95a6d5",
  "expected_version": 4
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
  "session_id": "4785bc02-0576-402f-a1eb-8365c18d1345",
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
  "last_heartbeat_at": "2026-10-28T10:01:35.414386Z",
  "last_location_at": "2026-10-28T10:01:35.414386Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4785bc02-0576-402f-a1eb-8365c18d1345/close` → **200**

```json
{
  "command_id": "11e151f0-1b6f-4767-a34d-9e72b068eb5f",
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

Done: terminal order a5d1adf0-0adc-4a5f-81d5-000714df2094 by Andrii (5a000000-0000-4000-8000-000000000403).
