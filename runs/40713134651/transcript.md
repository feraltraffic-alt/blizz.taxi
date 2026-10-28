# Sandbox transcript (2026-10-28T15:10:32Z, 8572b31)

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
  "correlation_id": "7e4a2cf6-b9fc-4033-9c95-cfabce4b67e2"
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
  "session_id": "b5fa32e7-f275-407c-a272-637725ee4994",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExMzcsImlhdCI6MTc5MzIwMDIzNywianRpIjoiNzE4YTViMGEtNzgwYy00ZWQ0LWJiMmQtNDYwZWEyZTIxZmM2Iiwic2lkIjoiYjVmYTMyZTctZjI3NS00MDdjLWEyNzItNjM3NzI1ZWU0OTk0In0.YDvrn1V1GTOBumeCvJp-iKE8egS7qqSiKRgbQCFdAIM",
  "access_expires_at": "2026-10-28T15:25:37.69903242Z",
  "refresh_token": "tTq4qepmaAmm1wvc0IHXq4IriWQk8tYd_N_2ExdPzHU",
  "refresh_expires_at": "2026-10-29T03:10:37.697473161Z",
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
  "session_id": "bbfb32fd-7423-4a97-8076-0b53ecb2cc03",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExMzgsImlhdCI6MTc5MzIwMDIzOCwianRpIjoiNDJjODg5NDgtNzNmNi00MDNmLTllYWEtNDFmZWRkZmZiYjRhIiwic2lkIjoiYmJmYjMyZmQtNzQyMy00YTk3LTgwNzYtMGI1M2VjYjJjYzAzIn0.ihh6TO1ous-mzog2Sp2Tngu3v3pgp2LmJeO9w7UBSdY",
  "access_expires_at": "2026-10-28T15:25:38.789234185Z",
  "refresh_token": "vBcskmhjhTHamPxPdaXF_ufomGIe4hlyBVrX2WxzSQA",
  "refresh_expires_at": "2026-10-29T03:10:38.788629864Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "84d84127-9df6-4b0a-9011-409e28884c12",
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
  "id": "d6ec8815-50ed-4b29-a181-ce22cc4989e3",
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
  "created_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "created_at": "2026-10-28T15:10:38.980414Z",
  "updated_at": "2026-10-28T15:10:38.980414Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636102962",
  "device_ref": "sandbox-32543"
}
```

```json
{
  "challenge_id": "2c2e2ee3-c185-4b94-abf5-4df75616fe7f",
  "expires_at": "2026-10-28T15:15:39.174533102Z",
  "resend_available_at": "2026-10-28T15:10:40.174533102Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636102962` → **200**

```json
{
  "phone": "+380636102962",
  "audience": "CLIENT",
  "code": "559424",
  "sent_at": "2026-10-28T15:10:39.18339981Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c2e2ee3-c185-4b94-abf5-4df75616fe7f",
  "code": "559424",
  "device_ref": "sandbox-32543"
}
```

```json
{
  "session_id": "85952ac3-5677-4464-9093-cafafc34e0df",
  "subject": {
    "type": "CLIENT",
    "id": "210add66-79bc-42f0-851c-8844fd9f33aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTBhZGQ2Ni03OWJjLTQyZjAtODUxYy04ODQ0ZmQ5ZjMzYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMTM5LCJpYXQiOjE3OTMyMDAyMzksImp0aSI6ImU2ZDUxNDE1LTM3YWYtNDU5MS1hYzkzLTdkZmVlMGIwMzU3MiIsInNpZCI6Ijg1OTUyYWMzLTU2NzctNDQ2NC05MDkzLWNhZmFmYzM0ZTBkZiJ9.OL0NOowKzK3wgOZy1CgA94aYOY7wKFUeZFemb5K4DdU",
  "access_expires_at": "2026-10-28T15:25:39.398239399Z",
  "refresh_token": "wpfajn5ITHR4HJveqiTVeYuDaHVTe96JW-AUUfiGovQ",
  "refresh_expires_at": "2026-11-27T15:10:39.397476615Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636102962` → **200**

```json
{
  "client_id": "210add66-79bc-42f0-851c-8844fd9f33aa"
}
```

`POST /api/admin/v1/rider-wallets/210add66-79bc-42f0-851c-8844fd9f33aa/top-ups` → **201**

```json
{
  "command_id": "64938e5b-8034-4366-be7a-3fe804354a63",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "210add66-79bc-42f0-851c-8844fd9f33aa",
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
      "id": "6f723617-a61e-4b62-82b3-c56a1fe8625c",
      "at": "2026-10-28T15:10:39.772109Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d5130259-b933-41b0-b22c-9e2ff179368e",
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
  "id": "c8f48a74-3771-4df2-81fc-78e8b940efc6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:15:40.052987Z",
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
      "id": "d6ec8815-50ed-4b29-a181-ce22cc4989e3",
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
  "device_ref": "sandbox-13050"
}
```

```json
{
  "challenge_id": "31028db9-9638-4ab3-b89e-46321ddca398",
  "expires_at": "2026-10-28T15:15:40.256337319Z",
  "resend_available_at": "2026-10-28T15:10:41.256337319Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "863646",
  "sent_at": "2026-10-28T15:10:40.259421236Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31028db9-9638-4ab3-b89e-46321ddca398",
  "code": "863646",
  "device_ref": "sandbox-13050"
}
```

```json
{
  "session_id": "124961f4-63c0-4914-bcc9-f3dbeeb17dc4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTE0MCwiaWF0IjoxNzkzMjAwMjQwLCJqdGkiOiI0YzYwOTRhYy05MzJlLTQzOTgtOGYxNi0yNGYzMWMwYzRiZjUiLCJzaWQiOiIxMjQ5NjFmNC02M2MwLTQ5MTQtYmNjOS1mM2RiZWViMTdkYzQifQ.f3pJj2JVJuAk_n_NdS9gCtuGvUes_yFwhMfsKN_utXs",
  "access_expires_at": "2026-10-28T15:25:40.453644481Z",
  "refresh_token": "b3-A-M0BGTHcRABP1TlIG6MnPwHAYo5VCzvn_FobWMA",
  "refresh_expires_at": "2026-11-27T15:10:40.453104007Z",
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
  "command_id": "44ad7d89-c5d9-4756-9856-42fc9d29f9ef",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:10:40Z",
    "sequence": 1793200240804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01060d8a-28a4-4508-ba78-ed71b5ae0696",
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
  "last_heartbeat_at": "2026-10-28T15:10:40.83585Z",
  "last_location_at": "2026-10-28T15:10:40.83585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1605630b-5317-4c7f-8559-cb760ab0599f",
  "quote_id": "c8f48a74-3771-4df2-81fc-78e8b940efc6",
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
  "id": "6c86d84f-598b-4953-8e45-ce01314662c7",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "210add66-79bc-42f0-851c-8844fd9f33aa",
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
  "created_at": "2026-10-28T15:10:41.048579Z",
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
  "client_id": "210add66-79bc-42f0-851c-8844fd9f33aa",
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
      "id": "6f723617-a61e-4b62-82b3-c56a1fe8625c",
      "at": "2026-10-28T15:10:39.772109Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
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
    "id": "6e5e5e2b-17cd-4c55-bd35-adfb0b03b067",
    "order_id": "6c86d84f-598b-4953-8e45-ce01314662c7",
    "expires_at": "2026-10-28T15:10:56.058976Z",
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

`POST /api/driver/v1/offers/6e5e5e2b-17cd-4c55-bd35-adfb0b03b067/accept` → **200**

```json
{
  "command_id": "4396c232-42a4-46b5-96aa-8fcf9e177925"
}
```

```json
{
  "id": "5eb316ab-6aa3-449f-bf09-7e30bf20c3ed",
  "order_id": "6c86d84f-598b-4953-8e45-ce01314662c7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "573162fd-b3f1-461f-8fcb-4b42f01087b0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "573162fd-b3f1-461f-8fcb-4b42f01087b0",
  "order_id": "6c86d84f-598b-4953-8e45-ce01314662c7",
  "assignment_id": "5eb316ab-6aa3-449f-bf09-7e30bf20c3ed",
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

`POST /api/driver/v1/work-sessions/01060d8a-28a4-4508-ba78-ed71b5ae0696/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:10:41Z",
    "sequence": 1793200241995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01060d8a-28a4-4508-ba78-ed71b5ae0696",
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
  "last_heartbeat_at": "2026-10-28T15:10:42.017726Z",
  "last_location_at": "2026-10-28T15:10:42.017726Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/573162fd-b3f1-461f-8fcb-4b42f01087b0/arrive` → **200**

```json
{
  "command_id": "5851e6a6-74e1-4997-95bd-754fde53dc64",
  "expected_version": 0
}
```

```json
{
  "id": "573162fd-b3f1-461f-8fcb-4b42f01087b0",
  "order_id": "6c86d84f-598b-4953-8e45-ce01314662c7",
  "assignment_id": "5eb316ab-6aa3-449f-bf09-7e30bf20c3ed",
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
  "arrived_at": "2026-10-28T15:10:42.21594Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/573162fd-b3f1-461f-8fcb-4b42f01087b0/start` → **200**

```json
{
  "command_id": "710d5abd-14ca-45e5-9e61-7f8e79c00206",
  "expected_version": 1
}
```

```json
{
  "id": "573162fd-b3f1-461f-8fcb-4b42f01087b0",
  "order_id": "6c86d84f-598b-4953-8e45-ce01314662c7",
  "assignment_id": "5eb316ab-6aa3-449f-bf09-7e30bf20c3ed",
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
  "arrived_at": "2026-10-28T15:10:42.21594Z",
  "started_at": "2026-10-28T15:10:42.405668Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/573162fd-b3f1-461f-8fcb-4b42f01087b0/complete` → **200**

```json
{
  "command_id": "32c518a7-9fdf-496c-8014-2eb722bccf3b",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:10:42Z",
  "cash_received": true
}
```

```json
{
  "id": "573162fd-b3f1-461f-8fcb-4b42f01087b0",
  "order_id": "6c86d84f-598b-4953-8e45-ce01314662c7",
  "assignment_id": "5eb316ab-6aa3-449f-bf09-7e30bf20c3ed",
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
  "arrived_at": "2026-10-28T15:10:42.21594Z",
  "started_at": "2026-10-28T15:10:42.405668Z",
  "completed_at": "2026-10-28T15:10:42.608954Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "210add66-79bc-42f0-851c-8844fd9f33aa",
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
      "id": "3167d610-1b9b-498b-a77a-59a3e25d2216",
      "at": "2026-10-28T15:10:42.709014Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "6c86d84f-598b-4953-8e45-ce01314662c7"
    },
    {
      "id": "6f723617-a61e-4b62-82b3-c56a1fe8625c",
      "at": "2026-10-28T15:10:39.772109Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/d6ec8815-50ed-4b29-a181-ce22cc4989e3/archive` → **200**

```json
{
  "command_id": "98a97128-cdeb-44e1-b37d-04e638a2f405",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "d6ec8815-50ed-4b29-a181-ce22cc4989e3",
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
  "created_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "created_at": "2026-10-28T15:10:38.980414Z",
  "updated_at": "2026-10-28T15:10:45.997837Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "01060d8a-28a4-4508-ba78-ed71b5ae0696",
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
  "last_heartbeat_at": "2026-10-28T15:10:42.017726Z",
  "last_location_at": "2026-10-28T15:10:42.017726Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/01060d8a-28a4-4508-ba78-ed71b5ae0696/close` → **200**

```json
{
  "command_id": "60ee806f-1379-4aac-8e1c-85a8dc5695ed",
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

Done: order 6c86d84f-598b-4953-8e45-ce01314662c7.

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
  "session_id": "b1c9b07d-642d-43f9-a308-bc9bb961b19d",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExNDYsImlhdCI6MTc5MzIwMDI0NiwianRpIjoiZjc0OGU5ZTAtMDY3NS00YjY4LTlmYjUtM2ExNTQ4ZWIwNjIzIiwic2lkIjoiYjFjOWIwN2QtNjQyZC00M2Y5LWEzMDgtYmM5YmI5NjFiMTlkIn0.vo3KDXt79L3-hA0Pv58AGfvEcSuG5JPTLZZbjkvDPX8",
  "access_expires_at": "2026-10-28T15:25:46.80225535Z",
  "refresh_token": "KP4K_pDrC2RLmCSNOz5zVOs1u_jJwi-D7bTMyurUob0",
  "refresh_expires_at": "2026-10-29T03:10:46.801588921Z",
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
  "command_id": "7df5686d-eacd-4960-b23c-0b08dcee7de9",
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
  "session_id": "763bb838-f0ef-4977-8dd5-95a5016c3fcf",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExNDcsImlhdCI6MTc5MzIwMDI0NywianRpIjoiMGVhNTU5NTEtZjAwMC00ZmIwLWI4MmYtZTQyMzkyMWUyMTYwIiwic2lkIjoiNzYzYmI4MzgtZjBlZi00OTc3LThkZDUtOTVhNTAxNmMzZmNmIn0.uCieeGd3h81f1U879VrQlSeQQAnV39AGBU4wG8h1AHE",
  "access_expires_at": "2026-10-28T15:25:47.528617894Z",
  "refresh_token": "FYReoMTGbcGLlyTabTkR-aw6HraxFbOfUMNJhVoOwiM",
  "refresh_expires_at": "2026-10-29T03:10:47.527950523Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1314024580",
    "linkedid": "1730052700.1314024580",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678340982"
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
    "id": "1730052700.1314024580",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "18a3a38b-6293-46ef-931a-57368fe74ac4",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678340982",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:10:47.697356Z",
      "answered_at": null,
      "ended_at": "2026-10-28T15:10:47.718815Z",
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
    "id": "1730052600.2730425600",
    "linkedid": "1730052600.2730425600",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678340982"
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
      "id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678340982",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:10:47.930877Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/a2009ef1-712d-4c65-a4a9-583271d78a69/answer` → **200**

```json
{
  "command_id": "33fdb41f-16bd-4e7a-a7c8-9e8eb17619a8"
}
```

```json
{
  "id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678340982",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "order_ids": [],
  "started_at": "2026-10-28T15:10:47.930877Z",
  "answered_at": "2026-10-28T15:10:48.145462Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2730425600",
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
    "id": "1730052600.2730425600",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678340982",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [],
      "started_at": "2026-10-28T15:10:47.930877Z",
      "answered_at": "2026-10-28T15:10:48.145462Z",
      "ended_at": "2026-10-28T15:10:48.352077Z",
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
      "id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678340982",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [],
      "started_at": "2026-10-28T15:10:47.930877Z",
      "answered_at": "2026-10-28T15:10:48.145462Z",
      "ended_at": "2026-10-28T15:10:48.352077Z",
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
      "id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678340982",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [],
      "started_at": "2026-10-28T15:10:47.930877Z",
      "answered_at": "2026-10-28T15:10:48.145462Z",
      "ended_at": "2026-10-28T15:10:48.352077Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:10:51.578902Z"
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
      "id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678340982",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [],
      "started_at": "2026-10-28T15:10:47.930877Z",
      "answered_at": "2026-10-28T15:10:48.145462Z",
      "ended_at": "2026-10-28T15:10:48.352077Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:10:51.578902Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/a2009ef1-712d-4c65-a4a9-583271d78a69/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/a2009ef1-712d-4c65-a4a9-583271d78a69/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=a2009ef1-712d-4c65-a4a9-583271d78a69` → **200**

```json
{
  "changes": [
    {
      "id": "f6cc4ed2-560d-44f6-95da-c6b425b1ba2c",
      "occurred_at": "2026-10-28T15:10:53.142313Z",
      "actor_type": "STAFF",
      "actor_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a9b33191-45c7-40d5-8c3e-7940d1c3e6ec\", \"order_ids\": []}",
      "correlation_id": "252d1d95-58b3-40f5-8e9b-195ec5f5a087"
    },
    {
      "id": "e6a03b23-325e-40f7-b2dd-d7d7f54e753c",
      "occurred_at": "2026-10-28T15:10:53.113662Z",
      "actor_type": "STAFF",
      "actor_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a9b33191-45c7-40d5-8c3e-7940d1c3e6ec\", \"order_ids\": []}",
      "correlation_id": "bc141060-4b0a-4dfe-9a40-fac5733ec536"
    }
  ]
}
```

Done: call a2009ef1-712d-4c65-a4a9-583271d78a69 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4928"
}
```

```json
{
  "challenge_id": "61679d31-6198-4e66-84d0-3ba222d9aeab",
  "expires_at": "2026-10-28T15:15:53.360046543Z",
  "resend_available_at": "2026-10-28T15:10:54.360046543Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "980620",
  "sent_at": "2026-10-28T15:10:53.363225383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61679d31-6198-4e66-84d0-3ba222d9aeab",
  "code": "980620",
  "device_ref": "sandbox-4928"
}
```

```json
{
  "session_id": "2a91c046-040b-4d8c-bff8-023b990c39f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTE1MywiaWF0IjoxNzkzMjAwMjUzLCJqdGkiOiIzODcxMWExMi1kMjNlLTQ5NTgtYjc4MS0zYTdlNTA5OGFmNTQiLCJzaWQiOiIyYTkxYzA0Ni0wNDBiLTRkOGMtYmZmOC0wMjNiOTkwYzM5ZjUifQ.if4wQt4MCRQAd3pPnZ8YkPdXAOOirqSwAI8cTBJgfT4",
  "access_expires_at": "2026-10-28T15:25:53.567231397Z",
  "refresh_token": "6AcQT94q2K7yZwcpC33Q72FOkZ737D9jVH6Ic_n2AP8",
  "refresh_expires_at": "2026-11-27T15:10:53.566709888Z",
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
  "command_id": "0250b65a-f460-4c67-a62c-f925c1a880d4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:10:53Z",
    "sequence": 1793200253923
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ea27a5-5466-4dae-8e2b-77a31dcb9212",
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
  "last_heartbeat_at": "2026-10-28T15:10:54.020586Z",
  "last_location_at": "2026-10-28T15:10:54.020586Z",
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
  "session_id": "fba9bd39-2740-4f7d-9302-89665a992449",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExNTQsImlhdCI6MTc5MzIwMDI1NCwianRpIjoiYjIxNTdjODEtOGFmOC00NDE4LTk1N2EtOTVlN2MzYjcxMTA1Iiwic2lkIjoiZmJhOWJkMzktMjc0MC00ZjdkLTkzMDItODk2NjVhOTkyNDQ5In0.Ons0Ld9RvwZSiTJ7gzPqZWi-485EnGqhBzSNdXDNEEo",
  "access_expires_at": "2026-10-28T15:25:54.639202332Z",
  "refresh_token": "g02VMLkiLo5cTHWhJcgFX1dEJG2BokNjIVUf_6G6rnY",
  "refresh_expires_at": "2026-10-29T03:10:54.63874964Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "906cd047-6d78-4dce-b2b5-8b5e6a64a695",
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
  "id": "6e6f1152-2bbc-4812-8c95-f6b98ad6c3b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:15:54.820768Z",
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
  "command_id": "6643121e-b9ad-45e4-85c3-e0bb8ed2c7c7",
  "quote_id": "6e6f1152-2bbc-4812-8c95-f6b98ad6c3b6",
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
    "phone": "+380678849022"
  }
}
```

```json
{
  "id": "61c781ea-0b74-49b0-85b2-85575534908b",
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
  "created_at": "2026-10-28T15:10:55.020475Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678849022"
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
    "id": "0acecb31-0eec-43c6-82c8-57267c5ca943",
    "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
    "expires_at": "2026-10-28T15:11:10.024386Z",
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

`POST /api/driver/v1/offers/0acecb31-0eec-43c6-82c8-57267c5ca943/accept` → **200**

```json
{
  "command_id": "c4c81e1a-25d2-4549-bf6a-7f40e5127076"
}
```

```json
{
  "id": "c337352a-4b18-44f8-b51f-87340ef6f1e1",
  "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5eb54f54-99a7-4494-b3df-60b82efc4344",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[
  {
    "phone": "+380678849022",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:56.66790087Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[
  {
    "phone": "+380678849022",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:56.66790087Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[
  {
    "phone": "+380678849022",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:56.66790087Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5eb54f54-99a7-4494-b3df-60b82efc4344",
  "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
  "assignment_id": "c337352a-4b18-44f8-b51f-87340ef6f1e1",
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
    "phone": "+380678849022"
  }
}
```

`POST /api/driver/v1/work-sessions/65ea27a5-5466-4dae-8e2b-77a31dcb9212/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:10:57Z",
    "sequence": 1793200257904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "65ea27a5-5466-4dae-8e2b-77a31dcb9212",
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
  "last_heartbeat_at": "2026-10-28T15:10:57.922319Z",
  "last_location_at": "2026-10-28T15:10:57.922319Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5eb54f54-99a7-4494-b3df-60b82efc4344/arrive` → **200**

```json
{
  "command_id": "af460607-e3a3-477d-9561-db33eae5cf15",
  "expected_version": 0
}
```

```json
{
  "id": "5eb54f54-99a7-4494-b3df-60b82efc4344",
  "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
  "assignment_id": "c337352a-4b18-44f8-b51f-87340ef6f1e1",
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
  "arrived_at": "2026-10-28T15:10:58.103568Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678849022"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[
  {
    "phone": "+380678849022",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:56.66790087Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[
  {
    "phone": "+380678849022",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:56.66790087Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[
  {
    "phone": "+380678849022",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:56.66790087Z"
  },
  {
    "phone": "+380678849022",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:59.679317403Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[
  {
    "phone": "+380678849022",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:56.66790087Z"
  },
  {
    "phone": "+380678849022",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:59.679317403Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678849022` → **200**

```json
[
  {
    "phone": "+380678849022",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:56.66790087Z"
  },
  {
    "phone": "+380678849022",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:10:59.679317403Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/5eb54f54-99a7-4494-b3df-60b82efc4344/start` → **200**

```json
{
  "command_id": "c0b4739c-9c41-4d83-82a8-180ec6f052cd",
  "expected_version": 1
}
```

```json
{
  "id": "5eb54f54-99a7-4494-b3df-60b82efc4344",
  "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
  "assignment_id": "c337352a-4b18-44f8-b51f-87340ef6f1e1",
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
  "arrived_at": "2026-10-28T15:10:58.103568Z",
  "started_at": "2026-10-28T15:11:00.389085Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678849022"
  }
}
```

`POST /api/driver/v1/trips/5eb54f54-99a7-4494-b3df-60b82efc4344/complete` → **200**

```json
{
  "command_id": "73fc2964-080b-449c-a5ee-ca8211fac2f8",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:11:00Z",
  "cash_received": true
}
```

```json
{
  "id": "5eb54f54-99a7-4494-b3df-60b82efc4344",
  "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
  "assignment_id": "c337352a-4b18-44f8-b51f-87340ef6f1e1",
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
  "arrived_at": "2026-10-28T15:10:58.103568Z",
  "started_at": "2026-10-28T15:11:00.389085Z",
  "completed_at": "2026-10-28T15:11:00.580033Z",
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
  "session_id": "65ea27a5-5466-4dae-8e2b-77a31dcb9212",
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
  "last_heartbeat_at": "2026-10-28T15:10:57.922319Z",
  "last_location_at": "2026-10-28T15:10:57.922319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65ea27a5-5466-4dae-8e2b-77a31dcb9212/close` → **200**

```json
{
  "command_id": "941c24ea-3fd2-4673-84a1-9f5b570e69cd",
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
  "phone": "+380636748618",
  "device_ref": "sandbox-1530"
}
```

```json
{
  "challenge_id": "00b1d199-0fcc-454a-8f6f-fc6ca2e46798",
  "expires_at": "2026-10-28T15:16:01.140943642Z",
  "resend_available_at": "2026-10-28T15:11:02.140943642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636748618` → **200**

```json
{
  "phone": "+380636748618",
  "audience": "CLIENT",
  "code": "029907",
  "sent_at": "2026-10-28T15:11:01.143802979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00b1d199-0fcc-454a-8f6f-fc6ca2e46798",
  "code": "029907",
  "device_ref": "sandbox-1530"
}
```

```json
{
  "session_id": "a9c8b494-a2fd-4912-bd35-dc7845e1cf81",
  "subject": {
    "type": "CLIENT",
    "id": "2f390a67-2694-4c0d-bcbf-95836c4f92c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjM5MGE2Ny0yNjk0LTRjMGQtYmNiZi05NTgzNmM0ZjkyYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMTYxLCJpYXQiOjE3OTMyMDAyNjEsImp0aSI6ImQwZjBmM2E2LTI3ZDAtNDJlNi1hMGVlLTg2ZTg4YzIxN2VlMiIsInNpZCI6ImE5YzhiNDk0LWEyZmQtNDkxMi1iZDM1LWRjNzg0NWUxY2Y4MSJ9.WWfhltoIhydBwXxGpG8GYHhV3BocdLHiese6EFxaD1c",
  "access_expires_at": "2026-10-28T15:26:01.345193477Z",
  "refresh_token": "6iFDYIEeZWyMzZfIwaR_WQSV1647vXPPtOTjMQoZ-os",
  "refresh_expires_at": "2026-11-27T15:11:01.344671431Z",
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
  "device_ref": "sandbox-17308"
}
```

```json
{
  "challenge_id": "db75f1f1-95a0-4836-a3c1-0c873d7cd39e",
  "expires_at": "2026-10-28T15:16:01.706569598Z",
  "resend_available_at": "2026-10-28T15:11:02.706569598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "744029",
  "sent_at": "2026-10-28T15:11:01.708983123Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db75f1f1-95a0-4836-a3c1-0c873d7cd39e",
  "code": "744029",
  "device_ref": "sandbox-17308"
}
```

```json
{
  "session_id": "8adfb000-d5cc-4adb-baff-e7d73ff1ea72",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTE2MSwiaWF0IjoxNzkzMjAwMjYxLCJqdGkiOiJiMGFmMmYzZS04MDc3LTQ5M2YtYTUwOS0yNmRhOTAzOTE1YWMiLCJzaWQiOiI4YWRmYjAwMC1kNWNjLTRhZGItYmFmZi1lN2Q3M2ZmMWVhNzIifQ.dYWgiuoMjmLMHjwiqehM1txHJFRH4RmOymPedTm6Rsw",
  "access_expires_at": "2026-10-28T15:26:01.939327743Z",
  "refresh_token": "atbfnG6qQ6nYHhCHevFlSEeUxKJs9i-_4pDgaRl2Jfg",
  "refresh_expires_at": "2026-11-27T15:11:01.93888093Z",
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
  "session_id": "ab4e154b-f751-4af4-b991-aac222111e9d",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExNjIsImlhdCI6MTc5MzIwMDI2MiwianRpIjoiZmQzYWFiNWItNGFlNy00MGI5LTliOWEtYjE2N2JiOThlMDg2Iiwic2lkIjoiYWI0ZTE1NGItZjc1MS00YWY0LWI5OTEtYWFjMjIyMTExZTlkIn0.Z31jN9yVfiiNz-glXTacWJ1UNtUS9CSGUfd7z4gBAA8",
  "access_expires_at": "2026-10-28T15:26:02.490473038Z",
  "refresh_token": "hNbSKShGmAiAkk17zMWcfO3VBSK4YRzoMTFTY7Mnr5w",
  "refresh_expires_at": "2026-10-29T03:11:02.490107568Z",
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
  "session_id": "752be507-7a54-4a07-892b-2cbcfa3a1caa",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExNjIsImlhdCI6MTc5MzIwMDI2MiwianRpIjoiNGJiNTBiMmQtZWE2Zi00OTlkLWJhYTctZTcxOTExZjE2YjJlIiwic2lkIjoiNzUyYmU1MDctN2E1NC00YTA3LTg5MmItMmNiY2ZhM2ExY2FhIn0.z6xSSICW04pZJlDfvFJrEdRcuACw0Z71byHAUcDxJpc",
  "access_expires_at": "2026-10-28T15:26:02.873157485Z",
  "refresh_token": "e0R_GJONePrMoYOlL9qIyX5ms6ECIAJ23-J3NJ4m4e8",
  "refresh_expires_at": "2026-10-29T03:11:02.872746716Z",
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
  "command_id": "c3f24017-34d4-409b-9629-7f388b7feeea",
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
  "id": "d7d09ad2-8f1c-45bc-9fc8-10cd9e4b1bf6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:03.219321Z",
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
  "command_id": "c4ace3ae-b601-4465-bf36-fb03f8124ee3",
  "quote_id": "d7d09ad2-8f1c-45bc-9fc8-10cd9e4b1bf6",
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
  "id": "ec35da80-2945-4379-b925-6c53732e1089",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2f390a67-2694-4c0d-bcbf-95836c4f92c5",
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
  "created_at": "2026-10-28T15:11:03.41043Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ec35da80-2945-4379-b925-6c53732e1089` → **200**

```json
{
  "id": "ec35da80-2945-4379-b925-6c53732e1089",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2f390a67-2694-4c0d-bcbf-95836c4f92c5",
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
  "created_at": "2026-10-28T15:11:03.41043Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ec35da80-2945-4379-b925-6c53732e1089/cancel` → **200**

```json
{
  "command_id": "fa934e17-768c-4948-a8f6-cf8e05cf0a3b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ec35da80-2945-4379-b925-6c53732e1089",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2f390a67-2694-4c0d-bcbf-95836c4f92c5",
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
  "created_at": "2026-10-28T15:11:03.41043Z",
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
  "command_id": "e5783d3e-ec98-41a0-8e35-cf7da6dccbdf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:11:04Z",
    "sequence": 1793200264162
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "329c5dca-a7e8-4031-bd21-2b33bb31b050",
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
  "last_heartbeat_at": "2026-10-28T15:11:04.178261Z",
  "last_location_at": "2026-10-28T15:11:04.178261Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1780"
}
```

```json
{
  "challenge_id": "60437972-de1a-4078-b912-64b16f2f4920",
  "expires_at": "2026-10-28T15:16:04.372885384Z",
  "resend_available_at": "2026-10-28T15:11:05.372885384Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "867246",
  "sent_at": "2026-10-28T15:11:04.375283736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60437972-de1a-4078-b912-64b16f2f4920",
  "code": "867246",
  "device_ref": "sandbox-1780"
}
```

```json
{
  "session_id": "7d61b44d-43f9-4895-8a0b-f87e81a267d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTE2NCwiaWF0IjoxNzkzMjAwMjY0LCJqdGkiOiJkY2NjY2NmNS0yMzVmLTQ5ODUtOTFlMy1kM2E2YjVhMjEzZjAiLCJzaWQiOiI3ZDYxYjQ0ZC00M2Y5LTQ4OTUtOGEwYi1mODdlODFhMjY3ZDgifQ.fJp1x83Yf5jiz26P6nJOnZtZife9gpMAsuT3IYLHf2g",
  "access_expires_at": "2026-10-28T15:26:04.619289298Z",
  "refresh_token": "TywlQzq-iaOzlklh1dRLyRYx_BiBEuNP_JEqjNGbbnI",
  "refresh_expires_at": "2026-11-27T15:11:04.618771098Z",
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
  "command_id": "a163da76-55a9-4a4d-95dc-0f3a1e7b68a8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:11:04Z",
    "sequence": 1793200264987
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0efd1d8-a9d3-46bf-9676-af0f7bd85624",
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
  "last_heartbeat_at": "2026-10-28T15:11:05.003853Z",
  "last_location_at": "2026-10-28T15:11:05.003853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dc40a79b-63ff-4244-9b9a-04f50e1325eb",
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
  "id": "1adbcce4-5b7d-4810-8654-3b8345391e30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:05.187280Z",
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
  "command_id": "fdb77176-43ad-4627-8643-85fea2ec30c3",
  "quote_id": "1adbcce4-5b7d-4810-8654-3b8345391e30",
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
  "id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2f390a67-2694-4c0d-bcbf-95836c4f92c5",
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
  "created_at": "2026-10-28T15:11:05.376062Z",
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
    "id": "61ea146f-214e-43bb-8531-55d555d609f0",
    "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
    "expires_at": "2026-10-28T15:11:20.379192Z",
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

`POST /api/driver/v1/offers/61ea146f-214e-43bb-8531-55d555d609f0/accept` → **200**

```json
{
  "command_id": "e12d81d5-af2e-45b5-815a-5cf11754bc5d"
}
```

```json
{
  "id": "0b6a1114-6029-4ab9-8981-1b1cde2b7734",
  "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5055049d-69ce-4022-8d0b-15e102b51c2d",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5055049d-69ce-4022-8d0b-15e102b51c2d",
  "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
  "assignment_id": "0b6a1114-6029-4ab9-8981-1b1cde2b7734",
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

`POST /api/driver/v1/trips/5055049d-69ce-4022-8d0b-15e102b51c2d/cancel` → **200**

```json
{
  "command_id": "60fdddda-d390-47b5-ac86-40cc8a595133",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "5055049d-69ce-4022-8d0b-15e102b51c2d",
  "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
  "assignment_id": "0b6a1114-6029-4ab9-8981-1b1cde2b7734",
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

`GET /api/rider/v1/orders/e0a2abdb-c15f-458f-b663-6351a30b3efa` → **200**

```json
{
  "id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2f390a67-2694-4c0d-bcbf-95836c4f92c5",
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
    "id": "0b6a1114-6029-4ab9-8981-1b1cde2b7734",
    "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5055049d-69ce-4022-8d0b-15e102b51c2d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:11:05.376062Z",
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
    "id": "f37c7124-110d-4a3d-ac11-4195e0fb51cc",
    "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
    "expires_at": "2026-10-28T15:11:21.13723Z",
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

`POST /api/driver/v1/offers/f37c7124-110d-4a3d-ac11-4195e0fb51cc/accept` → **200**

```json
{
  "command_id": "20ff86d6-c83c-40cc-bae0-386dede8a1cd"
}
```

```json
{
  "id": "b228d663-cfa3-4fe4-a2be-9e49bc1325eb",
  "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c987f352-cf02-4019-aa0d-faa9f975b141",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c987f352-cf02-4019-aa0d-faa9f975b141",
  "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
  "assignment_id": "b228d663-cfa3-4fe4-a2be-9e49bc1325eb",
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

`POST /api/driver/v1/trips/c987f352-cf02-4019-aa0d-faa9f975b141/cancel` → **200**

```json
{
  "command_id": "b372e8a5-a785-4883-b4cc-378eb9be194a",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "c987f352-cf02-4019-aa0d-faa9f975b141",
  "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
  "assignment_id": "b228d663-cfa3-4fe4-a2be-9e49bc1325eb",
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
    "id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:11:05.376062Z",
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
    "id": "ec35da80-2945-4379-b925-6c53732e1089",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:11:03.41043Z",
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

`GET /api/operator/v1/orders/e0a2abdb-c15f-458f-b663-6351a30b3efa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:11:05.376627Z",
      "actor": {
        "type": "CLIENT",
        "id": "2f390a67-2694-4c0d-bcbf-95836c4f92c5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
        "quote_id": "1adbcce4-5b7d-4810-8654-3b8345391e30",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "e6b31e9c-d304-4067-a159-863070a3d122"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:11:05.378483Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
        "attempt_id": "02f8c12b-2c15-49e2-9ab7-59a07e935461",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e6b31e9c-d304-4067-a159-863070a3d122"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:11:05.383697Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "61ea146f-214e-43bb-8531-55d555d609f0",
        "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "e6b31e9c-d304-4067-a159-863070a3d122"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:11:05.758257Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "61ea146f-214e-43bb-8531-55d555d609f0",
        "order_id": "e0a2abdb-c15f-458f-b663-6351a30b3efa",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0b6a1114-6029-4ab9-8981-1b1cde2b7734"
      },
      "correlation_id": "19d5ed8c-ac54-4177-be08-b7a811bbf749"
```

Done: orders ec35da80-2945-4379-b925-6c53732e1089, e0a2abdb-c15f-458f-b663-6351a30b3efa.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734464028",
  "device_ref": "sandbox-26379"
}
```

```json
{
  "challenge_id": "dfb78acd-54d8-4406-ac48-5e3d27fd679f",
  "expires_at": "2026-10-28T15:16:07.637183856Z",
  "resend_available_at": "2026-10-28T15:11:08.637183856Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734464028` → **200**

```json
{
  "phone": "+380734464028",
  "audience": "CLIENT",
  "code": "647944",
  "sent_at": "2026-10-28T15:11:07.639888045Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfb78acd-54d8-4406-ac48-5e3d27fd679f",
  "code": "647944",
  "device_ref": "sandbox-26379"
}
```

```json
{
  "session_id": "7d3b69d8-5cad-42a0-b55d-376bbbcbd821",
  "subject": {
    "type": "CLIENT",
    "id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Y2JjMzlkMi1lYTRiLTQxZjctYjI3OS1jN2RmMTQ3MjcyZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMTY3LCJpYXQiOjE3OTMyMDAyNjcsImp0aSI6ImViYzdhNjcyLTgyYWYtNDc5MS05MTM5LTZmYjJmYTFmOWJmOCIsInNpZCI6IjdkM2I2OWQ4LTVjYWQtNDJhMC1iNTVkLTM3NmJiYmNiZDgyMSJ9.1tSH79RtkqVV0dwpk6_XkDktdNJtqEEZk1fbzI_6Ubs",
  "access_expires_at": "2026-10-28T15:26:07.857334581Z",
  "refresh_token": "3Lx47jvsiHzWrVK780ti4r9D-tDulXmfoyUj48c9Eo0",
  "refresh_expires_at": "2026-11-27T15:11:07.856878675Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a106e8ff-9418-4ef5-8a95-ac932ce66e72",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9259319b-6ca1-449f-98e4-8e1f26bb2dd8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9259319b-6ca1-449f-98e4-8e1f26bb2dd8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d06eae240a558110fdac996ca283a9a4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9259319b-6ca1-449f-98e4-8e1f26bb2dd8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734464028"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9259319b-6ca1-449f-98e4-8e1f26bb2dd8",
  "expires_at": "2026-10-28T15:41:08.041651Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/9259319b-6ca1-449f-98e4-8e1f26bb2dd8` → **200**

```json
{
  "id": "9259319b-6ca1-449f-98e4-8e1f26bb2dd8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:41:08.041651Z",
  "card": {
    "id": "a741c5c7-cc86-4e3f-832c-f7724ddbbb80",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0655",
    "card_type": "Visa",
    "created_at": "2026-10-28T15:11:08.24232Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "a741c5c7-cc86-4e3f-832c-f7724ddbbb80",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0655",
      "card_type": "Visa",
      "created_at": "2026-10-28T15:11:08.24232Z"
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
  "device_ref": "sandbox-31214"
}
```

```json
{
  "challenge_id": "913c2fe5-659c-4b0f-a8df-cf66d3810d0e",
  "expires_at": "2026-10-28T15:16:08.608908137Z",
  "resend_available_at": "2026-10-28T15:11:09.608908137Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "824376",
  "sent_at": "2026-10-28T15:11:08.61134979Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "913c2fe5-659c-4b0f-a8df-cf66d3810d0e",
  "code": "824376",
  "device_ref": "sandbox-31214"
}
```

```json
{
  "session_id": "bec05811-a80c-401d-89d4-4239448f15aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTE2OCwiaWF0IjoxNzkzMjAwMjY4LCJqdGkiOiIzNTEzZDIzYi1hOTA4LTQyNGUtYTE2ZS0xMDhjNTkyMjBhNDUiLCJzaWQiOiJiZWMwNTgxMS1hODBjLTQwMWQtODlkNC00MjM5NDQ4ZjE1YWEifQ.zfb2hf1LXabePaAsmqyDF3gKGzAp9FfCOT9rjvnqs4c",
  "access_expires_at": "2026-10-28T15:26:08.808582011Z",
  "refresh_token": "2ecMqBlI8Y3CP3ScirmZYO7N1tBM4Xv-rXyIbXcrmi8",
  "refresh_expires_at": "2026-11-27T15:11:08.808098163Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0efd1d8-a9d3-46bf-9676-af0f7bd85624",
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
  "last_heartbeat_at": "2026-10-28T15:11:05.003853Z",
  "last_location_at": "2026-10-28T15:11:05.003853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0efd1d8-a9d3-46bf-9676-af0f7bd85624/handover` → **200**

```json
{
  "command_id": "b05ce570-9ff6-400b-b6b0-2d058a15de7a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0efd1d8-a9d3-46bf-9676-af0f7bd85624",
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
  "last_heartbeat_at": "2026-10-28T15:11:05.003853Z",
  "last_location_at": "2026-10-28T15:11:05.003853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0efd1d8-a9d3-46bf-9676-af0f7bd85624/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:11:09Z",
    "sequence": 1793200269345
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0efd1d8-a9d3-46bf-9676-af0f7bd85624",
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
  "last_heartbeat_at": "2026-10-28T15:11:09.362474Z",
  "last_location_at": "2026-10-28T15:11:09.362474Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f3f05198-92a8-48a3-8bd7-5a12931db2b6",
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
  "id": "e8469187-9b2c-419a-a707-70415bffa047",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:09.544870Z",
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
  "command_id": "86a85f8c-69f2-4b98-8fde-257ae039ff81",
  "quote_id": "e8469187-9b2c-419a-a707-70415bffa047",
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
  "id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
  "created_at": "2026-10-28T15:11:09.73998Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b` → **200**

```json
{
  "id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
  "created_at": "2026-10-28T15:11:09.73998Z",
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
    "id": "c037a317-7304-4858-8ab2-658738504264",
    "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
    "expires_at": "2026-10-28T15:11:24.89638Z",
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

`POST /api/driver/v1/offers/c037a317-7304-4858-8ab2-658738504264/accept` → **200**

```json
{
  "command_id": "d30498c2-c83d-4d57-b340-a4f72c5336b3"
}
```

```json
{
  "id": "3a2db62d-1ebf-4739-b863-125a73199495",
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "assignment_id": "3a2db62d-1ebf-4739-b863-125a73199495",
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

`POST /api/driver/v1/work-sessions/b0efd1d8-a9d3-46bf-9676-af0f7bd85624/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:11:10Z",
    "sequence": 1793200270687
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0efd1d8-a9d3-46bf-9676-af0f7bd85624",
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
  "last_heartbeat_at": "2026-10-28T15:11:10.705026Z",
  "last_location_at": "2026-10-28T15:11:10.705026Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/089b4ae2-bbf7-452b-91d8-1a0962f0871f/arrive` → **200**

```json
{
  "command_id": "b22baee0-c70f-44b6-b024-f2e9883f309c",
  "expected_version": 0
}
```

```json
{
  "id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "assignment_id": "3a2db62d-1ebf-4739-b863-125a73199495",
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
  "arrived_at": "2026-10-28T15:11:10.93279Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/089b4ae2-bbf7-452b-91d8-1a0962f0871f/start` → **200**

```json
{
  "command_id": "cebc7d29-4b4a-4954-b3b1-cad1ba9155ac",
  "expected_version": 1
}
```

```json
{
  "id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "assignment_id": "3a2db62d-1ebf-4739-b863-125a73199495",
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
  "arrived_at": "2026-10-28T15:11:10.93279Z",
  "started_at": "2026-10-28T15:11:11.120291Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/089b4ae2-bbf7-452b-91d8-1a0962f0871f/complete` → **200**

```json
{
  "command_id": "66cfd589-0cf3-4bab-bc7d-6978d1d02568",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:11:11Z",
  "cash_received": true
}
```

```json
{
  "id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "assignment_id": "3a2db62d-1ebf-4739-b863-125a73199495",
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
  "arrived_at": "2026-10-28T15:11:10.93279Z",
  "started_at": "2026-10-28T15:11:11.120291Z",
  "completed_at": "2026-10-28T15:11:11.309113Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b` → **200**

```json
{
  "id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
    "id": "3a2db62d-1ebf-4739-b863-125a73199495",
    "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:11:09.73998Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b` → **200**

```json
{
  "id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
    "id": "3a2db62d-1ebf-4739-b863-125a73199495",
    "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:11:09.73998Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b` → **200**

```json
{
  "id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
    "id": "3a2db62d-1ebf-4739-b863-125a73199495",
    "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:11:09.73998Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b` → **200**

```json
{
  "id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
    "id": "3a2db62d-1ebf-4739-b863-125a73199495",
    "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "089b4ae2-bbf7-452b-91d8-1a0962f0871f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:11:09.73998Z",
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
      "id": "695b01db-ef3e-4c05-bc0a-8212900b2c61",
      "at": "2026-10-28T15:11:11.937807Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b/tip` → **200**

```json
{
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
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
  "available_until": "2026-10-29T15:11:11.309113Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b/tip` → **201**

```json
{
  "command_id": "954e0395-9472-4b0b-9e1b-97436ce21ac4",
  "amount_minor": 2500
}
```

```json
{
  "id": "a47b78dc-5d9d-4aac-8ca0-e31d122de80b",
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:11:15.773375Z"
}
```

`GET /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b/tip` → **200**

```json
{
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
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
  "available_until": "2026-10-29T15:11:11.309113Z",
  "open": false,
  "tip": {
    "id": "a47b78dc-5d9d-4aac-8ca0-e31d122de80b",
    "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:11:15.773375Z"
  }
}
```

`GET /api/rider/v1/orders/731964d2-0f6a-48f6-8694-17961c1e626b/tip` → **200**

```json
{
  "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
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
  "available_until": "2026-10-29T15:11:11.309113Z",
  "open": false,
  "tip": {
    "id": "a47b78dc-5d9d-4aac-8ca0-e31d122de80b",
    "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:11:15.773375Z"
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
      "id": "e9659269-5c3f-43fe-875e-1cdd15dac331",
      "at": "2026-10-28T15:11:16.981967Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
      "counterpart_id": null
    },
    {
      "id": "695b01db-ef3e-4c05-bc0a-8212900b2c61",
      "at": "2026-10-28T15:11:11.937807Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d314cdee-0fa7-4903-bd3b-f8f7a62b31f2",
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
  "id": "8bbfc099-cc8d-4353-958b-b1aa2ed7b58b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:17.502520Z",
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
  "session_id": "eb619453-db6a-472d-9590-4bd91939a261",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExNzcsImlhdCI6MTc5MzIwMDI3NywianRpIjoiN2NhMGZkY2EtODU4MC00NDc2LWIzZDMtMzQxNDZkYTRmMGM2Iiwic2lkIjoiZWI2MTk0NTMtZGI2YS00NzJkLTk1OTAtNGJkOTE5MzlhMjYxIn0.an-JlN47n4BxnYh68E8L5k6arGYL_HGP6iQhoKPd2Gw",
  "access_expires_at": "2026-10-28T15:26:17.895340596Z",
  "refresh_token": "S35mo9PUW4eNmmoF8GEKe-wZvN3ggu5uax8vQcG0pj8",
  "refresh_expires_at": "2026-10-29T03:11:17.894927278Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734464028` → **200**

```json
{
  "client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb"
}
```

`POST /api/admin/v1/rider-wallets/8cbc39d2-ea4b-41f7-b279-c7df147272eb/top-ups` → **201**

```json
{
  "command_id": "d0f69161-3e8d-417a-b8af-787bdb9ec0ef",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
      "id": "100d98e4-4cbb-4fbc-a151-9f290d6c4565",
      "at": "2026-10-28T15:11:18.233245Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9e42cbff-2380-4d79-83e6-9720ff73f0e1",
  "quote_id": "8bbfc099-cc8d-4353-958b-b1aa2ed7b58b",
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
  "id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
  "created_at": "2026-10-28T15:11:18.41943Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/7c32a1b0-194a-4243-9bd7-3c092980dfbc` → **200**

```json
{
  "id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
  "created_at": "2026-10-28T15:11:18.41943Z",
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
    "id": "bf2bfcda-a72c-4ef8-a5fa-d89fa9b19a19",
    "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
    "expires_at": "2026-10-28T15:11:33.422674Z",
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

`POST /api/driver/v1/offers/bf2bfcda-a72c-4ef8-a5fa-d89fa9b19a19/accept` → **200**

```json
{
  "command_id": "2a0ebecf-415b-450e-ace4-0221ba1df2b4"
}
```

```json
{
  "id": "6a506241-d4d3-4c69-99ba-70fae3d54506",
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d8f3009b-ebae-45d9-b348-63b224091977",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d8f3009b-ebae-45d9-b348-63b224091977",
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
  "assignment_id": "6a506241-d4d3-4c69-99ba-70fae3d54506",
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

`POST /api/driver/v1/work-sessions/b0efd1d8-a9d3-46bf-9676-af0f7bd85624/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:11:19Z",
    "sequence": 1793200279314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0efd1d8-a9d3-46bf-9676-af0f7bd85624",
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
  "last_heartbeat_at": "2026-10-28T15:11:19.331102Z",
  "last_location_at": "2026-10-28T15:11:19.331102Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d8f3009b-ebae-45d9-b348-63b224091977/arrive` → **200**

```json
{
  "command_id": "e109e73b-505e-4ce9-8299-6435a9d4054e",
  "expected_version": 0
}
```

```json
{
  "id": "d8f3009b-ebae-45d9-b348-63b224091977",
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
  "assignment_id": "6a506241-d4d3-4c69-99ba-70fae3d54506",
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
  "arrived_at": "2026-10-28T15:11:19.525877Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d8f3009b-ebae-45d9-b348-63b224091977/start` → **200**

```json
{
  "command_id": "ccba445f-7d9d-4df1-9a5f-7ac11b172087",
  "expected_version": 1
}
```

```json
{
  "id": "d8f3009b-ebae-45d9-b348-63b224091977",
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
  "assignment_id": "6a506241-d4d3-4c69-99ba-70fae3d54506",
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
  "arrived_at": "2026-10-28T15:11:19.525877Z",
  "started_at": "2026-10-28T15:11:19.713139Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d8f3009b-ebae-45d9-b348-63b224091977/complete` → **200**

```json
{
  "command_id": "e0f86d81-eb38-4b8c-b971-e1b5c3fe6a76",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:11:19Z",
  "cash_received": true
}
```

```json
{
  "id": "d8f3009b-ebae-45d9-b348-63b224091977",
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
  "assignment_id": "6a506241-d4d3-4c69-99ba-70fae3d54506",
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
  "arrived_at": "2026-10-28T15:11:19.525877Z",
  "started_at": "2026-10-28T15:11:19.713139Z",
  "completed_at": "2026-10-28T15:11:19.90445Z",
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
  "client_id": "8cbc39d2-ea4b-41f7-b279-c7df147272eb",
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
      "id": "404b8359-e329-4280-b554-aa0e206a97aa",
      "at": "2026-10-28T15:11:20.005689Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc"
    },
    {
      "id": "100d98e4-4cbb-4fbc-a151-9f290d6c4565",
      "at": "2026-10-28T15:11:18.233245Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
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

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "88d75106-dd52-472f-be01-9530ff756df4",
      "at": "2026-10-28T15:11:20.001694Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
      "counterpart_id": null
    },
    {
      "id": "e9659269-5c3f-43fe-875e-1cdd15dac331",
      "at": "2026-10-28T15:11:16.981967Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
      "counterpart_id": null
    },
    {
      "id": "695b01db-ef3e-4c05-bc0a-8212900b2c61",
      "at": "2026-10-28T15:11:11.937807Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/7c32a1b0-194a-4243-9bd7-3c092980dfbc/tip` → **200**

```json
{
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
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
  "available_until": "2026-10-29T15:11:19.90445Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/7c32a1b0-194a-4243-9bd7-3c092980dfbc/tip` → **201**

```json
{
  "command_id": "3f716336-4cb5-4f4b-b518-5a52b40db019",
  "amount_minor": 2500
}
```

```json
{
  "id": "1ec3ec4d-117b-4478-a5c4-6122a2d5deb1",
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:11:20.790757Z"
}
```

`GET /api/rider/v1/orders/7c32a1b0-194a-4243-9bd7-3c092980dfbc/tip` → **200**

```json
{
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
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
  "available_until": "2026-10-29T15:11:19.90445Z",
  "open": false,
  "tip": {
    "id": "1ec3ec4d-117b-4478-a5c4-6122a2d5deb1",
    "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:11:20.790757Z"
  }
}
```

`GET /api/rider/v1/orders/7c32a1b0-194a-4243-9bd7-3c092980dfbc/tip` → **200**

```json
{
  "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
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
  "available_until": "2026-10-29T15:11:19.90445Z",
  "open": false,
  "tip": {
    "id": "1ec3ec4d-117b-4478-a5c4-6122a2d5deb1",
    "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:11:20.790757Z"
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
      "id": "146624e4-5790-4d25-a66f-49dc574d40de",
      "at": "2026-10-28T15:11:22.045649Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
      "counterpart_id": null
    },
    {
      "id": "88d75106-dd52-472f-be01-9530ff756df4",
      "at": "2026-10-28T15:11:20.001694Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "7c32a1b0-194a-4243-9bd7-3c092980dfbc",
      "counterpart_id": null
    },
    {
      "id": "e9659269-5c3f-43fe-875e-1cdd15dac331",
      "at": "2026-10-28T15:11:16.981967Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
      "counterpart_id": null
    },
    {
      "id": "695b01db-ef3e-4c05-bc0a-8212900b2c61",
      "at": "2026-10-28T15:11:11.937807Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "731964d2-0f6a-48f6-8694-17961c1e626b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0efd1d8-a9d3-46bf-9676-af0f7bd85624",
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
  "last_heartbeat_at": "2026-10-28T15:11:19.331102Z",
  "last_location_at": "2026-10-28T15:11:19.331102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0efd1d8-a9d3-46bf-9676-af0f7bd85624/close` → **200**

```json
{
  "command_id": "dc701e59-5617-4e0e-8c4a-55a7d6f972fd",
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

Done: card order 7c32a1b0-194a-4243-9bd7-3c092980dfbc.

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
  "phone": "+380730752518",
  "device_ref": "sandbox-19411"
}
```

```json
{
  "challenge_id": "2db71a3f-fab9-42ee-aa21-c75a67cd77ca",
  "expires_at": "2026-10-28T15:16:23.082802986Z",
  "resend_available_at": "2026-10-28T15:11:24.082802986Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730752518` → **200**

```json
{
  "phone": "+380730752518",
  "audience": "CLIENT",
  "code": "932682",
  "sent_at": "2026-10-28T15:11:23.084918283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2db71a3f-fab9-42ee-aa21-c75a67cd77ca",
  "code": "932682",
  "device_ref": "sandbox-19411"
}
```

```json
{
  "session_id": "c25ece3a-e4e4-4340-bc28-a544cad803aa",
  "subject": {
    "type": "CLIENT",
    "id": "68affa65-3e56-4c54-9a63-68657d83f8a0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OGFmZmE2NS0zZTU2LTRjNTQtOWE2My02ODY1N2Q4M2Y4YTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMTgzLCJpYXQiOjE3OTMyMDAyODMsImp0aSI6IjZiYjNiZDcwLWM2NWMtNGRhNS05NjM3LTU5N2I3YWM0NTdkYyIsInNpZCI6ImMyNWVjZTNhLWU0ZTQtNDM0MC1iYzI4LWE1NDRjYWQ4MDNhYSJ9.p48dVwE6XANEnB2uBoIqhGKDeQq1oakDXN5DOtSPOKk",
  "access_expires_at": "2026-10-28T15:26:23.311266141Z",
  "refresh_token": "8rmma2HGcAtR8nAxp2unk_p1nfw2tsUlMVLZWzxIqOY",
  "refresh_expires_at": "2026-11-27T15:11:23.310451087Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "fe22a8c9-8982-4288-89d1-44f61f58bc50",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "9b32ab4f-b4ab-4558-94f4-37947c3d0ca5",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9b32ab4f-b4ab-4558-94f4-37947c3d0ca5",
    "orderDate": "1793200283",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "72d629a640519d56fd5e946161e845ca",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9b32ab4f-b4ab-4558-94f4-37947c3d0ca5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730752518"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9b32ab4f-b4ab-4558-94f4-37947c3d0ca5",
  "created_at": "2026-10-28T15:11:23.495274Z",
  "expires_at": "2026-10-28T15:41:23.495274Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/9b32ab4f-b4ab-4558-94f4-37947c3d0ca5` → **200**

```json
{
  "id": "9b32ab4f-b4ab-4558-94f4-37947c3d0ca5",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:11:23.495274Z",
  "expires_at": "2026-10-28T15:41:23.495274Z",
  "completed_at": "2026-10-28T15:11:23.677391Z",
  "masked_pan": "41****1715",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "68affa65-3e56-4c54-9a63-68657d83f8a0",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "68affa65-3e56-4c54-9a63-68657d83f8a0",
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
      "id": "a233a89e-616f-4266-b295-c762c2e170fd",
      "at": "2026-10-28T15:11:24.055971Z",
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
  "client_id": "68affa65-3e56-4c54-9a63-68657d83f8a0",
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
      "id": "a233a89e-616f-4266-b295-c762c2e170fd",
      "at": "2026-10-28T15:11:24.055971Z",
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
  "device_ref": "sandbox-2993"
}
```

```json
{
  "challenge_id": "31c78616-16bb-4997-9007-cc735247e75f",
  "expires_at": "2026-10-28T15:16:25.386045976Z",
  "resend_available_at": "2026-10-28T15:11:26.386045976Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "986235",
  "sent_at": "2026-10-28T15:11:25.388145182Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31c78616-16bb-4997-9007-cc735247e75f",
  "code": "986235",
  "device_ref": "sandbox-2993"
}
```

```json
{
  "session_id": "eda9e6f1-e872-455a-9d58-e2095c0c048d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTE4NSwiaWF0IjoxNzkzMjAwMjg1LCJqdGkiOiI4NjY1MzNkOC02Nzk1LTRkMGItODRhYS04YWU5ODBlODM2NDciLCJzaWQiOiJlZGE5ZTZmMS1lODcyLTQ1NWEtOWQ1OC1lMjA5NWMwYzA0OGQifQ.gLzejaxD6n7uKZ9OiBxlkV0FmlygsyBI6mdTilcEX_o",
  "access_expires_at": "2026-10-28T15:26:25.581125693Z",
  "refresh_token": "SJds5RIaYifz9Ew4-JmDjz2QgK9Kw-p6UL-kOBjYzQM",
  "refresh_expires_at": "2026-11-27T15:11:25.580746883Z",
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
  "command_id": "9f12ed40-b7ec-426f-8d62-06a842a3f272",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "c447f450-5a90-4a33-8f29-aa9d2a71e8cc",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c447f450-5a90-4a33-8f29-aa9d2a71e8cc",
    "orderDate": "1793200285",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "71b017e086d2b72b9b37d534bfce454f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c447f450-5a90-4a33-8f29-aa9d2a71e8cc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c447f450-5a90-4a33-8f29-aa9d2a71e8cc",
  "created_at": "2026-10-28T15:11:25.947015Z",
  "expires_at": "2026-10-28T15:41:25.947015Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/c447f450-5a90-4a33-8f29-aa9d2a71e8cc` → **200**

```json
{
  "id": "c447f450-5a90-4a33-8f29-aa9d2a71e8cc",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:11:25.947015Z",
  "expires_at": "2026-10-28T15:41:25.947015Z",
  "completed_at": "2026-10-28T15:11:26.133138Z",
  "masked_pan": "41****9174",
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
      "id": "7cbb39db-f420-4b86-901f-c9afecea1969",
      "at": "2026-10-28T15:11:27.062474Z",
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
  "command_id": "c3eccec4-3933-433f-a114-b92e33bda0cb",
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
  "correlation_id": "d024d67c-2d38-4223-b16a-7e5004587393"
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
  "session_id": "12749486-9e1a-472e-b4a1-1d24f6cc7e92",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExODgsImlhdCI6MTc5MzIwMDI4OCwianRpIjoiZDg5Mjc5NWYtODlmMS00MTc3LThiZjMtYjZkZGI1Njg1Nzc4Iiwic2lkIjoiMTI3NDk0ODYtOWUxYS00NzJlLWI0YTEtMWQyNGY2Y2M3ZTkyIn0.Gt0Btz96RpHzFzTkOuDg-5DgaOHf55Z-gTqojtClU5k",
  "access_expires_at": "2026-10-28T15:26:28.047826617Z",
  "refresh_token": "gLu4N4X10tltI1Sp7wjInt6GPHdGL7AXCbJ6jyhtzJs",
  "refresh_expires_at": "2026-10-29T03:11:28.047474687Z",
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
  "phone": "+48600283267",
  "device_ref": "sandbox-16604"
}
```

```json
{
  "challenge_id": "f1bc0789-1fe3-48a4-90af-3929cae563d4",
  "expires_at": "2026-10-28T15:16:28.566037691Z",
  "resend_available_at": "2026-10-28T15:11:29.566037691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600283267` → **200**

```json
{
  "phone": "+48600283267",
  "audience": "CLIENT",
  "code": "247520",
  "sent_at": "2026-10-28T15:11:28.56788109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1bc0789-1fe3-48a4-90af-3929cae563d4",
  "code": "247520",
  "device_ref": "sandbox-16604"
}
```

```json
{
  "session_id": "8c982f1f-7468-45a2-8087-b66cc9f4ba26",
  "subject": {
    "type": "CLIENT",
    "id": "c06f44df-a676-4fd9-b1b8-0687d8a82523"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMDZmNDRkZi1hNjc2LTRmZDktYjFiOC0wNjg3ZDhhODI1MjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMTg4LCJpYXQiOjE3OTMyMDAyODgsImp0aSI6IjgyMmVjYjE3LTA2ZDEtNDJiYy1iMzQyLThhNmYwOGFhZjMzNiIsInNpZCI6IjhjOTgyZjFmLTc0NjgtNDVhMi04MDg3LWI2NmNjOWY0YmEyNiJ9.bps8OBdIiyE2VGSeBC9hrUpj52VbOR-ySxqTxBt9uHc",
  "access_expires_at": "2026-10-28T15:26:28.757830994Z",
  "refresh_token": "caGRkZaTJzp7bTltk2EehwIWWxqZ3JIEVMCxw8MUa68",
  "refresh_expires_at": "2026-11-27T15:11:28.757465865Z",
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
  "command_id": "2f2d40c1-3924-4406-990f-d7b81121a2e3",
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
  "correlation_id": "6f869af4-25db-48d3-9d4c-3776fdddf64b",
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
  "command_id": "29a53166-9515-4a31-a617-7686320817c4",
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
  "paused_at": "2026-10-28T15:11:29.482699483Z",
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
  "command_id": "728f4d8d-37f0-4bd1-ba2b-470cef5aaf9b",
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
  "id": "9f40fcdf-5223-4262-85ed-6d90c296d7fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:29.848229Z",
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
  "command_id": "595f5634-02bc-4194-bb58-9a86d62f3f5f",
  "quote_id": "9f40fcdf-5223-4262-85ed-6d90c296d7fa",
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
  "correlation_id": "b4ddd3d7-0739-4efe-91ef-b734feec232f"
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
  "paused_at": "2026-10-28T15:11:29.482699Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "ca63c21c-ad8a-4bef-9641-d41d511075b6",
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
  "command_id": "8b7933e6-7d5f-4cc3-8d6b-523745b57619",
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
  "command_id": "eb421e30-851d-4083-89df-94447de42d32",
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
  "id": "1b3b42ed-2404-4995-89cd-19a2de895b43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:30.945850Z",
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
  "command_id": "231f235d-4c82-425e-9512-a4da42b3f159",
  "quote_id": "1b3b42ed-2404-4995-89cd-19a2de895b43",
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
  "correlation_id": "f5ac46f4-44d6-4018-9987-78cdb429110f"
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
  "command_id": "66382421-cb34-4a9f-91c7-a1f03ad338d6",
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
      "from": "18:00",
      "to": "19:00"
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "57ea54bc-4711-484b-9459-baa99904ca03",
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
  "id": "0c0fda55-ce60-434d-9597-2e4e82aec08c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:31.755150Z",
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
  "command_id": "0fa78512-c137-4f28-b4d0-b7ff4da666c9",
  "quote_id": "0c0fda55-ce60-434d-9597-2e4e82aec08c",
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
  "correlation_id": "6a83c027-57e1-483b-8888-169d91325550"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "bd0e121d-22f3-40ed-8487-91c9b5a5092d",
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
  "correlation_id": "1535f8cd-f5b5-4875-8257-39f1d2e22f95"
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "97c77c9d-fe00-4ba0-8489-d9631a36b0fc",
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
  "phone": "+380672204086",
  "device_ref": "sandbox-24638"
}
```

```json
{
  "challenge_id": "666f1a6e-027c-4068-a30a-bb6bd2145bcc",
  "expires_at": "2026-10-28T15:16:32.682774431Z",
  "resend_available_at": "2026-10-28T15:11:33.682774431Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672204086` → **200**

```json
{
  "phone": "+380672204086",
  "audience": "CLIENT",
  "code": "364173",
  "sent_at": "2026-10-28T15:11:32.684569366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "666f1a6e-027c-4068-a30a-bb6bd2145bcc",
  "code": "364173",
  "device_ref": "sandbox-24638"
}
```

```json
{
  "session_id": "25c10c9a-856d-40d9-9682-6684edb405ef",
  "subject": {
    "type": "CLIENT",
    "id": "0d57e931-84a0-4c09-9d9e-9a5bbb4d4871"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZDU3ZTkzMS04NGEwLTRjMDktOWQ5ZS05YTViYmI0ZDQ4NzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMTkyLCJpYXQiOjE3OTMyMDAyOTIsImp0aSI6ImY0MGFhNjhjLTQ5NTEtNDY2Mi04NGRmLWM2ZTJkZGI0YmMwZSIsInNpZCI6IjI1YzEwYzlhLTg1NmQtNDBkOS05NjgyLTY2ODRlZGI0MDVlZiJ9.tg8b_AM4Qr1FMrk-p1SeLVM4bS1LBDaS8tTmLdFDlAg",
  "access_expires_at": "2026-10-28T15:26:32.882537076Z",
  "refresh_token": "pResHDVZOKmmfAfbUapUvq11GxJoacIShDEUbYLWxLA",
  "refresh_expires_at": "2026-11-27T15:11:32.882183094Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0d57e931-84a0-4c09-9d9e-9a5bbb4d4871",
  "session_id": "25c10c9a-856d-40d9-9682-6684edb405ef",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "730ea8f8-b880-4d4a-a06b-47bbf5aacc40",
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
  "id": "57dcf6df-79c2-4c59-a12e-c87c7f86e495",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:33.227346Z",
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
  "challenge_id": "f80bcdc5-2db4-4799-a34b-df8b791a40db",
  "expires_at": "2026-10-28T15:16:35.410641937Z",
  "resend_available_at": "2026-10-28T15:11:36.410641937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672204086` → **200**

```json
{
  "phone": "+380672204086",
  "audience": "CLIENT",
  "code": "515815",
  "sent_at": "2026-10-28T15:11:35.412172091Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "fdc23973-90d2-44e8-8a2c-75a697cc7925",
  "challenge_id": "f80bcdc5-2db4-4799-a34b-df8b791a40db",
  "otp_code": "515815"
}
```

```json
{
  "client_id": "0d57e931-84a0-4c09-9d9e-9a5bbb4d4871",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T15:11:35.642206844Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ab4cc82f-c44a-48eb-a873-96a80595417f",
  "quote_id": "57dcf6df-79c2-4c59-a12e-c87c7f86e495",
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
  "correlation_id": "576790b4-eb1a-4d52-b94b-d2af260a62a0"
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
  "session_id": "18d9aee4-86f2-4509-a6ba-67539bf79c89",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExOTYsImlhdCI6MTc5MzIwMDI5NiwianRpIjoiODk5ZDBjMTctNDEzNi00OWYyLWFkYjMtYmJlZGY0YTQxNmMxIiwic2lkIjoiMThkOWFlZTQtODZmMi00NTA5LWE2YmEtNjc1MzliZjc5Yzg5In0.qG0kBlWOyF4d16R2p9BieD-cK0Eenxwx-kRYuSzqbRM",
  "access_expires_at": "2026-10-28T15:26:36.200674969Z",
  "refresh_token": "gtBISespu2UhoqGisY8XgKyzKIRN4-sfFqvWAkjRb2c",
  "refresh_expires_at": "2026-10-29T03:11:36.200281125Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "0d57e931-84a0-4c09-9d9e-9a5bbb4d4871",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T15:11:35.642207Z",
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

`POST /api/admin/v1/client-deletions/0d57e931-84a0-4c09-9d9e-9a5bbb4d4871/complete` → **200**

```json
{
  "command_id": "3aebe809-4a8a-498d-b719-0388ddce8d55",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "0d57e931-84a0-4c09-9d9e-9a5bbb4d4871",
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
  "correlation_id": "c89dbfc0-612d-4659-8705-ca5575bf23e1"
}
```

Done: client 0d57e931-84a0-4c09-9d9e-9a5bbb4d4871 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665080342",
  "device_ref": "sandbox-9862"
}
```

```json
{
  "challenge_id": "704285ae-f0f6-4036-9f42-cde6d8404605",
  "expires_at": "2026-10-28T15:16:36.915090555Z",
  "resend_available_at": "2026-10-28T15:11:37.915090555Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665080342` → **200**

```json
{
  "phone": "+380665080342",
  "audience": "CLIENT",
  "code": "655381",
  "sent_at": "2026-10-28T15:11:36.917319804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "704285ae-f0f6-4036-9f42-cde6d8404605",
  "code": "655381",
  "device_ref": "sandbox-9862"
}
```

```json
{
  "session_id": "0b4ba9cf-9e91-4e3e-981a-e987a8b15134",
  "subject": {
    "type": "CLIENT",
    "id": "c700dd72-cb16-437a-812b-717cd8cf3ebc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzAwZGQ3Mi1jYjE2LTQzN2EtODEyYi03MTdjZDhjZjNlYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMTk3LCJpYXQiOjE3OTMyMDAyOTcsImp0aSI6ImYyOWVlZDQxLTkwNGMtNDY2ZS1iMWUyLWIzZWMxZjA3Y2E0MiIsInNpZCI6IjBiNGJhOWNmLTllOTEtNGUzZS05ODFhLWU5ODdhOGIxNTEzNCJ9.h11KzklLDeyjoeI96t_g1H5pr-cZDdkaH8bTIu-tyto",
  "access_expires_at": "2026-10-28T15:26:37.121242606Z",
  "refresh_token": "AZDWTSGaD7uvQZdXHSIbr_II84OjDBHdDG-jF8dZ5-A",
  "refresh_expires_at": "2026-11-27T15:11:37.120876354Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c700dd72-cb16-437a-812b-717cd8cf3ebc",
  "session_id": "0b4ba9cf-9e91-4e3e-981a-e987a8b15134",
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
  "session_id": "a2575e77-01f3-4f40-8b70-bcdbe92e4f6b",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDExOTcsImlhdCI6MTc5MzIwMDI5NywianRpIjoiYTcwY2Q1NzMtMTQ4Zi00NzA0LWJkZGUtNTYxMDQ0ZDExOGVjIiwic2lkIjoiYTI1NzVlNzctMDFmMy00ZjQwLThiNzAtYmNkYmU5MmU0ZjZiIn0.Et5iayuQdHZo_UwdfPYaPbj_I9EA73qGJKh5JpTEAKU",
  "access_expires_at": "2026-10-28T15:26:37.666297628Z",
  "refresh_token": "0tzl_KHyP11sJLYE5k-_mstKRBlKSTpPSjnXYfWp18Q",
  "refresh_expires_at": "2026-10-29T03:11:37.665895342Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5080342&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c700dd72-cb16-437a-812b-717cd8cf3ebc",
      "phone": "+380665080342",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T15:11:37.11938Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c700dd72-cb16-437a-812b-717cd8cf3ebc` → **200**

```json
{
  "client": {
    "id": "c700dd72-cb16-437a-812b-717cd8cf3ebc",
    "phone": "+380665080342",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:11:37.11938Z",
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

`POST /api/admin/v1/clients/c700dd72-cb16-437a-812b-717cd8cf3ebc/block` → **400**

```json
{
  "command_id": "9fa03ea6-d04f-4f94-a9b5-9d07cb852897",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c700dd72-cb16-437a-812b-717cd8cf3ebc/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "754d9cd0-fa4b-4aa2-b8b7-f9a59d4dfb7b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c700dd72-cb16-437a-812b-717cd8cf3ebc/block` → **200**

```json
{
  "command_id": "4a6f8fe3-062b-4788-9ec5-07b356b2dfe1",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c700dd72-cb16-437a-812b-717cd8cf3ebc",
  "phone": "+380665080342",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T15:11:37.11938Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T15:11:38.404356Z",
    "by": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
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
  "correlation_id": "3a62004e-a6ac-44f3-b2f0-ee6ec5a9ae96"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665080342",
  "device_ref": "sandbox-12937"
}
```

```json
{
  "challenge_id": "68254e06-3a5b-4f56-ac71-97e39b2e570e",
  "expires_at": "2026-10-28T15:16:40.755010424Z",
  "resend_available_at": "2026-10-28T15:11:41.755010424Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665080342` → **200**

```json
{
  "phone": "+380665080342",
  "audience": "CLIENT",
  "code": "428630",
  "sent_at": "2026-10-28T15:11:40.756641258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "68254e06-3a5b-4f56-ac71-97e39b2e570e",
  "code": "428630",
  "device_ref": "sandbox-12937"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "8f637a3c-15bf-475e-876e-ff5c5ed51ad5"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c700dd72-cb16-437a-812b-717cd8cf3ebc` → **200**

```json
{
  "client": {
    "id": "c700dd72-cb16-437a-812b-717cd8cf3ebc",
    "phone": "+380665080342",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T15:11:37.11938Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T15:11:38.404356Z",
      "by": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
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

`POST /api/admin/v1/clients/c700dd72-cb16-437a-812b-717cd8cf3ebc/unblock` → **200**

```json
{
  "command_id": "3ee748b4-07e8-4a36-8e20-98ee3505eff4",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c700dd72-cb16-437a-812b-717cd8cf3ebc",
  "phone": "+380665080342",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T15:11:37.11938Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665080342",
  "device_ref": "sandbox-26705"
}
```

```json
{
  "challenge_id": "e3a720ce-5e7e-4739-accd-bcbc85a99997",
  "expires_at": "2026-10-28T15:16:43.496769389Z",
  "resend_available_at": "2026-10-28T15:11:44.496769389Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665080342` → **200**

```json
{
  "phone": "+380665080342",
  "audience": "CLIENT",
  "code": "581665",
  "sent_at": "2026-10-28T15:11:43.498652929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3a720ce-5e7e-4739-accd-bcbc85a99997",
  "code": "581665",
  "device_ref": "sandbox-26705"
}
```

```json
{
  "session_id": "c65133a1-e5bb-4404-9251-b25c93409e94",
  "subject": {
    "type": "CLIENT",
    "id": "c700dd72-cb16-437a-812b-717cd8cf3ebc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzAwZGQ3Mi1jYjE2LTQzN2EtODEyYi03MTdjZDhjZjNlYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjAzLCJpYXQiOjE3OTMyMDAzMDMsImp0aSI6ImViZjVlMjMwLTVhZDMtNGRhMy1hY2VhLTQzMzYyMDk4OWQxMyIsInNpZCI6ImM2NTEzM2ExLWU1YmItNDQwNC05MjUxLWIyNWM5MzQwOWU5NCJ9.C64meoOnTLHdJ0bnja8yBP-7f0nwWDnhlvRnyaH8vx8",
  "access_expires_at": "2026-10-28T15:26:43.687374327Z",
  "refresh_token": "DgOatj1oJLRpDoRZUZzRMtUiGBSt216qiYyT7MkJVT4",
  "refresh_expires_at": "2026-11-27T15:11:43.687046003Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c700dd72-cb16-437a-812b-717cd8cf3ebc",
  "session_id": "c65133a1-e5bb-4404-9251-b25c93409e94",
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
  "phone": "+380667650162",
  "device_ref": "sandbox-24953"
}
```

```json
{
  "challenge_id": "bf596a85-c708-4c47-99e6-28f1f84c563a",
  "expires_at": "2026-10-28T15:16:44.032863094Z",
  "resend_available_at": "2026-10-28T15:11:45.032863094Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667650162` → **200**

```json
{
  "phone": "+380667650162",
  "audience": "CLIENT",
  "code": "062532",
  "sent_at": "2026-10-28T15:11:44.03479402Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf596a85-c708-4c47-99e6-28f1f84c563a",
  "code": "062532",
  "device_ref": "sandbox-24953"
}
```

```json
{
  "session_id": "29f302d0-786a-4bb6-a709-568b7dba6282",
  "subject": {
    "type": "CLIENT",
    "id": "c7022fb0-0d0e-4b5f-b022-65de96665a29"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzAyMmZiMC0wZDBlLTRiNWYtYjAyMi02NWRlOTY2NjVhMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjA0LCJpYXQiOjE3OTMyMDAzMDQsImp0aSI6ImE1OTBlNzAzLTUxZDMtNGJmZi05NmE2LWVmNGFiMjlkNWVlYSIsInNpZCI6IjI5ZjMwMmQwLTc4NmEtNGJiNi1hNzA5LTU2OGI3ZGJhNjI4MiJ9.oqRsB1nfpIz-AfD8X2Uuevp-qUEWGF4YAaw9RD0BYqM",
  "access_expires_at": "2026-10-28T15:26:44.224761344Z",
  "refresh_token": "JDIjsTm3r_pcBoLlgyS-tNVvu6dnG6yMP8S3FpkeLS4",
  "refresh_expires_at": "2026-11-27T15:11:44.224443335Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "821d5206-1074-4d82-8798-bf115cd8cfbc",
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
  "id": "a522654a-15b0-44db-874d-bac00a90dd03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:44.397759Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 7b2c636d-9c3e-41df-9349-704840be315a) → **201**

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
  "session_id": "c4e26dc8-51fb-45ad-a409-67f35d6364c2",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMDQsImlhdCI6MTc5MzIwMDMwNCwianRpIjoiZDRjY2NjMzItOWZmNy00Yjk0LWExMWUtNmE4NDIzODk0ZjVlIiwic2lkIjoiYzRlMjZkYzgtNTFmYi00NWFkLWE0MDktNjdmMzVkNjM2NGMyIn0.ccKGD2iQfP3hUXcqOm-7Bz1iTiOATxXd_ZEB7eTrzwk",
  "access_expires_at": "2026-10-28T15:26:44.806254968Z",
  "refresh_token": "vHiDtPsnlVOC3pJTb0R6B4sZEYVh8fFwyOiiiD0XX0s",
  "refresh_expires_at": "2026-10-29T03:11:44.805952748Z",
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
  "session_id": "6a06f4fb-cdb1-4705-9702-addb723e2889",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMDUsImlhdCI6MTc5MzIwMDMwNSwianRpIjoiNmU5ZmMyZDEtNjY5Zi00ZDFjLWEzNjUtZDU0ZjNmMzU5MzlhIiwic2lkIjoiNmEwNmY0ZmItY2RiMS00NzA1LTk3MDItYWRkYjcyM2UyODg5In0._XU2li1nFZzgO6tqAqvjtdg2Lg5nOV-Q4-cyR0ek9EI",
  "access_expires_at": "2026-10-28T15:26:45.178026407Z",
  "refresh_token": "FbX0_dSmXda3jUSmMhd-h944zMmHVqMkzbid84BmgIY",
  "refresh_expires_at": "2026-10-29T03:11:45.177682815Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f52b215e-d4e9-4dba-857a-3f42c07eb1ce/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:11:44.579298Z",
      "actor": {
        "type": "CLIENT",
        "id": "c7022fb0-0d0e-4b5f-b022-65de96665a29",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce",
        "quote_id": "a522654a-15b0-44db-874d-bac00a90dd03",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7b2c636d-9c3e-41df-9349-704840be315a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:11:44.580437Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce",
        "attempt_id": "39a4ac38-9ad8-4713-987e-292bc5297d31",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7b2c636d-9c3e-41df-9349-704840be315a"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T15:11:44.586477Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce",
        "attempt_id": "39a4ac38-9ad8-4713-987e-292bc5297d31"
      },
      "correlation_id": "7b2c636d-9c3e-41df-9349-704840be315a"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "39a4ac38-9ad8-4713-987e-292bc5297d31",
        "generation": 1,
        "started_at": "2026-10-28T15:11:44.579919Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T15:11:44.586477Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T15:11:44.580958Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/7b2c636d-9c3e-41df-9349-704840be315a` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce:0",
      "order_id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce",
      "at": "2026-10-28T15:11:44.579298Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce:1",
      "order_id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce",
      "at": "2026-10-28T15:11:44.580437Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce:2",
      "order_id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce",
      "at": "2026-10-28T15:11:44.586477Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/962788de-6f96-4381-98ab-4155b4e6c8bd` → **200**

```json
{
  "found": []
}
```

Done: request 7b2c636d-9c3e-41df-9349-704840be315a — order f52b215e-d4e9-4dba-857a-3f42c07eb1ce found by its id.

`GET /api/rider/v1/orders/f52b215e-d4e9-4dba-857a-3f42c07eb1ce` → **200**

```json
{
  "id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7022fb0-0d0e-4b5f-b022-65de96665a29",
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
  "created_at": "2026-10-28T15:11:44.578874Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f52b215e-d4e9-4dba-857a-3f42c07eb1ce/cancel` → **200**

```json
{
  "command_id": "5389a864-9b0e-4bb7-ac03-32da4de1410c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f52b215e-d4e9-4dba-857a-3f42c07eb1ce",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c7022fb0-0d0e-4b5f-b022-65de96665a29",
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
  "created_at": "2026-10-28T15:11:44.578874Z",
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
  "phone": "+380632951990",
  "device_ref": "sandbox-443"
}
```

```json
{
  "challenge_id": "5e7b6a89-e07c-4dd6-adb8-95837036fc6a",
  "expires_at": "2026-10-28T15:16:46.258940293Z",
  "resend_available_at": "2026-10-28T15:11:47.258940293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632951990` → **200**

```json
{
  "phone": "+380632951990",
  "audience": "CLIENT",
  "code": "434667",
  "sent_at": "2026-10-28T15:11:46.260987897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e7b6a89-e07c-4dd6-adb8-95837036fc6a",
  "code": "434667",
  "device_ref": "sandbox-443"
}
```

```json
{
  "session_id": "b82e853d-3286-4e93-a7f1-2904b0bd6698",
  "subject": {
    "type": "CLIENT",
    "id": "252f8f61-0109-4d81-ad52-1c45020665b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTJmOGY2MS0wMTA5LTRkODEtYWQ1Mi0xYzQ1MDIwNjY1YjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjA2LCJpYXQiOjE3OTMyMDAzMDYsImp0aSI6IjlmNmNmNmI0LTVhOWQtNGYzZi1hZDkzLTFiNWNiZGMwNzkyYyIsInNpZCI6ImI4MmU4NTNkLTMyODYtNGU5My1hN2YxLTI5MDRiMGJkNjY5OCJ9.__C2GilGz0tiPb-SMWAmGo-uvPIKpjof1dapP7sqQtY",
  "access_expires_at": "2026-10-28T15:26:46.455704668Z",
  "refresh_token": "_RSoXPhn1q-AFT661aR4hAoFVDY4v9iuxAri4Ej6ymw",
  "refresh_expires_at": "2026-11-27T15:11:46.455315269Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "a59db4f9-1739-4aa4-aed8-f88f4a17d719",
  "expires_at": "2026-10-28T15:16:48.625541503Z",
  "resend_available_at": "2026-10-28T15:11:49.625541503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632951990` → **200**

```json
{
  "phone": "+380632951990",
  "audience": "CLIENT",
  "code": "484238",
  "sent_at": "2026-10-28T15:11:48.627327811Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "38c13ed8-b89b-4f39-91c7-8711f70dffe2",
  "challenge_id": "a59db4f9-1739-4aa4-aed8-f88f4a17d719",
  "otp_code": "484238"
}
```

```json
{
  "id": "9557954c-e124-48b0-bcb0-84b91fe17228",
  "state": "PENDING",
  "created_at": "2026-10-28T15:11:48.832057Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/9557954c-e124-48b0-bcb0-84b91fe17228` → **200**

```json
{
  "id": "9557954c-e124-48b0-bcb0-84b91fe17228",
  "state": "PENDING",
  "created_at": "2026-10-28T15:11:48.832057Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9557954c-e124-48b0-bcb0-84b91fe17228` → **200**

```json
{
  "id": "9557954c-e124-48b0-bcb0-84b91fe17228",
  "state": "PENDING",
  "created_at": "2026-10-28T15:11:48.832057Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9557954c-e124-48b0-bcb0-84b91fe17228` → **200**

```json
{
  "id": "9557954c-e124-48b0-bcb0-84b91fe17228",
  "state": "PENDING",
  "created_at": "2026-10-28T15:11:48.832057Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9557954c-e124-48b0-bcb0-84b91fe17228` → **200**

```json
{
  "id": "9557954c-e124-48b0-bcb0-84b91fe17228",
  "state": "READY",
  "created_at": "2026-10-28T15:11:48.832057Z",
  "ready_at": "2026-10-28T15:11:51.584863Z",
  "expires_at": "2026-11-04T15:11:51.584863Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/9557954c-e124-48b0-bcb0-84b91fe17228/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633474744",
  "device_ref": "sandbox-22147"
}
```

```json
{
  "challenge_id": "d74cef39-021f-4755-9017-1de0d60f7800",
  "expires_at": "2026-10-28T15:16:52.744030506Z",
  "resend_available_at": "2026-10-28T15:11:53.744030506Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633474744` → **200**

```json
{
  "phone": "+380633474744",
  "audience": "CLIENT",
  "code": "881486",
  "sent_at": "2026-10-28T15:11:52.745777528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d74cef39-021f-4755-9017-1de0d60f7800",
  "code": "881486",
  "device_ref": "sandbox-22147"
}
```

```json
{
  "session_id": "0a9f0b02-ada5-4ae8-bbf8-5174171b8e76",
  "subject": {
    "type": "CLIENT",
    "id": "2838309f-a1d5-4d9e-90b4-7d4a8f952f15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODM4MzA5Zi1hMWQ1LTRkOWUtOTBiNC03ZDRhOGY5NTJmMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjEyLCJpYXQiOjE3OTMyMDAzMTIsImp0aSI6IjU2Yjg0MWM0LTJkZDAtNGVmYS04MDY3LTYxYzc4MDkwMDhkMiIsInNpZCI6IjBhOWYwYjAyLWFkYTUtNGFlOC1iYmY4LTUxNzQxNzFiOGU3NiJ9.7WO3Z6KyC-ztO8JDWofYPhJwyxF5s8w2FLhVjKnUDCU",
  "access_expires_at": "2026-10-28T15:26:52.939030208Z",
  "refresh_token": "kA7p-0O4G0fpxR5MqqxrzYHr8Cj-nXvCnVCGg4CiRd4",
  "refresh_expires_at": "2026-11-27T15:11:52.938716477Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/9557954c-e124-48b0-bcb0-84b91fe17228/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/9557954c-e124-48b0-bcb0-84b91fe17228/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "53bcceac-1010-4516-9a2a-5d43e80a5dc3"
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
  "session_id": "008affe1-5313-4c14-acd2-b6209e3d365a",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMTMsImlhdCI6MTc5MzIwMDMxMywianRpIjoiYTlhZWJkYTQtMTczMi00MmU2LWJlZmQtZWM1NTZkOWUxNmQwIiwic2lkIjoiMDA4YWZmZTEtNTMxMy00YzE0LWFjZDItYjYyMDllM2QzNjVhIn0.zyaAgYlSn6HL-GekEd0dB4gyyz3-DZdFEcD07VcedM8",
  "access_expires_at": "2026-10-28T15:26:53.47648486Z",
  "refresh_token": "hhrLfRoKfut-8bv5D-UPOO13S_hhGAuvSXVlTGmBHGc",
  "refresh_expires_at": "2026-10-29T03:11:53.476142166Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "252f8f61-0109-4d81-ad52-1c45020665b4",
  "session_id": "b82e853d-3286-4e93-a7f1-2904b0bd6698",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/252f8f61-0109-4d81-ad52-1c45020665b4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "9557954c-e124-48b0-bcb0-84b91fe17228",
      "state": "READY",
      "created_at": "2026-10-28T15:11:48.832057Z",
      "ready_at": "2026-10-28T15:11:51.584863Z",
      "expires_at": "2026-11-04T15:11:51.584863Z",
      "size_bytes": 1030
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
  "device_ref": "sandbox-27380"
}
```

```json
{
  "challenge_id": "4baea21f-3886-422c-b963-6bd869ca490d",
  "expires_at": "2026-10-28T15:16:54.006534356Z",
  "resend_available_at": "2026-10-28T15:11:55.006534356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "825804",
  "sent_at": "2026-10-28T15:11:54.008570823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4baea21f-3886-422c-b963-6bd869ca490d",
  "code": "825804",
  "device_ref": "sandbox-27380"
}
```

```json
{
  "session_id": "3e32c973-6489-494b-9803-b15d77fc3cfa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTIxNCwiaWF0IjoxNzkzMjAwMzE0LCJqdGkiOiJhNGE4ZDRmNy02MzU1LTRlZjktYmNkNS1hNmE1N2I3MDkwN2QiLCJzaWQiOiIzZTMyYzk3My02NDg5LTQ5NGItOTgwMy1iMTVkNzdmYzNjZmEifQ.fjkjsIjM8jo84sJTY1ccXS6UFQaQSAmvE88F-ycGqKo",
  "access_expires_at": "2026-10-28T15:26:54.202677104Z",
  "refresh_token": "yoinAj8-LYLdBd5i3oBRAtJHvBEjcXsdVIATZN8CsK4",
  "refresh_expires_at": "2026-11-27T15:11:54.202324705Z",
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
  "device_ref": "sandbox-21283"
}
```

```json
{
  "challenge_id": "c1bc1895-f77e-4e5b-8cbe-ab21461cf10e",
  "expires_at": "2026-10-28T15:16:54.545024984Z",
  "resend_available_at": "2026-10-28T15:11:55.545024984Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "400402",
  "sent_at": "2026-10-28T15:11:54.546850925Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1bc1895-f77e-4e5b-8cbe-ab21461cf10e",
  "code": "400402",
  "device_ref": "sandbox-21283"
}
```

```json
{
  "session_id": "8585b484-15fd-46b2-baab-2bbe976e0b57",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTIxNCwiaWF0IjoxNzkzMjAwMzE0LCJqdGkiOiI4ODk5MWJmNi0yMzhiLTQ4ODgtOGUyNy0yOTkwMGUxODRkODgiLCJzaWQiOiI4NTg1YjQ4NC0xNWZkLTQ2YjItYmFhYi0yYmJlOTc2ZTBiNTcifQ.8g4cERFga4tymq0C9IX_VB7KIfsNtyCxMvM9rtIvKJo",
  "access_expires_at": "2026-10-28T15:26:54.739623353Z",
  "refresh_token": "vR8uKYgEa4IGVCVO94V5JAfdTHiuXsFNwypE48H9WuM",
  "refresh_expires_at": "2026-11-27T15:11:54.739268681Z",
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
  "command_id": "f10ed629-cfa3-4b15-a0d8-68a090d8bf2f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:11:55Z",
    "sequence": 1793200315812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "359ecba1-8bc7-42d6-8524-5f7e0c2e827c",
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
  "last_heartbeat_at": "2026-10-28T15:11:55.096834Z",
  "last_location_at": "2026-10-28T15:11:55.096834Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-13430"
}
```

```json
{
  "challenge_id": "9c60e8b3-fd5e-43cb-b336-5a0d9e792046",
  "expires_at": "2026-10-28T15:16:55.272059643Z",
  "resend_available_at": "2026-10-28T15:11:56.272059643Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "026149",
  "sent_at": "2026-10-28T15:11:55.273999695Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c60e8b3-fd5e-43cb-b336-5a0d9e792046",
  "code": "026149",
  "device_ref": "sandbox-13430"
}
```

```json
{
  "session_id": "5885bcbf-90a6-4670-96b6-bba22dbb9e1b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTIxNSwiaWF0IjoxNzkzMjAwMzE1LCJqdGkiOiJhMDI1ZTRkNy0yMzZhLTRkYmMtYjE3Ny1hNTUxODY1MzU1ZTUiLCJzaWQiOiI1ODg1YmNiZi05MGE2LTQ2NzAtOTZiNi1iYmEyMmRiYjllMWIifQ.mXDRpBvC_SnVkOqf0eBhXdQsjZR8cMyq23B4pSfTKqg",
  "access_expires_at": "2026-10-28T15:26:55.477971743Z",
  "refresh_token": "oiWlKUfIOmERQP4x2s4DWf83Wode50mm7DjS2N91cf4",
  "refresh_expires_at": "2026-11-27T15:11:55.477495559Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "329c5dca-a7e8-4031-bd21-2b33bb31b050",
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
  "last_heartbeat_at": "2026-10-28T15:11:04.178261Z",
  "last_location_at": "2026-10-28T15:11:04.178261Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/329c5dca-a7e8-4031-bd21-2b33bb31b050/handover` → **200**

```json
{
  "command_id": "77baf76b-79ca-4a1d-8c34-b57f4798f626",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "329c5dca-a7e8-4031-bd21-2b33bb31b050",
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
  "last_heartbeat_at": "2026-10-28T15:11:04.178261Z",
  "last_location_at": "2026-10-28T15:11:04.178261Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/329c5dca-a7e8-4031-bd21-2b33bb31b050/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:11:55Z",
    "sequence": 1793200316436
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "329c5dca-a7e8-4031-bd21-2b33bb31b050",
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
  "last_heartbeat_at": "2026-10-28T15:11:56.015981Z",
  "last_location_at": "2026-10-28T15:11:56.015981Z",
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
  "session_id": "0eb202ee-61a9-4e59-8235-6fc6f3e59bd1",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMTYsImlhdCI6MTc5MzIwMDMxNiwianRpIjoiM2Q0MmY0NzMtMjA5My00ZDA0LThkMzUtNmU1ZDkyODBiOGEzIiwic2lkIjoiMGViMjAyZWUtNjFhOS00ZTU5LTgyMzUtNmZjNmYzZTU5YmQxIn0.gD5pR7-H88EuyjJQ1EFkEFSk97rXknXfUerBZJZCVkg",
  "access_expires_at": "2026-10-28T15:26:56.392089353Z",
  "refresh_token": "KmW51sjLWT9QTz021nXaaaSOWRR51GQJBQJnHmVKcrA",
  "refresh_expires_at": "2026-10-29T03:11:56.391697985Z",
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
  "session_id": "c1822169-f90f-436b-a136-3e02c301473f",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMTYsImlhdCI6MTc5MzIwMDMxNiwianRpIjoiMTcwZGVmYWYtZmRlNS00NzhjLTliYTktNDFhZTFkYjNlM2UyIiwic2lkIjoiYzE4MjIxNjktZjkwZi00MzZiLWExMzYtM2UwMmMzMDE0NzNmIn0.Hw8HglEwcvBua0mL5d2byAx6Z8mPs8H5Vg0B4FhhDNw",
  "access_expires_at": "2026-10-28T15:26:56.770775554Z",
  "refresh_token": "AQxlSOR1z3OgvlLbb2fFEvCQz5JcvCKMCTkcIRfQNFs",
  "refresh_expires_at": "2026-10-29T03:11:56.77042759Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688798397",
  "device_ref": "sandbox-9433"
}
```

```json
{
  "challenge_id": "a8f98150-ffb2-45ae-983c-fe7b109760af",
  "expires_at": "2026-10-28T15:16:56.94857696Z",
  "resend_available_at": "2026-10-28T15:11:57.94857696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688798397` → **200**

```json
{
  "phone": "+380688798397",
  "audience": "CLIENT",
  "code": "296304",
  "sent_at": "2026-10-28T15:11:56.950402797Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8f98150-ffb2-45ae-983c-fe7b109760af",
  "code": "296304",
  "device_ref": "sandbox-9433"
}
```

```json
{
  "session_id": "0d451025-5f6b-4b48-8b43-cacec21e43b3",
  "subject": {
    "type": "CLIENT",
    "id": "ea649f1f-04aa-40fa-a94e-341a863ed96e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYTY0OWYxZi0wNGFhLTQwZmEtYTk0ZS0zNDFhODYzZWQ5NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjE3LCJpYXQiOjE3OTMyMDAzMTcsImp0aSI6IjcyZjgzNjk2LWU2MjYtNDBkOS04Y2JjLTk1ZGQ4MDczZjg3NCIsInNpZCI6IjBkNDUxMDI1LTVmNmItNGI0OC04YjQzLWNhY2VjMjFlNDNiMyJ9.AibPE0N9dlWAnQ5YoTgJ3CTsHlG6IP2hj7k7w7B0lvo",
  "access_expires_at": "2026-10-28T15:26:57.152811884Z",
  "refresh_token": "_lND1KyEHUmsHaAj0_liUNgyor1DwQ1mqk2yS4vLtJk",
  "refresh_expires_at": "2026-11-27T15:11:57.152445533Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f70a80e8-803a-4117-a55a-89eb139e3060",
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
  "id": "3235c1ab-5ca8-474d-aeec-e405c137ce85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:16:57.339025Z",
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
  "command_id": "df34abf9-33b7-47b4-92b4-71a008548322",
  "quote_id": "3235c1ab-5ca8-474d-aeec-e405c137ce85",
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
  "id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ea649f1f-04aa-40fa-a94e-341a863ed96e",
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
  "created_at": "2026-10-28T15:11:57.531339Z",
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
    "id": "5a7eb047-b1c5-4c72-badc-82660d2038ef",
    "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
    "expires_at": "2026-10-28T15:12:12.534652Z",
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

`POST /api/driver/v1/offers/5a7eb047-b1c5-4c72-badc-82660d2038ef/reject` → **204**

```json
{
  "command_id": "457e8767-3997-4cdd-88d5-136da01906fa"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e6411250-e038-4c8e-aa75-f1766989104b",
    "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
    "expires_at": "2026-10-28T15:12:12.89841Z",
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

`POST /api/driver/v1/offers/e6411250-e038-4c8e-aa75-f1766989104b/accept` → **200**

```json
{
  "command_id": "6ae39cba-5fd3-43ee-b8e3-d76109572d69"
}
```

```json
{
  "id": "709c8daf-e8e6-48bd-a18d-6314204f1b45",
  "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "495a3a73-9f07-430b-a349-937a4fd0fb61",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/6b072fa5-2208-4b5d-b636-b79cdb4efc2c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:11:57.531916Z",
      "actor": {
        "type": "CLIENT",
        "id": "ea649f1f-04aa-40fa-a94e-341a863ed96e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
        "quote_id": "3235c1ab-5ca8-474d-aeec-e405c137ce85",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "315428fe-edf4-490c-981e-6f30173aba16"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:11:57.533941Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
        "attempt_id": "0a0d31aa-96b2-41fc-aa6c-223f8c8ebdb0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "315428fe-edf4-490c-981e-6f30173aba16"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:11:57.53882Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5a7eb047-b1c5-4c72-badc-82660d2038ef",
        "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "315428fe-edf4-490c-981e-6f30173aba16"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T15:11:57.897707Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5a7eb047-b1c5-4c72-badc-82660d2038ef",
        "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c"
      },
      "correlation_id": "c2214d36-2a30-4eae-a25d-d5bf9e2b493b"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 6b072fa5-2208-4b5d-b636-b79cdb4efc2c — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/6b072fa5-2208-4b5d-b636-b79cdb4efc2c` → **200**

```json
{
  "id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ea649f1f-04aa-40fa-a94e-341a863ed96e",
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
    "id": "709c8daf-e8e6-48bd-a18d-6314204f1b45",
    "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "495a3a73-9f07-430b-a349-937a4fd0fb61",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:11:57.531339Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6b072fa5-2208-4b5d-b636-b79cdb4efc2c/cancel` → **200**

```json
{
  "command_id": "aca25c05-c8e8-48a9-b787-b188d368d91c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ea649f1f-04aa-40fa-a94e-341a863ed96e",
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
    "id": "709c8daf-e8e6-48bd-a18d-6314204f1b45",
    "order_id": "6b072fa5-2208-4b5d-b636-b79cdb4efc2c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "495a3a73-9f07-430b-a349-937a4fd0fb61",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:11:57.531339Z",
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
  "session_id": "359ecba1-8bc7-42d6-8524-5f7e0c2e827c",
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
  "last_heartbeat_at": "2026-10-28T15:11:55.096834Z",
  "last_location_at": "2026-10-28T15:11:55.096834Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/359ecba1-8bc7-42d6-8524-5f7e0c2e827c/close` → **200**

```json
{
  "command_id": "a4fba6dd-f7b6-4a85-b672-de0024957da4",
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
  "session_id": "329c5dca-a7e8-4031-bd21-2b33bb31b050",
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
  "last_heartbeat_at": "2026-10-28T15:11:56.015981Z",
  "last_location_at": "2026-10-28T15:11:56.015981Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/329c5dca-a7e8-4031-bd21-2b33bb31b050/close` → **200**

```json
{
  "command_id": "62d1d3d5-4314-485f-b9a0-3401c6add188",
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
  "device_ref": "sandbox-21769"
}
```

```json
{
  "challenge_id": "99eaf8ff-d3b6-4a74-86b3-5e04344c5b2e",
  "expires_at": "2026-10-28T15:16:59.725381269Z",
  "resend_available_at": "2026-10-28T15:12:00.725381269Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "915431",
  "sent_at": "2026-10-28T15:11:59.727194566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99eaf8ff-d3b6-4a74-86b3-5e04344c5b2e",
  "code": "915431",
  "device_ref": "sandbox-21769"
}
```

```json
{
  "session_id": "a2f9fb83-7868-4877-bf8e-ac38f2d4decf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTIxOSwiaWF0IjoxNzkzMjAwMzE5LCJqdGkiOiI2NWFkNTcxMy03MTdhLTQ5NDMtODM0MC0yZDQyOTllODk4MDQiLCJzaWQiOiJhMmY5ZmI4My03ODY4LTQ4NzctYmY4ZS1hYzM4ZjJkNGRlY2YifQ.5KB8kk_VQmY0O7jPv2F1Yv9CcHs80a_HMdz117NUrd0",
  "access_expires_at": "2026-10-28T15:26:59.923216438Z",
  "refresh_token": "ZFozuO9XtLN3zIRjjxEZNDcPB3K0E0bvaoDis8gYRXM",
  "refresh_expires_at": "2026-11-27T15:11:59.922857802Z",
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
  "command_id": "1ee53a52-fb2b-46dd-a9df-f1f1fb04c3d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:00Z",
    "sequence": 1793200320264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:00.279189Z",
  "last_location_at": "2026-10-28T15:12:00.279189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670670407",
  "device_ref": "sandbox-19059"
}
```

```json
{
  "challenge_id": "f55c4171-8d7b-41b9-a2a1-29da97a5bc9d",
  "expires_at": "2026-10-28T15:17:00.45436826Z",
  "resend_available_at": "2026-10-28T15:12:01.45436826Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670670407` → **200**

```json
{
  "phone": "+380670670407",
  "audience": "CLIENT",
  "code": "309389",
  "sent_at": "2026-10-28T15:12:00.455989849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f55c4171-8d7b-41b9-a2a1-29da97a5bc9d",
  "code": "309389",
  "device_ref": "sandbox-19059"
}
```

```json
{
  "session_id": "c69e9df9-a3fc-4ff4-a2a0-55452701fd89",
  "subject": {
    "type": "CLIENT",
    "id": "6bcd2cd3-a951-4cd9-8ca5-4ca5265223b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YmNkMmNkMy1hOTUxLTRjZDktOGNhNS00Y2E1MjY1MjIzYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjIwLCJpYXQiOjE3OTMyMDAzMjAsImp0aSI6IjczNjViYTFhLTU2MWQtNDUyMS1hMTQ0LTM5MzI2ZTllYjg4ZiIsInNpZCI6ImM2OWU5ZGY5LWEzZmMtNGZmNC1hMmEwLTU1NDUyNzAxZmQ4OSJ9.ESSrgPLjRwpktVkuapo9XpL9Ry98F_mPcdmY4mGwPF0",
  "access_expires_at": "2026-10-28T15:27:00.646825126Z",
  "refresh_token": "Nk1-KfOoscqz-E6ulv3RfspFDKCbVeUZITtHzvUsWB4",
  "refresh_expires_at": "2026-11-27T15:12:00.646363037Z",
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
  "command_id": "b266e1d4-3fd4-448b-b1ee-708b22ad783d",
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
  "id": "b12287f6-8f22-47f5-945f-dda63a7b3ec7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:00.993543Z",
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
  "command_id": "9e4533e1-2c9f-4ffe-9e43-4d44b78efed4",
  "platform": "ANDROID",
  "token": "sandbox-driver-78e319f6-6230-428e-9d35-9ac1be806ff2"
}
```

```json
{
  "id": "6d48d8ba-9b54-4d86-9dde-7dd8607b0c56",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:12:01.182041Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "250976d3-9a68-45b9-8170-504c5c3fb9cf",
  "platform": "ANDROID",
  "token": "sandbox-rider-f87d567d-85e0-44da-b8af-c54755948c4e"
}
```

```json
{
  "id": "2f4ec619-e6fa-4506-a154-d698978b47a2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:12:01.358737Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "20409d5a-0ae0-402b-8d4f-e5d5ac638a3b",
  "quote_id": "b12287f6-8f22-47f5-945f-dda63a7b3ec7",
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
  "id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6bcd2cd3-a951-4cd9-8ca5-4ca5265223b6",
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
  "created_at": "2026-10-28T15:12:01.544003Z",
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
    "id": "683a98f5-3cf0-465a-8e16-b319c1d9371a",
    "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
    "expires_at": "2026-10-28T15:12:16.546133Z",
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

`POST /api/driver/v1/offers/683a98f5-3cf0-465a-8e16-b319c1d9371a/accept` → **200**

```json
{
  "command_id": "5a854611-ee98-4304-8654-8372e833b15a"
}
```

```json
{
  "id": "f18910fa-5173-4697-a9de-10b47e08acbb",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "256a0927-108c-44fb-9d49-389020c19017",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:12:01.524Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:12:01.524Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:12:02.802647636Z",
    "token_suffix": "806ff2",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "58a2c421-d218-4f46-a4fd-3d19c4629c42",
      "order_version": "2",
      "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670670407&after=2026-10-28T15:12:01.524Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:12:02.804584083Z",
    "token_suffix": "948c4e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "949a11b9-5c9e-4c54-8477-75827730e440",
      "order_version": "3",
      "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4bbaf541-1f58-44b9-8b4d-96e4237595d4/messages` → **201**

```json
{
  "command_id": "2057070c-de1a-416f-ab41-6c967911bc70",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "6471f312-a93d-4561-9d6c-33e93056a81c",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T15:12:03.156704302Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "256a0927-108c-44fb-9d49-389020c19017",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "assignment_id": "f18910fa-5173-4697-a9de-10b47e08acbb",
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

`POST /api/driver/v1/trips/256a0927-108c-44fb-9d49-389020c19017/messages` → **201**

```json
{
  "command_id": "1b57cb45-e734-46c2-99c6-26f0a4b92db7",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "6de4c34e-a9de-4940-9b26-e85e6ba9c4d2",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T15:12:03.497541974Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4bbaf541-1f58-44b9-8b4d-96e4237595d4/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/256a0927-108c-44fb-9d49-389020c19017/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670670407"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/29a7be19-3d7f-49d2-99bf-0b603ad4030f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:04Z",
    "sequence": 1793200324284
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:04.020268Z",
  "last_location_at": "2026-10-28T15:12:04.020268Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "256a0927-108c-44fb-9d49-389020c19017",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "assignment_id": "f18910fa-5173-4697-a9de-10b47e08acbb",
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

`POST /api/driver/v1/trips/256a0927-108c-44fb-9d49-389020c19017/arrive` → **200**

```json
{
  "command_id": "69eec858-532e-49b6-aa5b-781995f40b0c",
  "expected_version": 0
}
```

```json
{
  "id": "256a0927-108c-44fb-9d49-389020c19017",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "assignment_id": "f18910fa-5173-4697-a9de-10b47e08acbb",
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
  "arrived_at": "2026-10-28T15:12:04.365157Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/256a0927-108c-44fb-9d49-389020c19017/start` → **200**

```json
{
  "command_id": "296aeceb-1340-499a-a50d-4586ef79348b",
  "expected_version": 1
}
```

```json
{
  "id": "256a0927-108c-44fb-9d49-389020c19017",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "assignment_id": "f18910fa-5173-4697-a9de-10b47e08acbb",
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
  "arrived_at": "2026-10-28T15:12:04.365157Z",
  "started_at": "2026-10-28T15:12:04.546298Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/29a7be19-3d7f-49d2-99bf-0b603ad4030f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:04Z",
    "sequence": 1793200324723
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:04.739508Z",
  "last_location_at": "2026-10-28T15:12:04.739508Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/256a0927-108c-44fb-9d49-389020c19017/complete` → **200**

```json
{
  "command_id": "ff661019-634c-48fd-91dc-e83d12f4b939",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:12:04Z",
  "cash_received": true
}
```

```json
{
  "id": "256a0927-108c-44fb-9d49-389020c19017",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "assignment_id": "f18910fa-5173-4697-a9de-10b47e08acbb",
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
  "arrived_at": "2026-10-28T15:12:04.365157Z",
  "started_at": "2026-10-28T15:12:04.546298Z",
  "completed_at": "2026-10-28T15:12:04.924301Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4bbaf541-1f58-44b9-8b4d-96e4237595d4` → **200**

```json
{
  "id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6bcd2cd3-a951-4cd9-8ca5-4ca5265223b6",
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
    "id": "f18910fa-5173-4697-a9de-10b47e08acbb",
    "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "256a0927-108c-44fb-9d49-389020c19017",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:12:01.544003Z",
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
    "id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:12:01.544003Z",
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
    "id": "256a0927-108c-44fb-9d49-389020c19017",
    "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
    "order_short_number": 9,
    "created_at": "2026-10-28T15:12:01.911562Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5eb54f54-99a7-4494-b3df-60b82efc4344",
    "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
    "order_short_number": 2,
    "created_at": "2026-10-28T15:10:55.408744Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "573162fd-b3f1-461f-8fcb-4b42f01087b0",
    "order_id": "6c86d84f-598b-4953-8e45-ce01314662c7",
    "order_short_number": 1,
    "created_at": "2026-10-28T15:10:41.639818Z",
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

`GET /api/rider/v1/orders/4bbaf541-1f58-44b9-8b4d-96e4237595d4/tip` → **200**

```json
{
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
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
  "available_until": "2026-10-29T15:12:04.924301Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4bbaf541-1f58-44b9-8b4d-96e4237595d4/tip` → **201**

```json
{
  "command_id": "29ae3232-a90b-4ac4-853a-de7cb67a7f12",
  "amount_minor": 1100
}
```

```json
{
  "id": "2bd770ee-7ca8-4bb8-9d5e-d7bc9771a5af",
  "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T15:12:09.22938Z"
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
  "session_id": "b9ce5a3e-94f6-4648-8a5c-39d8adea0b2c",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMjksImlhdCI6MTc5MzIwMDMyOSwianRpIjoiMDMwNGE0OTgtMGY0Ni00Mjg3LTg4ZTYtMmFmODJiZjE4Yzk0Iiwic2lkIjoiYjljZTVhM2UtOTRmNi00NjQ4LThhNWMtMzlkOGFkZWEwYjJjIn0.gBagX_oQxT4TbgC4fNXua2UlSzIKbdIysh2Qhea-ESg",
  "access_expires_at": "2026-10-28T15:27:09.619828236Z",
  "refresh_token": "naZvBWbI_tYvFAvoGM0_XrHtEvDZGaBOhh9_48cOryc",
  "refresh_expires_at": "2026-10-29T03:12:09.619459192Z",
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
          "CARD": 1,
          "CASH": 8
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
      "CARD": 1,
      "CASH": 8
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
  "generated_at": "2026-10-28T15:12:09.796835769Z"
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
  "generated_at": "2026-10-28T15:12:09.972947411Z"
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
  "session_id": "1a3abe2a-cf9f-49c9-b7cc-8963ea39f1ed",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMzAsImlhdCI6MTc5MzIwMDMzMCwianRpIjoiMDA2Njc0ZDktYzE1MS00ZGFlLWI2ZTMtNTNhMDRjZDYxZjFmIiwic2lkIjoiMWEzYWJlMmEtY2Y5Zi00OWM5LWI3Y2MtODk2M2VhMzlmMWVkIn0.ZgAtJvMLRvB4rDsbcHZAUSy0cax8dgA1u8W4leadjOA",
  "access_expires_at": "2026-10-28T15:27:10.354444407Z",
  "refresh_token": "9OSDmOx6SErIR4dyDkkJpjFQGuEBJfWYkJbAIR-8R90",
  "refresh_expires_at": "2026-10-29T03:12:10.354071301Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4bbaf541-1f58-44b9-8b4d-96e4237595d4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:12:01.544339Z",
      "actor": {
        "type": "CLIENT",
        "id": "6bcd2cd3-a951-4cd9-8ca5-4ca5265223b6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
        "quote_id": "b12287f6-8f22-47f5-945f-dda63a7b3ec7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4121c858-dd66-4bed-96dd-08c2e2cc2d4a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:12:01.545609Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
        "attempt_id": "cbfbb518-576b-49f0-9532-57c25dabc444",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4121c858-dd66-4bed-96dd-08c2e2cc2d4a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:12:01.548084Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "683a98f5-3cf0-465a-8e16-b319c1d9371a",
        "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "4121c858-dd66-4bed-96dd-08c2e2cc2d4a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:12:01.912457Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "683a98f5-3cf0-465a-8e16-b319c1d9371a",
        "order_id": "4bbaf541-1f58-44b9-8b4d-96e4237595d4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f18910fa-5173-4697-a9de-10b47e08acbb"
      },
      "correlation_id": "4d805165-aaa9-443b-85dc-30c4b05266a8"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T15:12:10.707524697Z",
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
      "last_location_at": "2026-10-28T15:12:04.739508Z",
      "order_id": null
    }
  ]
}
```

Done: order 4bbaf541-1f58-44b9-8b4d-96e4237595d4.

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
  "session_id": "9bc2945e-5946-4185-95fe-2185dac73a18",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMzEsImlhdCI6MTc5MzIwMDMzMSwianRpIjoiYzIyZDBhMTItMmNlZC00NzVlLThlMjUtYzZlNTE1YmExZGQ0Iiwic2lkIjoiOWJjMjk0NWUtNTk0Ni00MTg1LTk1ZmUtMjE4NWRhYzczYTE4In0.aeRg-riYzdawZPLUAFGX0K_xI37Uu9CCI8o7EEtjwsY",
  "access_expires_at": "2026-10-28T15:27:11.100661045Z",
  "refresh_token": "2wk7Pq1TY7IAKngs3wRdmBE8Z8S1IOmZKXox0QIjAGs",
  "refresh_expires_at": "2026-10-29T03:12:11.100203858Z",
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
  "command_id": "97bccafb-0635-4a6e-9711-40de190a6a2a",
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
  "timestamp": "2026-10-28T15:12:11.000+0000",
  "channel": {
    "id": "1730052000.1261815342",
    "linkedid": "1730052000.1261815342",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673715134"
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
  "timestamp": "2026-10-28T15:12:11.000+0000",
  "channel": {
    "id": "1730052000.1261815342",
    "linkedid": "1730052000.1261815342",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673715134"
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
  "session_id": "6f76d598-67b3-4804-95e9-99d8175f627e",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMzEsImlhdCI6MTc5MzIwMDMzMSwianRpIjoiODYwYzRmZjItZTE4Yy00N2MxLThmNTQtZDI1NTZkYzVkNDMzIiwic2lkIjoiNmY3NmQ1OTgtNjdiMy00ODA0LTk1ZTktOTlkODE3NWY2MjdlIn0.WzIvChCWgtLQ4LXzD2EkTZk9xC5Jh3XTrN7rv08pssE",
  "access_expires_at": "2026-10-28T15:27:11.87883924Z",
  "refresh_token": "l4KTQ29xcK3YQHxNShTsmbaS6zgN4QYsjOXwNfcyBIU",
  "refresh_expires_at": "2026-10-29T03:12:11.878503105Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "24e94cdb-5348-4aca-a58f-f16d4475b1c2",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673715134",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:12:11Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/24e94cdb-5348-4aca-a58f-f16d4475b1c2/answer` → **200**

```json
{
  "command_id": "7f4d876b-3008-4c9c-af91-f626cd93119b"
}
```

```json
{
  "id": "24e94cdb-5348-4aca-a58f-f16d4475b1c2",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673715134",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "order_ids": [],
  "started_at": "2026-10-28T15:12:11Z",
  "answered_at": "2026-10-28T15:12:12.239403Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1261815342",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "139b80cd-1bdb-4134-af4f-7b1331a0b001",
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
  "id": "465cc2a7-b78e-4fdd-8f9d-1bbabd001f25",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:12.451499Z",
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
  "command_id": "23ae66c8-bca6-4b25-bf53-9bd9a4f03d3b",
  "quote_id": "465cc2a7-b78e-4fdd-8f9d-1bbabd001f25",
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
    "phone": "+380673715134"
  },
  "call_id": "24e94cdb-5348-4aca-a58f-f16d4475b1c2"
}
```

```json
{
  "id": "e140d7de-e08b-405c-8126-f1cfe56ff27a",
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
  "created_at": "2026-10-28T15:12:12.635163Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673715134"
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
    "id": "1730052000.1261815342",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "24e94cdb-5348-4aca-a58f-f16d4475b1c2",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673715134",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [
        "e140d7de-e08b-405c-8126-f1cfe56ff27a"
      ],
      "started_at": "2026-10-28T15:12:11Z",
      "answered_at": "2026-10-28T15:12:12.239403Z",
      "ended_at": "2026-10-28T15:12:12.834036Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "a2009ef1-712d-4c65-a4a9-583271d78a69",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678340982",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [],
      "started_at": "2026-10-28T15:10:47.930877Z",
      "answered_at": "2026-10-28T15:10:48.145462Z",
      "ended_at": "2026-10-28T15:10:48.352077Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:10:51.578902Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/e140d7de-e08b-405c-8126-f1cfe56ff27a` → **200**

```json
{
  "id": "e140d7de-e08b-405c-8126-f1cfe56ff27a",
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
  "created_at": "2026-10-28T15:12:12.635163Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673715134"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/e140d7de-e08b-405c-8126-f1cfe56ff27a` → **200**

```json
{
  "id": "e140d7de-e08b-405c-8126-f1cfe56ff27a",
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
  "created_at": "2026-10-28T15:12:12.635163Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673715134"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e140d7de-e08b-405c-8126-f1cfe56ff27a/cancel` → **200**

```json
{
  "command_id": "c5c4439a-0fa3-433c-b431-52cec20479e5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e140d7de-e08b-405c-8126-f1cfe56ff27a",
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
  "created_at": "2026-10-28T15:12:12.635163Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673715134"
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

Done: call 24e94cdb-5348-4aca-a58f-f16d4475b1c2 with order e140d7de-e08b-405c-8126-f1cfe56ff27a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26854"
}
```

```json
{
  "challenge_id": "ca9c3b90-a955-4d6f-b82c-97d9fc5824f1",
  "expires_at": "2026-10-28T15:17:13.649774477Z",
  "resend_available_at": "2026-10-28T15:12:14.649774477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "748653",
  "sent_at": "2026-10-28T15:12:13.651428994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca9c3b90-a955-4d6f-b82c-97d9fc5824f1",
  "code": "748653",
  "device_ref": "sandbox-26854"
}
```

```json
{
  "session_id": "4774c021-9bd6-4ecb-ae2a-a37e4273dcc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTIzMywiaWF0IjoxNzkzMjAwMzMzLCJqdGkiOiJjZGVlYjdkMy1iOGRmLTQwYWUtYjJkNy05NjQ1Yjg0ZjczMzMiLCJzaWQiOiI0Nzc0YzAyMS05YmQ2LTRlY2ItYWUyYS1hMzdlNDI3M2RjYzEifQ._1ecFaMtpdM6Z1g9V3I-ta77xaz00aW1yIW9KThZbPk",
  "access_expires_at": "2026-10-28T15:27:13.847220296Z",
  "refresh_token": "kkwMDf8qNjn-v2zkjUfLv09XYa80RR982G95miO_Qh0",
  "refresh_expires_at": "2026-11-27T15:12:13.846845688Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:04.739508Z",
  "last_location_at": "2026-10-28T15:12:04.739508Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29a7be19-3d7f-49d2-99bf-0b603ad4030f/handover` → **200**

```json
{
  "command_id": "77bca16c-b988-4ec9-93c3-516a9601bbb4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:04.739508Z",
  "last_location_at": "2026-10-28T15:12:04.739508Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29a7be19-3d7f-49d2-99bf-0b603ad4030f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:14Z",
    "sequence": 1793200334386
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:14.402805Z",
  "last_location_at": "2026-10-28T15:12:14.402805Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669055786",
  "device_ref": "sandbox-26587"
}
```

```json
{
  "challenge_id": "50748c36-2d5d-45f6-9d64-c8776cada1f0",
  "expires_at": "2026-10-28T15:17:14.573689338Z",
  "resend_available_at": "2026-10-28T15:12:15.573689338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669055786` → **200**

```json
{
  "phone": "+380669055786",
  "audience": "CLIENT",
  "code": "737818",
  "sent_at": "2026-10-28T15:12:14.575434732Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50748c36-2d5d-45f6-9d64-c8776cada1f0",
  "code": "737818",
  "device_ref": "sandbox-26587"
}
```

```json
{
  "session_id": "162e66ae-de4c-4c20-91be-8c9e214726f8",
  "subject": {
    "type": "CLIENT",
    "id": "11c1da06-5619-4923-9c03-b00244b4efe9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMWMxZGEwNi01NjE5LTQ5MjMtOWMwMy1iMDAyNDRiNGVmZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjM0LCJpYXQiOjE3OTMyMDAzMzQsImp0aSI6IjRmNGQzN2ZkLWRmZGEtNGQxOS1iMTZiLWQ0Yzc4NDE1OTA0NiIsInNpZCI6IjE2MmU2NmFlLWRlNGMtNGMyMC05MWJlLThjOWUyMTQ3MjZmOCJ9.qrg-uWlETmL1WQoO0Abc5XUO5fsEhAMHckJzj516emU",
  "access_expires_at": "2026-10-28T15:27:14.772672143Z",
  "refresh_token": "VxSXzJUT6cJQMGW3oUHsy9jd9sg-iTw_wtyOHBnqJtA",
  "refresh_expires_at": "2026-11-27T15:12:14.772282287Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "40653917-53df-479c-8168-6b3bec6c40c1",
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
  "id": "1b439f41-1837-4941-9850-a394638acee2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:14.957402Z",
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
  "command_id": "0751f7fa-9d98-4cf8-88cb-98f78ff19e53",
  "quote_id": "1b439f41-1837-4941-9850-a394638acee2",
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
  "id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "11c1da06-5619-4923-9c03-b00244b4efe9",
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
  "created_at": "2026-10-28T15:12:15.143006Z",
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
    "id": "daaae1bd-8bf1-44c7-8a8a-adaebf14c64c",
    "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
    "expires_at": "2026-10-28T15:12:30.144968Z",
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

`POST /api/driver/v1/offers/daaae1bd-8bf1-44c7-8a8a-adaebf14c64c/accept` → **200**

```json
{
  "command_id": "a5a00e2f-e315-458b-a05f-5240f9aefa85"
}
```

```json
{
  "id": "88b36983-b356-40ef-bd85-af20773e0a04",
  "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "928960b8-716b-48be-8cee-3d54aaf3f5e7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "928960b8-716b-48be-8cee-3d54aaf3f5e7",
  "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
  "assignment_id": "88b36983-b356-40ef-bd85-af20773e0a04",
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

`POST /api/driver/v1/work-sessions/29a7be19-3d7f-49d2-99bf-0b603ad4030f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:15Z",
    "sequence": 1793200335862
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:15.878473Z",
  "last_location_at": "2026-10-28T15:12:15.878473Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/928960b8-716b-48be-8cee-3d54aaf3f5e7/arrive` → **200**

```json
{
  "command_id": "97608055-56e7-41e7-a668-468c917dc3d3",
  "expected_version": 0
}
```

```json
{
  "id": "928960b8-716b-48be-8cee-3d54aaf3f5e7",
  "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
  "assignment_id": "88b36983-b356-40ef-bd85-af20773e0a04",
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
  "arrived_at": "2026-10-28T15:12:16.079798Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/928960b8-716b-48be-8cee-3d54aaf3f5e7/start` → **200**

```json
{
  "command_id": "d2e72eaf-de1a-4497-aadf-c5a4a7f9a835",
  "expected_version": 1
}
```

```json
{
  "id": "928960b8-716b-48be-8cee-3d54aaf3f5e7",
  "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
  "assignment_id": "88b36983-b356-40ef-bd85-af20773e0a04",
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
  "arrived_at": "2026-10-28T15:12:16.079798Z",
  "started_at": "2026-10-28T15:12:16.28999Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/29a7be19-3d7f-49d2-99bf-0b603ad4030f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:16Z",
    "sequence": 1793200336476
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:16.505121Z",
  "last_location_at": "2026-10-28T15:12:16.505121Z",
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
  "device_ref": "sandbox-437"
}
```

```json
{
  "challenge_id": "218f14a4-a857-4615-82ae-2d0b49099e9a",
  "expires_at": "2026-10-28T15:17:16.683213017Z",
  "resend_available_at": "2026-10-28T15:12:17.683213017Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "403381",
  "sent_at": "2026-10-28T15:12:16.685223596Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "218f14a4-a857-4615-82ae-2d0b49099e9a",
  "code": "403381",
  "device_ref": "sandbox-437"
}
```

```json
{
  "session_id": "a6ed6cfa-d9ec-4555-bea4-35977fcaeb03",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTIzNiwiaWF0IjoxNzkzMjAwMzM2LCJqdGkiOiI5ZjkzNWE2OS1hNGUyLTQyMzQtYmQ0NC05ODRhMmRjMzZjYjAiLCJzaWQiOiJhNmVkNmNmYS1kOWVjLTQ1NTUtYmVhNC0zNTk3N2ZjYWViMDMifQ.2naAs0xeUXCFM3VYEBPaGVeAvL2rocDbS-PoQKsU7nU",
  "access_expires_at": "2026-10-28T15:27:16.880716277Z",
  "refresh_token": "jspHLBTplY2VnR7ZEytwPjFcP0R5r5dpri1vPEo8K34",
  "refresh_expires_at": "2026-11-27T15:12:16.880342245Z",
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
  "command_id": "c5f87d88-74f8-4c00-bf05-bfbca401ff2d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:17Z",
    "sequence": 1793200337232
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2a0b19b3-91d3-4b05-a1bf-e930771b95ae",
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
  "last_heartbeat_at": "2026-10-28T15:12:17.247564Z",
  "last_location_at": "2026-10-28T15:12:17.247564Z",
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
  "session_id": "fe5c8759-998d-41a0-92bd-143986de0283",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMzcsImlhdCI6MTc5MzIwMDMzNywianRpIjoiODA2M2QxZmYtZTQwNi00NjZhLTgzMmItMzYzOTk5Njg4YTFjIiwic2lkIjoiZmU1Yzg3NTktOTk4ZC00MWEwLTkyYmQtMTQzOTg2ZGUwMjgzIn0.uPfVN6fZrbW0tiW7s25cT_TH_AqoJW0OKff5oN7Nvtw",
  "access_expires_at": "2026-10-28T15:27:17.635269Z",
  "refresh_token": "vufrHMXigJUlf1efuPlG5gSd8IcfzUQ1LBcGipXYudg",
  "refresh_expires_at": "2026-10-29T03:12:17.634879143Z",
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
  "session_id": "76d7efc3-a2bf-449a-b4bf-52400cd8ae9a",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyMzgsImlhdCI6MTc5MzIwMDMzOCwianRpIjoiMDE3M2Y0NDYtMTY2OC00NGViLTg5OTQtMmY0ODc5NzMzMjBmIiwic2lkIjoiNzZkN2VmYzMtYTJiZi00NDlhLWI0YmYtNTI0MDBjZDhhZTlhIn0.b-LIAeK_dOo-05f-LCJpZnterNf0V1IrgY3cgUpkLls",
  "access_expires_at": "2026-10-28T15:27:18.016912533Z",
  "refresh_token": "1xSLfzFtL6PcJZ9Kt0A8QVzKJFpObRbw2ySYUJf4C00",
  "refresh_expires_at": "2026-10-29T03:12:18.01651149Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8eb59a53-7d5a-467f-aa15-12d7085b2ea4` → **200**

```json
{
  "id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "11c1da06-5619-4923-9c03-b00244b4efe9",
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
    "id": "88b36983-b356-40ef-bd85-af20773e0a04",
    "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "928960b8-716b-48be-8cee-3d54aaf3f5e7",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T15:12:15.143006Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8eb59a53-7d5a-467f-aa15-12d7085b2ea4/interrupt` → **200**

```json
{
  "command_id": "d32e5c38-7215-4ab6-8691-a6edd0ee5c85",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "11c1da06-5619-4923-9c03-b00244b4efe9",
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
      "id": "88b36983-b356-40ef-bd85-af20773e0a04",
      "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "928960b8-716b-48be-8cee-3d54aaf3f5e7",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T15:12:15.143006Z",
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
    "id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "11c1da06-5619-4923-9c03-b00244b4efe9",
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
    "id": "45b6bedb-246b-4f10-8a9c-e70cadc468cd",
    "order_id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
    "expires_at": "2026-10-28T15:12:33.411182Z",
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

`POST /api/driver/v1/offers/45b6bedb-246b-4f10-8a9c-e70cadc468cd/accept` → **200**

```json
{
  "command_id": "17285ba6-6011-48c3-99a7-7448ccddfa3c"
}
```

```json
{
  "id": "64a0db20-abb4-40f5-b957-e5a4ff520aed",
  "order_id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2dadb479-f7af-434b-9721-c9a7db86ffd6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2dadb479-f7af-434b-9721-c9a7db86ffd6",
  "order_id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
  "assignment_id": "64a0db20-abb4-40f5-b957-e5a4ff520aed",
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
  "session_id": "2a0b19b3-91d3-4b05-a1bf-e930771b95ae",
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
  "last_heartbeat_at": "2026-10-28T15:12:17.247564Z",
  "last_location_at": "2026-10-28T15:12:17.247564Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/2a0b19b3-91d3-4b05-a1bf-e930771b95ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:19Z",
    "sequence": 1793200339335
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2a0b19b3-91d3-4b05-a1bf-e930771b95ae",
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
  "last_heartbeat_at": "2026-10-28T15:12:19.351371Z",
  "last_location_at": "2026-10-28T15:12:19.351371Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2dadb479-f7af-434b-9721-c9a7db86ffd6/arrive` → **200**

```json
{
  "command_id": "f7c64bb0-d336-4b01-b4b1-78b14c97cec7",
  "expected_version": 0
}
```

```json
{
  "id": "2dadb479-f7af-434b-9721-c9a7db86ffd6",
  "order_id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
  "assignment_id": "64a0db20-abb4-40f5-b957-e5a4ff520aed",
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
  "arrived_at": "2026-10-28T15:12:19.534679Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2dadb479-f7af-434b-9721-c9a7db86ffd6/start` → **200**

```json
{
  "command_id": "a58adff4-89b6-4292-8aef-f88a48f2bff7",
  "expected_version": 1
}
```

```json
{
  "id": "2dadb479-f7af-434b-9721-c9a7db86ffd6",
  "order_id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
  "assignment_id": "64a0db20-abb4-40f5-b957-e5a4ff520aed",
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
  "arrived_at": "2026-10-28T15:12:19.534679Z",
  "started_at": "2026-10-28T15:12:19.722167Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2dadb479-f7af-434b-9721-c9a7db86ffd6/complete` → **200**

```json
{
  "command_id": "e656c7ce-67c2-4475-824e-9cfb2762b6a3",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:12:19Z"
}
```

```json
{
  "id": "2dadb479-f7af-434b-9721-c9a7db86ffd6",
  "order_id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
  "assignment_id": "64a0db20-abb4-40f5-b957-e5a4ff520aed",
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
  "arrived_at": "2026-10-28T15:12:19.534679Z",
  "started_at": "2026-10-28T15:12:19.722167Z",
  "completed_at": "2026-10-28T15:12:19.914752Z",
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
    "id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:12:18.403478Z",
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
    "id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:12:15.143006Z",
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

`GET /api/operator/v1/orders/8eb59a53-7d5a-467f-aa15-12d7085b2ea4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:12:15.143351Z",
      "actor": {
        "type": "CLIENT",
        "id": "11c1da06-5619-4923-9c03-b00244b4efe9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
        "quote_id": "1b439f41-1837-4941-9850-a394638acee2",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "b380077c-db98-4213-be8d-7118ca1496c6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:12:15.144501Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
        "attempt_id": "d35c65ad-66ff-4c98-94af-8e3c287a9fc9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b380077c-db98-4213-be8d-7118ca1496c6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:12:15.146202Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "daaae1bd-8bf1-44c7-8a8a-adaebf14c64c",
        "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "b380077c-db98-4213-be8d-7118ca1496c6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:12:15.519733Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "daaae1bd-8bf1-44c7-8a8a-adaebf14c64c",
        "order_id": "8eb59a53-7d5a-467f-aa15-12d7085b2ea4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "88b36983-b356-40ef-bd85-af20773e0a04"
      },
      "correlation_id": "d97cefb0-eeb0-45d4-9cb9-5c7cde4c3490"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/1a7ac668-54b7-411f-8dc3-d8f0645e030f/tip` → **200**

```json
{
  "order_id": "1a7ac668-54b7-411f-8dc3-d8f0645e030f",
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
  "available_until": "2026-10-29T15:12:19.914752Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/1a7ac668-54b7-411f-8dc3-d8f0645e030f/tip` → **409**

```json
{
  "command_id": "d5ae67ab-e625-4b32-8719-40787933b62f",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/1a7ac668-54b7-411f-8dc3-d8f0645e030f/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f7de6ecf-73b5-4a00-802a-2aa353e7f22e"
}
```

Done: interrupted 8eb59a53-7d5a-467f-aa15-12d7085b2ea4, follow-up 1a7ac668-54b7-411f-8dc3-d8f0645e030f.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "29a7be19-3d7f-49d2-99bf-0b603ad4030f",
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
  "last_heartbeat_at": "2026-10-28T15:12:16.505121Z",
  "last_location_at": "2026-10-28T15:12:16.505121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29a7be19-3d7f-49d2-99bf-0b603ad4030f/close` → **200**

```json
{
  "command_id": "8ba44821-7536-4fab-93c3-f5e1479ad1fb",
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
  "session_id": "2a0b19b3-91d3-4b05-a1bf-e930771b95ae",
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
  "last_heartbeat_at": "2026-10-28T15:12:19.351371Z",
  "last_location_at": "2026-10-28T15:12:19.351371Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a0b19b3-91d3-4b05-a1bf-e930771b95ae/close` → **200**

```json
{
  "command_id": "cf980251-65a8-4229-a258-a850223dafa3",
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
  "session_id": "0d59bfc2-b856-4a4c-bea2-d2af75478b9a",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyNDQsImlhdCI6MTc5MzIwMDM0NCwianRpIjoiNDExMGE4NzAtMjM5NC00Zjg1LTk1NTMtYzNjZDBmOTBmNWI3Iiwic2lkIjoiMGQ1OWJmYzItYjg1Ni00YTRjLWJlYTItZDJhZjc1NDc4YjlhIn0.WiSj9DhjLApjAhT7uqqU0K1ylhIyKxF31d9pHcgd4Jo",
  "access_expires_at": "2026-10-28T15:27:24.935394983Z",
  "refresh_token": "YofGkNpXGozi36ZA9L8oMo24K3atGmWfaiHo_GGUv1E",
  "refresh_expires_at": "2026-10-29T03:12:24.935011377Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "3786aca1-4b2d-4433-92af-e2defcf6e81e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:12:25Z"
}
```

```json
{
  "id": "6638055b-0c17-49d9-b591-49fdafd7fc7a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:12:25Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/6638055b-0c17-49d9-b591-49fdafd7fc7a/publish` → **200**

```json
{
  "command_id": "71e0c08f-ca71-4915-b99b-cca8db9b7472",
  "expected_version": 0
}
```

```json
{
  "id": "6638055b-0c17-49d9-b591-49fdafd7fc7a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:12:25.306743Z",
  "published_at": "2026-10-28T15:12:25.306743Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "6638055b-0c17-49d9-b591-49fdafd7fc7a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T15:12:25.306743Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634219491",
  "device_ref": "sandbox-9371"
}
```

```json
{
  "challenge_id": "8ca16000-e775-44f2-a137-6d4e21659306",
  "expires_at": "2026-10-28T15:17:25.659212962Z",
  "resend_available_at": "2026-10-28T15:12:26.659212962Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634219491` → **200**

```json
{
  "phone": "+380634219491",
  "audience": "CLIENT",
  "code": "611560",
  "sent_at": "2026-10-28T15:12:25.661036433Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ca16000-e775-44f2-a137-6d4e21659306",
  "code": "611560",
  "device_ref": "sandbox-9371"
}
```

```json
{
  "session_id": "dc370c5a-ae7f-4e23-b4c0-79073d56022e",
  "subject": {
    "type": "CLIENT",
    "id": "78b89122-0cc3-4c0b-9302-2009c649314a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OGI4OTEyMi0wY2MzLTRjMGItOTMwMi0yMDA5YzY0OTMxNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjQ1LCJpYXQiOjE3OTMyMDAzNDUsImp0aSI6ImFmN2Q1YWU4LTUzZDgtNDdlMC1iY2M1LTZiMmExMmYwMzYxOCIsInNpZCI6ImRjMzcwYzVhLWFlN2YtNGUyMy1iNGMwLTc5MDczZDU2MDIyZSJ9.e572Mf7GV9M_XDSlWcSTDENz846eofyH4ydD7UQWZUM",
  "access_expires_at": "2026-10-28T15:27:25.853335534Z",
  "refresh_token": "fv7H4SBJQcsHq-V9CLMTGINTza07XJRb_SJJvuDvO1E",
  "refresh_expires_at": "2026-11-27T15:12:25.853012203Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "6638055b-0c17-49d9-b591-49fdafd7fc7a",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T15:12:25.306743Z",
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
  "command_id": "e6659d5e-1bb4-4d32-ba24-15ee1c205a19",
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
  "id": "05d1e86d-5cd4-4617-9645-e52ff651b13a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:26.205801Z",
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
  "command_id": "36c06662-76e9-44dd-b294-db8b04dd3ab1",
  "quote_id": "05d1e86d-5cd4-4617-9645-e52ff651b13a",
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
  "correlation_id": "bdaa522f-34bd-48f9-a8c9-85f93b54a838"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "8c3df8fe-8489-45c2-a13b-1136e5fadbbb",
  "version_id": "6638055b-0c17-49d9-b591-49fdafd7fc7a",
  "language": "uk"
}
```

```json
{
  "version_id": "6638055b-0c17-49d9-b591-49fdafd7fc7a",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T15:12:26.569994Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d6d98a55-81a6-4784-b0b5-1a3f16f16106",
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
  "id": "d0c34b0f-4d80-42c8-9cc5-16a663465817",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:26.744238Z",
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
  "command_id": "0dc4ba1e-5841-4bd6-9255-d33b7a19f602",
  "quote_id": "d0c34b0f-4d80-42c8-9cc5-16a663465817",
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
  "id": "a1cdca23-9aed-468c-a841-b2a94f1a3473",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "78b89122-0cc3-4c0b-9302-2009c649314a",
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
  "created_at": "2026-10-28T15:12:26.922006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1cdca23-9aed-468c-a841-b2a94f1a3473` → **200**

```json
{
  "id": "a1cdca23-9aed-468c-a841-b2a94f1a3473",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "78b89122-0cc3-4c0b-9302-2009c649314a",
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
  "created_at": "2026-10-28T15:12:26.922006Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a1cdca23-9aed-468c-a841-b2a94f1a3473/cancel` → **200**

```json
{
  "command_id": "f2b283cb-4cb6-4e96-a640-9eec83ce56e4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a1cdca23-9aed-468c-a841-b2a94f1a3473",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "78b89122-0cc3-4c0b-9302-2009c649314a",
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
  "created_at": "2026-10-28T15:12:26.922006Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/6638055b-0c17-49d9-b591-49fdafd7fc7a` → **409**

```json
{
  "command_id": "d1713e20-32c0-4298-b077-55538b7a2d28",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:12:27Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/6638055b-0c17-49d9-b591-49fdafd7fc7a",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c487351e-4213-4534-9c1d-8d9db1a56308"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9454ae12-1976-44f6-9f30-87591f54e83c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:12:27Z"
}
```

```json
{
  "id": "95a20f51-8e90-4485-a7e2-611dd02e8902",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:12:27Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/95a20f51-8e90-4485-a7e2-611dd02e8902/publish` → **200**

```json
{
  "command_id": "6ab4a22f-3c88-47dd-8ea0-61106ee32de4",
  "expected_version": 0
}
```

```json
{
  "id": "95a20f51-8e90-4485-a7e2-611dd02e8902",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:12:27.83541Z",
  "published_at": "2026-10-28T15:12:27.83541Z",
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
  "device_ref": "sandbox-4598"
}
```

```json
{
  "challenge_id": "1906293a-7897-4b64-a75b-9ffc1b3a1d1d",
  "expires_at": "2026-10-28T15:17:28.015821754Z",
  "resend_available_at": "2026-10-28T15:12:29.015821754Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "516577",
  "sent_at": "2026-10-28T15:12:28.017508588Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1906293a-7897-4b64-a75b-9ffc1b3a1d1d",
  "code": "516577",
  "device_ref": "sandbox-4598"
}
```

```json
{
  "session_id": "9c4d5406-a8a7-44b4-b3c6-c1b5bf23a0c9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTI0OCwiaWF0IjoxNzkzMjAwMzQ4LCJqdGkiOiJkZWRlMTA5OC01MTdiLTQxYmMtODQ4ZC1mYmE3MjA1MmNhY2QiLCJzaWQiOiI5YzRkNTQwNi1hOGE3LTQ0YjQtYjNjNi1jMWI1YmYyM2EwYzkifQ.KrVJzBSM1I2nOcSUnyDyO-AXxvC99cyyAjBE7UFajM0",
  "access_expires_at": "2026-10-28T15:27:28.208966175Z",
  "refresh_token": "NOyxjDAbAe_Ra90zGJ6PArElSKg2lpceW7Llnwq4Th4",
  "refresh_expires_at": "2026-11-27T15:12:28.208597766Z",
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
  "command_id": "185157be-e0cf-4dc7-a027-91590f64a35c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:28Z",
    "sequence": 1793200348554
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "27c1c0a1-a472-4ea8-a63c-8ce3abb47c18",
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
  "last_heartbeat_at": "2026-10-28T15:12:28.569176Z",
  "last_location_at": "2026-10-28T15:12:28.569176Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679096768",
  "device_ref": "sandbox-3339"
}
```

```json
{
  "challenge_id": "d73d23cc-e85f-409d-a83b-cb1bfd7e23ed",
  "expires_at": "2026-10-28T15:17:28.744312013Z",
  "resend_available_at": "2026-10-28T15:12:29.744312013Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679096768` → **200**

```json
{
  "phone": "+380679096768",
  "audience": "CLIENT",
  "code": "438634",
  "sent_at": "2026-10-28T15:12:28.74607694Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d73d23cc-e85f-409d-a83b-cb1bfd7e23ed",
  "code": "438634",
  "device_ref": "sandbox-3339"
}
```

```json
{
  "session_id": "cad337fd-78ec-4a4b-b494-f3fe41ec889f",
  "subject": {
    "type": "CLIENT",
    "id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmN2VlMWVjNS0zMDdkLTRkNDMtOWRiNS05N2E0MTlhZDhjODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjQ4LCJpYXQiOjE3OTMyMDAzNDgsImp0aSI6ImNmYmEzMjFmLWY1NzktNGYwMS1hOGEwLTIxMTI3YmVlYmQzYiIsInNpZCI6ImNhZDMzN2ZkLTc4ZWMtNGE0Yi1iNDk0LWYzZmU0MWVjODg5ZiJ9.2w-qG-GBajHo4Udl4GmWkzTMEgOX4-kFEZfur-nsIFg",
  "access_expires_at": "2026-10-28T15:27:28.936998616Z",
  "refresh_token": "-1gdWXSye9GgAkuFpSh3UAyMlkgXBF3gIpaF88_YT9U",
  "refresh_expires_at": "2026-11-27T15:12:28.936636613Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dba0e25a-65f7-4003-9928-9628eeb94d99",
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
  "id": "7649bbed-738c-44b6-baae-a72a660e13ee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:29.115311Z",
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
  "command_id": "c60e51af-db08-4ab4-94b2-7a31cf14f461",
  "quote_id": "7649bbed-738c-44b6-baae-a72a660e13ee",
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
    "phone": "+380679400979"
  }
}
```

```json
{
  "id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
  "created_at": "2026-10-28T15:12:29.302418Z",
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
    "id": "852db2fa-0f66-47f2-8152-202a00116d49",
    "order_id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
    "expires_at": "2026-10-28T15:12:44.304461Z",
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

`POST /api/driver/v1/offers/852db2fa-0f66-47f2-8152-202a00116d49/accept` → **200**

```json
{
  "command_id": "ec71971e-7997-4839-be53-435e1f0a27ae"
}
```

```json
{
  "id": "ec6ae843-b79a-4678-914e-7e30b8fdf52d",
  "order_id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8bf46ec9-e250-43f3-8da7-a1c3ac0cc210",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8bf46ec9-e250-43f3-8da7-a1c3ac0cc210",
  "order_id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
  "assignment_id": "ec6ae843-b79a-4678-914e-7e30b8fdf52d",
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
    "phone": "+380679400979"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c64b083-bc05-4b66-a84e-06c1025c7dd4",
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
  "id": "2045f924-48d3-4935-b310-ee103666640f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:30.076109Z",
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
  "command_id": "75fc918b-ecd7-47e5-8732-be2915316b4e",
  "quote_id": "2045f924-48d3-4935-b310-ee103666640f",
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
  "id": "a212576d-1db0-44ee-bfd6-ce9a648105b8",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
  "created_at": "2026-10-28T15:12:30.267496Z",
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
  "command_id": "ef10b9c0-a2c3-4ba6-8301-aea057d62be0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T18:12:30Z"
}
```

```json
{
  "id": "b9cc0279-8de6-4501-a247-c8f3a8f29f9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:30.465121Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:12:30Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1c93f4e9-1083-40e5-b2de-3fa269551ba9",
  "quote_id": "b9cc0279-8de6-4501-a247-c8f3a8f29f9b",
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
  "pickup_at": "2026-10-28T18:12:30Z"
}
```

```json
{
  "id": "5d49479b-2255-4dfa-9c5c-7c94bfff1a24",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
  "created_at": "2026-10-28T15:12:30.659092Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:12:30Z",
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
  "command_id": "f9ccca94-032d-41dc-a2e7-e0251d758bb0",
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
  "id": "368ada21-9519-45e8-92b4-75ef110d98f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:30.854575Z",
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
  "command_id": "b2b26f96-2737-4d50-aebe-45a8468901fb",
  "quote_id": "368ada21-9519-45e8-92b4-75ef110d98f0",
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
  "correlation_id": "82d14138-9397-4a54-83c1-0494a9f27baf"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "5d49479b-2255-4dfa-9c5c-7c94bfff1a24",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
      "created_at": "2026-10-28T15:12:30.659092Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T18:12:30Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "a212576d-1db0-44ee-bfd6-ce9a648105b8",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
      "created_at": "2026-10-28T15:12:30.267496Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "a212576d-1db0-44ee-bfd6-ce9a648105b8",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
  "created_at": "2026-10-28T15:12:30.267496Z",
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

`GET /api/rider/v1/orders/97709b83-3d40-475e-bd72-b49e38ae6c8d` → **200**

```json
{
  "id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
    "id": "ec6ae843-b79a-4678-914e-7e30b8fdf52d",
    "order_id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8bf46ec9-e250-43f3-8da7-a1c3ac0cc210",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:12:29.302418Z",
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
    "location_at": "2026-10-28T15:12:28.569176Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/97709b83-3d40-475e-bd72-b49e38ae6c8d/cancel` → **200**

```json
{
  "command_id": "214dc01f-519a-49ff-890a-6a37f0f3b59d",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
    "id": "ec6ae843-b79a-4678-914e-7e30b8fdf52d",
    "order_id": "97709b83-3d40-475e-bd72-b49e38ae6c8d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8bf46ec9-e250-43f3-8da7-a1c3ac0cc210",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:12:29.302418Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a212576d-1db0-44ee-bfd6-ce9a648105b8` → **200**

```json
{
  "id": "a212576d-1db0-44ee-bfd6-ce9a648105b8",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
  "created_at": "2026-10-28T15:12:30.267496Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a212576d-1db0-44ee-bfd6-ce9a648105b8/cancel` → **200**

```json
{
  "command_id": "d9b55d00-a94d-4b2a-9bbc-8012235778b6",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a212576d-1db0-44ee-bfd6-ce9a648105b8",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
  "created_at": "2026-10-28T15:12:30.267496Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5d49479b-2255-4dfa-9c5c-7c94bfff1a24` → **200**

```json
{
  "id": "5d49479b-2255-4dfa-9c5c-7c94bfff1a24",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
  "created_at": "2026-10-28T15:12:30.659092Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:12:30Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5d49479b-2255-4dfa-9c5c-7c94bfff1a24/cancel` → **200**

```json
{
  "command_id": "44c08b8f-e1da-4f26-bf80-b61953584417",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5d49479b-2255-4dfa-9c5c-7c94bfff1a24",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f7ee1ec5-307d-4d43-9db5-97a419ad8c82",
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
  "created_at": "2026-10-28T15:12:30.659092Z",
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
  "pickup_at": "2026-10-28T18:12:30Z",
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
  "session_id": "27c1c0a1-a472-4ea8-a63c-8ce3abb47c18",
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
  "last_heartbeat_at": "2026-10-28T15:12:28.569176Z",
  "last_location_at": "2026-10-28T15:12:28.569176Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/27c1c0a1-a472-4ea8-a63c-8ce3abb47c18/close` → **200**

```json
{
  "command_id": "2e1ed16b-d1e3-4fc5-aaf6-e415d2b7d646",
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

Done: orders 97709b83-3d40-475e-bd72-b49e38ae6c8d, a212576d-1db0-44ee-bfd6-ce9a648105b8, 5d49479b-2255-4dfa-9c5c-7c94bfff1a24.

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
  "session_id": "3469670e-37da-4707-a864-9b284602c997",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyNTMsImlhdCI6MTc5MzIwMDM1MywianRpIjoiMTk2Y2Q1ZmEtMWNiOC00OWVmLTliYzUtNjk5NGMxMWY0NTA5Iiwic2lkIjoiMzQ2OTY3MGUtMzdkYS00NzA3LWE4NjQtOWIyODQ2MDJjOTk3In0.VeNLLKAW0M3FFUKFVHWGL0TcNQzddcTZZkiAZEjh2Uk",
  "access_expires_at": "2026-10-28T15:27:33.287981651Z",
  "refresh_token": "Zw-Zakzm956qmnPBWOS5vNIPebQBDnALehMM7sYoEtA",
  "refresh_expires_at": "2026-10-29T03:12:33.287611955Z",
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
  "session_id": "14eeb808-8071-449c-b616-6096cd7f9eb8",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyNTMsImlhdCI6MTc5MzIwMDM1MywianRpIjoiY2VlOGMzYzQtODVhMC00YjZjLWFjY2EtNDlmMmVjNWM5NTdhIiwic2lkIjoiMTRlZWI4MDgtODA3MS00NDljLWI2MTYtNjA5NmNkN2Y5ZWI4In0.5f3K41inVpwtidEpRyCcvEzXX9btQIZUBbM_-Gz_aB8",
  "access_expires_at": "2026-10-28T15:27:33.662785125Z",
  "refresh_token": "DZq02tAWgiDH0eeS3FGhQBMHfpwO1fpWO53xWJzcZsM",
  "refresh_expires_at": "2026-10-29T03:12:33.662391162Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-39"
}
```

```json
{
  "challenge_id": "41748abb-6a69-41e7-9544-7724387ea973",
  "expires_at": "2026-10-28T15:17:33.837122561Z",
  "resend_available_at": "2026-10-28T15:12:34.837122561Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "171378",
  "sent_at": "2026-10-28T15:12:33.838785487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41748abb-6a69-41e7-9544-7724387ea973",
  "code": "171378",
  "device_ref": "sandbox-39"
}
```

```json
{
  "session_id": "17edb9b7-6498-487c-8111-3f1f7d4dc851",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTI1NCwiaWF0IjoxNzkzMjAwMzU0LCJqdGkiOiIyMTZjNWE1NS04ODU4LTRmZDMtYmQzYi1hY2E4NDk4ZmEyY2QiLCJzaWQiOiIxN2VkYjliNy02NDk4LTQ4N2MtODExMS0zZjFmN2Q0ZGM4NTEifQ.f6i_sDev-4DJZ_gINSWa_amIIbLq4bV2WiGVLLQ6vP0",
  "access_expires_at": "2026-10-28T15:27:34.031604319Z",
  "refresh_token": "ysk-HNRb4mRAxIhQwxP07a2BbSEw1aJT1XQ_sQe89fM",
  "refresh_expires_at": "2026-11-27T15:12:34.031286261Z",
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
  "command_id": "4888074b-7816-4a20-80ba-b87d92dbf8f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:34Z",
    "sequence": 1793200354361
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81cca178-3451-4702-8ad9-01cf4f025c9f",
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
  "last_heartbeat_at": "2026-10-28T15:12:34.375741Z",
  "last_location_at": "2026-10-28T15:12:34.375741Z",
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
  "command_id": "2fade6a7-ef75-4e69-ab29-d6756c9dd3f3",
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
  "effective_at": "2026-10-28T15:12:34.740745Z",
  "changed_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T15:11:00.58446Z",
  "last_entries": [
    {
      "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:11:00.58446Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c735f2c5-6196-4547-beb9-f7cb46f96b45",
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
  "id": "25538f56-65ea-42c5-a5db-b02613d2737e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:35.095099Z",
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
  "command_id": "07cd96a7-ed36-49d4-a955-89f055567e1f",
  "quote_id": "25538f56-65ea-42c5-a5db-b02613d2737e",
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
    "phone": "+3806711131239"
  }
}
```

```json
{
  "id": "82ff80eb-7ccf-4a23-b232-588ab28f2e8a",
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
  "created_at": "2026-10-28T15:12:35.276924Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131239"
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
    "id": "4638b286-9cf9-428d-a65f-14237c6e7c36",
    "order_id": "82ff80eb-7ccf-4a23-b232-588ab28f2e8a",
    "expires_at": "2026-10-28T15:12:50.279188Z",
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

`POST /api/driver/v1/offers/4638b286-9cf9-428d-a65f-14237c6e7c36/accept` → **200**

```json
{
  "command_id": "34afd165-12a5-473b-b5b6-4e721822a548"
}
```

```json
{
  "id": "5078c687-7b94-4cb9-8e31-8c2fffb40654",
  "order_id": "82ff80eb-7ccf-4a23-b232-588ab28f2e8a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "83d86ea8-c61b-4da1-b7e0-8a2d6c3e2de0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "83d86ea8-c61b-4da1-b7e0-8a2d6c3e2de0",
  "order_id": "82ff80eb-7ccf-4a23-b232-588ab28f2e8a",
  "assignment_id": "5078c687-7b94-4cb9-8e31-8c2fffb40654",
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
    "phone": "+3806711131239"
  }
}
```

`POST /api/driver/v1/work-sessions/81cca178-3451-4702-8ad9-01cf4f025c9f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:12:35Z",
    "sequence": 1793200355966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81cca178-3451-4702-8ad9-01cf4f025c9f",
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
  "last_heartbeat_at": "2026-10-28T15:12:35.981512Z",
  "last_location_at": "2026-10-28T15:12:35.981512Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/83d86ea8-c61b-4da1-b7e0-8a2d6c3e2de0/arrive` → **200**

```json
{
  "command_id": "f3d3a7de-68fc-494c-83f8-78a6306eaf5f",
  "expected_version": 0
}
```

```json
{
  "id": "83d86ea8-c61b-4da1-b7e0-8a2d6c3e2de0",
  "order_id": "82ff80eb-7ccf-4a23-b232-588ab28f2e8a",
  "assignment_id": "5078c687-7b94-4cb9-8e31-8c2fffb40654",
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
  "arrived_at": "2026-10-28T15:12:36.155936Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131239"
  }
}
```

`POST /api/driver/v1/trips/83d86ea8-c61b-4da1-b7e0-8a2d6c3e2de0/start` → **200**

```json
{
  "command_id": "76bf255e-ac25-413c-927a-75b110b13521",
  "expected_version": 1
}
```

```json
{
  "id": "83d86ea8-c61b-4da1-b7e0-8a2d6c3e2de0",
  "order_id": "82ff80eb-7ccf-4a23-b232-588ab28f2e8a",
  "assignment_id": "5078c687-7b94-4cb9-8e31-8c2fffb40654",
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
  "arrived_at": "2026-10-28T15:12:36.155936Z",
  "started_at": "2026-10-28T15:12:36.336694Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131239"
  }
}
```

`POST /api/driver/v1/trips/83d86ea8-c61b-4da1-b7e0-8a2d6c3e2de0/complete` → **200**

```json
{
  "command_id": "d3cf61ec-8603-40b0-8996-0bab24fc5dc0",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:12:36Z",
  "cash_received": true
}
```

```json
{
  "id": "83d86ea8-c61b-4da1-b7e0-8a2d6c3e2de0",
  "order_id": "82ff80eb-7ccf-4a23-b232-588ab28f2e8a",
  "assignment_id": "5078c687-7b94-4cb9-8e31-8c2fffb40654",
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
  "arrived_at": "2026-10-28T15:12:36.155936Z",
  "started_at": "2026-10-28T15:12:36.336694Z",
  "completed_at": "2026-10-28T15:12:36.51525Z",
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
  "command_id": "b9d94dc4-f889-44fa-91cc-34e80714a975",
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
  "id": "4541533c-1928-4c2c-bc28-330007d61ce0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:36.700943Z",
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
  "command_id": "7b8aea5d-f546-4092-ac49-d19b5b886564",
  "quote_id": "4541533c-1928-4c2c-bc28-330007d61ce0",
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
    "phone": "+380671118070"
  }
}
```

```json
{
  "id": "d607c22e-b936-45ae-8563-ff152beb6c2e",
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
  "created_at": "2026-10-28T15:12:36.874125Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118070"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d607c22e-b936-45ae-8563-ff152beb6c2e` → **200**

```json
{
  "id": "d607c22e-b936-45ae-8563-ff152beb6c2e",
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
  "created_at": "2026-10-28T15:12:36.874125Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118070"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d607c22e-b936-45ae-8563-ff152beb6c2e/cancel` → **200**

```json
{
  "command_id": "a18dd4cb-0294-45e5-88de-373d553d201f",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d607c22e-b936-45ae-8563-ff152beb6c2e",
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
  "created_at": "2026-10-28T15:12:36.874125Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118070"
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
  "staff_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T15:11:00.58446Z",
  "last_entries": [
    {
      "order_id": "d607c22e-b936-45ae-8563-ff152beb6c2e",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T15:12:37.24011Z"
    },
    {
      "order_id": "82ff80eb-7ccf-4a23-b232-588ab28f2e8a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T15:12:36.519122Z"
    },
    {
      "order_id": "61c781ea-0b74-49b0-85b2-85575534908b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:11:00.58446Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "81cca178-3451-4702-8ad9-01cf4f025c9f",
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
  "last_heartbeat_at": "2026-10-28T15:12:35.981512Z",
  "last_location_at": "2026-10-28T15:12:35.981512Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81cca178-3451-4702-8ad9-01cf4f025c9f/close` → **200**

```json
{
  "command_id": "79879da1-64c0-48bc-99af-40aa06586cd4",
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

Done: operator bonus for fulfilled 82ff80eb-7ccf-4a23-b232-588ab28f2e8a and operator-fault cancellation d607c22e-b936-45ae-8563-ff152beb6c2e.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674539925",
  "device_ref": "sandbox-14448"
}
```

```json
{
  "challenge_id": "38119f0e-25b4-4b2f-b3fd-5a5f7cff882a",
  "expires_at": "2026-10-28T15:17:39.96654026Z",
  "resend_available_at": "2026-10-28T15:12:40.96654026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674539925` → **200**

```json
{
  "phone": "+380674539925",
  "audience": "CLIENT",
  "code": "093380",
  "sent_at": "2026-10-28T15:12:39.968324407Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671322588",
  "device_ref": "sandbox-3415",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "80d68013-c30d-41d3-9ab8-fd4f5b8d3e9c",
  "expires_at": "2026-10-28T15:17:40.156287763Z",
  "resend_available_at": "2026-10-28T15:12:41.156287763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671322588` → **200**

```json
{
  "phone": "+380671322588",
  "audience": "CLIENT",
  "code": "204752",
  "sent_at": "2026-10-28T15:12:40.157878155Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673330000",
  "device_ref": "sandbox-30963"
}
```

```json
{
  "challenge_id": "8ab1a42d-7855-4088-8af5-52eb249eaa76",
  "expires_at": "2026-10-28T15:17:40.345196702Z",
  "resend_available_at": "2026-10-28T15:12:41.345196702Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673330000` → **200**

```json
{
  "phone": "+380673330000",
  "audience": "CLIENT",
  "code": "746929",
  "sent_at": "2026-10-28T15:12:40.347865745Z",
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
  "session_id": "062dc374-e7b2-4f9a-b19e-aa78a54f0c47",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyNjAsImlhdCI6MTc5MzIwMDM2MCwianRpIjoiZjczMDM1M2UtMmM1NS00MGE0LTlkNjQtOTRmZWIxMTY2YmRiIiwic2lkIjoiMDYyZGMzNzQtZTdiMi00ZjlhLWIxOWUtYWE3OGE1NGYwYzQ3In0.Q6P483xBx8zk0kQtH8cb8OEIUbltAodGckmgYaet8d8",
  "access_expires_at": "2026-10-28T15:27:40.733574282Z",
  "refresh_token": "u22cipEI_s81Xd3f9DAL2pDLPsHxPfp1RZC_dgt0_II",
  "refresh_expires_at": "2026-10-29T03:12:40.733195573Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673330000` → **200**

```json
{
  "deliveries": [
    {
      "id": "e695dfb3-189d-4757-8d18-c52b72bac3c1",
      "challenge_id": "8ab1a42d-7855-4088-8af5-52eb249eaa76",
      "phone": "+380673330000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-02d228c8-282a-4dfb-8374-5c452e9ae4e2",
      "error": null,
      "attempted_at": "2026-10-28T15:12:40.348098Z"
    },
    {
      "id": "06b7d625-1608-42d4-b58b-9874b8857387",
      "challenge_id": "8ab1a42d-7855-4088-8af5-52eb249eaa76",
      "phone": "+380673330000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T15:12:40.347085Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673330000` → **200**

```json
{
  "phone": "+380673330000",
  "audience": "CLIENT",
  "code": "746929",
  "sent_at": "2026-10-28T15:12:40.347865745Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671322588` → **200**

```json
{
  "deliveries": [
    {
      "id": "a74b4121-e052-4633-ab63-c065b10785f0",
      "challenge_id": "80d68013-c30d-41d3-9ab8-fd4f5b8d3e9c",
      "phone": "+380671322588",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-74de069f-f916-49f6-bdbd-2a9b1ba357c6",
      "error": null,
      "attempted_at": "2026-10-28T15:12:40.158112Z"
    }
  ]
}
```

Done: SMS to +380674539925, a call to +380671322588, SMS then a call to +380673330000.

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
  "session_id": "3bbac1ca-6a68-4527-a6ec-3788c7c85a4b",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyNjEsImlhdCI6MTc5MzIwMDM2MSwianRpIjoiOTE2MzVlMzMtOGFlZC00MDM0LWFjZmQtNDhjMWU5M2Y5ODcyIiwic2lkIjoiM2JiYWMxY2EtNmE2OC00NTI3LWE2ZWMtMzc4OGM3Yzg1YTRiIn0.3RMtHzAMNcmqPvlOusHgh1lqs5hDS51cRSNpn9zZ2iw",
  "access_expires_at": "2026-10-28T15:27:41.486605158Z",
  "refresh_token": "HF0Sx40qrwaU2Kta7OJxMvY3WOwjglT0WYms1Jwm-5g",
  "refresh_expires_at": "2026-10-29T03:12:41.486265548Z",
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
  "session_id": "0d92ceaa-0355-45f0-8ef8-a99eb0d48966",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyNjEsImlhdCI6MTc5MzIwMDM2MSwianRpIjoiYmQ0NmM0YjEtNjFjMS00ZGFjLTg3MzYtYWEyY2MzNzlhZDVmIiwic2lkIjoiMGQ5MmNlYWEtMDM1NS00NWYwLThlZjgtYTk5ZWIwZDQ4OTY2In0.R5XKOstq2z6iN0ZyAXS6CdAMRjH56A8WUK1mYwj5VE0",
  "access_expires_at": "2026-10-28T15:27:41.861846612Z",
  "refresh_token": "4YxroPpq8UUkY2ZDu8QMkDRZzvcY8jzKXFlN2jADyVQ",
  "refresh_expires_at": "2026-10-29T03:12:41.861502195Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
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

`POST /api/admin/v1/staff-extensions/7c30b519-e666-4ac6-9ad2-02835faa25ea` → **200**

```json
{
  "command_id": "369eca0b-e4aa-472e-9c1e-35b00b6686dd",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "02cf5b3e-ae4f-4c87-abcf-d6f3b478cec8",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:12:42.589418Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:12:42.589418Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d56358c8-13d8-44a6-a101-5bd7f07224a2",
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
  "id": "e932fddd-d159-4476-a2eb-23f6ae179c1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:17:42.946964Z",
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
  "command_id": "0aab29ea-9e46-433d-a396-37f8559e9766",
  "quote_id": "e932fddd-d159-4476-a2eb-23f6ae179c1c",
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
    "phone": "+380671784870"
  }
}
```

```json
{
  "id": "383a1ded-6233-4b14-a45f-4f90f7ec6f42",
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
  "created_at": "2026-10-28T15:12:43.133256Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671784870"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/383a1ded-6233-4b14-a45f-4f90f7ec6f42/calls` → **201**

```json
{
  "command_id": "9d1e761a-c14c-4193-b0bc-f47fda720887",
  "to": "CALLER"
}
```

```json
{
  "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "order_ids": [
    "383a1ded-6233-4b14-a45f-4f90f7ec6f42"
  ],
  "started_at": "2026-10-28T15:12:43.342466Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/383a1ded-6233-4b14-a45f-4f90f7ec6f42/calls` → **201**

```json
{
  "command_id": "9d1e761a-c14c-4193-b0bc-f47fda720887",
  "to": "CALLER"
}
```

```json
{
  "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "order_ids": [
    "383a1ded-6233-4b14-a45f-4f90f7ec6f42"
  ],
  "started_at": "2026-10-28T15:12:43.342466Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671784870",
    "at": "2026-10-28T15:12:43.344105303Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.17873",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=383a1ded-6233-4b14-a45f-4f90f7ec6f42` → **200**

```json
{
  "calls": [
    {
      "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [
        "383a1ded-6233-4b14-a45f-4f90f7ec6f42"
      ],
      "started_at": "2026-10-28T15:12:43.342466Z",
      "answered_at": "2026-10-28T15:12:43.772731Z",
      "ended_at": "2026-10-28T15:12:43.790768Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=383a1ded-6233-4b14-a45f-4f90f7ec6f42` → **200**

```json
{
  "calls": [
    {
      "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [
        "383a1ded-6233-4b14-a45f-4f90f7ec6f42"
      ],
      "started_at": "2026-10-28T15:12:43.342466Z",
      "answered_at": "2026-10-28T15:12:43.772731Z",
      "ended_at": "2026-10-28T15:12:43.790768Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=383a1ded-6233-4b14-a45f-4f90f7ec6f42` → **200**

```json
{
  "calls": [
    {
      "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [
        "383a1ded-6233-4b14-a45f-4f90f7ec6f42"
      ],
      "started_at": "2026-10-28T15:12:43.342466Z",
      "answered_at": "2026-10-28T15:12:43.772731Z",
      "ended_at": "2026-10-28T15:12:43.790768Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=383a1ded-6233-4b14-a45f-4f90f7ec6f42` → **200**

```json
{
  "calls": [
    {
      "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [
        "383a1ded-6233-4b14-a45f-4f90f7ec6f42"
      ],
      "started_at": "2026-10-28T15:12:43.342466Z",
      "answered_at": "2026-10-28T15:12:43.772731Z",
      "ended_at": "2026-10-28T15:12:43.790768Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=383a1ded-6233-4b14-a45f-4f90f7ec6f42` → **200**

```json
{
  "calls": [
    {
      "id": "7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "order_ids": [
        "383a1ded-6233-4b14-a45f-4f90f7ec6f42"
      ],
      "started_at": "2026-10-28T15:12:43.342466Z",
      "answered_at": "2026-10-28T15:12:43.772731Z",
      "ended_at": "2026-10-28T15:12:43.790768Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:12:51.599652Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/383a1ded-6233-4b14-a45f-4f90f7ec6f42` → **200**

```json
{
  "id": "383a1ded-6233-4b14-a45f-4f90f7ec6f42",
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
  "created_at": "2026-10-28T15:12:43.133256Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671784870"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/383a1ded-6233-4b14-a45f-4f90f7ec6f42/cancel` → **200**

```json
{
  "command_id": "c8fab53a-8d71-4cfd-8dca-b291de4931cb",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "383a1ded-6233-4b14-a45f-4f90f7ec6f42",
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
  "created_at": "2026-10-28T15:12:43.133256Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671784870"
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
  "command_id": "009e7b3b-f78a-45dc-9d53-571c1eda2db3",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T15:12:53.104356Z",
  "extension": "101"
}
```

Done: outgoing call 7cab3cc0-cea6-4ad9-9c2b-b810bd3a525a from order 383a1ded-6233-4b14-a45f-4f90f7ec6f42, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635856012",
  "device_ref": "sandbox-13121"
}
```

```json
{
  "challenge_id": "a0649640-51cb-4ce5-8db2-336096e4eb58",
  "expires_at": "2026-10-28T15:17:53.288834041Z",
  "resend_available_at": "2026-10-28T15:12:54.288834041Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635856012` → **200**

```json
{
  "phone": "+380635856012",
  "audience": "CLIENT",
  "code": "172905",
  "sent_at": "2026-10-28T15:12:53.291305246Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0649640-51cb-4ce5-8db2-336096e4eb58",
  "code": "172905",
  "device_ref": "sandbox-13121"
}
```

```json
{
  "session_id": "fa795396-ab20-4ec8-a7f2-22cb401c5900",
  "subject": {
    "type": "CLIENT",
    "id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWI2NWUwZi1hNTE0LTRkYTctODFlZC1mM2NiYmI0MzBkZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjczLCJpYXQiOjE3OTMyMDAzNzMsImp0aSI6IjE2YTIyZTdjLTI5YTAtNGVjMS05M2E4LTQ5MWY1NjRmNjZiMiIsInNpZCI6ImZhNzk1Mzk2LWFiMjAtNGVjOC1hN2YyLTIyY2I0MDFjNTkwMCJ9._2z_05DfFl65LQ7FrcnEkJAuZCIzdEhdk4v0fHVtZkk",
  "access_expires_at": "2026-10-28T15:27:53.493036557Z",
  "refresh_token": "felLtvqPPCSvi_zjmcYZ-W576xBB541LamSLplW3t-M",
  "refresh_expires_at": "2026-11-27T15:12:53.492398428Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff",
  "session_id": "fa795396-ab20-4ec8-a7f2-22cb401c5900",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635856012",
  "device_ref": "sandbox-8305"
}
```

```json
{
  "challenge_id": "4417ad77-bfed-495c-ae51-10abfa799826",
  "expires_at": "2026-10-28T15:17:55.827335227Z",
  "resend_available_at": "2026-10-28T15:12:56.827335227Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635856012` → **200**

```json
{
  "phone": "+380635856012",
  "audience": "CLIENT",
  "code": "427675",
  "sent_at": "2026-10-28T15:12:55.828878137Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4417ad77-bfed-495c-ae51-10abfa799826",
  "code": "427675",
  "device_ref": "sandbox-8305"
}
```

```json
{
  "session_id": "0e266925-4eb8-494f-8585-5fe81fe16f4b",
  "subject": {
    "type": "CLIENT",
    "id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWI2NWUwZi1hNTE0LTRkYTctODFlZC1mM2NiYmI0MzBkZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjc2LCJpYXQiOjE3OTMyMDAzNzYsImp0aSI6IjNjZjUzMjRlLWRlNzktNDkwNi05MDA1LWUyOGU3MDJlYTllNyIsInNpZCI6IjBlMjY2OTI1LTRlYjgtNDk0Zi04NTg1LTVmZTgxZmUxNmY0YiJ9._F6DBB9giBfW6Yw9rGEkOr3TNo9zMECjrRLdo_UiwkY",
  "access_expires_at": "2026-10-28T15:27:56.027999399Z",
  "refresh_token": "1xED7SmFnreoN8SwtQRVP7GN1Tp58DC9Q-B06YG8Jzw",
  "refresh_expires_at": "2026-11-27T15:12:56.027624195Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "1d364c6d-08c9-4a23-ae5a-57abb07e8ac1",
  "expires_at": "2026-10-28T15:17:58.209776297Z",
  "resend_available_at": "2026-10-28T15:12:59.209776297Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635856012` → **200**

```json
{
  "phone": "+380635856012",
  "audience": "CLIENT",
  "code": "277954",
  "sent_at": "2026-10-28T15:12:58.211139995Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636768059"
}
```

```json
{
  "challenge_id": "71e83146-c8f6-4c08-9b18-6b73702b0f68",
  "expires_at": "2026-10-28T15:17:58.398632861Z",
  "resend_available_at": "2026-10-28T15:12:59.398632861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636768059` → **200**

```json
{
  "phone": "+380636768059",
  "audience": "CLIENT",
  "code": "969379",
  "sent_at": "2026-10-28T15:12:58.400426485Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "56f6629e-9ca4-499c-8504-e89c25f82a09",
  "current_challenge_id": "1d364c6d-08c9-4a23-ae5a-57abb07e8ac1",
  "current_code": "000000",
  "new_challenge_id": "71e83146-c8f6-4c08-9b18-6b73702b0f68",
  "new_code": "969379"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6e3ab877-068d-46ca-9265-19a59959aae2"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "3e1aabb1-ea6a-4dde-9072-eb1cfc4502ff",
  "current_challenge_id": "1d364c6d-08c9-4a23-ae5a-57abb07e8ac1",
  "current_code": "277954",
  "new_challenge_id": "71e83146-c8f6-4c08-9b18-6b73702b0f68",
  "new_code": "969379"
}
```

```json
{
  "subject_id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff",
  "phone": "+380636768059",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff",
  "session_id": "fa795396-ab20-4ec8-a7f2-22cb401c5900",
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
  "correlation_id": "92fec247-a7a0-46fd-ab3f-7a2bb97ac527"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636768059",
  "device_ref": "sandbox-19733"
}
```

```json
{
  "challenge_id": "16d060f6-adec-479f-bf69-673911ff98b3",
  "expires_at": "2026-10-28T15:18:01.298965924Z",
  "resend_available_at": "2026-10-28T15:13:02.298965924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636768059` → **200**

```json
{
  "phone": "+380636768059",
  "audience": "CLIENT",
  "code": "184672",
  "sent_at": "2026-10-28T15:13:01.300767771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16d060f6-adec-479f-bf69-673911ff98b3",
  "code": "184672",
  "device_ref": "sandbox-19733"
}
```

```json
{
  "session_id": "08cf5368-f75b-49dc-8fa7-90aa9eb11d10",
  "subject": {
    "type": "CLIENT",
    "id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWI2NWUwZi1hNTE0LTRkYTctODFlZC1mM2NiYmI0MzBkZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjgxLCJpYXQiOjE3OTMyMDAzODEsImp0aSI6IjQ1Mzc2NzMxLTdlNzgtNGU0ZS04NGUzLWExZWM1M2NlMjU0MyIsInNpZCI6IjA4Y2Y1MzY4LWY3NWItNDlkYy04ZmE3LTkwYWE5ZWIxMWQxMCJ9.ntp56U_M8AObCEwOcNF6KjqYk4jKbqPNvfbRdGdPsBE",
  "access_expires_at": "2026-10-28T15:28:01.503699332Z",
  "refresh_token": "Mc_9jSbmMTkvfN5VzD4zY9Zqbc7i5yr5NSM7vR_K-tY",
  "refresh_expires_at": "2026-11-27T15:13:01.503275311Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff",
  "session_id": "08cf5368-f75b-49dc-8fa7-90aa9eb11d10",
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
  "session_id": "20002e38-893b-4304-ab9e-60b26a0c76e6",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyODIsImlhdCI6MTc5MzIwMDM4MiwianRpIjoiZmRhMTAwNGEtNjg1Ni00NjAwLTk0NjctYjc2MTVhNGMwYmUyIiwic2lkIjoiMjAwMDJlMzgtODkzYi00MzA0LWFiOWUtNjBiMjZhMGM3NmU2In0.gP8FUjzAF4sUxjFoK7rSSlfD_ues5xD9eopEbPJb8t4",
  "access_expires_at": "2026-10-28T15:28:02.089128925Z",
  "refresh_token": "dH8cmfIeGlAdJzTSYLnWkulC5iWPj3tOJ3h-G5zMcsk",
  "refresh_expires_at": "2026-10-29T03:13:02.088784427Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/feb65e0f-a514-4da7-81ed-f3cbbb430dff` → **200**

```json
{
  "client": {
    "id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff",
    "phone": "+380636768059",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:12:53.490812Z",
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

`POST /api/admin/v1/clients/feb65e0f-a514-4da7-81ed-f3cbbb430dff/phone` → **400**

```json
{
  "command_id": "42b25034-71b4-49e1-a553-55bee042a9af",
  "expected_version": 3,
  "phone": "+380637360472",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/feb65e0f-a514-4da7-81ed-f3cbbb430dff/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b2c1bcc5-c511-4dd5-b73c-2a25ea5814b2",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/feb65e0f-a514-4da7-81ed-f3cbbb430dff/phone` → **200**

```json
{
  "command_id": "61d0e0d4-e3ee-478c-9dc7-3b2571313049",
  "expected_version": 3,
  "phone": "+380637360472",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff",
  "phone": "+380637360472",
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
  "correlation_id": "ff3b66ad-8df3-446e-a3fb-9ff0bc67788e"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637360472",
  "device_ref": "sandbox-14963"
}
```

```json
{
  "challenge_id": "6a37a4f8-354e-4413-b4cb-a6790c3a68aa",
  "expires_at": "2026-10-28T15:18:02.999508532Z",
  "resend_available_at": "2026-10-28T15:13:03.999508532Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637360472` → **200**

```json
{
  "phone": "+380637360472",
  "audience": "CLIENT",
  "code": "107137",
  "sent_at": "2026-10-28T15:13:03.001409197Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a37a4f8-354e-4413-b4cb-a6790c3a68aa",
  "code": "107137",
  "device_ref": "sandbox-14963"
}
```

```json
{
  "session_id": "78e2b775-0692-41c0-8fc9-ba4498c7cfe0",
  "subject": {
    "type": "CLIENT",
    "id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWI2NWUwZi1hNTE0LTRkYTctODFlZC1mM2NiYmI0MzBkZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjgzLCJpYXQiOjE3OTMyMDAzODMsImp0aSI6IjQzODljYWY3LTJhZmYtNGIwMy1hN2ZlLTY3YWQyNjkwMjYwZiIsInNpZCI6Ijc4ZTJiNzc1LTA2OTItNDFjMC04ZmM5LWJhNDQ5OGM3Y2ZlMCJ9.oGVshEF7NsazEZVhF0e8_vPHRKoxX9iurfXUPNPbwsg",
  "access_expires_at": "2026-10-28T15:28:03.209120544Z",
  "refresh_token": "CcFmwK1jcoCUch7_MvF24OZvIYU9Aglw0L-gTYtiGlA",
  "refresh_expires_at": "2026-11-27T15:13:03.208724329Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "feb65e0f-a514-4da7-81ed-f3cbbb430dff",
  "session_id": "78e2b775-0692-41c0-8fc9-ba4498c7cfe0",
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
  "phone": "+380639282258",
  "device_ref": "sandbox-13597"
}
```

```json
{
  "challenge_id": "c05d9511-2d25-41a0-b9cd-e3caac0aa384",
  "expires_at": "2026-10-28T15:18:03.562604654Z",
  "resend_available_at": "2026-10-28T15:13:04.562604654Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639282258` → **200**

```json
{
  "phone": "+380639282258",
  "audience": "CLIENT",
  "code": "201299",
  "sent_at": "2026-10-28T15:13:03.564419671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c05d9511-2d25-41a0-b9cd-e3caac0aa384",
  "code": "201299",
  "device_ref": "sandbox-13597"
}
```

```json
{
  "session_id": "7a45d469-5130-4c51-b9f7-0f1884a20e58",
  "subject": {
    "type": "CLIENT",
    "id": "10b8d103-0d72-45fa-a0be-0077fb2823c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMGI4ZDEwMy0wZDcyLTQ1ZmEtYTBiZS0wMDc3ZmIyODIzYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjgzLCJpYXQiOjE3OTMyMDAzODMsImp0aSI6IjIwM2JkYzdlLTVlZTEtNDFhNi1iNGY1LTk2ODBhMmU4NGViYSIsInNpZCI6IjdhNDVkNDY5LTUxMzAtNGM1MS1iOWY3LTBmMTg4NGEyMGU1OCJ9.7J-3pO_rJBBWq6S3Vev-u-1wchCZ4qaqs-5uKWGtvNk",
  "access_expires_at": "2026-10-28T15:28:03.760278733Z",
  "refresh_token": "vsZQ6Ff95cfgTXbsCr1I-hcahpE2ZrE9c-hgCluORrI",
  "refresh_expires_at": "2026-11-27T15:13:03.759882628Z",
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
  "session_id": "bebb5ba5-09e6-40f1-a465-396547696652",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyODQsImlhdCI6MTc5MzIwMDM4NCwianRpIjoiNTMyODE0ZDYtOGQ4ZC00M2EyLTg1MzktODI4ZTZhMjY4YTIxIiwic2lkIjoiYmViYjViYTUtMDllNi00MGYxLWE0NjUtMzk2NTQ3Njk2NjUyIn0.ThBt68GRZ6kpag6Gaueoxzp_HmrRQ3m2b1RkkEYNSJI",
  "access_expires_at": "2026-10-28T15:28:04.544031769Z",
  "refresh_token": "8dfPYABpUA4-SCZSniU-eBX1kBhK5euJn4yccWqKnEk",
  "refresh_expires_at": "2026-10-29T03:13:04.543681572Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639282258` → **200**

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
  "correlation_id": "e7ba7aea-4f1e-484b-925d-3c45ebd13096"
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
  "session_id": "3aaa1126-8648-4323-ac1b-217b13a1054a",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyODUsImlhdCI6MTc5MzIwMDM4NSwianRpIjoiM2VjYzJlZTUtYzFkZC00NDAxLWE1YzAtNzgxYTI2N2M0MzY0Iiwic2lkIjoiM2FhYTExMjYtODY0OC00MzIzLWFjMWItMjE3YjEzYTEwNTRhIn0.GoZLM4fZb5CDNBzOgZ19hFQywWueH8bOuzeqfUMVkK4",
  "access_expires_at": "2026-10-28T15:28:05.313511142Z",
  "refresh_token": "-vfSFe5qD2kmmbrePEnePLPsvNQ4i5qoiP-M_k84Tz8",
  "refresh_expires_at": "2026-10-29T03:13:05.313176229Z",
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
  "command_id": "24ab30c8-5a4f-4693-aeff-e3f13e9c52bd",
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
  "changed_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T15:13:05.685420797Z"
}
```

## The rider books the airport for 2026-10-28T18:13:05Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600102357",
  "device_ref": "sandbox-24480"
}
```

```json
{
  "challenge_id": "567587ab-975d-420d-838f-5e7798bfea3b",
  "expires_at": "2026-10-28T15:18:05.868213522Z",
  "resend_available_at": "2026-10-28T15:13:06.868213522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600102357` → **200**

```json
{
  "phone": "+48600102357",
  "audience": "CLIENT",
  "code": "823676",
  "sent_at": "2026-10-28T15:13:05.869904596Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "567587ab-975d-420d-838f-5e7798bfea3b",
  "code": "823676",
  "device_ref": "sandbox-24480"
}
```

```json
{
  "session_id": "842ecef0-22e7-4605-8b45-c9a9d7f8bfae",
  "subject": {
    "type": "CLIENT",
    "id": "737330b9-506a-46cb-af91-24abf3d3c31c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzczMzBiOS01MDZhLTQ2Y2ItYWY5MS0yNGFiZjNkM2MzMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjg2LCJpYXQiOjE3OTMyMDAzODYsImp0aSI6IjE3MzFjZjU1LTgzODMtNGUxOS05ODY4LTExNmMyYTRjOTI4YSIsInNpZCI6Ijg0MmVjZWYwLTIyZTctNDYwNS04YjQ1LWM5YTlkN2Y4YmZhZSJ9.hLYF5SMj8qu1IPQkUx1Txmz5NeLuKTayiw09HcQ-ojc",
  "access_expires_at": "2026-10-28T15:28:06.064379549Z",
  "refresh_token": "j5JF-ewU8Us1I8b8mfL-13Eq1QSTAzwrhL7mXh1dqZ0",
  "refresh_expires_at": "2026-11-27T15:13:06.063970054Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6067a7d3-9397-4413-bb88-d03e82fd4813",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T18:13:05Z"
}
```

```json
{
  "id": "f8c065f3-e6bc-4cbe-b93f-e5335481fa4f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:18:06.247030Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:13:05Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7f4ec834-884a-461c-b0e4-4299d3d3cfad",
  "quote_id": "f8c065f3-e6bc-4cbe-b93f-e5335481fa4f",
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
  "pickup_at": "2026-10-28T18:13:05Z"
}
```

```json
{
  "id": "a99e3676-066d-4700-ae5d-7c87e8b19078",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "737330b9-506a-46cb-af91-24abf3d3c31c",
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
  "created_at": "2026-10-28T15:13:06.432632Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:13:05Z",
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
  "device_ref": "sandbox-15995"
}
```

```json
{
  "challenge_id": "e3a89ce2-ff74-416f-9ff6-1eb2cc63fd49",
  "expires_at": "2026-10-28T15:18:06.619372056Z",
  "resend_available_at": "2026-10-28T15:13:07.619372056Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "653692",
  "sent_at": "2026-10-28T15:13:06.621219715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3a89ce2-ff74-416f-9ff6-1eb2cc63fd49",
  "code": "653692",
  "device_ref": "sandbox-15995"
}
```

```json
{
  "session_id": "6f24322b-799e-4535-bdb8-21b0b76b2554",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTI4NiwiaWF0IjoxNzkzMjAwMzg2LCJqdGkiOiI4NzNkMmMxNC1hZTliLTRmNWEtYjAzYi0xNGFmZDY5N2Y0YTYiLCJzaWQiOiI2ZjI0MzIyYi03OTllLTQ1MzUtYmRiOC0yMWIwYjc2YjI1NTQifQ.cinzkCY_KcgdTLvH4yo9Cy0eQcembOZlXJHJDUUA4AU",
  "access_expires_at": "2026-10-28T15:28:06.81908547Z",
  "refresh_token": "nZXYSo6Tax4dcJyHA9LWSbnYgFzbyVUmPWUUWrfOeyo",
  "refresh_expires_at": "2026-11-27T15:13:06.818720162Z",
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
  "command_id": "e9898a3a-27ce-49e6-87f5-8207142634bb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:07Z",
    "sequence": 1793200387175
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "97f20b1c-ae43-408d-a81d-72af06972f1c",
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
  "last_heartbeat_at": "2026-10-28T15:13:07.189995Z",
  "last_location_at": "2026-10-28T15:13:07.189995Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "a99e3676-066d-4700-ae5d-7c87e8b19078",
      "short_number": 20,
      "pickup_at": "2026-10-28T18:13:05Z",
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

`POST /api/driver/v1/preorders/a99e3676-066d-4700-ae5d-7c87e8b19078/reserve` → **200**

```json
{
  "command_id": "ef2caec5-abeb-4523-9e34-b97ba90c5dff"
}
```

```json
{
  "id": "ed59f400-47e3-46cb-88fd-011cf3b80e44",
  "state": "RESERVED",
  "order": {
    "order_id": "a99e3676-066d-4700-ae5d-7c87e8b19078",
    "short_number": 20,
    "pickup_at": "2026-10-28T18:13:05Z",
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
  "reserved_at": "2026-10-28T15:13:07.556066Z",
  "confirm_from": "2026-10-28T17:43:05Z",
  "confirm_until": "2026-10-28T17:53:05Z",
  "drop_until": "2026-10-28T17:13:05Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "ed59f400-47e3-46cb-88fd-011cf3b80e44",
      "state": "RESERVED",
      "order": {
        "order_id": "a99e3676-066d-4700-ae5d-7c87e8b19078",
        "short_number": 20,
        "pickup_at": "2026-10-28T18:13:05Z",
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
      "reserved_at": "2026-10-28T15:13:07.556066Z",
      "confirm_from": "2026-10-28T17:43:05Z",
      "confirm_until": "2026-10-28T17:53:05Z",
      "drop_until": "2026-10-28T17:13:05Z"
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
      "id": "ed59f400-47e3-46cb-88fd-011cf3b80e44",
      "state": "RESERVED",
      "order": {
        "order_id": "a99e3676-066d-4700-ae5d-7c87e8b19078",
        "short_number": 20,
        "pickup_at": "2026-10-28T18:13:05Z",
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
      "reserved_at": "2026-10-28T15:13:07.556066Z",
      "confirm_from": "2026-10-28T17:43:05Z",
      "confirm_until": "2026-10-28T17:53:05Z",
      "drop_until": "2026-10-28T17:13:05Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/ed59f400-47e3-46cb-88fd-011cf3b80e44/confirm` → **409**

```json
{
  "command_id": "5ef68ae0-82f8-4895-bf79-f82818a52623"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/ed59f400-47e3-46cb-88fd-011cf3b80e44/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "38bf8691-0748-4980-965f-cb7fe06e9d80"
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
  "session_id": "82b6f19c-ef99-4d64-a0b3-f31a50e1d0ad",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyODgsImlhdCI6MTc5MzIwMDM4OCwianRpIjoiMTRhODdkMDQtMWJhNy00MDM3LTg2NmQtMzNhMTAwMGI1NzVhIiwic2lkIjoiODJiNmYxOWMtZWY5OS00ZDY0LWEwYjMtZjMxYTUwZTFkMGFkIn0.4U1O1LcxdFYbT2qfgGY6D5G6wmjoTjQb4YkH-f_lfS4",
  "access_expires_at": "2026-10-28T15:28:08.492165795Z",
  "refresh_token": "uCbaIcDS6NhYJFmZa57bQj6PL3ET_5BXYJzXsw4lEgU",
  "refresh_expires_at": "2026-10-29T03:13:08.491819986Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a99e3676-066d-4700-ae5d-7c87e8b19078` → **200**

```json
{
  "id": "a99e3676-066d-4700-ae5d-7c87e8b19078",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "737330b9-506a-46cb-af91-24abf3d3c31c",
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
  "created_at": "2026-10-28T15:13:06.432632Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T18:13:05Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "ed59f400-47e3-46cb-88fd-011cf3b80e44",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T15:13:07.556066Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a99e3676-066d-4700-ae5d-7c87e8b19078/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T15:13:06.433478Z",
      "actor": {
        "type": "CLIENT",
        "id": "737330b9-506a-46cb-af91-24abf3d3c31c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "a99e3676-066d-4700-ae5d-7c87e8b19078",
        "preorder": true,
        "quote_id": "f8c065f3-e6bc-4cbe-b93f-e5335481fa4f",
        "pickup_at": "2026-10-28T18:13:05Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "91f91f89-ba3c-4393-9d1c-589b2258bb9d"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T15:13:07.55705Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a99e3676-066d-4700-ae5d-7c87e8b19078",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "ed59f400-47e3-46cb-88fd-011cf3b80e44"
      },
      "correlation_id": "07888491-18bb-4fba-ab32-93bfd6fd5d4e"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order a99e3676-066d-4700-ae5d-7c87e8b19078, reservation ed59f400-47e3-46cb-88fd-011cf3b80e44.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21833"
}
```

```json
{
  "challenge_id": "7fbec0b3-f1eb-4646-ac84-2e2298e0bfa2",
  "expires_at": "2026-10-28T15:18:09.05158181Z",
  "resend_available_at": "2026-10-28T15:13:10.05158181Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "264858",
  "sent_at": "2026-10-28T15:13:09.053733622Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7fbec0b3-f1eb-4646-ac84-2e2298e0bfa2",
  "code": "264858",
  "device_ref": "sandbox-21833"
}
```

```json
{
  "session_id": "3283babc-691d-4cb6-a6a2-6501be463bbc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTI4OSwiaWF0IjoxNzkzMjAwMzg5LCJqdGkiOiJhZjdlMTYzNy1lNTEwLTQ2MWItOWJmMy02NWYwN2UwZDNhYjQiLCJzaWQiOiIzMjgzYmFiYy02OTFkLTRjYjYtYTZhMi02NTAxYmU0NjNiYmMifQ.aZyHKuxjxfZsOKEdW7vLIOaAROsAqgVnhN6mLKoZZQc",
  "access_expires_at": "2026-10-28T15:28:09.25224667Z",
  "refresh_token": "xnrWr-CAVGFjvd1o0TJfXE2sKeyYkgxoXlkVXlMoSPM",
  "refresh_expires_at": "2026-11-27T15:13:09.251879519Z",
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
  "command_id": "7f62083e-199d-4b16-9b85-7d70d281532d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:09Z",
    "sequence": 1793200389598
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec075433-4bdd-40c3-84c8-0f5ab2a0f124",
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
  "last_heartbeat_at": "2026-10-28T15:13:09.613422Z",
  "last_location_at": "2026-10-28T15:13:09.613422Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676643246",
  "device_ref": "sandbox-29199"
}
```

```json
{
  "challenge_id": "0c20f5cd-9945-4e4d-83c8-5dd960389274",
  "expires_at": "2026-10-28T15:18:09.788856199Z",
  "resend_available_at": "2026-10-28T15:13:10.788856199Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676643246` → **200**

```json
{
  "phone": "+380676643246",
  "audience": "CLIENT",
  "code": "712129",
  "sent_at": "2026-10-28T15:13:09.790641871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0c20f5cd-9945-4e4d-83c8-5dd960389274",
  "code": "712129",
  "device_ref": "sandbox-29199"
}
```

```json
{
  "session_id": "56cc1190-4091-4384-a2c9-875191b547de",
  "subject": {
    "type": "CLIENT",
    "id": "724069d2-5f6f-4d82-9937-fb960ba8ff1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjQwNjlkMi01ZjZmLTRkODItOTkzNy1mYjk2MGJhOGZmMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMjg5LCJpYXQiOjE3OTMyMDAzODksImp0aSI6IjRkNWZhNzRhLTAwYmEtNDBjMy1hOGFkLTZkYjM1MDZlNThkMSIsInNpZCI6IjU2Y2MxMTkwLTQwOTEtNDM4NC1hMmM5LTg3NTE5MWI1NDdkZSJ9.FQCwM5I8kmIWFn96KHiZ-Trcf8z_bkoKEyiL94zRSY4",
  "access_expires_at": "2026-10-28T15:28:09.987918341Z",
  "refresh_token": "-iNL2CcVIHoWD_64XJls1ljyhqiwzyT-PxVBtvVZZRc",
  "refresh_expires_at": "2026-11-27T15:13:09.987493324Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82976431-b9ca-471b-9a31-849fe2312b6c",
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
  "id": "063508e6-7d1d-484f-b645-3f2b909367bf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:18:10.165825Z",
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
  "command_id": "fbc61dfe-9fc4-4dba-926c-938f2079a0fa",
  "quote_id": "063508e6-7d1d-484f-b645-3f2b909367bf",
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
  "id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "724069d2-5f6f-4d82-9937-fb960ba8ff1e",
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
  "created_at": "2026-10-28T15:13:10.354732Z",
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
    "id": "2ddbde6f-9f74-4aed-88f5-adb3dbc4067c",
    "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
    "expires_at": "2026-10-28T15:13:25.357182Z",
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

`POST /api/driver/v1/offers/2ddbde6f-9f74-4aed-88f5-adb3dbc4067c/accept` → **200**

```json
{
  "command_id": "136e3cd2-0de5-4b6f-8874-0f8f7128cb68"
}
```

```json
{
  "id": "7316f4e4-5a42-4f27-bd2b-d58921b419ca",
  "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4515f38a-ec8b-4bf2-9893-c4a14cea5c12",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4515f38a-ec8b-4bf2-9893-c4a14cea5c12",
  "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "assignment_id": "7316f4e4-5a42-4f27-bd2b-d58921b419ca",
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

`POST /api/driver/v1/work-sessions/ec075433-4bdd-40c3-84c8-0f5ab2a0f124/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:11Z",
    "sequence": 1793200391653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec075433-4bdd-40c3-84c8-0f5ab2a0f124",
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
  "last_heartbeat_at": "2026-10-28T15:13:11.080767Z",
  "last_location_at": "2026-10-28T15:13:11.080767Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4515f38a-ec8b-4bf2-9893-c4a14cea5c12",
  "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "assignment_id": "7316f4e4-5a42-4f27-bd2b-d58921b419ca",
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

`POST /api/driver/v1/trips/4515f38a-ec8b-4bf2-9893-c4a14cea5c12/arrive` → **200**

```json
{
  "command_id": "3b89d562-f622-4385-96c2-c39f287918c4",
  "expected_version": 0
}
```

```json
{
  "id": "4515f38a-ec8b-4bf2-9893-c4a14cea5c12",
  "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "assignment_id": "7316f4e4-5a42-4f27-bd2b-d58921b419ca",
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
  "arrived_at": "2026-10-28T15:13:11.428185Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4515f38a-ec8b-4bf2-9893-c4a14cea5c12/start` → **200**

```json
{
  "command_id": "62a5ee2d-9381-4a41-99fe-0204da3b2aa1",
  "expected_version": 1
}
```

```json
{
  "id": "4515f38a-ec8b-4bf2-9893-c4a14cea5c12",
  "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "assignment_id": "7316f4e4-5a42-4f27-bd2b-d58921b419ca",
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
  "arrived_at": "2026-10-28T15:13:11.428185Z",
  "started_at": "2026-10-28T15:13:11.621602Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ec075433-4bdd-40c3-84c8-0f5ab2a0f124/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:11Z",
    "sequence": 1793200391795
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec075433-4bdd-40c3-84c8-0f5ab2a0f124",
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
  "last_heartbeat_at": "2026-10-28T15:13:11.810678Z",
  "last_location_at": "2026-10-28T15:13:11.810678Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/4515f38a-ec8b-4bf2-9893-c4a14cea5c12/complete` → **200**

```json
{
  "command_id": "df37b046-3e47-4ef6-9dca-b4649c0646d0",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:13:11Z",
  "cash_received": true
}
```

```json
{
  "id": "4515f38a-ec8b-4bf2-9893-c4a14cea5c12",
  "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "assignment_id": "7316f4e4-5a42-4f27-bd2b-d58921b419ca",
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
  "arrived_at": "2026-10-28T15:13:11.428185Z",
  "started_at": "2026-10-28T15:13:11.621602Z",
  "completed_at": "2026-10-28T15:13:11.982643Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/15cb44c1-a7e5-49d8-8ba9-1d69825da8e6/rating` → **200**

```json
{
  "command_id": "c2c881ce-b9f5-4457-839f-04309640c652",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "score": 5,
  "created_at": "2026-10-28T15:13:12.162993191Z"
}
```

`POST /api/driver/v1/orders/15cb44c1-a7e5-49d8-8ba9-1d69825da8e6/rating` → **200**

```json
{
  "command_id": "a456323c-2793-4bf7-9d5b-7a0fdd05f7a9",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
  "score": 4,
  "created_at": "2026-10-28T15:13:12.339227919Z"
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
  "session_id": "c83177c6-b1f1-4e97-b47b-df23fff7acbd",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyOTIsImlhdCI6MTc5MzIwMDM5MiwianRpIjoiYjIyOTA0MTEtMmFkMi00OGE2LTkyOWYtMzBiYmI5OTk2OGQzIiwic2lkIjoiYzgzMTc3YzYtYjFmMS00ZTk3LWI0N2ItZGYyM2ZmZjdhY2JkIn0.tWNfVMV8JLFpZVV2KVfDeUJ9vdj-KhRU3lMGdxUaNsw",
  "access_expires_at": "2026-10-28T15:28:12.901748685Z",
  "refresh_token": "1QZgvIqxcaV9im8vgMLS-qQkjrFBKOsgp0zWCOfEYMg",
  "refresh_expires_at": "2026-10-29T03:13:12.900605883Z",
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
  "session_id": "8757fcfa-5bd5-4585-b8e7-88a84ad72fbc",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyOTMsImlhdCI6MTc5MzIwMDM5MywianRpIjoiYzU3NmIxNzAtYjEzZC00ZDJmLWE0MTEtMzNjZWM4NTAwMDM1Iiwic2lkIjoiODc1N2ZjZmEtNWJkNS00NTg1LWI4ZTctODhhODRhZDcyZmJjIn0.oPgp3LWKawnsTP95lXEydtNoyZ8Y6HfKICC6AEGvMBE",
  "access_expires_at": "2026-10-28T15:28:13.28408324Z",
  "refresh_token": "ue6g_WNpxX2yA6V26CaArMBsyq5uRik2rVr-DXD0Ej8",
  "refresh_expires_at": "2026-10-29T03:13:13.283766554Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/15cb44c1-a7e5-49d8-8ba9-1d69825da8e6/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
      "author_type": "RIDER",
      "author_id": "724069d2-5f6f-4d82-9937-fb960ba8ff1e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T15:13:12.162993Z"
    },
    {
      "order_id": "15cb44c1-a7e5-49d8-8ba9-1d69825da8e6",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "724069d2-5f6f-4d82-9937-fb960ba8ff1e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T15:13:12.339228Z"
    }
  ]
}
```

Done: ratings for order 15cb44c1-a7e5-49d8-8ba9-1d69825da8e6.

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
  "session_id": "e174f6f2-cc62-4aa8-a120-67ee90787b2f",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEyOTMsImlhdCI6MTc5MzIwMDM5MywianRpIjoiMzdiMDY2OTItNWI1NS00MmIzLTg3ZTItZTZhNmVlOTNjMDUwIiwic2lkIjoiZTE3NGY2ZjItY2M2Mi00YWE4LWExMjAtNjdlZTkwNzg3YjJmIn0.USQjw8U0sRCD6m3sxZVdGTnQRVRFCe0UCjuNmVoUUmU",
  "access_expires_at": "2026-10-28T15:28:13.844920068Z",
  "refresh_token": "w4L2IoSjyHuCBMm3VSpJce6T1N2KzfFx0058OO3JPM4",
  "refresh_expires_at": "2026-10-29T03:13:13.844543252Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a133ddb8-f269-4bb6-b92b-b47c77da95af",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "ac0c428a-f589-4436-8abe-db5346f70482",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:13:14.025779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ac0c428a-f589-4436-8abe-db5346f70482` → **200**

```json
{
  "id": "ac0c428a-f589-4436-8abe-db5346f70482",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:13:14.025779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ac0c428a-f589-4436-8abe-db5346f70482` → **200**

```json
{
  "id": "ac0c428a-f589-4436-8abe-db5346f70482",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:13:14.025779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ac0c428a-f589-4436-8abe-db5346f70482` → **200**

```json
{
  "id": "ac0c428a-f589-4436-8abe-db5346f70482",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:13:14.025779Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ac0c428a-f589-4436-8abe-db5346f70482` → **200**

```json
{
  "id": "ac0c428a-f589-4436-8abe-db5346f70482",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:13:14.025779Z",
  "ready_at": "2026-10-28T15:13:16.625716Z",
  "expires_at": "2026-10-29T15:13:16.625716Z"
}
```

`GET /api/admin/v1/reports/exports/ac0c428a-f589-4436-8abe-db5346f70482/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a5e08ebe-3b89-49b7-a218-fe8942a6e948",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "2353233f-9298-4a7e-b22f-fe64186d1421",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:13:17.938771Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2353233f-9298-4a7e-b22f-fe64186d1421` → **200**

```json
{
  "id": "2353233f-9298-4a7e-b22f-fe64186d1421",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:13:17.938771Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2353233f-9298-4a7e-b22f-fe64186d1421` → **200**

```json
{
  "id": "2353233f-9298-4a7e-b22f-fe64186d1421",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:13:17.938771Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2353233f-9298-4a7e-b22f-fe64186d1421` → **200**

```json
{
  "id": "2353233f-9298-4a7e-b22f-fe64186d1421",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:13:17.938771Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/2353233f-9298-4a7e-b22f-fe64186d1421` → **200**

```json
{
  "id": "2353233f-9298-4a7e-b22f-fe64186d1421",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:13:17.938771Z",
  "ready_at": "2026-10-28T15:13:21.632917Z",
  "expires_at": "2026-10-29T15:13:21.632917Z"
}
```

`GET /api/admin/v1/reports/exports/2353233f-9298-4a7e-b22f-fe64186d1421/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/914e64d7-ffde-47e2-8405-65c86c356711` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/914e64d7-ffde-47e2-8405-65c86c356711",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f44417e3-9269-4709-b520-d1374f26c7ea"
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
  "device_ref": "sandbox-22978"
}
```

```json
{
  "challenge_id": "bc394f35-a652-4074-8437-62afb5372934",
  "expires_at": "2026-10-28T15:18:22.020703286Z",
  "resend_available_at": "2026-10-28T15:13:23.020703286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "060997",
  "sent_at": "2026-10-28T15:13:22.02259539Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc394f35-a652-4074-8437-62afb5372934",
  "code": "060997",
  "device_ref": "sandbox-22978"
}
```

```json
{
  "session_id": "f7a1e987-d020-4782-b56b-1ced65726148",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTMwMiwiaWF0IjoxNzkzMjAwNDAyLCJqdGkiOiI4Y2YzZjZjNS02ZjJhLTQ0M2EtYTc4OS0yYjMzYWQzYjM5ZDciLCJzaWQiOiJmN2ExZTk4Ny1kMDIwLTQ3ODItYjU2Yi0xY2VkNjU3MjYxNDgifQ.sslx2PMXzUcuJlEQmu5hS9paEuxJ1uzertwn5MG77wk",
  "access_expires_at": "2026-10-28T15:28:22.213484276Z",
  "refresh_token": "ETRr_A3UZ8zjhChugXBWNjCBYNb1BAuMbRVfFMqo4UA",
  "refresh_expires_at": "2026-11-27T15:13:22.213171176Z",
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
  "command_id": "730f787c-d988-43d5-9b45-9fa3275d8ae7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:22Z",
    "sequence": 1793200402763
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b07e0c8c-528a-4a6c-ac1f-9fc2e2d36ba1",
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
  "last_heartbeat_at": "2026-10-28T15:13:22.77884Z",
  "last_location_at": "2026-10-28T15:13:22.77884Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "9670059e-80cd-441d-b4eb-3c76ff2b26f1",
  "points": [
    {
      "sequence": 1793200404961,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:12:24Z"
    },
    {
      "sequence": 1793200404967,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:13:24Z"
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
  "session_id": "6b4dcc37-5574-44ed-ad0b-5f2633ed3007",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEzMDUsImlhdCI6MTc5MzIwMDQwNSwianRpIjoiMmRmMmY2Y2UtYmFkMy00Y2VmLWIxYjUtOWVmZjE3NDQ3OTU5Iiwic2lkIjoiNmI0ZGNjMzctNTU3NC00NGVkLWFkMGItNWYyNjMzZWQzMDA3In0.h3vapLBQTbsD1lJfewFdf5vdQiqJbTfYXrf1iJh8-gc",
  "access_expires_at": "2026-10-28T15:28:25.38548014Z",
  "refresh_token": "b4kWYm2ZscI7nuBA--sWNTqz-PzcAvPB4VrvisQqrYA",
  "refresh_expires_at": "2026-10-29T03:13:25.385121922Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "00ae62af-793b-4f8d-9e93-5827306a7f13",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T15:13:24Z",
        "track_point_id": "82146d11-0a39-48f1-a073-9087c19b3061",
        "work_session_id": "b07e0c8c-528a-4a6c-ac1f-9fc2e2d36ba1"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T15:13:24Z",
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

`POST /api/admin/v1/driver-risk-flags/00ae62af-793b-4f8d-9e93-5827306a7f13/confirm` → **200**

```json
{
  "command_id": "687db57f-8960-4980-a6dc-1a32608a9e94",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "00ae62af-793b-4f8d-9e93-5827306a7f13",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T15:13:24Z",
    "track_point_id": "82146d11-0a39-48f1-a073-9087c19b3061",
    "work_session_id": "b07e0c8c-528a-4a6c-ac1f-9fc2e2d36ba1"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T15:13:24Z",
  "reason": null,
  "reviewed_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "reviewed_at": "2026-10-28T15:13:26.005641Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/00ae62af-793b-4f8d-9e93-5827306a7f13/dismiss` → **409**

```json
{
  "command_id": "91fe58be-fe6b-4f8f-8bfb-143392381f9b",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/00ae62af-793b-4f8d-9e93-5827306a7f13/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a10b0195-8693-4038-92e6-cfcd4ea0d746"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "be9cc141-c868-4c48-88cc-9a21c87cafb6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c2ffc307-c233-4334-8afc-c498ca6406ae",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "raised_at": "2026-10-28T15:13:26.367879Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c2ffc307-c233-4334-8afc-c498ca6406ae/dismiss` → **200**

```json
{
  "command_id": "16f931a0-023a-4853-8b0c-4009fc67ff2c",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c2ffc307-c233-4334-8afc-c498ca6406ae",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "raised_at": "2026-10-28T15:13:26.367879Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "reviewed_at": "2026-10-28T15:13:26.548746Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "bfec160f-d180-4d55-810e-4febbf610371",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "00ae62af-793b-4f8d-9e93-5827306a7f13"
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
      "actor_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:13:26.735325Z"
    }
  ]
}
```

Done: flag 00ae62af-793b-4f8d-9e93-5827306a7f13 confirmed, suspension named it, driver reinstated.

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
  "session_id": "4f4e4920-327d-44d7-b524-03af81000b8f",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEzMDcsImlhdCI6MTc5MzIwMDQwNywianRpIjoiM2Q3MDkxN2QtMTc5YS00OGY1LTkxZTYtZDY0MTcwNDQ2YTgwIiwic2lkIjoiNGY0ZTQ5MjAtMzI3ZC00NGQ3LWI1MjQtMDNhZjgxMDAwYjhmIn0.vmSj4rjEyFGCei-QFZEQ3m9aTEE28wDml0Tf1TijOwY",
  "access_expires_at": "2026-10-28T15:28:27.291402005Z",
  "refresh_token": "2qsG4Has6EOUQxEQhhnNZ9ac4WlU7T2_BqNS5P4JrBQ",
  "refresh_expires_at": "2026-10-29T03:13:27.29103946Z",
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
      "actor_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:13:26.735325Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "9290b5cc-8b7c-4265-9c4c-113fbb9de551",
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
  "session_id": "b07e0c8c-528a-4a6c-ac1f-9fc2e2d36ba1",
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
  "last_heartbeat_at": "2026-10-28T15:13:22.77884Z",
  "last_location_at": "2026-10-28T15:13:22.77884Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b07e0c8c-528a-4a6c-ac1f-9fc2e2d36ba1/close` → **200**

```json
{
  "command_id": "f10b8b26-06f2-4cca-b4b1-a1728cf9397f",
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
  "session_id": "2fde3e6b-af50-451b-8c18-aaa9e238c769",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEzMDgsImlhdCI6MTc5MzIwMDQwOCwianRpIjoiMWFjMjExNzItMTM1Yi00ZDg5LTljNWEtM2JjMmMxYmE1MDFlIiwic2lkIjoiMmZkZTNlNmItYWY1MC00NTFiLThjMTgtYWFhOWUyMzhjNzY5In0.GgwSv2Ow_q3GxEjxGRD13Xy-0cdTKRmTgxIKNFUfa_g",
  "access_expires_at": "2026-10-28T15:28:28.417112954Z",
  "refresh_token": "g220Cnp6o2qQHkkhxmL0JPZyoRooe80XPXKfvatAK4U",
  "refresh_expires_at": "2026-10-29T03:13:28.416772182Z",
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
  "command_id": "4ba2afcb-7083-46ac-9e98-f7c1b9dd42fb",
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
  "changed_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:13:28.780363Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "4ba2afcb-7083-46ac-9e98-f7c1b9dd42fb",
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
  "changed_by": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:13:28.780363Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48736404643",
  "device_ref": "sandbox-32645"
}
```

```json
{
  "challenge_id": "69db58b0-275b-4414-a2e4-18a23f4d87e6",
  "expires_at": "2026-10-28T15:18:29.153353186Z",
  "resend_available_at": "2026-10-28T15:13:30.153353186Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48736404643` → **200**

```json
{
  "phone": "+48736404643",
  "audience": "CLIENT",
  "code": "938309",
  "sent_at": "2026-10-28T15:13:29.155299545Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69db58b0-275b-4414-a2e4-18a23f4d87e6",
  "code": "938309",
  "device_ref": "sandbox-32645"
}
```

```json
{
  "session_id": "fbe3d208-d84b-48b8-a612-550e89e6b896",
  "subject": {
    "type": "CLIENT",
    "id": "bf438d3a-d546-4f04-977b-fab1f085e56c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjQzOGQzYS1kNTQ2LTRmMDQtOTc3Yi1mYWIxZjA4NWU1NmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMzA5LCJpYXQiOjE3OTMyMDA0MDksImp0aSI6IjY5MTk2NjAzLTExM2UtNGRjNC1hZTE1LWQ5MTM1OGE5ZjRhNSIsInNpZCI6ImZiZTNkMjA4LWQ4NGItNDhiOC1hNjEyLTU1MGU4OWU2Yjg5NiJ9.c6dB5JoTeusu324wGLgKCoah6wd20KzRuX3HjqhMhog",
  "access_expires_at": "2026-10-28T15:28:29.35046776Z",
  "refresh_token": "RRhinYX7UzVVIa52dskQswC1pIkR4Tlnu-I6fZFCKuw",
  "refresh_expires_at": "2026-11-27T15:13:29.350133482Z",
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
  "correlation_id": "4569c466-8c5b-4dce-b6d1-63245d2996c0"
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
  "device_ref": "sandbox-23283"
}
```

```json
{
  "challenge_id": "75724b23-ac0f-4c0f-a59e-9c6cc57c7e97",
  "expires_at": "2026-10-28T15:18:29.914663603Z",
  "resend_available_at": "2026-10-28T15:13:30.914663603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "785681",
  "sent_at": "2026-10-28T15:13:29.91670896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "75724b23-ac0f-4c0f-a59e-9c6cc57c7e97",
  "code": "785681",
  "device_ref": "sandbox-23283"
}
```

```json
{
  "session_id": "47bec4b6-a8e1-4e9d-895b-48609c1f3658",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTMxMCwiaWF0IjoxNzkzMjAwNDEwLCJqdGkiOiI4MGY0ZjZlMS04YzAxLTQwMzctODdjNy0xODVlZjdkNWEzMjAiLCJzaWQiOiI0N2JlYzRiNi1hOGUxLTRlOWQtODk1Yi00ODYwOWMxZjM2NTgifQ.-vFM7Cx_7YbtJGJVBpLwcbKlaeApKsv7Ltz_LlkDH64",
  "access_expires_at": "2026-10-28T15:28:30.110600895Z",
  "refresh_token": "rIUwjYDS6gJQM3Jjcc-nUIWsV7MkY7bNxYwtUux1Lak",
  "refresh_expires_at": "2026-11-27T15:13:30.110249308Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "97f20b1c-ae43-408d-a81d-72af06972f1c",
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
  "last_heartbeat_at": "2026-10-28T15:13:07.189995Z",
  "last_location_at": "2026-10-28T15:13:07.189995Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/97f20b1c-ae43-408d-a81d-72af06972f1c/handover` → **200**

```json
{
  "command_id": "ef97ae3d-751d-425a-b02c-414779a17ba2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "97f20b1c-ae43-408d-a81d-72af06972f1c",
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
  "last_heartbeat_at": "2026-10-28T15:13:07.189995Z",
  "last_location_at": "2026-10-28T15:13:07.189995Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/97f20b1c-ae43-408d-a81d-72af06972f1c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:30Z",
    "sequence": 1793200410630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "97f20b1c-ae43-408d-a81d-72af06972f1c",
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
  "last_heartbeat_at": "2026-10-28T15:13:30.645051Z",
  "last_location_at": "2026-10-28T15:13:30.645051Z",
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
  "session_id": "97f20b1c-ae43-408d-a81d-72af06972f1c",
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
  "last_heartbeat_at": "2026-10-28T15:13:30.645051Z",
  "last_location_at": "2026-10-28T15:13:30.645051Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/97f20b1c-ae43-408d-a81d-72af06972f1c/close` → **200**

```json
{
  "command_id": "41e42932-5094-4c1c-bf6c-2b5428e71fe1",
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
  "correlation_id": "542714b3-b6dc-4406-a739-ce637c12e489"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673376309",
  "device_ref": "sandbox-14237"
}
```

```json
{
  "challenge_id": "0b540d67-ea4e-4e1e-aebd-2616bbbe1437",
  "expires_at": "2026-10-28T15:18:31.608287689Z",
  "resend_available_at": "2026-10-28T15:13:32.608287689Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673376309` → **200**

```json
{
  "phone": "+380673376309",
  "audience": "CLIENT",
  "code": "018343",
  "sent_at": "2026-10-28T15:13:31.609734854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b540d67-ea4e-4e1e-aebd-2616bbbe1437",
  "code": "018343",
  "device_ref": "sandbox-14237"
}
```

```json
{
  "session_id": "285737cf-d338-4c1e-a48a-47d881a5f22f",
  "subject": {
    "type": "CLIENT",
    "id": "52e4d1a5-6750-4080-99be-e0d0fd266612"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmU0ZDFhNS02NzUwLTQwODAtOTliZS1lMGQwZmQyNjY2MTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMzExLCJpYXQiOjE3OTMyMDA0MTEsImp0aSI6IjQ1ZjllMjYxLTNkY2YtNDBlNy1iN2Y1LTU1Yjg3MTU0NWZhYiIsInNpZCI6IjI4NTczN2NmLWQzMzgtNGMxZS1hNDhhLTQ3ZDg4MWE1ZjIyZiJ9.UemScP-A2_f5P-6dNg4Oqh71aMi-qtfL7Y45RZFMyTo",
  "access_expires_at": "2026-10-28T15:28:31.804863283Z",
  "refresh_token": "xPtLG0LR8r_Dc6BRr-bPUzq4sG_EKjKoAeAKcxZmfOg",
  "refresh_expires_at": "2026-11-27T15:13:31.804498426Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "9b9e84af-0662-4dda-8d1c-1a94098761c7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "1fb088b2-2a32-4602-975a-7340a5d7bd83",
  "upload_path": "/api/rider/v1/uploads/1fb088b2-2a32-4602-975a-7340a5d7bd83",
  "expires_at": "2026-10-28T15:28:31.990017054Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/1fb088b2-2a32-4602-975a-7340a5d7bd83` → **200**

```json
{
  "file_id": "1fb088b2-2a32-4602-975a-7340a5d7bd83",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "6db3a9a8-8cdc-4146-867b-670ef6cd4ff3",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "1fb088b2-2a32-4602-975a-7340a5d7bd83"
  ]
}
```

```json
{
  "id": "9b7a6f46-fa5a-4659-8cda-9c2c3709778c",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "52e4d1a5-6750-4080-99be-e0d0fd266612",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:13:32.197192Z",
  "updated_at": "2026-10-28T15:13:32.197192Z",
  "respond_by": "2026-10-28T19:13:32.197192Z",
  "messages": [
    {
      "id": "0cd658a3-c990-4e97-8715-14776ea1ec89",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "52e4d1a5-6750-4080-99be-e0d0fd266612",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:13:32.198397Z",
      "attachments": [
        {
          "file_id": "1fb088b2-2a32-4602-975a-7340a5d7bd83",
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
  "session_id": "965c5460-7897-43fe-aa51-6fdfd77c7bb3",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEzMTIsImlhdCI6MTc5MzIwMDQxMiwianRpIjoiYmEyMzIxOWEtZWI3NS00NzQ1LWFiM2EtMDgyNTc3ZTdmODkwIiwic2lkIjoiOTY1YzU0NjAtNzg5Ny00M2ZlLWFhNTEtNmZkZmQ3N2M3YmIzIn0.jb2YnkucmIuerAv9kHlJRraYXfOYUDrfykFRe_24_BM",
  "access_expires_at": "2026-10-28T15:28:32.594296333Z",
  "refresh_token": "Ez8nHepLc3BlAoL9b9LzUsTsKtBnrndkzWP75NMbFx4",
  "refresh_expires_at": "2026-10-29T03:13:32.593831585Z",
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
  "session_id": "82b25350-cb79-4e65-a5d9-e25f35a7927d",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEzMTIsImlhdCI6MTc5MzIwMDQxMiwianRpIjoiYTdmZWZkZDgtZDBkYy00YjE2LTk3NjgtZGVmYWFmYmY5OWYwIiwic2lkIjoiODJiMjUzNTAtY2I3OS00ZTY1LWE1ZDktZTI1ZjM1YTc5MjdkIn0.zOW0RWgUE1ZY5llNq5nWcF6VeoGBIn-aQg9MJSZMPds",
  "access_expires_at": "2026-10-28T15:28:32.974206173Z",
  "refresh_token": "ebkMkUNPvDYKoO07g26sbrLHH6SAZq2HdfGRchlKX94",
  "refresh_expires_at": "2026-10-29T03:13:32.973741103Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/9b7a6f46-fa5a-4659-8cda-9c2c3709778c/attachments/1fb088b2-2a32-4602-975a-7340a5d7bd83` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d3535d71-ac7f-4871-bee8-ea1ab5847f3e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "cb6e19f1-5320-4990-8bf8-28fe29ab064f",
  "upload_path": "/api/operator/v1/uploads/cb6e19f1-5320-4990-8bf8-28fe29ab064f",
  "expires_at": "2026-10-28T15:28:33.174573607Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/cb6e19f1-5320-4990-8bf8-28fe29ab064f` → **200**

```json
{
  "file_id": "cb6e19f1-5320-4990-8bf8-28fe29ab064f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/9b7a6f46-fa5a-4659-8cda-9c2c3709778c` → **200**

```json
{
  "id": "9b7a6f46-fa5a-4659-8cda-9c2c3709778c",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "52e4d1a5-6750-4080-99be-e0d0fd266612",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:13:32.197192Z",
  "updated_at": "2026-10-28T15:13:32.197192Z",
  "respond_by": "2026-10-28T19:13:32.197192Z",
  "messages": [
    {
      "id": "0cd658a3-c990-4e97-8715-14776ea1ec89",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "52e4d1a5-6750-4080-99be-e0d0fd266612",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:13:32.198397Z",
      "attachments": [
        {
          "file_id": "1fb088b2-2a32-4602-975a-7340a5d7bd83",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/9b7a6f46-fa5a-4659-8cda-9c2c3709778c/comments` → **200**

```json
{
  "command_id": "22f58237-624a-411b-a20c-214cfe7c8bda",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "cb6e19f1-5320-4990-8bf8-28fe29ab064f"
  ]
}
```

```json
{
  "id": "9b7a6f46-fa5a-4659-8cda-9c2c3709778c",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "52e4d1a5-6750-4080-99be-e0d0fd266612",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:13:32.197192Z",
  "updated_at": "2026-10-28T15:13:33.569829Z",
  "respond_by": "2026-10-28T19:13:32.197192Z",
  "messages": [
    {
      "id": "0cd658a3-c990-4e97-8715-14776ea1ec89",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "52e4d1a5-6750-4080-99be-e0d0fd266612",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:13:32.198397Z",
      "attachments": [
        {
          "file_id": "1fb088b2-2a32-4602-975a-7340a5d7bd83",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "32607f4c-9709-4a11-8e1f-9e054816d259",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:13:33.569486Z",
      "attachments": [
        {
          "file_id": "cb6e19f1-5320-4990-8bf8-28fe29ab064f",
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

`GET /api/rider/v1/support/cases/9b7a6f46-fa5a-4659-8cda-9c2c3709778c` → **200**

```json
{
  "id": "9b7a6f46-fa5a-4659-8cda-9c2c3709778c",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "52e4d1a5-6750-4080-99be-e0d0fd266612",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:13:32.197192Z",
  "updated_at": "2026-10-28T15:13:33.569829Z",
  "respond_by": "2026-10-28T19:13:32.197192Z",
  "messages": [
    {
      "id": "0cd658a3-c990-4e97-8715-14776ea1ec89",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "52e4d1a5-6750-4080-99be-e0d0fd266612",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:13:32.198397Z",
      "attachments": [
        {
          "file_id": "1fb088b2-2a32-4602-975a-7340a5d7bd83",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "32607f4c-9709-4a11-8e1f-9e054816d259",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:13:33.569486Z",
      "attachments": [
        {
          "file_id": "cb6e19f1-5320-4990-8bf8-28fe29ab064f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/9b7a6f46-fa5a-4659-8cda-9c2c3709778c/attachments/cb6e19f1-5320-4990-8bf8-28fe29ab064f` → **200**

Done: support case 9b7a6f46-fa5a-4659-8cda-9c2c3709778c, rider attachment 1fb088b2-2a32-4602-975a-7340a5d7bd83, operator attachment cb6e19f1-5320-4990-8bf8-28fe29ab064f.

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
  "session_id": "e5d3a2f2-b2ac-4ce9-9845-652b197d43c7",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEzMTQsImlhdCI6MTc5MzIwMDQxNCwianRpIjoiMGM0YWNmZDktNWZhYy00YjQ3LWI4Y2QtOTAzOTExNDM4OGQxIiwic2lkIjoiZTVkM2EyZjItYjJhYy00Y2U5LTk4NDUtNjUyYjE5N2Q0M2M3In0.Z0G4D0ViBWD8iN6-hhjZLS5zSn8UReDYbttQI2HeR8o",
  "access_expires_at": "2026-10-28T15:28:34.182059298Z",
  "refresh_token": "B1XcWfS1bmtkCi4xM80CvLfy7hy7V2PKhi7aph4Aoec",
  "refresh_expires_at": "2026-10-29T03:13:34.181696062Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22173"
}
```

```json
{
  "challenge_id": "128e74da-7b61-4a80-af7c-1886a538f16d",
  "expires_at": "2026-10-28T15:18:34.358257287Z",
  "resend_available_at": "2026-10-28T15:13:35.358257287Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "723380",
  "sent_at": "2026-10-28T15:13:34.360627337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "128e74da-7b61-4a80-af7c-1886a538f16d",
  "code": "723380",
  "device_ref": "sandbox-22173"
}
```

```json
{
  "session_id": "138a73a1-fead-4675-9dcc-5d51dd31cbc8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTMxNCwiaWF0IjoxNzkzMjAwNDE0LCJqdGkiOiI2NWJlYTUwYi0wYmIyLTRhZDAtODRmMS0zMTcwOTA3YWZjMTAiLCJzaWQiOiIxMzhhNzNhMS1mZWFkLTQ2NzUtOWRjYy01ZDUxZGQzMWNiYzgifQ.Lt1RqHfuhG4rP1r1Tf4yqTuRk33eZYLqiVxpewownVo",
  "access_expires_at": "2026-10-28T15:28:34.568456735Z",
  "refresh_token": "27CxmhKJAM6MMHoqR6lRkfsQEecvziEmAqengUQo8xA",
  "refresh_expires_at": "2026-11-27T15:13:34.568143013Z",
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
      "actor_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:13:26.735325Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "7c30b519-e666-4ac6-9ad2-02835faa25ea",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T15:13:27.651379Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "5479fb43-4653-4c90-8550-663e3326d7b8",
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
  "device_ref": "sandbox-13798"
}
```

```json
{
  "challenge_id": "2db636a9-07d5-42f6-8f41-49ba8f85d3b9",
  "expires_at": "2026-10-28T15:18:35.295499531Z",
  "resend_available_at": "2026-10-28T15:13:36.295499531Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "329171",
  "sent_at": "2026-10-28T15:13:35.297296906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2db636a9-07d5-42f6-8f41-49ba8f85d3b9",
  "code": "329171",
  "device_ref": "sandbox-13798"
}
```

```json
{
  "session_id": "eb001469-fd54-42ea-a751-676877e71929",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTMxNSwiaWF0IjoxNzkzMjAwNDE1LCJqdGkiOiI1ZDZhMDM1YS1iYmMzLTQ4ZmItYmY5ZC1jMjFmYjYxYjc5YWYiLCJzaWQiOiJlYjAwMTQ2OS1mZDU0LTQyZWEtYTc1MS02NzY4NzdlNzE5MjkifQ.GSUn5_4ZnGjlm2roEB3atERzoPtUP3CW_m3pgGXtvqE",
  "access_expires_at": "2026-10-28T15:28:35.500216345Z",
  "refresh_token": "eUUg9DfnvMB1QwGXrmksqrCqhCpjl6yVPZAFMDwj3Ks",
  "refresh_expires_at": "2026-11-27T15:13:35.49988698Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec075433-4bdd-40c3-84c8-0f5ab2a0f124",
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
  "last_heartbeat_at": "2026-10-28T15:13:11.810678Z",
  "last_location_at": "2026-10-28T15:13:11.810678Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ec075433-4bdd-40c3-84c8-0f5ab2a0f124/handover` → **200**

```json
{
  "command_id": "61cb8154-2409-4dfc-8a80-43be35da36ae",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec075433-4bdd-40c3-84c8-0f5ab2a0f124",
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
  "last_heartbeat_at": "2026-10-28T15:13:11.810678Z",
  "last_location_at": "2026-10-28T15:13:11.810678Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ec075433-4bdd-40c3-84c8-0f5ab2a0f124/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:36Z",
    "sequence": 1793200416388
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec075433-4bdd-40c3-84c8-0f5ab2a0f124",
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
  "last_heartbeat_at": "2026-10-28T15:13:36.054337Z",
  "last_location_at": "2026-10-28T15:13:36.054337Z",
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
  "command_id": "0305a2cb-0518-4fcd-9831-456006403d49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:36Z",
    "sequence": 1793200416406
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "428d331a-3e21-48d6-ab33-b67add5ffe6d",
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
  "last_heartbeat_at": "2026-10-28T15:13:36.421173Z",
  "last_location_at": "2026-10-28T15:13:36.421173Z",
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
  "session_id": "9bfdb95f-db0e-4a3c-9739-8eed62fbe6dd",
  "subject": {
    "type": "STAFF",
    "id": "7c30b519-e666-4ac6-9ad2-02835faa25ea"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzMwYjUxOS1lNjY2LTRhYzYtOWFkMi0wMjgzNWZhYTI1ZWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDEzMTYsImlhdCI6MTc5MzIwMDQxNiwianRpIjoiMTIzMDhjZTQtMTY0Mi00MmVmLWJiZjEtYjQ0NDgwOTVjNDNhIiwic2lkIjoiOWJmZGI5NWYtZGIwZS00YTNjLTk3MzktOGVlZDYyZmJlNmRkIn0.u5sjwRaJfMpiMfzEM8kTiNy4zD-kq86aDNKwgZC-GLc",
  "access_expires_at": "2026-10-28T15:28:36.805354069Z",
  "refresh_token": "k_BKoodQu5-WBoBf0ja5Nakxfkym0hSmxYtvDrolhFk",
  "refresh_expires_at": "2026-10-29T03:13:36.805013468Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "46d4c3f7-cd2a-431d-9220-7a5e8bab64e5",
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
  "id": "13d40d48-ae87-4dd7-9881-16464171f494",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:18:36.982754Z",
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
  "command_id": "7d93f7e9-eee8-4625-8b60-97c57f961f3b",
  "quote_id": "13d40d48-ae87-4dd7-9881-16464171f494",
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
  "id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
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
  "created_at": "2026-10-28T15:13:37.167402Z",
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
    "id": "3b8426aa-7e70-41c6-be03-6a6a1794c3a2",
    "order_id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
    "expires_at": "2026-10-28T15:13:52.169887Z",
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

`POST /api/driver/v1/offers/3b8426aa-7e70-41c6-be03-6a6a1794c3a2/accept` → **200**

```json
{
  "command_id": "5892cc21-e7b5-4752-b5cb-7263d097575d"
}
```

```json
{
  "id": "d3ffd1e5-b82d-4441-b21f-bcaf90723131",
  "order_id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1e661c02-30e9-4b94-8efb-559e65bee2e7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1e661c02-30e9-4b94-8efb-559e65bee2e7",
  "order_id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
  "assignment_id": "d3ffd1e5-b82d-4441-b21f-bcaf90723131",
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

`POST /api/driver/v1/work-sessions/428d331a-3e21-48d6-ab33-b67add5ffe6d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:13:38Z",
    "sequence": 1793200418598
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "428d331a-3e21-48d6-ab33-b67add5ffe6d",
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
  "last_heartbeat_at": "2026-10-28T15:13:38.074869Z",
  "last_location_at": "2026-10-28T15:13:38.074869Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1e661c02-30e9-4b94-8efb-559e65bee2e7/arrive` → **200**

```json
{
  "command_id": "53b8966c-dc52-4f70-8a39-f863c4759167",
  "expected_version": 0
}
```

```json
{
  "id": "1e661c02-30e9-4b94-8efb-559e65bee2e7",
  "order_id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
  "assignment_id": "d3ffd1e5-b82d-4441-b21f-bcaf90723131",
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
  "arrived_at": "2026-10-28T15:13:38.261604Z",
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

`POST /api/driver/v1/trips/1e661c02-30e9-4b94-8efb-559e65bee2e7/start` → **200**

```json
{
  "command_id": "88b8fc9e-cd31-44a3-9dac-02f57134ce9f",
  "expected_version": 1
}
```

```json
{
  "id": "1e661c02-30e9-4b94-8efb-559e65bee2e7",
  "order_id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
  "assignment_id": "d3ffd1e5-b82d-4441-b21f-bcaf90723131",
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
  "arrived_at": "2026-10-28T15:13:38.261604Z",
  "started_at": "2026-10-28T15:13:38.4457Z",
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

`POST /api/driver/v1/trips/1e661c02-30e9-4b94-8efb-559e65bee2e7/complete` → **200**

```json
{
  "command_id": "a5e916b1-d691-4c57-ac55-0fcbf336ba6e",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:13:38Z",
  "cash_received": true
}
```

```json
{
  "id": "1e661c02-30e9-4b94-8efb-559e65bee2e7",
  "order_id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
  "assignment_id": "d3ffd1e5-b82d-4441-b21f-bcaf90723131",
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
  "arrived_at": "2026-10-28T15:13:38.261604Z",
  "started_at": "2026-10-28T15:13:38.4457Z",
  "completed_at": "2026-10-28T15:13:38.637329Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/79657ee1-04a3-4126-9ab9-1806869aa65e` → **200**

```json
{
  "id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
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
    "id": "d3ffd1e5-b82d-4441-b21f-bcaf90723131",
    "order_id": "79657ee1-04a3-4126-9ab9-1806869aa65e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1e661c02-30e9-4b94-8efb-559e65bee2e7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:13:37.167402Z",
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
  "session_id": "ec075433-4bdd-40c3-84c8-0f5ab2a0f124",
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
  "last_heartbeat_at": "2026-10-28T15:13:36.054337Z",
  "last_location_at": "2026-10-28T15:13:36.054337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec075433-4bdd-40c3-84c8-0f5ab2a0f124/close` → **200**

```json
{
  "command_id": "29c32a5f-b07a-4780-930b-298a6ca13aa6",
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
  "session_id": "428d331a-3e21-48d6-ab33-b67add5ffe6d",
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
  "last_heartbeat_at": "2026-10-28T15:13:38.074869Z",
  "last_location_at": "2026-10-28T15:13:38.074869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/428d331a-3e21-48d6-ab33-b67add5ffe6d/close` → **200**

```json
{
  "command_id": "0e43e74b-6ffc-4d6d-86e7-e9b3afa8b753",
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

Done: terminal order 79657ee1-04a3-4126-9ab9-1806869aa65e by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12371"
}
```

```json
{
  "challenge_id": "d8b209cc-0d0a-43fe-9a12-b211256bd8d0",
  "expires_at": "2026-10-28T15:18:42.970836087Z",
  "resend_available_at": "2026-10-28T15:13:43.970836087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "794477",
  "sent_at": "2026-10-28T15:13:42.973084867Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8b209cc-0d0a-43fe-9a12-b211256bd8d0",
  "code": "794477",
  "device_ref": "sandbox-12371"
}
```

```json
{
  "session_id": "812ffbe2-0648-4841-8f6b-b2c2c3043cb8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTMyMywiaWF0IjoxNzkzMjAwNDIzLCJqdGkiOiIwODE4NjM0NC1lZTU0LTQxN2YtOWM2NS02MGEyYmJiM2Q1NmMiLCJzaWQiOiI4MTJmZmJlMi0wNjQ4LTQ4NDEtOGY2Yi1iMmMyYzMwNDNjYjgifQ.xbui9C2xTHlHe8QcttOMS10X4e12BnJ_ZSGo33mENqw",
  "access_expires_at": "2026-10-28T15:28:43.178280149Z",
  "refresh_token": "lvILYtUuYtvaSwHPEs7iVrhXHKopaLkxQ4YG6PK9TW8",
  "refresh_expires_at": "2026-11-27T15:13:43.177793738Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-14282"
}
```

```json
{
  "challenge_id": "dda0b1e1-a185-4111-97ba-7ad31fcc9c9c",
  "expires_at": "2026-10-28T15:18:43.529597786Z",
  "resend_available_at": "2026-10-28T15:13:44.529597786Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "762396",
  "sent_at": "2026-10-28T15:13:43.531274757Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dda0b1e1-a185-4111-97ba-7ad31fcc9c9c",
  "code": "762396",
  "device_ref": "sandbox-14282"
}
```

```json
{
  "session_id": "bc9bfe20-58de-4614-828f-7f77a4c6eb22",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTMyMywiaWF0IjoxNzkzMjAwNDIzLCJqdGkiOiIzYTY2OTgzZi1lMTQ1LTRkYzMtODFhZi03YWUzOTEwZDY5ZGIiLCJzaWQiOiJiYzliZmUyMC01OGRlLTQ2MTQtODI4Zi03Zjc3YTRjNmViMjIifQ.l2sU-APZSNXLL8KO3o97QSJIlbJQDg__pVoZW3rNwJA",
  "access_expires_at": "2026-10-28T15:28:43.72897876Z",
  "refresh_token": "8X8Xa03bhmhMfZC_HZcu4xYd5NvZFoWsk24qR3wA0fE",
  "refresh_expires_at": "2026-11-27T15:13:43.728648644Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18921"
}
```

```json
{
  "challenge_id": "8fea4afd-fc9e-493d-b9eb-5d9f2ad3c2cd",
  "expires_at": "2026-10-28T15:18:44.070250888Z",
  "resend_available_at": "2026-10-28T15:13:45.070250888Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "524692",
  "sent_at": "2026-10-28T15:13:44.072067869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fea4afd-fc9e-493d-b9eb-5d9f2ad3c2cd",
  "code": "524692",
  "device_ref": "sandbox-18921"
}
```

```json
{
  "session_id": "d8050e6f-8146-47fd-9859-512908bc6079",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMTMyNCwiaWF0IjoxNzkzMjAwNDI0LCJqdGkiOiJiNGJhOTc2Zi1jYWMxLTRkOTYtOTE3OS1kZTBjN2YwMWNkZDEiLCJzaWQiOiJkODA1MGU2Zi04MTQ2LTQ3ZmQtOTg1OS01MTI5MDhiYzYwNzkifQ.3VPbls-SBr0h8gUoL5vMCgOSZvId_BMbWDK0HwwhFGc",
  "access_expires_at": "2026-10-28T15:28:44.27252469Z",
  "refresh_token": "1YSAlUSJaVcejYTl8dlqJ20I_rcbT3fCt0g8MCm328Y",
  "refresh_expires_at": "2026-11-27T15:13:44.272162385Z",
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
  "audience": "CLIENT",
  "phone": "+380695820911",
  "device_ref": "sandbox-11217"
}
```

```json
{
  "challenge_id": "b9e2d1e0-2f19-4ba0-91cb-3c99d9d0af58",
  "expires_at": "2026-10-28T15:18:44.615814571Z",
  "resend_available_at": "2026-10-28T15:13:45.615814571Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380695820911` → **200**

```json
{
  "phone": "+380695820911",
  "audience": "CLIENT",
  "code": "803950",
  "sent_at": "2026-10-28T15:13:44.617456522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9e2d1e0-2f19-4ba0-91cb-3c99d9d0af58",
  "code": "803950",
  "device_ref": "sandbox-11217"
}
```

```json
{
  "session_id": "56e92933-02cd-45c5-93d9-328eebb513fb",
  "subject": {
    "type": "CLIENT",
    "id": "3f882ddd-66e8-4769-8301-a637e7825e62"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjg4MmRkZC02NmU4LTQ3NjktODMwMS1hNjM3ZTc4MjVlNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAxMzI0LCJpYXQiOjE3OTMyMDA0MjQsImp0aSI6ImQ0MTNmM2RiLWYxNTYtNDg2Yy1hOTA5LTliZGQ0MTM4ZDZhNSIsInNpZCI6IjU2ZTkyOTMzLTAyY2QtNDVjNS05M2Q5LTMyOGVlYmI1MTNmYiJ9.smY_TeL6hnYXlRbN5DwqCm_s2f6YE0a39dN3c9cetbI",
  "access_expires_at": "2026-10-28T15:28:44.8107504Z",
  "refresh_token": "91X1GcLjUZt3zk8Kt1vh-UKvpiQ75ZwVQmleC9ee02s",
  "refresh_expires_at": "2026-11-27T15:13:44.810402698Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dfcd587c-1ffb-4d8d-b637-864b4be042b8",
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
  "id": "0dc180bd-fde3-4aa4-852a-7a2fb7016f24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:18:44.989169Z",
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
  "command_id": "cffa3fef-9807-4ca9-b305-5bf77346c033",
  "quote_id": "0dc180bd-fde3-4aa4-852a-7a2fb7016f24",
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
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## All eight metrics are non-zero, with closed labels and no ids/phones
Metric validator: good scrape accepted; missing, unknown, id/phone, extra, zero and NaN rejected
{
  "blizz_orders_total": 23,
  "blizz_orders_cancelled_total": 12,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 15,
  "blizz_dispatch_assigned_seconds_count": 14,
  "blizz_offers_total": 17,
  "blizz_dispatch_excluded_total": 6,
  "blizz_sms_sent_total": 62
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 14
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 7.027787207
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 15
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.083533612
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 14.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 15.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 5.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 55.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/0b1f8952-5862-48dd-9069-6a99508861b2` → **200**

```json
{
  "id": "0b1f8952-5862-48dd-9069-6a99508861b2",
  "short_number": 23,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3f882ddd-66e8-4769-8301-a637e7825e62",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-28T15:13:45.177603Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
