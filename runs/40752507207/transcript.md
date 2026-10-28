# Sandbox transcript (2026-10-28T19:21:38Z, 5b62966)

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
  "correlation_id": "2df79f81-8fb6-4886-8a54-e482fb6a184e"
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
  "session_id": "a78143a7-998b-4d88-8861-74f9c50d71cf",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyMDUsImlhdCI6MTc5MzIxNTMwNSwianRpIjoiMWVkMTEyYTUtYTdmMS00OTViLWI4ZmMtYTA3ZTlkNzZhODQ2Iiwic2lkIjoiYTc4MTQzYTctOTk4Yi00ZDg4LTg4NjEtNzRmOWM1MGQ3MWNmIn0.EQY-tDRalGd-LLHleutlFgU4--3HtZNMO1M7ji_51oY",
  "access_expires_at": "2026-10-28T19:36:45.334135545Z",
  "refresh_token": "JTrjga57_LN005XdeReoMPQND7ng3aTU2xpUKcYP0dY",
  "refresh_expires_at": "2026-10-29T07:21:45.332006443Z",
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
  "session_id": "5e10b040-989b-4c0a-876f-737787790906",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyMDYsImlhdCI6MTc5MzIxNTMwNiwianRpIjoiMzAyMWNjYTktODYxYy00ODMyLTkyMDUtYzRkMmZmMWMxM2U1Iiwic2lkIjoiNWUxMGIwNDAtOTg5Yi00YzBhLTg3NmYtNzM3Nzg3NzkwOTA2In0.o8kIL3uXAMt965_oIPauCdiqy4TKcvhoW7iDorZW3fg",
  "access_expires_at": "2026-10-28T19:36:46.702298239Z",
  "refresh_token": "FiY947JMfxCitRmTawCtDMDWmUX0dTUHIJwBkXElTlE",
  "refresh_expires_at": "2026-10-29T07:21:46.70140914Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "43419ada-4beb-455d-a5a4-34616b4d0a33",
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
  "id": "2d34c5b4-9f4a-4c4f-a069-a3e14e95f318",
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
  "created_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "created_at": "2026-10-28T19:21:46.948257Z",
  "updated_at": "2026-10-28T19:21:46.948257Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639345183",
  "device_ref": "sandbox-5655"
}
```

```json
{
  "challenge_id": "99b7a196-7c30-48e3-a24f-28a4a97ca8e9",
  "expires_at": "2026-10-28T19:26:47.202338513Z",
  "resend_available_at": "2026-10-28T19:21:48.202338513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639345183` → **200**

```json
{
  "phone": "+380639345183",
  "audience": "CLIENT",
  "code": "227093",
  "sent_at": "2026-10-28T19:21:47.211554143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99b7a196-7c30-48e3-a24f-28a4a97ca8e9",
  "code": "227093",
  "device_ref": "sandbox-5655"
}
```

```json
{
  "session_id": "b6a2e479-9dda-407b-b907-e87beca2dc30",
  "subject": {
    "type": "CLIENT",
    "id": "f61484e9-5f65-4309-aade-ac0a8863c152"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjE0ODRlOS01ZjY1LTQzMDktYWFkZS1hYzBhODg2M2MxNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MjA3LCJpYXQiOjE3OTMyMTUzMDcsImp0aSI6IjIyMDE3NjNjLTBlZmMtNDVhYS1iOTgzLTE1MzE0ZmYwODc1OCIsInNpZCI6ImI2YTJlNDc5LTlkZGEtNDA3Yi1iOTA3LWU4N2JlY2EyZGMzMCJ9.vp8I1GXMoA7dGbvNlppPzzZBTjXglpZDmsIBHc3WSs4",
  "access_expires_at": "2026-10-28T19:36:47.482712615Z",
  "refresh_token": "8tYKkcv-a2tnMSd44GauzYC71utqzBgU3tBZWIT07u0",
  "refresh_expires_at": "2026-11-27T19:21:47.481657316Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639345183` → **200**

```json
{
  "client_id": "f61484e9-5f65-4309-aade-ac0a8863c152"
}
```

`POST /api/admin/v1/rider-wallets/f61484e9-5f65-4309-aade-ac0a8863c152/top-ups` → **201**

```json
{
  "command_id": "63db6c80-bb68-4f5e-b437-1d5108b464d2",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "f61484e9-5f65-4309-aade-ac0a8863c152",
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
      "id": "ebab02d2-e1b1-4a87-80b4-21d85d65bd3e",
      "at": "2026-10-28T19:21:47.956781Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ba6b8817-9923-4d0d-8718-adab5dabb329",
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
  "id": "2df93f95-ea17-427f-a7e4-a5bdb9e120f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:26:48.292607Z",
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
      "id": "2d34c5b4-9f4a-4c4f-a069-a3e14e95f318",
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
  "device_ref": "sandbox-25294"
}
```

```json
{
  "challenge_id": "6c8e94b8-4802-4149-a74e-47395a811252",
  "expires_at": "2026-10-28T19:26:48.547633741Z",
  "resend_available_at": "2026-10-28T19:21:49.547633741Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "471180",
  "sent_at": "2026-10-28T19:21:48.562202011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c8e94b8-4802-4149-a74e-47395a811252",
  "code": "471180",
  "device_ref": "sandbox-25294"
}
```

```json
{
  "session_id": "5135a9de-f3ed-4572-addc-d6fd32bd12ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjIwOCwiaWF0IjoxNzkzMjE1MzA4LCJqdGkiOiIwMTBlOTkwNC1iOWQ2LTRhYmMtOTJmNy04ODQ3MWRjODMxZmUiLCJzaWQiOiI1MTM1YTlkZS1mM2VkLTQ1NzItYWRkYy1kNmZkMzJiZDEyZWEifQ.fHcvL5NrP7NDu6mv3c99c-U54jyZ1oGKXWQEltQxFuA",
  "access_expires_at": "2026-10-28T19:36:48.802508449Z",
  "refresh_token": "4rdgL6hpv3HFrrqAtXaABkhjt5kFWXf5cqrP9TwUdQg",
  "refresh_expires_at": "2026-11-27T19:21:48.801460277Z",
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
  "command_id": "6fba86dc-e279-4a3b-bc2a-8790b60c7239",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:21:49Z",
    "sequence": 1793215309241
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc085222-1648-48ce-8e72-b05d2759766a",
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
  "last_heartbeat_at": "2026-10-28T19:21:49.278723Z",
  "last_location_at": "2026-10-28T19:21:49.278723Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "53c824e9-40ef-4f31-825f-cb57786996ca",
  "quote_id": "2df93f95-ea17-427f-a7e4-a5bdb9e120f8",
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
  "id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f61484e9-5f65-4309-aade-ac0a8863c152",
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
  "created_at": "2026-10-28T19:21:49.541733Z",
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
  "client_id": "f61484e9-5f65-4309-aade-ac0a8863c152",
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
      "id": "ebab02d2-e1b1-4a87-80b4-21d85d65bd3e",
      "at": "2026-10-28T19:21:47.956781Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
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
    "id": "2743f61e-1f4d-4303-a8db-27f976b019e8",
    "order_id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c",
    "expires_at": "2026-10-28T19:22:04.554334Z",
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

`POST /api/driver/v1/offers/2743f61e-1f4d-4303-a8db-27f976b019e8/accept` → **200**

```json
{
  "command_id": "c90481ad-f686-408f-b7b5-9f9a39553330"
}
```

```json
{
  "id": "f014badf-8d47-40a1-8a92-866b2ebf01a0",
  "order_id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "512c98c2-35e5-46a4-8fc9-fc5a27631dac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "512c98c2-35e5-46a4-8fc9-fc5a27631dac",
  "order_id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c",
  "assignment_id": "f014badf-8d47-40a1-8a92-866b2ebf01a0",
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

`POST /api/driver/v1/work-sessions/dc085222-1648-48ce-8e72-b05d2759766a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:21:50Z",
    "sequence": 1793215310727
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc085222-1648-48ce-8e72-b05d2759766a",
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
  "last_heartbeat_at": "2026-10-28T19:21:50.75043Z",
  "last_location_at": "2026-10-28T19:21:50.75043Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/512c98c2-35e5-46a4-8fc9-fc5a27631dac/arrive` → **200**

```json
{
  "command_id": "429eaa67-b2f5-4a4b-beba-80545fc46bf7",
  "expected_version": 0
}
```

```json
{
  "id": "512c98c2-35e5-46a4-8fc9-fc5a27631dac",
  "order_id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c",
  "assignment_id": "f014badf-8d47-40a1-8a92-866b2ebf01a0",
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
  "arrived_at": "2026-10-28T19:21:50.986041Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/512c98c2-35e5-46a4-8fc9-fc5a27631dac/start` → **200**

```json
{
  "command_id": "bd087460-a962-4a1d-a386-d48dfaf29c86",
  "expected_version": 1
}
```

```json
{
  "id": "512c98c2-35e5-46a4-8fc9-fc5a27631dac",
  "order_id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c",
  "assignment_id": "f014badf-8d47-40a1-8a92-866b2ebf01a0",
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
  "arrived_at": "2026-10-28T19:21:50.986041Z",
  "started_at": "2026-10-28T19:21:51.217687Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/512c98c2-35e5-46a4-8fc9-fc5a27631dac/complete` → **200**

```json
{
  "command_id": "5241bee8-29ad-4828-81ee-6a87a796d273",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:21:51Z",
  "cash_received": true
}
```

```json
{
  "id": "512c98c2-35e5-46a4-8fc9-fc5a27631dac",
  "order_id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c",
  "assignment_id": "f014badf-8d47-40a1-8a92-866b2ebf01a0",
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
  "arrived_at": "2026-10-28T19:21:50.986041Z",
  "started_at": "2026-10-28T19:21:51.217687Z",
  "completed_at": "2026-10-28T19:21:51.473913Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f61484e9-5f65-4309-aade-ac0a8863c152",
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
      "id": "7266b918-bc73-47e4-b35c-1594152f0874",
      "at": "2026-10-28T19:21:52.300529Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c"
    },
    {
      "id": "ebab02d2-e1b1-4a87-80b4-21d85d65bd3e",
      "at": "2026-10-28T19:21:47.956781Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/2d34c5b4-9f4a-4c4f-a069-a3e14e95f318/archive` → **200**

```json
{
  "command_id": "3e7fe100-03b9-4a54-895d-d342e91f0992",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "2d34c5b4-9f4a-4c4f-a069-a3e14e95f318",
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
  "created_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "created_at": "2026-10-28T19:21:46.948257Z",
  "updated_at": "2026-10-28T19:21:54.934473Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc085222-1648-48ce-8e72-b05d2759766a",
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
  "last_heartbeat_at": "2026-10-28T19:21:50.75043Z",
  "last_location_at": "2026-10-28T19:21:50.75043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc085222-1648-48ce-8e72-b05d2759766a/close` → **200**

```json
{
  "command_id": "6c2d9081-c700-4a19-9fd1-5ae77979a2bf",
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

Done: order 523efb4a-a48a-4b3c-a866-a3ef73848f6c.

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
  "session_id": "bf622f39-5a10-46c4-a820-2a1450845fa5",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyMTUsImlhdCI6MTc5MzIxNTMxNSwianRpIjoiN2EyMmM2M2ItZmU3OC00YzZlLTg5YTQtODk2ZTRkMWQ1YzA3Iiwic2lkIjoiYmY2MjJmMzktNWExMC00NmM0LWE4MjAtMmExNDUwODQ1ZmE1In0.EJrhV6HXzE9N2RUGUTcdH1Ou6mJurQ_XNJCt0-oxarM",
  "access_expires_at": "2026-10-28T19:36:55.894319627Z",
  "refresh_token": "mcT4Nj8o_DHtlRWc4z3d4L1yNNVR46OZ0C6hTUcPJBM",
  "refresh_expires_at": "2026-10-29T07:21:55.893757031Z",
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
  "command_id": "b06e1dac-b7c1-46bb-930d-465b6834f876",
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
  "session_id": "940b2c38-2c57-44e7-a40a-67fd62e2c60b",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyMTYsImlhdCI6MTc5MzIxNTMxNiwianRpIjoiMmQ3YjY5MDUtM2EyOC00NTE0LTlmMGUtNjljZWU1OGY2NTUyIiwic2lkIjoiOTQwYjJjMzgtMmM1Ny00NGU3LWE0MGEtNjdmZDYyZTJjNjBiIn0.qnkhgfYNyePiln7u6ywisQKcU_QSdC3ovaZXtT0MkIU",
  "access_expires_at": "2026-10-28T19:36:56.826827678Z",
  "refresh_token": "dnqWBBYJw6JTAYtl8diyYARnSulDp9mrraY0TyDogpY",
  "refresh_expires_at": "2026-10-29T07:21:56.826097038Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.127527953",
    "linkedid": "1730052700.127527953",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679331969"
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
    "id": "1730052700.127527953",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "98238e9d-19dc-4633-91ce-430a53a6dd76",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.052888Z",
      "answered_at": null,
      "ended_at": "2026-10-28T19:21:57.073128Z",
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
    "id": "1730052600.1984416527",
    "linkedid": "1730052600.1984416527",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679331969"
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
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/7fd51905-1d88-4c77-9400-79050c476d8e/answer` → **200**

```json
{
  "command_id": "8dc3b752-c079-46b8-ba24-ee6e63de7c39"
}
```

```json
{
  "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679331969",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "order_ids": [],
  "started_at": "2026-10-28T19:21:57.324209Z",
  "answered_at": "2026-10-28T19:21:57.574058Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1984416527",
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
    "id": "1730052600.1984416527",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": "2026-10-28T19:21:57.574058Z",
      "ended_at": "2026-10-28T19:21:57.813027Z",
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
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": "2026-10-28T19:21:57.574058Z",
      "ended_at": "2026-10-28T19:21:57.813027Z",
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
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": "2026-10-28T19:21:57.574058Z",
      "ended_at": "2026-10-28T19:21:57.813027Z",
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
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": "2026-10-28T19:21:57.574058Z",
      "ended_at": "2026-10-28T19:21:57.813027Z",
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
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": "2026-10-28T19:21:57.574058Z",
      "ended_at": "2026-10-28T19:21:57.813027Z",
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
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": "2026-10-28T19:21:57.574058Z",
      "ended_at": "2026-10-28T19:21:57.813027Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:22:07.114241Z"
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
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": "2026-10-28T19:21:57.574058Z",
      "ended_at": "2026-10-28T19:21:57.813027Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:22:07.114241Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/7fd51905-1d88-4c77-9400-79050c476d8e/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/7fd51905-1d88-4c77-9400-79050c476d8e/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=7fd51905-1d88-4c77-9400-79050c476d8e` → **200**

```json
{
  "changes": [
    {
      "id": "285a6e1c-007f-4b0f-8e7a-ea0e0f3be208",
      "occurred_at": "2026-10-28T19:22:09.462007Z",
      "actor_type": "STAFF",
      "actor_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e8e424ae-8eab-4b3c-8c14-4ee60ddcc7cb\", \"order_ids\": []}",
      "correlation_id": "f27fdb37-1da9-418d-98c9-3a7c8d30141a"
    },
    {
      "id": "f7cebe21-40dc-439f-8a8b-12b7464dc6f6",
      "occurred_at": "2026-10-28T19:22:09.436753Z",
      "actor_type": "STAFF",
      "actor_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"e8e424ae-8eab-4b3c-8c14-4ee60ddcc7cb\", \"order_ids\": []}",
      "correlation_id": "652d4034-03a0-4006-9478-d7a600c1c803"
    }
  ]
}
```

Done: call 7fd51905-1d88-4c77-9400-79050c476d8e recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7284"
}
```

```json
{
  "challenge_id": "c2e9dfba-d720-4413-adae-cc369edc26b6",
  "expires_at": "2026-10-28T19:27:09.720522414Z",
  "resend_available_at": "2026-10-28T19:22:10.720522414Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "959684",
  "sent_at": "2026-10-28T19:22:09.724092472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2e9dfba-d720-4413-adae-cc369edc26b6",
  "code": "959684",
  "device_ref": "sandbox-7284"
}
```

```json
{
  "session_id": "3c82663b-7364-4eba-8027-30a5d7ed452d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjIyOSwiaWF0IjoxNzkzMjE1MzI5LCJqdGkiOiI0ODIyYTNhNC05NWVhLTRiYWUtYjc3OS02MTA2ZWEyMmE3ZDQiLCJzaWQiOiIzYzgyNjYzYi03MzY0LTRlYmEtODAyNy0zMGE1ZDdlZDQ1MmQifQ.Kq3zdmFDGTeyRpzMCopguvqEAgjvCWynukU4Y7wSauA",
  "access_expires_at": "2026-10-28T19:37:09.958885088Z",
  "refresh_token": "LACB1JI8yDpZpDZB0pj5uezlHWEhkCd-CIjNHF7a2HA",
  "refresh_expires_at": "2026-11-27T19:22:09.958169594Z",
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
  "command_id": "784e31db-fb80-4499-9582-3b0de5f74f04",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:10Z",
    "sequence": 1793215330388
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a66c68d8-175a-4b1b-b3c4-c925b97e832a",
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
  "last_heartbeat_at": "2026-10-28T19:22:10.404519Z",
  "last_location_at": "2026-10-28T19:22:10.404519Z",
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
  "session_id": "bd5aead5-652c-458b-bd94-7909fb0a6baa",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyMzAsImlhdCI6MTc5MzIxNTMzMCwianRpIjoiZTg5ZTU0ODItNTIwNS00MzQ3LTkzZTQtMmRlMzAyZmU4ZGZjIiwic2lkIjoiYmQ1YWVhZDUtNjUyYy00NThiLWJkOTQtNzkwOWZiMGE2YmFhIn0.spYLQy4Y0OQsni9epPQmd4Pd23dYbg7UGOUGc9QLSIM",
  "access_expires_at": "2026-10-28T19:37:10.902667039Z",
  "refresh_token": "SiV1I3Nq3kpaU9eb8mLw4DzeUG4i-dUONmgrCwap_ig",
  "refresh_expires_at": "2026-10-29T07:22:10.90199703Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d15d21c1-3225-4506-ab8d-e15195d6c8d5",
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
  "id": "946ef228-5d73-4bfb-996a-fbdca163e1c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:27:11.132714Z",
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
  "command_id": "1e0295cf-7f15-417f-be14-64e451b7dcb4",
  "quote_id": "946ef228-5d73-4bfb-996a-fbdca163e1c8",
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
    "phone": "+380674676592"
  }
}
```

```json
{
  "id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
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
  "created_at": "2026-10-28T19:22:11.380044Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674676592"
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
    "id": "010292c4-3cc5-4ffb-a5a8-829c129e57c8",
    "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
    "expires_at": "2026-10-28T19:22:26.385303Z",
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

`POST /api/driver/v1/offers/010292c4-3cc5-4ffb-a5a8-829c129e57c8/accept` → **200**

```json
{
  "command_id": "c244fe6d-e752-499f-bb64-5555948a98d0"
}
```

```json
{
  "id": "accf7f0e-3083-44c8-bf2a-9620e33ceb09",
  "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ff22c211-26aa-4a55-b160-6e0ebdaec564",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[
  {
    "phone": "+380674676592",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:13.276139951Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[
  {
    "phone": "+380674676592",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:13.276139951Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[
  {
    "phone": "+380674676592",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:13.276139951Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ff22c211-26aa-4a55-b160-6e0ebdaec564",
  "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
  "assignment_id": "accf7f0e-3083-44c8-bf2a-9620e33ceb09",
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
    "phone": "+380674676592"
  }
}
```

`POST /api/driver/v1/work-sessions/a66c68d8-175a-4b1b-b3c4-c925b97e832a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:14Z",
    "sequence": 1793215334399
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a66c68d8-175a-4b1b-b3c4-c925b97e832a",
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
  "last_heartbeat_at": "2026-10-28T19:22:14.416094Z",
  "last_location_at": "2026-10-28T19:22:14.416094Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ff22c211-26aa-4a55-b160-6e0ebdaec564/arrive` → **200**

```json
{
  "command_id": "f840aec7-f1d7-4645-ad3f-4eddfc067e8e",
  "expected_version": 0
}
```

```json
{
  "id": "ff22c211-26aa-4a55-b160-6e0ebdaec564",
  "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
  "assignment_id": "accf7f0e-3083-44c8-bf2a-9620e33ceb09",
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
  "arrived_at": "2026-10-28T19:22:14.640319Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674676592"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[
  {
    "phone": "+380674676592",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:13.276139951Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[
  {
    "phone": "+380674676592",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:13.276139951Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[
  {
    "phone": "+380674676592",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:13.276139951Z"
  },
  {
    "phone": "+380674676592",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:16.285384861Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[
  {
    "phone": "+380674676592",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:13.276139951Z"
  },
  {
    "phone": "+380674676592",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:16.285384861Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674676592` → **200**

```json
[
  {
    "phone": "+380674676592",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:13.276139951Z"
  },
  {
    "phone": "+380674676592",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T19:22:16.285384861Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/ff22c211-26aa-4a55-b160-6e0ebdaec564/start` → **200**

```json
{
  "command_id": "e3555e2c-d76a-4d50-9a3a-b3ee074cfc21",
  "expected_version": 1
}
```

```json
{
  "id": "ff22c211-26aa-4a55-b160-6e0ebdaec564",
  "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
  "assignment_id": "accf7f0e-3083-44c8-bf2a-9620e33ceb09",
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
  "arrived_at": "2026-10-28T19:22:14.640319Z",
  "started_at": "2026-10-28T19:22:16.981975Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674676592"
  }
}
```

`POST /api/driver/v1/trips/ff22c211-26aa-4a55-b160-6e0ebdaec564/complete` → **200**

```json
{
  "command_id": "86bb5fa2-3bee-41e4-b7b2-076f032c06e3",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:22:17Z",
  "cash_received": true
}
```

```json
{
  "id": "ff22c211-26aa-4a55-b160-6e0ebdaec564",
  "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
  "assignment_id": "accf7f0e-3083-44c8-bf2a-9620e33ceb09",
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
  "arrived_at": "2026-10-28T19:22:14.640319Z",
  "started_at": "2026-10-28T19:22:16.981975Z",
  "completed_at": "2026-10-28T19:22:17.212754Z",
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
  "session_id": "a66c68d8-175a-4b1b-b3c4-c925b97e832a",
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
  "last_heartbeat_at": "2026-10-28T19:22:14.416094Z",
  "last_location_at": "2026-10-28T19:22:14.416094Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a66c68d8-175a-4b1b-b3c4-c925b97e832a/close` → **200**

```json
{
  "command_id": "1d42aa8a-eec0-4b0d-aea4-4039459e5b04",
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
  "phone": "+380630740432",
  "device_ref": "sandbox-947"
}
```

```json
{
  "challenge_id": "2b32d2f7-a00d-4e8b-9012-e66c7dc6787f",
  "expires_at": "2026-10-28T19:27:17.892889967Z",
  "resend_available_at": "2026-10-28T19:22:18.892889967Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630740432` → **200**

```json
{
  "phone": "+380630740432",
  "audience": "CLIENT",
  "code": "670535",
  "sent_at": "2026-10-28T19:22:17.895747665Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b32d2f7-a00d-4e8b-9012-e66c7dc6787f",
  "code": "670535",
  "device_ref": "sandbox-947"
}
```

```json
{
  "session_id": "dfb1921d-6282-45f9-a353-ddd3382255f6",
  "subject": {
    "type": "CLIENT",
    "id": "89d8849b-6596-4bcd-a137-485460d030db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWQ4ODQ5Yi02NTk2LTRiY2QtYTEzNy00ODU0NjBkMDMwZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MjM4LCJpYXQiOjE3OTMyMTUzMzgsImp0aSI6IjdjNzMxNTE2LTVhNTQtNDlkZC1iMjdkLTVhYmQ1ZTNiOGM0NiIsInNpZCI6ImRmYjE5MjFkLTYyODItNDVmOS1hMzUzLWRkZDMzODIyNTVmNiJ9.o_8mBFOoh549DTcVaxVBLjbi5a_8jmsHb1IZltoEEdg",
  "access_expires_at": "2026-10-28T19:37:18.132501226Z",
  "refresh_token": "exiZ8YIcoSB6E1X4LTiwxFtniIJp-CDOBuyFCRTZmv0",
  "refresh_expires_at": "2026-11-27T19:22:18.131720225Z",
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
  "device_ref": "sandbox-18387"
}
```

```json
{
  "challenge_id": "b5a5bbbe-af4e-4c3a-a2cf-1bc12a0bb631",
  "expires_at": "2026-10-28T19:27:18.55913808Z",
  "resend_available_at": "2026-10-28T19:22:19.55913808Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "630615",
  "sent_at": "2026-10-28T19:22:18.562336133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5a5bbbe-af4e-4c3a-a2cf-1bc12a0bb631",
  "code": "630615",
  "device_ref": "sandbox-18387"
}
```

```json
{
  "session_id": "5894c089-b605-4593-b907-8776e6aef58b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjIzOCwiaWF0IjoxNzkzMjE1MzM4LCJqdGkiOiI1OGFiM2M0My0xZDEyLTQxODYtYjI1Yy1mMWI4OWI0M2IxOTIiLCJzaWQiOiI1ODk0YzA4OS1iNjA1LTQ1OTMtYjkwNy04Nzc2ZTZhZWY1OGIifQ.0RZx0DIopg8eR1frhBCDSObHRkIV-d9mLotaJBIhvQc",
  "access_expires_at": "2026-10-28T19:37:18.797740636Z",
  "refresh_token": "CrXcxtsolu2F3tCuXxwGuDkOoQgrDBGgR0BTMeXOSuE",
  "refresh_expires_at": "2026-11-27T19:22:18.79709527Z",
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
  "session_id": "cb41f3e9-ecc0-4869-b46e-ba144e22b59a",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyMzksImlhdCI6MTc5MzIxNTMzOSwianRpIjoiNTgwY2JmNzktNzE4MS00Y2Q5LTk3NDktYzQwZDI0ZGJiMzg2Iiwic2lkIjoiY2I0MWYzZTktZWNjMC00ODY5LWI0NmUtYmExNDRlMjJiNTlhIn0.t4rwzJrVpZ45fwwfI_9f_wWeupC-0Vp7ZJHwvKILNt0",
  "access_expires_at": "2026-10-28T19:37:19.50720888Z",
  "refresh_token": "2ZphSytAsyQQzOokVHKlkury0UeuEhwM_1uo0s4IUmY",
  "refresh_expires_at": "2026-10-29T07:22:19.50671044Z",
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
  "session_id": "1227b77e-b209-47da-99b3-4137711a8f5c",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyMzksImlhdCI6MTc5MzIxNTMzOSwianRpIjoiOTU0ZDljZmYtNmE1My00ODI1LTg4NTgtNDdmNjhmYzFjYWY2Iiwic2lkIjoiMTIyN2I3N2UtYjIwOS00N2RhLTk5YjMtNDEzNzcxMWE4ZjVjIn0.QUPhNasY9-Ge5OXLgWI8aXRNT448JwvGprhDNQzqT5Y",
  "access_expires_at": "2026-10-28T19:37:19.995126512Z",
  "refresh_token": "erKwAleymVWWGpfmmqSHpzWgwpVACrZvkaqVGNu2Kag",
  "refresh_expires_at": "2026-10-29T07:22:19.994604215Z",
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
  "command_id": "2f2a798c-1f95-479f-9bc5-811ea08c2c17",
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
  "id": "72f6eea0-2b64-4393-8736-3707eb100610",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:27:20.427092Z",
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
  "command_id": "73391128-9c99-4dd7-b761-26191133e867",
  "quote_id": "72f6eea0-2b64-4393-8736-3707eb100610",
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
  "id": "f0d9edc2-d8bb-4279-a4c7-207fd78e5c5d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89d8849b-6596-4bcd-a137-485460d030db",
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
  "created_at": "2026-10-28T19:22:20.662143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f0d9edc2-d8bb-4279-a4c7-207fd78e5c5d` → **200**

```json
{
  "id": "f0d9edc2-d8bb-4279-a4c7-207fd78e5c5d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89d8849b-6596-4bcd-a137-485460d030db",
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
  "created_at": "2026-10-28T19:22:20.662143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f0d9edc2-d8bb-4279-a4c7-207fd78e5c5d/cancel` → **200**

```json
{
  "command_id": "77916661-4b40-46ee-ae10-881928a82932",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "f0d9edc2-d8bb-4279-a4c7-207fd78e5c5d",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "89d8849b-6596-4bcd-a137-485460d030db",
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
  "created_at": "2026-10-28T19:22:20.662143Z",
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
  "command_id": "71d21462-656d-4cc3-8044-5c4f6dc945e9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:21Z",
    "sequence": 1793215341588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7d24b4d6-f1ec-4683-85a5-6cbd380d4cfe",
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
  "last_heartbeat_at": "2026-10-28T19:22:21.604009Z",
  "last_location_at": "2026-10-28T19:22:21.604009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12237"
}
```

```json
{
  "challenge_id": "448c1121-94c9-4480-84e1-baa291aab99d",
  "expires_at": "2026-10-28T19:27:21.827247019Z",
  "resend_available_at": "2026-10-28T19:22:22.827247019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "350651",
  "sent_at": "2026-10-28T19:22:21.830408994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "448c1121-94c9-4480-84e1-baa291aab99d",
  "code": "350651",
  "device_ref": "sandbox-12237"
}
```

```json
{
  "session_id": "ef2ade88-b527-4d44-a11f-d30c45608362",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjI0MiwiaWF0IjoxNzkzMjE1MzQyLCJqdGkiOiIzNGEyMDUzYy04YjkxLTRiY2UtYmFiYS1kZmM3NjE2OWU3MGQiLCJzaWQiOiJlZjJhZGU4OC1iNTI3LTRkNDQtYTExZi1kMzBjNDU2MDgzNjIifQ.tFObPA6pwJ3DuJ85v4T7itJWmn3EBDADu6nXlWMKLCM",
  "access_expires_at": "2026-10-28T19:37:22.082066468Z",
  "refresh_token": "EQ2XH-RujyK3nYgCt2NIQuHKK1DQmQKDTTFUHRn5Qh8",
  "refresh_expires_at": "2026-11-27T19:22:22.081411533Z",
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
  "command_id": "8515a0e5-e3ea-46a7-98fb-a62acb4a917f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:22Z",
    "sequence": 1793215342520
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "826c88f3-850d-4eed-90d9-14df8cdd2ef3",
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
  "last_heartbeat_at": "2026-10-28T19:22:22.536918Z",
  "last_location_at": "2026-10-28T19:22:22.536918Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b0c9418d-3031-4499-9ba9-426cd7119e6e",
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
  "id": "be23f55f-52e1-4f07-b4e0-785a3ed25010",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:27:22.772521Z",
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
  "command_id": "2b22ac79-2fae-40e7-a462-575b4228260b",
  "quote_id": "be23f55f-52e1-4f07-b4e0-785a3ed25010",
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
  "id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89d8849b-6596-4bcd-a137-485460d030db",
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
  "created_at": "2026-10-28T19:22:22.99869Z",
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
    "id": "71c6eaec-ee82-4173-b19e-46ebea2e1a9f",
    "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
    "expires_at": "2026-10-28T19:22:38.002495Z",
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

`POST /api/driver/v1/offers/71c6eaec-ee82-4173-b19e-46ebea2e1a9f/accept` → **200**

```json
{
  "command_id": "753a8e38-3c26-4678-a87a-55eaf7d1f49a"
}
```

```json
{
  "id": "0b463582-c206-4f19-ba65-d4ab4817485d",
  "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "58bcd4fb-0769-4c13-be44-8bc493ede025",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "58bcd4fb-0769-4c13-be44-8bc493ede025",
  "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
  "assignment_id": "0b463582-c206-4f19-ba65-d4ab4817485d",
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

`POST /api/driver/v1/trips/58bcd4fb-0769-4c13-be44-8bc493ede025/cancel` → **200**

```json
{
  "command_id": "ae6cfee0-8d78-49b4-a5ab-e346e6c54455",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "58bcd4fb-0769-4c13-be44-8bc493ede025",
  "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
  "assignment_id": "0b463582-c206-4f19-ba65-d4ab4817485d",
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

`GET /api/rider/v1/orders/9be826e6-4515-4a84-af2a-fcf84bf3f254` → **200**

```json
{
  "id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "89d8849b-6596-4bcd-a137-485460d030db",
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
    "id": "0b463582-c206-4f19-ba65-d4ab4817485d",
    "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "58bcd4fb-0769-4c13-be44-8bc493ede025",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:22:22.99869Z",
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
    "id": "93d2eb4a-9147-4324-98e8-6727eeeacfec",
    "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
    "expires_at": "2026-10-28T19:22:38.917501Z",
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

`POST /api/driver/v1/offers/93d2eb4a-9147-4324-98e8-6727eeeacfec/accept` → **200**

```json
{
  "command_id": "68a38a6b-fe5e-4aac-900e-662564f3bb39"
}
```

```json
{
  "id": "3ecba008-c91b-42d9-95a4-91e56d2289b5",
  "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84baa115-177d-4138-af55-a80c5332f5d0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "84baa115-177d-4138-af55-a80c5332f5d0",
  "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
  "assignment_id": "3ecba008-c91b-42d9-95a4-91e56d2289b5",
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

`POST /api/driver/v1/trips/84baa115-177d-4138-af55-a80c5332f5d0/cancel` → **200**

```json
{
  "command_id": "e4b82809-1776-4672-8e81-dcf22ab40c80",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "84baa115-177d-4138-af55-a80c5332f5d0",
  "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
  "assignment_id": "3ecba008-c91b-42d9-95a4-91e56d2289b5",
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
    "id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:22:22.99869Z",
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
    "id": "f0d9edc2-d8bb-4279-a4c7-207fd78e5c5d",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:22:20.662143Z",
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

`GET /api/operator/v1/orders/9be826e6-4515-4a84-af2a-fcf84bf3f254/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:22:22.999256Z",
      "actor": {
        "type": "CLIENT",
        "id": "89d8849b-6596-4bcd-a137-485460d030db",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
        "quote_id": "be23f55f-52e1-4f07-b4e0-785a3ed25010",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "1a833311-e02b-4130-8612-12e9f77b43fd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:22:23.001463Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
        "attempt_id": "01dc9b6f-3971-4691-a220-1c841bc3965b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1a833311-e02b-4130-8612-12e9f77b43fd"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:22:23.008228Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "71c6eaec-ee82-4173-b19e-46ebea2e1a9f",
        "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "1a833311-e02b-4130-8612-12e9f77b43fd"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:22:23.461317Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "71c6eaec-ee82-4173-b19e-46ebea2e1a9f",
        "order_id": "9be826e6-4515-4a84-af2a-fcf84bf3f254",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0b463582-c206-4f19-ba65-d4ab4817485d"
      },
      "correlation_id": "e28672ef-81fa-4425-b3d5-976e9f20aa93"
```

Done: orders f0d9edc2-d8bb-4279-a4c7-207fd78e5c5d, 9be826e6-4515-4a84-af2a-fcf84bf3f254.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733498694",
  "device_ref": "sandbox-24757"
}
```

```json
{
  "challenge_id": "4f0af5f4-6e52-41da-a8f6-a9cbf58eccb2",
  "expires_at": "2026-10-28T19:27:25.739798541Z",
  "resend_available_at": "2026-10-28T19:22:26.739798541Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733498694` → **200**

```json
{
  "phone": "+380733498694",
  "audience": "CLIENT",
  "code": "080872",
  "sent_at": "2026-10-28T19:22:25.744695669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f0af5f4-6e52-41da-a8f6-a9cbf58eccb2",
  "code": "080872",
  "device_ref": "sandbox-24757"
}
```

```json
{
  "session_id": "e79a93a6-52f7-4f9d-aee0-d1835b98a401",
  "subject": {
    "type": "CLIENT",
    "id": "c0cb192f-e0c3-470d-9afa-9b489bad5552"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMGNiMTkyZi1lMGMzLTQ3MGQtOWFmYS05YjQ4OWJhZDU1NTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MjQ1LCJpYXQiOjE3OTMyMTUzNDUsImp0aSI6IjM3MTZmOWI3LTM5ZTQtNDNkZC04OTlkLTk1NzVjY2E3MDhiZSIsInNpZCI6ImU3OWE5M2E2LTUyZjctNGY5ZC1hZWUwLWQxODM1Yjk4YTQwMSJ9.nND6-R-DzNrZMYv8v0cLn9IqA0S-DJcF8HZT6PMuMqQ",
  "access_expires_at": "2026-10-28T19:37:25.976295367Z",
  "refresh_token": "6l4atAeLXmj0HZeYxe_1_z44ANU5ssoKsqZF3__eBDs",
  "refresh_expires_at": "2026-11-27T19:22:25.975636498Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d16466c4-f815-4d04-bb43-455f82f31cf5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b302668a-227d-41ac-9d0e-d50af3a99cf2",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b302668a-227d-41ac-9d0e-d50af3a99cf2",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "32fc0b48f0b293d4105641712fc56912",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b302668a-227d-41ac-9d0e-d50af3a99cf2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733498694"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b302668a-227d-41ac-9d0e-d50af3a99cf2",
  "expires_at": "2026-10-28T19:52:26.194168Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b302668a-227d-41ac-9d0e-d50af3a99cf2` → **200**

```json
{
  "id": "b302668a-227d-41ac-9d0e-d50af3a99cf2",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T19:52:26.194168Z",
  "card": {
    "id": "9f66b728-7a03-4615-b7fe-8f750840e1f5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7496",
    "card_type": "Visa",
    "created_at": "2026-10-28T19:22:26.425515Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "9f66b728-7a03-4615-b7fe-8f750840e1f5",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7496",
      "card_type": "Visa",
      "created_at": "2026-10-28T19:22:26.425515Z"
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
  "device_ref": "sandbox-6879"
}
```

```json
{
  "challenge_id": "26854605-16eb-4df9-aaf5-5e8df414ce07",
  "expires_at": "2026-10-28T19:27:26.901255192Z",
  "resend_available_at": "2026-10-28T19:22:27.901255192Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "462960",
  "sent_at": "2026-10-28T19:22:26.904584314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26854605-16eb-4df9-aaf5-5e8df414ce07",
  "code": "462960",
  "device_ref": "sandbox-6879"
}
```

```json
{
  "session_id": "3656405b-5bae-4e03-9714-8ca2c9554ca4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjI0NywiaWF0IjoxNzkzMjE1MzQ3LCJqdGkiOiI5Y2ZkZGY2MS1mYTdlLTRlNTgtODE3Yi0yYzgxYmMzZDAwM2YiLCJzaWQiOiIzNjU2NDA1Yi01YmFlLTRlMDMtOTcxNC04Y2EyYzk1NTRjYTQifQ.VfYowGIkDubw4Ed8ABbFfCq80j6yFAcP27mQsmOvpwM",
  "access_expires_at": "2026-10-28T19:37:27.14109138Z",
  "refresh_token": "XOGBSP5AjP34gzWpLa0SKkam0XL6evyfD5UNFMGLC5Y",
  "refresh_expires_at": "2026-11-27T19:22:27.140515432Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "826c88f3-850d-4eed-90d9-14df8cdd2ef3",
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
  "last_heartbeat_at": "2026-10-28T19:22:22.536918Z",
  "last_location_at": "2026-10-28T19:22:22.536918Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/826c88f3-850d-4eed-90d9-14df8cdd2ef3/handover` → **200**

```json
{
  "command_id": "95d1fa13-a5a6-484d-b1fe-ed9bda0199c1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "826c88f3-850d-4eed-90d9-14df8cdd2ef3",
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
  "last_heartbeat_at": "2026-10-28T19:22:22.536918Z",
  "last_location_at": "2026-10-28T19:22:22.536918Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/826c88f3-850d-4eed-90d9-14df8cdd2ef3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:27Z",
    "sequence": 1793215347802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "826c88f3-850d-4eed-90d9-14df8cdd2ef3",
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
  "last_heartbeat_at": "2026-10-28T19:22:27.819575Z",
  "last_location_at": "2026-10-28T19:22:27.819575Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "20097637-88e8-4bde-a2da-882e9a8c6183",
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
  "id": "eaf43b9c-ad68-488e-b2d5-721cc419e186",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:27:28.051078Z",
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
  "command_id": "8fb0b8a5-6bab-4c38-a425-1fa7dd04df0d",
  "quote_id": "eaf43b9c-ad68-488e-b2d5-721cc419e186",
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
  "id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
  "created_at": "2026-10-28T19:22:28.288496Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c` → **200**

```json
{
  "id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
  "created_at": "2026-10-28T19:22:28.288496Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c` → **200**

```json
{
  "id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
  "created_at": "2026-10-28T19:22:28.288496Z",
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
    "id": "5993e058-8a41-4756-9275-3f51b99a0fd9",
    "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
    "expires_at": "2026-10-28T19:22:43.557389Z",
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

`POST /api/driver/v1/offers/5993e058-8a41-4756-9275-3f51b99a0fd9/accept` → **200**

```json
{
  "command_id": "2cd85132-2454-4075-8920-985303b87dbb"
}
```

```json
{
  "id": "56f570a3-07bf-4780-910b-28bd8f8489dc",
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e028b27c-3352-48ce-bc77-b9a67b828df1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e028b27c-3352-48ce-bc77-b9a67b828df1",
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "assignment_id": "56f570a3-07bf-4780-910b-28bd8f8489dc",
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

`POST /api/driver/v1/work-sessions/826c88f3-850d-4eed-90d9-14df8cdd2ef3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:30Z",
    "sequence": 1793215350669
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "826c88f3-850d-4eed-90d9-14df8cdd2ef3",
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
  "last_heartbeat_at": "2026-10-28T19:22:30.686578Z",
  "last_location_at": "2026-10-28T19:22:30.686578Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e028b27c-3352-48ce-bc77-b9a67b828df1/arrive` → **200**

```json
{
  "command_id": "60ae40a0-0023-4ee5-afa6-52de8223abd0",
  "expected_version": 0
}
```

```json
{
  "id": "e028b27c-3352-48ce-bc77-b9a67b828df1",
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "assignment_id": "56f570a3-07bf-4780-910b-28bd8f8489dc",
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
  "arrived_at": "2026-10-28T19:22:30.943173Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e028b27c-3352-48ce-bc77-b9a67b828df1/start` → **200**

```json
{
  "command_id": "755bfbc9-8bf6-4066-96c4-c0e64f1ee659",
  "expected_version": 1
}
```

```json
{
  "id": "e028b27c-3352-48ce-bc77-b9a67b828df1",
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "assignment_id": "56f570a3-07bf-4780-910b-28bd8f8489dc",
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
  "arrived_at": "2026-10-28T19:22:30.943173Z",
  "started_at": "2026-10-28T19:22:31.168785Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e028b27c-3352-48ce-bc77-b9a67b828df1/complete` → **200**

```json
{
  "command_id": "4e6037a1-8a5c-4a9f-917f-9e7f26c495da",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:22:31Z",
  "cash_received": true
}
```

```json
{
  "id": "e028b27c-3352-48ce-bc77-b9a67b828df1",
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "assignment_id": "56f570a3-07bf-4780-910b-28bd8f8489dc",
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
  "arrived_at": "2026-10-28T19:22:30.943173Z",
  "started_at": "2026-10-28T19:22:31.168785Z",
  "completed_at": "2026-10-28T19:22:31.399343Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c` → **200**

```json
{
  "id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
    "id": "56f570a3-07bf-4780-910b-28bd8f8489dc",
    "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e028b27c-3352-48ce-bc77-b9a67b828df1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:22:28.288496Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c` → **200**

```json
{
  "id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
    "id": "56f570a3-07bf-4780-910b-28bd8f8489dc",
    "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e028b27c-3352-48ce-bc77-b9a67b828df1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:22:28.288496Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c` → **200**

```json
{
  "id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
    "id": "56f570a3-07bf-4780-910b-28bd8f8489dc",
    "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e028b27c-3352-48ce-bc77-b9a67b828df1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:22:28.288496Z",
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

`GET /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c/tip` → **200**

```json
{
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
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
  "available_until": "2026-10-29T19:22:31.399343Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c/tip` → **201**

```json
{
  "command_id": "d7107ae9-86ef-46cc-92d6-4ac66403221c",
  "amount_minor": 2500
}
```

```json
{
  "id": "047a0d0f-660f-4d7c-aa6d-f427a02a3646",
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T19:22:34.779076Z"
}
```

`GET /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c/tip` → **200**

```json
{
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
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
  "available_until": "2026-10-29T19:22:31.399343Z",
  "open": false,
  "tip": {
    "id": "047a0d0f-660f-4d7c-aa6d-f427a02a3646",
    "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T19:22:34.779076Z"
  }
}
```

`GET /api/rider/v1/orders/68bbb791-e855-4532-b3f2-78aad7eb299c/tip` → **200**

```json
{
  "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
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
  "available_until": "2026-10-29T19:22:31.399343Z",
  "open": false,
  "tip": {
    "id": "047a0d0f-660f-4d7c-aa6d-f427a02a3646",
    "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T19:22:34.779076Z"
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
      "id": "5b96a0fe-54a4-40e7-bc07-291485edf123",
      "at": "2026-10-28T19:22:31.611767Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
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
      "id": "d158ed72-f86f-4424-974c-37f934e3d262",
      "at": "2026-10-28T19:22:36.665779Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
      "counterpart_id": null
    },
    {
      "id": "5b96a0fe-54a4-40e7-bc07-291485edf123",
      "at": "2026-10-28T19:22:31.611767Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "450d72f4-c650-41e2-87f3-0f049411efd8",
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
  "id": "fece8b16-a256-47b6-9948-daadf12e9a2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:27:37.918796Z",
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
  "session_id": "b7397588-ca87-4c22-ad69-0835520f8d6e",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyNTgsImlhdCI6MTc5MzIxNTM1OCwianRpIjoiZWZmM2Y1NjUtMGVlYi00MmU2LTliZGUtNDY5ZjVkZmI4MTI2Iiwic2lkIjoiYjczOTc1ODgtY2E4Ny00YzIyLWFkNjktMDgzNTUyMGY4ZDZlIn0.U7pImV092CBUjnMRyK4vSDE9mNBXMK3g5BGeZonIaj0",
  "access_expires_at": "2026-10-28T19:37:38.417147361Z",
  "refresh_token": "zDny5aNXXoLB1cO74ZRvn5ODK5T71kbToTP4GFfrcfY",
  "refresh_expires_at": "2026-10-29T07:22:38.416545651Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733498694` → **200**

```json
{
  "client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552"
}
```

`POST /api/admin/v1/rider-wallets/c0cb192f-e0c3-470d-9afa-9b489bad5552/top-ups` → **201**

```json
{
  "command_id": "230e0b51-a125-4950-ac3d-ba8e8927e622",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
      "id": "344445d5-b899-461e-9c0d-c7e4189308bb",
      "at": "2026-10-28T19:22:38.854985Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "abfdbcfe-b12b-4822-9562-d4d160ef2f61",
  "quote_id": "fece8b16-a256-47b6-9948-daadf12e9a2c",
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
  "id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
  "created_at": "2026-10-28T19:22:39.088614Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e414c515-ce00-43a4-9bbc-05c34b3c1a12` → **200**

```json
{
  "id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
  "created_at": "2026-10-28T19:22:39.088614Z",
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
    "id": "85eac6f5-308e-4e89-afaa-e8e26e78bd5e",
    "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
    "expires_at": "2026-10-28T19:22:54.09278Z",
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

`POST /api/driver/v1/offers/85eac6f5-308e-4e89-afaa-e8e26e78bd5e/accept` → **200**

```json
{
  "command_id": "b560bbb5-aced-427e-9e35-93530c383d4b"
}
```

```json
{
  "id": "d9e5f01a-7e43-46a6-997e-325dab5ff2d6",
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bc370589-3898-42b9-86af-f0405fe57827",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bc370589-3898-42b9-86af-f0405fe57827",
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
  "assignment_id": "d9e5f01a-7e43-46a6-997e-325dab5ff2d6",
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

`POST /api/driver/v1/work-sessions/826c88f3-850d-4eed-90d9-14df8cdd2ef3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:40Z",
    "sequence": 1793215360199
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "826c88f3-850d-4eed-90d9-14df8cdd2ef3",
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
  "last_heartbeat_at": "2026-10-28T19:22:40.215909Z",
  "last_location_at": "2026-10-28T19:22:40.215909Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bc370589-3898-42b9-86af-f0405fe57827/arrive` → **200**

```json
{
  "command_id": "2b96c7c7-2298-4981-a48e-abc57db2ae29",
  "expected_version": 0
}
```

```json
{
  "id": "bc370589-3898-42b9-86af-f0405fe57827",
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
  "assignment_id": "d9e5f01a-7e43-46a6-997e-325dab5ff2d6",
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
  "arrived_at": "2026-10-28T19:22:40.438675Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bc370589-3898-42b9-86af-f0405fe57827/start` → **200**

```json
{
  "command_id": "233f1de5-3e39-42db-a629-f9ce1ee0885b",
  "expected_version": 1
}
```

```json
{
  "id": "bc370589-3898-42b9-86af-f0405fe57827",
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
  "assignment_id": "d9e5f01a-7e43-46a6-997e-325dab5ff2d6",
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
  "arrived_at": "2026-10-28T19:22:40.438675Z",
  "started_at": "2026-10-28T19:22:40.670541Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bc370589-3898-42b9-86af-f0405fe57827/complete` → **200**

```json
{
  "command_id": "73e734ab-22bf-467a-9c5d-d42281d481b4",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:22:40Z",
  "cash_received": true
}
```

```json
{
  "id": "bc370589-3898-42b9-86af-f0405fe57827",
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
  "assignment_id": "d9e5f01a-7e43-46a6-997e-325dab5ff2d6",
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
  "arrived_at": "2026-10-28T19:22:40.438675Z",
  "started_at": "2026-10-28T19:22:40.670541Z",
  "completed_at": "2026-10-28T19:22:40.904473Z",
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
  "client_id": "c0cb192f-e0c3-470d-9afa-9b489bad5552",
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
      "id": "344445d5-b899-461e-9c0d-c7e4189308bb",
      "at": "2026-10-28T19:22:38.854985Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
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

`GET /api/rider/v1/orders/e414c515-ce00-43a4-9bbc-05c34b3c1a12/tip` → **200**

```json
{
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
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
  "available_until": "2026-10-29T19:22:40.904473Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e414c515-ce00-43a4-9bbc-05c34b3c1a12/tip` → **201**

```json
{
  "command_id": "4ba87d55-f6e4-401b-801f-5a4d62027c7f",
  "amount_minor": 2500
}
```

```json
{
  "id": "2fd9d78b-b572-4923-94ab-920e671594e2",
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T19:22:41.805897Z"
}
```

`GET /api/rider/v1/orders/e414c515-ce00-43a4-9bbc-05c34b3c1a12/tip` → **200**

```json
{
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
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
  "available_until": "2026-10-29T19:22:40.904473Z",
  "open": false,
  "tip": {
    "id": "2fd9d78b-b572-4923-94ab-920e671594e2",
    "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T19:22:41.805897Z"
  }
}
```

`GET /api/rider/v1/orders/e414c515-ce00-43a4-9bbc-05c34b3c1a12/tip` → **200**

```json
{
  "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
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
  "available_until": "2026-10-29T19:22:40.904473Z",
  "open": false,
  "tip": {
    "id": "2fd9d78b-b572-4923-94ab-920e671594e2",
    "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T19:22:41.805897Z"
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
      "id": "f182dcb2-c5b5-41ca-9e4a-25b202ac1dfe",
      "at": "2026-10-28T19:22:41.70557Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
      "counterpart_id": null
    },
    {
      "id": "d158ed72-f86f-4424-974c-37f934e3d262",
      "at": "2026-10-28T19:22:36.665779Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
      "counterpart_id": null
    },
    {
      "id": "5b96a0fe-54a4-40e7-bc07-291485edf123",
      "at": "2026-10-28T19:22:31.611767Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
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
      "id": "4cd64153-95ef-40e4-836c-4952b69246fa",
      "at": "2026-10-28T19:22:43.738866Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
      "counterpart_id": null
    },
    {
      "id": "f182dcb2-c5b5-41ca-9e4a-25b202ac1dfe",
      "at": "2026-10-28T19:22:41.70557Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e414c515-ce00-43a4-9bbc-05c34b3c1a12",
      "counterpart_id": null
    },
    {
      "id": "d158ed72-f86f-4424-974c-37f934e3d262",
      "at": "2026-10-28T19:22:36.665779Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
      "counterpart_id": null
    },
    {
      "id": "5b96a0fe-54a4-40e7-bc07-291485edf123",
      "at": "2026-10-28T19:22:31.611767Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "68bbb791-e855-4532-b3f2-78aad7eb299c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "826c88f3-850d-4eed-90d9-14df8cdd2ef3",
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
  "last_heartbeat_at": "2026-10-28T19:22:40.215909Z",
  "last_location_at": "2026-10-28T19:22:40.215909Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/826c88f3-850d-4eed-90d9-14df8cdd2ef3/close` → **200**

```json
{
  "command_id": "1683157e-e888-4619-a95d-0761c697e905",
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

Done: card order e414c515-ce00-43a4-9bbc-05c34b3c1a12.

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
  "phone": "+380738642708",
  "device_ref": "sandbox-3574"
}
```

```json
{
  "challenge_id": "8cd5651e-ce43-4859-b432-918fd70b000b",
  "expires_at": "2026-10-28T19:27:45.591882316Z",
  "resend_available_at": "2026-10-28T19:22:46.591882316Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738642708` → **200**

```json
{
  "phone": "+380738642708",
  "audience": "CLIENT",
  "code": "241786",
  "sent_at": "2026-10-28T19:22:45.594724307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cd5651e-ce43-4859-b432-918fd70b000b",
  "code": "241786",
  "device_ref": "sandbox-3574"
}
```

```json
{
  "session_id": "7bcec732-01a2-4310-aca9-acaf391164d9",
  "subject": {
    "type": "CLIENT",
    "id": "e4b33191-79b2-451f-8caf-dd0f60d17fd7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGIzMzE5MS03OWIyLTQ1MWYtOGNhZi1kZDBmNjBkMTdmZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MjY1LCJpYXQiOjE3OTMyMTUzNjUsImp0aSI6ImIyMWYzMmFhLWY4OGMtNDVhOS1hMmJkLWM0ZDJiNDcxNDRhNSIsInNpZCI6IjdiY2VjNzMyLTAxYTItNDMxMC1hY2E5LWFjYWYzOTExNjRkOSJ9.rKtbAYkCYDRLIjHqacvkKBYkgPTHp2HjzFZ-UvScGmY",
  "access_expires_at": "2026-10-28T19:37:45.830160506Z",
  "refresh_token": "xY6_DouKI_0cFqazyIHVgGJEdA5X_n_9D-uMeAs010o",
  "refresh_expires_at": "2026-11-27T19:22:45.829759803Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "7c0ac650-8842-4833-acf5-8c12ff9187e0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "1b25ede6-4fc9-4077-b249-178baf50fb23",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-1b25ede6-4fc9-4077-b249-178baf50fb23",
    "orderDate": "1793215366",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "24da2d58a2f90cdf12047e7293b78d02",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=1b25ede6-4fc9-4077-b249-178baf50fb23",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738642708"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=1b25ede6-4fc9-4077-b249-178baf50fb23",
  "created_at": "2026-10-28T19:22:46.053229Z",
  "expires_at": "2026-10-28T19:52:46.053229Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/1b25ede6-4fc9-4077-b249-178baf50fb23` → **200**

```json
{
  "id": "1b25ede6-4fc9-4077-b249-178baf50fb23",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T19:22:46.053229Z",
  "expires_at": "2026-10-28T19:52:46.053229Z",
  "completed_at": "2026-10-28T19:22:46.274499Z",
  "masked_pan": "41****7997",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e4b33191-79b2-451f-8caf-dd0f60d17fd7",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e4b33191-79b2-451f-8caf-dd0f60d17fd7",
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
      "id": "f142dd54-4065-46eb-ab07-1a72138f724e",
      "at": "2026-10-28T19:22:46.755212Z",
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
  "client_id": "e4b33191-79b2-451f-8caf-dd0f60d17fd7",
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
      "id": "f142dd54-4065-46eb-ab07-1a72138f724e",
      "at": "2026-10-28T19:22:46.755212Z",
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
  "device_ref": "sandbox-26207"
}
```

```json
{
  "challenge_id": "409cdab7-7f1d-4ad3-9dc7-0ca581b5f5d8",
  "expires_at": "2026-10-28T19:27:48.176395175Z",
  "resend_available_at": "2026-10-28T19:22:49.176395175Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "199380",
  "sent_at": "2026-10-28T19:22:48.178911286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "409cdab7-7f1d-4ad3-9dc7-0ca581b5f5d8",
  "code": "199380",
  "device_ref": "sandbox-26207"
}
```

```json
{
  "session_id": "5112f40f-ca02-4843-aef2-fd62bcbe8599",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjI2OCwiaWF0IjoxNzkzMjE1MzY4LCJqdGkiOiJjNWZkM2JhMS1mMTM4LTQ4NTctODA4YS1lZmUzYjM1ZWFmNTYiLCJzaWQiOiI1MTEyZjQwZi1jYTAyLTQ4NDMtYWVmMi1mZDYyYmNiZTg1OTkifQ.w81Xh4un2jXozm0T6PuN2UQXLYaI9pgeIO8UmKvUfew",
  "access_expires_at": "2026-10-28T19:37:48.407453135Z",
  "refresh_token": "U7gIRZhH3kxPwY-Tfwsbw2gdatdCi_TqBc8YzQ4Snws",
  "refresh_expires_at": "2026-11-27T19:22:48.406983275Z",
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
  "command_id": "e70dab60-b5ea-41ed-b136-819ff165e82f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "89c4ab5c-a742-44ef-9c4e-41013a5d5d15",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-89c4ab5c-a742-44ef-9c4e-41013a5d5d15",
    "orderDate": "1793215368",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "fdca4a401a546cf0ff2c6512251575db",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=89c4ab5c-a742-44ef-9c4e-41013a5d5d15",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=89c4ab5c-a742-44ef-9c4e-41013a5d5d15",
  "created_at": "2026-10-28T19:22:48.837254Z",
  "expires_at": "2026-10-28T19:52:48.837254Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/89c4ab5c-a742-44ef-9c4e-41013a5d5d15` → **200**

```json
{
  "id": "89c4ab5c-a742-44ef-9c4e-41013a5d5d15",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T19:22:48.837254Z",
  "expires_at": "2026-10-28T19:52:48.837254Z",
  "completed_at": "2026-10-28T19:22:49.051778Z",
  "masked_pan": "41****4862",
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
      "id": "4babc1dc-ac56-4eef-85df-135c8f9064fd",
      "at": "2026-10-28T19:22:49.76246Z",
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
  "command_id": "2ba57493-7000-4e41-97fb-a621a5e479ca",
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
  "correlation_id": "d5200b37-2588-4821-a464-6521da74a3fa"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: cash-dispute

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26466"
}
```

```json
{
  "challenge_id": "ce03efb4-725a-4682-baa8-829f5094d1db",
  "expires_at": "2026-10-28T19:27:50.938906071Z",
  "resend_available_at": "2026-10-28T19:22:51.938906071Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "535917",
  "sent_at": "2026-10-28T19:22:50.941424842Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce03efb4-725a-4682-baa8-829f5094d1db",
  "code": "535917",
  "device_ref": "sandbox-26466"
}
```

```json
{
  "session_id": "250272bc-77ed-4941-a938-f1430276b3b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjI3MSwiaWF0IjoxNzkzMjE1MzcxLCJqdGkiOiI3MDE3M2RhZS0yYzYxLTQ3MmQtODE2ZS02OWE0NmM1OTNlY2YiLCJzaWQiOiIyNTAyNzJiYy03N2VkLTQ5NDEtYTkzOC1mMTQzMDI3NmIzYjkifQ.k-5GQEX-g9LQ6ysOruAAsKRP5vFmLYp6ANhjo06SuZ0",
  "access_expires_at": "2026-10-28T19:37:51.17377632Z",
  "refresh_token": "Suw5XVCZSO5pNvOho2jBUg2zOXzsOQEURFkorSuEHlc",
  "refresh_expires_at": "2026-11-27T19:22:51.173377109Z",
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
  "command_id": "78734615-b58c-417d-82c2-5510caf917fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:51Z",
    "sequence": 1793215371603
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12d7a173-cd44-4450-afdb-5c38e299a60c",
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
  "last_heartbeat_at": "2026-10-28T19:22:51.618517Z",
  "last_location_at": "2026-10-28T19:22:51.618517Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631491665",
  "device_ref": "sandbox-26610"
}
```

```json
{
  "challenge_id": "0dbeddd3-bb15-4e23-b2ab-1795435f4bbd",
  "expires_at": "2026-10-28T19:27:51.836473928Z",
  "resend_available_at": "2026-10-28T19:22:52.836473928Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631491665` → **200**

```json
{
  "phone": "+380631491665",
  "audience": "CLIENT",
  "code": "120954",
  "sent_at": "2026-10-28T19:22:51.838348807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0dbeddd3-bb15-4e23-b2ab-1795435f4bbd",
  "code": "120954",
  "device_ref": "sandbox-26610"
}
```

```json
{
  "session_id": "7ef03a62-598b-4a95-aeb9-c56428b0534b",
  "subject": {
    "type": "CLIENT",
    "id": "486ebbef-4843-4e50-a294-6693aea8bc07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODZlYmJlZi00ODQzLTRlNTAtYTI5NC02NjkzYWVhOGJjMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MjcyLCJpYXQiOjE3OTMyMTUzNzIsImp0aSI6IjIzNGUyNGY5LWI1NGEtNDg0My04MjA3LTIxNjEwMTlhZWExNyIsInNpZCI6IjdlZjAzYTYyLTU5OGItNGE5NS1hZWI5LWM1NjQyOGIwNTM0YiJ9.BfzeJZkJ5i2bHajV8MW-866qu5eu7E9lRqGXG1iH0vo",
  "access_expires_at": "2026-10-28T19:37:52.072526987Z",
  "refresh_token": "NFrVoYzWHod00BokSJ-T57ooGfIyFO5S5Xeshj-W9l4",
  "refresh_expires_at": "2026-11-27T19:22:52.072087355Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3830b774-c68b-4478-8938-6b23c86ad784",
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
  "id": "395e8024-a0da-4115-90b0-e2da770c9503",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:27:52.292614Z",
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
  "command_id": "6f8e52b2-cb0c-41d5-8349-19d4304d314a",
  "quote_id": "395e8024-a0da-4115-90b0-e2da770c9503",
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
  "id": "983ff7db-7d99-4412-acc4-2985a7e15704",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "486ebbef-4843-4e50-a294-6693aea8bc07",
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
  "created_at": "2026-10-28T19:22:52.523288Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Ivan drives; at the end the rider has no money and leaves

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a5678a3b-d140-4fc1-aa37-02fcc83bc748",
    "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
    "expires_at": "2026-10-28T19:23:07.526292Z",
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

`POST /api/driver/v1/offers/a5678a3b-d140-4fc1-aa37-02fcc83bc748/accept` → **200**

```json
{
  "command_id": "68909e58-7f6b-4c79-abb8-a9e4717f1a3f"
}
```

```json
{
  "id": "42c75f95-a44f-4780-9b1a-f7c8b5686acd",
  "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "032efefb-c14b-4e0e-a3b1-3c6bd43d745a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "032efefb-c14b-4e0e-a3b1-3c6bd43d745a",
  "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
  "assignment_id": "42c75f95-a44f-4780-9b1a-f7c8b5686acd",
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
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/12d7a173-cd44-4450-afdb-5c38e299a60c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:22:53Z",
    "sequence": 1793215373417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12d7a173-cd44-4450-afdb-5c38e299a60c",
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
  "last_heartbeat_at": "2026-10-28T19:22:53.433735Z",
  "last_location_at": "2026-10-28T19:22:53.433735Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/032efefb-c14b-4e0e-a3b1-3c6bd43d745a/arrive` → **200**

```json
{
  "command_id": "703650ab-eab9-4a4a-9227-4f23c6c0fffb",
  "expected_version": 0
}
```

```json
{
  "id": "032efefb-c14b-4e0e-a3b1-3c6bd43d745a",
  "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
  "assignment_id": "42c75f95-a44f-4780-9b1a-f7c8b5686acd",
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
  "arrived_at": "2026-10-28T19:22:53.658229Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/032efefb-c14b-4e0e-a3b1-3c6bd43d745a/start` → **200**

```json
{
  "command_id": "1a7f9ed4-c59b-4024-86bd-f3ffe6fec56c",
  "expected_version": 1
}
```

```json
{
  "id": "032efefb-c14b-4e0e-a3b1-3c6bd43d745a",
  "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
  "assignment_id": "42c75f95-a44f-4780-9b1a-f7c8b5686acd",
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
  "arrived_at": "2026-10-28T19:22:53.658229Z",
  "started_at": "2026-10-28T19:22:53.888288Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/032efefb-c14b-4e0e-a3b1-3c6bd43d745a/complete` → **200**

```json
{
  "command_id": "59f8ddbf-44f9-4b57-aff6-3d54103cca4f",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:22:54Z",
  "cash_received": false
}
```

```json
{
  "id": "032efefb-c14b-4e0e-a3b1-3c6bd43d745a",
  "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
  "assignment_id": "42c75f95-a44f-4780-9b1a-f7c8b5686acd",
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
  "arrived_at": "2026-10-28T19:22:53.658229Z",
  "started_at": "2026-10-28T19:22:53.888288Z",
  "completed_at": "2026-10-28T19:22:54.125483Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Finance sees the dispute, with its deadline

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
  "session_id": "04f4eb88-561c-4890-a251-a4df7affb659",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyNzQsImlhdCI6MTc5MzIxNTM3NCwianRpIjoiYzgwMmVkZWItNTdhMC00YzhkLTg5NjMtNTI2ZDcyNjExNGQzIiwic2lkIjoiMDRmNGViODgtNTYxYy00ODkwLWEyNTEtYTRkZjdhZmZiNjU5In0.1nQnICqW5vj2S5j0AWQ0r0kHvXqlj4xm-kCtSszWQQY",
  "access_expires_at": "2026-10-28T19:37:54.612562356Z",
  "refresh_token": "dHcHG1gdLC8Fy9FwdLIaiT_EI2e7O7ia-LoYws6vZLg",
  "refresh_expires_at": "2026-10-29T07:22:54.612200857Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/983ff7db-7d99-4412-acc4-2985a7e15704/cash-dispute` → **200**

```json
{
  "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "486ebbef-4843-4e50-a294-6693aea8bc07",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T19:22:54.804828Z",
  "decide_by": "2026-11-11T19:22:54.804828Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-11T19:22:54.804828Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "486ebbef-4843-4e50-a294-6693aea8bc07",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-28T19:22:54.804828Z",
      "decide_by": "2026-11-11T19:22:54.804828Z",
      "decision": null,
      "decided_by": null,
      "reason": null,
      "decided_at": null,
      "version": 1
    }
  ]
}
```

## Finance decides: the rider did not pay, the service pays the driver

`POST /api/admin/v1/orders/983ff7db-7d99-4412-acc4-2985a7e15704/cash-dispute/decide` → **400**

```json
{
  "command_id": "93cfdc89-3d98-4738-b3cc-92a79e342e4d",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/983ff7db-7d99-4412-acc4-2985a7e15704/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e07a29a2-812d-4cdb-808e-d68ccd275df7",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/983ff7db-7d99-4412-acc4-2985a7e15704/cash-dispute/decide` → **200**

```json
{
  "command_id": "a60285d6-3a7d-4729-b0f6-9b9b50baf35b",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "486ebbef-4843-4e50-a294-6693aea8bc07",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T19:22:54.804828Z",
  "decide_by": "2026-11-11T19:22:54.804828Z",
  "decision": "PAY_DRIVER",
  "decided_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-28T19:22:55.539398Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/983ff7db-7d99-4412-acc4-2985a7e15704/cash-dispute/decide` → **409**

```json
{
  "command_id": "1e52e1f2-e29b-47da-8dbb-19cbfc0e27b8",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/983ff7db-7d99-4412-acc4-2985a7e15704/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "128afe0a-dba9-4ff5-a0cf-cd87bde85dd1"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "12d7a173-cd44-4450-afdb-5c38e299a60c",
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
  "last_heartbeat_at": "2026-10-28T19:22:53.433735Z",
  "last_location_at": "2026-10-28T19:22:53.433735Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12d7a173-cd44-4450-afdb-5c38e299a60c/close` → **200**

```json
{
  "command_id": "05e7f800-d96a-472b-bb3f-f9328f930a1e",
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
  "session_id": "9d96b997-ce62-4f0a-92db-12560b33b416",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyNzYsImlhdCI6MTc5MzIxNTM3NiwianRpIjoiYWVhM2FmNGItODRkZS00MTZjLWEwZGItOTNjOGU2MDcxMTBjIiwic2lkIjoiOWQ5NmI5OTctY2U2Mi00ZjBhLTkyZGItMTI1NjBiMzNiNDE2In0.-W7PKbXR4XqD6aVrsXdjQPaPI8sGFiNfdfHyyRjSRe4",
  "access_expires_at": "2026-10-28T19:37:56.687821902Z",
  "refresh_token": "jBVpn5w3mu2CE8pihQGsorrz_QAwChJnaTkuyOmx9kg",
  "refresh_expires_at": "2026-10-29T07:22:56.687429105Z",
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
  "phone": "+48600237128",
  "device_ref": "sandbox-5879"
}
```

```json
{
  "challenge_id": "4ec42ad8-8aac-48ff-8aa6-21f45d886aba",
  "expires_at": "2026-10-28T19:27:57.371759724Z",
  "resend_available_at": "2026-10-28T19:22:58.371759724Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600237128` → **200**

```json
{
  "phone": "+48600237128",
  "audience": "CLIENT",
  "code": "297165",
  "sent_at": "2026-10-28T19:22:57.373568229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ec42ad8-8aac-48ff-8aa6-21f45d886aba",
  "code": "297165",
  "device_ref": "sandbox-5879"
}
```

```json
{
  "session_id": "d7ff30af-a873-4fb6-98f8-cce325556a51",
  "subject": {
    "type": "CLIENT",
    "id": "02fb2735-b9ff-4558-8085-bc85022c5a53"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMmZiMjczNS1iOWZmLTQ1NTgtODA4NS1iYzg1MDIyYzVhNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2Mjc3LCJpYXQiOjE3OTMyMTUzNzcsImp0aSI6IjJmNGMwM2I5LTViZTgtNDQ1Zi1iZDMzLTg1NTg0NDUzMmUyNCIsInNpZCI6ImQ3ZmYzMGFmLWE4NzMtNGZiNi05OGY4LWNjZTMyNTU1NmE1MSJ9.jC8VzzHnWiLbo7xSLUCYuRpem6zZHGKSiOVwRQyXtW0",
  "access_expires_at": "2026-10-28T19:37:57.606570945Z",
  "refresh_token": "P5AMtTZkiCoNwxW8XvMUQugo2nAhq99aVrGYncf1l6Q",
  "refresh_expires_at": "2026-11-27T19:22:57.606105499Z",
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
  "command_id": "cae0f61f-ace2-4f03-9390-c02937d624ef",
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
  "correlation_id": "a14fc0f5-7ae0-48c7-a548-96c3dbe7c216",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
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
  "command_id": "5bb24f8f-4a4c-43dc-8849-1945a67ea7d9",
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
  "paused_at": "2026-10-28T19:22:58.484215128Z",
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
  "command_id": "a3e7e6df-483c-4239-8e1d-10d88ec25fee",
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
  "id": "8256dea4-efd0-449b-ac5f-c017c992686c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:27:58.937959Z",
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
  "command_id": "2edba58f-9209-4790-aa82-77dc15a310fc",
  "quote_id": "8256dea4-efd0-449b-ac5f-c017c992686c",
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
  "correlation_id": "53da9eec-d65b-4b83-a4ad-e75fee763b81"
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
  "paused_at": "2026-10-28T19:22:58.484215Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "2279d389-cf22-489b-bb8f-d448d308f593",
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
  "command_id": "f0b8f4b3-6b4e-46c1-af8f-23e6e324d54d",
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
  "command_id": "bfe3b2d2-dd91-4641-a8d2-cf7b1e350c30",
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
  "id": "1a665888-a378-4fdf-b058-1b88dcd2fac3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:00.307497Z",
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
  "command_id": "456ff8ed-a6c5-4347-ade4-5096dbfbed44",
  "quote_id": "1a665888-a378-4fdf-b058-1b88dcd2fac3",
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
  "correlation_id": "c0c8c07f-023a-46e5-958d-d0d4d0369fe1"
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
  "command_id": "e0784c4b-618c-46af-9898-9ad4c9473645",
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
      "from": "22:00",
      "to": "23:00"
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
      "from": "22:00",
      "to": "23:00"
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
  "command_id": "82d04776-a750-48d4-b7fa-679753b9b095",
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
  "id": "5c720112-671b-47c9-856b-a0b122c6a1a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:01.220163Z",
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
  "command_id": "0fb9f673-9aad-4817-a19f-cf7ce85168c0",
  "quote_id": "5c720112-671b-47c9-856b-a0b122c6a1a2",
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
  "correlation_id": "91cbba71-082e-40a5-a60d-cf08cea97d85"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5c62ad13-8763-417d-ade7-a2419ef50c0e",
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
  "correlation_id": "593e8b5f-ba1f-4b24-b4b3-0551ad270583"
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
      "from": "22:00",
      "to": "23:00"
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
  "command_id": "4e1e630a-43b7-4e68-b1d9-c8545ec6692f",
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
  "phone": "+380679992101",
  "device_ref": "sandbox-31323"
}
```

```json
{
  "challenge_id": "830dc161-6292-45b2-9b6e-a4ec419db9e5",
  "expires_at": "2026-10-28T19:28:02.362335298Z",
  "resend_available_at": "2026-10-28T19:23:03.362335298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679992101` → **200**

```json
{
  "phone": "+380679992101",
  "audience": "CLIENT",
  "code": "753861",
  "sent_at": "2026-10-28T19:23:02.364352883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "830dc161-6292-45b2-9b6e-a4ec419db9e5",
  "code": "753861",
  "device_ref": "sandbox-31323"
}
```

```json
{
  "session_id": "9d51a891-f087-4b35-8346-d2c50d121afa",
  "subject": {
    "type": "CLIENT",
    "id": "f99a329b-7d00-449c-8e9e-c125ece172fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOTlhMzI5Yi03ZDAwLTQ0OWMtOGU5ZS1jMTI1ZWNlMTcyZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MjgyLCJpYXQiOjE3OTMyMTUzODIsImp0aSI6IjcyOWE3ZDRkLTM5ZmEtNDA5My05ZTczLTFjMDM1MDZlMTZlMCIsInNpZCI6IjlkNTFhODkxLWYwODctNGIzNS04MzQ2LWQyYzUwZDEyMWFmYSJ9.68JGrRIKx9DHG4Xj2Pd8lOCst_ZoM69_5aephlPlAao",
  "access_expires_at": "2026-10-28T19:38:02.599951558Z",
  "refresh_token": "o39v_YUOvMWVkwB_JTLCsXmaYlLrBENFdY9nwoBUIx0",
  "refresh_expires_at": "2026-11-27T19:23:02.599452401Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f99a329b-7d00-449c-8e9e-c125ece172fc",
  "session_id": "9d51a891-f087-4b35-8346-d2c50d121afa",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c52e507e-8b37-4355-88c9-a2dae447b3bd",
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
  "id": "739ccf48-c4c5-4cf2-945c-d96df623e4ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:03.035285Z",
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
  "challenge_id": "37fe4c11-b47f-4e18-9904-86a8290721ed",
  "expires_at": "2026-10-28T19:28:05.266694879Z",
  "resend_available_at": "2026-10-28T19:23:06.266694879Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679992101` → **200**

```json
{
  "phone": "+380679992101",
  "audience": "CLIENT",
  "code": "651034",
  "sent_at": "2026-10-28T19:23:05.268741561Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "48f35d2c-f7c0-42c3-833b-81ae2e653673",
  "challenge_id": "37fe4c11-b47f-4e18-9904-86a8290721ed",
  "otp_code": "651034"
}
```

```json
{
  "client_id": "f99a329b-7d00-449c-8e9e-c125ece172fc",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T19:23:05.521260687Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d1730235-0129-4220-a6ca-4832071006c8",
  "quote_id": "739ccf48-c4c5-4cf2-945c-d96df623e4ca",
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
  "correlation_id": "71fee00a-e7d3-4238-9071-9539a919fd31"
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
  "session_id": "342466cd-0912-4fbc-ad99-2aaf2b9fdc75",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyODYsImlhdCI6MTc5MzIxNTM4NiwianRpIjoiM2UyZGY0MzktOWIzMy00N2NhLTg3ZDQtZTFkNWRmMWRlZTliIiwic2lkIjoiMzQyNDY2Y2QtMDkxMi00ZmJjLWFkOTktMmFhZjJiOWZkYzc1In0.NkkwDoATm2KvVNS1mCWISgJqdjEsasaa4Rif5248jlU",
  "access_expires_at": "2026-10-28T19:38:06.23514555Z",
  "refresh_token": "dXGjmscOyT2zDOJUz6fJVh3jRAODzjqVDn-9TrEiXmA",
  "refresh_expires_at": "2026-10-29T07:23:06.234678853Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "f99a329b-7d00-449c-8e9e-c125ece172fc",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T19:23:05.521261Z",
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

`POST /api/admin/v1/client-deletions/f99a329b-7d00-449c-8e9e-c125ece172fc/complete` → **200**

```json
{
  "command_id": "1ca6ef56-6ab6-42a7-a736-41c843991965",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "f99a329b-7d00-449c-8e9e-c125ece172fc",
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
  "correlation_id": "5dac886e-2dca-4d6a-a0d2-f16e2e686596"
}
```

Done: client f99a329b-7d00-449c-8e9e-c125ece172fc anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663809397",
  "device_ref": "sandbox-4470"
}
```

```json
{
  "challenge_id": "fc483e11-f0e2-4c8d-8f35-957f40c019b8",
  "expires_at": "2026-10-28T19:28:07.153888467Z",
  "resend_available_at": "2026-10-28T19:23:08.153888467Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663809397` → **200**

```json
{
  "phone": "+380663809397",
  "audience": "CLIENT",
  "code": "594955",
  "sent_at": "2026-10-28T19:23:07.155577801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc483e11-f0e2-4c8d-8f35-957f40c019b8",
  "code": "594955",
  "device_ref": "sandbox-4470"
}
```

```json
{
  "session_id": "ab7d3b8f-ebfa-44fb-9323-c43904a1c74a",
  "subject": {
    "type": "CLIENT",
    "id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Y2VlOGNkYi0yNDliLTRiNmYtODJmMi01MDJhOWY1Y2NmNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2Mjg3LCJpYXQiOjE3OTMyMTUzODcsImp0aSI6ImJlYTE2M2U3LTc4NzctNDYwYi1hZTRlLTE3ZmQ1MmU3ODk1ZCIsInNpZCI6ImFiN2QzYjhmLWViZmEtNDRmYi05MzIzLWM0MzkwNGExYzc0YSJ9.CGV0h2HqDoIESLiYndvrfRPBgTjSa4t5-zzI6lL_w4s",
  "access_expires_at": "2026-10-28T19:38:07.389801082Z",
  "refresh_token": "6aWzv7UPNAa4K-MdIpFQFsRCp4y1Pq5M7OWb7vpBo-M",
  "refresh_expires_at": "2026-11-27T19:23:07.389443636Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e",
  "session_id": "ab7d3b8f-ebfa-44fb-9323-c43904a1c74a",
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
  "session_id": "bb210aa4-ddf7-434d-8f93-53ad97550b6b",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyODgsImlhdCI6MTc5MzIxNTM4OCwianRpIjoiYjg4NjQ0ODItZTE4Ny00OGQ2LTk3ZDYtODMwNDM3MzA1N2ZkIiwic2lkIjoiYmIyMTBhYTQtZGRmNy00MzRkLThmOTMtNTNhZDk3NTUwYjZiIn0.EbHMJX3HXl-Gezl03gNR3Eq9W6tCBsIK8sD8cTiOIkA",
  "access_expires_at": "2026-10-28T19:38:08.080119325Z",
  "refresh_token": "6x_W_l2TX5DMktwKjEDI-mYOTOFiJ42dYL-Rm13jKFs",
  "refresh_expires_at": "2026-10-29T07:23:08.079692543Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3809397&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e",
      "phone": "+380663809397",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T19:23:07.388Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e` → **200**

```json
{
  "client": {
    "id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e",
    "phone": "+380663809397",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T19:23:07.388Z",
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

`POST /api/admin/v1/clients/6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e/block` → **400**

```json
{
  "command_id": "7c79d941-8805-43fd-b253-9a57c68b9d2b",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0e551c3d-9c76-4c51-b1ff-542fb0d498c0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e/block` → **200**

```json
{
  "command_id": "821d560d-04cb-41df-aad3-e7fab20f7352",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e",
  "phone": "+380663809397",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T19:23:07.388Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T19:23:09.039729Z",
    "by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
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
  "correlation_id": "741c4dbd-31ff-4b13-98bc-628343827a0a"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663809397",
  "device_ref": "sandbox-27006"
}
```

```json
{
  "challenge_id": "9f5e4b04-1e86-4634-9288-da36288d41d3",
  "expires_at": "2026-10-28T19:28:11.491334791Z",
  "resend_available_at": "2026-10-28T19:23:12.491334791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663809397` → **200**

```json
{
  "phone": "+380663809397",
  "audience": "CLIENT",
  "code": "510866",
  "sent_at": "2026-10-28T19:23:11.493632592Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "9f5e4b04-1e86-4634-9288-da36288d41d3",
  "code": "510866",
  "device_ref": "sandbox-27006"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "7055f38c-9e88-4c82-a577-85f1d81228dc"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e` → **200**

```json
{
  "client": {
    "id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e",
    "phone": "+380663809397",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T19:23:07.388Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T19:23:09.039729Z",
      "by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
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

`POST /api/admin/v1/clients/6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e/unblock` → **200**

```json
{
  "command_id": "6bbc0c9e-ab1d-49a2-ae43-328c407e2509",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e",
  "phone": "+380663809397",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T19:23:07.388Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663809397",
  "device_ref": "sandbox-18982"
}
```

```json
{
  "challenge_id": "4a0c44fe-d488-4568-a48c-85ceff014f14",
  "expires_at": "2026-10-28T19:28:14.434113059Z",
  "resend_available_at": "2026-10-28T19:23:15.434113059Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663809397` → **200**

```json
{
  "phone": "+380663809397",
  "audience": "CLIENT",
  "code": "896247",
  "sent_at": "2026-10-28T19:23:14.435855456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a0c44fe-d488-4568-a48c-85ceff014f14",
  "code": "896247",
  "device_ref": "sandbox-18982"
}
```

```json
{
  "session_id": "7337f994-eee8-4686-8647-b0ff4d9603bf",
  "subject": {
    "type": "CLIENT",
    "id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Y2VlOGNkYi0yNDliLTRiNmYtODJmMi01MDJhOWY1Y2NmNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2Mjk0LCJpYXQiOjE3OTMyMTUzOTQsImp0aSI6IjdjMTIxMzJjLTJlZTQtNGM3OS04OGE1LTE3YWI0ZmQwOTkwMSIsInNpZCI6IjczMzdmOTk0LWVlZTgtNDY4Ni04NjQ3LWIwZmY0ZDk2MDNiZiJ9.o3MQedFUih7jYIyrwEJtrEhOKuUpvETBSC7FB3Ziamg",
  "access_expires_at": "2026-10-28T19:38:14.677195413Z",
  "refresh_token": "nwr-jx6sSsJUf5kaONBG1hzd6m947J-VoAIKUFbvFsU",
  "refresh_expires_at": "2026-11-27T19:23:14.676706163Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6cee8cdb-249b-4b6f-82f2-502a9f5ccf5e",
  "session_id": "7337f994-eee8-4686-8647-b0ff4d9603bf",
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
  "phone": "+380661700898",
  "device_ref": "sandbox-25408"
}
```

```json
{
  "challenge_id": "ccbf9a95-abb1-49d0-921e-c397eb534f10",
  "expires_at": "2026-10-28T19:28:15.12501774Z",
  "resend_available_at": "2026-10-28T19:23:16.12501774Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661700898` → **200**

```json
{
  "phone": "+380661700898",
  "audience": "CLIENT",
  "code": "514881",
  "sent_at": "2026-10-28T19:23:15.127190373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ccbf9a95-abb1-49d0-921e-c397eb534f10",
  "code": "514881",
  "device_ref": "sandbox-25408"
}
```

```json
{
  "session_id": "8c37657a-04f2-4170-ad39-d565d7c11cff",
  "subject": {
    "type": "CLIENT",
    "id": "8171980a-2cf9-42d7-bd42-4d0ae9d9fcb1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MTcxOTgwYS0yY2Y5LTQyZDctYmQ0Mi00ZDBhZTlkOWZjYjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2Mjk1LCJpYXQiOjE3OTMyMTUzOTUsImp0aSI6IjNlNmU5ZmUwLWQzMDktNDMzNi1iYmNkLTdhYTUwYWNmNGM2ZSIsInNpZCI6IjhjMzc2NTdhLTA0ZjItNDE3MC1hZDM5LWQ1NjVkN2MxMWNmZiJ9.uQXh6GfZLwljCBfTKS5sH9dG4FPsChIRbo1jA-mw_p0",
  "access_expires_at": "2026-10-28T19:38:15.361673738Z",
  "refresh_token": "13l2jvjoSelWreEI9gpDBcai-EwIXTKl9t9TYFsm0gw",
  "refresh_expires_at": "2026-11-27T19:23:15.36131493Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b85bb5de-3412-4987-8874-a51bcec7199f",
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
  "id": "2d1a9ec9-1b3b-47aa-bd1e-3245dbc3878e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:15.594989Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 6bfcb955-e4ea-4b40-994b-1fc0f482742b) → **201**

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
  "session_id": "ae5c54b8-fd3e-4d5a-966f-ae634a3a3532",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyOTYsImlhdCI6MTc5MzIxNTM5NiwianRpIjoiOWQzYTkzOTctNTFmMi00Y2M4LTlmY2EtNDc1MzAwOTk5NjU0Iiwic2lkIjoiYWU1YzU0YjgtZmQzZS00ZDVhLTk2NmYtYWU2MzRhM2EzNTMyIn0.jiOwigJ2KlnFa14CEspegTl8bHcroU_tlOcMnHZSiko",
  "access_expires_at": "2026-10-28T19:38:16.120981901Z",
  "refresh_token": "1MIxiH__K6yIjm4p8K2rOwkq3Hdd8ubl8Ru0UBtsUQA",
  "refresh_expires_at": "2026-10-29T07:23:16.120443406Z",
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
  "session_id": "f5e5c204-6bf8-4db0-bd70-8f75820ffbb6",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYyOTYsImlhdCI6MTc5MzIxNTM5NiwianRpIjoiMzdkNmY1NDQtNmZjZS00M2Q3LTg4NjUtZmZkNzZhY2I0N2I0Iiwic2lkIjoiZjVlNWMyMDQtNmJmOC00ZGIwLWJkNzAtOGY3NTgyMGZmYmI2In0.LJdHjVUZnTIJOc3tS5jydoBGJ-FrOEIDOp6nvJpRLjw",
  "access_expires_at": "2026-10-28T19:38:16.609213688Z",
  "refresh_token": "h5b1ELZ_Sp1s0SzEhDtuUaH-w31_WMZLKJyW5-5uetA",
  "refresh_expires_at": "2026-10-29T07:23:16.608796782Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:23:15.822131Z",
      "actor": {
        "type": "CLIENT",
        "id": "8171980a-2cf9-42d7-bd42-4d0ae9d9fcb1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f",
        "quote_id": "2d1a9ec9-1b3b-47aa-bd1e-3245dbc3878e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6bfcb955-e4ea-4b40-994b-1fc0f482742b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:23:15.823691Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f",
        "attempt_id": "5de2f8fb-8647-4e74-854b-b02e1acfc1de",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6bfcb955-e4ea-4b40-994b-1fc0f482742b"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T19:23:15.831343Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f",
        "attempt_id": "5de2f8fb-8647-4e74-854b-b02e1acfc1de"
      },
      "correlation_id": "6bfcb955-e4ea-4b40-994b-1fc0f482742b"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "5de2f8fb-8647-4e74-854b-b02e1acfc1de",
        "generation": 1,
        "started_at": "2026-10-28T19:23:15.82298Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T19:23:15.831343Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T19:23:15.824317Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/6bfcb955-e4ea-4b40-994b-1fc0f482742b` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f:0",
      "order_id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f",
      "at": "2026-10-28T19:23:15.822131Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f:1",
      "order_id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f",
      "at": "2026-10-28T19:23:15.823691Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f:2",
      "order_id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f",
      "at": "2026-10-28T19:23:15.831343Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/eba5065c-bd47-4034-baa9-48ee478a31d1` → **200**

```json
{
  "found": []
}
```

Done: request 6bfcb955-e4ea-4b40-994b-1fc0f482742b — order d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f found by its id.

`GET /api/rider/v1/orders/d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f` → **200**

```json
{
  "id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8171980a-2cf9-42d7-bd42-4d0ae9d9fcb1",
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
  "created_at": "2026-10-28T19:23:15.821601Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f/cancel` → **200**

```json
{
  "command_id": "d8085aae-e8a7-45a1-a423-227bfa72258f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d9bc3b9a-f3e7-464b-9bae-6c5a212d7a1f",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8171980a-2cf9-42d7-bd42-4d0ae9d9fcb1",
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
  "created_at": "2026-10-28T19:23:15.821601Z",
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
  "phone": "+380639339301",
  "device_ref": "sandbox-18216"
}
```

```json
{
  "challenge_id": "e882fb97-cee1-4972-9bd5-0f6b74d77b78",
  "expires_at": "2026-10-28T19:28:17.966275717Z",
  "resend_available_at": "2026-10-28T19:23:18.966275717Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639339301` → **200**

```json
{
  "phone": "+380639339301",
  "audience": "CLIENT",
  "code": "942113",
  "sent_at": "2026-10-28T19:23:17.968213515Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e882fb97-cee1-4972-9bd5-0f6b74d77b78",
  "code": "942113",
  "device_ref": "sandbox-18216"
}
```

```json
{
  "session_id": "d33f814e-8b43-4565-9afd-17e6c74cfe6b",
  "subject": {
    "type": "CLIENT",
    "id": "4ad68a15-e4cc-4f0d-954a-5621db112689"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWQ2OGExNS1lNGNjLTRmMGQtOTU0YS01NjIxZGIxMTI2ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2Mjk4LCJpYXQiOjE3OTMyMTUzOTgsImp0aSI6Ijk3ODEwYzhkLTNkNGUtNDE5OC05ZWJiLTk2NGQ4NDNhZDk1YiIsInNpZCI6ImQzM2Y4MTRlLThiNDMtNDU2NS05YWZkLTE3ZTZjNzRjZmU2YiJ9.a6OjgrobhVP3CDDNtTgYcQRAgS-6XviskECa8YN-cCE",
  "access_expires_at": "2026-10-28T19:38:18.198933941Z",
  "refresh_token": "10TByYiGepK_PFt5zE5jzavn-68ALsudZT-PBzOR8wA",
  "refresh_expires_at": "2026-11-27T19:23:18.198494456Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "8043852a-5a40-4887-9685-05547d23f540",
  "expires_at": "2026-10-28T19:28:20.409769192Z",
  "resend_available_at": "2026-10-28T19:23:21.409769192Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639339301` → **200**

```json
{
  "phone": "+380639339301",
  "audience": "CLIENT",
  "code": "524054",
  "sent_at": "2026-10-28T19:23:20.411574634Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "7e0127c7-ac72-4c0a-958f-853d37e20440",
  "challenge_id": "8043852a-5a40-4887-9685-05547d23f540",
  "otp_code": "524054"
}
```

```json
{
  "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
  "state": "PENDING",
  "created_at": "2026-10-28T19:23:20.658026Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93` → **200**

```json
{
  "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
  "state": "PENDING",
  "created_at": "2026-10-28T19:23:20.658026Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93` → **200**

```json
{
  "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
  "state": "PENDING",
  "created_at": "2026-10-28T19:23:20.658026Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93` → **200**

```json
{
  "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
  "state": "PENDING",
  "created_at": "2026-10-28T19:23:20.658026Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93` → **200**

```json
{
  "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
  "state": "PENDING",
  "created_at": "2026-10-28T19:23:20.658026Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93` → **200**

```json
{
  "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
  "state": "PENDING",
  "created_at": "2026-10-28T19:23:20.658026Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93` → **200**

```json
{
  "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
  "state": "PENDING",
  "created_at": "2026-10-28T19:23:20.658026Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93` → **200**

```json
{
  "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
  "state": "READY",
  "created_at": "2026-10-28T19:23:20.658026Z",
  "ready_at": "2026-10-28T19:23:27.137541Z",
  "expires_at": "2026-11-04T19:23:27.137541Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630439072",
  "device_ref": "sandbox-4148"
}
```

```json
{
  "challenge_id": "02390458-009e-4e17-9c99-b4a7ca6759a7",
  "expires_at": "2026-10-28T19:28:28.408453824Z",
  "resend_available_at": "2026-10-28T19:23:29.408453824Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630439072` → **200**

```json
{
  "phone": "+380630439072",
  "audience": "CLIENT",
  "code": "613980",
  "sent_at": "2026-10-28T19:23:28.410704Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02390458-009e-4e17-9c99-b4a7ca6759a7",
  "code": "613980",
  "device_ref": "sandbox-4148"
}
```

```json
{
  "session_id": "68019f05-b664-4c3a-86a7-0cfa283d72ba",
  "subject": {
    "type": "CLIENT",
    "id": "a2831730-4ecb-4e4c-a6b3-9f9e76cb054f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjgzMTczMC00ZWNiLTRlNGMtYTZiMy05ZjllNzZjYjA1NGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzA4LCJpYXQiOjE3OTMyMTU0MDgsImp0aSI6IjAxNWNjNTIxLTUwMmMtNDhhOS04MTFkLTczZWFkODMxODU3NyIsInNpZCI6IjY4MDE5ZjA1LWI2NjQtNGMzYS04NmE3LTBjZmEyODNkNzJiYSJ9._ykI8fiOir3TynoXrS6tA2l6iN7JeLxz6VngHlnGkzA",
  "access_expires_at": "2026-10-28T19:38:28.635235333Z",
  "refresh_token": "cb0QpZ9yK5_kRnNt74NV0ucqghD6WvEnn5BDHdSLxtw",
  "refresh_expires_at": "2026-11-27T19:23:28.634743041Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/f6eedd42-887d-4d96-ada3-4053bf7c2c93/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "07461a26-f865-45c0-8d08-02600444c57d"
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
  "session_id": "95d54a70-8b28-4af6-90cd-e64eb6d87c3f",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzMDksImlhdCI6MTc5MzIxNTQwOSwianRpIjoiMmU1MWI1ZTQtNDQ5Mi00NzUzLTg1NTgtMzE1YzQ5Mzc0Mjg5Iiwic2lkIjoiOTVkNTRhNzAtOGIyOC00YWY2LTkwY2QtZTY0ZWI2ZDg3YzNmIn0.0RJg9YJ3Dtd3YW4Tk1ipEhlM-MpaskUPAGQKrG5PPe8",
  "access_expires_at": "2026-10-28T19:38:29.338822387Z",
  "refresh_token": "3PhoFupBwMr-yH3fVSnHQnJMVQyT90RUoiP7ATC4fNA",
  "refresh_expires_at": "2026-10-29T07:23:29.338317621Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4ad68a15-e4cc-4f0d-954a-5621db112689",
  "session_id": "d33f814e-8b43-4565-9afd-17e6c74cfe6b",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/4ad68a15-e4cc-4f0d-954a-5621db112689/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "f6eedd42-887d-4d96-ada3-4053bf7c2c93",
      "state": "READY",
      "created_at": "2026-10-28T19:23:20.658026Z",
      "ready_at": "2026-10-28T19:23:27.137541Z",
      "expires_at": "2026-11-04T19:23:27.137541Z",
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
  "device_ref": "sandbox-31397"
}
```

```json
{
  "challenge_id": "dccd6fbc-52d3-42ea-8e57-d636b416f0c2",
  "expires_at": "2026-10-28T19:28:29.979075133Z",
  "resend_available_at": "2026-10-28T19:23:30.979075133Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "908379",
  "sent_at": "2026-10-28T19:23:29.980945505Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dccd6fbc-52d3-42ea-8e57-d636b416f0c2",
  "code": "908379",
  "device_ref": "sandbox-31397"
}
```

```json
{
  "session_id": "5e5bd7c1-d74f-46f7-b3d2-d225f973edd8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjMxMCwiaWF0IjoxNzkzMjE1NDEwLCJqdGkiOiI2ODZlNzgyYi00MjZlLTRjOTMtOTg1NC01Yzk4ZWEzYzhjY2EiLCJzaWQiOiI1ZTViZDdjMS1kNzRmLTQ2ZjctYjNkMi1kMjI1Zjk3M2VkZDgifQ.RtyyBtV4GecwCOzJEZtv4XTbL-6NWTRAYhG3VUTPIbU",
  "access_expires_at": "2026-10-28T19:38:30.224485747Z",
  "refresh_token": "hZBG_i7gAMoDrB7AmwJkPhyAYtfibNg38Bg0EPUPhOg",
  "refresh_expires_at": "2026-11-27T19:23:30.224043567Z",
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
  "device_ref": "sandbox-16668"
}
```

```json
{
  "challenge_id": "daeda7f9-427f-4432-9113-2fe93d304bc2",
  "expires_at": "2026-10-28T19:28:30.650142214Z",
  "resend_available_at": "2026-10-28T19:23:31.650142214Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "774942",
  "sent_at": "2026-10-28T19:23:30.652037691Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "daeda7f9-427f-4432-9113-2fe93d304bc2",
  "code": "774942",
  "device_ref": "sandbox-16668"
}
```

```json
{
  "session_id": "752a17a7-7193-40ca-93e0-44420413673d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjMxMCwiaWF0IjoxNzkzMjE1NDEwLCJqdGkiOiJlYzU4M2I2My01MTAzLTQ0N2ItOTEyMS0xZjA2ZDhjYzM2M2MiLCJzaWQiOiI3NTJhMTdhNy03MTkzLTQwY2EtOTNlMC00NDQyMDQxMzY3M2QifQ.8ClHVJahE8YYWWs_ttUgpjPOEMVrNnMvSc6m49U9jt0",
  "access_expires_at": "2026-10-28T19:38:30.932204763Z",
  "refresh_token": "6slbJYK8LX2ngHFbSYYcIW5ziw1CopKYlvQIsx-1SxU",
  "refresh_expires_at": "2026-11-27T19:23:30.93151711Z",
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
  "command_id": "5559ae6b-e779-4f51-83fd-2e6bdc367fbe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:23:31Z",
    "sequence": 1793215411372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c261972e-3ff2-4c47-a57a-ffe5ce2fbeb9",
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
  "last_heartbeat_at": "2026-10-28T19:23:31.386594Z",
  "last_location_at": "2026-10-28T19:23:31.386594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-11134"
}
```

```json
{
  "challenge_id": "4dbd2620-4acd-4a0f-bb8f-fae8eb18d1bd",
  "expires_at": "2026-10-28T19:28:31.59825442Z",
  "resend_available_at": "2026-10-28T19:23:32.59825442Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "073612",
  "sent_at": "2026-10-28T19:23:31.600265609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dbd2620-4acd-4a0f-bb8f-fae8eb18d1bd",
  "code": "073612",
  "device_ref": "sandbox-11134"
}
```

```json
{
  "session_id": "fc66ac4b-72b8-42f6-82cc-0c139716e2bc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjMxMSwiaWF0IjoxNzkzMjE1NDExLCJqdGkiOiI0NGFkZTVkZC01N2FhLTQzOWItODRmYi1kOThlY2Y0YjkzZWYiLCJzaWQiOiJmYzY2YWM0Yi03MmI4LTQyZjYtODJjYy0wYzEzOTcxNmUyYmMifQ.AOzgVZWouspr0TLSqh2SZPFUSzLzmnhywj349ToR2Eo",
  "access_expires_at": "2026-10-28T19:38:31.834651416Z",
  "refresh_token": "r5wwBznPKlvdUJsSmU2zzZ3EaI6vLQFVDTRNXEsc8Qc",
  "refresh_expires_at": "2026-11-27T19:23:31.834288368Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7d24b4d6-f1ec-4683-85a5-6cbd380d4cfe",
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
  "last_heartbeat_at": "2026-10-28T19:22:21.604009Z",
  "last_location_at": "2026-10-28T19:22:21.604009Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7d24b4d6-f1ec-4683-85a5-6cbd380d4cfe/handover` → **200**

```json
{
  "command_id": "37cd5bd4-380a-4dae-b86f-8059c665bb87",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7d24b4d6-f1ec-4683-85a5-6cbd380d4cfe",
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
  "last_heartbeat_at": "2026-10-28T19:22:21.604009Z",
  "last_location_at": "2026-10-28T19:22:21.604009Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7d24b4d6-f1ec-4683-85a5-6cbd380d4cfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:23:32Z",
    "sequence": 1793215412486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7d24b4d6-f1ec-4683-85a5-6cbd380d4cfe",
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
  "last_heartbeat_at": "2026-10-28T19:23:32.502706Z",
  "last_location_at": "2026-10-28T19:23:32.502706Z",
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
  "session_id": "c1fc8758-b7c3-4345-9979-658ecead9f65",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzMTIsImlhdCI6MTc5MzIxNTQxMiwianRpIjoiNDdkMjZkOTEtYzcxNi00ZGJlLTgxMWQtYjYxOGI0ZGNhZTZhIiwic2lkIjoiYzFmYzg3NTgtYjdjMy00MzQ1LTk5NzktNjU4ZWNlYWQ5ZjY1In0.OW7j6O76HWhXUNMEUYB1u3LMgUrd6OsxiQn20FONu5E",
  "access_expires_at": "2026-10-28T19:38:32.982372813Z",
  "refresh_token": "xqJjt3C9FqOmSjjji-XbKquMvieFZJtBOigZxUQ59rQ",
  "refresh_expires_at": "2026-10-29T07:23:32.981961831Z",
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
  "session_id": "906ade1a-4bd0-4917-8354-6fa67b965508",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzMTMsImlhdCI6MTc5MzIxNTQxMywianRpIjoiNGFhMzdiYzYtOTZmMy00YjU3LWExNzEtMWVmY2NjOTNmNDljIiwic2lkIjoiOTA2YWRlMWEtNGJkMC00OTE3LTgzNTQtNmZhNjdiOTY1NTA4In0.e52uQENfh1P22TY6wyiiFpw3UQ6SOR8pQighvV5d5UI",
  "access_expires_at": "2026-10-28T19:38:33.471183984Z",
  "refresh_token": "xG6TL63zUlwDkruAwR6oY6NUYPba8QA8V-_qOtEKgFU",
  "refresh_expires_at": "2026-10-29T07:23:33.470565297Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684248374",
  "device_ref": "sandbox-14729"
}
```

```json
{
  "challenge_id": "5604312e-b749-45be-86bc-fb5a46794992",
  "expires_at": "2026-10-28T19:28:33.684293542Z",
  "resend_available_at": "2026-10-28T19:23:34.684293542Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380684248374` → **200**

```json
{
  "phone": "+380684248374",
  "audience": "CLIENT",
  "code": "347278",
  "sent_at": "2026-10-28T19:23:33.686483993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5604312e-b749-45be-86bc-fb5a46794992",
  "code": "347278",
  "device_ref": "sandbox-14729"
}
```

```json
{
  "session_id": "1da6a172-d7d4-4af3-a705-8a761e30b15d",
  "subject": {
    "type": "CLIENT",
    "id": "84722a3d-31f8-4644-977b-9499dc55e123"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDcyMmEzZC0zMWY4LTQ2NDQtOTc3Yi05NDk5ZGM1NWUxMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzEzLCJpYXQiOjE3OTMyMTU0MTMsImp0aSI6ImZmZDZmMDA2LTJhZjYtNDM3Ni05MDY5LWMwZmE1NzY0ZWFiOSIsInNpZCI6IjFkYTZhMTcyLWQ3ZDQtNGFmMy1hNzA1LThhNzYxZTMwYjE1ZCJ9.FpEddhIovoERh3gTC9yijO3zRXk1HtAxdu0Tyde5NHI",
  "access_expires_at": "2026-10-28T19:38:33.927703702Z",
  "refresh_token": "2FNzky06u5r8bXH2Qd5-a-JT3lNk6igz-8F7UEZ364Q",
  "refresh_expires_at": "2026-11-27T19:23:33.927153302Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6810d8cc-a22e-4ab4-a2c3-5035478a9306",
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
  "id": "d542fe2e-6df7-4103-a457-45bd84b20ec1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:34.157988Z",
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
  "command_id": "5745f4c2-90a4-495c-ae37-93603188ce2c",
  "quote_id": "d542fe2e-6df7-4103-a457-45bd84b20ec1",
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
  "id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "84722a3d-31f8-4644-977b-9499dc55e123",
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
  "created_at": "2026-10-28T19:23:34.379502Z",
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
    "id": "f791b58a-7b72-4fd6-8d49-662f20e9d382",
    "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
    "expires_at": "2026-10-28T19:23:49.383097Z",
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

`POST /api/driver/v1/offers/f791b58a-7b72-4fd6-8d49-662f20e9d382/reject` → **204**

```json
{
  "command_id": "a3e7a88d-c668-486a-8e62-442486f4b1a9"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a519b829-5a1b-41ba-bb0e-ac4a44848be5",
    "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
    "expires_at": "2026-10-28T19:23:49.844919Z",
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

`POST /api/driver/v1/offers/a519b829-5a1b-41ba-bb0e-ac4a44848be5/accept` → **200**

```json
{
  "command_id": "cb52d26d-4aa4-4d1d-bddb-e94ac805bfe9"
}
```

```json
{
  "id": "42e5c556-282f-486b-887e-e352525a4023",
  "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ee20c73f-e123-4c2f-883e-2415c314e95b",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/4d96cef6-d2fa-417a-a86f-e8021406dcb6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:23:34.380085Z",
      "actor": {
        "type": "CLIENT",
        "id": "84722a3d-31f8-4644-977b-9499dc55e123",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
        "quote_id": "d542fe2e-6df7-4103-a457-45bd84b20ec1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "933798ce-56a3-42fb-9ceb-404af19bd3b7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:23:34.382245Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
        "attempt_id": "663fa403-cbad-4ec9-ba26-d49f850ac3bf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "933798ce-56a3-42fb-9ceb-404af19bd3b7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:23:34.386286Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f791b58a-7b72-4fd6-8d49-662f20e9d382",
        "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "933798ce-56a3-42fb-9ceb-404af19bd3b7"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T19:23:34.843971Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f791b58a-7b72-4fd6-8d49-662f20e9d382",
        "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6"
      },
      "correlation_id": "0d06614b-db44-4b2d-be2e-cd7cc9fed515"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 4d96cef6-d2fa-417a-a86f-e8021406dcb6 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/4d96cef6-d2fa-417a-a86f-e8021406dcb6` → **200**

```json
{
  "id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
  "short_number": 9,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "84722a3d-31f8-4644-977b-9499dc55e123",
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
    "id": "42e5c556-282f-486b-887e-e352525a4023",
    "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ee20c73f-e123-4c2f-883e-2415c314e95b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T19:23:34.379502Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4d96cef6-d2fa-417a-a86f-e8021406dcb6/cancel` → **200**

```json
{
  "command_id": "e3ec64a8-76c3-45f0-92bc-f0c871538e5e",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "84722a3d-31f8-4644-977b-9499dc55e123",
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
    "id": "42e5c556-282f-486b-887e-e352525a4023",
    "order_id": "4d96cef6-d2fa-417a-a86f-e8021406dcb6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ee20c73f-e123-4c2f-883e-2415c314e95b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:23:34.379502Z",
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
  "session_id": "c261972e-3ff2-4c47-a57a-ffe5ce2fbeb9",
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
  "last_heartbeat_at": "2026-10-28T19:23:31.386594Z",
  "last_location_at": "2026-10-28T19:23:31.386594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c261972e-3ff2-4c47-a57a-ffe5ce2fbeb9/close` → **200**

```json
{
  "command_id": "7c60184f-49fc-444f-8be5-1b8048eeb44a",
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
  "session_id": "7d24b4d6-f1ec-4683-85a5-6cbd380d4cfe",
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
  "last_heartbeat_at": "2026-10-28T19:23:32.502706Z",
  "last_location_at": "2026-10-28T19:23:32.502706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d24b4d6-f1ec-4683-85a5-6cbd380d4cfe/close` → **200**

```json
{
  "command_id": "45c0b19e-1f3e-45c5-8e59-fa6c8e493cb2",
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

# Scenario: feature-flags

## The admin looks at the feature flags

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
  "session_id": "8a2bc26c-2718-4741-b17f-2371f500e790",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzMTcsImlhdCI6MTc5MzIxNTQxNywianRpIjoiZDg0OGRkMGYtMWE0MC00ZTVkLWFhNDYtYTI3NzcyN2I3Y2FkIiwic2lkIjoiOGEyYmMyNmMtMjcxOC00NzQxLWIxN2YtMjM3MWY1MDBlNzkwIn0.oRIsY3aMsHZGuATqhe5drHCZ4BF0pyP7vtqBFf0T9Yg",
  "access_expires_at": "2026-10-28T19:38:37.196634078Z",
  "refresh_token": "nq2YL0MaSA-PTiUeG9G4rMkuQApygApLdO6h8aB5_wY",
  "refresh_expires_at": "2026-10-29T07:23:37.196258333Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 0,
      "changed_by": null,
      "reason": null,
      "changed_at": null
    }
  ]
}
```

card-payments: {"enabled":true,"owner":"payments","review_by":"2027-06-30","version":0}

## Card payments are switched off for a provider incident

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "adbc8c7c-9f35-414b-9bee-0a482a939f13",
  "expected_version": 0,
  "enabled": false,
  "reason": "Sandbox: provider incident"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": false,
  "version": 1,
  "changed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T19:23:37.653647Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "a87df97f-dafd-48fb-a9c6-74fc9dc13dd3",
  "expected_version": 0,
  "enabled": false,
  "reason": "An old version"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/card-payments/change",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "ca599266-3c95-45a2-a324-0a4b72bb96ef"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "8038b8a6-245c-4780-b83b-e1862d4a11d7",
  "expected_version": 0,
  "enabled": false,
  "reason": "x"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/no-such-flag/change",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "66da0f04-0018-4b58-bc6e-254dda3fd083"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638884875",
  "device_ref": "sandbox-13834"
}
```

```json
{
  "challenge_id": "e5a1c8be-567e-49e9-83bd-c0748eb67243",
  "expires_at": "2026-10-28T19:28:38.32308341Z",
  "resend_available_at": "2026-10-28T19:23:39.32308341Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638884875` → **200**

```json
{
  "phone": "+380638884875",
  "audience": "CLIENT",
  "code": "018132",
  "sent_at": "2026-10-28T19:23:38.324983177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5a1c8be-567e-49e9-83bd-c0748eb67243",
  "code": "018132",
  "device_ref": "sandbox-13834"
}
```

```json
{
  "session_id": "6a8a2ed6-983b-4835-8a57-8249b4484165",
  "subject": {
    "type": "CLIENT",
    "id": "cff7c3d0-c376-45ac-af02-3a991bc5a9f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZmY3YzNkMC1jMzc2LTQ1YWMtYWYwMi0zYTk5MWJjNWE5ZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzE4LCJpYXQiOjE3OTMyMTU0MTgsImp0aSI6IjZhMjZlOWNmLTQ2ODItNGJhNC05ZTZkLWUwMThlYjk3OTAzNyIsInNpZCI6IjZhOGEyZWQ2LTk4M2ItNDgzNS04YTU3LTgyNDliNDQ4NDE2NSJ9.vnsTUs20Zg82syaRInN-2nJ5VPS_OJFqjWWrxFSEFYc",
  "access_expires_at": "2026-10-28T19:38:38.563086826Z",
  "refresh_token": "8PSzZ_5P3eBkjV5howh3mojgfnCqlDZ-2uzBPn0hg7E",
  "refresh_expires_at": "2026-11-27T19:23:38.562503685Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6fbf699c-30cf-4c00-a5b1-5b647d7c84e5",
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
  "id": "53f55735-f1aa-4dea-b718-e03ee17e939e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:38.781218Z",
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

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "109eae77-35e1-42a5-8740-20b7bf8ca89f",
  "quote_id": "53f55735-f1aa-4dea-b718-e03ee17e939e",
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
  "payment_method": "CARD"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "d8a68922-6843-4dc9-a887-39239a45e585"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ae9219cb-26ee-4bf9-83d0-562a43daf711",
  "quote_id": "53f55735-f1aa-4dea-b718-e03ee17e939e",
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
  "id": "cdf5dbe0-e000-4c29-9865-79bae63e6b3f",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cff7c3d0-c376-45ac-af02-3a991bc5a9f6",
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
  "created_at": "2026-10-28T19:23:39.236034Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cdf5dbe0-e000-4c29-9865-79bae63e6b3f/cancel` → **200**

```json
{
  "command_id": "d7089133-09d9-4eaa-ac76-0840db47117b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cdf5dbe0-e000-4c29-9865-79bae63e6b3f",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cff7c3d0-c376-45ac-af02-3a991bc5a9f6",
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
  "created_at": "2026-10-28T19:23:39.236034Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "9d542b3c-bfb2-4263-a735-a59fcc7da184",
  "expected_version": 1,
  "enabled": true,
  "reason": "Sandbox: incident over"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": true,
  "version": 2,
  "changed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T19:23:39.698339Z"
}
```

Done: a new card order refused while the flag was off; a cash order went through; the flag is on again.

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 2,
      "changed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T19:23:39.698339Z"
    }
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
  "device_ref": "sandbox-374"
}
```

```json
{
  "challenge_id": "79d3da44-0ee8-4916-b42d-149eba3e5752",
  "expires_at": "2026-10-28T19:28:40.357385366Z",
  "resend_available_at": "2026-10-28T19:23:41.357385366Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "880767",
  "sent_at": "2026-10-28T19:23:40.35930967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79d3da44-0ee8-4916-b42d-149eba3e5752",
  "code": "880767",
  "device_ref": "sandbox-374"
}
```

```json
{
  "session_id": "bcb073f3-d087-4420-bc70-684505a29be5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjMyMCwiaWF0IjoxNzkzMjE1NDIwLCJqdGkiOiJhMmMwOTY4Yi04NWQ4LTQ2NmYtYWUxZi1mMzE0ODcyMWQwYjUiLCJzaWQiOiJiY2IwNzNmMy1kMDg3LTQ0MjAtYmM3MC02ODQ1MDVhMjliZTUifQ.QEXHJkFZo6E3SIiwDOnaRZ-cWHo0lOcbqxHMzBCx4tY",
  "access_expires_at": "2026-10-28T19:38:40.592203273Z",
  "refresh_token": "McT3Ag966M-7J3JpzOtP3b1t5cZYP5gIrgNcEM4VK28",
  "refresh_expires_at": "2026-11-27T19:23:40.59180367Z",
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
  "command_id": "65398309-b1c8-4425-aad2-9a1545913f09",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:23:41Z",
    "sequence": 1793215421250
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:23:41.039062Z",
  "last_location_at": "2026-10-28T19:23:41.039062Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677919698",
  "device_ref": "sandbox-6231"
}
```

```json
{
  "challenge_id": "1df3b4b5-032b-4446-a12e-46e163a7d96b",
  "expires_at": "2026-10-28T19:28:41.262374328Z",
  "resend_available_at": "2026-10-28T19:23:42.262374328Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677919698` → **200**

```json
{
  "phone": "+380677919698",
  "audience": "CLIENT",
  "code": "646439",
  "sent_at": "2026-10-28T19:23:41.264212014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1df3b4b5-032b-4446-a12e-46e163a7d96b",
  "code": "646439",
  "device_ref": "sandbox-6231"
}
```

```json
{
  "session_id": "118cc8d1-f71f-48b7-8e01-835f6b4d4c84",
  "subject": {
    "type": "CLIENT",
    "id": "11efac7b-6745-4c21-94c8-46ddfb5a7fb5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMWVmYWM3Yi02NzQ1LTRjMjEtOTRjOC00NmRkZmI1YTdmYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzIxLCJpYXQiOjE3OTMyMTU0MjEsImp0aSI6ImYyMjA1ZmQxLWJkZDctNDc2Ni1hMjczLWIyZDAzYmZjMTk0OSIsInNpZCI6IjExOGNjOGQxLWY3MWYtNDhiNy04ZTAxLTgzNWY2YjRkNGM4NCJ9.ZyLZ8588FhXwVlQZc42XobMdDEDtpyl2iMtqjsywoq8",
  "access_expires_at": "2026-10-28T19:38:41.493344535Z",
  "refresh_token": "meeAy3wOB78E3QLxja0CB9_ljsvF11XmpFmLC5vrMTc",
  "refresh_expires_at": "2026-11-27T19:23:41.492908792Z",
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
  "command_id": "b360d537-d32f-4317-97cc-c2c7457dc94e",
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
  "id": "be2fda48-b31a-4584-99da-bbfb15492725",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:41.934808Z",
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
  "command_id": "0a714efc-764e-469a-aea8-564613df403a",
  "platform": "ANDROID",
  "token": "sandbox-driver-e8e7c9e4-30c2-45ff-9629-9fa91f0c3ff3"
}
```

```json
{
  "id": "5f61f7aa-cece-4c9f-b399-837de4a84a4c",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T19:23:42.161542Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "0d7b85d7-7c87-455e-8fd6-5f1e1ee691b0",
  "platform": "ANDROID",
  "token": "sandbox-rider-da6aa091-9956-4025-9329-be3ebc18ecc6"
}
```

```json
{
  "id": "a18ba2ee-8b3d-429a-9d6c-c605a7bb1e87",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T19:23:42.384553Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6ca92a32-5265-43e5-bb77-05c0ffbc6549",
  "quote_id": "be2fda48-b31a-4584-99da-bbfb15492725",
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
  "id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "11efac7b-6745-4c21-94c8-46ddfb5a7fb5",
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
  "created_at": "2026-10-28T19:23:42.612789Z",
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
    "id": "93e3a0bf-5205-4d27-85e4-5ed0f6724ffb",
    "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
    "expires_at": "2026-10-28T19:23:57.615362Z",
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

`POST /api/driver/v1/offers/93e3a0bf-5205-4d27-85e4-5ed0f6724ffb/accept` → **200**

```json
{
  "command_id": "6bf070ae-d115-4967-8bfb-3bee2a1e41df"
}
```

```json
{
  "id": "15bdff22-54b0-45a4-848a-86b4fee91b7d",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9933f7ca-023b-49f7-802e-9b8b53cc621b",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T19:23:42.592Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T19:23:42.592Z` → **200**

```json
[
  {
    "at": "2026-10-28T19:23:43.474059874Z",
    "token_suffix": "0c3ff3",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
      "order_version": "2",
      "event_id": "7fc7c611-129d-44cb-aa54-86055f93820d"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677919698&after=2026-10-28T19:23:42.592Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380677919698&after=2026-10-28T19:23:42.592Z` → **200**

```json
[
  {
    "at": "2026-10-28T19:23:44.478592049Z",
    "token_suffix": "18ecc6",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
      "order_version": "3",
      "event_id": "ca244a1e-067a-461c-a752-c6e4894ffa95"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/5924444c-2a13-4ac7-a074-31889dba5231/messages` → **201**

```json
{
  "command_id": "fb827dfd-28f8-4c02-9ea4-88c0c4e76356",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "ab35bf53-c0d4-4eb0-9b7d-a2b3ef7c8c53",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T19:23:45.381591061Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9933f7ca-023b-49f7-802e-9b8b53cc621b",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "assignment_id": "15bdff22-54b0-45a4-848a-86b4fee91b7d",
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

`POST /api/driver/v1/trips/9933f7ca-023b-49f7-802e-9b8b53cc621b/messages` → **201**

```json
{
  "command_id": "f9eaac34-1003-445d-b602-98c4327ad88c",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "49b800c6-71be-4ac0-9551-665020cce6dd",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T19:23:45.826442148Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/5924444c-2a13-4ac7-a074-31889dba5231/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/9933f7ca-023b-49f7-802e-9b8b53cc621b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677919698"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/deef4441-5a11-41aa-835c-cec9782fe1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:23:46Z",
    "sequence": 1793215426479
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:23:46.494175Z",
  "last_location_at": "2026-10-28T19:23:46.494175Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9933f7ca-023b-49f7-802e-9b8b53cc621b",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "assignment_id": "15bdff22-54b0-45a4-848a-86b4fee91b7d",
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

`POST /api/driver/v1/trips/9933f7ca-023b-49f7-802e-9b8b53cc621b/arrive` → **200**

```json
{
  "command_id": "aa3b303b-40dd-4eaf-9e50-674d0174668a",
  "expected_version": 0
}
```

```json
{
  "id": "9933f7ca-023b-49f7-802e-9b8b53cc621b",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "assignment_id": "15bdff22-54b0-45a4-848a-86b4fee91b7d",
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
  "arrived_at": "2026-10-28T19:23:46.919505Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9933f7ca-023b-49f7-802e-9b8b53cc621b/start` → **200**

```json
{
  "command_id": "09c238e9-471e-42c5-849c-0d90ebf2af1b",
  "expected_version": 1
}
```

```json
{
  "id": "9933f7ca-023b-49f7-802e-9b8b53cc621b",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "assignment_id": "15bdff22-54b0-45a4-848a-86b4fee91b7d",
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
  "arrived_at": "2026-10-28T19:23:46.919505Z",
  "started_at": "2026-10-28T19:23:47.145194Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/deef4441-5a11-41aa-835c-cec9782fe1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:23:47Z",
    "sequence": 1793215427358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:23:47.377007Z",
  "last_location_at": "2026-10-28T19:23:47.377007Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/9933f7ca-023b-49f7-802e-9b8b53cc621b/complete` → **200**

```json
{
  "command_id": "e970e2db-e0cf-4610-b13c-4b604e7cfb89",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:23:47Z",
  "cash_received": true
}
```

```json
{
  "id": "9933f7ca-023b-49f7-802e-9b8b53cc621b",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "assignment_id": "15bdff22-54b0-45a4-848a-86b4fee91b7d",
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
  "arrived_at": "2026-10-28T19:23:46.919505Z",
  "started_at": "2026-10-28T19:23:47.145194Z",
  "completed_at": "2026-10-28T19:23:47.60358Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/5924444c-2a13-4ac7-a074-31889dba5231` → **200**

```json
{
  "id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "11efac7b-6745-4c21-94c8-46ddfb5a7fb5",
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
    "id": "15bdff22-54b0-45a4-848a-86b4fee91b7d",
    "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9933f7ca-023b-49f7-802e-9b8b53cc621b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:23:42.612789Z",
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
    "id": "5924444c-2a13-4ac7-a074-31889dba5231",
    "short_number": 11,
    "status": "FULFILLED",
    "created_at": "2026-10-28T19:23:42.612789Z",
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
    "id": "9933f7ca-023b-49f7-802e-9b8b53cc621b",
    "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
    "order_short_number": 11,
    "created_at": "2026-10-28T19:23:43.068321Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "032efefb-c14b-4e0e-a3b1-3c6bd43d745a",
    "order_id": "983ff7db-7d99-4412-acc4-2985a7e15704",
    "order_short_number": 7,
    "created_at": "2026-10-28T19:22:52.98354Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ff22c211-26aa-4a55-b160-6e0ebdaec564",
    "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
    "order_short_number": 2,
    "created_at": "2026-10-28T19:22:11.857389Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "512c98c2-35e5-46a4-8fc9-fc5a27631dac",
    "order_id": "523efb4a-a48a-4b3c-a866-a3ef73848f6c",
    "order_short_number": 1,
    "created_at": "2026-10-28T19:21:50.287826Z",
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
      "balance_minor": 7257,
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
        "trips": 4,
        "fare_minor": 42068,
        "commission_minor": 6312,
        "driver_share_minor": 35756,
        "cash_minor": 28499,
        "cashless_minor": 13569,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": 7257
      }
    }
  ],
  "total": {
    "trips": 4,
    "fare_minor": 42068,
    "commission_minor": 6312,
    "driver_share_minor": 35756,
    "cash_minor": 28499,
    "cashless_minor": 13569,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": 7257
  },
  "balance_minor": 7257
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/5924444c-2a13-4ac7-a074-31889dba5231/tip` → **200**

```json
{
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
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
  "available_until": "2026-10-29T19:23:47.60358Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5924444c-2a13-4ac7-a074-31889dba5231/tip` → **201**

```json
{
  "command_id": "239a93c4-d7a3-4f9f-ac63-06f64d8fbafc",
  "amount_minor": 1100
}
```

```json
{
  "id": "18d5bf3d-6684-4ea2-a6e1-a1210354a5e0",
  "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T19:23:52.15416Z"
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
  "session_id": "7d2d117a-902b-4d32-82fd-8615ac5200cd",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzMzIsImlhdCI6MTc5MzIxNTQzMiwianRpIjoiYzZjYWRiOTQtMGQwMS00MDU1LWI0YzktODEzMzYyYjhmNjgzIiwic2lkIjoiN2QyZDExN2EtOTAyYi00ZDMyLTgyZmQtODYxNWFjNTIwMGNkIn0.r6v2fV1pfiaI2_nB4JoXRXYrLcZ4FW3Wmv2afKjT9ew",
  "access_expires_at": "2026-10-28T19:38:52.647718825Z",
  "refresh_token": "vNBJi7hBQ4ylhow5yxsIXekBqRcv7eHfFXSdRga09Kk",
  "refresh_expires_at": "2026-10-29T07:23:52.647305173Z",
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
        "created": 11,
        "fulfilled": 6,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 10,
          "PHONE": 1
        },
        "by_payment": {
          "CASH": 10,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "STAFF": 1,
          "RIDER": 3
        }
      }
    }
  ],
  "total": {
    "created": 11,
    "fulfilled": 6,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 10,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 10,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "STAFF": 1,
      "RIDER": 3
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 2
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
  "generated_at": "2026-10-28T19:23:52.868108114Z"
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
        "trips": 6,
        "fares_minor": 74662,
        "service_rides_minor": 0,
        "commission_minor": 11202,
        "driver_share_minor": 63460,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 28499,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 6,
    "fares_minor": 74662,
    "service_rides_minor": 0,
    "commission_minor": 11202,
    "driver_share_minor": 63460,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 28499,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-28T19:23:53.105234709Z"
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
  "session_id": "cf7b3370-1179-404f-a98b-f7a21cb0d4e6",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzMzMsImlhdCI6MTc5MzIxNTQzMywianRpIjoiNjBjM2ZhMzUtYzU5MS00YjM3LThlZWUtMTdiYzQ4NzI1NmM4Iiwic2lkIjoiY2Y3YjMzNzAtMTE3OS00MDRmLWE5OGItZjdhMjFjYjBkNGU2In0.CiU1SuiF-LcFfE2DYjJKDuO65hkvEWidZ0AVriwIAkA",
  "access_expires_at": "2026-10-28T19:38:53.610271703Z",
  "refresh_token": "ASv8IpG3B0Dt0b8dtMMAjwY1BXq13W1entPzv1ztEbw",
  "refresh_expires_at": "2026-10-29T07:23:53.609753324Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5924444c-2a13-4ac7-a074-31889dba5231/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:23:42.613186Z",
      "actor": {
        "type": "CLIENT",
        "id": "11efac7b-6745-4c21-94c8-46ddfb5a7fb5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
        "quote_id": "be2fda48-b31a-4584-99da-bbfb15492725",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cf11f846-69f2-44c8-b22e-a679e114156b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:23:42.614781Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
        "attempt_id": "259febbc-65ae-4c20-b23a-7661c6f96c9a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cf11f846-69f2-44c8-b22e-a679e114156b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:23:42.616745Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "93e3a0bf-5205-4d27-85e4-5ed0f6724ffb",
        "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "cf11f846-69f2-44c8-b22e-a679e114156b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:23:43.06942Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "93e3a0bf-5205-4d27-85e4-5ed0f6724ffb",
        "order_id": "5924444c-2a13-4ac7-a074-31889dba5231",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "15bdff22-54b0-45a4-848a-86b4fee91b7d"
      },
      "correlation_id": "8399cb70-d2e6-4e22-9c05-bc6e0bf3e972"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T19:23:54.059970994Z",
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
      "last_location_at": "2026-10-28T19:23:47.377007Z",
      "order_id": null
    }
  ]
}
```

Done: order 5924444c-2a13-4ac7-a074-31889dba5231.

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
  "session_id": "539c1c16-5eb9-417c-a33f-5e29a26fe421",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzMzQsImlhdCI6MTc5MzIxNTQzNCwianRpIjoiNWRlNmU5YjctYjIyOS00NjE4LWI0NDYtNTcxOTQ2NmFhNTQ4Iiwic2lkIjoiNTM5YzFjMTYtNWViOS00MTdjLWEzM2YtNWUyOWEyNmZlNDIxIn0.UN2a38drnA5D88bRXKU7nIg9-VSKI5PsRf8Wz0X4o4Y",
  "access_expires_at": "2026-10-28T19:38:54.556978472Z",
  "refresh_token": "EJLx6ayfa3XPvuvfzKmzHytzocCwpQOc-HMKyAVI-GA",
  "refresh_expires_at": "2026-10-29T07:23:54.556514569Z",
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
  "command_id": "267cd9d3-784b-4441-83b4-eb9245ab69c8",
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
  "timestamp": "2026-10-28T19:23:55.000+0000",
  "channel": {
    "id": "1730052000.18432305",
    "linkedid": "1730052000.18432305",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679232099"
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
  "timestamp": "2026-10-28T19:23:55.000+0000",
  "channel": {
    "id": "1730052000.18432305",
    "linkedid": "1730052000.18432305",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679232099"
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
  "session_id": "496ccc79-23d5-41f4-a0f0-d0e922fb7d6b",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzMzUsImlhdCI6MTc5MzIxNTQzNSwianRpIjoiMzE3MzY3YWMtYmQzZi00ZTE1LTk0YTUtZTAzMDcyNGEwMzhhIiwic2lkIjoiNDk2Y2NjNzktMjNkNS00MWY0LWEwZjAtZDBlOTIyZmI3ZDZiIn0.k22qbDG4vpPZIlfHT2br2hXgRCgbhD3ui0pB0vdeHrA",
  "access_expires_at": "2026-10-28T19:38:55.511273988Z",
  "refresh_token": "GrqcMlABGdMiMTtYt_6-YJJLhVtOTLIQDmBvkDXnpIM",
  "refresh_expires_at": "2026-10-29T07:23:55.510743552Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "d181f6ef-a3ad-4a98-a10e-b4de4c282458",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679232099",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T19:23:55Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/d181f6ef-a3ad-4a98-a10e-b4de4c282458/answer` → **200**

```json
{
  "command_id": "017162dc-9f27-47c6-b7b7-36933fb5d145"
}
```

```json
{
  "id": "d181f6ef-a3ad-4a98-a10e-b4de4c282458",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679232099",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "order_ids": [],
  "started_at": "2026-10-28T19:23:55Z",
  "answered_at": "2026-10-28T19:23:55.953517Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.18432305",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "38a9c7ca-4822-435c-8f72-beb67fc843f0",
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
  "id": "572f8abd-89db-4ef8-a2ed-b0df64ba3ab5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:56.205983Z",
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
  "command_id": "518196fd-667f-4962-8c5c-32e22b557d68",
  "quote_id": "572f8abd-89db-4ef8-a2ed-b0df64ba3ab5",
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
    "phone": "+380679232099"
  },
  "call_id": "d181f6ef-a3ad-4a98-a10e-b4de4c282458"
}
```

```json
{
  "id": "564b774c-3b1e-4b39-81e8-5ac2e8e92ca2",
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
  "created_at": "2026-10-28T19:23:56.434911Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679232099"
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
    "id": "1730052000.18432305",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d181f6ef-a3ad-4a98-a10e-b4de4c282458",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679232099",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [
        "564b774c-3b1e-4b39-81e8-5ac2e8e92ca2"
      ],
      "started_at": "2026-10-28T19:23:55Z",
      "answered_at": "2026-10-28T19:23:55.953517Z",
      "ended_at": "2026-10-28T19:23:56.683891Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "7fd51905-1d88-4c77-9400-79050c476d8e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679331969",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [],
      "started_at": "2026-10-28T19:21:57.324209Z",
      "answered_at": "2026-10-28T19:21:57.574058Z",
      "ended_at": "2026-10-28T19:21:57.813027Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:22:07.114241Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/564b774c-3b1e-4b39-81e8-5ac2e8e92ca2` → **200**

```json
{
  "id": "564b774c-3b1e-4b39-81e8-5ac2e8e92ca2",
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
  "created_at": "2026-10-28T19:23:56.434911Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679232099"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/564b774c-3b1e-4b39-81e8-5ac2e8e92ca2` → **200**

```json
{
  "id": "564b774c-3b1e-4b39-81e8-5ac2e8e92ca2",
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
  "created_at": "2026-10-28T19:23:56.434911Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679232099"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/564b774c-3b1e-4b39-81e8-5ac2e8e92ca2/cancel` → **200**

```json
{
  "command_id": "6ae6919b-defe-4425-93a0-30988263f47b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "564b774c-3b1e-4b39-81e8-5ac2e8e92ca2",
  "short_number": 12,
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
  "created_at": "2026-10-28T19:23:56.434911Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679232099"
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

Done: call d181f6ef-a3ad-4a98-a10e-b4de4c282458 with order 564b774c-3b1e-4b39-81e8-5ac2e8e92ca2.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26662"
}
```

```json
{
  "challenge_id": "a1fdee61-767b-4478-b6f0-73dec2a46edf",
  "expires_at": "2026-10-28T19:28:57.631481981Z",
  "resend_available_at": "2026-10-28T19:23:58.631481981Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "811145",
  "sent_at": "2026-10-28T19:23:57.633691393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1fdee61-767b-4478-b6f0-73dec2a46edf",
  "code": "811145",
  "device_ref": "sandbox-26662"
}
```

```json
{
  "session_id": "22832d05-a8ec-42f4-b984-5e869d95abca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjMzNywiaWF0IjoxNzkzMjE1NDM3LCJqdGkiOiJhYTg1MGFlNi1mOGRiLTQ5NmMtOWQzYS1jZDk4YjYxYjVlZDYiLCJzaWQiOiIyMjgzMmQwNS1hOGVjLTQyZjQtYjk4NC01ZTg2OWQ5NWFiY2EifQ.hmmU8DbiPt_rPX2-uEkdxOJU5_KbZIkrlbnQBLuoMKc",
  "access_expires_at": "2026-10-28T19:38:57.870453688Z",
  "refresh_token": "vnpUOorxkzb6BuGvA45J9wcrQ3mfFxCNPGYiMAOIzW8",
  "refresh_expires_at": "2026-11-27T19:23:57.870019802Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:23:47.377007Z",
  "last_location_at": "2026-10-28T19:23:47.377007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/deef4441-5a11-41aa-835c-cec9782fe1c7/handover` → **200**

```json
{
  "command_id": "700ccfb8-4eb6-47d9-9228-b6171d7a8353",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:23:47.377007Z",
  "last_location_at": "2026-10-28T19:23:47.377007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/deef4441-5a11-41aa-835c-cec9782fe1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:23:58Z",
    "sequence": 1793215438513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:23:58.52772Z",
  "last_location_at": "2026-10-28T19:23:58.52772Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667093041",
  "device_ref": "sandbox-707"
}
```

```json
{
  "challenge_id": "3b88e7ad-5ff5-48d0-86ec-c78c47d2d101",
  "expires_at": "2026-10-28T19:28:58.742370412Z",
  "resend_available_at": "2026-10-28T19:23:59.742370412Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667093041` → **200**

```json
{
  "phone": "+380667093041",
  "audience": "CLIENT",
  "code": "177079",
  "sent_at": "2026-10-28T19:23:58.744214522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b88e7ad-5ff5-48d0-86ec-c78c47d2d101",
  "code": "177079",
  "device_ref": "sandbox-707"
}
```

```json
{
  "session_id": "af1fd9d4-bc67-4454-8fd7-5c91b175f63d",
  "subject": {
    "type": "CLIENT",
    "id": "63348fdf-f031-4b87-8d38-e0cae3fddd56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MzM0OGZkZi1mMDMxLTRiODctOGQzOC1lMGNhZTNmZGRkNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzM4LCJpYXQiOjE3OTMyMTU0MzgsImp0aSI6IjZlZTAwYmEyLTUxOGQtNGQ1MS1iZjdlLTFkMGNjMGU1MjM3OCIsInNpZCI6ImFmMWZkOWQ0LWJjNjctNDQ1NC04ZmQ3LTVjOTFiMTc1ZjYzZCJ9.FdSXUEw9aodejJ_L_17yZpimuFRMiznrZTtsOM0lLgk",
  "access_expires_at": "2026-10-28T19:38:58.974533371Z",
  "refresh_token": "hTR1qK9qUJM6wxx4TfGiWfoYtbv7mqeK9uUD1o72EWA",
  "refresh_expires_at": "2026-11-27T19:23:58.974164311Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "57863d2c-a11b-47e9-83e2-e2ff7c6daee8",
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
  "id": "8841ca55-86d1-4350-8e43-b91a211215fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:28:59.192273Z",
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
  "command_id": "91605389-cc2f-483e-997f-faec186871c2",
  "quote_id": "8841ca55-86d1-4350-8e43-b91a211215fe",
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
  "id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63348fdf-f031-4b87-8d38-e0cae3fddd56",
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
  "created_at": "2026-10-28T19:23:59.423717Z",
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
    "id": "9f9074ab-8c51-4bc6-8961-5f94509ee282",
    "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
    "expires_at": "2026-10-28T19:24:14.425948Z",
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

`POST /api/driver/v1/offers/9f9074ab-8c51-4bc6-8961-5f94509ee282/accept` → **200**

```json
{
  "command_id": "ef360eb0-ec0a-489a-9c4d-2c9095d01c43"
}
```

```json
{
  "id": "b8c8cdc3-15db-4fb0-bb43-5166b8534e46",
  "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ba74d73-d79d-4ebf-a250-5db9d1d39c36",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ba74d73-d79d-4ebf-a250-5db9d1d39c36",
  "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
  "assignment_id": "b8c8cdc3-15db-4fb0-bb43-5166b8534e46",
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

`POST /api/driver/v1/work-sessions/deef4441-5a11-41aa-835c-cec9782fe1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:00Z",
    "sequence": 1793215440306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:24:00.321852Z",
  "last_location_at": "2026-10-28T19:24:00.321852Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8ba74d73-d79d-4ebf-a250-5db9d1d39c36/arrive` → **200**

```json
{
  "command_id": "efa30448-f2d4-4b0a-b884-0793530bf242",
  "expected_version": 0
}
```

```json
{
  "id": "8ba74d73-d79d-4ebf-a250-5db9d1d39c36",
  "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
  "assignment_id": "b8c8cdc3-15db-4fb0-bb43-5166b8534e46",
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
  "arrived_at": "2026-10-28T19:24:00.543418Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8ba74d73-d79d-4ebf-a250-5db9d1d39c36/start` → **200**

```json
{
  "command_id": "1d9d3424-9bc7-4a59-b987-60fbd90f624e",
  "expected_version": 1
}
```

```json
{
  "id": "8ba74d73-d79d-4ebf-a250-5db9d1d39c36",
  "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
  "assignment_id": "b8c8cdc3-15db-4fb0-bb43-5166b8534e46",
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
  "arrived_at": "2026-10-28T19:24:00.543418Z",
  "started_at": "2026-10-28T19:24:00.775816Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/deef4441-5a11-41aa-835c-cec9782fe1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:00Z",
    "sequence": 1793215440999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:24:01.014208Z",
  "last_location_at": "2026-10-28T19:24:01.014208Z",
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
  "device_ref": "sandbox-28936"
}
```

```json
{
  "challenge_id": "8e1a7c47-e448-4e12-9038-8a9aee931d98",
  "expires_at": "2026-10-28T19:29:01.239141624Z",
  "resend_available_at": "2026-10-28T19:24:02.239141624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "388235",
  "sent_at": "2026-10-28T19:24:01.241373551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e1a7c47-e448-4e12-9038-8a9aee931d98",
  "code": "388235",
  "device_ref": "sandbox-28936"
}
```

```json
{
  "session_id": "4d332878-2181-48e3-bc9f-de604472c001",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjM0MSwiaWF0IjoxNzkzMjE1NDQxLCJqdGkiOiJkZWVjMTNlOC1mNzc1LTQ0NGUtOWI3NC02MmZhZjE0YThmZTgiLCJzaWQiOiI0ZDMzMjg3OC0yMTgxLTQ4ZTMtYmM5Zi1kZTYwNDQ3MmMwMDEifQ.XjxtQln6tklljdZV-q8-wGe_3OvGg_KeywgAq6kVqxQ",
  "access_expires_at": "2026-10-28T19:39:01.480283334Z",
  "refresh_token": "J93c3n_jZXlPo5dLOV3wU30uicIfdG0gQCb8VE_0C5s",
  "refresh_expires_at": "2026-11-27T19:24:01.47979378Z",
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
  "command_id": "5dd3dd9f-7fe4-49f1-8280-e8d3c2fb0882",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:01Z",
    "sequence": 1793215441903
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb8bede9-e3f2-4b84-9797-24196e03c2a9",
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
  "last_heartbeat_at": "2026-10-28T19:24:01.917075Z",
  "last_location_at": "2026-10-28T19:24:01.917075Z",
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
  "session_id": "56d8c01c-e661-4b42-8e6a-fb90accee125",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzNDIsImlhdCI6MTc5MzIxNTQ0MiwianRpIjoiODcxYTNkYmEtZTEyZi00ZWY3LTg1ZjItMjFhNWQ2OWYwYmQ1Iiwic2lkIjoiNTZkOGMwMWMtZTY2MS00YjQyLThlNmEtZmI5MGFjY2VlMTI1In0.5u04nz5WfMhMWZGoYkwmCkGTe5p-p_IWEykXQFJ4uDY",
  "access_expires_at": "2026-10-28T19:39:02.416162812Z",
  "refresh_token": "mC2T0rs68nCNlA4WY4vbYvWE421ec1BdY8VrNq55Cwc",
  "refresh_expires_at": "2026-10-29T07:24:02.415687359Z",
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
  "session_id": "ef979fb6-e218-4ff6-9e9a-4b5855134279",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzNDIsImlhdCI6MTc5MzIxNTQ0MiwianRpIjoiMDRhOGJkZjUtZWMyMi00YTA5LThmZjUtMjZjZDczMDgzNGUxIiwic2lkIjoiZWY5NzlmYjYtZTIxOC00ZmY2LTllOWEtNGI1ODU1MTM0Mjc5In0.zmb1AsOHllGn1mFu8oyozcLnLMT9kZp-M0oq6Rb1YIY",
  "access_expires_at": "2026-10-28T19:39:02.892944412Z",
  "refresh_token": "SOZmjhzN-TR3vddOnMlz1ARzxjJXaT9GLRJEoW9XrEM",
  "refresh_expires_at": "2026-10-29T07:24:02.892542514Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dc9fd75b-cb9a-4020-836d-6684396999f0` → **200**

```json
{
  "id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
  "short_number": 13,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "63348fdf-f031-4b87-8d38-e0cae3fddd56",
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
    "id": "b8c8cdc3-15db-4fb0-bb43-5166b8534e46",
    "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8ba74d73-d79d-4ebf-a250-5db9d1d39c36",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T19:23:59.423717Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dc9fd75b-cb9a-4020-836d-6684396999f0/interrupt` → **200**

```json
{
  "command_id": "9b282ab0-6500-403c-9324-13b6763e3817",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
    "short_number": 13,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "63348fdf-f031-4b87-8d38-e0cae3fddd56",
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
      "id": "b8c8cdc3-15db-4fb0-bb43-5166b8534e46",
      "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "8ba74d73-d79d-4ebf-a250-5db9d1d39c36",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T19:23:59.423717Z",
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
    "id": "24e82735-6955-4002-b18c-805a18e3219b",
    "short_number": 14,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "63348fdf-f031-4b87-8d38-e0cae3fddd56",
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
    "id": "76d7f7f0-faac-40b0-ae39-db8a06cc0dd5",
    "order_id": "24e82735-6955-4002-b18c-805a18e3219b",
    "expires_at": "2026-10-28T19:24:18.370802Z",
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

`POST /api/driver/v1/offers/76d7f7f0-faac-40b0-ae39-db8a06cc0dd5/accept` → **200**

```json
{
  "command_id": "108ced7a-0a8a-47e7-ade7-ca33c0be1f03"
}
```

```json
{
  "id": "2698c4a1-deb7-4ef6-9948-79219eed4256",
  "order_id": "24e82735-6955-4002-b18c-805a18e3219b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c34adbe8-07ef-4fe6-b567-1da2d3f31a1f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c34adbe8-07ef-4fe6-b567-1da2d3f31a1f",
  "order_id": "24e82735-6955-4002-b18c-805a18e3219b",
  "assignment_id": "2698c4a1-deb7-4ef6-9948-79219eed4256",
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
  "session_id": "cb8bede9-e3f2-4b84-9797-24196e03c2a9",
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
  "last_heartbeat_at": "2026-10-28T19:24:01.917075Z",
  "last_location_at": "2026-10-28T19:24:01.917075Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/cb8bede9-e3f2-4b84-9797-24196e03c2a9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:04Z",
    "sequence": 1793215444479
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "cb8bede9-e3f2-4b84-9797-24196e03c2a9",
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
  "last_heartbeat_at": "2026-10-28T19:24:04.493886Z",
  "last_location_at": "2026-10-28T19:24:04.493886Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c34adbe8-07ef-4fe6-b567-1da2d3f31a1f/arrive` → **200**

```json
{
  "command_id": "de8b5bc7-9d5e-40a1-bdb1-25d29fc5da60",
  "expected_version": 0
}
```

```json
{
  "id": "c34adbe8-07ef-4fe6-b567-1da2d3f31a1f",
  "order_id": "24e82735-6955-4002-b18c-805a18e3219b",
  "assignment_id": "2698c4a1-deb7-4ef6-9948-79219eed4256",
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
  "arrived_at": "2026-10-28T19:24:04.71898Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c34adbe8-07ef-4fe6-b567-1da2d3f31a1f/start` → **200**

```json
{
  "command_id": "b1bbbdec-d062-4ced-8641-9534e7034bcc",
  "expected_version": 1
}
```

```json
{
  "id": "c34adbe8-07ef-4fe6-b567-1da2d3f31a1f",
  "order_id": "24e82735-6955-4002-b18c-805a18e3219b",
  "assignment_id": "2698c4a1-deb7-4ef6-9948-79219eed4256",
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
  "arrived_at": "2026-10-28T19:24:04.71898Z",
  "started_at": "2026-10-28T19:24:04.947119Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c34adbe8-07ef-4fe6-b567-1da2d3f31a1f/complete` → **200**

```json
{
  "command_id": "99409515-58cc-4792-bdbb-b3525d087f01",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:24:05Z"
}
```

```json
{
  "id": "c34adbe8-07ef-4fe6-b567-1da2d3f31a1f",
  "order_id": "24e82735-6955-4002-b18c-805a18e3219b",
  "assignment_id": "2698c4a1-deb7-4ef6-9948-79219eed4256",
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
  "arrived_at": "2026-10-28T19:24:04.71898Z",
  "started_at": "2026-10-28T19:24:04.947119Z",
  "completed_at": "2026-10-28T19:24:05.179796Z",
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
    "id": "24e82735-6955-4002-b18c-805a18e3219b",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-28T19:24:03.363717Z",
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
    "id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
    "short_number": 13,
    "status": "CANCELLED",
    "created_at": "2026-10-28T19:23:59.423717Z",
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

`GET /api/operator/v1/orders/dc9fd75b-cb9a-4020-836d-6684396999f0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T19:23:59.424203Z",
      "actor": {
        "type": "CLIENT",
        "id": "63348fdf-f031-4b87-8d38-e0cae3fddd56",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
        "quote_id": "8841ca55-86d1-4350-8e43-b91a211215fe",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "577f2f55-862d-4eec-a69a-5f0c7fe02dfc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T19:23:59.425492Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
        "attempt_id": "f80ade4d-8eaf-4b4a-b680-c582c280a004",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "577f2f55-862d-4eec-a69a-5f0c7fe02dfc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T19:23:59.427343Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9f9074ab-8c51-4bc6-8961-5f94509ee282",
        "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "577f2f55-862d-4eec-a69a-5f0c7fe02dfc"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T19:23:59.873224Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9f9074ab-8c51-4bc6-8961-5f94509ee282",
        "order_id": "dc9fd75b-cb9a-4020-836d-6684396999f0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b8c8cdc3-15db-4fb0-bb43-5166b8534e46"
      },
      "correlation_id": "065b08d3-acc0-4b73-afdd-f0863a46372d"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/24e82735-6955-4002-b18c-805a18e3219b/tip` → **200**

```json
{
  "order_id": "24e82735-6955-4002-b18c-805a18e3219b",
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
  "available_until": "2026-10-29T19:24:05.179796Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/24e82735-6955-4002-b18c-805a18e3219b/tip` → **409**

```json
{
  "command_id": "3ff730c2-3c59-431a-a8a3-e73fa3a686e5",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/24e82735-6955-4002-b18c-805a18e3219b/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "207a1088-b2b8-443d-948c-8cf81fbf09ae"
}
```

Done: interrupted dc9fd75b-cb9a-4020-836d-6684396999f0, follow-up 24e82735-6955-4002-b18c-805a18e3219b.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "deef4441-5a11-41aa-835c-cec9782fe1c7",
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
  "last_heartbeat_at": "2026-10-28T19:24:01.014208Z",
  "last_location_at": "2026-10-28T19:24:01.014208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/deef4441-5a11-41aa-835c-cec9782fe1c7/close` → **200**

```json
{
  "command_id": "b79077ed-3a4e-4997-8e97-0fd8df653692",
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
  "session_id": "cb8bede9-e3f2-4b84-9797-24196e03c2a9",
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
  "last_heartbeat_at": "2026-10-28T19:24:04.493886Z",
  "last_location_at": "2026-10-28T19:24:04.493886Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb8bede9-e3f2-4b84-9797-24196e03c2a9/close` → **200**

```json
{
  "command_id": "f5b9c7d7-978c-4ca3-a6f7-d6b5caf3446a",
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
  "session_id": "0324cd4c-80e1-4293-9385-1d0dc4af077a",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzNTAsImlhdCI6MTc5MzIxNTQ1MCwianRpIjoiYjk5NjQ5NmItZjBhNi00NmRmLThlNjItN2FmZDcyNDI1N2U3Iiwic2lkIjoiMDMyNGNkNGMtODBlMS00MjkzLTkzODUtMWQwZGM0YWYwNzdhIn0.Oqgl644em2zCHfz7kk3QeXO0Qfcj_BKeHmxprDs0CQE",
  "access_expires_at": "2026-10-28T19:39:10.684129842Z",
  "refresh_token": "M1xdJhvynVBoDb57JcJXcw6UmB3WoXW_dXG5zkeFISw",
  "refresh_expires_at": "2026-10-29T07:24:10.683715041Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f055f273-2986-41e1-96d4-abcf8682917a",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:24:10Z"
}
```

```json
{
  "id": "20062acf-ba33-47d8-918f-7f2975e62292",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:24:10Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/20062acf-ba33-47d8-918f-7f2975e62292/publish` → **200**

```json
{
  "command_id": "1fd808f1-d14e-4f3d-b3da-7438ecf6c9ca",
  "expected_version": 0
}
```

```json
{
  "id": "20062acf-ba33-47d8-918f-7f2975e62292",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:24:11.1487Z",
  "published_at": "2026-10-28T19:24:11.1487Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "20062acf-ba33-47d8-918f-7f2975e62292",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T19:24:11.1487Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631053828",
  "device_ref": "sandbox-16674"
}
```

```json
{
  "challenge_id": "930bd2da-f26a-43ee-b499-b949fd058f77",
  "expires_at": "2026-10-28T19:29:11.602050644Z",
  "resend_available_at": "2026-10-28T19:24:12.602050644Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631053828` → **200**

```json
{
  "phone": "+380631053828",
  "audience": "CLIENT",
  "code": "635468",
  "sent_at": "2026-10-28T19:24:11.604080843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "930bd2da-f26a-43ee-b499-b949fd058f77",
  "code": "635468",
  "device_ref": "sandbox-16674"
}
```

```json
{
  "session_id": "07536fa6-e43a-41fe-aa65-f9a8f6a56958",
  "subject": {
    "type": "CLIENT",
    "id": "27ead0e4-6d5a-4383-b68b-445faf90f43c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyN2VhZDBlNC02ZDVhLTQzODMtYjY4Yi00NDVmYWY5MGY0M2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzUxLCJpYXQiOjE3OTMyMTU0NTEsImp0aSI6IjQwMTUxZDQzLTE2MDgtNDUwZi04OGUzLWE5ZmYxZGE1ZDZlZSIsInNpZCI6IjA3NTM2ZmE2LWU0M2EtNDFmZS1hYTY1LWY5YThmNmE1Njk1OCJ9.Oxi0aUofIU7km4aorGd-459XHqtY2XBVIAkyTBn9Slc",
  "access_expires_at": "2026-10-28T19:39:11.834853781Z",
  "refresh_token": "VWwkWJcArB5UtO0vzX8p4OAfTH_c5qFtKXdOsC1EyrY",
  "refresh_expires_at": "2026-11-27T19:24:11.834471678Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "20062acf-ba33-47d8-918f-7f2975e62292",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T19:24:11.1487Z",
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
  "command_id": "77dfa347-7559-49a4-a43b-d76a5e807888",
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
  "id": "dbf6a02e-ddef-43b3-8295-8db78a74bc91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:12.269952Z",
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
  "command_id": "20640dc2-bd9e-436c-9af2-d21c1aa3975d",
  "quote_id": "dbf6a02e-ddef-43b3-8295-8db78a74bc91",
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
  "correlation_id": "60f458c3-cb04-481c-861c-2f6fe057f636"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "e18892be-e827-476d-bef8-b76daa219fb8",
  "version_id": "20062acf-ba33-47d8-918f-7f2975e62292",
  "language": "uk"
}
```

```json
{
  "version_id": "20062acf-ba33-47d8-918f-7f2975e62292",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T19:24:12.724008Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3266548a-a5c0-4c0c-b204-fcdc758e4d13",
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
  "id": "21deca91-3a26-4d61-9d45-8f6c12bdff5b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:12.945393Z",
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
  "command_id": "fcf326ea-680d-4421-88e4-19483c80679c",
  "quote_id": "21deca91-3a26-4d61-9d45-8f6c12bdff5b",
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
  "id": "3feee82d-0434-4e67-a118-417237ac203c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "27ead0e4-6d5a-4383-b68b-445faf90f43c",
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
  "created_at": "2026-10-28T19:24:13.170223Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3feee82d-0434-4e67-a118-417237ac203c` → **200**

```json
{
  "id": "3feee82d-0434-4e67-a118-417237ac203c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "27ead0e4-6d5a-4383-b68b-445faf90f43c",
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
  "created_at": "2026-10-28T19:24:13.170223Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3feee82d-0434-4e67-a118-417237ac203c/cancel` → **200**

```json
{
  "command_id": "bead3cac-0a1b-400d-b61e-1082b5e2dbb0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3feee82d-0434-4e67-a118-417237ac203c",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "27ead0e4-6d5a-4383-b68b-445faf90f43c",
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
  "created_at": "2026-10-28T19:24:13.170223Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/20062acf-ba33-47d8-918f-7f2975e62292` → **409**

```json
{
  "command_id": "b82e9090-555d-4bfa-b8ba-47bbdff3766b",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T19:24:13Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/20062acf-ba33-47d8-918f-7f2975e62292",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7b749b5a-b19a-4ffb-9613-4ddba7ed1991"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a8532e6b-23cf-4f62-83fa-50e0f8f6afd2",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:24:14Z"
}
```

```json
{
  "id": "7c683abc-f196-4af5-b0c7-bd4d3a4b7490",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:24:14Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7c683abc-f196-4af5-b0c7-bd4d3a4b7490/publish` → **200**

```json
{
  "command_id": "b6b21f5c-0ee0-4f38-890a-cce1d19adc4e",
  "expected_version": 0
}
```

```json
{
  "id": "7c683abc-f196-4af5-b0c7-bd4d3a4b7490",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T19:24:14.334494Z",
  "published_at": "2026-10-28T19:24:14.334494Z",
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
  "device_ref": "sandbox-500"
}
```

```json
{
  "challenge_id": "ec9be640-8f93-489e-a7b1-e96d93dc00b2",
  "expires_at": "2026-10-28T19:29:14.557303479Z",
  "resend_available_at": "2026-10-28T19:24:15.557303479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "930384",
  "sent_at": "2026-10-28T19:24:14.559084169Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec9be640-8f93-489e-a7b1-e96d93dc00b2",
  "code": "930384",
  "device_ref": "sandbox-500"
}
```

```json
{
  "session_id": "6842f457-6e45-4657-a259-a2be761f9aab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjM1NCwiaWF0IjoxNzkzMjE1NDU0LCJqdGkiOiJhZmU5ZjQzYy1iNTUzLTRjNDAtODdmMS0zZGVlYWUzYjc3ZmQiLCJzaWQiOiI2ODQyZjQ1Ny02ZTQ1LTQ2NTctYTI1OS1hMmJlNzYxZjlhYWIifQ.hVmsdd3DgGMWPZhQwTFl6ZzqAsna8qFQUSypmnnvY3Y",
  "access_expires_at": "2026-10-28T19:39:14.798895473Z",
  "refresh_token": "cZ3NzU9k2umZOM444pkuF5oCg0ILw6PSxw5yyfh8XyU",
  "refresh_expires_at": "2026-11-27T19:24:14.798475767Z",
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
  "command_id": "8b606fc2-4e19-44bd-8dd0-389f63bbfca2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:15Z",
    "sequence": 1793215455217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6368dc14-012d-4600-a703-47667c6173db",
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
  "last_heartbeat_at": "2026-10-28T19:24:15.23161Z",
  "last_location_at": "2026-10-28T19:24:15.23161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673334364",
  "device_ref": "sandbox-1649"
}
```

```json
{
  "challenge_id": "84b616ed-860d-4a25-9ff6-870ff78913f7",
  "expires_at": "2026-10-28T19:29:15.454079594Z",
  "resend_available_at": "2026-10-28T19:24:16.454079594Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673334364` → **200**

```json
{
  "phone": "+380673334364",
  "audience": "CLIENT",
  "code": "089225",
  "sent_at": "2026-10-28T19:24:15.455798583Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84b616ed-860d-4a25-9ff6-870ff78913f7",
  "code": "089225",
  "device_ref": "sandbox-1649"
}
```

```json
{
  "session_id": "7768dde8-7aa3-4e45-b745-f91a865f2500",
  "subject": {
    "type": "CLIENT",
    "id": "8fb21f0b-089b-4360-9842-a33e5438773f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmIyMWYwYi0wODliLTQzNjAtOTg0Mi1hMzNlNTQzODc3M2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzU1LCJpYXQiOjE3OTMyMTU0NTUsImp0aSI6ImExYzAwMDRkLWE4ZWQtNDgzMS04ZDU0LTkzMTE5MDk5YzJlNCIsInNpZCI6Ijc3NjhkZGU4LTdhYTMtNGU0NS1iNzQ1LWY5MWE4NjVmMjUwMCJ9.klx5QFcLjDF0E3-yt00xLttmIVQXDHHwZsP15ZJeS9M",
  "access_expires_at": "2026-10-28T19:39:15.690906513Z",
  "refresh_token": "MQV0FQylxMlY_6WqJief8w7IfDSF8Dtw7rX9egpRa90",
  "refresh_expires_at": "2026-11-27T19:24:15.690527643Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a79d27b-abbb-4615-aa60-bfaef99a6366",
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
  "id": "ae650a7c-44bd-46fe-9a2e-659bed824d95",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:15.915072Z",
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
  "command_id": "9f05aa1d-ba26-46a4-b571-9ba062dd0157",
  "quote_id": "ae650a7c-44bd-46fe-9a2e-659bed824d95",
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
    "phone": "+380672580983"
  }
}
```

```json
{
  "id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
  "created_at": "2026-10-28T19:24:16.153745Z",
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
    "id": "b7cbe7f5-cc1a-42d5-a7f1-b09fd0f01c1e",
    "order_id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
    "expires_at": "2026-10-28T19:24:31.156505Z",
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

`POST /api/driver/v1/offers/b7cbe7f5-cc1a-42d5-a7f1-b09fd0f01c1e/accept` → **200**

```json
{
  "command_id": "b4a109b2-6d58-439f-94b2-18b3dbe813af"
}
```

```json
{
  "id": "3ef5a458-916a-42a3-9b79-e01e55e3f7f0",
  "order_id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4dbfa3dd-4738-4c16-ad29-494a9cfc3ad9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4dbfa3dd-4738-4c16-ad29-494a9cfc3ad9",
  "order_id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
  "assignment_id": "3ef5a458-916a-42a3-9b79-e01e55e3f7f0",
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
    "phone": "+380672580983"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4ecc182a-22df-4151-9686-f6c634b101d0",
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
  "id": "208ee14c-6c43-4569-8ff2-2897405889cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:17.052699Z",
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
  "command_id": "f892f1f2-25ef-469b-9e54-e3f4bb6f5257",
  "quote_id": "208ee14c-6c43-4569-8ff2-2897405889cd",
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
  "id": "ce035ebd-1c30-408c-a630-7730f02152b5",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
  "created_at": "2026-10-28T19:24:17.284221Z",
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
  "command_id": "48f95956-7e56-49aa-a583-d793c023f0f6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T22:24:17Z"
}
```

```json
{
  "id": "540a23e8-9a46-4bbb-a222-09b2990ccc0a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:17.526371Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T22:24:17Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6719a8bc-5c7b-4b4e-86d7-6dce6d1bdd4c",
  "quote_id": "540a23e8-9a46-4bbb-a222-09b2990ccc0a",
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
  "pickup_at": "2026-10-28T22:24:17Z"
}
```

```json
{
  "id": "eea7a559-9b9c-4838-800f-329a0fe4440a",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
  "created_at": "2026-10-28T19:24:17.748861Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:24:17Z",
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
  "command_id": "5ac85507-57d4-4611-9357-38cab804895d",
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
  "id": "0bc3461f-9f4c-49e4-86d9-9d773cb714b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:17.993418Z",
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
  "command_id": "96b028da-4a2b-44be-8e98-7ec6b50d4fb0",
  "quote_id": "0bc3461f-9f4c-49e4-86d9-9d773cb714b7",
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
  "correlation_id": "1010b544-924d-4020-b6c0-f7290089a94a"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "eea7a559-9b9c-4838-800f-329a0fe4440a",
      "short_number": 18,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
      "created_at": "2026-10-28T19:24:17.748861Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T22:24:17Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ce035ebd-1c30-408c-a630-7730f02152b5",
      "short_number": 17,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
      "created_at": "2026-10-28T19:24:17.284221Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
      "short_number": 16,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ce035ebd-1c30-408c-a630-7730f02152b5",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
  "created_at": "2026-10-28T19:24:17.284221Z",
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

`GET /api/rider/v1/orders/b6bc7dca-d0a2-455d-9edf-305ae56e37ce` → **200**

```json
{
  "id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
    "id": "3ef5a458-916a-42a3-9b79-e01e55e3f7f0",
    "order_id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4dbfa3dd-4738-4c16-ad29-494a9cfc3ad9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T19:24:16.153745Z",
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
    "location_at": "2026-10-28T19:24:15.23161Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/b6bc7dca-d0a2-455d-9edf-305ae56e37ce/cancel` → **200**

```json
{
  "command_id": "23a957ba-fcda-4204-8f22-72120da44ffa",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
    "id": "3ef5a458-916a-42a3-9b79-e01e55e3f7f0",
    "order_id": "b6bc7dca-d0a2-455d-9edf-305ae56e37ce",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4dbfa3dd-4738-4c16-ad29-494a9cfc3ad9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T19:24:16.153745Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ce035ebd-1c30-408c-a630-7730f02152b5` → **200**

```json
{
  "id": "ce035ebd-1c30-408c-a630-7730f02152b5",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
  "created_at": "2026-10-28T19:24:17.284221Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ce035ebd-1c30-408c-a630-7730f02152b5/cancel` → **200**

```json
{
  "command_id": "3c76aaa3-e394-4e18-aad1-7abd167b64fa",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ce035ebd-1c30-408c-a630-7730f02152b5",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
  "created_at": "2026-10-28T19:24:17.284221Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/eea7a559-9b9c-4838-800f-329a0fe4440a` → **200**

```json
{
  "id": "eea7a559-9b9c-4838-800f-329a0fe4440a",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
  "created_at": "2026-10-28T19:24:17.748861Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:24:17Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/eea7a559-9b9c-4838-800f-329a0fe4440a/cancel` → **200**

```json
{
  "command_id": "ef6319a9-42dd-4076-8afb-fe97c9ae8930",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "eea7a559-9b9c-4838-800f-329a0fe4440a",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8fb21f0b-089b-4360-9842-a33e5438773f",
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
  "created_at": "2026-10-28T19:24:17.748861Z",
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
  "pickup_at": "2026-10-28T22:24:17Z",
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
  "session_id": "6368dc14-012d-4600-a703-47667c6173db",
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
  "last_heartbeat_at": "2026-10-28T19:24:15.23161Z",
  "last_location_at": "2026-10-28T19:24:15.23161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6368dc14-012d-4600-a703-47667c6173db/close` → **200**

```json
{
  "command_id": "b50870b1-2fcb-4766-9527-1a4477a1a9de",
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

Done: orders b6bc7dca-d0a2-455d-9edf-305ae56e37ce, ce035ebd-1c30-408c-a630-7730f02152b5, eea7a559-9b9c-4838-800f-329a0fe4440a.

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
  "session_id": "bd6c24c6-74fc-4315-b6c0-9f61a9293d85",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzNjAsImlhdCI6MTc5MzIxNTQ2MCwianRpIjoiNTBjMjMwMDMtMjVjZi00OWM3LWI2ZjgtMjc1ZjM4YmEwMGFiIiwic2lkIjoiYmQ2YzI0YzYtNzRmYy00MzE1LWI2YzAtOWY2MWE5MjkzZDg1In0.gIUJIjK243zN6OEKswcDdWg2AUemLc3BIu8k46KZzzI",
  "access_expires_at": "2026-10-28T19:39:20.990301486Z",
  "refresh_token": "XXlSXeaciALJvewVkaI63Qn-bUMz7KDh92y8YqQqxW4",
  "refresh_expires_at": "2026-10-29T07:24:20.98982925Z",
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
  "session_id": "bafeb0d9-d0fc-4323-a197-e68b0300cb62",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzNjEsImlhdCI6MTc5MzIxNTQ2MSwianRpIjoiZDMxYzg0ZmItNzRmOC00MTFkLTliZDgtMWQxMzI5ZTgxYzExIiwic2lkIjoiYmFmZWIwZDktZDBmYy00MzIzLWExOTctZTY4YjAzMDBjYjYyIn0.Djv6cdEwoR0rv0gCSNR_UmJzJIDDYCNNPKOM9m-inM4",
  "access_expires_at": "2026-10-28T19:39:21.475624149Z",
  "refresh_token": "-eCEOgdn-lyS6MpV8go-R_nMP5oBl1-kx4rAlAGrLk0",
  "refresh_expires_at": "2026-10-29T07:24:21.475224377Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27974"
}
```

```json
{
  "challenge_id": "e8c07938-ab9c-4966-97fa-464bb7358c2f",
  "expires_at": "2026-10-28T19:29:21.687580102Z",
  "resend_available_at": "2026-10-28T19:24:22.687580102Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "887081",
  "sent_at": "2026-10-28T19:24:21.689368843Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8c07938-ab9c-4966-97fa-464bb7358c2f",
  "code": "887081",
  "device_ref": "sandbox-27974"
}
```

```json
{
  "session_id": "83d8f7ed-a1ab-461b-bdbf-0b41aad4ca69",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjM2MSwiaWF0IjoxNzkzMjE1NDYxLCJqdGkiOiIxNTQxYmIwMy1iZjU5LTRjZDEtYmJlMy0xMDNiMDg2MjU2OTEiLCJzaWQiOiI4M2Q4ZjdlZC1hMWFiLTQ2MWItYmRiZi0wYjQxYWFkNGNhNjkifQ.RgcYwttrXDS8TsWAzwKHabN7g_uVB99gdKnaIuUTUY8",
  "access_expires_at": "2026-10-28T19:39:21.91803584Z",
  "refresh_token": "lOZwcT_QG7b9qg6GykinP1cc790zxEUAO2IoY3V1BDw",
  "refresh_expires_at": "2026-11-27T19:24:21.917640928Z",
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
  "command_id": "3c3bc788-a221-4fae-a5ef-f84a8269e7ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:22Z",
    "sequence": 1793215462346
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0190cbe3-a2df-4c78-adea-def498759153",
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
  "last_heartbeat_at": "2026-10-28T19:24:22.360172Z",
  "last_location_at": "2026-10-28T19:24:22.360172Z",
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
  "command_id": "2b505ecc-2063-466b-8b62-31b6e3224da1",
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
  "effective_at": "2026-10-28T19:24:22.816749Z",
  "changed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T19:22:17.218195Z",
  "last_entries": [
    {
      "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T19:22:17.218195Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "98d474ac-992a-4a8e-9e8b-b3d2be64b816",
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
  "id": "7a9253a7-29ec-487e-9eab-fefedfdca1b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:23.256386Z",
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
  "command_id": "ceb9cf0a-9b40-4f22-a344-6b32346c6434",
  "quote_id": "7a9253a7-29ec-487e-9eab-fefedfdca1b7",
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
    "phone": "+3806711112498"
  }
}
```

```json
{
  "id": "5e53c45e-4eff-49c3-9fcd-a609082644d8",
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
  "created_at": "2026-10-28T19:24:23.48478Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112498"
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
    "id": "e71efe74-72e5-4e45-a1d0-1ff55f7b60ee",
    "order_id": "5e53c45e-4eff-49c3-9fcd-a609082644d8",
    "expires_at": "2026-10-28T19:24:38.48794Z",
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

`POST /api/driver/v1/offers/e71efe74-72e5-4e45-a1d0-1ff55f7b60ee/accept` → **200**

```json
{
  "command_id": "7e4946f0-900a-4db5-8847-19fec1aa1179"
}
```

```json
{
  "id": "6260161f-a381-4f71-bc55-a9ff0911150f",
  "order_id": "5e53c45e-4eff-49c3-9fcd-a609082644d8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f0ac27b8-27bf-4bef-b77d-25f62aaff3f0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f0ac27b8-27bf-4bef-b77d-25f62aaff3f0",
  "order_id": "5e53c45e-4eff-49c3-9fcd-a609082644d8",
  "assignment_id": "6260161f-a381-4f71-bc55-a9ff0911150f",
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
    "phone": "+3806711112498"
  }
}
```

`POST /api/driver/v1/work-sessions/0190cbe3-a2df-4c78-adea-def498759153/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:24Z",
    "sequence": 1793215464366
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0190cbe3-a2df-4c78-adea-def498759153",
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
  "last_heartbeat_at": "2026-10-28T19:24:24.381038Z",
  "last_location_at": "2026-10-28T19:24:24.381038Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f0ac27b8-27bf-4bef-b77d-25f62aaff3f0/arrive` → **200**

```json
{
  "command_id": "222e9cc7-ec6b-4e34-83d1-24000a673644",
  "expected_version": 0
}
```

```json
{
  "id": "f0ac27b8-27bf-4bef-b77d-25f62aaff3f0",
  "order_id": "5e53c45e-4eff-49c3-9fcd-a609082644d8",
  "assignment_id": "6260161f-a381-4f71-bc55-a9ff0911150f",
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
  "arrived_at": "2026-10-28T19:24:24.605008Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112498"
  }
}
```

`POST /api/driver/v1/trips/f0ac27b8-27bf-4bef-b77d-25f62aaff3f0/start` → **200**

```json
{
  "command_id": "96f69ab6-3f99-44d2-9ceb-195307919187",
  "expected_version": 1
}
```

```json
{
  "id": "f0ac27b8-27bf-4bef-b77d-25f62aaff3f0",
  "order_id": "5e53c45e-4eff-49c3-9fcd-a609082644d8",
  "assignment_id": "6260161f-a381-4f71-bc55-a9ff0911150f",
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
  "arrived_at": "2026-10-28T19:24:24.605008Z",
  "started_at": "2026-10-28T19:24:24.827595Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711112498"
  }
}
```

`POST /api/driver/v1/trips/f0ac27b8-27bf-4bef-b77d-25f62aaff3f0/complete` → **200**

```json
{
  "command_id": "a7b99c00-13a6-4472-bcc6-b5f3f647c05e",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:24:25Z",
  "cash_received": true
}
```

```json
{
  "id": "f0ac27b8-27bf-4bef-b77d-25f62aaff3f0",
  "order_id": "5e53c45e-4eff-49c3-9fcd-a609082644d8",
  "assignment_id": "6260161f-a381-4f71-bc55-a9ff0911150f",
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
  "arrived_at": "2026-10-28T19:24:24.605008Z",
  "started_at": "2026-10-28T19:24:24.827595Z",
  "completed_at": "2026-10-28T19:24:25.063828Z",
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
  "command_id": "117f508c-0b8a-4003-8a91-ae5d10e9cdde",
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
  "id": "ff459a43-87cc-4644-9efe-36f7225b60d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:25.302266Z",
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
  "command_id": "2e7e2df0-fd2d-418b-abaa-75e0124efe9d",
  "quote_id": "ff459a43-87cc-4644-9efe-36f7225b60d1",
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
    "phone": "+3806711114422"
  }
}
```

```json
{
  "id": "814d0fc9-68da-4794-884f-ce621bd32604",
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
  "created_at": "2026-10-28T19:24:25.531314Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114422"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/814d0fc9-68da-4794-884f-ce621bd32604` → **200**

```json
{
  "id": "814d0fc9-68da-4794-884f-ce621bd32604",
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
  "created_at": "2026-10-28T19:24:25.531314Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114422"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/814d0fc9-68da-4794-884f-ce621bd32604/cancel` → **200**

```json
{
  "command_id": "2a400f78-ca07-48bb-a617-64f8e3c6882e",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "814d0fc9-68da-4794-884f-ce621bd32604",
  "short_number": 20,
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
  "created_at": "2026-10-28T19:24:25.531314Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114422"
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
  "staff_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T19:22:17.218195Z",
  "last_entries": [
    {
      "order_id": "814d0fc9-68da-4794-884f-ce621bd32604",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T19:24:26.012675Z"
    },
    {
      "order_id": "5e53c45e-4eff-49c3-9fcd-a609082644d8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T19:24:25.067757Z"
    },
    {
      "order_id": "2d2d1c85-3538-4704-bf17-7a39776cb4c8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T19:22:17.218195Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0190cbe3-a2df-4c78-adea-def498759153",
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
  "last_heartbeat_at": "2026-10-28T19:24:24.381038Z",
  "last_location_at": "2026-10-28T19:24:24.381038Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0190cbe3-a2df-4c78-adea-def498759153/close` → **200**

```json
{
  "command_id": "57664f2b-770e-4d76-b6e4-f0ce95c47e8d",
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

Done: operator bonus for fulfilled 5e53c45e-4eff-49c3-9fcd-a609082644d8 and operator-fault cancellation 814d0fc9-68da-4794-884f-ce621bd32604.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672987857",
  "device_ref": "sandbox-17138"
}
```

```json
{
  "challenge_id": "4af864cb-5c8b-4183-b9a6-17e8890debcb",
  "expires_at": "2026-10-28T19:29:28.936037274Z",
  "resend_available_at": "2026-10-28T19:24:29.936037274Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672987857` → **200**

```json
{
  "phone": "+380672987857",
  "audience": "CLIENT",
  "code": "855351",
  "sent_at": "2026-10-28T19:24:28.938155338Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671618189",
  "device_ref": "sandbox-19713",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "471a4489-1465-40b2-9b22-faf51ae0fca4",
  "expires_at": "2026-10-28T19:29:29.16935405Z",
  "resend_available_at": "2026-10-28T19:24:30.16935405Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671618189` → **200**

```json
{
  "phone": "+380671618189",
  "audience": "CLIENT",
  "code": "971409",
  "sent_at": "2026-10-28T19:24:29.171333915Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671460000",
  "device_ref": "sandbox-7343"
}
```

```json
{
  "challenge_id": "2dc01986-7fab-4aa2-985d-a4062c8471af",
  "expires_at": "2026-10-28T19:29:29.40063407Z",
  "resend_available_at": "2026-10-28T19:24:30.40063407Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671460000` → **200**

```json
{
  "phone": "+380671460000",
  "audience": "CLIENT",
  "code": "243689",
  "sent_at": "2026-10-28T19:24:29.403245709Z",
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
  "session_id": "b7429dc6-c8f9-432f-a5f2-a33406913255",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzNjksImlhdCI6MTc5MzIxNTQ2OSwianRpIjoiZDFmNzA5NDMtN2ViNi00NTZlLWEyYzgtZDY3OTVmNzJjYWQ4Iiwic2lkIjoiYjc0MjlkYzYtYzhmOS00MzJmLWE1ZjItYTMzNDA2OTEzMjU1In0.zTbfISQnFjxWvWxKvtExv7inBaiYqROb1szN_yhWGHE",
  "access_expires_at": "2026-10-28T19:39:29.898301589Z",
  "refresh_token": "2nfwuCPFyL7pHEGYeIi9F859jd9T2rsy49DZCDC_4kc",
  "refresh_expires_at": "2026-10-29T07:24:29.897712898Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671460000` → **200**

```json
{
  "deliveries": [
    {
      "id": "08ac311f-0219-4834-8a4a-9d72d93d54d8",
      "challenge_id": "2dc01986-7fab-4aa2-985d-a4062c8471af",
      "phone": "+380671460000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6cef8741-378b-495c-865b-332df355101e",
      "error": null,
      "attempted_at": "2026-10-28T19:24:29.403496Z"
    },
    {
      "id": "ce3e5b98-d402-4452-a247-ef4f704dfd2c",
      "challenge_id": "2dc01986-7fab-4aa2-985d-a4062c8471af",
      "phone": "+380671460000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T19:24:29.402457Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671460000` → **200**

```json
{
  "phone": "+380671460000",
  "audience": "CLIENT",
  "code": "243689",
  "sent_at": "2026-10-28T19:24:29.403245709Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671618189` → **200**

```json
{
  "deliveries": [
    {
      "id": "6344b17e-353e-44ad-abbe-a09ed3adc8b4",
      "challenge_id": "471a4489-1465-40b2-9b22-faf51ae0fca4",
      "phone": "+380671618189",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d1c38889-d107-4d6f-ac27-077aaa3020d1",
      "error": null,
      "attempted_at": "2026-10-28T19:24:29.171594Z"
    }
  ]
}
```

Done: SMS to +380672987857, a call to +380671618189, SMS then a call to +380671460000.

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
  "session_id": "cb1e4381-a9d7-4cbd-9830-3531120717d0",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzNzAsImlhdCI6MTc5MzIxNTQ3MCwianRpIjoiNzBjYTlhYTYtYzk2Mi00NDg1LWFlYmItMWM2NmM5NTEwMWRlIiwic2lkIjoiY2IxZTQzODEtYTlkNy00Y2JkLTk4MzAtMzUzMTEyMDcxN2QwIn0.vmEMnoeg75KR5sPaYAVQC1mq14-L_1GO_17h7QrL0Qg",
  "access_expires_at": "2026-10-28T19:39:30.916617278Z",
  "refresh_token": "hAG3ywuqn-6gZcluOA-uKgU2MJAcr_E_jVagBo5IGEs",
  "refresh_expires_at": "2026-10-29T07:24:30.91611091Z",
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
  "session_id": "4f39cb91-bcde-4222-8c63-e8ebf17447aa",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzNzEsImlhdCI6MTc5MzIxNTQ3MSwianRpIjoiYzMxNzFkMzUtODcyZi00YWZkLWIzNjMtODRhMzIxZmVkNGRhIiwic2lkIjoiNGYzOWNiOTEtYmNkZS00MjIyLThjNjMtZThlYmYxNzQ0N2FhIn0.VBiFdwRe0Pe1LcUV9Vo6Sv8gNfPd2tWAv9ZQmRWaDgw",
  "access_expires_at": "2026-10-28T19:39:31.418558919Z",
  "refresh_token": "fLUlH7G7ykeYNOD9TzhA8dFpQpdpdjZiDADoaElnfjs",
  "refresh_expires_at": "2026-10-29T07:24:31.417885757Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
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
    "flags.manage",
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

`POST /api/admin/v1/staff-extensions/da6b8b24-2ba4-47a6-b17f-6b10630c5feb` → **200**

```json
{
  "command_id": "242ea1d6-e6c3-4ced-92e3-6b184e123ee2",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "85403a99-7f88-4434-a791-249f2d588794",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T19:24:32.303763Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T19:24:32.303763Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9df43bfd-a66d-4613-9a3a-0c548c0b066c",
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
  "id": "3a360fd3-12ea-4381-8f90-f720e495013a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:32.762953Z",
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
  "command_id": "5192536c-a05a-4796-9c8e-d12a334f4315",
  "quote_id": "3a360fd3-12ea-4381-8f90-f720e495013a",
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
    "phone": "+380679880689"
  }
}
```

```json
{
  "id": "60eff7d3-25ce-4f4b-95d4-289435c8f3c0",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:24:32.998389Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679880689"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/60eff7d3-25ce-4f4b-95d4-289435c8f3c0/calls` → **201**

```json
{
  "command_id": "f4edfa66-d481-4276-ba65-6c884b02b93d",
  "to": "CALLER"
}
```

```json
{
  "id": "cdb949b6-535c-412f-8385-4699f07007fb",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "order_ids": [
    "60eff7d3-25ce-4f4b-95d4-289435c8f3c0"
  ],
  "started_at": "2026-10-28T19:24:33.247168Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/60eff7d3-25ce-4f4b-95d4-289435c8f3c0/calls` → **201**

```json
{
  "command_id": "f4edfa66-d481-4276-ba65-6c884b02b93d",
  "to": "CALLER"
}
```

```json
{
  "id": "cdb949b6-535c-412f-8385-4699f07007fb",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "order_ids": [
    "60eff7d3-25ce-4f4b-95d4-289435c8f3c0"
  ],
  "started_at": "2026-10-28T19:24:33.247168Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "cdb949b6-535c-412f-8385-4699f07007fb",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679880689",
    "at": "2026-10-28T19:24:33.249367799Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "cdb949b6-535c-412f-8385-4699f07007fb",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.7383",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "cdb949b6-535c-412f-8385-4699f07007fb"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "cdb949b6-535c-412f-8385-4699f07007fb",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=60eff7d3-25ce-4f4b-95d4-289435c8f3c0` → **200**

```json
{
  "calls": [
    {
      "id": "cdb949b6-535c-412f-8385-4699f07007fb",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [
        "60eff7d3-25ce-4f4b-95d4-289435c8f3c0"
      ],
      "started_at": "2026-10-28T19:24:33.247168Z",
      "answered_at": "2026-10-28T19:24:33.741232Z",
      "ended_at": "2026-10-28T19:24:33.755356Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=60eff7d3-25ce-4f4b-95d4-289435c8f3c0` → **200**

```json
{
  "calls": [
    {
      "id": "cdb949b6-535c-412f-8385-4699f07007fb",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [
        "60eff7d3-25ce-4f4b-95d4-289435c8f3c0"
      ],
      "started_at": "2026-10-28T19:24:33.247168Z",
      "answered_at": "2026-10-28T19:24:33.741232Z",
      "ended_at": "2026-10-28T19:24:33.755356Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=60eff7d3-25ce-4f4b-95d4-289435c8f3c0` → **200**

```json
{
  "calls": [
    {
      "id": "cdb949b6-535c-412f-8385-4699f07007fb",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "order_ids": [
        "60eff7d3-25ce-4f4b-95d4-289435c8f3c0"
      ],
      "started_at": "2026-10-28T19:24:33.247168Z",
      "answered_at": "2026-10-28T19:24:33.741232Z",
      "ended_at": "2026-10-28T19:24:33.755356Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T19:24:37.156773Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/60eff7d3-25ce-4f4b-95d4-289435c8f3c0` → **200**

```json
{
  "id": "60eff7d3-25ce-4f4b-95d4-289435c8f3c0",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:24:32.998389Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679880689"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/60eff7d3-25ce-4f4b-95d4-289435c8f3c0/cancel` → **200**

```json
{
  "command_id": "c161dd93-8a65-496e-b31b-676f6f6cd3af",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "60eff7d3-25ce-4f4b-95d4-289435c8f3c0",
  "short_number": 21,
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
  "created_at": "2026-10-28T19:24:32.998389Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679880689"
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
  "command_id": "80971caa-5669-4265-a82f-adef0ee8af3a",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T19:24:38.940884Z",
  "extension": "101"
}
```

Done: outgoing call cdb949b6-535c-412f-8385-4699f07007fb from order 60eff7d3-25ce-4f4b-95d4-289435c8f3c0, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635464656",
  "device_ref": "sandbox-31607"
}
```

```json
{
  "challenge_id": "432521d0-15bd-483d-baf9-a92cc9e8d24d",
  "expires_at": "2026-10-28T19:29:39.169154713Z",
  "resend_available_at": "2026-10-28T19:24:40.169154713Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635464656` → **200**

```json
{
  "phone": "+380635464656",
  "audience": "CLIENT",
  "code": "331378",
  "sent_at": "2026-10-28T19:24:39.171374791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "432521d0-15bd-483d-baf9-a92cc9e8d24d",
  "code": "331378",
  "device_ref": "sandbox-31607"
}
```

```json
{
  "session_id": "f6b6d0d2-4205-4993-902f-b416c07b1016",
  "subject": {
    "type": "CLIENT",
    "id": "175b9aed-6375-4105-8d0c-844cc59fd6cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzViOWFlZC02Mzc1LTQxMDUtOGQwYy04NDRjYzU5ZmQ2Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2Mzc5LCJpYXQiOjE3OTMyMTU0NzksImp0aSI6IjA2ZGE4MzVlLWZhNjUtNDUzYy1iYjA1LTg2YTM5N2QxZGNmYSIsInNpZCI6ImY2YjZkMGQyLTQyMDUtNDk5My05MDJmLWI0MTZjMDdiMTAxNiJ9.EL0niOWr2v-_G0O4NqtplHugaz7OsMBwP_U8gDC5IjU",
  "access_expires_at": "2026-10-28T19:39:39.402430885Z",
  "refresh_token": "XwGwQmsZm4jfM2gwfan9OLK3-5Q53LiCszLH55jUU5U",
  "refresh_expires_at": "2026-11-27T19:24:39.402022373Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "175b9aed-6375-4105-8d0c-844cc59fd6cb",
  "session_id": "f6b6d0d2-4205-4993-902f-b416c07b1016",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635464656",
  "device_ref": "sandbox-27245"
}
```

```json
{
  "challenge_id": "57598ead-8d7f-4130-be80-9d575abcf025",
  "expires_at": "2026-10-28T19:29:41.826198356Z",
  "resend_available_at": "2026-10-28T19:24:42.826198356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635464656` → **200**

```json
{
  "phone": "+380635464656",
  "audience": "CLIENT",
  "code": "512461",
  "sent_at": "2026-10-28T19:24:41.828246663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57598ead-8d7f-4130-be80-9d575abcf025",
  "code": "512461",
  "device_ref": "sandbox-27245"
}
```

```json
{
  "session_id": "1ec662e6-07ff-4b47-9ac8-1bf38d5177ca",
  "subject": {
    "type": "CLIENT",
    "id": "175b9aed-6375-4105-8d0c-844cc59fd6cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzViOWFlZC02Mzc1LTQxMDUtOGQwYy04NDRjYzU5ZmQ2Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzgyLCJpYXQiOjE3OTMyMTU0ODIsImp0aSI6ImY1ZTlkNGI2LTAzM2YtNDdkZC1hZGQwLTc3NTlkMjdhMTgxZCIsInNpZCI6IjFlYzY2MmU2LTA3ZmYtNGI0Ny05YWM4LTFiZjM4ZDUxNzdjYSJ9.Pe88lNRY6Qevdt7XtgTsjRSgndvkhVhDtjMYIhOPuFY",
  "access_expires_at": "2026-10-28T19:39:42.085342559Z",
  "refresh_token": "bZCfCPOgEEPxSMqBc5nzlzbG3RwKQ4UJXEiAFb6zYE4",
  "refresh_expires_at": "2026-11-27T19:24:42.084513061Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "68690f0f-6a06-45ab-8716-8a752b2917d0",
  "expires_at": "2026-10-28T19:29:44.306397813Z",
  "resend_available_at": "2026-10-28T19:24:45.306397813Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635464656` → **200**

```json
{
  "phone": "+380635464656",
  "audience": "CLIENT",
  "code": "148175",
  "sent_at": "2026-10-28T19:24:44.308441751Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380635725470"
}
```

```json
{
  "challenge_id": "2279fc46-5e63-4222-93eb-3dd5613172fa",
  "expires_at": "2026-10-28T19:29:44.543902437Z",
  "resend_available_at": "2026-10-28T19:24:45.543902437Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635725470` → **200**

```json
{
  "phone": "+380635725470",
  "audience": "CLIENT",
  "code": "295387",
  "sent_at": "2026-10-28T19:24:44.54541967Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "a4babe27-f3c1-4a9c-a258-8a78601777af",
  "current_challenge_id": "68690f0f-6a06-45ab-8716-8a752b2917d0",
  "current_code": "000000",
  "new_challenge_id": "2279fc46-5e63-4222-93eb-3dd5613172fa",
  "new_code": "295387"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "8e86623a-6af1-4255-a9dd-d632ac7cd32c"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "eb68b583-3870-4117-9346-d715ff02b3c2",
  "current_challenge_id": "68690f0f-6a06-45ab-8716-8a752b2917d0",
  "current_code": "148175",
  "new_challenge_id": "2279fc46-5e63-4222-93eb-3dd5613172fa",
  "new_code": "295387"
}
```

```json
{
  "subject_id": "175b9aed-6375-4105-8d0c-844cc59fd6cb",
  "phone": "+380635725470",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "175b9aed-6375-4105-8d0c-844cc59fd6cb",
  "session_id": "f6b6d0d2-4205-4993-902f-b416c07b1016",
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
  "correlation_id": "56e09537-2dff-4b23-a3b8-62c47ff34a14"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635725470",
  "device_ref": "sandbox-25273"
}
```

```json
{
  "challenge_id": "7dba52d1-524c-4a2f-8b96-829807147f04",
  "expires_at": "2026-10-28T19:29:47.674576339Z",
  "resend_available_at": "2026-10-28T19:24:48.674576339Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635725470` → **200**

```json
{
  "phone": "+380635725470",
  "audience": "CLIENT",
  "code": "703753",
  "sent_at": "2026-10-28T19:24:47.676503791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7dba52d1-524c-4a2f-8b96-829807147f04",
  "code": "703753",
  "device_ref": "sandbox-25273"
}
```

```json
{
  "session_id": "73969d3e-8042-4a46-8086-749cd1e69a1a",
  "subject": {
    "type": "CLIENT",
    "id": "175b9aed-6375-4105-8d0c-844cc59fd6cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzViOWFlZC02Mzc1LTQxMDUtOGQwYy04NDRjYzU5ZmQ2Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2Mzg3LCJpYXQiOjE3OTMyMTU0ODcsImp0aSI6ImUyNDFkNTMwLTg4MmQtNDhlYi04ZGRmLWU4MmM0Njg4MTM5MyIsInNpZCI6IjczOTY5ZDNlLTgwNDItNGE0Ni04MDg2LTc0OWNkMWU2OWExYSJ9.Wmjo7vWLn00FEWInLk-zlf9DyL8T6PSbxMvn5RX1HnE",
  "access_expires_at": "2026-10-28T19:39:47.911695706Z",
  "refresh_token": "ZmHwRIKJmGoYZBVLmxkO9k8Z2cSb4cFK8LjbsTu2Htg",
  "refresh_expires_at": "2026-11-27T19:24:47.911109274Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "175b9aed-6375-4105-8d0c-844cc59fd6cb",
  "session_id": "73969d3e-8042-4a46-8086-749cd1e69a1a",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support checks who it is and sends a code to the new phone

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
  "session_id": "2ad3502b-ce37-4f50-8653-ba54a34f9bf4",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzODgsImlhdCI6MTc5MzIxNTQ4OCwianRpIjoiNDAyMTUyNmUtNTA4Mi00MDlmLWFlNDItNGUxYTI2Mzg2NDNjIiwic2lkIjoiMmFkMzUwMmItY2UzNy00ZjUwLTg2NTMtYmE1NGEzNGY5YmY0In0.fXvCYlZUevJF5tmOipYPtC8ull8N6RFt1TYK37Amews",
  "access_expires_at": "2026-10-28T19:39:48.616700451Z",
  "refresh_token": "yY9upW0KU3SH5DeWMSmPzzfJyEysNPm-g5bRx0ylxNg",
  "refresh_expires_at": "2026-10-29T07:24:48.616105657Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/175b9aed-6375-4105-8d0c-844cc59fd6cb` → **200**

```json
{
  "client": {
    "id": "175b9aed-6375-4105-8d0c-844cc59fd6cb",
    "phone": "+380635725470",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T19:24:39.40047Z",
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

`POST /api/admin/v1/clients/175b9aed-6375-4105-8d0c-844cc59fd6cb/phone/new-code` → **201**

```json
{
  "phone": "+380633531429"
}
```

```json
{
  "challenge_id": "58c90fe2-4394-4c60-a61c-e32765983742",
  "expires_at": "2026-10-28T19:29:49.08653539Z",
  "resend_available_at": "2026-10-28T19:24:50.08653539Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633531429` → **200**

```json
{
  "phone": "+380633531429",
  "audience": "CLIENT",
  "code": "094913",
  "sent_at": "2026-10-28T19:24:49.088107124Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/175b9aed-6375-4105-8d0c-844cc59fd6cb/phone` → **422**

```json
{
  "command_id": "10940392-584e-43fa-942c-6f7c4802b837",
  "expected_version": 3,
  "new_challenge_id": "58c90fe2-4394-4c60-a61c-e32765983742",
  "new_code": "094914",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/175b9aed-6375-4105-8d0c-844cc59fd6cb/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b950d188-d475-4335-bdee-a00af0000beb"
}
```

`POST /api/admin/v1/clients/175b9aed-6375-4105-8d0c-844cc59fd6cb/phone` → **400**

```json
{
  "command_id": "bea896e6-e8df-4690-bf9a-a3ec9723a58e",
  "expected_version": 3,
  "new_challenge_id": "58c90fe2-4394-4c60-a61c-e32765983742",
  "new_code": "094913",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/175b9aed-6375-4105-8d0c-844cc59fd6cb/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bcf66126-1712-4707-9b8b-fd62acf8326f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/175b9aed-6375-4105-8d0c-844cc59fd6cb/phone` → **200**

```json
{
  "command_id": "497485bb-4cf8-443c-9a6f-8bb0f1552cfe",
  "expected_version": 3,
  "new_challenge_id": "58c90fe2-4394-4c60-a61c-e32765983742",
  "new_code": "094913",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "175b9aed-6375-4105-8d0c-844cc59fd6cb",
  "phone": "+380633531429",
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
  "correlation_id": "0a92e82c-41ac-47cb-b73c-8846a274b497"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633531429",
  "device_ref": "sandbox-6080"
}
```

```json
{
  "challenge_id": "e86f3c85-47b2-4e0d-8506-53948bb98ab9",
  "expires_at": "2026-10-28T19:29:50.22504717Z",
  "resend_available_at": "2026-10-28T19:24:51.22504717Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633531429` → **200**

```json
{
  "phone": "+380633531429",
  "audience": "CLIENT",
  "code": "730496",
  "sent_at": "2026-10-28T19:24:50.227093982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e86f3c85-47b2-4e0d-8506-53948bb98ab9",
  "code": "730496",
  "device_ref": "sandbox-6080"
}
```

```json
{
  "session_id": "1543dc04-45ae-4d05-9433-49ef7673f515",
  "subject": {
    "type": "CLIENT",
    "id": "175b9aed-6375-4105-8d0c-844cc59fd6cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzViOWFlZC02Mzc1LTQxMDUtOGQwYy04NDRjYzU5ZmQ2Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzkwLCJpYXQiOjE3OTMyMTU0OTAsImp0aSI6ImQxYWQ4YmYyLWYzMzEtNDc2NC1iMmQwLWVjNDg0YTY5NWM5ZSIsInNpZCI6IjE1NDNkYzA0LTQ1YWUtNGQwNS05NDMzLTQ5ZWY3NjczZjUxNSJ9.u6KfBv5xAFujnFxew9xGWUu1bFa47K_6tZEORtR5hlA",
  "access_expires_at": "2026-10-28T19:39:50.464347943Z",
  "refresh_token": "Gv-6a7Y6aLbntaRQWWuIFrKM1lbBCGkcTaV-NhNxJuw",
  "refresh_expires_at": "2026-11-27T19:24:50.463939784Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "175b9aed-6375-4105-8d0c-844cc59fd6cb",
  "session_id": "1543dc04-45ae-4d05-9433-49ef7673f515",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a code to the new phone and a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631778465",
  "device_ref": "sandbox-11873"
}
```

```json
{
  "challenge_id": "78e26f61-6e3d-4242-8063-c8869fb18167",
  "expires_at": "2026-10-28T19:29:50.900589055Z",
  "resend_available_at": "2026-10-28T19:24:51.900589055Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631778465` → **200**

```json
{
  "phone": "+380631778465",
  "audience": "CLIENT",
  "code": "305939",
  "sent_at": "2026-10-28T19:24:50.902615944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78e26f61-6e3d-4242-8063-c8869fb18167",
  "code": "305939",
  "device_ref": "sandbox-11873"
}
```

```json
{
  "session_id": "97befcb4-cd42-4600-932f-2211d2f226a0",
  "subject": {
    "type": "CLIENT",
    "id": "bee1c8aa-fb1a-4c62-929f-baae677e225e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZWUxYzhhYS1mYjFhLTRjNjItOTI5Zi1iYWFlNjc3ZTIyNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzkxLCJpYXQiOjE3OTMyMTU0OTEsImp0aSI6IjUxM2ZiYWY5LTM5ZGYtNGZiZi04YTg1LWE5YWM5OWI0YjY4YyIsInNpZCI6Ijk3YmVmY2I0LWNkNDItNDYwMC05MzJmLTIyMTFkMmYyMjZhMCJ9.jTdDM7uf6Gpyols5TuEWMTnMtmAaEHIstef5hlYoCow",
  "access_expires_at": "2026-10-28T19:39:51.142335735Z",
  "refresh_token": "1HohqY63Nqacym52VT38j2TKhExS8eyB2gIBFMTG4cY",
  "refresh_expires_at": "2026-11-27T19:24:51.141822068Z",
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
  "session_id": "7aabcca6-79ed-4893-bef0-d84f7a178d04",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzOTIsImlhdCI6MTc5MzIxNTQ5MiwianRpIjoiMGRmYjg3M2MtMTdhMS00YTc2LWEzMDAtMzI4Nzc3MDM4MzJlIiwic2lkIjoiN2FhYmNjYTYtNzllZC00ODkzLWJlZjAtZDg0ZjdhMTc4ZDA0In0.SVR461a3Vu5JY5Q8MzQiJ7NrV1lrpp4aZD27RSRvRSE",
  "access_expires_at": "2026-10-28T19:39:52.089406982Z",
  "refresh_token": "0VxVrzWT92AuvtCLXIMgZCxyCb0DoGYdMvYzknxkh_U",
  "refresh_expires_at": "2026-10-29T07:24:52.088920879Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631778465` → **200**

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
  "correlation_id": "708c23f4-48e6-4836-814c-469a784e2eb6"
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
  "session_id": "5ed1c6c2-a53f-48e0-9e79-f1fcd16ca59f",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzOTMsImlhdCI6MTc5MzIxNTQ5MywianRpIjoiZTE4MDA5ZWItZGIyZS00NWZjLTg1NzEtNmZiNzg2Y2EzZTNiIiwic2lkIjoiNWVkMWM2YzItYTUzZi00OGUwLTllNzktZjFmY2QxNmNhNTlmIn0.w3y4SHUxCD4Nw9wP270eD53SlwKzmG90xtACXQUqAfU",
  "access_expires_at": "2026-10-28T19:39:53.032408063Z",
  "refresh_token": "fMDsFsMgAvgBfUczpo4q0bAt2JY32Xlu4yt5blpfqMo",
  "refresh_expires_at": "2026-10-29T07:24:53.031985196Z",
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
  "command_id": "22aa0af3-d1f7-4e33-b11a-e93542b72db8",
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    }
  },
  "changed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T19:24:53.494119644Z"
}
```

## The rider books the airport for 2026-10-28T22:24:52Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600689213",
  "device_ref": "sandbox-20959"
}
```

```json
{
  "challenge_id": "cfb0debc-a0bf-44b2-9381-0829687ca0d9",
  "expires_at": "2026-10-28T19:29:53.724240594Z",
  "resend_available_at": "2026-10-28T19:24:54.724240594Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600689213` → **200**

```json
{
  "phone": "+48600689213",
  "audience": "CLIENT",
  "code": "158164",
  "sent_at": "2026-10-28T19:24:53.726056885Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfb0debc-a0bf-44b2-9381-0829687ca0d9",
  "code": "158164",
  "device_ref": "sandbox-20959"
}
```

```json
{
  "session_id": "d0d7304d-d9ba-4730-aec7-e3c8e7f61f9f",
  "subject": {
    "type": "CLIENT",
    "id": "4f6ea84b-d2ae-41e2-822d-38bb07849a11"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjZlYTg0Yi1kMmFlLTQxZTItODIyZC0zOGJiMDc4NDlhMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2MzkzLCJpYXQiOjE3OTMyMTU0OTMsImp0aSI6ImEyOGU0ODc5LWFlODMtNDkxOS04YjZlLWUyMzlhYTcwM2Y0ZCIsInNpZCI6ImQwZDczMDRkLWQ5YmEtNDczMC1hZWM3LWUzYzhlN2Y2MWY5ZiJ9.AJiQQNyx2DPdC-5KoljAIJsmq0ZgWY47NP1zCumZwSQ",
  "access_expires_at": "2026-10-28T19:39:53.968786429Z",
  "refresh_token": "fJ9IVHLMJvserd_qcLEu_AmRRt6my-UOq2inIT62_DY",
  "refresh_expires_at": "2026-11-27T19:24:53.968255043Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efa7b677-90b7-4b3b-a5d7-5f58de7f8d1f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T22:24:52Z"
}
```

```json
{
  "id": "1a976907-8aa5-4ee6-8575-50abb8428a42",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:54.191386Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T22:24:52Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5cc47acd-2f2a-4595-aac7-68c576ee5e67",
  "quote_id": "1a976907-8aa5-4ee6-8575-50abb8428a42",
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
  "pickup_at": "2026-10-28T22:24:52Z"
}
```

```json
{
  "id": "09440081-e938-4272-862c-1dcff49bbbaa",
  "short_number": 22,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4f6ea84b-d2ae-41e2-822d-38bb07849a11",
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
  "created_at": "2026-10-28T19:24:54.425542Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T22:24:52Z",
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
  "device_ref": "sandbox-20472"
}
```

```json
{
  "challenge_id": "9201bd9e-12c7-498d-9af0-4865e75a7e07",
  "expires_at": "2026-10-28T19:29:54.662327676Z",
  "resend_available_at": "2026-10-28T19:24:55.662327676Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "942210",
  "sent_at": "2026-10-28T19:24:54.664542203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9201bd9e-12c7-498d-9af0-4865e75a7e07",
  "code": "942210",
  "device_ref": "sandbox-20472"
}
```

```json
{
  "session_id": "09bb2116-cafd-4f19-9ae2-b5061486d9c7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjM5NCwiaWF0IjoxNzkzMjE1NDk0LCJqdGkiOiI2MzE3M2FiOC01OGRlLTQyNzgtOTlmOS1mNjU4NmQ5ZjMzOTciLCJzaWQiOiIwOWJiMjExNi1jYWZkLTRmMTktOWFlMi1iNTA2MTQ4NmQ5YzcifQ.yOkB959PlTxLqre00YzPp-ovq3JSNXkDPFAiLpPfLtA",
  "access_expires_at": "2026-10-28T19:39:54.895216059Z",
  "refresh_token": "OVpDOTYipShEAlfdy33YDQKhlT_i3RnS3C2tpxmMY5g",
  "refresh_expires_at": "2026-11-27T19:24:54.894806845Z",
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
  "command_id": "603f31be-45bb-429f-b786-ba77475fdda3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:55Z",
    "sequence": 1793215495330
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "080b2a07-be41-4af4-b0b7-8b3d1be65a05",
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
  "last_heartbeat_at": "2026-10-28T19:24:55.344885Z",
  "last_location_at": "2026-10-28T19:24:55.344885Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "09440081-e938-4272-862c-1dcff49bbbaa",
      "short_number": 22,
      "pickup_at": "2026-10-28T22:24:52Z",
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

`POST /api/driver/v1/preorders/09440081-e938-4272-862c-1dcff49bbbaa/reserve` → **200**

```json
{
  "command_id": "47b99b64-58d4-4726-8c87-9bdc3fe0aeb5"
}
```

```json
{
  "id": "7da0f6b0-a21c-4c9b-a3d5-ec7490dc370a",
  "state": "RESERVED",
  "order": {
    "order_id": "09440081-e938-4272-862c-1dcff49bbbaa",
    "short_number": 22,
    "pickup_at": "2026-10-28T22:24:52Z",
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
  "reserved_at": "2026-10-28T19:24:55.785772Z",
  "confirm_from": "2026-10-28T21:54:52Z",
  "confirm_until": "2026-10-28T22:04:52Z",
  "drop_until": "2026-10-28T21:24:52Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "7da0f6b0-a21c-4c9b-a3d5-ec7490dc370a",
      "state": "RESERVED",
      "order": {
        "order_id": "09440081-e938-4272-862c-1dcff49bbbaa",
        "short_number": 22,
        "pickup_at": "2026-10-28T22:24:52Z",
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
      "reserved_at": "2026-10-28T19:24:55.785772Z",
      "confirm_from": "2026-10-28T21:54:52Z",
      "confirm_until": "2026-10-28T22:04:52Z",
      "drop_until": "2026-10-28T21:24:52Z"
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
      "id": "7da0f6b0-a21c-4c9b-a3d5-ec7490dc370a",
      "state": "RESERVED",
      "order": {
        "order_id": "09440081-e938-4272-862c-1dcff49bbbaa",
        "short_number": 22,
        "pickup_at": "2026-10-28T22:24:52Z",
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
      "reserved_at": "2026-10-28T19:24:55.785772Z",
      "confirm_from": "2026-10-28T21:54:52Z",
      "confirm_until": "2026-10-28T22:04:52Z",
      "drop_until": "2026-10-28T21:24:52Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/7da0f6b0-a21c-4c9b-a3d5-ec7490dc370a/confirm` → **409**

```json
{
  "command_id": "184f795f-8daa-454c-bfdd-d322b5b5d85d"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/7da0f6b0-a21c-4c9b-a3d5-ec7490dc370a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a322c937-a010-494e-8cc5-21a8629fc3dc"
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
  "session_id": "8b87945a-bd15-49f7-bf28-dcf503554f9f",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTYzOTYsImlhdCI6MTc5MzIxNTQ5NiwianRpIjoiYmRiNzhiNzQtYzNkZS00Yjk5LTllYzEtNjcwMTE4NjgzZTViIiwic2lkIjoiOGI4Nzk0NWEtYmQxNS00OWY3LWJmMjgtZGNmNTAzNTU0ZjlmIn0.OCyrT7BWQ3aQTLmPHDfFerRy0hYey6ZfvFnpUyMavK8",
  "access_expires_at": "2026-10-28T19:39:56.934392798Z",
  "refresh_token": "VfaPrGvYKWscY9Njqkt-IjbgSZR5L1gNcJcm--APpfM",
  "refresh_expires_at": "2026-10-29T07:24:56.93393899Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/09440081-e938-4272-862c-1dcff49bbbaa` → **200**

```json
{
  "id": "09440081-e938-4272-862c-1dcff49bbbaa",
  "short_number": 22,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "4f6ea84b-d2ae-41e2-822d-38bb07849a11",
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
  "created_at": "2026-10-28T19:24:54.425542Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T22:24:52Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "7da0f6b0-a21c-4c9b-a3d5-ec7490dc370a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T19:24:55.785772Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/09440081-e938-4272-862c-1dcff49bbbaa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T19:24:54.426534Z",
      "actor": {
        "type": "CLIENT",
        "id": "4f6ea84b-d2ae-41e2-822d-38bb07849a11",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "09440081-e938-4272-862c-1dcff49bbbaa",
        "preorder": true,
        "quote_id": "1a976907-8aa5-4ee6-8575-50abb8428a42",
        "pickup_at": "2026-10-28T22:24:52Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "24be40b2-1160-477c-bcfe-117b4164cfd4"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T19:24:55.786771Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "09440081-e938-4272-862c-1dcff49bbbaa",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "7da0f6b0-a21c-4c9b-a3d5-ec7490dc370a"
      },
      "correlation_id": "4eea3b6b-0d0f-4022-80cf-c8fb269fe1c2"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 09440081-e938-4272-862c-1dcff49bbbaa, reservation 7da0f6b0-a21c-4c9b-a3d5-ec7490dc370a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22058"
}
```

```json
{
  "challenge_id": "4324fe25-ab2b-461d-923c-1ae77e786a1a",
  "expires_at": "2026-10-28T19:29:57.620320377Z",
  "resend_available_at": "2026-10-28T19:24:58.620320377Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "446511",
  "sent_at": "2026-10-28T19:24:57.622567198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4324fe25-ab2b-461d-923c-1ae77e786a1a",
  "code": "446511",
  "device_ref": "sandbox-22058"
}
```

```json
{
  "session_id": "740a5ce2-6ca5-4497-af15-95abc47c23fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjM5NywiaWF0IjoxNzkzMjE1NDk3LCJqdGkiOiJiZTRhZWJjYy1iOGVkLTRhMjEtYmUzMi04NTI5NWE2MzRiZWEiLCJzaWQiOiI3NDBhNWNlMi02Y2E1LTQ0OTctYWYxNS05NWFiYzQ3YzIzZmMifQ.L5aUsS69z2Ig34EXVAxCQeN3KbHboo3WXyNvGBCZN2w",
  "access_expires_at": "2026-10-28T19:39:57.853932118Z",
  "refresh_token": "6hjMdQDI-nR-nsd2lO6Z-tO2lPnEUzE3uJqieyc3h18",
  "refresh_expires_at": "2026-11-27T19:24:57.853536059Z",
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
  "command_id": "3255ac80-5d0d-4c30-b3f9-6b364f50d24d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:24:58Z",
    "sequence": 1793215498289
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "41cfa953-4683-4a9f-b516-d32180d56dae",
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
  "last_heartbeat_at": "2026-10-28T19:24:58.304354Z",
  "last_location_at": "2026-10-28T19:24:58.304354Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675202979",
  "device_ref": "sandbox-11285"
}
```

```json
{
  "challenge_id": "e615424b-5d96-49b8-8cb3-a592e855e01e",
  "expires_at": "2026-10-28T19:29:58.519194631Z",
  "resend_available_at": "2026-10-28T19:24:59.519194631Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675202979` → **200**

```json
{
  "phone": "+380675202979",
  "audience": "CLIENT",
  "code": "572501",
  "sent_at": "2026-10-28T19:24:58.521179527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e615424b-5d96-49b8-8cb3-a592e855e01e",
  "code": "572501",
  "device_ref": "sandbox-11285"
}
```

```json
{
  "session_id": "ecdcd5fd-31cf-4f40-9fc0-e0a2209b41f2",
  "subject": {
    "type": "CLIENT",
    "id": "e70fb01e-b45c-4925-867a-4d158bae50ce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzBmYjAxZS1iNDVjLTQ5MjUtODY3YS00ZDE1OGJhZTUwY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2Mzk4LCJpYXQiOjE3OTMyMTU0OTgsImp0aSI6Ijc0YWFhZmZjLTk3ODAtNGZiMC04ZDc4LThmODQ2N2ExY2JkOCIsInNpZCI6ImVjZGNkNWZkLTMxY2YtNGY0MC05ZmMwLWUwYTIyMDliNDFmMiJ9.3bFj158jIIH10K1yt5WwZbMu5BvX6BjhZV_M77n1bws",
  "access_expires_at": "2026-10-28T19:39:58.764137265Z",
  "refresh_token": "5qowkTg40emjMW6r8cqEn5eeNJQUSWFV03gr2Qul3qA",
  "refresh_expires_at": "2026-11-27T19:24:58.763719699Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab6699fa-e150-4bb0-967f-2da3d7fc9c15",
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
  "id": "3d0e396d-e9f8-40d4-aa2d-c379eb8e7b87",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:29:58.989061Z",
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
  "command_id": "e127b49f-19aa-4eff-b7ac-54cb783b632b",
  "quote_id": "3d0e396d-e9f8-40d4-aa2d-c379eb8e7b87",
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
  "id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e70fb01e-b45c-4925-867a-4d158bae50ce",
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
  "created_at": "2026-10-28T19:24:59.218604Z",
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
    "id": "e42b0af3-1a2f-4e02-860c-055b3410e6b6",
    "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
    "expires_at": "2026-10-28T19:25:14.221403Z",
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

`POST /api/driver/v1/offers/e42b0af3-1a2f-4e02-860c-055b3410e6b6/accept` → **200**

```json
{
  "command_id": "18cdc04c-705f-4270-bd12-5071d1b59ac6"
}
```

```json
{
  "id": "a94edb8e-7648-4899-8c14-d88ed32479a4",
  "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5c75c57c-9dd8-430c-8a54-483d597f4261",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5c75c57c-9dd8-430c-8a54-483d597f4261",
  "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "assignment_id": "a94edb8e-7648-4899-8c14-d88ed32479a4",
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

`POST /api/driver/v1/work-sessions/41cfa953-4683-4a9f-b516-d32180d56dae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:25:00Z",
    "sequence": 1793215500120
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "41cfa953-4683-4a9f-b516-d32180d56dae",
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
  "last_heartbeat_at": "2026-10-28T19:25:00.13655Z",
  "last_location_at": "2026-10-28T19:25:00.13655Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5c75c57c-9dd8-430c-8a54-483d597f4261",
  "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "assignment_id": "a94edb8e-7648-4899-8c14-d88ed32479a4",
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

`POST /api/driver/v1/trips/5c75c57c-9dd8-430c-8a54-483d597f4261/arrive` → **200**

```json
{
  "command_id": "5d560118-d665-4dee-9bcb-c6f67f44df7e",
  "expected_version": 0
}
```

```json
{
  "id": "5c75c57c-9dd8-430c-8a54-483d597f4261",
  "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "assignment_id": "a94edb8e-7648-4899-8c14-d88ed32479a4",
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
  "arrived_at": "2026-10-28T19:25:00.609273Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5c75c57c-9dd8-430c-8a54-483d597f4261/start` → **200**

```json
{
  "command_id": "3028ca7a-ffb0-4542-9273-7e9de0581db7",
  "expected_version": 1
}
```

```json
{
  "id": "5c75c57c-9dd8-430c-8a54-483d597f4261",
  "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "assignment_id": "a94edb8e-7648-4899-8c14-d88ed32479a4",
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
  "arrived_at": "2026-10-28T19:25:00.609273Z",
  "started_at": "2026-10-28T19:25:00.833329Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/41cfa953-4683-4a9f-b516-d32180d56dae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:25:01Z",
    "sequence": 1793215501502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "41cfa953-4683-4a9f-b516-d32180d56dae",
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
  "last_heartbeat_at": "2026-10-28T19:25:01.06516Z",
  "last_location_at": "2026-10-28T19:25:01.06516Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/5c75c57c-9dd8-430c-8a54-483d597f4261/complete` → **200**

```json
{
  "command_id": "502dd0d2-4b27-43ba-9525-b31b91fe34d7",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:25:01Z",
  "cash_received": true
}
```

```json
{
  "id": "5c75c57c-9dd8-430c-8a54-483d597f4261",
  "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "assignment_id": "a94edb8e-7648-4899-8c14-d88ed32479a4",
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
  "arrived_at": "2026-10-28T19:25:00.609273Z",
  "started_at": "2026-10-28T19:25:00.833329Z",
  "completed_at": "2026-10-28T19:25:01.286786Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/c79688ba-b90f-496f-b70c-02eb339b7dc1/rating` → **200**

```json
{
  "command_id": "304677d5-eb05-4413-93eb-dbb03810977c",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "score": 5,
  "created_at": "2026-10-28T19:25:01.530782958Z"
}
```

`POST /api/driver/v1/orders/c79688ba-b90f-496f-b70c-02eb339b7dc1/rating` → **200**

```json
{
  "command_id": "9d2444cf-412d-4aac-bf6f-a96b6a541566",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
  "score": 4,
  "created_at": "2026-10-28T19:25:01.76147322Z"
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
  "session_id": "1d50964c-26f5-406c-89a0-d6eb7f07e72e",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MDIsImlhdCI6MTc5MzIxNTUwMiwianRpIjoiNjVjNzA1ODItNzdlZC00ODYyLWI3MDQtOWNhNmRjMGNiZDdjIiwic2lkIjoiMWQ1MDk2NGMtMjZmNS00MDZjLTg5YTAtZDZlYjdmMDdlNzJlIn0.bSq3kntI6qZ80BjbOUMDX_SEoJ7UmzQ1eGJApfiKqyg",
  "access_expires_at": "2026-10-28T19:40:02.464049662Z",
  "refresh_token": "58nJNJ5XsGwzIooGnaYiMbgYI9eTEAKdcJv3_tqaVDQ",
  "refresh_expires_at": "2026-10-29T07:25:02.463634975Z",
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
  "session_id": "df4b705a-f1d1-4f22-9ef3-1053eff55e83",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MDIsImlhdCI6MTc5MzIxNTUwMiwianRpIjoiOTZiMGFlZGItNWFlMy00MmRkLTkyYmMtNjdmNjYwN2U3MzY4Iiwic2lkIjoiZGY0YjcwNWEtZjFkMS00ZjIyLTllZjMtMTA1M2VmZjU1ZTgzIn0.rjYDexr6YuTX8TdrH8HWKN-2Qh-aiOmJPxIunEb4xvo",
  "access_expires_at": "2026-10-28T19:40:02.947711917Z",
  "refresh_token": "afup9Y5CC3alzc64d9XCKIt2vDh3y-OdE92pi12RI_M",
  "refresh_expires_at": "2026-10-29T07:25:02.947275009Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c79688ba-b90f-496f-b70c-02eb339b7dc1/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
      "author_type": "RIDER",
      "author_id": "e70fb01e-b45c-4925-867a-4d158bae50ce",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T19:25:01.530783Z"
    },
    {
      "order_id": "c79688ba-b90f-496f-b70c-02eb339b7dc1",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "e70fb01e-b45c-4925-867a-4d158bae50ce",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T19:25:01.761473Z"
    }
  ]
}
```

Done: ratings for order c79688ba-b90f-496f-b70c-02eb339b7dc1.

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
  "session_id": "048e5fd8-c131-4827-ad70-23368d85ff50",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MDMsImlhdCI6MTc5MzIxNTUwMywianRpIjoiZDhiN2RmY2UtZmYwNy00YTk0LTkzMWUtOGUxM2NkMjgxOWZhIiwic2lkIjoiMDQ4ZTVmZDgtYzEzMS00ODI3LWFkNzAtMjMzNjhkODVmZjUwIn0.Je4nA5Fhb8NugSTuVDnpq6Ll4im6sVUyCRSej3nyND8",
  "access_expires_at": "2026-10-28T19:40:03.662242293Z",
  "refresh_token": "3z-3GMO5ocvAsSn47U4pyuoQVr0zvInJUWnVvav-PPw",
  "refresh_expires_at": "2026-10-29T07:25:03.661793516Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "502c615b-e9a3-4081-9265-ccd8268546f0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "240efaea-a872-4cee-8e9a-e1f43ac04221",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:03.886094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/240efaea-a872-4cee-8e9a-e1f43ac04221` → **200**

```json
{
  "id": "240efaea-a872-4cee-8e9a-e1f43ac04221",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:03.886094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/240efaea-a872-4cee-8e9a-e1f43ac04221` → **200**

```json
{
  "id": "240efaea-a872-4cee-8e9a-e1f43ac04221",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:03.886094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/240efaea-a872-4cee-8e9a-e1f43ac04221` → **200**

```json
{
  "id": "240efaea-a872-4cee-8e9a-e1f43ac04221",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:03.886094Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/240efaea-a872-4cee-8e9a-e1f43ac04221` → **200**

```json
{
  "id": "240efaea-a872-4cee-8e9a-e1f43ac04221",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T19:25:03.886094Z",
  "ready_at": "2026-10-28T19:25:07.175689Z",
  "expires_at": "2026-10-29T19:25:07.175689Z"
}
```

`GET /api/admin/v1/reports/exports/240efaea-a872-4cee-8e9a-e1f43ac04221/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,22,9,13,0,0,17,5,0,20,1,0,1,7,1,5
total,22,9,13,0,0,17,5,0,20,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6e23bd3e-6f59-4987-9b73-577deea76ede",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "4ab96aaf-daab-4d5f-adf5-3ad13e09d101",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:08.036784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4ab96aaf-daab-4d5f-adf5-3ad13e09d101` → **200**

```json
{
  "id": "4ab96aaf-daab-4d5f-adf5-3ad13e09d101",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:08.036784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4ab96aaf-daab-4d5f-adf5-3ad13e09d101` → **200**

```json
{
  "id": "4ab96aaf-daab-4d5f-adf5-3ad13e09d101",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:08.036784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4ab96aaf-daab-4d5f-adf5-3ad13e09d101` → **200**

```json
{
  "id": "4ab96aaf-daab-4d5f-adf5-3ad13e09d101",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:08.036784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4ab96aaf-daab-4d5f-adf5-3ad13e09d101` → **200**

```json
{
  "id": "4ab96aaf-daab-4d5f-adf5-3ad13e09d101",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T19:25:08.036784Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4ab96aaf-daab-4d5f-adf5-3ad13e09d101` → **200**

```json
{
  "id": "4ab96aaf-daab-4d5f-adf5-3ad13e09d101",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T19:25:08.036784Z",
  "ready_at": "2026-10-28T19:25:12.194773Z",
  "expires_at": "2026-10-29T19:25:12.194773Z"
}
```

`GET /api/admin/v1/reports/exports/4ab96aaf-daab-4d5f-adf5-3ad13e09d101/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,9,1282.20,130.74,192.36,1089.84,10.52,0.00,162.97,182.97,689.83,50.00,105.17
total,UAH,9,1282.20,130.74,192.36,1089.84,10.52,0.00,162.97,182.97,689.83,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/55ed3d28-76b9-4d8b-9f31-52c39504afb1` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/55ed3d28-76b9-4d8b-9f31-52c39504afb1",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "be1691f0-51dc-448b-9183-4028e4597723"
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
  "device_ref": "sandbox-29701"
}
```

```json
{
  "challenge_id": "41aff6fa-7743-48c6-bbc1-1016c3e9497d",
  "expires_at": "2026-10-28T19:30:13.605058022Z",
  "resend_available_at": "2026-10-28T19:25:14.605058022Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "504681",
  "sent_at": "2026-10-28T19:25:13.60712096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41aff6fa-7743-48c6-bbc1-1016c3e9497d",
  "code": "504681",
  "device_ref": "sandbox-29701"
}
```

```json
{
  "session_id": "42d5cde9-80f1-4bd8-aafc-1f6719cfb495",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjQxMywiaWF0IjoxNzkzMjE1NTEzLCJqdGkiOiJiZTU4NDdhZi03NTU0LTRkODEtYjIxZS1lYjhlYmIxY2I0YTIiLCJzaWQiOiI0MmQ1Y2RlOS04MGYxLTRiZDgtYWFmYy0xZjY3MTljZmI0OTUifQ.5IR7xKg0KR3C9j3uP3zBVDqksnwBHo_VL97iWOu2B90",
  "access_expires_at": "2026-10-28T19:40:13.846871775Z",
  "refresh_token": "lhstPgihD8AcGGomgJv0XcaIYzFSOFA-St4HqamH6Jw",
  "refresh_expires_at": "2026-11-27T19:25:13.846366639Z",
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
  "command_id": "e93cb41b-be61-4686-8524-176e77f2a229",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:25:14Z",
    "sequence": 1793215514514
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "802eaad8-e67b-47bd-a246-b04c8525755f",
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
  "last_heartbeat_at": "2026-10-28T19:25:14.528286Z",
  "last_location_at": "2026-10-28T19:25:14.528286Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "7f1f2708-08d2-4a57-944d-4a771dde54e6",
  "points": [
    {
      "sequence": 1793215516752,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T19:24:16Z"
    },
    {
      "sequence": 1793215516757,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T19:25:16Z"
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
  "session_id": "e18770ab-0b12-4c26-98c6-15a87d443064",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MTcsImlhdCI6MTc5MzIxNTUxNywianRpIjoiNmZhNzQwOWEtYTE0OC00OTFjLWI3YzgtZjgxMWIwY2NhMWQyIiwic2lkIjoiZTE4NzcwYWItMGIxMi00YzI2LTk4YzYtMTVhODdkNDQzMDY0In0.z_pKFUH0Pp_QVVXsKSmOyfIzHk6_eQMIv9dJjcAsnMg",
  "access_expires_at": "2026-10-28T19:40:17.297979903Z",
  "refresh_token": "Br77Pk5lEYANzxmZZrc-k7GLwZFQAZcEPRErQka19Kc",
  "refresh_expires_at": "2026-10-29T07:25:17.297458515Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "5a8d05d1-fff6-4e3a-afea-1a0fcefbde27",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T19:25:16Z",
        "track_point_id": "589fac7f-ca06-4d95-b8aa-e0604adc6a5b",
        "work_session_id": "802eaad8-e67b-47bd-a246-b04c8525755f"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T19:25:16Z",
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

`POST /api/admin/v1/driver-risk-flags/5a8d05d1-fff6-4e3a-afea-1a0fcefbde27/confirm` → **200**

```json
{
  "command_id": "57f1e319-b175-4740-b11e-3c00c91904b7",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "5a8d05d1-fff6-4e3a-afea-1a0fcefbde27",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T19:25:16Z",
    "track_point_id": "589fac7f-ca06-4d95-b8aa-e0604adc6a5b",
    "work_session_id": "802eaad8-e67b-47bd-a246-b04c8525755f"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T19:25:16Z",
  "reason": null,
  "reviewed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reviewed_at": "2026-10-28T19:25:17.989444Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/5a8d05d1-fff6-4e3a-afea-1a0fcefbde27/dismiss` → **409**

```json
{
  "command_id": "0d31222b-9167-480b-b622-b12f5b6fe146",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/5a8d05d1-fff6-4e3a-afea-1a0fcefbde27/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "679482e3-51f4-43bd-875a-6e82f961f41f"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c4919dee-023c-4278-a642-eec61f720813",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "ac747715-6612-45d3-9f28-41052c96f61f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "raised_at": "2026-10-28T19:25:18.441621Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/ac747715-6612-45d3-9f28-41052c96f61f/dismiss` → **200**

```json
{
  "command_id": "a3156a12-b8a7-4565-b084-20f6647bfdf3",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "ac747715-6612-45d3-9f28-41052c96f61f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "raised_at": "2026-10-28T19:25:18.441621Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reviewed_at": "2026-10-28T19:25:18.671664Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1e0233f7-f5fd-4d98-b028-0c61dc004071",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "5a8d05d1-fff6-4e3a-afea-1a0fcefbde27"
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
      "actor_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:25:18.89765Z"
    }
  ]
}
```

Done: flag 5a8d05d1-fff6-4e3a-afea-1a0fcefbde27 confirmed, suspension named it, driver reinstated.

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
  "session_id": "5ab36528-d4be-4494-a0a9-a22d3ffbdacc",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MTksImlhdCI6MTc5MzIxNTUxOSwianRpIjoiMzg0ZDIxNjQtYjU1OS00ZWE1LWFjZjUtOTc0MDdiMzMxMTM3Iiwic2lkIjoiNWFiMzY1MjgtZDRiZS00NDk0LWEwYTktYTIyZDNmZmJkYWNjIn0.xPH13qstMhClgwDNJLi8YyKWaSLc0V1HN4bNixGC8ic",
  "access_expires_at": "2026-10-28T19:40:19.607662358Z",
  "refresh_token": "47IDxtLKjFg3shkstOcbOwz5y9adPK5QEcSkl8rCDMU",
  "refresh_expires_at": "2026-10-29T07:25:19.607075612Z",
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
      "actor_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:25:18.89765Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "efd81664-5674-48b3-ab04-f5ef5c219f0a",
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
  "session_id": "802eaad8-e67b-47bd-a246-b04c8525755f",
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
  "last_heartbeat_at": "2026-10-28T19:25:14.528286Z",
  "last_location_at": "2026-10-28T19:25:14.528286Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/802eaad8-e67b-47bd-a246-b04c8525755f/close` → **200**

```json
{
  "command_id": "3737567f-3238-4597-9715-a5ac4fcb5752",
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
  "session_id": "6483d05b-d10f-4c47-9915-80ce23092d00",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MjAsImlhdCI6MTc5MzIxNTUyMCwianRpIjoiOTA4MWRkYzgtZWIyNy00NDJhLWEyYzktMzlkZGE5Y2IxMTlmIiwic2lkIjoiNjQ4M2QwNWItZDEwZi00YzQ3LTk5MTUtODBjZTIzMDkyZDAwIn0.9SJclQhxqE91VR5_GNpTxgZ6ti-uPc1_dPKyxzKqrMk",
  "access_expires_at": "2026-10-28T19:40:20.996205193Z",
  "refresh_token": "Sa23hLJnrbmdJXQjmJsnN5lpDi2iVnAKCjSXCg1iHo0",
  "refresh_expires_at": "2026-10-29T07:25:20.9957668Z",
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
  "command_id": "f9279871-4243-4e3b-85df-10a4a87b7a1e",
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
  "changed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T19:25:21.452778Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "f9279871-4243-4e3b-85df-10a4a87b7a1e",
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
  "changed_by": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T19:25:21.452778Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48037343160",
  "device_ref": "sandbox-13250"
}
```

```json
{
  "challenge_id": "ad39c198-f334-45a8-b921-ee900028741a",
  "expires_at": "2026-10-28T19:30:21.913617415Z",
  "resend_available_at": "2026-10-28T19:25:22.913617415Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48037343160` → **200**

```json
{
  "phone": "+48037343160",
  "audience": "CLIENT",
  "code": "245633",
  "sent_at": "2026-10-28T19:25:21.915578087Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad39c198-f334-45a8-b921-ee900028741a",
  "code": "245633",
  "device_ref": "sandbox-13250"
}
```

```json
{
  "session_id": "2f1ba4b9-0a0d-4ff9-9170-e4316f93c936",
  "subject": {
    "type": "CLIENT",
    "id": "f05df477-4637-426a-8881-842507873c1a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDVkZjQ3Ny00NjM3LTQyNmEtODg4MS04NDI1MDc4NzNjMWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2NDIyLCJpYXQiOjE3OTMyMTU1MjIsImp0aSI6IjM3MDBkNjE4LWQ5ZWEtNDU1Yi05NzMzLTczNjVlN2Q1YjkyOCIsInNpZCI6IjJmMWJhNGI5LTBhMGQtNGZmOS05MTcwLWU0MzE2ZjkzYzkzNiJ9.n-1rV0sJcjEUvatX8n2d4IwJMEnQyPhxxlYveDs1-kw",
  "access_expires_at": "2026-10-28T19:40:22.160102144Z",
  "refresh_token": "ie3KemRRfC2JoHPG8Vm-XmHj2kPJ_YcoFjXkzNhxd8E",
  "refresh_expires_at": "2026-11-27T19:25:22.159750443Z",
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
  "correlation_id": "aecf54be-8ec8-4f7c-90c8-ac31f6d7c2aa"
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
  "device_ref": "sandbox-19553"
}
```

```json
{
  "challenge_id": "9853c8c2-6359-4331-99df-3637789c8ece",
  "expires_at": "2026-10-28T19:30:22.805737627Z",
  "resend_available_at": "2026-10-28T19:25:23.805737627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "735805",
  "sent_at": "2026-10-28T19:25:22.807453687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9853c8c2-6359-4331-99df-3637789c8ece",
  "code": "735805",
  "device_ref": "sandbox-19553"
}
```

```json
{
  "session_id": "331da991-1337-45e9-bb74-36f98df7f1f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjQyMywiaWF0IjoxNzkzMjE1NTIzLCJqdGkiOiJjNTEwOTFjNC00Y2I4LTRiMmMtYTIyZi0yZGRkNmQ0Y2EwZmYiLCJzaWQiOiIzMzFkYTk5MS0xMzM3LTQ1ZTktYmI3NC0zNmY5OGRmN2YxZjEifQ.7ODVB44GkKUpqQpJt5lK0vlP3kec4X--sHiVbzUlEWk",
  "access_expires_at": "2026-10-28T19:40:23.046156341Z",
  "refresh_token": "tBO2YNQLdVht5w2Gq40BvTx3S0CKT_tOwnGdmf2Hb1s",
  "refresh_expires_at": "2026-11-27T19:25:23.045561346Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "080b2a07-be41-4af4-b0b7-8b3d1be65a05",
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
  "last_heartbeat_at": "2026-10-28T19:24:55.344885Z",
  "last_location_at": "2026-10-28T19:24:55.344885Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/080b2a07-be41-4af4-b0b7-8b3d1be65a05/handover` → **200**

```json
{
  "command_id": "67c30c8d-8264-4a2d-953b-c64f0e684a4f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "080b2a07-be41-4af4-b0b7-8b3d1be65a05",
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
  "last_heartbeat_at": "2026-10-28T19:24:55.344885Z",
  "last_location_at": "2026-10-28T19:24:55.344885Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/080b2a07-be41-4af4-b0b7-8b3d1be65a05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:25:23Z",
    "sequence": 1793215523690
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "080b2a07-be41-4af4-b0b7-8b3d1be65a05",
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
  "last_heartbeat_at": "2026-10-28T19:25:23.704813Z",
  "last_location_at": "2026-10-28T19:25:23.704813Z",
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
  "session_id": "080b2a07-be41-4af4-b0b7-8b3d1be65a05",
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
  "last_heartbeat_at": "2026-10-28T19:25:23.704813Z",
  "last_location_at": "2026-10-28T19:25:23.704813Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/080b2a07-be41-4af4-b0b7-8b3d1be65a05/close` → **200**

```json
{
  "command_id": "3b4fb6d4-09af-43e3-91c5-34e8c51f8e57",
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
  "correlation_id": "26522e32-7cdd-461d-bd4e-ea1f1c599a29"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679260228",
  "device_ref": "sandbox-31936"
}
```

```json
{
  "challenge_id": "c36a4aef-8bc7-432b-9e95-2d18bf6c3313",
  "expires_at": "2026-10-28T19:30:24.828087167Z",
  "resend_available_at": "2026-10-28T19:25:25.828087167Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679260228` → **200**

```json
{
  "phone": "+380679260228",
  "audience": "CLIENT",
  "code": "875294",
  "sent_at": "2026-10-28T19:25:24.830146406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c36a4aef-8bc7-432b-9e95-2d18bf6c3313",
  "code": "875294",
  "device_ref": "sandbox-31936"
}
```

```json
{
  "session_id": "b770d814-3233-4b6d-a61f-8abac1f32e4e",
  "subject": {
    "type": "CLIENT",
    "id": "83d7a82a-732a-4fac-bed8-1497fecf2110"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2Q3YTgyYS03MzJhLTRmYWMtYmVkOC0xNDk3ZmVjZjIxMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2NDI1LCJpYXQiOjE3OTMyMTU1MjUsImp0aSI6IjFiN2VhNzBlLTIxMTUtNDdhZi04ODdhLWVhYjkwNWY1MzcyYiIsInNpZCI6ImI3NzBkODE0LTMyMzMtNGI2ZC1hNjFmLThhYmFjMWYzMmU0ZSJ9.gs-N4Ga-cMpdDToSJo17JORzSRjecsSDuPTzA_LBuvs",
  "access_expires_at": "2026-10-28T19:40:25.07030207Z",
  "refresh_token": "7dlxG_xtwTsr4VYZwhWsUY1TBBXVaoAzu837y3h9_f8",
  "refresh_expires_at": "2026-11-27T19:25:25.069762184Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "8a435dde-deec-4fc5-8e22-0ff7fbf24786",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5d6c57d6-7495-49b8-ab68-f84c3d372bd1",
  "upload_path": "/api/rider/v1/uploads/5d6c57d6-7495-49b8-ab68-f84c3d372bd1",
  "expires_at": "2026-10-28T19:40:25.290553975Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/5d6c57d6-7495-49b8-ab68-f84c3d372bd1` → **200**

```json
{
  "file_id": "5d6c57d6-7495-49b8-ab68-f84c3d372bd1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "225d99ae-18b8-4628-b8f9-d0b82f193fe9",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "5d6c57d6-7495-49b8-ab68-f84c3d372bd1"
  ]
}
```

```json
{
  "id": "b4f3e630-8736-4c2e-a012-3e467f0bf097",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "83d7a82a-732a-4fac-bed8-1497fecf2110",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T19:25:25.539431Z",
  "updated_at": "2026-10-28T19:25:25.539431Z",
  "respond_by": "2026-10-28T23:25:25.539431Z",
  "messages": [
    {
      "id": "71f12151-bd43-4bf7-9e3f-1a660977a94b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "83d7a82a-732a-4fac-bed8-1497fecf2110",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:25:25.54032Z",
      "attachments": [
        {
          "file_id": "5d6c57d6-7495-49b8-ab68-f84c3d372bd1",
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
  "session_id": "9c402cf8-b5be-4d38-b7a9-ee130193a175",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MjYsImlhdCI6MTc5MzIxNTUyNiwianRpIjoiMzc1NWJiMGUtZjVmMC00YzEyLTlkNzItOWU3ZDYwNTY1ZWM1Iiwic2lkIjoiOWM0MDJjZjgtYjViZS00ZDM4LWI3YTktZWUxMzAxOTNhMTc1In0.Ic7R0OAkl0rgq_XFT-bvb6wzTQrMCuoHcxg2t9DE4Po",
  "access_expires_at": "2026-10-28T19:40:26.053442878Z",
  "refresh_token": "4wwqbO0_ux2DF6kZLSts0MaII7mZr6oyLaLOgZKZnlU",
  "refresh_expires_at": "2026-10-29T07:25:26.05301479Z",
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
  "session_id": "f02f154b-093f-4149-b70a-a5bc0b504e7a",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MjYsImlhdCI6MTc5MzIxNTUyNiwianRpIjoiNWU0NzhlMGEtZWZmYy00ZTlmLTkxZGUtYWQ2OTdlNmQ0OGRhIiwic2lkIjoiZjAyZjE1NGItMDkzZi00MTQ5LWI3MGEtYTViYzBiNTA0ZTdhIn0.BAjDENR0DWn3pC7oMwCxYvJpGBi8fOcsMUhS6ov4Tbs",
  "access_expires_at": "2026-10-28T19:40:26.532176885Z",
  "refresh_token": "9musDvB04n8VKowCArVpIK-s5uNNQChz87tPgW11zAo",
  "refresh_expires_at": "2026-10-29T07:25:26.531693258Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/b4f3e630-8736-4c2e-a012-3e467f0bf097/attachments/5d6c57d6-7495-49b8-ab68-f84c3d372bd1` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d6a01a46-830c-4527-b58c-a2b033cb1e36",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "82aa0733-7e7d-4537-96f9-e061050e9ae2",
  "upload_path": "/api/operator/v1/uploads/82aa0733-7e7d-4537-96f9-e061050e9ae2",
  "expires_at": "2026-10-28T19:40:26.758138559Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/82aa0733-7e7d-4537-96f9-e061050e9ae2` → **200**

```json
{
  "file_id": "82aa0733-7e7d-4537-96f9-e061050e9ae2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/b4f3e630-8736-4c2e-a012-3e467f0bf097` → **200**

```json
{
  "id": "b4f3e630-8736-4c2e-a012-3e467f0bf097",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "83d7a82a-732a-4fac-bed8-1497fecf2110",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T19:25:25.539431Z",
  "updated_at": "2026-10-28T19:25:25.539431Z",
  "respond_by": "2026-10-28T23:25:25.539431Z",
  "messages": [
    {
      "id": "71f12151-bd43-4bf7-9e3f-1a660977a94b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "83d7a82a-732a-4fac-bed8-1497fecf2110",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:25:25.54032Z",
      "attachments": [
        {
          "file_id": "5d6c57d6-7495-49b8-ab68-f84c3d372bd1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/b4f3e630-8736-4c2e-a012-3e467f0bf097/comments` → **200**

```json
{
  "command_id": "f1413f28-04eb-471c-81ec-02bcea797843",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "82aa0733-7e7d-4537-96f9-e061050e9ae2"
  ]
}
```

```json
{
  "id": "b4f3e630-8736-4c2e-a012-3e467f0bf097",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "83d7a82a-732a-4fac-bed8-1497fecf2110",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T19:25:25.539431Z",
  "updated_at": "2026-10-28T19:25:27.242332Z",
  "respond_by": "2026-10-28T23:25:25.539431Z",
  "messages": [
    {
      "id": "71f12151-bd43-4bf7-9e3f-1a660977a94b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "83d7a82a-732a-4fac-bed8-1497fecf2110",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:25:25.54032Z",
      "attachments": [
        {
          "file_id": "5d6c57d6-7495-49b8-ab68-f84c3d372bd1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "52885ef3-a785-42c0-973e-87999d511040",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T19:25:27.241724Z",
      "attachments": [
        {
          "file_id": "82aa0733-7e7d-4537-96f9-e061050e9ae2",
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

`GET /api/rider/v1/support/cases/b4f3e630-8736-4c2e-a012-3e467f0bf097` → **200**

```json
{
  "id": "b4f3e630-8736-4c2e-a012-3e467f0bf097",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "83d7a82a-732a-4fac-bed8-1497fecf2110",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T19:25:25.539431Z",
  "updated_at": "2026-10-28T19:25:27.242332Z",
  "respond_by": "2026-10-28T23:25:25.539431Z",
  "messages": [
    {
      "id": "71f12151-bd43-4bf7-9e3f-1a660977a94b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "83d7a82a-732a-4fac-bed8-1497fecf2110",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T19:25:25.54032Z",
      "attachments": [
        {
          "file_id": "5d6c57d6-7495-49b8-ab68-f84c3d372bd1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "52885ef3-a785-42c0-973e-87999d511040",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T19:25:27.241724Z",
      "attachments": [
        {
          "file_id": "82aa0733-7e7d-4537-96f9-e061050e9ae2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/b4f3e630-8736-4c2e-a012-3e467f0bf097/attachments/82aa0733-7e7d-4537-96f9-e061050e9ae2` → **200**

Done: support case b4f3e630-8736-4c2e-a012-3e467f0bf097, rider attachment 5d6c57d6-7495-49b8-ab68-f84c3d372bd1, operator attachment 82aa0733-7e7d-4537-96f9-e061050e9ae2.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733810785",
  "device_ref": "sandbox-11006"
}
```

```json
{
  "challenge_id": "44006351-e544-44cc-85dd-efd668d3b052",
  "expires_at": "2026-10-28T19:30:27.717389171Z",
  "resend_available_at": "2026-10-28T19:25:28.717389171Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733810785` → **200**

```json
{
  "phone": "+380733810785",
  "audience": "CLIENT",
  "code": "582620",
  "sent_at": "2026-10-28T19:25:27.719056263Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44006351-e544-44cc-85dd-efd668d3b052",
  "code": "582620",
  "device_ref": "sandbox-11006"
}
```

```json
{
  "session_id": "2c21be1d-4bab-4734-bcda-200a4fe61885",
  "subject": {
    "type": "CLIENT",
    "id": "7171590e-b4b2-491a-b68c-5c94127b2e02"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTcxNTkwZS1iNGIyLTQ5MWEtYjY4Yy01Yzk0MTI3YjJlMDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2NDI3LCJpYXQiOjE3OTMyMTU1MjcsImp0aSI6ImVlMTkwMmQ5LTEyM2QtNDlhMy04MzdiLWNmZTA1MzI0NDQ2NSIsInNpZCI6IjJjMjFiZTFkLTRiYWItNDczNC1iY2RhLTIwMGE0ZmU2MTg4NSJ9.Z5jIINmiqbwdKzwgaqxMNwrkKuJGcB05fBCKao2-b5w",
  "access_expires_at": "2026-10-28T19:40:27.954995487Z",
  "refresh_token": "yXtCjgKz4H5Q2C-ThINxpW7ai-wdp1q0-XClGdRXxeo",
  "refresh_expires_at": "2026-11-27T19:25:27.954543321Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b2df0916-978b-49f5-916d-6d8c7e41b5cb",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "17f9eddf-f4db-412e-aa11-6d62238cccbb",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-17f9eddf-f4db-412e-aa11-6d62238cccbb",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3b917d93f70786351382130959aed6cf",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=17f9eddf-f4db-412e-aa11-6d62238cccbb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733810785"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=17f9eddf-f4db-412e-aa11-6d62238cccbb",
  "expires_at": "2026-10-28T19:55:28.176929Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/17f9eddf-f4db-412e-aa11-6d62238cccbb` → **200**

```json
{
  "id": "17f9eddf-f4db-412e-aa11-6d62238cccbb",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T19:55:28.176929Z",
  "card": {
    "id": "f8d53a6f-bd01-45c9-b564-5d086c900fde",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3265",
    "card_type": "Visa",
    "created_at": "2026-10-28T19:25:28.394673Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8d2f14bb-27cb-4f3c-b569-c6f4b3e6526b",
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
  "id": "3fee6b13-6078-43f0-87d0-50c3ce4d70dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:30:28.634470Z",
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
  "command_id": "405c8bf2-0aa5-43f5-bb00-c7b2a3df324d",
  "quote_id": "3fee6b13-6078-43f0-87d0-50c3ce4d70dc",
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
  "id": "2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a",
  "short_number": 24,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7171590e-b4b2-491a-b68c-5c94127b2e02",
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
  "created_at": "2026-10-28T19:25:28.863483Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a` → **200**

```json
{
  "id": "2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a",
  "short_number": 24,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7171590e-b4b2-491a-b68c-5c94127b2e02",
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
  "created_at": "2026-10-28T19:25:28.863483Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a` → **200**

```json
{
  "id": "2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7171590e-b4b2-491a-b68c-5c94127b2e02",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:25:28.863483Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider decides to pay in cash

`GET /api/rider/v1/orders/2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a` → **200**

```json
{
  "id": "2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7171590e-b4b2-491a-b68c-5c94127b2e02",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:25:28.863483Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a/switch-to-cash` → **200**

```json
{
  "command_id": "a6da6194-6db3-4334-bfa4-0dab86476768",
  "expected_version": 3
}
```

```json
{
  "id": "2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7171590e-b4b2-491a-b68c-5c94127b2e02",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:25:28.863483Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a/switch-to-cash` → **409**

```json
{
  "command_id": "d796f1fb-a435-4c41-8449-7711a08f7b31",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e402c89a-97da-41eb-bff0-a34289e4bf31"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a` → **200**

```json
{
  "id": "2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7171590e-b4b2-491a-b68c-5c94127b2e02",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T19:25:28.863483Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a/cancel` → **200**

```json
{
  "command_id": "ee424c50-40b7-4810-a776-3fa148eb789c",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2eb1a18d-c551-4fd9-a8ae-81fe92fbf66a",
  "short_number": 24,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7171590e-b4b2-491a-b68c-5c94127b2e02",
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-28T19:25:28.863483Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

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
  "session_id": "b42dfadb-6553-4355-859a-c2a3b3ed4b33",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MzIsImlhdCI6MTc5MzIxNTUzMiwianRpIjoiYTQ3YzFjNDktMWVhYi00MDAzLWE4MzctMWNkMDM1NDhiMWFkIiwic2lkIjoiYjQyZGZhZGItNjU1My00MzU1LTg1OWEtYzJhM2IzZWQ0YjMzIn0.0bbyfRvg26j7mlsLXV5KS1NGaqMSG8ce6MwZVp1hSFg",
  "access_expires_at": "2026-10-28T19:40:32.026257367Z",
  "refresh_token": "u1NLQcPVHHVXv28CWT5mREZBpx5VXp9BGqHlObysPow",
  "refresh_expires_at": "2026-10-29T07:25:32.025799027Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24944"
}
```

```json
{
  "challenge_id": "bec3f850-13ce-4e09-98a9-38fba6c7ed74",
  "expires_at": "2026-10-28T19:30:32.249727382Z",
  "resend_available_at": "2026-10-28T19:25:33.249727382Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "742754",
  "sent_at": "2026-10-28T19:25:32.25137525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bec3f850-13ce-4e09-98a9-38fba6c7ed74",
  "code": "742754",
  "device_ref": "sandbox-24944"
}
```

```json
{
  "session_id": "ffdfe878-c2ff-4af3-8257-001529ea04f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjQzMiwiaWF0IjoxNzkzMjE1NTMyLCJqdGkiOiJmNWNmNzhmMC1mMWNkLTQxMTktOTNiNS1jYWZmNTEwMjgzNDMiLCJzaWQiOiJmZmRmZTg3OC1jMmZmLTRhZjMtODI1Ny0wMDE1MjllYTA0ZjMifQ.t491hrmz-AFOn5k5eq_zsXqxEAcsOO5GoQKUDCvc6SA",
  "access_expires_at": "2026-10-28T19:40:32.486345991Z",
  "refresh_token": "nq70iVwsAPZBSwqtB3MkAEw3E8zYhncuiGz4PCTDE1o",
  "refresh_expires_at": "2026-11-27T19:25:32.485897129Z",
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
      "actor_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T19:25:18.89765Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T19:25:20.055039Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "16a12651-73d0-4fd5-90d6-3502ee9fccff",
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
  "device_ref": "sandbox-15676"
}
```

```json
{
  "challenge_id": "e5f3dc91-7898-42a9-9d67-52b2755e0bb7",
  "expires_at": "2026-10-28T19:30:33.370609816Z",
  "resend_available_at": "2026-10-28T19:25:34.370609816Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "368851",
  "sent_at": "2026-10-28T19:25:33.372755435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5f3dc91-7898-42a9-9d67-52b2755e0bb7",
  "code": "368851",
  "device_ref": "sandbox-15676"
}
```

```json
{
  "session_id": "27b18709-521f-42d8-8a8a-75ced313317f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjQzMywiaWF0IjoxNzkzMjE1NTMzLCJqdGkiOiIzYmE3MDlmYy1kMGIzLTQ1NDYtYTA5Zi1iMWMwNmM1Mzc4NzIiLCJzaWQiOiIyN2IxODcwOS01MjFmLTQyZDgtOGE4YS03NWNlZDMxMzMxN2YifQ._SND-mom_gljhEjbykS2QdTrDDLkBWAW1jHclWCfoGI",
  "access_expires_at": "2026-10-28T19:40:33.615263889Z",
  "refresh_token": "GMAXqqJEcFzH_txojjdHaYzPU7oBIEreT308WtPML-M",
  "refresh_expires_at": "2026-11-27T19:25:33.61482866Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "41cfa953-4683-4a9f-b516-d32180d56dae",
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
  "last_heartbeat_at": "2026-10-28T19:25:01.06516Z",
  "last_location_at": "2026-10-28T19:25:01.06516Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/41cfa953-4683-4a9f-b516-d32180d56dae/handover` → **200**

```json
{
  "command_id": "d5846114-2b91-494e-81be-621f6a5c0080",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "41cfa953-4683-4a9f-b516-d32180d56dae",
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
  "last_heartbeat_at": "2026-10-28T19:25:01.06516Z",
  "last_location_at": "2026-10-28T19:25:01.06516Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/41cfa953-4683-4a9f-b516-d32180d56dae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:25:34Z",
    "sequence": 1793215534267
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "41cfa953-4683-4a9f-b516-d32180d56dae",
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
  "last_heartbeat_at": "2026-10-28T19:25:34.281473Z",
  "last_location_at": "2026-10-28T19:25:34.281473Z",
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
  "command_id": "a9c1b8f2-43fb-4076-b205-df883003be43",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:25:34Z",
    "sequence": 1793215534729
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "544b6ab3-06b4-48d0-a4f0-90b9e4fce9c2",
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
  "last_heartbeat_at": "2026-10-28T19:25:34.743066Z",
  "last_location_at": "2026-10-28T19:25:34.743066Z",
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
  "session_id": "d10a76bf-84c0-49ed-8d26-766b6acf02ee",
  "subject": {
    "type": "STAFF",
    "id": "da6b8b24-2ba4-47a6-b17f-6b10630c5feb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTZiOGIyNC0yYmE0LTQ3YTYtYjE3Zi02YjEwNjMwYzVmZWIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMTY0MzUsImlhdCI6MTc5MzIxNTUzNSwianRpIjoiMzcyYzZkZDYtZjYzYi00ZGZmLThmNDctZGE4NThmMDUwMzUwIiwic2lkIjoiZDEwYTc2YmYtODRjMC00OWVkLThkMjYtNzY2YjZhY2YwMmVlIn0.zDEXTqOxh25FFuqewoBkgT_L_zVmLpqSO_5zDExbKig",
  "access_expires_at": "2026-10-28T19:40:35.227155833Z",
  "refresh_token": "BTJDTanhjr63FrzPL6zY29806qYzdDNkxSEaYdIOEhw",
  "refresh_expires_at": "2026-10-29T07:25:35.226666629Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b8bc93a2-3b24-4452-abe4-7dd7e1e42787",
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
  "id": "fcc864f9-3a12-4714-a514-1724d83f4e79",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:30:35.445605Z",
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
  "command_id": "b0b0a822-25b0-4631-8ec4-5788a909860f",
  "quote_id": "fcc864f9-3a12-4714-a514-1724d83f4e79",
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
  "id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
  "short_number": 25,
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
  "created_at": "2026-10-28T19:25:35.674775Z",
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
    "id": "7621f8c6-75ce-48f0-991d-396492f17777",
    "order_id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
    "expires_at": "2026-10-28T19:25:50.677849Z",
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

`POST /api/driver/v1/offers/7621f8c6-75ce-48f0-991d-396492f17777/accept` → **200**

```json
{
  "command_id": "f0653782-82cc-4a72-b729-67b1b6822f3c"
}
```

```json
{
  "id": "2ac7b2fa-5040-46da-9a09-0b5b4ea26e12",
  "order_id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "809d8a01-670e-4790-8497-7c2d2244b795",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "809d8a01-670e-4790-8497-7c2d2244b795",
  "order_id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
  "assignment_id": "2ac7b2fa-5040-46da-9a09-0b5b4ea26e12",
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

`POST /api/driver/v1/work-sessions/544b6ab3-06b4-48d0-a4f0-90b9e4fce9c2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T19:25:36Z",
    "sequence": 1793215536757
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "544b6ab3-06b4-48d0-a4f0-90b9e4fce9c2",
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
  "last_heartbeat_at": "2026-10-28T19:25:36.772286Z",
  "last_location_at": "2026-10-28T19:25:36.772286Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/809d8a01-670e-4790-8497-7c2d2244b795/arrive` → **200**

```json
{
  "command_id": "91a4c96b-c002-4986-87fc-320e8eaa883c",
  "expected_version": 0
}
```

```json
{
  "id": "809d8a01-670e-4790-8497-7c2d2244b795",
  "order_id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
  "assignment_id": "2ac7b2fa-5040-46da-9a09-0b5b4ea26e12",
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
  "arrived_at": "2026-10-28T19:25:36.994419Z",
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

`POST /api/driver/v1/trips/809d8a01-670e-4790-8497-7c2d2244b795/start` → **200**

```json
{
  "command_id": "98d45356-786a-47d7-89a0-fe480eb03703",
  "expected_version": 1
}
```

```json
{
  "id": "809d8a01-670e-4790-8497-7c2d2244b795",
  "order_id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
  "assignment_id": "2ac7b2fa-5040-46da-9a09-0b5b4ea26e12",
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
  "arrived_at": "2026-10-28T19:25:36.994419Z",
  "started_at": "2026-10-28T19:25:37.234704Z",
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

`POST /api/driver/v1/trips/809d8a01-670e-4790-8497-7c2d2244b795/complete` → **200**

```json
{
  "command_id": "349f1d29-6910-4218-9e85-8d3d6eef7a3c",
  "expected_version": 2,
  "reported_at": "2026-10-28T19:25:37Z",
  "cash_received": true
}
```

```json
{
  "id": "809d8a01-670e-4790-8497-7c2d2244b795",
  "order_id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
  "assignment_id": "2ac7b2fa-5040-46da-9a09-0b5b4ea26e12",
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
  "arrived_at": "2026-10-28T19:25:36.994419Z",
  "started_at": "2026-10-28T19:25:37.234704Z",
  "completed_at": "2026-10-28T19:25:37.464675Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d70a8277-9af9-41f1-85a2-86d775e6fba1` → **200**

```json
{
  "id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
  "short_number": 25,
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
    "id": "2ac7b2fa-5040-46da-9a09-0b5b4ea26e12",
    "order_id": "d70a8277-9af9-41f1-85a2-86d775e6fba1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "809d8a01-670e-4790-8497-7c2d2244b795",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T19:25:35.674775Z",
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
  "session_id": "41cfa953-4683-4a9f-b516-d32180d56dae",
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
  "last_heartbeat_at": "2026-10-28T19:25:34.281473Z",
  "last_location_at": "2026-10-28T19:25:34.281473Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41cfa953-4683-4a9f-b516-d32180d56dae/close` → **200**

```json
{
  "command_id": "3712f78a-9227-41af-bc01-e080c9acca52",
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
  "session_id": "544b6ab3-06b4-48d0-a4f0-90b9e4fce9c2",
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
  "last_heartbeat_at": "2026-10-28T19:25:36.772286Z",
  "last_location_at": "2026-10-28T19:25:36.772286Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/544b6ab3-06b4-48d0-a4f0-90b9e4fce9c2/close` → **200**

```json
{
  "command_id": "e2deb195-baaa-467b-9926-4bf6892080a5",
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

Done: terminal order d70a8277-9af9-41f1-85a2-86d775e6fba1 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31521"
}
```

```json
{
  "challenge_id": "bd1fce61-88a2-49aa-b575-80297a43ae11",
  "expires_at": "2026-10-28T19:30:42.02171901Z",
  "resend_available_at": "2026-10-28T19:25:43.02171901Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "456179",
  "sent_at": "2026-10-28T19:25:42.024744059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd1fce61-88a2-49aa-b575-80297a43ae11",
  "code": "456179",
  "device_ref": "sandbox-31521"
}
```

```json
{
  "session_id": "237a4eee-aa06-4d8f-8187-d850758f358e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjQ0MiwiaWF0IjoxNzkzMjE1NTQyLCJqdGkiOiIwNTQ1OWI2ZC1kYWI5LTQwMDAtYTg4Mi03NTEzMzY2NmY1MjMiLCJzaWQiOiIyMzdhNGVlZS1hYTA2LTRkOGYtODE4Ny1kODUwNzU4ZjM1OGUifQ._erSQdZbbjec6ptJPKplydS8ZWhpHFoMDHxZ7c3FIf0",
  "access_expires_at": "2026-10-28T19:40:42.262679517Z",
  "refresh_token": "yDD7BCKkdT8YGU4xoIlrflNBZcaAjE4gDt1JID-V560",
  "refresh_expires_at": "2026-11-27T19:25:42.26215082Z",
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
  "device_ref": "sandbox-23987"
}
```

```json
{
  "challenge_id": "2afe247b-141f-4342-b917-7c9c4266f10d",
  "expires_at": "2026-10-28T19:30:42.705855234Z",
  "resend_available_at": "2026-10-28T19:25:43.705855234Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "788441",
  "sent_at": "2026-10-28T19:25:42.707616275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2afe247b-141f-4342-b917-7c9c4266f10d",
  "code": "788441",
  "device_ref": "sandbox-23987"
}
```

```json
{
  "session_id": "7482c952-1182-45af-a668-3bb71dbc3c6f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjQ0MiwiaWF0IjoxNzkzMjE1NTQyLCJqdGkiOiI4YTYwMGZmNi03ZTlmLTQzZWQtYTJlZi02MzFlYTQ2ZTdkMzAiLCJzaWQiOiI3NDgyYzk1Mi0xMTgyLTQ1YWYtYTY2OC0zYmI3MWRiYzNjNmYifQ.MH5kkdPY3ABD6BnWyuSpH0rSEqxPouklL71gSInzlP0",
  "access_expires_at": "2026-10-28T19:40:42.946583636Z",
  "refresh_token": "9Al-4VxJqR9tE7jQTGDwLX63LmFJ4WaVH_Fc4hfVKwQ",
  "refresh_expires_at": "2026-11-27T19:25:42.946184551Z",
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
  "device_ref": "sandbox-3762"
}
```

```json
{
  "challenge_id": "c3295046-f0ae-4871-a7c6-07eaad6b6b09",
  "expires_at": "2026-10-28T19:30:43.371650363Z",
  "resend_available_at": "2026-10-28T19:25:44.371650363Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "333022",
  "sent_at": "2026-10-28T19:25:43.373951078Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3295046-f0ae-4871-a7c6-07eaad6b6b09",
  "code": "333022",
  "device_ref": "sandbox-3762"
}
```

```json
{
  "session_id": "c17b9d15-5545-440b-94f2-29e95ea5cc82",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIxNjQ0MywiaWF0IjoxNzkzMjE1NTQzLCJqdGkiOiJhMDE1MGM4Ni05ZjRiLTQ2YmMtYmZhZS00OWFmZGJjZmI2OGMiLCJzaWQiOiJjMTdiOWQxNS01NTQ1LTQ0MGItOTRmMi0yOWU5NWVhNWNjODIifQ.muyFRPtqEBJ5nk9F6eQQnTkCO5DnQOuQFcLsxw0DE74",
  "access_expires_at": "2026-10-28T19:40:43.609424329Z",
  "refresh_token": "ucrYVgu0javvP0h7TtOAEY8HKAaBQaeykydnf0Isrb4",
  "refresh_expires_at": "2026-11-27T19:25:43.609001371Z",
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
  "phone": "+380695580843",
  "device_ref": "sandbox-6741"
}
```

```json
{
  "challenge_id": "91cf015d-0988-44e3-b2e4-c451ac65e7d6",
  "expires_at": "2026-10-28T19:30:44.035812918Z",
  "resend_available_at": "2026-10-28T19:25:45.035812918Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380695580843` → **200**

```json
{
  "phone": "+380695580843",
  "audience": "CLIENT",
  "code": "024315",
  "sent_at": "2026-10-28T19:25:44.037648692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91cf015d-0988-44e3-b2e4-c451ac65e7d6",
  "code": "024315",
  "device_ref": "sandbox-6741"
}
```

```json
{
  "session_id": "fad1f0b1-481d-4526-920c-75f652731562",
  "subject": {
    "type": "CLIENT",
    "id": "4b5381ad-eda0-4d00-b271-1c7d1847e252"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjUzODFhZC1lZGEwLTRkMDAtYjI3MS0xYzdkMTg0N2UyNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjE2NDQ0LCJpYXQiOjE3OTMyMTU1NDQsImp0aSI6ImRkY2NmYTdiLTlkMTctNGFkOS04YTRmLTEyNGZhNmM0NTIwOCIsInNpZCI6ImZhZDFmMGIxLTQ4MWQtNDUyNi05MjBjLTc1ZjY1MjczMTU2MiJ9.hWMHv5ClmXCTVfPh0AW5Nr57zX46bVSF4rwVzh8JMWI",
  "access_expires_at": "2026-10-28T19:40:44.269965546Z",
  "refresh_token": "LmblDY_VDw_l_ZK8s7-rLrtjTN9HgK5VIrxpEpx4JwI",
  "refresh_expires_at": "2026-11-27T19:25:44.269470838Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c08c233c-ac87-4030-83ca-12175e27eb0e",
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
  "id": "1c6b624d-54bf-4bb9-84d9-2db598c6a24a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T19:30:44.491940Z",
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
  "command_id": "65eb0211-ddd9-4ec5-a1d7-5b998c6b96af",
  "quote_id": "1c6b624d-54bf-4bb9-84d9-2db598c6a24a",
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
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
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
  "blizz_orders_total": 26,
  "blizz_orders_cancelled_total": 14,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 16,
  "blizz_dispatch_assigned_seconds_count": 15,
  "blizz_offers_total": 18,
  "blizz_dispatch_excluded_total": 9,
  "blizz_sms_sent_total": 67
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 15
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 10.232995
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 16
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.114472728
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 15.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 18.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 60.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/53a4e6c2-edde-4960-aa6b-4b1cfce929a5` → **200**

```json
{
  "id": "53a4e6c2-edde-4960-aa6b-4b1cfce929a5",
  "short_number": 26,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4b5381ad-eda0-4d00-b271-1c7d1847e252",
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
  "created_at": "2026-10-28T19:25:44.727979Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
