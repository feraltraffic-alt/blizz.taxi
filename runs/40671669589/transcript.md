# Sandbox transcript (2026-10-28T10:23:54Z, 93496fa)

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
  "correlation_id": "6ebdd235-be54-4a6c-9a2b-5c1c7863aad6"
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
  "session_id": "cf022ed1-9f22-4686-8ed7-254df8e1745d",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM5NDEsImlhdCI6MTc5MzE4MzA0MSwianRpIjoiNWY5ZDcwZTQtZWI1OS00M2QzLWJjYzctNDM2N2UwMGE1MjMwIiwic2lkIjoiY2YwMjJlZDEtOWYyMi00Njg2LThlZDctMjU0ZGY4ZTE3NDVkIn0.bMSnDc1nQRc60Us-YOZBz5c25WMVZ45GxIdbl6UZ8zs",
  "access_expires_at": "2026-10-28T10:39:01.913018243Z",
  "refresh_token": "o2CRVxL2zuNE0pU6dASJKjJPzUr-3qpZgsvVf4jA_tE",
  "refresh_expires_at": "2026-10-28T22:24:01.910854587Z",
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
  "session_id": "36130719-a8ac-4ad7-ad56-06d6710b6e10",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM5NDMsImlhdCI6MTc5MzE4MzA0MywianRpIjoiNDFmZjFhNWQtOGY0MS00ODYyLTkzZWEtYjg4Zjk3MWUzOTAxIiwic2lkIjoiMzYxMzA3MTktYThhYy00YWQ3LWFkNTYtMDZkNjcxMGI2ZTEwIn0.9Te4IGqjiu4XmJTZWdTCLxipncpMeDHxN7mEx3XxVA0",
  "access_expires_at": "2026-10-28T10:39:03.318747425Z",
  "refresh_token": "nVn9j3wURy-0v8xIXuQpXx7m1AZcCtrVRgbXlaSMHeY",
  "refresh_expires_at": "2026-10-28T22:24:03.317627433Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "52664fbe-9cc3-4644-b624-2ce527ee107c",
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
  "id": "b7f256d8-e7c0-4d2a-a4b3-6a0caaf50d6c",
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
  "created_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "created_at": "2026-10-28T10:24:03.585394Z",
  "updated_at": "2026-10-28T10:24:03.585394Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634310039",
  "device_ref": "sandbox-19879"
}
```

```json
{
  "challenge_id": "64ae2b33-14db-4199-9f41-8930004fc100",
  "expires_at": "2026-10-28T10:29:03.819924394Z",
  "resend_available_at": "2026-10-28T10:24:04.819924394Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634310039` → **200**

```json
{
  "phone": "+380634310039",
  "audience": "CLIENT",
  "code": "803383",
  "sent_at": "2026-10-28T10:24:03.82739319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64ae2b33-14db-4199-9f41-8930004fc100",
  "code": "803383",
  "device_ref": "sandbox-19879"
}
```

```json
{
  "session_id": "6d134196-a974-4c2c-b8d7-7f933912f872",
  "subject": {
    "type": "CLIENT",
    "id": "5131541d-e736-4621-9bc4-b0766d8b23d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTMxNTQxZC1lNzM2LTQ2MjEtOWJjNC1iMDc2NmQ4YjIzZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzOTQ0LCJpYXQiOjE3OTMxODMwNDQsImp0aSI6ImFjNGFmMDNhLWE2NDEtNGIzMS04ZTYxLWZlYzk4MDg2NjhlNiIsInNpZCI6IjZkMTM0MTk2LWE5NzQtNGMyYy1iOGQ3LTdmOTMzOTEyZjg3MiJ9.XWyrvmiXuQhjXhfd2ceZxmc0c3VqJabhZQIQvwmv7ew",
  "access_expires_at": "2026-10-28T10:39:04.076976284Z",
  "refresh_token": "824smttpdiDU3PkfIe6igc5h3ph7jfsjyyIpags50tk",
  "refresh_expires_at": "2026-11-27T10:24:04.075897152Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380634310039` → **200**

```json
{
  "client_id": "5131541d-e736-4621-9bc4-b0766d8b23d4"
}
```

`POST /api/admin/v1/rider-wallets/5131541d-e736-4621-9bc4-b0766d8b23d4/top-ups` → **201**

```json
{
  "command_id": "69599971-bd43-4d1e-844d-8a3dd70079d0",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "5131541d-e736-4621-9bc4-b0766d8b23d4",
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
      "id": "f37f3b2c-7cab-4412-8e1f-74cd61f2457d",
      "at": "2026-10-28T10:24:04.525587Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "42ea70f5-8957-4f64-b087-cc064befa79e",
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
  "id": "f6e4f6e1-2af4-4d02-94c6-8b1239bdfc0d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:29:04.831891Z",
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
      "id": "b7f256d8-e7c0-4d2a-a4b3-6a0caaf50d6c",
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
  "device_ref": "sandbox-16455"
}
```

```json
{
  "challenge_id": "c256a9b4-35e1-4200-b0ed-3b2935c33567",
  "expires_at": "2026-10-28T10:29:05.083607356Z",
  "resend_available_at": "2026-10-28T10:24:06.083607356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "200786",
  "sent_at": "2026-10-28T10:24:05.086996261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c256a9b4-35e1-4200-b0ed-3b2935c33567",
  "code": "200786",
  "device_ref": "sandbox-16455"
}
```

```json
{
  "session_id": "f100d0f7-1b63-4738-968b-2e7ddd3fa7b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzk0NSwiaWF0IjoxNzkzMTgzMDQ1LCJqdGkiOiJmMTM4ZmNjNi1mNWZkLTQzNDYtYTYzNi1iOGFhZmE1NTgzYTgiLCJzaWQiOiJmMTAwZDBmNy0xYjYzLTQ3MzgtOTY4Yi0yZTdkZGQzZmE3YjkifQ.K9CpU5rQBz1wc4pAstqqdbE5bzZEdF1xLQuqfjKzJYU",
  "access_expires_at": "2026-10-28T10:39:05.321016607Z",
  "refresh_token": "j3_MsThk9YG1JTUJ5vBhIX1Zo62TGO6ejsmqhf-S1Uk",
  "refresh_expires_at": "2026-11-27T10:24:05.320061764Z",
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
  "command_id": "4e765bcf-df53-4978-8275-243294ec7e4c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:24:05Z",
    "sequence": 1793183045753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f054f277-6678-4cc7-8e94-8e83591a46a5",
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
  "last_heartbeat_at": "2026-10-28T10:24:05.792716Z",
  "last_location_at": "2026-10-28T10:24:05.792716Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "57039156-6839-4aa3-ba83-ca5620d9a2d1",
  "quote_id": "f6e4f6e1-2af4-4d02-94c6-8b1239bdfc0d",
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
  "id": "bd446456-2224-4c27-bdf4-6abb168b047e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5131541d-e736-4621-9bc4-b0766d8b23d4",
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
  "created_at": "2026-10-28T10:24:06.072508Z",
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
  "client_id": "5131541d-e736-4621-9bc4-b0766d8b23d4",
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
      "id": "f37f3b2c-7cab-4412-8e1f-74cd61f2457d",
      "at": "2026-10-28T10:24:04.525587Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
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
    "id": "b2d91224-44b0-4ad3-9ed3-55137c35759a",
    "order_id": "bd446456-2224-4c27-bdf4-6abb168b047e",
    "expires_at": "2026-10-28T10:24:21.089316Z",
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

`POST /api/driver/v1/offers/b2d91224-44b0-4ad3-9ed3-55137c35759a/accept` → **200**

```json
{
  "command_id": "0baf6570-2bfb-4b73-ba11-bb00a5b2c440"
}
```

```json
{
  "id": "9eb21321-fb65-43d6-b135-48664f6ea5be",
  "order_id": "bd446456-2224-4c27-bdf4-6abb168b047e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d8a83d82-21c0-49ec-910c-587700261f40",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d8a83d82-21c0-49ec-910c-587700261f40",
  "order_id": "bd446456-2224-4c27-bdf4-6abb168b047e",
  "assignment_id": "9eb21321-fb65-43d6-b135-48664f6ea5be",
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

`POST /api/driver/v1/work-sessions/f054f277-6678-4cc7-8e94-8e83591a46a5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:24:07Z",
    "sequence": 1793183047242
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f054f277-6678-4cc7-8e94-8e83591a46a5",
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
  "last_heartbeat_at": "2026-10-28T10:24:07.263394Z",
  "last_location_at": "2026-10-28T10:24:07.263394Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d8a83d82-21c0-49ec-910c-587700261f40/arrive` → **200**

```json
{
  "command_id": "d125af33-f72f-4408-98fe-09ad4bcded88",
  "expected_version": 0
}
```

```json
{
  "id": "d8a83d82-21c0-49ec-910c-587700261f40",
  "order_id": "bd446456-2224-4c27-bdf4-6abb168b047e",
  "assignment_id": "9eb21321-fb65-43d6-b135-48664f6ea5be",
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
  "arrived_at": "2026-10-28T10:24:07.504803Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d8a83d82-21c0-49ec-910c-587700261f40/start` → **200**

```json
{
  "command_id": "3407f81a-e5a7-48f2-831b-87bbd94a749e",
  "expected_version": 1
}
```

```json
{
  "id": "d8a83d82-21c0-49ec-910c-587700261f40",
  "order_id": "bd446456-2224-4c27-bdf4-6abb168b047e",
  "assignment_id": "9eb21321-fb65-43d6-b135-48664f6ea5be",
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
  "arrived_at": "2026-10-28T10:24:07.504803Z",
  "started_at": "2026-10-28T10:24:07.73805Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d8a83d82-21c0-49ec-910c-587700261f40/complete` → **200**

```json
{
  "command_id": "ca2bc78e-6598-45e3-ad5e-fe9cb831e2c3",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:24:07Z",
  "cash_received": true
}
```

```json
{
  "id": "d8a83d82-21c0-49ec-910c-587700261f40",
  "order_id": "bd446456-2224-4c27-bdf4-6abb168b047e",
  "assignment_id": "9eb21321-fb65-43d6-b135-48664f6ea5be",
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
  "arrived_at": "2026-10-28T10:24:07.504803Z",
  "started_at": "2026-10-28T10:24:07.73805Z",
  "completed_at": "2026-10-28T10:24:07.99182Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5131541d-e736-4621-9bc4-b0766d8b23d4",
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
      "id": "7baa0207-9c5a-4a1d-8461-fd4859a1e279",
      "at": "2026-10-28T10:24:08.569835Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "bd446456-2224-4c27-bdf4-6abb168b047e"
    },
    {
      "id": "f37f3b2c-7cab-4412-8e1f-74cd61f2457d",
      "at": "2026-10-28T10:24:04.525587Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/b7f256d8-e7c0-4d2a-a4b3-6a0caaf50d6c/archive` → **200**

```json
{
  "command_id": "af81337b-efa5-4e61-a115-3e091ccc701e",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "b7f256d8-e7c0-4d2a-a4b3-6a0caaf50d6c",
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
  "created_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "created_at": "2026-10-28T10:24:03.585394Z",
  "updated_at": "2026-10-28T10:24:11.46444Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f054f277-6678-4cc7-8e94-8e83591a46a5",
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
  "last_heartbeat_at": "2026-10-28T10:24:07.263394Z",
  "last_location_at": "2026-10-28T10:24:07.263394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f054f277-6678-4cc7-8e94-8e83591a46a5/close` → **200**

```json
{
  "command_id": "dbdf121b-6898-4178-af24-0077c4355df3",
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

Done: order bd446456-2224-4c27-bdf4-6abb168b047e.

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
  "session_id": "c0e81a68-46cb-4349-a8ac-382f535a7704",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM5NTIsImlhdCI6MTc5MzE4MzA1MiwianRpIjoiYjgyMjM3YTgtOTAzYi00MjBkLThiYWYtMjEwMDdlMWVhMDJlIiwic2lkIjoiYzBlODFhNjgtNDZjYi00MzQ5LWE4YWMtMzgyZjUzNWE3NzA0In0.ltcbqcsexnEtPykLPYjk0huK3JBmD1sVXODX3e4TB_g",
  "access_expires_at": "2026-10-28T10:39:12.470724888Z",
  "refresh_token": "zVQRSKgJIGkFUkfPOSyG1nbYuuW1syGfZLRwG61CZ3c",
  "refresh_expires_at": "2026-10-28T22:24:12.46973687Z",
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
  "command_id": "4a17a54a-2ab4-4671-a6ed-b86de6ca1013",
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
  "session_id": "678f11a5-8cb5-408b-b548-aa0cb0ef62ca",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM5NTMsImlhdCI6MTc5MzE4MzA1MywianRpIjoiYWEzMjEzMDYtNzBhNC00MjBjLWI4ODgtOWUyODRjMWE5OGRmIiwic2lkIjoiNjc4ZjExYTUtOGNiNS00MDhiLWI1NDgtYWEwY2IwZWY2MmNhIn0.aZFPQggHhVSLdel_a0IPtXdmZdSqJg4CTwX0QI0Tq0o",
  "access_expires_at": "2026-10-28T10:39:13.41310853Z",
  "refresh_token": "54f1W_wZ1eehmz6yARJ0-HNdX-YMy6YuIATC8NOZ40I",
  "refresh_expires_at": "2026-10-28T22:24:13.412347422Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2995816351",
    "linkedid": "1730052700.2995816351",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675251613"
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
    "id": "1730052700.2995816351",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "1b486def-d73d-4405-b092-60624ca34caa",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.635409Z",
      "answered_at": null,
      "ended_at": "2026-10-28T10:24:13.656416Z",
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
    "id": "1730052600.3199713014",
    "linkedid": "1730052600.3199713014",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675251613"
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
      "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.906888Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/5a62d547-0d81-44de-8952-6288cc79bf1c/answer` → **200**

```json
{
  "command_id": "99b156ba-1292-40bb-812c-5d86328022ad"
}
```

```json
{
  "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675251613",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "order_ids": [],
  "started_at": "2026-10-28T10:24:13.906888Z",
  "answered_at": "2026-10-28T10:24:14.156832Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3199713014",
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
    "id": "1730052600.3199713014",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.906888Z",
      "answered_at": "2026-10-28T10:24:14.156832Z",
      "ended_at": "2026-10-28T10:24:14.398146Z",
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
      "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.906888Z",
      "answered_at": "2026-10-28T10:24:14.156832Z",
      "ended_at": "2026-10-28T10:24:14.398146Z",
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
      "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.906888Z",
      "answered_at": "2026-10-28T10:24:14.156832Z",
      "ended_at": "2026-10-28T10:24:14.398146Z",
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
      "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.906888Z",
      "answered_at": "2026-10-28T10:24:14.156832Z",
      "ended_at": "2026-10-28T10:24:14.398146Z",
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
      "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.906888Z",
      "answered_at": "2026-10-28T10:24:14.156832Z",
      "ended_at": "2026-10-28T10:24:14.398146Z",
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
      "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.906888Z",
      "answered_at": "2026-10-28T10:24:14.156832Z",
      "ended_at": "2026-10-28T10:24:14.398146Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:24:23.418369Z"
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
      "id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675251613",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "order_ids": [],
      "started_at": "2026-10-28T10:24:13.906888Z",
      "answered_at": "2026-10-28T10:24:14.156832Z",
      "ended_at": "2026-10-28T10:24:14.398146Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T10:24:23.418369Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/5a62d547-0d81-44de-8952-6288cc79bf1c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/5a62d547-0d81-44de-8952-6288cc79bf1c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=5a62d547-0d81-44de-8952-6288cc79bf1c` → **200**

```json
{
  "changes": [
    {
      "id": "cb41fa0d-f7ae-4990-998d-8115660d6ac6",
      "occurred_at": "2026-10-28T10:24:26.027166Z",
      "actor_type": "STAFF",
      "actor_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"53542108-2f7d-4781-9f47-9d2c84c0640c\", \"order_ids\": []}",
      "correlation_id": "df223f37-c155-46e5-9e88-b610d6f0017a"
    },
    {
      "id": "9d21f707-d477-400c-83cf-c015553e99bf",
      "occurred_at": "2026-10-28T10:24:25.997114Z",
      "actor_type": "STAFF",
      "actor_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "5a62d547-0d81-44de-8952-6288cc79bf1c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"53542108-2f7d-4781-9f47-9d2c84c0640c\", \"order_ids\": []}",
      "correlation_id": "fb685a39-74f2-4b86-8bc1-3e28f7726d04"
    }
  ]
}
```

Done: call 5a62d547-0d81-44de-8952-6288cc79bf1c recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637156225",
  "device_ref": "sandbox-16534"
}
```

```json
{
  "challenge_id": "9905dfd8-2b89-47e6-8721-486e3b32af24",
  "expires_at": "2026-10-28T10:29:26.277313496Z",
  "resend_available_at": "2026-10-28T10:24:27.277313496Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637156225` → **200**

```json
{
  "phone": "+380637156225",
  "audience": "CLIENT",
  "code": "760524",
  "sent_at": "2026-10-28T10:24:26.280882263Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9905dfd8-2b89-47e6-8721-486e3b32af24",
  "code": "760524",
  "device_ref": "sandbox-16534"
}
```

```json
{
  "session_id": "e25bd578-65d2-4c03-a51c-edf399247d93",
  "subject": {
    "type": "CLIENT",
    "id": "6a1300d0-1187-4058-8980-d404d79a53bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTEzMDBkMC0xMTg3LTQwNTgtODk4MC1kNDA0ZDc5YTUzYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzOTY2LCJpYXQiOjE3OTMxODMwNjYsImp0aSI6IjNhMTJkYmVmLWUyMzctNGI2MS04NzgyLWVlMDBjYjEyNDU5YSIsInNpZCI6ImUyNWJkNTc4LTY1ZDItNGMwMy1hNTFjLWVkZjM5OTI0N2Q5MyJ9.qMf_-nVirALyHrtbXVUTNbJ59LuIfWKoHBrFKJWXajo",
  "access_expires_at": "2026-10-28T10:39:26.524020866Z",
  "refresh_token": "nOf9b0aZlX9PunFFlkAknB811GFZTG7Jb491Szz3cuo",
  "refresh_expires_at": "2026-11-27T10:24:26.523420229Z",
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
  "device_ref": "sandbox-27019"
}
```

```json
{
  "challenge_id": "032841a5-07ed-42b5-8dbd-63a8c2691474",
  "expires_at": "2026-10-28T10:29:26.944088862Z",
  "resend_available_at": "2026-10-28T10:24:27.944088862Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "646036",
  "sent_at": "2026-10-28T10:24:26.947200684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "032841a5-07ed-42b5-8dbd-63a8c2691474",
  "code": "646036",
  "device_ref": "sandbox-27019"
}
```

```json
{
  "session_id": "5bc870a1-8baf-4def-bd00-1d33d6af4074",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzk2NywiaWF0IjoxNzkzMTgzMDY3LCJqdGkiOiJjM2ZkMmQ3Yi1kMGU2LTRiMjgtODI3MS02NGVjOTE3YTgwMGIiLCJzaWQiOiI1YmM4NzBhMS04YmFmLTRkZWYtYmQwMC0xZDMzZDZhZjQwNzQifQ.02wrZWUAd7WJAC68F1F3wVrgjSnN4P2STj80uyuJvvA",
  "access_expires_at": "2026-10-28T10:39:27.179321233Z",
  "refresh_token": "Ol_PKdOThGCXDGqvKCtU1ynp_eniESCrmHNLB_0-3KY",
  "refresh_expires_at": "2026-11-27T10:24:27.178501606Z",
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
  "session_id": "ea717eb5-0729-4f3f-9306-72982178ba5c",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM5NjcsImlhdCI6MTc5MzE4MzA2NywianRpIjoiN2ViZjNjY2MtNzUwNS00MTU4LWI1ODQtNjY3NWIwZjM1NjcwIiwic2lkIjoiZWE3MTdlYjUtMDcyOS00ZjNmLTkzMDYtNzI5ODIxNzhiYTVjIn0.rkkEfU_VXHwe4tcILW-EIljNuwVVK_oiUu2upWM-mgw",
  "access_expires_at": "2026-10-28T10:39:27.874788673Z",
  "refresh_token": "kaziBFXJT6eTh10agWTUZVlufk7jXNIXYPo7x5Q5394",
  "refresh_expires_at": "2026-10-28T22:24:27.874140381Z",
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
  "session_id": "3b8b9523-6654-4a82-8f4f-9596d1a80d47",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM5NjgsImlhdCI6MTc5MzE4MzA2OCwianRpIjoiN2U4OGRhZTMtYWZkYS00NTI5LTljNjItOTk1YTkwYmZjMDIyIiwic2lkIjoiM2I4Yjk1MjMtNjY1NC00YTgyLThmNGYtOTU5NmQxYTgwZDQ3In0._UvYEWEZIC2S3ZwX5bKz3b8vHL-GW5On9EHH7fVRmeg",
  "access_expires_at": "2026-10-28T10:39:28.363366519Z",
  "refresh_token": "PH-l7gSdBLEN438fKgnABFwuRV-QiYzbUJoH8wzcWio",
  "refresh_expires_at": "2026-10-28T22:24:28.362490696Z",
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
  "command_id": "0240cc19-ae6a-466c-8327-f5d11d713376",
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
  "id": "97199697-263c-415b-a26f-70c5c9797076",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:29:28.812936Z",
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
  "command_id": "6fdcd544-039e-4c1e-8870-093ad909c01e",
  "quote_id": "97199697-263c-415b-a26f-70c5c9797076",
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
  "id": "61a3cb0a-f268-4df6-a26b-53cc96142e5d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a1300d0-1187-4058-8980-d404d79a53bc",
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
  "created_at": "2026-10-28T10:24:29.058125Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/61a3cb0a-f268-4df6-a26b-53cc96142e5d` → **200**

```json
{
  "id": "61a3cb0a-f268-4df6-a26b-53cc96142e5d",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a1300d0-1187-4058-8980-d404d79a53bc",
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
  "created_at": "2026-10-28T10:24:29.058125Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/61a3cb0a-f268-4df6-a26b-53cc96142e5d/cancel` → **200**

```json
{
  "command_id": "ee0b4b24-11d8-4238-9963-3c5f733d1cb2",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "61a3cb0a-f268-4df6-a26b-53cc96142e5d",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6a1300d0-1187-4058-8980-d404d79a53bc",
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
  "created_at": "2026-10-28T10:24:29.058125Z",
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
  "command_id": "30b71b09-8251-4f2e-8c40-a5b47d13f48a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:24:30Z",
    "sequence": 1793183070267
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e6c6c4b-88a2-4367-a10b-f60ddd23be1f",
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
  "last_heartbeat_at": "2026-10-28T10:24:30.04354Z",
  "last_location_at": "2026-10-28T10:24:30.04354Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29310"
}
```

```json
{
  "challenge_id": "cdb63765-a929-4f5f-b037-dcaa53cd480e",
  "expires_at": "2026-10-28T10:29:30.262930319Z",
  "resend_available_at": "2026-10-28T10:24:31.262930319Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "683619",
  "sent_at": "2026-10-28T10:24:30.266539939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdb63765-a929-4f5f-b037-dcaa53cd480e",
  "code": "683619",
  "device_ref": "sandbox-29310"
}
```

```json
{
  "session_id": "b1180930-3442-49a1-ab57-23876356d3f8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzk3MCwiaWF0IjoxNzkzMTgzMDcwLCJqdGkiOiI3ZGFmMGNhNC1iMjIzLTQ4OTItOGU5OS03OTMxOWJiMmE3YTgiLCJzaWQiOiJiMTE4MDkzMC0zNDQyLTQ5YTEtYWI1Ny0yMzg3NjM1NmQzZjgifQ.L3XuzcyJjWFfK5IhpZVIrF7O3Xj2mcPyOb32EWhd8Jg",
  "access_expires_at": "2026-10-28T10:39:30.505565059Z",
  "refresh_token": "39gjy4DVcF24Z_sQHAATt6AglFAKBZRPPWJBdpNlek4",
  "refresh_expires_at": "2026-11-27T10:24:30.504912582Z",
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
  "command_id": "fd49a5f1-c8fb-49a7-a884-97d9a9207765",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:24:30Z",
    "sequence": 1793183070926
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00b73677-bc23-4728-b82a-32cd039c9c8f",
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
  "last_heartbeat_at": "2026-10-28T10:24:30.942279Z",
  "last_location_at": "2026-10-28T10:24:30.942279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "291ebeae-6071-4ba7-abd6-79c7ddf68c38",
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
  "id": "4d5bba29-a779-4d85-a0a8-2657c9483c6a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:29:31.180950Z",
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
  "command_id": "d7cbab33-e742-4b73-99e1-fb7211186027",
  "quote_id": "4d5bba29-a779-4d85-a0a8-2657c9483c6a",
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
  "id": "659a6026-8f1b-4458-86b8-dad587d5d633",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a1300d0-1187-4058-8980-d404d79a53bc",
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
  "created_at": "2026-10-28T10:24:31.415315Z",
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
    "id": "58e7c44d-2377-457c-a216-cb646da2ede8",
    "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
    "expires_at": "2026-10-28T10:24:46.419463Z",
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

`POST /api/driver/v1/offers/58e7c44d-2377-457c-a216-cb646da2ede8/accept` → **200**

```json
{
  "command_id": "ec765d05-9435-4871-a9fd-b3be8523a9dd"
}
```

```json
{
  "id": "3bd6979a-3b4a-47c0-8f6a-2e2667016204",
  "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e133432a-4b72-42ee-8ff0-521b5568b579",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e133432a-4b72-42ee-8ff0-521b5568b579",
  "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
  "assignment_id": "3bd6979a-3b4a-47c0-8f6a-2e2667016204",
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

`POST /api/driver/v1/trips/e133432a-4b72-42ee-8ff0-521b5568b579/cancel` → **200**

```json
{
  "command_id": "b8e1a49d-5494-429f-9175-558f4ef953ac",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "e133432a-4b72-42ee-8ff0-521b5568b579",
  "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
  "assignment_id": "3bd6979a-3b4a-47c0-8f6a-2e2667016204",
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

`GET /api/rider/v1/orders/659a6026-8f1b-4458-86b8-dad587d5d633` → **200**

```json
{
  "id": "659a6026-8f1b-4458-86b8-dad587d5d633",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6a1300d0-1187-4058-8980-d404d79a53bc",
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
    "id": "3bd6979a-3b4a-47c0-8f6a-2e2667016204",
    "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e133432a-4b72-42ee-8ff0-521b5568b579",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:24:31.415315Z",
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
    "id": "798ca880-76e6-45a6-bd82-45f24962248e",
    "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
    "expires_at": "2026-10-28T10:24:47.334449Z",
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

`POST /api/driver/v1/offers/798ca880-76e6-45a6-bd82-45f24962248e/accept` → **200**

```json
{
  "command_id": "6cf499c4-81f4-4482-b4e7-1c5a9599f1cf"
}
```

```json
{
  "id": "34229020-48e9-42d4-abe1-821a94df5e99",
  "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c302cfc-47b1-4023-ae52-8b2d71b0e444",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c302cfc-47b1-4023-ae52-8b2d71b0e444",
  "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
  "assignment_id": "34229020-48e9-42d4-abe1-821a94df5e99",
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

`POST /api/driver/v1/trips/6c302cfc-47b1-4023-ae52-8b2d71b0e444/cancel` → **200**

```json
{
  "command_id": "cb99d4b3-0b72-4684-8f42-9b8865e25786",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "6c302cfc-47b1-4023-ae52-8b2d71b0e444",
  "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
  "assignment_id": "34229020-48e9-42d4-abe1-821a94df5e99",
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
    "id": "659a6026-8f1b-4458-86b8-dad587d5d633",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:24:31.415315Z",
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
    "id": "61a3cb0a-f268-4df6-a26b-53cc96142e5d",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T10:24:29.058125Z",
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

`GET /api/operator/v1/orders/659a6026-8f1b-4458-86b8-dad587d5d633/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:24:31.416051Z",
      "actor": {
        "type": "CLIENT",
        "id": "6a1300d0-1187-4058-8980-d404d79a53bc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
        "quote_id": "4d5bba29-a779-4d85-a0a8-2657c9483c6a",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "3741755b-c2b8-47cd-8efd-494a56961002"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:24:31.4184Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
        "attempt_id": "899d6cb5-9a9f-4ed5-a41f-d2842008980f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3741755b-c2b8-47cd-8efd-494a56961002"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:24:31.425872Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "58e7c44d-2377-457c-a216-cb646da2ede8",
        "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "3741755b-c2b8-47cd-8efd-494a56961002"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:24:31.883821Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "58e7c44d-2377-457c-a216-cb646da2ede8",
        "order_id": "659a6026-8f1b-4458-86b8-dad587d5d633",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "3bd6979a-3b4a-47c0-8f6a-2e2667016204"
      },
      "correlation_id": "00d6e5da-4528-4830-aa37-157ae1fb1943"
```

Done: orders 61a3cb0a-f268-4df6-a26b-53cc96142e5d, 659a6026-8f1b-4458-86b8-dad587d5d633.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733021313",
  "device_ref": "sandbox-21709"
}
```

```json
{
  "challenge_id": "946b33c1-1313-4dd9-a203-4257c481c1ee",
  "expires_at": "2026-10-28T10:29:34.146210074Z",
  "resend_available_at": "2026-10-28T10:24:35.146210074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733021313` → **200**

```json
{
  "phone": "+380733021313",
  "audience": "CLIENT",
  "code": "240381",
  "sent_at": "2026-10-28T10:24:34.149390151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "946b33c1-1313-4dd9-a203-4257c481c1ee",
  "code": "240381",
  "device_ref": "sandbox-21709"
}
```

```json
{
  "session_id": "78dc61a5-44ea-47bb-b36a-39f5bca6c3cd",
  "subject": {
    "type": "CLIENT",
    "id": "bb38902c-9a3c-4683-94ea-4cb159233faf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYjM4OTAyYy05YTNjLTQ2ODMtOTRlYS00Y2IxNTkyMzNmYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzOTc0LCJpYXQiOjE3OTMxODMwNzQsImp0aSI6IjQwMTcxOTMxLTFmNWItNDcxOS1hYmZjLWRjYTg5MDhjZjIyNCIsInNpZCI6Ijc4ZGM2MWE1LTQ0ZWEtNDdiYi1iMzZhLTM5ZjViY2E2YzNjZCJ9.-6l3fjZhddgJjVnxDCmwRvrOk0DVamjCyKOSmRLbD3I",
  "access_expires_at": "2026-10-28T10:39:34.386525858Z",
  "refresh_token": "eyrctsRK1FMYJEzgnGtSJo2Wf0zUcsMvfkOJdcGLxxA",
  "refresh_expires_at": "2026-11-27T10:24:34.385908165Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ee566843-ce6d-479b-9c88-b4c9fd26668e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9efe53fd-7bf4-4c99-a5bd-af981236072c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9efe53fd-7bf4-4c99-a5bd-af981236072c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "fd1694d06c23f8ae2a78e8bf8b1491b0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9efe53fd-7bf4-4c99-a5bd-af981236072c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733021313"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9efe53fd-7bf4-4c99-a5bd-af981236072c",
  "expires_at": "2026-10-28T10:54:34.609119Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/9efe53fd-7bf4-4c99-a5bd-af981236072c` → **200**

```json
{
  "id": "9efe53fd-7bf4-4c99-a5bd-af981236072c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T10:54:34.609119Z",
  "card": {
    "id": "2f2f1291-8ebf-44ef-8989-93a51f7c1d8c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2724",
    "card_type": "Visa",
    "created_at": "2026-10-28T10:24:34.841645Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "2f2f1291-8ebf-44ef-8989-93a51f7c1d8c",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2724",
      "card_type": "Visa",
      "created_at": "2026-10-28T10:24:34.841645Z"
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
  "device_ref": "sandbox-28957"
}
```

```json
{
  "challenge_id": "07b8d7cc-7fc4-4f0f-a200-4e85d5fca252",
  "expires_at": "2026-10-28T10:29:35.297493787Z",
  "resend_available_at": "2026-10-28T10:24:36.297493787Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "142832",
  "sent_at": "2026-10-28T10:24:35.30036114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07b8d7cc-7fc4-4f0f-a200-4e85d5fca252",
  "code": "142832",
  "device_ref": "sandbox-28957"
}
```

```json
{
  "session_id": "a010742d-d8f6-4b2d-8af6-1c557d5e115c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzk3NSwiaWF0IjoxNzkzMTgzMDc1LCJqdGkiOiIwNmNkNTFlOS1lNzliLTQ0NDgtYWY4Yi1kNjE3ZGUwZmM0MmEiLCJzaWQiOiJhMDEwNzQyZC1kOGY2LTRiMmQtOGFmNi0xYzU1N2Q1ZTExNWMifQ.M3DbmJUIDVaoWdtoMlGkqknS5uqt0DV0t8KjTW7vAtQ",
  "access_expires_at": "2026-10-28T10:39:35.536662019Z",
  "refresh_token": "_ZbUsiYXlNRzQUjjq7ua_xp4Qor38dxaN-dfYA1ELr0",
  "refresh_expires_at": "2026-11-27T10:24:35.535904088Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00b73677-bc23-4728-b82a-32cd039c9c8f",
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
  "last_heartbeat_at": "2026-10-28T10:24:30.942279Z",
  "last_location_at": "2026-10-28T10:24:30.942279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00b73677-bc23-4728-b82a-32cd039c9c8f/handover` → **200**

```json
{
  "command_id": "95d31f21-c8f2-474f-8d75-2be5758dc25c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00b73677-bc23-4728-b82a-32cd039c9c8f",
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
  "last_heartbeat_at": "2026-10-28T10:24:30.942279Z",
  "last_location_at": "2026-10-28T10:24:30.942279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00b73677-bc23-4728-b82a-32cd039c9c8f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:24:36Z",
    "sequence": 1793183076193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00b73677-bc23-4728-b82a-32cd039c9c8f",
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
  "last_heartbeat_at": "2026-10-28T10:24:36.209932Z",
  "last_location_at": "2026-10-28T10:24:36.209932Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "88fed188-8df3-4600-9241-93cbb82fd72b",
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
  "id": "fa93027f-0a50-443e-a253-4a27f8b3f4eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:29:36.438185Z",
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
  "command_id": "3bc3d9af-88bd-49a3-9014-a1e4b2ca3d4d",
  "quote_id": "fa93027f-0a50-443e-a253-4a27f8b3f4eb",
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
  "id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bb38902c-9a3c-4683-94ea-4cb159233faf",
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
  "created_at": "2026-10-28T10:24:36.670701Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/38abaa55-4d54-46cc-b184-dd8ccb40e559` → **200**

```json
{
  "id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bb38902c-9a3c-4683-94ea-4cb159233faf",
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
  "created_at": "2026-10-28T10:24:36.670701Z",
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
    "id": "b4fd4b92-d880-47ff-92ba-fcf9bbdbd152",
    "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
    "expires_at": "2026-10-28T10:24:51.731337Z",
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

`POST /api/driver/v1/offers/b4fd4b92-d880-47ff-92ba-fcf9bbdbd152/accept` → **200**

```json
{
  "command_id": "e35bc027-c037-4e3a-afd0-e7533f34a5c0"
}
```

```json
{
  "id": "0b7407f5-e084-4147-801f-e4beece29bfa",
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5a56d927-310b-4795-a1f4-02cf972af8a5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5a56d927-310b-4795-a1f4-02cf972af8a5",
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "assignment_id": "0b7407f5-e084-4147-801f-e4beece29bfa",
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

`POST /api/driver/v1/work-sessions/00b73677-bc23-4728-b82a-32cd039c9c8f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:24:37Z",
    "sequence": 1793183077785
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00b73677-bc23-4728-b82a-32cd039c9c8f",
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
  "last_heartbeat_at": "2026-10-28T10:24:37.802001Z",
  "last_location_at": "2026-10-28T10:24:37.802001Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5a56d927-310b-4795-a1f4-02cf972af8a5/arrive` → **200**

```json
{
  "command_id": "5729f407-2e16-4bb3-bf68-9500e663ab12",
  "expected_version": 0
}
```

```json
{
  "id": "5a56d927-310b-4795-a1f4-02cf972af8a5",
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "assignment_id": "0b7407f5-e084-4147-801f-e4beece29bfa",
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
  "arrived_at": "2026-10-28T10:24:38.02275Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5a56d927-310b-4795-a1f4-02cf972af8a5/start` → **200**

```json
{
  "command_id": "93525633-2cea-47e0-bedf-cd925f7fd918",
  "expected_version": 1
}
```

```json
{
  "id": "5a56d927-310b-4795-a1f4-02cf972af8a5",
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "assignment_id": "0b7407f5-e084-4147-801f-e4beece29bfa",
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
  "arrived_at": "2026-10-28T10:24:38.02275Z",
  "started_at": "2026-10-28T10:24:38.250944Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5a56d927-310b-4795-a1f4-02cf972af8a5/complete` → **200**

```json
{
  "command_id": "4d2841c0-47ad-4da6-9be1-8dc255bb4c52",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:24:38Z"
}
```

```json
{
  "id": "5a56d927-310b-4795-a1f4-02cf972af8a5",
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "assignment_id": "0b7407f5-e084-4147-801f-e4beece29bfa",
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
  "arrived_at": "2026-10-28T10:24:38.02275Z",
  "started_at": "2026-10-28T10:24:38.250944Z",
  "completed_at": "2026-10-28T10:24:38.48258Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/38abaa55-4d54-46cc-b184-dd8ccb40e559` → **200**

```json
{
  "id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bb38902c-9a3c-4683-94ea-4cb159233faf",
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
    "id": "0b7407f5-e084-4147-801f-e4beece29bfa",
    "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5a56d927-310b-4795-a1f4-02cf972af8a5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:24:36.670701Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/38abaa55-4d54-46cc-b184-dd8ccb40e559` → **200**

```json
{
  "id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "bb38902c-9a3c-4683-94ea-4cb159233faf",
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
    "id": "0b7407f5-e084-4147-801f-e4beece29bfa",
    "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5a56d927-310b-4795-a1f4-02cf972af8a5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:24:36.670701Z",
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
      "id": "bba05d8a-43cc-43f2-a692-0d0e00b310d2",
      "at": "2026-10-28T10:24:38.786051Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/38abaa55-4d54-46cc-b184-dd8ccb40e559/tip` → **200**

```json
{
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
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
  "available_until": "2026-10-29T10:24:38.48258Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/38abaa55-4d54-46cc-b184-dd8ccb40e559/tip` → **201**

```json
{
  "command_id": "6a30524a-a24c-4888-b5cc-52d64ad44881",
  "amount_minor": 2500
}
```

```json
{
  "id": "d6fd176b-51d3-445e-84ee-3ad7d0c269ef",
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T10:24:40.842379Z"
}
```

`GET /api/rider/v1/orders/38abaa55-4d54-46cc-b184-dd8ccb40e559/tip` → **200**

```json
{
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
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
  "available_until": "2026-10-29T10:24:38.48258Z",
  "open": false,
  "tip": {
    "id": "d6fd176b-51d3-445e-84ee-3ad7d0c269ef",
    "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T10:24:40.842379Z"
  }
}
```

`GET /api/rider/v1/orders/38abaa55-4d54-46cc-b184-dd8ccb40e559/tip` → **200**

```json
{
  "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
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
  "available_until": "2026-10-29T10:24:38.48258Z",
  "open": false,
  "tip": {
    "id": "d6fd176b-51d3-445e-84ee-3ad7d0c269ef",
    "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T10:24:40.842379Z"
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
      "id": "bba05d8a-43cc-43f2-a692-0d0e00b310d2",
      "at": "2026-10-28T10:24:38.786051Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
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
      "id": "c63859dd-6d5b-4502-b2b8-b05739b04bb9",
      "at": "2026-10-28T10:24:42.84702Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
      "counterpart_id": null
    },
    {
      "id": "bba05d8a-43cc-43f2-a692-0d0e00b310d2",
      "at": "2026-10-28T10:24:38.786051Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "38abaa55-4d54-46cc-b184-dd8ccb40e559",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "00b73677-bc23-4728-b82a-32cd039c9c8f",
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
  "last_heartbeat_at": "2026-10-28T10:24:37.802001Z",
  "last_location_at": "2026-10-28T10:24:37.802001Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00b73677-bc23-4728-b82a-32cd039c9c8f/close` → **200**

```json
{
  "command_id": "f0156a80-0e52-4f73-8304-b7e47d324703",
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

Done: card order 38abaa55-4d54-46cc-b184-dd8ccb40e559.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735107559",
  "device_ref": "sandbox-20479"
}
```

```json
{
  "challenge_id": "1025b4ff-a50d-451f-9bb5-cbac31588ad3",
  "expires_at": "2026-10-28T10:29:44.37403676Z",
  "resend_available_at": "2026-10-28T10:24:45.37403676Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735107559` → **200**

```json
{
  "phone": "+380735107559",
  "audience": "CLIENT",
  "code": "474579",
  "sent_at": "2026-10-28T10:24:44.376431457Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1025b4ff-a50d-451f-9bb5-cbac31588ad3",
  "code": "474579",
  "device_ref": "sandbox-20479"
}
```

```json
{
  "session_id": "ea6ef2b6-dc09-4e3b-bed7-4aa7011c9c78",
  "subject": {
    "type": "CLIENT",
    "id": "cf586970-4833-4d03-815c-67a161af67e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjU4Njk3MC00ODMzLTRkMDMtODE1Yy02N2ExNjFhZjY3ZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzOTg0LCJpYXQiOjE3OTMxODMwODQsImp0aSI6IjM0ZTk4MzgwLTUwZDYtNGFmOC1iNzRkLTA2MGNmNmVkOGE3NiIsInNpZCI6ImVhNmVmMmI2LWRjMDktNGUzYi1iZWQ3LTRhYTcwMTFjOWM3OCJ9.Uk8PfDpJXSoYVW6FhdcPeH2jv18-MpEHbIR3Hx_rYso",
  "access_expires_at": "2026-10-28T10:39:44.614854405Z",
  "refresh_token": "kQA-ey3jHLb5v79LMsNeGbZs4CZci2yG8uIYLk32tds",
  "refresh_expires_at": "2026-11-27T10:24:44.614264989Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "a1e70b5e-c76b-4458-ac35-e52716c99f2d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "05b324bb-88d3-452e-af36-236cad8f7514",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-05b324bb-88d3-452e-af36-236cad8f7514",
    "orderDate": "1793183084",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "5aa5fc16d8bf69df1f8bf5301d6fa05a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=05b324bb-88d3-452e-af36-236cad8f7514",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735107559"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=05b324bb-88d3-452e-af36-236cad8f7514",
  "created_at": "2026-10-28T10:24:44.831008Z",
  "expires_at": "2026-10-28T10:54:44.831008Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/05b324bb-88d3-452e-af36-236cad8f7514` → **200**

```json
{
  "id": "05b324bb-88d3-452e-af36-236cad8f7514",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:24:44.831008Z",
  "expires_at": "2026-10-28T10:54:44.831008Z",
  "completed_at": "2026-10-28T10:24:45.055517Z",
  "masked_pan": "41****1698",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cf586970-4833-4d03-815c-67a161af67e7",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cf586970-4833-4d03-815c-67a161af67e7",
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
      "id": "bf38694f-d7a8-4bd9-96b0-564418d75119",
      "at": "2026-10-28T10:24:45.866903Z",
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
  "client_id": "cf586970-4833-4d03-815c-67a161af67e7",
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
      "id": "bf38694f-d7a8-4bd9-96b0-564418d75119",
      "at": "2026-10-28T10:24:45.866903Z",
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
  "device_ref": "sandbox-30122"
}
```

```json
{
  "challenge_id": "7524c836-84a1-4735-8ded-1c9448d7d1c4",
  "expires_at": "2026-10-28T10:29:46.951847728Z",
  "resend_available_at": "2026-10-28T10:24:47.951847728Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "004801",
  "sent_at": "2026-10-28T10:24:46.954501177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7524c836-84a1-4735-8ded-1c9448d7d1c4",
  "code": "004801",
  "device_ref": "sandbox-30122"
}
```

```json
{
  "session_id": "679c1b98-5a89-49d7-811d-bbb823f980a4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4Mzk4NywiaWF0IjoxNzkzMTgzMDg3LCJqdGkiOiJmMWMyMDM1MS1mMjRjLTRkYWEtYjkwYy1kZWU3NTgzYzE0MzUiLCJzaWQiOiI2NzljMWI5OC01YTg5LTQ5ZDctODExZC1iYmI4MjNmOTgwYTQifQ.l733m_3NDkOnmdgvsCxYIql-3j4PBUHhfbHXIfdUVCw",
  "access_expires_at": "2026-10-28T10:39:47.190441505Z",
  "refresh_token": "lwOMQ0A4KA1BoVFkFb033WBQiABaOE-YOJMxMM2msBk",
  "refresh_expires_at": "2026-11-27T10:24:47.189887209Z",
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
  "command_id": "6676d105-79a2-44a1-a9cc-ae97ae8ec315",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "d273748c-46a6-4d1b-b27f-8aa8663a74f0",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d273748c-46a6-4d1b-b27f-8aa8663a74f0",
    "orderDate": "1793183087",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "05419b8754d38a11b94ce13b16efe90c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d273748c-46a6-4d1b-b27f-8aa8663a74f0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d273748c-46a6-4d1b-b27f-8aa8663a74f0",
  "created_at": "2026-10-28T10:24:47.62197Z",
  "expires_at": "2026-10-28T10:54:47.62197Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/d273748c-46a6-4d1b-b27f-8aa8663a74f0` → **200**

```json
{
  "id": "d273748c-46a6-4d1b-b27f-8aa8663a74f0",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T10:24:47.62197Z",
  "expires_at": "2026-10-28T10:54:47.62197Z",
  "completed_at": "2026-10-28T10:24:47.844269Z",
  "masked_pan": "41****7167",
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
      "id": "f9ce2b8c-fe74-4fcc-8053-8b09fefcc4e9",
      "at": "2026-10-28T10:24:47.878277Z",
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
  "command_id": "262fedaf-c1a3-4a5a-bd6e-a825b053d26c",
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
  "correlation_id": "bf1c17aa-a0e1-4401-ab7c-e5dcfb73419a"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672393190",
  "device_ref": "sandbox-30619"
}
```

```json
{
  "challenge_id": "840d58fe-160f-4c6b-b131-009d8b12ebc0",
  "expires_at": "2026-10-28T10:29:48.528927658Z",
  "resend_available_at": "2026-10-28T10:24:49.528927658Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672393190` → **200**

```json
{
  "phone": "+380672393190",
  "audience": "CLIENT",
  "code": "742921",
  "sent_at": "2026-10-28T10:24:48.531435716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "840d58fe-160f-4c6b-b131-009d8b12ebc0",
  "code": "742921",
  "device_ref": "sandbox-30619"
}
```

```json
{
  "session_id": "5f3c6087-ddee-4fcb-b4cc-f7888663bda7",
  "subject": {
    "type": "CLIENT",
    "id": "bb869232-ebea-4180-9228-7acbb9f2ad8e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYjg2OTIzMi1lYmVhLTQxODAtOTIyOC03YWNiYjlmMmFkOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzOTg4LCJpYXQiOjE3OTMxODMwODgsImp0aSI6IjI5MGU2NWQ4LTk1NGYtNDhkMy1iMWNmLWY4NWQ2MGNjZWU0YSIsInNpZCI6IjVmM2M2MDg3LWRkZWUtNGZjYi1iNGNjLWY3ODg4NjYzYmRhNyJ9.RvmYzJvN8WZJvvNToimwknoTryP6WvB6F0-nYgWp5D8",
  "access_expires_at": "2026-10-28T10:39:48.76807015Z",
  "refresh_token": "_hDBKnREIdt8owrZR-3SiTrmJ1vCEd93rWOSfX4ztk4",
  "refresh_expires_at": "2026-11-27T10:24:48.767455593Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bb869232-ebea-4180-9228-7acbb9f2ad8e",
  "session_id": "5f3c6087-ddee-4fcb-b4cc-f7888663bda7",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "59368eac-8077-45ed-b6d2-3670ff70c4fa",
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
  "id": "296aede6-0365-4b28-9486-e78a369ac25b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:29:49.198892Z",
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
  "challenge_id": "f03d525f-9628-42d9-9d54-ea5314488816",
  "expires_at": "2026-10-28T10:29:51.423200301Z",
  "resend_available_at": "2026-10-28T10:24:52.423200301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672393190` → **200**

```json
{
  "phone": "+380672393190",
  "audience": "CLIENT",
  "code": "666438",
  "sent_at": "2026-10-28T10:24:51.425831208Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "727baa57-dcbf-4738-a3c1-d4728fe5da73",
  "challenge_id": "f03d525f-9628-42d9-9d54-ea5314488816",
  "otp_code": "666438"
}
```

```json
{
  "client_id": "bb869232-ebea-4180-9228-7acbb9f2ad8e",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T10:24:51.671378118Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "72a95218-72f3-4537-819b-a61a51502a46",
  "quote_id": "296aede6-0365-4b28-9486-e78a369ac25b",
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
  "correlation_id": "5d60ea37-3c1b-4136-be81-b3cb49b97815"
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
  "session_id": "d7bf2dc7-3275-4a81-a336-3a71dc14498a",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM5OTIsImlhdCI6MTc5MzE4MzA5MiwianRpIjoiZTNiYzk1MzktOWFkOS00NzkyLWI1MjUtZjA3YWY1MThkYmQ4Iiwic2lkIjoiZDdiZjJkYzctMzI3NS00YTgxLWEzMzYtM2E3MWRjMTQ0OThhIn0.v3HLeGAmkljB9kO4lHYeWqCUsQZ86lDaap44fixgPak",
  "access_expires_at": "2026-10-28T10:39:52.380844783Z",
  "refresh_token": "U6ADU-6ZbpTuyB7D1Gddy0Av7Pa9YIgHQOVc9ruAjj8",
  "refresh_expires_at": "2026-10-28T22:24:52.380280724Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "bb869232-ebea-4180-9228-7acbb9f2ad8e",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T10:24:51.671378Z",
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

`POST /api/admin/v1/client-deletions/bb869232-ebea-4180-9228-7acbb9f2ad8e/complete` → **200**

```json
{
  "command_id": "51d856d4-5e9a-4913-84d2-d4b4d3793b2f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "bb869232-ebea-4180-9228-7acbb9f2ad8e",
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
  "correlation_id": "69a5fa28-8736-4b56-aa7c-b1905f0135dd"
}
```

Done: client bb869232-ebea-4180-9228-7acbb9f2ad8e anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661666132",
  "device_ref": "sandbox-3565"
}
```

```json
{
  "challenge_id": "9ba9aa41-bc5c-4619-9506-d4f310e07a8a",
  "expires_at": "2026-10-28T10:29:53.27833831Z",
  "resend_available_at": "2026-10-28T10:24:54.27833831Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661666132` → **200**

```json
{
  "phone": "+380661666132",
  "audience": "CLIENT",
  "code": "106161",
  "sent_at": "2026-10-28T10:24:53.280800589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ba9aa41-bc5c-4619-9506-d4f310e07a8a",
  "code": "106161",
  "device_ref": "sandbox-3565"
}
```

```json
{
  "session_id": "43c6f1b7-8b5d-4d04-ab6d-df75f5520fdf",
  "subject": {
    "type": "CLIENT",
    "id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOWVhZjRhNC00OTM0LTQ3MWEtOTgwYS02ZjAxZWY3ZjFjMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTgzOTkzLCJpYXQiOjE3OTMxODMwOTMsImp0aSI6ImQ3YTIzZDAyLTcwNmMtNDNlYy04NzA1LWYxNmU5ZDFhMGY3NiIsInNpZCI6IjQzYzZmMWI3LThiNWQtNGQwNC1hYjZkLWRmNzVmNTUyMGZkZiJ9.J1ZLPTJPk5yvEnGhEydkJ6kRBTFQQ06JoHEyYMJdxmc",
  "access_expires_at": "2026-10-28T10:39:53.514956506Z",
  "refresh_token": "Aa2qDJeFDSDKLu4Dlj_sfbFlklIByoXt-7Fd024bD-c",
  "refresh_expires_at": "2026-11-27T10:24:53.514438092Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a",
  "session_id": "43c6f1b7-8b5d-4d04-ab6d-df75f5520fdf",
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
  "session_id": "0dd116eb-6c77-4f90-b2f7-73b5822d4c4d",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODM5OTQsImlhdCI6MTc5MzE4MzA5NCwianRpIjoiNDlkODJjMGEtZjk3ZC00OTU0LWFhOTMtYTkyMzJkZTQ3YjgwIiwic2lkIjoiMGRkMTE2ZWItNmM3Ny00ZjkwLWIyZjctNzNiNTgyMmQ0YzRkIn0.2HNzs-9ulvivoPduFUsUTKl4dvheNN9GRPz0XkVg_SQ",
  "access_expires_at": "2026-10-28T10:39:54.212700934Z",
  "refresh_token": "3zzNuQQxoHvLMEt6vNSlBH4F1EtC0CTZRN2ZM77-hZU",
  "refresh_expires_at": "2026-10-28T22:24:54.212164433Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1666132&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a",
      "phone": "+380661666132",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T10:24:53.512572Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/b9eaf4a4-4934-471a-980a-6f01ef7f1c0a` → **200**

```json
{
  "client": {
    "id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a",
    "phone": "+380661666132",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T10:24:53.512572Z",
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

`POST /api/admin/v1/clients/b9eaf4a4-4934-471a-980a-6f01ef7f1c0a/block` → **400**

```json
{
  "command_id": "d8fc6a65-053c-4088-8d69-64569fa1fd39",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b9eaf4a4-4934-471a-980a-6f01ef7f1c0a/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "579fcc7b-b4f2-449a-9313-f27f14878b26",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/b9eaf4a4-4934-471a-980a-6f01ef7f1c0a/block` → **200**

```json
{
  "command_id": "00550195-1a6a-4b98-85c3-2d8f709a4bbc",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a",
  "phone": "+380661666132",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T10:24:53.512572Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T10:24:55.148815Z",
    "by": "a9faa988-63c8-49e7-a33f-3d7514625d14"
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
  "correlation_id": "02edb54c-9836-4f7e-b259-c919f9380060"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661666132",
  "device_ref": "sandbox-11420"
}
```

```json
{
  "challenge_id": "41fd72c5-aa7e-4129-8dd7-952f1e3637e0",
  "expires_at": "2026-10-28T10:29:57.607708178Z",
  "resend_available_at": "2026-10-28T10:24:58.607708178Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661666132` → **200**

```json
{
  "phone": "+380661666132",
  "audience": "CLIENT",
  "code": "384593",
  "sent_at": "2026-10-28T10:24:57.609977348Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "41fd72c5-aa7e-4129-8dd7-952f1e3637e0",
  "code": "384593",
  "device_ref": "sandbox-11420"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "eaedb16a-146d-437b-91b4-193d26f6e7e4"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/b9eaf4a4-4934-471a-980a-6f01ef7f1c0a` → **200**

```json
{
  "client": {
    "id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a",
    "phone": "+380661666132",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T10:24:53.512572Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T10:24:55.148815Z",
      "by": "a9faa988-63c8-49e7-a33f-3d7514625d14"
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

`POST /api/admin/v1/clients/b9eaf4a4-4934-471a-980a-6f01ef7f1c0a/unblock` → **200**

```json
{
  "command_id": "3460e363-79f1-45e7-9af3-625d9d79beaa",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a",
  "phone": "+380661666132",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T10:24:53.512572Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661666132",
  "device_ref": "sandbox-24398"
}
```

```json
{
  "challenge_id": "4fe650e2-2e42-46d6-b658-90a1c18d4ffd",
  "expires_at": "2026-10-28T10:30:00.542218244Z",
  "resend_available_at": "2026-10-28T10:25:01.542218244Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661666132` → **200**

```json
{
  "phone": "+380661666132",
  "audience": "CLIENT",
  "code": "507424",
  "sent_at": "2026-10-28T10:25:00.544530273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fe650e2-2e42-46d6-b658-90a1c18d4ffd",
  "code": "507424",
  "device_ref": "sandbox-24398"
}
```

```json
{
  "session_id": "d52cb8c1-9e2d-497a-9fcd-b6163733c44f",
  "subject": {
    "type": "CLIENT",
    "id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOWVhZjRhNC00OTM0LTQ3MWEtOTgwYS02ZjAxZWY3ZjFjMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDAwLCJpYXQiOjE3OTMxODMxMDAsImp0aSI6ImE0ZjA5ZTgyLTdiM2YtNGNkOC1iMDRhLTExNjU0YzA4NjE0NiIsInNpZCI6ImQ1MmNiOGMxLTllMmQtNDk3YS05ZmNkLWI2MTYzNzMzYzQ0ZiJ9.QOuPs_ag6zGucbeCS7Qu2fqPz0aCgYmiKYYkGLjXwO0",
  "access_expires_at": "2026-10-28T10:40:00.779940561Z",
  "refresh_token": "xeUG0dKhsSAIh3DzT5IDpZSi0wFDk65Q7qQnvfwJZZg",
  "refresh_expires_at": "2026-11-27T10:25:00.779314267Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b9eaf4a4-4934-471a-980a-6f01ef7f1c0a",
  "session_id": "d52cb8c1-9e2d-497a-9fcd-b6163733c44f",
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
  "phone": "+380660397764",
  "device_ref": "sandbox-30776"
}
```

```json
{
  "challenge_id": "d14f4c61-1392-484c-86fd-e3fb44569817",
  "expires_at": "2026-10-28T10:30:01.216437328Z",
  "resend_available_at": "2026-10-28T10:25:02.216437328Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660397764` → **200**

```json
{
  "phone": "+380660397764",
  "audience": "CLIENT",
  "code": "507857",
  "sent_at": "2026-10-28T10:25:01.218723913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d14f4c61-1392-484c-86fd-e3fb44569817",
  "code": "507857",
  "device_ref": "sandbox-30776"
}
```

```json
{
  "session_id": "65a1da0c-fbf1-49c0-b237-18bd6742c757",
  "subject": {
    "type": "CLIENT",
    "id": "6a207097-df22-4096-9994-ddc7f77e0161"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTIwNzA5Ny1kZjIyLTQwOTYtOTk5NC1kZGM3Zjc3ZTAxNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDAxLCJpYXQiOjE3OTMxODMxMDEsImp0aSI6IjliZmRkNzhmLWY0NzYtNDE2Zi1iZGQ5LTk0YmMwNjdmYzcwYyIsInNpZCI6IjY1YTFkYTBjLWZiZjEtNDljMC1iMjM3LTE4YmQ2NzQyYzc1NyJ9.sJlcdD-7QKDnQG9JzAMgZptXPprQw-XyvBpxozbofzw",
  "access_expires_at": "2026-10-28T10:40:01.450383274Z",
  "refresh_token": "5b3gseUzCpXAKv3eti4CkFLXeDgPmz0WCou_6x8nmOM",
  "refresh_expires_at": "2026-11-27T10:25:01.449832937Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "de5a4978-cb60-4e6c-8672-46f4e4d6fa7e",
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
  "id": "082772f3-7c03-4b6c-bde6-1f32eae37867",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:01.668240Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 934f3705-5fd8-4ab3-8d2e-665e68a17872) → **201**

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
  "session_id": "5c85cbd5-84fa-4db1-8d76-17b0e40aaadf",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMDIsImlhdCI6MTc5MzE4MzEwMiwianRpIjoiNmQwNzBhNzEtMDI0Ni00OGRjLWE1MzMtYjQ1MWM3YjE5NDQ0Iiwic2lkIjoiNWM4NWNiZDUtODRmYS00ZGIxLThkNzYtMTdiMGU0MGFhYWRmIn0.FC1juQOWds-JDt74TvsrKqn9KFR7RgBdDkZbxFG7IZM",
  "access_expires_at": "2026-10-28T10:40:02.200000459Z",
  "refresh_token": "X1SOeyzhIFyxizIzWurCrljgOS2gyPae4dKtGOWFufo",
  "refresh_expires_at": "2026-10-28T22:25:02.199406702Z",
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
  "session_id": "27f1ca3b-43d1-45e5-8129-6b0fcde63351",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMDIsImlhdCI6MTc5MzE4MzEwMiwianRpIjoiY2U2NTViMWUtNjI5ZC00ZjQyLWE2ZGMtY2VmMmM4NjYxZGFjIiwic2lkIjoiMjdmMWNhM2ItNDNkMS00NWU1LTgxMjktNmIwZmNkZTYzMzUxIn0.sRtrWvbCNAPsm5Xg_bbbR4ST3viDcsTvsAhQu6Fgmkc",
  "access_expires_at": "2026-10-28T10:40:02.691115452Z",
  "refresh_token": "JsFYil_DGxZuZ7ijMSQU7uiGnlkAoV3VQwbGBfKXgHc",
  "refresh_expires_at": "2026-10-28T22:25:02.690397842Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/37f36cd9-b316-451d-865d-cfe8ce486072/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:25:01.889707Z",
      "actor": {
        "type": "CLIENT",
        "id": "6a207097-df22-4096-9994-ddc7f77e0161",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "37f36cd9-b316-451d-865d-cfe8ce486072",
        "quote_id": "082772f3-7c03-4b6c-bde6-1f32eae37867",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "934f3705-5fd8-4ab3-8d2e-665e68a17872"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:25:01.891826Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "37f36cd9-b316-451d-865d-cfe8ce486072",
        "attempt_id": "a67fd575-4fe1-434f-8c9b-d782abef7a5a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "934f3705-5fd8-4ab3-8d2e-665e68a17872"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T10:25:01.901374Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "37f36cd9-b316-451d-865d-cfe8ce486072",
        "attempt_id": "a67fd575-4fe1-434f-8c9b-d782abef7a5a"
      },
      "correlation_id": "934f3705-5fd8-4ab3-8d2e-665e68a17872"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "a67fd575-4fe1-434f-8c9b-d782abef7a5a",
        "generation": 1,
        "started_at": "2026-10-28T10:25:01.89066Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T10:25:01.901374Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T10:25:01.892732Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/934f3705-5fd8-4ab3-8d2e-665e68a17872` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "37f36cd9-b316-451d-865d-cfe8ce486072:0",
      "order_id": "37f36cd9-b316-451d-865d-cfe8ce486072",
      "at": "2026-10-28T10:25:01.889707Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "37f36cd9-b316-451d-865d-cfe8ce486072:1",
      "order_id": "37f36cd9-b316-451d-865d-cfe8ce486072",
      "at": "2026-10-28T10:25:01.891826Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "37f36cd9-b316-451d-865d-cfe8ce486072:2",
      "order_id": "37f36cd9-b316-451d-865d-cfe8ce486072",
      "at": "2026-10-28T10:25:01.901374Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/04af5c29-9dc8-4181-9d31-a52a9d28dc16` → **200**

```json
{
  "found": []
}
```

Done: request 934f3705-5fd8-4ab3-8d2e-665e68a17872 — order 37f36cd9-b316-451d-865d-cfe8ce486072 found by its id.

`GET /api/rider/v1/orders/37f36cd9-b316-451d-865d-cfe8ce486072` → **200**

```json
{
  "id": "37f36cd9-b316-451d-865d-cfe8ce486072",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6a207097-df22-4096-9994-ddc7f77e0161",
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
  "created_at": "2026-10-28T10:25:01.889117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/37f36cd9-b316-451d-865d-cfe8ce486072/cancel` → **200**

```json
{
  "command_id": "a23d8cb5-890b-4f41-9a57-5b5833a221fb",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "37f36cd9-b316-451d-865d-cfe8ce486072",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6a207097-df22-4096-9994-ddc7f77e0161",
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
  "created_at": "2026-10-28T10:25:01.889117Z",
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
  "phone": "+380635630424",
  "device_ref": "sandbox-21210"
}
```

```json
{
  "challenge_id": "56336bad-9708-41bd-8933-09aad76fdd39",
  "expires_at": "2026-10-28T10:30:04.038986764Z",
  "resend_available_at": "2026-10-28T10:25:05.038986764Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635630424` → **200**

```json
{
  "phone": "+380635630424",
  "audience": "CLIENT",
  "code": "372643",
  "sent_at": "2026-10-28T10:25:04.041999238Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56336bad-9708-41bd-8933-09aad76fdd39",
  "code": "372643",
  "device_ref": "sandbox-21210"
}
```

```json
{
  "session_id": "4d196cdf-89d4-4c63-b331-2d0b3a838316",
  "subject": {
    "type": "CLIENT",
    "id": "70af9a7b-c9a7-487b-b341-21937d9d3a28"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MGFmOWE3Yi1jOWE3LTQ4N2ItYjM0MS0yMTkzN2Q5ZDNhMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDA0LCJpYXQiOjE3OTMxODMxMDQsImp0aSI6IjUwYTUxZjhkLWYzOGQtNGU1Ni04YzlkLTJmMzc2M2Y4MjI3OSIsInNpZCI6IjRkMTk2Y2RmLTg5ZDQtNGM2My1iMzMxLTJkMGIzYTgzODMxNiJ9.KKyCr-HqS4_vR_1eliG3_2XGcCqOxN2so4n0blWvyKc",
  "access_expires_at": "2026-10-28T10:40:04.28234199Z",
  "refresh_token": "k2IRmo9WG84DWmhzPNwHFhzDk9_P0Lr74xFgbdJcF-A",
  "refresh_expires_at": "2026-11-27T10:25:04.28184328Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "0b51c235-0844-4f1e-9b13-cdab5e42dc86",
  "expires_at": "2026-10-28T10:30:06.496894657Z",
  "resend_available_at": "2026-10-28T10:25:07.496894657Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635630424` → **200**

```json
{
  "phone": "+380635630424",
  "audience": "CLIENT",
  "code": "558010",
  "sent_at": "2026-10-28T10:25:06.49884958Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "f279c041-a1da-4821-ab1c-ab0e0733df8f",
  "challenge_id": "0b51c235-0844-4f1e-9b13-cdab5e42dc86",
  "otp_code": "558010"
}
```

```json
{
  "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
  "state": "PENDING",
  "created_at": "2026-10-28T10:25:06.732058Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f` → **200**

```json
{
  "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
  "state": "PENDING",
  "created_at": "2026-10-28T10:25:06.732058Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f` → **200**

```json
{
  "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
  "state": "PENDING",
  "created_at": "2026-10-28T10:25:06.732058Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f` → **200**

```json
{
  "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
  "state": "PENDING",
  "created_at": "2026-10-28T10:25:06.732058Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f` → **200**

```json
{
  "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
  "state": "PENDING",
  "created_at": "2026-10-28T10:25:06.732058Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f` → **200**

```json
{
  "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
  "state": "PENDING",
  "created_at": "2026-10-28T10:25:06.732058Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f` → **200**

```json
{
  "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
  "state": "PENDING",
  "created_at": "2026-10-28T10:25:06.732058Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f` → **200**

```json
{
  "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
  "state": "READY",
  "created_at": "2026-10-28T10:25:06.732058Z",
  "ready_at": "2026-10-28T10:25:13.424197Z",
  "expires_at": "2026-11-04T10:25:13.424197Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634491584",
  "device_ref": "sandbox-14483"
}
```

```json
{
  "challenge_id": "d4726dea-2495-47dc-a7fd-880c89c51ab8",
  "expires_at": "2026-10-28T10:30:14.451766464Z",
  "resend_available_at": "2026-10-28T10:25:15.451766464Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634491584` → **200**

```json
{
  "phone": "+380634491584",
  "audience": "CLIENT",
  "code": "766064",
  "sent_at": "2026-10-28T10:25:14.454312789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4726dea-2495-47dc-a7fd-880c89c51ab8",
  "code": "766064",
  "device_ref": "sandbox-14483"
}
```

```json
{
  "session_id": "42ab2fa9-3b53-4be5-a2f3-823ead902ab0",
  "subject": {
    "type": "CLIENT",
    "id": "7273729d-d377-4682-91ea-04e53fe97071"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjczNzI5ZC1kMzc3LTQ2ODItOTFlYS0wNGU1M2ZlOTcwNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDE0LCJpYXQiOjE3OTMxODMxMTQsImp0aSI6IjkxY2NlNmY1LWM5MmMtNDU5NS1iMzRhLTZiMjY2MTVkZmM2YSIsInNpZCI6IjQyYWIyZmE5LTNiNTMtNGJlNS1hMmYzLTgyM2VhZDkwMmFiMCJ9.l6flT8J2orJIRu4OeRoK3QVrXlWwGoNVOYrT1BW_wu4",
  "access_expires_at": "2026-10-28T10:40:14.694378073Z",
  "refresh_token": "kxckGvw6HRrgMC-6McBFpbtMC5nbQclzDuxEmxPddG0",
  "refresh_expires_at": "2026-11-27T10:25:14.69387501Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/a42baa82-0efa-4afe-91aa-4741c541e41f/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "206af147-8358-4dce-b48e-69adbd5da4ae"
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
  "session_id": "def8d17b-6aa0-496c-a4d3-264f79222940",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMTUsImlhdCI6MTc5MzE4MzExNSwianRpIjoiYmFkZDVkNGUtMzA4OC00NDFiLTllODEtZjIwNzY0YTQyNWE1Iiwic2lkIjoiZGVmOGQxN2ItNmFhMC00OTZjLWE0ZDMtMjY0Zjc5MjIyOTQwIn0.vxuGobzdBoIfjvPk1sWkWOuSc0tXoZpaO5-o9F8-Ygs",
  "access_expires_at": "2026-10-28T10:40:15.393502767Z",
  "refresh_token": "JT_4-9Gl7VaMGOA1cp_-fjuGXggd-J14ByhR5vPGtYk",
  "refresh_expires_at": "2026-10-28T22:25:15.392797526Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "70af9a7b-c9a7-487b-b341-21937d9d3a28",
  "session_id": "4d196cdf-89d4-4c63-b331-2d0b3a838316",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/70af9a7b-c9a7-487b-b341-21937d9d3a28/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "a42baa82-0efa-4afe-91aa-4741c541e41f",
      "state": "READY",
      "created_at": "2026-10-28T10:25:06.732058Z",
      "ready_at": "2026-10-28T10:25:13.424197Z",
      "expires_at": "2026-11-04T10:25:13.424197Z",
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
  "device_ref": "sandbox-7661"
}
```

```json
{
  "challenge_id": "42e0f24f-0ded-4666-bb97-ad12451e9958",
  "expires_at": "2026-10-28T10:30:16.047164753Z",
  "resend_available_at": "2026-10-28T10:25:17.047164753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "723561",
  "sent_at": "2026-10-28T10:25:16.049186638Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42e0f24f-0ded-4666-bb97-ad12451e9958",
  "code": "723561",
  "device_ref": "sandbox-7661"
}
```

```json
{
  "session_id": "03db45c5-97a3-406e-8be1-5f9d46d36ac1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDAxNiwiaWF0IjoxNzkzMTgzMTE2LCJqdGkiOiIxM2Y4YTU1Zi1mYjUwLTQxNTgtOTkwOS02MTk2OTZjNGJjMGIiLCJzaWQiOiIwM2RiNDVjNS05N2EzLTQwNmUtOGJlMS01ZjlkNDZkMzZhYzEifQ.m4iUO45j5DxCgV_OtZoMm_WVrZxCGSRHqS8yWoNo058",
  "access_expires_at": "2026-10-28T10:40:16.273572903Z",
  "refresh_token": "wEI_XAxznXai2Ra6x9izKmmpS6PDZD4ahfnEYJONWQ4",
  "refresh_expires_at": "2026-11-27T10:25:16.272885443Z",
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
  "device_ref": "sandbox-17597"
}
```

```json
{
  "challenge_id": "5a090899-9580-4810-bdcc-5b68d1f848ea",
  "expires_at": "2026-10-28T10:30:16.691380238Z",
  "resend_available_at": "2026-10-28T10:25:17.691380238Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "587402",
  "sent_at": "2026-10-28T10:25:16.693600697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a090899-9580-4810-bdcc-5b68d1f848ea",
  "code": "587402",
  "device_ref": "sandbox-17597"
}
```

```json
{
  "session_id": "16127ffb-12ea-4bc2-bb4b-2e6408fd45ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDAxNiwiaWF0IjoxNzkzMTgzMTE2LCJqdGkiOiJmMDZhYTg3Mi02ZjJkLTQwMTgtYTk1OS00MTcwZDQ1NGYyMjEiLCJzaWQiOiIxNjEyN2ZmYi0xMmVhLTRiYzItYmI0Yi0yZTY0MDhmZDQ1Y2EifQ.aQuZEgLZ6J2Gzm8QYh_YtK1ctYnSNPsnf0k_hQUEx78",
  "access_expires_at": "2026-10-28T10:40:16.922794695Z",
  "refresh_token": "4vziUJJnZR9hKHXsxYCajxAzybq1j8Q76j12q5Zzxfc",
  "refresh_expires_at": "2026-11-27T10:25:16.922214736Z",
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
  "command_id": "9c3e275b-f784-4d33-9d0d-759dd4c68be0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:17Z",
    "sequence": 1793183117336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1b1d99e6-dd7e-4aa6-bd23-ddd5799e153b",
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
  "last_heartbeat_at": "2026-10-28T10:25:17.351529Z",
  "last_location_at": "2026-10-28T10:25:17.351529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-16721"
}
```

```json
{
  "challenge_id": "1c222509-8a2c-4240-8e3f-eb4ee519f91a",
  "expires_at": "2026-10-28T10:30:17.569617226Z",
  "resend_available_at": "2026-10-28T10:25:18.569617226Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "038937",
  "sent_at": "2026-10-28T10:25:17.572435139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c222509-8a2c-4240-8e3f-eb4ee519f91a",
  "code": "038937",
  "device_ref": "sandbox-16721"
}
```

```json
{
  "session_id": "45e7f6bf-e8fc-462a-846a-b046fddce21d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDAxNywiaWF0IjoxNzkzMTgzMTE3LCJqdGkiOiIzYzE4YWQzNy0yZGRiLTQxOGUtYTQ0Zi1jMjdjY2I0ZDE4OWYiLCJzaWQiOiI0NWU3ZjZiZi1lOGZjLTQ2MmEtODQ2YS1iMDQ2ZmRkY2UyMWQifQ.VRjiTcxKwKzG3UV_GBmzMT6D8FRkE5ILB0abv4JSilE",
  "access_expires_at": "2026-10-28T10:40:17.805910334Z",
  "refresh_token": "mNf8S2sQjzCgaRUAEEoeGXkTgu-yQcLIIBMEg5DP2lQ",
  "refresh_expires_at": "2026-11-27T10:25:17.805315386Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e6c6c4b-88a2-4367-a10b-f60ddd23be1f",
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
  "last_heartbeat_at": "2026-10-28T10:24:30.04354Z",
  "last_location_at": "2026-10-28T10:24:30.04354Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8e6c6c4b-88a2-4367-a10b-f60ddd23be1f/handover` → **200**

```json
{
  "command_id": "bf2229d6-c619-4334-ab34-37f68ec9790b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e6c6c4b-88a2-4367-a10b-f60ddd23be1f",
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
  "last_heartbeat_at": "2026-10-28T10:24:30.04354Z",
  "last_location_at": "2026-10-28T10:24:30.04354Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8e6c6c4b-88a2-4367-a10b-f60ddd23be1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:18Z",
    "sequence": 1793183118441
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e6c6c4b-88a2-4367-a10b-f60ddd23be1f",
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
  "last_heartbeat_at": "2026-10-28T10:25:18.457024Z",
  "last_location_at": "2026-10-28T10:25:18.457024Z",
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
  "session_id": "d4a50450-2d2e-4b21-8eb7-2b0b4438a8e9",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMTgsImlhdCI6MTc5MzE4MzExOCwianRpIjoiMDI5YzM2MjItYWMxMC00ZTM2LThiNDQtNWY3NzI1NTFjMmFhIiwic2lkIjoiZDRhNTA0NTAtMmQyZS00YjIxLThlYjctMmIwYjQ0MzhhOGU5In0.Po0IdEcDmUJkmR33s41n45uYIsEpbFWARg9n1k3PfoA",
  "access_expires_at": "2026-10-28T10:40:18.946787313Z",
  "refresh_token": "LhKcJP4UHhTtGnW2K33mxPHNxaFqO7YwQGZffaegGQM",
  "refresh_expires_at": "2026-10-28T22:25:18.946164003Z",
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
  "session_id": "68a39f63-359f-4b21-b3c2-9af9f0a38920",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMTksImlhdCI6MTc5MzE4MzExOSwianRpIjoiOGFiM2Y0YTktNGE1My00MGQxLWFhNjQtZjhjZTMyOGVmOGE5Iiwic2lkIjoiNjhhMzlmNjMtMzU5Zi00YjIxLWIzYzItOWFmOWYwYTM4OTIwIn0.osTEuO4__7XuAE3oW8CGEFOtqEGp_0vpCTiup0GbYME",
  "access_expires_at": "2026-10-28T10:40:19.436978453Z",
  "refresh_token": "9w_NlJb4hsPEEWtaZXyBanwn7w5KhKGlGJ5kva-VFMQ",
  "refresh_expires_at": "2026-10-28T22:25:19.436286718Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688988762",
  "device_ref": "sandbox-4509"
}
```

```json
{
  "challenge_id": "eff6343b-4f5c-4f17-8e89-d9742114bf7f",
  "expires_at": "2026-10-28T10:30:19.650094089Z",
  "resend_available_at": "2026-10-28T10:25:20.650094089Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688988762` → **200**

```json
{
  "phone": "+380688988762",
  "audience": "CLIENT",
  "code": "065264",
  "sent_at": "2026-10-28T10:25:19.652402018Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eff6343b-4f5c-4f17-8e89-d9742114bf7f",
  "code": "065264",
  "device_ref": "sandbox-4509"
}
```

```json
{
  "session_id": "7ee37467-66fc-4a68-ab37-242cd92ea63e",
  "subject": {
    "type": "CLIENT",
    "id": "b565e657-1f86-4742-bdfb-36691097e723"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTY1ZTY1Ny0xZjg2LTQ3NDItYmRmYi0zNjY5MTA5N2U3MjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDE5LCJpYXQiOjE3OTMxODMxMTksImp0aSI6ImMwNzBiZmQ4LTAxM2ItNDc3OS1hYjQ4LTk4NmU5YzIxNmRmMCIsInNpZCI6IjdlZTM3NDY3LTY2ZmMtNGE2OC1hYjM3LTI0MmNkOTJlYTYzZSJ9.hb2OmKMFHUu1Yr1QOXvq9ciYekn4Xfe7W4hiFbJfX-s",
  "access_expires_at": "2026-10-28T10:40:19.885505553Z",
  "refresh_token": "CPLCUOVsCitqHSqhfG6W7hEMp43z5Cr9o3vfr4S8JR0",
  "refresh_expires_at": "2026-11-27T10:25:19.884888085Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b00f8f8-e662-43ec-90cf-0e47b85fba99",
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
  "id": "f90d9ad9-cf17-4828-8590-fed3b23952c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:20.105918Z",
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
  "command_id": "60fc3a5f-bfe6-483f-a441-7185a8c99517",
  "quote_id": "f90d9ad9-cf17-4828-8590-fed3b23952c4",
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
  "id": "ba70b461-6186-4390-9a39-517f968667c4",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b565e657-1f86-4742-bdfb-36691097e723",
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
  "created_at": "2026-10-28T10:25:20.337147Z",
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
    "id": "feda8a86-7e4a-4c4d-a29e-d1da5e1b4fbb",
    "order_id": "ba70b461-6186-4390-9a39-517f968667c4",
    "expires_at": "2026-10-28T10:25:35.340609Z",
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

`POST /api/driver/v1/offers/feda8a86-7e4a-4c4d-a29e-d1da5e1b4fbb/reject` → **204**

```json
{
  "command_id": "cfed18cd-6c2b-4530-aba8-5bb82f6a4a4c"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "b4a8494b-9123-425d-8dbf-2992ca40c46e",
    "order_id": "ba70b461-6186-4390-9a39-517f968667c4",
    "expires_at": "2026-10-28T10:25:35.810934Z",
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

`POST /api/driver/v1/offers/b4a8494b-9123-425d-8dbf-2992ca40c46e/accept` → **200**

```json
{
  "command_id": "5b5a5655-3e96-4b3d-a237-f11f8e716fa3"
}
```

```json
{
  "id": "e275da39-900f-4942-bf72-945aa823ca49",
  "order_id": "ba70b461-6186-4390-9a39-517f968667c4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "588ad839-9613-4ea6-a165-a733924b14c8",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/ba70b461-6186-4390-9a39-517f968667c4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:25:20.337771Z",
      "actor": {
        "type": "CLIENT",
        "id": "b565e657-1f86-4742-bdfb-36691097e723",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ba70b461-6186-4390-9a39-517f968667c4",
        "quote_id": "f90d9ad9-cf17-4828-8590-fed3b23952c4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4e51a902-78bb-430b-8fdc-508f7be01bfe"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:25:20.339735Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ba70b461-6186-4390-9a39-517f968667c4",
        "attempt_id": "6422c057-9232-4236-b4cb-81526655e373",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4e51a902-78bb-430b-8fdc-508f7be01bfe"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:25:20.346337Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "feda8a86-7e4a-4c4d-a29e-d1da5e1b4fbb",
        "order_id": "ba70b461-6186-4390-9a39-517f968667c4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "4e51a902-78bb-430b-8fdc-508f7be01bfe"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T10:25:20.809758Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "feda8a86-7e4a-4c4d-a29e-d1da5e1b4fbb",
        "order_id": "ba70b461-6186-4390-9a39-517f968667c4"
      },
      "correlation_id": "e0646a5e-e92a-4298-93f8-1a2ab05c0d51"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order ba70b461-6186-4390-9a39-517f968667c4 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/ba70b461-6186-4390-9a39-517f968667c4` → **200**

```json
{
  "id": "ba70b461-6186-4390-9a39-517f968667c4",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b565e657-1f86-4742-bdfb-36691097e723",
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
    "id": "e275da39-900f-4942-bf72-945aa823ca49",
    "order_id": "ba70b461-6186-4390-9a39-517f968667c4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "588ad839-9613-4ea6-a165-a733924b14c8",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:25:20.337147Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ba70b461-6186-4390-9a39-517f968667c4/cancel` → **200**

```json
{
  "command_id": "2d8024eb-bccb-4549-9cdc-4df163deab2e",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ba70b461-6186-4390-9a39-517f968667c4",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b565e657-1f86-4742-bdfb-36691097e723",
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
    "id": "e275da39-900f-4942-bf72-945aa823ca49",
    "order_id": "ba70b461-6186-4390-9a39-517f968667c4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "588ad839-9613-4ea6-a165-a733924b14c8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:25:20.337147Z",
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
  "session_id": "1b1d99e6-dd7e-4aa6-bd23-ddd5799e153b",
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
  "last_heartbeat_at": "2026-10-28T10:25:17.351529Z",
  "last_location_at": "2026-10-28T10:25:17.351529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1b1d99e6-dd7e-4aa6-bd23-ddd5799e153b/close` → **200**

```json
{
  "command_id": "81617927-1664-44cf-836d-ca163396073e",
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
  "session_id": "8e6c6c4b-88a2-4367-a10b-f60ddd23be1f",
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
  "last_heartbeat_at": "2026-10-28T10:25:18.457024Z",
  "last_location_at": "2026-10-28T10:25:18.457024Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e6c6c4b-88a2-4367-a10b-f60ddd23be1f/close` → **200**

```json
{
  "command_id": "c01cfe4d-c407-4678-8310-9579d2e0d436",
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
  "device_ref": "sandbox-12162"
}
```

```json
{
  "challenge_id": "d370a4af-6598-4305-b05f-4f1af33816c4",
  "expires_at": "2026-10-28T10:30:23.103308156Z",
  "resend_available_at": "2026-10-28T10:25:24.103308156Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "431610",
  "sent_at": "2026-10-28T10:25:23.105536516Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d370a4af-6598-4305-b05f-4f1af33816c4",
  "code": "431610",
  "device_ref": "sandbox-12162"
}
```

```json
{
  "session_id": "517716cb-8985-471f-9663-1f2728638bb8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDAyMywiaWF0IjoxNzkzMTgzMTIzLCJqdGkiOiI5MTU0YTExYi1iMTUzLTQ5NzQtYmM0Ni0xMWYxNmQxYjJlYjUiLCJzaWQiOiI1MTc3MTZjYi04OTg1LTQ3MWYtOTY2My0xZjI3Mjg2MzhiYjgifQ.9dMyMfBJq-8aH3oAd2kg5QUyKwuCgwOndNHJZZ2fndQ",
  "access_expires_at": "2026-10-28T10:40:23.339796383Z",
  "refresh_token": "RmX1aurN3994vkblLnI6WpPAWWe84LHNgHNbmPI0D3g",
  "refresh_expires_at": "2026-11-27T10:25:23.339282961Z",
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
  "command_id": "18dfc91f-9401-4d47-82fe-b7198527471b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:23Z",
    "sequence": 1793183123759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:23.774383Z",
  "last_location_at": "2026-10-28T10:25:23.774383Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679630050",
  "device_ref": "sandbox-9630"
}
```

```json
{
  "challenge_id": "6e6268df-7759-4b27-b347-e9bcc8911a55",
  "expires_at": "2026-10-28T10:30:23.986638704Z",
  "resend_available_at": "2026-10-28T10:25:24.986638704Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679630050` → **200**

```json
{
  "phone": "+380679630050",
  "audience": "CLIENT",
  "code": "061275",
  "sent_at": "2026-10-28T10:25:23.989199982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e6268df-7759-4b27-b347-e9bcc8911a55",
  "code": "061275",
  "device_ref": "sandbox-9630"
}
```

```json
{
  "session_id": "ef48933d-6cf8-4d0c-b66a-729351e393c6",
  "subject": {
    "type": "CLIENT",
    "id": "a347d747-0c4f-4617-a543-a89438f0838d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzQ3ZDc0Ny0wYzRmLTQ2MTctYTU0My1hODk0MzhmMDgzOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDI0LCJpYXQiOjE3OTMxODMxMjQsImp0aSI6ImU5ODdjMjhiLWU2OTMtNGQ0Mi1hNGNjLWI4YjhiZWY0Zjk2MSIsInNpZCI6ImVmNDg5MzNkLTZjZjgtNGQwYy1iNjZhLTcyOTM1MWUzOTNjNiJ9.HsbIkfCBiQoal_SyGuAaRCWdqqR41mRqi7wPJ7eDKuY",
  "access_expires_at": "2026-10-28T10:40:24.221850902Z",
  "refresh_token": "5fVB5CR6tb_8oOw50FtyO1XLMCS64ILR6K0Adt6BUvw",
  "refresh_expires_at": "2026-11-27T10:25:24.221354514Z",
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
  "command_id": "4fa5bdf8-a5b2-440d-9be6-5e9b027026f3",
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
  "id": "aa2cd6d7-d518-4316-ac94-a001567268f5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:24.653846Z",
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
  "command_id": "cea47549-f7eb-45f9-9f80-4a71cda72a5e",
  "platform": "ANDROID",
  "token": "sandbox-driver-acb4ff7b-1fe0-47f7-bd81-046a387c11a7"
}
```

```json
{
  "id": "b0a75582-ea9c-4c28-a40d-625f5cceae41",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:25:24.887415Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b5347079-3a0c-494d-8d14-1ed97c2dc26f",
  "platform": "ANDROID",
  "token": "sandbox-rider-26da0f29-5d03-429c-97b4-da72eadebfc1"
}
```

```json
{
  "id": "5e1a8070-4e03-427a-8c81-dda73a7e450f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T10:25:25.103709Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "246e5481-ac64-4f98-b5e0-5e6da8828359",
  "quote_id": "aa2cd6d7-d518-4316-ac94-a001567268f5",
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
  "id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a347d747-0c4f-4617-a543-a89438f0838d",
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
  "created_at": "2026-10-28T10:25:25.332642Z",
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
    "id": "b76d2c65-7f8a-41f4-a106-78a3a47abce1",
    "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
    "expires_at": "2026-10-28T10:25:40.33572Z",
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

`POST /api/driver/v1/offers/b76d2c65-7f8a-41f4-a106-78a3a47abce1/accept` → **200**

```json
{
  "command_id": "fae7c6db-837d-4587-b4da-8118fe87b42f"
}
```

```json
{
  "id": "00a9a527-2200-4069-9f73-2aa40a294071",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0149b1d3-a7d7-437e-988c-5d0bb0b8bb41",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:25:25.311Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T10:25:25.311Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:25:26.619254042Z",
    "token_suffix": "7c11a7",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
      "order_version": "2",
      "event_id": "90e2efe1-92ca-4685-a877-b9a342f33d2f",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679630050&after=2026-10-28T10:25:25.311Z` → **200**

```json
[
  {
    "at": "2026-10-28T10:25:26.622304341Z",
    "token_suffix": "debfc1",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
      "order_version": "3",
      "event_id": "43201b6e-8903-4ccf-9659-f08cd639e4d7",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/61bed4ba-f1af-48ff-91dd-88f39102fabc/messages` → **201**

```json
{
  "command_id": "85d504c5-2541-4173-bd2d-18bf3cfbbcdf",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "3598823e-c6e0-4b19-ab0b-5709b6e1ed9e",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T10:25:27.101792474Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0149b1d3-a7d7-437e-988c-5d0bb0b8bb41",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "assignment_id": "00a9a527-2200-4069-9f73-2aa40a294071",
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

`POST /api/driver/v1/trips/0149b1d3-a7d7-437e-988c-5d0bb0b8bb41/messages` → **201**

```json
{
  "command_id": "650e2944-f274-4abc-a830-9c05de194172",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "d772719d-2f07-4a2c-a6a5-4b9801565f80",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T10:25:27.536075398Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/61bed4ba-f1af-48ff-91dd-88f39102fabc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/0149b1d3-a7d7-437e-988c-5d0bb0b8bb41/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679630050"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:28Z",
    "sequence": 1793183128185
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:28.200568Z",
  "last_location_at": "2026-10-28T10:25:28.200568Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0149b1d3-a7d7-437e-988c-5d0bb0b8bb41",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "assignment_id": "00a9a527-2200-4069-9f73-2aa40a294071",
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

`POST /api/driver/v1/trips/0149b1d3-a7d7-437e-988c-5d0bb0b8bb41/arrive` → **200**

```json
{
  "command_id": "b040869a-0ab6-4f2b-8c6e-53515d95d757",
  "expected_version": 0
}
```

```json
{
  "id": "0149b1d3-a7d7-437e-988c-5d0bb0b8bb41",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "assignment_id": "00a9a527-2200-4069-9f73-2aa40a294071",
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
  "arrived_at": "2026-10-28T10:25:28.640083Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0149b1d3-a7d7-437e-988c-5d0bb0b8bb41/start` → **200**

```json
{
  "command_id": "b317adde-eb6e-4029-b703-e1536a3e29d5",
  "expected_version": 1
}
```

```json
{
  "id": "0149b1d3-a7d7-437e-988c-5d0bb0b8bb41",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "assignment_id": "00a9a527-2200-4069-9f73-2aa40a294071",
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
  "arrived_at": "2026-10-28T10:25:28.640083Z",
  "started_at": "2026-10-28T10:25:28.861791Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:29Z",
    "sequence": 1793183129745
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:29.089862Z",
  "last_location_at": "2026-10-28T10:25:29.089862Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/0149b1d3-a7d7-437e-988c-5d0bb0b8bb41/complete` → **200**

```json
{
  "command_id": "cfd5c2b5-55b9-4022-8a98-b8b38889bbf5",
  "expected_version": 2,
  "reported_at": "2026-10-28T10:25:29Z",
  "cash_received": true
}
```

```json
{
  "id": "0149b1d3-a7d7-437e-988c-5d0bb0b8bb41",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "assignment_id": "00a9a527-2200-4069-9f73-2aa40a294071",
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
  "arrived_at": "2026-10-28T10:25:28.640083Z",
  "started_at": "2026-10-28T10:25:28.861791Z",
  "completed_at": "2026-10-28T10:25:29.311858Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/61bed4ba-f1af-48ff-91dd-88f39102fabc` → **200**

```json
{
  "id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a347d747-0c4f-4617-a543-a89438f0838d",
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
    "id": "00a9a527-2200-4069-9f73-2aa40a294071",
    "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0149b1d3-a7d7-437e-988c-5d0bb0b8bb41",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T10:25:25.332642Z",
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
    "id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T10:25:25.332642Z",
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
    "id": "0149b1d3-a7d7-437e-988c-5d0bb0b8bb41",
    "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
    "order_short_number": 7,
    "created_at": "2026-10-28T10:25:25.796966Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d8a83d82-21c0-49ec-910c-587700261f40",
    "order_id": "bd446456-2224-4c27-bdf4-6abb168b047e",
    "order_short_number": 1,
    "created_at": "2026-10-28T10:24:06.816413Z",
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

`GET /api/rider/v1/orders/61bed4ba-f1af-48ff-91dd-88f39102fabc/tip` → **200**

```json
{
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
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
  "available_until": "2026-10-29T10:25:29.311858Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/61bed4ba-f1af-48ff-91dd-88f39102fabc/tip` → **201**

```json
{
  "command_id": "f055d58c-ae51-4e18-a71c-f774f7d508d1",
  "amount_minor": 1100
}
```

```json
{
  "id": "a0ecf614-66d7-4ccb-86a5-d02beeb66676",
  "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T10:25:33.872573Z"
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
  "session_id": "1f4cdd9f-7992-4685-8960-58fd9400e6ba",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMzQsImlhdCI6MTc5MzE4MzEzNCwianRpIjoiYTVhYTYyOWUtZDBhOC00NjEyLTk0NGMtYTlhNmI2MzczOTMxIiwic2lkIjoiMWY0Y2RkOWYtNzk5Mi00Njg1LTg5NjAtNThmZDk0MDBlNmJhIn0.p0mDh6Usntp8s6YLmSNe2LuGljwWUBVATsy-X0N9CZo",
  "access_expires_at": "2026-10-28T10:40:34.37216418Z",
  "refresh_token": "jO2CqckVhBb0RQT6T0PREy-3zUzIWgePyD9TXlJJGEI",
  "refresh_expires_at": "2026-10-28T22:25:34.371417595Z",
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
          "RIDER": 2,
          "DRIVER": 1,
          "STAFF": 1
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
  "generated_at": "2026-10-28T10:25:34.589395867Z"
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
  "generated_at": "2026-10-28T10:25:34.814161502Z"
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
  "session_id": "750f03d2-254a-4adc-b08c-f01a9c71bbab",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMzUsImlhdCI6MTc5MzE4MzEzNSwianRpIjoiYjQ5MDFjZDctMjZhNC00NzE3LTgxZjgtOGZjNDgzOTUzNjM3Iiwic2lkIjoiNzUwZjAzZDItMjU0YS00YWRjLWIwOGMtZjAxYTljNzFiYmFiIn0.KHhjXah13nF-XGTfgZF6hVeWhcXfSKWQUq9IIiLWdh4",
  "access_expires_at": "2026-10-28T10:40:35.302605324Z",
  "refresh_token": "kWtSU_kbyT8TRSleC6Y1Cp_vzXqb3CnAeaaQdaHYttE",
  "refresh_expires_at": "2026-10-28T22:25:35.302011582Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/61bed4ba-f1af-48ff-91dd-88f39102fabc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T10:25:25.333193Z",
      "actor": {
        "type": "CLIENT",
        "id": "a347d747-0c4f-4617-a543-a89438f0838d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
        "quote_id": "aa2cd6d7-d518-4316-ac94-a001567268f5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0273f2ff-0d81-4b11-b9ed-9c6ac80925e8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T10:25:25.334943Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
        "attempt_id": "2ba99777-c714-4a8a-93ed-bcc1d988e71f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0273f2ff-0d81-4b11-b9ed-9c6ac80925e8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T10:25:25.34088Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b76d2c65-7f8a-41f4-a106-78a3a47abce1",
        "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "0273f2ff-0d81-4b11-b9ed-9c6ac80925e8"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T10:25:25.799284Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b76d2c65-7f8a-41f4-a106-78a3a47abce1",
        "order_id": "61bed4ba-f1af-48ff-91dd-88f39102fabc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "00a9a527-2200-4069-9f73-2aa40a294071"
      },
      "correlation_id": "c2edcc52-2818-4eb8-9777-23fc05edcf60"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T10:25:35.741292702Z",
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
      "last_location_at": "2026-10-28T10:25:29.089862Z",
      "order_id": null
    }
  ]
}
```

Done: order 61bed4ba-f1af-48ff-91dd-88f39102fabc.

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
  "session_id": "37d8d869-cf8c-44f6-8d9f-3a5a20694bb8",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMzYsImlhdCI6MTc5MzE4MzEzNiwianRpIjoiM2QwODZkZGEtZWM4YS00NGNiLWE0MGItNTAzOTM0NGRlYmZhIiwic2lkIjoiMzdkOGQ4NjktY2Y4Yy00NGY2LThkOWYtM2E1YTIwNjk0YmI4In0.jb8eJkZAD99CsBjDkrJN8_ekV7LHViB0ifWbX6vNJs0",
  "access_expires_at": "2026-10-28T10:40:36.254785601Z",
  "refresh_token": "EhQw5eHUTYXQ9TecwHff9QnqbvMLQEanFPr2J5aNo2M",
  "refresh_expires_at": "2026-10-28T22:25:36.254249063Z",
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
  "command_id": "05a9e5ca-2ef9-4b1c-9ed0-cc7b3937ca9b",
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
  "timestamp": "2026-10-28T10:25:36.000+0000",
  "channel": {
    "id": "1730052000.263752399",
    "linkedid": "1730052000.263752399",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672326201"
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
  "timestamp": "2026-10-28T10:25:36.000+0000",
  "channel": {
    "id": "1730052000.263752399",
    "linkedid": "1730052000.263752399",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672326201"
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
  "session_id": "3d759a8b-81ba-4e12-b66e-28c9d6e67600",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwMzcsImlhdCI6MTc5MzE4MzEzNywianRpIjoiYmVkOGE5OTItZDJiYS00MmU5LWFkYWEtOWZkYmJmOTgwM2VjIiwic2lkIjoiM2Q3NTlhOGItODFiYS00ZTEyLWI2NmUtMjhjOWQ2ZTY3NjAwIn0.kd5Chw_oJrIvAG6UM8SRO-YUGYhQKOxhBfCCjh7I8lA",
  "access_expires_at": "2026-10-28T10:40:37.20881152Z",
  "refresh_token": "BINJ7fMS9INh2iWnMeYFlFuYh6feT1D-q6X4wXcmeAA",
  "refresh_expires_at": "2026-10-28T22:25:37.208291978Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "2fbd8ad0-f79a-4abb-b68d-724193c2a8a6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672326201",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T10:25:36Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/2fbd8ad0-f79a-4abb-b68d-724193c2a8a6/answer` → **200**

```json
{
  "command_id": "cb2430cb-b06f-4bfe-90f8-9d339bf23b85"
}
```

```json
{
  "id": "2fbd8ad0-f79a-4abb-b68d-724193c2a8a6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672326201",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "order_ids": [],
  "started_at": "2026-10-28T10:25:36Z",
  "answered_at": "2026-10-28T10:25:37.652531Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.263752399",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2e8b0712-22ee-4f77-953e-55d0bf581d16",
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
  "id": "e1bfd07b-3ace-4722-a5b8-eb87ac22c946",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:37.905730Z",
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
  "command_id": "8b5c2bdf-882f-48e1-9395-fe710737db63",
  "quote_id": "e1bfd07b-3ace-4722-a5b8-eb87ac22c946",
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
    "phone": "+380672326201"
  },
  "call_id": "2fbd8ad0-f79a-4abb-b68d-724193c2a8a6"
}
```

```json
{
  "id": "61fe54ff-9aa6-451e-9e5c-f163e568fa36",
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
  "created_at": "2026-10-28T10:25:38.151048Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672326201"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28667"
}
```

```json
{
  "challenge_id": "86076652-d31e-4d6c-845b-9694bd990638",
  "expires_at": "2026-10-28T10:30:38.399404274Z",
  "resend_available_at": "2026-10-28T10:25:39.399404274Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "824455",
  "sent_at": "2026-10-28T10:25:38.401436792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86076652-d31e-4d6c-845b-9694bd990638",
  "code": "824455",
  "device_ref": "sandbox-28667"
}
```

```json
{
  "session_id": "4457777b-5b60-4cf4-a6a7-0facd6764013",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDAzOCwiaWF0IjoxNzkzMTgzMTM4LCJqdGkiOiI5MWI5YmIwNC0zYWY2LTQ4ZTUtODAzYy05ZDIzMmE2NGJiOGUiLCJzaWQiOiI0NDU3Nzc3Yi01YjYwLTRjZjQtYTZhNy0wZmFjZDY3NjQwMTMifQ.jqhAbOKB9LUlMaujGn9fkXGtw7SJ25MdGzEn5iu4x5Y",
  "access_expires_at": "2026-10-28T10:40:38.639851965Z",
  "refresh_token": "kGE2H7uGxJTi-z_8Gxd3zd7CgdQJ14tbtcWNf7WyhSI",
  "refresh_expires_at": "2026-11-27T10:25:38.639322722Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:29.089862Z",
  "last_location_at": "2026-10-28T10:25:29.089862Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/handover` → **200**

```json
{
  "command_id": "9f4c2d6b-542e-45f8-adc2-59bc52d1e271",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:29.089862Z",
  "last_location_at": "2026-10-28T10:25:29.089862Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:39Z",
    "sequence": 1793183139287
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:39.303242Z",
  "last_location_at": "2026-10-28T10:25:39.303242Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662617391",
  "device_ref": "sandbox-31127"
}
```

```json
{
  "challenge_id": "f47dfd09-0de3-4b59-8a7a-0c2c444ff4a7",
  "expires_at": "2026-10-28T10:30:39.514346763Z",
  "resend_available_at": "2026-10-28T10:25:40.514346763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662617391` → **200**

```json
{
  "phone": "+380662617391",
  "audience": "CLIENT",
  "code": "136072",
  "sent_at": "2026-10-28T10:25:39.516332268Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f47dfd09-0de3-4b59-8a7a-0c2c444ff4a7",
  "code": "136072",
  "device_ref": "sandbox-31127"
}
```

```json
{
  "session_id": "8c5e9134-baae-4abf-9101-1e9036e54597",
  "subject": {
    "type": "CLIENT",
    "id": "f9d01c44-4d97-4129-9ed4-d5c23c8c9d33"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOWQwMWM0NC00ZDk3LTQxMjktOWVkNC1kNWMyM2M4YzlkMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDM5LCJpYXQiOjE3OTMxODMxMzksImp0aSI6IjY4NzUxNzU3LTQxNDgtNGUyNC1hZWE2LTljMDk3MWExZmM1YSIsInNpZCI6IjhjNWU5MTM0LWJhYWUtNGFiZi05MTAxLTFlOTAzNmU1NDU5NyJ9.ttkzmbRh7cs6Vzb9CCkp3Z7mDG5wpTQqCEoMeYE8Hqk",
  "access_expires_at": "2026-10-28T10:40:39.753605572Z",
  "refresh_token": "o5RJwRL47jdkVrqGMuExZPHru8tO8Bc3UyYcCf-Bews",
  "refresh_expires_at": "2026-11-27T10:25:39.753056926Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "66670ebc-cd2b-4e93-8bd5-a1691b93168d",
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
  "id": "c282f86e-4dad-482d-a68e-a83618165bfc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:39.968493Z",
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
  "command_id": "22883b1f-92b3-481c-8adf-4ccf17a9e16d",
  "quote_id": "c282f86e-4dad-482d-a68e-a83618165bfc",
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
  "id": "bd9ff52e-9810-4dc9-9530-763359eabab8",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f9d01c44-4d97-4129-9ed4-d5c23c8c9d33",
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
  "created_at": "2026-10-28T10:25:40.198844Z",
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
    "id": "4a83002b-eb80-4e1c-a554-8c6d4794d380",
    "order_id": "61fe54ff-9aa6-451e-9e5c-f163e568fa36",
    "expires_at": "2026-10-28T10:25:53.15442Z",
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
    "distance_m": 2667
  }
]
```

`POST /api/driver/v1/offers/4a83002b-eb80-4e1c-a554-8c6d4794d380/accept` → **200**

```json
{
  "command_id": "39963231-73b6-4c08-a40d-975327ca11fe"
}
```

```json
{
  "id": "fbb4a5f5-36a8-42c9-ad4b-06c49fa89811",
  "order_id": "61fe54ff-9aa6-451e-9e5c-f163e568fa36",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f1a6a2b3-23ca-4af1-a73d-9de71dc97e78",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f1a6a2b3-23ca-4af1-a73d-9de71dc97e78",
  "order_id": "61fe54ff-9aa6-451e-9e5c-f163e568fa36",
  "assignment_id": "fbb4a5f5-36a8-42c9-ad4b-06c49fa89811",
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
    "name": "Caller",
    "phone": "+380672326201"
  }
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:41Z",
    "sequence": 1793183141778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:41.094364Z",
  "last_location_at": "2026-10-28T10:25:41.094364Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f1a6a2b3-23ca-4af1-a73d-9de71dc97e78/arrive` → **422**

```json
{
  "command_id": "9e580099-11f1-4410-8f41-e8f9d2a50b28",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/trips/f1a6a2b3-23ca-4af1-a73d-9de71dc97e78/arrive",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "219457de-6663-4f0d-bdfa-fc26a1d580a9"
}
```

**Expected 200, got 422 — scenario stopped.**

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
  "session_id": "1c9e5733-31f4-4b73-9d16-5892a897e207",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNDEsImlhdCI6MTc5MzE4MzE0MSwianRpIjoiNDczNzVjMDMtN2M4MS00ZjlhLThhNmYtZDU3MzkxNmI5ZTNkIiwic2lkIjoiMWM5ZTU3MzMtMzFmNC00YjczLTlkMTYtNTg5MmE4OTdlMjA3In0.quCaOwKS1DpR2oM-gWzZ8o56UjjdyLkVT07_vE4xHNw",
  "access_expires_at": "2026-10-28T10:40:41.829762526Z",
  "refresh_token": "VyDKY8tEMmj8LYSk5BRoIJ3pQFwQkoe7iseXZGaHX2M",
  "refresh_expires_at": "2026-10-28T22:25:41.829237095Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "703b3228-1c24-446d-a9ee-082f7d5b78b6",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:25:42Z"
}
```

```json
{
  "id": "869d2066-d8b9-474a-b927-5df70a044043",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:25:42Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/869d2066-d8b9-474a-b927-5df70a044043/publish` → **200**

```json
{
  "command_id": "cf65a2b8-0e38-456b-a220-241e89cd1415",
  "expected_version": 0
}
```

```json
{
  "id": "869d2066-d8b9-474a-b927-5df70a044043",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:25:42.338131Z",
  "published_at": "2026-10-28T10:25:42.338131Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "869d2066-d8b9-474a-b927-5df70a044043",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T10:25:42.338131Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639370809",
  "device_ref": "sandbox-13028"
}
```

```json
{
  "challenge_id": "ad2304eb-483f-4b10-8caa-5c418a1875db",
  "expires_at": "2026-10-28T10:30:42.766865708Z",
  "resend_available_at": "2026-10-28T10:25:43.766865708Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639370809` → **200**

```json
{
  "phone": "+380639370809",
  "audience": "CLIENT",
  "code": "034334",
  "sent_at": "2026-10-28T10:25:42.769268004Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad2304eb-483f-4b10-8caa-5c418a1875db",
  "code": "034334",
  "device_ref": "sandbox-13028"
}
```

```json
{
  "session_id": "401e1c7a-08f2-48b0-9aae-fa45abf228f7",
  "subject": {
    "type": "CLIENT",
    "id": "bfe1ba8e-84f8-4cb3-89c0-f97b9987797b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZmUxYmE4ZS04NGY4LTRjYjMtODljMC1mOTdiOTk4Nzc5N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDQyLCJpYXQiOjE3OTMxODMxNDIsImp0aSI6IjU4NDYxMzVkLTM5NmQtNGFiZS05NmM1LWE1YzRkMmIwZjY4NyIsInNpZCI6IjQwMWUxYzdhLTA4ZjItNDhiMC05YWFlLWZhNDVhYmYyMjhmNyJ9.kU8PER1KaMPRVFLkPeQ6xMsiyXfZc_1hxtA-0FC0R3U",
  "access_expires_at": "2026-10-28T10:40:42.999194847Z",
  "refresh_token": "bDLRbiDyeOcmiRfSqq311xd8ofBM02uIvbULZYJLOF0",
  "refresh_expires_at": "2026-11-27T10:25:42.998645545Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "869d2066-d8b9-474a-b927-5df70a044043",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T10:25:42.338131Z",
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
  "command_id": "d01b43d0-f64b-4a7f-884b-4432dc18a2a8",
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
  "id": "95de97c5-2d8d-434f-9ecf-5a1838c5f85f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:43.433617Z",
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
  "command_id": "8e880607-83f6-4f18-86a7-624a99857ec5",
  "quote_id": "95de97c5-2d8d-434f-9ecf-5a1838c5f85f",
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
  "correlation_id": "c0b328a1-1747-4bea-9412-7affbe1e1266"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "80fff153-a3cc-4755-a92d-c37479b45b1f",
  "version_id": "869d2066-d8b9-474a-b927-5df70a044043",
  "language": "uk"
}
```

```json
{
  "version_id": "869d2066-d8b9-474a-b927-5df70a044043",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T10:25:43.889851Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1eaafbd0-9538-42b4-ab06-df48a3513527",
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
  "id": "e18022e1-57b0-4b06-98aa-b4eec58d8426",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:44.112948Z",
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
  "command_id": "c07038a3-ea86-46aa-a7ed-60e41b371788",
  "quote_id": "e18022e1-57b0-4b06-98aa-b4eec58d8426",
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
  "id": "f027e4f2-eaf7-4c2c-904d-8a52ccff887e",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bfe1ba8e-84f8-4cb3-89c0-f97b9987797b",
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
  "created_at": "2026-10-28T10:25:44.335951Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f027e4f2-eaf7-4c2c-904d-8a52ccff887e` → **200**

```json
{
  "id": "f027e4f2-eaf7-4c2c-904d-8a52ccff887e",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bfe1ba8e-84f8-4cb3-89c0-f97b9987797b",
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
  "created_at": "2026-10-28T10:25:44.335951Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f027e4f2-eaf7-4c2c-904d-8a52ccff887e/cancel` → **200**

```json
{
  "command_id": "53d2f1af-85a8-4cb0-b291-4950bf8ba7d9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f027e4f2-eaf7-4c2c-904d-8a52ccff887e",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bfe1ba8e-84f8-4cb3-89c0-f97b9987797b",
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
  "created_at": "2026-10-28T10:25:44.335951Z",
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

`POST /api/admin/v1/legal-documents/869d2066-d8b9-474a-b927-5df70a044043` → **409**

```json
{
  "command_id": "3ecf9f9c-e298-49bb-9525-0dd5934ec597",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T10:25:45Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/869d2066-d8b9-474a-b927-5df70a044043",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "45ec2383-2dfc-4531-9b10-af1fbe3764d1"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "69b80bc7-ddba-4f3d-8e83-bd9090a920f4",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:25:45Z"
}
```

```json
{
  "id": "932db018-3002-4e26-92e9-646f7a0a1f9c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:25:45Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/932db018-3002-4e26-92e9-646f7a0a1f9c/publish` → **200**

```json
{
  "command_id": "7ba69f95-c18e-4769-af99-a63d6dfc0f18",
  "expected_version": 0
}
```

```json
{
  "id": "932db018-3002-4e26-92e9-646f7a0a1f9c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T10:25:45.490916Z",
  "published_at": "2026-10-28T10:25:45.490916Z",
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
  "device_ref": "sandbox-20348"
}
```

```json
{
  "challenge_id": "535fd8cd-370d-4c1f-8e88-8ffbf3ffff87",
  "expires_at": "2026-10-28T10:30:45.711603818Z",
  "resend_available_at": "2026-10-28T10:25:46.711603818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "476435",
  "sent_at": "2026-10-28T10:25:45.713602163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "535fd8cd-370d-4c1f-8e88-8ffbf3ffff87",
  "code": "476435",
  "device_ref": "sandbox-20348"
}
```

```json
{
  "session_id": "2b183dda-b6a5-4b72-a8d6-f00c0890f095",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDA0NSwiaWF0IjoxNzkzMTgzMTQ1LCJqdGkiOiJhY2Q5MWIyMS1jMmYwLTRjN2EtYjQ1Ni02MTk4NTY3NzAwZDAiLCJzaWQiOiIyYjE4M2RkYS1iNmE1LTRiNzItYThkNi1mMDBjMDg5MGYwOTUifQ.ca1kDU_8XWb7tc8SHlz2nzlZ-bF7_ch0k2fimwXsSPE",
  "access_expires_at": "2026-10-28T10:40:45.947834197Z",
  "refresh_token": "wNX-6dxZkQxrT8Vks2IWpEOE4cn2zfk8mZkkUp1jqqo",
  "refresh_expires_at": "2026-11-27T10:25:45.947209629Z",
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
  "command_id": "ef0579ee-b0d6-401d-8251-d81066a960e3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:46Z",
    "sequence": 1793183146370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "26635d27-795a-4ee1-841d-deb15945d70b",
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
  "last_heartbeat_at": "2026-10-28T10:25:46.385718Z",
  "last_location_at": "2026-10-28T10:25:46.385718Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670713468",
  "device_ref": "sandbox-4004"
}
```

```json
{
  "challenge_id": "41eb55cb-8cf6-4574-b619-7943d667dccc",
  "expires_at": "2026-10-28T10:30:46.605786569Z",
  "resend_available_at": "2026-10-28T10:25:47.605786569Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670713468` → **200**

```json
{
  "phone": "+380670713468",
  "audience": "CLIENT",
  "code": "760804",
  "sent_at": "2026-10-28T10:25:46.607937531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41eb55cb-8cf6-4574-b619-7943d667dccc",
  "code": "760804",
  "device_ref": "sandbox-4004"
}
```

```json
{
  "session_id": "3975cde0-a954-4c39-9a0b-38328d6dde91",
  "subject": {
    "type": "CLIENT",
    "id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MmI3MmUyYi0yZjkxLTQ4NzQtOGZkNS05ZTFhZTkwODJlODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDQ2LCJpYXQiOjE3OTMxODMxNDYsImp0aSI6IjU3MDg2ZWY1LWMxZDYtNDU2NS1iNTY3LWNkYjY3ZWNjZjM2MyIsInNpZCI6IjM5NzVjZGUwLWE5NTQtNGMzOS05YTBiLTM4MzI4ZDZkZGU5MSJ9.jmCII2CNa69qH0teFMrEDPGruMfwOxk4MG671ZMiFfM",
  "access_expires_at": "2026-10-28T10:40:46.849364941Z",
  "refresh_token": "kh06UirlYh5v1PpAhDeoGt8yLlCDu1U0k_2T4urB-Ys",
  "refresh_expires_at": "2026-11-27T10:25:46.848921321Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a0838eb8-66db-4a8d-a929-7fd315e6aab2",
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
  "id": "50806ba2-c037-4a80-a6ae-fa4a41e22719",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:47.069440Z",
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
  "command_id": "335d96fb-87c6-4fe1-bfcc-3744b26ffe4c",
  "quote_id": "50806ba2-c037-4a80-a6ae-fa4a41e22719",
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
    "phone": "+380671806476"
  }
}
```

```json
{
  "id": "5b90a841-62be-46bc-89ec-67eabf725620",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
  "created_at": "2026-10-28T10:25:47.302975Z",
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
    "id": "7da560a1-ea12-4861-925a-959af287f1aa",
    "order_id": "5b90a841-62be-46bc-89ec-67eabf725620",
    "expires_at": "2026-10-28T10:26:02.306192Z",
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

`POST /api/driver/v1/offers/7da560a1-ea12-4861-925a-959af287f1aa/accept` → **200**

```json
{
  "command_id": "7454d26b-ba3f-4b94-909a-4e2cdd78ea58"
}
```

```json
{
  "id": "f7e67dca-8f60-41b7-964b-cc2330f93a98",
  "order_id": "5b90a841-62be-46bc-89ec-67eabf725620",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e0dbec24-cbd6-4bda-86f9-15c0d7089882",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e0dbec24-cbd6-4bda-86f9-15c0d7089882",
  "order_id": "5b90a841-62be-46bc-89ec-67eabf725620",
  "assignment_id": "f7e67dca-8f60-41b7-964b-cc2330f93a98",
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
    "phone": "+380671806476"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a6b7aae3-3303-476d-86a9-3db98aeb5703",
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
  "id": "bc08c25a-c058-4e30-85c8-26ce626fe319",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:48.213282Z",
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
  "command_id": "8631cede-36d9-4930-993f-aa6fb05df17e",
  "quote_id": "bc08c25a-c058-4e30-85c8-26ce626fe319",
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
  "id": "ad249a1e-2a76-435b-aad2-73af79d56e1a",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
  "created_at": "2026-10-28T10:25:48.442531Z",
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
  "command_id": "5b7b59ec-4fd0-42bd-8e2f-6945881a8676",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T13:25:48Z"
}
```

```json
{
  "id": "e40ef245-9acf-496f-8f39-d1ac3c21b544",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:48.686996Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:25:48Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6c010554-d1f2-48e6-80a9-a8b3fcf37e05",
  "quote_id": "e40ef245-9acf-496f-8f39-d1ac3c21b544",
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
  "pickup_at": "2026-10-28T13:25:48Z"
}
```

```json
{
  "id": "f3ab433f-7e76-4db0-94c1-c38b312050c2",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
  "created_at": "2026-10-28T10:25:48.921586Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:25:48Z",
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
  "command_id": "68f9c564-15c8-4f31-be9f-61607e9fda49",
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
  "id": "92be6b01-4c5c-4220-8576-5844add9f94d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:49.160841Z",
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
  "command_id": "4a6d4de8-df55-4662-be76-2d4bcc41a040",
  "quote_id": "92be6b01-4c5c-4220-8576-5844add9f94d",
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
  "correlation_id": "82324a20-0e39-4457-9898-82903354ed3d"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f3ab433f-7e76-4db0-94c1-c38b312050c2",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
      "created_at": "2026-10-28T10:25:48.921586Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T13:25:48Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "ad249a1e-2a76-435b-aad2-73af79d56e1a",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
      "created_at": "2026-10-28T10:25:48.442531Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "5b90a841-62be-46bc-89ec-67eabf725620",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ad249a1e-2a76-435b-aad2-73af79d56e1a",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
  "created_at": "2026-10-28T10:25:48.442531Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/5b90a841-62be-46bc-89ec-67eabf725620` → **200**

```json
{
  "id": "5b90a841-62be-46bc-89ec-67eabf725620",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
    "id": "f7e67dca-8f60-41b7-964b-cc2330f93a98",
    "order_id": "5b90a841-62be-46bc-89ec-67eabf725620",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e0dbec24-cbd6-4bda-86f9-15c0d7089882",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T10:25:47.302975Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5b90a841-62be-46bc-89ec-67eabf725620/cancel` → **200**

```json
{
  "command_id": "5c89ca35-e1df-4554-81ed-aba1b0c3e487",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5b90a841-62be-46bc-89ec-67eabf725620",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
    "id": "f7e67dca-8f60-41b7-964b-cc2330f93a98",
    "order_id": "5b90a841-62be-46bc-89ec-67eabf725620",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e0dbec24-cbd6-4bda-86f9-15c0d7089882",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T10:25:47.302975Z",
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

`GET /api/rider/v1/orders/ad249a1e-2a76-435b-aad2-73af79d56e1a` → **200**

```json
{
  "id": "ad249a1e-2a76-435b-aad2-73af79d56e1a",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
  "created_at": "2026-10-28T10:25:48.442531Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ad249a1e-2a76-435b-aad2-73af79d56e1a/cancel` → **200**

```json
{
  "command_id": "cf98138a-09af-4bb5-ad23-df030a98a746",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ad249a1e-2a76-435b-aad2-73af79d56e1a",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
  "created_at": "2026-10-28T10:25:48.442531Z",
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

`GET /api/rider/v1/orders/f3ab433f-7e76-4db0-94c1-c38b312050c2` → **200**

```json
{
  "id": "f3ab433f-7e76-4db0-94c1-c38b312050c2",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
  "created_at": "2026-10-28T10:25:48.921586Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:25:48Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f3ab433f-7e76-4db0-94c1-c38b312050c2/cancel` → **200**

```json
{
  "command_id": "86603e98-ff1f-49db-a5d6-e800e5510a2b",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f3ab433f-7e76-4db0-94c1-c38b312050c2",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "92b72e2b-2f91-4874-8fd5-9e1ae9082e82",
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
  "created_at": "2026-10-28T10:25:48.921586Z",
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
  "pickup_at": "2026-10-28T13:25:48Z",
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
  "session_id": "26635d27-795a-4ee1-841d-deb15945d70b",
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
  "last_heartbeat_at": "2026-10-28T10:25:46.385718Z",
  "last_location_at": "2026-10-28T10:25:46.385718Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/26635d27-795a-4ee1-841d-deb15945d70b/close` → **200**

```json
{
  "command_id": "ff0778dd-465e-4add-9f5e-814e4e80e945",
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

Done: orders 5b90a841-62be-46bc-89ec-67eabf725620, ad249a1e-2a76-435b-aad2-73af79d56e1a, f3ab433f-7e76-4db0-94c1-c38b312050c2.

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
  "session_id": "93c23bec-ba0f-485e-83bf-6e46658a9d46",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNTIsImlhdCI6MTc5MzE4MzE1MiwianRpIjoiOWIzNjgyY2ItZTg1Mi00ODkzLWJiYjQtZTBiM2RkYjhjOGNkIiwic2lkIjoiOTNjMjNiZWMtYmEwZi00ODVlLTgzYmYtNmU0NjY1OGE5ZDQ2In0.MbprEWhvbkL85AWFjBBxrWMOC1Ts6fhtANTj6WQlrKU",
  "access_expires_at": "2026-10-28T10:40:52.163563554Z",
  "refresh_token": "NPbrKQk2Xu97ELeug0xNyoDJfFGJ_rP1J8tH6gPa0T0",
  "refresh_expires_at": "2026-10-28T22:25:52.163073903Z",
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
  "session_id": "3510579d-a2e5-412f-892c-bd0b907e468b",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNTIsImlhdCI6MTc5MzE4MzE1MiwianRpIjoiZWIxMjNiNzUtOWU4ZC00MjIxLWE5YzgtMmQ2OGE1NWFiNjg3Iiwic2lkIjoiMzUxMDU3OWQtYTJlNS00MTJmLTg5MmMtYmQwYjkwN2U0NjhiIn0.jPOmNT3NQu0-2jbTim92P45nEoJda4Q_0erx-28aadg",
  "access_expires_at": "2026-10-28T10:40:52.654552623Z",
  "refresh_token": "SNpg31iezT3UeYmFJkPEmY8vPspoA38rnPpF7nHINr8",
  "refresh_expires_at": "2026-10-28T22:25:52.654044895Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15350"
}
```

```json
{
  "challenge_id": "4de8c29c-83fd-4d47-869f-3d4080414836",
  "expires_at": "2026-10-28T10:30:52.862143044Z",
  "resend_available_at": "2026-10-28T10:25:53.862143044Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "907250",
  "sent_at": "2026-10-28T10:25:52.864187893Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4de8c29c-83fd-4d47-869f-3d4080414836",
  "code": "907250",
  "device_ref": "sandbox-15350"
}
```

```json
{
  "session_id": "de1f825d-1ae0-4a75-84ae-1ded1397878a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDA1MywiaWF0IjoxNzkzMTgzMTUzLCJqdGkiOiI3YmFhYjk0Ni0xZmZlLTQ1NmQtODM4My0zNGY0M2YxZWEzZDMiLCJzaWQiOiJkZTFmODI1ZC0xYWUwLTRhNzUtODRhZS0xZGVkMTM5Nzg3OGEifQ.WQ_EE96-ILlFOutgKrxYWHzO8b-eER1wDhvF2v1ct4U",
  "access_expires_at": "2026-10-28T10:40:53.100431647Z",
  "refresh_token": "_WtmY_qFxxVs9pF1tJzI4FiSvgmher-KK53LZM9B2bk",
  "refresh_expires_at": "2026-11-27T10:25:53.099972726Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:41.094364Z",
  "last_location_at": "2026-10-28T10:25:41.094364Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/handover` → **200**

```json
{
  "command_id": "ac570cd3-169e-4b8d-9ea0-6b4df4e5e081",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:41.094364Z",
  "last_location_at": "2026-10-28T10:25:41.094364Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:25:53Z",
    "sequence": 1793183153756
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:53.770957Z",
  "last_location_at": "2026-10-28T10:25:53.770957Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
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
  "command_id": "0b33fbb3-659c-450c-87b8-9e42e7ba5e26",
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
  "effective_at": "2026-10-28T10:25:54.210189Z",
  "changed_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T10:25:54.428612331Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2d28dc8a-d17d-4733-ad84-d7cb28b72f81",
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
  "id": "54ca4a93-843b-4ff2-b2e6-8392d821fe1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:54.649579Z",
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
  "command_id": "985cdd5c-0201-4c16-8b57-72acbec15943",
  "quote_id": "54ca4a93-843b-4ff2-b2e6-8392d821fe1e",
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
    "phone": "+3806711123500"
  }
}
```

```json
{
  "id": "a284fe7d-fe2d-44fc-81bb-cf96d47cee52",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:25:54.874389Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123500"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

`GET /api/driver/v1/offers` → **200**

```json
[]
```

`POST /api/driver/v1/offers/null/accept` → **400**

```json
{
  "command_id": "dc0c2214-f6f8-4ddb-9b78-8bcee6bbd043"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "044d5e1a-f927-4c5b-ae4d-e06d040088fa"
}
```

**Expected 200, got 400 — scenario stopped.**

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672272859",
  "device_ref": "sandbox-15425"
}
```

```json
{
  "challenge_id": "446fd3e1-f1d5-4d02-ac14-f3f5fc7fbb9f",
  "expires_at": "2026-10-28T10:30:55.561938413Z",
  "resend_available_at": "2026-10-28T10:25:56.561938413Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672272859` → **200**

```json
{
  "phone": "+380672272859",
  "audience": "CLIENT",
  "code": "829298",
  "sent_at": "2026-10-28T10:25:55.563758622Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672726685",
  "device_ref": "sandbox-23106",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0a44cf1b-177e-4abd-8d8d-9d4a3ee61115",
  "expires_at": "2026-10-28T10:30:55.79773445Z",
  "resend_available_at": "2026-10-28T10:25:56.79773445Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672726685` → **200**

```json
{
  "phone": "+380672726685",
  "audience": "CLIENT",
  "code": "967908",
  "sent_at": "2026-10-28T10:25:55.799808787Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676590000",
  "device_ref": "sandbox-17974"
}
```

```json
{
  "challenge_id": "3871044f-dba4-47b6-b92c-f377baa2e0ab",
  "expires_at": "2026-10-28T10:30:56.024708957Z",
  "resend_available_at": "2026-10-28T10:25:57.024708957Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676590000` → **200**

```json
{
  "phone": "+380676590000",
  "audience": "CLIENT",
  "code": "158983",
  "sent_at": "2026-10-28T10:25:56.028544133Z",
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
  "session_id": "467d311d-ab31-4d31-92fa-1daa1168f1ec",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNTYsImlhdCI6MTc5MzE4MzE1NiwianRpIjoiNzUzZTk5MzAtNjRiYi00NzI5LTg1ODYtMzFlMTg0YTkzMDA0Iiwic2lkIjoiNDY3ZDMxMWQtYWIzMS00ZDMxLTkyZmEtMWRhYTExNjhmMWVjIn0.0MQGGVHNxzgnI5kyuxIrAQ51TPjaAd_uuQm7tM5dHBA",
  "access_expires_at": "2026-10-28T10:40:56.54017909Z",
  "refresh_token": "gV9k57QXNJ7vW5Mqfy84qADmtBkcmKfTzehXjxPDQOo",
  "refresh_expires_at": "2026-10-28T22:25:56.539712109Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676590000` → **200**

```json
{
  "deliveries": [
    {
      "id": "7f4dc9b8-6bf0-4591-8221-f2f3c6871755",
      "challenge_id": "3871044f-dba4-47b6-b92c-f377baa2e0ab",
      "phone": "+380676590000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-95ba0906-8644-4e9a-9fdf-a6e167de7408",
      "error": null,
      "attempted_at": "2026-10-28T10:25:56.028823Z"
    },
    {
      "id": "7b45e2fa-56bd-403c-81dc-3afbcf0b7b93",
      "challenge_id": "3871044f-dba4-47b6-b92c-f377baa2e0ab",
      "phone": "+380676590000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T10:25:56.027897Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676590000` → **200**

```json
{
  "phone": "+380676590000",
  "audience": "CLIENT",
  "code": "158983",
  "sent_at": "2026-10-28T10:25:56.028544133Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672726685` → **200**

```json
{
  "deliveries": [
    {
      "id": "4bc0eae0-6432-4808-811e-b4c12bc5dd88",
      "challenge_id": "0a44cf1b-177e-4abd-8d8d-9d4a3ee61115",
      "phone": "+380672726685",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-090afa6e-1e9b-47b5-b1b4-02cb88953518",
      "error": null,
      "attempted_at": "2026-10-28T10:25:55.800026Z"
    }
  ]
}
```

Done: SMS to +380672272859, a call to +380672726685, SMS then a call to +380676590000.

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
  "session_id": "44d3521e-abac-4b16-b06f-750335cf3581",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNTcsImlhdCI6MTc5MzE4MzE1NywianRpIjoiMWNhNDBiYzctYzJkYy00Y2Y4LWI2ZmUtNjEwNDdkNzlhMjAwIiwic2lkIjoiNDRkMzUyMWUtYWJhYy00YjE2LWIwNmYtNzUwMzM1Y2YzNTgxIn0.CIFU0uoSNl0G0gafQBtHK-LT07N4aCF6Dy6bYcphz8g",
  "access_expires_at": "2026-10-28T10:40:57.493935918Z",
  "refresh_token": "SnAy1xk-ugCyi_hAAa0I2hR8nGNEStmgz34pmoihDfQ",
  "refresh_expires_at": "2026-10-28T22:25:57.493312599Z",
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
  "session_id": "8ff4598d-961a-418d-a864-b057fc2ef0a9",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNTcsImlhdCI6MTc5MzE4MzE1NywianRpIjoiZDZkOGNiNzctNzJkNy00MDA4LWE4NzMtMWQ1ZWY5ZDMzNTdhIiwic2lkIjoiOGZmNDU5OGQtOTYxYS00MThkLWE4NjQtYjA1N2ZjMmVmMGE5In0.Uxi7evKUkJ_BghdzzuFWQ5L94BBrCZe-o_OfW3xxNb4",
  "access_expires_at": "2026-10-28T10:40:57.982944096Z",
  "refresh_token": "B0KkUieRE-Nk7J0I1h-33kxthBGY2-J8XWuWtJAtlj8",
  "refresh_expires_at": "2026-10-28T22:25:57.982451307Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
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

`POST /api/admin/v1/staff-extensions/a9faa988-63c8-49e7-a33f-3d7514625d14` → **200**

```json
{
  "command_id": "03744310-962b-470d-9891-f496778f042f",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "687a1741-2360-48dd-b78a-4b60ab2e2be8",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:25:58.860724Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T10:25:58.860724Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1b6aba1c-3131-4806-8bd6-b4bb30817386",
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
  "id": "a5d885c4-a9a5-42be-bbe1-15e5ecdf58d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:30:59.311897Z",
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
  "command_id": "76510421-1c21-463a-8d9a-4419fd068084",
  "quote_id": "a5d885c4-a9a5-42be-bbe1-15e5ecdf58d3",
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
    "phone": "+380678728083"
  }
}
```

```json
{
  "id": "aec0b139-5690-415f-b7a7-51bab240f5d3",
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
  "created_at": "2026-10-28T10:25:59.542088Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678728083"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635213491",
  "device_ref": "sandbox-7660"
}
```

```json
{
  "challenge_id": "d362e916-fecd-4046-b658-651c640f88df",
  "expires_at": "2026-10-28T10:30:59.789610608Z",
  "resend_available_at": "2026-10-28T10:26:00.789610608Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635213491` → **200**

```json
{
  "phone": "+380635213491",
  "audience": "CLIENT",
  "code": "296906",
  "sent_at": "2026-10-28T10:25:59.79180842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d362e916-fecd-4046-b658-651c640f88df",
  "code": "296906",
  "device_ref": "sandbox-7660"
}
```

```json
{
  "session_id": "1b1f926d-4807-4aa0-9b99-61659b75868c",
  "subject": {
    "type": "CLIENT",
    "id": "4c5a3ab9-cef8-4a89-95fe-3cf729747ea7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YzVhM2FiOS1jZWY4LTRhODktOTVmZS0zY2Y3Mjk3NDdlYTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDYwLCJpYXQiOjE3OTMxODMxNjAsImp0aSI6IjVmYzNiOTA4LWRkYTAtNDg2YS04YmFmLWQ4N2UxOGE2MWFmNiIsInNpZCI6IjFiMWY5MjZkLTQ4MDctNGFhMC05Yjk5LTYxNjU5Yjc1ODY4YyJ9.1IFZJgAHtnVv1TfuSVyMMWsWePbex8phzMz9dL07NqI",
  "access_expires_at": "2026-10-28T10:41:00.023610098Z",
  "refresh_token": "WApOGKxIHHRaM7ZQ4wIvlBQbpDVhcCcco-Dl3GdCjiQ",
  "refresh_expires_at": "2026-11-27T10:26:00.023163652Z",
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
  "session_id": "65f3eb16-7c52-4cf5-85d6-61e5ea1b79a9",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNjAsImlhdCI6MTc5MzE4MzE2MCwianRpIjoiNGJlZDUzYjktNmEwNC00NGM1LTg4ZDItNDYwNjY4Yzc0MDUxIiwic2lkIjoiNjVmM2ViMTYtN2M1Mi00Y2Y1LTg1ZDYtNjFlNWVhMWI3OWE5In0.fBAWk-CvVT1uA1bX9XzYrM2OO5l7J7pwzBh3BO_wemg",
  "access_expires_at": "2026-10-28T10:41:00.967918275Z",
  "refresh_token": "epSlpQAhpgSQ_QCd4etKyYHX-7nqwfRIVHMi_41Jyr0",
  "refresh_expires_at": "2026-10-28T22:26:00.967384652Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635213491` → **200**

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
  "correlation_id": "d340df8f-547f-4c89-9780-2d8bb40b5d40"
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
  "session_id": "24064f3c-295a-4378-b4fb-eff9c3544c94",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNjEsImlhdCI6MTc5MzE4MzE2MSwianRpIjoiZDE1Y2I3ZjUtNWMzOC00MzY5LWE4MDctZTY3YmEzM2Q5NzZjIiwic2lkIjoiMjQwNjRmM2MtMjk1YS00Mzc4LWI0ZmItZWZmOWMzNTQ0Yzk0In0.NbfKV8J_2qmLnvhaXA1XLmouXpD7IgNpfq38MTRSIuI",
  "access_expires_at": "2026-10-28T10:41:01.918219846Z",
  "refresh_token": "1g-UzcZFcyv0LbBEM0iKiLAFXmQ5IxfZQsLhzIaiTWI",
  "refresh_expires_at": "2026-10-28T22:26:01.917457241Z",
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
  "command_id": "739d28f5-9172-46d5-8fb3-214c0a8e3128",
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
  "changed_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T10:26:02.381409863Z"
}
```

## The rider books the airport for 2026-10-28T13:26:01Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600176420",
  "device_ref": "sandbox-19472"
}
```

```json
{
  "challenge_id": "5dfe0d53-3fc7-4f91-8d28-d070f741fb29",
  "expires_at": "2026-10-28T10:31:02.602087937Z",
  "resend_available_at": "2026-10-28T10:26:03.602087937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600176420` → **200**

```json
{
  "phone": "+48600176420",
  "audience": "CLIENT",
  "code": "464816",
  "sent_at": "2026-10-28T10:26:02.604618154Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5dfe0d53-3fc7-4f91-8d28-d070f741fb29",
  "code": "464816",
  "device_ref": "sandbox-19472"
}
```

```json
{
  "session_id": "92f778fd-e463-4374-918d-17d38baef05a",
  "subject": {
    "type": "CLIENT",
    "id": "065cdadc-2600-4f2b-983d-ff44b32fb0a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNjVjZGFkYy0yNjAwLTRmMmItOTgzZC1mZjQ0YjMyZmIwYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDYyLCJpYXQiOjE3OTMxODMxNjIsImp0aSI6Ijk5YzdjYWFkLWM1ZGUtNDQ1Zi04Y2I5LTNkMWI0MTg0YmVlMSIsInNpZCI6IjkyZjc3OGZkLWU0NjMtNDM3NC05MThkLTE3ZDM4YmFlZjA1YSJ9.U2AZ8VVg5z9VztnjhtqYfDk8-B75wKHuuC12st4X1wI",
  "access_expires_at": "2026-10-28T10:41:02.83471495Z",
  "refresh_token": "rXyXPrsJSq_OW_gkzHaW4uganu4l-0wyV4sjFEHMKsE",
  "refresh_expires_at": "2026-11-27T10:26:02.83420808Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f411f330-ea9e-4fc8-999a-bdec820897c3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T13:26:01Z"
}
```

```json
{
  "id": "8e032a6b-c352-41dd-be12-2ecdab226f91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:31:03.057477Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T13:26:01Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "96eaefec-56ae-4126-b476-cb48fb4df817",
  "quote_id": "8e032a6b-c352-41dd-be12-2ecdab226f91",
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
  "pickup_at": "2026-10-28T13:26:01Z"
}
```

```json
{
  "id": "137acbca-6ddd-4444-9c1d-37b09dc133fb",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "065cdadc-2600-4f2b-983d-ff44b32fb0a5",
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
  "created_at": "2026-10-28T10:26:03.286416Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T13:26:01Z",
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
  "device_ref": "sandbox-905"
}
```

```json
{
  "challenge_id": "4e00611f-01d5-45d1-a929-694c2de93d7d",
  "expires_at": "2026-10-28T10:31:03.511762019Z",
  "resend_available_at": "2026-10-28T10:26:04.511762019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "181248",
  "sent_at": "2026-10-28T10:26:03.513532878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e00611f-01d5-45d1-a929-694c2de93d7d",
  "code": "181248",
  "device_ref": "sandbox-905"
}
```

```json
{
  "session_id": "35bb5ecd-00eb-4221-b299-29af0c21b8f7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDA2MywiaWF0IjoxNzkzMTgzMTYzLCJqdGkiOiI2NDRjMjI0MC1mYTJhLTQ3MDctYTJjZi05OTc2MjNlY2YyZjkiLCJzaWQiOiIzNWJiNWVjZC0wMGViLTQyMjEtYjI5OS0yOWFmMGMyMWI4ZjcifQ.P2ClcOQPwVe5k6EB0xUCO3cGVfrWd-19IKIVcThXqrs",
  "access_expires_at": "2026-10-28T10:41:03.751078355Z",
  "refresh_token": "xrE_EDjNmAAOKfCnAVh52gcsl8zFlWoHghWsOyclr8k",
  "refresh_expires_at": "2026-11-27T10:26:03.750532534Z",
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
  "command_id": "96176087-233d-4145-ba52-52160c3677f2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:26:04Z",
    "sequence": 1793183164175
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3a8c0148-79c2-4b4f-9acb-6e3cef027ced",
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
  "last_heartbeat_at": "2026-10-28T10:26:04.190049Z",
  "last_location_at": "2026-10-28T10:26:04.190049Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "137acbca-6ddd-4444-9c1d-37b09dc133fb",
      "short_number": 16,
      "pickup_at": "2026-10-28T13:26:01Z",
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

`POST /api/driver/v1/preorders/137acbca-6ddd-4444-9c1d-37b09dc133fb/reserve` → **200**

```json
{
  "command_id": "87f26eae-8010-4f0d-a32b-9882f12be0d8"
}
```

```json
{
  "id": "99d6046a-80ce-48f5-9276-f1aad810ee67",
  "state": "RESERVED",
  "order": {
    "order_id": "137acbca-6ddd-4444-9c1d-37b09dc133fb",
    "short_number": 16,
    "pickup_at": "2026-10-28T13:26:01Z",
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
  "reserved_at": "2026-10-28T10:26:04.629843Z",
  "confirm_from": "2026-10-28T12:56:01Z",
  "confirm_until": "2026-10-28T13:06:01Z",
  "drop_until": "2026-10-28T12:26:01Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "99d6046a-80ce-48f5-9276-f1aad810ee67",
      "state": "RESERVED",
      "order": {
        "order_id": "137acbca-6ddd-4444-9c1d-37b09dc133fb",
        "short_number": 16,
        "pickup_at": "2026-10-28T13:26:01Z",
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
      "reserved_at": "2026-10-28T10:26:04.629843Z",
      "confirm_from": "2026-10-28T12:56:01Z",
      "confirm_until": "2026-10-28T13:06:01Z",
      "drop_until": "2026-10-28T12:26:01Z"
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
      "id": "99d6046a-80ce-48f5-9276-f1aad810ee67",
      "state": "RESERVED",
      "order": {
        "order_id": "137acbca-6ddd-4444-9c1d-37b09dc133fb",
        "short_number": 16,
        "pickup_at": "2026-10-28T13:26:01Z",
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
      "reserved_at": "2026-10-28T10:26:04.629843Z",
      "confirm_from": "2026-10-28T12:56:01Z",
      "confirm_until": "2026-10-28T13:06:01Z",
      "drop_until": "2026-10-28T12:26:01Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/99d6046a-80ce-48f5-9276-f1aad810ee67/confirm` → **409**

```json
{
  "command_id": "362eade1-c7bf-43af-a342-81ecb61cfed6"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/99d6046a-80ce-48f5-9276-f1aad810ee67/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0629c097-ba16-4d2c-9720-728b1b2d13f1"
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
  "session_id": "da709478-5840-4a82-82bb-3be93c87b7bf",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNjUsImlhdCI6MTc5MzE4MzE2NSwianRpIjoiNzgxZTdiZTctODZlYS00OGU3LThhMjItMWNlOGNlZjRiNjQyIiwic2lkIjoiZGE3MDk0NzgtNTg0MC00YTgyLTgyYmItM2JlOTNjODdiN2JmIn0.FzmYQZ8P4EggKx7Osan7URIYkYeSYCK2IEOD32fBWMI",
  "access_expires_at": "2026-10-28T10:41:05.799148621Z",
  "refresh_token": "bBHSn0aRiaGIQ63KlaCQ5nxcOIcEN5fd7MYXC7RwEGg",
  "refresh_expires_at": "2026-10-28T22:26:05.798475287Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/137acbca-6ddd-4444-9c1d-37b09dc133fb` → **200**

```json
{
  "id": "137acbca-6ddd-4444-9c1d-37b09dc133fb",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "065cdadc-2600-4f2b-983d-ff44b32fb0a5",
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
  "created_at": "2026-10-28T10:26:03.286416Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T13:26:01Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "99d6046a-80ce-48f5-9276-f1aad810ee67",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T10:26:04.629843Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/137acbca-6ddd-4444-9c1d-37b09dc133fb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T10:26:03.287721Z",
      "actor": {
        "type": "CLIENT",
        "id": "065cdadc-2600-4f2b-983d-ff44b32fb0a5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "137acbca-6ddd-4444-9c1d-37b09dc133fb",
        "preorder": true,
        "quote_id": "8e032a6b-c352-41dd-be12-2ecdab226f91",
        "pickup_at": "2026-10-28T13:26:01Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "65ee3fd7-19ab-4e17-a2c8-edb244098c97"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T10:26:04.630955Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "137acbca-6ddd-4444-9c1d-37b09dc133fb",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "99d6046a-80ce-48f5-9276-f1aad810ee67"
      },
      "correlation_id": "86e278b0-edc8-406a-af3e-11630f610109"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 137acbca-6ddd-4444-9c1d-37b09dc133fb, reservation 99d6046a-80ce-48f5-9276-f1aad810ee67.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29458"
}
```

```json
{
  "challenge_id": "b756898a-2145-47cc-bffd-a1c606ab71b2",
  "expires_at": "2026-10-28T10:31:06.476246781Z",
  "resend_available_at": "2026-10-28T10:26:07.476246781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "085413",
  "sent_at": "2026-10-28T10:26:06.478547996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b756898a-2145-47cc-bffd-a1c606ab71b2",
  "code": "085413",
  "device_ref": "sandbox-29458"
}
```

```json
{
  "session_id": "e3c0438e-14dd-4e8b-9798-325e6b0bc66b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDA2NiwiaWF0IjoxNzkzMTgzMTY2LCJqdGkiOiJlZjc1NWM5Mi1mZTg0LTQ5OTQtOGM0MS01ZWQ3OTZhMTA1MTkiLCJzaWQiOiJlM2MwNDM4ZS0xNGRkLTRlOGItOTc5OC0zMjVlNmIwYmM2NmIifQ.ESfaleap6JayG7HgroHJ2z4dp4vwenluWgA_5f67W7E",
  "access_expires_at": "2026-10-28T10:41:06.709266245Z",
  "refresh_token": "NRimk4lYrmCTOWREE0EZwG7hC08zIYg0_j_wp3uL6oI",
  "refresh_expires_at": "2026-11-27T10:26:06.7086579Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:53.770957Z",
  "last_location_at": "2026-10-28T10:25:53.770957Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/handover` → **200**

```json
{
  "command_id": "b6583fc2-aafe-4b29-9b54-c03c57b7652e",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:25:53.770957Z",
  "last_location_at": "2026-10-28T10:25:53.770957Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:26:07Z",
    "sequence": 1793183167355
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:26:07.369808Z",
  "last_location_at": "2026-10-28T10:26:07.369808Z",
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
  "phone": "+380672910869",
  "device_ref": "sandbox-21773"
}
```

```json
{
  "challenge_id": "8825f349-e9b3-4fa1-ab31-d70fbcb2a3d5",
  "expires_at": "2026-10-28T10:31:07.579614731Z",
  "resend_available_at": "2026-10-28T10:26:08.579614731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672910869` → **200**

```json
{
  "phone": "+380672910869",
  "audience": "CLIENT",
  "code": "257651",
  "sent_at": "2026-10-28T10:26:07.581413073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8825f349-e9b3-4fa1-ab31-d70fbcb2a3d5",
  "code": "257651",
  "device_ref": "sandbox-21773"
}
```

```json
{
  "session_id": "3f576dc2-64cd-4bf0-a41a-80ee47b3937e",
  "subject": {
    "type": "CLIENT",
    "id": "38844226-baf1-4e5e-a61c-0be4e2628692"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODg0NDIyNi1iYWYxLTRlNWUtYTYxYy0wYmU0ZTI2Mjg2OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDY3LCJpYXQiOjE3OTMxODMxNjcsImp0aSI6ImFjOTc0NWExLWNjNTUtNGI3Yi05ZGIwLTM2MGQ5ODI2ZTI0ZCIsInNpZCI6IjNmNTc2ZGMyLTY0Y2QtNGJmMC1hNDFhLTgwZWU0N2IzOTM3ZSJ9.FjQbXpeZc79zeELvgdWAZzAH0k4blvH8otjrGMuQ1As",
  "access_expires_at": "2026-10-28T10:41:07.816066237Z",
  "refresh_token": "33cpJGgCB2ZUcfs3sejW3PH7InROU6kFC_0-gdZUvV8",
  "refresh_expires_at": "2026-11-27T10:26:07.81547757Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "283ae979-5f54-41bb-bb89-639c0030330a",
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
  "id": "7aa2da94-1d4a-4c57-b1be-2e56495f861d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:31:08.037515Z",
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
  "command_id": "3e8a473c-ae30-4f0d-87d6-835a0fd9b9da",
  "quote_id": "7aa2da94-1d4a-4c57-b1be-2e56495f861d",
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
  "id": "b0714ea3-1ccd-449c-b851-fac2a2f54149",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38844226-baf1-4e5e-a61c-0be4e2628692",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T10:26:08.272186Z",
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
  "command_id": "b618776e-645a-4fc3-bcf2-4432081e23b3"
}
```

```json
{
  "instance": "/api/driver/v1/offers/null/accept",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "49e526c8-9331-41c5-b5c5-c0f5b376d084"
}
```

**Expected 200, got 400 — scenario stopped.**

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
  "session_id": "53de750a-9c47-4add-a935-42ca0aca11fe",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwNjksImlhdCI6MTc5MzE4MzE2OSwianRpIjoiYzdiMjg3MzgtN2JjMC00NTIxLTk0YzctMjQ2NDU0YzExZjE4Iiwic2lkIjoiNTNkZTc1MGEtOWM0Ny00YWRkLWE5MzUtNDJjYTBhY2ExMWZlIn0.subt2YClaIIjUdqL6yTEe-Ya3YjOq5RyTHgluGKsjgk",
  "access_expires_at": "2026-10-28T10:41:09.227322428Z",
  "refresh_token": "OT7wG7N1dUe5xuAilAIkeAlN8BjIIzZdoGHeS10kSjg",
  "refresh_expires_at": "2026-10-28T22:26:09.22676127Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "5968e4c8-a90e-43b2-8c44-4edacd07de6b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "30e33d6a-b035-4e6b-ba23-33df96ecd506",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:09.452416Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30e33d6a-b035-4e6b-ba23-33df96ecd506` → **200**

```json
{
  "id": "30e33d6a-b035-4e6b-ba23-33df96ecd506",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:09.452416Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30e33d6a-b035-4e6b-ba23-33df96ecd506` → **200**

```json
{
  "id": "30e33d6a-b035-4e6b-ba23-33df96ecd506",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:09.452416Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30e33d6a-b035-4e6b-ba23-33df96ecd506` → **200**

```json
{
  "id": "30e33d6a-b035-4e6b-ba23-33df96ecd506",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:09.452416Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30e33d6a-b035-4e6b-ba23-33df96ecd506` → **200**

```json
{
  "id": "30e33d6a-b035-4e6b-ba23-33df96ecd506",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:09.452416Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/30e33d6a-b035-4e6b-ba23-33df96ecd506` → **200**

```json
{
  "id": "30e33d6a-b035-4e6b-ba23-33df96ecd506",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:26:09.452416Z",
  "ready_at": "2026-10-28T10:26:13.475022Z",
  "expires_at": "2026-10-29T10:26:13.475022Z"
}
```

`GET /api/admin/v1/reports/exports/30e33d6a-b035-4e6b-ba23-33df96ecd506/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,16,3,8,0,5,13,3,0,15,1,0,0,6,1,1
total,16,3,8,0,5,13,3,0,15,1,0,0,6,1,1
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1fac4da1-e2d7-4fa7-ba30-4c437a77c3ad",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "03879a00-bdbc-4f9c-baef-0550357c2d93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:14.796631Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/03879a00-bdbc-4f9c-baef-0550357c2d93` → **200**

```json
{
  "id": "03879a00-bdbc-4f9c-baef-0550357c2d93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:14.796631Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/03879a00-bdbc-4f9c-baef-0550357c2d93` → **200**

```json
{
  "id": "03879a00-bdbc-4f9c-baef-0550357c2d93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:14.796631Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/03879a00-bdbc-4f9c-baef-0550357c2d93` → **200**

```json
{
  "id": "03879a00-bdbc-4f9c-baef-0550357c2d93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T10:26:14.796631Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/03879a00-bdbc-4f9c-baef-0550357c2d93` → **200**

```json
{
  "id": "03879a00-bdbc-4f9c-baef-0550357c2d93",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T10:26:14.796631Z",
  "ready_at": "2026-10-28T10:26:18.483246Z",
  "expires_at": "2026-10-29T10:26:18.483246Z"
}
```

`GET /api/admin/v1/reports/exports/03879a00-bdbc-4f9c-baef-0550357c2d93/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,3,373.31,0.00,56.01,317.30,10.52,0.00,162.97,20.00,179.82,25.00,0.00
total,UAH,3,373.31,0.00,56.01,317.30,10.52,0.00,162.97,20.00,179.82,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/c440e1eb-4bcf-42d4-8e8d-be3069187259` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/c440e1eb-4bcf-42d4-8e8d-be3069187259",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "72f506b2-45da-4a87-8303-64f7263b18dd"
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
  "device_ref": "sandbox-16400"
}
```

```json
{
  "challenge_id": "f8e8447a-dd39-4167-a1cd-b257267a811c",
  "expires_at": "2026-10-28T10:31:19.133560726Z",
  "resend_available_at": "2026-10-28T10:26:20.133560726Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "219706",
  "sent_at": "2026-10-28T10:26:19.135793435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8e8447a-dd39-4167-a1cd-b257267a811c",
  "code": "219706",
  "device_ref": "sandbox-16400"
}
```

```json
{
  "session_id": "54800c81-7a4a-4596-86a9-105c5efe3754",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDA3OSwiaWF0IjoxNzkzMTgzMTc5LCJqdGkiOiIzYmJmNzgzOC0yMzYxLTQ2OWUtOTVjMC1kNWZhODk4MDYwZGUiLCJzaWQiOiI1NDgwMGM4MS03YTRhLTQ1OTYtODZhOS0xMDVjNWVmZTM3NTQifQ.h5Z6C6g5QxyQeiOclTJTv4_GCbPp8brjbYIHaP6I5I8",
  "access_expires_at": "2026-10-28T10:41:19.37139699Z",
  "refresh_token": "b9o8xnc7PaERQ3VnSYMH4eGFo9NPtPjHyhY1gw98QMk",
  "refresh_expires_at": "2026-11-27T10:26:19.370762236Z",
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
  "command_id": "62ee7ca9-f262-4cf8-a5d8-4859cb8e6ffa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:26:19Z",
    "sequence": 1793183180193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "47e509ce-f175-46a6-8513-f1f382b7c793",
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
  "last_heartbeat_at": "2026-10-28T10:26:20.016213Z",
  "last_location_at": "2026-10-28T10:26:20.016213Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "095ecdf9-fbd1-4020-b87e-e592f741349a",
  "points": [
    {
      "sequence": 1793183182235,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:25:22Z"
    },
    {
      "sequence": 1793183182241,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T10:26:22Z"
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
  "session_id": "ba5373c5-f222-4ea9-a94b-3fdc4c475573",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwODIsImlhdCI6MTc5MzE4MzE4MiwianRpIjoiZmZiZjZjODYtMzZhZC00MDM3LWIzZjgtNDI3ZTYxODllODU5Iiwic2lkIjoiYmE1MzczYzUtZjIyMi00ZWE5LWE5NGItM2ZkYzRjNDc1NTczIn0.aNlmjYBg6NtrUZrZw8ySblOvQ3PNCsecz_gbjBfraug",
  "access_expires_at": "2026-10-28T10:41:22.777098541Z",
  "refresh_token": "c0GuTdjIIrBi4xzyJf8UqJDLUEReU0VYyYUBBbrfZ6I",
  "refresh_expires_at": "2026-10-28T22:26:22.77660963Z",
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
      "id": "358706d7-09a5-438a-a14e-b5638f4fdcc1",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T10:26:22Z",
        "track_point_id": "a80487c3-6061-47ff-8144-6bfd0d2b6552",
        "work_session_id": "47e509ce-f175-46a6-8513-f1f382b7c793"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T10:26:22Z",
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

`POST /api/admin/v1/driver-risk-flags/358706d7-09a5-438a-a14e-b5638f4fdcc1/confirm` → **200**

```json
{
  "command_id": "645d5673-a071-481b-85f7-422fe3e223c7",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "358706d7-09a5-438a-a14e-b5638f4fdcc1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T10:26:22Z",
    "track_point_id": "a80487c3-6061-47ff-8144-6bfd0d2b6552",
    "work_session_id": "47e509ce-f175-46a6-8513-f1f382b7c793"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T10:26:22Z",
  "reason": null,
  "reviewed_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "reviewed_at": "2026-10-28T10:26:24.714382Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/358706d7-09a5-438a-a14e-b5638f4fdcc1/dismiss` → **409**

```json
{
  "command_id": "1e98b630-5f64-46b2-8ee0-bd566e447b05",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/358706d7-09a5-438a-a14e-b5638f4fdcc1/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5af5ba29-e5d1-4187-8a23-8eb25da5832c"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "95b96516-b327-4520-ab07-62b0a56af68c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "bef533c9-742a-466f-83d5-32549bdfc099",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "raised_at": "2026-10-28T10:26:25.1665Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/bef533c9-742a-466f-83d5-32549bdfc099/dismiss` → **200**

```json
{
  "command_id": "9223b48e-f89e-4691-b6a8-be854f668080",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "bef533c9-742a-466f-83d5-32549bdfc099",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "raised_at": "2026-10-28T10:26:25.1665Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "reviewed_at": "2026-10-28T10:26:25.394599Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "7f6894fa-6a06-47a7-b7b9-1314bad7369c",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "358706d7-09a5-438a-a14e-b5638f4fdcc1"
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
      "actor_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:26:25.619583Z"
    }
  ]
}
```

Done: flag 358706d7-09a5-438a-a14e-b5638f4fdcc1 confirmed, suspension named it, driver reinstated.

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
  "session_id": "9b08ad89-efa3-481c-8fcb-5f89daa43223",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwODYsImlhdCI6MTc5MzE4MzE4NiwianRpIjoiYWY4NGJlNGMtMThjZi00M2Q4LWE5YzktMjY0YmI0MTAzMDk5Iiwic2lkIjoiOWIwOGFkODktZWZhMy00ODFjLThmY2ItNWY4OWRhYTQzMjIzIn0.d4X3hv36qCOLfCJWjax1geZyYMt5V8VHmNDwPRt2Iqo",
  "access_expires_at": "2026-10-28T10:41:26.343199402Z",
  "refresh_token": "DdYI8A76OX4egOTFE1sX3ZlbkcZxGjtdl87AqyFdtkI",
  "refresh_expires_at": "2026-10-28T22:26:26.342569965Z",
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
      "actor_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:26:25.619583Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "76856dda-831b-4dab-bf05-52eab94329fe",
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
  "session_id": "47e509ce-f175-46a6-8513-f1f382b7c793",
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
  "last_heartbeat_at": "2026-10-28T10:26:20.016213Z",
  "last_location_at": "2026-10-28T10:26:20.016213Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/47e509ce-f175-46a6-8513-f1f382b7c793/close` → **200**

```json
{
  "command_id": "49463c26-057e-4f1e-8db4-6c04c9e7fae0",
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
  "session_id": "e6fc2281-1119-4434-8c95-7a2055bff0e6",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwODcsImlhdCI6MTc5MzE4MzE4NywianRpIjoiZmI0OTVlMTYtYWE4My00Mzg1LTkxMDQtNjIzZjY2MjU0NDQ0Iiwic2lkIjoiZTZmYzIyODEtMTExOS00NDM0LThjOTUtN2EyMDU1YmZmMGU2In0.Mrs2Upz0ttx6TtQ6V5jn8rLak-nBO2W-A2cAa3f-SZY",
  "access_expires_at": "2026-10-28T10:41:27.749073912Z",
  "refresh_token": "tulzIRp7U5XHuoaBwJHcu9xX5Ks0lOPhl1guxosyljw",
  "refresh_expires_at": "2026-10-28T22:26:27.748492453Z",
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
  "command_id": "2acce47b-0322-4306-9f2d-8e99e447ff67",
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
  "changed_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:26:28.189769Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "2acce47b-0322-4306-9f2d-8e99e447ff67",
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
  "changed_by": "a9faa988-63c8-49e7-a33f-3d7514625d14",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T10:26:28.189769Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48233246970",
  "device_ref": "sandbox-5503"
}
```

```json
{
  "challenge_id": "85858496-fe60-4455-ad17-bd3f4ba1b838",
  "expires_at": "2026-10-28T10:31:28.641368634Z",
  "resend_available_at": "2026-10-28T10:26:29.641368634Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48233246970` → **200**

```json
{
  "phone": "+48233246970",
  "audience": "CLIENT",
  "code": "380267",
  "sent_at": "2026-10-28T10:26:28.643570183Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85858496-fe60-4455-ad17-bd3f4ba1b838",
  "code": "380267",
  "device_ref": "sandbox-5503"
}
```

```json
{
  "session_id": "69372792-2236-4961-9e1d-275106f2d227",
  "subject": {
    "type": "CLIENT",
    "id": "1591157f-5a0e-482c-99b5-1bc3e0cc121c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTkxMTU3Zi01YTBlLTQ4MmMtOTliNS0xYmMzZTBjYzEyMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDg4LCJpYXQiOjE3OTMxODMxODgsImp0aSI6IjU3ODkzODM0LTVmYmUtNDc0My1hOWFmLThlNzVmYTk5NTM0MiIsInNpZCI6IjY5MzcyNzkyLTIyMzYtNDk2MS05ZTFkLTI3NTEwNmYyZDIyNyJ9.VRKaxNBJx7oaeQrYnk8ycauvx9Z8bkyATkiq8ZYLU-Q",
  "access_expires_at": "2026-10-28T10:41:28.876060993Z",
  "refresh_token": "hXHPrvk1ov0zpYf6F4rGObCnePHNxQtqKe5g5HwJ3X4",
  "refresh_expires_at": "2026-11-27T10:26:28.875456799Z",
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
  "correlation_id": "ce49ea30-8f7f-4e3c-95df-6e6dca137ddf"
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
  "device_ref": "sandbox-31436"
}
```

```json
{
  "challenge_id": "7099b8d2-85c6-4988-ac12-f3210db2adcf",
  "expires_at": "2026-10-28T10:31:29.524646958Z",
  "resend_available_at": "2026-10-28T10:26:30.524646958Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "423694",
  "sent_at": "2026-10-28T10:26:29.526774722Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7099b8d2-85c6-4988-ac12-f3210db2adcf",
  "code": "423694",
  "device_ref": "sandbox-31436"
}
```

```json
{
  "session_id": "e72f0059-230c-45a6-ab60-1b5aaa7d669b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDA4OSwiaWF0IjoxNzkzMTgzMTg5LCJqdGkiOiIxNTk5ODJmZi0zMDBmLTQyZjMtOWE4MS1mZGE5NDE3OWE3YTkiLCJzaWQiOiJlNzJmMDA1OS0yMzBjLTQ1YTYtYWI2MC0xYjVhYWE3ZDY2OWIifQ.5nMy5xP-u6_t7lRxc_k9rkZDP8r3y0PFSY-Tf3lGo4Y",
  "access_expires_at": "2026-10-28T10:41:29.760158888Z",
  "refresh_token": "ZwgXXgi8WQ8XQ9b9RuzN-lzuWN4ahypkDcGDfSk5XvE",
  "refresh_expires_at": "2026-11-27T10:26:29.759653491Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3a8c0148-79c2-4b4f-9acb-6e3cef027ced",
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
  "last_heartbeat_at": "2026-10-28T10:26:04.190049Z",
  "last_location_at": "2026-10-28T10:26:04.190049Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3a8c0148-79c2-4b4f-9acb-6e3cef027ced/handover` → **200**

```json
{
  "command_id": "e833b0b0-9a99-4fd1-8e18-3e1711250aff",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3a8c0148-79c2-4b4f-9acb-6e3cef027ced",
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
  "last_heartbeat_at": "2026-10-28T10:26:04.190049Z",
  "last_location_at": "2026-10-28T10:26:04.190049Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3a8c0148-79c2-4b4f-9acb-6e3cef027ced/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:26:30Z",
    "sequence": 1793183190406
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "3a8c0148-79c2-4b4f-9acb-6e3cef027ced",
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
  "last_heartbeat_at": "2026-10-28T10:26:30.42071Z",
  "last_location_at": "2026-10-28T10:26:30.42071Z",
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
  "session_id": "3a8c0148-79c2-4b4f-9acb-6e3cef027ced",
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
  "last_heartbeat_at": "2026-10-28T10:26:30.42071Z",
  "last_location_at": "2026-10-28T10:26:30.42071Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a8c0148-79c2-4b4f-9acb-6e3cef027ced/close` → **200**

```json
{
  "command_id": "aada3460-19b5-4e13-96ea-0cb30c4a17bc",
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
  "correlation_id": "68f048fd-65c6-41da-8980-b4e95187f213"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674297344",
  "device_ref": "sandbox-23190"
}
```

```json
{
  "challenge_id": "54258920-a013-48a6-b659-f1a80914b10a",
  "expires_at": "2026-10-28T10:31:31.514942558Z",
  "resend_available_at": "2026-10-28T10:26:32.514942558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674297344` → **200**

```json
{
  "phone": "+380674297344",
  "audience": "CLIENT",
  "code": "888316",
  "sent_at": "2026-10-28T10:26:31.517059566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54258920-a013-48a6-b659-f1a80914b10a",
  "code": "888316",
  "device_ref": "sandbox-23190"
}
```

```json
{
  "session_id": "a36f25d2-e0bf-42fd-9ffd-8fe904e5b353",
  "subject": {
    "type": "CLIENT",
    "id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYWE1ZjQ2Yy1mNTEyLTQzYTktOGQyOS03ODMyY2NhM2FmOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTg0MDkxLCJpYXQiOjE3OTMxODMxOTEsImp0aSI6IjIyNTQzMWM3LTBkYmYtNDUzYy04ZTNhLWIyZGZmMzhmZjRjYyIsInNpZCI6ImEzNmYyNWQyLWUwYmYtNDJmZC05ZmZkLThmZTkwNGU1YjM1MyJ9.jf1XRj8cLoMYkmNs3ov2JOjj8QaOrkRcGFO-pnG5Iow",
  "access_expires_at": "2026-10-28T10:41:31.751775602Z",
  "refresh_token": "QNEFFQdKciwy-sOMQZV96uC5dNK2T6GJYPUvx3EQTLU",
  "refresh_expires_at": "2026-11-27T10:26:31.751307422Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "40466a4d-c0d0-4de4-b5bf-93dc5e864c41",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "512df69c-5829-4cc3-a691-77aaced53ea4",
  "upload_path": "/api/rider/v1/uploads/512df69c-5829-4cc3-a691-77aaced53ea4",
  "expires_at": "2026-10-28T10:41:31.969653336Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/512df69c-5829-4cc3-a691-77aaced53ea4` → **200**

```json
{
  "file_id": "512df69c-5829-4cc3-a691-77aaced53ea4",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "f7ec6406-8bc6-4995-b8f7-577bbb9522c8",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "512df69c-5829-4cc3-a691-77aaced53ea4"
  ]
}
```

```json
{
  "id": "da618ccc-00f9-4d97-ae39-6884ca404527",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:26:32.219762Z",
  "updated_at": "2026-10-28T10:26:32.219762Z",
  "messages": [
    {
      "id": "9db11318-672f-4690-925b-86c8b6f7ea53",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:26:32.221103Z",
      "attachments": [
        {
          "file_id": "512df69c-5829-4cc3-a691-77aaced53ea4",
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
  "session_id": "119d2ae8-b607-48f6-b5b6-630b4bc6fc47",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwOTIsImlhdCI6MTc5MzE4MzE5MiwianRpIjoiMDlhNGM4Y2MtYTU2MC00NDgyLTkxMzktMzExZDFkYTk1YjA0Iiwic2lkIjoiMTE5ZDJhZTgtYjYwNy00OGY2LWI1YjYtNjMwYjRiYzZmYzQ3In0.jKhuaOQdB8B7UAMQAbfUPeEAsqTpQvB8M7x2FNg7Aj0",
  "access_expires_at": "2026-10-28T10:41:32.733528862Z",
  "refresh_token": "TC4uZLXxjB6XGnyf1zxtjr_FXZQNxscY_uL3bJS0RpE",
  "refresh_expires_at": "2026-10-28T22:26:32.733056222Z",
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
  "session_id": "d071b5a0-ad1b-4db6-8c4e-61af5ce2eb9e",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwOTMsImlhdCI6MTc5MzE4MzE5MywianRpIjoiZGM1Zjg3MWYtMDhkNS00MWY3LThjNDItOGQ4ZTliMzEwMTM0Iiwic2lkIjoiZDA3MWI1YTAtYWQxYi00ZGI2LThjNGUtNjFhZjVjZTJlYjllIn0.abECsBXrMDffGBgKw3QOPlOqJ-z5VwNwkocHg0Qe3I0",
  "access_expires_at": "2026-10-28T10:41:33.224120544Z",
  "refresh_token": "kavFe92QH9pulQsc08bZxfB0bgD02dIqR44mdk7H4as",
  "refresh_expires_at": "2026-10-28T22:26:33.223366825Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/da618ccc-00f9-4d97-ae39-6884ca404527/attachments/512df69c-5829-4cc3-a691-77aaced53ea4` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "9925d781-6f87-4bb8-ba8a-3f2adf668bf9",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "a1ca1f2f-7c25-46dd-9e63-441c3d3d2477",
  "upload_path": "/api/operator/v1/uploads/a1ca1f2f-7c25-46dd-9e63-441c3d3d2477",
  "expires_at": "2026-10-28T10:41:33.45650308Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/a1ca1f2f-7c25-46dd-9e63-441c3d3d2477` → **200**

```json
{
  "file_id": "a1ca1f2f-7c25-46dd-9e63-441c3d3d2477",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/da618ccc-00f9-4d97-ae39-6884ca404527` → **200**

```json
{
  "id": "da618ccc-00f9-4d97-ae39-6884ca404527",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T10:26:32.219762Z",
  "updated_at": "2026-10-28T10:26:32.219762Z",
  "messages": [
    {
      "id": "9db11318-672f-4690-925b-86c8b6f7ea53",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:26:32.221103Z",
      "attachments": [
        {
          "file_id": "512df69c-5829-4cc3-a691-77aaced53ea4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/da618ccc-00f9-4d97-ae39-6884ca404527/comments` → **200**

```json
{
  "command_id": "c22fc9e9-1153-45b7-9233-db3cede74abb",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "a1ca1f2f-7c25-46dd-9e63-441c3d3d2477"
  ]
}
```

```json
{
  "id": "da618ccc-00f9-4d97-ae39-6884ca404527",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:26:32.219762Z",
  "updated_at": "2026-10-28T10:26:33.933485Z",
  "messages": [
    {
      "id": "9db11318-672f-4690-925b-86c8b6f7ea53",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:26:32.221103Z",
      "attachments": [
        {
          "file_id": "512df69c-5829-4cc3-a691-77aaced53ea4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cc382d19-cc10-4f42-bcb9-220d854b2fd9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:26:33.933087Z",
      "attachments": [
        {
          "file_id": "a1ca1f2f-7c25-46dd-9e63-441c3d3d2477",
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

`GET /api/rider/v1/support/cases/da618ccc-00f9-4d97-ae39-6884ca404527` → **200**

```json
{
  "id": "da618ccc-00f9-4d97-ae39-6884ca404527",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T10:26:32.219762Z",
  "updated_at": "2026-10-28T10:26:33.933485Z",
  "messages": [
    {
      "id": "9db11318-672f-4690-925b-86c8b6f7ea53",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "2aa5f46c-f512-43a9-8d29-7832cca3af9f",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T10:26:32.221103Z",
      "attachments": [
        {
          "file_id": "512df69c-5829-4cc3-a691-77aaced53ea4",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cc382d19-cc10-4f42-bcb9-220d854b2fd9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T10:26:33.933087Z",
      "attachments": [
        {
          "file_id": "a1ca1f2f-7c25-46dd-9e63-441c3d3d2477",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/da618ccc-00f9-4d97-ae39-6884ca404527/attachments/a1ca1f2f-7c25-46dd-9e63-441c3d3d2477` → **200**

Done: support case da618ccc-00f9-4d97-ae39-6884ca404527, rider attachment 512df69c-5829-4cc3-a691-77aaced53ea4, operator attachment a1ca1f2f-7c25-46dd-9e63-441c3d3d2477.

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
  "session_id": "19d65272-85a1-4aaa-aa2b-47fd69c0ade7",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwOTQsImlhdCI6MTc5MzE4MzE5NCwianRpIjoiZjdhYjVlZGItNWVjMS00ZGY4LWJjNGMtOTcwZDg5NjRiNmJmIiwic2lkIjoiMTlkNjUyNzItODVhMS00YWFhLWFhMmItNDdmZDY5YzBhZGU3In0.2PAfqzcprnj1oFSYqsmh3N4NzanOkEfNtDSMLRysgZ8",
  "access_expires_at": "2026-10-28T10:41:34.67660971Z",
  "refresh_token": "dQfpQAQcVnK3d4ZbnPzQ3ea6kPItL4ggCO-AJKUxyZk",
  "refresh_expires_at": "2026-10-28T22:26:34.67611416Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25893"
}
```

```json
{
  "challenge_id": "e8bb224d-cad9-4ef9-8f48-b8bda663510a",
  "expires_at": "2026-10-28T10:31:34.888891987Z",
  "resend_available_at": "2026-10-28T10:26:35.888891987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "886813",
  "sent_at": "2026-10-28T10:26:34.891010218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8bb224d-cad9-4ef9-8f48-b8bda663510a",
  "code": "886813",
  "device_ref": "sandbox-25893"
}
```

```json
{
  "session_id": "ece75b0a-7f79-4fda-bc66-e0260c0d47ec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDA5NSwiaWF0IjoxNzkzMTgzMTk1LCJqdGkiOiJkOTNlZDdiZC0yNmZkLTQxZWUtOWIwNC04MjkyZDYyM2UyM2MiLCJzaWQiOiJlY2U3NWIwYS03Zjc5LTRmZGEtYmM2Ni1lMDI2MGMwZDQ3ZWMifQ.Ua027j048mBDK8Bz5S4J8d5BIxUhxXv11_uSUGfRGbA",
  "access_expires_at": "2026-10-28T10:41:35.120777408Z",
  "refresh_token": "k6tXyP9UR_HRm_hWUyUeeEV4N18DiiUghBWOm9VeOl8",
  "refresh_expires_at": "2026-11-27T10:26:35.120228177Z",
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
      "actor_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T10:26:25.619583Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "a9faa988-63c8-49e7-a33f-3d7514625d14",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T10:26:26.808984Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "19ca1bc0-be77-4c99-9489-aa4883521af6",
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
  "device_ref": "sandbox-8903"
}
```

```json
{
  "challenge_id": "cd09d950-b66e-4f86-8e15-236751cbcee2",
  "expires_at": "2026-10-28T10:31:35.998313657Z",
  "resend_available_at": "2026-10-28T10:26:36.998313657Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "957311",
  "sent_at": "2026-10-28T10:26:36.00044837Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd09d950-b66e-4f86-8e15-236751cbcee2",
  "code": "957311",
  "device_ref": "sandbox-8903"
}
```

```json
{
  "session_id": "4ac4ea71-bf63-4d34-b4c8-bf3ee77b6189",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE4NDA5NiwiaWF0IjoxNzkzMTgzMTk2LCJqdGkiOiI1ZmRkNWM0Ny1mODZlLTQ5ZTMtOGM4NC0xMGZlNzk0ZDUyN2QiLCJzaWQiOiI0YWM0ZWE3MS1iZjYzLTRkMzQtYjRjOC1iZjNlZTc3YjYxODkifQ.FoWJTPQwaLwfM4VpteaMYYxU5f9q0Dyiw64orWD40C8",
  "access_expires_at": "2026-10-28T10:41:36.23274479Z",
  "refresh_token": "Q158JCgpJx5d4_vOjjy5m99xZ2KNH4GyMeYKHEkNUhY",
  "refresh_expires_at": "2026-11-27T10:26:36.232116579Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:26:07.369808Z",
  "last_location_at": "2026-10-28T10:26:07.369808Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/handover` → **200**

```json
{
  "command_id": "c6e3072a-f227-4814-9d6d-1efddf45214d",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T10:26:07.369808Z",
  "last_location_at": "2026-10-28T10:26:07.369808Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb3037c-8692-4190-af1d-096c4b93254b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:26:36Z",
    "sequence": 1793183196891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4fb3037c-8692-4190-af1d-096c4b93254b",
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
  "last_heartbeat_at": "2026-10-28T10:26:36.906123Z",
  "last_location_at": "2026-10-28T10:26:36.906123Z",
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
  "command_id": "67561bf0-05cd-4332-a0b9-a26f23f2239c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T10:26:37Z",
    "sequence": 1793183197324
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8418599f-5803-4c99-89a2-541f16238de9",
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
  "last_heartbeat_at": "2026-10-28T10:26:37.339202Z",
  "last_location_at": "2026-10-28T10:26:37.339202Z",
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
  "session_id": "517e6727-73a0-49bd-a295-08858cc214dd",
  "subject": {
    "type": "STAFF",
    "id": "a9faa988-63c8-49e7-a33f-3d7514625d14"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWZhYTk4OC02M2M4LTQ5ZTctYTMzZi0zZDc1MTQ2MjVkMTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxODQwOTcsImlhdCI6MTc5MzE4MzE5NywianRpIjoiMzYwNDljMDMtNDA0ZS00MDQyLWI5N2EtZTQ3YmViNDM1NTM5Iiwic2lkIjoiNTE3ZTY3MjctNzNhMC00OWJkLWEyOTUtMDg4NThjYzIxNGRkIn0.LsHoySHm_fKVJ5tOIsSGRjgq8FWXTIbwxdn6xl-xM6M",
  "access_expires_at": "2026-10-28T10:41:37.8316285Z",
  "refresh_token": "Ni5OeYAytKpbNZWrmG738FoNTPke6uii4sOXW3KIqFE",
  "refresh_expires_at": "2026-10-28T22:26:37.831022572Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "186a5c6f-48af-48ad-a075-69704754639b",
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
  "id": "be59ebde-b904-446e-af7d-a63f86725c12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T10:31:38.047338Z",
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
  "command_id": "0a3a5da7-9639-476e-a5f5-fa8c9bdb74e3",
  "quote_id": "be59ebde-b904-446e-af7d-a63f86725c12",
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
  "id": "339ecdea-59f1-413b-bcb9-94ef4c6314b2",
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
  "created_at": "2026-10-28T10:26:38.274364Z",
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

**Contract validation failed — scenario stopped.**
