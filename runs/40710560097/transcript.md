# Sandbox transcript (2026-10-28T14:55:24Z, 295fd40)

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
  "correlation_id": "47c8ede5-efde-4e26-869c-54534687a567"
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
  "session_id": "7b349d2d-9f25-4a07-a3b3-419f2026c725",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyMzAsImlhdCI6MTc5MzE5OTMzMCwianRpIjoiMGIyNjdlZDAtM2YyYS00YWI2LTllYzktZmMzY2U5YjFiOTk4Iiwic2lkIjoiN2IzNDlkMmQtOWYyNS00YTA3LWEzYjMtNDE5ZjIwMjZjNzI1In0._1qSMaR4ULVKsiXz-09qfYNeFwL9uqmtOHiL8Q9paEQ",
  "access_expires_at": "2026-10-28T15:10:30.777060582Z",
  "refresh_token": "C0LTJN0T1UqKXaE2Jv0ufYWa9msEBkWhidYPoyMZ30I",
  "refresh_expires_at": "2026-10-29T02:55:30.774771985Z",
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
  "session_id": "f0619b34-9ff0-456b-88aa-2d379d21fa20",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyMzEsImlhdCI6MTc5MzE5OTMzMSwianRpIjoiYzE1NTRlZjktZTYwMC00YjE5LWI1NWUtMmI3ZDNjN2JmMjQ3Iiwic2lkIjoiZjA2MTliMzQtOWZmMC00NTZiLTg4YWEtMmQzNzlkMjFmYTIwIn0.VycNaEIOEVIxHSR_AC2j0rXsMGadMsaw7IVMPe3G0P0",
  "access_expires_at": "2026-10-28T15:10:31.98973452Z",
  "refresh_token": "Z6XZCv_l-FTFZ_iYt_KS-bNm0e53bMd10FyrwLLU4Ws",
  "refresh_expires_at": "2026-10-29T02:55:31.988810562Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "8fd3a74a-9485-4c0c-aa0b-aa0bfd390129",
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
  "id": "49351910-19ef-4781-8885-f96880b5ed39",
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
  "created_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "created_at": "2026-10-28T14:55:32.228856Z",
  "updated_at": "2026-10-28T14:55:32.228856Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634658413",
  "device_ref": "sandbox-1903"
}
```

```json
{
  "challenge_id": "1d1c0708-dc81-491a-bb49-deb70506fceb",
  "expires_at": "2026-10-28T15:00:32.464873454Z",
  "resend_available_at": "2026-10-28T14:55:33.464873454Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634658413` → **200**

```json
{
  "phone": "+380634658413",
  "audience": "CLIENT",
  "code": "274887",
  "sent_at": "2026-10-28T14:55:32.473689031Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d1c0708-dc81-491a-bb49-deb70506fceb",
  "code": "274887",
  "device_ref": "sandbox-1903"
}
```

```json
{
  "session_id": "1818b4ae-241b-4154-869f-64b8947b850e",
  "subject": {
    "type": "CLIENT",
    "id": "3475324a-7f6e-42e0-b34f-7be56400f2d2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDc1MzI0YS03ZjZlLTQyZTAtYjM0Zi03YmU1NjQwMGYyZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjMyLCJpYXQiOjE3OTMxOTkzMzIsImp0aSI6ImVhOTE0YTQ3LTU5MDYtNDI4OS04MGRlLWYzZmIxNWEyZmJiMiIsInNpZCI6IjE4MThiNGFlLTI0MWItNDE1NC04NjlmLTY0Yjg5NDdiODUwZSJ9.FvSrfSaBk66Ni3KLVawgdS6VKmiqaa8SOb1Hm_tq7EY",
  "access_expires_at": "2026-10-28T15:10:32.710803303Z",
  "refresh_token": "3A4SLC-oKTWKP89NvMImXBRKqj310XGTul2mFIzowis",
  "refresh_expires_at": "2026-11-27T14:55:32.709780298Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634658413` → **200**

```json
{
  "client_id": "3475324a-7f6e-42e0-b34f-7be56400f2d2"
}
```

`POST /api/admin/v1/rider-wallets/3475324a-7f6e-42e0-b34f-7be56400f2d2/top-ups` → **201**

```json
{
  "command_id": "277a42bb-4f03-4e03-a44a-17907d9db581",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "3475324a-7f6e-42e0-b34f-7be56400f2d2",
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
      "id": "11c3d96f-2481-4992-80a5-be825aad3454",
      "at": "2026-10-28T14:55:33.128746Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f4830369-7c94-4536-8666-6ff910b3cb8c",
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
  "id": "fb66a514-7b50-4705-9258-284e6941190d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:33.521522Z",
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
      "id": "49351910-19ef-4781-8885-f96880b5ed39",
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
  "device_ref": "sandbox-8695"
}
```

```json
{
  "challenge_id": "5b50b563-b33a-406c-beb4-e57fb5a7ff5f",
  "expires_at": "2026-10-28T15:00:33.755349918Z",
  "resend_available_at": "2026-10-28T14:55:34.755349918Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "520961",
  "sent_at": "2026-10-28T14:55:33.759195796Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b50b563-b33a-406c-beb4-e57fb5a7ff5f",
  "code": "520961",
  "device_ref": "sandbox-8695"
}
```

```json
{
  "session_id": "6bbe82a3-24ad-4d8c-b261-7542f38014b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDIzMywiaWF0IjoxNzkzMTk5MzMzLCJqdGkiOiIyYjFkYWM5Zi02YzA3LTQyMWYtYmU2Mi0zOGQ5ZDk3YTU1MTIiLCJzaWQiOiI2YmJlODJhMy0yNGFkLTRkOGMtYjI2MS03NTQyZjM4MDE0YjQifQ.7-q8LlcJZna-tdrG2tEXuBoFN0dym6XjaFMxiwTwfxs",
  "access_expires_at": "2026-10-28T15:10:33.988263826Z",
  "refresh_token": "KDVRGUZB4uEH0wJOQNwqgV-AVCusOAbFPl-sBL1YX7g",
  "refresh_expires_at": "2026-11-27T14:55:33.986983926Z",
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
  "command_id": "187b93b4-381b-4caf-a8f8-d959c5b3d5b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:34Z",
    "sequence": 1793199334384
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4799e8b-c72f-4ae2-a537-de195f3352dc",
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
  "last_heartbeat_at": "2026-10-28T14:55:34.424383Z",
  "last_location_at": "2026-10-28T14:55:34.424383Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7db20975-b7b0-4799-9485-87ae53deb57b",
  "quote_id": "fb66a514-7b50-4705-9258-284e6941190d",
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
  "id": "54d69ea0-4a0c-434c-9007-3cbd4663d180",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3475324a-7f6e-42e0-b34f-7be56400f2d2",
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
  "created_at": "2026-10-28T14:55:34.660544Z",
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
  "client_id": "3475324a-7f6e-42e0-b34f-7be56400f2d2",
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
      "id": "11c3d96f-2481-4992-80a5-be825aad3454",
      "at": "2026-10-28T14:55:33.128746Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
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
    "id": "b91a7541-6892-4eea-875d-af6e170db5ed",
    "order_id": "54d69ea0-4a0c-434c-9007-3cbd4663d180",
    "expires_at": "2026-10-28T14:55:49.672996Z",
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

`POST /api/driver/v1/offers/b91a7541-6892-4eea-875d-af6e170db5ed/accept` → **200**

```json
{
  "command_id": "9a4d6542-4246-4852-801f-dc7894a65145"
}
```

```json
{
  "id": "ac75a587-6e74-48b0-b913-beb10f235d5c",
  "order_id": "54d69ea0-4a0c-434c-9007-3cbd4663d180",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ceb8ae41-531a-4b59-a582-dd3f676f4b41",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ceb8ae41-531a-4b59-a582-dd3f676f4b41",
  "order_id": "54d69ea0-4a0c-434c-9007-3cbd4663d180",
  "assignment_id": "ac75a587-6e74-48b0-b913-beb10f235d5c",
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

`POST /api/driver/v1/work-sessions/a4799e8b-c72f-4ae2-a537-de195f3352dc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:35Z",
    "sequence": 1793199335685
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4799e8b-c72f-4ae2-a537-de195f3352dc",
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
  "last_heartbeat_at": "2026-10-28T14:55:35.707317Z",
  "last_location_at": "2026-10-28T14:55:35.707317Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ceb8ae41-531a-4b59-a582-dd3f676f4b41/arrive` → **200**

```json
{
  "command_id": "8b21f527-90bd-4d04-9811-6111d41c1840",
  "expected_version": 0
}
```

```json
{
  "id": "ceb8ae41-531a-4b59-a582-dd3f676f4b41",
  "order_id": "54d69ea0-4a0c-434c-9007-3cbd4663d180",
  "assignment_id": "ac75a587-6e74-48b0-b913-beb10f235d5c",
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
  "arrived_at": "2026-10-28T14:55:35.919398Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ceb8ae41-531a-4b59-a582-dd3f676f4b41/start` → **200**

```json
{
  "command_id": "1b962f5c-7e80-43f9-902d-1655f4688e6b",
  "expected_version": 1
}
```

```json
{
  "id": "ceb8ae41-531a-4b59-a582-dd3f676f4b41",
  "order_id": "54d69ea0-4a0c-434c-9007-3cbd4663d180",
  "assignment_id": "ac75a587-6e74-48b0-b913-beb10f235d5c",
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
  "arrived_at": "2026-10-28T14:55:35.919398Z",
  "started_at": "2026-10-28T14:55:36.13215Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/ceb8ae41-531a-4b59-a582-dd3f676f4b41/complete` → **200**

```json
{
  "command_id": "05152e1b-5e0c-40dc-a10a-875ff86833f2",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:55:36Z",
  "cash_received": true
}
```

```json
{
  "id": "ceb8ae41-531a-4b59-a582-dd3f676f4b41",
  "order_id": "54d69ea0-4a0c-434c-9007-3cbd4663d180",
  "assignment_id": "ac75a587-6e74-48b0-b913-beb10f235d5c",
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
  "arrived_at": "2026-10-28T14:55:35.919398Z",
  "started_at": "2026-10-28T14:55:36.13215Z",
  "completed_at": "2026-10-28T14:55:36.353448Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3475324a-7f6e-42e0-b34f-7be56400f2d2",
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
      "id": "af81472c-d807-4fd5-bfbb-e22e0de38441",
      "at": "2026-10-28T14:55:36.666101Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "54d69ea0-4a0c-434c-9007-3cbd4663d180"
    },
    {
      "id": "11c3d96f-2481-4992-80a5-be825aad3454",
      "at": "2026-10-28T14:55:33.128746Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/49351910-19ef-4781-8885-f96880b5ed39/archive` → **200**

```json
{
  "command_id": "5404ee27-c09a-4e25-b8de-e1c20054b686",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "49351910-19ef-4781-8885-f96880b5ed39",
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
  "created_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "created_at": "2026-10-28T14:55:32.228856Z",
  "updated_at": "2026-10-28T14:55:39.775457Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a4799e8b-c72f-4ae2-a537-de195f3352dc",
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
  "last_heartbeat_at": "2026-10-28T14:55:35.707317Z",
  "last_location_at": "2026-10-28T14:55:35.707317Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a4799e8b-c72f-4ae2-a537-de195f3352dc/close` → **200**

```json
{
  "command_id": "d6b372c1-3762-4be1-a01a-72900045765c",
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

Done: order 54d69ea0-4a0c-434c-9007-3cbd4663d180.

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
  "session_id": "f91a8a05-81c1-4486-bb6f-9bdaf50b0cfc",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNDAsImlhdCI6MTc5MzE5OTM0MCwianRpIjoiMDY0NDFjYjYtZGUwYy00MDAzLTg5YjgtMDVjNDBiNzExZmFmIiwic2lkIjoiZjkxYThhMDUtODFjMS00NDg2LWJiNmYtOWJkYWY1MGIwY2ZjIn0.5VUpE7n-MO8O6onI3-qA5BYHEUVTer5MHKU_MsstbDw",
  "access_expires_at": "2026-10-28T15:10:40.637650972Z",
  "refresh_token": "MHefLS1Cxh52ZI0Dc21G0rAkZwU_S7fpmlqoksR5imA",
  "refresh_expires_at": "2026-10-29T02:55:40.636750491Z",
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
  "command_id": "95b6e14f-e453-466a-8371-8079f68f1513",
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
  "session_id": "f33ff000-a6fb-42e9-a0ed-7d5125505776",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNDEsImlhdCI6MTc5MzE5OTM0MSwianRpIjoiZjQ1MzI4ZDctMzZjMy00ZGJhLTg3MmUtMmJlMmE3ZTc4MDg0Iiwic2lkIjoiZjMzZmYwMDAtYTZmYi00MmU5LWEwZWQtN2Q1MTI1NTA1Nzc2In0.XSzOXkEVSszMFgEIEd9H37qZEq9xxailbRg0ZEF64XE",
  "access_expires_at": "2026-10-28T15:10:41.516046616Z",
  "refresh_token": "uDUkoqCd-KKl0totx2Pw2OjgeyaLfgVzii-Pel-jD5M",
  "refresh_expires_at": "2026-10-29T02:55:41.515326893Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2616425007",
    "linkedid": "1730052700.2616425007",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677557583"
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
    "id": "1730052700.2616425007",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "314b2220-bd9c-4357-acaf-3b86dee84afe",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677557583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:55:41.706978Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:55:41.730411Z",
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
    "id": "1730052600.2233127123",
    "linkedid": "1730052600.2233127123",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677557583"
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
      "id": "a18a8fcf-592f-486e-aa47-c100162ba2c6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677557583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:55:41.962856Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/a18a8fcf-592f-486e-aa47-c100162ba2c6/answer` → **200**

```json
{
  "command_id": "4f96a49c-3a01-4991-8c78-566d4ccd49f2"
}
```

```json
{
  "id": "a18a8fcf-592f-486e-aa47-c100162ba2c6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677557583",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "order_ids": [],
  "started_at": "2026-10-28T14:55:41.962856Z",
  "answered_at": "2026-10-28T14:55:42.192605Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2233127123",
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
    "id": "1730052600.2233127123",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a18a8fcf-592f-486e-aa47-c100162ba2c6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677557583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:41.962856Z",
      "answered_at": "2026-10-28T14:55:42.192605Z",
      "ended_at": "2026-10-28T14:55:42.40493Z",
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
      "id": "a18a8fcf-592f-486e-aa47-c100162ba2c6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677557583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:41.962856Z",
      "answered_at": "2026-10-28T14:55:42.192605Z",
      "ended_at": "2026-10-28T14:55:42.40493Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:55:43.473157Z"
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
      "id": "a18a8fcf-592f-486e-aa47-c100162ba2c6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677557583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:41.962856Z",
      "answered_at": "2026-10-28T14:55:42.192605Z",
      "ended_at": "2026-10-28T14:55:42.40493Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:55:43.473157Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/a18a8fcf-592f-486e-aa47-c100162ba2c6/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/a18a8fcf-592f-486e-aa47-c100162ba2c6/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=a18a8fcf-592f-486e-aa47-c100162ba2c6` → **200**

```json
{
  "changes": [
    {
      "id": "3bb4cf9b-9592-4b6b-b5f9-4c3cda66bbad",
      "occurred_at": "2026-10-28T14:55:45.089004Z",
      "actor_type": "STAFF",
      "actor_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a18a8fcf-592f-486e-aa47-c100162ba2c6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9dc99948-47a5-4638-8317-56c7b64cd63e\", \"order_ids\": []}",
      "correlation_id": "39b3eeb1-8d6a-40cc-aa05-63d1fb82e000"
    },
    {
      "id": "425892af-29a1-4516-b7ec-2378573173c6",
      "occurred_at": "2026-10-28T14:55:45.060238Z",
      "actor_type": "STAFF",
      "actor_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a18a8fcf-592f-486e-aa47-c100162ba2c6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9dc99948-47a5-4638-8317-56c7b64cd63e\", \"order_ids\": []}",
      "correlation_id": "08384a33-26b3-4894-a8ad-95af6e3b7c88"
    }
  ]
}
```

Done: call a18a8fcf-592f-486e-aa47-c100162ba2c6 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28911"
}
```

```json
{
  "challenge_id": "907b0c33-b37d-4716-96d7-85f823427e55",
  "expires_at": "2026-10-28T15:00:45.335000256Z",
  "resend_available_at": "2026-10-28T14:55:46.335000256Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "539278",
  "sent_at": "2026-10-28T14:55:45.338128872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "907b0c33-b37d-4716-96d7-85f823427e55",
  "code": "539278",
  "device_ref": "sandbox-28911"
}
```

```json
{
  "session_id": "a8579dfc-0ba4-4b9c-bc0d-5f3993f73aae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI0NSwiaWF0IjoxNzkzMTk5MzQ1LCJqdGkiOiJlMzBmZjJjMC0zNzNkLTQyNWMtYmYzZC05NjVkZTNmN2JjZGMiLCJzaWQiOiJhODU3OWRmYy0wYmE0LTRiOWMtYmMwZC01ZjM5OTNmNzNhYWUifQ.x4xEvjRWNz5I2jJYjbqVFojea7D5eX90hli36nx0t9w",
  "access_expires_at": "2026-10-28T15:10:45.828212266Z",
  "refresh_token": "MvfgLwroulKgI0D9Isbk3XTI7uHDCapFTpu6XZ7WJC4",
  "refresh_expires_at": "2026-11-27T14:55:45.827547881Z",
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
  "command_id": "f47b2932-7aea-4f94-a54f-bd62687b5d84",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:46Z",
    "sequence": 1793199346215
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d09b3c2e-1c28-4742-9efd-b5565dd9253e",
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
  "last_heartbeat_at": "2026-10-28T14:55:46.233316Z",
  "last_location_at": "2026-10-28T14:55:46.233316Z",
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
  "session_id": "7f5cb7e1-a0cc-4321-ae5e-0a2d42619aed",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNDYsImlhdCI6MTc5MzE5OTM0NiwianRpIjoiZjNkYWZiMzUtZDg1OC00YWY4LTlkYmUtOTY0ZTNhNTk1N2E1Iiwic2lkIjoiN2Y1Y2I3ZTEtYTBjYy00MzIxLWFlNWUtMGEyZDQyNjE5YWVkIn0.P5FDGdFdnMogThNV9T1Ca-ko-61uZBT0vcdCvB1YaXU",
  "access_expires_at": "2026-10-28T15:10:46.670005596Z",
  "refresh_token": "cva6vPANHx52DkmPaQbVuStA8lavPDwm-PtGhzGMk7U",
  "refresh_expires_at": "2026-10-29T02:55:46.669517936Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bc599d94-3831-4f01-a557-c213a9cd17b8",
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
  "id": "a4e908a3-acc1-48cf-aa39-037331e1e2d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:46.872775Z",
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
  "command_id": "72712715-c910-4c02-b380-59c46ba579e7",
  "quote_id": "a4e908a3-acc1-48cf-aa39-037331e1e2d7",
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
    "phone": "+380670737451"
  }
}
```

```json
{
  "id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
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
  "created_at": "2026-10-28T14:55:47.095728Z",
  "caller": {
    "name": "Олена",
    "phone": "+380670737451"
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
    "id": "97d6ead2-3beb-46bb-a5d0-921c3beeb153",
    "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
    "expires_at": "2026-10-28T14:56:02.100811Z",
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

`POST /api/driver/v1/offers/97d6ead2-3beb-46bb-a5d0-921c3beeb153/accept` → **200**

```json
{
  "command_id": "8f66be17-a87a-4bfe-bbe1-59a1deca23cc"
}
```

```json
{
  "id": "b36d4f5e-2671-49ca-81c4-685afb46c3c6",
  "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "da261d05-bb69-43a3-ac29-8eb150e5227a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[
  {
    "phone": "+380670737451",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:48.61842049Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[
  {
    "phone": "+380670737451",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:48.61842049Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[
  {
    "phone": "+380670737451",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:48.61842049Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "da261d05-bb69-43a3-ac29-8eb150e5227a",
  "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
  "assignment_id": "b36d4f5e-2671-49ca-81c4-685afb46c3c6",
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
    "phone": "+380670737451"
  }
}
```

`POST /api/driver/v1/work-sessions/d09b3c2e-1c28-4742-9efd-b5565dd9253e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:48Z",
    "sequence": 1793199348975
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d09b3c2e-1c28-4742-9efd-b5565dd9253e",
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
  "last_heartbeat_at": "2026-10-28T14:55:48.997383Z",
  "last_location_at": "2026-10-28T14:55:48.997383Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/da261d05-bb69-43a3-ac29-8eb150e5227a/arrive` → **200**

```json
{
  "command_id": "52c0766a-9b4a-400b-849f-2491306656aa",
  "expected_version": 0
}
```

```json
{
  "id": "da261d05-bb69-43a3-ac29-8eb150e5227a",
  "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
  "assignment_id": "b36d4f5e-2671-49ca-81c4-685afb46c3c6",
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
  "arrived_at": "2026-10-28T14:55:49.197051Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670737451"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[
  {
    "phone": "+380670737451",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:48.61842049Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[
  {
    "phone": "+380670737451",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:48.61842049Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[
  {
    "phone": "+380670737451",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:48.61842049Z"
  },
  {
    "phone": "+380670737451",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:50.627149774Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[
  {
    "phone": "+380670737451",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:48.61842049Z"
  },
  {
    "phone": "+380670737451",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:50.627149774Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670737451` → **200**

```json
[
  {
    "phone": "+380670737451",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:48.61842049Z"
  },
  {
    "phone": "+380670737451",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:55:50.627149774Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/da261d05-bb69-43a3-ac29-8eb150e5227a/start` → **200**

```json
{
  "command_id": "55db0878-2c99-4f8f-8546-1b996b23caeb",
  "expected_version": 1
}
```

```json
{
  "id": "da261d05-bb69-43a3-ac29-8eb150e5227a",
  "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
  "assignment_id": "b36d4f5e-2671-49ca-81c4-685afb46c3c6",
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
  "arrived_at": "2026-10-28T14:55:49.197051Z",
  "started_at": "2026-10-28T14:55:51.510614Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670737451"
  }
}
```

`POST /api/driver/v1/trips/da261d05-bb69-43a3-ac29-8eb150e5227a/complete` → **200**

```json
{
  "command_id": "5bdc23bc-239f-4352-8b27-93c5c45eccac",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:55:51Z",
  "cash_received": true
}
```

```json
{
  "id": "da261d05-bb69-43a3-ac29-8eb150e5227a",
  "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
  "assignment_id": "b36d4f5e-2671-49ca-81c4-685afb46c3c6",
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
  "arrived_at": "2026-10-28T14:55:49.197051Z",
  "started_at": "2026-10-28T14:55:51.510614Z",
  "completed_at": "2026-10-28T14:55:51.745306Z",
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
  "session_id": "d09b3c2e-1c28-4742-9efd-b5565dd9253e",
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
  "last_heartbeat_at": "2026-10-28T14:55:48.997383Z",
  "last_location_at": "2026-10-28T14:55:48.997383Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d09b3c2e-1c28-4742-9efd-b5565dd9253e/close` → **200**

```json
{
  "command_id": "bc0d3950-8f66-41a2-86db-4d2eba702d5f",
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
  "phone": "+380631012750",
  "device_ref": "sandbox-10351"
}
```

```json
{
  "challenge_id": "aa2bb90e-5888-4d3b-b5ec-b1da56107323",
  "expires_at": "2026-10-28T15:00:52.364147521Z",
  "resend_available_at": "2026-10-28T14:55:53.364147521Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631012750` → **200**

```json
{
  "phone": "+380631012750",
  "audience": "CLIENT",
  "code": "264514",
  "sent_at": "2026-10-28T14:55:52.367481866Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa2bb90e-5888-4d3b-b5ec-b1da56107323",
  "code": "264514",
  "device_ref": "sandbox-10351"
}
```

```json
{
  "session_id": "300e6c18-0d8f-45c4-bdc3-49b3f9450b0b",
  "subject": {
    "type": "CLIENT",
    "id": "c188e2a8-25be-4474-9859-7c02ee6e1c6e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMTg4ZTJhOC0yNWJlLTQ0NzQtOTg1OS03YzAyZWU2ZTFjNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjUyLCJpYXQiOjE3OTMxOTkzNTIsImp0aSI6Ijc5ZmNkNmE2LTUxMTktNDRlZS04MGI4LWFjNGIwYzI0NmNlYyIsInNpZCI6IjMwMGU2YzE4LTBkOGYtNDVjNC1iZGMzLTQ5YjNmOTQ1MGIwYiJ9.CbFXAUXhz5bqE1wGCfY-t7_bc7JWoNbqjIS_bSMxSWw",
  "access_expires_at": "2026-10-28T15:10:52.575207004Z",
  "refresh_token": "BRCMP9bz-RL2trRfaKClDW3V3s1xTXQqtFkdqlyTlu8",
  "refresh_expires_at": "2026-11-27T14:55:52.574729932Z",
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
  "device_ref": "sandbox-12832"
}
```

```json
{
  "challenge_id": "150de7dd-25b6-4380-8bcb-10026e6036b0",
  "expires_at": "2026-10-28T15:00:52.955969281Z",
  "resend_available_at": "2026-10-28T14:55:53.955969281Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "118035",
  "sent_at": "2026-10-28T14:55:52.959308543Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "150de7dd-25b6-4380-8bcb-10026e6036b0",
  "code": "118035",
  "device_ref": "sandbox-12832"
}
```

```json
{
  "session_id": "4b6d0a4a-fc44-434e-9c51-e20e99e5899a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI1MywiaWF0IjoxNzkzMTk5MzUzLCJqdGkiOiIxNWE5ZmUzNS1mZTVhLTQyOTAtOTQxNS03YzE0ZTQ1NGYyYmUiLCJzaWQiOiI0YjZkMGE0YS1mYzQ0LTQzNGUtOWM1MS1lMjBlOTllNTg5OWEifQ.ARxw5J-QppOQmTzUbbgqUzTv5TJY09L2813NT7Jlvo0",
  "access_expires_at": "2026-10-28T15:10:53.168995277Z",
  "refresh_token": "XCHAOfL8RakV2Yiv6Y7QtOEnQoLIfNCvyrhTl73S8Nk",
  "refresh_expires_at": "2026-11-27T14:55:53.168434668Z",
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
  "session_id": "bedc8aba-45ba-4d5f-ab74-358cfffbd227",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNTMsImlhdCI6MTc5MzE5OTM1MywianRpIjoiNDg5OTAzOWUtYmFiNC00MjFkLWI4NWUtNGE1NTQ1MjczMmVhIiwic2lkIjoiYmVkYzhhYmEtNDViYS00ZDVmLWFiNzQtMzU4Y2ZmZmJkMjI3In0.TRwPez5s80NeSO-gRu2rwaFdtx21vKOUbtB_cFdIpuY",
  "access_expires_at": "2026-10-28T15:10:53.796455133Z",
  "refresh_token": "kHQgjI8ibyHopyqXSuw5EOQSE2-gUnueWZOhpkMYfCo",
  "refresh_expires_at": "2026-10-29T02:55:53.795853367Z",
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
  "session_id": "ddb35736-f4d4-4611-b261-b2f12fd2d880",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNTQsImlhdCI6MTc5MzE5OTM1NCwianRpIjoiNTgzNzI5ZDctMTJiMC00YjQ5LWIyNTUtNzg0YWUwMDVkMmY5Iiwic2lkIjoiZGRiMzU3MzYtZjRkNC00NjExLWIyNjEtYjJmMTJmZDJkODgwIn0.5gcT3hA4INRAyMYAyVeUS2-CKMiYY_o1kwbMKrrmfzA",
  "access_expires_at": "2026-10-28T15:10:54.27272195Z",
  "refresh_token": "chp97Tt_APZanNGUl6T4bIlaTjHr8_t9Pn6iggTRoEE",
  "refresh_expires_at": "2026-10-29T02:55:54.272094297Z",
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
  "command_id": "ebee52f5-68a7-4e93-8cec-6f50c5675c49",
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
  "id": "425eb391-cf05-41ac-a55b-0ca0bf88ff22",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:54.709488Z",
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
  "command_id": "df2c1edf-91d9-4b58-8945-6d30485f7bb3",
  "quote_id": "425eb391-cf05-41ac-a55b-0ca0bf88ff22",
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
  "id": "22d452e3-28f5-46be-b75f-7a18334f577b",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c188e2a8-25be-4474-9859-7c02ee6e1c6e",
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
  "created_at": "2026-10-28T14:55:54.950755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/22d452e3-28f5-46be-b75f-7a18334f577b` → **200**

```json
{
  "id": "22d452e3-28f5-46be-b75f-7a18334f577b",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c188e2a8-25be-4474-9859-7c02ee6e1c6e",
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
  "created_at": "2026-10-28T14:55:54.950755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/22d452e3-28f5-46be-b75f-7a18334f577b/cancel` → **200**

```json
{
  "command_id": "edf0db28-e395-4044-892f-a1599a5d8fbf",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "22d452e3-28f5-46be-b75f-7a18334f577b",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c188e2a8-25be-4474-9859-7c02ee6e1c6e",
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
  "created_at": "2026-10-28T14:55:54.950755Z",
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
  "command_id": "413d1ee6-64fb-4a8a-b471-b52146acb8b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:55Z",
    "sequence": 1793199355788
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "29176b30-407a-4a46-ae11-efa17c9f621b",
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
  "last_heartbeat_at": "2026-10-28T14:55:55.805845Z",
  "last_location_at": "2026-10-28T14:55:55.805845Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19158"
}
```

```json
{
  "challenge_id": "9c668a30-de19-4a5e-a38a-257caa62228c",
  "expires_at": "2026-10-28T15:00:56.001205338Z",
  "resend_available_at": "2026-10-28T14:55:57.001205338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "491597",
  "sent_at": "2026-10-28T14:55:56.005028853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c668a30-de19-4a5e-a38a-257caa62228c",
  "code": "491597",
  "device_ref": "sandbox-19158"
}
```

```json
{
  "session_id": "e093d2f5-e8cd-4a87-84f7-4ce123003e40",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI1NiwiaWF0IjoxNzkzMTk5MzU2LCJqdGkiOiJlYjVkMzY0MC0wMmEzLTQyOGMtYWVkNC1hNTFmN2M4NDYxYjgiLCJzaWQiOiJlMDkzZDJmNS1lOGNkLTRhODctODRmNy00Y2UxMjMwMDNlNDAifQ.ev5KQ2z8_8Ty_Bz7Zu1uGDPtpa0mKYBciPSQvICbhK8",
  "access_expires_at": "2026-10-28T15:10:56.219924673Z",
  "refresh_token": "oaADsQ2YAq6z-0SgsFWIWSbpKPVecsLG8ZZ0z1KL8aQ",
  "refresh_expires_at": "2026-11-27T14:55:56.219252726Z",
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
  "command_id": "14a0ed01-38b5-4c35-b15b-5a262c78195b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:56Z",
    "sequence": 1793199356597
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b792a411-46f6-433c-a7f5-b5b6aa76d552",
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
  "last_heartbeat_at": "2026-10-28T14:55:56.613502Z",
  "last_location_at": "2026-10-28T14:55:56.613502Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f4dd4e6-5538-4f7c-b43d-72420209d244",
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
  "id": "add648bb-c2ce-4272-b666-83029b94f531",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:56.819239Z",
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
  "command_id": "516f90a5-c48d-41ed-b64c-c1e2c29afc64",
  "quote_id": "add648bb-c2ce-4272-b666-83029b94f531",
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
  "id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c188e2a8-25be-4474-9859-7c02ee6e1c6e",
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
  "created_at": "2026-10-28T14:55:57.045037Z",
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
    "id": "f10c4493-b356-4880-b58d-023124355f77",
    "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
    "expires_at": "2026-10-28T14:56:12.050051Z",
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

`POST /api/driver/v1/offers/f10c4493-b356-4880-b58d-023124355f77/accept` → **200**

```json
{
  "command_id": "52eeaea0-1cae-46bc-a787-74f4b6f8f331"
}
```

```json
{
  "id": "c2c8b4fe-1fa3-40e8-867b-16d6e8dccafd",
  "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f9b2318-3af4-4ba5-be28-ae9052860092",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f9b2318-3af4-4ba5-be28-ae9052860092",
  "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
  "assignment_id": "c2c8b4fe-1fa3-40e8-867b-16d6e8dccafd",
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

`POST /api/driver/v1/trips/8f9b2318-3af4-4ba5-be28-ae9052860092/cancel` → **200**

```json
{
  "command_id": "9e3dfe13-ea61-465d-8be8-05bbe31c962d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "8f9b2318-3af4-4ba5-be28-ae9052860092",
  "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
  "assignment_id": "c2c8b4fe-1fa3-40e8-867b-16d6e8dccafd",
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

`GET /api/rider/v1/orders/21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3` → **200**

```json
{
  "id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c188e2a8-25be-4474-9859-7c02ee6e1c6e",
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
    "id": "c2c8b4fe-1fa3-40e8-867b-16d6e8dccafd",
    "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8f9b2318-3af4-4ba5-be28-ae9052860092",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:55:57.045037Z",
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
    "id": "9e6f4b6e-0f37-43d7-9788-a4e95411616c",
    "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
    "expires_at": "2026-10-28T14:56:12.893764Z",
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

`POST /api/driver/v1/offers/9e6f4b6e-0f37-43d7-9788-a4e95411616c/accept` → **200**

```json
{
  "command_id": "bc213d70-0faa-4db3-b6c8-87d37ea47fe4"
}
```

```json
{
  "id": "04dbc3a1-9898-4cda-9982-8000c6c099b6",
  "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c6340432-f1b8-40cc-bc74-e44dde01e568",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c6340432-f1b8-40cc-bc74-e44dde01e568",
  "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
  "assignment_id": "04dbc3a1-9898-4cda-9982-8000c6c099b6",
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

`POST /api/driver/v1/trips/c6340432-f1b8-40cc-bc74-e44dde01e568/cancel` → **200**

```json
{
  "command_id": "332844a6-4719-43de-9e16-40ab9d3c8eb1",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "c6340432-f1b8-40cc-bc74-e44dde01e568",
  "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
  "assignment_id": "04dbc3a1-9898-4cda-9982-8000c6c099b6",
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
    "id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:55:57.045037Z",
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
    "id": "22d452e3-28f5-46be-b75f-7a18334f577b",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:55:54.950755Z",
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

`GET /api/operator/v1/orders/21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:55:57.045942Z",
      "actor": {
        "type": "CLIENT",
        "id": "c188e2a8-25be-4474-9859-7c02ee6e1c6e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
        "quote_id": "add648bb-c2ce-4272-b666-83029b94f531",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "229866bf-79db-477c-9727-ad742cf6c482"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:55:57.048648Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
        "attempt_id": "6c68dd53-837c-4b16-b1ed-bf73affd5e5e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "229866bf-79db-477c-9727-ad742cf6c482"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:55:57.057894Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f10c4493-b356-4880-b58d-023124355f77",
        "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "229866bf-79db-477c-9727-ad742cf6c482"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:55:57.472133Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f10c4493-b356-4880-b58d-023124355f77",
        "order_id": "21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c2c8b4fe-1fa3-40e8-867b-16d6e8dccafd"
      },
      "correlation_id": "10fe8171-6750-400a-b4de-c7df9746c0a6"
```

Done: orders 22d452e3-28f5-46be-b75f-7a18334f577b, 21c6a4fc-82ea-4a92-a4e6-1c2c42bf97c3.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738042786",
  "device_ref": "sandbox-10709"
}
```

```json
{
  "challenge_id": "6918a429-0cf5-47c3-9f6c-db8244e0d38c",
  "expires_at": "2026-10-28T15:00:59.506293922Z",
  "resend_available_at": "2026-10-28T14:56:00.506293922Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738042786` → **200**

```json
{
  "phone": "+380738042786",
  "audience": "CLIENT",
  "code": "418193",
  "sent_at": "2026-10-28T14:55:59.509407714Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6918a429-0cf5-47c3-9f6c-db8244e0d38c",
  "code": "418193",
  "device_ref": "sandbox-10709"
}
```

```json
{
  "session_id": "2fcc8f60-24ce-47d9-9002-18f2d2d6d482",
  "subject": {
    "type": "CLIENT",
    "id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjIyN2JlMS03MWIwLTQzN2QtOWQyYS03YmE3MmZkM2RjOTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjU5LCJpYXQiOjE3OTMxOTkzNTksImp0aSI6IjhiYTQ2MWJhLTVmNDktNGMzYy05NTczLTBjYjlmMzc1YWU1MiIsInNpZCI6IjJmY2M4ZjYwLTI0Y2UtNDdkOS05MDAyLTE4ZjJkMmQ2ZDQ4MiJ9.WxWAgh5zUR2wsDcHFaQBV8Uv1k4ohbcZ_56qhb8sB3w",
  "access_expires_at": "2026-10-28T15:10:59.727438334Z",
  "refresh_token": "yC30LIKEJmByAh7MZb9E4mb8ibAIHsCrMijDNl6F1ek",
  "refresh_expires_at": "2026-11-27T14:55:59.726832995Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b699871b-fc01-427e-8487-80e02276cf63",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1bedd1ba-9337-4883-8200-2b7042de4bff",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1bedd1ba-9337-4883-8200-2b7042de4bff",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "730dba7f15dcff4552b8298ed6a171d9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1bedd1ba-9337-4883-8200-2b7042de4bff",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738042786"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1bedd1ba-9337-4883-8200-2b7042de4bff",
  "expires_at": "2026-10-28T15:25:59.928324Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/1bedd1ba-9337-4883-8200-2b7042de4bff` → **200**

```json
{
  "id": "1bedd1ba-9337-4883-8200-2b7042de4bff",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:25:59.928324Z",
  "card": {
    "id": "4e661c22-2a6f-4753-bf09-8e79c5362396",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3318",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:56:00.142711Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "4e661c22-2a6f-4753-bf09-8e79c5362396",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3318",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:56:00.142711Z"
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
  "device_ref": "sandbox-2300"
}
```

```json
{
  "challenge_id": "a8cdcf74-c98b-4eda-beb3-b0bbf78a8c7d",
  "expires_at": "2026-10-28T15:01:00.546079756Z",
  "resend_available_at": "2026-10-28T14:56:01.546079756Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "379579",
  "sent_at": "2026-10-28T14:56:00.549391167Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8cdcf74-c98b-4eda-beb3-b0bbf78a8c7d",
  "code": "379579",
  "device_ref": "sandbox-2300"
}
```

```json
{
  "session_id": "6f1640ff-ac3c-4d3d-9d06-7eec33af663c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI2MCwiaWF0IjoxNzkzMTk5MzYwLCJqdGkiOiJiMmM5ODE2ZC02MzI4LTRkMDctOGIxNS0xOTZjZDBlNjhkYTQiLCJzaWQiOiI2ZjE2NDBmZi1hYzNjLTRkM2QtOWQwNi03ZWVjMzNhZjY2M2MifQ.iDIjtoXPmVKKFRGzVvxwGEOznF0pn1JN5uC7idBX-Mc",
  "access_expires_at": "2026-10-28T15:11:00.79739431Z",
  "refresh_token": "YDgZqcLBeR5lbTkLOyaXqH6LXGEHtv6OZ1XWxWhl_X4",
  "refresh_expires_at": "2026-11-27T14:56:00.796962957Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b792a411-46f6-433c-a7f5-b5b6aa76d552",
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
  "last_heartbeat_at": "2026-10-28T14:55:56.613502Z",
  "last_location_at": "2026-10-28T14:55:56.613502Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b792a411-46f6-433c-a7f5-b5b6aa76d552/handover` → **200**

```json
{
  "command_id": "5d8fb8c8-af06-4d87-946f-db46c6584813",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b792a411-46f6-433c-a7f5-b5b6aa76d552",
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
  "last_heartbeat_at": "2026-10-28T14:55:56.613502Z",
  "last_location_at": "2026-10-28T14:55:56.613502Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b792a411-46f6-433c-a7f5-b5b6aa76d552/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:01Z",
    "sequence": 1793199361405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b792a411-46f6-433c-a7f5-b5b6aa76d552",
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
  "last_heartbeat_at": "2026-10-28T14:56:01.42214Z",
  "last_location_at": "2026-10-28T14:56:01.42214Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "577f1ff6-01b1-4c0e-81a1-16b25fd6edd7",
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
  "id": "88c111a2-fdb6-4bcd-81d9-6db01a78022c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:01.627613Z",
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
  "command_id": "5b98f9de-dde2-410d-ba2c-75809afe7359",
  "quote_id": "88c111a2-fdb6-4bcd-81d9-6db01a78022c",
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
  "id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
  "created_at": "2026-10-28T14:56:01.839323Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3ebb44cd-ea8d-4676-bacb-40118eb2be68` → **200**

```json
{
  "id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
  "created_at": "2026-10-28T14:56:01.839323Z",
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
    "id": "8f479d28-6e0a-48ad-aea4-7f44960f0149",
    "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
    "expires_at": "2026-10-28T14:56:16.916108Z",
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

`POST /api/driver/v1/offers/8f479d28-6e0a-48ad-aea4-7f44960f0149/accept` → **200**

```json
{
  "command_id": "fdf1f4e6-0e2e-40a5-9ea0-6a80a659038c"
}
```

```json
{
  "id": "bfc56328-7c7f-4d1a-896f-319f81e9c3ff",
  "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e42830e5-d4b7-4f1a-ba8b-624a5ac326cc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e42830e5-d4b7-4f1a-ba8b-624a5ac326cc",
  "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "assignment_id": "bfc56328-7c7f-4d1a-896f-319f81e9c3ff",
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

`POST /api/driver/v1/work-sessions/b792a411-46f6-433c-a7f5-b5b6aa76d552/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:02Z",
    "sequence": 1793199362838
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b792a411-46f6-433c-a7f5-b5b6aa76d552",
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
  "last_heartbeat_at": "2026-10-28T14:56:02.856372Z",
  "last_location_at": "2026-10-28T14:56:02.856372Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e42830e5-d4b7-4f1a-ba8b-624a5ac326cc/arrive` → **200**

```json
{
  "command_id": "d3df6a02-42fd-4f65-8d68-9313ba52d88e",
  "expected_version": 0
}
```

```json
{
  "id": "e42830e5-d4b7-4f1a-ba8b-624a5ac326cc",
  "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "assignment_id": "bfc56328-7c7f-4d1a-896f-319f81e9c3ff",
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
  "arrived_at": "2026-10-28T14:56:03.058172Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e42830e5-d4b7-4f1a-ba8b-624a5ac326cc/start` → **200**

```json
{
  "command_id": "18c7c618-2a78-46d7-b507-ee1e1d6bca65",
  "expected_version": 1
}
```

```json
{
  "id": "e42830e5-d4b7-4f1a-ba8b-624a5ac326cc",
  "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "assignment_id": "bfc56328-7c7f-4d1a-896f-319f81e9c3ff",
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
  "arrived_at": "2026-10-28T14:56:03.058172Z",
  "started_at": "2026-10-28T14:56:03.267222Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e42830e5-d4b7-4f1a-ba8b-624a5ac326cc/complete` → **200**

```json
{
  "command_id": "d2482ab2-394e-4a6a-be0f-e99c5f79175d",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:56:03Z",
  "cash_received": true
}
```

```json
{
  "id": "e42830e5-d4b7-4f1a-ba8b-624a5ac326cc",
  "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "assignment_id": "bfc56328-7c7f-4d1a-896f-319f81e9c3ff",
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
  "arrived_at": "2026-10-28T14:56:03.058172Z",
  "started_at": "2026-10-28T14:56:03.267222Z",
  "completed_at": "2026-10-28T14:56:03.484012Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/3ebb44cd-ea8d-4676-bacb-40118eb2be68` → **200**

```json
{
  "id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
    "id": "bfc56328-7c7f-4d1a-896f-319f81e9c3ff",
    "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e42830e5-d4b7-4f1a-ba8b-624a5ac326cc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:56:01.839323Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3ebb44cd-ea8d-4676-bacb-40118eb2be68` → **200**

```json
{
  "id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
    "id": "bfc56328-7c7f-4d1a-896f-319f81e9c3ff",
    "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e42830e5-d4b7-4f1a-ba8b-624a5ac326cc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:56:01.839323Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3ebb44cd-ea8d-4676-bacb-40118eb2be68` → **200**

```json
{
  "id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
    "id": "bfc56328-7c7f-4d1a-896f-319f81e9c3ff",
    "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e42830e5-d4b7-4f1a-ba8b-624a5ac326cc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:56:01.839323Z",
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
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/3ebb44cd-ea8d-4676-bacb-40118eb2be68/tip` → **200**

```json
{
  "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
  "available_until": "2026-10-29T14:56:03.484012Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/3ebb44cd-ea8d-4676-bacb-40118eb2be68/tip` → **201**

```json
{
  "command_id": "124815bc-6985-4a64-8eda-a8dc7deb7986",
  "amount_minor": 2500
}
```

```json
{
  "id": "9e92f524-fcab-4c0c-850c-74a3f4359b71",
  "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:56:06.904862Z"
}
```

`GET /api/rider/v1/orders/3ebb44cd-ea8d-4676-bacb-40118eb2be68/tip` → **200**

```json
{
  "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
  "available_until": "2026-10-29T14:56:03.484012Z",
  "open": false,
  "tip": {
    "id": "9e92f524-fcab-4c0c-850c-74a3f4359b71",
    "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:56:06.904862Z"
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
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c296d5b2-4914-4757-96d9-d1bca7fbb586",
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
  "id": "3b735b30-4d7b-472b-8242-09a7593d1f55",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:08.717118Z",
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
  "session_id": "b0a764d8-da6d-4828-8bbc-89e535e38f75",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNjksImlhdCI6MTc5MzE5OTM2OSwianRpIjoiNzViNDExMGItNTMwMC00NDRmLThlNDQtOTQ1ZDZhMjZiMjZmIiwic2lkIjoiYjBhNzY0ZDgtZGE2ZC00ODI4LThiYmMtODllNTM1ZTM4Zjc1In0.D5-mjplnsuuhj9-ZhNiKMy0PxHnWwE_l8wgHD9jOudw",
  "access_expires_at": "2026-10-28T15:11:09.159144754Z",
  "refresh_token": "RpnJLScZg2ELgQrJhlv7g7FGEkHQj2ICOOdpMjaKcJg",
  "refresh_expires_at": "2026-10-29T02:56:09.158677048Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738042786` → **200**

```json
{
  "client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93"
}
```

`POST /api/admin/v1/rider-wallets/4f227be1-71b0-437d-9d2a-7ba72fd3dc93/top-ups` → **201**

```json
{
  "command_id": "cf0719cd-7e59-4086-b11b-c138debe450f",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
      "id": "8554c8f8-9559-4454-8498-3243fc56c98b",
      "at": "2026-10-28T14:56:09.571377Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "06586a7a-7e3a-470d-ad5b-fb8cfdebc94b",
  "quote_id": "3b735b30-4d7b-472b-8242-09a7593d1f55",
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
  "id": "f8c0d503-9527-4592-927f-c566c5848491",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
  "created_at": "2026-10-28T14:56:09.796505Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f8c0d503-9527-4592-927f-c566c5848491` → **200**

```json
{
  "id": "f8c0d503-9527-4592-927f-c566c5848491",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
  "created_at": "2026-10-28T14:56:09.796505Z",
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
    "id": "60c6c712-f9b2-4999-9548-1d678fadc765",
    "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
    "expires_at": "2026-10-28T14:56:24.801255Z",
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

`POST /api/driver/v1/offers/60c6c712-f9b2-4999-9548-1d678fadc765/accept` → **200**

```json
{
  "command_id": "dd15b404-05e5-4597-ba62-10b0f1f8dd7d"
}
```

```json
{
  "id": "2b09eb59-2703-45a5-a335-7b74a370efd8",
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "97cbaea5-a9fc-48a6-8ec0-871f4409e214",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "97cbaea5-a9fc-48a6-8ec0-871f4409e214",
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
  "assignment_id": "2b09eb59-2703-45a5-a335-7b74a370efd8",
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

`POST /api/driver/v1/work-sessions/b792a411-46f6-433c-a7f5-b5b6aa76d552/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:10Z",
    "sequence": 1793199370834
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b792a411-46f6-433c-a7f5-b5b6aa76d552",
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
  "last_heartbeat_at": "2026-10-28T14:56:10.851923Z",
  "last_location_at": "2026-10-28T14:56:10.851923Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/97cbaea5-a9fc-48a6-8ec0-871f4409e214/arrive` → **200**

```json
{
  "command_id": "ef0e5a00-35af-4add-93b1-59f8bd1f9c31",
  "expected_version": 0
}
```

```json
{
  "id": "97cbaea5-a9fc-48a6-8ec0-871f4409e214",
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
  "assignment_id": "2b09eb59-2703-45a5-a335-7b74a370efd8",
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
  "arrived_at": "2026-10-28T14:56:11.055761Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/97cbaea5-a9fc-48a6-8ec0-871f4409e214/start` → **200**

```json
{
  "command_id": "d50caed2-af90-4a7b-893c-435612c92e51",
  "expected_version": 1
}
```

```json
{
  "id": "97cbaea5-a9fc-48a6-8ec0-871f4409e214",
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
  "assignment_id": "2b09eb59-2703-45a5-a335-7b74a370efd8",
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
  "arrived_at": "2026-10-28T14:56:11.055761Z",
  "started_at": "2026-10-28T14:56:11.259829Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/97cbaea5-a9fc-48a6-8ec0-871f4409e214/complete` → **200**

```json
{
  "command_id": "2e077044-1c91-449d-b4cb-1c48759a88f6",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:56:11Z",
  "cash_received": true
}
```

```json
{
  "id": "97cbaea5-a9fc-48a6-8ec0-871f4409e214",
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
  "assignment_id": "2b09eb59-2703-45a5-a335-7b74a370efd8",
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
  "arrived_at": "2026-10-28T14:56:11.055761Z",
  "started_at": "2026-10-28T14:56:11.259829Z",
  "completed_at": "2026-10-28T14:56:11.464647Z",
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
  "client_id": "4f227be1-71b0-437d-9d2a-7ba72fd3dc93",
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
      "id": "8554c8f8-9559-4454-8498-3243fc56c98b",
      "at": "2026-10-28T14:56:09.571377Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
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
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/f8c0d503-9527-4592-927f-c566c5848491/tip` → **200**

```json
{
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
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
  "available_until": "2026-10-29T14:56:11.464647Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f8c0d503-9527-4592-927f-c566c5848491/tip` → **201**

```json
{
  "command_id": "e1ad27fb-406e-4389-b67f-1a18cb5d2375",
  "amount_minor": 2500
}
```

```json
{
  "id": "a30bebcd-17ca-4a1d-835b-7e9aab45caf2",
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:56:12.442009Z"
}
```

`GET /api/rider/v1/orders/f8c0d503-9527-4592-927f-c566c5848491/tip` → **200**

```json
{
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
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
  "available_until": "2026-10-29T14:56:11.464647Z",
  "open": false,
  "tip": {
    "id": "a30bebcd-17ca-4a1d-835b-7e9aab45caf2",
    "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:56:12.442009Z"
  }
}
```

`GET /api/rider/v1/orders/f8c0d503-9527-4592-927f-c566c5848491/tip` → **200**

```json
{
  "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
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
  "available_until": "2026-10-29T14:56:11.464647Z",
  "open": false,
  "tip": {
    "id": "a30bebcd-17ca-4a1d-835b-7e9aab45caf2",
    "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:56:12.442009Z"
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
      "id": "36751065-273a-46b0-8a64-465451c62939",
      "at": "2026-10-28T14:56:14.090324Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "51d45b54-a1a2-4f71-a60b-a087462cdcd2",
      "at": "2026-10-28T14:56:12.060265Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f8c0d503-9527-4592-927f-c566c5848491",
      "counterpart_id": null
    },
    {
      "id": "617909a6-f812-416d-ac62-abfc9073552d",
      "at": "2026-10-28T14:56:08.029924Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
      "counterpart_id": null
    },
    {
      "id": "62b897d2-7a5c-4003-b387-ce83b1032795",
      "at": "2026-10-28T14:56:03.968675Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "3ebb44cd-ea8d-4676-bacb-40118eb2be68",
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
  "session_id": "b792a411-46f6-433c-a7f5-b5b6aa76d552",
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
  "last_heartbeat_at": "2026-10-28T14:56:10.851923Z",
  "last_location_at": "2026-10-28T14:56:10.851923Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b792a411-46f6-433c-a7f5-b5b6aa76d552/close` → **200**

```json
{
  "command_id": "e4f43aba-1fd1-4c6f-9f87-d9ac6c749cfe",
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
  "phone": "+380735535162",
  "device_ref": "sandbox-26122"
}
```

```json
{
  "challenge_id": "fe865d94-b0cf-4f44-9f1b-35412d7db366",
  "expires_at": "2026-10-28T15:01:38.36895477Z",
  "resend_available_at": "2026-10-28T14:56:39.36895477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735535162` → **200**

```json
{
  "phone": "+380735535162",
  "audience": "CLIENT",
  "code": "536097",
  "sent_at": "2026-10-28T14:56:38.371709649Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe865d94-b0cf-4f44-9f1b-35412d7db366",
  "code": "536097",
  "device_ref": "sandbox-26122"
}
```

```json
{
  "session_id": "54456625-8e27-4cb6-a637-68d8f4a2f5a7",
  "subject": {
    "type": "CLIENT",
    "id": "9133f169-e0b2-4d12-94a6-209d34cfe481"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTMzZjE2OS1lMGIyLTRkMTItOTRhNi0yMDlkMzRjZmU0ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjk4LCJpYXQiOjE3OTMxOTkzOTgsImp0aSI6ImRkMTkyMDNjLWY3YTItNGNiMy04OTVjLTkwOTlhMzJjMjY3MSIsInNpZCI6IjU0NDU2NjI1LThlMjctNGNiNi1hNjM3LTY4ZDhmNGEyZjVhNyJ9.68pIDAgsAVh-qDgls_ZoWuOQKdaeCpvXB6qg1zc6T4w",
  "access_expires_at": "2026-10-28T15:11:38.585748492Z",
  "refresh_token": "_jF6vGy1d7o2oIuRZwG2Kslz6muYiPZ9fle89Eo9gKo",
  "refresh_expires_at": "2026-11-27T14:56:38.58508489Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "550afeb6-3ca5-43d6-a6f1-5bd3b3a1738c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "e4a52b98-20e8-44e8-858e-6cabe249690a",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e4a52b98-20e8-44e8-858e-6cabe249690a",
    "orderDate": "1793199398",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "67bbffbc410d2c00fd0a9e0e9c40a9cd",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e4a52b98-20e8-44e8-858e-6cabe249690a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735535162"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e4a52b98-20e8-44e8-858e-6cabe249690a",
  "created_at": "2026-10-28T14:56:38.792036Z",
  "expires_at": "2026-10-28T15:26:38.792036Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/e4a52b98-20e8-44e8-858e-6cabe249690a` → **200**

```json
{
  "id": "e4a52b98-20e8-44e8-858e-6cabe249690a",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:56:38.792036Z",
  "expires_at": "2026-10-28T15:26:38.792036Z",
  "completed_at": "2026-10-28T14:56:38.993435Z",
  "masked_pan": "41****7611",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9133f169-e0b2-4d12-94a6-209d34cfe481",
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
      "id": "663f602a-d4f9-4e9f-8873-fcf16cda3e89",
      "at": "2026-10-28T14:56:39.1434Z",
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
  "client_id": "9133f169-e0b2-4d12-94a6-209d34cfe481",
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
      "id": "663f602a-d4f9-4e9f-8873-fcf16cda3e89",
      "at": "2026-10-28T14:56:39.1434Z",
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
  "device_ref": "sandbox-468"
}
```

```json
{
  "challenge_id": "860a0dd1-81d4-4062-a97d-8dd599043dbf",
  "expires_at": "2026-10-28T15:01:39.616600123Z",
  "resend_available_at": "2026-10-28T14:56:40.616600123Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "965160",
  "sent_at": "2026-10-28T14:56:39.619427599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "860a0dd1-81d4-4062-a97d-8dd599043dbf",
  "code": "965160",
  "device_ref": "sandbox-468"
}
```

```json
{
  "session_id": "ede9b20b-6f49-4813-a688-9e8e78664dd1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI5OSwiaWF0IjoxNzkzMTk5Mzk5LCJqdGkiOiI5MTc5ZTBkYS1lNTI2LTRmZmEtYTE0NS02MzQwOTQ0OWY2YTYiLCJzaWQiOiJlZGU5YjIwYi02ZjQ5LTQ4MTMtYTY4OC05ZThlNzg2NjRkZDEifQ.gn0a1wQpnxF0Vj_RXf8ZVlTQn9s2Uow1LohJm1hsWz0",
  "access_expires_at": "2026-10-28T15:11:39.833344689Z",
  "refresh_token": "t2WYxVr0cmjJxJvjt5gIa3RvwgwMnjzBwaqAq6O8DIA",
  "refresh_expires_at": "2026-11-27T14:56:39.832681977Z",
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
  "command_id": "d756fa3d-cb82-4aca-a7da-e2ea15c8adc7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "e94d4998-d1ee-4710-88a6-a96932994106",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e94d4998-d1ee-4710-88a6-a96932994106",
    "orderDate": "1793199400",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "b4eaf03f6912561c01f77d73350acb15",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e94d4998-d1ee-4710-88a6-a96932994106",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e94d4998-d1ee-4710-88a6-a96932994106",
  "created_at": "2026-10-28T14:56:40.207077Z",
  "expires_at": "2026-10-28T15:26:40.207077Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/e94d4998-d1ee-4710-88a6-a96932994106` → **200**

```json
{
  "id": "e94d4998-d1ee-4710-88a6-a96932994106",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:56:40.207077Z",
  "expires_at": "2026-10-28T15:26:40.207077Z",
  "completed_at": "2026-10-28T14:56:40.399946Z",
  "masked_pan": "41****0722",
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
      "id": "09680c12-b116-4cab-b6b8-61fa9f65bec1",
      "at": "2026-10-28T14:56:41.150296Z",
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
  "command_id": "09cda6b9-c209-4afc-b173-316dd1c44bf3",
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
  "correlation_id": "36572e8f-c8ad-41f0-ba88-04cecd77a2ce"
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
  "session_id": "15d48b6e-dce3-4cda-afea-0ca4afd234a6",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMDIsImlhdCI6MTc5MzE5OTQwMiwianRpIjoiOGE5NzQzZWYtOWJlZS00MGIxLWEyMzYtY2Y4YjQwMjc1ZmVlIiwic2lkIjoiMTVkNDhiNmUtZGNlMy00Y2RhLWFmZWEtMGNhNGFmZDIzNGE2In0.BR2TJsJ1OlBVeJvQdst-fiwIKRfQwn6hmhtZkC1X7YU",
  "access_expires_at": "2026-10-28T15:11:42.420069614Z",
  "refresh_token": "2gMWWfkhZuv5uCvyJpDVnL0dF__CXMw4zQhKwBh-oF8",
  "refresh_expires_at": "2026-10-29T02:56:42.41953511Z",
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
  "phone": "+48600309581",
  "device_ref": "sandbox-29411"
}
```

```json
{
  "challenge_id": "779042e9-de79-41c1-8bc9-eb0d44d6d944",
  "expires_at": "2026-10-28T15:01:42.995758642Z",
  "resend_available_at": "2026-10-28T14:56:43.995758642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600309581` → **200**

```json
{
  "phone": "+48600309581",
  "audience": "CLIENT",
  "code": "983778",
  "sent_at": "2026-10-28T14:56:42.997903291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "779042e9-de79-41c1-8bc9-eb0d44d6d944",
  "code": "983778",
  "device_ref": "sandbox-29411"
}
```

```json
{
  "session_id": "3caf083c-7a41-4723-af1d-5c590088bcae",
  "subject": {
    "type": "CLIENT",
    "id": "1fb6abd8-a5b0-4813-b884-9db2cea2821d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmI2YWJkOC1hNWIwLTQ4MTMtYjg4NC05ZGIyY2VhMjgyMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzAzLCJpYXQiOjE3OTMxOTk0MDMsImp0aSI6IjhjMWRkOWI0LWJiZGMtNDM0YS05YmM4LWFlNjA5ZGQ4OTMxZSIsInNpZCI6IjNjYWYwODNjLTdhNDEtNDcyMy1hZjFkLTVjNTkwMDg4YmNhZSJ9.FLFft9It5SkNwrX9xMEviB41LiCJNN4i9Tt9EqXPwVk",
  "access_expires_at": "2026-10-28T15:11:43.205624815Z",
  "refresh_token": "qAk5pt4BOs9bETl0M1OXVfY7GqWkJUbf0VvEIM1jcGw",
  "refresh_expires_at": "2026-11-27T14:56:43.205229651Z",
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
  "command_id": "6384e8dc-e26d-4a88-8571-0a7270a7e256",
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
  "correlation_id": "f32282d9-5e1e-4d42-9967-9457ca3e5bcb",
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
  "command_id": "14f7f3b3-7dde-4170-b7d6-d76a3d83da19",
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
  "paused_at": "2026-10-28T14:56:44.003063702Z",
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
  "command_id": "fd20d882-ff14-47d1-aa30-f6130d86f8d2",
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
  "id": "e95bb6b4-cad4-4bcb-b87b-3745e830c504",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:44.404004Z",
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
  "command_id": "35a083db-1435-4c8f-a3d7-fe19932116f5",
  "quote_id": "e95bb6b4-cad4-4bcb-b87b-3745e830c504",
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
  "correlation_id": "238fd706-ef08-4393-942a-862efb07694e"
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
  "paused_at": "2026-10-28T14:56:44.003064Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "5f5ae9f6-7755-4b5a-a425-3290df4a8cd5",
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
  "command_id": "2a42cff6-2f5c-4031-9807-35776cfaa3b0",
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
  "command_id": "3bb063b8-8a23-42ff-8cb0-81b499916568",
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
  "id": "3b698061-d481-4868-8aae-a0d4932af559",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:45.603401Z",
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
  "command_id": "b2b4113c-9c14-4c3c-900f-056c1e795b0c",
  "quote_id": "3b698061-d481-4868-8aae-a0d4932af559",
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
  "correlation_id": "d6a0cb68-9ee2-45d6-a63d-f26c2dba8ea9"
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
  "command_id": "3559484c-c6c1-4096-9e91-56f920544789",
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
      "from": "17:00",
      "to": "18:00"
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
      "from": "17:00",
      "to": "18:00"
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
  "command_id": "24ed2458-903b-4a57-a84d-242eacabd543",
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
  "id": "b4c3f1a3-c230-4fa8-aecf-58727da5c54b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:46.403728Z",
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
  "command_id": "a2031bac-38f0-4130-85a5-c38069b3ab3f",
  "quote_id": "b4c3f1a3-c230-4fa8-aecf-58727da5c54b",
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
  "correlation_id": "99d79116-5fd2-4663-b008-d76de32cb6cc"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "23bdb95e-4591-4de5-92cc-da88f87f8699",
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
  "correlation_id": "bbbbab2d-b4cd-475d-80ab-7bd712141a9c"
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
      "from": "17:00",
      "to": "18:00"
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
  "command_id": "8579b278-a26f-41df-aeab-13115d975209",
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
  "phone": "+380677232026",
  "device_ref": "sandbox-28490"
}
```

```json
{
  "challenge_id": "b85f1000-973e-4cb5-a8fb-8afc613cdd6f",
  "expires_at": "2026-10-28T15:01:47.423920909Z",
  "resend_available_at": "2026-10-28T14:56:48.423920909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677232026` → **200**

```json
{
  "phone": "+380677232026",
  "audience": "CLIENT",
  "code": "756580",
  "sent_at": "2026-10-28T14:56:47.425927668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b85f1000-973e-4cb5-a8fb-8afc613cdd6f",
  "code": "756580",
  "device_ref": "sandbox-28490"
}
```

```json
{
  "session_id": "45551451-ee42-4335-867f-9751cdd5eefb",
  "subject": {
    "type": "CLIENT",
    "id": "24c2680d-8459-4b19-96c9-25be09e30904"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNGMyNjgwZC04NDU5LTRiMTktOTZjOS0yNWJlMDllMzA5MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzA3LCJpYXQiOjE3OTMxOTk0MDcsImp0aSI6ImE2Y2VjM2M5LWUwM2ItNDM3OS05Zjg3LTNhOTA3ZWFiZDUzZSIsInNpZCI6IjQ1NTUxNDUxLWVlNDItNDMzNS04NjdmLTk3NTFjZGQ1ZWVmYiJ9.fnFt41g-icqxQYaVaD5YDaNjL6hehOwedKm5GW0lcPo",
  "access_expires_at": "2026-10-28T15:11:47.638092483Z",
  "refresh_token": "pARXqr22NHrQnLuhmcvYQV4E2DM_Yjzq51VOHbP9DRo",
  "refresh_expires_at": "2026-11-27T14:56:47.637586744Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "24c2680d-8459-4b19-96c9-25be09e30904",
  "session_id": "45551451-ee42-4335-867f-9751cdd5eefb",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7d2e4cfe-404c-49bd-8139-ad52749a067b",
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
  "id": "ea9f7441-0bfc-47b9-8aa4-8be5909f87d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:48.031877Z",
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
  "challenge_id": "107c8754-9fe8-4dba-bb4a-e58bd1e3df9d",
  "expires_at": "2026-10-28T15:01:50.236861895Z",
  "resend_available_at": "2026-10-28T14:56:51.236861895Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677232026` → **200**

```json
{
  "phone": "+380677232026",
  "audience": "CLIENT",
  "code": "382611",
  "sent_at": "2026-10-28T14:56:50.239652823Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "87a5a89d-35b2-4dbd-a863-d890d42c684d",
  "challenge_id": "107c8754-9fe8-4dba-bb4a-e58bd1e3df9d",
  "otp_code": "382611"
}
```

```json
{
  "client_id": "24c2680d-8459-4b19-96c9-25be09e30904",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:56:50.483787314Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "261cd179-5cb7-4d8a-ac7f-8264e4f63b93",
  "quote_id": "ea9f7441-0bfc-47b9-8aa4-8be5909f87d2",
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
  "correlation_id": "b250b763-e804-47d3-bf1b-eab66abd9802"
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
  "session_id": "add776f3-e83a-4158-b033-550c352131e4",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMTEsImlhdCI6MTc5MzE5OTQxMSwianRpIjoiNTNmNzkxYTgtMjQ5OS00MmUwLTkxNWQtNjQ1ODAwY2U1NWEzIiwic2lkIjoiYWRkNzc2ZjMtZTgzYS00MTU4LWIwMzMtNTUwYzM1MjEzMWU0In0.AuRM2t-wJl3TaXzU_N88q04GA05HsLWS9z_TMwMq_AY",
  "access_expires_at": "2026-10-28T15:11:51.166327772Z",
  "refresh_token": "gDLs_cxTMytLBJnx7jiK1V-sNU45Wvbqkist-jPEM20",
  "refresh_expires_at": "2026-10-29T02:56:51.165902279Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "24c2680d-8459-4b19-96c9-25be09e30904",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:56:50.483787Z",
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

`POST /api/admin/v1/client-deletions/24c2680d-8459-4b19-96c9-25be09e30904/complete` → **200**

```json
{
  "command_id": "9e8d57f1-e4bc-43d8-97a2-018b4e830c60",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "24c2680d-8459-4b19-96c9-25be09e30904",
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
  "correlation_id": "5f613fcc-1760-4566-843f-27e6bde0d0c5"
}
```

Done: client 24c2680d-8459-4b19-96c9-25be09e30904 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667372601",
  "device_ref": "sandbox-3927"
}
```

```json
{
  "challenge_id": "0fc2ccdc-70c1-40e7-a60a-3aefe972a421",
  "expires_at": "2026-10-28T15:01:51.996001879Z",
  "resend_available_at": "2026-10-28T14:56:52.996001879Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667372601` → **200**

```json
{
  "phone": "+380667372601",
  "audience": "CLIENT",
  "code": "620030",
  "sent_at": "2026-10-28T14:56:51.99805955Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0fc2ccdc-70c1-40e7-a60a-3aefe972a421",
  "code": "620030",
  "device_ref": "sandbox-3927"
}
```

```json
{
  "session_id": "7bcc4c4e-6755-4e2d-8165-412389c41049",
  "subject": {
    "type": "CLIENT",
    "id": "7df16341-878c-4544-8aab-cadcf32e8501"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZGYxNjM0MS04NzhjLTQ1NDQtOGFhYi1jYWRjZjMyZTg1MDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzEyLCJpYXQiOjE3OTMxOTk0MTIsImp0aSI6IjdjNjBmMjA4LTdlMTktNGY3OS1hODA2LTYyZDJjYWY3YWU1ZSIsInNpZCI6IjdiY2M0YzRlLTY3NTUtNGUyZC04MTY1LTQxMjM4OWM0MTA0OSJ9.JCxXIGT5ajsh213KEWgNpsX1pr5ApROEkV5Zn4fA2OU",
  "access_expires_at": "2026-10-28T15:11:52.224251001Z",
  "refresh_token": "ltbcKxKLcFADCUs_ZVKvg56HfzZOwSAt9JrT8fh5K5I",
  "refresh_expires_at": "2026-11-27T14:56:52.223725464Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7df16341-878c-4544-8aab-cadcf32e8501",
  "session_id": "7bcc4c4e-6755-4e2d-8165-412389c41049",
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
  "session_id": "0b39978e-89c3-47a6-986b-09660236f032",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMTIsImlhdCI6MTc5MzE5OTQxMiwianRpIjoiYjRiMzQzYWUtZmRhZS00ZDAyLThmMWQtODc0NTMzYWQ4M2ZlIiwic2lkIjoiMGIzOTk3OGUtODljMy00N2E2LTk4NmItMDk2NjAyMzZmMDMyIn0.ylCcPP7AwUSpLJEhsKbsIuAgbv_Sh3GhZ1iMKGFjdN8",
  "access_expires_at": "2026-10-28T15:11:52.873989125Z",
  "refresh_token": "K9O7dBi9yU0ZY2_o17vYZIDQK2Nr7-Gjd0CU-1b57-g",
  "refresh_expires_at": "2026-10-29T02:56:52.873573221Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7372601&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "7df16341-878c-4544-8aab-cadcf32e8501",
      "phone": "+380667372601",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:56:52.222087Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/7df16341-878c-4544-8aab-cadcf32e8501` → **200**

```json
{
  "client": {
    "id": "7df16341-878c-4544-8aab-cadcf32e8501",
    "phone": "+380667372601",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:56:52.222087Z",
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

`POST /api/admin/v1/clients/7df16341-878c-4544-8aab-cadcf32e8501/block` → **400**

```json
{
  "command_id": "0c726b84-b5fd-4548-b384-be037d966374",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7df16341-878c-4544-8aab-cadcf32e8501/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "37be4439-f771-48e0-8b4c-98854c93430c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/7df16341-878c-4544-8aab-cadcf32e8501/block` → **200**

```json
{
  "command_id": "b3cf0372-17e3-4eb2-8790-80ae9ae1e48d",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "7df16341-878c-4544-8aab-cadcf32e8501",
  "phone": "+380667372601",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:56:52.222087Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:56:53.755105Z",
    "by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
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
  "correlation_id": "f6565b91-3b5a-4346-8bb4-a83ecac157b6"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667372601",
  "device_ref": "sandbox-10302"
}
```

```json
{
  "challenge_id": "6279ca20-22e2-40a3-81b9-fa857599ba36",
  "expires_at": "2026-10-28T15:01:56.185379703Z",
  "resend_available_at": "2026-10-28T14:56:57.185379703Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667372601` → **200**

```json
{
  "phone": "+380667372601",
  "audience": "CLIENT",
  "code": "998574",
  "sent_at": "2026-10-28T14:56:56.187840419Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "6279ca20-22e2-40a3-81b9-fa857599ba36",
  "code": "998574",
  "device_ref": "sandbox-10302"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d6ccdfcd-9d24-4ba8-b4e4-0f5f6d737617"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/7df16341-878c-4544-8aab-cadcf32e8501` → **200**

```json
{
  "client": {
    "id": "7df16341-878c-4544-8aab-cadcf32e8501",
    "phone": "+380667372601",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:56:52.222087Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:56:53.755105Z",
      "by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
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

`POST /api/admin/v1/clients/7df16341-878c-4544-8aab-cadcf32e8501/unblock` → **200**

```json
{
  "command_id": "4f832c65-6def-4d97-911a-d2f982b04109",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "7df16341-878c-4544-8aab-cadcf32e8501",
  "phone": "+380667372601",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:56:52.222087Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667372601",
  "device_ref": "sandbox-27346"
}
```

```json
{
  "challenge_id": "3d6a6b27-6d3b-4de1-a909-769c683ac6f7",
  "expires_at": "2026-10-28T15:01:59.01233326Z",
  "resend_available_at": "2026-10-28T14:57:00.01233326Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667372601` → **200**

```json
{
  "phone": "+380667372601",
  "audience": "CLIENT",
  "code": "209739",
  "sent_at": "2026-10-28T14:56:59.014456288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d6a6b27-6d3b-4de1-a909-769c683ac6f7",
  "code": "209739",
  "device_ref": "sandbox-27346"
}
```

```json
{
  "session_id": "dd5c6349-80c4-45a4-9e5d-b7cb82793bfb",
  "subject": {
    "type": "CLIENT",
    "id": "7df16341-878c-4544-8aab-cadcf32e8501"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZGYxNjM0MS04NzhjLTQ1NDQtOGFhYi1jYWRjZjMyZTg1MDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzE5LCJpYXQiOjE3OTMxOTk0MTksImp0aSI6IjBjMTlkOWM4LTVhNjItNDBmMS04YTcxLTJiYjU1MTAyYjBjZCIsInNpZCI6ImRkNWM2MzQ5LTgwYzQtNDVhNC05ZTVkLWI3Y2I4Mjc5M2JmYiJ9.QMTc5wSByntrbK0vcEoPOd04EOZz9_Vcvbm6Roh4X4s",
  "access_expires_at": "2026-10-28T15:11:59.225373485Z",
  "refresh_token": "iJnjmk_eZJ7g9gx7G9XYMQD2A2SdwI-u3MFjUgd_cEU",
  "refresh_expires_at": "2026-11-27T14:56:59.224831993Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7df16341-878c-4544-8aab-cadcf32e8501",
  "session_id": "dd5c6349-80c4-45a4-9e5d-b7cb82793bfb",
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
  "phone": "+380662211963",
  "device_ref": "sandbox-10164"
}
```

```json
{
  "challenge_id": "d88f7ecf-58d4-4195-8cc7-ff51faed04f4",
  "expires_at": "2026-10-28T15:01:59.601902141Z",
  "resend_available_at": "2026-10-28T14:57:00.601902141Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662211963` → **200**

```json
{
  "phone": "+380662211963",
  "audience": "CLIENT",
  "code": "137967",
  "sent_at": "2026-10-28T14:56:59.603805389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d88f7ecf-58d4-4195-8cc7-ff51faed04f4",
  "code": "137967",
  "device_ref": "sandbox-10164"
}
```

```json
{
  "session_id": "8ac8d8b0-60dc-4867-95f7-b7d4d10759e5",
  "subject": {
    "type": "CLIENT",
    "id": "26f7bacb-507f-4c04-afba-67de126b779c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmY3YmFjYi01MDdmLTRjMDQtYWZiYS02N2RlMTI2Yjc3OWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzE5LCJpYXQiOjE3OTMxOTk0MTksImp0aSI6Ijg1M2RhZTUzLTNmYWUtNDlkNy05NTllLWYxZjQ2OTVkMWJlOSIsInNpZCI6IjhhYzhkOGIwLTYwZGMtNDg2Ny05NWY3LWI3ZDRkMTA3NTllNSJ9.ROJVHgfde-VKZqBb51YpmzyAVL7CtEIGiSjHVw7w4p8",
  "access_expires_at": "2026-10-28T15:11:59.815120056Z",
  "refresh_token": "6BJlHayThFum8g4JnJqBWVMHY27H0P8AjwOz7r1sy1A",
  "refresh_expires_at": "2026-11-27T14:56:59.814570558Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b4e2ffd-8c8e-457f-8687-f745365bfa3e",
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
  "id": "0eed4727-f9a0-4a28-b1dc-a1448fac68d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:00.016764Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: dd3ed3e4-c575-4a4a-89ec-17da779188ac) → **201**

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
  "session_id": "ded09fe1-7315-4c7b-bb8b-6c09036a8a3a",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMjAsImlhdCI6MTc5MzE5OTQyMCwianRpIjoiODU4MTZjOTEtMTY3MC00ZDk1LTg3NzAtNjUzYTZjNzczZGNiIiwic2lkIjoiZGVkMDlmZTEtNzMxNS00YzdiLWJiOGItNmMwOTAzNmE4YTNhIn0.ww2g8-EhSNgrYxrIQPSnymjkYnomCz9r6sTW-tlJ4TY",
  "access_expires_at": "2026-10-28T15:12:00.527742709Z",
  "refresh_token": "mnnxOPMKMfYZ9fzuURNauixgnCmU8v9X8HgfgW5ae0A",
  "refresh_expires_at": "2026-10-29T02:57:00.527222917Z",
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
  "session_id": "c2cde952-74f4-4dba-a022-94475979cbd9",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMjAsImlhdCI6MTc5MzE5OTQyMCwianRpIjoiNjBhNWNkZDQtYzgxYy00MGJjLTk3ODYtMzMwYzdiNzY2YzcxIiwic2lkIjoiYzJjZGU5NTItNzRmNC00ZGJhLWEwMjItOTQ0NzU5NzljYmQ5In0.p_ZmWBs5Iv9MObO23Y_8DDkvsBprgYM5ahWQ4AXsXwY",
  "access_expires_at": "2026-10-28T15:12:00.95840709Z",
  "refresh_token": "gf_5yOe4beAZ3Jqtf4qddiTkQs-lycMIfx67ntNaU18",
  "refresh_expires_at": "2026-10-29T02:57:00.957974476Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b3bdf513-32d2-47a6-86e3-83e957c3f0db/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:57:00.263508Z",
      "actor": {
        "type": "CLIENT",
        "id": "26f7bacb-507f-4c04-afba-67de126b779c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db",
        "quote_id": "0eed4727-f9a0-4a28-b1dc-a1448fac68d7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "dd3ed3e4-c575-4a4a-89ec-17da779188ac"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:57:00.265404Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db",
        "attempt_id": "9532ca9b-6880-4a3a-aa5c-8ac4fd80db3b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "dd3ed3e4-c575-4a4a-89ec-17da779188ac"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:57:00.272998Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db",
        "attempt_id": "9532ca9b-6880-4a3a-aa5c-8ac4fd80db3b"
      },
      "correlation_id": "dd3ed3e4-c575-4a4a-89ec-17da779188ac"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "9532ca9b-6880-4a3a-aa5c-8ac4fd80db3b",
        "generation": 1,
        "started_at": "2026-10-28T14:57:00.264461Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:57:00.272998Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:57:00.266201Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/dd3ed3e4-c575-4a4a-89ec-17da779188ac` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db:0",
      "order_id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db",
      "at": "2026-10-28T14:57:00.263508Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db:1",
      "order_id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db",
      "at": "2026-10-28T14:57:00.265404Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db:2",
      "order_id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db",
      "at": "2026-10-28T14:57:00.272998Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/b4485102-c323-4f3d-b3a3-c18aeedd85f2` → **200**

```json
{
  "found": []
}
```

Done: request dd3ed3e4-c575-4a4a-89ec-17da779188ac — order b3bdf513-32d2-47a6-86e3-83e957c3f0db found by its id.

`GET /api/rider/v1/orders/b3bdf513-32d2-47a6-86e3-83e957c3f0db` → **200**

```json
{
  "id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26f7bacb-507f-4c04-afba-67de126b779c",
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
  "created_at": "2026-10-28T14:57:00.262904Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b3bdf513-32d2-47a6-86e3-83e957c3f0db/cancel` → **200**

```json
{
  "command_id": "a9a44bdb-af9e-4488-be5a-2b6e7407488a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b3bdf513-32d2-47a6-86e3-83e957c3f0db",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "26f7bacb-507f-4c04-afba-67de126b779c",
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
  "created_at": "2026-10-28T14:57:00.262904Z",
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
  "phone": "+380632452126",
  "device_ref": "sandbox-8627"
}
```

```json
{
  "challenge_id": "203987ae-dfb7-425b-921f-feeaf1d36ddb",
  "expires_at": "2026-10-28T15:02:02.156606271Z",
  "resend_available_at": "2026-10-28T14:57:03.156606271Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632452126` → **200**

```json
{
  "phone": "+380632452126",
  "audience": "CLIENT",
  "code": "189199",
  "sent_at": "2026-10-28T14:57:02.159096053Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "203987ae-dfb7-425b-921f-feeaf1d36ddb",
  "code": "189199",
  "device_ref": "sandbox-8627"
}
```

```json
{
  "session_id": "0a1f4f28-6079-48ee-9be2-570393257701",
  "subject": {
    "type": "CLIENT",
    "id": "9c812d78-9ed2-4063-9841-08a56bbc9dc8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzgxMmQ3OC05ZWQyLTQwNjMtOTg0MS0wOGE1NmJiYzlkYzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzIyLCJpYXQiOjE3OTMxOTk0MjIsImp0aSI6Ijc5Y2U2M2ZmLWRhYWUtNDM0OC1iM2JmLTNiMGUzYjNlZDRlOCIsInNpZCI6IjBhMWY0ZjI4LTYwNzktNDhlZS05YmUyLTU3MDM5MzI1NzcwMSJ9.ctH3hNbJff6jad9jIryqKzWIGbImFRiwJrlEp73JiSo",
  "access_expires_at": "2026-10-28T15:12:02.368122262Z",
  "refresh_token": "pHNRgUK_F0ptkBS54lGMFUNrLGwCK-CVWxSzAdUR5UA",
  "refresh_expires_at": "2026-11-27T14:57:02.36747488Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "f3e98824-5d82-4826-b999-8e7de440cd45",
  "expires_at": "2026-10-28T15:02:04.560781551Z",
  "resend_available_at": "2026-10-28T14:57:05.560781551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632452126` → **200**

```json
{
  "phone": "+380632452126",
  "audience": "CLIENT",
  "code": "663599",
  "sent_at": "2026-10-28T14:57:04.562805216Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "f34b0c17-2d75-4203-89f8-f6b4915aef83",
  "challenge_id": "f3e98824-5d82-4826-b999-8e7de440cd45",
  "otp_code": "663599"
}
```

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "PENDING",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90` → **200**

```json
{
  "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
  "state": "READY",
  "created_at": "2026-10-28T14:57:04.778864Z",
  "ready_at": "2026-10-28T14:57:13.51051Z",
  "expires_at": "2026-11-04T14:57:13.51051Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634123121",
  "device_ref": "sandbox-28591"
}
```

```json
{
  "challenge_id": "68b14e55-28bb-44fd-b90f-00d47e89a7aa",
  "expires_at": "2026-10-28T15:02:14.702872597Z",
  "resend_available_at": "2026-10-28T14:57:15.702872597Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634123121` → **200**

```json
{
  "phone": "+380634123121",
  "audience": "CLIENT",
  "code": "109193",
  "sent_at": "2026-10-28T14:57:14.705709295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "68b14e55-28bb-44fd-b90f-00d47e89a7aa",
  "code": "109193",
  "device_ref": "sandbox-28591"
}
```

```json
{
  "session_id": "4367b405-1c32-41e7-b469-bbf13e47d159",
  "subject": {
    "type": "CLIENT",
    "id": "1e2f3750-3d86-462f-a08e-17918e84518e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZTJmMzc1MC0zZDg2LTQ2MmYtYTA4ZS0xNzkxOGU4NDUxOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzM0LCJpYXQiOjE3OTMxOTk0MzQsImp0aSI6ImRjNTA2N2UxLWYxMDAtNDA0NC1hY2JjLTE1YzZlMDhmMzNkOCIsInNpZCI6IjQzNjdiNDA1LTFjMzItNDFlNy1iNDY5LWJiZjEzZTQ3ZDE1OSJ9.0zzC8UPoqNa5AgDJ7eVPD6l_5sWEGPLxkQQw6EPmMDY",
  "access_expires_at": "2026-10-28T15:12:14.917219901Z",
  "refresh_token": "2l7bXVZFdUuS5SO5znGSEbCsxud7Q9-kl5J-ZDxS7J0",
  "refresh_expires_at": "2026-11-27T14:57:14.916688613Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/7b3e9759-a08a-415c-a9f1-6113f8917b90/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4de2ca7d-b0be-4d5b-b73a-98c7a19cae0e"
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
  "session_id": "3c7779c5-6bf3-4b20-ac9e-2ad63f203e90",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMzUsImlhdCI6MTc5MzE5OTQzNSwianRpIjoiM2UxYjY1YmQtMjRhYS00ZDhiLTgyZjEtNzg1MzliY2YwNGNhIiwic2lkIjoiM2M3Nzc5YzUtNmJmMy00YjIwLWFjOWUtMmFkNjNmMjAzZTkwIn0.G1fEF6OLUw8PtGmZfmtN5pHE_YYCAwiA4rWTmQSJfog",
  "access_expires_at": "2026-10-28T15:12:15.552542886Z",
  "refresh_token": "zrk7PLpwyJYPNVjv_2vfF5cRBCw-cjlw8fDYfbXPoME",
  "refresh_expires_at": "2026-10-29T02:57:15.551995492Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9c812d78-9ed2-4063-9841-08a56bbc9dc8",
  "session_id": "0a1f4f28-6079-48ee-9be2-570393257701",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/9c812d78-9ed2-4063-9841-08a56bbc9dc8/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "7b3e9759-a08a-415c-a9f1-6113f8917b90",
      "state": "READY",
      "created_at": "2026-10-28T14:57:04.778864Z",
      "ready_at": "2026-10-28T14:57:13.51051Z",
      "expires_at": "2026-11-04T14:57:13.51051Z",
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
  "device_ref": "sandbox-18533"
}
```

```json
{
  "challenge_id": "14f788f9-245f-485e-b11b-99f8710229cf",
  "expires_at": "2026-10-28T15:02:16.132518692Z",
  "resend_available_at": "2026-10-28T14:57:17.132518692Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "882789",
  "sent_at": "2026-10-28T14:57:16.134824009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14f788f9-245f-485e-b11b-99f8710229cf",
  "code": "882789",
  "device_ref": "sandbox-18533"
}
```

```json
{
  "session_id": "6851e0e1-a82d-4e74-ae88-0ca07f840b6e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDMzNiwiaWF0IjoxNzkzMTk5NDM2LCJqdGkiOiJhZmZiODUyNC0wNDUyLTQ3NWEtODUwOC02ODBjZTkxNTI3OWEiLCJzaWQiOiI2ODUxZTBlMS1hODJkLTRlNzQtYWU4OC0wY2EwN2Y4NDBiNmUifQ.3_0AUkIre_Ok29KzRkPaNugMjjU2vlaoHpZLuOP3kc8",
  "access_expires_at": "2026-10-28T15:12:16.34151998Z",
  "refresh_token": "PwoUOCF-jClDlVL6Ms-3Bae-mcRxrvCpbfm18Rro0q0",
  "refresh_expires_at": "2026-11-27T14:57:16.34109629Z",
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
  "device_ref": "sandbox-9222"
}
```

```json
{
  "challenge_id": "0ea4ee7a-3e38-4d50-9b25-081022725062",
  "expires_at": "2026-10-28T15:02:16.712473426Z",
  "resend_available_at": "2026-10-28T14:57:17.712473426Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "990197",
  "sent_at": "2026-10-28T14:57:16.714465295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ea4ee7a-3e38-4d50-9b25-081022725062",
  "code": "990197",
  "device_ref": "sandbox-9222"
}
```

```json
{
  "session_id": "7e4e6be7-25b1-4cfd-aae0-b9520e1ff229",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDMzNiwiaWF0IjoxNzkzMTk5NDM2LCJqdGkiOiIxNzY4NWZlMS0zNDRkLTQ4ODAtOGQ3NS02NWQwMDkyMDE1YjUiLCJzaWQiOiI3ZTRlNmJlNy0yNWIxLTRjZmQtYWFlMC1iOTUyMGUxZmYyMjkifQ.I90pzygHDmeKxbDM6SQnhziNLUIVuNnll6rzX1epPUM",
  "access_expires_at": "2026-10-28T15:12:16.918297759Z",
  "refresh_token": "maouI48frKBm65kzENYgxZbOBdr55b0p3a3o9yvBos4",
  "refresh_expires_at": "2026-11-27T14:57:16.917783733Z",
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
  "command_id": "c0367d40-a94b-4a04-b7e7-80ee8b2da8e1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:17Z",
    "sequence": 1793199437294
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cc5f778d-494f-4cbe-8961-62190fe41556",
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
  "last_heartbeat_at": "2026-10-28T14:57:17.309618Z",
  "last_location_at": "2026-10-28T14:57:17.309618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9090"
}
```

```json
{
  "challenge_id": "5b49253f-ca4f-4fc5-b05b-02990eca9856",
  "expires_at": "2026-10-28T15:02:17.503793216Z",
  "resend_available_at": "2026-10-28T14:57:18.503793216Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "228374",
  "sent_at": "2026-10-28T14:57:17.506249188Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b49253f-ca4f-4fc5-b05b-02990eca9856",
  "code": "228374",
  "device_ref": "sandbox-9090"
}
```

```json
{
  "session_id": "6bdbfc42-b25f-410b-9bac-3bedac897ec3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDMzNywiaWF0IjoxNzkzMTk5NDM3LCJqdGkiOiJjZTlhOGFjOC1mYjg4LTQ5YTAtOTI3ZC0wNTkxMjFlYzczNGUiLCJzaWQiOiI2YmRiZmM0Mi1iMjVmLTQxMGItOWJhYy0zYmVkYWM4OTdlYzMifQ.T19MsJv03JcM1UKnjlKaWXrwJaatyuqW2vSCjlA2X4M",
  "access_expires_at": "2026-10-28T15:12:17.717495014Z",
  "refresh_token": "PvlOQOOXYpuFeUS01Q4Quk6dXa_vUe4_KeHuKEqYDtI",
  "refresh_expires_at": "2026-11-27T14:57:17.716900645Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "29176b30-407a-4a46-ae11-efa17c9f621b",
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
  "last_heartbeat_at": "2026-10-28T14:55:55.805845Z",
  "last_location_at": "2026-10-28T14:55:55.805845Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/29176b30-407a-4a46-ae11-efa17c9f621b/handover` → **200**

```json
{
  "command_id": "c5bacdfd-5f65-436f-b5f2-b288d3aeea1c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "29176b30-407a-4a46-ae11-efa17c9f621b",
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
  "last_heartbeat_at": "2026-10-28T14:55:55.805845Z",
  "last_location_at": "2026-10-28T14:55:55.805845Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/29176b30-407a-4a46-ae11-efa17c9f621b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:18Z",
    "sequence": 1793199438287
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "29176b30-407a-4a46-ae11-efa17c9f621b",
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
  "last_heartbeat_at": "2026-10-28T14:57:18.302808Z",
  "last_location_at": "2026-10-28T14:57:18.302808Z",
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
  "session_id": "5a55e3d0-7e1d-4f9d-9583-c966e25c2c04",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMzgsImlhdCI6MTc5MzE5OTQzOCwianRpIjoiZjE3YzA0Y2QtY2YwNC00NmZhLWJiOTAtMzhhY2ZjZDliMzExIiwic2lkIjoiNWE1NWUzZDAtN2UxZC00ZjlkLTk1ODMtYzk2NmUyNWMyYzA0In0.RAc_6BfZEfg1aIcTWlJ2UEZvV1PuVOMGa_zQSN-xwkQ",
  "access_expires_at": "2026-10-28T15:12:18.719470408Z",
  "refresh_token": "HZuvb3nxF7Dnx-MWsOO2Nj2RJAzFJlU2e8voa3dZeLg",
  "refresh_expires_at": "2026-10-29T02:57:18.718990911Z",
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
  "session_id": "58075413-3797-4adc-8453-5950fd22fe8e",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMzksImlhdCI6MTc5MzE5OTQzOSwianRpIjoiYWJjZjcyYjgtNjBlZC00OGI1LTg4MDYtZDk3MjYzZTdjM2VjIiwic2lkIjoiNTgwNzU0MTMtMzc5Ny00YWRjLTg0NTMtNTk1MGZkMjJmZThlIn0.B1ANNbhEf_QL9hrO6v7w6re1U86E9wQB5hUGlEF3aF8",
  "access_expires_at": "2026-10-28T15:12:19.141592889Z",
  "refresh_token": "32QCRExz2weKWsbh3eyiYSQp4IvXHGnx_xG63x-cr6A",
  "refresh_expires_at": "2026-10-29T02:57:19.141069217Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380687255227",
  "device_ref": "sandbox-18918"
}
```

```json
{
  "challenge_id": "a39fac1e-8334-4ed8-9bf5-2d6c2b5cc986",
  "expires_at": "2026-10-28T15:02:19.329172708Z",
  "resend_available_at": "2026-10-28T14:57:20.329172708Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380687255227` → **200**

```json
{
  "phone": "+380687255227",
  "audience": "CLIENT",
  "code": "301190",
  "sent_at": "2026-10-28T14:57:19.331138021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a39fac1e-8334-4ed8-9bf5-2d6c2b5cc986",
  "code": "301190",
  "device_ref": "sandbox-18918"
}
```

```json
{
  "session_id": "eb522d7a-55cf-4da8-9083-af045e162510",
  "subject": {
    "type": "CLIENT",
    "id": "c7eb7269-8af9-44e9-92ce-37160ffaa35a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2ViNzI2OS04YWY5LTQ0ZTktOTJjZS0zNzE2MGZmYWEzNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzM5LCJpYXQiOjE3OTMxOTk0MzksImp0aSI6ImVhZTc5YjMyLWQ5MjEtNGNkYi05ZmIyLTM4ZWFlOWVhNDgwYSIsInNpZCI6ImViNTIyZDdhLTU1Y2YtNGRhOC05MDgzLWFmMDQ1ZTE2MjUxMCJ9.MohYQ9FrHCUfA5UmzT5xRIRCJOCDR6dKOWFbc60qF0g",
  "access_expires_at": "2026-10-28T15:12:19.530448652Z",
  "refresh_token": "m6GhAew3V2izJESC2KjluRmvkYt0_nUb3JsyJPNNMZc",
  "refresh_expires_at": "2026-11-27T14:57:19.529963049Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cb8e8c11-2555-44ad-8ace-fbf5fa126535",
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
  "id": "c9ac08d9-43b0-4cca-afa6-4eb554faeffc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:19.723918Z",
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
  "command_id": "451b6f4e-dcff-4b98-add1-d569912ca439",
  "quote_id": "c9ac08d9-43b0-4cca-afa6-4eb554faeffc",
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
  "id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7eb7269-8af9-44e9-92ce-37160ffaa35a",
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
  "created_at": "2026-10-28T14:57:19.924667Z",
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
    "id": "8de9971e-ab2c-4ea2-ace8-45c1825eabc0",
    "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
    "expires_at": "2026-10-28T14:57:34.92778Z",
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

`POST /api/driver/v1/offers/8de9971e-ab2c-4ea2-ace8-45c1825eabc0/reject` → **204**

```json
{
  "command_id": "1ca18109-5d83-4a97-8b0a-4142684e08b6"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bda59d94-976c-46d6-9a5a-e4cc444d667c",
    "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
    "expires_at": "2026-10-28T14:57:35.325927Z",
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

`POST /api/driver/v1/offers/bda59d94-976c-46d6-9a5a-e4cc444d667c/accept` → **200**

```json
{
  "command_id": "37fcd96e-617c-4b4b-b359-93d654c4fff1"
}
```

```json
{
  "id": "dd2fbc0d-0db9-4dda-a545-f936a4c95998",
  "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b17da205-eea0-4e0c-a6fc-464c947af1ff",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/86ac8a33-6619-4eaf-a47b-449c69c31a5e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:57:19.925274Z",
      "actor": {
        "type": "CLIENT",
        "id": "c7eb7269-8af9-44e9-92ce-37160ffaa35a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
        "quote_id": "c9ac08d9-43b0-4cca-afa6-4eb554faeffc",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c2ee3057-f3e2-4f8b-af84-3700734cad9e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:57:19.927016Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
        "attempt_id": "786f49b3-7d7a-469b-8501-d32b59b2e5ad",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c2ee3057-f3e2-4f8b-af84-3700734cad9e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:57:19.932212Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8de9971e-ab2c-4ea2-ace8-45c1825eabc0",
        "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c2ee3057-f3e2-4f8b-af84-3700734cad9e"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:57:20.325144Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8de9971e-ab2c-4ea2-ace8-45c1825eabc0",
        "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e"
      },
      "correlation_id": "b4b1ead6-6597-4d87-9c73-594368668980"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 86ac8a33-6619-4eaf-a47b-449c69c31a5e — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/86ac8a33-6619-4eaf-a47b-449c69c31a5e` → **200**

```json
{
  "id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c7eb7269-8af9-44e9-92ce-37160ffaa35a",
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
    "id": "dd2fbc0d-0db9-4dda-a545-f936a4c95998",
    "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b17da205-eea0-4e0c-a6fc-464c947af1ff",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:57:19.924667Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/86ac8a33-6619-4eaf-a47b-449c69c31a5e/cancel` → **200**

```json
{
  "command_id": "c1c69478-57cc-4015-871b-d54210db5eb8",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c7eb7269-8af9-44e9-92ce-37160ffaa35a",
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
    "id": "dd2fbc0d-0db9-4dda-a545-f936a4c95998",
    "order_id": "86ac8a33-6619-4eaf-a47b-449c69c31a5e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b17da205-eea0-4e0c-a6fc-464c947af1ff",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:57:19.924667Z",
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
  "session_id": "cc5f778d-494f-4cbe-8961-62190fe41556",
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
  "last_heartbeat_at": "2026-10-28T14:57:17.309618Z",
  "last_location_at": "2026-10-28T14:57:17.309618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cc5f778d-494f-4cbe-8961-62190fe41556/close` → **200**

```json
{
  "command_id": "916dc418-eb9d-4f59-b00f-da712f3200c9",
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
  "session_id": "29176b30-407a-4a46-ae11-efa17c9f621b",
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
  "last_heartbeat_at": "2026-10-28T14:57:18.302808Z",
  "last_location_at": "2026-10-28T14:57:18.302808Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/29176b30-407a-4a46-ae11-efa17c9f621b/close` → **200**

```json
{
  "command_id": "7bfe6fb7-0304-44b2-b396-04a11857d99b",
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
  "device_ref": "sandbox-12788"
}
```

```json
{
  "challenge_id": "f8b60b17-e3df-4493-9f94-c5419c5c4ab9",
  "expires_at": "2026-10-28T15:02:22.486983559Z",
  "resend_available_at": "2026-10-28T14:57:23.486983559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "255538",
  "sent_at": "2026-10-28T14:57:22.489313878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8b60b17-e3df-4493-9f94-c5419c5c4ab9",
  "code": "255538",
  "device_ref": "sandbox-12788"
}
```

```json
{
  "session_id": "a8fabbc3-0aae-425a-a460-d5a63c3c2cd1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDM0MiwiaWF0IjoxNzkzMTk5NDQyLCJqdGkiOiI3OWI5NDU0ZC03MjRlLTRkZGYtOTBiYi0yYjY5NjlkNmRhNTkiLCJzaWQiOiJhOGZhYmJjMy0wYWFlLTQyNWEtYTQ2MC1kNWE2M2MzYzJjZDEifQ.fcqrZ9WX_pp_uFvlfVNYjfkd2xy91QPoIX77tdTtn_g",
  "access_expires_at": "2026-10-28T15:12:22.689285745Z",
  "refresh_token": "y5jgVcosGVzdyluUOkRMxDAMtgViGom9DTkPUDHZv3c",
  "refresh_expires_at": "2026-11-27T14:57:22.688893897Z",
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
  "command_id": "5a49f85f-c89d-4b43-adbd-6a347349ef5a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:23Z",
    "sequence": 1793199443610
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:23.07581Z",
  "last_location_at": "2026-10-28T14:57:23.07581Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671417177",
  "device_ref": "sandbox-27005"
}
```

```json
{
  "challenge_id": "00b858ea-9930-40b1-975b-543750e7e606",
  "expires_at": "2026-10-28T15:02:23.269774411Z",
  "resend_available_at": "2026-10-28T14:57:24.269774411Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671417177` → **200**

```json
{
  "phone": "+380671417177",
  "audience": "CLIENT",
  "code": "964766",
  "sent_at": "2026-10-28T14:57:23.271812163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00b858ea-9930-40b1-975b-543750e7e606",
  "code": "964766",
  "device_ref": "sandbox-27005"
}
```

```json
{
  "session_id": "31e01cdd-a1f5-4dad-a465-ac16028769c6",
  "subject": {
    "type": "CLIENT",
    "id": "cf000236-0a68-4df3-ac1c-257ffcdc0704"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjAwMDIzNi0wYTY4LTRkZjMtYWMxYy0yNTdmZmNkYzA3MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzQzLCJpYXQiOjE3OTMxOTk0NDMsImp0aSI6ImRmMWVlNmYxLWM3MGYtNDA5Mi04NWUyLTM2MTZjZjFkNzUwYSIsInNpZCI6IjMxZTAxY2RkLWExZjUtNGRhZC1hNDY1LWFjMTYwMjg3NjljNiJ9.okaBHx9_WFgbqlO9ZJshSS0OIb8qxvNaiRILjiggJvg",
  "access_expires_at": "2026-10-28T15:12:23.484297044Z",
  "refresh_token": "bVUuzTLyGEzVxLKeiDSpsl_4ZGbsvbxkfK6Oii04wOM",
  "refresh_expires_at": "2026-11-27T14:57:23.483826595Z",
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
  "command_id": "96fb9a94-0792-420a-83cb-f575b78a5986",
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
  "id": "decba5fb-016b-4033-96e1-15064dee09dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:23.871721Z",
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
  "command_id": "c31de5c2-a947-4bac-92dc-3c7262bf27d7",
  "platform": "ANDROID",
  "token": "sandbox-driver-6c0606e8-3bc9-4939-aae4-9ef5c3604e28"
}
```

```json
{
  "id": "cd3a20b4-663b-4d10-9c38-871d50237492",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:57:24.07772Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "6c52331f-e7bd-4038-b763-520d7f1226f7",
  "platform": "ANDROID",
  "token": "sandbox-rider-4cd6198f-54eb-4213-ac63-d2c8c4269650"
}
```

```json
{
  "id": "25b56330-083b-4a3d-8533-6ddfc70a18b7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:57:24.284095Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1b85e0e5-2ca6-489c-a5e4-5f850d4636a6",
  "quote_id": "decba5fb-016b-4033-96e1-15064dee09dc",
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
  "id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cf000236-0a68-4df3-ac1c-257ffcdc0704",
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
  "created_at": "2026-10-28T14:57:24.48356Z",
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
    "id": "ac701b64-7f08-4993-8049-a1342e48c842",
    "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
    "expires_at": "2026-10-28T14:57:39.486288Z",
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

`POST /api/driver/v1/offers/ac701b64-7f08-4993-8049-a1342e48c842/accept` → **200**

```json
{
  "command_id": "a79d2b6a-f317-4f82-8606-5d8824278e32"
}
```

```json
{
  "id": "f36ed098-6b40-4300-8712-23f23ad8190b",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "deb25c87-141f-45b5-a1d6-dfe2fed56f69",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:57:24.463Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:57:24.463Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:57:25.879428943Z",
    "token_suffix": "604e28",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "cf4c08a4-71f7-4a92-b0c6-4517bd0d22cc",
      "order_version": "2",
      "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671417177&after=2026-10-28T14:57:24.463Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:57:25.881956911Z",
    "token_suffix": "269650",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "171ef119-ad7d-4b8d-8713-36100d88a9e0",
      "order_version": "3",
      "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1/messages` → **201**

```json
{
  "command_id": "e610cd70-f4dc-433f-b7fd-983fa1abcf26",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "1fff819d-24cb-47d3-9266-20a015843f4d",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:57:26.154857998Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "deb25c87-141f-45b5-a1d6-dfe2fed56f69",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "assignment_id": "f36ed098-6b40-4300-8712-23f23ad8190b",
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

`POST /api/driver/v1/trips/deb25c87-141f-45b5-a1d6-dfe2fed56f69/messages` → **201**

```json
{
  "command_id": "eb42ef2c-82db-416f-9131-39746baf8dc2",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "314e8e0e-599b-420a-8811-dd014522e0f3",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:57:26.54555155Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/deb25c87-141f-45b5-a1d6-dfe2fed56f69/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671417177"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/0f0bfe25-0d2c-45e9-b49a-76f63b0b896e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:27Z",
    "sequence": 1793199447158
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:27.174655Z",
  "last_location_at": "2026-10-28T14:57:27.174655Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "deb25c87-141f-45b5-a1d6-dfe2fed56f69",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "assignment_id": "f36ed098-6b40-4300-8712-23f23ad8190b",
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

`POST /api/driver/v1/trips/deb25c87-141f-45b5-a1d6-dfe2fed56f69/arrive` → **200**

```json
{
  "command_id": "76faa02f-9236-478a-80bb-3870dcf7eefd",
  "expected_version": 0
}
```

```json
{
  "id": "deb25c87-141f-45b5-a1d6-dfe2fed56f69",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "assignment_id": "f36ed098-6b40-4300-8712-23f23ad8190b",
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
  "arrived_at": "2026-10-28T14:57:27.560629Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/deb25c87-141f-45b5-a1d6-dfe2fed56f69/start` → **200**

```json
{
  "command_id": "db49690c-0b99-476d-a62b-7ef36b9847b4",
  "expected_version": 1
}
```

```json
{
  "id": "deb25c87-141f-45b5-a1d6-dfe2fed56f69",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "assignment_id": "f36ed098-6b40-4300-8712-23f23ad8190b",
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
  "arrived_at": "2026-10-28T14:57:27.560629Z",
  "started_at": "2026-10-28T14:57:27.776806Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/0f0bfe25-0d2c-45e9-b49a-76f63b0b896e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:27Z",
    "sequence": 1793199447982
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:28.001398Z",
  "last_location_at": "2026-10-28T14:57:28.001398Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/deb25c87-141f-45b5-a1d6-dfe2fed56f69/complete` → **200**

```json
{
  "command_id": "f04ec400-efc8-4c70-8c3f-c57aa83c81ea",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:57:28Z",
  "cash_received": true
}
```

```json
{
  "id": "deb25c87-141f-45b5-a1d6-dfe2fed56f69",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "assignment_id": "f36ed098-6b40-4300-8712-23f23ad8190b",
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
  "arrived_at": "2026-10-28T14:57:27.560629Z",
  "started_at": "2026-10-28T14:57:27.776806Z",
  "completed_at": "2026-10-28T14:57:28.205842Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1` → **200**

```json
{
  "id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cf000236-0a68-4df3-ac1c-257ffcdc0704",
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
    "id": "f36ed098-6b40-4300-8712-23f23ad8190b",
    "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "deb25c87-141f-45b5-a1d6-dfe2fed56f69",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:57:24.48356Z",
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
    "id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:57:24.48356Z",
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
    "id": "deb25c87-141f-45b5-a1d6-dfe2fed56f69",
    "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
    "order_short_number": 9,
    "created_at": "2026-10-28T14:57:24.889432Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "da261d05-bb69-43a3-ac29-8eb150e5227a",
    "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
    "order_short_number": 2,
    "created_at": "2026-10-28T14:55:47.508773Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ceb8ae41-531a-4b59-a582-dd3f676f4b41",
    "order_id": "54d69ea0-4a0c-434c-9007-3cbd4663d180",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:55:35.298169Z",
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

`GET /api/rider/v1/orders/19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1/tip` → **200**

```json
{
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
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
  "available_until": "2026-10-29T14:57:28.205842Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1/tip` → **201**

```json
{
  "command_id": "7ee0455f-35eb-4340-9856-b57d97f7fcfd",
  "amount_minor": 1100
}
```

```json
{
  "id": "00296a77-f7af-41e8-a716-45e562e70e08",
  "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:57:32.595761Z"
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
  "session_id": "160ede08-ca4f-4293-95c6-1fdba8e65603",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNTMsImlhdCI6MTc5MzE5OTQ1MywianRpIjoiYWFjMTZkNWUtNjMxYi00NzY0LTkxY2QtNzA4MDhjZDk3NThlIiwic2lkIjoiMTYwZWRlMDgtY2E0Zi00MjkzLTk1YzYtMWZkYmE4ZTY1NjAzIn0.XYT-XxphEvScG-_m4nzo3Cg1BEBVDpZbgPEtkfKJqHY",
  "access_expires_at": "2026-10-28T15:12:33.027583327Z",
  "refresh_token": "RZJfccnZyOEz7BWAZL43T30EOZOCbIeBLOduC1cq_Jo",
  "refresh_expires_at": "2026-10-29T02:57:33.027025267Z",
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
  "generated_at": "2026-10-28T14:57:33.221791603Z"
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
  "generated_at": "2026-10-28T14:57:33.44263419Z"
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
  "session_id": "37d3af6f-4a97-4994-8a98-8e592f27afb2",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNTMsImlhdCI6MTc5MzE5OTQ1MywianRpIjoiOTViMWMzZTgtOWRkYi00ZTdmLThlNzktM2YxZWMzZWM2ZWU4Iiwic2lkIjoiMzdkM2FmNmYtNGE5Ny00OTk0LThhOTgtOGU1OTJmMjdhZmIyIn0.fOSC1HQit6FoHsGXx8cI5rxH5PNnGiQt0uT9BzyN5bo",
  "access_expires_at": "2026-10-28T15:12:33.883123964Z",
  "refresh_token": "jIuwgmSvFHu0Bfw0Ettw_hkOiQApvcvCn7gkgdCRZmE",
  "refresh_expires_at": "2026-10-29T02:57:33.882597523Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:57:24.48401Z",
      "actor": {
        "type": "CLIENT",
        "id": "cf000236-0a68-4df3-ac1c-257ffcdc0704",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
        "quote_id": "decba5fb-016b-4033-96e1-15064dee09dc",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e23c2a13-5fd3-4435-94a6-5585be2c54ab"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:57:24.485615Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
        "attempt_id": "13f1d831-9757-4259-bad7-e69419d52da3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e23c2a13-5fd3-4435-94a6-5585be2c54ab"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:57:24.488611Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ac701b64-7f08-4993-8049-a1342e48c842",
        "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "e23c2a13-5fd3-4435-94a6-5585be2c54ab"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:57:24.890573Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ac701b64-7f08-4993-8049-a1342e48c842",
        "order_id": "19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f36ed098-6b40-4300-8712-23f23ad8190b"
      },
      "correlation_id": "5e432077-69f1-4da2-828f-b1b0019ae9c8"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:57:34.275350747Z",
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
      "last_location_at": "2026-10-28T14:57:28.001398Z",
      "order_id": null
    }
  ]
}
```

Done: order 19ae0c3a-8a8d-4ab3-99ab-16bd13d9e4e1.

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
  "session_id": "6ae2b02a-2326-4e60-b3a7-0c607cc025bb",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNTQsImlhdCI6MTc5MzE5OTQ1NCwianRpIjoiYThjZTk5ODctMjA0ZC00NzY3LWFmYzQtYmMyYTI1ZGY0N2YzIiwic2lkIjoiNmFlMmIwMmEtMjMyNi00ZTYwLWIzYTctMGM2MDdjYzAyNWJiIn0.yGowN_IICamtpI5R_gqIPoWbQ8DlFU_Q9nqiGCWdJEs",
  "access_expires_at": "2026-10-28T15:12:34.718867756Z",
  "refresh_token": "jh3itfpgw6tKug3jBc0ebvqibjwOlFK8_0ZhnRZMPsE",
  "refresh_expires_at": "2026-10-29T02:57:34.718389807Z",
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
  "command_id": "b28fa6a8-a3d7-4086-88d4-1079e64fd8f6",
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
  "timestamp": "2026-10-28T14:57:35.000+0000",
  "channel": {
    "id": "1730052000.2463915746",
    "linkedid": "1730052000.2463915746",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675409036"
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
  "timestamp": "2026-10-28T14:57:35.000+0000",
  "channel": {
    "id": "1730052000.2463915746",
    "linkedid": "1730052000.2463915746",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675409036"
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
  "session_id": "a7d30cbe-a0fc-46f9-870f-dac4ad52e20d",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNTUsImlhdCI6MTc5MzE5OTQ1NSwianRpIjoiYTY3ZGViMzQtZDc5Mi00MDRhLWE0NWItZGNmNzY0MzRjNjRkIiwic2lkIjoiYTdkMzBjYmUtYTBmYy00NmY5LTg3MGYtZGFjNGFkNTJlMjBkIn0.IouRWp_xpvjRq-CnQRXQXwrvOkGrDryu1Ztef4mAt54",
  "access_expires_at": "2026-10-28T15:12:35.599863213Z",
  "refresh_token": "6w_C1tDOzaXasBD-TdHQg9Mnj-dTK3MawXntIm9it-g",
  "refresh_expires_at": "2026-10-29T02:57:35.59929658Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "60901f7a-8038-4722-9ae6-ab3198706db5",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675409036",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:57:35Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/60901f7a-8038-4722-9ae6-ab3198706db5/answer` → **200**

```json
{
  "command_id": "779d3c62-cc8a-4155-9d5d-5a42e82dc7f0"
}
```

```json
{
  "id": "60901f7a-8038-4722-9ae6-ab3198706db5",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675409036",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "order_ids": [],
  "started_at": "2026-10-28T14:57:35Z",
  "answered_at": "2026-10-28T14:57:35.997271Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2463915746",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3d5994f3-7524-4615-a3a0-77e9c320a32a",
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
  "id": "ab2c7cbe-b792-479b-85f3-f265f8091feb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:36.214712Z",
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
  "command_id": "f5ab4ff4-e41a-42c7-a3ea-19e4cbf019e6",
  "quote_id": "ab2c7cbe-b792-479b-85f3-f265f8091feb",
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
    "phone": "+380675409036"
  },
  "call_id": "60901f7a-8038-4722-9ae6-ab3198706db5"
}
```

```json
{
  "id": "5f553ca3-e047-4542-842d-aa6eab17ff99",
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
  "created_at": "2026-10-28T14:57:36.420515Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675409036"
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
    "id": "1730052000.2463915746",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "60901f7a-8038-4722-9ae6-ab3198706db5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675409036",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_ids": [
        "5f553ca3-e047-4542-842d-aa6eab17ff99"
      ],
      "started_at": "2026-10-28T14:57:35Z",
      "answered_at": "2026-10-28T14:57:35.997271Z",
      "ended_at": "2026-10-28T14:57:36.630829Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "a18a8fcf-592f-486e-aa47-c100162ba2c6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677557583",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:41.962856Z",
      "answered_at": "2026-10-28T14:55:42.192605Z",
      "ended_at": "2026-10-28T14:55:42.40493Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:55:43.473157Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/5f553ca3-e047-4542-842d-aa6eab17ff99` → **200**

```json
{
  "id": "5f553ca3-e047-4542-842d-aa6eab17ff99",
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
  "created_at": "2026-10-28T14:57:36.420515Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675409036"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/5f553ca3-e047-4542-842d-aa6eab17ff99` → **200**

```json
{
  "id": "5f553ca3-e047-4542-842d-aa6eab17ff99",
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
  "created_at": "2026-10-28T14:57:36.420515Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675409036"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5f553ca3-e047-4542-842d-aa6eab17ff99/cancel` → **200**

```json
{
  "command_id": "1462889f-0e55-4f22-8a88-6b01541a8689",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5f553ca3-e047-4542-842d-aa6eab17ff99",
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
  "created_at": "2026-10-28T14:57:36.420515Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675409036"
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

Done: call 60901f7a-8038-4722-9ae6-ab3198706db5 with order 5f553ca3-e047-4542-842d-aa6eab17ff99.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31539"
}
```

```json
{
  "challenge_id": "e890d00d-1d2a-4005-a4a1-2c9548eec647",
  "expires_at": "2026-10-28T15:02:37.475406011Z",
  "resend_available_at": "2026-10-28T14:57:38.475406011Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "161338",
  "sent_at": "2026-10-28T14:57:37.478107228Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e890d00d-1d2a-4005-a4a1-2c9548eec647",
  "code": "161338",
  "device_ref": "sandbox-31539"
}
```

```json
{
  "session_id": "7778f5cf-0e01-452d-83c3-f9e736c32e38",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDM1NywiaWF0IjoxNzkzMTk5NDU3LCJqdGkiOiJhNzU0YTNmZS1iMDBhLTRiNmQtOGNmMy1hMjkwODgyOGY5NDkiLCJzaWQiOiI3Nzc4ZjVjZi0wZTAxLTQ1MmQtODNjMy1mOWU3MzZjMzJlMzgifQ.pLjAswPQrw05yJSfEcIWLoVxFgTeAgD-TrVkTJDeVp8",
  "access_expires_at": "2026-10-28T15:12:37.68939247Z",
  "refresh_token": "O90MBOYNYP4-3gD0fMUiqoApr6JQ7BI_kBcPWF4woJo",
  "refresh_expires_at": "2026-11-27T14:57:37.688876426Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:28.001398Z",
  "last_location_at": "2026-10-28T14:57:28.001398Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0f0bfe25-0d2c-45e9-b49a-76f63b0b896e/handover` → **200**

```json
{
  "command_id": "a7d03530-5ea7-4dce-8a2a-3dd69fa82198",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:28.001398Z",
  "last_location_at": "2026-10-28T14:57:28.001398Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0f0bfe25-0d2c-45e9-b49a-76f63b0b896e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:38Z",
    "sequence": 1793199458242
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:38.257809Z",
  "last_location_at": "2026-10-28T14:57:38.257809Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669109378",
  "device_ref": "sandbox-25081"
}
```

```json
{
  "challenge_id": "5f0eec7f-d60e-4dab-98b2-56e1825ffb4e",
  "expires_at": "2026-10-28T15:02:38.449174559Z",
  "resend_available_at": "2026-10-28T14:57:39.449174559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669109378` → **200**

```json
{
  "phone": "+380669109378",
  "audience": "CLIENT",
  "code": "291004",
  "sent_at": "2026-10-28T14:57:38.451156132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f0eec7f-d60e-4dab-98b2-56e1825ffb4e",
  "code": "291004",
  "device_ref": "sandbox-25081"
}
```

```json
{
  "session_id": "08673bb1-d486-4d38-b62d-957ab895efff",
  "subject": {
    "type": "CLIENT",
    "id": "f86f3f40-1389-4d53-a2e2-caf159ab1825"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODZmM2Y0MC0xMzg5LTRkNTMtYTJlMi1jYWYxNTlhYjE4MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzU4LCJpYXQiOjE3OTMxOTk0NTgsImp0aSI6ImFkZjE4NGJhLTdmZjItNGJmYS1iZTI5LWMxYTM0NTlkODllNCIsInNpZCI6IjA4NjczYmIxLWQ0ODYtNGQzOC1iNjJkLTk1N2FiODk1ZWZmZiJ9.uJnkPIFz7LdimuThJZwT4GwosxEfFJvKyLgi1vo6oys",
  "access_expires_at": "2026-10-28T15:12:38.660557101Z",
  "refresh_token": "sQ8QGpV02S4D5P5DXpiKabqICFRCGaJOedNkJF-eTeI",
  "refresh_expires_at": "2026-11-27T14:57:38.660094135Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "93f471b1-e5a7-4f21-a066-ed21ce931a97",
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
  "id": "e099fad8-6a1d-4eb9-823d-6c02f62b8b1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:38.858539Z",
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
  "command_id": "bed0448c-083a-4be1-b59e-c6a764ea2532",
  "quote_id": "e099fad8-6a1d-4eb9-823d-6c02f62b8b1c",
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
  "id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f86f3f40-1389-4d53-a2e2-caf159ab1825",
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
  "created_at": "2026-10-28T14:57:39.062828Z",
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
    "id": "0252cb5a-e242-44f0-866c-fe1d6c895765",
    "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
    "expires_at": "2026-10-28T14:57:54.065218Z",
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

`POST /api/driver/v1/offers/0252cb5a-e242-44f0-866c-fe1d6c895765/accept` → **200**

```json
{
  "command_id": "ce046ae4-8ca0-4691-9acc-3a9a191db1b1"
}
```

```json
{
  "id": "14ab9433-f6cf-40c1-9303-78c662c30553",
  "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "364bfcb0-d360-42c7-9920-5f07ce1a23b4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "364bfcb0-d360-42c7-9920-5f07ce1a23b4",
  "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
  "assignment_id": "14ab9433-f6cf-40c1-9303-78c662c30553",
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

`POST /api/driver/v1/work-sessions/0f0bfe25-0d2c-45e9-b49a-76f63b0b896e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:39Z",
    "sequence": 1793199459838
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:39.854349Z",
  "last_location_at": "2026-10-28T14:57:39.854349Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/364bfcb0-d360-42c7-9920-5f07ce1a23b4/arrive` → **200**

```json
{
  "command_id": "072f46b7-7fd9-48d9-b2e3-bfb07ced00ac",
  "expected_version": 0
}
```

```json
{
  "id": "364bfcb0-d360-42c7-9920-5f07ce1a23b4",
  "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
  "assignment_id": "14ab9433-f6cf-40c1-9303-78c662c30553",
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
  "arrived_at": "2026-10-28T14:57:40.052116Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/364bfcb0-d360-42c7-9920-5f07ce1a23b4/start` → **200**

```json
{
  "command_id": "585b5085-51d7-40b7-993c-dbb5d043c7c5",
  "expected_version": 1
}
```

```json
{
  "id": "364bfcb0-d360-42c7-9920-5f07ce1a23b4",
  "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
  "assignment_id": "14ab9433-f6cf-40c1-9303-78c662c30553",
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
  "arrived_at": "2026-10-28T14:57:40.052116Z",
  "started_at": "2026-10-28T14:57:40.253837Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/0f0bfe25-0d2c-45e9-b49a-76f63b0b896e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:40Z",
    "sequence": 1793199460443
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:40.460132Z",
  "last_location_at": "2026-10-28T14:57:40.460132Z",
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
  "device_ref": "sandbox-7450"
}
```

```json
{
  "challenge_id": "bc1ed3ef-06ba-46a6-a661-50d3009a4a49",
  "expires_at": "2026-10-28T15:02:40.64522806Z",
  "resend_available_at": "2026-10-28T14:57:41.64522806Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "048796",
  "sent_at": "2026-10-28T14:57:40.647454081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc1ed3ef-06ba-46a6-a661-50d3009a4a49",
  "code": "048796",
  "device_ref": "sandbox-7450"
}
```

```json
{
  "session_id": "5253b73c-fab1-48d1-b5f1-0f3a248eb993",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDM2MCwiaWF0IjoxNzkzMTk5NDYwLCJqdGkiOiI0YjQ3MDZhZC1lZmQwLTQxNDEtYjBiYy1hMjFlMDJkNDJiOGQiLCJzaWQiOiI1MjUzYjczYy1mYWIxLTQ4ZDEtYjVmMS0wZjNhMjQ4ZWI5OTMifQ.fiGfrhcK3hjkXKs4dMNqi9Ciudp8SyqhqC0nHUfPAMY",
  "access_expires_at": "2026-10-28T15:12:40.854892639Z",
  "refresh_token": "qEpOSRETSKlPJISglhs0o_S0cZq1bgIfCWRUeu5KRBQ",
  "refresh_expires_at": "2026-11-27T14:57:40.85443684Z",
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
  "command_id": "34215728-757a-4af0-bc0c-cd7ef74a8859",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:41Z",
    "sequence": 1793199461232
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ca93de2e-a5e3-405a-a45c-f4052c213b6a",
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
  "last_heartbeat_at": "2026-10-28T14:57:41.247455Z",
  "last_location_at": "2026-10-28T14:57:41.247455Z",
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
  "session_id": "0f5d50a9-6de7-4a54-abe8-e99c09786b60",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNjEsImlhdCI6MTc5MzE5OTQ2MSwianRpIjoiN2E5YWY3ZmQtNDYyZC00N2FkLTliMDctZTVmMDg0NTBjYTEyIiwic2lkIjoiMGY1ZDUwYTktNmRlNy00YTU0LWFiZTgtZTk5YzA5Nzg2YjYwIn0.uBEbyI4usMl1YOOpSaTm2ciZLICM2CzMUZELAPp-KFk",
  "access_expires_at": "2026-10-28T15:12:41.673573174Z",
  "refresh_token": "9QdGMKI_jCd8kstXF-DfUBBtnk5xoxC-RXDxYcS2D0g",
  "refresh_expires_at": "2026-10-29T02:57:41.673018259Z",
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
  "session_id": "a806eee2-1e76-4bb4-9bde-21bf253290b6",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNjIsImlhdCI6MTc5MzE5OTQ2MiwianRpIjoiZmM4MmM3OTYtNmI0NS00ZDRlLWI2ODEtOGFkNzQ1MTY3NTY3Iiwic2lkIjoiYTgwNmVlZTItMWU3Ni00YmI0LTliZGUtMjFiZjI1MzI5MGI2In0.aEXNb873epwBvbZoK8EoZ2X05y-7eUFZaF7UY4gfiXE",
  "access_expires_at": "2026-10-28T15:12:42.137888096Z",
  "refresh_token": "nTwxDr2hgeQ0ZOs53VO_FWCXheB6_uQYvrlLSsi6TsQ",
  "refresh_expires_at": "2026-10-29T02:57:42.137338925Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/08d1b1ff-ce58-4086-9a7a-47f837b6851f` → **200**

```json
{
  "id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f86f3f40-1389-4d53-a2e2-caf159ab1825",
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
    "id": "14ab9433-f6cf-40c1-9303-78c662c30553",
    "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "364bfcb0-d360-42c7-9920-5f07ce1a23b4",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:57:39.062828Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/08d1b1ff-ce58-4086-9a7a-47f837b6851f/interrupt` → **200**

```json
{
  "command_id": "8a492723-f167-4c7b-83c9-b74d049a5af2",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "f86f3f40-1389-4d53-a2e2-caf159ab1825",
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
      "id": "14ab9433-f6cf-40c1-9303-78c662c30553",
      "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "364bfcb0-d360-42c7-9920-5f07ce1a23b4",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:57:39.062828Z",
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
    "id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "f86f3f40-1389-4d53-a2e2-caf159ab1825",
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
    "id": "782ac8e3-c380-4b62-af10-b04b1e0607e5",
    "order_id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
    "expires_at": "2026-10-28T14:57:57.589471Z",
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

`POST /api/driver/v1/offers/782ac8e3-c380-4b62-af10-b04b1e0607e5/accept` → **200**

```json
{
  "command_id": "d2dacdef-aee2-4928-8f38-cb1724e5f6b0"
}
```

```json
{
  "id": "9dd99d0a-3fce-47b1-99c5-818135f74827",
  "order_id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b377d09e-fedb-48c2-9c02-f71e2ce6ab5f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b377d09e-fedb-48c2-9c02-f71e2ce6ab5f",
  "order_id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
  "assignment_id": "9dd99d0a-3fce-47b1-99c5-818135f74827",
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
  "session_id": "ca93de2e-a5e3-405a-a45c-f4052c213b6a",
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
  "last_heartbeat_at": "2026-10-28T14:57:41.247455Z",
  "last_location_at": "2026-10-28T14:57:41.247455Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ca93de2e-a5e3-405a-a45c-f4052c213b6a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:43Z",
    "sequence": 1793199463582
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ca93de2e-a5e3-405a-a45c-f4052c213b6a",
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
  "last_heartbeat_at": "2026-10-28T14:57:43.599378Z",
  "last_location_at": "2026-10-28T14:57:43.599378Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b377d09e-fedb-48c2-9c02-f71e2ce6ab5f/arrive` → **200**

```json
{
  "command_id": "6ccb0051-f47c-41a7-9b9a-85c3f9266c22",
  "expected_version": 0
}
```

```json
{
  "id": "b377d09e-fedb-48c2-9c02-f71e2ce6ab5f",
  "order_id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
  "assignment_id": "9dd99d0a-3fce-47b1-99c5-818135f74827",
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
  "arrived_at": "2026-10-28T14:57:43.796286Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b377d09e-fedb-48c2-9c02-f71e2ce6ab5f/start` → **200**

```json
{
  "command_id": "1a422322-c8bf-45cc-97f4-9fa8cb916330",
  "expected_version": 1
}
```

```json
{
  "id": "b377d09e-fedb-48c2-9c02-f71e2ce6ab5f",
  "order_id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
  "assignment_id": "9dd99d0a-3fce-47b1-99c5-818135f74827",
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
  "arrived_at": "2026-10-28T14:57:43.796286Z",
  "started_at": "2026-10-28T14:57:44.001306Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b377d09e-fedb-48c2-9c02-f71e2ce6ab5f/complete` → **200**

```json
{
  "command_id": "0774e8ca-d9f5-48d4-8ce0-f00a534cf56c",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:57:44Z"
}
```

```json
{
  "id": "b377d09e-fedb-48c2-9c02-f71e2ce6ab5f",
  "order_id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
  "assignment_id": "9dd99d0a-3fce-47b1-99c5-818135f74827",
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
  "arrived_at": "2026-10-28T14:57:43.796286Z",
  "started_at": "2026-10-28T14:57:44.001306Z",
  "completed_at": "2026-10-28T14:57:44.208823Z",
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
    "id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:57:42.581564Z",
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
    "id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:57:39.062828Z",
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

`GET /api/operator/v1/orders/08d1b1ff-ce58-4086-9a7a-47f837b6851f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:57:39.063255Z",
      "actor": {
        "type": "CLIENT",
        "id": "f86f3f40-1389-4d53-a2e2-caf159ab1825",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
        "quote_id": "e099fad8-6a1d-4eb9-823d-6c02f62b8b1c",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "d6218a9b-0414-40ad-9510-a035015eac32"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:57:39.064651Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
        "attempt_id": "accb4b8c-614f-4121-a7df-15ceaea3ef2f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d6218a9b-0414-40ad-9510-a035015eac32"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:57:39.066694Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0252cb5a-e242-44f0-866c-fe1d6c895765",
        "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "d6218a9b-0414-40ad-9510-a035015eac32"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:57:39.466011Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0252cb5a-e242-44f0-866c-fe1d6c895765",
        "order_id": "08d1b1ff-ce58-4086-9a7a-47f837b6851f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "14ab9433-f6cf-40c1-9303-78c662c30553"
      },
      "correlation_id": "cad16826-9c24-4663-81e2-022381a9ce96"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/d82927e2-785b-4cc4-9eb7-320c77d9f88a/tip` → **200**

```json
{
  "order_id": "d82927e2-785b-4cc4-9eb7-320c77d9f88a",
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
  "available_until": "2026-10-29T14:57:44.208823Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/d82927e2-785b-4cc4-9eb7-320c77d9f88a/tip` → **409**

```json
{
  "command_id": "f11c9ea0-d8b5-4eed-a472-c1c06f26fed3",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/d82927e2-785b-4cc4-9eb7-320c77d9f88a/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "38422ea5-0855-45a5-b4a2-7ef6f876c3fc"
}
```

Done: interrupted 08d1b1ff-ce58-4086-9a7a-47f837b6851f, follow-up d82927e2-785b-4cc4-9eb7-320c77d9f88a.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f0bfe25-0d2c-45e9-b49a-76f63b0b896e",
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
  "last_heartbeat_at": "2026-10-28T14:57:40.460132Z",
  "last_location_at": "2026-10-28T14:57:40.460132Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0f0bfe25-0d2c-45e9-b49a-76f63b0b896e/close` → **200**

```json
{
  "command_id": "150cbbdc-619c-47a3-8cf3-7e91b4b6c354",
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
  "session_id": "ca93de2e-a5e3-405a-a45c-f4052c213b6a",
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
  "last_heartbeat_at": "2026-10-28T14:57:43.599378Z",
  "last_location_at": "2026-10-28T14:57:43.599378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ca93de2e-a5e3-405a-a45c-f4052c213b6a/close` → **200**

```json
{
  "command_id": "f504e1a1-9bfd-44f7-9684-a4f31ff0083d",
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
  "session_id": "bb833df7-1b96-4d07-8f21-d81cb777808d",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNjksImlhdCI6MTc5MzE5OTQ2OSwianRpIjoiYjBlMDU0NzctMDczOC00NzI5LTgyYmQtNzE3MzNiZDNmNTkxIiwic2lkIjoiYmI4MzNkZjctMWI5Ni00ZDA3LThmMjEtZDgxY2I3Nzc4MDhkIn0.786D_aFzPxHnEZnmz48FMnMMz0C_dVfbtGEcPzvQhE4",
  "access_expires_at": "2026-10-28T15:12:49.570307953Z",
  "refresh_token": "U8lIa_yR5aBNlwG9ojcQQgPtmXrpKRoprthm-FyFqbw",
  "refresh_expires_at": "2026-10-29T02:57:49.569800583Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "bc44e405-81e7-4cd3-aaf3-3e2b081fd8d4",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:57:49Z"
}
```

```json
{
  "id": "62178cb9-8295-4770-a529-8d2d9bc8b656",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:57:49Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/62178cb9-8295-4770-a529-8d2d9bc8b656/publish` → **200**

```json
{
  "command_id": "3432db2b-6d15-467b-ade3-fc634d4f50b1",
  "expected_version": 0
}
```

```json
{
  "id": "62178cb9-8295-4770-a529-8d2d9bc8b656",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:57:49.978541Z",
  "published_at": "2026-10-28T14:57:49.978541Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "62178cb9-8295-4770-a529-8d2d9bc8b656",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:57:49.978541Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631646520",
  "device_ref": "sandbox-17"
}
```

```json
{
  "challenge_id": "031fe2e6-5a38-47a1-8a8c-d1b6c31e320f",
  "expires_at": "2026-10-28T15:02:50.375224901Z",
  "resend_available_at": "2026-10-28T14:57:51.375224901Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631646520` → **200**

```json
{
  "phone": "+380631646520",
  "audience": "CLIENT",
  "code": "800172",
  "sent_at": "2026-10-28T14:57:50.37733837Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "031fe2e6-5a38-47a1-8a8c-d1b6c31e320f",
  "code": "800172",
  "device_ref": "sandbox-17"
}
```

```json
{
  "session_id": "96d7cecf-2425-4902-a74c-861e551e0ea2",
  "subject": {
    "type": "CLIENT",
    "id": "ad7c8568-7ce3-4c83-9e57-39fb518b2ada"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDdjODU2OC03Y2UzLTRjODMtOWU1Ny0zOWZiNTE4YjJhZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzcwLCJpYXQiOjE3OTMxOTk0NzAsImp0aSI6IjU1NjM5MGVhLWU2OTEtNDJmYS05ZGY0LTBlYjA1N2FkMDU5YiIsInNpZCI6Ijk2ZDdjZWNmLTI0MjUtNDkwMi1hNzRjLTg2MWU1NTFlMGVhMiJ9.te02CrX9ipOEk-akpy1V0fLAJ2MtIn3rswXVXR9YHeU",
  "access_expires_at": "2026-10-28T15:12:50.58703545Z",
  "refresh_token": "5RrYgUZo-E8rFXSsgJTWSLEImNFPt9HP5kguTdUrYJ4",
  "refresh_expires_at": "2026-11-27T14:57:50.586595426Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "62178cb9-8295-4770-a529-8d2d9bc8b656",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:57:49.978541Z",
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
  "command_id": "bb6bff4b-ff98-4bca-9b9f-6b31a3851748",
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
  "id": "86f474d0-977d-4a13-a5b9-8f249b88765b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:50.968170Z",
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
  "command_id": "9394b8a8-a155-4299-840b-e69d146f0394",
  "quote_id": "86f474d0-977d-4a13-a5b9-8f249b88765b",
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
  "correlation_id": "60c32e5c-61d6-407b-9be4-0dfa7dc3e20a"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0da65c5e-2191-4f54-bdb8-91918ca499c3",
  "version_id": "62178cb9-8295-4770-a529-8d2d9bc8b656",
  "language": "uk"
}
```

```json
{
  "version_id": "62178cb9-8295-4770-a529-8d2d9bc8b656",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:57:51.37516Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "96f9a531-2dc2-49eb-a299-b9ccf0ed674b",
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
  "id": "9dd9b87e-3da9-4c04-a6c9-1ea407f1f8b2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:51.603215Z",
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
  "command_id": "e060cd16-5b11-4a01-80aa-c2a0bdc4b633",
  "quote_id": "9dd9b87e-3da9-4c04-a6c9-1ea407f1f8b2",
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
  "id": "17b4c4b2-5c7f-4d2a-ade7-051346491548",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad7c8568-7ce3-4c83-9e57-39fb518b2ada",
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
  "created_at": "2026-10-28T14:57:51.82635Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/17b4c4b2-5c7f-4d2a-ade7-051346491548` → **200**

```json
{
  "id": "17b4c4b2-5c7f-4d2a-ade7-051346491548",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad7c8568-7ce3-4c83-9e57-39fb518b2ada",
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
  "created_at": "2026-10-28T14:57:51.82635Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/17b4c4b2-5c7f-4d2a-ade7-051346491548/cancel` → **200**

```json
{
  "command_id": "9507c15c-6c89-418e-8733-3527d5dfa6b3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "17b4c4b2-5c7f-4d2a-ade7-051346491548",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ad7c8568-7ce3-4c83-9e57-39fb518b2ada",
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
  "created_at": "2026-10-28T14:57:51.82635Z",
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

`POST /api/admin/v1/legal-documents/62178cb9-8295-4770-a529-8d2d9bc8b656` → **409**

```json
{
  "command_id": "a815dbc6-3e16-42ef-9beb-42a3ad9cfc75",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:57:52Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/62178cb9-8295-4770-a529-8d2d9bc8b656",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8d12b71a-2e81-4f1a-a7cc-9c2cb977c3ca"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f04c19e7-8a9c-44c7-9cbe-92581b3b4ad0",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:57:52Z"
}
```

```json
{
  "id": "0a6f60c6-3994-444d-a8dd-230a9aa0e9a2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:57:52Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/0a6f60c6-3994-444d-a8dd-230a9aa0e9a2/publish` → **200**

```json
{
  "command_id": "c9c17cb2-8281-447c-82d1-ac43b8b4be67",
  "expected_version": 0
}
```

```json
{
  "id": "0a6f60c6-3994-444d-a8dd-230a9aa0e9a2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:57:52.884936Z",
  "published_at": "2026-10-28T14:57:52.884936Z",
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
  "device_ref": "sandbox-29424"
}
```

```json
{
  "challenge_id": "2cc3f952-273b-4a49-8cc0-64a882813764",
  "expires_at": "2026-10-28T15:02:53.08942595Z",
  "resend_available_at": "2026-10-28T14:57:54.08942595Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "445762",
  "sent_at": "2026-10-28T14:57:53.091619562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2cc3f952-273b-4a49-8cc0-64a882813764",
  "code": "445762",
  "device_ref": "sandbox-29424"
}
```

```json
{
  "session_id": "dcc46d2a-74f4-4246-a2d5-4743b6d46754",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDM3MywiaWF0IjoxNzkzMTk5NDczLCJqdGkiOiIwNzcwZmU3ZC00ZGVkLTQxMDEtYTRjOS0zYzc5NmJiNWI1YjkiLCJzaWQiOiJkY2M0NmQyYS03NGY0LTQyNDYtYTJkNS00NzQzYjZkNDY3NTQifQ.lgiIJCRUH5o9MzoN1U0QDBrnQ_tNl3H_8vidc4WSeP8",
  "access_expires_at": "2026-10-28T15:12:53.298475161Z",
  "refresh_token": "jAewBAFxWvbWQaTxTNB_FOryIzw0i937aVPQjZ477jo",
  "refresh_expires_at": "2026-11-27T14:57:53.297929933Z",
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
  "command_id": "4d584196-2269-4530-b709-fbeece20efdc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:53Z",
    "sequence": 1793199473678
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b3431d8-dab4-4ef6-8ea7-2bf4d46d1768",
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
  "last_heartbeat_at": "2026-10-28T14:57:53.692915Z",
  "last_location_at": "2026-10-28T14:57:53.692915Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673288413",
  "device_ref": "sandbox-17106"
}
```

```json
{
  "challenge_id": "c4b57eec-27fe-4e45-8f36-57292c1eb55f",
  "expires_at": "2026-10-28T15:02:53.887635375Z",
  "resend_available_at": "2026-10-28T14:57:54.887635375Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673288413` → **200**

```json
{
  "phone": "+380673288413",
  "audience": "CLIENT",
  "code": "315163",
  "sent_at": "2026-10-28T14:57:53.88984459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4b57eec-27fe-4e45-8f36-57292c1eb55f",
  "code": "315163",
  "device_ref": "sandbox-17106"
}
```

```json
{
  "session_id": "4945ad3b-e09a-4eb5-93ba-ed1b0002c978",
  "subject": {
    "type": "CLIENT",
    "id": "89753500-470a-4318-87c3-b2b372a38d79"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTc1MzUwMC00NzBhLTQzMTgtODdjMy1iMmIzNzJhMzhkNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzc0LCJpYXQiOjE3OTMxOTk0NzQsImp0aSI6Ijg3NTFmOWNiLTlhZjEtNDY0Yi1hYjhhLWQ4NGQxZDNjNzQwZiIsInNpZCI6IjQ5NDVhZDNiLWUwOWEtNGViNS05M2JhLWVkMWIwMDAyYzk3OCJ9.Tr_WKHMFsRcQv19yj1jEeLeaKwNGJi-aXLbaPMazM8k",
  "access_expires_at": "2026-10-28T15:12:54.096569299Z",
  "refresh_token": "0yzpCK_d_zrEzuucBP4rkdaRp0Q-1Oq1yCsuhv731cs",
  "refresh_expires_at": "2026-11-27T14:57:54.096086702Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "66d58773-fd2d-4eb4-af4a-f5ada29e8975",
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
  "id": "f61d2458-1b0a-470d-b8ea-c3cc29782d17",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:54.289963Z",
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
  "command_id": "e3690e2f-2fbb-4eef-b1b1-278c6f395592",
  "quote_id": "f61d2458-1b0a-470d-b8ea-c3cc29782d17",
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
    "phone": "+380670868355"
  }
}
```

```json
{
  "id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
  "created_at": "2026-10-28T14:57:54.495624Z",
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
    "id": "01855fec-f560-4f7d-89c8-f3600c8d41ea",
    "order_id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
    "expires_at": "2026-10-28T14:58:09.498463Z",
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

`POST /api/driver/v1/offers/01855fec-f560-4f7d-89c8-f3600c8d41ea/accept` → **200**

```json
{
  "command_id": "321423d8-6b31-46d2-ae07-6df94cd8e893"
}
```

```json
{
  "id": "e50d5b6d-d9d9-4c8c-aa60-fb963c8777a0",
  "order_id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2b264d4b-3fdf-4113-a49a-ff614024269a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2b264d4b-3fdf-4113-a49a-ff614024269a",
  "order_id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
  "assignment_id": "e50d5b6d-d9d9-4c8c-aa60-fb963c8777a0",
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
    "phone": "+380670868355"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "09b49792-dad4-487c-943b-51ad8fdac8f0",
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
  "id": "8372884f-2151-4316-b1be-a6750c9fbade",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:55.346318Z",
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
  "command_id": "f8fcf847-c1ac-4fbb-8e24-aa86546ab9e5",
  "quote_id": "8372884f-2151-4316-b1be-a6750c9fbade",
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
  "id": "d8fa7ed3-779b-4416-b786-37c13512aadd",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
  "created_at": "2026-10-28T14:57:55.581202Z",
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
  "command_id": "7806c635-d58f-435e-866f-fed4660ab9ae",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:57:55Z"
}
```

```json
{
  "id": "b4318896-f0e0-4bca-8302-1bf2c6282f66",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:55.833518Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:57:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f519578c-aabe-49b7-aefc-ccdaf7e71ac9",
  "quote_id": "b4318896-f0e0-4bca-8302-1bf2c6282f66",
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
  "pickup_at": "2026-10-28T17:57:55Z"
}
```

```json
{
  "id": "15c167aa-6dc7-4abb-8680-a0dcf7c968fe",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
  "created_at": "2026-10-28T14:57:56.064427Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:57:55Z",
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
  "command_id": "400e73f3-f275-4d8a-b995-7dbdb64befbd",
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
  "id": "512d2542-f327-4f9d-b310-fc5910c6bdd7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:56.298949Z",
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
  "command_id": "562748a6-29cc-4215-a382-222f1afed253",
  "quote_id": "512d2542-f327-4f9d-b310-fc5910c6bdd7",
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
  "correlation_id": "6aa0bb88-7bd0-42cf-9b91-f7ad2c4f991d"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "15c167aa-6dc7-4abb-8680-a0dcf7c968fe",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
      "created_at": "2026-10-28T14:57:56.064427Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:57:55Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d8fa7ed3-779b-4416-b786-37c13512aadd",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
      "created_at": "2026-10-28T14:57:55.581202Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d8fa7ed3-779b-4416-b786-37c13512aadd",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
  "created_at": "2026-10-28T14:57:55.581202Z",
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

`GET /api/rider/v1/orders/db82fcb0-3bcc-4f1d-8c99-82c5020d9126` → **200**

```json
{
  "id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
    "id": "e50d5b6d-d9d9-4c8c-aa60-fb963c8777a0",
    "order_id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2b264d4b-3fdf-4113-a49a-ff614024269a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:57:54.495624Z",
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
    "location_at": "2026-10-28T14:57:53.692915Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/db82fcb0-3bcc-4f1d-8c99-82c5020d9126/cancel` → **200**

```json
{
  "command_id": "63d7ec69-684a-49c1-84e4-8ff542f40cf5",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
    "id": "e50d5b6d-d9d9-4c8c-aa60-fb963c8777a0",
    "order_id": "db82fcb0-3bcc-4f1d-8c99-82c5020d9126",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2b264d4b-3fdf-4113-a49a-ff614024269a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:57:54.495624Z",
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

`GET /api/rider/v1/orders/d8fa7ed3-779b-4416-b786-37c13512aadd` → **200**

```json
{
  "id": "d8fa7ed3-779b-4416-b786-37c13512aadd",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
  "created_at": "2026-10-28T14:57:55.581202Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d8fa7ed3-779b-4416-b786-37c13512aadd/cancel` → **200**

```json
{
  "command_id": "4985b7ad-868d-470f-8afe-12c0f2754f57",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d8fa7ed3-779b-4416-b786-37c13512aadd",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
  "created_at": "2026-10-28T14:57:55.581202Z",
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

`GET /api/rider/v1/orders/15c167aa-6dc7-4abb-8680-a0dcf7c968fe` → **200**

```json
{
  "id": "15c167aa-6dc7-4abb-8680-a0dcf7c968fe",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
  "created_at": "2026-10-28T14:57:56.064427Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:57:55Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/15c167aa-6dc7-4abb-8680-a0dcf7c968fe/cancel` → **200**

```json
{
  "command_id": "1f170df1-2746-4198-9516-fa9eedee2400",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "15c167aa-6dc7-4abb-8680-a0dcf7c968fe",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "89753500-470a-4318-87c3-b2b372a38d79",
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
  "created_at": "2026-10-28T14:57:56.064427Z",
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
  "pickup_at": "2026-10-28T17:57:55Z",
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
  "session_id": "5b3431d8-dab4-4ef6-8ea7-2bf4d46d1768",
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
  "last_heartbeat_at": "2026-10-28T14:57:53.692915Z",
  "last_location_at": "2026-10-28T14:57:53.692915Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b3431d8-dab4-4ef6-8ea7-2bf4d46d1768/close` → **200**

```json
{
  "command_id": "a5b6adbc-03d1-4984-a94d-0cd2f4fd9640",
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

Done: orders db82fcb0-3bcc-4f1d-8c99-82c5020d9126, d8fa7ed3-779b-4416-b786-37c13512aadd, 15c167aa-6dc7-4abb-8680-a0dcf7c968fe.

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
  "session_id": "9242f82f-8b64-4a7a-a728-b724e4f6c5b1",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNzksImlhdCI6MTc5MzE5OTQ3OSwianRpIjoiNDgyZTZkZDctOGE2Mi00MzgxLTljYTQtNTYyNTNmY2Q5MWVlIiwic2lkIjoiOTI0MmY4MmYtOGI2NC00YTdhLWE3MjgtYjcyNGU0ZjZjNWIxIn0.Ovq2si0_hf-Ta2bAAAHIE-TSx2iCD8Ocd9X6PRviLe0",
  "access_expires_at": "2026-10-28T15:12:59.047475811Z",
  "refresh_token": "XEON2HL3hbFd5Q98VtpSdFxTdSdH2r3sHe08Qpe-TYc",
  "refresh_expires_at": "2026-10-29T02:57:59.047046516Z",
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
  "session_id": "d8b5bc6c-6b52-4ecc-82ff-11a43c20d858",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNzksImlhdCI6MTc5MzE5OTQ3OSwianRpIjoiZmE0ZDQ3MjYtZGE0Ni00ZTI1LWJmNmYtYzFjNGU5MDczOTRkIiwic2lkIjoiZDhiNWJjNmMtNmI1Mi00ZWNjLTgyZmYtMTFhNDNjMjBkODU4In0.3P71AgsMuKg__8S_8zCNxDhjOKigbSITsFe27O9evSs",
  "access_expires_at": "2026-10-28T15:12:59.468634734Z",
  "refresh_token": "fKakGQOOgBRJ4Wi_3xYIb1PppX6n9lUOldYFfyIISWI",
  "refresh_expires_at": "2026-10-29T02:57:59.468127583Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3084"
}
```

```json
{
  "challenge_id": "c207fb10-e732-447a-9697-63cdd8313c5e",
  "expires_at": "2026-10-28T15:02:59.667189462Z",
  "resend_available_at": "2026-10-28T14:58:00.667189462Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "531581",
  "sent_at": "2026-10-28T14:57:59.669446525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c207fb10-e732-447a-9697-63cdd8313c5e",
  "code": "531581",
  "device_ref": "sandbox-3084"
}
```

```json
{
  "session_id": "e9fb192e-fb76-45d4-8004-66c4bd696c83",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDM3OSwiaWF0IjoxNzkzMTk5NDc5LCJqdGkiOiIxMDliN2JmMS1mNmE0LTQwMTMtYjhhMi1lMDY4MjMxZDI0ZmEiLCJzaWQiOiJlOWZiMTkyZS1mYjc2LTQ1ZDQtODAwNC02NmM0YmQ2OTZjODMifQ.NAosGcdFtt26uuus4yu2ZrBHis0cmH9TeArPN2OEgIQ",
  "access_expires_at": "2026-10-28T15:12:59.871685259Z",
  "refresh_token": "rwL83TJXwiuL4rZ3l2gMPaEFiSbSwmuPNpJm5e5KFH0",
  "refresh_expires_at": "2026-11-27T14:57:59.871271097Z",
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
  "command_id": "fd66504e-c2f9-4b60-8afe-25a450eee4e7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:00Z",
    "sequence": 1793199480242
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d30aec31-e801-4d31-8af9-87673fbed7af",
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
  "last_heartbeat_at": "2026-10-28T14:58:00.256827Z",
  "last_location_at": "2026-10-28T14:58:00.256827Z",
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
  "command_id": "2dbf9cb1-950d-4c9b-8934-62aafed18df9",
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
  "effective_at": "2026-10-28T14:58:00.659111Z",
  "changed_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:55:51.753382Z",
  "last_entries": [
    {
      "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T14:55:51.753382Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "984ecc22-6c16-46f5-aa2c-aaf08c8fb1e5",
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
  "id": "947cd556-0848-406e-9e50-2d715b546e8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:03:01.070239Z",
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
  "command_id": "63568415-32bb-4644-8993-8cee6e4f992a",
  "quote_id": "947cd556-0848-406e-9e50-2d715b546e8e",
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
    "phone": "+3806711126643"
  }
}
```

```json
{
  "id": "e4694df1-62c3-4331-bbeb-7a0b81a80d56",
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
  "created_at": "2026-10-28T14:58:01.271958Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126643"
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
    "id": "4d889922-93c6-4cf0-8958-ab7c72947e21",
    "order_id": "e4694df1-62c3-4331-bbeb-7a0b81a80d56",
    "expires_at": "2026-10-28T14:58:16.27427Z",
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

`POST /api/driver/v1/offers/4d889922-93c6-4cf0-8958-ab7c72947e21/accept` → **200**

```json
{
  "command_id": "61b03d95-20d6-4c8c-8972-3096fda4e7dc"
}
```

```json
{
  "id": "f2c27826-1e5c-43d6-891f-52fb817ff9e8",
  "order_id": "e4694df1-62c3-4331-bbeb-7a0b81a80d56",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4921a2ad-7110-4f63-b418-c035891395b2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4921a2ad-7110-4f63-b418-c035891395b2",
  "order_id": "e4694df1-62c3-4331-bbeb-7a0b81a80d56",
  "assignment_id": "f2c27826-1e5c-43d6-891f-52fb817ff9e8",
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
    "phone": "+3806711126643"
  }
}
```

`POST /api/driver/v1/work-sessions/d30aec31-e801-4d31-8af9-87673fbed7af/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:02Z",
    "sequence": 1793199482622
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d30aec31-e801-4d31-8af9-87673fbed7af",
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
  "last_heartbeat_at": "2026-10-28T14:58:02.078003Z",
  "last_location_at": "2026-10-28T14:58:02.078003Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4921a2ad-7110-4f63-b418-c035891395b2/arrive` → **200**

```json
{
  "command_id": "7c618dbe-a75e-458a-a9a0-d792dbd7a184",
  "expected_version": 0
}
```

```json
{
  "id": "4921a2ad-7110-4f63-b418-c035891395b2",
  "order_id": "e4694df1-62c3-4331-bbeb-7a0b81a80d56",
  "assignment_id": "f2c27826-1e5c-43d6-891f-52fb817ff9e8",
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
  "arrived_at": "2026-10-28T14:58:02.282912Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711126643"
  }
}
```

`POST /api/driver/v1/trips/4921a2ad-7110-4f63-b418-c035891395b2/start` → **200**

```json
{
  "command_id": "6dc48331-2fc2-4d1a-98e9-942b0ce2c6bc",
  "expected_version": 1
}
```

```json
{
  "id": "4921a2ad-7110-4f63-b418-c035891395b2",
  "order_id": "e4694df1-62c3-4331-bbeb-7a0b81a80d56",
  "assignment_id": "f2c27826-1e5c-43d6-891f-52fb817ff9e8",
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
  "arrived_at": "2026-10-28T14:58:02.282912Z",
  "started_at": "2026-10-28T14:58:02.501949Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711126643"
  }
}
```

`POST /api/driver/v1/trips/4921a2ad-7110-4f63-b418-c035891395b2/complete` → **200**

```json
{
  "command_id": "c7e14b17-4d6d-429e-aa09-ece6b05af66b",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:58:02Z",
  "cash_received": true
}
```

```json
{
  "id": "4921a2ad-7110-4f63-b418-c035891395b2",
  "order_id": "e4694df1-62c3-4331-bbeb-7a0b81a80d56",
  "assignment_id": "f2c27826-1e5c-43d6-891f-52fb817ff9e8",
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
  "arrived_at": "2026-10-28T14:58:02.282912Z",
  "started_at": "2026-10-28T14:58:02.501949Z",
  "completed_at": "2026-10-28T14:58:02.70922Z",
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
  "command_id": "5bf739d1-257d-42d9-970a-13d989ba4a82",
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
  "id": "3d245b0b-2270-46f1-a5c7-e225bae88e8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:03:02.928409Z",
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
  "command_id": "e69373bb-230f-4013-8501-c52fe705f613",
  "quote_id": "3d245b0b-2270-46f1-a5c7-e225bae88e8e",
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
    "phone": "+3806711122999"
  }
}
```

```json
{
  "id": "301b7d01-304d-4656-ac2c-d9a0659698b4",
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
  "created_at": "2026-10-28T14:58:03.162952Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122999"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/301b7d01-304d-4656-ac2c-d9a0659698b4` → **200**

```json
{
  "id": "301b7d01-304d-4656-ac2c-d9a0659698b4",
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
  "created_at": "2026-10-28T14:58:03.162952Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122999"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/301b7d01-304d-4656-ac2c-d9a0659698b4/cancel` → **200**

```json
{
  "command_id": "af88a088-222c-46d2-9aea-b5dc5ca0f272",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "301b7d01-304d-4656-ac2c-d9a0659698b4",
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
  "created_at": "2026-10-28T14:58:03.162952Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122999"
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
  "staff_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:55:51.753382Z",
  "last_entries": [
    {
      "order_id": "301b7d01-304d-4656-ac2c-d9a0659698b4",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:58:03.599946Z"
    },
    {
      "order_id": "e4694df1-62c3-4331-bbeb-7a0b81a80d56",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:58:02.713512Z"
    },
    {
      "order_id": "5b229e31-b492-4da0-9d37-9fbdaa66ab77",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T14:55:51.753382Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d30aec31-e801-4d31-8af9-87673fbed7af",
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
  "last_heartbeat_at": "2026-10-28T14:58:02.078003Z",
  "last_location_at": "2026-10-28T14:58:02.078003Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d30aec31-e801-4d31-8af9-87673fbed7af/close` → **200**

```json
{
  "command_id": "636af187-83eb-4090-b302-f0db1d448f39",
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

Done: operator bonus for fulfilled e4694df1-62c3-4331-bbeb-7a0b81a80d56 and operator-fault cancellation 301b7d01-304d-4656-ac2c-d9a0659698b4.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677354384",
  "device_ref": "sandbox-5288"
}
```

```json
{
  "challenge_id": "fe0db83f-324f-422f-b757-742106aa44ac",
  "expires_at": "2026-10-28T15:03:06.434968404Z",
  "resend_available_at": "2026-10-28T14:58:07.434968404Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677354384` → **200**

```json
{
  "phone": "+380677354384",
  "audience": "CLIENT",
  "code": "958017",
  "sent_at": "2026-10-28T14:58:06.43714397Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675762389",
  "device_ref": "sandbox-13385",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0a5fe7b5-2e0f-4363-baa6-38413e5e7c79",
  "expires_at": "2026-10-28T15:03:06.650713746Z",
  "resend_available_at": "2026-10-28T14:58:07.650713746Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675762389` → **200**

```json
{
  "phone": "+380675762389",
  "audience": "CLIENT",
  "code": "465597",
  "sent_at": "2026-10-28T14:58:06.653030089Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674400000",
  "device_ref": "sandbox-1108"
}
```

```json
{
  "challenge_id": "8d20f3be-26c7-4bd7-a7f3-fd615764d7e3",
  "expires_at": "2026-10-28T15:03:06.860920359Z",
  "resend_available_at": "2026-10-28T14:58:07.860920359Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674400000` → **200**

```json
{
  "phone": "+380674400000",
  "audience": "CLIENT",
  "code": "254261",
  "sent_at": "2026-10-28T14:58:06.863980388Z",
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
  "session_id": "25960dfa-1852-43ac-a787-5da604d92592",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzODcsImlhdCI6MTc5MzE5OTQ4NywianRpIjoiZjM5ZmJmYjMtNDkzMy00NWY5LTg2ZGUtYmZmNzZhZjIxZjRmIiwic2lkIjoiMjU5NjBkZmEtMTg1Mi00M2FjLWE3ODctNWRhNjA0ZDkyNTkyIn0.FPUFmtuYPISkwcpGsR6TxeIZuTb8wgRzxFG2yLdWkV8",
  "access_expires_at": "2026-10-28T15:13:07.308540504Z",
  "refresh_token": "sbTYrbKT2_91dQCDIPV3u1k-5lxV6NyO2O9JBmQxmv0",
  "refresh_expires_at": "2026-10-29T02:58:07.308010708Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674400000` → **200**

```json
{
  "deliveries": [
    {
      "id": "6c91f977-cc7d-48ea-b700-a43cd8132bb4",
      "challenge_id": "8d20f3be-26c7-4bd7-a7f3-fd615764d7e3",
      "phone": "+380674400000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-54505a8a-8fd9-4d06-b2e2-f8ec1a7b1e6d",
      "error": null,
      "attempted_at": "2026-10-28T14:58:06.864263Z"
    },
    {
      "id": "691a661b-dc03-4cb2-a3e1-9e9b9afc15c6",
      "challenge_id": "8d20f3be-26c7-4bd7-a7f3-fd615764d7e3",
      "phone": "+380674400000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:58:06.863437Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674400000` → **200**

```json
{
  "phone": "+380674400000",
  "audience": "CLIENT",
  "code": "254261",
  "sent_at": "2026-10-28T14:58:06.863980388Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675762389` → **200**

```json
{
  "deliveries": [
    {
      "id": "ffd4fd26-ff28-4781-b601-d820753eee58",
      "challenge_id": "0a5fe7b5-2e0f-4363-baa6-38413e5e7c79",
      "phone": "+380675762389",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0d3eae11-1e69-48dc-affd-0565c457dc79",
      "error": null,
      "attempted_at": "2026-10-28T14:58:06.653315Z"
    }
  ]
}
```

Done: SMS to +380677354384, a call to +380675762389, SMS then a call to +380674400000.

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
  "session_id": "c2b75908-31f9-46a9-bb09-a68e3d835d52",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzODgsImlhdCI6MTc5MzE5OTQ4OCwianRpIjoiOTg3ZmJhZWItNDBkOS00M2NjLWI3ZDQtMjI4YjRkZDMyNjVmIiwic2lkIjoiYzJiNzU5MDgtMzFmOS00NmE5LWJiMDktYTY4ZTNkODM1ZDUyIn0.S-Qv_Ns_YPhzCDjZIrv0Lnw4qu1QT5RTTCSdOV3uiXc",
  "access_expires_at": "2026-10-28T15:13:08.156351853Z",
  "refresh_token": "xkfumUaJf7P1jHWhn6q4EKi9ti1pFkHwU1JHqt5WXlY",
  "refresh_expires_at": "2026-10-29T02:58:08.155943583Z",
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
  "session_id": "ad64e266-2296-4b20-802c-65f7f1b24d5a",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzODgsImlhdCI6MTc5MzE5OTQ4OCwianRpIjoiMGJmODViOGQtYjIxMi00NDYwLWEzOTItMDdjZThiMTMyZWY1Iiwic2lkIjoiYWQ2NGUyNjYtMjI5Ni00YjIwLTgwMmMtNjVmN2YxYjI0ZDVhIn0.DlGxexv2IAEk3rwFYDupj_gAhQ1765ZI7vsvOzlkbwk",
  "access_expires_at": "2026-10-28T15:13:08.58067205Z",
  "refresh_token": "NK0GnG7yFIKEznwlPyTLTxGewvlf0aBvFPopiOCMUAI",
  "refresh_expires_at": "2026-10-29T02:58:08.580110772Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
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

`POST /api/admin/v1/staff-extensions/f8036a86-0ab9-499f-bef0-2e0581f98d2c` → **200**

```json
{
  "command_id": "25c1d0cf-dd39-4a6e-86ce-9639192334ae",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "c51ffc8a-44a9-458b-b707-6271da1d5abd",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:58:09.399439Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:58:09.399439Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "baf7f4a7-8656-4224-b91f-b10eebf8b8c0",
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
  "id": "09bcbea8-47fe-49d2-bb8c-4e75313a9f29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:03:09.851092Z",
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
  "command_id": "be2ac818-a28b-4ca6-b22b-46060cfd5ab7",
  "quote_id": "09bcbea8-47fe-49d2-bb8c-4e75313a9f29",
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
    "phone": "+380671801941"
  }
}
```

```json
{
  "id": "7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6",
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
  "created_at": "2026-10-28T14:58:10.080097Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671801941"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6/calls` → **201**

```json
{
  "command_id": "408d155e-5152-432f-8018-5a478998570a",
  "to": "CALLER"
}
```

```json
{
  "id": "49e99c28-8a0b-45b8-94d6-419880171f10",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "order_ids": [
    "7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6"
  ],
  "started_at": "2026-10-28T14:58:10.329602Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6/calls` → **201**

```json
{
  "command_id": "408d155e-5152-432f-8018-5a478998570a",
  "to": "CALLER"
}
```

```json
{
  "id": "49e99c28-8a0b-45b8-94d6-419880171f10",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "order_ids": [
    "7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6"
  ],
  "started_at": "2026-10-28T14:58:10.329602Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "49e99c28-8a0b-45b8-94d6-419880171f10",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671801941",
    "at": "2026-10-28T14:58:10.331471045Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "49e99c28-8a0b-45b8-94d6-419880171f10",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.26758",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "49e99c28-8a0b-45b8-94d6-419880171f10"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "49e99c28-8a0b-45b8-94d6-419880171f10",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6` → **200**

```json
{
  "calls": [
    {
      "id": "49e99c28-8a0b-45b8-94d6-419880171f10",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_ids": [
        "7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6"
      ],
      "started_at": "2026-10-28T14:58:10.329602Z",
      "answered_at": "2026-10-28T14:58:10.825799Z",
      "ended_at": "2026-10-28T14:58:10.843218Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6` → **200**

```json
{
  "calls": [
    {
      "id": "49e99c28-8a0b-45b8-94d6-419880171f10",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_ids": [
        "7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6"
      ],
      "started_at": "2026-10-28T14:58:10.329602Z",
      "answered_at": "2026-10-28T14:58:10.825799Z",
      "ended_at": "2026-10-28T14:58:10.843218Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6` → **200**

```json
{
  "calls": [
    {
      "id": "49e99c28-8a0b-45b8-94d6-419880171f10",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "order_ids": [
        "7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6"
      ],
      "started_at": "2026-10-28T14:58:10.329602Z",
      "answered_at": "2026-10-28T14:58:10.825799Z",
      "ended_at": "2026-10-28T14:58:10.843218Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:58:13.529786Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6` → **200**

```json
{
  "id": "7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6",
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
  "created_at": "2026-10-28T14:58:10.080097Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671801941"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6/cancel` → **200**

```json
{
  "command_id": "465bdf83-261f-4ae8-9c13-d1509811f844",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6",
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
  "created_at": "2026-10-28T14:58:10.080097Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671801941"
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
  "command_id": "96a190a8-a0e5-4ecc-bcb5-f2f93aadce38",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:58:15.963237Z",
  "extension": "101"
}
```

Done: outgoing call 49e99c28-8a0b-45b8-94d6-419880171f10 from order 7cb2ec51-f009-48e4-aa77-1db1f7bc6dd6, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635657090",
  "device_ref": "sandbox-23489"
}
```

```json
{
  "challenge_id": "3b52019d-fb77-48af-8bb0-96fa01cac4fc",
  "expires_at": "2026-10-28T15:03:16.172993849Z",
  "resend_available_at": "2026-10-28T14:58:17.172993849Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635657090` → **200**

```json
{
  "phone": "+380635657090",
  "audience": "CLIENT",
  "code": "091492",
  "sent_at": "2026-10-28T14:58:16.175495542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b52019d-fb77-48af-8bb0-96fa01cac4fc",
  "code": "091492",
  "device_ref": "sandbox-23489"
}
```

```json
{
  "session_id": "e2065b62-fb7e-41c7-a42d-e8deba5b5477",
  "subject": {
    "type": "CLIENT",
    "id": "c46dc94a-014b-4524-8110-00c28b0c847a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDZkYzk0YS0wMTRiLTQ1MjQtODExMC0wMGMyOGIwYzg0N2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzk2LCJpYXQiOjE3OTMxOTk0OTYsImp0aSI6ImM1MTExMmFmLTQ0MzUtNGUyMy1iNjk2LWQ5YTExY2E5NDE4MiIsInNpZCI6ImUyMDY1YjYyLWZiN2UtNDFjNy1hNDJkLWU4ZGViYTViNTQ3NyJ9.kRboL-OZxPEws4tw2zaknBorknoqOj8eufQCAxP63SQ",
  "access_expires_at": "2026-10-28T15:13:16.390779853Z",
  "refresh_token": "F5NEqICZCfG0YXQ4o2ir8xJG8ZQcLPQUfkBjlUEIR3s",
  "refresh_expires_at": "2026-11-27T14:58:16.390252237Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c46dc94a-014b-4524-8110-00c28b0c847a",
  "session_id": "e2065b62-fb7e-41c7-a42d-e8deba5b5477",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635657090",
  "device_ref": "sandbox-13684"
}
```

```json
{
  "challenge_id": "6aab73ae-45cd-4bc2-afce-67246f8b9af9",
  "expires_at": "2026-10-28T15:03:18.768471668Z",
  "resend_available_at": "2026-10-28T14:58:19.768471668Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635657090` → **200**

```json
{
  "phone": "+380635657090",
  "audience": "CLIENT",
  "code": "484278",
  "sent_at": "2026-10-28T14:58:18.770443259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6aab73ae-45cd-4bc2-afce-67246f8b9af9",
  "code": "484278",
  "device_ref": "sandbox-13684"
}
```

```json
{
  "session_id": "c78807e4-5c44-4e36-b452-00a0150df533",
  "subject": {
    "type": "CLIENT",
    "id": "c46dc94a-014b-4524-8110-00c28b0c847a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDZkYzk0YS0wMTRiLTQ1MjQtODExMC0wMGMyOGIwYzg0N2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzk4LCJpYXQiOjE3OTMxOTk0OTgsImp0aSI6ImM5ZmJjNjJkLTIyMzItNDkxZC05ZTU2LTIxNGZmYzk4ZWFhYSIsInNpZCI6ImM3ODgwN2U0LTVjNDQtNGUzNi1iNDUyLTAwYTAxNTBkZjUzMyJ9.CAe560EuKMVYPMBid_LG89ta46vZKzcdJMZnjK2MDsI",
  "access_expires_at": "2026-10-28T15:13:18.9809657Z",
  "refresh_token": "JSwMpTmAVXBAmbvQBEiR1JHKq7mtF2iSI0G6-bh3C9s",
  "refresh_expires_at": "2026-11-27T14:58:18.980533249Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "a966638f-d4fe-41a8-9da3-573e3fac6314",
  "expires_at": "2026-10-28T15:03:21.179672138Z",
  "resend_available_at": "2026-10-28T14:58:22.179672138Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635657090` → **200**

```json
{
  "phone": "+380635657090",
  "audience": "CLIENT",
  "code": "190042",
  "sent_at": "2026-10-28T14:58:21.182203128Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630634492"
}
```

```json
{
  "challenge_id": "b9034700-edd7-4dc6-b253-d6c5c1734b29",
  "expires_at": "2026-10-28T15:03:21.397620955Z",
  "resend_available_at": "2026-10-28T14:58:22.397620955Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630634492` → **200**

```json
{
  "phone": "+380630634492",
  "audience": "CLIENT",
  "code": "307649",
  "sent_at": "2026-10-28T14:58:21.399077247Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "7a5f9ca6-fd11-4e54-9c2a-16740e4ce949",
  "current_challenge_id": "a966638f-d4fe-41a8-9da3-573e3fac6314",
  "current_code": "000000",
  "new_challenge_id": "b9034700-edd7-4dc6-b253-d6c5c1734b29",
  "new_code": "307649"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b54df0b6-ae05-4f47-af5e-57a1b8629edf"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "4b5fa283-7a2d-47ef-a295-14d884d464e3",
  "current_challenge_id": "a966638f-d4fe-41a8-9da3-573e3fac6314",
  "current_code": "190042",
  "new_challenge_id": "b9034700-edd7-4dc6-b253-d6c5c1734b29",
  "new_code": "307649"
}
```

```json
{
  "subject_id": "c46dc94a-014b-4524-8110-00c28b0c847a",
  "phone": "+380630634492",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c46dc94a-014b-4524-8110-00c28b0c847a",
  "session_id": "e2065b62-fb7e-41c7-a42d-e8deba5b5477",
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
  "correlation_id": "ef52c56a-99a1-4649-9190-6ee355602840"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630634492",
  "device_ref": "sandbox-32747"
}
```

```json
{
  "challenge_id": "6f8c549f-b905-4d3e-b9a3-a6a41b898e1c",
  "expires_at": "2026-10-28T15:03:24.413391215Z",
  "resend_available_at": "2026-10-28T14:58:25.413391215Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630634492` → **200**

```json
{
  "phone": "+380630634492",
  "audience": "CLIENT",
  "code": "778929",
  "sent_at": "2026-10-28T14:58:24.415585209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f8c549f-b905-4d3e-b9a3-a6a41b898e1c",
  "code": "778929",
  "device_ref": "sandbox-32747"
}
```

```json
{
  "session_id": "1fe443ea-6d48-4c8a-90a1-207e3d9ba1d6",
  "subject": {
    "type": "CLIENT",
    "id": "c46dc94a-014b-4524-8110-00c28b0c847a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDZkYzk0YS0wMTRiLTQ1MjQtODExMC0wMGMyOGIwYzg0N2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDA0LCJpYXQiOjE3OTMxOTk1MDQsImp0aSI6ImJkYmNhZTAwLTA1NTUtNDY3Yi05NGU5LTIzNjdmZjY4Y2ZkYiIsInNpZCI6IjFmZTQ0M2VhLTZkNDgtNGM4YS05MGExLTIwN2UzZDliYTFkNiJ9.jiMPxjomtBzdmlxqjkkxy6tRDQaOE4Nt9R_sJVzmDmw",
  "access_expires_at": "2026-10-28T15:13:24.624917226Z",
  "refresh_token": "kNL_8tGYrEg1ShYAcWZORDJkOfmR4JrLF7UMKXFAqDw",
  "refresh_expires_at": "2026-11-27T14:58:24.624519122Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c46dc94a-014b-4524-8110-00c28b0c847a",
  "session_id": "1fe443ea-6d48-4c8a-90a1-207e3d9ba1d6",
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
  "session_id": "4e1715f2-0708-485b-959f-23a17bfcf780",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MDUsImlhdCI6MTc5MzE5OTUwNSwianRpIjoiOTJmNmUwZDAtMzYxYy00NDczLWFhZDEtMDQxNjNlMTA5NjE4Iiwic2lkIjoiNGUxNzE1ZjItMDcwOC00ODViLTk1OWYtMjNhMTdiZmNmNzgwIn0.IQOZPvYJzPrY5SMCKbX03tKW5uh-mJbsedJxCk06v_U",
  "access_expires_at": "2026-10-28T15:13:25.237268464Z",
  "refresh_token": "GIs8nA7Hn1PnqXOPZX6oxOB7W4-iQuEJsIoHiN1P2F4",
  "refresh_expires_at": "2026-10-29T02:58:25.23661443Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/c46dc94a-014b-4524-8110-00c28b0c847a` → **200**

```json
{
  "client": {
    "id": "c46dc94a-014b-4524-8110-00c28b0c847a",
    "phone": "+380630634492",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:58:16.38871Z",
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

`POST /api/admin/v1/clients/c46dc94a-014b-4524-8110-00c28b0c847a/phone` → **400**

```json
{
  "command_id": "1da172d7-5811-476a-8452-dca1ca7d4177",
  "expected_version": 3,
  "phone": "+380630082110",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c46dc94a-014b-4524-8110-00c28b0c847a/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "49516fe9-7d0d-46bd-8b15-8b4e20484915",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/c46dc94a-014b-4524-8110-00c28b0c847a/phone` → **200**

```json
{
  "command_id": "ad0e61ba-b86a-414b-a681-750d421f8f34",
  "expected_version": 3,
  "phone": "+380630082110",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "c46dc94a-014b-4524-8110-00c28b0c847a",
  "phone": "+380630082110",
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
  "correlation_id": "eab6fc69-5dd8-4f82-80a8-adfb8377004c"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630082110",
  "device_ref": "sandbox-22887"
}
```

```json
{
  "challenge_id": "cb347f96-dc6c-41ac-9974-43f913209fe9",
  "expires_at": "2026-10-28T15:03:26.239479477Z",
  "resend_available_at": "2026-10-28T14:58:27.239479477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630082110` → **200**

```json
{
  "phone": "+380630082110",
  "audience": "CLIENT",
  "code": "761415",
  "sent_at": "2026-10-28T14:58:26.241732978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb347f96-dc6c-41ac-9974-43f913209fe9",
  "code": "761415",
  "device_ref": "sandbox-22887"
}
```

```json
{
  "session_id": "59bd61c7-cc8a-414b-8216-59cb59a958a4",
  "subject": {
    "type": "CLIENT",
    "id": "c46dc94a-014b-4524-8110-00c28b0c847a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDZkYzk0YS0wMTRiLTQ1MjQtODExMC0wMGMyOGIwYzg0N2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDA2LCJpYXQiOjE3OTMxOTk1MDYsImp0aSI6ImM4ZmJmMzEyLTdkZWYtNDFkZC1hNWZiLTRmY2E0NWFlMTNkOSIsInNpZCI6IjU5YmQ2MWM3LWNjOGEtNDE0Yi04MjE2LTU5Y2I1OWE5NThhNCJ9.fLsZV2jP-7TyGWv9im1owZtDLGaoBl4STZu_7NvRmrg",
  "access_expires_at": "2026-10-28T15:13:26.486559955Z",
  "refresh_token": "fkUDCfE3xe_5eLF3K_KNg49Q5jW7a5zhFvln17U3PWY",
  "refresh_expires_at": "2026-11-27T14:58:26.485873403Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c46dc94a-014b-4524-8110-00c28b0c847a",
  "session_id": "59bd61c7-cc8a-414b-8216-59cb59a958a4",
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
  "phone": "+380635126706",
  "device_ref": "sandbox-8858"
}
```

```json
{
  "challenge_id": "18fcedea-fb4f-47d4-997f-032ff2d52d0a",
  "expires_at": "2026-10-28T15:03:26.888593385Z",
  "resend_available_at": "2026-10-28T14:58:27.888593385Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635126706` → **200**

```json
{
  "phone": "+380635126706",
  "audience": "CLIENT",
  "code": "810278",
  "sent_at": "2026-10-28T14:58:26.89048227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18fcedea-fb4f-47d4-997f-032ff2d52d0a",
  "code": "810278",
  "device_ref": "sandbox-8858"
}
```

```json
{
  "session_id": "9d746a6a-99ad-47dd-93ca-a7358b3c8bd0",
  "subject": {
    "type": "CLIENT",
    "id": "96867094-0acf-4709-8484-fa02b4d57dce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Njg2NzA5NC0wYWNmLTQ3MDktODQ4NC1mYTAyYjRkNTdkY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDA3LCJpYXQiOjE3OTMxOTk1MDcsImp0aSI6IjBlNmRkN2YxLTQzODUtNDliNS04N2Y3LTQxYWE3MGFhYmJkMSIsInNpZCI6IjlkNzQ2YTZhLTk5YWQtNDdkZC05M2NhLWE3MzU4YjNjOGJkMCJ9.dwEr1bNggz-kQt_vPaiSLOtfrqj6KyJAYcWVRHhmXfA",
  "access_expires_at": "2026-10-28T15:13:27.100338789Z",
  "refresh_token": "gSrtgPFeIbiJa1olORVw5TaVZa5UqtNbOx51itBx2BE",
  "refresh_expires_at": "2026-11-27T14:58:27.099927767Z",
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
  "session_id": "901a94f3-b884-4164-86b8-62ec9f46f127",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MDcsImlhdCI6MTc5MzE5OTUwNywianRpIjoiNjlmMmY4NmEtNTY0Ni00ZmFiLWEyYWItMzM1ZDQ0NTliNmE0Iiwic2lkIjoiOTAxYTk0ZjMtYjg4NC00MTY0LTg2YjgtNjJlYzlmNDZmMTI3In0.jjG0OGXeFkFZ-dmkAYWCaOyI8mYN-DKmjHNXYM7crHM",
  "access_expires_at": "2026-10-28T15:13:27.926834494Z",
  "refresh_token": "cJsLVXaTMVLfKzCNymjaU2LknJF2UnajjVv4YpmCiac",
  "refresh_expires_at": "2026-10-29T02:58:27.926297084Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635126706` → **200**

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
  "correlation_id": "274d4b76-72ec-4069-a725-a71a6e7a1530"
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
  "session_id": "f5b3081c-babf-4220-98e7-3dc6ea487d01",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MDgsImlhdCI6MTc5MzE5OTUwOCwianRpIjoiYWNiZTNmMDEtZWJiNi00MTNhLWE2ZDYtZDI0OTZjZDEzODRmIiwic2lkIjoiZjViMzA4MWMtYmFiZi00MjIwLTk4ZTctM2RjNmVhNDg3ZDAxIn0.-Z9XZW2YP3V8LbaqHYJeLsUJVfqSwBcP4lBlYwYaFjg",
  "access_expires_at": "2026-10-28T15:13:28.758786033Z",
  "refresh_token": "KzFshx2QOtp5RCFp1kYhXdnW_bTT5aiDPHTX6Sgsv7o",
  "refresh_expires_at": "2026-10-29T02:58:28.758351794Z",
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
  "command_id": "79600525-2bc2-44d0-80fd-7e2c493afdd9",
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
  "changed_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T14:58:29.159619495Z"
}
```

## The rider books the airport for 2026-10-28T17:58:28Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600250773",
  "device_ref": "sandbox-29467"
}
```

```json
{
  "challenge_id": "b846a295-ab6c-40f7-b468-1b6ff262d6e9",
  "expires_at": "2026-10-28T15:03:29.362931355Z",
  "resend_available_at": "2026-10-28T14:58:30.362931355Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600250773` → **200**

```json
{
  "phone": "+48600250773",
  "audience": "CLIENT",
  "code": "874001",
  "sent_at": "2026-10-28T14:58:29.364826203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b846a295-ab6c-40f7-b468-1b6ff262d6e9",
  "code": "874001",
  "device_ref": "sandbox-29467"
}
```

```json
{
  "session_id": "bac3d754-f834-4c48-96b6-41435e9861cb",
  "subject": {
    "type": "CLIENT",
    "id": "c67be7d0-d3b4-4654-8625-bf8accd3a7f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjdiZTdkMC1kM2I0LTQ2NTQtODYyNS1iZjhhY2NkM2E3ZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDA5LCJpYXQiOjE3OTMxOTk1MDksImp0aSI6IjdmZWY3NGJlLTk5YTUtNGMwZS05MGFmLTNkYzBjMTM5ODI2YyIsInNpZCI6ImJhYzNkNzU0LWY4MzQtNGM0OC05NmI2LTQxNDM1ZTk4NjFjYiJ9.i6HD1Kd4I3I9AmgXTTO9UwQk8Sej1UcJ_Fy9Yyd3dpA",
  "access_expires_at": "2026-10-28T15:13:29.575697528Z",
  "refresh_token": "bzoxzNtD3t0LjeBcbru-rOsIK9SCBE_6AnwuzHPZ_J0",
  "refresh_expires_at": "2026-11-27T14:58:29.575179923Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0c98597f-2934-4540-9430-f8626b589984",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T17:58:28Z"
}
```

```json
{
  "id": "8275c1b1-7b67-4b0e-a710-208f695d2795",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:03:29.774997Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:58:28Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4c7cf6f6-858f-49c5-abc0-1ea7fd53e53f",
  "quote_id": "8275c1b1-7b67-4b0e-a710-208f695d2795",
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
  "pickup_at": "2026-10-28T17:58:28Z"
}
```

```json
{
  "id": "d6080086-62f4-401a-820b-d87cc0c5a855",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c67be7d0-d3b4-4654-8625-bf8accd3a7f7",
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
  "created_at": "2026-10-28T14:58:29.982093Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:58:28Z",
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
  "device_ref": "sandbox-27511"
}
```

```json
{
  "challenge_id": "89836a01-de7c-46b2-9830-8f1992e5bb0e",
  "expires_at": "2026-10-28T15:03:30.182280087Z",
  "resend_available_at": "2026-10-28T14:58:31.182280087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "813426",
  "sent_at": "2026-10-28T14:58:30.18456487Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89836a01-de7c-46b2-9830-8f1992e5bb0e",
  "code": "813426",
  "device_ref": "sandbox-27511"
}
```

```json
{
  "session_id": "22e142ec-4f37-414f-84e3-b4b9bd5b4213",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQxMCwiaWF0IjoxNzkzMTk5NTEwLCJqdGkiOiIwYWFhYjc1YS1mMGM2LTQ1YWMtODdlZi05YWMwMWMzOTNiODkiLCJzaWQiOiIyMmUxNDJlYy00ZjM3LTQxNGYtODRlMy1iNGI5YmQ1YjQyMTMifQ.rSo_uktoOn-SZVRsN3T6HyGfJa3EBRSu8qj0a-TsaB4",
  "access_expires_at": "2026-10-28T15:13:30.395104323Z",
  "refresh_token": "YgZq72Oh_yxpgqI7PQ-VPhjf3OGOZNdQSnOZblkN9N4",
  "refresh_expires_at": "2026-11-27T14:58:30.39459388Z",
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
  "command_id": "ba26c81c-29f0-4fd6-8539-59330d7cfa33",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:30Z",
    "sequence": 1793199510777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0e718c43-e80a-45f3-8caf-70d1e56d61c7",
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
  "last_heartbeat_at": "2026-10-28T14:58:30.791887Z",
  "last_location_at": "2026-10-28T14:58:30.791887Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d6080086-62f4-401a-820b-d87cc0c5a855",
      "short_number": 20,
      "pickup_at": "2026-10-28T17:58:28Z",
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

`POST /api/driver/v1/preorders/d6080086-62f4-401a-820b-d87cc0c5a855/reserve` → **200**

```json
{
  "command_id": "f0eb5213-dfe5-46f6-a62d-d3cdcfb1fd4b"
}
```

```json
{
  "id": "18de7417-a3b4-4d83-9e32-b987113525ab",
  "state": "RESERVED",
  "order": {
    "order_id": "d6080086-62f4-401a-820b-d87cc0c5a855",
    "short_number": 20,
    "pickup_at": "2026-10-28T17:58:28Z",
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
  "reserved_at": "2026-10-28T14:58:31.180942Z",
  "confirm_from": "2026-10-28T17:28:28Z",
  "confirm_until": "2026-10-28T17:38:28Z",
  "drop_until": "2026-10-28T16:58:28Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "18de7417-a3b4-4d83-9e32-b987113525ab",
      "state": "RESERVED",
      "order": {
        "order_id": "d6080086-62f4-401a-820b-d87cc0c5a855",
        "short_number": 20,
        "pickup_at": "2026-10-28T17:58:28Z",
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
      "reserved_at": "2026-10-28T14:58:31.180942Z",
      "confirm_from": "2026-10-28T17:28:28Z",
      "confirm_until": "2026-10-28T17:38:28Z",
      "drop_until": "2026-10-28T16:58:28Z"
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
      "id": "18de7417-a3b4-4d83-9e32-b987113525ab",
      "state": "RESERVED",
      "order": {
        "order_id": "d6080086-62f4-401a-820b-d87cc0c5a855",
        "short_number": 20,
        "pickup_at": "2026-10-28T17:58:28Z",
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
      "reserved_at": "2026-10-28T14:58:31.180942Z",
      "confirm_from": "2026-10-28T17:28:28Z",
      "confirm_until": "2026-10-28T17:38:28Z",
      "drop_until": "2026-10-28T16:58:28Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/18de7417-a3b4-4d83-9e32-b987113525ab/confirm` → **409**

```json
{
  "command_id": "55ad5b35-51cf-4b0a-83f8-3e0f39ba120a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/18de7417-a3b4-4d83-9e32-b987113525ab/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3b28f0ec-d412-4e21-9821-a54a57186014"
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
  "session_id": "d26bd2a1-9b30-4329-8555-5ebbda26fa34",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MTIsImlhdCI6MTc5MzE5OTUxMiwianRpIjoiNGUyM2I1N2ItOTFmOC00YzFkLTkxYTAtYzRjZTQyMzQ1ZmY4Iiwic2lkIjoiZDI2YmQyYTEtOWIzMC00MzI5LTg1NTUtNWViYmRhMjZmYTM0In0.4xykGRcoUSu-HskAdUy0xQthshSK1vMwhXR61pg-_9g",
  "access_expires_at": "2026-10-28T15:13:32.17648928Z",
  "refresh_token": "XOztBNcy3RPyb1ypRHUOcb8uLiE6CjsxcETlqiZ2CbE",
  "refresh_expires_at": "2026-10-29T02:58:32.175978724Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d6080086-62f4-401a-820b-d87cc0c5a855` → **200**

```json
{
  "id": "d6080086-62f4-401a-820b-d87cc0c5a855",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c67be7d0-d3b4-4654-8625-bf8accd3a7f7",
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
  "created_at": "2026-10-28T14:58:29.982093Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T17:58:28Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "18de7417-a3b4-4d83-9e32-b987113525ab",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T14:58:31.180942Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d6080086-62f4-401a-820b-d87cc0c5a855/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T14:58:29.983198Z",
      "actor": {
        "type": "CLIENT",
        "id": "c67be7d0-d3b4-4654-8625-bf8accd3a7f7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d6080086-62f4-401a-820b-d87cc0c5a855",
        "preorder": true,
        "quote_id": "8275c1b1-7b67-4b0e-a710-208f695d2795",
        "pickup_at": "2026-10-28T17:58:28Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "4ae2852c-ed55-4448-aef1-c3026b6a1dd4"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T14:58:31.181881Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d6080086-62f4-401a-820b-d87cc0c5a855",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "18de7417-a3b4-4d83-9e32-b987113525ab"
      },
      "correlation_id": "2558561b-105c-4147-8cfa-419ffe873bb0"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order d6080086-62f4-401a-820b-d87cc0c5a855, reservation 18de7417-a3b4-4d83-9e32-b987113525ab.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8070"
}
```

```json
{
  "challenge_id": "17463f18-342b-4050-8843-01fad8a6f8de",
  "expires_at": "2026-10-28T15:03:32.776436311Z",
  "resend_available_at": "2026-10-28T14:58:33.776436311Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "803505",
  "sent_at": "2026-10-28T14:58:32.778492244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17463f18-342b-4050-8843-01fad8a6f8de",
  "code": "803505",
  "device_ref": "sandbox-8070"
}
```

```json
{
  "session_id": "538a4691-4dc8-470f-8a06-2140d2630862",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQxMiwiaWF0IjoxNzkzMTk5NTEyLCJqdGkiOiIxMGVjNzcwNC0xMTliLTQzMzQtODQ3My01YjRmY2MyOWFhZjkiLCJzaWQiOiI1MzhhNDY5MS00ZGM4LTQ3MGYtOGEwNi0yMTQwZDI2MzA4NjIifQ.naGUrh-Huo68hfdsH2RLXYcnIyY43008MIdkiFE92Yg",
  "access_expires_at": "2026-10-28T15:13:32.982133912Z",
  "refresh_token": "e8sBo9fmBf-DkbP2punweDBWE-iDFhKagkJJf7OMEcA",
  "refresh_expires_at": "2026-11-27T14:58:32.981652139Z",
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
  "command_id": "b5fb6c28-c9d5-4429-88ae-9d37243d9680",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:33Z",
    "sequence": 1793199513346
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5c2aeb8e-7db4-4360-9349-e95006597b42",
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
  "last_heartbeat_at": "2026-10-28T14:58:33.360375Z",
  "last_location_at": "2026-10-28T14:58:33.360375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670221219",
  "device_ref": "sandbox-16321"
}
```

```json
{
  "challenge_id": "97ebd3ab-4d5c-4e28-916c-058db93f68b3",
  "expires_at": "2026-10-28T15:03:33.548570528Z",
  "resend_available_at": "2026-10-28T14:58:34.548570528Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670221219` → **200**

```json
{
  "phone": "+380670221219",
  "audience": "CLIENT",
  "code": "933494",
  "sent_at": "2026-10-28T14:58:33.550309247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97ebd3ab-4d5c-4e28-916c-058db93f68b3",
  "code": "933494",
  "device_ref": "sandbox-16321"
}
```

```json
{
  "session_id": "560c9145-b1d3-41f2-a362-4969ba3f5353",
  "subject": {
    "type": "CLIENT",
    "id": "f6253e93-387b-4739-9224-7657d9c247fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjI1M2U5My0zODdiLTQ3MzktOTIyNC03NjU3ZDljMjQ3ZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDEzLCJpYXQiOjE3OTMxOTk1MTMsImp0aSI6ImJkYjY4MWZlLWI4MDgtNDg5NS1iMmE5LTU0OWY4YTBiZmVhOSIsInNpZCI6IjU2MGM5MTQ1LWIxZDMtNDFmMi1hMzYyLTQ5NjliYTNmNTM1MyJ9.8mCItfm21lNmvHBPVk9_AGS5ZYPWXysxOFNQaeIyOsU",
  "access_expires_at": "2026-10-28T15:13:33.773737578Z",
  "refresh_token": "WRncPpjZZ0XEqGlXxIJwkzQwQaDH37JB2Q7wmmbr7pI",
  "refresh_expires_at": "2026-11-27T14:58:33.773233354Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a7bb122c-2f22-415f-8b42-cae88be676c0",
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
  "id": "b87c3349-44f5-4a0d-9ab7-40813b6a9111",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:03:33.987517Z",
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
  "command_id": "3768052a-bd00-476b-9974-1621e2989f47",
  "quote_id": "b87c3349-44f5-4a0d-9ab7-40813b6a9111",
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
  "id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6253e93-387b-4739-9224-7657d9c247fc",
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
  "created_at": "2026-10-28T14:58:34.188826Z",
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
    "id": "fd260f24-b1c6-44c3-9390-0e02aea32da1",
    "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
    "expires_at": "2026-10-28T14:58:49.191649Z",
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

`POST /api/driver/v1/offers/fd260f24-b1c6-44c3-9390-0e02aea32da1/accept` → **200**

```json
{
  "command_id": "ed76cb7d-041b-4cdd-a191-0ca39e373b55"
}
```

```json
{
  "id": "d774eb08-4dbf-444d-b408-2758240c0a77",
  "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "37030f29-28de-42d6-ab6d-3a6546ccffc5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37030f29-28de-42d6-ab6d-3a6546ccffc5",
  "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "assignment_id": "d774eb08-4dbf-444d-b408-2758240c0a77",
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

`POST /api/driver/v1/work-sessions/5c2aeb8e-7db4-4360-9349-e95006597b42/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:34Z",
    "sequence": 1793199514968
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5c2aeb8e-7db4-4360-9349-e95006597b42",
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
  "last_heartbeat_at": "2026-10-28T14:58:34.984001Z",
  "last_location_at": "2026-10-28T14:58:34.984001Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37030f29-28de-42d6-ab6d-3a6546ccffc5",
  "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "assignment_id": "d774eb08-4dbf-444d-b408-2758240c0a77",
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

`POST /api/driver/v1/trips/37030f29-28de-42d6-ab6d-3a6546ccffc5/arrive` → **200**

```json
{
  "command_id": "931da679-080f-4a48-9b57-8740de2d442d",
  "expected_version": 0
}
```

```json
{
  "id": "37030f29-28de-42d6-ab6d-3a6546ccffc5",
  "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "assignment_id": "d774eb08-4dbf-444d-b408-2758240c0a77",
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
  "arrived_at": "2026-10-28T14:58:35.361993Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/37030f29-28de-42d6-ab6d-3a6546ccffc5/start` → **200**

```json
{
  "command_id": "2c88a9d9-de4d-401c-ac83-f7c5f840f448",
  "expected_version": 1
}
```

```json
{
  "id": "37030f29-28de-42d6-ab6d-3a6546ccffc5",
  "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "assignment_id": "d774eb08-4dbf-444d-b408-2758240c0a77",
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
  "arrived_at": "2026-10-28T14:58:35.361993Z",
  "started_at": "2026-10-28T14:58:35.557289Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5c2aeb8e-7db4-4360-9349-e95006597b42/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:35Z",
    "sequence": 1793199515744
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5c2aeb8e-7db4-4360-9349-e95006597b42",
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
  "last_heartbeat_at": "2026-10-28T14:58:35.758851Z",
  "last_location_at": "2026-10-28T14:58:35.758851Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/37030f29-28de-42d6-ab6d-3a6546ccffc5/complete` → **200**

```json
{
  "command_id": "b3bd0632-955f-455d-b208-bf21a9c16d57",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:58:35Z",
  "cash_received": true
}
```

```json
{
  "id": "37030f29-28de-42d6-ab6d-3a6546ccffc5",
  "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "assignment_id": "d774eb08-4dbf-444d-b408-2758240c0a77",
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
  "arrived_at": "2026-10-28T14:58:35.361993Z",
  "started_at": "2026-10-28T14:58:35.557289Z",
  "completed_at": "2026-10-28T14:58:35.943624Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f4ffa628-dbc2-49d1-92d0-4d24e0933274/rating` → **200**

```json
{
  "command_id": "27014ab6-59fe-4ac4-8832-3b69fce31c4d",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "score": 5,
  "created_at": "2026-10-28T14:58:36.146822927Z"
}
```

`POST /api/driver/v1/orders/f4ffa628-dbc2-49d1-92d0-4d24e0933274/rating` → **200**

```json
{
  "command_id": "a9a22e2a-8830-4c53-b68d-516314d8e2a6",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
  "score": 4,
  "created_at": "2026-10-28T14:58:36.347434505Z"
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
  "session_id": "7736f6a5-495f-4e9e-bb44-856176d0349e",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MTcsImlhdCI6MTc5MzE5OTUxNywianRpIjoiZTIwYzY5ZTYtYmIwZC00YjVjLWIxOTQtNmI5OGZmM2Y2YWYwIiwic2lkIjoiNzczNmY2YTUtNDk1Zi00ZTllLWJiNDQtODU2MTc2ZDAzNDllIn0.ReQJd3HyTNr_-wvij9Dxqq4odRHK3lA92gsD7hwGEvU",
  "access_expires_at": "2026-10-28T15:13:37.009324241Z",
  "refresh_token": "e1awelxm1VHH6ss80CJiaoBCmqo6QBwHUKNQiUAAtbU",
  "refresh_expires_at": "2026-10-29T02:58:37.008914128Z",
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
  "session_id": "dea98e2b-e986-4d33-84fd-78b72fd7f1b7",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MTcsImlhdCI6MTc5MzE5OTUxNywianRpIjoiYTBhMmYwZTgtZDc1NC00NGVlLWE1MTItZDZmMDZhM2NmNGZhIiwic2lkIjoiZGVhOThlMmItZTk4Ni00ZDMzLTg0ZmQtNzhiNzJmZDdmMWI3In0.XTan-CKS1caf234mI7We4z0PNLYF1gRFxnxXwcLXy5E",
  "access_expires_at": "2026-10-28T15:13:37.466855617Z",
  "refresh_token": "vDrenb3UI7eqCA4aYC5weNe1FKmAU62nA3sbZKzsBT0",
  "refresh_expires_at": "2026-10-29T02:58:37.466416018Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f4ffa628-dbc2-49d1-92d0-4d24e0933274/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
      "author_type": "RIDER",
      "author_id": "f6253e93-387b-4739-9224-7657d9c247fc",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:58:36.146823Z"
    },
    {
      "order_id": "f4ffa628-dbc2-49d1-92d0-4d24e0933274",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "f6253e93-387b-4739-9224-7657d9c247fc",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:58:36.347435Z"
    }
  ]
}
```

Done: ratings for order f4ffa628-dbc2-49d1-92d0-4d24e0933274.

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
  "session_id": "17aaf0ed-ec61-4877-b972-a1a28eb1f1ee",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MTgsImlhdCI6MTc5MzE5OTUxOCwianRpIjoiYTI5YzNlNzMtNWFlYy00N2E1LWIxMzItNmVmNGEwMzc1NDA5Iiwic2lkIjoiMTdhYWYwZWQtZWM2MS00ODc3LWI5NzItYTFhMjhlYjFmMWVlIn0.pcvLQjlo9tN7I1jO_M2KEVcFER6O5A3K7GIfOVVix5s",
  "access_expires_at": "2026-10-28T15:13:38.149286693Z",
  "refresh_token": "WjwhTl51AsFx9jmhAC8j5yLB4pY9SHkEpqZgyqhjj0U",
  "refresh_expires_at": "2026-10-29T02:58:38.148749792Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "0469bd34-5365-4238-b8b9-814a7ba24e93",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "0715170c-269a-4e73-b024-440f58048afe",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:38.370073Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0715170c-269a-4e73-b024-440f58048afe` → **200**

```json
{
  "id": "0715170c-269a-4e73-b024-440f58048afe",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:58:38.370073Z",
  "ready_at": "2026-10-28T14:58:38.547317Z",
  "expires_at": "2026-10-29T14:58:38.547317Z"
}
```

`GET /api/admin/v1/reports/exports/0715170c-269a-4e73-b024-440f58048afe/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1c313c1a-15a6-42f3-836c-f8c0041f1ce3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "536b0241-e89b-4231-a432-1f28bb6cbd0c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:38.828857Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/536b0241-e89b-4231-a432-1f28bb6cbd0c` → **200**

```json
{
  "id": "536b0241-e89b-4231-a432-1f28bb6cbd0c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:38.828857Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/536b0241-e89b-4231-a432-1f28bb6cbd0c` → **200**

```json
{
  "id": "536b0241-e89b-4231-a432-1f28bb6cbd0c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:38.828857Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/536b0241-e89b-4231-a432-1f28bb6cbd0c` → **200**

```json
{
  "id": "536b0241-e89b-4231-a432-1f28bb6cbd0c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:38.828857Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/536b0241-e89b-4231-a432-1f28bb6cbd0c` → **200**

```json
{
  "id": "536b0241-e89b-4231-a432-1f28bb6cbd0c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:38.828857Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/536b0241-e89b-4231-a432-1f28bb6cbd0c` → **200**

```json
{
  "id": "536b0241-e89b-4231-a432-1f28bb6cbd0c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:58:38.828857Z",
  "ready_at": "2026-10-28T14:58:43.55521Z",
  "expires_at": "2026-10-29T14:58:43.55521Z"
}
```

`GET /api/admin/v1/reports/exports/536b0241-e89b-4231-a432-1f28bb6cbd0c/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/dadd3aa7-9390-4488-a4b8-ed298a5f0c15` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/dadd3aa7-9390-4488-a4b8-ed298a5f0c15",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "10618acb-3f54-4ee1-90e5-46c427f4eba8"
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
  "device_ref": "sandbox-19263"
}
```

```json
{
  "challenge_id": "ef6f3ea7-57b6-4c29-92c3-05e21cc932be",
  "expires_at": "2026-10-28T15:03:44.269985337Z",
  "resend_available_at": "2026-10-28T14:58:45.269985337Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "267111",
  "sent_at": "2026-10-28T14:58:44.272333667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef6f3ea7-57b6-4c29-92c3-05e21cc932be",
  "code": "267111",
  "device_ref": "sandbox-19263"
}
```

```json
{
  "session_id": "4170fdd9-9d66-4789-bca1-5f161d7fe05b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQyNCwiaWF0IjoxNzkzMTk5NTI0LCJqdGkiOiJkMzBiNGIyNi1mNmY2LTQ2MDUtODg1ZC05M2U3ZWE3M2RkODciLCJzaWQiOiI0MTcwZmRkOS05ZDY2LTQ3ODktYmNhMS01ZjE2MWQ3ZmUwNWIifQ.nLNF1EHHmQNToPcMEqg8POerqWh-cVIXP6njHHxd6U8",
  "access_expires_at": "2026-10-28T15:13:44.48280156Z",
  "refresh_token": "s0RstoN2PEZojnpS_kqtYXbzMuanjIxhorPVJgNg7zM",
  "refresh_expires_at": "2026-11-27T14:58:44.482413884Z",
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
  "command_id": "c76621a4-fd57-40be-bffb-ac050ccde97d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:45Z",
    "sequence": 1793199525741
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a5e0663-e4c6-41be-baa5-c2176168afb4",
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
  "last_heartbeat_at": "2026-10-28T14:58:45.089664Z",
  "last_location_at": "2026-10-28T14:58:45.089664Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "7dc73ee0-3de8-4237-ab23-0a7126813c5b",
  "points": [
    {
      "sequence": 1793199527295,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:57:47Z"
    },
    {
      "sequence": 1793199527301,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:58:47Z"
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
  "session_id": "c2d59864-34c2-4cfd-bc42-b5e5a1a068fc",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MjcsImlhdCI6MTc5MzE5OTUyNywianRpIjoiM2ZiZWE3NmItN2FhZi00MDViLWEyM2MtZTcyYTA5ZjY3YTFiIiwic2lkIjoiYzJkNTk4NjQtMzRjMi00Y2ZkLWJjNDItYjVlNWExYTA2OGZjIn0.-N47_m2XFKqB4PsfDFRZbt6ipShmOtqGwpsPXy8moV4",
  "access_expires_at": "2026-10-28T15:13:47.833115921Z",
  "refresh_token": "5VTTP2HgAiYB_UCrrvsquflLclbCR8-BCPvjiMkQ5k4",
  "refresh_expires_at": "2026-10-29T02:58:47.832716034Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "7b1d547d-e14d-486b-8592-1b154a0504bf",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:58:47Z",
        "track_point_id": "7afdb143-2bdc-41e2-91bc-dd1e1792636c",
        "work_session_id": "2a5e0663-e4c6-41be-baa5-c2176168afb4"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:58:47Z",
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

`POST /api/admin/v1/driver-risk-flags/7b1d547d-e14d-486b-8592-1b154a0504bf/confirm` → **200**

```json
{
  "command_id": "a0a8c3ed-6e74-4bce-b044-ea41ca5b6a73",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "7b1d547d-e14d-486b-8592-1b154a0504bf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:58:47Z",
    "track_point_id": "7afdb143-2bdc-41e2-91bc-dd1e1792636c",
    "work_session_id": "2a5e0663-e4c6-41be-baa5-c2176168afb4"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:58:47Z",
  "reason": null,
  "reviewed_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "reviewed_at": "2026-10-28T14:58:48.469224Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/7b1d547d-e14d-486b-8592-1b154a0504bf/dismiss` → **409**

```json
{
  "command_id": "dd900fad-1ed1-4bb0-8eba-a576e3e32b9b",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/7b1d547d-e14d-486b-8592-1b154a0504bf/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c57a9ff0-12e0-4666-bb65-d9039696f877"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "dde34c8c-546e-49d5-a1de-7a7d9d359f4e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "0620e5bd-ee2e-4fb5-9eb3-d17da2901b91",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "raised_at": "2026-10-28T14:58:48.883864Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/0620e5bd-ee2e-4fb5-9eb3-d17da2901b91/dismiss` → **200**

```json
{
  "command_id": "5cc864b6-5033-4f92-a40c-83f1d118d318",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "0620e5bd-ee2e-4fb5-9eb3-d17da2901b91",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "raised_at": "2026-10-28T14:58:48.883864Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "reviewed_at": "2026-10-28T14:58:49.079834Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "fcba6454-e897-49df-a069-b2f83336394c",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "7b1d547d-e14d-486b-8592-1b154a0504bf"
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
      "actor_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:58:49.292084Z"
    }
  ]
}
```

Done: flag 7b1d547d-e14d-486b-8592-1b154a0504bf confirmed, suspension named it, driver reinstated.

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
  "session_id": "c2daa1fd-ff7d-480b-8e23-23074dba9d3b",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MjksImlhdCI6MTc5MzE5OTUyOSwianRpIjoiOTI2MTZhODktODQ0NS00OTRjLWE4ZWItNDlmMWQxMWY3NDA1Iiwic2lkIjoiYzJkYWExZmQtZmY3ZC00ODBiLThlMjMtMjMwNzRkYmE5ZDNiIn0.uXOqTwozUY0-Lgb-5GhOvukXF85U04yfNn3ryNFvel0",
  "access_expires_at": "2026-10-28T15:13:49.924607868Z",
  "refresh_token": "3jgjbf4C-6Bi9vWkPyj8M5oXhrC6v7XGEg9-IKdYEPI",
  "refresh_expires_at": "2026-10-29T02:58:49.924126686Z",
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
      "actor_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:58:49.292084Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "623d55ac-1676-470f-b9c3-1c472eb7d62a",
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
  "session_id": "2a5e0663-e4c6-41be-baa5-c2176168afb4",
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
  "last_heartbeat_at": "2026-10-28T14:58:45.089664Z",
  "last_location_at": "2026-10-28T14:58:45.089664Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a5e0663-e4c6-41be-baa5-c2176168afb4/close` → **200**

```json
{
  "command_id": "707635d0-10f9-4470-8eee-0f23bb9513bb",
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
  "session_id": "d9515cc3-2194-4645-9143-b6a859785162",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MzEsImlhdCI6MTc5MzE5OTUzMSwianRpIjoiNjVjYjAxMTItMGM2Mi00MGQ4LTg0MmQtZjEwMmU3MDg0M2I0Iiwic2lkIjoiZDk1MTVjYzMtMjE5NC00NjQ1LTkxNDMtYjZhODU5Nzg1MTYyIn0.pgk1nfCfkELzMJZjzRd2wcoHQaN1t6rSwcDUrhh8pKA",
  "access_expires_at": "2026-10-28T15:13:51.156585799Z",
  "refresh_token": "mvYDJWQzX4MeUlv1DcR-IXN6y6JbLRrDO8RNe5Ml-JU",
  "refresh_expires_at": "2026-10-29T02:58:51.156057789Z",
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
  "command_id": "496629f8-1806-49b7-b611-82e54fa12af0",
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
  "changed_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:58:51.550279Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "496629f8-1806-49b7-b611-82e54fa12af0",
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
  "changed_by": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:58:51.550279Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48105130332",
  "device_ref": "sandbox-16352"
}
```

```json
{
  "challenge_id": "4ecd9325-4b40-45a0-8692-1421afdecc1a",
  "expires_at": "2026-10-28T15:03:51.955652541Z",
  "resend_available_at": "2026-10-28T14:58:52.955652541Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48105130332` → **200**

```json
{
  "phone": "+48105130332",
  "audience": "CLIENT",
  "code": "176444",
  "sent_at": "2026-10-28T14:58:51.957668534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ecd9325-4b40-45a0-8692-1421afdecc1a",
  "code": "176444",
  "device_ref": "sandbox-16352"
}
```

```json
{
  "session_id": "d27b93e8-3db5-4b81-9b8a-cb18eda5f3f8",
  "subject": {
    "type": "CLIENT",
    "id": "276d20a2-93af-455f-beef-0569a1108833"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzZkMjBhMi05M2FmLTQ1NWYtYmVlZi0wNTY5YTExMDg4MzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDMyLCJpYXQiOjE3OTMxOTk1MzIsImp0aSI6IjE5ZmZhYWVhLTc3N2UtNGZkNS04Y2I3LWI3Zjg5ODM3Y2IxMSIsInNpZCI6ImQyN2I5M2U4LTNkYjUtNGI4MS05YjhhLWNiMThlZGE1ZjNmOCJ9.dNYOE6XpDSDPksWXA04csZa6an5npflf4VBCaQ7VJ4c",
  "access_expires_at": "2026-10-28T15:13:52.167249963Z",
  "refresh_token": "odJ_JYOALjazQEKLywwxKRHGIaRDpKd-m8ZtDQIq70M",
  "refresh_expires_at": "2026-11-27T14:58:52.166745557Z",
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
  "correlation_id": "3ea38446-09cb-4669-b628-ecedbd4c69a9"
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
  "device_ref": "sandbox-29772"
}
```

```json
{
  "challenge_id": "0b35935d-e903-4b48-b8e0-33b45c67f436",
  "expires_at": "2026-10-28T15:03:52.764279236Z",
  "resend_available_at": "2026-10-28T14:58:53.764279236Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "058883",
  "sent_at": "2026-10-28T14:58:52.766074875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b35935d-e903-4b48-b8e0-33b45c67f436",
  "code": "058883",
  "device_ref": "sandbox-29772"
}
```

```json
{
  "session_id": "197f3816-10b9-440f-9176-3a25112118b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQzMiwiaWF0IjoxNzkzMTk5NTMyLCJqdGkiOiI2Yjc5NGJlMS0yMjdiLTQ0M2YtYjg1Yy1jNWU5MTQwZWMxZTUiLCJzaWQiOiIxOTdmMzgxNi0xMGI5LTQ0MGYtOTE3Ni0zYTI1MTEyMTE4YjcifQ.6DPiiKU0W1VIa8MVpc8B9kxgcQew2fldMv2IJBZ7bZE",
  "access_expires_at": "2026-10-28T15:13:52.974176666Z",
  "refresh_token": "o1VEyz8_bnMGPGVqvoBrudRff926M9KCLwYpIGsGROk",
  "refresh_expires_at": "2026-11-27T14:58:52.973693929Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0e718c43-e80a-45f3-8caf-70d1e56d61c7",
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
  "last_heartbeat_at": "2026-10-28T14:58:30.791887Z",
  "last_location_at": "2026-10-28T14:58:30.791887Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0e718c43-e80a-45f3-8caf-70d1e56d61c7/handover` → **200**

```json
{
  "command_id": "9526e386-671b-4c0b-840b-5dd34b409d3e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0e718c43-e80a-45f3-8caf-70d1e56d61c7",
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
  "last_heartbeat_at": "2026-10-28T14:58:30.791887Z",
  "last_location_at": "2026-10-28T14:58:30.791887Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0e718c43-e80a-45f3-8caf-70d1e56d61c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:53Z",
    "sequence": 1793199533542
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0e718c43-e80a-45f3-8caf-70d1e56d61c7",
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
  "last_heartbeat_at": "2026-10-28T14:58:53.557613Z",
  "last_location_at": "2026-10-28T14:58:53.557613Z",
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
  "session_id": "0e718c43-e80a-45f3-8caf-70d1e56d61c7",
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
  "last_heartbeat_at": "2026-10-28T14:58:53.557613Z",
  "last_location_at": "2026-10-28T14:58:53.557613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0e718c43-e80a-45f3-8caf-70d1e56d61c7/close` → **200**

```json
{
  "command_id": "ad8ba9f9-7a8a-4b1b-a9cc-3954fb8bbdbd",
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
  "correlation_id": "714a93da-5994-420d-8d8d-ceacc3b3d8dd"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673387915",
  "device_ref": "sandbox-22262"
}
```

```json
{
  "challenge_id": "e8a2db74-6222-4a63-a77f-5dc02487fd4d",
  "expires_at": "2026-10-28T15:03:54.52007821Z",
  "resend_available_at": "2026-10-28T14:58:55.52007821Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673387915` → **200**

```json
{
  "phone": "+380673387915",
  "audience": "CLIENT",
  "code": "735829",
  "sent_at": "2026-10-28T14:58:54.522282936Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8a2db74-6222-4a63-a77f-5dc02487fd4d",
  "code": "735829",
  "device_ref": "sandbox-22262"
}
```

```json
{
  "session_id": "db60b443-ab93-45a4-8e7e-8fac3143df34",
  "subject": {
    "type": "CLIENT",
    "id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGJhOGI5NS0wMWRjLTQ0YzYtODJiYi00YTg0NzE0YTVjYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDM0LCJpYXQiOjE3OTMxOTk1MzQsImp0aSI6ImEyZDE3ODgwLTVmOTktNGEzYy05MjBiLWM2MDc0NGMzOGUyMCIsInNpZCI6ImRiNjBiNDQzLWFiOTMtNDVhNC04ZTdlLThmYWMzMTQzZGYzNCJ9.C7unWOCCuAoBJUMQFSiqCV6UI5rzXdf0uBbqZc89y28",
  "access_expires_at": "2026-10-28T15:13:54.723506173Z",
  "refresh_token": "I1y1eIofkVedIAzRCvRXYMKIfuEObrt_OTgB784Mc7Y",
  "refresh_expires_at": "2026-11-27T14:58:54.723004298Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "b90e5009-8d2a-45e0-b729-56a392408d70",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5",
  "upload_path": "/api/rider/v1/uploads/bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5",
  "expires_at": "2026-10-28T15:13:54.919443861Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5` → **200**

```json
{
  "file_id": "bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "84401fd9-faed-4800-a3e6-cb70e6342781",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5"
  ]
}
```

```json
{
  "id": "84aaf2bc-b996-4dab-96ed-86c6da0bb5a9",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:58:55.143328Z",
  "updated_at": "2026-10-28T14:58:55.143328Z",
  "respond_by": "2026-10-28T18:58:55.143328Z",
  "messages": [
    {
      "id": "97f5d52f-586d-4810-89d7-d1de038375fa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:58:55.145034Z",
      "attachments": [
        {
          "file_id": "bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5",
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
  "session_id": "374a6856-86fe-4005-b89d-230e33429abc",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MzUsImlhdCI6MTc5MzE5OTUzNSwianRpIjoiNDI1YzRhZGItNzg3OS00Mzg4LThhZGItNmJhM2IwNjExYzgwIiwic2lkIjoiMzc0YTY4NTYtODZmZS00MDA1LWI4OWQtMjMwZTMzNDI5YWJjIn0.R8NS6kwT9MBzIjqqL11Hb0qcjDEhXgSMMb-mjDWd8js",
  "access_expires_at": "2026-10-28T15:13:55.58359563Z",
  "refresh_token": "ef2vYxT6oA0MX9EfDfxVEb-OJZftaWi7NJ28MYHLKB0",
  "refresh_expires_at": "2026-10-29T02:58:55.582952631Z",
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
  "session_id": "e6b45b3d-f9ee-4736-a68f-1ccff51193f5",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MzYsImlhdCI6MTc5MzE5OTUzNiwianRpIjoiM2MzYmMwNzUtZDk5OS00ODE2LWEyMzgtNDlmMmU3Mzc3ZjM2Iiwic2lkIjoiZTZiNDViM2QtZjllZS00NzM2LWE2OGYtMWNjZmY1MTE5M2Y1In0.96VfxYZYp06K8iiT95UwQqS0VAawLjFo_9Xnp-J5AuE",
  "access_expires_at": "2026-10-28T15:13:56.000787042Z",
  "refresh_token": "f1Afb_f5hdWaIF8Fpdt5SdnisoYzZ_SvHIpCMyqbf1k",
  "refresh_expires_at": "2026-10-29T02:58:56.000398132Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/84aaf2bc-b996-4dab-96ed-86c6da0bb5a9/attachments/bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "534b151b-eaa5-4294-9bf9-34d8ffcdd167",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "fb3d8b2d-334d-4be1-ba23-10a621922084",
  "upload_path": "/api/operator/v1/uploads/fb3d8b2d-334d-4be1-ba23-10a621922084",
  "expires_at": "2026-10-28T15:13:56.205455457Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/fb3d8b2d-334d-4be1-ba23-10a621922084` → **200**

```json
{
  "file_id": "fb3d8b2d-334d-4be1-ba23-10a621922084",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/84aaf2bc-b996-4dab-96ed-86c6da0bb5a9` → **200**

```json
{
  "id": "84aaf2bc-b996-4dab-96ed-86c6da0bb5a9",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:58:55.143328Z",
  "updated_at": "2026-10-28T14:58:55.143328Z",
  "respond_by": "2026-10-28T18:58:55.143328Z",
  "messages": [
    {
      "id": "97f5d52f-586d-4810-89d7-d1de038375fa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:58:55.145034Z",
      "attachments": [
        {
          "file_id": "bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/84aaf2bc-b996-4dab-96ed-86c6da0bb5a9/comments` → **200**

```json
{
  "command_id": "39fee821-c917-48a3-901b-cb76d42f0272",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "fb3d8b2d-334d-4be1-ba23-10a621922084"
  ]
}
```

```json
{
  "id": "84aaf2bc-b996-4dab-96ed-86c6da0bb5a9",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:58:55.143328Z",
  "updated_at": "2026-10-28T14:58:56.622316Z",
  "respond_by": "2026-10-28T18:58:55.143328Z",
  "messages": [
    {
      "id": "97f5d52f-586d-4810-89d7-d1de038375fa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:58:55.145034Z",
      "attachments": [
        {
          "file_id": "bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "15200ad5-6274-4ba0-8a27-0931ec7d0c9a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:58:56.62189Z",
      "attachments": [
        {
          "file_id": "fb3d8b2d-334d-4be1-ba23-10a621922084",
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

`GET /api/rider/v1/support/cases/84aaf2bc-b996-4dab-96ed-86c6da0bb5a9` → **200**

```json
{
  "id": "84aaf2bc-b996-4dab-96ed-86c6da0bb5a9",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:58:55.143328Z",
  "updated_at": "2026-10-28T14:58:56.622316Z",
  "respond_by": "2026-10-28T18:58:55.143328Z",
  "messages": [
    {
      "id": "97f5d52f-586d-4810-89d7-d1de038375fa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b0ba8b95-01dc-44c6-82bb-4a84714a5cb3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:58:55.145034Z",
      "attachments": [
        {
          "file_id": "bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "15200ad5-6274-4ba0-8a27-0931ec7d0c9a",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:58:56.62189Z",
      "attachments": [
        {
          "file_id": "fb3d8b2d-334d-4be1-ba23-10a621922084",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/84aaf2bc-b996-4dab-96ed-86c6da0bb5a9/attachments/fb3d8b2d-334d-4be1-ba23-10a621922084` → **200**

Done: support case 84aaf2bc-b996-4dab-96ed-86c6da0bb5a9, rider attachment bfcbb9fb-3771-4855-8fb8-dbbec9ea87d5, operator attachment fb3d8b2d-334d-4be1-ba23-10a621922084.

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
  "session_id": "d7012934-caa0-4be1-8e5d-9b6d3bf37830",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MzcsImlhdCI6MTc5MzE5OTUzNywianRpIjoiYzc0NjY1OTEtMDg2Yi00ZTJkLWJmMjEtYTIzOTAwMjQ2YjdhIiwic2lkIjoiZDcwMTI5MzQtY2FhMC00YmUxLThlNWQtOWI2ZDNiZjM3ODMwIn0.gVp_UDon3Tf92NgKMYxYTW2cjUKOxqlcjWCgOSlY9eU",
  "access_expires_at": "2026-10-28T15:13:57.292352896Z",
  "refresh_token": "78PadElBG6jiGrMqUTj1a6ndA1_cVFBihwFgEoCBEsk",
  "refresh_expires_at": "2026-10-29T02:58:57.291981537Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31656"
}
```

```json
{
  "challenge_id": "db5f6695-a6b5-422b-9332-75265a93ba5f",
  "expires_at": "2026-10-28T15:03:57.481106891Z",
  "resend_available_at": "2026-10-28T14:58:58.481106891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "909360",
  "sent_at": "2026-10-28T14:58:57.483582228Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db5f6695-a6b5-422b-9332-75265a93ba5f",
  "code": "909360",
  "device_ref": "sandbox-31656"
}
```

```json
{
  "session_id": "0ad126a0-02fc-408f-a0be-db8f45b018ab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQzNywiaWF0IjoxNzkzMTk5NTM3LCJqdGkiOiI5MzIxNTZjYi1mN2U3LTQ0YjYtOWRiZS0yZjQyMjg4NWVhYTkiLCJzaWQiOiIwYWQxMjZhMC0wMmZjLTQwOGYtYTBiZS1kYjhmNDViMDE4YWIifQ.rpZBJ6fSErXQz8YftxbmYHDYoS0MuYAAp-GRcFCpII4",
  "access_expires_at": "2026-10-28T15:13:57.720525145Z",
  "refresh_token": "jACv9uAL-LdqU-0nbmHOZbDXk5bMLh6uCnbEiUmFZAA",
  "refresh_expires_at": "2026-11-27T14:58:57.720091752Z",
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
      "actor_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:58:49.292084Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:58:50.336226Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "9915464c-2d5c-46ad-809a-f8ed29cd16f6",
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
  "device_ref": "sandbox-18118"
}
```

```json
{
  "challenge_id": "3b3f44dc-313e-4b9e-b09b-1bd6f7cb5148",
  "expires_at": "2026-10-28T15:03:58.57252121Z",
  "resend_available_at": "2026-10-28T14:58:59.57252121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "454729",
  "sent_at": "2026-10-28T14:58:58.574459808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b3f44dc-313e-4b9e-b09b-1bd6f7cb5148",
  "code": "454729",
  "device_ref": "sandbox-18118"
}
```

```json
{
  "session_id": "a68c09c7-1efa-409d-8d51-e194457108fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQzOCwiaWF0IjoxNzkzMTk5NTM4LCJqdGkiOiIyNWE5NGQzYi1jY2Q5LTQ1MjctOTMzZC1jOWViZmQxNTI4OTgiLCJzaWQiOiJhNjhjMDljNy0xZWZhLTQwOWQtOGQ1MS1lMTk0NDU3MTA4ZmQifQ.lJLtdTv1JF7gA1nBJ0lnZyD26Zl9cKeeQNq9PYy__h4",
  "access_expires_at": "2026-10-28T15:13:58.80173224Z",
  "refresh_token": "DRcFSBoE2VNx2ODJ-y6Y52PdSNPy-Qk2t4376YLot7s",
  "refresh_expires_at": "2026-11-27T14:58:58.801337223Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5c2aeb8e-7db4-4360-9349-e95006597b42",
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
  "last_heartbeat_at": "2026-10-28T14:58:35.758851Z",
  "last_location_at": "2026-10-28T14:58:35.758851Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5c2aeb8e-7db4-4360-9349-e95006597b42/handover` → **200**

```json
{
  "command_id": "a134fbde-8e31-49f4-b9a6-0e557a1500c8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5c2aeb8e-7db4-4360-9349-e95006597b42",
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
  "last_heartbeat_at": "2026-10-28T14:58:35.758851Z",
  "last_location_at": "2026-10-28T14:58:35.758851Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5c2aeb8e-7db4-4360-9349-e95006597b42/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:59Z",
    "sequence": 1793199539397
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5c2aeb8e-7db4-4360-9349-e95006597b42",
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
  "last_heartbeat_at": "2026-10-28T14:58:59.412505Z",
  "last_location_at": "2026-10-28T14:58:59.412505Z",
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
  "command_id": "3a2449b2-33c9-4a53-a12f-8ee0f94b7ae3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:59Z",
    "sequence": 1793199539782
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34193140-60b4-4ff1-84fb-8e6f69d095d9",
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
  "last_heartbeat_at": "2026-10-28T14:58:59.796237Z",
  "last_location_at": "2026-10-28T14:58:59.796237Z",
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
  "session_id": "a80eb591-3dfa-4a53-852d-0c76dfe463d0",
  "subject": {
    "type": "STAFF",
    "id": "f8036a86-0ab9-499f-bef0-2e0581f98d2c"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAzNmE4Ni0wYWI5LTQ5OWYtYmVmMC0yZTA1ODFmOThkMmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0NDAsImlhdCI6MTc5MzE5OTU0MCwianRpIjoiYjc1NDNjMDctZWZhNS00YjBkLWIxNjgtZDI4YWVlYTBiYWM3Iiwic2lkIjoiYTgwZWI1OTEtM2RmYS00YTUzLTg1MmQtMGM3NmRmZTQ2M2QwIn0.AnrKA_f-ld_GjxlaZB-Tz6-kjqFn2Y28qjIf-ww78WU",
  "access_expires_at": "2026-10-28T15:14:00.217309443Z",
  "refresh_token": "1BSdKrxnHRNrsFhZIjg7gU0v4PZXIjC5t4Hg3P9qbLY",
  "refresh_expires_at": "2026-10-29T02:59:00.216926225Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6349c504-d5c8-4db0-81c2-f4d34a53a0ee",
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
  "id": "8c4960f1-33cf-4224-8a47-64a99fe50b2b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:04:00.414179Z",
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
  "command_id": "7a3dc9cb-5f9d-40f0-9d34-107824328370",
  "quote_id": "8c4960f1-33cf-4224-8a47-64a99fe50b2b",
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
  "id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
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
  "created_at": "2026-10-28T14:59:00.616061Z",
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
    "id": "4e28a5fe-2719-49aa-9981-4545441c1062",
    "order_id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
    "expires_at": "2026-10-28T14:59:15.619254Z",
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

`POST /api/driver/v1/offers/4e28a5fe-2719-49aa-9981-4545441c1062/accept` → **200**

```json
{
  "command_id": "6496d0d2-c9d3-43b3-a61e-2bdc4cac46e0"
}
```

```json
{
  "id": "f64e8145-1295-4f62-ae68-a6b23af19a9d",
  "order_id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00531c6d-b853-4b74-b920-772a16763dfa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00531c6d-b853-4b74-b920-772a16763dfa",
  "order_id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
  "assignment_id": "f64e8145-1295-4f62-ae68-a6b23af19a9d",
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

`POST /api/driver/v1/work-sessions/34193140-60b4-4ff1-84fb-8e6f69d095d9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:59:01Z",
    "sequence": 1793199541581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "34193140-60b4-4ff1-84fb-8e6f69d095d9",
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
  "last_heartbeat_at": "2026-10-28T14:59:01.596342Z",
  "last_location_at": "2026-10-28T14:59:01.596342Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/00531c6d-b853-4b74-b920-772a16763dfa/arrive` → **200**

```json
{
  "command_id": "54763677-ca7a-49a0-b859-0f6205115093",
  "expected_version": 0
}
```

```json
{
  "id": "00531c6d-b853-4b74-b920-772a16763dfa",
  "order_id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
  "assignment_id": "f64e8145-1295-4f62-ae68-a6b23af19a9d",
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
  "arrived_at": "2026-10-28T14:59:01.794331Z",
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

`POST /api/driver/v1/trips/00531c6d-b853-4b74-b920-772a16763dfa/start` → **200**

```json
{
  "command_id": "1d648de4-afc3-4d12-ad36-378a58fbdcfb",
  "expected_version": 1
}
```

```json
{
  "id": "00531c6d-b853-4b74-b920-772a16763dfa",
  "order_id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
  "assignment_id": "f64e8145-1295-4f62-ae68-a6b23af19a9d",
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
  "arrived_at": "2026-10-28T14:59:01.794331Z",
  "started_at": "2026-10-28T14:59:01.994674Z",
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

`POST /api/driver/v1/trips/00531c6d-b853-4b74-b920-772a16763dfa/complete` → **200**

```json
{
  "command_id": "6f52cef3-b00f-4ae2-b0c8-1ab936150136",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:59:02Z",
  "cash_received": true
}
```

```json
{
  "id": "00531c6d-b853-4b74-b920-772a16763dfa",
  "order_id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
  "assignment_id": "f64e8145-1295-4f62-ae68-a6b23af19a9d",
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
  "arrived_at": "2026-10-28T14:59:01.794331Z",
  "started_at": "2026-10-28T14:59:01.994674Z",
  "completed_at": "2026-10-28T14:59:02.19872Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/5a92de56-fb10-4d5e-a4d9-1c5bdef900f9` → **200**

```json
{
  "id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
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
    "id": "f64e8145-1295-4f62-ae68-a6b23af19a9d",
    "order_id": "5a92de56-fb10-4d5e-a4d9-1c5bdef900f9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "00531c6d-b853-4b74-b920-772a16763dfa",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:59:00.616061Z",
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
  "session_id": "5c2aeb8e-7db4-4360-9349-e95006597b42",
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
  "last_heartbeat_at": "2026-10-28T14:58:59.412505Z",
  "last_location_at": "2026-10-28T14:58:59.412505Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5c2aeb8e-7db4-4360-9349-e95006597b42/close` → **200**

```json
{
  "command_id": "63ac2efa-cdce-474b-97aa-a3d4f7628075",
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
  "session_id": "34193140-60b4-4ff1-84fb-8e6f69d095d9",
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
  "last_heartbeat_at": "2026-10-28T14:59:01.596342Z",
  "last_location_at": "2026-10-28T14:59:01.596342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34193140-60b4-4ff1-84fb-8e6f69d095d9/close` → **200**

```json
{
  "command_id": "9c1258d8-3e49-4eaa-b062-f7d9fbd2b0f9",
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

Done: terminal order 5a92de56-fb10-4d5e-a4d9-1c5bdef900f9 by Andrii (5a000000-0000-4000-8000-000000000403).
