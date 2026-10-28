# Sandbox transcript (2026-10-28T09:13:22Z, 839d448)

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
  "correlation_id": "fcef6d93-94bf-4a3d-b38c-ea1b4eed8d00"
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
  "session_id": "96b482cb-1b6f-48f0-acf1-85b4dd64047f",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3MDIsImlhdCI6MTc5MzE3ODgwMiwianRpIjoiZmViYjE2Y2ItMWVkNi00MmQ1LThiNDktMDZkZDdkOTA3M2U2Iiwic2lkIjoiOTZiNDgyY2ItMWI2Zi00OGYwLWFjZjEtODViNGRkNjQwNDdmIn0.ZkODO5i8iRneQFGtS6sNqHUDApmC9oVIC64ywJO_eLQ",
  "access_expires_at": "2026-10-28T09:28:22.700157416Z",
  "refresh_token": "9I4L6i8xiqN0yZnvaVRkviv4fLSYjDFxKg6dqdZOoto",
  "refresh_expires_at": "2026-10-28T21:13:22.697678928Z",
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
  "session_id": "d7ba10be-c09e-436d-bd7c-2747f29430bf",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3MDMsImlhdCI6MTc5MzE3ODgwMywianRpIjoiM2FmNjJmODUtNTQyMC00ZDgxLWJlYTAtZTg3NjIyZjcxZDNmIiwic2lkIjoiZDdiYTEwYmUtYzA5ZS00MzZkLWJkN2MtMjc0N2YyOTQzMGJmIn0.GodpdEbe9-Pb8uA4WusOX2FnuVAJBmgSniTyIsR9UdA",
  "access_expires_at": "2026-10-28T09:28:23.643943938Z",
  "refresh_token": "GoPzlReFbYtCTnRpvnL6kbc1lMJo2h35OGlXfaaYy7M",
  "refresh_expires_at": "2026-10-28T21:13:23.643158083Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0cfcae55-0e0b-41b7-a591-0cddccec8b3e",
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
  "id": "eb9e727d-f16d-4794-bf51-1192d5e8445d",
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
  "created_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "created_at": "2026-10-28T09:13:23.698718Z",
  "updated_at": "2026-10-28T09:13:23.698718Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635143393",
  "device_ref": "sandbox-803"
}
```

```json
{
  "challenge_id": "b3622fed-47c6-4396-95d7-81f6eab47f77",
  "expires_at": "2026-10-28T09:18:23.782929374Z",
  "resend_available_at": "2026-10-28T09:13:24.782929374Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635143393` → **200**

```json
{
  "phone": "+380635143393",
  "audience": "CLIENT",
  "code": "903201",
  "sent_at": "2026-10-28T09:13:23.789294307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3622fed-47c6-4396-95d7-81f6eab47f77",
  "code": "903201",
  "device_ref": "sandbox-803"
}
```

```json
{
  "session_id": "2b75c163-e2f3-42e8-bfc1-722b5e95ff3f",
  "subject": {
    "type": "CLIENT",
    "id": "d27a0740-2d54-437f-b533-68dbca48a7bb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjdhMDc0MC0yZDU0LTQzN2YtYjUzMy02OGRiY2E0OGE3YmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzAzLCJpYXQiOjE3OTMxNzg4MDMsImp0aSI6IjBlZmNlOGMxLWU5ZDYtNDMxZi05NGIxLTc4MjY0MDliY2M0MiIsInNpZCI6IjJiNzVjMTYzLWUyZjMtNDJlOC1iZmMxLTcyMmI1ZTk1ZmYzZiJ9.oaclqswnDpDM0aBO1o8TYdRgYqskIixO64xWguAFvbg",
  "access_expires_at": "2026-10-28T09:28:23.861826824Z",
  "refresh_token": "DJKYCecZ5VEvEMf0r8ISGVu-SK3XHvgri_Qq-HRC00M",
  "refresh_expires_at": "2026-11-27T09:13:23.860871943Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635143393` → **200**

```json
{
  "client_id": "d27a0740-2d54-437f-b533-68dbca48a7bb"
}
```

`POST /api/admin/v1/rider-wallets/d27a0740-2d54-437f-b533-68dbca48a7bb/top-ups` → **201**

```json
{
  "command_id": "b5de98da-d9ac-40f5-b008-7f26b8c80d32",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d27a0740-2d54-437f-b533-68dbca48a7bb",
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
      "id": "e3153b94-fb3b-4296-80cc-110d068c77e4",
      "at": "2026-10-28T09:13:23.94784Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08c316f5-77f2-4040-8695-07b91f6ff36d",
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
  "id": "4aa0b902-efc4-42ab-a6ec-e46b7c303460",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:18:24.092642Z",
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
      "id": "eb9e727d-f16d-4794-bf51-1192d5e8445d",
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
  "device_ref": "sandbox-30972"
}
```

```json
{
  "challenge_id": "e3078176-79b5-4730-a0ea-8b74c70bb76c",
  "expires_at": "2026-10-28T09:18:24.150194333Z",
  "resend_available_at": "2026-10-28T09:13:25.150194333Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "864044",
  "sent_at": "2026-10-28T09:13:24.153349273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3078176-79b5-4730-a0ea-8b74c70bb76c",
  "code": "864044",
  "device_ref": "sandbox-30972"
}
```

```json
{
  "session_id": "6d0b1a55-06ba-4b0d-bb49-affb2d5a0f47",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTcwNCwiaWF0IjoxNzkzMTc4ODA0LCJqdGkiOiJjMDFlN2VkYS00ZjMwLTRjOTYtOTNjNC04MjFmOWQ1YTM5NjciLCJzaWQiOiI2ZDBiMWE1NS0wNmJhLTRiMGQtYmI0OS1hZmZiMmQ1YTBmNDcifQ.RdRHZOzh5Ew0DiK1MmS3GOVtLd-hVxEa1AaZPmZdjl0",
  "access_expires_at": "2026-10-28T09:28:24.216669342Z",
  "refresh_token": "GCklLViAfawlFcSSzwttFMVKbdQ0qXDvDiHTXsnM9a8",
  "refresh_expires_at": "2026-11-27T09:13:24.21576474Z",
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
  "command_id": "faa36613-1886-4fef-82a8-c42a2ddbb93f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:13:24Z",
    "sequence": 1793178804279
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cc2d7e05-6d0f-4e64-8ea0-d5e63f8345a7",
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
  "last_heartbeat_at": "2026-10-28T09:13:24.320808Z",
  "last_location_at": "2026-10-28T09:13:24.320808Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "676e8b34-b125-4999-b9e5-8bd8801e2e07",
  "quote_id": "4aa0b902-efc4-42ab-a6ec-e46b7c303460",
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
  "id": "f77f419b-8c48-4502-b843-411704caaeb7",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d27a0740-2d54-437f-b533-68dbca48a7bb",
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
  "created_at": "2026-10-28T09:13:24.406848Z",
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
  "client_id": "d27a0740-2d54-437f-b533-68dbca48a7bb",
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
      "id": "e3153b94-fb3b-4296-80cc-110d068c77e4",
      "at": "2026-10-28T09:13:23.94784Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
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
    "id": "7df2d499-f6bd-4246-b543-3074fe49dde9",
    "order_id": "f77f419b-8c48-4502-b843-411704caaeb7",
    "expires_at": "2026-10-28T09:13:39.420264Z",
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

`POST /api/driver/v1/offers/7df2d499-f6bd-4246-b543-3074fe49dde9/accept` → **200**

```json
{
  "command_id": "e1d55e0d-0310-41e8-bebd-8373205e62d9"
}
```

```json
{
  "id": "a130634c-364a-4cef-91ef-63419c44f485",
  "order_id": "f77f419b-8c48-4502-b843-411704caaeb7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "797738a5-01a0-46bd-96d9-4af7724c459f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "797738a5-01a0-46bd-96d9-4af7724c459f",
  "order_id": "f77f419b-8c48-4502-b843-411704caaeb7",
  "assignment_id": "a130634c-364a-4cef-91ef-63419c44f485",
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

`POST /api/driver/v1/work-sessions/cc2d7e05-6d0f-4e64-8ea0-d5e63f8345a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:13:24Z",
    "sequence": 1793178804607
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cc2d7e05-6d0f-4e64-8ea0-d5e63f8345a7",
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
  "last_heartbeat_at": "2026-10-28T09:13:24.63064Z",
  "last_location_at": "2026-10-28T09:13:24.63064Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/797738a5-01a0-46bd-96d9-4af7724c459f/arrive` → **200**

```json
{
  "command_id": "e15bb87a-42f5-46cc-b5eb-881c7b01d0ab",
  "expected_version": 0
}
```

```json
{
  "id": "797738a5-01a0-46bd-96d9-4af7724c459f",
  "order_id": "f77f419b-8c48-4502-b843-411704caaeb7",
  "assignment_id": "a130634c-364a-4cef-91ef-63419c44f485",
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
  "arrived_at": "2026-10-28T09:13:24.677134Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/797738a5-01a0-46bd-96d9-4af7724c459f/start` → **200**

```json
{
  "command_id": "5bc82b1e-7680-42f0-9bd6-8dddf9f3db26",
  "expected_version": 1
}
```

```json
{
  "id": "797738a5-01a0-46bd-96d9-4af7724c459f",
  "order_id": "f77f419b-8c48-4502-b843-411704caaeb7",
  "assignment_id": "a130634c-364a-4cef-91ef-63419c44f485",
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
  "arrived_at": "2026-10-28T09:13:24.677134Z",
  "started_at": "2026-10-28T09:13:24.721939Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/797738a5-01a0-46bd-96d9-4af7724c459f/complete` → **200**

```json
{
  "command_id": "134963fe-0877-4c69-b55f-2cd1e0aa650d",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:13:24Z",
  "cash_received": true
}
```

```json
{
  "id": "797738a5-01a0-46bd-96d9-4af7724c459f",
  "order_id": "f77f419b-8c48-4502-b843-411704caaeb7",
  "assignment_id": "a130634c-364a-4cef-91ef-63419c44f485",
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
  "arrived_at": "2026-10-28T09:13:24.677134Z",
  "started_at": "2026-10-28T09:13:24.721939Z",
  "completed_at": "2026-10-28T09:13:24.783983Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d27a0740-2d54-437f-b533-68dbca48a7bb",
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
      "id": "8f40bce5-f269-4a8d-b2b0-738d442ef0c6",
      "at": "2026-10-28T09:13:25.535347Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f77f419b-8c48-4502-b843-411704caaeb7"
    },
    {
      "id": "e3153b94-fb3b-4296-80cc-110d068c77e4",
      "at": "2026-10-28T09:13:23.94784Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/eb9e727d-f16d-4794-bf51-1192d5e8445d/archive` → **200**

```json
{
  "command_id": "b543e9ff-1cde-4ec9-9fa2-1aa5c72f3a06",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "eb9e727d-f16d-4794-bf51-1192d5e8445d",
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
  "created_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "created_at": "2026-10-28T09:13:23.698718Z",
  "updated_at": "2026-10-28T09:13:27.869779Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cc2d7e05-6d0f-4e64-8ea0-d5e63f8345a7",
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
  "last_heartbeat_at": "2026-10-28T09:13:24.63064Z",
  "last_location_at": "2026-10-28T09:13:24.63064Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cc2d7e05-6d0f-4e64-8ea0-d5e63f8345a7/close` → **200**

```json
{
  "command_id": "b6b2ac3b-8a64-4131-8b8e-03a414e2b4ba",
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

Done: order f77f419b-8c48-4502-b843-411704caaeb7.

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
  "session_id": "45e8f512-7924-4185-a71e-85917aac8c5f",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3MDgsImlhdCI6MTc5MzE3ODgwOCwianRpIjoiN2QwNzMxNzItNzhkOC00YzFiLWIxZjQtNzhmMGE2Zjc1ZWFiIiwic2lkIjoiNDVlOGY1MTItNzkyNC00MTg1LWE3MWUtODU5MTdhYWM4YzVmIn0.3Jy87wCWDGL-SN4oaKeActvgZimLj8-o7kbzaqQCG2g",
  "access_expires_at": "2026-10-28T09:28:28.196463974Z",
  "refresh_token": "Lq10ts2bhzaQ_Z1_5eRgdkLvSgljGcc_6Lmal8yjLF8",
  "refresh_expires_at": "2026-10-28T21:13:28.195681883Z",
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
  "command_id": "bf5bac03-81c2-4005-ba49-c2c289901e8c",
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
  "session_id": "7c73fdcc-90c4-40e9-9955-9458407ebaa9",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3MDgsImlhdCI6MTc5MzE3ODgwOCwianRpIjoiMjNlNDFjOWEtZTBkOS00MjgxLTgxN2ItNDZlZmRiZWMzNTUwIiwic2lkIjoiN2M3M2ZkY2MtOTBjNC00MGU5LTk5NTUtOTQ1ODQwN2ViYWE5In0.9iZXXLiGGexfhMQPZ6JtIwq9bx_6T3uLDM2UmyDruME",
  "access_expires_at": "2026-10-28T09:28:28.508046997Z",
  "refresh_token": "Ok8QSBt-uRuF4dkuQYvnwHPmJdMBKXinxBDOHjcSmG4",
  "refresh_expires_at": "2026-10-28T21:13:28.507327706Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.553410283",
    "linkedid": "1730052700.553410283",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672246516"
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
    "id": "1730052700.553410283",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "701e554e-1a9a-451a-af7b-887a5f420b6c",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672246516",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:13:28.535767Z",
      "answered_at": null,
      "ended_at": "2026-10-28T09:13:28.55971Z",
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
    "id": "1730052600.1037722813",
    "linkedid": "1730052600.1037722813",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672246516"
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
      "id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672246516",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:13:28.627293Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/1da8654f-7db9-4d7f-ab75-9730f64cedf4/answer` → **200**

```json
{
  "command_id": "9ceea10f-9b04-436b-8bb2-71628cf658af"
}
```

```json
{
  "id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672246516",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "order_ids": [],
  "started_at": "2026-10-28T09:13:28.627293Z",
  "answered_at": "2026-10-28T09:13:28.694223Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1037722813",
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
    "id": "1730052600.1037722813",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672246516",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [],
      "started_at": "2026-10-28T09:13:28.627293Z",
      "answered_at": "2026-10-28T09:13:28.694223Z",
      "ended_at": "2026-10-28T09:13:28.757108Z",
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
      "id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672246516",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [],
      "started_at": "2026-10-28T09:13:28.627293Z",
      "answered_at": "2026-10-28T09:13:28.694223Z",
      "ended_at": "2026-10-28T09:13:28.757108Z",
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
      "id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672246516",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [],
      "started_at": "2026-10-28T09:13:28.627293Z",
      "answered_at": "2026-10-28T09:13:28.694223Z",
      "ended_at": "2026-10-28T09:13:28.757108Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:13:31.396405Z"
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
      "id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672246516",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [],
      "started_at": "2026-10-28T09:13:28.627293Z",
      "answered_at": "2026-10-28T09:13:28.694223Z",
      "ended_at": "2026-10-28T09:13:28.757108Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:13:31.396405Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/1da8654f-7db9-4d7f-ab75-9730f64cedf4/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/1da8654f-7db9-4d7f-ab75-9730f64cedf4/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=1da8654f-7db9-4d7f-ab75-9730f64cedf4` → **200**

```json
{
  "changes": [
    {
      "id": "c115eaaf-598e-4cd7-afb4-fb66a959d0c0",
      "occurred_at": "2026-10-28T09:13:32.963825Z",
      "actor_type": "STAFF",
      "actor_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"6327b3ea-11cb-41a9-8aee-b910e2754104\", \"order_ids\": []}",
      "correlation_id": "ecf331e4-cd85-4bc5-a4e2-18f0f44e5987"
    },
    {
      "id": "8c6c04f0-942f-4b78-abc5-c11c10bdbf0d",
      "occurred_at": "2026-10-28T09:13:32.926879Z",
      "actor_type": "STAFF",
      "actor_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"6327b3ea-11cb-41a9-8aee-b910e2754104\", \"order_ids\": []}",
      "correlation_id": "0adf410b-73e2-4a05-b087-5aaf21f8c7d8"
    }
  ]
}
```

Done: call 1da8654f-7db9-4d7f-ab75-9730f64cedf4 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633370224",
  "device_ref": "sandbox-18222"
}
```

```json
{
  "challenge_id": "fd2b0eac-3e10-450f-ad7f-ec0b70422894",
  "expires_at": "2026-10-28T09:18:33.032922778Z",
  "resend_available_at": "2026-10-28T09:13:34.032922778Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633370224` → **200**

```json
{
  "phone": "+380633370224",
  "audience": "CLIENT",
  "code": "291312",
  "sent_at": "2026-10-28T09:13:33.036032327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd2b0eac-3e10-450f-ad7f-ec0b70422894",
  "code": "291312",
  "device_ref": "sandbox-18222"
}
```

```json
{
  "session_id": "83bcb632-6909-46bc-93c3-ec04bed63698",
  "subject": {
    "type": "CLIENT",
    "id": "8f96cd6f-3f59-4cf3-8552-1405f5382d7c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Zjk2Y2Q2Zi0zZjU5LTRjZjMtODU1Mi0xNDA1ZjUzODJkN2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzEzLCJpYXQiOjE3OTMxNzg4MTMsImp0aSI6IjhkMWZlY2QxLTRmMTAtNDg3NC1hMDVjLWYzODllYzBhYzMzMCIsInNpZCI6IjgzYmNiNjMyLTY5MDktNDZiYy05M2MzLWVjMDRiZWQ2MzY5OCJ9.LZ7OJDJBcN9Mwf3f7M-7A-J9UKHx-rxm0EB1OS0ng7c",
  "access_expires_at": "2026-10-28T09:28:33.090753947Z",
  "refresh_token": "E7L3_JludQp4KLNmCtiN82zD9bCVfHUWRX9CyHinI2U",
  "refresh_expires_at": "2026-11-27T09:13:33.090087915Z",
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
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
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
  "device_ref": "sandbox-24503"
}
```

```json
{
  "challenge_id": "78d44169-030d-4c15-b42a-2988b8ff5fde",
  "expires_at": "2026-10-28T09:18:33.147302781Z",
  "resend_available_at": "2026-10-28T09:13:34.147302781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "747615",
  "sent_at": "2026-10-28T09:13:33.150168804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78d44169-030d-4c15-b42a-2988b8ff5fde",
  "code": "747615",
  "device_ref": "sandbox-24503"
}
```

```json
{
  "session_id": "b9cd2674-a520-43f5-8596-1629336b1a04",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTcxMywiaWF0IjoxNzkzMTc4ODEzLCJqdGkiOiI5NTY2ZWQ4ZC05ZGVjLTQzMjYtYjg3MS1kOGUzOGFlYjkyNWYiLCJzaWQiOiJiOWNkMjY3NC1hNTIwLTQzZjUtODU5Ni0xNjI5MzM2YjFhMDQifQ.cDN2G7esa326KVSrs3qHp6wfskPFSnhhDKiVWmvKOes",
  "access_expires_at": "2026-10-28T09:28:33.204741476Z",
  "refresh_token": "WmX76vCsNfs6o6sPf3aXbzk7ZwVGq5wnODP7BZG7ebU",
  "refresh_expires_at": "2026-11-27T09:13:33.204210983Z",
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
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
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
  "session_id": "6dc52031-9c71-4bf2-b37f-c81eebe7b816",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3MTMsImlhdCI6MTc5MzE3ODgxMywianRpIjoiYzMzNjYyMzMtYTg0My00ODExLTlkMzAtMDIyNDEyOTNkNDEzIiwic2lkIjoiNmRjNTIwMzEtOWM3MS00YmYyLWIzN2YtYzgxZWViZTdiODE2In0.xw2FoV6PaVdguoiKtQ8uIyoZRDGaM83Uf9JHs1Bm84g",
  "access_expires_at": "2026-10-28T09:28:33.465745277Z",
  "refresh_token": "sTxRBB-DRmfsOOe_29lpujplpOfv0EptsTGbTa8iB6A",
  "refresh_expires_at": "2026-10-28T21:13:33.465224253Z",
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
  "session_id": "e7613737-56cd-4c7a-a21a-30a1db556d6d",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3MTMsImlhdCI6MTc5MzE3ODgxMywianRpIjoiMjcyOWMxODUtMmYxYS00MTM5LWIwODUtZDE3ZmI2YTIxM2NlIiwic2lkIjoiZTc2MTM3MzctNTZjZC00YzdhLWEyMWEtMzBhMWRiNTU2ZDZkIn0.cslBoryhx-xZqnKZT_nxQ2aCp5bhjTIENzW1sLKdwBI",
  "access_expires_at": "2026-10-28T09:28:33.700976837Z",
  "refresh_token": "54SKbH-6Bo5vPlVpDeo3YMTEchjuZu4oKM5gfFmSK14",
  "refresh_expires_at": "2026-10-28T21:13:33.700438903Z",
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
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП",
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
  "command_id": "82fc34b8-ce48-4ddb-8040-8591606957ee",
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
  "id": "b1a57d18-cff4-44c5-84c4-bb26365a1b61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T09:18:33.783491Z",
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
  "command_id": "b00ac640-cb31-479e-87d6-01e3f879be4a",
  "quote_id": "b1a57d18-cff4-44c5-84c4-bb26365a1b61",
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
  "id": "0516f6a7-5c6e-4fb6-92a2-ad95abbcc3e6",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f96cd6f-3f59-4cf3-8552-1405f5382d7c",
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
  "created_at": "2026-10-28T09:13:33.823984Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/0516f6a7-5c6e-4fb6-92a2-ad95abbcc3e6` → **200**

```json
{
  "id": "0516f6a7-5c6e-4fb6-92a2-ad95abbcc3e6",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f96cd6f-3f59-4cf3-8552-1405f5382d7c",
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
  "created_at": "2026-10-28T09:13:33.823984Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0516f6a7-5c6e-4fb6-92a2-ad95abbcc3e6/cancel` → **200**

```json
{
  "command_id": "f981b6a1-3f50-4ccf-a33a-2fcd075b493f",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "0516f6a7-5c6e-4fb6-92a2-ad95abbcc3e6",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8f96cd6f-3f59-4cf3-8552-1405f5382d7c",
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
  "created_at": "2026-10-28T09:13:33.823984Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
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
  "command_id": "87acae56-6991-4676-801a-b62284aafac4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:13:33Z",
    "sequence": 1793178813950
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4acee6e5-932c-4726-bedf-9434ff01657f",
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
  "last_heartbeat_at": "2026-10-28T09:13:33.968511Z",
  "last_location_at": "2026-10-28T09:13:33.968511Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14930"
}
```

```json
{
  "challenge_id": "1a6811fe-d884-4b40-8be5-9155277ae0d2",
  "expires_at": "2026-10-28T09:18:34.007611945Z",
  "resend_available_at": "2026-10-28T09:13:35.007611945Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "966128",
  "sent_at": "2026-10-28T09:13:34.010929104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a6811fe-d884-4b40-8be5-9155277ae0d2",
  "code": "966128",
  "device_ref": "sandbox-14930"
}
```

```json
{
  "session_id": "a8b7407a-86f2-40ab-bf6e-572f9aaf2480",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTcxNCwiaWF0IjoxNzkzMTc4ODE0LCJqdGkiOiI0OTc0MzJlMi1kM2NjLTQ1ZmMtYmJmNC00N2E1YTQ1OWYxOTQiLCJzaWQiOiJhOGI3NDA3YS04NmYyLTQwYWItYmY2ZS01NzJmOWFhZjI0ODAifQ.sHxjD1gcq3N10CrBa1xDZPREH689sVanYghKPSTknCk",
  "access_expires_at": "2026-10-28T09:28:34.063642216Z",
  "refresh_token": "YHajSrKhxc9kzfpdtcjEpwvE4ytCezFPRP6WhBsm8D4",
  "refresh_expires_at": "2026-11-27T09:13:34.063139996Z",
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
  "command_id": "ef9509d3-72c7-445b-a6f4-97c640f79b7f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:13:34Z",
    "sequence": 1793178814110
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2",
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
  "last_heartbeat_at": "2026-10-28T09:13:34.12819Z",
  "last_location_at": "2026-10-28T09:13:34.12819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "89038ee6-a044-47f1-b2d7-729cd7a3d18b",
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
  "id": "9fd2f5b9-efdc-4bbb-955c-b39d043972b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T09:18:34.166803Z",
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
  "command_id": "58c1fa1d-9b34-4008-93cd-b639d1c479d5",
  "quote_id": "9fd2f5b9-efdc-4bbb-955c-b39d043972b9",
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
  "id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f96cd6f-3f59-4cf3-8552-1405f5382d7c",
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
  "created_at": "2026-10-28T09:13:34.205511Z",
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
    "id": "69dea8e6-7f84-4e97-b1e1-a8249f378d8e",
    "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
    "expires_at": "2026-10-28T09:13:49.20879Z",
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

`POST /api/driver/v1/offers/69dea8e6-7f84-4e97-b1e1-a8249f378d8e/accept` → **200**

```json
{
  "command_id": "c66f4943-61e7-4758-84af-4fc2a756785e"
}
```

```json
{
  "id": "46f8b6ec-2bad-42d9-9150-d91bb756cec1",
  "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "944a0498-1b01-46d2-927a-9ed9d17ce6b0",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "944a0498-1b01-46d2-927a-9ed9d17ce6b0",
  "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
  "assignment_id": "46f8b6ec-2bad-42d9-9150-d91bb756cec1",
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

`POST /api/driver/v1/trips/944a0498-1b01-46d2-927a-9ed9d17ce6b0/cancel` → **200**

```json
{
  "command_id": "f6c52c01-1ed8-485c-b606-d2b28bf0a137",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "944a0498-1b01-46d2-927a-9ed9d17ce6b0",
  "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
  "assignment_id": "46f8b6ec-2bad-42d9-9150-d91bb756cec1",
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

`GET /api/rider/v1/orders/2c3074b3-2e88-4c47-b8b5-4b603b59ce0a` → **200**

```json
{
  "id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8f96cd6f-3f59-4cf3-8552-1405f5382d7c",
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
    "id": "46f8b6ec-2bad-42d9-9150-d91bb756cec1",
    "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "944a0498-1b01-46d2-927a-9ed9d17ce6b0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:13:34.205511Z",
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
    "id": "2a749f16-b2b4-4a26-8a23-fea5e94f0587",
    "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
    "expires_at": "2026-10-28T09:13:49.341303Z",
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

`POST /api/driver/v1/offers/2a749f16-b2b4-4a26-8a23-fea5e94f0587/accept` → **200**

```json
{
  "command_id": "ebdc01ad-c1c5-471f-b71a-1dfef8db6b54"
}
```

```json
{
  "id": "0cb71f64-a5e9-4a14-abfd-09863be9e963",
  "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "943d0b97-ced7-4e5a-ac64-0903fafffcac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "943d0b97-ced7-4e5a-ac64-0903fafffcac",
  "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
  "assignment_id": "0cb71f64-a5e9-4a14-abfd-09863be9e963",
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

`POST /api/driver/v1/trips/943d0b97-ced7-4e5a-ac64-0903fafffcac/cancel` → **200**

```json
{
  "command_id": "2c38ea50-4d79-4967-8163-a270cb1f34e2",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "943d0b97-ced7-4e5a-ac64-0903fafffcac",
  "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
  "assignment_id": "0cb71f64-a5e9-4a14-abfd-09863be9e963",
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
    "id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:13:34.205511Z",
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
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      }
    },
    "pickup_at": null
  },
  {
    "id": "0516f6a7-5c6e-4fb6-92a2-ad95abbcc3e6",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:13:33.823984Z",
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
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/2c3074b3-2e88-4c47-b8b5-4b603b59ce0a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:13:34.206077Z",
      "actor": {
        "type": "CLIENT",
        "id": "8f96cd6f-3f59-4cf3-8552-1405f5382d7c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
        "quote_id": "9fd2f5b9-efdc-4bbb-955c-b39d043972b9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "055cda11-c975-43ab-920a-080237213a16"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:13:34.207847Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
        "attempt_id": "671c23a0-7a6f-4264-a7d9-cad4f36b80c8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "055cda11-c975-43ab-920a-080237213a16"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:13:34.213848Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "69dea8e6-7f84-4e97-b1e1-a8249f378d8e",
        "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "055cda11-c975-43ab-920a-080237213a16"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:13:34.273984Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "69dea8e6-7f84-4e97-b1e1-a8249f378d8e",
        "order_id": "2c3074b3-2e88-4c47-b8b5-4b603b59ce0a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "46f8b6ec-2bad-42d9-9150-d91bb756cec1"
      },
      "correlation_id": "ebb9cec2-7e59-4fdf-bd62-ba8858704e93"
```

Done: orders 0516f6a7-5c6e-4fb6-92a2-ad95abbcc3e6, 2c3074b3-2e88-4c47-b8b5-4b603b59ce0a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739321472",
  "device_ref": "sandbox-17751"
}
```

```json
{
  "challenge_id": "84813204-d6fb-410a-95c1-a9691be7877d",
  "expires_at": "2026-10-28T09:18:34.590163769Z",
  "resend_available_at": "2026-10-28T09:13:35.590163769Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739321472` → **200**

```json
{
  "phone": "+380739321472",
  "audience": "CLIENT",
  "code": "395616",
  "sent_at": "2026-10-28T09:13:34.592648623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84813204-d6fb-410a-95c1-a9691be7877d",
  "code": "395616",
  "device_ref": "sandbox-17751"
}
```

```json
{
  "session_id": "6e78e467-e5ed-4783-bbf0-e600607db364",
  "subject": {
    "type": "CLIENT",
    "id": "c354520d-70fe-4b65-9f9c-a855a242f82d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzU0NTIwZC03MGZlLTRiNjUtOWY5Yy1hODU1YTI0MmY4MmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzE0LCJpYXQiOjE3OTMxNzg4MTQsImp0aSI6IjFhMWZmMmE5LTY4NTctNGIyOS04NGQyLTQ0YmRjZDZjZjQ0ZiIsInNpZCI6IjZlNzhlNDY3LWU1ZWQtNDc4My1iYmYwLWU2MDA2MDdkYjM2NCJ9.o85ceSCydtzpeMqomL36nMTyfxA-NnBl6UMauyEx6OA",
  "access_expires_at": "2026-10-28T09:28:34.663550228Z",
  "refresh_token": "NTIi2NWHzxQ04cltGxXtRt0JjyAyNuz_uR7yO890dpk",
  "refresh_expires_at": "2026-11-27T09:13:34.663014087Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "148d73a8-905d-401e-b0c8-cb71635d53bc",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "23652250-b958-4cae-8f80-75f966699fdb",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-23652250-b958-4cae-8f80-75f966699fdb",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "0c394134c0096651c1ecf3cec204878e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=23652250-b958-4cae-8f80-75f966699fdb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739321472"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=23652250-b958-4cae-8f80-75f966699fdb",
  "expires_at": "2026-10-28T09:43:34.700984Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/23652250-b958-4cae-8f80-75f966699fdb` → **200**

```json
{
  "id": "23652250-b958-4cae-8f80-75f966699fdb",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T09:43:34.700984Z",
  "card": {
    "id": "29c9abc8-4dd9-49da-8ce2-a5b4598eb79c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4778",
    "card_type": "Visa",
    "created_at": "2026-10-28T09:13:34.746958Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "29c9abc8-4dd9-49da-8ce2-a5b4598eb79c",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4778",
      "card_type": "Visa",
      "created_at": "2026-10-28T09:13:34.746958Z"
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
  "device_ref": "sandbox-16954"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "30b29889-3eab-4b76-8c34-15b5a163cc0f",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16954"
}
```

```json
{
  "challenge_id": "961d0821-27fa-4e8c-a87c-d986d5608b91",
  "expires_at": "2026-10-28T09:18:35.853948364Z",
  "resend_available_at": "2026-10-28T09:13:36.853948364Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "131803",
  "sent_at": "2026-10-28T09:13:35.855991604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "961d0821-27fa-4e8c-a87c-d986d5608b91",
  "code": "131803",
  "device_ref": "sandbox-16954"
}
```

```json
{
  "session_id": "cf61158c-8f4a-46fc-8bfa-07f8c2ec460d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTcxNSwiaWF0IjoxNzkzMTc4ODE1LCJqdGkiOiI4NTQ1NTgzNy0wMWE4LTQyMGYtOTYyMi00ODM5MTkxOTc5ZTUiLCJzaWQiOiJjZjYxMTU4Yy04ZjRhLTQ2ZmMtOGJmYS0wN2Y4YzJlYzQ2MGQifQ.np6Z9Ng8YCdn3hEsoc3QzZJ5DfnjE6oUQ6AzVF4s0CI",
  "access_expires_at": "2026-10-28T09:28:35.910489195Z",
  "refresh_token": "0DErf3P9ERxufTgUlQ5eJp6CnBWxCeNZUGPQWf40Rq0",
  "refresh_expires_at": "2026-11-27T09:13:35.909727692Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2",
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
  "last_heartbeat_at": "2026-10-28T09:13:34.12819Z",
  "last_location_at": "2026-10-28T09:13:34.12819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2/handover` → **200**

```json
{
  "command_id": "0f1a96e5-6a94-4ac6-87ac-cfdbf180fbbe",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2",
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
  "last_heartbeat_at": "2026-10-28T09:13:34.12819Z",
  "last_location_at": "2026-10-28T09:13:34.12819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:13:35Z",
    "sequence": 1793178815996
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2",
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
  "last_heartbeat_at": "2026-10-28T09:13:36.015594Z",
  "last_location_at": "2026-10-28T09:13:36.015594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3d9f65bd-a809-428d-a64d-3e1aaaf21f34",
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
  "id": "ae464f49-2477-4cec-b827-c7e8536d0034",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-28T09:18:36.048741Z",
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
  "command_id": "35cdbbe7-f681-46b9-9bb4-1e827da724d4",
  "quote_id": "ae464f49-2477-4cec-b827-c7e8536d0034",
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
  "id": "206570e5-23d8-43ae-8336-a815c337c913",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c354520d-70fe-4b65-9f9c-a855a242f82d",
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
  "created_at": "2026-10-28T09:13:36.086734Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913` → **200**

```json
{
  "id": "206570e5-23d8-43ae-8336-a815c337c913",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c354520d-70fe-4b65-9f9c-a855a242f82d",
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
  "created_at": "2026-10-28T09:13:36.086734Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913` → **200**

```json
{
  "id": "206570e5-23d8-43ae-8336-a815c337c913",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c354520d-70fe-4b65-9f9c-a855a242f82d",
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
  "created_at": "2026-10-28T09:13:36.086734Z",
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
    "id": "2ca5e1b2-0c7d-4a49-a997-f2b7a899e364",
    "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
    "expires_at": "2026-10-28T09:13:51.658223Z",
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

`POST /api/driver/v1/offers/2ca5e1b2-0c7d-4a49-a997-f2b7a899e364/accept` → **200**

```json
{
  "command_id": "383f8d09-61c9-45b7-a997-407e5c6068c8"
}
```

```json
{
  "id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6166d36f-9559-45c4-9e09-6969442b27bd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6166d36f-9559-45c4-9e09-6969442b27bd",
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
  "assignment_id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
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

`POST /api/driver/v1/work-sessions/aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:13:37Z",
    "sequence": 1793178817253
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2",
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
  "last_heartbeat_at": "2026-10-28T09:13:37.271662Z",
  "last_location_at": "2026-10-28T09:13:37.271662Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6166d36f-9559-45c4-9e09-6969442b27bd/arrive` → **200**

```json
{
  "command_id": "4c18b97d-9739-4e09-8df8-b85ccf97ec9b",
  "expected_version": 0
}
```

```json
{
  "id": "6166d36f-9559-45c4-9e09-6969442b27bd",
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
  "assignment_id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
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
  "arrived_at": "2026-10-28T09:13:37.307172Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6166d36f-9559-45c4-9e09-6969442b27bd/start` → **200**

```json
{
  "command_id": "ad9850e0-ab0d-4d0f-b8b7-77139834321d",
  "expected_version": 1
}
```

```json
{
  "id": "6166d36f-9559-45c4-9e09-6969442b27bd",
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
  "assignment_id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
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
  "arrived_at": "2026-10-28T09:13:37.307172Z",
  "started_at": "2026-10-28T09:13:37.347772Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6166d36f-9559-45c4-9e09-6969442b27bd/complete` → **200**

```json
{
  "command_id": "5e33566c-671f-4f46-9245-0c6364400c7e",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:13:37Z"
}
```

```json
{
  "id": "6166d36f-9559-45c4-9e09-6969442b27bd",
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
  "assignment_id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
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
  "arrived_at": "2026-10-28T09:13:37.307172Z",
  "started_at": "2026-10-28T09:13:37.347772Z",
  "completed_at": "2026-10-28T09:13:37.389374Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913` → **200**

```json
{
  "id": "206570e5-23d8-43ae-8336-a815c337c913",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c354520d-70fe-4b65-9f9c-a855a242f82d",
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
    "id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
    "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6166d36f-9559-45c4-9e09-6969442b27bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:13:36.086734Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913` → **200**

```json
{
  "id": "206570e5-23d8-43ae-8336-a815c337c913",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c354520d-70fe-4b65-9f9c-a855a242f82d",
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
    "id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
    "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6166d36f-9559-45c4-9e09-6969442b27bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:13:36.086734Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913` → **200**

```json
{
  "id": "206570e5-23d8-43ae-8336-a815c337c913",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c354520d-70fe-4b65-9f9c-a855a242f82d",
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
    "id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
    "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6166d36f-9559-45c4-9e09-6969442b27bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:13:36.086734Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913` → **200**

```json
{
  "id": "206570e5-23d8-43ae-8336-a815c337c913",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c354520d-70fe-4b65-9f9c-a855a242f82d",
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
    "id": "8c4fdf55-1313-49c4-b381-4aa617e93892",
    "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6166d36f-9559-45c4-9e09-6969442b27bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:13:36.086734Z",
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
      "id": "24125c28-5992-40dd-8f1c-7e7b90e24139",
      "at": "2026-10-28T09:13:37.679356Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913/tip` → **200**

```json
{
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
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
  "available_until": "2026-10-29T09:13:37.389374Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913/tip` → **201**

```json
{
  "command_id": "e78bdfcd-2a9a-4228-929f-13d2d2f9ec83",
  "amount_minor": 2500
}
```

```json
{
  "id": "4e3e785f-eafa-423e-9dcc-4393c4d0ff4d",
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T09:13:40.62352Z"
}
```

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913/tip` → **200**

```json
{
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
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
  "available_until": "2026-10-29T09:13:37.389374Z",
  "open": false,
  "tip": {
    "id": "4e3e785f-eafa-423e-9dcc-4393c4d0ff4d",
    "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T09:13:40.62352Z"
  }
}
```

`GET /api/rider/v1/orders/206570e5-23d8-43ae-8336-a815c337c913/tip` → **200**

```json
{
  "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
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
  "available_until": "2026-10-29T09:13:37.389374Z",
  "open": false,
  "tip": {
    "id": "4e3e785f-eafa-423e-9dcc-4393c4d0ff4d",
    "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T09:13:40.62352Z"
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
      "id": "24125c28-5992-40dd-8f1c-7e7b90e24139",
      "at": "2026-10-28T09:13:37.679356Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
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
      "id": "6c2f25af-8705-4609-8394-2c1fc50944a8",
      "at": "2026-10-28T09:13:41.733072Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
      "counterpart_id": null
    },
    {
      "id": "24125c28-5992-40dd-8f1c-7e7b90e24139",
      "at": "2026-10-28T09:13:37.679356Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "206570e5-23d8-43ae-8336-a815c337c913",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2",
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
  "last_heartbeat_at": "2026-10-28T09:13:37.271662Z",
  "last_location_at": "2026-10-28T09:13:37.271662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa4cb82c-69f4-432f-a5d6-dcbdbe621ed2/close` → **200**

```json
{
  "command_id": "16e900b4-5164-4415-a007-5d84597fdd8a",
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

Done: card order 206570e5-23d8-43ae-8336-a815c337c913.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738513843",
  "device_ref": "sandbox-12738"
}
```

```json
{
  "challenge_id": "c29ad08b-87c1-493d-9549-a4059dcb31f9",
  "expires_at": "2026-10-28T09:18:42.829779391Z",
  "resend_available_at": "2026-10-28T09:13:43.829779391Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738513843` → **200**

```json
{
  "phone": "+380738513843",
  "audience": "CLIENT",
  "code": "945139",
  "sent_at": "2026-10-28T09:13:42.832196258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c29ad08b-87c1-493d-9549-a4059dcb31f9",
  "code": "945139",
  "device_ref": "sandbox-12738"
}
```

```json
{
  "session_id": "60808467-1912-453a-ac28-fe7d7db8f01b",
  "subject": {
    "type": "CLIENT",
    "id": "94c1b3e4-b1ac-47aa-b1a4-13ec8ac9dd23"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NGMxYjNlNC1iMWFjLTQ3YWEtYjFhNC0xM2VjOGFjOWRkMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzIyLCJpYXQiOjE3OTMxNzg4MjIsImp0aSI6IjRjYzE4NWQwLTMyYTQtNGRjOC1hNWMxLWZkOGNlZjM3YjA3NCIsInNpZCI6IjYwODA4NDY3LTE5MTItNDUzYS1hYzI4LWZlN2Q3ZGI4ZjAxYiJ9.LjI4c5EXHDI3zDgvhFSzcMzMchYy15WJj6JEBS-WgIA",
  "access_expires_at": "2026-10-28T09:28:42.890643983Z",
  "refresh_token": "uRJDUc_16M7vN0Z7gR1FnyLL1zf-l9VmU-ID9JDUzB4",
  "refresh_expires_at": "2026-11-27T09:13:42.89001667Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "715ab68f-f86c-417b-84e5-20d36419c186",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "718be386-bcdb-4375-b71f-5d6abadf2c1f",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-718be386-bcdb-4375-b71f-5d6abadf2c1f",
    "orderDate": "1793178822",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "f10135de147aa1067a8c2874af91e2bb",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=718be386-bcdb-4375-b71f-5d6abadf2c1f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738513843"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=718be386-bcdb-4375-b71f-5d6abadf2c1f",
  "created_at": "2026-10-28T09:13:42.951035Z",
  "expires_at": "2026-10-28T09:43:42.951035Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/718be386-bcdb-4375-b71f-5d6abadf2c1f` → **200**

```json
{
  "id": "718be386-bcdb-4375-b71f-5d6abadf2c1f",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:13:42.951035Z",
  "expires_at": "2026-10-28T09:43:42.951035Z",
  "completed_at": "2026-10-28T09:13:42.991924Z",
  "masked_pan": "41****2786",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "94c1b3e4-b1ac-47aa-b1a4-13ec8ac9dd23",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "94c1b3e4-b1ac-47aa-b1a4-13ec8ac9dd23",
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
      "id": "2638244f-856a-418c-b617-754288d3c62a",
      "at": "2026-10-28T09:13:43.747464Z",
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
  "client_id": "94c1b3e4-b1ac-47aa-b1a4-13ec8ac9dd23",
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
      "id": "2638244f-856a-418c-b617-754288d3c62a",
      "at": "2026-10-28T09:13:43.747464Z",
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
  "device_ref": "sandbox-30847"
}
```

```json
{
  "challenge_id": "4b792472-4778-4305-88d6-0440ea611b91",
  "expires_at": "2026-10-28T09:18:44.113793899Z",
  "resend_available_at": "2026-10-28T09:13:45.113793899Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "135900",
  "sent_at": "2026-10-28T09:13:44.116077108Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b792472-4778-4305-88d6-0440ea611b91",
  "code": "135900",
  "device_ref": "sandbox-30847"
}
```

```json
{
  "session_id": "e2a7d0c9-0fe8-49f9-b44c-07205b75e8a3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTcyNCwiaWF0IjoxNzkzMTc4ODI0LCJqdGkiOiJkY2ZhMDUyMC00N2YyLTRhM2QtOTczZi03YWFkNjdhYjgxNDEiLCJzaWQiOiJlMmE3ZDBjOS0wZmU4LTQ5ZjktYjQ0Yy0wNzIwNWI3NWU4YTMifQ.jTcqnnN4WzQ-VGywrU6P-TvNzZlmA3NoXuDe8C1wbuY",
  "access_expires_at": "2026-10-28T09:28:44.170219436Z",
  "refresh_token": "gkJzH_9hyPLR_MrXfd2ni0ON_aH-a3aAjCooo6QN9I0",
  "refresh_expires_at": "2026-11-27T09:13:44.169728305Z",
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
  "command_id": "4a43eb2c-194b-450d-a31d-9db9d2141160",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "8e1bf76f-0aaa-441a-92db-231cff699b12",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-8e1bf76f-0aaa-441a-92db-231cff699b12",
    "orderDate": "1793178824",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "ab46034b465f9be60ca717b506043229",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=8e1bf76f-0aaa-441a-92db-231cff699b12",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=8e1bf76f-0aaa-441a-92db-231cff699b12",
  "created_at": "2026-10-28T09:13:44.222053Z",
  "expires_at": "2026-10-28T09:43:44.222053Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/8e1bf76f-0aaa-441a-92db-231cff699b12` → **200**

```json
{
  "id": "8e1bf76f-0aaa-441a-92db-231cff699b12",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T09:13:44.222053Z",
  "expires_at": "2026-10-28T09:43:44.222053Z",
  "completed_at": "2026-10-28T09:13:44.251064Z",
  "masked_pan": "41****4084",
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
      "id": "8d911079-b8b3-4687-a204-37577f12742f",
      "at": "2026-10-28T09:13:44.752618Z",
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
  "command_id": "e01b2e4c-7bf2-427b-a721-2013fd4da1db",
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
  "correlation_id": "4c5d0587-41e5-4fbb-a141-8c624518f42a"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678226023",
  "device_ref": "sandbox-26093"
}
```

```json
{
  "challenge_id": "3d109392-fe13-4390-b099-60caa388be25",
  "expires_at": "2026-10-28T09:18:45.386104573Z",
  "resend_available_at": "2026-10-28T09:13:46.386104573Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678226023` → **200**

```json
{
  "phone": "+380678226023",
  "audience": "CLIENT",
  "code": "811000",
  "sent_at": "2026-10-28T09:13:45.388469011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d109392-fe13-4390-b099-60caa388be25",
  "code": "811000",
  "device_ref": "sandbox-26093"
}
```

```json
{
  "session_id": "7649b5f2-01cf-4c7b-804c-e75b3fc6ea59",
  "subject": {
    "type": "CLIENT",
    "id": "a2238d8a-613b-46af-b2c9-efd96c53f10a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjIzOGQ4YS02MTNiLTQ2YWYtYjJjOS1lZmQ5NmM1M2YxMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzI1LCJpYXQiOjE3OTMxNzg4MjUsImp0aSI6ImY2MGM3MWY5LTgwZTQtNDhjNi1iNzBhLWEyZWU4MDJhMDY4YiIsInNpZCI6Ijc2NDliNWYyLTAxY2YtNGM3Yi04MDRjLWU3NWIzZmM2ZWE1OSJ9.ot6gsk0oZLURX95G6kOhcWgK-Ai3wS64lKQe788pp2k",
  "access_expires_at": "2026-10-28T09:28:45.44402627Z",
  "refresh_token": "hQURf_MRACgH1hBHF36A9-FYU8QAX_bxIu0FkmTP7zM",
  "refresh_expires_at": "2026-11-27T09:13:45.443665053Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a2238d8a-613b-46af-b2c9-efd96c53f10a",
  "session_id": "7649b5f2-01cf-4c7b-804c-e75b3fc6ea59",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c1dd5b67-01d6-45f0-8c16-307443731df9",
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
  "id": "f496e6f5-923f-4183-93c0-d2a706402105",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:18:45.504726Z",
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
  "challenge_id": "b64d4b66-e014-41c1-ba19-76586bc90bec",
  "expires_at": "2026-10-28T09:18:47.540989276Z",
  "resend_available_at": "2026-10-28T09:13:48.540989276Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678226023` → **200**

```json
{
  "phone": "+380678226023",
  "audience": "CLIENT",
  "code": "083547",
  "sent_at": "2026-10-28T09:13:47.546770274Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "51d7bd77-06c9-4530-b122-d02de02ea910",
  "challenge_id": "b64d4b66-e014-41c1-ba19-76586bc90bec",
  "otp_code": "083547"
}
```

```json
{
  "client_id": "a2238d8a-613b-46af-b2c9-efd96c53f10a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T09:13:47.607066195Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "4f6f2605-b265-4040-b530-ef06e831b2a1",
  "quote_id": "f496e6f5-923f-4183-93c0-d2a706402105",
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
  "correlation_id": "f4c82d5f-ee73-4641-97df-40d589858b86"
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
  "session_id": "010d40ea-de96-41ab-952b-d227b8977870",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3MjcsImlhdCI6MTc5MzE3ODgyNywianRpIjoiM2QxZGU5MDgtNjMyMC00YTk4LWI3M2MtNGQxYmNhZmNiMTc0Iiwic2lkIjoiMDEwZDQwZWEtZGU5Ni00MWFiLTk1MmItZDIyN2I4OTc3ODcwIn0.WDITtSnvaqSEsSrXQbWFkaeytsOpQQNL05gy9uy8D4c",
  "access_expires_at": "2026-10-28T09:28:47.882029275Z",
  "refresh_token": "zKMiD4Fu4ejl4GyqE1B8bJ1mmEjiFtthsKyuj9sIuu4",
  "refresh_expires_at": "2026-10-28T21:13:47.881647998Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "a2238d8a-613b-46af-b2c9-efd96c53f10a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T09:13:47.607066Z",
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

`POST /api/admin/v1/client-deletions/a2238d8a-613b-46af-b2c9-efd96c53f10a/complete` → **200**

```json
{
  "command_id": "c88cb0f7-6abe-4b48-b206-4fbd8a2119e9",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "a2238d8a-613b-46af-b2c9-efd96c53f10a",
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
  "correlation_id": "46bf0fe9-9583-4808-9f6e-c33b248919bf"
}
```

Done: client a2238d8a-613b-46af-b2c9-efd96c53f10a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661501346",
  "device_ref": "sandbox-18064"
}
```

```json
{
  "challenge_id": "05c66b64-c5cc-4cac-9b8b-e99bcaa26c92",
  "expires_at": "2026-10-28T09:18:48.012446557Z",
  "resend_available_at": "2026-10-28T09:13:49.012446557Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661501346` → **200**

```json
{
  "phone": "+380661501346",
  "audience": "CLIENT",
  "code": "193883",
  "sent_at": "2026-10-28T09:13:48.014511681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05c66b64-c5cc-4cac-9b8b-e99bcaa26c92",
  "code": "193883",
  "device_ref": "sandbox-18064"
}
```

```json
{
  "session_id": "bada966f-ebcb-4630-9d44-2cc6179a34e6",
  "subject": {
    "type": "CLIENT",
    "id": "9b6badbf-66b5-4793-875b-adeea4c8c567"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjZiYWRiZi02NmI1LTQ3OTMtODc1Yi1hZGVlYTRjOGM1NjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzI4LCJpYXQiOjE3OTMxNzg4MjgsImp0aSI6IjQzYzVkYmI2LWFkYTYtNDg1MS1hN2M5LTYwN2ExM2M2NTM4ZiIsInNpZCI6ImJhZGE5NjZmLWViY2ItNDYzMC05ZDQ0LTJjYzYxNzlhMzRlNiJ9.FiieJL3ui8d-gc-1umq2QUty8HMNavSC6CBQS7fHBlk",
  "access_expires_at": "2026-10-28T09:28:48.066479613Z",
  "refresh_token": "wMyYAYtS-AXZXLSWxcOyx0Dc2SrtIZ0YCscDsNivdDE",
  "refresh_expires_at": "2026-11-27T09:13:48.066061821Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9b6badbf-66b5-4793-875b-adeea4c8c567",
  "session_id": "bada966f-ebcb-4630-9d44-2cc6179a34e6",
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
  "session_id": "198026e4-c825-4b87-a313-4c23b7c9f3b6",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3MjgsImlhdCI6MTc5MzE3ODgyOCwianRpIjoiYzI3MDZkMmItZTcyZC00ZDY1LWE3OWMtMDllNWFmOGFlZjg3Iiwic2lkIjoiMTk4MDI2ZTQtYzgyNS00Yjg3LWEzMTMtNGMyM2I3YzlmM2I2In0.uU53myVWPleDGN2xOR78EIePO_Y8FhQxk4MRdAtNIoE",
  "access_expires_at": "2026-10-28T09:28:48.336507469Z",
  "refresh_token": "AiqE4cJh1xHo8EoqTGdhRdU32edh7FleCkgE6Kr6Vjs",
  "refresh_expires_at": "2026-10-28T21:13:48.336020354Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1501346&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "9b6badbf-66b5-4793-875b-adeea4c8c567",
      "phone": "+380661501346",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T09:13:48.061711Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/9b6badbf-66b5-4793-875b-adeea4c8c567` → **200**

```json
{
  "client": {
    "id": "9b6badbf-66b5-4793-875b-adeea4c8c567",
    "phone": "+380661501346",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T09:13:48.061711Z",
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

`POST /api/admin/v1/clients/9b6badbf-66b5-4793-875b-adeea4c8c567/block` → **400**

```json
{
  "command_id": "8ad16b11-e8c5-41f8-83a6-be3017606bfe",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9b6badbf-66b5-4793-875b-adeea4c8c567/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "03bab96e-badc-4a5a-b1d6-1fe42be9698f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/9b6badbf-66b5-4793-875b-adeea4c8c567/block` → **200**

```json
{
  "command_id": "019017b5-8daa-40c5-b51f-7bec8a3358c5",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "9b6badbf-66b5-4793-875b-adeea4c8c567",
  "phone": "+380661501346",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T09:13:48.061711Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T09:13:48.481879Z",
    "by": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
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
  "correlation_id": "182b97fc-fa89-4166-92d0-a656f9aadf4f"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661501346",
  "device_ref": "sandbox-19132"
}
```

```json
{
  "challenge_id": "beafb2be-789e-4c21-a7d0-bbee21b27cbe",
  "expires_at": "2026-10-28T09:18:50.542607881Z",
  "resend_available_at": "2026-10-28T09:13:51.542607881Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661501346` → **200**

```json
{
  "phone": "+380661501346",
  "audience": "CLIENT",
  "code": "611597",
  "sent_at": "2026-10-28T09:13:50.5511095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "beafb2be-789e-4c21-a7d0-bbee21b27cbe",
  "code": "611597",
  "device_ref": "sandbox-19132"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "92bc30b5-d979-4eb6-af1e-adc0aff1b23d"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/9b6badbf-66b5-4793-875b-adeea4c8c567` → **200**

```json
{
  "client": {
    "id": "9b6badbf-66b5-4793-875b-adeea4c8c567",
    "phone": "+380661501346",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T09:13:48.061711Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T09:13:48.481879Z",
      "by": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
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

`POST /api/admin/v1/clients/9b6badbf-66b5-4793-875b-adeea4c8c567/unblock` → **200**

```json
{
  "command_id": "c67a501b-7218-4790-b982-7e3a7088e995",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "9b6badbf-66b5-4793-875b-adeea4c8c567",
  "phone": "+380661501346",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T09:13:48.061711Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661501346",
  "device_ref": "sandbox-23296"
}
```

```json
{
  "challenge_id": "d49f10fe-4ffc-4977-84d6-f212bfa3eebd",
  "expires_at": "2026-10-28T09:18:52.697687491Z",
  "resend_available_at": "2026-10-28T09:13:53.697687491Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661501346` → **200**

```json
{
  "phone": "+380661501346",
  "audience": "CLIENT",
  "code": "357595",
  "sent_at": "2026-10-28T09:13:52.699472295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d49f10fe-4ffc-4977-84d6-f212bfa3eebd",
  "code": "357595",
  "device_ref": "sandbox-23296"
}
```

```json
{
  "session_id": "0a712df9-baf6-467f-b84c-620c65ae5faa",
  "subject": {
    "type": "CLIENT",
    "id": "9b6badbf-66b5-4793-875b-adeea4c8c567"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjZiYWRiZi02NmI1LTQ3OTMtODc1Yi1hZGVlYTRjOGM1NjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzMyLCJpYXQiOjE3OTMxNzg4MzIsImp0aSI6IjBlYjA0MzBhLTRiMTYtNGE3ZC1iMTg2LTE3Yjc1ZWVkM2IxNyIsInNpZCI6IjBhNzEyZGY5LWJhZjYtNDY3Zi1iODRjLTYyMGM2NWFlNWZhYSJ9.OGCLz-GoFMNHLMibYkTH8IcyxRzMKMTnUnLWIlnCjoM",
  "access_expires_at": "2026-10-28T09:28:52.752272762Z",
  "refresh_token": "PEjfmK-urpYIjqtPqPdZs9nW8Go9W-WRWidgjYNusRU",
  "refresh_expires_at": "2026-11-27T09:13:52.751764862Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9b6badbf-66b5-4793-875b-adeea4c8c567",
  "session_id": "0a712df9-baf6-467f-b84c-620c65ae5faa",
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
  "phone": "+380639172807",
  "device_ref": "sandbox-9893"
}
```

```json
{
  "challenge_id": "05b53078-2afa-49f9-921a-59dbd1ed34ee",
  "expires_at": "2026-10-28T09:18:52.812857997Z",
  "resend_available_at": "2026-10-28T09:13:53.812857997Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639172807` → **200**

```json
{
  "phone": "+380639172807",
  "audience": "CLIENT",
  "code": "772405",
  "sent_at": "2026-10-28T09:13:52.814872423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05b53078-2afa-49f9-921a-59dbd1ed34ee",
  "code": "772405",
  "device_ref": "sandbox-9893"
}
```

```json
{
  "session_id": "f783dbda-5214-4f47-86f4-808d981e1676",
  "subject": {
    "type": "CLIENT",
    "id": "a1a68b2d-6feb-478f-a037-0cfa72cba6b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWE2OGIyZC02ZmViLTQ3OGYtYTAzNy0wY2ZhNzJjYmE2YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzMyLCJpYXQiOjE3OTMxNzg4MzIsImp0aSI6IjkxNjBjMDJmLTk3ZDUtNDc3YS05MDY1LTRmZmM3OWEzYmYzYSIsInNpZCI6ImY3ODNkYmRhLTUyMTQtNGY0Ny04NmY0LTgwOGQ5ODFlMTY3NiJ9.wysbM8l9IHa68BeMz4Iy3lhY5bXdh8FdBsNpbZvUowc",
  "access_expires_at": "2026-10-28T09:28:52.868017764Z",
  "refresh_token": "Bl_hsnpezP_gIMeMkRiGMp9IT4cFHBDsI3bR69DTw1M",
  "refresh_expires_at": "2026-11-27T09:13:52.867613161Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "7e5d4eb5-dbc5-4ea6-9b20-c3acca1098ab",
  "expires_at": "2026-10-28T09:18:54.915136294Z",
  "resend_available_at": "2026-10-28T09:13:55.915136294Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639172807` → **200**

```json
{
  "phone": "+380639172807",
  "audience": "CLIENT",
  "code": "065371",
  "sent_at": "2026-10-28T09:13:54.917169147Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "4c5b74bc-f757-45d0-9584-a0ed9b9abe97",
  "challenge_id": "7e5d4eb5-dbc5-4ea6-9b20-c3acca1098ab",
  "otp_code": "065371"
}
```

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "PENDING",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e` → **200**

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "PENDING",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e` → **200**

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "PENDING",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e` → **200**

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "PENDING",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e` → **200**

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "PENDING",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e` → **200**

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "PENDING",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e` → **200**

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "PENDING",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e` → **200**

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "PENDING",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e` → **200**

```json
{
  "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
  "state": "READY",
  "created_at": "2026-10-28T09:13:54.97745Z",
  "ready_at": "2026-10-28T09:14:01.403363Z",
  "expires_at": "2026-11-04T09:14:01.403363Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638244562",
  "device_ref": "sandbox-8123"
}
```

```json
{
  "challenge_id": "bb75c0bd-99d0-4d93-a821-877d36d422ab",
  "expires_at": "2026-10-28T09:19:02.229734161Z",
  "resend_available_at": "2026-10-28T09:14:03.229734161Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638244562` → **200**

```json
{
  "phone": "+380638244562",
  "audience": "CLIENT",
  "code": "350938",
  "sent_at": "2026-10-28T09:14:02.231872513Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb75c0bd-99d0-4d93-a821-877d36d422ab",
  "code": "350938",
  "device_ref": "sandbox-8123"
}
```

```json
{
  "session_id": "d0670ef8-cd04-49d1-b035-246778974fec",
  "subject": {
    "type": "CLIENT",
    "id": "1973fb50-773a-4657-8b27-2c336f53e24f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOTczZmI1MC03NzNhLTQ2NTctOGIyNy0yYzMzNmY1M2UyNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzQyLCJpYXQiOjE3OTMxNzg4NDIsImp0aSI6IjY2MjY4NTg4LWJiMjQtNDEzNS05MTY3LWIyYTk2OGI4YzUzZiIsInNpZCI6ImQwNjcwZWY4LWNkMDQtNDlkMS1iMDM1LTI0Njc3ODk3NGZlYyJ9.VbsngZSIAv9panIvyfelQnF8_Mao0UJ9n6Q04C0f11w",
  "access_expires_at": "2026-10-28T09:29:02.279560282Z",
  "refresh_token": "KDKCdrgDVqwmEGEVk73ksWJPPz3zKnZaK7BxZocEm1E",
  "refresh_expires_at": "2026-11-27T09:14:02.27915618Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c4e41dc4-e52b-4681-bf80-39e0bda9489e/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "050fa1c3-2e9e-4325-9cab-e37a97cb8d96"
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
  "session_id": "cf709ca0-07b9-4e63-bfed-408319b92720",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NDIsImlhdCI6MTc5MzE3ODg0MiwianRpIjoiNjJhNmM5NjMtNjhhZi00YTY5LWE3YWEtMDk0OGI2NzllMWQwIiwic2lkIjoiY2Y3MDljYTAtMDdiOS00ZTYzLWJmZWQtNDA4MzE5YjkyNzIwIn0.ECYiflrzOChgXMF0wYUUq0C1Iwq2iz_EuYxSR6wjstU",
  "access_expires_at": "2026-10-28T09:29:02.531162895Z",
  "refresh_token": "1aeJfAM67Qy-i9Tn0flstjMQloTZcakW_WXrNlXh2j8",
  "refresh_expires_at": "2026-10-28T21:14:02.530839304Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a1a68b2d-6feb-478f-a037-0cfa72cba6b6",
  "session_id": "f783dbda-5214-4f47-86f4-808d981e1676",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/a1a68b2d-6feb-478f-a037-0cfa72cba6b6/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c4e41dc4-e52b-4681-bf80-39e0bda9489e",
      "state": "READY",
      "created_at": "2026-10-28T09:13:54.97745Z",
      "ready_at": "2026-10-28T09:14:01.403363Z",
      "expires_at": "2026-11-04T09:14:01.403363Z",
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
  "device_ref": "sandbox-26337"
}
```

```json
{
  "challenge_id": "f8992d29-45e3-417e-9a8d-06363f4cca9f",
  "expires_at": "2026-10-28T09:19:02.610046283Z",
  "resend_available_at": "2026-10-28T09:14:03.610046283Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "773785",
  "sent_at": "2026-10-28T09:14:02.611951212Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8992d29-45e3-417e-9a8d-06363f4cca9f",
  "code": "773785",
  "device_ref": "sandbox-26337"
}
```

```json
{
  "session_id": "e1c1582a-cfd8-43b6-9218-db4a0dcbd2b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc0MiwiaWF0IjoxNzkzMTc4ODQyLCJqdGkiOiIwNDI2N2RjMS1iYzI4LTRkNDEtYTc5Ni1iOGYzOTc2N2I2NjAiLCJzaWQiOiJlMWMxNTgyYS1jZmQ4LTQzYjYtOTIxOC1kYjRhMGRjYmQyYjMifQ.CY__fhEzb0kVyKcWLe4paRMlHrSWoU657Vpt7jQYtFw",
  "access_expires_at": "2026-10-28T09:29:02.660188338Z",
  "refresh_token": "Bq_F1WgdtC4tFEZbVxs4MAaw88OvXuK-pDFojrFrt1w",
  "refresh_expires_at": "2026-11-27T09:14:02.65967471Z",
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
  "device_ref": "sandbox-10436"
}
```

```json
{
  "challenge_id": "b9d571da-5ff8-444f-b17a-e2148fe20f85",
  "expires_at": "2026-10-28T09:19:02.702221239Z",
  "resend_available_at": "2026-10-28T09:14:03.702221239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "808216",
  "sent_at": "2026-10-28T09:14:02.703909542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9d571da-5ff8-444f-b17a-e2148fe20f85",
  "code": "808216",
  "device_ref": "sandbox-10436"
}
```

```json
{
  "session_id": "86a23c99-14f3-4494-8b4b-e0c89ce6157c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc0MiwiaWF0IjoxNzkzMTc4ODQyLCJqdGkiOiIzMTM3MTA0Yy02MjcxLTQzNjMtOWUzYS0zMmRmZGI5ZmI0MTUiLCJzaWQiOiI4NmEyM2M5OS0xNGYzLTQ0OTQtOGI0Yi1lMGM4OWNlNjE1N2MifQ.Kj5crBtLHaFrgz3iexLGlQAVhAXA5H6OOcI40MEAF5M",
  "access_expires_at": "2026-10-28T09:29:02.751219989Z",
  "refresh_token": "vpZ3H_rSSwvsvw2_BA2iqDdqrF1cNrusdTAPNV8KI80",
  "refresh_expires_at": "2026-11-27T09:14:02.750816489Z",
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
  "command_id": "f33bed02-b3f1-448f-9147-9044532f7cb3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:02Z",
    "sequence": 1793178842793
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "28044968-cc90-4172-b765-ba0e8af0d509",
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
  "last_heartbeat_at": "2026-10-28T09:14:02.809621Z",
  "last_location_at": "2026-10-28T09:14:02.809621Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-30180"
}
```

```json
{
  "challenge_id": "8cc75083-acd1-48c1-b551-4784f4a33ced",
  "expires_at": "2026-10-28T09:19:02.836031599Z",
  "resend_available_at": "2026-10-28T09:14:03.836031599Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "796410",
  "sent_at": "2026-10-28T09:14:02.837909383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cc75083-acd1-48c1-b551-4784f4a33ced",
  "code": "796410",
  "device_ref": "sandbox-30180"
}
```

```json
{
  "session_id": "0180a0d4-caf5-4b49-a16f-6c16efe57854",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc0MiwiaWF0IjoxNzkzMTc4ODQyLCJqdGkiOiJkMWJiMDhkOC0zM2Q2LTQ1MDAtYjM1OC0zMGVhNmFiZjkxNDQiLCJzaWQiOiIwMTgwYTBkNC1jYWY1LTRiNDktYTE2Zi02YzE2ZWZlNTc4NTQifQ.LjmBy16wIMlWMEadTDUtSjAfPXLSC5JgWt0-mvkKQ8k",
  "access_expires_at": "2026-10-28T09:29:02.891340899Z",
  "refresh_token": "FAUfarWYQjOBXlrqoZBr1GdsFSvgix3yIhRHz681RNk",
  "refresh_expires_at": "2026-11-27T09:14:02.890879421Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4acee6e5-932c-4726-bedf-9434ff01657f",
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
  "last_heartbeat_at": "2026-10-28T09:13:33.968511Z",
  "last_location_at": "2026-10-28T09:13:33.968511Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4acee6e5-932c-4726-bedf-9434ff01657f/handover` → **200**

```json
{
  "command_id": "17138b4d-ca49-4c2b-8d0b-07192f2d5959",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4acee6e5-932c-4726-bedf-9434ff01657f",
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
  "last_heartbeat_at": "2026-10-28T09:13:33.968511Z",
  "last_location_at": "2026-10-28T09:13:33.968511Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4acee6e5-932c-4726-bedf-9434ff01657f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:02Z",
    "sequence": 1793178842966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4acee6e5-932c-4726-bedf-9434ff01657f",
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
  "last_heartbeat_at": "2026-10-28T09:14:02.982818Z",
  "last_location_at": "2026-10-28T09:14:02.982818Z",
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
  "session_id": "83645659-ac74-4956-a081-96c0aa1aa989",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NDMsImlhdCI6MTc5MzE3ODg0MywianRpIjoiYTdlOGJjZDgtMTUwNC00YTFmLTgzYjItOTM1MmYzYzYxZjI1Iiwic2lkIjoiODM2NDU2NTktYWM3NC00OTU2LWEwODEtOTZjMGFhMWFhOTg5In0.fX3GLf0U_Ad0JxCuKAxDL0V3rkzjr-968xifQENBCYk",
  "access_expires_at": "2026-10-28T09:29:03.211133102Z",
  "refresh_token": "NDJzH9oKszcMItY-0CtTh-NzCNhBK246s9SgZkge0n4",
  "refresh_expires_at": "2026-10-28T21:14:03.210624521Z",
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
  "session_id": "0dd5b881-05b0-4ff6-b10a-3e597b2fb60f",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NDMsImlhdCI6MTc5MzE3ODg0MywianRpIjoiMGIwY2VjZWYtOTBlYi00ZDdmLWI1MGEtODZmM2M4NDA0MDJmIiwic2lkIjoiMGRkNWI4ODEtMDViMC00ZmY2LWIxMGEtM2U1OTdiMmZiNjBmIn0.WCTmbuYTKCL3cVbN0xnx80x88rhVvXOJ92upsPvWrQY",
  "access_expires_at": "2026-10-28T09:29:03.43948843Z",
  "refresh_token": "6bY2wpoLUiYuwZs2Z8vecT6u5cmdRnI2OMeD6lqHauk",
  "refresh_expires_at": "2026-10-28T21:14:03.439056076Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686569849",
  "device_ref": "sandbox-8038"
}
```

```json
{
  "challenge_id": "9a14f657-5297-48c7-80aa-fa1ae1693ec2",
  "expires_at": "2026-10-28T09:19:03.462551822Z",
  "resend_available_at": "2026-10-28T09:14:04.462551822Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380686569849` → **200**

```json
{
  "phone": "+380686569849",
  "audience": "CLIENT",
  "code": "601080",
  "sent_at": "2026-10-28T09:14:03.464196595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a14f657-5297-48c7-80aa-fa1ae1693ec2",
  "code": "601080",
  "device_ref": "sandbox-8038"
}
```

```json
{
  "session_id": "446868e7-37f2-4406-871c-98e66e9e3048",
  "subject": {
    "type": "CLIENT",
    "id": "60bf0144-0543-400b-af40-395a6311eef2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MGJmMDE0NC0wNTQzLTQwMGItYWY0MC0zOTVhNjMxMWVlZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzQzLCJpYXQiOjE3OTMxNzg4NDMsImp0aSI6IjAzZGMxNDE0LThiYzItNDRkNy1iZWMwLWEwMGI3ODAyNmVhZSIsInNpZCI6IjQ0Njg2OGU3LTM3ZjItNDQwNi04NzFjLTk4ZTY2ZTllMzA0OCJ9.1QPfV7GCEhWcgBoMGFa1sq4wv5oG1njgjked3_guAGI",
  "access_expires_at": "2026-10-28T09:29:03.512475884Z",
  "refresh_token": "pgylGQ35SyFevmS6ZVseonbfMk54DzkspRcqqBVWZxM",
  "refresh_expires_at": "2026-11-27T09:14:03.511967542Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2ba517a4-8452-4d6c-a85f-820e4a036920",
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
  "id": "23846050-162e-4eba-89e0-f964a165fa14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:03.542191Z",
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
  "command_id": "3466790a-a7b3-4f1d-8b89-cefd235f1d2b",
  "quote_id": "23846050-162e-4eba-89e0-f964a165fa14",
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
  "id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "60bf0144-0543-400b-af40-395a6311eef2",
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
  "created_at": "2026-10-28T09:14:03.574864Z",
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
    "id": "95f1f32f-5e6e-4697-851b-755595b3bba6",
    "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
    "expires_at": "2026-10-28T09:14:18.577315Z",
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

`POST /api/driver/v1/offers/95f1f32f-5e6e-4697-851b-755595b3bba6/reject` → **204**

```json
{
  "command_id": "21151454-7b08-486c-95c6-1da33ef53fbb"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7fd6b32f-4dbc-4d8f-a141-2b615aec0c92",
    "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
    "expires_at": "2026-10-28T09:14:18.642947Z",
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

`POST /api/driver/v1/offers/7fd6b32f-4dbc-4d8f-a141-2b615aec0c92/accept` → **200**

```json
{
  "command_id": "e8cd71c3-b828-4bfe-a7d8-b647c65a9319"
}
```

```json
{
  "id": "2911d7e3-107e-49bb-b5cb-1f3d3de5f8d0",
  "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "33b2e765-ae9b-40f7-991a-38131d0a0eff",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/8ae18af8-f432-4fcc-b772-10b8aaf4884e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:14:03.575363Z",
      "actor": {
        "type": "CLIENT",
        "id": "60bf0144-0543-400b-af40-395a6311eef2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
        "quote_id": "23846050-162e-4eba-89e0-f964a165fa14",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b010ff3d-5bd4-4cce-846b-0a872922134f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:14:03.576638Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
        "attempt_id": "c38d1f47-c307-401b-96e0-c74261d9818e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b010ff3d-5bd4-4cce-846b-0a872922134f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:14:03.582691Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "95f1f32f-5e6e-4697-851b-755595b3bba6",
        "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "b010ff3d-5bd4-4cce-846b-0a872922134f"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T09:14:03.642091Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "95f1f32f-5e6e-4697-851b-755595b3bba6",
        "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e"
      },
      "correlation_id": "af8f2164-2375-4a2d-833a-bb25cc964400"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 8ae18af8-f432-4fcc-b772-10b8aaf4884e — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/8ae18af8-f432-4fcc-b772-10b8aaf4884e` → **200**

```json
{
  "id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
  "short_number": 5,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "60bf0144-0543-400b-af40-395a6311eef2",
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
    "id": "2911d7e3-107e-49bb-b5cb-1f3d3de5f8d0",
    "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "33b2e765-ae9b-40f7-991a-38131d0a0eff",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:14:03.574864Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8ae18af8-f432-4fcc-b772-10b8aaf4884e/cancel` → **200**

```json
{
  "command_id": "cc00a616-520c-47f4-b7c9-28d329e92e33",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "60bf0144-0543-400b-af40-395a6311eef2",
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
    "id": "2911d7e3-107e-49bb-b5cb-1f3d3de5f8d0",
    "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "33b2e765-ae9b-40f7-991a-38131d0a0eff",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:14:03.574864Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
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
  "session_id": "28044968-cc90-4172-b765-ba0e8af0d509",
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
  "last_heartbeat_at": "2026-10-28T09:14:02.809621Z",
  "last_location_at": "2026-10-28T09:14:02.809621Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/28044968-cc90-4172-b765-ba0e8af0d509/close` → **200**

```json
{
  "command_id": "89a4d046-407f-47de-8ea1-32e1a1920ebc",
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
  "session_id": "4acee6e5-932c-4726-bedf-9434ff01657f",
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
  "last_heartbeat_at": "2026-10-28T09:14:02.982818Z",
  "last_location_at": "2026-10-28T09:14:02.982818Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4acee6e5-932c-4726-bedf-9434ff01657f/close` → **200**

```json
{
  "command_id": "8a89c033-a90c-4429-bc6a-041f259b5359",
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
  "device_ref": "sandbox-26257"
}
```

```json
{
  "challenge_id": "51013b27-f044-4958-be4f-e520d0e48126",
  "expires_at": "2026-10-28T09:19:03.997569997Z",
  "resend_available_at": "2026-10-28T09:14:04.997569997Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "944645",
  "sent_at": "2026-10-28T09:14:03.999367677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51013b27-f044-4958-be4f-e520d0e48126",
  "code": "944645",
  "device_ref": "sandbox-26257"
}
```

```json
{
  "session_id": "fb71cb1c-a688-4994-8876-608421fcb307",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc0NCwiaWF0IjoxNzkzMTc4ODQ0LCJqdGkiOiIyNWE3M2Q5Ny05ZTFlLTQzYTQtOWVjZS1iM2I0MWE2NzQ3ZGEiLCJzaWQiOiJmYjcxY2IxYy1hNjg4LTQ5OTQtODg3Ni02MDg0MjFmY2IzMDcifQ.uE-pq6djsWssBltLkptkhgeitgbmOs4wHcnWQp4AVyk",
  "access_expires_at": "2026-10-28T09:29:04.047899313Z",
  "refresh_token": "0wr92EwU6lZ9i7vsc-S3m5u-yZXigJ94QZfOs1N7QvA",
  "refresh_expires_at": "2026-11-27T09:14:04.047417936Z",
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
  "command_id": "767dd079-ad67-44dc-a76c-14ac24c28fec",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:04Z",
    "sequence": 1793178844921
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:04.10862Z",
  "last_location_at": "2026-10-28T09:14:04.10862Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671995751",
  "device_ref": "sandbox-31213"
}
```

```json
{
  "challenge_id": "b0fcff1a-3835-4f4b-b93d-068ae28bef7d",
  "expires_at": "2026-10-28T09:19:04.137758997Z",
  "resend_available_at": "2026-10-28T09:14:05.137758997Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671995751` → **200**

```json
{
  "phone": "+380671995751",
  "audience": "CLIENT",
  "code": "238528",
  "sent_at": "2026-10-28T09:14:04.139646943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0fcff1a-3835-4f4b-b93d-068ae28bef7d",
  "code": "238528",
  "device_ref": "sandbox-31213"
}
```

```json
{
  "session_id": "2198bcb9-26f7-4149-a6f9-b094e9b845cc",
  "subject": {
    "type": "CLIENT",
    "id": "72431706-4eb4-46ad-8a1b-bbe1e362af3e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjQzMTcwNi00ZWI0LTQ2YWQtOGExYi1iYmUxZTM2MmFmM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzQ0LCJpYXQiOjE3OTMxNzg4NDQsImp0aSI6IjE4MmJlNmZjLTE3M2EtNGM1Mi05ZjdlLWNhMGYwMTMwMzRmMCIsInNpZCI6IjIxOThiY2I5LTI2ZjctNDE0OS1hNmY5LWIwOTRlOWI4NDVjYyJ9.HYENsnxPgJLwaV-zISOxe074bKrpM08Uo46lZYliJ_o",
  "access_expires_at": "2026-10-28T09:29:04.1970107Z",
  "refresh_token": "NytfCl7478RtsteQFTwVRf0fmjVUmSRC2AViodersqA",
  "refresh_expires_at": "2026-11-27T09:14:04.196397561Z",
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
  "command_id": "ee938bce-5a09-4c22-937a-8bfc3006ea95",
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
  "id": "8bb92df4-0669-4bde-929e-a8a999dbd633",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:04.259390Z",
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
  "command_id": "99d03406-fc40-477e-8e88-4e32def2cf8c",
  "platform": "ANDROID",
  "token": "sandbox-driver-1e322713-ffc2-4180-8df6-ae5ecad2d92b"
}
```

```json
{
  "id": "bce79dad-5277-43f0-a219-cedb388f0f5c",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:14:04.298002Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "8e2076b8-3535-4c0f-ad28-13ac9496705b",
  "platform": "ANDROID",
  "token": "sandbox-rider-51db335b-fd62-4d10-a654-572e043e8fd9"
}
```

```json
{
  "id": "dac7234e-5562-42b0-bb63-64b4c9cce04f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T09:14:04.330701Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "94f8b6cf-de2a-4e87-84e0-08e6793b2d95",
  "quote_id": "8bb92df4-0669-4bde-929e-a8a999dbd633",
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
  "id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72431706-4eb4-46ad-8a1b-bbe1e362af3e",
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
  "created_at": "2026-10-28T09:14:04.368662Z",
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
    "id": "9d89533e-7463-4cac-942d-e3a820a75e6a",
    "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
    "expires_at": "2026-10-28T09:14:19.371881Z",
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

`POST /api/driver/v1/offers/9d89533e-7463-4cac-942d-e3a820a75e6a/accept` → **200**

```json
{
  "command_id": "37d3babe-bec4-45ca-b688-7043f9098abc"
}
```

```json
{
  "id": "0530a0fc-20f5-45d2-bf4b-ce5d8c396fbe",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:14:04.347Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T09:14:04.347Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:14:04.51000243Z",
    "token_suffix": "d2d92b",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "8ae18af8-f432-4fcc-b772-10b8aaf4884e",
      "order_version": "2",
      "event_id": "4e940d22-d621-4465-b3e8-afc46e9057fc"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671995751&after=2026-10-28T09:14:04.347Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380671995751&after=2026-10-28T09:14:04.347Z` → **200**

```json
[
  {
    "at": "2026-10-28T09:14:05.5160774Z",
    "token_suffix": "3e8fd9",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
      "order_version": "3",
      "event_id": "a5c0935e-2aab-42e8-84a5-4750742c9436"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/ba5542b7-6224-4cc3-904c-184d660f0295/messages` → **201**

```json
{
  "command_id": "4248c9ee-ee82-4ba2-99f9-f168b87e64b7",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "5e57ec82-fb19-475c-8fec-32d78d25fa1a",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T09:14:06.563849661Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "assignment_id": "0530a0fc-20f5-45d2-bf4b-ce5d8c396fbe",
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

`POST /api/driver/v1/trips/81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd/messages` → **201**

```json
{
  "command_id": "7ee15f0e-9022-4526-9a21-4bf8c372fd94",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "17fc70d5-bbe5-48f0-b8e3-a0eeda3a83c5",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T09:14:06.612164244Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/ba5542b7-6224-4cc3-904c-184d660f0295/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671995751"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:06Z",
    "sequence": 1793178846680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:06.696088Z",
  "last_location_at": "2026-10-28T09:14:06.696088Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "assignment_id": "0530a0fc-20f5-45d2-bf4b-ce5d8c396fbe",
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

`POST /api/driver/v1/trips/81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd/arrive` → **200**

```json
{
  "command_id": "f0e3c875-90b2-4070-a04c-415a7b0ec42a",
  "expected_version": 0
}
```

```json
{
  "id": "81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "assignment_id": "0530a0fc-20f5-45d2-bf4b-ce5d8c396fbe",
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
  "arrived_at": "2026-10-28T09:14:06.742846Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd/start` → **200**

```json
{
  "command_id": "596c85d7-b803-4295-b19e-24abeabfd687",
  "expected_version": 1
}
```

```json
{
  "id": "81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "assignment_id": "0530a0fc-20f5-45d2-bf4b-ce5d8c396fbe",
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
  "arrived_at": "2026-10-28T09:14:06.742846Z",
  "started_at": "2026-10-28T09:14:06.774039Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:06Z",
    "sequence": 1793178846796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:06.813681Z",
  "last_location_at": "2026-10-28T09:14:06.813681Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd/complete` → **200**

```json
{
  "command_id": "fac325a6-c75b-4542-87a7-dca787cec250",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:14:06Z",
  "cash_received": true
}
```

```json
{
  "id": "81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "assignment_id": "0530a0fc-20f5-45d2-bf4b-ce5d8c396fbe",
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
  "arrived_at": "2026-10-28T09:14:06.742846Z",
  "started_at": "2026-10-28T09:14:06.774039Z",
  "completed_at": "2026-10-28T09:14:06.853953Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/ba5542b7-6224-4cc3-904c-184d660f0295` → **200**

```json
{
  "id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "72431706-4eb4-46ad-8a1b-bbe1e362af3e",
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
    "id": "0530a0fc-20f5-45d2-bf4b-ce5d8c396fbe",
    "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:14:04.368662Z",
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
    "id": "ba5542b7-6224-4cc3-904c-184d660f0295",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:14:04.368662Z",
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
    "id": "81ae42d9-7cd6-47ef-b30e-a8a226fd1bdd",
    "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
    "order_short_number": 6,
    "created_at": "2026-10-28T09:14:04.435Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "797738a5-01a0-46bd-96d9-4af7724c459f",
    "order_id": "f77f419b-8c48-4502-b843-411704caaeb7",
    "order_short_number": 1,
    "created_at": "2026-10-28T09:13:24.552532Z",
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

`GET /api/rider/v1/orders/ba5542b7-6224-4cc3-904c-184d660f0295/tip` → **200**

```json
{
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
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
  "available_until": "2026-10-29T09:14:06.853953Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ba5542b7-6224-4cc3-904c-184d660f0295/tip` → **201**

```json
{
  "command_id": "0668c4a4-4117-4d3e-b437-2a55dcc1722e",
  "amount_minor": 1100
}
```

```json
{
  "id": "3cc4a290-5482-40d9-b76b-c953ab0c5553",
  "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T09:14:10.043511Z"
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
  "session_id": "3f291000-bf71-452b-a1e8-c4f41df297ec",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTAsImlhdCI6MTc5MzE3ODg1MCwianRpIjoiNGRlMzMxMTUtYTc5My00YzdiLThmZTUtNTBiMjc1NWFiMjAzIiwic2lkIjoiM2YyOTEwMDAtYmY3MS00NTJiLWExZTgtYzRmNDFkZjI5N2VjIn0.WcKuk9jyGALiT2ECWfpj9-SbTAymfpc2MHZ2X3m0Vus",
  "access_expires_at": "2026-10-28T09:29:10.297001007Z",
  "refresh_token": "2yWfPXWb0bsFxgJXnmvHm4pc6Cu0RFIYv8X2W2Hry44",
  "refresh_expires_at": "2026-10-28T21:14:10.296569585Z",
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
          "STAFF": 1,
          "RIDER": 1
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
      "STAFF": 1,
      "RIDER": 1
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
  "generated_at": "2026-10-28T09:14:10.327330797Z"
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
  "generated_at": "2026-10-28T09:14:10.355128292Z"
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
  "session_id": "9f6c83be-5c28-4a09-b023-946af271a6d3",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTAsImlhdCI6MTc5MzE3ODg1MCwianRpIjoiZjUwMDQyMDctYTZjNi00MmY4LWIzNzYtM2U5NTI5Y2U2N2ViIiwic2lkIjoiOWY2YzgzYmUtNWMyOC00YTA5LWIwMjMtOTQ2YWYyNzFhNmQzIn0.gP-ItNNgNf8EG1YCpzYH_761p3Swhjc1vx2-zj7nr8w",
  "access_expires_at": "2026-10-28T09:29:10.588556815Z",
  "refresh_token": "8JFxpPAB11qtQqCI5cdW5h8SzD5MtwWuSgH4HsRIkSQ",
  "refresh_expires_at": "2026-10-28T21:14:10.588117882Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ba5542b7-6224-4cc3-904c-184d660f0295/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:14:04.369307Z",
      "actor": {
        "type": "CLIENT",
        "id": "72431706-4eb4-46ad-8a1b-bbe1e362af3e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
        "quote_id": "8bb92df4-0669-4bde-929e-a8a999dbd633",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "768939e1-95b4-49f6-8ae2-740cbeab5964"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:14:04.371056Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
        "attempt_id": "b2ec57db-887c-43d1-8068-e417b126a6e1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "768939e1-95b4-49f6-8ae2-740cbeab5964"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:14:04.377462Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9d89533e-7463-4cac-942d-e3a820a75e6a",
        "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "768939e1-95b4-49f6-8ae2-740cbeab5964"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:14:04.436383Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9d89533e-7463-4cac-942d-e3a820a75e6a",
        "order_id": "ba5542b7-6224-4cc3-904c-184d660f0295",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "0530a0fc-20f5-45d2-bf4b-ce5d8c396fbe"
      },
      "correlation_id": "23a4db05-f40f-4933-a1ce-a81a67dd29a2"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T09:14:10.635024082Z",
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
      "last_location_at": "2026-10-28T09:14:06.813681Z",
      "order_id": null
    }
  ]
}
```

Done: order ba5542b7-6224-4cc3-904c-184d660f0295.

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
  "session_id": "49ce3f1d-e5c1-4184-b9d4-71d47cce2b1a",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTAsImlhdCI6MTc5MzE3ODg1MCwianRpIjoiNmViYjVlOTQtYjg2ZS00OTljLTkyMTUtMTk5YTU5ZGJmZDI1Iiwic2lkIjoiNDljZTNmMWQtZTVjMS00MTg0LWI5ZDQtNzFkNDdjY2UyYjFhIn0._-wV0o_J2qMFu0ARcemxIFs9DuImiEU8BRYkCiveX6Q",
  "access_expires_at": "2026-10-28T09:29:10.883700517Z",
  "refresh_token": "wIelhnH74K-3PRABnf_A6zXedCanCZgDYwY8Z20Rga0",
  "refresh_expires_at": "2026-10-28T21:14:10.883282055Z",
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
  "command_id": "40fff1ab-21bf-4408-95d3-b7a973f36521",
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
  "timestamp": "2026-10-28T09:14:10.000+0000",
  "channel": {
    "id": "1730052000.117943755",
    "linkedid": "1730052000.117943755",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678237849"
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
  "timestamp": "2026-10-28T09:14:10.000+0000",
  "channel": {
    "id": "1730052000.117943755",
    "linkedid": "1730052000.117943755",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678237849"
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
  "session_id": "3041846f-bc9a-4469-b29c-a2b2c8b28264",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTEsImlhdCI6MTc5MzE3ODg1MSwianRpIjoiOGIzM2ZkMzgtMzA0NC00Zjg1LWI0ODQtN2IyOTQ2ZWMyZWYzIiwic2lkIjoiMzA0MTg0NmYtYmM5YS00NDY5LWIyOWMtYTJiMmM4YjI4MjY0In0.Y8UMYXRfSfl5fUpN7_SFKjkJs5HMt6Oiem5ChWPXgqs",
  "access_expires_at": "2026-10-28T09:29:11.218584183Z",
  "refresh_token": "G6lVd9bAIAgSylmOM7UnA7yeiumu_w-o79LMhYRMtwo",
  "refresh_expires_at": "2026-10-28T21:14:11.218214974Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "f9eca14e-5d27-4bc1-8fd2-02a8457b73c1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678237849",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T09:14:10Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/f9eca14e-5d27-4bc1-8fd2-02a8457b73c1/answer` → **200**

```json
{
  "command_id": "b94b7dea-f400-438a-aff6-7c70cef6141c"
}
```

```json
{
  "id": "f9eca14e-5d27-4bc1-8fd2-02a8457b73c1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678237849",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "order_ids": [],
  "started_at": "2026-10-28T09:14:10Z",
  "answered_at": "2026-10-28T09:14:11.279162Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.117943755",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "01b08409-c16c-4f88-900e-2346f1384487",
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
  "id": "e8febd13-0a52-42b2-bb38-1783e66e6029",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:11.334716Z",
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
  "command_id": "dc5a8b59-75ec-47e5-9802-91930b7310da",
  "quote_id": "e8febd13-0a52-42b2-bb38-1783e66e6029",
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
    "phone": "+380678237849"
  },
  "call_id": "f9eca14e-5d27-4bc1-8fd2-02a8457b73c1"
}
```

```json
{
  "id": "ecf92e59-8e83-440d-af36-985f80e2e747",
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
  "created_at": "2026-10-28T09:14:11.380018Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678237849"
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
    "id": "1730052000.117943755",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f9eca14e-5d27-4bc1-8fd2-02a8457b73c1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678237849",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [
        "ecf92e59-8e83-440d-af36-985f80e2e747"
      ],
      "started_at": "2026-10-28T09:14:10Z",
      "answered_at": "2026-10-28T09:14:11.279162Z",
      "ended_at": "2026-10-28T09:14:11.420457Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "1da8654f-7db9-4d7f-ab75-9730f64cedf4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672246516",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [],
      "started_at": "2026-10-28T09:13:28.627293Z",
      "answered_at": "2026-10-28T09:13:28.694223Z",
      "ended_at": "2026-10-28T09:13:28.757108Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:13:31.396405Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/ecf92e59-8e83-440d-af36-985f80e2e747` → **200**

```json
{
  "id": "ecf92e59-8e83-440d-af36-985f80e2e747",
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
  "created_at": "2026-10-28T09:14:11.380018Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678237849"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ecf92e59-8e83-440d-af36-985f80e2e747` → **200**

```json
{
  "id": "ecf92e59-8e83-440d-af36-985f80e2e747",
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
  "created_at": "2026-10-28T09:14:11.380018Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678237849"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ecf92e59-8e83-440d-af36-985f80e2e747/cancel` → **200**

```json
{
  "command_id": "59dab54b-e08e-4581-882c-d144d2373757",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ecf92e59-8e83-440d-af36-985f80e2e747",
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
  "created_at": "2026-10-28T09:14:11.380018Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678237849"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call f9eca14e-5d27-4bc1-8fd2-02a8457b73c1 with order ecf92e59-8e83-440d-af36-985f80e2e747.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7462"
}
```

```json
{
  "challenge_id": "179a31fd-04d2-4d6a-9b6c-d0af81f416d1",
  "expires_at": "2026-10-28T09:19:11.556010787Z",
  "resend_available_at": "2026-10-28T09:14:12.556010787Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "950466",
  "sent_at": "2026-10-28T09:14:11.557815463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "179a31fd-04d2-4d6a-9b6c-d0af81f416d1",
  "code": "950466",
  "device_ref": "sandbox-7462"
}
```

```json
{
  "session_id": "08077cf7-d896-4113-9d6d-ca409ceb4c36",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc1MSwiaWF0IjoxNzkzMTc4ODUxLCJqdGkiOiI0ODcxNzQ5Ny1mN2RmLTQzYzUtODNiZC1hYzk5NTBlOGM1ODAiLCJzaWQiOiIwODA3N2NmNy1kODk2LTQxMTMtOWQ2ZC1jYTQwOWNlYjRjMzYifQ.HeRs-T8FkA_aMAr9ApBBc4H-GqR1FBjfBLAYTAaIOKg",
  "access_expires_at": "2026-10-28T09:29:11.606706739Z",
  "refresh_token": "Ni-2k5GCPH6MaOYfj31WoV1BO2Qf_iDJ-PBE4RRvNu8",
  "refresh_expires_at": "2026-11-27T09:14:11.606350449Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:06.813681Z",
  "last_location_at": "2026-10-28T09:14:06.813681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/handover` → **200**

```json
{
  "command_id": "240d9787-65cd-42da-af16-311daba31a0e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:06.813681Z",
  "last_location_at": "2026-10-28T09:14:06.813681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:11Z",
    "sequence": 1793178851684
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:11.701351Z",
  "last_location_at": "2026-10-28T09:14:11.701351Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667000624",
  "device_ref": "sandbox-30875"
}
```

```json
{
  "challenge_id": "886d501c-39dc-4f94-8114-9249c2fc1d1a",
  "expires_at": "2026-10-28T09:19:11.722578224Z",
  "resend_available_at": "2026-10-28T09:14:12.722578224Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667000624` → **200**

```json
{
  "phone": "+380667000624",
  "audience": "CLIENT",
  "code": "579062",
  "sent_at": "2026-10-28T09:14:11.724193016Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "886d501c-39dc-4f94-8114-9249c2fc1d1a",
  "code": "579062",
  "device_ref": "sandbox-30875"
}
```

```json
{
  "session_id": "ae96a115-fa65-4c40-a411-ac1427609f99",
  "subject": {
    "type": "CLIENT",
    "id": "1af78652-3841-4d6e-9122-4da042aba2de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYWY3ODY1Mi0zODQxLTRkNmUtOTEyMi00ZGEwNDJhYmEyZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzUxLCJpYXQiOjE3OTMxNzg4NTEsImp0aSI6IjgxMzBkNTIyLTNkN2EtNDI3Zi1iOTczLTZhNDc4ZmZjYTgyMyIsInNpZCI6ImFlOTZhMTE1LWZhNjUtNGM0MC1hNDExLWFjMTQyNzYwOWY5OSJ9.auYcm3pN2_8wWWR0Ghuvg8j1eJIZqjpI9Yqt1EsmVQA",
  "access_expires_at": "2026-10-28T09:29:11.77349523Z",
  "refresh_token": "7hRB2IMTx2FThLxdmuNgr1k1fSOKM375ocIA63xCjQo",
  "refresh_expires_at": "2026-11-27T09:14:11.773149446Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "27e700e3-f241-416f-b7df-1e755c978f1b",
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
  "id": "aff39912-a57e-4c22-9fea-a2e236eb76e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-28T09:19:11.804858Z",
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
  "command_id": "0a2828d6-b4da-4270-8be0-53dcd78e3fd1",
  "quote_id": "aff39912-a57e-4c22-9fea-a2e236eb76e9",
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
  "id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1af78652-3841-4d6e-9122-4da042aba2de",
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
  "created_at": "2026-10-28T09:14:11.837004Z",
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
    "id": "4671b63a-ac29-4277-bdd4-f1e1f84ca41f",
    "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
    "expires_at": "2026-10-28T09:14:26.839222Z",
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

`POST /api/driver/v1/offers/4671b63a-ac29-4277-bdd4-f1e1f84ca41f/accept` → **200**

```json
{
  "command_id": "4cff76b4-a67c-49d5-8c3b-ab8fe262844c"
}
```

```json
{
  "id": "57716b2a-1fc2-4c8d-97e9-658a79249ec6",
  "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f08597aa-d8d8-4f25-951e-8d2e269803c1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f08597aa-d8d8-4f25-951e-8d2e269803c1",
  "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
  "assignment_id": "57716b2a-1fc2-4c8d-97e9-658a79249ec6",
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

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:11Z",
    "sequence": 1793178851937
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:11.95423Z",
  "last_location_at": "2026-10-28T09:14:11.95423Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f08597aa-d8d8-4f25-951e-8d2e269803c1/arrive` → **200**

```json
{
  "command_id": "cfef4890-7c3b-4e37-9a75-d2e966037e2d",
  "expected_version": 0
}
```

```json
{
  "id": "f08597aa-d8d8-4f25-951e-8d2e269803c1",
  "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
  "assignment_id": "57716b2a-1fc2-4c8d-97e9-658a79249ec6",
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
  "arrived_at": "2026-10-28T09:14:11.984434Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f08597aa-d8d8-4f25-951e-8d2e269803c1/start` → **200**

```json
{
  "command_id": "cabf814c-2541-4ece-ad96-4f7a1d0d1e41",
  "expected_version": 1
}
```

```json
{
  "id": "f08597aa-d8d8-4f25-951e-8d2e269803c1",
  "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
  "assignment_id": "57716b2a-1fc2-4c8d-97e9-658a79249ec6",
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
  "arrived_at": "2026-10-28T09:14:11.984434Z",
  "started_at": "2026-10-28T09:14:12.016006Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:12Z",
    "sequence": 1793178852371
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:12.05316Z",
  "last_location_at": "2026-10-28T09:14:12.05316Z",
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
  "device_ref": "sandbox-32413"
}
```

```json
{
  "challenge_id": "a6c9ba00-9a51-4df4-8a7a-11aa632ed6b9",
  "expires_at": "2026-10-28T09:19:12.075081686Z",
  "resend_available_at": "2026-10-28T09:14:13.075081686Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "732921",
  "sent_at": "2026-10-28T09:14:12.076878359Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6c9ba00-9a51-4df4-8a7a-11aa632ed6b9",
  "code": "732921",
  "device_ref": "sandbox-32413"
}
```

```json
{
  "session_id": "d87c80fb-87cd-4fb6-9bdc-b6db17fc64ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc1MiwiaWF0IjoxNzkzMTc4ODUyLCJqdGkiOiI5ZjM1OGRjZi02NjUyLTQ4MTItODk0My00MTMwNzA2NDU4N2IiLCJzaWQiOiJkODdjODBmYi04N2NkLTRmYjYtOWJkYy1iNmRiMTdmYzY0ZWQifQ.EfCEwntdzog_WxqNRnCc3tVwZDYBj3Zs0eOLsogIxcU",
  "access_expires_at": "2026-10-28T09:29:12.141491282Z",
  "refresh_token": "zB53GLS9i8o81mkDZLw5av_uskw5t1Q7QrxvAJEhcdI",
  "refresh_expires_at": "2026-11-27T09:14:12.140966821Z",
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
  "command_id": "8bdc355e-724f-478b-b3f2-930e6f046812",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:12Z",
    "sequence": 1793178852372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1",
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
  "last_heartbeat_at": "2026-10-28T09:14:12.201718Z",
  "last_location_at": "2026-10-28T09:14:12.201718Z",
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
  "session_id": "b4049fb5-fc5b-44d4-9013-7e2db229291e",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTIsImlhdCI6MTc5MzE3ODg1MiwianRpIjoiZjNkOWNiMGItODUzMy00YmFiLTkzYmYtZTFjNDAwODk2MTdhIiwic2lkIjoiYjQwNDlmYjUtZmM1Yi00NGQ0LTkwMTMtN2UyZGIyMjkyOTFlIn0.9hPSogs5puNnDvMsTv7BnOVVnAn0mhXi32I4eLmICvs",
  "access_expires_at": "2026-10-28T09:29:12.439392135Z",
  "refresh_token": "1bYPLCZkd_79kYYZrAh_zMYQOiBs7NcEI3rLW5dRoBI",
  "refresh_expires_at": "2026-10-28T21:14:12.439028724Z",
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
  "session_id": "98f133dc-e2a5-4359-aeef-ebb17b3d0dba",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTIsImlhdCI6MTc5MzE3ODg1MiwianRpIjoiNmJlNzA1MjMtNzY3ZC00MjgwLTk2Y2UtNjJiYmZkYjBlN2E1Iiwic2lkIjoiOThmMTMzZGMtZTJhNS00MzU5LWFlZWYtZWJiMTdiM2QwZGJhIn0.Vih373N59-qCt-RDWZlfEAIoz8_5qrzq9Va35HgwyU0",
  "access_expires_at": "2026-10-28T09:29:12.667920285Z",
  "refresh_token": "vb6dUk3YaUFXAr70Py9maddCf2xW5RBjGVYhy-gtSDY",
  "refresh_expires_at": "2026-10-28T21:14:12.667574911Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4a538d81-5c3a-4ccd-9ff6-8352c78a9182` → **200**

```json
{
  "id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1af78652-3841-4d6e-9122-4da042aba2de",
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
    "id": "57716b2a-1fc2-4c8d-97e9-658a79249ec6",
    "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f08597aa-d8d8-4f25-951e-8d2e269803c1",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T09:14:11.837004Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4a538d81-5c3a-4ccd-9ff6-8352c78a9182/interrupt` → **200**

```json
{
  "command_id": "ab92fb83-d6bc-4300-a4d5-3989be4514f1",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1af78652-3841-4d6e-9122-4da042aba2de",
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
      "id": "57716b2a-1fc2-4c8d-97e9-658a79249ec6",
      "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "f08597aa-d8d8-4f25-951e-8d2e269803c1",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T09:14:11.837004Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "f840017b-5e01-49d1-b4d1-673366001bcf",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1af78652-3841-4d6e-9122-4da042aba2de",
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
    "id": "cb32a154-e2bf-4aef-bc6a-85a00b6b16fc",
    "order_id": "f840017b-5e01-49d1-b4d1-673366001bcf",
    "expires_at": "2026-10-28T09:14:27.741042Z",
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

`POST /api/driver/v1/offers/cb32a154-e2bf-4aef-bc6a-85a00b6b16fc/accept` → **200**

```json
{
  "command_id": "8fa013ff-68bd-46bc-a583-910626811623"
}
```

```json
{
  "id": "d0016945-3d59-43db-ab51-3ccf39b7310d",
  "order_id": "f840017b-5e01-49d1-b4d1-673366001bcf",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "662c6f22-0828-4756-9d02-4715855df599",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "662c6f22-0828-4756-9d02-4715855df599",
  "order_id": "f840017b-5e01-49d1-b4d1-673366001bcf",
  "assignment_id": "d0016945-3d59-43db-ab51-3ccf39b7310d",
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
  "session_id": "7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1",
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
  "last_heartbeat_at": "2026-10-28T09:14:12.201718Z",
  "last_location_at": "2026-10-28T09:14:12.201718Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:12Z",
    "sequence": 1793178852861
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1",
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
  "last_heartbeat_at": "2026-10-28T09:14:12.877638Z",
  "last_location_at": "2026-10-28T09:14:12.877638Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/662c6f22-0828-4756-9d02-4715855df599/arrive` → **200**

```json
{
  "command_id": "712e6399-611f-4153-af8a-6984952144ec",
  "expected_version": 0
}
```

```json
{
  "id": "662c6f22-0828-4756-9d02-4715855df599",
  "order_id": "f840017b-5e01-49d1-b4d1-673366001bcf",
  "assignment_id": "d0016945-3d59-43db-ab51-3ccf39b7310d",
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
  "arrived_at": "2026-10-28T09:14:12.90893Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/662c6f22-0828-4756-9d02-4715855df599/start` → **200**

```json
{
  "command_id": "9eece0f5-0635-4f13-9f86-b0f534d5735f",
  "expected_version": 1
}
```

```json
{
  "id": "662c6f22-0828-4756-9d02-4715855df599",
  "order_id": "f840017b-5e01-49d1-b4d1-673366001bcf",
  "assignment_id": "d0016945-3d59-43db-ab51-3ccf39b7310d",
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
  "arrived_at": "2026-10-28T09:14:12.90893Z",
  "started_at": "2026-10-28T09:14:12.951002Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/662c6f22-0828-4756-9d02-4715855df599/complete` → **200**

```json
{
  "command_id": "5f4afcbf-536e-40d5-b794-49faa6928624",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:14:12Z"
}
```

```json
{
  "id": "662c6f22-0828-4756-9d02-4715855df599",
  "order_id": "f840017b-5e01-49d1-b4d1-673366001bcf",
  "assignment_id": "d0016945-3d59-43db-ab51-3ccf39b7310d",
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
  "arrived_at": "2026-10-28T09:14:12.90893Z",
  "started_at": "2026-10-28T09:14:12.951002Z",
  "completed_at": "2026-10-28T09:14:12.988182Z",
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
    "id": "f840017b-5e01-49d1-b4d1-673366001bcf",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T09:14:12.733855Z",
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
    "id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
    "short_number": 8,
    "status": "CANCELLED",
    "created_at": "2026-10-28T09:14:11.837004Z",
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
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
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

`GET /api/operator/v1/orders/4a538d81-5c3a-4ccd-9ff6-8352c78a9182/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T09:14:11.837382Z",
      "actor": {
        "type": "CLIENT",
        "id": "1af78652-3841-4d6e-9122-4da042aba2de",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
        "quote_id": "aff39912-a57e-4c22-9fea-a2e236eb76e9",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "da771425-b48f-473e-b0ec-cff59efabc6a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T09:14:11.838703Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
        "attempt_id": "606cc954-8a33-4915-8a41-022850a90582",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "da771425-b48f-473e-b0ec-cff59efabc6a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T09:14:11.841066Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4671b63a-ac29-4277-bdd4-f1e1f84ca41f",
        "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "da771425-b48f-473e-b0ec-cff59efabc6a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T09:14:11.892017Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4671b63a-ac29-4277-bdd4-f1e1f84ca41f",
        "order_id": "4a538d81-5c3a-4ccd-9ff6-8352c78a9182",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "57716b2a-1fc2-4c8d-97e9-658a79249ec6"
      },
      "correlation_id": "2a410417-7fdc-4e85-9105-0d335cc17998"
```

Done: interrupted 4a538d81-5c3a-4ccd-9ff6-8352c78a9182, follow-up f840017b-5e01-49d1-b4d1-673366001bcf.

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
  "session_id": "86b4fce9-e40c-44a3-b8b8-d1786bc462b8",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTYsImlhdCI6MTc5MzE3ODg1NiwianRpIjoiODdjYjhhMmYtMjEwOC00YzUwLTkwODQtYTFhODgzZGE5YmVhIiwic2lkIjoiODZiNGZjZTktZTQwYy00NGEzLWI4YjgtZDE3ODZiYzQ2MmI4In0.OQQSqTv3cXlnpfIdNb14EYgy6tPxDqREMsx4tEXUhhw",
  "access_expires_at": "2026-10-28T09:29:16.305892838Z",
  "refresh_token": "bGGNRCKVVWH7sS45WYibxuG-kYjXZVK4Ofsofcy9E9U",
  "refresh_expires_at": "2026-10-28T21:14:16.305508236Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e7102261-8e60-41ee-a26a-2e40604765b5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:14:16Z"
}
```

```json
{
  "id": "65ebcbc9-1261-45e6-be04-7e12919151a4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:14:16Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/65ebcbc9-1261-45e6-be04-7e12919151a4/publish` → **200**

```json
{
  "command_id": "0953753b-e234-4a4c-9c5b-31828e8fef2f",
  "expected_version": 0
}
```

```json
{
  "id": "65ebcbc9-1261-45e6-be04-7e12919151a4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:14:16.382059Z",
  "published_at": "2026-10-28T09:14:16.382059Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "65ebcbc9-1261-45e6-be04-7e12919151a4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T09:14:16.382059Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638833112",
  "device_ref": "sandbox-12294"
}
```

```json
{
  "challenge_id": "9ac08653-d10c-43c8-ab5a-d90bed1e342f",
  "expires_at": "2026-10-28T09:19:16.434595927Z",
  "resend_available_at": "2026-10-28T09:14:17.434595927Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638833112` → **200**

```json
{
  "phone": "+380638833112",
  "audience": "CLIENT",
  "code": "035134",
  "sent_at": "2026-10-28T09:14:16.436327138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ac08653-d10c-43c8-ab5a-d90bed1e342f",
  "code": "035134",
  "device_ref": "sandbox-12294"
}
```

```json
{
  "session_id": "df7774f9-b4d7-4ce1-9ef9-3f29da48b44f",
  "subject": {
    "type": "CLIENT",
    "id": "f687419f-e6cc-42a0-995d-1bd50e2e8d49"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjg3NDE5Zi1lNmNjLTQyYTAtOTk1ZC0xYmQ1MGUyZThkNDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzU2LCJpYXQiOjE3OTMxNzg4NTYsImp0aSI6ImY1MTVhMzRlLTJlMDMtNDliNS1hZjQ2LTg1OWI2M2U0OTZjMSIsInNpZCI6ImRmNzc3NGY5LWI0ZDctNGNlMS05ZWY5LTNmMjlkYTQ4YjQ0ZiJ9.kVJiBiNNdFmqOwe12Horbvo5m0qx7F4FJetlU5kf6uk",
  "access_expires_at": "2026-10-28T09:29:16.482993555Z",
  "refresh_token": "E37NZoxEqQLgsh16Yqo7-sSq_lFVQz2gVBNC_4j-KQE",
  "refresh_expires_at": "2026-11-27T09:14:16.482612248Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "65ebcbc9-1261-45e6-be04-7e12919151a4",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T09:14:16.382059Z",
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
  "command_id": "ef536c54-bf8e-4a54-ba76-cc610446deea",
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
  "id": "d4735dab-3f43-4eed-8501-d2a2827c53ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T09:19:16.536386Z",
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
  "command_id": "a90c748b-a393-446f-aa5f-9decf8dbb492",
  "quote_id": "d4735dab-3f43-4eed-8501-d2a2827c53ea",
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
  "correlation_id": "fef155ca-b598-40be-a40d-696b74cd3e57"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "14230689-6849-44b6-80f9-58c030e6bf54",
  "version_id": "65ebcbc9-1261-45e6-be04-7e12919151a4",
  "language": "uk"
}
```

```json
{
  "version_id": "65ebcbc9-1261-45e6-be04-7e12919151a4",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T09:14:16.597525Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "28d6c672-807d-48ac-b9be-798208057244",
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
  "id": "209ddb36-1e14-46a5-8b34-a87e203ba1b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-28T09:19:16.628871Z",
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
  "command_id": "bf770ae8-2bb3-414c-bd67-9287d6228de2",
  "quote_id": "209ddb36-1e14-46a5-8b34-a87e203ba1b9",
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
  "id": "64a11d10-ed16-47c8-936c-6c91af1affb1",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f687419f-e6cc-42a0-995d-1bd50e2e8d49",
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
  "created_at": "2026-10-28T09:14:16.65943Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/64a11d10-ed16-47c8-936c-6c91af1affb1` → **200**

```json
{
  "id": "64a11d10-ed16-47c8-936c-6c91af1affb1",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f687419f-e6cc-42a0-995d-1bd50e2e8d49",
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
  "created_at": "2026-10-28T09:14:16.65943Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/64a11d10-ed16-47c8-936c-6c91af1affb1/cancel` → **200**

```json
{
  "command_id": "e311687f-3fe6-4572-9059-ed1494a68ec4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "64a11d10-ed16-47c8-936c-6c91af1affb1",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f687419f-e6cc-42a0-995d-1bd50e2e8d49",
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
  "created_at": "2026-10-28T09:14:16.65943Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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

`POST /api/admin/v1/legal-documents/65ebcbc9-1261-45e6-be04-7e12919151a4` → **409**

```json
{
  "command_id": "e78140bc-11a8-41b4-8be4-ee89e6a6a59c",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T09:14:16Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/65ebcbc9-1261-45e6-be04-7e12919151a4",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e09c65f1-bfea-47fc-a91c-842e79aa430e"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0487b904-c689-4440-b088-e5de09582ccb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:14:16Z"
}
```

```json
{
  "id": "18850408-bce2-4ab1-acf3-9add3505ec97",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:14:16Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/18850408-bce2-4ab1-acf3-9add3505ec97/publish` → **200**

```json
{
  "command_id": "2f11d777-6850-45c0-a4b1-cb1fde21352e",
  "expected_version": 0
}
```

```json
{
  "id": "18850408-bce2-4ab1-acf3-9add3505ec97",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T09:14:16.816174Z",
  "published_at": "2026-10-28T09:14:16.816174Z",
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
  "device_ref": "sandbox-24361"
}
```

```json
{
  "challenge_id": "e9c0e345-1ebd-4a47-9175-910eb9315a5d",
  "expires_at": "2026-10-28T09:19:16.848755885Z",
  "resend_available_at": "2026-10-28T09:14:17.848755885Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "618302",
  "sent_at": "2026-10-28T09:14:16.850494761Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9c0e345-1ebd-4a47-9175-910eb9315a5d",
  "code": "618302",
  "device_ref": "sandbox-24361"
}
```

```json
{
  "session_id": "3777f580-f03a-4ccb-9210-2ae039d66835",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc1NiwiaWF0IjoxNzkzMTc4ODU2LCJqdGkiOiI5ZThmZTJmNy02ZWYzLTQyMDYtYTRkMS00NTgwYjFiMDM4YzkiLCJzaWQiOiIzNzc3ZjU4MC1mMDNhLTRjY2ItOTIxMC0yYWUwMzlkNjY4MzUifQ.cNxVStFZIGpQOliECotM_Sl1XEVwkY0RbSESn-vZiu4",
  "access_expires_at": "2026-10-28T09:29:16.896861953Z",
  "refresh_token": "QwJ1ESgyLsZ83lD4so70z6YP3ANccpWSV5fFw1zdZ70",
  "refresh_expires_at": "2026-11-27T09:14:16.896388889Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1",
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
  "last_heartbeat_at": "2026-10-28T09:14:12.877638Z",
  "last_location_at": "2026-10-28T09:14:12.877638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1/handover` → **200**

```json
{
  "command_id": "28b6fb66-c4a7-4ffa-9337-094ebb0775e8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1",
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
  "last_heartbeat_at": "2026-10-28T09:14:12.877638Z",
  "last_location_at": "2026-10-28T09:14:12.877638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:16Z",
    "sequence": 1793178856970
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1",
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
  "last_heartbeat_at": "2026-10-28T09:14:16.986506Z",
  "last_location_at": "2026-10-28T09:14:16.986506Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678613540",
  "device_ref": "sandbox-30551"
}
```

```json
{
  "challenge_id": "dd066ec7-03f0-47f9-b225-012ebbbd4af7",
  "expires_at": "2026-10-28T09:19:17.009522028Z",
  "resend_available_at": "2026-10-28T09:14:18.009522028Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678613540` → **200**

```json
{
  "phone": "+380678613540",
  "audience": "CLIENT",
  "code": "004067",
  "sent_at": "2026-10-28T09:14:17.011281815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd066ec7-03f0-47f9-b225-012ebbbd4af7",
  "code": "004067",
  "device_ref": "sandbox-30551"
}
```

```json
{
  "session_id": "480742fd-ec0f-43c9-843c-cd0bf499c123",
  "subject": {
    "type": "CLIENT",
    "id": "20ce3697-cfc3-47ab-9448-ff8021f0736e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMGNlMzY5Ny1jZmMzLTQ3YWItOTQ0OC1mZjgwMjFmMDczNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzU3LCJpYXQiOjE3OTMxNzg4NTcsImp0aSI6ImFhMTg2NTllLTBjZDEtNDQyNy05ZWMzLWI0ZjY4ZmVjMTljMiIsInNpZCI6IjQ4MDc0MmZkLWVjMGYtNDNjOS04NDNjLWNkMGJmNDk5YzEyMyJ9.9yftb03BRG1PQ-1to4huyTGti_1CE5iTlbXlhMtORn8",
  "access_expires_at": "2026-10-28T09:29:17.058661112Z",
  "refresh_token": "pni5w5HPyBajC0tzU3kI1uJ8Tz3wGlqMsuj8_ndreLI",
  "refresh_expires_at": "2026-11-27T09:14:17.058222655Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "369e79c3-a5d9-43ff-962c-7225f11922e5",
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
  "id": "b17220c9-e94b-4934-be14-6d5aa5e0a6d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:17.093506Z",
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
  "command_id": "0dedefe9-ed1a-4b74-a5f0-094e88d42e2f",
  "quote_id": "b17220c9-e94b-4934-be14-6d5aa5e0a6d6",
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
    "phone": "+380678172654"
  }
}
```

```json
{
  "id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
  "created_at": "2026-10-28T09:14:17.126909Z",
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
    "id": "fe84ec6a-18ce-4db9-ac77-a80517b65d31",
    "order_id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
    "expires_at": "2026-10-28T09:14:32.129043Z",
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

`POST /api/driver/v1/offers/fe84ec6a-18ce-4db9-ac77-a80517b65d31/accept` → **200**

```json
{
  "command_id": "3d1b5b7d-f801-4b7b-9bb1-0b4ee92fb9ed"
}
```

```json
{
  "id": "cb71fc75-88c5-42d4-a243-5260e92d4af5",
  "order_id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7aea4e7e-5281-45e9-a98d-832093853d38",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7aea4e7e-5281-45e9-a98d-832093853d38",
  "order_id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
  "assignment_id": "cb71fc75-88c5-42d4-a243-5260e92d4af5",
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
    "phone": "+380678172654"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "31639852-b2aa-4da7-82db-19b5c244b657",
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
  "id": "2733573b-9b7a-4aaf-b218-e22bf4119cb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:17.246963Z",
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
  "command_id": "979f7133-b6b7-496d-b139-7781704cf670",
  "quote_id": "2733573b-9b7a-4aaf-b218-e22bf4119cb4",
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
  "id": "24270032-0413-48e2-a770-8487b76c36d7",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
  "created_at": "2026-10-28T09:14:17.280248Z",
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
  "command_id": "70727486-f00f-4c9c-a257-abefb4f1543e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T12:14:17Z"
}
```

```json
{
  "id": "d9dac541-8cf4-41a1-8c4f-a5db1cce39fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:17.317174Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:14:17Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4e41ed39-f661-4052-b179-75389048f0eb",
  "quote_id": "d9dac541-8cf4-41a1-8c4f-a5db1cce39fe",
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
  "pickup_at": "2026-10-28T12:14:17Z"
}
```

```json
{
  "id": "145ad266-285c-485a-9a63-1db9033f2ac0",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
  "created_at": "2026-10-28T09:14:17.35109Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:14:17Z",
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
  "command_id": "006555ee-6ae0-4b0c-9da7-dc1cdf0d3fe6",
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
  "id": "0b0a40a5-dca2-4070-84f4-63146899a409",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:17.386703Z",
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
  "command_id": "c5071df0-8ada-48a1-a7ef-83836bcc215c",
  "quote_id": "0b0a40a5-dca2-4070-84f4-63146899a409",
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
  "correlation_id": "3340f1c8-4425-49ec-ba86-b3ed2ba418fc"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "145ad266-285c-485a-9a63-1db9033f2ac0",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
      "created_at": "2026-10-28T09:14:17.35109Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T12:14:17Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "24270032-0413-48e2-a770-8487b76c36d7",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
      "created_at": "2026-10-28T09:14:17.280248Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "24270032-0413-48e2-a770-8487b76c36d7",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
  "created_at": "2026-10-28T09:14:17.280248Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/0609ad07-b2d2-4640-bfdb-a12c5f59eb29` → **200**

```json
{
  "id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
    "id": "cb71fc75-88c5-42d4-a243-5260e92d4af5",
    "order_id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7aea4e7e-5281-45e9-a98d-832093853d38",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T09:14:17.126909Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0609ad07-b2d2-4640-bfdb-a12c5f59eb29/cancel` → **200**

```json
{
  "command_id": "8abbf66a-cea5-4eaa-802d-a9e4ede49f79",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
    "id": "cb71fc75-88c5-42d4-a243-5260e92d4af5",
    "order_id": "0609ad07-b2d2-4640-bfdb-a12c5f59eb29",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7aea4e7e-5281-45e9-a98d-832093853d38",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T09:14:17.126909Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/24270032-0413-48e2-a770-8487b76c36d7` → **200**

```json
{
  "id": "24270032-0413-48e2-a770-8487b76c36d7",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
  "created_at": "2026-10-28T09:14:17.280248Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/24270032-0413-48e2-a770-8487b76c36d7/cancel` → **200**

```json
{
  "command_id": "eaa77fe0-6421-4e8c-86c7-eb9e01533cb0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "24270032-0413-48e2-a770-8487b76c36d7",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
  "created_at": "2026-10-28T09:14:17.280248Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/145ad266-285c-485a-9a63-1db9033f2ac0` → **200**

```json
{
  "id": "145ad266-285c-485a-9a63-1db9033f2ac0",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
  "created_at": "2026-10-28T09:14:17.35109Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:14:17Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/145ad266-285c-485a-9a63-1db9033f2ac0/cancel` → **200**

```json
{
  "command_id": "df25fe90-b6df-4b7c-aac9-06f873ed20b1",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "145ad266-285c-485a-9a63-1db9033f2ac0",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "20ce3697-cfc3-47ab-9448-ff8021f0736e",
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
  "created_at": "2026-10-28T09:14:17.35109Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-28T12:14:17Z",
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
  "session_id": "7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1",
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
  "last_heartbeat_at": "2026-10-28T09:14:16.986506Z",
  "last_location_at": "2026-10-28T09:14:16.986506Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e4dcf7f-7fc3-4c3d-854b-770601cf9ab1/close` → **200**

```json
{
  "command_id": "3ae4aba1-f572-407b-a900-48531578786f",
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

Done: orders 0609ad07-b2d2-4640-bfdb-a12c5f59eb29, 24270032-0413-48e2-a770-8487b76c36d7, 145ad266-285c-485a-9a63-1db9033f2ac0.

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
  "session_id": "8d6b17c5-7780-441c-964c-1e9faf24468e",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTcsImlhdCI6MTc5MzE3ODg1NywianRpIjoiMGU5OWNjYzMtYTYzYS00NmZiLWI2MTktNmZkYjM5OWVhMWIzIiwic2lkIjoiOGQ2YjE3YzUtNzc4MC00NDFjLTk2NGMtMWU5ZmFmMjQ0NjhlIn0.znC4dvTtgYXRz6l36oYB9P82Q2nAlQ3mhoj9XoHXUL8",
  "access_expires_at": "2026-10-28T09:29:17.915262706Z",
  "refresh_token": "gksegLRKykzyHGYqQ66t2bfVCj8VElupAjzNVPFlfv8",
  "refresh_expires_at": "2026-10-28T21:14:17.914873096Z",
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
  "session_id": "52f30b9a-a08f-464e-a6af-e5175c9b3c84",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NTgsImlhdCI6MTc5MzE3ODg1OCwianRpIjoiMDk4MmIwOTUtMmMzOS00MDk1LWFmMmUtZjBlMjQwOWFhMTA3Iiwic2lkIjoiNTJmMzBiOWEtYTA4Zi00NjRlLWE2YWYtZTUxNzVjOWIzYzg0In0.ySka5mVCjlZVvSDcOIPRTXFyaaTVRCJlZpCHjcIDQ5c",
  "access_expires_at": "2026-10-28T09:29:18.147053429Z",
  "refresh_token": "q39sqoAqGwB2uZgVFyKQBTzEp-o9A04w0gRhEA_NB0k",
  "refresh_expires_at": "2026-10-28T21:14:18.146687225Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16618"
}
```

```json
{
  "challenge_id": "a0a9ca73-0c53-4fc7-bca8-ad7eb780dfa7",
  "expires_at": "2026-10-28T09:19:18.167926849Z",
  "resend_available_at": "2026-10-28T09:14:19.167926849Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "312979",
  "sent_at": "2026-10-28T09:14:18.169529233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0a9ca73-0c53-4fc7-bca8-ad7eb780dfa7",
  "code": "312979",
  "device_ref": "sandbox-16618"
}
```

```json
{
  "session_id": "8842ba2c-6c88-4615-98f1-81be09ccd381",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc1OCwiaWF0IjoxNzkzMTc4ODU4LCJqdGkiOiI4YmYzMzM2OC0zMzVjLTRlNDQtYTU5Ny00MWEyNTI5OGUwMTYiLCJzaWQiOiI4ODQyYmEyYy02Yzg4LTQ2MTUtOThmMS04MWJlMDljY2QzODEifQ.CwpbPj7PBymvi00cdZrTx6z_4zluFWatQi0LS4tipUQ",
  "access_expires_at": "2026-10-28T09:29:18.21582302Z",
  "refresh_token": "Sj_DSL-X2Ah1pD_qGGbTpb_lEKAaaqFgPQjRW0p98rI",
  "refresh_expires_at": "2026-11-27T09:14:18.215433356Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:12.05316Z",
  "last_location_at": "2026-10-28T09:14:12.05316Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/handover` → **200**

```json
{
  "command_id": "d7afda4c-e60f-4f29-916d-f879963291b4",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:12.05316Z",
  "last_location_at": "2026-10-28T09:14:12.05316Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:18Z",
    "sequence": 1793178858287
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:18.303303Z",
  "last_location_at": "2026-10-28T09:14:18.303303Z",
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
  "command_id": "dd8e931f-907e-4f06-b387-74bbc93e3c22",
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
  "effective_at": "2026-10-28T09:14:18.363173Z",
  "changed_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T09:14:18.389271734Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9558bc3b-2c42-419a-bd23-ddc4162ce257",
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
  "id": "d1787604-ecb4-4c42-b1aa-3735ea93786f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T09:19:18.421038Z",
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
  "command_id": "ea7f9b92-9d20-4b70-8929-67dee826b113",
  "quote_id": "d1787604-ecb4-4c42-b1aa-3735ea93786f",
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
    "phone": "+380671117723"
  }
}
```

```json
{
  "id": "43c25cdc-20ce-494d-8704-6f8eb1ab2495",
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
  "created_at": "2026-10-28T09:14:18.453316Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117723"
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
    "id": "0b621b4b-acc6-45eb-9979-d1b84a346637",
    "order_id": "43c25cdc-20ce-494d-8704-6f8eb1ab2495",
    "expires_at": "2026-10-28T09:14:33.455614Z",
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

`POST /api/driver/v1/offers/0b621b4b-acc6-45eb-9979-d1b84a346637/accept` → **200**

```json
{
  "command_id": "3cd9f1dd-ac48-4ade-8059-62390294f045"
}
```

```json
{
  "id": "720df08f-0122-46dd-bcbb-a2493ffaaf46",
  "order_id": "43c25cdc-20ce-494d-8704-6f8eb1ab2495",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3edd58f9-b146-47df-9b6d-eb5b7366f2d9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3edd58f9-b146-47df-9b6d-eb5b7366f2d9",
  "order_id": "43c25cdc-20ce-494d-8704-6f8eb1ab2495",
  "assignment_id": "720df08f-0122-46dd-bcbb-a2493ffaaf46",
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
    "phone": "+380671117723"
  }
}
```

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:18Z",
    "sequence": 1793178858540
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:18.55643Z",
  "last_location_at": "2026-10-28T09:14:18.55643Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3edd58f9-b146-47df-9b6d-eb5b7366f2d9/arrive` → **200**

```json
{
  "command_id": "98056e68-203e-4822-b967-8a0fe51306e0",
  "expected_version": 0
}
```

```json
{
  "id": "3edd58f9-b146-47df-9b6d-eb5b7366f2d9",
  "order_id": "43c25cdc-20ce-494d-8704-6f8eb1ab2495",
  "assignment_id": "720df08f-0122-46dd-bcbb-a2493ffaaf46",
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
  "arrived_at": "2026-10-28T09:14:18.585096Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117723"
  }
}
```

`POST /api/driver/v1/trips/3edd58f9-b146-47df-9b6d-eb5b7366f2d9/start` → **200**

```json
{
  "command_id": "0dfa1ca6-c0e2-4c25-a74e-f13d2bd26bb7",
  "expected_version": 1
}
```

```json
{
  "id": "3edd58f9-b146-47df-9b6d-eb5b7366f2d9",
  "order_id": "43c25cdc-20ce-494d-8704-6f8eb1ab2495",
  "assignment_id": "720df08f-0122-46dd-bcbb-a2493ffaaf46",
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
  "arrived_at": "2026-10-28T09:14:18.585096Z",
  "started_at": "2026-10-28T09:14:18.61713Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117723"
  }
}
```

`POST /api/driver/v1/trips/3edd58f9-b146-47df-9b6d-eb5b7366f2d9/complete` → **200**

```json
{
  "command_id": "53821f9a-def0-4b42-8b9a-2f9d96443e2c",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:14:18Z",
  "cash_received": true
}
```

```json
{
  "id": "3edd58f9-b146-47df-9b6d-eb5b7366f2d9",
  "order_id": "43c25cdc-20ce-494d-8704-6f8eb1ab2495",
  "assignment_id": "720df08f-0122-46dd-bcbb-a2493ffaaf46",
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
  "arrived_at": "2026-10-28T09:14:18.585096Z",
  "started_at": "2026-10-28T09:14:18.61713Z",
  "completed_at": "2026-10-28T09:14:18.652176Z",
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
  "command_id": "84bf4863-34b6-4191-9c9e-45ce3690a39b",
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
  "id": "83bf0940-63b5-4ebb-b402-8aa1ee7d7a92",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T09:19:18.688727Z",
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
  "command_id": "ac183e6f-1071-4a30-a275-17a96ec9db67",
  "quote_id": "83bf0940-63b5-4ebb-b402-8aa1ee7d7a92",
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
    "phone": "+3806711115405"
  }
}
```

```json
{
  "id": "37b75296-9739-4006-bb55-38d2206dcba9",
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
  "created_at": "2026-10-28T09:14:18.721382Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115405"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/37b75296-9739-4006-bb55-38d2206dcba9` → **200**

```json
{
  "id": "37b75296-9739-4006-bb55-38d2206dcba9",
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
  "created_at": "2026-10-28T09:14:18.721382Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115405"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/37b75296-9739-4006-bb55-38d2206dcba9/cancel` → **200**

```json
{
  "command_id": "45e184e5-5b8b-4da5-be82-391a2da3d793",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "37b75296-9739-4006-bb55-38d2206dcba9",
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
  "created_at": "2026-10-28T09:14:18.721382Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115405"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора",
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
  "staff_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T09:14:18.790188Z",
  "last_entries": [
    {
      "order_id": "37b75296-9739-4006-bb55-38d2206dcba9",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T09:14:18.790188Z"
    },
    {
      "order_id": "43c25cdc-20ce-494d-8704-6f8eb1ab2495",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T09:14:18.656045Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cba9efbe-b702-4e39-965e-eea8393e700a",
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
  "last_heartbeat_at": "2026-10-28T09:14:18.55643Z",
  "last_location_at": "2026-10-28T09:14:18.55643Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cba9efbe-b702-4e39-965e-eea8393e700a/close` → **200**

```json
{
  "command_id": "16da973e-92bc-4b03-bef8-27a1eff64d62",
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

Done: operator bonus for fulfilled 43c25cdc-20ce-494d-8704-6f8eb1ab2495 and operator-fault cancellation 37b75296-9739-4006-bb55-38d2206dcba9.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673995540",
  "device_ref": "sandbox-17606"
}
```

```json
{
  "challenge_id": "240d2fee-3cfc-4e75-87d2-0e2629d313a5",
  "expires_at": "2026-10-28T09:19:20.924864611Z",
  "resend_available_at": "2026-10-28T09:14:21.924864611Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673995540` → **200**

```json
{
  "phone": "+380673995540",
  "audience": "CLIENT",
  "code": "091584",
  "sent_at": "2026-10-28T09:14:20.926632541Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676371906",
  "device_ref": "sandbox-9436",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6bfe3df9-1160-444c-9e3a-f15d0fd09dd9",
  "expires_at": "2026-10-28T09:19:21.004528207Z",
  "resend_available_at": "2026-10-28T09:14:22.004528207Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676371906` → **200**

```json
{
  "phone": "+380676371906",
  "audience": "CLIENT",
  "code": "729865",
  "sent_at": "2026-10-28T09:14:21.006290989Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673360000",
  "device_ref": "sandbox-22285"
}
```

```json
{
  "challenge_id": "ecaedc0e-7263-48ad-aa78-fdf873a687ef",
  "expires_at": "2026-10-28T09:19:21.052582045Z",
  "resend_available_at": "2026-10-28T09:14:22.052582045Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673360000` → **200**

```json
{
  "phone": "+380673360000",
  "audience": "CLIENT",
  "code": "098372",
  "sent_at": "2026-10-28T09:14:21.054998149Z",
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
  "session_id": "b9ef12fc-f304-420e-9e71-b579679a6730",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NjEsImlhdCI6MTc5MzE3ODg2MSwianRpIjoiNDM3NzFmMTQtMDEzMy00ZGQwLWI3MjItZDc4MWQ4OTBjOTZkIiwic2lkIjoiYjllZjEyZmMtZjMwNC00MjBlLTllNzEtYjU3OTY3OWE2NzMwIn0.iAfqFxXeFbVSxokxLmKWBDaLF0f3z7NF7Z4njLO7uqE",
  "access_expires_at": "2026-10-28T09:29:21.314314576Z",
  "refresh_token": "OPAjI-xdyZFwXcpskEWGDlH_OP1Eu56RXDEJqo60G3E",
  "refresh_expires_at": "2026-10-28T21:14:21.313941501Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673360000` → **200**

```json
{
  "deliveries": [
    {
      "id": "50e869fa-1a57-4fbf-9789-217da8af1a3c",
      "challenge_id": "ecaedc0e-7263-48ad-aa78-fdf873a687ef",
      "phone": "+380673360000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-943774d9-7036-43c8-8c4b-1b78f20a6f96",
      "error": null,
      "attempted_at": "2026-10-28T09:14:21.055327Z"
    },
    {
      "id": "2d91f778-409b-4f8f-a774-e254dcf25eb6",
      "challenge_id": "ecaedc0e-7263-48ad-aa78-fdf873a687ef",
      "phone": "+380673360000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T09:14:21.054487Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673360000` → **200**

```json
{
  "phone": "+380673360000",
  "audience": "CLIENT",
  "code": "098372",
  "sent_at": "2026-10-28T09:14:21.054998149Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676371906` → **200**

```json
{
  "deliveries": [
    {
      "id": "c9331f7c-611d-4159-8df7-b9ac4e007b37",
      "challenge_id": "6bfe3df9-1160-444c-9e3a-f15d0fd09dd9",
      "phone": "+380676371906",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4d454da0-54df-4b4c-82bc-73659b5f98fb",
      "error": null,
      "attempted_at": "2026-10-28T09:14:21.006543Z"
    }
  ]
}
```

Done: SMS to +380673995540, a call to +380676371906, SMS then a call to +380673360000.

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
  "session_id": "2c9b1c89-cafa-4844-914c-85dcad4c165d",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NjEsImlhdCI6MTc5MzE3ODg2MSwianRpIjoiODgzODBmNTAtYzIzMC00ZGQ2LTlmOWMtMjhjNjNlNTU4YWY3Iiwic2lkIjoiMmM5YjFjODktY2FmYS00ODQ0LTkxNGMtODVkY2FkNGMxNjVkIn0.Qlny6OfmPaYhme_RCbuPP0pve2TWp6O3Etd99Z4Nq74",
  "access_expires_at": "2026-10-28T09:29:21.633748189Z",
  "refresh_token": "mgoVE-11BpAp26uCMWc5-HUhY1aDVTvCh5Bx8We7PBk",
  "refresh_expires_at": "2026-10-28T21:14:21.633363256Z",
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
  "session_id": "23d0d7e7-cf7f-43b7-91df-aa24522a44fa",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NjEsImlhdCI6MTc5MzE3ODg2MSwianRpIjoiYjNlNDQ2MjAtZDIzMy00NTc3LTk0YWQtZjU0OGU4NDhlMjAyIiwic2lkIjoiMjNkMGQ3ZTctY2Y3Zi00M2I3LTkxZGYtYWEyNDUyMmE0NGZhIn0.BZ4JSkwHa8Fr17owcqPlPSMl2wmySWukYGWMEjYGFkM",
  "access_expires_at": "2026-10-28T09:29:21.862683628Z",
  "refresh_token": "TRAhENOtsHCWvYurzGoPhNQUSAooOuxjtbsmWfek9aA",
  "refresh_expires_at": "2026-10-28T21:14:21.862362059Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
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

`POST /api/admin/v1/staff-extensions/88181c42-75c2-4f12-8d8a-e627a07fd15d` → **200**

```json
{
  "command_id": "eda3aa26-893d-4545-a42a-c03becfd9084",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "fe551984-2c09-4de3-82d7-76c84f33be9d",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:14:21.97938Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T09:14:21.97938Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "877ed0af-90f8-436c-8d6f-b1a638d3c8bb",
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
  "id": "a609e449-dab8-4f1d-828f-558bb18ecbba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:22.034521Z",
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
  "command_id": "6ebe4c3c-8188-4662-8282-5325e857b5a1",
  "quote_id": "a609e449-dab8-4f1d-828f-558bb18ecbba",
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
    "phone": "+380676645060"
  }
}
```

```json
{
  "id": "a565018b-867c-438f-a17e-323e3af3f387",
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
  "created_at": "2026-10-28T09:14:22.068053Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676645060"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/a565018b-867c-438f-a17e-323e3af3f387/calls` → **201**

```json
{
  "command_id": "eb7a2ff9-0304-4faa-bde0-ae45e4f24cfd",
  "to": "CALLER"
}
```

```json
{
  "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "order_ids": [
    "a565018b-867c-438f-a17e-323e3af3f387"
  ],
  "started_at": "2026-10-28T09:14:22.113039Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/a565018b-867c-438f-a17e-323e3af3f387/calls` → **201**

```json
{
  "command_id": "eb7a2ff9-0304-4faa-bde0-ae45e4f24cfd",
  "to": "CALLER"
}
```

```json
{
  "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "order_ids": [
    "a565018b-867c-438f-a17e-323e3af3f387"
  ],
  "started_at": "2026-10-28T09:14:22.113039Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "7e9f876b-8b41-441a-892b-05148a609ff9",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676645060",
    "at": "2026-10-28T09:14:22.114823308Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.26229",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "7e9f876b-8b41-441a-892b-05148a609ff9"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=a565018b-867c-438f-a17e-323e3af3f387` → **200**

```json
{
  "calls": [
    {
      "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [
        "a565018b-867c-438f-a17e-323e3af3f387"
      ],
      "started_at": "2026-10-28T09:14:22.113039Z",
      "answered_at": "2026-10-28T09:14:22.235429Z",
      "ended_at": "2026-10-28T09:14:22.256203Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a565018b-867c-438f-a17e-323e3af3f387` → **200**

```json
{
  "calls": [
    {
      "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [
        "a565018b-867c-438f-a17e-323e3af3f387"
      ],
      "started_at": "2026-10-28T09:14:22.113039Z",
      "answered_at": "2026-10-28T09:14:22.235429Z",
      "ended_at": "2026-10-28T09:14:22.256203Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a565018b-867c-438f-a17e-323e3af3f387` → **200**

```json
{
  "calls": [
    {
      "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [
        "a565018b-867c-438f-a17e-323e3af3f387"
      ],
      "started_at": "2026-10-28T09:14:22.113039Z",
      "answered_at": "2026-10-28T09:14:22.235429Z",
      "ended_at": "2026-10-28T09:14:22.256203Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a565018b-867c-438f-a17e-323e3af3f387` → **200**

```json
{
  "calls": [
    {
      "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [
        "a565018b-867c-438f-a17e-323e3af3f387"
      ],
      "started_at": "2026-10-28T09:14:22.113039Z",
      "answered_at": "2026-10-28T09:14:22.235429Z",
      "ended_at": "2026-10-28T09:14:22.256203Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a565018b-867c-438f-a17e-323e3af3f387` → **200**

```json
{
  "calls": [
    {
      "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [
        "a565018b-867c-438f-a17e-323e3af3f387"
      ],
      "started_at": "2026-10-28T09:14:22.113039Z",
      "answered_at": "2026-10-28T09:14:22.235429Z",
      "ended_at": "2026-10-28T09:14:22.256203Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a565018b-867c-438f-a17e-323e3af3f387` → **200**

```json
{
  "calls": [
    {
      "id": "7e9f876b-8b41-441a-892b-05148a609ff9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "order_ids": [
        "a565018b-867c-438f-a17e-323e3af3f387"
      ],
      "started_at": "2026-10-28T09:14:22.113039Z",
      "answered_at": "2026-10-28T09:14:22.235429Z",
      "ended_at": "2026-10-28T09:14:22.256203Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T09:14:31.41735Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/a565018b-867c-438f-a17e-323e3af3f387` → **200**

```json
{
  "id": "a565018b-867c-438f-a17e-323e3af3f387",
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
  "created_at": "2026-10-28T09:14:22.068053Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676645060"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a565018b-867c-438f-a17e-323e3af3f387/cancel` → **200**

```json
{
  "command_id": "d3a21bd8-4c90-47ad-9bef-878c365d2b28",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a565018b-867c-438f-a17e-323e3af3f387",
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
  "created_at": "2026-10-28T09:14:22.068053Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676645060"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
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
  "command_id": "cd2b0f15-5ad6-4751-a037-e6e258e62b4d",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T09:14:32.555516Z",
  "extension": "101"
}
```

Done: outgoing call 7e9f876b-8b41-441a-892b-05148a609ff9 from order a565018b-867c-438f-a17e-323e3af3f387, recorded.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631583543",
  "device_ref": "sandbox-14122"
}
```

```json
{
  "challenge_id": "b249ffe8-69aa-4691-9f55-879cd05f8987",
  "expires_at": "2026-10-28T09:19:32.605052875Z",
  "resend_available_at": "2026-10-28T09:14:33.605052875Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631583543` → **200**

```json
{
  "phone": "+380631583543",
  "audience": "CLIENT",
  "code": "125427",
  "sent_at": "2026-10-28T09:14:32.606953432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b249ffe8-69aa-4691-9f55-879cd05f8987",
  "code": "125427",
  "device_ref": "sandbox-14122"
}
```

```json
{
  "session_id": "436cbca7-9723-485f-b8dd-c978352f0dfe",
  "subject": {
    "type": "CLIENT",
    "id": "c6827478-62fb-4812-a60d-b9abe0dd5163"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjgyNzQ3OC02MmZiLTQ4MTItYTYwZC1iOWFiZTBkZDUxNjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzcyLCJpYXQiOjE3OTMxNzg4NzIsImp0aSI6IjMyMDlmMDkwLTc2NjEtNGExMy1iZmJkLWIxZDQwMjRhNGIyNyIsInNpZCI6IjQzNmNiY2E3LTk3MjMtNDg1Zi1iOGRkLWM5NzgzNTJmMGRmZSJ9.Wn1iVCVo3guv4Oh3D7MJkLbbavUTCYxNicqoMOKzoK8",
  "access_expires_at": "2026-10-28T09:29:32.668386153Z",
  "refresh_token": "JVnQYFFhRZApvAh9zjpsJsdHQ3RZrWSeaCNrxpkdh4g",
  "refresh_expires_at": "2026-11-27T09:14:32.667976704Z",
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
  "session_id": "f5bec9ac-2650-4c9c-8395-af9016c1d856",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NzMsImlhdCI6MTc5MzE3ODg3MywianRpIjoiMDIxNmI0MDItYjdjYy00MDNkLTljZTAtOWExZDljZDYwNTcxIiwic2lkIjoiZjViZWM5YWMtMjY1MC00YzljLTgzOTUtYWY5MDE2YzFkODU2In0.E3Ng-2E0NqSl1qVyPiy9OsMmH-EXWJ5AQ4ziw9LqrC0",
  "access_expires_at": "2026-10-28T09:29:33.013681916Z",
  "refresh_token": "8Rn4UtpN_JhbbLyoKfo3wFVn0IIITJ-9ywCmJGnwmD4",
  "refresh_expires_at": "2026-10-28T21:14:33.013300819Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631583543` → **200**

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
  "correlation_id": "1988f7d0-450c-44c3-b643-d65fe189f990"
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
  "session_id": "4627d40e-e372-4825-8cb5-3d2ac85e05ab",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NzMsImlhdCI6MTc5MzE3ODg3MywianRpIjoiZWMxYWJlOGEtMDkwYS00NzU3LWIxODQtYjFiMzFiYmUzMTIzIiwic2lkIjoiNDYyN2Q0MGUtZTM3Mi00ODI1LThjYjUtM2QyYWM4NWUwNWFiIn0.rhDR4T3BlqIKwgflee1yuPdyzwypWhwYJIS15O4Kxz0",
  "access_expires_at": "2026-10-28T09:29:33.315314184Z",
  "refresh_token": "L-bj8ETYcoru5QlVmiWUVSD2rLLCvIeManOzFmzrfz0",
  "refresh_expires_at": "2026-10-28T21:14:33.314918315Z",
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
  "command_id": "55dfd0cb-511e-483e-8b28-232f8e4c4230",
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
  "changed_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T09:14:33.382549755Z"
}
```

## The rider books the airport for 2026-10-28T12:14:33Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600559150",
  "device_ref": "sandbox-25442"
}
```

```json
{
  "challenge_id": "0513032b-3010-412e-b0ff-206d3b3b7445",
  "expires_at": "2026-10-28T09:19:33.412830791Z",
  "resend_available_at": "2026-10-28T09:14:34.412830791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600559150` → **200**

```json
{
  "phone": "+48600559150",
  "audience": "CLIENT",
  "code": "613245",
  "sent_at": "2026-10-28T09:14:33.4146048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0513032b-3010-412e-b0ff-206d3b3b7445",
  "code": "613245",
  "device_ref": "sandbox-25442"
}
```

```json
{
  "session_id": "c419ae5c-5dcb-4b16-998d-8feeecaf8960",
  "subject": {
    "type": "CLIENT",
    "id": "773fdd9b-96d1-4b14-9f39-ff6ca3e4084b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzNmZGQ5Yi05NmQxLTRiMTQtOWYzOS1mZjZjYTNlNDA4NGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5NzczLCJpYXQiOjE3OTMxNzg4NzMsImp0aSI6IjQzNjBkYzdhLWJkMDEtNDJhZS1hOWY2LTVjZTVhYjYwZjQwOCIsInNpZCI6ImM0MTlhZTVjLTVkY2ItNGIxNi05OThkLThmZWVlY2FmODk2MCJ9.Yp1kzVuF9nX9vP1wrUingYtCtcLpcRhyZpE0aq7dxAc",
  "access_expires_at": "2026-10-28T09:29:33.465958193Z",
  "refresh_token": "fCV_XaBGXW4VIAWXF7KLmfn77T9iRqS5eZF4DVDDzXc",
  "refresh_expires_at": "2026-11-27T09:14:33.465503826Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82efde42-6f5e-4645-9abc-47d3d0e085f6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T12:14:33Z"
}
```

```json
{
  "id": "24239959-33ad-4885-aa78-f42ff1b2c987",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-28T09:19:33.500846Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T12:14:33Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f59694a0-f8ea-4968-a4d7-781274fa994d",
  "quote_id": "24239959-33ad-4885-aa78-f42ff1b2c987",
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
  "pickup_at": "2026-10-28T12:14:33Z"
}
```

```json
{
  "id": "e79034d0-f9a1-4da7-ac8c-faee78944086",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "773fdd9b-96d1-4b14-9f39-ff6ca3e4084b",
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
  "created_at": "2026-10-28T09:14:33.540067Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T12:14:33Z",
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
  "device_ref": "sandbox-8707"
}
```

```json
{
  "challenge_id": "57fd5127-6cc1-4f19-86e9-d2f53f603b5a",
  "expires_at": "2026-10-28T09:19:33.572143603Z",
  "resend_available_at": "2026-10-28T09:14:34.572143603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "773210",
  "sent_at": "2026-10-28T09:14:33.574123452Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57fd5127-6cc1-4f19-86e9-d2f53f603b5a",
  "code": "773210",
  "device_ref": "sandbox-8707"
}
```

```json
{
  "session_id": "46f31bd7-df7e-4735-bade-2801cd62e1a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc3MywiaWF0IjoxNzkzMTc4ODczLCJqdGkiOiJmYjhkZjA2OS02YTgyLTRjZTgtYTQxNS1lN2YzYjk5MjY2MWYiLCJzaWQiOiI0NmYzMWJkNy1kZjdlLTQ3MzUtYmFkZS0yODAxY2Q2MmUxYTcifQ.gCrca7r2zcMhmBGUjrHzzFUEsNbUJFf8qaFzBhXN9tc",
  "access_expires_at": "2026-10-28T09:29:33.647664262Z",
  "refresh_token": "ZPPSuBF7kYnJ5CRaOZQOUD-q6dgvebbSLlzwe2YHv7w",
  "refresh_expires_at": "2026-11-27T09:14:33.646633499Z",
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
  "command_id": "d81d5572-4bd8-4d71-b301-e7f7e29cd9c5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:33Z",
    "sequence": 1793178873712
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "d3539c91-f1e9-4ff2-966a-c8d6a686e331",
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
  "last_heartbeat_at": "2026-10-28T09:14:33.728871Z",
  "last_location_at": "2026-10-28T09:14:33.728871Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "e79034d0-f9a1-4da7-ac8c-faee78944086",
      "short_number": 17,
      "pickup_at": "2026-10-28T12:14:33Z",
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

`POST /api/driver/v1/preorders/e79034d0-f9a1-4da7-ac8c-faee78944086/reserve` → **200**

```json
{
  "command_id": "41e5d785-5551-4c25-a041-3ad8d646a19d"
}
```

```json
{
  "id": "eddefcee-18e5-4a09-8521-4346cd5e691e",
  "state": "RESERVED",
  "order": {
    "order_id": "e79034d0-f9a1-4da7-ac8c-faee78944086",
    "short_number": 17,
    "pickup_at": "2026-10-28T12:14:33Z",
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
  "reserved_at": "2026-10-28T09:14:33.789859Z",
  "confirm_from": "2026-10-28T11:44:33Z",
  "confirm_until": "2026-10-28T11:54:33Z",
  "drop_until": "2026-10-28T11:14:33Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "eddefcee-18e5-4a09-8521-4346cd5e691e",
      "state": "RESERVED",
      "order": {
        "order_id": "e79034d0-f9a1-4da7-ac8c-faee78944086",
        "short_number": 17,
        "pickup_at": "2026-10-28T12:14:33Z",
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
      "reserved_at": "2026-10-28T09:14:33.789859Z",
      "confirm_from": "2026-10-28T11:44:33Z",
      "confirm_until": "2026-10-28T11:54:33Z",
      "drop_until": "2026-10-28T11:14:33Z"
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
      "id": "eddefcee-18e5-4a09-8521-4346cd5e691e",
      "state": "RESERVED",
      "order": {
        "order_id": "e79034d0-f9a1-4da7-ac8c-faee78944086",
        "short_number": 17,
        "pickup_at": "2026-10-28T12:14:33Z",
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
      "reserved_at": "2026-10-28T09:14:33.789859Z",
      "confirm_from": "2026-10-28T11:44:33Z",
      "confirm_until": "2026-10-28T11:54:33Z",
      "drop_until": "2026-10-28T11:14:33Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/eddefcee-18e5-4a09-8521-4346cd5e691e/confirm` → **409**

```json
{
  "command_id": "05c80e05-f23f-4ccb-91a1-2823d13eaba3"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/eddefcee-18e5-4a09-8521-4346cd5e691e/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "15880b41-015a-4086-82a7-728d0cf84ef3"
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
  "session_id": "a7fb2aa4-ea43-41db-845d-1043999fbffc",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NzQsImlhdCI6MTc5MzE3ODg3NCwianRpIjoiNzFkOTQzM2EtYWRkNi00MmQxLTkxZDgtMTM1OGM1ZmNiNjg3Iiwic2lkIjoiYTdmYjJhYTQtZWE0My00MWRiLTg0NWQtMTA0Mzk5OWZiZmZjIn0.bRwvF6e68opHadbmwxjUd2EGldvgS_-tQfsFss7ORJs",
  "access_expires_at": "2026-10-28T09:29:34.106898639Z",
  "refresh_token": "dxPjScxvZwuojivWYfORn_uaMJMN7bzyPKpYU-CypnU",
  "refresh_expires_at": "2026-10-28T21:14:34.106521028Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e79034d0-f9a1-4da7-ac8c-faee78944086` → **200**

```json
{
  "id": "e79034d0-f9a1-4da7-ac8c-faee78944086",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "773fdd9b-96d1-4b14-9f39-ff6ca3e4084b",
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
  "created_at": "2026-10-28T09:14:33.540067Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T12:14:33Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "eddefcee-18e5-4a09-8521-4346cd5e691e",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T09:14:33.789859Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/e79034d0-f9a1-4da7-ac8c-faee78944086/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T09:14:33.540988Z",
      "actor": {
        "type": "CLIENT",
        "id": "773fdd9b-96d1-4b14-9f39-ff6ca3e4084b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "e79034d0-f9a1-4da7-ac8c-faee78944086",
        "preorder": true,
        "quote_id": "24239959-33ad-4885-aa78-f42ff1b2c987",
        "pickup_at": "2026-10-28T12:14:33Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "c4cdab45-70f8-48db-84e0-1c042321f33e"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T09:14:33.790758Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e79034d0-f9a1-4da7-ac8c-faee78944086",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "eddefcee-18e5-4a09-8521-4346cd5e691e"
      },
      "correlation_id": "84eda474-38d2-4481-a885-9f71ccf35658"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order e79034d0-f9a1-4da7-ac8c-faee78944086, reservation eddefcee-18e5-4a09-8521-4346cd5e691e.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24268"
}
```

```json
{
  "challenge_id": "ab2b17de-e199-4fbe-9912-fc6a5eba3f58",
  "expires_at": "2026-10-28T09:19:34.186663491Z",
  "resend_available_at": "2026-10-28T09:14:35.186663491Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "426601",
  "sent_at": "2026-10-28T09:14:34.188313456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab2b17de-e199-4fbe-9912-fc6a5eba3f58",
  "code": "426601",
  "device_ref": "sandbox-24268"
}
```

```json
{
  "session_id": "914c830d-e3f0-4d64-8141-adc74bdb35e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc3NCwiaWF0IjoxNzkzMTc4ODc0LCJqdGkiOiJiNDVmNDVhNC1lNjdhLTQ1YWMtYTFhNy00ZDZiODVmM2FhNmIiLCJzaWQiOiI5MTRjODMwZC1lM2YwLTRkNjQtODE0MS1hZGM3NGJkYjM1ZTMifQ.wlAVaK-cxM-3eJYxVFVOCOf6mEjNTsi8AfMqKWClEm0",
  "access_expires_at": "2026-10-28T09:29:34.238190904Z",
  "refresh_token": "t8onwOAK2qKI1rN4tBxWcuG-CN_MHMRKXeAOhj1oOv8",
  "refresh_expires_at": "2026-11-27T09:14:34.237853492Z",
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
  "command_id": "83420ca7-d8c9-42a7-95e9-728623150bd1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:34Z",
    "sequence": 1793178874281
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bd0f063-9d68-4b43-84d2-3a2dd0010d86",
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
  "last_heartbeat_at": "2026-10-28T09:14:34.298114Z",
  "last_location_at": "2026-10-28T09:14:34.298114Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678503229",
  "device_ref": "sandbox-28087"
}
```

```json
{
  "challenge_id": "4103e598-6f37-41b2-9c44-851814084df1",
  "expires_at": "2026-10-28T09:19:34.32380729Z",
  "resend_available_at": "2026-10-28T09:14:35.32380729Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678503229` → **200**

```json
{
  "phone": "+380678503229",
  "audience": "CLIENT",
  "code": "267049",
  "sent_at": "2026-10-28T09:14:34.325503527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4103e598-6f37-41b2-9c44-851814084df1",
  "code": "267049",
  "device_ref": "sandbox-28087"
}
```

```json
{
  "session_id": "eef7f211-5317-4f0b-b562-f3143ee5f2c8",
  "subject": {
    "type": "CLIENT",
    "id": "930871de-ea3f-404d-9c44-7fc5dfdac6e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzA4NzFkZS1lYTNmLTQwNGQtOWM0NC03ZmM1ZGZkYWM2ZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5Nzc0LCJpYXQiOjE3OTMxNzg4NzQsImp0aSI6IjA2YTQ0MDczLWZmYTAtNDUyOS1hYWM4LWQ2ODYxNDRmZjdjMyIsInNpZCI6ImVlZjdmMjExLTUzMTctNGYwYi1iNTYyLWYzMTQzZWU1ZjJjOCJ9.-TFskjV52oDzlgOS_LCTTx1qk81-11gafgFCpc61Hlw",
  "access_expires_at": "2026-10-28T09:29:34.374881277Z",
  "refresh_token": "vqYDsQ3JZ3n2UzTq180jyz1Q4AE70xg98Z4MZITF1kc",
  "refresh_expires_at": "2026-11-27T09:14:34.374550735Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4e859fa1-5843-4677-aaff-769f01a5598f",
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
  "id": "b1205de8-07ad-4670-86d6-9a373173e699",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-28T09:19:34.407094Z",
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
  "command_id": "2181de53-906a-431a-b05a-a0b4544716ef",
  "quote_id": "b1205de8-07ad-4670-86d6-9a373173e699",
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
  "id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "930871de-ea3f-404d-9c44-7fc5dfdac6e6",
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
  "created_at": "2026-10-28T09:14:34.439856Z",
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
    "id": "974bd6a6-db90-4a26-842e-9a90797e70fa",
    "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
    "expires_at": "2026-10-28T09:14:49.441849Z",
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

`POST /api/driver/v1/offers/974bd6a6-db90-4a26-842e-9a90797e70fa/accept` → **200**

```json
{
  "command_id": "88d4d713-116b-44b5-ac32-ef183716a7ad"
}
```

```json
{
  "id": "8c3e3196-17a4-4b38-b666-9840f8ac7bcb",
  "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc00ce1f-8c09-415a-958e-ffcf7f812a20",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc00ce1f-8c09-415a-958e-ffcf7f812a20",
  "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "assignment_id": "8c3e3196-17a4-4b38-b666-9840f8ac7bcb",
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

`POST /api/driver/v1/work-sessions/0bd0f063-9d68-4b43-84d2-3a2dd0010d86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:34Z",
    "sequence": 1793178874538
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bd0f063-9d68-4b43-84d2-3a2dd0010d86",
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
  "last_heartbeat_at": "2026-10-28T09:14:34.554734Z",
  "last_location_at": "2026-10-28T09:14:34.554734Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc00ce1f-8c09-415a-958e-ffcf7f812a20",
  "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "assignment_id": "8c3e3196-17a4-4b38-b666-9840f8ac7bcb",
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

`POST /api/driver/v1/trips/dc00ce1f-8c09-415a-958e-ffcf7f812a20/arrive` → **200**

```json
{
  "command_id": "17e75318-84c9-4d39-ab12-1c860a00ddfd",
  "expected_version": 0
}
```

```json
{
  "id": "dc00ce1f-8c09-415a-958e-ffcf7f812a20",
  "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "assignment_id": "8c3e3196-17a4-4b38-b666-9840f8ac7bcb",
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
  "arrived_at": "2026-10-28T09:14:34.598563Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dc00ce1f-8c09-415a-958e-ffcf7f812a20/start` → **200**

```json
{
  "command_id": "87ba27cc-7c63-4216-905b-0ee124761e6c",
  "expected_version": 1
}
```

```json
{
  "id": "dc00ce1f-8c09-415a-958e-ffcf7f812a20",
  "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "assignment_id": "8c3e3196-17a4-4b38-b666-9840f8ac7bcb",
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
  "arrived_at": "2026-10-28T09:14:34.598563Z",
  "started_at": "2026-10-28T09:14:34.626642Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/0bd0f063-9d68-4b43-84d2-3a2dd0010d86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:34Z",
    "sequence": 1793178874646
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bd0f063-9d68-4b43-84d2-3a2dd0010d86",
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
  "last_heartbeat_at": "2026-10-28T09:14:34.661969Z",
  "last_location_at": "2026-10-28T09:14:34.661969Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/dc00ce1f-8c09-415a-958e-ffcf7f812a20/complete` → **200**

```json
{
  "command_id": "04d6bafc-bdf8-4e61-a029-5eba81db1c51",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:14:34Z",
  "cash_received": true
}
```

```json
{
  "id": "dc00ce1f-8c09-415a-958e-ffcf7f812a20",
  "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "assignment_id": "8c3e3196-17a4-4b38-b666-9840f8ac7bcb",
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
  "arrived_at": "2026-10-28T09:14:34.598563Z",
  "started_at": "2026-10-28T09:14:34.626642Z",
  "completed_at": "2026-10-28T09:14:34.688782Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/01f4a0fb-0414-4e10-9512-f0adcdc42c52/rating` → **200**

```json
{
  "command_id": "61129346-d278-4886-ad35-bbde51d3fc82",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "score": 5,
  "created_at": "2026-10-28T09:14:34.728896665Z"
}
```

`POST /api/driver/v1/orders/01f4a0fb-0414-4e10-9512-f0adcdc42c52/rating` → **200**

```json
{
  "command_id": "1e063e7e-a233-4e54-8e0e-7eab47e9dcba",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
  "score": 4,
  "created_at": "2026-10-28T09:14:34.759614375Z"
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
  "session_id": "6aed13dc-2196-4e1c-9cbb-1e411a6f6200",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NzUsImlhdCI6MTc5MzE3ODg3NSwianRpIjoiZDM0N2UwYzEtZjJiYS00MWQyLWFjNjgtMTliMjEyZWZjM2NkIiwic2lkIjoiNmFlZDEzZGMtMjE5Ni00ZTFjLTljYmItMWU0MTFhNmY2MjAwIn0.2p90mAjY_DfugP47laSPDSRQkId0Ymb546q75IthQ5Y",
  "access_expires_at": "2026-10-28T09:29:35.022165991Z",
  "refresh_token": "md0DUIfgIc21i9eFS5ysEHOP5CJoQLgQDzPwpFC290A",
  "refresh_expires_at": "2026-10-28T21:14:35.021790582Z",
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
  "session_id": "91aa6b67-0820-491f-a8e5-6047353d6c3e",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NzUsImlhdCI6MTc5MzE3ODg3NSwianRpIjoiZGRlZWUxNmQtMjAxZi00YjE2LTk3OTQtZjZlNGI5NTIwYjg2Iiwic2lkIjoiOTFhYTZiNjctMDgyMC00OTFmLWE4ZTUtNjA0NzM1M2Q2YzNlIn0.wcKqWMsrdl4Sw34tuMvgWirTeZRC9PmfCi_wgAahwOQ",
  "access_expires_at": "2026-10-28T09:29:35.253016017Z",
  "refresh_token": "XyFAq1wBgCcUpiDpXT4Fp6QSbkmJgJ778AZUABzim0I",
  "refresh_expires_at": "2026-10-28T21:14:35.25268206Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/01f4a0fb-0414-4e10-9512-f0adcdc42c52/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
      "author_type": "RIDER",
      "author_id": "930871de-ea3f-404d-9c44-7fc5dfdac6e6",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T09:14:34.728897Z"
    },
    {
      "order_id": "01f4a0fb-0414-4e10-9512-f0adcdc42c52",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "930871de-ea3f-404d-9c44-7fc5dfdac6e6",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T09:14:34.759614Z"
    }
  ]
}
```

Done: ratings for order 01f4a0fb-0414-4e10-9512-f0adcdc42c52.

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
  "session_id": "708a4588-21ef-4769-886f-91ac66cef100",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3NzUsImlhdCI6MTc5MzE3ODg3NSwianRpIjoiYjNmYmE1ZDEtNTUyNS00NDkwLTk3MWYtYWU5ODFlNWNmNzQ4Iiwic2lkIjoiNzA4YTQ1ODgtMjFlZi00NzY5LTg4NmYtOTFhYzY2Y2VmMTAwIn0.vemkS8W1QasfudFQeivciuCiQMaa9VsSggihl74BghM",
  "access_expires_at": "2026-10-28T09:29:35.53193404Z",
  "refresh_token": "rZ3GOvwCjoXU5jehXTH8O6IgHosRjcNdEXEg5dEUVAk",
  "refresh_expires_at": "2026-10-28T21:14:35.531295791Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "894a2d8c-231f-4f61-b229-c92911aa985d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "b6ecb321-b01f-4aa1-aa9c-adbc7b8baf8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:14:35.638034Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b6ecb321-b01f-4aa1-aa9c-adbc7b8baf8d` → **200**

```json
{
  "id": "b6ecb321-b01f-4aa1-aa9c-adbc7b8baf8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:14:35.638034Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b6ecb321-b01f-4aa1-aa9c-adbc7b8baf8d` → **200**

```json
{
  "id": "b6ecb321-b01f-4aa1-aa9c-adbc7b8baf8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:14:35.638034Z",
  "ready_at": "2026-10-28T09:14:36.428173Z",
  "expires_at": "2026-10-29T09:14:36.428173Z"
}
```

`GET /api/admin/v1/reports/exports/b6ecb321-b01f-4aa1-aa9c-adbc7b8baf8d/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
total,17,6,11,0,0,13,4,0,15,1,0,1,5,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "630e4205-5525-4556-9b8d-1cf9df18e2c9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "7c20a0dd-5109-4488-a060-7971c5670a47",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:14:36.75404Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c20a0dd-5109-4488-a060-7971c5670a47` → **200**

```json
{
  "id": "7c20a0dd-5109-4488-a060-7971c5670a47",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:14:36.75404Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c20a0dd-5109-4488-a060-7971c5670a47` → **200**

```json
{
  "id": "7c20a0dd-5109-4488-a060-7971c5670a47",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:14:36.75404Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c20a0dd-5109-4488-a060-7971c5670a47` → **200**

```json
{
  "id": "7c20a0dd-5109-4488-a060-7971c5670a47",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:14:36.75404Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c20a0dd-5109-4488-a060-7971c5670a47` → **200**

```json
{
  "id": "7c20a0dd-5109-4488-a060-7971c5670a47",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:14:36.75404Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c20a0dd-5109-4488-a060-7971c5670a47` → **200**

```json
{
  "id": "7c20a0dd-5109-4488-a060-7971c5670a47",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T09:14:36.75404Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7c20a0dd-5109-4488-a060-7971c5670a47` → **200**

```json
{
  "id": "7c20a0dd-5109-4488-a060-7971c5670a47",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T09:14:36.75404Z",
  "ready_at": "2026-10-28T09:14:41.435028Z",
  "expires_at": "2026-10-29T09:14:41.435028Z"
}
```

`GET /api/admin/v1/reports/exports/7c20a0dd-5109-4488-a060-7971c5670a47/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/590edc31-affc-48ef-8eeb-04df22d86556` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/590edc31-affc-48ef-8eeb-04df22d86556",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7a1582a3-ec44-47bb-9dfa-259be17a7940"
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
  "device_ref": "sandbox-13481"
}
```

```json
{
  "challenge_id": "8d7955e9-b6a0-4ff9-88ba-c045ce64d309",
  "expires_at": "2026-10-28T09:19:41.987579052Z",
  "resend_available_at": "2026-10-28T09:14:42.987579052Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "208934",
  "sent_at": "2026-10-28T09:14:41.989910191Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d7955e9-b6a0-4ff9-88ba-c045ce64d309",
  "code": "208934",
  "device_ref": "sandbox-13481"
}
```

```json
{
  "session_id": "6de0427e-9039-414d-90bc-21a241c4ed88",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc4MiwiaWF0IjoxNzkzMTc4ODgyLCJqdGkiOiIxM2U5MjFkNy1iOTQ2LTQ0NzMtYWY3NC04ODI4YjBmMDg2ZTEiLCJzaWQiOiI2ZGUwNDI3ZS05MDM5LTQxNGQtOTBiYy0yMWEyNDFjNGVkODgifQ.ExBGpHQHHylUzhlaNG9Z14kdntMWn10-6IgGEU1_K48",
  "access_expires_at": "2026-10-28T09:29:42.039137398Z",
  "refresh_token": "z-vkT9NfqvB1hj4wj_qOfdpnYF7ivcLi7WxBozVqWVs",
  "refresh_expires_at": "2026-11-27T09:14:42.038586268Z",
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
  "command_id": "f9756b20-3dc0-41a8-8fbb-e7f98e887912",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:42Z",
    "sequence": 1793178882105
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3e312bc9-0b43-42e0-833f-2592781ca401",
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
  "last_heartbeat_at": "2026-10-28T09:14:42.1212Z",
  "last_location_at": "2026-10-28T09:14:42.1212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "03bf7db5-662f-46b4-85d6-3415195db08b",
  "points": [
    {
      "sequence": 1793178884150,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:13:44Z"
    },
    {
      "sequence": 1793178884156,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T09:14:44Z"
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
  "session_id": "3d1bab1c-6bfb-48f0-8bf2-ce7bbd85e6bd",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3ODQsImlhdCI6MTc5MzE3ODg4NCwianRpIjoiYzUyOGExZDItZWZiMy00YWJlLWE2MjktOWU3NzU1ZTI1OTZkIiwic2lkIjoiM2QxYmFiMWMtNmJmYi00OGYwLThiZjItY2U3YmJkODVlNmJkIn0.bvkwbZ5GYPUh_Dejvn5Px2Df6MhSzg2jkviDZ86FN9s",
  "access_expires_at": "2026-10-28T09:29:44.508373081Z",
  "refresh_token": "e06WsxICeSZKfDKb0-HS4XjkaTdVecphaIghXnIv-AM",
  "refresh_expires_at": "2026-10-28T21:14:44.507983101Z",
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
      "id": "1a9cbe75-2af0-49e5-aa69-acd542c631d6",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T09:14:44Z",
        "track_point_id": "dd2e53bd-3b7e-489f-b957-ef53b076674c",
        "work_session_id": "3e312bc9-0b43-42e0-833f-2592781ca401"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T09:14:44Z",
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

`POST /api/admin/v1/driver-risk-flags/1a9cbe75-2af0-49e5-aa69-acd542c631d6/confirm` → **200**

```json
{
  "command_id": "e72c80aa-a759-40cd-9bdb-77cb243a94e4",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "1a9cbe75-2af0-49e5-aa69-acd542c631d6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T09:14:44Z",
    "track_point_id": "dd2e53bd-3b7e-489f-b957-ef53b076674c",
    "work_session_id": "3e312bc9-0b43-42e0-833f-2592781ca401"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T09:14:44Z",
  "reason": null,
  "reviewed_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "reviewed_at": "2026-10-28T09:14:45.642627Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/1a9cbe75-2af0-49e5-aa69-acd542c631d6/dismiss` → **409**

```json
{
  "command_id": "9cad7ef6-922b-43f2-bd64-cd8d259b252c",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/1a9cbe75-2af0-49e5-aa69-acd542c631d6/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "987b7f79-1668-4c18-aa21-2d89e5111f66"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "a16b05f1-0a88-4cc3-8d92-3a60df21cbb3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "769be801-95a6-46ad-bd3b-a732750fe0b4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "raised_at": "2026-10-28T09:14:45.706705Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/769be801-95a6-46ad-bd3b-a732750fe0b4/dismiss` → **200**

```json
{
  "command_id": "04f6c54a-564d-46ad-81d0-52486f96652b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "769be801-95a6-46ad-bd3b-a732750fe0b4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "raised_at": "2026-10-28T09:14:45.706705Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "reviewed_at": "2026-10-28T09:14:45.739874Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "a82a5cdd-cdd5-4df9-9553-a8d58774c2a4",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "1a9cbe75-2af0-49e5-aa69-acd542c631d6"
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
      "actor_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:14:45.777928Z"
    }
  ]
}
```

Done: flag 1a9cbe75-2af0-49e5-aa69-acd542c631d6 confirmed, suspension named it, driver reinstated.

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
  "session_id": "7f8c7b12-fa1a-4898-971b-2ca12acb08ee",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3ODYsImlhdCI6MTc5MzE3ODg4NiwianRpIjoiNGJiZDEwNDUtNzhhMC00YzZjLTkyNmMtODdiMWQ3YjhmNjRkIiwic2lkIjoiN2Y4YzdiMTItZmExYS00ODk4LTk3MWItMmNhMTJhY2IwOGVlIn0.4lKy-6PTzymjkOtYcpqLI9kvD2Fx11bdEQfwHJ3bJCE",
  "access_expires_at": "2026-10-28T09:29:46.034578022Z",
  "refresh_token": "2TeZ-Tv9sZclcC5yI15iwW9UFAUBJpvNhF1XXqCk8Jo",
  "refresh_expires_at": "2026-10-28T21:14:46.034166339Z",
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
      "actor_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:14:45.777928Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "eab46204-fc51-48fc-88a1-660dcdef3099",
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
  "session_id": "3e312bc9-0b43-42e0-833f-2592781ca401",
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
  "last_heartbeat_at": "2026-10-28T09:14:42.1212Z",
  "last_location_at": "2026-10-28T09:14:42.1212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3e312bc9-0b43-42e0-833f-2592781ca401/close` → **200**

```json
{
  "command_id": "f589eb06-f35f-4ad3-b864-bf050bbe0400",
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
  "session_id": "fd176cb4-fab2-4429-8895-81e50fe12b78",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3ODYsImlhdCI6MTc5MzE3ODg4NiwianRpIjoiZDUyYzVkYTYtMjRlYi00YTIxLThiN2ItYmRjNWVmNmE0M2YxIiwic2lkIjoiZmQxNzZjYjQtZmFiMi00NDI5LTg4OTUtODFlNTBmZTEyYjc4In0.5SqdkdcnUvsO0d3FPYDxb4KynW4CcfathiZC3lcoXrE",
  "access_expires_at": "2026-10-28T09:29:46.38413119Z",
  "refresh_token": "k7gYmxHTHJsWUnmIDMHhWsvWK2aIWP7NQAKfGf3xqUA",
  "refresh_expires_at": "2026-10-28T21:14:46.383726969Z",
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
  "command_id": "e771f09a-c91f-4d07-b878-7a2aada21d62",
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
  "changed_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:14:46.442972Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "e771f09a-c91f-4d07-b878-7a2aada21d62",
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
  "changed_by": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T09:14:46.442972Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48580918873",
  "device_ref": "sandbox-31734"
}
```

```json
{
  "challenge_id": "e63a115f-c8b8-4a38-8558-6adc52c41920",
  "expires_at": "2026-10-28T09:19:46.508609302Z",
  "resend_available_at": "2026-10-28T09:14:47.508609302Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48580918873` → **200**

```json
{
  "phone": "+48580918873",
  "audience": "CLIENT",
  "code": "223889",
  "sent_at": "2026-10-28T09:14:46.510322641Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e63a115f-c8b8-4a38-8558-6adc52c41920",
  "code": "223889",
  "device_ref": "sandbox-31734"
}
```

```json
{
  "session_id": "389a4d2a-a0c5-4133-89ab-411f8db77cbf",
  "subject": {
    "type": "CLIENT",
    "id": "2912c05e-470f-4a4f-8106-9b63c00b59c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTEyYzA1ZS00NzBmLTRhNGYtODEwNi05YjYzYzAwYjU5YzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5Nzg2LCJpYXQiOjE3OTMxNzg4ODYsImp0aSI6IjI5NjVlMzMyLWMzYTEtNDJhYi1hYzAwLWRmNjQyYWUwMWUzNCIsInNpZCI6IjM4OWE0ZDJhLWEwYzUtNDEzMy04OWFiLTQxMWY4ZGI3N2NiZiJ9.Esg4XISuI0T7mN-wbQtYKto2icdAMI9ZnJ1vfsiMBQg",
  "access_expires_at": "2026-10-28T09:29:46.557692053Z",
  "refresh_token": "D97hs2M4N2C7tyLbtgqjTIlIl8oWddAJgasN65AfT34",
  "refresh_expires_at": "2026-11-27T09:14:46.557189991Z",
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
  "correlation_id": "f63019c5-0817-4784-8f88-ad9e30c68630"
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
  "device_ref": "sandbox-28828"
}
```

```json
{
  "challenge_id": "23abee0c-3b58-4e5e-ad0a-39df0b61b19b",
  "expires_at": "2026-10-28T09:19:46.633375737Z",
  "resend_available_at": "2026-10-28T09:14:47.633375737Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "096832",
  "sent_at": "2026-10-28T09:14:46.635047268Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23abee0c-3b58-4e5e-ad0a-39df0b61b19b",
  "code": "096832",
  "device_ref": "sandbox-28828"
}
```

```json
{
  "session_id": "c9bf04bc-5d62-478c-aba3-c1ac2e199d9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc4NiwiaWF0IjoxNzkzMTc4ODg2LCJqdGkiOiI4MWY5OTcwNS01ZWZiLTQ0NTctYjNlMC1lNTU0NGI2NWE1ZTYiLCJzaWQiOiJjOWJmMDRiYy01ZDYyLTQ3OGMtYWJhMy1jMWFjMmUxOTlkOWMifQ._o0YR1wpM_SRaHtnz8RPgeOKe50nUrLzoiRHE4oawvk",
  "access_expires_at": "2026-10-28T09:29:46.682180666Z",
  "refresh_token": "FFvh-QkParna3rHIa1zmHcBrluj1h-_Ytsi7X8J8J0I",
  "refresh_expires_at": "2026-11-27T09:14:46.681768522Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "d3539c91-f1e9-4ff2-966a-c8d6a686e331",
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
  "last_heartbeat_at": "2026-10-28T09:14:33.728871Z",
  "last_location_at": "2026-10-28T09:14:33.728871Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d3539c91-f1e9-4ff2-966a-c8d6a686e331/handover` → **200**

```json
{
  "command_id": "8996cca9-7571-4e67-86b5-a548abab5cbb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "d3539c91-f1e9-4ff2-966a-c8d6a686e331",
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
  "last_heartbeat_at": "2026-10-28T09:14:33.728871Z",
  "last_location_at": "2026-10-28T09:14:33.728871Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d3539c91-f1e9-4ff2-966a-c8d6a686e331/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:46Z",
    "sequence": 1793178886791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "d3539c91-f1e9-4ff2-966a-c8d6a686e331",
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
  "last_heartbeat_at": "2026-10-28T09:14:46.808046Z",
  "last_location_at": "2026-10-28T09:14:46.808046Z",
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
  "session_id": "d3539c91-f1e9-4ff2-966a-c8d6a686e331",
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
  "last_heartbeat_at": "2026-10-28T09:14:46.808046Z",
  "last_location_at": "2026-10-28T09:14:46.808046Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d3539c91-f1e9-4ff2-966a-c8d6a686e331/close` → **200**

```json
{
  "command_id": "16aad792-8b9b-4a13-96f5-bb6cd039327e",
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
  "correlation_id": "18a0ffa8-9092-48e6-9f8d-4d6564d3cb85"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678585091",
  "device_ref": "sandbox-11629"
}
```

```json
{
  "challenge_id": "8164ea28-a288-416e-84bd-4168938ed664",
  "expires_at": "2026-10-28T09:19:46.948864835Z",
  "resend_available_at": "2026-10-28T09:14:47.948864835Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678585091` → **200**

```json
{
  "phone": "+380678585091",
  "audience": "CLIENT",
  "code": "532664",
  "sent_at": "2026-10-28T09:14:46.95049211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8164ea28-a288-416e-84bd-4168938ed664",
  "code": "532664",
  "device_ref": "sandbox-11629"
}
```

```json
{
  "session_id": "de613d05-13f3-459e-b4ad-9e68b4e3735e",
  "subject": {
    "type": "CLIENT",
    "id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NjhkODQwMC1jYmJlLTQ5YjUtYTlmMS1mYmZjNTA5OTVmZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTc5Nzg3LCJpYXQiOjE3OTMxNzg4ODcsImp0aSI6Ijg3OGZmZTE2LTI2MzgtNDMxNC1hYWI2LWVkMWIwNDA4Zjk5MyIsInNpZCI6ImRlNjEzZDA1LTEzZjMtNDU5ZS1iNGFkLTllNjhiNGUzNzM1ZSJ9.l6BdVOw8gfdvEgwwP1LSKblmkuoWyeyyF2TvZVaDI1I",
  "access_expires_at": "2026-10-28T09:29:47.001731508Z",
  "refresh_token": "2cnF3KphL3FY1NKDO5vP7nzsHMr-Qc8WwTwjCK_4AeM",
  "refresh_expires_at": "2026-11-27T09:14:47.001160969Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "83f0eed0-bfe7-4b4c-a989-a1913c23e536",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a21928c2-8339-4d92-b740-192bb8ff1610",
  "upload_path": "/api/rider/v1/uploads/a21928c2-8339-4d92-b740-192bb8ff1610",
  "expires_at": "2026-10-28T09:29:47.035066237Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/a21928c2-8339-4d92-b740-192bb8ff1610` → **200**

```json
{
  "file_id": "a21928c2-8339-4d92-b740-192bb8ff1610",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "5af304cd-2f6f-47e1-a483-0b412ab12a1f",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "a21928c2-8339-4d92-b740-192bb8ff1610"
  ]
}
```

```json
{
  "id": "8d2022d8-ef27-42f3-9288-e4c349cde5b6",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:14:47.096205Z",
  "updated_at": "2026-10-28T09:14:47.096205Z",
  "messages": [
    {
      "id": "6b6d0cb3-b849-4cab-95e2-a38d25c7bc59",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:14:47.097351Z",
      "attachments": [
        {
          "file_id": "a21928c2-8339-4d92-b740-192bb8ff1610",
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
  "session_id": "47a8437b-5d33-4e5c-8e21-298a889d06e5",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3ODcsImlhdCI6MTc5MzE3ODg4NywianRpIjoiYzcxZTg5MGItNGU2Zi00ZjQzLWJiNjMtNWI0YzkxNjFiYjJhIiwic2lkIjoiNDdhODQzN2ItNWQzMy00ZTVjLThlMjEtMjk4YTg4OWQwNmU1In0.1GWEBVwjZSxVvlW2JNRxRcpukDlB9cohKxg1hx8pyYk",
  "access_expires_at": "2026-10-28T09:29:47.343717586Z",
  "refresh_token": "zwpIzWQtNy43J8gWg2VoC_TmiYvbPYnD_nqt7xd-odE",
  "refresh_expires_at": "2026-10-28T21:14:47.343371361Z",
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
  "session_id": "b43abae7-afdb-4907-9688-f175388fd827",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3ODcsImlhdCI6MTc5MzE3ODg4NywianRpIjoiNjM1NTU4NWEtNDBhOC00ZTc2LWI1N2UtMWQ4MWIzMWE0OTNkIiwic2lkIjoiYjQzYWJhZTctYWZkYi00OTA3LTk2ODgtZjE3NTM4OGZkODI3In0.h8aZ0ndo1nuPo_y74EDpZBLOk1S_CgwxCeoorONrwZc",
  "access_expires_at": "2026-10-28T09:29:47.573444355Z",
  "refresh_token": "8hiBlX7Ge-GtAJI82V_ag9FLQE14F9fJO9ZN5TQux9k",
  "refresh_expires_at": "2026-10-28T21:14:47.573098731Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8d2022d8-ef27-42f3-9288-e4c349cde5b6/attachments/a21928c2-8339-4d92-b740-192bb8ff1610` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c84800ff-a0df-422a-ad9b-19792e96f876",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "11319ff9-9304-4c22-b9a8-8e0d428c0987",
  "upload_path": "/api/operator/v1/uploads/11319ff9-9304-4c22-b9a8-8e0d428c0987",
  "expires_at": "2026-10-28T09:29:47.616648876Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/11319ff9-9304-4c22-b9a8-8e0d428c0987` → **200**

```json
{
  "file_id": "11319ff9-9304-4c22-b9a8-8e0d428c0987",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8d2022d8-ef27-42f3-9288-e4c349cde5b6` → **200**

```json
{
  "id": "8d2022d8-ef27-42f3-9288-e4c349cde5b6",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T09:14:47.096205Z",
  "updated_at": "2026-10-28T09:14:47.096205Z",
  "messages": [
    {
      "id": "6b6d0cb3-b849-4cab-95e2-a38d25c7bc59",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:14:47.097351Z",
      "attachments": [
        {
          "file_id": "a21928c2-8339-4d92-b740-192bb8ff1610",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8d2022d8-ef27-42f3-9288-e4c349cde5b6/comments` → **200**

```json
{
  "command_id": "53372c44-ee2e-4434-8a3e-cfdb27879ade",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "11319ff9-9304-4c22-b9a8-8e0d428c0987"
  ]
}
```

```json
{
  "id": "8d2022d8-ef27-42f3-9288-e4c349cde5b6",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:14:47.096205Z",
  "updated_at": "2026-10-28T09:14:47.7024Z",
  "messages": [
    {
      "id": "6b6d0cb3-b849-4cab-95e2-a38d25c7bc59",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:14:47.097351Z",
      "attachments": [
        {
          "file_id": "a21928c2-8339-4d92-b740-192bb8ff1610",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9dedb632-7d19-4503-b71a-17084e886e13",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:14:47.702087Z",
      "attachments": [
        {
          "file_id": "11319ff9-9304-4c22-b9a8-8e0d428c0987",
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

`GET /api/rider/v1/support/cases/8d2022d8-ef27-42f3-9288-e4c349cde5b6` → **200**

```json
{
  "id": "8d2022d8-ef27-42f3-9288-e4c349cde5b6",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T09:14:47.096205Z",
  "updated_at": "2026-10-28T09:14:47.7024Z",
  "messages": [
    {
      "id": "6b6d0cb3-b849-4cab-95e2-a38d25c7bc59",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "568d8400-cbbe-49b5-a9f1-fbfc50995fdc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T09:14:47.097351Z",
      "attachments": [
        {
          "file_id": "a21928c2-8339-4d92-b740-192bb8ff1610",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9dedb632-7d19-4503-b71a-17084e886e13",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T09:14:47.702087Z",
      "attachments": [
        {
          "file_id": "11319ff9-9304-4c22-b9a8-8e0d428c0987",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8d2022d8-ef27-42f3-9288-e4c349cde5b6/attachments/11319ff9-9304-4c22-b9a8-8e0d428c0987` → **200**

Done: support case 8d2022d8-ef27-42f3-9288-e4c349cde5b6, rider attachment a21928c2-8339-4d92-b740-192bb8ff1610, operator attachment 11319ff9-9304-4c22-b9a8-8e0d428c0987.

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
  "session_id": "bedffd5b-5f71-428a-91a8-8c5c0447d5bf",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3ODcsImlhdCI6MTc5MzE3ODg4NywianRpIjoiZmEwYzE5YmEtMjZmNS00ZTM0LTk4M2ItYmUxN2UzNGZlNTcxIiwic2lkIjoiYmVkZmZkNWItNWY3MS00MjhhLTkxYTgtOGM1YzA0NDdkNWJmIn0.c8rtgd6hPFzQR_Q7poZSovffh_toD6UrZXbUF6jSedA",
  "access_expires_at": "2026-10-28T09:29:47.991007383Z",
  "refresh_token": "loMDopGbUoggIPqQUsiukAiQl470hhqg4cIgIkZlLZk",
  "refresh_expires_at": "2026-10-28T21:14:47.990670792Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24687"
}
```

```json
{
  "challenge_id": "6ad0280b-4ab2-4c5c-bb85-ec04ab1f6a3b",
  "expires_at": "2026-10-28T09:19:48.014877841Z",
  "resend_available_at": "2026-10-28T09:14:49.014877841Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "793692",
  "sent_at": "2026-10-28T09:14:48.016654565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ad0280b-4ab2-4c5c-bb85-ec04ab1f6a3b",
  "code": "793692",
  "device_ref": "sandbox-24687"
}
```

```json
{
  "session_id": "0e5af848-1d72-4d64-a179-c24e7dc946ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc4OCwiaWF0IjoxNzkzMTc4ODg4LCJqdGkiOiI2ZWE5MDgyOS1lYTQ3LTRmZjUtOGM4MC03MGNlODlmZjU4Y2MiLCJzaWQiOiIwZTVhZjg0OC0xZDcyLTRkNjQtYTE3OS1jMjRlN2RjOTQ2ZWQifQ.vJAHfUK9EgMqPJc0c2oKGobouBMh7k8JlZaQeLow_-Q",
  "access_expires_at": "2026-10-28T09:29:48.067097957Z",
  "refresh_token": "Xetqe5rvEEBjX79K9RiGvVYssHvgANFfaaKSJ7DWaYk",
  "refresh_expires_at": "2026-11-27T09:14:48.066659124Z",
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
      "actor_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T09:14:45.777928Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "88181c42-75c2-4f12-8d8a-e627a07fd15d",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T09:14:46.090816Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "a25fb397-0dd0-45a0-97ff-d2f71668456c",
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
  "device_ref": "sandbox-29636"
}
```

```json
{
  "challenge_id": "d55b3722-044c-46bc-8e4c-af1f4f124e34",
  "expires_at": "2026-10-28T09:19:48.179609842Z",
  "resend_available_at": "2026-10-28T09:14:49.179609842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "591321",
  "sent_at": "2026-10-28T09:14:48.181509945Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d55b3722-044c-46bc-8e4c-af1f4f124e34",
  "code": "591321",
  "device_ref": "sandbox-29636"
}
```

```json
{
  "session_id": "79284e12-6788-43d8-bc34-e565859abcea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE3OTc4OCwiaWF0IjoxNzkzMTc4ODg4LCJqdGkiOiJmNmIwYWIyZi00OWUwLTQ4YjEtOGI3Ny1jN2ZlNzY3Mzc4YTkiLCJzaWQiOiI3OTI4NGUxMi02Nzg4LTQzZDgtYmMzNC1lNTY1ODU5YWJjZWEifQ.9Bb-HlukIDzQlwmIGK9qC9wDtMm-FPyOCf59ueEBiW8",
  "access_expires_at": "2026-10-28T09:29:48.231438646Z",
  "refresh_token": "aRTlZqnLwUmCo1kk7knFYPY2SPOD1CNI_ekVfR7SUjY",
  "refresh_expires_at": "2026-11-27T09:14:48.231054795Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bd0f063-9d68-4b43-84d2-3a2dd0010d86",
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
  "last_heartbeat_at": "2026-10-28T09:14:34.661969Z",
  "last_location_at": "2026-10-28T09:14:34.661969Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bd0f063-9d68-4b43-84d2-3a2dd0010d86/handover` → **200**

```json
{
  "command_id": "392ee528-c5d1-4302-9b98-a159a74f6bf1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bd0f063-9d68-4b43-84d2-3a2dd0010d86",
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
  "last_heartbeat_at": "2026-10-28T09:14:34.661969Z",
  "last_location_at": "2026-10-28T09:14:34.661969Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bd0f063-9d68-4b43-84d2-3a2dd0010d86/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:48Z",
    "sequence": 1793178888308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0bd0f063-9d68-4b43-84d2-3a2dd0010d86",
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
  "last_heartbeat_at": "2026-10-28T09:14:48.323963Z",
  "last_location_at": "2026-10-28T09:14:48.323963Z",
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
  "command_id": "581898d2-a8f3-4ea3-af68-5e4863d6d5ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:48Z",
    "sequence": 1793178888366
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "88ab3854-9a32-4422-a2c0-46a12027f9fa",
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
  "last_heartbeat_at": "2026-10-28T09:14:48.382669Z",
  "last_location_at": "2026-10-28T09:14:48.382669Z",
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
  "session_id": "672fcee4-cbe7-4f08-ba5e-da1c8a9adb17",
  "subject": {
    "type": "STAFF",
    "id": "88181c42-75c2-4f12-8d8a-e627a07fd15d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODE4MWM0Mi03NWMyLTRmMTItOGQ4YS1lNjI3YTA3ZmQxNWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxNzk3ODgsImlhdCI6MTc5MzE3ODg4OCwianRpIjoiZWE5OTI4YjYtZTc5Zi00YjRkLWI3OGItODQ5MmY2ZjQ3OTAxIiwic2lkIjoiNjcyZmNlZTQtY2JlNy00ZjA4LWJhNWUtZGExYzhhOWFkYjE3In0.wYATHrjEAgTTy1Qk8NsDRpwrRf3P1QoLhXeZ3I6VSAU",
  "access_expires_at": "2026-10-28T09:29:48.617180761Z",
  "refresh_token": "hWZpfaY_Of1lrUyHvMPfoFqL6t-AVSjInqX32u8NUA4",
  "refresh_expires_at": "2026-10-28T21:14:48.616822327Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a95132ea-f0ca-41b9-aef7-342dd80f1caf",
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
  "id": "ab6a36c5-4a44-4aae-adbc-c9018468f042",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-28T09:19:48.644874Z",
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
  "command_id": "66af330d-fb92-4e93-b7d6-49798e4e7ce6",
  "quote_id": "ab6a36c5-4a44-4aae-adbc-c9018468f042",
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
  "id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
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
  "created_at": "2026-10-28T09:14:48.677575Z",
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
    "id": "60b82727-54b4-44ae-af8b-ce55de337e7a",
    "order_id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
    "expires_at": "2026-10-28T09:15:03.680793Z",
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

`POST /api/driver/v1/offers/60b82727-54b4-44ae-af8b-ce55de337e7a/accept` → **200**

```json
{
  "command_id": "0b7100bb-8ad5-4277-927f-015f806b2109"
}
```

```json
{
  "id": "e0d75faf-fcd2-410a-824c-45ec6171a02b",
  "order_id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "033d095b-5bfb-48ce-b563-f69d5b46223b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "033d095b-5bfb-48ce-b563-f69d5b46223b",
  "order_id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
  "assignment_id": "e0d75faf-fcd2-410a-824c-45ec6171a02b",
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

`POST /api/driver/v1/work-sessions/88ab3854-9a32-4422-a2c0-46a12027f9fa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T09:14:48Z",
    "sequence": 1793178888801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "88ab3854-9a32-4422-a2c0-46a12027f9fa",
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
  "last_heartbeat_at": "2026-10-28T09:14:48.81762Z",
  "last_location_at": "2026-10-28T09:14:48.81762Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/033d095b-5bfb-48ce-b563-f69d5b46223b/arrive` → **200**

```json
{
  "command_id": "b2069f18-ba3c-42ec-a216-e9d73b725026",
  "expected_version": 0
}
```

```json
{
  "id": "033d095b-5bfb-48ce-b563-f69d5b46223b",
  "order_id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
  "assignment_id": "e0d75faf-fcd2-410a-824c-45ec6171a02b",
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
  "arrived_at": "2026-10-28T09:14:48.848358Z",
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

`POST /api/driver/v1/trips/033d095b-5bfb-48ce-b563-f69d5b46223b/start` → **200**

```json
{
  "command_id": "a0e3824c-5023-4d67-941f-e40748ccbd98",
  "expected_version": 1
}
```

```json
{
  "id": "033d095b-5bfb-48ce-b563-f69d5b46223b",
  "order_id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
  "assignment_id": "e0d75faf-fcd2-410a-824c-45ec6171a02b",
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
  "arrived_at": "2026-10-28T09:14:48.848358Z",
  "started_at": "2026-10-28T09:14:48.882639Z",
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

`POST /api/driver/v1/trips/033d095b-5bfb-48ce-b563-f69d5b46223b/complete` → **200**

```json
{
  "command_id": "9f63894b-3199-4e1d-be04-00545df3dd90",
  "expected_version": 2,
  "reported_at": "2026-10-28T09:14:48Z",
  "cash_received": true
}
```

```json
{
  "id": "033d095b-5bfb-48ce-b563-f69d5b46223b",
  "order_id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
  "assignment_id": "e0d75faf-fcd2-410a-824c-45ec6171a02b",
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
  "arrived_at": "2026-10-28T09:14:48.848358Z",
  "started_at": "2026-10-28T09:14:48.882639Z",
  "completed_at": "2026-10-28T09:14:48.921198Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d7a89805-710c-44f9-8349-8f34d903ecaf` → **200**

```json
{
  "id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
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
    "id": "e0d75faf-fcd2-410a-824c-45ec6171a02b",
    "order_id": "d7a89805-710c-44f9-8349-8f34d903ecaf",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "033d095b-5bfb-48ce-b563-f69d5b46223b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T09:14:48.677575Z",
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
  "session_id": "0bd0f063-9d68-4b43-84d2-3a2dd0010d86",
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
  "last_heartbeat_at": "2026-10-28T09:14:48.323963Z",
  "last_location_at": "2026-10-28T09:14:48.323963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0bd0f063-9d68-4b43-84d2-3a2dd0010d86/close` → **200**

```json
{
  "command_id": "35b08f84-5012-4eb4-aed7-decb4c1cb0cf",
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
  "session_id": "88ab3854-9a32-4422-a2c0-46a12027f9fa",
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
  "last_heartbeat_at": "2026-10-28T09:14:48.81762Z",
  "last_location_at": "2026-10-28T09:14:48.81762Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88ab3854-9a32-4422-a2c0-46a12027f9fa/close` → **200**

```json
{
  "command_id": "d6cd8979-6e68-45ac-bb55-ccb1ad5c1801",
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

Done: terminal order d7a89805-710c-44f9-8349-8f34d903ecaf by Andrii (5a000000-0000-4000-8000-000000000403).
