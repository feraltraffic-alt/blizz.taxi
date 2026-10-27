# Sandbox transcript (2026-10-27T13:43:16Z, 4c01c0e)

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
  "correlation_id": "7a916949-abeb-4d0c-bd93-e43fbf368d55"
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
  "session_id": "b6973667-e066-457e-87f6-a65cbb2951cd",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk0OTcsImlhdCI6MTc5MzEwODU5NywianRpIjoiYzk3NzczZjMtNzg5Mi00ZGJlLWE0Y2ItMWNiYmM5ODIyYzQ1Iiwic2lkIjoiYjY5NzM2NjctZTA2Ni00NTdlLTg3ZjYtYTY1Y2JiMjk1MWNkIn0.NKiafLoX41RCjsMAen21QEAN0k1aeczMowiRxQTIpFI",
  "access_expires_at": "2026-10-27T13:58:17.210152726Z",
  "refresh_token": "xyERyGd9Z-T0bpazESjl0ldfuld18dlOFfXS8g3j4bU",
  "refresh_expires_at": "2026-10-28T01:43:17.208315348Z",
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
  "session_id": "689b02f6-ee29-43d5-84c5-c6765bcef27f",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk0OTgsImlhdCI6MTc5MzEwODU5OCwianRpIjoiYjcxNjkwNzktMDZjNC00MzQ4LWI4ZmItYzljZWNhODJhYjg5Iiwic2lkIjoiNjg5YjAyZjYtZWUyOS00M2Q1LTg0YzUtYzY3NjViY2VmMjdmIn0.2RFMEKSpqLSVDVpwsKwVPKKWBRIX2w1DqVuw3LXJfhA",
  "access_expires_at": "2026-10-27T13:58:18.146446734Z",
  "refresh_token": "VlOWST2h2EcuMWl8IAM0UEvfJb0JdkxzqSTS2P92Uv0",
  "refresh_expires_at": "2026-10-28T01:43:18.14559145Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "691f8a7e-1347-477b-bf64-6c6b2a897feb",
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
  "id": "270d6950-30fc-4340-9673-f50a378d9f24",
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
  "created_by": "7a860fe2-017a-48e5-8409-4afb9a39940c",
  "created_at": "2026-10-27T13:43:18.209212Z",
  "updated_at": "2026-10-27T13:43:18.209212Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637241732",
  "device_ref": "sandbox-11918"
}
```

```json
{
  "challenge_id": "40040723-9d3f-4bcd-b067-74c214aeaf26",
  "expires_at": "2026-10-27T13:48:18.252180457Z",
  "resend_available_at": "2026-10-27T13:43:19.252180457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637241732` → **200**

```json
{
  "phone": "+380637241732",
  "audience": "CLIENT",
  "code": "077512",
  "sent_at": "2026-10-27T13:43:18.25841643Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40040723-9d3f-4bcd-b067-74c214aeaf26",
  "code": "077512",
  "device_ref": "sandbox-11918"
}
```

```json
{
  "session_id": "df62066b-84b1-463d-a580-6df29f201c53",
  "subject": {
    "type": "CLIENT",
    "id": "e7a8a304-4ec3-4c65-b5e8-52af3e7f0199"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlN2E4YTMwNC00ZWMzLTRjNjUtYjVlOC01MmFmM2U3ZjAxOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NDk4LCJpYXQiOjE3OTMxMDg1OTgsImp0aSI6ImIxZGI2ZTUwLWEyYTAtNGU3OS04ODBjLTA4ZTg0ZmE3YzQ5NSIsInNpZCI6ImRmNjIwNjZiLTg0YjEtNDYzZC1hNTgwLTZkZjI5ZjIwMWM1MyJ9.TSoPq5hI9PB_siVVqzGTSzRTHlZ3_3YaFGb3dyz4apM",
  "access_expires_at": "2026-10-27T13:58:18.330672632Z",
  "refresh_token": "rsvsChLGjLgIwK3irhW-oqu614vy3sb4xBmIJyFkgTk",
  "refresh_expires_at": "2026-11-26T13:43:18.329721243Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637241732` → **200**

```json
{
  "client_id": "e7a8a304-4ec3-4c65-b5e8-52af3e7f0199"
}
```

`POST /api/admin/v1/rider-wallets/e7a8a304-4ec3-4c65-b5e8-52af3e7f0199/top-ups` → **201**

```json
{
  "command_id": "d8fa600f-4853-49b4-8ea4-2f20f2bd3b7b",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e7a8a304-4ec3-4c65-b5e8-52af3e7f0199",
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
      "id": "104dff86-fff0-4fde-b7b7-8ffe61673c0e",
      "at": "2026-10-27T13:43:18.400754Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7a860fe2-017a-48e5-8409-4afb9a39940c",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "01787259-8315-4767-99d3-9abfda207bd2",
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
  "id": "e696767d-8eaf-47af-a955-87723095eae7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T13:48:18.492293Z",
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
      "id": "270d6950-30fc-4340-9673-f50a378d9f24",
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
  "device_ref": "sandbox-16536"
}
```

```json
{
  "challenge_id": "8ed8ec68-dc0a-4c07-82d4-4a800d3da0bd",
  "expires_at": "2026-10-27T13:48:18.543970247Z",
  "resend_available_at": "2026-10-27T13:43:19.543970247Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "300728",
  "sent_at": "2026-10-27T13:43:18.546604332Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ed8ec68-dc0a-4c07-82d4-4a800d3da0bd",
  "code": "300728",
  "device_ref": "sandbox-16536"
}
```

```json
{
  "session_id": "dea68324-a509-4f6e-8bd9-164691f6b384",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTQ5OCwiaWF0IjoxNzkzMTA4NTk4LCJqdGkiOiJjZjJiODNlYi0yZTZkLTQzMGUtOGNmMC0wOTNlNzA2YmJmMWEiLCJzaWQiOiJkZWE2ODMyNC1hNTA5LTRmNmUtOGJkOS0xNjQ2OTFmNmIzODQifQ.Lu3cYVtcz_F0sriFuvBOuPrTFMjNtvVvHBeEeN_QOW0",
  "access_expires_at": "2026-10-27T13:58:18.596183848Z",
  "refresh_token": "7VwmlCZ5SYD2-wwIKPZMJR3DZfRlKaaXHqF0GwpnM_s",
  "refresh_expires_at": "2026-11-26T13:43:18.59549907Z",
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
  "command_id": "32f2fdd6-c9cf-4e3d-bacf-9dec9c68d2af",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:18Z",
    "sequence": 1793108598652
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:18.687486Z",
  "last_location_at": "2026-10-27T13:43:18.687486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fa9c2e59-fc51-469e-beb2-e1f3044c95cf",
  "quote_id": "e696767d-8eaf-47af-a955-87723095eae7",
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
  "id": "1b55387f-dc52-4b80-9339-4d9432ca4294",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7a8a304-4ec3-4c65-b5e8-52af3e7f0199",
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
  "created_at": "2026-10-27T13:43:18.774032Z",
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
  "client_id": "e7a8a304-4ec3-4c65-b5e8-52af3e7f0199",
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
      "id": "104dff86-fff0-4fde-b7b7-8ffe61673c0e",
      "at": "2026-10-27T13:43:18.400754Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7a860fe2-017a-48e5-8409-4afb9a39940c",
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
    "id": "1ff83f3b-4723-4235-a6c8-72f74fa0763f",
    "order_id": "1b55387f-dc52-4b80-9339-4d9432ca4294",
    "expires_at": "2026-10-27T13:43:33.785854Z",
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

`POST /api/driver/v1/offers/1ff83f3b-4723-4235-a6c8-72f74fa0763f/accept` → **200**

```json
{
  "command_id": "c0f3618e-9fac-4e94-886d-b8992883ceed"
}
```

```json
{
  "id": "8523e8e5-a1a5-430e-ac46-8063f62a2e33",
  "order_id": "1b55387f-dc52-4b80-9339-4d9432ca4294",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9bfe642-dd86-4d78-b80b-6558dbfa1375",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9bfe642-dd86-4d78-b80b-6558dbfa1375",
  "order_id": "1b55387f-dc52-4b80-9339-4d9432ca4294",
  "assignment_id": "8523e8e5-a1a5-430e-ac46-8063f62a2e33",
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
  "discount_minor": 1052
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:18Z",
    "sequence": 1793108598935
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:18.95378Z",
  "last_location_at": "2026-10-27T13:43:18.95378Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a9bfe642-dd86-4d78-b80b-6558dbfa1375/arrive` → **200**

```json
{
  "command_id": "c4b0eff5-5333-4a68-8204-632cf437ecd1",
  "expected_version": 0
}
```

```json
{
  "id": "a9bfe642-dd86-4d78-b80b-6558dbfa1375",
  "order_id": "1b55387f-dc52-4b80-9339-4d9432ca4294",
  "assignment_id": "8523e8e5-a1a5-430e-ac46-8063f62a2e33",
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
  "arrived_at": "2026-10-27T13:43:18.994294Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/a9bfe642-dd86-4d78-b80b-6558dbfa1375/start` → **200**

```json
{
  "command_id": "5f5e488f-2d98-43de-aa57-8144e68c18fb",
  "expected_version": 1
}
```

```json
{
  "id": "a9bfe642-dd86-4d78-b80b-6558dbfa1375",
  "order_id": "1b55387f-dc52-4b80-9339-4d9432ca4294",
  "assignment_id": "8523e8e5-a1a5-430e-ac46-8063f62a2e33",
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
  "arrived_at": "2026-10-27T13:43:18.994294Z",
  "started_at": "2026-10-27T13:43:19.033738Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a9bfe642-dd86-4d78-b80b-6558dbfa1375/complete` → **200**

```json
{
  "command_id": "040fdccf-af4f-4aad-9d0e-6f7a19dae44f",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:43:19Z",
  "cash_received": true
}
```

```json
{
  "id": "a9bfe642-dd86-4d78-b80b-6558dbfa1375",
  "order_id": "1b55387f-dc52-4b80-9339-4d9432ca4294",
  "assignment_id": "8523e8e5-a1a5-430e-ac46-8063f62a2e33",
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
  "arrived_at": "2026-10-27T13:43:18.994294Z",
  "started_at": "2026-10-27T13:43:19.033738Z",
  "completed_at": "2026-10-27T13:43:19.0899Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e7a8a304-4ec3-4c65-b5e8-52af3e7f0199",
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
      "id": "c4fbebdd-a088-432e-aa2f-54fa23f907c8",
      "at": "2026-10-27T13:43:19.413614Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "1b55387f-dc52-4b80-9339-4d9432ca4294"
    },
    {
      "id": "104dff86-fff0-4fde-b7b7-8ffe61673c0e",
      "at": "2026-10-27T13:43:18.400754Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7a860fe2-017a-48e5-8409-4afb9a39940c",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/270d6950-30fc-4340-9673-f50a378d9f24/archive` → **200**

```json
{
  "command_id": "9d3ba5cf-530d-4351-a5f5-2145cefcca87",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "270d6950-30fc-4340-9673-f50a378d9f24",
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
  "created_by": "7a860fe2-017a-48e5-8409-4afb9a39940c",
  "created_at": "2026-10-27T13:43:18.209212Z",
  "updated_at": "2026-10-27T13:43:22.170301Z"
}
```

Done: order 1b55387f-dc52-4b80-9339-4d9432ca4294.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638192628",
  "device_ref": "sandbox-21906"
}
```

```json
{
  "challenge_id": "540b6eff-721c-44fc-ad68-12f496e541b6",
  "expires_at": "2026-10-27T13:48:22.211254755Z",
  "resend_available_at": "2026-10-27T13:43:23.211254755Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638192628` → **200**

```json
{
  "phone": "+380638192628",
  "audience": "CLIENT",
  "code": "946078",
  "sent_at": "2026-10-27T13:43:22.214389822Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "540b6eff-721c-44fc-ad68-12f496e541b6",
  "code": "946078",
  "device_ref": "sandbox-21906"
}
```

```json
{
  "session_id": "4056093f-4b9c-4911-bf73-80999593c06c",
  "subject": {
    "type": "CLIENT",
    "id": "64af0753-1e76-41ed-8c33-a2793872702d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGFmMDc1My0xZTc2LTQxZWQtOGMzMy1hMjc5Mzg3MjcwMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NTAyLCJpYXQiOjE3OTMxMDg2MDIsImp0aSI6IjdhNWMwZTdkLTU3NmItNDgwMy1iNTkzLTM3MDUwYzg3YTZjOCIsInNpZCI6IjQwNTYwOTNmLTRiOWMtNDkxMS1iZjczLTgwOTk5NTkzYzA2YyJ9.Ml2-61xht36XFmHA3UlJ6sKkd3eMq15UgctzuA3Hwao",
  "access_expires_at": "2026-10-27T13:58:22.264095968Z",
  "refresh_token": "vfAxGf18r8ONAOE2lNosLVJT72hyLLDkJP2X32u_B3Y",
  "refresh_expires_at": "2026-11-26T13:43:22.263494475Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
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
  "device_ref": "sandbox-31470"
}
```

```json
{
  "challenge_id": "8741452e-641f-4fe0-a6a3-c160caa7c820",
  "expires_at": "2026-10-27T13:48:22.31208123Z",
  "resend_available_at": "2026-10-27T13:43:23.31208123Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "696827",
  "sent_at": "2026-10-27T13:43:22.314793181Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8741452e-641f-4fe0-a6a3-c160caa7c820",
  "code": "696827",
  "device_ref": "sandbox-31470"
}
```

```json
{
  "session_id": "1211bc0d-6064-4fd4-8e7b-4f35009f29eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUwMiwiaWF0IjoxNzkzMTA4NjAyLCJqdGkiOiIwMjcyZGY5MS00NDNlLTRlNDItOWMzNi0zNzA4MTdjNzdmNGIiLCJzaWQiOiIxMjExYmMwZC02MDY0LTRmZDQtOGU3Yi00ZjM1MDA5ZjI5ZWIifQ.LNSjFyZpgsqfP9gOvHqKcf_TlNEEkPMFTug1JFJUmiY",
  "access_expires_at": "2026-10-27T13:58:22.363055651Z",
  "refresh_token": "4xB8W_o6eOhA8MvCiYphsHjkW70msJw8X8B7hYhTPD4",
  "refresh_expires_at": "2026-11-26T13:43:22.36246198Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
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
  "session_id": "b655cf5a-2e77-4055-98f6-4176ba4a7e30",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk1MDIsImlhdCI6MTc5MzEwODYwMiwianRpIjoiNTdkZDVkNTAtNGFkZC00ZTdlLWJiMjUtMmRlZDI3ZTk1OGE4Iiwic2lkIjoiYjY1NWNmNWEtMmU3Ny00MDU1LTk4ZjYtNDE3NmJhNGE3ZTMwIn0.pOaoB45eB4cb9wVLbdRi9VtPo-cFwGoeRZznwKzAsAM",
  "access_expires_at": "2026-10-27T13:58:22.616733829Z",
  "refresh_token": "Bb-5RKOk69Nj0VkH5N8iPN3puuqFMTjmhAmjitdOhYk",
  "refresh_expires_at": "2026-10-28T01:43:22.616298385Z",
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
  "session_id": "f82e956c-83e4-498f-8c10-00540fafca1c",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk1MDIsImlhdCI6MTc5MzEwODYwMiwianRpIjoiYmFkNmRhYjktMThmZC00MzFjLTkyMWEtOGFiMmExOGE3YWQxIiwic2lkIjoiZjgyZTk1NmMtODNlNC00OThmLThjMTAtMDA1NDBmYWZjYTFjIn0.eRl8AQZoc8TLrm2XjFSr4a4PJLqiAJvcQI3dJuvPGv4",
  "access_expires_at": "2026-10-27T13:58:22.851470689Z",
  "refresh_token": "pJQHZDl1t1LRJrqil75npCL5QqbDqahjJrE3FABg03s",
  "refresh_expires_at": "2026-10-28T01:43:22.850948696Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "uk": "ДТП",
        "pl": "Wypadek",
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
  "command_id": "e74a7aef-7689-48fa-8c0e-43fdc9c0961b",
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
  "id": "3d791761-4b56-46e8-8b27-ad58ba450d91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T13:48:22.909554Z",
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
  "command_id": "3943af89-ee5e-473f-ba21-757403874df0",
  "quote_id": "3d791761-4b56-46e8-8b27-ad58ba450d91",
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
  "id": "03ef9cde-f023-4f6d-922f-5788f34624c1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64af0753-1e76-41ed-8c33-a2793872702d",
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
  "created_at": "2026-10-27T13:43:22.944909Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/03ef9cde-f023-4f6d-922f-5788f34624c1` → **200**

```json
{
  "id": "03ef9cde-f023-4f6d-922f-5788f34624c1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64af0753-1e76-41ed-8c33-a2793872702d",
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
  "created_at": "2026-10-27T13:43:22.944909Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/03ef9cde-f023-4f6d-922f-5788f34624c1/cancel` → **200**

```json
{
  "command_id": "65b91629-46d0-49cb-b843-8cef1b8db5cc",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "03ef9cde-f023-4f6d-922f-5788f34624c1",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "64af0753-1e76-41ed-8c33-a2793872702d",
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
  "created_at": "2026-10-27T13:43:22.944909Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
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
  "command_id": "3c4a1442-3031-495f-8bf3-a7f17fa0786c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:23Z",
    "sequence": 1793108603623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "07abe9c1-8772-416a-829f-266460f4b4ff",
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
  "last_heartbeat_at": "2026-10-27T13:43:23.076777Z",
  "last_location_at": "2026-10-27T13:43:23.076777Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7311"
}
```

```json
{
  "challenge_id": "30f726c8-7fbb-4da0-babe-2932e6aba7d7",
  "expires_at": "2026-10-27T13:48:23.104140453Z",
  "resend_available_at": "2026-10-27T13:43:24.104140453Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "273185",
  "sent_at": "2026-10-27T13:43:23.107098122Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30f726c8-7fbb-4da0-babe-2932e6aba7d7",
  "code": "273185",
  "device_ref": "sandbox-7311"
}
```

```json
{
  "session_id": "ffb72e54-0de0-4fa3-8cea-9622a5f0e058",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUwMywiaWF0IjoxNzkzMTA4NjAzLCJqdGkiOiIzNWVmMWFkYi0wNDdmLTQwOWEtOTJhNi1hNWExY2JlMDhhNzgiLCJzaWQiOiJmZmI3MmU1NC0wZGUwLTRmYTMtOGNlYS05NjIyYTVmMGUwNTgifQ.wUio2xg0Ln_7yqr7NOwrEZmzagVS0ejKD880wewrMtM",
  "access_expires_at": "2026-10-27T13:58:23.157954334Z",
  "refresh_token": "3LEWUm3ihbKJ2HNWkHUUSfjJOsWmOamETBz4M9199CM",
  "refresh_expires_at": "2026-11-26T13:43:23.157420263Z",
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
  "command_id": "2442ed6a-b625-4963-a112-33a21fdab710",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:23Z",
    "sequence": 1793108603204
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
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
  "last_heartbeat_at": "2026-10-27T13:43:23.218119Z",
  "last_location_at": "2026-10-27T13:43:23.218119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "62b9a7be-707b-424c-9d98-b233a632166c",
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
  "id": "902148cc-0f45-4d61-a191-9a48ace611a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T13:48:23.253854Z",
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
  "command_id": "23d5aff2-a309-4157-b374-31d36fc0ac7f",
  "quote_id": "902148cc-0f45-4d61-a191-9a48ace611a8",
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
  "id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64af0753-1e76-41ed-8c33-a2793872702d",
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
  "created_at": "2026-10-27T13:43:23.287909Z",
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
    "id": "f8eac3c1-b2f0-4b45-9552-3e9a4b1bbaa8",
    "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
    "expires_at": "2026-10-27T13:43:38.290906Z",
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

`POST /api/driver/v1/offers/f8eac3c1-b2f0-4b45-9552-3e9a4b1bbaa8/accept` → **200**

```json
{
  "command_id": "fca7a922-7afb-4739-a4f5-66e92dd5a068"
}
```

```json
{
  "id": "0531cdb2-0e6d-4682-836f-fe988ac8b480",
  "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8104e26a-7bdb-4320-8769-f770a32480b0",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8104e26a-7bdb-4320-8769-f770a32480b0",
  "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
  "assignment_id": "0531cdb2-0e6d-4682-836f-fe988ac8b480",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/8104e26a-7bdb-4320-8769-f770a32480b0/cancel` → **200**

```json
{
  "command_id": "01658d63-2cbd-4555-b75f-46fde275081d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "8104e26a-7bdb-4320-8769-f770a32480b0",
  "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
  "assignment_id": "0531cdb2-0e6d-4682-836f-fe988ac8b480",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/12eda4dd-db44-461b-9ca7-acc902ceb0d1` → **200**

```json
{
  "id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "64af0753-1e76-41ed-8c33-a2793872702d",
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
    "id": "0531cdb2-0e6d-4682-836f-fe988ac8b480",
    "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8104e26a-7bdb-4320-8769-f770a32480b0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T13:43:23.287909Z",
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
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "86b69e2b-50e0-4fa9-a02e-8859ca9e7b51"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2ba22905-1dab-4dc7-acbe-6265d2adaebe"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737784378",
  "device_ref": "sandbox-15942"
}
```

```json
{
  "challenge_id": "29ca1419-4c95-4b16-8cf1-a2b7239965b0",
  "expires_at": "2026-10-27T13:48:23.543607193Z",
  "resend_available_at": "2026-10-27T13:43:24.543607193Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737784378` → **200**

```json
{
  "phone": "+380737784378",
  "audience": "CLIENT",
  "code": "916391",
  "sent_at": "2026-10-27T13:43:23.545879302Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29ca1419-4c95-4b16-8cf1-a2b7239965b0",
  "code": "916391",
  "device_ref": "sandbox-15942"
}
```

```json
{
  "session_id": "e90b26d6-47b8-4174-9fad-269d241860dd",
  "subject": {
    "type": "CLIENT",
    "id": "16b05367-b398-465d-9db4-7aed6d5a2fd4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNmIwNTM2Ny1iMzk4LTQ2NWQtOWRiNC03YWVkNmQ1YTJmZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NTAzLCJpYXQiOjE3OTMxMDg2MDMsImp0aSI6IjA3MjVjODFhLWMwNjctNDY0Ny05Mjg5LWY1MWU4ODQ4MDhlZCIsInNpZCI6ImU5MGIyNmQ2LTQ3YjgtNDE3NC05ZmFkLTI2OWQyNDE4NjBkZCJ9.X2WI-LuXUMYicOIgs-tTxbGY7bLLm6ImyHWFuvd3W2k",
  "access_expires_at": "2026-10-27T13:58:23.596191348Z",
  "refresh_token": "5HTkJXG7Kd7cWCJTIvwSppPInNEyhATguFxllk3VktI",
  "refresh_expires_at": "2026-11-26T13:43:23.595712099Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "dc37b9da-38a2-4dd4-9505-e91feef9bf57",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "001fd88f-7b95-4575-b41c-f8e0af09ddcf",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-001fd88f-7b95-4575-b41c-f8e0af09ddcf",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6449354b37ad0ca24fe889356c030428",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=001fd88f-7b95-4575-b41c-f8e0af09ddcf",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737784378"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=001fd88f-7b95-4575-b41c-f8e0af09ddcf",
  "expires_at": "2026-10-27T14:13:23.629891Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/001fd88f-7b95-4575-b41c-f8e0af09ddcf` → **200**

```json
{
  "id": "001fd88f-7b95-4575-b41c-f8e0af09ddcf",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T14:13:23.629891Z",
  "card": {
    "id": "770cc3f6-ea1c-4669-8570-0f8ea58bec18",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0774",
    "card_type": "Visa",
    "created_at": "2026-10-27T13:43:23.669112Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "770cc3f6-ea1c-4669-8570-0f8ea58bec18",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0774",
      "card_type": "Visa",
      "created_at": "2026-10-27T13:43:23.669112Z"
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
  "device_ref": "sandbox-30579"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "25b5fe02-c3bb-431c-b842-93b7876a905e",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30579"
}
```

```json
{
  "challenge_id": "f33567d6-4910-4ff1-a66f-530924984b62",
  "expires_at": "2026-10-27T13:48:24.768889884Z",
  "resend_available_at": "2026-10-27T13:43:25.768889884Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "071424",
  "sent_at": "2026-10-27T13:43:24.771013751Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f33567d6-4910-4ff1-a66f-530924984b62",
  "code": "071424",
  "device_ref": "sandbox-30579"
}
```

```json
{
  "session_id": "e1e5765c-220a-49a8-853c-13b3187587d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUwNCwiaWF0IjoxNzkzMTA4NjA0LCJqdGkiOiIzNzYzMGJlYS00NGUzLTQxNjYtYWJhZS1jYmI1MGNkOTk1NDciLCJzaWQiOiJlMWU1NzY1Yy0yMjBhLTQ5YTgtODUzYy0xM2IzMTg3NTg3ZDEifQ.q5buyd-tcKqXExTg_Ri7Dxio3R7xMzfMvmtGLZiySGQ",
  "access_expires_at": "2026-10-27T13:58:24.821579548Z",
  "refresh_token": "0kYMIbKdyLtpqZfkdZqQQrcWDnoVTmZCr_kTFyOdHm4",
  "refresh_expires_at": "2026-11-26T13:43:24.820983944Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
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
  "last_heartbeat_at": "2026-10-27T13:43:23.218119Z",
  "last_location_at": "2026-10-27T13:43:23.218119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0a20a443-893a-492c-9b2e-d115e266d71a/handover` → **200**

```json
{
  "command_id": "22e30226-c0df-4404-a189-ea56d7933793",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
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
  "last_heartbeat_at": "2026-10-27T13:43:23.218119Z",
  "last_location_at": "2026-10-27T13:43:23.218119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0a20a443-893a-492c-9b2e-d115e266d71a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:24Z",
    "sequence": 1793108604913
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
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
  "last_heartbeat_at": "2026-10-27T13:43:24.934533Z",
  "last_location_at": "2026-10-27T13:43:24.934533Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dff3c8c7-56db-4338-906d-2238d17f6e5f",
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
  "id": "890a8076-0b23-4264-b755-aac533c8c341",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T13:48:24.986417Z",
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
  "command_id": "e452e6bf-3822-4937-b0f6-859342d109ed",
  "quote_id": "890a8076-0b23-4264-b755-aac533c8c341",
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
  "id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "16b05367-b398-465d-9db4-7aed6d5a2fd4",
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
  "created_at": "2026-10-27T13:43:25.02325Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8af605a8-69e5-49c3-9a4a-4abb422ab68a` → **200**

```json
{
  "id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "16b05367-b398-465d-9db4-7aed6d5a2fd4",
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
  "created_at": "2026-10-27T13:43:25.02325Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8af605a8-69e5-49c3-9a4a-4abb422ab68a` → **200**

```json
{
  "id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "16b05367-b398-465d-9db4-7aed6d5a2fd4",
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
  "created_at": "2026-10-27T13:43:25.02325Z",
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
    "id": "995ef5e9-2f43-4be5-babc-33d0d0179aef",
    "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
    "expires_at": "2026-10-27T13:43:40.503135Z",
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

`POST /api/driver/v1/offers/995ef5e9-2f43-4be5-babc-33d0d0179aef/accept` → **200**

```json
{
  "command_id": "b3814ab9-923b-4968-84cf-044211358ffe"
}
```

```json
{
  "id": "92092a90-1db5-47bc-a811-e8c20ce41328",
  "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "38071a74-d071-4b7e-9bfc-3722c3925986",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "38071a74-d071-4b7e-9bfc-3722c3925986",
  "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "assignment_id": "92092a90-1db5-47bc-a811-e8c20ce41328",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/0a20a443-893a-492c-9b2e-d115e266d71a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:26Z",
    "sequence": 1793108606183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
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
  "last_heartbeat_at": "2026-10-27T13:43:26.197811Z",
  "last_location_at": "2026-10-27T13:43:26.197811Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/38071a74-d071-4b7e-9bfc-3722c3925986/arrive` → **200**

```json
{
  "command_id": "17d402e2-378e-4132-964c-469c2ac6c2f0",
  "expected_version": 0
}
```

```json
{
  "id": "38071a74-d071-4b7e-9bfc-3722c3925986",
  "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "assignment_id": "92092a90-1db5-47bc-a811-e8c20ce41328",
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
  "arrived_at": "2026-10-27T13:43:26.232262Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/38071a74-d071-4b7e-9bfc-3722c3925986/start` → **200**

```json
{
  "command_id": "9b88d142-9d1a-4072-b9ec-bdf52e04b0e4",
  "expected_version": 1
}
```

```json
{
  "id": "38071a74-d071-4b7e-9bfc-3722c3925986",
  "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "assignment_id": "92092a90-1db5-47bc-a811-e8c20ce41328",
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
  "arrived_at": "2026-10-27T13:43:26.232262Z",
  "started_at": "2026-10-27T13:43:26.280358Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/38071a74-d071-4b7e-9bfc-3722c3925986/complete` → **200**

```json
{
  "command_id": "d1da59db-8506-41c0-8f10-06bfc05ef04e",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:43:26Z"
}
```

```json
{
  "id": "38071a74-d071-4b7e-9bfc-3722c3925986",
  "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "assignment_id": "92092a90-1db5-47bc-a811-e8c20ce41328",
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
  "arrived_at": "2026-10-27T13:43:26.232262Z",
  "started_at": "2026-10-27T13:43:26.280358Z",
  "completed_at": "2026-10-27T13:43:26.318352Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/8af605a8-69e5-49c3-9a4a-4abb422ab68a` → **200**

```json
{
  "id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "16b05367-b398-465d-9db4-7aed6d5a2fd4",
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
    "id": "92092a90-1db5-47bc-a811-e8c20ce41328",
    "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "38071a74-d071-4b7e-9bfc-3722c3925986",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:43:25.02325Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8af605a8-69e5-49c3-9a4a-4abb422ab68a` → **200**

```json
{
  "id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "16b05367-b398-465d-9db4-7aed6d5a2fd4",
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
    "id": "92092a90-1db5-47bc-a811-e8c20ce41328",
    "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "38071a74-d071-4b7e-9bfc-3722c3925986",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:43:25.02325Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8af605a8-69e5-49c3-9a4a-4abb422ab68a` → **200**

```json
{
  "id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "16b05367-b398-465d-9db4-7aed6d5a2fd4",
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
    "id": "92092a90-1db5-47bc-a811-e8c20ce41328",
    "order_id": "8af605a8-69e5-49c3-9a4a-4abb422ab68a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "38071a74-d071-4b7e-9bfc-3722c3925986",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:43:25.02325Z",
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

Done: card order 8af605a8-69e5-49c3-9a4a-4abb422ab68a.

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
  "device_ref": "sandbox-8744"
}
```

```json
{
  "challenge_id": "a5d94942-5cc8-4d2e-aae7-a0ddf315b6df",
  "expires_at": "2026-10-27T13:48:28.494995571Z",
  "resend_available_at": "2026-10-27T13:43:29.494995571Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "101498",
  "sent_at": "2026-10-27T13:43:28.497238998Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5d94942-5cc8-4d2e-aae7-a0ddf315b6df",
  "code": "101498",
  "device_ref": "sandbox-8744"
}
```

```json
{
  "session_id": "c79185e2-3f64-48b0-9141-f3d02f94aa09",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUwOCwiaWF0IjoxNzkzMTA4NjA4LCJqdGkiOiJkYjNjMTI3My01N2U0LTQzZDAtOTQ5Yi1mMDUwM2EzMmJiMDYiLCJzaWQiOiJjNzkxODVlMi0zZjY0LTQ4YjAtOTE0MS1mM2QwMmY5NGFhMDkifQ.-xgBYoskWDLO4Ly19hlW-cqLWZGI4lzruPfKH6la8Gw",
  "access_expires_at": "2026-10-27T13:58:28.549881877Z",
  "refresh_token": "qwUKr41FdOKjeImO9T4CvEtxBE1TRqqMvSN8akLOxxk",
  "refresh_expires_at": "2026-11-26T13:43:28.549316994Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T13:43:18.95378Z",
  "last_location_at": "2026-10-27T13:43:18.95378Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/handover` → **200**

```json
{
  "command_id": "3c6b1918-47d0-4f98-bbe1-9e214a23ed48",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:18.95378Z",
  "last_location_at": "2026-10-27T13:43:18.95378Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:28Z",
    "sequence": 1793108608631
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:28.646146Z",
  "last_location_at": "2026-10-27T13:43:28.646146Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679032538",
  "device_ref": "sandbox-23385"
}
```

```json
{
  "challenge_id": "82be86e9-c6dd-41ce-a800-f4bcb3924dcb",
  "expires_at": "2026-10-27T13:48:28.680193782Z",
  "resend_available_at": "2026-10-27T13:43:29.680193782Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679032538` → **200**

```json
{
  "phone": "+380679032538",
  "audience": "CLIENT",
  "code": "631494",
  "sent_at": "2026-10-27T13:43:28.682568791Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82be86e9-c6dd-41ce-a800-f4bcb3924dcb",
  "code": "631494",
  "device_ref": "sandbox-23385"
}
```

```json
{
  "session_id": "5280f1b6-e7d5-4155-a308-c44b285b53d5",
  "subject": {
    "type": "CLIENT",
    "id": "25cfad72-0794-410c-ab88-86bfea7f67e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNWNmYWQ3Mi0wNzk0LTQxMGMtYWI4OC04NmJmZWE3ZjY3ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NTA4LCJpYXQiOjE3OTMxMDg2MDgsImp0aSI6IjQzNjIwNWNhLWRmNzgtNDhhZC05ODFiLTNiZmFlODNjMGIyZiIsInNpZCI6IjUyODBmMWI2LWU3ZDUtNDE1NS1hMzA4LWM0NGIyODViNTNkNSJ9.Xd7bucc5PlNJcqdzYqciV1kyzi3qbEhjsJypjM0Z4Co",
  "access_expires_at": "2026-10-27T13:58:28.733245885Z",
  "refresh_token": "VL743RqZVIDqUZZFMSnBQVaypt8OLIoM54x3QKfWsO8",
  "refresh_expires_at": "2026-11-26T13:43:28.732879004Z",
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
  "command_id": "b658fa4e-37a6-4b52-ae7d-eff2a23dfb1e",
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
  "id": "caee19ba-b92c-4923-b082-3381b7a8704f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T13:48:28.791175Z",
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

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "60cd67ed-347b-4904-9d3a-a5d9e2e98923",
  "quote_id": "caee19ba-b92c-4923-b082-3381b7a8704f",
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
  "id": "806fc395-6097-468f-9724-fde0aba2059c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "25cfad72-0794-410c-ab88-86bfea7f67e4",
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
  "created_at": "2026-10-27T13:43:28.829166Z",
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
    "id": "502c8da0-238e-44d6-9aab-774fce60f447",
    "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
    "expires_at": "2026-10-27T13:43:38.41955Z",
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
    "distance_m": 501
  }
]
```

`POST /api/driver/v1/offers/502c8da0-238e-44d6-9aab-774fce60f447/accept` → **200**

```json
{
  "command_id": "580dd0dd-086c-4457-a532-cb729ea594b9"
}
```

```json
{
  "id": "539687b8-b6dd-49c0-825b-f76278a6206f",
  "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6fcb53b1-d322-45e9-b1c9-cddde7780563",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/806fc395-6097-468f-9724-fde0aba2059c/messages` → **409**

```json
{
  "command_id": "b5a5d87b-2c35-4f1e-b8f6-0bdfa043e2f2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "instance": "/api/rider/v1/orders/806fc395-6097-468f-9724-fde0aba2059c/messages",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8326f572-dc65-4c7c-8f66-ca0bc2003765"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6fcb53b1-d322-45e9-b1c9-cddde7780563",
  "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
  "assignment_id": "539687b8-b6dd-49c0-825b-f76278a6206f",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/6fcb53b1-d322-45e9-b1c9-cddde7780563/messages` → **201**

```json
{
  "command_id": "4f4baf41-c06f-4298-ad84-0814fa585b32",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "5b5c1760-aaec-4b7d-8dfb-d8884d54d215",
  "order_id": "12eda4dd-db44-461b-9ca7-acc902ceb0d1",
  "sequence": 1,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T13:43:28.978565077Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/806fc395-6097-468f-9724-fde0aba2059c/call` → **409**

```json
{
  "instance": "/api/rider/v1/orders/806fc395-6097-468f-9724-fde0aba2059c/call",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5b4d4b7f-8273-445f-9279-9876872bbc1a"
}
```

**Expected 200, got 409 — scenario stopped.**

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27071"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "8cd1807c-469d-4aea-b4b8-3464b85405c5",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27071"
}
```

```json
{
  "challenge_id": "66dd0253-6b5f-4503-b19c-b88a3ec2e8f0",
  "expires_at": "2026-10-27T13:48:30.078836754Z",
  "resend_available_at": "2026-10-27T13:43:31.078836754Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "677577",
  "sent_at": "2026-10-27T13:43:30.080966629Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66dd0253-6b5f-4503-b19c-b88a3ec2e8f0",
  "code": "677577",
  "device_ref": "sandbox-27071"
}
```

```json
{
  "session_id": "934401cd-7e3c-4aa1-9839-456aa36efb44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUxMCwiaWF0IjoxNzkzMTA4NjEwLCJqdGkiOiI5ZjM4NjQ0Ny03NGRhLTQ4MGEtODMzOS1hOGRhOWFjODViYTkiLCJzaWQiOiI5MzQ0MDFjZC03ZTNjLTRhYTEtOTgzOS00NTZhYTM2ZWZiNDQifQ.LU2TLtw1euJgHMAdYT9B943-EyEMtdwFw9ScgtqUaIM",
  "access_expires_at": "2026-10-27T13:58:30.12896963Z",
  "refresh_token": "RW6ebHNG7u5VO1L-KLM-4k4HA6pEeHal4dVjlDNAMFA",
  "refresh_expires_at": "2026-11-26T13:43:30.128488443Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:28.646146Z",
  "last_location_at": "2026-10-27T13:43:28.646146Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/handover` → **200**

```json
{
  "command_id": "67f7c56f-0118-41bb-9ea3-a7577c0c6859",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:28.646146Z",
  "last_location_at": "2026-10-27T13:43:28.646146Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:30Z",
    "sequence": 1793108610206
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:30.220913Z",
  "last_location_at": "2026-10-27T13:43:30.220913Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660206985",
  "device_ref": "sandbox-16162"
}
```

```json
{
  "challenge_id": "89ee37fb-0199-4c3f-aef7-7f5bb5786d2a",
  "expires_at": "2026-10-27T13:48:30.243749351Z",
  "resend_available_at": "2026-10-27T13:43:31.243749351Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660206985` → **200**

```json
{
  "phone": "+380660206985",
  "audience": "CLIENT",
  "code": "341831",
  "sent_at": "2026-10-27T13:43:30.245836819Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89ee37fb-0199-4c3f-aef7-7f5bb5786d2a",
  "code": "341831",
  "device_ref": "sandbox-16162"
}
```

```json
{
  "session_id": "29f940cb-f4a1-41ff-821a-83723f05f230",
  "subject": {
    "type": "CLIENT",
    "id": "8cbd986a-ef73-4b57-938b-faea310442e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Y2JkOTg2YS1lZjczLTRiNTctOTM4Yi1mYWVhMzEwNDQyZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NTEwLCJpYXQiOjE3OTMxMDg2MTAsImp0aSI6IjFkNWJhYWY5LTZhMzctNDU1Zi1iM2Y2LTQ4ZTFjNTYwYWVhYSIsInNpZCI6IjI5Zjk0MGNiLWY0YTEtNDFmZi04MjFhLTgzNzIzZjA1ZjIzMCJ9.S__cGgZ55U3eQLgrqhDGL5bMyz4KU7h0ud8_ZQqnJb0",
  "access_expires_at": "2026-10-27T13:58:30.297126902Z",
  "refresh_token": "wbEkq0uVN1YT__4XkpZ3JHFlHzDUx_VXqJR0K_9HUnI",
  "refresh_expires_at": "2026-11-26T13:43:30.296706721Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c090a4ce-5d93-42eb-9c16-527bfa0d81b8",
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
  "id": "3796fc3f-a5f7-4d7b-84b5-9f720502f1e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T13:48:30.329190Z",
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
  "command_id": "d22a5866-d391-4857-842a-ce5d8bbecf82",
  "quote_id": "3796fc3f-a5f7-4d7b-84b5-9f720502f1e2",
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
  "id": "06d893a5-774e-4cd0-bdac-ecf8549ae5d0",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cbd986a-ef73-4b57-938b-faea310442e6",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-27T13:43:30.363643Z",
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
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "46f4dbfe-e6ad-4e16-9274-03a0a14b8d8c"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a5ffed13-b966-4d53-8ef4-67788eeba9c0"
}
```

**Expected 200, got 400 — scenario stopped.**

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
  "session_id": "bc8400b4-130b-4179-8241-e2ebda40729c",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk1MTAsImlhdCI6MTc5MzEwODYxMCwianRpIjoiNzQxYzhjYWUtZWMxMC00YjM4LTk2NTQtOGMxMDM4NjRkMDczIiwic2lkIjoiYmM4NDAwYjQtMTMwYi00MTc5LTgyNDEtZTJlYmRhNDA3MjljIn0.kCzJWzzasg-AaFNVmVJm7Alds8IB8qY2FhTg13Vu4d4",
  "access_expires_at": "2026-10-27T13:58:30.676727025Z",
  "refresh_token": "TP294YgkAJ_jyTYbteGJY51J_Ie5pVOw3kiP5ACHOeo",
  "refresh_expires_at": "2026-10-28T01:43:30.676245838Z",
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
  "command_id": "76a833b3-325f-4c3f-a4ba-b418a33091f7",
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
    }
  },
  "changed_by": "7a860fe2-017a-48e5-8409-4afb9a39940c",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T13:43:30.749892142Z"
}
```

## The rider books the airport for 2026-10-27T16:43:30Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600590287",
  "device_ref": "sandbox-14962"
}
```

```json
{
  "challenge_id": "392c0a6f-cea5-441b-a38e-5e68355d8403",
  "expires_at": "2026-10-27T13:48:30.783524968Z",
  "resend_available_at": "2026-10-27T13:43:31.783524968Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600590287` → **200**

```json
{
  "phone": "+48600590287",
  "audience": "CLIENT",
  "code": "818856",
  "sent_at": "2026-10-27T13:43:30.78545135Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "392c0a6f-cea5-441b-a38e-5e68355d8403",
  "code": "818856",
  "device_ref": "sandbox-14962"
}
```

```json
{
  "session_id": "973bf388-7375-4f5d-860a-0d8337c2ab42",
  "subject": {
    "type": "CLIENT",
    "id": "38c4874f-cd93-4031-862a-010143d9b588"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGM0ODc0Zi1jZDkzLTQwMzEtODYyYS0wMTAxNDNkOWI1ODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NTEwLCJpYXQiOjE3OTMxMDg2MTAsImp0aSI6IjY3MzVjYzA1LTEwYWUtNGZmNC1iNGVjLWFmMzYyNDI1ZWE3YSIsInNpZCI6Ijk3M2JmMzg4LTczNzUtNGY1ZC04NjBhLTBkODMzN2MyYWI0MiJ9.xfvIrSi-tuCQsnxNzdyt1iAFAXf8ncZSvk8NGhi-tGs",
  "access_expires_at": "2026-10-27T13:58:30.837158986Z",
  "refresh_token": "RmWZoWkI1K0g0a9aV2bGRoP6G_y4dm2dXef8cDkkMaA",
  "refresh_expires_at": "2026-11-26T13:43:30.836653762Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5863f7c3-2bc1-4b99-9fb7-17259a8aff08",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T16:43:30Z"
}
```

```json
{
  "id": "7bff0bdc-bccd-4d61-a021-7066f2218a7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T13:48:30.871731Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T16:43:30Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8c89d3f5-d780-4e3c-b2cc-2af689a327d8",
  "quote_id": "7bff0bdc-bccd-4d61-a021-7066f2218a7b",
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
  "pickup_at": "2026-10-27T16:43:30Z"
}
```

```json
{
  "id": "6279332b-b016-4f41-a55a-44cd8614b4c6",
  "short_number": 7,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "38c4874f-cd93-4031-862a-010143d9b588",
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
  "created_at": "2026-10-27T13:43:30.908458Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T16:43:30Z",
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
  "device_ref": "sandbox-1776"
}
```

```json
{
  "challenge_id": "01bcd361-c5ef-4bfb-a16f-62bf19e1bc84",
  "expires_at": "2026-10-27T13:48:30.938467996Z",
  "resend_available_at": "2026-10-27T13:43:31.938467996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "048099",
  "sent_at": "2026-10-27T13:43:30.940573131Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01bcd361-c5ef-4bfb-a16f-62bf19e1bc84",
  "code": "048099",
  "device_ref": "sandbox-1776"
}
```

```json
{
  "session_id": "a7379329-6b1f-4f68-8496-258e4c688e0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUxMCwiaWF0IjoxNzkzMTA4NjEwLCJqdGkiOiIxYzU4MjczMy01MTQ1LTRjNjItOGFlMS1lNjUyMDhjNzBiNTAiLCJzaWQiOiJhNzM3OTMyOS02YjFmLTRmNjgtODQ5Ni0yNThlNGM2ODhlMGQifQ.jda51nPnFUl0Oop09AMpSX3lUcQE9yLre3-cm6__X9E",
  "access_expires_at": "2026-10-27T13:58:30.992310396Z",
  "refresh_token": "t0tLM3Gaes9vISjarQt2NqjPHKDD4DypD7XdroouIfA",
  "refresh_expires_at": "2026-11-26T13:43:30.991670501Z",
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
  "command_id": "ffd2bd7f-05b3-417d-ab9b-c4e6a42ba859",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:31Z",
    "sequence": 1793108611390
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ffb7e431-ca74-477f-8f73-68d9f9fa09f3",
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
  "last_heartbeat_at": "2026-10-27T13:43:31.052503Z",
  "last_location_at": "2026-10-27T13:43:31.052503Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "6279332b-b016-4f41-a55a-44cd8614b4c6",
      "short_number": 7,
      "pickup_at": "2026-10-27T16:43:30Z",
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

`POST /api/driver/v1/preorders/6279332b-b016-4f41-a55a-44cd8614b4c6/reserve` → **200**

```json
{
  "command_id": "d74c581c-a7be-4616-bda4-ba7e2abc410d"
}
```

```json
{
  "id": "3f6586e7-aab5-4ad1-b133-ded688be71b8",
  "state": "RESERVED",
  "order": {
    "order_id": "6279332b-b016-4f41-a55a-44cd8614b4c6",
    "short_number": 7,
    "pickup_at": "2026-10-27T16:43:30Z",
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
  "reserved_at": "2026-10-27T13:43:31.116123Z",
  "confirm_from": "2026-10-27T16:13:30Z",
  "confirm_until": "2026-10-27T16:23:30Z",
  "drop_until": "2026-10-27T15:43:30Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "3f6586e7-aab5-4ad1-b133-ded688be71b8",
      "state": "RESERVED",
      "order": {
        "order_id": "6279332b-b016-4f41-a55a-44cd8614b4c6",
        "short_number": 7,
        "pickup_at": "2026-10-27T16:43:30Z",
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
      "reserved_at": "2026-10-27T13:43:31.116123Z",
      "confirm_from": "2026-10-27T16:13:30Z",
      "confirm_until": "2026-10-27T16:23:30Z",
      "drop_until": "2026-10-27T15:43:30Z"
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
      "id": "3f6586e7-aab5-4ad1-b133-ded688be71b8",
      "state": "RESERVED",
      "order": {
        "order_id": "6279332b-b016-4f41-a55a-44cd8614b4c6",
        "short_number": 7,
        "pickup_at": "2026-10-27T16:43:30Z",
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
      "reserved_at": "2026-10-27T13:43:31.116123Z",
      "confirm_from": "2026-10-27T16:13:30Z",
      "confirm_until": "2026-10-27T16:23:30Z",
      "drop_until": "2026-10-27T15:43:30Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/3f6586e7-aab5-4ad1-b133-ded688be71b8/confirm` → **409**

```json
{
  "command_id": "439d0291-dd97-46bd-876c-10532c0e2f8f"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/3f6586e7-aab5-4ad1-b133-ded688be71b8/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6dac59ed-5456-497c-8949-1d76afa52613"
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
  "session_id": "9368a6cb-49b5-4ab9-8994-5cba6760d6bf",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk1MTEsImlhdCI6MTc5MzEwODYxMSwianRpIjoiYjcxZmNkOGMtNWZmZS00M2M5LWEzNzEtZjkzZDNhZWRlNjM0Iiwic2lkIjoiOTM2OGE2Y2ItNDliNS00YWI5LTg5OTQtNWNiYTY3NjBkNmJmIn0.rOyltawbwgk4DwpbIds491w28ohrDUumPlGLAX8X8c8",
  "access_expires_at": "2026-10-27T13:58:31.428360003Z",
  "refresh_token": "UHP_Gxtdemuie7O8KDhSySPwL2l56rczZlRMuaNCgAY",
  "refresh_expires_at": "2026-10-28T01:43:31.427879352Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6279332b-b016-4f41-a55a-44cd8614b4c6` → **200**

```json
{
  "id": "6279332b-b016-4f41-a55a-44cd8614b4c6",
  "short_number": 7,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "38c4874f-cd93-4031-862a-010143d9b588",
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
  "created_at": "2026-10-27T13:43:30.908458Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T16:43:30Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "3f6586e7-aab5-4ad1-b133-ded688be71b8",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T13:43:31.116123Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6279332b-b016-4f41-a55a-44cd8614b4c6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T13:43:30.909868Z",
      "actor": {
        "type": "CLIENT",
        "id": "38c4874f-cd93-4031-862a-010143d9b588",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "6279332b-b016-4f41-a55a-44cd8614b4c6",
        "preorder": true,
        "quote_id": "7bff0bdc-bccd-4d61-a021-7066f2218a7b",
        "pickup_at": "2026-10-27T16:43:30Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T13:43:31.117132Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6279332b-b016-4f41-a55a-44cd8614b4c6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "3f6586e7-aab5-4ad1-b133-ded688be71b8"
      }
    }
  ]
}
```

Done: pre-order 6279332b-b016-4f41-a55a-44cd8614b4c6, reservation 3f6586e7-aab5-4ad1-b133-ded688be71b8.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18484"
}
```

```json
{
  "challenge_id": "c898d059-0e91-4c23-ae39-d10141495c00",
  "expires_at": "2026-10-27T13:48:31.516632662Z",
  "resend_available_at": "2026-10-27T13:43:32.516632662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "771774",
  "sent_at": "2026-10-27T13:43:31.518667636Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c898d059-0e91-4c23-ae39-d10141495c00",
  "code": "771774",
  "device_ref": "sandbox-18484"
}
```

```json
{
  "session_id": "b6235b00-b38b-4734-8e9f-9f0b6488d39a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUxMSwiaWF0IjoxNzkzMTA4NjExLCJqdGkiOiIyZTdlYzBkMS00NWJkLTQwZjAtYTgwOC1kN2UxYjYyMmIxZTIiLCJzaWQiOiJiNjIzNWIwMC1iMzhiLTQ3MzQtOGU5Zi05ZjBiNjQ4OGQzOWEifQ.QhXICX45mQ1W3B9trgIjFT50Qg19cUrDrK32IyQDL4M",
  "access_expires_at": "2026-10-27T13:58:31.566703866Z",
  "refresh_token": "dVgDH87H3fDk2oafR4kwQ2pzgaBNOyR_wG0pdteXGF0",
  "refresh_expires_at": "2026-11-26T13:43:31.566219534Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:30.220913Z",
  "last_location_at": "2026-10-27T13:43:30.220913Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/handover` → **200**

```json
{
  "command_id": "dd6faaa3-adb1-4fcb-bff4-6758800708bb",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:30.220913Z",
  "last_location_at": "2026-10-27T13:43:30.220913Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:31Z",
    "sequence": 1793108611643
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:31.657064Z",
  "last_location_at": "2026-10-27T13:43:31.657064Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674333052",
  "device_ref": "sandbox-8799"
}
```

```json
{
  "challenge_id": "9887f4b3-86ca-4fdc-bd18-4e318f5c7969",
  "expires_at": "2026-10-27T13:48:31.680430404Z",
  "resend_available_at": "2026-10-27T13:43:32.680430404Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674333052` → **200**

```json
{
  "phone": "+380674333052",
  "audience": "CLIENT",
  "code": "651607",
  "sent_at": "2026-10-27T13:43:31.682435129Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9887f4b3-86ca-4fdc-bd18-4e318f5c7969",
  "code": "651607",
  "device_ref": "sandbox-8799"
}
```

```json
{
  "session_id": "c58c5f96-6dda-42b0-bfba-3025bb5a3141",
  "subject": {
    "type": "CLIENT",
    "id": "1da1b3ff-a7e7-4c19-ab49-7449de175556"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZGExYjNmZi1hN2U3LTRjMTktYWI0OS03NDQ5ZGUxNzU1NTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NTExLCJpYXQiOjE3OTMxMDg2MTEsImp0aSI6ImNjZDE5NDI1LTQ1NjctNDllZS04Y2JjLWFhZTYxYzg5NWVlYyIsInNpZCI6ImM1OGM1Zjk2LTZkZGEtNDJiMC1iZmJhLTMwMjViYjVhMzE0MSJ9.y3JnXiq1Svk0doQCysLbU1n_YHneZkrH5KiY13MT7LU",
  "access_expires_at": "2026-10-27T13:58:31.734012594Z",
  "refresh_token": "blMkVR8rLPCvj6VS3X1lq6pWpJmWqM7dluuFTSJqjnE",
  "refresh_expires_at": "2026-11-26T13:43:31.733526364Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8659e50e-51ed-4db7-89f8-96ce386b7589",
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
  "id": "8b04341c-a2e9-4bbf-a85b-2f78d3d12b4a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T13:48:31.768772Z",
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
  "command_id": "c3e80d1d-3c7c-4a5b-bb75-c3e3d67a2860",
  "quote_id": "8b04341c-a2e9-4bbf-a85b-2f78d3d12b4a",
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
  "id": "9e23e2a5-b764-4d4e-9ad8-68a22e2e2ffe",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1da1b3ff-a7e7-4c19-ab49-7449de175556",
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
  "created_at": "2026-10-27T13:43:31.804257Z",
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
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "b581ec9b-7772-460f-871a-951df0ceb517"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1cad942e-34c6-4228-80b0-b4e775f4aada"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675842632",
  "device_ref": "sandbox-16525"
}
```

```json
{
  "challenge_id": "6fc4cb08-edad-4c89-bcd4-8cfd68cb807a",
  "expires_at": "2026-10-27T13:48:31.916292162Z",
  "resend_available_at": "2026-10-27T13:43:32.916292162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675842632` → **200**

```json
{
  "phone": "+380675842632",
  "audience": "CLIENT",
  "code": "289392",
  "sent_at": "2026-10-27T13:43:31.918582345Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6fc4cb08-edad-4c89-bcd4-8cfd68cb807a",
  "code": "289392",
  "device_ref": "sandbox-16525"
}
```

```json
{
  "session_id": "e4ef7305-786b-447b-a853-c64017b09e3d",
  "subject": {
    "type": "CLIENT",
    "id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOGU2ZjU2Ni00NDMzLTQ5ZDUtYTVmNi0yZjFlYWQzOTQ0NGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NTExLCJpYXQiOjE3OTMxMDg2MTEsImp0aSI6ImE0Mjg5YmI4LThkNWMtNDZhZi05M2Q0LTQ5ODRiZjc2N2YxNCIsInNpZCI6ImU0ZWY3MzA1LTc4NmItNDQ3Yi1hODUzLWM2NDAxN2IwOWUzZCJ9.9i4U3XfIeIi6T_d4iMjF1PB_18QBtwT8ibYHr77HHGI",
  "access_expires_at": "2026-10-27T13:58:31.968989059Z",
  "refresh_token": "zTnlWzZdx18c7WlU6_hEK4Zsrn61DTyT_-lLJRf_9Ow",
  "refresh_expires_at": "2026-11-26T13:43:31.96863694Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "36aacf40-14e8-4a10-9433-8b00fbfe900e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2a8f82d4-1d13-47d3-a7de-0fb301e68129",
  "upload_path": "/api/rider/v1/uploads/2a8f82d4-1d13-47d3-a7de-0fb301e68129",
  "expires_at": "2026-10-27T13:58:32.003379067Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/2a8f82d4-1d13-47d3-a7de-0fb301e68129` → **200**

```json
{
  "file_id": "2a8f82d4-1d13-47d3-a7de-0fb301e68129",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "4ea7e83d-b999-48e5-a1d6-7c24270cc0ca",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "2a8f82d4-1d13-47d3-a7de-0fb301e68129"
  ]
}
```

```json
{
  "id": "9dfd4047-bac4-445b-80f4-4f8dea0ad4cb",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T13:43:32.07347Z",
  "updated_at": "2026-10-27T13:43:32.07347Z",
  "messages": [
    {
      "id": "0a989b63-cd8a-462d-aaaf-ec1f6e082277",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T13:43:32.075385Z",
      "attachments": [
        {
          "file_id": "2a8f82d4-1d13-47d3-a7de-0fb301e68129",
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
  "session_id": "dc8290a8-d922-40af-98e6-7e14048e3e00",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk1MTIsImlhdCI6MTc5MzEwODYxMiwianRpIjoiYzU0ZmZiZDQtZTg3ZS00YWY3LWJiMjItNjI3MDAwM2E5MGM1Iiwic2lkIjoiZGM4MjkwYTgtZDkyMi00MGFmLTk4ZTYtN2UxNDA0OGUzZTAwIn0.gPUxse73YPbixi3drd0lkL-zUu8SF8NmZPLpZcjV-Tg",
  "access_expires_at": "2026-10-27T13:58:32.325948098Z",
  "refresh_token": "lw9LiRJtQenldg36TG5yjo0ywQDUuNeHYDj1NrpgsBI",
  "refresh_expires_at": "2026-10-28T01:43:32.325497892Z",
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
  "session_id": "3a217a65-8686-42c0-a6b7-cfd2a3e97971",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk1MTIsImlhdCI6MTc5MzEwODYxMiwianRpIjoiY2VhZmQ5NDYtZTAxZi00OWIyLWJmNWEtM2Q5ZWJjYzkxMTE4Iiwic2lkIjoiM2EyMTdhNjUtODY4Ni00MmMwLWE2YjctY2ZkMmEzZTk3OTcxIn0.wX7Fk3jyfOb3wmKOQQbgwzSouz8Ku41YIW9KxSk9DBY",
  "access_expires_at": "2026-10-27T13:58:32.55580574Z",
  "refresh_token": "Zn9H5mNDo018PuVD8UARlCJXwvIW0NSegtM42Q5EjiA",
  "refresh_expires_at": "2026-10-28T01:43:32.555444928Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/9dfd4047-bac4-445b-80f4-4f8dea0ad4cb/attachments/2a8f82d4-1d13-47d3-a7de-0fb301e68129` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "96e9ca0b-a696-4204-8b49-146227c18630",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "eb800d9a-4489-441c-bc2d-86ba0227564d",
  "upload_path": "/api/operator/v1/uploads/eb800d9a-4489-441c-bc2d-86ba0227564d",
  "expires_at": "2026-10-27T13:58:32.601666164Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/eb800d9a-4489-441c-bc2d-86ba0227564d` → **200**

```json
{
  "file_id": "eb800d9a-4489-441c-bc2d-86ba0227564d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/9dfd4047-bac4-445b-80f4-4f8dea0ad4cb` → **200**

```json
{
  "id": "9dfd4047-bac4-445b-80f4-4f8dea0ad4cb",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T13:43:32.07347Z",
  "updated_at": "2026-10-27T13:43:32.07347Z",
  "messages": [
    {
      "id": "0a989b63-cd8a-462d-aaaf-ec1f6e082277",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T13:43:32.075385Z",
      "attachments": [
        {
          "file_id": "2a8f82d4-1d13-47d3-a7de-0fb301e68129",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/9dfd4047-bac4-445b-80f4-4f8dea0ad4cb/comments` → **200**

```json
{
  "command_id": "1fee8f03-b4c4-4b0c-bcf6-0b110806e355",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "eb800d9a-4489-441c-bc2d-86ba0227564d"
  ]
}
```

```json
{
  "id": "9dfd4047-bac4-445b-80f4-4f8dea0ad4cb",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T13:43:32.07347Z",
  "updated_at": "2026-10-27T13:43:32.69697Z",
  "messages": [
    {
      "id": "0a989b63-cd8a-462d-aaaf-ec1f6e082277",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T13:43:32.075385Z",
      "attachments": [
        {
          "file_id": "2a8f82d4-1d13-47d3-a7de-0fb301e68129",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1ecff41f-66b3-4936-be67-0e4a31511b05",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "7a860fe2-017a-48e5-8409-4afb9a39940c",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T13:43:32.696665Z",
      "attachments": [
        {
          "file_id": "eb800d9a-4489-441c-bc2d-86ba0227564d",
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

`GET /api/rider/v1/support/cases/9dfd4047-bac4-445b-80f4-4f8dea0ad4cb` → **200**

```json
{
  "id": "9dfd4047-bac4-445b-80f4-4f8dea0ad4cb",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T13:43:32.07347Z",
  "updated_at": "2026-10-27T13:43:32.69697Z",
  "messages": [
    {
      "id": "0a989b63-cd8a-462d-aaaf-ec1f6e082277",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b8e6f566-4433-49d5-a5f6-2f1ead39444b",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T13:43:32.075385Z",
      "attachments": [
        {
          "file_id": "2a8f82d4-1d13-47d3-a7de-0fb301e68129",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1ecff41f-66b3-4936-be67-0e4a31511b05",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T13:43:32.696665Z",
      "attachments": [
        {
          "file_id": "eb800d9a-4489-441c-bc2d-86ba0227564d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/9dfd4047-bac4-445b-80f4-4f8dea0ad4cb/attachments/eb800d9a-4489-441c-bc2d-86ba0227564d` → **200**

Done: support case 9dfd4047-bac4-445b-80f4-4f8dea0ad4cb, rider attachment 2a8f82d4-1d13-47d3-a7de-0fb301e68129, operator attachment eb800d9a-4489-441c-bc2d-86ba0227564d.

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
  "session_id": "3f224d4b-e1fd-4da0-9a94-ca465dd25f4a",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk1MTIsImlhdCI6MTc5MzEwODYxMiwianRpIjoiN2JmYzEyNTQtZGQ0Yy00YjNkLWE1OGItYjU1NmQzODQwY2M2Iiwic2lkIjoiM2YyMjRkNGItZTFmZC00ZGEwLTlhOTQtY2E0NjVkZDI1ZjRhIn0.MeHT77t_y7cnHyR2YViB84K1tNM_tsZMKSjR9IeQklA",
  "access_expires_at": "2026-10-27T13:58:32.993937631Z",
  "refresh_token": "sAgEZuTaPCLCfCUys14FcM-P88rHDWpYL5r_pbHdhMU",
  "refresh_expires_at": "2026-10-28T01:43:32.993566875Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4287"
}
```

```json
{
  "challenge_id": "db8b5c3e-a57d-4ca3-9542-49eb6a20dd5d",
  "expires_at": "2026-10-27T13:48:33.019001356Z",
  "resend_available_at": "2026-10-27T13:43:34.019001356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "924632",
  "sent_at": "2026-10-27T13:43:33.020843335Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db8b5c3e-a57d-4ca3-9542-49eb6a20dd5d",
  "code": "924632",
  "device_ref": "sandbox-4287"
}
```

```json
{
  "session_id": "bf290219-ca5d-4613-afa6-15882295d233",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUxMywiaWF0IjoxNzkzMTA4NjEzLCJqdGkiOiIyYjg1OTQ0Zi1kOTZiLTQxZDktODY3OS1jYWE5Nzg4ZTA1MDkiLCJzaWQiOiJiZjI5MDIxOS1jYTVkLTQ2MTMtYWZhNi0xNTg4MjI5NWQyMzMifQ.Sm6Wr6WCmmG6cUV_nkGcvNq8zIe7PM1ZdNjE04pEpAY",
  "access_expires_at": "2026-10-27T13:58:33.071254441Z",
  "refresh_token": "9oqK9ly5nQ7Dx_uwnNNCVUupsxo2rX0Zx3LsE00tW8I",
  "refresh_expires_at": "2026-11-26T13:43:33.070821972Z",
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
  "command_id": "6d00ef06-10c7-4aaa-9d80-7deef0d4437b",
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
  "device_ref": "sandbox-5488"
}
```

```json
{
  "challenge_id": "eafc0524-6d56-4868-9db4-14280a8251f9",
  "expires_at": "2026-10-27T13:48:33.191276484Z",
  "resend_available_at": "2026-10-27T13:43:34.191276484Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "340114",
  "sent_at": "2026-10-27T13:43:33.193576161Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eafc0524-6d56-4868-9db4-14280a8251f9",
  "code": "340114",
  "device_ref": "sandbox-5488"
}
```

```json
{
  "session_id": "abbf6fa1-dc8c-4097-a9f5-ce82cf27d614",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTUxMywiaWF0IjoxNzkzMTA4NjEzLCJqdGkiOiJhN2UwZTdhNi1hMWRhLTQ3NTctYTNhMy0xYTBkNDc2Y2YxNmMiLCJzaWQiOiJhYmJmNmZhMS1kYzhjLTQwOTctYTlmNS1jZTgyY2YyN2Q2MTQifQ.I9KL4AiTS0SPXotEeFIALUKsSjSJBt_2xigSus9Ukgs",
  "access_expires_at": "2026-10-27T13:58:33.244694596Z",
  "refresh_token": "WMkzVJ8xPyr67Z14h_Ez1S0_pB5JJFyBzmjZzfozed8",
  "refresh_expires_at": "2026-11-26T13:43:33.24421036Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
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
  "last_heartbeat_at": "2026-10-27T13:43:31.657064Z",
  "last_location_at": "2026-10-27T13:43:31.657064Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/handover` → **200**

```json
{
  "command_id": "5c2afc78-ce02-49fd-b287-45c5812b5279",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T13:43:31.657064Z",
  "last_location_at": "2026-10-27T13:43:31.657064Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9467f961-3ece-4fb5-a031-7c2757cf6244/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:33Z",
    "sequence": 1793108613323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9467f961-3ece-4fb5-a031-7c2757cf6244",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T13:43:33.337005Z",
  "last_location_at": "2026-10-27T13:43:33.337005Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T13:43:26.197811Z",
  "last_location_at": "2026-10-27T13:43:26.197811Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/0a20a443-893a-492c-9b2e-d115e266d71a/handover` → **200**

```json
{
  "command_id": "73225294-8f2d-4109-8d1a-6a63b7b7f60a",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T13:43:26.197811Z",
  "last_location_at": "2026-10-27T13:43:26.197811Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/0a20a443-893a-492c-9b2e-d115e266d71a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:33Z",
    "sequence": 1793108613413
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T13:43:33.427945Z",
  "last_location_at": "2026-10-27T13:43:33.427945Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
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
  "session_id": "b37acdcc-32e4-47ec-af37-9b45f2789e3a",
  "subject": {
    "type": "STAFF",
    "id": "7a860fe2-017a-48e5-8409-4afb9a39940c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTg2MGZlMi0wMTdhLTQ4ZTUtODQwOS00YWZiOWEzOTk0MGMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk1MTMsImlhdCI6MTc5MzEwODYxMywianRpIjoiZTBmZGM3MzctNDBiYi00ZDg4LTk3MDItNzZmOWNmZGIzNGZlIiwic2lkIjoiYjM3YWNkY2MtMzJlNC00N2VjLWFmMzctOWI0NWYyNzg5ZTNhIn0.3Xkq8ylS0DYnbKvker9w1cRsZQX4n6T0VdbteMvkQFg",
  "access_expires_at": "2026-10-27T13:58:33.661220634Z",
  "refresh_token": "FJ1QdbhgIj-2iXO3R7N0S0Jti1nyftYyexb5bs-95Bo",
  "refresh_expires_at": "2026-10-28T01:43:33.660875386Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "97387c63-ba7a-47e9-906a-57881db37ccc",
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
  "id": "762ee920-e56c-4d13-9088-45f031038e8d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T13:48:33.694135Z",
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
  "command_id": "897338d9-b196-4483-bc62-af2a6f2dab5f",
  "quote_id": "762ee920-e56c-4d13-9088-45f031038e8d",
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
  "id": "0ceba29c-6774-41de-94a8-df4196e3dd78",
  "short_number": 9,
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-27T13:43:33.737481Z",
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
    "id": "46536f7f-a907-4af3-a799-ca8590560fa9",
    "order_id": "9e23e2a5-b764-4d4e-9ad8-68a22e2e2ffe",
    "expires_at": "2026-10-27T13:43:46.806871Z",
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
    "distance_m": 2002
  }
]
```

`POST /api/driver/v1/offers/46536f7f-a907-4af3-a799-ca8590560fa9/accept` → **200**

```json
{
  "command_id": "6ec5d1ec-6085-4c30-b270-15651b7941c4"
}
```

```json
{
  "id": "115be2a7-c467-4d96-856d-f15befb66b4e",
  "order_id": "9e23e2a5-b764-4d4e-9ad8-68a22e2e2ffe",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f8f5e346-b2ad-4178-aa95-d241e8fdc31c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f8f5e346-b2ad-4178-aa95-d241e8fdc31c",
  "order_id": "9e23e2a5-b764-4d4e-9ad8-68a22e2e2ffe",
  "assignment_id": "115be2a7-c467-4d96-856d-f15befb66b4e",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/0a20a443-893a-492c-9b2e-d115e266d71a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:43:33Z",
    "sequence": 1793108613863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0a20a443-893a-492c-9b2e-d115e266d71a",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T13:43:33.877042Z",
  "last_location_at": "2026-10-27T13:43:33.877042Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f8f5e346-b2ad-4178-aa95-d241e8fdc31c/arrive` → **200**

```json
{
  "command_id": "12fbdc4a-cdb2-4241-b4c9-448546c38e88",
  "expected_version": 0
}
```

```json
{
  "id": "f8f5e346-b2ad-4178-aa95-d241e8fdc31c",
  "order_id": "9e23e2a5-b764-4d4e-9ad8-68a22e2e2ffe",
  "assignment_id": "115be2a7-c467-4d96-856d-f15befb66b4e",
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
  "arrived_at": "2026-10-27T13:43:33.909258Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/f8f5e346-b2ad-4178-aa95-d241e8fdc31c/start` → **200**

```json
{
  "command_id": "da28a458-d346-4169-b6e3-796c26bbe525",
  "expected_version": 1
}
```

```json
{
  "id": "f8f5e346-b2ad-4178-aa95-d241e8fdc31c",
  "order_id": "9e23e2a5-b764-4d4e-9ad8-68a22e2e2ffe",
  "assignment_id": "115be2a7-c467-4d96-856d-f15befb66b4e",
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
  "arrived_at": "2026-10-27T13:43:33.909258Z",
  "started_at": "2026-10-27T13:43:33.943757Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/f8f5e346-b2ad-4178-aa95-d241e8fdc31c/complete` → **200**

```json
{
  "command_id": "34d59bd9-42a8-400a-806d-26fb243edaef",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:43:33Z",
  "cash_received": true
}
```

```json
{
  "id": "f8f5e346-b2ad-4178-aa95-d241e8fdc31c",
  "order_id": "9e23e2a5-b764-4d4e-9ad8-68a22e2e2ffe",
  "assignment_id": "115be2a7-c467-4d96-856d-f15befb66b4e",
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
  "arrived_at": "2026-10-27T13:43:33.909258Z",
  "started_at": "2026-10-27T13:43:33.943757Z",
  "completed_at": "2026-10-27T13:43:33.980243Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/0ceba29c-6774-41de-94a8-df4196e3dd78` → **200**

```json
{
  "id": "0ceba29c-6774-41de-94a8-df4196e3dd78",
  "short_number": 9,
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-27T13:43:33.737481Z",
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
