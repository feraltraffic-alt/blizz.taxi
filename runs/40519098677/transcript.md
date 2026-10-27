# Sandbox transcript (2026-10-27T14:14:35Z, e57a059)

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
  "correlation_id": "e33a8dbb-254c-4035-8f62-46e258d035a8"
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
  "session_id": "556c5408-30dc-4db7-b8ff-db80ad8c4f1e",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzNzYsImlhdCI6MTc5MzExMDQ3NiwianRpIjoiZDdhYTJiZjAtNDM1MS00ZTQ4LTg1YzMtODU1OWRhYWZmZDdiIiwic2lkIjoiNTU2YzU0MDgtMzBkYy00ZGI3LWI4ZmYtZGI4MGFkOGM0ZjFlIn0.u42sbkDVuet8O-D1c88AT8nnYUpsgioeRMs2BoDN_0k",
  "access_expires_at": "2026-10-27T14:29:36.678090961Z",
  "refresh_token": "XBYy8qWbcYbiaZnqrUJADzk0DL8tU41unfHPByYWuAw",
  "refresh_expires_at": "2026-10-28T02:14:36.675876513Z",
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
  "session_id": "1425a874-e320-4fab-9cf3-7908f89b64fd",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzNzcsImlhdCI6MTc5MzExMDQ3NywianRpIjoiMmE5YWY0N2MtYzM2OC00MjljLTk5MmUtNGZlNGRjN2JjZjdjIiwic2lkIjoiMTQyNWE4NzQtZTMyMC00ZmFiLTljZjMtNzkwOGY4OWI2NGZkIn0.RvdR9oJzuWsCLY47lsNQYSX2TXc8CkEBcXwhVGfRSF4",
  "access_expires_at": "2026-10-27T14:29:37.900047487Z",
  "refresh_token": "XmeJzyOjwUuIbLP35Xsx2GEsGwDkI7xK2JZUISS90zg",
  "refresh_expires_at": "2026-10-28T02:14:37.899004661Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "96d9e870-37d6-4cc2-854a-6129c94a17c6",
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
  "id": "6dd5c276-5b7d-49f4-b754-9716dd2f342e",
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
  "created_by": "d51c635c-c2ad-4379-8794-e3c6dc229353",
  "created_at": "2026-10-27T14:14:37.967544Z",
  "updated_at": "2026-10-27T14:14:37.967544Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636044269",
  "device_ref": "sandbox-30458"
}
```

```json
{
  "challenge_id": "65843477-4618-4472-af53-a2aab04096ec",
  "expires_at": "2026-10-27T14:19:38.014116997Z",
  "resend_available_at": "2026-10-27T14:14:39.014116997Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636044269` → **200**

```json
{
  "phone": "+380636044269",
  "audience": "CLIENT",
  "code": "101193",
  "sent_at": "2026-10-27T14:14:38.020307061Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65843477-4618-4472-af53-a2aab04096ec",
  "code": "101193",
  "device_ref": "sandbox-30458"
}
```

```json
{
  "session_id": "8a935f09-6076-4261-8926-92c8a7c3c6f5",
  "subject": {
    "type": "CLIENT",
    "id": "fbfda8be-49b0-4ac2-a63d-6349511379ba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYmZkYThiZS00OWIwLTRhYzItYTYzZC02MzQ5NTExMzc5YmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTExMzc4LCJpYXQiOjE3OTMxMTA0NzgsImp0aSI6IjNmNjViMmRiLWJjYWEtNGUwNy1hMDhkLTM0NTUxOWFlNjNlYiIsInNpZCI6IjhhOTM1ZjA5LTYwNzYtNDI2MS04OTI2LTkyYzhhN2MzYzZmNSJ9.nd7PujTnGs7FXul4TIR4uTJEbe-5Ocu2O6fOjS80oVc",
  "access_expires_at": "2026-10-27T14:29:38.091700311Z",
  "refresh_token": "uNIGPVC3jjt_59DtofseeGKmHWa5Cl7nS4ecGfUJFHA",
  "refresh_expires_at": "2026-11-26T14:14:38.090533599Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636044269` → **200**

```json
{
  "client_id": "fbfda8be-49b0-4ac2-a63d-6349511379ba"
}
```

`POST /api/admin/v1/rider-wallets/fbfda8be-49b0-4ac2-a63d-6349511379ba/top-ups` → **201**

```json
{
  "command_id": "7eda2ebd-aec6-4e59-b26f-d4de75a6a8a1",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "fbfda8be-49b0-4ac2-a63d-6349511379ba",
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
      "id": "aeee4707-c59f-46b7-97b6-e44b4b818806",
      "at": "2026-10-27T14:14:38.171372Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d51c635c-c2ad-4379-8794-e3c6dc229353",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aff6cc31-cace-4b2b-8c7d-3ff35b55c101",
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
  "id": "8d4d1b9c-8d88-488d-a24e-2f2eaa4d46fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:19:38.340962Z",
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
      "id": "6dd5c276-5b7d-49f4-b754-9716dd2f342e",
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
  "device_ref": "sandbox-25372"
}
```

```json
{
  "challenge_id": "d6535f8f-ea58-484d-8b35-ffb6f9061ba8",
  "expires_at": "2026-10-27T14:19:38.408184942Z",
  "resend_available_at": "2026-10-27T14:14:39.408184942Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "187397",
  "sent_at": "2026-10-27T14:14:38.411775791Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6535f8f-ea58-484d-8b35-ffb6f9061ba8",
  "code": "187397",
  "device_ref": "sandbox-25372"
}
```

```json
{
  "session_id": "944a17a4-21a8-4aa8-8a13-f2310d22431a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTM3OCwiaWF0IjoxNzkzMTEwNDc4LCJqdGkiOiJjYmJkMzhlNy0zYjRhLTQxNjktYThhZS05YTUwMDk1Nzg2OTIiLCJzaWQiOiI5NDRhMTdhNC0yMWE4LTRhYTgtOGExMy1mMjMxMGQyMjQzMWEifQ.o3eF2H8ZexUYgLlVlRqWwZxHbvZnIZnsT26C4S4-X6E",
  "access_expires_at": "2026-10-27T14:29:38.465300075Z",
  "refresh_token": "hGqdRiJwsvg4nyPBdL1sVqKLMsognPjd0o-KyIZUoEI",
  "refresh_expires_at": "2026-11-26T14:14:38.464279199Z",
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
  "command_id": "a57360dd-a8f8-4894-8fda-4d330cdec83e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:38Z",
    "sequence": 1793110478530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d77f905d-f526-4a7f-8bab-e9cfb6447afe",
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
  "last_heartbeat_at": "2026-10-27T14:14:38.577205Z",
  "last_location_at": "2026-10-27T14:14:38.577205Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2af4db6e-6295-4b8c-b1b5-6e4081a4e983",
  "quote_id": "8d4d1b9c-8d88-488d-a24e-2f2eaa4d46fb",
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
  "id": "5d0f6b50-f9d9-49af-b564-48032a504dce",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fbfda8be-49b0-4ac2-a63d-6349511379ba",
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
  "created_at": "2026-10-27T14:14:38.688533Z",
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
  "client_id": "fbfda8be-49b0-4ac2-a63d-6349511379ba",
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
      "id": "aeee4707-c59f-46b7-97b6-e44b4b818806",
      "at": "2026-10-27T14:14:38.171372Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d51c635c-c2ad-4379-8794-e3c6dc229353",
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
    "id": "23f0ae9b-f076-4076-b112-4500de9f9092",
    "order_id": "5d0f6b50-f9d9-49af-b564-48032a504dce",
    "expires_at": "2026-10-27T14:14:53.704035Z",
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

`POST /api/driver/v1/offers/23f0ae9b-f076-4076-b112-4500de9f9092/accept` → **200**

```json
{
  "command_id": "7c691e68-0470-48b1-b4ab-a283f5e3ce02"
}
```

```json
{
  "id": "9a7ee319-c207-4d9f-a768-c2cfb92c324c",
  "order_id": "5d0f6b50-f9d9-49af-b564-48032a504dce",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3103fa5d-f04c-4b74-b1f9-35397c7aea91",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3103fa5d-f04c-4b74-b1f9-35397c7aea91",
  "order_id": "5d0f6b50-f9d9-49af-b564-48032a504dce",
  "assignment_id": "9a7ee319-c207-4d9f-a768-c2cfb92c324c",
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

`POST /api/driver/v1/work-sessions/d77f905d-f526-4a7f-8bab-e9cfb6447afe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:38Z",
    "sequence": 1793110478864
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d77f905d-f526-4a7f-8bab-e9cfb6447afe",
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
  "last_heartbeat_at": "2026-10-27T14:14:38.884916Z",
  "last_location_at": "2026-10-27T14:14:38.884916Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3103fa5d-f04c-4b74-b1f9-35397c7aea91/arrive` → **200**

```json
{
  "command_id": "e5c07e97-2386-4f15-9346-59bdbf48842f",
  "expected_version": 0
}
```

```json
{
  "id": "3103fa5d-f04c-4b74-b1f9-35397c7aea91",
  "order_id": "5d0f6b50-f9d9-49af-b564-48032a504dce",
  "assignment_id": "9a7ee319-c207-4d9f-a768-c2cfb92c324c",
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
  "arrived_at": "2026-10-27T14:14:38.930726Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/3103fa5d-f04c-4b74-b1f9-35397c7aea91/start` → **200**

```json
{
  "command_id": "35c113b5-b28e-4e45-93f4-fe53ba3fd259",
  "expected_version": 1
}
```

```json
{
  "id": "3103fa5d-f04c-4b74-b1f9-35397c7aea91",
  "order_id": "5d0f6b50-f9d9-49af-b564-48032a504dce",
  "assignment_id": "9a7ee319-c207-4d9f-a768-c2cfb92c324c",
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
  "arrived_at": "2026-10-27T14:14:38.930726Z",
  "started_at": "2026-10-27T14:14:38.970162Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/3103fa5d-f04c-4b74-b1f9-35397c7aea91/complete` → **200**

```json
{
  "command_id": "789ba233-3813-48ce-aed5-6e5b24c865d3",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:14:39Z",
  "cash_received": true
}
```

```json
{
  "id": "3103fa5d-f04c-4b74-b1f9-35397c7aea91",
  "order_id": "5d0f6b50-f9d9-49af-b564-48032a504dce",
  "assignment_id": "9a7ee319-c207-4d9f-a768-c2cfb92c324c",
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
  "arrived_at": "2026-10-27T14:14:38.930726Z",
  "started_at": "2026-10-27T14:14:38.970162Z",
  "completed_at": "2026-10-27T14:14:39.029803Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fbfda8be-49b0-4ac2-a63d-6349511379ba",
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
      "id": "5493237a-b521-447e-af97-3a1d3776a591",
      "at": "2026-10-27T14:14:39.800691Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "5d0f6b50-f9d9-49af-b564-48032a504dce"
    },
    {
      "id": "aeee4707-c59f-46b7-97b6-e44b4b818806",
      "at": "2026-10-27T14:14:38.171372Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d51c635c-c2ad-4379-8794-e3c6dc229353",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/6dd5c276-5b7d-49f4-b754-9716dd2f342e/archive` → **200**

```json
{
  "command_id": "b3c37bfa-9e94-4c17-9b27-925edd2ad009",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "6dd5c276-5b7d-49f4-b754-9716dd2f342e",
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
  "created_by": "d51c635c-c2ad-4379-8794-e3c6dc229353",
  "created_at": "2026-10-27T14:14:37.967544Z",
  "updated_at": "2026-10-27T14:14:42.121228Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d77f905d-f526-4a7f-8bab-e9cfb6447afe",
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
  "last_heartbeat_at": "2026-10-27T14:14:38.884916Z",
  "last_location_at": "2026-10-27T14:14:38.884916Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d77f905d-f526-4a7f-8bab-e9cfb6447afe/close` → **200**

```json
{
  "command_id": "1147cc72-9bda-4da8-a968-cedbc413b9a7",
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

Done: order 5d0f6b50-f9d9-49af-b564-48032a504dce.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630347509",
  "device_ref": "sandbox-20002"
}
```

```json
{
  "challenge_id": "017c7410-53df-407e-a664-96feb0d6112d",
  "expires_at": "2026-10-27T14:19:42.230326684Z",
  "resend_available_at": "2026-10-27T14:14:43.230326684Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630347509` → **200**

```json
{
  "phone": "+380630347509",
  "audience": "CLIENT",
  "code": "494159",
  "sent_at": "2026-10-27T14:14:42.234196592Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "017c7410-53df-407e-a664-96feb0d6112d",
  "code": "494159",
  "device_ref": "sandbox-20002"
}
```

```json
{
  "session_id": "548a4b11-c874-4e1c-9396-818ef5ad6fa1",
  "subject": {
    "type": "CLIENT",
    "id": "9315e8ed-c550-461d-ab53-9e969d83e56d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzE1ZThlZC1jNTUwLTQ2MWQtYWI1My05ZTk2OWQ4M2U1NmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTExMzgyLCJpYXQiOjE3OTMxMTA0ODIsImp0aSI6IjEwOGZmZjRlLTAwMTctNDllZi05MzQ2LWE5ZmQxOWYxODU4MCIsInNpZCI6IjU0OGE0YjExLWM4NzQtNGUxYy05Mzk2LTgxOGVmNWFkNmZhMSJ9.qE9Sv1SktTqTzAjqUU4zzktUVVwYEnnIGGniXQvb9n0",
  "access_expires_at": "2026-10-27T14:29:42.28384958Z",
  "refresh_token": "XUWkx1Mpm6cQYz_FH_zazzafP3EcwxZhNoSVNj-Uqak",
  "refresh_expires_at": "2026-11-26T14:14:42.283003502Z",
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
  "device_ref": "sandbox-25822"
}
```

```json
{
  "challenge_id": "3343034a-1ae2-4cde-bbd2-b83f4dac8a31",
  "expires_at": "2026-10-27T14:19:42.334476337Z",
  "resend_available_at": "2026-10-27T14:14:43.334476337Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "102295",
  "sent_at": "2026-10-27T14:14:42.338060911Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3343034a-1ae2-4cde-bbd2-b83f4dac8a31",
  "code": "102295",
  "device_ref": "sandbox-25822"
}
```

```json
{
  "session_id": "b9470ee8-aab1-4f89-93b2-a500b2fad8ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTM4MiwiaWF0IjoxNzkzMTEwNDgyLCJqdGkiOiI3ZTEyZDdjMi1kNmIyLTRhNTMtYjRlNy1iMTRjZGY1ODY3NjkiLCJzaWQiOiJiOTQ3MGVlOC1hYWIxLTRmODktOTNiMi1hNTAwYjJmYWQ4Y2EifQ._o5nqg0xeNHClUIv06HRHA-NkPEE_Ttzzdhr-0uLEoE",
  "access_expires_at": "2026-10-27T14:29:42.387922423Z",
  "refresh_token": "Tv7myTXk4b_I2Wy8hseYOCnOyngFYG10Kze6FTA1-5M",
  "refresh_expires_at": "2026-11-26T14:14:42.387065731Z",
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
  "session_id": "896bf33f-0668-4a16-a263-77726e0d1747",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzODIsImlhdCI6MTc5MzExMDQ4MiwianRpIjoiNTY2MWY3MTMtMTM3OC00ZTBkLTkyYmEtYjQ2ODIyYjJjZGJkIiwic2lkIjoiODk2YmYzM2YtMDY2OC00YTE2LWEyNjMtNzc3MjZlMGQxNzQ3In0.gZgUsBjeoC9jGlaMDTtJBSnWUZEPNInZR0gYU4IlWdI",
  "access_expires_at": "2026-10-27T14:29:42.710873762Z",
  "refresh_token": "9C1aJRm7eAZI3tV3pre1CNBDJXvFe8EPOLCj_36tJAQ",
  "refresh_expires_at": "2026-10-28T02:14:42.710202771Z",
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
  "session_id": "898c5b17-1ea1-4665-b9ed-5b4a3769e473",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzODMsImlhdCI6MTc5MzExMDQ4MywianRpIjoiMDZlOGY1NTAtZWJjMC00ZDg2LTgzODItYjI4N2JmZjM4NTdiIiwic2lkIjoiODk4YzViMTctMWVhMS00NjY1LWI5ZWQtNWI0YTM3NjllNDczIn0.8km-liFiL5EsG45DDYNr62pzuZMUFTBq9VQWa4Ekt1g",
  "access_expires_at": "2026-10-27T14:29:43.014237178Z",
  "refresh_token": "woaoyP5bfE2RDLymJOGuBRgo7BGLR05OVJrHnnLlijU",
  "refresh_expires_at": "2026-10-28T02:14:43.01346332Z",
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
  "command_id": "04192ac8-3341-41db-bdb5-05d64c724cca",
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
  "id": "e52ded07-c8d7-4d46-bc40-0995b1cdb364",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:19:43.073834Z",
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
  "command_id": "47a37246-8fad-4db3-b461-d27fa707afbc",
  "quote_id": "e52ded07-c8d7-4d46-bc40-0995b1cdb364",
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
  "id": "a9554901-e8d8-48ef-b840-bdc844102782",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9315e8ed-c550-461d-ab53-9e969d83e56d",
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
  "created_at": "2026-10-27T14:14:43.110315Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/a9554901-e8d8-48ef-b840-bdc844102782` → **200**

```json
{
  "id": "a9554901-e8d8-48ef-b840-bdc844102782",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9315e8ed-c550-461d-ab53-9e969d83e56d",
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
  "created_at": "2026-10-27T14:14:43.110315Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/a9554901-e8d8-48ef-b840-bdc844102782/cancel` → **200**

```json
{
  "command_id": "25fa36d8-e0cc-4136-a250-efc22b841bd4",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "a9554901-e8d8-48ef-b840-bdc844102782",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9315e8ed-c550-461d-ab53-9e969d83e56d",
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
  "created_at": "2026-10-27T14:14:43.110315Z",
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
  "command_id": "dfbff882-7b70-4e49-af53-2f43f3a24697",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:43Z",
    "sequence": 1793110483232
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f20d5252-d8df-4823-8ca2-d9cb41dcef70",
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
  "last_heartbeat_at": "2026-10-27T14:14:43.246028Z",
  "last_location_at": "2026-10-27T14:14:43.246028Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31397"
}
```

```json
{
  "challenge_id": "0558b827-d512-4d5f-b184-07888f8fd941",
  "expires_at": "2026-10-27T14:19:43.27190075Z",
  "resend_available_at": "2026-10-27T14:14:44.27190075Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "350745",
  "sent_at": "2026-10-27T14:14:43.274799754Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0558b827-d512-4d5f-b184-07888f8fd941",
  "code": "350745",
  "device_ref": "sandbox-31397"
}
```

```json
{
  "session_id": "e802786c-f603-4aea-a0c9-b1aeb3e456b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTM4MywiaWF0IjoxNzkzMTEwNDgzLCJqdGkiOiI5ZmQ4MDQ2YS0wOGMwLTRhNTgtOGRlYS01M2IwM2RhOWJkYjkiLCJzaWQiOiJlODAyNzg2Yy1mNjAzLTRhZWEtYTBjOS1iMWFlYjNlNDU2YjUifQ.95IsI1OtQeWw8VpUKvpIFxU4MGCc499J2v-okET1dVE",
  "access_expires_at": "2026-10-27T14:29:43.323718236Z",
  "refresh_token": "a4fIHAUZGiHzNM3BZw_NdOjo3BChaDJZPAkAd0PTTL8",
  "refresh_expires_at": "2026-11-26T14:14:43.323071286Z",
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
  "command_id": "ff3e93ea-6895-4c6a-b816-ac31ce4e21a6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:43Z",
    "sequence": 1793110483371
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:14:43.386122Z",
  "last_location_at": "2026-10-27T14:14:43.386122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fb4f9b26-8c2a-4144-903c-08ab145bffc2",
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
  "id": "43c4eff9-4d19-4341-96a0-82de0a6dcc9c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:19:43.425859Z",
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
  "command_id": "c256b278-255d-4b6c-ac57-3a06fa1a5631",
  "quote_id": "43c4eff9-4d19-4341-96a0-82de0a6dcc9c",
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
  "id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9315e8ed-c550-461d-ab53-9e969d83e56d",
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
  "created_at": "2026-10-27T14:14:43.460804Z",
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
    "id": "c139bfc1-ea35-464d-bb03-f2fbc12a8a5c",
    "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
    "expires_at": "2026-10-27T14:14:58.465132Z",
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

`POST /api/driver/v1/offers/c139bfc1-ea35-464d-bb03-f2fbc12a8a5c/accept` → **200**

```json
{
  "command_id": "6bc133c7-e694-4878-b9c7-b48deeee65af"
}
```

```json
{
  "id": "0d575836-9ed4-44f1-be44-e04fd312ff1d",
  "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "31d64070-b3e9-472e-a618-d232ca09314f",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "31d64070-b3e9-472e-a618-d232ca09314f",
  "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
  "assignment_id": "0d575836-9ed4-44f1-be44-e04fd312ff1d",
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

`POST /api/driver/v1/trips/31d64070-b3e9-472e-a618-d232ca09314f/cancel` → **200**

```json
{
  "command_id": "3d9b326f-16f6-4324-b91a-1186f0e48183",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "31d64070-b3e9-472e-a618-d232ca09314f",
  "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
  "assignment_id": "0d575836-9ed4-44f1-be44-e04fd312ff1d",
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

`GET /api/rider/v1/orders/086eb01c-32b1-49cf-8a34-2c6f84fbaac8` → **200**

```json
{
  "id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9315e8ed-c550-461d-ab53-9e969d83e56d",
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
    "id": "0d575836-9ed4-44f1-be44-e04fd312ff1d",
    "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "31d64070-b3e9-472e-a618-d232ca09314f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T14:14:43.460804Z",
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
    "id": "296c0655-0f51-4a74-a406-43ea373bfa62",
    "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
    "expires_at": "2026-10-27T14:14:58.598134Z",
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

`POST /api/driver/v1/offers/296c0655-0f51-4a74-a406-43ea373bfa62/accept` → **200**

```json
{
  "command_id": "d0009e0c-2e0c-428d-b719-4d85c6756bb3"
}
```

```json
{
  "id": "79a8305a-6a9e-4cd5-98ef-1f61cd6f9bfb",
  "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1fc99152-3454-40c9-8958-373f710cc101",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1fc99152-3454-40c9-8958-373f710cc101",
  "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
  "assignment_id": "79a8305a-6a9e-4cd5-98ef-1f61cd6f9bfb",
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

`POST /api/driver/v1/trips/1fc99152-3454-40c9-8958-373f710cc101/cancel` → **200**

```json
{
  "command_id": "7f6bfb6e-509a-4647-bd3c-49db82aae613",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1fc99152-3454-40c9-8958-373f710cc101",
  "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
  "assignment_id": "79a8305a-6a9e-4cd5-98ef-1f61cd6f9bfb",
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
    "id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:14:43.460804Z",
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
    "id": "a9554901-e8d8-48ef-b840-bdc844102782",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:14:43.110315Z",
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

`GET /api/operator/v1/orders/086eb01c-32b1-49cf-8a34-2c6f84fbaac8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:14:43.461493Z",
      "actor": {
        "type": "CLIENT",
        "id": "9315e8ed-c550-461d-ab53-9e969d83e56d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
        "quote_id": "43c4eff9-4d19-4341-96a0-82de0a6dcc9c",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:14:43.463941Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
        "attempt_id": "34bf4332-b1f5-4d07-bcd9-8b7aea270775",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:14:43.472726Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c139bfc1-ea35-464d-bb03-f2fbc12a8a5c",
        "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:14:43.527037Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c139bfc1-ea35-464d-bb03-f2fbc12a8a5c",
        "order_id": "086eb01c-32b1-49cf-8a34-2c6f84fbaac8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0d575836-9ed4-44f1-be44-e04fd312ff1d"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders a9554901-e8d8-48ef-b840-bdc844102782, 086eb01c-32b1-49cf-8a34-2c6f84fbaac8.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735531058",
  "device_ref": "sandbox-4153"
}
```

```json
{
  "challenge_id": "7092bd84-a05f-419b-922c-23d66e14780a",
  "expires_at": "2026-10-27T14:19:43.852895621Z",
  "resend_available_at": "2026-10-27T14:14:44.852895621Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735531058` → **200**

```json
{
  "phone": "+380735531058",
  "audience": "CLIENT",
  "code": "796992",
  "sent_at": "2026-10-27T14:14:43.855876837Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7092bd84-a05f-419b-922c-23d66e14780a",
  "code": "796992",
  "device_ref": "sandbox-4153"
}
```

```json
{
  "session_id": "98f3143c-3f53-4676-b197-1a894bd5a40a",
  "subject": {
    "type": "CLIENT",
    "id": "493f9ab3-2053-4f56-bedf-0ab6fd492187"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OTNmOWFiMy0yMDUzLTRmNTYtYmVkZi0wYWI2ZmQ0OTIxODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTExMzgzLCJpYXQiOjE3OTMxMTA0ODMsImp0aSI6ImU1NmEyOTJmLWQ5MmItNDFhNS04YTdlLWZiMTc5MDA4ZDRjOSIsInNpZCI6Ijk4ZjMxNDNjLTNmNTMtNDY3Ni1iMTk3LTFhODk0YmQ1YTQwYSJ9.tV4QhKyDcW-lIVO2lviz_nqBRIDm7tOuEYCh8NYIi3w",
  "access_expires_at": "2026-10-27T14:29:43.921458939Z",
  "refresh_token": "qumZLIxR_iSufpfV7cwN9CV9Nx978yZ2fT7VvnCY1H4",
  "refresh_expires_at": "2026-11-26T14:14:43.920903198Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "66b29d99-46fa-4d07-bffc-37f5ee00a0aa",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "9e2f69cb-2efb-4971-b2d6-a9af148fea33",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-9e2f69cb-2efb-4971-b2d6-a9af148fea33",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3051166e6484409321c1ea3a7a5ad6d3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=9e2f69cb-2efb-4971-b2d6-a9af148fea33",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735531058"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=9e2f69cb-2efb-4971-b2d6-a9af148fea33",
  "expires_at": "2026-10-27T14:44:43.956382Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/9e2f69cb-2efb-4971-b2d6-a9af148fea33` → **200**

```json
{
  "id": "9e2f69cb-2efb-4971-b2d6-a9af148fea33",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T14:44:43.956382Z",
  "card": {
    "id": "8bed17a1-d9a3-4aa7-a0d3-1f41066af6d6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2231",
    "card_type": "Visa",
    "created_at": "2026-10-27T14:14:43.998977Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "8bed17a1-d9a3-4aa7-a0d3-1f41066af6d6",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2231",
      "card_type": "Visa",
      "created_at": "2026-10-27T14:14:43.998977Z"
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
  "device_ref": "sandbox-22655"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "9c3560d1-0d57-47bf-8fca-a1c811cf2ff5",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22655"
}
```

```json
{
  "challenge_id": "499dc126-80ae-421d-863e-497f582b1b3f",
  "expires_at": "2026-10-27T14:19:45.106117084Z",
  "resend_available_at": "2026-10-27T14:14:46.106117084Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "840785",
  "sent_at": "2026-10-27T14:14:45.108869986Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "499dc126-80ae-421d-863e-497f582b1b3f",
  "code": "840785",
  "device_ref": "sandbox-22655"
}
```

```json
{
  "session_id": "139bea32-14a7-4057-94c5-b01962713b84",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTM4NSwiaWF0IjoxNzkzMTEwNDg1LCJqdGkiOiI2OWU4NGZiYi0xMGY0LTQxNjgtYjVkMC1kODIyYzE0YTY1ZTAiLCJzaWQiOiIxMzliZWEzMi0xNGE3LTQwNTctOTRjNS1iMDE5NjI3MTNiODQifQ.RrELiUvhYPVGs4upBYcwqO6jGYg8B5SATFOkTu2d7dg",
  "access_expires_at": "2026-10-27T14:29:45.16037152Z",
  "refresh_token": "FvkaHeH68zSX3n9qtygDA-utPm87pBHHMaxVRh7tML4",
  "refresh_expires_at": "2026-11-26T14:14:45.159735376Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:14:43.386122Z",
  "last_location_at": "2026-10-27T14:14:43.386122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/529ff6e4-7550-465a-9c25-033f14b9394c/handover` → **200**

```json
{
  "command_id": "239fd25e-7222-4223-a5ae-0a5994f0290f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:14:43.386122Z",
  "last_location_at": "2026-10-27T14:14:43.386122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/529ff6e4-7550-465a-9c25-033f14b9394c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:45Z",
    "sequence": 1793110485249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:14:45.268859Z",
  "last_location_at": "2026-10-27T14:14:45.268859Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f71ed611-ea39-473c-8c8a-f195f84ac063",
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
  "id": "79574018-4007-41fa-8d1d-70bc18f90d36",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T14:19:45.311589Z",
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
  "command_id": "102787c3-3029-4b02-a75d-d11e1658807e",
  "quote_id": "79574018-4007-41fa-8d1d-70bc18f90d36",
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
  "id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "493f9ab3-2053-4f56-bedf-0ab6fd492187",
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
  "created_at": "2026-10-27T14:14:45.351103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8977f682-9c07-4491-b730-4c882e6d6b13` → **200**

```json
{
  "id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "493f9ab3-2053-4f56-bedf-0ab6fd492187",
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
  "created_at": "2026-10-27T14:14:45.351103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8977f682-9c07-4491-b730-4c882e6d6b13` → **200**

```json
{
  "id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "493f9ab3-2053-4f56-bedf-0ab6fd492187",
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
  "created_at": "2026-10-27T14:14:45.351103Z",
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
    "id": "063dd1e0-d8e9-45d0-89ee-bbabf815c265",
    "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
    "expires_at": "2026-10-27T14:15:00.927876Z",
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

`POST /api/driver/v1/offers/063dd1e0-d8e9-45d0-89ee-bbabf815c265/accept` → **200**

```json
{
  "command_id": "8e79cf44-d22f-4ef5-9a80-14c904be256e"
}
```

```json
{
  "id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
  "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
  "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "assignment_id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
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

`POST /api/driver/v1/work-sessions/529ff6e4-7550-465a-9c25-033f14b9394c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:46Z",
    "sequence": 1793110486516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:14:46.532352Z",
  "last_location_at": "2026-10-27T14:14:46.532352Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0fba984c-4ccc-4027-83e3-7cd557d3ca58/arrive` → **200**

```json
{
  "command_id": "6762fb96-8906-47ba-8a75-754b61303053",
  "expected_version": 0
}
```

```json
{
  "id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
  "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "assignment_id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
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
  "arrived_at": "2026-10-27T14:14:46.567521Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/0fba984c-4ccc-4027-83e3-7cd557d3ca58/start` → **200**

```json
{
  "command_id": "e61d23a3-9459-4911-88f9-2a689f52d5ee",
  "expected_version": 1
}
```

```json
{
  "id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
  "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "assignment_id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
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
  "arrived_at": "2026-10-27T14:14:46.567521Z",
  "started_at": "2026-10-27T14:14:46.605156Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/0fba984c-4ccc-4027-83e3-7cd557d3ca58/complete` → **200**

```json
{
  "command_id": "edcaaca3-793f-4ae3-bd29-100a1fb9c95c",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:14:46Z"
}
```

```json
{
  "id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
  "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "assignment_id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
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
  "arrived_at": "2026-10-27T14:14:46.567521Z",
  "started_at": "2026-10-27T14:14:46.605156Z",
  "completed_at": "2026-10-27T14:14:46.646042Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/8977f682-9c07-4491-b730-4c882e6d6b13` → **200**

```json
{
  "id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "493f9ab3-2053-4f56-bedf-0ab6fd492187",
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
    "id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
    "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:14:45.351103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8977f682-9c07-4491-b730-4c882e6d6b13` → **200**

```json
{
  "id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "493f9ab3-2053-4f56-bedf-0ab6fd492187",
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
    "id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
    "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:14:45.351103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8977f682-9c07-4491-b730-4c882e6d6b13` → **200**

```json
{
  "id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "493f9ab3-2053-4f56-bedf-0ab6fd492187",
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
    "id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
    "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:14:45.351103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8977f682-9c07-4491-b730-4c882e6d6b13` → **200**

```json
{
  "id": "8977f682-9c07-4491-b730-4c882e6d6b13",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "493f9ab3-2053-4f56-bedf-0ab6fd492187",
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
    "id": "e483761b-e925-44b2-bab3-17eb16cf1fc1",
    "order_id": "8977f682-9c07-4491-b730-4c882e6d6b13",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0fba984c-4ccc-4027-83e3-7cd557d3ca58",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:14:45.351103Z",
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

Done: card order 8977f682-9c07-4491-b730-4c882e6d6b13.

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
  "device_ref": "sandbox-29752"
}
```

```json
{
  "challenge_id": "c31cd290-d2d7-43b6-83ba-e62d569cab7b",
  "expires_at": "2026-10-27T14:19:49.854036291Z",
  "resend_available_at": "2026-10-27T14:14:50.854036291Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "929065",
  "sent_at": "2026-10-27T14:14:49.856707013Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c31cd290-d2d7-43b6-83ba-e62d569cab7b",
  "code": "929065",
  "device_ref": "sandbox-29752"
}
```

```json
{
  "session_id": "08c5e0d0-9183-49b8-abbb-2a04fc3c142b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTM4OSwiaWF0IjoxNzkzMTEwNDg5LCJqdGkiOiJiZDk0ZWVjZS0xZWY5LTQ4YmQtYTNkOC1jZjg3MzFhNWIzYzQiLCJzaWQiOiIwOGM1ZTBkMC05MTgzLTQ5YjgtYWJiYi0yYTA0ZmMzYzE0MmIifQ.ICb8A8_o7dm7IOqW5H1yXDoNCT8AyXs217npdJBA4Y8",
  "access_expires_at": "2026-10-27T14:29:49.909520581Z",
  "refresh_token": "OvTxlgx1fNaKqpI0GTafNEgFRph_Fg1tJTivBCWSsgw",
  "refresh_expires_at": "2026-11-26T14:14:49.908895912Z",
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
  "command_id": "42db1523-1754-442c-841b-e95eee7533e2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:49Z",
    "sequence": 1793110489957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:49.972124Z",
  "last_location_at": "2026-10-27T14:14:49.972124Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674741834",
  "device_ref": "sandbox-23601"
}
```

```json
{
  "challenge_id": "6fc09274-e41b-44ee-be56-7927b6874d33",
  "expires_at": "2026-10-27T14:19:50.000924495Z",
  "resend_available_at": "2026-10-27T14:14:51.000924495Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674741834` → **200**

```json
{
  "phone": "+380674741834",
  "audience": "CLIENT",
  "code": "309078",
  "sent_at": "2026-10-27T14:14:50.003642058Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6fc09274-e41b-44ee-be56-7927b6874d33",
  "code": "309078",
  "device_ref": "sandbox-23601"
}
```

```json
{
  "session_id": "1d564e90-fda0-4937-9c67-1f9517debd79",
  "subject": {
    "type": "CLIENT",
    "id": "c56fe2f6-9097-4254-9c2c-c578fb5dfe8e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTZmZTJmNi05MDk3LTQyNTQtOWMyYy1jNTc4ZmI1ZGZlOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTExMzkwLCJpYXQiOjE3OTMxMTA0OTAsImp0aSI6ImM2MDczNjcxLTEyMzYtNDg2Mi1hOTcyLTYzYjI1NjQ5ZWViNSIsInNpZCI6IjFkNTY0ZTkwLWZkYTAtNDkzNy05YzY3LTFmOTUxN2RlYmQ3OSJ9.wYF3WOz8fqnotND73EGuC-1JvyMRprCjXLHWlK-9KsQ",
  "access_expires_at": "2026-10-27T14:29:50.053687419Z",
  "refresh_token": "aZ4N_RiR8tPmBqwwxC2TkfXAnIuyUIuMi1Mpl0CcFtc",
  "refresh_expires_at": "2026-11-26T14:14:50.053095016Z",
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
  "command_id": "5c23a569-01d2-4996-aa01-34ba3dd350ba",
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
  "id": "80d31792-1e5e-4fb2-a064-2c916a70996c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:19:50.113291Z",
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
  "command_id": "365330bd-efdd-46cd-b8eb-2213598fafd7",
  "quote_id": "80d31792-1e5e-4fb2-a064-2c916a70996c",
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
  "id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c56fe2f6-9097-4254-9c2c-c578fb5dfe8e",
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
  "created_at": "2026-10-27T14:14:50.150432Z",
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
    "id": "3e4ba6d2-4f5f-4926-ad5c-8ebd1093e863",
    "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
    "expires_at": "2026-10-27T14:15:05.154252Z",
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
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/3e4ba6d2-4f5f-4926-ad5c-8ebd1093e863/accept` → **200**

```json
{
  "command_id": "60e241da-0384-4eee-9940-89ac3a699725"
}
```

```json
{
  "id": "38e98b39-fe0f-4a1b-8d97-fab7c108c3f3",
  "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d53bb4c7-d6ba-4699-8a20-eae0a08953ac",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/fc40bf5f-fe21-4dba-afd0-dbe9a4e19766/messages` → **201**

```json
{
  "command_id": "7413e8e3-e7cb-4f3a-902e-c49e3aeb18c6",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "794b80e7-d926-4ee7-b834-2c4bcbad706c",
  "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T14:14:50.253473584Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d53bb4c7-d6ba-4699-8a20-eae0a08953ac",
  "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "assignment_id": "38e98b39-fe0f-4a1b-8d97-fab7c108c3f3",
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

`POST /api/driver/v1/trips/d53bb4c7-d6ba-4699-8a20-eae0a08953ac/messages` → **201**

```json
{
  "command_id": "25a38944-666a-4a38-b6ca-1c5b853c2325",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "23c033ca-f593-48e3-8edf-ed35431ae1a5",
  "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T14:14:50.303869587Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/fc40bf5f-fe21-4dba-afd0-dbe9a4e19766/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d53bb4c7-d6ba-4699-8a20-eae0a08953ac/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674741834"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:50Z",
    "sequence": 1793110490375
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:50.389682Z",
  "last_location_at": "2026-10-27T14:14:50.389682Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d53bb4c7-d6ba-4699-8a20-eae0a08953ac",
  "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "assignment_id": "38e98b39-fe0f-4a1b-8d97-fab7c108c3f3",
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

`POST /api/driver/v1/trips/d53bb4c7-d6ba-4699-8a20-eae0a08953ac/arrive` → **200**

```json
{
  "command_id": "67292596-54de-459a-beed-09934a7d96fd",
  "expected_version": 0
}
```

```json
{
  "id": "d53bb4c7-d6ba-4699-8a20-eae0a08953ac",
  "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "assignment_id": "38e98b39-fe0f-4a1b-8d97-fab7c108c3f3",
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
  "arrived_at": "2026-10-27T14:14:50.437301Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/d53bb4c7-d6ba-4699-8a20-eae0a08953ac/start` → **200**

```json
{
  "command_id": "01d748b5-5bb4-4252-909f-acdf2cedc5a1",
  "expected_version": 1
}
```

```json
{
  "id": "d53bb4c7-d6ba-4699-8a20-eae0a08953ac",
  "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "assignment_id": "38e98b39-fe0f-4a1b-8d97-fab7c108c3f3",
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
  "arrived_at": "2026-10-27T14:14:50.437301Z",
  "started_at": "2026-10-27T14:14:50.469179Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:50Z",
    "sequence": 1793110490490
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:50.504465Z",
  "last_location_at": "2026-10-27T14:14:50.504465Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d53bb4c7-d6ba-4699-8a20-eae0a08953ac/complete` → **200**

```json
{
  "command_id": "714bd6f3-a54d-48d0-bd03-cbc2e09f4939",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:14:50Z",
  "cash_received": true
}
```

```json
{
  "id": "d53bb4c7-d6ba-4699-8a20-eae0a08953ac",
  "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "assignment_id": "38e98b39-fe0f-4a1b-8d97-fab7c108c3f3",
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
  "arrived_at": "2026-10-27T14:14:50.437301Z",
  "started_at": "2026-10-27T14:14:50.469179Z",
  "completed_at": "2026-10-27T14:14:50.536683Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/fc40bf5f-fe21-4dba-afd0-dbe9a4e19766` → **200**

```json
{
  "id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c56fe2f6-9097-4254-9c2c-c578fb5dfe8e",
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
    "id": "38e98b39-fe0f-4a1b-8d97-fab7c108c3f3",
    "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d53bb4c7-d6ba-4699-8a20-eae0a08953ac",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:14:50.150432Z",
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
    "id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:14:50.150432Z",
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
    "id": "d53bb4c7-d6ba-4699-8a20-eae0a08953ac",
    "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
    "order_short_number": 5,
    "created_at": "2026-10-27T14:14:50.213449Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3103fa5d-f04c-4b74-b1f9-35397c7aea91",
    "order_id": "5d0f6b50-f9d9-49af-b564-48032a504dce",
    "order_short_number": 1,
    "created_at": "2026-10-27T14:14:38.818719Z",
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
  "session_id": "0ff23348-3cab-439b-9a5c-2bd828540d18",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzOTMsImlhdCI6MTc5MzExMDQ5MywianRpIjoiMGQwYzZhNTAtNDFhMy00YjViLWI0YmEtMzViOTU3ZDA0MTEzIiwic2lkIjoiMGZmMjMzNDgtM2NhYi00MzliLTlhNWMtMmJkODI4NTQwZDE4In0.TOx3IFEmww2A_He3LGHl4taDT5sGaCdeowQHuzVzUgM",
  "access_expires_at": "2026-10-27T14:29:53.941660832Z",
  "refresh_token": "zkbTU-W_N5Tfa135axATls1wZPRpECNsyo0rfJQyhDY",
  "refresh_expires_at": "2026-10-28T02:14:53.941097282Z",
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
  "session_id": "23c10a36-1ce6-45b7-b177-b1fa07247d6d",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzOTQsImlhdCI6MTc5MzExMDQ5NCwianRpIjoiY2EyZjIzMTMtZmEyZi00ZDlmLThjOTktNDgyZjVkYTg4ZDUyIiwic2lkIjoiMjNjMTBhMzYtMWNlNi00NWI3LWIxNzctYjFmYTA3MjQ3ZDZkIn0.7DqVHVvtusD5OgTuuq-YUkjR_04MhsEutuMLc0SAzJ8",
  "access_expires_at": "2026-10-27T14:29:54.243130467Z",
  "refresh_token": "MvEar8TDxjA0rMbMmEJyZQPv8rDdkCgSF0jF8NZjJG0",
  "refresh_expires_at": "2026-10-28T02:14:54.242438402Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fc40bf5f-fe21-4dba-afd0-dbe9a4e19766/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:14:50.151176Z",
      "actor": {
        "type": "CLIENT",
        "id": "c56fe2f6-9097-4254-9c2c-c578fb5dfe8e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
        "quote_id": "80d31792-1e5e-4fb2-a064-2c916a70996c",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:14:50.153243Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
        "attempt_id": "e5e7b795-258b-4657-bf3e-44cb21e4a620",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:14:50.159251Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3e4ba6d2-4f5f-4926-ad5c-8ebd1093e863",
        "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:14:50.21533Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3e4ba6d2-4f5f-4926-ad5c-8ebd1093e863",
        "order_id": "fc40bf5f-fe21-4dba-afd0-dbe9a4e19766",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "38e98b39-fe0f-4a1b-8d97-fab7c108c3f3"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order fc40bf5f-fe21-4dba-afd0-dbe9a4e19766.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8552"
}
```

```json
{
  "challenge_id": "a437b8ee-6baf-4a8f-8940-3de68c881a77",
  "expires_at": "2026-10-27T14:19:54.306395228Z",
  "resend_available_at": "2026-10-27T14:14:55.306395228Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "327419",
  "sent_at": "2026-10-27T14:14:54.309158066Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a437b8ee-6baf-4a8f-8940-3de68c881a77",
  "code": "327419",
  "device_ref": "sandbox-8552"
}
```

```json
{
  "session_id": "8e4c33b4-7b6e-4697-b5b9-b7c61372cc74",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTM5NCwiaWF0IjoxNzkzMTEwNDk0LCJqdGkiOiIxZjc2OWE0Mi0wMGU2LTRkZmEtYWQ1NC03N2E0OTFiZGNiNDYiLCJzaWQiOiI4ZTRjMzNiNC03YjZlLTQ2OTctYjViOS1iN2M2MTM3MmNjNzQifQ.EnI-TycbCQAeNM5i9cRtsm65-T1dKwrQDRjq07cLV1Q",
  "access_expires_at": "2026-10-27T14:29:54.359506563Z",
  "refresh_token": "PHgUT3sfyEp3ySesmqiea82WCbhntmvLeC3yGDeFWSk",
  "refresh_expires_at": "2026-11-26T14:14:54.358796807Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:50.504465Z",
  "last_location_at": "2026-10-27T14:14:50.504465Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/handover` → **200**

```json
{
  "command_id": "3d579d5c-1e6f-4713-ad93-1b43fa68b196",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:50.504465Z",
  "last_location_at": "2026-10-27T14:14:50.504465Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:54Z",
    "sequence": 1793110494440
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:54.454432Z",
  "last_location_at": "2026-10-27T14:14:54.454432Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666948785",
  "device_ref": "sandbox-1213"
}
```

```json
{
  "challenge_id": "593c7dca-f367-4f86-9f5e-758e1a0af137",
  "expires_at": "2026-10-27T14:19:54.479060201Z",
  "resend_available_at": "2026-10-27T14:14:55.479060201Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666948785` → **200**

```json
{
  "phone": "+380666948785",
  "audience": "CLIENT",
  "code": "105813",
  "sent_at": "2026-10-27T14:14:54.482041107Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "593c7dca-f367-4f86-9f5e-758e1a0af137",
  "code": "105813",
  "device_ref": "sandbox-1213"
}
```

```json
{
  "session_id": "ee1d96cd-e11b-4d62-8b2b-cdfdfefc9dab",
  "subject": {
    "type": "CLIENT",
    "id": "d2e5ce26-4d6f-4cdb-939f-ab72a57d2a51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmU1Y2UyNi00ZDZmLTRjZGItOTM5Zi1hYjcyYTU3ZDJhNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTExMzk0LCJpYXQiOjE3OTMxMTA0OTQsImp0aSI6IjkwZmRjOTQ1LTMyZGQtNGYyMy1hMTI2LTIyYTc3NGFkNTk0OSIsInNpZCI6ImVlMWQ5NmNkLWUxMWItNGQ2Mi04YjJiLWNkZmRmZWZjOWRhYiJ9.coU_pDmQwSMVfpLA8R3h2sGHQ3gsKDpgMXC1s39afvw",
  "access_expires_at": "2026-10-27T14:29:54.537056699Z",
  "refresh_token": "hDmC2Z-_Rhq1pDfreYZPlWmfInz8Msczvkr22I4qOC0",
  "refresh_expires_at": "2026-11-26T14:14:54.536380492Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cd391b05-a040-4cff-8f78-7b66e1d012c5",
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
  "id": "81fce491-d470-4515-87f6-516baff79d93",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T14:19:54.572421Z",
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
  "command_id": "5c36a73a-96cd-411c-96a8-cf12ce5d4ca7",
  "quote_id": "81fce491-d470-4515-87f6-516baff79d93",
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
  "id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d2e5ce26-4d6f-4cdb-939f-ab72a57d2a51",
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
  "created_at": "2026-10-27T14:14:54.610024Z",
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
    "id": "cc794198-434e-49c7-95fb-3ff08d73e9ee",
    "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
    "expires_at": "2026-10-27T14:15:09.61426Z",
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

`POST /api/driver/v1/offers/cc794198-434e-49c7-95fb-3ff08d73e9ee/accept` → **200**

```json
{
  "command_id": "adc656a5-5bb8-4696-99a6-1040ad18340c"
}
```

```json
{
  "id": "5faf24eb-dd48-4c28-96a0-824094ecd976",
  "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c67d8f2-45d5-4a80-b984-09d24039cabd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c67d8f2-45d5-4a80-b984-09d24039cabd",
  "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
  "assignment_id": "5faf24eb-dd48-4c28-96a0-824094ecd976",
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

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:54Z",
    "sequence": 1793110494707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:54.721951Z",
  "last_location_at": "2026-10-27T14:14:54.721951Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0c67d8f2-45d5-4a80-b984-09d24039cabd/arrive` → **200**

```json
{
  "command_id": "fd081bde-bb51-4dff-80ca-1d3e29374160",
  "expected_version": 0
}
```

```json
{
  "id": "0c67d8f2-45d5-4a80-b984-09d24039cabd",
  "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
  "assignment_id": "5faf24eb-dd48-4c28-96a0-824094ecd976",
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
  "arrived_at": "2026-10-27T14:14:54.755228Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/0c67d8f2-45d5-4a80-b984-09d24039cabd/start` → **200**

```json
{
  "command_id": "48cd6148-60f7-41f7-aa4e-c7a3ace93056",
  "expected_version": 1
}
```

```json
{
  "id": "0c67d8f2-45d5-4a80-b984-09d24039cabd",
  "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
  "assignment_id": "5faf24eb-dd48-4c28-96a0-824094ecd976",
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
  "arrived_at": "2026-10-27T14:14:54.755228Z",
  "started_at": "2026-10-27T14:14:54.790333Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:54Z",
    "sequence": 1793110494812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:54.827058Z",
  "last_location_at": "2026-10-27T14:14:54.827058Z",
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
  "device_ref": "sandbox-8688"
}
```

```json
{
  "challenge_id": "cc5912f8-5a0f-4393-8e87-72d3ede49ed0",
  "expires_at": "2026-10-27T14:19:54.850130769Z",
  "resend_available_at": "2026-10-27T14:14:55.850130769Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "953808",
  "sent_at": "2026-10-27T14:14:54.852840928Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc5912f8-5a0f-4393-8e87-72d3ede49ed0",
  "code": "953808",
  "device_ref": "sandbox-8688"
}
```

```json
{
  "session_id": "29b34dc7-c76f-4c5a-a109-b28a7987781e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTM5NCwiaWF0IjoxNzkzMTEwNDk0LCJqdGkiOiIyYmQ1ODBlNS1lYmQ5LTRiYTQtYWE5ZC00OTcyZjVkMTM1OGMiLCJzaWQiOiIyOWIzNGRjNy1jNzZmLTRjNWEtYTEwOS1iMjhhNzk4Nzc4MWUifQ.APeO8OfgSF2X94L1sD1WHm9HTPdEzy5Ql7B4is2pHag",
  "access_expires_at": "2026-10-27T14:29:54.902307235Z",
  "refresh_token": "Caw8Opk_lmEBJ2UUWzpeAuqpnaE2eoBSAz69W-StE4U",
  "refresh_expires_at": "2026-11-26T14:14:54.901700785Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f20d5252-d8df-4823-8ca2-d9cb41dcef70",
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
  "last_heartbeat_at": "2026-10-27T14:14:43.246028Z",
  "last_location_at": "2026-10-27T14:14:43.246028Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f20d5252-d8df-4823-8ca2-d9cb41dcef70/handover` → **200**

```json
{
  "command_id": "d2ebc621-e175-4842-a04a-a6d2c3b2dcf3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f20d5252-d8df-4823-8ca2-d9cb41dcef70",
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
  "last_heartbeat_at": "2026-10-27T14:14:43.246028Z",
  "last_location_at": "2026-10-27T14:14:43.246028Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f20d5252-d8df-4823-8ca2-d9cb41dcef70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4150,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:54Z",
    "sequence": 1793110494979
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f20d5252-d8df-4823-8ca2-d9cb41dcef70",
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
  "last_heartbeat_at": "2026-10-27T14:14:54.9927Z",
  "last_location_at": "2026-10-27T14:14:54.9927Z",
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
  "session_id": "c72e72ed-e68b-45e3-b12e-5adc9b789d23",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzOTUsImlhdCI6MTc5MzExMDQ5NSwianRpIjoiMDI5ZmVhOGEtYjMzNy00NTRjLTkyN2ItMWNkYWM5YWUzMDhiIiwic2lkIjoiYzcyZTcyZWQtZTY4Yi00NWUzLWIxMmUtNWFkYzliNzg5ZDIzIn0.wYy3TdKKj_XSfbY1J6I9ipQiXuh3HXosHzuesWLdjAk",
  "access_expires_at": "2026-10-27T14:29:55.305569365Z",
  "refresh_token": "Fs_7SNBgjEcbtjs2Hyu7q4XC9SSO5R43dfEl2TvE2U8",
  "refresh_expires_at": "2026-10-28T02:14:55.305040382Z",
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
  "session_id": "2d13a1ae-5098-4191-8223-18f32315b2ed",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzOTUsImlhdCI6MTc5MzExMDQ5NSwianRpIjoiMWIyMGJkYTItMWQwMC00NDE4LWJlODMtOTc3NmQyOGY1MmI4Iiwic2lkIjoiMmQxM2ExYWUtNTA5OC00MTkxLTgyMjMtMThmMzIzMTViMmVkIn0.urWlcSXcuzI38DpzlTeAudkYekhquFK_yZOaUxuEeeo",
  "access_expires_at": "2026-10-27T14:29:55.607245084Z",
  "refresh_token": "m7_SoQ-m_WKyHazKlqW8niU5BhJekgOtln9OgJfKnVA",
  "refresh_expires_at": "2026-10-28T02:14:55.606644384Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/68e05f95-174d-4a35-9d3d-e2f33064702b` → **200**

```json
{
  "id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d2e5ce26-4d6f-4cdb-939f-ab72a57d2a51",
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
    "id": "5faf24eb-dd48-4c28-96a0-824094ecd976",
    "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0c67d8f2-45d5-4a80-b984-09d24039cabd",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T14:14:54.610024Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/68e05f95-174d-4a35-9d3d-e2f33064702b/interrupt` → **200**

```json
{
  "command_id": "37a1abd9-12c1-4fe9-9c39-ee6b7a0e0a54",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "d2e5ce26-4d6f-4cdb-939f-ab72a57d2a51",
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
      "id": "5faf24eb-dd48-4c28-96a0-824094ecd976",
      "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "0c67d8f2-45d5-4a80-b984-09d24039cabd",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T14:14:54.610024Z",
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
    "id": "128f8116-bd22-4d06-8ead-ef9b33bf4842",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "d2e5ce26-4d6f-4cdb-939f-ab72a57d2a51",
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
    "id": "b72ed353-0ec6-4c02-87b6-638759ddffa8",
    "order_id": "128f8116-bd22-4d06-8ead-ef9b33bf4842",
    "expires_at": "2026-10-27T14:15:10.691163Z",
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
    "distance_m": 556
  }
]
```

`POST /api/driver/v1/offers/b72ed353-0ec6-4c02-87b6-638759ddffa8/accept` → **200**

```json
{
  "command_id": "0d8ddafc-b782-4bfc-b192-e939c9d6c5ff"
}
```

```json
{
  "id": "b88020fe-65bb-443b-9d5e-c82944c6e785",
  "order_id": "128f8116-bd22-4d06-8ead-ef9b33bf4842",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e31fe7b-47fd-4a55-8775-5d0035c07caf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e31fe7b-47fd-4a55-8775-5d0035c07caf",
  "order_id": "128f8116-bd22-4d06-8ead-ef9b33bf4842",
  "assignment_id": "b88020fe-65bb-443b-9d5e-c82944c6e785",
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
  "session_id": "f20d5252-d8df-4823-8ca2-d9cb41dcef70",
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
  "last_heartbeat_at": "2026-10-27T14:14:54.9927Z",
  "last_location_at": "2026-10-27T14:14:54.9927Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f20d5252-d8df-4823-8ca2-d9cb41dcef70/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:55Z",
    "sequence": 1793110495813
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f20d5252-d8df-4823-8ca2-d9cb41dcef70",
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
  "last_heartbeat_at": "2026-10-27T14:14:55.827782Z",
  "last_location_at": "2026-10-27T14:14:55.827782Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3e31fe7b-47fd-4a55-8775-5d0035c07caf/arrive` → **200**

```json
{
  "command_id": "d4aa1bc6-18eb-4ee5-828b-9c44ff22acea",
  "expected_version": 0
}
```

```json
{
  "id": "3e31fe7b-47fd-4a55-8775-5d0035c07caf",
  "order_id": "128f8116-bd22-4d06-8ead-ef9b33bf4842",
  "assignment_id": "b88020fe-65bb-443b-9d5e-c82944c6e785",
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
  "arrived_at": "2026-10-27T14:14:55.863141Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/3e31fe7b-47fd-4a55-8775-5d0035c07caf/start` → **200**

```json
{
  "command_id": "eb6ad51c-9318-4876-916f-f1c607ec6fbd",
  "expected_version": 1
}
```

```json
{
  "id": "3e31fe7b-47fd-4a55-8775-5d0035c07caf",
  "order_id": "128f8116-bd22-4d06-8ead-ef9b33bf4842",
  "assignment_id": "b88020fe-65bb-443b-9d5e-c82944c6e785",
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
  "arrived_at": "2026-10-27T14:14:55.863141Z",
  "started_at": "2026-10-27T14:14:55.899006Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/3e31fe7b-47fd-4a55-8775-5d0035c07caf/complete` → **200**

```json
{
  "command_id": "21cf5c70-fe8d-456a-8ffa-cd0ae6a0fc3a",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:14:55Z"
}
```

```json
{
  "id": "3e31fe7b-47fd-4a55-8775-5d0035c07caf",
  "order_id": "128f8116-bd22-4d06-8ead-ef9b33bf4842",
  "assignment_id": "b88020fe-65bb-443b-9d5e-c82944c6e785",
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
  "arrived_at": "2026-10-27T14:14:55.863141Z",
  "started_at": "2026-10-27T14:14:55.899006Z",
  "completed_at": "2026-10-27T14:14:55.937019Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "128f8116-bd22-4d06-8ead-ef9b33bf4842",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:14:55.680028Z",
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
    "id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:14:54.610024Z",
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
      "balance_minor": 11113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/68e05f95-174d-4a35-9d3d-e2f33064702b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:14:54.610647Z",
      "actor": {
        "type": "CLIENT",
        "id": "d2e5ce26-4d6f-4cdb-939f-ab72a57d2a51",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
        "quote_id": "81fce491-d470-4515-87f6-516baff79d93",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:14:54.613286Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
        "attempt_id": "8719bd9a-c94e-4c74-ac89-1377426ab60e",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:14:54.619222Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cc794198-434e-49c7-95fb-3ff08d73e9ee",
        "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:14:54.671327Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cc794198-434e-49c7-95fb-3ff08d73e9ee",
        "order_id": "68e05f95-174d-4a35-9d3d-e2f33064702b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5faf24eb-dd48-4c28-96a0-824094ecd976"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 68e05f95-174d-4a35-9d3d-e2f33064702b, follow-up 128f8116-bd22-4d06-8ead-ef9b33bf4842.

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
  "session_id": "7ebecf59-8846-4bad-adb5-bf41f3435a03",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTEzOTksImlhdCI6MTc5MzExMDQ5OSwianRpIjoiMTU1ZjAwOWItYmRlOC00MWFhLWJhMWMtOGE3OTM3ODI4YTBhIiwic2lkIjoiN2ViZWNmNTktODg0Ni00YmFkLWFkYjUtYmY0MWYzNDM1YTAzIn0.G5g0TPT1VDKR7j8iAadCtmF8TrCDbMqbbUfh-ovrM0c",
  "access_expires_at": "2026-10-27T14:29:59.329558975Z",
  "refresh_token": "xo8Z8hhtx-U1Jc0fxrXAX8iH51pK1R6m5_WIGaf0vYc",
  "refresh_expires_at": "2026-10-28T02:14:59.328996661Z",
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
  "command_id": "3420f318-4f78-4b0e-9486-ed0fd5a5833f",
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
  "changed_by": "d51c635c-c2ad-4379-8794-e3c6dc229353",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T14:14:59.402024773Z"
}
```

## The rider books the airport for 2026-10-27T17:14:59Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600791545",
  "device_ref": "sandbox-23779"
}
```

```json
{
  "challenge_id": "4ff0b4ad-3092-4710-becf-c5604a17ba18",
  "expires_at": "2026-10-27T14:19:59.431325649Z",
  "resend_available_at": "2026-10-27T14:15:00.431325649Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600791545` → **200**

```json
{
  "phone": "+48600791545",
  "audience": "CLIENT",
  "code": "818948",
  "sent_at": "2026-10-27T14:14:59.434139101Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ff0b4ad-3092-4710-becf-c5604a17ba18",
  "code": "818948",
  "device_ref": "sandbox-23779"
}
```

```json
{
  "session_id": "933deee5-1cdb-4fb4-9125-4efe5cfbb691",
  "subject": {
    "type": "CLIENT",
    "id": "c8f52fdf-bc8b-4ed1-adca-4de2afb431a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGY1MmZkZi1iYzhiLTRlZDEtYWRjYS00ZGUyYWZiNDMxYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTExMzk5LCJpYXQiOjE3OTMxMTA0OTksImp0aSI6IjQwODlkNDRjLTQxYTktNDJmNy1hYWRhLWRkZDcyYTI0N2RkMiIsInNpZCI6IjkzM2RlZWU1LTFjZGItNGZiNC05MTI1LTRlZmU1Y2ZiYjY5MSJ9.MZAES_Cp42Ig3s6OfTN6bEQ46CWbVcqRCZ2Ea53FxwM",
  "access_expires_at": "2026-10-27T14:29:59.48313189Z",
  "refresh_token": "9Bxgqe-VY5gCSfu1CyDrog4P7vn1__qWK_2rwzIfp9E",
  "refresh_expires_at": "2026-11-26T14:14:59.482594469Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "828c3b46-476f-4d21-8e70-2b978d27dab2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T17:14:59Z"
}
```

```json
{
  "id": "d6f4a69b-81b4-4765-a279-31049bffa7e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T14:19:59.516860Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T17:14:59Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c64aa37e-c4e6-4f75-ad74-78d053ac0008",
  "quote_id": "d6f4a69b-81b4-4765-a279-31049bffa7e8",
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
  "pickup_at": "2026-10-27T17:14:59Z"
}
```

```json
{
  "id": "df204183-8fcb-42bf-83d2-bd6d9c98dc87",
  "short_number": 8,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c8f52fdf-bc8b-4ed1-adca-4de2afb431a3",
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
  "created_at": "2026-10-27T14:14:59.552358Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T17:14:59Z",
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
  "device_ref": "sandbox-12398"
}
```

```json
{
  "challenge_id": "b8ec0de9-a963-4cf0-8ff9-2282785f1d65",
  "expires_at": "2026-10-27T14:19:59.582834551Z",
  "resend_available_at": "2026-10-27T14:15:00.582834551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "864267",
  "sent_at": "2026-10-27T14:14:59.585096514Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8ec0de9-a963-4cf0-8ff9-2282785f1d65",
  "code": "864267",
  "device_ref": "sandbox-12398"
}
```

```json
{
  "session_id": "95babaf8-311e-4346-9086-f92eb6fb2472",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTM5OSwiaWF0IjoxNzkzMTEwNDk5LCJqdGkiOiIxYmQ1NmQwOS01ZTE1LTRkY2EtOTM2NC02MzQxNWQ0ZDYyNWMiLCJzaWQiOiI5NWJhYmFmOC0zMTFlLTQzNDYtOTA4Ni1mOTJlYjZmYjI0NzIifQ.eYJOEHlEH4XXCiOWSD9x-VPnh47e8w6o5oRkFcZzWP4",
  "access_expires_at": "2026-10-27T14:29:59.634081018Z",
  "refresh_token": "sY8Qied5mRDZfNCKKjQFEuAwF_6DWouNWKDHh6EtfTM",
  "refresh_expires_at": "2026-11-26T14:14:59.633472409Z",
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
  "command_id": "a5554748-f065-4359-ab9e-5418774092d0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:14:59Z",
    "sequence": 1793110499679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "076c73cd-6daf-4432-ad86-79812447d17e",
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
  "last_heartbeat_at": "2026-10-27T14:14:59.692762Z",
  "last_location_at": "2026-10-27T14:14:59.692762Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "df204183-8fcb-42bf-83d2-bd6d9c98dc87",
      "short_number": 8,
      "pickup_at": "2026-10-27T17:14:59Z",
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

`POST /api/driver/v1/preorders/df204183-8fcb-42bf-83d2-bd6d9c98dc87/reserve` → **200**

```json
{
  "command_id": "de3491a9-9ca1-4f91-95b3-2917e09d97f0"
}
```

```json
{
  "id": "e7a3cb4a-fea3-4596-8303-f6604a62bfc3",
  "state": "RESERVED",
  "order": {
    "order_id": "df204183-8fcb-42bf-83d2-bd6d9c98dc87",
    "short_number": 8,
    "pickup_at": "2026-10-27T17:14:59Z",
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
  "reserved_at": "2026-10-27T14:14:59.755888Z",
  "confirm_from": "2026-10-27T16:44:59Z",
  "confirm_until": "2026-10-27T16:54:59Z",
  "drop_until": "2026-10-27T16:14:59Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "e7a3cb4a-fea3-4596-8303-f6604a62bfc3",
      "state": "RESERVED",
      "order": {
        "order_id": "df204183-8fcb-42bf-83d2-bd6d9c98dc87",
        "short_number": 8,
        "pickup_at": "2026-10-27T17:14:59Z",
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
      "reserved_at": "2026-10-27T14:14:59.755888Z",
      "confirm_from": "2026-10-27T16:44:59Z",
      "confirm_until": "2026-10-27T16:54:59Z",
      "drop_until": "2026-10-27T16:14:59Z"
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
      "id": "e7a3cb4a-fea3-4596-8303-f6604a62bfc3",
      "state": "RESERVED",
      "order": {
        "order_id": "df204183-8fcb-42bf-83d2-bd6d9c98dc87",
        "short_number": 8,
        "pickup_at": "2026-10-27T17:14:59Z",
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
      "reserved_at": "2026-10-27T14:14:59.755888Z",
      "confirm_from": "2026-10-27T16:44:59Z",
      "confirm_until": "2026-10-27T16:54:59Z",
      "drop_until": "2026-10-27T16:14:59Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/e7a3cb4a-fea3-4596-8303-f6604a62bfc3/confirm` → **409**

```json
{
  "command_id": "c5362d70-7e89-4dae-b66e-832d14b51123"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/e7a3cb4a-fea3-4596-8303-f6604a62bfc3/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4fbfde17-b3a9-4765-8138-fbc605a2c378"
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
  "session_id": "e314ef67-cb09-439c-b5ff-df123622b973",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTE0MDAsImlhdCI6MTc5MzExMDUwMCwianRpIjoiMzNlYTJlMmEtMTE4Zi00MTRiLTgzMzEtZjgxNWM2NjM5ODZkIiwic2lkIjoiZTMxNGVmNjctY2IwOS00MzljLWI1ZmYtZGYxMjM2MjJiOTczIn0.p7iHL-6wVaz-bZZKRiVn45yfNs1W6ABNtgD1beEniyI",
  "access_expires_at": "2026-10-27T14:30:00.137795915Z",
  "refresh_token": "Sie_Kvc4PP6FUOVqoSAs9gUbJaGPjZbkXaUZN3uEXSU",
  "refresh_expires_at": "2026-10-28T02:15:00.137254216Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/df204183-8fcb-42bf-83d2-bd6d9c98dc87` → **200**

```json
{
  "id": "df204183-8fcb-42bf-83d2-bd6d9c98dc87",
  "short_number": 8,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c8f52fdf-bc8b-4ed1-adca-4de2afb431a3",
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
  "created_at": "2026-10-27T14:14:59.552358Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T17:14:59Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "e7a3cb4a-fea3-4596-8303-f6604a62bfc3",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T14:14:59.755888Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/df204183-8fcb-42bf-83d2-bd6d9c98dc87/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T14:14:59.554184Z",
      "actor": {
        "type": "CLIENT",
        "id": "c8f52fdf-bc8b-4ed1-adca-4de2afb431a3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "df204183-8fcb-42bf-83d2-bd6d9c98dc87",
        "preorder": true,
        "quote_id": "d6f4a69b-81b4-4765-a279-31049bffa7e8",
        "pickup_at": "2026-10-27T17:14:59Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T14:14:59.757006Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "df204183-8fcb-42bf-83d2-bd6d9c98dc87",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "e7a3cb4a-fea3-4596-8303-f6604a62bfc3"
      }
    }
  ]
}
```

Done: pre-order df204183-8fcb-42bf-83d2-bd6d9c98dc87, reservation e7a3cb4a-fea3-4596-8303-f6604a62bfc3.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28150"
}
```

```json
{
  "challenge_id": "fb5bea3c-af18-4f55-9a96-d6df34030bce",
  "expires_at": "2026-10-27T14:20:00.216672373Z",
  "resend_available_at": "2026-10-27T14:15:01.216672373Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "695113",
  "sent_at": "2026-10-27T14:15:00.21876737Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb5bea3c-af18-4f55-9a96-d6df34030bce",
  "code": "695113",
  "device_ref": "sandbox-28150"
}
```

```json
{
  "session_id": "d567b5dc-a4e9-40ee-97cd-e6148b91cf5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTQwMCwiaWF0IjoxNzkzMTEwNTAwLCJqdGkiOiJjMDE0ZTVkMi1mMDY3LTRhZGUtOGZhMy0yMmFmMTE2ZDE2MWEiLCJzaWQiOiJkNTY3YjVkYy1hNGU5LTQwZWUtOTdjZC1lNjE0OGI5MWNmNWEifQ.cqWu4AM3aUwbCV7gF-im3Q9VLxMr_6QI88N07s2Vu14",
  "access_expires_at": "2026-10-27T14:30:00.266014564Z",
  "refresh_token": "rD81WxLZVICBhYncHvD0rEXmq-41Js8CdvBQrt1K6T0",
  "refresh_expires_at": "2026-11-26T14:15:00.265452158Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:54.827058Z",
  "last_location_at": "2026-10-27T14:14:54.827058Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/handover` → **200**

```json
{
  "command_id": "c0d84cbe-c787-4726-94a3-73f975f54243",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:14:54.827058Z",
  "last_location_at": "2026-10-27T14:14:54.827058Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:15:00Z",
    "sequence": 1793110500338
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:15:00.352851Z",
  "last_location_at": "2026-10-27T14:15:00.352851Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678557304",
  "device_ref": "sandbox-6237"
}
```

```json
{
  "challenge_id": "46ec821c-615d-4f3a-9487-7c96851ab943",
  "expires_at": "2026-10-27T14:20:00.376482436Z",
  "resend_available_at": "2026-10-27T14:15:01.376482436Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678557304` → **200**

```json
{
  "phone": "+380678557304",
  "audience": "CLIENT",
  "code": "419435",
  "sent_at": "2026-10-27T14:15:00.37905949Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46ec821c-615d-4f3a-9487-7c96851ab943",
  "code": "419435",
  "device_ref": "sandbox-6237"
}
```

```json
{
  "session_id": "486c0bfc-e757-430c-b759-9b23378ddf90",
  "subject": {
    "type": "CLIENT",
    "id": "4a477260-e446-4f33-825c-9e83c9ce22bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTQ3NzI2MC1lNDQ2LTRmMzMtODI1Yy05ZTgzYzljZTIyYmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTExNDAwLCJpYXQiOjE3OTMxMTA1MDAsImp0aSI6IjJjMTE4OWE0LWNiYjQtNDA3MS1iNmQxLWQzOTJkODQ2Y2Y2MyIsInNpZCI6IjQ4NmMwYmZjLWU3NTctNDMwYy1iNzU5LTliMjMzNzhkZGY5MCJ9.U8NvwjdHtfCQEEhHl91iOtEAi1dhshnZpAjFI0xxIno",
  "access_expires_at": "2026-10-27T14:30:00.435936105Z",
  "refresh_token": "1rTJlWfhTKPYkSEXzns5ouuXuA0etCnbdjjA9-a1VZE",
  "refresh_expires_at": "2026-11-26T14:15:00.434533304Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4efe2a8e-d929-4cfe-ad80-dd22b574e660",
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
  "id": "4ac3946e-e3d3-442e-8049-e754af8cb8af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:20:00.471887Z",
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
  "command_id": "172ac442-6e91-4c97-ab47-3e15f79e0da3",
  "quote_id": "4ac3946e-e3d3-442e-8049-e754af8cb8af",
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
  "id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4a477260-e446-4f33-825c-9e83c9ce22bd",
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
  "created_at": "2026-10-27T14:15:00.507444Z",
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
    "id": "a75bad4c-0c9c-46b3-9607-504d293aaf01",
    "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
    "expires_at": "2026-10-27T14:15:15.511301Z",
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
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/a75bad4c-0c9c-46b3-9607-504d293aaf01/accept` → **200**

```json
{
  "command_id": "0f364c82-aef6-4cbc-9f08-49de45e618ae"
}
```

```json
{
  "id": "80adbc01-df36-479c-8db4-5b586ccc0758",
  "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c964e09-7625-4604-81fe-bdbf62e0f443",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1c964e09-7625-4604-81fe-bdbf62e0f443",
  "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "assignment_id": "80adbc01-df36-479c-8db4-5b586ccc0758",
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

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:15:00Z",
    "sequence": 1793110500612
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:15:00.625781Z",
  "last_location_at": "2026-10-27T14:15:00.625781Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1c964e09-7625-4604-81fe-bdbf62e0f443",
  "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "assignment_id": "80adbc01-df36-479c-8db4-5b586ccc0758",
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

`POST /api/driver/v1/trips/1c964e09-7625-4604-81fe-bdbf62e0f443/arrive` → **200**

```json
{
  "command_id": "c5b81ea8-2b7a-43b1-8e85-fd2281ff7bbb",
  "expected_version": 0
}
```

```json
{
  "id": "1c964e09-7625-4604-81fe-bdbf62e0f443",
  "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "assignment_id": "80adbc01-df36-479c-8db4-5b586ccc0758",
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
  "arrived_at": "2026-10-27T14:15:00.671429Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/1c964e09-7625-4604-81fe-bdbf62e0f443/start` → **200**

```json
{
  "command_id": "74bd1c65-7a20-4734-b0c1-48ace7395032",
  "expected_version": 1
}
```

```json
{
  "id": "1c964e09-7625-4604-81fe-bdbf62e0f443",
  "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "assignment_id": "80adbc01-df36-479c-8db4-5b586ccc0758",
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
  "arrived_at": "2026-10-27T14:15:00.671429Z",
  "started_at": "2026-10-27T14:15:00.703188Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:15:00Z",
    "sequence": 1793110500723
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T14:15:00.737004Z",
  "last_location_at": "2026-10-27T14:15:00.737004Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/1c964e09-7625-4604-81fe-bdbf62e0f443/complete` → **200**

```json
{
  "command_id": "4255ebfc-8a6b-4b06-8e9a-176c50f0928a",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:15:00Z",
  "cash_received": true
}
```

```json
{
  "id": "1c964e09-7625-4604-81fe-bdbf62e0f443",
  "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "assignment_id": "80adbc01-df36-479c-8db4-5b586ccc0758",
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
  "arrived_at": "2026-10-27T14:15:00.671429Z",
  "started_at": "2026-10-27T14:15:00.703188Z",
  "completed_at": "2026-10-27T14:15:00.767161Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/88896d9b-96ef-49c9-bb8c-1b63037cf358/rating` → **200**

```json
{
  "command_id": "bcc07761-be79-4ee3-abc3-8301315c6a2e",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "score": 5,
  "created_at": "2026-10-27T14:15:00.816031685Z"
}
```

`POST /api/driver/v1/orders/88896d9b-96ef-49c9-bb8c-1b63037cf358/rating` → **200**

```json
{
  "command_id": "a1844c78-4fe6-43db-ac01-45f16dcf5eec",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
  "score": 4,
  "created_at": "2026-10-27T14:15:00.853316831Z"
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
  "session_id": "6eb80fb6-efbf-4cda-b865-1b2e1b9fa01e",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTE0MDEsImlhdCI6MTc5MzExMDUwMSwianRpIjoiODc4YmU5NWUtMTUzZi00MjZjLWEzYzktODkzMDRmNzkyN2IyIiwic2lkIjoiNmViODBmYjYtZWZiZi00Y2RhLWI4NjUtMWIyZTFiOWZhMDFlIn0.JBw_CRDYA0JR_ZmsaZLmwAEUKN4joFH_zSVrkvNdtWs",
  "access_expires_at": "2026-10-27T14:30:01.192102097Z",
  "refresh_token": "NR4xjBKuLDxKkGrIxpwDuEaSkaPxDqMKQ8WvMSelH6s",
  "refresh_expires_at": "2026-10-28T02:15:01.19154761Z",
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
  "session_id": "06a46d2f-1910-495e-9d25-75e3b998d8ff",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTE0MDEsImlhdCI6MTc5MzExMDUwMSwianRpIjoiNDUxODgyYmMtYzdkYS00YzlhLWE3NTMtYzJlNmMxNDQ4ODFmIiwic2lkIjoiMDZhNDZkMmYtMTkxMC00OTVlLTlkMjUtNzVlM2I5OThkOGZmIn0.1hf8fDBhVP2oPFV_mIPxWjDbrfH8F2iIDf7sc5GEWFs",
  "access_expires_at": "2026-10-27T14:30:01.492330373Z",
  "refresh_token": "CnGcFPdtfEHYUoa1lkdA0Eh-V7n-Hg9WkVg6JiKz_kQ",
  "refresh_expires_at": "2026-10-28T02:15:01.491758715Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/88896d9b-96ef-49c9-bb8c-1b63037cf358/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
      "author_type": "RIDER",
      "author_id": "4a477260-e446-4f33-825c-9e83c9ce22bd",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T14:15:00.816032Z"
    },
    {
      "order_id": "88896d9b-96ef-49c9-bb8c-1b63037cf358",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "4a477260-e446-4f33-825c-9e83c9ce22bd",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T14:15:00.853317Z"
    }
  ]
}
```

Done: ratings for order 88896d9b-96ef-49c9-bb8c-1b63037cf358.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671190928",
  "device_ref": "sandbox-32477"
}
```

```json
{
  "challenge_id": "32b066b5-ad83-42c4-8eb7-3a551f541443",
  "expires_at": "2026-10-27T14:20:01.565663941Z",
  "resend_available_at": "2026-10-27T14:15:02.565663941Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671190928` → **200**

```json
{
  "phone": "+380671190928",
  "audience": "CLIENT",
  "code": "176773",
  "sent_at": "2026-10-27T14:15:01.567849479Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32b066b5-ad83-42c4-8eb7-3a551f541443",
  "code": "176773",
  "device_ref": "sandbox-32477"
}
```

```json
{
  "session_id": "dc9f7477-0137-4256-872f-bfc904238fe8",
  "subject": {
    "type": "CLIENT",
    "id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjkzODNiMC1jNmM4LTQ4ODQtYTlhMC03MGE2MzFmZmFlYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTExNDAxLCJpYXQiOjE3OTMxMTA1MDEsImp0aSI6IjViYjhmMjUxLWZkZDgtNGMxMy1iNWI5LWUxMzYyOGI3Zjg3MSIsInNpZCI6ImRjOWY3NDc3LTAxMzctNDI1Ni04NzJmLWJmYzkwNDIzOGZlOCJ9.6QXpkw3EzOGT6GBziX8BDSxGXHCmAvqwB7Kr5ZqzuDI",
  "access_expires_at": "2026-10-27T14:30:01.616901341Z",
  "refresh_token": "jShckVS2odanW_yrevSasxtKz1JP221-gbB469-_EFM",
  "refresh_expires_at": "2026-11-26T14:15:01.616330458Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "0c53477d-1135-45e4-953f-1fcee80a4abb",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db",
  "upload_path": "/api/rider/v1/uploads/12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db",
  "expires_at": "2026-10-27T14:30:01.651032397Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db` → **200**

```json
{
  "file_id": "12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "327742c5-bf4b-45c8-9dd8-25b6be1ecc69",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db"
  ]
}
```

```json
{
  "id": "437e6568-b829-45da-95c9-6eac5ef2ab63",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:15:01.714869Z",
  "updated_at": "2026-10-27T14:15:01.714869Z",
  "messages": [
    {
      "id": "8cfd7525-4300-474b-971b-4f4645c137f6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:15:01.716481Z",
      "attachments": [
        {
          "file_id": "12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db",
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
  "session_id": "268b2c5c-89a8-4d33-b71e-08187b2a4ed1",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTE0MDIsImlhdCI6MTc5MzExMDUwMiwianRpIjoiZjk3ODBhY2MtYzdiMy00YzYwLWJhYjItOThiMjM4NmJmNTM3Iiwic2lkIjoiMjY4YjJjNWMtODlhOC00ZDMzLWI3MWUtMDgxODdiMmE0ZWQxIn0.G8MsUD0cjorHDqBYlsX6erJsRuMbKh1iFGOpeIPt5oM",
  "access_expires_at": "2026-10-27T14:30:02.037702258Z",
  "refresh_token": "fnb0rvcLICoPS_6yqbVw3GAKHVyro-IOCKMXVujqpws",
  "refresh_expires_at": "2026-10-28T02:15:02.037106945Z",
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
  "session_id": "d3db33a2-4b66-4202-bfe2-d11937012491",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTE0MDIsImlhdCI6MTc5MzExMDUwMiwianRpIjoiOTE2MDViZjMtN2NjNC00MjVjLTk5ZmQtZTg2NzU4NDVlZjA4Iiwic2lkIjoiZDNkYjMzYTItNGI2Ni00MjAyLWJmZTItZDExOTM3MDEyNDkxIn0.BIlmW_ls3AUxsfovWM3CdDW69oTmh23-2f8DCkn0enU",
  "access_expires_at": "2026-10-27T14:30:02.338486106Z",
  "refresh_token": "Zif5lyoVJy-cprsJcCfRjU1kqWUSAm1VG77jyLrK0l8",
  "refresh_expires_at": "2026-10-28T02:15:02.337947802Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/437e6568-b829-45da-95c9-6eac5ef2ab63/attachments/12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "53ec5956-5a56-42d8-9d77-342a4f8ddf55",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "9e0d5b51-4269-4af3-95e0-b5d7b72d8247",
  "upload_path": "/api/operator/v1/uploads/9e0d5b51-4269-4af3-95e0-b5d7b72d8247",
  "expires_at": "2026-10-27T14:30:02.388395114Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/9e0d5b51-4269-4af3-95e0-b5d7b72d8247` → **200**

```json
{
  "file_id": "9e0d5b51-4269-4af3-95e0-b5d7b72d8247",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/437e6568-b829-45da-95c9-6eac5ef2ab63` → **200**

```json
{
  "id": "437e6568-b829-45da-95c9-6eac5ef2ab63",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:15:01.714869Z",
  "updated_at": "2026-10-27T14:15:01.714869Z",
  "messages": [
    {
      "id": "8cfd7525-4300-474b-971b-4f4645c137f6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:15:01.716481Z",
      "attachments": [
        {
          "file_id": "12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/437e6568-b829-45da-95c9-6eac5ef2ab63/comments` → **200**

```json
{
  "command_id": "3a957b03-edeb-4d88-a043-b8ab08970857",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "9e0d5b51-4269-4af3-95e0-b5d7b72d8247"
  ]
}
```

```json
{
  "id": "437e6568-b829-45da-95c9-6eac5ef2ab63",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:15:01.714869Z",
  "updated_at": "2026-10-27T14:15:02.490681Z",
  "messages": [
    {
      "id": "8cfd7525-4300-474b-971b-4f4645c137f6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:15:01.716481Z",
      "attachments": [
        {
          "file_id": "12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6106e177-6811-4ffd-a68a-b13b53d871bb",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "d51c635c-c2ad-4379-8794-e3c6dc229353",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:15:02.490207Z",
      "attachments": [
        {
          "file_id": "9e0d5b51-4269-4af3-95e0-b5d7b72d8247",
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

`GET /api/rider/v1/support/cases/437e6568-b829-45da-95c9-6eac5ef2ab63` → **200**

```json
{
  "id": "437e6568-b829-45da-95c9-6eac5ef2ab63",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:15:01.714869Z",
  "updated_at": "2026-10-27T14:15:02.490681Z",
  "messages": [
    {
      "id": "8cfd7525-4300-474b-971b-4f4645c137f6",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9f9383b0-c6c8-4884-a9a0-70a631ffaebe",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:15:01.716481Z",
      "attachments": [
        {
          "file_id": "12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6106e177-6811-4ffd-a68a-b13b53d871bb",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:15:02.490207Z",
      "attachments": [
        {
          "file_id": "9e0d5b51-4269-4af3-95e0-b5d7b72d8247",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/437e6568-b829-45da-95c9-6eac5ef2ab63/attachments/9e0d5b51-4269-4af3-95e0-b5d7b72d8247` → **200**

Done: support case 437e6568-b829-45da-95c9-6eac5ef2ab63, rider attachment 12b04bf7-4fa1-40ff-8845-3a6fc3c1e3db, operator attachment 9e0d5b51-4269-4af3-95e0-b5d7b72d8247.

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
  "session_id": "6df027f9-d865-49d9-8a4b-684708470c79",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTE0MDIsImlhdCI6MTc5MzExMDUwMiwianRpIjoiNzU3ZDBkNmUtYmEyMi00ZTY3LTk1MGYtMDE4ZDM2YmVlNGU2Iiwic2lkIjoiNmRmMDI3ZjktZDg2NS00OWQ5LThhNGItNjg0NzA4NDcwYzc5In0.D48EvOiA6qjv1M9wtT1jb9SeYOTER7Fi6Rd148ofhvU",
  "access_expires_at": "2026-10-27T14:30:02.85609467Z",
  "refresh_token": "DWWOARkTzxhgti_n1B4EwzyX9OiCYawCXMB0RRYkDvc",
  "refresh_expires_at": "2026-10-28T02:15:02.855563204Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5167"
}
```

```json
{
  "challenge_id": "dfba1260-6cda-4950-b4cd-a54658fb3f13",
  "expires_at": "2026-10-27T14:20:02.879855735Z",
  "resend_available_at": "2026-10-27T14:15:03.879855735Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "288998",
  "sent_at": "2026-10-27T14:15:02.881960159Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfba1260-6cda-4950-b4cd-a54658fb3f13",
  "code": "288998",
  "device_ref": "sandbox-5167"
}
```

```json
{
  "session_id": "7461ce32-52e8-4eb5-bab9-f682f88b1e9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTQwMiwiaWF0IjoxNzkzMTEwNTAyLCJqdGkiOiJiMjk1N2UzMi1jNmRiLTQzMGYtYmJjNi1hNGY2OGU2ODQ1NjEiLCJzaWQiOiI3NDYxY2UzMi01MmU4LTRlYjUtYmFiOS1mNjgyZjg4YjFlOWEifQ.k8N92a8wF_P-JIXFhzmjg5niMZ8d3j5M98_4wHM7f7g",
  "access_expires_at": "2026-10-27T14:30:02.929937677Z",
  "refresh_token": "a4okDgwMnFYdGmpK6u52bdrl7jh3DMq_k_2lYAV-nRQ",
  "refresh_expires_at": "2026-11-26T14:15:02.929332269Z",
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
  "command_id": "c44fadf2-cac5-4097-8c7b-4adaead37c4a",
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
  "device_ref": "sandbox-27451"
}
```

```json
{
  "challenge_id": "54900f6b-2204-4a98-a19a-cc4732d149d9",
  "expires_at": "2026-10-27T14:20:03.05089878Z",
  "resend_available_at": "2026-10-27T14:15:04.05089878Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "297577",
  "sent_at": "2026-10-27T14:15:03.053661057Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54900f6b-2204-4a98-a19a-cc4732d149d9",
  "code": "297577",
  "device_ref": "sandbox-27451"
}
```

```json
{
  "session_id": "45f9c3ea-cb4c-4fc0-962f-2e3fb1a7a33e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMTQwMywiaWF0IjoxNzkzMTEwNTAzLCJqdGkiOiJkZTNiZWQ2Ni00YjA4LTRmMmMtYjM2My05M2NkZGJjYTdkNzYiLCJzaWQiOiI0NWY5YzNlYS1jYjRjLTRmYzAtOTYyZi0yZTNmYjFhN2EzM2UifQ.Cd1dK-Es3pCxXMeWDahVoWlbMijyF_MlCcw0DKGRowM",
  "access_expires_at": "2026-10-27T14:30:03.105550607Z",
  "refresh_token": "K79F99GhvQB3hP2v0CNzkBfiIwONDXPieTJHQbYcuEk",
  "refresh_expires_at": "2026-11-26T14:15:03.104997572Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
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
  "last_heartbeat_at": "2026-10-27T14:15:00.737004Z",
  "last_location_at": "2026-10-27T14:15:00.737004Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/handover` → **200**

```json
{
  "command_id": "0cb6c538-6e98-4761-ab3e-80d032739162",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T14:15:00.737004Z",
  "last_location_at": "2026-10-27T14:15:00.737004Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:15:03Z",
    "sequence": 1793110503181
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T14:15:03.195267Z",
  "last_location_at": "2026-10-27T14:15:03.195267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:14:46.532352Z",
  "last_location_at": "2026-10-27T14:14:46.532352Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/529ff6e4-7550-465a-9c25-033f14b9394c/handover` → **200**

```json
{
  "command_id": "8b2609c2-8005-49f3-8106-7f2394d88566",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:14:46.532352Z",
  "last_location_at": "2026-10-27T14:14:46.532352Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/529ff6e4-7550-465a-9c25-033f14b9394c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:15:03Z",
    "sequence": 1793110503270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:15:03.284624Z",
  "last_location_at": "2026-10-27T14:15:03.284624Z",
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
  "session_id": "7f1bf679-d9ee-433f-b8f0-6fbc39f207d5",
  "subject": {
    "type": "STAFF",
    "id": "d51c635c-c2ad-4379-8794-e3c6dc229353"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTFjNjM1Yy1jMmFkLTQzNzktODc5NC1lM2M2ZGMyMjkzNTMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTE0MDMsImlhdCI6MTc5MzExMDUwMywianRpIjoiZjRlNGRmYWItOWQwZC00ZDllLWFkYzktZWNjYzlhZjM5NWRhIiwic2lkIjoiN2YxYmY2NzktZDllZS00MzNmLWI4ZjAtNmZiYzM5ZjIwN2Q1In0.WsPGfz0HVpGBknC3mwnh7cNE1jYLWHFkKxw6Si_8aU4",
  "access_expires_at": "2026-10-27T14:30:03.585219118Z",
  "refresh_token": "7YopDydSR7wp7KUfs17I0HMvK-kZxjJccLgKP2a--wM",
  "refresh_expires_at": "2026-10-28T02:15:03.584674102Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "385faa0f-ef19-4dcc-982e-e2ece1a433ac",
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
  "id": "d1fce780-2df9-446e-b304-22dab1a948b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:20:03.619898Z",
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
  "command_id": "0954464c-acb4-487d-a05e-4f3377e4b4ae",
  "quote_id": "d1fce780-2df9-446e-b304-22dab1a948b3",
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
  "id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
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
  "created_at": "2026-10-27T14:15:03.66712Z",
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
    "id": "3cd95bb5-1b33-4dee-a24a-c3488e8d8a09",
    "order_id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
    "expires_at": "2026-10-27T14:15:18.670716Z",
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

`POST /api/driver/v1/offers/3cd95bb5-1b33-4dee-a24a-c3488e8d8a09/accept` → **200**

```json
{
  "command_id": "7c27883d-c553-4b8f-8cdc-43c1075195ba"
}
```

```json
{
  "id": "a9c41346-8341-4920-91d4-92f2b78bc03e",
  "order_id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d289e09-3314-4399-85af-07e11f4fd288",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d289e09-3314-4399-85af-07e11f4fd288",
  "order_id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
  "assignment_id": "a9c41346-8341-4920-91d4-92f2b78bc03e",
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

`POST /api/driver/v1/work-sessions/529ff6e4-7550-465a-9c25-033f14b9394c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:15:03Z",
    "sequence": 1793110503794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:15:03.808263Z",
  "last_location_at": "2026-10-27T14:15:03.808263Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4d289e09-3314-4399-85af-07e11f4fd288/arrive` → **200**

```json
{
  "command_id": "d67b43f8-bbfa-42c8-bedc-01fd1141edb3",
  "expected_version": 0
}
```

```json
{
  "id": "4d289e09-3314-4399-85af-07e11f4fd288",
  "order_id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
  "assignment_id": "a9c41346-8341-4920-91d4-92f2b78bc03e",
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
  "arrived_at": "2026-10-27T14:15:03.841307Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/4d289e09-3314-4399-85af-07e11f4fd288/start` → **200**

```json
{
  "command_id": "8d0453c1-d8f5-4279-b0bc-1ccf0b3b8690",
  "expected_version": 1
}
```

```json
{
  "id": "4d289e09-3314-4399-85af-07e11f4fd288",
  "order_id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
  "assignment_id": "a9c41346-8341-4920-91d4-92f2b78bc03e",
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
  "arrived_at": "2026-10-27T14:15:03.841307Z",
  "started_at": "2026-10-27T14:15:03.879259Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/4d289e09-3314-4399-85af-07e11f4fd288/complete` → **200**

```json
{
  "command_id": "4eaa1810-4d59-474b-bd43-05dd527b0a9a",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:15:03Z",
  "cash_received": true
}
```

```json
{
  "id": "4d289e09-3314-4399-85af-07e11f4fd288",
  "order_id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
  "assignment_id": "a9c41346-8341-4920-91d4-92f2b78bc03e",
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
  "arrived_at": "2026-10-27T14:15:03.841307Z",
  "started_at": "2026-10-27T14:15:03.879259Z",
  "completed_at": "2026-10-27T14:15:03.924276Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/9d0aad01-b912-4d39-bc2d-9a75c376af69` → **200**

```json
{
  "id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
  "short_number": 10,
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
    "id": "a9c41346-8341-4920-91d4-92f2b78bc03e",
    "order_id": "9d0aad01-b912-4d39-bc2d-9a75c376af69",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d289e09-3314-4399-85af-07e11f4fd288",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:15:03.66712Z",
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
  "session_id": "dc5113bc-4864-4c0b-a665-c4344ce2b157",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-27T14:15:03.195267Z",
  "last_location_at": "2026-10-27T14:15:03.195267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc5113bc-4864-4c0b-a665-c4344ce2b157/close` → **200**

```json
{
  "command_id": "5aa2b262-2747-4c0d-9c49-97a62174947d",
  "expected_version": 3
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
  "session_id": "529ff6e4-7550-465a-9c25-033f14b9394c",
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
  "last_heartbeat_at": "2026-10-27T14:15:03.808263Z",
  "last_location_at": "2026-10-27T14:15:03.808263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/529ff6e4-7550-465a-9c25-033f14b9394c/close` → **200**

```json
{
  "command_id": "844230e4-f799-4bcd-be38-9af5ba3a618b",
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

Done: terminal order 9d0aad01-b912-4d39-bc2d-9a75c376af69 by Andrii (5a000000-0000-4000-8000-000000000403).
