# Sandbox transcript (2026-10-28T13:28:35Z, e440fbf)

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
  "correlation_id": "9a6c9f74-fde5-41a0-a487-b51ddde0a4c7"
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
  "session_id": "cc1ff060-e33c-4f52-a7e3-bce42af14fc2",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUwMjIsImlhdCI6MTc5MzE5NDEyMiwianRpIjoiZWExZTc5MTctOTE3Yy00ZTA4LWIwNTgtYmFiNTJiOGUxODYwIiwic2lkIjoiY2MxZmYwNjAtZTMzYy00ZjUyLWE3ZTMtYmNlNDJhZjE0ZmMyIn0.FZaHGHtjoZIco7s73Gr3F-_jO5XsOBwyySmt9ARym38",
  "access_expires_at": "2026-10-28T13:43:42.455038068Z",
  "refresh_token": "Bdvpahv4Xi7GJRs2Pah_m8jzkDgsK1RypyDsMct13IY",
  "refresh_expires_at": "2026-10-29T01:28:42.452927576Z",
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
  "session_id": "94c5a122-5ff4-46bb-b55a-66afce265818",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUwMjQsImlhdCI6MTc5MzE5NDEyNCwianRpIjoiNjgwY2QwNTEtNDAyYi00ODk4LWE0YWQtOTA1MTc3MDE2ODczIiwic2lkIjoiOTRjNWExMjItNWZmNC00NmJiLWI1NWEtNjZhZmNlMjY1ODE4In0.zuWGOO80KCXoBXwEmOGKhFF4Lc0wYp2wS7QICG6ZH4w",
  "access_expires_at": "2026-10-28T13:43:44.046450054Z",
  "refresh_token": "EZZX0ugp9EikNL6Tk69rpC3cWXDMaQauOVDv2cciJG8",
  "refresh_expires_at": "2026-10-29T01:28:44.045484776Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c27a5bbd-4c62-4228-9e00-232d4b5e2b7f",
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
  "id": "10c9e723-6d62-4897-b9e6-5b077be32f80",
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
  "created_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "created_at": "2026-10-28T13:28:44.358773Z",
  "updated_at": "2026-10-28T13:28:44.358773Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639477887",
  "device_ref": "sandbox-673"
}
```

```json
{
  "challenge_id": "1c80273c-784f-4cf6-8375-071a9e732c28",
  "expires_at": "2026-10-28T13:33:44.655008219Z",
  "resend_available_at": "2026-10-28T13:28:45.655008219Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639477887` → **200**

```json
{
  "phone": "+380639477887",
  "audience": "CLIENT",
  "code": "895699",
  "sent_at": "2026-10-28T13:28:44.662579031Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c80273c-784f-4cf6-8375-071a9e732c28",
  "code": "895699",
  "device_ref": "sandbox-673"
}
```

```json
{
  "session_id": "4f41a1a3-06b5-47dc-9b58-7774637de6f1",
  "subject": {
    "type": "CLIENT",
    "id": "33d8854b-3f39-4dfc-8f60-81a6c360d866"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzM2Q4ODU0Yi0zZjM5LTRkZmMtOGY2MC04MWE2YzM2MGQ4NjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MDI0LCJpYXQiOjE3OTMxOTQxMjQsImp0aSI6ImFlYmVkYTFmLTM5NDAtNDQ3My1hNWJhLTRmZTZlZDE1NzA5MyIsInNpZCI6IjRmNDFhMWEzLTA2YjUtNDdkYy05YjU4LTc3NzQ2MzdkZTZmMSJ9.lZ-abUPVoyBdMvRILAam4d2Qzwpt-5cMMWLnSbicQaI",
  "access_expires_at": "2026-10-28T13:43:44.983069323Z",
  "refresh_token": "358egqV92Wa9Gd0PibYO2xBz54mo1iMhMcPQ6FA2DPE",
  "refresh_expires_at": "2026-11-27T13:28:44.982093946Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639477887` → **200**

```json
{
  "client_id": "33d8854b-3f39-4dfc-8f60-81a6c360d866"
}
```

`POST /api/admin/v1/rider-wallets/33d8854b-3f39-4dfc-8f60-81a6c360d866/top-ups` → **201**

```json
{
  "command_id": "aeddbce5-9bd9-4e9e-9604-23fd9491c8ec",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "33d8854b-3f39-4dfc-8f60-81a6c360d866",
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
      "id": "7712415b-8ee8-437e-b2e9-e86668b27d9e",
      "at": "2026-10-28T13:28:45.546836Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "105d4dbb-217a-4594-b34c-392cd073ef9e",
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
  "id": "dd6055a5-7209-4f46-953e-751ba278ca71",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:33:45.931065Z",
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
      "id": "10c9e723-6d62-4897-b9e6-5b077be32f80",
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
  "device_ref": "sandbox-12026"
}
```

```json
{
  "challenge_id": "b7af5d22-f6f0-4d41-b02c-fcf6ce619b6c",
  "expires_at": "2026-10-28T13:33:46.244649955Z",
  "resend_available_at": "2026-10-28T13:28:47.244649955Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "115315",
  "sent_at": "2026-10-28T13:28:46.248142177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7af5d22-f6f0-4d41-b02c-fcf6ce619b6c",
  "code": "115315",
  "device_ref": "sandbox-12026"
}
```

```json
{
  "session_id": "7664b3d7-0114-48e6-8fd8-8c142c35eb39",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTAyNiwiaWF0IjoxNzkzMTk0MTI2LCJqdGkiOiI5YTgxOGVjZS03NTg5LTQ4MmMtYWNhMi1lNDMyYzA3ZTU5MzciLCJzaWQiOiI3NjY0YjNkNy0wMTE0LTQ4ZTYtOGZkOC04YzE0MmMzNWViMzkifQ.PSagoJFprVsnJkJToqZ5kVCHVfTkgNEWprotncIGKeI",
  "access_expires_at": "2026-10-28T13:43:46.55001145Z",
  "refresh_token": "SFlGAHg_Ix3enEA3u0e1CHtaLI2VYdkHv7Iv20f_LEM",
  "refresh_expires_at": "2026-11-27T13:28:46.548066727Z",
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
  "command_id": "f0218519-e9d4-496a-b75a-15f4c8fb1d7b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:28:47Z",
    "sequence": 1793194127944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77b4b3b5-59f9-4db8-b420-fe9b5a1d0eb5",
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
  "last_heartbeat_at": "2026-10-28T13:28:47.140969Z",
  "last_location_at": "2026-10-28T13:28:47.140969Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6c42566d-985b-48e1-be80-d92651284d97",
  "quote_id": "dd6055a5-7209-4f46-953e-751ba278ca71",
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
  "id": "1fb52c90-09be-4072-bbd7-81983b92d657",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "33d8854b-3f39-4dfc-8f60-81a6c360d866",
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
  "created_at": "2026-10-28T13:28:47.46925Z",
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
  "client_id": "33d8854b-3f39-4dfc-8f60-81a6c360d866",
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
      "id": "7712415b-8ee8-437e-b2e9-e86668b27d9e",
      "at": "2026-10-28T13:28:45.546836Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
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
    "id": "3109a294-9f46-4aa3-8353-613ddbad6252",
    "order_id": "1fb52c90-09be-4072-bbd7-81983b92d657",
    "expires_at": "2026-10-28T13:29:02.483716Z",
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

`POST /api/driver/v1/offers/3109a294-9f46-4aa3-8353-613ddbad6252/accept` → **200**

```json
{
  "command_id": "43593c6d-b708-4ca0-8998-17099c066c05"
}
```

```json
{
  "id": "ec4fef08-f3d2-4947-bc84-3d8ef6b309d7",
  "order_id": "1fb52c90-09be-4072-bbd7-81983b92d657",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "adea24a1-bd1e-4088-a661-3bd66e76d041",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "adea24a1-bd1e-4088-a661-3bd66e76d041",
  "order_id": "1fb52c90-09be-4072-bbd7-81983b92d657",
  "assignment_id": "ec4fef08-f3d2-4947-bc84-3d8ef6b309d7",
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

`POST /api/driver/v1/work-sessions/77b4b3b5-59f9-4db8-b420-fe9b5a1d0eb5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:28:48Z",
    "sequence": 1793194128902
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77b4b3b5-59f9-4db8-b420-fe9b5a1d0eb5",
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
  "last_heartbeat_at": "2026-10-28T13:28:48.927018Z",
  "last_location_at": "2026-10-28T13:28:48.927018Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/adea24a1-bd1e-4088-a661-3bd66e76d041/arrive` → **200**

```json
{
  "command_id": "846062ba-6bde-404c-a837-2a567eed3ba5",
  "expected_version": 0
}
```

```json
{
  "id": "adea24a1-bd1e-4088-a661-3bd66e76d041",
  "order_id": "1fb52c90-09be-4072-bbd7-81983b92d657",
  "assignment_id": "ec4fef08-f3d2-4947-bc84-3d8ef6b309d7",
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
  "arrived_at": "2026-10-28T13:28:49.212251Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/adea24a1-bd1e-4088-a661-3bd66e76d041/start` → **200**

```json
{
  "command_id": "588448a5-cd09-491c-874e-be8271f528e0",
  "expected_version": 1
}
```

```json
{
  "id": "adea24a1-bd1e-4088-a661-3bd66e76d041",
  "order_id": "1fb52c90-09be-4072-bbd7-81983b92d657",
  "assignment_id": "ec4fef08-f3d2-4947-bc84-3d8ef6b309d7",
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
  "arrived_at": "2026-10-28T13:28:49.212251Z",
  "started_at": "2026-10-28T13:28:49.507895Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/adea24a1-bd1e-4088-a661-3bd66e76d041/complete` → **200**

```json
{
  "command_id": "0d48032b-87eb-4511-9484-6252bef74752",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:28:49Z",
  "cash_received": true
}
```

```json
{
  "id": "adea24a1-bd1e-4088-a661-3bd66e76d041",
  "order_id": "1fb52c90-09be-4072-bbd7-81983b92d657",
  "assignment_id": "ec4fef08-f3d2-4947-bc84-3d8ef6b309d7",
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
  "arrived_at": "2026-10-28T13:28:49.212251Z",
  "started_at": "2026-10-28T13:28:49.507895Z",
  "completed_at": "2026-10-28T13:28:49.825426Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "33d8854b-3f39-4dfc-8f60-81a6c360d866",
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
      "id": "98222d2b-aa5a-49bf-8de4-4c73bec57ca1",
      "at": "2026-10-28T13:28:50.620481Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "1fb52c90-09be-4072-bbd7-81983b92d657"
    },
    {
      "id": "7712415b-8ee8-437e-b2e9-e86668b27d9e",
      "at": "2026-10-28T13:28:45.546836Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/10c9e723-6d62-4897-b9e6-5b077be32f80/archive` → **200**

```json
{
  "command_id": "e041323b-adb1-4e4b-8316-f8fe1c69aa8b",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "10c9e723-6d62-4897-b9e6-5b077be32f80",
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
  "created_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "created_at": "2026-10-28T13:28:44.358773Z",
  "updated_at": "2026-10-28T13:28:53.403884Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77b4b3b5-59f9-4db8-b420-fe9b5a1d0eb5",
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
  "last_heartbeat_at": "2026-10-28T13:28:48.927018Z",
  "last_location_at": "2026-10-28T13:28:48.927018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/77b4b3b5-59f9-4db8-b420-fe9b5a1d0eb5/close` → **200**

```json
{
  "command_id": "a2ff360e-e0c2-46c6-871d-123ac54b4c74",
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

Done: order 1fb52c90-09be-4072-bbd7-81983b92d657.

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
  "session_id": "6b037d98-4cd6-4d8b-95bd-e56cac97a4e8",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUwMzQsImlhdCI6MTc5MzE5NDEzNCwianRpIjoiY2M3NDMyMWYtNzU2OS00NDM0LWIwZGQtOWNmNjYwMGMzMDQxIiwic2lkIjoiNmIwMzdkOTgtNGNkNi00ZDhiLTk1YmQtZTU2Y2FjOTdhNGU4In0.qOE2X8ScGzdvz1qGl0Bj82QosWlalkL25XlASrcyqIM",
  "access_expires_at": "2026-10-28T13:43:54.546525164Z",
  "refresh_token": "vmIlBSokkwWSy7uSN-rBNTovOrbN83wM03uVDLHlr8E",
  "refresh_expires_at": "2026-10-29T01:28:54.545592757Z",
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
  "command_id": "1afdd883-1dca-4617-89e6-98fe4df8b603",
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
  "session_id": "eef6f2cb-e1a3-4cef-baab-f7cfe75cafd8",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUwMzUsImlhdCI6MTc5MzE5NDEzNSwianRpIjoiZTViN2QwZDAtYjM5YS00ZWQ0LTg2MDktZTI3Nzg3ODIyZmNlIiwic2lkIjoiZWVmNmYyY2ItZTFhMy00Y2VmLWJhYWItZjdjZmU3NWNhZmQ4In0.ZyjXVn4fIFLK6SfJMeOTcJf5UcfjsyPe83BhMVRoKmA",
  "access_expires_at": "2026-10-28T13:43:55.655479974Z",
  "refresh_token": "f3erRiWRkGGax6Bwc7agCqDQiCWvRR_7tAMMtdddGqs",
  "refresh_expires_at": "2026-10-29T01:28:55.654770282Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3165619112",
    "linkedid": "1730052700.3165619112",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674736286"
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
    "id": "1730052700.3165619112",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "7a855d14-66d2-44bf-9942-b8e3bce56cdf",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:28:55.933406Z",
      "answered_at": null,
      "ended_at": "2026-10-28T13:28:55.957024Z",
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
    "id": "1730052600.2283217747",
    "linkedid": "1730052600.2283217747",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674736286"
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
      "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:28:56.255867Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/322f5adb-a78f-4dee-92a1-184357a918a4/answer` → **200**

```json
{
  "command_id": "f39dcbe6-714d-4d2c-94d0-d8c14e9bec20"
}
```

```json
{
  "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674736286",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "order_ids": [],
  "started_at": "2026-10-28T13:28:56.255867Z",
  "answered_at": "2026-10-28T13:28:56.556126Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2283217747",
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
    "id": "1730052600.2283217747",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [],
      "started_at": "2026-10-28T13:28:56.255867Z",
      "answered_at": "2026-10-28T13:28:56.556126Z",
      "ended_at": "2026-10-28T13:28:56.869559Z",
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
      "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [],
      "started_at": "2026-10-28T13:28:56.255867Z",
      "answered_at": "2026-10-28T13:28:56.556126Z",
      "ended_at": "2026-10-28T13:28:56.869559Z",
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
      "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [],
      "started_at": "2026-10-28T13:28:56.255867Z",
      "answered_at": "2026-10-28T13:28:56.556126Z",
      "ended_at": "2026-10-28T13:28:56.869559Z",
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
      "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [],
      "started_at": "2026-10-28T13:28:56.255867Z",
      "answered_at": "2026-10-28T13:28:56.556126Z",
      "ended_at": "2026-10-28T13:28:56.869559Z",
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
      "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [],
      "started_at": "2026-10-28T13:28:56.255867Z",
      "answered_at": "2026-10-28T13:28:56.556126Z",
      "ended_at": "2026-10-28T13:28:56.869559Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:29:04.413393Z"
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
      "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [],
      "started_at": "2026-10-28T13:28:56.255867Z",
      "answered_at": "2026-10-28T13:28:56.556126Z",
      "ended_at": "2026-10-28T13:28:56.869559Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:29:04.413393Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/322f5adb-a78f-4dee-92a1-184357a918a4/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/322f5adb-a78f-4dee-92a1-184357a918a4/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=322f5adb-a78f-4dee-92a1-184357a918a4` → **200**

```json
{
  "changes": [
    {
      "id": "4aaac5f8-8075-44fd-9463-0264aa725104",
      "occurred_at": "2026-10-28T13:29:06.562975Z",
      "actor_type": "STAFF",
      "actor_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"110fa6d3-a6ab-41ea-8900-d281224d2f4b\", \"order_ids\": []}",
      "correlation_id": "be2597be-bf30-4d31-a868-fae0e16a6044"
    },
    {
      "id": "af2b0b7c-725a-4782-a5fb-b966b4c80f66",
      "occurred_at": "2026-10-28T13:29:06.529384Z",
      "actor_type": "STAFF",
      "actor_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"110fa6d3-a6ab-41ea-8900-d281224d2f4b\", \"order_ids\": []}",
      "correlation_id": "4aca9005-6902-4dee-935c-33819cf5201d"
    }
  ]
}
```

Done: call 322f5adb-a78f-4dee-92a1-184357a918a4 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2410"
}
```

```json
{
  "challenge_id": "26339721-4a16-4ba0-a438-1e88fb1ecac7",
  "expires_at": "2026-10-28T13:34:06.881250932Z",
  "resend_available_at": "2026-10-28T13:29:07.881250932Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "228993",
  "sent_at": "2026-10-28T13:29:06.885477879Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26339721-4a16-4ba0-a438-1e88fb1ecac7",
  "code": "228993",
  "device_ref": "sandbox-2410"
}
```

```json
{
  "session_id": "cd1066c9-5b1d-4e37-b127-7c228b9e87b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTA0NywiaWF0IjoxNzkzMTk0MTQ3LCJqdGkiOiJkZTQwYThmYS1iZGE0LTRkNGYtODg0NC0zNDUyZjgyNmEyY2UiLCJzaWQiOiJjZDEwNjZjOS01YjFkLTRlMzctYjEyNy03YzIyOGI5ZTg3YjcifQ.cXsF9EROE5bJDTOyE8vzRAD45eP5Lt8jk8DuuLCit9w",
  "access_expires_at": "2026-10-28T13:44:07.183191765Z",
  "refresh_token": "HqrWhPJXN9DpcbmIN04mvbI3Z4RA5mlVvDusFk5pKc8",
  "refresh_expires_at": "2026-11-27T13:29:07.182496726Z",
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
  "command_id": "9b5c0050-71a7-4a35-ac7b-21d4b598e6b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:29:07Z",
    "sequence": 1793194147712
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a69d384-e2d0-4970-9ee0-0b6bbe3aa435",
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
  "last_heartbeat_at": "2026-10-28T13:29:07.732132Z",
  "last_location_at": "2026-10-28T13:29:07.732132Z",
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
  "session_id": "0993163a-8e19-495b-8966-e83bca4bd4e8",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUwNDgsImlhdCI6MTc5MzE5NDE0OCwianRpIjoiOThhNjBhMTgtZTM0OS00MzU0LTgwN2QtZjg2YzllNWFmZWU1Iiwic2lkIjoiMDk5MzE2M2EtOGUxOS00OTViLTg5NjYtZTgzYmNhNGJkNGU4In0.LMf6MzqRovsVdGc_AhnY2paaQCq3-OTT39FwVF7YTjE",
  "access_expires_at": "2026-10-28T13:44:08.291410152Z",
  "refresh_token": "6AfAs9qczNLEj1Ej8X-lSFoTkR1u1XH5h18wOFGWzU4",
  "refresh_expires_at": "2026-10-29T01:29:08.290746966Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ac501924-f1d5-4500-bcb0-adad8e4b577d",
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
  "id": "93f66d4c-2ba3-442d-9f48-ee133087ec8f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:34:08.565296Z",
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
  "command_id": "6de664ff-4b71-4f08-8df3-954065197ab6",
  "quote_id": "93f66d4c-2ba3-442d-9f48-ee133087ec8f",
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
    "phone": "+380673489305"
  }
}
```

```json
{
  "id": "b198d373-494b-4619-8424-159c91d604fb",
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
  "created_at": "2026-10-28T13:29:08.872361Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673489305"
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
    "id": "f62b65ec-9d65-4ebf-8c7a-fe90706fcdbf",
    "order_id": "b198d373-494b-4619-8424-159c91d604fb",
    "expires_at": "2026-10-28T13:29:23.877795Z",
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

`POST /api/driver/v1/offers/f62b65ec-9d65-4ebf-8c7a-fe90706fcdbf/accept` → **200**

```json
{
  "command_id": "5179c67d-23c4-4fad-bf3f-e5be0b256b8b"
}
```

```json
{
  "id": "40d1cbb6-0b16-47b1-a6f7-89691c9a14c5",
  "order_id": "b198d373-494b-4619-8424-159c91d604fb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3080a7d3-2fd8-4861-819e-e81997fba963",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673489305` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673489305` → **200**

```json
[
  {
    "phone": "+380673489305",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:10.582849304Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673489305` → **200**

```json
[
  {
    "phone": "+380673489305",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:10.582849304Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673489305` → **200**

```json
[
  {
    "phone": "+380673489305",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:10.582849304Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3080a7d3-2fd8-4861-819e-e81997fba963",
  "order_id": "b198d373-494b-4619-8424-159c91d604fb",
  "assignment_id": "40d1cbb6-0b16-47b1-a6f7-89691c9a14c5",
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
    "phone": "+380673489305"
  }
}
```

`POST /api/driver/v1/work-sessions/8a69d384-e2d0-4970-9ee0-0b6bbe3aa435/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:29:11Z",
    "sequence": 1793194151726
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a69d384-e2d0-4970-9ee0-0b6bbe3aa435",
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
  "last_heartbeat_at": "2026-10-28T13:29:11.092612Z",
  "last_location_at": "2026-10-28T13:29:11.092612Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3080a7d3-2fd8-4861-819e-e81997fba963/arrive` → **200**

```json
{
  "command_id": "5d238ebc-0598-42f3-abcf-7219ad2c7859",
  "expected_version": 0
}
```

```json
{
  "id": "3080a7d3-2fd8-4861-819e-e81997fba963",
  "order_id": "b198d373-494b-4619-8424-159c91d604fb",
  "assignment_id": "40d1cbb6-0b16-47b1-a6f7-89691c9a14c5",
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
  "arrived_at": "2026-10-28T13:29:11.370494Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673489305"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673489305` → **200**

```json
[
  {
    "phone": "+380673489305",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:10.582849304Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673489305` → **200**

```json
[
  {
    "phone": "+380673489305",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:10.582849304Z"
  },
  {
    "phone": "+380673489305",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:12.590172471Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673489305` → **200**

```json
[
  {
    "phone": "+380673489305",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:10.582849304Z"
  },
  {
    "phone": "+380673489305",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:12.590172471Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673489305` → **200**

```json
[
  {
    "phone": "+380673489305",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:10.582849304Z"
  },
  {
    "phone": "+380673489305",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:29:12.590172471Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/3080a7d3-2fd8-4861-819e-e81997fba963/start` → **200**

```json
{
  "command_id": "4ead518c-9186-414b-bd94-a7dade7d1bb6",
  "expected_version": 1
}
```

```json
{
  "id": "3080a7d3-2fd8-4861-819e-e81997fba963",
  "order_id": "b198d373-494b-4619-8424-159c91d604fb",
  "assignment_id": "40d1cbb6-0b16-47b1-a6f7-89691c9a14c5",
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
  "arrived_at": "2026-10-28T13:29:11.370494Z",
  "started_at": "2026-10-28T13:29:12.762926Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673489305"
  }
}
```

`POST /api/driver/v1/trips/3080a7d3-2fd8-4861-819e-e81997fba963/complete` → **200**

```json
{
  "command_id": "c674b5fa-5e31-42e3-a40b-1556fbd255f3",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:29:13Z",
  "cash_received": true
}
```

```json
{
  "id": "3080a7d3-2fd8-4861-819e-e81997fba963",
  "order_id": "b198d373-494b-4619-8424-159c91d604fb",
  "assignment_id": "40d1cbb6-0b16-47b1-a6f7-89691c9a14c5",
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
  "arrived_at": "2026-10-28T13:29:11.370494Z",
  "started_at": "2026-10-28T13:29:12.762926Z",
  "completed_at": "2026-10-28T13:29:13.04372Z",
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
  "session_id": "8a69d384-e2d0-4970-9ee0-0b6bbe3aa435",
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
  "last_heartbeat_at": "2026-10-28T13:29:11.092612Z",
  "last_location_at": "2026-10-28T13:29:11.092612Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a69d384-e2d0-4970-9ee0-0b6bbe3aa435/close` → **200**

```json
{
  "command_id": "c34b35ec-dd8c-4e7a-a6bb-3c767ad375cc",
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
  "phone": "+380638800513",
  "device_ref": "sandbox-15057"
}
```

```json
{
  "challenge_id": "d135d142-197c-45fc-ad35-1cb173e57d85",
  "expires_at": "2026-10-28T13:34:13.901313995Z",
  "resend_available_at": "2026-10-28T13:29:14.901313995Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638800513` → **200**

```json
{
  "phone": "+380638800513",
  "audience": "CLIENT",
  "code": "604843",
  "sent_at": "2026-10-28T13:29:13.904642846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d135d142-197c-45fc-ad35-1cb173e57d85",
  "code": "604843",
  "device_ref": "sandbox-15057"
}
```

```json
{
  "session_id": "28bffc46-4f95-4b92-a670-33a07688cf14",
  "subject": {
    "type": "CLIENT",
    "id": "f2d871bf-a916-46d1-ae6d-9380f2342065"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMmQ4NzFiZi1hOTE2LTQ2ZDEtYWU2ZC05MzgwZjIzNDIwNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MDU0LCJpYXQiOjE3OTMxOTQxNTQsImp0aSI6IjhlMDI5MzIwLWVmYjAtNDZiYy05M2NjLWUyMTc2NzU4YzQ4ZSIsInNpZCI6IjI4YmZmYzQ2LTRmOTUtNGI5Mi1hNjcwLTMzYTA3Njg4Y2YxNCJ9.I-d5vay2DkUIO4klM-WqG9U5uIkDiJIaSfVaYvm2qvM",
  "access_expires_at": "2026-10-28T13:44:14.195232276Z",
  "refresh_token": "CRF5lJFfM8IjeBOpYyoWgwSWYA3kU7PYMadXUeAJgOw",
  "refresh_expires_at": "2026-11-27T13:29:14.194473202Z",
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
  "device_ref": "sandbox-344"
}
```

```json
{
  "challenge_id": "cee8c283-be7d-41cf-b95c-95e8e0969c69",
  "expires_at": "2026-10-28T13:34:14.740488471Z",
  "resend_available_at": "2026-10-28T13:29:15.740488471Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "237632",
  "sent_at": "2026-10-28T13:29:14.743564641Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cee8c283-be7d-41cf-b95c-95e8e0969c69",
  "code": "237632",
  "device_ref": "sandbox-344"
}
```

```json
{
  "session_id": "0284d489-4ce4-41b8-ab99-f8eafc54ac8f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTA1NSwiaWF0IjoxNzkzMTk0MTU1LCJqdGkiOiJhZTlhYzIwYy03MjRkLTQ2NzctODdiZi0yMDljOGYzMGEwMzQiLCJzaWQiOiIwMjg0ZDQ4OS00Y2U0LTQxYjgtYWI5OS1mOGVhZmM1NGFjOGYifQ.4-aN1mpSB91tGrybUwsd7-U0VQB04yTvCRFFkgJotls",
  "access_expires_at": "2026-10-28T13:44:15.033380252Z",
  "refresh_token": "FP3nnGOuJA2ccDsa6CSvY1XI-n688-h_9w8ejFORIgQ",
  "refresh_expires_at": "2026-11-27T13:29:15.032711205Z",
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
  "session_id": "5810f818-d514-4af4-a635-547bf4eae5d1",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUwNTUsImlhdCI6MTc5MzE5NDE1NSwianRpIjoiZTQ4OThiNGMtNDUwNi00NjFjLWEzZWYtNzliNmZkNzlhYmEzIiwic2lkIjoiNTgxMGY4MTgtZDUxNC00YWY0LWE2MzUtNTQ3YmY0ZWFlNWQxIn0.AmCvWKPc_TI0xgOTNMIuwSiBnbgwEbRkYYf6N9xWbG4",
  "access_expires_at": "2026-10-28T13:44:15.847231666Z",
  "refresh_token": "JFiUdU4Vpx2dvIH4r5tilLjFi813qVzWrsdzodg8-Pw",
  "refresh_expires_at": "2026-10-29T01:29:15.846574432Z",
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
  "session_id": "cfcc06df-631d-4f5b-846a-69d2a7c70b28",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUwNTYsImlhdCI6MTc5MzE5NDE1NiwianRpIjoiNDQxMDJiYmYtOTU0ZS00NDZjLWIyZDUtODMzNDM2Y2I3ODk1Iiwic2lkIjoiY2ZjYzA2ZGYtNjMxZC00ZjViLTg0NmEtNjlkMmE3YzcwYjI4In0.dvWgT9R3DIuJHxFH1kYvj_OSVdX2qHCeVyVHhaWAHHw",
  "access_expires_at": "2026-10-28T13:44:16.399904362Z",
  "refresh_token": "xKnv-XN74Uyq409hS22Sk39jvWWKyCtTqE4K85ngq0g",
  "refresh_expires_at": "2026-10-29T01:29:16.399183844Z",
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
  "command_id": "bc94fb54-b143-4ee2-b058-a5759bcc2abf",
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
  "id": "bd903b3a-de73-4096-b55d-9af27345b7a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:34:16.944731Z",
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
  "command_id": "03e46b6c-2c6d-40ab-b374-6b9cd13fc8af",
  "quote_id": "bd903b3a-de73-4096-b55d-9af27345b7a2",
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
  "id": "f30d47d1-fcad-4845-bb45-895c1bcf0460",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f2d871bf-a916-46d1-ae6d-9380f2342065",
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
  "created_at": "2026-10-28T13:29:17.248518Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f30d47d1-fcad-4845-bb45-895c1bcf0460` → **200**

```json
{
  "id": "f30d47d1-fcad-4845-bb45-895c1bcf0460",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f2d871bf-a916-46d1-ae6d-9380f2342065",
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
  "created_at": "2026-10-28T13:29:17.248518Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f30d47d1-fcad-4845-bb45-895c1bcf0460/cancel` → **200**

```json
{
  "command_id": "02d2fa54-125f-420e-94d9-c252885a3d3c",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "f30d47d1-fcad-4845-bb45-895c1bcf0460",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f2d871bf-a916-46d1-ae6d-9380f2342065",
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
  "created_at": "2026-10-28T13:29:17.248518Z",
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
  "command_id": "cc3afbbe-3fc4-49db-958a-43b5a4c9ecf9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:29:18Z",
    "sequence": 1793194158405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3852956a-7fdc-4897-ac2c-69118dce16e6",
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
  "last_heartbeat_at": "2026-10-28T13:29:18.425126Z",
  "last_location_at": "2026-10-28T13:29:18.425126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16119"
}
```

```json
{
  "challenge_id": "1bc3ba43-f7cf-4eff-a715-cc9d24dfafc5",
  "expires_at": "2026-10-28T13:34:18.691720536Z",
  "resend_available_at": "2026-10-28T13:29:19.691720536Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "099249",
  "sent_at": "2026-10-28T13:29:18.695021903Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bc3ba43-f7cf-4eff-a715-cc9d24dfafc5",
  "code": "099249",
  "device_ref": "sandbox-16119"
}
```

```json
{
  "session_id": "a4616898-e53a-48aa-8367-fa888079d542",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTA1OCwiaWF0IjoxNzkzMTk0MTU4LCJqdGkiOiJkMjdiY2JiMy00M2RkLTRhMDctOTY0Mi1hOWE5NTkwMzkxMzMiLCJzaWQiOiJhNDYxNjg5OC1lNTNhLTQ4YWEtODM2Ny1mYTg4ODA3OWQ1NDIifQ.PliKm8BgxI98z9j51X0XUJ_tDnFZ2bnPgT1NOROGUUY",
  "access_expires_at": "2026-10-28T13:44:18.988678773Z",
  "refresh_token": "bA5uvznAXRi0Sskw0yrpikxFRH9Czhzj0xAJnpR0Dag",
  "refresh_expires_at": "2026-11-27T13:29:18.988018764Z",
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
  "command_id": "af610dd9-ec3a-43fb-8f03-fe868124b64b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:29:19Z",
    "sequence": 1793194159520
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8660b51-5502-450f-b04d-be8d0b23fe8b",
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
  "last_heartbeat_at": "2026-10-28T13:29:19.539512Z",
  "last_location_at": "2026-10-28T13:29:19.539512Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4d7a0645-951a-4e13-9384-8d1ee94bae2e",
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
  "id": "5509d336-11f4-4f9d-8569-ebd409bf0405",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:34:19.826326Z",
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
  "command_id": "204b323a-7fb0-487f-b7f1-afdb07ebe2cd",
  "quote_id": "5509d336-11f4-4f9d-8569-ebd409bf0405",
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
  "id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f2d871bf-a916-46d1-ae6d-9380f2342065",
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
  "created_at": "2026-10-28T13:29:20.10515Z",
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
    "id": "4829acc8-aea8-40e3-802a-182b67083255",
    "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
    "expires_at": "2026-10-28T13:29:35.10904Z",
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

`POST /api/driver/v1/offers/4829acc8-aea8-40e3-802a-182b67083255/accept` → **200**

```json
{
  "command_id": "ad07db01-c619-4f90-9597-248947dcd8ef"
}
```

```json
{
  "id": "cd91c96c-0c10-4a7c-8dd6-70208bd8d948",
  "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7c6bf552-9d4f-475b-86aa-7f39e07d8cd0",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c6bf552-9d4f-475b-86aa-7f39e07d8cd0",
  "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
  "assignment_id": "cd91c96c-0c10-4a7c-8dd6-70208bd8d948",
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

`POST /api/driver/v1/trips/7c6bf552-9d4f-475b-86aa-7f39e07d8cd0/cancel` → **200**

```json
{
  "command_id": "2c59a727-de69-46bf-945c-5af3d2fa992a",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "7c6bf552-9d4f-475b-86aa-7f39e07d8cd0",
  "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
  "assignment_id": "cd91c96c-0c10-4a7c-8dd6-70208bd8d948",
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

`GET /api/rider/v1/orders/75157ffd-b52c-47d2-b36c-0cd6448c971c` → **200**

```json
{
  "id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f2d871bf-a916-46d1-ae6d-9380f2342065",
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
    "id": "cd91c96c-0c10-4a7c-8dd6-70208bd8d948",
    "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7c6bf552-9d4f-475b-86aa-7f39e07d8cd0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:29:20.10515Z",
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
    "id": "f9cac1a1-1637-469e-9395-9bb1e9528d50",
    "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
    "expires_at": "2026-10-28T13:29:36.223919Z",
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

`POST /api/driver/v1/offers/f9cac1a1-1637-469e-9395-9bb1e9528d50/accept` → **200**

```json
{
  "command_id": "6d1a583e-0720-47a6-ae0b-2d6beb873001"
}
```

```json
{
  "id": "b719b9e8-bff0-412e-b0c8-c6eb6861a233",
  "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "20bc66b1-2564-46d7-bf6c-2fe754739527",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "20bc66b1-2564-46d7-bf6c-2fe754739527",
  "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
  "assignment_id": "b719b9e8-bff0-412e-b0c8-c6eb6861a233",
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

`POST /api/driver/v1/trips/20bc66b1-2564-46d7-bf6c-2fe754739527/cancel` → **200**

```json
{
  "command_id": "4039576d-1b88-4aae-bee6-1f7972c1d609",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "20bc66b1-2564-46d7-bf6c-2fe754739527",
  "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
  "assignment_id": "b719b9e8-bff0-412e-b0c8-c6eb6861a233",
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
    "id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:29:20.10515Z",
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
    "id": "f30d47d1-fcad-4845-bb45-895c1bcf0460",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:29:17.248518Z",
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

`GET /api/operator/v1/orders/75157ffd-b52c-47d2-b36c-0cd6448c971c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:29:20.10583Z",
      "actor": {
        "type": "CLIENT",
        "id": "f2d871bf-a916-46d1-ae6d-9380f2342065",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
        "quote_id": "5509d336-11f4-4f9d-8569-ebd409bf0405",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "fdfc007b-ae61-4cf7-a6dd-7433d1720b16"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:29:20.108043Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
        "attempt_id": "aa5a0321-2b76-4e8b-b09e-ac5d95640e8b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "fdfc007b-ae61-4cf7-a6dd-7433d1720b16"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:29:20.115782Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4829acc8-aea8-40e3-802a-182b67083255",
        "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "fdfc007b-ae61-4cf7-a6dd-7433d1720b16"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:29:20.665798Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4829acc8-aea8-40e3-802a-182b67083255",
        "order_id": "75157ffd-b52c-47d2-b36c-0cd6448c971c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "cd91c96c-0c10-4a7c-8dd6-70208bd8d948"
      },
      "correlation_id": "0b7a5ce2-519f-4720-8008-8a430b4c7b74"
```

Done: orders f30d47d1-fcad-4845-bb45-895c1bcf0460, 75157ffd-b52c-47d2-b36c-0cd6448c971c.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736827085",
  "device_ref": "sandbox-16936"
}
```

```json
{
  "challenge_id": "2f14dd72-56ca-418f-9f21-ce454f69cf8b",
  "expires_at": "2026-10-28T13:34:23.443044199Z",
  "resend_available_at": "2026-10-28T13:29:24.443044199Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380736827085` → **200**

```json
{
  "phone": "+380736827085",
  "audience": "CLIENT",
  "code": "453954",
  "sent_at": "2026-10-28T13:29:23.445834868Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f14dd72-56ca-418f-9f21-ce454f69cf8b",
  "code": "453954",
  "device_ref": "sandbox-16936"
}
```

```json
{
  "session_id": "94d1c8a5-5ee1-4ef8-b9a9-da2981dc5e61",
  "subject": {
    "type": "CLIENT",
    "id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGMyNzE0Yi00NWJkLTQwOWQtYTI1MS03NDZhN2YxYzRlYTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MDYzLCJpYXQiOjE3OTMxOTQxNjMsImp0aSI6ImE3MjAyNGIzLTQzYmItNDIxMi1hMmFkLWVjZDc5M2I0ODFjYSIsInNpZCI6Ijk0ZDFjOGE1LTVlZTEtNGVmOC1iOWE5LWRhMjk4MWRjNWU2MSJ9.fQvIhFTpVhAck0aCk7MmiDwCuENsj8SHZ0dLtBlWgnw",
  "access_expires_at": "2026-10-28T13:44:23.743051978Z",
  "refresh_token": "zbi1b92ddmvjINbmcvoGHgaSosDFN8Li83mu4BEUzjc",
  "refresh_expires_at": "2026-11-27T13:29:23.74244127Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "07933a86-5a4a-4e80-9cb7-374667873fd2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b2b18c04-852d-4a4f-bc7d-6242557939df",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b2b18c04-852d-4a4f-bc7d-6242557939df",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1e67ca4d717ae2418892255ac00fdcb9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b2b18c04-852d-4a4f-bc7d-6242557939df",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736827085"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b2b18c04-852d-4a4f-bc7d-6242557939df",
  "expires_at": "2026-10-28T13:59:24.010393Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b2b18c04-852d-4a4f-bc7d-6242557939df` → **200**

```json
{
  "id": "b2b18c04-852d-4a4f-bc7d-6242557939df",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T13:59:24.010393Z",
  "card": {
    "id": "26a14719-ac47-4932-8bed-151094f8593d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0657",
    "card_type": "Visa",
    "created_at": "2026-10-28T13:29:24.293111Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "26a14719-ac47-4932-8bed-151094f8593d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0657",
      "card_type": "Visa",
      "created_at": "2026-10-28T13:29:24.293111Z"
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
  "device_ref": "sandbox-20081"
}
```

```json
{
  "challenge_id": "683fdc17-bfe7-43c6-b0c8-82753354c02d",
  "expires_at": "2026-10-28T13:34:24.842270218Z",
  "resend_available_at": "2026-10-28T13:29:25.842270218Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "980311",
  "sent_at": "2026-10-28T13:29:24.845408443Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "683fdc17-bfe7-43c6-b0c8-82753354c02d",
  "code": "980311",
  "device_ref": "sandbox-20081"
}
```

```json
{
  "session_id": "e1904e33-adf2-426e-a91c-5ea24e41d3b0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTA2NSwiaWF0IjoxNzkzMTk0MTY1LCJqdGkiOiJmOGZlMjRiMC0yZGNhLTQzZjYtYTQ3MC01N2NkY2IxZjJhMTUiLCJzaWQiOiJlMTkwNGUzMy1hZGYyLTQyNmUtYTkxYy01ZWEyNGU0MWQzYjAifQ.Yj55QSuU1UdttFHc-i18g0IW7KI7hRuSibJOQceD6Fw",
  "access_expires_at": "2026-10-28T13:44:25.134777377Z",
  "refresh_token": "V05TVXUShxbfNo8O_Yaxs7mrlxOZxPjTZ_Po2sS8Q8k",
  "refresh_expires_at": "2026-11-27T13:29:25.134216453Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8660b51-5502-450f-b04d-be8d0b23fe8b",
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
  "last_heartbeat_at": "2026-10-28T13:29:19.539512Z",
  "last_location_at": "2026-10-28T13:29:19.539512Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8660b51-5502-450f-b04d-be8d0b23fe8b/handover` → **200**

```json
{
  "command_id": "60ce6e03-3ca2-4b32-8ee8-ddbaac8684e4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8660b51-5502-450f-b04d-be8d0b23fe8b",
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
  "last_heartbeat_at": "2026-10-28T13:29:19.539512Z",
  "last_location_at": "2026-10-28T13:29:19.539512Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8660b51-5502-450f-b04d-be8d0b23fe8b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:29:25Z",
    "sequence": 1793194165952
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8660b51-5502-450f-b04d-be8d0b23fe8b",
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
  "last_heartbeat_at": "2026-10-28T13:29:25.97175Z",
  "last_location_at": "2026-10-28T13:29:25.97175Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cfb455dc-f616-40de-9e57-3aebfb81666f",
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
  "id": "16850d7a-ccd0-48b4-ab93-e2177eff8562",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:34:26.256521Z",
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
  "command_id": "fcb1aa89-74b4-41b5-b372-dddb7704b761",
  "quote_id": "16850d7a-ccd0-48b4-ab93-e2177eff8562",
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
  "id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
  "created_at": "2026-10-28T13:29:26.537589Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6` → **200**

```json
{
  "id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
  "created_at": "2026-10-28T13:29:26.537589Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6` → **200**

```json
{
  "id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
  "created_at": "2026-10-28T13:29:26.537589Z",
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
    "id": "5aec7387-0393-4e29-bbf4-c30922f98350",
    "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
    "expires_at": "2026-10-28T13:29:41.858451Z",
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

`POST /api/driver/v1/offers/5aec7387-0393-4e29-bbf4-c30922f98350/accept` → **200**

```json
{
  "command_id": "373ac08d-ac55-4e27-a4fc-d001e0ebdc4d"
}
```

```json
{
  "id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "assignment_id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
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

`POST /api/driver/v1/work-sessions/e8660b51-5502-450f-b04d-be8d0b23fe8b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:29:29Z",
    "sequence": 1793194169189
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8660b51-5502-450f-b04d-be8d0b23fe8b",
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
  "last_heartbeat_at": "2026-10-28T13:29:29.209341Z",
  "last_location_at": "2026-10-28T13:29:29.209341Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/25030c40-09b1-4272-9d92-7da1a1f34aab/arrive` → **200**

```json
{
  "command_id": "aecf6e5d-d09d-4e2b-8ef8-9afa1e79c858",
  "expected_version": 0
}
```

```json
{
  "id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "assignment_id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
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
  "arrived_at": "2026-10-28T13:29:29.485765Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/25030c40-09b1-4272-9d92-7da1a1f34aab/start` → **200**

```json
{
  "command_id": "a2512a21-18d8-409e-a500-4678d3b8e6dd",
  "expected_version": 1
}
```

```json
{
  "id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "assignment_id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
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
  "arrived_at": "2026-10-28T13:29:29.485765Z",
  "started_at": "2026-10-28T13:29:29.779373Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/25030c40-09b1-4272-9d92-7da1a1f34aab/complete` → **200**

```json
{
  "command_id": "e609b8e6-ebf3-4b16-b5d2-44b4c69cbb16",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:29:30Z",
  "cash_received": true
}
```

```json
{
  "id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "assignment_id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
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
  "arrived_at": "2026-10-28T13:29:29.485765Z",
  "started_at": "2026-10-28T13:29:29.779373Z",
  "completed_at": "2026-10-28T13:29:30.077466Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6` → **200**

```json
{
  "id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
    "id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
    "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:29:26.537589Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6` → **200**

```json
{
  "id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
    "id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
    "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:29:26.537589Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6` → **200**

```json
{
  "id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
    "id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
    "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:29:26.537589Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6` → **200**

```json
{
  "id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
    "id": "8a9ff2a8-9a90-4302-9b84-befd6a7477e1",
    "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "25030c40-09b1-4272-9d92-7da1a1f34aab",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:29:26.537589Z",
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
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6/tip` → **200**

```json
{
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
  "available_until": "2026-10-29T13:29:30.077466Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6/tip` → **201**

```json
{
  "command_id": "c0ee93a1-bea3-419c-93ed-87e88eb69ac5",
  "amount_minor": 2500
}
```

```json
{
  "id": "37868f13-a823-48c6-8aab-3c8e404cd36f",
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:29:35.280409Z"
}
```

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6/tip` → **200**

```json
{
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
  "available_until": "2026-10-29T13:29:30.077466Z",
  "open": false,
  "tip": {
    "id": "37868f13-a823-48c6-8aab-3c8e404cd36f",
    "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T13:29:35.280409Z"
  }
}
```

`GET /api/rider/v1/orders/617a3d96-8b04-4b2e-930f-2cd461b79fb6/tip` → **200**

```json
{
  "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
  "available_until": "2026-10-29T13:29:30.077466Z",
  "open": false,
  "tip": {
    "id": "37868f13-a823-48c6-8aab-3c8e404cd36f",
    "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:29:35.280409Z"
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
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8d63f317-7480-44c0-ae37-e647fcf84ec1",
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
  "id": "ae50a972-6fca-4c3f-9882-b2e31d16d6e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:34:37.383002Z",
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
  "session_id": "102de67e-be4e-459f-95ed-01c15db23908",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUwNzcsImlhdCI6MTc5MzE5NDE3NywianRpIjoiMjM2MzI2ZjAtYzAzYS00ODBjLWE5MmEtZTUyNDY4YmVkMGExIiwic2lkIjoiMTAyZGU2N2UtYmU0ZS00NTlmLTk1ZWQtMDFjMTVkYjIzOTA4In0.BL861wM-q5C28waHHTHSxg4hJAffh98ozlflD4lSxEo",
  "access_expires_at": "2026-10-28T13:44:37.951220945Z",
  "refresh_token": "Yp8VDew_TcCuo5KYCWycLw36BnSY6LnwXrXi7e0Slqk",
  "refresh_expires_at": "2026-10-29T01:29:37.950620596Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380736827085` → **200**

```json
{
  "client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7"
}
```

`POST /api/admin/v1/rider-wallets/8dc2714b-45bd-409d-a251-746a7f1c4ea7/top-ups` → **201**

```json
{
  "command_id": "122d3d92-3301-4484-a2b3-778cf9c4a345",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
      "id": "52a05e4f-9fda-4b2d-b91b-a7ac5f11db03",
      "at": "2026-10-28T13:29:38.489806Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3add3ebf-44e9-474f-a2ae-ed59a1eded80",
  "quote_id": "ae50a972-6fca-4c3f-9882-b2e31d16d6e4",
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
  "id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
  "created_at": "2026-10-28T13:29:38.78303Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c91c3a6e-818e-4eef-bd7d-e234980da9ea` → **200**

```json
{
  "id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
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
  "created_at": "2026-10-28T13:29:38.78303Z",
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
    "id": "0130e858-653a-459a-b7b1-f20d41671f2f",
    "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
    "expires_at": "2026-10-28T13:29:53.787905Z",
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

`POST /api/driver/v1/offers/0130e858-653a-459a-b7b1-f20d41671f2f/accept` → **200**

```json
{
  "command_id": "e0eefcab-1be2-454a-ab5c-c41dd36cf784"
}
```

```json
{
  "id": "9a31633a-e216-4fac-96ac-7fad1fe76385",
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "29c27bdf-4382-4b9f-be06-dcfc44f657bf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "29c27bdf-4382-4b9f-be06-dcfc44f657bf",
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
  "assignment_id": "9a31633a-e216-4fac-96ac-7fad1fe76385",
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

`POST /api/driver/v1/work-sessions/e8660b51-5502-450f-b04d-be8d0b23fe8b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:29:40Z",
    "sequence": 1793194180155
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8660b51-5502-450f-b04d-be8d0b23fe8b",
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
  "last_heartbeat_at": "2026-10-28T13:29:40.17459Z",
  "last_location_at": "2026-10-28T13:29:40.17459Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/29c27bdf-4382-4b9f-be06-dcfc44f657bf/arrive` → **200**

```json
{
  "command_id": "4d3a3dd2-e634-4464-8855-1c8116233553",
  "expected_version": 0
}
```

```json
{
  "id": "29c27bdf-4382-4b9f-be06-dcfc44f657bf",
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
  "assignment_id": "9a31633a-e216-4fac-96ac-7fad1fe76385",
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
  "arrived_at": "2026-10-28T13:29:40.44852Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/29c27bdf-4382-4b9f-be06-dcfc44f657bf/start` → **200**

```json
{
  "command_id": "edc7a08c-a311-4499-8b98-6b0d023eced2",
  "expected_version": 1
}
```

```json
{
  "id": "29c27bdf-4382-4b9f-be06-dcfc44f657bf",
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
  "assignment_id": "9a31633a-e216-4fac-96ac-7fad1fe76385",
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
  "arrived_at": "2026-10-28T13:29:40.44852Z",
  "started_at": "2026-10-28T13:29:40.72928Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/29c27bdf-4382-4b9f-be06-dcfc44f657bf/complete` → **200**

```json
{
  "command_id": "f2429d9c-14b8-4612-bd6b-799bdd751143",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:29:41Z",
  "cash_received": true
}
```

```json
{
  "id": "29c27bdf-4382-4b9f-be06-dcfc44f657bf",
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
  "assignment_id": "9a31633a-e216-4fac-96ac-7fad1fe76385",
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
  "arrived_at": "2026-10-28T13:29:40.44852Z",
  "started_at": "2026-10-28T13:29:40.72928Z",
  "completed_at": "2026-10-28T13:29:41.022111Z",
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
  "client_id": "8dc2714b-45bd-409d-a251-746a7f1c4ea7",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 16297,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "52a05e4f-9fda-4b2d-b91b-a7ac5f11db03",
      "at": "2026-10-28T13:29:38.489806Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
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
      "balance_minor": 16352,
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
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/c91c3a6e-818e-4eef-bd7d-e234980da9ea/tip` → **200**

```json
{
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
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
  "available_until": "2026-10-29T13:29:41.022111Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c91c3a6e-818e-4eef-bd7d-e234980da9ea/tip` → **201**

```json
{
  "command_id": "b2ee9bda-984c-46f6-af46-d3146ef40809",
  "amount_minor": 2500
}
```

```json
{
  "id": "23835d3b-f02a-4825-aebd-1a19f4ebc036",
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:29:42.356154Z"
}
```

`GET /api/rider/v1/orders/c91c3a6e-818e-4eef-bd7d-e234980da9ea/tip` → **200**

```json
{
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
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
  "available_until": "2026-10-29T13:29:41.022111Z",
  "open": false,
  "tip": {
    "id": "23835d3b-f02a-4825-aebd-1a19f4ebc036",
    "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T13:29:42.356154Z"
  }
}
```

`GET /api/rider/v1/orders/c91c3a6e-818e-4eef-bd7d-e234980da9ea/tip` → **200**

```json
{
  "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
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
  "available_until": "2026-10-29T13:29:41.022111Z",
  "open": false,
  "tip": {
    "id": "23835d3b-f02a-4825-aebd-1a19f4ebc036",
    "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:29:42.356154Z"
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
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
      "id": "88f20157-9b07-4f13-b336-89e5e21d4529",
      "at": "2026-10-28T13:29:44.052645Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "3af003d2-f2eb-41ec-be61-7e3ebcaeaf57",
      "at": "2026-10-28T13:29:42.026818Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c91c3a6e-818e-4eef-bd7d-e234980da9ea",
      "counterpart_id": null
    },
    {
      "id": "e48ed8d3-cb5e-418d-8576-b55ae3c14a54",
      "at": "2026-10-28T13:29:36.982015Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    },
    {
      "id": "bd70b6a7-25ab-4032-9d19-cfa398e3e282",
      "at": "2026-10-28T13:29:30.918491Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "617a3d96-8b04-4b2e-930f-2cd461b79fb6",
      "counterpart_id": null
    }
  ]
}
```

**Waited for ([.balances[] | select(.currency == "UAH") | .balance_minor] | add // 0) - 16352 = 2500, still 16352 — scenario stopped.**

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e8660b51-5502-450f-b04d-be8d0b23fe8b",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-28T13:29:40.17459Z",
  "last_location_at": "2026-10-28T13:29:40.17459Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e8660b51-5502-450f-b04d-be8d0b23fe8b/close` → **200**

```json
{
  "command_id": "afcd9fde-38db-445b-90d7-f41447974f9d",
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

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730581723",
  "device_ref": "sandbox-22691"
}
```

```json
{
  "challenge_id": "cdf575ca-07ef-4f94-abce-62b22e28fe9b",
  "expires_at": "2026-10-28T13:35:10.056281438Z",
  "resend_available_at": "2026-10-28T13:30:11.056281438Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730581723` → **200**

```json
{
  "phone": "+380730581723",
  "audience": "CLIENT",
  "code": "661814",
  "sent_at": "2026-10-28T13:30:10.059057623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdf575ca-07ef-4f94-abce-62b22e28fe9b",
  "code": "661814",
  "device_ref": "sandbox-22691"
}
```

```json
{
  "session_id": "a89abba6-e936-4edf-b2a0-ed6c66468f2a",
  "subject": {
    "type": "CLIENT",
    "id": "fc3b5b54-bb09-4855-afad-6035640cd4e5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzNiNWI1NC1iYjA5LTQ4NTUtYWZhZC02MDM1NjQwY2Q0ZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTEwLCJpYXQiOjE3OTMxOTQyMTAsImp0aSI6ImY5YzUwYjBjLWUwNWItNDAyYy1iNmNhLWQ1OGY5MjI4ZWUxYyIsInNpZCI6ImE4OWFiYmE2LWU5MzYtNGVkZi1iMmEwLWVkNmM2NjQ2OGYyYSJ9.2xtmGeYdZ51PtJC6nd04ddJgfKh8H-cw8s4kS2WmFiE",
  "access_expires_at": "2026-10-28T13:45:10.352107039Z",
  "refresh_token": "B1fTpVz7-bj91Kl5W29pZI-ekogOw4s_pYKeV-5WBCU",
  "refresh_expires_at": "2026-11-27T13:30:10.351400594Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "96fa48ae-4f7e-484d-97e1-a2f66832d5da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "3ee0c8f2-e754-4eaa-8a05-2e854f5cd17a",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3ee0c8f2-e754-4eaa-8a05-2e854f5cd17a",
    "orderDate": "1793194210",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "733d836ff9d136e477903026045ebadc",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3ee0c8f2-e754-4eaa-8a05-2e854f5cd17a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730581723"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3ee0c8f2-e754-4eaa-8a05-2e854f5cd17a",
  "created_at": "2026-10-28T13:30:10.624566Z",
  "expires_at": "2026-10-28T14:00:10.624566Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/3ee0c8f2-e754-4eaa-8a05-2e854f5cd17a` → **200**

```json
{
  "id": "3ee0c8f2-e754-4eaa-8a05-2e854f5cd17a",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:30:10.624566Z",
  "expires_at": "2026-10-28T14:00:10.624566Z",
  "completed_at": "2026-10-28T13:30:10.906676Z",
  "masked_pan": "41****6708",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fc3b5b54-bb09-4855-afad-6035640cd4e5",
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
      "id": "958a4b49-d3e7-4d1c-aee2-405a150e07c4",
      "at": "2026-10-28T13:30:11.108702Z",
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
  "client_id": "fc3b5b54-bb09-4855-afad-6035640cd4e5",
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
      "id": "958a4b49-d3e7-4d1c-aee2-405a150e07c4",
      "at": "2026-10-28T13:30:11.108702Z",
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
  "device_ref": "sandbox-11495"
}
```

```json
{
  "challenge_id": "dbb00e9e-517d-41f6-ab74-6573093d3042",
  "expires_at": "2026-10-28T13:35:11.74574977Z",
  "resend_available_at": "2026-10-28T13:30:12.74574977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "040628",
  "sent_at": "2026-10-28T13:30:11.748514305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbb00e9e-517d-41f6-ab74-6573093d3042",
  "code": "040628",
  "device_ref": "sandbox-11495"
}
```

```json
{
  "session_id": "3e80faec-a4dd-4090-b22c-2b1fecc608b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTExMiwiaWF0IjoxNzkzMTk0MjEyLCJqdGkiOiI2ZTdmNWUzZS1lN2VhLTRlMzgtODI0My1hOGU4ZGQ1Yjk2YjgiLCJzaWQiOiIzZTgwZmFlYy1hNGRkLTQwOTAtYjIyYy0yYjFmZWNjNjA4YjcifQ.YEtB7DDP1kPTB99y2NrbX0tWm5v_OZS3YGZPCj7TlAY",
  "access_expires_at": "2026-10-28T13:45:12.037067303Z",
  "refresh_token": "X7EiK2wEgTGhRLvgjp855lOH696ZMgfdcyJDYhdhda4",
  "refresh_expires_at": "2026-11-27T13:30:12.036310293Z",
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
  "command_id": "4d3dd293-5922-48c5-927d-d4a3a16ee9c4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "fea1d231-33ad-4d24-ae67-cfd479b5ba8f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-fea1d231-33ad-4d24-ae67-cfd479b5ba8f",
    "orderDate": "1793194212",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "0771a5f056c7b082ed3d9eb5282aba6f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=fea1d231-33ad-4d24-ae67-cfd479b5ba8f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=fea1d231-33ad-4d24-ae67-cfd479b5ba8f",
  "created_at": "2026-10-28T13:30:12.562632Z",
  "expires_at": "2026-10-28T14:00:12.562632Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/fea1d231-33ad-4d24-ae67-cfd479b5ba8f` → **200**

```json
{
  "id": "fea1d231-33ad-4d24-ae67-cfd479b5ba8f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:30:12.562632Z",
  "expires_at": "2026-10-28T14:00:12.562632Z",
  "completed_at": "2026-10-28T13:30:12.853536Z",
  "masked_pan": "41****0983",
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
      "id": "8d902b3c-3519-43bc-996c-d7978f382cc8",
      "at": "2026-10-28T13:30:13.116692Z",
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
  "command_id": "0ec8eec4-26c6-4d1e-a3d8-3db9efdf99f1",
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
  "correlation_id": "278be9ff-2195-4b45-99a4-88ace2e31837"
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
  "session_id": "be47ec66-b44d-4499-a27e-6930f2ae573a",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxMTMsImlhdCI6MTc5MzE5NDIxMywianRpIjoiYzI1ZGY2M2YtNzZkNy00MTc5LWE1YmYtNTM4MGY3OTIzNWI1Iiwic2lkIjoiYmU0N2VjNjYtYjQ0ZC00NDk5LWEyN2UtNjkzMGYyYWU1NzNhIn0.jmKE2StUrmGWY8tbFBCRTxOwvCSuriU2HXV_ouCjMZQ",
  "access_expires_at": "2026-10-28T13:45:13.992820021Z",
  "refresh_token": "qJKGdNCBTvDUrbFIxQm5BgmZHJgywbv3ynXV_dH3Hp0",
  "refresh_expires_at": "2026-10-29T01:30:13.992296796Z",
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
  "phone": "+48600335137",
  "device_ref": "sandbox-29506"
}
```

```json
{
  "challenge_id": "3d82dbde-d839-4d84-a833-657496221058",
  "expires_at": "2026-10-28T13:35:14.807816847Z",
  "resend_available_at": "2026-10-28T13:30:15.807816847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600335137` → **200**

```json
{
  "phone": "+48600335137",
  "audience": "CLIENT",
  "code": "381215",
  "sent_at": "2026-10-28T13:30:14.810128198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d82dbde-d839-4d84-a833-657496221058",
  "code": "381215",
  "device_ref": "sandbox-29506"
}
```

```json
{
  "session_id": "a65f0414-c0a7-4440-80e8-9f411d44210f",
  "subject": {
    "type": "CLIENT",
    "id": "8d0d07d2-aa74-49ff-9f70-01918df03bb0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZDBkMDdkMi1hYTc0LTQ5ZmYtOWY3MC0wMTkxOGRmMDNiYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTE1LCJpYXQiOjE3OTMxOTQyMTUsImp0aSI6ImRiOWJlOGViLTlmNjgtNDFmYy05YmMzLTJkZWM3ZjVjOWM3YyIsInNpZCI6ImE2NWYwNDE0LWMwYTctNDQ0MC04MGU4LTlmNDExZDQ0MjEwZiJ9.V4V5voZBga1kKQkGVA1vRzDWQsRbDFIPXgGUTgtQ64c",
  "access_expires_at": "2026-10-28T13:45:15.095225769Z",
  "refresh_token": "F7jSRRp819XecizuZ7WvoW2xgUCMwXta6NZnfbM2CK4",
  "refresh_expires_at": "2026-11-27T13:30:15.094699008Z",
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
  "command_id": "cbc1ea77-0383-4272-98d8-593432bebe98",
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
  "correlation_id": "12a103e0-5b69-42eb-92bb-efe03c571d0e",
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
  "command_id": "9763516f-b7ca-4213-813b-59a5db40a066",
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
  "paused_at": "2026-10-28T13:30:16.16768334Z",
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
  "command_id": "fedf055c-d5bf-42bf-a8ea-845e57c5e10d",
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
  "id": "717822d3-e7c5-4576-8347-f23a742f2c57",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:35:16.732122Z",
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
  "command_id": "16bea1b4-eb01-4dbb-8b24-90bd3690c5f3",
  "quote_id": "717822d3-e7c5-4576-8347-f23a742f2c57",
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
  "correlation_id": "65418f66-9e79-4b95-a770-29dbd99b5ea4"
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
  "paused_at": "2026-10-28T13:30:16.167683Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "613e8ab4-0531-44f6-a9a4-ec74eeaf7d6f",
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
  "command_id": "3a2cc083-8211-433b-83a9-eead07daf3b7",
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
  "command_id": "7754d07b-4fe7-452f-ade7-3dcf41dc6ff6",
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
  "id": "4a40b2ca-9d33-472c-8351-d530e38a6e5f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:35:18.390393Z",
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
  "command_id": "8c0f774a-63ec-4551-995d-170251c42b81",
  "quote_id": "4a40b2ca-9d33-472c-8351-d530e38a6e5f",
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
  "correlation_id": "971157c9-7759-478a-a08e-754dd4782ccb"
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
  "command_id": "1d9dc608-1ac5-48f7-89e7-3bc9b2a5a81c",
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
      "from": "16:00",
      "to": "17:00"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "45bbd312-0f7c-4e6a-8bba-2fc380694f66",
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
  "id": "0fa92046-52af-4733-9c6f-088e7ae397fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:35:19.500301Z",
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
  "command_id": "171593b3-75f8-48a4-9064-840ffef9a0ae",
  "quote_id": "0fa92046-52af-4733-9c6f-088e7ae397fc",
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
  "correlation_id": "c272f382-a3cf-4b37-b3c3-c7dec09077b9"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "2805a259-ce56-4ea8-9a47-efac70c3b166",
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
  "correlation_id": "730e5b3c-bc47-45e3-a1e8-b346200c659e"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "d1283279-f2b1-4a68-a969-eec203ce3713",
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
  "phone": "+380677403765",
  "device_ref": "sandbox-20980"
}
```

```json
{
  "challenge_id": "0e9efb0b-59ce-4604-945c-2480f7abe6b2",
  "expires_at": "2026-10-28T13:35:20.894029503Z",
  "resend_available_at": "2026-10-28T13:30:21.894029503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677403765` → **200**

```json
{
  "phone": "+380677403765",
  "audience": "CLIENT",
  "code": "056073",
  "sent_at": "2026-10-28T13:30:20.896200189Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e9efb0b-59ce-4604-945c-2480f7abe6b2",
  "code": "056073",
  "device_ref": "sandbox-20980"
}
```

```json
{
  "session_id": "7daa89f4-83a6-49cc-bcd1-5dcc8046c562",
  "subject": {
    "type": "CLIENT",
    "id": "738c9e9b-68c1-45a2-8af6-231083f17d2a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzhjOWU5Yi02OGMxLTQ1YTItOGFmNi0yMzEwODNmMTdkMmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTIxLCJpYXQiOjE3OTMxOTQyMjEsImp0aSI6IjUyYmJlYzZmLWFkOGQtNGUxMi1iZTk5LTkwZDIyOTk1MWQ1NSIsInNpZCI6IjdkYWE4OWY0LTgzYTYtNDljYy1iY2QxLTVkY2M4MDQ2YzU2MiJ9.S_vJKyCsuE_m3Z8IMlBsU5pNXkRxsBA4uLwgW64CcBY",
  "access_expires_at": "2026-10-28T13:45:21.176812669Z",
  "refresh_token": "-HiHQmNvjp4BbbMccX_fI6Ho3fy_MiPRkEUIVN987yk",
  "refresh_expires_at": "2026-11-27T13:30:21.176290687Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "738c9e9b-68c1-45a2-8af6-231083f17d2a",
  "session_id": "7daa89f4-83a6-49cc-bcd1-5dcc8046c562",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4c54045e-273f-4f78-8783-48df9e7b72d9",
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
  "id": "2d09a803-af1c-415c-b874-0bb44a3583a9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:35:21.691546Z",
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
  "challenge_id": "a99955cd-350f-47a9-9f33-259c6043b844",
  "expires_at": "2026-10-28T13:35:23.971328016Z",
  "resend_available_at": "2026-10-28T13:30:24.971328016Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677403765` → **200**

```json
{
  "phone": "+380677403765",
  "audience": "CLIENT",
  "code": "500919",
  "sent_at": "2026-10-28T13:30:23.973442362Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "1d4bdb1f-3bbe-46ab-be51-422bc8c989ef",
  "challenge_id": "a99955cd-350f-47a9-9f33-259c6043b844",
  "otp_code": "500919"
}
```

```json
{
  "client_id": "738c9e9b-68c1-45a2-8af6-231083f17d2a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T13:30:24.2731076Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "12e7a5a9-ffcb-4baf-8cda-2f18512a45d6",
  "quote_id": "2d09a803-af1c-415c-b874-0bb44a3583a9",
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
  "correlation_id": "760c5b79-713b-4c4d-9119-2055b3bfc6ab"
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
  "session_id": "95e66620-c390-49a8-846b-26728410d29e",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxMjUsImlhdCI6MTc5MzE5NDIyNSwianRpIjoiMzYyZDE5YTMtYTJmNy00NDNlLTkyNzQtYzFiYTg1MDk2MWVkIiwic2lkIjoiOTVlNjY2MjAtYzM5MC00OWE4LTg0NmItMjY3Mjg0MTBkMjllIn0.PXBP2-lQJ-p_t5tsneMmvFHzwSrfyjjhvjVnmkjoKmw",
  "access_expires_at": "2026-10-28T13:45:25.11264899Z",
  "refresh_token": "ToG-bFlqClx2iAe99P_fzZzz0LcD3h1AB4XcxNk-V7k",
  "refresh_expires_at": "2026-10-29T01:30:25.111913119Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "738c9e9b-68c1-45a2-8af6-231083f17d2a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T13:30:24.273108Z",
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

`POST /api/admin/v1/client-deletions/738c9e9b-68c1-45a2-8af6-231083f17d2a/complete` → **200**

```json
{
  "command_id": "965d6537-0192-4018-8154-ba3738cab856",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "738c9e9b-68c1-45a2-8af6-231083f17d2a",
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
  "correlation_id": "d02937f0-de15-4f04-b887-e7b735c399e6"
}
```

Done: client 738c9e9b-68c1-45a2-8af6-231083f17d2a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669914219",
  "device_ref": "sandbox-24160"
}
```

```json
{
  "challenge_id": "7eecbca0-7148-4cab-a948-6e993da42dee",
  "expires_at": "2026-10-28T13:35:26.205867221Z",
  "resend_available_at": "2026-10-28T13:30:27.205867221Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669914219` → **200**

```json
{
  "phone": "+380669914219",
  "audience": "CLIENT",
  "code": "818429",
  "sent_at": "2026-10-28T13:30:26.208130691Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7eecbca0-7148-4cab-a948-6e993da42dee",
  "code": "818429",
  "device_ref": "sandbox-24160"
}
```

```json
{
  "session_id": "5785084e-60c4-4b5e-8cb1-4979751632ec",
  "subject": {
    "type": "CLIENT",
    "id": "76ed4157-407f-4dd8-b56c-d3658d87da26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmVkNDE1Ny00MDdmLTRkZDgtYjU2Yy1kMzY1OGQ4N2RhMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTI2LCJpYXQiOjE3OTMxOTQyMjYsImp0aSI6IjEyYzBjMTdmLTgyYjktNGE2OC1hOWUwLTQ0NDAzNmFiMTRmMSIsInNpZCI6IjU3ODUwODRlLTYwYzQtNGI1ZS04Y2IxLTQ5Nzk3NTE2MzJlYyJ9.J_dCi5wdL-iMJlgtGb-rw9E2LBX4lSHUMqRxVBLsYkU",
  "access_expires_at": "2026-10-28T13:45:26.491529921Z",
  "refresh_token": "t8T9qKjB3cnjGD0dEATqcNLVzvhQY9ylmQeZrr7ks7I",
  "refresh_expires_at": "2026-11-27T13:30:26.490966314Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "76ed4157-407f-4dd8-b56c-d3658d87da26",
  "session_id": "5785084e-60c4-4b5e-8cb1-4979751632ec",
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
  "session_id": "f8977533-d115-4f2b-8e92-7df7e9fe43a7",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxMjcsImlhdCI6MTc5MzE5NDIyNywianRpIjoiZDcxZDRhYjAtZWRjMy00ZjZlLWE1ODctOWUwNmIzMzExYmM2Iiwic2lkIjoiZjg5Nzc1MzMtZDExNS00ZjJiLThlOTItN2RmN2U5ZmU0M2E3In0.TcitblS2PbOc9SMSxsQSb9ATfjKmRlB_jHF-o_1zpVw",
  "access_expires_at": "2026-10-28T13:45:27.305336041Z",
  "refresh_token": "P6aey2gYC_PThw2CV3bvb4xNwyNnLLgLTHonq3CGrrA",
  "refresh_expires_at": "2026-10-29T01:30:27.304740211Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9914219&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "76ed4157-407f-4dd8-b56c-d3658d87da26",
      "phone": "+380669914219",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T13:30:26.489164Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/76ed4157-407f-4dd8-b56c-d3658d87da26` → **200**

```json
{
  "client": {
    "id": "76ed4157-407f-4dd8-b56c-d3658d87da26",
    "phone": "+380669914219",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:30:26.489164Z",
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

`POST /api/admin/v1/clients/76ed4157-407f-4dd8-b56c-d3658d87da26/block` → **400**

```json
{
  "command_id": "aee1a842-0fd6-49f5-b534-652444369477",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/76ed4157-407f-4dd8-b56c-d3658d87da26/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "71857a84-d9a9-4459-aadc-815f47aff0ac",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/76ed4157-407f-4dd8-b56c-d3658d87da26/block` → **200**

```json
{
  "command_id": "0349ae01-c9fd-45cd-a34e-6e5ba76a7739",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "76ed4157-407f-4dd8-b56c-d3658d87da26",
  "phone": "+380669914219",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T13:30:26.489164Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T13:30:28.448649Z",
    "by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
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
  "correlation_id": "91869631-ae57-4df0-a077-dc46abfe771a"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669914219",
  "device_ref": "sandbox-23841"
}
```

```json
{
  "challenge_id": "5242ec3b-03db-40fb-8267-76ad8f8241f1",
  "expires_at": "2026-10-28T13:35:30.988912811Z",
  "resend_available_at": "2026-10-28T13:30:31.988912811Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669914219` → **200**

```json
{
  "phone": "+380669914219",
  "audience": "CLIENT",
  "code": "443765",
  "sent_at": "2026-10-28T13:30:30.991258414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "5242ec3b-03db-40fb-8267-76ad8f8241f1",
  "code": "443765",
  "device_ref": "sandbox-23841"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "bd0606e2-4e9b-4f7a-9001-128f094ed56d"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/76ed4157-407f-4dd8-b56c-d3658d87da26` → **200**

```json
{
  "client": {
    "id": "76ed4157-407f-4dd8-b56c-d3658d87da26",
    "phone": "+380669914219",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T13:30:26.489164Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T13:30:28.448649Z",
      "by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
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

`POST /api/admin/v1/clients/76ed4157-407f-4dd8-b56c-d3658d87da26/unblock` → **200**

```json
{
  "command_id": "be84f863-9dcc-4c0c-ac6b-7df2fc88b4b7",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "76ed4157-407f-4dd8-b56c-d3658d87da26",
  "phone": "+380669914219",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T13:30:26.489164Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669914219",
  "device_ref": "sandbox-18829"
}
```

```json
{
  "challenge_id": "2516b942-2521-4153-bc6c-3482026fc856",
  "expires_at": "2026-10-28T13:35:34.126490053Z",
  "resend_available_at": "2026-10-28T13:30:35.126490053Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669914219` → **200**

```json
{
  "phone": "+380669914219",
  "audience": "CLIENT",
  "code": "804943",
  "sent_at": "2026-10-28T13:30:34.128873289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2516b942-2521-4153-bc6c-3482026fc856",
  "code": "804943",
  "device_ref": "sandbox-18829"
}
```

```json
{
  "session_id": "170c9a17-dc7c-49b0-93ed-2386bab54921",
  "subject": {
    "type": "CLIENT",
    "id": "76ed4157-407f-4dd8-b56c-d3658d87da26"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmVkNDE1Ny00MDdmLTRkZDgtYjU2Yy1kMzY1OGQ4N2RhMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTM0LCJpYXQiOjE3OTMxOTQyMzQsImp0aSI6IjcxMzg5NmM2LTEyZmEtNGNiMi05NzI0LTE2MmVlZGNhZjg1ZCIsInNpZCI6IjE3MGM5YTE3LWRjN2MtNDliMC05M2VkLTIzODZiYWI1NDkyMSJ9.r80ZxJOLr_4E2FdHWALP7wxH9WckvuB3IKEZ1bKYM1M",
  "access_expires_at": "2026-10-28T13:45:34.43413817Z",
  "refresh_token": "y0Ie6Ykk7jFMPakeDBgZfuv95MwahY1JiK0-TbxTldA",
  "refresh_expires_at": "2026-11-27T13:30:34.433545666Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "76ed4157-407f-4dd8-b56c-d3658d87da26",
  "session_id": "170c9a17-dc7c-49b0-93ed-2386bab54921",
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
  "phone": "+380669093260",
  "device_ref": "sandbox-2978"
}
```

```json
{
  "challenge_id": "db6dedca-91d6-4d58-b46a-cfc44352267d",
  "expires_at": "2026-10-28T13:35:34.96453818Z",
  "resend_available_at": "2026-10-28T13:30:35.96453818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669093260` → **200**

```json
{
  "phone": "+380669093260",
  "audience": "CLIENT",
  "code": "997599",
  "sent_at": "2026-10-28T13:30:34.966741177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db6dedca-91d6-4d58-b46a-cfc44352267d",
  "code": "997599",
  "device_ref": "sandbox-2978"
}
```

```json
{
  "session_id": "7b354889-334f-4972-8ccb-607652438dcf",
  "subject": {
    "type": "CLIENT",
    "id": "9e3a4ea2-9088-471e-ad6a-668e9a68209f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTNhNGVhMi05MDg4LTQ3MWUtYWQ2YS02NjhlOWE2ODIwOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTM1LCJpYXQiOjE3OTMxOTQyMzUsImp0aSI6IjlkNWI0YjQ4LWMwYWMtNDJmNC1hYzc3LWFlZWJlYjAxZjg3MyIsInNpZCI6IjdiMzU0ODg5LTMzNGYtNDk3Mi04Y2NiLTYwNzY1MjQzOGRjZiJ9.LwqrVIQawLwp-ayV5HGzmBaJBidLXDLhAVrVVQcs5qo",
  "access_expires_at": "2026-10-28T13:45:35.252485578Z",
  "refresh_token": "uaxVl3mLnY2l7YKM0f6pXbVf9wRQ0kzF_2UtFrDjgkQ",
  "refresh_expires_at": "2026-11-27T13:30:35.251840386Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bea3e8b4-b7b8-4150-90fa-b1a605c4a5c4",
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
  "id": "53908620-8731-48ff-8fa7-88c80853e0c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:35:35.519500Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 00ff9683-c36e-4405-a51e-77110a029645) → **201**

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
  "session_id": "dec7ff13-978d-417b-a082-c2b53b49db20",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxMzYsImlhdCI6MTc5MzE5NDIzNiwianRpIjoiZWJlNGU5ODAtMDkxYS00MTg1LWE1YTMtYzJiY2E2MDgzYWIwIiwic2lkIjoiZGVjN2ZmMTMtOTc4ZC00MTdiLWEwODItYzJiNTNiNDlkYjIwIn0.4odqVu1ktZrtnFYi6THxVD7h3hvb7ij-FQpxRKdpxrA",
  "access_expires_at": "2026-10-28T13:45:36.129063965Z",
  "refresh_token": "aDc1QlmAHJXtS_X3JhRXB4Y4IHNZxS-dcfEOSW7EdiE",
  "refresh_expires_at": "2026-10-29T01:30:36.128467413Z",
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
  "session_id": "01057960-7ae4-48a9-8ecc-5a316df79c1a",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxMzYsImlhdCI6MTc5MzE5NDIzNiwianRpIjoiMDIzMjJiNmItOTUwMi00M2EzLWExZDItYmY1ODM0ZTRjMmE3Iiwic2lkIjoiMDEwNTc5NjAtN2FlNC00OGE5LThlY2MtNWEzMTZkZjc5YzFhIn0.rqXZTOENe9yIUqrxv3z5w-bsNQhVXYwgfZf_W6V0KkI",
  "access_expires_at": "2026-10-28T13:45:36.688035029Z",
  "refresh_token": "f3A7ekKEuFwFf07DZNPKiWQnkwBi4_0FMxLCyRGOLwI",
  "refresh_expires_at": "2026-10-29T01:30:36.687492849Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/acc0c6da-752a-4f13-be0f-de3decf5620b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:30:35.798595Z",
      "actor": {
        "type": "CLIENT",
        "id": "9e3a4ea2-9088-471e-ad6a-668e9a68209f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "acc0c6da-752a-4f13-be0f-de3decf5620b",
        "quote_id": "53908620-8731-48ff-8fa7-88c80853e0c0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "00ff9683-c36e-4405-a51e-77110a029645"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:30:35.800632Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "acc0c6da-752a-4f13-be0f-de3decf5620b",
        "attempt_id": "df4fcfce-ecbe-4471-a67e-848ac26f2992",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "00ff9683-c36e-4405-a51e-77110a029645"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T13:30:35.812964Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "acc0c6da-752a-4f13-be0f-de3decf5620b",
        "attempt_id": "df4fcfce-ecbe-4471-a67e-848ac26f2992"
      },
      "correlation_id": "00ff9683-c36e-4405-a51e-77110a029645"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "df4fcfce-ecbe-4471-a67e-848ac26f2992",
        "generation": 1,
        "started_at": "2026-10-28T13:30:35.799628Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T13:30:35.812964Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T13:30:35.801576Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/00ff9683-c36e-4405-a51e-77110a029645` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "acc0c6da-752a-4f13-be0f-de3decf5620b:0",
      "order_id": "acc0c6da-752a-4f13-be0f-de3decf5620b",
      "at": "2026-10-28T13:30:35.798595Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "acc0c6da-752a-4f13-be0f-de3decf5620b:1",
      "order_id": "acc0c6da-752a-4f13-be0f-de3decf5620b",
      "at": "2026-10-28T13:30:35.800632Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "acc0c6da-752a-4f13-be0f-de3decf5620b:2",
      "order_id": "acc0c6da-752a-4f13-be0f-de3decf5620b",
      "at": "2026-10-28T13:30:35.812964Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/600254d8-7cd5-4302-9b19-1978786731d0` → **200**

```json
{
  "found": []
}
```

Done: request 00ff9683-c36e-4405-a51e-77110a029645 — order acc0c6da-752a-4f13-be0f-de3decf5620b found by its id.

`GET /api/rider/v1/orders/acc0c6da-752a-4f13-be0f-de3decf5620b` → **200**

```json
{
  "id": "acc0c6da-752a-4f13-be0f-de3decf5620b",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e3a4ea2-9088-471e-ad6a-668e9a68209f",
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
  "created_at": "2026-10-28T13:30:35.797919Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/acc0c6da-752a-4f13-be0f-de3decf5620b/cancel` → **200**

```json
{
  "command_id": "9aaa8021-79a4-4afd-8846-fdee0e7f45fc",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "acc0c6da-752a-4f13-be0f-de3decf5620b",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9e3a4ea2-9088-471e-ad6a-668e9a68209f",
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
  "created_at": "2026-10-28T13:30:35.797919Z",
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
  "phone": "+380632654255",
  "device_ref": "sandbox-14614"
}
```

```json
{
  "challenge_id": "c606beb7-8e06-44a7-8072-bd005a87e6cc",
  "expires_at": "2026-10-28T13:35:38.383140851Z",
  "resend_available_at": "2026-10-28T13:30:39.383140851Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632654255` → **200**

```json
{
  "phone": "+380632654255",
  "audience": "CLIENT",
  "code": "277097",
  "sent_at": "2026-10-28T13:30:38.385838216Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c606beb7-8e06-44a7-8072-bd005a87e6cc",
  "code": "277097",
  "device_ref": "sandbox-14614"
}
```

```json
{
  "session_id": "ecd94c65-a4cc-46a9-bff4-3691b01d8a45",
  "subject": {
    "type": "CLIENT",
    "id": "96022580-7dae-4ae7-9210-03e061c644c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjAyMjU4MC03ZGFlLTRhZTctOTIxMC0wM2UwNjFjNjQ0YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTM4LCJpYXQiOjE3OTMxOTQyMzgsImp0aSI6IjRiYTM5NTYxLTAwYTEtNGJkOC04M2E2LTM4ODFiNjMyMGFiZCIsInNpZCI6ImVjZDk0YzY1LWE0Y2MtNDZhOS1iZmY0LTM2OTFiMDFkOGE0NSJ9.uCcK0PkoCwHDVtYrVBhKFxMEgTtHtla2dv4DweVgr84",
  "access_expires_at": "2026-10-28T13:45:38.683958344Z",
  "refresh_token": "jnHNwB5Okay5gzpGJqutgXulceCO4Fmj8AQsUSAzY7Y",
  "refresh_expires_at": "2026-11-27T13:30:38.683323429Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "419605a7-2f5e-4443-88c8-734af0a31142",
  "expires_at": "2026-10-28T13:35:40.957019478Z",
  "resend_available_at": "2026-10-28T13:30:41.957019478Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632654255` → **200**

```json
{
  "phone": "+380632654255",
  "audience": "CLIENT",
  "code": "754850",
  "sent_at": "2026-10-28T13:30:40.959010741Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "85b7dccd-dd7d-4982-8863-06447bf3677d",
  "challenge_id": "419605a7-2f5e-4443-88c8-734af0a31142",
  "otp_code": "754850"
}
```

```json
{
  "id": "49f96c0f-ee14-4643-b24f-dc347f78c980",
  "state": "PENDING",
  "created_at": "2026-10-28T13:30:41.250976Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/49f96c0f-ee14-4643-b24f-dc347f78c980` → **200**

```json
{
  "id": "49f96c0f-ee14-4643-b24f-dc347f78c980",
  "state": "PENDING",
  "created_at": "2026-10-28T13:30:41.250976Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/49f96c0f-ee14-4643-b24f-dc347f78c980` → **200**

```json
{
  "id": "49f96c0f-ee14-4643-b24f-dc347f78c980",
  "state": "PENDING",
  "created_at": "2026-10-28T13:30:41.250976Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/49f96c0f-ee14-4643-b24f-dc347f78c980` → **200**

```json
{
  "id": "49f96c0f-ee14-4643-b24f-dc347f78c980",
  "state": "PENDING",
  "created_at": "2026-10-28T13:30:41.250976Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/49f96c0f-ee14-4643-b24f-dc347f78c980` → **200**

```json
{
  "id": "49f96c0f-ee14-4643-b24f-dc347f78c980",
  "state": "READY",
  "created_at": "2026-10-28T13:30:41.250976Z",
  "ready_at": "2026-10-28T13:30:44.432637Z",
  "expires_at": "2026-11-04T13:30:44.432637Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/49f96c0f-ee14-4643-b24f-dc347f78c980/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635516946",
  "device_ref": "sandbox-664"
}
```

```json
{
  "challenge_id": "167be347-0f96-43a7-b551-7def08c4662c",
  "expires_at": "2026-10-28T13:35:45.586187695Z",
  "resend_available_at": "2026-10-28T13:30:46.586187695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635516946` → **200**

```json
{
  "phone": "+380635516946",
  "audience": "CLIENT",
  "code": "552285",
  "sent_at": "2026-10-28T13:30:45.588768637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "167be347-0f96-43a7-b551-7def08c4662c",
  "code": "552285",
  "device_ref": "sandbox-664"
}
```

```json
{
  "session_id": "1bacf79a-6a75-464a-88d2-a66149d04460",
  "subject": {
    "type": "CLIENT",
    "id": "1bc90e4e-73c1-4747-8a4c-bd3de6197b15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmM5MGU0ZS03M2MxLTQ3NDctOGE0Yy1iZDNkZTYxOTdiMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTQ1LCJpYXQiOjE3OTMxOTQyNDUsImp0aSI6ImQxZWJkN2UyLTEzNzUtNDVlZC04OGVjLTI5MmYxOTIwODNiYiIsInNpZCI6IjFiYWNmNzlhLTZhNzUtNDY0YS04OGQyLWE2NjE0OWQwNDQ2MCJ9.cabQMrpXYhUoO9vqPV1Y9_OJy9GTePKiJnAgPg5bdbo",
  "access_expires_at": "2026-10-28T13:45:45.875104782Z",
  "refresh_token": "5quJfXf3aFR4QctVHjS8xGxsX0qI5ZWdhhWsJ1ju9Hc",
  "refresh_expires_at": "2026-11-27T13:30:45.874507812Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/49f96c0f-ee14-4643-b24f-dc347f78c980/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/49f96c0f-ee14-4643-b24f-dc347f78c980/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c739ff06-7cf6-4950-bf2a-f26c711be82b"
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
  "session_id": "46f983a8-6d5b-4ce1-afe1-dcdaa6921f03",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxNDYsImlhdCI6MTc5MzE5NDI0NiwianRpIjoiNmI5ZTQwNDgtNjJiYS00MjAzLThiZmItYWUzODAwNzE5YWEyIiwic2lkIjoiNDZmOTgzYTgtNmQ1Yi00Y2UxLWFmZTEtZGNkYWE2OTIxZjAzIn0.Ctt0eWiffqjt_t-TxORDb5chVRRE7kcJux8eTG9UuDQ",
  "access_expires_at": "2026-10-28T13:45:46.691062472Z",
  "refresh_token": "IDTvV-1NUnnZc-GSCxsY-Kh8XxO419b6pn9wR1Tk6G4",
  "refresh_expires_at": "2026-10-29T01:30:46.690507218Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "96022580-7dae-4ae7-9210-03e061c644c2",
  "session_id": "ecd94c65-a4cc-46a9-bff4-3691b01d8a45",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/96022580-7dae-4ae7-9210-03e061c644c2/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "49f96c0f-ee14-4643-b24f-dc347f78c980",
      "state": "READY",
      "created_at": "2026-10-28T13:30:41.250976Z",
      "ready_at": "2026-10-28T13:30:44.432637Z",
      "expires_at": "2026-11-04T13:30:44.432637Z",
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
  "device_ref": "sandbox-9882"
}
```

```json
{
  "challenge_id": "cff17a79-247b-4f6e-bce4-c3e50851c0b8",
  "expires_at": "2026-10-28T13:35:47.472670676Z",
  "resend_available_at": "2026-10-28T13:30:48.472670676Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "563598",
  "sent_at": "2026-10-28T13:30:47.475115055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cff17a79-247b-4f6e-bce4-c3e50851c0b8",
  "code": "563598",
  "device_ref": "sandbox-9882"
}
```

```json
{
  "session_id": "74a40e50-12a5-4ae2-9792-d5bafc652c5f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTE0NywiaWF0IjoxNzkzMTk0MjQ3LCJqdGkiOiI0ODY4YTJkMC1jYTQ1LTQxNTItODBkMS0xNDlhOWZjODk0NDIiLCJzaWQiOiI3NGE0MGU1MC0xMmE1LTRhZTItOTc5Mi1kNWJhZmM2NTJjNWYifQ.k7Ta80VnujQOoCSidHKR5fjWM36lRvzsnTzPmYgso-4",
  "access_expires_at": "2026-10-28T13:45:47.762388545Z",
  "refresh_token": "HNXD1MaXeSE41lDr5T72yxLrtSq2MwBQlQN7iFjMNXw",
  "refresh_expires_at": "2026-11-27T13:30:47.761741437Z",
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
  "device_ref": "sandbox-2420"
}
```

```json
{
  "challenge_id": "4e4ba299-6002-4e9e-8bc7-08786daa4b85",
  "expires_at": "2026-10-28T13:35:48.295796834Z",
  "resend_available_at": "2026-10-28T13:30:49.295796834Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "482740",
  "sent_at": "2026-10-28T13:30:48.298224947Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e4ba299-6002-4e9e-8bc7-08786daa4b85",
  "code": "482740",
  "device_ref": "sandbox-2420"
}
```

```json
{
  "session_id": "daef4c0f-40d9-41f8-8e95-f1e0c63e90fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTE0OCwiaWF0IjoxNzkzMTk0MjQ4LCJqdGkiOiI4ZDUzMDU1YS04ZjExLTQ5N2MtYjgyZC00NGZmZjk4YmU0MjMiLCJzaWQiOiJkYWVmNGMwZi00MGQ5LTQxZjgtOGU5NS1mMWUwYzYzZTkwZmUifQ.kd1wy_jRVH08TqCF80tNLzkbea3R2JEeFOS-pnh22LM",
  "access_expires_at": "2026-10-28T13:45:48.596703572Z",
  "refresh_token": "Fj9TrVTbGQXZ6e9jLX001JlvEpD86VCxqbaXBAF_SZw",
  "refresh_expires_at": "2026-11-27T13:30:48.596186769Z",
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
  "command_id": "a4735492-5456-45aa-b49d-ff4248fe6742",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:30:49Z",
    "sequence": 1793194249121
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7c54cd9d-7997-4adb-8496-a5f243a64fc9",
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
  "last_heartbeat_at": "2026-10-28T13:30:49.13921Z",
  "last_location_at": "2026-10-28T13:30:49.13921Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-3484"
}
```

```json
{
  "challenge_id": "c2afaabc-a3d7-4e27-89ea-dd6592726388",
  "expires_at": "2026-10-28T13:35:49.401447283Z",
  "resend_available_at": "2026-10-28T13:30:50.401447283Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "783466",
  "sent_at": "2026-10-28T13:30:49.403639703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2afaabc-a3d7-4e27-89ea-dd6592726388",
  "code": "783466",
  "device_ref": "sandbox-3484"
}
```

```json
{
  "session_id": "1f659bd8-1075-4dba-ae5a-6f1918584b60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTE0OSwiaWF0IjoxNzkzMTk0MjQ5LCJqdGkiOiI4YzU0ZTZhNC1jNDU5LTRkNGEtOTY3MS1jN2I4OTg1MTBlNTMiLCJzaWQiOiIxZjY1OWJkOC0xMDc1LTRkYmEtYWU1YS02ZjE5MTg1ODRiNjAifQ.E5N9qlD2d4heNSDXVct9QEWgAXtD68P7W2sG9E3tSR4",
  "access_expires_at": "2026-10-28T13:45:49.68551427Z",
  "refresh_token": "Qa_dVzuQjjgfnjAAgQ4IdpPeENVEQFKYvWNZ7lsL5bY",
  "refresh_expires_at": "2026-11-27T13:30:49.684904084Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3852956a-7fdc-4897-ac2c-69118dce16e6",
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
  "last_heartbeat_at": "2026-10-28T13:29:18.425126Z",
  "last_location_at": "2026-10-28T13:29:18.425126Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3852956a-7fdc-4897-ac2c-69118dce16e6/handover` → **200**

```json
{
  "command_id": "82e4c71f-9423-46ad-88d9-a301031cbcdb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3852956a-7fdc-4897-ac2c-69118dce16e6",
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
  "last_heartbeat_at": "2026-10-28T13:29:18.425126Z",
  "last_location_at": "2026-10-28T13:29:18.425126Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3852956a-7fdc-4897-ac2c-69118dce16e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:30:50Z",
    "sequence": 1793194250482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3852956a-7fdc-4897-ac2c-69118dce16e6",
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
  "last_heartbeat_at": "2026-10-28T13:30:50.500106Z",
  "last_location_at": "2026-10-28T13:30:50.500106Z",
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
  "session_id": "213619a5-b9ef-40ab-bebe-4a78f19b5066",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxNTEsImlhdCI6MTc5MzE5NDI1MSwianRpIjoiNDk1NDlmY2EtNmE5OS00ODQ3LWIzYWQtMDU3N2ZkY2Q5Mzk2Iiwic2lkIjoiMjEzNjE5YTUtYjllZi00MGFiLWJlYmUtNGE3OGYxOWI1MDY2In0.CHlAgCXhR90pmiwfBZwwu1PFkcsoajt5lAVMSa0BnBA",
  "access_expires_at": "2026-10-28T13:45:51.056631706Z",
  "refresh_token": "n_DwphZzOMJ_o6BLNhN7EM1wT3vnQw5J1GuX5MEiy10",
  "refresh_expires_at": "2026-10-29T01:30:51.056014536Z",
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
  "session_id": "137fa725-b57d-4a23-90f4-94b02543f59b",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxNTEsImlhdCI6MTc5MzE5NDI1MSwianRpIjoiMGMzYzJiZWYtN2Q3Ni00ODYzLTk4NTYtMjYxNWFlZGM1YWM2Iiwic2lkIjoiMTM3ZmE3MjUtYjU3ZC00YTIzLTkwZjQtOTRiMDI1NDNmNTliIn0.T_Z_4lXkO_SIocToG68l89-zBWXSn6q8NYu86EiPo-s",
  "access_expires_at": "2026-10-28T13:45:51.615681455Z",
  "refresh_token": "q416BSqnUgw0Epa8Lrw35h-o3WskeNsLDsDosCrPHYo",
  "refresh_expires_at": "2026-10-29T01:30:51.615111342Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683510274",
  "device_ref": "sandbox-9563"
}
```

```json
{
  "challenge_id": "b742b317-b1a0-4586-ae68-380256d91ec7",
  "expires_at": "2026-10-28T13:35:51.873870546Z",
  "resend_available_at": "2026-10-28T13:30:52.873870546Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683510274` → **200**

```json
{
  "phone": "+380683510274",
  "audience": "CLIENT",
  "code": "919451",
  "sent_at": "2026-10-28T13:30:51.876313497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b742b317-b1a0-4586-ae68-380256d91ec7",
  "code": "919451",
  "device_ref": "sandbox-9563"
}
```

```json
{
  "session_id": "3392273a-421e-425c-8b7e-4155785f2cbb",
  "subject": {
    "type": "CLIENT",
    "id": "501dac92-c974-4cff-a02f-2d5a92b41e91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDFkYWM5Mi1jOTc0LTRjZmYtYTAyZi0yZDVhOTJiNDFlOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTUyLCJpYXQiOjE3OTMxOTQyNTIsImp0aSI6IjFjN2RiYWI4LTI3MDItNDdkZi05M2NkLTg3YzU4OTBjMWVhOSIsInNpZCI6IjMzOTIyNzNhLTQyMWUtNDI1Yy04YjdlLTQxNTU3ODVmMmNiYiJ9.EH5I4VkgYp3qWHHndhbJ9qPedOZqTbp99xtoix-_tNk",
  "access_expires_at": "2026-10-28T13:45:52.163758415Z",
  "refresh_token": "ULUsT_QT0ac_An4uVvg3oFNyJdRllhNcn1qpnbmyFHo",
  "refresh_expires_at": "2026-11-27T13:30:52.16315993Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7ee1ab89-1742-4e12-a588-56e631058b19",
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
  "id": "4807e8b3-eecf-4068-9e1f-3b60cc3cd9b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:35:52.435965Z",
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
  "command_id": "0c92c05a-d888-40cc-b6bb-18e77d865dd8",
  "quote_id": "4807e8b3-eecf-4068-9e1f-3b60cc3cd9b0",
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
  "id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "501dac92-c974-4cff-a02f-2d5a92b41e91",
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
  "created_at": "2026-10-28T13:30:52.722339Z",
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
    "id": "ed0b2af4-5120-4507-b602-969d7a00c8f5",
    "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
    "expires_at": "2026-10-28T13:31:07.726309Z",
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

`POST /api/driver/v1/offers/ed0b2af4-5120-4507-b602-969d7a00c8f5/reject` → **204**

```json
{
  "command_id": "1864ec6b-b08d-43d3-817d-43b922b094c9"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c10e5470-444e-4c07-8470-f2c12aa1129a",
    "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
    "expires_at": "2026-10-28T13:31:08.291471Z",
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

`POST /api/driver/v1/offers/c10e5470-444e-4c07-8470-f2c12aa1129a/accept` → **200**

```json
{
  "command_id": "8a486462-5c19-422e-a9e5-2f5d6f6f00c9"
}
```

```json
{
  "id": "3eb2f722-d9a1-4279-be6f-7661072fc394",
  "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2a6c5faa-90f4-4542-b923-ff57742d1ac3",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/3230f6c4-e67e-412f-92de-66a28955d9ae/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:30:52.72288Z",
      "actor": {
        "type": "CLIENT",
        "id": "501dac92-c974-4cff-a02f-2d5a92b41e91",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
        "quote_id": "4807e8b3-eecf-4068-9e1f-3b60cc3cd9b0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c9b3e32e-2ee4-475a-98cc-ead8961d31fc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:30:52.725233Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
        "attempt_id": "09b44a32-03c7-4003-b37f-bb71e1142bdf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c9b3e32e-2ee4-475a-98cc-ead8961d31fc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:30:52.732829Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ed0b2af4-5120-4507-b602-969d7a00c8f5",
        "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c9b3e32e-2ee4-475a-98cc-ead8961d31fc"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T13:30:53.290371Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ed0b2af4-5120-4507-b602-969d7a00c8f5",
        "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae"
      },
      "correlation_id": "7bb53e74-1865-4226-be77-06d70854f70a"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 3230f6c4-e67e-412f-92de-66a28955d9ae — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/3230f6c4-e67e-412f-92de-66a28955d9ae` → **200**

```json
{
  "id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "501dac92-c974-4cff-a02f-2d5a92b41e91",
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
    "id": "3eb2f722-d9a1-4279-be6f-7661072fc394",
    "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2a6c5faa-90f4-4542-b923-ff57742d1ac3",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:30:52.722339Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3230f6c4-e67e-412f-92de-66a28955d9ae/cancel` → **200**

```json
{
  "command_id": "44c9e097-4675-4dcb-9dd9-be0f92a32607",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "501dac92-c974-4cff-a02f-2d5a92b41e91",
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
    "id": "3eb2f722-d9a1-4279-be6f-7661072fc394",
    "order_id": "3230f6c4-e67e-412f-92de-66a28955d9ae",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2a6c5faa-90f4-4542-b923-ff57742d1ac3",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:30:52.722339Z",
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
  "session_id": "7c54cd9d-7997-4adb-8496-a5f243a64fc9",
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
  "last_heartbeat_at": "2026-10-28T13:30:49.13921Z",
  "last_location_at": "2026-10-28T13:30:49.13921Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7c54cd9d-7997-4adb-8496-a5f243a64fc9/close` → **200**

```json
{
  "command_id": "486e139b-17bf-484b-a51c-bb5574b0eba3",
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
  "session_id": "3852956a-7fdc-4897-ac2c-69118dce16e6",
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
  "last_heartbeat_at": "2026-10-28T13:30:50.500106Z",
  "last_location_at": "2026-10-28T13:30:50.500106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3852956a-7fdc-4897-ac2c-69118dce16e6/close` → **200**

```json
{
  "command_id": "403a6076-2bca-4831-a0d8-71ba21aa6d06",
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
  "device_ref": "sandbox-17448"
}
```

```json
{
  "challenge_id": "589a8543-a73a-4835-8802-d7e7458b168d",
  "expires_at": "2026-10-28T13:35:56.120108177Z",
  "resend_available_at": "2026-10-28T13:30:57.120108177Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "307891",
  "sent_at": "2026-10-28T13:30:56.12378571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "589a8543-a73a-4835-8802-d7e7458b168d",
  "code": "307891",
  "device_ref": "sandbox-17448"
}
```

```json
{
  "session_id": "331a6df8-4dbc-48b7-86ff-65dbc6429fff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTE1NiwiaWF0IjoxNzkzMTk0MjU2LCJqdGkiOiJjYjcwYjFjYS1iNWY4LTQ4ODEtYTM2NC0yMDAyOTMzZDI0NWQiLCJzaWQiOiIzMzFhNmRmOC00ZGJjLTQ4YjctODZmZi02NWRiYzY0MjlmZmYifQ.fJdouaYk_x3vH5BpdkqO8OB84cqn1E2Sfx3iUI9yKeY",
  "access_expires_at": "2026-10-28T13:45:56.410630545Z",
  "refresh_token": "I4PXetkUIEy-lsS6y6w1Lit48oZUIjuJFGjjb5x3vjM",
  "refresh_expires_at": "2026-11-27T13:30:56.410110656Z",
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
  "command_id": "406470d5-8cea-4108-8b52-6e8c23f7157e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:30:56Z",
    "sequence": 1793194256934
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:30:56.950999Z",
  "last_location_at": "2026-10-28T13:30:56.950999Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676053153",
  "device_ref": "sandbox-8805"
}
```

```json
{
  "challenge_id": "ab86a196-6d09-44fe-a3c0-cd6ddb7a8966",
  "expires_at": "2026-10-28T13:35:57.220297018Z",
  "resend_available_at": "2026-10-28T13:30:58.220297018Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676053153` → **200**

```json
{
  "phone": "+380676053153",
  "audience": "CLIENT",
  "code": "334296",
  "sent_at": "2026-10-28T13:30:57.222571394Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab86a196-6d09-44fe-a3c0-cd6ddb7a8966",
  "code": "334296",
  "device_ref": "sandbox-8805"
}
```

```json
{
  "session_id": "9158e367-1288-4e1e-90f0-94880f4db8c1",
  "subject": {
    "type": "CLIENT",
    "id": "50c77bb5-ee68-4824-b9a2-31162d38fd64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGM3N2JiNS1lZTY4LTQ4MjQtYjlhMi0zMTE2MmQzOGZkNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTU3LCJpYXQiOjE3OTMxOTQyNTcsImp0aSI6IjU4ZTg2NTI5LTEwMzItNDdhYy1iNmQ1LTZkNjM4MTFlOTg3MCIsInNpZCI6IjkxNThlMzY3LTEyODgtNGUxZS05MGYwLTk0ODgwZjRkYjhjMSJ9.75VU7EuNDNjisNuu7y6rR2K4JQ6209XXPH32fLIIwjg",
  "access_expires_at": "2026-10-28T13:45:57.505802348Z",
  "refresh_token": "nKKDngtJSkr-4fUjae1cTSBlqWH7YuQcwjs8IytVYyE",
  "refresh_expires_at": "2026-11-27T13:30:57.50513203Z",
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
  "command_id": "b5c42392-42ee-4e0e-a0c8-5bb14462a3da",
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
  "id": "38ec52ba-2d59-4a69-9bac-ef2ac8240e1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:35:58.042333Z",
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
  "command_id": "9c81a66a-705e-4e7f-a575-c7703b9d0d27",
  "platform": "ANDROID",
  "token": "sandbox-driver-7a2e8d99-48f6-4b20-b40e-3d8e07be4056"
}
```

```json
{
  "id": "692190b6-a7de-45c6-a990-5b7c42552da2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:30:58.327747Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "e7c81c83-0244-4389-8649-c777dcef43d0",
  "platform": "ANDROID",
  "token": "sandbox-rider-add8c089-41af-4144-8cb1-9bde6b2392ca"
}
```

```json
{
  "id": "d0cfd125-acce-422f-9a4e-46e026828bc0",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:30:58.613278Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "df4ff5fe-9558-4248-93bd-428206d12919",
  "quote_id": "38ec52ba-2d59-4a69-9bac-ef2ac8240e1a",
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
  "id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "50c77bb5-ee68-4824-b9a2-31162d38fd64",
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
  "created_at": "2026-10-28T13:30:58.885276Z",
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
    "id": "c8e0dae5-33d3-4e66-be28-575d741bc912",
    "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
    "expires_at": "2026-10-28T13:31:13.888682Z",
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

`POST /api/driver/v1/offers/c8e0dae5-33d3-4e66-be28-575d741bc912/accept` → **200**

```json
{
  "command_id": "1dbf63eb-61b6-485a-98a8-2885cf8d7d69"
}
```

```json
{
  "id": "d3c386e7-03a9-4d45-b8ef-03dd02e9a52c",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d43681cc-857e-493b-881d-9fa27d429462",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:30:58.862Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:30:58.862Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:30:59.856264575Z",
    "token_suffix": "be4056",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "83c3b9dc-1b34-4171-a33b-90295d18a768",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676053153&after=2026-10-28T13:30:58.862Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380676053153&after=2026-10-28T13:30:58.862Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:31:00.860621601Z",
    "token_suffix": "2392ca",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "9e024b50-8367-4478-941b-a4626c9daeea",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/c7bbd294-560d-47fe-bcfc-634f460228e9/messages` → **201**

```json
{
  "command_id": "c120bea7-b698-4900-a733-8ed1afa9c2c2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "283b5dba-0d1f-4ad6-8b1a-bae97026b6bc",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T13:31:01.811621524Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d43681cc-857e-493b-881d-9fa27d429462",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "assignment_id": "d3c386e7-03a9-4d45-b8ef-03dd02e9a52c",
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

`POST /api/driver/v1/trips/d43681cc-857e-493b-881d-9fa27d429462/messages` → **201**

```json
{
  "command_id": "750d16d1-57cf-469b-9f75-30919139d6dd",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "afc0cbfd-84ac-4521-85b5-656c16ec2ea2",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T13:31:02.330397481Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/c7bbd294-560d-47fe-bcfc-634f460228e9/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d43681cc-857e-493b-881d-9fa27d429462/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676053153"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/5bcefecc-0b37-4b0c-a70b-d827d55b79cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:03Z",
    "sequence": 1793194263111
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:31:03.12957Z",
  "last_location_at": "2026-10-28T13:31:03.12957Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d43681cc-857e-493b-881d-9fa27d429462",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "assignment_id": "d3c386e7-03a9-4d45-b8ef-03dd02e9a52c",
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

`POST /api/driver/v1/trips/d43681cc-857e-493b-881d-9fa27d429462/arrive` → **200**

```json
{
  "command_id": "ceff65de-64e6-40c1-898f-e3648e0b6101",
  "expected_version": 0
}
```

```json
{
  "id": "d43681cc-857e-493b-881d-9fa27d429462",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "assignment_id": "d3c386e7-03a9-4d45-b8ef-03dd02e9a52c",
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
  "arrived_at": "2026-10-28T13:31:03.674503Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d43681cc-857e-493b-881d-9fa27d429462/start` → **200**

```json
{
  "command_id": "e2669709-a812-456c-b091-2ab3613a4dd3",
  "expected_version": 1
}
```

```json
{
  "id": "d43681cc-857e-493b-881d-9fa27d429462",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "assignment_id": "d3c386e7-03a9-4d45-b8ef-03dd02e9a52c",
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
  "arrived_at": "2026-10-28T13:31:03.674503Z",
  "started_at": "2026-10-28T13:31:03.943495Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5bcefecc-0b37-4b0c-a70b-d827d55b79cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:04Z",
    "sequence": 1793194264204
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:31:04.222923Z",
  "last_location_at": "2026-10-28T13:31:04.222923Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d43681cc-857e-493b-881d-9fa27d429462/complete` → **200**

```json
{
  "command_id": "6c2788bc-ce92-422d-9f21-5d0e714bd4fc",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:31:04Z",
  "cash_received": true
}
```

```json
{
  "id": "d43681cc-857e-493b-881d-9fa27d429462",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "assignment_id": "d3c386e7-03a9-4d45-b8ef-03dd02e9a52c",
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
  "arrived_at": "2026-10-28T13:31:03.674503Z",
  "started_at": "2026-10-28T13:31:03.943495Z",
  "completed_at": "2026-10-28T13:31:04.498154Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/c7bbd294-560d-47fe-bcfc-634f460228e9` → **200**

```json
{
  "id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "50c77bb5-ee68-4824-b9a2-31162d38fd64",
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
    "id": "d3c386e7-03a9-4d45-b8ef-03dd02e9a52c",
    "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d43681cc-857e-493b-881d-9fa27d429462",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:30:58.885276Z",
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
    "id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:30:58.885276Z",
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
    "id": "d43681cc-857e-493b-881d-9fa27d429462",
    "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
    "order_short_number": 9,
    "created_at": "2026-10-28T13:30:59.431558Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3080a7d3-2fd8-4861-819e-e81997fba963",
    "order_id": "b198d373-494b-4619-8424-159c91d604fb",
    "order_short_number": 2,
    "created_at": "2026-10-28T13:29:09.446729Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "adea24a1-bd1e-4088-a661-3bd66e76d041",
    "order_id": "1fb52c90-09be-4072-bbd7-81983b92d657",
    "order_short_number": 1,
    "created_at": "2026-10-28T13:28:48.361967Z",
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

`GET /api/rider/v1/orders/c7bbd294-560d-47fe-bcfc-634f460228e9/tip` → **200**

```json
{
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
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
  "available_until": "2026-10-29T13:31:04.498154Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c7bbd294-560d-47fe-bcfc-634f460228e9/tip` → **201**

```json
{
  "command_id": "f2e98796-6d5d-4f71-9029-ae084e844b0f",
  "amount_minor": 1100
}
```

```json
{
  "id": "e3ff6fca-8225-4976-a7a3-49f9a21ab740",
  "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T13:31:09.453371Z"
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
  "session_id": "cedc0f8d-5df0-4000-a3be-8b3d1cb94785",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxNzAsImlhdCI6MTc5MzE5NDI3MCwianRpIjoiYWUzNDdiOTItOTk3Zi00MjEyLWFmOGItOGI5ZGNjYWExZjk5Iiwic2lkIjoiY2VkYzBmOGQtNWRmMC00MDAwLWEzYmUtOGIzZDFjYjk0Nzg1In0.ScbEWK_icrP-IFY3tPlWgR7ffaRI8x50JbOrIEVy--k",
  "access_expires_at": "2026-10-28T13:46:10.023267888Z",
  "refresh_token": "Y7HzUCi8vZKItUdpmI2CC0LtAmyBxIpXtZO_9WJyPUI",
  "refresh_expires_at": "2026-10-29T01:31:10.02272682Z",
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
        "created": 9,
        "fulfilled": 5,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "PHONE": 1,
          "APP": 8
        },
        "by_payment": {
          "CASH": 8,
          "CARD": 1
        },
        "cancelled_by": {
          "RIDER": 2,
          "DRIVER": 1,
          "STAFF": 1
        }
      }
    }
  ],
  "total": {
    "created": 9,
    "fulfilled": 5,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "PHONE": 1,
      "APP": 8
    },
    "by_payment": {
      "CASH": 8,
      "CARD": 1
    },
    "cancelled_by": {
      "RIDER": 2,
      "DRIVER": 1,
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
  "generated_at": "2026-10-28T13:31:10.293709107Z"
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
  "generated_at": "2026-10-28T13:31:10.563585501Z"
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
  "session_id": "94b44b20-68cb-4779-b8fa-887452967721",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxNzEsImlhdCI6MTc5MzE5NDI3MSwianRpIjoiNmI3MTUyNGQtODkyMC00MDdlLThkOGEtNWM0NzNmNDFiNjA2Iiwic2lkIjoiOTRiNDRiMjAtNjhjYi00Nzc5LWI4ZmEtODg3NDUyOTY3NzIxIn0.oXSMrbZRf3dArGAD5sTCvCNk2KgArSOc1wF1OPH1_JA",
  "access_expires_at": "2026-10-28T13:46:11.128212002Z",
  "refresh_token": "-66mQocmYT9AAdym2o-kZCj3D7ZGnp2c4haz96f3TSI",
  "refresh_expires_at": "2026-10-29T01:31:11.127526228Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c7bbd294-560d-47fe-bcfc-634f460228e9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:30:58.885775Z",
      "actor": {
        "type": "CLIENT",
        "id": "50c77bb5-ee68-4824-b9a2-31162d38fd64",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
        "quote_id": "38ec52ba-2d59-4a69-9bac-ef2ac8240e1a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "42b63a22-998a-4ade-ab2a-3a0d8794a477"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:30:58.887737Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
        "attempt_id": "7096b2a7-f66e-4bc2-a5cc-51a3d0a4806a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "42b63a22-998a-4ade-ab2a-3a0d8794a477"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:30:58.891649Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c8e0dae5-33d3-4e66-be28-575d741bc912",
        "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "42b63a22-998a-4ade-ab2a-3a0d8794a477"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:30:59.433564Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c8e0dae5-33d3-4e66-be28-575d741bc912",
        "order_id": "c7bbd294-560d-47fe-bcfc-634f460228e9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d3c386e7-03a9-4d45-b8ef-03dd02e9a52c"
      },
      "correlation_id": "8b960786-50d3-467d-b085-93afa76f3bfe"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T13:31:11.677823167Z",
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
      "last_location_at": "2026-10-28T13:31:04.222923Z",
      "order_id": null
    }
  ]
}
```

Done: order c7bbd294-560d-47fe-bcfc-634f460228e9.

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
  "session_id": "23673509-3786-4c15-a460-5560c640edb8",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxNzIsImlhdCI6MTc5MzE5NDI3MiwianRpIjoiODIwZmQyZDQtYTQ2MC00MGU5LWE5MjktZTQ3YzY5ZDE0N2MxIiwic2lkIjoiMjM2NzM1MDktMzc4Ni00YzE1LWE0NjAtNTU2MGM2NDBlZGI4In0.Jduu28RGhan3z_IDvhs8F5BHQ1pdLkE3lz0TrpJPASY",
  "access_expires_at": "2026-10-28T13:46:12.251895658Z",
  "refresh_token": "nTBQsdOqPt35k5J55k8qpYvsl_ORtdhXQw0mrAYqWD4",
  "refresh_expires_at": "2026-10-29T01:31:12.251300838Z",
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
  "command_id": "e69f816a-5b43-401c-85e5-fe26dc1bde1d",
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
  "timestamp": "2026-10-28T13:31:13.000+0000",
  "channel": {
    "id": "1730052000.2675025757",
    "linkedid": "1730052000.2675025757",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671560938"
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
  "timestamp": "2026-10-28T13:31:13.000+0000",
  "channel": {
    "id": "1730052000.2675025757",
    "linkedid": "1730052000.2675025757",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671560938"
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
  "session_id": "352670aa-a374-4063-a9ff-653780566c19",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxNzMsImlhdCI6MTc5MzE5NDI3MywianRpIjoiMTQ4ZWIxZjAtMjdjNy00YzE4LWIxMDktODQ3NDZmMTZkMzQzIiwic2lkIjoiMzUyNjcwYWEtYTM3NC00MDYzLWE5ZmYtNjUzNzgwNTY2YzE5In0.uixn8lVeUmeNCgvFrfq8Fmylp79WqEQ89lO74yQU4Lo",
  "access_expires_at": "2026-10-28T13:46:13.386283818Z",
  "refresh_token": "MH5KnAO2JiQSFP9KDElpCAilGjO2HbibQ4XW1DEzLLk",
  "refresh_expires_at": "2026-10-29T01:31:13.385754241Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "88593291-ccc2-4926-a3cd-8fda08f6b315",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671560938",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:31:13Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/88593291-ccc2-4926-a3cd-8fda08f6b315/answer` → **200**

```json
{
  "command_id": "51f3dc22-49bc-439c-b14b-f37e4c36920c"
}
```

```json
{
  "id": "88593291-ccc2-4926-a3cd-8fda08f6b315",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671560938",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "order_ids": [],
  "started_at": "2026-10-28T13:31:13Z",
  "answered_at": "2026-10-28T13:31:13.949035Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2675025757",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f462f453-47e0-424f-ae20-a0b04313449f",
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
  "id": "bc1dbdd5-59c3-45e2-9a66-1f8c3c8b65bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:14.277127Z",
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
  "command_id": "f1b54cf9-7943-4a65-b728-4bfa7f66f3d3",
  "quote_id": "bc1dbdd5-59c3-45e2-9a66-1f8c3c8b65bf",
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
    "phone": "+380671560938"
  },
  "call_id": "88593291-ccc2-4926-a3cd-8fda08f6b315"
}
```

```json
{
  "id": "8b6eaf73-8f67-4464-ad05-9ed147914c20",
  "short_number": 10,
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
  "created_at": "2026-10-28T13:31:14.562923Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671560938"
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
    "id": "1730052000.2675025757",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "88593291-ccc2-4926-a3cd-8fda08f6b315",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671560938",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [
        "8b6eaf73-8f67-4464-ad05-9ed147914c20"
      ],
      "started_at": "2026-10-28T13:31:13Z",
      "answered_at": "2026-10-28T13:31:13.949035Z",
      "ended_at": "2026-10-28T13:31:14.864933Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "322f5adb-a78f-4dee-92a1-184357a918a4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674736286",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [],
      "started_at": "2026-10-28T13:28:56.255867Z",
      "answered_at": "2026-10-28T13:28:56.556126Z",
      "ended_at": "2026-10-28T13:28:56.869559Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:29:04.413393Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/8b6eaf73-8f67-4464-ad05-9ed147914c20` → **200**

```json
{
  "id": "8b6eaf73-8f67-4464-ad05-9ed147914c20",
  "short_number": 10,
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
  "created_at": "2026-10-28T13:31:14.562923Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671560938"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/8b6eaf73-8f67-4464-ad05-9ed147914c20` → **200**

```json
{
  "id": "8b6eaf73-8f67-4464-ad05-9ed147914c20",
  "short_number": 10,
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
  "created_at": "2026-10-28T13:31:14.562923Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671560938"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8b6eaf73-8f67-4464-ad05-9ed147914c20/cancel` → **200**

```json
{
  "command_id": "08d78fa6-a633-4c20-b0ef-f32deafb7cf5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8b6eaf73-8f67-4464-ad05-9ed147914c20",
  "short_number": 10,
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
  "created_at": "2026-10-28T13:31:14.562923Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671560938"
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

Done: call 88593291-ccc2-4926-a3cd-8fda08f6b315 with order 8b6eaf73-8f67-4464-ad05-9ed147914c20.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4920"
}
```

```json
{
  "challenge_id": "d8f03aad-c4fd-4f11-902c-406e8676eba4",
  "expires_at": "2026-10-28T13:36:16.034621763Z",
  "resend_available_at": "2026-10-28T13:31:17.034621763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "344653",
  "sent_at": "2026-10-28T13:31:16.037116261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8f03aad-c4fd-4f11-902c-406e8676eba4",
  "code": "344653",
  "device_ref": "sandbox-4920"
}
```

```json
{
  "session_id": "5e629384-8d4c-4f6d-888e-11b5876c429d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTE3NiwiaWF0IjoxNzkzMTk0Mjc2LCJqdGkiOiJhNzAxZjNkYS02OGFjLTRmY2ItYmMyZC00N2IzN2FlYzIzMTQiLCJzaWQiOiI1ZTYyOTM4NC04ZDRjLTRmNmQtODg4ZS0xMWI1ODc2YzQyOWQifQ.BiJy0wzGA4NcWQbYGJZGXRhn3j6qsOC-PrVXTTcyjJY",
  "access_expires_at": "2026-10-28T13:46:16.322388425Z",
  "refresh_token": "txhHpqcs37aiAP4Ncuxz7mU7Vb-dcSkXU5Y8QuZnX2Y",
  "refresh_expires_at": "2026-11-27T13:31:16.321863386Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:31:04.222923Z",
  "last_location_at": "2026-10-28T13:31:04.222923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5bcefecc-0b37-4b0c-a70b-d827d55b79cd/handover` → **200**

```json
{
  "command_id": "9ee3d687-010e-47d6-be74-f5f275382770",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:31:04.222923Z",
  "last_location_at": "2026-10-28T13:31:04.222923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5bcefecc-0b37-4b0c-a70b-d827d55b79cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:17Z",
    "sequence": 1793194277154
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:31:17.173802Z",
  "last_location_at": "2026-10-28T13:31:17.173802Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664131619",
  "device_ref": "sandbox-31257"
}
```

```json
{
  "challenge_id": "69b5daa8-c0b6-4cc1-8c0b-de86e72c43eb",
  "expires_at": "2026-10-28T13:36:17.445179444Z",
  "resend_available_at": "2026-10-28T13:31:18.445179444Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664131619` → **200**

```json
{
  "phone": "+380664131619",
  "audience": "CLIENT",
  "code": "685865",
  "sent_at": "2026-10-28T13:31:17.447462397Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69b5daa8-c0b6-4cc1-8c0b-de86e72c43eb",
  "code": "685865",
  "device_ref": "sandbox-31257"
}
```

```json
{
  "session_id": "c660d3e0-dbb2-424f-b1d3-968b70972aa5",
  "subject": {
    "type": "CLIENT",
    "id": "645f1ec3-97f1-4ada-849a-6cb4dda9759d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NDVmMWVjMy05N2YxLTRhZGEtODQ5YS02Y2I0ZGRhOTc1OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTc3LCJpYXQiOjE3OTMxOTQyNzcsImp0aSI6ImVjYmJlODlkLTYxOWQtNDk1OC05NDRlLWVjN2I0Y2NmYmY1YyIsInNpZCI6ImM2NjBkM2UwLWRiYjItNDI0Zi1iMWQzLTk2OGI3MDk3MmFhNSJ9.admTK3VInzT0KD-HqJt794m5IzlQWi92uAOfrBPRGtc",
  "access_expires_at": "2026-10-28T13:46:17.739409722Z",
  "refresh_token": "UodLmkIdv2pK-_xNMyoFXJqjkA5OkO9kGhtW55pt3t4",
  "refresh_expires_at": "2026-11-27T13:31:17.738869245Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08af9047-db6f-4a54-94f7-39ea3776aad6",
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
  "id": "18773719-51b4-4de9-b01f-e8e6a25fe4a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:18.021895Z",
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
  "command_id": "a67cc0c4-959e-4b2b-8b12-ee3306c40210",
  "quote_id": "18773719-51b4-4de9-b01f-e8e6a25fe4a3",
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
  "id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "645f1ec3-97f1-4ada-849a-6cb4dda9759d",
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
  "created_at": "2026-10-28T13:31:18.306586Z",
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
    "id": "eca3d398-c137-4777-a6b8-35ca3ced806e",
    "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
    "expires_at": "2026-10-28T13:31:33.309306Z",
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

`POST /api/driver/v1/offers/eca3d398-c137-4777-a6b8-35ca3ced806e/accept` → **200**

```json
{
  "command_id": "36c34712-9678-47f9-877e-bbf5f04a0820"
}
```

```json
{
  "id": "ba3a7fc6-8b1f-4a16-b4c9-4b5f17048e69",
  "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b77a155b-9d77-454c-84c2-8b7d2fbe0ccb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b77a155b-9d77-454c-84c2-8b7d2fbe0ccb",
  "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
  "assignment_id": "ba3a7fc6-8b1f-4a16-b4c9-4b5f17048e69",
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

`POST /api/driver/v1/work-sessions/5bcefecc-0b37-4b0c-a70b-d827d55b79cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:19Z",
    "sequence": 1793194279405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:31:19.423859Z",
  "last_location_at": "2026-10-28T13:31:19.423859Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b77a155b-9d77-454c-84c2-8b7d2fbe0ccb/arrive` → **200**

```json
{
  "command_id": "e4c6458b-a608-446c-82ed-4343072898f7",
  "expected_version": 0
}
```

```json
{
  "id": "b77a155b-9d77-454c-84c2-8b7d2fbe0ccb",
  "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
  "assignment_id": "ba3a7fc6-8b1f-4a16-b4c9-4b5f17048e69",
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
  "arrived_at": "2026-10-28T13:31:19.697065Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b77a155b-9d77-454c-84c2-8b7d2fbe0ccb/start` → **200**

```json
{
  "command_id": "5d5898a0-1c75-4848-bc2d-6a08c5ebc667",
  "expected_version": 1
}
```

```json
{
  "id": "b77a155b-9d77-454c-84c2-8b7d2fbe0ccb",
  "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
  "assignment_id": "ba3a7fc6-8b1f-4a16-b4c9-4b5f17048e69",
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
  "arrived_at": "2026-10-28T13:31:19.697065Z",
  "started_at": "2026-10-28T13:31:19.979461Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/5bcefecc-0b37-4b0c-a70b-d827d55b79cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:20Z",
    "sequence": 1793194280246
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:31:20.264588Z",
  "last_location_at": "2026-10-28T13:31:20.264588Z",
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
  "device_ref": "sandbox-1796"
}
```

```json
{
  "challenge_id": "4d0760b4-9282-462d-8141-6d626fcbe2f1",
  "expires_at": "2026-10-28T13:36:20.534481603Z",
  "resend_available_at": "2026-10-28T13:31:21.534481603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "642053",
  "sent_at": "2026-10-28T13:31:20.536875206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d0760b4-9282-462d-8141-6d626fcbe2f1",
  "code": "642053",
  "device_ref": "sandbox-1796"
}
```

```json
{
  "session_id": "aacf4d1c-cf2b-488b-a96f-0098b8c76ff8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTE4MCwiaWF0IjoxNzkzMTk0MjgwLCJqdGkiOiJhOTQ2MGE5MC01MTAyLTQ3MDYtODBiNi00NTk0MWIzZmQ2MjAiLCJzaWQiOiJhYWNmNGQxYy1jZjJiLTQ4OGItYTk2Zi0wMDk4YjhjNzZmZjgifQ.hnRSRIJ6EHhfEh9KlkyO3CL4NL1Ks5N77UefF8zKeFQ",
  "access_expires_at": "2026-10-28T13:46:20.830311862Z",
  "refresh_token": "nezuL_hZNq1R6AZD7PCkBZRWvPKSVjApO21Mm0Z9_AY",
  "refresh_expires_at": "2026-11-27T13:31:20.829754654Z",
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
  "command_id": "797b7972-be04-4e5b-a9d3-b1c4bad22cba",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:21Z",
    "sequence": 1793194281358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19c14d2b-cace-4155-a7d6-4b72e71c809f",
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
  "last_heartbeat_at": "2026-10-28T13:31:21.376391Z",
  "last_location_at": "2026-10-28T13:31:21.376391Z",
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
  "session_id": "c69fa767-6aef-47ae-9ad7-c04612313653",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxODEsImlhdCI6MTc5MzE5NDI4MSwianRpIjoiZmJjZTFmNTUtNDMwNS00MTQ1LWEzYTMtMTdkYzU3Y2RhNjUyIiwic2lkIjoiYzY5ZmE3NjctNmFlZi00N2FlLTlhZDctYzA0NjEyMzEzNjUzIn0.aMZdt9b5-YGS1KTNBswv43ouZ39r6GEnr8OHrCdNs5o",
  "access_expires_at": "2026-10-28T13:46:21.936717411Z",
  "refresh_token": "5GSw1wEHTdjjvv8e7Gsn9WqPNODeb251J2tzBy4c35c",
  "refresh_expires_at": "2026-10-29T01:31:21.936133843Z",
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
  "session_id": "bb9701c5-0f9a-4552-a0a8-7596d70acf26",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxODIsImlhdCI6MTc5MzE5NDI4MiwianRpIjoiY2EwMTM0ZGMtOTcyMi00OTNiLTgyM2YtZDgwZDU2ODlmNmZiIiwic2lkIjoiYmI5NzAxYzUtMGY5YS00NTUyLWEwYTgtNzU5NmQ3MGFjZjI2In0._e0pm29wVG4oNi-7Tkg0JxQnrKdYd2DLxMwtke5e0AU",
  "access_expires_at": "2026-10-28T13:46:22.487070742Z",
  "refresh_token": "NpKc-uua5lsDHNUIjbtcyrbwzFCeKvG6Yu5TFnhuNcc",
  "refresh_expires_at": "2026-10-29T01:31:22.48652218Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9` → **200**

```json
{
  "id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "645f1ec3-97f1-4ada-849a-6cb4dda9759d",
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
    "id": "ba3a7fc6-8b1f-4a16-b4c9-4b5f17048e69",
    "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b77a155b-9d77-454c-84c2-8b7d2fbe0ccb",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T13:31:18.306586Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9/interrupt` → **200**

```json
{
  "command_id": "10d29c27-ae18-482f-942e-09a878825bc8",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "645f1ec3-97f1-4ada-849a-6cb4dda9759d",
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
      "id": "ba3a7fc6-8b1f-4a16-b4c9-4b5f17048e69",
      "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b77a155b-9d77-454c-84c2-8b7d2fbe0ccb",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T13:31:18.306586Z",
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
    "id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "645f1ec3-97f1-4ada-849a-6cb4dda9759d",
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
    "id": "dbb4ef2d-5565-44ea-9323-f7488d9ee08d",
    "order_id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
    "expires_at": "2026-10-28T13:31:38.049683Z",
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

`POST /api/driver/v1/offers/dbb4ef2d-5565-44ea-9323-f7488d9ee08d/accept` → **200**

```json
{
  "command_id": "30bed63a-b7f0-444e-805c-02381d484bfd"
}
```

```json
{
  "id": "35cfc089-3feb-4bf8-9388-49385fa838d6",
  "order_id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e05ed9f-409d-458e-b1c2-0f15031de477",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e05ed9f-409d-458e-b1c2-0f15031de477",
  "order_id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
  "assignment_id": "35cfc089-3feb-4bf8-9388-49385fa838d6",
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
  "session_id": "19c14d2b-cace-4155-a7d6-4b72e71c809f",
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
  "last_heartbeat_at": "2026-10-28T13:31:21.376391Z",
  "last_location_at": "2026-10-28T13:31:21.376391Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/19c14d2b-cace-4155-a7d6-4b72e71c809f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:24Z",
    "sequence": 1793194284460
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "19c14d2b-cace-4155-a7d6-4b72e71c809f",
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
  "last_heartbeat_at": "2026-10-28T13:31:24.479466Z",
  "last_location_at": "2026-10-28T13:31:24.479466Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9e05ed9f-409d-458e-b1c2-0f15031de477/arrive` → **200**

```json
{
  "command_id": "6264d768-8d3b-4a3c-bc9c-ec93f59a8519",
  "expected_version": 0
}
```

```json
{
  "id": "9e05ed9f-409d-458e-b1c2-0f15031de477",
  "order_id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
  "assignment_id": "35cfc089-3feb-4bf8-9388-49385fa838d6",
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
  "arrived_at": "2026-10-28T13:31:24.764016Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e05ed9f-409d-458e-b1c2-0f15031de477/start` → **200**

```json
{
  "command_id": "4a8aa649-35fe-4d80-ba16-e02b143c199e",
  "expected_version": 1
}
```

```json
{
  "id": "9e05ed9f-409d-458e-b1c2-0f15031de477",
  "order_id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
  "assignment_id": "35cfc089-3feb-4bf8-9388-49385fa838d6",
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
  "arrived_at": "2026-10-28T13:31:24.764016Z",
  "started_at": "2026-10-28T13:31:25.065311Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e05ed9f-409d-458e-b1c2-0f15031de477/complete` → **200**

```json
{
  "command_id": "19e79783-42f7-4367-9095-8920c094b78c",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:31:25Z"
}
```

```json
{
  "id": "9e05ed9f-409d-458e-b1c2-0f15031de477",
  "order_id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
  "assignment_id": "35cfc089-3feb-4bf8-9388-49385fa838d6",
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
  "arrived_at": "2026-10-28T13:31:24.764016Z",
  "started_at": "2026-10-28T13:31:25.065311Z",
  "completed_at": "2026-10-28T13:31:25.368159Z",
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
    "id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:31:23.040458Z",
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
    "id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:31:18.306586Z",
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

`GET /api/operator/v1/orders/62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:31:18.307064Z",
      "actor": {
        "type": "CLIENT",
        "id": "645f1ec3-97f1-4ada-849a-6cb4dda9759d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
        "quote_id": "18773719-51b4-4de9-b01f-e8e6a25fe4a3",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "d59bfb9e-0cf3-464b-bc6a-c72746165986"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:31:18.308613Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
        "attempt_id": "636d57a1-23d4-42de-a0a1-935e9a4ad090",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d59bfb9e-0cf3-464b-bc6a-c72746165986"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:31:18.311392Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "eca3d398-c137-4777-a6b8-35ca3ced806e",
        "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "d59bfb9e-0cf3-464b-bc6a-c72746165986"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:31:18.894489Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "eca3d398-c137-4777-a6b8-35ca3ced806e",
        "order_id": "62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ba3a7fc6-8b1f-4a16-b4c9-4b5f17048e69"
      },
      "correlation_id": "cbcb20af-3cc3-469b-9d7e-cedb1066a4f7"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/3b913873-f8e1-4dd3-9e8a-a955435a703d/tip` → **200**

```json
{
  "order_id": "3b913873-f8e1-4dd3-9e8a-a955435a703d",
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
  "available_until": "2026-10-29T13:31:25.368159Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/3b913873-f8e1-4dd3-9e8a-a955435a703d/tip` → **409**

```json
{
  "command_id": "f4ee9fbc-cc14-4959-824e-17915cc3beef",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/3b913873-f8e1-4dd3-9e8a-a955435a703d/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9e426493-cd1d-43c8-b786-efddf6076784"
}
```

Done: interrupted 62f74cdf-a442-4fa3-ba51-1f7b9b92e4a9, follow-up 3b913873-f8e1-4dd3-9e8a-a955435a703d.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bcefecc-0b37-4b0c-a70b-d827d55b79cd",
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
  "last_heartbeat_at": "2026-10-28T13:31:20.264588Z",
  "last_location_at": "2026-10-28T13:31:20.264588Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5bcefecc-0b37-4b0c-a70b-d827d55b79cd/close` → **200**

```json
{
  "command_id": "0c92aaeb-e699-4f68-a6f4-cce57e595d5a",
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
  "session_id": "19c14d2b-cace-4155-a7d6-4b72e71c809f",
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
  "last_heartbeat_at": "2026-10-28T13:31:24.479466Z",
  "last_location_at": "2026-10-28T13:31:24.479466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19c14d2b-cace-4155-a7d6-4b72e71c809f/close` → **200**

```json
{
  "command_id": "7961698c-3dd3-4a5d-8f80-4241d74e87ff",
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
  "session_id": "246c8564-2a77-42c8-a26c-dfc881a70965",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUxOTEsImlhdCI6MTc5MzE5NDI5MSwianRpIjoiNjk4MTQzMDUtZDlmYS00ODg1LTk4NzYtMGIyNDFjYjMxYmIxIiwic2lkIjoiMjQ2Yzg1NjQtMmE3Ny00MmM4LWEyNmMtZGZjODgxYTcwOTY1In0.Vi3dWMjDrgAoNVEbXwxa4u1JkdvZyFpDDotT5-jglcQ",
  "access_expires_at": "2026-10-28T13:46:31.429845358Z",
  "refresh_token": "yukXwlOdflORlEeK4j-NLKQ3IAdxBCJQiixYO6Y7x-8",
  "refresh_expires_at": "2026-10-29T01:31:31.429353241Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "eb1ae980-907c-4473-8c32-a130a081bdf7",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:31:31Z"
}
```

```json
{
  "id": "185facb0-2dda-410a-ab1d-b0f172d18de0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:31:31Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/185facb0-2dda-410a-ab1d-b0f172d18de0/publish` → **200**

```json
{
  "command_id": "affb14df-05b4-4266-a90a-703b78c3ed8f",
  "expected_version": 0
}
```

```json
{
  "id": "185facb0-2dda-410a-ab1d-b0f172d18de0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:31:31.997372Z",
  "published_at": "2026-10-28T13:31:31.997372Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "185facb0-2dda-410a-ab1d-b0f172d18de0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T13:31:31.997372Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636030553",
  "device_ref": "sandbox-21012"
}
```

```json
{
  "challenge_id": "f5fcdfe0-cfad-446c-acc3-a31d1f422d2a",
  "expires_at": "2026-10-28T13:36:32.535617249Z",
  "resend_available_at": "2026-10-28T13:31:33.535617249Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636030553` → **200**

```json
{
  "phone": "+380636030553",
  "audience": "CLIENT",
  "code": "590524",
  "sent_at": "2026-10-28T13:31:32.538480182Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5fcdfe0-cfad-446c-acc3-a31d1f422d2a",
  "code": "590524",
  "device_ref": "sandbox-21012"
}
```

```json
{
  "session_id": "04e227cb-91a1-44f6-a858-d2ba129d8566",
  "subject": {
    "type": "CLIENT",
    "id": "809847e5-f7c3-41f8-b185-1c48126bc444"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MDk4NDdlNS1mN2MzLTQxZjgtYjE4NS0xYzQ4MTI2YmM0NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTkyLCJpYXQiOjE3OTMxOTQyOTIsImp0aSI6ImU3NDU1ZDkxLTU0MDctNGM5My1hMjY3LWM2ZGIxZjk3MDU0NSIsInNpZCI6IjA0ZTIyN2NiLTkxYTEtNDRmNi1hODU4LWQyYmExMjlkODU2NiJ9.V28fFl3KsJ5H8IWjUZ1WVjy4LAJKb3yNGc9BGh30SN8",
  "access_expires_at": "2026-10-28T13:46:32.825102017Z",
  "refresh_token": "6MHAlKR_t9t5CiDirq8O7RER1k3nhRW4T22Czhzr450",
  "refresh_expires_at": "2026-11-27T13:31:32.824527136Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "185facb0-2dda-410a-ab1d-b0f172d18de0",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T13:31:31.997372Z",
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
  "command_id": "6d27948a-fdb4-4979-b059-d1701fdd221a",
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
  "id": "460b9066-8af8-4f7a-9faf-d4608f9363ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:33.358296Z",
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
  "command_id": "a52df8ad-4e2e-4c1c-b4b3-6e0708b0dea1",
  "quote_id": "460b9066-8af8-4f7a-9faf-d4608f9363ab",
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
  "correlation_id": "555f36cb-586d-48fd-9a41-aec78f542195"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "84c8517f-d585-4396-b740-e404cf3ef093",
  "version_id": "185facb0-2dda-410a-ab1d-b0f172d18de0",
  "language": "uk"
}
```

```json
{
  "version_id": "185facb0-2dda-410a-ab1d-b0f172d18de0",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T13:31:33.912812Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b67be14-460f-46d5-bd08-90a824c14c16",
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
  "id": "ee91f78c-6ddd-4619-94ed-9a211850552c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:34.210307Z",
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
  "command_id": "5e705fea-f7dd-44ad-955b-0784cf58c2c4",
  "quote_id": "ee91f78c-6ddd-4619-94ed-9a211850552c",
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
  "id": "ee1212de-0e64-452a-97ae-1f8881338c98",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "809847e5-f7c3-41f8-b185-1c48126bc444",
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
  "created_at": "2026-10-28T13:31:34.484864Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ee1212de-0e64-452a-97ae-1f8881338c98` → **200**

```json
{
  "id": "ee1212de-0e64-452a-97ae-1f8881338c98",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "809847e5-f7c3-41f8-b185-1c48126bc444",
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
  "created_at": "2026-10-28T13:31:34.484864Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ee1212de-0e64-452a-97ae-1f8881338c98/cancel` → **200**

```json
{
  "command_id": "474da1b2-99d5-4fc5-83c0-8d703487f489",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ee1212de-0e64-452a-97ae-1f8881338c98",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "809847e5-f7c3-41f8-b185-1c48126bc444",
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
  "created_at": "2026-10-28T13:31:34.484864Z",
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

`POST /api/admin/v1/legal-documents/185facb0-2dda-410a-ab1d-b0f172d18de0` → **409**

```json
{
  "command_id": "6dc8e4c7-3c65-496e-a8bf-4f8dd1342a2d",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:31:35Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/185facb0-2dda-410a-ab1d-b0f172d18de0",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "17edc49b-2c41-4b9d-a81c-dfd751477bdd"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9d43519b-ed2d-441a-a6cf-7be11e95fca7",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:31:35Z"
}
```

```json
{
  "id": "699c24d0-6dcc-4e3f-a317-9b8690bd957d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:31:35Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/699c24d0-6dcc-4e3f-a317-9b8690bd957d/publish` → **200**

```json
{
  "command_id": "6978b075-920a-490e-933b-db740ef4dce2",
  "expected_version": 0
}
```

```json
{
  "id": "699c24d0-6dcc-4e3f-a317-9b8690bd957d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:31:35.891264Z",
  "published_at": "2026-10-28T13:31:35.891264Z",
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
  "device_ref": "sandbox-16036"
}
```

```json
{
  "challenge_id": "9840aacb-7ae1-4f89-ac87-3715e6eb7356",
  "expires_at": "2026-10-28T13:36:36.163793913Z",
  "resend_available_at": "2026-10-28T13:31:37.163793913Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "986835",
  "sent_at": "2026-10-28T13:31:36.166040486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9840aacb-7ae1-4f89-ac87-3715e6eb7356",
  "code": "986835",
  "device_ref": "sandbox-16036"
}
```

```json
{
  "session_id": "f0c8383a-2fe3-47a1-bfb7-7a9e75089d3e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTE5NiwiaWF0IjoxNzkzMTk0Mjk2LCJqdGkiOiJlOGM4MmFlNS1hODNiLTQzMTQtYTE2ZS1iMTEzNDJlMGI5OTAiLCJzaWQiOiJmMGM4MzgzYS0yZmUzLTQ3YTEtYmZiNy03YTllNzUwODlkM2UifQ.Vc1uN0aoR0lp8er8H_g6FxSwTNKSuocpAncnnLrS3NI",
  "access_expires_at": "2026-10-28T13:46:36.460033993Z",
  "refresh_token": "HbmTdGLcs5xT5KmJFpkTIw9FqN_7pY7z2s70jUrFCKk",
  "refresh_expires_at": "2026-11-27T13:31:36.459493106Z",
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
  "command_id": "c054c556-419c-4aca-bc5a-41c5823d6401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:36Z",
    "sequence": 1793194296987
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1ee75bd7-784e-4389-b790-a34febc56add",
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
  "last_heartbeat_at": "2026-10-28T13:31:37.005298Z",
  "last_location_at": "2026-10-28T13:31:37.005298Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675525135",
  "device_ref": "sandbox-14305"
}
```

```json
{
  "challenge_id": "193a68b5-2fd6-4e22-ac99-fe38f9825b1b",
  "expires_at": "2026-10-28T13:36:37.280747239Z",
  "resend_available_at": "2026-10-28T13:31:38.280747239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675525135` → **200**

```json
{
  "phone": "+380675525135",
  "audience": "CLIENT",
  "code": "613115",
  "sent_at": "2026-10-28T13:31:37.282961417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "193a68b5-2fd6-4e22-ac99-fe38f9825b1b",
  "code": "613115",
  "device_ref": "sandbox-14305"
}
```

```json
{
  "session_id": "c7ee7039-6993-4f81-bdf2-280182417e5e",
  "subject": {
    "type": "CLIENT",
    "id": "561ec2b1-4e11-4d2b-94d4-52a18823d323"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NjFlYzJiMS00ZTExLTRkMmItOTRkNC01MmExODgyM2QzMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MTk3LCJpYXQiOjE3OTMxOTQyOTcsImp0aSI6ImRlMTljNTcxLTE5YzEtNDc1MC1iOGMwLWMxNTc5Mzc1OWIxNCIsInNpZCI6ImM3ZWU3MDM5LTY5OTMtNGY4MS1iZGYyLTI4MDE4MjQxN2U1ZSJ9.yE9khBnPDumNWus6sBfIakkKD9QvnpDTaErpIDrlGjU",
  "access_expires_at": "2026-10-28T13:46:37.568548096Z",
  "refresh_token": "IC3-uNjA7quU7b7IQ0qBt57ep692MQMV_lv1Odmgn2A",
  "refresh_expires_at": "2026-11-27T13:31:37.567927172Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "54cd9f74-d661-4346-9765-7f8015e4cc7b",
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
  "id": "f7967d1d-d670-466e-aa01-ac89f30bed32",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:37.835824Z",
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
  "command_id": "30ef1b02-afe0-4337-a10a-7fef0aa4c994",
  "quote_id": "f7967d1d-d670-466e-aa01-ac89f30bed32",
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
    "phone": "+380679484974"
  }
}
```

```json
{
  "id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
  "created_at": "2026-10-28T13:31:38.117534Z",
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
    "id": "6197ea8a-9d16-45be-aba4-7fda9d59ef7a",
    "order_id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
    "expires_at": "2026-10-28T13:31:53.120648Z",
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

`POST /api/driver/v1/offers/6197ea8a-9d16-45be-aba4-7fda9d59ef7a/accept` → **200**

```json
{
  "command_id": "4e87cfea-7422-42ae-a5d0-926be4310079"
}
```

```json
{
  "id": "1738c717-2907-4f8e-8e04-419cb0d4b90f",
  "order_id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3721261-fb63-49d5-aad3-a72d52105782",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b3721261-fb63-49d5-aad3-a72d52105782",
  "order_id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
  "assignment_id": "1738c717-2907-4f8e-8e04-419cb0d4b90f",
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
    "phone": "+380679484974"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1a0cb00a-6888-4ce5-8c46-e0ca479e33a5",
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
  "id": "0f2a5f7f-e41b-4163-89a3-f4465f641ab1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:39.241775Z",
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
  "command_id": "c7740d02-c634-4899-8c96-5ee5757a0749",
  "quote_id": "0f2a5f7f-e41b-4163-89a3-f4465f641ab1",
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
  "id": "cbc04d3a-a730-4702-b32d-af17a128e059",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
  "created_at": "2026-10-28T13:31:39.51991Z",
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
  "command_id": "93cd1a62-3a2d-487a-ae35-ab948dd5771f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T16:31:39Z"
}
```

```json
{
  "id": "fd39c44a-b076-4076-a0aa-96ff5c34cff2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:39.851860Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:31:39Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0d5f2feb-198b-4f5d-b60d-57e2824e5c3f",
  "quote_id": "fd39c44a-b076-4076-a0aa-96ff5c34cff2",
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
  "pickup_at": "2026-10-28T16:31:39Z"
}
```

```json
{
  "id": "1e1fa3aa-6f8a-4447-9588-6735c413bc42",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
  "created_at": "2026-10-28T13:31:40.139833Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:31:39Z",
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
  "command_id": "a851a3a5-b4c3-4957-a6e0-f6c7659d40ca",
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
  "id": "eb65b56a-42f5-417f-b20f-c416c6cf893c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:40.436080Z",
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
  "command_id": "016f8f0d-7146-43a8-8a67-1834a6b965be",
  "quote_id": "eb65b56a-42f5-417f-b20f-c416c6cf893c",
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
  "correlation_id": "de6c88ca-3489-485a-9694-9f28c33930c4"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "1e1fa3aa-6f8a-4447-9588-6735c413bc42",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
      "created_at": "2026-10-28T13:31:40.139833Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T16:31:39Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "cbc04d3a-a730-4702-b32d-af17a128e059",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
      "created_at": "2026-10-28T13:31:39.51991Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "cbc04d3a-a730-4702-b32d-af17a128e059",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
  "created_at": "2026-10-28T13:31:39.51991Z",
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

`GET /api/rider/v1/orders/ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab` → **200**

```json
{
  "id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
    "id": "1738c717-2907-4f8e-8e04-419cb0d4b90f",
    "order_id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b3721261-fb63-49d5-aad3-a72d52105782",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:31:38.117534Z",
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
    "location_at": "2026-10-28T13:31:37.005298Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab/cancel` → **200**

```json
{
  "command_id": "6154aa2f-f536-42e3-828f-016418bda2b1",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
    "id": "1738c717-2907-4f8e-8e04-419cb0d4b90f",
    "order_id": "ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b3721261-fb63-49d5-aad3-a72d52105782",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:31:38.117534Z",
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

`GET /api/rider/v1/orders/cbc04d3a-a730-4702-b32d-af17a128e059` → **200**

```json
{
  "id": "cbc04d3a-a730-4702-b32d-af17a128e059",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
  "created_at": "2026-10-28T13:31:39.51991Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cbc04d3a-a730-4702-b32d-af17a128e059/cancel` → **200**

```json
{
  "command_id": "931e3221-1891-4718-b842-e4f34d9a5df8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cbc04d3a-a730-4702-b32d-af17a128e059",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
  "created_at": "2026-10-28T13:31:39.51991Z",
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

`GET /api/rider/v1/orders/1e1fa3aa-6f8a-4447-9588-6735c413bc42` → **200**

```json
{
  "id": "1e1fa3aa-6f8a-4447-9588-6735c413bc42",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
  "created_at": "2026-10-28T13:31:40.139833Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:31:39Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1e1fa3aa-6f8a-4447-9588-6735c413bc42/cancel` → **200**

```json
{
  "command_id": "29b2cbe5-db47-487e-82b8-96a44da0fb1c",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1e1fa3aa-6f8a-4447-9588-6735c413bc42",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "561ec2b1-4e11-4d2b-94d4-52a18823d323",
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
  "created_at": "2026-10-28T13:31:40.139833Z",
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
  "pickup_at": "2026-10-28T16:31:39Z",
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
  "session_id": "1ee75bd7-784e-4389-b790-a34febc56add",
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
  "last_heartbeat_at": "2026-10-28T13:31:37.005298Z",
  "last_location_at": "2026-10-28T13:31:37.005298Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ee75bd7-784e-4389-b790-a34febc56add/close` → **200**

```json
{
  "command_id": "57bb4383-3190-42b3-bfb7-5621d480d9cf",
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

Done: orders ba59a60d-375c-4259-9ef0-0f8d8c3ef4ab, cbc04d3a-a730-4702-b32d-af17a128e059, 1e1fa3aa-6f8a-4447-9588-6735c413bc42.

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
  "session_id": "11a61c28-0717-4cde-8cc6-97296dae4a18",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyMDQsImlhdCI6MTc5MzE5NDMwNCwianRpIjoiNzk0NDI0NTctYjY2NS00NzE5LThiOTYtNmU2N2YwMTliYTEzIiwic2lkIjoiMTFhNjFjMjgtMDcxNy00Y2RlLThjYzYtOTcyOTZkYWU0YTE4In0.f9TsyHmDJaQq2HIT3Gm9OBgiU9LQvGUd2HFWrdvf9W8",
  "access_expires_at": "2026-10-28T13:46:44.087676749Z",
  "refresh_token": "xOLWV464U8u5vfk35FqiV353mvPXeESaVklTM2B3hsI",
  "refresh_expires_at": "2026-10-29T01:31:44.086870577Z",
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
  "session_id": "939aa490-6ae3-4047-b7ba-f0e3dace96fb",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyMDQsImlhdCI6MTc5MzE5NDMwNCwianRpIjoiODZlNzhmNGYtZTE3NC00ODg1LWIyZWQtZjBlMDZiZjU4MjRkIiwic2lkIjoiOTM5YWE0OTAtNmFlMy00MDQ3LWI3YmEtZjBlM2RhY2U5NmZiIn0.wSh20OoBYszJhrsehGhBUk-8el9GrajyEb9R6rweyNs",
  "access_expires_at": "2026-10-28T13:46:44.669399435Z",
  "refresh_token": "G4yUvd86ei2-SxUoZsk9oCnR_jBZv6do_T4x1b1qv8Y",
  "refresh_expires_at": "2026-10-29T01:31:44.668809656Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15814"
}
```

```json
{
  "challenge_id": "581d4c63-cec5-46b2-9118-c73db4d5ee53",
  "expires_at": "2026-10-28T13:36:44.931557293Z",
  "resend_available_at": "2026-10-28T13:31:45.931557293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "416366",
  "sent_at": "2026-10-28T13:31:44.934455192Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "581d4c63-cec5-46b2-9118-c73db4d5ee53",
  "code": "416366",
  "device_ref": "sandbox-15814"
}
```

```json
{
  "session_id": "96e361f8-79b1-410e-8428-8f945efbf8a6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTIwNSwiaWF0IjoxNzkzMTk0MzA1LCJqdGkiOiI0OWY5NzY4Ni02YTI5LTQ0MTEtYmZjZi01M2RjYTFlMjk3YzEiLCJzaWQiOiI5NmUzNjFmOC03OWIxLTQxMGUtODQyOC04Zjk0NWVmYmY4YTYifQ.vpsQ76NEJsec9o-cFrPduB4CF3pKqvt27Zcv0EM99qE",
  "access_expires_at": "2026-10-28T13:46:45.219634157Z",
  "refresh_token": "cokq5gdP0cOlXvfxP83qqnWY-iL0uIHeuoT415rAmgg",
  "refresh_expires_at": "2026-11-27T13:31:45.219073214Z",
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
  "command_id": "b1ae317e-ffe5-4fbc-a30f-3dd0777fea76",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:45Z",
    "sequence": 1793194305745
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e8be4da0-1c25-485a-8281-1973222c163c",
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
  "last_heartbeat_at": "2026-10-28T13:31:45.763376Z",
  "last_location_at": "2026-10-28T13:31:45.763376Z",
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
  "command_id": "d7f012b4-48f4-4cb7-b58e-7dfbd257c69f",
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
  "effective_at": "2026-10-28T13:31:46.322063Z",
  "changed_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T13:29:13.050167Z",
  "last_entries": [
    {
      "order_id": "b198d373-494b-4619-8424-159c91d604fb",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T13:29:13.050167Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1718a001-0d69-434b-8706-d27ee2eff640",
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
  "id": "0de3d738-06c4-4d14-90b6-7272485e4b57",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:46.857209Z",
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
  "command_id": "1c3164b6-fb41-4e8e-9a4c-56304d71115f",
  "quote_id": "0de3d738-06c4-4d14-90b6-7272485e4b57",
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
    "phone": "+3806711127076"
  }
}
```

```json
{
  "id": "b667f12b-51ef-46f4-ab02-ab2c24214a34",
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
  "created_at": "2026-10-28T13:31:47.135529Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127076"
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
    "id": "424901d8-64c3-47df-aa28-d3b50f5d2a78",
    "order_id": "b667f12b-51ef-46f4-ab02-ab2c24214a34",
    "expires_at": "2026-10-28T13:32:02.138846Z",
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

`POST /api/driver/v1/offers/424901d8-64c3-47df-aa28-d3b50f5d2a78/accept` → **200**

```json
{
  "command_id": "38de3bb7-4067-4074-9eb9-185d072ef5b0"
}
```

```json
{
  "id": "c7d947ac-b437-4d16-b1e0-27ffdb500674",
  "order_id": "b667f12b-51ef-46f4-ab02-ab2c24214a34",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e1ee17b-a31c-4a57-b6c6-2521acbfbc08",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e1ee17b-a31c-4a57-b6c6-2521acbfbc08",
  "order_id": "b667f12b-51ef-46f4-ab02-ab2c24214a34",
  "assignment_id": "c7d947ac-b437-4d16-b1e0-27ffdb500674",
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
    "phone": "+3806711127076"
  }
}
```

`POST /api/driver/v1/work-sessions/e8be4da0-1c25-485a-8281-1973222c163c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:31:48Z",
    "sequence": 1793194308219
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e8be4da0-1c25-485a-8281-1973222c163c",
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
  "last_heartbeat_at": "2026-10-28T13:31:48.237127Z",
  "last_location_at": "2026-10-28T13:31:48.237127Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9e1ee17b-a31c-4a57-b6c6-2521acbfbc08/arrive` → **200**

```json
{
  "command_id": "7331a0b4-a731-4b83-98d3-0a7e224e9753",
  "expected_version": 0
}
```

```json
{
  "id": "9e1ee17b-a31c-4a57-b6c6-2521acbfbc08",
  "order_id": "b667f12b-51ef-46f4-ab02-ab2c24214a34",
  "assignment_id": "c7d947ac-b437-4d16-b1e0-27ffdb500674",
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
  "arrived_at": "2026-10-28T13:31:48.515534Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127076"
  }
}
```

`POST /api/driver/v1/trips/9e1ee17b-a31c-4a57-b6c6-2521acbfbc08/start` → **200**

```json
{
  "command_id": "c909797d-f922-4a90-9946-8a5184062da6",
  "expected_version": 1
}
```

```json
{
  "id": "9e1ee17b-a31c-4a57-b6c6-2521acbfbc08",
  "order_id": "b667f12b-51ef-46f4-ab02-ab2c24214a34",
  "assignment_id": "c7d947ac-b437-4d16-b1e0-27ffdb500674",
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
  "arrived_at": "2026-10-28T13:31:48.515534Z",
  "started_at": "2026-10-28T13:31:48.808268Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127076"
  }
}
```

`POST /api/driver/v1/trips/9e1ee17b-a31c-4a57-b6c6-2521acbfbc08/complete` → **200**

```json
{
  "command_id": "65df2b3b-a013-47c0-b952-fee9a46522a1",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:31:49Z",
  "cash_received": true
}
```

```json
{
  "id": "9e1ee17b-a31c-4a57-b6c6-2521acbfbc08",
  "order_id": "b667f12b-51ef-46f4-ab02-ab2c24214a34",
  "assignment_id": "c7d947ac-b437-4d16-b1e0-27ffdb500674",
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
  "arrived_at": "2026-10-28T13:31:48.515534Z",
  "started_at": "2026-10-28T13:31:48.808268Z",
  "completed_at": "2026-10-28T13:31:49.092047Z",
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
  "command_id": "b9f60df4-7acb-43da-9f12-7499c06c00d2",
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
  "id": "3980f65e-6915-4104-88c1-ddaec1e36205",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:49.396287Z",
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
  "command_id": "b863cd72-48a7-40b2-97d5-31619a934271",
  "quote_id": "3980f65e-6915-4104-88c1-ddaec1e36205",
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
    "phone": "+380671117506"
  }
}
```

```json
{
  "id": "efb49aa1-13c7-4f1c-bc61-b2f33c251eba",
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
  "created_at": "2026-10-28T13:31:49.690354Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117506"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/efb49aa1-13c7-4f1c-bc61-b2f33c251eba` → **200**

```json
{
  "id": "efb49aa1-13c7-4f1c-bc61-b2f33c251eba",
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
  "created_at": "2026-10-28T13:31:49.690354Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117506"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/efb49aa1-13c7-4f1c-bc61-b2f33c251eba/cancel` → **200**

```json
{
  "command_id": "cea82eff-7ca0-4baa-957f-7a1fca6c743d",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "efb49aa1-13c7-4f1c-bc61-b2f33c251eba",
  "short_number": 18,
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
  "created_at": "2026-10-28T13:31:49.690354Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117506"
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
  "staff_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T13:29:13.050167Z",
  "last_entries": [
    {
      "order_id": "efb49aa1-13c7-4f1c-bc61-b2f33c251eba",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T13:31:50.278252Z"
    },
    {
      "order_id": "b667f12b-51ef-46f4-ab02-ab2c24214a34",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T13:31:49.097127Z"
    },
    {
      "order_id": "b198d373-494b-4619-8424-159c91d604fb",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T13:29:13.050167Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e8be4da0-1c25-485a-8281-1973222c163c",
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
  "last_heartbeat_at": "2026-10-28T13:31:48.237127Z",
  "last_location_at": "2026-10-28T13:31:48.237127Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e8be4da0-1c25-485a-8281-1973222c163c/close` → **200**

```json
{
  "command_id": "c936ace8-22ec-4699-8c49-68e40848aaa5",
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

Done: operator bonus for fulfilled b667f12b-51ef-46f4-ab02-ab2c24214a34 and operator-fault cancellation efb49aa1-13c7-4f1c-bc61-b2f33c251eba.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671861560",
  "device_ref": "sandbox-12766"
}
```

```json
{
  "challenge_id": "8a78ebbe-1d9e-4a43-9573-b286a84f1ab9",
  "expires_at": "2026-10-28T13:36:53.409402368Z",
  "resend_available_at": "2026-10-28T13:31:54.409402368Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671861560` → **200**

```json
{
  "phone": "+380671861560",
  "audience": "CLIENT",
  "code": "849564",
  "sent_at": "2026-10-28T13:31:53.412125935Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673438626",
  "device_ref": "sandbox-28010",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "5a34bc0f-9680-4164-bf86-b565ba35d9eb",
  "expires_at": "2026-10-28T13:36:53.698769859Z",
  "resend_available_at": "2026-10-28T13:31:54.698769859Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673438626` → **200**

```json
{
  "phone": "+380673438626",
  "audience": "CLIENT",
  "code": "563655",
  "sent_at": "2026-10-28T13:31:53.700819778Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670550000",
  "device_ref": "sandbox-23706"
}
```

```json
{
  "challenge_id": "ce14f874-808f-42b2-b681-a34aca103ce2",
  "expires_at": "2026-10-28T13:36:53.993080715Z",
  "resend_available_at": "2026-10-28T13:31:54.993080715Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670550000` → **200**

```json
{
  "phone": "+380670550000",
  "audience": "CLIENT",
  "code": "774108",
  "sent_at": "2026-10-28T13:31:53.995608925Z",
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
  "session_id": "c8dc2546-fdb4-4427-83f5-f4b19290c65c",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyMTQsImlhdCI6MTc5MzE5NDMxNCwianRpIjoiOTAyYzVhOTItYzU1My00Njc5LWIzMDItZjE4MTI0MmVjMmEzIiwic2lkIjoiYzhkYzI1NDYtZmRiNC00NDI3LTgzZjUtZjRiMTkyOTBjNjVjIn0.GSKnxPigghw4BVnqngTxx3u6pdH8hVUIKkCvUR32X2A",
  "access_expires_at": "2026-10-28T13:46:54.585382004Z",
  "refresh_token": "4BdRgedzQJBP-NPFbrWx772wPc5y_mk8WQhxrVyEhtM",
  "refresh_expires_at": "2026-10-29T01:31:54.584775554Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670550000` → **200**

```json
{
  "deliveries": [
    {
      "id": "d0bb8e1e-e5e9-417d-b190-e3468e1b4b7e",
      "challenge_id": "ce14f874-808f-42b2-b681-a34aca103ce2",
      "phone": "+380670550000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a2d1b157-b775-4164-b875-9ce5e1ef7335",
      "error": null,
      "attempted_at": "2026-10-28T13:31:53.995823Z"
    },
    {
      "id": "c2e77204-7e25-4b88-98a7-89672535e570",
      "challenge_id": "ce14f874-808f-42b2-b681-a34aca103ce2",
      "phone": "+380670550000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T13:31:53.995126Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670550000` → **200**

```json
{
  "phone": "+380670550000",
  "audience": "CLIENT",
  "code": "774108",
  "sent_at": "2026-10-28T13:31:53.995608925Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673438626` → **200**

```json
{
  "deliveries": [
    {
      "id": "60ced926-9e18-4104-82f3-56a5e02294ce",
      "challenge_id": "5a34bc0f-9680-4164-bf86-b565ba35d9eb",
      "phone": "+380673438626",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3f0c0c39-6642-41f2-821c-53f4a75e4937",
      "error": null,
      "attempted_at": "2026-10-28T13:31:53.701076Z"
    }
  ]
}
```

Done: SMS to +380671861560, a call to +380673438626, SMS then a call to +380670550000.

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
  "session_id": "8cbef1fc-bf1c-499c-98b4-8d77cef685c5",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyMTUsImlhdCI6MTc5MzE5NDMxNSwianRpIjoiMzZjM2EzZjgtZjUxZC00OTNhLTg4ZDktNTJlYmM0MWIyYjhjIiwic2lkIjoiOGNiZWYxZmMtYmYxYy00OTljLTk4YjQtOGQ3N2NlZjY4NWM1In0.yQnNgjnp09UEoZrcqvvGolb51TjzYSyaeyuisJIis5M",
  "access_expires_at": "2026-10-28T13:46:55.74005317Z",
  "refresh_token": "DpGUhTxkjETqHWdNr0y_wHzcJ2ZRfYeK9lM_l6UirFk",
  "refresh_expires_at": "2026-10-29T01:31:55.739399492Z",
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
  "session_id": "e907c87b-4d5e-49e3-9afc-6198dc0a6a54",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyMTYsImlhdCI6MTc5MzE5NDMxNiwianRpIjoiZmJjY2NiMzQtMWM1MS00ZWVhLWE4YmUtOWIxMmZhOTk5MzVjIiwic2lkIjoiZTkwN2M4N2ItNGQ1ZS00OWUzLTlhZmMtNjE5OGRjMGE2YTU0In0.-mGkX08TJHKY_2LwwL0r_Pn-Tvevgh5IaTN60EvsBs8",
  "access_expires_at": "2026-10-28T13:46:56.304002724Z",
  "refresh_token": "jMtV43ob0jpqK_AWYsIyM2d8A98cGq33bwj3RINDv5I",
  "refresh_expires_at": "2026-10-29T01:31:56.303379122Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
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

`POST /api/admin/v1/staff-extensions/e69abfd2-8f90-47d6-bb8a-1767bedade0a` → **200**

```json
{
  "command_id": "49429918-7cb3-4272-95e3-541daf1035d5",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "b0a26a18-8224-4a85-864d-7b65c41ae119",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:31:57.407272Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:31:57.407272Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0ddce58e-40d9-42a4-8f7c-8599fb71481c",
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
  "id": "2cea0a24-2ce9-4dad-82a4-09d5017e672b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:36:57.950702Z",
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
  "command_id": "fac56f25-8bde-4306-8fa6-4f48bdb51cca",
  "quote_id": "2cea0a24-2ce9-4dad-82a4-09d5017e672b",
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
    "phone": "+380671854386"
  }
}
```

```json
{
  "id": "070ef990-7ef5-48ed-8af2-e4b144d3b28f",
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
  "created_at": "2026-10-28T13:31:58.228318Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671854386"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/070ef990-7ef5-48ed-8af2-e4b144d3b28f/calls` → **201**

```json
{
  "command_id": "c1b5bd69-c0b6-4217-9089-f2fac1ae5bbd",
  "to": "CALLER"
}
```

```json
{
  "id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "order_ids": [
    "070ef990-7ef5-48ed-8af2-e4b144d3b28f"
  ],
  "started_at": "2026-10-28T13:31:58.538915Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/070ef990-7ef5-48ed-8af2-e4b144d3b28f/calls` → **201**

```json
{
  "command_id": "c1b5bd69-c0b6-4217-9089-f2fac1ae5bbd",
  "to": "CALLER"
}
```

```json
{
  "id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "order_ids": [
    "070ef990-7ef5-48ed-8af2-e4b144d3b28f"
  ],
  "started_at": "2026-10-28T13:31:58.538915Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671854386",
    "at": "2026-10-28T13:31:58.541344842Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.27264",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=070ef990-7ef5-48ed-8af2-e4b144d3b28f` → **200**

```json
{
  "calls": [
    {
      "id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [
        "070ef990-7ef5-48ed-8af2-e4b144d3b28f"
      ],
      "started_at": "2026-10-28T13:31:58.538915Z",
      "answered_at": "2026-10-28T13:31:59.168395Z",
      "ended_at": "2026-10-28T13:31:59.190076Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=070ef990-7ef5-48ed-8af2-e4b144d3b28f` → **200**

```json
{
  "calls": [
    {
      "id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [
        "070ef990-7ef5-48ed-8af2-e4b144d3b28f"
      ],
      "started_at": "2026-10-28T13:31:58.538915Z",
      "answered_at": "2026-10-28T13:31:59.168395Z",
      "ended_at": "2026-10-28T13:31:59.190076Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=070ef990-7ef5-48ed-8af2-e4b144d3b28f` → **200**

```json
{
  "calls": [
    {
      "id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [
        "070ef990-7ef5-48ed-8af2-e4b144d3b28f"
      ],
      "started_at": "2026-10-28T13:31:58.538915Z",
      "answered_at": "2026-10-28T13:31:59.168395Z",
      "ended_at": "2026-10-28T13:31:59.190076Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=070ef990-7ef5-48ed-8af2-e4b144d3b28f` → **200**

```json
{
  "calls": [
    {
      "id": "f92a3c65-c2eb-4542-bb7d-c72d3e1536ed",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "order_ids": [
        "070ef990-7ef5-48ed-8af2-e4b144d3b28f"
      ],
      "started_at": "2026-10-28T13:31:58.538915Z",
      "answered_at": "2026-10-28T13:31:59.168395Z",
      "ended_at": "2026-10-28T13:31:59.190076Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:32:04.458765Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/070ef990-7ef5-48ed-8af2-e4b144d3b28f` → **200**

```json
{
  "id": "070ef990-7ef5-48ed-8af2-e4b144d3b28f",
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
  "created_at": "2026-10-28T13:31:58.228318Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671854386"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/070ef990-7ef5-48ed-8af2-e4b144d3b28f/cancel` → **200**

```json
{
  "command_id": "088b3a70-48a7-45d2-a023-8ac9101957b6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "070ef990-7ef5-48ed-8af2-e4b144d3b28f",
  "short_number": 19,
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
  "created_at": "2026-10-28T13:31:58.228318Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671854386"
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
  "command_id": "c3ff6e0d-ad0b-42d3-92a8-e4731a057d52",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T13:32:06.933553Z",
  "extension": "101"
}
```

Done: outgoing call f92a3c65-c2eb-4542-bb7d-c72d3e1536ed from order 070ef990-7ef5-48ed-8af2-e4b144d3b28f, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637802449",
  "device_ref": "sandbox-1436"
}
```

```json
{
  "challenge_id": "b2722e61-d846-4fb8-bfd6-7e5d51e1d44f",
  "expires_at": "2026-10-28T13:37:07.213890197Z",
  "resend_available_at": "2026-10-28T13:32:08.213890197Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637802449` → **200**

```json
{
  "phone": "+380637802449",
  "audience": "CLIENT",
  "code": "299722",
  "sent_at": "2026-10-28T13:32:07.21630741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2722e61-d846-4fb8-bfd6-7e5d51e1d44f",
  "code": "299722",
  "device_ref": "sandbox-1436"
}
```

```json
{
  "session_id": "4176beae-9622-4767-b81f-9c124f7e4563",
  "subject": {
    "type": "CLIENT",
    "id": "ddcf6306-efb2-475e-ab46-0c69f0eff552"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGNmNjMwNi1lZmIyLTQ3NWUtYWI0Ni0wYzY5ZjBlZmY1NTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MjI3LCJpYXQiOjE3OTMxOTQzMjcsImp0aSI6IjNkNjY4NGJiLWVmYTYtNGUzZS04MWM1LTFhZWQ5NjA2NjY3ZCIsInNpZCI6IjQxNzZiZWFlLTk2MjItNDc2Ny1iODFmLTljMTI0ZjdlNDU2MyJ9.zpAlOQIQl_2BBeMA4OS-ETZORAs66cqEbWDoSiLh1tg",
  "access_expires_at": "2026-10-28T13:47:07.515056556Z",
  "refresh_token": "h4WqrYv_KJ2MCjGHQihdHKyaJxhiLIGYZaFL74cmKes",
  "refresh_expires_at": "2026-11-27T13:32:07.514412323Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ddcf6306-efb2-475e-ab46-0c69f0eff552",
  "session_id": "4176beae-9622-4767-b81f-9c124f7e4563",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637802449",
  "device_ref": "sandbox-15135"
}
```

```json
{
  "challenge_id": "c645f89a-8690-4419-8402-5d243c830776",
  "expires_at": "2026-10-28T13:37:10.058742461Z",
  "resend_available_at": "2026-10-28T13:32:11.058742461Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637802449` → **200**

```json
{
  "phone": "+380637802449",
  "audience": "CLIENT",
  "code": "195392",
  "sent_at": "2026-10-28T13:32:10.06102852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c645f89a-8690-4419-8402-5d243c830776",
  "code": "195392",
  "device_ref": "sandbox-15135"
}
```

```json
{
  "session_id": "79ca86d4-fa9c-4823-a5b9-1124f00f6acd",
  "subject": {
    "type": "CLIENT",
    "id": "ddcf6306-efb2-475e-ab46-0c69f0eff552"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGNmNjMwNi1lZmIyLTQ3NWUtYWI0Ni0wYzY5ZjBlZmY1NTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MjMwLCJpYXQiOjE3OTMxOTQzMzAsImp0aSI6IjQyNmE5YTU5LWQxY2EtNDRjZS04OGY2LTg0MWUyNjE5MzFkNiIsInNpZCI6Ijc5Y2E4NmQ0LWZhOWMtNDgyMy1hNWI5LTExMjRmMDBmNmFjZCJ9.u9YuRJm35P7X3ixzjIGtZW3jW9qyCv1cR6lUjdp90P0",
  "access_expires_at": "2026-10-28T13:47:10.36688139Z",
  "refresh_token": "5Z1Q9X_f6kVyQGjGH2y6EoPFPzSXThy3XREZfyu4Skc",
  "refresh_expires_at": "2026-11-27T13:32:10.366324904Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "eb4a08ad-9e48-494b-8559-ffed11c86cd2",
  "expires_at": "2026-10-28T13:37:12.634389309Z",
  "resend_available_at": "2026-10-28T13:32:13.634389309Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637802449` → **200**

```json
{
  "phone": "+380637802449",
  "audience": "CLIENT",
  "code": "731142",
  "sent_at": "2026-10-28T13:32:12.63630593Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380631530107"
}
```

```json
{
  "challenge_id": "de9e28c5-313b-4f3b-8f6f-ccdca5ff18ba",
  "expires_at": "2026-10-28T13:37:12.922853466Z",
  "resend_available_at": "2026-10-28T13:32:13.922853466Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631530107` → **200**

```json
{
  "phone": "+380631530107",
  "audience": "CLIENT",
  "code": "143533",
  "sent_at": "2026-10-28T13:32:12.924563218Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "d8648549-a906-4e39-9673-e7340d70fc89",
  "current_challenge_id": "eb4a08ad-9e48-494b-8559-ffed11c86cd2",
  "current_code": "000000",
  "new_challenge_id": "de9e28c5-313b-4f3b-8f6f-ccdca5ff18ba",
  "new_code": "143533"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "f41bb67d-a1cf-4e9f-a7db-a77afda96883"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "dde3f147-e826-425c-8366-5e144ae493e3",
  "current_challenge_id": "eb4a08ad-9e48-494b-8559-ffed11c86cd2",
  "current_code": "731142",
  "new_challenge_id": "de9e28c5-313b-4f3b-8f6f-ccdca5ff18ba",
  "new_code": "143533"
}
```

```json
{
  "subject_id": "ddcf6306-efb2-475e-ab46-0c69f0eff552",
  "phone": "+380631530107",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ddcf6306-efb2-475e-ab46-0c69f0eff552",
  "session_id": "4176beae-9622-4767-b81f-9c124f7e4563",
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
  "correlation_id": "32ea6616-3f8d-4f3c-9c10-a69be696dfc8"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631530107",
  "device_ref": "sandbox-25579"
}
```

```json
{
  "challenge_id": "884e4ebd-ef75-4f52-b3d4-dcaeb55017c7",
  "expires_at": "2026-10-28T13:37:16.292911864Z",
  "resend_available_at": "2026-10-28T13:32:17.292911864Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631530107` → **200**

```json
{
  "phone": "+380631530107",
  "audience": "CLIENT",
  "code": "269201",
  "sent_at": "2026-10-28T13:32:16.295075085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "884e4ebd-ef75-4f52-b3d4-dcaeb55017c7",
  "code": "269201",
  "device_ref": "sandbox-25579"
}
```

```json
{
  "session_id": "bd0c3f13-d265-4830-83f9-2106efc3df2b",
  "subject": {
    "type": "CLIENT",
    "id": "ddcf6306-efb2-475e-ab46-0c69f0eff552"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGNmNjMwNi1lZmIyLTQ3NWUtYWI0Ni0wYzY5ZjBlZmY1NTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MjM2LCJpYXQiOjE3OTMxOTQzMzYsImp0aSI6Ijg1YmI1ZTAyLTkyYmQtNDFhMS04Y2IxLTAwODdmYTRiNDg1NSIsInNpZCI6ImJkMGMzZjEzLWQyNjUtNDgzMC04M2Y5LTIxMDZlZmMzZGYyYiJ9.mxkDIaXrUfFMRDy9Pz1FE4hZHFrp1r1A1pXLvI_2dko",
  "access_expires_at": "2026-10-28T13:47:16.588205023Z",
  "refresh_token": "xRcRKEzVhxGVeNmo_QW1TKeZS2ZwUXsxtZWyf7ff-rA",
  "refresh_expires_at": "2026-11-27T13:32:16.587643637Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ddcf6306-efb2-475e-ab46-0c69f0eff552",
  "session_id": "bd0c3f13-d265-4830-83f9-2106efc3df2b",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support sets another after checking who it is

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
  "session_id": "10170230-9abe-4f6d-8944-dcdc11ba661d",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyMzcsImlhdCI6MTc5MzE5NDMzNywianRpIjoiNzMzYjMzYjctNWEyOC00NzI5LThjMWUtYjQyYWFjNTA5ODMzIiwic2lkIjoiMTAxNzAyMzAtOWFiZS00ZjZkLTg5NDQtZGNkYzExYmE2NjFkIn0.6bwII_z39VVJ2ZrI9lLXZTTORK1SmgsL7IMmoSpI_nM",
  "access_expires_at": "2026-10-28T13:47:17.399935915Z",
  "refresh_token": "zC9yT3u5JkhafO1ie7EKh382kkU-Tp8OO-WfbqSM2C4",
  "refresh_expires_at": "2026-10-29T01:32:17.399421717Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/ddcf6306-efb2-475e-ab46-0c69f0eff552` → **200**

```json
{
  "client": {
    "id": "ddcf6306-efb2-475e-ab46-0c69f0eff552",
    "phone": "+380631530107",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:32:07.512884Z",
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

`POST /api/admin/v1/clients/ddcf6306-efb2-475e-ab46-0c69f0eff552/phone` → **400**

```json
{
  "command_id": "48358adb-c970-49cb-bdc3-936087bf75c7",
  "expected_version": 3,
  "phone": "+380633871372",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/ddcf6306-efb2-475e-ab46-0c69f0eff552/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7f1cd4d9-e357-47f1-a83e-28a44fef5092",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/ddcf6306-efb2-475e-ab46-0c69f0eff552/phone` → **200**

```json
{
  "command_id": "e36a42e8-24bd-4e32-a504-c33288cc0f5d",
  "expected_version": 3,
  "phone": "+380633871372",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "ddcf6306-efb2-475e-ab46-0c69f0eff552",
  "phone": "+380633871372",
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
  "correlation_id": "2973772a-04e9-4ac5-ba10-a64228a77f21"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633871372",
  "device_ref": "sandbox-14796"
}
```

```json
{
  "challenge_id": "0e0cdc19-d158-4509-a113-30f6ead68dfc",
  "expires_at": "2026-10-28T13:37:18.78759503Z",
  "resend_available_at": "2026-10-28T13:32:19.78759503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633871372` → **200**

```json
{
  "phone": "+380633871372",
  "audience": "CLIENT",
  "code": "278310",
  "sent_at": "2026-10-28T13:32:18.789817983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e0cdc19-d158-4509-a113-30f6ead68dfc",
  "code": "278310",
  "device_ref": "sandbox-14796"
}
```

```json
{
  "session_id": "cbd76b71-ea8f-4fc6-8791-0c631a759793",
  "subject": {
    "type": "CLIENT",
    "id": "ddcf6306-efb2-475e-ab46-0c69f0eff552"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGNmNjMwNi1lZmIyLTQ3NWUtYWI0Ni0wYzY5ZjBlZmY1NTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MjM5LCJpYXQiOjE3OTMxOTQzMzksImp0aSI6IjY5MDgyNGY4LTQ3ODMtNDY0NC05ZjFkLWMyZjEyMmY4Y2NmYSIsInNpZCI6ImNiZDc2YjcxLWVhOGYtNGZjNi04NzkxLTBjNjMxYTc1OTc5MyJ9.YI25ncTAqhbwCXkkI7BDBgdHDzvf2RgalzmEqyLmlqk",
  "access_expires_at": "2026-10-28T13:47:19.072387821Z",
  "refresh_token": "6Ee5exRjrFTmJBMXvl3uD3gJFY0vZWm1WTVwRqltcPE",
  "refresh_expires_at": "2026-11-27T13:32:19.071861731Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ddcf6306-efb2-475e-ab46-0c69f0eff552",
  "session_id": "cbd76b71-ea8f-4fc6-8791-0c631a759793",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633685558",
  "device_ref": "sandbox-12426"
}
```

```json
{
  "challenge_id": "9325a344-d82a-41e7-9ac2-725bc843694f",
  "expires_at": "2026-10-28T13:37:19.599484964Z",
  "resend_available_at": "2026-10-28T13:32:20.599484964Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633685558` → **200**

```json
{
  "phone": "+380633685558",
  "audience": "CLIENT",
  "code": "971415",
  "sent_at": "2026-10-28T13:32:19.60146689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9325a344-d82a-41e7-9ac2-725bc843694f",
  "code": "971415",
  "device_ref": "sandbox-12426"
}
```

```json
{
  "session_id": "cf4fe26e-8029-40b7-99e2-c9432b7c8db1",
  "subject": {
    "type": "CLIENT",
    "id": "df4351ac-500b-4c6c-8731-c023c889b0bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjQzNTFhYy01MDBiLTRjNmMtODczMS1jMDIzYzg4OWIwYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MjM5LCJpYXQiOjE3OTMxOTQzMzksImp0aSI6IjE0MmQ0YTA1LWU2OWUtNDQyNS04YTM2LTZmOTY2NDQwYzkxZCIsInNpZCI6ImNmNGZlMjZlLTgwMjktNDBiNy05OWUyLWM5NDMyYjdjOGRiMSJ9.dhWYjr81Ea748XqGlZl0wOkllg2s3zT2Rtr0Ae_pJhE",
  "access_expires_at": "2026-10-28T13:47:19.907430688Z",
  "refresh_token": "5UuND_KaMf0NKWriJZokGgQxF7iwrYVZrghQeo4mW88",
  "refresh_expires_at": "2026-11-27T13:32:19.906911811Z",
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
  "session_id": "80f76964-dbcd-4206-9bf9-c0bc1d61f45f",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNDEsImlhdCI6MTc5MzE5NDM0MSwianRpIjoiZjIyYTM1ZTMtODNjNy00MzI5LTkxMTMtYTk5YWNhOWFiM2E4Iiwic2lkIjoiODBmNzY5NjQtZGJjZC00MjA2LTliZjktYzBiYzFkNjFmNDVmIn0.mB1d_C0C_6YVU96025M09wuOujxC--DG8HJHWFHZvpg",
  "access_expires_at": "2026-10-28T13:47:21.029840858Z",
  "refresh_token": "uDkYC-aXn_Ka1zThl3-733jD_P9cbGq7jfupipdiKvE",
  "refresh_expires_at": "2026-10-29T01:32:21.029335026Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633685558` → **200**

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
  "correlation_id": "93527f28-0d32-4e26-9e32-d8767c808e4e"
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
  "session_id": "ed00e3c7-0322-4dbc-9e93-57bc2397698b",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNDIsImlhdCI6MTc5MzE5NDM0MiwianRpIjoiN2FjNzJiYzAtMDBhNy00YjFiLTkwMmQtZmE1OTAwZGVjOWYxIiwic2lkIjoiZWQwMGUzYzctMDMyMi00ZGJjLTllOTMtNTdiYzIzOTc2OThiIn0.HGLzD7L4blwOkBZU95NdvSy_2NoHnF-Puk3CS48Au4E",
  "access_expires_at": "2026-10-28T13:47:22.14859145Z",
  "refresh_token": "k80dkrHYIJB-FIw25DBwt2Qg48fRxUltYTtBrsJsYLI",
  "refresh_expires_at": "2026-10-29T01:32:22.148093232Z",
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
  "command_id": "9258d425-07d1-4a45-ba13-800b3e4d44dd",
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
  "changed_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T13:32:22.699311032Z"
}
```

## The rider books the airport for 2026-10-28T16:32:21Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600910054",
  "device_ref": "sandbox-133"
}
```

```json
{
  "challenge_id": "66242b70-9b02-49fe-83b7-032a3322914c",
  "expires_at": "2026-10-28T13:37:22.975934627Z",
  "resend_available_at": "2026-10-28T13:32:23.975934627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600910054` → **200**

```json
{
  "phone": "+48600910054",
  "audience": "CLIENT",
  "code": "418793",
  "sent_at": "2026-10-28T13:32:22.978060533Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66242b70-9b02-49fe-83b7-032a3322914c",
  "code": "418793",
  "device_ref": "sandbox-133"
}
```

```json
{
  "session_id": "076646f4-adb3-47f1-bbce-70b33f47464d",
  "subject": {
    "type": "CLIENT",
    "id": "fa993f7d-857e-42b0-b21b-c2e15cf0b073"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTk5M2Y3ZC04NTdlLTQyYjAtYjIxYi1jMmUxNWNmMGIwNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MjQzLCJpYXQiOjE3OTMxOTQzNDMsImp0aSI6ImQ1YzVjYjZlLTQ3MzctNGE3Ni04N2Q5LTJlMjFhODllMGY1OCIsInNpZCI6IjA3NjY0NmY0LWFkYjMtNDdmMS1iYmNlLTcwYjMzZjQ3NDY0ZCJ9.DTd3x7G-CkvzWBkiMI-IT1qV43yzNnJJILSL3Kkvco8",
  "access_expires_at": "2026-10-28T13:47:23.264297533Z",
  "refresh_token": "-sJHCzT6dZK58Rcr7QXgTp3qL2Ck1qMJk9s6WIhaevY",
  "refresh_expires_at": "2026-11-27T13:32:23.263616193Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b8956e3-12d8-41fd-87b9-2d37d575524a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T16:32:21Z"
}
```

```json
{
  "id": "a6d6f9b0-72f1-49ce-af8d-2385a21677fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:37:23.531877Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:32:21Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "860f5d30-0b6e-4ea9-a6c1-5a4cd5b85f18",
  "quote_id": "a6d6f9b0-72f1-49ce-af8d-2385a21677fb",
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
  "pickup_at": "2026-10-28T16:32:21Z"
}
```

```json
{
  "id": "2b53738c-812c-4e1f-85b4-cf7d0de1d79f",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fa993f7d-857e-42b0-b21b-c2e15cf0b073",
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
  "created_at": "2026-10-28T13:32:23.812021Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:32:21Z",
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
  "device_ref": "sandbox-30019"
}
```

```json
{
  "challenge_id": "85d8d644-92a0-45c8-90c2-7c2b216867a6",
  "expires_at": "2026-10-28T13:37:24.092694272Z",
  "resend_available_at": "2026-10-28T13:32:25.092694272Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "737900",
  "sent_at": "2026-10-28T13:32:24.095183629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85d8d644-92a0-45c8-90c2-7c2b216867a6",
  "code": "737900",
  "device_ref": "sandbox-30019"
}
```

```json
{
  "session_id": "30049af2-6873-4fdb-80c4-bd1b7efa9b30",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTI0NCwiaWF0IjoxNzkzMTk0MzQ0LCJqdGkiOiI0MzcwYThkMi0yYzczLTRhMzYtYTJmZS02MzcxYTI0NzJmMjIiLCJzaWQiOiIzMDA0OWFmMi02ODczLTRmZGItODBjNC1iZDFiN2VmYTliMzAifQ.mcfwFfseNDGNnR9V3hLnsa0c29E6yP1GcWlsQYXu3jY",
  "access_expires_at": "2026-10-28T13:47:24.381607761Z",
  "refresh_token": "7sf7gZDuGr3WAAbu9sSMZUpF1Vlwexfi_MAvufjJIjU",
  "refresh_expires_at": "2026-11-27T13:32:24.38106642Z",
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
  "command_id": "886f5fa1-71a1-4718-869f-c2d59ff0ad57",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:32:24Z",
    "sequence": 1793194344909
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b0498ba2-a833-418d-8b8a-75da8524d04c",
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
  "last_heartbeat_at": "2026-10-28T13:32:24.926784Z",
  "last_location_at": "2026-10-28T13:32:24.926784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "2b53738c-812c-4e1f-85b4-cf7d0de1d79f",
      "short_number": 20,
      "pickup_at": "2026-10-28T16:32:21Z",
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

`POST /api/driver/v1/preorders/2b53738c-812c-4e1f-85b4-cf7d0de1d79f/reserve` → **200**

```json
{
  "command_id": "c9b2071f-7589-49c2-8d45-7f513607c0e9"
}
```

```json
{
  "id": "6fd744fd-d01f-4318-884d-d6d24568d612",
  "state": "RESERVED",
  "order": {
    "order_id": "2b53738c-812c-4e1f-85b4-cf7d0de1d79f",
    "short_number": 20,
    "pickup_at": "2026-10-28T16:32:21Z",
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
  "reserved_at": "2026-10-28T13:32:25.466776Z",
  "confirm_from": "2026-10-28T16:02:21Z",
  "confirm_until": "2026-10-28T16:12:21Z",
  "drop_until": "2026-10-28T15:32:21Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "6fd744fd-d01f-4318-884d-d6d24568d612",
      "state": "RESERVED",
      "order": {
        "order_id": "2b53738c-812c-4e1f-85b4-cf7d0de1d79f",
        "short_number": 20,
        "pickup_at": "2026-10-28T16:32:21Z",
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
      "reserved_at": "2026-10-28T13:32:25.466776Z",
      "confirm_from": "2026-10-28T16:02:21Z",
      "confirm_until": "2026-10-28T16:12:21Z",
      "drop_until": "2026-10-28T15:32:21Z"
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
      "id": "6fd744fd-d01f-4318-884d-d6d24568d612",
      "state": "RESERVED",
      "order": {
        "order_id": "2b53738c-812c-4e1f-85b4-cf7d0de1d79f",
        "short_number": 20,
        "pickup_at": "2026-10-28T16:32:21Z",
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
      "reserved_at": "2026-10-28T13:32:25.466776Z",
      "confirm_from": "2026-10-28T16:02:21Z",
      "confirm_until": "2026-10-28T16:12:21Z",
      "drop_until": "2026-10-28T15:32:21Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/6fd744fd-d01f-4318-884d-d6d24568d612/confirm` → **409**

```json
{
  "command_id": "4d8f4a04-c349-4576-a213-f6475a7c2c89"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/6fd744fd-d01f-4318-884d-d6d24568d612/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7c6eb9ee-2521-4947-96d7-08ced0545452"
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
  "session_id": "e44b9912-fa99-47dc-8094-10fc556437a2",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNDYsImlhdCI6MTc5MzE5NDM0NiwianRpIjoiMzFkNjViMmYtY2JhMi00MmE2LTgwMTYtMDI1ZTVjODlkZWUzIiwic2lkIjoiZTQ0Yjk5MTItZmE5OS00N2RjLTgwOTQtMTBmYzU1NjQzN2EyIn0.hNEbDvxGdAjkxnUIVjP1CW35GEnzeZQ1SQlGKCc-Wc0",
  "access_expires_at": "2026-10-28T13:47:26.864342506Z",
  "refresh_token": "ZADQhANQ5HY3_q7lE5rInGUr8O42QFNRg7vRFT0IRnc",
  "refresh_expires_at": "2026-10-29T01:32:26.863792622Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2b53738c-812c-4e1f-85b4-cf7d0de1d79f` → **200**

```json
{
  "id": "2b53738c-812c-4e1f-85b4-cf7d0de1d79f",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "fa993f7d-857e-42b0-b21b-c2e15cf0b073",
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
  "created_at": "2026-10-28T13:32:23.812021Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T16:32:21Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "6fd744fd-d01f-4318-884d-d6d24568d612",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T13:32:25.466776Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2b53738c-812c-4e1f-85b4-cf7d0de1d79f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T13:32:23.81324Z",
      "actor": {
        "type": "CLIENT",
        "id": "fa993f7d-857e-42b0-b21b-c2e15cf0b073",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "2b53738c-812c-4e1f-85b4-cf7d0de1d79f",
        "preorder": true,
        "quote_id": "a6d6f9b0-72f1-49ce-af8d-2385a21677fb",
        "pickup_at": "2026-10-28T16:32:21Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "4f38b20d-31ad-44f0-a8e1-868a635da2df"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T13:32:25.467802Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2b53738c-812c-4e1f-85b4-cf7d0de1d79f",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "6fd744fd-d01f-4318-884d-d6d24568d612"
      },
      "correlation_id": "4b277326-a073-4e05-9ce9-189636dadabf"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 2b53738c-812c-4e1f-85b4-cf7d0de1d79f, reservation 6fd744fd-d01f-4318-884d-d6d24568d612.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30362"
}
```

```json
{
  "challenge_id": "fd89003b-22fe-41e7-8e6f-f7a412723b8d",
  "expires_at": "2026-10-28T13:37:27.707648108Z",
  "resend_available_at": "2026-10-28T13:32:28.707648108Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "580214",
  "sent_at": "2026-10-28T13:32:27.709740633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd89003b-22fe-41e7-8e6f-f7a412723b8d",
  "code": "580214",
  "device_ref": "sandbox-30362"
}
```

```json
{
  "session_id": "1c24243d-3515-480c-9996-947f5dfe528b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTI0OCwiaWF0IjoxNzkzMTk0MzQ4LCJqdGkiOiIxYWMyNjI5Ny1jYjk3LTQ1MGUtOTYyNi0xNTkzZWI4NTI0YzciLCJzaWQiOiIxYzI0MjQzZC0zNTE1LTQ4MGMtOTk5Ni05NDdmNWRmZTUyOGIifQ.woXnf_XF67C08-mdrpPteJS-e2PE_7orZtel0hSOm0w",
  "access_expires_at": "2026-10-28T13:47:28.010081509Z",
  "refresh_token": "N2LkazPWzqesX4VpqHNLB_KNjI2c3jNKDLydnPIr-QY",
  "refresh_expires_at": "2026-11-27T13:32:28.009461543Z",
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
  "command_id": "3040e86f-2efd-4bff-afa5-55f98514ba07",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:32:28Z",
    "sequence": 1793194348545
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "562c9fd6-3ae6-412e-9220-5eae3632b2b4",
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
  "last_heartbeat_at": "2026-10-28T13:32:28.562591Z",
  "last_location_at": "2026-10-28T13:32:28.562591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675760434",
  "device_ref": "sandbox-15046"
}
```

```json
{
  "challenge_id": "b9044d6c-973f-4cd3-88a5-099eb1199531",
  "expires_at": "2026-10-28T13:37:28.828395581Z",
  "resend_available_at": "2026-10-28T13:32:29.828395581Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675760434` → **200**

```json
{
  "phone": "+380675760434",
  "audience": "CLIENT",
  "code": "578915",
  "sent_at": "2026-10-28T13:32:28.830458577Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9044d6c-973f-4cd3-88a5-099eb1199531",
  "code": "578915",
  "device_ref": "sandbox-15046"
}
```

```json
{
  "session_id": "dfd0a5d0-e286-476a-b380-378e76060e66",
  "subject": {
    "type": "CLIENT",
    "id": "e0f32095-1d1d-4560-9238-bae4c8dcb2a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMGYzMjA5NS0xZDFkLTQ1NjAtOTIzOC1iYWU0YzhkY2IyYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1MjQ5LCJpYXQiOjE3OTMxOTQzNDksImp0aSI6IjY0ZWM2MjBlLTU4NTEtNGQyYS1iZmU3LTYyYzlhN2ZlMzM5OCIsInNpZCI6ImRmZDBhNWQwLWUyODYtNDc2YS1iMzgwLTM3OGU3NjA2MGU2NiJ9.pwpu2LDk9l2gKCeyznlLPs1w3MYMzUCOuw3tHqa3m5g",
  "access_expires_at": "2026-10-28T13:47:29.12346703Z",
  "refresh_token": "9JvnfnvwjRpE_sIK0DmqFVasXIgN8Fn7f9TXGMUgI98",
  "refresh_expires_at": "2026-11-27T13:32:29.122885236Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "be9bfba6-61f3-4373-88d3-96990bdbfb07",
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
  "id": "d099de39-c329-461b-a348-c5fe4ecc92af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:37:29.403520Z",
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
  "command_id": "dfa3824c-2ded-4d71-81fc-78450208ecff",
  "quote_id": "d099de39-c329-461b-a348-c5fe4ecc92af",
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
  "id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0f32095-1d1d-4560-9238-bae4c8dcb2a2",
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
  "created_at": "2026-10-28T13:32:29.708472Z",
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
    "id": "f9dbdf29-7887-4a56-bfbd-940ba017e367",
    "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
    "expires_at": "2026-10-28T13:32:44.711378Z",
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

`POST /api/driver/v1/offers/f9dbdf29-7887-4a56-bfbd-940ba017e367/accept` → **200**

```json
{
  "command_id": "4fea0913-dead-455b-a182-1d5b571fdfbd"
}
```

```json
{
  "id": "5797db11-6dfc-4c25-aa59-f2c9b28cb218",
  "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a395feec-5a88-45b0-a5a9-2b9f3c720c78",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a395feec-5a88-45b0-a5a9-2b9f3c720c78",
  "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "assignment_id": "5797db11-6dfc-4c25-aa59-f2c9b28cb218",
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

`POST /api/driver/v1/work-sessions/562c9fd6-3ae6-412e-9220-5eae3632b2b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:32:30Z",
    "sequence": 1793194350806
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "562c9fd6-3ae6-412e-9220-5eae3632b2b4",
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
  "last_heartbeat_at": "2026-10-28T13:32:30.830782Z",
  "last_location_at": "2026-10-28T13:32:30.830782Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a395feec-5a88-45b0-a5a9-2b9f3c720c78",
  "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "assignment_id": "5797db11-6dfc-4c25-aa59-f2c9b28cb218",
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

`POST /api/driver/v1/trips/a395feec-5a88-45b0-a5a9-2b9f3c720c78/arrive` → **200**

```json
{
  "command_id": "bf778239-0931-4a51-a81e-2903bb9d5db5",
  "expected_version": 0
}
```

```json
{
  "id": "a395feec-5a88-45b0-a5a9-2b9f3c720c78",
  "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "assignment_id": "5797db11-6dfc-4c25-aa59-f2c9b28cb218",
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
  "arrived_at": "2026-10-28T13:32:31.389748Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a395feec-5a88-45b0-a5a9-2b9f3c720c78/start` → **200**

```json
{
  "command_id": "bf5d0001-e237-4423-8b13-b0a886e95dfb",
  "expected_version": 1
}
```

```json
{
  "id": "a395feec-5a88-45b0-a5a9-2b9f3c720c78",
  "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "assignment_id": "5797db11-6dfc-4c25-aa59-f2c9b28cb218",
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
  "arrived_at": "2026-10-28T13:32:31.389748Z",
  "started_at": "2026-10-28T13:32:31.661609Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/562c9fd6-3ae6-412e-9220-5eae3632b2b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:32:31Z",
    "sequence": 1793194351925
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "562c9fd6-3ae6-412e-9220-5eae3632b2b4",
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
  "last_heartbeat_at": "2026-10-28T13:32:31.942976Z",
  "last_location_at": "2026-10-28T13:32:31.942976Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/a395feec-5a88-45b0-a5a9-2b9f3c720c78/complete` → **200**

```json
{
  "command_id": "8f51212d-3099-4640-bf73-6f2f3d8b9479",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:32:32Z",
  "cash_received": true
}
```

```json
{
  "id": "a395feec-5a88-45b0-a5a9-2b9f3c720c78",
  "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "assignment_id": "5797db11-6dfc-4c25-aa59-f2c9b28cb218",
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
  "arrived_at": "2026-10-28T13:32:31.389748Z",
  "started_at": "2026-10-28T13:32:31.661609Z",
  "completed_at": "2026-10-28T13:32:32.220839Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/2b7fd23f-d5d4-4e80-9236-d142b0615ea4/rating` → **200**

```json
{
  "command_id": "ce9f51a0-1706-4e0a-9e2b-b940ae5c13f2",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "score": 5,
  "created_at": "2026-10-28T13:32:32.50833215Z"
}
```

`POST /api/driver/v1/orders/2b7fd23f-d5d4-4e80-9236-d142b0615ea4/rating` → **200**

```json
{
  "command_id": "e160b66f-88d4-481d-8dce-83899ecd6194",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
  "score": 4,
  "created_at": "2026-10-28T13:32:32.77897478Z"
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
  "session_id": "a5eb741c-d772-498d-beb8-3abd816b5020",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNTMsImlhdCI6MTc5MzE5NDM1MywianRpIjoiMzM1OTkyODAtZWI3YS00NThkLTkxMGYtYTJjYWQ5MzUyNWY4Iiwic2lkIjoiYTVlYjc0MWMtZDc3Mi00OThkLWJlYjgtM2FiZDgxNmI1MDIwIn0.UGGCbEyGAzO8KO0NUdCDZ9dUvWAiZWbEYKGCBjQyOaE",
  "access_expires_at": "2026-10-28T13:47:33.608625155Z",
  "refresh_token": "GJwDmb-CIM0gkYqZUn9bNltQ8EPe6UqLcX9BzKXHZWQ",
  "refresh_expires_at": "2026-10-29T01:32:33.608117068Z",
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
  "session_id": "cdd5a890-5f1c-4e96-99f3-407d1a277209",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNTQsImlhdCI6MTc5MzE5NDM1NCwianRpIjoiMDYwZjkyMDAtZDUzNS00MmMwLThkZDYtNmQwYzk2NTFiNTlhIiwic2lkIjoiY2RkNWE4OTAtNWYxYy00ZTk2LTk5ZjMtNDA3ZDFhMjc3MjA5In0.FY3JX4R3odwncKfg62feJC0G4i0VwqHobvyfSBIM9Vo",
  "access_expires_at": "2026-10-28T13:47:34.164501742Z",
  "refresh_token": "8_L4qGKfX_bgvHQzhr_oVoN9B9WH2f5sbUj8OiWWrO8",
  "refresh_expires_at": "2026-10-29T01:32:34.163509614Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2b7fd23f-d5d4-4e80-9236-d142b0615ea4/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
      "author_type": "RIDER",
      "author_id": "e0f32095-1d1d-4560-9238-bae4c8dcb2a2",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T13:32:32.508332Z"
    },
    {
      "order_id": "2b7fd23f-d5d4-4e80-9236-d142b0615ea4",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "e0f32095-1d1d-4560-9238-bae4c8dcb2a2",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T13:32:32.778975Z"
    }
  ]
}
```

Done: ratings for order 2b7fd23f-d5d4-4e80-9236-d142b0615ea4.

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
  "session_id": "87eecab4-137a-464c-b242-87717896390c",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNTUsImlhdCI6MTc5MzE5NDM1NSwianRpIjoiODQ1ZDFhYjgtMjdmYy00N2FlLWE4OTQtNjY0ODdlMDdjNTAzIiwic2lkIjoiODdlZWNhYjQtMTM3YS00NjRjLWIyNDItODc3MTc4OTYzOTBjIn0.6Wu_BFykKEaDpGvJs4FAsWrOmlaR1NS3fcsGA2S1ixc",
  "access_expires_at": "2026-10-28T13:47:35.011612655Z",
  "refresh_token": "ZOv3PBXxUzdHqB-NroecvHCh4aDWM2Nr-d6gPIVhZJs",
  "refresh_expires_at": "2026-10-29T01:32:35.011098687Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c60f3f9b-115e-445e-877e-9533e583fc40",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "b0ea5269-e604-4586-be79-b66194438c85",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:35.286216Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0ea5269-e604-4586-be79-b66194438c85` → **200**

```json
{
  "id": "b0ea5269-e604-4586-be79-b66194438c85",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:35.286216Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0ea5269-e604-4586-be79-b66194438c85` → **200**

```json
{
  "id": "b0ea5269-e604-4586-be79-b66194438c85",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:35.286216Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0ea5269-e604-4586-be79-b66194438c85` → **200**

```json
{
  "id": "b0ea5269-e604-4586-be79-b66194438c85",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:35.286216Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0ea5269-e604-4586-be79-b66194438c85` → **200**

```json
{
  "id": "b0ea5269-e604-4586-be79-b66194438c85",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:35.286216Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0ea5269-e604-4586-be79-b66194438c85` → **200**

```json
{
  "id": "b0ea5269-e604-4586-be79-b66194438c85",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:32:35.286216Z",
  "ready_at": "2026-10-28T13:32:39.492359Z",
  "expires_at": "2026-10-29T13:32:39.492359Z"
}
```

`GET /api/admin/v1/reports/exports/b0ea5269-e604-4586-be79-b66194438c85/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1f28a7a4-af6d-48a6-95ff-b17cb8a43b5d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "a86e9747-4320-4b9e-9749-6d6eb81c79d9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:40.90951Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a86e9747-4320-4b9e-9749-6d6eb81c79d9` → **200**

```json
{
  "id": "a86e9747-4320-4b9e-9749-6d6eb81c79d9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:40.90951Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a86e9747-4320-4b9e-9749-6d6eb81c79d9` → **200**

```json
{
  "id": "a86e9747-4320-4b9e-9749-6d6eb81c79d9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:40.90951Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a86e9747-4320-4b9e-9749-6d6eb81c79d9` → **200**

```json
{
  "id": "a86e9747-4320-4b9e-9749-6d6eb81c79d9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:32:40.90951Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a86e9747-4320-4b9e-9749-6d6eb81c79d9` → **200**

```json
{
  "id": "a86e9747-4320-4b9e-9749-6d6eb81c79d9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:32:40.90951Z",
  "ready_at": "2026-10-28T13:32:44.502096Z",
  "expires_at": "2026-10-29T13:32:44.502096Z"
}
```

`GET /api/admin/v1/reports/exports/a86e9747-4320-4b9e-9749-6d6eb81c79d9/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/ea4e9693-0e55-4db9-8802-336e99f19c89` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/ea4e9693-0e55-4db9-8802-336e99f19c89",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bc32ff0e-b311-4a76-b1f0-b598138e7989"
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
  "device_ref": "sandbox-20692"
}
```

```json
{
  "challenge_id": "03793655-271f-42eb-af1c-ca71d39e7a07",
  "expires_at": "2026-10-28T13:37:45.563648291Z",
  "resend_available_at": "2026-10-28T13:32:46.563648291Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "946187",
  "sent_at": "2026-10-28T13:32:45.566192765Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03793655-271f-42eb-af1c-ca71d39e7a07",
  "code": "946187",
  "device_ref": "sandbox-20692"
}
```

```json
{
  "session_id": "4b4983b1-ee82-46c2-bf24-82c607c5ff73",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTI2NSwiaWF0IjoxNzkzMTk0MzY1LCJqdGkiOiI5OWY4ZmZlZC0yNDY0LTQyNDAtYWZjYS1iZDI0MzBhNmViMmMiLCJzaWQiOiI0YjQ5ODNiMS1lZTgyLTQ2YzItYmYyNC04MmM2MDdjNWZmNzMifQ.KpIRIKSjPCe5KRCNcfxWuuvrSV2TTW7o-ifhe_q5t28",
  "access_expires_at": "2026-10-28T13:47:45.858749339Z",
  "refresh_token": "WsitdfNwSE_Iunfz9EJTAtbNE5P0YXgRsJmwRrtdvU0",
  "refresh_expires_at": "2026-11-27T13:32:45.858202009Z",
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
  "command_id": "b74a4287-d888-4dbe-b89d-fc00cac2b15e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:32:46Z",
    "sequence": 1793194366640
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c008b111-d90c-4567-a7f9-6eb15743d1a6",
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
  "last_heartbeat_at": "2026-10-28T13:32:46.657831Z",
  "last_location_at": "2026-10-28T13:32:46.657831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "838608e0-d0c8-4c39-b410-db55967f0faa",
  "points": [
    {
      "sequence": 1793194368932,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:31:48Z"
    },
    {
      "sequence": 1793194368940,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:32:48Z"
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
  "session_id": "b3e78b82-f7b1-432d-8dd5-4de50b77f3ec",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNjksImlhdCI6MTc5MzE5NDM2OSwianRpIjoiZGY0M2ZhMzMtMzQ2MC00NmY3LTkzZWQtZWFhMmU4Nzk3ZTNmIiwic2lkIjoiYjNlNzhiODItZjdiMS00MzJkLThkZDUtNGRlNTBiNzdmM2VjIn0.eFKvwA77_RRy3m4UcLJj8xiEvTrMaPKZywVJkWrtFZo",
  "access_expires_at": "2026-10-28T13:47:49.525706307Z",
  "refresh_token": "XQm-Mu_x4W3StJf72y119R3dhpBKhmK0fG7JVmX_tzA",
  "refresh_expires_at": "2026-10-29T01:32:49.525179416Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "276ea469-7fd8-4a36-af7d-f9d561ae4c5c",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T13:32:48Z",
        "track_point_id": "2e760ae9-86ca-4281-b45e-239d414a711a",
        "work_session_id": "c008b111-d90c-4567-a7f9-6eb15743d1a6"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T13:32:48Z",
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

`POST /api/admin/v1/driver-risk-flags/276ea469-7fd8-4a36-af7d-f9d561ae4c5c/confirm` → **200**

```json
{
  "command_id": "aa06ad2e-aef6-4eac-8819-821d17e7fdd6",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "276ea469-7fd8-4a36-af7d-f9d561ae4c5c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T13:32:48Z",
    "track_point_id": "2e760ae9-86ca-4281-b45e-239d414a711a",
    "work_session_id": "c008b111-d90c-4567-a7f9-6eb15743d1a6"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T13:32:48Z",
  "reason": null,
  "reviewed_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "reviewed_at": "2026-10-28T13:32:50.382397Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/276ea469-7fd8-4a36-af7d-f9d561ae4c5c/dismiss` → **409**

```json
{
  "command_id": "64eaee86-8f9c-4d89-9574-21a5a903debc",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/276ea469-7fd8-4a36-af7d-f9d561ae4c5c/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "43dd029a-89e4-494c-a9a6-d4884305fa27"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "682a6d40-3b1f-476e-91fa-86d92e28da4d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "6ecd42f5-ebb5-474f-ba74-df4880c801ce",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "raised_at": "2026-10-28T13:32:50.93471Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/6ecd42f5-ebb5-474f-ba74-df4880c801ce/dismiss` → **200**

```json
{
  "command_id": "cc82627c-0d71-45fb-953d-9d8a906a674a",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "6ecd42f5-ebb5-474f-ba74-df4880c801ce",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "raised_at": "2026-10-28T13:32:50.93471Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "reviewed_at": "2026-10-28T13:32:51.209323Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c6d42125-54a5-4a4c-b1a3-b72884d55178",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "276ea469-7fd8-4a36-af7d-f9d561ae4c5c"
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
      "actor_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:32:51.494305Z"
    }
  ]
}
```

Done: flag 276ea469-7fd8-4a36-af7d-f9d561ae4c5c confirmed, suspension named it, driver reinstated.

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
  "session_id": "751b5f71-0adc-4498-a13b-759e5b173077",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNzIsImlhdCI6MTc5MzE5NDM3MiwianRpIjoiYTZiZjM3OWQtMDIwNC00ZTJjLTg4NTctMTc0ZTNiYjA5ZmMxIiwic2lkIjoiNzUxYjVmNzEtMGFkYy00NDk4LWExM2ItNzU5ZTViMTczMDc3In0.Yi5AOo7DjJhBF-UjB1nsDqnAUA12N3FznNf5M6wTcoU",
  "access_expires_at": "2026-10-28T13:47:52.335893529Z",
  "refresh_token": "gW87UvfEPIyNF6TRkLopTHJD6pMu9em5Cyf6fEIrI-4",
  "refresh_expires_at": "2026-10-29T01:32:52.335302096Z",
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
      "actor_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:32:51.494305Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "c4bdb77f-eabc-46d5-b4ed-c9473d2e2d26",
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
  "session_id": "c008b111-d90c-4567-a7f9-6eb15743d1a6",
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
  "last_heartbeat_at": "2026-10-28T13:32:46.657831Z",
  "last_location_at": "2026-10-28T13:32:46.657831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c008b111-d90c-4567-a7f9-6eb15743d1a6/close` → **200**

```json
{
  "command_id": "4a6a4b4c-8a20-4956-a47a-9bacb8768c8c",
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
  "session_id": "53ff478f-527a-4c55-966a-b623af8fa62d",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyNzQsImlhdCI6MTc5MzE5NDM3NCwianRpIjoiNjA3Y2NjYjAtNzQ4Mi00NjVkLWE0NzAtMGMyZGU2M2QxYmY5Iiwic2lkIjoiNTNmZjQ3OGYtNTI3YS00YzU1LTk2NmEtYjYyM2FmOGZhNjJkIn0.2fWWaOQ8qrjsHcvtQb7A6HJL9UZvrWd35trLtfkuBWE",
  "access_expires_at": "2026-10-28T13:47:54.01113118Z",
  "refresh_token": "Rf0HEjx48g-Z4-aGicabZDP7aSflZDHretno5XBngvU",
  "refresh_expires_at": "2026-10-29T01:32:54.010548194Z",
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
  "command_id": "9d325593-f42c-4736-9e99-9a9bdb26b71b",
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
  "changed_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:32:54.551116Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "9d325593-f42c-4736-9e99-9a9bdb26b71b",
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
  "changed_by": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:32:54.551116Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48574336593",
  "device_ref": "sandbox-22660"
}
```

```json
{
  "challenge_id": "57f5cada-c98d-4717-8696-71c764def7fb",
  "expires_at": "2026-10-28T13:37:55.104139903Z",
  "resend_available_at": "2026-10-28T13:32:56.104139903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48574336593` → **200**

```json
{
  "phone": "+48574336593",
  "audience": "CLIENT",
  "code": "465830",
  "sent_at": "2026-10-28T13:32:55.106557501Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57f5cada-c98d-4717-8696-71c764def7fb",
  "code": "465830",
  "device_ref": "sandbox-22660"
}
```

```json
{
  "session_id": "9ef45a38-dfea-417c-abc9-708c5c2ccea2",
  "subject": {
    "type": "CLIENT",
    "id": "565e3ae6-d16f-4f05-be79-96532553485c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NjVlM2FlNi1kMTZmLTRmMDUtYmU3OS05NjUzMjU1MzQ4NWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1Mjc1LCJpYXQiOjE3OTMxOTQzNzUsImp0aSI6ImRjMDc4NTE0LTBkZGItNDA5Yy1iOTMyLWU2MjBiNDRiODVjZSIsInNpZCI6IjllZjQ1YTM4LWRmZWEtNDE3Yy1hYmM5LTcwOGM1YzJjY2VhMiJ9.Twdi7gNJRFappl51IXVduOcuqVfKXfwAmEo5AeYHu4I",
  "access_expires_at": "2026-10-28T13:47:55.401904642Z",
  "refresh_token": "damSH8MC04pfl4Z3hrGc5LcaCteibAXhN4Y_Wt0L1Yo",
  "refresh_expires_at": "2026-11-27T13:32:55.401334277Z",
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
  "correlation_id": "08773ebe-1cec-4e63-a051-6ccab0aa1400"
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
  "device_ref": "sandbox-3937"
}
```

```json
{
  "challenge_id": "4453b802-e0bc-4064-84fb-f6386448e321",
  "expires_at": "2026-10-28T13:37:56.191605937Z",
  "resend_available_at": "2026-10-28T13:32:57.191605937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "422211",
  "sent_at": "2026-10-28T13:32:56.193639206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4453b802-e0bc-4064-84fb-f6386448e321",
  "code": "422211",
  "device_ref": "sandbox-3937"
}
```

```json
{
  "session_id": "64b78679-7e71-41e1-b66b-6ef947d7a4b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTI3NiwiaWF0IjoxNzkzMTk0Mzc2LCJqdGkiOiI2ZjhjYmIyZC03MTBjLTQ2MjItOGMxZS1hZWU0MDdiYzQ4OTMiLCJzaWQiOiI2NGI3ODY3OS03ZTcxLTQxZTEtYjY2Yi02ZWY5NDdkN2E0YjkifQ.gZvU_nTr44fPK_cjoGKwSouihYcJS0xZCWvjSz3X6Hw",
  "access_expires_at": "2026-10-28T13:47:56.487042734Z",
  "refresh_token": "dVZddcvSsIlMwM1vFksvdt3D7QyhAES32HUi5x1vXjk",
  "refresh_expires_at": "2026-11-27T13:32:56.486447044Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b0498ba2-a833-418d-8b8a-75da8524d04c",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T13:32:24.926784Z",
  "last_location_at": "2026-10-28T13:32:24.926784Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b0498ba2-a833-418d-8b8a-75da8524d04c/handover` → **200**

```json
{
  "command_id": "8517ffa6-88c0-4cb8-8a97-dcf0e241d484",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b0498ba2-a833-418d-8b8a-75da8524d04c",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T13:32:24.926784Z",
  "last_location_at": "2026-10-28T13:32:24.926784Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b0498ba2-a833-418d-8b8a-75da8524d04c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:32:57Z",
    "sequence": 1793194377319
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "b0498ba2-a833-418d-8b8a-75da8524d04c",
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
  "last_heartbeat_at": "2026-10-28T13:32:57.337595Z",
  "last_location_at": "2026-10-28T13:32:57.337595Z",
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
  "session_id": "b0498ba2-a833-418d-8b8a-75da8524d04c",
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
  "last_heartbeat_at": "2026-10-28T13:32:57.337595Z",
  "last_location_at": "2026-10-28T13:32:57.337595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0498ba2-a833-418d-8b8a-75da8524d04c/close` → **200**

```json
{
  "command_id": "9f9b327a-56a3-42f5-9979-a8b4b229070b",
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
  "correlation_id": "eb012246-ca24-4504-a99e-01a271baffc7"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673181627",
  "device_ref": "sandbox-28723"
}
```

```json
{
  "challenge_id": "58865744-5f55-4609-9bb1-30a70c407707",
  "expires_at": "2026-10-28T13:37:58.715260218Z",
  "resend_available_at": "2026-10-28T13:32:59.715260218Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673181627` → **200**

```json
{
  "phone": "+380673181627",
  "audience": "CLIENT",
  "code": "527277",
  "sent_at": "2026-10-28T13:32:58.71759603Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58865744-5f55-4609-9bb1-30a70c407707",
  "code": "527277",
  "device_ref": "sandbox-28723"
}
```

```json
{
  "session_id": "5151a9fb-484f-4a03-a2da-200fdab3be5c",
  "subject": {
    "type": "CLIENT",
    "id": "3865bc1b-c240-419e-99c9-b55545bb99ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODY1YmMxYi1jMjQwLTQxOWUtOTljOS1iNTU1NDViYjk5Y2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1Mjc5LCJpYXQiOjE3OTMxOTQzNzksImp0aSI6IjNkODNkNzI4LWYwMzgtNGIyMi04NGIwLTdhOGE1NmUyZjhmYiIsInNpZCI6IjUxNTFhOWZiLTQ4NGYtNGEwMy1hMmRhLTIwMGZkYWIzYmU1YyJ9.pFBr4qQfYCGmmjECa2KlH0ArlGGz_rLRQ2Z-_PaYusw",
  "access_expires_at": "2026-10-28T13:47:59.013436766Z",
  "refresh_token": "QdWMIOKfwr_Prv4-v4E_5sWi-fXCZREPmy-gyUrQhSs",
  "refresh_expires_at": "2026-11-27T13:32:59.012902671Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "946301e8-0c53-42d7-bbfb-ac74b1a5ab61",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "848ca8b5-c20a-490b-99bd-35bd44cbbf86",
  "upload_path": "/api/rider/v1/uploads/848ca8b5-c20a-490b-99bd-35bd44cbbf86",
  "expires_at": "2026-10-28T13:47:59.288559097Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/848ca8b5-c20a-490b-99bd-35bd44cbbf86` → **200**

```json
{
  "file_id": "848ca8b5-c20a-490b-99bd-35bd44cbbf86",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "68992ac9-ef9c-4224-bde0-161c4e3b8592",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "848ca8b5-c20a-490b-99bd-35bd44cbbf86"
  ]
}
```

```json
{
  "id": "23413820-ce63-4938-a609-7f813a9fd145",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3865bc1b-c240-419e-99c9-b55545bb99ca",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:32:59.592112Z",
  "updated_at": "2026-10-28T13:32:59.592112Z",
  "messages": [
    {
      "id": "1dd8fa58-63b5-41a8-bd85-9d3c45ef3c42",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3865bc1b-c240-419e-99c9-b55545bb99ca",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:32:59.593423Z",
      "attachments": [
        {
          "file_id": "848ca8b5-c20a-490b-99bd-35bd44cbbf86",
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
  "session_id": "d04b0e6b-a960-4b56-bdc2-fd4d8d04fcdf",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyODAsImlhdCI6MTc5MzE5NDM4MCwianRpIjoiMzM3ODkwZWQtYzdmZC00ODIxLTk5ZmMtYWJiN2Q5ZjdlYTI4Iiwic2lkIjoiZDA0YjBlNmItYTk2MC00YjU2LWJkYzItZmQ0ZDhkMDRmY2RmIn0.jshPHRoNn0aNYqkkZWU2G6vneFfqonSGeSmsg7ddcoI",
  "access_expires_at": "2026-10-28T13:48:00.188421835Z",
  "refresh_token": "gZ3bo3bq-ao13vRCKShnho8yB7R5PDU5FrolgdmxvUQ",
  "refresh_expires_at": "2026-10-29T01:33:00.187600257Z",
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
  "session_id": "5a357da8-0deb-4da6-989b-371d8ecaa2e6",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyODAsImlhdCI6MTc5MzE5NDM4MCwianRpIjoiMmM5OTk2ZjAtYmU4Yi00MWY1LThhYTAtZmZmZmI4OTI5NzcwIiwic2lkIjoiNWEzNTdkYTgtMGRlYi00ZGE2LTk4OWItMzcxZDhlY2FhMmU2In0.a5LWejZVHCdcw6c7VPK3oYH6joSsOIBHGvmBsGFoiKQ",
  "access_expires_at": "2026-10-28T13:48:00.781794283Z",
  "refresh_token": "FHt6_Lj2zMHWPHp8Lf8Hfq6dnfZpEa7MFR3OgW7YrNA",
  "refresh_expires_at": "2026-10-29T01:33:00.781181756Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/23413820-ce63-4938-a609-7f813a9fd145/attachments/848ca8b5-c20a-490b-99bd-35bd44cbbf86` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c1433fca-c09d-4dd9-8ce1-70d2ff68810a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c8994150-b662-4c45-8c7b-6a4d6002e512",
  "upload_path": "/api/operator/v1/uploads/c8994150-b662-4c45-8c7b-6a4d6002e512",
  "expires_at": "2026-10-28T13:48:01.074518666Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/c8994150-b662-4c45-8c7b-6a4d6002e512` → **200**

```json
{
  "file_id": "c8994150-b662-4c45-8c7b-6a4d6002e512",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/23413820-ce63-4938-a609-7f813a9fd145` → **200**

```json
{
  "id": "23413820-ce63-4938-a609-7f813a9fd145",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3865bc1b-c240-419e-99c9-b55545bb99ca",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:32:59.592112Z",
  "updated_at": "2026-10-28T13:32:59.592112Z",
  "messages": [
    {
      "id": "1dd8fa58-63b5-41a8-bd85-9d3c45ef3c42",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3865bc1b-c240-419e-99c9-b55545bb99ca",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:32:59.593423Z",
      "attachments": [
        {
          "file_id": "848ca8b5-c20a-490b-99bd-35bd44cbbf86",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/23413820-ce63-4938-a609-7f813a9fd145/comments` → **200**

```json
{
  "command_id": "668b2a14-6567-4065-842b-ca7a628c9869",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "c8994150-b662-4c45-8c7b-6a4d6002e512"
  ]
}
```

```json
{
  "id": "23413820-ce63-4938-a609-7f813a9fd145",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3865bc1b-c240-419e-99c9-b55545bb99ca",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:32:59.592112Z",
  "updated_at": "2026-10-28T13:33:01.671197Z",
  "messages": [
    {
      "id": "1dd8fa58-63b5-41a8-bd85-9d3c45ef3c42",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3865bc1b-c240-419e-99c9-b55545bb99ca",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:32:59.593423Z",
      "attachments": [
        {
          "file_id": "848ca8b5-c20a-490b-99bd-35bd44cbbf86",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "26510411-b13d-4f3b-886b-a47edc59e555",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:33:01.670776Z",
      "attachments": [
        {
          "file_id": "c8994150-b662-4c45-8c7b-6a4d6002e512",
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

`GET /api/rider/v1/support/cases/23413820-ce63-4938-a609-7f813a9fd145` → **200**

```json
{
  "id": "23413820-ce63-4938-a609-7f813a9fd145",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3865bc1b-c240-419e-99c9-b55545bb99ca",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:32:59.592112Z",
  "updated_at": "2026-10-28T13:33:01.671197Z",
  "messages": [
    {
      "id": "1dd8fa58-63b5-41a8-bd85-9d3c45ef3c42",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3865bc1b-c240-419e-99c9-b55545bb99ca",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:32:59.593423Z",
      "attachments": [
        {
          "file_id": "848ca8b5-c20a-490b-99bd-35bd44cbbf86",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "26510411-b13d-4f3b-886b-a47edc59e555",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:33:01.670776Z",
      "attachments": [
        {
          "file_id": "c8994150-b662-4c45-8c7b-6a4d6002e512",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/23413820-ce63-4938-a609-7f813a9fd145/attachments/c8994150-b662-4c45-8c7b-6a4d6002e512` → **200**

Done: support case 23413820-ce63-4938-a609-7f813a9fd145, rider attachment 848ca8b5-c20a-490b-99bd-35bd44cbbf86, operator attachment c8994150-b662-4c45-8c7b-6a4d6002e512.

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
  "session_id": "861fee03-b0e9-434e-a6de-bce556efaeb2",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyODIsImlhdCI6MTc5MzE5NDM4MiwianRpIjoiN2Y2Y2RhOTctMDQ4MS00N2NlLThjMzEtNGQ2ZmRlZWE4NDRmIiwic2lkIjoiODYxZmVlMDMtYjBlOS00MzRlLWE2ZGUtYmNlNTU2ZWZhZWIyIn0.IE9dpeBorU-CaYRHMk1hBziAx88uYpsaT8oSlQWbOEY",
  "access_expires_at": "2026-10-28T13:48:02.544102629Z",
  "refresh_token": "0FTw1z_RQj52lrn6a32cNvquUpcEIyW2-wgpn1Mbxj8",
  "refresh_expires_at": "2026-10-29T01:33:02.543525113Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20379"
}
```

```json
{
  "challenge_id": "5fa0b76c-d490-4242-8d43-3e447c0bdf93",
  "expires_at": "2026-10-28T13:38:02.811367Z",
  "resend_available_at": "2026-10-28T13:33:03.811367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "344560",
  "sent_at": "2026-10-28T13:33:02.813596959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fa0b76c-d490-4242-8d43-3e447c0bdf93",
  "code": "344560",
  "device_ref": "sandbox-20379"
}
```

```json
{
  "session_id": "39b601f3-57ba-43b8-ab1e-a9c5bf9dd6e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTI4MywiaWF0IjoxNzkzMTk0MzgzLCJqdGkiOiIwYWE1MTI1YS01OWM3LTQ4YjUtOGU2Yy02NTliY2EwYjk2NGIiLCJzaWQiOiIzOWI2MDFmMy01N2JhLTQzYjgtYWIxZS1hOWM1YmY5ZGQ2ZTAifQ.8SbikAJe8jWSsvXEyytr0nfHR6I0-pxzmVmNvhqqBc0",
  "access_expires_at": "2026-10-28T13:48:03.1028426Z",
  "refresh_token": "XB3m7iCmldbOgRRPTGR5QIi4xcV0YM7mb2A6zakKEY0",
  "refresh_expires_at": "2026-11-27T13:33:03.102292795Z",
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
      "actor_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:32:51.494305Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T13:32:52.898257Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "b12c6ef5-8234-4bba-9748-d88069db5251",
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
  "device_ref": "sandbox-5563"
}
```

```json
{
  "challenge_id": "78d35296-cb45-4643-8431-683a07380d88",
  "expires_at": "2026-10-28T13:38:04.194900916Z",
  "resend_available_at": "2026-10-28T13:33:05.194900916Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "829040",
  "sent_at": "2026-10-28T13:33:04.19701824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78d35296-cb45-4643-8431-683a07380d88",
  "code": "829040",
  "device_ref": "sandbox-5563"
}
```

```json
{
  "session_id": "7c18ea5b-8c3f-46ca-9e1f-0a877c3675ab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTI4NCwiaWF0IjoxNzkzMTk0Mzg0LCJqdGkiOiI1ZmQ4ZDY5ZC04MDYyLTQ1Y2UtOTAyMy0wODU2MTBkNjI3NTMiLCJzaWQiOiI3YzE4ZWE1Yi04YzNmLTQ2Y2EtOWUxZi0wYTg3N2MzNjc1YWIifQ.wNA1_kOp0INJd56Djmep2vhpgs51YE6Z09CY2B_hDWw",
  "access_expires_at": "2026-10-28T13:48:04.483715985Z",
  "refresh_token": "fMbPpEe-Z6zF-gh-QAdTsr3af0XFdCo0eEvD67xJDE4",
  "refresh_expires_at": "2026-11-27T13:33:04.483171861Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "562c9fd6-3ae6-412e-9220-5eae3632b2b4",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:32:31.942976Z",
  "last_location_at": "2026-10-28T13:32:31.942976Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/562c9fd6-3ae6-412e-9220-5eae3632b2b4/handover` → **200**

```json
{
  "command_id": "fbf6cdb3-52db-4199-92ad-80e24b9a6216",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "562c9fd6-3ae6-412e-9220-5eae3632b2b4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T13:32:31.942976Z",
  "last_location_at": "2026-10-28T13:32:31.942976Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/562c9fd6-3ae6-412e-9220-5eae3632b2b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:33:05Z",
    "sequence": 1793194385283
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "562c9fd6-3ae6-412e-9220-5eae3632b2b4",
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
  "last_heartbeat_at": "2026-10-28T13:33:05.301329Z",
  "last_location_at": "2026-10-28T13:33:05.301329Z",
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
  "command_id": "57878953-fc9e-4c20-9f7c-0f6f117827ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:33:05Z",
    "sequence": 1793194385847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eff612f0-a88a-4785-9d1a-9ed016f287af",
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
  "last_heartbeat_at": "2026-10-28T13:33:05.864978Z",
  "last_location_at": "2026-10-28T13:33:05.864978Z",
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
  "session_id": "e3ea117d-d7fd-482a-905a-d5a8d82cf472",
  "subject": {
    "type": "STAFF",
    "id": "e69abfd2-8f90-47d6-bb8a-1767bedade0a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjlhYmZkMi04ZjkwLTQ3ZDYtYmI4YS0xNzY3YmVkYWRlMGEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTUyODYsImlhdCI6MTc5MzE5NDM4NiwianRpIjoiZmFlMThiZDItYmYyNy00NTZlLTgzODEtZTc2MWQ5YTIwYTFmIiwic2lkIjoiZTNlYTExN2QtZDdmZC00ODJhLTkwNWEtZDVhOGQ4MmNmNDcyIn0.GJqybT50lb4oMFqeHaIpxV67pxGzGZQ-7YNH0dflu7Q",
  "access_expires_at": "2026-10-28T13:48:06.427525151Z",
  "refresh_token": "2PWLVvJ6YrdeTnNmPvac0O7Dl1v04siZ9RzqZt7l_Zg",
  "refresh_expires_at": "2026-10-29T01:33:06.426992869Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1f5da3ee-5277-46f3-a77d-6ee1317aebb1",
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
  "id": "7c2b37cc-1968-4f36-89f0-a33314346b1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:38:06.696332Z",
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
  "command_id": "b56ebae6-a2f3-4fd9-a5cc-571571422f34",
  "quote_id": "7c2b37cc-1968-4f36-89f0-a33314346b1b",
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
  "id": "de5221c7-af3e-472b-b11e-106300c678bf",
  "short_number": 22,
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
  "created_at": "2026-10-28T13:33:06.977811Z",
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
    "id": "4665ba83-5cfa-4a1f-87c6-dc59cd465b01",
    "order_id": "de5221c7-af3e-472b-b11e-106300c678bf",
    "expires_at": "2026-10-28T13:33:21.982278Z",
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

`POST /api/driver/v1/offers/4665ba83-5cfa-4a1f-87c6-dc59cd465b01/accept` → **200**

```json
{
  "command_id": "1bb3f2b5-8f93-4aea-951f-4cab1a5d2e38"
}
```

```json
{
  "id": "aeccdf58-f2c1-4ec9-b4bd-a0ba8c70f8b2",
  "order_id": "de5221c7-af3e-472b-b11e-106300c678bf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864",
  "order_id": "de5221c7-af3e-472b-b11e-106300c678bf",
  "assignment_id": "aeccdf58-f2c1-4ec9-b4bd-a0ba8c70f8b2",
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

`POST /api/driver/v1/work-sessions/eff612f0-a88a-4785-9d1a-9ed016f287af/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:33:08Z",
    "sequence": 1793194388350
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eff612f0-a88a-4785-9d1a-9ed016f287af",
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
  "last_heartbeat_at": "2026-10-28T13:33:08.367661Z",
  "last_location_at": "2026-10-28T13:33:08.367661Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864/arrive` → **200**

```json
{
  "command_id": "1c9925d5-95e8-4f94-bd7f-52e324d8fedc",
  "expected_version": 0
}
```

```json
{
  "id": "6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864",
  "order_id": "de5221c7-af3e-472b-b11e-106300c678bf",
  "assignment_id": "aeccdf58-f2c1-4ec9-b4bd-a0ba8c70f8b2",
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
  "arrived_at": "2026-10-28T13:33:08.643357Z",
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

`POST /api/driver/v1/trips/6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864/start` → **200**

```json
{
  "command_id": "16e3153f-1847-42a4-a2af-19fb78052589",
  "expected_version": 1
}
```

```json
{
  "id": "6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864",
  "order_id": "de5221c7-af3e-472b-b11e-106300c678bf",
  "assignment_id": "aeccdf58-f2c1-4ec9-b4bd-a0ba8c70f8b2",
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
  "arrived_at": "2026-10-28T13:33:08.643357Z",
  "started_at": "2026-10-28T13:33:08.92776Z",
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

`POST /api/driver/v1/trips/6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864/complete` → **200**

```json
{
  "command_id": "bd717a44-2755-4c89-a08a-09f212338086",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:33:09Z",
  "cash_received": true
}
```

```json
{
  "id": "6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864",
  "order_id": "de5221c7-af3e-472b-b11e-106300c678bf",
  "assignment_id": "aeccdf58-f2c1-4ec9-b4bd-a0ba8c70f8b2",
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
  "arrived_at": "2026-10-28T13:33:08.643357Z",
  "started_at": "2026-10-28T13:33:08.92776Z",
  "completed_at": "2026-10-28T13:33:09.209035Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/de5221c7-af3e-472b-b11e-106300c678bf` → **200**

```json
{
  "id": "de5221c7-af3e-472b-b11e-106300c678bf",
  "short_number": 22,
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
    "id": "aeccdf58-f2c1-4ec9-b4bd-a0ba8c70f8b2",
    "order_id": "de5221c7-af3e-472b-b11e-106300c678bf",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6dfc1fb5-9c4a-49fd-8a2d-76e5b3a15864",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:33:06.977811Z",
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
  "session_id": "562c9fd6-3ae6-412e-9220-5eae3632b2b4",
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
  "last_heartbeat_at": "2026-10-28T13:33:05.301329Z",
  "last_location_at": "2026-10-28T13:33:05.301329Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/562c9fd6-3ae6-412e-9220-5eae3632b2b4/close` → **200**

```json
{
  "command_id": "7fd86ca2-9840-4527-8ccc-edc1e1f4fc42",
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
  "session_id": "eff612f0-a88a-4785-9d1a-9ed016f287af",
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
  "last_heartbeat_at": "2026-10-28T13:33:08.367661Z",
  "last_location_at": "2026-10-28T13:33:08.367661Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eff612f0-a88a-4785-9d1a-9ed016f287af/close` → **200**

```json
{
  "command_id": "1c3d4326-8508-445f-8696-546b15e21c89",
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

Done: terminal order de5221c7-af3e-472b-b11e-106300c678bf by Andrii (5a000000-0000-4000-8000-000000000403).
