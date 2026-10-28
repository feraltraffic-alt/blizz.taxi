# Sandbox transcript (2026-10-28T10:36:43Z, 36b89b4)

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
  "correlation_id": "d85fb702-eb72-46a7-9e41-eacb3889f483"
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
  "session_id": "0e611c5c-fb1a-4453-9c8f-6b01243bc71b",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3MTEsImlhdCI6MTc5MzE4MzgxMSwianRpIjoiOTg1ZTBjZjItNGY1OC00MTM5LThiNjItZWJlMjk5NDlhNGI1Iiwic2lkIjoiMGU2MTFjNWMtZmIxYS00NDUzLTljOGYtNmIwMTI0M2JjNzFiIn0.73hDpTFJ95-vK9IjZrI029Pv5KqtfNfPjz3NdA3F_lU",
  "access_expires_at": "2026-10-28T10:51:51.314840561Z",
  "refresh_token": "N1vchLxMHGpcX5qVgnTN-6U8bY1kYbfSAyc_o6sYd5A",
  "refresh_expires_at": "2026-10-28T22:36:51.312536856Z",
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
  "session_id": "5a2ab45f-236c-4d20-8d7e-864d7c9ba078",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3MTIsImlhdCI6MTc5MzE4MzgxMiwianRpIjoiOTZhYWUxN2MtZjU2OC00ZWZkLWJlNDgtMGI2NTkyYzdlOGVjIiwic2lkIjoiNWEyYWI0NWYtMjM2Yy00ZDIwLThkN2UtODY0ZDdjOWJhMDc4In0.1mcRhbgE4s36K9wyUuzvMCTpD-IV7NADPBZpOrOCxGM",
  "access_expires_at": "2026-10-28T10:51:52.865487936Z",
  "refresh_token": "DieMoDRTQMuT0CMM_Pt7nahd0FTNkjwTd_RmaoBaOGU",
  "refresh_expires_at": "2026-10-28T22:36:52.864392744Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "ec2af8d6-3df2-46c9-991a-a57ef7760fdf",
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
  "id": "6ea24d95-462c-41f7-930c-f245ce4b091a",
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
  "created_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "created_at": "2026-10-28T10:36:53.155805Z",
  "updated_at": "2026-10-28T10:36:53.155805Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632723091",
  "device_ref": "sandbox-22169"
}
```

```json
{
  "challenge_id": "defd2473-2fe5-4b1a-a3a6-f70203f43d43",
  "expires_at": "2026-10-28T10:41:53.431695325Z",
  "resend_available_at": "2026-10-28T10:36:54.431695325Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632723091` → **200**

```json
{
  "phone": "+380632723091",
  "audience": "CLIENT",
  "code": "377362",
  "sent_at": "2026-10-28T10:36:53.4392471Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "defd2473-2fe5-4b1a-a3a6-f70203f43d43",
  "code": "377362",
  "device_ref": "sandbox-22169"
}
```

```json
{
  "session_id": "ed9b03ca-e4d0-4a21-8ba7-cc8a852a74f6",
  "subject": {
    "type": "CLIENT",
    "id": "a79ae09b-fa07-4b18-883b-8f2213d2c7bb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzlhZTA5Yi1mYTA3LTRiMTgtODgzYi04ZjIyMTNkMmM3YmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NzEzLCJpYXQiOjE3OTMxODM4MTMsImp0aSI6IjhiNWMzNjRhLTlkYTEtNDMzZS04ZWJjLTJmZTk0MTE0YjY5ZiIsInNpZCI6ImVkOWIwM2NhLWU0ZDAtNGEyMS04YmE3LWNjOGE4NTJhNzRmNiJ9.sddhV4Ey5Vs4ZPVAohsMUFd_86r0VSvptk4vbyJjbkU",
  "access_expires_at": "2026-10-28T10:51:53.745061454Z",
  "refresh_token": "TGUQMLbfOD-o9ULxWGueEewPRlWjGBwlgwOp4P7K7hY",
  "refresh_expires_at": "2026-11-27T10:36:53.743935974Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632723091` → **200**

```json
{
  "client_id": "a79ae09b-fa07-4b18-883b-8f2213d2c7bb"
}
```

`POST /api/admin/v1/rider-wallets/a79ae09b-fa07-4b18-883b-8f2213d2c7bb/top-ups` → **201**

```json
{
  "command_id": "b702b0f4-d446-4bc2-afb8-8eb7143e90da",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "a79ae09b-fa07-4b18-883b-8f2213d2c7bb",
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
      "id": "b267848b-863f-4c9f-98c2-7519dd908586",
      "at": "2026-10-28T10:36:54.272131Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d1f3146-564e-432e-aee8-2c0e0861b81e",
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
  "id": "27f5c34b-9137-4b90-904c-b96d8879863e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:41:54.731763Z",
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
      "id": "6ea24d95-462c-41f7-930c-f245ce4b091a",
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
  "device_ref": "sandbox-9191"
}
```

```json
{
  "challenge_id": "0f13badf-58f2-4c14-92dd-26a76be5859f",
  "expires_at": "2026-10-28T10:41:55.032190652Z",
  "resend_available_at": "2026-10-28T10:36:56.032190652Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "964186",
  "sent_at": "2026-10-28T10:36:55.03631163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f13badf-58f2-4c14-92dd-26a76be5859f",
  "code": "964186",
  "device_ref": "sandbox-9191"
}
```

```json
{
  "session_id": "cb6bde22-921d-476a-872b-f836b2de71fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDcxNSwiaWF0IjoxNzkzMTgzODE1LCJqdGkiOiI0ODU5ODBmMy0zYmRkLTRkZWMtYTJiMy01NTQ5YzI3YTcyNTUiLCJzaWQiOiJjYjZiZGUyMi05MjFkLTQ3NmEtODcyYi1mODM2YjJkZTcxZmIifQ.tG1Upp8K7GduQH8m6uWj7_vkcsK-Gr_01JRX30BcS9U",
  "access_expires_at": "2026-10-28T10:51:55.321238339Z",
  "refresh_token": "RMKEbnDf28IlF_QDAYAIuJcJyX19lxfqe1SYpoQAKpg",
  "refresh_expires_at": "2026-11-27T10:36:55.320025342Z",
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
  "command_id": "9ae198b5-aa43-432c-9093-f88458f73318",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:36:55Z",
    "sequence": 1793183815838
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "970728c7-0f1c-45fa-a654-e8679f04a6fc",
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
  "last_heartbeat_at": "2026-10-28T10:36:55.881465Z",
  "last_location_at": "2026-10-28T10:36:55.881465Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "628a5251-d107-428e-8304-46f9fb27687f",
  "quote_id": "27f5c34b-9137-4b90-904c-b96d8879863e",
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
  "id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a79ae09b-fa07-4b18-883b-8f2213d2c7bb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:36:56.210087Z",
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
  "client_id": "a79ae09b-fa07-4b18-883b-8f2213d2c7bb",
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
      "id": "b267848b-863f-4c9f-98c2-7519dd908586",
      "at": "2026-10-28T10:36:54.272131Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "03937974-b9ba-4260-8728-08e067d4e567",
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
    "id": "4cfa6195-4f8c-486a-b20c-2c5351e715d7",
    "order_id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc",
    "expires_at": "2026-10-28T10:37:11.223479Z",
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

`POST /api/driver/v1/offers/4cfa6195-4f8c-486a-b20c-2c5351e715d7/accept` → **200**

```json
{
  "command_id": "c42d35e9-e019-45a8-a856-1911facda325"
}
```

```json
{
  "id": "1daa3791-9266-4474-a64a-6c62c8807f27",
  "order_id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "87d43911-d927-451e-8fff-7fd78b1efa61",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "87d43911-d927-451e-8fff-7fd78b1efa61",
  "order_id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc",
  "assignment_id": "1daa3791-9266-4474-a64a-6c62c8807f27",
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

`POST /api/driver/v1/work-sessions/970728c7-0f1c-45fa-a654-e8679f04a6fc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:36:57Z",
    "sequence": 1793183817556
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "970728c7-0f1c-45fa-a654-e8679f04a6fc",
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
  "last_heartbeat_at": "2026-10-28T10:36:57.581942Z",
  "last_location_at": "2026-10-28T10:36:57.581942Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/87d43911-d927-451e-8fff-7fd78b1efa61/arrive` → **200**

```json
{
  "command_id": "332b8277-d44a-4188-ae7a-1217292b27c4",
  "expected_version": 0
}
```

```json
{
  "id": "87d43911-d927-451e-8fff-7fd78b1efa61",
  "order_id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc",
  "assignment_id": "1daa3791-9266-4474-a64a-6c62c8807f27",
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
  "arrived_at": "2026-10-28T10:36:57.850767Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/87d43911-d927-451e-8fff-7fd78b1efa61/start` → **200**

```json
{
  "command_id": "f7f3dcec-1c2f-4196-acfd-3ca2fb04a35c",
  "expected_version": 1
}
```

```json
{
  "id": "87d43911-d927-451e-8fff-7fd78b1efa61",
  "order_id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc",
  "assignment_id": "1daa3791-9266-4474-a64a-6c62c8807f27",
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
  "arrived_at": "2026-10-28T10:36:57.850767Z",
  "started_at": "2026-10-28T10:36:58.127997Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/87d43911-d927-451e-8fff-7fd78b1efa61/complete` → **200**

```json
{
  "command_id": "4eaa2ed0-8c8b-4370-bc7a-9633210e6fc8",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:36:58Z",
  "cash_received": true
}
```

```json
{
  "id": "87d43911-d927-451e-8fff-7fd78b1efa61",
  "order_id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc",
  "assignment_id": "1daa3791-9266-4474-a64a-6c62c8807f27",
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
  "arrived_at": "2026-10-28T10:36:57.850767Z",
  "started_at": "2026-10-28T10:36:58.127997Z",
  "completed_at": "2026-10-28T10:36:58.430033Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a79ae09b-fa07-4b18-883b-8f2213d2c7bb",
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
      "id": "e85d6ec0-4aa1-4038-8765-f88a3be0e50a",
      "at": "2026-10-28T10:36:59.027263Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc"
    },
    {
      "id": "b267848b-863f-4c9f-98c2-7519dd908586",
      "at": "2026-10-28T10:36:54.272131Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/6ea24d95-462c-41f7-930c-f245ce4b091a/archive` → **200**

```json
{
  "command_id": "c035ad5b-8309-435e-91e9-6eccf4c39f79",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "6ea24d95-462c-41f7-930c-f245ce4b091a",
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
  "created_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "created_at": "2026-10-28T10:36:53.155805Z",
  "updated_at": "2026-10-28T10:37:01.98996Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "970728c7-0f1c-45fa-a654-e8679f04a6fc",
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
  "last_heartbeat_at": "2026-10-28T10:36:57.581942Z",
  "last_location_at": "2026-10-28T10:36:57.581942Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/970728c7-0f1c-45fa-a654-e8679f04a6fc/close` → **200**

```json
{
  "command_id": "15b2bd00-d4c5-4ea7-a33c-aa29d26c7a29",
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

Done: order 68ecfcb3-cd7c-44dc-bb8d-7182e08503dc.

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
  "session_id": "84d5155a-4e34-40a2-a562-0367ea66c33e",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3MjMsImlhdCI6MTc5MzE4MzgyMywianRpIjoiZThlZTdiNjYtN2UwNC00NTQzLWJlMGEtNzUyM2I0N2I4ZDQ1Iiwic2lkIjoiODRkNTE1NWEtNGUzNC00MGEyLWE1NjItMDM2N2VhNjZjMzNlIn0.mijN-ftchGBvwQEWBcL1R_CPEn3JTEDJblTq-jjqSf4",
  "access_expires_at": "2026-10-28T10:52:03.087812621Z",
  "refresh_token": "xQXxdrHQ-5DKGaZfHoJWUOhA8GTmUx4Q7Am0MSuci2A",
  "refresh_expires_at": "2026-10-28T22:37:03.086975204Z",
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
  "command_id": "90f0dd1b-5705-4e3c-be30-f49736cd2417",
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
  "session_id": "55ba4ad7-1591-40bd-8d0d-353862c9becf",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3MjQsImlhdCI6MTc5MzE4MzgyNCwianRpIjoiMTg4ZDhmZTEtYTNmNS00Nzc2LTlmYTYtOTMxNjI0M2ExYjM5Iiwic2lkIjoiNTViYTRhZDctMTU5MS00MGJkLThkMGQtMzUzODYyYzliZWNmIn0.YqI3xUhflqnh5kKrIXMotl_jq1YWO7mxE7UiY-Bvk1A",
  "access_expires_at": "2026-10-28T10:52:04.188689868Z",
  "refresh_token": "_Tg2abmmjA4l2mV3GR6_Th-5MCarRi0RhHOS2dp2v9Q",
  "refresh_expires_at": "2026-10-28T22:37:04.187847324Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.6428164",
    "linkedid": "1730052700.6428164",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678474385"
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
    "id": "1730052700.6428164",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "c8e2a9aa-fb67-4710-9544-44557cdd8dc3",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678474385",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:37:04.466295Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:37:04.492312Z",
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
    "id": "1730052600.1116020642",
    "linkedid": "1730052600.1116020642",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678474385"
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
      "id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678474385",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:37:04.801742Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/bcf7a79c-3652-4632-b395-632efc5c6e8e/answer` → **200**

```json
{
  "command_id": "35e6df8b-0574-401c-8595-8181d2f6e88b"
}
```

```json
{
  "id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678474385",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "order_ids": [],
  "started_at": "2026-10-28T10:37:04.801742Z",
  "answered_at": "2026-10-28T10:37:05.103731Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1116020642",
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
    "id": "1730052600.1116020642",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678474385",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [],
      "started_at": "2026-10-28T10:37:04.801742Z",
      "answered_at": "2026-10-28T10:37:05.103731Z",
      "ended_at": "2026-10-28T10:37:05.387273Z",
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
      "id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678474385",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [],
      "started_at": "2026-10-28T10:37:04.801742Z",
      "answered_at": "2026-10-28T10:37:05.103731Z",
      "ended_at": "2026-10-28T10:37:05.387273Z",
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
      "id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678474385",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [],
      "started_at": "2026-10-28T10:37:04.801742Z",
      "answered_at": "2026-10-28T10:37:05.103731Z",
      "ended_at": "2026-10-28T10:37:05.387273Z",
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
      "id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678474385",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [],
      "started_at": "2026-10-28T10:37:04.801742Z",
      "answered_at": "2026-10-28T10:37:05.103731Z",
      "ended_at": "2026-10-28T10:37:05.387273Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:37:11.851761Z"
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
      "id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678474385",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [],
      "started_at": "2026-10-28T10:37:04.801742Z",
      "answered_at": "2026-10-28T10:37:05.103731Z",
      "ended_at": "2026-10-28T10:37:05.387273Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:37:11.851761Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/bcf7a79c-3652-4632-b395-632efc5c6e8e/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/bcf7a79c-3652-4632-b395-632efc5c6e8e/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=bcf7a79c-3652-4632-b395-632efc5c6e8e` → **200**

```json
{
  "changes": [
    {
      "id": "7b49337d-5404-4f58-a943-f88d22e09809",
      "occurred_at": "2026-10-28T10:37:12.766308Z",
      "actor_type": "STAFF",
      "actor_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8a586edb-f8a4-47ed-81ce-557956c84d1f\", \"order_ids\": []}",
      "correlation_id": "e51cb758-e68a-4bb1-8605-3f59f49ae538"
    },
    {
      "id": "bb1620db-6e2c-4620-a73a-2593b943a2e5",
      "occurred_at": "2026-10-28T10:37:12.733631Z",
      "actor_type": "STAFF",
      "actor_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8a586edb-f8a4-47ed-81ce-557956c84d1f\", \"order_ids\": []}",
      "correlation_id": "59aeb92f-78e3-47b9-9d4c-38bed720a717"
    }
  ]
}
```

Done: call bcf7a79c-3652-4632-b395-632efc5c6e8e recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632574967",
  "device_ref": "sandbox-23844"
}
```

```json
{
  "challenge_id": "60c6503d-735c-49e6-9fb6-f7fad191a237",
  "expires_at": "2026-10-28T10:42:13.067427648Z",
  "resend_available_at": "2026-10-28T10:37:14.067427648Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632574967` → **200**

```json
{
  "phone": "+380632574967",
  "audience": "CLIENT",
  "code": "163464",
  "sent_at": "2026-10-28T10:37:13.0709617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60c6503d-735c-49e6-9fb6-f7fad191a237",
  "code": "163464",
  "device_ref": "sandbox-23844"
}
```

```json
{
  "session_id": "928714cd-a3ce-41b4-8b5c-4faed6cda084",
  "subject": {
    "type": "CLIENT",
    "id": "cf958e92-8372-4d15-a176-71671c745ea1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjk1OGU5Mi04MzcyLTRkMTUtYTE3Ni03MTY3MWM3NDVlYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NzMzLCJpYXQiOjE3OTMxODM4MzMsImp0aSI6ImNkZGQ0ZTM1LWJmYWItNGE0Ni1hMzNlLWJlYmQwMmExZjZmZCIsInNpZCI6IjkyODcxNGNkLWEzY2UtNDFiNC04YjVjLTRmYWVkNmNkYTA4NCJ9.zb-kM8yelVxax1rZhuj7RoM8jnMP3u7MQlNYDlKU4WU",
  "access_expires_at": "2026-10-28T10:52:13.341678827Z",
  "refresh_token": "Jrhr5ddHuXq0N7jPC9DrujYTQMaU6iWBXijErM3_e8c",
  "refresh_expires_at": "2026-11-27T10:37:13.340960205Z",
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
  "device_ref": "sandbox-23526"
}
```

```json
{
  "challenge_id": "e5052c63-2ca6-4817-b4d7-709f66cc71c2",
  "expires_at": "2026-10-28T10:42:13.842353763Z",
  "resend_available_at": "2026-10-28T10:37:14.842353763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "780727",
  "sent_at": "2026-10-28T10:37:13.845456833Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5052c63-2ca6-4817-b4d7-709f66cc71c2",
  "code": "780727",
  "device_ref": "sandbox-23526"
}
```

```json
{
  "session_id": "217cb89b-ac80-4f07-bd48-eeccf8cd40a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDczNCwiaWF0IjoxNzkzMTgzODM0LCJqdGkiOiIzOGViMzcxOC02MDVlLTRiNTUtOTNjMC05YjE4Yjg4MGEzNjciLCJzaWQiOiIyMTdjYjg5Yi1hYzgwLTRmMDctYmQ0OC1lZWNjZjhjZDQwYTgifQ.bNJAZBaYzxY1ZKFs69GuWpzIlm0QljfhpW9GgEreXVw",
  "access_expires_at": "2026-10-28T10:52:14.124084468Z",
  "refresh_token": "ON5CnKzXQMsM1igyQuDJwQyjxRALoMWnX4-PIjewhFE",
  "refresh_expires_at": "2026-11-27T10:37:14.123434584Z",
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
  "session_id": "9720f744-095a-493b-9a9f-3dc285eaa4a3",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3MzQsImlhdCI6MTc5MzE4MzgzNCwianRpIjoiNmJiN2E3NDUtYzFjYS00OTM1LWJmOWUtNWRhYzI3M2Q5MTE0Iiwic2lkIjoiOTcyMGY3NDQtMDk1YS00OTNiLTlhOWYtM2RjMjg1ZWFhNGEzIn0.HyovRgprMw0Abafpjr1_FPSPo02_awtgrXpjp_x1g0Y",
  "access_expires_at": "2026-10-28T10:52:14.914239938Z",
  "refresh_token": "F5acrabhYE1VZBt9CJtbpomPJz-EM9tylYraQ_1sajM",
  "refresh_expires_at": "2026-10-28T22:37:14.913589492Z",
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
  "session_id": "c14ea4f0-5dab-4b12-927d-ed33b9478c3b",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3MzUsImlhdCI6MTc5MzE4MzgzNSwianRpIjoiZTBkMDQ5MWUtNTE5MS00Y2E2LWFiMmYtYmY4NTc2NzA1MjA4Iiwic2lkIjoiYzE0ZWE0ZjAtNWRhYi00YjEyLTkyN2QtZWQzM2I5NDc4YzNiIn0.yw8HDKmz_M1-ztm-CvAL0qXqdjAtG3tlOV6Zm14JIJs",
  "access_expires_at": "2026-10-28T10:52:15.461606337Z",
  "refresh_token": "0bEIXZH2p-yk354TTFWa-usP_QuHq43gZftTSh2Oyjg",
  "refresh_expires_at": "2026-10-28T22:37:15.460909948Z",
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
  "command_id": "4ac1f621-63b2-4d7d-bf6f-d55c86af8024",
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
  "id": "5c38b240-b81d-4fb9-9957-1705566de380",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:42:15.991105Z",
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
  "command_id": "b29eff08-d3fc-4225-b925-ff690b572f29",
  "quote_id": "5c38b240-b81d-4fb9-9957-1705566de380",
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
  "id": "7328b461-d918-460b-9bdd-788ef489cbc2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cf958e92-8372-4d15-a176-71671c745ea1",
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
  "created_at": "2026-10-28T10:37:16.26847Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7328b461-d918-460b-9bdd-788ef489cbc2` → **200**

```json
{
  "id": "7328b461-d918-460b-9bdd-788ef489cbc2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cf958e92-8372-4d15-a176-71671c745ea1",
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
  "created_at": "2026-10-28T10:37:16.26847Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/7328b461-d918-460b-9bdd-788ef489cbc2/cancel` → **200**

```json
{
  "command_id": "ad86bcc6-7c38-45e8-b236-760d474bcc29",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "7328b461-d918-460b-9bdd-788ef489cbc2",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cf958e92-8372-4d15-a176-71671c745ea1",
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
  "created_at": "2026-10-28T10:37:16.26847Z",
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
  "command_id": "10c30c64-892c-4c6d-a4f5-b84b2deab38b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:37:17Z",
    "sequence": 1793183837349
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fb6eed08-a945-4ccb-bd63-0ad8d3ec73de",
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
  "last_heartbeat_at": "2026-10-28T10:37:17.369344Z",
  "last_location_at": "2026-10-28T10:37:17.369344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13090"
}
```

```json
{
  "challenge_id": "911a0e7a-6e19-492f-b5c9-03dc9f668972",
  "expires_at": "2026-10-28T10:42:17.6231069Z",
  "resend_available_at": "2026-10-28T10:37:18.6231069Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "359113",
  "sent_at": "2026-10-28T10:37:17.626263422Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "911a0e7a-6e19-492f-b5c9-03dc9f668972",
  "code": "359113",
  "device_ref": "sandbox-13090"
}
```

```json
{
  "session_id": "3e80e0f0-f06e-4da1-9236-faf34715ede7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDczNywiaWF0IjoxNzkzMTgzODM3LCJqdGkiOiI0NWU4Y2ZjNC1mODQ4LTRhOWEtOWU1Yy1lYjhhZmFmZDg3ZWUiLCJzaWQiOiIzZTgwZTBmMC1mMDZlLTRkYTEtOTIzNi1mYWYzNDcxNWVkZTcifQ.sCkX1NgTb2xoyX58IQa_Vjr8ORI1Qtt6k9tE8PREnJ8",
  "access_expires_at": "2026-10-28T10:52:17.901585501Z",
  "refresh_token": "25HMHa8WvN8l7_uDqnZ1u1Ls-lq3wSTC3ovvOFR79UY",
  "refresh_expires_at": "2026-11-27T10:37:17.900950808Z",
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
  "command_id": "054d5989-ed9b-48dd-8f29-44e34a4f207c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:37:18Z",
    "sequence": 1793183838405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aabaa7d2-0281-4629-a683-e2337f73919f",
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
  "last_heartbeat_at": "2026-10-28T10:37:18.425125Z",
  "last_location_at": "2026-10-28T10:37:18.425125Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a6a4ed4a-f60f-42f1-9e4a-ca3e8f555dff",
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
  "id": "48212777-3392-4b0f-bd2a-5a7a73631c61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:42:18.687553Z",
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
  "command_id": "bd213437-8a1a-4e08-a3c9-b1f58292f219",
  "quote_id": "48212777-3392-4b0f-bd2a-5a7a73631c61",
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
  "id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cf958e92-8372-4d15-a176-71671c745ea1",
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
  "created_at": "2026-10-28T10:37:18.956872Z",
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
    "id": "f1acf702-5082-4611-b650-05a00fdfe7f0",
    "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
    "expires_at": "2026-10-28T10:37:33.961192Z",
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

`POST /api/driver/v1/offers/f1acf702-5082-4611-b650-05a00fdfe7f0/accept` → **200**

```json
{
  "command_id": "464e6ea9-8fd2-4aab-828d-5d4b9d965f40"
}
```

```json
{
  "id": "d4f3567e-f658-4484-b99e-4f672c76f21d",
  "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b553beb4-d957-4508-a356-6f9c1c4afeb7",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b553beb4-d957-4508-a356-6f9c1c4afeb7",
  "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
  "assignment_id": "d4f3567e-f658-4484-b99e-4f672c76f21d",
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

`POST /api/driver/v1/trips/b553beb4-d957-4508-a356-6f9c1c4afeb7/cancel` → **200**

```json
{
  "command_id": "9064be15-4ebd-4719-b10c-bad8e796b7a0",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "b553beb4-d957-4508-a356-6f9c1c4afeb7",
  "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
  "assignment_id": "d4f3567e-f658-4484-b99e-4f672c76f21d",
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

`GET /api/rider/v1/orders/a9e4772b-1c7c-4a9c-beac-76bd6bf6328a` → **200**

```json
{
  "id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cf958e92-8372-4d15-a176-71671c745ea1",
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
    "id": "d4f3567e-f658-4484-b99e-4f672c76f21d",
    "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b553beb4-d957-4508-a356-6f9c1c4afeb7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:37:18.956872Z",
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
    "id": "870ec0f6-c706-41e0-ba9b-20f8311e3d24",
    "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
    "expires_at": "2026-10-28T10:37:35.038932Z",
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

`POST /api/driver/v1/offers/870ec0f6-c706-41e0-ba9b-20f8311e3d24/accept` → **200**

```json
{
  "command_id": "330bad5f-d25a-4fdb-9c64-56051600ca87"
}
```

```json
{
  "id": "3cf5441c-7519-4463-8447-41661428c663",
  "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c4c4ff19-0f9d-41be-9bb1-7aa0772e7899",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c4c4ff19-0f9d-41be-9bb1-7aa0772e7899",
  "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
  "assignment_id": "3cf5441c-7519-4463-8447-41661428c663",
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

`POST /api/driver/v1/trips/c4c4ff19-0f9d-41be-9bb1-7aa0772e7899/cancel` → **200**

```json
{
  "command_id": "95dbc752-e27d-4e5d-88ce-385c91d2449d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "c4c4ff19-0f9d-41be-9bb1-7aa0772e7899",
  "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
  "assignment_id": "3cf5441c-7519-4463-8447-41661428c663",
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
    "id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:37:18.956872Z",
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
    "id": "7328b461-d918-460b-9bdd-788ef489cbc2",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:37:16.26847Z",
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

`GET /api/operator/v1/orders/a9e4772b-1c7c-4a9c-beac-76bd6bf6328a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:37:18.957671Z",
      "actor": {
        "type": "CLIENT",
        "id": "cf958e92-8372-4d15-a176-71671c745ea1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
        "quote_id": "48212777-3392-4b0f-bd2a-5a7a73631c61",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "85c92c02-1027-4223-b591-998593f948a0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:37:18.959949Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
        "attempt_id": "5064b974-5570-409d-9018-ca73968e7364",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "85c92c02-1027-4223-b591-998593f948a0"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:37:18.971626Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f1acf702-5082-4611-b650-05a00fdfe7f0",
        "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "85c92c02-1027-4223-b591-998593f948a0"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:37:19.511898Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f1acf702-5082-4611-b650-05a00fdfe7f0",
        "order_id": "a9e4772b-1c7c-4a9c-beac-76bd6bf6328a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "d4f3567e-f658-4484-b99e-4f672c76f21d"
      },
      "correlation_id": "f03d7935-ccbf-4fec-8b51-9044664dabcd"
```

Done: orders 7328b461-d918-460b-9bdd-788ef489cbc2, a9e4772b-1c7c-4a9c-beac-76bd6bf6328a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731169794",
  "device_ref": "sandbox-789"
}
```

```json
{
  "challenge_id": "433604bf-7934-4bfa-a19d-3c4edb94f597",
  "expires_at": "2026-10-28T10:42:22.185746076Z",
  "resend_available_at": "2026-10-28T10:37:23.185746076Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731169794` → **200**

```json
{
  "phone": "+380731169794",
  "audience": "CLIENT",
  "code": "087149",
  "sent_at": "2026-10-28T10:37:22.188425031Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "433604bf-7934-4bfa-a19d-3c4edb94f597",
  "code": "087149",
  "device_ref": "sandbox-789"
}
```

```json
{
  "session_id": "d5f82257-6e94-4573-a4ee-7399b5bf70ae",
  "subject": {
    "type": "CLIENT",
    "id": "4f7a0cbc-8df8-4d9b-8542-6fba2c1fe6dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjdhMGNiYy04ZGY4LTRkOWItODU0Mi02ZmJhMmMxZmU2ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NzQyLCJpYXQiOjE3OTMxODM4NDIsImp0aSI6ImQ3NThiZTk3LWY3NDUtNDA5NS05MTcxLTcyZWUzODE0NDU5YSIsInNpZCI6ImQ1ZjgyMjU3LTZlOTQtNDU3My1hNGVlLTczOTliNWJmNzBhZSJ9.iCEJyxyL8zJTN6N19s-fLiQ-ftw5Yk4_82OZ4lbi6rw",
  "access_expires_at": "2026-10-28T10:52:22.465347816Z",
  "refresh_token": "DXiNO70Ov8RCLqOoBHQgnXDgIgzaz2ay9y56WWiv6gg",
  "refresh_expires_at": "2026-11-27T10:37:22.464736676Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5d087f42-53f5-4e45-bc62-ce946c5010e4",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "bb354341-33a6-4393-8264-cbb985020e55",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-bb354341-33a6-4393-8264-cbb985020e55",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "23cc6da319c389a4e62be660d1989db8",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=bb354341-33a6-4393-8264-cbb985020e55",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731169794"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=bb354341-33a6-4393-8264-cbb985020e55",
  "expires_at": "2026-10-28T11:07:22.731908Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/bb354341-33a6-4393-8264-cbb985020e55` → **200**

```json
{
  "id": "bb354341-33a6-4393-8264-cbb985020e55",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T11:07:22.731908Z",
  "card": {
    "id": "df9092fa-2436-4065-8003-1b817105ba5e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1873",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:37:23.000019Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "df9092fa-2436-4065-8003-1b817105ba5e",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1873",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:37:23.000019Z"
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
  "device_ref": "sandbox-25906"
}
```

```json
{
  "challenge_id": "bba6b996-87c7-4f37-a7a2-2823d33c900b",
  "expires_at": "2026-10-28T10:42:23.531984818Z",
  "resend_available_at": "2026-10-28T10:37:24.531984818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "611198",
  "sent_at": "2026-10-28T10:37:23.535019337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bba6b996-87c7-4f37-a7a2-2823d33c900b",
  "code": "611198",
  "device_ref": "sandbox-25906"
}
```

```json
{
  "session_id": "d928f8b2-74a7-400f-aab5-4a05148b9dfc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDc0MywiaWF0IjoxNzkzMTgzODQzLCJqdGkiOiJiMTVhYmE0OC0wNjk3LTRhMjEtODk5OC1mMTIxZGEwYzRhYTUiLCJzaWQiOiJkOTI4ZjhiMi03NGE3LTQwMGYtYWFiNS00YTA1MTQ4YjlkZmMifQ.M9IHug0ZvCLWx14IzIM-bSbzruP4jXyCJ5UJeWpTGBE",
  "access_expires_at": "2026-10-28T10:52:23.819607555Z",
  "refresh_token": "0jIN05wpWefMYvqRIAVsGSKlDzWsddn0F95V90hOz54",
  "refresh_expires_at": "2026-11-27T10:37:23.818931512Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aabaa7d2-0281-4629-a683-e2337f73919f",
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
  "last_heartbeat_at": "2026-10-28T10:37:18.425125Z",
  "last_location_at": "2026-10-28T10:37:18.425125Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aabaa7d2-0281-4629-a683-e2337f73919f/handover` → **200**

```json
{
  "command_id": "a6539ca0-0f7b-480d-b54e-8ce8ef74a546",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aabaa7d2-0281-4629-a683-e2337f73919f",
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
  "last_heartbeat_at": "2026-10-28T10:37:18.425125Z",
  "last_location_at": "2026-10-28T10:37:18.425125Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aabaa7d2-0281-4629-a683-e2337f73919f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:37:24Z",
    "sequence": 1793183844576
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aabaa7d2-0281-4629-a683-e2337f73919f",
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
  "last_heartbeat_at": "2026-10-28T10:37:24.596197Z",
  "last_location_at": "2026-10-28T10:37:24.596197Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e59b5aae-d9e4-4747-81b4-ac32e1c939d1",
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
  "id": "5209566b-3ed7-4332-a5e3-e1190367fedc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:42:24.862239Z",
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
  "command_id": "6b5e3b5d-abd9-48af-97c3-99b4b6ab313e",
  "quote_id": "5209566b-3ed7-4332-a5e3-e1190367fedc",
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
  "id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4f7a0cbc-8df8-4d9b-8542-6fba2c1fe6dc",
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
  "created_at": "2026-10-28T10:37:25.146199Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb` → **200**

```json
{
  "id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4f7a0cbc-8df8-4d9b-8542-6fba2c1fe6dc",
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
  "created_at": "2026-10-28T10:37:25.146199Z",
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
    "id": "0d4ece55-9ac0-4780-a753-8a544dae3a63",
    "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
    "expires_at": "2026-10-28T10:37:40.181038Z",
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

`POST /api/driver/v1/offers/0d4ece55-9ac0-4780-a753-8a544dae3a63/accept` → **200**

```json
{
  "command_id": "696adc47-3197-4a02-a76e-0b5c6a55106d"
}
```

```json
{
  "id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "assignment_id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
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

`POST /api/driver/v1/work-sessions/aabaa7d2-0281-4629-a683-e2337f73919f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:37:26Z",
    "sequence": 1793183846459
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aabaa7d2-0281-4629-a683-e2337f73919f",
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
  "last_heartbeat_at": "2026-10-28T10:37:26.479123Z",
  "last_location_at": "2026-10-28T10:37:26.479123Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/174b3ef7-d5ee-4fcd-8a36-21c5213b493b/arrive` → **200**

```json
{
  "command_id": "15064e0c-c367-43c4-b13e-74f11f02e8a0",
  "expected_version": 0
}
```

```json
{
  "id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "assignment_id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
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
  "arrived_at": "2026-10-28T10:37:26.73788Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/174b3ef7-d5ee-4fcd-8a36-21c5213b493b/start` → **200**

```json
{
  "command_id": "e2613b19-e84d-4416-ac80-2b7f02eb03fb",
  "expected_version": 1
}
```

```json
{
  "id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "assignment_id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
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
  "arrived_at": "2026-10-28T10:37:26.73788Z",
  "started_at": "2026-10-28T10:37:27.013916Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/174b3ef7-d5ee-4fcd-8a36-21c5213b493b/complete` → **200**

```json
{
  "command_id": "e410fcdb-75d9-4bf1-b818-f7aa417fb299",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:37:27Z"
}
```

```json
{
  "id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "assignment_id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
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
  "arrived_at": "2026-10-28T10:37:26.73788Z",
  "started_at": "2026-10-28T10:37:27.013916Z",
  "completed_at": "2026-10-28T10:37:27.28437Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb` → **200**

```json
{
  "id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4f7a0cbc-8df8-4d9b-8542-6fba2c1fe6dc",
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
    "id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
    "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:37:25.146199Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb` → **200**

```json
{
  "id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4f7a0cbc-8df8-4d9b-8542-6fba2c1fe6dc",
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
    "id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
    "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:37:25.146199Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb` → **200**

```json
{
  "id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4f7a0cbc-8df8-4d9b-8542-6fba2c1fe6dc",
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
    "id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
    "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:37:25.146199Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb` → **200**

```json
{
  "id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4f7a0cbc-8df8-4d9b-8542-6fba2c1fe6dc",
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
    "id": "58f042ee-7f1c-410d-b8f1-3aa0a7d6f1a0",
    "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "174b3ef7-d5ee-4fcd-8a36-21c5213b493b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:37:25.146199Z",
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
      "id": "e45cc517-d671-476f-83a6-80804a1e7e3e",
      "at": "2026-10-28T10:37:28.243619Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb/tip` → **200**

```json
{
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
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
  "available_until": "2026-10-29T10:37:27.28437Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb/tip` → **201**

```json
{
  "command_id": "e66b58b3-4960-4afa-b148-a5fe8806e503",
  "amount_minor": 2500
}
```

```json
{
  "id": "d9a6e73e-7018-4d58-a5b9-4cb6899a9cf2",
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:37:32.37944Z"
}
```

`GET /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb/tip` → **200**

```json
{
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
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
  "available_until": "2026-10-29T10:37:27.28437Z",
  "open": false,
  "tip": {
    "id": "d9a6e73e-7018-4d58-a5b9-4cb6899a9cf2",
    "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T10:37:32.37944Z"
  }
}
```

`GET /api/rider/v1/orders/3feef105-6214-4c34-af91-6aa3cac271cb/tip` → **200**

```json
{
  "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
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
  "available_until": "2026-10-29T10:37:27.28437Z",
  "open": false,
  "tip": {
    "id": "d9a6e73e-7018-4d58-a5b9-4cb6899a9cf2",
    "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:37:32.37944Z"
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
      "id": "e45cc517-d671-476f-83a6-80804a1e7e3e",
      "at": "2026-10-28T10:37:28.243619Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
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
      "id": "7a8020c5-b62a-461a-a8f0-1fa09db4cbcb",
      "at": "2026-10-28T10:37:34.307401Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
      "counterpart_id": null
    },
    {
      "id": "e45cc517-d671-476f-83a6-80804a1e7e3e",
      "at": "2026-10-28T10:37:28.243619Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3feef105-6214-4c34-af91-6aa3cac271cb",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aabaa7d2-0281-4629-a683-e2337f73919f",
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
  "last_heartbeat_at": "2026-10-28T10:37:26.479123Z",
  "last_location_at": "2026-10-28T10:37:26.479123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aabaa7d2-0281-4629-a683-e2337f73919f/close` → **200**

```json
{
  "command_id": "de7026cc-cb66-49b6-b852-4a0d114d93ed",
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

Done: card order 3feef105-6214-4c34-af91-6aa3cac271cb.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733552757",
  "device_ref": "sandbox-17442"
}
```

```json
{
  "challenge_id": "9a8a409b-f45d-47ae-b9e5-fce80b178fea",
  "expires_at": "2026-10-28T10:42:36.210477231Z",
  "resend_available_at": "2026-10-28T10:37:37.210477231Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733552757` → **200**

```json
{
  "phone": "+380733552757",
  "audience": "CLIENT",
  "code": "930016",
  "sent_at": "2026-10-28T10:37:36.213216488Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a8a409b-f45d-47ae-b9e5-fce80b178fea",
  "code": "930016",
  "device_ref": "sandbox-17442"
}
```

```json
{
  "session_id": "bdbcad43-a73e-411a-bde5-97d190652899",
  "subject": {
    "type": "CLIENT",
    "id": "460535d9-8c5c-48d2-8e90-b696e1b81d9d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NjA1MzVkOS04YzVjLTQ4ZDItOGU5MC1iNjk2ZTFiODFkOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NzU2LCJpYXQiOjE3OTMxODM4NTYsImp0aSI6ImUyNzQzM2E3LTQ1ZTAtNDk3Yi1iYmIyLTdiZDdkNzhjYzA1ZSIsInNpZCI6ImJkYmNhZDQzLWE3M2UtNDExYS1iZGU1LTk3ZDE5MDY1Mjg5OSJ9.lmWHWEpLqa-PNvR7R2N2CS2Tp1Su6zZDHs8g6DaOJlM",
  "access_expires_at": "2026-10-28T10:52:36.489504667Z",
  "refresh_token": "u9rrq6w5xTfvux5V_uNkG1iY8N958qYI9l1kG1OvrLU",
  "refresh_expires_at": "2026-11-27T10:37:36.488920939Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "709f12ba-8628-4b13-9767-10541cf70828",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "ae720519-d5f2-4216-9f9d-4cccdc754fdc",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ae720519-d5f2-4216-9f9d-4cccdc754fdc",
    "orderDate": "1793183856",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "de4e43a7b2b0352b5fa03fbc7c5610d8",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ae720519-d5f2-4216-9f9d-4cccdc754fdc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733552757"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ae720519-d5f2-4216-9f9d-4cccdc754fdc",
  "created_at": "2026-10-28T10:37:36.749289Z",
  "expires_at": "2026-10-28T11:07:36.749289Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/ae720519-d5f2-4216-9f9d-4cccdc754fdc` → **200**

```json
{
  "id": "ae720519-d5f2-4216-9f9d-4cccdc754fdc",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:37:36.749289Z",
  "expires_at": "2026-10-28T11:07:36.749289Z",
  "completed_at": "2026-10-28T10:37:37.013301Z",
  "masked_pan": "41****3476",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "460535d9-8c5c-48d2-8e90-b696e1b81d9d",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "460535d9-8c5c-48d2-8e90-b696e1b81d9d",
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
      "id": "81dd5e43-d673-4488-9448-71d16479d1d6",
      "at": "2026-10-28T10:37:37.327195Z",
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
  "client_id": "460535d9-8c5c-48d2-8e90-b696e1b81d9d",
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
      "id": "81dd5e43-d673-4488-9448-71d16479d1d6",
      "at": "2026-10-28T10:37:37.327195Z",
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
  "device_ref": "sandbox-17780"
}
```

```json
{
  "challenge_id": "5475d617-fb4b-4809-a272-07b28bb784cb",
  "expires_at": "2026-10-28T10:42:39.049900712Z",
  "resend_available_at": "2026-10-28T10:37:40.049900712Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "662322",
  "sent_at": "2026-10-28T10:37:39.052968453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5475d617-fb4b-4809-a272-07b28bb784cb",
  "code": "662322",
  "device_ref": "sandbox-17780"
}
```

```json
{
  "session_id": "f2443e9a-1903-4d4c-99f9-a506a9fc6468",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDc1OSwiaWF0IjoxNzkzMTgzODU5LCJqdGkiOiIyNWI4MjhlNi03ZDMzLTQyZDItOTA2MS04NmY5ZGZmNTc5MzQiLCJzaWQiOiJmMjQ0M2U5YS0xOTAzLTRkNGMtOTlmOS1hNTA2YTlmYzY0NjgifQ.aiyfrPW_0DDN_-phT92TWRoqtBbZVJKKn51NpYtrAQU",
  "access_expires_at": "2026-10-28T10:52:39.327165232Z",
  "refresh_token": "siStmDo2u-8hHLd1zFFnl4tE7aMF70t4lC6GRsN-KyE",
  "refresh_expires_at": "2026-11-27T10:37:39.326561966Z",
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
  "command_id": "7d05dac0-6041-485c-a17a-4a5b8f2bff23",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b0cf68e7-06f7-4a8f-9fb8-080763b1ff66",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b0cf68e7-06f7-4a8f-9fb8-080763b1ff66",
    "orderDate": "1793183859",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6d778749c3fcd5f1e3cc8b1b52dffed2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b0cf68e7-06f7-4a8f-9fb8-080763b1ff66",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b0cf68e7-06f7-4a8f-9fb8-080763b1ff66",
  "created_at": "2026-10-28T10:37:39.828474Z",
  "expires_at": "2026-10-28T11:07:39.828474Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b0cf68e7-06f7-4a8f-9fb8-080763b1ff66` → **200**

```json
{
  "id": "b0cf68e7-06f7-4a8f-9fb8-080763b1ff66",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:37:39.828474Z",
  "expires_at": "2026-10-28T11:07:39.828474Z",
  "completed_at": "2026-10-28T10:37:40.085564Z",
  "masked_pan": "41****9934",
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
      "id": "a4b8683b-918d-4ee3-a86e-a30fbbb1058a",
      "at": "2026-10-28T10:37:40.339913Z",
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
  "command_id": "9674b502-b076-47a2-b7c7-6d281ca7d6b2",
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
  "correlation_id": "61c25f61-aafe-41be-b767-841417cb0291"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671577899",
  "device_ref": "sandbox-10948"
}
```

```json
{
  "challenge_id": "01b5ccc6-ab25-4025-8397-21462212f318",
  "expires_at": "2026-10-28T10:42:40.882823157Z",
  "resend_available_at": "2026-10-28T10:37:41.882823157Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671577899` → **200**

```json
{
  "phone": "+380671577899",
  "audience": "CLIENT",
  "code": "795971",
  "sent_at": "2026-10-28T10:37:40.885352382Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01b5ccc6-ab25-4025-8397-21462212f318",
  "code": "795971",
  "device_ref": "sandbox-10948"
}
```

```json
{
  "session_id": "1a3a7408-6c55-4774-a0b0-b25d45dc80fd",
  "subject": {
    "type": "CLIENT",
    "id": "5574826b-91e1-4f17-8ed9-307cd7895dbe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTc0ODI2Yi05MWUxLTRmMTctOGVkOS0zMDdjZDc4OTVkYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NzYxLCJpYXQiOjE3OTMxODM4NjEsImp0aSI6IjA2Y2MzNWZkLWM2NTEtNGFlMy1hYWEyLTc4YzNhOGU3OGFmYiIsInNpZCI6IjFhM2E3NDA4LTZjNTUtNDc3NC1hMGIwLWIyNWQ0NWRjODBmZCJ9.delePMPHmtcs_8xlVszBsIkOkQ2RbLHUA_49GAnZjgc",
  "access_expires_at": "2026-10-28T10:52:41.184688454Z",
  "refresh_token": "NqcjuyCH4G4u2AiCY87N3ywC1AHB6rcnzJXT4glC3Kw",
  "refresh_expires_at": "2026-11-27T10:37:41.184088103Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5574826b-91e1-4f17-8ed9-307cd7895dbe",
  "session_id": "1a3a7408-6c55-4774-a0b0-b25d45dc80fd",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da041eb4-b914-496c-84b0-9240d1839d33",
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
  "id": "03a08d97-81d3-4152-b272-aed633064959",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:42:41.690250Z",
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
  "challenge_id": "1757bc23-30e5-4a0a-8fbf-108a69e14eb7",
  "expires_at": "2026-10-28T10:42:43.961154815Z",
  "resend_available_at": "2026-10-28T10:37:44.961154815Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671577899` → **200**

```json
{
  "phone": "+380671577899",
  "audience": "CLIENT",
  "code": "320908",
  "sent_at": "2026-10-28T10:37:43.963529751Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "2c5916b9-3a21-43d8-9bda-63848364b943",
  "challenge_id": "1757bc23-30e5-4a0a-8fbf-108a69e14eb7",
  "otp_code": "320908"
}
```

```json
{
  "client_id": "5574826b-91e1-4f17-8ed9-307cd7895dbe",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:37:44.253555421Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "e5a5d254-108f-4b86-abdb-e060f97b875c",
  "quote_id": "03a08d97-81d3-4152-b272-aed633064959",
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
  "correlation_id": "47cd9b3f-b4fb-4585-be99-309f8e05af66"
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
  "session_id": "d29e3f28-8421-4c9d-bc23-52c4eeb626ae",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3NjUsImlhdCI6MTc5MzE4Mzg2NSwianRpIjoiZTdmOTlhYzAtNGZhZi00Yzk3LWE4MDEtNGI0NTg3MmZlYzEzIiwic2lkIjoiZDI5ZTNmMjgtODQyMS00YzlkLWJjMjMtNTJjNGVlYjYyNmFlIn0.MotnugYtYF0GjfK7eJPIIUnUAjUDBF0EeJY05FHGIhw",
  "access_expires_at": "2026-10-28T10:52:45.072736164Z",
  "refresh_token": "h79UrKPmTf6fb4Hb00asqCliYczDnehUCxEUMFU6qig",
  "refresh_expires_at": "2026-10-28T22:37:45.072002313Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "5574826b-91e1-4f17-8ed9-307cd7895dbe",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:37:44.253555Z",
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

`POST /api/admin/v1/client-deletions/5574826b-91e1-4f17-8ed9-307cd7895dbe/complete` → **200**

```json
{
  "command_id": "23ff7974-7aed-4d9a-8011-ab88ec9a7640",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "5574826b-91e1-4f17-8ed9-307cd7895dbe",
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
  "correlation_id": "d482f6c7-9f69-49e6-bb11-79bf871ce34b"
}
```

Done: client 5574826b-91e1-4f17-8ed9-307cd7895dbe anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666009612",
  "device_ref": "sandbox-5759"
}
```

```json
{
  "challenge_id": "39eedc80-b423-4a2d-8e93-9d8b80826d2e",
  "expires_at": "2026-10-28T10:42:46.159470349Z",
  "resend_available_at": "2026-10-28T10:37:47.159470349Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666009612` → **200**

```json
{
  "phone": "+380666009612",
  "audience": "CLIENT",
  "code": "768657",
  "sent_at": "2026-10-28T10:37:46.161889949Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39eedc80-b423-4a2d-8e93-9d8b80826d2e",
  "code": "768657",
  "device_ref": "sandbox-5759"
}
```

```json
{
  "session_id": "859ca7ed-67ac-40a9-9c9d-f1531a267f34",
  "subject": {
    "type": "CLIENT",
    "id": "186dabb9-5beb-45f9-aed7-750c742a9f9e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODZkYWJiOS01YmViLTQ1ZjktYWVkNy03NTBjNzQyYTlmOWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NzY2LCJpYXQiOjE3OTMxODM4NjYsImp0aSI6ImJhNDkwNDI0LThiMGMtNGU2MC05YzkwLWMwYmYwYTczZTljOCIsInNpZCI6Ijg1OWNhN2VkLTY3YWMtNDBhOS05YzlkLWYxNTMxYTI2N2YzNCJ9.PiWF7h_2Eo5WAbYwC36k5AF9Wl7Sia8lbC2zlwxcSIg",
  "access_expires_at": "2026-10-28T10:52:46.45325298Z",
  "refresh_token": "J_2-Ek508_4r6Q-2cZAMyBo8hENY-Yy82j_8LQHF5ok",
  "refresh_expires_at": "2026-11-27T10:37:46.452454379Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "186dabb9-5beb-45f9-aed7-750c742a9f9e",
  "session_id": "859ca7ed-67ac-40a9-9c9d-f1531a267f34",
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
  "session_id": "40f705d9-ed7f-488f-b952-99a241938e3b",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3NjcsImlhdCI6MTc5MzE4Mzg2NywianRpIjoiMGYwZWY2MzItNmFmZS00MDc3LWEyMjItOWViNDA4Mzk2MGNkIiwic2lkIjoiNDBmNzA1ZDktZWQ3Zi00ODhmLWI5NTItOTlhMjQxOTM4ZTNiIn0.1hdahk6meujotrVBFn3nyWpKg6caoMNSu7CorRT2ckY",
  "access_expires_at": "2026-10-28T10:52:47.258952078Z",
  "refresh_token": "_XScsf1JZWdlGnOToEVa09EtbW_Gb9AWBDGOVvnQTkg",
  "refresh_expires_at": "2026-10-28T22:37:47.258354432Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6009612&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "186dabb9-5beb-45f9-aed7-750c742a9f9e",
      "phone": "+380666009612",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:37:46.450464Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/186dabb9-5beb-45f9-aed7-750c742a9f9e` → **200**

```json
{
  "client": {
    "id": "186dabb9-5beb-45f9-aed7-750c742a9f9e",
    "phone": "+380666009612",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:37:46.450464Z",
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

`POST /api/admin/v1/clients/186dabb9-5beb-45f9-aed7-750c742a9f9e/block` → **400**

```json
{
  "command_id": "25fd3a11-1e71-4371-a0ab-8b7ceb7f1866",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/186dabb9-5beb-45f9-aed7-750c742a9f9e/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "084d0150-3081-4c17-9ea8-c4baa9ff39ff",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/186dabb9-5beb-45f9-aed7-750c742a9f9e/block` → **200**

```json
{
  "command_id": "d4fc8f82-c093-480b-8832-1868f7137290",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "186dabb9-5beb-45f9-aed7-750c742a9f9e",
  "phone": "+380666009612",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:37:46.450464Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:37:48.378255Z",
    "by": "03937974-b9ba-4260-8728-08e067d4e567"
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
  "correlation_id": "4026b65b-31e7-4d63-976d-8269d8b8955c"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666009612",
  "device_ref": "sandbox-28623"
}
```

```json
{
  "challenge_id": "9b2096a6-b228-4ee9-8895-04cfa361e390",
  "expires_at": "2026-10-28T10:42:50.893732825Z",
  "resend_available_at": "2026-10-28T10:37:51.893732825Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666009612` → **200**

```json
{
  "phone": "+380666009612",
  "audience": "CLIENT",
  "code": "791252",
  "sent_at": "2026-10-28T10:37:50.896290461Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "9b2096a6-b228-4ee9-8895-04cfa361e390",
  "code": "791252",
  "device_ref": "sandbox-28623"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "074e551e-0c8d-4efe-9e61-e47375afbb1d"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/186dabb9-5beb-45f9-aed7-750c742a9f9e` → **200**

```json
{
  "client": {
    "id": "186dabb9-5beb-45f9-aed7-750c742a9f9e",
    "phone": "+380666009612",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:37:46.450464Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:37:48.378255Z",
      "by": "03937974-b9ba-4260-8728-08e067d4e567"
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

`POST /api/admin/v1/clients/186dabb9-5beb-45f9-aed7-750c742a9f9e/unblock` → **200**

```json
{
  "command_id": "512e72c9-fd50-4d34-99e4-c31eb86597ac",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "186dabb9-5beb-45f9-aed7-750c742a9f9e",
  "phone": "+380666009612",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:37:46.450464Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666009612",
  "device_ref": "sandbox-29651"
}
```

```json
{
  "challenge_id": "2fe9537b-db88-4d34-b5ad-0aff2f7af480",
  "expires_at": "2026-10-28T10:42:54.027252457Z",
  "resend_available_at": "2026-10-28T10:37:55.027252457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666009612` → **200**

```json
{
  "phone": "+380666009612",
  "audience": "CLIENT",
  "code": "402852",
  "sent_at": "2026-10-28T10:37:54.029480815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fe9537b-db88-4d34-b5ad-0aff2f7af480",
  "code": "402852",
  "device_ref": "sandbox-29651"
}
```

```json
{
  "session_id": "b8fb3542-c91d-4fb4-8f2f-455d0c93ee21",
  "subject": {
    "type": "CLIENT",
    "id": "186dabb9-5beb-45f9-aed7-750c742a9f9e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODZkYWJiOS01YmViLTQ1ZjktYWVkNy03NTBjNzQyYTlmOWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Nzc0LCJpYXQiOjE3OTMxODM4NzQsImp0aSI6IjUyMjE5OTViLTBhYTgtNDhkYi1iOTdlLTdhOTQ5OGZkZmQ5MyIsInNpZCI6ImI4ZmIzNTQyLWM5MWQtNGZiNC04ZjJmLTQ1NWQwYzkzZWUyMSJ9.l9HyEfYBo8gugs8EVfs8GL19wUZankU4a0IS2_zk_Mk",
  "access_expires_at": "2026-10-28T10:52:54.312074315Z",
  "refresh_token": "bq0-hKXNdb4IAM58SWNAnbWrva5sgZQv-e9Ms6rbuok",
  "refresh_expires_at": "2026-11-27T10:37:54.311495243Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "186dabb9-5beb-45f9-aed7-750c742a9f9e",
  "session_id": "b8fb3542-c91d-4fb4-8f2f-455d0c93ee21",
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
  "phone": "+380666455793",
  "device_ref": "sandbox-4259"
}
```

```json
{
  "challenge_id": "52400db7-1e8b-4c2f-9e96-963e642afbfe",
  "expires_at": "2026-10-28T10:42:54.824737615Z",
  "resend_available_at": "2026-10-28T10:37:55.824737615Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666455793` → **200**

```json
{
  "phone": "+380666455793",
  "audience": "CLIENT",
  "code": "527873",
  "sent_at": "2026-10-28T10:37:54.827174692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52400db7-1e8b-4c2f-9e96-963e642afbfe",
  "code": "527873",
  "device_ref": "sandbox-4259"
}
```

```json
{
  "session_id": "c7bbca0b-e12f-47ce-8183-e66e14266eeb",
  "subject": {
    "type": "CLIENT",
    "id": "056b75c3-bb58-433f-8f10-104cab67fa39"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTZiNzVjMy1iYjU4LTQzM2YtOGYxMC0xMDRjYWI2N2ZhMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Nzc1LCJpYXQiOjE3OTMxODM4NzUsImp0aSI6IjFiNThjYzlkLWQ3YWEtNDFhOC1hMWNjLTc0N2EwYzQ1OWEzNCIsInNpZCI6ImM3YmJjYTBiLWUxMmYtNDdjZS04MTgzLWU2NmUxNDI2NmVlYiJ9.Kb8vhawFXC8XBWjNU0o64rOICDF9fqjQFJHZ9NQ0MbM",
  "access_expires_at": "2026-10-28T10:52:55.106915992Z",
  "refresh_token": "qfdlp1oI2Uwi2FmDJ0WlWDPr0fsQMWHu0LevBUgyIV8",
  "refresh_expires_at": "2026-11-27T10:37:55.106289116Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "266305da-a935-444a-8a10-e961f5bdb611",
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
  "id": "517ed337-3b12-412e-8528-4f213fc55c10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:42:55.369157Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 44c08c24-6d23-4d83-9b15-c19296f5deee) → **201**

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
  "session_id": "48f3c9d8-8e78-408a-ac00-4b09772429e9",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3NzUsImlhdCI6MTc5MzE4Mzg3NSwianRpIjoiNDY1YWM0MGQtZTM3Ny00NzkyLTk2ODQtOTJiZTUyNTcwNzY1Iiwic2lkIjoiNDhmM2M5ZDgtOGU3OC00MDhhLWFjMDAtNGIwOTc3MjQyOWU5In0.IltBYtKlXK-DVRS7NevlUzLXciPfTHzQm5YjnSu4Y_Q",
  "access_expires_at": "2026-10-28T10:52:55.986420665Z",
  "refresh_token": "G2UqlW0tWPdJcZnlZsjxpM6_x3ue3WZfKQIklW1h3tU",
  "refresh_expires_at": "2026-10-28T22:37:55.98583428Z",
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
  "session_id": "b5c49430-6c4f-4af4-8d8a-59cf5d83cf08",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3NzYsImlhdCI6MTc5MzE4Mzg3NiwianRpIjoiNmQ4MTQ5MTctMDc2NS00ZThhLWFmNmMtNzVkOGFiNTdjMjcyIiwic2lkIjoiYjVjNDk0MzAtNmM0Zi00YWY0LThkOGEtNTljZjVkODNjZjA4In0.XTD6zkfFzNfR-sk2DSQJPP_7wGptlcsZsG5usruwNfE",
  "access_expires_at": "2026-10-28T10:52:56.543559691Z",
  "refresh_token": "IvIdBpf5sLsA7evl_HjM9mSf4H9rebsfqj6g-b08iN0",
  "refresh_expires_at": "2026-10-28T22:37:56.543042004Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5e7c50b8-c819-448d-b032-e6dbe894f5b6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:37:55.65432Z",
      "actor": {
        "type": "CLIENT",
        "id": "056b75c3-bb58-433f-8f10-104cab67fa39",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6",
        "quote_id": "517ed337-3b12-412e-8528-4f213fc55c10",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "44c08c24-6d23-4d83-9b15-c19296f5deee"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:37:55.656358Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6",
        "attempt_id": "d475b319-5562-4f18-a9df-e8e685d9a504",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "44c08c24-6d23-4d83-9b15-c19296f5deee"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:37:55.666353Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6",
        "attempt_id": "d475b319-5562-4f18-a9df-e8e685d9a504"
      },
      "correlation_id": "44c08c24-6d23-4d83-9b15-c19296f5deee"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "d475b319-5562-4f18-a9df-e8e685d9a504",
        "generation": 1,
        "started_at": "2026-10-28T10:37:55.655322Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:37:55.666353Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:37:55.657357Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/44c08c24-6d23-4d83-9b15-c19296f5deee` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6:0",
      "order_id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6",
      "at": "2026-10-28T10:37:55.65432Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6:1",
      "order_id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6",
      "at": "2026-10-28T10:37:55.656358Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6:2",
      "order_id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6",
      "at": "2026-10-28T10:37:55.666353Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/8eb65b2f-d9b4-44dd-a75f-43bf451cac32` → **200**

```json
{
  "found": []
}
```

Done: request 44c08c24-6d23-4d83-9b15-c19296f5deee — order 5e7c50b8-c819-448d-b032-e6dbe894f5b6 found by its id.

`GET /api/rider/v1/orders/5e7c50b8-c819-448d-b032-e6dbe894f5b6` → **200**

```json
{
  "id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "056b75c3-bb58-433f-8f10-104cab67fa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:37:55.653701Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5e7c50b8-c819-448d-b032-e6dbe894f5b6/cancel` → **200**

```json
{
  "command_id": "936b7172-b176-47f4-95ec-bf333bfd4e22",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5e7c50b8-c819-448d-b032-e6dbe894f5b6",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "056b75c3-bb58-433f-8f10-104cab67fa39",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:37:55.653701Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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
  "phone": "+380634817773",
  "device_ref": "sandbox-17096"
}
```

```json
{
  "challenge_id": "e3d87dd0-743e-4433-86ad-4e0f228bc67a",
  "expires_at": "2026-10-28T10:42:58.138701791Z",
  "resend_available_at": "2026-10-28T10:37:59.138701791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634817773` → **200**

```json
{
  "phone": "+380634817773",
  "audience": "CLIENT",
  "code": "872036",
  "sent_at": "2026-10-28T10:37:58.141376417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3d87dd0-743e-4433-86ad-4e0f228bc67a",
  "code": "872036",
  "device_ref": "sandbox-17096"
}
```

```json
{
  "session_id": "9e175995-7582-40e4-9edd-7799917ff74c",
  "subject": {
    "type": "CLIENT",
    "id": "99c90ec5-3298-480d-8fb3-55bd7000fb70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OWM5MGVjNS0zMjk4LTQ4MGQtOGZiMy01NWJkNzAwMGZiNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Nzc4LCJpYXQiOjE3OTMxODM4NzgsImp0aSI6IjAxMTEwNDFkLTcyNTItNDg4ZS1iMjgxLWRlMDRhYzIwNGNkYSIsInNpZCI6IjllMTc1OTk1LTc1ODItNDBlNC05ZWRkLTc3OTk5MTdmZjc0YyJ9.tV8c_Hf_gD4_uhdeIf6GpMxzn3ekQ5jIFwVyieMZv-4",
  "access_expires_at": "2026-10-28T10:52:58.418500364Z",
  "refresh_token": "HeMZy5JLfWeq4wgZ18uqEgkL13o3iVxkXGp0rWxdOUk",
  "refresh_expires_at": "2026-11-27T10:37:58.417909075Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "34238302-35f6-4956-8aff-66ebe027cbda",
  "expires_at": "2026-10-28T10:43:00.670166633Z",
  "resend_available_at": "2026-10-28T10:38:01.670166633Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634817773` → **200**

```json
{
  "phone": "+380634817773",
  "audience": "CLIENT",
  "code": "154465",
  "sent_at": "2026-10-28T10:38:00.672334703Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "57fc816a-9771-4242-ad56-31aedf5785b1",
  "challenge_id": "34238302-35f6-4956-8aff-66ebe027cbda",
  "otp_code": "154465"
}
```

```json
{
  "id": "8787b2b9-d182-47bf-a968-3d8cd8e22713",
  "state": "PENDING",
  "created_at": "2026-10-28T10:38:00.952574Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/8787b2b9-d182-47bf-a968-3d8cd8e22713` → **200**

```json
{
  "id": "8787b2b9-d182-47bf-a968-3d8cd8e22713",
  "state": "PENDING",
  "created_at": "2026-10-28T10:38:00.952574Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8787b2b9-d182-47bf-a968-3d8cd8e22713` → **200**

```json
{
  "id": "8787b2b9-d182-47bf-a968-3d8cd8e22713",
  "state": "READY",
  "created_at": "2026-10-28T10:38:00.952574Z",
  "ready_at": "2026-10-28T10:38:01.864539Z",
  "expires_at": "2026-11-04T10:38:01.864539Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/8787b2b9-d182-47bf-a968-3d8cd8e22713/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637756156",
  "device_ref": "sandbox-12406"
}
```

```json
{
  "challenge_id": "b86942b5-ce23-48ad-904c-e5cdd83f5bbe",
  "expires_at": "2026-10-28T10:43:02.752537093Z",
  "resend_available_at": "2026-10-28T10:38:03.752537093Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637756156` → **200**

```json
{
  "phone": "+380637756156",
  "audience": "CLIENT",
  "code": "518707",
  "sent_at": "2026-10-28T10:38:02.75508051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b86942b5-ce23-48ad-904c-e5cdd83f5bbe",
  "code": "518707",
  "device_ref": "sandbox-12406"
}
```

```json
{
  "session_id": "7e43cff1-439d-464f-9f1f-0a4b68719b48",
  "subject": {
    "type": "CLIENT",
    "id": "d534cd18-8917-46b6-902a-0c573a713a50"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTM0Y2QxOC04OTE3LTQ2YjYtOTAyYS0wYzU3M2E3MTNhNTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0NzgzLCJpYXQiOjE3OTMxODM4ODMsImp0aSI6IjcyODU1ODM1LTYyZDYtNDdhNy1hNDY2LTAyZjljNTVmN2E3ZCIsInNpZCI6IjdlNDNjZmYxLTQzOWQtNDY0Zi05ZjFmLTBhNGI2ODcxOWI0OCJ9.NVd0FJaEeitP8oa_3Up37Cy8ELhEULGa7m5bC6SR5JM",
  "access_expires_at": "2026-10-28T10:53:03.042623879Z",
  "refresh_token": "ZofsMa6rOD9JHZwbzjKCgj8_XmbRHDRtPbw5Z1SGF20",
  "refresh_expires_at": "2026-11-27T10:38:03.042082818Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/8787b2b9-d182-47bf-a968-3d8cd8e22713/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/8787b2b9-d182-47bf-a968-3d8cd8e22713/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "aa7e184f-e008-4b6d-932b-9ad707e2bb09"
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
  "session_id": "e8fc4a5a-eb3d-4611-97b2-a8cdbb787e7c",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3ODMsImlhdCI6MTc5MzE4Mzg4MywianRpIjoiMzQxN2ZiMDMtYTg0NS00YmQ4LTk2ODItNGQxYTljNzc5NGQ4Iiwic2lkIjoiZThmYzRhNWEtZWIzZC00NjExLTk3YjItYThjZGJiNzg3ZTdjIn0.rzKIJAuC48QUef-mvl0s55i97Bf1lZFK2_Tj3AzUkQ4",
  "access_expires_at": "2026-10-28T10:53:03.844508578Z",
  "refresh_token": "FqLpqiVtJYX3GK6UxaH5LcGmVziQlLzEXxgstVyzuJM",
  "refresh_expires_at": "2026-10-28T22:38:03.843889073Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "99c90ec5-3298-480d-8fb3-55bd7000fb70",
  "session_id": "9e175995-7582-40e4-9edd-7799917ff74c",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/99c90ec5-3298-480d-8fb3-55bd7000fb70/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "8787b2b9-d182-47bf-a968-3d8cd8e22713",
      "state": "READY",
      "created_at": "2026-10-28T10:38:00.952574Z",
      "ready_at": "2026-10-28T10:38:01.864539Z",
      "expires_at": "2026-11-04T10:38:01.864539Z",
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
  "device_ref": "sandbox-23067"
}
```

```json
{
  "challenge_id": "7383cfb9-05ce-4a95-bdca-b36a007e04d9",
  "expires_at": "2026-10-28T10:43:04.709760091Z",
  "resend_available_at": "2026-10-28T10:38:05.709760091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "313002",
  "sent_at": "2026-10-28T10:38:04.71260001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7383cfb9-05ce-4a95-bdca-b36a007e04d9",
  "code": "313002",
  "device_ref": "sandbox-23067"
}
```

```json
{
  "session_id": "b6d32957-7b31-4f08-9651-470672ab3f34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDc4NSwiaWF0IjoxNzkzMTgzODg1LCJqdGkiOiJmYTA3MTM1OS01Y2ExLTQ5NzMtOGViOS02ZjU3MGY2M2VkNzkiLCJzaWQiOiJiNmQzMjk1Ny03YjMxLTRmMDgtOTY1MS00NzA2NzJhYjNmMzQifQ.EnxHvRM2T4Kz1vaHJBzk_wOQdWeCmrZupsOLsNxjnQU",
  "access_expires_at": "2026-10-28T10:53:05.01348237Z",
  "refresh_token": "TZML29ZficV2vL02XloF2I7hPebug0DLLUXlQvWb6IQ",
  "refresh_expires_at": "2026-11-27T10:38:05.012892478Z",
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
  "device_ref": "sandbox-19664"
}
```

```json
{
  "challenge_id": "3c3dfc98-05f6-499d-b945-3e9247ecf206",
  "expires_at": "2026-10-28T10:43:05.5101889Z",
  "resend_available_at": "2026-10-28T10:38:06.5101889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "132266",
  "sent_at": "2026-10-28T10:38:05.51239434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c3dfc98-05f6-499d-b945-3e9247ecf206",
  "code": "132266",
  "device_ref": "sandbox-19664"
}
```

```json
{
  "session_id": "cdf24d79-bc46-4e73-bc57-e3cfda205ee7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDc4NSwiaWF0IjoxNzkzMTgzODg1LCJqdGkiOiIxNjBkMTI4OS1hNjQyLTRhNjMtYjgyNS1jMWQyZWY2NzcwZGMiLCJzaWQiOiJjZGYyNGQ3OS1iYzQ2LTRlNzMtYmM1Ny1lM2NmZGEyMDVlZTcifQ.75ofQejkeuevPTpMfsK7z2du3Bnk5F-pL2-CrCaZyAM",
  "access_expires_at": "2026-10-28T10:53:05.786904313Z",
  "refresh_token": "BvTZFZZ0N0nxenqJyOwti-Oyui4i4Q4Pdezlwn2hsC4",
  "refresh_expires_at": "2026-11-27T10:38:05.786270993Z",
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
  "command_id": "bad41269-2e07-4dc5-a250-b4a19dfe53eb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:06Z",
    "sequence": 1793183886295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8eed6246-01fa-4195-86b7-e4c9b74ccb34",
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
  "last_heartbeat_at": "2026-10-28T10:38:06.312873Z",
  "last_location_at": "2026-10-28T10:38:06.312873Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-6513"
}
```

```json
{
  "challenge_id": "ad50ff0a-1a45-4d07-b314-3aba0785304d",
  "expires_at": "2026-10-28T10:43:06.578424533Z",
  "resend_available_at": "2026-10-28T10:38:07.578424533Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "491738",
  "sent_at": "2026-10-28T10:38:06.581443473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad50ff0a-1a45-4d07-b314-3aba0785304d",
  "code": "491738",
  "device_ref": "sandbox-6513"
}
```

```json
{
  "session_id": "da782359-725c-4fa8-acf2-53a8fd343d22",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDc4NiwiaWF0IjoxNzkzMTgzODg2LCJqdGkiOiJhMTVlYTM5Yi1jNTU5LTQ5NzAtOWY3OC0wNGU1ZmY5YTUzMTUiLCJzaWQiOiJkYTc4MjM1OS03MjVjLTRmYTgtYWNmMi01M2E4ZmQzNDNkMjIifQ.QEHjJw0vQUyd7eNuOoJsb3RyptCOco2c5NCs6Lm8gOE",
  "access_expires_at": "2026-10-28T10:53:06.857583343Z",
  "refresh_token": "H_1hSgu9URhE4mYuEVoWBFcrWyqQm3beylU_boVdXrY",
  "refresh_expires_at": "2026-11-27T10:38:06.857044787Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fb6eed08-a945-4ccb-bd63-0ad8d3ec73de",
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
  "last_heartbeat_at": "2026-10-28T10:37:17.369344Z",
  "last_location_at": "2026-10-28T10:37:17.369344Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fb6eed08-a945-4ccb-bd63-0ad8d3ec73de/handover` → **200**

```json
{
  "command_id": "3af56c9a-12d6-4783-9d0d-e8d13ca917f7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fb6eed08-a945-4ccb-bd63-0ad8d3ec73de",
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
  "last_heartbeat_at": "2026-10-28T10:37:17.369344Z",
  "last_location_at": "2026-10-28T10:37:17.369344Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fb6eed08-a945-4ccb-bd63-0ad8d3ec73de/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:07Z",
    "sequence": 1793183887618
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fb6eed08-a945-4ccb-bd63-0ad8d3ec73de",
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
  "last_heartbeat_at": "2026-10-28T10:38:07.63803Z",
  "last_location_at": "2026-10-28T10:38:07.63803Z",
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
  "session_id": "13c3d003-9887-4f82-8311-8da31b0aae36",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3ODgsImlhdCI6MTc5MzE4Mzg4OCwianRpIjoiN2FiM2RkY2ItMmI5MC00YmNiLWE4ZjItNmFhMjMyOGY3MTI3Iiwic2lkIjoiMTNjM2QwMDMtOTg4Ny00ZjgyLTgzMTEtOGRhMzFiMGFhZTM2In0.lD3e5-ls2dq00XpgiI8wEZZcdNi2MEV1JBL1Z_XbWFY",
  "access_expires_at": "2026-10-28T10:53:08.179880365Z",
  "refresh_token": "Sy1Bz_mLhMO_fpmSScs1uCE5BP25S11GHzAc4JayTdk",
  "refresh_expires_at": "2026-10-28T22:38:08.179278641Z",
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
  "session_id": "618cf44e-cd57-4237-bd46-d8acbd8e4b19",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ3ODgsImlhdCI6MTc5MzE4Mzg4OCwianRpIjoiNjNhZmM0YWUtZDk2Mi00NTI2LTk0MzItNjY0NTFiMTZjZjIyIiwic2lkIjoiNjE4Y2Y0NGUtY2Q1Ny00MjM3LWJkNDYtZDhhY2JkOGU0YjE5In0.uzsqTaDk7q6kaVRBNsMUP4CJySqHVo5QiZSltTASCt4",
  "access_expires_at": "2026-10-28T10:53:08.725091065Z",
  "refresh_token": "haiXJOZJ0izCAjo7SoVN6kfSI_00ZWEnlKsfqjcwZjs",
  "refresh_expires_at": "2026-10-28T22:38:08.724345979Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688362038",
  "device_ref": "sandbox-17840"
}
```

```json
{
  "challenge_id": "4aa82680-2397-4d64-a77e-ede8a25d1bbe",
  "expires_at": "2026-10-28T10:43:08.97756315Z",
  "resend_available_at": "2026-10-28T10:38:09.97756315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688362038` → **200**

```json
{
  "phone": "+380688362038",
  "audience": "CLIENT",
  "code": "646461",
  "sent_at": "2026-10-28T10:38:08.97981644Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4aa82680-2397-4d64-a77e-ede8a25d1bbe",
  "code": "646461",
  "device_ref": "sandbox-17840"
}
```

```json
{
  "session_id": "b8446ec1-9caa-435c-807d-302d50a15491",
  "subject": {
    "type": "CLIENT",
    "id": "55dbbb9b-b63e-44c9-8b86-4dd7021910a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWRiYmI5Yi1iNjNlLTQ0YzktOGI4Ni00ZGQ3MDIxOTEwYTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Nzg5LCJpYXQiOjE3OTMxODM4ODksImp0aSI6IjRhMmExMzJkLWJjNjQtNDA5Ny1hZDFlLTU2NWI4MzhkY2FiZCIsInNpZCI6ImI4NDQ2ZWMxLTljYWEtNDM1Yy04MDdkLTMwMmQ1MGExNTQ5MSJ9.0PwcjDp8GUAqKqhFu6IJGD1W-Qklhz-QKWClaov6q6s",
  "access_expires_at": "2026-10-28T10:53:09.250754071Z",
  "refresh_token": "pGIT6DUImypBHjVOwtG5wz0HHrH_3Sd-asEejFIyibE",
  "refresh_expires_at": "2026-11-27T10:38:09.250115183Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "462f3b76-1f5e-4602-a836-1db97c51a6ff",
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
  "id": "9d0dfa88-12aa-4ddb-b9aa-8fa0b9a162ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:09.509779Z",
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
  "command_id": "9cb99872-5f4f-4cf6-9002-59a7b3f75275",
  "quote_id": "9d0dfa88-12aa-4ddb-b9aa-8fa0b9a162ef",
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
  "id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55dbbb9b-b63e-44c9-8b86-4dd7021910a7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:09.778293Z",
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
    "id": "d455e6a9-ad97-464b-9e5e-046dc304e8bd",
    "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
    "expires_at": "2026-10-28T10:38:24.781737Z",
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

`POST /api/driver/v1/offers/d455e6a9-ad97-464b-9e5e-046dc304e8bd/reject` → **204**

```json
{
  "command_id": "878b01c7-9726-4510-8766-0eeba5d302e3"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "acf35138-96d1-433e-861c-2c855cf981fa",
    "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
    "expires_at": "2026-10-28T10:38:25.311327Z",
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

`POST /api/driver/v1/offers/acf35138-96d1-433e-861c-2c855cf981fa/accept` → **200**

```json
{
  "command_id": "67fd2d92-0868-42a4-bde6-2b4401161b68"
}
```

```json
{
  "id": "fbee0874-518b-47ac-bf11-9f26a4575946",
  "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "58cf8442-6b04-4505-943b-8ea880804f18",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/1fe956e2-4dd4-470b-b40e-7425e56dc133/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:38:09.778857Z",
      "actor": {
        "type": "CLIENT",
        "id": "55dbbb9b-b63e-44c9-8b86-4dd7021910a7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
        "quote_id": "9d0dfa88-12aa-4ddb-b9aa-8fa0b9a162ef",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "385cd9ea-e234-459e-9aef-f2e6050f8cad"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:38:09.780824Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
        "attempt_id": "7895a50c-c81e-4a35-b47d-cf3d788aac59",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "385cd9ea-e234-459e-9aef-f2e6050f8cad"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:38:09.787629Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d455e6a9-ad97-464b-9e5e-046dc304e8bd",
        "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "385cd9ea-e234-459e-9aef-f2e6050f8cad"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:38:10.310072Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d455e6a9-ad97-464b-9e5e-046dc304e8bd",
        "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133"
      },
      "correlation_id": "0f6160c1-960b-497b-9095-9960b06dafea"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 1fe956e2-4dd4-470b-b40e-7425e56dc133 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/1fe956e2-4dd4-470b-b40e-7425e56dc133` → **200**

```json
{
  "id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "55dbbb9b-b63e-44c9-8b86-4dd7021910a7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "fbee0874-518b-47ac-bf11-9f26a4575946",
    "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "58cf8442-6b04-4505-943b-8ea880804f18",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:38:09.778293Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1fe956e2-4dd4-470b-b40e-7425e56dc133/cancel` → **200**

```json
{
  "command_id": "7440646f-a1c9-4cbe-8716-4b4c120f6605",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "55dbbb9b-b63e-44c9-8b86-4dd7021910a7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "fbee0874-518b-47ac-bf11-9f26a4575946",
    "order_id": "1fe956e2-4dd4-470b-b40e-7425e56dc133",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "58cf8442-6b04-4505-943b-8ea880804f18",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:38:09.778293Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "session_id": "8eed6246-01fa-4195-86b7-e4c9b74ccb34",
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
  "last_heartbeat_at": "2026-10-28T10:38:06.312873Z",
  "last_location_at": "2026-10-28T10:38:06.312873Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8eed6246-01fa-4195-86b7-e4c9b74ccb34/close` → **200**

```json
{
  "command_id": "47bb7ca4-ff8c-44a5-99f5-92ba8554386e",
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
  "session_id": "fb6eed08-a945-4ccb-bd63-0ad8d3ec73de",
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
  "last_heartbeat_at": "2026-10-28T10:38:07.63803Z",
  "last_location_at": "2026-10-28T10:38:07.63803Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fb6eed08-a945-4ccb-bd63-0ad8d3ec73de/close` → **200**

```json
{
  "command_id": "4e57e1c8-d418-4434-a41d-a75be8a9536d",
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
  "device_ref": "sandbox-28445"
}
```

```json
{
  "challenge_id": "eedc5caf-1aa0-4fd7-ac65-921ded18913f",
  "expires_at": "2026-10-28T10:43:13.027865967Z",
  "resend_available_at": "2026-10-28T10:38:14.027865967Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "634790",
  "sent_at": "2026-10-28T10:38:13.030191028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eedc5caf-1aa0-4fd7-ac65-921ded18913f",
  "code": "634790",
  "device_ref": "sandbox-28445"
}
```

```json
{
  "session_id": "841b91f8-8abe-4cc5-9612-6f3edd598a34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDc5MywiaWF0IjoxNzkzMTgzODkzLCJqdGkiOiIzZDA4NDJjOS1jNWMyLTQzMjgtYjE4Ni1kYjFkMTYzNDY4ZWEiLCJzaWQiOiI4NDFiOTFmOC04YWJlLTRjYzUtOTYxMi02ZjNlZGQ1OThhMzQifQ.9NRsPYtXCtzs8Hoftu4ADeEva9m30ANb59m5lCjzk_o",
  "access_expires_at": "2026-10-28T10:53:13.306782465Z",
  "refresh_token": "rUn-cAJ973yLwjhAyR94O2raQGCj8i5VbJQn49rqgzE",
  "refresh_expires_at": "2026-11-27T10:38:13.3061288Z",
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
  "command_id": "9ae428ff-e44e-430f-96bd-2ea86cb09dd3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:13Z",
    "sequence": 1793183893802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:13.819829Z",
  "last_location_at": "2026-10-28T10:38:13.819829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672254655",
  "device_ref": "sandbox-27315"
}
```

```json
{
  "challenge_id": "c960c2f0-1b39-4c3f-bf6b-65e605ca5cde",
  "expires_at": "2026-10-28T10:43:14.080148861Z",
  "resend_available_at": "2026-10-28T10:38:15.080148861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672254655` → **200**

```json
{
  "phone": "+380672254655",
  "audience": "CLIENT",
  "code": "745913",
  "sent_at": "2026-10-28T10:38:14.082204332Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c960c2f0-1b39-4c3f-bf6b-65e605ca5cde",
  "code": "745913",
  "device_ref": "sandbox-27315"
}
```

```json
{
  "session_id": "79f844cb-d79d-400d-ad5a-0e13a6556d30",
  "subject": {
    "type": "CLIENT",
    "id": "2b5309ea-6edc-4a84-ac8b-ab087fc48e06"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYjUzMDllYS02ZWRjLTRhODQtYWM4Yi1hYjA4N2ZjNDhlMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0Nzk0LCJpYXQiOjE3OTMxODM4OTQsImp0aSI6ImIzOTI5NjkwLWNjNzQtNGIxYy1hOGI3LTQzNDMxZWRiNzE4YiIsInNpZCI6Ijc5Zjg0NGNiLWQ3OWQtNDAwZC1hZDVhLTBlMTNhNjU1NmQzMCJ9.tVzZMpiz59EBJola9PGqgcr3IDE2W_SFHPsbT9ZrcX8",
  "access_expires_at": "2026-10-28T10:53:14.354966735Z",
  "refresh_token": "7wPZZoWtDC7KuccOohh3WWW7Z71moQsQXY50XVBYeVA",
  "refresh_expires_at": "2026-11-27T10:38:14.354220147Z",
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
  "command_id": "b1d4194f-9d29-4be6-a442-8e48a8caa772",
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
  "id": "22cb4093-ac85-4478-be2d-ef639aeb4e5f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:14.861537Z",
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
  "command_id": "f3c5d849-d8f0-49e1-af31-2d0a81ac5c8e",
  "platform": "ANDROID",
  "token": "sandbox-driver-0f81f30c-b762-41d4-a408-c50f500a5ce0"
}
```

```json
{
  "id": "31e64506-5195-4e56-9fa6-86817f1e14f2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:38:15.131394Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ec51ac2f-9876-4fef-b223-4ea9b6190ed2",
  "platform": "ANDROID",
  "token": "sandbox-rider-d597fbbd-86f6-4306-8a20-84d61bdba5d7"
}
```

```json
{
  "id": "c3495183-7a1f-4e00-a19e-ba7f07966636",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:38:15.410429Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4d49f6ee-90f0-4de2-a06d-78cfd342f2c0",
  "quote_id": "22cb4093-ac85-4478-be2d-ef639aeb4e5f",
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
  "id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2b5309ea-6edc-4a84-ac8b-ab087fc48e06",
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
  "created_at": "2026-10-28T10:38:15.681425Z",
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
    "id": "43720e1d-3e6c-46b0-bf31-babbcb8765bb",
    "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
    "expires_at": "2026-10-28T10:38:30.68461Z",
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

`POST /api/driver/v1/offers/43720e1d-3e6c-46b0-bf31-babbcb8765bb/accept` → **200**

```json
{
  "command_id": "b1c9b30a-4ce4-4d3c-81e0-4e3a9db9d6b0"
}
```

```json
{
  "id": "8c68296f-17e0-45f8-b150-203ec4fbfaa1",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "68d2f38f-ce1d-4219-9606-50556a583646",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:38:15.657Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:38:15.657Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:38:17.082300067Z",
    "token_suffix": "0a5ce0",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
      "order_version": "2",
      "event_id": "2fa9038e-40f5-49b8-8fc7-2241134fd8d2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672254655&after=2026-10-28T10:38:15.657Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:38:17.084389102Z",
    "token_suffix": "dba5d7",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
      "order_version": "3",
      "event_id": "29a38ac2-9b48-4825-9962-56037ab1eaf9"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/e78e207b-78e0-45c6-afef-acdef9ea77d2/messages` → **201**

```json
{
  "command_id": "922776ab-39a6-4b52-89f5-4322b25cf349",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "84ce0ce6-ad40-4f9f-bf10-d983384a63f6",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:38:17.551213892Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "68d2f38f-ce1d-4219-9606-50556a583646",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "assignment_id": "8c68296f-17e0-45f8-b150-203ec4fbfaa1",
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

`POST /api/driver/v1/trips/68d2f38f-ce1d-4219-9606-50556a583646/messages` → **201**

```json
{
  "command_id": "05865627-2121-4ccd-a79b-629d59c09ace",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "dc107533-4b85-4715-bd44-d9e4cb7d019f",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:38:18.052673854Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/e78e207b-78e0-45c6-afef-acdef9ea77d2/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/68d2f38f-ce1d-4219-9606-50556a583646/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672254655"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:18Z",
    "sequence": 1793183898797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:18.816319Z",
  "last_location_at": "2026-10-28T10:38:18.816319Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "68d2f38f-ce1d-4219-9606-50556a583646",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "assignment_id": "8c68296f-17e0-45f8-b150-203ec4fbfaa1",
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

`POST /api/driver/v1/trips/68d2f38f-ce1d-4219-9606-50556a583646/arrive` → **200**

```json
{
  "command_id": "f802011e-b535-4171-bba2-3a9494e4dbd1",
  "expected_version": 0
}
```

```json
{
  "id": "68d2f38f-ce1d-4219-9606-50556a583646",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "assignment_id": "8c68296f-17e0-45f8-b150-203ec4fbfaa1",
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
  "arrived_at": "2026-10-28T10:38:19.325339Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/68d2f38f-ce1d-4219-9606-50556a583646/start` → **200**

```json
{
  "command_id": "b667292c-fdab-4ee0-898d-8d2a4f7da6ca",
  "expected_version": 1
}
```

```json
{
  "id": "68d2f38f-ce1d-4219-9606-50556a583646",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "assignment_id": "8c68296f-17e0-45f8-b150-203ec4fbfaa1",
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
  "arrived_at": "2026-10-28T10:38:19.325339Z",
  "started_at": "2026-10-28T10:38:19.599178Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:19Z",
    "sequence": 1793183899852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:19.871569Z",
  "last_location_at": "2026-10-28T10:38:19.871569Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/68d2f38f-ce1d-4219-9606-50556a583646/complete` → **200**

```json
{
  "command_id": "f3f2d45e-b7e6-41bc-a1a8-711fa98611aa",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:38:20Z",
  "cash_received": true
}
```

```json
{
  "id": "68d2f38f-ce1d-4219-9606-50556a583646",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "assignment_id": "8c68296f-17e0-45f8-b150-203ec4fbfaa1",
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
  "arrived_at": "2026-10-28T10:38:19.325339Z",
  "started_at": "2026-10-28T10:38:19.599178Z",
  "completed_at": "2026-10-28T10:38:20.135096Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/e78e207b-78e0-45c6-afef-acdef9ea77d2` → **200**

```json
{
  "id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2b5309ea-6edc-4a84-ac8b-ab087fc48e06",
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
    "id": "8c68296f-17e0-45f8-b150-203ec4fbfaa1",
    "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "68d2f38f-ce1d-4219-9606-50556a583646",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:38:15.681425Z",
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
    "id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:38:15.681425Z",
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
    "id": "68d2f38f-ce1d-4219-9606-50556a583646",
    "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:38:16.205792Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "87d43911-d927-451e-8fff-7fd78b1efa61",
    "order_id": "68ecfcb3-cd7c-44dc-bb8d-7182e08503dc",
    "order_short_number": 1,
    "created_at": "2026-10-28T10:36:57.058133Z",
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

`GET /api/rider/v1/orders/e78e207b-78e0-45c6-afef-acdef9ea77d2/tip` → **200**

```json
{
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
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
  "available_until": "2026-10-29T10:38:20.135096Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e78e207b-78e0-45c6-afef-acdef9ea77d2/tip` → **201**

```json
{
  "command_id": "48976cd9-40e9-41fa-b0ed-746525c75ce5",
  "amount_minor": 1100
}
```

```json
{
  "id": "4b6401c9-a3ed-4f8f-9d61-3ebb4ad50662",
  "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:38:24.95375Z"
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
  "session_id": "b2cd5975-1ce4-4cad-92ff-e97790dc9687",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MDUsImlhdCI6MTc5MzE4MzkwNSwianRpIjoiNWU2MTRmZDAtODI5NC00MGI2LTg1ZDAtYWI4Y2IzMzhkMWZlIiwic2lkIjoiYjJjZDU5NzUtMWNlNC00Y2FkLTkyZmYtZTk3NzkwZGM5Njg3In0.gAdmwS-BoaouzItCS_W0HqnPWhfahz1TFkDrUCoiLd8",
  "access_expires_at": "2026-10-28T10:53:25.509772092Z",
  "refresh_token": "dClHkCWMoPc4I_SysK5OthU00F8WS9vPrYn-B9IOYEI",
  "refresh_expires_at": "2026-10-28T22:38:25.509207637Z",
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
          "STAFF": 1,
          "RIDER": 2
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
      "STAFF": 1,
      "RIDER": 2
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
  "generated_at": "2026-10-28T10:38:25.767615477Z"
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
  "generated_at": "2026-10-28T10:38:26.029009256Z"
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
  "session_id": "cc53e2e6-426e-419a-bafa-c7928d6970ed",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MDYsImlhdCI6MTc5MzE4MzkwNiwianRpIjoiNjYyYTliMmItMGExZi00NDRlLWI2ZGUtZDQxNzNmOWMwYzExIiwic2lkIjoiY2M1M2UyZTYtNDI2ZS00MTlhLWJhZmEtYzc5MjhkNjk3MGVkIn0.qYE-Y3QvztJWL1B6p4n407At3kZJspzHjAlNJrK2IHg",
  "access_expires_at": "2026-10-28T10:53:26.581577916Z",
  "refresh_token": "ogyeKCVz_LQGnzYOd9-q7dZ0ADOkeKOqdJi6rDwikEo",
  "refresh_expires_at": "2026-10-28T22:38:26.580978465Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e78e207b-78e0-45c6-afef-acdef9ea77d2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:38:15.681929Z",
      "actor": {
        "type": "CLIENT",
        "id": "2b5309ea-6edc-4a84-ac8b-ab087fc48e06",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
        "quote_id": "22cb4093-ac85-4478-be2d-ef639aeb4e5f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "234d9caa-ce97-458e-94e8-318a24b4c339"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:38:15.683752Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
        "attempt_id": "d34473cd-7d30-48f0-8b7b-8bebd4142beb",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "234d9caa-ce97-458e-94e8-318a24b4c339"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:38:15.690252Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "43720e1d-3e6c-46b0-bf31-babbcb8765bb",
        "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "234d9caa-ce97-458e-94e8-318a24b4c339"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:38:16.208138Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "43720e1d-3e6c-46b0-bf31-babbcb8765bb",
        "order_id": "e78e207b-78e0-45c6-afef-acdef9ea77d2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8c68296f-17e0-45f8-b150-203ec4fbfaa1"
      },
      "correlation_id": "ef7e3b94-321c-4bf8-a5d7-d355eabc003b"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:38:27.09610478Z",
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
      "last_location_at": "2026-10-28T10:38:19.871569Z",
      "order_id": null
    }
  ]
}
```

Done: order e78e207b-78e0-45c6-afef-acdef9ea77d2.

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
  "session_id": "c76e6cd7-5d52-48e0-a649-c8d1d716c764",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MDcsImlhdCI6MTc5MzE4MzkwNywianRpIjoiZTU3NDc1NGUtNGU1Ny00NDJlLWI0MTYtOTk2NTgzYmM2NWRhIiwic2lkIjoiYzc2ZTZjZDctNWQ1Mi00OGUwLWE2NDktYzhkMWQ3MTZjNzY0In0.3akqa0lbRWcmuwthmRECt0OWx6wOpYkfmBHBU0puZJ0",
  "access_expires_at": "2026-10-28T10:53:27.661669563Z",
  "refresh_token": "rKzS2WjJo_1--R2Pug8HNestzW5zDGfRgYdSPg6rUtg",
  "refresh_expires_at": "2026-10-28T22:38:27.661092044Z",
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
  "command_id": "305315a2-ec1e-4341-8711-b3845506d130",
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
  "timestamp": "2026-10-28T10:38:28.000+0000",
  "channel": {
    "id": "1730052000.16303045",
    "linkedid": "1730052000.16303045",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677272026"
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
  "timestamp": "2026-10-28T10:38:28.000+0000",
  "channel": {
    "id": "1730052000.16303045",
    "linkedid": "1730052000.16303045",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677272026"
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
  "session_id": "67c86a09-d4c6-4c5e-9352-2f0719a76dc7",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MDgsImlhdCI6MTc5MzE4MzkwOCwianRpIjoiZDMzYzk3MWEtOTg1MS00ZGFkLWE3NzMtOTUxODgwMDc5ZGNhIiwic2lkIjoiNjdjODZhMDktZDRjNi00YzVlLTkzNTItMmYwNzE5YTc2ZGM3In0._rTuvVzFj3f5wBsHdVaYyR5W02D8S0_3pK0l7a1_QSQ",
  "access_expires_at": "2026-10-28T10:53:28.7642227Z",
  "refresh_token": "5MbtZqG_dpi4gK0Omjet2xaPdDuaxyDnLYXeb55rCSs",
  "refresh_expires_at": "2026-10-28T22:38:28.763608172Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "8da0a709-db2e-4718-8b30-fab759599321",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677272026",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:38:28Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/8da0a709-db2e-4718-8b30-fab759599321/answer` → **200**

```json
{
  "command_id": "8b722d88-5bdf-42d3-85d6-10cf124ebce2"
}
```

```json
{
  "id": "8da0a709-db2e-4718-8b30-fab759599321",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677272026",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "order_ids": [],
  "started_at": "2026-10-28T10:38:28Z",
  "answered_at": "2026-10-28T10:38:29.284713Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.16303045",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "da85f61b-9cd0-4f3d-be92-572da76adc21",
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
  "id": "2db0b746-c1a0-408e-8ac2-808cda1958ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:29.577079Z",
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
  "command_id": "b4388142-5db8-4106-8be6-e30b1fae71a5",
  "quote_id": "2db0b746-c1a0-408e-8ac2-808cda1958ea",
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
    "phone": "+380677272026"
  },
  "call_id": "8da0a709-db2e-4718-8b30-fab759599321"
}
```

```json
{
  "id": "da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0",
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
  "created_at": "2026-10-28T10:38:29.856617Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677272026"
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
    "id": "1730052000.16303045",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8da0a709-db2e-4718-8b30-fab759599321",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677272026",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [
        "da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0"
      ],
      "started_at": "2026-10-28T10:38:28Z",
      "answered_at": "2026-10-28T10:38:29.284713Z",
      "ended_at": "2026-10-28T10:38:30.147263Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "bcf7a79c-3652-4632-b395-632efc5c6e8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678474385",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [],
      "started_at": "2026-10-28T10:37:04.801742Z",
      "answered_at": "2026-10-28T10:37:05.103731Z",
      "ended_at": "2026-10-28T10:37:05.387273Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:37:11.851761Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0` → **200**

```json
{
  "id": "da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0",
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
  "created_at": "2026-10-28T10:38:29.856617Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677272026"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0` → **200**

```json
{
  "id": "da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0",
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
  "created_at": "2026-10-28T10:38:29.856617Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677272026"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0/cancel` → **200**

```json
{
  "command_id": "6615b7f7-2b01-4c16-a44b-8d60ae4b639b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0",
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
  "created_at": "2026-10-28T10:38:29.856617Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677272026"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 8da0a709-db2e-4718-8b30-fab759599321 with order da150eaa-cfe3-4b9c-8f08-f6abcc31f3c0.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13145"
}
```

```json
{
  "challenge_id": "9eedfd2d-fc6e-42bd-afc8-e41d410f60c0",
  "expires_at": "2026-10-28T10:43:31.256146064Z",
  "resend_available_at": "2026-10-28T10:38:32.256146064Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "303868",
  "sent_at": "2026-10-28T10:38:31.258403511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9eedfd2d-fc6e-42bd-afc8-e41d410f60c0",
  "code": "303868",
  "device_ref": "sandbox-13145"
}
```

```json
{
  "session_id": "fae7a873-04b2-46fd-a548-390d44031fb6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDgxMSwiaWF0IjoxNzkzMTgzOTExLCJqdGkiOiI2OGNkNTQ5Yi02MDg1LTQ2NGUtOTcwYS0xOGU0ZmMyNTc1MjciLCJzaWQiOiJmYWU3YTg3My0wNGIyLTQ2ZmQtYTU0OC0zOTBkNDQwMzFmYjYifQ.sRIiYQkh997R025TVD3EZo3EwzXd6YxtioGttQR8pI0",
  "access_expires_at": "2026-10-28T10:53:31.529546511Z",
  "refresh_token": "nnY5eS_4gZlw2gpN8wSNiPhYAZqfwiEYKD6pYBg9Tww",
  "refresh_expires_at": "2026-11-27T10:38:31.52901614Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:19.871569Z",
  "last_location_at": "2026-10-28T10:38:19.871569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/handover` → **200**

```json
{
  "command_id": "2417a4af-266a-4b55-a72a-c076b24d9255",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:19.871569Z",
  "last_location_at": "2026-10-28T10:38:19.871569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:32Z",
    "sequence": 1793183912315
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:32.334257Z",
  "last_location_at": "2026-10-28T10:38:32.334257Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663235657",
  "device_ref": "sandbox-9933"
}
```

```json
{
  "challenge_id": "d7f25c53-3420-4cd2-ad95-17b8283af8e4",
  "expires_at": "2026-10-28T10:43:32.581106336Z",
  "resend_available_at": "2026-10-28T10:38:33.581106336Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663235657` → **200**

```json
{
  "phone": "+380663235657",
  "audience": "CLIENT",
  "code": "058054",
  "sent_at": "2026-10-28T10:38:32.583443154Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7f25c53-3420-4cd2-ad95-17b8283af8e4",
  "code": "058054",
  "device_ref": "sandbox-9933"
}
```

```json
{
  "session_id": "39dfec9a-d772-4100-8027-1f520f8e22a9",
  "subject": {
    "type": "CLIENT",
    "id": "88b97535-6fbc-4c29-8df2-32b5b7e44339"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGI5NzUzNS02ZmJjLTRjMjktOGRmMi0zMmI1YjdlNDQzMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0ODEyLCJpYXQiOjE3OTMxODM5MTIsImp0aSI6IjM2MTZkMzhlLTVlY2MtNGE4Ni1iYWYyLTVlMzBmNDVjNWViZiIsInNpZCI6IjM5ZGZlYzlhLWQ3NzItNDEwMC04MDI3LTFmNTIwZjhlMjJhOSJ9.F0_-mKdyBk2n89DMq51M-2ivcORG8MahuPYaQ0Mm3sQ",
  "access_expires_at": "2026-10-28T10:53:32.865972731Z",
  "refresh_token": "WZM6T7myrTF5UFN_-X8gmb6NE24nbgGvB_rgsqC9s-4",
  "refresh_expires_at": "2026-11-27T10:38:32.865336456Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28aec9d9-810c-45b0-b082-ca2009473afd",
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
  "id": "9bbcda30-8a77-464a-88e2-d02b5bb18927",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:33.128578Z",
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
  "command_id": "a9943d20-6d53-4950-bedd-eb48f789e35d",
  "quote_id": "9bbcda30-8a77-464a-88e2-d02b5bb18927",
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
  "id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "88b97535-6fbc-4c29-8df2-32b5b7e44339",
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
  "created_at": "2026-10-28T10:38:33.399063Z",
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
    "id": "97e16b23-2c1e-4954-a51b-f7f5aa7eeee2",
    "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
    "expires_at": "2026-10-28T10:38:48.402905Z",
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

`POST /api/driver/v1/offers/97e16b23-2c1e-4954-a51b-f7f5aa7eeee2/accept` → **200**

```json
{
  "command_id": "0a1093a4-2e39-4f37-a6a4-c24adeeb265e"
}
```

```json
{
  "id": "fd782b8d-f8bd-414b-a521-15c4b361fdb7",
  "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e2a5e9c-d066-4b4d-ae83-e9e8a0833f0b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e2a5e9c-d066-4b4d-ae83-e9e8a0833f0b",
  "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
  "assignment_id": "fd782b8d-f8bd-414b-a521-15c4b361fdb7",
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

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:34Z",
    "sequence": 1793183914422
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:34.441158Z",
  "last_location_at": "2026-10-28T10:38:34.441158Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9e2a5e9c-d066-4b4d-ae83-e9e8a0833f0b/arrive` → **200**

```json
{
  "command_id": "ed3f8c39-14ed-4fae-96f5-760bbbadc57b",
  "expected_version": 0
}
```

```json
{
  "id": "9e2a5e9c-d066-4b4d-ae83-e9e8a0833f0b",
  "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
  "assignment_id": "fd782b8d-f8bd-414b-a521-15c4b361fdb7",
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
  "arrived_at": "2026-10-28T10:38:34.714556Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e2a5e9c-d066-4b4d-ae83-e9e8a0833f0b/start` → **200**

```json
{
  "command_id": "e7aa1520-06b1-489a-9928-c25c9da17c21",
  "expected_version": 1
}
```

```json
{
  "id": "9e2a5e9c-d066-4b4d-ae83-e9e8a0833f0b",
  "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
  "assignment_id": "fd782b8d-f8bd-414b-a521-15c4b361fdb7",
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
  "arrived_at": "2026-10-28T10:38:34.714556Z",
  "started_at": "2026-10-28T10:38:34.97886Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:35Z",
    "sequence": 1793183915238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:35.256886Z",
  "last_location_at": "2026-10-28T10:38:35.256886Z",
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
  "device_ref": "sandbox-7413"
}
```

```json
{
  "challenge_id": "c97505b7-f968-4849-84a8-3a788f97278b",
  "expires_at": "2026-10-28T10:43:35.510287628Z",
  "resend_available_at": "2026-10-28T10:38:36.510287628Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "462652",
  "sent_at": "2026-10-28T10:38:35.512667249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c97505b7-f968-4849-84a8-3a788f97278b",
  "code": "462652",
  "device_ref": "sandbox-7413"
}
```

```json
{
  "session_id": "6c42a432-4268-40d0-9e65-06e964e1f62d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDgxNSwiaWF0IjoxNzkzMTgzOTE1LCJqdGkiOiJmZThlNmNiNi03NjE3LTQ3OTYtYTU4Mi04NTBkYmY5ZTExNTkiLCJzaWQiOiI2YzQyYTQzMi00MjY4LTQwZDAtOWU2NS0wNmU5NjRlMWY2MmQifQ.nBvg-RmR5eLCOERfaQcPbIi4t1Em1nFpxXqQkkhkkME",
  "access_expires_at": "2026-10-28T10:53:35.789568725Z",
  "refresh_token": "psjRuTD86nMZZZch0O_sLCwqxk0fcsOJbU0bfbS2g8I",
  "refresh_expires_at": "2026-11-27T10:38:35.788999392Z",
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
  "command_id": "cf8d950b-6d96-473d-a064-744d8ab5956a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:36Z",
    "sequence": 1793183916291
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e91f25d9-7a17-40fc-83d6-7351ef08cc43",
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
  "last_heartbeat_at": "2026-10-28T10:38:36.308898Z",
  "last_location_at": "2026-10-28T10:38:36.308898Z",
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
  "session_id": "d2a99256-64ba-4136-b2e4-ae2353abdbba",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MTYsImlhdCI6MTc5MzE4MzkxNiwianRpIjoiZjBhYjNhNjEtNWRiNS00ZmM1LTg3OWQtOGNmMzVlYTlkMWI1Iiwic2lkIjoiZDJhOTkyNTYtNjRiYS00MTM2LWIyZTQtYWUyMzUzYWJkYmJhIn0.5UJjgvclfo4wSxt2XXSKkSCQyZ22GDGk8V9UC9c_3fw",
  "access_expires_at": "2026-10-28T10:53:36.86931754Z",
  "refresh_token": "oSYwoOlKxfumQr5j0kZ8PBODwSbd5AdryMG_QbkqfkE",
  "refresh_expires_at": "2026-10-28T22:38:36.868737424Z",
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
  "session_id": "e4eabea5-50d6-4e0a-84f8-44c7ccdc7625",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MTcsImlhdCI6MTc5MzE4MzkxNywianRpIjoiMWFjMTlhYzctOWRiZC00OTVhLWIwMTktOWYxNDUyMDM2NzliIiwic2lkIjoiZTRlYWJlYTUtNTBkNi00ZTBhLTg0ZjgtNDRjN2NjZGM3NjI1In0.5PkdU0hjS7fj20ZxhuPokfqBCgt7G_YYQ33VMLg5Jtw",
  "access_expires_at": "2026-10-28T10:53:37.417143107Z",
  "refresh_token": "Cj_Kumuv95PkjV7-N8f8wAKLa-mOtXWMrm3_Bq3PkFM",
  "refresh_expires_at": "2026-10-28T22:38:37.41657734Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1` → **200**

```json
{
  "id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "88b97535-6fbc-4c29-8df2-32b5b7e44339",
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
    "id": "fd782b8d-f8bd-414b-a521-15c4b361fdb7",
    "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9e2a5e9c-d066-4b4d-ae83-e9e8a0833f0b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T10:38:33.399063Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1/interrupt` → **200**

```json
{
  "command_id": "9ad1799f-ea5d-404b-b5a8-7f7379ed0eaf",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "88b97535-6fbc-4c29-8df2-32b5b7e44339",
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
      "id": "fd782b8d-f8bd-414b-a521-15c4b361fdb7",
      "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9e2a5e9c-d066-4b4d-ae83-e9e8a0833f0b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T10:38:33.399063Z",
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
    "id": "03a22bc5-8a8d-4fca-ad1b-441f0923f492",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "88b97535-6fbc-4c29-8df2-32b5b7e44339",
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
    "id": "367f5cab-9b5a-42ae-8494-dc5d417dc7c9",
    "order_id": "03a22bc5-8a8d-4fca-ad1b-441f0923f492",
    "expires_at": "2026-10-28T10:38:52.961793Z",
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

`POST /api/driver/v1/offers/367f5cab-9b5a-42ae-8494-dc5d417dc7c9/accept` → **200**

```json
{
  "command_id": "8e36ad2d-61a3-4385-94db-a684dd3c4db5"
}
```

```json
{
  "id": "3bf9f24f-e838-477e-a762-ee0a2aae7766",
  "order_id": "03a22bc5-8a8d-4fca-ad1b-441f0923f492",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3357bafa-6e9f-4ff8-bfc4-615c54984b84",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3357bafa-6e9f-4ff8-bfc4-615c54984b84",
  "order_id": "03a22bc5-8a8d-4fca-ad1b-441f0923f492",
  "assignment_id": "3bf9f24f-e838-477e-a762-ee0a2aae7766",
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
  "session_id": "e91f25d9-7a17-40fc-83d6-7351ef08cc43",
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
  "last_heartbeat_at": "2026-10-28T10:38:36.308898Z",
  "last_location_at": "2026-10-28T10:38:36.308898Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/e91f25d9-7a17-40fc-83d6-7351ef08cc43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:39Z",
    "sequence": 1793183919270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e91f25d9-7a17-40fc-83d6-7351ef08cc43",
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
  "last_heartbeat_at": "2026-10-28T10:38:39.288841Z",
  "last_location_at": "2026-10-28T10:38:39.288841Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3357bafa-6e9f-4ff8-bfc4-615c54984b84/arrive` → **200**

```json
{
  "command_id": "bd5e9540-93a5-47e8-81e0-9880fe1eda37",
  "expected_version": 0
}
```

```json
{
  "id": "3357bafa-6e9f-4ff8-bfc4-615c54984b84",
  "order_id": "03a22bc5-8a8d-4fca-ad1b-441f0923f492",
  "assignment_id": "3bf9f24f-e838-477e-a762-ee0a2aae7766",
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
  "arrived_at": "2026-10-28T10:38:39.546891Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3357bafa-6e9f-4ff8-bfc4-615c54984b84/start` → **200**

```json
{
  "command_id": "2ed0055c-de9b-4132-89e6-4149d771836b",
  "expected_version": 1
}
```

```json
{
  "id": "3357bafa-6e9f-4ff8-bfc4-615c54984b84",
  "order_id": "03a22bc5-8a8d-4fca-ad1b-441f0923f492",
  "assignment_id": "3bf9f24f-e838-477e-a762-ee0a2aae7766",
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
  "arrived_at": "2026-10-28T10:38:39.546891Z",
  "started_at": "2026-10-28T10:38:39.813375Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3357bafa-6e9f-4ff8-bfc4-615c54984b84/complete` → **200**

```json
{
  "command_id": "5c6b8bc3-d909-48c3-aad4-824c817c3e0b",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:38:40Z"
}
```

```json
{
  "id": "3357bafa-6e9f-4ff8-bfc4-615c54984b84",
  "order_id": "03a22bc5-8a8d-4fca-ad1b-441f0923f492",
  "assignment_id": "3bf9f24f-e838-477e-a762-ee0a2aae7766",
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
  "arrived_at": "2026-10-28T10:38:39.546891Z",
  "started_at": "2026-10-28T10:38:39.813375Z",
  "completed_at": "2026-10-28T10:38:40.083243Z",
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
    "id": "03a22bc5-8a8d-4fca-ad1b-441f0923f492",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:38:37.952388Z",
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
    "id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:38:33.399063Z",
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

`GET /api/operator/v1/orders/6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:38:33.399697Z",
      "actor": {
        "type": "CLIENT",
        "id": "88b97535-6fbc-4c29-8df2-32b5b7e44339",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
        "quote_id": "9bbcda30-8a77-464a-88e2-d02b5bb18927",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "281f3bab-5cb5-4c97-97ae-4f91384757d9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:38:33.401922Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
        "attempt_id": "4290e0d0-4703-4f33-a3a8-541de2d199a1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "281f3bab-5cb5-4c97-97ae-4f91384757d9"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:38:33.406551Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "97e16b23-2c1e-4954-a51b-f7f5aa7eeee2",
        "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "281f3bab-5cb5-4c97-97ae-4f91384757d9"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:38:33.922052Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "97e16b23-2c1e-4954-a51b-f7f5aa7eeee2",
        "order_id": "6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "fd782b8d-f8bd-414b-a521-15c4b361fdb7"
      },
      "correlation_id": "76c82fbd-ebf4-49a9-b26d-ab306972ae83"
```

Done: interrupted 6dbcbc1a-8e1c-4609-a38d-a2a775dd34a1, follow-up 03a22bc5-8a8d-4fca-ad1b-441f0923f492.

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
  "session_id": "43db3c9f-6087-4daf-9168-80dc681a1b69",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MjQsImlhdCI6MTc5MzE4MzkyNCwianRpIjoiZWY2Y2JiODMtYzExMS00MDFjLTg1ZGMtZDcyNmJlNDYxZmI4Iiwic2lkIjoiNDNkYjNjOWYtNjA4Ny00ZGFmLTkxNjgtODBkYzY4MWExYjY5In0.oGGVP8G9sXOlw4YoNQ1lf_zuV9qRuhkNAX-K4eO5wlM",
  "access_expires_at": "2026-10-28T10:53:44.415455083Z",
  "refresh_token": "2Ljd-j1TO-fu7-gCS5J-cDdmxCrpiO5s5kuNg8t3zK8",
  "refresh_expires_at": "2026-10-28T22:38:44.414755336Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "88fcd2f6-2e15-4501-a31c-8177ac9414b8",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:38:44Z"
}
```

```json
{
  "id": "1088b71b-080e-48d3-8e80-3ff0a36ab011",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:38:44Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/1088b71b-080e-48d3-8e80-3ff0a36ab011/publish` → **200**

```json
{
  "command_id": "9c8eb35c-44f3-4a05-a199-0dab9f6ed418",
  "expected_version": 0
}
```

```json
{
  "id": "1088b71b-080e-48d3-8e80-3ff0a36ab011",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:38:44.950612Z",
  "published_at": "2026-10-28T10:38:44.950612Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "1088b71b-080e-48d3-8e80-3ff0a36ab011",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:38:44.950612Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634541233",
  "device_ref": "sandbox-4203"
}
```

```json
{
  "challenge_id": "8e809585-de92-439a-8a49-53ac65686521",
  "expires_at": "2026-10-28T10:43:45.460159479Z",
  "resend_available_at": "2026-10-28T10:38:46.460159479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634541233` → **200**

```json
{
  "phone": "+380634541233",
  "audience": "CLIENT",
  "code": "862962",
  "sent_at": "2026-10-28T10:38:45.462497086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e809585-de92-439a-8a49-53ac65686521",
  "code": "862962",
  "device_ref": "sandbox-4203"
}
```

```json
{
  "session_id": "66aa8c88-c49b-44b1-b147-2555fb80b614",
  "subject": {
    "type": "CLIENT",
    "id": "8d690c38-e1ef-4b5c-82f5-9c822afb46ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZDY5MGMzOC1lMWVmLTRiNWMtODJmNS05YzgyMmFmYjQ2YWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0ODI1LCJpYXQiOjE3OTMxODM5MjUsImp0aSI6IjdjZjAyY2I5LTc0YTktNDQ2Ni05YTQ5LTAxMzhjMWMwYTM4ZCIsInNpZCI6IjY2YWE4Yzg4LWM0OWItNDRiMS1iMTQ3LTI1NTVmYjgwYjYxNCJ9.Qs9bVmB7hZDoe_K6p2_rrLrvEZXKng0XDI17SUJJkOg",
  "access_expires_at": "2026-10-28T10:53:45.749208237Z",
  "refresh_token": "MOl9YocPbofPi6UM_vZrUux1pnnrGcsIqoX3FIAHwz0",
  "refresh_expires_at": "2026-11-27T10:38:45.748534531Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "1088b71b-080e-48d3-8e80-3ff0a36ab011",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:38:44.950612Z",
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
  "command_id": "62ca3d17-0c6f-43f3-ad2d-8b2bdf612323",
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
  "id": "ffa33d15-4fe2-4be0-a888-1863ac84c54c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:46.265287Z",
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
  "command_id": "b6185472-4a20-47f2-9e38-f24ecdd75ed1",
  "quote_id": "ffa33d15-4fe2-4be0-a888-1863ac84c54c",
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
  "correlation_id": "1fce93f8-c844-422d-bdbf-94067702a824"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0221ab69-82f9-4575-b73f-f11b6fc7ade0",
  "version_id": "1088b71b-080e-48d3-8e80-3ff0a36ab011",
  "language": "uk"
}
```

```json
{
  "version_id": "1088b71b-080e-48d3-8e80-3ff0a36ab011",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:38:46.791305Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "19f49452-6626-4924-8e3b-7414cf4bd9eb",
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
  "id": "a65f51e1-6c5e-43fa-a337-ab868b6d2d76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:47.072365Z",
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
  "command_id": "633e7c5d-080e-4fe6-82a3-d19e2ee800ac",
  "quote_id": "a65f51e1-6c5e-43fa-a337-ab868b6d2d76",
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
  "id": "187aaf2b-e0ca-43bd-a617-12cea1908eda",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d690c38-e1ef-4b5c-82f5-9c822afb46ac",
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
  "created_at": "2026-10-28T10:38:47.340899Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/187aaf2b-e0ca-43bd-a617-12cea1908eda` → **200**

```json
{
  "id": "187aaf2b-e0ca-43bd-a617-12cea1908eda",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d690c38-e1ef-4b5c-82f5-9c822afb46ac",
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
  "created_at": "2026-10-28T10:38:47.340899Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/187aaf2b-e0ca-43bd-a617-12cea1908eda/cancel` → **200**

```json
{
  "command_id": "a3f4c08f-2c03-4cd2-a6c5-462970386cf9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "187aaf2b-e0ca-43bd-a617-12cea1908eda",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8d690c38-e1ef-4b5c-82f5-9c822afb46ac",
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
  "created_at": "2026-10-28T10:38:47.340899Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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

`POST /api/admin/v1/legal-documents/1088b71b-080e-48d3-8e80-3ff0a36ab011` → **409**

```json
{
  "command_id": "1642c820-9b3a-436f-bdd3-b227a1a10ed2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:38:48Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/1088b71b-080e-48d3-8e80-3ff0a36ab011",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "806800c0-567b-485b-a761-ce61957b707a"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "49a8f174-42f2-4a04-9444-b7c60b5a4634",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:38:48Z"
}
```

```json
{
  "id": "cdb8f4da-65b6-4f00-a2a6-b61be983bc7d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:38:48Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/cdb8f4da-65b6-4f00-a2a6-b61be983bc7d/publish` → **200**

```json
{
  "command_id": "0b130a17-9b64-4b09-9deb-b21c124431b3",
  "expected_version": 0
}
```

```json
{
  "id": "cdb8f4da-65b6-4f00-a2a6-b61be983bc7d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:38:48.699437Z",
  "published_at": "2026-10-28T10:38:48.699437Z",
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
  "device_ref": "sandbox-30665"
}
```

```json
{
  "challenge_id": "a649d4a0-6ea2-48f5-9ca7-d5237e59ebd2",
  "expires_at": "2026-10-28T10:43:48.962995813Z",
  "resend_available_at": "2026-10-28T10:38:49.962995813Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "800141",
  "sent_at": "2026-10-28T10:38:48.965280907Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a649d4a0-6ea2-48f5-9ca7-d5237e59ebd2",
  "code": "800141",
  "device_ref": "sandbox-30665"
}
```

```json
{
  "session_id": "8857edf6-8e2f-41c9-9931-66f30d70d69c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDgyOSwiaWF0IjoxNzkzMTgzOTI5LCJqdGkiOiI5Njg2YmNiZC1jMDI5LTRlNmItYWY5Yi1kOTg2OTJiNmMzYTQiLCJzaWQiOiI4ODU3ZWRmNi04ZTJmLTQxYzktOTkzMS02NmYzMGQ3MGQ2OWMifQ.Au9IjTAtaQtBYv_IDO5Wtwgi6Sz3yjHdrpBEm7gOf5w",
  "access_expires_at": "2026-10-28T10:53:49.245223982Z",
  "refresh_token": "xh_1aIO88yDYxsCnUJsDxCLit2VhqswotamcTzmEDLI",
  "refresh_expires_at": "2026-11-27T10:38:49.244714971Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e91f25d9-7a17-40fc-83d6-7351ef08cc43",
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
  "last_heartbeat_at": "2026-10-28T10:38:39.288841Z",
  "last_location_at": "2026-10-28T10:38:39.288841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e91f25d9-7a17-40fc-83d6-7351ef08cc43/handover` → **200**

```json
{
  "command_id": "8c787eee-086e-4523-9be6-e06690b679cd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e91f25d9-7a17-40fc-83d6-7351ef08cc43",
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
  "last_heartbeat_at": "2026-10-28T10:38:39.288841Z",
  "last_location_at": "2026-10-28T10:38:39.288841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e91f25d9-7a17-40fc-83d6-7351ef08cc43/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:50Z",
    "sequence": 1793183930171
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e91f25d9-7a17-40fc-83d6-7351ef08cc43",
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
  "last_heartbeat_at": "2026-10-28T10:38:50.03495Z",
  "last_location_at": "2026-10-28T10:38:50.03495Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674766287",
  "device_ref": "sandbox-27158"
}
```

```json
{
  "challenge_id": "5f18a041-eed9-415a-a25a-430a695480ad",
  "expires_at": "2026-10-28T10:43:50.286947401Z",
  "resend_available_at": "2026-10-28T10:38:51.286947401Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674766287` → **200**

```json
{
  "phone": "+380674766287",
  "audience": "CLIENT",
  "code": "868523",
  "sent_at": "2026-10-28T10:38:50.289105474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f18a041-eed9-415a-a25a-430a695480ad",
  "code": "868523",
  "device_ref": "sandbox-27158"
}
```

```json
{
  "session_id": "73138069-3bb0-4a9d-9578-3f4b60134636",
  "subject": {
    "type": "CLIENT",
    "id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMmIwMzk0Yi1iZjM1LTQ5NGQtYWMxNC0zMmIzZmU3YWNkZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0ODMwLCJpYXQiOjE3OTMxODM5MzAsImp0aSI6IjQ5OTliODRmLTBiNTEtNGZmYi1iYjI0LTlhNGNlMjU0OTlhZSIsInNpZCI6IjczMTM4MDY5LTNiYjAtNGE5ZC05NTc4LTNmNGI2MDEzNDYzNiJ9.AzXFLDaSU1pD_ICk_eEjrCwwN4IkcqQrta55dVfJ2-o",
  "access_expires_at": "2026-10-28T10:53:50.55869516Z",
  "refresh_token": "IoWdOngqjwdO2wQLEQnw5CQyeAZ-6WvdWPXqzTbGd74",
  "refresh_expires_at": "2026-11-27T10:38:50.558182258Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "47b33815-486e-4fee-b4bf-94656cd22a9f",
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
  "id": "a3823fff-d344-40a9-babf-228f92b5dd9a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:50.816257Z",
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
  "command_id": "92d2bb43-221e-4429-820d-70fae4df69c6",
  "quote_id": "a3823fff-d344-40a9-babf-228f92b5dd9a",
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
    "phone": "+380672782606"
  }
}
```

```json
{
  "id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:51.083153Z",
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
    "id": "efdbbed8-299a-4a36-a4e6-9ce5748e6875",
    "order_id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
    "expires_at": "2026-10-28T10:39:06.0864Z",
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

`POST /api/driver/v1/offers/efdbbed8-299a-4a36-a4e6-9ce5748e6875/accept` → **200**

```json
{
  "command_id": "1ebcddb4-2a66-4c1b-8c5d-6adc32bbd666"
}
```

```json
{
  "id": "87493a4f-e702-43a5-a09d-610d27fd6d3b",
  "order_id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c698dc60-b554-4455-be35-b31336a6f5b0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c698dc60-b554-4455-be35-b31336a6f5b0",
  "order_id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
  "assignment_id": "87493a4f-e702-43a5-a09d-610d27fd6d3b",
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
    "phone": "+380672782606"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bf279a9e-aef0-4daa-97d1-678f55784c7e",
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
  "id": "960c4703-5a97-4b30-8385-5d2401778c65",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:52.155210Z",
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
  "command_id": "deaaeb7d-aa16-403e-8640-b3cdab9203b3",
  "quote_id": "960c4703-5a97-4b30-8385-5d2401778c65",
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
  "id": "f4a36296-a6db-4e41-a61c-57cff4515053",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:52.419014Z",
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
  "command_id": "0e74ed1f-3f2c-4d65-bd7e-2a7786c1188a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:38:52Z"
}
```

```json
{
  "id": "62f22d59-24ec-40cd-a33b-d38706acb5f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:52.699232Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:38:52Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "40818743-8063-4a56-b76e-6dd0198a8bc9",
  "quote_id": "62f22d59-24ec-40cd-a33b-d38706acb5f4",
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
  "pickup_at": "2026-10-28T13:38:52Z"
}
```

```json
{
  "id": "2c31c6da-fdee-4206-bc95-86a1a379931c",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:52.975504Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:38:52Z",
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
  "command_id": "5dec1c26-e7e6-4c3b-afe1-961aba612d9f",
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
  "id": "b815628d-624a-4291-a74a-b5c1b5687a83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:53.249085Z",
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
  "command_id": "d9a926db-23d1-4f80-8570-ac1be376ec8c",
  "quote_id": "b815628d-624a-4291-a74a-b5c1b5687a83",
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
  "correlation_id": "5a25e755-e7b2-4d6d-aa6e-c10bb60df22c"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "2c31c6da-fdee-4206-bc95-86a1a379931c",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T10:38:52.975504Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:38:52Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "f4a36296-a6db-4e41-a61c-57cff4515053",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T10:38:52.419014Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "f4a36296-a6db-4e41-a61c-57cff4515053",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:52.419014Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/420f8b31-8679-43a9-9074-0143e1f73bfe` → **200**

```json
{
  "id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "87493a4f-e702-43a5-a09d-610d27fd6d3b",
    "order_id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c698dc60-b554-4455-be35-b31336a6f5b0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:38:51.083153Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/420f8b31-8679-43a9-9074-0143e1f73bfe/cancel` → **200**

```json
{
  "command_id": "53d75fae-0b4b-435d-a95a-0c13acf47a73",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "87493a4f-e702-43a5-a09d-610d27fd6d3b",
    "order_id": "420f8b31-8679-43a9-9074-0143e1f73bfe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c698dc60-b554-4455-be35-b31336a6f5b0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:38:51.083153Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f4a36296-a6db-4e41-a61c-57cff4515053` → **200**

```json
{
  "id": "f4a36296-a6db-4e41-a61c-57cff4515053",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:52.419014Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f4a36296-a6db-4e41-a61c-57cff4515053/cancel` → **200**

```json
{
  "command_id": "4d1adab7-c8d8-48c0-a979-aef2b1f10376",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f4a36296-a6db-4e41-a61c-57cff4515053",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:52.419014Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/2c31c6da-fdee-4206-bc95-86a1a379931c` → **200**

```json
{
  "id": "2c31c6da-fdee-4206-bc95-86a1a379931c",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:52.975504Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:38:52Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/2c31c6da-fdee-4206-bc95-86a1a379931c/cancel` → **200**

```json
{
  "command_id": "d7106115-3b98-458c-9ecc-944c85ec3875",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2c31c6da-fdee-4206-bc95-86a1a379931c",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "32b0394b-bf35-494d-ac14-32b3fe7acdf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T10:38:52.975504Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-28T13:38:52Z",
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
  "session_id": "e91f25d9-7a17-40fc-83d6-7351ef08cc43",
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
  "last_heartbeat_at": "2026-10-28T10:38:50.03495Z",
  "last_location_at": "2026-10-28T10:38:50.03495Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e91f25d9-7a17-40fc-83d6-7351ef08cc43/close` → **200**

```json
{
  "command_id": "9e45f64f-6857-4053-914c-08a284b9a5ef",
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

Done: orders 420f8b31-8679-43a9-9074-0143e1f73bfe, f4a36296-a6db-4e41-a61c-57cff4515053, 2c31c6da-fdee-4206-bc95-86a1a379931c.

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
  "session_id": "2c96cb26-ae80-4a1a-af8d-64b0d6a6a7d1",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MzYsImlhdCI6MTc5MzE4MzkzNiwianRpIjoiMGUwZjY5OWEtNTQ2MC00NjJiLTk0YTQtNTNlZWM1MjIwN2ZkIiwic2lkIjoiMmM5NmNiMjYtYWU4MC00YTFhLWFmOGQtNjRiMGQ2YTZhN2QxIn0.-Kefb4-a0WHtpAPy7VXsJiSr4Xj8FJrxjJF5Jf3qYh8",
  "access_expires_at": "2026-10-28T10:53:56.694052714Z",
  "refresh_token": "ZVD06YC3RUzkyQ97cpmeVvnOVAPIo3fWHox-idN0O0Q",
  "refresh_expires_at": "2026-10-28T22:38:56.693357295Z",
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
  "session_id": "d5aac5ce-832d-44f2-87f0-6c72f6dbc9e5",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4MzcsImlhdCI6MTc5MzE4MzkzNywianRpIjoiNmMxZDU2YTEtNjdkMi00MzRiLTg0NmItNzExNjc2N2Q5MWYyIiwic2lkIjoiZDVhYWM1Y2UtODMyZC00NGYyLTg3ZjAtNmM3MmY2ZGJjOWU1In0.CpPbKScUmBWvC4vpZVmMm4qHbQNvgQX9ek-gv2S1Mc4",
  "access_expires_at": "2026-10-28T10:53:57.246106414Z",
  "refresh_token": "9o4RiibAaSavdBEDCL0UEHN2Hy93ANDzSo2N1G_cy4g",
  "refresh_expires_at": "2026-10-28T22:38:57.245566285Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31723"
}
```

```json
{
  "challenge_id": "c2617828-836b-47d9-b2ea-ffcb4dcd0137",
  "expires_at": "2026-10-28T10:43:57.491566162Z",
  "resend_available_at": "2026-10-28T10:38:58.491566162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "605254",
  "sent_at": "2026-10-28T10:38:57.494665091Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2617828-836b-47d9-b2ea-ffcb4dcd0137",
  "code": "605254",
  "device_ref": "sandbox-31723"
}
```

```json
{
  "session_id": "8dafd255-fad3-4cd4-99c0-1951ab34047f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDgzNywiaWF0IjoxNzkzMTgzOTM3LCJqdGkiOiJmMjA1OTQzNy1kMDM1LTQyMzEtYTcxYy1jNjYzZjMxMWE2OWMiLCJzaWQiOiI4ZGFmZDI1NS1mYWQzLTRjZDQtOTljMC0xOTUxYWIzNDA0N2YifQ.p3-PRaXQRgr_hbZ-TBCwNTCDZStOw0hpbSetg1b6k04",
  "access_expires_at": "2026-10-28T10:53:57.769763955Z",
  "refresh_token": "48t9B67zqsFoo43abKNRKDgnXtOwEQy7yCw5qmWTvZg",
  "refresh_expires_at": "2026-11-27T10:38:57.769078619Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:35.256886Z",
  "last_location_at": "2026-10-28T10:38:35.256886Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/handover` → **200**

```json
{
  "command_id": "2bdb5f26-45cd-446d-baf0-3fe075155708",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:35.256886Z",
  "last_location_at": "2026-10-28T10:38:35.256886Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:38:58Z",
    "sequence": 1793183938547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:38:58.565394Z",
  "last_location_at": "2026-10-28T10:38:58.565394Z",
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
  "command_id": "d633a85f-cee3-486a-810f-9f4b75014ba4",
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
  "effective_at": "2026-10-28T10:38:59.089606Z",
  "changed_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "03937974-b9ba-4260-8728-08e067d4e567",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:38:59.349736004Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "990cab02-e84d-4caa-8a4a-389aba292468",
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
  "id": "adfd8ca2-5a00-4e4c-a51a-0caf898d9109",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:43:59.614240Z",
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
  "command_id": "d6d44cc5-5f48-4d9c-a8cb-6dfca33396df",
  "quote_id": "adfd8ca2-5a00-4e4c-a51a-0caf898d9109",
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
    "phone": "+380671115723"
  }
}
```

```json
{
  "id": "68c97bc0-9e0c-4adc-a2e2-b53be1d60867",
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
  "created_at": "2026-10-28T10:38:59.899442Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115723"
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
    "id": "b55360eb-eba7-4834-b629-c3da9b7168fb",
    "order_id": "68c97bc0-9e0c-4adc-a2e2-b53be1d60867",
    "expires_at": "2026-10-28T10:39:14.903087Z",
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

`POST /api/driver/v1/offers/b55360eb-eba7-4834-b629-c3da9b7168fb/accept` → **200**

```json
{
  "command_id": "d8b6c0b4-e36d-4ec1-8d4f-58452082eaaa"
}
```

```json
{
  "id": "e7165b45-1030-451b-ae02-d8b11e8fd2c2",
  "order_id": "68c97bc0-9e0c-4adc-a2e2-b53be1d60867",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "240e5a43-6eed-4ff9-a195-7b61fdc401e2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "240e5a43-6eed-4ff9-a195-7b61fdc401e2",
  "order_id": "68c97bc0-9e0c-4adc-a2e2-b53be1d60867",
  "assignment_id": "e7165b45-1030-451b-ae02-d8b11e8fd2c2",
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
    "phone": "+380671115723"
  }
}
```

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:00Z",
    "sequence": 1793183940903
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:39:00.921474Z",
  "last_location_at": "2026-10-28T10:39:00.921474Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/240e5a43-6eed-4ff9-a195-7b61fdc401e2/arrive` → **200**

```json
{
  "command_id": "f1fa30b1-8745-4b59-b2ed-3f1e50084236",
  "expected_version": 0
}
```

```json
{
  "id": "240e5a43-6eed-4ff9-a195-7b61fdc401e2",
  "order_id": "68c97bc0-9e0c-4adc-a2e2-b53be1d60867",
  "assignment_id": "e7165b45-1030-451b-ae02-d8b11e8fd2c2",
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
  "arrived_at": "2026-10-28T10:39:01.18243Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115723"
  }
}
```

`POST /api/driver/v1/trips/240e5a43-6eed-4ff9-a195-7b61fdc401e2/start` → **200**

```json
{
  "command_id": "5d99a912-b97a-4fd6-8e46-7253fd6b341d",
  "expected_version": 1
}
```

```json
{
  "id": "240e5a43-6eed-4ff9-a195-7b61fdc401e2",
  "order_id": "68c97bc0-9e0c-4adc-a2e2-b53be1d60867",
  "assignment_id": "e7165b45-1030-451b-ae02-d8b11e8fd2c2",
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
  "arrived_at": "2026-10-28T10:39:01.18243Z",
  "started_at": "2026-10-28T10:39:01.441281Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115723"
  }
}
```

`POST /api/driver/v1/trips/240e5a43-6eed-4ff9-a195-7b61fdc401e2/complete` → **200**

```json
{
  "command_id": "d1b4465b-815d-4b24-8a6d-381e2f47115c",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:39:01Z",
  "cash_received": true
}
```

```json
{
  "id": "240e5a43-6eed-4ff9-a195-7b61fdc401e2",
  "order_id": "68c97bc0-9e0c-4adc-a2e2-b53be1d60867",
  "assignment_id": "e7165b45-1030-451b-ae02-d8b11e8fd2c2",
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
  "arrived_at": "2026-10-28T10:39:01.18243Z",
  "started_at": "2026-10-28T10:39:01.441281Z",
  "completed_at": "2026-10-28T10:39:01.705371Z",
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
  "command_id": "a0ce30ab-6117-42fb-9631-1a04d783a037",
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
  "id": "d9d3426f-d70a-4d0a-b8fb-53fcf1abbde3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:44:01.993015Z",
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
  "command_id": "96374c6d-e86c-459a-af31-9c9085ffdcf6",
  "quote_id": "d9d3426f-d70a-4d0a-b8fb-53fcf1abbde3",
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
    "phone": "+3806711112419"
  }
}
```

```json
{
  "id": "31c25ac0-872a-4043-a8a1-8f946ad67a41",
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
  "created_at": "2026-10-28T10:39:02.273111Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112419"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/31c25ac0-872a-4043-a8a1-8f946ad67a41` → **200**

```json
{
  "id": "31c25ac0-872a-4043-a8a1-8f946ad67a41",
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
  "created_at": "2026-10-28T10:39:02.273111Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112419"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/31c25ac0-872a-4043-a8a1-8f946ad67a41/cancel` → **200**

```json
{
  "command_id": "46b29121-0f25-49af-81aa-3ff80540f646",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "31c25ac0-872a-4043-a8a1-8f946ad67a41",
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
  "created_at": "2026-10-28T10:39:02.273111Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112419"
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
  "staff_id": "03937974-b9ba-4260-8728-08e067d4e567",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T10:39:01.711068Z",
  "last_entries": [
    {
      "order_id": "31c25ac0-872a-4043-a8a1-8f946ad67a41",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T10:39:02.857709Z"
    },
    {
      "order_id": "68c97bc0-9e0c-4adc-a2e2-b53be1d60867",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T10:39:01.711068Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b222bd4d-8d51-4a5a-a9ac-3e057e47eb04",
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
  "last_heartbeat_at": "2026-10-28T10:39:00.921474Z",
  "last_location_at": "2026-10-28T10:39:00.921474Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b222bd4d-8d51-4a5a-a9ac-3e057e47eb04/close` → **200**

```json
{
  "command_id": "8a7a029b-a1a7-4938-9924-b7121969f380",
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

Done: operator bonus for fulfilled 68c97bc0-9e0c-4adc-a2e2-b53be1d60867 and operator-fault cancellation 31c25ac0-872a-4043-a8a1-8f946ad67a41.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670017944",
  "device_ref": "sandbox-31443"
}
```

```json
{
  "challenge_id": "4c0c01e8-5e46-4f97-b792-c69dfa842882",
  "expires_at": "2026-10-28T10:44:05.929038082Z",
  "resend_available_at": "2026-10-28T10:39:06.929038082Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670017944` → **200**

```json
{
  "phone": "+380670017944",
  "audience": "CLIENT",
  "code": "260297",
  "sent_at": "2026-10-28T10:39:05.931477915Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670794316",
  "device_ref": "sandbox-330",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b4274dd9-3a74-4e29-b08c-40f24d19da8e",
  "expires_at": "2026-10-28T10:44:06.212792037Z",
  "resend_available_at": "2026-10-28T10:39:07.212792037Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670794316` → **200**

```json
{
  "phone": "+380670794316",
  "audience": "CLIENT",
  "code": "803016",
  "sent_at": "2026-10-28T10:39:06.214795931Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673780000",
  "device_ref": "sandbox-1347"
}
```

```json
{
  "challenge_id": "5a44903f-dd67-4ae1-8b90-9471748a2dfb",
  "expires_at": "2026-10-28T10:44:06.487920451Z",
  "resend_available_at": "2026-10-28T10:39:07.487920451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673780000` → **200**

```json
{
  "phone": "+380673780000",
  "audience": "CLIENT",
  "code": "590852",
  "sent_at": "2026-10-28T10:39:06.490544007Z",
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
  "session_id": "aa1bbcff-7836-43ae-afb7-1424cd787680",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NDcsImlhdCI6MTc5MzE4Mzk0NywianRpIjoiOTJjZDkzYjktMjA2NC00MzUwLTljZmEtMDhlMTY2ZTJiZTdmIiwic2lkIjoiYWExYmJjZmYtNzgzNi00M2FlLWFmYjctMTQyNGNkNzg3NjgwIn0.KGT9pXjuLWSdHP2bEB6iHqWAOzkivcRHmjvCGrZFKyM",
  "access_expires_at": "2026-10-28T10:54:07.056299689Z",
  "refresh_token": "d6aUmXCwYBEvyZ9sUHxuXcEBGnCgDgD24ETSN5OAOGU",
  "refresh_expires_at": "2026-10-28T22:39:07.055799765Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673780000` → **200**

```json
{
  "deliveries": [
    {
      "id": "be0e850e-65a0-4033-a662-9f93bd814c23",
      "challenge_id": "5a44903f-dd67-4ae1-8b90-9471748a2dfb",
      "phone": "+380673780000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-15362366-f6db-4a8f-8304-42ffbb2ed738",
      "error": null,
      "attempted_at": "2026-10-28T10:39:06.490787Z"
    },
    {
      "id": "91082171-b9c1-4303-9f95-f0f9abbc2c5a",
      "challenge_id": "5a44903f-dd67-4ae1-8b90-9471748a2dfb",
      "phone": "+380673780000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:39:06.49004Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673780000` → **200**

```json
{
  "phone": "+380673780000",
  "audience": "CLIENT",
  "code": "590852",
  "sent_at": "2026-10-28T10:39:06.490544007Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670794316` → **200**

```json
{
  "deliveries": [
    {
      "id": "4bf7f388-11a8-4c7f-85c4-fdffaba8b6cb",
      "challenge_id": "b4274dd9-3a74-4e29-b08c-40f24d19da8e",
      "phone": "+380670794316",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-879c6274-4e67-4cd0-867d-fd6eca2c9b82",
      "error": null,
      "attempted_at": "2026-10-28T10:39:06.215025Z"
    }
  ]
}
```

Done: SMS to +380670017944, a call to +380670794316, SMS then a call to +380673780000.

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
  "session_id": "d8eb91bc-6b11-4df8-999f-33ae4bc6b362",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NDgsImlhdCI6MTc5MzE4Mzk0OCwianRpIjoiYTNkNDliYTQtZTI1MC00NjgxLThlN2YtMjJhNzBmOGUzNjllIiwic2lkIjoiZDhlYjkxYmMtNmIxMS00ZGY4LTk5OWYtMzNhZTRiYzZiMzYyIn0.WIF6tIm-WCB0fCmvp6B6KWNk0qfqudxjM0-9f_VgSU0",
  "access_expires_at": "2026-10-28T10:54:08.169712501Z",
  "refresh_token": "0QhGmEplignt0QlCysgprIVVgEGXjYsZX1QpvhuA26M",
  "refresh_expires_at": "2026-10-28T22:39:08.169186231Z",
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
  "session_id": "6b0072f0-4462-4f27-8dd6-54a90bc15808",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NDgsImlhdCI6MTc5MzE4Mzk0OCwianRpIjoiNDRmODM4MjgtYzU4ZS00MDc2LTliODQtNjc1ODdjMjdlNTk4Iiwic2lkIjoiNmIwMDcyZjAtNDQ2Mi00ZjI3LThkZDYtNTRhOTBiYzE1ODA4In0.O9kupa-dGA4M8vZ4PbQ8229MvyKTgyq8pzN5WMzORdY",
  "access_expires_at": "2026-10-28T10:54:08.70772568Z",
  "refresh_token": "A7qls6RcxXKQzkMm5MtgkL9hEXuyChUxDRJfX8RW1H4",
  "refresh_expires_at": "2026-10-28T22:39:08.707196632Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "03937974-b9ba-4260-8728-08e067d4e567",
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

`POST /api/admin/v1/staff-extensions/03937974-b9ba-4260-8728-08e067d4e567` → **200**

```json
{
  "command_id": "1ab50adb-3f0b-4a52-97d8-60a341213ce8",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "03937974-b9ba-4260-8728-08e067d4e567",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "2ad22f08-6526-405a-9428-6223f7750041",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:39:09.715476Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:39:09.715476Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "39528b7c-8415-45da-9bd4-35c7af166913",
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
  "id": "17475a6a-2035-43d2-803a-36a886315670",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:44:10.229599Z",
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
  "command_id": "467be21a-c15b-48bb-9b49-9ab7dc215941",
  "quote_id": "17475a6a-2035-43d2-803a-36a886315670",
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
    "phone": "+380674857113"
  }
}
```

```json
{
  "id": "9b4cee59-4b3b-483c-8b29-086fd2fc26c3",
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
  "created_at": "2026-10-28T10:39:10.491312Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674857113"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/9b4cee59-4b3b-483c-8b29-086fd2fc26c3/calls` → **201**

```json
{
  "command_id": "891a3511-4856-4a2f-9474-1f84a2b48667",
  "to": "CALLER"
}
```

```json
{
  "id": "3364b866-1bb8-462b-90e1-214a062c922e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "order_ids": [
    "9b4cee59-4b3b-483c-8b29-086fd2fc26c3"
  ],
  "started_at": "2026-10-28T10:39:10.772847Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/9b4cee59-4b3b-483c-8b29-086fd2fc26c3/calls` → **201**

```json
{
  "command_id": "891a3511-4856-4a2f-9474-1f84a2b48667",
  "to": "CALLER"
}
```

```json
{
  "id": "3364b866-1bb8-462b-90e1-214a062c922e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "order_ids": [
    "9b4cee59-4b3b-483c-8b29-086fd2fc26c3"
  ],
  "started_at": "2026-10-28T10:39:10.772847Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "3364b866-1bb8-462b-90e1-214a062c922e",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674857113",
    "at": "2026-10-28T10:39:10.775030097Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "3364b866-1bb8-462b-90e1-214a062c922e",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.14588",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "3364b866-1bb8-462b-90e1-214a062c922e"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "3364b866-1bb8-462b-90e1-214a062c922e",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=9b4cee59-4b3b-483c-8b29-086fd2fc26c3` → **200**

```json
{
  "calls": [
    {
      "id": "3364b866-1bb8-462b-90e1-214a062c922e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [
        "9b4cee59-4b3b-483c-8b29-086fd2fc26c3"
      ],
      "started_at": "2026-10-28T10:39:10.772847Z",
      "answered_at": "2026-10-28T10:39:11.372071Z",
      "ended_at": "2026-10-28T10:39:11.39207Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=9b4cee59-4b3b-483c-8b29-086fd2fc26c3` → **200**

```json
{
  "calls": [
    {
      "id": "3364b866-1bb8-462b-90e1-214a062c922e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "03937974-b9ba-4260-8728-08e067d4e567",
      "order_ids": [
        "9b4cee59-4b3b-483c-8b29-086fd2fc26c3"
      ],
      "started_at": "2026-10-28T10:39:10.772847Z",
      "answered_at": "2026-10-28T10:39:11.372071Z",
      "ended_at": "2026-10-28T10:39:11.39207Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:39:11.885598Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/9b4cee59-4b3b-483c-8b29-086fd2fc26c3` → **200**

```json
{
  "id": "9b4cee59-4b3b-483c-8b29-086fd2fc26c3",
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
  "created_at": "2026-10-28T10:39:10.491312Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674857113"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9b4cee59-4b3b-483c-8b29-086fd2fc26c3/cancel` → **200**

```json
{
  "command_id": "f2f23120-8428-43f6-84fd-2448d1c92ea1",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9b4cee59-4b3b-483c-8b29-086fd2fc26c3",
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
  "created_at": "2026-10-28T10:39:10.491312Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674857113"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "command_id": "d7ec3f61-1a9a-4955-a1da-b00f358e852e",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T10:39:14.502727Z",
  "extension": "101"
}
```

Done: outgoing call 3364b866-1bb8-462b-90e1-214a062c922e from order 9b4cee59-4b3b-483c-8b29-086fd2fc26c3, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632760889",
  "device_ref": "sandbox-3684"
}
```

```json
{
  "challenge_id": "4bdeb07b-5ca0-4dad-84af-e228bcc56472",
  "expires_at": "2026-10-28T10:44:14.770031293Z",
  "resend_available_at": "2026-10-28T10:39:15.770031293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632760889` → **200**

```json
{
  "phone": "+380632760889",
  "audience": "CLIENT",
  "code": "161915",
  "sent_at": "2026-10-28T10:39:14.772422967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bdeb07b-5ca0-4dad-84af-e228bcc56472",
  "code": "161915",
  "device_ref": "sandbox-3684"
}
```

```json
{
  "session_id": "1b6d65d1-d072-406a-9e06-ba7cac2694e6",
  "subject": {
    "type": "CLIENT",
    "id": "db746d30-bee8-4586-acfd-705554964988"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjc0NmQzMC1iZWU4LTQ1ODYtYWNmZC03MDU1NTQ5NjQ5ODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0ODU1LCJpYXQiOjE3OTMxODM5NTUsImp0aSI6IjMwNTY5MWI1LTMwNzYtNDZkZS04OGZhLTI5N2I4NDkxYTllMiIsInNpZCI6IjFiNmQ2NWQxLWQwNzItNDA2YS05ZTA2LWJhN2NhYzI2OTRlNiJ9.Sn8Mdjpld8cIq1tcO2QnuuN2lgiD_dZxjA61VUCbPHs",
  "access_expires_at": "2026-10-28T10:54:15.057399506Z",
  "refresh_token": "lEVXyzW7HtpGQIFUTmxVkhhnBddv-lKj8MeibggzMXA",
  "refresh_expires_at": "2026-11-27T10:39:15.056915685Z",
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
  "session_id": "9ae28c62-0724-4e44-9c8a-cd53a46037c1",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NTYsImlhdCI6MTc5MzE4Mzk1NiwianRpIjoiMzMxZWQ1MmQtNWJkMy00OGVjLWI3OTctM2NhOWM2OWQ0NmZiIiwic2lkIjoiOWFlMjhjNjItMDcyNC00ZTQ0LTljOGEtY2Q1M2E0NjAzN2MxIn0.bh1A26zEAGfj8nWweWZBOap_Ncd73_MpCt2uhJDgNQI",
  "access_expires_at": "2026-10-28T10:54:16.148017461Z",
  "refresh_token": "1Pnrm4JJNSFei23i_V_HBpGVfzv6Ncq7pyrGN3IOjOo",
  "refresh_expires_at": "2026-10-28T22:39:16.147488546Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632760889` → **200**

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
  "correlation_id": "db9e864c-3ca7-4479-8367-7d81e60b4c6f"
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
  "session_id": "1b5f4b6f-02ef-494d-8826-a62aba9c42a2",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NTcsImlhdCI6MTc5MzE4Mzk1NywianRpIjoiYWVhY2VhNDAtZTE5MC00YThiLTk3MjEtNzQ5OWFhODQ3NWNkIiwic2lkIjoiMWI1ZjRiNmYtMDJlZi00OTRkLTg4MjYtYTYyYWJhOWM0MmEyIn0.t06ktXjGKpF4JSoFbyx_L_LxGQN4lyrWBid9nTWfeXM",
  "access_expires_at": "2026-10-28T10:54:17.244394656Z",
  "refresh_token": "ZeDfSAuKy-mD47kOGPdPb7bRv5MojV6vZF2EwPdG6TI",
  "refresh_expires_at": "2026-10-28T22:39:17.243910542Z",
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
  "command_id": "40e4ef6c-1018-45ec-8aca-08b115af5236",
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
  "changed_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:39:17.793307188Z"
}
```

## The rider books the airport for 2026-10-28T13:39:16Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600121819",
  "device_ref": "sandbox-22132"
}
```

```json
{
  "challenge_id": "2215b483-7121-4d71-8e40-b9e176889c66",
  "expires_at": "2026-10-28T10:44:18.060466303Z",
  "resend_available_at": "2026-10-28T10:39:19.060466303Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600121819` → **200**

```json
{
  "phone": "+48600121819",
  "audience": "CLIENT",
  "code": "743028",
  "sent_at": "2026-10-28T10:39:18.062594227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2215b483-7121-4d71-8e40-b9e176889c66",
  "code": "743028",
  "device_ref": "sandbox-22132"
}
```

```json
{
  "session_id": "40038897-ec50-402c-83b0-2032cff6d0a7",
  "subject": {
    "type": "CLIENT",
    "id": "1c12603c-75f0-4b05-ba5b-c09e28ebd1e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzEyNjAzYy03NWYwLTRiMDUtYmE1Yi1jMDllMjhlYmQxZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0ODU4LCJpYXQiOjE3OTMxODM5NTgsImp0aSI6Ijc0NzZhNWI0LTNmMDQtNGNhYi1hN2ZjLTY0ZGU4MTA4YWUwYSIsInNpZCI6IjQwMDM4ODk3LWVjNTAtNDAyYy04M2IwLTIwMzJjZmY2ZDBhNyJ9.Sh7qzUkwMES21gJmGbMx5vJ5e1bfuHsKlX2AVzMTFuw",
  "access_expires_at": "2026-10-28T10:54:18.340914827Z",
  "refresh_token": "jpnC47PP_YLSefN0kJMsVLF5JluL6X8-lctx1Ztt50s",
  "refresh_expires_at": "2026-11-27T10:39:18.340345504Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "402c23b6-c16e-476e-b76a-0e17d23f85a8",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:39:16Z"
}
```

```json
{
  "id": "141bb1fd-b3da-4ae8-be24-4c149ce411c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:44:18.601287Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:39:16Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "58a22f8d-6971-4637-9c27-7d5f3dfced59",
  "quote_id": "141bb1fd-b3da-4ae8-be24-4c149ce411c2",
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
  "pickup_at": "2026-10-28T13:39:16Z"
}
```

```json
{
  "id": "5ab62019-b8a8-410f-8fae-ad1a2fa62eea",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1c12603c-75f0-4b05-ba5b-c09e28ebd1e4",
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
  "created_at": "2026-10-28T10:39:18.871382Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:39:16Z",
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
  "device_ref": "sandbox-21470"
}
```

```json
{
  "challenge_id": "d6711bd8-b653-426f-9fc9-754b470cfc48",
  "expires_at": "2026-10-28T10:44:19.141665622Z",
  "resend_available_at": "2026-10-28T10:39:20.141665622Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "365237",
  "sent_at": "2026-10-28T10:39:19.143792307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6711bd8-b653-426f-9fc9-754b470cfc48",
  "code": "365237",
  "device_ref": "sandbox-21470"
}
```

```json
{
  "session_id": "32968b90-d45f-4070-99b8-af48aa5f8e10",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDg1OSwiaWF0IjoxNzkzMTgzOTU5LCJqdGkiOiIxMzZmMmUwOS01ZDVmLTRiMjEtYjE3Yi0xNmViZjNiNDFjODYiLCJzaWQiOiIzMjk2OGI5MC1kNDVmLTQwNzAtOTliOC1hZjQ4YWE1ZjhlMTAifQ.m1p_cA7wMrOsUZrdmLJq4tbaJoLqUHg8mwmhwrxhp58",
  "access_expires_at": "2026-10-28T10:54:19.41849499Z",
  "refresh_token": "daMHvInGOEIC4zuhKkEAntmiL3P5XZ7SbcxYuexlR7k",
  "refresh_expires_at": "2026-11-27T10:39:19.41786074Z",
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
  "command_id": "9511bdbc-628d-45a6-87fc-a241835a65f3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:19Z",
    "sequence": 1793183959924
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4b43751d-2ffc-48b4-b80a-939ece0688b5",
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
  "last_heartbeat_at": "2026-10-28T10:39:19.941769Z",
  "last_location_at": "2026-10-28T10:39:19.941769Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "5ab62019-b8a8-410f-8fae-ad1a2fa62eea",
      "short_number": 18,
      "pickup_at": "2026-10-28T13:39:16Z",
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

`POST /api/driver/v1/preorders/5ab62019-b8a8-410f-8fae-ad1a2fa62eea/reserve` → **200**

```json
{
  "command_id": "c80c48cb-1e87-464a-9552-c65a0adebb0b"
}
```

```json
{
  "id": "6a4fdfef-40f7-4b81-ac13-47e0b1c81749",
  "state": "RESERVED",
  "order": {
    "order_id": "5ab62019-b8a8-410f-8fae-ad1a2fa62eea",
    "short_number": 18,
    "pickup_at": "2026-10-28T13:39:16Z",
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
  "reserved_at": "2026-10-28T10:39:20.466838Z",
  "confirm_from": "2026-10-28T13:09:16Z",
  "confirm_until": "2026-10-28T13:19:16Z",
  "drop_until": "2026-10-28T12:39:16Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "6a4fdfef-40f7-4b81-ac13-47e0b1c81749",
      "state": "RESERVED",
      "order": {
        "order_id": "5ab62019-b8a8-410f-8fae-ad1a2fa62eea",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:39:16Z",
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
      "reserved_at": "2026-10-28T10:39:20.466838Z",
      "confirm_from": "2026-10-28T13:09:16Z",
      "confirm_until": "2026-10-28T13:19:16Z",
      "drop_until": "2026-10-28T12:39:16Z"
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
      "id": "6a4fdfef-40f7-4b81-ac13-47e0b1c81749",
      "state": "RESERVED",
      "order": {
        "order_id": "5ab62019-b8a8-410f-8fae-ad1a2fa62eea",
        "short_number": 18,
        "pickup_at": "2026-10-28T13:39:16Z",
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
      "reserved_at": "2026-10-28T10:39:20.466838Z",
      "confirm_from": "2026-10-28T13:09:16Z",
      "confirm_until": "2026-10-28T13:19:16Z",
      "drop_until": "2026-10-28T12:39:16Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/6a4fdfef-40f7-4b81-ac13-47e0b1c81749/confirm` → **409**

```json
{
  "command_id": "61cd92ad-30d6-4e41-98b6-88d8a076f688"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/6a4fdfef-40f7-4b81-ac13-47e0b1c81749/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0d995cf6-b5e2-41f6-884e-c3c1db00818c"
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
  "session_id": "fc80f01f-0842-4c93-9702-5af8aa392901",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NjEsImlhdCI6MTc5MzE4Mzk2MSwianRpIjoiMWIwY2EwYTktNDQxOC00MTEzLTliMGQtZGMyNzhkODQ3MmFmIiwic2lkIjoiZmM4MGYwMWYtMDg0Mi00YzkzLTk3MDItNWFmOGFhMzkyOTAxIn0.EE3wNHCokGe0uEn07ONQvWipNsHBnHVZSbK1ZtBh0VY",
  "access_expires_at": "2026-10-28T10:54:21.77803761Z",
  "refresh_token": "-_yO4RCEsL-eH0L1mQoMaSAKbVOPQnkZ-GISC5Z2ATc",
  "refresh_expires_at": "2026-10-28T22:39:21.777486851Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5ab62019-b8a8-410f-8fae-ad1a2fa62eea` → **200**

```json
{
  "id": "5ab62019-b8a8-410f-8fae-ad1a2fa62eea",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1c12603c-75f0-4b05-ba5b-c09e28ebd1e4",
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
  "created_at": "2026-10-28T10:39:18.871382Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:39:16Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "6a4fdfef-40f7-4b81-ac13-47e0b1c81749",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:39:20.466838Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5ab62019-b8a8-410f-8fae-ad1a2fa62eea/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:39:18.872465Z",
      "actor": {
        "type": "CLIENT",
        "id": "1c12603c-75f0-4b05-ba5b-c09e28ebd1e4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "5ab62019-b8a8-410f-8fae-ad1a2fa62eea",
        "preorder": true,
        "quote_id": "141bb1fd-b3da-4ae8-be24-4c149ce411c2",
        "pickup_at": "2026-10-28T13:39:16Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "01bcb665-4c46-4668-ad64-62f8d2d8949c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:39:20.467971Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5ab62019-b8a8-410f-8fae-ad1a2fa62eea",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "6a4fdfef-40f7-4b81-ac13-47e0b1c81749"
      },
      "correlation_id": "7eee0ea3-b0e4-41ef-9702-f725dfd2a14a"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 5ab62019-b8a8-410f-8fae-ad1a2fa62eea, reservation 6a4fdfef-40f7-4b81-ac13-47e0b1c81749.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8892"
}
```

```json
{
  "challenge_id": "5dc4771d-098e-4641-b80a-f2a0b861d770",
  "expires_at": "2026-10-28T10:44:22.59498332Z",
  "resend_available_at": "2026-10-28T10:39:23.59498332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "385782",
  "sent_at": "2026-10-28T10:39:22.597175163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5dc4771d-098e-4641-b80a-f2a0b861d770",
  "code": "385782",
  "device_ref": "sandbox-8892"
}
```

```json
{
  "session_id": "a4b7fbb0-14f0-496e-b1f2-f9a12320899f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDg2MiwiaWF0IjoxNzkzMTgzOTYyLCJqdGkiOiIwMWJlZmVkYi01NzAwLTQ4NTQtOWRkOS02MzU1ZDVlNTYzODYiLCJzaWQiOiJhNGI3ZmJiMC0xNGYwLTQ5NmUtYjFmMi1mOWExMjMyMDg5OWYifQ.aXPwPFbn38Yu1i6cGkmAZCKXJHqyjSQjU0rZFh6T27o",
  "access_expires_at": "2026-10-28T10:54:22.877016702Z",
  "refresh_token": "eHfDLM5FIl5G07poODMRZX8OSgyAj6Kn2ONfa_n_Ru4",
  "refresh_expires_at": "2026-11-27T10:39:22.876415237Z",
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
  "command_id": "fbe589f4-fb66-4bc1-b424-089b775156a9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:23Z",
    "sequence": 1793183963377
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "af5b52b2-df7d-4ec7-ba8c-857ecc89292a",
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
  "last_heartbeat_at": "2026-10-28T10:39:23.394547Z",
  "last_location_at": "2026-10-28T10:39:23.394547Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675757488",
  "device_ref": "sandbox-929"
}
```

```json
{
  "challenge_id": "bc6b13e9-8082-497b-9d04-38a411c03f96",
  "expires_at": "2026-10-28T10:44:23.655931921Z",
  "resend_available_at": "2026-10-28T10:39:24.655931921Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675757488` → **200**

```json
{
  "phone": "+380675757488",
  "audience": "CLIENT",
  "code": "115470",
  "sent_at": "2026-10-28T10:39:23.657992751Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc6b13e9-8082-497b-9d04-38a411c03f96",
  "code": "115470",
  "device_ref": "sandbox-929"
}
```

```json
{
  "session_id": "b9424847-a461-4660-bf45-ca365dc16d8e",
  "subject": {
    "type": "CLIENT",
    "id": "65f9f7b9-c886-4ea4-8456-9ae348991032"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWY5ZjdiOS1jODg2LTRlYTQtODQ1Ni05YWUzNDg5OTEwMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0ODYzLCJpYXQiOjE3OTMxODM5NjMsImp0aSI6IjZmYTk1MDFkLWQ0N2QtNDY3Mi04NjdjLWQyMTE1MTM1NWUzMyIsInNpZCI6ImI5NDI0ODQ3LWE0NjEtNDY2MC1iZjQ1LWNhMzY1ZGMxNmQ4ZSJ9.B0vueNkMQmo9Msb6ulsggTCo5cTIPj3rORc2tf7xy2s",
  "access_expires_at": "2026-10-28T10:54:23.935913699Z",
  "refresh_token": "3sNawvOv6KMulzXP2Bvh1KYpV2p063PSie9haOK-nfo",
  "refresh_expires_at": "2026-11-27T10:39:23.935321197Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b194470c-bf3b-4210-a5c0-9d1412dd9cf8",
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
  "id": "9ea88bd0-43a9-4b4f-8c91-75cbf1876eac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:44:24.203758Z",
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
  "command_id": "30a72056-7508-41e6-a598-04586ddbe88d",
  "quote_id": "9ea88bd0-43a9-4b4f-8c91-75cbf1876eac",
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
  "id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65f9f7b9-c886-4ea4-8456-9ae348991032",
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
  "created_at": "2026-10-28T10:39:24.479026Z",
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
    "id": "cc927d73-91d9-4be6-810b-b85530aea485",
    "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
    "expires_at": "2026-10-28T10:39:39.481703Z",
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

`POST /api/driver/v1/offers/cc927d73-91d9-4be6-810b-b85530aea485/accept` → **200**

```json
{
  "command_id": "1f830179-caa0-4254-b0b4-0bdc97323f31"
}
```

```json
{
  "id": "662a418f-42b5-484d-8bec-db56b7a2a1b5",
  "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b4d74185-42af-4c27-a3cf-ae2291e09aa7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b4d74185-42af-4c27-a3cf-ae2291e09aa7",
  "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "assignment_id": "662a418f-42b5-484d-8bec-db56b7a2a1b5",
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

`POST /api/driver/v1/work-sessions/af5b52b2-df7d-4ec7-ba8c-857ecc89292a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:25Z",
    "sequence": 1793183965511
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "af5b52b2-df7d-4ec7-ba8c-857ecc89292a",
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
  "last_heartbeat_at": "2026-10-28T10:39:25.529245Z",
  "last_location_at": "2026-10-28T10:39:25.529245Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b4d74185-42af-4c27-a3cf-ae2291e09aa7",
  "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "assignment_id": "662a418f-42b5-484d-8bec-db56b7a2a1b5",
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

`POST /api/driver/v1/trips/b4d74185-42af-4c27-a3cf-ae2291e09aa7/arrive` → **200**

```json
{
  "command_id": "e98aa6dc-2be5-4541-ae77-d30db9c60ccf",
  "expected_version": 0
}
```

```json
{
  "id": "b4d74185-42af-4c27-a3cf-ae2291e09aa7",
  "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "assignment_id": "662a418f-42b5-484d-8bec-db56b7a2a1b5",
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
  "arrived_at": "2026-10-28T10:39:26.039118Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b4d74185-42af-4c27-a3cf-ae2291e09aa7/start` → **200**

```json
{
  "command_id": "5a6e4c36-3e21-4da6-a905-973abbe3ea75",
  "expected_version": 1
}
```

```json
{
  "id": "b4d74185-42af-4c27-a3cf-ae2291e09aa7",
  "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "assignment_id": "662a418f-42b5-484d-8bec-db56b7a2a1b5",
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
  "arrived_at": "2026-10-28T10:39:26.039118Z",
  "started_at": "2026-10-28T10:39:26.31502Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/af5b52b2-df7d-4ec7-ba8c-857ecc89292a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:26Z",
    "sequence": 1793183966570
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "af5b52b2-df7d-4ec7-ba8c-857ecc89292a",
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
  "last_heartbeat_at": "2026-10-28T10:39:26.588277Z",
  "last_location_at": "2026-10-28T10:39:26.588277Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b4d74185-42af-4c27-a3cf-ae2291e09aa7/complete` → **200**

```json
{
  "command_id": "3bf0b9c9-7cd4-40fd-ad45-4c4bf0397914",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:39:26Z",
  "cash_received": true
}
```

```json
{
  "id": "b4d74185-42af-4c27-a3cf-ae2291e09aa7",
  "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "assignment_id": "662a418f-42b5-484d-8bec-db56b7a2a1b5",
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
  "arrived_at": "2026-10-28T10:39:26.039118Z",
  "started_at": "2026-10-28T10:39:26.31502Z",
  "completed_at": "2026-10-28T10:39:26.85094Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f8598c63-4693-488e-b656-6f16e7aa8556/rating` → **200**

```json
{
  "command_id": "ceb1a1c7-bc92-4aae-a6ce-d7c4720b94f3",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "score": 5,
  "created_at": "2026-10-28T10:39:27.140100412Z"
}
```

`POST /api/driver/v1/orders/f8598c63-4693-488e-b656-6f16e7aa8556/rating` → **200**

```json
{
  "command_id": "fe57ed6d-8cd7-4b8a-9716-445d03ec53bd",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
  "score": 4,
  "created_at": "2026-10-28T10:39:27.399537286Z"
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
  "session_id": "e03e286c-d0b0-4ee7-928a-f18423a1688e",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NjgsImlhdCI6MTc5MzE4Mzk2OCwianRpIjoiM2QyMzllYTYtMzc1Ni00ZmMzLWJiYjgtYmRkYTcwMTkxYTM1Iiwic2lkIjoiZTAzZTI4NmMtZDBiMC00ZWU3LTkyOGEtZjE4NDIzYTE2ODhlIn0.7x-f0UCX5uaWQiv8Kpd6-wawlrfpWMHq7jApR4METlo",
  "access_expires_at": "2026-10-28T10:54:28.208496718Z",
  "refresh_token": "299eoJZf8tPfbOv6Kc8Sgc8G0asMfUjr2iDKlhjVHV8",
  "refresh_expires_at": "2026-10-28T22:39:28.207964355Z",
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
  "session_id": "c1b44a6e-4359-4cc0-a354-8cddbf855ef9",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NjgsImlhdCI6MTc5MzE4Mzk2OCwianRpIjoiYjgwYzE2NWItMGU3My00ZDNlLWIyYmQtMDk5NTI1OGQ5YmU1Iiwic2lkIjoiYzFiNDRhNmUtNDM1OS00Y2MwLWEzNTQtOGNkZGJmODU1ZWY5In0.ZocOFO9KIwW3VMskUME7Yv8hg-PeY-UuQ6LY89A1NJY",
  "access_expires_at": "2026-10-28T10:54:28.749359674Z",
  "refresh_token": "bS79YFDgZySmCauKpdLk3mVNA-195_M6NwgerNDE_PQ",
  "refresh_expires_at": "2026-10-28T22:39:28.748744246Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f8598c63-4693-488e-b656-6f16e7aa8556/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
      "author_type": "RIDER",
      "author_id": "65f9f7b9-c886-4ea4-8456-9ae348991032",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T10:39:27.1401Z"
    },
    {
      "order_id": "f8598c63-4693-488e-b656-6f16e7aa8556",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "65f9f7b9-c886-4ea4-8456-9ae348991032",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T10:39:27.399537Z"
    }
  ]
}
```

Done: ratings for order f8598c63-4693-488e-b656-6f16e7aa8556.

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
  "session_id": "f16470c7-4849-4e06-aac7-04a008d0e5c4",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4NjksImlhdCI6MTc5MzE4Mzk2OSwianRpIjoiZmYzZDgxODUtOTEyMS00OTRjLWE4NzctOTM0NzYzY2E3NTcwIiwic2lkIjoiZjE2NDcwYzctNDg0OS00ZTA2LWFhYzctMDRhMDA4ZDBlNWM0In0.6chHJI3yLCizNK-fdrDpcl6sO1uUDkqHpB5qeiBNIVc",
  "access_expires_at": "2026-10-28T10:54:29.582872226Z",
  "refresh_token": "EbCZ7GcWvEGfqopyrgrcKUKYHMJ3p-K_EdGxV7QFvIU",
  "refresh_expires_at": "2026-10-28T22:39:29.582291732Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5d47d8b4-0aa4-4ee1-ae1c-0e8228755b95",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "dcc8a1d2-acc9-42a6-b887-41606e974028",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:39:29.846407Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/dcc8a1d2-acc9-42a6-b887-41606e974028` → **200**

```json
{
  "id": "dcc8a1d2-acc9-42a6-b887-41606e974028",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:39:29.846407Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/dcc8a1d2-acc9-42a6-b887-41606e974028` → **200**

```json
{
  "id": "dcc8a1d2-acc9-42a6-b887-41606e974028",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:39:29.846407Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/dcc8a1d2-acc9-42a6-b887-41606e974028` → **200**

```json
{
  "id": "dcc8a1d2-acc9-42a6-b887-41606e974028",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:39:29.846407Z",
  "ready_at": "2026-10-28T10:39:31.920885Z",
  "expires_at": "2026-10-29T10:39:31.920885Z"
}
```

`GET /api/admin/v1/reports/exports/dcc8a1d2-acc9-42a6-b887-41606e974028/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a3f399f7-480d-4919-b6e9-495e2de2b3af",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:39:32.940625Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778` → **200**

```json
{
  "id": "7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:39:32.940625Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778` → **200**

```json
{
  "id": "7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:39:32.940625Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778` → **200**

```json
{
  "id": "7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:39:32.940625Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778` → **200**

```json
{
  "id": "7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:39:32.940625Z",
  "ready_at": "2026-10-28T10:39:36.928966Z",
  "expires_at": "2026-10-29T10:39:36.928966Z"
}
```

`GET /api/admin/v1/reports/exports/7ad4fd31-8b7d-437c-8d6d-3d7e8f86c778/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/25589501-eed6-4ed9-a0d2-0f150de7ba62` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/25589501-eed6-4ed9-a0d2-0f150de7ba62",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ebcd8d63-91d4-4fb4-9eda-05536c675f95"
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
  "device_ref": "sandbox-29489"
}
```

```json
{
  "challenge_id": "8be07e73-4b78-4b5a-99da-375657bcdbe2",
  "expires_at": "2026-10-28T10:44:37.518815375Z",
  "resend_available_at": "2026-10-28T10:39:38.518815375Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "905527",
  "sent_at": "2026-10-28T10:39:37.521185391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8be07e73-4b78-4b5a-99da-375657bcdbe2",
  "code": "905527",
  "device_ref": "sandbox-29489"
}
```

```json
{
  "session_id": "23b61075-9719-4857-84c6-22057d9a28da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDg3NywiaWF0IjoxNzkzMTgzOTc3LCJqdGkiOiJkMDhjOTRiZi1mYjdhLTQxMWMtODE5ZC05YmIwMDVmZWNiNTMiLCJzaWQiOiIyM2I2MTA3NS05NzE5LTQ4NTctODRjNi0yMjA1N2Q5YTI4ZGEifQ.dcDA1HdbbkTEP1GvkNfr3sZzbXBZIx62EHIEavNITBI",
  "access_expires_at": "2026-10-28T10:54:37.815635359Z",
  "refresh_token": "BukfTXFSMCUU7mRUquJou-5PCBGRSVeVUFgR9hQEhPI",
  "refresh_expires_at": "2026-11-27T10:39:37.814993911Z",
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
  "command_id": "bd3a4866-1c5b-4cbe-8404-82d0b25624e2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:38Z",
    "sequence": 1793183978562
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "56338209-8f77-4ba3-86a0-cbaef3357eb0",
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
  "last_heartbeat_at": "2026-10-28T10:39:38.579472Z",
  "last_location_at": "2026-10-28T10:39:38.579472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "8dd12b4a-1aaa-4f3e-bd3b-29b14bb7bcdb",
  "points": [
    {
      "sequence": 1793183980836,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:38:40Z"
    },
    {
      "sequence": 1793183980843,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:39:40Z"
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
  "session_id": "d36a3253-c2b3-471c-9676-36ba82cda0d5",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4ODEsImlhdCI6MTc5MzE4Mzk4MSwianRpIjoiNDJjZTllOTAtYWMwOS00NDgwLTg1YWItZGZiYWMzYThkNzdmIiwic2lkIjoiZDM2YTMyNTMtYzJiMy00NzFjLTk2NzYtMzZiYTgyY2RhMGQ1In0.16ughUefu8JUbh7dYZP8KfCWMoOHnmFtJ2_6FcN2Ru0",
  "access_expires_at": "2026-10-28T10:54:41.436043919Z",
  "refresh_token": "G4o1kxxlo2O_EKPgvuAHSmJnETbI5ftWbMlA6G6kzns",
  "refresh_expires_at": "2026-10-28T22:39:41.435464928Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "28e4af6d-a848-4d9d-9d3b-92427689fc57",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:39:40Z",
        "track_point_id": "fce8c95c-be3c-4e80-9a13-ee33958c5103",
        "work_session_id": "56338209-8f77-4ba3-86a0-cbaef3357eb0"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:39:40Z",
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

`POST /api/admin/v1/driver-risk-flags/28e4af6d-a848-4d9d-9d3b-92427689fc57/confirm` → **200**

```json
{
  "command_id": "90fb23c5-3cbb-4c27-8db7-4cf3fbe007c3",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "28e4af6d-a848-4d9d-9d3b-92427689fc57",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:39:40Z",
    "track_point_id": "fce8c95c-be3c-4e80-9a13-ee33958c5103",
    "work_session_id": "56338209-8f77-4ba3-86a0-cbaef3357eb0"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:39:40Z",
  "reason": null,
  "reviewed_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "reviewed_at": "2026-10-28T10:39:42.241892Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/28e4af6d-a848-4d9d-9d3b-92427689fc57/dismiss` → **409**

```json
{
  "command_id": "60772229-3d9c-4bc1-b7b2-685059e6d6fb",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/28e4af6d-a848-4d9d-9d3b-92427689fc57/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "67af9b76-40ba-42f8-9b37-90e024f83d8d"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "55c5d27a-3c89-4459-9032-46665e69eec9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "ab71311a-fbbd-402b-bff1-d4efdbb3be7a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "raised_at": "2026-10-28T10:39:42.775906Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/ab71311a-fbbd-402b-bff1-d4efdbb3be7a/dismiss` → **200**

```json
{
  "command_id": "25757d4c-b023-4e12-a7a1-6c94d3026997",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "ab71311a-fbbd-402b-bff1-d4efdbb3be7a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "raised_at": "2026-10-28T10:39:42.775906Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "reviewed_at": "2026-10-28T10:39:43.047893Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "dfad9698-b040-410c-b9a8-29bb715dbdda",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "28e4af6d-a848-4d9d-9d3b-92427689fc57"
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
      "actor_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:39:43.326781Z"
    }
  ]
}
```

Done: flag 28e4af6d-a848-4d9d-9d3b-92427689fc57 confirmed, suspension named it, driver reinstated.

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
  "session_id": "911514db-6348-4e25-bc10-f6aad3c7a81b",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4ODQsImlhdCI6MTc5MzE4Mzk4NCwianRpIjoiODRjMmZlYTUtNWEwYy00MTBhLWE1OGYtNWJiOWRhZTI4ODY0Iiwic2lkIjoiOTExNTE0ZGItNjM0OC00ZTI1LWJjMTAtZjZhYWQzYzdhODFiIn0.zSq01bjXonsExV-xfcdrMonw_svCzjz5OQMzqRMiwec",
  "access_expires_at": "2026-10-28T10:54:44.144979573Z",
  "refresh_token": "Y_M9KKVkIeBSiF1zRNciclQzE8rbjg3aYOjX7hZxOHE",
  "refresh_expires_at": "2026-10-28T22:39:44.144404579Z",
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
      "actor_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:39:43.326781Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "c330c7f2-40bd-4089-bae5-1557428395db",
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
  "session_id": "56338209-8f77-4ba3-86a0-cbaef3357eb0",
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
  "last_heartbeat_at": "2026-10-28T10:39:38.579472Z",
  "last_location_at": "2026-10-28T10:39:38.579472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/56338209-8f77-4ba3-86a0-cbaef3357eb0/close` → **200**

```json
{
  "command_id": "dbc0f439-ed55-4741-b778-c76ab0e7922f",
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
  "session_id": "bcce29a7-7015-408e-bb47-8582f5488631",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4ODUsImlhdCI6MTc5MzE4Mzk4NSwianRpIjoiMzhmMGM1YjEtMzQwNS00NTNmLWJjMDYtZjRjYTU2NjFkYjllIiwic2lkIjoiYmNjZTI5YTctNzAxNS00MDhlLWJiNDctODU4MmY1NDg4NjMxIn0.lSDFJeq8duy1wG5NevwrSDc0fAs9wNIR2eo9ZeGbeR4",
  "access_expires_at": "2026-10-28T10:54:45.735479955Z",
  "refresh_token": "04n6oKLcdNh9A50OoqEynPlIl-G2JdnuY0JP_E3coEk",
  "refresh_expires_at": "2026-10-28T22:39:45.734708104Z",
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
  "command_id": "10d47e76-96fd-4436-8241-4e4d630451af",
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
  "changed_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:39:46.254389Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "10d47e76-96fd-4436-8241-4e4d630451af",
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
  "changed_by": "03937974-b9ba-4260-8728-08e067d4e567",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:39:46.254389Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48289598156",
  "device_ref": "sandbox-20064"
}
```

```json
{
  "challenge_id": "be9c6d6e-30e0-400c-bfed-5fb9eb5dbd62",
  "expires_at": "2026-10-28T10:44:46.781425773Z",
  "resend_available_at": "2026-10-28T10:39:47.781425773Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48289598156` → **200**

```json
{
  "phone": "+48289598156",
  "audience": "CLIENT",
  "code": "131046",
  "sent_at": "2026-10-28T10:39:46.783773426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be9c6d6e-30e0-400c-bfed-5fb9eb5dbd62",
  "code": "131046",
  "device_ref": "sandbox-20064"
}
```

```json
{
  "session_id": "e550bcc5-1558-4aba-a969-b5619b86975f",
  "subject": {
    "type": "CLIENT",
    "id": "1ffb331d-6064-491a-864a-abbe1222bcb8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmZiMzMxZC02MDY0LTQ5MWEtODY0YS1hYmJlMTIyMmJjYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0ODg3LCJpYXQiOjE3OTMxODM5ODcsImp0aSI6IjE1ZDQ5MDU4LWQxMTgtNDUwMy04NzMyLThiNjQ4ZDVmMjVhMyIsInNpZCI6ImU1NTBiY2M1LTE1NTgtNGFiYS1hOTY5LWI1NjE5Yjg2OTc1ZiJ9.ngVOnHsjYKzfk96kd2qPjDnFNsRxZhr70wVMc7OqhC0",
  "access_expires_at": "2026-10-28T10:54:47.060039447Z",
  "refresh_token": "MoO4R6ho5sKUTM4dL6X9gi651KRp5cN2TA2ggZfRKY4",
  "refresh_expires_at": "2026-11-27T10:39:47.059466708Z",
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
  "correlation_id": "c91ba04d-f022-4684-b7df-0e7abfa81c81"
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
  "device_ref": "sandbox-26296"
}
```

```json
{
  "challenge_id": "e0305bc3-b4dd-4271-b3d9-13471cc396ce",
  "expires_at": "2026-10-28T10:44:47.820362557Z",
  "resend_available_at": "2026-10-28T10:39:48.820362557Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "505241",
  "sent_at": "2026-10-28T10:39:47.822525034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0305bc3-b4dd-4271-b3d9-13471cc396ce",
  "code": "505241",
  "device_ref": "sandbox-26296"
}
```

```json
{
  "session_id": "a5d2fd29-2f9f-499f-a6b2-baa0b57c9ed5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDg4OCwiaWF0IjoxNzkzMTgzOTg4LCJqdGkiOiJiOTM4ZWJmMi0wOTZiLTQwN2MtOTRjZS0yNzQyZjBhZmFlZDMiLCJzaWQiOiJhNWQyZmQyOS0yZjlmLTQ5OWYtYTZiMi1iYWEwYjU3YzllZDUifQ.VRO8K-mWjgdfGI6VBS25ozjtjafWPt6YTQxOIwDtk1E",
  "access_expires_at": "2026-10-28T10:54:48.117298254Z",
  "refresh_token": "0K5-3UngDVtexXvn3YaLKPUxmZhzfxj7LlSujmvN8ac",
  "refresh_expires_at": "2026-11-27T10:39:48.116800164Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4b43751d-2ffc-48b4-b80a-939ece0688b5",
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
  "last_heartbeat_at": "2026-10-28T10:39:19.941769Z",
  "last_location_at": "2026-10-28T10:39:19.941769Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4b43751d-2ffc-48b4-b80a-939ece0688b5/handover` → **200**

```json
{
  "command_id": "e173e123-d3ee-4381-a6d9-a504a4523165",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4b43751d-2ffc-48b4-b80a-939ece0688b5",
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
  "last_heartbeat_at": "2026-10-28T10:39:19.941769Z",
  "last_location_at": "2026-10-28T10:39:19.941769Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4b43751d-2ffc-48b4-b80a-939ece0688b5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:48Z",
    "sequence": 1793183988879
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4b43751d-2ffc-48b4-b80a-939ece0688b5",
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
  "last_heartbeat_at": "2026-10-28T10:39:48.897218Z",
  "last_location_at": "2026-10-28T10:39:48.897218Z",
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
  "session_id": "4b43751d-2ffc-48b4-b80a-939ece0688b5",
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
  "last_heartbeat_at": "2026-10-28T10:39:48.897218Z",
  "last_location_at": "2026-10-28T10:39:48.897218Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b43751d-2ffc-48b4-b80a-939ece0688b5/close` → **200**

```json
{
  "command_id": "43e1c432-6b09-47b5-bcb5-addb08bb176c",
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
  "correlation_id": "be608192-dd29-4e52-a9b4-c7974f533180"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673272395",
  "device_ref": "sandbox-22834"
}
```

```json
{
  "challenge_id": "07ee65b0-3e66-4ba2-a885-3ed9d0a382ae",
  "expires_at": "2026-10-28T10:44:50.191201461Z",
  "resend_available_at": "2026-10-28T10:39:51.191201461Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673272395` → **200**

```json
{
  "phone": "+380673272395",
  "audience": "CLIENT",
  "code": "836310",
  "sent_at": "2026-10-28T10:39:50.193332078Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07ee65b0-3e66-4ba2-a885-3ed9d0a382ae",
  "code": "836310",
  "device_ref": "sandbox-22834"
}
```

```json
{
  "session_id": "79b763c2-eb5a-4add-bd83-da41c4d9c25b",
  "subject": {
    "type": "CLIENT",
    "id": "e254956f-2681-45d0-9e1e-29d2131f4bd3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMjU0OTU2Zi0yNjgxLTQ1ZDAtOWUxZS0yOWQyMTMxZjRiZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0ODkwLCJpYXQiOjE3OTMxODM5OTAsImp0aSI6IjZkYjlmNWNiLTVhNmEtNGE5YS1hMWM3LTdkODYxNDI3YjA2ZSIsInNpZCI6Ijc5Yjc2M2MyLWViNWEtNGFkZC1iZDgzLWRhNDFjNGQ5YzI1YiJ9.JttVIKbK5ZJGsSnSBsNSu8gawjV-3fxWT72Y7S9XOPw",
  "access_expires_at": "2026-10-28T10:54:50.468055626Z",
  "refresh_token": "g6hbIJ1T3HhSCJVIhM338ixVYA63VlJ8QC6-IQHu6hw",
  "refresh_expires_at": "2026-11-27T10:39:50.467441056Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "b9902ec5-11f4-4b8a-94c5-a766409b0194",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "51feea44-9a41-4160-9af2-fdfd31b589f0",
  "upload_path": "/api/rider/v1/uploads/51feea44-9a41-4160-9af2-fdfd31b589f0",
  "expires_at": "2026-10-28T10:54:50.725727062Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/51feea44-9a41-4160-9af2-fdfd31b589f0` → **200**

```json
{
  "file_id": "51feea44-9a41-4160-9af2-fdfd31b589f0",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "fc33f5c1-b494-4258-9d48-c4372644f5b6",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "51feea44-9a41-4160-9af2-fdfd31b589f0"
  ]
}
```

```json
{
  "id": "b9774130-19a4-4c85-a4fa-ede095020a97",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e254956f-2681-45d0-9e1e-29d2131f4bd3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:39:51.017415Z",
  "updated_at": "2026-10-28T10:39:51.017415Z",
  "messages": [
    {
      "id": "e7b5c9f5-d8f5-4049-bd1e-5d8aa07c6a3e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e254956f-2681-45d0-9e1e-29d2131f4bd3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:39:51.019106Z",
      "attachments": [
        {
          "file_id": "51feea44-9a41-4160-9af2-fdfd31b589f0",
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
  "session_id": "4e06a97a-b48c-4649-9580-5a0e7ac2da3a",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4OTEsImlhdCI6MTc5MzE4Mzk5MSwianRpIjoiM2NhNTg3MDMtNTM1YS00OTc2LTliYjctMjdkOTQ2ZjE4MjBkIiwic2lkIjoiNGUwNmE5N2EtYjQ4Yy00NjQ5LTk1ODAtNWEwZTdhYzJkYTNhIn0.cQtw7xkQPwwSVlZvCzGRma57fJ1PIvNsTly2_qHHNTc",
  "access_expires_at": "2026-10-28T10:54:51.586792594Z",
  "refresh_token": "IzrW0dvZQPwz4-IdRRsOoPnEcxIIO5_eUIfjYFvfeaA",
  "refresh_expires_at": "2026-10-28T22:39:51.586223582Z",
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
  "session_id": "de56358d-cafd-45d8-b1d5-25f33538dbac",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4OTIsImlhdCI6MTc5MzE4Mzk5MiwianRpIjoiNjAzMGUwODMtMGVlYS00YTkzLWI5ZWUtYWNjODc1YWE4OGEzIiwic2lkIjoiZGU1NjM1OGQtY2FmZC00NWQ4LWIxZDUtMjVmMzM1MzhkYmFjIn0.2n3PxgMjBS11-QfZaK87xen2U9FJJsUxJl5WQl9K014",
  "access_expires_at": "2026-10-28T10:54:52.130101872Z",
  "refresh_token": "JAGmR7nbMj_MPfRbUZ3Nrrysf8S7SmgGQxUqB6Ev0d4",
  "refresh_expires_at": "2026-10-28T22:39:52.12924307Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/b9774130-19a4-4c85-a4fa-ede095020a97/attachments/51feea44-9a41-4160-9af2-fdfd31b589f0` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "4974855d-775f-4cf6-ae58-24b740841966",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "90ef15f1-cbc7-4a14-9c40-69902e6ef975",
  "upload_path": "/api/operator/v1/uploads/90ef15f1-cbc7-4a14-9c40-69902e6ef975",
  "expires_at": "2026-10-28T10:54:52.401190521Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/90ef15f1-cbc7-4a14-9c40-69902e6ef975` → **200**

```json
{
  "file_id": "90ef15f1-cbc7-4a14-9c40-69902e6ef975",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/b9774130-19a4-4c85-a4fa-ede095020a97` → **200**

```json
{
  "id": "b9774130-19a4-4c85-a4fa-ede095020a97",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e254956f-2681-45d0-9e1e-29d2131f4bd3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:39:51.017415Z",
  "updated_at": "2026-10-28T10:39:51.017415Z",
  "messages": [
    {
      "id": "e7b5c9f5-d8f5-4049-bd1e-5d8aa07c6a3e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e254956f-2681-45d0-9e1e-29d2131f4bd3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:39:51.019106Z",
      "attachments": [
        {
          "file_id": "51feea44-9a41-4160-9af2-fdfd31b589f0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/b9774130-19a4-4c85-a4fa-ede095020a97/comments` → **200**

```json
{
  "command_id": "64a3ce59-972d-4ea1-87ec-e599e189da52",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "90ef15f1-cbc7-4a14-9c40-69902e6ef975"
  ]
}
```

```json
{
  "id": "b9774130-19a4-4c85-a4fa-ede095020a97",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e254956f-2681-45d0-9e1e-29d2131f4bd3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:39:51.017415Z",
  "updated_at": "2026-10-28T10:39:52.957548Z",
  "messages": [
    {
      "id": "e7b5c9f5-d8f5-4049-bd1e-5d8aa07c6a3e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e254956f-2681-45d0-9e1e-29d2131f4bd3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:39:51.019106Z",
      "attachments": [
        {
          "file_id": "51feea44-9a41-4160-9af2-fdfd31b589f0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f738bf97-edc0-46d4-9574-68a08a90bf33",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:39:52.957161Z",
      "attachments": [
        {
          "file_id": "90ef15f1-cbc7-4a14-9c40-69902e6ef975",
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

`GET /api/rider/v1/support/cases/b9774130-19a4-4c85-a4fa-ede095020a97` → **200**

```json
{
  "id": "b9774130-19a4-4c85-a4fa-ede095020a97",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e254956f-2681-45d0-9e1e-29d2131f4bd3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:39:51.017415Z",
  "updated_at": "2026-10-28T10:39:52.957548Z",
  "messages": [
    {
      "id": "e7b5c9f5-d8f5-4049-bd1e-5d8aa07c6a3e",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e254956f-2681-45d0-9e1e-29d2131f4bd3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:39:51.019106Z",
      "attachments": [
        {
          "file_id": "51feea44-9a41-4160-9af2-fdfd31b589f0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f738bf97-edc0-46d4-9574-68a08a90bf33",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:39:52.957161Z",
      "attachments": [
        {
          "file_id": "90ef15f1-cbc7-4a14-9c40-69902e6ef975",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/b9774130-19a4-4c85-a4fa-ede095020a97/attachments/90ef15f1-cbc7-4a14-9c40-69902e6ef975` → **200**

Done: support case b9774130-19a4-4c85-a4fa-ede095020a97, rider attachment 51feea44-9a41-4160-9af2-fdfd31b589f0, operator attachment 90ef15f1-cbc7-4a14-9c40-69902e6ef975.

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
  "session_id": "2dc34455-f2bd-4084-b786-2a7581894681",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4OTMsImlhdCI6MTc5MzE4Mzk5MywianRpIjoiZDg4NTdjN2UtNjkwYy00ZTdmLWE1ZTUtODUyYWM0YzYzYmM3Iiwic2lkIjoiMmRjMzQ0NTUtZjJiZC00MDg0LWI3ODYtMmE3NTgxODk0NjgxIn0.5-fBq6vJuSlJON8u4HhI7yVb0Q-AnpCuYeBDQ1f0Dl8",
  "access_expires_at": "2026-10-28T10:54:53.816133742Z",
  "refresh_token": "Zaj_DRRKkeurkgOyRgXcmtGeiCv_8a25tSsaBY63GRc",
  "refresh_expires_at": "2026-10-28T22:39:53.815540144Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29486"
}
```

```json
{
  "challenge_id": "fa57429a-9b4a-4fd2-9510-5a2dff414886",
  "expires_at": "2026-10-28T10:44:54.06789689Z",
  "resend_available_at": "2026-10-28T10:39:55.06789689Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "325748",
  "sent_at": "2026-10-28T10:39:54.07012601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa57429a-9b4a-4fd2-9510-5a2dff414886",
  "code": "325748",
  "device_ref": "sandbox-29486"
}
```

```json
{
  "session_id": "19b2bc14-b711-447e-b4ee-c9f690658ace",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDg5NCwiaWF0IjoxNzkzMTgzOTk0LCJqdGkiOiIyMjQ3NmYyOS0wNjliLTQ0NjktOWIyMS1iMTA3YWNjZjlhNDAiLCJzaWQiOiIxOWIyYmMxNC1iNzExLTQ0N2UtYjRlZS1jOWY2OTA2NThhY2UifQ.IUM5HEiPhIJfL7Odc9a5LAgEmWhjeaoQKddk6AE8Qa8",
  "access_expires_at": "2026-10-28T10:54:54.343751866Z",
  "refresh_token": "0KYa_rwWurbts1jnKALr3DO_QWe60hEizAhp9DC31O8",
  "refresh_expires_at": "2026-11-27T10:39:54.342996395Z",
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
      "actor_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:39:43.326781Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "03937974-b9ba-4260-8728-08e067d4e567",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:39:44.659215Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "1c5f6869-8ace-4888-b18a-122551dbbcdf",
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
  "device_ref": "sandbox-27211"
}
```

```json
{
  "challenge_id": "5385e4b7-62cc-4642-80b6-035152e2f28a",
  "expires_at": "2026-10-28T10:44:55.373813369Z",
  "resend_available_at": "2026-10-28T10:39:56.373813369Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "899124",
  "sent_at": "2026-10-28T10:39:55.375933556Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5385e4b7-62cc-4642-80b6-035152e2f28a",
  "code": "899124",
  "device_ref": "sandbox-27211"
}
```

```json
{
  "session_id": "a9c196f4-bc97-40b4-a5f8-75b50f2f81d4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDg5NSwiaWF0IjoxNzkzMTgzOTk1LCJqdGkiOiIzYTZhMjE1NS1mZjUzLTQzYmItOGI2YS0zYTRlMTJiNDIxMGUiLCJzaWQiOiJhOWMxOTZmNC1iYzk3LTQwYjQtYTVmOC03NWI1MGYyZjgxZDQifQ.pckFNnxqKvDPHyCkAlbxrHus6BYSn-xrUS_EccgI418",
  "access_expires_at": "2026-10-28T10:54:55.65028689Z",
  "refresh_token": "026JyUUD7W5vJjoDDjJW7hFixeOaQsKUhJtNjmYw1qE",
  "refresh_expires_at": "2026-11-27T10:39:55.649607407Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "af5b52b2-df7d-4ec7-ba8c-857ecc89292a",
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
  "last_heartbeat_at": "2026-10-28T10:39:26.588277Z",
  "last_location_at": "2026-10-28T10:39:26.588277Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/af5b52b2-df7d-4ec7-ba8c-857ecc89292a/handover` → **200**

```json
{
  "command_id": "4de56fa6-8d09-4b6e-b910-bbb19e644646",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "af5b52b2-df7d-4ec7-ba8c-857ecc89292a",
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
  "last_heartbeat_at": "2026-10-28T10:39:26.588277Z",
  "last_location_at": "2026-10-28T10:39:26.588277Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/af5b52b2-df7d-4ec7-ba8c-857ecc89292a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:56Z",
    "sequence": 1793183996407
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "af5b52b2-df7d-4ec7-ba8c-857ecc89292a",
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
  "last_heartbeat_at": "2026-10-28T10:39:56.425174Z",
  "last_location_at": "2026-10-28T10:39:56.425174Z",
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
  "command_id": "a61af308-6724-4851-80b7-ff3fb50251ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:56Z",
    "sequence": 1793183996914
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63b1eaa8-5a7c-486d-8ab3-9c692abc1022",
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
  "last_heartbeat_at": "2026-10-28T10:39:56.931185Z",
  "last_location_at": "2026-10-28T10:39:56.931185Z",
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
  "session_id": "178c1e42-6e29-47d0-9e42-debd2e6b0a5d",
  "subject": {
    "type": "STAFF",
    "id": "03937974-b9ba-4260-8728-08e067d4e567"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkzNzk3NC1iOWJhLTQyNjAtODcyOC0wOGUwNjdkNGU1NjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQ4OTcsImlhdCI6MTc5MzE4Mzk5NywianRpIjoiZWVlZGQ1ZWMtN2EyOC00ZDcxLWJlOGQtNzMzMTRlZTVlNDM1Iiwic2lkIjoiMTc4YzFlNDItNmUyOS00N2QwLTllNDItZGViZDJlNmIwYTVkIn0.DYK0cUlB4hApv3vQ8rSq1wCID1BZzsudHneixID5fEs",
  "access_expires_at": "2026-10-28T10:54:57.479360031Z",
  "refresh_token": "FmsecBKxlVTUyF7JHz3fI-sa0y7ulGrzGpN4Rpi1ZRI",
  "refresh_expires_at": "2026-10-28T22:39:57.478810175Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5d48dd98-7570-4a0d-ba66-847f70ad9f66",
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
  "id": "14e1fb62-8188-40c9-864a-bf93ebe5ec04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:44:57.739344Z",
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
  "command_id": "2e3c093b-07b0-450d-bf57-2ade1812afb6",
  "quote_id": "14e1fb62-8188-40c9-864a-bf93ebe5ec04",
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
  "id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
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
  "created_at": "2026-10-28T10:39:58.000616Z",
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
    "id": "5ffdb12b-251f-4403-9850-420b44b04f1f",
    "order_id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
    "expires_at": "2026-10-28T10:40:13.005977Z",
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

`POST /api/driver/v1/offers/5ffdb12b-251f-4403-9850-420b44b04f1f/accept` → **200**

```json
{
  "command_id": "61721239-cb9b-434b-a5f5-371d8f302de4"
}
```

```json
{
  "id": "ef7ded8c-8683-48b6-be71-c9e8163412b4",
  "order_id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f09f0fa2-431c-4d79-9d0b-76d7659c9eea",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f09f0fa2-431c-4d79-9d0b-76d7659c9eea",
  "order_id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
  "assignment_id": "ef7ded8c-8683-48b6-be71-c9e8163412b4",
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

`POST /api/driver/v1/work-sessions/63b1eaa8-5a7c-486d-8ab3-9c692abc1022/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:39:59Z",
    "sequence": 1793183999299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "63b1eaa8-5a7c-486d-8ab3-9c692abc1022",
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
  "last_heartbeat_at": "2026-10-28T10:39:59.317222Z",
  "last_location_at": "2026-10-28T10:39:59.317222Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f09f0fa2-431c-4d79-9d0b-76d7659c9eea/arrive` → **200**

```json
{
  "command_id": "24d6c648-7800-4d79-a505-1d4db8c1732b",
  "expected_version": 0
}
```

```json
{
  "id": "f09f0fa2-431c-4d79-9d0b-76d7659c9eea",
  "order_id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
  "assignment_id": "ef7ded8c-8683-48b6-be71-c9e8163412b4",
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
  "arrived_at": "2026-10-28T10:39:59.584163Z",
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

`POST /api/driver/v1/trips/f09f0fa2-431c-4d79-9d0b-76d7659c9eea/start` → **200**

```json
{
  "command_id": "2ed2bf41-ac70-4224-b311-1941673937f7",
  "expected_version": 1
}
```

```json
{
  "id": "f09f0fa2-431c-4d79-9d0b-76d7659c9eea",
  "order_id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
  "assignment_id": "ef7ded8c-8683-48b6-be71-c9e8163412b4",
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
  "arrived_at": "2026-10-28T10:39:59.584163Z",
  "started_at": "2026-10-28T10:39:59.853006Z",
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

`POST /api/driver/v1/trips/f09f0fa2-431c-4d79-9d0b-76d7659c9eea/complete` → **200**

```json
{
  "command_id": "311deb9f-4b99-4045-b8de-37581f0bd5d1",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:40:00Z",
  "cash_received": true
}
```

```json
{
  "id": "f09f0fa2-431c-4d79-9d0b-76d7659c9eea",
  "order_id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
  "assignment_id": "ef7ded8c-8683-48b6-be71-c9e8163412b4",
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
  "arrived_at": "2026-10-28T10:39:59.584163Z",
  "started_at": "2026-10-28T10:39:59.853006Z",
  "completed_at": "2026-10-28T10:40:00.125827Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/2cc03698-d039-4f7f-8e08-8b3debd6f04c` → **200**

```json
{
  "id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
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
    "id": "ef7ded8c-8683-48b6-be71-c9e8163412b4",
    "order_id": "2cc03698-d039-4f7f-8e08-8b3debd6f04c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f09f0fa2-431c-4d79-9d0b-76d7659c9eea",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:39:58.000616Z",
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
  "session_id": "af5b52b2-df7d-4ec7-ba8c-857ecc89292a",
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
  "last_heartbeat_at": "2026-10-28T10:39:56.425174Z",
  "last_location_at": "2026-10-28T10:39:56.425174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/af5b52b2-df7d-4ec7-ba8c-857ecc89292a/close` → **200**

```json
{
  "command_id": "87ef8ef7-ebc6-46d6-86c9-a7aadc7ce28c",
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
  "session_id": "63b1eaa8-5a7c-486d-8ab3-9c692abc1022",
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
  "last_heartbeat_at": "2026-10-28T10:39:59.317222Z",
  "last_location_at": "2026-10-28T10:39:59.317222Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63b1eaa8-5a7c-486d-8ab3-9c692abc1022/close` → **200**

```json
{
  "command_id": "b2c36a69-6db9-4258-a1c7-8e2c10a595ce",
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

Done: terminal order 2cc03698-d039-4f7f-8e08-8b3debd6f04c by Andrii (5a000000-0000-4000-8000-000000000403).
