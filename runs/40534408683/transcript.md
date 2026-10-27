# Sandbox transcript (2026-10-27T15:47:46Z, 3d2ac90)

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
  "correlation_id": "4dd6e503-f01c-49ce-be97-51bd9519d248"
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
  "session_id": "6d3b5bb5-76f7-4727-9d0f-4328263d8717",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5NjYsImlhdCI6MTc5MzExNjA2NiwianRpIjoiYjczNWM0ZTUtNWE2My00NWViLWIzZWEtNjk4MjFiYjk2NGE4Iiwic2lkIjoiNmQzYjViYjUtNzZmNy00NzI3LTlkMGYtNDMyODI2M2Q4NzE3In0._bQ6qbF4Lq25AfXUwOyNW5yTOWYcRpIrbpeSOxKf5YY",
  "access_expires_at": "2026-10-27T16:02:46.567674417Z",
  "refresh_token": "M-D7iLuPajb79YSE-f9bTp4HTw5UopFNrQc4jep-kSQ",
  "refresh_expires_at": "2026-10-28T03:47:46.56608671Z",
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
  "session_id": "1cf239f8-f8c6-4a32-8740-ae46a697c3ed",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5NjcsImlhdCI6MTc5MzExNjA2NywianRpIjoiNjQ0MjM5OTUtYThkZC00M2I2LTlhOWMtYzdhMzQ5ZjFiNDM3Iiwic2lkIjoiMWNmMjM5ZjgtZjhjNi00YTMyLTg3NDAtYWU0NmE2OTdjM2VkIn0.dvnJmfEzmV4uStouzJxr-gLqRxA6oexl2-tVhJ3-Uqc",
  "access_expires_at": "2026-10-27T16:02:47.490406717Z",
  "refresh_token": "dwWwT4ukBHGxEh6xR1t_0pU2nPG7YZy0wVQh1Vc54VM",
  "refresh_expires_at": "2026-10-28T03:47:47.489547797Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "dbdd0705-8afe-424c-8fa5-035f2e8472af",
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
  "id": "0d2058f3-1e7d-4dc4-93a1-feed34bf1756",
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
  "created_by": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
  "created_at": "2026-10-27T15:47:47.54217Z",
  "updated_at": "2026-10-27T15:47:47.54217Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635377782",
  "device_ref": "sandbox-6822"
}
```

```json
{
  "challenge_id": "3accb938-30ec-4c34-b385-a8404e9711c2",
  "expires_at": "2026-10-27T15:52:47.579853732Z",
  "resend_available_at": "2026-10-27T15:47:48.579853732Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635377782` → **200**

```json
{
  "phone": "+380635377782",
  "audience": "CLIENT",
  "code": "867437",
  "sent_at": "2026-10-27T15:47:47.584842375Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3accb938-30ec-4c34-b385-a8404e9711c2",
  "code": "867437",
  "device_ref": "sandbox-6822"
}
```

```json
{
  "session_id": "c791d345-e636-40b5-a2df-edc63938df92",
  "subject": {
    "type": "CLIENT",
    "id": "27e30347-ee43-4996-9dde-a492fd0cdc6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2UzMDM0Ny1lZTQzLTQ5OTYtOWRkZS1hNDkyZmQwY2RjNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTY3LCJpYXQiOjE3OTMxMTYwNjcsImp0aSI6IjU3NjBjNDkzLTIwMDktNDQ4YS1iN2JkLTM5NjVhNmQxZTM2MyIsInNpZCI6ImM3OTFkMzQ1LWU2MzYtNDBiNS1hMmRmLWVkYzYzOTM4ZGY5MiJ9.BqRLYSAIp0n0GSxBg-Cb5ZSS71FlUotzq81BSy7xWjI",
  "access_expires_at": "2026-10-27T16:02:47.648320714Z",
  "refresh_token": "XmOAMUAJ4pn-L8rmFx3PL_E9HRnz6J07URIuoPvOtqw",
  "refresh_expires_at": "2026-11-26T15:47:47.647619276Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635377782` → **200**

```json
{
  "client_id": "27e30347-ee43-4996-9dde-a492fd0cdc6d"
}
```

`POST /api/admin/v1/rider-wallets/27e30347-ee43-4996-9dde-a492fd0cdc6d/top-ups` → **201**

```json
{
  "command_id": "89991486-1785-4fd3-bfa7-843808768721",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "27e30347-ee43-4996-9dde-a492fd0cdc6d",
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
      "id": "ba0835f5-9811-4fa8-86c2-30b4ee972946",
      "at": "2026-10-27T15:47:47.712173Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "026efb8e-ba89-4ab5-a61e-cb2e69ceaf6e",
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
  "id": "8462344b-a8b7-4e7d-b723-b02457633209",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:52:47.831667Z",
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
      "id": "0d2058f3-1e7d-4dc4-93a1-feed34bf1756",
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
  "device_ref": "sandbox-10618"
}
```

```json
{
  "challenge_id": "f1e8565c-6dff-4b67-a192-fafe6e0b6b76",
  "expires_at": "2026-10-27T15:52:47.884117065Z",
  "resend_available_at": "2026-10-27T15:47:48.884117065Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "139723",
  "sent_at": "2026-10-27T15:47:47.886644948Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1e8565c-6dff-4b67-a192-fafe6e0b6b76",
  "code": "139723",
  "device_ref": "sandbox-10618"
}
```

```json
{
  "session_id": "ae865d45-1558-4dfa-88f4-2a1d9952f040",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk2NywiaWF0IjoxNzkzMTE2MDY3LCJqdGkiOiIwNmJmZjk4ZC1kMjU0LTQ2MjYtOTMxMi1jODA0ZDI2OTA4N2EiLCJzaWQiOiJhZTg2NWQ0NS0xNTU4LTRkZmEtODhmNC0yYTFkOTk1MmYwNDAifQ.lULz7ZYrh1rpHfBGxJoDGXmcK_dn0RsbfHDS_ocdblQ",
  "access_expires_at": "2026-10-27T16:02:47.933504194Z",
  "refresh_token": "fc_G8qdE31oVkOWYl1UTKO68ggvZS9QIkoHMEJ7BFnE",
  "refresh_expires_at": "2026-11-26T15:47:47.932798193Z",
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
  "command_id": "9730e729-9757-4b0b-8de5-2af69a450543",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:47:47Z",
    "sequence": 1793116067984
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96725149-6e5f-43ee-a157-0f5a52ab95c8",
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
  "last_heartbeat_at": "2026-10-27T15:47:48.017605Z",
  "last_location_at": "2026-10-27T15:47:48.017605Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7668b47f-0606-48bf-84f5-7bd447060c9a",
  "quote_id": "8462344b-a8b7-4e7d-b723-b02457633209",
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
  "id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "27e30347-ee43-4996-9dde-a492fd0cdc6d",
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
  "created_at": "2026-10-27T15:47:48.073512Z",
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
  "client_id": "27e30347-ee43-4996-9dde-a492fd0cdc6d",
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
      "id": "ba0835f5-9811-4fa8-86c2-30b4ee972946",
      "at": "2026-10-27T15:47:47.712173Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
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
    "id": "2beb9363-d09d-461c-a809-b6fd5be829dd",
    "order_id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3",
    "expires_at": "2026-10-27T15:48:03.081366Z",
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

`POST /api/driver/v1/offers/2beb9363-d09d-461c-a809-b6fd5be829dd/accept` → **200**

```json
{
  "command_id": "a910feda-4e4b-4901-8f7e-84988a3b46d9"
}
```

```json
{
  "id": "fb575928-0ab9-4085-a25a-54a11ba6a1ae",
  "order_id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9310b295-e133-4de2-a452-78dc82ba6e5d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9310b295-e133-4de2-a452-78dc82ba6e5d",
  "order_id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3",
  "assignment_id": "fb575928-0ab9-4085-a25a-54a11ba6a1ae",
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

`POST /api/driver/v1/work-sessions/96725149-6e5f-43ee-a157-0f5a52ab95c8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:47:48Z",
    "sequence": 1793116068221
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96725149-6e5f-43ee-a157-0f5a52ab95c8",
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
  "last_heartbeat_at": "2026-10-27T15:47:48.244115Z",
  "last_location_at": "2026-10-27T15:47:48.244115Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9310b295-e133-4de2-a452-78dc82ba6e5d/arrive` → **200**

```json
{
  "command_id": "e776604f-7d3d-45d3-a72c-7eb2aa4b240e",
  "expected_version": 0
}
```

```json
{
  "id": "9310b295-e133-4de2-a452-78dc82ba6e5d",
  "order_id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3",
  "assignment_id": "fb575928-0ab9-4085-a25a-54a11ba6a1ae",
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
  "arrived_at": "2026-10-27T15:47:48.282502Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/9310b295-e133-4de2-a452-78dc82ba6e5d/start` → **200**

```json
{
  "command_id": "30078715-bbd0-41d9-84a6-30978c200bc2",
  "expected_version": 1
}
```

```json
{
  "id": "9310b295-e133-4de2-a452-78dc82ba6e5d",
  "order_id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3",
  "assignment_id": "fb575928-0ab9-4085-a25a-54a11ba6a1ae",
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
  "arrived_at": "2026-10-27T15:47:48.282502Z",
  "started_at": "2026-10-27T15:47:48.319281Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9310b295-e133-4de2-a452-78dc82ba6e5d/complete` → **200**

```json
{
  "command_id": "439b5cf3-6a62-481c-967b-5410edc133da",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:47:48Z",
  "cash_received": true
}
```

```json
{
  "id": "9310b295-e133-4de2-a452-78dc82ba6e5d",
  "order_id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3",
  "assignment_id": "fb575928-0ab9-4085-a25a-54a11ba6a1ae",
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
  "arrived_at": "2026-10-27T15:47:48.282502Z",
  "started_at": "2026-10-27T15:47:48.319281Z",
  "completed_at": "2026-10-27T15:47:48.373703Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "27e30347-ee43-4996-9dde-a492fd0cdc6d",
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
      "id": "b0660da9-4eb9-4134-8f61-69b7bebaebf6",
      "at": "2026-10-27T15:47:48.915317Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3"
    },
    {
      "id": "ba0835f5-9811-4fa8-86c2-30b4ee972946",
      "at": "2026-10-27T15:47:47.712173Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/0d2058f3-1e7d-4dc4-93a1-feed34bf1756/archive` → **200**

```json
{
  "command_id": "109eebc2-84dd-4b4e-b00b-a4a411fc9112",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "0d2058f3-1e7d-4dc4-93a1-feed34bf1756",
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
  "created_by": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
  "created_at": "2026-10-27T15:47:47.54217Z",
  "updated_at": "2026-10-27T15:47:51.47272Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96725149-6e5f-43ee-a157-0f5a52ab95c8",
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
  "last_heartbeat_at": "2026-10-27T15:47:48.244115Z",
  "last_location_at": "2026-10-27T15:47:48.244115Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96725149-6e5f-43ee-a157-0f5a52ab95c8/close` → **200**

```json
{
  "command_id": "f136e54c-8fa7-4c08-a140-30da56621756",
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

Done: order e1b0f482-aa55-4e6e-8056-46cbf683fca3.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636930264",
  "device_ref": "sandbox-13171"
}
```

```json
{
  "challenge_id": "04235098-b1ad-4079-8475-3641bf605db2",
  "expires_at": "2026-10-27T15:52:51.572778596Z",
  "resend_available_at": "2026-10-27T15:47:52.572778596Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636930264` → **200**

```json
{
  "phone": "+380636930264",
  "audience": "CLIENT",
  "code": "862705",
  "sent_at": "2026-10-27T15:47:51.575263582Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04235098-b1ad-4079-8475-3641bf605db2",
  "code": "862705",
  "device_ref": "sandbox-13171"
}
```

```json
{
  "session_id": "2bd077ce-e4f8-40f7-9635-b756f0ab69e7",
  "subject": {
    "type": "CLIENT",
    "id": "e2d60cd9-cca1-4fb3-99a0-4a813677fa85"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMmQ2MGNkOS1jY2ExLTRmYjMtOTlhMC00YTgxMzY3N2ZhODUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTcxLCJpYXQiOjE3OTMxMTYwNzEsImp0aSI6IjZjMWE0MWYxLTRkZmMtNGY4ZS04MTZkLTg3ZDBiOWY4OTgxZSIsInNpZCI6IjJiZDA3N2NlLWU0ZjgtNDBmNy05NjM1LWI3NTZmMGFiNjllNyJ9.tokuEsSpqpWilScAFcyzQyZB6yVQTM4ZLbDEQgBjIn4",
  "access_expires_at": "2026-10-27T16:02:51.623121936Z",
  "refresh_token": "5IFSGPkJC6CiiEJhhRmjzXeEwSslp36FRA3zyPTZuYk",
  "refresh_expires_at": "2026-11-26T15:47:51.622448363Z",
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
  "device_ref": "sandbox-18912"
}
```

```json
{
  "challenge_id": "ac432589-f811-4293-b9ba-36f13fb6e6c9",
  "expires_at": "2026-10-27T15:52:51.668160642Z",
  "resend_available_at": "2026-10-27T15:47:52.668160642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "075648",
  "sent_at": "2026-10-27T15:47:51.670990126Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac432589-f811-4293-b9ba-36f13fb6e6c9",
  "code": "075648",
  "device_ref": "sandbox-18912"
}
```

```json
{
  "session_id": "e4e651c8-664d-4ea5-8d37-c367dfc41f22",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk3MSwiaWF0IjoxNzkzMTE2MDcxLCJqdGkiOiI3YWQ2ZWYzYy0wYmVlLTRiYTAtOGFmMi05NzNjMzQzZjFjY2IiLCJzaWQiOiJlNGU2NTFjOC02NjRkLTRlYTUtOGQzNy1jMzY3ZGZjNDFmMjIifQ.QuXlPV84PsUbmW0cwjlWWWUAy3kjoFNXDMEFAEtp4lM",
  "access_expires_at": "2026-10-27T16:02:51.722731547Z",
  "refresh_token": "H0iKgsIvgbECKL_ibeUyW6LUSgh_u1N0J39v7sSdUHo",
  "refresh_expires_at": "2026-11-26T15:47:51.721975219Z",
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
  "session_id": "47fa2763-124a-4d3e-b2d8-e3e361ce758f",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5NzEsImlhdCI6MTc5MzExNjA3MSwianRpIjoiNGYwNGMxNDItMDIzNi00MzU0LWExYWYtMWVmMDc2MmJkYThjIiwic2lkIjoiNDdmYTI3NjMtMTI0YS00ZDNlLWIyZDgtZTNlMzYxY2U3NThmIn0.q1t2YBYLk1_J7EK8iHDXEAqTUosH-K7bw_38gfxnFwQ",
  "access_expires_at": "2026-10-27T16:02:51.970819653Z",
  "refresh_token": "w1l019UbXSO2jZnMjvEkj6dFU4qkbE31RMkF4_43WUI",
  "refresh_expires_at": "2026-10-28T03:47:51.97035857Z",
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
  "session_id": "8a17fc60-4714-41f8-923a-9c7d0425e66c",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5NzIsImlhdCI6MTc5MzExNjA3MiwianRpIjoiZGRjYWNlY2MtNjU3MS00MzVlLTkyN2YtOTg3NGZlNzI0YzlkIiwic2lkIjoiOGExN2ZjNjAtNDcxNC00MWY4LTkyM2EtOWM3ZDA0MjVlNjZjIn0.oYe_l1778VL2bFPusMvzpgIEgFXa1XQSOAp6iYES18E",
  "access_expires_at": "2026-10-27T16:02:52.202278074Z",
  "refresh_token": "n4xXxtZOeozYCetua6THQKG4CZQ_yubm2y5GIgcbnyw",
  "refresh_expires_at": "2026-10-28T03:47:52.201749943Z",
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
  "command_id": "008f857d-b756-4469-a929-fee8b8cf4280",
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
  "id": "3d3ff344-9f3a-49fe-b663-ceb39c0a0dcb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:52:52.257161Z",
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
  "command_id": "9b5e85b2-e2e8-4dea-bd6a-ef7ef4d09d8e",
  "quote_id": "3d3ff344-9f3a-49fe-b663-ceb39c0a0dcb",
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
  "id": "0f92cbb3-cf25-4e55-83d7-608c8e139f29",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2d60cd9-cca1-4fb3-99a0-4a813677fa85",
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
  "created_at": "2026-10-27T15:47:52.289752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/0f92cbb3-cf25-4e55-83d7-608c8e139f29` → **200**

```json
{
  "id": "0f92cbb3-cf25-4e55-83d7-608c8e139f29",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2d60cd9-cca1-4fb3-99a0-4a813677fa85",
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
  "created_at": "2026-10-27T15:47:52.289752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/0f92cbb3-cf25-4e55-83d7-608c8e139f29/cancel` → **200**

```json
{
  "command_id": "41d90c6e-e47e-49e4-bda5-7695891d51d3",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "0f92cbb3-cf25-4e55-83d7-608c8e139f29",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e2d60cd9-cca1-4fb3-99a0-4a813677fa85",
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
  "created_at": "2026-10-27T15:47:52.289752Z",
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
  "command_id": "38518a57-5d4c-49d9-89d3-c3ed6dedabcf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:47:52Z",
    "sequence": 1793116072402
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7fcca6a8-921c-4e32-9437-fc0a0ce291c4",
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
  "last_heartbeat_at": "2026-10-27T15:47:52.41887Z",
  "last_location_at": "2026-10-27T15:47:52.41887Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20643"
}
```

```json
{
  "challenge_id": "73cebdb8-2e09-4ce0-aabf-fcbb0a7306bb",
  "expires_at": "2026-10-27T15:52:52.443790909Z",
  "resend_available_at": "2026-10-27T15:47:53.443790909Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "938877",
  "sent_at": "2026-10-27T15:47:52.446044917Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73cebdb8-2e09-4ce0-aabf-fcbb0a7306bb",
  "code": "938877",
  "device_ref": "sandbox-20643"
}
```

```json
{
  "session_id": "0ff916cc-7db9-4978-837a-fa399997f32b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk3MiwiaWF0IjoxNzkzMTE2MDcyLCJqdGkiOiJhZDY2MTBkMS02NDk1LTQxZWQtODExZi1iOTQzMDMwMDE1MTIiLCJzaWQiOiIwZmY5MTZjYy03ZGI5LTQ5NzgtODM3YS1mYTM5OTk5N2YzMmIifQ.VQ8PnAIufhHusyg2iQ5BJm__fhQ-QSIlQKGxUfVWrTE",
  "access_expires_at": "2026-10-27T16:02:52.492441012Z",
  "refresh_token": "xn97IZaSIGRtaijOUPYVZmzQD8UWDG8uVtGZVy8Ic8Y",
  "refresh_expires_at": "2026-11-26T15:47:52.491910861Z",
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
  "command_id": "ff6d00d2-61b0-4f2a-b7c0-a0bdb8d457c6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:47:52Z",
    "sequence": 1793116072534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
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
  "last_heartbeat_at": "2026-10-27T15:47:52.550368Z",
  "last_location_at": "2026-10-27T15:47:52.550368Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "948579e3-911c-431a-98bc-09ae51410000",
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
  "id": "136250d9-93b8-4226-8f35-ed416df5dbd9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:52:52.582840Z",
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
  "command_id": "5317b956-719d-48ee-a0b3-e35c5e7e66fd",
  "quote_id": "136250d9-93b8-4226-8f35-ed416df5dbd9",
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
  "id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e2d60cd9-cca1-4fb3-99a0-4a813677fa85",
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
  "created_at": "2026-10-27T15:47:52.614558Z",
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
    "id": "56c62cff-cd51-4b5b-b8fc-055e489c3fd5",
    "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
    "expires_at": "2026-10-27T15:48:07.617465Z",
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

`POST /api/driver/v1/offers/56c62cff-cd51-4b5b-b8fc-055e489c3fd5/accept` → **200**

```json
{
  "command_id": "32928e2e-3f43-4091-aba3-625055156e1d"
}
```

```json
{
  "id": "bcddc128-335f-47d7-bab1-9e237d594aed",
  "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e06f398c-a3ab-4b61-ade5-d39031f9560a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e06f398c-a3ab-4b61-ade5-d39031f9560a",
  "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
  "assignment_id": "bcddc128-335f-47d7-bab1-9e237d594aed",
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

`POST /api/driver/v1/trips/e06f398c-a3ab-4b61-ade5-d39031f9560a/cancel` → **200**

```json
{
  "command_id": "b343ee13-06d5-4d26-9677-2cacbbd29438",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "e06f398c-a3ab-4b61-ade5-d39031f9560a",
  "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
  "assignment_id": "bcddc128-335f-47d7-bab1-9e237d594aed",
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

`GET /api/rider/v1/orders/71357c93-1c9a-4c13-9edf-1677f8c380cc` → **200**

```json
{
  "id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e2d60cd9-cca1-4fb3-99a0-4a813677fa85",
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
    "id": "bcddc128-335f-47d7-bab1-9e237d594aed",
    "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e06f398c-a3ab-4b61-ade5-d39031f9560a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T15:47:52.614558Z",
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
    "id": "e7642491-9dd8-4ce1-9c96-5f6f25b18459",
    "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
    "expires_at": "2026-10-27T15:48:07.733874Z",
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

`POST /api/driver/v1/offers/e7642491-9dd8-4ce1-9c96-5f6f25b18459/accept` → **200**

```json
{
  "command_id": "a1758c48-90d3-4511-8bd1-68ffc36be831"
}
```

```json
{
  "id": "e15a140a-1605-49fb-a83e-9b4bb50ccd3a",
  "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fd40c5d0-a88b-4891-b857-1a749e3eb5d2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fd40c5d0-a88b-4891-b857-1a749e3eb5d2",
  "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
  "assignment_id": "e15a140a-1605-49fb-a83e-9b4bb50ccd3a",
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

`POST /api/driver/v1/trips/fd40c5d0-a88b-4891-b857-1a749e3eb5d2/cancel` → **200**

```json
{
  "command_id": "4c4d28c2-4d24-4f8d-9d9b-b251bdb7ccac",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "fd40c5d0-a88b-4891-b857-1a749e3eb5d2",
  "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
  "assignment_id": "e15a140a-1605-49fb-a83e-9b4bb50ccd3a",
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

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:47:52.614558Z",
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
    "id": "0f92cbb3-cf25-4e55-83d7-608c8e139f29",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:47:52.289752Z",
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

`GET /api/operator/v1/orders/71357c93-1c9a-4c13-9edf-1677f8c380cc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:47:52.61506Z",
      "actor": {
        "type": "CLIENT",
        "id": "e2d60cd9-cca1-4fb3-99a0-4a813677fa85",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
        "quote_id": "136250d9-93b8-4226-8f35-ed416df5dbd9",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:47:52.616749Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
        "attempt_id": "cbc24135-803f-4cd3-9071-3d47290c878b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:47:52.621078Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "56c62cff-cd51-4b5b-b8fc-055e489c3fd5",
        "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:47:52.669963Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "56c62cff-cd51-4b5b-b8fc-055e489c3fd5",
        "order_id": "71357c93-1c9a-4c13-9edf-1677f8c380cc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "bcddc128-335f-47d7-bab1-9e237d594aed"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 0f92cbb3-cf25-4e55-83d7-608c8e139f29, 71357c93-1c9a-4c13-9edf-1677f8c380cc.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731463672",
  "device_ref": "sandbox-21759"
}
```

```json
{
  "challenge_id": "be7d546a-38f4-4b0c-ae15-9f8ed96f11f0",
  "expires_at": "2026-10-27T15:52:52.953104711Z",
  "resend_available_at": "2026-10-27T15:47:53.953104711Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731463672` → **200**

```json
{
  "phone": "+380731463672",
  "audience": "CLIENT",
  "code": "949833",
  "sent_at": "2026-10-27T15:47:52.955657713Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be7d546a-38f4-4b0c-ae15-9f8ed96f11f0",
  "code": "949833",
  "device_ref": "sandbox-21759"
}
```

```json
{
  "session_id": "cadcbea1-a5df-4592-b61b-9658e9f8e6be",
  "subject": {
    "type": "CLIENT",
    "id": "9889e911-3aa8-47a7-85b4-20a698b8c9ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ODg5ZTkxMS0zYWE4LTQ3YTctODViNC0yMGE2OThiOGM5ZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTczLCJpYXQiOjE3OTMxMTYwNzMsImp0aSI6ImIzNmU5ZWVmLWU5ZDgtNDBkOC05YjZkLTVmY2I2NDUwNDgzZiIsInNpZCI6ImNhZGNiZWExLWE1ZGYtNDU5Mi1iNjFiLTk2NThlOWY4ZTZiZSJ9.20N6fvFI_oeGTQUx5oMGjR7wU_lRvOvu1L3RVZ05RuA",
  "access_expires_at": "2026-10-27T16:02:53.009595682Z",
  "refresh_token": "DNy10jIwlaxvt9H5X5z34km9HwxLDtA-qxTmze5hvlk",
  "refresh_expires_at": "2026-11-26T15:47:53.008937713Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "15b0c87f-57fe-4b22-bfc9-fedff89e9bc4",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "879fa835-9649-4471-8384-d81888d675fa",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-879fa835-9649-4471-8384-d81888d675fa",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "0de5112e0d2d88af98fb8f8f2d8f3fbe",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=879fa835-9649-4471-8384-d81888d675fa",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731463672"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=879fa835-9649-4471-8384-d81888d675fa",
  "expires_at": "2026-10-27T16:17:53.0426Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/879fa835-9649-4471-8384-d81888d675fa` → **200**

```json
{
  "id": "879fa835-9649-4471-8384-d81888d675fa",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T16:17:53.0426Z",
  "card": {
    "id": "1f98cb30-7738-484a-8d4f-bb07f2681ba3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5225",
    "card_type": "Visa",
    "created_at": "2026-10-27T15:47:53.083493Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "1f98cb30-7738-484a-8d4f-bb07f2681ba3",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5225",
      "card_type": "Visa",
      "created_at": "2026-10-27T15:47:53.083493Z"
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
  "device_ref": "sandbox-102"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "cf5f7622-b8d4-4eb1-b349-a02d8c937a41",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-102"
}
```

```json
{
  "challenge_id": "127d7bfb-aa01-4a1e-af17-6f3661ab3f2e",
  "expires_at": "2026-10-27T15:52:54.175317471Z",
  "resend_available_at": "2026-10-27T15:47:55.175317471Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "906667",
  "sent_at": "2026-10-27T15:47:54.177438703Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "127d7bfb-aa01-4a1e-af17-6f3661ab3f2e",
  "code": "906667",
  "device_ref": "sandbox-102"
}
```

```json
{
  "session_id": "8ca0aa1c-58d8-4097-bbe9-c84adda0f1c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk3NCwiaWF0IjoxNzkzMTE2MDc0LCJqdGkiOiJmNDY5ZWVlMS1hZmI4LTQyMzQtODE3Ny01MGJmNjA4NzEzYzciLCJzaWQiOiI4Y2EwYWExYy01OGQ4LTQwOTctYmJlOS1jODRhZGRhMGYxYzIifQ.ub-zEgoAkUbO84Ry-UKUMfvXjDx1nLeTlMlK5k3xGUY",
  "access_expires_at": "2026-10-27T16:02:54.221369989Z",
  "refresh_token": "Ke7avCo6I-7AIaVy9NmFPu9BK-omNrp2lPSDBuOWbmU",
  "refresh_expires_at": "2026-11-26T15:47:54.220998491Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
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
  "last_heartbeat_at": "2026-10-27T15:47:52.550368Z",
  "last_location_at": "2026-10-27T15:47:52.550368Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b87e2525-40d5-49b1-a6f4-ba12f96649ec/handover` → **200**

```json
{
  "command_id": "f585f500-6496-4d23-8dba-3d000707d330",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
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
  "last_heartbeat_at": "2026-10-27T15:47:52.550368Z",
  "last_location_at": "2026-10-27T15:47:52.550368Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b87e2525-40d5-49b1-a6f4-ba12f96649ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:47:54Z",
    "sequence": 1793116074295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
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
  "last_heartbeat_at": "2026-10-27T15:47:54.311944Z",
  "last_location_at": "2026-10-27T15:47:54.311944Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eaf02395-f0d9-4219-b38c-e29c125ae6ee",
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
  "id": "b0d718f2-0c67-4ea1-a104-03c7eecbb139",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T15:52:54.345239Z",
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
  "command_id": "3fc67639-ffd7-4326-8518-47a73e300ab1",
  "quote_id": "b0d718f2-0c67-4ea1-a104-03c7eecbb139",
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
  "id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9889e911-3aa8-47a7-85b4-20a698b8c9ee",
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
  "created_at": "2026-10-27T15:47:54.383085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/41e50c9d-d719-421a-8c38-4562835c7743` → **200**

```json
{
  "id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9889e911-3aa8-47a7-85b4-20a698b8c9ee",
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
  "created_at": "2026-10-27T15:47:54.383085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/41e50c9d-d719-421a-8c38-4562835c7743` → **200**

```json
{
  "id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9889e911-3aa8-47a7-85b4-20a698b8c9ee",
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
  "created_at": "2026-10-27T15:47:54.383085Z",
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
    "id": "7ac892c8-cd46-4106-9901-2bdccf96fc02",
    "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
    "expires_at": "2026-10-27T15:48:10.005508Z",
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

`POST /api/driver/v1/offers/7ac892c8-cd46-4106-9901-2bdccf96fc02/accept` → **200**

```json
{
  "command_id": "a0f86ab5-332b-4851-918a-e557b930362f"
}
```

```json
{
  "id": "b86c80ba-57ec-4911-ac57-d3f412a19e9d",
  "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f1b912fb-8ca8-4235-a999-1fdb5f33398f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f1b912fb-8ca8-4235-a999-1fdb5f33398f",
  "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "assignment_id": "b86c80ba-57ec-4911-ac57-d3f412a19e9d",
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

`POST /api/driver/v1/work-sessions/b87e2525-40d5-49b1-a6f4-ba12f96649ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:47:55Z",
    "sequence": 1793116075527
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
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
  "last_heartbeat_at": "2026-10-27T15:47:55.544331Z",
  "last_location_at": "2026-10-27T15:47:55.544331Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f1b912fb-8ca8-4235-a999-1fdb5f33398f/arrive` → **200**

```json
{
  "command_id": "445cec42-8905-45ec-ba6a-7cf4e6db5d8e",
  "expected_version": 0
}
```

```json
{
  "id": "f1b912fb-8ca8-4235-a999-1fdb5f33398f",
  "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "assignment_id": "b86c80ba-57ec-4911-ac57-d3f412a19e9d",
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
  "arrived_at": "2026-10-27T15:47:55.574793Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/f1b912fb-8ca8-4235-a999-1fdb5f33398f/start` → **200**

```json
{
  "command_id": "f1a3a3ab-c86d-40b2-be0d-22acaffc5e53",
  "expected_version": 1
}
```

```json
{
  "id": "f1b912fb-8ca8-4235-a999-1fdb5f33398f",
  "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "assignment_id": "b86c80ba-57ec-4911-ac57-d3f412a19e9d",
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
  "arrived_at": "2026-10-27T15:47:55.574793Z",
  "started_at": "2026-10-27T15:47:55.607078Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/f1b912fb-8ca8-4235-a999-1fdb5f33398f/complete` → **200**

```json
{
  "command_id": "4a73e16b-5c05-4717-9ae6-bb09f927fef3",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:47:55Z"
}
```

```json
{
  "id": "f1b912fb-8ca8-4235-a999-1fdb5f33398f",
  "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "assignment_id": "b86c80ba-57ec-4911-ac57-d3f412a19e9d",
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
  "arrived_at": "2026-10-27T15:47:55.574793Z",
  "started_at": "2026-10-27T15:47:55.607078Z",
  "completed_at": "2026-10-27T15:47:55.642533Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/41e50c9d-d719-421a-8c38-4562835c7743` → **200**

```json
{
  "id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9889e911-3aa8-47a7-85b4-20a698b8c9ee",
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
    "id": "b86c80ba-57ec-4911-ac57-d3f412a19e9d",
    "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f1b912fb-8ca8-4235-a999-1fdb5f33398f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:47:54.383085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/41e50c9d-d719-421a-8c38-4562835c7743` → **200**

```json
{
  "id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9889e911-3aa8-47a7-85b4-20a698b8c9ee",
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
    "id": "b86c80ba-57ec-4911-ac57-d3f412a19e9d",
    "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f1b912fb-8ca8-4235-a999-1fdb5f33398f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:47:54.383085Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/41e50c9d-d719-421a-8c38-4562835c7743` → **200**

```json
{
  "id": "41e50c9d-d719-421a-8c38-4562835c7743",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9889e911-3aa8-47a7-85b4-20a698b8c9ee",
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
    "id": "b86c80ba-57ec-4911-ac57-d3f412a19e9d",
    "order_id": "41e50c9d-d719-421a-8c38-4562835c7743",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f1b912fb-8ca8-4235-a999-1fdb5f33398f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:47:54.383085Z",
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

Done: card order 41e50c9d-d719-421a-8c38-4562835c7743.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739101111",
  "device_ref": "sandbox-14512"
}
```

```json
{
  "challenge_id": "680b8f8f-496f-4e88-bdba-7b3af4cc79cd",
  "expires_at": "2026-10-27T15:52:57.773884297Z",
  "resend_available_at": "2026-10-27T15:47:58.773884297Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739101111` → **200**

```json
{
  "phone": "+380739101111",
  "audience": "CLIENT",
  "code": "119957",
  "sent_at": "2026-10-27T15:47:57.776145507Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "680b8f8f-496f-4e88-bdba-7b3af4cc79cd",
  "code": "119957",
  "device_ref": "sandbox-14512"
}
```

```json
{
  "session_id": "1be4acaa-107b-47c3-8716-89b510f47d4e",
  "subject": {
    "type": "CLIENT",
    "id": "832be94e-f5f0-487c-b83b-92d589fefcac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzJiZTk0ZS1mNWYwLTQ4N2MtYjgzYi05MmQ1ODlmZWZjYWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTc3LCJpYXQiOjE3OTMxMTYwNzcsImp0aSI6IjJkYjZiYTAxLWQ3NGEtNGE2Ni04MDg5LTQwNmZhMDY0N2JkMCIsInNpZCI6IjFiZTRhY2FhLTEwN2ItNDdjMy04NzE2LTg5YjUxMGY0N2Q0ZSJ9.EMdOauyO0tI4JugVylvIrt2BUAsD_bEp4XgSvofW3ZM",
  "access_expires_at": "2026-10-27T16:02:57.823504251Z",
  "refresh_token": "UxSDLL64rGVFUSRDn3n1fmkpKxoRucl5LDbtBDlXDno",
  "refresh_expires_at": "2026-11-26T15:47:57.823050473Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "178072c6-d4a3-4144-b885-9405d8c55722",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "b3a0ea6d-622c-47fe-b071-509379b9e1e4",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b3a0ea6d-622c-47fe-b071-509379b9e1e4",
    "orderDate": "1793116077",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "df5e2a20e1c997d0fb96eb21f9610320",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b3a0ea6d-622c-47fe-b071-509379b9e1e4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739101111"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b3a0ea6d-622c-47fe-b071-509379b9e1e4",
  "created_at": "2026-10-27T15:47:57.853672Z",
  "expires_at": "2026-10-27T16:17:57.853672Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/b3a0ea6d-622c-47fe-b071-509379b9e1e4` → **200**

```json
{
  "id": "b3a0ea6d-622c-47fe-b071-509379b9e1e4",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:47:57.853672Z",
  "expires_at": "2026-10-27T16:17:57.853672Z",
  "completed_at": "2026-10-27T15:47:57.886703Z",
  "masked_pan": "41****8333",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "832be94e-f5f0-487c-b83b-92d589fefcac",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "832be94e-f5f0-487c-b83b-92d589fefcac",
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
      "id": "ee6fe736-ac2d-40fe-9f14-2795622b4751",
      "at": "2026-10-27T15:47:58.063416Z",
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
  "client_id": "832be94e-f5f0-487c-b83b-92d589fefcac",
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
      "id": "ee6fe736-ac2d-40fe-9f14-2795622b4751",
      "at": "2026-10-27T15:47:58.063416Z",
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
  "device_ref": "sandbox-30553"
}
```

```json
{
  "challenge_id": "cfb7a86a-0cbb-44b9-9656-47445803eec1",
  "expires_at": "2026-10-27T15:52:59.004796433Z",
  "resend_available_at": "2026-10-27T15:48:00.004796433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "616113",
  "sent_at": "2026-10-27T15:47:59.011782949Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfb7a86a-0cbb-44b9-9656-47445803eec1",
  "code": "616113",
  "device_ref": "sandbox-30553"
}
```

```json
{
  "session_id": "64552a72-6f8c-4842-8ef4-7a55a6035575",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk3OSwiaWF0IjoxNzkzMTE2MDc5LCJqdGkiOiI5Y2VlZWY4Mi03OGVlLTQyYmUtYTU4Yy0zNzYyMmU1YjY4YjciLCJzaWQiOiI2NDU1MmE3Mi02ZjhjLTQ4NDItOGVmNC03YTU1YTYwMzU1NzUifQ.nuf2-M4T2AfSqcDLdsnsy0MP5_Rl8Sj8HYgvXiDL73A",
  "access_expires_at": "2026-10-27T16:02:59.111059601Z",
  "refresh_token": "npNgLRTYp91MhYYJNY_pPmsStyU_NtA_gPpdXxF8ZVM",
  "refresh_expires_at": "2026-11-26T15:47:59.110051835Z",
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
  "command_id": "533a85d8-23a6-4bda-b8b8-8986a2970658",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "52eeacb0-383c-4abd-970c-0de5b7020daf",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-52eeacb0-383c-4abd-970c-0de5b7020daf",
    "orderDate": "1793116079",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "8037198d120b3f584f7135e5b3a2c4cc",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=52eeacb0-383c-4abd-970c-0de5b7020daf",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=52eeacb0-383c-4abd-970c-0de5b7020daf",
  "created_at": "2026-10-27T15:47:59.167046Z",
  "expires_at": "2026-10-27T16:17:59.167046Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/52eeacb0-383c-4abd-970c-0de5b7020daf` → **200**

```json
{
  "id": "52eeacb0-383c-4abd-970c-0de5b7020daf",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:47:59.167046Z",
  "expires_at": "2026-10-27T16:17:59.167046Z",
  "completed_at": "2026-10-27T15:47:59.193172Z",
  "masked_pan": "41****2967",
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
      "id": "e3f1d29c-3979-4e22-8776-6d4d09bd368d",
      "at": "2026-10-27T15:48:00.078391Z",
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
  "command_id": "eefa06ca-1fd4-4bb2-a498-4ce5f7f1b52b",
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
  "correlation_id": "6a8fc043-66bf-41ed-a7a4-a9c355410008"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676623633",
  "device_ref": "sandbox-15257"
}
```

```json
{
  "challenge_id": "e1f03f99-e7fd-4b27-ad19-1e680bb44e54",
  "expires_at": "2026-10-27T15:53:00.310930086Z",
  "resend_available_at": "2026-10-27T15:48:01.310930086Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676623633` → **200**

```json
{
  "phone": "+380676623633",
  "audience": "CLIENT",
  "code": "466652",
  "sent_at": "2026-10-27T15:48:00.313005489Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1f03f99-e7fd-4b27-ad19-1e680bb44e54",
  "code": "466652",
  "device_ref": "sandbox-15257"
}
```

```json
{
  "session_id": "a8bf012e-1927-446b-807d-38984ac899f0",
  "subject": {
    "type": "CLIENT",
    "id": "6879b455-384d-4410-9836-8469837d9194"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODc5YjQ1NS0zODRkLTQ0MTAtOTgzNi04NDY5ODM3ZDkxOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTgwLCJpYXQiOjE3OTMxMTYwODAsImp0aSI6ImYyZGY5MzZmLTY2YmYtNDA1Ny05MmE3LWM0ODFkYmUwMzlhYiIsInNpZCI6ImE4YmYwMTJlLTE5MjctNDQ2Yi04MDdkLTM4OTg0YWM4OTlmMCJ9.K1l-eXmZFzq8E_WOAaNLxbWrl1dL9mIBN9nIn79AUl4",
  "access_expires_at": "2026-10-27T16:03:00.357714028Z",
  "refresh_token": "vChe1useKPGqGlKXfTcZtdbn7HpTXh6ZKeirf2zRv50",
  "refresh_expires_at": "2026-11-26T15:48:00.357350774Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6879b455-384d-4410-9836-8469837d9194",
  "session_id": "a8bf012e-1927-446b-807d-38984ac899f0",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "275a3cb1-d4f4-49ae-bcd3-08c910bba7c4",
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
  "id": "cec5159e-8777-4002-9ad3-632610881ada",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:53:00.410658Z",
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
  "challenge_id": "780d5c4b-c52e-42fd-bb56-ce665447a311",
  "expires_at": "2026-10-27T15:53:02.443245527Z",
  "resend_available_at": "2026-10-27T15:48:03.443245527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676623633` → **200**

```json
{
  "phone": "+380676623633",
  "audience": "CLIENT",
  "code": "640097",
  "sent_at": "2026-10-27T15:48:02.44488981Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "a9bd8fef-5ba6-4a0d-856d-48416a9792f1",
  "challenge_id": "780d5c4b-c52e-42fd-bb56-ce665447a311",
  "otp_code": "640097"
}
```

```json
{
  "client_id": "6879b455-384d-4410-9836-8469837d9194",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T15:48:02.501356731Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "f25f796e-6553-453e-b316-41a942c69af8",
  "quote_id": "cec5159e-8777-4002-9ad3-632610881ada",
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
  "correlation_id": "ce42dfc5-e813-4d05-bf25-998569215aeb"
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
  "session_id": "a610ffc1-a0e4-42bc-8b3c-16785d544736",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5ODIsImlhdCI6MTc5MzExNjA4MiwianRpIjoiM2U2NGY1MjAtY2Y5MC00Yzc0LThjNjUtNDIxZGI3Yjg2MDgzIiwic2lkIjoiYTYxMGZmYzEtYTBlNC00MmJjLThiM2MtMTY3ODVkNTQ0NzM2In0.8Ocro1OMYvDmGvU7Rq7OI7ZzuPuAqYuCKbIcCmh9xyY",
  "access_expires_at": "2026-10-27T16:03:02.786533587Z",
  "refresh_token": "Lfm725ZtMNEbm1jCn3YzZaXvR1oRBhBaBbSu3X2zw6U",
  "refresh_expires_at": "2026-10-28T03:48:02.785644901Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "6879b455-384d-4410-9836-8469837d9194",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T15:48:02.501357Z",
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

`POST /api/admin/v1/client-deletions/6879b455-384d-4410-9836-8469837d9194/complete` → **200**

```json
{
  "command_id": "8af7beb3-12c8-483d-8b18-15469fae6a7d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "6879b455-384d-4410-9836-8469837d9194",
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
  "correlation_id": "0c695d0e-8e15-41c4-bb25-1329372e2614"
}
```

Done: client 6879b455-384d-4410-9836-8469837d9194 anonymized.

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
  "device_ref": "sandbox-25220"
}
```

```json
{
  "challenge_id": "66613d09-9641-43df-99ca-f450c3d97746",
  "expires_at": "2026-10-27T15:53:02.944310823Z",
  "resend_available_at": "2026-10-27T15:48:03.944310823Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "824420",
  "sent_at": "2026-10-27T15:48:02.946230093Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66613d09-9641-43df-99ca-f450c3d97746",
  "code": "824420",
  "device_ref": "sandbox-25220"
}
```

```json
{
  "session_id": "8ac0a4ac-d0c0-40db-bce1-824642fafcfa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk4MiwiaWF0IjoxNzkzMTE2MDgyLCJqdGkiOiIwZTcxYTEyZi0xMDJhLTQ5YTAtYTA5Mi1mM2U4MDZjZjk5N2IiLCJzaWQiOiI4YWMwYTRhYy1kMGMwLTQwZGItYmNlMS04MjQ2NDJmYWZjZmEifQ.3fXTRBSSZPjXSesF8CBn7qmt3MSaktGBBn2Euy_xAr8",
  "access_expires_at": "2026-10-27T16:03:02.991067356Z",
  "refresh_token": "l1hyv944G-XnUBQQzxoygky-21eiWyZP7Dg3SRRuswI",
  "refresh_expires_at": "2026-11-26T15:48:02.990654124Z",
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
  "command_id": "c9f41f72-a5a4-4b99-9055-5e0f0c002af7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:03Z",
    "sequence": 1793116083344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:03.049804Z",
  "last_location_at": "2026-10-27T15:48:03.049804Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671685391",
  "device_ref": "sandbox-21106"
}
```

```json
{
  "challenge_id": "a560bfc8-3bd3-482f-aee8-6da313a00e81",
  "expires_at": "2026-10-27T15:53:03.076526693Z",
  "resend_available_at": "2026-10-27T15:48:04.076526693Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671685391` → **200**

```json
{
  "phone": "+380671685391",
  "audience": "CLIENT",
  "code": "355615",
  "sent_at": "2026-10-27T15:48:03.078139684Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a560bfc8-3bd3-482f-aee8-6da313a00e81",
  "code": "355615",
  "device_ref": "sandbox-21106"
}
```

```json
{
  "session_id": "44dc1f98-ab98-4c49-9433-5e63dd511f87",
  "subject": {
    "type": "CLIENT",
    "id": "5e9c1008-9ec3-4dfd-956e-727638c7579f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTljMTAwOC05ZWMzLTRkZmQtOTU2ZS03Mjc2MzhjNzU3OWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTgzLCJpYXQiOjE3OTMxMTYwODMsImp0aSI6IjYyZDkyYzE5LTg2NjEtNDA1My1iYWQyLTViYzhjZGMyYjM2MiIsInNpZCI6IjQ0ZGMxZjk4LWFiOTgtNGM0OS05NDMzLTVlNjNkZDUxMWY4NyJ9.0pabW6T6D_Jbioye2JhTuY4Etzs8OACyuxTMPpE1XS0",
  "access_expires_at": "2026-10-27T16:03:03.158645974Z",
  "refresh_token": "O6JxToe9X5MdE7aoaEYMy75t9lk-mYILcuCPQdFtAY0",
  "refresh_expires_at": "2026-11-26T15:48:03.15829714Z",
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
  "command_id": "dd4f392b-9b7b-4d6e-8c13-aafe676aa89e",
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
  "id": "87bb4f2e-8b1a-4c62-bb33-c461a6b18d76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:53:03.217275Z",
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
  "command_id": "6050bdd6-b31e-4de4-800e-78b1388b7aef",
  "platform": "ANDROID",
  "token": "sandbox-driver-62067f40-5637-487f-b959-f1f9c511ad40"
}
```

```json
{
  "id": "6c94c29c-e567-4435-a660-3552ff37f2c2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:48:03.254173Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "77b385bf-60c1-4b7a-bc06-14669dace54c",
  "platform": "ANDROID",
  "token": "sandbox-rider-874f4905-1357-484f-b8ac-9b442506fff4"
}
```

```json
{
  "id": "fdc888a1-91c7-4e9f-9c17-ab39016586a1",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:48:03.28397Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4db43fca-c228-42e7-a4ce-6f3d557d58b1",
  "quote_id": "87bb4f2e-8b1a-4c62-bb33-c461a6b18d76",
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
  "id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5e9c1008-9ec3-4dfd-956e-727638c7579f",
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
  "created_at": "2026-10-27T15:48:03.317654Z",
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
    "id": "28e7581d-dded-4d7b-b2c4-1d3fbc8a1508",
    "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
    "expires_at": "2026-10-27T15:48:18.321164Z",
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

`POST /api/driver/v1/offers/28e7581d-dded-4d7b-b2c4-1d3fbc8a1508/accept` → **200**

```json
{
  "command_id": "67d43f36-9b9a-4195-b3da-7f44a0442d73"
}
```

```json
{
  "id": "d92f8b7b-1327-4adc-b3f9-4f356dc23ce7",
  "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "71920882-d0e7-427a-89b1-f3a273b649df",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:48:03.298Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:48:03.298Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:48:03.298Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:48:04.901459578Z",
    "token_suffix": "11ad40",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "5b82142a-ac90-4df3-9d54-38acaf0ecede",
      "order_version": "2",
      "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671685391&after=2026-10-27T15:48:03.298Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:48:04.902831631Z",
    "token_suffix": "06fff4",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "a21aa230-d5ce-40d4-8768-eb89f29e7127",
      "order_version": "3",
      "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/54c3cc42-b570-4b69-bf4b-a89ab25fe3b7/messages` → **201**

```json
{
  "command_id": "361f476a-378e-4f8e-aa52-dd50d7b83106",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "b04de9ba-5fb9-46ea-8c4c-d26117804782",
  "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T15:48:05.512810985Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "71920882-d0e7-427a-89b1-f3a273b649df",
  "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "assignment_id": "d92f8b7b-1327-4adc-b3f9-4f356dc23ce7",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/71920882-d0e7-427a-89b1-f3a273b649df/messages` → **201**

```json
{
  "command_id": "aee31ca7-38c8-4ad9-a1ba-81cdd903e142",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a4ac2f6e-b110-4d10-b53d-794a176a7e94",
  "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T15:48:05.55823931Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/54c3cc42-b570-4b69-bf4b-a89ab25fe3b7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/71920882-d0e7-427a-89b1-f3a273b649df/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671685391"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:05Z",
    "sequence": 1793116085653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:05.672779Z",
  "last_location_at": "2026-10-27T15:48:05.672779Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "71920882-d0e7-427a-89b1-f3a273b649df",
  "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "assignment_id": "d92f8b7b-1327-4adc-b3f9-4f356dc23ce7",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/71920882-d0e7-427a-89b1-f3a273b649df/arrive` → **200**

```json
{
  "command_id": "22993895-598b-45a1-b4a9-a30466f25ed0",
  "expected_version": 0
}
```

```json
{
  "id": "71920882-d0e7-427a-89b1-f3a273b649df",
  "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "assignment_id": "d92f8b7b-1327-4adc-b3f9-4f356dc23ce7",
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
  "arrived_at": "2026-10-27T15:48:05.727399Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/71920882-d0e7-427a-89b1-f3a273b649df/start` → **200**

```json
{
  "command_id": "3aa5f792-220d-4b4e-9929-c6bdb27da90f",
  "expected_version": 1
}
```

```json
{
  "id": "71920882-d0e7-427a-89b1-f3a273b649df",
  "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "assignment_id": "d92f8b7b-1327-4adc-b3f9-4f356dc23ce7",
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
  "arrived_at": "2026-10-27T15:48:05.727399Z",
  "started_at": "2026-10-27T15:48:05.755708Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:05Z",
    "sequence": 1793116085774
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:05.790041Z",
  "last_location_at": "2026-10-27T15:48:05.790041Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/71920882-d0e7-427a-89b1-f3a273b649df/complete` → **200**

```json
{
  "command_id": "2f0526eb-6ab9-4f6f-8b65-25e8baae4a42",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:48:05Z",
  "cash_received": true
}
```

```json
{
  "id": "71920882-d0e7-427a-89b1-f3a273b649df",
  "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "assignment_id": "d92f8b7b-1327-4adc-b3f9-4f356dc23ce7",
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
  "arrived_at": "2026-10-27T15:48:05.727399Z",
  "started_at": "2026-10-27T15:48:05.755708Z",
  "completed_at": "2026-10-27T15:48:05.818625Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/54c3cc42-b570-4b69-bf4b-a89ab25fe3b7` → **200**

```json
{
  "id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5e9c1008-9ec3-4dfd-956e-727638c7579f",
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
    "id": "d92f8b7b-1327-4adc-b3f9-4f356dc23ce7",
    "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "71920882-d0e7-427a-89b1-f3a273b649df",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:48:03.317654Z",
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
    "id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:48:03.317654Z",
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
    "id": "71920882-d0e7-427a-89b1-f3a273b649df",
    "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
    "order_short_number": 5,
    "created_at": "2026-10-27T15:48:03.380368Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9310b295-e133-4de2-a452-78dc82ba6e5d",
    "order_id": "e1b0f482-aa55-4e6e-8056-46cbf683fca3",
    "order_short_number": 1,
    "created_at": "2026-10-27T15:47:48.174426Z",
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
  "session_id": "8815e168-12b8-4021-aec2-18cd48f8478d",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5ODksImlhdCI6MTc5MzExNjA4OSwianRpIjoiNjdjZTNlYTMtYzcwMi00ZDc4LTkxZmUtOThjMGE3OGYzZDNlIiwic2lkIjoiODgxNWUxNjgtMTJiOC00MDIxLWFlYzItMThjZDQ4Zjg0NzhkIn0.gaPUYNoRQRPnr5xTkQl9gR0vLpQdhQpoenkO7Rc_cug",
  "access_expires_at": "2026-10-27T16:03:09.138137152Z",
  "refresh_token": "me7isKNeaXoKYL2V5vt5HlQ7tYiJ8A4wkX-EA44d9PI",
  "refresh_expires_at": "2026-10-28T03:48:09.137600429Z",
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
  "session_id": "3ce3181e-b015-46cb-985e-46f44c6b75eb",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5ODksImlhdCI6MTc5MzExNjA4OSwianRpIjoiOGNjNDg2ODgtZWYzYy00NzIzLWJlZTctYjhmNGQ2OGRmZmJjIiwic2lkIjoiM2NlMzE4MWUtYjAxNS00NmNiLTk4NWUtNDZmNDRjNmI3NWViIn0.62QySB-9kk9rJI26xggBT14Hr8aSiypumujKJ2kFNNk",
  "access_expires_at": "2026-10-27T16:03:09.368016685Z",
  "refresh_token": "aKgNsXNWyg9SKjeHpE1Zt1ULdiDdy-1zDzuM3pvINhI",
  "refresh_expires_at": "2026-10-28T03:48:09.367502709Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/54c3cc42-b570-4b69-bf4b-a89ab25fe3b7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:48:03.31832Z",
      "actor": {
        "type": "CLIENT",
        "id": "5e9c1008-9ec3-4dfd-956e-727638c7579f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
        "quote_id": "87bb4f2e-8b1a-4c62-bb33-c461a6b18d76",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:48:03.320278Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
        "attempt_id": "2b01f281-87b5-4730-89de-f150cbd0f9df",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:48:03.324705Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "28e7581d-dded-4d7b-b2c4-1d3fbc8a1508",
        "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:48:03.381741Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "28e7581d-dded-4d7b-b2c4-1d3fbc8a1508",
        "order_id": "54c3cc42-b570-4b69-bf4b-a89ab25fe3b7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d92f8b7b-1327-4adc-b3f9-4f356dc23ce7"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 54c3cc42-b570-4b69-bf4b-a89ab25fe3b7.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19855"
}
```

```json
{
  "challenge_id": "433e93a2-5322-462e-9a1a-3b8f09cf7ce4",
  "expires_at": "2026-10-27T15:53:09.421884959Z",
  "resend_available_at": "2026-10-27T15:48:10.421884959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "828127",
  "sent_at": "2026-10-27T15:48:09.423833142Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "433e93a2-5322-462e-9a1a-3b8f09cf7ce4",
  "code": "828127",
  "device_ref": "sandbox-19855"
}
```

```json
{
  "session_id": "2c96a120-cbc1-402e-b92e-e80223d683a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk4OSwiaWF0IjoxNzkzMTE2MDg5LCJqdGkiOiJmZjE5YTY2Yi0wZWFlLTQwOTQtOTJlYi0wYjYwNjdkZDE4N2EiLCJzaWQiOiIyYzk2YTEyMC1jYmMxLTQwMmUtYjkyZS1lODAyMjNkNjgzYTgifQ.k1WSJUJYy6_SQvO6WBlhSdYYCaXWOQNtFtMTzhD7R3M",
  "access_expires_at": "2026-10-27T16:03:09.468355108Z",
  "refresh_token": "XgRwPIKrsSbN32NX2ZhXejDkf493KMcYKedcV4W_MAE",
  "refresh_expires_at": "2026-11-26T15:48:09.467898427Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:05.790041Z",
  "last_location_at": "2026-10-27T15:48:05.790041Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/handover` → **200**

```json
{
  "command_id": "608ae719-8fd8-4f54-bb2a-f68aafe05bb8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:05.790041Z",
  "last_location_at": "2026-10-27T15:48:05.790041Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:09Z",
    "sequence": 1793116089545
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:09.561696Z",
  "last_location_at": "2026-10-27T15:48:09.561696Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664559256",
  "device_ref": "sandbox-18001"
}
```

```json
{
  "challenge_id": "efccf142-cd7d-4151-b37f-1aca2babf564",
  "expires_at": "2026-10-27T15:53:09.581595027Z",
  "resend_available_at": "2026-10-27T15:48:10.581595027Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664559256` → **200**

```json
{
  "phone": "+380664559256",
  "audience": "CLIENT",
  "code": "559772",
  "sent_at": "2026-10-27T15:48:09.583166646Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efccf142-cd7d-4151-b37f-1aca2babf564",
  "code": "559772",
  "device_ref": "sandbox-18001"
}
```

```json
{
  "session_id": "2dfa3387-8acf-467f-8563-c5386a34e3f3",
  "subject": {
    "type": "CLIENT",
    "id": "cd02e152-39f4-4f57-b2da-26288abbde6a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDAyZTE1Mi0zOWY0LTRmNTctYjJkYS0yNjI4OGFiYmRlNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTg5LCJpYXQiOjE3OTMxMTYwODksImp0aSI6ImQxZjVhNmVlLWU4N2YtNGUyNS1iMjQ2LTVkZWFhMDc5NzgxNiIsInNpZCI6IjJkZmEzMzg3LThhY2YtNDY3Zi04NTYzLWM1Mzg2YTM0ZTNmMyJ9.3-L-UEEnoY5m55zumQunX00nIy1ReIgzJ2sHpqmYBFI",
  "access_expires_at": "2026-10-27T16:03:09.630076916Z",
  "refresh_token": "ZnqF7TmgygwYvD-tGk7mORkzUw4f0jSW_LAwaAt7j8s",
  "refresh_expires_at": "2026-11-26T15:48:09.629563009Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "78ba9cd0-5354-43cd-9eee-c474812158b9",
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
  "id": "8f42cb9c-7434-4c29-8988-31f9b2b9059e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T15:53:09.659961Z",
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
  "command_id": "1155ddba-ab60-4f71-88fb-0bc3e996c62b",
  "quote_id": "8f42cb9c-7434-4c29-8988-31f9b2b9059e",
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
  "id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cd02e152-39f4-4f57-b2da-26288abbde6a",
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
  "created_at": "2026-10-27T15:48:09.689939Z",
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
    "id": "cef80f05-a74a-40e0-8a64-6f0210664a0a",
    "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
    "expires_at": "2026-10-27T15:48:24.692347Z",
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

`POST /api/driver/v1/offers/cef80f05-a74a-40e0-8a64-6f0210664a0a/accept` → **200**

```json
{
  "command_id": "a6a8dc81-1a14-42a2-b710-55521f76c682"
}
```

```json
{
  "id": "e9ac438e-ad3a-4cb8-aae3-d0460abdad15",
  "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "16264b2c-2659-497a-a23f-e80943d46111",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "16264b2c-2659-497a-a23f-e80943d46111",
  "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
  "assignment_id": "e9ac438e-ad3a-4cb8-aae3-d0460abdad15",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:09Z",
    "sequence": 1793116089773
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:09.789851Z",
  "last_location_at": "2026-10-27T15:48:09.789851Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/16264b2c-2659-497a-a23f-e80943d46111/arrive` → **200**

```json
{
  "command_id": "1e0c27ce-e078-4ac9-83d3-98827fdfe7b2",
  "expected_version": 0
}
```

```json
{
  "id": "16264b2c-2659-497a-a23f-e80943d46111",
  "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
  "assignment_id": "e9ac438e-ad3a-4cb8-aae3-d0460abdad15",
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
  "arrived_at": "2026-10-27T15:48:09.82021Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/16264b2c-2659-497a-a23f-e80943d46111/start` → **200**

```json
{
  "command_id": "4c0e0427-68bf-4868-9e14-43c6988d00df",
  "expected_version": 1
}
```

```json
{
  "id": "16264b2c-2659-497a-a23f-e80943d46111",
  "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
  "assignment_id": "e9ac438e-ad3a-4cb8-aae3-d0460abdad15",
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
  "arrived_at": "2026-10-27T15:48:09.82021Z",
  "started_at": "2026-10-27T15:48:09.853581Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:09Z",
    "sequence": 1793116089874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:09.88942Z",
  "last_location_at": "2026-10-27T15:48:09.88942Z",
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
  "device_ref": "sandbox-30034"
}
```

```json
{
  "challenge_id": "4bb45d5d-5f5b-44e9-8ec9-07c211df8109",
  "expires_at": "2026-10-27T15:53:09.909857474Z",
  "resend_available_at": "2026-10-27T15:48:10.909857474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "153688",
  "sent_at": "2026-10-27T15:48:09.911419523Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bb45d5d-5f5b-44e9-8ec9-07c211df8109",
  "code": "153688",
  "device_ref": "sandbox-30034"
}
```

```json
{
  "session_id": "0a2137b7-028d-4b77-a123-107c0e682353",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk4OSwiaWF0IjoxNzkzMTE2MDg5LCJqdGkiOiI5ZjhjMGM0ZS0xM2Q2LTQ5MzItOTFmYS05ZjMwMWI4NGJhYTciLCJzaWQiOiIwYTIxMzdiNy0wMjhkLTRiNzctYTEyMy0xMDdjMGU2ODIzNTMifQ.cwR3cig_wB1HjRfpxT1NyO5vvCcooaNh-gqFFhRjMAo",
  "access_expires_at": "2026-10-27T16:03:09.955598703Z",
  "refresh_token": "qL8isAp8kryMBgLNW1XyZ0uOKcPX0cfrZmJBk7lg5fE",
  "refresh_expires_at": "2026-11-26T15:48:09.955232252Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7fcca6a8-921c-4e32-9437-fc0a0ce291c4",
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
  "last_heartbeat_at": "2026-10-27T15:47:52.41887Z",
  "last_location_at": "2026-10-27T15:47:52.41887Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7fcca6a8-921c-4e32-9437-fc0a0ce291c4/handover` → **200**

```json
{
  "command_id": "9ba2ef73-01bb-4926-84f7-cbf22e4198d2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7fcca6a8-921c-4e32-9437-fc0a0ce291c4",
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
  "last_heartbeat_at": "2026-10-27T15:47:52.41887Z",
  "last_location_at": "2026-10-27T15:47:52.41887Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7fcca6a8-921c-4e32-9437-fc0a0ce291c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:10Z",
    "sequence": 1793116090264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7fcca6a8-921c-4e32-9437-fc0a0ce291c4",
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
  "last_heartbeat_at": "2026-10-27T15:48:10.041895Z",
  "last_location_at": "2026-10-27T15:48:10.041895Z",
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
  "session_id": "575aed08-4f0e-48ad-be07-dcc5a75efaa9",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTAsImlhdCI6MTc5MzExNjA5MCwianRpIjoiOTA3ZjhkOTktYTU0Yi00MmQ5LWE0Y2UtZjEwMGJiYTczODVlIiwic2lkIjoiNTc1YWVkMDgtNGYwZS00OGFkLWJlMDctZGNjNWE3NWVmYWE5In0.7rTaSvOubnGeeQcA-oWAWCtGsJ3F50FzbrtFMG_WbnU",
  "access_expires_at": "2026-10-27T16:03:10.269992698Z",
  "refresh_token": "EyK7MT1qC5nuc3yAFEvYpF0YKOD3wkCwvtVYk3MbAHY",
  "refresh_expires_at": "2026-10-28T03:48:10.26963511Z",
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
  "session_id": "a797b36f-291e-4a76-865b-3e925a425391",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTAsImlhdCI6MTc5MzExNjA5MCwianRpIjoiZmMzNzA3NDYtNDA5Ny00YTMzLWIwNTAtNzJiOGI0Nzg4ODNlIiwic2lkIjoiYTc5N2IzNmYtMjkxZS00YTc2LTg2NWItM2U5MjVhNDI1MzkxIn0._mdMasm37jdN1VSK0SGwdVVk9Y3gshlgyB9tIZ6CzS8",
  "access_expires_at": "2026-10-27T16:03:10.497034667Z",
  "refresh_token": "lvKhmT5VLiF-PqO__OOcdZoLqbVPvl3vfM3twn0hhDw",
  "refresh_expires_at": "2026-10-28T03:48:10.496582631Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/78dfdb50-e150-40b3-a4ba-f7ab475b6ae2` → **200**

```json
{
  "id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "cd02e152-39f4-4f57-b2da-26288abbde6a",
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
    "id": "e9ac438e-ad3a-4cb8-aae3-d0460abdad15",
    "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "16264b2c-2659-497a-a23f-e80943d46111",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T15:48:09.689939Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/78dfdb50-e150-40b3-a4ba-f7ab475b6ae2/interrupt` → **200**

```json
{
  "command_id": "8f822b0c-85ae-410d-b654-80fae98832a4",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "cd02e152-39f4-4f57-b2da-26288abbde6a",
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
      "id": "e9ac438e-ad3a-4cb8-aae3-d0460abdad15",
      "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "16264b2c-2659-497a-a23f-e80943d46111",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T15:48:09.689939Z",
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
    "id": "7ec289d0-43c9-4b5c-b918-e268e3970802",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "cd02e152-39f4-4f57-b2da-26288abbde6a",
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
    "id": "2f502c56-e6d8-4f4b-9acf-18ee635798c1",
    "order_id": "7ec289d0-43c9-4b5c-b918-e268e3970802",
    "expires_at": "2026-10-27T15:48:25.567765Z",
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

`POST /api/driver/v1/offers/2f502c56-e6d8-4f4b-9acf-18ee635798c1/accept` → **200**

```json
{
  "command_id": "d00457ca-d913-4f95-9c02-a0edf271571e"
}
```

```json
{
  "id": "fe5da9dc-54a4-4ef7-82cc-ee5a4de5e5c1",
  "order_id": "7ec289d0-43c9-4b5c-b918-e268e3970802",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b1870ba2-7f21-4fcb-98c4-263a7626a61c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b1870ba2-7f21-4fcb-98c4-263a7626a61c",
  "order_id": "7ec289d0-43c9-4b5c-b918-e268e3970802",
  "assignment_id": "fe5da9dc-54a4-4ef7-82cc-ee5a4de5e5c1",
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
  "discount_minor": 0
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7fcca6a8-921c-4e32-9437-fc0a0ce291c4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T15:48:10.041895Z",
  "last_location_at": "2026-10-27T15:48:10.041895Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/7fcca6a8-921c-4e32-9437-fc0a0ce291c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:10Z",
    "sequence": 1793116090672
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7fcca6a8-921c-4e32-9437-fc0a0ce291c4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T15:48:10.687295Z",
  "last_location_at": "2026-10-27T15:48:10.687295Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b1870ba2-7f21-4fcb-98c4-263a7626a61c/arrive` → **200**

```json
{
  "command_id": "fdb60658-2d49-4274-9b66-f7c0eefcec5a",
  "expected_version": 0
}
```

```json
{
  "id": "b1870ba2-7f21-4fcb-98c4-263a7626a61c",
  "order_id": "7ec289d0-43c9-4b5c-b918-e268e3970802",
  "assignment_id": "fe5da9dc-54a4-4ef7-82cc-ee5a4de5e5c1",
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
  "arrived_at": "2026-10-27T15:48:10.715086Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/b1870ba2-7f21-4fcb-98c4-263a7626a61c/start` → **200**

```json
{
  "command_id": "8f6a8ae2-dc16-435a-836f-37273054f06a",
  "expected_version": 1
}
```

```json
{
  "id": "b1870ba2-7f21-4fcb-98c4-263a7626a61c",
  "order_id": "7ec289d0-43c9-4b5c-b918-e268e3970802",
  "assignment_id": "fe5da9dc-54a4-4ef7-82cc-ee5a4de5e5c1",
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
  "arrived_at": "2026-10-27T15:48:10.715086Z",
  "started_at": "2026-10-27T15:48:10.747254Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/b1870ba2-7f21-4fcb-98c4-263a7626a61c/complete` → **200**

```json
{
  "command_id": "79cb0a61-322f-4195-881f-efd64f317b1e",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:48:10Z"
}
```

```json
{
  "id": "b1870ba2-7f21-4fcb-98c4-263a7626a61c",
  "order_id": "7ec289d0-43c9-4b5c-b918-e268e3970802",
  "assignment_id": "fe5da9dc-54a4-4ef7-82cc-ee5a4de5e5c1",
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
  "arrived_at": "2026-10-27T15:48:10.715086Z",
  "started_at": "2026-10-27T15:48:10.747254Z",
  "completed_at": "2026-10-27T15:48:10.783424Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "7ec289d0-43c9-4b5c-b918-e268e3970802",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:48:10.561499Z",
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
    "id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:48:09.689939Z",
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

`GET /api/operator/v1/orders/78dfdb50-e150-40b3-a4ba-f7ab475b6ae2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:48:09.690456Z",
      "actor": {
        "type": "CLIENT",
        "id": "cd02e152-39f4-4f57-b2da-26288abbde6a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
        "quote_id": "8f42cb9c-7434-4c29-8988-31f9b2b9059e",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:48:09.691716Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
        "attempt_id": "140ca9e0-266d-41e9-a28f-a4fac48fe03e",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:48:09.69567Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cef80f05-a74a-40e0-8a64-6f0210664a0a",
        "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:48:09.741152Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cef80f05-a74a-40e0-8a64-6f0210664a0a",
        "order_id": "78dfdb50-e150-40b3-a4ba-f7ab475b6ae2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e9ac438e-ad3a-4cb8-aae3-d0460abdad15"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 78dfdb50-e150-40b3-a4ba-f7ab475b6ae2, follow-up 7ec289d0-43c9-4b5c-b918-e268e3970802.

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
  "session_id": "5ec26418-deab-417d-a751-92bbc7bc228b",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTQsImlhdCI6MTc5MzExNjA5NCwianRpIjoiZjEzMDJkNWQtMDU1Mi00YTQwLTk3MDctODNkYzNiZDAyY2NiIiwic2lkIjoiNWVjMjY0MTgtZGVhYi00MTdkLWE3NTEtOTJiYmM3YmMyMjhiIn0.C-qJqErDdoW698PgS39QPbSHBz62SNDUcjuqlp8JDLA",
  "access_expires_at": "2026-10-27T16:03:14.100347444Z",
  "refresh_token": "u2QbdFdjc0SK6fni6vZk29b_ULYLWae7lYqAZeAPw7c",
  "refresh_expires_at": "2026-10-28T03:48:14.099865258Z",
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
  "session_id": "8eb830a2-2ff8-41d2-9f0f-ea647479f9ac",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTQsImlhdCI6MTc5MzExNjA5NCwianRpIjoiZWRlYTdmODEtZTYwZC00MDAyLWEwNWMtMzlhOWZjMmU5NjU1Iiwic2lkIjoiOGViODMwYTItMmZmOC00MWQyLTlmMGYtZWE2NDc0NzlmOWFjIn0.R-8j1_9F5kdZRjlNxMYw5PkKPOxRGYZ_ornCQcPU8Ik",
  "access_expires_at": "2026-10-27T16:03:14.327798576Z",
  "refresh_token": "EaI9VSVVlE7oaf04ZHRuqYt90yl4Lu1c6-j_lgXFBuM",
  "refresh_expires_at": "2026-10-28T03:48:14.327470683Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1974"
}
```

```json
{
  "challenge_id": "5ae3ca5d-f62f-4b9c-9434-fe91a91a1621",
  "expires_at": "2026-10-27T15:53:14.349032285Z",
  "resend_available_at": "2026-10-27T15:48:15.349032285Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "435958",
  "sent_at": "2026-10-27T15:48:14.350814985Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ae3ca5d-f62f-4b9c-9434-fe91a91a1621",
  "code": "435958",
  "device_ref": "sandbox-1974"
}
```

```json
{
  "session_id": "ce0a9575-1f3f-44c8-ad53-358e668014dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk5NCwiaWF0IjoxNzkzMTE2MDk0LCJqdGkiOiJjNDFmNTAyMC1hNTAzLTQ4NGUtODViYi1hZDYxMTI4M2U1YmIiLCJzaWQiOiJjZTBhOTU3NS0xZjNmLTQ0YzgtYWQ1My0zNThlNjY4MDE0ZGQifQ.lqn4_0ZZ3fTgVJfwCaImQ5VgxGDaR548lrtgSXmfReM",
  "access_expires_at": "2026-10-27T16:03:14.395600882Z",
  "refresh_token": "Uxa6mRkfgRNw0RSsNcy_zthMAfafyxCrsVqVZwAm1M0",
  "refresh_expires_at": "2026-11-26T15:48:14.395224206Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:09.88942Z",
  "last_location_at": "2026-10-27T15:48:09.88942Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/handover` → **200**

```json
{
  "command_id": "909e2893-dfee-4785-9f79-8054ad04a720",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:09.88942Z",
  "last_location_at": "2026-10-27T15:48:09.88942Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:14Z",
    "sequence": 1793116094464
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:14.479323Z",
  "last_location_at": "2026-10-27T15:48:14.479323Z",
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
  "command_id": "f5e6ce66-2dee-4578-9dfa-57fae8139850",
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
  "effective_at": "2026-10-27T15:48:14.539255Z",
  "changed_by": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T15:48:14.569101919Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7f9a8e23-bf0e-4298-9940-d6e2636d04b9",
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
  "id": "ac28d5ab-d4ee-4956-b4e1-b4a668fbf516",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:53:14.604105Z",
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
  "command_id": "016a5207-925d-49c4-a671-7b32e198468f",
  "quote_id": "ac28d5ab-d4ee-4956-b4e1-b4a668fbf516",
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
    "phone": "+3806711115716"
  }
}
```

```json
{
  "id": "bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf",
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
  "created_at": "2026-10-27T15:48:14.64271Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115716"
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
    "id": "be2b325a-4c48-4ba7-83f8-1b2de729d308",
    "order_id": "bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf",
    "expires_at": "2026-10-27T15:48:29.645904Z",
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

`POST /api/driver/v1/offers/be2b325a-4c48-4ba7-83f8-1b2de729d308/accept` → **200**

```json
{
  "command_id": "cd9e2a59-d657-4484-a1c2-47df76d62172"
}
```

```json
{
  "id": "f6278cb5-caa4-47f9-b46d-10d3b95d9778",
  "order_id": "bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7050d957-a16d-46fd-9c66-e4bde83d41ba",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7050d957-a16d-46fd-9c66-e4bde83d41ba",
  "order_id": "bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf",
  "assignment_id": "f6278cb5-caa4-47f9-b46d-10d3b95d9778",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:14Z",
    "sequence": 1793116094726
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:14.740761Z",
  "last_location_at": "2026-10-27T15:48:14.740761Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7050d957-a16d-46fd-9c66-e4bde83d41ba/arrive` → **200**

```json
{
  "command_id": "f82d8cd6-0132-49ee-bf59-f034b81934c0",
  "expected_version": 0
}
```

```json
{
  "id": "7050d957-a16d-46fd-9c66-e4bde83d41ba",
  "order_id": "bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf",
  "assignment_id": "f6278cb5-caa4-47f9-b46d-10d3b95d9778",
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
  "arrived_at": "2026-10-27T15:48:14.769978Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7050d957-a16d-46fd-9c66-e4bde83d41ba/start` → **200**

```json
{
  "command_id": "cdad02eb-9972-4c52-8ee2-4edbc2b05f3f",
  "expected_version": 1
}
```

```json
{
  "id": "7050d957-a16d-46fd-9c66-e4bde83d41ba",
  "order_id": "bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf",
  "assignment_id": "f6278cb5-caa4-47f9-b46d-10d3b95d9778",
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
  "arrived_at": "2026-10-27T15:48:14.769978Z",
  "started_at": "2026-10-27T15:48:14.805604Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7050d957-a16d-46fd-9c66-e4bde83d41ba/complete` → **200**

```json
{
  "command_id": "39bf5d7f-8439-4aa0-abdb-3f38220c2576",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:48:14Z",
  "cash_received": true
}
```

```json
{
  "id": "7050d957-a16d-46fd-9c66-e4bde83d41ba",
  "order_id": "bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf",
  "assignment_id": "f6278cb5-caa4-47f9-b46d-10d3b95d9778",
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
  "arrived_at": "2026-10-27T15:48:14.769978Z",
  "started_at": "2026-10-27T15:48:14.805604Z",
  "completed_at": "2026-10-27T15:48:14.838049Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3c04de17-d6d2-42db-a6e6-c2ef7b629108",
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
  "id": "dd42ddc5-1282-49e7-9d7e-7145fb238735",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:53:14.872005Z",
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
  "command_id": "2619aebf-eb0f-4c85-98c3-0675915ed407",
  "quote_id": "dd42ddc5-1282-49e7-9d7e-7145fb238735",
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
    "phone": "+3806711117775"
  }
}
```

```json
{
  "id": "ca64ceb9-705f-48e0-9e68-7efb5718e393",
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
  "created_at": "2026-10-27T15:48:14.902097Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117775"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ca64ceb9-705f-48e0-9e68-7efb5718e393` → **200**

```json
{
  "id": "ca64ceb9-705f-48e0-9e68-7efb5718e393",
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
  "created_at": "2026-10-27T15:48:14.902097Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117775"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ca64ceb9-705f-48e0-9e68-7efb5718e393/cancel` → **200**

```json
{
  "command_id": "1977491f-eeed-4516-8572-b925a42676d0",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ca64ceb9-705f-48e0-9e68-7efb5718e393",
  "short_number": 9,
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
  "created_at": "2026-10-27T15:48:14.902097Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117775"
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
  "staff_id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T15:48:14.841963Z",
  "last_entries": [
    {
      "order_id": "ca64ceb9-705f-48e0-9e68-7efb5718e393",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T15:48:14.965634Z"
    },
    {
      "order_id": "bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T15:48:14.841963Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1d937f70-6eb0-4bee-a9ff-1247e135c959",
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
  "last_heartbeat_at": "2026-10-27T15:48:14.740761Z",
  "last_location_at": "2026-10-27T15:48:14.740761Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d937f70-6eb0-4bee-a9ff-1247e135c959/close` → **200**

```json
{
  "command_id": "b8c1d250-f9d7-404f-8fcf-509913d24e63",
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

Done: operator bonus for fulfilled bb61d89e-ab43-4a32-8fa7-f292bd9b8cdf and operator-fault cancellation ca64ceb9-705f-48e0-9e68-7efb5718e393.

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
  "session_id": "6b1911ab-9ccb-4fba-a916-aa372e70a2c5",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTcsImlhdCI6MTc5MzExNjA5NywianRpIjoiYTY2NDcyMDEtYTVhZC00MTQ5LWEyMDYtNGE5ZGIwNTFjZjgyIiwic2lkIjoiNmIxOTExYWItOWNjYi00ZmJhLWE5MTYtYWEzNzJlNzBhMmM1In0.qRrHXNnmW092OMOL3F7dW8py9txSZNkF1-J-0yIDDxk",
  "access_expires_at": "2026-10-27T16:03:17.404111136Z",
  "refresh_token": "tv7OCXwBNIIhAgzsg51s_dZC1CP5-qi8Mk9SQbhIHeA",
  "refresh_expires_at": "2026-10-28T03:48:17.403795942Z",
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
  "command_id": "a6d7505f-26b7-42e7-8931-3937c5dd15e5",
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
  "changed_by": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T15:48:17.463269533Z"
}
```

## The rider books the airport for 2026-10-27T18:48:17Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600355191",
  "device_ref": "sandbox-3302"
}
```

```json
{
  "challenge_id": "38eb6e78-5cd9-4e8a-89dd-5995f477f578",
  "expires_at": "2026-10-27T15:53:17.489667842Z",
  "resend_available_at": "2026-10-27T15:48:18.489667842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600355191` → **200**

```json
{
  "phone": "+48600355191",
  "audience": "CLIENT",
  "code": "211896",
  "sent_at": "2026-10-27T15:48:17.491686085Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38eb6e78-5cd9-4e8a-89dd-5995f477f578",
  "code": "211896",
  "device_ref": "sandbox-3302"
}
```

```json
{
  "session_id": "fe4ebbaf-4d8f-4aa7-8b10-738af592cf35",
  "subject": {
    "type": "CLIENT",
    "id": "1285e7a1-a9ec-4046-bb02-8dfd0aa46afd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjg1ZTdhMS1hOWVjLTQwNDYtYmIwMi04ZGZkMGFhNDZhZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTk3LCJpYXQiOjE3OTMxMTYwOTcsImp0aSI6IjAyMDJjZDZhLWM2NWYtNDI1NS1hYzZjLWZmZWM2OTFjMWQ1MiIsInNpZCI6ImZlNGViYmFmLTRkOGYtNGFhNy04YjEwLTczOGFmNTkyY2YzNSJ9.68BRksMGpb7cN3lvrM_M5pLeKG1OfILkg2bpfdYetGM",
  "access_expires_at": "2026-10-27T16:03:17.535791648Z",
  "refresh_token": "4y_M6n4tSTztkcvGSGdVPAddVILPWIfW-tRyd3v5rCM",
  "refresh_expires_at": "2026-11-26T15:48:17.535482423Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5f06eb41-bfdf-41a4-b656-5da65093f54e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T18:48:17Z"
}
```

```json
{
  "id": "090eee90-8597-424b-8683-70e584901593",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T15:53:17.563621Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T18:48:17Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4950a0b3-3e25-487d-be5a-b8c24da42cfc",
  "quote_id": "090eee90-8597-424b-8683-70e584901593",
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
  "pickup_at": "2026-10-27T18:48:17Z"
}
```

```json
{
  "id": "431d47a8-3f57-41f8-bf44-63246fea30b2",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1285e7a1-a9ec-4046-bb02-8dfd0aa46afd",
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
  "created_at": "2026-10-27T15:48:17.596102Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T18:48:17Z",
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
  "device_ref": "sandbox-6060"
}
```

```json
{
  "challenge_id": "6cd50b6b-5ef3-41f1-9698-8edb09970391",
  "expires_at": "2026-10-27T15:53:17.622434326Z",
  "resend_available_at": "2026-10-27T15:48:18.622434326Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "595792",
  "sent_at": "2026-10-27T15:48:17.623905838Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cd50b6b-5ef3-41f1-9698-8edb09970391",
  "code": "595792",
  "device_ref": "sandbox-6060"
}
```

```json
{
  "session_id": "3f313cf7-1da9-4d86-a238-fe1e459408e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk5NywiaWF0IjoxNzkzMTE2MDk3LCJqdGkiOiIxM2NhY2Q3NS1hZWQxLTQzMmMtYTQ3My1jNGI3YjVmMjA1Y2YiLCJzaWQiOiIzZjMxM2NmNy0xZGE5LTRkODYtYTIzOC1mZTFlNDU5NDA4ZTUifQ.jJ55An7qZ4eTlqdFmVpYOsZGUgtJ5GErSW1HLF_xeI8",
  "access_expires_at": "2026-10-27T16:03:17.669317144Z",
  "refresh_token": "WpNcFmJE_6FhLmFhVHZ1LzwgJTx6HMYyqtA3jFe3HG0",
  "refresh_expires_at": "2026-11-26T15:48:17.668959136Z",
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
  "command_id": "bb8b6e34-ef92-4299-b037-905d1534d8b3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:17Z",
    "sequence": 1793116097709
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e0efa057-6a0c-4c62-bcac-259d75daac8c",
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
  "last_heartbeat_at": "2026-10-27T15:48:17.723464Z",
  "last_location_at": "2026-10-27T15:48:17.723464Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "431d47a8-3f57-41f8-bf44-63246fea30b2",
      "short_number": 10,
      "pickup_at": "2026-10-27T18:48:17Z",
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

`POST /api/driver/v1/preorders/431d47a8-3f57-41f8-bf44-63246fea30b2/reserve` → **200**

```json
{
  "command_id": "e087e413-9cb4-40dc-a812-74c05f55dea4"
}
```

```json
{
  "id": "c184caf4-c102-40c6-a823-e5632901cdaa",
  "state": "RESERVED",
  "order": {
    "order_id": "431d47a8-3f57-41f8-bf44-63246fea30b2",
    "short_number": 10,
    "pickup_at": "2026-10-27T18:48:17Z",
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
  "reserved_at": "2026-10-27T15:48:17.776153Z",
  "confirm_from": "2026-10-27T18:18:17Z",
  "confirm_until": "2026-10-27T18:28:17Z",
  "drop_until": "2026-10-27T17:48:17Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c184caf4-c102-40c6-a823-e5632901cdaa",
      "state": "RESERVED",
      "order": {
        "order_id": "431d47a8-3f57-41f8-bf44-63246fea30b2",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:48:17Z",
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
      "reserved_at": "2026-10-27T15:48:17.776153Z",
      "confirm_from": "2026-10-27T18:18:17Z",
      "confirm_until": "2026-10-27T18:28:17Z",
      "drop_until": "2026-10-27T17:48:17Z"
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
      "id": "c184caf4-c102-40c6-a823-e5632901cdaa",
      "state": "RESERVED",
      "order": {
        "order_id": "431d47a8-3f57-41f8-bf44-63246fea30b2",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:48:17Z",
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
      "reserved_at": "2026-10-27T15:48:17.776153Z",
      "confirm_from": "2026-10-27T18:18:17Z",
      "confirm_until": "2026-10-27T18:28:17Z",
      "drop_until": "2026-10-27T17:48:17Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c184caf4-c102-40c6-a823-e5632901cdaa/confirm` → **409**

```json
{
  "command_id": "9f84de1f-df16-4d9e-a65f-ee58ad128af1"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c184caf4-c102-40c6-a823-e5632901cdaa/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2c6f57b5-6aad-4016-9efc-b3e4ceebfa01"
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
  "session_id": "4ea96dcf-cd98-4c13-9b9a-ec4b012cfc00",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTgsImlhdCI6MTc5MzExNjA5OCwianRpIjoiMDgwNzdlMzQtN2U1Ni00ZTM3LWE5ZGItZDAzNjI5MTU1YjZmIiwic2lkIjoiNGVhOTZkY2YtY2Q5OC00YzEzLTliOWEtZWM0YjAxMmNmYzAwIn0.NtW8BR3YlUWTK5Kj6NFGid2BNLkrLYIS80pqNQ3xFs0",
  "access_expires_at": "2026-10-27T16:03:18.077584427Z",
  "refresh_token": "W1oTEWQ7m0_-RD9e5F-0vEeeY85VFyM2nX0sY-z66PI",
  "refresh_expires_at": "2026-10-28T03:48:18.077251477Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/431d47a8-3f57-41f8-bf44-63246fea30b2` → **200**

```json
{
  "id": "431d47a8-3f57-41f8-bf44-63246fea30b2",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1285e7a1-a9ec-4046-bb02-8dfd0aa46afd",
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
  "created_at": "2026-10-27T15:48:17.596102Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T18:48:17Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c184caf4-c102-40c6-a823-e5632901cdaa",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T15:48:17.776153Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/431d47a8-3f57-41f8-bf44-63246fea30b2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T15:48:17.597219Z",
      "actor": {
        "type": "CLIENT",
        "id": "1285e7a1-a9ec-4046-bb02-8dfd0aa46afd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "431d47a8-3f57-41f8-bf44-63246fea30b2",
        "preorder": true,
        "quote_id": "090eee90-8597-424b-8683-70e584901593",
        "pickup_at": "2026-10-27T18:48:17Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T15:48:17.776973Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "431d47a8-3f57-41f8-bf44-63246fea30b2",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c184caf4-c102-40c6-a823-e5632901cdaa"
      }
    }
  ]
}
```

Done: pre-order 431d47a8-3f57-41f8-bf44-63246fea30b2, reservation c184caf4-c102-40c6-a823-e5632901cdaa.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14999"
}
```

```json
{
  "challenge_id": "9bf5c453-ec25-426b-8b8c-a5e5085b5468",
  "expires_at": "2026-10-27T15:53:18.15520477Z",
  "resend_available_at": "2026-10-27T15:48:19.15520477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "035193",
  "sent_at": "2026-10-27T15:48:18.156913345Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9bf5c453-ec25-426b-8b8c-a5e5085b5468",
  "code": "035193",
  "device_ref": "sandbox-14999"
}
```

```json
{
  "session_id": "3591df00-01d8-4c0a-a22e-dce65295777f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk5OCwiaWF0IjoxNzkzMTE2MDk4LCJqdGkiOiIxMTRmOGYzYy03NTU3LTRmZGItYTAzZC1iNzQ5NzY2YmIyODEiLCJzaWQiOiIzNTkxZGYwMC0wMWQ4LTRjMGEtYTIyZS1kY2U2NTI5NTc3N2YifQ.RK6kZdLgzDFifDjU_YQsJHs6Wxn668R2XWM1IqvuEZM",
  "access_expires_at": "2026-10-27T16:03:18.205345508Z",
  "refresh_token": "lJWxjrat0jLCVBc1l5CxgzsRNORj61TqCxRJkmkExD0",
  "refresh_expires_at": "2026-11-26T15:48:18.204972918Z",
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
  "command_id": "8fd2ba9f-5cee-4d40-8298-31d73ee5462f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:18Z",
    "sequence": 1793116098248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17372664-3014-4bc9-8e24-5ff07ab2f8c5",
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
  "last_heartbeat_at": "2026-10-27T15:48:18.262748Z",
  "last_location_at": "2026-10-27T15:48:18.262748Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673643756",
  "device_ref": "sandbox-8608"
}
```

```json
{
  "challenge_id": "e1deb9b9-797d-4546-8ca9-317847a8791a",
  "expires_at": "2026-10-27T15:53:18.28636517Z",
  "resend_available_at": "2026-10-27T15:48:19.28636517Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673643756` → **200**

```json
{
  "phone": "+380673643756",
  "audience": "CLIENT",
  "code": "712174",
  "sent_at": "2026-10-27T15:48:18.287980575Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1deb9b9-797d-4546-8ca9-317847a8791a",
  "code": "712174",
  "device_ref": "sandbox-8608"
}
```

```json
{
  "session_id": "7eb17c7d-bef6-4715-8361-fb344130d2cf",
  "subject": {
    "type": "CLIENT",
    "id": "5babb176-d64c-416c-95a2-f34a4ecaba17"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmFiYjE3Ni1kNjRjLTQxNmMtOTVhMi1mMzRhNGVjYWJhMTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTk4LCJpYXQiOjE3OTMxMTYwOTgsImp0aSI6Ijk4NzU5ZWJlLWM4YTktNDQyOC1hNDJkLTI4OGY4NDIzOWNkMiIsInNpZCI6IjdlYjE3YzdkLWJlZjYtNDcxNS04MzYxLWZiMzQ0MTMwZDJjZiJ9.0sGgjhL0ag4o_b7151HaysghBKXT52fFy3qaIq1Y4IA",
  "access_expires_at": "2026-10-27T16:03:18.334730069Z",
  "refresh_token": "fw7QdsRfh8agkQq3aEjmb7yRtK6DWoftLQRRgDtr6Qg",
  "refresh_expires_at": "2026-11-26T15:48:18.334355506Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a56defd-daba-4c98-b3dc-fc44a59d135b",
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
  "id": "9d4f33f6-7917-4926-a54d-a9d7f4407fdc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:53:18.365483Z",
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
  "command_id": "f03fa25a-80a6-4024-a80b-2de8045e74f1",
  "quote_id": "9d4f33f6-7917-4926-a54d-a9d7f4407fdc",
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
  "id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5babb176-d64c-416c-95a2-f34a4ecaba17",
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
  "created_at": "2026-10-27T15:48:18.394035Z",
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
    "id": "cddd43f4-32c2-46e5-8b85-71db27c12590",
    "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
    "expires_at": "2026-10-27T15:48:33.396384Z",
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

`POST /api/driver/v1/offers/cddd43f4-32c2-46e5-8b85-71db27c12590/accept` → **200**

```json
{
  "command_id": "e0d5eef0-ae04-4ace-b078-89e9a439df8f"
}
```

```json
{
  "id": "ab8ae459-e92f-479f-b9f9-59a6fb183a7d",
  "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c08c8349-4bdc-4303-90be-959e685bfc98",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c08c8349-4bdc-4303-90be-959e685bfc98",
  "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "assignment_id": "ab8ae459-e92f-479f-b9f9-59a6fb183a7d",
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

`POST /api/driver/v1/work-sessions/17372664-3014-4bc9-8e24-5ff07ab2f8c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:18Z",
    "sequence": 1793116098484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17372664-3014-4bc9-8e24-5ff07ab2f8c5",
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
  "last_heartbeat_at": "2026-10-27T15:48:18.499902Z",
  "last_location_at": "2026-10-27T15:48:18.499902Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c08c8349-4bdc-4303-90be-959e685bfc98",
  "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "assignment_id": "ab8ae459-e92f-479f-b9f9-59a6fb183a7d",
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

`POST /api/driver/v1/trips/c08c8349-4bdc-4303-90be-959e685bfc98/arrive` → **200**

```json
{
  "command_id": "b9364c81-10b2-4a30-a004-ddbf1a3d793c",
  "expected_version": 0
}
```

```json
{
  "id": "c08c8349-4bdc-4303-90be-959e685bfc98",
  "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "assignment_id": "ab8ae459-e92f-479f-b9f9-59a6fb183a7d",
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
  "arrived_at": "2026-10-27T15:48:18.543261Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/c08c8349-4bdc-4303-90be-959e685bfc98/start` → **200**

```json
{
  "command_id": "48905c5e-e4f7-416d-8741-b168ed351deb",
  "expected_version": 1
}
```

```json
{
  "id": "c08c8349-4bdc-4303-90be-959e685bfc98",
  "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "assignment_id": "ab8ae459-e92f-479f-b9f9-59a6fb183a7d",
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
  "arrived_at": "2026-10-27T15:48:18.543261Z",
  "started_at": "2026-10-27T15:48:18.573469Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/17372664-3014-4bc9-8e24-5ff07ab2f8c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:18Z",
    "sequence": 1793116098594
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17372664-3014-4bc9-8e24-5ff07ab2f8c5",
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
  "last_heartbeat_at": "2026-10-27T15:48:18.610432Z",
  "last_location_at": "2026-10-27T15:48:18.610432Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/c08c8349-4bdc-4303-90be-959e685bfc98/complete` → **200**

```json
{
  "command_id": "ad1bbf3a-b644-4aa9-a35c-2b0969828697",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:48:18Z",
  "cash_received": true
}
```

```json
{
  "id": "c08c8349-4bdc-4303-90be-959e685bfc98",
  "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "assignment_id": "ab8ae459-e92f-479f-b9f9-59a6fb183a7d",
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
  "arrived_at": "2026-10-27T15:48:18.543261Z",
  "started_at": "2026-10-27T15:48:18.573469Z",
  "completed_at": "2026-10-27T15:48:18.63878Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/175d2ef0-e978-47ba-a8c4-ab8587be3678/rating` → **200**

```json
{
  "command_id": "c74aa2fe-7174-44ba-98d8-c6f85c8e82af",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "score": 5,
  "created_at": "2026-10-27T15:48:18.682570996Z"
}
```

`POST /api/driver/v1/orders/175d2ef0-e978-47ba-a8c4-ab8587be3678/rating` → **200**

```json
{
  "command_id": "c7f74d15-f314-40ba-87d0-7c5f67f603bd",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
  "score": 4,
  "created_at": "2026-10-27T15:48:18.713308417Z"
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
  "session_id": "e870f03d-8782-4303-b067-678526ba736d",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTgsImlhdCI6MTc5MzExNjA5OCwianRpIjoiYTk1ZTg2NTgtNWU2Ni00NTY0LWI0ODAtMTdlNmZjZDM1ZWRjIiwic2lkIjoiZTg3MGYwM2QtODc4Mi00MzAzLWIwNjctNjc4NTI2YmE3MzZkIn0.cvbnKf9TvotqeVNcjmppUQBkOJrow2OUcUC610Sqths",
  "access_expires_at": "2026-10-27T16:03:18.974469137Z",
  "refresh_token": "zXD1Qy8VqCBa3yllywEoeXTiX8XMZ2HGmMtTJAnGMWc",
  "refresh_expires_at": "2026-10-28T03:48:18.974015916Z",
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
  "session_id": "63b77cb0-4687-4955-94a8-a340b098f7a2",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTksImlhdCI6MTc5MzExNjA5OSwianRpIjoiZjQyMWI5YWEtOGEyZS00NWRhLThlODgtZDA2ZDc2YmEyMGIxIiwic2lkIjoiNjNiNzdjYjAtNDY4Ny00OTU1LTk0YTgtYTM0MGIwOThmN2EyIn0.bfbFrbU5tsiCUNbzzUlbfvxSUXj2B9oVE3Ie1wgkCTU",
  "access_expires_at": "2026-10-27T16:03:19.202350919Z",
  "refresh_token": "x0nUSQasxUvBACL7_Do5pJaYoWaIhFswts3yI1DSToE",
  "refresh_expires_at": "2026-10-28T03:48:19.20192804Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/175d2ef0-e978-47ba-a8c4-ab8587be3678/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
      "author_type": "RIDER",
      "author_id": "5babb176-d64c-416c-95a2-f34a4ecaba17",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T15:48:18.682571Z"
    },
    {
      "order_id": "175d2ef0-e978-47ba-a8c4-ab8587be3678",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "5babb176-d64c-416c-95a2-f34a4ecaba17",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T15:48:18.713308Z"
    }
  ]
}
```

Done: ratings for order 175d2ef0-e978-47ba-a8c4-ab8587be3678.

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
  "session_id": "7b56a7b2-6772-4cd8-a2cf-f93391be420b",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY5OTksImlhdCI6MTc5MzExNjA5OSwianRpIjoiNGY0ODQzNmEtNGVlMi00Njc5LTg4YTktZGEyODUyZjFlMGM5Iiwic2lkIjoiN2I1NmE3YjItNjc3Mi00Y2Q4LWEyY2YtZjkzMzkxYmU0MjBiIn0.33Uzt6f4xlFM4O10McMUT2Bu0FCiKyF8mNRaB8zgteI",
  "access_expires_at": "2026-10-27T16:03:19.473321862Z",
  "refresh_token": "yG4VGBiKEJO6b2fZjBvRquL0wF-G1siGUKSVZgTGz0c",
  "refresh_expires_at": "2026-10-28T03:48:19.472959614Z",
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
  "command_id": "d00e47f6-124f-40c2-8bab-593732269533",
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
  "changed_by": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:48:19.531463Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "d00e47f6-124f-40c2-8bab-593732269533",
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
  "changed_by": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:48:19.531463Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48459628436",
  "device_ref": "sandbox-22922"
}
```

```json
{
  "challenge_id": "ad1b1c1d-ca27-4e51-8177-849f854f0b12",
  "expires_at": "2026-10-27T15:53:19.60081777Z",
  "resend_available_at": "2026-10-27T15:48:20.60081777Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48459628436` → **200**

```json
{
  "phone": "+48459628436",
  "audience": "CLIENT",
  "code": "001794",
  "sent_at": "2026-10-27T15:48:19.602705117Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad1b1c1d-ca27-4e51-8177-849f854f0b12",
  "code": "001794",
  "device_ref": "sandbox-22922"
}
```

```json
{
  "session_id": "a4b63bc2-fbbe-425c-ac07-afbefebbff9d",
  "subject": {
    "type": "CLIENT",
    "id": "b008eef8-1dfc-41dc-916d-ef7613c1f1b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDA4ZWVmOC0xZGZjLTQxZGMtOTE2ZC1lZjc2MTNjMWYxYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2OTk5LCJpYXQiOjE3OTMxMTYwOTksImp0aSI6IjM1NDI4NWY0LTkzZjEtNGE5YS05OWY1LWRhMGM4Y2JkNGMyZiIsInNpZCI6ImE0YjYzYmMyLWZiYmUtNDI1Yy1hYzA3LWFmYmVmZWJiZmY5ZCJ9.B0siyJ6isbSGAhuaKoJW6NoNyDZRs-QgKEPpRmD6RwI",
  "access_expires_at": "2026-10-27T16:03:19.649124409Z",
  "refresh_token": "IBYm8f2gGt3I5PNg45wH8VakeT6qUxwN6IfW5kULs-k",
  "refresh_expires_at": "2026-11-26T15:48:19.648829335Z",
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
  "correlation_id": "665feec8-ba8b-4df4-a8ea-ffc8cb0f2ab3"
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
  "device_ref": "sandbox-20266"
}
```

```json
{
  "challenge_id": "0d877a39-2d31-45af-bc39-7a6ab9b18a84",
  "expires_at": "2026-10-27T15:53:19.713869684Z",
  "resend_available_at": "2026-10-27T15:48:20.713869684Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "879895",
  "sent_at": "2026-10-27T15:48:19.715473034Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d877a39-2d31-45af-bc39-7a6ab9b18a84",
  "code": "879895",
  "device_ref": "sandbox-20266"
}
```

```json
{
  "session_id": "8d20300e-e020-494a-906c-681680944803",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjk5OSwiaWF0IjoxNzkzMTE2MDk5LCJqdGkiOiJkYmYxMmU4My1mMDc1LTQ2NjUtYTdlNC0wODkwMzE5YzJmNWEiLCJzaWQiOiI4ZDIwMzAwZS1lMDIwLTQ5NGEtOTA2Yy02ODE2ODA5NDQ4MDMifQ.He5ezpeaFX6jRje2_Xy79OeqFO862zkMGzPiDsc3Ydg",
  "access_expires_at": "2026-10-27T16:03:19.761087207Z",
  "refresh_token": "Qtpspaa8xavpvaeAmLsslnImACB07XDR5N1PSVPmVIE",
  "refresh_expires_at": "2026-11-26T15:48:19.760737161Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e0efa057-6a0c-4c62-bcac-259d75daac8c",
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
  "last_heartbeat_at": "2026-10-27T15:48:17.723464Z",
  "last_location_at": "2026-10-27T15:48:17.723464Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0efa057-6a0c-4c62-bcac-259d75daac8c/handover` → **200**

```json
{
  "command_id": "e274c3c1-6a41-43c1-a514-ae0213374240",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e0efa057-6a0c-4c62-bcac-259d75daac8c",
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
  "last_heartbeat_at": "2026-10-27T15:48:17.723464Z",
  "last_location_at": "2026-10-27T15:48:17.723464Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0efa057-6a0c-4c62-bcac-259d75daac8c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:19Z",
    "sequence": 1793116099830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e0efa057-6a0c-4c62-bcac-259d75daac8c",
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
  "last_heartbeat_at": "2026-10-27T15:48:19.844862Z",
  "last_location_at": "2026-10-27T15:48:19.844862Z",
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
  "session_id": "e0efa057-6a0c-4c62-bcac-259d75daac8c",
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
  "last_heartbeat_at": "2026-10-27T15:48:19.844862Z",
  "last_location_at": "2026-10-27T15:48:19.844862Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e0efa057-6a0c-4c62-bcac-259d75daac8c/close` → **200**

```json
{
  "command_id": "97e66a10-1eaf-465a-8901-c741d9bc2859",
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
  "correlation_id": "9f5ea5fb-3ed4-434a-bf3e-06e20840c0e8"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677080208",
  "device_ref": "sandbox-29605"
}
```

```json
{
  "challenge_id": "f278f326-e4d2-49f3-ab69-c1cae4ebbcec",
  "expires_at": "2026-10-27T15:53:19.977098826Z",
  "resend_available_at": "2026-10-27T15:48:20.977098826Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677080208` → **200**

```json
{
  "phone": "+380677080208",
  "audience": "CLIENT",
  "code": "641546",
  "sent_at": "2026-10-27T15:48:19.978635496Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f278f326-e4d2-49f3-ab69-c1cae4ebbcec",
  "code": "641546",
  "device_ref": "sandbox-29605"
}
```

```json
{
  "session_id": "f93c391e-3dc2-4a3c-b44b-6923ae579dac",
  "subject": {
    "type": "CLIENT",
    "id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMmM3ZGIzMy01NTNmLTQ4YzAtYWQ2Zi0wYTU2MzMxYjIzZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE3MDAwLCJpYXQiOjE3OTMxMTYxMDAsImp0aSI6ImZkY2MwYmY3LTk4ZDEtNDcwNS1iMjFmLTZhZTE2YTYyOWQxOCIsInNpZCI6ImY5M2MzOTFlLTNkYzItNGEzYy1iNDRiLTY5MjNhZTU3OWRhYyJ9.74rrbN62jnW4HrsuYMiO40uqE0e1v9mFGIbMXFoecYk",
  "access_expires_at": "2026-10-27T16:03:20.022397138Z",
  "refresh_token": "04wvchx5Vs98qcMoVZQ6BRtB5biHLZlTggjdfoEwFzU",
  "refresh_expires_at": "2026-11-26T15:48:20.022019651Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "d2efe44b-c5e4-4a6c-b9fd-e95d28c4faeb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4a6c5329-9df3-4ad0-aaca-907fe5f64883",
  "upload_path": "/api/rider/v1/uploads/4a6c5329-9df3-4ad0-aaca-907fe5f64883",
  "expires_at": "2026-10-27T16:03:20.053531844Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/4a6c5329-9df3-4ad0-aaca-907fe5f64883` → **200**

```json
{
  "file_id": "4a6c5329-9df3-4ad0-aaca-907fe5f64883",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "28d24078-0ef8-43bd-9184-7e43f6ba2aea",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "4a6c5329-9df3-4ad0-aaca-907fe5f64883"
  ]
}
```

```json
{
  "id": "b5436ba7-e511-4b99-a32a-40719c1e1057",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:48:20.111414Z",
  "updated_at": "2026-10-27T15:48:20.111414Z",
  "messages": [
    {
      "id": "d061fe19-f470-4435-bc8d-d0c9a715e2ab",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:48:20.112645Z",
      "attachments": [
        {
          "file_id": "4a6c5329-9df3-4ad0-aaca-907fe5f64883",
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
  "session_id": "92db54af-46e3-4968-b615-6626030af922",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcwMDAsImlhdCI6MTc5MzExNjEwMCwianRpIjoiOGIxZWIyOWYtYjNiZC00ZjY5LWI0ZDgtMzc2OWVjNzU5OWIwIiwic2lkIjoiOTJkYjU0YWYtNDZlMy00OTY4LWI2MTUtNjYyNjAzMGFmOTIyIn0.DNLU6Uf_vnPKT5PM9djOeDX2pBuTlxrXAME8Stje5xI",
  "access_expires_at": "2026-10-27T16:03:20.363603453Z",
  "refresh_token": "XlqRG7CqwCmJF3WleMAnYyIL-qou8NrIb7en3uYpbLk",
  "refresh_expires_at": "2026-10-28T03:48:20.363194195Z",
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
  "session_id": "6b723028-232a-472b-86e1-0d116d905295",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcwMDAsImlhdCI6MTc5MzExNjEwMCwianRpIjoiYjFhZGMyZTUtMmEzZS00ZDZiLWI0ODEtZTI1YzQ2MDFiNGI5Iiwic2lkIjoiNmI3MjMwMjgtMjMyYS00NzJiLTg2ZTEtMGQxMTZkOTA1Mjk1In0.zY1hAf2cnc7GhZIwQhGWq2MoKQJR_NInQfAT40kCWpc",
  "access_expires_at": "2026-10-27T16:03:20.591172945Z",
  "refresh_token": "UiEpadWU0vancfx1rt3sCtzu4k95w-x1mdC3f7Vx4cc",
  "refresh_expires_at": "2026-10-28T03:48:20.590744832Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/b5436ba7-e511-4b99-a32a-40719c1e1057/attachments/4a6c5329-9df3-4ad0-aaca-907fe5f64883` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "9c6333c6-3878-4565-b49e-bfb48cf4c87f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f37e5761-68a8-4b7b-84ac-7543ca721209",
  "upload_path": "/api/operator/v1/uploads/f37e5761-68a8-4b7b-84ac-7543ca721209",
  "expires_at": "2026-10-27T16:03:20.637848344Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/f37e5761-68a8-4b7b-84ac-7543ca721209` → **200**

```json
{
  "file_id": "f37e5761-68a8-4b7b-84ac-7543ca721209",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/b5436ba7-e511-4b99-a32a-40719c1e1057` → **200**

```json
{
  "id": "b5436ba7-e511-4b99-a32a-40719c1e1057",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:48:20.111414Z",
  "updated_at": "2026-10-27T15:48:20.111414Z",
  "messages": [
    {
      "id": "d061fe19-f470-4435-bc8d-d0c9a715e2ab",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:48:20.112645Z",
      "attachments": [
        {
          "file_id": "4a6c5329-9df3-4ad0-aaca-907fe5f64883",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/b5436ba7-e511-4b99-a32a-40719c1e1057/comments` → **200**

```json
{
  "command_id": "f42e2782-aecf-4026-8c7b-fb55f702bd90",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "f37e5761-68a8-4b7b-84ac-7543ca721209"
  ]
}
```

```json
{
  "id": "b5436ba7-e511-4b99-a32a-40719c1e1057",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:48:20.111414Z",
  "updated_at": "2026-10-27T15:48:20.719324Z",
  "messages": [
    {
      "id": "d061fe19-f470-4435-bc8d-d0c9a715e2ab",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:48:20.112645Z",
      "attachments": [
        {
          "file_id": "4a6c5329-9df3-4ad0-aaca-907fe5f64883",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b6cc6cf0-ea98-49cf-bbce-2f5a68c7107c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:48:20.719032Z",
      "attachments": [
        {
          "file_id": "f37e5761-68a8-4b7b-84ac-7543ca721209",
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

`GET /api/rider/v1/support/cases/b5436ba7-e511-4b99-a32a-40719c1e1057` → **200**

```json
{
  "id": "b5436ba7-e511-4b99-a32a-40719c1e1057",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:48:20.111414Z",
  "updated_at": "2026-10-27T15:48:20.719324Z",
  "messages": [
    {
      "id": "d061fe19-f470-4435-bc8d-d0c9a715e2ab",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b2c7db33-553f-48c0-ad6f-0a56331b23f8",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:48:20.112645Z",
      "attachments": [
        {
          "file_id": "4a6c5329-9df3-4ad0-aaca-907fe5f64883",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b6cc6cf0-ea98-49cf-bbce-2f5a68c7107c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:48:20.719032Z",
      "attachments": [
        {
          "file_id": "f37e5761-68a8-4b7b-84ac-7543ca721209",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/b5436ba7-e511-4b99-a32a-40719c1e1057/attachments/f37e5761-68a8-4b7b-84ac-7543ca721209` → **200**

Done: support case b5436ba7-e511-4b99-a32a-40719c1e1057, rider attachment 4a6c5329-9df3-4ad0-aaca-907fe5f64883, operator attachment f37e5761-68a8-4b7b-84ac-7543ca721209.

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
  "session_id": "55f71df2-d5bd-4536-ab8a-9965985af865",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcwMDAsImlhdCI6MTc5MzExNjEwMCwianRpIjoiZDNhYjRjZDktMzJhOC00MjZkLTlmNDMtY2UzMzE0ZmVmNGU1Iiwic2lkIjoiNTVmNzFkZjItZDViZC00NTM2LWFiOGEtOTk2NTk4NWFmODY1In0.BI0SyGMSOwPb3gY1ozKfpzIed6-EOAriht6_A_lpBjw",
  "access_expires_at": "2026-10-27T16:03:20.999626673Z",
  "refresh_token": "1qLKVnIeLE8MOi6lE5S18Nzv2BXZYh3SHbzjLwwPQG0",
  "refresh_expires_at": "2026-10-28T03:48:20.999311229Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5782"
}
```

```json
{
  "challenge_id": "dd41e689-de6d-4098-ba05-e26808265108",
  "expires_at": "2026-10-27T15:53:21.022403652Z",
  "resend_available_at": "2026-10-27T15:48:22.022403652Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "337630",
  "sent_at": "2026-10-27T15:48:21.024542022Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd41e689-de6d-4098-ba05-e26808265108",
  "code": "337630",
  "device_ref": "sandbox-5782"
}
```

```json
{
  "session_id": "2231b1a7-5b9c-4c5b-9423-c4d020527809",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzAwMSwiaWF0IjoxNzkzMTE2MTAxLCJqdGkiOiJjNDc2Njk3Zi02NWExLTQ5MjAtYjUxZS0yMTZlOTUzMTg4YzkiLCJzaWQiOiIyMjMxYjFhNy01YjljLTRjNWItOTQyMy1jNGQwMjA1Mjc4MDkifQ.j4z4fRGbGCxKkt8dHyERlfPEk3feXZgIfdi8puA0FC0",
  "access_expires_at": "2026-10-27T16:03:21.069557123Z",
  "refresh_token": "90D5U4KqFf2cZuI6kQYF7kpSMHPL3B-6H-9gKTi5tac",
  "refresh_expires_at": "2026-11-26T15:48:21.069137251Z",
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
  "command_id": "a304bb2b-d31a-48f7-bf07-5a9d8c79693b",
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
  "device_ref": "sandbox-27967"
}
```

```json
{
  "challenge_id": "96b135a7-a1ad-4488-93cb-5de5d2764f35",
  "expires_at": "2026-10-27T15:53:21.172413032Z",
  "resend_available_at": "2026-10-27T15:48:22.172413032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "402962",
  "sent_at": "2026-10-27T15:48:21.173852335Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96b135a7-a1ad-4488-93cb-5de5d2764f35",
  "code": "402962",
  "device_ref": "sandbox-27967"
}
```

```json
{
  "session_id": "420eae9e-716d-4dff-99f1-715afa442861",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNzAwMSwiaWF0IjoxNzkzMTE2MTAxLCJqdGkiOiJiYjE4NGQxYS1mMmM0LTQyMTEtYmM1Yi05NWFkODEyNmVjNTgiLCJzaWQiOiI0MjBlYWU5ZS03MTZkLTRkZmYtOTlmMS03MTVhZmE0NDI4NjEifQ.-_0am98Brs8xcs6_LNKHJ7UNvxG6Bzi0hysqFG6L7ts",
  "access_expires_at": "2026-10-27T16:03:21.216299492Z",
  "refresh_token": "2m8EoorApMW-LsM9VlVkIaW34D0DHtqw1nh40n6JjJQ",
  "refresh_expires_at": "2026-11-26T15:48:21.215962135Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17372664-3014-4bc9-8e24-5ff07ab2f8c5",
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
  "last_heartbeat_at": "2026-10-27T15:48:18.610432Z",
  "last_location_at": "2026-10-27T15:48:18.610432Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17372664-3014-4bc9-8e24-5ff07ab2f8c5/handover` → **200**

```json
{
  "command_id": "e9beed2c-543f-4a17-adbe-a6e3729221cf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17372664-3014-4bc9-8e24-5ff07ab2f8c5",
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
  "last_heartbeat_at": "2026-10-27T15:48:18.610432Z",
  "last_location_at": "2026-10-27T15:48:18.610432Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17372664-3014-4bc9-8e24-5ff07ab2f8c5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:21Z",
    "sequence": 1793116101280
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17372664-3014-4bc9-8e24-5ff07ab2f8c5",
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
  "last_heartbeat_at": "2026-10-27T15:48:21.296285Z",
  "last_location_at": "2026-10-27T15:48:21.296285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
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
  "last_heartbeat_at": "2026-10-27T15:47:55.544331Z",
  "last_location_at": "2026-10-27T15:47:55.544331Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b87e2525-40d5-49b1-a6f4-ba12f96649ec/handover` → **200**

```json
{
  "command_id": "3b270e64-90b6-46a6-95c3-599d98d3d2fa",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T15:47:55.544331Z",
  "last_location_at": "2026-10-27T15:47:55.544331Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b87e2525-40d5-49b1-a6f4-ba12f96649ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:21Z",
    "sequence": 1793116101362
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T15:48:21.377739Z",
  "last_location_at": "2026-10-27T15:48:21.377739Z",
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
  "session_id": "db0b04ba-3c95-4c28-982c-19eda0c3f9af",
  "subject": {
    "type": "STAFF",
    "id": "0ba6c33f-36b6-45cb-9dc8-58f521f22107"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmE2YzMzZi0zNmI2LTQ1Y2ItOWRjOC01OGY1MjFmMjIxMDciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTcwMDEsImlhdCI6MTc5MzExNjEwMSwianRpIjoiM2MxMWQ2MzUtNTgzMC00MWI4LWE0NDYtMDNlMjZmNmFmMmRiIiwic2lkIjoiZGIwYjA0YmEtM2M5NS00YzI4LTk4MmMtMTllZGEwYzNmOWFmIn0.M1oaSLzQCvmAWnUrcPkZ8_XwtoJReCC3bzRNq7wTaXA",
  "access_expires_at": "2026-10-27T16:03:21.606976311Z",
  "refresh_token": "qRi1-jYO8rXoZSfeOJTwvT-kLlTsXPYTLAyqj0pv5z4",
  "refresh_expires_at": "2026-10-28T03:48:21.606654527Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7c50474c-a452-48ed-a76e-874b681c3cee",
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
  "id": "80003c8f-e7ec-4600-beb4-8e8d167189d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:53:21.633150Z",
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
  "command_id": "4f6d6c98-f2fc-42b6-bbbb-312732847093",
  "quote_id": "80003c8f-e7ec-4600-beb4-8e8d167189d6",
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
  "id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
  "short_number": 12,
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
  "created_at": "2026-10-27T15:48:21.662229Z",
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
    "id": "5f664b77-e773-4935-830b-0f38daae5af2",
    "order_id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
    "expires_at": "2026-10-27T15:48:36.664595Z",
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

`POST /api/driver/v1/offers/5f664b77-e773-4935-830b-0f38daae5af2/accept` → **200**

```json
{
  "command_id": "fd36549d-6cfc-4345-8e8b-7057ffe4e1c7"
}
```

```json
{
  "id": "a40889bb-2fcc-460a-9e87-9ffabd9cded3",
  "order_id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "31699899-9ce7-412d-a9a6-b839280307c4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "31699899-9ce7-412d-a9a6-b839280307c4",
  "order_id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
  "assignment_id": "a40889bb-2fcc-460a-9e87-9ffabd9cded3",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/b87e2525-40d5-49b1-a6f4-ba12f96649ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:48:21Z",
    "sequence": 1793116101769
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
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
  "last_heartbeat_at": "2026-10-27T15:48:21.784634Z",
  "last_location_at": "2026-10-27T15:48:21.784634Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/31699899-9ce7-412d-a9a6-b839280307c4/arrive` → **200**

```json
{
  "command_id": "f1620bdc-a4d7-4172-a4ed-c0c9815de322",
  "expected_version": 0
}
```

```json
{
  "id": "31699899-9ce7-412d-a9a6-b839280307c4",
  "order_id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
  "assignment_id": "a40889bb-2fcc-460a-9e87-9ffabd9cded3",
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
  "arrived_at": "2026-10-27T15:48:21.812958Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/31699899-9ce7-412d-a9a6-b839280307c4/start` → **200**

```json
{
  "command_id": "f031302f-6632-4fdd-90e4-7c007e975f32",
  "expected_version": 1
}
```

```json
{
  "id": "31699899-9ce7-412d-a9a6-b839280307c4",
  "order_id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
  "assignment_id": "a40889bb-2fcc-460a-9e87-9ffabd9cded3",
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
  "arrived_at": "2026-10-27T15:48:21.812958Z",
  "started_at": "2026-10-27T15:48:21.844101Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/31699899-9ce7-412d-a9a6-b839280307c4/complete` → **200**

```json
{
  "command_id": "69c926fd-ca36-4cf7-a408-34ef1774a57e",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:48:21Z",
  "cash_received": true
}
```

```json
{
  "id": "31699899-9ce7-412d-a9a6-b839280307c4",
  "order_id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
  "assignment_id": "a40889bb-2fcc-460a-9e87-9ffabd9cded3",
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
  "arrived_at": "2026-10-27T15:48:21.812958Z",
  "started_at": "2026-10-27T15:48:21.844101Z",
  "completed_at": "2026-10-27T15:48:21.879409Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/ad61b6fd-c64a-4664-aa11-b456f574f3df` → **200**

```json
{
  "id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
  "short_number": 12,
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
    "id": "a40889bb-2fcc-460a-9e87-9ffabd9cded3",
    "order_id": "ad61b6fd-c64a-4664-aa11-b456f574f3df",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "31699899-9ce7-412d-a9a6-b839280307c4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:48:21.662229Z",
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
      "balance_minor": 9357,
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
  "session_id": "17372664-3014-4bc9-8e24-5ff07ab2f8c5",
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
  "last_heartbeat_at": "2026-10-27T15:48:21.296285Z",
  "last_location_at": "2026-10-27T15:48:21.296285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17372664-3014-4bc9-8e24-5ff07ab2f8c5/close` → **200**

```json
{
  "command_id": "9e03a8f0-6ee4-4993-b951-e93d633d8a7b",
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
  "session_id": "b87e2525-40d5-49b1-a6f4-ba12f96649ec",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T15:48:21.784634Z",
  "last_location_at": "2026-10-27T15:48:21.784634Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b87e2525-40d5-49b1-a6f4-ba12f96649ec/close` → **200**

```json
{
  "command_id": "06b23aea-e49a-4b73-ac0d-c1a342863fef",
  "expected_version": 2
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

Done: terminal order ad61b6fd-c64a-4664-aa11-b456f574f3df by Andrii (5a000000-0000-4000-8000-000000000403).
