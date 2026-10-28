# Sandbox transcript (2026-10-28T08:14:25Z, 718107c)

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
  "correlation_id": "8b3cff9a-155e-40b5-933a-e88bd868a52e"
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
  "session_id": "550bf530-d92d-421c-984b-c89d4a6827fd",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYxNjYsImlhdCI6MTc5MzE3NTI2NiwianRpIjoiZjBjMWJjNjEtOTQ5MS00MDc1LWE3YWItNjFhMGUzMWJlOWU1Iiwic2lkIjoiNTUwYmY1MzAtZDkyZC00MjFjLTk4NGItYzg5ZDRhNjgyN2ZkIn0.vEZ99Ms_3TjACtkkIpBOfKw_-93z34CFcBwViOngE58",
  "access_expires_at": "2026-10-28T08:29:26.44619937Z",
  "refresh_token": "Xn8dq-SDVguSL3AhjxfMOE9vLgHsPaELiQMy8gQQEnY",
  "refresh_expires_at": "2026-10-28T20:14:26.444160248Z",
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
  "session_id": "414855c2-07e2-42f6-8cd7-ae10fb70adda",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYxNjcsImlhdCI6MTc5MzE3NTI2NywianRpIjoiNDEyNGZkNzctYzU1Ny00MTJhLWE0YzQtMjc1MmVlNzEyM2E2Iiwic2lkIjoiNDE0ODU1YzItMDdlMi00MmY2LThjZDctYWUxMGZiNzBhZGRhIn0.qLzVBD4GakuqXzd1ac3JOCQTjI0EYAwp3QslyoC7EN4",
  "access_expires_at": "2026-10-28T08:29:27.676494649Z",
  "refresh_token": "bnFYIANaGSCI5Pp5WEOfLxPKs6igENZMVFQ2P_2WOqI",
  "refresh_expires_at": "2026-10-28T20:14:27.675431366Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "807be1f3-0015-4e32-8b24-995cbcab9c7b",
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
  "id": "e437f20d-d6de-4623-8e96-99c0364940e7",
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
  "created_by": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
  "created_at": "2026-10-28T08:14:27.737809Z",
  "updated_at": "2026-10-28T08:14:27.737809Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631846362",
  "device_ref": "sandbox-28121"
}
```

```json
{
  "challenge_id": "3b4e4515-3dda-45cd-a67d-6685ef09bc39",
  "expires_at": "2026-10-28T08:19:27.781190829Z",
  "resend_available_at": "2026-10-28T08:14:28.781190829Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631846362` → **200**

```json
{
  "phone": "+380631846362",
  "audience": "CLIENT",
  "code": "578610",
  "sent_at": "2026-10-28T08:14:27.790380198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b4e4515-3dda-45cd-a67d-6685ef09bc39",
  "code": "578610",
  "device_ref": "sandbox-28121"
}
```

```json
{
  "session_id": "b8abdfac-3d61-4c4f-a16e-f349a79920e0",
  "subject": {
    "type": "CLIENT",
    "id": "9a2b2576-bb8a-4c17-bc76-d6df86f8d55e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTJiMjU3Ni1iYjhhLTRjMTctYmM3Ni1kNmRmODZmOGQ1NWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MTY3LCJpYXQiOjE3OTMxNzUyNjcsImp0aSI6IjlhMjlmYzgwLWYyMzMtNDc5OC1hZmMxLTk1NmIwNjIxYjNlYSIsInNpZCI6ImI4YWJkZmFjLTNkNjEtNGM0Zi1hMTZlLWYzNDlhNzk5MjBlMCJ9.dPAcmwaqU9fLgrDRRqueHOTUP2aZojYv2VrVr_aqioE",
  "access_expires_at": "2026-10-28T08:29:27.866377584Z",
  "refresh_token": "kHHrx79JzwdLvhXRmJQe6iBUGAGTRyMbPuwD5HV1rUg",
  "refresh_expires_at": "2026-11-27T08:14:27.864561645Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631846362` → **200**

```json
{
  "client_id": "9a2b2576-bb8a-4c17-bc76-d6df86f8d55e"
}
```

`POST /api/admin/v1/rider-wallets/9a2b2576-bb8a-4c17-bc76-d6df86f8d55e/top-ups` → **201**

```json
{
  "command_id": "a66dea22-b636-48e4-92a0-45e561cc9686",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "9a2b2576-bb8a-4c17-bc76-d6df86f8d55e",
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
      "id": "0d712442-ea1f-4cd7-8ebc-0310c1c1096a",
      "at": "2026-10-28T08:14:27.950548Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a75b0ddf-2ef4-43e6-ab78-6b55c941bf19",
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
  "id": "d6aa89db-b8dd-49b4-b035-13ad2540dbf2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:19:28.094906Z",
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
      "id": "e437f20d-d6de-4623-8e96-99c0364940e7",
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
  "device_ref": "sandbox-17480"
}
```

```json
{
  "challenge_id": "c90e214c-6db6-44f3-886b-797a98c37c43",
  "expires_at": "2026-10-28T08:19:28.179903524Z",
  "resend_available_at": "2026-10-28T08:14:29.179903524Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "636042",
  "sent_at": "2026-10-28T08:14:28.185123322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c90e214c-6db6-44f3-886b-797a98c37c43",
  "code": "636042",
  "device_ref": "sandbox-17480"
}
```

```json
{
  "session_id": "b3729cff-3e05-4da9-b084-e96dbb05f320",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjE2OCwiaWF0IjoxNzkzMTc1MjY4LCJqdGkiOiI2ZTU4OTEyNi04YzRhLTQwMGMtYTQ0Yi1mZmUwNmJhNjVhMzgiLCJzaWQiOiJiMzcyOWNmZi0zZTA1LTRkYTktYjA4NC1lOTZkYmIwNWYzMjAifQ.9PyNYZpiEeoO4a0_Kvx8Nw-dYo4-nl4gg7_myxBw_i8",
  "access_expires_at": "2026-10-28T08:29:28.259032218Z",
  "refresh_token": "DevDE_3Hf1L3IuA40jjwKrdChH5gBJb2Evn2Y9LeqfA",
  "refresh_expires_at": "2026-11-27T08:14:28.25793128Z",
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
  "command_id": "6ecc8ee8-6d42-4db1-8721-d9d6b52c541e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:14:28Z",
    "sequence": 1793175268316
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "49bce283-5e5d-4305-bc2f-80379e99850d",
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
  "last_heartbeat_at": "2026-10-28T08:14:28.365158Z",
  "last_location_at": "2026-10-28T08:14:28.365158Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d574762f-a449-4260-a917-147c338bbcf9",
  "quote_id": "d6aa89db-b8dd-49b4-b035-13ad2540dbf2",
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
  "id": "209c572b-9e6c-4b9a-8ef8-de6612d4349d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a2b2576-bb8a-4c17-bc76-d6df86f8d55e",
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
  "created_at": "2026-10-28T08:14:28.472794Z",
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
  "client_id": "9a2b2576-bb8a-4c17-bc76-d6df86f8d55e",
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
      "id": "0d712442-ea1f-4cd7-8ebc-0310c1c1096a",
      "at": "2026-10-28T08:14:27.950548Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
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
    "id": "2788f7e0-5b46-4d80-8ffb-d527c6ff216f",
    "order_id": "209c572b-9e6c-4b9a-8ef8-de6612d4349d",
    "expires_at": "2026-10-28T08:14:43.492905Z",
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

`POST /api/driver/v1/offers/2788f7e0-5b46-4d80-8ffb-d527c6ff216f/accept` → **200**

```json
{
  "command_id": "dff93ffe-51d9-40d4-ad77-14b84a49acd7"
}
```

```json
{
  "id": "b8715d76-13db-4cd7-b8ba-3c6610b42433",
  "order_id": "209c572b-9e6c-4b9a-8ef8-de6612d4349d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5defd532-e0d7-4bb8-8634-8253d349004e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5defd532-e0d7-4bb8-8634-8253d349004e",
  "order_id": "209c572b-9e6c-4b9a-8ef8-de6612d4349d",
  "assignment_id": "b8715d76-13db-4cd7-b8ba-3c6610b42433",
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

`POST /api/driver/v1/work-sessions/49bce283-5e5d-4305-bc2f-80379e99850d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:14:28Z",
    "sequence": 1793175268687
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "49bce283-5e5d-4305-bc2f-80379e99850d",
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
  "last_heartbeat_at": "2026-10-28T08:14:28.709497Z",
  "last_location_at": "2026-10-28T08:14:28.709497Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5defd532-e0d7-4bb8-8634-8253d349004e/arrive` → **200**

```json
{
  "command_id": "ab5dc7a2-8e45-4e20-84ba-7b571133b84f",
  "expected_version": 0
}
```

```json
{
  "id": "5defd532-e0d7-4bb8-8634-8253d349004e",
  "order_id": "209c572b-9e6c-4b9a-8ef8-de6612d4349d",
  "assignment_id": "b8715d76-13db-4cd7-b8ba-3c6610b42433",
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
  "arrived_at": "2026-10-28T08:14:28.755197Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5defd532-e0d7-4bb8-8634-8253d349004e/start` → **200**

```json
{
  "command_id": "563a4d8c-afb2-488e-8c2d-f0757b11bb95",
  "expected_version": 1
}
```

```json
{
  "id": "5defd532-e0d7-4bb8-8634-8253d349004e",
  "order_id": "209c572b-9e6c-4b9a-8ef8-de6612d4349d",
  "assignment_id": "b8715d76-13db-4cd7-b8ba-3c6610b42433",
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
  "arrived_at": "2026-10-28T08:14:28.755197Z",
  "started_at": "2026-10-28T08:14:28.802766Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/5defd532-e0d7-4bb8-8634-8253d349004e/complete` → **200**

```json
{
  "command_id": "1d6660c1-04f2-453c-9a46-5be9cd26b344",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:14:28Z",
  "cash_received": true
}
```

```json
{
  "id": "5defd532-e0d7-4bb8-8634-8253d349004e",
  "order_id": "209c572b-9e6c-4b9a-8ef8-de6612d4349d",
  "assignment_id": "b8715d76-13db-4cd7-b8ba-3c6610b42433",
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
  "arrived_at": "2026-10-28T08:14:28.755197Z",
  "started_at": "2026-10-28T08:14:28.802766Z",
  "completed_at": "2026-10-28T08:14:28.887035Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9a2b2576-bb8a-4c17-bc76-d6df86f8d55e",
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
      "id": "ad7da69b-4249-4416-af91-2cb20dbfb93c",
      "at": "2026-10-28T08:14:29.694282Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "209c572b-9e6c-4b9a-8ef8-de6612d4349d"
    },
    {
      "id": "0d712442-ea1f-4cd7-8ebc-0310c1c1096a",
      "at": "2026-10-28T08:14:27.950548Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/e437f20d-d6de-4623-8e96-99c0364940e7/archive` → **200**

```json
{
  "command_id": "224f6a98-b11c-4ac5-af30-79fb293a7301",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "e437f20d-d6de-4623-8e96-99c0364940e7",
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
  "created_by": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
  "created_at": "2026-10-28T08:14:27.737809Z",
  "updated_at": "2026-10-28T08:14:31.975998Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "49bce283-5e5d-4305-bc2f-80379e99850d",
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
  "last_heartbeat_at": "2026-10-28T08:14:28.709497Z",
  "last_location_at": "2026-10-28T08:14:28.709497Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/49bce283-5e5d-4305-bc2f-80379e99850d/close` → **200**

```json
{
  "command_id": "3296ae96-ad50-4bda-952e-8a8e4a6a9719",
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

Done: order 209c572b-9e6c-4b9a-8ef8-de6612d4349d.

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
  "session_id": "7c5dbd68-6396-48db-94a9-d920618c5a23",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYxNzIsImlhdCI6MTc5MzE3NTI3MiwianRpIjoiODVjNzM4MjQtZjQ5YS00YzFlLWFjMzQtOTgyYWQ4NzA2ZmZkIiwic2lkIjoiN2M1ZGJkNjgtNjM5Ni00OGRiLTk0YTktZDkyMDYxOGM1YTIzIn0.ibapQaCgYzqYUeKGvxwjbEb7KgoGQXI65-tDhvwOq04",
  "access_expires_at": "2026-10-28T08:29:32.363998033Z",
  "refresh_token": "645_9GT8B8MF_kGID5f3hPCoUYZ6Pn1_5z9w4jaKm4A",
  "refresh_expires_at": "2026-10-28T20:14:32.363072197Z",
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
  "command_id": "e58de4e5-179f-42db-ade3-25e2ca793bd9",
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
  "session_id": "3fecb7d2-91b4-483c-906a-6677715210bb",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYxNzIsImlhdCI6MTc5MzE3NTI3MiwianRpIjoiYjYyMjQ4ZDYtNzQ0ZS00YjVkLTk3MWEtOGE2N2UxYmVlMWFkIiwic2lkIjoiM2ZlY2I3ZDItOTFiNC00ODNjLTkwNmEtNjY3NzcxNTIxMGJiIn0.NXkiSaHnpaeCLinC23fGgjQWh5UcStBrIY5ydbRBEbY",
  "access_expires_at": "2026-10-28T08:29:32.737136337Z",
  "refresh_token": "p6wWLjCFVUf7g0fp6E1hK-nD-2DdKKl8yOtU-uGKLOc",
  "refresh_expires_at": "2026-10-28T20:14:32.736408601Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.191615877",
    "linkedid": "1730052700.191615877",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675395793"
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
    "id": "1730052700.191615877",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "76f9676f-863a-4bb7-b36e-2ec8542288f4",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675395793",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:14:32.763036Z",
      "answered_at": null,
      "ended_at": "2026-10-28T08:14:32.784561Z",
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
    "id": "1730052600.199237",
    "linkedid": "1730052600.199237",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675395793"
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
      "id": "8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675395793",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T08:14:32.845694Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684/answer` → **200**

```json
{
  "command_id": "60c57545-12c9-4461-8dde-d0a99ba9cc60"
}
```

```json
{
  "id": "8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675395793",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
  "order_ids": [],
  "started_at": "2026-10-28T08:14:32.845694Z",
  "answered_at": "2026-10-28T08:14:32.90486Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.199237",
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
    "id": "1730052600.199237",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675395793",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
      "order_ids": [],
      "started_at": "2026-10-28T08:14:32.845694Z",
      "answered_at": "2026-10-28T08:14:32.90486Z",
      "ended_at": "2026-10-28T08:14:32.951873Z",
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
      "id": "8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675395793",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
      "order_ids": [],
      "started_at": "2026-10-28T08:14:32.845694Z",
      "answered_at": "2026-10-28T08:14:32.90486Z",
      "ended_at": "2026-10-28T08:14:32.951873Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:14:34.480545Z"
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
      "id": "8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675395793",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
      "order_ids": [],
      "started_at": "2026-10-28T08:14:32.845694Z",
      "answered_at": "2026-10-28T08:14:32.90486Z",
      "ended_at": "2026-10-28T08:14:32.951873Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T08:14:34.480545Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684` → **200**

```json
{
  "changes": [
    {
      "id": "8beb157c-c2f1-48dd-935d-1651d58ce98d",
      "occurred_at": "2026-10-28T08:14:35.089741Z",
      "actor_type": "STAFF",
      "actor_id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"94a495f6-27af-4e3e-ad3a-1f7e7c1c84d1\", \"order_ids\": []}",
      "correlation_id": "9814cb84-00f7-4a07-9b92-41641a1ee9da"
    },
    {
      "id": "4e986a36-49e6-4959-8a07-8481f93811e9",
      "occurred_at": "2026-10-28T08:14:35.060156Z",
      "actor_type": "STAFF",
      "actor_id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"94a495f6-27af-4e3e-ad3a-1f7e7c1c84d1\", \"order_ids\": []}",
      "correlation_id": "8ef06c50-d3e3-4225-92ec-de978e6c986b"
    }
  ]
}
```

Done: call 8f82d0fe-ebcd-4fa0-b4b9-d3abbca0d684 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635873015",
  "device_ref": "sandbox-18996"
}
```

```json
{
  "challenge_id": "09fddbc5-61f3-41b2-a8a3-868857faec6b",
  "expires_at": "2026-10-28T08:19:35.155027451Z",
  "resend_available_at": "2026-10-28T08:14:36.155027451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635873015` → **200**

```json
{
  "phone": "+380635873015",
  "audience": "CLIENT",
  "code": "620857",
  "sent_at": "2026-10-28T08:14:35.158551868Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09fddbc5-61f3-41b2-a8a3-868857faec6b",
  "code": "620857",
  "device_ref": "sandbox-18996"
}
```

```json
{
  "session_id": "c87700e2-fd2c-4bcd-ba5b-3990452f921b",
  "subject": {
    "type": "CLIENT",
    "id": "f242fa52-46b7-4ffe-97da-9633dc5eb9a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMjQyZmE1Mi00NmI3LTRmZmUtOTdkYS05NjMzZGM1ZWI5YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MTc1LCJpYXQiOjE3OTMxNzUyNzUsImp0aSI6ImE0Y2JjNDNjLWE0NGYtNDc5YS05NjNjLTYzZGMwODk0NGNiOCIsInNpZCI6ImM4NzcwMGUyLWZkMmMtNGJjZC1iYTViLTM5OTA0NTJmOTIxYiJ9.pGkwhUt5GPJ0U_e2IzyqSytvGFNycRUJEiEzbZhYiTM",
  "access_expires_at": "2026-10-28T08:29:35.20566514Z",
  "refresh_token": "012F1Ma1hqyJAkeAiEZWWANaB1r_Tg47biwEu6bhLyM",
  "refresh_expires_at": "2026-11-27T08:14:35.204910105Z",
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
  "device_ref": "sandbox-12929"
}
```

```json
{
  "challenge_id": "4ed62a0e-429c-4847-889c-fe8b97699923",
  "expires_at": "2026-10-28T08:19:35.253776739Z",
  "resend_available_at": "2026-10-28T08:14:36.253776739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "068050",
  "sent_at": "2026-10-28T08:14:35.256564114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ed62a0e-429c-4847-889c-fe8b97699923",
  "code": "068050",
  "device_ref": "sandbox-12929"
}
```

```json
{
  "session_id": "c392184d-ead5-4dd8-953a-eb3d834552d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjE3NSwiaWF0IjoxNzkzMTc1Mjc1LCJqdGkiOiIxOGQ3NTEyOC05OWU3LTQ0NDUtOGMxOC00ZGQ5MDQ4NTY2NmIiLCJzaWQiOiJjMzkyMTg0ZC1lYWQ1LTRkZDgtOTUzYS1lYjNkODM0NTUyZDIifQ.Kni9SW0pbN87n0tWV-uHxPLuZbcluMCew5t1aUQ4ePI",
  "access_expires_at": "2026-10-28T08:29:35.305822248Z",
  "refresh_token": "8VsQeI7FQMUYP80s8dC2bygDT-9CcTL38zLCOJ5wExA",
  "refresh_expires_at": "2026-11-27T08:14:35.305167905Z",
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
  "session_id": "6dbf7f85-1457-48ab-8782-9cebaf5f31b4",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYxNzUsImlhdCI6MTc5MzE3NTI3NSwianRpIjoiYjcwZTFhZGYtZjZiZi00NTM0LThkNzItN2IxZGE0Y2QwM2ZhIiwic2lkIjoiNmRiZjdmODUtMTQ1Ny00OGFiLTg3ODItOWNlYmFmNWYzMWI0In0._A0Kd7LEe_nzieT3hYoNzMX0KdTmqeJWRDBPB33sh6E",
  "access_expires_at": "2026-10-28T08:29:35.629393632Z",
  "refresh_token": "XkE3KnTatMmnoi2CjC9k0v3PBs_xpzVUd-4QVIAKqf4",
  "refresh_expires_at": "2026-10-28T20:14:35.628653071Z",
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
  "session_id": "d43e3cf2-a8bb-41de-8695-e3a99e11b8f6",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYxNzUsImlhdCI6MTc5MzE3NTI3NSwianRpIjoiOWU5NmI0NjUtM2Q5NC00NTJiLWFiNTctYjZkN2Q3ZThjNzNiIiwic2lkIjoiZDQzZTNjZjItYThiYi00MWRlLTg2OTUtZTNhOTllMTFiOGY2In0.Cp0rXL53YxYkO1Seh-qsJauppF1m7wnke_VXV5lLIc8",
  "access_expires_at": "2026-10-28T08:29:35.930550472Z",
  "refresh_token": "3AjKB8CCz7yGN0hOVrhZU2sJciS4sCUIfMcj22L8dPQ",
  "refresh_expires_at": "2026-10-28T20:14:35.929809238Z",
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
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора"
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
  "command_id": "bceecc05-4a0d-487c-8073-faaa4f70d58e",
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
  "id": "84e09984-ebab-464a-9642-85451ba222f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:19:35.993948Z",
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
  "command_id": "7b6be934-0c1e-4bcc-bd78-f896162cbf71",
  "quote_id": "84e09984-ebab-464a-9642-85451ba222f8",
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
  "id": "628da24b-887b-4725-9231-cae56875aeec",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f242fa52-46b7-4ffe-97da-9633dc5eb9a7",
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
  "created_at": "2026-10-28T08:14:36.038447Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/628da24b-887b-4725-9231-cae56875aeec` → **200**

```json
{
  "id": "628da24b-887b-4725-9231-cae56875aeec",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f242fa52-46b7-4ffe-97da-9633dc5eb9a7",
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
  "created_at": "2026-10-28T08:14:36.038447Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/628da24b-887b-4725-9231-cae56875aeec/cancel` → **200**

```json
{
  "command_id": "0629f307-8a8c-4a7b-836d-e0147c86f565",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "628da24b-887b-4725-9231-cae56875aeec",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f242fa52-46b7-4ffe-97da-9633dc5eb9a7",
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
  "created_at": "2026-10-28T08:14:36.038447Z",
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
  "command_id": "e94e1138-47ad-455a-975c-d5ff04c05fcc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:14:36Z",
    "sequence": 1793175276161
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1393c826-70a9-436a-b190-2c7ee99e8cb9",
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
  "last_heartbeat_at": "2026-10-28T08:14:36.178825Z",
  "last_location_at": "2026-10-28T08:14:36.178825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9609"
}
```

```json
{
  "challenge_id": "ee08675b-c9cb-4c54-9bb6-a351714d995c",
  "expires_at": "2026-10-28T08:19:36.203351454Z",
  "resend_available_at": "2026-10-28T08:14:37.203351454Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "268295",
  "sent_at": "2026-10-28T08:14:36.206500888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee08675b-c9cb-4c54-9bb6-a351714d995c",
  "code": "268295",
  "device_ref": "sandbox-9609"
}
```

```json
{
  "session_id": "adc1ce5d-a6af-44f3-9475-8622c67a17ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjE3NiwiaWF0IjoxNzkzMTc1Mjc2LCJqdGkiOiI0OGY3MWRiNy03MjI4LTQ3ZDMtODk0YS04NzNlNjQxYmU0YTYiLCJzaWQiOiJhZGMxY2U1ZC1hNmFmLTQ0ZjMtOTQ3NS04NjIyYzY3YTE3ZWEifQ.aW4itmNXcNS-I1VVjiXMxbYTVAe-HjPLBPynp8PIoFE",
  "access_expires_at": "2026-10-28T08:29:36.25325091Z",
  "refresh_token": "cRHElmVApkInShW65K3BXcmqD-FlKNAWwB3XBBTm-Us",
  "refresh_expires_at": "2026-11-27T08:14:36.25258494Z",
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
  "command_id": "2d12eb00-9dbb-4fe4-995c-9af2efe925a7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:14:36Z",
    "sequence": 1793175276295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fff53b07-5d6b-4d08-8579-6e0d75cc45b0",
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
  "last_heartbeat_at": "2026-10-28T08:14:36.311182Z",
  "last_location_at": "2026-10-28T08:14:36.311182Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9fc129d6-46f1-4811-8146-9fff4830cdb2",
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
  "id": "f6b3c2a5-4714-4ba8-8bde-c7f320730511",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T08:19:36.346953Z",
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
  "command_id": "20aaa341-418f-40b4-bcc8-3dfa2469ca7a",
  "quote_id": "f6b3c2a5-4714-4ba8-8bde-c7f320730511",
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
  "id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f242fa52-46b7-4ffe-97da-9633dc5eb9a7",
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
  "created_at": "2026-10-28T08:14:36.383068Z",
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
    "id": "cbb6196e-44c2-4c86-b5fd-f1c998db5485",
    "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
    "expires_at": "2026-10-28T08:14:51.3871Z",
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

`POST /api/driver/v1/offers/cbb6196e-44c2-4c86-b5fd-f1c998db5485/accept` → **200**

```json
{
  "command_id": "d8985c8f-44ef-407f-8887-abfd4393bdad"
}
```

```json
{
  "id": "f6c0ebcc-038d-4348-b2cb-0cce720ee6be",
  "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "df40af37-8104-4a03-82bc-2a4f1d7f34e8",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "df40af37-8104-4a03-82bc-2a4f1d7f34e8",
  "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
  "assignment_id": "f6c0ebcc-038d-4348-b2cb-0cce720ee6be",
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

`POST /api/driver/v1/trips/df40af37-8104-4a03-82bc-2a4f1d7f34e8/cancel` → **200**

```json
{
  "command_id": "4e49ccdd-89bb-4b5c-a271-e469e59f3332",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "df40af37-8104-4a03-82bc-2a4f1d7f34e8",
  "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
  "assignment_id": "f6c0ebcc-038d-4348-b2cb-0cce720ee6be",
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

`GET /api/rider/v1/orders/398bea76-4fa7-46a4-b8c0-be9e6a398f9a` → **200**

```json
{
  "id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f242fa52-46b7-4ffe-97da-9633dc5eb9a7",
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
    "id": "f6c0ebcc-038d-4348-b2cb-0cce720ee6be",
    "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "df40af37-8104-4a03-82bc-2a4f1d7f34e8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T08:14:36.383068Z",
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
    "id": "c6f09dbc-6805-4264-9c7d-85d0b83f991d",
    "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
    "expires_at": "2026-10-28T08:14:51.514116Z",
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

`POST /api/driver/v1/offers/c6f09dbc-6805-4264-9c7d-85d0b83f991d/accept` → **200**

```json
{
  "command_id": "7089e7e3-b698-44d8-84c6-4b2755e785ae"
}
```

```json
{
  "id": "63ef1ae6-626a-41c2-ba08-3a734da36a54",
  "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8fd79691-fcd2-4522-ab48-d3c00d19229d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8fd79691-fcd2-4522-ab48-d3c00d19229d",
  "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
  "assignment_id": "63ef1ae6-626a-41c2-ba08-3a734da36a54",
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

`POST /api/driver/v1/trips/8fd79691-fcd2-4522-ab48-d3c00d19229d/cancel` → **200**

```json
{
  "command_id": "b5dac43a-0d53-4b2a-9777-d562fbfe411d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "8fd79691-fcd2-4522-ab48-d3c00d19229d",
  "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
  "assignment_id": "63ef1ae6-626a-41c2-ba08-3a734da36a54",
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
    "id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:14:36.383068Z",
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
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "628da24b-887b-4725-9231-cae56875aeec",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T08:14:36.038447Z",
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
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/398bea76-4fa7-46a4-b8c0-be9e6a398f9a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T08:14:36.383741Z",
      "actor": {
        "type": "CLIENT",
        "id": "f242fa52-46b7-4ffe-97da-9633dc5eb9a7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
        "quote_id": "f6b3c2a5-4714-4ba8-8bde-c7f320730511",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T08:14:36.38608Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
        "attempt_id": "8c9e2602-8b6d-4719-a156-1853fecfd399",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T08:14:36.393356Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cbb6196e-44c2-4c86-b5fd-f1c998db5485",
        "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T08:14:36.448256Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cbb6196e-44c2-4c86-b5fd-f1c998db5485",
        "order_id": "398bea76-4fa7-46a4-b8c0-be9e6a398f9a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f6c0ebcc-038d-4348-b2cb-0cce720ee6be"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 628da24b-887b-4725-9231-cae56875aeec, 398bea76-4fa7-46a4-b8c0-be9e6a398f9a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733789631",
  "device_ref": "sandbox-24679"
}
```

```json
{
  "challenge_id": "b0fe2b31-bc59-464a-8431-6714dbc4b059",
  "expires_at": "2026-10-28T08:19:36.746043408Z",
  "resend_available_at": "2026-10-28T08:14:37.746043408Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733789631` → **200**

```json
{
  "phone": "+380733789631",
  "audience": "CLIENT",
  "code": "933583",
  "sent_at": "2026-10-28T08:14:36.748874344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0fe2b31-bc59-464a-8431-6714dbc4b059",
  "code": "933583",
  "device_ref": "sandbox-24679"
}
```

```json
{
  "session_id": "2b4cfecc-2764-40ee-9e91-f7ed4a19396d",
  "subject": {
    "type": "CLIENT",
    "id": "0a82b95e-2f0f-4545-b074-c2e348739c3e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTgyYjk1ZS0yZjBmLTQ1NDUtYjA3NC1jMmUzNDg3MzljM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MTc2LCJpYXQiOjE3OTMxNzUyNzYsImp0aSI6IjY0MWQ5OWE3LTJhYTctNGNjNC1iMjk0LTQyZDAyYjE3ZmZiMCIsInNpZCI6IjJiNGNmZWNjLTI3NjQtNDBlZS05ZTkxLWY3ZWQ0YTE5Mzk2ZCJ9.QZQt6OzJO2fx3Tb5GSaFN3yqY4GnX_FS2nOQytVo0PM",
  "access_expires_at": "2026-10-28T08:29:36.815842709Z",
  "refresh_token": "eKMgEEl0W6llRYNp7MbFrFW_sV20YyRN3ygoFlE6UzQ",
  "refresh_expires_at": "2026-11-27T08:14:36.815207588Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "abd02079-f19b-42d1-884c-3158b20784b7",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "cb5a90ea-2f80-40af-95ca-3c76624a571c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-cb5a90ea-2f80-40af-95ca-3c76624a571c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d86a906db06982e88d88b62c184bb074",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=cb5a90ea-2f80-40af-95ca-3c76624a571c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733789631"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=cb5a90ea-2f80-40af-95ca-3c76624a571c",
  "expires_at": "2026-10-28T08:44:36.850006Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/cb5a90ea-2f80-40af-95ca-3c76624a571c` → **200**

```json
{
  "id": "cb5a90ea-2f80-40af-95ca-3c76624a571c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T08:44:36.850006Z",
  "card": {
    "id": "ba82b1fa-d4ba-4dca-b05a-efbbd45f4525",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4290",
    "card_type": "Visa",
    "created_at": "2026-10-28T08:14:36.891421Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "ba82b1fa-d4ba-4dca-b05a-efbbd45f4525",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4290",
      "card_type": "Visa",
      "created_at": "2026-10-28T08:14:36.891421Z"
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
  "device_ref": "sandbox-30144"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "d79619cd-7bb8-4579-8f69-0115d6a501ac",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30144"
}
```

```json
{
  "challenge_id": "30f81457-54c6-4a1d-8576-da62a8267037",
  "expires_at": "2026-10-28T08:19:37.989060111Z",
  "resend_available_at": "2026-10-28T08:14:38.989060111Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "851744",
  "sent_at": "2026-10-28T08:14:37.991927292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30f81457-54c6-4a1d-8576-da62a8267037",
  "code": "851744",
  "device_ref": "sandbox-30144"
}
```

```json
{
  "session_id": "0a888299-2e0a-4b7c-b112-0f103b1996f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjE3OCwiaWF0IjoxNzkzMTc1Mjc4LCJqdGkiOiI3MTAwNWFmYS00NzA4LTQxYTItOGVmYi00MWNiYjVlNGY1MjkiLCJzaWQiOiIwYTg4ODI5OS0yZTBhLTRiN2MtYjExMi0wZjEwM2IxOTk2ZjUifQ.BMiIRV1eiaix2NXiv_kcbz-ak1zoOJIWc5yIoI5HVs0",
  "access_expires_at": "2026-10-28T08:29:38.0399211Z",
  "refresh_token": "Zv05gjqFUcN1n_ByyNo9Lyu4y0y1JSqiFFTpXGNk6G0",
  "refresh_expires_at": "2026-11-27T08:14:38.039253041Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fff53b07-5d6b-4d08-8579-6e0d75cc45b0",
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
  "last_heartbeat_at": "2026-10-28T08:14:36.311182Z",
  "last_location_at": "2026-10-28T08:14:36.311182Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fff53b07-5d6b-4d08-8579-6e0d75cc45b0/handover` → **200**

```json
{
  "command_id": "0c93856f-8d3d-4da8-89b2-396dfd28819a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fff53b07-5d6b-4d08-8579-6e0d75cc45b0",
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
  "last_heartbeat_at": "2026-10-28T08:14:36.311182Z",
  "last_location_at": "2026-10-28T08:14:36.311182Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fff53b07-5d6b-4d08-8579-6e0d75cc45b0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:14:38Z",
    "sequence": 1793175278119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fff53b07-5d6b-4d08-8579-6e0d75cc45b0",
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
  "last_heartbeat_at": "2026-10-28T08:14:38.137342Z",
  "last_location_at": "2026-10-28T08:14:38.137342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9bfcadb7-8fd8-4445-a7e6-f35917648a80",
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
  "id": "4075dbe0-6cee-4b69-b3de-29ccafb73913",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T08:19:38.172151Z",
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
  "command_id": "891864ce-2856-4f91-8a01-4c608d3482a0",
  "quote_id": "4075dbe0-6cee-4b69-b3de-29ccafb73913",
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
  "id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0a82b95e-2f0f-4545-b074-c2e348739c3e",
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
  "created_at": "2026-10-28T08:14:38.208241Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d` → **200**

```json
{
  "id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0a82b95e-2f0f-4545-b074-c2e348739c3e",
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
  "created_at": "2026-10-28T08:14:38.208241Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d` → **200**

```json
{
  "id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0a82b95e-2f0f-4545-b074-c2e348739c3e",
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
  "created_at": "2026-10-28T08:14:38.208241Z",
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
    "id": "5c8da439-7749-4238-9aca-a37b411809ff",
    "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
    "expires_at": "2026-10-28T08:14:53.82681Z",
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

`POST /api/driver/v1/offers/5c8da439-7749-4238-9aca-a37b411809ff/accept` → **200**

```json
{
  "command_id": "63739844-08cd-4263-a63f-1708b67f25c3"
}
```

```json
{
  "id": "efc1ec4d-f858-4626-abce-32b7427b7a98",
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7f7c7975-5d68-4d5e-b9ff-8a133de65463",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7f7c7975-5d68-4d5e-b9ff-8a133de65463",
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "assignment_id": "efc1ec4d-f858-4626-abce-32b7427b7a98",
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

`POST /api/driver/v1/work-sessions/fff53b07-5d6b-4d08-8579-6e0d75cc45b0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T08:14:39Z",
    "sequence": 1793175279384
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fff53b07-5d6b-4d08-8579-6e0d75cc45b0",
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
  "last_heartbeat_at": "2026-10-28T08:14:39.40203Z",
  "last_location_at": "2026-10-28T08:14:39.40203Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7f7c7975-5d68-4d5e-b9ff-8a133de65463/arrive` → **200**

```json
{
  "command_id": "3c985c9d-dc94-4923-8bd6-b36f1cce976a",
  "expected_version": 0
}
```

```json
{
  "id": "7f7c7975-5d68-4d5e-b9ff-8a133de65463",
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "assignment_id": "efc1ec4d-f858-4626-abce-32b7427b7a98",
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
  "arrived_at": "2026-10-28T08:14:39.435662Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7f7c7975-5d68-4d5e-b9ff-8a133de65463/start` → **200**

```json
{
  "command_id": "21096dbd-ceb0-44c5-bbeb-f2d4a866ee42",
  "expected_version": 1
}
```

```json
{
  "id": "7f7c7975-5d68-4d5e-b9ff-8a133de65463",
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "assignment_id": "efc1ec4d-f858-4626-abce-32b7427b7a98",
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
  "arrived_at": "2026-10-28T08:14:39.435662Z",
  "started_at": "2026-10-28T08:14:39.471168Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7f7c7975-5d68-4d5e-b9ff-8a133de65463/complete` → **200**

```json
{
  "command_id": "78a1ad3f-7cb0-4b29-99bd-0e340b4bf545",
  "expected_version": 2,
  "reported_at": "2026-10-28T08:14:39Z"
}
```

```json
{
  "id": "7f7c7975-5d68-4d5e-b9ff-8a133de65463",
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "assignment_id": "efc1ec4d-f858-4626-abce-32b7427b7a98",
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
  "arrived_at": "2026-10-28T08:14:39.435662Z",
  "started_at": "2026-10-28T08:14:39.471168Z",
  "completed_at": "2026-10-28T08:14:39.507923Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d` → **200**

```json
{
  "id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0a82b95e-2f0f-4545-b074-c2e348739c3e",
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
    "id": "efc1ec4d-f858-4626-abce-32b7427b7a98",
    "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7f7c7975-5d68-4d5e-b9ff-8a133de65463",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:14:38.208241Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d` → **200**

```json
{
  "id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0a82b95e-2f0f-4545-b074-c2e348739c3e",
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
    "id": "efc1ec4d-f858-4626-abce-32b7427b7a98",
    "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7f7c7975-5d68-4d5e-b9ff-8a133de65463",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:14:38.208241Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d` → **200**

```json
{
  "id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0a82b95e-2f0f-4545-b074-c2e348739c3e",
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
    "id": "efc1ec4d-f858-4626-abce-32b7427b7a98",
    "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7f7c7975-5d68-4d5e-b9ff-8a133de65463",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T08:14:38.208241Z",
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
      "id": "8a28c793-4850-40fd-a7ca-9d648d67ccb0",
      "at": "2026-10-28T08:14:39.881413Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d/tip` → **200**

```json
{
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
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
  "available_until": "2026-10-29T08:14:39.507923Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d/tip` → **201**

```json
{
  "command_id": "c7cfc5b2-4f85-4c46-a70c-6ae181520560",
  "amount_minor": 2500
}
```

```json
{
  "id": "3a605569-09c8-4780-9ef0-56252976a865",
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T08:14:41.70219Z"
}
```

`GET /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d/tip` → **200**

```json
{
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
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
  "available_until": "2026-10-29T08:14:39.507923Z",
  "open": false,
  "tip": {
    "id": "3a605569-09c8-4780-9ef0-56252976a865",
    "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T08:14:41.70219Z"
  }
}
```

`GET /api/rider/v1/orders/787097c9-0365-49f3-b1a2-9f5e21028e3d/tip` → **200**

```json
{
  "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
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
  "available_until": "2026-10-29T08:14:39.507923Z",
  "open": false,
  "tip": {
    "id": "3a605569-09c8-4780-9ef0-56252976a865",
    "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T08:14:41.70219Z"
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
      "id": "8a28c793-4850-40fd-a7ca-9d648d67ccb0",
      "at": "2026-10-28T08:14:39.881413Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
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
      "id": "c431d490-0622-4767-b6ae-4c3b2215017b",
      "at": "2026-10-28T08:14:42.931923Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
      "counterpart_id": null
    },
    {
      "id": "8a28c793-4850-40fd-a7ca-9d648d67ccb0",
      "at": "2026-10-28T08:14:39.881413Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "787097c9-0365-49f3-b1a2-9f5e21028e3d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fff53b07-5d6b-4d08-8579-6e0d75cc45b0",
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
  "last_heartbeat_at": "2026-10-28T08:14:39.40203Z",
  "last_location_at": "2026-10-28T08:14:39.40203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fff53b07-5d6b-4d08-8579-6e0d75cc45b0/close` → **200**

```json
{
  "command_id": "bb486c0b-635b-47b1-9c53-c405dd846520",
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

Done: card order 787097c9-0365-49f3-b1a2-9f5e21028e3d.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732327957",
  "device_ref": "sandbox-10072"
}
```

```json
{
  "challenge_id": "e493121e-35b0-4031-8a94-75c9e676e1e2",
  "expires_at": "2026-10-28T08:19:43.895650075Z",
  "resend_available_at": "2026-10-28T08:14:44.895650075Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732327957` → **200**

```json
{
  "phone": "+380732327957",
  "audience": "CLIENT",
  "code": "833641",
  "sent_at": "2026-10-28T08:14:43.898467968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e493121e-35b0-4031-8a94-75c9e676e1e2",
  "code": "833641",
  "device_ref": "sandbox-10072"
}
```

```json
{
  "session_id": "7b8fba0a-5d6a-4b41-a011-1cc1cff5e96a",
  "subject": {
    "type": "CLIENT",
    "id": "54787233-a7ca-41db-ac40-eeecc33ce789"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDc4NzIzMy1hN2NhLTQxZGItYWM0MC1lZWVjYzMzY2U3ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MTgzLCJpYXQiOjE3OTMxNzUyODMsImp0aSI6Ijg1M2M5MzZhLTQwMTMtNGE3NS04N2YxLWFlYjYxZWZiMThmNyIsInNpZCI6IjdiOGZiYTBhLTVkNmEtNGI0MS1hMDExLTFjYzFjZmY1ZTk2YSJ9.lFAii1gxzg3JulkoDbxIJ8ki9w1GjIxZGLpCGqwtuzc",
  "access_expires_at": "2026-10-28T08:29:43.945780343Z",
  "refresh_token": "9ToiUkPPHg4z7hw_LkshKKtHL_Ace8Apu3I2L_o4Loc",
  "refresh_expires_at": "2026-11-27T08:14:43.945228361Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "68885cf9-0940-47a4-b6e1-bb3cbf3b10c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "44436cc5-6e77-464a-8113-a50066ffd4de",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-44436cc5-6e77-464a-8113-a50066ffd4de",
    "orderDate": "1793175283",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "a8cc3cc211962d71a28dbae9bb6d2646",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=44436cc5-6e77-464a-8113-a50066ffd4de",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732327957"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=44436cc5-6e77-464a-8113-a50066ffd4de",
  "created_at": "2026-10-28T08:14:43.976285Z",
  "expires_at": "2026-10-28T08:44:43.976285Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/44436cc5-6e77-464a-8113-a50066ffd4de` → **200**

```json
{
  "id": "44436cc5-6e77-464a-8113-a50066ffd4de",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:14:43.976285Z",
  "expires_at": "2026-10-28T08:44:43.976285Z",
  "completed_at": "2026-10-28T08:14:44.009628Z",
  "masked_pan": "41****5397",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "54787233-a7ca-41db-ac40-eeecc33ce789",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "54787233-a7ca-41db-ac40-eeecc33ce789",
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
      "id": "89ad8166-d607-4ab6-946b-f518cb92d41e",
      "at": "2026-10-28T08:14:44.951268Z",
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
  "client_id": "54787233-a7ca-41db-ac40-eeecc33ce789",
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
      "id": "89ad8166-d607-4ab6-946b-f518cb92d41e",
      "at": "2026-10-28T08:14:44.951268Z",
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
  "device_ref": "sandbox-5504"
}
```

```json
{
  "challenge_id": "cb95e161-2086-45c6-a380-a157faa15ce6",
  "expires_at": "2026-10-28T08:19:45.126497751Z",
  "resend_available_at": "2026-10-28T08:14:46.126497751Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "553390",
  "sent_at": "2026-10-28T08:14:45.129201946Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb95e161-2086-45c6-a380-a157faa15ce6",
  "code": "553390",
  "device_ref": "sandbox-5504"
}
```

```json
{
  "session_id": "602443cc-4b8d-4c04-9bda-875495540068",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3NjE4NSwiaWF0IjoxNzkzMTc1Mjg1LCJqdGkiOiIwNzNlYmQzMi1lYzUyLTQzODMtYjc0OS0yNmM1ODM0MjgyZGUiLCJzaWQiOiI2MDI0NDNjYy00YjhkLTRjMDQtOWJkYS04NzU0OTU1NDAwNjgifQ.PszzlqjP9O8Yz4gPofimd_AtyPNENTr_jrrjMoc3LIg",
  "access_expires_at": "2026-10-28T08:29:45.176098939Z",
  "refresh_token": "kVC9A2Y9WgwwMAnBjprgpsD7RBWLgWbrMxVPXmvLiyw",
  "refresh_expires_at": "2026-11-27T08:14:45.175438883Z",
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
  "command_id": "cdffb882-2120-4b2c-a6a8-7bace36f7f37",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "7efc273f-9bd1-4d45-a206-bbb8768b361d",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-7efc273f-9bd1-4d45-a206-bbb8768b361d",
    "orderDate": "1793175285",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "547cef9f2dc1aef75d886acd03173cf4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=7efc273f-9bd1-4d45-a206-bbb8768b361d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=7efc273f-9bd1-4d45-a206-bbb8768b361d",
  "created_at": "2026-10-28T08:14:45.224249Z",
  "expires_at": "2026-10-28T08:44:45.224249Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/7efc273f-9bd1-4d45-a206-bbb8768b361d` → **200**

```json
{
  "id": "7efc273f-9bd1-4d45-a206-bbb8768b361d",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T08:14:45.224249Z",
  "expires_at": "2026-10-28T08:44:45.224249Z",
  "completed_at": "2026-10-28T08:14:45.251034Z",
  "masked_pan": "41****5081",
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
      "id": "c41e0d7c-1c33-4523-bc88-41c42ee70439",
      "at": "2026-10-28T08:14:45.957222Z",
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
  "command_id": "d27435e2-e6b8-470f-b82d-8e7850633ee5",
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
  "correlation_id": "33700395-4f49-408f-81bc-4a5978a08f7b"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675942925",
  "device_ref": "sandbox-28639"
}
```

```json
{
  "challenge_id": "0dd74f25-7adb-4494-a5ad-0995d7d1c08e",
  "expires_at": "2026-10-28T08:19:46.373043356Z",
  "resend_available_at": "2026-10-28T08:14:47.373043356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675942925` → **200**

```json
{
  "phone": "+380675942925",
  "audience": "CLIENT",
  "code": "703523",
  "sent_at": "2026-10-28T08:14:46.375890379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0dd74f25-7adb-4494-a5ad-0995d7d1c08e",
  "code": "703523",
  "device_ref": "sandbox-28639"
}
```

```json
{
  "session_id": "3a5978c9-9553-489e-b22f-268ef240b77a",
  "subject": {
    "type": "CLIENT",
    "id": "259d2c2e-cc68-490d-876e-77af28191b20"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTlkMmMyZS1jYzY4LTQ5MGQtODc2ZS03N2FmMjgxOTFiMjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MTg2LCJpYXQiOjE3OTMxNzUyODYsImp0aSI6ImJlZjMwOTA5LTNkYTUtNGVlOC1hZTA2LTQyZmI0YzM1YWZkMSIsInNpZCI6IjNhNTk3OGM5LTk1NTMtNDg5ZS1iMjJmLTI2OGVmMjQwYjc3YSJ9.Y5VDIzoo2UJkbbAKh4fOsDa_0aCxAekV9LC9cbdGUxE",
  "access_expires_at": "2026-10-28T08:29:46.422155186Z",
  "refresh_token": "gg21EMe4QoEr8ull5ZSGlxZbkH9oIIQM3Q06KHvjtXk",
  "refresh_expires_at": "2026-11-27T08:14:46.421524479Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "259d2c2e-cc68-490d-876e-77af28191b20",
  "session_id": "3a5978c9-9553-489e-b22f-268ef240b77a",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "43a01a0d-3e61-4dbd-a2fa-feb42b95237f",
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
  "id": "c84e922b-2721-45c0-9b07-b0c6a0b8161e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T08:19:46.473649Z",
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
  "challenge_id": "3233a3cf-aa16-4239-a922-2e3d57b8faa5",
  "expires_at": "2026-10-28T08:19:48.505065234Z",
  "resend_available_at": "2026-10-28T08:14:49.505065234Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675942925` → **200**

```json
{
  "phone": "+380675942925",
  "audience": "CLIENT",
  "code": "831144",
  "sent_at": "2026-10-28T08:14:48.507163156Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "44df194f-9d53-4964-a55c-bcbeacf93910",
  "challenge_id": "3233a3cf-aa16-4239-a922-2e3d57b8faa5",
  "otp_code": "831144"
}
```

```json
{
  "client_id": "259d2c2e-cc68-490d-876e-77af28191b20",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T08:14:48.565457243Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d52c90f4-cbf9-4b7e-a30c-a84db1f6d562",
  "quote_id": "c84e922b-2721-45c0-9b07-b0c6a0b8161e",
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
  "correlation_id": "dc43cf74-e52b-4f4c-8713-01eead6997de"
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
  "session_id": "62ae93ec-1b5f-4c05-8b83-f57527ffea27",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYxODgsImlhdCI6MTc5MzE3NTI4OCwianRpIjoiZmVhYjIzZWMtNDA4MC00MTEzLTkyYjctYzBiMDhlNzUzYjZiIiwic2lkIjoiNjJhZTkzZWMtMWI1Zi00YzA1LThiODMtZjU3NTI3ZmZlYTI3In0.XQ22-Gl9zGBztzeOTN13r9mz6lX9wUkDjfZ-1fc2h9s",
  "access_expires_at": "2026-10-28T08:29:48.901209663Z",
  "refresh_token": "YSTBiIj-vHtfbk_T3f2-t3eKZ1BM9mtSENlxU3G1W9w",
  "refresh_expires_at": "2026-10-28T20:14:48.900617084Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "259d2c2e-cc68-490d-876e-77af28191b20",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T08:14:48.565457Z",
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

`POST /api/admin/v1/client-deletions/259d2c2e-cc68-490d-876e-77af28191b20/complete` → **200**

```json
{
  "command_id": "719659dd-8ce5-44c7-abd1-acf9a0309683",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "259d2c2e-cc68-490d-876e-77af28191b20",
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
  "correlation_id": "3273581a-c29c-40ec-98db-7a7c69f6224d"
}
```

Done: client 259d2c2e-cc68-490d-876e-77af28191b20 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662226059",
  "device_ref": "sandbox-18183"
}
```

```json
{
  "challenge_id": "2ddb1a30-bd34-4f57-a258-9fa21ec6e16b",
  "expires_at": "2026-10-28T08:19:49.026845624Z",
  "resend_available_at": "2026-10-28T08:14:50.026845624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662226059` → **200**

```json
{
  "phone": "+380662226059",
  "audience": "CLIENT",
  "code": "981798",
  "sent_at": "2026-10-28T08:14:49.029624566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ddb1a30-bd34-4f57-a258-9fa21ec6e16b",
  "code": "981798",
  "device_ref": "sandbox-18183"
}
```

```json
{
  "session_id": "e900828f-f534-488b-a63f-02d38fcc56fe",
  "subject": {
    "type": "CLIENT",
    "id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZGNhMzllMy1mOWM1LTQxY2ItYWE4Mi1iOTU0ZjNhZDE3NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MTg5LCJpYXQiOjE3OTMxNzUyODksImp0aSI6ImU5YWRkMGQ1LTYyYzAtNDJiZi1iNzUyLTcyNWE3NmU2M2I5NiIsInNpZCI6ImU5MDA4MjhmLWY1MzQtNDg4Yi1hNjNmLTAyZDM4ZmNjNTZmZSJ9.SC1kDQ4nahSxmcIaC4yubfDZDPZoXyqFo92LjPuPILE",
  "access_expires_at": "2026-10-28T08:29:49.077224261Z",
  "refresh_token": "lQR_KhUHQY93ph1YjfmGQNguAxXNu9zsgLR-ayPCCGY",
  "refresh_expires_at": "2026-11-27T08:14:49.07658728Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761",
  "session_id": "e900828f-f534-488b-a63f-02d38fcc56fe",
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
  "session_id": "d6dffd99-735e-450b-a3b7-9d0c824a95df",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYxODksImlhdCI6MTc5MzE3NTI4OSwianRpIjoiY2UxMDRlNTMtYmZkZC00N2M5LTk0NjAtYjYwNzcxMWNjZjBmIiwic2lkIjoiZDZkZmZkOTktNzM1ZS00NTBiLWEzYjctOWQwYzgyNGE5NWRmIn0.4k3ZD6tXC1xG7bDXq3GcH-MfIjqYe2LMjQKToRG8Ke4",
  "access_expires_at": "2026-10-28T08:29:49.427602413Z",
  "refresh_token": "SVpGhaoNmBHVFQoOxqQ8nUOTDKBQUrvgXCUhRAS7Mh0",
  "refresh_expires_at": "2026-10-28T20:14:49.426869126Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2226059&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761",
      "phone": "+380662226059",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T08:14:49.074426Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/7dca39e3-f9c5-41cb-aa82-b954f3ad1761` → **200**

```json
{
  "client": {
    "id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761",
    "phone": "+380662226059",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T08:14:49.074426Z",
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

`POST /api/admin/v1/clients/7dca39e3-f9c5-41cb-aa82-b954f3ad1761/block` → **400**

```json
{
  "command_id": "51a39c5c-6c4c-4333-9b1f-40097abbfa0a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7dca39e3-f9c5-41cb-aa82-b954f3ad1761/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6c19d84c-ad74-4b37-942b-90cf21d2cfb0",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/7dca39e3-f9c5-41cb-aa82-b954f3ad1761/block` → **200**

```json
{
  "command_id": "326327ed-db91-4eaf-b8d0-2378da7f9c76",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761",
  "phone": "+380662226059",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T08:14:49.074426Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T08:14:49.5838Z",
    "by": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
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
  "correlation_id": "f7c3ce4c-8aef-48b1-857d-85059f48c328"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662226059",
  "device_ref": "sandbox-1366"
}
```

```json
{
  "challenge_id": "847f14d1-e1c8-46b0-91ce-1f94b62b5445",
  "expires_at": "2026-10-28T08:19:51.638670523Z",
  "resend_available_at": "2026-10-28T08:14:52.638670523Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662226059` → **200**

```json
{
  "phone": "+380662226059",
  "audience": "CLIENT",
  "code": "273911",
  "sent_at": "2026-10-28T08:14:51.641674969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "847f14d1-e1c8-46b0-91ce-1f94b62b5445",
  "code": "273911",
  "device_ref": "sandbox-1366"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "a9e118ae-43d3-45e9-b00a-4ffc249a23f2"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/7dca39e3-f9c5-41cb-aa82-b954f3ad1761` → **200**

```json
{
  "client": {
    "id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761",
    "phone": "+380662226059",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T08:14:49.074426Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T08:14:49.5838Z",
      "by": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
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

`POST /api/admin/v1/clients/7dca39e3-f9c5-41cb-aa82-b954f3ad1761/unblock` → **200**

```json
{
  "command_id": "fea4357e-dbda-4195-bf45-038c9c14c51c",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761",
  "phone": "+380662226059",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T08:14:49.074426Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662226059",
  "device_ref": "sandbox-32049"
}
```

```json
{
  "challenge_id": "9a1da2bf-f0d9-4d70-bbef-25d6626df046",
  "expires_at": "2026-10-28T08:19:53.775875917Z",
  "resend_available_at": "2026-10-28T08:14:54.775875917Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662226059` → **200**

```json
{
  "phone": "+380662226059",
  "audience": "CLIENT",
  "code": "722980",
  "sent_at": "2026-10-28T08:14:53.778087029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a1da2bf-f0d9-4d70-bbef-25d6626df046",
  "code": "722980",
  "device_ref": "sandbox-32049"
}
```

```json
{
  "session_id": "8443aec6-5fd5-45f1-886a-3cd88470b64d",
  "subject": {
    "type": "CLIENT",
    "id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZGNhMzllMy1mOWM1LTQxY2ItYWE4Mi1iOTU0ZjNhZDE3NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MTkzLCJpYXQiOjE3OTMxNzUyOTMsImp0aSI6ImMxNjg2ZjU0LTg4NGMtNDZlZi1hZjhiLTM2YzRiNzRlYWIzNCIsInNpZCI6Ijg0NDNhZWM2LTVmZDUtNDVmMS04ODZhLTNjZDg4NDcwYjY0ZCJ9.QB6VT60aep37j_DGtRef79KPP0zEATl6QXtzZXWe-bw",
  "access_expires_at": "2026-10-28T08:29:53.826396341Z",
  "refresh_token": "Jp6lKX0GraROv_61rXzZfLPlYsvRBJM_nRCNmdIJYQo",
  "refresh_expires_at": "2026-11-27T08:14:53.825672992Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7dca39e3-f9c5-41cb-aa82-b954f3ad1761",
  "session_id": "8443aec6-5fd5-45f1-886a-3cd88470b64d",
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
  "phone": "+380636074932",
  "device_ref": "sandbox-1349"
}
```

```json
{
  "challenge_id": "57681dde-971d-4948-96aa-f52bb02bdf5a",
  "expires_at": "2026-10-28T08:19:53.879311508Z",
  "resend_available_at": "2026-10-28T08:14:54.879311508Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636074932` → **200**

```json
{
  "phone": "+380636074932",
  "audience": "CLIENT",
  "code": "687289",
  "sent_at": "2026-10-28T08:14:53.881736931Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57681dde-971d-4948-96aa-f52bb02bdf5a",
  "code": "687289",
  "device_ref": "sandbox-1349"
}
```

```json
{
  "session_id": "d8673b0d-ac72-4df6-a359-15be67ed51f6",
  "subject": {
    "type": "CLIENT",
    "id": "d469735f-1cbb-41b7-9d56-c5d7583cdfd4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNDY5NzM1Zi0xY2JiLTQxYjctOWQ1Ni1jNWQ3NTgzY2RmZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MTkzLCJpYXQiOjE3OTMxNzUyOTMsImp0aSI6ImNmMmE5ZjY1LTgzMDItNGNmZC05OWI5LWE5YmI3OWJiNjgzZiIsInNpZCI6ImQ4NjczYjBkLWFjNzItNGRmNi1hMzU5LTE1YmU2N2VkNTFmNiJ9.tJSxVjfDIMLevYhTqCpDTu6m6j7nWpxM3a7BpPDEvZE",
  "access_expires_at": "2026-10-28T08:29:53.928403088Z",
  "refresh_token": "-VJjotoL6Lhcnqp_QgOI9DdQqpgD1c8G5xsrrNszoxk",
  "refresh_expires_at": "2026-11-27T08:14:53.927813589Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "810ba73d-46f4-42cf-83b8-1dd550018aa5",
  "expires_at": "2026-10-28T08:19:55.956338833Z",
  "resend_available_at": "2026-10-28T08:14:56.956338833Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636074932` → **200**

```json
{
  "phone": "+380636074932",
  "audience": "CLIENT",
  "code": "782715",
  "sent_at": "2026-10-28T08:14:55.958607188Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a1f4c2e1-46c4-4feb-8f60-f281cee5354a",
  "challenge_id": "810ba73d-46f4-42cf-83b8-1dd550018aa5",
  "otp_code": "782715"
}
```

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "PENDING",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce` → **200**

```json
{
  "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
  "state": "READY",
  "created_at": "2026-10-28T08:14:56.011086Z",
  "ready_at": "2026-10-28T08:15:04.483374Z",
  "expires_at": "2026-11-04T08:15:04.483374Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633927631",
  "device_ref": "sandbox-18921"
}
```

```json
{
  "challenge_id": "4af6ab08-f273-4e58-9173-0e71cba58078",
  "expires_at": "2026-10-28T08:20:05.286996553Z",
  "resend_available_at": "2026-10-28T08:15:06.286996553Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633927631` → **200**

```json
{
  "phone": "+380633927631",
  "audience": "CLIENT",
  "code": "654427",
  "sent_at": "2026-10-28T08:15:05.289574975Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4af6ab08-f273-4e58-9173-0e71cba58078",
  "code": "654427",
  "device_ref": "sandbox-18921"
}
```

```json
{
  "session_id": "aa26a469-6c52-45e9-85f5-759439fd7435",
  "subject": {
    "type": "CLIENT",
    "id": "ee8563f6-7433-4e4e-b399-12ef870cbade"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTg1NjNmNi03NDMzLTRlNGUtYjM5OS0xMmVmODcwY2JhZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc2MjA1LCJpYXQiOjE3OTMxNzUzMDUsImp0aSI6ImMxYmQ2ZjUxLWFjOTgtNDViZi1hZmRjLTVkZmMyYjViMjU4MCIsInNpZCI6ImFhMjZhNDY5LTZjNTItNDVlOS04NWY1LTc1OTQzOWZkNzQzNSJ9.MFplofvrBKKxz4ZQ2WM35jSmrvucbz5Wggx7g0QoeKk",
  "access_expires_at": "2026-10-28T08:30:05.335581659Z",
  "refresh_token": "sWlBI-cgvhi_fML0pYgvrDwYQtRAN3XKnKM0WuX-jkY",
  "refresh_expires_at": "2026-11-27T08:15:05.335018829Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/b352b379-3128-42cb-a4e4-0f3dc03461ce/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7aefc387-8bdb-424b-ae87-401a025a8c70"
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
  "session_id": "4d5c5d08-73de-430e-ad2f-41d68aa410aa",
  "subject": {
    "type": "STAFF",
    "id": "486ed485-2fb1-4842-bd8e-7c03e7f7d4d2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlZDQ4NS0yZmIxLTQ4NDItYmQ4ZS03YzAzZTdmN2Q0ZDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzYyMDUsImlhdCI6MTc5MzE3NTMwNSwianRpIjoiNDQzOTNhMzYtNjZhOC00NWZiLWE1OGMtOWQ4ZmQxOTI2ZDlhIiwic2lkIjoiNGQ1YzVkMDgtNzNkZS00MzBlLWFkMmYtNDFkNjhhYTQxMGFhIn0.cgQIVH42K6iaY7g3tjheKNb-DbMhnvPtNIjaQHFNIS8",
  "access_expires_at": "2026-10-28T08:30:05.659946551Z",
  "refresh_token": "E0LJ-7f77mtYq05huwLyjTMBcWaGfaS9cj95oIoPgIo",
  "refresh_expires_at": "2026-10-28T20:15:05.659331687Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d469735f-1cbb-41b7-9d56-c5d7583cdfd4",
  "session_id": "d8673b0d-ac72-4df6-a359-15be67ed51f6",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/d469735f-1cbb-41b7-9d56-c5d7583cdfd4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "b352b379-3128-42cb-a4e4-0f3dc03461ce",
      "state": "READY",
      "created_at": "2026-10-28T08:14:56.011086Z",
      "ready_at": "2026-10-28T08:15:04.483374Z",
      "expires_at": "2026-11-04T08:15:04.483374Z",
      "size_bytes": 1031
    }
  ]
}
```

Done: the copy was asked for with a code, built in the background and downloaded by the rider only.
