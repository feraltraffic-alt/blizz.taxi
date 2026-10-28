# Sandbox transcript (2026-10-28T10:03:11Z, b954495)

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
  "correlation_id": "97dbd265-c9b5-4741-bd90-e57bf3dfcb74"
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
  "session_id": "bb239d2d-f8af-489c-974b-4a32a116f3f6",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI2OTIsImlhdCI6MTc5MzE4MTc5MiwianRpIjoiMDA4ZjU3YzMtMzljMi00ZjhjLWJiNjAtZDliZjY3ZTdhZTBiIiwic2lkIjoiYmIyMzlkMmQtZjhhZi00ODljLTk3NGItNGEzMmExMTZmM2Y2In0.ZxUR6TCMtAitNNZNEPeAEYXs6PyvKH0u3szWNxEMunk",
  "access_expires_at": "2026-10-28T10:18:12.182556997Z",
  "refresh_token": "AitaD8V0v86nSn_JW6CyPHuyA1ow9c2H-pfie9v6hOU",
  "refresh_expires_at": "2026-10-28T22:03:12.180252744Z",
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
  "session_id": "dc7ad1eb-172b-4596-aef0-4f388d97c584",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI2OTMsImlhdCI6MTc5MzE4MTc5MywianRpIjoiOWYxZmEwNTItYjVlMS00MDZhLWFkOTctYjc3NzNhOGRmYjFkIiwic2lkIjoiZGM3YWQxZWItMTcyYi00NTk2LWFlZjAtNGYzODhkOTdjNTg0In0.2veqOR3tQMPAvn44U3GWLzP44sDXgXdCtisBJgejBOQ",
  "access_expires_at": "2026-10-28T10:18:13.498419283Z",
  "refresh_token": "IrCeyc7MigIUJUQzCeRqZgRxIFgFlumkEXo7ad-4u1o",
  "refresh_expires_at": "2026-10-28T22:03:13.497491885Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "48b6cc1d-17fe-4299-801c-c4ea53d92957",
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
  "id": "12ed0c86-0cf2-4758-9811-0564ddb10634",
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
  "created_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "created_at": "2026-10-28T10:03:13.562988Z",
  "updated_at": "2026-10-28T10:03:13.562988Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637415661",
  "device_ref": "sandbox-12880"
}
```

```json
{
  "challenge_id": "c04a9cf2-023d-4ae5-9132-f4f5ec247a30",
  "expires_at": "2026-10-28T10:08:13.616296633Z",
  "resend_available_at": "2026-10-28T10:03:14.616296633Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637415661` → **200**

```json
{
  "phone": "+380637415661",
  "audience": "CLIENT",
  "code": "790435",
  "sent_at": "2026-10-28T10:03:13.626023401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c04a9cf2-023d-4ae5-9132-f4f5ec247a30",
  "code": "790435",
  "device_ref": "sandbox-12880"
}
```

```json
{
  "session_id": "690e73d5-eb86-439d-b4eb-6b82011f9640",
  "subject": {
    "type": "CLIENT",
    "id": "340a85f4-175b-46eb-a9bc-8ee7e513857b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDBhODVmNC0xNzViLTQ2ZWItYTliYy04ZWU3ZTUxMzg1N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNjkzLCJpYXQiOjE3OTMxODE3OTMsImp0aSI6IjliMGQ0ZjE1LWVhODgtNDVmZC1iZDZjLWIwMzE5YjA5YjJmNyIsInNpZCI6IjY5MGU3M2Q1LWViODYtNDM5ZC1iNGViLTZiODIwMTFmOTY0MCJ9.jDUb9kCARgQ5PbCw6KNlzuJnUiiRVoWwBWL69QqaweA",
  "access_expires_at": "2026-10-28T10:18:13.729077327Z",
  "refresh_token": "ohH_DDqvTQxIMzantQLojGU6hhjDnvuI1WpL3VwOnkM",
  "refresh_expires_at": "2026-11-27T10:03:13.727818781Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637415661` → **200**

```json
{
  "client_id": "340a85f4-175b-46eb-a9bc-8ee7e513857b"
}
```

`POST /api/admin/v1/rider-wallets/340a85f4-175b-46eb-a9bc-8ee7e513857b/top-ups` → **201**

```json
{
  "command_id": "758cfdc4-db1a-4de4-92f1-c7e67df5af15",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "340a85f4-175b-46eb-a9bc-8ee7e513857b",
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
      "id": "a46bf193-27c9-4128-9a2e-d72fbb618381",
      "at": "2026-10-28T10:03:13.814208Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "525f3cef-732b-4ebd-969f-90d9e82692c5",
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
  "id": "e2c4d723-84a3-490b-b16e-0a03b1f90cde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:08:13.970001Z",
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
      "id": "12ed0c86-0cf2-4758-9811-0564ddb10634",
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
  "device_ref": "sandbox-26173"
}
```

```json
{
  "challenge_id": "d48b20e9-b984-4974-941a-37f8b077fb48",
  "expires_at": "2026-10-28T10:08:14.033870045Z",
  "resend_available_at": "2026-10-28T10:03:15.033870045Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "949737",
  "sent_at": "2026-10-28T10:03:14.038149057Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d48b20e9-b984-4974-941a-37f8b077fb48",
  "code": "949737",
  "device_ref": "sandbox-26173"
}
```

```json
{
  "session_id": "7f45df26-cb51-4df1-8c23-c11257f4123b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjY5NCwiaWF0IjoxNzkzMTgxNzk0LCJqdGkiOiI4NGZjZWJjOS0zODA5LTQ1MzUtODEwOS1lYjMyNWQ1ZGQ4OTciLCJzaWQiOiI3ZjQ1ZGYyNi1jYjUxLTRkZjEtOGMyMy1jMTEyNTdmNDEyM2IifQ.xupF9TB0X_3gRi0XBoa3ZGIRZEeD3Xt79HgXWgRXleU",
  "access_expires_at": "2026-10-28T10:18:14.098482132Z",
  "refresh_token": "j0tdCzyurQTujH_DKOQbjKm9DR2A7FFdIUya97uM3ZI",
  "refresh_expires_at": "2026-11-27T10:03:14.09725173Z",
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
  "command_id": "396e8935-b303-44bf-a7f1-07c6079d3f4f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:14Z",
    "sequence": 1793181794172
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f25f3d5-193f-4e69-8f09-29c05c655217",
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
  "last_heartbeat_at": "2026-10-28T10:03:14.222025Z",
  "last_location_at": "2026-10-28T10:03:14.222025Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c667e896-0d17-4077-947a-50546a9db603",
  "quote_id": "e2c4d723-84a3-490b-b16e-0a03b1f90cde",
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
  "id": "cee9286d-c85f-44ef-9720-22e2595759a6",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "340a85f4-175b-46eb-a9bc-8ee7e513857b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:03:14.319569Z",
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
  "client_id": "340a85f4-175b-46eb-a9bc-8ee7e513857b",
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
      "id": "a46bf193-27c9-4128-9a2e-d72fbb618381",
      "at": "2026-10-28T10:03:13.814208Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
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
    "id": "9663887e-7dfd-4a67-b85c-b6a0db20100c",
    "order_id": "cee9286d-c85f-44ef-9720-22e2595759a6",
    "expires_at": "2026-10-28T10:03:29.335364Z",
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

`POST /api/driver/v1/offers/9663887e-7dfd-4a67-b85c-b6a0db20100c/accept` → **200**

```json
{
  "command_id": "7eb90fcf-153e-43d8-9a1e-44b3ae4d5be8"
}
```

```json
{
  "id": "856d1f78-1c63-4994-bee2-f4e8f2457649",
  "order_id": "cee9286d-c85f-44ef-9720-22e2595759a6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "38a16358-8652-406b-88a0-d50be82b2e6d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "38a16358-8652-406b-88a0-d50be82b2e6d",
  "order_id": "cee9286d-c85f-44ef-9720-22e2595759a6",
  "assignment_id": "856d1f78-1c63-4994-bee2-f4e8f2457649",
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

`POST /api/driver/v1/work-sessions/3f25f3d5-193f-4e69-8f09-29c05c655217/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:14Z",
    "sequence": 1793181794533
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f25f3d5-193f-4e69-8f09-29c05c655217",
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
  "last_heartbeat_at": "2026-10-28T10:03:14.559149Z",
  "last_location_at": "2026-10-28T10:03:14.559149Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/38a16358-8652-406b-88a0-d50be82b2e6d/arrive` → **200**

```json
{
  "command_id": "2af08728-f297-47f7-9c1a-dea037d853ca",
  "expected_version": 0
}
```

```json
{
  "id": "38a16358-8652-406b-88a0-d50be82b2e6d",
  "order_id": "cee9286d-c85f-44ef-9720-22e2595759a6",
  "assignment_id": "856d1f78-1c63-4994-bee2-f4e8f2457649",
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
  "arrived_at": "2026-10-28T10:03:14.609101Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/38a16358-8652-406b-88a0-d50be82b2e6d/start` → **200**

```json
{
  "command_id": "bb955e71-5d60-4959-add1-b95909d1b990",
  "expected_version": 1
}
```

```json
{
  "id": "38a16358-8652-406b-88a0-d50be82b2e6d",
  "order_id": "cee9286d-c85f-44ef-9720-22e2595759a6",
  "assignment_id": "856d1f78-1c63-4994-bee2-f4e8f2457649",
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
  "arrived_at": "2026-10-28T10:03:14.609101Z",
  "started_at": "2026-10-28T10:03:14.655717Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/38a16358-8652-406b-88a0-d50be82b2e6d/complete` → **200**

```json
{
  "command_id": "7978a599-bae2-4a34-9542-70d0cc0f1430",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:03:14Z",
  "cash_received": true
}
```

```json
{
  "id": "38a16358-8652-406b-88a0-d50be82b2e6d",
  "order_id": "cee9286d-c85f-44ef-9720-22e2595759a6",
  "assignment_id": "856d1f78-1c63-4994-bee2-f4e8f2457649",
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
  "arrived_at": "2026-10-28T10:03:14.609101Z",
  "started_at": "2026-10-28T10:03:14.655717Z",
  "completed_at": "2026-10-28T10:03:14.723649Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "340a85f4-175b-46eb-a9bc-8ee7e513857b",
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
      "id": "b9a199d1-c677-47da-af66-21ddc246491c",
      "at": "2026-10-28T10:03:15.545094Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "cee9286d-c85f-44ef-9720-22e2595759a6"
    },
    {
      "id": "a46bf193-27c9-4128-9a2e-d72fbb618381",
      "at": "2026-10-28T10:03:13.814208Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/12ed0c86-0cf2-4758-9811-0564ddb10634/archive` → **200**

```json
{
  "command_id": "5e69a6a4-24a5-440a-a3f4-854a9dc94062",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "12ed0c86-0cf2-4758-9811-0564ddb10634",
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
  "created_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "created_at": "2026-10-28T10:03:13.562988Z",
  "updated_at": "2026-10-28T10:03:17.814985Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f25f3d5-193f-4e69-8f09-29c05c655217",
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
  "last_heartbeat_at": "2026-10-28T10:03:14.559149Z",
  "last_location_at": "2026-10-28T10:03:14.559149Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3f25f3d5-193f-4e69-8f09-29c05c655217/close` → **200**

```json
{
  "command_id": "b8802557-b1ad-4f3e-b78e-d7f1219c8513",
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

Done: order cee9286d-c85f-44ef-9720-22e2595759a6.

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
  "session_id": "04bc7cb8-827b-4c63-87ce-9615dbced6d3",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI2OTgsImlhdCI6MTc5MzE4MTc5OCwianRpIjoiYmNkMmExNDMtMDNjMC00MzY1LTg4YjMtMjYwZTgyYzU1ZTRiIiwic2lkIjoiMDRiYzdjYjgtODI3Yi00YzYzLTg3Y2UtOTYxNWRiY2VkNmQzIn0.BUaQI0Gw8Dmm3GshqJfKOQs6djBbYZoGKHE_nC0XdZg",
  "access_expires_at": "2026-10-28T10:18:18.236416311Z",
  "refresh_token": "IwZlebU39inUQbOpnFinCOOiGxEjXbEocQr8dvYuQ0M",
  "refresh_expires_at": "2026-10-28T22:03:18.235459979Z",
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
  "command_id": "1bcf5449-a679-4c6f-a4aa-b2c79259ec34",
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
  "session_id": "2fd0c8ef-f0ef-4a4f-b3bb-c6bfc1a20327",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI2OTgsImlhdCI6MTc5MzE4MTc5OCwianRpIjoiMThlMDQ5YjItMDBkZC00MzNjLWI3ZTQtNDg3NmQ0NzY2NWMwIiwic2lkIjoiMmZkMGM4ZWYtZjBlZi00YTRmLWIzYmItYzZiZmMxYTIwMzI3In0.-fncipsftUxJnO_13rTBtn2rVkXJ8SO58CWBQT2vU4w",
  "access_expires_at": "2026-10-28T10:18:18.642530429Z",
  "refresh_token": "N7SrGwVW_13sjEPTpYGk-ROPu2Kgf_V6v5Kzw5hK044",
  "refresh_expires_at": "2026-10-28T22:03:18.641735207Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.202391527",
    "linkedid": "1730052700.202391527",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677784549"
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
    "id": "1730052700.202391527",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "e5ed81f3-a055-4659-8cd2-4a53177738f0",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677784549",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:03:18.672603Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:03:18.697508Z",
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
    "id": "1730052600.891929974",
    "linkedid": "1730052600.891929974",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677784549"
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
      "id": "cbe361e3-2165-4f43-8fb5-347bee9b7a6f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677784549",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:03:18.765368Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/cbe361e3-2165-4f43-8fb5-347bee9b7a6f/answer` → **200**

```json
{
  "command_id": "6a2fca9a-7ee6-4c24-860a-f33c98bc0882"
}
```

```json
{
  "id": "cbe361e3-2165-4f43-8fb5-347bee9b7a6f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677784549",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "order_ids": [],
  "started_at": "2026-10-28T10:03:18.765368Z",
  "answered_at": "2026-10-28T10:03:18.831843Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.891929974",
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
    "id": "1730052600.891929974",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "cbe361e3-2165-4f43-8fb5-347bee9b7a6f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677784549",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [],
      "started_at": "2026-10-28T10:03:18.765368Z",
      "answered_at": "2026-10-28T10:03:18.831843Z",
      "ended_at": "2026-10-28T10:03:18.884934Z",
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
      "id": "cbe361e3-2165-4f43-8fb5-347bee9b7a6f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677784549",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [],
      "started_at": "2026-10-28T10:03:18.765368Z",
      "answered_at": "2026-10-28T10:03:18.831843Z",
      "ended_at": "2026-10-28T10:03:18.884934Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:03:20.417479Z"
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
      "id": "cbe361e3-2165-4f43-8fb5-347bee9b7a6f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677784549",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [],
      "started_at": "2026-10-28T10:03:18.765368Z",
      "answered_at": "2026-10-28T10:03:18.831843Z",
      "ended_at": "2026-10-28T10:03:18.884934Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:03:20.417479Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/cbe361e3-2165-4f43-8fb5-347bee9b7a6f/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/cbe361e3-2165-4f43-8fb5-347bee9b7a6f/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=cbe361e3-2165-4f43-8fb5-347bee9b7a6f` → **200**

```json
{
  "changes": [
    {
      "id": "ba2ec14a-1fbe-42b1-b2e5-36be3c990422",
      "occurred_at": "2026-10-28T10:03:21.045686Z",
      "actor_type": "STAFF",
      "actor_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "cbe361e3-2165-4f43-8fb5-347bee9b7a6f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b586f395-9dd1-45a7-affb-4e8bd2fcd3e7\", \"order_ids\": []}",
      "correlation_id": "2c2d9ae7-d463-4b83-af34-a7f754dff098"
    },
    {
      "id": "23fc8cb0-8ec7-4c6a-9517-618339a7a260",
      "occurred_at": "2026-10-28T10:03:21.007394Z",
      "actor_type": "STAFF",
      "actor_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "cbe361e3-2165-4f43-8fb5-347bee9b7a6f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"b586f395-9dd1-45a7-affb-4e8bd2fcd3e7\", \"order_ids\": []}",
      "correlation_id": "11453916-66ff-44db-8f89-1d0e8b1098cb"
    }
  ]
}
```

Done: call cbe361e3-2165-4f43-8fb5-347bee9b7a6f recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632873390",
  "device_ref": "sandbox-29353"
}
```

```json
{
  "challenge_id": "c6ffc6fb-9acb-4ba7-9d4a-fbe9aa8817e4",
  "expires_at": "2026-10-28T10:08:21.131952736Z",
  "resend_available_at": "2026-10-28T10:03:22.131952736Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632873390` → **200**

```json
{
  "phone": "+380632873390",
  "audience": "CLIENT",
  "code": "195390",
  "sent_at": "2026-10-28T10:03:21.135615211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6ffc6fb-9acb-4ba7-9d4a-fbe9aa8817e4",
  "code": "195390",
  "device_ref": "sandbox-29353"
}
```

```json
{
  "session_id": "5a1a55c9-d174-4c4b-9b13-e4c722f2e7c3",
  "subject": {
    "type": "CLIENT",
    "id": "53bbf424-00bc-4f77-8c61-1295b1d08b2b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2JiZjQyNC0wMGJjLTRmNzctOGM2MS0xMjk1YjFkMDhiMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzAxLCJpYXQiOjE3OTMxODE4MDEsImp0aSI6ImZhZGIyNGNjLTkwNTYtNGQwZC04MTJjLTA3M2NkMmUwMWRhMiIsInNpZCI6IjVhMWE1NWM5LWQxNzQtNGM0Yi05YjEzLWU0YzcyMmYyZTdjMyJ9.VHBdXNplx-5bY8TqcFhEueKTX1qkfXzYRyEIY06jD4I",
  "access_expires_at": "2026-10-28T10:18:21.19350135Z",
  "refresh_token": "ZMThyESbd6SdDpycOilWS0mbyYATXMzMuua-SLoWEUY",
  "refresh_expires_at": "2026-11-27T10:03:21.192788309Z",
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
  "device_ref": "sandbox-16071"
}
```

```json
{
  "challenge_id": "f9d72a13-db69-40ff-b542-a68575091a8f",
  "expires_at": "2026-10-28T10:08:21.249568636Z",
  "resend_available_at": "2026-10-28T10:03:22.249568636Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "022482",
  "sent_at": "2026-10-28T10:03:21.253193941Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9d72a13-db69-40ff-b542-a68575091a8f",
  "code": "022482",
  "device_ref": "sandbox-16071"
}
```

```json
{
  "session_id": "7be8976b-6bfc-4eb4-aec9-9164954c9323",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjcwMSwiaWF0IjoxNzkzMTgxODAxLCJqdGkiOiI4MGE5MWIyNC00OGQzLTQzMTItOWJlNi03ODMwN2FiYmI0N2UiLCJzaWQiOiI3YmU4OTc2Yi02YmZjLTRlYjQtYWVjOS05MTY0OTU0YzkzMjMifQ.8n6b_C4C3fA3WtQ5BEIZFp902CMBUcrNd5WkP36fe3c",
  "access_expires_at": "2026-10-28T10:18:21.312601566Z",
  "refresh_token": "6R9rzsOEvfxPFyXLNuXOWgEXQpeBVkOtOJYakECptYs",
  "refresh_expires_at": "2026-11-27T10:03:21.311796746Z",
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
  "session_id": "5f228169-7351-4598-a957-e6bc3f83ea6d",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MDEsImlhdCI6MTc5MzE4MTgwMSwianRpIjoiYTY3NmUxMTktZTIzNi00MWUwLWI3ZmQtYzc1MzZlNGVmMTdjIiwic2lkIjoiNWYyMjgxNjktNzM1MS00NTk4LWE5NTctZTZiYzNmODNlYTZkIn0.1xRzJyE6ASKpgLDhJAiNZd1O2sJb22yYDmb8M_VnjPQ",
  "access_expires_at": "2026-10-28T10:18:21.658779344Z",
  "refresh_token": "7KJPK3t2lpHTVYJkCl9Zda7HLO4EvK9VfiqLxjWQcOw",
  "refresh_expires_at": "2026-10-28T22:03:21.658113754Z",
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
  "session_id": "89db912d-207a-4516-8e5f-7ebc9140de17",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MDEsImlhdCI6MTc5MzE4MTgwMSwianRpIjoiNmNlM2QzZWQtZTEyMi00MDdhLThkYzEtMzQzYWI2OTIwMGZiIiwic2lkIjoiODlkYjkxMmQtMjA3YS00NTE2LThlNWYtN2ViYzkxNDBkZTE3In0.pHjEH4TJ1VFvYkIae4YlSPE2cT4YpV0SZtpMhe0Pcrs",
  "access_expires_at": "2026-10-28T10:18:21.981622131Z",
  "refresh_token": "AvizJdkdUk9YTNCf-5Xq6xCfMKZED-MWUczlSazyndQ",
  "refresh_expires_at": "2026-10-28T22:03:21.980946792Z",
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
  "command_id": "a98be225-0afa-4ba3-92b9-b1ad9ffd789b",
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
  "id": "96c577ad-6fcf-4561-b2f0-98f588766a38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:08:22.047986Z",
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
  "command_id": "3b48e850-e1f8-4d79-9900-bece430d7822",
  "quote_id": "96c577ad-6fcf-4561-b2f0-98f588766a38",
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
  "id": "c2889cc8-ece3-4b23-ab2d-0ab629ba3ce5",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53bbf424-00bc-4f77-8c61-1295b1d08b2b",
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
  "created_at": "2026-10-28T10:03:22.094144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c2889cc8-ece3-4b23-ab2d-0ab629ba3ce5` → **200**

```json
{
  "id": "c2889cc8-ece3-4b23-ab2d-0ab629ba3ce5",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53bbf424-00bc-4f77-8c61-1295b1d08b2b",
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
  "created_at": "2026-10-28T10:03:22.094144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/c2889cc8-ece3-4b23-ab2d-0ab629ba3ce5/cancel` → **200**

```json
{
  "command_id": "4ded9ee3-d311-4d29-825a-bec2caa5bc21",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c2889cc8-ece3-4b23-ab2d-0ab629ba3ce5",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "53bbf424-00bc-4f77-8c61-1295b1d08b2b",
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
  "created_at": "2026-10-28T10:03:22.094144Z",
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
  "command_id": "d37a9943-b46c-4c73-95ca-42aac453797f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:22Z",
    "sequence": 1793181802239
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "87dd5156-1ac9-4b2c-8e1f-23dd2f39b762",
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
  "last_heartbeat_at": "2026-10-28T10:03:22.259354Z",
  "last_location_at": "2026-10-28T10:03:22.259354Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25276"
}
```

```json
{
  "challenge_id": "b1c701a7-5e0b-4e01-9a3e-14bd0d24c20f",
  "expires_at": "2026-10-28T10:08:22.290880444Z",
  "resend_available_at": "2026-10-28T10:03:23.290880444Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "013329",
  "sent_at": "2026-10-28T10:03:22.294420481Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1c701a7-5e0b-4e01-9a3e-14bd0d24c20f",
  "code": "013329",
  "device_ref": "sandbox-25276"
}
```

```json
{
  "session_id": "2b02c025-0fa6-415b-b806-9653a2eae787",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjcwMiwiaWF0IjoxNzkzMTgxODAyLCJqdGkiOiIwZmIyYzM3MS1mZjA3LTQ2ZjAtYTE3ZC1iMGI4ZmY5NTVjZmQiLCJzaWQiOiIyYjAyYzAyNS0wZmE2LTQxNWItYjgwNi05NjUzYTJlYWU3ODcifQ.-Lfq-wMjAg44oR8Igaqk4Gua-2f48OYifkcQa6ziJzY",
  "access_expires_at": "2026-10-28T10:18:22.353993694Z",
  "refresh_token": "BgXbL41r54tZcdPfSbvwLtdR35E5q1bdgN6c11Ip8hQ",
  "refresh_expires_at": "2026-11-27T10:03:22.353260388Z",
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
  "command_id": "6f03330e-d96f-4886-a4e6-3976541b9000",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:22Z",
    "sequence": 1793181802407
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e5d8f366-fa76-42a3-8442-0beebacd18c8",
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
  "last_heartbeat_at": "2026-10-28T10:03:22.426279Z",
  "last_location_at": "2026-10-28T10:03:22.426279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f36bb76d-d641-4560-8bd6-0c30337d3a5f",
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
  "id": "8adec6aa-38d1-4189-98c3-93b477a3f5d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:08:22.468923Z",
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
  "command_id": "f86e48a3-0bd6-473a-acf2-fe237c645f3e",
  "quote_id": "8adec6aa-38d1-4189-98c3-93b477a3f5d2",
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
  "id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53bbf424-00bc-4f77-8c61-1295b1d08b2b",
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
  "created_at": "2026-10-28T10:03:22.511542Z",
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
    "id": "82662327-6633-44fd-86de-4fbd3cef183d",
    "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
    "expires_at": "2026-10-28T10:03:37.515892Z",
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

`POST /api/driver/v1/offers/82662327-6633-44fd-86de-4fbd3cef183d/accept` → **200**

```json
{
  "command_id": "15b42512-6709-499c-8cac-300b8bc67fd6"
}
```

```json
{
  "id": "0c84fe13-e13e-4dba-9345-c28d817d29ab",
  "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "58ccb663-b25f-4938-957e-2b538baf33ec",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "58ccb663-b25f-4938-957e-2b538baf33ec",
  "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
  "assignment_id": "0c84fe13-e13e-4dba-9345-c28d817d29ab",
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

`POST /api/driver/v1/trips/58ccb663-b25f-4938-957e-2b538baf33ec/cancel` → **200**

```json
{
  "command_id": "bf133f5c-4b58-433b-b4a6-03c0461e33b6",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "58ccb663-b25f-4938-957e-2b538baf33ec",
  "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
  "assignment_id": "0c84fe13-e13e-4dba-9345-c28d817d29ab",
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

`GET /api/rider/v1/orders/fd48be1c-5258-4e57-a70c-5ea744c0aa56` → **200**

```json
{
  "id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "53bbf424-00bc-4f77-8c61-1295b1d08b2b",
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
    "id": "0c84fe13-e13e-4dba-9345-c28d817d29ab",
    "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "58ccb663-b25f-4938-957e-2b538baf33ec",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:03:22.511542Z",
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
    "id": "d4355203-0e25-407f-ada7-8b155c13594f",
    "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
    "expires_at": "2026-10-28T10:03:37.671556Z",
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

`POST /api/driver/v1/offers/d4355203-0e25-407f-ada7-8b155c13594f/accept` → **200**

```json
{
  "command_id": "d0e1ed46-e0c2-42af-9a29-e1a57497e706"
}
```

```json
{
  "id": "c8e8d6ec-c26e-4a2b-8eb8-7787a632c4a2",
  "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af9fd38c-3f32-4751-82d8-055f38c6445a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af9fd38c-3f32-4751-82d8-055f38c6445a",
  "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
  "assignment_id": "c8e8d6ec-c26e-4a2b-8eb8-7787a632c4a2",
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

`POST /api/driver/v1/trips/af9fd38c-3f32-4751-82d8-055f38c6445a/cancel` → **200**

```json
{
  "command_id": "2bbcbc09-65c3-45d5-99ec-efc3290610c1",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "af9fd38c-3f32-4751-82d8-055f38c6445a",
  "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
  "assignment_id": "c8e8d6ec-c26e-4a2b-8eb8-7787a632c4a2",
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
    "id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:03:22.511542Z",
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
    "id": "c2889cc8-ece3-4b23-ab2d-0ab629ba3ce5",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:03:22.094144Z",
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

`GET /api/operator/v1/orders/fd48be1c-5258-4e57-a70c-5ea744c0aa56/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:03:22.512289Z",
      "actor": {
        "type": "CLIENT",
        "id": "53bbf424-00bc-4f77-8c61-1295b1d08b2b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
        "quote_id": "8adec6aa-38d1-4189-98c3-93b477a3f5d2",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "4ee318d9-7c30-4d02-908e-129fc4689e25"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:03:22.514742Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
        "attempt_id": "a4d17526-f810-4092-9682-68699280eb76",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4ee318d9-7c30-4d02-908e-129fc4689e25"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:03:22.522569Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "82662327-6633-44fd-86de-4fbd3cef183d",
        "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "4ee318d9-7c30-4d02-908e-129fc4689e25"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:03:22.586846Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "82662327-6633-44fd-86de-4fbd3cef183d",
        "order_id": "fd48be1c-5258-4e57-a70c-5ea744c0aa56",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0c84fe13-e13e-4dba-9345-c28d817d29ab"
      },
      "correlation_id": "177bf894-8934-4fae-ae92-2f0afbb83060"
```

Done: orders c2889cc8-ece3-4b23-ab2d-0ab629ba3ce5, fd48be1c-5258-4e57-a70c-5ea744c0aa56.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732877674",
  "device_ref": "sandbox-21633"
}
```

```json
{
  "challenge_id": "a3c9d46a-0f58-4c34-8628-84b0fa7f17d0",
  "expires_at": "2026-10-28T10:08:22.955850784Z",
  "resend_available_at": "2026-10-28T10:03:23.955850784Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732877674` → **200**

```json
{
  "phone": "+380732877674",
  "audience": "CLIENT",
  "code": "293929",
  "sent_at": "2026-10-28T10:03:22.959055856Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3c9d46a-0f58-4c34-8628-84b0fa7f17d0",
  "code": "293929",
  "device_ref": "sandbox-21633"
}
```

```json
{
  "session_id": "60224b68-36c8-47c1-8afa-5f28367d9f37",
  "subject": {
    "type": "CLIENT",
    "id": "d30c2b61-a0f1-4ba3-bb73-f12b8003e6cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzBjMmI2MS1hMGYxLTRiYTMtYmI3My1mMTJiODAwM2U2Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzAzLCJpYXQiOjE3OTMxODE4MDMsImp0aSI6IjY0Yjc1OGZlLTZkNzUtNGY3Ny1hZGFhLWYzNjhjYjlhZTY1NCIsInNpZCI6IjYwMjI0YjY4LTM2YzgtNDdjMS04YWZhLTVmMjgzNjdkOWYzNyJ9.4hteGYrq7o2tOgw661CRqGFGyP_6xk-HUjhDCjrmvwk",
  "access_expires_at": "2026-10-28T10:18:23.021142493Z",
  "refresh_token": "27LtzBREw8iCiC89YlhPxgCtKEl4k5H0z0I8McfOwb0",
  "refresh_expires_at": "2026-11-27T10:03:23.020296928Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "799e2641-14be-4b92-9778-f802fab15c4a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9c4de54b-3e5a-469c-a174-36747466a965",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9c4de54b-3e5a-469c-a174-36747466a965",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "402413fb9ade66b9bf1dfe7d82455fb5",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9c4de54b-3e5a-469c-a174-36747466a965",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732877674"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9c4de54b-3e5a-469c-a174-36747466a965",
  "expires_at": "2026-10-28T10:33:23.060379Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/9c4de54b-3e5a-469c-a174-36747466a965` → **200**

```json
{
  "id": "9c4de54b-3e5a-469c-a174-36747466a965",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:33:23.060379Z",
  "card": {
    "id": "e7583c0d-9233-48b0-8ddf-c4b169319d13",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3466",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:03:23.110625Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e7583c0d-9233-48b0-8ddf-c4b169319d13",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3466",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:03:23.110625Z"
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
  "device_ref": "sandbox-16317"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "382a6f83-c6f8-43de-ad12-446701f83277",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16317"
}
```

```json
{
  "challenge_id": "d99c59dd-4aa9-46a5-997b-506ec610815a",
  "expires_at": "2026-10-28T10:08:24.237686223Z",
  "resend_available_at": "2026-10-28T10:03:25.237686223Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "931453",
  "sent_at": "2026-10-28T10:03:24.240543074Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d99c59dd-4aa9-46a5-997b-506ec610815a",
  "code": "931453",
  "device_ref": "sandbox-16317"
}
```

```json
{
  "session_id": "2a212cab-8c76-4ac3-901f-4e0fd6734ea9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjcwNCwiaWF0IjoxNzkzMTgxODA0LCJqdGkiOiI4NzE1NGQ0My03ZWUxLTRmZjAtODIwMC1hOTdiMzM4ZTQ1NmQiLCJzaWQiOiIyYTIxMmNhYi04Yzc2LTRhYzMtOTAxZi00ZTBmZDY3MzRlYTkifQ.AKhHUXVvDxXFR3o7YV0DOARzPXTMiyqRxmmB-r9Wu_8",
  "access_expires_at": "2026-10-28T10:18:24.294781601Z",
  "refresh_token": "PhJNgvxBV87xz7zGUrmtH3-gq5WILKJg-IyzCsfTkvY",
  "refresh_expires_at": "2026-11-27T10:03:24.294109962Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e5d8f366-fa76-42a3-8442-0beebacd18c8",
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
  "last_heartbeat_at": "2026-10-28T10:03:22.426279Z",
  "last_location_at": "2026-10-28T10:03:22.426279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e5d8f366-fa76-42a3-8442-0beebacd18c8/handover` → **200**

```json
{
  "command_id": "5fb59d06-4456-4563-a4fc-dbcc952f3f27",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e5d8f366-fa76-42a3-8442-0beebacd18c8",
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
  "last_heartbeat_at": "2026-10-28T10:03:22.426279Z",
  "last_location_at": "2026-10-28T10:03:22.426279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e5d8f366-fa76-42a3-8442-0beebacd18c8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:24Z",
    "sequence": 1793181804387
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e5d8f366-fa76-42a3-8442-0beebacd18c8",
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
  "last_heartbeat_at": "2026-10-28T10:03:24.407378Z",
  "last_location_at": "2026-10-28T10:03:24.407378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4474ad36-ca71-44e8-bf90-802963c65793",
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
  "id": "065edf5a-54bf-4b07-b0d6-993d2613a6a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:08:24.448745Z",
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
  "command_id": "aa1f7908-60bf-4483-9b61-cfbe26536a0c",
  "quote_id": "065edf5a-54bf-4b07-b0d6-993d2613a6a8",
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
  "id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d30c2b61-a0f1-4ba3-bb73-f12b8003e6cd",
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
  "created_at": "2026-10-28T10:03:24.492018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9` → **200**

```json
{
  "id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d30c2b61-a0f1-4ba3-bb73-f12b8003e6cd",
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
  "created_at": "2026-10-28T10:03:24.492018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9` → **200**

```json
{
  "id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d30c2b61-a0f1-4ba3-bb73-f12b8003e6cd",
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
  "created_at": "2026-10-28T10:03:24.492018Z",
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
    "id": "e5c79815-f4c8-414a-b1c6-00c5a4aa6783",
    "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
    "expires_at": "2026-10-28T10:03:39.669467Z",
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

`POST /api/driver/v1/offers/e5c79815-f4c8-414a-b1c6-00c5a4aa6783/accept` → **200**

```json
{
  "command_id": "d99410e3-a7cd-44eb-a5a7-4385389ce0c3"
}
```

```json
{
  "id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "assignment_id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
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

`POST /api/driver/v1/work-sessions/e5d8f366-fa76-42a3-8442-0beebacd18c8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:25Z",
    "sequence": 1793181805673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e5d8f366-fa76-42a3-8442-0beebacd18c8",
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
  "last_heartbeat_at": "2026-10-28T10:03:25.692783Z",
  "last_location_at": "2026-10-28T10:03:25.692783Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0a29a71d-ed86-456c-acfb-a90588dc81e3/arrive` → **200**

```json
{
  "command_id": "5f7f7a1a-3f89-445d-af0a-f725d91a6f8b",
  "expected_version": 0
}
```

```json
{
  "id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "assignment_id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
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
  "arrived_at": "2026-10-28T10:03:25.735561Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0a29a71d-ed86-456c-acfb-a90588dc81e3/start` → **200**

```json
{
  "command_id": "88efa0e4-6c4f-4c37-bb28-601d91e5f7f6",
  "expected_version": 1
}
```

```json
{
  "id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "assignment_id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
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
  "arrived_at": "2026-10-28T10:03:25.735561Z",
  "started_at": "2026-10-28T10:03:25.778073Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0a29a71d-ed86-456c-acfb-a90588dc81e3/complete` → **200**

```json
{
  "command_id": "2cc13359-f21c-4c07-976f-6d180636cf5c",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:03:25Z"
}
```

```json
{
  "id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "assignment_id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
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
  "arrived_at": "2026-10-28T10:03:25.735561Z",
  "started_at": "2026-10-28T10:03:25.778073Z",
  "completed_at": "2026-10-28T10:03:25.823515Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9` → **200**

```json
{
  "id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d30c2b61-a0f1-4ba3-bb73-f12b8003e6cd",
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
    "id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
    "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:03:24.492018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9` → **200**

```json
{
  "id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d30c2b61-a0f1-4ba3-bb73-f12b8003e6cd",
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
    "id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
    "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:03:24.492018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9` → **200**

```json
{
  "id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "d30c2b61-a0f1-4ba3-bb73-f12b8003e6cd",
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
    "id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
    "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:03:24.492018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9` → **200**

```json
{
  "id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "d30c2b61-a0f1-4ba3-bb73-f12b8003e6cd",
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
    "id": "d3424c0a-8169-49a1-bcd1-462bb65f4d76",
    "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0a29a71d-ed86-456c-acfb-a90588dc81e3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:03:24.492018Z",
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
      "id": "e1955c0e-30ef-4e6a-946e-f45c4ac4b9c1",
      "at": "2026-10-28T10:03:26.719708Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9/tip` → **200**

```json
{
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
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
  "available_until": "2026-10-29T10:03:25.823515Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9/tip` → **201**

```json
{
  "command_id": "143e8523-0618-440d-8a25-e9d9eea33d5d",
  "amount_minor": 2500
}
```

```json
{
  "id": "d760e6aa-0094-4ed0-bfbb-51081dbf3a16",
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:03:29.074142Z"
}
```

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9/tip` → **200**

```json
{
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
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
  "available_until": "2026-10-29T10:03:25.823515Z",
  "open": false,
  "tip": {
    "id": "d760e6aa-0094-4ed0-bfbb-51081dbf3a16",
    "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T10:03:29.074142Z"
  }
}
```

`GET /api/rider/v1/orders/d66db5ce-66d2-49dc-a96e-ef4c4e8535e9/tip` → **200**

```json
{
  "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
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
  "available_until": "2026-10-29T10:03:25.823515Z",
  "open": false,
  "tip": {
    "id": "d760e6aa-0094-4ed0-bfbb-51081dbf3a16",
    "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:03:29.074142Z"
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
      "id": "e1955c0e-30ef-4e6a-946e-f45c4ac4b9c1",
      "at": "2026-10-28T10:03:26.719708Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
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
      "id": "787cec9d-7f0e-44c2-8cae-f1bb9d4ed394",
      "at": "2026-10-28T10:03:30.778736Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
      "counterpart_id": null
    },
    {
      "id": "e1955c0e-30ef-4e6a-946e-f45c4ac4b9c1",
      "at": "2026-10-28T10:03:26.719708Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d66db5ce-66d2-49dc-a96e-ef4c4e8535e9",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e5d8f366-fa76-42a3-8442-0beebacd18c8",
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
  "last_heartbeat_at": "2026-10-28T10:03:25.692783Z",
  "last_location_at": "2026-10-28T10:03:25.692783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e5d8f366-fa76-42a3-8442-0beebacd18c8/close` → **200**

```json
{
  "command_id": "bc9481a7-130a-4533-a7ed-20c5e958e787",
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

Done: card order d66db5ce-66d2-49dc-a96e-ef4c4e8535e9.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738645028",
  "device_ref": "sandbox-31208"
}
```

```json
{
  "challenge_id": "7895722a-e075-4dde-8758-2e079bb0d208",
  "expires_at": "2026-10-28T10:08:31.293468591Z",
  "resend_available_at": "2026-10-28T10:03:32.293468591Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738645028` → **200**

```json
{
  "phone": "+380738645028",
  "audience": "CLIENT",
  "code": "690044",
  "sent_at": "2026-10-28T10:03:31.296570772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7895722a-e075-4dde-8758-2e079bb0d208",
  "code": "690044",
  "device_ref": "sandbox-31208"
}
```

```json
{
  "session_id": "a84a4f61-36de-4cfe-9fc3-75a9675ae0fc",
  "subject": {
    "type": "CLIENT",
    "id": "8b9c2a62-ae23-451e-95ac-56ea706ead72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjljMmE2Mi1hZTIzLTQ1MWUtOTVhYy01NmVhNzA2ZWFkNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzExLCJpYXQiOjE3OTMxODE4MTEsImp0aSI6ImE0MTYzNDQzLTBkZTUtNDhmNC05N2I5LWZkNWU5OGI3OGQ3YiIsInNpZCI6ImE4NGE0ZjYxLTM2ZGUtNGNmZS05ZmMzLTc1YTk2NzVhZTBmYyJ9.PxkuBehODd1N4AymGJorfHtxkyQBagSiwTgI4AQ8cTU",
  "access_expires_at": "2026-10-28T10:18:31.354561688Z",
  "refresh_token": "87usQnk5GlnxjUso_FygJ9KrvIFFIL4RgG4DX-jMJeo",
  "refresh_expires_at": "2026-11-27T10:03:31.353845714Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "5dc18972-d55b-47a8-942c-1c0ee5191660",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "82a8b03b-e41a-425f-bc78-25e0d6dcc623",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-82a8b03b-e41a-425f-bc78-25e0d6dcc623",
    "orderDate": "1793181811",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "9b7de0f434d745033af508365bc04510",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=82a8b03b-e41a-425f-bc78-25e0d6dcc623",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738645028"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=82a8b03b-e41a-425f-bc78-25e0d6dcc623",
  "created_at": "2026-10-28T10:03:31.390543Z",
  "expires_at": "2026-10-28T10:33:31.390543Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/82a8b03b-e41a-425f-bc78-25e0d6dcc623` → **200**

```json
{
  "id": "82a8b03b-e41a-425f-bc78-25e0d6dcc623",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:03:31.390543Z",
  "expires_at": "2026-10-28T10:33:31.390543Z",
  "completed_at": "2026-10-28T10:03:31.428252Z",
  "masked_pan": "41****2556",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8b9c2a62-ae23-451e-95ac-56ea706ead72",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8b9c2a62-ae23-451e-95ac-56ea706ead72",
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
      "id": "eea5f697-3f3f-4acb-9266-f878f9c8ec5d",
      "at": "2026-10-28T10:03:31.789979Z",
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
  "client_id": "8b9c2a62-ae23-451e-95ac-56ea706ead72",
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
      "id": "eea5f697-3f3f-4acb-9266-f878f9c8ec5d",
      "at": "2026-10-28T10:03:31.789979Z",
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
  "device_ref": "sandbox-23210"
}
```

```json
{
  "challenge_id": "38105144-8ff5-4eba-aab2-803c6f00c3eb",
  "expires_at": "2026-10-28T10:08:32.558230084Z",
  "resend_available_at": "2026-10-28T10:03:33.558230084Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "506806",
  "sent_at": "2026-10-28T10:03:32.560916739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38105144-8ff5-4eba-aab2-803c6f00c3eb",
  "code": "506806",
  "device_ref": "sandbox-23210"
}
```

```json
{
  "session_id": "4a4a1b2c-a131-4d70-99b7-3bc9590cf7ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjcxMiwiaWF0IjoxNzkzMTgxODEyLCJqdGkiOiI5YmIxNjZjOS00ZWYzLTRjNjUtYWRmMi0xZTAyMWE4MDUzNTkiLCJzaWQiOiI0YTRhMWIyYy1hMTMxLTRkNzAtOTliNy0zYmM5NTkwY2Y3ZWYifQ.TaujWEAxU_JCU8kEfYo9iFaYsHkD0bMcpTaQyC-FZZs",
  "access_expires_at": "2026-10-28T10:18:32.617116559Z",
  "refresh_token": "mQoOmV0IqXhqBbcUl-Bx2XNCROaO1AIvk6T8MQYBfIY",
  "refresh_expires_at": "2026-11-27T10:03:32.616468589Z",
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
  "command_id": "c4026882-8df1-4fa6-b8b3-49aabf79e77a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "c88157ec-2136-4e04-8ae1-7c63d373ea49",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c88157ec-2136-4e04-8ae1-7c63d373ea49",
    "orderDate": "1793181812",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "36946204b834808760a37f6a4385f28e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c88157ec-2136-4e04-8ae1-7c63d373ea49",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c88157ec-2136-4e04-8ae1-7c63d373ea49",
  "created_at": "2026-10-28T10:03:32.673743Z",
  "expires_at": "2026-10-28T10:33:32.673743Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/c88157ec-2136-4e04-8ae1-7c63d373ea49` → **200**

```json
{
  "id": "c88157ec-2136-4e04-8ae1-7c63d373ea49",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:03:32.673743Z",
  "expires_at": "2026-10-28T10:33:32.673743Z",
  "completed_at": "2026-10-28T10:03:32.706196Z",
  "masked_pan": "41****2942",
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
      "id": "2afa9a98-4390-4ec4-b170-bab3c109643b",
      "at": "2026-10-28T10:03:32.800519Z",
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
  "command_id": "4bde0430-a67c-4f64-8c3b-83a72c9da82e",
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
  "correlation_id": "9cbf8f01-c1d2-4f9e-ab7b-67400a11a1ea"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671458253",
  "device_ref": "sandbox-4013"
}
```

```json
{
  "challenge_id": "9299f118-c89c-4578-aba4-63e81e9f25fb",
  "expires_at": "2026-10-28T10:08:33.853994302Z",
  "resend_available_at": "2026-10-28T10:03:34.853994302Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671458253` → **200**

```json
{
  "phone": "+380671458253",
  "audience": "CLIENT",
  "code": "197186",
  "sent_at": "2026-10-28T10:03:33.856946526Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9299f118-c89c-4578-aba4-63e81e9f25fb",
  "code": "197186",
  "device_ref": "sandbox-4013"
}
```

```json
{
  "session_id": "c4db4f29-a6ef-4509-8d58-8987500a8d46",
  "subject": {
    "type": "CLIENT",
    "id": "04e3a088-e75c-4552-a313-b86c6ade0174"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGUzYTA4OC1lNzVjLTQ1NTItYTMxMy1iODZjNmFkZTAxNzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzEzLCJpYXQiOjE3OTMxODE4MTMsImp0aSI6IjdlNTZlZTllLTQ1Y2ItNGVjZi04ODg1LWE5MTU1YjQ3Y2M4YiIsInNpZCI6ImM0ZGI0ZjI5LWE2ZWYtNDUwOS04ZDU4LTg5ODc1MDBhOGQ0NiJ9.GsuJzdaongp_oAyc_3C_zc4SsYbpaLZjgYI-jQRz7pE",
  "access_expires_at": "2026-10-28T10:18:33.915057847Z",
  "refresh_token": "7uRF6jkFOEwW2ZeE-xrHSLwoqCS9zbhbWzRAKYaRSVU",
  "refresh_expires_at": "2026-11-27T10:03:33.914507651Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "04e3a088-e75c-4552-a313-b86c6ade0174",
  "session_id": "c4db4f29-a6ef-4509-8d58-8987500a8d46",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d6b5c428-c3d7-4243-b3cb-6d20cf9025d2",
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
  "id": "a1b202b3-f985-4e0e-a69a-5fbc75dc6469",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:08:33.977574Z",
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
  "challenge_id": "5ca95901-0d2a-4de9-b2b8-9423887e7113",
  "expires_at": "2026-10-28T10:08:36.016019606Z",
  "resend_available_at": "2026-10-28T10:03:37.016019606Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671458253` → **200**

```json
{
  "phone": "+380671458253",
  "audience": "CLIENT",
  "code": "951294",
  "sent_at": "2026-10-28T10:03:36.018508375Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "f4acae15-552e-4224-b10e-52469b3d9512",
  "challenge_id": "5ca95901-0d2a-4de9-b2b8-9423887e7113",
  "otp_code": "951294"
}
```

```json
{
  "client_id": "04e3a088-e75c-4552-a313-b86c6ade0174",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:03:36.085408315Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d524faef-1316-47f0-ad03-68d911765b57",
  "quote_id": "a1b202b3-f985-4e0e-a69a-5fbc75dc6469",
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
  "correlation_id": "d1524fca-50c5-4ccb-9550-eba933b1f978"
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
  "session_id": "fa754922-3420-4f73-b5f0-83e8c77946d6",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MTYsImlhdCI6MTc5MzE4MTgxNiwianRpIjoiODg2NzFlZjQtMjg1MS00OTI2LWE2MWYtMWNkMDlmNzQ2MTZlIiwic2lkIjoiZmE3NTQ5MjItMzQyMC00ZjczLWI1ZjAtODNlOGM3Nzk0NmQ2In0.tk9XnoqauW-xhI9wqr6AbwlAVVzLBhVzS4XZ2iB9-_c",
  "access_expires_at": "2026-10-28T10:18:36.452070554Z",
  "refresh_token": "ZZq3VcJgk9xMTlTBq9JyK25tOn6GB-DEJsX63NA7_Bg",
  "refresh_expires_at": "2026-10-28T22:03:36.45150541Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "04e3a088-e75c-4552-a313-b86c6ade0174",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:03:36.085408Z",
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

`POST /api/admin/v1/client-deletions/04e3a088-e75c-4552-a313-b86c6ade0174/complete` → **200**

```json
{
  "command_id": "21baa26e-45b5-4768-ac3e-63cee988bd7f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "04e3a088-e75c-4552-a313-b86c6ade0174",
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
  "correlation_id": "23f87d7e-f610-422e-b636-8115da5ac46a"
}
```

Done: client 04e3a088-e75c-4552-a313-b86c6ade0174 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665873238",
  "device_ref": "sandbox-19487"
}
```

```json
{
  "challenge_id": "bc7d9707-ed56-4c2d-a35d-0ef41c96449e",
  "expires_at": "2026-10-28T10:08:36.600683913Z",
  "resend_available_at": "2026-10-28T10:03:37.600683913Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665873238` → **200**

```json
{
  "phone": "+380665873238",
  "audience": "CLIENT",
  "code": "445169",
  "sent_at": "2026-10-28T10:03:36.603063175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc7d9707-ed56-4c2d-a35d-0ef41c96449e",
  "code": "445169",
  "device_ref": "sandbox-19487"
}
```

```json
{
  "session_id": "5b4637e5-cc51-4c8a-8c74-afae247218a6",
  "subject": {
    "type": "CLIENT",
    "id": "77370718-facc-4303-a956-7f0b20e6e395"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzM3MDcxOC1mYWNjLTQzMDMtYTk1Ni03ZjBiMjBlNmUzOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzE2LCJpYXQiOjE3OTMxODE4MTYsImp0aSI6IjQ5ZDk2Mzk0LWFjNzctNDAwOS1hZjIzLTI2ZTU4OGRkY2I5NCIsInNpZCI6IjViNDYzN2U1LWNjNTEtNGM4YS04Yzc0LWFmYWUyNDcyMThhNiJ9.4QK7f4eUfJ9h04zQjUHoDjGKQmLI2-paP3SNZpX1m40",
  "access_expires_at": "2026-10-28T10:18:36.657846434Z",
  "refresh_token": "l3M03m6EwNiZYz24yXm-B-SR4xv_cs8GMd8BjoEF8Js",
  "refresh_expires_at": "2026-11-27T10:03:36.657281351Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77370718-facc-4303-a956-7f0b20e6e395",
  "session_id": "5b4637e5-cc51-4c8a-8c74-afae247218a6",
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
  "session_id": "30af8cc6-bbb9-4240-b11d-ca5b9704d186",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MTcsImlhdCI6MTc5MzE4MTgxNywianRpIjoiZjQ3Y2UzMGYtYzcwMS00NDgyLTk4YjctZWE4YjRhY2VhY2ZiIiwic2lkIjoiMzBhZjhjYzYtYmJiOS00MjQwLWIxMWQtY2E1Yjk3MDRkMTg2In0.ebnSF7pOXQJn77gbe9_yXc-oAbjMuwlJMR8Tcn7BIPw",
  "access_expires_at": "2026-10-28T10:18:37.00608563Z",
  "refresh_token": "VDlqNXFfs5BAl530mf60iTBZHGMJGT6hOYBkZ8RkIIY",
  "refresh_expires_at": "2026-10-28T22:03:37.005517862Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5873238&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "77370718-facc-4303-a956-7f0b20e6e395",
      "phone": "+380665873238",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:03:36.655251Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/77370718-facc-4303-a956-7f0b20e6e395` → **200**

```json
{
  "client": {
    "id": "77370718-facc-4303-a956-7f0b20e6e395",
    "phone": "+380665873238",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:03:36.655251Z",
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

`POST /api/admin/v1/clients/77370718-facc-4303-a956-7f0b20e6e395/block` → **400**

```json
{
  "command_id": "510008c1-f944-453e-bc90-bccf307a3d36",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/77370718-facc-4303-a956-7f0b20e6e395/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "274f5cce-e848-4b46-b8ae-e86244ad120f",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/77370718-facc-4303-a956-7f0b20e6e395/block` → **200**

```json
{
  "command_id": "8b656984-d967-42bb-a6df-5395309c2af7",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "77370718-facc-4303-a956-7f0b20e6e395",
  "phone": "+380665873238",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:03:36.655251Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:03:37.172291Z",
    "by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
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
  "correlation_id": "301fc01e-ec9d-4f5e-9625-4b2a43248693"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665873238",
  "device_ref": "sandbox-22442"
}
```

```json
{
  "challenge_id": "042e3824-71b8-414d-9943-d92ee5c6548c",
  "expires_at": "2026-10-28T10:08:39.237918881Z",
  "resend_available_at": "2026-10-28T10:03:40.237918881Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665873238` → **200**

```json
{
  "phone": "+380665873238",
  "audience": "CLIENT",
  "code": "563273",
  "sent_at": "2026-10-28T10:03:39.240817475Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "042e3824-71b8-414d-9943-d92ee5c6548c",
  "code": "563273",
  "device_ref": "sandbox-22442"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "26706694-44be-4da8-b021-7506a08a2a2d"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/77370718-facc-4303-a956-7f0b20e6e395` → **200**

```json
{
  "client": {
    "id": "77370718-facc-4303-a956-7f0b20e6e395",
    "phone": "+380665873238",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:03:36.655251Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:03:37.172291Z",
      "by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
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

`POST /api/admin/v1/clients/77370718-facc-4303-a956-7f0b20e6e395/unblock` → **200**

```json
{
  "command_id": "1c20ada1-37c4-4af8-9d67-e99477f8677e",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "77370718-facc-4303-a956-7f0b20e6e395",
  "phone": "+380665873238",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:03:36.655251Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665873238",
  "device_ref": "sandbox-26189"
}
```

```json
{
  "challenge_id": "310d24c3-86aa-4ad8-9926-6d7e011f37f8",
  "expires_at": "2026-10-28T10:08:41.397397692Z",
  "resend_available_at": "2026-10-28T10:03:42.397397692Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665873238` → **200**

```json
{
  "phone": "+380665873238",
  "audience": "CLIENT",
  "code": "702635",
  "sent_at": "2026-10-28T10:03:41.399878515Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "310d24c3-86aa-4ad8-9926-6d7e011f37f8",
  "code": "702635",
  "device_ref": "sandbox-26189"
}
```

```json
{
  "session_id": "f9a02ece-2821-4cb1-932e-5397a4ca3054",
  "subject": {
    "type": "CLIENT",
    "id": "77370718-facc-4303-a956-7f0b20e6e395"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzM3MDcxOC1mYWNjLTQzMDMtYTk1Ni03ZjBiMjBlNmUzOTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzIxLCJpYXQiOjE3OTMxODE4MjEsImp0aSI6IjE0ZjhlMjZjLWMyZTUtNDYxNi1iMDFhLWRkZTQyN2I5ZWI0ZCIsInNpZCI6ImY5YTAyZWNlLTI4MjEtNGNiMS05MzJlLTUzOTdhNGNhMzA1NCJ9.aThe3jG4pKCe5mFjL5ube97--97aSrImj7UO2mhsIk0",
  "access_expires_at": "2026-10-28T10:18:41.45595126Z",
  "refresh_token": "cYg6KszNYLJjieWQKaDUPUcpyOl0379Ny7sTha2OkaY",
  "refresh_expires_at": "2026-11-27T10:03:41.45535025Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "77370718-facc-4303-a956-7f0b20e6e395",
  "session_id": "f9a02ece-2821-4cb1-932e-5397a4ca3054",
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
  "phone": "+380660596743",
  "device_ref": "sandbox-10708"
}
```

```json
{
  "challenge_id": "b524b6d9-b160-462a-b19f-8edf0b062bf1",
  "expires_at": "2026-10-28T10:08:41.521872138Z",
  "resend_available_at": "2026-10-28T10:03:42.521872138Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660596743` → **200**

```json
{
  "phone": "+380660596743",
  "audience": "CLIENT",
  "code": "324120",
  "sent_at": "2026-10-28T10:03:41.524080854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b524b6d9-b160-462a-b19f-8edf0b062bf1",
  "code": "324120",
  "device_ref": "sandbox-10708"
}
```

```json
{
  "session_id": "3c52816b-b0fb-439a-a3e1-8e377f784acb",
  "subject": {
    "type": "CLIENT",
    "id": "558706f4-8475-4dae-b0b7-5928a61effb3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTg3MDZmNC04NDc1LTRkYWUtYjBiNy01OTI4YTYxZWZmYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzIxLCJpYXQiOjE3OTMxODE4MjEsImp0aSI6IjIwODI2YzQ0LTZkODUtNDc3Ni1iM2FlLWVlMTc4MDliMDA2MyIsInNpZCI6IjNjNTI4MTZiLWIwZmItNDM5YS1hM2UxLThlMzc3Zjc4NGFjYiJ9.slf2AbQVHAustiMpPju1Y243udtyb136owMsumLQoxA",
  "access_expires_at": "2026-10-28T10:18:41.580038442Z",
  "refresh_token": "CvsZ2V1GTxGDXL7DorZSCIH-iCqfmmYnDpfnuV3qb8I",
  "refresh_expires_at": "2026-11-27T10:03:41.579417094Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7ac05b21-2108-4f4a-908a-43aea68f9999",
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
  "id": "244b0246-dc89-4d3d-98dd-21f689961c41",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:08:41.615906Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: cfc5afb0-12ee-422a-b616-aea68f5cf544) → **201**

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
  "session_id": "5ccfeab6-5d74-4ce3-9d80-405fbd59c25b",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MjEsImlhdCI6MTc5MzE4MTgyMSwianRpIjoiYjI1YWI5ZjItNTc1NS00MGM4LTkzNzktMjA0NzdkZjgwZWQ4Iiwic2lkIjoiNWNjZmVhYjYtNWQ3NC00Y2UzLTlkODAtNDA1ZmJkNTljMjViIn0.FRa8GPI5iyTDudPwsR3-2yIKd64jFv28HdZlsgSslbg",
  "access_expires_at": "2026-10-28T10:18:41.985896341Z",
  "refresh_token": "ClSOy5ME7XBizOc7aqlWrAphvdEa0ejeIWmullK63o4",
  "refresh_expires_at": "2026-10-28T22:03:41.985290853Z",
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
  "session_id": "2cdbf3ff-933a-40bd-b41f-7445f69bbda2",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MjIsImlhdCI6MTc5MzE4MTgyMiwianRpIjoiOTdkOGU5ZDMtZTg5MC00NGE5LWJmMTctZTFkZGZlYzY1YzAwIiwic2lkIjoiMmNkYmYzZmYtOTMzYS00MGJkLWI0MWYtNzQ0NWY2OWJiZGEyIn0.-xRsCxEOZcGAedk2zpllThCgvFKrzyJKrdWTda0w1gk",
  "access_expires_at": "2026-10-28T10:18:42.307963567Z",
  "refresh_token": "oTDuFq1KNbfvbXA8hheBYJeKkT6ALNNV0A0eO4oupOs",
  "refresh_expires_at": "2026-10-28T22:03:42.307372245Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/47318134-4de0-4b32-ba01-b0c07def19a3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:03:41.652624Z",
      "actor": {
        "type": "CLIENT",
        "id": "558706f4-8475-4dae-b0b7-5928a61effb3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "47318134-4de0-4b32-ba01-b0c07def19a3",
        "quote_id": "244b0246-dc89-4d3d-98dd-21f689961c41",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cfc5afb0-12ee-422a-b616-aea68f5cf544"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:03:41.65467Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "47318134-4de0-4b32-ba01-b0c07def19a3",
        "attempt_id": "d46c389b-7693-429d-b5a0-ad264cf31efd",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cfc5afb0-12ee-422a-b616-aea68f5cf544"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:03:41.665022Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "47318134-4de0-4b32-ba01-b0c07def19a3",
        "attempt_id": "d46c389b-7693-429d-b5a0-ad264cf31efd"
      },
      "correlation_id": "cfc5afb0-12ee-422a-b616-aea68f5cf544"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "d46c389b-7693-429d-b5a0-ad264cf31efd",
        "generation": 1,
        "started_at": "2026-10-28T10:03:41.653511Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:03:41.665022Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:03:41.655746Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/cfc5afb0-12ee-422a-b616-aea68f5cf544` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "47318134-4de0-4b32-ba01-b0c07def19a3:0",
      "order_id": "47318134-4de0-4b32-ba01-b0c07def19a3",
      "at": "2026-10-28T10:03:41.652624Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "47318134-4de0-4b32-ba01-b0c07def19a3:1",
      "order_id": "47318134-4de0-4b32-ba01-b0c07def19a3",
      "at": "2026-10-28T10:03:41.65467Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "47318134-4de0-4b32-ba01-b0c07def19a3:2",
      "order_id": "47318134-4de0-4b32-ba01-b0c07def19a3",
      "at": "2026-10-28T10:03:41.665022Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/573ab7d6-290b-4565-be90-cbd144f3aee2` → **200**

```json
{
  "found": []
}
```

Done: request cfc5afb0-12ee-422a-b616-aea68f5cf544 — order 47318134-4de0-4b32-ba01-b0c07def19a3 found by its id.

`GET /api/rider/v1/orders/47318134-4de0-4b32-ba01-b0c07def19a3` → **200**

```json
{
  "id": "47318134-4de0-4b32-ba01-b0c07def19a3",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "558706f4-8475-4dae-b0b7-5928a61effb3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:03:41.651971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/47318134-4de0-4b32-ba01-b0c07def19a3/cancel` → **200**

```json
{
  "command_id": "e510d8fa-b62b-4cde-ba70-ff19f0fad268",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "47318134-4de0-4b32-ba01-b0c07def19a3",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "558706f4-8475-4dae-b0b7-5928a61effb3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:03:41.651971Z",
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
  "discount_minor": 0
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630352401",
  "device_ref": "sandbox-22764"
}
```

```json
{
  "challenge_id": "e4e99d8b-a9f7-4fce-b862-540abc7e43b9",
  "expires_at": "2026-10-28T10:08:42.505138712Z",
  "resend_available_at": "2026-10-28T10:03:43.505138712Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630352401` → **200**

```json
{
  "phone": "+380630352401",
  "audience": "CLIENT",
  "code": "740984",
  "sent_at": "2026-10-28T10:03:42.507640063Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4e99d8b-a9f7-4fce-b862-540abc7e43b9",
  "code": "740984",
  "device_ref": "sandbox-22764"
}
```

```json
{
  "session_id": "97aa7519-d993-4a32-acae-781d42f01f16",
  "subject": {
    "type": "CLIENT",
    "id": "c7679baf-7ecd-4ee4-b6e1-717e85d99797"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzY3OWJhZi03ZWNkLTRlZTQtYjZlMS03MTdlODVkOTk3OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzIyLCJpYXQiOjE3OTMxODE4MjIsImp0aSI6ImNjYjc5MTFkLTQ2MGMtNGNhMy04ODcwLTQxNjY1YzA2NDM2ZiIsInNpZCI6Ijk3YWE3NTE5LWQ5OTMtNGEzMi1hY2FlLTc4MWQ0MmYwMWYxNiJ9.EBmXWHk25m4fozxG-5HxjJT2fcdsi2Luo_05zEU-qKc",
  "access_expires_at": "2026-10-28T10:18:42.564623756Z",
  "refresh_token": "F9Aoj5Q4MWvtSbPJbEbzQxcfJ4cr0DX2nIVk79V_UjM",
  "refresh_expires_at": "2026-11-27T10:03:42.564063231Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "fb527492-7969-4893-a6f0-44bd468f5231",
  "expires_at": "2026-10-28T10:08:44.594976985Z",
  "resend_available_at": "2026-10-28T10:03:45.594976985Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630352401` → **200**

```json
{
  "phone": "+380630352401",
  "audience": "CLIENT",
  "code": "604487",
  "sent_at": "2026-10-28T10:03:44.597440465Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a7289c7c-0afc-4822-8b0f-d71642593a79",
  "challenge_id": "fb527492-7969-4893-a6f0-44bd468f5231",
  "otp_code": "604487"
}
```

```json
{
  "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
  "state": "PENDING",
  "created_at": "2026-10-28T10:03:44.661752Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911` → **200**

```json
{
  "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
  "state": "PENDING",
  "created_at": "2026-10-28T10:03:44.661752Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911` → **200**

```json
{
  "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
  "state": "PENDING",
  "created_at": "2026-10-28T10:03:44.661752Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911` → **200**

```json
{
  "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
  "state": "PENDING",
  "created_at": "2026-10-28T10:03:44.661752Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911` → **200**

```json
{
  "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
  "state": "PENDING",
  "created_at": "2026-10-28T10:03:44.661752Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911` → **200**

```json
{
  "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
  "state": "PENDING",
  "created_at": "2026-10-28T10:03:44.661752Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911` → **200**

```json
{
  "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
  "state": "PENDING",
  "created_at": "2026-10-28T10:03:44.661752Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911` → **200**

```json
{
  "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
  "state": "READY",
  "created_at": "2026-10-28T10:03:44.661752Z",
  "ready_at": "2026-10-28T10:03:50.418972Z",
  "expires_at": "2026-11-04T10:03:50.418972Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633222522",
  "device_ref": "sandbox-16303"
}
```

```json
{
  "challenge_id": "4cbb1292-3c2e-4411-8c0a-8b89c5acdf8f",
  "expires_at": "2026-10-28T10:08:50.906511635Z",
  "resend_available_at": "2026-10-28T10:03:51.906511635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633222522` → **200**

```json
{
  "phone": "+380633222522",
  "audience": "CLIENT",
  "code": "902305",
  "sent_at": "2026-10-28T10:03:50.909038383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cbb1292-3c2e-4411-8c0a-8b89c5acdf8f",
  "code": "902305",
  "device_ref": "sandbox-16303"
}
```

```json
{
  "session_id": "507f40f4-f7d3-4bf4-86a1-6b346b7f7507",
  "subject": {
    "type": "CLIENT",
    "id": "3f3c059a-8498-4641-ae7a-a842be6e4c42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjNjMDU5YS04NDk4LTQ2NDEtYWU3YS1hODQyYmU2ZTRjNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzMwLCJpYXQiOjE3OTMxODE4MzAsImp0aSI6ImU0YmZmMzg3LTNhOTktNGJhNC04Y2Q3LWQ1OTk3ZDk4N2YzNSIsInNpZCI6IjUwN2Y0MGY0LWY3ZDMtNGJmNC04NmExLTZiMzQ2YjdmNzUwNyJ9.WW280svwnC3P_pA1-h6wx4_UyT9WDKzpZhkvvOqdtts",
  "access_expires_at": "2026-10-28T10:18:50.964881148Z",
  "refresh_token": "QIAHN3OOsmplM0kQ9qRuv0Uocw6xgarttv8JKnSyJvc",
  "refresh_expires_at": "2026-11-27T10:03:50.964287311Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/b24ec69a-a4d5-4108-aece-9a9c9db73911/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cd5b2c74-3c82-44d4-8af9-426101003c10"
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
  "session_id": "7df2d59c-54ef-4afc-8b96-60be0b3dc558",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MzEsImlhdCI6MTc5MzE4MTgzMSwianRpIjoiMzc5MzIyNjYtMDU2Ni00MWFiLWIxMjgtZDZiYTQ2MWNjNjI0Iiwic2lkIjoiN2RmMmQ1OWMtNTRlZi00YWZjLThiOTYtNjBiZTBiM2RjNTU4In0.l7OCnwB4FUbnXJOp9tEqHaNXr8ZHCN-E6XSoHMcTZVQ",
  "access_expires_at": "2026-10-28T10:18:51.312987019Z",
  "refresh_token": "FKC0LvwhE025VHxJ6Y6kBpYbfG9yy7EVVhZsPKYUdq0",
  "refresh_expires_at": "2026-10-28T22:03:51.312396279Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c7679baf-7ecd-4ee4-b6e1-717e85d99797",
  "session_id": "97aa7519-d993-4a32-acae-781d42f01f16",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/c7679baf-7ecd-4ee4-b6e1-717e85d99797/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "b24ec69a-a4d5-4108-aece-9a9c9db73911",
      "state": "READY",
      "created_at": "2026-10-28T10:03:44.661752Z",
      "ready_at": "2026-10-28T10:03:50.418972Z",
      "expires_at": "2026-11-04T10:03:50.418972Z",
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
  "device_ref": "sandbox-11182"
}
```

```json
{
  "challenge_id": "1a6131b9-bda8-4f6f-88a0-8fa07b40efc8",
  "expires_at": "2026-10-28T10:08:51.403968456Z",
  "resend_available_at": "2026-10-28T10:03:52.403968456Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "942902",
  "sent_at": "2026-10-28T10:03:51.406665992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a6131b9-bda8-4f6f-88a0-8fa07b40efc8",
  "code": "942902",
  "device_ref": "sandbox-11182"
}
```

```json
{
  "session_id": "03318d7a-cb28-4b92-bd10-92dce865a413",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjczMSwiaWF0IjoxNzkzMTgxODMxLCJqdGkiOiJjMmZjZDhmMi1mM2Y2LTQ3ZmItODE4MS04ZmQxMWM3MWYwNjEiLCJzaWQiOiIwMzMxOGQ3YS1jYjI4LTRiOTItYmQxMC05MmRjZTg2NWE0MTMifQ.zwJZBAEcPj70hTlWMX37Y59MBzOhmQWh7Mo9GZEIQo4",
  "access_expires_at": "2026-10-28T10:18:51.463607509Z",
  "refresh_token": "4yXjXnQLv8XoduNp1VxEMzYTPJB3bRaUAEDcQpmMGdk",
  "refresh_expires_at": "2026-11-27T10:03:51.4628729Z",
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
  "device_ref": "sandbox-31554"
}
```

```json
{
  "challenge_id": "db449d6c-183a-47ac-b14c-8b7bf9571ed5",
  "expires_at": "2026-10-28T10:08:51.513039782Z",
  "resend_available_at": "2026-10-28T10:03:52.513039782Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "006282",
  "sent_at": "2026-10-28T10:03:51.515316715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db449d6c-183a-47ac-b14c-8b7bf9571ed5",
  "code": "006282",
  "device_ref": "sandbox-31554"
}
```

```json
{
  "session_id": "8f33c267-fbcf-4117-810c-48afc22d827e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjczMSwiaWF0IjoxNzkzMTgxODMxLCJqdGkiOiJiZDM4ZjRkOS0zMjZjLTQ2YTEtODdiZi0zYTI5MzE2Y2YzMDMiLCJzaWQiOiI4ZjMzYzI2Ny1mYmNmLTQxMTctODEwYy00OGFmYzIyZDgyN2UifQ.kSZHJiy5hmrk4YWKO49ME5mouf9EWh6qNRy8sWWcy9g",
  "access_expires_at": "2026-10-28T10:18:51.571413035Z",
  "refresh_token": "aT35H7geOAn7mrusccHr_WD7OwvmDPm29EzYGH-eIeo",
  "refresh_expires_at": "2026-11-27T10:03:51.570714551Z",
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
  "command_id": "382aef9c-435d-4a63-99fa-ce4b342ab6f1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:51Z",
    "sequence": 1793181831624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0790eabc-4ee9-4f7c-b9b5-587f622deb95",
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
  "last_heartbeat_at": "2026-10-28T10:03:51.643291Z",
  "last_location_at": "2026-10-28T10:03:51.643291Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-32000"
}
```

```json
{
  "challenge_id": "7e5979d9-8e1f-4563-b4fa-569014b5de92",
  "expires_at": "2026-10-28T10:08:51.674515267Z",
  "resend_available_at": "2026-10-28T10:03:52.674515267Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "534898",
  "sent_at": "2026-10-28T10:03:51.677413657Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e5979d9-8e1f-4563-b4fa-569014b5de92",
  "code": "534898",
  "device_ref": "sandbox-32000"
}
```

```json
{
  "session_id": "2327aee4-07c5-4830-be8d-59eb2084d154",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjczMSwiaWF0IjoxNzkzMTgxODMxLCJqdGkiOiJhMTA3NWY1Zi1hZDQ4LTQxNjctYjk4NC0wOTg1NTE2MDM0MWYiLCJzaWQiOiIyMzI3YWVlNC0wN2M1LTQ4MzAtYmU4ZC01OWViMjA4NGQxNTQifQ.0MQb71Vvj4esIOy3Cu2Nu1NUFRBJeukhTRNYakxMMC4",
  "access_expires_at": "2026-10-28T10:18:51.736135279Z",
  "refresh_token": "gAr1EQkiP7DHEaisLNFdcGWRKvpx7Xnu54khH9oySmo",
  "refresh_expires_at": "2026-11-27T10:03:51.735486941Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "87dd5156-1ac9-4b2c-8e1f-23dd2f39b762",
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
  "last_heartbeat_at": "2026-10-28T10:03:22.259354Z",
  "last_location_at": "2026-10-28T10:03:22.259354Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/87dd5156-1ac9-4b2c-8e1f-23dd2f39b762/handover` → **200**

```json
{
  "command_id": "b75ea2e5-40d0-4d04-af42-4c0451dd7614",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "87dd5156-1ac9-4b2c-8e1f-23dd2f39b762",
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
  "last_heartbeat_at": "2026-10-28T10:03:22.259354Z",
  "last_location_at": "2026-10-28T10:03:22.259354Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/87dd5156-1ac9-4b2c-8e1f-23dd2f39b762/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:51Z",
    "sequence": 1793181831829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "87dd5156-1ac9-4b2c-8e1f-23dd2f39b762",
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
  "last_heartbeat_at": "2026-10-28T10:03:51.84905Z",
  "last_location_at": "2026-10-28T10:03:51.84905Z",
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
  "session_id": "5717c1be-bea8-48ae-a702-e6a3d6b0390a",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MzIsImlhdCI6MTc5MzE4MTgzMiwianRpIjoiNjFlODM4OWEtZjYxYy00MzE4LTk5YzUtYTk1MGZmNjU0YTg1Iiwic2lkIjoiNTcxN2MxYmUtYmVhOC00OGFlLWE3MDItZTZhM2Q2YjAzOTBhIn0.aJFwgd7qs5g4wx4NcIWplQnZgbD1D_bTNcEwPjfgKqY",
  "access_expires_at": "2026-10-28T10:18:52.171471257Z",
  "refresh_token": "LPWZuHcaabYlIUadGEg7GLdDXYJpa2NI4C_Og7MUvXg",
  "refresh_expires_at": "2026-10-28T22:03:52.170781991Z",
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
  "session_id": "3638c38d-63a9-4825-b078-6c6ee214905e",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MzIsImlhdCI6MTc5MzE4MTgzMiwianRpIjoiY2FkYzcxNGItYTNjMS00OWVhLThmN2EtMTk4ZTY3ZmUyYjhjIiwic2lkIjoiMzYzOGMzOGQtNjNhOS00ODI1LWIwNzgtNmM2ZWUyMTQ5MDVlIn0.RhUuG-HDjSSLPTOJp5Tzkne6-DzWrKq-4odVCEdlV3Y",
  "access_expires_at": "2026-10-28T10:18:52.492768253Z",
  "refresh_token": "2fO08S5XkyyOptRZ-xQja4kSDux4C7Z1L3C8iFEuEZo",
  "refresh_expires_at": "2026-10-28T22:03:52.492209151Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685938267",
  "device_ref": "sandbox-27744"
}
```

```json
{
  "challenge_id": "26052ce3-d821-4555-9e9e-0a40be660a69",
  "expires_at": "2026-10-28T10:08:52.519323933Z",
  "resend_available_at": "2026-10-28T10:03:53.519323933Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380685938267` → **200**

```json
{
  "phone": "+380685938267",
  "audience": "CLIENT",
  "code": "000908",
  "sent_at": "2026-10-28T10:03:52.521824352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26052ce3-d821-4555-9e9e-0a40be660a69",
  "code": "000908",
  "device_ref": "sandbox-27744"
}
```

```json
{
  "session_id": "b1b5942f-a8ed-42c6-887c-e45343204289",
  "subject": {
    "type": "CLIENT",
    "id": "e7b16520-79c6-4be0-bcd2-f6369404df66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlN2IxNjUyMC03OWM2LTRiZTAtYmNkMi1mNjM2OTQwNGRmNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzMyLCJpYXQiOjE3OTMxODE4MzIsImp0aSI6IjVmZWE4MjE5LWYwZDYtNGM1Zi1iOWQwLWE5MjFkYjcxOTQxYiIsInNpZCI6ImIxYjU5NDJmLWE4ZWQtNDJjNi04ODdjLWU0NTM0MzIwNDI4OSJ9.qR695bahIsOxxs7saVOGVzJL6uGxwRa_r57h5fc9MXA",
  "access_expires_at": "2026-10-28T10:18:52.579037164Z",
  "refresh_token": "edZPM4SX6DbvsGw9YKLDPzQ7fY5mXy1BNA00matGHOY",
  "refresh_expires_at": "2026-11-27T10:03:52.578396941Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2c5dc1bc-84f3-4b16-8000-e800360ffaab",
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
  "id": "37916dce-36d9-4aee-b2b5-678a45036c0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:08:52.615308Z",
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
  "command_id": "021eb38e-d505-4551-abcf-46100f525d18",
  "quote_id": "37916dce-36d9-4aee-b2b5-678a45036c0f",
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
  "id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7b16520-79c6-4be0-bcd2-f6369404df66",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:03:52.654946Z",
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
    "id": "43b077ed-e9d1-4c24-9e81-6fdd39423737",
    "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
    "expires_at": "2026-10-28T10:04:07.658371Z",
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

`POST /api/driver/v1/offers/43b077ed-e9d1-4c24-9e81-6fdd39423737/reject` → **204**

```json
{
  "command_id": "da43b82f-97dd-40b2-bdac-babaefccb04d"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "90323e88-d1f4-4fda-aeb7-20d818eaf562",
    "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
    "expires_at": "2026-10-28T10:04:07.729426Z",
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

`POST /api/driver/v1/offers/90323e88-d1f4-4fda-aeb7-20d818eaf562/accept` → **200**

```json
{
  "command_id": "60b6be64-7dc9-4a5a-ac6e-76948d1830d6"
}
```

```json
{
  "id": "2e0f824c-40ea-4ae4-bb31-7cc62226918c",
  "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "998888ba-80bd-4ef2-ae13-870aa601644f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/00e77a08-60d9-412c-a4e7-8d3bdca0c9b7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:03:52.655518Z",
      "actor": {
        "type": "CLIENT",
        "id": "e7b16520-79c6-4be0-bcd2-f6369404df66",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
        "quote_id": "37916dce-36d9-4aee-b2b5-678a45036c0f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9ed6707f-c6d9-4a26-9ee2-00f87d79760f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:03:52.657472Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
        "attempt_id": "defcb516-6f5e-4040-bfc6-e5cfcf1ed04c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9ed6707f-c6d9-4a26-9ee2-00f87d79760f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:03:52.664559Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "43b077ed-e9d1-4c24-9e81-6fdd39423737",
        "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "9ed6707f-c6d9-4a26-9ee2-00f87d79760f"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:03:52.728276Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "43b077ed-e9d1-4c24-9e81-6fdd39423737",
        "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7"
      },
      "correlation_id": "69c4a6c6-7603-4fff-9f96-10667a5a887c"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 00e77a08-60d9-412c-a4e7-8d3bdca0c9b7 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/00e77a08-60d9-412c-a4e7-8d3bdca0c9b7` → **200**

```json
{
  "id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e7b16520-79c6-4be0-bcd2-f6369404df66",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2e0f824c-40ea-4ae4-bb31-7cc62226918c",
    "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "998888ba-80bd-4ef2-ae13-870aa601644f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:03:52.654946Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/00e77a08-60d9-412c-a4e7-8d3bdca0c9b7/cancel` → **200**

```json
{
  "command_id": "286b2827-d4ef-4ed1-b937-ddacc5dba318",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e7b16520-79c6-4be0-bcd2-f6369404df66",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2e0f824c-40ea-4ae4-bb31-7cc62226918c",
    "order_id": "00e77a08-60d9-412c-a4e7-8d3bdca0c9b7",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "998888ba-80bd-4ef2-ae13-870aa601644f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:03:52.654946Z",
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
  "session_id": "0790eabc-4ee9-4f7c-b9b5-587f622deb95",
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
  "last_heartbeat_at": "2026-10-28T10:03:51.643291Z",
  "last_location_at": "2026-10-28T10:03:51.643291Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0790eabc-4ee9-4f7c-b9b5-587f622deb95/close` → **200**

```json
{
  "command_id": "69f7162f-6eba-42a8-add6-69697a4ea5fd",
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
  "session_id": "87dd5156-1ac9-4b2c-8e1f-23dd2f39b762",
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
  "last_heartbeat_at": "2026-10-28T10:03:51.84905Z",
  "last_location_at": "2026-10-28T10:03:51.84905Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/87dd5156-1ac9-4b2c-8e1f-23dd2f39b762/close` → **200**

```json
{
  "command_id": "edcdea96-ede4-41d3-8a7a-75a264091c26",
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
  "device_ref": "sandbox-27624"
}
```

```json
{
  "challenge_id": "b964539f-9877-4bcc-8031-78a035d5424d",
  "expires_at": "2026-10-28T10:08:53.159925339Z",
  "resend_available_at": "2026-10-28T10:03:54.159925339Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "802180",
  "sent_at": "2026-10-28T10:03:53.163657172Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b964539f-9877-4bcc-8031-78a035d5424d",
  "code": "802180",
  "device_ref": "sandbox-27624"
}
```

```json
{
  "session_id": "d156fbb2-777f-4fd0-8364-1e7f25b500e2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjczMywiaWF0IjoxNzkzMTgxODMzLCJqdGkiOiJiODE3OTAyNi0zMTRhLTQ2ZWItOTQ2Yi1jNWMzOWVlNzZhNDMiLCJzaWQiOiJkMTU2ZmJiMi03NzdmLTRmZDAtODM2NC0xZTdmMjViNTAwZTIifQ.18HjK1_ut70DSQkevrfY6EHT-BwaW_pKWMT2LrHvFc0",
  "access_expires_at": "2026-10-28T10:18:53.226095839Z",
  "refresh_token": "rU1_SE6kbDmCuaHTzb1GsyK6nwHdMLfsHbglz2CfcBk",
  "refresh_expires_at": "2026-11-27T10:03:53.22543748Z",
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
  "command_id": "3af30b44-ff74-4643-a3c3-4d9c67170916",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:53Z",
    "sequence": 1793181833278
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:03:53.295832Z",
  "last_location_at": "2026-10-28T10:03:53.295832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674863433",
  "device_ref": "sandbox-1102"
}
```

```json
{
  "challenge_id": "8c1c9315-da24-4506-9730-bc7f8292fd8c",
  "expires_at": "2026-10-28T10:08:53.328076449Z",
  "resend_available_at": "2026-10-28T10:03:54.328076449Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674863433` → **200**

```json
{
  "phone": "+380674863433",
  "audience": "CLIENT",
  "code": "985922",
  "sent_at": "2026-10-28T10:03:53.330344435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c1c9315-da24-4506-9730-bc7f8292fd8c",
  "code": "985922",
  "device_ref": "sandbox-1102"
}
```

```json
{
  "session_id": "75babba0-2b22-4eb0-be62-52621244a283",
  "subject": {
    "type": "CLIENT",
    "id": "049b5fd7-baa3-4d6e-b01f-0a896d9a29ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDliNWZkNy1iYWEzLTRkNmUtYjAxZi0wYTg5NmQ5YTI5YWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzMzLCJpYXQiOjE3OTMxODE4MzMsImp0aSI6IjEzYzM0YWQzLWJlY2ItNDAwOC1hMWJjLTAzNjg3ZTNhOGZjOCIsInNpZCI6Ijc1YmFiYmEwLTJiMjItNGViMC1iZTYyLTUyNjIxMjQ0YTI4MyJ9.YiwTHAVgYyBBrxKk-nqjCr6546SjqgbHNl66UGimyxU",
  "access_expires_at": "2026-10-28T10:18:53.384611948Z",
  "refresh_token": "4QROr4hTFS5gOL_deX9CWUiO2iGUafUXxTP_EDem_t0",
  "refresh_expires_at": "2026-11-27T10:03:53.38404406Z",
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
  "command_id": "9a532790-3b4d-472a-88cd-4a29eb774644",
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
  "id": "c9816fbd-c474-439d-b1d8-9fda9a4d7b7e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:08:53.449429Z",
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
  "command_id": "61a34391-b2fa-4445-9f00-77da43d3face",
  "platform": "ANDROID",
  "token": "sandbox-driver-1dc68503-fa31-4273-aeb1-dc48a849f58e"
}
```

```json
{
  "id": "a9c0e55f-786e-4112-af66-4f116052e416",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:03:53.492768Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "3f59ddea-2a43-44e0-9317-35a1d9819cfe",
  "platform": "ANDROID",
  "token": "sandbox-rider-f469660c-92a0-4c44-8185-19e516642676"
}
```

```json
{
  "id": "3d9b9643-22a9-4733-b621-817a70ddceda",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:03:53.530483Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c72c6f06-9b1c-4488-b900-f26aa691e240",
  "quote_id": "c9816fbd-c474-439d-b1d8-9fda9a4d7b7e",
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
  "id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "049b5fd7-baa3-4d6e-b01f-0a896d9a29ab",
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
  "created_at": "2026-10-28T10:03:53.576395Z",
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
    "id": "bb74e98e-6929-4ef2-b351-577b4bdca7d9",
    "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
    "expires_at": "2026-10-28T10:04:08.580016Z",
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

`POST /api/driver/v1/offers/bb74e98e-6929-4ef2-b351-577b4bdca7d9/accept` → **200**

```json
{
  "command_id": "7f20c83b-8292-4bb8-9138-d3681dbd1d3d"
}
```

```json
{
  "id": "b1adbe04-197d-4923-b01d-b84a663f5cc4",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "70c505d6-0d10-4074-9615-b98ed28778a4",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:03:53.551Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:03:53.551Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:03:54.541621046Z",
    "token_suffix": "49f58e",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "3fa7ddf9-cd86-4951-9446-efaa386d846c",
      "order_version": "2",
      "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674863433&after=2026-10-28T10:03:53.551Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:03:54.543248579Z",
    "token_suffix": "642676",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "a3de00d8-c73f-4cb2-a60f-b5eb7b7d24e6",
      "order_version": "3",
      "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832/messages` → **201**

```json
{
  "command_id": "b0ac7ad5-ed0d-43b4-9195-650a5cbcfc53",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "d54fece8-3d58-4d95-b2ac-4d24c2f27bbd",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:03:54.794215793Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "70c505d6-0d10-4074-9615-b98ed28778a4",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "assignment_id": "b1adbe04-197d-4923-b01d-b84a663f5cc4",
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

`POST /api/driver/v1/trips/70c505d6-0d10-4074-9615-b98ed28778a4/messages` → **201**

```json
{
  "command_id": "848d48b3-bff6-4dd7-b7bd-4cce1e5df605",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "4df126b2-bae2-4b4c-a814-bccdf7f0c172",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:03:54.855939771Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/70c505d6-0d10-4074-9615-b98ed28778a4/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674863433"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:54Z",
    "sequence": 1793181834944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:03:54.966067Z",
  "last_location_at": "2026-10-28T10:03:54.966067Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "70c505d6-0d10-4074-9615-b98ed28778a4",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "assignment_id": "b1adbe04-197d-4923-b01d-b84a663f5cc4",
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

`POST /api/driver/v1/trips/70c505d6-0d10-4074-9615-b98ed28778a4/arrive` → **200**

```json
{
  "command_id": "748368aa-b02d-4def-9c55-641788ba9870",
  "expected_version": 0
}
```

```json
{
  "id": "70c505d6-0d10-4074-9615-b98ed28778a4",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "assignment_id": "b1adbe04-197d-4923-b01d-b84a663f5cc4",
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
  "arrived_at": "2026-10-28T10:03:55.025515Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/70c505d6-0d10-4074-9615-b98ed28778a4/start` → **200**

```json
{
  "command_id": "a807fde9-bef6-4390-8bc1-55bf53a031ff",
  "expected_version": 1
}
```

```json
{
  "id": "70c505d6-0d10-4074-9615-b98ed28778a4",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "assignment_id": "b1adbe04-197d-4923-b01d-b84a663f5cc4",
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
  "arrived_at": "2026-10-28T10:03:55.025515Z",
  "started_at": "2026-10-28T10:03:55.063802Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:03:55Z",
    "sequence": 1793181835909
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:03:55.110442Z",
  "last_location_at": "2026-10-28T10:03:55.110442Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/70c505d6-0d10-4074-9615-b98ed28778a4/complete` → **200**

```json
{
  "command_id": "bba3d5c5-a9e0-4ff4-a061-e70bbbdbb114",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:03:55Z",
  "cash_received": true
}
```

```json
{
  "id": "70c505d6-0d10-4074-9615-b98ed28778a4",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "assignment_id": "b1adbe04-197d-4923-b01d-b84a663f5cc4",
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
  "arrived_at": "2026-10-28T10:03:55.025515Z",
  "started_at": "2026-10-28T10:03:55.063802Z",
  "completed_at": "2026-10-28T10:03:55.148262Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832` → **200**

```json
{
  "id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "049b5fd7-baa3-4d6e-b01f-0a896d9a29ab",
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
    "id": "b1adbe04-197d-4923-b01d-b84a663f5cc4",
    "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "70c505d6-0d10-4074-9615-b98ed28778a4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:03:53.576395Z",
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
    "id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:03:53.576395Z",
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
    "id": "70c505d6-0d10-4074-9615-b98ed28778a4",
    "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:03:53.65854Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "38a16358-8652-406b-88a0-d50be82b2e6d",
    "order_id": "cee9286d-c85f-44ef-9720-22e2595759a6",
    "order_short_number": 1,
    "created_at": "2026-10-28T10:03:14.473356Z",
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

`GET /api/rider/v1/orders/6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832/tip` → **200**

```json
{
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
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
  "available_until": "2026-10-29T10:03:55.148262Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832/tip` → **201**

```json
{
  "command_id": "54284b83-544b-40b0-9f27-9b0c609c0956",
  "amount_minor": 1100
}
```

```json
{
  "id": "9c86cf73-8c4e-46ed-a79e-2f608aa71956",
  "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:03:58.360974Z"
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
  "session_id": "13904855-4312-4ed3-83f5-7f89ef2f47f4",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MzgsImlhdCI6MTc5MzE4MTgzOCwianRpIjoiMDg5YjMzN2MtODE5Zi00NDYxLWIwNGQtYjdjY2JlODQ3MjMyIiwic2lkIjoiMTM5MDQ4NTUtNDMxMi00ZWQzLTgzZjUtN2Y4OWVmMmY0N2Y0In0.QxI8TS7QS5obhiK2NUiH59c6kABKrSJfOPPVJgLm71g",
  "access_expires_at": "2026-10-28T10:18:58.689975324Z",
  "refresh_token": "yshItvIBc5VtplGbaYQ7Q07L5yrCuyDEUl6PVoEEvOE",
  "refresh_expires_at": "2026-10-28T22:03:58.689396435Z",
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
          "CASH": 6,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 2,
          "STAFF": 1
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
      "CASH": 6,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 2,
      "STAFF": 1
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
  "generated_at": "2026-10-28T10:03:58.722903875Z"
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
  "generated_at": "2026-10-28T10:03:58.753667988Z"
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
  "session_id": "2245aac1-8c1b-45b6-a339-db9a255ca17c",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MzksImlhdCI6MTc5MzE4MTgzOSwianRpIjoiNjZjODQ3ZTktMTE2Zi00NmY3LWFjZTctN2MwMWZmMWQxNDczIiwic2lkIjoiMjI0NWFhYzEtOGMxYi00NWI2LWEzMzktZGI5YTI1NWNhMTdjIn0.fyFWHC2uUmnXFfQBIGJKknbzOGsiZ0eypdW800DWwLw",
  "access_expires_at": "2026-10-28T10:18:59.077278118Z",
  "refresh_token": "rH_G_KzSg7e7nU-yzPFlzslvxzEgY_10F88La3-FQj0",
  "refresh_expires_at": "2026-10-28T22:03:59.076615884Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:03:53.576989Z",
      "actor": {
        "type": "CLIENT",
        "id": "049b5fd7-baa3-4d6e-b01f-0a896d9a29ab",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
        "quote_id": "c9816fbd-c474-439d-b1d8-9fda9a4d7b7e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1b94593c-1bec-48d1-8f2e-0281fe4d9638"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:03:53.579009Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
        "attempt_id": "e428e4c2-ad46-4e68-9c6d-85c253ef8a4e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1b94593c-1bec-48d1-8f2e-0281fe4d9638"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:03:53.585859Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bb74e98e-6929-4ef2-b351-577b4bdca7d9",
        "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "1b94593c-1bec-48d1-8f2e-0281fe4d9638"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:03:53.660428Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bb74e98e-6929-4ef2-b351-577b4bdca7d9",
        "order_id": "6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b1adbe04-197d-4923-b01d-b84a663f5cc4"
      },
      "correlation_id": "b46926e3-97ba-424d-ab7d-e4434909663e"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:03:59.132204473Z",
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
      "last_location_at": "2026-10-28T10:03:55.110442Z",
      "order_id": null
    }
  ]
}
```

Done: order 6f4b9beb-3014-4b0a-b7ac-24e0fb3dd832.

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
  "session_id": "3eb9dac6-8b16-400e-a524-26bd127bfd4c",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MzksImlhdCI6MTc5MzE4MTgzOSwianRpIjoiYzliYTc4MGItMGJhNS00NGQ1LWI2OGQtMjU4NWQ2Yjg3ZWFmIiwic2lkIjoiM2ViOWRhYzYtOGIxNi00MDBlLWE1MjQtMjZiZDEyN2JmZDRjIn0.608MrRKaxuDXRHNHcqqIIKfcUgN-wmR6pcUfDPPPfDI",
  "access_expires_at": "2026-10-28T10:18:59.472180223Z",
  "refresh_token": "yeC8e4jpYab2ZJvA7YDQpmtAdQneic0MnvJ1yKmujwA",
  "refresh_expires_at": "2026-10-28T22:03:59.471611333Z",
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
  "command_id": "c07e75f6-d4c7-4b9d-85d1-ff3d477abde7",
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
  "timestamp": "2026-10-28T10:03:59.000+0000",
  "channel": {
    "id": "1730052000.231717841",
    "linkedid": "1730052000.231717841",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671494420"
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
  "timestamp": "2026-10-28T10:03:59.000+0000",
  "channel": {
    "id": "1730052000.231717841",
    "linkedid": "1730052000.231717841",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671494420"
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
  "session_id": "b9be7596-7622-45b5-9c9e-90f73fda77c2",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3MzksImlhdCI6MTc5MzE4MTgzOSwianRpIjoiMjczNjEwMDgtZjczZi00MThhLTg1NzEtZTcxOTE1YzliOGFhIiwic2lkIjoiYjliZTc1OTYtNzYyMi00NWI1LTljOWUtOTBmNzNmZGE3N2MyIn0.MmV77zeSGcreBj5Ikt3_Ii3zWW7c3jMK5JPsUI0Q9yY",
  "access_expires_at": "2026-10-28T10:18:59.90266614Z",
  "refresh_token": "PFoFZlkrLwPv_yVHEBTwQ3TLQjymrdtSrCM1O52GGLM",
  "refresh_expires_at": "2026-10-28T22:03:59.902077143Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "3d5b5c3a-bf81-4f36-95cd-d8121bb231a4",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671494420",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:03:59Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/3d5b5c3a-bf81-4f36-95cd-d8121bb231a4/answer` → **200**

```json
{
  "command_id": "4c7f463c-0d13-4111-b046-26beeda7c71b"
}
```

```json
{
  "id": "3d5b5c3a-bf81-4f36-95cd-d8121bb231a4",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671494420",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "order_ids": [],
  "started_at": "2026-10-28T10:03:59Z",
  "answered_at": "2026-10-28T10:03:59.973787Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.231717841",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e8b81f6a-2fea-4602-a588-5fc994fa66ca",
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
  "id": "ce77f038-0ea1-47c9-a3cb-1aef6f570fa2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:00.039257Z",
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
  "command_id": "b9f210f4-2333-44fa-ac92-9e335240c254",
  "quote_id": "ce77f038-0ea1-47c9-a3cb-1aef6f570fa2",
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
    "phone": "+380671494420"
  },
  "call_id": "3d5b5c3a-bf81-4f36-95cd-d8121bb231a4"
}
```

```json
{
  "id": "a462c746-4307-4b7a-84d7-5fe7e875ad63",
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
  "created_at": "2026-10-28T10:04:00.096297Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671494420"
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
    "id": "1730052000.231717841",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3d5b5c3a-bf81-4f36-95cd-d8121bb231a4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671494420",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [
        "a462c746-4307-4b7a-84d7-5fe7e875ad63"
      ],
      "started_at": "2026-10-28T10:03:59Z",
      "answered_at": "2026-10-28T10:03:59.973787Z",
      "ended_at": "2026-10-28T10:04:00.14214Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "cbe361e3-2165-4f43-8fb5-347bee9b7a6f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677784549",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [],
      "started_at": "2026-10-28T10:03:18.765368Z",
      "answered_at": "2026-10-28T10:03:18.831843Z",
      "ended_at": "2026-10-28T10:03:18.884934Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:03:20.417479Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/a462c746-4307-4b7a-84d7-5fe7e875ad63` → **200**

```json
{
  "id": "a462c746-4307-4b7a-84d7-5fe7e875ad63",
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
  "created_at": "2026-10-28T10:04:00.096297Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671494420"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/a462c746-4307-4b7a-84d7-5fe7e875ad63` → **200**

```json
{
  "id": "a462c746-4307-4b7a-84d7-5fe7e875ad63",
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
  "created_at": "2026-10-28T10:04:00.096297Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671494420"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a462c746-4307-4b7a-84d7-5fe7e875ad63/cancel` → **200**

```json
{
  "command_id": "68229ec8-43ac-47f7-ba77-5c4609e23aff",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a462c746-4307-4b7a-84d7-5fe7e875ad63",
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
  "created_at": "2026-10-28T10:04:00.096297Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671494420"
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

Done: call 3d5b5c3a-bf81-4f36-95cd-d8121bb231a4 with order a462c746-4307-4b7a-84d7-5fe7e875ad63.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8789"
}
```

```json
{
  "challenge_id": "cfe14dd7-16ce-4968-82e3-ddbd2eb4cbdb",
  "expires_at": "2026-10-28T10:09:00.298806433Z",
  "resend_available_at": "2026-10-28T10:04:01.298806433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "068893",
  "sent_at": "2026-10-28T10:04:00.301012695Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfe14dd7-16ce-4968-82e3-ddbd2eb4cbdb",
  "code": "068893",
  "device_ref": "sandbox-8789"
}
```

```json
{
  "session_id": "2d76ed7e-ea42-40f8-ab96-62e6ab95eb37",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc0MCwiaWF0IjoxNzkzMTgxODQwLCJqdGkiOiIyODU1NWRkNS1hYTVmLTQ4ZjctODU2OS1mZmVhNWIzMDQwMWEiLCJzaWQiOiIyZDc2ZWQ3ZS1lYTQyLTQwZjgtYWI5Ni02MmU2YWI5NWViMzcifQ.p5-HjgSfYZH7ii6EnJ9N3GKXJ1MKNTNAC9_-FTNhW4k",
  "access_expires_at": "2026-10-28T10:19:00.357282195Z",
  "refresh_token": "EoP_XemkcANj65t-Yeqi9JTLKm0A1aVgbLMLon-gEeE",
  "refresh_expires_at": "2026-11-27T10:04:00.356699219Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:03:55.110442Z",
  "last_location_at": "2026-10-28T10:03:55.110442Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/handover` → **200**

```json
{
  "command_id": "465f0a17-7be4-47f2-ad67-ebd779c5b04e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:03:55.110442Z",
  "last_location_at": "2026-10-28T10:03:55.110442Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:00Z",
    "sequence": 1793181840444
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:04:00.463085Z",
  "last_location_at": "2026-10-28T10:04:00.463085Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660419454",
  "device_ref": "sandbox-22043"
}
```

```json
{
  "challenge_id": "e2ae3769-4ce9-4bc0-8703-15707fcbd858",
  "expires_at": "2026-10-28T10:09:00.487484171Z",
  "resend_available_at": "2026-10-28T10:04:01.487484171Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660419454` → **200**

```json
{
  "phone": "+380660419454",
  "audience": "CLIENT",
  "code": "391126",
  "sent_at": "2026-10-28T10:04:00.489654145Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2ae3769-4ce9-4bc0-8703-15707fcbd858",
  "code": "391126",
  "device_ref": "sandbox-22043"
}
```

```json
{
  "session_id": "971c6ffe-ecaa-48bd-8528-584d0f16a7bd",
  "subject": {
    "type": "CLIENT",
    "id": "647a3b46-5df6-4688-ac65-820d05245d66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDdhM2I0Ni01ZGY2LTQ2ODgtYWM2NS04MjBkMDUyNDVkNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzQwLCJpYXQiOjE3OTMxODE4NDAsImp0aSI6ImQ1NTdhYTZlLTk4Y2ItNDFmYi05MDMxLTAzMTg3M2QwMzUyYiIsInNpZCI6Ijk3MWM2ZmZlLWVjYWEtNDhiZC04NTI4LTU4NGQwZjE2YTdiZCJ9.FMWQTHki0_FqchHCmHDQHupU8rCGnE-d4I5vQOsXjKk",
  "access_expires_at": "2026-10-28T10:19:00.54557727Z",
  "refresh_token": "1cDayWStn5pAoPSMkSj8hSPVhWaUEm6-9ZfPwZSL0MA",
  "refresh_expires_at": "2026-11-27T10:04:00.544971091Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "29ed0bf2-7541-4938-8263-0b2c6be4f7c5",
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
  "id": "a50f07d3-a5a9-4d74-b866-4201da416950",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:00.581716Z",
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
  "command_id": "5e75dbde-9a12-465b-b969-036a60aeebba",
  "quote_id": "a50f07d3-a5a9-4d74-b866-4201da416950",
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
  "id": "3591a669-1411-403d-b61b-a78c27dab4cb",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "647a3b46-5df6-4688-ac65-820d05245d66",
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
  "created_at": "2026-10-28T10:04:00.621513Z",
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
    "id": "5f4927f1-f5d2-4f00-b9d6-f886cda9bead",
    "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
    "expires_at": "2026-10-28T10:04:15.625226Z",
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

`POST /api/driver/v1/offers/5f4927f1-f5d2-4f00-b9d6-f886cda9bead/accept` → **200**

```json
{
  "command_id": "47bc3731-67c9-439d-a56e-8180e9fc610c"
}
```

```json
{
  "id": "c467b9c2-a70e-40a8-8bf5-a18422dd9e0b",
  "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "96f0a68d-b690-4c04-9395-ba90af172ec2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "96f0a68d-b690-4c04-9395-ba90af172ec2",
  "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
  "assignment_id": "c467b9c2-a70e-40a8-8bf5-a18422dd9e0b",
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

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:00Z",
    "sequence": 1793181840730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:04:00.749802Z",
  "last_location_at": "2026-10-28T10:04:00.749802Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/96f0a68d-b690-4c04-9395-ba90af172ec2/arrive` → **200**

```json
{
  "command_id": "746dd30e-1e54-41af-b9d0-b86a3bedbaef",
  "expected_version": 0
}
```

```json
{
  "id": "96f0a68d-b690-4c04-9395-ba90af172ec2",
  "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
  "assignment_id": "c467b9c2-a70e-40a8-8bf5-a18422dd9e0b",
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
  "arrived_at": "2026-10-28T10:04:00.78771Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/96f0a68d-b690-4c04-9395-ba90af172ec2/start` → **200**

```json
{
  "command_id": "6b62ef5e-5233-4b00-bfdf-a1578d1444e2",
  "expected_version": 1
}
```

```json
{
  "id": "96f0a68d-b690-4c04-9395-ba90af172ec2",
  "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
  "assignment_id": "c467b9c2-a70e-40a8-8bf5-a18422dd9e0b",
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
  "arrived_at": "2026-10-28T10:04:00.78771Z",
  "started_at": "2026-10-28T10:04:00.827051Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:00Z",
    "sequence": 1793181840855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:04:00.873959Z",
  "last_location_at": "2026-10-28T10:04:00.873959Z",
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
  "device_ref": "sandbox-10845"
}
```

```json
{
  "challenge_id": "b226e08d-64d8-4665-a8b2-5df9ac5d2201",
  "expires_at": "2026-10-28T10:09:00.897784342Z",
  "resend_available_at": "2026-10-28T10:04:01.897784342Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "436288",
  "sent_at": "2026-10-28T10:04:00.900086302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b226e08d-64d8-4665-a8b2-5df9ac5d2201",
  "code": "436288",
  "device_ref": "sandbox-10845"
}
```

```json
{
  "session_id": "74c3f1f5-8e38-4ab7-b49d-f6385f9933be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc0MCwiaWF0IjoxNzkzMTgxODQwLCJqdGkiOiIyNzUxNTFkMS0xYmI5LTRjNGMtYWUwYS02MWRjYmY1MmM0ZDEiLCJzaWQiOiI3NGMzZjFmNS04ZTM4LTRhYjctYjQ5ZC1mNjM4NWY5OTMzYmUifQ.SQkUCYq9Y0opEzPn34zzB6eqaMuMUSF8Di41ZZW8D38",
  "access_expires_at": "2026-10-28T10:19:00.954099205Z",
  "refresh_token": "0nUs0d7iuFP-M5GiyleI1dqK75qnfjaj2-Vo_238p8I",
  "refresh_expires_at": "2026-11-27T10:04:00.953539011Z",
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
  "command_id": "52d5dfdc-deb9-4494-ab5f-10a48ed9ffb7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:01Z",
    "sequence": 1793181841218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c15973a7-369b-4baa-9249-61a1e0683249",
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
  "last_heartbeat_at": "2026-10-28T10:04:01.039695Z",
  "last_location_at": "2026-10-28T10:04:01.039695Z",
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
  "session_id": "6f50f880-f1a8-4256-b8c9-080a0fbf9707",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NDEsImlhdCI6MTc5MzE4MTg0MSwianRpIjoiOWIzOTQ1YzgtYjIwMS00NThhLWI5MWUtN2Q0Y2JhMGZmODcyIiwic2lkIjoiNmY1MGY4ODAtZjFhOC00MjU2LWI4YzktMDgwYTBmYmY5NzA3In0.tkfz5xvImcimxaMqhdHwScpLTg0utBY7NPDpWeoOTNg",
  "access_expires_at": "2026-10-28T10:19:01.368265259Z",
  "refresh_token": "JenYEpxlO5lIebKfNMHWJFuLEpnAPT1h9CYQM-Tsj-E",
  "refresh_expires_at": "2026-10-28T22:04:01.367664572Z",
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
  "session_id": "bb9b4c2a-bb4f-4b80-9c49-a2b705dee50c",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NDEsImlhdCI6MTc5MzE4MTg0MSwianRpIjoiNmM1ODI4MWEtYTU5Zi00NjA4LWE1MDItZjc5MGI4NTU4OWU1Iiwic2lkIjoiYmI5YjRjMmEtYmI0Zi00YjgwLTljNDktYTJiNzA1ZGVlNTBjIn0.UL9KMOyJNUEzEXmqkvObuec2RSnrToG0O8z8cwpmdWY",
  "access_expires_at": "2026-10-28T10:19:01.688788206Z",
  "refresh_token": "kXhENmhMaxli2MRu4knXrjFi-OmxsoV9zHYyazttozg",
  "refresh_expires_at": "2026-10-28T22:04:01.688223554Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3591a669-1411-403d-b61b-a78c27dab4cb` → **200**

```json
{
  "id": "3591a669-1411-403d-b61b-a78c27dab4cb",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "647a3b46-5df6-4688-ac65-820d05245d66",
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
    "id": "c467b9c2-a70e-40a8-8bf5-a18422dd9e0b",
    "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "96f0a68d-b690-4c04-9395-ba90af172ec2",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T10:04:00.621513Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3591a669-1411-403d-b61b-a78c27dab4cb/interrupt` → **200**

```json
{
  "command_id": "a900bcb3-4b11-4564-9db5-8e4a12815c39",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "3591a669-1411-403d-b61b-a78c27dab4cb",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "647a3b46-5df6-4688-ac65-820d05245d66",
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
      "id": "c467b9c2-a70e-40a8-8bf5-a18422dd9e0b",
      "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "96f0a68d-b690-4c04-9395-ba90af172ec2",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T10:04:00.621513Z",
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
    "id": "2dee533c-2c9e-41b3-ae4d-4963c72332ea",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "647a3b46-5df6-4688-ac65-820d05245d66",
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
    "id": "d4cda1e6-336b-4924-88c0-da4c0cbcde34",
    "order_id": "2dee533c-2c9e-41b3-ae4d-4963c72332ea",
    "expires_at": "2026-10-28T10:04:16.764966Z",
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

`POST /api/driver/v1/offers/d4cda1e6-336b-4924-88c0-da4c0cbcde34/accept` → **200**

```json
{
  "command_id": "fd738729-8cd3-4e0f-9cb8-eed1ae63379d"
}
```

```json
{
  "id": "e1a5b718-35dc-45a0-b2d8-873f3eb6a5ff",
  "order_id": "2dee533c-2c9e-41b3-ae4d-4963c72332ea",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5cccb093-fd56-477c-b066-d4f2748c6abe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5cccb093-fd56-477c-b066-d4f2748c6abe",
  "order_id": "2dee533c-2c9e-41b3-ae4d-4963c72332ea",
  "assignment_id": "e1a5b718-35dc-45a0-b2d8-873f3eb6a5ff",
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
  "session_id": "c15973a7-369b-4baa-9249-61a1e0683249",
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
  "last_heartbeat_at": "2026-10-28T10:04:01.039695Z",
  "last_location_at": "2026-10-28T10:04:01.039695Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/c15973a7-369b-4baa-9249-61a1e0683249/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:01Z",
    "sequence": 1793181841909
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c15973a7-369b-4baa-9249-61a1e0683249",
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
  "last_heartbeat_at": "2026-10-28T10:04:01.928443Z",
  "last_location_at": "2026-10-28T10:04:01.928443Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5cccb093-fd56-477c-b066-d4f2748c6abe/arrive` → **200**

```json
{
  "command_id": "cd18a754-02ba-451c-b557-9c3ccb36082f",
  "expected_version": 0
}
```

```json
{
  "id": "5cccb093-fd56-477c-b066-d4f2748c6abe",
  "order_id": "2dee533c-2c9e-41b3-ae4d-4963c72332ea",
  "assignment_id": "e1a5b718-35dc-45a0-b2d8-873f3eb6a5ff",
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
  "arrived_at": "2026-10-28T10:04:01.96706Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5cccb093-fd56-477c-b066-d4f2748c6abe/start` → **200**

```json
{
  "command_id": "f7b04d3b-2d58-4932-b4ea-520e211d19b4",
  "expected_version": 1
}
```

```json
{
  "id": "5cccb093-fd56-477c-b066-d4f2748c6abe",
  "order_id": "2dee533c-2c9e-41b3-ae4d-4963c72332ea",
  "assignment_id": "e1a5b718-35dc-45a0-b2d8-873f3eb6a5ff",
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
  "arrived_at": "2026-10-28T10:04:01.96706Z",
  "started_at": "2026-10-28T10:04:02.010006Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5cccb093-fd56-477c-b066-d4f2748c6abe/complete` → **200**

```json
{
  "command_id": "38e40f7c-685f-4ac3-875c-dc9f7d659fca",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:04:02Z"
}
```

```json
{
  "id": "5cccb093-fd56-477c-b066-d4f2748c6abe",
  "order_id": "2dee533c-2c9e-41b3-ae4d-4963c72332ea",
  "assignment_id": "e1a5b718-35dc-45a0-b2d8-873f3eb6a5ff",
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
  "arrived_at": "2026-10-28T10:04:01.96706Z",
  "started_at": "2026-10-28T10:04:02.010006Z",
  "completed_at": "2026-10-28T10:04:02.058767Z",
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
    "id": "2dee533c-2c9e-41b3-ae4d-4963c72332ea",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:04:01.754765Z",
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
    "id": "3591a669-1411-403d-b61b-a78c27dab4cb",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:04:00.621513Z",
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

`GET /api/operator/v1/orders/3591a669-1411-403d-b61b-a78c27dab4cb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:04:00.622047Z",
      "actor": {
        "type": "CLIENT",
        "id": "647a3b46-5df6-4688-ac65-820d05245d66",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
        "quote_id": "a50f07d3-a5a9-4d74-b866-4201da416950",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "018e7800-16d5-4f2f-8cb7-c26e65dbf3f0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:04:00.624232Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
        "attempt_id": "d95a37f7-ec4a-493a-9c2c-113a069ab6a6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "018e7800-16d5-4f2f-8cb7-c26e65dbf3f0"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:04:00.628522Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5f4927f1-f5d2-4f00-b9d6-f886cda9bead",
        "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "018e7800-16d5-4f2f-8cb7-c26e65dbf3f0"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:04:00.68811Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5f4927f1-f5d2-4f00-b9d6-f886cda9bead",
        "order_id": "3591a669-1411-403d-b61b-a78c27dab4cb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c467b9c2-a70e-40a8-8bf5-a18422dd9e0b"
      },
      "correlation_id": "e6dfaebc-f74c-4156-bb1f-232b4954b992"
```

Done: interrupted 3591a669-1411-403d-b61b-a78c27dab4cb, follow-up 2dee533c-2c9e-41b3-ae4d-4963c72332ea.

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
  "session_id": "b53f0887-0fa4-46ad-a7b3-895fbde7eca4",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NDUsImlhdCI6MTc5MzE4MTg0NSwianRpIjoiOGFmYmMyODYtOWQ4OC00NjdjLWJmOWMtMjkyYTI2ODE3OGFkIiwic2lkIjoiYjUzZjA4ODctMGZhNC00NmFkLWE3YjMtODk1ZmJkZTdlY2E0In0.0vSY5FnstXk1FOyIVaLA3a12qA2McrtNnPkkYiGX8XA",
  "access_expires_at": "2026-10-28T10:19:05.478449389Z",
  "refresh_token": "R8qqOrs_UroBoBWgP56G2J4433TVtr_1BvqRX-rwM8E",
  "refresh_expires_at": "2026-10-28T22:04:05.477871161Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "fc0d2c09-6307-497a-bd39-8c78765553b2",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:04:05Z"
}
```

```json
{
  "id": "63647c3f-b618-4fdc-a02a-1fb915909360",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:04:05Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/63647c3f-b618-4fdc-a02a-1fb915909360/publish` → **200**

```json
{
  "command_id": "a81838d8-453d-4b7f-9d21-577712dc2594",
  "expected_version": 0
}
```

```json
{
  "id": "63647c3f-b618-4fdc-a02a-1fb915909360",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:04:05.570466Z",
  "published_at": "2026-10-28T10:04:05.570466Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "63647c3f-b618-4fdc-a02a-1fb915909360",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:04:05.570466Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639594506",
  "device_ref": "sandbox-30123"
}
```

```json
{
  "challenge_id": "cbd061e7-1365-46a2-a20a-849169dbcf32",
  "expires_at": "2026-10-28T10:09:05.63002138Z",
  "resend_available_at": "2026-10-28T10:04:06.63002138Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639594506` → **200**

```json
{
  "phone": "+380639594506",
  "audience": "CLIENT",
  "code": "133318",
  "sent_at": "2026-10-28T10:04:05.632471559Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbd061e7-1365-46a2-a20a-849169dbcf32",
  "code": "133318",
  "device_ref": "sandbox-30123"
}
```

```json
{
  "session_id": "bcffde42-8dca-43af-800d-7709bdf053c9",
  "subject": {
    "type": "CLIENT",
    "id": "91fc6d45-854c-4e81-a413-8e486cb3753a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWZjNmQ0NS04NTRjLTRlODEtYTQxMy04ZTQ4NmNiMzc1M2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzQ1LCJpYXQiOjE3OTMxODE4NDUsImp0aSI6IjMzMTUyYTc3LWFmODAtNDg2NS1hZWViLTEwZGUyYmM0OTlkMiIsInNpZCI6ImJjZmZkZTQyLThkY2EtNDNhZi04MDBkLTc3MDliZGYwNTNjOSJ9.5qTG6X6M-3zQ_BEpcYNJmqnAXIUA1F8qcmckaouGwsU",
  "access_expires_at": "2026-10-28T10:19:05.689560689Z",
  "refresh_token": "QjazxKm6S6VGAzTxC33a369InKv0grhej2hPRykOrPg",
  "refresh_expires_at": "2026-11-27T10:04:05.688868197Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "63647c3f-b618-4fdc-a02a-1fb915909360",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:04:05.570466Z",
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
  "command_id": "5e582ade-5beb-4171-9995-27f13ca245cb",
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
  "id": "b2c79750-3aa8-4ae4-8d36-e82f4e5bbe3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:05.750964Z",
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
  "command_id": "a5e4108c-e129-4e34-a73c-2118140d0dbd",
  "quote_id": "b2c79750-3aa8-4ae4-8d36-e82f4e5bbe3a",
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
  "correlation_id": "1e791413-16b4-455f-b895-763ec8b87a21"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "77388c28-5ad6-4a64-9284-043c75fc181b",
  "version_id": "63647c3f-b618-4fdc-a02a-1fb915909360",
  "language": "uk"
}
```

```json
{
  "version_id": "63647c3f-b618-4fdc-a02a-1fb915909360",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:04:05.821522Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48942190-43e7-471e-9624-4ba91e1d0dd9",
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
  "id": "3ea048d8-a989-4be0-9d1a-e0c6b769603b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:05.860093Z",
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
  "command_id": "f99a2a48-71c5-452f-b37a-510f44523057",
  "quote_id": "3ea048d8-a989-4be0-9d1a-e0c6b769603b",
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
  "id": "c6b92874-44ef-40db-897d-8b1e7a1d7d61",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91fc6d45-854c-4e81-a413-8e486cb3753a",
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
  "created_at": "2026-10-28T10:04:05.895368Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/c6b92874-44ef-40db-897d-8b1e7a1d7d61` → **200**

```json
{
  "id": "c6b92874-44ef-40db-897d-8b1e7a1d7d61",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91fc6d45-854c-4e81-a413-8e486cb3753a",
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
  "created_at": "2026-10-28T10:04:05.895368Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/c6b92874-44ef-40db-897d-8b1e7a1d7d61/cancel` → **200**

```json
{
  "command_id": "71773ef6-8724-4bd5-9220-c3a6c5c485a8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c6b92874-44ef-40db-897d-8b1e7a1d7d61",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "91fc6d45-854c-4e81-a413-8e486cb3753a",
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
  "created_at": "2026-10-28T10:04:05.895368Z",
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
  "discount_minor": 0
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/63647c3f-b618-4fdc-a02a-1fb915909360` → **409**

```json
{
  "command_id": "5acca0ce-1dd9-47b7-96d0-6df65578f8de",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:04:05Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/63647c3f-b618-4fdc-a02a-1fb915909360",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "02bc61ff-6d9b-4c2f-93a5-c00b4fe1b60b"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2770454f-c3f4-474c-97aa-f4c5930389c8",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:04:06Z"
}
```

```json
{
  "id": "23ed41ab-52b3-47e5-923f-b00eba8b33f4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:04:06Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/23ed41ab-52b3-47e5-923f-b00eba8b33f4/publish` → **200**

```json
{
  "command_id": "1cd4a142-2353-4035-958d-0adef844b87f",
  "expected_version": 0
}
```

```json
{
  "id": "23ed41ab-52b3-47e5-923f-b00eba8b33f4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:04:06.086077Z",
  "published_at": "2026-10-28T10:04:06.086077Z",
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
  "device_ref": "sandbox-4502"
}
```

```json
{
  "challenge_id": "513b8ed4-79cc-4162-be37-0120eb67e0bd",
  "expires_at": "2026-10-28T10:09:06.125365107Z",
  "resend_available_at": "2026-10-28T10:04:07.125365107Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "552835",
  "sent_at": "2026-10-28T10:04:06.127812192Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "513b8ed4-79cc-4162-be37-0120eb67e0bd",
  "code": "552835",
  "device_ref": "sandbox-4502"
}
```

```json
{
  "session_id": "af81c7f9-27f0-4d37-80ee-c6d5db07a6db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc0NiwiaWF0IjoxNzkzMTgxODQ2LCJqdGkiOiIzOTUzZTFjMi0yZTkwLTQyNTItOTcwNS0wNjliMGMyMTYwMzEiLCJzaWQiOiJhZjgxYzdmOS0yN2YwLTRkMzctODBlZS1jNmQ1ZGIwN2E2ZGIifQ.KxaOK8_7U3k66rTMnr6auY8SKQ3xTB95S4ef6SJkCVg",
  "access_expires_at": "2026-10-28T10:19:06.181354728Z",
  "refresh_token": "iXIj42dALg7Qkd_pcMD248nFUEzS3cImr0ppQloQvTQ",
  "refresh_expires_at": "2026-11-27T10:04:06.180756032Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c15973a7-369b-4baa-9249-61a1e0683249",
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
  "last_heartbeat_at": "2026-10-28T10:04:01.928443Z",
  "last_location_at": "2026-10-28T10:04:01.928443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c15973a7-369b-4baa-9249-61a1e0683249/handover` → **200**

```json
{
  "command_id": "1c5e6e7c-a85f-4a6a-aa94-4972c19be448",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c15973a7-369b-4baa-9249-61a1e0683249",
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
  "last_heartbeat_at": "2026-10-28T10:04:01.928443Z",
  "last_location_at": "2026-10-28T10:04:01.928443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c15973a7-369b-4baa-9249-61a1e0683249/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:06Z",
    "sequence": 1793181846263
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c15973a7-369b-4baa-9249-61a1e0683249",
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
  "last_heartbeat_at": "2026-10-28T10:04:06.281462Z",
  "last_location_at": "2026-10-28T10:04:06.281462Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675174319",
  "device_ref": "sandbox-17339"
}
```

```json
{
  "challenge_id": "522f316f-efca-4ecd-9ab8-ae9e8cfd0c9a",
  "expires_at": "2026-10-28T10:09:06.308472254Z",
  "resend_available_at": "2026-10-28T10:04:07.308472254Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675174319` → **200**

```json
{
  "phone": "+380675174319",
  "audience": "CLIENT",
  "code": "245458",
  "sent_at": "2026-10-28T10:04:06.311013342Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "522f316f-efca-4ecd-9ab8-ae9e8cfd0c9a",
  "code": "245458",
  "device_ref": "sandbox-17339"
}
```

```json
{
  "session_id": "e18b61a2-ba3e-4087-900f-cf7f0bda14d1",
  "subject": {
    "type": "CLIENT",
    "id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmY0YWVhMi0xYjhkLTRhMjAtYmI4Yy1lYjYzYWE3ODZjMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzQ2LCJpYXQiOjE3OTMxODE4NDYsImp0aSI6IjRhZDk1OGEzLWI4MDctNGNlZS04M2YyLThiMThjZDg4YmIyOCIsInNpZCI6ImUxOGI2MWEyLWJhM2UtNDA4Ny05MDBmLWNmN2YwYmRhMTRkMSJ9.dq0TMnA2o74OavA0bcsdTq3fW67E1_QbFGi2VDyzIHI",
  "access_expires_at": "2026-10-28T10:19:06.368745811Z",
  "refresh_token": "PPgzwnX6pU-e5Iu63xHWAstddA-hC8XXxF0rf0xMsuM",
  "refresh_expires_at": "2026-11-27T10:04:06.368120974Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3941f337-e12b-428e-a6c8-fe4da5d04b08",
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
  "id": "00f0e063-3f1e-4e7e-9ad6-62d860641e2b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:06.403682Z",
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
  "command_id": "3b24b226-600f-40be-bc5a-777af6d902c7",
  "quote_id": "00f0e063-3f1e-4e7e-9ad6-62d860641e2b",
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
    "phone": "+380676672330"
  }
}
```

```json
{
  "id": "09125be6-57e3-4440-abbc-4419906f5b18",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:04:06.443734Z",
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
    "id": "a90547dd-c68f-400e-a2e5-da63698fb593",
    "order_id": "09125be6-57e3-4440-abbc-4419906f5b18",
    "expires_at": "2026-10-28T10:04:21.447202Z",
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

`POST /api/driver/v1/offers/a90547dd-c68f-400e-a2e5-da63698fb593/accept` → **200**

```json
{
  "command_id": "02910cab-ed6d-4ea9-a088-871b6b457e62"
}
```

```json
{
  "id": "ce0f3283-1e0d-4c69-93ae-14e724c8b486",
  "order_id": "09125be6-57e3-4440-abbc-4419906f5b18",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "76c1c542-34ed-4259-ac4d-74dadaae9609",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "76c1c542-34ed-4259-ac4d-74dadaae9609",
  "order_id": "09125be6-57e3-4440-abbc-4419906f5b18",
  "assignment_id": "ce0f3283-1e0d-4c69-93ae-14e724c8b486",
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
    "phone": "+380676672330"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fae35af8-994c-4079-87ea-330e6ec7007a",
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
  "id": "6cfb41c1-2729-48f8-a7f2-faee9c1cb3e7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:06.586701Z",
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
  "command_id": "3fa6d608-40e8-4c8c-8b7f-c1e2ba00f2c0",
  "quote_id": "6cfb41c1-2729-48f8-a7f2-faee9c1cb3e7",
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
  "id": "6cb87218-7cf0-40b4-9c48-935dce664f99",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:04:06.623882Z",
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
  "command_id": "b4ac4531-e86e-4db9-b5d2-5de696d978d2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:04:06Z"
}
```

```json
{
  "id": "f7f38893-b84a-4831-8ad2-eed70a456298",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:06.672022Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:04:06Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9e134ff2-1ad4-4511-96dd-047a276d35d7",
  "quote_id": "f7f38893-b84a-4831-8ad2-eed70a456298",
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
  "pickup_at": "2026-10-28T13:04:06Z"
}
```

```json
{
  "id": "5e69f3e2-b4fa-4999-b8e1-98b636dcea6f",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:04:06.710669Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:04:06Z",
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
  "command_id": "01b7e434-a027-4280-9c22-5bb6eeb48294",
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
  "id": "7eebe717-ee47-41a9-baef-eca07fbe946c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:06.752438Z",
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
  "command_id": "60457142-45e7-4dce-9650-7176ae7eed34",
  "quote_id": "7eebe717-ee47-41a9-baef-eca07fbe946c",
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
  "correlation_id": "ac4f4e7d-4d50-40cf-bfad-a94aff90bbc4"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "5e69f3e2-b4fa-4999-b8e1-98b636dcea6f",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T10:04:06.710669Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:04:06Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "6cb87218-7cf0-40b4-9c48-935dce664f99",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T10:04:06.623882Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "09125be6-57e3-4440-abbc-4419906f5b18",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "6cb87218-7cf0-40b4-9c48-935dce664f99",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:04:06.623882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/09125be6-57e3-4440-abbc-4419906f5b18` → **200**

```json
{
  "id": "09125be6-57e3-4440-abbc-4419906f5b18",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "ce0f3283-1e0d-4c69-93ae-14e724c8b486",
    "order_id": "09125be6-57e3-4440-abbc-4419906f5b18",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "76c1c542-34ed-4259-ac4d-74dadaae9609",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:04:06.443734Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/09125be6-57e3-4440-abbc-4419906f5b18/cancel` → **200**

```json
{
  "command_id": "0b69d074-eda4-4cb5-93dd-2be63e4b0057",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "09125be6-57e3-4440-abbc-4419906f5b18",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "ce0f3283-1e0d-4c69-93ae-14e724c8b486",
    "order_id": "09125be6-57e3-4440-abbc-4419906f5b18",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "76c1c542-34ed-4259-ac4d-74dadaae9609",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:04:06.443734Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/6cb87218-7cf0-40b4-9c48-935dce664f99` → **200**

```json
{
  "id": "6cb87218-7cf0-40b4-9c48-935dce664f99",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:04:06.623882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/6cb87218-7cf0-40b4-9c48-935dce664f99/cancel` → **200**

```json
{
  "command_id": "89063043-584c-4738-b9bc-b88429716138",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6cb87218-7cf0-40b4-9c48-935dce664f99",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T10:04:06.623882Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/5e69f3e2-b4fa-4999-b8e1-98b636dcea6f` → **200**

```json
{
  "id": "5e69f3e2-b4fa-4999-b8e1-98b636dcea6f",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:04:06.710669Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:04:06Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5e69f3e2-b4fa-4999-b8e1-98b636dcea6f/cancel` → **200**

```json
{
  "command_id": "0c2df8e3-e57f-44e0-9651-4e3ba4561281",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5e69f3e2-b4fa-4999-b8e1-98b636dcea6f",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "42f4aea2-1b8d-4a20-bb8c-eb63aa786c38",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:04:06.710669Z",
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
  "pickup_at": "2026-10-28T13:04:06Z",
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
  "session_id": "c15973a7-369b-4baa-9249-61a1e0683249",
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
  "last_heartbeat_at": "2026-10-28T10:04:06.281462Z",
  "last_location_at": "2026-10-28T10:04:06.281462Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c15973a7-369b-4baa-9249-61a1e0683249/close` → **200**

```json
{
  "command_id": "5900a78e-1ee5-4c45-9b9f-9dc61c630421",
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

Done: orders 09125be6-57e3-4440-abbc-4419906f5b18, 6cb87218-7cf0-40b4-9c48-935dce664f99, 5e69f3e2-b4fa-4999-b8e1-98b636dcea6f.

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
  "session_id": "2afddae3-7d40-4ea1-babd-d6a00d403d20",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NDcsImlhdCI6MTc5MzE4MTg0NywianRpIjoiMTI4ZDM3OGUtYzhhNi00ZDQ4LWI5MTEtODFkMzMwN2EyNzFiIiwic2lkIjoiMmFmZGRhZTMtN2Q0MC00ZWExLWJhYmQtZDZhMDBkNDAzZDIwIn0.UZwu1g-RrtJ81ogH157v37eH9qbBnSka4t7Wfjz-COs",
  "access_expires_at": "2026-10-28T10:19:07.41282673Z",
  "refresh_token": "lMp5P2q5_nffGbfR7mbmCBDI7Db-QBt9-ZaG4ussrj8",
  "refresh_expires_at": "2026-10-28T22:04:07.412296892Z",
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
  "session_id": "73c8cb15-56cc-4400-92be-4f4581c84f0b",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NDcsImlhdCI6MTc5MzE4MTg0NywianRpIjoiY2YzYzFkZTgtYWFlOS00NmRmLWIyMjgtODI2ZWUxM2JlNDM4Iiwic2lkIjoiNzNjOGNiMTUtNTZjYy00NDAwLTkyYmUtNGY0NTgxYzg0ZjBiIn0.C_o_EZcJ0iSdnzV2H7SsJQkgTVkaKPpyQPGfB_8Et40",
  "access_expires_at": "2026-10-28T10:19:07.73264535Z",
  "refresh_token": "RONolY3zi5tYf8_EjxIO9_tyUi_30ozcLvJv-1ZC9CA",
  "refresh_expires_at": "2026-10-28T22:04:07.732078914Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14882"
}
```

```json
{
  "challenge_id": "e07782ba-35ca-44c3-9df2-5cb06f3dcd4b",
  "expires_at": "2026-10-28T10:09:07.756469673Z",
  "resend_available_at": "2026-10-28T10:04:08.756469673Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "785130",
  "sent_at": "2026-10-28T10:04:07.758500369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e07782ba-35ca-44c3-9df2-5cb06f3dcd4b",
  "code": "785130",
  "device_ref": "sandbox-14882"
}
```

```json
{
  "session_id": "500099cd-9362-4dd8-8f2e-fa615b7786b6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc0NywiaWF0IjoxNzkzMTgxODQ3LCJqdGkiOiJiNWMxMGZkNi03MDNiLTQ0MWUtOTU2Yi03ZWMwMWRlNGJiMTEiLCJzaWQiOiI1MDAwOTljZC05MzYyLTRkZDgtOGYyZS1mYTYxNWI3Nzg2YjYifQ.vNCcUelUOA2tyTpCeU4-N6qpTwWVg9lx8E4oyMw22BI",
  "access_expires_at": "2026-10-28T10:19:07.811551389Z",
  "refresh_token": "tIqzBiERnNoIcsyUfNxCTtl11Ll236i3Ck0l94I4Drw",
  "refresh_expires_at": "2026-11-27T10:04:07.810992537Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:04:00.873959Z",
  "last_location_at": "2026-10-28T10:04:00.873959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/handover` → **200**

```json
{
  "command_id": "f8b6662f-88e9-4569-94bb-e51fcab7f75d",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:04:00.873959Z",
  "last_location_at": "2026-10-28T10:04:00.873959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:07Z",
    "sequence": 1793181847895
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:04:07.913862Z",
  "last_location_at": "2026-10-28T10:04:07.913862Z",
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
  "command_id": "df503a7e-57cd-429e-aff2-187ed1cdeecd",
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
  "effective_at": "2026-10-28T10:04:07.979709Z",
  "changed_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:04:08.008467472Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fbd2d6ef-5016-467e-8145-fc49956bd745",
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
  "id": "b2d3e5eb-2ff5-4734-bbeb-2f6c8ac7ae38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:08.043828Z",
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
  "command_id": "de4032ab-73b8-4897-8a50-9c15a200d20c",
  "quote_id": "b2d3e5eb-2ff5-4734-bbeb-2f6c8ac7ae38",
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
    "phone": "+3806711125161"
  }
}
```

```json
{
  "id": "88ab9935-1c70-45aa-a571-2ec6c2b7d094",
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
  "created_at": "2026-10-28T10:04:08.0801Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125161"
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
    "id": "b3bbe1c2-0f76-4332-b1ad-e9161e29e045",
    "order_id": "88ab9935-1c70-45aa-a571-2ec6c2b7d094",
    "expires_at": "2026-10-28T10:04:23.083523Z",
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

`POST /api/driver/v1/offers/b3bbe1c2-0f76-4332-b1ad-e9161e29e045/accept` → **200**

```json
{
  "command_id": "9f25151f-538d-4a5e-acec-70ce4f4a449d"
}
```

```json
{
  "id": "ec49ab88-9521-4341-a283-1adff24de985",
  "order_id": "88ab9935-1c70-45aa-a571-2ec6c2b7d094",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1a296ff2-2b7f-4bfb-98dc-40b2c91dc6a2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a296ff2-2b7f-4bfb-98dc-40b2c91dc6a2",
  "order_id": "88ab9935-1c70-45aa-a571-2ec6c2b7d094",
  "assignment_id": "ec49ab88-9521-4341-a283-1adff24de985",
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
    "phone": "+3806711125161"
  }
}
```

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:08Z",
    "sequence": 1793181848186
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:04:08.203803Z",
  "last_location_at": "2026-10-28T10:04:08.203803Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1a296ff2-2b7f-4bfb-98dc-40b2c91dc6a2/arrive` → **200**

```json
{
  "command_id": "4bb48a56-3a14-45e1-9d46-d8bd22d6873c",
  "expected_version": 0
}
```

```json
{
  "id": "1a296ff2-2b7f-4bfb-98dc-40b2c91dc6a2",
  "order_id": "88ab9935-1c70-45aa-a571-2ec6c2b7d094",
  "assignment_id": "ec49ab88-9521-4341-a283-1adff24de985",
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
  "arrived_at": "2026-10-28T10:04:08.238535Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125161"
  }
}
```

`POST /api/driver/v1/trips/1a296ff2-2b7f-4bfb-98dc-40b2c91dc6a2/start` → **200**

```json
{
  "command_id": "dcec9f07-2a28-4775-bd96-464b9abaf3ed",
  "expected_version": 1
}
```

```json
{
  "id": "1a296ff2-2b7f-4bfb-98dc-40b2c91dc6a2",
  "order_id": "88ab9935-1c70-45aa-a571-2ec6c2b7d094",
  "assignment_id": "ec49ab88-9521-4341-a283-1adff24de985",
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
  "arrived_at": "2026-10-28T10:04:08.238535Z",
  "started_at": "2026-10-28T10:04:08.275828Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125161"
  }
}
```

`POST /api/driver/v1/trips/1a296ff2-2b7f-4bfb-98dc-40b2c91dc6a2/complete` → **200**

```json
{
  "command_id": "63943623-611d-4979-9561-91149dddec53",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:04:08Z",
  "cash_received": true
}
```

```json
{
  "id": "1a296ff2-2b7f-4bfb-98dc-40b2c91dc6a2",
  "order_id": "88ab9935-1c70-45aa-a571-2ec6c2b7d094",
  "assignment_id": "ec49ab88-9521-4341-a283-1adff24de985",
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
  "arrived_at": "2026-10-28T10:04:08.238535Z",
  "started_at": "2026-10-28T10:04:08.275828Z",
  "completed_at": "2026-10-28T10:04:08.318554Z",
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
  "command_id": "22c43699-c174-4da1-a3ba-6e7ca0c2983d",
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
  "id": "5f8fb0f9-25cf-4ec7-a078-cd73330513bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:08.371199Z",
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
  "command_id": "0d033d53-5dfa-40bd-87e1-17198e210a0f",
  "quote_id": "5f8fb0f9-25cf-4ec7-a078-cd73330513bf",
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
    "phone": "+380671118177"
  }
}
```

```json
{
  "id": "d872be8b-5730-465e-9f68-5e0549e426b1",
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
  "created_at": "2026-10-28T10:04:08.410353Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118177"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d872be8b-5730-465e-9f68-5e0549e426b1` → **200**

```json
{
  "id": "d872be8b-5730-465e-9f68-5e0549e426b1",
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
  "created_at": "2026-10-28T10:04:08.410353Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118177"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d872be8b-5730-465e-9f68-5e0549e426b1/cancel` → **200**

```json
{
  "command_id": "0c4296f3-0e93-4511-b185-e971e03ba84d",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d872be8b-5730-465e-9f68-5e0549e426b1",
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
  "created_at": "2026-10-28T10:04:08.410353Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118177"
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
  "staff_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T10:04:08.480068Z",
  "last_entries": [
    {
      "order_id": "d872be8b-5730-465e-9f68-5e0549e426b1",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T10:04:08.480068Z"
    },
    {
      "order_id": "88ab9935-1c70-45aa-a571-2ec6c2b7d094",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T10:04:08.326879Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "105497bb-1668-4405-a3e7-7a59c01991f9",
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
  "last_heartbeat_at": "2026-10-28T10:04:08.203803Z",
  "last_location_at": "2026-10-28T10:04:08.203803Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/105497bb-1668-4405-a3e7-7a59c01991f9/close` → **200**

```json
{
  "command_id": "0bd7141a-6123-46b6-8874-b50255d3efab",
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

Done: operator bonus for fulfilled 88ab9935-1c70-45aa-a571-2ec6c2b7d094 and operator-fault cancellation d872be8b-5730-465e-9f68-5e0549e426b1.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671863283",
  "device_ref": "sandbox-20487"
}
```

```json
{
  "challenge_id": "d6476a0a-4b47-4930-a6b6-f15e88641123",
  "expires_at": "2026-10-28T10:09:10.631752917Z",
  "resend_available_at": "2026-10-28T10:04:11.631752917Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671863283` → **200**

```json
{
  "phone": "+380671863283",
  "audience": "CLIENT",
  "code": "660125",
  "sent_at": "2026-10-28T10:04:10.634137843Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671682014",
  "device_ref": "sandbox-46",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "651e56b6-64c9-41ef-9961-458681f657ce",
  "expires_at": "2026-10-28T10:09:10.685615887Z",
  "resend_available_at": "2026-10-28T10:04:11.685615887Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671682014` → **200**

```json
{
  "phone": "+380671682014",
  "audience": "CLIENT",
  "code": "038408",
  "sent_at": "2026-10-28T10:04:10.687841549Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679690000",
  "device_ref": "sandbox-9206"
}
```

```json
{
  "challenge_id": "8a4d432d-8f25-4af0-8d5a-a5bb430bf0be",
  "expires_at": "2026-10-28T10:09:10.739123197Z",
  "resend_available_at": "2026-10-28T10:04:11.739123197Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679690000` → **200**

```json
{
  "phone": "+380679690000",
  "audience": "CLIENT",
  "code": "439509",
  "sent_at": "2026-10-28T10:04:10.74187143Z",
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
  "session_id": "c0d5bff1-bcec-4956-b07a-adbf5fbc020d",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NTEsImlhdCI6MTc5MzE4MTg1MSwianRpIjoiYjhjNzUwN2ItYzhjOS00ZjQ0LTk0NDItZWFjMDdjZDUzNzQ2Iiwic2lkIjoiYzBkNWJmZjEtYmNlYy00OTU2LWIwN2EtYWRiZjVmYmMwMjBkIn0.tb7PDyoDyQuCI3Uc8oPEjdIPiunfPsHaO08WFKG41X4",
  "access_expires_at": "2026-10-28T10:19:11.087543589Z",
  "refresh_token": "1kbp40vxsP5ST3Wat32vtd2aDfbExudPrkCFHakBNIw",
  "refresh_expires_at": "2026-10-28T22:04:11.086939372Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679690000` → **200**

```json
{
  "deliveries": [
    {
      "id": "5a4cba39-b52a-42ac-9376-d799db42a1d5",
      "challenge_id": "8a4d432d-8f25-4af0-8d5a-a5bb430bf0be",
      "phone": "+380679690000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ee2a11db-e270-417f-a85e-8f00e5693402",
      "error": null,
      "attempted_at": "2026-10-28T10:04:10.742102Z"
    },
    {
      "id": "9112f696-5d78-4b9d-a08a-adfc48d60eb6",
      "challenge_id": "8a4d432d-8f25-4af0-8d5a-a5bb430bf0be",
      "phone": "+380679690000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:04:10.741393Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679690000` → **200**

```json
{
  "phone": "+380679690000",
  "audience": "CLIENT",
  "code": "439509",
  "sent_at": "2026-10-28T10:04:10.74187143Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671682014` → **200**

```json
{
  "deliveries": [
    {
      "id": "6d30b4f9-4091-4b4b-94d3-34d9583b9886",
      "challenge_id": "651e56b6-64c9-41ef-9961-458681f657ce",
      "phone": "+380671682014",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-57de9dc6-e5c8-4b90-8678-5485baf46cef",
      "error": null,
      "attempted_at": "2026-10-28T10:04:10.688077Z"
    }
  ]
}
```

Done: SMS to +380671863283, a call to +380671682014, SMS then a call to +380679690000.

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
  "session_id": "5376f160-383f-4252-9157-e9a6a33ada16",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NTEsImlhdCI6MTc5MzE4MTg1MSwianRpIjoiNDBjYTI1ZjgtM2RmOC00YWU3LWFjYTAtNGQ3ODViNjFkNDA3Iiwic2lkIjoiNTM3NmYxNjAtMzgzZi00MjUyLTkxNTctZTlhNmEzM2FkYTE2In0.CX-verxBCn8EcQyrZI1ECxmLniz0uyu6D0woWUxoSsk",
  "access_expires_at": "2026-10-28T10:19:11.506763791Z",
  "refresh_token": "N66d6xibeIwvSPDslStOpvDljMPovw96kRU3a8qKNWA",
  "refresh_expires_at": "2026-10-28T22:04:11.506264481Z",
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
  "session_id": "8005a0e4-3702-4565-9d1e-dcdd91229911",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NTEsImlhdCI6MTc5MzE4MTg1MSwianRpIjoiOWVkODUyNWItYTQ3Yy00OGNiLTgzZTQtMTUxZGIwNzlmNjkzIiwic2lkIjoiODAwNWEwZTQtMzcwMi00NTY1LTlkMWUtZGNkZDkxMjI5OTExIn0.QQtlRPo79F7h0pbEfAmdPLYR_S09DrDKQhpX-Q8ntuA",
  "access_expires_at": "2026-10-28T10:19:11.826214465Z",
  "refresh_token": "MHt1GR4koeNRJujURSlcMKbHAB5lChbrpuVdnv06rpg",
  "refresh_expires_at": "2026-10-28T22:04:11.825674388Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
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

`POST /api/admin/v1/staff-extensions/6152c8d7-f6a0-4ea0-859e-07f58c2684f8` → **200**

```json
{
  "command_id": "d793147b-682f-4cef-86d8-74168f2eb72b",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "bb9412b1-31e8-4b58-b5e9-6a19da1b4485",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:04:11.959498Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:04:11.959498Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a9a36f14-a2fa-4529-a304-ef545d373cac",
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
  "id": "f94be73b-75a3-4e30-b54b-39ed12688a92",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:12.021989Z",
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
  "command_id": "f5bb1dd9-088e-47b0-a76c-936a0ec6b38d",
  "quote_id": "f94be73b-75a3-4e30-b54b-39ed12688a92",
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
    "phone": "+380676899493"
  }
}
```

```json
{
  "id": "36509e62-0bb7-476c-a6f6-1e942fcf3aef",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:04:12.06139Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676899493"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/36509e62-0bb7-476c-a6f6-1e942fcf3aef/calls` → **201**

```json
{
  "command_id": "818ac676-93ec-4076-808d-0d59b0bc3ff0",
  "to": "CALLER"
}
```

```json
{
  "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "order_ids": [
    "36509e62-0bb7-476c-a6f6-1e942fcf3aef"
  ],
  "started_at": "2026-10-28T10:04:12.11427Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/36509e62-0bb7-476c-a6f6-1e942fcf3aef/calls` → **201**

```json
{
  "command_id": "818ac676-93ec-4076-808d-0d59b0bc3ff0",
  "to": "CALLER"
}
```

```json
{
  "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "order_ids": [
    "36509e62-0bb7-476c-a6f6-1e942fcf3aef"
  ],
  "started_at": "2026-10-28T10:04:12.11427Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676899493",
    "at": "2026-10-28T10:04:12.116689317Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.15741",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "1ad57176-a264-4d40-a3e5-1f4fc93187f1"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=36509e62-0bb7-476c-a6f6-1e942fcf3aef` → **200**

```json
{
  "calls": [
    {
      "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [
        "36509e62-0bb7-476c-a6f6-1e942fcf3aef"
      ],
      "started_at": "2026-10-28T10:04:12.11427Z",
      "answered_at": "2026-10-28T10:04:12.257402Z",
      "ended_at": "2026-10-28T10:04:12.278891Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=36509e62-0bb7-476c-a6f6-1e942fcf3aef` → **200**

```json
{
  "calls": [
    {
      "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [
        "36509e62-0bb7-476c-a6f6-1e942fcf3aef"
      ],
      "started_at": "2026-10-28T10:04:12.11427Z",
      "answered_at": "2026-10-28T10:04:12.257402Z",
      "ended_at": "2026-10-28T10:04:12.278891Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=36509e62-0bb7-476c-a6f6-1e942fcf3aef` → **200**

```json
{
  "calls": [
    {
      "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [
        "36509e62-0bb7-476c-a6f6-1e942fcf3aef"
      ],
      "started_at": "2026-10-28T10:04:12.11427Z",
      "answered_at": "2026-10-28T10:04:12.257402Z",
      "ended_at": "2026-10-28T10:04:12.278891Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=36509e62-0bb7-476c-a6f6-1e942fcf3aef` → **200**

```json
{
  "calls": [
    {
      "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [
        "36509e62-0bb7-476c-a6f6-1e942fcf3aef"
      ],
      "started_at": "2026-10-28T10:04:12.11427Z",
      "answered_at": "2026-10-28T10:04:12.257402Z",
      "ended_at": "2026-10-28T10:04:12.278891Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=36509e62-0bb7-476c-a6f6-1e942fcf3aef` → **200**

```json
{
  "calls": [
    {
      "id": "1ad57176-a264-4d40-a3e5-1f4fc93187f1",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "order_ids": [
        "36509e62-0bb7-476c-a6f6-1e942fcf3aef"
      ],
      "started_at": "2026-10-28T10:04:12.11427Z",
      "answered_at": "2026-10-28T10:04:12.257402Z",
      "ended_at": "2026-10-28T10:04:12.278891Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:04:20.438727Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/36509e62-0bb7-476c-a6f6-1e942fcf3aef` → **200**

```json
{
  "id": "36509e62-0bb7-476c-a6f6-1e942fcf3aef",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:04:12.06139Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676899493"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/36509e62-0bb7-476c-a6f6-1e942fcf3aef/cancel` → **200**

```json
{
  "command_id": "bb7dec97-7e02-45f7-958a-c801cbb9023a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "36509e62-0bb7-476c-a6f6-1e942fcf3aef",
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
  "created_at": "2026-10-28T10:04:12.06139Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676899493"
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
  "command_id": "371af639-5b57-4cba-8bff-b1be11b881d5",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T10:04:20.549251Z",
  "extension": "101"
}
```

Done: outgoing call 1ad57176-a264-4d40-a3e5-1f4fc93187f1 from order 36509e62-0bb7-476c-a6f6-1e942fcf3aef, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637777775",
  "device_ref": "sandbox-25396"
}
```

```json
{
  "challenge_id": "6fd40033-1a34-45eb-9adb-c2cb4ffe6df9",
  "expires_at": "2026-10-28T10:09:20.594792526Z",
  "resend_available_at": "2026-10-28T10:04:21.594792526Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637777775` → **200**

```json
{
  "phone": "+380637777775",
  "audience": "CLIENT",
  "code": "494210",
  "sent_at": "2026-10-28T10:04:20.597694674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6fd40033-1a34-45eb-9adb-c2cb4ffe6df9",
  "code": "494210",
  "device_ref": "sandbox-25396"
}
```

```json
{
  "session_id": "63de616c-8eea-4255-92ac-0e182f17b193",
  "subject": {
    "type": "CLIENT",
    "id": "4aa48769-7828-45ef-86a4-a4a3064c41a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWE0ODc2OS03ODI4LTQ1ZWYtODZhNC1hNGEzMDY0YzQxYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzYwLCJpYXQiOjE3OTMxODE4NjAsImp0aSI6IjdhYjU0YWJlLWE4NzktNGIwNy1hZGEyLTcwYjEwNzRlZGNhYyIsInNpZCI6IjYzZGU2MTZjLThlZWEtNDI1NS05MmFjLTBlMTgyZjE3YjE5MyJ9.WrJBEwKDEOTpgu8avKmVEG-Y15fTByt8y_uwJlkXAwI",
  "access_expires_at": "2026-10-28T10:19:20.657979974Z",
  "refresh_token": "Za9Y7UYcWMn8w7CT4E7DqmjVj87bMI4iXCadPk0Mg70",
  "refresh_expires_at": "2026-11-27T10:04:20.656860788Z",
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
  "session_id": "425e0ef8-18f9-447a-b011-d494dcb0d5b2",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NjEsImlhdCI6MTc5MzE4MTg2MSwianRpIjoiYmRkNmQ5MzEtMDU1Yy00ZjQ4LWFiZTUtNmQyYjIzZjExZjRiIiwic2lkIjoiNDI1ZTBlZjgtMThmOS00NDdhLWIwMTEtZDQ5NGRjYjBkNWIyIn0.zn1DkY15_iBvURnGZ0GCaxboiwBAhb7yIg89AWAgBpY",
  "access_expires_at": "2026-10-28T10:19:21.075678067Z",
  "refresh_token": "phLJEwCkdTL8BnKURZV_fNGb2EdZSCpZuqTEX3rP0nk",
  "refresh_expires_at": "2026-10-28T22:04:21.075076546Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637777775` → **200**

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
  "correlation_id": "2169d81a-33d6-440c-bf62-9c5de215ef67"
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
  "session_id": "b43b16b0-1903-4f76-bf71-ba2c7a6fb51d",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NjEsImlhdCI6MTc5MzE4MTg2MSwianRpIjoiYzQ0ZTIzNTktMGI0ZC00N2ZiLWFhZjktMmIyMTMwNDk4MTU3Iiwic2lkIjoiYjQzYjE2YjAtMTkwMy00Zjc2LWJmNzEtYmEyYzdhNmZiNTFkIn0.F5sxtMBwLHNkOu_00PN8GkRg5ziZuRjZ0yg7o_KSs68",
  "access_expires_at": "2026-10-28T10:19:21.468291239Z",
  "refresh_token": "DUv2S5jy5xeSzSttQDYInl_fYPHSA-q_zO4sefxDjWA",
  "refresh_expires_at": "2026-10-28T22:04:21.467691552Z",
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
  "command_id": "05c68f7b-0b1f-4f3f-a810-811d97316f89",
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
  "changed_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:04:21.540432001Z"
}
```

## The rider books the airport for 2026-10-28T13:04:21Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600609061",
  "device_ref": "sandbox-11105"
}
```

```json
{
  "challenge_id": "d4d2d3af-530f-4bcd-800b-331b73550147",
  "expires_at": "2026-10-28T10:09:21.57248101Z",
  "resend_available_at": "2026-10-28T10:04:22.57248101Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600609061` → **200**

```json
{
  "phone": "+48600609061",
  "audience": "CLIENT",
  "code": "121251",
  "sent_at": "2026-10-28T10:04:21.575402675Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4d2d3af-530f-4bcd-800b-331b73550147",
  "code": "121251",
  "device_ref": "sandbox-11105"
}
```

```json
{
  "session_id": "285daa5b-cb66-4972-ae34-94865fe1e25b",
  "subject": {
    "type": "CLIENT",
    "id": "176a83fb-68cd-46c9-b920-decbf8add1a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzZhODNmYi02OGNkLTQ2YzktYjkyMC1kZWNiZjhhZGQxYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzYxLCJpYXQiOjE3OTMxODE4NjEsImp0aSI6IjI4MjJjZjRlLTgwYjctNDFjOC1iZTM3LTJhOTIyZTYzMWQwNCIsInNpZCI6IjI4NWRhYTViLWNiNjYtNDk3Mi1hZTM0LTk0ODY1ZmUxZTI1YiJ9.k8-rcc56bmFwyJKX8D044RC8slkTUSZU2QpoSp38z2M",
  "access_expires_at": "2026-10-28T10:19:21.632399114Z",
  "refresh_token": "6d2AwK3wGjS5stpeXK8HtnQDRwdUi76x9uR7sX2nC4s",
  "refresh_expires_at": "2026-11-27T10:04:21.631779759Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fec339eb-03f6-44dc-a353-7a5c2b0e9258",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:04:21Z"
}
```

```json
{
  "id": "0b093054-b05a-4e8f-b284-7e17fab53907",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:21.669755Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:04:21Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8fe36469-3765-42cf-bcfd-53e915f9b9a6",
  "quote_id": "0b093054-b05a-4e8f-b284-7e17fab53907",
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
  "pickup_at": "2026-10-28T13:04:21Z"
}
```

```json
{
  "id": "e1c8b6e6-f838-458e-86bb-56e6997221e6",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "176a83fb-68cd-46c9-b920-decbf8add1a6",
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
  "created_at": "2026-10-28T10:04:21.71043Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:04:21Z",
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
  "device_ref": "sandbox-25422"
}
```

```json
{
  "challenge_id": "79cf2809-11a3-4248-acd6-3e8496c122c2",
  "expires_at": "2026-10-28T10:09:21.746253603Z",
  "resend_available_at": "2026-10-28T10:04:22.746253603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "597315",
  "sent_at": "2026-10-28T10:04:21.748756265Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79cf2809-11a3-4248-acd6-3e8496c122c2",
  "code": "597315",
  "device_ref": "sandbox-25422"
}
```

```json
{
  "session_id": "fa6e566a-94c9-4c95-a38e-fcd5c76f9f42",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc2MSwiaWF0IjoxNzkzMTgxODYxLCJqdGkiOiJjOTU1Yzg1Ny1kMTA3LTRmOTQtOWEyNy00Yzk0YmZlNDRkNjEiLCJzaWQiOiJmYTZlNTY2YS05NGM5LTRjOTUtYTM4ZS1mY2Q1Yzc2ZjlmNDIifQ.yMRmjzFKURDQM-LkWS-gYMFdQJz2h2Q-Tbrs_RGgMBY",
  "access_expires_at": "2026-10-28T10:19:21.804458033Z",
  "refresh_token": "UnLcshj2r9H3xqU0WxSYLyxK036uqgdLQNvzoWTFfGQ",
  "refresh_expires_at": "2026-11-27T10:04:21.803830261Z",
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
  "command_id": "6dbe9029-e167-4d37-b95c-15dc5dc1b766",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:21Z",
    "sequence": 1793181861855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1abf97c0-f430-475b-a360-800e8be996e2",
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
  "last_heartbeat_at": "2026-10-28T10:04:21.873558Z",
  "last_location_at": "2026-10-28T10:04:21.873558Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "e1c8b6e6-f838-458e-86bb-56e6997221e6",
      "short_number": 18,
      "pickup_at": "2026-10-28T13:04:21Z",
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

`POST /api/driver/v1/preorders/e1c8b6e6-f838-458e-86bb-56e6997221e6/reserve` → **200**

```json
{
  "command_id": "4a4f7914-9351-4a59-9af7-7c5a73006b55"
}
```

```json
{
  "id": "8584d86b-7246-4233-ac6d-3c691c597a95",
  "state": "RESERVED",
  "order": {
    "order_id": "e1c8b6e6-f838-458e-86bb-56e6997221e6",
    "short_number": 18,
    "pickup_at": "2026-10-28T13:04:21Z",
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
  "reserved_at": "2026-10-28T10:04:21.942477Z",
  "confirm_from": "2026-10-28T12:34:21Z",
  "confirm_until": "2026-10-28T12:44:21Z",
  "drop_until": "2026-10-28T12:04:21Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "8584d86b-7246-4233-ac6d-3c691c597a95",
      "state": "RESERVED",
      "order": {
        "order_id": "e1c8b6e6-f838-458e-86bb-56e6997221e6",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:04:21Z",
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
      "reserved_at": "2026-10-28T10:04:21.942477Z",
      "confirm_from": "2026-10-28T12:34:21Z",
      "confirm_until": "2026-10-28T12:44:21Z",
      "drop_until": "2026-10-28T12:04:21Z"
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
      "id": "8584d86b-7246-4233-ac6d-3c691c597a95",
      "state": "RESERVED",
      "order": {
        "order_id": "e1c8b6e6-f838-458e-86bb-56e6997221e6",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:04:21Z",
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
      "reserved_at": "2026-10-28T10:04:21.942477Z",
      "confirm_from": "2026-10-28T12:34:21Z",
      "confirm_until": "2026-10-28T12:44:21Z",
      "drop_until": "2026-10-28T12:04:21Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/8584d86b-7246-4233-ac6d-3c691c597a95/confirm` → **409**

```json
{
  "command_id": "087479ef-079d-4ead-87de-b3de93769264"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/8584d86b-7246-4233-ac6d-3c691c597a95/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2d6e3896-c682-4afe-8de8-cd60bf2274eb"
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
  "session_id": "5ee1cd4a-530c-4bec-a76a-6a1f91c32b1a",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NjIsImlhdCI6MTc5MzE4MTg2MiwianRpIjoiNzEwZWI5YTUtOWNkZi00NDBhLThjYjUtMjRhODM1MGNlNWM2Iiwic2lkIjoiNWVlMWNkNGEtNTMwYy00YmVjLWE3NmEtNmExZjkxYzMyYjFhIn0.IeN1CPMMxgMj1B6VxI8agOLR5A57nkecBVuzNVbLMto",
  "access_expires_at": "2026-10-28T10:19:22.348061613Z",
  "refresh_token": "vjtcBWWeGIlrB5Q9EIBELH1QxR0f7d9fOzolFYUiWeY",
  "refresh_expires_at": "2026-10-28T22:04:22.347482755Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e1c8b6e6-f838-458e-86bb-56e6997221e6` → **200**

```json
{
  "id": "e1c8b6e6-f838-458e-86bb-56e6997221e6",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "176a83fb-68cd-46c9-b920-decbf8add1a6",
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
  "created_at": "2026-10-28T10:04:21.71043Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:04:21Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "8584d86b-7246-4233-ac6d-3c691c597a95",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:04:21.942477Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e1c8b6e6-f838-458e-86bb-56e6997221e6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:04:21.711919Z",
      "actor": {
        "type": "CLIENT",
        "id": "176a83fb-68cd-46c9-b920-decbf8add1a6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "e1c8b6e6-f838-458e-86bb-56e6997221e6",
        "preorder": true,
        "quote_id": "0b093054-b05a-4e8f-b284-7e17fab53907",
        "pickup_at": "2026-10-28T13:04:21Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "040859e0-f999-48d4-829a-994dd1223d61"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:04:21.94354Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e1c8b6e6-f838-458e-86bb-56e6997221e6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "8584d86b-7246-4233-ac6d-3c691c597a95"
      },
      "correlation_id": "270683f1-7a3c-4b3f-8281-b4def5092e6c"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order e1c8b6e6-f838-458e-86bb-56e6997221e6, reservation 8584d86b-7246-4233-ac6d-3c691c597a95.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3323"
}
```

```json
{
  "challenge_id": "fc65988d-70a5-404d-ae0a-8f963c67a962",
  "expires_at": "2026-10-28T10:09:22.439852145Z",
  "resend_available_at": "2026-10-28T10:04:23.439852145Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "206279",
  "sent_at": "2026-10-28T10:04:22.442064608Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc65988d-70a5-404d-ae0a-8f963c67a962",
  "code": "206279",
  "device_ref": "sandbox-3323"
}
```

```json
{
  "session_id": "39d81999-5f97-4536-9bc0-e64b7a7b0010",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc2MiwiaWF0IjoxNzkzMTgxODYyLCJqdGkiOiJhNTlkOGVlMS04ZWYxLTRkOTItOWM3MC02MmE1YTkwOGJiZTIiLCJzaWQiOiIzOWQ4MTk5OS01Zjk3LTQ1MzYtOWJjMC1lNjRiN2E3YjAwMTAifQ.OIwhXQuGHE7hthRMVoIluOLQ-TGQPvrWSCPZrqtQbU8",
  "access_expires_at": "2026-10-28T10:19:22.497925811Z",
  "refresh_token": "Z_CUxhoWBnZGlc-8iStR-xT2zqy0P1NHxIKiQMYFnHw",
  "refresh_expires_at": "2026-11-27T10:04:22.497413176Z",
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
  "command_id": "71108539-e06e-4c2c-9911-0de79fb7ff7d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:22Z",
    "sequence": 1793181862548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ee2b133-6bb6-4637-9cef-ffdab0f1b69e",
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
  "last_heartbeat_at": "2026-10-28T10:04:22.56712Z",
  "last_location_at": "2026-10-28T10:04:22.56712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673446563",
  "device_ref": "sandbox-4008"
}
```

```json
{
  "challenge_id": "b0f4a1dc-4e16-4141-baa3-d83e33216b80",
  "expires_at": "2026-10-28T10:09:22.596260445Z",
  "resend_available_at": "2026-10-28T10:04:23.596260445Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673446563` → **200**

```json
{
  "phone": "+380673446563",
  "audience": "CLIENT",
  "code": "730380",
  "sent_at": "2026-10-28T10:04:22.598208055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0f4a1dc-4e16-4141-baa3-d83e33216b80",
  "code": "730380",
  "device_ref": "sandbox-4008"
}
```

```json
{
  "session_id": "8c66e599-2264-4035-b669-148e4f9e6c89",
  "subject": {
    "type": "CLIENT",
    "id": "bf6cfe36-5b75-4e6a-bac8-290b60d19c06"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjZjZmUzNi01Yjc1LTRlNmEtYmFjOC0yOTBiNjBkMTljMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzYyLCJpYXQiOjE3OTMxODE4NjIsImp0aSI6IjA1MDU4ZDlmLTYzMTItNGU0Yi04YTFlLTk3YWU4ZDYyOWJkMiIsInNpZCI6IjhjNjZlNTk5LTIyNjQtNDAzNS1iNjY5LTE0OGU0ZjllNmM4OSJ9.ojqxQ_ggD-QjpxGSBPi8SLmVbVrDNsMtNrngWMtvNI4",
  "access_expires_at": "2026-10-28T10:19:22.653297512Z",
  "refresh_token": "nv8fIhLJrMqLVr_tRh54Kl5pM6yjurE4IGZM8mzBpDc",
  "refresh_expires_at": "2026-11-27T10:04:22.652741235Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6e7d22a-5378-41d0-b3ee-3fbecfca05dd",
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
  "id": "e12c1009-ffb5-4afd-ab56-cd4e3fe4d199",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:22.691313Z",
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
  "command_id": "961dfe38-32ab-40c9-a705-f7f2ece6b814",
  "quote_id": "e12c1009-ffb5-4afd-ab56-cd4e3fe4d199",
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
  "id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bf6cfe36-5b75-4e6a-bac8-290b60d19c06",
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
  "created_at": "2026-10-28T10:04:22.729958Z",
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
    "id": "00f64522-d490-44d6-93a0-0ce979be942f",
    "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
    "expires_at": "2026-10-28T10:04:37.733524Z",
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

`POST /api/driver/v1/offers/00f64522-d490-44d6-93a0-0ce979be942f/accept` → **200**

```json
{
  "command_id": "7719dcc9-8e00-4ff4-80da-4148209d1070"
}
```

```json
{
  "id": "304e4fbc-40a7-480e-890a-bb9e9dc9d0bb",
  "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bdb7b201-aced-4775-bdfb-a7fa49328789",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bdb7b201-aced-4775-bdfb-a7fa49328789",
  "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "assignment_id": "304e4fbc-40a7-480e-890a-bb9e9dc9d0bb",
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

`POST /api/driver/v1/work-sessions/1ee2b133-6bb6-4637-9cef-ffdab0f1b69e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:22Z",
    "sequence": 1793181862843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ee2b133-6bb6-4637-9cef-ffdab0f1b69e",
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
  "last_heartbeat_at": "2026-10-28T10:04:22.862036Z",
  "last_location_at": "2026-10-28T10:04:22.862036Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bdb7b201-aced-4775-bdfb-a7fa49328789",
  "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "assignment_id": "304e4fbc-40a7-480e-890a-bb9e9dc9d0bb",
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

`POST /api/driver/v1/trips/bdb7b201-aced-4775-bdfb-a7fa49328789/arrive` → **200**

```json
{
  "command_id": "8531a388-6026-41d2-b850-5aa6953f7ea2",
  "expected_version": 0
}
```

```json
{
  "id": "bdb7b201-aced-4775-bdfb-a7fa49328789",
  "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "assignment_id": "304e4fbc-40a7-480e-890a-bb9e9dc9d0bb",
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
  "arrived_at": "2026-10-28T10:04:22.912948Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bdb7b201-aced-4775-bdfb-a7fa49328789/start` → **200**

```json
{
  "command_id": "9f6f9219-7ec8-482d-90c3-f094db9c6d94",
  "expected_version": 1
}
```

```json
{
  "id": "bdb7b201-aced-4775-bdfb-a7fa49328789",
  "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "assignment_id": "304e4fbc-40a7-480e-890a-bb9e9dc9d0bb",
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
  "arrived_at": "2026-10-28T10:04:22.912948Z",
  "started_at": "2026-10-28T10:04:22.946466Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1ee2b133-6bb6-4637-9cef-ffdab0f1b69e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:22Z",
    "sequence": 1793181862971
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ee2b133-6bb6-4637-9cef-ffdab0f1b69e",
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
  "last_heartbeat_at": "2026-10-28T10:04:22.990776Z",
  "last_location_at": "2026-10-28T10:04:22.990776Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/bdb7b201-aced-4775-bdfb-a7fa49328789/complete` → **200**

```json
{
  "command_id": "8a57c72d-7dbc-451f-9f71-c62f261841d2",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:04:23Z",
  "cash_received": true
}
```

```json
{
  "id": "bdb7b201-aced-4775-bdfb-a7fa49328789",
  "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "assignment_id": "304e4fbc-40a7-480e-890a-bb9e9dc9d0bb",
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
  "arrived_at": "2026-10-28T10:04:22.912948Z",
  "started_at": "2026-10-28T10:04:22.946466Z",
  "completed_at": "2026-10-28T10:04:23.023617Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/826987eb-a827-4b6e-bfff-ef8f886f77e6/rating` → **200**

```json
{
  "command_id": "6c32ec23-e5c3-438a-b543-8102fce153fa",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "score": 5,
  "created_at": "2026-10-28T10:04:23.071148109Z"
}
```

`POST /api/driver/v1/orders/826987eb-a827-4b6e-bfff-ef8f886f77e6/rating` → **200**

```json
{
  "command_id": "ed3d27c1-f993-4606-a75b-5e1763e44587",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
  "score": 4,
  "created_at": "2026-10-28T10:04:23.10876502Z"
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
  "session_id": "26666e4d-f6db-4b94-88ad-9fb978878109",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NjMsImlhdCI6MTc5MzE4MTg2MywianRpIjoiZTc1ZGY0ODEtMDg5OC00MDJmLWE2N2EtZDI3ZmM5OTkxYmYwIiwic2lkIjoiMjY2NjZlNGQtZjZkYi00Yjk0LTg4YWQtOWZiOTc4ODc4MTA5In0.VnXxCsWYx5RhWZ3jDjrCpClB77gjnImnv6YmcLEF6A0",
  "access_expires_at": "2026-10-28T10:19:23.468909426Z",
  "refresh_token": "7JGT-5TC5gGcO_-NkOAk6rU_19NMgEEO5BxsA7nYv4c",
  "refresh_expires_at": "2026-10-28T22:04:23.468382454Z",
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
  "session_id": "248c5261-9eb0-4114-bec9-4e4e80efd1b9",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NjMsImlhdCI6MTc5MzE4MTg2MywianRpIjoiNTc4OTE3OTMtMjdkYS00NWY4LWEwNmMtNDY5MGJkM2ExYmM2Iiwic2lkIjoiMjQ4YzUyNjEtOWViMC00MTE0LWJlYzktNGU0ZTgwZWZkMWI5In0.rfKLMbJESrTyr0ptWqhXHFwHG1dYrD3GqEX0qkoGAyQ",
  "access_expires_at": "2026-10-28T10:19:23.793616891Z",
  "refresh_token": "ZMCXd5b1Wzv3bmopd2Re4_bU9YHS7p2HKR0_TixIImo",
  "refresh_expires_at": "2026-10-28T22:04:23.793064825Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/826987eb-a827-4b6e-bfff-ef8f886f77e6/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
      "author_type": "RIDER",
      "author_id": "bf6cfe36-5b75-4e6a-bac8-290b60d19c06",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T10:04:23.071148Z"
    },
    {
      "order_id": "826987eb-a827-4b6e-bfff-ef8f886f77e6",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "bf6cfe36-5b75-4e6a-bac8-290b60d19c06",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T10:04:23.108765Z"
    }
  ]
}
```

Done: ratings for order 826987eb-a827-4b6e-bfff-ef8f886f77e6.

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
  "session_id": "ac5be97e-ddaa-4b49-bc15-016de9e3ee16",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NjQsImlhdCI6MTc5MzE4MTg2NCwianRpIjoiOTQ5ZDBmNDUtMzM2Mi00ZDQyLTkyMTUtZjg5ODVkODI4NDMxIiwic2lkIjoiYWM1YmU5N2UtZGRhYS00YjQ5LWJjMTUtMDE2ZGU5ZTNlZTE2In0.HbqmA7-jTEzUEhgZI2lN7UrVI2SJaWZi4Vnmyyma3pk",
  "access_expires_at": "2026-10-28T10:19:24.162305821Z",
  "refresh_token": "qlPD5k-8UYeRyXHgizQJ_fM_DN2RJaxr-Dho7HY3HS0",
  "refresh_expires_at": "2026-10-28T22:04:24.161749264Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "0b4b7187-893f-4173-a868-68d4152b13f6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "05574ad3-e445-4ccb-9641-062213c124e5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:04:24.201983Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/05574ad3-e445-4ccb-9641-062213c124e5` → **200**

```json
{
  "id": "05574ad3-e445-4ccb-9641-062213c124e5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:04:24.201983Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/05574ad3-e445-4ccb-9641-062213c124e5` → **200**

```json
{
  "id": "05574ad3-e445-4ccb-9641-062213c124e5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:04:24.201983Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/05574ad3-e445-4ccb-9641-062213c124e5` → **200**

```json
{
  "id": "05574ad3-e445-4ccb-9641-062213c124e5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:04:24.201983Z",
  "ready_at": "2026-10-28T10:04:25.449503Z",
  "expires_at": "2026-10-29T10:04:25.449503Z"
}
```

`GET /api/admin/v1/reports/exports/05574ad3-e445-4ccb-9641-062213c124e5/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "12602346-217b-47ab-9d81-78ca236765ad",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "e1f56815-5be8-43f0-9d91-c02be2419688",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:04:26.346117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e1f56815-5be8-43f0-9d91-c02be2419688` → **200**

```json
{
  "id": "e1f56815-5be8-43f0-9d91-c02be2419688",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:04:26.346117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e1f56815-5be8-43f0-9d91-c02be2419688` → **200**

```json
{
  "id": "e1f56815-5be8-43f0-9d91-c02be2419688",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:04:26.346117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e1f56815-5be8-43f0-9d91-c02be2419688` → **200**

```json
{
  "id": "e1f56815-5be8-43f0-9d91-c02be2419688",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:04:26.346117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e1f56815-5be8-43f0-9d91-c02be2419688` → **200**

```json
{
  "id": "e1f56815-5be8-43f0-9d91-c02be2419688",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:04:26.346117Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e1f56815-5be8-43f0-9d91-c02be2419688` → **200**

```json
{
  "id": "e1f56815-5be8-43f0-9d91-c02be2419688",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:04:26.346117Z",
  "ready_at": "2026-10-28T10:04:30.457539Z",
  "expires_at": "2026-10-29T10:04:30.457539Z"
}
```

`GET /api/admin/v1/reports/exports/e1f56815-5be8-43f0-9d91-c02be2419688/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/a0b50fa2-d0fe-445a-b2e7-10479a78831d` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/a0b50fa2-d0fe-445a-b2e7-10479a78831d",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "eeab78be-78a8-406a-a284-60b77d455c5b"
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
  "device_ref": "sandbox-27964"
}
```

```json
{
  "challenge_id": "fad92393-7275-42bb-b1d4-4563e64f3466",
  "expires_at": "2026-10-28T10:09:30.573319485Z",
  "resend_available_at": "2026-10-28T10:04:31.573319485Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "547822",
  "sent_at": "2026-10-28T10:04:30.576305428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fad92393-7275-42bb-b1d4-4563e64f3466",
  "code": "547822",
  "device_ref": "sandbox-27964"
}
```

```json
{
  "session_id": "147bb5f9-6878-4f4c-9116-364465bd695e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc3MCwiaWF0IjoxNzkzMTgxODcwLCJqdGkiOiJjNjY5Nzk5MC02MzRiLTRiOGUtYWVjYy01MWYyZjhlNjFlZjAiLCJzaWQiOiIxNDdiYjVmOS02ODc4LTRmNGMtOTExNi0zNjQ0NjViZDY5NWUifQ.ddmg1ZZb1VrO4yoAl80Mwk0vt4lTrzm1cWGEctbTaXI",
  "access_expires_at": "2026-10-28T10:19:30.631246168Z",
  "refresh_token": "tCxJzLX6LzIVR1SadAWWek2Fl4c8tqkxm8Q2xJkzYM4",
  "refresh_expires_at": "2026-11-27T10:04:30.63065719Z",
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
  "command_id": "e2d9f69a-9aa7-4e4a-b734-014f3f68bc22",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:30Z",
    "sequence": 1793181870701
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0bc6426e-6177-4f0c-b950-9db72719592d",
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
  "last_heartbeat_at": "2026-10-28T10:04:30.718976Z",
  "last_location_at": "2026-10-28T10:04:30.718976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "0bbeeb5c-7c58-44a1-8ca3-8e381a890d36",
  "points": [
    {
      "sequence": 1793181872753,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:03:32Z"
    },
    {
      "sequence": 1793181872761,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:04:32Z"
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
  "session_id": "18742aef-b2cb-4450-b68b-5a35ea223fb4",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NzMsImlhdCI6MTc5MzE4MTg3MywianRpIjoiMjQ0NjEzN2UtNjJmYS00NDVjLTgxOWEtODI1OTBmOTU2YzU0Iiwic2lkIjoiMTg3NDJhZWYtYjJjYi00NDUwLWI2OGItNWEzNWVhMjIzZmI0In0.r-ULhP1w0FKH0LsvUraunJBhWOP7u5ekCM6ttg3GhJY",
  "access_expires_at": "2026-10-28T10:19:33.128410821Z",
  "refresh_token": "gDzjvmUyS79WGNIU4gqdfdcqubTx3sdEaXNL86vRY5g",
  "refresh_expires_at": "2026-10-28T22:04:33.127800453Z",
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
      "id": "20d037ab-074f-4098-89de-e1ecef1e038f",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:04:32Z",
        "track_point_id": "a5dc25bb-02d4-4cd6-929d-641834cd768c",
        "work_session_id": "0bc6426e-6177-4f0c-b950-9db72719592d"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:04:32Z",
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

`POST /api/admin/v1/driver-risk-flags/20d037ab-074f-4098-89de-e1ecef1e038f/confirm` → **200**

```json
{
  "command_id": "2c905afb-08bb-419b-855c-197d8fde723a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "20d037ab-074f-4098-89de-e1ecef1e038f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:04:32Z",
    "track_point_id": "a5dc25bb-02d4-4cd6-929d-641834cd768c",
    "work_session_id": "0bc6426e-6177-4f0c-b950-9db72719592d"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:04:32Z",
  "reason": null,
  "reviewed_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "reviewed_at": "2026-10-28T10:04:34.279336Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/20d037ab-074f-4098-89de-e1ecef1e038f/dismiss` → **409**

```json
{
  "command_id": "e3c296f4-7971-46f3-9656-0d9c6cd8c7a5",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/20d037ab-074f-4098-89de-e1ecef1e038f/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5409589d-e271-490e-88ed-be0604688b9b"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "3d43907c-581f-489a-ad49-7f5de51f8b3d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "0310558a-b734-4bc7-85bc-0c7940083542",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "raised_at": "2026-10-28T10:04:34.356703Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/0310558a-b734-4bc7-85bc-0c7940083542/dismiss` → **200**

```json
{
  "command_id": "3aa6689b-33f8-47a9-a11f-1d2eeb44d5ab",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "0310558a-b734-4bc7-85bc-0c7940083542",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "raised_at": "2026-10-28T10:04:34.356703Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "reviewed_at": "2026-10-28T10:04:34.395419Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "aea9f4c3-733d-4129-a2d5-0b9ce7c6262b",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "20d037ab-074f-4098-89de-e1ecef1e038f"
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
      "actor_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:04:34.440291Z"
    }
  ]
}
```

Done: flag 20d037ab-074f-4098-89de-e1ecef1e038f confirmed, suspension named it, driver reinstated.

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
  "session_id": "8f24b600-5fa0-4b1a-8066-c31289d44a06",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NzQsImlhdCI6MTc5MzE4MTg3NCwianRpIjoiYjJhODQ3ZjYtYTcxNy00Njg3LWEyYjEtZWU3NDhhNjFjOTMwIiwic2lkIjoiOGYyNGI2MDAtNWZhMC00YjFhLTgwNjYtYzMxMjg5ZDQ0YTA2In0.KtBaDfxjPisNSZVyRVWcUEbxqprCd_8R0pvT66PNgaY",
  "access_expires_at": "2026-10-28T10:19:34.791601955Z",
  "refresh_token": "VWCpITsjQbAjtdFb2PQrtky9b2o2aVtTc_UFtgBdrXQ",
  "refresh_expires_at": "2026-10-28T22:04:34.790991257Z",
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
      "actor_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:04:34.440291Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "ce2dc27d-d2ec-4609-bd45-21dd5bf8e800",
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
  "session_id": "0bc6426e-6177-4f0c-b950-9db72719592d",
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
  "last_heartbeat_at": "2026-10-28T10:04:30.718976Z",
  "last_location_at": "2026-10-28T10:04:30.718976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bc6426e-6177-4f0c-b950-9db72719592d/close` → **200**

```json
{
  "command_id": "0bd5b53b-ae79-472f-a3db-af4e32e438ec",
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
  "session_id": "e953c71c-ab83-4c7f-956f-8e15b8a46751",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NzUsImlhdCI6MTc5MzE4MTg3NSwianRpIjoiOTE4YTM5MjYtYmQ5MC00YzZlLTkwNzYtYmMwOGM5OTI3YjdmIiwic2lkIjoiZTk1M2M3MWMtYWI4My00YzdmLTk1NmYtOGUxNWI4YTQ2NzUxIn0.QmK-5FnPWJeuX81zDraVmP2gQ64kPiDyY3cJisGOnRY",
  "access_expires_at": "2026-10-28T10:19:35.250302946Z",
  "refresh_token": "0FANEHAb-NuQGbT45zKq9y97A6fW3EcYe0jqYzoV_m8",
  "refresh_expires_at": "2026-10-28T22:04:35.249486084Z",
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
  "command_id": "39f98c57-d8d1-4026-a75a-950064804ed1",
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
  "changed_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:04:35.31915Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "39f98c57-d8d1-4026-a75a-950064804ed1",
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
  "changed_by": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:04:35.31915Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48505915755",
  "device_ref": "sandbox-25792"
}
```

```json
{
  "challenge_id": "59fe12ae-92d7-4e01-9ac1-7edb47bce470",
  "expires_at": "2026-10-28T10:09:35.393618386Z",
  "resend_available_at": "2026-10-28T10:04:36.393618386Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48505915755` → **200**

```json
{
  "phone": "+48505915755",
  "audience": "CLIENT",
  "code": "066778",
  "sent_at": "2026-10-28T10:04:35.395888696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59fe12ae-92d7-4e01-9ac1-7edb47bce470",
  "code": "066778",
  "device_ref": "sandbox-25792"
}
```

```json
{
  "session_id": "162f77b8-565c-4f8f-a0a8-ea2d8ea4b312",
  "subject": {
    "type": "CLIENT",
    "id": "d157421d-c6bd-4518-a33c-34b9b3bdcd42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTU3NDIxZC1jNmJkLTQ1MTgtYTMzYy0zNGI5YjNiZGNkNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzc1LCJpYXQiOjE3OTMxODE4NzUsImp0aSI6ImNkZDAyZjIzLWVlZWItNDY5MS05YzE0LTc5NzZlMzk0NTZiOCIsInNpZCI6IjE2MmY3N2I4LTU2NWMtNGY4Zi1hMGE4LWVhMmQ4ZWE0YjMxMiJ9.GeMG5a51eRzlzCoiqsQVBY2wTvSoYd9GYUSTYyKQCv0",
  "access_expires_at": "2026-10-28T10:19:35.451867527Z",
  "refresh_token": "_t5JWrHxsn1Zdc-PYi1-qgfRy3RpFe4CRln_332Qu2Y",
  "refresh_expires_at": "2026-11-27T10:04:35.451331839Z",
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
  "correlation_id": "38a45681-fe7d-4868-b7a2-0ea03435b9c0"
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
  "device_ref": "sandbox-23999"
}
```

```json
{
  "challenge_id": "167891eb-ed62-4faf-9b74-72cfe91d99f9",
  "expires_at": "2026-10-28T10:09:35.533896112Z",
  "resend_available_at": "2026-10-28T10:04:36.533896112Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "382401",
  "sent_at": "2026-10-28T10:04:35.537559809Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "167891eb-ed62-4faf-9b74-72cfe91d99f9",
  "code": "382401",
  "device_ref": "sandbox-23999"
}
```

```json
{
  "session_id": "16d7f723-a257-4c2c-875b-74ee4c8d4040",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc3NSwiaWF0IjoxNzkzMTgxODc1LCJqdGkiOiJkZjRiNjc1Ni04ZWI3LTQ0ZTctODY0NC02NWEwZGUzYmU2ZDMiLCJzaWQiOiIxNmQ3ZjcyMy1hMjU3LTRjMmMtODc1Yi03NGVlNGM4ZDQwNDAifQ.AnW-UYiA4kFkl_hql_vbJioa0hmYkTvVQO6zghyWHDs",
  "access_expires_at": "2026-10-28T10:19:35.590914272Z",
  "refresh_token": "rGz24Evv5sIeD_kEJvtSlHfLDLvnIuqjICGkeO3SJjM",
  "refresh_expires_at": "2026-11-27T10:04:35.590384234Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1abf97c0-f430-475b-a360-800e8be996e2",
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
  "last_heartbeat_at": "2026-10-28T10:04:21.873558Z",
  "last_location_at": "2026-10-28T10:04:21.873558Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1abf97c0-f430-475b-a360-800e8be996e2/handover` → **200**

```json
{
  "command_id": "fde830b6-9c06-4bca-b974-8bde4896bd25",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1abf97c0-f430-475b-a360-800e8be996e2",
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
  "last_heartbeat_at": "2026-10-28T10:04:21.873558Z",
  "last_location_at": "2026-10-28T10:04:21.873558Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1abf97c0-f430-475b-a360-800e8be996e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:35Z",
    "sequence": 1793181875672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "1abf97c0-f430-475b-a360-800e8be996e2",
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
  "last_heartbeat_at": "2026-10-28T10:04:35.690154Z",
  "last_location_at": "2026-10-28T10:04:35.690154Z",
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
  "session_id": "1abf97c0-f430-475b-a360-800e8be996e2",
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
  "last_heartbeat_at": "2026-10-28T10:04:35.690154Z",
  "last_location_at": "2026-10-28T10:04:35.690154Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1abf97c0-f430-475b-a360-800e8be996e2/close` → **200**

```json
{
  "command_id": "00e5431c-eb3c-4ac3-85ea-ef91e964b7a2",
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
  "correlation_id": "ce9705f4-3f07-43da-a30b-591ed66c77ff"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673598970",
  "device_ref": "sandbox-22249"
}
```

```json
{
  "challenge_id": "3734c252-d578-4f90-b90f-be4e640bbb53",
  "expires_at": "2026-10-28T10:09:35.845575953Z",
  "resend_available_at": "2026-10-28T10:04:36.845575953Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673598970` → **200**

```json
{
  "phone": "+380673598970",
  "audience": "CLIENT",
  "code": "365830",
  "sent_at": "2026-10-28T10:04:35.847836384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3734c252-d578-4f90-b90f-be4e640bbb53",
  "code": "365830",
  "device_ref": "sandbox-22249"
}
```

```json
{
  "session_id": "76cd762b-3822-4771-8e8f-c6ce2f385950",
  "subject": {
    "type": "CLIENT",
    "id": "4b522871-445f-4647-878c-4bb7e0a97619"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjUyMjg3MS00NDVmLTQ2NDctODc4Yy00YmI3ZTBhOTc2MTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyNzc1LCJpYXQiOjE3OTMxODE4NzUsImp0aSI6IjcxZTNiNWE5LWUwN2EtNGI5MS1iNTA0LTA4YzVlMmE1YzFjOSIsInNpZCI6Ijc2Y2Q3NjJiLTM4MjItNDc3MS04ZThmLWM2Y2UyZjM4NTk1MCJ9.5D59uEyDoq5NumEZb2bIYDdA4H-0sIsP_TRGeDjFL8s",
  "access_expires_at": "2026-10-28T10:19:35.901359548Z",
  "refresh_token": "Ms2QE1qzMHTU0_RuLXTV57B8GC7zt5lL0uaVTcJ4HGI",
  "refresh_expires_at": "2026-11-27T10:04:35.900722661Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "516d19cc-0394-4de1-b323-cd389517650f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2038fe42-614d-487f-92b3-d95a00516430",
  "upload_path": "/api/rider/v1/uploads/2038fe42-614d-487f-92b3-d95a00516430",
  "expires_at": "2026-10-28T10:19:35.936492889Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/2038fe42-614d-487f-92b3-d95a00516430` → **200**

```json
{
  "file_id": "2038fe42-614d-487f-92b3-d95a00516430",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "81c07e0d-a227-4817-9b44-be020806cfce",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "2038fe42-614d-487f-92b3-d95a00516430"
  ]
}
```

```json
{
  "id": "b6f3210d-0816-44a0-bf38-5135a64d03e3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4b522871-445f-4647-878c-4bb7e0a97619",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:04:36.005085Z",
  "updated_at": "2026-10-28T10:04:36.005085Z",
  "messages": [
    {
      "id": "832d8423-61c7-4506-a00f-a2370f271602",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4b522871-445f-4647-878c-4bb7e0a97619",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:04:36.006702Z",
      "attachments": [
        {
          "file_id": "2038fe42-614d-487f-92b3-d95a00516430",
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
  "session_id": "2b56f7d0-15cb-41ac-9a62-e05fbb4ba4ab",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NzYsImlhdCI6MTc5MzE4MTg3NiwianRpIjoiZmIxZWNlMzUtMDQ1Zi00ODE1LTkxYTItYzExM2FlY2YyMjNjIiwic2lkIjoiMmI1NmY3ZDAtMTVjYi00MWFjLTlhNjItZTA1ZmJiNGJhNGFiIn0.Tfv2aPv4uQJLxybReBCAGTWUY0J3HAexFsTZkF9_se4",
  "access_expires_at": "2026-10-28T10:19:36.348577896Z",
  "refresh_token": "tLuHqCRoiT7RiNf1-cJMSw1Pist805TKoEBapzXcD4M",
  "refresh_expires_at": "2026-10-28T22:04:36.347976654Z",
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
  "session_id": "425dbdf3-e64a-4281-b1ad-7a12fe12cc1f",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NzYsImlhdCI6MTc5MzE4MTg3NiwianRpIjoiOTUxOTUwYTItYWM2Ni00YTU0LTgzMzEtZmEyODUwNjUwZDc0Iiwic2lkIjoiNDI1ZGJkZjMtZTY0YS00MjgxLWIxYWQtN2ExMmZlMTJjYzFmIn0.nIxX0VgeKV6TwuVR0a27lIqeYkV53cZ1ffe5uucaMKg",
  "access_expires_at": "2026-10-28T10:19:36.668463802Z",
  "refresh_token": "vEhEX-Ha0cxLTQx-EylCnunLqOyJZJOln1BAxJAx35o",
  "refresh_expires_at": "2026-10-28T22:04:36.667901394Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/b6f3210d-0816-44a0-bf38-5135a64d03e3/attachments/2038fe42-614d-487f-92b3-d95a00516430` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ba2ca5eb-8f9c-4698-8b89-f32e6b14bd70",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "376a23cb-3b19-4325-8f25-ced3d204fcf3",
  "upload_path": "/api/operator/v1/uploads/376a23cb-3b19-4325-8f25-ced3d204fcf3",
  "expires_at": "2026-10-28T10:19:36.715256279Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/376a23cb-3b19-4325-8f25-ced3d204fcf3` → **200**

```json
{
  "file_id": "376a23cb-3b19-4325-8f25-ced3d204fcf3",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/b6f3210d-0816-44a0-bf38-5135a64d03e3` → **200**

```json
{
  "id": "b6f3210d-0816-44a0-bf38-5135a64d03e3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4b522871-445f-4647-878c-4bb7e0a97619",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:04:36.005085Z",
  "updated_at": "2026-10-28T10:04:36.005085Z",
  "messages": [
    {
      "id": "832d8423-61c7-4506-a00f-a2370f271602",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4b522871-445f-4647-878c-4bb7e0a97619",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:04:36.006702Z",
      "attachments": [
        {
          "file_id": "2038fe42-614d-487f-92b3-d95a00516430",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/b6f3210d-0816-44a0-bf38-5135a64d03e3/comments` → **200**

```json
{
  "command_id": "8ee1c725-bb30-4246-b2a7-2c973a273560",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "376a23cb-3b19-4325-8f25-ced3d204fcf3"
  ]
}
```

```json
{
  "id": "b6f3210d-0816-44a0-bf38-5135a64d03e3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4b522871-445f-4647-878c-4bb7e0a97619",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:04:36.005085Z",
  "updated_at": "2026-10-28T10:04:36.81478Z",
  "messages": [
    {
      "id": "832d8423-61c7-4506-a00f-a2370f271602",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4b522871-445f-4647-878c-4bb7e0a97619",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:04:36.006702Z",
      "attachments": [
        {
          "file_id": "2038fe42-614d-487f-92b3-d95a00516430",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b34f8db7-cb26-4f70-bc39-21ccaed3477d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:04:36.814421Z",
      "attachments": [
        {
          "file_id": "376a23cb-3b19-4325-8f25-ced3d204fcf3",
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

`GET /api/rider/v1/support/cases/b6f3210d-0816-44a0-bf38-5135a64d03e3` → **200**

```json
{
  "id": "b6f3210d-0816-44a0-bf38-5135a64d03e3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "4b522871-445f-4647-878c-4bb7e0a97619",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:04:36.005085Z",
  "updated_at": "2026-10-28T10:04:36.81478Z",
  "messages": [
    {
      "id": "832d8423-61c7-4506-a00f-a2370f271602",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "4b522871-445f-4647-878c-4bb7e0a97619",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:04:36.006702Z",
      "attachments": [
        {
          "file_id": "2038fe42-614d-487f-92b3-d95a00516430",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b34f8db7-cb26-4f70-bc39-21ccaed3477d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:04:36.814421Z",
      "attachments": [
        {
          "file_id": "376a23cb-3b19-4325-8f25-ced3d204fcf3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/b6f3210d-0816-44a0-bf38-5135a64d03e3/attachments/376a23cb-3b19-4325-8f25-ced3d204fcf3` → **200**

Done: support case b6f3210d-0816-44a0-bf38-5135a64d03e3, rider attachment 2038fe42-614d-487f-92b3-d95a00516430, operator attachment 376a23cb-3b19-4325-8f25-ced3d204fcf3.

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
  "session_id": "c430ecb8-31cc-4f4a-a267-7542d048315f",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NzcsImlhdCI6MTc5MzE4MTg3NywianRpIjoiYjZhYmFjNGMtNzAxNC00NzJlLTk1MWQtNTgzN2M5MzUwNDkxIiwic2lkIjoiYzQzMGVjYjgtMzFjYy00ZjRhLWEyNjctNzU0MmQwNDgzMTVmIn0.vIZUspjrO3U8y6DDRyib-w0WstQj2hN79chLJugSqPc",
  "access_expires_at": "2026-10-28T10:19:37.206400507Z",
  "refresh_token": "sn9pgVSiiB9jOj9DqW8T1ZoflhLYM5-5EpzCsU0AZFY",
  "refresh_expires_at": "2026-10-28T22:04:37.205817571Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14052"
}
```

```json
{
  "challenge_id": "aef79564-b491-4423-93f9-bedc6ee29d6e",
  "expires_at": "2026-10-28T10:09:37.2342719Z",
  "resend_available_at": "2026-10-28T10:04:38.2342719Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "032269",
  "sent_at": "2026-10-28T10:04:37.236577354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aef79564-b491-4423-93f9-bedc6ee29d6e",
  "code": "032269",
  "device_ref": "sandbox-14052"
}
```

```json
{
  "session_id": "0f895fe0-ce21-47a2-9464-5d04047e9ce1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc3NywiaWF0IjoxNzkzMTgxODc3LCJqdGkiOiI2OWVhM2ViYy1mZmIwLTQwMGMtOGYwNi1hZTYwMDkzMjM5MTkiLCJzaWQiOiIwZjg5NWZlMC1jZTIxLTQ3YTItOTQ2NC01ZDA0MDQ3ZTljZTEifQ.Qk_WTXTQsZzTfSMEr7F7e_W8tPel56TFOVu8zeolY8E",
  "access_expires_at": "2026-10-28T10:19:37.29358413Z",
  "refresh_token": "FTH82pobe-7fAV1_mXLDGH_g9p5FPOzsaGK6DWLrloE",
  "refresh_expires_at": "2026-11-27T10:04:37.29303141Z",
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
      "actor_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:04:34.440291Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:04:34.856931Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "913932dc-3fc7-4388-a257-4e96ede36c1d",
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
  "device_ref": "sandbox-27572"
}
```

```json
{
  "challenge_id": "6aca420f-bbf8-470a-8d9c-017d833b86d6",
  "expires_at": "2026-10-28T10:09:37.405765678Z",
  "resend_available_at": "2026-10-28T10:04:38.405765678Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "886392",
  "sent_at": "2026-10-28T10:04:37.407832199Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6aca420f-bbf8-470a-8d9c-017d833b86d6",
  "code": "886392",
  "device_ref": "sandbox-27572"
}
```

```json
{
  "session_id": "bcca22f7-f5ff-40a0-b2c5-0e365d7f20ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mjc3NywiaWF0IjoxNzkzMTgxODc3LCJqdGkiOiJhZDI2MTc4YS04YjFmLTQ1NTAtYjE5Zi0wMWUwNzVjNTZiNWQiLCJzaWQiOiJiY2NhMjJmNy1mNWZmLTQwYTAtYjJjNS0wZTM2NWQ3ZjIwY2EifQ.u5FvZhpangofKZbWwQudrnGIJiSdf0Cya6JjK1R_rDY",
  "access_expires_at": "2026-10-28T10:19:37.462217653Z",
  "refresh_token": "vWS2xgdV4IvYc89SAAt7T3dGphv5cqPE09qcr8vkIPM",
  "refresh_expires_at": "2026-11-27T10:04:37.46167398Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ee2b133-6bb6-4637-9cef-ffdab0f1b69e",
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
  "last_heartbeat_at": "2026-10-28T10:04:22.990776Z",
  "last_location_at": "2026-10-28T10:04:22.990776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ee2b133-6bb6-4637-9cef-ffdab0f1b69e/handover` → **200**

```json
{
  "command_id": "2c6f9217-22de-4f89-aa06-ce10f637896d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ee2b133-6bb6-4637-9cef-ffdab0f1b69e",
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
  "last_heartbeat_at": "2026-10-28T10:04:22.990776Z",
  "last_location_at": "2026-10-28T10:04:22.990776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ee2b133-6bb6-4637-9cef-ffdab0f1b69e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:37Z",
    "sequence": 1793181877543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1ee2b133-6bb6-4637-9cef-ffdab0f1b69e",
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
  "last_heartbeat_at": "2026-10-28T10:04:37.560293Z",
  "last_location_at": "2026-10-28T10:04:37.560293Z",
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
  "command_id": "0c62cc55-e2c6-465b-8f77-5fd1887e24d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:37Z",
    "sequence": 1793181877607
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9275e911-a1ba-43bf-8bbf-b33aa02f18d9",
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
  "last_heartbeat_at": "2026-10-28T10:04:37.624275Z",
  "last_location_at": "2026-10-28T10:04:37.624275Z",
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
  "session_id": "b2633665-885f-4680-82ff-8a9c5dd2249a",
  "subject": {
    "type": "STAFF",
    "id": "6152c8d7-f6a0-4ea0-859e-07f58c2684f8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTUyYzhkNy1mNmEwLTRlYTAtODU5ZS0wN2Y1OGMyNjg0ZjgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODI3NzcsImlhdCI6MTc5MzE4MTg3NywianRpIjoiYTlmYzkwZDUtZDA0OS00ZjhiLTg4YzAtMTRhYTk2MTgzZjc0Iiwic2lkIjoiYjI2MzM2NjUtODg1Zi00NjgwLTgyZmYtOGE5YzVkZDIyNDlhIn0.hU5JwPMTZygt_m9vCVN7iM4SeL7MIGHkBymnSqYOqp8",
  "access_expires_at": "2026-10-28T10:19:37.949501791Z",
  "refresh_token": "jk8-ILjvBhDAG400O36Lnlg-HXVdeeEgPpkNpRnn-cQ",
  "refresh_expires_at": "2026-10-28T22:04:37.948897876Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2ddc636f-4e54-4fe4-8611-98a048e2ab18",
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
  "id": "790cfc36-57b4-489f-b476-e571e1f96178",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:09:37.980371Z",
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
  "command_id": "9f26e817-86a3-4a04-a793-c1fdfda250c1",
  "quote_id": "790cfc36-57b4-489f-b476-e571e1f96178",
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
  "id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
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
  "created_at": "2026-10-28T10:04:38.016881Z",
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
    "id": "267d3286-c193-4f32-96ce-aefafc9360bb",
    "order_id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
    "expires_at": "2026-10-28T10:04:53.020576Z",
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

`POST /api/driver/v1/offers/267d3286-c193-4f32-96ce-aefafc9360bb/accept` → **200**

```json
{
  "command_id": "4cd5bd73-66fb-4a13-b4d7-f1d2d50f3e5a"
}
```

```json
{
  "id": "987996c6-16f9-4ecf-b9c6-e2e25e86c613",
  "order_id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c0cae08b-5b4b-4b54-9399-3d0bf08c6adf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c0cae08b-5b4b-4b54-9399-3d0bf08c6adf",
  "order_id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
  "assignment_id": "987996c6-16f9-4ecf-b9c6-e2e25e86c613",
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

`POST /api/driver/v1/work-sessions/9275e911-a1ba-43bf-8bbf-b33aa02f18d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:04:38Z",
    "sequence": 1793181878154
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9275e911-a1ba-43bf-8bbf-b33aa02f18d9",
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
  "last_heartbeat_at": "2026-10-28T10:04:38.172412Z",
  "last_location_at": "2026-10-28T10:04:38.172412Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c0cae08b-5b4b-4b54-9399-3d0bf08c6adf/arrive` → **200**

```json
{
  "command_id": "69f0ff66-c79f-47af-8ccc-ecdbcb801f0f",
  "expected_version": 0
}
```

```json
{
  "id": "c0cae08b-5b4b-4b54-9399-3d0bf08c6adf",
  "order_id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
  "assignment_id": "987996c6-16f9-4ecf-b9c6-e2e25e86c613",
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
  "arrived_at": "2026-10-28T10:04:38.207122Z",
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

`POST /api/driver/v1/trips/c0cae08b-5b4b-4b54-9399-3d0bf08c6adf/start` → **200**

```json
{
  "command_id": "4a881e9b-daa3-4663-a0b8-bfdd1d2d5ebe",
  "expected_version": 1
}
```

```json
{
  "id": "c0cae08b-5b4b-4b54-9399-3d0bf08c6adf",
  "order_id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
  "assignment_id": "987996c6-16f9-4ecf-b9c6-e2e25e86c613",
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
  "arrived_at": "2026-10-28T10:04:38.207122Z",
  "started_at": "2026-10-28T10:04:38.245365Z",
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

`POST /api/driver/v1/trips/c0cae08b-5b4b-4b54-9399-3d0bf08c6adf/complete` → **200**

```json
{
  "command_id": "8054e5c5-1e9a-4c6f-b48e-eaa900d3e50f",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:04:38Z",
  "cash_received": true
}
```

```json
{
  "id": "c0cae08b-5b4b-4b54-9399-3d0bf08c6adf",
  "order_id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
  "assignment_id": "987996c6-16f9-4ecf-b9c6-e2e25e86c613",
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
  "arrived_at": "2026-10-28T10:04:38.207122Z",
  "started_at": "2026-10-28T10:04:38.245365Z",
  "completed_at": "2026-10-28T10:04:38.287633Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc` → **200**

```json
{
  "id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
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
    "id": "987996c6-16f9-4ecf-b9c6-e2e25e86c613",
    "order_id": "3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c0cae08b-5b4b-4b54-9399-3d0bf08c6adf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:04:38.016881Z",
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
  "session_id": "1ee2b133-6bb6-4637-9cef-ffdab0f1b69e",
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
  "last_heartbeat_at": "2026-10-28T10:04:37.560293Z",
  "last_location_at": "2026-10-28T10:04:37.560293Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ee2b133-6bb6-4637-9cef-ffdab0f1b69e/close` → **200**

```json
{
  "command_id": "eed78cca-0adb-4fae-889a-955a72cc6f34",
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
  "session_id": "9275e911-a1ba-43bf-8bbf-b33aa02f18d9",
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
  "last_heartbeat_at": "2026-10-28T10:04:38.172412Z",
  "last_location_at": "2026-10-28T10:04:38.172412Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9275e911-a1ba-43bf-8bbf-b33aa02f18d9/close` → **200**

```json
{
  "command_id": "32411b3f-033b-40ef-8436-6d1c83ca287c",
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

Done: terminal order 3fc8e3e8-fea1-4a69-90ae-ea0d56861ccc by Andrii (5a000000-0000-4000-8000-000000000403).
