# Sandbox transcript (2026-10-28T09:51:22Z, 45e5838)

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
  "correlation_id": "0d068082-a489-44ff-89cc-ef6d4a78b4f3"
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
  "session_id": "35a8a982-c0f6-435e-a215-b55845f4a6a2",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODE5ODMsImlhdCI6MTc5MzE4MTA4MywianRpIjoiMjNlZmJkODItZGIyYS00OTBiLThhNzktZWFlNjk2ZWViNTdkIiwic2lkIjoiMzVhOGE5ODItYzBmNi00MzVlLWEyMTUtYjU1ODQ1ZjRhNmEyIn0.KT4dQ3DMsixZnXEQ3nrow3Bu9J8kTTRB8HbHDn3C9_k",
  "access_expires_at": "2026-10-28T10:06:23.50920697Z",
  "refresh_token": "4cTTcKGkcqVd_iL3I9wlM8R7cX3fCe7uZFvrtXwoXTw",
  "refresh_expires_at": "2026-10-28T21:51:23.507335406Z",
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
  "session_id": "d0f696a1-4551-4f28-beb4-e17f33c7cefc",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODE5ODQsImlhdCI6MTc5MzE4MTA4NCwianRpIjoiZjVkYjMzYTQtZTlkNy00ZmFiLTk5N2UtOTE0YzNlNDNkYzZhIiwic2lkIjoiZDBmNjk2YTEtNDU1MS00ZjI4LWJlYjQtZTE3ZjMzYzdjZWZjIn0.8DvJoiiGGNxgzw8sdzC4t5baKPqUumX0lai_3MVSv84",
  "access_expires_at": "2026-10-28T10:06:24.72888083Z",
  "refresh_token": "3Rl6aiiEft1tsGgxxLMhg-nPjOMVfs0kjBb0_U1q_I0",
  "refresh_expires_at": "2026-10-28T21:51:24.727815418Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "321c74a0-a4a1-4098-9614-1c772702165c",
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
  "id": "bbb02069-492d-4b53-8277-4081646c70cc",
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
  "created_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "created_at": "2026-10-28T09:51:24.786632Z",
  "updated_at": "2026-10-28T09:51:24.786632Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635056636",
  "device_ref": "sandbox-20306"
}
```

```json
{
  "challenge_id": "834b411b-8a26-4555-a252-406ea987e8e1",
  "expires_at": "2026-10-28T09:56:24.827811255Z",
  "resend_available_at": "2026-10-28T09:51:25.827811255Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635056636` → **200**

```json
{
  "phone": "+380635056636",
  "audience": "CLIENT",
  "code": "727339",
  "sent_at": "2026-10-28T09:51:24.834736645Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "834b411b-8a26-4555-a252-406ea987e8e1",
  "code": "727339",
  "device_ref": "sandbox-20306"
}
```

```json
{
  "session_id": "ae33a10f-aa30-471a-a831-949e0c4cd210",
  "subject": {
    "type": "CLIENT",
    "id": "c7c9466b-456f-4c7a-80f5-5c76ecfbe6fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2M5NDY2Yi00NTZmLTRjN2EtODBmNS01Yzc2ZWNmYmU2ZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgxOTg0LCJpYXQiOjE3OTMxODEwODQsImp0aSI6ImI5YjI1NzE1LTUxMDItNDQ5MS1hYWY2LWM0MWUxOTE2NGU4NCIsInNpZCI6ImFlMzNhMTBmLWFhMzAtNDcxYS1hODMxLTk0OWUwYzRjZDIxMCJ9.C85VcEYsq5GTIh3IASuc72jj0MFZF8wcAj9d_cnAoYw",
  "access_expires_at": "2026-10-28T10:06:24.908065814Z",
  "refresh_token": "b_GuDOd5SmbqjeufuvUd-lO5Y0SfZgtLxzo8c11OBtU",
  "refresh_expires_at": "2026-11-27T09:51:24.907181369Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635056636` → **200**

```json
{
  "client_id": "c7c9466b-456f-4c7a-80f5-5c76ecfbe6fb"
}
```

`POST /api/admin/v1/rider-wallets/c7c9466b-456f-4c7a-80f5-5c76ecfbe6fb/top-ups` → **201**

```json
{
  "command_id": "7a27c148-fca0-4d0c-96da-6a8e707446e5",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "c7c9466b-456f-4c7a-80f5-5c76ecfbe6fb",
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
      "id": "8202c570-1497-475e-96d6-77bb3e729063",
      "at": "2026-10-28T09:51:24.980633Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b11001a3-e4a9-407f-a6ba-a5e527566765",
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
  "id": "16bc8692-4a9d-4375-91a5-d9d685b5622e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:56:25.438828Z",
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
      "id": "bbb02069-492d-4b53-8277-4081646c70cc",
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
  "device_ref": "sandbox-8413"
}
```

```json
{
  "challenge_id": "eb4c14f5-7ec2-4b09-ae54-ade4640d5e78",
  "expires_at": "2026-10-28T09:56:25.503641958Z",
  "resend_available_at": "2026-10-28T09:51:26.503641958Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "811639",
  "sent_at": "2026-10-28T09:51:25.507096896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb4c14f5-7ec2-4b09-ae54-ade4640d5e78",
  "code": "811639",
  "device_ref": "sandbox-8413"
}
```

```json
{
  "session_id": "2eb62584-2f4d-4859-92ca-d38b3f9ee9be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MTk4NSwiaWF0IjoxNzkzMTgxMDg1LCJqdGkiOiIyMGZhNTFkZi05ZDI3LTQxZjAtOWUzNS1hOTAwOWMyZjcyMGQiLCJzaWQiOiIyZWI2MjU4NC0yZjRkLTQ4NTktOTJjYS1kMzhiM2Y5ZWU5YmUifQ.5s-M47dj6uyFgAcObJq7Ht1bTnJSBiAuMWhMsWQ7Fm0",
  "access_expires_at": "2026-10-28T10:06:25.560312427Z",
  "refresh_token": "BUecWW7l30CqBsp3Eutvlp-Y4NXQ1D3mhe7Qomm96NE",
  "refresh_expires_at": "2026-11-27T09:51:25.559388604Z",
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
  "command_id": "e977ca65-61d0-4d6e-b501-a79adf91741e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:51:25Z",
    "sequence": 1793181085619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdf4eff8-0347-432d-8da6-bab9230d5b0d",
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
  "last_heartbeat_at": "2026-10-28T09:51:25.657361Z",
  "last_location_at": "2026-10-28T09:51:25.657361Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cd73b8dc-a986-4864-9767-156d8553e6bd",
  "quote_id": "16bc8692-4a9d-4375-91a5-d9d685b5622e",
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
  "id": "309edec9-22b0-460b-88f4-f9b6d8845734",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7c9466b-456f-4c7a-80f5-5c76ecfbe6fb",
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
  "created_at": "2026-10-28T09:51:25.748864Z",
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
  "client_id": "c7c9466b-456f-4c7a-80f5-5c76ecfbe6fb",
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
      "id": "8202c570-1497-475e-96d6-77bb3e729063",
      "at": "2026-10-28T09:51:24.980633Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
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
    "id": "8e53873c-50bc-44f3-a007-a6f9a2f6c7c6",
    "order_id": "309edec9-22b0-460b-88f4-f9b6d8845734",
    "expires_at": "2026-10-28T09:51:40.761064Z",
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

`POST /api/driver/v1/offers/8e53873c-50bc-44f3-a007-a6f9a2f6c7c6/accept` → **200**

```json
{
  "command_id": "c5fe77ba-e403-4f69-969e-1480da00398e"
}
```

```json
{
  "id": "8be54e4f-7a8e-4a96-a6cf-c8ca2aabd925",
  "order_id": "309edec9-22b0-460b-88f4-f9b6d8845734",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e40bf2e9-9d9f-4dfb-9a07-8289c249056b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e40bf2e9-9d9f-4dfb-9a07-8289c249056b",
  "order_id": "309edec9-22b0-460b-88f4-f9b6d8845734",
  "assignment_id": "8be54e4f-7a8e-4a96-a6cf-c8ca2aabd925",
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

`POST /api/driver/v1/work-sessions/fdf4eff8-0347-432d-8da6-bab9230d5b0d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:51:25Z",
    "sequence": 1793181085923
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdf4eff8-0347-432d-8da6-bab9230d5b0d",
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
  "last_heartbeat_at": "2026-10-28T09:51:25.9457Z",
  "last_location_at": "2026-10-28T09:51:25.9457Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e40bf2e9-9d9f-4dfb-9a07-8289c249056b/arrive` → **200**

```json
{
  "command_id": "58f61725-b757-443b-8c95-32d89b534881",
  "expected_version": 0
}
```

```json
{
  "id": "e40bf2e9-9d9f-4dfb-9a07-8289c249056b",
  "order_id": "309edec9-22b0-460b-88f4-f9b6d8845734",
  "assignment_id": "8be54e4f-7a8e-4a96-a6cf-c8ca2aabd925",
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
  "arrived_at": "2026-10-28T09:51:25.989663Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e40bf2e9-9d9f-4dfb-9a07-8289c249056b/start` → **200**

```json
{
  "command_id": "80af2608-90fa-4e8b-8496-ada902945abc",
  "expected_version": 1
}
```

```json
{
  "id": "e40bf2e9-9d9f-4dfb-9a07-8289c249056b",
  "order_id": "309edec9-22b0-460b-88f4-f9b6d8845734",
  "assignment_id": "8be54e4f-7a8e-4a96-a6cf-c8ca2aabd925",
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
  "arrived_at": "2026-10-28T09:51:25.989663Z",
  "started_at": "2026-10-28T09:51:26.029758Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/e40bf2e9-9d9f-4dfb-9a07-8289c249056b/complete` → **200**

```json
{
  "command_id": "9746dbd9-f373-4c47-8d56-237637659cfa",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:51:26Z",
  "cash_received": true
}
```

```json
{
  "id": "e40bf2e9-9d9f-4dfb-9a07-8289c249056b",
  "order_id": "309edec9-22b0-460b-88f4-f9b6d8845734",
  "assignment_id": "8be54e4f-7a8e-4a96-a6cf-c8ca2aabd925",
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
  "arrived_at": "2026-10-28T09:51:25.989663Z",
  "started_at": "2026-10-28T09:51:26.029758Z",
  "completed_at": "2026-10-28T09:51:26.087439Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c7c9466b-456f-4c7a-80f5-5c76ecfbe6fb",
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
      "id": "d9add6ae-333f-4575-9b2e-b65cac3de9f5",
      "at": "2026-10-28T09:51:26.281386Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "309edec9-22b0-460b-88f4-f9b6d8845734"
    },
    {
      "id": "8202c570-1497-475e-96d6-77bb3e729063",
      "at": "2026-10-28T09:51:24.980633Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/bbb02069-492d-4b53-8277-4081646c70cc/archive` → **200**

```json
{
  "command_id": "e0794e4e-3660-4c5b-8dd7-3e4849f5ce0e",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "bbb02069-492d-4b53-8277-4081646c70cc",
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
  "created_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "created_at": "2026-10-28T09:51:24.786632Z",
  "updated_at": "2026-10-28T09:51:29.169706Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdf4eff8-0347-432d-8da6-bab9230d5b0d",
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
  "last_heartbeat_at": "2026-10-28T09:51:25.9457Z",
  "last_location_at": "2026-10-28T09:51:25.9457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fdf4eff8-0347-432d-8da6-bab9230d5b0d/close` → **200**

```json
{
  "command_id": "a0ce90bb-5976-4a7f-9d6d-abf664f83fac",
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

Done: order 309edec9-22b0-460b-88f4-f9b6d8845734.

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
  "session_id": "084c7c8a-e4e6-4170-894a-5444604f5b07",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODE5ODksImlhdCI6MTc5MzE4MTA4OSwianRpIjoiOTMyYTNhZWYtOWI5MC00OWY3LTk5MWEtNjVkZDVhODhjZmU1Iiwic2lkIjoiMDg0YzdjOGEtZTRlNi00MTcwLTg5NGEtNTQ0NDYwNGY1YjA3In0.gwd88xDECE-qVS59Aw0MkPFX71bxDSVFHNjIr13iuM0",
  "access_expires_at": "2026-10-28T10:06:29.544807246Z",
  "refresh_token": "A0Kt05ZS6nyZmd69dYUAIhBBJo023KiXp4UCWXphtnU",
  "refresh_expires_at": "2026-10-28T21:51:29.543956922Z",
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
  "command_id": "0dfb071f-d3b3-4456-b57b-59b2204126b1",
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
  "session_id": "1b64852c-dc78-4bdc-bbd8-b999b2edeb97",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODE5ODksImlhdCI6MTc5MzE4MTA4OSwianRpIjoiMDBmM2FjN2QtZjdiNi00NDc3LWFjN2EtMTUwMDIwN2E1MzdjIiwic2lkIjoiMWI2NDg1MmMtZGM3OC00YmRjLWJiZDgtYjk5OWIyZWRlYjk3In0._errN8y1goxY4-vPUBknZ1FGhrQzZcBG0LscUWDpqhg",
  "access_expires_at": "2026-10-28T10:06:29.905158677Z",
  "refresh_token": "nCfHXcUanbR_GY4W4uE0rtLmSUIhUx4qf058aucQNx4",
  "refresh_expires_at": "2026-10-28T21:51:29.904545823Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.341120821",
    "linkedid": "1730052700.341120821",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672474508"
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
    "id": "1730052700.341120821",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "ec061b2e-047e-410d-be6d-eeddee23b2e7",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672474508",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:51:29.932699Z",
      "answered_at": null,
      "ended_at": "2026-10-28T09:51:29.955644Z",
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
    "id": "1730052600.280549597",
    "linkedid": "1730052600.280549597",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672474508"
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
      "id": "daab3239-df9b-4a08-94bc-8420da5e2f58",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672474508",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:51:30.014985Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/daab3239-df9b-4a08-94bc-8420da5e2f58/answer` → **200**

```json
{
  "command_id": "15e9677c-23f1-4cda-984b-ce6f4c88b2e2"
}
```

```json
{
  "id": "daab3239-df9b-4a08-94bc-8420da5e2f58",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672474508",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "order_ids": [],
  "started_at": "2026-10-28T09:51:30.014985Z",
  "answered_at": "2026-10-28T09:51:30.074579Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.280549597",
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
    "id": "1730052600.280549597",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "daab3239-df9b-4a08-94bc-8420da5e2f58",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672474508",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [],
      "started_at": "2026-10-28T09:51:30.014985Z",
      "answered_at": "2026-10-28T09:51:30.074579Z",
      "ended_at": "2026-10-28T09:51:30.122189Z",
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
      "id": "daab3239-df9b-4a08-94bc-8420da5e2f58",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672474508",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [],
      "started_at": "2026-10-28T09:51:30.014985Z",
      "answered_at": "2026-10-28T09:51:30.074579Z",
      "ended_at": "2026-10-28T09:51:30.122189Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:51:31.183505Z"
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
      "id": "daab3239-df9b-4a08-94bc-8420da5e2f58",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672474508",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [],
      "started_at": "2026-10-28T09:51:30.014985Z",
      "answered_at": "2026-10-28T09:51:30.074579Z",
      "ended_at": "2026-10-28T09:51:30.122189Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:51:31.183505Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/daab3239-df9b-4a08-94bc-8420da5e2f58/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/daab3239-df9b-4a08-94bc-8420da5e2f58/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=daab3239-df9b-4a08-94bc-8420da5e2f58` → **200**

```json
{
  "changes": [
    {
      "id": "d5067360-dcc8-455a-8fb9-bd051f9dd44b",
      "occurred_at": "2026-10-28T09:51:32.368862Z",
      "actor_type": "STAFF",
      "actor_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "daab3239-df9b-4a08-94bc-8420da5e2f58",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"2b812dbc-29fa-45d7-9da2-02ba1d2333d3\", \"order_ids\": []}",
      "correlation_id": "75bf46f8-dd52-4864-ad21-c0cbec55b4f2"
    },
    {
      "id": "267ac920-dd44-4933-84e8-5110ab855b51",
      "occurred_at": "2026-10-28T09:51:32.338714Z",
      "actor_type": "STAFF",
      "actor_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "daab3239-df9b-4a08-94bc-8420da5e2f58",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"2b812dbc-29fa-45d7-9da2-02ba1d2333d3\", \"order_ids\": []}",
      "correlation_id": "ce2396ae-71bf-4245-91a5-9452a0b30a15"
    }
  ]
}
```

Done: call daab3239-df9b-4a08-94bc-8420da5e2f58 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633894307",
  "device_ref": "sandbox-15560"
}
```

```json
{
  "challenge_id": "89fc6b14-f52c-4b64-866a-f6dacc42dc61",
  "expires_at": "2026-10-28T09:56:32.434622153Z",
  "resend_available_at": "2026-10-28T09:51:33.434622153Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633894307` → **200**

```json
{
  "phone": "+380633894307",
  "audience": "CLIENT",
  "code": "646929",
  "sent_at": "2026-10-28T09:51:32.437554139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89fc6b14-f52c-4b64-866a-f6dacc42dc61",
  "code": "646929",
  "device_ref": "sandbox-15560"
}
```

```json
{
  "session_id": "26f19adb-f487-4271-a024-46401991c232",
  "subject": {
    "type": "CLIENT",
    "id": "2ebf0fbd-bb75-4ee8-b2eb-4523c1af0a29"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWJmMGZiZC1iYjc1LTRlZTgtYjJlYi00NTIzYzFhZjBhMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgxOTkyLCJpYXQiOjE3OTMxODEwOTIsImp0aSI6IjkzZGQ0NDU2LWUyODctNGE0Yi04MjViLTdjY2FjOWNiM2Y1NSIsInNpZCI6IjI2ZjE5YWRiLWY0ODctNDI3MS1hMDI0LTQ2NDAxOTkxYzIzMiJ9.LeElOVZHfVtwIcuhdKlKk2Xz0XJuDGlPQh_VFl6mzTM",
  "access_expires_at": "2026-10-28T10:06:32.490025747Z",
  "refresh_token": "n493_S1qj3_hzfqjtuaw5DKcUMlXkj1szTSHsB0Nm_M",
  "refresh_expires_at": "2026-11-27T09:51:32.489258946Z",
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
  "device_ref": "sandbox-9277"
}
```

```json
{
  "challenge_id": "ac7d3194-b544-4462-a478-b2167965e210",
  "expires_at": "2026-10-28T09:56:32.544652876Z",
  "resend_available_at": "2026-10-28T09:51:33.544652876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "880015",
  "sent_at": "2026-10-28T09:51:32.54737338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac7d3194-b544-4462-a478-b2167965e210",
  "code": "880015",
  "device_ref": "sandbox-9277"
}
```

```json
{
  "session_id": "ceb13062-788d-48ad-ab0f-27b9779b95e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MTk5MiwiaWF0IjoxNzkzMTgxMDkyLCJqdGkiOiI3YjczYTYwOC04NDZlLTQ0NWQtOThiMy1kNGI5NjUzYmVhYzgiLCJzaWQiOiJjZWIxMzA2Mi03ODhkLTQ4YWQtYWIwZi0yN2I5Nzc5Yjk1ZTUifQ.hBjabeoMcNuisurSfPhvXhxnUG1OsFnGRK6JcCNt5dg",
  "access_expires_at": "2026-10-28T10:06:32.600150239Z",
  "refresh_token": "rgB5eGSNVKtecDQS0e0IEJNQh0OVu6BvfPxkyKwMZ8Y",
  "refresh_expires_at": "2026-11-27T09:51:32.599608319Z",
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
  "session_id": "fdb7695b-dab1-48b7-84d6-5c7a68867af8",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODE5OTIsImlhdCI6MTc5MzE4MTA5MiwianRpIjoiOGM3NDMzMTgtN2UwMy00ODJjLWJlYTctYzYxYWQyMDJiNjFhIiwic2lkIjoiZmRiNzY5NWItZGFiMS00OGI3LTg0ZDYtNWM3YTY4ODY3YWY4In0.1V5xGB9zl1GGBis4NBu6ilsawX5f0gSKB6gJ25VfI_g",
  "access_expires_at": "2026-10-28T10:06:32.907182525Z",
  "refresh_token": "FUMTYoYM-YNU5pGUpLO87TtzJVJVI96PVfCqBC0BOjU",
  "refresh_expires_at": "2026-10-28T21:51:32.906605984Z",
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
  "session_id": "14f0da05-5730-41e6-b631-513377cf5dfb",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODE5OTMsImlhdCI6MTc5MzE4MTA5MywianRpIjoiZWFhMTk4ODMtZWQ1NC00NTQwLTg2MWItNjkwYTY4OGQ3OGQ0Iiwic2lkIjoiMTRmMGRhMDUtNTczMC00MWU2LWI2MzEtNTEzMzc3Y2Y1ZGZiIn0._IcZwr1uOl1jNCjgejYEUqpF7E4wt9z81SIhn4SY_Vg",
  "access_expires_at": "2026-10-28T10:06:33.192705145Z",
  "refresh_token": "2Mmzaow-H3HWfPbC3Ilt5QpHvK-mzoZJ-1we04DY5uk",
  "refresh_expires_at": "2026-10-28T21:51:33.192232437Z",
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
  "command_id": "e34df388-04d0-4fdb-a89d-fb7734b377da",
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
  "id": "8e98d94a-0db1-4db2-b295-698174d2dcb9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:56:33.256606Z",
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
  "command_id": "5f20acad-b482-44ba-849a-f1c426c6f308",
  "quote_id": "8e98d94a-0db1-4db2-b295-698174d2dcb9",
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
  "id": "94060b55-af98-42b1-84e4-eb8954bcddd1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2ebf0fbd-bb75-4ee8-b2eb-4523c1af0a29",
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
  "created_at": "2026-10-28T09:51:33.316825Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/94060b55-af98-42b1-84e4-eb8954bcddd1` → **200**

```json
{
  "id": "94060b55-af98-42b1-84e4-eb8954bcddd1",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2ebf0fbd-bb75-4ee8-b2eb-4523c1af0a29",
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
  "created_at": "2026-10-28T09:51:33.316825Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/94060b55-af98-42b1-84e4-eb8954bcddd1/cancel` → **200**

```json
{
  "command_id": "606b02d8-663c-49fd-ba51-49365df37862",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "94060b55-af98-42b1-84e4-eb8954bcddd1",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2ebf0fbd-bb75-4ee8-b2eb-4523c1af0a29",
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
  "created_at": "2026-10-28T09:51:33.316825Z",
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
  "command_id": "5b51f4e1-1d8e-4b05-92f9-9f066f8efba6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:51:33Z",
    "sequence": 1793181093525
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "84646385-76ef-4b4b-8b90-546737de6a41",
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
  "last_heartbeat_at": "2026-10-28T09:51:33.545035Z",
  "last_location_at": "2026-10-28T09:51:33.545035Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21419"
}
```

```json
{
  "challenge_id": "d6af920e-a370-4009-bc93-ac3d289687d2",
  "expires_at": "2026-10-28T09:56:33.612685749Z",
  "resend_available_at": "2026-10-28T09:51:34.612685749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "477069",
  "sent_at": "2026-10-28T09:51:33.616798668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6af920e-a370-4009-bc93-ac3d289687d2",
  "code": "477069",
  "device_ref": "sandbox-21419"
}
```

```json
{
  "session_id": "65e660dd-a269-4726-bc60-a5c0ebeb2631",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MTk5MywiaWF0IjoxNzkzMTgxMDkzLCJqdGkiOiJiYmEwMDMyMC0yNTBiLTQ0NzYtOGM5My03ZmNiNTI5OGYyOGQiLCJzaWQiOiI2NWU2NjBkZC1hMjY5LTQ3MjYtYmM2MC1hNWMwZWJlYjI2MzEifQ.njOzglp64hg1dLMD7giQF99HnoGnnXW5iOBK2BDRf4o",
  "access_expires_at": "2026-10-28T10:06:33.680681622Z",
  "refresh_token": "-mcV5unjQPvtk3fzaXW96a0oeIsA8aqOQLqXqOrKNt4",
  "refresh_expires_at": "2026-11-27T09:51:33.680153272Z",
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
  "command_id": "22e49599-624a-46fd-a983-d5e3c8b90e98",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:51:33Z",
    "sequence": 1793181093731
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f2856fa-3480-4bd7-8d43-e2d0e64a51c2",
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
  "last_heartbeat_at": "2026-10-28T09:51:33.751022Z",
  "last_location_at": "2026-10-28T09:51:33.751022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "25bb8d23-5888-4a06-b973-b5c82bcb5b46",
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
  "id": "8525f605-6b1c-4323-baf5-f1550ad581ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:56:33.790814Z",
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
  "command_id": "e78bd307-8107-4ca9-bb09-66c565a9f4c1",
  "quote_id": "8525f605-6b1c-4323-baf5-f1550ad581ed",
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
  "id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2ebf0fbd-bb75-4ee8-b2eb-4523c1af0a29",
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
  "created_at": "2026-10-28T09:51:33.828178Z",
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
    "id": "01fd4824-cdbd-49b5-8075-515759d86e63",
    "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
    "expires_at": "2026-10-28T09:51:48.831899Z",
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

`POST /api/driver/v1/offers/01fd4824-cdbd-49b5-8075-515759d86e63/accept` → **200**

```json
{
  "command_id": "db3ba14a-dc5e-483d-8cdd-cf94d4fde2f9"
}
```

```json
{
  "id": "b8bf4efd-677f-4925-8902-7f50f8b02814",
  "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e900ff7a-6db0-4495-8cf9-939898e53d17",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e900ff7a-6db0-4495-8cf9-939898e53d17",
  "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
  "assignment_id": "b8bf4efd-677f-4925-8902-7f50f8b02814",
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

`POST /api/driver/v1/trips/e900ff7a-6db0-4495-8cf9-939898e53d17/cancel` → **200**

```json
{
  "command_id": "f0ba4c0b-a365-4d26-86b9-10b1a9c1285c",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "e900ff7a-6db0-4495-8cf9-939898e53d17",
  "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
  "assignment_id": "b8bf4efd-677f-4925-8902-7f50f8b02814",
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

`GET /api/rider/v1/orders/5ebaecd9-8555-4201-b4e8-1c6c622efd2b` → **200**

```json
{
  "id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2ebf0fbd-bb75-4ee8-b2eb-4523c1af0a29",
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
    "id": "b8bf4efd-677f-4925-8902-7f50f8b02814",
    "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e900ff7a-6db0-4495-8cf9-939898e53d17",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:51:33.828178Z",
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
    "id": "23062f2f-0d3c-48bc-ac38-b6fa01ba77e3",
    "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
    "expires_at": "2026-10-28T09:51:48.964781Z",
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

`POST /api/driver/v1/offers/23062f2f-0d3c-48bc-ac38-b6fa01ba77e3/accept` → **200**

```json
{
  "command_id": "4faada29-174c-48d5-bb03-19c5e10a85b6"
}
```

```json
{
  "id": "347a9322-a6de-489a-b51e-4f1e55419c09",
  "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e14e7a7d-5571-4212-b2cc-69179ae2faf7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e14e7a7d-5571-4212-b2cc-69179ae2faf7",
  "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
  "assignment_id": "347a9322-a6de-489a-b51e-4f1e55419c09",
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

`POST /api/driver/v1/trips/e14e7a7d-5571-4212-b2cc-69179ae2faf7/cancel` → **200**

```json
{
  "command_id": "85958c5b-a63a-4c15-a17f-182a312bd110",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "e14e7a7d-5571-4212-b2cc-69179ae2faf7",
  "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
  "assignment_id": "347a9322-a6de-489a-b51e-4f1e55419c09",
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
    "id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:51:33.828178Z",
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
    "id": "94060b55-af98-42b1-84e4-eb8954bcddd1",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:51:33.316825Z",
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

`GET /api/operator/v1/orders/5ebaecd9-8555-4201-b4e8-1c6c622efd2b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:51:33.828826Z",
      "actor": {
        "type": "CLIENT",
        "id": "2ebf0fbd-bb75-4ee8-b2eb-4523c1af0a29",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
        "quote_id": "8525f605-6b1c-4323-baf5-f1550ad581ed",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "f7c74d84-10fa-4f99-a103-ede7036db61d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:51:33.83086Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
        "attempt_id": "666e9620-9905-4a19-b73a-85b603653d1f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f7c74d84-10fa-4f99-a103-ede7036db61d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:51:33.837264Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "01fd4824-cdbd-49b5-8075-515759d86e63",
        "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "f7c74d84-10fa-4f99-a103-ede7036db61d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:51:33.89696Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "01fd4824-cdbd-49b5-8075-515759d86e63",
        "order_id": "5ebaecd9-8555-4201-b4e8-1c6c622efd2b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "b8bf4efd-677f-4925-8902-7f50f8b02814"
      },
      "correlation_id": "0419dcdc-3466-44bc-940f-445460e3d01e"
```

Done: orders 94060b55-af98-42b1-84e4-eb8954bcddd1, 5ebaecd9-8555-4201-b4e8-1c6c622efd2b.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730433191",
  "device_ref": "sandbox-26268"
}
```

```json
{
  "challenge_id": "fa898231-8885-4213-bc8c-9c18a93dfe49",
  "expires_at": "2026-10-28T09:56:34.222930742Z",
  "resend_available_at": "2026-10-28T09:51:35.222930742Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730433191` → **200**

```json
{
  "phone": "+380730433191",
  "audience": "CLIENT",
  "code": "868143",
  "sent_at": "2026-10-28T09:51:34.257459112Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa898231-8885-4213-bc8c-9c18a93dfe49",
  "code": "868143",
  "device_ref": "sandbox-26268"
}
```

```json
{
  "session_id": "a1faee0f-f3a6-4fce-a2ed-dd0e4bd142ba",
  "subject": {
    "type": "CLIENT",
    "id": "da1a11b1-cc99-444d-b829-3e9cdd52f2bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTFhMTFiMS1jYzk5LTQ0NGQtYjgyOS0zZTljZGQ1MmYyYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgxOTk0LCJpYXQiOjE3OTMxODEwOTQsImp0aSI6IjQ4OTYwMTdiLTU3NTEtNGNjOC1iMTZiLWU4ZDRjYzA1MWU4ZSIsInNpZCI6ImExZmFlZTBmLWYzYTYtNGZjZS1hMmVkLWRkMGU0YmQxNDJiYSJ9.z3CISjzZ5BNI0TBfBwmSH3xuAr7VYLBy93h7Ag1Qbi4",
  "access_expires_at": "2026-10-28T10:06:34.318519217Z",
  "refresh_token": "OgUs5vqgbfN_qE31oxheMtAI4nP-JT1w2_chZ9iIo4s",
  "refresh_expires_at": "2026-11-27T09:51:34.317964208Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e1086571-37a9-4632-890e-7247f0482c49",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e1603d16-3589-4c9e-81c2-aa39ef4b5c1e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e1603d16-3589-4c9e-81c2-aa39ef4b5c1e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8248f39ea0760bcb889a31c066fe7727",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e1603d16-3589-4c9e-81c2-aa39ef4b5c1e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730433191"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e1603d16-3589-4c9e-81c2-aa39ef4b5c1e",
  "expires_at": "2026-10-28T10:21:34.35328Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e1603d16-3589-4c9e-81c2-aa39ef4b5c1e` → **200**

```json
{
  "id": "e1603d16-3589-4c9e-81c2-aa39ef4b5c1e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:21:34.35328Z",
  "card": {
    "id": "815befc5-64c4-4f11-b96e-e487155bc617",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6864",
    "card_type": "Visa",
    "created_at": "2026-10-28T09:51:34.429832Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "815befc5-64c4-4f11-b96e-e487155bc617",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6864",
      "card_type": "Visa",
      "created_at": "2026-10-28T09:51:34.429832Z"
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
  "device_ref": "sandbox-9010"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "2a1becf0-d460-48d4-aa08-3453dadba4a6",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9010"
}
```

```json
{
  "challenge_id": "09c255d0-de7c-4612-ab57-dc2bf0c471c3",
  "expires_at": "2026-10-28T09:56:35.562559393Z",
  "resend_available_at": "2026-10-28T09:51:36.562559393Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "656245",
  "sent_at": "2026-10-28T09:51:35.565274289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09c255d0-de7c-4612-ab57-dc2bf0c471c3",
  "code": "656245",
  "device_ref": "sandbox-9010"
}
```

```json
{
  "session_id": "c01c7369-d4cd-447b-b345-f391e36378ab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MTk5NSwiaWF0IjoxNzkzMTgxMDk1LCJqdGkiOiI2ZGEwYzViOC1jZmFmLTQzYzMtOWQwMi03ZGNkYTVmNDA5ODIiLCJzaWQiOiJjMDFjNzM2OS1kNGNkLTQ0N2ItYjM0NS1mMzkxZTM2Mzc4YWIifQ.3wGLulnAUjyUUHAOCkK20CNE7crwAdWd27pCrdsC2Ks",
  "access_expires_at": "2026-10-28T10:06:35.61779889Z",
  "refresh_token": "4aThYj38In9oazeUPk4gyidB91jflD26fjfDwpyYX8c",
  "refresh_expires_at": "2026-11-27T09:51:35.617186607Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f2856fa-3480-4bd7-8d43-e2d0e64a51c2",
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
  "last_heartbeat_at": "2026-10-28T09:51:33.751022Z",
  "last_location_at": "2026-10-28T09:51:33.751022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7f2856fa-3480-4bd7-8d43-e2d0e64a51c2/handover` → **200**

```json
{
  "command_id": "9bfde874-937e-469c-afbc-1ff02e528f89",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f2856fa-3480-4bd7-8d43-e2d0e64a51c2",
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
  "last_heartbeat_at": "2026-10-28T09:51:33.751022Z",
  "last_location_at": "2026-10-28T09:51:33.751022Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7f2856fa-3480-4bd7-8d43-e2d0e64a51c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:51:35Z",
    "sequence": 1793181095702
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f2856fa-3480-4bd7-8d43-e2d0e64a51c2",
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
  "last_heartbeat_at": "2026-10-28T09:51:35.721317Z",
  "last_location_at": "2026-10-28T09:51:35.721317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "931e3a1e-e84e-4fd2-8a04-5d6022acae56",
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
  "id": "bf6f5e75-3ff1-4fd0-9beb-4bff254a80f7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:56:35.757851Z",
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
  "command_id": "7c4cf849-83b4-4b42-b4b9-25da42de6b94",
  "quote_id": "bf6f5e75-3ff1-4fd0-9beb-4bff254a80f7",
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
  "id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "da1a11b1-cc99-444d-b829-3e9cdd52f2bf",
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
  "created_at": "2026-10-28T09:51:35.795085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed` → **200**

```json
{
  "id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "da1a11b1-cc99-444d-b829-3e9cdd52f2bf",
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
  "created_at": "2026-10-28T09:51:35.795085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed` → **200**

```json
{
  "id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "da1a11b1-cc99-444d-b829-3e9cdd52f2bf",
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
  "created_at": "2026-10-28T09:51:35.795085Z",
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
    "id": "a1378bde-0ac9-4f69-8e7d-4c1d387289bc",
    "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
    "expires_at": "2026-10-28T09:51:51.529052Z",
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

`POST /api/driver/v1/offers/a1378bde-0ac9-4f69-8e7d-4c1d387289bc/accept` → **200**

```json
{
  "command_id": "af118048-e6c2-4eea-a728-0922f754d059"
}
```

```json
{
  "id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "assignment_id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
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

`POST /api/driver/v1/work-sessions/7f2856fa-3480-4bd7-8d43-e2d0e64a51c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:51:36Z",
    "sequence": 1793181096953
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f2856fa-3480-4bd7-8d43-e2d0e64a51c2",
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
  "last_heartbeat_at": "2026-10-28T09:51:36.970985Z",
  "last_location_at": "2026-10-28T09:51:36.970985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9c52804b-0685-4931-97f7-e5a8376d3e9a/arrive` → **200**

```json
{
  "command_id": "51996fc1-1a88-46ae-a6b5-88aa153da92f",
  "expected_version": 0
}
```

```json
{
  "id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "assignment_id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
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
  "arrived_at": "2026-10-28T09:51:37.004012Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c52804b-0685-4931-97f7-e5a8376d3e9a/start` → **200**

```json
{
  "command_id": "99998792-1b53-47a4-8f45-f08de3ab1d15",
  "expected_version": 1
}
```

```json
{
  "id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "assignment_id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
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
  "arrived_at": "2026-10-28T09:51:37.004012Z",
  "started_at": "2026-10-28T09:51:37.042737Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c52804b-0685-4931-97f7-e5a8376d3e9a/complete` → **200**

```json
{
  "command_id": "682f3e8f-8d6e-411e-bbf2-90db95e1e48b",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:51:37Z"
}
```

```json
{
  "id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "assignment_id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
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
  "arrived_at": "2026-10-28T09:51:37.004012Z",
  "started_at": "2026-10-28T09:51:37.042737Z",
  "completed_at": "2026-10-28T09:51:37.084503Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed` → **200**

```json
{
  "id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "da1a11b1-cc99-444d-b829-3e9cdd52f2bf",
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
    "id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
    "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:51:35.795085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed` → **200**

```json
{
  "id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "da1a11b1-cc99-444d-b829-3e9cdd52f2bf",
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
    "id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
    "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:51:35.795085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed` → **200**

```json
{
  "id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "da1a11b1-cc99-444d-b829-3e9cdd52f2bf",
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
    "id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
    "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:51:35.795085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed` → **200**

```json
{
  "id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "da1a11b1-cc99-444d-b829-3e9cdd52f2bf",
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
    "id": "2f9cb6a7-d97c-4d32-bfdc-560cedf0f55b",
    "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c52804b-0685-4931-97f7-e5a8376d3e9a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:51:35.795085Z",
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
      "id": "1a10ee4f-7ebf-41c1-b011-8b6485fc2f3d",
      "at": "2026-10-28T09:51:37.556452Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed/tip` → **200**

```json
{
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
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
  "available_until": "2026-10-29T09:51:37.084503Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed/tip` → **201**

```json
{
  "command_id": "e9090ede-6030-4a3f-9f65-7dce430ef6dd",
  "amount_minor": 2500
}
```

```json
{
  "id": "e8c3d794-1cfb-4da1-8265-0e1649f3c30b",
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T09:51:40.391177Z"
}
```

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed/tip` → **200**

```json
{
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
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
  "available_until": "2026-10-29T09:51:37.084503Z",
  "open": false,
  "tip": {
    "id": "e8c3d794-1cfb-4da1-8265-0e1649f3c30b",
    "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T09:51:40.391177Z"
  }
}
```

`GET /api/rider/v1/orders/7687c306-eb94-4cd5-a032-4ae01fd95aed/tip` → **200**

```json
{
  "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
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
  "available_until": "2026-10-29T09:51:37.084503Z",
  "open": false,
  "tip": {
    "id": "e8c3d794-1cfb-4da1-8265-0e1649f3c30b",
    "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T09:51:40.391177Z"
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
      "id": "1a10ee4f-7ebf-41c1-b011-8b6485fc2f3d",
      "at": "2026-10-28T09:51:37.556452Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
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
      "id": "f2d031d1-8192-4738-9dc2-2fa2e36fdbf8",
      "at": "2026-10-28T09:51:41.625268Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
      "counterpart_id": null
    },
    {
      "id": "1a10ee4f-7ebf-41c1-b011-8b6485fc2f3d",
      "at": "2026-10-28T09:51:37.556452Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7687c306-eb94-4cd5-a032-4ae01fd95aed",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f2856fa-3480-4bd7-8d43-e2d0e64a51c2",
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
  "last_heartbeat_at": "2026-10-28T09:51:36.970985Z",
  "last_location_at": "2026-10-28T09:51:36.970985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7f2856fa-3480-4bd7-8d43-e2d0e64a51c2/close` → **200**

```json
{
  "command_id": "f8cbed3c-1936-4450-8201-617ad94b199f",
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

Done: card order 7687c306-eb94-4cd5-a032-4ae01fd95aed.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730688003",
  "device_ref": "sandbox-11386"
}
```

```json
{
  "challenge_id": "fb5cf1f8-f6ce-4fc5-9435-fbe1808b1210",
  "expires_at": "2026-10-28T09:56:42.592603338Z",
  "resend_available_at": "2026-10-28T09:51:43.592603338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730688003` → **200**

```json
{
  "phone": "+380730688003",
  "audience": "CLIENT",
  "code": "767074",
  "sent_at": "2026-10-28T09:51:42.594880186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb5cf1f8-f6ce-4fc5-9435-fbe1808b1210",
  "code": "767074",
  "device_ref": "sandbox-11386"
}
```

```json
{
  "session_id": "be491017-4c0a-4de1-8a44-d030c1edc60c",
  "subject": {
    "type": "CLIENT",
    "id": "3347ddba-f4c5-422d-9334-995834f0b6dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzQ3ZGRiYS1mNGM1LTQyMmQtOTMzNC05OTU4MzRmMGI2ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDAyLCJpYXQiOjE3OTMxODExMDIsImp0aSI6IjY3YjBiN2IyLThhZmMtNDEwMy1iMTEwLTA4YmVjZWIxZDAxNiIsInNpZCI6ImJlNDkxMDE3LTRjMGEtNGRlMS04YTQ0LWQwMzBjMWVkYzYwYyJ9.kB7YtVRVw5-prpLbe7zIKnPNOBANNuWW6Qk0r-ngU3A",
  "access_expires_at": "2026-10-28T10:06:42.648110588Z",
  "refresh_token": "ZKdH5cXHsbCyb-SdFXl1ozab40f_SdFeLufDWIMQkCI",
  "refresh_expires_at": "2026-11-27T09:51:42.647663038Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "9c125bdc-da26-4c64-9efe-a6020b322b7d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "9c634468-37ff-470a-8067-c6540af1ae52",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9c634468-37ff-470a-8067-c6540af1ae52",
    "orderDate": "1793181102",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "0f28306431c42b5862277395b64487b7",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9c634468-37ff-470a-8067-c6540af1ae52",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730688003"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9c634468-37ff-470a-8067-c6540af1ae52",
  "created_at": "2026-10-28T09:51:42.680987Z",
  "expires_at": "2026-10-28T10:21:42.680987Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/9c634468-37ff-470a-8067-c6540af1ae52` → **200**

```json
{
  "id": "9c634468-37ff-470a-8067-c6540af1ae52",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:51:42.680987Z",
  "expires_at": "2026-10-28T10:21:42.680987Z",
  "completed_at": "2026-10-28T09:51:42.716973Z",
  "masked_pan": "41****6972",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3347ddba-f4c5-422d-9334-995834f0b6dd",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3347ddba-f4c5-422d-9334-995834f0b6dd",
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
      "id": "93f21a83-3818-4ef9-8f58-32eb2fdd928b",
      "at": "2026-10-28T09:51:43.643736Z",
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
  "client_id": "3347ddba-f4c5-422d-9334-995834f0b6dd",
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
      "id": "93f21a83-3818-4ef9-8f58-32eb2fdd928b",
      "at": "2026-10-28T09:51:43.643736Z",
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
  "device_ref": "sandbox-25605"
}
```

```json
{
  "challenge_id": "c2641ad7-8391-453d-9d02-7a564f98d6ca",
  "expires_at": "2026-10-28T09:56:43.840593248Z",
  "resend_available_at": "2026-10-28T09:51:44.840593248Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "761086",
  "sent_at": "2026-10-28T09:51:43.842833753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2641ad7-8391-453d-9d02-7a564f98d6ca",
  "code": "761086",
  "device_ref": "sandbox-25605"
}
```

```json
{
  "session_id": "31cf780e-2bd6-4469-8342-4243dedd9c9e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjAwMywiaWF0IjoxNzkzMTgxMTAzLCJqdGkiOiJjNzc3ZmJmNi02NjU4LTRlMzYtOWJmOS0xZjZiNjhiODRiZjUiLCJzaWQiOiIzMWNmNzgwZS0yYmQ2LTQ0NjktODM0Mi00MjQzZGVkZDljOWUifQ.mgWNC8KlOyV4Mp_Mj0WZ5yE3CVjO4qaW2WbE34KZGkQ",
  "access_expires_at": "2026-10-28T10:06:43.895979789Z",
  "refresh_token": "bxmb9ul2h4DTwWbFS0SwSftoUJPpG8xXdFUTwipJao8",
  "refresh_expires_at": "2026-11-27T09:51:43.89534999Z",
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
  "command_id": "28363902-69b4-4699-94bc-8ee55efb45f8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "d26e578f-c75e-4bf9-aa3c-a72a46dc8e6f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d26e578f-c75e-4bf9-aa3c-a72a46dc8e6f",
    "orderDate": "1793181103",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "a1994c7f7489c1f75378d03f747c307f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d26e578f-c75e-4bf9-aa3c-a72a46dc8e6f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d26e578f-c75e-4bf9-aa3c-a72a46dc8e6f",
  "created_at": "2026-10-28T09:51:43.949558Z",
  "expires_at": "2026-10-28T10:21:43.949558Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/d26e578f-c75e-4bf9-aa3c-a72a46dc8e6f` → **200**

```json
{
  "id": "d26e578f-c75e-4bf9-aa3c-a72a46dc8e6f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:51:43.949558Z",
  "expires_at": "2026-10-28T10:21:43.949558Z",
  "completed_at": "2026-10-28T09:51:43.981341Z",
  "masked_pan": "41****4042",
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
      "id": "276c8f8d-892a-431f-a211-a9608ba84ee3",
      "at": "2026-10-28T09:51:44.648443Z",
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
  "command_id": "ce02c9ea-b67d-4b6c-ab1c-de78629f2f33",
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
  "correlation_id": "f064b8ec-b44b-4495-966f-49ab1a8044e0"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673914950",
  "device_ref": "sandbox-32425"
}
```

```json
{
  "challenge_id": "69655a83-35af-4ac1-8689-2f421531cfcd",
  "expires_at": "2026-10-28T09:56:45.115792049Z",
  "resend_available_at": "2026-10-28T09:51:46.115792049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673914950` → **200**

```json
{
  "phone": "+380673914950",
  "audience": "CLIENT",
  "code": "919484",
  "sent_at": "2026-10-28T09:51:45.118133854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69655a83-35af-4ac1-8689-2f421531cfcd",
  "code": "919484",
  "device_ref": "sandbox-32425"
}
```

```json
{
  "session_id": "d564e45b-ea1f-4d07-9c2c-fc0e10e4422e",
  "subject": {
    "type": "CLIENT",
    "id": "c07ff456-865d-466b-857c-93fd2ae70624"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDdmZjQ1Ni04NjVkLTQ2NmItODU3Yy05M2ZkMmFlNzA2MjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDA1LCJpYXQiOjE3OTMxODExMDUsImp0aSI6IjY3NTQxMzRjLTI2MjktNDUxNy05YzAwLWU3N2FmMzZlYzI2ZiIsInNpZCI6ImQ1NjRlNDViLWVhMWYtNGQwNy05YzJjLWZjMGUxMGU0NDIyZSJ9.mJ-boYMTFIcyTpiO4ovqzQGgQbw9ZbYI3fEg8kvN-kQ",
  "access_expires_at": "2026-10-28T10:06:45.170516094Z",
  "refresh_token": "CB2HZGLJB98R8ireFtNNw9YaJqzdnlMWzpMJ2R1OwKg",
  "refresh_expires_at": "2026-11-27T09:51:45.170048584Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c07ff456-865d-466b-857c-93fd2ae70624",
  "session_id": "d564e45b-ea1f-4d07-9c2c-fc0e10e4422e",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77746fd7-203f-4a13-a3f8-62173584522f",
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
  "id": "fab14e8b-2863-4f6c-91a1-a4fdfbeb699d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:56:45.228205Z",
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
  "challenge_id": "c59f05f7-711b-4179-bc93-696214b090ab",
  "expires_at": "2026-10-28T09:56:47.263355057Z",
  "resend_available_at": "2026-10-28T09:51:48.263355057Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673914950` → **200**

```json
{
  "phone": "+380673914950",
  "audience": "CLIENT",
  "code": "600112",
  "sent_at": "2026-10-28T09:51:47.265152969Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "7bf677eb-a73c-4018-9a77-fa0be88ec911",
  "challenge_id": "c59f05f7-711b-4179-bc93-696214b090ab",
  "otp_code": "600112"
}
```

```json
{
  "client_id": "c07ff456-865d-466b-857c-93fd2ae70624",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T09:51:47.330544862Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "198b2c08-5e3b-4e9f-9dea-99bf81a9a012",
  "quote_id": "fab14e8b-2863-4f6c-91a1-a4fdfbeb699d",
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
  "correlation_id": "bd688224-15c2-4a54-a6f6-c2a2d206efb2"
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
  "session_id": "e2bd229a-8e33-4338-bba6-21338c49f260",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMDcsImlhdCI6MTc5MzE4MTEwNywianRpIjoiZjEzNmM1NjctZTc3Ni00YzZmLWI4NGYtNDJmZjYyMGI4ZjRiIiwic2lkIjoiZTJiZDIyOWEtOGUzMy00MzM4LWJiYTYtMjEzMzhjNDlmMjYwIn0.mzdpBZbi3KTeTzZ_0PCG9r670y55Q5VsJ8tkuQ_w6Lc",
  "access_expires_at": "2026-10-28T10:06:47.654796243Z",
  "refresh_token": "eQsjbOSIL5BD_XSqdzGaAp8wRRrRES3kH3SPE4fukLA",
  "refresh_expires_at": "2026-10-28T21:51:47.65431974Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "c07ff456-865d-466b-857c-93fd2ae70624",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T09:51:47.330545Z",
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

`POST /api/admin/v1/client-deletions/c07ff456-865d-466b-857c-93fd2ae70624/complete` → **200**

```json
{
  "command_id": "e68d2a52-9b78-4aba-b586-784e444d36ec",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "c07ff456-865d-466b-857c-93fd2ae70624",
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
  "correlation_id": "a886dee6-e7b5-4dc6-9057-5acc71813822"
}
```

Done: client c07ff456-865d-466b-857c-93fd2ae70624 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660870611",
  "device_ref": "sandbox-30604"
}
```

```json
{
  "challenge_id": "9847b5a7-155e-415d-a232-67bb9cd9eb8b",
  "expires_at": "2026-10-28T09:56:47.790755675Z",
  "resend_available_at": "2026-10-28T09:51:48.790755675Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660870611` → **200**

```json
{
  "phone": "+380660870611",
  "audience": "CLIENT",
  "code": "597960",
  "sent_at": "2026-10-28T09:51:47.792675297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9847b5a7-155e-415d-a232-67bb9cd9eb8b",
  "code": "597960",
  "device_ref": "sandbox-30604"
}
```

```json
{
  "session_id": "21cbd6e3-fba3-4537-b242-f2326250a10a",
  "subject": {
    "type": "CLIENT",
    "id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTIwM2Q2Ny03ZDJjLTQzYWMtOGI4Ni1iNTNhMTczYTBlMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDA3LCJpYXQiOjE3OTMxODExMDcsImp0aSI6IjUyYmQ3MzJjLTc3NTgtNGNkMi1iNWM3LTk2YzMwOTA2NjUyMiIsInNpZCI6IjIxY2JkNmUzLWZiYTMtNDUzNy1iMjQyLWYyMzI2MjUwYTEwYSJ9.zvxTjWKKu3KdTd7qrzQfOeBrvhjFCZzWL0KimOzQJr4",
  "access_expires_at": "2026-10-28T10:06:47.845073861Z",
  "refresh_token": "lMfRVBhUG_CE-N7G3_VBhVpVRT7EAC0AoprtTy7eqqk",
  "refresh_expires_at": "2026-11-27T09:51:47.844631559Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b",
  "session_id": "21cbd6e3-fba3-4537-b242-f2326250a10a",
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
  "session_id": "d2512f1e-8b36-4336-b6cf-bf27f9b60ab9",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMDgsImlhdCI6MTc5MzE4MTEwOCwianRpIjoiZGVlZjNhZTgtM2E4MC00YzQyLTk4OWEtNDczMDVmNWVlNmI1Iiwic2lkIjoiZDI1MTJmMWUtOGIzNi00MzM2LWI2Y2YtYmYyN2Y5YjYwYWI5In0.qcTALPCf8eQrd5Oy9eTO9zonmr_CUSumAJBXmn7JJpE",
  "access_expires_at": "2026-10-28T10:06:48.155506635Z",
  "refresh_token": "eQ_oxdiYCeGre0jO5Ivcpfqe9vyNJ9Cad8uhIiQxzFM",
  "refresh_expires_at": "2026-10-28T21:51:48.15507589Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0870611&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b",
      "phone": "+380660870611",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T09:51:47.842981Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/6a203d67-7d2c-43ac-8b86-b53a173a0e2b` → **200**

```json
{
  "client": {
    "id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b",
    "phone": "+380660870611",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T09:51:47.842981Z",
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

`POST /api/admin/v1/clients/6a203d67-7d2c-43ac-8b86-b53a173a0e2b/block` → **400**

```json
{
  "command_id": "1b5af8e6-015c-4da9-af90-420eb6e4e713",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6a203d67-7d2c-43ac-8b86-b53a173a0e2b/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "25d95ef2-22ea-42b9-bfa9-8f4724c7e09e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/6a203d67-7d2c-43ac-8b86-b53a173a0e2b/block` → **200**

```json
{
  "command_id": "9e11195f-39d3-4707-b1e3-8e25c37fdb4e",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b",
  "phone": "+380660870611",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T09:51:47.842981Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T09:51:48.320217Z",
    "by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
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
  "correlation_id": "3311d2df-3543-401b-a688-a04fb5ede516"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660870611",
  "device_ref": "sandbox-10434"
}
```

```json
{
  "challenge_id": "628a67db-e381-4897-9636-ed74a82f7d6c",
  "expires_at": "2026-10-28T09:56:50.377857189Z",
  "resend_available_at": "2026-10-28T09:51:51.377857189Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660870611` → **200**

```json
{
  "phone": "+380660870611",
  "audience": "CLIENT",
  "code": "370731",
  "sent_at": "2026-10-28T09:51:50.37983077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "628a67db-e381-4897-9636-ed74a82f7d6c",
  "code": "370731",
  "device_ref": "sandbox-10434"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "f2e3f159-332e-436f-836f-9d9129c5cb30"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/6a203d67-7d2c-43ac-8b86-b53a173a0e2b` → **200**

```json
{
  "client": {
    "id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b",
    "phone": "+380660870611",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T09:51:47.842981Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T09:51:48.320217Z",
      "by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
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

`POST /api/admin/v1/clients/6a203d67-7d2c-43ac-8b86-b53a173a0e2b/unblock` → **200**

```json
{
  "command_id": "79a4b00d-a7e1-4c10-869e-662d101540b3",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b",
  "phone": "+380660870611",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T09:51:47.842981Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660870611",
  "device_ref": "sandbox-8808"
}
```

```json
{
  "challenge_id": "6daa7985-9532-45f1-864d-1791f0c8bd73",
  "expires_at": "2026-10-28T09:56:52.531464289Z",
  "resend_available_at": "2026-10-28T09:51:53.531464289Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660870611` → **200**

```json
{
  "phone": "+380660870611",
  "audience": "CLIENT",
  "code": "459255",
  "sent_at": "2026-10-28T09:51:52.53342372Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6daa7985-9532-45f1-864d-1791f0c8bd73",
  "code": "459255",
  "device_ref": "sandbox-8808"
}
```

```json
{
  "session_id": "e8992173-b78f-4f28-b32c-836356783487",
  "subject": {
    "type": "CLIENT",
    "id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTIwM2Q2Ny03ZDJjLTQzYWMtOGI4Ni1iNTNhMTczYTBlMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDEyLCJpYXQiOjE3OTMxODExMTIsImp0aSI6IjZjZDcyOTY3LTc2MjctNDllZC1hZDZkLTNhZGIwN2FmOWY0ZiIsInNpZCI6ImU4OTkyMTczLWI3OGYtNGYyOC1iMzJjLTgzNjM1Njc4MzQ4NyJ9.hSc9UbJ3WZWWCMwAPPMncoJeyoJC1H0Nb-2YvQBY8yE",
  "access_expires_at": "2026-10-28T10:06:52.74634146Z",
  "refresh_token": "cNL2aia3nIqCtkVABISlHNX7ppuEuPLkBAqAnx2NV9g",
  "refresh_expires_at": "2026-11-27T09:51:52.745858317Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6a203d67-7d2c-43ac-8b86-b53a173a0e2b",
  "session_id": "e8992173-b78f-4f28-b32c-836356783487",
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
  "phone": "+380667143337",
  "device_ref": "sandbox-16931"
}
```

```json
{
  "challenge_id": "b15be71c-ef4b-4b8c-9046-fff1e40385eb",
  "expires_at": "2026-10-28T09:56:52.810804043Z",
  "resend_available_at": "2026-10-28T09:51:53.810804043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667143337` → **200**

```json
{
  "phone": "+380667143337",
  "audience": "CLIENT",
  "code": "016393",
  "sent_at": "2026-10-28T09:51:52.812883671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b15be71c-ef4b-4b8c-9046-fff1e40385eb",
  "code": "016393",
  "device_ref": "sandbox-16931"
}
```

```json
{
  "session_id": "75123679-ce2e-4330-8f84-209be1e17df8",
  "subject": {
    "type": "CLIENT",
    "id": "1502b139-7029-42d6-b3c7-1bb6cf382101"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTAyYjEzOS03MDI5LTQyZDYtYjNjNy0xYmI2Y2YzODIxMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDEyLCJpYXQiOjE3OTMxODExMTIsImp0aSI6IjZhYmI2ZTI3LWM3ZTQtNDE2Ny1hYTY2LTE2ZmE2MTdmNDU5OSIsInNpZCI6Ijc1MTIzNjc5LWNlMmUtNDMzMC04Zjg0LTIwOWJlMWUxN2RmOCJ9.bcaA2UkAr_si_KmE3cInSS3cM0seogA0RwU5Su56iSs",
  "access_expires_at": "2026-10-28T10:06:52.865914952Z",
  "refresh_token": "S7Cf6n1PB5xFUp7ZAE_lxZ1VTZBEgh-UNHoHVGVPGlo",
  "refresh_expires_at": "2026-11-27T09:51:52.86545297Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "965c27bb-d5f1-480f-874f-1c26a31700d7",
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
  "id": "96908131-9f6b-461b-af12-e25219c04fb8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:56:52.898880Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: ce40711d-0551-485a-9c2c-e01b857de025) → **201**

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
  "session_id": "70f4dd3e-359c-4f33-8548-4536c4dbbd91",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMTMsImlhdCI6MTc5MzE4MTExMywianRpIjoiM2UyYmNlMmUtNjk0ZC00YjU0LWI1ZGEtMDQ4NDVhOGQ0MTM4Iiwic2lkIjoiNzBmNGRkM2UtMzU5Yy00ZjMzLTg1NDgtNDUzNmM0ZGJiZDkxIn0.-SXE_eM7pxD9yFL0yeSINJE4L63cKU7m9ebFInb7Qm0",
  "access_expires_at": "2026-10-28T10:06:53.229846012Z",
  "refresh_token": "SFyRc21va6AZ2qDKUGXw_4lBO9j83xT-fQc6_W_cbWo",
  "refresh_expires_at": "2026-10-28T21:51:53.229311093Z",
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
  "session_id": "701ace01-75e7-4cc0-a832-80bb822fd555",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMTMsImlhdCI6MTc5MzE4MTExMywianRpIjoiYjNkNjk1MTEtNzVlOS00NmUyLWI0NjMtOTRlNmIwNDI0ODhlIiwic2lkIjoiNzAxYWNlMDEtNzVlNy00Y2MwLWE4MzItODBiYjgyMmZkNTU1In0.IqMtbZQuF-BI8CaEH_X5KRLnlDOCUjoJfE3ItaOEh7s",
  "access_expires_at": "2026-10-28T10:06:53.51453027Z",
  "refresh_token": "2-r5XTS2dAUr91gz55slQHBMnvQT6eYrRrwdZxnFZRo",
  "refresh_expires_at": "2026-10-28T21:51:53.5140758Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4386ab29-4468-4149-9a22-31328da74b3d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:51:52.931361Z",
      "actor": {
        "type": "CLIENT",
        "id": "1502b139-7029-42d6-b3c7-1bb6cf382101",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4386ab29-4468-4149-9a22-31328da74b3d",
        "quote_id": "96908131-9f6b-461b-af12-e25219c04fb8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ce40711d-0551-485a-9c2c-e01b857de025"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:51:52.932877Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4386ab29-4468-4149-9a22-31328da74b3d",
        "attempt_id": "38ab9707-fd8b-4778-8ae5-d8d3d798543b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ce40711d-0551-485a-9c2c-e01b857de025"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T09:51:52.940811Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4386ab29-4468-4149-9a22-31328da74b3d",
        "attempt_id": "38ab9707-fd8b-4778-8ae5-d8d3d798543b"
      },
      "correlation_id": "ce40711d-0551-485a-9c2c-e01b857de025"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "38ab9707-fd8b-4778-8ae5-d8d3d798543b",
        "generation": 1,
        "started_at": "2026-10-28T09:51:52.931984Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T09:51:52.940811Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T09:51:52.933622Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/ce40711d-0551-485a-9c2c-e01b857de025` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "4386ab29-4468-4149-9a22-31328da74b3d:0",
      "order_id": "4386ab29-4468-4149-9a22-31328da74b3d",
      "at": "2026-10-28T09:51:52.931361Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4386ab29-4468-4149-9a22-31328da74b3d:1",
      "order_id": "4386ab29-4468-4149-9a22-31328da74b3d",
      "at": "2026-10-28T09:51:52.932877Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4386ab29-4468-4149-9a22-31328da74b3d:2",
      "order_id": "4386ab29-4468-4149-9a22-31328da74b3d",
      "at": "2026-10-28T09:51:52.940811Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/286b8610-9b19-45c9-a3a8-272ea367224f` → **200**

```json
{
  "found": []
}
```

Done: request ce40711d-0551-485a-9c2c-e01b857de025 — order 4386ab29-4468-4149-9a22-31328da74b3d found by its id.

`GET /api/rider/v1/orders/4386ab29-4468-4149-9a22-31328da74b3d` → **200**

```json
{
  "id": "4386ab29-4468-4149-9a22-31328da74b3d",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1502b139-7029-42d6-b3c7-1bb6cf382101",
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
  "created_at": "2026-10-28T09:51:52.930867Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4386ab29-4468-4149-9a22-31328da74b3d/cancel` → **200**

```json
{
  "command_id": "6b4fb5c9-e8ce-4cc1-a251-c38b38020cde",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4386ab29-4468-4149-9a22-31328da74b3d",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1502b139-7029-42d6-b3c7-1bb6cf382101",
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
  "created_at": "2026-10-28T09:51:52.930867Z",
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
  "phone": "+380635487066",
  "device_ref": "sandbox-15581"
}
```

```json
{
  "challenge_id": "2a985dd6-67ff-42b4-a7a8-baf46518f4fc",
  "expires_at": "2026-10-28T09:56:53.702568519Z",
  "resend_available_at": "2026-10-28T09:51:54.702568519Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635487066` → **200**

```json
{
  "phone": "+380635487066",
  "audience": "CLIENT",
  "code": "886645",
  "sent_at": "2026-10-28T09:51:53.706634437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a985dd6-67ff-42b4-a7a8-baf46518f4fc",
  "code": "886645",
  "device_ref": "sandbox-15581"
}
```

```json
{
  "session_id": "e1e2e41b-6af0-488d-95eb-ca58581c5509",
  "subject": {
    "type": "CLIENT",
    "id": "47aecaa3-c902-40bf-92b9-57645dcccb58"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0N2FlY2FhMy1jOTAyLTQwYmYtOTJiOS01NzY0NWRjY2NiNTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDEzLCJpYXQiOjE3OTMxODExMTMsImp0aSI6ImVkM2MxNmEyLWRjMWItNDVmYS05MDJlLTMzOTg4YjgwNDc0OSIsInNpZCI6ImUxZTJlNDFiLTZhZjAtNDg4ZC05NWViLWNhNTg1ODFjNTUwOSJ9.qPd2VPd77YlXSh3lp-m0jOo98G0TbCvoEmaGb32yQBM",
  "access_expires_at": "2026-10-28T10:06:53.760937253Z",
  "refresh_token": "puzaKr0jPn3gSl5kLMvDRY4nGnBI5WkaJJl77IIv-WE",
  "refresh_expires_at": "2026-11-27T09:51:53.760444446Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "62e55fba-427c-4833-99fd-f81ca2c2244e",
  "expires_at": "2026-10-28T09:56:55.790897152Z",
  "resend_available_at": "2026-10-28T09:51:56.790897152Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635487066` → **200**

```json
{
  "phone": "+380635487066",
  "audience": "CLIENT",
  "code": "479610",
  "sent_at": "2026-10-28T09:51:55.792766419Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "b6798b39-1bb7-46b7-ad14-aed4eb151f72",
  "challenge_id": "62e55fba-427c-4833-99fd-f81ca2c2244e",
  "otp_code": "479610"
}
```

```json
{
  "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
  "state": "PENDING",
  "created_at": "2026-10-28T09:51:55.853392Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287` → **200**

```json
{
  "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
  "state": "PENDING",
  "created_at": "2026-10-28T09:51:55.853392Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287` → **200**

```json
{
  "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
  "state": "PENDING",
  "created_at": "2026-10-28T09:51:55.853392Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287` → **200**

```json
{
  "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
  "state": "PENDING",
  "created_at": "2026-10-28T09:51:55.853392Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287` → **200**

```json
{
  "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
  "state": "PENDING",
  "created_at": "2026-10-28T09:51:55.853392Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287` → **200**

```json
{
  "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
  "state": "PENDING",
  "created_at": "2026-10-28T09:51:55.853392Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287` → **200**

```json
{
  "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
  "state": "PENDING",
  "created_at": "2026-10-28T09:51:55.853392Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287` → **200**

```json
{
  "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
  "state": "READY",
  "created_at": "2026-10-28T09:51:55.853392Z",
  "ready_at": "2026-10-28T09:52:01.181104Z",
  "expires_at": "2026-11-04T09:52:01.181104Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636808531",
  "device_ref": "sandbox-26353"
}
```

```json
{
  "challenge_id": "2e1fc7be-7cba-4e3c-8dfe-8cd54e3b7e07",
  "expires_at": "2026-10-28T09:57:02.084897838Z",
  "resend_available_at": "2026-10-28T09:52:03.084897838Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636808531` → **200**

```json
{
  "phone": "+380636808531",
  "audience": "CLIENT",
  "code": "506530",
  "sent_at": "2026-10-28T09:52:02.087169979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e1fc7be-7cba-4e3c-8dfe-8cd54e3b7e07",
  "code": "506530",
  "device_ref": "sandbox-26353"
}
```

```json
{
  "session_id": "f0b81ff4-6437-46c8-b5cb-74e1761de1b8",
  "subject": {
    "type": "CLIENT",
    "id": "6c6c736d-1d1d-4cef-822f-7c25224f0dc1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzZjNzM2ZC0xZDFkLTRjZWYtODIyZi03YzI1MjI0ZjBkYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDIyLCJpYXQiOjE3OTMxODExMjIsImp0aSI6ImE5ZjU3YzgwLWI4NjktNDA4NC1iYzNjLTgyOTQ4YzM0YWI0YSIsInNpZCI6ImYwYjgxZmY0LTY0MzctNDZjOC1iNWNiLTc0ZTE3NjFkZTFiOCJ9.fsTefE4GwSWwFn6bEyk3p18qNkgWJ8uQiD8y-T5PzDM",
  "access_expires_at": "2026-10-28T10:07:02.409483184Z",
  "refresh_token": "44a8sVjbeaE4VBzVZE9q2R72w4ja-4rOuGFKzr_W7iw",
  "refresh_expires_at": "2026-11-27T09:52:02.409069514Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/42de6556-25fb-40a6-84e7-ba0d63545287/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "354a170d-65a2-4ed8-a5ae-e462b1db8552"
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
  "session_id": "f5b682f4-f176-49d0-8370-e1a263b68ea2",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMjIsImlhdCI6MTc5MzE4MTEyMiwianRpIjoiMmUxODU3NTktOWJhOS00NjJmLTk2MjQtZjAzNTUzZTM5YmY5Iiwic2lkIjoiZjViNjgyZjQtZjE3Ni00OWQwLTgzNzAtZTFhMjYzYjY4ZWEyIn0.95sDirdb1USmy2iKv8C43aBtll5U3rMR2hxfof_cotI",
  "access_expires_at": "2026-10-28T10:07:02.720030525Z",
  "refresh_token": "TWRERvw4kAhQXL5UmBms4EKGcuQHash7aLE90dRyVAM",
  "refresh_expires_at": "2026-10-28T21:52:02.719575624Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "47aecaa3-c902-40bf-92b9-57645dcccb58",
  "session_id": "e1e2e41b-6af0-488d-95eb-ca58581c5509",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/47aecaa3-c902-40bf-92b9-57645dcccb58/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "42de6556-25fb-40a6-84e7-ba0d63545287",
      "state": "READY",
      "created_at": "2026-10-28T09:51:55.853392Z",
      "ready_at": "2026-10-28T09:52:01.181104Z",
      "expires_at": "2026-11-04T09:52:01.181104Z",
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
  "device_ref": "sandbox-20727"
}
```

```json
{
  "challenge_id": "199c74e1-25d6-4e12-ad65-c4141d604aca",
  "expires_at": "2026-10-28T09:57:02.955530427Z",
  "resend_available_at": "2026-10-28T09:52:03.955530427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "412536",
  "sent_at": "2026-10-28T09:52:02.957687658Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "199c74e1-25d6-4e12-ad65-c4141d604aca",
  "code": "412536",
  "device_ref": "sandbox-20727"
}
```

```json
{
  "session_id": "5821f54e-4d51-422c-b843-73efdbf58ffb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjAyMywiaWF0IjoxNzkzMTgxMTIzLCJqdGkiOiJhZWUxMWY3My0wNmNlLTQ3NzYtYTAwYi03YTNlY2JhMmU2NzgiLCJzaWQiOiI1ODIxZjU0ZS00ZDUxLTQyMmMtYjg0My03M2VmZGJmNThmZmIifQ.3hOJFX8FF3T_YNPE94WRsF1JlQ3tx-9XQpKZO5yGz3g",
  "access_expires_at": "2026-10-28T10:07:03.01193568Z",
  "refresh_token": "hkV6MuI1I8T23ifUFSgHu9QvphkouUhE_rj-Ww7l3ZE",
  "refresh_expires_at": "2026-11-27T09:52:03.011506457Z",
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
  "device_ref": "sandbox-6734"
}
```

```json
{
  "challenge_id": "0a0012ff-b980-4cc2-9c19-dc7c15ab864c",
  "expires_at": "2026-10-28T09:57:03.059406605Z",
  "resend_available_at": "2026-10-28T09:52:04.059406605Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "595371",
  "sent_at": "2026-10-28T09:52:03.06134883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a0012ff-b980-4cc2-9c19-dc7c15ab864c",
  "code": "595371",
  "device_ref": "sandbox-6734"
}
```

```json
{
  "session_id": "3ed852df-04fd-4970-b785-989811ba2d1b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjAyMywiaWF0IjoxNzkzMTgxMTIzLCJqdGkiOiJjZDQxMGM3Ni0zZmU2LTQwZTEtOWIwMi0yYjU2OTZiMDlmZWQiLCJzaWQiOiIzZWQ4NTJkZi0wNGZkLTQ5NzAtYjc4NS05ODk4MTFiYTJkMWIifQ.CLjTuh6FBAm_85PmscqLwtzSpEBC1w_BFP7Pes2uB1Q",
  "access_expires_at": "2026-10-28T10:07:03.111029294Z",
  "refresh_token": "LuJQPgruqyuq3DslxC2Iy7nu-4qkHah75awuE-dDVN4",
  "refresh_expires_at": "2026-11-27T09:52:03.110549977Z",
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
  "command_id": "65a496a8-d87e-4955-965a-b6f9ec4caf5f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:03Z",
    "sequence": 1793181123158
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7464baf0-ae01-4190-8480-46e63bd5ed0e",
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
  "last_heartbeat_at": "2026-10-28T09:52:03.175581Z",
  "last_location_at": "2026-10-28T09:52:03.175581Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-10649"
}
```

```json
{
  "challenge_id": "86a321c0-3251-49f1-b23f-c1db91ab6366",
  "expires_at": "2026-10-28T09:57:03.204911412Z",
  "resend_available_at": "2026-10-28T09:52:04.204911412Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "770670",
  "sent_at": "2026-10-28T09:52:03.206913385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86a321c0-3251-49f1-b23f-c1db91ab6366",
  "code": "770670",
  "device_ref": "sandbox-10649"
}
```

```json
{
  "session_id": "7b407bde-b195-4db5-8cab-caeff3274735",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjAyMywiaWF0IjoxNzkzMTgxMTIzLCJqdGkiOiIxYzUzYzRhMS1kZmRhLTQ0NmYtYTI4NC1hYzYwNmFhYjRkN2MiLCJzaWQiOiI3YjQwN2JkZS1iMTk1LTRkYjUtOGNhYi1jYWVmZjMyNzQ3MzUifQ.rJaio80wRgwJJ-298CIVHLSYRtT73iTdnGszz1MizsA",
  "access_expires_at": "2026-10-28T10:07:03.392379541Z",
  "refresh_token": "S2dr44wnwunx0SPOkb4AYwTet6OgeVD9RgOC-g88vW4",
  "refresh_expires_at": "2026-11-27T09:52:03.391925191Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "84646385-76ef-4b4b-8b90-546737de6a41",
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
  "last_heartbeat_at": "2026-10-28T09:51:33.545035Z",
  "last_location_at": "2026-10-28T09:51:33.545035Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/84646385-76ef-4b4b-8b90-546737de6a41/handover` → **200**

```json
{
  "command_id": "41403209-1e85-4aa0-ba2f-b5f865727abb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "84646385-76ef-4b4b-8b90-546737de6a41",
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
  "last_heartbeat_at": "2026-10-28T09:51:33.545035Z",
  "last_location_at": "2026-10-28T09:51:33.545035Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/84646385-76ef-4b4b-8b90-546737de6a41/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:03Z",
    "sequence": 1793181123543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "84646385-76ef-4b4b-8b90-546737de6a41",
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
  "last_heartbeat_at": "2026-10-28T09:52:03.560636Z",
  "last_location_at": "2026-10-28T09:52:03.560636Z",
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
  "session_id": "b515a1e9-f5bf-442f-a236-24bec161a0c8",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMjMsImlhdCI6MTc5MzE4MTEyMywianRpIjoiNjE4YWNhZWQtY2IzMy00OTM0LTk0Y2EtMGZkMDMyMDFkZjE3Iiwic2lkIjoiYjUxNWExZTktZjViZi00NDJmLWEyMzYtMjRiZWMxNjFhMGM4In0.TEg5agzZtlrPWj-mkrNGhtwD-sTNiDPgXh7uigqtgdI",
  "access_expires_at": "2026-10-28T10:07:03.843924622Z",
  "refresh_token": "aZvjqjNU-mMXVy5GPsUGE5l8MpMO3ZyYPCcalhTeBhI",
  "refresh_expires_at": "2026-10-28T21:52:03.843465885Z",
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
  "session_id": "b57ac015-4ed0-4190-a909-f772468636c3",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMjQsImlhdCI6MTc5MzE4MTEyNCwianRpIjoiNTkyYzUyMWUtZDhjOS00ODU4LWEwNDEtZWFkNGRkOGM1ZjViIiwic2lkIjoiYjU3YWMwMTUtNGVkMC00MTkwLWE5MDktZjc3MjQ2ODYzNmMzIn0.P5vrOrcE3rhlcc2MEyjkfMxpO2snze92RKBKxhUVsbA",
  "access_expires_at": "2026-10-28T10:07:04.12829908Z",
  "refresh_token": "B0qi0MNzJ21_72W_LgWq4Q8rLQN4UGGWjT0RscVrj70",
  "refresh_expires_at": "2026-10-28T21:52:04.127876787Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681170060",
  "device_ref": "sandbox-28586"
}
```

```json
{
  "challenge_id": "067ee820-db64-4027-ab25-a64e01f628f8",
  "expires_at": "2026-10-28T09:57:04.153866109Z",
  "resend_available_at": "2026-10-28T09:52:05.153866109Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681170060` → **200**

```json
{
  "phone": "+380681170060",
  "audience": "CLIENT",
  "code": "341734",
  "sent_at": "2026-10-28T09:52:04.15558211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "067ee820-db64-4027-ab25-a64e01f628f8",
  "code": "341734",
  "device_ref": "sandbox-28586"
}
```

```json
{
  "session_id": "9b912326-6253-4d79-bb08-db7d9f4c9e1d",
  "subject": {
    "type": "CLIENT",
    "id": "b7b21e90-b287-45d4-8cdf-6b858d1a0b7e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiN2IyMWU5MC1iMjg3LTQ1ZDQtOGNkZi02Yjg1OGQxYTBiN2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDI0LCJpYXQiOjE3OTMxODExMjQsImp0aSI6IjM5MDU4ZjA0LTI2ZDAtNDlhMy04MDlmLWYxOTdkMjZlNTUxZSIsInNpZCI6IjliOTEyMzI2LTYyNTMtNGQ3OS1iYjA4LWRiN2Q5ZjRjOWUxZCJ9.KYItTOhQG-q7EXv57ksH2n4GEAAc-WPQzNg_resUwnA",
  "access_expires_at": "2026-10-28T10:07:04.20679834Z",
  "refresh_token": "7cJOlZxyiBLPykW3mMYYvxWlaeIGjMXB5fScKc7Jqxk",
  "refresh_expires_at": "2026-11-27T09:52:04.206278303Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2763e60c-0b71-4310-be35-af4e16ee25ef",
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
  "id": "24fd1989-73a8-47f9-8fe1-229216af094b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:04.239183Z",
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
  "command_id": "a1d85d87-eb1d-40bb-a221-dfdc7664825a",
  "quote_id": "24fd1989-73a8-47f9-8fe1-229216af094b",
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
  "id": "1022760e-4efb-43e9-a143-57af2e5de92f",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b7b21e90-b287-45d4-8cdf-6b858d1a0b7e",
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
  "created_at": "2026-10-28T09:52:04.275038Z",
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
    "id": "a911230f-f06f-4491-a325-efd7ee56ea9b",
    "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f",
    "expires_at": "2026-10-28T09:52:19.27744Z",
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

`POST /api/driver/v1/offers/a911230f-f06f-4491-a325-efd7ee56ea9b/reject` → **204**

```json
{
  "command_id": "c7bd275e-8f00-4ce6-9f83-c5b2ac204782"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c4ec979f-4101-4988-9318-8facdeb71c3e",
    "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f",
    "expires_at": "2026-10-28T09:52:19.34062Z",
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

`POST /api/driver/v1/offers/c4ec979f-4101-4988-9318-8facdeb71c3e/accept` → **200**

```json
{
  "command_id": "74173e82-77a6-4130-a818-d3ca34f89bcb"
}
```

```json
{
  "id": "c139f059-f183-4a21-a432-4a4fb4275e12",
  "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c0e087a-ad5e-49d8-8ed3-b1b91ecb4281",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/1022760e-4efb-43e9-a143-57af2e5de92f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:52:04.275452Z",
      "actor": {
        "type": "CLIENT",
        "id": "b7b21e90-b287-45d4-8cdf-6b858d1a0b7e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f",
        "quote_id": "24fd1989-73a8-47f9-8fe1-229216af094b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9f49b435-c2b7-457f-b288-15309d6aab9b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:52:04.276843Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f",
        "attempt_id": "872b176a-6b05-4c25-a19c-f093ec97b92b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9f49b435-c2b7-457f-b288-15309d6aab9b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:52:04.282125Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a911230f-f06f-4491-a325-efd7ee56ea9b",
        "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "9f49b435-c2b7-457f-b288-15309d6aab9b"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T09:52:04.339794Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a911230f-f06f-4491-a325-efd7ee56ea9b",
        "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f"
      },
      "correlation_id": "bdcb96a4-dc9b-4154-bea6-ef0c70b90f8e"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 1022760e-4efb-43e9-a143-57af2e5de92f — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/1022760e-4efb-43e9-a143-57af2e5de92f` → **200**

```json
{
  "id": "1022760e-4efb-43e9-a143-57af2e5de92f",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b7b21e90-b287-45d4-8cdf-6b858d1a0b7e",
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
    "id": "c139f059-f183-4a21-a432-4a4fb4275e12",
    "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0c0e087a-ad5e-49d8-8ed3-b1b91ecb4281",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:52:04.275038Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1022760e-4efb-43e9-a143-57af2e5de92f/cancel` → **200**

```json
{
  "command_id": "5e4984e1-160f-4ac4-baa2-4e25538904cb",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1022760e-4efb-43e9-a143-57af2e5de92f",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b7b21e90-b287-45d4-8cdf-6b858d1a0b7e",
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
    "id": "c139f059-f183-4a21-a432-4a4fb4275e12",
    "order_id": "1022760e-4efb-43e9-a143-57af2e5de92f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0c0e087a-ad5e-49d8-8ed3-b1b91ecb4281",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:52:04.275038Z",
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
  "session_id": "7464baf0-ae01-4190-8480-46e63bd5ed0e",
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
  "last_heartbeat_at": "2026-10-28T09:52:03.175581Z",
  "last_location_at": "2026-10-28T09:52:03.175581Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7464baf0-ae01-4190-8480-46e63bd5ed0e/close` → **200**

```json
{
  "command_id": "7aa52a75-fb1e-48b7-a85e-24e534c1e208",
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
  "session_id": "84646385-76ef-4b4b-8b90-546737de6a41",
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
  "last_heartbeat_at": "2026-10-28T09:52:03.560636Z",
  "last_location_at": "2026-10-28T09:52:03.560636Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/84646385-76ef-4b4b-8b90-546737de6a41/close` → **200**

```json
{
  "command_id": "c1acae2c-06d0-4fdc-9f97-fb771898af74",
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
  "device_ref": "sandbox-17139"
}
```

```json
{
  "challenge_id": "0726aa76-8ce6-4a68-9afc-beb825b58f97",
  "expires_at": "2026-10-28T09:57:04.71692325Z",
  "resend_available_at": "2026-10-28T09:52:05.71692325Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "878774",
  "sent_at": "2026-10-28T09:52:04.718872145Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0726aa76-8ce6-4a68-9afc-beb825b58f97",
  "code": "878774",
  "device_ref": "sandbox-17139"
}
```

```json
{
  "session_id": "0da33dd9-2800-4489-8280-310123d8dcfa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjAyNCwiaWF0IjoxNzkzMTgxMTI0LCJqdGkiOiJmMzQ5MTFlYi1iZTY2LTRkZGYtODVhZS02MjQ0YTIxNTAxNWYiLCJzaWQiOiIwZGEzM2RkOS0yODAwLTQ0ODktODI4MC0zMTAxMjNkOGRjZmEifQ.akEEMW6DTAHu-_2vO2fFAkR_X76dRjox6iEV5WJM6Ps",
  "access_expires_at": "2026-10-28T10:07:04.778584005Z",
  "refresh_token": "M1XJn3r6vV_7pAH60Ar6ri4kL9AvY2Nw4_XC71WnySk",
  "refresh_expires_at": "2026-11-27T09:52:04.778134011Z",
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
  "command_id": "a87666be-0a24-4204-8444-c8662969e95f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:04Z",
    "sequence": 1793181124828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:04.845714Z",
  "last_location_at": "2026-10-28T09:52:04.845714Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672977920",
  "device_ref": "sandbox-20379"
}
```

```json
{
  "challenge_id": "cd5450b4-c779-4055-aee1-d6a5107d303d",
  "expires_at": "2026-10-28T09:57:04.87641011Z",
  "resend_available_at": "2026-10-28T09:52:05.87641011Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672977920` → **200**

```json
{
  "phone": "+380672977920",
  "audience": "CLIENT",
  "code": "413353",
  "sent_at": "2026-10-28T09:52:04.878252187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd5450b4-c779-4055-aee1-d6a5107d303d",
  "code": "413353",
  "device_ref": "sandbox-20379"
}
```

```json
{
  "session_id": "650362a4-1c4d-4d23-9667-ce0e0f459142",
  "subject": {
    "type": "CLIENT",
    "id": "637986d1-c277-41d0-8aa5-98ec4712be75"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Mzc5ODZkMS1jMjc3LTQxZDAtOGFhNS05OGVjNDcxMmJlNzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDI0LCJpYXQiOjE3OTMxODExMjQsImp0aSI6IjFlZmY1ZGQ1LWE1YzMtNDg2My04NDcyLTM5NmU0YTdmMTAwYiIsInNpZCI6IjY1MDM2MmE0LTFjNGQtNGQyMy05NjY3LWNlMGUwZjQ1OTE0MiJ9.rsnLH51fp6u0cm6JjnZ2y8zX7pO59TVPADNktUz9LvA",
  "access_expires_at": "2026-10-28T10:07:04.930578845Z",
  "refresh_token": "SrCzj9N6up1cyNiZBcoMM1XDk3k9pVKwsKCWRln7hRg",
  "refresh_expires_at": "2026-11-27T09:52:04.930061532Z",
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
  "command_id": "bb346dd6-a824-4b38-915f-64e96a15408c",
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
  "id": "c50cd9f0-4e30-4679-a720-3fb549bd3823",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:04.991529Z",
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
  "command_id": "c619daeb-6ced-4df7-8738-22d5e9b35c4d",
  "platform": "ANDROID",
  "token": "sandbox-driver-ca9bce0d-973c-4032-aed3-dec323ddbfc5"
}
```

```json
{
  "id": "fd0156c2-9234-470a-ba57-b4c756d932df",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:52:05.034035Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "9801cfbf-e3cd-4aa4-aefc-118a8b5f53a1",
  "platform": "ANDROID",
  "token": "sandbox-rider-70cf4f10-2c0f-47e7-8fd6-c286576ad417"
}
```

```json
{
  "id": "f2f0f999-eea4-458a-b889-22db5cb1d195",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:52:05.068147Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0686b4f0-a65e-43b3-bcd8-6b6ee3b1c3b4",
  "quote_id": "c50cd9f0-4e30-4679-a720-3fb549bd3823",
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
  "id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "637986d1-c277-41d0-8aa5-98ec4712be75",
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
  "created_at": "2026-10-28T09:52:05.107625Z",
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
    "id": "04b1d53f-10f6-4cdf-a48f-8ceea3773114",
    "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
    "expires_at": "2026-10-28T09:52:20.110374Z",
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

`POST /api/driver/v1/offers/04b1d53f-10f6-4cdf-a48f-8ceea3773114/accept` → **200**

```json
{
  "command_id": "e6370761-3eed-411b-9d77-2aef8ba2343c"
}
```

```json
{
  "id": "a5ddf779-1b4f-44bd-ad11-e5f4eec4eef5",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cd354c8b-f001-4969-99f9-ac2dd4eeff1b",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:52:05.863Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:52:05.863Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:52:05.863Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:52:06.293844089Z",
    "token_suffix": "ddbfc5",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
      "order_version": "2",
      "event_id": "01cd388a-1914-40ea-af2c-b32182774a32",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672977920&after=2026-10-28T09:52:05.863Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:52:06.29512327Z",
    "token_suffix": "6ad417",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
      "order_version": "3",
      "event_id": "b0538ca7-e874-4793-825f-47ed6e3b5b1d",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4d561602-d30e-46a1-904a-e4f931a27bfb/messages` → **201**

```json
{
  "command_id": "59807e3c-29c3-4fcc-ae52-7e644e3cbb9f",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "adffad38-190b-4f14-baf6-be67a86c308e",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T09:52:07.314514318Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cd354c8b-f001-4969-99f9-ac2dd4eeff1b",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "assignment_id": "a5ddf779-1b4f-44bd-ad11-e5f4eec4eef5",
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

`POST /api/driver/v1/trips/cd354c8b-f001-4969-99f9-ac2dd4eeff1b/messages` → **201**

```json
{
  "command_id": "c5b7ea06-9a24-4c61-8e92-be9727249f97",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "da9a7048-ba22-4112-9ef6-f8749087cadb",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T09:52:07.367998941Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4d561602-d30e-46a1-904a-e4f931a27bfb/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/cd354c8b-f001-4969-99f9-ac2dd4eeff1b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672977920"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:07Z",
    "sequence": 1793181127442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:07.459054Z",
  "last_location_at": "2026-10-28T09:52:07.459054Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cd354c8b-f001-4969-99f9-ac2dd4eeff1b",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "assignment_id": "a5ddf779-1b4f-44bd-ad11-e5f4eec4eef5",
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

`POST /api/driver/v1/trips/cd354c8b-f001-4969-99f9-ac2dd4eeff1b/arrive` → **200**

```json
{
  "command_id": "ef0dd2e8-249c-4d34-934b-73e240f074fc",
  "expected_version": 0
}
```

```json
{
  "id": "cd354c8b-f001-4969-99f9-ac2dd4eeff1b",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "assignment_id": "a5ddf779-1b4f-44bd-ad11-e5f4eec4eef5",
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
  "arrived_at": "2026-10-28T09:52:07.512218Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cd354c8b-f001-4969-99f9-ac2dd4eeff1b/start` → **200**

```json
{
  "command_id": "ab4f8c6b-0633-4304-a7d9-ca6317eb1f04",
  "expected_version": 1
}
```

```json
{
  "id": "cd354c8b-f001-4969-99f9-ac2dd4eeff1b",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "assignment_id": "a5ddf779-1b4f-44bd-ad11-e5f4eec4eef5",
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
  "arrived_at": "2026-10-28T09:52:07.512218Z",
  "started_at": "2026-10-28T09:52:07.545213Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:07Z",
    "sequence": 1793181127567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:07.584487Z",
  "last_location_at": "2026-10-28T09:52:07.584487Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/cd354c8b-f001-4969-99f9-ac2dd4eeff1b/complete` → **200**

```json
{
  "command_id": "f777a698-f35c-458e-896e-695b36ea12f3",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:52:07Z",
  "cash_received": true
}
```

```json
{
  "id": "cd354c8b-f001-4969-99f9-ac2dd4eeff1b",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "assignment_id": "a5ddf779-1b4f-44bd-ad11-e5f4eec4eef5",
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
  "arrived_at": "2026-10-28T09:52:07.512218Z",
  "started_at": "2026-10-28T09:52:07.545213Z",
  "completed_at": "2026-10-28T09:52:07.617378Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4d561602-d30e-46a1-904a-e4f931a27bfb` → **200**

```json
{
  "id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "637986d1-c277-41d0-8aa5-98ec4712be75",
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
    "id": "a5ddf779-1b4f-44bd-ad11-e5f4eec4eef5",
    "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cd354c8b-f001-4969-99f9-ac2dd4eeff1b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:52:05.107625Z",
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
    "id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:52:05.107625Z",
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
    "id": "cd354c8b-f001-4969-99f9-ac2dd4eeff1b",
    "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
    "order_short_number": 7,
    "created_at": "2026-10-28T09:52:05.171663Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e40bf2e9-9d9f-4dfb-9a07-8289c249056b",
    "order_id": "309edec9-22b0-460b-88f4-f9b6d8845734",
    "order_short_number": 1,
    "created_at": "2026-10-28T09:51:25.873271Z",
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

`GET /api/rider/v1/orders/4d561602-d30e-46a1-904a-e4f931a27bfb/tip` → **200**

```json
{
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
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
  "available_until": "2026-10-29T09:52:07.617378Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4d561602-d30e-46a1-904a-e4f931a27bfb/tip` → **201**

```json
{
  "command_id": "2d895926-ebb3-4dd1-8067-2299ae05fdb7",
  "amount_minor": 1100
}
```

```json
{
  "id": "d5b4d002-0b55-4a15-8712-c79666110817",
  "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T09:52:10.8141Z"
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
  "session_id": "c5a20c39-161c-4584-b174-b24bef4d24b2",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMzEsImlhdCI6MTc5MzE4MTEzMSwianRpIjoiYmQzMTU2YTgtMmFjNS00ZGQwLTk5MTEtN2U0Y2Y1YTJlNjU4Iiwic2lkIjoiYzVhMjBjMzktMTYxYy00NTg0LWIxNzQtYjI0YmVmNGQyNGIyIn0.NEXqFW747cFwhntApGoQX_oHlJYpTDVJpWl9rymASys",
  "access_expires_at": "2026-10-28T10:07:11.127600535Z",
  "refresh_token": "9ycXZmIb0nCybYMuUjMf5RscR7ryuDe0YzMkKmx225s",
  "refresh_expires_at": "2026-10-28T21:52:11.126938939Z",
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
  "generated_at": "2026-10-28T09:52:11.158634809Z"
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
  "generated_at": "2026-10-28T09:52:11.203643881Z"
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
  "session_id": "2a910b29-09b6-48c9-8d27-d77c91f99530",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMzEsImlhdCI6MTc5MzE4MTEzMSwianRpIjoiYmE0NTQ0NjgtNTc4MS00NmFlLWI0MDItMmUxZWIwNzVjMjc2Iiwic2lkIjoiMmE5MTBiMjktMDliNi00OGM5LThkMjctZDc3YzkxZjk5NTMwIn0.3eM8SrwTzBgIrT0m8tjfqdZYCZF6567saZL1ge-D-Ag",
  "access_expires_at": "2026-10-28T10:07:11.503529931Z",
  "refresh_token": "1iPSqLrnDCOI_6aU_175uSCCJoMMRijTbjaf1OJO-RQ",
  "refresh_expires_at": "2026-10-28T21:52:11.503003524Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4d561602-d30e-46a1-904a-e4f931a27bfb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:52:05.1081Z",
      "actor": {
        "type": "CLIENT",
        "id": "637986d1-c277-41d0-8aa5-98ec4712be75",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
        "quote_id": "c50cd9f0-4e30-4679-a720-3fb549bd3823",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7198bb88-3f06-4406-accc-a83adfdd23a3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:52:05.109679Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
        "attempt_id": "13bd1337-f088-4f59-9a01-b2df78511d09",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7198bb88-3f06-4406-accc-a83adfdd23a3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:52:05.114921Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "04b1d53f-10f6-4cdf-a48f-8ceea3773114",
        "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "7198bb88-3f06-4406-accc-a83adfdd23a3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:52:05.173163Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "04b1d53f-10f6-4cdf-a48f-8ceea3773114",
        "order_id": "4d561602-d30e-46a1-904a-e4f931a27bfb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a5ddf779-1b4f-44bd-ad11-e5f4eec4eef5"
      },
      "correlation_id": "dcfd50c5-0d19-4a5c-88d2-f2ea065ec89d"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T09:52:11.555172789Z",
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
      "last_location_at": "2026-10-28T09:52:07.584487Z",
      "order_id": null
    }
  ]
}
```

Done: order 4d561602-d30e-46a1-904a-e4f931a27bfb.

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
  "session_id": "e9d02ebf-c029-4e3a-babc-85c41b6b2b56",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMzEsImlhdCI6MTc5MzE4MTEzMSwianRpIjoiNjU0YWFlMjAtZGFhOC00OWNiLTlhYmEtMTU1YzMyYmFhNTNjIiwic2lkIjoiZTlkMDJlYmYtYzAyOS00ZTNhLWJhYmMtODVjNDFiNmIyYjU2In0.Hc9c-jsfGTam_0RkJaqygjn2lR1EQhdUXA4ZtxnJSTo",
  "access_expires_at": "2026-10-28T10:07:11.871845374Z",
  "refresh_token": "LXq3QaKpBL8-7BD_pRBNxzj4Y3Kz33EFshvaHd9R4L0",
  "refresh_expires_at": "2026-10-28T21:52:11.871306128Z",
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
  "command_id": "1dffb130-a2bd-4ec7-ae22-e2b96ed9dc0a",
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
  "timestamp": "2026-10-28T09:52:11.000+0000",
  "channel": {
    "id": "1730052000.119741322",
    "linkedid": "1730052000.119741322",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674584554"
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
  "timestamp": "2026-10-28T09:52:11.000+0000",
  "channel": {
    "id": "1730052000.119741322",
    "linkedid": "1730052000.119741322",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674584554"
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
  "session_id": "89cc9ab4-f8ae-453d-8cbf-545be4ca2102",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMzIsImlhdCI6MTc5MzE4MTEzMiwianRpIjoiNmJjNTY3OTktM2M1Ny00NDc1LWJmZDUtN2FiODJhNWRhNzE5Iiwic2lkIjoiODljYzlhYjQtZjhhZS00NTNkLThjYmYtNTQ1YmU0Y2EyMTAyIn0.N-4TiUMqcoEGGfB7QGoORXJgtadKZ2PWyePZW9v1Zi4",
  "access_expires_at": "2026-10-28T10:07:12.362264716Z",
  "refresh_token": "xTxJ4jt58L2oS9xT3ObQbEI6tM8bS6YBrJYmYTazVis",
  "refresh_expires_at": "2026-10-28T21:52:12.361862793Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "4f99fcfe-f18b-43a8-ac1c-07c479fe9396",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674584554",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:52:11Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/4f99fcfe-f18b-43a8-ac1c-07c479fe9396/answer` → **200**

```json
{
  "command_id": "e586242f-d187-4fb0-a002-baf40191dc68"
}
```

```json
{
  "id": "4f99fcfe-f18b-43a8-ac1c-07c479fe9396",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674584554",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "order_ids": [],
  "started_at": "2026-10-28T09:52:11Z",
  "answered_at": "2026-10-28T09:52:12.426754Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.119741322",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "075d7ba5-3c46-4898-9771-8142a076f8eb",
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
  "id": "39b9f392-4194-4124-81cd-9d1a64b6f75e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:12.490774Z",
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
  "command_id": "468fffae-ab8a-44cc-bf3f-8db569c84e84",
  "quote_id": "39b9f392-4194-4124-81cd-9d1a64b6f75e",
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
    "phone": "+380674584554"
  },
  "call_id": "4f99fcfe-f18b-43a8-ac1c-07c479fe9396"
}
```

```json
{
  "id": "ba924605-ee17-48cf-a98d-832b2b4cb5f3",
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
  "created_at": "2026-10-28T09:52:12.549557Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674584554"
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
    "id": "1730052000.119741322",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "4f99fcfe-f18b-43a8-ac1c-07c479fe9396",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674584554",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [
        "ba924605-ee17-48cf-a98d-832b2b4cb5f3"
      ],
      "started_at": "2026-10-28T09:52:11Z",
      "answered_at": "2026-10-28T09:52:12.426754Z",
      "ended_at": "2026-10-28T09:52:12.59715Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "daab3239-df9b-4a08-94bc-8420da5e2f58",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672474508",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [],
      "started_at": "2026-10-28T09:51:30.014985Z",
      "answered_at": "2026-10-28T09:51:30.074579Z",
      "ended_at": "2026-10-28T09:51:30.122189Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:51:31.183505Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/ba924605-ee17-48cf-a98d-832b2b4cb5f3` → **200**

```json
{
  "id": "ba924605-ee17-48cf-a98d-832b2b4cb5f3",
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
  "created_at": "2026-10-28T09:52:12.549557Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674584554"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ba924605-ee17-48cf-a98d-832b2b4cb5f3` → **200**

```json
{
  "id": "ba924605-ee17-48cf-a98d-832b2b4cb5f3",
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
  "created_at": "2026-10-28T09:52:12.549557Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674584554"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ba924605-ee17-48cf-a98d-832b2b4cb5f3/cancel` → **200**

```json
{
  "command_id": "30102e7c-e958-45cb-aa89-4ea509a13b8f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ba924605-ee17-48cf-a98d-832b2b4cb5f3",
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
  "created_at": "2026-10-28T09:52:12.549557Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674584554"
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

Done: call 4f99fcfe-f18b-43a8-ac1c-07c479fe9396 with order ba924605-ee17-48cf-a98d-832b2b4cb5f3.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19433"
}
```

```json
{
  "challenge_id": "a92277cb-7a46-4c5c-9c38-e67417fb279c",
  "expires_at": "2026-10-28T09:57:12.760146367Z",
  "resend_available_at": "2026-10-28T09:52:13.760146367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "856819",
  "sent_at": "2026-10-28T09:52:12.761893745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a92277cb-7a46-4c5c-9c38-e67417fb279c",
  "code": "856819",
  "device_ref": "sandbox-19433"
}
```

```json
{
  "session_id": "10490ca8-fe0b-491e-bf75-2d9690da045b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjAzMiwiaWF0IjoxNzkzMTgxMTMyLCJqdGkiOiI2YjEyYmZlYy0zZDg1LTQwYmMtOTE5MS01OTkwZjgzNjNlNmYiLCJzaWQiOiIxMDQ5MGNhOC1mZTBiLTQ5MWUtYmY3NS0yZDk2OTBkYTA0NWIifQ.uGv0pYls4WoJMRDcXMEKyzWn1g84VHoR3r-Rk8ihy1w",
  "access_expires_at": "2026-10-28T10:07:12.813522683Z",
  "refresh_token": "X8CpefdLXJrSzl919Tty-QwTim8Wsg043FONCdnK_-Y",
  "refresh_expires_at": "2026-11-27T09:52:12.813111467Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:07.584487Z",
  "last_location_at": "2026-10-28T09:52:07.584487Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/handover` → **200**

```json
{
  "command_id": "6ef73b6d-2a63-4432-a450-61b59d0195ca",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:07.584487Z",
  "last_location_at": "2026-10-28T09:52:07.584487Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:12Z",
    "sequence": 1793181132894
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:12.910867Z",
  "last_location_at": "2026-10-28T09:52:12.910867Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660974180",
  "device_ref": "sandbox-17306"
}
```

```json
{
  "challenge_id": "040d099e-eedd-4bc4-9079-64df1807ecc5",
  "expires_at": "2026-10-28T09:57:12.93377494Z",
  "resend_available_at": "2026-10-28T09:52:13.93377494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660974180` → **200**

```json
{
  "phone": "+380660974180",
  "audience": "CLIENT",
  "code": "075729",
  "sent_at": "2026-10-28T09:52:12.935469711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "040d099e-eedd-4bc4-9079-64df1807ecc5",
  "code": "075729",
  "device_ref": "sandbox-17306"
}
```

```json
{
  "session_id": "698999e1-5f27-4153-8d8d-d65b9d308df3",
  "subject": {
    "type": "CLIENT",
    "id": "6d1cf0fd-f382-4b51-a955-650ff5d9e48f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZDFjZjBmZC1mMzgyLTRiNTEtYTk1NS02NTBmZjVkOWU0OGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDMyLCJpYXQiOjE3OTMxODExMzIsImp0aSI6IjQ3YmE2M2ZmLTFiNDUtNDA0Mi1hMzVmLTcyOWZhNWFlZDNjYiIsInNpZCI6IjY5ODk5OWUxLTVmMjctNDE1My04ZDhkLWQ2NWI5ZDMwOGRmMyJ9.x7cAqI9zti6ytMhjvyFO0QsXp31oOLtWlMy9hME8LpM",
  "access_expires_at": "2026-10-28T10:07:12.987177144Z",
  "refresh_token": "rBKPFhQncw7OL-3qWMiucHRsjdrg_8KUFH7psy3a6Sg",
  "refresh_expires_at": "2026-11-27T09:52:12.986642235Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "32a85f98-56c7-43e2-b32c-7a03e3c1e522",
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
  "id": "6ddcf913-c9d6-4f21-b6ab-ce08ecbaaa1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:13.020317Z",
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
  "command_id": "cc28a1ed-6fe0-44e2-b456-46d1d585250c",
  "quote_id": "6ddcf913-c9d6-4f21-b6ab-ce08ecbaaa1b",
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
  "id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6d1cf0fd-f382-4b51-a955-650ff5d9e48f",
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
  "created_at": "2026-10-28T09:52:13.057011Z",
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
    "id": "3cb107c0-bc99-4a71-8ed8-a7635c19c622",
    "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
    "expires_at": "2026-10-28T09:52:28.059635Z",
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

`POST /api/driver/v1/offers/3cb107c0-bc99-4a71-8ed8-a7635c19c622/accept` → **200**

```json
{
  "command_id": "67961046-ce45-4695-955d-60b70ead2d1d"
}
```

```json
{
  "id": "56a28b1b-bdcc-44cb-86cb-80e741341ed6",
  "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c6b32bbd-7e46-44d6-b1a4-86f589bb32da",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c6b32bbd-7e46-44d6-b1a4-86f589bb32da",
  "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
  "assignment_id": "56a28b1b-bdcc-44cb-86cb-80e741341ed6",
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

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:13Z",
    "sequence": 1793181133152
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:13.170029Z",
  "last_location_at": "2026-10-28T09:52:13.170029Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c6b32bbd-7e46-44d6-b1a4-86f589bb32da/arrive` → **200**

```json
{
  "command_id": "8552d9da-68f3-4c47-b2bc-601fa3be4580",
  "expected_version": 0
}
```

```json
{
  "id": "c6b32bbd-7e46-44d6-b1a4-86f589bb32da",
  "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
  "assignment_id": "56a28b1b-bdcc-44cb-86cb-80e741341ed6",
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
  "arrived_at": "2026-10-28T09:52:13.204279Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c6b32bbd-7e46-44d6-b1a4-86f589bb32da/start` → **200**

```json
{
  "command_id": "91bc6d90-9b51-47bb-b238-fbd91921cd11",
  "expected_version": 1
}
```

```json
{
  "id": "c6b32bbd-7e46-44d6-b1a4-86f589bb32da",
  "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
  "assignment_id": "56a28b1b-bdcc-44cb-86cb-80e741341ed6",
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
  "arrived_at": "2026-10-28T09:52:13.204279Z",
  "started_at": "2026-10-28T09:52:13.241274Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:13Z",
    "sequence": 1793181133266
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:13.28335Z",
  "last_location_at": "2026-10-28T09:52:13.28335Z",
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
  "device_ref": "sandbox-4210"
}
```

```json
{
  "challenge_id": "81c739ab-4755-417f-9a4a-1ac62cc7daa3",
  "expires_at": "2026-10-28T09:57:13.306356437Z",
  "resend_available_at": "2026-10-28T09:52:14.306356437Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "863799",
  "sent_at": "2026-10-28T09:52:13.308159918Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81c739ab-4755-417f-9a4a-1ac62cc7daa3",
  "code": "863799",
  "device_ref": "sandbox-4210"
}
```

```json
{
  "session_id": "aa95b135-705a-4d2a-a41b-bc3a6204dfc4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjAzMywiaWF0IjoxNzkzMTgxMTMzLCJqdGkiOiJiZjAzOTI3ZC03MDRhLTRiYWYtOTZjOC0xZTVkMmZhMWUyZjYiLCJzaWQiOiJhYTk1YjEzNS03MDVhLTRkMmEtYTQxYi1iYzNhNjIwNGRmYzQifQ.3U4zsX6as1I0eRPR4jd_PjGxFIJRd4DQ_uLAGmNTU1k",
  "access_expires_at": "2026-10-28T10:07:13.362119995Z",
  "refresh_token": "IkAV25hxp3pBZHQcUXwgcWYdWY6EYJGoedQwgbUKVWI",
  "refresh_expires_at": "2026-11-27T09:52:13.361698513Z",
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
  "command_id": "cbbd62ff-7263-4a98-9c11-2f06632c454b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:13Z",
    "sequence": 1793181133409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "886e97ce-e32b-413f-bdde-ac949b1e6561",
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
  "last_heartbeat_at": "2026-10-28T09:52:13.427139Z",
  "last_location_at": "2026-10-28T09:52:13.427139Z",
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
  "session_id": "2cf4a18a-e276-4ad8-916a-48a2626d3752",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMzMsImlhdCI6MTc5MzE4MTEzMywianRpIjoiNWVlZDMxNjYtNDUyNC00YTE0LWI2OWUtMjk4OGQwZmYyNDA3Iiwic2lkIjoiMmNmNGExOGEtZTI3Ni00YWQ4LTkxNmEtNDhhMjYyNmQzNzUyIn0._wtavXypN8UTCgAdBitDsske_oArABb09R1VH8zHH3o",
  "access_expires_at": "2026-10-28T10:07:13.715645008Z",
  "refresh_token": "00PCpOShNbREowJnvUMmPggTKk1umOng-aaaFHFReR0",
  "refresh_expires_at": "2026-10-28T21:52:13.715168955Z",
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
  "session_id": "5a320c8f-2d68-479f-834c-d36fdfda0ebd",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMzQsImlhdCI6MTc5MzE4MTEzNCwianRpIjoiZTQ5ODBhODQtOWE3MC00NTgwLTlmYmEtYWI1ZGUzMWU5OGRhIiwic2lkIjoiNWEzMjBjOGYtMmQ2OC00NzlmLTgzNGMtZDM2ZmRmZGEwZWJkIn0.hvQRSeawG_9rQb7wA-rpcYpDNF9UOb63vj8ux-48AN8",
  "access_expires_at": "2026-10-28T10:07:14.192198567Z",
  "refresh_token": "p8l5yGKz6xFKbjszKo6NPp-6zpo2o67CVt_bsumH1c8",
  "refresh_expires_at": "2026-10-28T21:52:14.191749585Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d8162f53-c8f2-4b18-98b7-6218a0cba3bf` → **200**

```json
{
  "id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6d1cf0fd-f382-4b51-a955-650ff5d9e48f",
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
    "id": "56a28b1b-bdcc-44cb-86cb-80e741341ed6",
    "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c6b32bbd-7e46-44d6-b1a4-86f589bb32da",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T09:52:13.057011Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d8162f53-c8f2-4b18-98b7-6218a0cba3bf/interrupt` → **200**

```json
{
  "command_id": "3e021a2c-f12b-4758-951f-5f5701b86993",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "6d1cf0fd-f382-4b51-a955-650ff5d9e48f",
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
      "id": "56a28b1b-bdcc-44cb-86cb-80e741341ed6",
      "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "c6b32bbd-7e46-44d6-b1a4-86f589bb32da",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T09:52:13.057011Z",
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
    "id": "d7c9687a-9975-4605-927a-db7b0877df57",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "6d1cf0fd-f382-4b51-a955-650ff5d9e48f",
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
    "id": "2fdb45c1-40b0-4ee5-852e-623dadd44bb8",
    "order_id": "d7c9687a-9975-4605-927a-db7b0877df57",
    "expires_at": "2026-10-28T09:52:29.264263Z",
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

`POST /api/driver/v1/offers/2fdb45c1-40b0-4ee5-852e-623dadd44bb8/accept` → **200**

```json
{
  "command_id": "91f167c2-b7c9-49b1-8099-0c7e40adbf39"
}
```

```json
{
  "id": "536dedb6-83d4-4c7d-983d-02efa2cd7eb5",
  "order_id": "d7c9687a-9975-4605-927a-db7b0877df57",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b64c30cf-afc9-4154-a11d-dc66e0949dc6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b64c30cf-afc9-4154-a11d-dc66e0949dc6",
  "order_id": "d7c9687a-9975-4605-927a-db7b0877df57",
  "assignment_id": "536dedb6-83d4-4c7d-983d-02efa2cd7eb5",
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
  "session_id": "886e97ce-e32b-413f-bdde-ac949b1e6561",
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
  "last_heartbeat_at": "2026-10-28T09:52:13.427139Z",
  "last_location_at": "2026-10-28T09:52:13.427139Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/886e97ce-e32b-413f-bdde-ac949b1e6561/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:14Z",
    "sequence": 1793181134391
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "886e97ce-e32b-413f-bdde-ac949b1e6561",
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
  "last_heartbeat_at": "2026-10-28T09:52:14.409549Z",
  "last_location_at": "2026-10-28T09:52:14.409549Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b64c30cf-afc9-4154-a11d-dc66e0949dc6/arrive` → **200**

```json
{
  "command_id": "d3b42930-ea8f-4a33-81fc-8572124bbd93",
  "expected_version": 0
}
```

```json
{
  "id": "b64c30cf-afc9-4154-a11d-dc66e0949dc6",
  "order_id": "d7c9687a-9975-4605-927a-db7b0877df57",
  "assignment_id": "536dedb6-83d4-4c7d-983d-02efa2cd7eb5",
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
  "arrived_at": "2026-10-28T09:52:14.445323Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b64c30cf-afc9-4154-a11d-dc66e0949dc6/start` → **200**

```json
{
  "command_id": "58a99849-0345-4497-b9d0-ce7989c2a432",
  "expected_version": 1
}
```

```json
{
  "id": "b64c30cf-afc9-4154-a11d-dc66e0949dc6",
  "order_id": "d7c9687a-9975-4605-927a-db7b0877df57",
  "assignment_id": "536dedb6-83d4-4c7d-983d-02efa2cd7eb5",
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
  "arrived_at": "2026-10-28T09:52:14.445323Z",
  "started_at": "2026-10-28T09:52:14.481372Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b64c30cf-afc9-4154-a11d-dc66e0949dc6/complete` → **200**

```json
{
  "command_id": "fdf8c1bc-37be-478d-9ac3-b26945074b41",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:52:14Z"
}
```

```json
{
  "id": "b64c30cf-afc9-4154-a11d-dc66e0949dc6",
  "order_id": "d7c9687a-9975-4605-927a-db7b0877df57",
  "assignment_id": "536dedb6-83d4-4c7d-983d-02efa2cd7eb5",
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
  "arrived_at": "2026-10-28T09:52:14.445323Z",
  "started_at": "2026-10-28T09:52:14.481372Z",
  "completed_at": "2026-10-28T09:52:14.523275Z",
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
    "id": "d7c9687a-9975-4605-927a-db7b0877df57",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:52:14.255572Z",
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
    "id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:52:13.057011Z",
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

`GET /api/operator/v1/orders/d8162f53-c8f2-4b18-98b7-6218a0cba3bf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:52:13.057442Z",
      "actor": {
        "type": "CLIENT",
        "id": "6d1cf0fd-f382-4b51-a955-650ff5d9e48f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
        "quote_id": "6ddcf913-c9d6-4f21-b6ab-ce08ecbaaa1b",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "df49bbc1-6ea4-49be-9fd5-001bd763bcc3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:52:13.058981Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
        "attempt_id": "724874b8-bc7f-44e3-93a5-376d2815258d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "df49bbc1-6ea4-49be-9fd5-001bd763bcc3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:52:13.061991Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3cb107c0-bc99-4a71-8ed8-a7635c19c622",
        "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "df49bbc1-6ea4-49be-9fd5-001bd763bcc3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:52:13.116924Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3cb107c0-bc99-4a71-8ed8-a7635c19c622",
        "order_id": "d8162f53-c8f2-4b18-98b7-6218a0cba3bf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "56a28b1b-bdcc-44cb-86cb-80e741341ed6"
      },
      "correlation_id": "b9b33fa5-94cf-4aae-a5b9-110b8a2a99cb"
```

Done: interrupted d8162f53-c8f2-4b18-98b7-6218a0cba3bf, follow-up d7c9687a-9975-4605-927a-db7b0877df57.

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
  "session_id": "eaaae164-49f1-44c3-9158-f2f08730b995",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMzcsImlhdCI6MTc5MzE4MTEzNywianRpIjoiMjlmMWE2MDYtNTVkNS00OTkyLWE4NmEtOWVmNmM4YTkwMDY1Iiwic2lkIjoiZWFhYWUxNjQtNDlmMS00NGMzLTkxNTgtZjJmMDg3MzBiOTk1In0.ccEjNfxu4vvbCoGaxZ-lXUPECdZq0edwopFwUx_Mz6s",
  "access_expires_at": "2026-10-28T10:07:17.938211157Z",
  "refresh_token": "oeAMD_jEWurMce1ziPQijgW_IeIK5pWB9XFkO5Fg8X0",
  "refresh_expires_at": "2026-10-28T21:52:17.937777167Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "06b254c2-0fe9-4c72-b7a9-cb07d44078f1",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:52:17Z"
}
```

```json
{
  "id": "7dd040f2-e68c-49e6-aa21-8edd6c7049da",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:52:17Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7dd040f2-e68c-49e6-aa21-8edd6c7049da/publish` → **200**

```json
{
  "command_id": "1480e72d-ebd6-45db-b354-5c258f87451b",
  "expected_version": 0
}
```

```json
{
  "id": "7dd040f2-e68c-49e6-aa21-8edd6c7049da",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:52:18.022614Z",
  "published_at": "2026-10-28T09:52:18.022614Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "7dd040f2-e68c-49e6-aa21-8edd6c7049da",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T09:52:18.022614Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637134252",
  "device_ref": "sandbox-18353"
}
```

```json
{
  "challenge_id": "57bdf1f6-9439-4898-841d-1a09e9cc0ba0",
  "expires_at": "2026-10-28T09:57:18.080462023Z",
  "resend_available_at": "2026-10-28T09:52:19.080462023Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637134252` → **200**

```json
{
  "phone": "+380637134252",
  "audience": "CLIENT",
  "code": "256844",
  "sent_at": "2026-10-28T09:52:18.082259383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57bdf1f6-9439-4898-841d-1a09e9cc0ba0",
  "code": "256844",
  "device_ref": "sandbox-18353"
}
```

```json
{
  "session_id": "04297540-7842-4a3d-a5f8-f39bf2b827d4",
  "subject": {
    "type": "CLIENT",
    "id": "ff5ddb8b-bde6-42a7-b43d-c21daff9ea81"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjVkZGI4Yi1iZGU2LTQyYTctYjQzZC1jMjFkYWZmOWVhODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDM4LCJpYXQiOjE3OTMxODExMzgsImp0aSI6IjM5NWRlZDQzLTg5YWYtNDkxYi1hNjEzLTA5ZDE1MTIxZjFhMiIsInNpZCI6IjA0Mjk3NTQwLTc4NDItNGEzZC1hNWY4LWYzOWJmMmI4MjdkNCJ9.iicYkzYXDfEwTGd-5OpUIoluwie-19WujYS5QpLgreg",
  "access_expires_at": "2026-10-28T10:07:18.134393548Z",
  "refresh_token": "qEQeLk1wZY5cw1KlkxcxcIjFdwFZUmoiS4m_wO5wjB4",
  "refresh_expires_at": "2026-11-27T09:52:18.134005656Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "7dd040f2-e68c-49e6-aa21-8edd6c7049da",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T09:52:18.022614Z",
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
  "command_id": "338fdc14-1dbe-4158-89b2-9e57d36a64f5",
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
  "id": "041ec040-a4b2-4026-b987-5b80b22b0f20",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:18.192019Z",
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
  "command_id": "f6aa659c-f1cb-45b1-a62f-6a035139bece",
  "quote_id": "041ec040-a4b2-4026-b987-5b80b22b0f20",
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
  "correlation_id": "31309fe6-4b83-46f7-baf7-e5e2ab295922"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "84d2d035-8cf3-4621-b621-7583fca36a06",
  "version_id": "7dd040f2-e68c-49e6-aa21-8edd6c7049da",
  "language": "uk"
}
```

```json
{
  "version_id": "7dd040f2-e68c-49e6-aa21-8edd6c7049da",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T09:52:18.259092Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9f5ade91-e8fe-41d1-8172-4b0afb8053fb",
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
  "id": "a8b25e80-24ab-4245-8638-7d8e8c47b47c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:18.294695Z",
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
  "command_id": "33738d54-62fe-4192-b124-531280c82490",
  "quote_id": "a8b25e80-24ab-4245-8638-7d8e8c47b47c",
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
  "id": "70d62d99-e592-471a-b2b6-f9ebb3e52057",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff5ddb8b-bde6-42a7-b43d-c21daff9ea81",
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
  "created_at": "2026-10-28T09:52:18.326625Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/70d62d99-e592-471a-b2b6-f9ebb3e52057` → **200**

```json
{
  "id": "70d62d99-e592-471a-b2b6-f9ebb3e52057",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff5ddb8b-bde6-42a7-b43d-c21daff9ea81",
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
  "created_at": "2026-10-28T09:52:18.326625Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/70d62d99-e592-471a-b2b6-f9ebb3e52057/cancel` → **200**

```json
{
  "command_id": "e61cbe1f-555a-4d9d-865a-e5b47d7261a5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "70d62d99-e592-471a-b2b6-f9ebb3e52057",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ff5ddb8b-bde6-42a7-b43d-c21daff9ea81",
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
  "created_at": "2026-10-28T09:52:18.326625Z",
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

`POST /api/admin/v1/legal-documents/7dd040f2-e68c-49e6-aa21-8edd6c7049da` → **409**

```json
{
  "command_id": "dae14208-5b53-43e0-8a34-84d65ff27951",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:52:18Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/7dd040f2-e68c-49e6-aa21-8edd6c7049da",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a30afb1c-ec60-4b6f-8180-18e593a27e97"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "840e3845-29c9-4011-9883-e551917dd98c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:52:18Z"
}
```

```json
{
  "id": "348d30f5-a55c-44d6-a95d-2594f41a1d01",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:52:18Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/348d30f5-a55c-44d6-a95d-2594f41a1d01/publish` → **200**

```json
{
  "command_id": "d270550e-e82d-4870-82f0-307210f99242",
  "expected_version": 0
}
```

```json
{
  "id": "348d30f5-a55c-44d6-a95d-2594f41a1d01",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:52:18.493073Z",
  "published_at": "2026-10-28T09:52:18.493073Z",
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
  "device_ref": "sandbox-16550"
}
```

```json
{
  "challenge_id": "6b8883c0-e9d3-4238-9635-7f288b4acf3a",
  "expires_at": "2026-10-28T09:57:18.530413818Z",
  "resend_available_at": "2026-10-28T09:52:19.530413818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "561704",
  "sent_at": "2026-10-28T09:52:18.532218079Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b8883c0-e9d3-4238-9635-7f288b4acf3a",
  "code": "561704",
  "device_ref": "sandbox-16550"
}
```

```json
{
  "session_id": "12dd7989-19cb-4562-bc55-c12e7e181287",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjAzOCwiaWF0IjoxNzkzMTgxMTM4LCJqdGkiOiI5MDRkMTkzMS1kZGY4LTRhYTMtYmZhNC1mZjc4ZjhmYjMwMzEiLCJzaWQiOiIxMmRkNzk4OS0xOWNiLTQ1NjItYmM1NS1jMTJlN2UxODEyODcifQ.6_z_uKLaAvL6WYh6AhEnifnGoP0UIDsEpIiFFuiOKpc",
  "access_expires_at": "2026-10-28T10:07:18.584818601Z",
  "refresh_token": "NKUdy_6bUFa9fkQ3mMDOwOGodjlz-Jd_MfFWalC4Y1E",
  "refresh_expires_at": "2026-11-27T09:52:18.584373405Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "886e97ce-e32b-413f-bdde-ac949b1e6561",
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
  "last_heartbeat_at": "2026-10-28T09:52:14.409549Z",
  "last_location_at": "2026-10-28T09:52:14.409549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/886e97ce-e32b-413f-bdde-ac949b1e6561/handover` → **200**

```json
{
  "command_id": "4c7a8bab-19e7-402f-90ff-77e0edf08de4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "886e97ce-e32b-413f-bdde-ac949b1e6561",
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
  "last_heartbeat_at": "2026-10-28T09:52:14.409549Z",
  "last_location_at": "2026-10-28T09:52:14.409549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/886e97ce-e32b-413f-bdde-ac949b1e6561/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:18Z",
    "sequence": 1793181138666
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "886e97ce-e32b-413f-bdde-ac949b1e6561",
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
  "last_heartbeat_at": "2026-10-28T09:52:18.684048Z",
  "last_location_at": "2026-10-28T09:52:18.684048Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674400401",
  "device_ref": "sandbox-30814"
}
```

```json
{
  "challenge_id": "d8f34eaf-a9f4-4f91-bf35-a579f0ac007c",
  "expires_at": "2026-10-28T09:57:18.710146713Z",
  "resend_available_at": "2026-10-28T09:52:19.710146713Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674400401` → **200**

```json
{
  "phone": "+380674400401",
  "audience": "CLIENT",
  "code": "038500",
  "sent_at": "2026-10-28T09:52:18.711899258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8f34eaf-a9f4-4f91-bf35-a579f0ac007c",
  "code": "038500",
  "device_ref": "sandbox-30814"
}
```

```json
{
  "session_id": "7852a7d0-cc11-4ee3-a55c-9d05b299a7a1",
  "subject": {
    "type": "CLIENT",
    "id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NGU5NzE4Mi1iYjAwLTRiN2YtOWVlMy0xYjdlMWNkOGIyN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDM4LCJpYXQiOjE3OTMxODExMzgsImp0aSI6ImU2OWE1MzM4LTg2NjEtNGFiZi05MmExLTE2Mzg0MDk4YjRjZCIsInNpZCI6Ijc4NTJhN2QwLWNjMTEtNGVlMy1hNTVjLTlkMDViMjk5YTdhMSJ9.hDCKcyKxJBSfNSoSdGvM9zn2l9BhnI65rewuVU2vLWU",
  "access_expires_at": "2026-10-28T10:07:18.764022065Z",
  "refresh_token": "EQG-1uCOeGpMy6zd9NRo4oxieqyCmgHdE9W5OSdAKqI",
  "refresh_expires_at": "2026-11-27T09:52:18.763607003Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3357d83d-f8e1-4c16-811e-c3cc1a460cf8",
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
  "id": "cb898ec2-d1bd-42ca-bfd0-64d4dd14a6b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:18.797012Z",
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
  "command_id": "5052ea61-33a0-4c0e-9217-1e14e7276f16",
  "quote_id": "cb898ec2-d1bd-42ca-bfd0-64d4dd14a6b4",
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
    "phone": "+380671259312"
  }
}
```

```json
{
  "id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
  "created_at": "2026-10-28T09:52:18.833562Z",
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
    "id": "4f5c5b76-002f-4745-9d30-4b43efb44409",
    "order_id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
    "expires_at": "2026-10-28T09:52:33.836245Z",
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

`POST /api/driver/v1/offers/4f5c5b76-002f-4745-9d30-4b43efb44409/accept` → **200**

```json
{
  "command_id": "47c31f0d-e670-4bb6-8b41-f3d1ae2609b8"
}
```

```json
{
  "id": "0f0efb13-9ce6-41bd-95a0-1d3256ac22d5",
  "order_id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c5e14e7d-1dbc-4903-b87a-340488a3a497",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c5e14e7d-1dbc-4903-b87a-340488a3a497",
  "order_id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
  "assignment_id": "0f0efb13-9ce6-41bd-95a0-1d3256ac22d5",
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
    "phone": "+380671259312"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7abab2af-e6ce-47c0-9f7a-06dc29791974",
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
  "id": "857f8d34-db33-4bc1-97dd-42e223ddb4b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:18.963143Z",
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
  "command_id": "32af2fff-72dc-4f2a-9288-b57acf4da1a3",
  "quote_id": "857f8d34-db33-4bc1-97dd-42e223ddb4b7",
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
  "id": "213152fb-75a1-4c8f-978a-a70ed476c187",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
  "created_at": "2026-10-28T09:52:19.004221Z",
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
  "command_id": "a13296d6-11c8-415c-ba1d-d636b24e0aa3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T12:52:19Z"
}
```

```json
{
  "id": "1f6b5438-a1e3-4ceb-9119-79ace5983389",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:19.049388Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:52:19Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "06991a6b-452b-4713-a3d0-9d580fec5694",
  "quote_id": "1f6b5438-a1e3-4ceb-9119-79ace5983389",
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
  "pickup_at": "2026-10-28T12:52:19Z"
}
```

```json
{
  "id": "00967bc8-2029-4bfd-8b43-2cc8113ddf6e",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
  "created_at": "2026-10-28T09:52:19.08495Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:52:19Z",
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
  "command_id": "b0ac2c90-541c-4432-aa7c-ce364c6bac52",
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
  "id": "3f70ac29-2567-48b1-901d-c3d3c32d9c97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:19.122309Z",
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
  "command_id": "525977fe-37f7-4499-80e8-6ba68a9953e9",
  "quote_id": "3f70ac29-2567-48b1-901d-c3d3c32d9c97",
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
  "correlation_id": "0493918c-ebca-42ab-ae21-7903d4c3e667"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "00967bc8-2029-4bfd-8b43-2cc8113ddf6e",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
      "created_at": "2026-10-28T09:52:19.08495Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T12:52:19Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "213152fb-75a1-4c8f-978a-a70ed476c187",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
      "created_at": "2026-10-28T09:52:19.004221Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "213152fb-75a1-4c8f-978a-a70ed476c187",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
  "created_at": "2026-10-28T09:52:19.004221Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/5e9fc36f-f74a-4178-b14c-19ad9b5db04f` → **200**

```json
{
  "id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
    "id": "0f0efb13-9ce6-41bd-95a0-1d3256ac22d5",
    "order_id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c5e14e7d-1dbc-4903-b87a-340488a3a497",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:52:18.833562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5e9fc36f-f74a-4178-b14c-19ad9b5db04f/cancel` → **200**

```json
{
  "command_id": "42ed7a6c-758b-4b0f-8ed4-072c48496919",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
    "id": "0f0efb13-9ce6-41bd-95a0-1d3256ac22d5",
    "order_id": "5e9fc36f-f74a-4178-b14c-19ad9b5db04f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c5e14e7d-1dbc-4903-b87a-340488a3a497",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:52:18.833562Z",
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

`GET /api/rider/v1/orders/213152fb-75a1-4c8f-978a-a70ed476c187` → **200**

```json
{
  "id": "213152fb-75a1-4c8f-978a-a70ed476c187",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
  "created_at": "2026-10-28T09:52:19.004221Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/213152fb-75a1-4c8f-978a-a70ed476c187/cancel` → **200**

```json
{
  "command_id": "edf7680f-8479-4725-8161-1eda6919d905",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "213152fb-75a1-4c8f-978a-a70ed476c187",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
  "created_at": "2026-10-28T09:52:19.004221Z",
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

`GET /api/rider/v1/orders/00967bc8-2029-4bfd-8b43-2cc8113ddf6e` → **200**

```json
{
  "id": "00967bc8-2029-4bfd-8b43-2cc8113ddf6e",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
  "created_at": "2026-10-28T09:52:19.08495Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:52:19Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/00967bc8-2029-4bfd-8b43-2cc8113ddf6e/cancel` → **200**

```json
{
  "command_id": "62a357af-b05b-4d73-8e42-358254a0965d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "00967bc8-2029-4bfd-8b43-2cc8113ddf6e",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "74e97182-bb00-4b7f-9ee3-1b7e1cd8b27f",
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
  "created_at": "2026-10-28T09:52:19.08495Z",
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
  "pickup_at": "2026-10-28T12:52:19Z",
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
  "session_id": "886e97ce-e32b-413f-bdde-ac949b1e6561",
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
  "last_heartbeat_at": "2026-10-28T09:52:18.684048Z",
  "last_location_at": "2026-10-28T09:52:18.684048Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/886e97ce-e32b-413f-bdde-ac949b1e6561/close` → **200**

```json
{
  "command_id": "8be02719-ae45-4da9-aa99-6d540b406c65",
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

Done: orders 5e9fc36f-f74a-4178-b14c-19ad9b5db04f, 213152fb-75a1-4c8f-978a-a70ed476c187, 00967bc8-2029-4bfd-8b43-2cc8113ddf6e.

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
  "session_id": "bf8702a7-f92c-452e-a4fd-2a3378b90b80",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwMzksImlhdCI6MTc5MzE4MTEzOSwianRpIjoiYTYzYjZkMmQtZGJiOC00YWUwLWEwYTgtY2NhZDFhZWZiYjVjIiwic2lkIjoiYmY4NzAyYTctZjkyYy00NTJlLWE0ZmQtMmEzMzc4YjkwYjgwIn0.j5dM5kFrn4j8Hs2MVwxbiH-nvM8OYWyU0XL08yIWrE8",
  "access_expires_at": "2026-10-28T10:07:19.720852238Z",
  "refresh_token": "U4D-NPaCZreH2DGHkrpqFo3fcdTZJpgmuxRpeQdeSCE",
  "refresh_expires_at": "2026-10-28T21:52:19.720388915Z",
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
  "session_id": "a91001ea-9078-4dc6-bb94-56249534b9fc",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNDAsImlhdCI6MTc5MzE4MTE0MCwianRpIjoiYWM0OWFiZjgtODMwMC00MTQ0LTk4MTUtY2ZlZmI2YjY3NjY5Iiwic2lkIjoiYTkxMDAxZWEtOTA3OC00ZGM2LWJiOTQtNTYyNDk1MzRiOWZjIn0.20p-fV1wH5m3HJHS7IhD6QyxvMb32f5sZGwzmkEuVVw",
  "access_expires_at": "2026-10-28T10:07:20.004018591Z",
  "refresh_token": "l3Jf6yfWQ0Ft80hfZusnpzR1CBc5MTV5KYukd9Y9pJA",
  "refresh_expires_at": "2026-10-28T21:52:20.003479316Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32242"
}
```

```json
{
  "challenge_id": "b96822c1-cb33-4750-a1e0-19d369f12c0a",
  "expires_at": "2026-10-28T09:57:20.030564825Z",
  "resend_available_at": "2026-10-28T09:52:21.030564825Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "619572",
  "sent_at": "2026-10-28T09:52:20.032462362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b96822c1-cb33-4750-a1e0-19d369f12c0a",
  "code": "619572",
  "device_ref": "sandbox-32242"
}
```

```json
{
  "session_id": "5785aa20-a75c-4741-95f7-883751fe0a27",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjA0MCwiaWF0IjoxNzkzMTgxMTQwLCJqdGkiOiJmNjU5ZjkzMC0yMjE4LTQzODItYjA1NS1jYjcxZmQ4ZjI1ZDEiLCJzaWQiOiI1Nzg1YWEyMC1hNzVjLTQ3NDEtOTVmNy04ODM3NTFmZTBhMjcifQ.xyqN4m-7cypwkm0LeHxUM3UWDi4EREMcKAFEUKloolY",
  "access_expires_at": "2026-10-28T10:07:20.090748719Z",
  "refresh_token": "YfCFj05wVs7k9q_BsX7fsT_PTT7-opAO1lyx6nZPJOo",
  "refresh_expires_at": "2026-11-27T09:52:20.090271905Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:13.28335Z",
  "last_location_at": "2026-10-28T09:52:13.28335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/handover` → **200**

```json
{
  "command_id": "57d27e71-a72b-4166-b5c7-c25656c4d24d",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:13.28335Z",
  "last_location_at": "2026-10-28T09:52:13.28335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:20Z",
    "sequence": 1793181140175
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:20.192686Z",
  "last_location_at": "2026-10-28T09:52:20.192686Z",
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
  "command_id": "f96589dd-62d7-4091-bf75-da5d49c99468",
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
  "effective_at": "2026-10-28T09:52:20.25917Z",
  "changed_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T09:52:20.286753607Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7b999f1f-aae0-4191-bf98-9121845150ee",
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
  "id": "e191f396-7bb6-43f6-a903-db2cf1e6cd5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:20.320316Z",
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
  "command_id": "7f0bf608-e00b-46bb-80b4-3a73296b7d57",
  "quote_id": "e191f396-7bb6-43f6-a903-db2cf1e6cd5a",
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
    "phone": "+380671119485"
  }
}
```

```json
{
  "id": "24be0bb6-43e6-4410-89c2-e1d774336f44",
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
  "created_at": "2026-10-28T09:52:20.355946Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671119485"
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
    "id": "6d98573c-4af7-4bac-b615-5fa41a719466",
    "order_id": "24be0bb6-43e6-4410-89c2-e1d774336f44",
    "expires_at": "2026-10-28T09:52:35.358493Z",
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

`POST /api/driver/v1/offers/6d98573c-4af7-4bac-b615-5fa41a719466/accept` → **200**

```json
{
  "command_id": "d02f730d-0bb9-42e4-bac8-ef82e0d6744f"
}
```

```json
{
  "id": "c0cee190-dce0-47bb-8f78-20e7d45909f8",
  "order_id": "24be0bb6-43e6-4410-89c2-e1d774336f44",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f8f68afc-1d71-4aad-b276-96ef7aa0a509",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f8f68afc-1d71-4aad-b276-96ef7aa0a509",
  "order_id": "24be0bb6-43e6-4410-89c2-e1d774336f44",
  "assignment_id": "c0cee190-dce0-47bb-8f78-20e7d45909f8",
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
    "phone": "+380671119485"
  }
}
```

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:20Z",
    "sequence": 1793181140451
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:20.467989Z",
  "last_location_at": "2026-10-28T09:52:20.467989Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f8f68afc-1d71-4aad-b276-96ef7aa0a509/arrive` → **200**

```json
{
  "command_id": "0f7126f9-893c-4249-ad83-062c709f23cf",
  "expected_version": 0
}
```

```json
{
  "id": "f8f68afc-1d71-4aad-b276-96ef7aa0a509",
  "order_id": "24be0bb6-43e6-4410-89c2-e1d774336f44",
  "assignment_id": "c0cee190-dce0-47bb-8f78-20e7d45909f8",
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
  "arrived_at": "2026-10-28T09:52:20.499731Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671119485"
  }
}
```

`POST /api/driver/v1/trips/f8f68afc-1d71-4aad-b276-96ef7aa0a509/start` → **200**

```json
{
  "command_id": "0ae30ef2-0499-463b-a2b7-abeedfad4c13",
  "expected_version": 1
}
```

```json
{
  "id": "f8f68afc-1d71-4aad-b276-96ef7aa0a509",
  "order_id": "24be0bb6-43e6-4410-89c2-e1d774336f44",
  "assignment_id": "c0cee190-dce0-47bb-8f78-20e7d45909f8",
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
  "arrived_at": "2026-10-28T09:52:20.499731Z",
  "started_at": "2026-10-28T09:52:20.534159Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671119485"
  }
}
```

`POST /api/driver/v1/trips/f8f68afc-1d71-4aad-b276-96ef7aa0a509/complete` → **200**

```json
{
  "command_id": "38374ef1-e149-46c9-8b6a-55ec0b42eefc",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:52:20Z",
  "cash_received": true
}
```

```json
{
  "id": "f8f68afc-1d71-4aad-b276-96ef7aa0a509",
  "order_id": "24be0bb6-43e6-4410-89c2-e1d774336f44",
  "assignment_id": "c0cee190-dce0-47bb-8f78-20e7d45909f8",
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
  "arrived_at": "2026-10-28T09:52:20.499731Z",
  "started_at": "2026-10-28T09:52:20.534159Z",
  "completed_at": "2026-10-28T09:52:20.572988Z",
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
  "command_id": "41ae1edc-d51f-4db3-a77e-9bfa4f08c61f",
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
  "id": "e4dcc7dc-1e70-48ce-a3d7-dcb2542dafcd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:20.611985Z",
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
  "command_id": "6d88726c-f634-472e-bcb5-eb56268fb6a7",
  "quote_id": "e4dcc7dc-1e70-48ce-a3d7-dcb2542dafcd",
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
    "phone": "+3806711117115"
  }
}
```

```json
{
  "id": "0b19d84d-5390-403b-869d-812d8ace3a30",
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
  "created_at": "2026-10-28T09:52:20.646191Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117115"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0b19d84d-5390-403b-869d-812d8ace3a30` → **200**

```json
{
  "id": "0b19d84d-5390-403b-869d-812d8ace3a30",
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
  "created_at": "2026-10-28T09:52:20.646191Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117115"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0b19d84d-5390-403b-869d-812d8ace3a30/cancel` → **200**

```json
{
  "command_id": "8520ca58-f3f1-4ac3-9660-951d77d625a9",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0b19d84d-5390-403b-869d-812d8ace3a30",
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
  "created_at": "2026-10-28T09:52:20.646191Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117115"
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
  "staff_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T09:52:20.577305Z",
  "last_entries": [
    {
      "order_id": "0b19d84d-5390-403b-869d-812d8ace3a30",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T09:52:20.711608Z"
    },
    {
      "order_id": "24be0bb6-43e6-4410-89c2-e1d774336f44",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T09:52:20.577305Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6d93636-ceb2-420a-8874-73a0d7aae39d",
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
  "last_heartbeat_at": "2026-10-28T09:52:20.467989Z",
  "last_location_at": "2026-10-28T09:52:20.467989Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6d93636-ceb2-420a-8874-73a0d7aae39d/close` → **200**

```json
{
  "command_id": "d1733e4b-bafb-4b5d-8f74-8ce9c6c09c83",
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

Done: operator bonus for fulfilled 24be0bb6-43e6-4410-89c2-e1d774336f44 and operator-fault cancellation 0b19d84d-5390-403b-869d-812d8ace3a30.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672213380",
  "device_ref": "sandbox-9370"
}
```

```json
{
  "challenge_id": "28f11d1c-15c7-4d0e-a140-15f0a56441dc",
  "expires_at": "2026-10-28T09:57:22.84967479Z",
  "resend_available_at": "2026-10-28T09:52:23.84967479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672213380` → **200**

```json
{
  "phone": "+380672213380",
  "audience": "CLIENT",
  "code": "831722",
  "sent_at": "2026-10-28T09:52:22.851554802Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676768610",
  "device_ref": "sandbox-11903",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d868f7e4-1c16-4f5c-a14c-5961df64dd97",
  "expires_at": "2026-10-28T09:57:22.901006303Z",
  "resend_available_at": "2026-10-28T09:52:23.901006303Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676768610` → **200**

```json
{
  "phone": "+380676768610",
  "audience": "CLIENT",
  "code": "473263",
  "sent_at": "2026-10-28T09:52:22.902968367Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670760000",
  "device_ref": "sandbox-32130"
}
```

```json
{
  "challenge_id": "f59d75b2-647b-4524-9a5a-4d016d2dba17",
  "expires_at": "2026-10-28T09:57:22.951609832Z",
  "resend_available_at": "2026-10-28T09:52:23.951609832Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670760000` → **200**

```json
{
  "phone": "+380670760000",
  "audience": "CLIENT",
  "code": "571194",
  "sent_at": "2026-10-28T09:52:22.953925568Z",
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
  "session_id": "3c67c22f-32a4-40ac-812b-c1230a8dc469",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNDMsImlhdCI6MTc5MzE4MTE0MywianRpIjoiM2RlNzcyNjItOGU5Ny00N2FjLTg4ZTUtNjY1NGNkNWM4MzQ2Iiwic2lkIjoiM2M2N2MyMmYtMzJhNC00MGFjLTgxMmItYzEyMzBhOGRjNDY5In0.DkJPKnL3S83bmN57lhMtnqeflZsSS1DTpacvw7j1zVY",
  "access_expires_at": "2026-10-28T10:07:23.303407762Z",
  "refresh_token": "ZI7Og3tKMNu4ZoqGncW7Tx_FjGViOQx222wflhOKiBc",
  "refresh_expires_at": "2026-10-28T21:52:23.303016154Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670760000` → **200**

```json
{
  "deliveries": [
    {
      "id": "d4f85852-9227-43a1-9149-bd5fc8883caa",
      "challenge_id": "f59d75b2-647b-4524-9a5a-4d016d2dba17",
      "phone": "+380670760000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-31feea02-713d-4be2-a99e-478489854669",
      "error": null,
      "attempted_at": "2026-10-28T09:52:22.954144Z"
    },
    {
      "id": "30f7b32c-1cde-44cf-bfeb-5f7bef30474e",
      "challenge_id": "f59d75b2-647b-4524-9a5a-4d016d2dba17",
      "phone": "+380670760000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T09:52:22.953512Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670760000` → **200**

```json
{
  "phone": "+380670760000",
  "audience": "CLIENT",
  "code": "571194",
  "sent_at": "2026-10-28T09:52:22.953925568Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676768610` → **200**

```json
{
  "deliveries": [
    {
      "id": "64c1f76e-2821-48fb-8221-8badafbbfab7",
      "challenge_id": "d868f7e4-1c16-4f5c-a14c-5961df64dd97",
      "phone": "+380676768610",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d9b0493d-35ce-4114-b209-e685033d2cb4",
      "error": null,
      "attempted_at": "2026-10-28T09:52:22.903219Z"
    }
  ]
}
```

Done: SMS to +380672213380, a call to +380676768610, SMS then a call to +380670760000.

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
  "session_id": "c12acd97-8669-4349-bf1d-f3939f7fd85a",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNDMsImlhdCI6MTc5MzE4MTE0MywianRpIjoiNjU4NzdmNTctY2FkOC00YTAzLWI1ZGUtNjAxOGM1M2U0OTVkIiwic2lkIjoiYzEyYWNkOTctODY2OS00MzQ5LWJmMWQtZjM5MzlmN2ZkODVhIn0.87rZ3YWZHYzBiPcOrtfFHLrcVcDdis8BNl_vCqAXF-0",
  "access_expires_at": "2026-10-28T10:07:23.678321325Z",
  "refresh_token": "ePDwIoTV4iNT7FtQAqxEvcIZsidPfVADuzsRxzAht3Y",
  "refresh_expires_at": "2026-10-28T21:52:23.677935536Z",
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
  "session_id": "a70de617-9512-4bc4-83e3-1fc1630f25cb",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNDMsImlhdCI6MTc5MzE4MTE0MywianRpIjoiNDg1MWU5ZTMtNzNhOS00MjA2LWI1OGQtYTNkZDc1MDEzZmI5Iiwic2lkIjoiYTcwZGU2MTctOTUxMi00YmM0LTgzZTMtMWZjMTYzMGYyNWNiIn0.2dJGl97QVf4KEaelDZK4-3Ok39vG1mzc_gPj7AE6OAI",
  "access_expires_at": "2026-10-28T10:07:23.961559829Z",
  "refresh_token": "dAre586Z1DSlvUnmaUEqLITmfaG2s7kbcMPXDkmevmU",
  "refresh_expires_at": "2026-10-28T21:52:23.961149244Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
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

`POST /api/admin/v1/staff-extensions/26acc14d-dcb6-42eb-aca6-5f3e247b04c7` → **200**

```json
{
  "command_id": "6e3086cf-13e7-4d37-848d-6fa27f3cedc7",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "3b7414a3-36e8-4e9e-8798-55daf17b9562",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:52:24.084892Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:52:24.084892Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "34396329-83fd-498f-9c74-cd4719ce3fe2",
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
  "id": "43b0a74a-036c-4343-8bb9-ade6eb70576d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:24.146124Z",
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
  "command_id": "8a2dd7e8-edba-40c5-8870-6238ef69210c",
  "quote_id": "43b0a74a-036c-4343-8bb9-ade6eb70576d",
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
    "phone": "+380679364544"
  }
}
```

```json
{
  "id": "3ee0f33f-9239-49c1-899b-f5c8783ba9c7",
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
  "created_at": "2026-10-28T09:52:24.1823Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679364544"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/3ee0f33f-9239-49c1-899b-f5c8783ba9c7/calls` → **201**

```json
{
  "command_id": "f749c088-b7ed-439f-9a82-0c9484127d9d",
  "to": "CALLER"
}
```

```json
{
  "id": "40afdf59-2913-42a0-8063-a346dc54037c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "order_ids": [
    "3ee0f33f-9239-49c1-899b-f5c8783ba9c7"
  ],
  "started_at": "2026-10-28T09:52:24.227643Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/3ee0f33f-9239-49c1-899b-f5c8783ba9c7/calls` → **201**

```json
{
  "command_id": "f749c088-b7ed-439f-9a82-0c9484127d9d",
  "to": "CALLER"
}
```

```json
{
  "id": "40afdf59-2913-42a0-8063-a346dc54037c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "order_ids": [
    "3ee0f33f-9239-49c1-899b-f5c8783ba9c7"
  ],
  "started_at": "2026-10-28T09:52:24.227643Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "40afdf59-2913-42a0-8063-a346dc54037c",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679364544",
    "at": "2026-10-28T09:52:24.229477696Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "40afdf59-2913-42a0-8063-a346dc54037c",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.12299",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "40afdf59-2913-42a0-8063-a346dc54037c"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "40afdf59-2913-42a0-8063-a346dc54037c",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=3ee0f33f-9239-49c1-899b-f5c8783ba9c7` → **200**

```json
{
  "calls": [
    {
      "id": "40afdf59-2913-42a0-8063-a346dc54037c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [
        "3ee0f33f-9239-49c1-899b-f5c8783ba9c7"
      ],
      "started_at": "2026-10-28T09:52:24.227643Z",
      "answered_at": "2026-10-28T09:52:24.431128Z",
      "ended_at": "2026-10-28T09:52:24.452777Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3ee0f33f-9239-49c1-899b-f5c8783ba9c7` → **200**

```json
{
  "calls": [
    {
      "id": "40afdf59-2913-42a0-8063-a346dc54037c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [
        "3ee0f33f-9239-49c1-899b-f5c8783ba9c7"
      ],
      "started_at": "2026-10-28T09:52:24.227643Z",
      "answered_at": "2026-10-28T09:52:24.431128Z",
      "ended_at": "2026-10-28T09:52:24.452777Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3ee0f33f-9239-49c1-899b-f5c8783ba9c7` → **200**

```json
{
  "calls": [
    {
      "id": "40afdf59-2913-42a0-8063-a346dc54037c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [
        "3ee0f33f-9239-49c1-899b-f5c8783ba9c7"
      ],
      "started_at": "2026-10-28T09:52:24.227643Z",
      "answered_at": "2026-10-28T09:52:24.431128Z",
      "ended_at": "2026-10-28T09:52:24.452777Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3ee0f33f-9239-49c1-899b-f5c8783ba9c7` → **200**

```json
{
  "calls": [
    {
      "id": "40afdf59-2913-42a0-8063-a346dc54037c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [
        "3ee0f33f-9239-49c1-899b-f5c8783ba9c7"
      ],
      "started_at": "2026-10-28T09:52:24.227643Z",
      "answered_at": "2026-10-28T09:52:24.431128Z",
      "ended_at": "2026-10-28T09:52:24.452777Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=3ee0f33f-9239-49c1-899b-f5c8783ba9c7` → **200**

```json
{
  "calls": [
    {
      "id": "40afdf59-2913-42a0-8063-a346dc54037c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "order_ids": [
        "3ee0f33f-9239-49c1-899b-f5c8783ba9c7"
      ],
      "started_at": "2026-10-28T09:52:24.227643Z",
      "answered_at": "2026-10-28T09:52:24.431128Z",
      "ended_at": "2026-10-28T09:52:24.452777Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:52:31.202916Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/3ee0f33f-9239-49c1-899b-f5c8783ba9c7` → **200**

```json
{
  "id": "3ee0f33f-9239-49c1-899b-f5c8783ba9c7",
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
  "created_at": "2026-10-28T09:52:24.1823Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679364544"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3ee0f33f-9239-49c1-899b-f5c8783ba9c7/cancel` → **200**

```json
{
  "command_id": "8678f7f4-4465-4485-adc3-afb5cd3d84b1",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3ee0f33f-9239-49c1-899b-f5c8783ba9c7",
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
  "created_at": "2026-10-28T09:52:24.1823Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679364544"
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
  "command_id": "a818c778-d71a-4721-a75d-5240d9bb2ff1",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T09:52:32.701041Z",
  "extension": "101"
}
```

Done: outgoing call 40afdf59-2913-42a0-8063-a346dc54037c from order 3ee0f33f-9239-49c1-899b-f5c8783ba9c7, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638256641",
  "device_ref": "sandbox-11358"
}
```

```json
{
  "challenge_id": "203bde7a-7cc1-42ae-a17c-da8f1f6511f0",
  "expires_at": "2026-10-28T09:57:32.740303765Z",
  "resend_available_at": "2026-10-28T09:52:33.740303765Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638256641` → **200**

```json
{
  "phone": "+380638256641",
  "audience": "CLIENT",
  "code": "538107",
  "sent_at": "2026-10-28T09:52:32.742188104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "203bde7a-7cc1-42ae-a17c-da8f1f6511f0",
  "code": "538107",
  "device_ref": "sandbox-11358"
}
```

```json
{
  "session_id": "f7659fe4-5e69-4655-81ec-bf16cf963209",
  "subject": {
    "type": "CLIENT",
    "id": "680b92e5-a547-45f5-8a03-e97c122c47e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODBiOTJlNS1hNTQ3LTQ1ZjUtOGEwMy1lOTdjMTIyYzQ3ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDUyLCJpYXQiOjE3OTMxODExNTIsImp0aSI6IjIzYjBhNTcyLTI2NjAtNGI1ZS1iN2MxLWZlYjM1NjY5MmVhNyIsInNpZCI6ImY3NjU5ZmU0LTVlNjktNDY1NS04MWVjLWJmMTZjZjk2MzIwOSJ9.6NlbD-rFMBtqOlxCXfToGHvA_KlExy8KU2eSqd1icCM",
  "access_expires_at": "2026-10-28T10:07:32.794002253Z",
  "refresh_token": "WQFUb4V4RPeNl3zUyJd4R-3tOThb_-rflyUbvtyEKS0",
  "refresh_expires_at": "2026-11-27T09:52:32.793545831Z",
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
  "session_id": "2fe62a87-c33d-448e-aa8a-097057007fd2",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNTMsImlhdCI6MTc5MzE4MTE1MywianRpIjoiODIyZmFiZDgtMjcyMS00ZDllLTlmZmEtZjc5N2YzNzA0MDVjIiwic2lkIjoiMmZlNjJhODctYzMzZC00NDhlLWFhOGEtMDk3MDU3MDA3ZmQyIn0.gg83-jZ305T1kNOUKlaJz2PASy4rBIjj5Oh-KNLDJ64",
  "access_expires_at": "2026-10-28T10:07:33.15474321Z",
  "refresh_token": "wZqA6CU7cId4V_SlwNhx4BIyA5Ni8_arelU2Fzuz34w",
  "refresh_expires_at": "2026-10-28T21:52:33.154293827Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638256641` → **200**

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
  "correlation_id": "2eb29aa0-f33e-4e7a-9c7c-fb9eeb07474b"
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
  "session_id": "3097cfc5-1ab2-4e3a-ba9c-e004e49587d1",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNTMsImlhdCI6MTc5MzE4MTE1MywianRpIjoiNDUyNzhmMjAtMzFiZi00NzE0LWJhMWUtMmIwMDk3YzczNGZlIiwic2lkIjoiMzA5N2NmYzUtMWFiMi00ZTNhLWJhOWMtZTAwNGU0OTU4N2QxIn0.HhOZi6wu1598obmBefHpgv0BoBxr4_3siuhBPD7xCxQ",
  "access_expires_at": "2026-10-28T10:07:33.510427447Z",
  "refresh_token": "PSQVZOBNFJP0JInrisKUQbaztqJfBOdUPycFcCUQerg",
  "refresh_expires_at": "2026-10-28T21:52:33.509675478Z",
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
  "command_id": "c9b3133e-9a0b-4fbb-92ac-5aaf5fb58114",
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
  "changed_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T09:52:33.577869996Z"
}
```

## The rider books the airport for 2026-10-28T12:52:33Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600784094",
  "device_ref": "sandbox-13374"
}
```

```json
{
  "challenge_id": "6eb1266d-8de5-4953-8581-1dbd214935d0",
  "expires_at": "2026-10-28T09:57:33.609264499Z",
  "resend_available_at": "2026-10-28T09:52:34.609264499Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600784094` → **200**

```json
{
  "phone": "+48600784094",
  "audience": "CLIENT",
  "code": "293482",
  "sent_at": "2026-10-28T09:52:33.611915309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6eb1266d-8de5-4953-8581-1dbd214935d0",
  "code": "293482",
  "device_ref": "sandbox-13374"
}
```

```json
{
  "session_id": "88d335bf-8c1e-4d2c-be33-4cc1e55ca107",
  "subject": {
    "type": "CLIENT",
    "id": "0550228d-1585-4bab-8d19-7326011aa262"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTUwMjI4ZC0xNTg1LTRiYWItOGQxOS03MzI2MDExYWEyNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDUzLCJpYXQiOjE3OTMxODExNTMsImp0aSI6IjljZmFiYzYyLWMyZjktNDAxNy05ZTZjLTVjY2JhNmI4NGMwNSIsInNpZCI6Ijg4ZDMzNWJmLThjMWUtNGQyYy1iZTMzLTRjYzFlNTVjYTEwNyJ9.N_TzQoixKmKgE9iYr4LoOsx0UYDjTd9MU315pMgrYqM",
  "access_expires_at": "2026-10-28T10:07:33.666813336Z",
  "refresh_token": "4GSmVsatw2U3lMtO2pAiMXb2YvEgzEeoBbwWjqKMMvs",
  "refresh_expires_at": "2026-11-27T09:52:33.666363924Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6aca3fe7-e4d3-4aec-8c71-8db497a0603c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T12:52:33Z"
}
```

```json
{
  "id": "1f19fbf7-c8b5-4cac-ae95-28a402cc8295",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:33.700633Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:52:33Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "75e0c576-7551-41dc-b624-af4a2858c2d5",
  "quote_id": "1f19fbf7-c8b5-4cac-ae95-28a402cc8295",
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
  "pickup_at": "2026-10-28T12:52:33Z"
}
```

```json
{
  "id": "d669428c-aa09-4c21-90fd-afa0cf66ee02",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0550228d-1585-4bab-8d19-7326011aa262",
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
  "created_at": "2026-10-28T09:52:33.73788Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:52:33Z",
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
  "device_ref": "sandbox-23106"
}
```

```json
{
  "challenge_id": "bd7d630a-4bc1-4fcf-b1db-ea0afd7773be",
  "expires_at": "2026-10-28T09:57:33.768954572Z",
  "resend_available_at": "2026-10-28T09:52:34.768954572Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "058253",
  "sent_at": "2026-10-28T09:52:33.771066637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd7d630a-4bc1-4fcf-b1db-ea0afd7773be",
  "code": "058253",
  "device_ref": "sandbox-23106"
}
```

```json
{
  "session_id": "e02b1ab6-3908-475b-a23d-ee860b580003",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjA1MywiaWF0IjoxNzkzMTgxMTUzLCJqdGkiOiJlMmZhNzE1MS05ZWM5LTRkOWYtODBlMy0wM2E5ZDU5Yzg5ODgiLCJzaWQiOiJlMDJiMWFiNi0zOTA4LTQ3NWItYTIzZC1lZTg2MGI1ODAwMDMifQ.HxqKHxC4CMTR85pLpCEfrVXc-aeSjfOMjDdWENOMu0Y",
  "access_expires_at": "2026-10-28T10:07:33.824127414Z",
  "refresh_token": "tUho8ss1GPQ3o2KmSUQgO3k-2hGwKAbqYHzRZqMBu3U",
  "refresh_expires_at": "2026-11-27T09:52:33.823661317Z",
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
  "command_id": "f13c7cda-5a5b-4757-a76e-45e286e23e95",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:33Z",
    "sequence": 1793181153874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1a6ae8e-fbf8-468b-8934-cec17ab78db1",
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
  "last_heartbeat_at": "2026-10-28T09:52:33.891676Z",
  "last_location_at": "2026-10-28T09:52:33.891676Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d669428c-aa09-4c21-90fd-afa0cf66ee02",
      "short_number": 18,
      "pickup_at": "2026-10-28T12:52:33Z",
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

`POST /api/driver/v1/preorders/d669428c-aa09-4c21-90fd-afa0cf66ee02/reserve` → **200**

```json
{
  "command_id": "90a9ea94-0073-4bbd-bac2-21b071a2b847"
}
```

```json
{
  "id": "90f4d9ce-0ac9-4f89-a5f7-5ec536808a1d",
  "state": "RESERVED",
  "order": {
    "order_id": "d669428c-aa09-4c21-90fd-afa0cf66ee02",
    "short_number": 18,
    "pickup_at": "2026-10-28T12:52:33Z",
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
  "reserved_at": "2026-10-28T09:52:33.954935Z",
  "confirm_from": "2026-10-28T12:22:33Z",
  "confirm_until": "2026-10-28T12:32:33Z",
  "drop_until": "2026-10-28T11:52:33Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "90f4d9ce-0ac9-4f89-a5f7-5ec536808a1d",
      "state": "RESERVED",
      "order": {
        "order_id": "d669428c-aa09-4c21-90fd-afa0cf66ee02",
        "short_number": 18,
        "pickup_at": "2026-10-28T12:52:33Z",
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
      "reserved_at": "2026-10-28T09:52:33.954935Z",
      "confirm_from": "2026-10-28T12:22:33Z",
      "confirm_until": "2026-10-28T12:32:33Z",
      "drop_until": "2026-10-28T11:52:33Z"
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
      "id": "90f4d9ce-0ac9-4f89-a5f7-5ec536808a1d",
      "state": "RESERVED",
      "order": {
        "order_id": "d669428c-aa09-4c21-90fd-afa0cf66ee02",
        "short_number": 18,
        "pickup_at": "2026-10-28T12:52:33Z",
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
      "reserved_at": "2026-10-28T09:52:33.954935Z",
      "confirm_from": "2026-10-28T12:22:33Z",
      "confirm_until": "2026-10-28T12:32:33Z",
      "drop_until": "2026-10-28T11:52:33Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/90f4d9ce-0ac9-4f89-a5f7-5ec536808a1d/confirm` → **409**

```json
{
  "command_id": "208101dd-ff17-45b9-bdf1-631c2619b542"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/90f4d9ce-0ac9-4f89-a5f7-5ec536808a1d/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d2666b6d-7e2b-4b2a-958b-8166644eedef"
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
  "session_id": "218235bb-c112-4e1a-b418-819cde19f79a",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNTQsImlhdCI6MTc5MzE4MTE1NCwianRpIjoiNjYxNWQ0M2UtMjYwYy00OTk5LWIwNDctZTM3OTNkOWJiZjViIiwic2lkIjoiMjE4MjM1YmItYzExMi00ZTFhLWI0MTgtODE5Y2RlMTlmNzlhIn0.ZmPp81l88JDDpKNAgJtmLD3_T5-UZoA5tGLEwDNOlOA",
  "access_expires_at": "2026-10-28T10:07:34.323345987Z",
  "refresh_token": "awlgHlinMy7uZcIrZVQ-c63u6nFPlFbnFsaPin07Cj4",
  "refresh_expires_at": "2026-10-28T21:52:34.322891256Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d669428c-aa09-4c21-90fd-afa0cf66ee02` → **200**

```json
{
  "id": "d669428c-aa09-4c21-90fd-afa0cf66ee02",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0550228d-1585-4bab-8d19-7326011aa262",
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
  "created_at": "2026-10-28T09:52:33.73788Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T12:52:33Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "90f4d9ce-0ac9-4f89-a5f7-5ec536808a1d",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T09:52:33.954935Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d669428c-aa09-4c21-90fd-afa0cf66ee02/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T09:52:33.738925Z",
      "actor": {
        "type": "CLIENT",
        "id": "0550228d-1585-4bab-8d19-7326011aa262",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d669428c-aa09-4c21-90fd-afa0cf66ee02",
        "preorder": true,
        "quote_id": "1f19fbf7-c8b5-4cac-ae95-28a402cc8295",
        "pickup_at": "2026-10-28T12:52:33Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "2ea66922-fe69-4828-90e9-ff9fbf9496aa"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T09:52:33.95602Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d669428c-aa09-4c21-90fd-afa0cf66ee02",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "90f4d9ce-0ac9-4f89-a5f7-5ec536808a1d"
      },
      "correlation_id": "e65bb64c-fbf3-4bf9-bdc5-84c7388eac8d"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order d669428c-aa09-4c21-90fd-afa0cf66ee02, reservation 90f4d9ce-0ac9-4f89-a5f7-5ec536808a1d.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2050"
}
```

```json
{
  "challenge_id": "b089f3d6-e7dd-4f1b-ae80-bd87f8c21da2",
  "expires_at": "2026-10-28T09:57:34.406531384Z",
  "resend_available_at": "2026-10-28T09:52:35.406531384Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "023664",
  "sent_at": "2026-10-28T09:52:34.408276087Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b089f3d6-e7dd-4f1b-ae80-bd87f8c21da2",
  "code": "023664",
  "device_ref": "sandbox-2050"
}
```

```json
{
  "session_id": "9bd7ef2d-2672-4446-a2a6-41051b984380",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjA1NCwiaWF0IjoxNzkzMTgxMTU0LCJqdGkiOiI1YmU4MTM5ZC1mZDMwLTQ3ZWEtYThiOS1lMzAyYmNiOTViZjEiLCJzaWQiOiI5YmQ3ZWYyZC0yNjcyLTQ0NDYtYTJhNi00MTA1MWI5ODQzODAifQ.kzOexZZuHMXDMuGEHrT5HkUL8ugv6pbIuO5sIHs2JIE",
  "access_expires_at": "2026-10-28T10:07:34.458319435Z",
  "refresh_token": "r-CHx_udCIoYXyJK1rw7RPQDsXCT--uWIeErUfkgAQQ",
  "refresh_expires_at": "2026-11-27T09:52:34.457832436Z",
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
  "command_id": "3a0c6c22-841f-49b8-935b-8989a9081921",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:34Z",
    "sequence": 1793181154504
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a7807c2-29a9-4794-94ca-9b0aebaf541e",
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
  "last_heartbeat_at": "2026-10-28T09:52:34.520479Z",
  "last_location_at": "2026-10-28T09:52:34.520479Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670237816",
  "device_ref": "sandbox-23931"
}
```

```json
{
  "challenge_id": "ecbdb6f4-0841-4d4b-b4ef-4017aa5e3168",
  "expires_at": "2026-10-28T09:57:34.546454763Z",
  "resend_available_at": "2026-10-28T09:52:35.546454763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670237816` → **200**

```json
{
  "phone": "+380670237816",
  "audience": "CLIENT",
  "code": "378419",
  "sent_at": "2026-10-28T09:52:34.548194809Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecbdb6f4-0841-4d4b-b4ef-4017aa5e3168",
  "code": "378419",
  "device_ref": "sandbox-23931"
}
```

```json
{
  "session_id": "2fbaf3c2-b99d-41f2-8f43-2b1a03bf1b5f",
  "subject": {
    "type": "CLIENT",
    "id": "a6bf04d3-79f9-49db-a385-d977bd87bd47"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmJmMDRkMy03OWY5LTQ5ZGItYTM4NS1kOTc3YmQ4N2JkNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDU0LCJpYXQiOjE3OTMxODExNTQsImp0aSI6IjMwNThmNmNlLWZmMjctNDUyYi05N2M5LTRiMGI3ZDVmMjIxMyIsInNpZCI6IjJmYmFmM2MyLWI5OWQtNDFmMi04ZjQzLTJiMWEwM2JmMWI1ZiJ9.3t6C_6opYMIT0oQuF9fmR3XKXr-aNhkUE_WLw4vGkyQ",
  "access_expires_at": "2026-10-28T10:07:34.600332105Z",
  "refresh_token": "2SPFHbYAh0TmT6vLIXaDr-PkLsdTtk32jgvWO0LEpOs",
  "refresh_expires_at": "2026-11-27T09:52:34.599846839Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa32f227-9fd5-46f1-91dd-614280cc49e4",
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
  "id": "9b7932b4-d172-4e56-b826-d84afe84b7e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:34.633742Z",
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
  "command_id": "38dc2c86-d1a7-44b6-b0a9-d8f4d9b432ea",
  "quote_id": "9b7932b4-d172-4e56-b826-d84afe84b7e0",
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
  "id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6bf04d3-79f9-49db-a385-d977bd87bd47",
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
  "created_at": "2026-10-28T09:52:34.668052Z",
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
    "id": "d77608e7-8101-4cf8-8831-58e79ee375fb",
    "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
    "expires_at": "2026-10-28T09:52:49.670538Z",
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

`POST /api/driver/v1/offers/d77608e7-8101-4cf8-8831-58e79ee375fb/accept` → **200**

```json
{
  "command_id": "90963dc1-9c94-442a-8333-004900ff719e"
}
```

```json
{
  "id": "c4792357-d346-4827-9d8b-80a56765e0c4",
  "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f7c494a3-5320-476f-8862-120271155e0e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f7c494a3-5320-476f-8862-120271155e0e",
  "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "assignment_id": "c4792357-d346-4827-9d8b-80a56765e0c4",
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

`POST /api/driver/v1/work-sessions/3a7807c2-29a9-4794-94ca-9b0aebaf541e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:34Z",
    "sequence": 1793181154769
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a7807c2-29a9-4794-94ca-9b0aebaf541e",
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
  "last_heartbeat_at": "2026-10-28T09:52:34.786547Z",
  "last_location_at": "2026-10-28T09:52:34.786547Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f7c494a3-5320-476f-8862-120271155e0e",
  "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "assignment_id": "c4792357-d346-4827-9d8b-80a56765e0c4",
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

`POST /api/driver/v1/trips/f7c494a3-5320-476f-8862-120271155e0e/arrive` → **200**

```json
{
  "command_id": "7e6c4e22-3c11-4765-bbf7-b45fec1363e9",
  "expected_version": 0
}
```

```json
{
  "id": "f7c494a3-5320-476f-8862-120271155e0e",
  "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "assignment_id": "c4792357-d346-4827-9d8b-80a56765e0c4",
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
  "arrived_at": "2026-10-28T09:52:34.833037Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f7c494a3-5320-476f-8862-120271155e0e/start` → **200**

```json
{
  "command_id": "f386d114-5822-4209-84e3-88c8a276c123",
  "expected_version": 1
}
```

```json
{
  "id": "f7c494a3-5320-476f-8862-120271155e0e",
  "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "assignment_id": "c4792357-d346-4827-9d8b-80a56765e0c4",
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
  "arrived_at": "2026-10-28T09:52:34.833037Z",
  "started_at": "2026-10-28T09:52:34.863828Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3a7807c2-29a9-4794-94ca-9b0aebaf541e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:34Z",
    "sequence": 1793181154885
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a7807c2-29a9-4794-94ca-9b0aebaf541e",
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
  "last_heartbeat_at": "2026-10-28T09:52:34.902119Z",
  "last_location_at": "2026-10-28T09:52:34.902119Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f7c494a3-5320-476f-8862-120271155e0e/complete` → **200**

```json
{
  "command_id": "941a6020-d921-4255-9639-cede62597269",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:52:34Z",
  "cash_received": true
}
```

```json
{
  "id": "f7c494a3-5320-476f-8862-120271155e0e",
  "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "assignment_id": "c4792357-d346-4827-9d8b-80a56765e0c4",
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
  "arrived_at": "2026-10-28T09:52:34.833037Z",
  "started_at": "2026-10-28T09:52:34.863828Z",
  "completed_at": "2026-10-28T09:52:34.930886Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad/rating` → **200**

```json
{
  "command_id": "63636fe0-b3d3-4f8e-a82a-27ff66168b1a",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "score": 5,
  "created_at": "2026-10-28T09:52:34.974383693Z"
}
```

`POST /api/driver/v1/orders/d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad/rating` → **200**

```json
{
  "command_id": "81127857-e81a-4b93-a814-11179481722c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
  "score": 4,
  "created_at": "2026-10-28T09:52:35.007080817Z"
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
  "session_id": "45ab9582-edce-48e3-aa76-432ec8d140f1",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNTUsImlhdCI6MTc5MzE4MTE1NSwianRpIjoiZDY1MDhiNDctZWY4OC00M2IyLThhOGItZjE4M2I5YTVhNzNkIiwic2lkIjoiNDVhYjk1ODItZWRjZS00OGUzLWFhNzYtNDMyZWM4ZDE0MGYxIn0.9dMu_PX3W8wRbeMHBAoGJ6Hqgu34x8tJLh7wA3Ymefs",
  "access_expires_at": "2026-10-28T10:07:35.334706842Z",
  "refresh_token": "g1He6B2Qb6GY3aV0zqW0jIjBc6-1BxttMjIL_-VLOac",
  "refresh_expires_at": "2026-10-28T21:52:35.334317298Z",
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
  "session_id": "1e721e0a-0ffa-44f2-a092-4579312599c1",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNTUsImlhdCI6MTc5MzE4MTE1NSwianRpIjoiMzFmNzQ4YWItODVhZS00ZThlLTk3NzEtYWYwZGNmNTI4MzExIiwic2lkIjoiMWU3MjFlMGEtMGZmYS00NGYyLWEwOTItNDU3OTMxMjU5OWMxIn0.7Wakx5sYCTUKhkhYhYg58oLd-2CCe2AuAw85wqpizuM",
  "access_expires_at": "2026-10-28T10:07:35.618006552Z",
  "refresh_token": "sOMk46BcLs1b93PsDyDdIJoEdLQHNEVj9AYtmURuy1Y",
  "refresh_expires_at": "2026-10-28T21:52:35.617473917Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
      "author_type": "RIDER",
      "author_id": "a6bf04d3-79f9-49db-a385-d977bd87bd47",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T09:52:34.974384Z"
    },
    {
      "order_id": "d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "a6bf04d3-79f9-49db-a385-d977bd87bd47",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T09:52:35.007081Z"
    }
  ]
}
```

Done: ratings for order d0d04f84-1d0d-4bfb-a78d-a0bd4efaf4ad.

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
  "session_id": "06d0b146-36e9-4d00-87d2-86c310a885e2",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNTUsImlhdCI6MTc5MzE4MTE1NSwianRpIjoiZDYyMDg2NjMtYTM2Yi00NDQ1LTk5ZmEtMDMwZTM0Zjc1NjNjIiwic2lkIjoiMDZkMGIxNDYtMzZlOS00ZDAwLTg3ZDItODZjMzEwYTg4NWUyIn0.dLK0KyoDyX-SobFVkQJsiFbKUyiYQXWsgVDPdUSqHOg",
  "access_expires_at": "2026-10-28T10:07:35.951612097Z",
  "refresh_token": "5eOGDqLAoDteVR6C8jpB5jfgggp8CX5Dl-8pSCWJTuQ",
  "refresh_expires_at": "2026-10-28T21:52:35.95118676Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e138d306-90a3-41d9-8c2e-8202d4ec4777",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "67dfcd1a-541a-481b-b9fa-0b75da4a2666",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:52:35.991569Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67dfcd1a-541a-481b-b9fa-0b75da4a2666` → **200**

```json
{
  "id": "67dfcd1a-541a-481b-b9fa-0b75da4a2666",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:52:35.991569Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67dfcd1a-541a-481b-b9fa-0b75da4a2666` → **200**

```json
{
  "id": "67dfcd1a-541a-481b-b9fa-0b75da4a2666",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:52:35.991569Z",
  "ready_at": "2026-10-28T09:52:36.211195Z",
  "expires_at": "2026-10-29T09:52:36.211195Z"
}
```

`GET /api/admin/v1/reports/exports/67dfcd1a-541a-481b-b9fa-0b75da4a2666/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f24aaa2b-cf12-421a-8a3a-48a2c3365c28",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "3ad1f441-2560-4f01-8a96-69a6808e6e37",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:52:37.115935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3ad1f441-2560-4f01-8a96-69a6808e6e37` → **200**

```json
{
  "id": "3ad1f441-2560-4f01-8a96-69a6808e6e37",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:52:37.115935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3ad1f441-2560-4f01-8a96-69a6808e6e37` → **200**

```json
{
  "id": "3ad1f441-2560-4f01-8a96-69a6808e6e37",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:52:37.115935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3ad1f441-2560-4f01-8a96-69a6808e6e37` → **200**

```json
{
  "id": "3ad1f441-2560-4f01-8a96-69a6808e6e37",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:52:37.115935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3ad1f441-2560-4f01-8a96-69a6808e6e37` → **200**

```json
{
  "id": "3ad1f441-2560-4f01-8a96-69a6808e6e37",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:52:37.115935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3ad1f441-2560-4f01-8a96-69a6808e6e37` → **200**

```json
{
  "id": "3ad1f441-2560-4f01-8a96-69a6808e6e37",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:52:37.115935Z",
  "ready_at": "2026-10-28T09:52:41.228394Z",
  "expires_at": "2026-10-29T09:52:41.228394Z"
}
```

`GET /api/admin/v1/reports/exports/3ad1f441-2560-4f01-8a96-69a6808e6e37/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/126f5eb2-07b4-42ef-a25e-ad189a71ca95` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/126f5eb2-07b4-42ef-a25e-ad189a71ca95",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "10339e77-d2c9-4eae-8925-662ad3735706"
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
  "device_ref": "sandbox-6144"
}
```

```json
{
  "challenge_id": "fd926ad7-2814-47aa-9fcb-d70703fe8057",
  "expires_at": "2026-10-28T09:57:41.410002004Z",
  "resend_available_at": "2026-10-28T09:52:42.410002004Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "106319",
  "sent_at": "2026-10-28T09:52:41.41195822Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd926ad7-2814-47aa-9fcb-d70703fe8057",
  "code": "106319",
  "device_ref": "sandbox-6144"
}
```

```json
{
  "session_id": "4c7348a3-827d-49d9-af2d-16ff29acb242",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjA2MSwiaWF0IjoxNzkzMTgxMTYxLCJqdGkiOiI0N2IwMWRkZi1hZjAwLTQ2MjAtYTc0ZC1jYjFkMTNkYTEzOTciLCJzaWQiOiI0YzczNDhhMy04MjdkLTQ5ZDktYWYyZC0xNmZmMjlhY2IyNDIifQ.Xv0t2Z5SV3nBaKoG5rtL_ZIFrG_S83LnBDQSasDnSpw",
  "access_expires_at": "2026-10-28T10:07:41.470585336Z",
  "refresh_token": "fzWbsGJTwGuo0XTo3ClQ3MVow1Pm2awX9xSNSn0ribM",
  "refresh_expires_at": "2026-11-27T09:52:41.469979532Z",
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
  "command_id": "1e829820-75f9-4df4-8eef-bfa7910acaa8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:41Z",
    "sequence": 1793181161541
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a04cfea9-7c82-4995-9adf-37416f00ae72",
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
  "last_heartbeat_at": "2026-10-28T09:52:41.557624Z",
  "last_location_at": "2026-10-28T09:52:41.557624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "6d7664ed-5ad8-41fe-a413-090e381dbfdb",
  "points": [
    {
      "sequence": 1793181163589,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:51:43Z"
    },
    {
      "sequence": 1793181163596,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:52:43Z"
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
  "session_id": "a0278540-47ee-4e33-8bb6-75fdc92c3bed",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNjQsImlhdCI6MTc5MzE4MTE2NCwianRpIjoiMzMwODc2OGItODJjNS00NGNkLWI1YWItYjI4OTc1YTA5NTFkIiwic2lkIjoiYTAyNzg1NDAtNDdlZS00ZTMzLThiYjYtNzVmZGM5MmMzYmVkIn0.PiJyGEXzEStCoZMdhRLqLxWFSP80ChnfVbnFo_BfrXw",
  "access_expires_at": "2026-10-28T10:07:44.012765263Z",
  "refresh_token": "PiDP91DJhUKhONEYl1o6GOTsLSO4sJ5eOD1f8HK3mrg",
  "refresh_expires_at": "2026-10-28T21:52:44.012344983Z",
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
      "id": "24604737-0733-4e66-841f-8f62f4c52294",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T09:52:43Z",
        "track_point_id": "7c27b729-d6f5-48cf-b0ad-3868bc25405f",
        "work_session_id": "a04cfea9-7c82-4995-9adf-37416f00ae72"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T09:52:43Z",
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

`POST /api/admin/v1/driver-risk-flags/24604737-0733-4e66-841f-8f62f4c52294/confirm` → **200**

```json
{
  "command_id": "fbc10faa-2374-4f48-8771-c44d4bdae8e9",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "24604737-0733-4e66-841f-8f62f4c52294",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T09:52:43Z",
    "track_point_id": "7c27b729-d6f5-48cf-b0ad-3868bc25405f",
    "work_session_id": "a04cfea9-7c82-4995-9adf-37416f00ae72"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T09:52:43Z",
  "reason": null,
  "reviewed_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "reviewed_at": "2026-10-28T09:52:45.182966Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/24604737-0733-4e66-841f-8f62f4c52294/dismiss` → **409**

```json
{
  "command_id": "2f6f1ae7-b7a6-4d9b-a7bd-41b627cee71f",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/24604737-0733-4e66-841f-8f62f4c52294/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "400d7d20-7f14-4426-af2b-02ebbbb67fe2"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "15183e67-6fcd-4e32-86c3-0037d4996356",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c9baef16-f3f0-4d93-89c6-a1c8621f05f7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "raised_at": "2026-10-28T09:52:45.2546Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c9baef16-f3f0-4d93-89c6-a1c8621f05f7/dismiss` → **200**

```json
{
  "command_id": "e1e606fd-940b-4e55-b4c6-e16cfde1fd42",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c9baef16-f3f0-4d93-89c6-a1c8621f05f7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "raised_at": "2026-10-28T09:52:45.2546Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "reviewed_at": "2026-10-28T09:52:45.293058Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "b572a7b8-1975-46a9-bc7b-e42f9bcafd78",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "24604737-0733-4e66-841f-8f62f4c52294"
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
      "actor_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:52:45.335189Z"
    }
  ]
}
```

Done: flag 24604737-0733-4e66-841f-8f62f4c52294 confirmed, suspension named it, driver reinstated.

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
  "session_id": "63f89ba4-4620-4672-b94f-cebc96a1b4d1",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNjUsImlhdCI6MTc5MzE4MTE2NSwianRpIjoiNjAzYTQ1MTAtZDZjZS00ZTBkLWFjYjgtOTliMDg5ZjJhNjBhIiwic2lkIjoiNjNmODliYTQtNDYyMC00NjcyLWI5NGYtY2ViYzk2YTFiNGQxIn0.hkvdH1sKww7S92hiv92yb2UTb2fHEalVGP9KlGlVIBc",
  "access_expires_at": "2026-10-28T10:07:45.651446381Z",
  "refresh_token": "XSgXqlpxB0N76a64vo9NV2vPG6uX4_pvuJKkjI9Lziw",
  "refresh_expires_at": "2026-10-28T21:52:45.650980634Z",
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
      "actor_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:52:45.335189Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "e33a2638-857a-460b-8d35-5662da2664f3",
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
  "session_id": "a04cfea9-7c82-4995-9adf-37416f00ae72",
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
  "last_heartbeat_at": "2026-10-28T09:52:41.557624Z",
  "last_location_at": "2026-10-28T09:52:41.557624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a04cfea9-7c82-4995-9adf-37416f00ae72/close` → **200**

```json
{
  "command_id": "00529d4f-7025-46d9-a436-c0a0711a8cc4",
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
  "session_id": "8f0e8acb-e4a9-4e65-906f-35fb467ba9a0",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNjYsImlhdCI6MTc5MzE4MTE2NiwianRpIjoiNDZjODNmNjEtOGQ3NS00Yjk1LWI0ZDMtOTFjNWVkZmU1MjZjIiwic2lkIjoiOGYwZThhY2ItZTRhOS00ZTY1LTkwNmYtMzVmYjQ2N2JhOWEwIn0.OOEm_zVME9QD35UaWGDbBnLIAXKmNaHQag198LAl4Vk",
  "access_expires_at": "2026-10-28T10:07:46.073272493Z",
  "refresh_token": "Vwd5kdUvhYFVV9CtA5bJJIE7XEEKrW_Y8R4W3K5xPIg",
  "refresh_expires_at": "2026-10-28T21:52:46.072662203Z",
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
  "command_id": "ac822426-cc02-40ce-8f0b-42c90e96138a",
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
  "changed_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:52:46.135492Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "ac822426-cc02-40ce-8f0b-42c90e96138a",
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
  "changed_by": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:52:46.135492Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48857399636",
  "device_ref": "sandbox-17797"
}
```

```json
{
  "challenge_id": "ef0dd0ca-46b9-4d1e-bc70-45f303bc3f8a",
  "expires_at": "2026-10-28T09:57:46.207067196Z",
  "resend_available_at": "2026-10-28T09:52:47.207067196Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48857399636` → **200**

```json
{
  "phone": "+48857399636",
  "audience": "CLIENT",
  "code": "098635",
  "sent_at": "2026-10-28T09:52:46.208836254Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef0dd0ca-46b9-4d1e-bc70-45f303bc3f8a",
  "code": "098635",
  "device_ref": "sandbox-17797"
}
```

```json
{
  "session_id": "f46f9217-8997-49ed-8dde-34111caabb01",
  "subject": {
    "type": "CLIENT",
    "id": "fee5a849-873c-4f6b-8ff6-01b1e1b3384a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWU1YTg0OS04NzNjLTRmNmItOGZmNi0wMWIxZTFiMzM4NGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDY2LCJpYXQiOjE3OTMxODExNjYsImp0aSI6Ijg2OTc3ZTIxLTk4ZWQtNGFmZi04MmIyLTUyNGIwYWFjYjU1YiIsInNpZCI6ImY0NmY5MjE3LTg5OTctNDllZC04ZGRlLTM0MTExY2FhYmIwMSJ9.hAgt7SqUlo_5qauG3ugkSBFcYJcUR2w4H8DmCjHXM7E",
  "access_expires_at": "2026-10-28T10:07:46.261076003Z",
  "refresh_token": "ob6c5JAzJ98oBxXWNsvNrpaCfQ7WwXUW63NKsODhpyE",
  "refresh_expires_at": "2026-11-27T09:52:46.260633851Z",
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
  "correlation_id": "abfc5f73-74e5-4123-9e1f-ecfa0a61d3ce"
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
  "device_ref": "sandbox-18924"
}
```

```json
{
  "challenge_id": "791275b5-0f2b-4a97-ba54-7b129ef1e466",
  "expires_at": "2026-10-28T09:57:46.338804679Z",
  "resend_available_at": "2026-10-28T09:52:47.338804679Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "499493",
  "sent_at": "2026-10-28T09:52:46.341270074Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "791275b5-0f2b-4a97-ba54-7b129ef1e466",
  "code": "499493",
  "device_ref": "sandbox-18924"
}
```

```json
{
  "session_id": "c387a028-a3b5-42a7-abc9-456b934174fa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjA2NiwiaWF0IjoxNzkzMTgxMTY2LCJqdGkiOiI3OWYyNDNiOS03Y2Y0LTQwMzYtYjQ5NC0yZGJlMzEyYTM0ZWMiLCJzaWQiOiJjMzg3YTAyOC1hM2I1LTQyYTctYWJjOS00NTZiOTM0MTc0ZmEifQ.M-qH-1YeBklBoHWKqnnwRyK3cylvlx-DBTKrO9kPjC0",
  "access_expires_at": "2026-10-28T10:07:46.403682414Z",
  "refresh_token": "adOpCEV73P-JG6gFb_SPrNpCKJBBtgYiT5dMHjL4qtc",
  "refresh_expires_at": "2026-11-27T09:52:46.403267202Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1a6ae8e-fbf8-468b-8934-cec17ab78db1",
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
  "last_heartbeat_at": "2026-10-28T09:52:33.891676Z",
  "last_location_at": "2026-10-28T09:52:33.891676Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1a6ae8e-fbf8-468b-8934-cec17ab78db1/handover` → **200**

```json
{
  "command_id": "69eceb8a-f8d4-49d8-923f-c793842ba9a8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1a6ae8e-fbf8-468b-8934-cec17ab78db1",
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
  "last_heartbeat_at": "2026-10-28T09:52:33.891676Z",
  "last_location_at": "2026-10-28T09:52:33.891676Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1a6ae8e-fbf8-468b-8934-cec17ab78db1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:46Z",
    "sequence": 1793181166482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b1a6ae8e-fbf8-468b-8934-cec17ab78db1",
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
  "last_heartbeat_at": "2026-10-28T09:52:46.50009Z",
  "last_location_at": "2026-10-28T09:52:46.50009Z",
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
  "session_id": "b1a6ae8e-fbf8-468b-8934-cec17ab78db1",
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
  "last_heartbeat_at": "2026-10-28T09:52:46.50009Z",
  "last_location_at": "2026-10-28T09:52:46.50009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1a6ae8e-fbf8-468b-8934-cec17ab78db1/close` → **200**

```json
{
  "command_id": "ee6b30fd-17f4-409d-bb33-1acf9b27501c",
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
  "correlation_id": "1e64b733-909e-4aa0-9774-116b8d33d117"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679348513",
  "device_ref": "sandbox-22879"
}
```

```json
{
  "challenge_id": "14417897-0d02-47b3-9597-838708c9162a",
  "expires_at": "2026-10-28T09:57:46.652528847Z",
  "resend_available_at": "2026-10-28T09:52:47.652528847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679348513` → **200**

```json
{
  "phone": "+380679348513",
  "audience": "CLIENT",
  "code": "597760",
  "sent_at": "2026-10-28T09:52:46.654306929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14417897-0d02-47b3-9597-838708c9162a",
  "code": "597760",
  "device_ref": "sandbox-22879"
}
```

```json
{
  "session_id": "b991e3eb-ad8c-4de8-9324-7b1a38e86af5",
  "subject": {
    "type": "CLIENT",
    "id": "821c02b7-e8af-4773-944c-4d1e2b29ed68"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjFjMDJiNy1lOGFmLTQ3NzMtOTQ0Yy00ZDFlMmIyOWVkNjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgyMDY2LCJpYXQiOjE3OTMxODExNjYsImp0aSI6IjdiMTFmMTkyLWJhYmEtNDcwMS05NzZmLTRlOWMwNTQwMGZmOCIsInNpZCI6ImI5OTFlM2ViLWFkOGMtNGRlOC05MzI0LTdiMWEzOGU4NmFmNSJ9.oAxDDPNNbVYHASb_ZeXxc3SZkoWddJVALwqploSw2Xk",
  "access_expires_at": "2026-10-28T10:07:46.706140257Z",
  "refresh_token": "AOsUJSCwqR_Ng0NaxxroSR7Ak0zv3avvt7tXyH31M98",
  "refresh_expires_at": "2026-11-27T09:52:46.705648192Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "625e350c-2c98-48d0-858e-32c7e8a7a7a2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "1146975d-84d9-4394-9ca4-ebccea6f485b",
  "upload_path": "/api/rider/v1/uploads/1146975d-84d9-4394-9ca4-ebccea6f485b",
  "expires_at": "2026-10-28T10:07:46.739531239Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/1146975d-84d9-4394-9ca4-ebccea6f485b` → **200**

```json
{
  "file_id": "1146975d-84d9-4394-9ca4-ebccea6f485b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "973a8741-5513-40b0-b9d3-8bf0a0f87d1e",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "1146975d-84d9-4394-9ca4-ebccea6f485b"
  ]
}
```

```json
{
  "id": "ce32d408-74ab-418c-91fd-7fd9933b1df5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "821c02b7-e8af-4773-944c-4d1e2b29ed68",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:52:46.801559Z",
  "updated_at": "2026-10-28T09:52:46.801559Z",
  "messages": [
    {
      "id": "5c5435a8-0fce-436d-b485-bed65f6ce3f4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "821c02b7-e8af-4773-944c-4d1e2b29ed68",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:52:46.802742Z",
      "attachments": [
        {
          "file_id": "1146975d-84d9-4394-9ca4-ebccea6f485b",
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
  "session_id": "5be86547-7253-4729-9b88-ff39a305787f",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNjcsImlhdCI6MTc5MzE4MTE2NywianRpIjoiMzA3MTE5YzktNzNjOS00M2Q2LWEzOGUtNDc1YjAwNzZmNzdhIiwic2lkIjoiNWJlODY1NDctNzI1My00NzI5LTliODgtZmYzOWEzMDU3ODdmIn0.tZpf49e3G_89Qa7bouaBI3AcWYQJTuyMs5aUcaJ9LBE",
  "access_expires_at": "2026-10-28T10:07:47.106343566Z",
  "refresh_token": "n2TrS9mtJIjURDDaG5cv1_I4uSAr2NRzXAiFu4Cc2vY",
  "refresh_expires_at": "2026-10-28T21:52:47.105937567Z",
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
  "session_id": "6c3f777c-5ce9-4ef4-a17f-dbc4cb28d78b",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNjcsImlhdCI6MTc5MzE4MTE2NywianRpIjoiMGEwMmE5N2QtNGY1MC00NDEwLTlkZGMtZjA3Y2EwMWFiOGRmIiwic2lkIjoiNmMzZjc3N2MtNWNlOS00ZWY0LWExN2YtZGJjNGNiMjhkNzhiIn0.DKke7-46WiRIeYIPHmsa4SgH7D06AvuD9H-511mmt48",
  "access_expires_at": "2026-10-28T10:07:47.392027954Z",
  "refresh_token": "s8cnplDqqzQHOh38kO4S3fYvhGexLJweJvcTnlxZ_vA",
  "refresh_expires_at": "2026-10-28T21:52:47.391617319Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/ce32d408-74ab-418c-91fd-7fd9933b1df5/attachments/1146975d-84d9-4394-9ca4-ebccea6f485b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "52550b31-60d7-44cd-9049-fee91f93198f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "457ebe5a-e82a-433a-9147-4962e79a118d",
  "upload_path": "/api/operator/v1/uploads/457ebe5a-e82a-433a-9147-4962e79a118d",
  "expires_at": "2026-10-28T10:07:47.434249578Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/457ebe5a-e82a-433a-9147-4962e79a118d` → **200**

```json
{
  "file_id": "457ebe5a-e82a-433a-9147-4962e79a118d",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/ce32d408-74ab-418c-91fd-7fd9933b1df5` → **200**

```json
{
  "id": "ce32d408-74ab-418c-91fd-7fd9933b1df5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "821c02b7-e8af-4773-944c-4d1e2b29ed68",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:52:46.801559Z",
  "updated_at": "2026-10-28T09:52:46.801559Z",
  "messages": [
    {
      "id": "5c5435a8-0fce-436d-b485-bed65f6ce3f4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "821c02b7-e8af-4773-944c-4d1e2b29ed68",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:52:46.802742Z",
      "attachments": [
        {
          "file_id": "1146975d-84d9-4394-9ca4-ebccea6f485b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/ce32d408-74ab-418c-91fd-7fd9933b1df5/comments` → **200**

```json
{
  "command_id": "92dd92c9-a54d-4d6b-8ebf-4343e1db3f96",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "457ebe5a-e82a-433a-9147-4962e79a118d"
  ]
}
```

```json
{
  "id": "ce32d408-74ab-418c-91fd-7fd9933b1df5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "821c02b7-e8af-4773-944c-4d1e2b29ed68",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:52:46.801559Z",
  "updated_at": "2026-10-28T09:52:47.553498Z",
  "messages": [
    {
      "id": "5c5435a8-0fce-436d-b485-bed65f6ce3f4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "821c02b7-e8af-4773-944c-4d1e2b29ed68",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:52:46.802742Z",
      "attachments": [
        {
          "file_id": "1146975d-84d9-4394-9ca4-ebccea6f485b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9601750e-6b85-4e81-a781-1b2440e5b7be",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:52:47.553135Z",
      "attachments": [
        {
          "file_id": "457ebe5a-e82a-433a-9147-4962e79a118d",
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

`GET /api/rider/v1/support/cases/ce32d408-74ab-418c-91fd-7fd9933b1df5` → **200**

```json
{
  "id": "ce32d408-74ab-418c-91fd-7fd9933b1df5",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "821c02b7-e8af-4773-944c-4d1e2b29ed68",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:52:46.801559Z",
  "updated_at": "2026-10-28T09:52:47.553498Z",
  "messages": [
    {
      "id": "5c5435a8-0fce-436d-b485-bed65f6ce3f4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "821c02b7-e8af-4773-944c-4d1e2b29ed68",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:52:46.802742Z",
      "attachments": [
        {
          "file_id": "1146975d-84d9-4394-9ca4-ebccea6f485b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9601750e-6b85-4e81-a781-1b2440e5b7be",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:52:47.553135Z",
      "attachments": [
        {
          "file_id": "457ebe5a-e82a-433a-9147-4962e79a118d",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/ce32d408-74ab-418c-91fd-7fd9933b1df5/attachments/457ebe5a-e82a-433a-9147-4962e79a118d` → **200**

Done: support case ce32d408-74ab-418c-91fd-7fd9933b1df5, rider attachment 1146975d-84d9-4394-9ca4-ebccea6f485b, operator attachment 457ebe5a-e82a-433a-9147-4962e79a118d.

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
  "session_id": "6f329806-9d46-4f4b-ae8b-9cad827d0027",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNjcsImlhdCI6MTc5MzE4MTE2NywianRpIjoiNmY2ZGQxODItNWJhYi00MjJlLThiYWUtMmQ3OWU1NzU1ZjRhIiwic2lkIjoiNmYzMjk4MDYtOWQ0Ni00ZjRiLWFlOGItOWNhZDgyN2QwMDI3In0.Yz2shp84V9fZ-ohOtp_AQQx11kYbaSryonRYUour8TA",
  "access_expires_at": "2026-10-28T10:07:47.912238707Z",
  "refresh_token": "KKECDJ1OGW_xGyzVoZq5vr2j2JvhGkBs_dzGWaKX-uY",
  "refresh_expires_at": "2026-10-28T21:52:47.911839108Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1978"
}
```

```json
{
  "challenge_id": "837c6154-cb51-460d-8934-537b500ba5be",
  "expires_at": "2026-10-28T09:57:47.935979768Z",
  "resend_available_at": "2026-10-28T09:52:48.935979768Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "525793",
  "sent_at": "2026-10-28T09:52:47.93755433Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "837c6154-cb51-460d-8934-537b500ba5be",
  "code": "525793",
  "device_ref": "sandbox-1978"
}
```

```json
{
  "session_id": "e48d807d-d491-444a-9266-2293089ec46f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjA2NywiaWF0IjoxNzkzMTgxMTY3LCJqdGkiOiI4YTI2MDZjZS0yZjVhLTQzNmMtOTkyZi03ZjM3ZDNhNWE2NjkiLCJzaWQiOiJlNDhkODA3ZC1kNDkxLTQ0NGEtOTI2Ni0yMjkzMDg5ZWM0NmYifQ.1m4-zA9TF7Filo2_hMctTFTgpQHIcv6MThctKPyk-QU",
  "access_expires_at": "2026-10-28T10:07:47.986473061Z",
  "refresh_token": "UMsfEGX2XEv8OwlHdzDtYB-Kc_XF8GNZ_FEQjdUvmx8",
  "refresh_expires_at": "2026-11-27T09:52:47.986076406Z",
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
      "actor_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:52:45.335189Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T09:52:45.723908Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b872b98c-b8ed-4dc7-814d-2150a19621aa",
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
  "device_ref": "sandbox-23402"
}
```

```json
{
  "challenge_id": "aa5cc7b1-dd90-4419-91a7-e931bd73ee3d",
  "expires_at": "2026-10-28T09:57:48.095794497Z",
  "resend_available_at": "2026-10-28T09:52:49.095794497Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "611835",
  "sent_at": "2026-10-28T09:52:48.097503607Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa5cc7b1-dd90-4419-91a7-e931bd73ee3d",
  "code": "611835",
  "device_ref": "sandbox-23402"
}
```

```json
{
  "session_id": "fe80f3a6-845b-47e5-8701-1408cd6dcb3a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4MjA2OCwiaWF0IjoxNzkzMTgxMTY4LCJqdGkiOiIwZDYxZDRkNy05NDkyLTRhNzYtYjU0MS00NDIzNTQ2MzM3MTgiLCJzaWQiOiJmZTgwZjNhNi04NDViLTQ3ZTUtODcwMS0xNDA4Y2Q2ZGNiM2EifQ.lZGLvAGHDZFNLXpPB-u3Zcs65oIooS5Man11Au3zNko",
  "access_expires_at": "2026-10-28T10:07:48.154189311Z",
  "refresh_token": "-VcONIFMlx2iYir1QVpwbju5U1v6puPqEKePbJUpa-Y",
  "refresh_expires_at": "2026-11-27T09:52:48.153680571Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a7807c2-29a9-4794-94ca-9b0aebaf541e",
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
  "last_heartbeat_at": "2026-10-28T09:52:34.902119Z",
  "last_location_at": "2026-10-28T09:52:34.902119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a7807c2-29a9-4794-94ca-9b0aebaf541e/handover` → **200**

```json
{
  "command_id": "000b46ed-2ad7-402e-9f24-49a3a10ba95f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a7807c2-29a9-4794-94ca-9b0aebaf541e",
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
  "last_heartbeat_at": "2026-10-28T09:52:34.902119Z",
  "last_location_at": "2026-10-28T09:52:34.902119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a7807c2-29a9-4794-94ca-9b0aebaf541e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:48Z",
    "sequence": 1793181168235
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a7807c2-29a9-4794-94ca-9b0aebaf541e",
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
  "last_heartbeat_at": "2026-10-28T09:52:48.252565Z",
  "last_location_at": "2026-10-28T09:52:48.252565Z",
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
  "command_id": "9d36ccf2-56fb-46d3-8523-19c03127c182",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:48Z",
    "sequence": 1793181168299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9cf15fdd-8864-4920-b61a-c451a54df75e",
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
  "last_heartbeat_at": "2026-10-28T09:52:48.316199Z",
  "last_location_at": "2026-10-28T09:52:48.316199Z",
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
  "session_id": "9d401c80-55f1-459f-b239-d78c24f2d6c8",
  "subject": {
    "type": "STAFF",
    "id": "26acc14d-dcb6-42eb-aca6-5f3e247b04c7"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmFjYzE0ZC1kY2I2LTQyZWItYWNhNi01ZjNlMjQ3YjA0YzciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODIwNjgsImlhdCI6MTc5MzE4MTE2OCwianRpIjoiOWQ2YjJkYjctODA0OC00Y2Q0LWJkNmQtMmZjNzAyM2ExMzkxIiwic2lkIjoiOWQ0MDFjODAtNTVmMS00NTlmLWIyMzktZDc4YzI0ZjJkNmM4In0.DBpZEA2y2F4diabFjz3SlSCKv1CckfWlZBvvqM5bnZo",
  "access_expires_at": "2026-10-28T10:07:48.60420646Z",
  "refresh_token": "KsfzDUtxGL0rE77aQt4o37twOjGZx29qUojPWU1lWns",
  "refresh_expires_at": "2026-10-28T21:52:48.603770377Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bbaa9cb7-2411-4216-bd7f-5198a0a39f5a",
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
  "id": "47800d6a-19b9-4ff8-9b22-75667489debc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T09:57:48.632781Z",
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
  "command_id": "d55208da-1849-4d5a-b569-bb7228689398",
  "quote_id": "47800d6a-19b9-4ff8-9b22-75667489debc",
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
  "id": "85ddd3d3-9917-425a-bce5-87d076d892af",
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
  "created_at": "2026-10-28T09:52:48.674245Z",
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
    "id": "51779e0b-b0bb-4be6-a2cd-740653972252",
    "order_id": "85ddd3d3-9917-425a-bce5-87d076d892af",
    "expires_at": "2026-10-28T09:53:03.676686Z",
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

`POST /api/driver/v1/offers/51779e0b-b0bb-4be6-a2cd-740653972252/accept` → **200**

```json
{
  "command_id": "0cf8e194-f5a6-4e0e-8b3d-eb28fefa1eb3"
}
```

```json
{
  "id": "46dec3a5-0401-4b8d-8fa6-b11c6bf077d0",
  "order_id": "85ddd3d3-9917-425a-bce5-87d076d892af",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393",
  "order_id": "85ddd3d3-9917-425a-bce5-87d076d892af",
  "assignment_id": "46dec3a5-0401-4b8d-8fa6-b11c6bf077d0",
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

`POST /api/driver/v1/work-sessions/9cf15fdd-8864-4920-b61a-c451a54df75e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:52:48Z",
    "sequence": 1793181168827
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9cf15fdd-8864-4920-b61a-c451a54df75e",
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
  "last_heartbeat_at": "2026-10-28T09:52:48.844127Z",
  "last_location_at": "2026-10-28T09:52:48.844127Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393/arrive` → **200**

```json
{
  "command_id": "5cf38e9a-a0f9-4948-bfd7-2f2e635d8b84",
  "expected_version": 0
}
```

```json
{
  "id": "0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393",
  "order_id": "85ddd3d3-9917-425a-bce5-87d076d892af",
  "assignment_id": "46dec3a5-0401-4b8d-8fa6-b11c6bf077d0",
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
  "arrived_at": "2026-10-28T09:52:48.87791Z",
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

`POST /api/driver/v1/trips/0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393/start` → **200**

```json
{
  "command_id": "d6613063-c1d2-482e-90b1-d1cc4a2c463a",
  "expected_version": 1
}
```

```json
{
  "id": "0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393",
  "order_id": "85ddd3d3-9917-425a-bce5-87d076d892af",
  "assignment_id": "46dec3a5-0401-4b8d-8fa6-b11c6bf077d0",
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
  "arrived_at": "2026-10-28T09:52:48.87791Z",
  "started_at": "2026-10-28T09:52:48.914651Z",
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

`POST /api/driver/v1/trips/0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393/complete` → **200**

```json
{
  "command_id": "723d8807-35bc-446c-b722-97ee5b6f49ad",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:52:48Z",
  "cash_received": true
}
```

```json
{
  "id": "0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393",
  "order_id": "85ddd3d3-9917-425a-bce5-87d076d892af",
  "assignment_id": "46dec3a5-0401-4b8d-8fa6-b11c6bf077d0",
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
  "arrived_at": "2026-10-28T09:52:48.87791Z",
  "started_at": "2026-10-28T09:52:48.914651Z",
  "completed_at": "2026-10-28T09:52:48.952758Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/85ddd3d3-9917-425a-bce5-87d076d892af` → **200**

```json
{
  "id": "85ddd3d3-9917-425a-bce5-87d076d892af",
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
    "id": "46dec3a5-0401-4b8d-8fa6-b11c6bf077d0",
    "order_id": "85ddd3d3-9917-425a-bce5-87d076d892af",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0ff95d6d-a3ea-4679-8d7f-fff6b2c5d393",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:52:48.674245Z",
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
  "session_id": "3a7807c2-29a9-4794-94ca-9b0aebaf541e",
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
  "last_heartbeat_at": "2026-10-28T09:52:48.252565Z",
  "last_location_at": "2026-10-28T09:52:48.252565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a7807c2-29a9-4794-94ca-9b0aebaf541e/close` → **200**

```json
{
  "command_id": "87de7459-628e-40ec-8881-b837d78c7953",
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
  "session_id": "9cf15fdd-8864-4920-b61a-c451a54df75e",
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
  "last_heartbeat_at": "2026-10-28T09:52:48.844127Z",
  "last_location_at": "2026-10-28T09:52:48.844127Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9cf15fdd-8864-4920-b61a-c451a54df75e/close` → **200**

```json
{
  "command_id": "7c26c1ba-a4c2-4e7c-af8c-b2d2d11fa0c2",
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

Done: terminal order 85ddd3d3-9917-425a-bce5-87d076d892af by Andrii (5a000000-0000-4000-8000-000000000403).
