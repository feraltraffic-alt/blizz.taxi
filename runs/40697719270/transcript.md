# Sandbox transcript (2026-10-28T13:36:03Z, ed22511)

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
  "correlation_id": "44e87b31-91ac-4ad5-974b-51cd8d1f9c20"
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
  "session_id": "c316b2ad-5b98-4922-b5d0-930a44444814",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU0NzAsImlhdCI6MTc5MzE5NDU3MCwianRpIjoiZGRkMjkzNTktZTFjZS00YjhhLWIzZGEtNzg3M2NmNWRkMzA2Iiwic2lkIjoiYzMxNmIyYWQtNWI5OC00OTIyLWI1ZDAtOTMwYTQ0NDQ0ODE0In0.j5bXJMzt67eu1Pa1pAEnUKpwZ8CkfAljyFZkd8E5bgM",
  "access_expires_at": "2026-10-28T13:51:10.877024603Z",
  "refresh_token": "ywLAhsp6wgociJGeVy04irnM9mg4ck59HJVeUfQQDpE",
  "refresh_expires_at": "2026-10-29T01:36:10.874610586Z",
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
  "session_id": "201515c7-b72c-4ca0-a017-5f3411197c99",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU0NzIsImlhdCI6MTc5MzE5NDU3MiwianRpIjoiM2M2NWY1MTEtNWQwZC00MDhjLThhMTktMmQyYTFiYjk4ODU3Iiwic2lkIjoiMjAxNTE1YzctYjcyYy00Y2EwLWEwMTctNWYzNDExMTk3Yzk5In0.6p1vmqNBDErEiDsFDg66l6eDbI4IIPnH00H8KuQU7cM",
  "access_expires_at": "2026-10-28T13:51:12.462579601Z",
  "refresh_token": "Fj3yHQTIjDeZ9WdbaUDQIu_0-vqnejkD15gB5T3xESM",
  "refresh_expires_at": "2026-10-29T01:36:12.461353414Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "8e3334af-6f8a-4b1f-828a-249156ea139f",
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
  "id": "04925c72-9116-4309-a4e6-6a8818f9fce3",
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
  "created_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "created_at": "2026-10-28T13:36:12.79142Z",
  "updated_at": "2026-10-28T13:36:12.79142Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637879035",
  "device_ref": "sandbox-8741"
}
```

```json
{
  "challenge_id": "4cb6d018-5f7d-4c42-878a-e52c242c8a86",
  "expires_at": "2026-10-28T13:41:13.117283901Z",
  "resend_available_at": "2026-10-28T13:36:14.117283901Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637879035` → **200**

```json
{
  "phone": "+380637879035",
  "audience": "CLIENT",
  "code": "883918",
  "sent_at": "2026-10-28T13:36:13.126081305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cb6d018-5f7d-4c42-878a-e52c242c8a86",
  "code": "883918",
  "device_ref": "sandbox-8741"
}
```

```json
{
  "session_id": "ebbfc90e-635a-4aba-8c22-d76335a63806",
  "subject": {
    "type": "CLIENT",
    "id": "61332dd9-0701-485c-9887-19c8526fcb84"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTMzMmRkOS0wNzAxLTQ4NWMtOTg4Ny0xOWM4NTI2ZmNiODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NDczLCJpYXQiOjE3OTMxOTQ1NzMsImp0aSI6IjhkMGRlNjQ2LWMyOTktNDJkNi05NzlkLTM5ZjQ0ZjY5ODg5ZiIsInNpZCI6ImViYmZjOTBlLTYzNWEtNGFiYS04YzIyLWQ3NjMzNWE2MzgwNiJ9.dKVsEr_XRuhoWFYnMFdrZuY83PbRY1zjwikJGv0Cjzw",
  "access_expires_at": "2026-10-28T13:51:13.476732175Z",
  "refresh_token": "KzCFa9HQlW9uSUdXWGp5fe_z7QEcWeiRo_X3C5Fwjc0",
  "refresh_expires_at": "2026-11-27T13:36:13.475574111Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637879035` → **200**

```json
{
  "client_id": "61332dd9-0701-485c-9887-19c8526fcb84"
}
```

`POST /api/admin/v1/rider-wallets/61332dd9-0701-485c-9887-19c8526fcb84/top-ups` → **201**

```json
{
  "command_id": "fef5e21d-5bbf-451d-9b89-8cc52cf506d3",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "61332dd9-0701-485c-9887-19c8526fcb84",
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
      "id": "d34f64f0-f991-4167-a855-b6f7f290a523",
      "at": "2026-10-28T13:36:14.081821Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e2b70d65-388c-4fa4-8c63-38286beaf6f5",
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
  "id": "99f02ef0-b689-4cbd-8428-c9d37d7af61a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:41:14.663466Z",
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
      "id": "04925c72-9116-4309-a4e6-6a8818f9fce3",
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
  "device_ref": "sandbox-16707"
}
```

```json
{
  "challenge_id": "fca37655-ffbc-42c6-af04-e55b02de373f",
  "expires_at": "2026-10-28T13:41:15.004731571Z",
  "resend_available_at": "2026-10-28T13:36:16.004731571Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "754014",
  "sent_at": "2026-10-28T13:36:15.008916218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fca37655-ffbc-42c6-af04-e55b02de373f",
  "code": "754014",
  "device_ref": "sandbox-16707"
}
```

```json
{
  "session_id": "c3671047-0f0f-4c7a-96de-5b6646f75b10",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTQ3NSwiaWF0IjoxNzkzMTk0NTc1LCJqdGkiOiJiOTY1Nzc2OS01Njc2LTQ3MGEtODg3Zi05NzMxYjA4MmIyMTEiLCJzaWQiOiJjMzY3MTA0Ny0wZjBmLTRjN2EtOTZkZS01YjY2NDZmNzViMTAifQ.Bl38f3rCpM-Q8Bp4BqAbX5MgrtxeMDA46B1RefrC7oI",
  "access_expires_at": "2026-10-28T13:51:15.338842342Z",
  "refresh_token": "Yn1Iu0Yf775C57NPZw0sL--ahCLBGerTUc0Ns_lIIvw",
  "refresh_expires_at": "2026-11-27T13:36:15.337681611Z",
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
  "command_id": "8c2ebb91-8608-4aac-8996-55fa82ca11fc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:36:15Z",
    "sequence": 1793194575928
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559eeb61-fdc5-42dc-b874-48a5fa425499",
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
  "last_heartbeat_at": "2026-10-28T13:36:15.977089Z",
  "last_location_at": "2026-10-28T13:36:15.977089Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8c815129-5edb-4aca-89b0-5239fae87d82",
  "quote_id": "99f02ef0-b689-4cbd-8428-c9d37d7af61a",
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
  "id": "85a4b3f3-322e-4c01-b391-0c66de6440c1",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61332dd9-0701-485c-9887-19c8526fcb84",
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
  "created_at": "2026-10-28T13:36:16.343095Z",
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
  "client_id": "61332dd9-0701-485c-9887-19c8526fcb84",
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
      "id": "d34f64f0-f991-4167-a855-b6f7f290a523",
      "at": "2026-10-28T13:36:14.081821Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
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
    "id": "e524d13a-93e7-4b53-a066-4982f36b3e47",
    "order_id": "85a4b3f3-322e-4c01-b391-0c66de6440c1",
    "expires_at": "2026-10-28T13:36:31.360129Z",
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

`POST /api/driver/v1/offers/e524d13a-93e7-4b53-a066-4982f36b3e47/accept` → **200**

```json
{
  "command_id": "c690c0b4-5d0f-4d9f-a864-ddfb769f95d0"
}
```

```json
{
  "id": "4e1c8d52-6997-4d6d-92f3-a4242d402ee1",
  "order_id": "85a4b3f3-322e-4c01-b391-0c66de6440c1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "82247b72-a104-4266-9223-3493938f6ef7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "82247b72-a104-4266-9223-3493938f6ef7",
  "order_id": "85a4b3f3-322e-4c01-b391-0c66de6440c1",
  "assignment_id": "4e1c8d52-6997-4d6d-92f3-a4242d402ee1",
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

`POST /api/driver/v1/work-sessions/559eeb61-fdc5-42dc-b874-48a5fa425499/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:36:17Z",
    "sequence": 1793194577877
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559eeb61-fdc5-42dc-b874-48a5fa425499",
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
  "last_heartbeat_at": "2026-10-28T13:36:17.903499Z",
  "last_location_at": "2026-10-28T13:36:17.903499Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/82247b72-a104-4266-9223-3493938f6ef7/arrive` → **200**

```json
{
  "command_id": "da2350aa-9c50-4c5c-8c8c-25f36b07215d",
  "expected_version": 0
}
```

```json
{
  "id": "82247b72-a104-4266-9223-3493938f6ef7",
  "order_id": "85a4b3f3-322e-4c01-b391-0c66de6440c1",
  "assignment_id": "4e1c8d52-6997-4d6d-92f3-a4242d402ee1",
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
  "arrived_at": "2026-10-28T13:36:18.223119Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/82247b72-a104-4266-9223-3493938f6ef7/start` → **200**

```json
{
  "command_id": "71fa285e-7ad1-4b0d-813f-83825a43ed4a",
  "expected_version": 1
}
```

```json
{
  "id": "82247b72-a104-4266-9223-3493938f6ef7",
  "order_id": "85a4b3f3-322e-4c01-b391-0c66de6440c1",
  "assignment_id": "4e1c8d52-6997-4d6d-92f3-a4242d402ee1",
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
  "arrived_at": "2026-10-28T13:36:18.223119Z",
  "started_at": "2026-10-28T13:36:18.52414Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/82247b72-a104-4266-9223-3493938f6ef7/complete` → **200**

```json
{
  "command_id": "603b41ed-70b3-49d1-8dcd-463ce442ce99",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:36:18Z",
  "cash_received": true
}
```

```json
{
  "id": "82247b72-a104-4266-9223-3493938f6ef7",
  "order_id": "85a4b3f3-322e-4c01-b391-0c66de6440c1",
  "assignment_id": "4e1c8d52-6997-4d6d-92f3-a4242d402ee1",
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
  "arrived_at": "2026-10-28T13:36:18.223119Z",
  "started_at": "2026-10-28T13:36:18.52414Z",
  "completed_at": "2026-10-28T13:36:18.84752Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "61332dd9-0701-485c-9887-19c8526fcb84",
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
      "id": "89c1a911-923b-4f87-bb5d-cb5bc70e879b",
      "at": "2026-10-28T13:36:19.157472Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "85a4b3f3-322e-4c01-b391-0c66de6440c1"
    },
    {
      "id": "d34f64f0-f991-4167-a855-b6f7f290a523",
      "at": "2026-10-28T13:36:14.081821Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/04925c72-9116-4309-a4e6-6a8818f9fce3/archive` → **200**

```json
{
  "command_id": "96c941ae-c787-478d-83ff-b974b3287ec6",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "04925c72-9116-4309-a4e6-6a8818f9fce3",
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
  "created_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "created_at": "2026-10-28T13:36:12.79142Z",
  "updated_at": "2026-10-28T13:36:22.464038Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559eeb61-fdc5-42dc-b874-48a5fa425499",
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
  "last_heartbeat_at": "2026-10-28T13:36:17.903499Z",
  "last_location_at": "2026-10-28T13:36:17.903499Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/559eeb61-fdc5-42dc-b874-48a5fa425499/close` → **200**

```json
{
  "command_id": "73e84a93-f130-44e8-ac01-b2ca184fb34c",
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

Done: order 85a4b3f3-322e-4c01-b391-0c66de6440c1.

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
  "session_id": "4bb66ed8-c642-4f8c-803d-3086369f38e0",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU0ODMsImlhdCI6MTc5MzE5NDU4MywianRpIjoiNjQ3OWIyYzktZWMxMy00MzQxLWI4OGUtZWU5Nzg5MTJiZjFjIiwic2lkIjoiNGJiNjZlZDgtYzY0Mi00ZjhjLTgwM2QtMzA4NjM2OWYzOGUwIn0.EzdRabnMLesS7XjZeAhpYHgRHtXP4Efkqvg-objDkrA",
  "access_expires_at": "2026-10-28T13:51:23.672453764Z",
  "refresh_token": "NQPk2EDYW2vxLA6NrrYrHr_t8-1cQ0SHojQJCovAN5Q",
  "refresh_expires_at": "2026-10-29T01:36:23.671441291Z",
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
  "command_id": "b1f01595-05a7-48e3-959b-7e68f2cfe916",
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
  "session_id": "4d19eb1a-977b-4482-a2bc-f68bc34f1942",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU0ODQsImlhdCI6MTc5MzE5NDU4NCwianRpIjoiYzkxZTk0NTktNTkxZC00Mzc5LWJlNmItZGU5MjY4NjIzNTJjIiwic2lkIjoiNGQxOWViMWEtOTc3Yi00NDgyLWEyYmMtZjY4YmMzNGYxOTQyIn0.q1ulcONaf5F2ZLopDxeREeZM9KqUFZo1muV97HAcel4",
  "access_expires_at": "2026-10-28T13:51:24.847958041Z",
  "refresh_token": "c_swK5t4zrYbXwlo3lYT4IlLcU-msABMEUwiGAo4ENo",
  "refresh_expires_at": "2026-10-29T01:36:24.847137349Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.255331343",
    "linkedid": "1730052700.255331343",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676522619"
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
    "id": "1730052700.255331343",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "1e8fae49-cb35-4139-b112-82ce665a01af",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676522619",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:36:25.131544Z",
      "answered_at": null,
      "ended_at": "2026-10-28T13:36:25.160429Z",
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
    "id": "1730052600.582116974",
    "linkedid": "1730052600.582116974",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676522619"
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
      "id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676522619",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:36:25.496121Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/b97c1ad4-9260-43eb-bc31-463cec548e46/answer` → **200**

```json
{
  "command_id": "5f04991e-addb-45e5-a2c7-06037587f73c"
}
```

```json
{
  "id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676522619",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "order_ids": [],
  "started_at": "2026-10-28T13:36:25.496121Z",
  "answered_at": "2026-10-28T13:36:25.82534Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.582116974",
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
    "id": "1730052600.582116974",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676522619",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [],
      "started_at": "2026-10-28T13:36:25.496121Z",
      "answered_at": "2026-10-28T13:36:25.82534Z",
      "ended_at": "2026-10-28T13:36:26.135328Z",
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
      "id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676522619",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [],
      "started_at": "2026-10-28T13:36:25.496121Z",
      "answered_at": "2026-10-28T13:36:25.82534Z",
      "ended_at": "2026-10-28T13:36:26.135328Z",
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
      "id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676522619",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [],
      "started_at": "2026-10-28T13:36:25.496121Z",
      "answered_at": "2026-10-28T13:36:25.82534Z",
      "ended_at": "2026-10-28T13:36:26.135328Z",
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
      "id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676522619",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [],
      "started_at": "2026-10-28T13:36:25.496121Z",
      "answered_at": "2026-10-28T13:36:25.82534Z",
      "ended_at": "2026-10-28T13:36:26.135328Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:36:31.94147Z"
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
      "id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676522619",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [],
      "started_at": "2026-10-28T13:36:25.496121Z",
      "answered_at": "2026-10-28T13:36:25.82534Z",
      "ended_at": "2026-10-28T13:36:26.135328Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:36:31.94147Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/b97c1ad4-9260-43eb-bc31-463cec548e46/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b97c1ad4-9260-43eb-bc31-463cec548e46/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b97c1ad4-9260-43eb-bc31-463cec548e46` → **200**

```json
{
  "changes": [
    {
      "id": "6929be31-cfec-4f20-be6a-da8486805006",
      "occurred_at": "2026-10-28T13:36:33.645486Z",
      "actor_type": "STAFF",
      "actor_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1abf3ad9-e87c-4dc6-80f1-96d7df2da3d9\", \"order_ids\": []}",
      "correlation_id": "bdf19a53-6ce4-47ca-b4ce-65ac49f2a92c"
    },
    {
      "id": "89cd7114-d2f7-46ce-a355-d150c909f381",
      "occurred_at": "2026-10-28T13:36:33.60727Z",
      "actor_type": "STAFF",
      "actor_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1abf3ad9-e87c-4dc6-80f1-96d7df2da3d9\", \"order_ids\": []}",
      "correlation_id": "b2d9d8b9-f4e8-4f7d-82a1-1a82aac318bb"
    }
  ]
}
```

Done: call b97c1ad4-9260-43eb-bc31-463cec548e46 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21227"
}
```

```json
{
  "challenge_id": "c644c528-27b7-48ba-9ead-35e83444540c",
  "expires_at": "2026-10-28T13:41:33.986516139Z",
  "resend_available_at": "2026-10-28T13:36:34.986516139Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "327171",
  "sent_at": "2026-10-28T13:36:33.990368899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c644c528-27b7-48ba-9ead-35e83444540c",
  "code": "327171",
  "device_ref": "sandbox-21227"
}
```

```json
{
  "session_id": "41e8a415-034b-4085-96cf-b7eae84ab652",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTQ5NCwiaWF0IjoxNzkzMTk0NTk0LCJqdGkiOiI5MTgxMDdjMC1mNDVhLTQyNGEtOGU0Ni1iYWIzNDY4NWU3OTUiLCJzaWQiOiI0MWU4YTQxNS0wMzRiLTQwODUtOTZjZi1iN2VhZTg0YWI2NTIifQ.MAAX3f6YY19kTZ5jAy7xhWX3ECabU3OdztLufp7e2hM",
  "access_expires_at": "2026-10-28T13:51:34.310801713Z",
  "refresh_token": "GVpUpnk6P_hYxIfr9v0ludVMzur4ROouhJtb9JvGx5s",
  "refresh_expires_at": "2026-11-27T13:36:34.310011989Z",
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
  "command_id": "9aea980b-8004-4d8a-88e5-8423336a2886",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:36:34Z",
    "sequence": 1793194594872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "82005456-aa92-471d-8158-1741ed421547",
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
  "last_heartbeat_at": "2026-10-28T13:36:34.893945Z",
  "last_location_at": "2026-10-28T13:36:34.893945Z",
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
  "session_id": "773f7cbc-5d42-4e26-92de-1f856fe1ef56",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU0OTUsImlhdCI6MTc5MzE5NDU5NSwianRpIjoiODM4MTU3YTktNGY4ZS00ZWY0LTllOTAtMmFjMmMzNDZjYWExIiwic2lkIjoiNzczZjdjYmMtNWQ0Mi00ZTI2LTkyZGUtMWY4NTZmZTFlZjU2In0.aat63YZXRjorNApzD_3wAQLCVAmFyvsOLU9z17t0vHA",
  "access_expires_at": "2026-10-28T13:51:35.478353135Z",
  "refresh_token": "Usrqs4iBXF_CqLSvXnn_wTqLHYWmLrXOlzCmR18Yk_4",
  "refresh_expires_at": "2026-10-29T01:36:35.47745159Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "11347089-1228-43e2-8f55-d7dd19c9adfe",
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
  "id": "76602458-02f7-4ded-bd56-b9ac9f0f1a06",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:41:35.772440Z",
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
  "command_id": "b0638377-ad12-4bb0-a2c6-8aabd08559b2",
  "quote_id": "76602458-02f7-4ded-bd56-b9ac9f0f1a06",
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
    "phone": "+380670142466"
  }
}
```

```json
{
  "id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
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
  "created_at": "2026-10-28T13:36:36.090326Z",
  "caller": {
    "name": "Олена",
    "phone": "+380670142466"
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
    "id": "745f2886-e46f-4a01-b248-5faf9150a9ca",
    "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
    "expires_at": "2026-10-28T13:36:51.096683Z",
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

`POST /api/driver/v1/offers/745f2886-e46f-4a01-b248-5faf9150a9ca/accept` → **200**

```json
{
  "command_id": "8d09538f-fb76-46b4-b3f8-5b0b4d20f8ff"
}
```

```json
{
  "id": "84e33a24-222d-4368-b1a1-2b642486cb71",
  "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4fc2b39f-1137-4cad-b711-ad221bfb857a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[
  {
    "phone": "+380670142466",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:38.116943701Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[
  {
    "phone": "+380670142466",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:38.116943701Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[
  {
    "phone": "+380670142466",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:38.116943701Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4fc2b39f-1137-4cad-b711-ad221bfb857a",
  "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
  "assignment_id": "84e33a24-222d-4368-b1a1-2b642486cb71",
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
    "phone": "+380670142466"
  }
}
```

`POST /api/driver/v1/work-sessions/82005456-aa92-471d-8158-1741ed421547/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:36:39Z",
    "sequence": 1793194599396
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "82005456-aa92-471d-8158-1741ed421547",
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
  "last_heartbeat_at": "2026-10-28T13:36:39.418858Z",
  "last_location_at": "2026-10-28T13:36:39.418858Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4fc2b39f-1137-4cad-b711-ad221bfb857a/arrive` → **200**

```json
{
  "command_id": "114cd9e9-0a71-4cbc-b77f-fec36f65f519",
  "expected_version": 0
}
```

```json
{
  "id": "4fc2b39f-1137-4cad-b711-ad221bfb857a",
  "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
  "assignment_id": "84e33a24-222d-4368-b1a1-2b642486cb71",
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
  "arrived_at": "2026-10-28T13:36:39.706544Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670142466"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[
  {
    "phone": "+380670142466",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:38.116943701Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[
  {
    "phone": "+380670142466",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:38.116943701Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[
  {
    "phone": "+380670142466",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:38.116943701Z"
  },
  {
    "phone": "+380670142466",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:41.127198517Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[
  {
    "phone": "+380670142466",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:38.116943701Z"
  },
  {
    "phone": "+380670142466",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:41.127198517Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670142466` → **200**

```json
[
  {
    "phone": "+380670142466",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:38.116943701Z"
  },
  {
    "phone": "+380670142466",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T13:36:41.127198517Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/4fc2b39f-1137-4cad-b711-ad221bfb857a/start` → **200**

```json
{
  "command_id": "e5eb27d0-33a2-42fb-be2d-a1f9dfe6b163",
  "expected_version": 1
}
```

```json
{
  "id": "4fc2b39f-1137-4cad-b711-ad221bfb857a",
  "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
  "assignment_id": "84e33a24-222d-4368-b1a1-2b642486cb71",
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
  "arrived_at": "2026-10-28T13:36:39.706544Z",
  "started_at": "2026-10-28T13:36:42.152023Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670142466"
  }
}
```

`POST /api/driver/v1/trips/4fc2b39f-1137-4cad-b711-ad221bfb857a/complete` → **200**

```json
{
  "command_id": "ddf7ad88-9bed-4061-9a46-3be07f7f6179",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:36:42Z",
  "cash_received": true
}
```

```json
{
  "id": "4fc2b39f-1137-4cad-b711-ad221bfb857a",
  "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
  "assignment_id": "84e33a24-222d-4368-b1a1-2b642486cb71",
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
  "arrived_at": "2026-10-28T13:36:39.706544Z",
  "started_at": "2026-10-28T13:36:42.152023Z",
  "completed_at": "2026-10-28T13:36:42.45622Z",
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
  "session_id": "82005456-aa92-471d-8158-1741ed421547",
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
  "last_heartbeat_at": "2026-10-28T13:36:39.418858Z",
  "last_location_at": "2026-10-28T13:36:39.418858Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/82005456-aa92-471d-8158-1741ed421547/close` → **200**

```json
{
  "command_id": "a476c3dc-342d-4a84-960d-2aefbbedc832",
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
  "phone": "+380635680275",
  "device_ref": "sandbox-6914"
}
```

```json
{
  "challenge_id": "535d749f-316f-4426-9000-d43b8b4da190",
  "expires_at": "2026-10-28T13:41:43.347312662Z",
  "resend_available_at": "2026-10-28T13:36:44.347312662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635680275` → **200**

```json
{
  "phone": "+380635680275",
  "audience": "CLIENT",
  "code": "240504",
  "sent_at": "2026-10-28T13:36:43.352276331Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "535d749f-316f-4426-9000-d43b8b4da190",
  "code": "240504",
  "device_ref": "sandbox-6914"
}
```

```json
{
  "session_id": "10f2e04a-92dc-4dc8-8891-496f1c4dfa2a",
  "subject": {
    "type": "CLIENT",
    "id": "190e484e-1865-44e9-a74c-414fa911a91f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOTBlNDg0ZS0xODY1LTQ0ZTktYTc0Yy00MTRmYTkxMWE5MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTAzLCJpYXQiOjE3OTMxOTQ2MDMsImp0aSI6IjU3MmY5NDg4LWFmYTQtNDhiYy04NzJlLTM4Yzk3NTZmMzY5MyIsInNpZCI6IjEwZjJlMDRhLTkyZGMtNGRjOC04ODkxLTQ5NmYxYzRkZmEyYSJ9.5ETS9RgVXm9w-BT5CHBs5JzMeKvBARhRylrcYOFtnxw",
  "access_expires_at": "2026-10-28T13:51:43.660343964Z",
  "refresh_token": "omQuzruWwMOJ2uGCShOgQYMIPdYfG0pvOkwgxutDnRw",
  "refresh_expires_at": "2026-11-27T13:36:43.659662485Z",
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
  "device_ref": "sandbox-26722"
}
```

```json
{
  "challenge_id": "d0bee045-4576-42df-b4ea-b22662bc1ec9",
  "expires_at": "2026-10-28T13:41:44.220498352Z",
  "resend_available_at": "2026-10-28T13:36:45.220498352Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "338853",
  "sent_at": "2026-10-28T13:36:44.223714326Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0bee045-4576-42df-b4ea-b22662bc1ec9",
  "code": "338853",
  "device_ref": "sandbox-26722"
}
```

```json
{
  "session_id": "0c6ba420-e80e-48a5-9069-fa65ce80bd42",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTUwNCwiaWF0IjoxNzkzMTk0NjA0LCJqdGkiOiI4MGI1NDMwMy00ZjEwLTRiZDEtYjQ4Yi03OTE5NzU0MDRkNDgiLCJzaWQiOiIwYzZiYTQyMC1lODBlLTQ4YTUtOTA2OS1mYTY1Y2U4MGJkNDIifQ.bpHlAjswKprd-uY7LvGv89251caGcvoXWTjYzUb_148",
  "access_expires_at": "2026-10-28T13:51:44.530190744Z",
  "refresh_token": "gtDpS-Uu_fm7AnrGB6N_G1qXO8F2AYtimJekJrWIP_U",
  "refresh_expires_at": "2026-11-27T13:36:44.529410415Z",
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
  "session_id": "a62baff0-d733-4564-ac2b-f113c780edde",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1MDUsImlhdCI6MTc5MzE5NDYwNSwianRpIjoiMmQwZWYyYjAtYTQxZS00NzVlLWIyOTAtODNhY2I2ZGMyMzc5Iiwic2lkIjoiYTYyYmFmZjAtZDczMy00NTY0LWFjMmItZjExM2M3ODBlZGRlIn0.02GuM3qraQea-K1fvXks_WKDpEp__NgCzw5xeF0v6uc",
  "access_expires_at": "2026-10-28T13:51:45.368272163Z",
  "refresh_token": "OWk4Jwsky3K0dMeNWb4O-OAFYLmHCc3XBQnWZxcSnyM",
  "refresh_expires_at": "2026-10-29T01:36:45.367650965Z",
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
  "session_id": "6b097bc4-200f-4f8c-98c0-c34641b54681",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1MDUsImlhdCI6MTc5MzE5NDYwNSwianRpIjoiYjNkYzllODEtYWEwMC00ZWYxLTgxZTYtODk4ZGE5Nzg1NmVlIiwic2lkIjoiNmIwOTdiYzQtMjAwZi00ZjhjLTk4YzAtYzM0NjQxYjU0NjgxIn0.2jXmm-Hd0KZVBD0bEDBDoFiGrc16qOAFZm5CLktwyY0",
  "access_expires_at": "2026-10-28T13:51:45.93714796Z",
  "refresh_token": "g4FlP3UlTVaW5LnE7ELQQoDqfIIEQvkePNFyb335yiY",
  "refresh_expires_at": "2026-10-29T01:36:45.936542192Z",
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
  "command_id": "e914b2e8-8333-410e-a2f3-992fa90039bb",
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
  "id": "690d1460-152c-4d15-ae1b-b8e877c1e04a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:41:46.504620Z",
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
  "command_id": "e9a33406-3a3c-4001-93f4-2f3edab819b0",
  "quote_id": "690d1460-152c-4d15-ae1b-b8e877c1e04a",
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
  "id": "06ea2d05-e08e-4089-b27f-27e19a412793",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "190e484e-1865-44e9-a74c-414fa911a91f",
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
  "created_at": "2026-10-28T13:36:46.804943Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/06ea2d05-e08e-4089-b27f-27e19a412793` → **200**

```json
{
  "id": "06ea2d05-e08e-4089-b27f-27e19a412793",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "190e484e-1865-44e9-a74c-414fa911a91f",
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
  "created_at": "2026-10-28T13:36:46.804943Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/06ea2d05-e08e-4089-b27f-27e19a412793/cancel` → **200**

```json
{
  "command_id": "96a33df4-ef57-4533-b7fe-940896d1229f",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "06ea2d05-e08e-4089-b27f-27e19a412793",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "190e484e-1865-44e9-a74c-414fa911a91f",
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
  "created_at": "2026-10-28T13:36:46.804943Z",
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
  "command_id": "83be5a27-ec6f-4955-97bb-05a91d22fb7f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:36:48Z",
    "sequence": 1793194608417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "81adc930-259f-4b46-bd08-6b02be407452",
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
  "last_heartbeat_at": "2026-10-28T13:36:48.063634Z",
  "last_location_at": "2026-10-28T13:36:48.063634Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22704"
}
```

```json
{
  "challenge_id": "09ffe225-f9c1-4bb8-90a7-cf9428bc232f",
  "expires_at": "2026-10-28T13:41:48.366310367Z",
  "resend_available_at": "2026-10-28T13:36:49.366310367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "756082",
  "sent_at": "2026-10-28T13:36:48.36975724Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09ffe225-f9c1-4bb8-90a7-cf9428bc232f",
  "code": "756082",
  "device_ref": "sandbox-22704"
}
```

```json
{
  "session_id": "c12dc7db-16af-401b-9e01-3b3a630ae55e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTUwOCwiaWF0IjoxNzkzMTk0NjA4LCJqdGkiOiI4ZWY1ZDMwZi1iNTU3LTRkMWQtOTU3ZS04Y2MwYzI3MzAxNjYiLCJzaWQiOiJjMTJkYzdkYi0xNmFmLTQwMWItOWUwMS0zYjNhNjMwYWU1NWUifQ.69wQPtQeDuHZ6MP6MJ_V_py8LyWYA2TEFM5OBbOTHBY",
  "access_expires_at": "2026-10-28T13:51:48.676881645Z",
  "refresh_token": "8CT-8kvk7JNzpHHB3aGfWQzkZZMy5SI9Lkngu46alUg",
  "refresh_expires_at": "2026-11-27T13:36:48.676212548Z",
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
  "command_id": "cd96abd9-1cd7-4dcd-bdb8-e1f778de4dbf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:36:49Z",
    "sequence": 1793194609238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "209b4c14-697a-4f76-ac9e-9c4bc4398c94",
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
  "last_heartbeat_at": "2026-10-28T13:36:49.259428Z",
  "last_location_at": "2026-10-28T13:36:49.259428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c99aa452-13df-497a-96a2-f0a29b163d88",
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
  "id": "4b94a599-fde3-46bc-b0ee-b4c695c2d975",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:41:49.560660Z",
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
  "command_id": "b6095830-2eb9-47d1-9bf3-a7b4d5eae6a5",
  "quote_id": "4b94a599-fde3-46bc-b0ee-b4c695c2d975",
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
  "id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "190e484e-1865-44e9-a74c-414fa911a91f",
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
  "created_at": "2026-10-28T13:36:49.873628Z",
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
    "id": "25609032-7cdb-43a3-bd76-a7b9c8529d5e",
    "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
    "expires_at": "2026-10-28T13:37:04.87787Z",
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

`POST /api/driver/v1/offers/25609032-7cdb-43a3-bd76-a7b9c8529d5e/accept` → **200**

```json
{
  "command_id": "35178b42-4002-435e-b40e-63f41800243c"
}
```

```json
{
  "id": "2a18a1ef-dab7-4709-98d2-d35777f968a4",
  "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "70f25f01-f3f4-4223-9236-e2d6dbfafca4",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "70f25f01-f3f4-4223-9236-e2d6dbfafca4",
  "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
  "assignment_id": "2a18a1ef-dab7-4709-98d2-d35777f968a4",
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

`POST /api/driver/v1/trips/70f25f01-f3f4-4223-9236-e2d6dbfafca4/cancel` → **200**

```json
{
  "command_id": "fd0afaa8-b0b7-450f-9076-b5a5ed6968fa",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "70f25f01-f3f4-4223-9236-e2d6dbfafca4",
  "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
  "assignment_id": "2a18a1ef-dab7-4709-98d2-d35777f968a4",
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

`GET /api/rider/v1/orders/51fceb19-c4ef-45e8-b2f8-cedb24fa8a11` → **200**

```json
{
  "id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "190e484e-1865-44e9-a74c-414fa911a91f",
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
    "id": "2a18a1ef-dab7-4709-98d2-d35777f968a4",
    "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "70f25f01-f3f4-4223-9236-e2d6dbfafca4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:36:49.873628Z",
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
    "id": "0baeac38-49e5-4f75-b65b-98e6c42103fe",
    "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
    "expires_at": "2026-10-28T13:37:06.073944Z",
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

`POST /api/driver/v1/offers/0baeac38-49e5-4f75-b65b-98e6c42103fe/accept` → **200**

```json
{
  "command_id": "978c89c7-6f0d-48d5-ae09-03ec12f5d680"
}
```

```json
{
  "id": "e4c4e9d9-0ee5-4327-b197-f0d94a039265",
  "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e62be8c-43f7-46fb-b7c8-b6dfad27b0c2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e62be8c-43f7-46fb-b7c8-b6dfad27b0c2",
  "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
  "assignment_id": "e4c4e9d9-0ee5-4327-b197-f0d94a039265",
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

`POST /api/driver/v1/trips/3e62be8c-43f7-46fb-b7c8-b6dfad27b0c2/cancel` → **200**

```json
{
  "command_id": "deaa4726-6c0e-46f1-9064-b90d3c9b3654",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "3e62be8c-43f7-46fb-b7c8-b6dfad27b0c2",
  "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
  "assignment_id": "e4c4e9d9-0ee5-4327-b197-f0d94a039265",
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
    "id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:36:49.873628Z",
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
    "id": "06ea2d05-e08e-4089-b27f-27e19a412793",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:36:46.804943Z",
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

`GET /api/operator/v1/orders/51fceb19-c4ef-45e8-b2f8-cedb24fa8a11/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:36:49.874392Z",
      "actor": {
        "type": "CLIENT",
        "id": "190e484e-1865-44e9-a74c-414fa911a91f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
        "quote_id": "4b94a599-fde3-46bc-b0ee-b4c695c2d975",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "59d4075a-8d3a-4d4f-a9e3-7d78cd3c34a6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:36:49.876728Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
        "attempt_id": "dfe3849e-ea02-48d1-986c-78c57c2118e8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "59d4075a-8d3a-4d4f-a9e3-7d78cd3c34a6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:36:49.885072Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "25609032-7cdb-43a3-bd76-a7b9c8529d5e",
        "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "59d4075a-8d3a-4d4f-a9e3-7d78cd3c34a6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:36:50.485903Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "25609032-7cdb-43a3-bd76-a7b9c8529d5e",
        "order_id": "51fceb19-c4ef-45e8-b2f8-cedb24fa8a11",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "2a18a1ef-dab7-4709-98d2-d35777f968a4"
      },
      "correlation_id": "99b56424-0e03-4685-a55b-b7dbce44f6bc"
```

Done: orders 06ea2d05-e08e-4089-b27f-27e19a412793, 51fceb19-c4ef-45e8-b2f8-cedb24fa8a11.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738907583",
  "device_ref": "sandbox-10959"
}
```

```json
{
  "challenge_id": "d0118e59-3de9-4401-b5b2-8c30efe6492c",
  "expires_at": "2026-10-28T13:41:53.488809654Z",
  "resend_available_at": "2026-10-28T13:36:54.488809654Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738907583` → **200**

```json
{
  "phone": "+380738907583",
  "audience": "CLIENT",
  "code": "271648",
  "sent_at": "2026-10-28T13:36:53.491790897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0118e59-3de9-4401-b5b2-8c30efe6492c",
  "code": "271648",
  "device_ref": "sandbox-10959"
}
```

```json
{
  "session_id": "a629c59d-1d5f-4c2c-946a-bfc3034c70cb",
  "subject": {
    "type": "CLIENT",
    "id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOGJjOTEyMS03NDVkLTRjNWItOGY3MS0yNjRhYmU1ZmZkMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTEzLCJpYXQiOjE3OTMxOTQ2MTMsImp0aSI6Ijk4YjU5ZTA4LTNlMjEtNGVmMS1hMTcwLWM5YmU1YzY0NDVkNSIsInNpZCI6ImE2MjljNTlkLTFkNWYtNGMyYy05NDZhLWJmYzMwMzRjNzBjYiJ9.8_OqLHOvxx5QIz9ph-NEYC0CkCSYnf5osZdGjdznKrA",
  "access_expires_at": "2026-10-28T13:51:53.802387069Z",
  "refresh_token": "HVYuFDbZwSro1YFgOeoRVJEOvrBk13xDEN0yVXmRFk8",
  "refresh_expires_at": "2026-11-27T13:36:53.801758809Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "21287a47-826e-4d33-89da-07f0595e1aaa",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ea5da106-c30f-4ef6-9a66-c72b28ab96ec",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ea5da106-c30f-4ef6-9a66-c72b28ab96ec",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a949051ecce7de2231ca6636f6db0f3d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ea5da106-c30f-4ef6-9a66-c72b28ab96ec",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738907583"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ea5da106-c30f-4ef6-9a66-c72b28ab96ec",
  "expires_at": "2026-10-28T14:06:54.094572Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ea5da106-c30f-4ef6-9a66-c72b28ab96ec` → **200**

```json
{
  "id": "ea5da106-c30f-4ef6-9a66-c72b28ab96ec",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:06:54.094572Z",
  "card": {
    "id": "7e7278e2-ad76-42f8-97af-bd28911bf84e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5303",
    "card_type": "Visa",
    "created_at": "2026-10-28T13:36:54.409734Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "7e7278e2-ad76-42f8-97af-bd28911bf84e",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5303",
      "card_type": "Visa",
      "created_at": "2026-10-28T13:36:54.409734Z"
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
  "device_ref": "sandbox-11029"
}
```

```json
{
  "challenge_id": "7d1fbab8-a18c-4407-b6bd-bde69a46a448",
  "expires_at": "2026-10-28T13:41:54.9997137Z",
  "resend_available_at": "2026-10-28T13:36:55.9997137Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "415248",
  "sent_at": "2026-10-28T13:36:55.002664217Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d1fbab8-a18c-4407-b6bd-bde69a46a448",
  "code": "415248",
  "device_ref": "sandbox-11029"
}
```

```json
{
  "session_id": "e54f077c-634d-4f20-bbea-82bf5ae3f642",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTUxNSwiaWF0IjoxNzkzMTk0NjE1LCJqdGkiOiI0NWI2MDBjMy0zOTc0LTQwZTQtYTI5ZC0zMDhlYmFkZTdlYWUiLCJzaWQiOiJlNTRmMDc3Yy02MzRkLTRmMjAtYmJlYS04MmJmNWFlM2Y2NDIifQ.2eovelpY3G_ArUIH-Se56NrXwJp4bBYs-UBNrhjmcVg",
  "access_expires_at": "2026-10-28T13:51:55.317982667Z",
  "refresh_token": "S4ntJBjuHKnbjjeXgVdv4CL2RaTrrWU2PPFYs6McW0w",
  "refresh_expires_at": "2026-11-27T13:36:55.317358053Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "209b4c14-697a-4f76-ac9e-9c4bc4398c94",
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
  "last_heartbeat_at": "2026-10-28T13:36:49.259428Z",
  "last_location_at": "2026-10-28T13:36:49.259428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/209b4c14-697a-4f76-ac9e-9c4bc4398c94/handover` → **200**

```json
{
  "command_id": "c6b3f5be-e33d-4139-a855-1f839c0ddfe5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "209b4c14-697a-4f76-ac9e-9c4bc4398c94",
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
  "last_heartbeat_at": "2026-10-28T13:36:49.259428Z",
  "last_location_at": "2026-10-28T13:36:49.259428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/209b4c14-697a-4f76-ac9e-9c4bc4398c94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:36:56Z",
    "sequence": 1793194616180
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "209b4c14-697a-4f76-ac9e-9c4bc4398c94",
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
  "last_heartbeat_at": "2026-10-28T13:36:56.202968Z",
  "last_location_at": "2026-10-28T13:36:56.202968Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5856d4a2-740c-4e12-90ca-d2925e693955",
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
  "id": "18fa8331-0318-49a1-9532-3615b6676fe5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:41:56.497826Z",
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
  "command_id": "98752db3-c05a-4e40-8ceb-f0961a48a0d7",
  "quote_id": "18fa8331-0318-49a1-9532-3615b6676fe5",
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
  "id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
  "created_at": "2026-10-28T13:36:56.797925Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f834960d-5ea1-4ae2-be2d-75d4b0e883a1` → **200**

```json
{
  "id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
  "created_at": "2026-10-28T13:36:56.797925Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f834960d-5ea1-4ae2-be2d-75d4b0e883a1` → **200**

```json
{
  "id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
  "created_at": "2026-10-28T13:36:56.797925Z",
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
    "id": "cacae0d2-07ad-46ab-bab2-1b01d12d6dce",
    "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
    "expires_at": "2026-10-28T13:37:12.449608Z",
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

`POST /api/driver/v1/offers/cacae0d2-07ad-46ab-bab2-1b01d12d6dce/accept` → **200**

```json
{
  "command_id": "29c66137-67d7-4614-b509-b12cef9caa5e"
}
```

```json
{
  "id": "9a80c9cc-3765-45c9-b15f-3f8f19462d1a",
  "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "808158a3-dc92-4a96-a0e0-7e573f73d890",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "808158a3-dc92-4a96-a0e0-7e573f73d890",
  "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "assignment_id": "9a80c9cc-3765-45c9-b15f-3f8f19462d1a",
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

`POST /api/driver/v1/work-sessions/209b4c14-697a-4f76-ac9e-9c4bc4398c94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:36:59Z",
    "sequence": 1793194619568
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "209b4c14-697a-4f76-ac9e-9c4bc4398c94",
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
  "last_heartbeat_at": "2026-10-28T13:36:59.590491Z",
  "last_location_at": "2026-10-28T13:36:59.590491Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/808158a3-dc92-4a96-a0e0-7e573f73d890/arrive` → **200**

```json
{
  "command_id": "46e2a2c7-3416-4b62-90fe-bacd6044f41e",
  "expected_version": 0
}
```

```json
{
  "id": "808158a3-dc92-4a96-a0e0-7e573f73d890",
  "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "assignment_id": "9a80c9cc-3765-45c9-b15f-3f8f19462d1a",
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
  "arrived_at": "2026-10-28T13:36:59.887959Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/808158a3-dc92-4a96-a0e0-7e573f73d890/start` → **200**

```json
{
  "command_id": "b2f85043-250d-40c8-80d1-66a1be6a96cc",
  "expected_version": 1
}
```

```json
{
  "id": "808158a3-dc92-4a96-a0e0-7e573f73d890",
  "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "assignment_id": "9a80c9cc-3765-45c9-b15f-3f8f19462d1a",
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
  "arrived_at": "2026-10-28T13:36:59.887959Z",
  "started_at": "2026-10-28T13:37:00.195969Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/808158a3-dc92-4a96-a0e0-7e573f73d890/complete` → **200**

```json
{
  "command_id": "64d5dec5-068d-45bd-932c-c3f8e2ff6755",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:37:00Z",
  "cash_received": true
}
```

```json
{
  "id": "808158a3-dc92-4a96-a0e0-7e573f73d890",
  "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "assignment_id": "9a80c9cc-3765-45c9-b15f-3f8f19462d1a",
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
  "arrived_at": "2026-10-28T13:36:59.887959Z",
  "started_at": "2026-10-28T13:37:00.195969Z",
  "completed_at": "2026-10-28T13:37:00.498287Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f834960d-5ea1-4ae2-be2d-75d4b0e883a1` → **200**

```json
{
  "id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
    "id": "9a80c9cc-3765-45c9-b15f-3f8f19462d1a",
    "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "808158a3-dc92-4a96-a0e0-7e573f73d890",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:36:56.797925Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f834960d-5ea1-4ae2-be2d-75d4b0e883a1` → **200**

```json
{
  "id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
    "id": "9a80c9cc-3765-45c9-b15f-3f8f19462d1a",
    "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "808158a3-dc92-4a96-a0e0-7e573f73d890",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:36:56.797925Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f834960d-5ea1-4ae2-be2d-75d4b0e883a1` → **200**

```json
{
  "id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
    "id": "9a80c9cc-3765-45c9-b15f-3f8f19462d1a",
    "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "808158a3-dc92-4a96-a0e0-7e573f73d890",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:36:56.797925Z",
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
      "id": "5dc88a9f-e652-4ef6-90d0-1e8ab21abf00",
      "at": "2026-10-28T13:37:01.516006Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/f834960d-5ea1-4ae2-be2d-75d4b0e883a1/tip` → **200**

```json
{
  "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
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
  "available_until": "2026-10-29T13:37:00.498287Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f834960d-5ea1-4ae2-be2d-75d4b0e883a1/tip` → **201**

```json
{
  "command_id": "e6f5970f-8314-4ab9-a812-561236f64b58",
  "amount_minor": 2500
}
```

```json
{
  "id": "3c53c562-376d-4d27-8c8e-e94b31319f23",
  "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:37:04.523465Z"
}
```

`GET /api/rider/v1/orders/f834960d-5ea1-4ae2-be2d-75d4b0e883a1/tip` → **200**

```json
{
  "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
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
  "available_until": "2026-10-29T13:37:00.498287Z",
  "open": false,
  "tip": {
    "id": "3c53c562-376d-4d27-8c8e-e94b31319f23",
    "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:37:04.523465Z"
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
      "id": "5dc88a9f-e652-4ef6-90d0-1e8ab21abf00",
      "at": "2026-10-28T13:37:01.516006Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
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
      "id": "2633964b-9bdb-4074-a798-2c2a44e32ceb",
      "at": "2026-10-28T13:37:05.56764Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
      "counterpart_id": null
    },
    {
      "id": "5dc88a9f-e652-4ef6-90d0-1e8ab21abf00",
      "at": "2026-10-28T13:37:01.516006Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "235b1839-f6b3-4faf-93c5-cc481de80fdb",
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
  "id": "fe2f0381-1cb2-42de-8d60-0fe5f036717e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:42:06.641021Z",
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
  "session_id": "27cdf038-7d6e-493b-8d92-5c012cb2bd62",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1MjcsImlhdCI6MTc5MzE5NDYyNywianRpIjoiMjU1MWFkMjgtMGExNi00NTc5LWJhZWUtMDM1YTBjMDQ5YWZmIiwic2lkIjoiMjdjZGYwMzgtN2Q2ZS00OTNiLThkOTItNWMwMTJjYjJiZDYyIn0.NK43ZfwhGOI3jJcnDx-_tYCkDznYc4OzOY_yD_qfQ_0",
  "access_expires_at": "2026-10-28T13:52:07.231698131Z",
  "refresh_token": "f3anG-4L-r-loVrBt06X3yRgrB9KlqlaGX6yh2lxrKk",
  "refresh_expires_at": "2026-10-29T01:37:07.231086883Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738907583` → **200**

```json
{
  "client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c"
}
```

`POST /api/admin/v1/rider-wallets/b8bc9121-745d-4c5b-8f71-264abe5ffd2c/top-ups` → **201**

```json
{
  "command_id": "d40c0487-0517-454b-af85-7667d6073689",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
      "id": "71e503ed-b165-4bcf-a3a5-3770d8f5bd0f",
      "at": "2026-10-28T13:37:07.806288Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "acf16b75-bf6a-4a61-8997-9c7306cfa4c4",
  "quote_id": "fe2f0381-1cb2-42de-8d60-0fe5f036717e",
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
  "id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
  "created_at": "2026-10-28T13:37:08.10997Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dbdb9b83-f8e1-4980-afba-75ad47225799` → **200**

```json
{
  "id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
  "created_at": "2026-10-28T13:37:08.10997Z",
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
    "id": "94e8fd6e-c6d0-4c46-bf77-8698f41d0b9b",
    "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
    "expires_at": "2026-10-28T13:37:23.115289Z",
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

`POST /api/driver/v1/offers/94e8fd6e-c6d0-4c46-bf77-8698f41d0b9b/accept` → **200**

```json
{
  "command_id": "89c94e19-2121-4150-89df-b4967f4da172"
}
```

```json
{
  "id": "a1cf0656-7ea0-47f8-88c9-403682815fb7",
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5d451889-a37c-412b-9ca7-16c25d82f7a9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5d451889-a37c-412b-9ca7-16c25d82f7a9",
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
  "assignment_id": "a1cf0656-7ea0-47f8-88c9-403682815fb7",
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

`POST /api/driver/v1/work-sessions/209b4c14-697a-4f76-ac9e-9c4bc4398c94/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:37:09Z",
    "sequence": 1793194629558
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "209b4c14-697a-4f76-ac9e-9c4bc4398c94",
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
  "last_heartbeat_at": "2026-10-28T13:37:09.579164Z",
  "last_location_at": "2026-10-28T13:37:09.579164Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5d451889-a37c-412b-9ca7-16c25d82f7a9/arrive` → **200**

```json
{
  "command_id": "069280ba-feac-49b5-a080-d16030be08d1",
  "expected_version": 0
}
```

```json
{
  "id": "5d451889-a37c-412b-9ca7-16c25d82f7a9",
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
  "assignment_id": "a1cf0656-7ea0-47f8-88c9-403682815fb7",
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
  "arrived_at": "2026-10-28T13:37:09.864489Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5d451889-a37c-412b-9ca7-16c25d82f7a9/start` → **200**

```json
{
  "command_id": "743714f2-a4c3-41b0-9a31-89e7ab350644",
  "expected_version": 1
}
```

```json
{
  "id": "5d451889-a37c-412b-9ca7-16c25d82f7a9",
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
  "assignment_id": "a1cf0656-7ea0-47f8-88c9-403682815fb7",
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
  "arrived_at": "2026-10-28T13:37:09.864489Z",
  "started_at": "2026-10-28T13:37:10.155811Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5d451889-a37c-412b-9ca7-16c25d82f7a9/complete` → **200**

```json
{
  "command_id": "955214f5-0b17-41e0-9508-2dae3f2f9c2a",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:37:10Z",
  "cash_received": true
}
```

```json
{
  "id": "5d451889-a37c-412b-9ca7-16c25d82f7a9",
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
  "assignment_id": "a1cf0656-7ea0-47f8-88c9-403682815fb7",
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
  "arrived_at": "2026-10-28T13:37:09.864489Z",
  "started_at": "2026-10-28T13:37:10.155811Z",
  "completed_at": "2026-10-28T13:37:10.456683Z",
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
  "client_id": "b8bc9121-745d-4c5b-8f71-264abe5ffd2c",
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
      "id": "136524de-ec25-438f-ac06-7d24699f178e",
      "at": "2026-10-28T13:37:10.624024Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799"
    },
    {
      "id": "71e503ed-b165-4bcf-a3a5-3770d8f5bd0f",
      "at": "2026-10-28T13:37:07.806288Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
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
      "id": "1a2764ac-5d84-44d6-8b48-302c0ef66d80",
      "at": "2026-10-28T13:37:10.618881Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
      "counterpart_id": null
    },
    {
      "id": "2633964b-9bdb-4074-a798-2c2a44e32ceb",
      "at": "2026-10-28T13:37:05.56764Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
      "counterpart_id": null
    },
    {
      "id": "5dc88a9f-e652-4ef6-90d0-1e8ab21abf00",
      "at": "2026-10-28T13:37:01.516006Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/dbdb9b83-f8e1-4980-afba-75ad47225799/tip` → **200**

```json
{
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
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
  "available_until": "2026-10-29T13:37:10.456683Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/dbdb9b83-f8e1-4980-afba-75ad47225799/tip` → **201**

```json
{
  "command_id": "c781cb64-d0f2-4365-b7aa-f0617da229bd",
  "amount_minor": 2500
}
```

```json
{
  "id": "a1971114-ac60-419b-a137-e4c3a722e8d7",
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:37:11.843677Z"
}
```

`GET /api/rider/v1/orders/dbdb9b83-f8e1-4980-afba-75ad47225799/tip` → **200**

```json
{
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
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
  "available_until": "2026-10-29T13:37:10.456683Z",
  "open": false,
  "tip": {
    "id": "a1971114-ac60-419b-a137-e4c3a722e8d7",
    "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T13:37:11.843677Z"
  }
}
```

`GET /api/rider/v1/orders/dbdb9b83-f8e1-4980-afba-75ad47225799/tip` → **200**

```json
{
  "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
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
  "available_until": "2026-10-29T13:37:10.456683Z",
  "open": false,
  "tip": {
    "id": "a1971114-ac60-419b-a137-e4c3a722e8d7",
    "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:37:11.843677Z"
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
      "id": "28dc7a8f-44c9-4365-ae32-b4797f494efa",
      "at": "2026-10-28T13:37:13.646605Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
      "counterpart_id": null
    },
    {
      "id": "1a2764ac-5d84-44d6-8b48-302c0ef66d80",
      "at": "2026-10-28T13:37:10.618881Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dbdb9b83-f8e1-4980-afba-75ad47225799",
      "counterpart_id": null
    },
    {
      "id": "2633964b-9bdb-4074-a798-2c2a44e32ceb",
      "at": "2026-10-28T13:37:05.56764Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
      "counterpart_id": null
    },
    {
      "id": "5dc88a9f-e652-4ef6-90d0-1e8ab21abf00",
      "at": "2026-10-28T13:37:01.516006Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f834960d-5ea1-4ae2-be2d-75d4b0e883a1",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "209b4c14-697a-4f76-ac9e-9c4bc4398c94",
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
  "last_heartbeat_at": "2026-10-28T13:37:09.579164Z",
  "last_location_at": "2026-10-28T13:37:09.579164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/209b4c14-697a-4f76-ac9e-9c4bc4398c94/close` → **200**

```json
{
  "command_id": "c9535090-ab72-4944-a0a6-29e7f43c3952",
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

Done: card order dbdb9b83-f8e1-4980-afba-75ad47225799.

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
  "phone": "+380731931237",
  "device_ref": "sandbox-2235"
}
```

```json
{
  "challenge_id": "52dbfa5d-578f-4946-b64f-82b1c8893ce6",
  "expires_at": "2026-10-28T13:42:14.79698796Z",
  "resend_available_at": "2026-10-28T13:37:15.79698796Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731931237` → **200**

```json
{
  "phone": "+380731931237",
  "audience": "CLIENT",
  "code": "977508",
  "sent_at": "2026-10-28T13:37:14.799949337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52dbfa5d-578f-4946-b64f-82b1c8893ce6",
  "code": "977508",
  "device_ref": "sandbox-2235"
}
```

```json
{
  "session_id": "0672eb64-21a7-4728-88ce-15525d915fc3",
  "subject": {
    "type": "CLIENT",
    "id": "a9ead35a-b829-483f-9f81-dadd1e940128"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWVhZDM1YS1iODI5LTQ4M2YtOWY4MS1kYWRkMWU5NDAxMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTM1LCJpYXQiOjE3OTMxOTQ2MzUsImp0aSI6ImZjNjQ5YWU0LWY1NGEtNDk4MC1hMjkwLWM1MmU0ZWM3ODQ1OCIsInNpZCI6IjA2NzJlYjY0LTIxYTctNDcyOC04OGNlLTE1NTI1ZDkxNWZjMyJ9.iNbge0FZ0ACPgKGt45pxdb6BR6gZJk1YGc0YaG_hwJI",
  "access_expires_at": "2026-10-28T13:52:15.110591917Z",
  "refresh_token": "vbu_v6YzGmNCUyubQVEQNjCBOszWXBFcvWb6MqeoPNc",
  "refresh_expires_at": "2026-11-27T13:37:15.109892191Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "889cf274-f36b-4fac-91a0-2ef605e70caa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "8a79941e-ea4f-4d20-825f-cc2f12aa7624",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-8a79941e-ea4f-4d20-825f-cc2f12aa7624",
    "orderDate": "1793194635",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "ac6eee84a68f9245bf42d2cda3423a73",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=8a79941e-ea4f-4d20-825f-cc2f12aa7624",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731931237"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=8a79941e-ea4f-4d20-825f-cc2f12aa7624",
  "created_at": "2026-10-28T13:37:15.397368Z",
  "expires_at": "2026-10-28T14:07:15.397368Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/8a79941e-ea4f-4d20-825f-cc2f12aa7624` → **200**

```json
{
  "id": "8a79941e-ea4f-4d20-825f-cc2f12aa7624",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:37:15.397368Z",
  "expires_at": "2026-10-28T14:07:15.397368Z",
  "completed_at": "2026-10-28T13:37:15.68885Z",
  "masked_pan": "41****1938",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a9ead35a-b829-483f-9f81-dadd1e940128",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a9ead35a-b829-483f-9f81-dadd1e940128",
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
      "id": "fc83909b-48e0-41a2-a5a9-179b8e8f8a7d",
      "at": "2026-10-28T13:37:16.663848Z",
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
  "client_id": "a9ead35a-b829-483f-9f81-dadd1e940128",
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
      "id": "fc83909b-48e0-41a2-a5a9-179b8e8f8a7d",
      "at": "2026-10-28T13:37:16.663848Z",
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
  "device_ref": "sandbox-12939"
}
```

```json
{
  "challenge_id": "44ae4471-749f-408c-8a73-3c23265e8ddc",
  "expires_at": "2026-10-28T13:42:17.811965758Z",
  "resend_available_at": "2026-10-28T13:37:18.811965758Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "630065",
  "sent_at": "2026-10-28T13:37:17.814576785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44ae4471-749f-408c-8a73-3c23265e8ddc",
  "code": "630065",
  "device_ref": "sandbox-12939"
}
```

```json
{
  "session_id": "106599b9-9bc7-49e1-9ccf-8b2161802950",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTUzOCwiaWF0IjoxNzkzMTk0NjM4LCJqdGkiOiIwNDZjM2ViMS1mYmVhLTRjYTQtYjBiYS00NzA4OWFmNTY5YjciLCJzaWQiOiIxMDY1OTliOS05YmM3LTQ5ZTEtOWNjZi04YjIxNjE4MDI5NTAifQ.S-QFnoMAm5pVY1iCT2iC59Nz1z6D_sl54OXBwO61F5k",
  "access_expires_at": "2026-10-28T13:52:18.109481914Z",
  "refresh_token": "2f6DVmw8AlqPAs8g0pExeE1yaY-C46sDSMybvRTxljE",
  "refresh_expires_at": "2026-11-27T13:37:18.108827854Z",
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
  "command_id": "f821f2ad-a9fe-417d-b103-d9932aa76be1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "cf866f21-4e25-474d-8dac-5d9d8f9d9bbd",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-cf866f21-4e25-474d-8dac-5d9d8f9d9bbd",
    "orderDate": "1793194638",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5a98a67539ef74c6e478cc9d75f2ddff",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=cf866f21-4e25-474d-8dac-5d9d8f9d9bbd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=cf866f21-4e25-474d-8dac-5d9d8f9d9bbd",
  "created_at": "2026-10-28T13:37:18.665175Z",
  "expires_at": "2026-10-28T14:07:18.665175Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/cf866f21-4e25-474d-8dac-5d9d8f9d9bbd` → **200**

```json
{
  "id": "cf866f21-4e25-474d-8dac-5d9d8f9d9bbd",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:37:18.665175Z",
  "expires_at": "2026-10-28T14:07:18.665175Z",
  "completed_at": "2026-10-28T13:37:18.948357Z",
  "masked_pan": "41****1916",
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
      "id": "14d8e022-5366-44c8-ab21-118e89d55722",
      "at": "2026-10-28T13:37:19.670976Z",
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
  "command_id": "c30b0ffc-5876-4ed7-8344-8d06d13789ab",
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
  "correlation_id": "4a275b42-9209-4e85-a1e2-58b8c21a8445"
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
  "session_id": "f1ea8152-5934-41df-b6eb-a2676180c1ab",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1NDEsImlhdCI6MTc5MzE5NDY0MSwianRpIjoiMjRkNjQxZTQtYTg5My00YzcyLTkwM2QtOTM3NWUwZWE1OTA2Iiwic2lkIjoiZjFlYTgxNTItNTkzNC00MWRmLWI2ZWItYTI2NzYxODBjMWFiIn0.EYnXM0YJkbIyPFp2EQebCE96cA2-fnc1rQxl18QYzIk",
  "access_expires_at": "2026-10-28T13:52:21.404504847Z",
  "refresh_token": "bsBREr6UZt_SqkOAbIEwVH19oLz76gy6DGbOh4exDI4",
  "refresh_expires_at": "2026-10-29T01:37:21.403736968Z",
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
  "phone": "+48600811502",
  "device_ref": "sandbox-24705"
}
```

```json
{
  "challenge_id": "11fee322-7fa1-4020-a072-696c531b24c6",
  "expires_at": "2026-10-28T13:42:22.245823153Z",
  "resend_available_at": "2026-10-28T13:37:23.245823153Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600811502` → **200**

```json
{
  "phone": "+48600811502",
  "audience": "CLIENT",
  "code": "977998",
  "sent_at": "2026-10-28T13:37:22.24817867Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11fee322-7fa1-4020-a072-696c531b24c6",
  "code": "977998",
  "device_ref": "sandbox-24705"
}
```

```json
{
  "session_id": "c07e7e7d-564e-4795-87f9-89f2ca7715fc",
  "subject": {
    "type": "CLIENT",
    "id": "433d95d2-89b8-4bc8-8523-1febcb20a026"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzNkOTVkMi04OWI4LTRiYzgtODUyMy0xZmViY2IyMGEwMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTQyLCJpYXQiOjE3OTMxOTQ2NDIsImp0aSI6IjlmNWQ4OTg3LTNmNGYtNDZkYS1iNjYwLWUwMjBlZDMzN2JlMSIsInNpZCI6ImMwN2U3ZTdkLTU2NGUtNDc5NS04N2Y5LTg5ZjJjYTc3MTVmYyJ9.1eteOneOHH0dJT6CZx3IddVuAhA-Y9z6-cBi3Mdwvl8",
  "access_expires_at": "2026-10-28T13:52:22.555569359Z",
  "refresh_token": "enqxO-BF7GXgA1OoNd3O96IRr8yZ_YtfFv-loKOZxQs",
  "refresh_expires_at": "2026-11-27T13:37:22.554951057Z",
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
  "command_id": "8b29b9a6-a7a6-4d76-b306-5bae88b9355f",
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
  "correlation_id": "c7f91f10-4d16-4190-9d7e-a5d7bc62b295",
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
  "command_id": "c53de5d6-8924-45f5-b823-cc168e6c80c9",
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
  "paused_at": "2026-10-28T13:37:23.698227299Z",
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
  "command_id": "6e88e7e0-bf7a-4dff-b8c3-04cb313f19d3",
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
  "id": "d7050e62-9e18-4e4f-a999-a971c3152d2f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:42:24.293699Z",
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
  "command_id": "8109d1f2-53ec-4321-bec2-d5333535046c",
  "quote_id": "d7050e62-9e18-4e4f-a999-a971c3152d2f",
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
  "correlation_id": "aad4c4c7-a0f7-4196-a055-3ef00ba0e028"
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
  "paused_at": "2026-10-28T13:37:23.698227Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "7ca72f39-eb3c-4094-bfeb-847bf3baabdd",
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
  "command_id": "007602b5-02cc-4bb7-9aca-5282ceecf644",
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
  "command_id": "f69b0135-62b6-4748-861f-f1ddde9c1323",
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
  "id": "4add841b-e8a1-4f9b-a871-659989c01506",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:42:25.995086Z",
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
  "command_id": "81720018-d3e9-485e-a7b6-f3b2edb5d538",
  "quote_id": "4add841b-e8a1-4f9b-a871-659989c01506",
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
  "correlation_id": "5014acd3-52c4-49c5-877f-5525beb5f06b"
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
  "command_id": "42a9a8d3-5fe0-40fc-94ae-e079cd85d639",
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
  "command_id": "f3f86367-656e-44c6-bfaa-5c7073620981",
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
  "id": "9c1468fb-080d-42b8-921e-bf673f22c4be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:42:27.155996Z",
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
  "command_id": "4b43069f-64fe-43df-abdc-7d4c03178f4b",
  "quote_id": "9c1468fb-080d-42b8-921e-bf673f22c4be",
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
  "correlation_id": "37d41c4c-78c3-4832-9807-b5b4dc9a5dc1"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "d71d0a9d-6ffe-451f-92b9-3fc97fe3b697",
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
  "correlation_id": "464a9abf-1272-4387-b862-00a0608eb203"
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
  "command_id": "05836aaf-11ef-4899-898b-6ac72b6efa52",
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
  "phone": "+380674586948",
  "device_ref": "sandbox-7651"
}
```

```json
{
  "challenge_id": "fcaae249-76a3-43ee-98f9-cff1999bcd36",
  "expires_at": "2026-10-28T13:42:28.63992999Z",
  "resend_available_at": "2026-10-28T13:37:29.63992999Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674586948` → **200**

```json
{
  "phone": "+380674586948",
  "audience": "CLIENT",
  "code": "682147",
  "sent_at": "2026-10-28T13:37:28.642275012Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcaae249-76a3-43ee-98f9-cff1999bcd36",
  "code": "682147",
  "device_ref": "sandbox-7651"
}
```

```json
{
  "session_id": "43fba901-702e-49cd-9845-d9f11118f1a1",
  "subject": {
    "type": "CLIENT",
    "id": "b9865090-7f9c-4420-9528-8d2527124ae3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOTg2NTA5MC03ZjljLTQ0MjAtOTUyOC04ZDI1MjcxMjRhZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTQ4LCJpYXQiOjE3OTMxOTQ2NDgsImp0aSI6Ijg5ZjliNzAwLWFhMzctNGVkMi1iOTRmLTI1OTRjMjc0MTI4NCIsInNpZCI6IjQzZmJhOTAxLTcwMmUtNDljZC05ODQ1LWQ5ZjExMTE4ZjFhMSJ9.1kkVqBM1gTXhOadh056jkvwNoGl2Ae7a5VVgYuv5V2Y",
  "access_expires_at": "2026-10-28T13:52:28.949172607Z",
  "refresh_token": "6bwZdtvasHayZu_rK55Lx-ffO8vr7NOZbg6M6Ej1pgE",
  "refresh_expires_at": "2026-11-27T13:37:28.948589137Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b9865090-7f9c-4420-9528-8d2527124ae3",
  "session_id": "43fba901-702e-49cd-9845-d9f11118f1a1",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b09044e4-fd5c-46c6-a363-92c61220a2b0",
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
  "id": "b915755d-8633-4142-bdae-0651c4bed4fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:42:29.512758Z",
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
  "challenge_id": "3870add7-6504-4a69-9c11-4dc34c4ebbe5",
  "expires_at": "2026-10-28T13:42:31.814010268Z",
  "resend_available_at": "2026-10-28T13:37:32.814010268Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674586948` → **200**

```json
{
  "phone": "+380674586948",
  "audience": "CLIENT",
  "code": "176557",
  "sent_at": "2026-10-28T13:37:31.816316368Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "a317eeaf-c604-41c0-8550-255966befb18",
  "challenge_id": "3870add7-6504-4a69-9c11-4dc34c4ebbe5",
  "otp_code": "176557"
}
```

```json
{
  "client_id": "b9865090-7f9c-4420-9528-8d2527124ae3",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T13:37:32.17627481Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "7f307e51-1c91-4462-8089-be8b0f3d9d1b",
  "quote_id": "b915755d-8633-4142-bdae-0651c4bed4fa",
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
  "correlation_id": "bc03e24e-fd10-47a8-90a1-6ceb6fe9153d"
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
  "session_id": "c28668c1-ac76-4098-bbe7-987bda0bba56",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1NTMsImlhdCI6MTc5MzE5NDY1MywianRpIjoiY2FlNDdkMzAtN2EwZi00Y2ZjLTk1MzAtMmNmYjhiM2RhYTIwIiwic2lkIjoiYzI4NjY4YzEtYWM3Ni00MDk4LWJiZTctOTg3YmRhMGJiYTU2In0.S4FFIhKsftEUE6USYhuM38HpYFfYuIt5xMjVmqjzXqM",
  "access_expires_at": "2026-10-28T13:52:33.060822972Z",
  "refresh_token": "3lYU-apRC0aFBjVnPFp3cIQqO_HKKOmwEsolziK8ALA",
  "refresh_expires_at": "2026-10-29T01:37:33.060077721Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "b9865090-7f9c-4420-9528-8d2527124ae3",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T13:37:32.176275Z",
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

`POST /api/admin/v1/client-deletions/b9865090-7f9c-4420-9528-8d2527124ae3/complete` → **200**

```json
{
  "command_id": "c4736f78-7acf-428a-b313-503be0edde39",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "b9865090-7f9c-4420-9528-8d2527124ae3",
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
  "correlation_id": "a5476f76-ef94-4a1c-9b51-e5f8c544c001"
}
```

Done: client b9865090-7f9c-4420-9528-8d2527124ae3 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661055832",
  "device_ref": "sandbox-2357"
}
```

```json
{
  "challenge_id": "fca55904-72cb-41c0-82f3-b4aa2a98ccea",
  "expires_at": "2026-10-28T13:42:34.226480657Z",
  "resend_available_at": "2026-10-28T13:37:35.226480657Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661055832` → **200**

```json
{
  "phone": "+380661055832",
  "audience": "CLIENT",
  "code": "005590",
  "sent_at": "2026-10-28T13:37:34.22938204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fca55904-72cb-41c0-82f3-b4aa2a98ccea",
  "code": "005590",
  "device_ref": "sandbox-2357"
}
```

```json
{
  "session_id": "71a7a963-22a8-44b8-81e5-a64bac4cfd27",
  "subject": {
    "type": "CLIENT",
    "id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzhlMGFiNi1iMDAzLTQxNmQtYjBmMi1jOTcxY2ZlMThkZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTU0LCJpYXQiOjE3OTMxOTQ2NTQsImp0aSI6IjBhM2E2ZTQwLTk5ZDQtNDFmOS1iYjYzLTgxNDRhNDNiNzg4ZSIsInNpZCI6IjcxYTdhOTYzLTIyYTgtNDRiOC04MWU1LWE2NGJhYzRjZmQyNyJ9.O2EYvI40EI5J0KXfkuW8qDWnwAB_68UC2iKNxeBcP0I",
  "access_expires_at": "2026-10-28T13:52:34.543408209Z",
  "refresh_token": "ZAtVaf4X8_NHvA8L5fztwxTxl2FHXs0cz71zAmrC1Vk",
  "refresh_expires_at": "2026-11-27T13:37:34.54270095Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd",
  "session_id": "71a7a963-22a8-44b8-81e5-a64bac4cfd27",
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
  "session_id": "86028c82-a96c-413a-b270-64bdfac4cb23",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1NTUsImlhdCI6MTc5MzE5NDY1NSwianRpIjoiNDRkNDlhN2ItMDRhNy00ZWZmLTg5MWUtOTJjOTgyY2IxOGE1Iiwic2lkIjoiODYwMjhjODItYTk2Yy00MTNhLWIyNzAtNjRiZGZhYzRjYjIzIn0.1aA-_xUO5pyrZiVYPVe6YTB7WkAZm9f0vqZ2nbhtBak",
  "access_expires_at": "2026-10-28T13:52:35.397858371Z",
  "refresh_token": "NXdf29g0X9vNFYGlG87OLdCLmw7OUY35VOQe_XHXV1s",
  "refresh_expires_at": "2026-10-29T01:37:35.397306864Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1055832&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd",
      "phone": "+380661055832",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T13:37:34.54063Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/c78e0ab6-b003-416d-b0f2-c971cfe18dfd` → **200**

```json
{
  "client": {
    "id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd",
    "phone": "+380661055832",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:37:34.54063Z",
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

`POST /api/admin/v1/clients/c78e0ab6-b003-416d-b0f2-c971cfe18dfd/block` → **400**

```json
{
  "command_id": "f7712f50-b828-42ad-b0a5-87048137d582",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c78e0ab6-b003-416d-b0f2-c971cfe18dfd/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a7a9f991-9acb-4aaa-ad20-3f78ecd8554e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/c78e0ab6-b003-416d-b0f2-c971cfe18dfd/block` → **200**

```json
{
  "command_id": "3139645a-d5d3-45eb-9df3-4f29b74a207d",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd",
  "phone": "+380661055832",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T13:37:34.54063Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T13:37:36.581221Z",
    "by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
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
  "correlation_id": "41f8755b-c657-40a7-aa45-3e50de9239ae"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661055832",
  "device_ref": "sandbox-24334"
}
```

```json
{
  "challenge_id": "1d4899fd-52e0-404f-8678-279b69dab90b",
  "expires_at": "2026-10-28T13:42:39.145678149Z",
  "resend_available_at": "2026-10-28T13:37:40.145678149Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661055832` → **200**

```json
{
  "phone": "+380661055832",
  "audience": "CLIENT",
  "code": "525500",
  "sent_at": "2026-10-28T13:37:39.147826773Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1d4899fd-52e0-404f-8678-279b69dab90b",
  "code": "525500",
  "device_ref": "sandbox-24334"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d12459bf-4a6d-47ea-a32a-e18539df327c"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/c78e0ab6-b003-416d-b0f2-c971cfe18dfd` → **200**

```json
{
  "client": {
    "id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd",
    "phone": "+380661055832",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T13:37:34.54063Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T13:37:36.581221Z",
      "by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
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

`POST /api/admin/v1/clients/c78e0ab6-b003-416d-b0f2-c971cfe18dfd/unblock` → **200**

```json
{
  "command_id": "4a813255-59e1-41ca-97c9-61ff966d4d47",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd",
  "phone": "+380661055832",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T13:37:34.54063Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661055832",
  "device_ref": "sandbox-31740"
}
```

```json
{
  "challenge_id": "9897a676-82bf-451a-8d02-ee6e663f7b8c",
  "expires_at": "2026-10-28T13:42:42.39623923Z",
  "resend_available_at": "2026-10-28T13:37:43.39623923Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661055832` → **200**

```json
{
  "phone": "+380661055832",
  "audience": "CLIENT",
  "code": "621266",
  "sent_at": "2026-10-28T13:37:42.398644594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9897a676-82bf-451a-8d02-ee6e663f7b8c",
  "code": "621266",
  "device_ref": "sandbox-31740"
}
```

```json
{
  "session_id": "c3dae23f-142d-4dc0-b8c9-13c4baaf8c6a",
  "subject": {
    "type": "CLIENT",
    "id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzhlMGFiNi1iMDAzLTQxNmQtYjBmMi1jOTcxY2ZlMThkZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTYyLCJpYXQiOjE3OTMxOTQ2NjIsImp0aSI6ImVmYTFlOTgxLTA3ZGItNDk2Zi1iMDgzLTA3OGFiZDIwY2JhNSIsInNpZCI6ImMzZGFlMjNmLTE0MmQtNGRjMC1iOGM5LTEzYzRiYWFmOGM2YSJ9.z0T_1egp6Wfw_ErBrkSv7ALJ2vsQhRXxUaKPQdlGiE0",
  "access_expires_at": "2026-10-28T13:52:42.713806342Z",
  "refresh_token": "D3fKvUiUmbBJ8IgfrYfCGhC-RWvQXEX5lFeFx06cYWA",
  "refresh_expires_at": "2026-11-27T13:37:42.713040192Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c78e0ab6-b003-416d-b0f2-c971cfe18dfd",
  "session_id": "c3dae23f-142d-4dc0-b8c9-13c4baaf8c6a",
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
  "phone": "+380666420813",
  "device_ref": "sandbox-3281"
}
```

```json
{
  "challenge_id": "83f83b07-20df-41bd-bb8a-74883932d78b",
  "expires_at": "2026-10-28T13:42:43.302843226Z",
  "resend_available_at": "2026-10-28T13:37:44.302843226Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666420813` → **200**

```json
{
  "phone": "+380666420813",
  "audience": "CLIENT",
  "code": "932695",
  "sent_at": "2026-10-28T13:37:43.305575721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83f83b07-20df-41bd-bb8a-74883932d78b",
  "code": "932695",
  "device_ref": "sandbox-3281"
}
```

```json
{
  "session_id": "0027765f-38dd-4ecf-a49d-bb76bcaf3d5d",
  "subject": {
    "type": "CLIENT",
    "id": "85e0d557-fe26-4dd5-b32a-b930dbc1d3b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NWUwZDU1Ny1mZTI2LTRkZDUtYjMyYS1iOTMwZGJjMWQzYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTYzLCJpYXQiOjE3OTMxOTQ2NjMsImp0aSI6IjU5OWQxZTY4LTNiMzEtNDA1MS1hMzkwLWQ4NTcxNTdkYzYwNyIsInNpZCI6IjAwMjc3NjVmLTM4ZGQtNGVjZi1hNDlkLWJiNzZiY2FmM2Q1ZCJ9.4HDfzDgNCgrQpsCPxxxb3-d0qYqRDlEAiKDwhVVFvEs",
  "access_expires_at": "2026-10-28T13:52:43.618928351Z",
  "refresh_token": "v2AvnJ8Hh3qJoXiTodQr3cwrRiNmtashTPdo27r0mVM",
  "refresh_expires_at": "2026-11-27T13:37:43.618387625Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f3c22715-1304-40dd-bea8-c6570236d9ed",
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
  "id": "da65e62c-50a5-4c2d-b2fd-4eadc6fd92fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:42:43.913641Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 138a0f94-84e0-4d24-8220-dd918dbe5c37) → **201**

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
  "session_id": "0836f281-3a4a-4a6a-853d-6fe56b23ca8a",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1NjQsImlhdCI6MTc5MzE5NDY2NCwianRpIjoiYjNlZjRkMmYtZmFkYi00ZmZjLWFmMmYtMmE2Y2EzYTJjMDU2Iiwic2lkIjoiMDgzNmYyODEtM2E0YS00YTZhLTg1M2QtNmZlNTZiMjNjYThhIn0.LWsCMPQuvJXCb137rtp1fx4Lrl021yQjt72Qjaq-DTw",
  "access_expires_at": "2026-10-28T13:52:44.548957727Z",
  "refresh_token": "RUYiiwt3L6L0vkVkg6fIfFwhLpkc_kBISE01xKLJQyk",
  "refresh_expires_at": "2026-10-29T01:37:44.548425487Z",
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
  "session_id": "e77bfb6d-d073-4e95-8940-79b8008d0e3d",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1NjUsImlhdCI6MTc5MzE5NDY2NSwianRpIjoiNTU1ZTI2OTMtZTg1OS00Zjc5LWIwYmYtNjIzZTdkZDY0OTZkIiwic2lkIjoiZTc3YmZiNmQtZDA3My00ZTk1LTg5NDAtNzliODAwOGQwZTNkIn0.lWqVJsRX7h9iDgmLpDgO9RpT2jvkB4WcLPYkB5Kwon0",
  "access_expires_at": "2026-10-28T13:52:45.123375401Z",
  "refresh_token": "Rxn1WRcD4UVq9c-PVqzaT49mG34lQaQD8GAn6uAEzyQ",
  "refresh_expires_at": "2026-10-29T01:37:45.122781936Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e05c4f0f-5f3a-4926-bb5f-cd518f99ab12/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:37:44.214962Z",
      "actor": {
        "type": "CLIENT",
        "id": "85e0d557-fe26-4dd5-b32a-b930dbc1d3b6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12",
        "quote_id": "da65e62c-50a5-4c2d-b2fd-4eadc6fd92fe",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "138a0f94-84e0-4d24-8220-dd918dbe5c37"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:37:44.216675Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12",
        "attempt_id": "49436ed0-c8da-4abb-8e4c-925de807b0be",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "138a0f94-84e0-4d24-8220-dd918dbe5c37"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T13:37:44.226488Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12",
        "attempt_id": "49436ed0-c8da-4abb-8e4c-925de807b0be"
      },
      "correlation_id": "138a0f94-84e0-4d24-8220-dd918dbe5c37"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "49436ed0-c8da-4abb-8e4c-925de807b0be",
        "generation": 1,
        "started_at": "2026-10-28T13:37:44.215751Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T13:37:44.226488Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T13:37:44.217606Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/138a0f94-84e0-4d24-8220-dd918dbe5c37` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12:0",
      "order_id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12",
      "at": "2026-10-28T13:37:44.214962Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12:1",
      "order_id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12",
      "at": "2026-10-28T13:37:44.216675Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12:2",
      "order_id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12",
      "at": "2026-10-28T13:37:44.226488Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/a7c4b73c-e670-473b-a1d2-55630ef97dca` → **200**

```json
{
  "found": []
}
```

Done: request 138a0f94-84e0-4d24-8220-dd918dbe5c37 — order e05c4f0f-5f3a-4926-bb5f-cd518f99ab12 found by its id.

`GET /api/rider/v1/orders/e05c4f0f-5f3a-4926-bb5f-cd518f99ab12` → **200**

```json
{
  "id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "85e0d557-fe26-4dd5-b32a-b930dbc1d3b6",
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
  "created_at": "2026-10-28T13:37:44.214332Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e05c4f0f-5f3a-4926-bb5f-cd518f99ab12/cancel` → **200**

```json
{
  "command_id": "26676307-bd8d-4406-899b-30eea66f21cd",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e05c4f0f-5f3a-4926-bb5f-cd518f99ab12",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85e0d557-fe26-4dd5-b32a-b930dbc1d3b6",
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
  "created_at": "2026-10-28T13:37:44.214332Z",
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
  "phone": "+380632270993",
  "device_ref": "sandbox-8194"
}
```

```json
{
  "challenge_id": "8aa5cdc5-0bbb-43bb-9471-5450a423b4a1",
  "expires_at": "2026-10-28T13:42:46.891395655Z",
  "resend_available_at": "2026-10-28T13:37:47.891395655Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632270993` → **200**

```json
{
  "phone": "+380632270993",
  "audience": "CLIENT",
  "code": "427248",
  "sent_at": "2026-10-28T13:37:46.89410184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8aa5cdc5-0bbb-43bb-9471-5450a423b4a1",
  "code": "427248",
  "device_ref": "sandbox-8194"
}
```

```json
{
  "session_id": "769cc81e-af4d-4e85-9dac-94d225178d57",
  "subject": {
    "type": "CLIENT",
    "id": "7ee1a57c-c715-49fe-922a-620b0bcd0727"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZWUxYTU3Yy1jNzE1LTQ5ZmUtOTIyYS02MjBiMGJjZDA3MjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTY3LCJpYXQiOjE3OTMxOTQ2NjcsImp0aSI6IjE1YjQ4NzFjLWY4Y2MtNDYyMy1hY2M4LWRhOTg4YTU0Zjg1YSIsInNpZCI6Ijc2OWNjODFlLWFmNGQtNGU4NS05ZGFjLTk0ZDIyNTE3OGQ1NyJ9.OpgFIP9rqMSnLQSq4G4NPv0wDaJxorfV4TV1nuyej5E",
  "access_expires_at": "2026-10-28T13:52:47.211066935Z",
  "refresh_token": "LIdCbdbD7eGW3O16UbcVJ5No_XJ-YKwdaQl3f_JRaA0",
  "refresh_expires_at": "2026-11-27T13:37:47.210435439Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "f07aba3e-a4a7-4866-9416-d43f64b2e616",
  "expires_at": "2026-10-28T13:42:49.502676096Z",
  "resend_available_at": "2026-10-28T13:37:50.502676096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632270993` → **200**

```json
{
  "phone": "+380632270993",
  "audience": "CLIENT",
  "code": "968707",
  "sent_at": "2026-10-28T13:37:49.504819218Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1375be95-18ff-45ab-968d-d3cad8fe202e",
  "challenge_id": "f07aba3e-a4a7-4866-9416-d43f64b2e616",
  "otp_code": "968707"
}
```

```json
{
  "id": "68b62834-3c93-4713-94c2-9558028ba5ad",
  "state": "PENDING",
  "created_at": "2026-10-28T13:37:49.821464Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/68b62834-3c93-4713-94c2-9558028ba5ad` → **200**

```json
{
  "id": "68b62834-3c93-4713-94c2-9558028ba5ad",
  "state": "PENDING",
  "created_at": "2026-10-28T13:37:49.821464Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/68b62834-3c93-4713-94c2-9558028ba5ad` → **200**

```json
{
  "id": "68b62834-3c93-4713-94c2-9558028ba5ad",
  "state": "PENDING",
  "created_at": "2026-10-28T13:37:49.821464Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/68b62834-3c93-4713-94c2-9558028ba5ad` → **200**

```json
{
  "id": "68b62834-3c93-4713-94c2-9558028ba5ad",
  "state": "READY",
  "created_at": "2026-10-28T13:37:49.821464Z",
  "ready_at": "2026-10-28T13:37:51.957568Z",
  "expires_at": "2026-11-04T13:37:51.957568Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/68b62834-3c93-4713-94c2-9558028ba5ad/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635535655",
  "device_ref": "sandbox-24497"
}
```

```json
{
  "challenge_id": "fcfaba35-3705-4809-bd75-7bdd586c738f",
  "expires_at": "2026-10-28T13:42:52.988051238Z",
  "resend_available_at": "2026-10-28T13:37:53.988051238Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635535655` → **200**

```json
{
  "phone": "+380635535655",
  "audience": "CLIENT",
  "code": "576352",
  "sent_at": "2026-10-28T13:37:52.990491885Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcfaba35-3705-4809-bd75-7bdd586c738f",
  "code": "576352",
  "device_ref": "sandbox-24497"
}
```

```json
{
  "session_id": "22bd5b81-830a-4545-817c-8fe196619f11",
  "subject": {
    "type": "CLIENT",
    "id": "468a1e8e-f21b-4594-b30e-3d46ef135587"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NjhhMWU4ZS1mMjFiLTQ1OTQtYjMwZS0zZDQ2ZWYxMzU1ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTczLCJpYXQiOjE3OTMxOTQ2NzMsImp0aSI6IjYzNmY4NjFlLTg0MzQtNGZkOS04N2Q2LWU1OGE4NDNhOWVmZCIsInNpZCI6IjIyYmQ1YjgxLTgzMGEtNDU0NS04MTdjLThmZTE5NjYxOWYxMSJ9.v6LDxjvofdHKBsT39YfyaaY50zm5gbTq_aTvR5nIdFg",
  "access_expires_at": "2026-10-28T13:52:53.325967141Z",
  "refresh_token": "tfStVaizEleJyandoyh-CsHZGmaICmwPQ8ZNHuuHeXM",
  "refresh_expires_at": "2026-11-27T13:37:53.32534922Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/68b62834-3c93-4713-94c2-9558028ba5ad/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/68b62834-3c93-4713-94c2-9558028ba5ad/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f8f99d4d-75c5-47fb-9b16-f8e20e6bb009"
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
  "session_id": "166e7f70-e5ae-417f-bc4d-9b222f01ef5d",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1NzQsImlhdCI6MTc5MzE5NDY3NCwianRpIjoiNDg0NjRhYzEtMmY2MS00OTlmLTgyMjEtMmY2MDBlY2ZiOWVlIiwic2lkIjoiMTY2ZTdmNzAtZTVhZS00MTdmLWJjNGQtOWIyMjJmMDFlZjVkIn0.caeCoAXcII2gyg3mvCFPtz-IS3rQHlokOPo_Rn7rLdc",
  "access_expires_at": "2026-10-28T13:52:54.190086341Z",
  "refresh_token": "xq66bAMnNf_NXxFM4iMrhhFsfRfXYRjKu-tKQ8f8nsI",
  "refresh_expires_at": "2026-10-29T01:37:54.18950607Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7ee1a57c-c715-49fe-922a-620b0bcd0727",
  "session_id": "769cc81e-af4d-4e85-9dac-94d225178d57",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/7ee1a57c-c715-49fe-922a-620b0bcd0727/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "68b62834-3c93-4713-94c2-9558028ba5ad",
      "state": "READY",
      "created_at": "2026-10-28T13:37:49.821464Z",
      "ready_at": "2026-10-28T13:37:51.957568Z",
      "expires_at": "2026-11-04T13:37:51.957568Z",
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
  "device_ref": "sandbox-4175"
}
```

```json
{
  "challenge_id": "1741b7f1-44be-473d-9a24-121f0d9248c9",
  "expires_at": "2026-10-28T13:42:55.049761799Z",
  "resend_available_at": "2026-10-28T13:37:56.049761799Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "878111",
  "sent_at": "2026-10-28T13:37:55.052286324Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1741b7f1-44be-473d-9a24-121f0d9248c9",
  "code": "878111",
  "device_ref": "sandbox-4175"
}
```

```json
{
  "session_id": "116602dc-08db-4f6c-8ddc-8836363f924c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTU3NSwiaWF0IjoxNzkzMTk0Njc1LCJqdGkiOiJjMmE4ZGJiZC04ZWU1LTQxYzMtOGZhNi01M2IyMDM3MjE4OWQiLCJzaWQiOiIxMTY2MDJkYy0wOGRiLTRmNmMtOGRkYy04ODM2MzYzZjkyNGMifQ.KUdaY4s5s-mJNnBxkIukmiR6rty-uirMz6mqnZq_i20",
  "access_expires_at": "2026-10-28T13:52:55.367201958Z",
  "refresh_token": "ht1NUiDn83uh4XneCkyyuXVd4qseJbYFTJ2b0bbKnzY",
  "refresh_expires_at": "2026-11-27T13:37:55.366627929Z",
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
  "device_ref": "sandbox-31872"
}
```

```json
{
  "challenge_id": "d4001d25-b307-435b-b87b-f274313de577",
  "expires_at": "2026-10-28T13:42:55.920139995Z",
  "resend_available_at": "2026-10-28T13:37:56.920139995Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "209376",
  "sent_at": "2026-10-28T13:37:55.922587396Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4001d25-b307-435b-b87b-f274313de577",
  "code": "209376",
  "device_ref": "sandbox-31872"
}
```

```json
{
  "session_id": "9958865e-5f63-42f6-b8e0-7168e954456b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTU3NiwiaWF0IjoxNzkzMTk0Njc2LCJqdGkiOiIyNzA3OThlZC1hYmU1LTQ2ZjgtYjAyZi0wNGE3MzRlZmQwYmIiLCJzaWQiOiI5OTU4ODY1ZS01ZjYzLTQyZjYtYjhlMC03MTY4ZTk1NDQ1NmIifQ.80ctE5Gy5JQ00vVpskTL6h7620XKh8413hj4bv5zHk4",
  "access_expires_at": "2026-10-28T13:52:56.229721501Z",
  "refresh_token": "dNgkZ9iz8mPaRz9VO8aUT_tJEuBxhWz4PEXyvWKeYOU",
  "refresh_expires_at": "2026-11-27T13:37:56.229083871Z",
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
  "command_id": "15be0173-5d42-4730-b6a4-ca3a0d3a3b33",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:37:56Z",
    "sequence": 1793194676788
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cab47c5c-3a06-465e-aa94-359d7146bc19",
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
  "last_heartbeat_at": "2026-10-28T13:37:56.808415Z",
  "last_location_at": "2026-10-28T13:37:56.808415Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-32547"
}
```

```json
{
  "challenge_id": "165451be-0c67-4c98-8c25-1a2cdb2f322d",
  "expires_at": "2026-10-28T13:42:57.092768808Z",
  "resend_available_at": "2026-10-28T13:37:58.092768808Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "360150",
  "sent_at": "2026-10-28T13:37:57.095640864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "165451be-0c67-4c98-8c25-1a2cdb2f322d",
  "code": "360150",
  "device_ref": "sandbox-32547"
}
```

```json
{
  "session_id": "62d6acfb-c36f-43a9-9070-e6aeb07369e4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTU3NywiaWF0IjoxNzkzMTk0Njc3LCJqdGkiOiI1YmQyYjhjYy1hZDlmLTQyZGYtYjNjMy1iYWNhMDU5NzA2NzIiLCJzaWQiOiI2MmQ2YWNmYi1jMzZmLTQzYTktOTA3MC1lNmFlYjA3MzY5ZTQifQ.Y1C5_q8JzbVVS8Qk__vhABwHsxTOg3mgr8cq17Fl5Ec",
  "access_expires_at": "2026-10-28T13:52:57.415791988Z",
  "refresh_token": "F6_f944Hum8LQgNy3UhKdI_wOHLDzGKed5sfskmD5cs",
  "refresh_expires_at": "2026-11-27T13:37:57.415187833Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "81adc930-259f-4b46-bd08-6b02be407452",
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
  "last_heartbeat_at": "2026-10-28T13:36:48.063634Z",
  "last_location_at": "2026-10-28T13:36:48.063634Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/81adc930-259f-4b46-bd08-6b02be407452/handover` → **200**

```json
{
  "command_id": "bfa67cd6-b4c0-40d6-b9e5-b83b2ff34baa",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "81adc930-259f-4b46-bd08-6b02be407452",
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
  "last_heartbeat_at": "2026-10-28T13:36:48.063634Z",
  "last_location_at": "2026-10-28T13:36:48.063634Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/81adc930-259f-4b46-bd08-6b02be407452/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:37:58Z",
    "sequence": 1793194678295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "81adc930-259f-4b46-bd08-6b02be407452",
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
  "last_heartbeat_at": "2026-10-28T13:37:58.316106Z",
  "last_location_at": "2026-10-28T13:37:58.316106Z",
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
  "session_id": "5090a107-8042-4008-8060-c3a25b96b356",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1NzgsImlhdCI6MTc5MzE5NDY3OCwianRpIjoiM2Q2ZjI5NjctNGQ4MS00NTU0LTgyMGYtYTdiODZmM2ZmNzFjIiwic2lkIjoiNTA5MGExMDctODA0Mi00MDA4LTgwNjAtYzNhMjViOTZiMzU2In0.l2mcrVKi4A8oNNyl98UumceL9s5zLran7wcS8N85Hl4",
  "access_expires_at": "2026-10-28T13:52:58.888885992Z",
  "refresh_token": "oie1_9IQ7Tl-MSsDcVzdpe9HLCSfYJpqpKdZvMDI-Tw",
  "refresh_expires_at": "2026-10-29T01:37:58.888223748Z",
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
  "session_id": "08366c82-8a65-45fb-8a71-0c5e9bef0d7b",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1NzksImlhdCI6MTc5MzE5NDY3OSwianRpIjoiZGY4NmJkM2QtNWRiNy00NzExLTk3YmMtZTZkOGE2MjFhNGYyIiwic2lkIjoiMDgzNjZjODItOGE2NS00NWZiLThhNzEtMGM1ZTliZWYwZDdiIn0.hCO1b0VsJn_JPhAi3j2TuhEfQtyYLKwWf4wUDP-KK20",
  "access_expires_at": "2026-10-28T13:52:59.470510678Z",
  "refresh_token": "m9CeZaZVHV4vai6Ngf8-i7iypaXt8g-YQ2UHejlkVoY",
  "refresh_expires_at": "2026-10-29T01:37:59.469885554Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689922165",
  "device_ref": "sandbox-5221"
}
```

```json
{
  "challenge_id": "63ff500f-9c7e-48a0-96c5-19c257bd554a",
  "expires_at": "2026-10-28T13:42:59.751922648Z",
  "resend_available_at": "2026-10-28T13:38:00.751922648Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689922165` → **200**

```json
{
  "phone": "+380689922165",
  "audience": "CLIENT",
  "code": "586207",
  "sent_at": "2026-10-28T13:37:59.754232436Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63ff500f-9c7e-48a0-96c5-19c257bd554a",
  "code": "586207",
  "device_ref": "sandbox-5221"
}
```

```json
{
  "session_id": "cb49d150-2588-4250-9f39-1ee4ae1a14e8",
  "subject": {
    "type": "CLIENT",
    "id": "64f37fbb-8fb0-49ce-b6b3-504fbbcfd587"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGYzN2ZiYi04ZmIwLTQ5Y2UtYjZiMy01MDRmYmJjZmQ1ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTgwLCJpYXQiOjE3OTMxOTQ2ODAsImp0aSI6IjIwNWE3MDdiLTU0YWMtNGM2YS04N2Y0LTdlN2IyY2M2NWMyNCIsInNpZCI6ImNiNDlkMTUwLTI1ODgtNDI1MC05ZjM5LTFlZTRhZTFhMTRlOCJ9.aKW7diTrYGmzT6ihEMz8EVFI7j7Lu1Qnpw5CWAyOlo0",
  "access_expires_at": "2026-10-28T13:53:00.063679652Z",
  "refresh_token": "jV_iLkBoTFhApN3gMCw1SLv_LZO6TNAVDxzbIhbnBGA",
  "refresh_expires_at": "2026-11-27T13:38:00.063036842Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "88716735-8272-479b-8005-c5afcaa4f149",
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
  "id": "e475166b-076a-4d6c-94e3-5b0d27deab80",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:00.347822Z",
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
  "command_id": "b91df94d-0178-46c2-ba08-c8c54351007c",
  "quote_id": "e475166b-076a-4d6c-94e3-5b0d27deab80",
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
  "id": "0628d905-2ae1-47b9-9238-092a48c51909",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64f37fbb-8fb0-49ce-b6b3-504fbbcfd587",
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
  "created_at": "2026-10-28T13:38:00.650796Z",
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
    "id": "67215bf2-a62d-44d9-aafe-0994a6b7b645",
    "order_id": "0628d905-2ae1-47b9-9238-092a48c51909",
    "expires_at": "2026-10-28T13:38:15.654862Z",
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

`POST /api/driver/v1/offers/67215bf2-a62d-44d9-aafe-0994a6b7b645/reject` → **204**

```json
{
  "command_id": "412e4e0d-11e1-4e12-a959-73895a1e5f33"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bd20c36f-c106-4e12-a852-a12880316ff8",
    "order_id": "0628d905-2ae1-47b9-9238-092a48c51909",
    "expires_at": "2026-10-28T13:38:16.257463Z",
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

`POST /api/driver/v1/offers/bd20c36f-c106-4e12-a852-a12880316ff8/accept` → **200**

```json
{
  "command_id": "d4dccec3-97c6-46f5-a5d4-0777c99f7c29"
}
```

```json
{
  "id": "55468b82-56c1-4651-9bf8-0aee83754116",
  "order_id": "0628d905-2ae1-47b9-9238-092a48c51909",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0afa7e08-ea34-426d-bcea-dfb51e2ba36f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/0628d905-2ae1-47b9-9238-092a48c51909/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:38:00.651491Z",
      "actor": {
        "type": "CLIENT",
        "id": "64f37fbb-8fb0-49ce-b6b3-504fbbcfd587",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0628d905-2ae1-47b9-9238-092a48c51909",
        "quote_id": "e475166b-076a-4d6c-94e3-5b0d27deab80",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c3a0c1f2-dbca-4930-9fef-ace23e0d7a3a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:38:00.653892Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0628d905-2ae1-47b9-9238-092a48c51909",
        "attempt_id": "7e2149c3-f3c5-468a-995f-10ef718db672",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c3a0c1f2-dbca-4930-9fef-ace23e0d7a3a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:38:00.661571Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "67215bf2-a62d-44d9-aafe-0994a6b7b645",
        "order_id": "0628d905-2ae1-47b9-9238-092a48c51909",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c3a0c1f2-dbca-4930-9fef-ace23e0d7a3a"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T13:38:01.256155Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "67215bf2-a62d-44d9-aafe-0994a6b7b645",
        "order_id": "0628d905-2ae1-47b9-9238-092a48c51909"
      },
      "correlation_id": "be2ab4b5-853f-4fe6-afaf-33c3c5a4e240"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 0628d905-2ae1-47b9-9238-092a48c51909 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/0628d905-2ae1-47b9-9238-092a48c51909` → **200**

```json
{
  "id": "0628d905-2ae1-47b9-9238-092a48c51909",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "64f37fbb-8fb0-49ce-b6b3-504fbbcfd587",
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
    "id": "55468b82-56c1-4651-9bf8-0aee83754116",
    "order_id": "0628d905-2ae1-47b9-9238-092a48c51909",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0afa7e08-ea34-426d-bcea-dfb51e2ba36f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:38:00.650796Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0628d905-2ae1-47b9-9238-092a48c51909/cancel` → **200**

```json
{
  "command_id": "c038101a-e33e-43c4-a6aa-7070ef788ad4",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0628d905-2ae1-47b9-9238-092a48c51909",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "64f37fbb-8fb0-49ce-b6b3-504fbbcfd587",
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
    "id": "55468b82-56c1-4651-9bf8-0aee83754116",
    "order_id": "0628d905-2ae1-47b9-9238-092a48c51909",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0afa7e08-ea34-426d-bcea-dfb51e2ba36f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:38:00.650796Z",
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
  "session_id": "cab47c5c-3a06-465e-aa94-359d7146bc19",
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
  "last_heartbeat_at": "2026-10-28T13:37:56.808415Z",
  "last_location_at": "2026-10-28T13:37:56.808415Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cab47c5c-3a06-465e-aa94-359d7146bc19/close` → **200**

```json
{
  "command_id": "a39e4505-9344-4b99-aff9-8c4ce718b16a",
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
  "session_id": "81adc930-259f-4b46-bd08-6b02be407452",
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
  "last_heartbeat_at": "2026-10-28T13:37:58.316106Z",
  "last_location_at": "2026-10-28T13:37:58.316106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81adc930-259f-4b46-bd08-6b02be407452/close` → **200**

```json
{
  "command_id": "050b33b8-b109-4809-b9ef-75d925a28ccc",
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
  "device_ref": "sandbox-32057"
}
```

```json
{
  "challenge_id": "0ac7e1ae-8ff2-48a5-9b11-b276a2295561",
  "expires_at": "2026-10-28T13:43:04.31491325Z",
  "resend_available_at": "2026-10-28T13:38:05.31491325Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "430314",
  "sent_at": "2026-10-28T13:38:04.317213363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ac7e1ae-8ff2-48a5-9b11-b276a2295561",
  "code": "430314",
  "device_ref": "sandbox-32057"
}
```

```json
{
  "session_id": "65e0ce70-bf6a-4ebb-9fff-d90301857099",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTU4NCwiaWF0IjoxNzkzMTk0Njg0LCJqdGkiOiI1NjI4YWE2MC02OTQ3LTRjNWEtOWI4OS1mOGI3ODY2ZjIwNGIiLCJzaWQiOiI2NWUwY2U3MC1iZjZhLTRlYmItOWZmZi1kOTAzMDE4NTcwOTkifQ.G31dDpBIDV0iJ_QboS8XZtPzDFJgv79UibMccs4-6r4",
  "access_expires_at": "2026-10-28T13:53:04.615650358Z",
  "refresh_token": "4R6M5HBV13JtL72ebzdeeHBecPpe_gydrOBwoyBr2Do",
  "refresh_expires_at": "2026-11-27T13:38:04.615099152Z",
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
  "command_id": "8207cf2c-3122-48ae-aec6-298562081df0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:05Z",
    "sequence": 1793194685188
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:05.206885Z",
  "last_location_at": "2026-10-28T13:38:05.206885Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679684358",
  "device_ref": "sandbox-32749"
}
```

```json
{
  "challenge_id": "f023e023-123a-4df3-9427-88c30ba67115",
  "expires_at": "2026-10-28T13:43:05.496311029Z",
  "resend_available_at": "2026-10-28T13:38:06.496311029Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679684358` → **200**

```json
{
  "phone": "+380679684358",
  "audience": "CLIENT",
  "code": "358975",
  "sent_at": "2026-10-28T13:38:05.49883865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f023e023-123a-4df3-9427-88c30ba67115",
  "code": "358975",
  "device_ref": "sandbox-32749"
}
```

```json
{
  "session_id": "6195a34f-68cc-4c57-a4e2-272b3ac8ba4e",
  "subject": {
    "type": "CLIENT",
    "id": "ff98d8da-36ed-4484-a21e-240117ede19a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjk4ZDhkYS0zNmVkLTQ0ODQtYTIxZS0yNDAxMTdlZGUxOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NTg1LCJpYXQiOjE3OTMxOTQ2ODUsImp0aSI6IjNmZmIyYTI4LWZkNDMtNDc2Yi05MjUyLTYxOWQ0OWY1ZWY4ZSIsInNpZCI6IjYxOTVhMzRmLTY4Y2MtNGM1Ny1hNGUyLTI3MmIzYWM4YmE0ZSJ9.0qdq4uZqXCVUrQrzTftetPMwLK97ZXVe2DMF3UzLqWs",
  "access_expires_at": "2026-10-28T13:53:05.805250954Z",
  "refresh_token": "R5HQSFP6PDIzVxItsnX3upoatTmzOJaKsgGBxqq9HdU",
  "refresh_expires_at": "2026-11-27T13:38:05.804721419Z",
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
  "command_id": "e3793bad-da18-4b8c-89fc-1495ebadcdf3",
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
  "id": "9224b1bc-d9f4-4a1f-a9a5-d5d175e10192",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:06.374147Z",
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
  "command_id": "edffa460-b4b0-43ef-9cf6-2c3cf5a9e41a",
  "platform": "ANDROID",
  "token": "sandbox-driver-534224fc-dcf5-41d8-b7ca-1435d2fb3b17"
}
```

```json
{
  "id": "0b0ef342-f165-4821-a5ef-48634f430d1a",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:38:06.674933Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "77ab772a-bb2b-4f68-8054-9a18aad654a8",
  "platform": "ANDROID",
  "token": "sandbox-rider-cc179ef1-25b7-46ad-ba46-7e161de537de"
}
```

```json
{
  "id": "3e3a5e64-296c-4130-a9b8-cbaf85341f74",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:38:06.963237Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cffa26ae-1733-4c7a-a400-60cf68ad4893",
  "quote_id": "9224b1bc-d9f4-4a1f-a9a5-d5d175e10192",
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
  "id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ff98d8da-36ed-4484-a21e-240117ede19a",
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
  "created_at": "2026-10-28T13:38:07.259445Z",
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
    "id": "6368c6cb-4bbb-4468-bc4c-8102fd874883",
    "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
    "expires_at": "2026-10-28T13:38:22.262485Z",
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

`POST /api/driver/v1/offers/6368c6cb-4bbb-4468-bc4c-8102fd874883/accept` → **200**

```json
{
  "command_id": "25dd8a34-b66a-477c-bd88-f3ff36346065"
}
```

```json
{
  "id": "80371c24-d0f9-4f04-b3db-e7392d7da3a7",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6581781a-0b5a-421e-a66b-598ea01535b7",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:38:07.234Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:38:07.234Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:38:08.365997162Z",
    "token_suffix": "fb3b17",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "ae3ec6e1-7d86-48cf-9b02-16f7a63fa075",
      "order_version": "2",
      "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679684358&after=2026-10-28T13:38:07.234Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679684358&after=2026-10-28T13:38:07.234Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:38:09.371347065Z",
    "token_suffix": "e537de",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "f2254703-d578-4505-af27-0eca202a4167",
      "order_version": "3",
      "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/9a1520fd-2d21-4a97-904c-bf02659f8ce4/messages` → **201**

```json
{
  "command_id": "b5cb4086-22e3-4350-baed-e2cabaa712e7",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "f0de8c13-4023-44e1-a454-b71b98de61de",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T13:38:10.285656979Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6581781a-0b5a-421e-a66b-598ea01535b7",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "assignment_id": "80371c24-d0f9-4f04-b3db-e7392d7da3a7",
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

`POST /api/driver/v1/trips/6581781a-0b5a-421e-a66b-598ea01535b7/messages` → **201**

```json
{
  "command_id": "c3a3f44c-8424-4c4f-86ac-1376b0228e1f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "e16cf3b1-54a9-42b0-b8dd-019921f49c9f",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T13:38:10.842415739Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/9a1520fd-2d21-4a97-904c-bf02659f8ce4/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/6581781a-0b5a-421e-a66b-598ea01535b7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679684358"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/6c8d0815-53c7-4d16-8ac7-b99deb951137/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:11Z",
    "sequence": 1793194691679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:11.699988Z",
  "last_location_at": "2026-10-28T13:38:11.699988Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6581781a-0b5a-421e-a66b-598ea01535b7",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "assignment_id": "80371c24-d0f9-4f04-b3db-e7392d7da3a7",
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

`POST /api/driver/v1/trips/6581781a-0b5a-421e-a66b-598ea01535b7/arrive` → **200**

```json
{
  "command_id": "8c09e3d6-e42d-4160-87c8-14da66ecf865",
  "expected_version": 0
}
```

```json
{
  "id": "6581781a-0b5a-421e-a66b-598ea01535b7",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "assignment_id": "80371c24-d0f9-4f04-b3db-e7392d7da3a7",
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
  "arrived_at": "2026-10-28T13:38:12.272427Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6581781a-0b5a-421e-a66b-598ea01535b7/start` → **200**

```json
{
  "command_id": "25f13b4d-7604-4859-8c40-9c9f0f6e1d5b",
  "expected_version": 1
}
```

```json
{
  "id": "6581781a-0b5a-421e-a66b-598ea01535b7",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "assignment_id": "80371c24-d0f9-4f04-b3db-e7392d7da3a7",
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
  "arrived_at": "2026-10-28T13:38:12.272427Z",
  "started_at": "2026-10-28T13:38:12.568843Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6c8d0815-53c7-4d16-8ac7-b99deb951137/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:12Z",
    "sequence": 1793194692852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:12.875271Z",
  "last_location_at": "2026-10-28T13:38:12.875271Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/6581781a-0b5a-421e-a66b-598ea01535b7/complete` → **200**

```json
{
  "command_id": "64c71107-f7a6-40bf-a45e-9e5691429d56",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:38:13Z",
  "cash_received": true
}
```

```json
{
  "id": "6581781a-0b5a-421e-a66b-598ea01535b7",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "assignment_id": "80371c24-d0f9-4f04-b3db-e7392d7da3a7",
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
  "arrived_at": "2026-10-28T13:38:12.272427Z",
  "started_at": "2026-10-28T13:38:12.568843Z",
  "completed_at": "2026-10-28T13:38:13.170978Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/9a1520fd-2d21-4a97-904c-bf02659f8ce4` → **200**

```json
{
  "id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ff98d8da-36ed-4484-a21e-240117ede19a",
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
    "id": "80371c24-d0f9-4f04-b3db-e7392d7da3a7",
    "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6581781a-0b5a-421e-a66b-598ea01535b7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:38:07.259445Z",
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
    "id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:38:07.259445Z",
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
    "id": "6581781a-0b5a-421e-a66b-598ea01535b7",
    "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
    "order_short_number": 9,
    "created_at": "2026-10-28T13:38:07.865071Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4fc2b39f-1137-4cad-b711-ad221bfb857a",
    "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
    "order_short_number": 2,
    "created_at": "2026-10-28T13:36:36.694192Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "82247b72-a104-4266-9223-3493938f6ef7",
    "order_id": "85a4b3f3-322e-4c01-b391-0c66de6440c1",
    "order_short_number": 1,
    "created_at": "2026-10-28T13:36:17.307723Z",
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

`GET /api/rider/v1/orders/9a1520fd-2d21-4a97-904c-bf02659f8ce4/tip` → **200**

```json
{
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
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
  "available_until": "2026-10-29T13:38:13.170978Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9a1520fd-2d21-4a97-904c-bf02659f8ce4/tip` → **201**

```json
{
  "command_id": "b318ee70-02ae-4f56-97db-fdf5bd474d16",
  "amount_minor": 1100
}
```

```json
{
  "id": "393c99f1-0758-4333-a0ed-11f7dc64e889",
  "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T13:38:18.225017Z"
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
  "session_id": "0c12b6de-dda7-4424-a04f-fe93413a3c4c",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1OTgsImlhdCI6MTc5MzE5NDY5OCwianRpIjoiYzE2NWM0MjktMTM2MS00YTQ4LTk1Y2EtZTljODg0MTczMWMxIiwic2lkIjoiMGMxMmI2ZGUtZGRhNy00NDI0LWEwNGYtZmU5MzQxM2EzYzRjIn0.ZOkh27tlE5DLA1Qrhdweh-LdQ9aEAtFMWZ_XCB1aJ3s",
  "access_expires_at": "2026-10-28T13:53:18.821376866Z",
  "refresh_token": "60foQoWn2YLt3FiNv3MZ5lpxEKCJP4UF7MFry1V5LWQ",
  "refresh_expires_at": "2026-10-29T01:38:18.820755819Z",
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
  "generated_at": "2026-10-28T13:38:19.123024252Z"
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
  "generated_at": "2026-10-28T13:38:19.414457263Z"
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
  "session_id": "2be68ad0-07c0-482b-88fd-528c1d7537ac",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU1OTksImlhdCI6MTc5MzE5NDY5OSwianRpIjoiN2FmZjcwOGItOWExNC00YTU3LTk1ZjktZmYxYjZkMDU5YTA5Iiwic2lkIjoiMmJlNjhhZDAtMDdjMC00ODJiLTg4ZmQtNTI4YzFkNzUzN2FjIn0.SDvBC95Mny_Mz3OmMRz3HyFCKs8Ga5jM2C2CInKrj0o",
  "access_expires_at": "2026-10-28T13:53:19.992963535Z",
  "refresh_token": "ra7RMXeC6B7acuY0xYYOee8zxOIdEPcWoE1qrIQrM9w",
  "refresh_expires_at": "2026-10-29T01:38:19.992332112Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9a1520fd-2d21-4a97-904c-bf02659f8ce4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:38:07.259906Z",
      "actor": {
        "type": "CLIENT",
        "id": "ff98d8da-36ed-4484-a21e-240117ede19a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
        "quote_id": "9224b1bc-d9f4-4a1f-a9a5-d5d175e10192",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ae70c6a9-ec04-48b6-841f-85e4d7ae4735"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:38:07.261698Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
        "attempt_id": "ede3ebf1-b8f0-4fdc-9750-40d397c375e4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ae70c6a9-ec04-48b6-841f-85e4d7ae4735"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:38:07.265288Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6368c6cb-4bbb-4468-bc4c-8102fd874883",
        "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "ae70c6a9-ec04-48b6-841f-85e4d7ae4735"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:38:07.866946Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6368c6cb-4bbb-4468-bc4c-8102fd874883",
        "order_id": "9a1520fd-2d21-4a97-904c-bf02659f8ce4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "80371c24-d0f9-4f04-b3db-e7392d7da3a7"
      },
      "correlation_id": "11ca0afe-bba9-4bdc-a36a-d760fd852d8f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T13:38:20.574666944Z",
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
      "last_location_at": "2026-10-28T13:38:12.875271Z",
      "order_id": null
    }
  ]
}
```

Done: order 9a1520fd-2d21-4a97-904c-bf02659f8ce4.

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
  "session_id": "230bc24c-7cec-476b-bca5-807a82ce82a3",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2MDEsImlhdCI6MTc5MzE5NDcwMSwianRpIjoiNjUwNjBiMjMtZTkwMC00NjAzLTk5ZDAtMzZjMWM3MTM5NTZiIiwic2lkIjoiMjMwYmMyNGMtN2NlYy00NzZiLWJjYTUtODA3YTgyY2U4MmEzIn0.UPIqXMfpFKSIqncKnud75o8du6lBRpyueEDo6bkxgE8",
  "access_expires_at": "2026-10-28T13:53:21.181132639Z",
  "refresh_token": "OFKIQrW7gRV40X23ZzDGI907kntqmB1M-eteH2ulZ-I",
  "refresh_expires_at": "2026-10-29T01:38:21.180476537Z",
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
  "command_id": "08398953-8818-4e18-ae31-9c5562e9b28e",
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
  "timestamp": "2026-10-28T13:38:22.000+0000",
  "channel": {
    "id": "1730052000.1473722532",
    "linkedid": "1730052000.1473722532",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674505682"
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
  "timestamp": "2026-10-28T13:38:22.000+0000",
  "channel": {
    "id": "1730052000.1473722532",
    "linkedid": "1730052000.1473722532",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674505682"
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
  "session_id": "82ffe680-fd84-4cbe-907e-1d69e35923b6",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2MDIsImlhdCI6MTc5MzE5NDcwMiwianRpIjoiNjE3M2RhNzItY2NhYi00NTliLTkzOWQtM2ZjMjQ1Mzg0NWFjIiwic2lkIjoiODJmZmU2ODAtZmQ4NC00Y2JlLTkwN2UtMWQ2OWUzNTkyM2I2In0.o_hJRvTbpWVXA6GCI9A0yBGIhOWkSkpv0mZYIZssUZw",
  "access_expires_at": "2026-10-28T13:53:22.382199196Z",
  "refresh_token": "Pfj7_kd_b_lgJf7qNwAFDtAWHoe97ziEd7BvIGv08wg",
  "refresh_expires_at": "2026-10-29T01:38:22.381581627Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "5d61688b-8639-41b2-94b1-aacd93b95c34",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674505682",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:38:22Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/5d61688b-8639-41b2-94b1-aacd93b95c34/answer` → **200**

```json
{
  "command_id": "06342253-6658-4022-8de6-218b80c4331f"
}
```

```json
{
  "id": "5d61688b-8639-41b2-94b1-aacd93b95c34",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674505682",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "order_ids": [],
  "started_at": "2026-10-28T13:38:22Z",
  "answered_at": "2026-10-28T13:38:22.974017Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1473722532",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7703fb2e-9636-48a7-b2dd-25a803da94a9",
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
  "id": "9f13af2e-748e-43d3-b0d8-19c68da7380d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:23.309053Z",
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
  "command_id": "9d3e1d76-cbc7-4812-b1b8-180ff8854ffe",
  "quote_id": "9f13af2e-748e-43d3-b0d8-19c68da7380d",
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
    "phone": "+380674505682"
  },
  "call_id": "5d61688b-8639-41b2-94b1-aacd93b95c34"
}
```

```json
{
  "id": "2adfcf6d-b073-45c1-8f1b-b994ff5586d6",
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
  "created_at": "2026-10-28T13:38:23.618152Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674505682"
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
    "id": "1730052000.1473722532",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5d61688b-8639-41b2-94b1-aacd93b95c34",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674505682",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [
        "2adfcf6d-b073-45c1-8f1b-b994ff5586d6"
      ],
      "started_at": "2026-10-28T13:38:22Z",
      "answered_at": "2026-10-28T13:38:22.974017Z",
      "ended_at": "2026-10-28T13:38:23.95717Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b97c1ad4-9260-43eb-bc31-463cec548e46",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676522619",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [],
      "started_at": "2026-10-28T13:36:25.496121Z",
      "answered_at": "2026-10-28T13:36:25.82534Z",
      "ended_at": "2026-10-28T13:36:26.135328Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:36:31.94147Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/2adfcf6d-b073-45c1-8f1b-b994ff5586d6` → **200**

```json
{
  "id": "2adfcf6d-b073-45c1-8f1b-b994ff5586d6",
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
  "created_at": "2026-10-28T13:38:23.618152Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674505682"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/2adfcf6d-b073-45c1-8f1b-b994ff5586d6` → **200**

```json
{
  "id": "2adfcf6d-b073-45c1-8f1b-b994ff5586d6",
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
  "created_at": "2026-10-28T13:38:23.618152Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674505682"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2adfcf6d-b073-45c1-8f1b-b994ff5586d6/cancel` → **200**

```json
{
  "command_id": "17b55f5c-4570-4588-acd8-02965ecf9386",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2adfcf6d-b073-45c1-8f1b-b994ff5586d6",
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
  "created_at": "2026-10-28T13:38:23.618152Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674505682"
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

Done: call 5d61688b-8639-41b2-94b1-aacd93b95c34 with order 2adfcf6d-b073-45c1-8f1b-b994ff5586d6.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4911"
}
```

```json
{
  "challenge_id": "568cc3d3-c284-4fbe-97b1-20e353d1589b",
  "expires_at": "2026-10-28T13:43:25.228307866Z",
  "resend_available_at": "2026-10-28T13:38:26.228307866Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "254023",
  "sent_at": "2026-10-28T13:38:25.230824405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "568cc3d3-c284-4fbe-97b1-20e353d1589b",
  "code": "254023",
  "device_ref": "sandbox-4911"
}
```

```json
{
  "session_id": "0638c751-ca72-4988-be25-8fc0244483b8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTYwNSwiaWF0IjoxNzkzMTk0NzA1LCJqdGkiOiJmMWM3N2I2Ny00Y2MxLTQ3MTItOWY2My04NjViNTA2YzI2NjYiLCJzaWQiOiIwNjM4Yzc1MS1jYTcyLTQ5ODgtYmUyNS04ZmMwMjQ0NDgzYjgifQ.FpgW84v3OLPJisgVHEQ7QkILD5TzmRAfEetLKuwOksA",
  "access_expires_at": "2026-10-28T13:53:25.552534984Z",
  "refresh_token": "yqcX87Lo8mk9ZBGnymCz9G2JZrVKvpNVjuaGtS42ajk",
  "refresh_expires_at": "2026-11-27T13:38:25.551888339Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:12.875271Z",
  "last_location_at": "2026-10-28T13:38:12.875271Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c8d0815-53c7-4d16-8ac7-b99deb951137/handover` → **200**

```json
{
  "command_id": "d35bca6e-8c59-470e-8867-da93ee48647f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:12.875271Z",
  "last_location_at": "2026-10-28T13:38:12.875271Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c8d0815-53c7-4d16-8ac7-b99deb951137/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:26Z",
    "sequence": 1793194706429
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:26.451913Z",
  "last_location_at": "2026-10-28T13:38:26.451913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662758589",
  "device_ref": "sandbox-29521"
}
```

```json
{
  "challenge_id": "9dd402bd-dfdf-43d0-a22d-8da3200504c0",
  "expires_at": "2026-10-28T13:43:26.738224504Z",
  "resend_available_at": "2026-10-28T13:38:27.738224504Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662758589` → **200**

```json
{
  "phone": "+380662758589",
  "audience": "CLIENT",
  "code": "136912",
  "sent_at": "2026-10-28T13:38:26.740651164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9dd402bd-dfdf-43d0-a22d-8da3200504c0",
  "code": "136912",
  "device_ref": "sandbox-29521"
}
```

```json
{
  "session_id": "39111ed6-b6a8-4ec7-a7d0-6d21a172359b",
  "subject": {
    "type": "CLIENT",
    "id": "f3ca6fbe-212c-4bfa-bb1d-9b4024f7fed9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmM2NhNmZiZS0yMTJjLTRiZmEtYmIxZC05YjQwMjRmN2ZlZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjA3LCJpYXQiOjE3OTMxOTQ3MDcsImp0aSI6ImQzZTE1ZDY5LWQxNDktNDFjZi1iMWY3LTAwZWY2OGIzMDdlMyIsInNpZCI6IjM5MTExZWQ2LWI2YTgtNGVjNy1hN2QwLTZkMjFhMTcyMzU5YiJ9.vYp0Ye487kWECXuVY1aUDBOyrScyCJH0hKNv5pR2woQ",
  "access_expires_at": "2026-10-28T13:53:27.050230964Z",
  "refresh_token": "8luAKVGAPLvuqtF5rHlCoF2U2IRaNnmZ_0JKdPHMOdI",
  "refresh_expires_at": "2026-11-27T13:38:27.049575841Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4aa6910e-6059-4099-8d23-5958a98cfe18",
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
  "id": "9daf408a-7d57-4725-8930-badcbd5116e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:27.350419Z",
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
  "command_id": "b40a6bed-23f5-4318-997f-e5a3df2ed5b2",
  "quote_id": "9daf408a-7d57-4725-8930-badcbd5116e2",
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
  "id": "f83adf90-5372-4673-a040-0dd391f9c189",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3ca6fbe-212c-4bfa-bb1d-9b4024f7fed9",
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
  "created_at": "2026-10-28T13:38:27.658975Z",
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
    "id": "2494c1d5-2862-4c8c-8d1b-881f45089d45",
    "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
    "expires_at": "2026-10-28T13:38:42.662087Z",
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

`POST /api/driver/v1/offers/2494c1d5-2862-4c8c-8d1b-881f45089d45/accept` → **200**

```json
{
  "command_id": "f09cc818-badf-40da-96ac-2428452f0488"
}
```

```json
{
  "id": "31c27c9a-68f4-4a75-b4f9-aca7b9677c7e",
  "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0f6ae848-5054-4f14-a1ca-9394be13cde5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0f6ae848-5054-4f14-a1ca-9394be13cde5",
  "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
  "assignment_id": "31c27c9a-68f4-4a75-b4f9-aca7b9677c7e",
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

`POST /api/driver/v1/work-sessions/6c8d0815-53c7-4d16-8ac7-b99deb951137/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:28Z",
    "sequence": 1793194708804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:28.825829Z",
  "last_location_at": "2026-10-28T13:38:28.825829Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0f6ae848-5054-4f14-a1ca-9394be13cde5/arrive` → **200**

```json
{
  "command_id": "00f06422-477f-4075-b6dd-93258cf1e3a2",
  "expected_version": 0
}
```

```json
{
  "id": "0f6ae848-5054-4f14-a1ca-9394be13cde5",
  "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
  "assignment_id": "31c27c9a-68f4-4a75-b4f9-aca7b9677c7e",
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
  "arrived_at": "2026-10-28T13:38:29.127097Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0f6ae848-5054-4f14-a1ca-9394be13cde5/start` → **200**

```json
{
  "command_id": "9407e39a-3dad-4343-826c-1177bc27f5cb",
  "expected_version": 1
}
```

```json
{
  "id": "0f6ae848-5054-4f14-a1ca-9394be13cde5",
  "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
  "assignment_id": "31c27c9a-68f4-4a75-b4f9-aca7b9677c7e",
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
  "arrived_at": "2026-10-28T13:38:29.127097Z",
  "started_at": "2026-10-28T13:38:29.425358Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/6c8d0815-53c7-4d16-8ac7-b99deb951137/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:29Z",
    "sequence": 1793194709699
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:29.719272Z",
  "last_location_at": "2026-10-28T13:38:29.719272Z",
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
  "device_ref": "sandbox-2008"
}
```

```json
{
  "challenge_id": "abba7d01-092c-463d-9700-ee200d66edba",
  "expires_at": "2026-10-28T13:43:30.001569601Z",
  "resend_available_at": "2026-10-28T13:38:31.001569601Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "858712",
  "sent_at": "2026-10-28T13:38:30.003888241Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abba7d01-092c-463d-9700-ee200d66edba",
  "code": "858712",
  "device_ref": "sandbox-2008"
}
```

```json
{
  "session_id": "d0ad76fc-727d-4fd9-a078-46c67f11fabe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTYxMCwiaWF0IjoxNzkzMTk0NzEwLCJqdGkiOiJjNTE2NDFlOS0yMWFiLTQ4NDMtOTcyMy0wZDViM2Q5YzlmMWIiLCJzaWQiOiJkMGFkNzZmYy03MjdkLTRmZDktYTA3OC00NmM2N2YxMWZhYmUifQ.ovIOKAvClchflhUAJi3OXSQfo-Fo7311LHUtkgMQJOc",
  "access_expires_at": "2026-10-28T13:53:30.30414318Z",
  "refresh_token": "LzhqBlRQArfIVP9dB-Ksi5ZLkZ8fawpAQy6YyCLWK4Y",
  "refresh_expires_at": "2026-11-27T13:38:30.303576417Z",
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
  "command_id": "3ec46291-3978-47ef-92dd-a66ce217cd75",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:30Z",
    "sequence": 1793194710853
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ed52126c-cd1c-4011-8bf3-d167fc3093bc",
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
  "last_heartbeat_at": "2026-10-28T13:38:30.87209Z",
  "last_location_at": "2026-10-28T13:38:30.87209Z",
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
  "session_id": "000e233d-6c66-4bb4-9661-840162ae69f6",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2MTEsImlhdCI6MTc5MzE5NDcxMSwianRpIjoiNTMzODNmYTUtMWEwMC00YmFiLWIzY2EtMDY5Y2QyMGUxMDFlIiwic2lkIjoiMDAwZTIzM2QtNmM2Ni00YmI0LTk2NjEtODQwMTYyYWU2OWY2In0.2JRzuqdSuMafxqD9bBfqntLj8GUMYbZ_ur_HBJAhC88",
  "access_expires_at": "2026-10-28T13:53:31.45959332Z",
  "refresh_token": "G4Dng188bHVkvaM5bSWiRFQPEC2hCkVYCt29Sjme1wA",
  "refresh_expires_at": "2026-10-29T01:38:31.458995426Z",
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
  "session_id": "58b7ab33-3870-4383-a2b6-5a2810e94c09",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2MTIsImlhdCI6MTc5MzE5NDcxMiwianRpIjoiZGNhYWFiY2UtZjU4Yy00YWM4LTk0NWEtOGVkNzQwNWE1OWZhIiwic2lkIjoiNThiN2FiMzMtMzg3MC00MzgzLWEyYjYtNWEyODEwZTk0YzA5In0.QsH7nIVMl8M0IMiMUfYyVyJqKkGv6b0RagNBaF77DhI",
  "access_expires_at": "2026-10-28T13:53:32.057412293Z",
  "refresh_token": "TBOrCV70sWPIwdF4tzLNDI8Suu9S04v_QEAB3WbaHOs",
  "refresh_expires_at": "2026-10-29T01:38:32.05675848Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f83adf90-5372-4673-a040-0dd391f9c189` → **200**

```json
{
  "id": "f83adf90-5372-4673-a040-0dd391f9c189",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f3ca6fbe-212c-4bfa-bb1d-9b4024f7fed9",
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
    "id": "31c27c9a-68f4-4a75-b4f9-aca7b9677c7e",
    "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0f6ae848-5054-4f14-a1ca-9394be13cde5",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T13:38:27.658975Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f83adf90-5372-4673-a040-0dd391f9c189/interrupt` → **200**

```json
{
  "command_id": "034fac86-5468-447d-922e-4c1f0acf89ef",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "f83adf90-5372-4673-a040-0dd391f9c189",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "f3ca6fbe-212c-4bfa-bb1d-9b4024f7fed9",
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
      "id": "31c27c9a-68f4-4a75-b4f9-aca7b9677c7e",
      "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "0f6ae848-5054-4f14-a1ca-9394be13cde5",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T13:38:27.658975Z",
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
    "id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "f3ca6fbe-212c-4bfa-bb1d-9b4024f7fed9",
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
    "id": "03775de3-087c-48db-86dd-b0db93b6bd77",
    "order_id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
    "expires_at": "2026-10-28T13:38:47.693313Z",
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

`POST /api/driver/v1/offers/03775de3-087c-48db-86dd-b0db93b6bd77/accept` → **200**

```json
{
  "command_id": "992a157b-0a91-41f9-aa29-4c503d56c21d"
}
```

```json
{
  "id": "1f0c8ad7-b881-4b81-bdc0-765be598cbee",
  "order_id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7cd846a9-3dd1-4d3d-b86f-517ab0ba544b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7cd846a9-3dd1-4d3d-b86f-517ab0ba544b",
  "order_id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
  "assignment_id": "1f0c8ad7-b881-4b81-bdc0-765be598cbee",
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
  "session_id": "ed52126c-cd1c-4011-8bf3-d167fc3093bc",
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
  "last_heartbeat_at": "2026-10-28T13:38:30.87209Z",
  "last_location_at": "2026-10-28T13:38:30.87209Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ed52126c-cd1c-4011-8bf3-d167fc3093bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:34Z",
    "sequence": 1793194714180
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ed52126c-cd1c-4011-8bf3-d167fc3093bc",
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
  "last_heartbeat_at": "2026-10-28T13:38:34.200152Z",
  "last_location_at": "2026-10-28T13:38:34.200152Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7cd846a9-3dd1-4d3d-b86f-517ab0ba544b/arrive` → **200**

```json
{
  "command_id": "7b54a4de-ffbb-4939-b47e-efd64549b652",
  "expected_version": 0
}
```

```json
{
  "id": "7cd846a9-3dd1-4d3d-b86f-517ab0ba544b",
  "order_id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
  "assignment_id": "1f0c8ad7-b881-4b81-bdc0-765be598cbee",
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
  "arrived_at": "2026-10-28T13:38:34.491208Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7cd846a9-3dd1-4d3d-b86f-517ab0ba544b/start` → **200**

```json
{
  "command_id": "6b491a71-0b3b-4782-aee7-b7c2561dbfba",
  "expected_version": 1
}
```

```json
{
  "id": "7cd846a9-3dd1-4d3d-b86f-517ab0ba544b",
  "order_id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
  "assignment_id": "1f0c8ad7-b881-4b81-bdc0-765be598cbee",
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
  "arrived_at": "2026-10-28T13:38:34.491208Z",
  "started_at": "2026-10-28T13:38:34.783896Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7cd846a9-3dd1-4d3d-b86f-517ab0ba544b/complete` → **200**

```json
{
  "command_id": "b1ceba97-8999-4220-9f00-f8450854b9b9",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:38:35Z"
}
```

```json
{
  "id": "7cd846a9-3dd1-4d3d-b86f-517ab0ba544b",
  "order_id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
  "assignment_id": "1f0c8ad7-b881-4b81-bdc0-765be598cbee",
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
  "arrived_at": "2026-10-28T13:38:34.491208Z",
  "started_at": "2026-10-28T13:38:34.783896Z",
  "completed_at": "2026-10-28T13:38:35.092428Z",
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
    "id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:38:32.681126Z",
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
    "id": "f83adf90-5372-4673-a040-0dd391f9c189",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:38:27.658975Z",
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

`GET /api/operator/v1/orders/f83adf90-5372-4673-a040-0dd391f9c189/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:38:27.65954Z",
      "actor": {
        "type": "CLIENT",
        "id": "f3ca6fbe-212c-4bfa-bb1d-9b4024f7fed9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
        "quote_id": "9daf408a-7d57-4725-8930-badcbd5116e2",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "af22e1e6-5e64-4c6f-aa50-ecaa50d979c7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:38:27.661346Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
        "attempt_id": "7e78cb9c-df20-4225-98df-110ec43d4585",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "af22e1e6-5e64-4c6f-aa50-ecaa50d979c7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:38:27.664092Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2494c1d5-2862-4c8c-8d1b-881f45089d45",
        "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "af22e1e6-5e64-4c6f-aa50-ecaa50d979c7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:38:28.238193Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2494c1d5-2862-4c8c-8d1b-881f45089d45",
        "order_id": "f83adf90-5372-4673-a040-0dd391f9c189",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "31c27c9a-68f4-4a75-b4f9-aca7b9677c7e"
      },
      "correlation_id": "b53f3d1b-eb06-4145-9ff6-adf70e8de19f"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/9199e7fb-656c-4c76-a346-8db5d6ea2731/tip` → **200**

```json
{
  "order_id": "9199e7fb-656c-4c76-a346-8db5d6ea2731",
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
  "available_until": "2026-10-29T13:38:35.092428Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/9199e7fb-656c-4c76-a346-8db5d6ea2731/tip` → **409**

```json
{
  "command_id": "9bc3ea12-2df5-4c47-b188-e7f2b524ada8",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/9199e7fb-656c-4c76-a346-8db5d6ea2731/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a451c3b6-5a20-4b2c-928d-493caefafbe7"
}
```

Done: interrupted f83adf90-5372-4673-a040-0dd391f9c189, follow-up 9199e7fb-656c-4c76-a346-8db5d6ea2731.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6c8d0815-53c7-4d16-8ac7-b99deb951137",
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
  "last_heartbeat_at": "2026-10-28T13:38:29.719272Z",
  "last_location_at": "2026-10-28T13:38:29.719272Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c8d0815-53c7-4d16-8ac7-b99deb951137/close` → **200**

```json
{
  "command_id": "7177aedc-642e-4078-a86d-c05209aab176",
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
  "session_id": "ed52126c-cd1c-4011-8bf3-d167fc3093bc",
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
  "last_heartbeat_at": "2026-10-28T13:38:34.200152Z",
  "last_location_at": "2026-10-28T13:38:34.200152Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed52126c-cd1c-4011-8bf3-d167fc3093bc/close` → **200**

```json
{
  "command_id": "df0df5da-682d-4f99-a37b-725553b39ad1",
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
  "session_id": "5e985d3b-2b1b-4d7a-981c-4bd2de0e5d90",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2MjEsImlhdCI6MTc5MzE5NDcyMSwianRpIjoiYTU3N2VlMTAtMDJiZi00ZTQ0LWJiYzUtN2QwYWEyNDc0M2Q2Iiwic2lkIjoiNWU5ODVkM2ItMmIxYi00ZDdhLTk4MWMtNGJkMmRlMGU1ZDkwIn0.9dHfwBQAUC-g-DqMwrDIVndohfORA6sLFKKHVaDxbvk",
  "access_expires_at": "2026-10-28T13:53:41.296504562Z",
  "refresh_token": "ymtGlAQxjQVC6A2lk2ZORkTwFp7L76CzapeBr9Pa7Bo",
  "refresh_expires_at": "2026-10-29T01:38:41.295899875Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "28f5bb71-5eea-49f3-8c44-0e2924c19d5b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:38:41Z"
}
```

```json
{
  "id": "919cc539-8e17-453c-bff6-727fe9fac0f8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:38:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/919cc539-8e17-453c-bff6-727fe9fac0f8/publish` → **200**

```json
{
  "command_id": "4ef37422-b2d2-472a-86da-c49ac1b9619c",
  "expected_version": 0
}
```

```json
{
  "id": "919cc539-8e17-453c-bff6-727fe9fac0f8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:38:41.888341Z",
  "published_at": "2026-10-28T13:38:41.888341Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "919cc539-8e17-453c-bff6-727fe9fac0f8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T13:38:41.888341Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630990421",
  "device_ref": "sandbox-4437"
}
```

```json
{
  "challenge_id": "9e9b0c43-643e-46a1-9a2a-9839372b9df8",
  "expires_at": "2026-10-28T13:43:42.451646769Z",
  "resend_available_at": "2026-10-28T13:38:43.451646769Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630990421` → **200**

```json
{
  "phone": "+380630990421",
  "audience": "CLIENT",
  "code": "904714",
  "sent_at": "2026-10-28T13:38:42.454211108Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e9b0c43-643e-46a1-9a2a-9839372b9df8",
  "code": "904714",
  "device_ref": "sandbox-4437"
}
```

```json
{
  "session_id": "29c19a9c-a232-40fa-ac5e-f652486035f6",
  "subject": {
    "type": "CLIENT",
    "id": "79eaba2f-76c3-4e23-85b8-ccbe496ac3d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OWVhYmEyZi03NmMzLTRlMjMtODViOC1jY2JlNDk2YWMzZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjIyLCJpYXQiOjE3OTMxOTQ3MjIsImp0aSI6IjZjYTFkYTI3LWQ0YjEtNDczMC04NzNmLTliODBjMzk5NTc1YiIsInNpZCI6IjI5YzE5YTljLWEyMzItNDBmYS1hYzVlLWY2NTI0ODYwMzVmNiJ9.padNQ1Mvr0BjJJBQVqmREoWnTxlosrxX6k-ZAr2j8fk",
  "access_expires_at": "2026-10-28T13:53:42.760118953Z",
  "refresh_token": "RxzdcVb3LXFTz-U07AqgZKDq0I39ucWC8tUC5KtZ4wg",
  "refresh_expires_at": "2026-11-27T13:38:42.759495Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "919cc539-8e17-453c-bff6-727fe9fac0f8",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T13:38:41.888341Z",
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
  "command_id": "5f033d1d-a279-4a53-b444-418744e866ac",
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
  "id": "d7eacb8e-11f9-4c56-884e-5f1d749201eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:43.313188Z",
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
  "command_id": "59531a42-8769-4340-9bd2-44ee60409167",
  "quote_id": "d7eacb8e-11f9-4c56-884e-5f1d749201eb",
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
  "correlation_id": "d7de6c4d-389f-4386-af45-6a3b324035dd"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "55796ebb-6f80-43e7-9240-1d75dbb6df00",
  "version_id": "919cc539-8e17-453c-bff6-727fe9fac0f8",
  "language": "uk"
}
```

```json
{
  "version_id": "919cc539-8e17-453c-bff6-727fe9fac0f8",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T13:38:43.889771Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "31bfd105-8414-4d48-8cec-c089ef5dc9cd",
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
  "id": "461d9594-169c-4ca2-91e9-449e46067156",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:44.183150Z",
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
  "command_id": "0e8e97e8-a5ca-495e-afae-2685bc1a62a7",
  "quote_id": "461d9594-169c-4ca2-91e9-449e46067156",
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
  "id": "0f273117-e58f-43c6-9c63-edd182109f24",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "79eaba2f-76c3-4e23-85b8-ccbe496ac3d8",
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
  "created_at": "2026-10-28T13:38:44.490291Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0f273117-e58f-43c6-9c63-edd182109f24` → **200**

```json
{
  "id": "0f273117-e58f-43c6-9c63-edd182109f24",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "79eaba2f-76c3-4e23-85b8-ccbe496ac3d8",
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
  "created_at": "2026-10-28T13:38:44.490291Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0f273117-e58f-43c6-9c63-edd182109f24/cancel` → **200**

```json
{
  "command_id": "f2b0ddd4-4eb6-4afe-b212-bed7904df319",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0f273117-e58f-43c6-9c63-edd182109f24",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "79eaba2f-76c3-4e23-85b8-ccbe496ac3d8",
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
  "created_at": "2026-10-28T13:38:44.490291Z",
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

`POST /api/admin/v1/legal-documents/919cc539-8e17-453c-bff6-727fe9fac0f8` → **409**

```json
{
  "command_id": "5142ec6f-2234-446c-abd7-33d7bcdd5398",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:38:45Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/919cc539-8e17-453c-bff6-727fe9fac0f8",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c3bd50a8-2adf-4410-adf1-04a7b9f61a25"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ccc01882-32b0-4070-a45e-0331d9f7e591",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:38:45Z"
}
```

```json
{
  "id": "68f9e45a-5cf2-4f29-8bd5-c916ede5fa17",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:38:45Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/68f9e45a-5cf2-4f29-8bd5-c916ede5fa17/publish` → **200**

```json
{
  "command_id": "2367c676-7df3-4447-adb9-34b80506965b",
  "expected_version": 0
}
```

```json
{
  "id": "68f9e45a-5cf2-4f29-8bd5-c916ede5fa17",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:38:45.97056Z",
  "published_at": "2026-10-28T13:38:45.97056Z",
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
  "device_ref": "sandbox-816"
}
```

```json
{
  "challenge_id": "6b456ccd-9b35-49cc-8a13-f5daad8efa75",
  "expires_at": "2026-10-28T13:43:46.263787827Z",
  "resend_available_at": "2026-10-28T13:38:47.263787827Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "844695",
  "sent_at": "2026-10-28T13:38:46.265884333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b456ccd-9b35-49cc-8a13-f5daad8efa75",
  "code": "844695",
  "device_ref": "sandbox-816"
}
```

```json
{
  "session_id": "398f3128-041d-4e4a-a548-8334c058af99",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTYyNiwiaWF0IjoxNzkzMTk0NzI2LCJqdGkiOiIxYzM2MDAwYi05YjJhLTQ3NDYtOTljYi00NjhiZTJlYWVjNzgiLCJzaWQiOiIzOThmMzEyOC0wNDFkLTRlNGEtYTU0OC04MzM0YzA1OGFmOTkifQ.u876Uf_AFaR8NnxJDsjXvyeihDoKfhitpCKVzEvPUgE",
  "access_expires_at": "2026-10-28T13:53:46.577053558Z",
  "refresh_token": "G9xe3e3DGi7rEzinAdfDl7_1Ey9GvtYm7I6GnCStJg8",
  "refresh_expires_at": "2026-11-27T13:38:46.576467236Z",
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
  "command_id": "83123e84-2055-4164-9c92-e66c7144fe42",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:47Z",
    "sequence": 1793194727119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2111bcf5-8900-4b6e-9c98-b99e01d541fd",
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
  "last_heartbeat_at": "2026-10-28T13:38:47.13853Z",
  "last_location_at": "2026-10-28T13:38:47.13853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675788421",
  "device_ref": "sandbox-1265"
}
```

```json
{
  "challenge_id": "5aead449-0382-46c5-8b2a-df6cfa629439",
  "expires_at": "2026-10-28T13:43:47.423847538Z",
  "resend_available_at": "2026-10-28T13:38:48.423847538Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675788421` → **200**

```json
{
  "phone": "+380675788421",
  "audience": "CLIENT",
  "code": "257713",
  "sent_at": "2026-10-28T13:38:47.426000114Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5aead449-0382-46c5-8b2a-df6cfa629439",
  "code": "257713",
  "device_ref": "sandbox-1265"
}
```

```json
{
  "session_id": "0b6c553c-6aa1-49c3-a0b0-3ba4db6590f2",
  "subject": {
    "type": "CLIENT",
    "id": "24ebb067-9140-4efd-9a5d-666057bd80b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNGViYjA2Ny05MTQwLTRlZmQtOWE1ZC02NjYwNTdiZDgwYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjI3LCJpYXQiOjE3OTMxOTQ3MjcsImp0aSI6ImNkMTA2Y2ZmLTYzZTItNGQ5OC1iYzQwLWM5ZmUzNzQwODMxZCIsInNpZCI6IjBiNmM1NTNjLTZhYTEtNDljMy1hMGIwLTNiYTRkYjY1OTBmMiJ9.9fGmSBrisb6_hDBWpO6ROlhST9VzkP3VcIA6xpmsabk",
  "access_expires_at": "2026-10-28T13:53:47.729019089Z",
  "refresh_token": "vonWnEIRnIbwdmszpL5cz1Xv5aC-ZkdJrBn8uLNN7Vs",
  "refresh_expires_at": "2026-11-27T13:38:47.728395837Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2999b52e-cb16-430b-90db-504678b1e76c",
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
  "id": "bca5204b-6586-44b7-9af7-2a7ad26572f5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:48.013771Z",
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
  "command_id": "29d3131e-0dd0-4a3a-8c6f-cb9ce4a0b060",
  "quote_id": "bca5204b-6586-44b7-9af7-2a7ad26572f5",
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
    "phone": "+380674925273"
  }
}
```

```json
{
  "id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
  "created_at": "2026-10-28T13:38:48.320812Z",
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
    "id": "dff26e39-4706-44a6-82a3-dd6f60c5a06f",
    "order_id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
    "expires_at": "2026-10-28T13:39:03.324908Z",
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

`POST /api/driver/v1/offers/dff26e39-4706-44a6-82a3-dd6f60c5a06f/accept` → **200**

```json
{
  "command_id": "3bbc9a62-889f-4cc5-9a3d-4b4fe27c1883"
}
```

```json
{
  "id": "8fa104c8-e917-4230-a9dc-fd77f8ec6128",
  "order_id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "10141c18-792f-4149-b3c8-654ed92d098f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "10141c18-792f-4149-b3c8-654ed92d098f",
  "order_id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
  "assignment_id": "8fa104c8-e917-4230-a9dc-fd77f8ec6128",
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
    "phone": "+380674925273"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "60e448a4-99c2-4cc0-af75-e07f46ca4911",
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
  "id": "3e3b9ad1-a0d3-4ff4-bd41-1fd57b4e3877",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:49.507132Z",
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
  "command_id": "e40cf53a-1d9f-463d-8c9a-2733e802d899",
  "quote_id": "3e3b9ad1-a0d3-4ff4-bd41-1fd57b4e3877",
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
  "id": "0c1d2c13-6723-4c44-ae6a-772c98a2713e",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
  "created_at": "2026-10-28T13:38:49.805687Z",
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
  "command_id": "7f45bdca-b3a5-4ad2-9db7-a10ce517a64a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T16:38:50Z"
}
```

```json
{
  "id": "76595e0b-042b-4848-9a4b-eef074264d62",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:50.122800Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:38:50Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "95bb249e-9c9a-4c05-8631-cefb94f730aa",
  "quote_id": "76595e0b-042b-4848-9a4b-eef074264d62",
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
  "pickup_at": "2026-10-28T16:38:50Z"
}
```

```json
{
  "id": "99d5b731-febc-4585-9c2f-2a0b72a65474",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
  "created_at": "2026-10-28T13:38:50.427505Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:38:50Z",
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
  "command_id": "02fe3668-bc0c-4b8f-a3c7-fee6ff675cf8",
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
  "id": "402f90e4-1ce7-4eec-b594-672b4e360a34",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:50.736800Z",
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
  "command_id": "992ce049-2d75-4b34-a631-d161f93fa780",
  "quote_id": "402f90e4-1ce7-4eec-b594-672b4e360a34",
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
  "correlation_id": "ed2112d1-9dc3-487a-b238-8d167682c0cd"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "99d5b731-febc-4585-9c2f-2a0b72a65474",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
      "created_at": "2026-10-28T13:38:50.427505Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T16:38:50Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0c1d2c13-6723-4c44-ae6a-772c98a2713e",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
      "created_at": "2026-10-28T13:38:49.805687Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "0c1d2c13-6723-4c44-ae6a-772c98a2713e",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
  "created_at": "2026-10-28T13:38:49.805687Z",
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

`GET /api/rider/v1/orders/fd7c9dba-8c0b-450d-b850-38ec98858aa2` → **200**

```json
{
  "id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
    "id": "8fa104c8-e917-4230-a9dc-fd77f8ec6128",
    "order_id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "10141c18-792f-4149-b3c8-654ed92d098f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:38:48.320812Z",
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
    "location_at": "2026-10-28T13:38:47.13853Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/fd7c9dba-8c0b-450d-b850-38ec98858aa2/cancel` → **200**

```json
{
  "command_id": "b1adeb0f-de9e-4598-b65d-b09862095a8e",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
    "id": "8fa104c8-e917-4230-a9dc-fd77f8ec6128",
    "order_id": "fd7c9dba-8c0b-450d-b850-38ec98858aa2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "10141c18-792f-4149-b3c8-654ed92d098f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:38:48.320812Z",
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

`GET /api/rider/v1/orders/0c1d2c13-6723-4c44-ae6a-772c98a2713e` → **200**

```json
{
  "id": "0c1d2c13-6723-4c44-ae6a-772c98a2713e",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
  "created_at": "2026-10-28T13:38:49.805687Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0c1d2c13-6723-4c44-ae6a-772c98a2713e/cancel` → **200**

```json
{
  "command_id": "90c46e91-1efa-44e9-aca2-fdc0189bb3b0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0c1d2c13-6723-4c44-ae6a-772c98a2713e",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
  "created_at": "2026-10-28T13:38:49.805687Z",
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

`GET /api/rider/v1/orders/99d5b731-febc-4585-9c2f-2a0b72a65474` → **200**

```json
{
  "id": "99d5b731-febc-4585-9c2f-2a0b72a65474",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
  "created_at": "2026-10-28T13:38:50.427505Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:38:50Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/99d5b731-febc-4585-9c2f-2a0b72a65474/cancel` → **200**

```json
{
  "command_id": "94a3f5c3-4297-4efe-8079-e7b7d83294e8",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "99d5b731-febc-4585-9c2f-2a0b72a65474",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "24ebb067-9140-4efd-9a5d-666057bd80b9",
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
  "created_at": "2026-10-28T13:38:50.427505Z",
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
  "pickup_at": "2026-10-28T16:38:50Z",
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
  "session_id": "2111bcf5-8900-4b6e-9c98-b99e01d541fd",
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
  "last_heartbeat_at": "2026-10-28T13:38:47.13853Z",
  "last_location_at": "2026-10-28T13:38:47.13853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2111bcf5-8900-4b6e-9c98-b99e01d541fd/close` → **200**

```json
{
  "command_id": "4a034b59-c780-4ca1-a788-b0d9ba70d58a",
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

Done: orders fd7c9dba-8c0b-450d-b850-38ec98858aa2, 0c1d2c13-6723-4c44-ae6a-772c98a2713e, 99d5b731-febc-4585-9c2f-2a0b72a65474.

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
  "session_id": "7b3ab23f-1e52-4121-93c5-c73fd62acba6",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2MzQsImlhdCI6MTc5MzE5NDczNCwianRpIjoiMDE0ZTU5ZWUtNzdiZi00MjI3LWIzOGMtMTM5NjBiMjIyMjdmIiwic2lkIjoiN2IzYWIyM2YtMWU1Mi00MTIxLTkzYzUtYzczZmQ2MmFjYmE2In0.SUcCFJ4jakr8QNHpnXwscQyjtYNONFcZZox-7cfGC7o",
  "access_expires_at": "2026-10-28T13:53:54.572033101Z",
  "refresh_token": "qO_V-612vwTH8OQ5-chQZrqey5EAx5Xfhd3sVpTyxs8",
  "refresh_expires_at": "2026-10-29T01:38:54.571195437Z",
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
  "session_id": "113f68c2-96a0-428e-b20a-4d15655840b6",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2MzUsImlhdCI6MTc5MzE5NDczNSwianRpIjoiYTA3MmM5MWEtMTk2Ny00MzAxLWE2ODYtOTcxY2VjOTE2MjgxIiwic2lkIjoiMTEzZjY4YzItOTZhMC00MjhlLWIyMGEtNGQxNTY1NTg0MGI2In0.cA-_1jGyCGdPvnk7tzCr7AQbeAeiNH0lETdqOC_ygX0",
  "access_expires_at": "2026-10-28T13:53:55.138569666Z",
  "refresh_token": "RM9gn8MLBN1cvgDWOqQGQoKpJ4o0TS0xWpGw2pOt-zo",
  "refresh_expires_at": "2026-10-29T01:38:55.137930014Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9990"
}
```

```json
{
  "challenge_id": "56e4f450-3f03-473b-b4b0-68ae672d8397",
  "expires_at": "2026-10-28T13:43:55.414937852Z",
  "resend_available_at": "2026-10-28T13:38:56.414937852Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "442938",
  "sent_at": "2026-10-28T13:38:55.418186757Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56e4f450-3f03-473b-b4b0-68ae672d8397",
  "code": "442938",
  "device_ref": "sandbox-9990"
}
```

```json
{
  "session_id": "29414629-c2fa-4dfb-85b9-255daee38932",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTYzNSwiaWF0IjoxNzkzMTk0NzM1LCJqdGkiOiIwMGNmNGRhMy00M2JmLTRlNzctODk0OC1jN2E3YWYwM2M3Y2QiLCJzaWQiOiIyOTQxNDYyOS1jMmZhLTRkZmItODViOS0yNTVkYWVlMzg5MzIifQ.79joPqbEoJWJJ5AU9v30IL_4y9tz-sU5wuVE77TLQg0",
  "access_expires_at": "2026-10-28T13:53:55.716722773Z",
  "refresh_token": "OuZQRvu3kW3_XMNGBB_F2KbiHlvVEr9PUXVoHU7_ib0",
  "refresh_expires_at": "2026-11-27T13:38:55.716128205Z",
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
  "command_id": "a77580cd-01f1-4eb8-90a9-5be7dc2f3a0c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:56Z",
    "sequence": 1793194736256
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a819aafb-2f8c-4621-8a51-41f872156770",
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
  "last_heartbeat_at": "2026-10-28T13:38:56.276572Z",
  "last_location_at": "2026-10-28T13:38:56.276572Z",
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
  "command_id": "a40cbaa2-c8c9-4e68-84ef-e390e1107fbc",
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
  "effective_at": "2026-10-28T13:38:56.866655Z",
  "changed_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T13:36:42.464597Z",
  "last_entries": [
    {
      "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T13:36:42.464597Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c12977dd-ed71-4cd5-b579-10af780ca2ff",
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
  "id": "ae271d5d-ae6c-46c5-bfc8-d9ed77b71de2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:43:57.437317Z",
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
  "command_id": "9a170e05-f99a-47f3-a697-dada99598500",
  "quote_id": "ae271d5d-ae6c-46c5-bfc8-d9ed77b71de2",
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
    "phone": "+3806711129870"
  }
}
```

```json
{
  "id": "90803ca9-f745-4fe4-8e4b-e670b071473e",
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
  "created_at": "2026-10-28T13:38:57.728119Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129870"
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
    "id": "aecc050a-13fc-452d-8d8b-7a04ec83c7b9",
    "order_id": "90803ca9-f745-4fe4-8e4b-e670b071473e",
    "expires_at": "2026-10-28T13:39:12.73194Z",
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

`POST /api/driver/v1/offers/aecc050a-13fc-452d-8d8b-7a04ec83c7b9/accept` → **200**

```json
{
  "command_id": "0a495e92-4e62-434b-8150-5f1c889e43e4"
}
```

```json
{
  "id": "86580b24-2ffd-42d7-97e5-00525735d9d4",
  "order_id": "90803ca9-f745-4fe4-8e4b-e670b071473e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eddc27a2-b04c-432a-99e1-607e92b2b5ce",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eddc27a2-b04c-432a-99e1-607e92b2b5ce",
  "order_id": "90803ca9-f745-4fe4-8e4b-e670b071473e",
  "assignment_id": "86580b24-2ffd-42d7-97e5-00525735d9d4",
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
    "phone": "+3806711129870"
  }
}
```

`POST /api/driver/v1/work-sessions/a819aafb-2f8c-4621-8a51-41f872156770/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:38:58Z",
    "sequence": 1793194738866
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a819aafb-2f8c-4621-8a51-41f872156770",
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
  "last_heartbeat_at": "2026-10-28T13:38:58.885925Z",
  "last_location_at": "2026-10-28T13:38:58.885925Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/eddc27a2-b04c-432a-99e1-607e92b2b5ce/arrive` → **200**

```json
{
  "command_id": "74e87039-f40e-40bf-ab14-68ac00e66c87",
  "expected_version": 0
}
```

```json
{
  "id": "eddc27a2-b04c-432a-99e1-607e92b2b5ce",
  "order_id": "90803ca9-f745-4fe4-8e4b-e670b071473e",
  "assignment_id": "86580b24-2ffd-42d7-97e5-00525735d9d4",
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
  "arrived_at": "2026-10-28T13:38:59.174431Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711129870"
  }
}
```

`POST /api/driver/v1/trips/eddc27a2-b04c-432a-99e1-607e92b2b5ce/start` → **200**

```json
{
  "command_id": "f255774b-460e-46aa-97bf-1fa94ccaab44",
  "expected_version": 1
}
```

```json
{
  "id": "eddc27a2-b04c-432a-99e1-607e92b2b5ce",
  "order_id": "90803ca9-f745-4fe4-8e4b-e670b071473e",
  "assignment_id": "86580b24-2ffd-42d7-97e5-00525735d9d4",
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
  "arrived_at": "2026-10-28T13:38:59.174431Z",
  "started_at": "2026-10-28T13:38:59.476019Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711129870"
  }
}
```

`POST /api/driver/v1/trips/eddc27a2-b04c-432a-99e1-607e92b2b5ce/complete` → **200**

```json
{
  "command_id": "87c29380-0ce9-4411-9231-66f224aa14cc",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:38:59Z",
  "cash_received": true
}
```

```json
{
  "id": "eddc27a2-b04c-432a-99e1-607e92b2b5ce",
  "order_id": "90803ca9-f745-4fe4-8e4b-e670b071473e",
  "assignment_id": "86580b24-2ffd-42d7-97e5-00525735d9d4",
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
  "arrived_at": "2026-10-28T13:38:59.174431Z",
  "started_at": "2026-10-28T13:38:59.476019Z",
  "completed_at": "2026-10-28T13:38:59.770337Z",
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
  "command_id": "07bf031c-6707-42dc-b31e-5fb5e45936ee",
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
  "id": "a284147c-888b-46c4-842d-c27a976c079c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:44:00.063864Z",
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
  "command_id": "26f43402-758c-4055-bc08-0049477ca5db",
  "quote_id": "a284147c-888b-46c4-842d-c27a976c079c",
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
    "phone": "+380671113414"
  }
}
```

```json
{
  "id": "7d41d7c9-1aa7-4238-9934-4a2b1d3aa754",
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
  "created_at": "2026-10-28T13:39:00.366755Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113414"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/7d41d7c9-1aa7-4238-9934-4a2b1d3aa754` → **200**

```json
{
  "id": "7d41d7c9-1aa7-4238-9934-4a2b1d3aa754",
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
  "created_at": "2026-10-28T13:39:00.366755Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113414"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7d41d7c9-1aa7-4238-9934-4a2b1d3aa754/cancel` → **200**

```json
{
  "command_id": "839d9031-c5c7-4278-aca4-73bdebdfaa2d",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "7d41d7c9-1aa7-4238-9934-4a2b1d3aa754",
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
  "created_at": "2026-10-28T13:39:00.366755Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113414"
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
  "staff_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T13:36:42.464597Z",
  "last_entries": [
    {
      "order_id": "7d41d7c9-1aa7-4238-9934-4a2b1d3aa754",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T13:39:00.971459Z"
    },
    {
      "order_id": "90803ca9-f745-4fe4-8e4b-e670b071473e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T13:38:59.77522Z"
    },
    {
      "order_id": "b707be24-36f6-411c-8e8c-370f1f81ef47",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T13:36:42.464597Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a819aafb-2f8c-4621-8a51-41f872156770",
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
  "last_heartbeat_at": "2026-10-28T13:38:58.885925Z",
  "last_location_at": "2026-10-28T13:38:58.885925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a819aafb-2f8c-4621-8a51-41f872156770/close` → **200**

```json
{
  "command_id": "63f536df-8b43-41c0-a6e5-cab2499b0405",
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

Done: operator bonus for fulfilled 90803ca9-f745-4fe4-8e4b-e670b071473e and operator-fault cancellation 7d41d7c9-1aa7-4238-9934-4a2b1d3aa754.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670210567",
  "device_ref": "sandbox-23563"
}
```

```json
{
  "challenge_id": "e4ab0076-e3cc-4184-bdaa-55a83aab0784",
  "expires_at": "2026-10-28T13:44:04.154180714Z",
  "resend_available_at": "2026-10-28T13:39:05.154180714Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670210567` → **200**

```json
{
  "phone": "+380670210567",
  "audience": "CLIENT",
  "code": "765396",
  "sent_at": "2026-10-28T13:39:04.156707442Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678131459",
  "device_ref": "sandbox-32178",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "31b41a47-ca12-49a3-8b80-115795f14e89",
  "expires_at": "2026-10-28T13:44:04.473787107Z",
  "resend_available_at": "2026-10-28T13:39:05.473787107Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678131459` → **200**

```json
{
  "phone": "+380678131459",
  "audience": "CLIENT",
  "code": "623926",
  "sent_at": "2026-10-28T13:39:04.475870635Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670520000",
  "device_ref": "sandbox-20091"
}
```

```json
{
  "challenge_id": "c140e6ff-8ddb-4700-8dd4-a9cf826ea69e",
  "expires_at": "2026-10-28T13:44:04.772022579Z",
  "resend_available_at": "2026-10-28T13:39:05.772022579Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670520000` → **200**

```json
{
  "phone": "+380670520000",
  "audience": "CLIENT",
  "code": "883574",
  "sent_at": "2026-10-28T13:39:04.774712241Z",
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
  "session_id": "20aeae02-eaf6-4270-8c0a-0257141c90b5",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2NDUsImlhdCI6MTc5MzE5NDc0NSwianRpIjoiNTRiMWEzMWMtNmE0MC00YWU3LTk4MTItNDllZTJlMmE4YzA3Iiwic2lkIjoiMjBhZWFlMDItZWFmNi00MjcwLThjMGEtMDI1NzE0MWM5MGI1In0.kfAZhLGPQx9EeSsYjzv6ERZOt7d97oLKyEBG6DjwXTc",
  "access_expires_at": "2026-10-28T13:54:05.362131303Z",
  "refresh_token": "E6QasabOG94RaFlUxgctauCxHR2QirocOVeQNfZb1uY",
  "refresh_expires_at": "2026-10-29T01:39:05.361545793Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670520000` → **200**

```json
{
  "deliveries": [
    {
      "id": "eb151829-d717-4fe4-91e2-241444506e8c",
      "challenge_id": "c140e6ff-8ddb-4700-8dd4-a9cf826ea69e",
      "phone": "+380670520000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-dd6c4c9f-8463-4f7b-b8c3-83201dc2dca7",
      "error": null,
      "attempted_at": "2026-10-28T13:39:04.774935Z"
    },
    {
      "id": "d6308f2d-ec0c-4d57-b42c-579aff26986e",
      "challenge_id": "c140e6ff-8ddb-4700-8dd4-a9cf826ea69e",
      "phone": "+380670520000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T13:39:04.774208Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670520000` → **200**

```json
{
  "phone": "+380670520000",
  "audience": "CLIENT",
  "code": "883574",
  "sent_at": "2026-10-28T13:39:04.774712241Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678131459` → **200**

```json
{
  "deliveries": [
    {
      "id": "c1259c02-12ab-4b5a-ac6f-a1b77588891a",
      "challenge_id": "31b41a47-ca12-49a3-8b80-115795f14e89",
      "phone": "+380678131459",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-395dd86a-a112-442e-af7e-7a0340772eef",
      "error": null,
      "attempted_at": "2026-10-28T13:39:04.476085Z"
    }
  ]
}
```

Done: SMS to +380670210567, a call to +380678131459, SMS then a call to +380670520000.

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
  "session_id": "c5e80278-cb8f-4556-b7d6-209ed0da3f84",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2NDYsImlhdCI6MTc5MzE5NDc0NiwianRpIjoiZjE1YzZjZDItMmVhNi00NjRmLWIyOTUtOGMwNmEyYTRkNWNhIiwic2lkIjoiYzVlODAyNzgtY2I4Zi00NTU2LWI3ZDYtMjA5ZWQwZGEzZjg0In0.aREDf805DR04tmbtLFseFe3AUgbkXsZPXUg7YtS2h28",
  "access_expires_at": "2026-10-28T13:54:06.54108261Z",
  "refresh_token": "MeZoMh9lUFkOl9vrBO2GcvGluR5198cEFthJg5gftzI",
  "refresh_expires_at": "2026-10-29T01:39:06.540508391Z",
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
  "session_id": "4c986aa1-a578-43ad-912c-cdaf9556f839",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2NDcsImlhdCI6MTc5MzE5NDc0NywianRpIjoiM2E1OWI1MDUtN2M4NC00MzdlLWJhZDAtNjQzYmNjMzg3ZGFjIiwic2lkIjoiNGM5ODZhYTEtYTU3OC00M2FkLTkxMmMtY2RhZjk1NTZmODM5In0.-XvvvVDMZPBE1JOvBoO4xsHLjsasj3ZCiMS6ZS4NUoM",
  "access_expires_at": "2026-10-28T13:54:07.108781753Z",
  "refresh_token": "Gl_SgwUIOTXjchFo5aJPZVai854QSXIuk-pDRa5SguY",
  "refresh_expires_at": "2026-10-29T01:39:07.108170375Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
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

`POST /api/admin/v1/staff-extensions/9fd8c214-5b51-4aa3-8409-dc523c7d977f` → **200**

```json
{
  "command_id": "7fabbeac-79a8-4e2c-819d-7852e1ee7703",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "1c6a0fea-2c97-43a8-bed0-ebdf7876947f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:39:08.227353Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:39:08.227353Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e404973b-4903-44d4-a456-5c54ec3ed823",
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
  "id": "ef468fb0-987d-4cce-83f1-d171b7d0abec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:44:08.774664Z",
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
  "command_id": "d7458656-1654-42e2-9857-c5c23a7c4c05",
  "quote_id": "ef468fb0-987d-4cce-83f1-d171b7d0abec",
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
    "phone": "+380671125715"
  }
}
```

```json
{
  "id": "66cd38ec-7033-406c-a5b0-25daca363271",
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
  "created_at": "2026-10-28T13:39:09.062505Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671125715"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/66cd38ec-7033-406c-a5b0-25daca363271/calls` → **201**

```json
{
  "command_id": "44753620-0658-468a-8e4f-78a7c20d396d",
  "to": "CALLER"
}
```

```json
{
  "id": "dfe9ade2-5ed8-4e99-b9b2-97fd882dee44",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "order_ids": [
    "66cd38ec-7033-406c-a5b0-25daca363271"
  ],
  "started_at": "2026-10-28T13:39:09.396155Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/66cd38ec-7033-406c-a5b0-25daca363271/calls` → **201**

```json
{
  "command_id": "44753620-0658-468a-8e4f-78a7c20d396d",
  "to": "CALLER"
}
```

```json
{
  "id": "dfe9ade2-5ed8-4e99-b9b2-97fd882dee44",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "order_ids": [
    "66cd38ec-7033-406c-a5b0-25daca363271"
  ],
  "started_at": "2026-10-28T13:39:09.396155Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "dfe9ade2-5ed8-4e99-b9b2-97fd882dee44",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671125715",
    "at": "2026-10-28T13:39:09.398477073Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "dfe9ade2-5ed8-4e99-b9b2-97fd882dee44",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.15485",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "dfe9ade2-5ed8-4e99-b9b2-97fd882dee44"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "dfe9ade2-5ed8-4e99-b9b2-97fd882dee44",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=66cd38ec-7033-406c-a5b0-25daca363271` → **200**

```json
{
  "calls": [
    {
      "id": "dfe9ade2-5ed8-4e99-b9b2-97fd882dee44",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [
        "66cd38ec-7033-406c-a5b0-25daca363271"
      ],
      "started_at": "2026-10-28T13:39:09.396155Z",
      "answered_at": "2026-10-28T13:39:10.0541Z",
      "ended_at": "2026-10-28T13:39:10.07673Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=66cd38ec-7033-406c-a5b0-25daca363271` → **200**

```json
{
  "calls": [
    {
      "id": "dfe9ade2-5ed8-4e99-b9b2-97fd882dee44",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "order_ids": [
        "66cd38ec-7033-406c-a5b0-25daca363271"
      ],
      "started_at": "2026-10-28T13:39:09.396155Z",
      "answered_at": "2026-10-28T13:39:10.0541Z",
      "ended_at": "2026-10-28T13:39:10.07673Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:39:11.98428Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/66cd38ec-7033-406c-a5b0-25daca363271` → **200**

```json
{
  "id": "66cd38ec-7033-406c-a5b0-25daca363271",
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
  "created_at": "2026-10-28T13:39:09.062505Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671125715"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/66cd38ec-7033-406c-a5b0-25daca363271/cancel` → **200**

```json
{
  "command_id": "c52e4dbc-e5ae-43a8-a679-f12c7b682a39",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "66cd38ec-7033-406c-a5b0-25daca363271",
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
  "created_at": "2026-10-28T13:39:09.062505Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671125715"
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
  "command_id": "9128cb09-4397-41c7-b222-8e3ca235771f",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T13:39:13.269893Z",
  "extension": "101"
}
```

Done: outgoing call dfe9ade2-5ed8-4e99-b9b2-97fd882dee44 from order 66cd38ec-7033-406c-a5b0-25daca363271, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630304636",
  "device_ref": "sandbox-31173"
}
```

```json
{
  "challenge_id": "08b70333-7b6a-4290-8e58-e22ad38c38fb",
  "expires_at": "2026-10-28T13:44:13.547906681Z",
  "resend_available_at": "2026-10-28T13:39:14.547906681Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630304636` → **200**

```json
{
  "phone": "+380630304636",
  "audience": "CLIENT",
  "code": "914898",
  "sent_at": "2026-10-28T13:39:13.550161862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08b70333-7b6a-4290-8e58-e22ad38c38fb",
  "code": "914898",
  "device_ref": "sandbox-31173"
}
```

```json
{
  "session_id": "4613218e-1622-4f8f-bfd5-648bc44128d4",
  "subject": {
    "type": "CLIENT",
    "id": "405aebf5-988b-45f2-85bc-5c2d86e97805"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDVhZWJmNS05ODhiLTQ1ZjItODViYy01YzJkODZlOTc4MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjUzLCJpYXQiOjE3OTMxOTQ3NTMsImp0aSI6Ijc4ZmEwZDczLWNjYjktNDk5Mi1iNGJjLTBjOWY3NmNiOGYwYSIsInNpZCI6IjQ2MTMyMThlLTE2MjItNGY4Zi1iZmQ1LTY0OGJjNDQxMjhkNCJ9.yWzMubkzEwK5d4WKmOP1STm1VUbG5nnktmsQvdOE15Q",
  "access_expires_at": "2026-10-28T13:54:13.848955474Z",
  "refresh_token": "zd8X6lUtJcD8kNPJO-lhAPXiVMEVBjB8_dww0IH89qo",
  "refresh_expires_at": "2026-11-27T13:39:13.84836832Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "405aebf5-988b-45f2-85bc-5c2d86e97805",
  "session_id": "4613218e-1622-4f8f-bfd5-648bc44128d4",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630304636",
  "device_ref": "sandbox-10729"
}
```

```json
{
  "challenge_id": "48373148-64e2-4f68-8ff8-f3b303cc237f",
  "expires_at": "2026-10-28T13:44:16.380900648Z",
  "resend_available_at": "2026-10-28T13:39:17.380900648Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630304636` → **200**

```json
{
  "phone": "+380630304636",
  "audience": "CLIENT",
  "code": "205614",
  "sent_at": "2026-10-28T13:39:16.383022167Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48373148-64e2-4f68-8ff8-f3b303cc237f",
  "code": "205614",
  "device_ref": "sandbox-10729"
}
```

```json
{
  "session_id": "3fcb39b7-dbde-4e64-9ccb-9785d7a24fce",
  "subject": {
    "type": "CLIENT",
    "id": "405aebf5-988b-45f2-85bc-5c2d86e97805"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDVhZWJmNS05ODhiLTQ1ZjItODViYy01YzJkODZlOTc4MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjU2LCJpYXQiOjE3OTMxOTQ3NTYsImp0aSI6ImY5ZTAzNGMyLWY0MWEtNDM1ZS1iYTA4LTExZDJlYmQzZDE2NyIsInNpZCI6IjNmY2IzOWI3LWRiZGUtNGU2NC05Y2NiLTk3ODVkN2EyNGZjZSJ9.bkz9xwwQvck8A3gv6S_-NLmV_aInlCyJII3KGjlK0U8",
  "access_expires_at": "2026-10-28T13:54:16.67989898Z",
  "refresh_token": "-1BYNSMC9OhO2z7QZtvsBLF72J1vCPQdrBZFoletRXU",
  "refresh_expires_at": "2026-11-27T13:39:16.679370617Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "ce88fd54-425c-4836-bd20-163acf6ece83",
  "expires_at": "2026-10-28T13:44:18.96650358Z",
  "resend_available_at": "2026-10-28T13:39:19.96650358Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630304636` → **200**

```json
{
  "phone": "+380630304636",
  "audience": "CLIENT",
  "code": "594436",
  "sent_at": "2026-10-28T13:39:18.968563739Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632121800"
}
```

```json
{
  "challenge_id": "4cbe2135-3810-4760-bb44-4773106f25cc",
  "expires_at": "2026-10-28T13:44:19.266333633Z",
  "resend_available_at": "2026-10-28T13:39:20.266333633Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632121800` → **200**

```json
{
  "phone": "+380632121800",
  "audience": "CLIENT",
  "code": "645271",
  "sent_at": "2026-10-28T13:39:19.268197566Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "fb9d3fba-e3cf-473d-922a-664b8ffc5197",
  "current_challenge_id": "ce88fd54-425c-4836-bd20-163acf6ece83",
  "current_code": "000000",
  "new_challenge_id": "4cbe2135-3810-4760-bb44-4773106f25cc",
  "new_code": "645271"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "ee7cf18b-3008-44d9-ae3e-fbcd2960de70"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "46611e6d-8ebd-44b5-bc08-682d2cc0d558",
  "current_challenge_id": "ce88fd54-425c-4836-bd20-163acf6ece83",
  "current_code": "594436",
  "new_challenge_id": "4cbe2135-3810-4760-bb44-4773106f25cc",
  "new_code": "645271"
}
```

```json
{
  "subject_id": "405aebf5-988b-45f2-85bc-5c2d86e97805",
  "phone": "+380632121800",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "405aebf5-988b-45f2-85bc-5c2d86e97805",
  "session_id": "4613218e-1622-4f8f-bfd5-648bc44128d4",
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
  "correlation_id": "db38621e-01b8-4a50-97f0-516444154a5a"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632121800",
  "device_ref": "sandbox-21259"
}
```

```json
{
  "challenge_id": "f859fa13-a311-4485-81e6-3f631fd2fe12",
  "expires_at": "2026-10-28T13:44:22.676787899Z",
  "resend_available_at": "2026-10-28T13:39:23.676787899Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632121800` → **200**

```json
{
  "phone": "+380632121800",
  "audience": "CLIENT",
  "code": "076263",
  "sent_at": "2026-10-28T13:39:22.678843482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f859fa13-a311-4485-81e6-3f631fd2fe12",
  "code": "076263",
  "device_ref": "sandbox-21259"
}
```

```json
{
  "session_id": "ee599965-4ddf-471e-865f-73b2e8327d2b",
  "subject": {
    "type": "CLIENT",
    "id": "405aebf5-988b-45f2-85bc-5c2d86e97805"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDVhZWJmNS05ODhiLTQ1ZjItODViYy01YzJkODZlOTc4MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjYyLCJpYXQiOjE3OTMxOTQ3NjIsImp0aSI6IjUxNDliMzNiLTViZTctNDgyNC04NGVjLTJjNjRkOWVjNTFiNiIsInNpZCI6ImVlNTk5OTY1LTRkZGYtNDcxZS04NjVmLTczYjJlODMyN2QyYiJ9.QVFTm9XYVvLYlL7nPo6NdLz0IJqfZyxdLt2TFXKUPvg",
  "access_expires_at": "2026-10-28T13:54:22.969920986Z",
  "refresh_token": "Sc1NyD1-s2S8KNnYe3iwAgRL-uR4chEUtO20D6M0yzk",
  "refresh_expires_at": "2026-11-27T13:39:22.969406349Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "405aebf5-988b-45f2-85bc-5c2d86e97805",
  "session_id": "ee599965-4ddf-471e-865f-73b2e8327d2b",
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
  "session_id": "99d01eba-8c19-4a1f-9272-4f85379e2c1f",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2NjMsImlhdCI6MTc5MzE5NDc2MywianRpIjoiOTFhNTJjODctNTEzYy00YTAxLThiMWYtM2RkZTFlYmFjNDFmIiwic2lkIjoiOTlkMDFlYmEtOGMxOS00YTFmLTkyNzItNGY4NTM3OWUyYzFmIn0.l0EpUKqnxB6j65BfBAE-TmqbO8hjCjEg82zoEDurwRo",
  "access_expires_at": "2026-10-28T13:54:23.792076626Z",
  "refresh_token": "SYj1xtHWtUWhU8apfqDXZMUzg9KcRS8AzPCV2DASrkw",
  "refresh_expires_at": "2026-10-29T01:39:23.791506364Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/405aebf5-988b-45f2-85bc-5c2d86e97805` → **200**

```json
{
  "client": {
    "id": "405aebf5-988b-45f2-85bc-5c2d86e97805",
    "phone": "+380632121800",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:39:13.846818Z",
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

`POST /api/admin/v1/clients/405aebf5-988b-45f2-85bc-5c2d86e97805/phone` → **400**

```json
{
  "command_id": "591bfdf2-dee1-407c-8f3e-4e9ae17f2876",
  "expected_version": 3,
  "phone": "+380638549248",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/405aebf5-988b-45f2-85bc-5c2d86e97805/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "03018f25-63a8-41bd-be46-f13c44effd3b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/405aebf5-988b-45f2-85bc-5c2d86e97805/phone` → **200**

```json
{
  "command_id": "32813023-5993-4369-9004-7b283f51b137",
  "expected_version": 3,
  "phone": "+380638549248",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "405aebf5-988b-45f2-85bc-5c2d86e97805",
  "phone": "+380638549248",
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
  "correlation_id": "e7e75b0f-3dde-4fd1-a580-bfbec9758661"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638549248",
  "device_ref": "sandbox-20685"
}
```

```json
{
  "challenge_id": "ab084898-9574-4825-81f8-b7bb53474413",
  "expires_at": "2026-10-28T13:44:25.211797381Z",
  "resend_available_at": "2026-10-28T13:39:26.211797381Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638549248` → **200**

```json
{
  "phone": "+380638549248",
  "audience": "CLIENT",
  "code": "731545",
  "sent_at": "2026-10-28T13:39:25.214011104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab084898-9574-4825-81f8-b7bb53474413",
  "code": "731545",
  "device_ref": "sandbox-20685"
}
```

```json
{
  "session_id": "b4216a06-e916-414d-846b-6a7e04eff882",
  "subject": {
    "type": "CLIENT",
    "id": "405aebf5-988b-45f2-85bc-5c2d86e97805"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MDVhZWJmNS05ODhiLTQ1ZjItODViYy01YzJkODZlOTc4MDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjY1LCJpYXQiOjE3OTMxOTQ3NjUsImp0aSI6ImNmYTQ2OThhLWUwZTktNDJkYi1hYTliLWViZGY0YTJjY2IyMyIsInNpZCI6ImI0MjE2YTA2LWU5MTYtNDE0ZC04NDZiLTZhN2UwNGVmZjg4MiJ9.rE5K1e8O-IXJhrOdueH4oonzAGSg6qbp3G_nj365fzc",
  "access_expires_at": "2026-10-28T13:54:25.510830411Z",
  "refresh_token": "nNA6MfYb7NVjoAUUSClxrFMd0ambPeAjSQSpj5JYdU0",
  "refresh_expires_at": "2026-11-27T13:39:25.510323138Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "405aebf5-988b-45f2-85bc-5c2d86e97805",
  "session_id": "b4216a06-e916-414d-846b-6a7e04eff882",
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
  "phone": "+380639219752",
  "device_ref": "sandbox-10733"
}
```

```json
{
  "challenge_id": "690de5a8-9069-40eb-b62d-82530c320d7f",
  "expires_at": "2026-10-28T13:44:26.057300427Z",
  "resend_available_at": "2026-10-28T13:39:27.057300427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639219752` → **200**

```json
{
  "phone": "+380639219752",
  "audience": "CLIENT",
  "code": "168406",
  "sent_at": "2026-10-28T13:39:26.059486034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "690de5a8-9069-40eb-b62d-82530c320d7f",
  "code": "168406",
  "device_ref": "sandbox-10733"
}
```

```json
{
  "session_id": "4e64c2c9-fec3-4b92-a674-71cdb58e88e5",
  "subject": {
    "type": "CLIENT",
    "id": "2759c934-53d7-4981-9d62-f35391a39bbf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzU5YzkzNC01M2Q3LTQ5ODEtOWQ2Mi1mMzUzOTFhMzliYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjY2LCJpYXQiOjE3OTMxOTQ3NjYsImp0aSI6Ijc1OWQ0MGFiLTY1MGMtNDY4OC05ZTQ3LThiNmZiYjhjNDY2ZCIsInNpZCI6IjRlNjRjMmM5LWZlYzMtNGI5Mi1hNjc0LTcxY2RiNThlODhlNSJ9.ODJ3OUaR_YohOurFzBQEU4sS7Fb76IXShx0T78BnjPE",
  "access_expires_at": "2026-10-28T13:54:26.369908565Z",
  "refresh_token": "zwUmi1qWokuhaqt3LJ1jJP7m7YAPFWXBRYm_RErhKwc",
  "refresh_expires_at": "2026-11-27T13:39:26.36937927Z",
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
  "session_id": "017d570c-006d-4a38-91a0-4187acf009fe",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2NjcsImlhdCI6MTc5MzE5NDc2NywianRpIjoiNzcyMzAzODgtZDAwZC00MThhLThmZmMtN2NmMWJiYWU3YmQzIiwic2lkIjoiMDE3ZDU3MGMtMDA2ZC00YTM4LTkxYTAtNDE4N2FjZjAwOWZlIn0.juTDGzMduwQEvQh8M_KYKMyP-R0LTQeeVyO5Me6uCDQ",
  "access_expires_at": "2026-10-28T13:54:27.511571414Z",
  "refresh_token": "Df8w9FncVXJzXrw0Pp1kKcwzQ-OgdOtIWLgwrjpc91k",
  "refresh_expires_at": "2026-10-29T01:39:27.510993568Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639219752` → **200**

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
  "correlation_id": "9e785b72-90e1-4db9-97de-737d78bd72c6"
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
  "session_id": "67540572-875b-4bde-80cb-d9e12ba23d42",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2NjgsImlhdCI6MTc5MzE5NDc2OCwianRpIjoiNDdkZWRjMzgtM2FhMS00NDhkLWJmYmMtYWE1MjJmNWUwOGRmIiwic2lkIjoiNjc1NDA1NzItODc1Yi00YmRlLTgwY2ItZDllMTJiYTIzZDQyIn0.4jWSMwe73w7_bZZCiM9B2CSOEZ2Y4AeS4lnO0oNIWz4",
  "access_expires_at": "2026-10-28T13:54:28.6394802Z",
  "refresh_token": "0EBr88ypZiGcgzfnY3jEkrThtDL99P7r34ulHtHguZo",
  "refresh_expires_at": "2026-10-29T01:39:28.638875373Z",
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
  "command_id": "8e78e3fa-9f36-4de0-89fa-5d7e963cb21e",
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
  "changed_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T13:39:29.213374983Z"
}
```

## The rider books the airport for 2026-10-28T16:39:28Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600744943",
  "device_ref": "sandbox-2995"
}
```

```json
{
  "challenge_id": "3d6477c0-bf92-4935-aa8f-0b8f1e6c891c",
  "expires_at": "2026-10-28T13:44:29.504764212Z",
  "resend_available_at": "2026-10-28T13:39:30.504764212Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600744943` → **200**

```json
{
  "phone": "+48600744943",
  "audience": "CLIENT",
  "code": "050118",
  "sent_at": "2026-10-28T13:39:29.507149384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d6477c0-bf92-4935-aa8f-0b8f1e6c891c",
  "code": "050118",
  "device_ref": "sandbox-2995"
}
```

```json
{
  "session_id": "e3dbb187-40c8-4780-93c5-89a2ccb72686",
  "subject": {
    "type": "CLIENT",
    "id": "c411cc85-004f-42db-b9f5-4f334b236525"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDExY2M4NS0wMDRmLTQyZGItYjlmNS00ZjMzNGIyMzY1MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NjY5LCJpYXQiOjE3OTMxOTQ3NjksImp0aSI6IjE0NDdhYjk0LTk1ZmQtNDI5Zi1hZDg4LWE5OTIwZDcwMDYwMCIsInNpZCI6ImUzZGJiMTg3LTQwYzgtNDc4MC05M2M1LTg5YTJjY2I3MjY4NiJ9.p7Pv0V4nxVyUxCsEb-WgSwo8JLTxr1AkLjHHYgI7Y50",
  "access_expires_at": "2026-10-28T13:54:29.8214658Z",
  "refresh_token": "yfz9DlkaktZxgMnDNTXP4nQCSuCk2F1t0-io8lVvRz4",
  "refresh_expires_at": "2026-11-27T13:39:29.820793958Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8c5f9fcc-5310-4d8b-9994-091e5c360c3f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T16:39:28Z"
}
```

```json
{
  "id": "dddb47b2-2d13-467c-9345-b432132fde7e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:44:30.102658Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:39:28Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "976dbb8c-759a-4cef-9aca-0254204fcae0",
  "quote_id": "dddb47b2-2d13-467c-9345-b432132fde7e",
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
  "pickup_at": "2026-10-28T16:39:28Z"
}
```

```json
{
  "id": "9508cfe0-78c1-42f1-a491-8579ae20cd8d",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c411cc85-004f-42db-b9f5-4f334b236525",
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
  "created_at": "2026-10-28T13:39:30.392326Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:39:28Z",
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
  "device_ref": "sandbox-12278"
}
```

```json
{
  "challenge_id": "341619ad-2a3b-49fa-bdd7-c2bbae87def8",
  "expires_at": "2026-10-28T13:44:30.686474507Z",
  "resend_available_at": "2026-10-28T13:39:31.686474507Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "306984",
  "sent_at": "2026-10-28T13:39:30.688933208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "341619ad-2a3b-49fa-bdd7-c2bbae87def8",
  "code": "306984",
  "device_ref": "sandbox-12278"
}
```

```json
{
  "session_id": "81af798b-6ea1-4368-b711-3aacd95f6a82",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTY3MCwiaWF0IjoxNzkzMTk0NzcwLCJqdGkiOiI5ZWE0OWQ5Yi00MmI1LTRiNmMtYjMwNS0zOGQ5ZWEwOWQ2MjYiLCJzaWQiOiI4MWFmNzk4Yi02ZWExLTQzNjgtYjcxMS0zYWFjZDk1ZjZhODIifQ.jcZAdiBkFioGdWvTt1RHfaPW5jGp4t1xGTSGX_iiEwg",
  "access_expires_at": "2026-10-28T13:54:30.986628157Z",
  "refresh_token": "zAiTlABGJhsOxy-3fUpn24HAGMt2JX2LjlyzqbsosXs",
  "refresh_expires_at": "2026-11-27T13:39:30.986095365Z",
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
  "command_id": "0b2235d4-d811-4c2d-96d0-5446a264878e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:39:31Z",
    "sequence": 1793194771534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "81a9eb23-359b-4b2d-95b6-b5e684441a71",
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
  "last_heartbeat_at": "2026-10-28T13:39:31.553781Z",
  "last_location_at": "2026-10-28T13:39:31.553781Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9508cfe0-78c1-42f1-a491-8579ae20cd8d",
      "short_number": 20,
      "pickup_at": "2026-10-28T16:39:28Z",
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

`POST /api/driver/v1/preorders/9508cfe0-78c1-42f1-a491-8579ae20cd8d/reserve` → **200**

```json
{
  "command_id": "d18b11f2-bbb2-479b-ae63-4bd2c5d2736a"
}
```

```json
{
  "id": "238b0dba-254d-4fac-9237-c05e956d174e",
  "state": "RESERVED",
  "order": {
    "order_id": "9508cfe0-78c1-42f1-a491-8579ae20cd8d",
    "short_number": 20,
    "pickup_at": "2026-10-28T16:39:28Z",
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
  "reserved_at": "2026-10-28T13:39:32.19527Z",
  "confirm_from": "2026-10-28T16:09:28Z",
  "confirm_until": "2026-10-28T16:19:28Z",
  "drop_until": "2026-10-28T15:39:28Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "238b0dba-254d-4fac-9237-c05e956d174e",
      "state": "RESERVED",
      "order": {
        "order_id": "9508cfe0-78c1-42f1-a491-8579ae20cd8d",
        "short_number": 20,
        "pickup_at": "2026-10-28T16:39:28Z",
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
      "reserved_at": "2026-10-28T13:39:32.19527Z",
      "confirm_from": "2026-10-28T16:09:28Z",
      "confirm_until": "2026-10-28T16:19:28Z",
      "drop_until": "2026-10-28T15:39:28Z"
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
      "id": "238b0dba-254d-4fac-9237-c05e956d174e",
      "state": "RESERVED",
      "order": {
        "order_id": "9508cfe0-78c1-42f1-a491-8579ae20cd8d",
        "short_number": 20,
        "pickup_at": "2026-10-28T16:39:28Z",
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
      "reserved_at": "2026-10-28T13:39:32.19527Z",
      "confirm_from": "2026-10-28T16:09:28Z",
      "confirm_until": "2026-10-28T16:19:28Z",
      "drop_until": "2026-10-28T15:39:28Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/238b0dba-254d-4fac-9237-c05e956d174e/confirm` → **409**

```json
{
  "command_id": "3b60ac4d-cb53-4964-848a-b58fdf4e6977"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/238b0dba-254d-4fac-9237-c05e956d174e/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c1fed969-e644-4aeb-b241-8d47ec716c29"
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
  "session_id": "1e07a1c9-ef5e-4592-94cb-7df7dc45166c",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2NzMsImlhdCI6MTc5MzE5NDc3MywianRpIjoiNjA4YjVkMjgtYjI4Ni00NGM0LTk5OTAtZDA4MjRmNjI3MTE3Iiwic2lkIjoiMWUwN2ExYzktZWY1ZS00NTkyLTk0Y2ItN2RmN2RjNDUxNjZjIn0.yXdnfFS84in_JCQY3dXVs0wDHcxHf2HEdnm96iLxXQs",
  "access_expires_at": "2026-10-28T13:54:33.656163014Z",
  "refresh_token": "6J-hkX5i6d2I4IA84R4StATNRxOLyuBHvy-9Wf5UFcs",
  "refresh_expires_at": "2026-10-29T01:39:33.655588684Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9508cfe0-78c1-42f1-a491-8579ae20cd8d` → **200**

```json
{
  "id": "9508cfe0-78c1-42f1-a491-8579ae20cd8d",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c411cc85-004f-42db-b9f5-4f334b236525",
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
  "created_at": "2026-10-28T13:39:30.392326Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T16:39:28Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "238b0dba-254d-4fac-9237-c05e956d174e",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T13:39:32.19527Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9508cfe0-78c1-42f1-a491-8579ae20cd8d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T13:39:30.393656Z",
      "actor": {
        "type": "CLIENT",
        "id": "c411cc85-004f-42db-b9f5-4f334b236525",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9508cfe0-78c1-42f1-a491-8579ae20cd8d",
        "preorder": true,
        "quote_id": "dddb47b2-2d13-467c-9345-b432132fde7e",
        "pickup_at": "2026-10-28T16:39:28Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "8edea45c-0a7d-4dad-81c1-993ae6dbe4aa"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T13:39:32.196409Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9508cfe0-78c1-42f1-a491-8579ae20cd8d",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "238b0dba-254d-4fac-9237-c05e956d174e"
      },
      "correlation_id": "ef4dc72f-54c0-407d-8028-6ba8d7a1d5cf"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9508cfe0-78c1-42f1-a491-8579ae20cd8d, reservation 238b0dba-254d-4fac-9237-c05e956d174e.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17266"
}
```

```json
{
  "challenge_id": "77c35079-c2ff-475a-a836-02c59c5eed75",
  "expires_at": "2026-10-28T13:44:34.524639027Z",
  "resend_available_at": "2026-10-28T13:39:35.524639027Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "863344",
  "sent_at": "2026-10-28T13:39:34.526921758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77c35079-c2ff-475a-a836-02c59c5eed75",
  "code": "863344",
  "device_ref": "sandbox-17266"
}
```

```json
{
  "session_id": "e43f7772-6fcf-496d-9d2c-075ba4492d08",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTY3NCwiaWF0IjoxNzkzMTk0Nzc0LCJqdGkiOiJiMGFmMTU4Ny1jZWMxLTRiNTEtYmRhYy1jNDU4MWI1N2RmOWQiLCJzaWQiOiJlNDNmNzc3Mi02ZmNmLTQ5NmQtOWQyYy0wNzViYTQ0OTJkMDgifQ.7O0yrHaTAUPA4hEf8_k8w9vTUMMmQerL5FCS4_g7Fe4",
  "access_expires_at": "2026-10-28T13:54:34.847609061Z",
  "refresh_token": "3OVWmbSsO0alLkw_sOKY2VGSMzapf_PN_Kvof86h_SU",
  "refresh_expires_at": "2026-11-27T13:39:34.846990378Z",
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
  "command_id": "c95c2030-7c1f-4876-a0c9-9f7e89f0254c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:39:35Z",
    "sequence": 1793194775394
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f96ef0a-36c9-43bf-9d2f-5efa15443cb1",
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
  "last_heartbeat_at": "2026-10-28T13:39:35.412935Z",
  "last_location_at": "2026-10-28T13:39:35.412935Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679922243",
  "device_ref": "sandbox-13880"
}
```

```json
{
  "challenge_id": "0e32032a-ea07-480f-b4d1-b5f2f437fb25",
  "expires_at": "2026-10-28T13:44:35.689540522Z",
  "resend_available_at": "2026-10-28T13:39:36.689540522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679922243` → **200**

```json
{
  "phone": "+380679922243",
  "audience": "CLIENT",
  "code": "359589",
  "sent_at": "2026-10-28T13:39:35.692913381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e32032a-ea07-480f-b4d1-b5f2f437fb25",
  "code": "359589",
  "device_ref": "sandbox-13880"
}
```

```json
{
  "session_id": "1269bcbf-05aa-4538-ae82-a57b5323d1fb",
  "subject": {
    "type": "CLIENT",
    "id": "9914b137-af83-4dfa-8f96-270551275a9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTE0YjEzNy1hZjgzLTRkZmEtOGY5Ni0yNzA1NTEyNzVhOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1Njc1LCJpYXQiOjE3OTMxOTQ3NzUsImp0aSI6IjBiMzAyMjkwLTQwZjUtNGE4MC1hYzYwLWM2OGU0MmU2ZjU0YyIsInNpZCI6IjEyNjliY2JmLTA1YWEtNDUzOC1hZTgyLWE1N2I1MzIzZDFmYiJ9.kJ3Ximt7AifedyubfSG7L05tFDJAoRK1FmfePY_bCTE",
  "access_expires_at": "2026-10-28T13:54:35.996489229Z",
  "refresh_token": "9-A3n_IHoeLX11ZBTiOnOt_H8KxuewLukf4g60c0Hl0",
  "refresh_expires_at": "2026-11-27T13:39:35.995866165Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e3117f43-ddc6-4380-a583-0b3ce7151d58",
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
  "id": "d2b93b24-0887-4f2c-bdee-2bc90591eda8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:44:36.276664Z",
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
  "command_id": "895053b7-00c8-492b-9d4f-868a07b8f6fe",
  "quote_id": "d2b93b24-0887-4f2c-bdee-2bc90591eda8",
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
  "id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9914b137-af83-4dfa-8f96-270551275a9b",
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
  "created_at": "2026-10-28T13:39:36.585921Z",
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
    "id": "9601286e-72b1-4c11-a396-1db6137a9954",
    "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
    "expires_at": "2026-10-28T13:39:51.588845Z",
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

`POST /api/driver/v1/offers/9601286e-72b1-4c11-a396-1db6137a9954/accept` → **200**

```json
{
  "command_id": "85de02fa-4aaf-41c7-8a43-3c88680167e5"
}
```

```json
{
  "id": "dd271a20-5ec2-48a3-898d-ea2894084b9a",
  "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f6e79c34-1b61-49ec-b2ff-cd85b988f8ff",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f6e79c34-1b61-49ec-b2ff-cd85b988f8ff",
  "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "assignment_id": "dd271a20-5ec2-48a3-898d-ea2894084b9a",
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

`POST /api/driver/v1/work-sessions/1f96ef0a-36c9-43bf-9d2f-5efa15443cb1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:39:37Z",
    "sequence": 1793194777699
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f96ef0a-36c9-43bf-9d2f-5efa15443cb1",
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
  "last_heartbeat_at": "2026-10-28T13:39:37.718913Z",
  "last_location_at": "2026-10-28T13:39:37.718913Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f6e79c34-1b61-49ec-b2ff-cd85b988f8ff",
  "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "assignment_id": "dd271a20-5ec2-48a3-898d-ea2894084b9a",
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

`POST /api/driver/v1/trips/f6e79c34-1b61-49ec-b2ff-cd85b988f8ff/arrive` → **200**

```json
{
  "command_id": "a2f38806-44a6-4f66-9c8e-0252b4366d15",
  "expected_version": 0
}
```

```json
{
  "id": "f6e79c34-1b61-49ec-b2ff-cd85b988f8ff",
  "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "assignment_id": "dd271a20-5ec2-48a3-898d-ea2894084b9a",
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
  "arrived_at": "2026-10-28T13:39:38.256661Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f6e79c34-1b61-49ec-b2ff-cd85b988f8ff/start` → **200**

```json
{
  "command_id": "525985ea-04b3-4b29-8d99-78c05950781e",
  "expected_version": 1
}
```

```json
{
  "id": "f6e79c34-1b61-49ec-b2ff-cd85b988f8ff",
  "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "assignment_id": "dd271a20-5ec2-48a3-898d-ea2894084b9a",
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
  "arrived_at": "2026-10-28T13:39:38.256661Z",
  "started_at": "2026-10-28T13:39:38.544126Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1f96ef0a-36c9-43bf-9d2f-5efa15443cb1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:39:38Z",
    "sequence": 1793194778815
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f96ef0a-36c9-43bf-9d2f-5efa15443cb1",
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
  "last_heartbeat_at": "2026-10-28T13:39:38.834175Z",
  "last_location_at": "2026-10-28T13:39:38.834175Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f6e79c34-1b61-49ec-b2ff-cd85b988f8ff/complete` → **200**

```json
{
  "command_id": "3c3045ae-f203-4982-948e-3e821704625c",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:39:39Z",
  "cash_received": true
}
```

```json
{
  "id": "f6e79c34-1b61-49ec-b2ff-cd85b988f8ff",
  "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "assignment_id": "dd271a20-5ec2-48a3-898d-ea2894084b9a",
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
  "arrived_at": "2026-10-28T13:39:38.256661Z",
  "started_at": "2026-10-28T13:39:38.544126Z",
  "completed_at": "2026-10-28T13:39:39.119545Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/7816c3db-9def-4cdd-ae84-67123ad639bd/rating` → **200**

```json
{
  "command_id": "fb056545-f9d6-40ea-838e-9ee917d6f5de",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "score": 5,
  "created_at": "2026-10-28T13:39:39.423200177Z"
}
```

`POST /api/driver/v1/orders/7816c3db-9def-4cdd-ae84-67123ad639bd/rating` → **200**

```json
{
  "command_id": "2b7e83fd-7b37-475c-8b23-54fea95ed8f5",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
  "score": 4,
  "created_at": "2026-10-28T13:39:39.701627991Z"
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
  "session_id": "8944e1ba-68e3-4dae-8ba4-37a40ceffaa3",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2ODAsImlhdCI6MTc5MzE5NDc4MCwianRpIjoiMWYwZTBkMDMtZmI0Zi00MmJjLWE5Y2YtN2FhZGU4NDkzYWM4Iiwic2lkIjoiODk0NGUxYmEtNjhlMy00ZGFlLThiYTQtMzdhNDBjZWZmYWEzIn0.EONL_KHe4esILoK0hK7Sseu-uDJv_OQdg5y8INaAKW4",
  "access_expires_at": "2026-10-28T13:54:40.561910467Z",
  "refresh_token": "Pss5G7Fj07kWVgexxy0fXoOERZPRe-ae-001XrBxEWU",
  "refresh_expires_at": "2026-10-29T01:39:40.561387323Z",
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
  "session_id": "0a1033d2-d569-4339-9340-2e27484efd88",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2ODEsImlhdCI6MTc5MzE5NDc4MSwianRpIjoiYTllYWViMjQtNzc4NS00MWZmLWJlZWMtYjU4NGExYTc1OWFlIiwic2lkIjoiMGExMDMzZDItZDU2OS00MzM5LTkzNDAtMmUyNzQ4NGVmZDg4In0.u7l7n71d4__IISj-Qd1JPuC37RkadePChNXbgBv-kco",
  "access_expires_at": "2026-10-28T13:54:41.127336722Z",
  "refresh_token": "Gzpfc1c0jpzfHBKoFxqTWekzVMJxN1oYgDlxE5VNoF4",
  "refresh_expires_at": "2026-10-29T01:39:41.126664168Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7816c3db-9def-4cdd-ae84-67123ad639bd/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
      "author_type": "RIDER",
      "author_id": "9914b137-af83-4dfa-8f96-270551275a9b",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T13:39:39.4232Z"
    },
    {
      "order_id": "7816c3db-9def-4cdd-ae84-67123ad639bd",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "9914b137-af83-4dfa-8f96-270551275a9b",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T13:39:39.701628Z"
    }
  ]
}
```

Done: ratings for order 7816c3db-9def-4cdd-ae84-67123ad639bd.

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
  "session_id": "3f830c7d-7662-4c08-9d63-48aa8c10d078",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2ODEsImlhdCI6MTc5MzE5NDc4MSwianRpIjoiMGNhZDE5MmMtZDA4Zi00ZWVmLTg1ZjctMjU2OGJmM2Q2NmUzIiwic2lkIjoiM2Y4MzBjN2QtNzY2Mi00YzA4LTlkNjMtNDhhYThjMTBkMDc4In0.15TLDy1MiKuinKE5OMjOb_jmQeVNAewL3nJz1vD0pvs",
  "access_expires_at": "2026-10-28T13:54:41.991475069Z",
  "refresh_token": "X3fZxIpyw9UmLgDAxhnbUaZeU2r2ioLS4XeEBcxzsrg",
  "refresh_expires_at": "2026-10-29T01:39:41.990924003Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f6289d11-d4ce-490c-94af-2896be518262",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "8757ea26-77c0-4d9e-a98a-555dfb35260e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:42.270527Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8757ea26-77c0-4d9e-a98a-555dfb35260e` → **200**

```json
{
  "id": "8757ea26-77c0-4d9e-a98a-555dfb35260e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:42.270527Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8757ea26-77c0-4d9e-a98a-555dfb35260e` → **200**

```json
{
  "id": "8757ea26-77c0-4d9e-a98a-555dfb35260e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:42.270527Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8757ea26-77c0-4d9e-a98a-555dfb35260e` → **200**

```json
{
  "id": "8757ea26-77c0-4d9e-a98a-555dfb35260e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:42.270527Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8757ea26-77c0-4d9e-a98a-555dfb35260e` → **200**

```json
{
  "id": "8757ea26-77c0-4d9e-a98a-555dfb35260e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:42.270527Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8757ea26-77c0-4d9e-a98a-555dfb35260e` → **200**

```json
{
  "id": "8757ea26-77c0-4d9e-a98a-555dfb35260e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:39:42.270527Z",
  "ready_at": "2026-10-28T13:39:47.031323Z",
  "expires_at": "2026-10-29T13:39:47.031323Z"
}
```

`GET /api/admin/v1/reports/exports/8757ea26-77c0-4d9e-a98a-555dfb35260e/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "0834cf22-2867-438e-93ae-0e0a34eb347e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "81fac483-bf8a-4715-a57a-acf795f3cce9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:47.939459Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/81fac483-bf8a-4715-a57a-acf795f3cce9` → **200**

```json
{
  "id": "81fac483-bf8a-4715-a57a-acf795f3cce9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:47.939459Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/81fac483-bf8a-4715-a57a-acf795f3cce9` → **200**

```json
{
  "id": "81fac483-bf8a-4715-a57a-acf795f3cce9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:47.939459Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/81fac483-bf8a-4715-a57a-acf795f3cce9` → **200**

```json
{
  "id": "81fac483-bf8a-4715-a57a-acf795f3cce9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:39:47.939459Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/81fac483-bf8a-4715-a57a-acf795f3cce9` → **200**

```json
{
  "id": "81fac483-bf8a-4715-a57a-acf795f3cce9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:39:47.939459Z",
  "ready_at": "2026-10-28T13:39:52.039829Z",
  "expires_at": "2026-10-29T13:39:52.039829Z"
}
```

`GET /api/admin/v1/reports/exports/81fac483-bf8a-4715-a57a-acf795f3cce9/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/d2c07a4c-e315-4994-9f81-a62d33cb3b35` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/d2c07a4c-e315-4994-9f81-a62d33cb3b35",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cfeb1f38-2c4b-4256-afd8-99196e489928"
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
  "device_ref": "sandbox-3358"
}
```

```json
{
  "challenge_id": "81ec8adf-b8ee-417e-9100-879299a7112f",
  "expires_at": "2026-10-28T13:44:52.680002742Z",
  "resend_available_at": "2026-10-28T13:39:53.680002742Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "300170",
  "sent_at": "2026-10-28T13:39:52.682633706Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81ec8adf-b8ee-417e-9100-879299a7112f",
  "code": "300170",
  "device_ref": "sandbox-3358"
}
```

```json
{
  "session_id": "22c16271-906e-497e-b9e9-48dbf480ff12",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTY5MiwiaWF0IjoxNzkzMTk0NzkyLCJqdGkiOiJjY2FjMjgxZS1hYTU2LTQ0MTctODczYy02Mjk5MWExODQyNDkiLCJzaWQiOiIyMmMxNjI3MS05MDZlLTQ5N2UtYjllOS00OGRiZjQ4MGZmMTIifQ.2a7TAzReqUkHeNg5wE56bX4rzrNm1caOd1e3k9LjLAo",
  "access_expires_at": "2026-10-28T13:54:52.989856119Z",
  "refresh_token": "KqY8gKCvvIKGNIKLRKl5OIPqNvnsQ4lMujsD2Lv6rWI",
  "refresh_expires_at": "2026-11-27T13:39:52.989217308Z",
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
  "command_id": "d8f7b97d-1423-4ec1-8429-5ef5e1a0882a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:39:53Z",
    "sequence": 1793194793814
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc862ae9-25f6-4ecb-80ab-6bcef9ce9264",
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
  "last_heartbeat_at": "2026-10-28T13:39:53.834427Z",
  "last_location_at": "2026-10-28T13:39:53.834427Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "4d945ce1-b66f-4fbd-a9d6-07782f01f4d1",
  "points": [
    {
      "sequence": 1793194796119,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:38:56Z"
    },
    {
      "sequence": 1793194796127,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:39:56Z"
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
  "session_id": "848735f6-9d6c-4c10-9cad-6b8cacc1a5b1",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2OTYsImlhdCI6MTc5MzE5NDc5NiwianRpIjoiMTM5NGU0N2UtNmJhZC00NmZjLWI1NDItYmRkNjc4ZGMyODIzIiwic2lkIjoiODQ4NzM1ZjYtOWQ2Yy00YzEwLTljYWQtNmI4Y2FjYzFhNWIxIn0.q601rCzwHZIFe6juLjMiq8HQJTXo2Nb6vZolVoaokAA",
  "access_expires_at": "2026-10-28T13:54:56.789971552Z",
  "refresh_token": "PK4AX3jrvAmFtCaEZFDbqxcLUJlEJR-Ms97FMJG71vc",
  "refresh_expires_at": "2026-10-29T01:39:56.789439151Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "83df3514-8393-45cb-b6bf-085a3bd57fea",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T13:39:56Z",
        "track_point_id": "af53dd3e-33fa-4dee-a6f1-2acb3401d3e1",
        "work_session_id": "bc862ae9-25f6-4ecb-80ab-6bcef9ce9264"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T13:39:56Z",
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

`POST /api/admin/v1/driver-risk-flags/83df3514-8393-45cb-b6bf-085a3bd57fea/confirm` → **200**

```json
{
  "command_id": "9bd81fa1-efc0-45b6-ada4-348217ffa49f",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "83df3514-8393-45cb-b6bf-085a3bd57fea",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T13:39:56Z",
    "track_point_id": "af53dd3e-33fa-4dee-a6f1-2acb3401d3e1",
    "work_session_id": "bc862ae9-25f6-4ecb-80ab-6bcef9ce9264"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T13:39:56Z",
  "reason": null,
  "reviewed_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "reviewed_at": "2026-10-28T13:39:57.667735Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/83df3514-8393-45cb-b6bf-085a3bd57fea/dismiss` → **409**

```json
{
  "command_id": "2c8c40db-29a2-40f3-a14a-1844c2ed1799",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/83df3514-8393-45cb-b6bf-085a3bd57fea/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a0f090ca-751d-40bf-b44b-a605e7b7fb36"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "d3203b5b-1a92-4e2a-9bed-00101a5a34a3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "b9b5d6d4-abca-4578-b8da-5a1e2607cfc7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "raised_at": "2026-10-28T13:39:58.248453Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/b9b5d6d4-abca-4578-b8da-5a1e2607cfc7/dismiss` → **200**

```json
{
  "command_id": "29fb2e0f-8a47-46e0-a39d-ce95b4d3f10a",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "b9b5d6d4-abca-4578-b8da-5a1e2607cfc7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "raised_at": "2026-10-28T13:39:58.248453Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "reviewed_at": "2026-10-28T13:39:58.543149Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "8a7ed8a2-18e0-4c2f-8e78-aa49a5ee8134",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "83df3514-8393-45cb-b6bf-085a3bd57fea"
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
      "actor_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:39:58.838943Z"
    }
  ]
}
```

Done: flag 83df3514-8393-45cb-b6bf-085a3bd57fea confirmed, suspension named it, driver reinstated.

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
  "session_id": "251080d6-2360-49d0-9be9-2184e1bce511",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU2OTksImlhdCI6MTc5MzE5NDc5OSwianRpIjoiNTMyYzM2OGEtNWEyNy00ODBmLWEyNGMtNDhhYTJiMjUwODI0Iiwic2lkIjoiMjUxMDgwZDYtMjM2MC00OWQwLTliZTktMjE4NGUxYmNlNTExIn0.c2mHblGbBLJdEdI_1H4Y72Plfo5D4L4h0-X1JC4ZBKo",
  "access_expires_at": "2026-10-28T13:54:59.698800245Z",
  "refresh_token": "jyyc4rff2LmHHb3pR9BcC6wp5-fmokBZbBxPNd1wL08",
  "refresh_expires_at": "2026-10-29T01:39:59.698226076Z",
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
      "actor_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:39:58.838943Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "5d1d6cf3-029c-4582-b0b4-e54d36e76f7a",
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
  "session_id": "bc862ae9-25f6-4ecb-80ab-6bcef9ce9264",
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
  "last_heartbeat_at": "2026-10-28T13:39:53.834427Z",
  "last_location_at": "2026-10-28T13:39:53.834427Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc862ae9-25f6-4ecb-80ab-6bcef9ce9264/close` → **200**

```json
{
  "command_id": "cd559f2b-e34f-486f-a046-9ce0e016d9a7",
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
  "session_id": "6237141b-cee1-4550-9cac-0baedecbee94",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU3MDEsImlhdCI6MTc5MzE5NDgwMSwianRpIjoiNzQwMmEyZTAtODMzZS00NDVmLTljYmItNzVkY2NhZmVkOGQ3Iiwic2lkIjoiNjIzNzE0MWItY2VlMS00NTUwLTljYWMtMGJhZWRlY2JlZTk0In0.HQcZ94kauFJ6k-5r7ivBXRJwfvYeqUHOnRTUFGIvPXI",
  "access_expires_at": "2026-10-28T13:55:01.483653662Z",
  "refresh_token": "nlqC3bifQO3YW5Oyax_q0tA4AB653tX2Ag7tBcqZaDs",
  "refresh_expires_at": "2026-10-29T01:40:01.483067901Z",
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
  "command_id": "72ae5c3b-227b-4e89-8a62-9aafaaff7537",
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
  "changed_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:40:02.072758Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "72ae5c3b-227b-4e89-8a62-9aafaaff7537",
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
  "changed_by": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:40:02.072758Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48097769081",
  "device_ref": "sandbox-31824"
}
```

```json
{
  "challenge_id": "a08a76be-ed7f-4b36-9057-da01c19e634d",
  "expires_at": "2026-10-28T13:45:02.673194111Z",
  "resend_available_at": "2026-10-28T13:40:03.673194111Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48097769081` → **200**

```json
{
  "phone": "+48097769081",
  "audience": "CLIENT",
  "code": "833087",
  "sent_at": "2026-10-28T13:40:02.675856978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a08a76be-ed7f-4b36-9057-da01c19e634d",
  "code": "833087",
  "device_ref": "sandbox-31824"
}
```

```json
{
  "session_id": "a0cac5e6-a0de-4437-8485-e0896515e7f1",
  "subject": {
    "type": "CLIENT",
    "id": "4c964bf3-d05f-4d34-9590-fa3975b19131"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Yzk2NGJmMy1kMDVmLTRkMzQtOTU5MC1mYTM5NzViMTkxMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NzAyLCJpYXQiOjE3OTMxOTQ4MDIsImp0aSI6ImU1M2YzMTVhLWQ5ZGUtNGU4Ny1iYzU0LTY0MjFkMTU4ZDBmNSIsInNpZCI6ImEwY2FjNWU2LWEwZGUtNDQzNy04NDg1LWUwODk2NTE1ZTdmMSJ9.G-j7UVd-Wi0FiH9oJAwnzVjtKgYYzAa1Y9qKceFtuIQ",
  "access_expires_at": "2026-10-28T13:55:02.991140809Z",
  "refresh_token": "RQeH0mGv3AuRbfze7-uIUcFU1PFBAkOHC3397kuWA2Q",
  "refresh_expires_at": "2026-11-27T13:40:02.990596737Z",
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
  "correlation_id": "449fd4b3-a4a8-4358-a042-c8785353a940"
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
  "device_ref": "sandbox-1308"
}
```

```json
{
  "challenge_id": "f868e7fb-f216-48a5-b084-5dcb77e9b38d",
  "expires_at": "2026-10-28T13:45:03.841446823Z",
  "resend_available_at": "2026-10-28T13:40:04.841446823Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "937573",
  "sent_at": "2026-10-28T13:40:03.844160934Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f868e7fb-f216-48a5-b084-5dcb77e9b38d",
  "code": "937573",
  "device_ref": "sandbox-1308"
}
```

```json
{
  "session_id": "00de3705-9758-4fb9-8e90-4d8aa1e8f56e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTcwNCwiaWF0IjoxNzkzMTk0ODA0LCJqdGkiOiI5MTY4ZTQ1OC1lZGM3LTQ2NTMtYmZjYi1jOTk2MmIyMTBkNDYiLCJzaWQiOiIwMGRlMzcwNS05NzU4LTRmYjktOGU5MC00ZDhhYTFlOGY1NmUifQ.iJ-wWbwOlZoxtF5NnaGJFXGaMPQ-5iJfpq7Aogcbpes",
  "access_expires_at": "2026-10-28T13:55:04.146547039Z",
  "refresh_token": "vYwdueB1oTsnoudhWusjgGERlkN-XZk7jag7V4t9oYo",
  "refresh_expires_at": "2026-11-27T13:40:04.145958854Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "81a9eb23-359b-4b2d-95b6-b5e684441a71",
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
  "last_heartbeat_at": "2026-10-28T13:39:31.553781Z",
  "last_location_at": "2026-10-28T13:39:31.553781Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/81a9eb23-359b-4b2d-95b6-b5e684441a71/handover` → **200**

```json
{
  "command_id": "900decae-d4cf-43b6-bfcd-0f29b82e46d2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "81a9eb23-359b-4b2d-95b6-b5e684441a71",
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
  "last_heartbeat_at": "2026-10-28T13:39:31.553781Z",
  "last_location_at": "2026-10-28T13:39:31.553781Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/81a9eb23-359b-4b2d-95b6-b5e684441a71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:40:04Z",
    "sequence": 1793194804980
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "81a9eb23-359b-4b2d-95b6-b5e684441a71",
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
  "last_heartbeat_at": "2026-10-28T13:40:04.9994Z",
  "last_location_at": "2026-10-28T13:40:04.9994Z",
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
  "session_id": "81a9eb23-359b-4b2d-95b6-b5e684441a71",
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
  "last_heartbeat_at": "2026-10-28T13:40:04.9994Z",
  "last_location_at": "2026-10-28T13:40:04.9994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/81a9eb23-359b-4b2d-95b6-b5e684441a71/close` → **200**

```json
{
  "command_id": "cc436906-194d-4c62-b792-c4d4905cb00c",
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
  "correlation_id": "d9c0f59a-60a5-404c-a406-5beca0e16642"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675271661",
  "device_ref": "sandbox-5754"
}
```

```json
{
  "challenge_id": "70bd2021-96a5-418d-bf63-d6213937724f",
  "expires_at": "2026-10-28T13:45:06.440785222Z",
  "resend_available_at": "2026-10-28T13:40:07.440785222Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675271661` → **200**

```json
{
  "phone": "+380675271661",
  "audience": "CLIENT",
  "code": "620916",
  "sent_at": "2026-10-28T13:40:06.443057352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70bd2021-96a5-418d-bf63-d6213937724f",
  "code": "620916",
  "device_ref": "sandbox-5754"
}
```

```json
{
  "session_id": "c9b83fb9-2a90-4d9c-b8e4-8034a5cc6a28",
  "subject": {
    "type": "CLIENT",
    "id": "e13278e7-2fa1-4652-a408-156d3740d4c2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTMyNzhlNy0yZmExLTQ2NTItYTQwOC0xNTZkMzc0MGQ0YzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk1NzA2LCJpYXQiOjE3OTMxOTQ4MDYsImp0aSI6IjI3YWYyNzk0LTAyYWQtNDQ4Ny1hZDVmLTIyYWExZmJhYzgzZCIsInNpZCI6ImM5YjgzZmI5LTJhOTAtNGQ5Yy1iOGU0LTgwMzRhNWNjNmEyOCJ9.DUenExVHU9EqUuwdwDBvDsAVwrXxPxCndKVLpjaPzbM",
  "access_expires_at": "2026-10-28T13:55:06.750604671Z",
  "refresh_token": "_nIUD9QlbkgGvsahpdGHZbraoVmMK_l57k86j86XNkY",
  "refresh_expires_at": "2026-11-27T13:40:06.750018649Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "a480a131-b863-42db-ac89-836b0ae64954",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6",
  "upload_path": "/api/rider/v1/uploads/bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6",
  "expires_at": "2026-10-28T13:55:07.034591812Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6` → **200**

```json
{
  "file_id": "bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "2b2dc677-2378-4227-8443-0a67cb408ec2",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6"
  ]
}
```

```json
{
  "id": "1eda8a97-3dad-4aa7-8d1e-681616ca70fd",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e13278e7-2fa1-4652-a408-156d3740d4c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:40:07.361081Z",
  "updated_at": "2026-10-28T13:40:07.361081Z",
  "messages": [
    {
      "id": "bb9cf066-9901-4730-ac84-49311a7d5556",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e13278e7-2fa1-4652-a408-156d3740d4c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:40:07.362387Z",
      "attachments": [
        {
          "file_id": "bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6",
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
  "session_id": "8819ea58-678f-451e-93ce-3157212cf8c5",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU3MDcsImlhdCI6MTc5MzE5NDgwNywianRpIjoiYzBhMzIzYmQtNmQxYi00MzUwLTliMDUtNzEwNTZmNDJmYWI0Iiwic2lkIjoiODgxOWVhNTgtNjc4Zi00NTFlLTkzY2UtMzE1NzIxMmNmOGM1In0.b7EmtLAXI4JUK4sod_g0tj2s-Av2azfiTtp5nZoQJi4",
  "access_expires_at": "2026-10-28T13:55:07.954065396Z",
  "refresh_token": "3ZoHYtx7yOCjOY7Tany6Fxjm26Loq2TwSWJ_nYFe7vY",
  "refresh_expires_at": "2026-10-29T01:40:07.953291362Z",
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
  "session_id": "ac3f08ef-27c2-4108-aa71-a7bb07dd59cc",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU3MDgsImlhdCI6MTc5MzE5NDgwOCwianRpIjoiMmFhYjAyMzctMTE2MC00ZjFlLWEzZTMtMmU0ZWI3MDE3YzRiIiwic2lkIjoiYWMzZjA4ZWYtMjdjMi00MTA4LWFhNzEtYTdiYjA3ZGQ1OWNjIn0.cIunOxHQS3wfleJ6A79pXN2kQeHCb-RpRM1A4PaQBa8",
  "access_expires_at": "2026-10-28T13:55:08.518025897Z",
  "refresh_token": "D6DHRtlyuF9MJdur8JJFePMJx5E5Ziz3MFozmZZ2ZGA",
  "refresh_expires_at": "2026-10-29T01:40:08.517466265Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/1eda8a97-3dad-4aa7-8d1e-681616ca70fd/attachments/bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "37c98c48-594f-4d0f-a6c2-0eba160d556e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c85d49ad-2697-471b-988a-1798b001db8c",
  "upload_path": "/api/operator/v1/uploads/c85d49ad-2697-471b-988a-1798b001db8c",
  "expires_at": "2026-10-28T13:55:08.811429382Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/c85d49ad-2697-471b-988a-1798b001db8c` → **200**

```json
{
  "file_id": "c85d49ad-2697-471b-988a-1798b001db8c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/1eda8a97-3dad-4aa7-8d1e-681616ca70fd` → **200**

```json
{
  "id": "1eda8a97-3dad-4aa7-8d1e-681616ca70fd",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e13278e7-2fa1-4652-a408-156d3740d4c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:40:07.361081Z",
  "updated_at": "2026-10-28T13:40:07.361081Z",
  "messages": [
    {
      "id": "bb9cf066-9901-4730-ac84-49311a7d5556",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e13278e7-2fa1-4652-a408-156d3740d4c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:40:07.362387Z",
      "attachments": [
        {
          "file_id": "bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/1eda8a97-3dad-4aa7-8d1e-681616ca70fd/comments` → **200**

```json
{
  "command_id": "8d4a75a0-21e7-4f17-97ce-2393e606649e",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "c85d49ad-2697-471b-988a-1798b001db8c"
  ]
}
```

```json
{
  "id": "1eda8a97-3dad-4aa7-8d1e-681616ca70fd",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e13278e7-2fa1-4652-a408-156d3740d4c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:40:07.361081Z",
  "updated_at": "2026-10-28T13:40:09.421652Z",
  "messages": [
    {
      "id": "bb9cf066-9901-4730-ac84-49311a7d5556",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e13278e7-2fa1-4652-a408-156d3740d4c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:40:07.362387Z",
      "attachments": [
        {
          "file_id": "bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "05fffaba-1aa9-4d8c-8973-061b787d0ea1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:40:09.421228Z",
      "attachments": [
        {
          "file_id": "c85d49ad-2697-471b-988a-1798b001db8c",
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

`GET /api/rider/v1/support/cases/1eda8a97-3dad-4aa7-8d1e-681616ca70fd` → **200**

```json
{
  "id": "1eda8a97-3dad-4aa7-8d1e-681616ca70fd",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e13278e7-2fa1-4652-a408-156d3740d4c2",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:40:07.361081Z",
  "updated_at": "2026-10-28T13:40:09.421652Z",
  "messages": [
    {
      "id": "bb9cf066-9901-4730-ac84-49311a7d5556",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e13278e7-2fa1-4652-a408-156d3740d4c2",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:40:07.362387Z",
      "attachments": [
        {
          "file_id": "bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "05fffaba-1aa9-4d8c-8973-061b787d0ea1",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:40:09.421228Z",
      "attachments": [
        {
          "file_id": "c85d49ad-2697-471b-988a-1798b001db8c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/1eda8a97-3dad-4aa7-8d1e-681616ca70fd/attachments/c85d49ad-2697-471b-988a-1798b001db8c` → **200**

Done: support case 1eda8a97-3dad-4aa7-8d1e-681616ca70fd, rider attachment bd43e47c-1dad-4ba7-a1e6-efc4565fbcf6, operator attachment c85d49ad-2697-471b-988a-1798b001db8c.

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
  "session_id": "717e09a7-6295-4f9a-80f2-357de10b1251",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU3MTAsImlhdCI6MTc5MzE5NDgxMCwianRpIjoiOWJhZTA1N2MtNTQ5Yy00YzA3LTgzMzktOTRmZWRlZDNiNTRlIiwic2lkIjoiNzE3ZTA5YTctNjI5NS00ZjlhLTgwZjItMzU3ZGUxMGIxMjUxIn0._5Ap2KNKnDj7g-exP7DJ73rTUfCuWtrzsheO9FVIO7A",
  "access_expires_at": "2026-10-28T13:55:10.335542264Z",
  "refresh_token": "_zER9gYLX4PCiNqrTKprkCIx1vrslo_rJQuai4KsbIU",
  "refresh_expires_at": "2026-10-29T01:40:10.334983845Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3484"
}
```

```json
{
  "challenge_id": "43be6716-5091-424a-8fa3-9a9430f1305d",
  "expires_at": "2026-10-28T13:45:10.604863809Z",
  "resend_available_at": "2026-10-28T13:40:11.604863809Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "261441",
  "sent_at": "2026-10-28T13:40:10.607180921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43be6716-5091-424a-8fa3-9a9430f1305d",
  "code": "261441",
  "device_ref": "sandbox-3484"
}
```

```json
{
  "session_id": "9de17a08-3612-4c0c-a9fb-cac8267f8854",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTcxMCwiaWF0IjoxNzkzMTk0ODEwLCJqdGkiOiI4MzBiM2ZiMi0yOTk4LTQ1ZjAtOTJiMC04NjlmZjllMDEzNDQiLCJzaWQiOiI5ZGUxN2EwOC0zNjEyLTRjMGMtYTlmYi1jYWM4MjY3Zjg4NTQifQ.NlF49UBQYcqztM3fr1EtFvyoFyscfGuY91GQeCFxb7k",
  "access_expires_at": "2026-10-28T13:55:10.913364636Z",
  "refresh_token": "lAub_wn4-qDkUfwGQWiCLJFcmGEumqNb40hXZRmviVQ",
  "refresh_expires_at": "2026-11-27T13:40:10.912681845Z",
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
      "actor_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:39:58.838943Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T13:40:00.31359Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "30089849-4c93-47d0-baef-b671f3a951e8",
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
  "device_ref": "sandbox-27988"
}
```

```json
{
  "challenge_id": "e735669d-2dcc-4165-b9de-a6992a0d5905",
  "expires_at": "2026-10-28T13:45:12.05993305Z",
  "resend_available_at": "2026-10-28T13:40:13.05993305Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "403432",
  "sent_at": "2026-10-28T13:40:12.062066577Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e735669d-2dcc-4165-b9de-a6992a0d5905",
  "code": "403432",
  "device_ref": "sandbox-27988"
}
```

```json
{
  "session_id": "4d4ce636-e08b-4ec8-b35b-b444e0d93903",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NTcxMiwiaWF0IjoxNzkzMTk0ODEyLCJqdGkiOiIwNTVlZjc1Yy1lNTZmLTRmNjAtYTNhYS1jMTkzN2NmYjcwMjciLCJzaWQiOiI0ZDRjZTYzNi1lMDhiLTRlYzgtYjM1Yi1iNDQ0ZTBkOTM5MDMifQ.J0QkLGmn-6bDHbWa_htIyIrqQ2UcIStqjxOrjakBVDc",
  "access_expires_at": "2026-10-28T13:55:12.361167744Z",
  "refresh_token": "nWpu6Ph7NZX8LhfopeWulTeqxcFtrbmK0vbrb1oRQbA",
  "refresh_expires_at": "2026-11-27T13:40:12.360590499Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f96ef0a-36c9-43bf-9d2f-5efa15443cb1",
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
  "last_heartbeat_at": "2026-10-28T13:39:38.834175Z",
  "last_location_at": "2026-10-28T13:39:38.834175Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1f96ef0a-36c9-43bf-9d2f-5efa15443cb1/handover` → **200**

```json
{
  "command_id": "747d63cc-182d-49f9-9116-abe1381b9a44",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f96ef0a-36c9-43bf-9d2f-5efa15443cb1",
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
  "last_heartbeat_at": "2026-10-28T13:39:38.834175Z",
  "last_location_at": "2026-10-28T13:39:38.834175Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1f96ef0a-36c9-43bf-9d2f-5efa15443cb1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:40:13Z",
    "sequence": 1793194813187
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1f96ef0a-36c9-43bf-9d2f-5efa15443cb1",
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
  "last_heartbeat_at": "2026-10-28T13:40:13.207009Z",
  "last_location_at": "2026-10-28T13:40:13.207009Z",
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
  "command_id": "af163011-d8b8-4bcc-a611-b7a7fd91ce24",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:40:13Z",
    "sequence": 1793194813765
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "224b1c1b-9c4c-44d6-9350-aa60d87e3a1f",
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
  "last_heartbeat_at": "2026-10-28T13:40:13.784171Z",
  "last_location_at": "2026-10-28T13:40:13.784171Z",
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
  "session_id": "efe5df05-d253-43ae-9a9f-0785ed6ec013",
  "subject": {
    "type": "STAFF",
    "id": "9fd8c214-5b51-4aa3-8409-dc523c7d977f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmQ4YzIxNC01YjUxLTRhYTMtODQwOS1kYzUyM2M3ZDk3N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTU3MTQsImlhdCI6MTc5MzE5NDgxNCwianRpIjoiMWJkNjAzYmMtNDhhMS00YTgzLWJhYzctZjJlNjRlZGQyZjZjIiwic2lkIjoiZWZlNWRmMDUtZDI1My00M2FlLTlhOWYtMDc4NWVkNmVjMDEzIn0.ZJPWAH7QxBws5ixbKrCbv4QM7k1dP3-3oCXq8k1TVF8",
  "access_expires_at": "2026-10-28T13:55:14.35972695Z",
  "refresh_token": "42QILDK_cDdXHDjAsJ7288-dKmgb68-aUoNOiUu23do",
  "refresh_expires_at": "2026-10-29T01:40:14.359143334Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d1d9220c-0829-4b36-832d-595b50574eba",
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
  "id": "7da430fd-deb1-4e00-81cf-bff102496cc7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:45:14.637883Z",
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
  "command_id": "fff1d57b-6829-451c-984a-ed734c0a0ca8",
  "quote_id": "7da430fd-deb1-4e00-81cf-bff102496cc7",
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
  "id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
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
  "created_at": "2026-10-28T13:40:14.931328Z",
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
    "id": "a3081808-4870-4452-9054-97ce965448e2",
    "order_id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
    "expires_at": "2026-10-28T13:40:29.936182Z",
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

`POST /api/driver/v1/offers/a3081808-4870-4452-9054-97ce965448e2/accept` → **200**

```json
{
  "command_id": "b3cde2fd-f596-4db0-bd7f-72d7a20afd26"
}
```

```json
{
  "id": "51339303-b557-49ec-afe5-b316a9dad909",
  "order_id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a",
  "order_id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
  "assignment_id": "51339303-b557-49ec-afe5-b316a9dad909",
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

`POST /api/driver/v1/work-sessions/224b1c1b-9c4c-44d6-9350-aa60d87e3a1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:40:16Z",
    "sequence": 1793194816371
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "224b1c1b-9c4c-44d6-9350-aa60d87e3a1f",
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
  "last_heartbeat_at": "2026-10-28T13:40:16.390552Z",
  "last_location_at": "2026-10-28T13:40:16.390552Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a/arrive` → **200**

```json
{
  "command_id": "1c47aa6a-dd02-4fde-ae94-4123f88bcc0c",
  "expected_version": 0
}
```

```json
{
  "id": "af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a",
  "order_id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
  "assignment_id": "51339303-b557-49ec-afe5-b316a9dad909",
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
  "arrived_at": "2026-10-28T13:40:16.679103Z",
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

`POST /api/driver/v1/trips/af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a/start` → **200**

```json
{
  "command_id": "1ba5a7da-a607-4c79-8152-bde3f536fbd7",
  "expected_version": 1
}
```

```json
{
  "id": "af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a",
  "order_id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
  "assignment_id": "51339303-b557-49ec-afe5-b316a9dad909",
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
  "arrived_at": "2026-10-28T13:40:16.679103Z",
  "started_at": "2026-10-28T13:40:16.979027Z",
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

`POST /api/driver/v1/trips/af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a/complete` → **200**

```json
{
  "command_id": "d58ba7e0-e841-4d87-b50d-4bb2c543e952",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:40:17Z",
  "cash_received": true
}
```

```json
{
  "id": "af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a",
  "order_id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
  "assignment_id": "51339303-b557-49ec-afe5-b316a9dad909",
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
  "arrived_at": "2026-10-28T13:40:16.679103Z",
  "started_at": "2026-10-28T13:40:16.979027Z",
  "completed_at": "2026-10-28T13:40:17.279612Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/e54c69d9-4d2a-4947-88b4-9fc5678c1916` → **200**

```json
{
  "id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
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
    "id": "51339303-b557-49ec-afe5-b316a9dad909",
    "order_id": "e54c69d9-4d2a-4947-88b4-9fc5678c1916",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "af9638cb-6ac2-4ff4-aa5f-8ae9d0972b0a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:40:14.931328Z",
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
  "session_id": "1f96ef0a-36c9-43bf-9d2f-5efa15443cb1",
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
  "last_heartbeat_at": "2026-10-28T13:40:13.207009Z",
  "last_location_at": "2026-10-28T13:40:13.207009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f96ef0a-36c9-43bf-9d2f-5efa15443cb1/close` → **200**

```json
{
  "command_id": "d44c0ed7-2fd4-405c-8127-59c1e4b2d032",
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
  "session_id": "224b1c1b-9c4c-44d6-9350-aa60d87e3a1f",
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
  "last_heartbeat_at": "2026-10-28T13:40:16.390552Z",
  "last_location_at": "2026-10-28T13:40:16.390552Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/224b1c1b-9c4c-44d6-9350-aa60d87e3a1f/close` → **200**

```json
{
  "command_id": "2b422cd2-4b2a-46d3-9e50-c310e3c3792b",
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

Done: terminal order e54c69d9-4d2a-4947-88b4-9fc5678c1916 by Andrii (5a000000-0000-4000-8000-000000000403).
