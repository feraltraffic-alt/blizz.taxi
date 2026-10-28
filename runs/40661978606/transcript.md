# Sandbox transcript (2026-10-28T09:09:46Z, fcbbb8b)

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
  "correlation_id": "798cfb25-05ae-4c36-8f1d-18a5be527aea"
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
  "session_id": "aed22db6-e9ac-44c4-9e60-7895b936ee77",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk0ODYsImlhdCI6MTc5MzE3ODU4NiwianRpIjoiNjNhY2I0ZjctZWQwMy00YmE0LTg0MDgtNjU4YjJiYWUzNzRiIiwic2lkIjoiYWVkMjJkYjYtZTlhYy00NGM0LTllNjAtNzg5NWI5MzZlZTc3In0.APzxn9oL9ejNl518nCS2jit4VgcbRE8tjZcpQj5ET-8",
  "access_expires_at": "2026-10-28T09:24:46.805583925Z",
  "refresh_token": "M96ft2c7A3TtQyR95DwXirYdxHK3VNN4amb09g8oAMA",
  "refresh_expires_at": "2026-10-28T21:09:46.80387623Z",
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
  "session_id": "e4645cf8-90cc-494c-b616-2e7dcf377c26",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk0ODcsImlhdCI6MTc5MzE3ODU4NywianRpIjoiOGNkNGM3ODktZDg2OC00Y2EwLWI2YjYtYmZlOGY0MjEzNDMwIiwic2lkIjoiZTQ2NDVjZjgtOTBjYy00OTRjLWI2MTYtMmU3ZGNmMzc3YzI2In0.YFEr-DkhxGhbOjlMsffAn4hP3qjcrvd70HBScxVnFf4",
  "access_expires_at": "2026-10-28T09:24:47.958323632Z",
  "refresh_token": "aQIiIl2X2ItkiT_AflmfybSmfjww_XxSdq__7Tw4bI8",
  "refresh_expires_at": "2026-10-28T21:09:47.957420642Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "b5c1bc69-efc7-4aca-a1e5-6997d22d6331",
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
  "id": "3046bcb4-2cdd-4246-bfab-ec1a73566132",
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
  "created_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "created_at": "2026-10-28T09:09:48.016274Z",
  "updated_at": "2026-10-28T09:09:48.016274Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630330932",
  "device_ref": "sandbox-3955"
}
```

```json
{
  "challenge_id": "5a8cdc8d-3430-45b0-9b0f-e33fa9734471",
  "expires_at": "2026-10-28T09:14:48.060599287Z",
  "resend_available_at": "2026-10-28T09:09:49.060599287Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630330932` → **200**

```json
{
  "phone": "+380630330932",
  "audience": "CLIENT",
  "code": "601806",
  "sent_at": "2026-10-28T09:09:48.067670342Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a8cdc8d-3430-45b0-9b0f-e33fa9734471",
  "code": "601806",
  "device_ref": "sandbox-3955"
}
```

```json
{
  "session_id": "e05d66a4-c7ae-4d7e-9d8f-c39a9a1b20c9",
  "subject": {
    "type": "CLIENT",
    "id": "4576d6fc-ce0f-450a-a0d8-4d96c8ce3f43"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTc2ZDZmYy1jZTBmLTQ1MGEtYTBkOC00ZDk2YzhjZTNmNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NDg4LCJpYXQiOjE3OTMxNzg1ODgsImp0aSI6IjI0YTM2MTZmLWVlYWYtNGQ5Yi04NjVkLTk5M2IxZTBkMjU3NCIsInNpZCI6ImUwNWQ2NmE0LWM3YWUtNGQ3ZS05ZDhmLWMzOWE5YTFiMjBjOSJ9.REZ-Z6w0-Gt1V_DQLZcmkVRzHRoi4C11IfQ9ad99exQ",
  "access_expires_at": "2026-10-28T09:24:48.140006626Z",
  "refresh_token": "kL4FPD4c80tPPjdBJtMh64_eMpSZcVL122UA49UJIZw",
  "refresh_expires_at": "2026-11-27T09:09:48.139178271Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630330932` → **200**

```json
{
  "client_id": "4576d6fc-ce0f-450a-a0d8-4d96c8ce3f43"
}
```

`POST /api/admin/v1/rider-wallets/4576d6fc-ce0f-450a-a0d8-4d96c8ce3f43/top-ups` → **201**

```json
{
  "command_id": "4e05d8ef-4cc4-4baa-b3d2-3f578dfda8aa",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "4576d6fc-ce0f-450a-a0d8-4d96c8ce3f43",
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
      "id": "923fd5a2-8b07-4c06-8a81-013ffc6ae4fe",
      "at": "2026-10-28T09:09:48.212039Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b9571a25-5185-4329-bc73-d015b95c13cb",
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
  "id": "abab54ca-38f7-4c99-bef1-dc7b2d497b31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:14:48.351473Z",
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
      "id": "3046bcb4-2cdd-4246-bfab-ec1a73566132",
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
  "device_ref": "sandbox-2756"
}
```

```json
{
  "challenge_id": "98048121-37b8-4225-a4f1-01d92b3a53dd",
  "expires_at": "2026-10-28T09:14:48.414144053Z",
  "resend_available_at": "2026-10-28T09:09:49.414144053Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "493944",
  "sent_at": "2026-10-28T09:09:48.568334413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98048121-37b8-4225-a4f1-01d92b3a53dd",
  "code": "493944",
  "device_ref": "sandbox-2756"
}
```

```json
{
  "session_id": "fa77b99f-3293-4174-a183-55a47bd03db5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTQ4OCwiaWF0IjoxNzkzMTc4NTg4LCJqdGkiOiI1ZTI3NzBjZi1lOWY3LTQzMWEtOTI4Yi0yNTY1ZjU0OGFkMTgiLCJzaWQiOiJmYTc3Yjk5Zi0zMjkzLTQxNzQtYTE4My01NWE0N2JkMDNkYjUifQ.MD8tVT1qaAH27I5emYr0qpUOK5ecuRJCC3ga-RuryY0",
  "access_expires_at": "2026-10-28T09:24:48.624559194Z",
  "refresh_token": "vU31J21QnLQ8Ixpg61v0NoH4-YRFJgP-h4rvQ24vBJo",
  "refresh_expires_at": "2026-11-27T09:09:48.623663695Z",
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
  "command_id": "a95aa9f4-5fda-4961-bbbe-1e9ee05cee86",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:09:48Z",
    "sequence": 1793178588684
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "60e82ada-ac53-48b5-aeb2-fa6914b643ba",
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
  "last_heartbeat_at": "2026-10-28T09:09:48.819326Z",
  "last_location_at": "2026-10-28T09:09:48.819326Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7e303664-5d63-453e-9b38-ccfc0f4c9ddf",
  "quote_id": "abab54ca-38f7-4c99-bef1-dc7b2d497b31",
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
  "id": "f005b7e9-da3d-4b59-a34b-745e9ec90448",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4576d6fc-ce0f-450a-a0d8-4d96c8ce3f43",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:09:48.897794Z",
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
  "client_id": "4576d6fc-ce0f-450a-a0d8-4d96c8ce3f43",
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
      "id": "923fd5a2-8b07-4c06-8a81-013ffc6ae4fe",
      "at": "2026-10-28T09:09:48.212039Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
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
    "id": "187c9a82-7100-4e0e-b0e3-10f91f904215",
    "order_id": "f005b7e9-da3d-4b59-a34b-745e9ec90448",
    "expires_at": "2026-10-28T09:10:03.910945Z",
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

`POST /api/driver/v1/offers/187c9a82-7100-4e0e-b0e3-10f91f904215/accept` → **200**

```json
{
  "command_id": "1487a0c8-13d3-44bb-9e31-ab613b7da3d3"
}
```

```json
{
  "id": "ef3c6ae3-ff89-45c0-b9b1-6a800e89bed1",
  "order_id": "f005b7e9-da3d-4b59-a34b-745e9ec90448",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c7f7cca-e4ad-4ec2-ab45-20abc9d84881",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1c7f7cca-e4ad-4ec2-ab45-20abc9d84881",
  "order_id": "f005b7e9-da3d-4b59-a34b-745e9ec90448",
  "assignment_id": "ef3c6ae3-ff89-45c0-b9b1-6a800e89bed1",
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

`POST /api/driver/v1/work-sessions/60e82ada-ac53-48b5-aeb2-fa6914b643ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:09:49Z",
    "sequence": 1793178589216
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "60e82ada-ac53-48b5-aeb2-fa6914b643ba",
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
  "last_heartbeat_at": "2026-10-28T09:09:49.239784Z",
  "last_location_at": "2026-10-28T09:09:49.239784Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1c7f7cca-e4ad-4ec2-ab45-20abc9d84881/arrive` → **200**

```json
{
  "command_id": "700dec4c-10b3-40d7-a3df-cc8eadf366af",
  "expected_version": 0
}
```

```json
{
  "id": "1c7f7cca-e4ad-4ec2-ab45-20abc9d84881",
  "order_id": "f005b7e9-da3d-4b59-a34b-745e9ec90448",
  "assignment_id": "ef3c6ae3-ff89-45c0-b9b1-6a800e89bed1",
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
  "arrived_at": "2026-10-28T09:09:49.396044Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1c7f7cca-e4ad-4ec2-ab45-20abc9d84881/start` → **200**

```json
{
  "command_id": "48f66d76-1007-4e6c-9236-cc589cb81b84",
  "expected_version": 1
}
```

```json
{
  "id": "1c7f7cca-e4ad-4ec2-ab45-20abc9d84881",
  "order_id": "f005b7e9-da3d-4b59-a34b-745e9ec90448",
  "assignment_id": "ef3c6ae3-ff89-45c0-b9b1-6a800e89bed1",
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
  "arrived_at": "2026-10-28T09:09:49.396044Z",
  "started_at": "2026-10-28T09:09:49.438444Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/1c7f7cca-e4ad-4ec2-ab45-20abc9d84881/complete` → **200**

```json
{
  "command_id": "563fdf0d-1202-48c6-a3bb-269d325023de",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:09:49Z",
  "cash_received": true
}
```

```json
{
  "id": "1c7f7cca-e4ad-4ec2-ab45-20abc9d84881",
  "order_id": "f005b7e9-da3d-4b59-a34b-745e9ec90448",
  "assignment_id": "ef3c6ae3-ff89-45c0-b9b1-6a800e89bed1",
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
  "arrived_at": "2026-10-28T09:09:49.396044Z",
  "started_at": "2026-10-28T09:09:49.438444Z",
  "completed_at": "2026-10-28T09:09:49.497101Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "4576d6fc-ce0f-450a-a0d8-4d96c8ce3f43",
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
      "id": "14f7da3f-d095-46dc-828a-45d7edb09deb",
      "at": "2026-10-28T09:09:50.108748Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f005b7e9-da3d-4b59-a34b-745e9ec90448"
    },
    {
      "id": "923fd5a2-8b07-4c06-8a81-013ffc6ae4fe",
      "at": "2026-10-28T09:09:48.212039Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/3046bcb4-2cdd-4246-bfab-ec1a73566132/archive` → **200**

```json
{
  "command_id": "ae4ccc3e-86b1-484c-987b-4b18981fa722",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "3046bcb4-2cdd-4246-bfab-ec1a73566132",
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
  "created_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "created_at": "2026-10-28T09:09:48.016274Z",
  "updated_at": "2026-10-28T09:09:52.618836Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "60e82ada-ac53-48b5-aeb2-fa6914b643ba",
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
  "last_heartbeat_at": "2026-10-28T09:09:49.239784Z",
  "last_location_at": "2026-10-28T09:09:49.239784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/60e82ada-ac53-48b5-aeb2-fa6914b643ba/close` → **200**

```json
{
  "command_id": "ba937ae1-8b1c-489e-a1b4-e6a41f070663",
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

Done: order f005b7e9-da3d-4b59-a34b-745e9ec90448.

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
  "session_id": "6886d5ed-edcd-417d-9166-d561704d7b2a",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk0OTIsImlhdCI6MTc5MzE3ODU5MiwianRpIjoiZmI0NDIyZDEtZDI2ZC00YTlhLWI3N2ItZDlhMDI5NTg1N2UyIiwic2lkIjoiNjg4NmQ1ZWQtZWRjZC00MTdkLTkxNjYtZDU2MTcwNGQ3YjJhIn0.O8-WWbYLJ-8FDZIoDFLDI0RsMgVwf_IvO1cwtwJYyOY",
  "access_expires_at": "2026-10-28T09:24:52.996256447Z",
  "refresh_token": "A2WeHvyvaILEvPVQeiD3KOIcTBxr46VxoUzfITwgxGM",
  "refresh_expires_at": "2026-10-28T21:09:52.995521862Z",
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
  "command_id": "981da12d-dfff-4d0d-9194-370470db8401",
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
  "session_id": "393f73ae-969d-4e45-95e8-76bf0c70a0e3",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk0OTMsImlhdCI6MTc5MzE3ODU5MywianRpIjoiYzlkM2Y1MzQtZDA5MC00Zjg5LTkwMTktZWNlYmFiMjE3NzAwIiwic2lkIjoiMzkzZjczYWUtOTY5ZC00ZTQ1LTk1ZTgtNzZiZjBjNzBhMGUzIn0.-o1SpMb4LB1nSuOCGCUmPt8UNuFFGI5bLXGQ01Tuc9M",
  "access_expires_at": "2026-10-28T09:24:53.500973425Z",
  "refresh_token": "JhgU6QsoJE6vFMHi_5k3qSVtHgwZZ-rCq5rihKCSXwA",
  "refresh_expires_at": "2026-10-28T21:09:53.500315458Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.740631488",
    "linkedid": "1730052700.740631488",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677972945"
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
    "id": "1730052700.740631488",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "3f82dc50-a30d-48c7-a422-654e15542ef7",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677972945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:09:53.52797Z",
      "answered_at": null,
      "ended_at": "2026-10-28T09:09:53.551859Z",
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
    "id": "1730052600.187794339",
    "linkedid": "1730052600.187794339",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677972945"
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
      "id": "e1437310-c157-444d-995a-f4ff7619cb5b",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677972945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:09:53.614848Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/e1437310-c157-444d-995a-f4ff7619cb5b/answer` → **200**

```json
{
  "command_id": "3d17ab7c-76b6-4a8f-8127-079455727272"
}
```

```json
{
  "id": "e1437310-c157-444d-995a-f4ff7619cb5b",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677972945",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "order_ids": [],
  "started_at": "2026-10-28T09:09:53.614848Z",
  "answered_at": "2026-10-28T09:09:53.677246Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.187794339",
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
    "id": "1730052600.187794339",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e1437310-c157-444d-995a-f4ff7619cb5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677972945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [],
      "started_at": "2026-10-28T09:09:53.614848Z",
      "answered_at": "2026-10-28T09:09:53.677246Z",
      "ended_at": "2026-10-28T09:09:53.816892Z",
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
      "id": "e1437310-c157-444d-995a-f4ff7619cb5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677972945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [],
      "started_at": "2026-10-28T09:09:53.614848Z",
      "answered_at": "2026-10-28T09:09:53.677246Z",
      "ended_at": "2026-10-28T09:09:53.816892Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:09:55.027854Z"
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
      "id": "e1437310-c157-444d-995a-f4ff7619cb5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677972945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [],
      "started_at": "2026-10-28T09:09:53.614848Z",
      "answered_at": "2026-10-28T09:09:53.677246Z",
      "ended_at": "2026-10-28T09:09:53.816892Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:09:55.027854Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/e1437310-c157-444d-995a-f4ff7619cb5b/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/e1437310-c157-444d-995a-f4ff7619cb5b/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=e1437310-c157-444d-995a-f4ff7619cb5b` → **200**

```json
{
  "changes": [
    {
      "id": "bbf83147-b080-40e2-8dd6-9ef4eec87407",
      "occurred_at": "2026-10-28T09:09:55.960496Z",
      "actor_type": "STAFF",
      "actor_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e1437310-c157-444d-995a-f4ff7619cb5b",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"81a21c63-cb7f-4b0b-829b-4dbcbc26a9a7\", \"order_ids\": []}",
      "correlation_id": "8f074d58-b7cf-4b5e-a340-991ea3b30125"
    },
    {
      "id": "400d67ef-c39d-4e6e-9d8e-28eda4981131",
      "occurred_at": "2026-10-28T09:09:55.930166Z",
      "actor_type": "STAFF",
      "actor_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e1437310-c157-444d-995a-f4ff7619cb5b",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"81a21c63-cb7f-4b0b-829b-4dbcbc26a9a7\", \"order_ids\": []}",
      "correlation_id": "80d04988-2311-4c51-9390-f74bc42d031f"
    }
  ]
}
```

Done: call e1437310-c157-444d-995a-f4ff7619cb5b recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636396335",
  "device_ref": "sandbox-10318"
}
```

```json
{
  "challenge_id": "324234a5-72e8-4a98-a545-ef4056ec8b89",
  "expires_at": "2026-10-28T09:14:56.0296838Z",
  "resend_available_at": "2026-10-28T09:09:57.0296838Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636396335` → **200**

```json
{
  "phone": "+380636396335",
  "audience": "CLIENT",
  "code": "201165",
  "sent_at": "2026-10-28T09:09:56.032733286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "324234a5-72e8-4a98-a545-ef4056ec8b89",
  "code": "201165",
  "device_ref": "sandbox-10318"
}
```

```json
{
  "session_id": "d43b2120-ee4e-48a6-8ac0-4dfb2a3ecf66",
  "subject": {
    "type": "CLIENT",
    "id": "e1a28cb5-b5b5-461c-ab2a-cb38272fcb98"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWEyOGNiNS1iNWI1LTQ2MWMtYWIyYS1jYjM4MjcyZmNiOTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NDk2LCJpYXQiOjE3OTMxNzg1OTYsImp0aSI6ImI1MWUyN2ZlLWQzMDItNGM1ZC1iYmE1LTczMjU2N2M4N2Q1YSIsInNpZCI6ImQ0M2IyMTIwLWVlNGUtNDhhNi04YWMwLTRkZmIyYTNlY2Y2NiJ9.e2fWuXxBGO5nSaa3rE2OPdz9siWsKdOpuHoWd_0H1Is",
  "access_expires_at": "2026-10-28T09:24:56.087138636Z",
  "refresh_token": "oyj2zuEppT7hVzcoJ6TQb2rDCGi65YCGy2oDd4MpGD8",
  "refresh_expires_at": "2026-11-27T09:09:56.086558438Z",
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
  "device_ref": "sandbox-23455"
}
```

```json
{
  "challenge_id": "77904dbc-55ca-410a-bf1f-7c57b224d6bf",
  "expires_at": "2026-10-28T09:14:56.141666967Z",
  "resend_available_at": "2026-10-28T09:09:57.141666967Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "796876",
  "sent_at": "2026-10-28T09:09:56.144487625Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77904dbc-55ca-410a-bf1f-7c57b224d6bf",
  "code": "796876",
  "device_ref": "sandbox-23455"
}
```

```json
{
  "session_id": "2ef64a53-e242-4087-972f-e1624072f7fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTQ5NiwiaWF0IjoxNzkzMTc4NTk2LCJqdGkiOiI2NDUxZWQ3My0wYTU4LTQ4YjUtODBmYi1kYTUyM2E4OTZmNWQiLCJzaWQiOiIyZWY2NGE1My1lMjQyLTQwODctOTcyZi1lMTYyNDA3MmY3ZmIifQ.7weczw3MROZRoVNDPR10PKD8XPEn7GyDaOERlVigQAQ",
  "access_expires_at": "2026-10-28T09:24:56.198555095Z",
  "refresh_token": "aLcOsjhnfhO_qcVLwwFnJpQdG6pZSHlq8rylJhbcjZo",
  "refresh_expires_at": "2026-11-27T09:09:56.197954879Z",
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
  "session_id": "e3d510bd-76a4-44f8-be1b-bf2e66df3edc",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk0OTYsImlhdCI6MTc5MzE3ODU5NiwianRpIjoiOGIwZTQyZTQtNGE4Ni00NTNhLTk0NzEtNzVhMjJjY2MxNjkxIiwic2lkIjoiZTNkNTEwYmQtNzZhNC00NGY4LWJlMWItYmYyZTY2ZGYzZWRjIn0.9QaqMJUhTmrivu9obBuSd3eVWOQePx59Ul8EK3iKTKA",
  "access_expires_at": "2026-10-28T09:24:56.506121647Z",
  "refresh_token": "kYJ1hV1nujHQHQ7FEl29a6Rch4novHOSIDTZ3gnBr3U",
  "refresh_expires_at": "2026-10-28T21:09:56.505597944Z",
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
  "session_id": "1cff08dc-0c1e-467d-821a-5377c6b9a0d6",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk0OTYsImlhdCI6MTc5MzE3ODU5NiwianRpIjoiNTBhYzMyOTMtZWRlNS00ZWUzLTk5NmYtMDg4ZTM2YjkyOTRjIiwic2lkIjoiMWNmZjA4ZGMtMGMxZS00NjdkLTgyMWEtNTM3N2M2YjlhMGQ2In0.BwUIgNduEl4urXLQ6nV-XqBNUJuEfl97z2lSxu3LrRs",
  "access_expires_at": "2026-10-28T09:24:56.822910519Z",
  "refresh_token": "3Q2yfZaagMf42-DVGaeVzx87wibU2nEoc9g093fVX58",
  "refresh_expires_at": "2026-10-28T21:09:56.821116509Z",
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
  "command_id": "55cae663-6acb-4569-99f2-057b9a390e50",
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
  "id": "a007ea5e-523f-45a4-8dbd-bd86d215ce43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:14:56.913136Z",
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
  "command_id": "43eaf3e7-acb0-4afd-8ea6-df66d6c46097",
  "quote_id": "a007ea5e-523f-45a4-8dbd-bd86d215ce43",
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
  "id": "dd100728-5d66-4839-bb0f-5288ee5cfc4d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1a28cb5-b5b5-461c-ab2a-cb38272fcb98",
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
  "created_at": "2026-10-28T09:09:56.955016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/dd100728-5d66-4839-bb0f-5288ee5cfc4d` → **200**

```json
{
  "id": "dd100728-5d66-4839-bb0f-5288ee5cfc4d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1a28cb5-b5b5-461c-ab2a-cb38272fcb98",
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
  "created_at": "2026-10-28T09:09:56.955016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/dd100728-5d66-4839-bb0f-5288ee5cfc4d/cancel` → **200**

```json
{
  "command_id": "622e9b09-585c-4ac7-840c-56f045403fdc",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "dd100728-5d66-4839-bb0f-5288ee5cfc4d",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e1a28cb5-b5b5-461c-ab2a-cb38272fcb98",
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
  "created_at": "2026-10-28T09:09:56.955016Z",
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
  "command_id": "96505e9e-7098-4bf0-9c72-f2534356e5f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:09:57Z",
    "sequence": 1793178597897
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f101d872-2e64-4939-b908-a42bb32803ae",
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
  "last_heartbeat_at": "2026-10-28T09:09:57.108526Z",
  "last_location_at": "2026-10-28T09:09:57.108526Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1986"
}
```

```json
{
  "challenge_id": "301cf44c-b8a7-42ce-a81c-f3ed657603eb",
  "expires_at": "2026-10-28T09:14:57.138236234Z",
  "resend_available_at": "2026-10-28T09:09:58.138236234Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "031079",
  "sent_at": "2026-10-28T09:09:57.141149939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "301cf44c-b8a7-42ce-a81c-f3ed657603eb",
  "code": "031079",
  "device_ref": "sandbox-1986"
}
```

```json
{
  "session_id": "9ae5edb6-f31d-4025-bce2-0bac0a11a4a6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTQ5NywiaWF0IjoxNzkzMTc4NTk3LCJqdGkiOiIzNzY2NjE5Yy02MjIzLTRlMmYtYTBiOS1iZmVhZDVkOWY0NzQiLCJzaWQiOiI5YWU1ZWRiNi1mMzFkLTQwMjUtYmNlMi0wYmFjMGExMWE0YTYifQ.HSWENuUxkCmwvuM2n_apVkEbyZP6vbDMaUkkOfwwni4",
  "access_expires_at": "2026-10-28T09:24:57.217971903Z",
  "refresh_token": "TlcC6cCqMBWgaeDkVO-GdIVSw7_cl6BhoUMYPtxJFig",
  "refresh_expires_at": "2026-11-27T09:09:57.217249866Z",
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
  "command_id": "a6378921-b6e8-4463-b72f-87291e0179f7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:09:57Z",
    "sequence": 1793178597898
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "016178db-5d56-4869-888c-9eea539362ce",
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
  "last_heartbeat_at": "2026-10-28T09:09:57.285043Z",
  "last_location_at": "2026-10-28T09:09:57.285043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0c04006a-a1d8-4943-bbf5-3e08e2fe69eb",
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
  "id": "3ac3416a-e833-4463-bd04-a5e4056f034c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:14:57.322596Z",
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
  "command_id": "1fe76120-812d-47b5-9e3d-98071488e941",
  "quote_id": "3ac3416a-e833-4463-bd04-a5e4056f034c",
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
  "id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1a28cb5-b5b5-461c-ab2a-cb38272fcb98",
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
  "created_at": "2026-10-28T09:09:57.360717Z",
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
    "id": "0324abbc-f2bd-47cb-970a-55e00cb9836b",
    "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
    "expires_at": "2026-10-28T09:10:12.364423Z",
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

`POST /api/driver/v1/offers/0324abbc-f2bd-47cb-970a-55e00cb9836b/accept` → **200**

```json
{
  "command_id": "3ac0c705-3d16-4ab3-bebf-dc2abe38a9cd"
}
```

```json
{
  "id": "6645bb04-6950-47ec-88d6-b30b8b47c21b",
  "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eaf82a85-4e2a-48e0-b06f-b6e5466144fe",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eaf82a85-4e2a-48e0-b06f-b6e5466144fe",
  "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
  "assignment_id": "6645bb04-6950-47ec-88d6-b30b8b47c21b",
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

`POST /api/driver/v1/trips/eaf82a85-4e2a-48e0-b06f-b6e5466144fe/cancel` → **200**

```json
{
  "command_id": "e6fce3ef-e848-4b3a-aad9-973ec6c46b64",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "eaf82a85-4e2a-48e0-b06f-b6e5466144fe",
  "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
  "assignment_id": "6645bb04-6950-47ec-88d6-b30b8b47c21b",
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

`GET /api/rider/v1/orders/de9dc158-cdea-4e32-9a87-583c59b2a929` → **200**

```json
{
  "id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e1a28cb5-b5b5-461c-ab2a-cb38272fcb98",
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
    "id": "6645bb04-6950-47ec-88d6-b30b8b47c21b",
    "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "eaf82a85-4e2a-48e0-b06f-b6e5466144fe",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:09:57.360717Z",
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
    "id": "af65ce0d-5336-43e1-98ad-64141f4851b8",
    "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
    "expires_at": "2026-10-28T09:10:12.682723Z",
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

`POST /api/driver/v1/offers/af65ce0d-5336-43e1-98ad-64141f4851b8/accept` → **200**

```json
{
  "command_id": "91183aeb-8b80-46b3-8917-82c4a18438f6"
}
```

```json
{
  "id": "ec086f37-57ee-43fe-b075-a0ca959568ed",
  "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "daadf4a3-afe0-44f2-a19b-f12ad5d8f580",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "daadf4a3-afe0-44f2-a19b-f12ad5d8f580",
  "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
  "assignment_id": "ec086f37-57ee-43fe-b075-a0ca959568ed",
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

`POST /api/driver/v1/trips/daadf4a3-afe0-44f2-a19b-f12ad5d8f580/cancel` → **200**

```json
{
  "command_id": "8a9e5b28-767b-433c-b7e8-7a163a0a6e1d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "daadf4a3-afe0-44f2-a19b-f12ad5d8f580",
  "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
  "assignment_id": "ec086f37-57ee-43fe-b075-a0ca959568ed",
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
    "id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:09:57.360717Z",
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
    "id": "dd100728-5d66-4839-bb0f-5288ee5cfc4d",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:09:56.955016Z",
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

`GET /api/operator/v1/orders/de9dc158-cdea-4e32-9a87-583c59b2a929/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:09:57.361357Z",
      "actor": {
        "type": "CLIENT",
        "id": "e1a28cb5-b5b5-461c-ab2a-cb38272fcb98",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
        "quote_id": "3ac3416a-e833-4463-bd04-a5e4056f034c",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:09:57.363348Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
        "attempt_id": "c0485954-87db-490a-a76b-63a12541b386",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:09:57.369874Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0324abbc-f2bd-47cb-970a-55e00cb9836b",
        "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:09:57.608038Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0324abbc-f2bd-47cb-970a-55e00cb9836b",
        "order_id": "de9dc158-cdea-4e32-9a87-583c59b2a929",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6645bb04-6950-47ec-88d6-b30b8b47c21b"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders dd100728-5d66-4839-bb0f-5288ee5cfc4d, de9dc158-cdea-4e32-9a87-583c59b2a929.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737583020",
  "device_ref": "sandbox-14423"
}
```

```json
{
  "challenge_id": "d10955ff-11c6-4d98-85ae-36ba0a9def42",
  "expires_at": "2026-10-28T09:14:58.023456912Z",
  "resend_available_at": "2026-10-28T09:09:59.023456912Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737583020` → **200**

```json
{
  "phone": "+380737583020",
  "audience": "CLIENT",
  "code": "928548",
  "sent_at": "2026-10-28T09:09:58.027329082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d10955ff-11c6-4d98-85ae-36ba0a9def42",
  "code": "928548",
  "device_ref": "sandbox-14423"
}
```

```json
{
  "session_id": "286a40d7-84ea-4889-8ac2-d0368a7b1be2",
  "subject": {
    "type": "CLIENT",
    "id": "cd220d8a-84cd-4ec6-80e5-5b7dd9484956"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDIyMGQ4YS04NGNkLTRlYzYtODBlNS01YjdkZDk0ODQ5NTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NDk4LCJpYXQiOjE3OTMxNzg1OTgsImp0aSI6ImQwM2MzY2RjLWZkOTgtNDNhYy04YTM2LTZiODlmYjEwYTdlNCIsInNpZCI6IjI4NmE0MGQ3LTg0ZWEtNDg4OS04YWMyLWQwMzY4YTdiMWJlMiJ9.3OeLxv3mfLu5fTxqFwIqiYPhVuL_OrvQhoYatrUwnns",
  "access_expires_at": "2026-10-28T09:24:58.09961562Z",
  "refresh_token": "vAPBpOCAqi0jmUkFYFf8KvqKQMcxSS2ZbmF25GKbY-Y",
  "refresh_expires_at": "2026-11-27T09:09:58.098944749Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "22e3c400-aa1b-484e-ad96-dc1d4dcb033a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "5f5623ba-d0fd-41d0-8fc0-76309efd2287",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-5f5623ba-d0fd-41d0-8fc0-76309efd2287",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "383a8420b810697bf45189b89d480d61",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=5f5623ba-d0fd-41d0-8fc0-76309efd2287",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737583020"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=5f5623ba-d0fd-41d0-8fc0-76309efd2287",
  "expires_at": "2026-10-28T09:39:58.136882Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/5f5623ba-d0fd-41d0-8fc0-76309efd2287` → **200**

```json
{
  "id": "5f5623ba-d0fd-41d0-8fc0-76309efd2287",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T09:39:58.136882Z",
  "card": {
    "id": "14085d83-7566-44b3-a81a-870c3b5f0939",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8616",
    "card_type": "Visa",
    "created_at": "2026-10-28T09:09:58.184565Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "14085d83-7566-44b3-a81a-870c3b5f0939",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8616",
      "card_type": "Visa",
      "created_at": "2026-10-28T09:09:58.184565Z"
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
  "device_ref": "sandbox-6139"
}
```

```json
{
  "challenge_id": "610aa638-28d0-41e1-9a43-a65d89889117",
  "expires_at": "2026-10-28T09:14:58.261370499Z",
  "resend_available_at": "2026-10-28T09:09:59.261370499Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "506284",
  "sent_at": "2026-10-28T09:09:58.2638828Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "610aa638-28d0-41e1-9a43-a65d89889117",
  "code": "506284",
  "device_ref": "sandbox-6139"
}
```

```json
{
  "session_id": "d7e8c76d-990c-4f41-953d-423d95ee9987",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTQ5OCwiaWF0IjoxNzkzMTc4NTk4LCJqdGkiOiJlNGZhOTUwOC0yMzI3LTQ2ZDQtYWM0My0zZDQ5ZmI0MDg4YmYiLCJzaWQiOiJkN2U4Yzc2ZC05OTBjLTRmNDEtOTUzZC00MjNkOTVlZTk5ODcifQ.JxrbCDvd41-QLJkRyw4ZrFoP8VPZOvaNoVSbNmIy3Es",
  "access_expires_at": "2026-10-28T09:24:58.398249285Z",
  "refresh_token": "ftoFnMl0IwTCG9LtswhRU-YTl96KAfYlK30zwVWWovY",
  "refresh_expires_at": "2026-11-27T09:09:58.397638801Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "016178db-5d56-4869-888c-9eea539362ce",
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
  "last_heartbeat_at": "2026-10-28T09:09:57.285043Z",
  "last_location_at": "2026-10-28T09:09:57.285043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/016178db-5d56-4869-888c-9eea539362ce/handover` → **200**

```json
{
  "command_id": "f5400fe7-d0e3-4ee7-9fab-04d5f7baf8bd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "016178db-5d56-4869-888c-9eea539362ce",
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
  "last_heartbeat_at": "2026-10-28T09:09:57.285043Z",
  "last_location_at": "2026-10-28T09:09:57.285043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/016178db-5d56-4869-888c-9eea539362ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:09:58Z",
    "sequence": 1793178598493
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "016178db-5d56-4869-888c-9eea539362ce",
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
  "last_heartbeat_at": "2026-10-28T09:09:58.515142Z",
  "last_location_at": "2026-10-28T09:09:58.515142Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d7c466c3-3b12-4f36-bdb5-da51d9541d29",
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
  "id": "5435a816-d959-4404-9f87-16083afcce82",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:14:58.554223Z",
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
  "command_id": "d7da8131-1cca-49ec-b299-bf2496db2138",
  "quote_id": "5435a816-d959-4404-9f87-16083afcce82",
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
  "id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cd220d8a-84cd-4ec6-80e5-5b7dd9484956",
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
  "created_at": "2026-10-28T09:09:58.595794Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b` → **200**

```json
{
  "id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cd220d8a-84cd-4ec6-80e5-5b7dd9484956",
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
  "created_at": "2026-10-28T09:09:58.595794Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b` → **200**

```json
{
  "id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cd220d8a-84cd-4ec6-80e5-5b7dd9484956",
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
  "created_at": "2026-10-28T09:09:58.595794Z",
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
    "id": "2727df00-fff5-41da-8b3a-06a8d206775b",
    "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
    "expires_at": "2026-10-28T09:10:13.663216Z",
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

`POST /api/driver/v1/offers/2727df00-fff5-41da-8b3a-06a8d206775b/accept` → **200**

```json
{
  "command_id": "d35acd6f-1eaa-461a-a6c7-655d58b76559"
}
```

```json
{
  "id": "e0f8a605-f492-4a07-a7b0-ce03b6c51a4f",
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f3d77fc-3c2e-4a75-8c7c-123566b8c31c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f3d77fc-3c2e-4a75-8c7c-123566b8c31c",
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "assignment_id": "e0f8a605-f492-4a07-a7b0-ce03b6c51a4f",
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

`POST /api/driver/v1/work-sessions/016178db-5d56-4869-888c-9eea539362ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:09:59Z",
    "sequence": 1793178599771
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "016178db-5d56-4869-888c-9eea539362ce",
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
  "last_heartbeat_at": "2026-10-28T09:09:59.790239Z",
  "last_location_at": "2026-10-28T09:09:59.790239Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1f3d77fc-3c2e-4a75-8c7c-123566b8c31c/arrive` → **200**

```json
{
  "command_id": "427f6a65-ed80-4c07-b9e0-ac220fcfe9dc",
  "expected_version": 0
}
```

```json
{
  "id": "1f3d77fc-3c2e-4a75-8c7c-123566b8c31c",
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "assignment_id": "e0f8a605-f492-4a07-a7b0-ce03b6c51a4f",
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
  "arrived_at": "2026-10-28T09:09:59.826208Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1f3d77fc-3c2e-4a75-8c7c-123566b8c31c/start` → **200**

```json
{
  "command_id": "1d0b0307-e350-4951-af47-133f367e0c9e",
  "expected_version": 1
}
```

```json
{
  "id": "1f3d77fc-3c2e-4a75-8c7c-123566b8c31c",
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "assignment_id": "e0f8a605-f492-4a07-a7b0-ce03b6c51a4f",
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
  "arrived_at": "2026-10-28T09:09:59.826208Z",
  "started_at": "2026-10-28T09:09:59.865284Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1f3d77fc-3c2e-4a75-8c7c-123566b8c31c/complete` → **200**

```json
{
  "command_id": "40ff35d2-2368-48c2-be5d-3089e2dffb66",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:09:59Z"
}
```

```json
{
  "id": "1f3d77fc-3c2e-4a75-8c7c-123566b8c31c",
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "assignment_id": "e0f8a605-f492-4a07-a7b0-ce03b6c51a4f",
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
  "arrived_at": "2026-10-28T09:09:59.826208Z",
  "started_at": "2026-10-28T09:09:59.865284Z",
  "completed_at": "2026-10-28T09:09:59.910417Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b` → **200**

```json
{
  "id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "cd220d8a-84cd-4ec6-80e5-5b7dd9484956",
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
    "id": "e0f8a605-f492-4a07-a7b0-ce03b6c51a4f",
    "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1f3d77fc-3c2e-4a75-8c7c-123566b8c31c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:09:58.595794Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b` → **200**

```json
{
  "id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "cd220d8a-84cd-4ec6-80e5-5b7dd9484956",
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
    "id": "e0f8a605-f492-4a07-a7b0-ce03b6c51a4f",
    "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1f3d77fc-3c2e-4a75-8c7c-123566b8c31c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:09:58.595794Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b` → **200**

```json
{
  "id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "cd220d8a-84cd-4ec6-80e5-5b7dd9484956",
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
    "id": "e0f8a605-f492-4a07-a7b0-ce03b6c51a4f",
    "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1f3d77fc-3c2e-4a75-8c7c-123566b8c31c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:09:58.595794Z",
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
      "id": "1cea8011-edc9-406a-b552-fe44bc4a9b99",
      "at": "2026-10-28T09:10:00.735871Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b/tip` → **200**

```json
{
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
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
  "available_until": "2026-10-29T09:09:59.910417Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b/tip` → **201**

```json
{
  "command_id": "ecf7cab3-1ff6-4a48-9cc3-5e1cbdd8c733",
  "amount_minor": 2500
}
```

```json
{
  "id": "5a856af4-2de6-400c-9895-ff0d86e3f6bb",
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T09:10:02.122763Z"
}
```

`GET /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b/tip` → **200**

```json
{
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
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
  "available_until": "2026-10-29T09:09:59.910417Z",
  "open": false,
  "tip": {
    "id": "5a856af4-2de6-400c-9895-ff0d86e3f6bb",
    "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T09:10:02.122763Z"
  }
}
```

`GET /api/rider/v1/orders/18d6ba98-f203-4e32-9ef0-ed2a345b1a9b/tip` → **200**

```json
{
  "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
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
  "available_until": "2026-10-29T09:09:59.910417Z",
  "open": false,
  "tip": {
    "id": "5a856af4-2de6-400c-9895-ff0d86e3f6bb",
    "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T09:10:02.122763Z"
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
      "id": "1cea8011-edc9-406a-b552-fe44bc4a9b99",
      "at": "2026-10-28T09:10:00.735871Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
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
      "id": "cc5cbe19-fbb2-4364-83d3-9223dbb67e98",
      "at": "2026-10-28T09:10:03.793024Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
      "counterpart_id": null
    },
    {
      "id": "1cea8011-edc9-406a-b552-fe44bc4a9b99",
      "at": "2026-10-28T09:10:00.735871Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "18d6ba98-f203-4e32-9ef0-ed2a345b1a9b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "016178db-5d56-4869-888c-9eea539362ce",
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
  "last_heartbeat_at": "2026-10-28T09:09:59.790239Z",
  "last_location_at": "2026-10-28T09:09:59.790239Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/016178db-5d56-4869-888c-9eea539362ce/close` → **200**

```json
{
  "command_id": "8193766c-1cd6-4965-bf83-5a1f6f57fa03",
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

Done: card order 18d6ba98-f203-4e32-9ef0-ed2a345b1a9b.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739178827",
  "device_ref": "sandbox-13674"
}
```

```json
{
  "challenge_id": "00582e9b-08ed-478c-8f4e-4da2c65c9536",
  "expires_at": "2026-10-28T09:15:04.332915705Z",
  "resend_available_at": "2026-10-28T09:10:05.332915705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739178827` → **200**

```json
{
  "phone": "+380739178827",
  "audience": "CLIENT",
  "code": "402293",
  "sent_at": "2026-10-28T09:10:04.335665646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00582e9b-08ed-478c-8f4e-4da2c65c9536",
  "code": "402293",
  "device_ref": "sandbox-13674"
}
```

```json
{
  "session_id": "92025abd-f049-4695-a3fc-29c6bbe0ee9a",
  "subject": {
    "type": "CLIENT",
    "id": "31f30981-917a-42ac-bc11-4b00ace06165"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMWYzMDk4MS05MTdhLTQyYWMtYmMxMS00YjAwYWNlMDYxNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTA0LCJpYXQiOjE3OTMxNzg2MDQsImp0aSI6ImFjYWM2NDZkLTgyNTYtNGE5Ny1hZjIzLTkwNGQ4OTdiZTA1MyIsInNpZCI6IjkyMDI1YWJkLWYwNDktNDY5NS1hM2ZjLTI5YzZiYmUwZWU5YSJ9.EpHF0nvSdkx8dM9_Kj-jIwRd7zWwJhHdO1BtH-2Fafw",
  "access_expires_at": "2026-10-28T09:25:04.389312798Z",
  "refresh_token": "Taiysz1MuGwA5D6xCzmSd8LPYgAskEjN0GNDU-HnZOg",
  "refresh_expires_at": "2026-11-27T09:10:04.388734334Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "2888daba-8b76-4b44-8305-7300ed4e3373",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "7edeacd3-1b5a-454a-98d3-fe84fb1d5c02",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-7edeacd3-1b5a-454a-98d3-fe84fb1d5c02",
    "orderDate": "1793178604",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "c6f367c93f97cf4b1352881cf3ff49fb",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=7edeacd3-1b5a-454a-98d3-fe84fb1d5c02",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739178827"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=7edeacd3-1b5a-454a-98d3-fe84fb1d5c02",
  "created_at": "2026-10-28T09:10:04.425427Z",
  "expires_at": "2026-10-28T09:40:04.425427Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/7edeacd3-1b5a-454a-98d3-fe84fb1d5c02` → **200**

```json
{
  "id": "7edeacd3-1b5a-454a-98d3-fe84fb1d5c02",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:10:04.425427Z",
  "expires_at": "2026-10-28T09:40:04.425427Z",
  "completed_at": "2026-10-28T09:10:04.460249Z",
  "masked_pan": "41****3482",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "31f30981-917a-42ac-bc11-4b00ace06165",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "31f30981-917a-42ac-bc11-4b00ace06165",
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
      "id": "30e7cb30-25d7-4fbd-bafe-654ea5263636",
      "at": "2026-10-28T09:10:04.803448Z",
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
  "client_id": "31f30981-917a-42ac-bc11-4b00ace06165",
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
      "id": "30e7cb30-25d7-4fbd-bafe-654ea5263636",
      "at": "2026-10-28T09:10:04.803448Z",
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
  "device_ref": "sandbox-26245"
}
```

```json
{
  "challenge_id": "2cf49221-5af4-48de-bade-b6aac23355c5",
  "expires_at": "2026-10-28T09:15:05.585803062Z",
  "resend_available_at": "2026-10-28T09:10:06.585803062Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "768027",
  "sent_at": "2026-10-28T09:10:05.649596404Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2cf49221-5af4-48de-bade-b6aac23355c5",
  "code": "768027",
  "device_ref": "sandbox-26245"
}
```

```json
{
  "session_id": "3866d919-b0ec-4b8e-85e3-c8f7c94dc759",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTUwNSwiaWF0IjoxNzkzMTc4NjA1LCJqdGkiOiJiMGEzMzIxOS1jODJiLTRhMjUtOTUxZi1lNWRjYmViZGM5NTUiLCJzaWQiOiIzODY2ZDkxOS1iMGVjLTRiOGUtODVlMy1jOGY3Yzk0ZGM3NTkifQ.XFd0yswyaiqGCIy5s0fHgm4abcwcPET4WtPq4i5GcU4",
  "access_expires_at": "2026-10-28T09:25:05.718777797Z",
  "refresh_token": "30b_4sMudEbLw3mxOcrYrCSoL9zx91KbmI-S6Pm_ZW0",
  "refresh_expires_at": "2026-11-27T09:10:05.718257376Z",
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
  "command_id": "9393fab7-6247-48c0-aae9-42cf39de1fa3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "7dbf6d9e-168c-4bb9-9539-0c78500fa21d",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-7dbf6d9e-168c-4bb9-9539-0c78500fa21d",
    "orderDate": "1793178605",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "fe4898d5e21e2a4952b52c9878105d9f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=7dbf6d9e-168c-4bb9-9539-0c78500fa21d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=7dbf6d9e-168c-4bb9-9539-0c78500fa21d",
  "created_at": "2026-10-28T09:10:05.775601Z",
  "expires_at": "2026-10-28T09:40:05.775601Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/7dbf6d9e-168c-4bb9-9539-0c78500fa21d` → **200**

```json
{
  "id": "7dbf6d9e-168c-4bb9-9539-0c78500fa21d",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:10:05.775601Z",
  "expires_at": "2026-10-28T09:40:05.775601Z",
  "completed_at": "2026-10-28T09:10:05.807917Z",
  "masked_pan": "41****7508",
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
      "id": "65cb25bf-2f99-450a-bacc-5248f464a066",
      "at": "2026-10-28T09:10:06.813878Z",
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
  "command_id": "8be85457-0801-456b-afaf-d540cdf3a8c2",
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
  "correlation_id": "db8e3d68-e572-4a40-a600-a725d59068c3"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670202889",
  "device_ref": "sandbox-6386"
}
```

```json
{
  "challenge_id": "937b9452-9619-4184-ae8e-53f7032528e1",
  "expires_at": "2026-10-28T09:15:06.948173433Z",
  "resend_available_at": "2026-10-28T09:10:07.948173433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670202889` → **200**

```json
{
  "phone": "+380670202889",
  "audience": "CLIENT",
  "code": "868620",
  "sent_at": "2026-10-28T09:10:06.950935652Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "937b9452-9619-4184-ae8e-53f7032528e1",
  "code": "868620",
  "device_ref": "sandbox-6386"
}
```

```json
{
  "session_id": "2471d350-b0b2-44bd-b26a-3b0610c0c018",
  "subject": {
    "type": "CLIENT",
    "id": "efe1498b-abff-4c62-b4a2-a8e91f14fa07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmUxNDk4Yi1hYmZmLTRjNjItYjRhMi1hOGU5MWYxNGZhMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTA3LCJpYXQiOjE3OTMxNzg2MDcsImp0aSI6IjRhNDI2ZWFiLTdjOTEtNDE3ZC04N2VjLWYxYzBiNDI5NWRmYSIsInNpZCI6IjI0NzFkMzUwLWIwYjItNDRiZC1iMjZhLTNiMDYxMGMwYzAxOCJ9.H7vs6CLLozd9Qa3VTwkvQSYi2DUBl2UnlEKqjDfuzzg",
  "access_expires_at": "2026-10-28T09:25:07.006321779Z",
  "refresh_token": "7nbW-jvaFr6jiRlYXC86OZM-Ev9ycgGCluTcdqCDi38",
  "refresh_expires_at": "2026-11-27T09:10:07.005858433Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "efe1498b-abff-4c62-b4a2-a8e91f14fa07",
  "session_id": "2471d350-b0b2-44bd-b26a-3b0610c0c018",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8939ec27-bafb-4da1-96c8-2bae031c0a6a",
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
  "id": "e93542ff-8774-4fe4-827b-2a9eac4cebca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:07.073259Z",
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
  "challenge_id": "82d56b81-15d4-4f64-ad97-f88ed767e3d1",
  "expires_at": "2026-10-28T09:15:09.109449983Z",
  "resend_available_at": "2026-10-28T09:10:10.109449983Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670202889` → **200**

```json
{
  "phone": "+380670202889",
  "audience": "CLIENT",
  "code": "097827",
  "sent_at": "2026-10-28T09:10:09.111394179Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "ea0580f3-624a-4b7d-99a9-16b361da21a0",
  "challenge_id": "82d56b81-15d4-4f64-ad97-f88ed767e3d1",
  "otp_code": "097827"
}
```

```json
{
  "client_id": "efe1498b-abff-4c62-b4a2-a8e91f14fa07",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T09:10:09.175798346Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "bdd3c058-2199-4167-934f-dc8f70ae68fa",
  "quote_id": "e93542ff-8774-4fe4-827b-2a9eac4cebca",
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
  "correlation_id": "506a1462-ddd2-4d31-9e4a-440a2f92f896"
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
  "session_id": "3d89ed6d-e787-45ba-ad8d-bc437b20899d",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MDksImlhdCI6MTc5MzE3ODYwOSwianRpIjoiMGY1YzdlMWYtMDk5Mi00OThiLThjOWYtYTJjYTQyMWY0NGIxIiwic2lkIjoiM2Q4OWVkNmQtZTc4Ny00NWJhLWFkOGQtYmM0MzdiMjA4OTlkIn0.f_FBQm5rm1mOhQ29Kr85Hh_ciGyl5Khq79qc4aGSU74",
  "access_expires_at": "2026-10-28T09:25:09.526364817Z",
  "refresh_token": "oxiSfp3GVJwXryagAtYa8MEXLTcbCOMjdr1OYl9dqGI",
  "refresh_expires_at": "2026-10-28T21:10:09.525656898Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "efe1498b-abff-4c62-b4a2-a8e91f14fa07",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T09:10:09.175798Z",
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

`POST /api/admin/v1/client-deletions/efe1498b-abff-4c62-b4a2-a8e91f14fa07/complete` → **200**

```json
{
  "command_id": "9005b81e-c2d4-4c95-86a4-3cd2eebfa91d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "efe1498b-abff-4c62-b4a2-a8e91f14fa07",
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
  "correlation_id": "63c6d232-b7a7-44ae-a7d9-ae9f8a5f1043"
}
```

Done: client efe1498b-abff-4c62-b4a2-a8e91f14fa07 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665090940",
  "device_ref": "sandbox-16331"
}
```

```json
{
  "challenge_id": "ac18eb2f-7641-4211-953e-db7ca30c39f7",
  "expires_at": "2026-10-28T09:15:09.665773124Z",
  "resend_available_at": "2026-10-28T09:10:10.665773124Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665090940` → **200**

```json
{
  "phone": "+380665090940",
  "audience": "CLIENT",
  "code": "509997",
  "sent_at": "2026-10-28T09:10:09.667865714Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac18eb2f-7641-4211-953e-db7ca30c39f7",
  "code": "509997",
  "device_ref": "sandbox-16331"
}
```

```json
{
  "session_id": "ebf176b1-2faf-4802-871d-1a9751634bfa",
  "subject": {
    "type": "CLIENT",
    "id": "a1de78c2-5d55-445f-817a-096100b758ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWRlNzhjMi01ZDU1LTQ0NWYtODE3YS0wOTYxMDBiNzU4YWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTA5LCJpYXQiOjE3OTMxNzg2MDksImp0aSI6IjZjMWQ1NmQzLWQ4NDUtNGVjOC04YWY4LTY1NDUwYzA1YzEwNSIsInNpZCI6ImViZjE3NmIxLTJmYWYtNDgwMi04NzFkLTFhOTc1MTYzNGJmYSJ9.MsIC0ASdNV-Bl4XPMto9XYdx6yHATzVMrahBgloVPUU",
  "access_expires_at": "2026-10-28T09:25:09.725407631Z",
  "refresh_token": "6G8IGJTs5moqoYfGtDQcN8vvBD5SKEGzJo9bx4R_BBA",
  "refresh_expires_at": "2026-11-27T09:10:09.724889964Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a1de78c2-5d55-445f-817a-096100b758ab",
  "session_id": "ebf176b1-2faf-4802-871d-1a9751634bfa",
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
  "session_id": "e1d0d25d-86a4-45f0-940e-5725e7431980",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MTAsImlhdCI6MTc5MzE3ODYxMCwianRpIjoiYTY2MzQzNzYtYjFlNy00M2EzLWE4OTYtNmY4OWRiMjU0YTQ1Iiwic2lkIjoiZTFkMGQyNWQtODZhNC00NWYwLTk0MGUtNTcyNWU3NDMxOTgwIn0.43hCvP1uUYIhxf7sNNvGRlKmPw_ntYsjrj91U3q_ssk",
  "access_expires_at": "2026-10-28T09:25:10.040346261Z",
  "refresh_token": "gPRZ5f1nX9eAwHk9CJDdnTPw9KsM0fMEkqtHM1MiYvk",
  "refresh_expires_at": "2026-10-28T21:10:10.039797933Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5090940&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a1de78c2-5d55-445f-817a-096100b758ab",
      "phone": "+380665090940",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T09:10:09.723071Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a1de78c2-5d55-445f-817a-096100b758ab` → **200**

```json
{
  "client": {
    "id": "a1de78c2-5d55-445f-817a-096100b758ab",
    "phone": "+380665090940",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T09:10:09.723071Z",
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

`POST /api/admin/v1/clients/a1de78c2-5d55-445f-817a-096100b758ab/block` → **400**

```json
{
  "command_id": "5efa28fb-e2b7-4b42-a5c6-33d79269578c",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a1de78c2-5d55-445f-817a-096100b758ab/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bd24ccd1-50dc-4f42-b7bc-cc1df45fcff6",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a1de78c2-5d55-445f-817a-096100b758ab/block` → **200**

```json
{
  "command_id": "a9ebbe23-7777-4403-9a6c-a6c38df0b16c",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a1de78c2-5d55-445f-817a-096100b758ab",
  "phone": "+380665090940",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T09:10:09.723071Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T09:10:10.221685Z",
    "by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
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
  "correlation_id": "d383c493-728a-4619-bb60-b316a9b468bb"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665090940",
  "device_ref": "sandbox-6357"
}
```

```json
{
  "challenge_id": "0bd14a54-748e-49ab-a4e3-eaf65c67982b",
  "expires_at": "2026-10-28T09:15:12.279764189Z",
  "resend_available_at": "2026-10-28T09:10:13.279764189Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665090940` → **200**

```json
{
  "phone": "+380665090940",
  "audience": "CLIENT",
  "code": "709308",
  "sent_at": "2026-10-28T09:10:12.281885472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "0bd14a54-748e-49ab-a4e3-eaf65c67982b",
  "code": "709308",
  "device_ref": "sandbox-6357"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "341a11da-1458-4e97-8710-5f634173b975"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a1de78c2-5d55-445f-817a-096100b758ab` → **200**

```json
{
  "client": {
    "id": "a1de78c2-5d55-445f-817a-096100b758ab",
    "phone": "+380665090940",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T09:10:09.723071Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T09:10:10.221685Z",
      "by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
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

`POST /api/admin/v1/clients/a1de78c2-5d55-445f-817a-096100b758ab/unblock` → **200**

```json
{
  "command_id": "b7ae0ae9-830b-4c90-99a8-a34cc219e39a",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a1de78c2-5d55-445f-817a-096100b758ab",
  "phone": "+380665090940",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T09:10:09.723071Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665090940",
  "device_ref": "sandbox-5788"
}
```

```json
{
  "challenge_id": "0fb5c3f7-f066-427c-8bce-fc7574231ce6",
  "expires_at": "2026-10-28T09:15:14.432042997Z",
  "resend_available_at": "2026-10-28T09:10:15.432042997Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665090940` → **200**

```json
{
  "phone": "+380665090940",
  "audience": "CLIENT",
  "code": "212956",
  "sent_at": "2026-10-28T09:10:14.433999455Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0fb5c3f7-f066-427c-8bce-fc7574231ce6",
  "code": "212956",
  "device_ref": "sandbox-5788"
}
```

```json
{
  "session_id": "de312a8c-a3d0-493c-8e0f-e3cb42e62f14",
  "subject": {
    "type": "CLIENT",
    "id": "a1de78c2-5d55-445f-817a-096100b758ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWRlNzhjMi01ZDU1LTQ0NWYtODE3YS0wOTYxMDBiNzU4YWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTE0LCJpYXQiOjE3OTMxNzg2MTQsImp0aSI6Ijc3ZWQwM2E5LWQwZTUtNDJkNC1iNWUwLTQwYmMyMjUxMDkzYSIsInNpZCI6ImRlMzEyYThjLWEzZDAtNDkzYy04ZTBmLWUzY2I0MmU2MmYxNCJ9.1sxoYpzGU2Nz3l1q2xPA9IvfBDOfhy0bSk67Z3ByHbc",
  "access_expires_at": "2026-10-28T09:25:14.488188881Z",
  "refresh_token": "fhDGV4IfWWu-EF49VjU8bof173ilmEtHZkZTw7p38_c",
  "refresh_expires_at": "2026-11-27T09:10:14.487585247Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a1de78c2-5d55-445f-817a-096100b758ab",
  "session_id": "de312a8c-a3d0-493c-8e0f-e3cb42e62f14",
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
  "phone": "+380633860483",
  "device_ref": "sandbox-4348"
}
```

```json
{
  "challenge_id": "43668c10-b36f-4b6e-9a81-8bd7e9a62530",
  "expires_at": "2026-10-28T09:15:14.552233592Z",
  "resend_available_at": "2026-10-28T09:10:15.552233592Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633860483` → **200**

```json
{
  "phone": "+380633860483",
  "audience": "CLIENT",
  "code": "683660",
  "sent_at": "2026-10-28T09:10:14.554565967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43668c10-b36f-4b6e-9a81-8bd7e9a62530",
  "code": "683660",
  "device_ref": "sandbox-4348"
}
```

```json
{
  "session_id": "81d79358-e2f6-4b16-ae09-424238b841a8",
  "subject": {
    "type": "CLIENT",
    "id": "144dca5b-83c2-4e6c-ba38-47ca01f09d9a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDRkY2E1Yi04M2MyLTRlNmMtYmEzOC00N2NhMDFmMDlkOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTE0LCJpYXQiOjE3OTMxNzg2MTQsImp0aSI6IjMxYmZkNGU2LTRjYmYtNGVhOC04NjllLTU4ODcyYTQ4YzNkNyIsInNpZCI6IjgxZDc5MzU4LWUyZjYtNGIxNi1hZTA5LTQyNDIzOGI4NDFhOCJ9.y9CSAnjWUU47KsqzDmVdsIMkunfu4FWqnngSv0b4VXE",
  "access_expires_at": "2026-10-28T09:25:14.610044699Z",
  "refresh_token": "DSPDdsMfEjxX4dXp5Wns0U-GTfKu92RGJzXjDLXYkBo",
  "refresh_expires_at": "2026-11-27T09:10:14.6095191Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "e6c0ee98-d05d-492a-be18-575d1d45dc99",
  "expires_at": "2026-10-28T09:15:16.639628075Z",
  "resend_available_at": "2026-10-28T09:10:17.639628075Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633860483` → **200**

```json
{
  "phone": "+380633860483",
  "audience": "CLIENT",
  "code": "698019",
  "sent_at": "2026-10-28T09:10:16.641252939Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "0c1ad53d-cee4-4bd4-b73b-a073f185bf7b",
  "challenge_id": "e6c0ee98-d05d-492a-be18-575d1d45dc99",
  "otp_code": "698019"
}
```

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "PENDING",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8` → **200**

```json
{
  "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
  "state": "READY",
  "created_at": "2026-10-28T09:10:16.699822Z",
  "ready_at": "2026-10-28T09:10:24.960371Z",
  "expires_at": "2026-11-04T09:10:24.960371Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633675398",
  "device_ref": "sandbox-8851"
}
```

```json
{
  "challenge_id": "9d6048cf-9c84-4099-b9b3-a1054dcc78f9",
  "expires_at": "2026-10-28T09:15:26.018674176Z",
  "resend_available_at": "2026-10-28T09:10:27.018674176Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633675398` → **200**

```json
{
  "phone": "+380633675398",
  "audience": "CLIENT",
  "code": "957026",
  "sent_at": "2026-10-28T09:10:26.021075317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d6048cf-9c84-4099-b9b3-a1054dcc78f9",
  "code": "957026",
  "device_ref": "sandbox-8851"
}
```

```json
{
  "session_id": "6cf71230-d0e3-49d3-a8f1-797048743351",
  "subject": {
    "type": "CLIENT",
    "id": "82b5d735-e313-4a96-86dd-903a5aaaa5fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmI1ZDczNS1lMzEzLTRhOTYtODZkZC05MDNhNWFhYWE1ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTI2LCJpYXQiOjE3OTMxNzg2MjYsImp0aSI6IjRlMTZmNTE3LTNhZjMtNGFmYy1hYTdiLWY4ZTI0MmVlYjk1NSIsInNpZCI6IjZjZjcxMjMwLWQwZTMtNDlkMy1hOGYxLTc5NzA0ODc0MzM1MSJ9.NQcCcGgO2nQBZFsumm67H_v9_kXnFsh7_RAUaqlofgw",
  "access_expires_at": "2026-10-28T09:25:26.078819179Z",
  "refresh_token": "CFD49hJQlNZaAD2fj8RqO9AnsqWbtL3BQg-_BAIA84o",
  "refresh_expires_at": "2026-11-27T09:10:26.078362382Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/9dda9590-00fe-410b-9646-0f97a97827e8/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3a1798b6-6e10-40f0-81dc-71ae0864d2f2"
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
  "session_id": "215680bd-3492-4cc1-9f35-02c62f835592",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MjYsImlhdCI6MTc5MzE3ODYyNiwianRpIjoiM2MwMGI2NWMtNzUyMy00OTg5LTgwMDQtYmRmZTAyNGFmN2I4Iiwic2lkIjoiMjE1NjgwYmQtMzQ5Mi00Y2MxLTlmMzUtMDJjNjJmODM1NTkyIn0.-udhtZK1KDmfGxS5BgmLle1r1fS_HIZzmreK7fiIvZQ",
  "access_expires_at": "2026-10-28T09:25:26.393046221Z",
  "refresh_token": "fgwIlJxgcxUhMvXIcSXqV4nY6WakH1DbsR0WZbCsLeg",
  "refresh_expires_at": "2026-10-28T21:10:26.392615963Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "144dca5b-83c2-4e6c-ba38-47ca01f09d9a",
  "session_id": "81d79358-e2f6-4b16-ae09-424238b841a8",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/144dca5b-83c2-4e6c-ba38-47ca01f09d9a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "9dda9590-00fe-410b-9646-0f97a97827e8",
      "state": "READY",
      "created_at": "2026-10-28T09:10:16.699822Z",
      "ready_at": "2026-10-28T09:10:24.960371Z",
      "expires_at": "2026-11-04T09:10:24.960371Z",
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
  "device_ref": "sandbox-6180"
}
```

```json
{
  "challenge_id": "dbed20e6-ae32-406a-b631-91ec58c5d7c8",
  "expires_at": "2026-10-28T09:15:26.483700769Z",
  "resend_available_at": "2026-10-28T09:10:27.483700769Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "395693",
  "sent_at": "2026-10-28T09:10:26.485819797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbed20e6-ae32-406a-b631-91ec58c5d7c8",
  "code": "395693",
  "device_ref": "sandbox-6180"
}
```

```json
{
  "session_id": "195ce746-7811-4234-a14a-e3a1313086ff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTUyNiwiaWF0IjoxNzkzMTc4NjI2LCJqdGkiOiJlZDhhNmNkZS00MDViLTRjODQtYTgzYS0xMDA4Y2RmMjU4NjIiLCJzaWQiOiIxOTVjZTc0Ni03ODExLTQyMzQtYTE0YS1lM2ExMzEzMDg2ZmYifQ.6n05Tv9wI2FkUFCq4dNc4LJ69j_Th1Qla84MR7YzyyQ",
  "access_expires_at": "2026-10-28T09:25:26.540590416Z",
  "refresh_token": "Ut6VHMseEslPqQ3ItElMraQQfs6ibXCU3lUt59It9Jc",
  "refresh_expires_at": "2026-11-27T09:10:26.540030917Z",
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
  "device_ref": "sandbox-26642"
}
```

```json
{
  "challenge_id": "4fdda652-9965-4b06-843a-1f9ba55deed6",
  "expires_at": "2026-10-28T09:15:26.589774386Z",
  "resend_available_at": "2026-10-28T09:10:27.589774386Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "213239",
  "sent_at": "2026-10-28T09:10:26.591865813Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fdda652-9965-4b06-843a-1f9ba55deed6",
  "code": "213239",
  "device_ref": "sandbox-26642"
}
```

```json
{
  "session_id": "8b3eab1f-e9b3-4f73-88f9-cae843d9bbcd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTUyNiwiaWF0IjoxNzkzMTc4NjI2LCJqdGkiOiI0OTM3N2JmOC04MzlhLTQ2YTgtYmI4NS0yNWZhMDJkOTY5MTkiLCJzaWQiOiI4YjNlYWIxZi1lOWIzLTRmNzMtODhmOS1jYWU4NDNkOWJiY2QifQ.-d1PHGQLSsYZTEw0-bjkUJqkjXorhaNXA0k8BJQD4Qc",
  "access_expires_at": "2026-10-28T09:25:26.645883522Z",
  "refresh_token": "XOdhR1I3wNLZun5RzOWKDbshQbL-moJqsPt5cf4IOk4",
  "refresh_expires_at": "2026-11-27T09:10:26.645406816Z",
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
  "command_id": "19e5d7a2-7c79-4af0-ae2e-bf1ef9de4e49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:26Z",
    "sequence": 1793178626695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b0c169c-6f0a-4fe6-b521-895a355a1436",
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
  "last_heartbeat_at": "2026-10-28T09:10:26.714317Z",
  "last_location_at": "2026-10-28T09:10:26.714317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-2519"
}
```

```json
{
  "challenge_id": "8ec21415-d961-4baa-9172-e36be7d0e9ea",
  "expires_at": "2026-10-28T09:15:26.742674102Z",
  "resend_available_at": "2026-10-28T09:10:27.742674102Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "751054",
  "sent_at": "2026-10-28T09:10:26.744609578Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ec21415-d961-4baa-9172-e36be7d0e9ea",
  "code": "751054",
  "device_ref": "sandbox-2519"
}
```

```json
{
  "session_id": "387a8464-65bf-4210-a0e0-4ad40c30d1cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTUyNiwiaWF0IjoxNzkzMTc4NjI2LCJqdGkiOiJjOGJiZDhjNi0yNTA0LTRiNjItYTlhMy01M2Q0MDRhM2U2Y2UiLCJzaWQiOiIzODdhODQ2NC02NWJmLTQyMTAtYTBlMC00YWQ0MGMzMGQxY2QifQ.7DhZ2mH8nXV2K_YBdl2MAMKHgfnYEHTY6XIRW_fW42c",
  "access_expires_at": "2026-10-28T09:25:26.80061117Z",
  "refresh_token": "QOmHolxONETB6qzWFHmz185Q2qbJ0mBavdyVPwJ1v4Q",
  "refresh_expires_at": "2026-11-27T09:10:26.800094184Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f101d872-2e64-4939-b908-a42bb32803ae",
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
  "last_heartbeat_at": "2026-10-28T09:09:57.108526Z",
  "last_location_at": "2026-10-28T09:09:57.108526Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f101d872-2e64-4939-b908-a42bb32803ae/handover` → **200**

```json
{
  "command_id": "91149e28-459f-4423-81c0-36c4b788a6df",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f101d872-2e64-4939-b908-a42bb32803ae",
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
  "last_heartbeat_at": "2026-10-28T09:09:57.108526Z",
  "last_location_at": "2026-10-28T09:09:57.108526Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f101d872-2e64-4939-b908-a42bb32803ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:26Z",
    "sequence": 1793178626888
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f101d872-2e64-4939-b908-a42bb32803ae",
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
  "last_heartbeat_at": "2026-10-28T09:10:26.907781Z",
  "last_location_at": "2026-10-28T09:10:26.907781Z",
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
  "session_id": "39b17f99-0fe6-49ad-915f-9796acd8a06f",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MjcsImlhdCI6MTc5MzE3ODYyNywianRpIjoiN2QwZGZlZDEtNGU1OC00ZDJmLWE1ZDAtNzJjNDg4YmFiYWQxIiwic2lkIjoiMzliMTdmOTktMGZlNi00OWFkLTkxNWYtOTc5NmFjZDhhMDZmIn0.qA_HrOu3tjkuwcZbsz6AVkjQsfzlVYSuECUujaN3Q-c",
  "access_expires_at": "2026-10-28T09:25:27.191083737Z",
  "refresh_token": "9c3m_p0fYriO4BfiofLu5qVlrr_DzaR1kZcVTElyaOA",
  "refresh_expires_at": "2026-10-28T21:10:27.190623931Z",
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
  "session_id": "4026c54d-b788-4e93-8b71-2dd884e4cace",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MjcsImlhdCI6MTc5MzE3ODYyNywianRpIjoiY2JkZmE2NjItOGNhYi00ZDY4LWEwYzQtMDUyNjcyZWYwOGJlIiwic2lkIjoiNDAyNmM1NGQtYjc4OC00ZTkzLThiNzEtMmRkODg0ZTRjYWNlIn0.oDC0fr9xvjX9eqrDSuARCydz8zNHmqhLMMmZHMIFXh0",
  "access_expires_at": "2026-10-28T09:25:27.475902459Z",
  "refresh_token": "Na1ARXwPofHpHFlIxb29v95rtidARzadNC2Ijx14GT4",
  "refresh_expires_at": "2026-10-28T21:10:27.475393565Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689298338",
  "device_ref": "sandbox-18642"
}
```

```json
{
  "challenge_id": "1bdacd8d-ae7a-4c42-8410-aa215fc6100f",
  "expires_at": "2026-10-28T09:15:27.502774779Z",
  "resend_available_at": "2026-10-28T09:10:28.502774779Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689298338` → **200**

```json
{
  "phone": "+380689298338",
  "audience": "CLIENT",
  "code": "624127",
  "sent_at": "2026-10-28T09:10:27.505442049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bdacd8d-ae7a-4c42-8410-aa215fc6100f",
  "code": "624127",
  "device_ref": "sandbox-18642"
}
```

```json
{
  "session_id": "46db3418-353d-452a-9bb5-574703424f2f",
  "subject": {
    "type": "CLIENT",
    "id": "82c8a13a-7db8-49a1-a3d2-efc4642bf78e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmM4YTEzYS03ZGI4LTQ5YTEtYTNkMi1lZmM0NjQyYmY3OGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTI3LCJpYXQiOjE3OTMxNzg2MjcsImp0aSI6ImE0MmQyZWUyLTAyNDMtNDg4Yi04OTYwLWRkOTVjYmI4NjIzZiIsInNpZCI6IjQ2ZGIzNDE4LTM1M2QtNDUyYS05YmI1LTU3NDcwMzQyNGYyZiJ9.VPeopuXmK9cGdgbMvSUXjn2CsOSHhGCR_Bmez-RW92E",
  "access_expires_at": "2026-10-28T09:25:27.562318891Z",
  "refresh_token": "NKutypwbqupRQa5dpL-J6iXvP3d5AVGlUUsJXLUl4Sg",
  "refresh_expires_at": "2026-11-27T09:10:27.561765441Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "460658ec-cf16-4d3e-a6c0-6b7326887897",
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
  "id": "2bfa4c2d-8972-48f5-bc0a-c503e1699cd2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:27.597972Z",
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
  "command_id": "a2501fd5-9227-4835-8d3e-935a7cb0d3b8",
  "quote_id": "2bfa4c2d-8972-48f5-bc0a-c503e1699cd2",
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
  "id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "82c8a13a-7db8-49a1-a3d2-efc4642bf78e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:27.650168Z",
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
    "id": "bca5b7fe-0288-4d74-bdd9-8bf58af32650",
    "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
    "expires_at": "2026-10-28T09:10:42.653803Z",
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

`POST /api/driver/v1/offers/bca5b7fe-0288-4d74-bdd9-8bf58af32650/reject` → **204**

```json
{
  "command_id": "42b53c5e-48ed-4776-be08-946fab7e327e"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e129fc87-ec9e-4978-8ea7-646f39207983",
    "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
    "expires_at": "2026-10-28T09:10:42.727255Z",
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

`POST /api/driver/v1/offers/e129fc87-ec9e-4978-8ea7-646f39207983/accept` → **200**

```json
{
  "command_id": "4cfe5f2f-bfc0-42a5-a394-bb22a190d006"
}
```

```json
{
  "id": "58612556-4aa6-49a6-900a-4d4461423b52",
  "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "60f45228-ab0e-4700-8d47-9663645095fd",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/2614cf43-eb18-4a79-b5e3-56e2f576ce50/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:10:27.65082Z",
      "actor": {
        "type": "CLIENT",
        "id": "82c8a13a-7db8-49a1-a3d2-efc4642bf78e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
        "quote_id": "2bfa4c2d-8972-48f5-bc0a-c503e1699cd2",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:10:27.652764Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
        "attempt_id": "5fdfc971-38db-47b2-8d96-16056f059a09",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:10:27.661334Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bca5b7fe-0288-4d74-bdd9-8bf58af32650",
        "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      }
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T09:10:27.726017Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bca5b7fe-0288-4d74-bdd9-8bf58af32650",
        "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50"
      }
    },
    {
      "sequence": 4,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:10:27.732752Z",
      "actor": {
        "type": "SYSTEM",
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 2614cf43-eb18-4a79-b5e3-56e2f576ce50 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/2614cf43-eb18-4a79-b5e3-56e2f576ce50` → **200**

```json
{
  "id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
  "short_number": 5,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "82c8a13a-7db8-49a1-a3d2-efc4642bf78e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "58612556-4aa6-49a6-900a-4d4461423b52",
    "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "60f45228-ab0e-4700-8d47-9663645095fd",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:10:27.650168Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2614cf43-eb18-4a79-b5e3-56e2f576ce50/cancel` → **200**

```json
{
  "command_id": "7e63d180-7b02-4539-b7d8-cf3dd4119bcc",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "82c8a13a-7db8-49a1-a3d2-efc4642bf78e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "58612556-4aa6-49a6-900a-4d4461423b52",
    "order_id": "2614cf43-eb18-4a79-b5e3-56e2f576ce50",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "60f45228-ab0e-4700-8d47-9663645095fd",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:10:27.650168Z",
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
  "session_id": "9b0c169c-6f0a-4fe6-b521-895a355a1436",
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
  "last_heartbeat_at": "2026-10-28T09:10:26.714317Z",
  "last_location_at": "2026-10-28T09:10:26.714317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b0c169c-6f0a-4fe6-b521-895a355a1436/close` → **200**

```json
{
  "command_id": "40a6cd06-058e-4558-8963-09de9b2106af",
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
  "session_id": "f101d872-2e64-4939-b908-a42bb32803ae",
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
  "last_heartbeat_at": "2026-10-28T09:10:26.907781Z",
  "last_location_at": "2026-10-28T09:10:26.907781Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f101d872-2e64-4939-b908-a42bb32803ae/close` → **200**

```json
{
  "command_id": "bb18a807-fc80-49f2-b030-71bd1035a45c",
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
  "device_ref": "sandbox-7971"
}
```

```json
{
  "challenge_id": "ef60b07a-dcb9-4e3f-bceb-e73f7ef85e37",
  "expires_at": "2026-10-28T09:15:28.147783132Z",
  "resend_available_at": "2026-10-28T09:10:29.147783132Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "672487",
  "sent_at": "2026-10-28T09:10:28.149880278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef60b07a-dcb9-4e3f-bceb-e73f7ef85e37",
  "code": "672487",
  "device_ref": "sandbox-7971"
}
```

```json
{
  "session_id": "5c44dcc8-c4d3-4693-aa03-ee81b8fc8067",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTUyOCwiaWF0IjoxNzkzMTc4NjI4LCJqdGkiOiI2ZDE3NWI2OC02NzI0LTRhMjgtOTZjMS0zMzdhZjYzZDJjNTYiLCJzaWQiOiI1YzQ0ZGNjOC1jNGQzLTQ2OTMtYWEwMy1lZTgxYjhmYzgwNjcifQ.6QBylMgV_tO1r4MEoBEbUua3jDH2Z76_gwWxL2e_v8w",
  "access_expires_at": "2026-10-28T09:25:28.205002898Z",
  "refresh_token": "xsdRAeHNclBhOpV7JPzs4WT4fimRMQNjyKkVYjq3izI",
  "refresh_expires_at": "2026-11-27T09:10:28.204506252Z",
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
  "command_id": "e118a48f-fa82-44b9-b199-bad699f154d6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:28Z",
    "sequence": 1793178628253
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:28.271021Z",
  "last_location_at": "2026-10-28T09:10:28.271021Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673011004",
  "device_ref": "sandbox-8077"
}
```

```json
{
  "challenge_id": "92cc2481-9559-4ccc-abd9-c07411925efd",
  "expires_at": "2026-10-28T09:15:28.302603868Z",
  "resend_available_at": "2026-10-28T09:10:29.302603868Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673011004` → **200**

```json
{
  "phone": "+380673011004",
  "audience": "CLIENT",
  "code": "233565",
  "sent_at": "2026-10-28T09:10:28.304423943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92cc2481-9559-4ccc-abd9-c07411925efd",
  "code": "233565",
  "device_ref": "sandbox-8077"
}
```

```json
{
  "session_id": "56b0ef9a-def1-4cb2-b21a-8716a7b13e64",
  "subject": {
    "type": "CLIENT",
    "id": "06120598-59c6-4972-9f18-9de272f7c758"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNjEyMDU5OC01OWM2LTQ5NzItOWYxOC05ZGUyNzJmN2M3NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTI4LCJpYXQiOjE3OTMxNzg2MjgsImp0aSI6ImNlZmE4N2NlLWM3MzUtNDY2MS1iZjA2LWE2ZmE1ZjZjNTRjOSIsInNpZCI6IjU2YjBlZjlhLWRlZjEtNGNiMi1iMjFhLTg3MTZhN2IxM2U2NCJ9.CD6U3BvajTMjouQNWAp4GC4zXFJ-h9XUUjAH8XhzoB8",
  "access_expires_at": "2026-10-28T09:25:28.358622996Z",
  "refresh_token": "BH8NXK58-aRNNW2sRB6t4WaDbLvx1-5OSke0bcLSbXM",
  "refresh_expires_at": "2026-11-27T09:10:28.358210024Z",
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
  "command_id": "1c768873-3d61-495f-a5b2-f5186ee168bc",
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
  "id": "6af527c2-09b5-4f5f-af5b-976d2d5c4b72",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:28.419941Z",
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
  "command_id": "d96d9e4d-0075-4c16-9c8d-dddec75b77e3",
  "platform": "ANDROID",
  "token": "sandbox-driver-5ff7ff9c-4abe-4141-be99-6d414989d32a"
}
```

```json
{
  "id": "da2b9550-29b0-44dd-b09d-0a4204ed953a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:10:28.565504Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "0f1d3187-8dde-40a2-ba70-8e2c1c8ff6ed",
  "platform": "ANDROID",
  "token": "sandbox-rider-85165add-5374-4a3e-8174-fc8a7408a090"
}
```

```json
{
  "id": "c71d0381-a4f4-4d43-89bd-00caa4a1d6f8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:10:28.599869Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "42c8f4df-4683-4702-8d1c-77e550a78707",
  "quote_id": "6af527c2-09b5-4f5f-af5b-976d2d5c4b72",
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
  "id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "06120598-59c6-4972-9f18-9de272f7c758",
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
  "created_at": "2026-10-28T09:10:28.641685Z",
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
    "id": "1a5bec03-4bba-4bde-8d32-92560412dd2a",
    "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
    "expires_at": "2026-10-28T09:10:43.644579Z",
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

`POST /api/driver/v1/offers/1a5bec03-4bba-4bde-8d32-92560412dd2a/accept` → **200**

```json
{
  "command_id": "26f2ffdd-6526-4f87-86f6-b9b3a2b9ed92"
}
```

```json
{
  "id": "84a1b25f-7614-4b99-8c63-2c49438b330c",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "de9cfe8a-b99b-4557-85cb-20bcaeeefb3a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:10:28.619Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:10:28.619Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:10:29.120243858Z",
    "token_suffix": "89d32a",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "93df3677-57e6-45a0-93c6-81acd41d9344",
      "order_version": "2",
      "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673011004&after=2026-10-28T09:10:28.619Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:10:29.122612375Z",
    "token_suffix": "08a090",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "255de73d-ac34-4a9f-a979-28a6d9aafce3",
      "order_version": "3",
      "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/35c7a3d2-d11e-4b2a-a428-b74560fa02cc/messages` → **201**

```json
{
  "command_id": "69329833-7a3b-492d-9015-bcf122821f8d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "551617ee-9cfa-4824-9d13-0a3ae51b6293",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T09:10:29.836620565Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "de9cfe8a-b99b-4557-85cb-20bcaeeefb3a",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "assignment_id": "84a1b25f-7614-4b99-8c63-2c49438b330c",
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

`POST /api/driver/v1/trips/de9cfe8a-b99b-4557-85cb-20bcaeeefb3a/messages` → **201**

```json
{
  "command_id": "1c18b32a-98d6-41d9-bcf8-6001038fb59e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d63dd87e-4bcd-432e-95ab-207d95f3d1a5",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T09:10:29.889404421Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/35c7a3d2-d11e-4b2a-a428-b74560fa02cc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/de9cfe8a-b99b-4557-85cb-20bcaeeefb3a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673011004"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:29Z",
    "sequence": 1793178629967
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:29.986022Z",
  "last_location_at": "2026-10-28T09:10:29.986022Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "de9cfe8a-b99b-4557-85cb-20bcaeeefb3a",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "assignment_id": "84a1b25f-7614-4b99-8c63-2c49438b330c",
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

`POST /api/driver/v1/trips/de9cfe8a-b99b-4557-85cb-20bcaeeefb3a/arrive` → **200**

```json
{
  "command_id": "16b64282-e562-459d-81cf-e81d3413319c",
  "expected_version": 0
}
```

```json
{
  "id": "de9cfe8a-b99b-4557-85cb-20bcaeeefb3a",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "assignment_id": "84a1b25f-7614-4b99-8c63-2c49438b330c",
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
  "arrived_at": "2026-10-28T09:10:30.055882Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/de9cfe8a-b99b-4557-85cb-20bcaeeefb3a/start` → **200**

```json
{
  "command_id": "e3db5db5-2cdf-44ec-839e-6a2d7b2f3785",
  "expected_version": 1
}
```

```json
{
  "id": "de9cfe8a-b99b-4557-85cb-20bcaeeefb3a",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "assignment_id": "84a1b25f-7614-4b99-8c63-2c49438b330c",
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
  "arrived_at": "2026-10-28T09:10:30.055882Z",
  "started_at": "2026-10-28T09:10:30.092478Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:30Z",
    "sequence": 1793178630116
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:30.135238Z",
  "last_location_at": "2026-10-28T09:10:30.135238Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/de9cfe8a-b99b-4557-85cb-20bcaeeefb3a/complete` → **200**

```json
{
  "command_id": "2a00eabb-d2b6-4aaf-b4bf-e9154c7b8e2b",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:10:30Z",
  "cash_received": true
}
```

```json
{
  "id": "de9cfe8a-b99b-4557-85cb-20bcaeeefb3a",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "assignment_id": "84a1b25f-7614-4b99-8c63-2c49438b330c",
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
  "arrived_at": "2026-10-28T09:10:30.055882Z",
  "started_at": "2026-10-28T09:10:30.092478Z",
  "completed_at": "2026-10-28T09:10:30.171217Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/35c7a3d2-d11e-4b2a-a428-b74560fa02cc` → **200**

```json
{
  "id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "06120598-59c6-4972-9f18-9de272f7c758",
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
    "id": "84a1b25f-7614-4b99-8c63-2c49438b330c",
    "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "de9cfe8a-b99b-4557-85cb-20bcaeeefb3a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:10:28.641685Z",
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
    "id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:10:28.641685Z",
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
    "id": "de9cfe8a-b99b-4557-85cb-20bcaeeefb3a",
    "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
    "order_short_number": 6,
    "created_at": "2026-10-28T09:10:28.719037Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1c7f7cca-e4ad-4ec2-ab45-20abc9d84881",
    "order_id": "f005b7e9-da3d-4b59-a34b-745e9ec90448",
    "order_short_number": 1,
    "created_at": "2026-10-28T09:09:49.167032Z",
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

`GET /api/rider/v1/orders/35c7a3d2-d11e-4b2a-a428-b74560fa02cc/tip` → **200**

```json
{
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
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
  "available_until": "2026-10-29T09:10:30.171217Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/35c7a3d2-d11e-4b2a-a428-b74560fa02cc/tip` → **201**

```json
{
  "command_id": "c4505e7b-8b12-4caa-b827-6d099e31ffa0",
  "amount_minor": 1100
}
```

```json
{
  "id": "7a3cb431-2133-4f1d-9617-49e82cf3a1c9",
  "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T09:10:33.386284Z"
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
  "session_id": "2ee8c22a-bdc2-464c-a6a9-64e69c27b013",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MzMsImlhdCI6MTc5MzE3ODYzMywianRpIjoiNWJmZTNmOWUtZjJmOS00ZDlhLTkxYzItMzVhZWYxNDcxOTAyIiwic2lkIjoiMmVlOGMyMmEtYmRjMi00NjRjLWE2YTktNjRlNjljMjdiMDEzIn0.gWrdzxeDK5gRPUm9ORr4D8ItlAz6YktNR7wrJMnS3AU",
  "access_expires_at": "2026-10-28T09:25:33.680501216Z",
  "refresh_token": "86P9FBupVD9f_tGIhxMo3uUir2UkYIpEa1iBc81xEck",
  "refresh_expires_at": "2026-10-28T21:10:33.679986135Z",
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
          "CASH": 5,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 1,
          "STAFF": 1
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
      "CASH": 5,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 1,
      "STAFF": 1
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
  "generated_at": "2026-10-28T09:10:33.714077693Z"
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
  "generated_at": "2026-10-28T09:10:33.746503422Z"
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
  "session_id": "4a4e575b-4f71-4ec7-97da-9f07fa23b4be",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MzQsImlhdCI6MTc5MzE3ODYzNCwianRpIjoiNmZkODAxZjQtZWI5OS00ZGU1LWIwNzQtMWJhYzMwZDAxYjhiIiwic2lkIjoiNGE0ZTU3NWItNGY3MS00ZWM3LTk3ZGEtOWYwN2ZhMjNiNGJlIn0.EHh4nwKjROYMEEI8HhyEipSGOHjjwK6YF49QMtZArik",
  "access_expires_at": "2026-10-28T09:25:34.035717598Z",
  "refresh_token": "8lhKjOpw0Ko49en9laut7o_F7A6u38uTMkwsupH-HBo",
  "refresh_expires_at": "2026-10-28T21:10:34.035142605Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/35c7a3d2-d11e-4b2a-a428-b74560fa02cc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:10:28.642161Z",
      "actor": {
        "type": "CLIENT",
        "id": "06120598-59c6-4972-9f18-9de272f7c758",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
        "quote_id": "6af527c2-09b5-4f5f-af5b-976d2d5c4b72",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:10:28.643787Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
        "attempt_id": "22a36aab-7324-46af-9685-fa5dee40eb99",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:10:28.649621Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1a5bec03-4bba-4bde-8d32-92560412dd2a",
        "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:10:28.720574Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1a5bec03-4bba-4bde-8d32-92560412dd2a",
        "order_id": "35c7a3d2-d11e-4b2a-a428-b74560fa02cc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "84a1b25f-7614-4b99-8c63-2c49438b330c"
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
  "at": "2026-10-28T09:10:34.088192138Z",
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
      "last_location_at": "2026-10-28T09:10:30.135238Z",
      "order_id": null
    }
  ]
}
```

Done: order 35c7a3d2-d11e-4b2a-a428-b74560fa02cc.

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
  "session_id": "ca91df8f-95da-451e-a5e1-89649e61ce57",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MzQsImlhdCI6MTc5MzE3ODYzNCwianRpIjoiYWFmYzViNTQtOGRjYi00YjJjLTkwOGQtNTE4YWE3YzZjZjg3Iiwic2lkIjoiY2E5MWRmOGYtOTVkYS00NTFlLWE1ZTEtODk2NDllNjFjZTU3In0.KKWUYBtvXk_LcWipaCsV5mLmXkbTQR3RcUsxPQhZ0oQ",
  "access_expires_at": "2026-10-28T09:25:34.392145569Z",
  "refresh_token": "RF_KQXn_EOZ-yinTbHwzJDeSs0N4sRG-p6UalFF8ANs",
  "refresh_expires_at": "2026-10-28T21:10:34.391728701Z",
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
  "command_id": "a5e01f6d-2855-4c02-aa93-c4ca1f242e5f",
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
  "timestamp": "2026-10-28T09:10:34.000+0000",
  "channel": {
    "id": "1730052000.1144619822",
    "linkedid": "1730052000.1144619822",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670235302"
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
  "timestamp": "2026-10-28T09:10:34.000+0000",
  "channel": {
    "id": "1730052000.1144619822",
    "linkedid": "1730052000.1144619822",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670235302"
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
  "session_id": "32b8fc09-d928-47d7-b975-e10ace0ed937",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MzQsImlhdCI6MTc5MzE3ODYzNCwianRpIjoiMGE2OTRhZTgtMTk2Mi00Y2I5LWFkNjQtNGIyYTQ0NzAxNGZiIiwic2lkIjoiMzJiOGZjMDktZDkyOC00N2Q3LWI5NzUtZTEwYWNlMGVkOTM3In0.J_VAv0vfQAxYNeTcwZ-4X9S1R9Z0iOYIxWZPWnTnNPE",
  "access_expires_at": "2026-10-28T09:25:34.795023259Z",
  "refresh_token": "Q2vEM1Bq_tSOTiMLEOBcoACvPKhvEV4N3Sm62nKrudE",
  "refresh_expires_at": "2026-10-28T21:10:34.794602375Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "28b2f6cc-6d94-4b17-a304-b6d5eebf26ce",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670235302",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:10:34Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/28b2f6cc-6d94-4b17-a304-b6d5eebf26ce/answer` → **200**

```json
{
  "command_id": "829d3e5a-7a10-48b7-853d-3eeaf7d79159"
}
```

```json
{
  "id": "28b2f6cc-6d94-4b17-a304-b6d5eebf26ce",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670235302",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "order_ids": [],
  "started_at": "2026-10-28T09:10:34Z",
  "answered_at": "2026-10-28T09:10:34.863227Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1144619822",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "54aa103b-5eee-4660-af89-3f5375d19a61",
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
  "id": "c0f12aae-e637-46c9-b257-cd4076e38926",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:34.940381Z",
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
  "command_id": "7c4df05a-851f-49b4-8205-a45a2b072845",
  "quote_id": "c0f12aae-e637-46c9-b257-cd4076e38926",
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
    "phone": "+380670235302"
  },
  "call_id": "28b2f6cc-6d94-4b17-a304-b6d5eebf26ce"
}
```

```json
{
  "id": "9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb",
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
  "created_at": "2026-10-28T09:10:34.99468Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670235302"
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
    "id": "1730052000.1144619822",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "28b2f6cc-6d94-4b17-a304-b6d5eebf26ce",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670235302",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [
        "9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb"
      ],
      "started_at": "2026-10-28T09:10:34Z",
      "answered_at": "2026-10-28T09:10:34.863227Z",
      "ended_at": "2026-10-28T09:10:35.047416Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "e1437310-c157-444d-995a-f4ff7619cb5b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677972945",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [],
      "started_at": "2026-10-28T09:09:53.614848Z",
      "answered_at": "2026-10-28T09:09:53.677246Z",
      "ended_at": "2026-10-28T09:09:53.816892Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:09:55.027854Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb` → **200**

```json
{
  "id": "9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb",
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
  "created_at": "2026-10-28T09:10:34.99468Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670235302"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb` → **200**

```json
{
  "id": "9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb",
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
  "created_at": "2026-10-28T09:10:34.99468Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670235302"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb/cancel` → **200**

```json
{
  "command_id": "ce98bcbe-566c-44a1-9d65-09d0c99df809",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb",
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
  "created_at": "2026-10-28T09:10:34.99468Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670235302"
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

Done: call 28b2f6cc-6d94-4b17-a304-b6d5eebf26ce with order 9dc3350f-2a5b-4e8b-a2f1-64c8cf520eeb.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31766"
}
```

```json
{
  "challenge_id": "e8493608-96ad-4d96-9c77-847d87eac69c",
  "expires_at": "2026-10-28T09:15:35.216380443Z",
  "resend_available_at": "2026-10-28T09:10:36.216380443Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "926222",
  "sent_at": "2026-10-28T09:10:35.218192995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8493608-96ad-4d96-9c77-847d87eac69c",
  "code": "926222",
  "device_ref": "sandbox-31766"
}
```

```json
{
  "session_id": "5d34902c-b527-4e2b-8c24-ad67749c8dcf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTUzNSwiaWF0IjoxNzkzMTc4NjM1LCJqdGkiOiJiODNlMDk2OS01M2NhLTRjODYtYWExZC0xMGQ2NjM0ZmZjNDMiLCJzaWQiOiI1ZDM0OTAyYy1iNTI3LTRlMmItOGMyNC1hZDY3NzQ5YzhkY2YifQ.o8jSe7VFYM0fgLridh98l5NKlFv_O0Q-gXRXzxqsD0o",
  "access_expires_at": "2026-10-28T09:25:35.274240487Z",
  "refresh_token": "Tfbvvg_wp3LgUFikiohfbMs3_WwN5WBagmjH7rwTGpE",
  "refresh_expires_at": "2026-11-27T09:10:35.273780254Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:30.135238Z",
  "last_location_at": "2026-10-28T09:10:30.135238Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/handover` → **200**

```json
{
  "command_id": "082b1c4c-872c-4a13-a37f-fed235a28ee9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:30.135238Z",
  "last_location_at": "2026-10-28T09:10:30.135238Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:35Z",
    "sequence": 1793178635360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:35.378642Z",
  "last_location_at": "2026-10-28T09:10:35.378642Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666919976",
  "device_ref": "sandbox-4089"
}
```

```json
{
  "challenge_id": "dceaa3e5-3d81-414f-bd72-928e7914b1eb",
  "expires_at": "2026-10-28T09:15:35.402664807Z",
  "resend_available_at": "2026-10-28T09:10:36.402664807Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666919976` → **200**

```json
{
  "phone": "+380666919976",
  "audience": "CLIENT",
  "code": "997080",
  "sent_at": "2026-10-28T09:10:35.404741486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dceaa3e5-3d81-414f-bd72-928e7914b1eb",
  "code": "997080",
  "device_ref": "sandbox-4089"
}
```

```json
{
  "session_id": "4ea231f7-4e6a-4a7c-b997-1d2567662056",
  "subject": {
    "type": "CLIENT",
    "id": "945d5902-fcd1-4762-b891-2da8a98ba91c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDVkNTkwMi1mY2QxLTQ3NjItYjg5MS0yZGE4YTk4YmE5MWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTM1LCJpYXQiOjE3OTMxNzg2MzUsImp0aSI6IjVlZTBhNDQwLTliOTItNDA4MS1iMmE4LWY3MWY0YzUwMzU0YiIsInNpZCI6IjRlYTIzMWY3LTRlNmEtNGE3Yy1iOTk3LTFkMjU2NzY2MjA1NiJ9.q9shdYQs_5u9o1lmYqqJsI8CPpDnPUeEcpa0Ad2dVmk",
  "access_expires_at": "2026-10-28T09:25:35.460463706Z",
  "refresh_token": "b63whL--qmXwCHiUpGh1BqenpUq2qZalc37HExdwJQU",
  "refresh_expires_at": "2026-11-27T09:10:35.460029212Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7894838f-80e9-4343-bb00-8412a9a53dd3",
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
  "id": "6cb41bd4-6f73-4eac-ae6d-defa2f82c2dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:35.496002Z",
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
  "command_id": "0d382318-8610-43e8-a1bc-65ced1319a0b",
  "quote_id": "6cb41bd4-6f73-4eac-ae6d-defa2f82c2dc",
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
  "id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "945d5902-fcd1-4762-b891-2da8a98ba91c",
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
  "created_at": "2026-10-28T09:10:35.534123Z",
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
    "id": "e788e38d-70e0-496a-ab29-f786b3fb697b",
    "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
    "expires_at": "2026-10-28T09:10:50.536994Z",
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

`POST /api/driver/v1/offers/e788e38d-70e0-496a-ab29-f786b3fb697b/accept` → **200**

```json
{
  "command_id": "36e827c4-5cdf-4006-8c32-4d2c9e88b7b7"
}
```

```json
{
  "id": "69d4c331-83a6-4120-bc8b-3bcc80a72895",
  "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2670fe75-654e-437c-9900-cc932798e787",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2670fe75-654e-437c-9900-cc932798e787",
  "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
  "assignment_id": "69d4c331-83a6-4120-bc8b-3bcc80a72895",
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

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:35Z",
    "sequence": 1793178635638
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:35.656951Z",
  "last_location_at": "2026-10-28T09:10:35.656951Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2670fe75-654e-437c-9900-cc932798e787/arrive` → **200**

```json
{
  "command_id": "f3e8ad4a-1253-4d04-8e77-3fd9b4648bb2",
  "expected_version": 0
}
```

```json
{
  "id": "2670fe75-654e-437c-9900-cc932798e787",
  "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
  "assignment_id": "69d4c331-83a6-4120-bc8b-3bcc80a72895",
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
  "arrived_at": "2026-10-28T09:10:35.692378Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2670fe75-654e-437c-9900-cc932798e787/start` → **200**

```json
{
  "command_id": "614a1384-5c08-4e50-86f7-7b112fe5a141",
  "expected_version": 1
}
```

```json
{
  "id": "2670fe75-654e-437c-9900-cc932798e787",
  "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
  "assignment_id": "69d4c331-83a6-4120-bc8b-3bcc80a72895",
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
  "arrived_at": "2026-10-28T09:10:35.692378Z",
  "started_at": "2026-10-28T09:10:35.73082Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:35Z",
    "sequence": 1793178635757
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:35.775392Z",
  "last_location_at": "2026-10-28T09:10:35.775392Z",
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
  "device_ref": "sandbox-17489"
}
```

```json
{
  "challenge_id": "065c9e76-13cd-406f-b7dc-f175cd250d11",
  "expires_at": "2026-10-28T09:15:35.799046973Z",
  "resend_available_at": "2026-10-28T09:10:36.799046973Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "920560",
  "sent_at": "2026-10-28T09:10:35.800949273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "065c9e76-13cd-406f-b7dc-f175cd250d11",
  "code": "920560",
  "device_ref": "sandbox-17489"
}
```

```json
{
  "session_id": "f504ea73-5a81-4213-89b9-b80935b9edad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTUzNSwiaWF0IjoxNzkzMTc4NjM1LCJqdGkiOiI2YTk1ODI3YS0zOTE0LTRjNjUtYWM1NS00N2NmMTQ2MzQ2ZTEiLCJzaWQiOiJmNTA0ZWE3My01YTgxLTQyMTMtODliOS1iODA5MzViOWVkYWQifQ.ED4-AXk0xCf33rr7e1a5KqwOGiRtC3ksBYQg-OF2ON0",
  "access_expires_at": "2026-10-28T09:25:35.855027696Z",
  "refresh_token": "gy_q-CXPBLlCI8cj_VfN_kcefW0ekeAxuBpJ9VbG78k",
  "refresh_expires_at": "2026-11-27T09:10:35.854529367Z",
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
  "command_id": "f284ff66-9b67-4e38-bf67-138db0bfd38b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:35Z",
    "sequence": 1793178635904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404a7959-64de-4ad8-9445-570600b95b52",
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
  "last_heartbeat_at": "2026-10-28T09:10:35.922134Z",
  "last_location_at": "2026-10-28T09:10:35.922134Z",
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
  "session_id": "0be14165-d292-4fd8-89c0-8a764a1554d1",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MzYsImlhdCI6MTc5MzE3ODYzNiwianRpIjoiMmFlZGEwMjEtNzE4NS00MzJlLThiNWYtNzUzYmI1MTNiMWU0Iiwic2lkIjoiMGJlMTQxNjUtZDI5Mi00ZmQ4LTg5YzAtOGE3NjRhMTU1NGQxIn0.KCefWWI9-WkfeyhWBkpUMmOQ8R7lVm5k3MPi9LiGBno",
  "access_expires_at": "2026-10-28T09:25:36.213651632Z",
  "refresh_token": "NqhzHHCV3VFnfTIp3cIdlkx4pq95OCGtg2e7SBvT9HU",
  "refresh_expires_at": "2026-10-28T21:10:36.213050326Z",
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
  "session_id": "77c6ce30-382e-4e0c-a8d1-d53f7117c589",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1MzYsImlhdCI6MTc5MzE3ODYzNiwianRpIjoiZjE2ZTQ4N2UtNjJmOS00Mjc0LTgzMWItMWM5NWY4MDcwMzVmIiwic2lkIjoiNzdjNmNlMzAtMzgyZS00ZTBjLWE4ZDEtZDUzZjcxMTdjNTg5In0.zTniKjvx3J4XGvWB4UCJbcalQOq_juMCETAKVuUm6D4",
  "access_expires_at": "2026-10-28T09:25:36.498417114Z",
  "refresh_token": "jx67QfzGCd-4K-bNbyFgTX0yYefyF9e-Hygc_-PbPC4",
  "refresh_expires_at": "2026-10-28T21:10:36.497911499Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fea5e221-a435-4b0e-9bdc-7003b9129cf1` → **200**

```json
{
  "id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "945d5902-fcd1-4762-b891-2da8a98ba91c",
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
    "id": "69d4c331-83a6-4120-bc8b-3bcc80a72895",
    "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2670fe75-654e-437c-9900-cc932798e787",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T09:10:35.534123Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fea5e221-a435-4b0e-9bdc-7003b9129cf1/interrupt` → **200**

```json
{
  "command_id": "56b995e4-c548-4b7d-ac0e-57c86ab457d2",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "945d5902-fcd1-4762-b891-2da8a98ba91c",
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
      "id": "69d4c331-83a6-4120-bc8b-3bcc80a72895",
      "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "2670fe75-654e-437c-9900-cc932798e787",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T09:10:35.534123Z",
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
    "id": "8ccf8acb-8cc1-4817-a61f-84738bb7820c",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "945d5902-fcd1-4762-b891-2da8a98ba91c",
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
    "id": "f6f6e9e3-2ff4-4210-bbde-77efb128f82a",
    "order_id": "8ccf8acb-8cc1-4817-a61f-84738bb7820c",
    "expires_at": "2026-10-28T09:10:51.576632Z",
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

`POST /api/driver/v1/offers/f6f6e9e3-2ff4-4210-bbde-77efb128f82a/accept` → **200**

```json
{
  "command_id": "17c4d874-e139-4c47-ab3e-769bad3e4b3b"
}
```

```json
{
  "id": "f7cb46d1-1ea3-446c-8274-eb2c6c6e66db",
  "order_id": "8ccf8acb-8cc1-4817-a61f-84738bb7820c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a3adce2f-fcc1-410c-ac9b-9131cda0f254",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a3adce2f-fcc1-410c-ac9b-9131cda0f254",
  "order_id": "8ccf8acb-8cc1-4817-a61f-84738bb7820c",
  "assignment_id": "f7cb46d1-1ea3-446c-8274-eb2c6c6e66db",
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
  "session_id": "404a7959-64de-4ad8-9445-570600b95b52",
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
  "last_heartbeat_at": "2026-10-28T09:10:35.922134Z",
  "last_location_at": "2026-10-28T09:10:35.922134Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/404a7959-64de-4ad8-9445-570600b95b52/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:36Z",
    "sequence": 1793178636706
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404a7959-64de-4ad8-9445-570600b95b52",
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
  "last_heartbeat_at": "2026-10-28T09:10:36.725269Z",
  "last_location_at": "2026-10-28T09:10:36.725269Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a3adce2f-fcc1-410c-ac9b-9131cda0f254/arrive` → **200**

```json
{
  "command_id": "462c32f9-94a7-470d-b7b1-f5bf306d2956",
  "expected_version": 0
}
```

```json
{
  "id": "a3adce2f-fcc1-410c-ac9b-9131cda0f254",
  "order_id": "8ccf8acb-8cc1-4817-a61f-84738bb7820c",
  "assignment_id": "f7cb46d1-1ea3-446c-8274-eb2c6c6e66db",
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
  "arrived_at": "2026-10-28T09:10:36.761209Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a3adce2f-fcc1-410c-ac9b-9131cda0f254/start` → **200**

```json
{
  "command_id": "9fc418a5-1bc0-4dff-89f2-064419751353",
  "expected_version": 1
}
```

```json
{
  "id": "a3adce2f-fcc1-410c-ac9b-9131cda0f254",
  "order_id": "8ccf8acb-8cc1-4817-a61f-84738bb7820c",
  "assignment_id": "f7cb46d1-1ea3-446c-8274-eb2c6c6e66db",
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
  "arrived_at": "2026-10-28T09:10:36.761209Z",
  "started_at": "2026-10-28T09:10:36.799746Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a3adce2f-fcc1-410c-ac9b-9131cda0f254/complete` → **200**

```json
{
  "command_id": "d1b18ced-ea6b-4412-b872-830a8894bcef",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:10:36Z"
}
```

```json
{
  "id": "a3adce2f-fcc1-410c-ac9b-9131cda0f254",
  "order_id": "8ccf8acb-8cc1-4817-a61f-84738bb7820c",
  "assignment_id": "f7cb46d1-1ea3-446c-8274-eb2c6c6e66db",
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
  "arrived_at": "2026-10-28T09:10:36.761209Z",
  "started_at": "2026-10-28T09:10:36.799746Z",
  "completed_at": "2026-10-28T09:10:36.84183Z",
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
    "id": "8ccf8acb-8cc1-4817-a61f-84738bb7820c",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:10:36.56746Z",
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
    "id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
    "short_number": 8,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:10:35.534123Z",
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

`GET /api/operator/v1/orders/fea5e221-a435-4b0e-9bdc-7003b9129cf1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:10:35.534723Z",
      "actor": {
        "type": "CLIENT",
        "id": "945d5902-fcd1-4762-b891-2da8a98ba91c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
        "quote_id": "6cb41bd4-6f73-4eac-ae6d-defa2f82c2dc",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:10:35.536326Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
        "attempt_id": "919059b6-41ea-45f4-a83d-6ad656701ed0",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:10:35.539368Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e788e38d-70e0-496a-ab29-f786b3fb697b",
        "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:10:35.597612Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e788e38d-70e0-496a-ab29-f786b3fb697b",
        "order_id": "fea5e221-a435-4b0e-9bdc-7003b9129cf1",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "69d4c331-83a6-4120-bc8b-3bcc80a72895"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted fea5e221-a435-4b0e-9bdc-7003b9129cf1, follow-up 8ccf8acb-8cc1-4817-a61f-84738bb7820c.

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
  "session_id": "d0fb2750-49fd-4ef9-b733-c05e5e51342c",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NDAsImlhdCI6MTc5MzE3ODY0MCwianRpIjoiZjVhNjgxNTUtY2ExZi00Y2RlLWFkNmEtYmJhMTlhMzJiMThmIiwic2lkIjoiZDBmYjI3NTAtNDlmZC00ZWY5LWI3MzMtYzA1ZTVlNTEzNDJjIn0.JgE8kqX1B_TWjiHc3PLyAsGXvNIniPn6-5D49r3KLho",
  "access_expires_at": "2026-10-28T09:25:40.287568846Z",
  "refresh_token": "BY1UgPdtVtt65EBXYB0L-cTlX6_FC3YDWsHg8y7PJWs",
  "refresh_expires_at": "2026-10-28T21:10:40.286701629Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "dcc19ad8-9d87-4345-bd6d-f405b0ffd8a9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:10:40Z"
}
```

```json
{
  "id": "51c1915e-863f-4eec-8d4c-fea182693a88",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:10:40Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/51c1915e-863f-4eec-8d4c-fea182693a88/publish` → **200**

```json
{
  "command_id": "01bf0b63-c967-45c2-bbe1-3be08da8b835",
  "expected_version": 0
}
```

```json
{
  "id": "51c1915e-863f-4eec-8d4c-fea182693a88",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:10:40.374082Z",
  "published_at": "2026-10-28T09:10:40.374082Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "51c1915e-863f-4eec-8d4c-fea182693a88",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T09:10:40.374082Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630762770",
  "device_ref": "sandbox-31231"
}
```

```json
{
  "challenge_id": "d87a47cd-b39d-4bce-9feb-526f2e41a696",
  "expires_at": "2026-10-28T09:15:40.433972014Z",
  "resend_available_at": "2026-10-28T09:10:41.433972014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630762770` → **200**

```json
{
  "phone": "+380630762770",
  "audience": "CLIENT",
  "code": "432616",
  "sent_at": "2026-10-28T09:10:40.43587564Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d87a47cd-b39d-4bce-9feb-526f2e41a696",
  "code": "432616",
  "device_ref": "sandbox-31231"
}
```

```json
{
  "session_id": "20773a94-b0a3-4f03-a334-9dcefd5dae15",
  "subject": {
    "type": "CLIENT",
    "id": "8963d4ed-1634-40c1-9b4b-6803257195fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTYzZDRlZC0xNjM0LTQwYzEtOWI0Yi02ODAzMjU3MTk1ZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTQwLCJpYXQiOjE3OTMxNzg2NDAsImp0aSI6ImFmZWRmZDQxLWFlYTQtNDE0Ni1hZDZjLWUxODIyODBkZjkyZiIsInNpZCI6IjIwNzczYTk0LWIwYTMtNGYwMy1hMzM0LTlkY2VmZDVkYWUxNSJ9.v-35Ir1cSxD66h6cIVTsqNzvZc2XHdl0w6COPcwPrn0",
  "access_expires_at": "2026-10-28T09:25:40.516943144Z",
  "refresh_token": "BtKJn8DQSzAeMgvN62r57-Iweu-bTpJaD_FZbwhY6gk",
  "refresh_expires_at": "2026-11-27T09:10:40.51644838Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "51c1915e-863f-4eec-8d4c-fea182693a88",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T09:10:40.374082Z",
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
  "command_id": "ce61ac50-e862-4e1d-ae61-15490cf84678",
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
  "id": "194e922b-e9b6-4633-a44c-f9d218f8c31d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:40.575528Z",
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
  "command_id": "22572f0a-1f8b-49f8-937b-fa5767969f02",
  "quote_id": "194e922b-e9b6-4633-a44c-f9d218f8c31d",
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
  "correlation_id": "e906a0d8-f9ce-4bb6-920b-599eecb3a193"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "2b5e178a-d126-4afa-afec-592052eeaba0",
  "version_id": "51c1915e-863f-4eec-8d4c-fea182693a88",
  "language": "uk"
}
```

```json
{
  "version_id": "51c1915e-863f-4eec-8d4c-fea182693a88",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T09:10:40.646202Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c80c286d-f364-47a2-8530-7fd8fc29e55a",
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
  "id": "b8295c1c-af5c-4062-ab69-1be46c385679",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:40.686405Z",
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
  "command_id": "e14b7931-cc7e-417c-a4d3-2c1fbcf82549",
  "quote_id": "b8295c1c-af5c-4062-ab69-1be46c385679",
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
  "id": "10149d8d-0011-4e2b-a9bc-efba16d2839d",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8963d4ed-1634-40c1-9b4b-6803257195fe",
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
  "created_at": "2026-10-28T09:10:40.719572Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/10149d8d-0011-4e2b-a9bc-efba16d2839d` → **200**

```json
{
  "id": "10149d8d-0011-4e2b-a9bc-efba16d2839d",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8963d4ed-1634-40c1-9b4b-6803257195fe",
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
  "created_at": "2026-10-28T09:10:40.719572Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/10149d8d-0011-4e2b-a9bc-efba16d2839d/cancel` → **200**

```json
{
  "command_id": "141a7f9c-3ead-468c-a0a1-b97ebbd20366",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "10149d8d-0011-4e2b-a9bc-efba16d2839d",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8963d4ed-1634-40c1-9b4b-6803257195fe",
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
  "created_at": "2026-10-28T09:10:40.719572Z",
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

`POST /api/admin/v1/legal-documents/51c1915e-863f-4eec-8d4c-fea182693a88` → **409**

```json
{
  "command_id": "ebee9909-76f4-4c96-ace1-1e56cdf488ba",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:10:40Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/51c1915e-863f-4eec-8d4c-fea182693a88",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7a66b250-00c6-49af-bfdc-c3b530762307"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b8b9513d-7558-4bf2-88dc-84b2e4ebb676",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:10:40Z"
}
```

```json
{
  "id": "256fd0c7-8c2f-4c8f-8453-e8184f1ab913",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:10:40Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/256fd0c7-8c2f-4c8f-8453-e8184f1ab913/publish` → **200**

```json
{
  "command_id": "837be483-ebd8-4f27-8948-b6bf997f2b05",
  "expected_version": 0
}
```

```json
{
  "id": "256fd0c7-8c2f-4c8f-8453-e8184f1ab913",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:10:40.900012Z",
  "published_at": "2026-10-28T09:10:40.900012Z",
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
  "device_ref": "sandbox-7168"
}
```

```json
{
  "challenge_id": "db160ddf-0c89-4cd4-a53a-6d250da40f8c",
  "expires_at": "2026-10-28T09:15:40.936887105Z",
  "resend_available_at": "2026-10-28T09:10:41.936887105Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "762206",
  "sent_at": "2026-10-28T09:10:40.938685805Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db160ddf-0c89-4cd4-a53a-6d250da40f8c",
  "code": "762206",
  "device_ref": "sandbox-7168"
}
```

```json
{
  "session_id": "d113c01c-e9a6-48ef-ab2e-d6a473242ea0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTU0MCwiaWF0IjoxNzkzMTc4NjQwLCJqdGkiOiJmNzY3NDFhNi00ZDQ2LTQ5NzgtYjY1ZC1iNzFhYzViNWM4YWYiLCJzaWQiOiJkMTEzYzAxYy1lOWE2LTQ4ZWYtYWIyZS1kNmE0NzMyNDJlYTAifQ.Og0svLunPA8qcwEBS-he6Z7ZEdnjbK3XzhC05OU_57E",
  "access_expires_at": "2026-10-28T09:25:40.991916863Z",
  "refresh_token": "ADRSZmuS5QrxTXkQ2FsEc7cSS28vgXCIj85BdEy3Z94",
  "refresh_expires_at": "2026-11-27T09:10:40.991498167Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404a7959-64de-4ad8-9445-570600b95b52",
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
  "last_heartbeat_at": "2026-10-28T09:10:36.725269Z",
  "last_location_at": "2026-10-28T09:10:36.725269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/404a7959-64de-4ad8-9445-570600b95b52/handover` → **200**

```json
{
  "command_id": "d02426ac-3684-47ff-8e9c-16e756a8256a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404a7959-64de-4ad8-9445-570600b95b52",
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
  "last_heartbeat_at": "2026-10-28T09:10:36.725269Z",
  "last_location_at": "2026-10-28T09:10:36.725269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/404a7959-64de-4ad8-9445-570600b95b52/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:41Z",
    "sequence": 1793178641948
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "404a7959-64de-4ad8-9445-570600b95b52",
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
  "last_heartbeat_at": "2026-10-28T09:10:41.112776Z",
  "last_location_at": "2026-10-28T09:10:41.112776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675150693",
  "device_ref": "sandbox-3854"
}
```

```json
{
  "challenge_id": "ba35ca15-75e4-489f-ac9d-3d9ff35415c4",
  "expires_at": "2026-10-28T09:15:41.140053004Z",
  "resend_available_at": "2026-10-28T09:10:42.140053004Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675150693` → **200**

```json
{
  "phone": "+380675150693",
  "audience": "CLIENT",
  "code": "514381",
  "sent_at": "2026-10-28T09:10:41.200524699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba35ca15-75e4-489f-ac9d-3d9ff35415c4",
  "code": "514381",
  "device_ref": "sandbox-3854"
}
```

```json
{
  "session_id": "54755548-0868-41f7-9b72-f340f1195c18",
  "subject": {
    "type": "CLIENT",
    "id": "aa842804-4905-4dda-b554-a5db3e1d2e12"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTg0MjgwNC00OTA1LTRkZGEtYjU1NC1hNWRiM2UxZDJlMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTQxLCJpYXQiOjE3OTMxNzg2NDEsImp0aSI6IjJkMmE2YmM4LTQxMjItNGM0NS04YTZhLWJmOTUyNDFkNWM2NCIsInNpZCI6IjU0NzU1NTQ4LTA4NjgtNDFmNy05YjcyLWYzNDBmMTE5NWMxOCJ9.6TGZDk05W-R3yC2sZkcNQhWNS-NSicHKdIrgcH0WW3k",
  "access_expires_at": "2026-10-28T09:25:41.257221892Z",
  "refresh_token": "8NFJq9xXUcFIfiwb31vC_0VqtrzB3RnSJMTqbDCP8Vs",
  "refresh_expires_at": "2026-11-27T09:10:41.256813576Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d905c968-e1d7-4bdd-8e5a-756603bd5fb0",
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
  "id": "0db33b28-821d-4ad6-b7e2-ff52e4331da4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:41.291294Z",
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
  "command_id": "f7ff5710-c497-46d7-bcf9-343611d17ae2",
  "quote_id": "0db33b28-821d-4ad6-b7e2-ff52e4331da4",
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
    "phone": "+380674218996"
  }
}
```

```json
{
  "id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:41.328759Z",
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
    "id": "41b8007a-64e2-4289-aeee-e4852289ffae",
    "order_id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
    "expires_at": "2026-10-28T09:10:56.33129Z",
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

`POST /api/driver/v1/offers/41b8007a-64e2-4289-aeee-e4852289ffae/accept` → **200**

```json
{
  "command_id": "444a19fa-8df8-4e55-89c7-a7f752bcfef7"
}
```

```json
{
  "id": "b2c0c652-8097-4d35-9671-55b63d8b364d",
  "order_id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "57508009-a5d7-4b16-a240-fd92e5b5047f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "57508009-a5d7-4b16-a240-fd92e5b5047f",
  "order_id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
  "assignment_id": "b2c0c652-8097-4d35-9671-55b63d8b364d",
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
    "phone": "+380674218996"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "44e89952-2022-44c0-afc1-3ff2f6b79bbc",
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
  "id": "55b45046-7841-4b93-bad8-91d85705c110",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:41.462810Z",
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
  "command_id": "418b536a-f7b4-459e-87a4-3858eb07738d",
  "quote_id": "55b45046-7841-4b93-bad8-91d85705c110",
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
  "id": "3edee64d-783e-4cca-9d86-df6902035082",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:41.501249Z",
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
  "command_id": "7ef639fc-0d22-4eb5-9ea3-6117ffb44156",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T12:10:41Z"
}
```

```json
{
  "id": "e667a37b-56f9-4702-ac3e-43f20a980bab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:41.545105Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:10:41Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "85892320-b3bb-4ad5-8fd8-3de43f2f4148",
  "quote_id": "e667a37b-56f9-4702-ac3e-43f20a980bab",
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
  "pickup_at": "2026-10-28T12:10:41Z"
}
```

```json
{
  "id": "26479c3a-46e0-4526-a695-ff2119206771",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:41.584813Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:10:41Z",
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
  "command_id": "cbc8ef18-aa36-4dd6-96e9-7343a34101ca",
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
  "id": "7d9df8a4-e4e5-4f1a-ade5-8d49768a5fd6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:41.626904Z",
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
  "command_id": "639a439c-2c2d-4ad7-8639-fffae18530b9",
  "quote_id": "7d9df8a4-e4e5-4f1a-ade5-8d49768a5fd6",
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
  "correlation_id": "a68ebc5d-0f5d-4460-8d00-d6e1f7ecc51e"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "26479c3a-46e0-4526-a695-ff2119206771",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T09:10:41.584813Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T12:10:41Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "3edee64d-783e-4cca-9d86-df6902035082",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T09:10:41.501249Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "3edee64d-783e-4cca-9d86-df6902035082",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:41.501249Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/dd21089f-4d96-4978-86d3-1a877c6f8a68` → **200**

```json
{
  "id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "b2c0c652-8097-4d35-9671-55b63d8b364d",
    "order_id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "57508009-a5d7-4b16-a240-fd92e5b5047f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:10:41.328759Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/dd21089f-4d96-4978-86d3-1a877c6f8a68/cancel` → **200**

```json
{
  "command_id": "5644eaa8-7e21-4262-bc99-c58ca2a2b729",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "b2c0c652-8097-4d35-9671-55b63d8b364d",
    "order_id": "dd21089f-4d96-4978-86d3-1a877c6f8a68",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "57508009-a5d7-4b16-a240-fd92e5b5047f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:10:41.328759Z",
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

`GET /api/rider/v1/orders/3edee64d-783e-4cca-9d86-df6902035082` → **200**

```json
{
  "id": "3edee64d-783e-4cca-9d86-df6902035082",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:41.501249Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/3edee64d-783e-4cca-9d86-df6902035082/cancel` → **200**

```json
{
  "command_id": "096f7ebd-aafc-47d8-a87a-a16d46681667",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3edee64d-783e-4cca-9d86-df6902035082",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:41.501249Z",
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

`GET /api/rider/v1/orders/26479c3a-46e0-4526-a695-ff2119206771` → **200**

```json
{
  "id": "26479c3a-46e0-4526-a695-ff2119206771",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:41.584813Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:10:41Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/26479c3a-46e0-4526-a695-ff2119206771/cancel` → **200**

```json
{
  "command_id": "e786d53f-1b74-4cde-845c-ab352795924b",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "26479c3a-46e0-4526-a695-ff2119206771",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "aa842804-4905-4dda-b554-a5db3e1d2e12",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T09:10:41.584813Z",
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
  "pickup_at": "2026-10-28T12:10:41Z",
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
  "session_id": "404a7959-64de-4ad8-9445-570600b95b52",
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
  "last_heartbeat_at": "2026-10-28T09:10:41.112776Z",
  "last_location_at": "2026-10-28T09:10:41.112776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/404a7959-64de-4ad8-9445-570600b95b52/close` → **200**

```json
{
  "command_id": "39404a9e-eae8-448a-a1aa-091888619522",
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

Done: orders dd21089f-4d96-4978-86d3-1a877c6f8a68, 3edee64d-783e-4cca-9d86-df6902035082, 26479c3a-46e0-4526-a695-ff2119206771.

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
  "session_id": "3f8bdfed-a789-46fa-8137-d0e53503f372",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NDIsImlhdCI6MTc5MzE3ODY0MiwianRpIjoiYmVhNDE4YTAtNjZjMi00OWU4LWI1NGYtMTg5YWI3ZjMzZjAxIiwic2lkIjoiM2Y4YmRmZWQtYTc4OS00NmZhLTgxMzctZDBlNTM1MDNmMzcyIn0.fQcQoaSVs_CHPINwY9h5QQeN3_m76z1B9RfZSYQRz3A",
  "access_expires_at": "2026-10-28T09:25:42.235859628Z",
  "refresh_token": "qdeGflesxheKjdLdoj3RYp1oL85enSz3-iY324dp1uE",
  "refresh_expires_at": "2026-10-28T21:10:42.23537974Z",
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
  "session_id": "8ea92530-b8ac-4d9b-876e-10b69365e0f2",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NDIsImlhdCI6MTc5MzE3ODY0MiwianRpIjoiNzBhY2FiYWItMGZiNC00MjZkLThlNjQtYjk2OGM2M2U5OGFiIiwic2lkIjoiOGVhOTI1MzAtYjhhYy00ZDliLTg3NmUtMTBiNjkzNjVlMGYyIn0.VoTQobUkCcsygtSnO1HhTmWMM6yl3OsrXAVTGxKss9I",
  "access_expires_at": "2026-10-28T09:25:42.524637431Z",
  "refresh_token": "MaIQWbiHUoy6u9uP3r1BqqGU8akxt-bg04qGyAfaqx8",
  "refresh_expires_at": "2026-10-28T21:10:42.524143688Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7073"
}
```

```json
{
  "challenge_id": "eaff0dcc-43c1-4f0e-832d-4c0b2fc19161",
  "expires_at": "2026-10-28T09:15:42.547418503Z",
  "resend_available_at": "2026-10-28T09:10:43.547418503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "435013",
  "sent_at": "2026-10-28T09:10:42.549327227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eaff0dcc-43c1-4f0e-832d-4c0b2fc19161",
  "code": "435013",
  "device_ref": "sandbox-7073"
}
```

```json
{
  "session_id": "ae7ec1d8-c8aa-4041-8c58-a4cefeddc34e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTU0MiwiaWF0IjoxNzkzMTc4NjQyLCJqdGkiOiJiYTliMjI4MC0wZTc0LTRlZTYtYThjNC1jZmIzN2ViNWIwYTAiLCJzaWQiOiJhZTdlYzFkOC1jOGFhLTQwNDEtOGM1OC1hNGNlZmVkZGMzNGUifQ.6Epw4JrTALqfP7sYtjc5V487P_i_o4tx4sZsQlVyHvc",
  "access_expires_at": "2026-10-28T09:25:42.606780076Z",
  "refresh_token": "6L9L9e5dhsL_AJ026f84tOLfPx8Xg5EsfDEUSb58EYU",
  "refresh_expires_at": "2026-11-27T09:10:42.606358941Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:35.775392Z",
  "last_location_at": "2026-10-28T09:10:35.775392Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/handover` → **200**

```json
{
  "command_id": "4ef78e0a-040c-45d9-b5a8-c53cc1e525be",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:35.775392Z",
  "last_location_at": "2026-10-28T09:10:35.775392Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:42Z",
    "sequence": 1793178642688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:42.706341Z",
  "last_location_at": "2026-10-28T09:10:42.706341Z",
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
  "command_id": "c4f7afba-0c01-4068-b25a-336be49b68f3",
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
  "effective_at": "2026-10-28T09:10:42.772597Z",
  "changed_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T09:10:42.801031834Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "849dd0e9-ae63-4721-a361-c22d82d4d96b",
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
  "id": "e8635fcf-abd9-4766-a45f-7e0ad27a4b7a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:42.834768Z",
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
  "command_id": "7aba4c3f-21cf-4dd6-b5ce-27f65098fe52",
  "quote_id": "e8635fcf-abd9-4766-a45f-7e0ad27a4b7a",
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
    "phone": "+3806711131578"
  }
}
```

```json
{
  "id": "82c7c44e-09e5-4929-9dd9-806f7c58b31f",
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
  "created_at": "2026-10-28T09:10:42.870621Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131578"
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
    "id": "fbe2bebf-90ed-418c-9b9e-a7b99864109a",
    "order_id": "82c7c44e-09e5-4929-9dd9-806f7c58b31f",
    "expires_at": "2026-10-28T09:10:57.873545Z",
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

`POST /api/driver/v1/offers/fbe2bebf-90ed-418c-9b9e-a7b99864109a/accept` → **200**

```json
{
  "command_id": "369621cb-634c-4249-87aa-2661d7e63cb8"
}
```

```json
{
  "id": "1e2a19dd-995c-4d64-92c4-dff8746a40a0",
  "order_id": "82c7c44e-09e5-4929-9dd9-806f7c58b31f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "62eea032-4ac5-421b-a6c6-bee0e00f6e4e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "62eea032-4ac5-421b-a6c6-bee0e00f6e4e",
  "order_id": "82c7c44e-09e5-4929-9dd9-806f7c58b31f",
  "assignment_id": "1e2a19dd-995c-4d64-92c4-dff8746a40a0",
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
    "phone": "+3806711131578"
  }
}
```

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:42Z",
    "sequence": 1793178642971
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:42.988399Z",
  "last_location_at": "2026-10-28T09:10:42.988399Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/62eea032-4ac5-421b-a6c6-bee0e00f6e4e/arrive` → **200**

```json
{
  "command_id": "eb7f4c79-431f-4fc3-94ff-84e817987e89",
  "expected_version": 0
}
```

```json
{
  "id": "62eea032-4ac5-421b-a6c6-bee0e00f6e4e",
  "order_id": "82c7c44e-09e5-4929-9dd9-806f7c58b31f",
  "assignment_id": "1e2a19dd-995c-4d64-92c4-dff8746a40a0",
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
  "arrived_at": "2026-10-28T09:10:43.02292Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131578"
  }
}
```

`POST /api/driver/v1/trips/62eea032-4ac5-421b-a6c6-bee0e00f6e4e/start` → **200**

```json
{
  "command_id": "3051aada-e59d-49b0-a42e-8b05f00c8f3e",
  "expected_version": 1
}
```

```json
{
  "id": "62eea032-4ac5-421b-a6c6-bee0e00f6e4e",
  "order_id": "82c7c44e-09e5-4929-9dd9-806f7c58b31f",
  "assignment_id": "1e2a19dd-995c-4d64-92c4-dff8746a40a0",
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
  "arrived_at": "2026-10-28T09:10:43.02292Z",
  "started_at": "2026-10-28T09:10:43.060622Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131578"
  }
}
```

`POST /api/driver/v1/trips/62eea032-4ac5-421b-a6c6-bee0e00f6e4e/complete` → **200**

```json
{
  "command_id": "ac903d18-bdac-48b5-8378-832cc87214a7",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:10:43Z",
  "cash_received": true
}
```

```json
{
  "id": "62eea032-4ac5-421b-a6c6-bee0e00f6e4e",
  "order_id": "82c7c44e-09e5-4929-9dd9-806f7c58b31f",
  "assignment_id": "1e2a19dd-995c-4d64-92c4-dff8746a40a0",
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
  "arrived_at": "2026-10-28T09:10:43.02292Z",
  "started_at": "2026-10-28T09:10:43.060622Z",
  "completed_at": "2026-10-28T09:10:43.10076Z",
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
  "command_id": "1d3008a8-60f1-403b-ba2e-a793c4e6049e",
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
  "id": "9350f825-c152-4f82-b336-cc2f135362d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:43.143184Z",
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
  "command_id": "fb8bf3e4-04c7-48ac-b858-121ed6e8405d",
  "quote_id": "9350f825-c152-4f82-b336-cc2f135362d6",
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
    "phone": "+380671110628"
  }
}
```

```json
{
  "id": "b9c98ba9-eb2d-428c-8e03-e6cdb9aa90d7",
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
  "created_at": "2026-10-28T09:10:43.180903Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110628"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b9c98ba9-eb2d-428c-8e03-e6cdb9aa90d7` → **200**

```json
{
  "id": "b9c98ba9-eb2d-428c-8e03-e6cdb9aa90d7",
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
  "created_at": "2026-10-28T09:10:43.180903Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110628"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b9c98ba9-eb2d-428c-8e03-e6cdb9aa90d7/cancel` → **200**

```json
{
  "command_id": "f0d23ca2-3505-4428-b35a-13c79204ba1c",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "b9c98ba9-eb2d-428c-8e03-e6cdb9aa90d7",
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
  "created_at": "2026-10-28T09:10:43.180903Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110628"
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
  "staff_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T09:10:43.105288Z",
  "last_entries": [
    {
      "order_id": "b9c98ba9-eb2d-428c-8e03-e6cdb9aa90d7",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T09:10:43.24789Z"
    },
    {
      "order_id": "82c7c44e-09e5-4929-9dd9-806f7c58b31f",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T09:10:43.105288Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6b6f8ad6-5cc5-44c0-aaea-9c914452da4c",
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
  "last_heartbeat_at": "2026-10-28T09:10:42.988399Z",
  "last_location_at": "2026-10-28T09:10:42.988399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b6f8ad6-5cc5-44c0-aaea-9c914452da4c/close` → **200**

```json
{
  "command_id": "a154f9f7-250b-42e9-849d-0003bff07112",
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

Done: operator bonus for fulfilled 82c7c44e-09e5-4929-9dd9-806f7c58b31f and operator-fault cancellation b9c98ba9-eb2d-428c-8e03-e6cdb9aa90d7.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674695800",
  "device_ref": "sandbox-24492"
}
```

```json
{
  "challenge_id": "72b178e0-2097-4fdd-bd0d-02684e03da85",
  "expires_at": "2026-10-28T09:15:45.487673582Z",
  "resend_available_at": "2026-10-28T09:10:46.487673582Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674695800` → **200**

```json
{
  "phone": "+380674695800",
  "audience": "CLIENT",
  "code": "189043",
  "sent_at": "2026-10-28T09:10:45.489512892Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674220481",
  "device_ref": "sandbox-26102",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ec23aca1-d3cc-4bf0-b203-2eff0637b11b",
  "expires_at": "2026-10-28T09:15:45.541676722Z",
  "resend_available_at": "2026-10-28T09:10:46.541676722Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674220481` → **200**

```json
{
  "phone": "+380674220481",
  "audience": "CLIENT",
  "code": "113110",
  "sent_at": "2026-10-28T09:10:45.543407045Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676550000",
  "device_ref": "sandbox-23070"
}
```

```json
{
  "challenge_id": "466c26f2-8d05-4345-af35-f3053c3ecd22",
  "expires_at": "2026-10-28T09:15:45.594247259Z",
  "resend_available_at": "2026-10-28T09:10:46.594247259Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676550000` → **200**

```json
{
  "phone": "+380676550000",
  "audience": "CLIENT",
  "code": "884872",
  "sent_at": "2026-10-28T09:10:45.596610176Z",
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
  "session_id": "7bc015a8-647a-4edb-a03b-8949174bc67e",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NDUsImlhdCI6MTc5MzE3ODY0NSwianRpIjoiMGI5YmJlNTktMzc0Yi00OTJjLTkzY2EtYTY5MzlkZWE1MjMwIiwic2lkIjoiN2JjMDE1YTgtNjQ3YS00ZWRiLWEwM2ItODk0OTE3NGJjNjdlIn0.iqUEOL02nWNRX0GgJWNOfkcbhgUWTo5Dwl3IXRnezls",
  "access_expires_at": "2026-10-28T09:25:45.906147201Z",
  "refresh_token": "kXvMIEXLK6r8nB1Sc88eJIM-UOzfvvrQ8Jj5V0amC50",
  "refresh_expires_at": "2026-10-28T21:10:45.905724273Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676550000` → **200**

```json
{
  "deliveries": [
    {
      "id": "bf0ac6c1-27d9-4cf1-9d3a-795dbeafa37c",
      "challenge_id": "466c26f2-8d05-4345-af35-f3053c3ecd22",
      "phone": "+380676550000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bdca9943-48df-4b34-a709-aeafbe461355",
      "error": null,
      "attempted_at": "2026-10-28T09:10:45.596848Z"
    },
    {
      "id": "e5fa7e4f-f310-418e-a822-cb750a4caac4",
      "challenge_id": "466c26f2-8d05-4345-af35-f3053c3ecd22",
      "phone": "+380676550000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T09:10:45.596141Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676550000` → **200**

```json
{
  "phone": "+380676550000",
  "audience": "CLIENT",
  "code": "884872",
  "sent_at": "2026-10-28T09:10:45.596610176Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674220481` → **200**

```json
{
  "deliveries": [
    {
      "id": "21368fb7-3cdc-4b65-b30d-3a6acdcdc5bf",
      "challenge_id": "ec23aca1-d3cc-4bf0-b203-2eff0637b11b",
      "phone": "+380674220481",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4e722e03-098f-42f5-a2b9-69a09e305419",
      "error": null,
      "attempted_at": "2026-10-28T09:10:45.543659Z"
    }
  ]
}
```

Done: SMS to +380674695800, a call to +380674220481, SMS then a call to +380676550000.

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
  "session_id": "5b347f37-106c-485a-b068-eb06d217226a",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NDYsImlhdCI6MTc5MzE3ODY0NiwianRpIjoiMjU3NDBhMDYtMTQ0OC00MjcwLTk4ZjktYWQyM2JlNTI3YThhIiwic2lkIjoiNWIzNDdmMzctMTA2Yy00ODVhLWIwNjgtZWIwNmQyMTcyMjZhIn0.me5qt5UWzGPzy-zFCs45fBRKPHqp4a_ujJChd2UKXOs",
  "access_expires_at": "2026-10-28T09:25:46.439335135Z",
  "refresh_token": "bte3Yp-DHgXu2GmHilQ12BNp2S-0Sg9l3hO98q2l4Pk",
  "refresh_expires_at": "2026-10-28T21:10:46.438747843Z",
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
  "session_id": "90ea4417-349e-413b-b75a-0305d46c5cc9",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NDYsImlhdCI6MTc5MzE3ODY0NiwianRpIjoiYmYzODJhYmEtZjg5Yy00MTVhLWE5ZTItNzUwZGI0Y2Q3MWRlIiwic2lkIjoiOTBlYTQ0MTctMzQ5ZS00MTNiLWI3NWEtMDMwNWQ0NmM1Y2M5In0.dcXpIT3jx0SYmkEMsfRlgSABt_GuJFumZ2G6D4R4glM",
  "access_expires_at": "2026-10-28T09:25:46.723602277Z",
  "refresh_token": "tRG9R_BfZMA1YQeJl_j3QE43RWhBxz1PGN4kh80bPzI",
  "refresh_expires_at": "2026-10-28T21:10:46.723145389Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
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

`POST /api/admin/v1/staff-extensions/5adc99e6-6dff-4ebb-978e-5bd737e5f77f` → **200**

```json
{
  "command_id": "f7f3aec3-5c41-4a0e-ab8b-f1cb23c8529f",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "d22db094-ab90-4654-99f4-66d9d0a0ba82",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:10:46.850552Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:10:46.850552Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "087da414-3ec1-42d0-aa5a-31c1ce065fbf",
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
  "id": "89ca22a3-ab02-4264-9769-b17178cc2996",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:46.912532Z",
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
  "command_id": "290354a5-ff4a-4bf4-be1d-b5f1b2a19ff2",
  "quote_id": "89ca22a3-ab02-4264-9769-b17178cc2996",
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
    "phone": "+380671525781"
  }
}
```

```json
{
  "id": "518b81f1-4c79-47b2-a236-324768a13e93",
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
  "created_at": "2026-10-28T09:10:46.947458Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671525781"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/518b81f1-4c79-47b2-a236-324768a13e93/calls` → **201**

```json
{
  "command_id": "b37d6301-b8a3-45ff-b143-7d3f6aa17c80",
  "to": "CALLER"
}
```

```json
{
  "id": "a17db052-4b2c-4246-9314-7254cee881cf",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "order_ids": [
    "518b81f1-4c79-47b2-a236-324768a13e93"
  ],
  "started_at": "2026-10-28T09:10:46.995004Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/518b81f1-4c79-47b2-a236-324768a13e93/calls` → **201**

```json
{
  "command_id": "b37d6301-b8a3-45ff-b143-7d3f6aa17c80",
  "to": "CALLER"
}
```

```json
{
  "id": "a17db052-4b2c-4246-9314-7254cee881cf",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "order_ids": [
    "518b81f1-4c79-47b2-a236-324768a13e93"
  ],
  "started_at": "2026-10-28T09:10:46.995004Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "a17db052-4b2c-4246-9314-7254cee881cf",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671525781",
    "at": "2026-10-28T09:10:47.007145386Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "a17db052-4b2c-4246-9314-7254cee881cf",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.29698",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "a17db052-4b2c-4246-9314-7254cee881cf"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "a17db052-4b2c-4246-9314-7254cee881cf",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=518b81f1-4c79-47b2-a236-324768a13e93` → **200**

```json
{
  "calls": [
    {
      "id": "a17db052-4b2c-4246-9314-7254cee881cf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [
        "518b81f1-4c79-47b2-a236-324768a13e93"
      ],
      "started_at": "2026-10-28T09:10:46.995004Z",
      "answered_at": "2026-10-28T09:10:47.139577Z",
      "ended_at": "2026-10-28T09:10:47.160537Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=518b81f1-4c79-47b2-a236-324768a13e93` → **200**

```json
{
  "calls": [
    {
      "id": "a17db052-4b2c-4246-9314-7254cee881cf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [
        "518b81f1-4c79-47b2-a236-324768a13e93"
      ],
      "started_at": "2026-10-28T09:10:46.995004Z",
      "answered_at": "2026-10-28T09:10:47.139577Z",
      "ended_at": "2026-10-28T09:10:47.160537Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=518b81f1-4c79-47b2-a236-324768a13e93` → **200**

```json
{
  "calls": [
    {
      "id": "a17db052-4b2c-4246-9314-7254cee881cf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [
        "518b81f1-4c79-47b2-a236-324768a13e93"
      ],
      "started_at": "2026-10-28T09:10:46.995004Z",
      "answered_at": "2026-10-28T09:10:47.139577Z",
      "ended_at": "2026-10-28T09:10:47.160537Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=518b81f1-4c79-47b2-a236-324768a13e93` → **200**

```json
{
  "calls": [
    {
      "id": "a17db052-4b2c-4246-9314-7254cee881cf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [
        "518b81f1-4c79-47b2-a236-324768a13e93"
      ],
      "started_at": "2026-10-28T09:10:46.995004Z",
      "answered_at": "2026-10-28T09:10:47.139577Z",
      "ended_at": "2026-10-28T09:10:47.160537Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=518b81f1-4c79-47b2-a236-324768a13e93` → **200**

```json
{
  "calls": [
    {
      "id": "a17db052-4b2c-4246-9314-7254cee881cf",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "order_ids": [
        "518b81f1-4c79-47b2-a236-324768a13e93"
      ],
      "started_at": "2026-10-28T09:10:46.995004Z",
      "answered_at": "2026-10-28T09:10:47.139577Z",
      "ended_at": "2026-10-28T09:10:47.160537Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:10:55.048231Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/518b81f1-4c79-47b2-a236-324768a13e93` → **200**

```json
{
  "id": "518b81f1-4c79-47b2-a236-324768a13e93",
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
  "created_at": "2026-10-28T09:10:46.947458Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671525781"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/518b81f1-4c79-47b2-a236-324768a13e93/cancel` → **200**

```json
{
  "command_id": "7138f2d8-557c-48f8-ab46-9af75ce4cad7",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "518b81f1-4c79-47b2-a236-324768a13e93",
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
  "created_at": "2026-10-28T09:10:46.947458Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671525781"
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
  "command_id": "218d8707-d5d2-4699-bcb1-672caa6a5738",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T09:10:55.411055Z",
  "extension": "101"
}
```

Done: outgoing call a17db052-4b2c-4246-9314-7254cee881cf from order 518b81f1-4c79-47b2-a236-324768a13e93, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633629487",
  "device_ref": "sandbox-22468"
}
```

```json
{
  "challenge_id": "7a3fd66c-05d9-411e-99e1-ee19eeaee453",
  "expires_at": "2026-10-28T09:15:55.450866765Z",
  "resend_available_at": "2026-10-28T09:10:56.450866765Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633629487` → **200**

```json
{
  "phone": "+380633629487",
  "audience": "CLIENT",
  "code": "539046",
  "sent_at": "2026-10-28T09:10:55.453122181Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a3fd66c-05d9-411e-99e1-ee19eeaee453",
  "code": "539046",
  "device_ref": "sandbox-22468"
}
```

```json
{
  "session_id": "00b0f91c-5e67-4660-85a0-d84faf5f8f95",
  "subject": {
    "type": "CLIENT",
    "id": "b90c6937-61e5-4c5b-a3ea-28f2ab40dc14"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOTBjNjkzNy02MWU1LTRjNWItYTNlYS0yOGYyYWI0MGRjMTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTU1LCJpYXQiOjE3OTMxNzg2NTUsImp0aSI6IjFlM2FmNDg4LTNkMjEtNDg3My05ODgzLWFhNzg3YjUxOTQ4ZCIsInNpZCI6IjAwYjBmOTFjLTVlNjctNDY2MC04NWEwLWQ4NGZhZjVmOGY5NSJ9.k0zTDX_4uN60Trg8hKyYJkHj-isvZsLgNTBLJRlEu00",
  "access_expires_at": "2026-10-28T09:25:55.508087802Z",
  "refresh_token": "T2ZuLfyMFKzf_k_54CAs7qdvi7GObsiat74cZoQiQas",
  "refresh_expires_at": "2026-11-27T09:10:55.507703255Z",
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
  "session_id": "12719b95-e992-458e-b133-f8760ad470a1",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NTUsImlhdCI6MTc5MzE3ODY1NSwianRpIjoiOThkN2E3N2YtOTQwNy00OGYxLTg5OTctZmY2NmU3OWVlNDg3Iiwic2lkIjoiMTI3MTliOTUtZTk5Mi00NThlLWIxMzMtZjg3NjBhZDQ3MGExIn0.-EpI93yB_e2il_VDsPnG9-jKviqA852Rzln3sJHMlHU",
  "access_expires_at": "2026-10-28T09:25:55.878363661Z",
  "refresh_token": "mhLSP09btWm1tFhTqoH-C7k83SpDd5AUfBX72q4WT7c",
  "refresh_expires_at": "2026-10-28T21:10:55.877947468Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633629487` → **200**

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
  "correlation_id": "511cd752-ded0-4a45-8c8e-1c80abd0ea81"
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
  "session_id": "894d1f84-a726-4163-bdfe-10de81b49265",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NTYsImlhdCI6MTc5MzE3ODY1NiwianRpIjoiYzdjNzFlYzAtZGU4YS00MDVjLTg4ZjItYjEyNjNjNTlhNDNkIiwic2lkIjoiODk0ZDFmODQtYTcyNi00MTYzLWJkZmUtMTBkZTgxYjQ5MjY1In0.NxjOrPqWzfw1GUqwsdD-PG7c1kYOL767Hj-bLlBON9g",
  "access_expires_at": "2026-10-28T09:25:56.228022546Z",
  "refresh_token": "kba1h7sSYxxgMyhuNAegLGKDDfDotEV3T3yqLpb53I8",
  "refresh_expires_at": "2026-10-28T21:10:56.227626032Z",
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
  "command_id": "86c14b2e-184a-4334-9e41-ac362e6d466c",
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
  "changed_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T09:10:56.295776661Z"
}
```

## The rider books the airport for 2026-10-28T12:10:55Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600659605",
  "device_ref": "sandbox-6283"
}
```

```json
{
  "challenge_id": "3d3e2ed0-3f76-4a21-bf54-62d998fb91e6",
  "expires_at": "2026-10-28T09:15:56.328978047Z",
  "resend_available_at": "2026-10-28T09:10:57.328978047Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600659605` → **200**

```json
{
  "phone": "+48600659605",
  "audience": "CLIENT",
  "code": "588605",
  "sent_at": "2026-10-28T09:10:56.331014144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d3e2ed0-3f76-4a21-bf54-62d998fb91e6",
  "code": "588605",
  "device_ref": "sandbox-6283"
}
```

```json
{
  "session_id": "aa99b0c0-5712-4b84-b13d-c4351c2a5206",
  "subject": {
    "type": "CLIENT",
    "id": "d4cc147d-ea35-4e3f-adbd-d7a3a635463e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGNjMTQ3ZC1lYTM1LTRlM2YtYWRiZC1kN2EzYTYzNTQ2M2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTU2LCJpYXQiOjE3OTMxNzg2NTYsImp0aSI6IjU0OWE3NjYwLWEyZmQtNDY5Yi05MThhLTJiN2IwZjU0ODJlMCIsInNpZCI6ImFhOTliMGMwLTU3MTItNGI4NC1iMTNkLWM0MzUxYzJhNTIwNiJ9.fxxnY3W_phtzBsJd3u8LXv8kh6jv7q3SMGd_pYcbacw",
  "access_expires_at": "2026-10-28T09:25:56.385657165Z",
  "refresh_token": "R4hJYK_v1OWRFPmP7IHCfFE-_Oco3gCHnwOR4tIf82c",
  "refresh_expires_at": "2026-11-27T09:10:56.385208053Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f8b378cb-dc75-4109-af3a-a78c951d13c4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T12:10:55Z"
}
```

```json
{
  "id": "6cb77d54-67c8-4b53-be45-4acf6382a0cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:56.420737Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:10:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f6b44eae-0003-42a7-8668-26fa8f590873",
  "quote_id": "6cb77d54-67c8-4b53-be45-4acf6382a0cc",
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
  "pickup_at": "2026-10-28T12:10:55Z"
}
```

```json
{
  "id": "918254b1-af56-494b-93b7-51c0211e4287",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d4cc147d-ea35-4e3f-adbd-d7a3a635463e",
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
  "created_at": "2026-10-28T09:10:56.460316Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:10:55Z",
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
  "device_ref": "sandbox-19309"
}
```

```json
{
  "challenge_id": "947116c3-0aa8-4514-a1af-bdcb8bf3fc65",
  "expires_at": "2026-10-28T09:15:56.492824969Z",
  "resend_available_at": "2026-10-28T09:10:57.492824969Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "720026",
  "sent_at": "2026-10-28T09:10:56.494719162Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "947116c3-0aa8-4514-a1af-bdcb8bf3fc65",
  "code": "720026",
  "device_ref": "sandbox-19309"
}
```

```json
{
  "session_id": "d9a50a39-8d7b-4aeb-8a42-4c3b606adf0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTU1NiwiaWF0IjoxNzkzMTc4NjU2LCJqdGkiOiJhNDg4ZmNhOC03MmUxLTQyYWYtYTE1Yi1lNWRjYjFjZTRhZWMiLCJzaWQiOiJkOWE1MGEzOS04ZDdiLTRhZWItOGE0Mi00YzNiNjA2YWRmMGQifQ.nYUlVo0P035StK11sTh0FvH4-k7656uBCZwddV4BHGY",
  "access_expires_at": "2026-10-28T09:25:56.548054244Z",
  "refresh_token": "eZRcY7gVeDZ-cpYcuhyLw4m4BZnTWUUv8UmMraqAjbw",
  "refresh_expires_at": "2026-11-27T09:10:56.547649187Z",
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
  "command_id": "b0d9a12f-36e8-470b-9040-72473dcfece0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:56Z",
    "sequence": 1793178656598
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e9ce1154-4bcc-413e-873a-d11a78748d9e",
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
  "last_heartbeat_at": "2026-10-28T09:10:56.615009Z",
  "last_location_at": "2026-10-28T09:10:56.615009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "918254b1-af56-494b-93b7-51c0211e4287",
      "short_number": 17,
      "pickup_at": "2026-10-28T12:10:55Z",
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

`POST /api/driver/v1/preorders/918254b1-af56-494b-93b7-51c0211e4287/reserve` → **200**

```json
{
  "command_id": "846dbde0-405e-4f7b-9d07-7210a7c575ea"
}
```

```json
{
  "id": "e333d3c6-cb89-42b2-92eb-1528b6a3f4f0",
  "state": "RESERVED",
  "order": {
    "order_id": "918254b1-af56-494b-93b7-51c0211e4287",
    "short_number": 17,
    "pickup_at": "2026-10-28T12:10:55Z",
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
  "reserved_at": "2026-10-28T09:10:56.678095Z",
  "confirm_from": "2026-10-28T11:40:55Z",
  "confirm_until": "2026-10-28T11:50:55Z",
  "drop_until": "2026-10-28T11:10:55Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "e333d3c6-cb89-42b2-92eb-1528b6a3f4f0",
      "state": "RESERVED",
      "order": {
        "order_id": "918254b1-af56-494b-93b7-51c0211e4287",
        "short_number": 17,
        "pickup_at": "2026-10-28T12:10:55Z",
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
      "reserved_at": "2026-10-28T09:10:56.678095Z",
      "confirm_from": "2026-10-28T11:40:55Z",
      "confirm_until": "2026-10-28T11:50:55Z",
      "drop_until": "2026-10-28T11:10:55Z"
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
      "id": "e333d3c6-cb89-42b2-92eb-1528b6a3f4f0",
      "state": "RESERVED",
      "order": {
        "order_id": "918254b1-af56-494b-93b7-51c0211e4287",
        "short_number": 17,
        "pickup_at": "2026-10-28T12:10:55Z",
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
      "reserved_at": "2026-10-28T09:10:56.678095Z",
      "confirm_from": "2026-10-28T11:40:55Z",
      "confirm_until": "2026-10-28T11:50:55Z",
      "drop_until": "2026-10-28T11:10:55Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/e333d3c6-cb89-42b2-92eb-1528b6a3f4f0/confirm` → **409**

```json
{
  "command_id": "a12ec022-aedc-4ab2-ba43-bcac0324caea"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/e333d3c6-cb89-42b2-92eb-1528b6a3f4f0/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f2f3986d-e1d2-4230-b47a-bd6a38177f46"
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
  "session_id": "40748596-1fd4-46e9-bb35-8987e88c53e5",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NTcsImlhdCI6MTc5MzE3ODY1NywianRpIjoiZTczYTk2NmEtNDI2YS00YjczLWEwMDgtMWJiNDUzNDZiNzE5Iiwic2lkIjoiNDA3NDg1OTYtMWZkNC00NmU5LWJiMzUtODk4N2U4OGM1M2U1In0.NzED3b_VnqLZtMhKig_Zfx7uCj_1-b52kdf0PFyLAsM",
  "access_expires_at": "2026-10-28T09:25:57.044309885Z",
  "refresh_token": "XWwjREITCjTXjRB5ncgeN0jIFAClr7quiU8Yetfa8No",
  "refresh_expires_at": "2026-10-28T21:10:57.043904157Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/918254b1-af56-494b-93b7-51c0211e4287` → **200**

```json
{
  "id": "918254b1-af56-494b-93b7-51c0211e4287",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d4cc147d-ea35-4e3f-adbd-d7a3a635463e",
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
  "created_at": "2026-10-28T09:10:56.460316Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T12:10:55Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "e333d3c6-cb89-42b2-92eb-1528b6a3f4f0",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T09:10:56.678095Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/918254b1-af56-494b-93b7-51c0211e4287/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T09:10:56.461383Z",
      "actor": {
        "type": "CLIENT",
        "id": "d4cc147d-ea35-4e3f-adbd-d7a3a635463e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "918254b1-af56-494b-93b7-51c0211e4287",
        "preorder": true,
        "quote_id": "6cb77d54-67c8-4b53-be45-4acf6382a0cc",
        "pickup_at": "2026-10-28T12:10:55Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T09:10:56.67908Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "918254b1-af56-494b-93b7-51c0211e4287",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "e333d3c6-cb89-42b2-92eb-1528b6a3f4f0"
      }
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 918254b1-af56-494b-93b7-51c0211e4287, reservation e333d3c6-cb89-42b2-92eb-1528b6a3f4f0.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1306"
}
```

```json
{
  "challenge_id": "07ea4d66-7487-4319-912c-e98a117d9a5c",
  "expires_at": "2026-10-28T09:15:57.147374315Z",
  "resend_available_at": "2026-10-28T09:10:58.147374315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "414699",
  "sent_at": "2026-10-28T09:10:57.14918831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07ea4d66-7487-4319-912c-e98a117d9a5c",
  "code": "414699",
  "device_ref": "sandbox-1306"
}
```

```json
{
  "session_id": "73c0fa03-2ef6-47e5-aa29-ddddfcc10bb9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTU1NywiaWF0IjoxNzkzMTc4NjU3LCJqdGkiOiI1MTBkZjFhMC03NmNjLTRmYWEtODc3NC03NDQ0MjY2OTEzZWIiLCJzaWQiOiI3M2MwZmEwMy0yZWY2LTQ3ZTUtYWEyOS1kZGRkZmNjMTBiYjkifQ.wzQXHPIidX6tD7OoWztiDyvCJFaiz9yzb7I4Vpp3Olc",
  "access_expires_at": "2026-10-28T09:25:57.2015758Z",
  "refresh_token": "UFpFoi2HEMkCu4q7sa4PHBu5XGt9aoEwd1jv_TXdU-I",
  "refresh_expires_at": "2026-11-27T09:10:57.201164604Z",
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
  "command_id": "b13d8023-90f4-4e45-b562-e94784587ab9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:57Z",
    "sequence": 1793178657249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2cad3b5-1624-45b2-adc3-f0e31010e083",
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
  "last_heartbeat_at": "2026-10-28T09:10:57.267217Z",
  "last_location_at": "2026-10-28T09:10:57.267217Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677902518",
  "device_ref": "sandbox-21701"
}
```

```json
{
  "challenge_id": "bd09b153-62ac-40b0-a808-e19cc6907359",
  "expires_at": "2026-10-28T09:15:57.294219397Z",
  "resend_available_at": "2026-10-28T09:10:58.294219397Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677902518` → **200**

```json
{
  "phone": "+380677902518",
  "audience": "CLIENT",
  "code": "229006",
  "sent_at": "2026-10-28T09:10:57.296040042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd09b153-62ac-40b0-a808-e19cc6907359",
  "code": "229006",
  "device_ref": "sandbox-21701"
}
```

```json
{
  "session_id": "4bbb4529-c08f-4936-9b3e-8a780b5e160a",
  "subject": {
    "type": "CLIENT",
    "id": "6e71a28b-2247-4a07-8282-6357d89d2c67"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTcxYTI4Yi0yMjQ3LTRhMDctODI4Mi02MzU3ZDg5ZDJjNjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTU3LCJpYXQiOjE3OTMxNzg2NTcsImp0aSI6Ijg5MGJiMjBmLWE3YzEtNGViZi05MDcwLTJkNzMyZWNkNDE4OCIsInNpZCI6IjRiYmI0NTI5LWMwOGYtNDkzNi05YjNlLThhNzgwYjVlMTYwYSJ9.Qptwt5DmYZaHynrlMFfpGYaPqQHpN0-nrSBEfKLuuVA",
  "access_expires_at": "2026-10-28T09:25:57.348053221Z",
  "refresh_token": "rPfIP8eaiZV2NfsaggzMt8KznEC7mwwHrjrWTHJfGLY",
  "refresh_expires_at": "2026-11-27T09:10:57.347663055Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2b575248-4913-4c1a-b07b-9dbf2a3e0e8b",
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
  "id": "b5081055-f882-4616-925e-257cc5ffb55a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:15:57.383721Z",
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
  "command_id": "d4984e42-f32f-4b55-b1de-2c15fd5f52c5",
  "quote_id": "b5081055-f882-4616-925e-257cc5ffb55a",
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
  "id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6e71a28b-2247-4a07-8282-6357d89d2c67",
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
  "created_at": "2026-10-28T09:10:57.420462Z",
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
    "id": "8ac642be-1137-4b7b-b8de-00c0dc2038ba",
    "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
    "expires_at": "2026-10-28T09:11:12.422736Z",
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

`POST /api/driver/v1/offers/8ac642be-1137-4b7b-b8de-00c0dc2038ba/accept` → **200**

```json
{
  "command_id": "63888dd9-1afb-4b0a-a3b8-19196ebc69c3"
}
```

```json
{
  "id": "246a46cc-8e4c-45f5-8de8-d1da04202566",
  "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "762a4914-051e-4c7d-bdaa-84916869de28",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "762a4914-051e-4c7d-bdaa-84916869de28",
  "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "assignment_id": "246a46cc-8e4c-45f5-8de8-d1da04202566",
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

`POST /api/driver/v1/work-sessions/f2cad3b5-1624-45b2-adc3-f0e31010e083/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:57Z",
    "sequence": 1793178657521
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2cad3b5-1624-45b2-adc3-f0e31010e083",
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
  "last_heartbeat_at": "2026-10-28T09:10:57.539319Z",
  "last_location_at": "2026-10-28T09:10:57.539319Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "762a4914-051e-4c7d-bdaa-84916869de28",
  "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "assignment_id": "246a46cc-8e4c-45f5-8de8-d1da04202566",
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

`POST /api/driver/v1/trips/762a4914-051e-4c7d-bdaa-84916869de28/arrive` → **200**

```json
{
  "command_id": "7c163c1e-6bed-46cc-9f32-0cb584417f6d",
  "expected_version": 0
}
```

```json
{
  "id": "762a4914-051e-4c7d-bdaa-84916869de28",
  "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "assignment_id": "246a46cc-8e4c-45f5-8de8-d1da04202566",
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
  "arrived_at": "2026-10-28T09:10:57.588583Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/762a4914-051e-4c7d-bdaa-84916869de28/start` → **200**

```json
{
  "command_id": "5820f63a-0bff-45b5-b136-a927c61ce733",
  "expected_version": 1
}
```

```json
{
  "id": "762a4914-051e-4c7d-bdaa-84916869de28",
  "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "assignment_id": "246a46cc-8e4c-45f5-8de8-d1da04202566",
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
  "arrived_at": "2026-10-28T09:10:57.588583Z",
  "started_at": "2026-10-28T09:10:57.619959Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f2cad3b5-1624-45b2-adc3-f0e31010e083/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:10:57Z",
    "sequence": 1793178657644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2cad3b5-1624-45b2-adc3-f0e31010e083",
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
  "last_heartbeat_at": "2026-10-28T09:10:57.661769Z",
  "last_location_at": "2026-10-28T09:10:57.661769Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/762a4914-051e-4c7d-bdaa-84916869de28/complete` → **200**

```json
{
  "command_id": "ecf76a51-9996-468a-b236-1f2b7cbc6577",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:10:57Z",
  "cash_received": true
}
```

```json
{
  "id": "762a4914-051e-4c7d-bdaa-84916869de28",
  "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "assignment_id": "246a46cc-8e4c-45f5-8de8-d1da04202566",
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
  "arrived_at": "2026-10-28T09:10:57.588583Z",
  "started_at": "2026-10-28T09:10:57.619959Z",
  "completed_at": "2026-10-28T09:10:57.69702Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/50c34975-f616-4a23-831a-4653e3f56b93/rating` → **200**

```json
{
  "command_id": "86454600-6b8c-472a-bf94-2d202558311d",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "score": 5,
  "created_at": "2026-10-28T09:10:57.741224853Z"
}
```

`POST /api/driver/v1/orders/50c34975-f616-4a23-831a-4653e3f56b93/rating` → **200**

```json
{
  "command_id": "58f14920-5e32-4acf-9798-91e3d21db08a",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
  "score": 4,
  "created_at": "2026-10-28T09:10:57.774695396Z"
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
  "session_id": "0175f077-73cd-4aeb-aeb1-dbf89cdb420c",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NTgsImlhdCI6MTc5MzE3ODY1OCwianRpIjoiNjdiM2JlZjAtYzU2Zi00M2ZmLTliNDEtMmViMTFhZWFhMGUwIiwic2lkIjoiMDE3NWYwNzctNzNjZC00YWViLWFlYjEtZGJmODljZGI0MjBjIn0.DHe2oyZeCmtwfzn899xSYQ4XpV6Sre4a64q-AK9unwE",
  "access_expires_at": "2026-10-28T09:25:58.095046275Z",
  "refresh_token": "8XHXcjn_ThNftnCvXmBARuoKzpcYUlDY5Zv4kRpPLPM",
  "refresh_expires_at": "2026-10-28T21:10:58.094620777Z",
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
  "session_id": "897f983c-4899-4cb8-bfb7-a7b8a4c539ad",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NTgsImlhdCI6MTc5MzE3ODY1OCwianRpIjoiZGE2MDI4MWEtOTg1Zi00MjQwLTliZDAtY2M5NjlkMGQ0ODU2Iiwic2lkIjoiODk3Zjk4M2MtNDg5OS00Y2I4LWJmYjctYTdiOGE0YzUzOWFkIn0.avKEWRUxsw4loD-eBa35BCD60fch2yg1rKHJFpuiyD4",
  "access_expires_at": "2026-10-28T09:25:58.378832318Z",
  "refresh_token": "fxrRJjaz7YlDw0a-KRQA9yDmiaqtDHoGL1po3rygs3c",
  "refresh_expires_at": "2026-10-28T21:10:58.378415884Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/50c34975-f616-4a23-831a-4653e3f56b93/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
      "author_type": "RIDER",
      "author_id": "6e71a28b-2247-4a07-8282-6357d89d2c67",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T09:10:57.741225Z"
    },
    {
      "order_id": "50c34975-f616-4a23-831a-4653e3f56b93",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "6e71a28b-2247-4a07-8282-6357d89d2c67",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T09:10:57.774695Z"
    }
  ]
}
```

Done: ratings for order 50c34975-f616-4a23-831a-4653e3f56b93.

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
  "session_id": "23aa5587-2508-4afd-9e7e-00cf36380b4c",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NTgsImlhdCI6MTc5MzE3ODY1OCwianRpIjoiNzM3NDA1Y2EtMGI5NS00YTU5LWE5NTEtODE5N2FlMzJkOTJmIiwic2lkIjoiMjNhYTU1ODctMjUwOC00YWZkLTllN2UtMDBjZjM2MzgwYjRjIn0.Q6L3J0Ai8JD0ZYKERVwT8B8zbBnemfiodln97ZQI0Zo",
  "access_expires_at": "2026-10-28T09:25:58.717615741Z",
  "refresh_token": "oodT_qujMmyOJCS4pZE8KUsj5qyL9awzyvNVpyeoOjU",
  "refresh_expires_at": "2026-10-28T21:10:58.717187449Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "66bf8525-3612-481d-bd32-9bc0245d52b3",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "e45ce79c-8636-486b-a6be-34c186bf9bc5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:10:58.756088Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e45ce79c-8636-486b-a6be-34c186bf9bc5` → **200**

```json
{
  "id": "e45ce79c-8636-486b-a6be-34c186bf9bc5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:10:58.756088Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e45ce79c-8636-486b-a6be-34c186bf9bc5` → **200**

```json
{
  "id": "e45ce79c-8636-486b-a6be-34c186bf9bc5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:10:58.756088Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e45ce79c-8636-486b-a6be-34c186bf9bc5` → **200**

```json
{
  "id": "e45ce79c-8636-486b-a6be-34c186bf9bc5",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:10:58.756088Z",
  "ready_at": "2026-10-28T09:11:00.059733Z",
  "expires_at": "2026-10-29T09:11:00.059733Z"
}
```

`GET /api/admin/v1/reports/exports/e45ce79c-8636-486b-a6be-34c186bf9bc5/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
total,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7ce5100c-3a02-47c6-8304-b3e5633d7d5c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "084201df-2951-486a-b5ba-080ff616235a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:11:00.896752Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/084201df-2951-486a-b5ba-080ff616235a` → **200**

```json
{
  "id": "084201df-2951-486a-b5ba-080ff616235a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:11:00.896752Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/084201df-2951-486a-b5ba-080ff616235a` → **200**

```json
{
  "id": "084201df-2951-486a-b5ba-080ff616235a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:11:00.896752Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/084201df-2951-486a-b5ba-080ff616235a` → **200**

```json
{
  "id": "084201df-2951-486a-b5ba-080ff616235a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:11:00.896752Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/084201df-2951-486a-b5ba-080ff616235a` → **200**

```json
{
  "id": "084201df-2951-486a-b5ba-080ff616235a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:11:00.896752Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/084201df-2951-486a-b5ba-080ff616235a` → **200**

```json
{
  "id": "084201df-2951-486a-b5ba-080ff616235a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:11:00.896752Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/084201df-2951-486a-b5ba-080ff616235a` → **200**

```json
{
  "id": "084201df-2951-486a-b5ba-080ff616235a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:11:00.896752Z",
  "ready_at": "2026-10-28T09:11:05.066656Z",
  "expires_at": "2026-10-29T09:11:05.066656Z"
}
```

`GET /api/admin/v1/reports/exports/084201df-2951-486a-b5ba-080ff616235a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/7ebc57ec-32d7-4c06-bd3d-f090a96fe52a` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/7ebc57ec-32d7-4c06-bd3d-f090a96fe52a",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0aac78b8-8901-4970-8e76-0f0941031ff4"
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
  "device_ref": "sandbox-31876"
}
```

```json
{
  "challenge_id": "ad6ea8ea-00f5-4d73-a07c-e04da3f35c6f",
  "expires_at": "2026-10-28T09:16:06.144159278Z",
  "resend_available_at": "2026-10-28T09:11:07.144159278Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "092438",
  "sent_at": "2026-10-28T09:11:06.146791098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad6ea8ea-00f5-4d73-a07c-e04da3f35c6f",
  "code": "092438",
  "device_ref": "sandbox-31876"
}
```

```json
{
  "session_id": "63817d45-fe99-4b1a-bfb7-76616f0e14ef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTU2NiwiaWF0IjoxNzkzMTc4NjY2LCJqdGkiOiI4OTljZTNiZS1lNDRhLTQxZjMtYmIwMC05Y2U1ZDk0MWUxYmMiLCJzaWQiOiI2MzgxN2Q0NS1mZTk5LTRiMWEtYmZiNy03NjYxNmYwZTE0ZWYifQ.ltyUd38m9HMEKvGddDGnI2Azh3wAncHqxPfM3w0YO6U",
  "access_expires_at": "2026-10-28T09:26:06.203027446Z",
  "refresh_token": "BO2ceZxGSOXeOyhjqYhUHc8bE8AYSXkzbOQeGm5PiIc",
  "refresh_expires_at": "2026-11-27T09:11:06.202324636Z",
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
  "command_id": "4f9a4912-ba7f-48dc-961a-c7f4412181ca",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:11:06Z",
    "sequence": 1793178666274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "825b2c9d-773d-4d5f-bc51-ce9e30e5ea97",
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
  "last_heartbeat_at": "2026-10-28T09:11:06.291284Z",
  "last_location_at": "2026-10-28T09:11:06.291284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "ccfd19c6-a915-4ae3-839e-1eaa123bb714",
  "points": [
    {
      "sequence": 1793178668323,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:10:08Z"
    },
    {
      "sequence": 1793178668330,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:11:08Z"
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
  "session_id": "6174d473-8a23-4190-a873-48bee409b414",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NjgsImlhdCI6MTc5MzE3ODY2OCwianRpIjoiZDFjZmE0MzMtMDNmNi00NTRhLWFiMDktNDQxZWViYjllOTQ2Iiwic2lkIjoiNjE3NGQ0NzMtOGEyMy00MTkwLWE4NzMtNDhiZWU0MDliNDE0In0.N56D0Hnf2bAi9tqva6a_rIZ77J3oR0Wce7OWCwwRvJU",
  "access_expires_at": "2026-10-28T09:26:08.67384086Z",
  "refresh_token": "WdGR2CALGM8tDLaWC2i4jF8rIscXdfuoqFpIE67s_Nk",
  "refresh_expires_at": "2026-10-28T21:11:08.673371395Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "572667a4-6d1a-47af-ad9f-c75459fc9529",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T09:11:08Z",
        "track_point_id": "fd20a333-a920-4d6c-a15f-e2ff385310e0",
        "work_session_id": "825b2c9d-773d-4d5f-bc51-ce9e30e5ea97"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T09:11:08Z",
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

`POST /api/admin/v1/driver-risk-flags/572667a4-6d1a-47af-ad9f-c75459fc9529/confirm` → **200**

```json
{
  "command_id": "ed953f66-97f4-4793-8e86-4c58dd83668d",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "572667a4-6d1a-47af-ad9f-c75459fc9529",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T09:11:08Z",
    "track_point_id": "fd20a333-a920-4d6c-a15f-e2ff385310e0",
    "work_session_id": "825b2c9d-773d-4d5f-bc51-ce9e30e5ea97"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T09:11:08Z",
  "reason": null,
  "reviewed_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "reviewed_at": "2026-10-28T09:11:08.791001Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/572667a4-6d1a-47af-ad9f-c75459fc9529/dismiss` → **409**

```json
{
  "command_id": "a9b7cbd1-0f59-4d63-8f8b-231b641d5ec1",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/572667a4-6d1a-47af-ad9f-c75459fc9529/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "13c0f605-1203-4f4f-8f52-ee53491f2761"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "7aaf3cd1-3a1b-4b12-89cb-cdfe66f04de0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "f2343a04-960f-44f6-b9ff-6ef7cca4c8e4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "raised_at": "2026-10-28T09:11:08.896802Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/f2343a04-960f-44f6-b9ff-6ef7cca4c8e4/dismiss` → **200**

```json
{
  "command_id": "ecc8d7cf-53fe-49c6-b368-d2a66b6cc9fa",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "f2343a04-960f-44f6-b9ff-6ef7cca4c8e4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "raised_at": "2026-10-28T09:11:08.896802Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "reviewed_at": "2026-10-28T09:11:08.935208Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "6519bb15-f6bc-4c92-85ce-e243f0927f16",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "572667a4-6d1a-47af-ad9f-c75459fc9529"
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
      "actor_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:11:08.979157Z"
    }
  ]
}
```

Done: flag 572667a4-6d1a-47af-ad9f-c75459fc9529 confirmed, suspension named it, driver reinstated.

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
  "session_id": "31d5245a-116e-4aa3-93e5-813547779b40",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NjksImlhdCI6MTc5MzE3ODY2OSwianRpIjoiMTk2OWUxY2EtMWQ2Yy00ZWVkLWI1Y2MtMjU5MzFlNjdhNzZjIiwic2lkIjoiMzFkNTI0NWEtMTE2ZS00YWEzLTkzZTUtODEzNTQ3Nzc5YjQwIn0.wNOLpaAvd0EK0Oj4A5gg17_jggsPryrECHDhsiVVWkY",
  "access_expires_at": "2026-10-28T09:26:09.295338506Z",
  "refresh_token": "B3pvYxIZHqiT6xDRVM2F2lflAHQwok6zJTrriHsha7o",
  "refresh_expires_at": "2026-10-28T21:11:09.294779538Z",
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
      "actor_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:11:08.979157Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "4bc06f57-50ad-4909-8c02-93b368f04743",
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
  "session_id": "825b2c9d-773d-4d5f-bc51-ce9e30e5ea97",
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
  "last_heartbeat_at": "2026-10-28T09:11:06.291284Z",
  "last_location_at": "2026-10-28T09:11:06.291284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/825b2c9d-773d-4d5f-bc51-ce9e30e5ea97/close` → **200**

```json
{
  "command_id": "694a3a5e-6314-4884-b7d6-71a2e105f177",
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
  "session_id": "1d73fdf4-5d54-433a-a520-8788993bf32f",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NjksImlhdCI6MTc5MzE3ODY2OSwianRpIjoiYmI4NjA1MjktMTQ2MS00Yjk2LWI1MDktMGY0MWQzY2Y3NDljIiwic2lkIjoiMWQ3M2ZkZjQtNWQ1NC00MzNhLWE1MjAtODc4ODk5M2JmMzJmIn0.Y9Vi1BjHPg_H-e9GOjAroKquTArFkI0nxWVVj5qvNXA",
  "access_expires_at": "2026-10-28T09:26:09.736566156Z",
  "refresh_token": "Pqb_wYPxk_oRVencCaXBgzFHE0e_8IUOw8Juo9Gfnl4",
  "refresh_expires_at": "2026-10-28T21:11:09.736028946Z",
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
  "command_id": "ff1c2278-f5d9-4e74-b6c8-217831d78dbf",
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
  "changed_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:11:09.803892Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "ff1c2278-f5d9-4e74-b6c8-217831d78dbf",
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
  "changed_by": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:11:09.803892Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48587733048",
  "device_ref": "sandbox-4460"
}
```

```json
{
  "challenge_id": "ff4f3adf-1333-46c9-b6d5-d81ace89d502",
  "expires_at": "2026-10-28T09:16:09.883265817Z",
  "resend_available_at": "2026-10-28T09:11:10.883265817Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48587733048` → **200**

```json
{
  "phone": "+48587733048",
  "audience": "CLIENT",
  "code": "991278",
  "sent_at": "2026-10-28T09:11:09.885434837Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff4f3adf-1333-46c9-b6d5-d81ace89d502",
  "code": "991278",
  "device_ref": "sandbox-4460"
}
```

```json
{
  "session_id": "f3b6cce9-4443-4791-958e-bb75453b1b3e",
  "subject": {
    "type": "CLIENT",
    "id": "f1659a83-06c2-4fe1-8405-d86a95752b9e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMTY1OWE4My0wNmMyLTRmZTEtODQwNS1kODZhOTU3NTJiOWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTY5LCJpYXQiOjE3OTMxNzg2NjksImp0aSI6ImQ0YzQzOTM0LWFkZmMtNGI2ZS04ZWM2LTJkZWExYzY1MTkyOCIsInNpZCI6ImYzYjZjY2U5LTQ0NDMtNDc5MS05NThlLWJiNzU0NTNiMWIzZSJ9.Pwpt7axmjekJ9s8tOAKMLmr-aLEf6X2bXMO18K7pXqQ",
  "access_expires_at": "2026-10-28T09:26:09.943291524Z",
  "refresh_token": "kw7ofyMEE5rQA_3AyFusTZ5DK8S3DpoRvQW-WTw4rbM",
  "refresh_expires_at": "2026-11-27T09:11:09.94276885Z",
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
  "correlation_id": "75b76a08-ef7b-45ad-9647-7eb982ee3eac"
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
  "device_ref": "sandbox-21204"
}
```

```json
{
  "challenge_id": "ed2ffde4-1784-4f27-b5d9-091b0c31cd78",
  "expires_at": "2026-10-28T09:16:10.027072752Z",
  "resend_available_at": "2026-10-28T09:11:11.027072752Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "371784",
  "sent_at": "2026-10-28T09:11:10.029027725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed2ffde4-1784-4f27-b5d9-091b0c31cd78",
  "code": "371784",
  "device_ref": "sandbox-21204"
}
```

```json
{
  "session_id": "a6ecb26b-3b02-4cce-8246-7eb96273ed1a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTU3MCwiaWF0IjoxNzkzMTc4NjcwLCJqdGkiOiJkNzIyNGE5Ni00ODllLTRlMjgtYTc0ZS05YmUzZWE3ZWUyMzUiLCJzaWQiOiJhNmVjYjI2Yi0zYjAyLTRjY2UtODI0Ni03ZWI5NjI3M2VkMWEifQ.pTJqU7buepJsxiI8pgeYDMDdgLHIZAFZZqFYkzeMRIg",
  "access_expires_at": "2026-10-28T09:26:10.085199027Z",
  "refresh_token": "veF7uQwmb6e0qylbVkQuwMVGyOlYazPN8S7asGIHd3o",
  "refresh_expires_at": "2026-11-27T09:11:10.084567542Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e9ce1154-4bcc-413e-873a-d11a78748d9e",
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
  "last_heartbeat_at": "2026-10-28T09:10:56.615009Z",
  "last_location_at": "2026-10-28T09:10:56.615009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9ce1154-4bcc-413e-873a-d11a78748d9e/handover` → **200**

```json
{
  "command_id": "d7738867-40c7-47b9-9e13-f01bc7bf0fc1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e9ce1154-4bcc-413e-873a-d11a78748d9e",
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
  "last_heartbeat_at": "2026-10-28T09:10:56.615009Z",
  "last_location_at": "2026-10-28T09:10:56.615009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9ce1154-4bcc-413e-873a-d11a78748d9e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:11:10Z",
    "sequence": 1793178670166
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e9ce1154-4bcc-413e-873a-d11a78748d9e",
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
  "last_heartbeat_at": "2026-10-28T09:11:10.184157Z",
  "last_location_at": "2026-10-28T09:11:10.184157Z",
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
  "session_id": "e9ce1154-4bcc-413e-873a-d11a78748d9e",
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
  "last_heartbeat_at": "2026-10-28T09:11:10.184157Z",
  "last_location_at": "2026-10-28T09:11:10.184157Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9ce1154-4bcc-413e-873a-d11a78748d9e/close` → **200**

```json
{
  "command_id": "2c796e9f-fcd6-4d6a-8067-c72e03b49eba",
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
  "correlation_id": "62902653-9900-4864-b5be-80f69d63dd58"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678428821",
  "device_ref": "sandbox-16068"
}
```

```json
{
  "challenge_id": "a094b70a-5389-44ba-b93e-15db260fb254",
  "expires_at": "2026-10-28T09:16:10.33868264Z",
  "resend_available_at": "2026-10-28T09:11:11.33868264Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678428821` → **200**

```json
{
  "phone": "+380678428821",
  "audience": "CLIENT",
  "code": "886050",
  "sent_at": "2026-10-28T09:11:10.343981743Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a094b70a-5389-44ba-b93e-15db260fb254",
  "code": "886050",
  "device_ref": "sandbox-16068"
}
```

```json
{
  "session_id": "075b99aa-3fcf-44ba-92a8-564adb55b1fe",
  "subject": {
    "type": "CLIENT",
    "id": "50b92748-ab27-40f5-acad-c6a7d2204afa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGI5Mjc0OC1hYjI3LTQwZjUtYWNhZC1jNmE3ZDIyMDRhZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NTcwLCJpYXQiOjE3OTMxNzg2NzAsImp0aSI6ImRiNjQ1ZWM4LTcyNjgtNDcyZi1iNTliLTM1NGNhNDU2ZmFmMiIsInNpZCI6IjA3NWI5OWFhLTNmY2YtNDRiYS05MmE4LTU2NGFkYjU1YjFmZSJ9.ItR4yeU-EySvpt3efwCUk7EC42J0_D4zqmY4bu8AI94",
  "access_expires_at": "2026-10-28T09:26:10.43568068Z",
  "refresh_token": "3cDbfGEomVMthwHyC_pnrvIuF-aSeh4EGBCmUWXczvI",
  "refresh_expires_at": "2026-11-27T09:11:10.434806055Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "30c7c397-5b72-4afa-8ac0-124eb249ba6d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5a2f037c-4cb8-44c9-bc91-ed0869819982",
  "upload_path": "/api/rider/v1/uploads/5a2f037c-4cb8-44c9-bc91-ed0869819982",
  "expires_at": "2026-10-28T09:26:10.470403755Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/5a2f037c-4cb8-44c9-bc91-ed0869819982` → **200**

```json
{
  "file_id": "5a2f037c-4cb8-44c9-bc91-ed0869819982",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b5a6e84f-5397-4ca3-b337-6826a673ff3c",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "5a2f037c-4cb8-44c9-bc91-ed0869819982"
  ]
}
```

```json
{
  "id": "45dba1b6-630f-456c-b39e-483c97892f1e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "50b92748-ab27-40f5-acad-c6a7d2204afa",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:11:10.542927Z",
  "updated_at": "2026-10-28T09:11:10.542927Z",
  "messages": [
    {
      "id": "853b2137-ede7-4161-a4cf-f2439be3110c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "50b92748-ab27-40f5-acad-c6a7d2204afa",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:11:10.544121Z",
      "attachments": [
        {
          "file_id": "5a2f037c-4cb8-44c9-bc91-ed0869819982",
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
  "session_id": "2de1a25e-dd57-4594-9d18-c8c42abd9901",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NzAsImlhdCI6MTc5MzE3ODY3MCwianRpIjoiMGNlMDQyZDktZGU0Ny00ZTI2LThlNjItNDA0MWU4MzFhMGRlIiwic2lkIjoiMmRlMWEyNWUtZGQ1Ny00NTk0LTlkMTgtYzhjNDJhYmQ5OTAxIn0.qGz8HV5CO8f6X_ZiyLcYd04E0oG8cWJdIbQAPPndri8",
  "access_expires_at": "2026-10-28T09:26:10.845149278Z",
  "refresh_token": "ae7MzVfTx5cV1f6-SvZGp9K-86haYQs-_rX3Uno2qes",
  "refresh_expires_at": "2026-10-28T21:11:10.844716788Z",
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
  "session_id": "d9946ad3-cf20-45bc-b55a-aaaa6265b72c",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NzEsImlhdCI6MTc5MzE3ODY3MSwianRpIjoiMzc5ZDYyYjgtODMxMy00MDE2LWE3N2MtMWRiOTc2NGExMTc5Iiwic2lkIjoiZDk5NDZhZDMtY2YyMC00NWJjLWI1NWEtYWFhYTYyNjViNzJjIn0.W5GI-0bSVNiWLS5-VXMZKJMJBTK4ys4IxndAbW20krU",
  "access_expires_at": "2026-10-28T09:26:11.127634741Z",
  "refresh_token": "bhxMzeoLwYub0NRhTsBUQjDq1TyGbyHqpijy4gddIhM",
  "refresh_expires_at": "2026-10-28T21:11:11.12720107Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/45dba1b6-630f-456c-b39e-483c97892f1e/attachments/5a2f037c-4cb8-44c9-bc91-ed0869819982` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "79908a57-e6d4-4de1-90b5-e11fcb2661c4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba",
  "upload_path": "/api/operator/v1/uploads/2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba",
  "expires_at": "2026-10-28T09:26:11.171965928Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba` → **200**

```json
{
  "file_id": "2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/45dba1b6-630f-456c-b39e-483c97892f1e` → **200**

```json
{
  "id": "45dba1b6-630f-456c-b39e-483c97892f1e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "50b92748-ab27-40f5-acad-c6a7d2204afa",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:11:10.542927Z",
  "updated_at": "2026-10-28T09:11:10.542927Z",
  "messages": [
    {
      "id": "853b2137-ede7-4161-a4cf-f2439be3110c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "50b92748-ab27-40f5-acad-c6a7d2204afa",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:11:10.544121Z",
      "attachments": [
        {
          "file_id": "5a2f037c-4cb8-44c9-bc91-ed0869819982",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/45dba1b6-630f-456c-b39e-483c97892f1e/comments` → **200**

```json
{
  "command_id": "afe441ce-e789-4067-ae47-24a4a76082ce",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba"
  ]
}
```

```json
{
  "id": "45dba1b6-630f-456c-b39e-483c97892f1e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "50b92748-ab27-40f5-acad-c6a7d2204afa",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:11:10.542927Z",
  "updated_at": "2026-10-28T09:11:11.262108Z",
  "messages": [
    {
      "id": "853b2137-ede7-4161-a4cf-f2439be3110c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "50b92748-ab27-40f5-acad-c6a7d2204afa",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:11:10.544121Z",
      "attachments": [
        {
          "file_id": "5a2f037c-4cb8-44c9-bc91-ed0869819982",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c980c13e-fd58-4431-9dbb-0d4dad8c8370",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:11:11.261791Z",
      "attachments": [
        {
          "file_id": "2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba",
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

`GET /api/rider/v1/support/cases/45dba1b6-630f-456c-b39e-483c97892f1e` → **200**

```json
{
  "id": "45dba1b6-630f-456c-b39e-483c97892f1e",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "50b92748-ab27-40f5-acad-c6a7d2204afa",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:11:10.542927Z",
  "updated_at": "2026-10-28T09:11:11.262108Z",
  "messages": [
    {
      "id": "853b2137-ede7-4161-a4cf-f2439be3110c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "50b92748-ab27-40f5-acad-c6a7d2204afa",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:11:10.544121Z",
      "attachments": [
        {
          "file_id": "5a2f037c-4cb8-44c9-bc91-ed0869819982",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c980c13e-fd58-4431-9dbb-0d4dad8c8370",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:11:11.261791Z",
      "attachments": [
        {
          "file_id": "2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/45dba1b6-630f-456c-b39e-483c97892f1e/attachments/2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba` → **200**

Done: support case 45dba1b6-630f-456c-b39e-483c97892f1e, rider attachment 5a2f037c-4cb8-44c9-bc91-ed0869819982, operator attachment 2ce4d0d6-9fc5-4f9e-a7b7-412a54202cba.

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
  "session_id": "680f236e-9d1f-4be0-af5e-7ac79ecaa4c0",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NzEsImlhdCI6MTc5MzE3ODY3MSwianRpIjoiZDZkZjNiY2UtYzkyMS00MThkLWE1ZTAtYWUwNGYxYjIwZjYxIiwic2lkIjoiNjgwZjIzNmUtOWQxZi00YmUwLWFmNWUtN2FjNzllY2FhNGMwIn0.eSQwPOPAzcRQqL8xFGQlRivvz55u_khtEeO4uz7TvuE",
  "access_expires_at": "2026-10-28T09:26:11.607990437Z",
  "refresh_token": "ZpQb4IY00LuPByMXsQ75DXOer5TWClgNgqNrULP7ik0",
  "refresh_expires_at": "2026-10-28T21:11:11.60753985Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4278"
}
```

```json
{
  "challenge_id": "b75f2e80-bed2-43ae-b658-f5daf4ae280c",
  "expires_at": "2026-10-28T09:16:11.633668838Z",
  "resend_available_at": "2026-10-28T09:11:12.633668838Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "982753",
  "sent_at": "2026-10-28T09:11:11.63560213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b75f2e80-bed2-43ae-b658-f5daf4ae280c",
  "code": "982753",
  "device_ref": "sandbox-4278"
}
```

```json
{
  "session_id": "db451c3c-175c-4dba-a009-a8c3424abf5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTU3MSwiaWF0IjoxNzkzMTc4NjcxLCJqdGkiOiJjNTQxMTc5OC1mOTZmLTRiYmMtOTFhNy03NWM0YTgyMDUyMDkiLCJzaWQiOiJkYjQ1MWMzYy0xNzVjLTRkYmEtYTAwOS1hOGMzNDI0YWJmNWEifQ.JVDbd_IU0Bipz7fM9wPm0by-k3bfhDDh4Be_dRJ3VGU",
  "access_expires_at": "2026-10-28T09:26:11.689491598Z",
  "refresh_token": "IJ-S9xcdXIqHxwJb0qZeDB8RL_IihNo2FxUDvPfGK7c",
  "refresh_expires_at": "2026-11-27T09:11:11.68902992Z",
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
      "actor_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:11:08.979157Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T09:11:09.36395Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "db13b2e8-320d-4373-8432-9e730cd39e32",
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
  "device_ref": "sandbox-23200"
}
```

```json
{
  "challenge_id": "2f1b2dee-2841-4ded-852a-d7a99c506e0e",
  "expires_at": "2026-10-28T09:16:11.813005517Z",
  "resend_available_at": "2026-10-28T09:11:12.813005517Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "686514",
  "sent_at": "2026-10-28T09:11:11.81477096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f1b2dee-2841-4ded-852a-d7a99c506e0e",
  "code": "686514",
  "device_ref": "sandbox-23200"
}
```

```json
{
  "session_id": "53b879af-c5f9-4425-8819-c149e9a11c2d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTU3MSwiaWF0IjoxNzkzMTc4NjcxLCJqdGkiOiJiMTM4MzVhNy03Mzg3LTQyN2EtYjZlYS1mYjg3ZGRiZGYxZTYiLCJzaWQiOiI1M2I4NzlhZi1jNWY5LTQ0MjUtODgxOS1jMTQ5ZTlhMTFjMmQifQ._JpUhhjI7AAmbkF0LgoKMWQWbcUcC6WCYs81e-smDLk",
  "access_expires_at": "2026-10-28T09:26:11.868848015Z",
  "refresh_token": "4dAkIjWh93kfyNqAnguM0RSYMVeZOzZYPBM_cGn0jNg",
  "refresh_expires_at": "2026-11-27T09:11:11.868394093Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2cad3b5-1624-45b2-adc3-f0e31010e083",
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
  "last_heartbeat_at": "2026-10-28T09:10:57.661769Z",
  "last_location_at": "2026-10-28T09:10:57.661769Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2cad3b5-1624-45b2-adc3-f0e31010e083/handover` → **200**

```json
{
  "command_id": "35c5635b-878d-4d8d-b07b-9fd88bcbd95f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2cad3b5-1624-45b2-adc3-f0e31010e083",
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
  "last_heartbeat_at": "2026-10-28T09:10:57.661769Z",
  "last_location_at": "2026-10-28T09:10:57.661769Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2cad3b5-1624-45b2-adc3-f0e31010e083/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:11:11Z",
    "sequence": 1793178671993
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2cad3b5-1624-45b2-adc3-f0e31010e083",
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
  "last_heartbeat_at": "2026-10-28T09:11:12.011009Z",
  "last_location_at": "2026-10-28T09:11:12.011009Z",
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
  "command_id": "df88a691-2acc-4cc7-a0f0-a2103e17b78b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:11:12Z",
    "sequence": 1793178672558
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6241ec0f-c738-4e7a-b928-2861c0050c5c",
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
  "last_heartbeat_at": "2026-10-28T09:11:12.073597Z",
  "last_location_at": "2026-10-28T09:11:12.073597Z",
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
  "session_id": "28af2859-90f6-4db6-b601-060262738274",
  "subject": {
    "type": "STAFF",
    "id": "5adc99e6-6dff-4ebb-978e-5bd737e5f77f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YWRjOTllNi02ZGZmLTRlYmItOTc4ZS01YmQ3MzdlNWY3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk1NzIsImlhdCI6MTc5MzE3ODY3MiwianRpIjoiNWM1OGJhZDItZjNjZC00OGY0LTlmMmMtZDJiYjg4YzEzOWUwIiwic2lkIjoiMjhhZjI4NTktOTBmNi00ZGI2LWI2MDEtMDYwMjYyNzM4Mjc0In0.7twi8FOrcT7tRaJwCoy_AHBElUkqPJEjhIt4HCFNm4Q",
  "access_expires_at": "2026-10-28T09:26:12.368878662Z",
  "refresh_token": "Hv2gksPqv8MlrZSknnfiubafhVlA8nHoEJYB7jTY7e4",
  "refresh_expires_at": "2026-10-28T21:11:12.368367976Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8e110017-0564-4267-8339-49afbf28b049",
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
  "id": "1625b133-153f-428f-be85-01a37c873479",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:16:12.397093Z",
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
  "command_id": "14bc1d1a-36e7-4b41-9db9-67487972dcc7",
  "quote_id": "1625b133-153f-428f-be85-01a37c873479",
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
  "id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
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
  "created_at": "2026-10-28T09:11:12.432523Z",
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
    "id": "a295b3c7-d7a5-4f4e-96d2-dcb3c0734312",
    "order_id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
    "expires_at": "2026-10-28T09:11:27.436249Z",
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

`POST /api/driver/v1/offers/a295b3c7-d7a5-4f4e-96d2-dcb3c0734312/accept` → **200**

```json
{
  "command_id": "ec17455c-1cfd-4fff-ac60-8a2ff1e87a57"
}
```

```json
{
  "id": "60b953ce-54c0-4ceb-9329-c56f6219ae97",
  "order_id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0b30ae21-e1eb-4121-9934-c63032eb2027",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0b30ae21-e1eb-4121-9934-c63032eb2027",
  "order_id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
  "assignment_id": "60b953ce-54c0-4ceb-9329-c56f6219ae97",
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

`POST /api/driver/v1/work-sessions/6241ec0f-c738-4e7a-b928-2861c0050c5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:11:12Z",
    "sequence": 1793178672566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6241ec0f-c738-4e7a-b928-2861c0050c5c",
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
  "last_heartbeat_at": "2026-10-28T09:11:12.583232Z",
  "last_location_at": "2026-10-28T09:11:12.583232Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0b30ae21-e1eb-4121-9934-c63032eb2027/arrive` → **200**

```json
{
  "command_id": "2453e65b-c6af-47d9-8112-9fb52471de7f",
  "expected_version": 0
}
```

```json
{
  "id": "0b30ae21-e1eb-4121-9934-c63032eb2027",
  "order_id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
  "assignment_id": "60b953ce-54c0-4ceb-9329-c56f6219ae97",
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
  "arrived_at": "2026-10-28T09:11:12.616801Z",
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

`POST /api/driver/v1/trips/0b30ae21-e1eb-4121-9934-c63032eb2027/start` → **200**

```json
{
  "command_id": "1e8a3a4b-f39d-40e8-927b-4bd0e257759c",
  "expected_version": 1
}
```

```json
{
  "id": "0b30ae21-e1eb-4121-9934-c63032eb2027",
  "order_id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
  "assignment_id": "60b953ce-54c0-4ceb-9329-c56f6219ae97",
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
  "arrived_at": "2026-10-28T09:11:12.616801Z",
  "started_at": "2026-10-28T09:11:12.654823Z",
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

`POST /api/driver/v1/trips/0b30ae21-e1eb-4121-9934-c63032eb2027/complete` → **200**

```json
{
  "command_id": "cbedf86c-0e53-486e-8f95-d18239b60728",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:11:12Z",
  "cash_received": true
}
```

```json
{
  "id": "0b30ae21-e1eb-4121-9934-c63032eb2027",
  "order_id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
  "assignment_id": "60b953ce-54c0-4ceb-9329-c56f6219ae97",
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
  "arrived_at": "2026-10-28T09:11:12.616801Z",
  "started_at": "2026-10-28T09:11:12.654823Z",
  "completed_at": "2026-10-28T09:11:12.695519Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/10c88b39-8d38-4937-8a7e-34a57a6f1bca` → **200**

```json
{
  "id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
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
    "id": "60b953ce-54c0-4ceb-9329-c56f6219ae97",
    "order_id": "10c88b39-8d38-4937-8a7e-34a57a6f1bca",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0b30ae21-e1eb-4121-9934-c63032eb2027",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:11:12.432523Z",
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
  "session_id": "f2cad3b5-1624-45b2-adc3-f0e31010e083",
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
  "last_heartbeat_at": "2026-10-28T09:11:12.011009Z",
  "last_location_at": "2026-10-28T09:11:12.011009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2cad3b5-1624-45b2-adc3-f0e31010e083/close` → **200**

```json
{
  "command_id": "c6e4c05e-ea29-45da-8a70-53862e6a1503",
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
  "session_id": "6241ec0f-c738-4e7a-b928-2861c0050c5c",
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
  "last_heartbeat_at": "2026-10-28T09:11:12.583232Z",
  "last_location_at": "2026-10-28T09:11:12.583232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6241ec0f-c738-4e7a-b928-2861c0050c5c/close` → **200**

```json
{
  "command_id": "43354de1-d820-4524-8740-ebaef5f9f0b4",
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

Done: terminal order 10c88b39-8d38-4937-8a7e-34a57a6f1bca by Andrii (5a000000-0000-4000-8000-000000000403).
