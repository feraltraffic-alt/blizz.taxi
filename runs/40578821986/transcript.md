# Sandbox transcript (2026-10-27T20:32:21Z, 6be8432)

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
  "correlation_id": "635da78e-3524-4b5d-9d79-b8abae2f4d04"
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
  "session_id": "25e78479-ed46-439f-a6f3-5654f65e5594",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNDIsImlhdCI6MTc5MzEzMzE0MiwianRpIjoiZDdkYTgyNzEtZjliNi00N2U0LWE2ZGQtZTRjYTg5OTJhY2JhIiwic2lkIjoiMjVlNzg0NzktZWQ0Ni00MzlmLWE2ZjMtNTY1NGY2NWU1NTk0In0.lgq4c952ZuuF4YG9YdSVoEot6JLtilO_oqDJ1EoplH0",
  "access_expires_at": "2026-10-27T20:47:22.024898794Z",
  "refresh_token": "slrZx2zxOLZ_MSexn-DCmWVA52ePK9xDAWtlwleXPXQ",
  "refresh_expires_at": "2026-10-28T08:32:22.023202065Z",
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
  "session_id": "309c83d7-46bc-41db-9b12-94a8af64ff21",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNDMsImlhdCI6MTc5MzEzMzE0MywianRpIjoiZDU3N2U4NjUtYjJjNC00ZjYyLTgzNGItMTM1MTE0YzJkYTE0Iiwic2lkIjoiMzA5YzgzZDctNDZiYy00MWRiLTliMTItOTRhOGFmNjRmZjIxIn0.-Q7X2RujqzMHvLqlhgIuuTLbZ2yCldx9OgcM9NTU9LA",
  "access_expires_at": "2026-10-27T20:47:23.076993895Z",
  "refresh_token": "b4__1q0TTwTvZFJS3VcEjEYpeqDZDw3nNh7gQ6oTiL4",
  "refresh_expires_at": "2026-10-28T08:32:23.075995565Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "92ef831e-00ea-4c03-b414-d76e8001a2d9",
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
  "id": "39a08a48-8b3f-4ff3-9509-b7df8636c9f6",
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
  "created_by": "55bfc10e-71be-4097-822f-eab970f20c31",
  "created_at": "2026-10-27T20:32:23.141786Z",
  "updated_at": "2026-10-27T20:32:23.141786Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636152959",
  "device_ref": "sandbox-14385"
}
```

```json
{
  "challenge_id": "c70a1947-07e0-4c13-9428-f3fd46119bfa",
  "expires_at": "2026-10-27T20:37:23.23050811Z",
  "resend_available_at": "2026-10-27T20:32:24.23050811Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636152959` → **200**

```json
{
  "phone": "+380636152959",
  "audience": "CLIENT",
  "code": "001142",
  "sent_at": "2026-10-27T20:32:23.308357338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c70a1947-07e0-4c13-9428-f3fd46119bfa",
  "code": "001142",
  "device_ref": "sandbox-14385"
}
```

```json
{
  "session_id": "84bf37f9-08fc-44b4-a169-a03533df9fee",
  "subject": {
    "type": "CLIENT",
    "id": "900af999-3e37-4c0f-b511-f5fcc189ee64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MDBhZjk5OS0zZTM3LTRjMGYtYjUxMS1mNWZjYzE4OWVlNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDQzLCJpYXQiOjE3OTMxMzMxNDMsImp0aSI6IjU2YWMxODNhLWM3MTctNGI0Mi05YjYzLTdkOTJjZjI0NTY1MCIsInNpZCI6Ijg0YmYzN2Y5LTA4ZmMtNDRiNC1hMTY5LWEwMzUzM2RmOWZlZSJ9.qpiEqglxmzA47SYTdLOwy70K1FYEw8JR4Nx0fyQm1Zo",
  "access_expires_at": "2026-10-27T20:47:23.517205527Z",
  "refresh_token": "s4BkQaxVPI2hyhjYGFyBG7ifTN6TTuU6DS1pg3fIdJA",
  "refresh_expires_at": "2026-11-26T20:32:23.515896517Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636152959` → **200**

```json
{
  "client_id": "900af999-3e37-4c0f-b511-f5fcc189ee64"
}
```

`POST /api/admin/v1/rider-wallets/900af999-3e37-4c0f-b511-f5fcc189ee64/top-ups` → **201**

```json
{
  "command_id": "a84b8c68-133b-41e8-896c-228a48da800a",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "900af999-3e37-4c0f-b511-f5fcc189ee64",
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
      "id": "b3900b6e-b56a-482d-8791-4c3be317fc07",
      "at": "2026-10-27T20:32:23.664683Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "55bfc10e-71be-4097-822f-eab970f20c31",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ea93808d-7276-4782-8f0f-e039b83cfe48",
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
  "id": "c0656d9c-2edc-4ec6-9ab4-cced25d2af5b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:37:23.795867Z",
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
      "id": "39a08a48-8b3f-4ff3-9509-b7df8636c9f6",
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
  "device_ref": "sandbox-14939"
}
```

```json
{
  "challenge_id": "690cd9ef-ff59-4333-8f12-c8a23b3707da",
  "expires_at": "2026-10-27T20:37:23.853514662Z",
  "resend_available_at": "2026-10-27T20:32:24.853514662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "782648",
  "sent_at": "2026-10-27T20:32:23.856534699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "690cd9ef-ff59-4333-8f12-c8a23b3707da",
  "code": "782648",
  "device_ref": "sandbox-14939"
}
```

```json
{
  "session_id": "35d6104c-3f02-461e-92c3-a04c63a2f59c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA0MywiaWF0IjoxNzkzMTMzMTQzLCJqdGkiOiI0YTYyZjhiYi0xZTIxLTQ5YjUtYjE2OC1hMzFmMzNhZWVlNjUiLCJzaWQiOiIzNWQ2MTA0Yy0zZjAyLTQ2MWUtOTJjMy1hMDRjNjNhMmY1OWMifQ.MhUiJ5vGBxqbdIPn8yJsaIeZCVTBiwcsRWJ0Sv_AN74",
  "access_expires_at": "2026-10-27T20:47:23.909835754Z",
  "refresh_token": "sJeMm_WhlePqMRV_HMrNbJM5P9F7EnglwJlaiWGyne8",
  "refresh_expires_at": "2026-11-26T20:32:23.90909579Z",
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
  "command_id": "c11c10f4-7801-47a3-8149-c208d75a0fb2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:23Z",
    "sequence": 1793133143966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad2b2645-ce73-4216-8e45-fad7883136ac",
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
  "last_heartbeat_at": "2026-10-27T20:32:24.00615Z",
  "last_location_at": "2026-10-27T20:32:24.00615Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a39cc24d-be03-4a4c-b140-9c3c91db4ffc",
  "quote_id": "c0656d9c-2edc-4ec6-9ab4-cced25d2af5b",
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
  "id": "f596b209-d08e-4d54-9e69-24f477c1d5d0",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "900af999-3e37-4c0f-b511-f5fcc189ee64",
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
  "created_at": "2026-10-27T20:32:24.09732Z",
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
  "client_id": "900af999-3e37-4c0f-b511-f5fcc189ee64",
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
      "id": "b3900b6e-b56a-482d-8791-4c3be317fc07",
      "at": "2026-10-27T20:32:23.664683Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "55bfc10e-71be-4097-822f-eab970f20c31",
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
    "id": "5ce1ef29-cdc5-4285-8d11-b6e130f0ebc3",
    "order_id": "f596b209-d08e-4d54-9e69-24f477c1d5d0",
    "expires_at": "2026-10-27T20:32:39.110416Z",
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

`POST /api/driver/v1/offers/5ce1ef29-cdc5-4285-8d11-b6e130f0ebc3/accept` → **200**

```json
{
  "command_id": "62226bc5-178f-4668-bd3f-c5b8f6fcb89f"
}
```

```json
{
  "id": "ee37f2ac-675d-470f-ad54-5207eeb9cc98",
  "order_id": "f596b209-d08e-4d54-9e69-24f477c1d5d0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9ae17d9d-0680-42cc-9197-d98e8d0e0f4c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9ae17d9d-0680-42cc-9197-d98e8d0e0f4c",
  "order_id": "f596b209-d08e-4d54-9e69-24f477c1d5d0",
  "assignment_id": "ee37f2ac-675d-470f-ad54-5207eeb9cc98",
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

`POST /api/driver/v1/work-sessions/ad2b2645-ce73-4216-8e45-fad7883136ac/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:24Z",
    "sequence": 1793133144270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad2b2645-ce73-4216-8e45-fad7883136ac",
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
  "last_heartbeat_at": "2026-10-27T20:32:24.294531Z",
  "last_location_at": "2026-10-27T20:32:24.294531Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9ae17d9d-0680-42cc-9197-d98e8d0e0f4c/arrive` → **200**

```json
{
  "command_id": "89f733b8-0605-4325-aa9c-359a90d07006",
  "expected_version": 0
}
```

```json
{
  "id": "9ae17d9d-0680-42cc-9197-d98e8d0e0f4c",
  "order_id": "f596b209-d08e-4d54-9e69-24f477c1d5d0",
  "assignment_id": "ee37f2ac-675d-470f-ad54-5207eeb9cc98",
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
  "arrived_at": "2026-10-27T20:32:24.337491Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9ae17d9d-0680-42cc-9197-d98e8d0e0f4c/start` → **200**

```json
{
  "command_id": "69ca3b7b-b623-4ce7-8b54-5fed3f0c502d",
  "expected_version": 1
}
```

```json
{
  "id": "9ae17d9d-0680-42cc-9197-d98e8d0e0f4c",
  "order_id": "f596b209-d08e-4d54-9e69-24f477c1d5d0",
  "assignment_id": "ee37f2ac-675d-470f-ad54-5207eeb9cc98",
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
  "arrived_at": "2026-10-27T20:32:24.337491Z",
  "started_at": "2026-10-27T20:32:24.378008Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9ae17d9d-0680-42cc-9197-d98e8d0e0f4c/complete` → **200**

```json
{
  "command_id": "c5433477-434d-4fe5-b119-cde0ded59306",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:32:24Z",
  "cash_received": true
}
```

```json
{
  "id": "9ae17d9d-0680-42cc-9197-d98e8d0e0f4c",
  "order_id": "f596b209-d08e-4d54-9e69-24f477c1d5d0",
  "assignment_id": "ee37f2ac-675d-470f-ad54-5207eeb9cc98",
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
  "arrived_at": "2026-10-27T20:32:24.337491Z",
  "started_at": "2026-10-27T20:32:24.378008Z",
  "completed_at": "2026-10-27T20:32:24.437645Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "900af999-3e37-4c0f-b511-f5fcc189ee64",
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
      "id": "ea7701b3-3236-4b64-bfa0-82bd30478ab3",
      "at": "2026-10-27T20:32:25.14391Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f596b209-d08e-4d54-9e69-24f477c1d5d0"
    },
    {
      "id": "b3900b6e-b56a-482d-8791-4c3be317fc07",
      "at": "2026-10-27T20:32:23.664683Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "55bfc10e-71be-4097-822f-eab970f20c31",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/39a08a48-8b3f-4ff3-9509-b7df8636c9f6/archive` → **200**

```json
{
  "command_id": "0ee9c01f-905f-4bf6-ba63-9efee4bb842b",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "39a08a48-8b3f-4ff3-9509-b7df8636c9f6",
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
  "created_by": "55bfc10e-71be-4097-822f-eab970f20c31",
  "created_at": "2026-10-27T20:32:23.141786Z",
  "updated_at": "2026-10-27T20:32:27.526505Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad2b2645-ce73-4216-8e45-fad7883136ac",
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
  "last_heartbeat_at": "2026-10-27T20:32:24.294531Z",
  "last_location_at": "2026-10-27T20:32:24.294531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ad2b2645-ce73-4216-8e45-fad7883136ac/close` → **200**

```json
{
  "command_id": "e17d8c9d-3bbb-4b89-a1d0-9f7f67ffbe43",
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

Done: order f596b209-d08e-4d54-9e69-24f477c1d5d0.

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
  "session_id": "1ad8920f-4c58-4b8e-8501-32aebf940b3c",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNDcsImlhdCI6MTc5MzEzMzE0NywianRpIjoiZDlkMDMwMWUtYzgyZi00MjM2LThjY2ItZTljNjI3YzVmYmRiIiwic2lkIjoiMWFkODkyMGYtNGM1OC00YjhlLTg1MDEtMzJhZWJmOTQwYjNjIn0.tEgoO5v451bjsmWopOc6ZadT6Tfxofb6WoapKyPEQJ4",
  "access_expires_at": "2026-10-27T20:47:27.854892836Z",
  "refresh_token": "i6TfYsNi3XSnDuZAqsKXSHD5op4dt9eLn7DTbnsdCMU",
  "refresh_expires_at": "2026-10-28T08:32:27.854095935Z",
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
  "command_id": "88f69ed6-9dc5-4830-bdf9-9260952a6b85",
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
  "session_id": "da2421e6-c8c2-4e91-b69a-8f4cd440147f",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNDgsImlhdCI6MTc5MzEzMzE0OCwianRpIjoiNmJhZWY3ZmQtMDQyMi00MWY4LThjZTYtZGM0ZjUxZDE1ZmEzIiwic2lkIjoiZGEyNDIxZTYtYzhjMi00ZTkxLWI2OWEtOGY0Y2Q0NDAxNDdmIn0.OSnf4yj3Qxw9zXzlz2Z1co6w1Xl40RDNoGBLryg7btc",
  "access_expires_at": "2026-10-27T20:47:28.162046965Z",
  "refresh_token": "s3Z6uCF2pFIsqozkBga9Gcoh0GRMELg3A9fHtqel304",
  "refresh_expires_at": "2026-10-28T08:32:28.161424421Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3179424395",
    "linkedid": "1730052700.3179424395",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678207012"
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
    "id": "1730052700.3179424395",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "407a3b11-00c3-40ef-ac2f-d9ab25e9fe5e",
      "state": "MISSED",
      "caller_phone": "+380678207012",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T20:32:28.189147Z",
      "answered_at": null,
      "ended_at": "2026-10-27T20:32:28.212518Z",
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
    "id": "1730052600.2736913651",
    "linkedid": "1730052600.2736913651",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678207012"
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
      "id": "b1569a37-88a1-4bbb-8a5f-c92fe12c4222",
      "state": "RINGING",
      "caller_phone": "+380678207012",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T20:32:28.274645Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/b1569a37-88a1-4bbb-8a5f-c92fe12c4222/answer` → **200**

```json
{
  "command_id": "902c3fc0-5ab6-451f-bfe3-f956dbd7ae5c"
}
```

```json
{
  "id": "b1569a37-88a1-4bbb-8a5f-c92fe12c4222",
  "state": "ANSWERED",
  "caller_phone": "+380678207012",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "55bfc10e-71be-4097-822f-eab970f20c31",
  "order_ids": [],
  "started_at": "2026-10-27T20:32:28.274645Z",
  "answered_at": "2026-10-27T20:32:28.334468Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2736913651",
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
    "id": "1730052600.2736913651",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b1569a37-88a1-4bbb-8a5f-c92fe12c4222",
      "state": "ENDED",
      "caller_phone": "+380678207012",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "55bfc10e-71be-4097-822f-eab970f20c31",
      "order_ids": [],
      "started_at": "2026-10-27T20:32:28.274645Z",
      "answered_at": "2026-10-27T20:32:28.334468Z",
      "ended_at": "2026-10-27T20:32:28.381979Z",
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
      "id": "b1569a37-88a1-4bbb-8a5f-c92fe12c4222",
      "state": "ENDED",
      "caller_phone": "+380678207012",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "55bfc10e-71be-4097-822f-eab970f20c31",
      "order_ids": [],
      "started_at": "2026-10-27T20:32:28.274645Z",
      "answered_at": "2026-10-27T20:32:28.334468Z",
      "ended_at": "2026-10-27T20:32:28.381979Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-27T20:32:30.025386Z"
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
      "id": "b1569a37-88a1-4bbb-8a5f-c92fe12c4222",
      "state": "ENDED",
      "caller_phone": "+380678207012",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "55bfc10e-71be-4097-822f-eab970f20c31",
      "order_ids": [],
      "started_at": "2026-10-27T20:32:28.274645Z",
      "answered_at": "2026-10-27T20:32:28.334468Z",
      "ended_at": "2026-10-27T20:32:28.381979Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-27T20:32:30.025386Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/b1569a37-88a1-4bbb-8a5f-c92fe12c4222/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b1569a37-88a1-4bbb-8a5f-c92fe12c4222/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b1569a37-88a1-4bbb-8a5f-c92fe12c4222` → **200**

```json
{
  "changes": [
    {
      "id": "957ef0df-6233-477a-bd9b-a6156bf36f15",
      "occurred_at": "2026-10-27T20:32:30.547359Z",
      "actor_type": "STAFF",
      "actor_id": "55bfc10e-71be-4097-822f-eab970f20c31",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b1569a37-88a1-4bbb-8a5f-c92fe12c4222",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a73d87b1-d548-49d5-8882-09564e44f6b0\", \"order_ids\": []}",
      "correlation_id": "cffdebba-da31-46f6-8ce0-2a1ef5780e48"
    },
    {
      "id": "63d7324e-8901-46c8-a168-1a67d67bb119",
      "occurred_at": "2026-10-27T20:32:30.51971Z",
      "actor_type": "STAFF",
      "actor_id": "55bfc10e-71be-4097-822f-eab970f20c31",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b1569a37-88a1-4bbb-8a5f-c92fe12c4222",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a73d87b1-d548-49d5-8882-09564e44f6b0\", \"order_ids\": []}",
      "correlation_id": "ff2e120b-eaac-4cfb-9424-f572c6c7f48e"
    }
  ]
}
```

Done: call b1569a37-88a1-4bbb-8a5f-c92fe12c4222 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633234983",
  "device_ref": "sandbox-16027"
}
```

```json
{
  "challenge_id": "b209e23e-5656-4cba-a277-906575b2ee69",
  "expires_at": "2026-10-27T20:37:30.618949836Z",
  "resend_available_at": "2026-10-27T20:32:31.618949836Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633234983` → **200**

```json
{
  "phone": "+380633234983",
  "audience": "CLIENT",
  "code": "355120",
  "sent_at": "2026-10-27T20:32:30.622783097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b209e23e-5656-4cba-a277-906575b2ee69",
  "code": "355120",
  "device_ref": "sandbox-16027"
}
```

```json
{
  "session_id": "079fb1f9-6192-4bb2-bdd2-719a3f2d5dd0",
  "subject": {
    "type": "CLIENT",
    "id": "fca19cc6-f7c9-47c2-b0c8-8b799b8244df"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2ExOWNjNi1mN2M5LTQ3YzItYjBjOC04Yjc5OWI4MjQ0ZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDUwLCJpYXQiOjE3OTMxMzMxNTAsImp0aSI6IjI4N2I2OWMyLTI1ZjQtNDBmOC1iMGFkLTc4MzUzNGI2OTQ4NiIsInNpZCI6IjA3OWZiMWY5LTYxOTItNGJiMi1iZGQyLTcxOWEzZjJkNWRkMCJ9.i4ZcLyVmR4vURh0vryHorLHLzqKsKmc2ttLZYs-1tsI",
  "access_expires_at": "2026-10-27T20:47:30.675418898Z",
  "refresh_token": "8bE6hiVAe-yW5ehmNedO0dBuERgF7m0ew4-McSFbgyE",
  "refresh_expires_at": "2026-11-26T20:32:30.674786181Z",
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
  "device_ref": "sandbox-1533"
}
```

```json
{
  "challenge_id": "ff20d3ab-c433-40e6-b78a-f3b405826430",
  "expires_at": "2026-10-27T20:37:30.728148428Z",
  "resend_available_at": "2026-10-27T20:32:31.728148428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "623035",
  "sent_at": "2026-10-27T20:32:30.735965252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff20d3ab-c433-40e6-b78a-f3b405826430",
  "code": "623035",
  "device_ref": "sandbox-1533"
}
```

```json
{
  "session_id": "a318a458-55f0-4be5-9260-256fd16d70a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA1MCwiaWF0IjoxNzkzMTMzMTUwLCJqdGkiOiJjZTEwYWRiYS00Yzc1LTRmODctOWNlMC05ODJmZjcxYTc4ZWIiLCJzaWQiOiJhMzE4YTQ1OC01NWYwLTRiZTUtOTI2MC0yNTZmZDE2ZDcwYTgifQ.gDKUPzV-T2tsiwKQkdwxcXzFpAWaIwnTIAQC5Kicrbc",
  "access_expires_at": "2026-10-27T20:47:30.796400609Z",
  "refresh_token": "SVTFzBgyPVBx3gdHNJUD6mv7Km1XtCIpJJ8rZilRnjo",
  "refresh_expires_at": "2026-11-26T20:32:30.795518903Z",
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
  "session_id": "83706b20-5c97-40cc-9291-f2dc8aff45c9",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNTEsImlhdCI6MTc5MzEzMzE1MSwianRpIjoiNzgxZDQyOTctMjBiMS00NmY2LWI4ZjgtMWJmOTljYzE5ZmFlIiwic2lkIjoiODM3MDZiMjAtNWM5Ny00MGNjLTkyOTEtZjJkYzhhZmY0NWM5In0.fdNpDfZAlh8t5-tOBBN4w7bzpzttzMBK0fbtvxOjF1s",
  "access_expires_at": "2026-10-27T20:47:31.049459191Z",
  "refresh_token": "icuhoYGcACHwxroujHKDgv68A7bOmQNDcvlV5sn4_yk",
  "refresh_expires_at": "2026-10-28T08:32:31.048875159Z",
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
  "session_id": "e5678895-3921-48ed-92d6-087658e5e85f",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNTEsImlhdCI6MTc5MzEzMzE1MSwianRpIjoiMGVhOGE4NTctOTYxNi00YjBmLWIwMDQtZmNmODYyMWYyNjMxIiwic2lkIjoiZTU2Nzg4OTUtMzkyMS00OGVkLTkyZDYtMDg3NjU4ZTVlODVmIn0.9gdmA8Y4LSIHsyQTkCFe5nL7n_-Gia-CSXcM1c611Rc",
  "access_expires_at": "2026-10-27T20:47:31.276300766Z",
  "refresh_token": "jtjsrqwZk6w4-8MpraBwFg7VpQi0-q-WauAtBQH4usM",
  "refresh_expires_at": "2026-10-28T08:32:31.275847557Z",
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
  "command_id": "c5dc563d-6559-4239-af4b-d4f63b5328ec",
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
  "id": "ad7fa99a-8928-4691-aaa9-5a663e11007e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T20:37:31.331092Z",
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
  "command_id": "366557ad-d017-46a1-ac5c-a3f610562895",
  "quote_id": "ad7fa99a-8928-4691-aaa9-5a663e11007e",
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
  "id": "10f0537b-013d-472d-878c-888ab5582a65",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fca19cc6-f7c9-47c2-b0c8-8b799b8244df",
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
  "created_at": "2026-10-27T20:32:31.367066Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/10f0537b-013d-472d-878c-888ab5582a65` → **200**

```json
{
  "id": "10f0537b-013d-472d-878c-888ab5582a65",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fca19cc6-f7c9-47c2-b0c8-8b799b8244df",
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
  "created_at": "2026-10-27T20:32:31.367066Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/10f0537b-013d-472d-878c-888ab5582a65/cancel` → **200**

```json
{
  "command_id": "739f3747-7a42-44a6-9b9c-2f006146406a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "10f0537b-013d-472d-878c-888ab5582a65",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fca19cc6-f7c9-47c2-b0c8-8b799b8244df",
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
  "created_at": "2026-10-27T20:32:31.367066Z",
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
  "command_id": "72a0bcd4-8427-4e7d-b5a3-d64023354591",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:31Z",
    "sequence": 1793133151484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
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
  "last_heartbeat_at": "2026-10-27T20:32:31.501281Z",
  "last_location_at": "2026-10-27T20:32:31.501281Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28129"
}
```

```json
{
  "challenge_id": "18210966-6243-45d7-a62f-75ec4db66891",
  "expires_at": "2026-10-27T20:37:31.528037698Z",
  "resend_available_at": "2026-10-27T20:32:32.528037698Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "817631",
  "sent_at": "2026-10-27T20:32:31.53064412Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18210966-6243-45d7-a62f-75ec4db66891",
  "code": "817631",
  "device_ref": "sandbox-28129"
}
```

```json
{
  "session_id": "bc37b14c-90aa-45b7-8141-75a35bcad772",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA1MSwiaWF0IjoxNzkzMTMzMTUxLCJqdGkiOiJkMjBiMGQyMi0xMDE3LTQwOGEtYmJlNy1hMzVjZjgzNmRhMTciLCJzaWQiOiJiYzM3YjE0Yy05MGFhLTQ1YjctODE0MS03NWEzNWJjYWQ3NzIifQ.XzF5lNjL_rSgqFHgiXPhE34vjR6q2laexxirhjkOeWU",
  "access_expires_at": "2026-10-27T20:47:31.582234197Z",
  "refresh_token": "J9-L1bh82ai8Jf9WIZ3xVyFTQ1rnJ1QwnDxx7jWs-SY",
  "refresh_expires_at": "2026-11-26T20:32:31.581664788Z",
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
  "command_id": "e349679c-962a-4fe4-b89b-b7cfc0f27ebf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:31Z",
    "sequence": 1793133151630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab8f616b-6f11-48aa-bfb1-9cb10b25e013",
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
  "last_heartbeat_at": "2026-10-27T20:32:31.647679Z",
  "last_location_at": "2026-10-27T20:32:31.647679Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "41cfbc5c-09f9-4569-b7c7-61cd0f953de2",
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
  "id": "ce09e2ee-a43b-4838-aacf-f2b96b69d502",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T20:37:31.684345Z",
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
  "command_id": "cf05ceb9-f276-4cab-83cb-1d53bd126438",
  "quote_id": "ce09e2ee-a43b-4838-aacf-f2b96b69d502",
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
  "id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fca19cc6-f7c9-47c2-b0c8-8b799b8244df",
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
  "created_at": "2026-10-27T20:32:31.719941Z",
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
    "id": "d42f86a0-53d3-4507-af91-2168a7c17068",
    "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
    "expires_at": "2026-10-27T20:32:46.723539Z",
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

`POST /api/driver/v1/offers/d42f86a0-53d3-4507-af91-2168a7c17068/accept` → **200**

```json
{
  "command_id": "d44b9078-7832-4c55-8d1c-d09e545055d9"
}
```

```json
{
  "id": "596cbb7c-dac8-42c9-842b-b4de175f8bd2",
  "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3761fede-6d29-4797-a312-e8387976fcf8",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3761fede-6d29-4797-a312-e8387976fcf8",
  "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
  "assignment_id": "596cbb7c-dac8-42c9-842b-b4de175f8bd2",
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

`POST /api/driver/v1/trips/3761fede-6d29-4797-a312-e8387976fcf8/cancel` → **200**

```json
{
  "command_id": "bebf023d-4649-47a5-adf4-dcb0c1dcfffd",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "3761fede-6d29-4797-a312-e8387976fcf8",
  "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
  "assignment_id": "596cbb7c-dac8-42c9-842b-b4de175f8bd2",
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

`GET /api/rider/v1/orders/161031d9-065b-407d-a2c7-3eed1a518bf2` → **200**

```json
{
  "id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fca19cc6-f7c9-47c2-b0c8-8b799b8244df",
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
    "id": "596cbb7c-dac8-42c9-842b-b4de175f8bd2",
    "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3761fede-6d29-4797-a312-e8387976fcf8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T20:32:31.719941Z",
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
    "id": "a498d9c4-8891-44f0-b566-9193fad0421b",
    "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
    "expires_at": "2026-10-27T20:32:46.846872Z",
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

`POST /api/driver/v1/offers/a498d9c4-8891-44f0-b566-9193fad0421b/accept` → **200**

```json
{
  "command_id": "5a306a13-26eb-46df-8e02-3587e36f66ec"
}
```

```json
{
  "id": "b71005ab-6a7d-400a-83c1-fe1a4f9d9058",
  "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6d82674e-d32c-4033-a13f-9f911bafb888",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6d82674e-d32c-4033-a13f-9f911bafb888",
  "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
  "assignment_id": "b71005ab-6a7d-400a-83c1-fe1a4f9d9058",
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

`POST /api/driver/v1/trips/6d82674e-d32c-4033-a13f-9f911bafb888/cancel` → **200**

```json
{
  "command_id": "3f508793-9e9b-4ebb-a586-0c750f69ed11",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "6d82674e-d32c-4033-a13f-9f911bafb888",
  "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
  "assignment_id": "b71005ab-6a7d-400a-83c1-fe1a4f9d9058",
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
    "id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T20:32:31.719941Z",
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
    "id": "10f0537b-013d-472d-878c-888ab5582a65",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T20:32:31.367066Z",
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

`GET /api/operator/v1/orders/161031d9-065b-407d-a2c7-3eed1a518bf2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T20:32:31.72057Z",
      "actor": {
        "type": "CLIENT",
        "id": "fca19cc6-f7c9-47c2-b0c8-8b799b8244df",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
        "quote_id": "ce09e2ee-a43b-4838-aacf-f2b96b69d502",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T20:32:31.722515Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
        "attempt_id": "c21e5b3d-d775-464f-bf62-8a71d2c9c9c5",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T20:32:31.72733Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d42f86a0-53d3-4507-af91-2168a7c17068",
        "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T20:32:31.779316Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "d42f86a0-53d3-4507-af91-2168a7c17068",
        "order_id": "161031d9-065b-407d-a2c7-3eed1a518bf2",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "596cbb7c-dac8-42c9-842b-b4de175f8bd2"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 10f0537b-013d-472d-878c-888ab5582a65, 161031d9-065b-407d-a2c7-3eed1a518bf2.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732389093",
  "device_ref": "sandbox-27547"
}
```

```json
{
  "challenge_id": "d1c50e21-f2b7-4451-87bc-743755074a64",
  "expires_at": "2026-10-27T20:37:32.092705871Z",
  "resend_available_at": "2026-10-27T20:32:33.092705871Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732389093` → **200**

```json
{
  "phone": "+380732389093",
  "audience": "CLIENT",
  "code": "490065",
  "sent_at": "2026-10-27T20:32:32.095340407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1c50e21-f2b7-4451-87bc-743755074a64",
  "code": "490065",
  "device_ref": "sandbox-27547"
}
```

```json
{
  "session_id": "50e6610a-09da-4397-b92b-f2fdff26cd30",
  "subject": {
    "type": "CLIENT",
    "id": "6089f703-68d6-4c9a-a195-716878fa4bb8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDg5ZjcwMy02OGQ2LTRjOWEtYTE5NS03MTY4NzhmYTRiYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDUyLCJpYXQiOjE3OTMxMzMxNTIsImp0aSI6ImUwMThlYjFkLTQzY2EtNGUxOS1iZjk4LWVhNTRmZDQ0NTcxMSIsInNpZCI6IjUwZTY2MTBhLTA5ZGEtNDM5Ny1iOTJiLWYyZmRmZjI2Y2QzMCJ9.Y3cSrhqFCNRvciI0cYpCiqMLE-BRSeEBu7aWClDQ-ZY",
  "access_expires_at": "2026-10-27T20:47:32.146061767Z",
  "refresh_token": "o3CIkJek_4mUkU9yBu1h15g0OJSC_2cZwbQNai79r2o",
  "refresh_expires_at": "2026-11-26T20:32:32.145588722Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6787e883-0bfe-4ad4-911a-95a77cb32b0b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2e146240-57cb-4423-aaab-d0cee3e61151",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2e146240-57cb-4423-aaab-d0cee3e61151",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "296b5457b45c8dbba79df350c5e82974",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2e146240-57cb-4423-aaab-d0cee3e61151",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732389093"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2e146240-57cb-4423-aaab-d0cee3e61151",
  "expires_at": "2026-10-27T21:02:32.178358Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2e146240-57cb-4423-aaab-d0cee3e61151` → **200**

```json
{
  "id": "2e146240-57cb-4423-aaab-d0cee3e61151",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T21:02:32.178358Z",
  "card": {
    "id": "34c3d9e6-4755-4758-9eba-9d18ff9e4cdc",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8131",
    "card_type": "Visa",
    "created_at": "2026-10-27T20:32:32.220693Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "34c3d9e6-4755-4758-9eba-9d18ff9e4cdc",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8131",
      "card_type": "Visa",
      "created_at": "2026-10-27T20:32:32.220693Z"
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
  "device_ref": "sandbox-2662"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "3df8d302-9470-4f23-b326-ab4f304af2d4",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2662"
}
```

```json
{
  "challenge_id": "781ad041-403c-4114-bb41-70428cbc69c1",
  "expires_at": "2026-10-27T20:37:33.325440059Z",
  "resend_available_at": "2026-10-27T20:32:34.325440059Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "035816",
  "sent_at": "2026-10-27T20:32:33.327407515Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "781ad041-403c-4114-bb41-70428cbc69c1",
  "code": "035816",
  "device_ref": "sandbox-2662"
}
```

```json
{
  "session_id": "20234f38-a008-48f5-b7c3-80d30cb0f8f7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA1MywiaWF0IjoxNzkzMTMzMTUzLCJqdGkiOiIwZGM0NTFhOC02ODU4LTQxNzItYWE4Zi1lMzgwMGE0MzVkNWEiLCJzaWQiOiIyMDIzNGYzOC1hMDA4LTQ4ZjUtYjdjMy04MGQzMGNiMGY4ZjcifQ.KGq3aV1z9mWb9ePgB8AVRAPXm_NKx-TMCz7ULTSL4Kw",
  "access_expires_at": "2026-10-27T20:47:33.373261589Z",
  "refresh_token": "ma51_yPDTAwogXXwuPmY36cKvWpU-SoOGqJBSRe3RDM",
  "refresh_expires_at": "2026-11-26T20:32:33.372800989Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab8f616b-6f11-48aa-bfb1-9cb10b25e013",
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
  "last_heartbeat_at": "2026-10-27T20:32:31.647679Z",
  "last_location_at": "2026-10-27T20:32:31.647679Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab8f616b-6f11-48aa-bfb1-9cb10b25e013/handover` → **200**

```json
{
  "command_id": "f3cd06da-844f-4f4f-860e-63f186970a8f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab8f616b-6f11-48aa-bfb1-9cb10b25e013",
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
  "last_heartbeat_at": "2026-10-27T20:32:31.647679Z",
  "last_location_at": "2026-10-27T20:32:31.647679Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab8f616b-6f11-48aa-bfb1-9cb10b25e013/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:33Z",
    "sequence": 1793133153450
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab8f616b-6f11-48aa-bfb1-9cb10b25e013",
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
  "last_heartbeat_at": "2026-10-27T20:32:33.469237Z",
  "last_location_at": "2026-10-27T20:32:33.469237Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "187c42a3-f171-4d19-9079-4f5cd1159b6a",
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
  "id": "2c0f0dcb-56a3-45a0-b8c6-19b810d88dae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T20:37:33.505008Z",
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
  "command_id": "97f72522-fdfb-4865-bdbc-f34678553fc4",
  "quote_id": "2c0f0dcb-56a3-45a0-b8c6-19b810d88dae",
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
  "id": "e923b4dc-8949-49af-8074-470756962f76",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6089f703-68d6-4c9a-a195-716878fa4bb8",
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
  "created_at": "2026-10-27T20:32:33.543275Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76` → **200**

```json
{
  "id": "e923b4dc-8949-49af-8074-470756962f76",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6089f703-68d6-4c9a-a195-716878fa4bb8",
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
  "created_at": "2026-10-27T20:32:33.543275Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76` → **200**

```json
{
  "id": "e923b4dc-8949-49af-8074-470756962f76",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6089f703-68d6-4c9a-a195-716878fa4bb8",
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
  "created_at": "2026-10-27T20:32:33.543275Z",
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
    "id": "5579b6e2-c059-42a8-883e-4bb1c71eaff6",
    "order_id": "e923b4dc-8949-49af-8074-470756962f76",
    "expires_at": "2026-10-27T20:32:49.254178Z",
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

`POST /api/driver/v1/offers/5579b6e2-c059-42a8-883e-4bb1c71eaff6/accept` → **200**

```json
{
  "command_id": "31f1bdd5-93c0-4b3d-862b-74989082b176"
}
```

```json
{
  "id": "3204b283-feb6-4242-9a04-e705338a3f1f",
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8de23f82-439a-4efe-ac0e-5dfbaeac0381",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8de23f82-439a-4efe-ac0e-5dfbaeac0381",
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
  "assignment_id": "3204b283-feb6-4242-9a04-e705338a3f1f",
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

`POST /api/driver/v1/work-sessions/ab8f616b-6f11-48aa-bfb1-9cb10b25e013/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:34Z",
    "sequence": 1793133154707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab8f616b-6f11-48aa-bfb1-9cb10b25e013",
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
  "last_heartbeat_at": "2026-10-27T20:32:34.72521Z",
  "last_location_at": "2026-10-27T20:32:34.72521Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8de23f82-439a-4efe-ac0e-5dfbaeac0381/arrive` → **200**

```json
{
  "command_id": "4592876f-d064-4b26-811e-157d9e360eaf",
  "expected_version": 0
}
```

```json
{
  "id": "8de23f82-439a-4efe-ac0e-5dfbaeac0381",
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
  "assignment_id": "3204b283-feb6-4242-9a04-e705338a3f1f",
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
  "arrived_at": "2026-10-27T20:32:34.759458Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8de23f82-439a-4efe-ac0e-5dfbaeac0381/start` → **200**

```json
{
  "command_id": "cfbca3db-e1a3-43a2-b297-c67c2b421e79",
  "expected_version": 1
}
```

```json
{
  "id": "8de23f82-439a-4efe-ac0e-5dfbaeac0381",
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
  "assignment_id": "3204b283-feb6-4242-9a04-e705338a3f1f",
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
  "arrived_at": "2026-10-27T20:32:34.759458Z",
  "started_at": "2026-10-27T20:32:34.795767Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8de23f82-439a-4efe-ac0e-5dfbaeac0381/complete` → **200**

```json
{
  "command_id": "89e6d74d-ad38-4227-9f66-7b980b782228",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:32:34Z"
}
```

```json
{
  "id": "8de23f82-439a-4efe-ac0e-5dfbaeac0381",
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
  "assignment_id": "3204b283-feb6-4242-9a04-e705338a3f1f",
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
  "arrived_at": "2026-10-27T20:32:34.759458Z",
  "started_at": "2026-10-27T20:32:34.795767Z",
  "completed_at": "2026-10-27T20:32:34.835722Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76` → **200**

```json
{
  "id": "e923b4dc-8949-49af-8074-470756962f76",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "6089f703-68d6-4c9a-a195-716878fa4bb8",
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
    "id": "3204b283-feb6-4242-9a04-e705338a3f1f",
    "order_id": "e923b4dc-8949-49af-8074-470756962f76",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8de23f82-439a-4efe-ac0e-5dfbaeac0381",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:32:33.543275Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76` → **200**

```json
{
  "id": "e923b4dc-8949-49af-8074-470756962f76",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "6089f703-68d6-4c9a-a195-716878fa4bb8",
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
    "id": "3204b283-feb6-4242-9a04-e705338a3f1f",
    "order_id": "e923b4dc-8949-49af-8074-470756962f76",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8de23f82-439a-4efe-ac0e-5dfbaeac0381",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:32:33.543275Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76` → **200**

```json
{
  "id": "e923b4dc-8949-49af-8074-470756962f76",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "6089f703-68d6-4c9a-a195-716878fa4bb8",
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
    "id": "3204b283-feb6-4242-9a04-e705338a3f1f",
    "order_id": "e923b4dc-8949-49af-8074-470756962f76",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8de23f82-439a-4efe-ac0e-5dfbaeac0381",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:32:33.543275Z",
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
      "id": "e718fdba-1353-4a20-900f-7330b4a3a59d",
      "at": "2026-10-27T20:32:35.265633Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e923b4dc-8949-49af-8074-470756962f76",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76/tip` → **200**

```json
{
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
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
  "available_until": "2026-10-28T20:32:34.835722Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76/tip` → **201**

```json
{
  "command_id": "d1810dea-5259-4a5b-aa37-15c2bcf66c21",
  "amount_minor": 2500
}
```

```json
{
  "id": "6d2094e0-3140-450f-a5a8-b4ee74019530",
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T20:32:37.028158Z"
}
```

`GET /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76/tip` → **200**

```json
{
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
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
  "available_until": "2026-10-28T20:32:34.835722Z",
  "open": false,
  "tip": {
    "id": "6d2094e0-3140-450f-a5a8-b4ee74019530",
    "order_id": "e923b4dc-8949-49af-8074-470756962f76",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T20:32:37.028158Z"
  }
}
```

`GET /api/rider/v1/orders/e923b4dc-8949-49af-8074-470756962f76/tip` → **200**

```json
{
  "order_id": "e923b4dc-8949-49af-8074-470756962f76",
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
  "available_until": "2026-10-28T20:32:34.835722Z",
  "open": false,
  "tip": {
    "id": "6d2094e0-3140-450f-a5a8-b4ee74019530",
    "order_id": "e923b4dc-8949-49af-8074-470756962f76",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T20:32:37.028158Z"
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
      "id": "e718fdba-1353-4a20-900f-7330b4a3a59d",
      "at": "2026-10-27T20:32:35.265633Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e923b4dc-8949-49af-8074-470756962f76",
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
      "id": "03e492ac-9fb7-40b6-a280-cacbc36a2fd4",
      "at": "2026-10-27T20:32:38.319551Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e923b4dc-8949-49af-8074-470756962f76",
      "counterpart_id": null
    },
    {
      "id": "e718fdba-1353-4a20-900f-7330b4a3a59d",
      "at": "2026-10-27T20:32:35.265633Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e923b4dc-8949-49af-8074-470756962f76",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ab8f616b-6f11-48aa-bfb1-9cb10b25e013",
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
  "last_heartbeat_at": "2026-10-27T20:32:34.72521Z",
  "last_location_at": "2026-10-27T20:32:34.72521Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab8f616b-6f11-48aa-bfb1-9cb10b25e013/close` → **200**

```json
{
  "command_id": "525a47da-b4fd-4f63-a23c-892b3cbeca44",
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

Done: card order e923b4dc-8949-49af-8074-470756962f76.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731086731",
  "device_ref": "sandbox-28089"
}
```

```json
{
  "challenge_id": "00c55ef1-beef-4058-be05-36edc9629417",
  "expires_at": "2026-10-27T20:37:39.22021397Z",
  "resend_available_at": "2026-10-27T20:32:40.22021397Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731086731` → **200**

```json
{
  "phone": "+380731086731",
  "audience": "CLIENT",
  "code": "414740",
  "sent_at": "2026-10-27T20:32:39.222693085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00c55ef1-beef-4058-be05-36edc9629417",
  "code": "414740",
  "device_ref": "sandbox-28089"
}
```

```json
{
  "session_id": "e0a0b2a8-0d0d-4af1-ac0c-4a80075a5bb8",
  "subject": {
    "type": "CLIENT",
    "id": "e0c209cf-d7c8-4610-b429-c62488123807"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMGMyMDljZi1kN2M4LTQ2MTAtYjQyOS1jNjI0ODgxMjM4MDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDU5LCJpYXQiOjE3OTMxMzMxNTksImp0aSI6ImE5ZWM4YmJiLTc3NDQtNGFiYS1hYjdlLWYzMDBhZWQ2ZDkxNCIsInNpZCI6ImUwYTBiMmE4LTBkMGQtNGFmMS1hYzBjLTRhODAwNzVhNWJiOCJ9.p3ax-tix4TNgfkSJeIZ0bCZ6uT60aBum_J_dj1d_340",
  "access_expires_at": "2026-10-27T20:47:39.272536415Z",
  "refresh_token": "F_siv_PPOp-f4aSsL-sZJDY3R7yUDKlwWvY8Wv1IY7I",
  "refresh_expires_at": "2026-11-26T20:32:39.271887193Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "f3e9c6d4-7497-4fff-94fa-81d0ff6c40dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "c9154b74-0633-4b4c-8182-a6db829fcf2f",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c9154b74-0633-4b4c-8182-a6db829fcf2f",
    "orderDate": "1793133159",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "4cefcc8a55f6823f36bd3a3b93d1ef4b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c9154b74-0633-4b4c-8182-a6db829fcf2f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731086731"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c9154b74-0633-4b4c-8182-a6db829fcf2f",
  "created_at": "2026-10-27T20:32:39.304109Z",
  "expires_at": "2026-10-27T21:02:39.304109Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/c9154b74-0633-4b4c-8182-a6db829fcf2f` → **200**

```json
{
  "id": "c9154b74-0633-4b4c-8182-a6db829fcf2f",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T20:32:39.304109Z",
  "expires_at": "2026-10-27T21:02:39.304109Z",
  "completed_at": "2026-10-27T20:32:39.340452Z",
  "masked_pan": "41****7751",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e0c209cf-d7c8-4610-b429-c62488123807",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e0c209cf-d7c8-4610-b429-c62488123807",
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
      "id": "51b34ed6-ca0e-486a-b1e1-db99c5a9582f",
      "at": "2026-10-27T20:32:40.336703Z",
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
  "client_id": "e0c209cf-d7c8-4610-b429-c62488123807",
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
      "id": "51b34ed6-ca0e-486a-b1e1-db99c5a9582f",
      "at": "2026-10-27T20:32:40.336703Z",
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
  "device_ref": "sandbox-32165"
}
```

```json
{
  "challenge_id": "3f51b0fa-51d6-4440-917a-230eadd4a447",
  "expires_at": "2026-10-27T20:37:40.459076805Z",
  "resend_available_at": "2026-10-27T20:32:41.459076805Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "379712",
  "sent_at": "2026-10-27T20:32:40.46175273Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f51b0fa-51d6-4440-917a-230eadd4a447",
  "code": "379712",
  "device_ref": "sandbox-32165"
}
```

```json
{
  "session_id": "9b871045-9934-46f4-822c-58ba6f8b90cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA2MCwiaWF0IjoxNzkzMTMzMTYwLCJqdGkiOiJlODliNjU3MC05MjgzLTRkMGMtODhhZC1kNjgwNTRlZjBlMmUiLCJzaWQiOiI5Yjg3MTA0NS05OTM0LTQ2ZjQtODIyYy01OGJhNmY4YjkwY2IifQ.J0R-6jua743OJFh80_jOkNemiD8glh1qt4VfZT4DtY4",
  "access_expires_at": "2026-10-27T20:47:40.512314985Z",
  "refresh_token": "eraNc9WlJRHgpTE6jldVawwCzxDe2z60N_x6O8CmYkQ",
  "refresh_expires_at": "2026-11-26T20:32:40.511912534Z",
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
  "command_id": "139fc835-53a7-4bee-b3f2-4a9a52ce8eb4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "3bbffe97-284a-4cb2-9491-f565e0e55d53",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3bbffe97-284a-4cb2-9491-f565e0e55d53",
    "orderDate": "1793133160",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "ea5139c0a82bea07ced401b1368788b0",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3bbffe97-284a-4cb2-9491-f565e0e55d53",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3bbffe97-284a-4cb2-9491-f565e0e55d53",
  "created_at": "2026-10-27T20:32:40.56249Z",
  "expires_at": "2026-10-27T21:02:40.56249Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/3bbffe97-284a-4cb2-9491-f565e0e55d53` → **200**

```json
{
  "id": "3bbffe97-284a-4cb2-9491-f565e0e55d53",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T20:32:40.56249Z",
  "expires_at": "2026-10-27T21:02:40.56249Z",
  "completed_at": "2026-10-27T20:32:40.590357Z",
  "masked_pan": "41****0124",
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
      "id": "244aa581-43cf-4154-8b9d-f8e8cf24864f",
      "at": "2026-10-27T20:32:41.341781Z",
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
  "command_id": "e1148564-2a56-400a-8a2c-96c4b870b271",
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
  "correlation_id": "2f8516d4-10a9-4fee-bbcd-5a418bdd5e99"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674899662",
  "device_ref": "sandbox-26752"
}
```

```json
{
  "challenge_id": "776cf8df-ab9a-4346-9ffb-d3039d918e02",
  "expires_at": "2026-10-27T20:37:41.724443785Z",
  "resend_available_at": "2026-10-27T20:32:42.724443785Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674899662` → **200**

```json
{
  "phone": "+380674899662",
  "audience": "CLIENT",
  "code": "247842",
  "sent_at": "2026-10-27T20:32:41.726865229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "776cf8df-ab9a-4346-9ffb-d3039d918e02",
  "code": "247842",
  "device_ref": "sandbox-26752"
}
```

```json
{
  "session_id": "6c6d8451-e2f5-4dd2-bea0-38534f13d633",
  "subject": {
    "type": "CLIENT",
    "id": "cecde843-1d00-4c53-8173-a61ae5fc536f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZWNkZTg0My0xZDAwLTRjNTMtODE3My1hNjFhZTVmYzUzNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDYxLCJpYXQiOjE3OTMxMzMxNjEsImp0aSI6IjVlMTNjZWFjLWY5MGQtNDNiYy1hYTJhLWNiYzU0ZTQxMTYxZCIsInNpZCI6IjZjNmQ4NDUxLWUyZjUtNGRkMi1iZWEwLTM4NTM0ZjEzZDYzMyJ9.i1w1PipDV1zbEmcqWJe7_WwPAVXgFwdl9QU_AbwPBo0",
  "access_expires_at": "2026-10-27T20:47:41.781556907Z",
  "refresh_token": "1wakiCbyPMB0QnJgBLBr0JhysuPDha5Q76x0cG0-RqM",
  "refresh_expires_at": "2026-11-26T20:32:41.781054439Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cecde843-1d00-4c53-8173-a61ae5fc536f",
  "session_id": "6c6d8451-e2f5-4dd2-bea0-38534f13d633",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a355bec1-2d94-4720-9208-11765452d8ba",
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
  "id": "d763e7d0-fdc4-4ba8-8648-87aaebdd13fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:37:41.839631Z",
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
  "challenge_id": "64adc179-da4a-4e66-8ba0-22be9a47befc",
  "expires_at": "2026-10-27T20:37:43.874731272Z",
  "resend_available_at": "2026-10-27T20:32:44.874731272Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674899662` → **200**

```json
{
  "phone": "+380674899662",
  "audience": "CLIENT",
  "code": "794091",
  "sent_at": "2026-10-27T20:32:43.877091687Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "7e3fcad2-fdcc-421e-a335-a33b014c0951",
  "challenge_id": "64adc179-da4a-4e66-8ba0-22be9a47befc",
  "otp_code": "794091"
}
```

```json
{
  "client_id": "cecde843-1d00-4c53-8173-a61ae5fc536f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T20:32:43.939491407Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "1cf060ad-c5dd-4468-8242-5f29bced5cc6",
  "quote_id": "d763e7d0-fdc4-4ba8-8648-87aaebdd13fa",
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
  "correlation_id": "efa781b9-88b2-4173-bfc4-a382a97f3831"
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
  "session_id": "e1609852-73d2-441b-85fb-79ce339c41c8",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNjQsImlhdCI6MTc5MzEzMzE2NCwianRpIjoiOTg1NzA3MDEtMDVmNi00YzFkLWI3NTEtOWEyN2I2YTExYzgxIiwic2lkIjoiZTE2MDk4NTItNzNkMi00NDFiLTg1ZmItNzljZTMzOWM0MWM4In0.Etr691mZKmEpLNZsfwjs78_Kzm1c5C35AAKj3NLz9Pg",
  "access_expires_at": "2026-10-27T20:47:44.212598269Z",
  "refresh_token": "Bd2rCz5MblnrPvgzhR1UxgMqGHkvbgsPyeTe-LcftBE",
  "refresh_expires_at": "2026-10-28T08:32:44.212097142Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "cecde843-1d00-4c53-8173-a61ae5fc536f",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T20:32:43.939491Z",
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

`POST /api/admin/v1/client-deletions/cecde843-1d00-4c53-8173-a61ae5fc536f/complete` → **200**

```json
{
  "command_id": "b16fe92b-7343-454b-bdae-ab1a45069688",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "cecde843-1d00-4c53-8173-a61ae5fc536f",
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
  "correlation_id": "68e060c7-68ab-47cc-ad59-46101f4194af"
}
```

Done: client cecde843-1d00-4c53-8173-a61ae5fc536f anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669944708",
  "device_ref": "sandbox-8439"
}
```

```json
{
  "challenge_id": "a31c8591-7d6e-4690-9c19-34b5da443ee7",
  "expires_at": "2026-10-27T20:37:44.35383196Z",
  "resend_available_at": "2026-10-27T20:32:45.35383196Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669944708` → **200**

```json
{
  "phone": "+380669944708",
  "audience": "CLIENT",
  "code": "896420",
  "sent_at": "2026-10-27T20:32:44.35780294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a31c8591-7d6e-4690-9c19-34b5da443ee7",
  "code": "896420",
  "device_ref": "sandbox-8439"
}
```

```json
{
  "session_id": "24dd2d79-04b3-4f8d-ac24-e32988e62776",
  "subject": {
    "type": "CLIENT",
    "id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjdjZDU5NC03MjlmLTRkNjItYjdhZS1iNGY2YjI3ZGJhZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDY0LCJpYXQiOjE3OTMxMzMxNjQsImp0aSI6IjFkYjM3YzVmLTY5MWEtNDM1Yi1hOTdkLWZkOWVjMzY5Zjk1NSIsInNpZCI6IjI0ZGQyZDc5LTA0YjMtNGY4ZC1hYzI0LWUzMjk4OGU2Mjc3NiJ9.Ko90Ny8ihSvlQNRxYx_1gvQRJDPmckOUxhfNhaMaHsI",
  "access_expires_at": "2026-10-27T20:47:44.416444215Z",
  "refresh_token": "yrk62YhkKM-2pGsszEQfS1M_uqkDW79Jy3gn1DWiUYQ",
  "refresh_expires_at": "2026-11-26T20:32:44.415949104Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6",
  "session_id": "24dd2d79-04b3-4f8d-ac24-e32988e62776",
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
  "session_id": "a72786bb-a868-4a57-9555-88fb51b9fb3d",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNjQsImlhdCI6MTc5MzEzMzE2NCwianRpIjoiYmFkN2EzNGYtZDg2Ny00YWYyLTg5NmQtZDU1YjdhOWJmOGU3Iiwic2lkIjoiYTcyNzg2YmItYTg2OC00YTU3LTk1NTUtODhmYjUxYjlmYjNkIn0.6sjmXUSauM2gLBXmgYV-ySh5KF56JEnvdHglBDOQGZI",
  "access_expires_at": "2026-10-27T20:47:44.669540235Z",
  "refresh_token": "3SN_HgLrxli48_EXsJuiWZr5OvR4TIDNiKU-cL91g80",
  "refresh_expires_at": "2026-10-28T08:32:44.669117474Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9944708&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6",
      "phone": "+380669944708",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-27T20:32:44.413555Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/af7cd594-729f-4d62-b7ae-b4f6b27dbae6` → **200**

```json
{
  "client": {
    "id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6",
    "phone": "+380669944708",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-27T20:32:44.413555Z",
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

`POST /api/admin/v1/clients/af7cd594-729f-4d62-b7ae-b4f6b27dbae6/block` → **400**

```json
{
  "command_id": "29046f89-2270-4dce-8fcf-3d3162e0516a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/af7cd594-729f-4d62-b7ae-b4f6b27dbae6/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "52603518-a432-490a-a398-f49652c3d048",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/af7cd594-729f-4d62-b7ae-b4f6b27dbae6/block` → **200**

```json
{
  "command_id": "5294d07c-3c5d-4932-89ac-bebe7f299a6e",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6",
  "phone": "+380669944708",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-27T20:32:44.413555Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-27T20:32:44.829563Z",
    "by": "55bfc10e-71be-4097-822f-eab970f20c31"
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
  "correlation_id": "58338bc6-026c-43f8-8d96-108be3afb2e8"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669944708",
  "device_ref": "sandbox-5193"
}
```

```json
{
  "challenge_id": "6c7934e1-8e72-48b4-8e64-8ef9c95fa230",
  "expires_at": "2026-10-27T20:37:46.888904049Z",
  "resend_available_at": "2026-10-27T20:32:47.888904049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669944708` → **200**

```json
{
  "phone": "+380669944708",
  "audience": "CLIENT",
  "code": "345191",
  "sent_at": "2026-10-27T20:32:46.891015347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "6c7934e1-8e72-48b4-8e64-8ef9c95fa230",
  "code": "345191",
  "device_ref": "sandbox-5193"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "b7c77969-e346-45ff-a94f-0d14df7deb98"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/af7cd594-729f-4d62-b7ae-b4f6b27dbae6` → **200**

```json
{
  "client": {
    "id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6",
    "phone": "+380669944708",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-27T20:32:44.413555Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-27T20:32:44.829563Z",
      "by": "55bfc10e-71be-4097-822f-eab970f20c31"
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

`POST /api/admin/v1/clients/af7cd594-729f-4d62-b7ae-b4f6b27dbae6/unblock` → **200**

```json
{
  "command_id": "04a75e18-5733-4bae-b253-fd9609b43c78",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6",
  "phone": "+380669944708",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-27T20:32:44.413555Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669944708",
  "device_ref": "sandbox-29650"
}
```

```json
{
  "challenge_id": "c1322247-d85a-4c6f-b492-42b5421a94c7",
  "expires_at": "2026-10-27T20:37:49.045625602Z",
  "resend_available_at": "2026-10-27T20:32:50.045625602Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669944708` → **200**

```json
{
  "phone": "+380669944708",
  "audience": "CLIENT",
  "code": "712196",
  "sent_at": "2026-10-27T20:32:49.052402327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1322247-d85a-4c6f-b492-42b5421a94c7",
  "code": "712196",
  "device_ref": "sandbox-29650"
}
```

```json
{
  "session_id": "b8866b7a-f3f2-4009-ac85-934c56dd785c",
  "subject": {
    "type": "CLIENT",
    "id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjdjZDU5NC03MjlmLTRkNjItYjdhZS1iNGY2YjI3ZGJhZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDY5LCJpYXQiOjE3OTMxMzMxNjksImp0aSI6ImJiMDk4NzlkLWIzMWQtNDhjZi04YzBiLWYwM2YxZGJlNTEzOCIsInNpZCI6ImI4ODY2YjdhLWYzZjItNDAwOS1hYzg1LTkzNGM1NmRkNzg1YyJ9.ROOFU4zsB9FCiNzizC57gmvOpQSqcBw_2onrapPpCcA",
  "access_expires_at": "2026-10-27T20:47:49.104389132Z",
  "refresh_token": "pGNgR9CTsdIiosVZH7MejdQHZc-i0Vmu0byGokDhIzM",
  "refresh_expires_at": "2026-11-26T20:32:49.103961323Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "af7cd594-729f-4d62-b7ae-b4f6b27dbae6",
  "session_id": "b8866b7a-f3f2-4009-ac85-934c56dd785c",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

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
  "device_ref": "sandbox-30233"
}
```

```json
{
  "challenge_id": "b0d71fb2-2691-4dea-bca1-136e38c38ab4",
  "expires_at": "2026-10-27T20:37:49.192716947Z",
  "resend_available_at": "2026-10-27T20:32:50.192716947Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "813109",
  "sent_at": "2026-10-27T20:32:49.194945287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0d71fb2-2691-4dea-bca1-136e38c38ab4",
  "code": "813109",
  "device_ref": "sandbox-30233"
}
```

```json
{
  "session_id": "c0e3bbf8-dde7-4836-b892-78dc30960650",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA2OSwiaWF0IjoxNzkzMTMzMTY5LCJqdGkiOiIwNGMwYjIxZS03MmI3LTQyZjctOTk3ZC1kYzdhMmM3MzJjYzgiLCJzaWQiOiJjMGUzYmJmOC1kZGU3LTQ4MzYtYjg5Mi03OGRjMzA5NjA2NTAifQ.hwmpuytn7fB3FmgNny3Lbrp_98HJlv6gFpE3bwhRaGA",
  "access_expires_at": "2026-10-27T20:47:49.246493536Z",
  "refresh_token": "Eda0t3doFp5gNcKb-7cmipp63wGlgaTZJJO8ywZDxBI",
  "refresh_expires_at": "2026-11-26T20:32:49.245992066Z",
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
  "command_id": "736686b2-227a-4797-bac5-62271bb5b075",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:49Z",
    "sequence": 1793133169291
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:49.308066Z",
  "last_location_at": "2026-10-27T20:32:49.308066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674429119",
  "device_ref": "sandbox-15856"
}
```

```json
{
  "challenge_id": "7a094dc0-4e2c-41eb-b2e5-31162a65c4e7",
  "expires_at": "2026-10-27T20:37:49.337555899Z",
  "resend_available_at": "2026-10-27T20:32:50.337555899Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674429119` → **200**

```json
{
  "phone": "+380674429119",
  "audience": "CLIENT",
  "code": "115093",
  "sent_at": "2026-10-27T20:32:49.341242447Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a094dc0-4e2c-41eb-b2e5-31162a65c4e7",
  "code": "115093",
  "device_ref": "sandbox-15856"
}
```

```json
{
  "session_id": "7df9583c-c44f-4606-90cd-2a3fcca34839",
  "subject": {
    "type": "CLIENT",
    "id": "e7ca54c3-cb66-416d-b5ce-a9fb18b731e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlN2NhNTRjMy1jYjY2LTQxNmQtYjVjZS1hOWZiMThiNzMxZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDY5LCJpYXQiOjE3OTMxMzMxNjksImp0aSI6IjU4MjlkZjQyLWM0ODktNDRjNC05YWNhLTI1OTE0YjZhYWI5NiIsInNpZCI6IjdkZjk1ODNjLWM0NGYtNDYwNi05MGNkLTJhM2ZjY2EzNDgzOSJ9.scw779ZdcSoHyV1m-gUS5Zixb-CRg60n4bXBa0VTDBI",
  "access_expires_at": "2026-10-27T20:47:49.394610347Z",
  "refresh_token": "hPcRq7uGlBKCKvONqg8ghOpNf9zg2yRJT8axyeEVhXg",
  "refresh_expires_at": "2026-11-26T20:32:49.394102952Z",
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
  "command_id": "89a7ccad-3477-42e6-9514-7bb0372dd51e",
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
  "id": "dbe85292-7f5c-483a-b603-3d58c4019f94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:37:49.452435Z",
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
  "command_id": "9410a621-a4bd-45f5-9661-0384ebf3a54a",
  "platform": "ANDROID",
  "token": "sandbox-driver-9b50a60b-a7e9-4bb6-9d71-25d616376abc"
}
```

```json
{
  "id": "37f078a2-b689-4626-8e9a-271ae6a6bfbc",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T20:32:49.492203Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "37369920-70e2-4cf1-bf10-c7069720ed6a",
  "platform": "ANDROID",
  "token": "sandbox-rider-3dd76981-b65e-4b97-be27-c9a2fcf5f49e"
}
```

```json
{
  "id": "4871b682-758f-4560-94d0-915b92611556",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T20:32:49.528191Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "df933d6b-245d-4fff-bd31-b630928faa3e",
  "quote_id": "dbe85292-7f5c-483a-b603-3d58c4019f94",
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
  "id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7ca54c3-cb66-416d-b5ce-a9fb18b731e3",
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
  "created_at": "2026-10-27T20:32:49.56756Z",
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
    "id": "118ec610-3987-469d-80fe-2e0d4bdeaf17",
    "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
    "expires_at": "2026-10-27T20:33:04.570146Z",
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

`POST /api/driver/v1/offers/118ec610-3987-469d-80fe-2e0d4bdeaf17/accept` → **200**

```json
{
  "command_id": "ecaf65bb-80ae-45ab-a145-14c012b49c42"
}
```

```json
{
  "id": "42809dd8-28d2-4751-8616-f1b1c5753e84",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a98c54e9-630d-4016-93ba-2c12ab595103",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T20:32:49.546Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T20:32:49.546Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T20:32:49.546Z` → **200**

```json
[
  {
    "at": "2026-10-27T20:32:51.14231716Z",
    "token_suffix": "376abc",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "2b957d6c-abe1-466f-8ec0-eed6b97fca7b",
      "order_version": "2",
      "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674429119&after=2026-10-27T20:32:49.546Z` → **200**

```json
[
  {
    "at": "2026-10-27T20:32:51.143955205Z",
    "token_suffix": "f5f49e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "74055299-9f92-4e37-aa9e-e47b621f037e",
      "order_version": "3",
      "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/fbec9e64-0896-419e-acf2-d8577688c4b2/messages` → **201**

```json
{
  "command_id": "5b20d0e6-c878-4ec2-8a85-f203bbecb8ea",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "9ca8f5eb-4297-49c1-83f3-24d953fb0bca",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T20:32:51.772628647Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a98c54e9-630d-4016-93ba-2c12ab595103",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "assignment_id": "42809dd8-28d2-4751-8616-f1b1c5753e84",
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

`POST /api/driver/v1/trips/a98c54e9-630d-4016-93ba-2c12ab595103/messages` → **201**

```json
{
  "command_id": "3697b8ac-f8a0-4c3f-acb9-cd2ed82632b0",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "286be231-89d7-40af-9cbf-3112f7737cdd",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T20:32:51.821403554Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/fbec9e64-0896-419e-acf2-d8577688c4b2/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/a98c54e9-630d-4016-93ba-2c12ab595103/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674429119"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:51Z",
    "sequence": 1793133171891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:51.908184Z",
  "last_location_at": "2026-10-27T20:32:51.908184Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a98c54e9-630d-4016-93ba-2c12ab595103",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "assignment_id": "42809dd8-28d2-4751-8616-f1b1c5753e84",
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

`POST /api/driver/v1/trips/a98c54e9-630d-4016-93ba-2c12ab595103/arrive` → **200**

```json
{
  "command_id": "3c8b707e-8e95-44e4-8e12-31aff152f933",
  "expected_version": 0
}
```

```json
{
  "id": "a98c54e9-630d-4016-93ba-2c12ab595103",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "assignment_id": "42809dd8-28d2-4751-8616-f1b1c5753e84",
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
  "arrived_at": "2026-10-27T20:32:51.956327Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a98c54e9-630d-4016-93ba-2c12ab595103/start` → **200**

```json
{
  "command_id": "1ea67074-2cef-46b0-b0ea-c35ff397b37d",
  "expected_version": 1
}
```

```json
{
  "id": "a98c54e9-630d-4016-93ba-2c12ab595103",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "assignment_id": "42809dd8-28d2-4751-8616-f1b1c5753e84",
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
  "arrived_at": "2026-10-27T20:32:51.956327Z",
  "started_at": "2026-10-27T20:32:51.987308Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:52Z",
    "sequence": 1793133172868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:52.025509Z",
  "last_location_at": "2026-10-27T20:32:52.025509Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/a98c54e9-630d-4016-93ba-2c12ab595103/complete` → **200**

```json
{
  "command_id": "38ab0c7a-d9de-415a-b804-8d11b3e0d196",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:32:52Z",
  "cash_received": true
}
```

```json
{
  "id": "a98c54e9-630d-4016-93ba-2c12ab595103",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "assignment_id": "42809dd8-28d2-4751-8616-f1b1c5753e84",
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
  "arrived_at": "2026-10-27T20:32:51.956327Z",
  "started_at": "2026-10-27T20:32:51.987308Z",
  "completed_at": "2026-10-27T20:32:52.064606Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/fbec9e64-0896-419e-acf2-d8577688c4b2` → **200**

```json
{
  "id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e7ca54c3-cb66-416d-b5ce-a9fb18b731e3",
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
    "id": "42809dd8-28d2-4751-8616-f1b1c5753e84",
    "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a98c54e9-630d-4016-93ba-2c12ab595103",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:32:49.56756Z",
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
    "id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T20:32:49.56756Z",
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
    "id": "a98c54e9-630d-4016-93ba-2c12ab595103",
    "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
    "order_short_number": 5,
    "created_at": "2026-10-27T20:32:49.63694Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9ae17d9d-0680-42cc-9197-d98e8d0e0f4c",
    "order_id": "f596b209-d08e-4d54-9e69-24f477c1d5d0",
    "order_short_number": 1,
    "created_at": "2026-10-27T20:32:24.222931Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
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

`GET /api/rider/v1/orders/fbec9e64-0896-419e-acf2-d8577688c4b2/tip` → **200**

```json
{
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
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
  "available_until": "2026-10-28T20:32:52.064606Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fbec9e64-0896-419e-acf2-d8577688c4b2/tip` → **201**

```json
{
  "command_id": "355a2132-1fda-4d61-bfa2-2ae390301aad",
  "amount_minor": 1100
}
```

```json
{
  "id": "384ba45e-04a2-4dab-aca4-25004a5b880f",
  "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T20:32:55.269103Z"
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
  "session_id": "582258da-f156-44e8-a56b-c33979701a5a",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNzUsImlhdCI6MTc5MzEzMzE3NSwianRpIjoiM2E3YjdlZDktMjM2Yy00ZGEzLTk2NzYtNDhmZTE2NzM4M2IxIiwic2lkIjoiNTgyMjU4ZGEtZjE1Ni00NGU4LWE1NmItYzMzOTc5NzAxYTVhIn0.DuCB8ISc_RTsB-ANEaJjUBWFktsGUZ_a_2SeCXtyggw",
  "access_expires_at": "2026-10-27T20:47:55.515560914Z",
  "refresh_token": "wLEh1UW-xLL78V0lCM2Waa0H8vN-piOlxRz3C8MCKsw",
  "refresh_expires_at": "2026-10-28T08:32:55.515123805Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
      "counts": {
        "created": 5,
        "fulfilled": 3,
        "cancelled": 2,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 5
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 4
        },
        "cancelled_by": {
          "RIDER": 1,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 5,
    "fulfilled": 3,
    "cancelled": 2,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 5
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 4
    },
    "cancelled_by": {
      "RIDER": 1,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
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
  "generated_at": "2026-10-27T20:32:55.545178258Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
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
  "generated_at": "2026-10-27T20:32:55.576828848Z"
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
  "session_id": "9706f585-9d8d-4c3c-a7f7-6a231f6fe2b4",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNzUsImlhdCI6MTc5MzEzMzE3NSwianRpIjoiMjhmOWZlOGYtYzlkYi00M2FiLWEzNTgtNzgwMjA2NzFmY2UwIiwic2lkIjoiOTcwNmY1ODUtOWQ4ZC00YzNjLWE3ZjctNmEyMzFmNmZlMmI0In0.NCyL4J81-QrOP15NZdMUl1aRUdYMy7aSh1eEzpLpGdQ",
  "access_expires_at": "2026-10-27T20:47:55.816608091Z",
  "refresh_token": "RPA6XrXXp84KFNjwxTsCeKgvjjO64GcbuD6EG8jUtvU",
  "refresh_expires_at": "2026-10-28T08:32:55.816173606Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fbec9e64-0896-419e-acf2-d8577688c4b2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T20:32:49.568166Z",
      "actor": {
        "type": "CLIENT",
        "id": "e7ca54c3-cb66-416d-b5ce-a9fb18b731e3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
        "quote_id": "dbe85292-7f5c-483a-b603-3d58c4019f94",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T20:32:49.569538Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
        "attempt_id": "80fc39d1-b7db-4077-a058-bfe762e93ded",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T20:32:49.573867Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "118ec610-3987-469d-80fe-2e0d4bdeaf17",
        "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T20:32:49.638739Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "118ec610-3987-469d-80fe-2e0d4bdeaf17",
        "order_id": "fbec9e64-0896-419e-acf2-d8577688c4b2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "42809dd8-28d2-4751-8616-f1b1c5753e84"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-27T20:32:55.865563445Z",
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
      "last_location_at": "2026-10-27T20:32:52.025509Z",
      "order_id": null
    },
    {
      "driver_id": "5a000000-0000-4000-8000-000000000402",
      "name": "Олег Коваль",
      "car": {
        "registration_number": "AA0002TX",
        "make": "Toyota",
        "model": "Corolla",
        "color": "grey",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "STALE",
      "geolocation": "STALE",
      "location": {
        "lat": 50.459,
        "lon": 30.5238
      },
      "last_location_at": "2026-10-27T20:32:31.501281Z",
      "order_id": null
    }
  ]
}
```

Done: order fbec9e64-0896-419e-acf2-d8577688c4b2.

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
  "session_id": "2317a9f7-7022-4579-bd79-0c4fd81bc832",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNzYsImlhdCI6MTc5MzEzMzE3NiwianRpIjoiYTRiNmQwNTMtNGRkYS00MjU1LWJlNWQtNzNlNWQ5ODAwMjM4Iiwic2lkIjoiMjMxN2E5ZjctNzAyMi00NTc5LWJkNzktMGM0ZmQ4MWJjODMyIn0.7IndT9BZ1he0jlfuA4XHczXJouJgVyPMuGeiG4xwrb4",
  "access_expires_at": "2026-10-27T20:47:56.114569074Z",
  "refresh_token": "PQS2fgEcN7AgtAIVbrswbuQ926D24pMhLzNw_MTOKls",
  "refresh_expires_at": "2026-10-28T08:32:56.114105481Z",
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
  "command_id": "8d268e50-4af9-4bdc-9d90-ef4f46dff14e",
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
  "timestamp": "2026-10-27T20:32:56.000+0000",
  "channel": {
    "id": "1730052000.1492019048",
    "linkedid": "1730052000.1492019048",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673441803"
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
  "timestamp": "2026-10-27T20:32:56.000+0000",
  "channel": {
    "id": "1730052000.1492019048",
    "linkedid": "1730052000.1492019048",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673441803"
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
  "session_id": "4f75d6f2-4d1a-45bf-a2db-41ac8433c5d9",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNzYsImlhdCI6MTc5MzEzMzE3NiwianRpIjoiMThjMmMxNWQtMzIyNS00MDhjLThkZjQtYmQwM2MxODY3ODUzIiwic2lkIjoiNGY3NWQ2ZjItNGQxYS00NWJmLWEyZGItNDFhYzg0MzNjNWQ5In0.l-pSr5ZkB-_C-EyvoZwHPKoxqaP2Vuba9w18cUM_GAA",
  "access_expires_at": "2026-10-27T20:47:56.452061021Z",
  "refresh_token": "t4yh8Szr4FlGAROjNW3NyC8AE1KLUtrVXZsyoHcq3R0",
  "refresh_expires_at": "2026-10-28T08:32:56.451683392Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "d7600ba2-1470-4943-9899-db49d39d0cb1",
      "state": "RINGING",
      "caller_phone": "+380673441803",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-27T20:32:56Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/d7600ba2-1470-4943-9899-db49d39d0cb1/answer` → **200**

```json
{
  "command_id": "9547208e-99ab-4279-aca6-338264a941ae"
}
```

```json
{
  "id": "d7600ba2-1470-4943-9899-db49d39d0cb1",
  "state": "ANSWERED",
  "caller_phone": "+380673441803",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "55bfc10e-71be-4097-822f-eab970f20c31",
  "order_ids": [],
  "started_at": "2026-10-27T20:32:56Z",
  "answered_at": "2026-10-27T20:32:56.515686Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1492019048",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "757bcb2f-0b10-4858-b28e-fbbcdef709bb",
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
  "id": "0e09df92-3926-4c56-8129-ea19a7af631b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:37:56.581417Z",
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
  "command_id": "8ef09ff6-42c6-4c65-8bc3-c027a5937580",
  "quote_id": "0e09df92-3926-4c56-8129-ea19a7af631b",
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
    "phone": "+380673441803"
  },
  "call_id": "d7600ba2-1470-4943-9899-db49d39d0cb1"
}
```

```json
{
  "id": "44124e50-b857-4fbb-8a47-590efe65b654",
  "short_number": 6,
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
  "created_at": "2026-10-27T20:32:56.637935Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673441803"
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
    "id": "1730052000.1492019048",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d7600ba2-1470-4943-9899-db49d39d0cb1",
      "state": "ENDED",
      "caller_phone": "+380673441803",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "55bfc10e-71be-4097-822f-eab970f20c31",
      "order_ids": [
        "44124e50-b857-4fbb-8a47-590efe65b654"
      ],
      "started_at": "2026-10-27T20:32:56Z",
      "answered_at": "2026-10-27T20:32:56.515686Z",
      "ended_at": "2026-10-27T20:32:56.686676Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b1569a37-88a1-4bbb-8a5f-c92fe12c4222",
      "state": "ENDED",
      "caller_phone": "+380678207012",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "55bfc10e-71be-4097-822f-eab970f20c31",
      "order_ids": [],
      "started_at": "2026-10-27T20:32:28.274645Z",
      "answered_at": "2026-10-27T20:32:28.334468Z",
      "ended_at": "2026-10-27T20:32:28.381979Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-27T20:32:30.025386Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/44124e50-b857-4fbb-8a47-590efe65b654` → **200**

```json
{
  "id": "44124e50-b857-4fbb-8a47-590efe65b654",
  "short_number": 6,
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
  "created_at": "2026-10-27T20:32:56.637935Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673441803"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/44124e50-b857-4fbb-8a47-590efe65b654` → **200**

```json
{
  "id": "44124e50-b857-4fbb-8a47-590efe65b654",
  "short_number": 6,
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
  "created_at": "2026-10-27T20:32:56.637935Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673441803"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/44124e50-b857-4fbb-8a47-590efe65b654/cancel` → **200**

```json
{
  "command_id": "c9eea0cf-369a-4c24-899c-c3f298bd797e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "44124e50-b857-4fbb-8a47-590efe65b654",
  "short_number": 6,
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
  "created_at": "2026-10-27T20:32:56.637935Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673441803"
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

Done: call d7600ba2-1470-4943-9899-db49d39d0cb1 with order 44124e50-b857-4fbb-8a47-590efe65b654.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19314"
}
```

```json
{
  "challenge_id": "e35ec2d3-538b-46d7-9ed7-277a508e887b",
  "expires_at": "2026-10-27T20:37:56.857446603Z",
  "resend_available_at": "2026-10-27T20:32:57.857446603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "823072",
  "sent_at": "2026-10-27T20:32:56.859488802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e35ec2d3-538b-46d7-9ed7-277a508e887b",
  "code": "823072",
  "device_ref": "sandbox-19314"
}
```

```json
{
  "session_id": "f67f87d4-e4ad-4ded-a856-a1dac730b96d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA3NiwiaWF0IjoxNzkzMTMzMTc2LCJqdGkiOiI0NzQ1ZDY0ZC04ZjM4LTQ4NDQtOTU1NC04MzRjM2E1YTUzMTkiLCJzaWQiOiJmNjdmODdkNC1lNGFkLTRkZWQtYTg1Ni1hMWRhYzczMGI5NmQifQ.CSPQ9fJjjMSdqizD1hOE7Oeee_xXcKQqN4P0jk3QdV4",
  "access_expires_at": "2026-10-27T20:47:56.912818207Z",
  "refresh_token": "dCNYX92-JhmJhxZiCzhA6fwJi79VItnVt4WV0LdcSjQ",
  "refresh_expires_at": "2026-11-26T20:32:56.912235838Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:52.025509Z",
  "last_location_at": "2026-10-27T20:32:52.025509Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/handover` → **200**

```json
{
  "command_id": "f4698db9-7812-465b-b0c1-fa4025681032",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:52.025509Z",
  "last_location_at": "2026-10-27T20:32:52.025509Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:56Z",
    "sequence": 1793133176990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:57.008058Z",
  "last_location_at": "2026-10-27T20:32:57.008058Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667054934",
  "device_ref": "sandbox-21042"
}
```

```json
{
  "challenge_id": "7f5a0f56-69e0-48ed-96cf-a19cc72c1229",
  "expires_at": "2026-10-27T20:37:57.032469096Z",
  "resend_available_at": "2026-10-27T20:32:58.032469096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667054934` → **200**

```json
{
  "phone": "+380667054934",
  "audience": "CLIENT",
  "code": "233099",
  "sent_at": "2026-10-27T20:32:57.034327007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f5a0f56-69e0-48ed-96cf-a19cc72c1229",
  "code": "233099",
  "device_ref": "sandbox-21042"
}
```

```json
{
  "session_id": "560cfd7b-742f-4b39-98f2-40dc7c2fdfc2",
  "subject": {
    "type": "CLIENT",
    "id": "c9af401b-be8f-4484-a87f-02d3b63db00b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOWFmNDAxYi1iZThmLTQ0ODQtYTg3Zi0wMmQzYjYzZGIwMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDc3LCJpYXQiOjE3OTMxMzMxNzcsImp0aSI6IjQ5NjFmN2I5LTA4NWEtNDhmMy1hYjY0LTY3MWI4Y2IwYTJmYSIsInNpZCI6IjU2MGNmZDdiLTc0MmYtNGIzOS05OGYyLTQwZGM3YzJmZGZjMiJ9.PTX5Hti1mfDrUFRLea_AvQ9BW6WAmftLqQsnAkKKn30",
  "access_expires_at": "2026-10-27T20:47:57.086560975Z",
  "refresh_token": "brpsCZ9f1yhNyVsv3d5oedwZLBr9j6x1gMWcd-K90_s",
  "refresh_expires_at": "2026-11-26T20:32:57.086176305Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "827bfae9-094e-4f60-960f-f1b40ac4189f",
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
  "id": "c9219808-1067-4399-adfc-78eb5e87ad26",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T20:37:57.120022Z",
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
  "command_id": "0e41c97f-e77a-4d71-bd7b-d7b0603d13fa",
  "quote_id": "c9219808-1067-4399-adfc-78eb5e87ad26",
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
  "id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c9af401b-be8f-4484-a87f-02d3b63db00b",
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
  "created_at": "2026-10-27T20:32:57.154689Z",
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
    "id": "ec4f62df-0a37-43fe-8dae-bb4a711d544f",
    "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
    "expires_at": "2026-10-27T20:33:12.156799Z",
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

`POST /api/driver/v1/offers/ec4f62df-0a37-43fe-8dae-bb4a711d544f/accept` → **200**

```json
{
  "command_id": "b68b4471-86ae-4948-8986-8a415b4a35f8"
}
```

```json
{
  "id": "7847556c-6b40-4eba-aa4b-2cbe4c6097d2",
  "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "98c37c23-190c-4a5b-b8f8-9f396643a7e8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98c37c23-190c-4a5b-b8f8-9f396643a7e8",
  "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
  "assignment_id": "7847556c-6b40-4eba-aa4b-2cbe4c6097d2",
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

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:57Z",
    "sequence": 1793133177254
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:57.273143Z",
  "last_location_at": "2026-10-27T20:32:57.273143Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/98c37c23-190c-4a5b-b8f8-9f396643a7e8/arrive` → **200**

```json
{
  "command_id": "8e872cb1-c388-4b7b-abd8-195609ddfee8",
  "expected_version": 0
}
```

```json
{
  "id": "98c37c23-190c-4a5b-b8f8-9f396643a7e8",
  "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
  "assignment_id": "7847556c-6b40-4eba-aa4b-2cbe4c6097d2",
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
  "arrived_at": "2026-10-27T20:32:57.310227Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/98c37c23-190c-4a5b-b8f8-9f396643a7e8/start` → **200**

```json
{
  "command_id": "9f14006a-ce33-4b52-8708-e2e1cb6ea1b1",
  "expected_version": 1
}
```

```json
{
  "id": "98c37c23-190c-4a5b-b8f8-9f396643a7e8",
  "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
  "assignment_id": "7847556c-6b40-4eba-aa4b-2cbe4c6097d2",
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
  "arrived_at": "2026-10-27T20:32:57.310227Z",
  "started_at": "2026-10-27T20:32:57.34733Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:57Z",
    "sequence": 1793133177372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:57.389565Z",
  "last_location_at": "2026-10-27T20:32:57.389565Z",
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
  "device_ref": "sandbox-3845"
}
```

```json
{
  "challenge_id": "bc228ea8-a0f1-417e-b83f-1fa4f3e6a017",
  "expires_at": "2026-10-27T20:37:57.414138066Z",
  "resend_available_at": "2026-10-27T20:32:58.414138066Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "208069",
  "sent_at": "2026-10-27T20:32:57.416347758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc228ea8-a0f1-417e-b83f-1fa4f3e6a017",
  "code": "208069",
  "device_ref": "sandbox-3845"
}
```

```json
{
  "session_id": "a735e0e5-26c3-4ef0-9576-579f2df9e692",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA3NywiaWF0IjoxNzkzMTMzMTc3LCJqdGkiOiI1M2E0Yjg4Yy1jNzgzLTRkNDgtODYyNy0xYWU0Mjk4MTI2ZDQiLCJzaWQiOiJhNzM1ZTBlNS0yNmMzLTRlZjAtOTU3Ni01NzlmMmRmOWU2OTIifQ.f3Q-ahHKsTGMb_VjnsbkxrOaHQ9dbshIdSBMrFqc_WY",
  "access_expires_at": "2026-10-27T20:47:57.480861596Z",
  "refresh_token": "X3AADbvY55khVSwTx5KQEBub3ONDj_WQAI1Ws9YlMbg",
  "refresh_expires_at": "2026-11-26T20:32:57.480241712Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
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
  "last_heartbeat_at": "2026-10-27T20:32:31.501281Z",
  "last_location_at": "2026-10-27T20:32:31.501281Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e9274358-e506-4d39-ab83-536f62961979/handover` → **200**

```json
{
  "command_id": "2f5f92cd-3c43-4835-a9bc-25e1f9f97a61",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
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
  "last_heartbeat_at": "2026-10-27T20:32:31.501281Z",
  "last_location_at": "2026-10-27T20:32:31.501281Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e9274358-e506-4d39-ab83-536f62961979/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:57Z",
    "sequence": 1793133177583
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
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
  "last_heartbeat_at": "2026-10-27T20:32:57.600909Z",
  "last_location_at": "2026-10-27T20:32:57.600909Z",
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
  "session_id": "f558726e-282f-4d14-b230-09821bd36b25",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNzcsImlhdCI6MTc5MzEzMzE3NywianRpIjoiN2Q0ZDk2ODQtMDg0Mi00NWU0LWIwNGEtNTMyODNiNDI4MjJiIiwic2lkIjoiZjU1ODcyNmUtMjgyZi00ZDE0LWIyMzAtMDk4MjFiZDM2YjI1In0.-H573b73EHkLLNNB9Zi4vLFmdvKoF2wwRpPs1f3cu8c",
  "access_expires_at": "2026-10-27T20:47:57.831964547Z",
  "refresh_token": "6jkeKhP10LJ230aPqVvQPYH8uSoPdVijh8ZZzCSqrGA",
  "refresh_expires_at": "2026-10-28T08:32:57.83151584Z",
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
  "session_id": "f14e7ad2-409a-4ebe-88eb-1809703786fa",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwNzgsImlhdCI6MTc5MzEzMzE3OCwianRpIjoiNTk5ZWQyODctOGQ0YS00MDNkLTgyZjQtMjNhMzQ4OTM2YmQ0Iiwic2lkIjoiZjE0ZTdhZDItNDA5YS00ZWJlLTg4ZWItMTgwOTcwMzc4NmZhIn0.Rm2eMv4lzjYPK34F7hM8DnvY8w7iD4RT5CDc6ALwN_I",
  "access_expires_at": "2026-10-27T20:47:58.057911783Z",
  "refresh_token": "aGKBKU_1rNuzBNdXqa4gIv_kO9LcVaSaD9T2C10dSgQ",
  "refresh_expires_at": "2026-10-28T08:32:58.057574525Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e82bcf98-549f-4c33-a72f-c13afdfd183f` → **200**

```json
{
  "id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
  "short_number": 7,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c9af401b-be8f-4484-a87f-02d3b63db00b",
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
    "id": "7847556c-6b40-4eba-aa4b-2cbe4c6097d2",
    "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "98c37c23-190c-4a5b-b8f8-9f396643a7e8",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T20:32:57.154689Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e82bcf98-549f-4c33-a72f-c13afdfd183f/interrupt` → **200**

```json
{
  "command_id": "1ba8ce3e-d4bd-4542-936d-a3e7167a9e67",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
    "short_number": 7,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "c9af401b-be8f-4484-a87f-02d3b63db00b",
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
      "id": "7847556c-6b40-4eba-aa4b-2cbe4c6097d2",
      "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "98c37c23-190c-4a5b-b8f8-9f396643a7e8",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T20:32:57.154689Z",
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
    "id": "22671fa7-ea92-40b6-a7af-1332615d9ba2",
    "short_number": 8,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "c9af401b-be8f-4484-a87f-02d3b63db00b",
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
    "id": "317b50b3-c82f-4fbb-b4a7-fff98ea57592",
    "order_id": "22671fa7-ea92-40b6-a7af-1332615d9ba2",
    "expires_at": "2026-10-27T20:33:13.130241Z",
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

`POST /api/driver/v1/offers/317b50b3-c82f-4fbb-b4a7-fff98ea57592/accept` → **200**

```json
{
  "command_id": "248c07c0-02d5-4f07-8be6-502a1b394aea"
}
```

```json
{
  "id": "ee357406-c666-464c-b0ab-65faa691b7d6",
  "order_id": "22671fa7-ea92-40b6-a7af-1332615d9ba2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b2a482ff-cb63-4034-a713-f562f876565b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2a482ff-cb63-4034-a713-f562f876565b",
  "order_id": "22671fa7-ea92-40b6-a7af-1332615d9ba2",
  "assignment_id": "ee357406-c666-464c-b0ab-65faa691b7d6",
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
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
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
  "last_heartbeat_at": "2026-10-27T20:32:57.600909Z",
  "last_location_at": "2026-10-27T20:32:57.600909Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/e9274358-e506-4d39-ab83-536f62961979/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:32:58Z",
    "sequence": 1793133178265
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
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
  "last_heartbeat_at": "2026-10-27T20:32:58.282891Z",
  "last_location_at": "2026-10-27T20:32:58.282891Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b2a482ff-cb63-4034-a713-f562f876565b/arrive` → **200**

```json
{
  "command_id": "e572e288-60dd-416f-9d57-9589e5708766",
  "expected_version": 0
}
```

```json
{
  "id": "b2a482ff-cb63-4034-a713-f562f876565b",
  "order_id": "22671fa7-ea92-40b6-a7af-1332615d9ba2",
  "assignment_id": "ee357406-c666-464c-b0ab-65faa691b7d6",
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
  "arrived_at": "2026-10-27T20:32:58.317113Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b2a482ff-cb63-4034-a713-f562f876565b/start` → **200**

```json
{
  "command_id": "ea73f0db-10c6-4c60-8210-e6a5e1ca9848",
  "expected_version": 1
}
```

```json
{
  "id": "b2a482ff-cb63-4034-a713-f562f876565b",
  "order_id": "22671fa7-ea92-40b6-a7af-1332615d9ba2",
  "assignment_id": "ee357406-c666-464c-b0ab-65faa691b7d6",
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
  "arrived_at": "2026-10-27T20:32:58.317113Z",
  "started_at": "2026-10-27T20:32:58.353544Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b2a482ff-cb63-4034-a713-f562f876565b/complete` → **200**

```json
{
  "command_id": "9bc95146-6fd7-411e-ba84-c5445de38bea",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:32:58Z"
}
```

```json
{
  "id": "b2a482ff-cb63-4034-a713-f562f876565b",
  "order_id": "22671fa7-ea92-40b6-a7af-1332615d9ba2",
  "assignment_id": "ee357406-c666-464c-b0ab-65faa691b7d6",
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
  "arrived_at": "2026-10-27T20:32:58.317113Z",
  "started_at": "2026-10-27T20:32:58.353544Z",
  "completed_at": "2026-10-27T20:32:58.399618Z",
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
    "id": "22671fa7-ea92-40b6-a7af-1332615d9ba2",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-27T20:32:58.12158Z",
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
    "id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
    "short_number": 7,
    "status": "CANCELLED",
    "created_at": "2026-10-27T20:32:57.154689Z",
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

`GET /api/operator/v1/orders/e82bcf98-549f-4c33-a72f-c13afdfd183f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T20:32:57.155096Z",
      "actor": {
        "type": "CLIENT",
        "id": "c9af401b-be8f-4484-a87f-02d3b63db00b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
        "quote_id": "c9219808-1067-4399-adfc-78eb5e87ad26",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T20:32:57.156285Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
        "attempt_id": "dd6fd391-1d44-43bd-8b17-e25dc6d099ff",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T20:32:57.160088Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ec4f62df-0a37-43fe-8dae-bb4a711d544f",
        "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T20:32:57.215482Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ec4f62df-0a37-43fe-8dae-bb4a711d544f",
        "order_id": "e82bcf98-549f-4c33-a72f-c13afdfd183f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7847556c-6b40-4eba-aa4b-2cbe4c6097d2"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted e82bcf98-549f-4c33-a72f-c13afdfd183f, follow-up 22671fa7-ea92-40b6-a7af-1332615d9ba2.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15370"
}
```

```json
{
  "challenge_id": "2457e616-f5ab-4a13-9c40-52e670b70356",
  "expires_at": "2026-10-27T20:38:01.515104739Z",
  "resend_available_at": "2026-10-27T20:33:02.515104739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "103936",
  "sent_at": "2026-10-27T20:33:01.517303661Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2457e616-f5ab-4a13-9c40-52e670b70356",
  "code": "103936",
  "device_ref": "sandbox-15370"
}
```

```json
{
  "session_id": "46d626c5-5f2a-4946-b19a-9108a15e7530",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA4MSwiaWF0IjoxNzkzMTMzMTgxLCJqdGkiOiI5NGU5NzdlMS1lNjc2LTRjN2ItODc4OC0yN2ZiN2U1MmQ1YjAiLCJzaWQiOiI0NmQ2MjZjNS01ZjJhLTQ5NDYtYjE5YS05MTA4YTE1ZTc1MzAifQ.9O7LHnn1ey69BVRfT_Fd0ZGaVAGJJ3s84GFBXHSUrIY",
  "access_expires_at": "2026-10-27T20:48:01.570520577Z",
  "refresh_token": "EXXV1oHglNPku8xpmFzpYeGM1Mfn_46ybuV9Lll4dhQ",
  "refresh_expires_at": "2026-11-26T20:33:01.569939714Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
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
  "last_heartbeat_at": "2026-10-27T20:32:58.282891Z",
  "last_location_at": "2026-10-27T20:32:58.282891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9274358-e506-4d39-ab83-536f62961979/handover` → **200**

```json
{
  "command_id": "b20c155c-fb6d-457b-8fee-3b1e9c771643",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T20:32:58.282891Z",
  "last_location_at": "2026-10-27T20:32:58.282891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9274358-e506-4d39-ab83-536f62961979/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:01Z",
    "sequence": 1793133181659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T20:33:01.676509Z",
  "last_location_at": "2026-10-27T20:33:01.676509Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678407033",
  "device_ref": "sandbox-18354"
}
```

```json
{
  "challenge_id": "3e576a10-4bae-487c-9786-33202d8124b7",
  "expires_at": "2026-10-27T20:38:01.702014239Z",
  "resend_available_at": "2026-10-27T20:33:02.702014239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678407033` → **200**

```json
{
  "phone": "+380678407033",
  "audience": "CLIENT",
  "code": "308358",
  "sent_at": "2026-10-27T20:33:01.704080499Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e576a10-4bae-487c-9786-33202d8124b7",
  "code": "308358",
  "device_ref": "sandbox-18354"
}
```

```json
{
  "session_id": "2135a1c8-0883-4c60-8e34-fe80f42a6a4b",
  "subject": {
    "type": "CLIENT",
    "id": "2de313d0-2999-474f-ac26-aa8209c04241"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZGUzMTNkMC0yOTk5LTQ3NGYtYWMyNi1hYTgyMDljMDQyNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDgxLCJpYXQiOjE3OTMxMzMxODEsImp0aSI6IjUxZjA5OWU3LTdmNWUtNDAyZi1hOWI2LWFhZDkzNzRmYTk5MSIsInNpZCI6IjIxMzVhMWM4LTA4ODMtNGM2MC04ZTM0LWZlODBmNDJhNmE0YiJ9.xjAQS_oYLXmRd8LGzaZo_MSilexQsFm4UI_b2LTQzPU",
  "access_expires_at": "2026-10-27T20:48:01.763355455Z",
  "refresh_token": "-9HvQy2humpSTPDtWSH69IkTAyxyj1wZKCgFWYhggR8",
  "refresh_expires_at": "2026-11-26T20:33:01.762850941Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "52fee602-6aab-4def-aa03-efcbc6ad94d9",
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
  "id": "2f1e6f21-39e0-407f-84dc-21ca38ba91fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:38:01.804051Z",
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
  "command_id": "d574f1a9-6a65-4ad5-aa55-0325aaa75c98",
  "quote_id": "2f1e6f21-39e0-407f-84dc-21ca38ba91fb",
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
    "phone": "+380673586394"
  }
}
```

```json
{
  "id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
  "created_at": "2026-10-27T20:33:01.83889Z",
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
    "id": "ff337b84-481b-4d07-9985-333095cef21a",
    "order_id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
    "expires_at": "2026-10-27T20:33:16.841113Z",
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

`POST /api/driver/v1/offers/ff337b84-481b-4d07-9985-333095cef21a/accept` → **200**

```json
{
  "command_id": "9e88632d-52c1-4481-8587-3fe968f3a1d3"
}
```

```json
{
  "id": "bdc43b5f-930d-451e-981b-62ccd3055068",
  "order_id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f3a6e935-afc4-49e2-91be-9521230a491a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f3a6e935-afc4-49e2-91be-9521230a491a",
  "order_id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
  "assignment_id": "bdc43b5f-930d-451e-981b-62ccd3055068",
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
    "phone": "+380673586394"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "155bddf6-d1a5-4889-9a72-fbc27e094198",
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
  "id": "b15b6c3a-ccf2-4c27-83f4-d90de68cc375",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:38:01.960214Z",
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
  "command_id": "1ed931d5-7e58-4467-9650-166eba759f7a",
  "quote_id": "b15b6c3a-ccf2-4c27-83f4-d90de68cc375",
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
  "id": "aa0650d5-168f-4283-8bcd-424c33e7464a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
  "created_at": "2026-10-27T20:33:01.994234Z",
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
  "command_id": "e70979b8-f75f-4127-99f1-b19b55950552",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T23:33:02Z"
}
```

```json
{
  "id": "9712ad08-03ea-44f2-b39f-f3fe2cda9bec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:38:02.039955Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T23:33:02Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d797ea61-a414-4aac-b82a-16dceef3aa50",
  "quote_id": "9712ad08-03ea-44f2-b39f-f3fe2cda9bec",
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
  "pickup_at": "2026-10-27T23:33:02Z"
}
```

```json
{
  "id": "10a158ac-1adc-47b3-a524-dbd2c5e9b489",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
  "created_at": "2026-10-27T20:33:02.075056Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T23:33:02Z",
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
  "command_id": "26609ff1-c952-41a7-8134-dbede2904c30",
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
  "id": "fa7722d8-2477-45b4-a913-fcfa0f400943",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:38:02.112063Z",
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
  "command_id": "28d8722d-d1a0-40fc-abe1-3f07cf271ea9",
  "quote_id": "fa7722d8-2477-45b4-a913-fcfa0f400943",
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
  "correlation_id": "f17900af-ae6e-4869-9dfd-9de039afe9ac"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "10a158ac-1adc-47b3-a524-dbd2c5e9b489",
      "short_number": 11,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
      "created_at": "2026-10-27T20:33:02.075056Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T23:33:02Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "aa0650d5-168f-4283-8bcd-424c33e7464a",
      "short_number": 10,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
      "created_at": "2026-10-27T20:33:01.994234Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
      "short_number": 9,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "aa0650d5-168f-4283-8bcd-424c33e7464a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
  "created_at": "2026-10-27T20:33:01.994234Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/5b545dd6-d13b-4040-855c-318a9ec12a3f` → **200**

```json
{
  "id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
  "short_number": 9,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
    "id": "bdc43b5f-930d-451e-981b-62ccd3055068",
    "order_id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f3a6e935-afc4-49e2-91be-9521230a491a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T20:33:01.83889Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5b545dd6-d13b-4040-855c-318a9ec12a3f/cancel` → **200**

```json
{
  "command_id": "54e90db0-096b-435c-954d-c63118548fe7",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
    "id": "bdc43b5f-930d-451e-981b-62ccd3055068",
    "order_id": "5b545dd6-d13b-4040-855c-318a9ec12a3f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f3a6e935-afc4-49e2-91be-9521230a491a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T20:33:01.83889Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/aa0650d5-168f-4283-8bcd-424c33e7464a` → **200**

```json
{
  "id": "aa0650d5-168f-4283-8bcd-424c33e7464a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
  "created_at": "2026-10-27T20:33:01.994234Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/aa0650d5-168f-4283-8bcd-424c33e7464a/cancel` → **200**

```json
{
  "command_id": "ced1cfb1-344f-468a-a8b5-bfbe82960af8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "aa0650d5-168f-4283-8bcd-424c33e7464a",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
  "created_at": "2026-10-27T20:33:01.994234Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/10a158ac-1adc-47b3-a524-dbd2c5e9b489` → **200**

```json
{
  "id": "10a158ac-1adc-47b3-a524-dbd2c5e9b489",
  "short_number": 11,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
  "created_at": "2026-10-27T20:33:02.075056Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T23:33:02Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/10a158ac-1adc-47b3-a524-dbd2c5e9b489/cancel` → **200**

```json
{
  "command_id": "2cfb1f47-21c5-49a8-b391-1ce769424798",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "10a158ac-1adc-47b3-a524-dbd2c5e9b489",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "2de313d0-2999-474f-ac26-aa8209c04241",
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
  "created_at": "2026-10-27T20:33:02.075056Z",
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
  "pickup_at": "2026-10-27T23:33:02Z",
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
  "session_id": "e9274358-e506-4d39-ab83-536f62961979",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T20:33:01.676509Z",
  "last_location_at": "2026-10-27T20:33:01.676509Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e9274358-e506-4d39-ab83-536f62961979/close` → **200**

```json
{
  "command_id": "44129797-1619-4cbe-ada9-bf37fbe0bdde",
  "expected_version": 2
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

Done: orders 5b545dd6-d13b-4040-855c-318a9ec12a3f, aa0650d5-168f-4283-8bcd-424c33e7464a, 10a158ac-1adc-47b3-a524-dbd2c5e9b489.

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
  "session_id": "43aa4842-b1a4-4424-a0fb-caa4cd5078dc",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODIsImlhdCI6MTc5MzEzMzE4MiwianRpIjoiOTdiYzRkYjgtNWMxZC00OGUxLTkzOGUtMDBlZjNkZDA5MzI3Iiwic2lkIjoiNDNhYTQ4NDItYjFhNC00NDI0LWEwZmItY2FhNGNkNTA3OGRjIn0.NXvStBpxug5VeuP95-fNp8gaZaBZzDdVg7AP6oU5JzE",
  "access_expires_at": "2026-10-27T20:48:02.662926456Z",
  "refresh_token": "SqhsIbirgEs1Ur6Hoot3lnGgW044097i-2DaSGrLH7k",
  "refresh_expires_at": "2026-10-28T08:33:02.662387049Z",
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
  "session_id": "95ffb21b-b35b-44e9-b77d-4767f9386537",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODIsImlhdCI6MTc5MzEzMzE4MiwianRpIjoiMjJlZjAyMGItYTEyMS00YjVkLTg4OWQtM2MzODNkMzJiMjcwIiwic2lkIjoiOTVmZmIyMWItYjM1Yi00NGU5LWI3N2QtNDc2N2Y5Mzg2NTM3In0.1bGBzkkqaMJrlllWddKJ9-3X2D9qj9VMthqZ8THFsGk",
  "access_expires_at": "2026-10-27T20:48:02.899650741Z",
  "refresh_token": "UHBbjl_8io2k_9RhGvfac5X9fTq_tCLnaMLsFXKqg0g",
  "refresh_expires_at": "2026-10-28T08:33:02.899183132Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17821"
}
```

```json
{
  "challenge_id": "1ab31c14-8a2e-4a70-811d-c39a6a77763e",
  "expires_at": "2026-10-27T20:38:02.920888859Z",
  "resend_available_at": "2026-10-27T20:33:03.920888859Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "154260",
  "sent_at": "2026-10-27T20:33:02.922624107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ab31c14-8a2e-4a70-811d-c39a6a77763e",
  "code": "154260",
  "device_ref": "sandbox-17821"
}
```

```json
{
  "session_id": "7e7a49eb-fc6f-4b18-ac3e-b5510f3acf11",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA4MiwiaWF0IjoxNzkzMTMzMTgyLCJqdGkiOiJlOGJlMjFkZC0xMDMyLTRjNzMtYTYzZS05M2YxMTQ5NmMwMDEiLCJzaWQiOiI3ZTdhNDllYi1mYzZmLTRiMTgtYWMzZS1iNTUxMGYzYWNmMTEifQ.z8Zdreo5143RXOj201sl6cL44f370aYLu_EdV9ASx9o",
  "access_expires_at": "2026-10-27T20:48:02.971233556Z",
  "refresh_token": "MvTm1uQHN-u1s3Xd9PdolkWuJ_CK1MftX8T_TG1EonU",
  "refresh_expires_at": "2026-11-26T20:33:02.97088574Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:57.389565Z",
  "last_location_at": "2026-10-27T20:32:57.389565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/handover` → **200**

```json
{
  "command_id": "cc681497-fd27-4549-9477-59be2803b0a2",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:32:57.389565Z",
  "last_location_at": "2026-10-27T20:32:57.389565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:03Z",
    "sequence": 1793133183547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:33:03.070345Z",
  "last_location_at": "2026-10-27T20:33:03.070345Z",
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
  "command_id": "fc8e3167-ab1e-42f2-902f-9d6ed6ef7b52",
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
  "effective_at": "2026-10-27T20:33:03.13324Z",
  "changed_by": "55bfc10e-71be-4097-822f-eab970f20c31",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "55bfc10e-71be-4097-822f-eab970f20c31",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T20:33:03.160649561Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "877fb717-6fb8-45b0-ba32-8d2ac1903a19",
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
  "id": "667dd18a-f7c0-4b97-8be4-9f0b099435f9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T20:38:03.196068Z",
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
  "command_id": "eb595c79-c07d-4c82-855b-9b390be9aa61",
  "quote_id": "667dd18a-f7c0-4b97-8be4-9f0b099435f9",
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
    "phone": "+3806711114241"
  }
}
```

```json
{
  "id": "5b52b59e-d5c0-461b-84f6-1c4120a44a23",
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
  "created_at": "2026-10-27T20:33:03.23086Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114241"
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
    "id": "ce43e07e-6baf-46d4-b3db-b3aa86eb2c91",
    "order_id": "5b52b59e-d5c0-461b-84f6-1c4120a44a23",
    "expires_at": "2026-10-27T20:33:18.233417Z",
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

`POST /api/driver/v1/offers/ce43e07e-6baf-46d4-b3db-b3aa86eb2c91/accept` → **200**

```json
{
  "command_id": "5457f9af-4ad8-4e2f-8131-3c1dc93d2316"
}
```

```json
{
  "id": "1360579b-38ec-4852-9803-6424a7d6238f",
  "order_id": "5b52b59e-d5c0-461b-84f6-1c4120a44a23",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8e89620c-be27-4537-a58e-85d811b784de",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8e89620c-be27-4537-a58e-85d811b784de",
  "order_id": "5b52b59e-d5c0-461b-84f6-1c4120a44a23",
  "assignment_id": "1360579b-38ec-4852-9803-6424a7d6238f",
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
    "phone": "+3806711114241"
  }
}
```

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:03Z",
    "sequence": 1793133183548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:33:03.341399Z",
  "last_location_at": "2026-10-27T20:33:03.341399Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8e89620c-be27-4537-a58e-85d811b784de/arrive` → **200**

```json
{
  "command_id": "6b3dea0f-4b1e-4d4e-8c26-d521103a15b6",
  "expected_version": 0
}
```

```json
{
  "id": "8e89620c-be27-4537-a58e-85d811b784de",
  "order_id": "5b52b59e-d5c0-461b-84f6-1c4120a44a23",
  "assignment_id": "1360579b-38ec-4852-9803-6424a7d6238f",
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
  "arrived_at": "2026-10-27T20:33:03.374439Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114241"
  }
}
```

`POST /api/driver/v1/trips/8e89620c-be27-4537-a58e-85d811b784de/start` → **200**

```json
{
  "command_id": "a1636ffd-ce78-41a6-8dfa-11177e3dd394",
  "expected_version": 1
}
```

```json
{
  "id": "8e89620c-be27-4537-a58e-85d811b784de",
  "order_id": "5b52b59e-d5c0-461b-84f6-1c4120a44a23",
  "assignment_id": "1360579b-38ec-4852-9803-6424a7d6238f",
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
  "arrived_at": "2026-10-27T20:33:03.374439Z",
  "started_at": "2026-10-27T20:33:03.410042Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711114241"
  }
}
```

`POST /api/driver/v1/trips/8e89620c-be27-4537-a58e-85d811b784de/complete` → **200**

```json
{
  "command_id": "665e213f-c7bf-4b30-8ee5-173f7c1b80bd",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:33:03Z",
  "cash_received": true
}
```

```json
{
  "id": "8e89620c-be27-4537-a58e-85d811b784de",
  "order_id": "5b52b59e-d5c0-461b-84f6-1c4120a44a23",
  "assignment_id": "1360579b-38ec-4852-9803-6424a7d6238f",
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
  "arrived_at": "2026-10-27T20:33:03.374439Z",
  "started_at": "2026-10-27T20:33:03.410042Z",
  "completed_at": "2026-10-27T20:33:03.449673Z",
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
  "command_id": "f6e45f01-aa09-479c-aad5-39c1a4b349c8",
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
  "id": "7f2c81de-b779-4842-8368-c511c4ad8b74",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T20:38:03.488937Z",
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
  "command_id": "7326cac8-68d1-4f33-b4ec-037cdda1adfa",
  "quote_id": "7f2c81de-b779-4842-8368-c511c4ad8b74",
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
    "phone": "+380671115365"
  }
}
```

```json
{
  "id": "a594f483-1730-4183-a38d-93354546f094",
  "short_number": 13,
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
  "created_at": "2026-10-27T20:33:03.523276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115365"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a594f483-1730-4183-a38d-93354546f094` → **200**

```json
{
  "id": "a594f483-1730-4183-a38d-93354546f094",
  "short_number": 13,
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
  "created_at": "2026-10-27T20:33:03.523276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115365"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a594f483-1730-4183-a38d-93354546f094/cancel` → **200**

```json
{
  "command_id": "47111ff6-e4d8-47ac-8370-71a18721b627",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "a594f483-1730-4183-a38d-93354546f094",
  "short_number": 13,
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
  "created_at": "2026-10-27T20:33:03.523276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115365"
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
  "staff_id": "55bfc10e-71be-4097-822f-eab970f20c31",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T20:33:03.453699Z",
  "last_entries": [
    {
      "order_id": "a594f483-1730-4183-a38d-93354546f094",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T20:33:03.59087Z"
    },
    {
      "order_id": "5b52b59e-d5c0-461b-84f6-1c4120a44a23",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T20:33:03.453699Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ea7cc6b2-3451-4c28-af0a-c51056b1d6ae",
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
  "last_heartbeat_at": "2026-10-27T20:33:03.341399Z",
  "last_location_at": "2026-10-27T20:33:03.341399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea7cc6b2-3451-4c28-af0a-c51056b1d6ae/close` → **200**

```json
{
  "command_id": "8e9d6386-5b48-4fbd-9b12-9bd9f68be8f9",
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

Done: operator bonus for fulfilled 5b52b59e-d5c0-461b-84f6-1c4120a44a23 and operator-fault cancellation a594f483-1730-4183-a38d-93354546f094.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675408874",
  "device_ref": "sandbox-27064"
}
```

```json
{
  "challenge_id": "378313b3-47d0-4f77-beb8-1292e2c47e95",
  "expires_at": "2026-10-27T20:38:05.743165618Z",
  "resend_available_at": "2026-10-27T20:33:06.743165618Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675408874` → **200**

```json
{
  "phone": "+380675408874",
  "audience": "CLIENT",
  "code": "072667",
  "sent_at": "2026-10-27T20:33:05.745146487Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676510093",
  "device_ref": "sandbox-406",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c98aa955-c98b-4e8c-b809-93c32b4ff4d9",
  "expires_at": "2026-10-27T20:38:05.795602945Z",
  "resend_available_at": "2026-10-27T20:33:06.795602945Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676510093` → **200**

```json
{
  "phone": "+380676510093",
  "audience": "CLIENT",
  "code": "533847",
  "sent_at": "2026-10-27T20:33:05.797799035Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673620000",
  "device_ref": "sandbox-8106"
}
```

```json
{
  "challenge_id": "b57d0ffe-97af-4d43-baa5-bda3b2f8e347",
  "expires_at": "2026-10-27T20:38:05.846656551Z",
  "resend_available_at": "2026-10-27T20:33:06.846656551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673620000` → **200**

```json
{
  "phone": "+380673620000",
  "audience": "CLIENT",
  "code": "828712",
  "sent_at": "2026-10-27T20:33:05.848888221Z",
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
  "session_id": "6d3020fd-97c8-4bc8-829f-1fa8d7bc2b0e",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODYsImlhdCI6MTc5MzEzMzE4NiwianRpIjoiODRiMDg3MDAtMzMyMi00NGUzLTg5OWItMTE4MTYxYWY2ODNmIiwic2lkIjoiNmQzMDIwZmQtOTdjOC00YmM4LTgyOWYtMWZhOGQ3YmMyYjBlIn0.anfuVbLUAl_TUpNQcXxUgjwbXCpSyCq-KopU-WOlcAM",
  "access_expires_at": "2026-10-27T20:48:06.101678721Z",
  "refresh_token": "K_c1xvbkOMWBAwWJmZS99pCrAQQwVF8YbcWvTnjkrtk",
  "refresh_expires_at": "2026-10-28T08:33:06.101292185Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673620000` → **200**

```json
{
  "deliveries": [
    {
      "id": "dff05e14-1dd3-48eb-95ae-f7b2360518ad",
      "challenge_id": "b57d0ffe-97af-4d43-baa5-bda3b2f8e347",
      "phone": "+380673620000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bcfbeade-1ad3-4f8c-acab-3f7e3429a7a8",
      "error": null,
      "attempted_at": "2026-10-27T20:33:05.849091Z"
    },
    {
      "id": "57b6b5c2-cbbb-4bac-9752-18ec8f565e95",
      "challenge_id": "b57d0ffe-97af-4d43-baa5-bda3b2f8e347",
      "phone": "+380673620000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-27T20:33:05.8485Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673620000` → **200**

```json
{
  "phone": "+380673620000",
  "audience": "CLIENT",
  "code": "828712",
  "sent_at": "2026-10-27T20:33:05.848888221Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676510093` → **200**

```json
{
  "deliveries": [
    {
      "id": "3101a85c-bf81-42d6-b329-83996a51f5aa",
      "challenge_id": "c98aa955-c98b-4e8c-b809-93c32b4ff4d9",
      "phone": "+380676510093",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-88dfe284-a8a8-4fb9-8476-c8f13690fbe0",
      "error": null,
      "attempted_at": "2026-10-27T20:33:05.797994Z"
    }
  ]
}
```

Done: SMS to +380675408874, a call to +380676510093, SMS then a call to +380673620000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631351925",
  "device_ref": "sandbox-4961"
}
```

```json
{
  "challenge_id": "ff851bf5-d1ee-49f0-aa00-ec55ee80d817",
  "expires_at": "2026-10-27T20:38:06.22027147Z",
  "resend_available_at": "2026-10-27T20:33:07.22027147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631351925` → **200**

```json
{
  "phone": "+380631351925",
  "audience": "CLIENT",
  "code": "747692",
  "sent_at": "2026-10-27T20:33:06.222626957Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff851bf5-d1ee-49f0-aa00-ec55ee80d817",
  "code": "747692",
  "device_ref": "sandbox-4961"
}
```

```json
{
  "session_id": "ce485375-e274-4f6a-862b-38f26d61279d",
  "subject": {
    "type": "CLIENT",
    "id": "872e7a38-c415-4561-a4b0-3eab5fb490b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzJlN2EzOC1jNDE1LTQ1NjEtYTRiMC0zZWFiNWZiNDkwYjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDg2LCJpYXQiOjE3OTMxMzMxODYsImp0aSI6IjMzN2UyMjYxLWRlYTQtNGY5OS1iNDBiLTU0YTYyMGNiMDBjMCIsInNpZCI6ImNlNDg1Mzc1LWUyNzQtNGY2YS04NjJiLTM4ZjI2ZDYxMjc5ZCJ9.ZXuDkSDBiYgB4gDFDNWjBzK6qrsgIuCRD4xJ3Xwp-H8",
  "access_expires_at": "2026-10-27T20:48:06.27489306Z",
  "refresh_token": "hoWM9baCx3QofPDSnmSjWEuXhm8jgK0Jc-7pw55vk3U",
  "refresh_expires_at": "2026-11-26T20:33:06.274356427Z",
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
  "session_id": "34bf102d-146b-401c-aeb9-a4feb637a05a",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODYsImlhdCI6MTc5MzEzMzE4NiwianRpIjoiMWQ1YWRjZjYtODE5YS00YjQzLTgzOGItNmQwYTgwZDgwYWQ0Iiwic2lkIjoiMzRiZjEwMmQtMTQ2Yi00MDFjLWFlYjktYTRmZWI2MzdhMDVhIn0.IKa7wZx5iDZtCy6g6ngqec0lmh_eAEwGFwOyf4-NNUM",
  "access_expires_at": "2026-10-27T20:48:06.589640389Z",
  "refresh_token": "bhjypB-uRrcjPTbhFk49tvZ9vJMJCtK3mWfQ1ZysNns",
  "refresh_expires_at": "2026-10-28T08:33:06.589176235Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631351925` → **200**

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
  "correlation_id": "88f00587-0739-494f-ab2f-52f0e7a8db86"
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
  "session_id": "e274f136-7f10-4c29-8fcc-4e6cbf134b5e",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODYsImlhdCI6MTc5MzEzMzE4NiwianRpIjoiNjJmYTFhZDItNmRkNy00ZTRkLWIwYjMtMzUzNjNlZjU4NjJmIiwic2lkIjoiZTI3NGYxMzYtN2YxMC00YzI5LThmY2MtNGU2Y2JmMTM0YjVlIn0.6jNOwGdPJ3hTozIz_m3_cbQDqp-0o6MkbWGr9bjFZpI",
  "access_expires_at": "2026-10-27T20:48:06.883326682Z",
  "refresh_token": "pH4dok6XZhOiZjJGK6n5sI1CKBBNjCHOY0IjoMWMNKQ",
  "refresh_expires_at": "2026-10-28T08:33:06.882939145Z",
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
  "command_id": "4f78de60-80e0-4191-b670-58d77a770587",
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
  "changed_by": "55bfc10e-71be-4097-822f-eab970f20c31",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T20:33:06.946327486Z"
}
```

## The rider books the airport for 2026-10-27T23:33:06Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600897207",
  "device_ref": "sandbox-418"
}
```

```json
{
  "challenge_id": "15402142-2a33-48d0-a080-77b93afcec4a",
  "expires_at": "2026-10-27T20:38:06.973827903Z",
  "resend_available_at": "2026-10-27T20:33:07.973827903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600897207` → **200**

```json
{
  "phone": "+48600897207",
  "audience": "CLIENT",
  "code": "631616",
  "sent_at": "2026-10-27T20:33:06.975643468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15402142-2a33-48d0-a080-77b93afcec4a",
  "code": "631616",
  "device_ref": "sandbox-418"
}
```

```json
{
  "session_id": "58315a1d-8c7f-47f2-a273-5fc670b89e88",
  "subject": {
    "type": "CLIENT",
    "id": "1603dd0a-e214-4fd7-abce-7b0c77ac044c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjAzZGQwYS1lMjE0LTRmZDctYWJjZS03YjBjNzdhYzA0NGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDg3LCJpYXQiOjE3OTMxMzMxODcsImp0aSI6IjBkNjg0ODU3LTBjMTktNDM5My1iNmM2LTI4YjcxOWYzZjM4OSIsInNpZCI6IjU4MzE1YTFkLThjN2YtNDdmMi1hMjczLTVmYzY3MGI4OWU4OCJ9.tXvplIu8NevmfH7EoKU9SzCK1Z6JYcW5FG40ibC56fU",
  "access_expires_at": "2026-10-27T20:48:07.035848674Z",
  "refresh_token": "QJDRzjY5L3RoIxs2MRQkbKKzK57ETcgNO95TlB3S2xM",
  "refresh_expires_at": "2026-11-26T20:33:07.035290018Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "17308e50-a42c-44df-a260-afa5533f4fad",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T23:33:06Z"
}
```

```json
{
  "id": "fa7194ed-ac39-485c-ad2c-2a909436a95e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T20:38:07.066474Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T23:33:06Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "aa192f3b-84cd-4600-aa92-4fbee319153e",
  "quote_id": "fa7194ed-ac39-485c-ad2c-2a909436a95e",
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
  "pickup_at": "2026-10-27T23:33:06Z"
}
```

```json
{
  "id": "d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1603dd0a-e214-4fd7-abce-7b0c77ac044c",
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
  "created_at": "2026-10-27T20:33:07.099282Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T23:33:06Z",
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
  "device_ref": "sandbox-25458"
}
```

```json
{
  "challenge_id": "5971238f-cd3c-4fb7-bc17-de2de5a4f5e5",
  "expires_at": "2026-10-27T20:38:07.127027727Z",
  "resend_available_at": "2026-10-27T20:33:08.127027727Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "649121",
  "sent_at": "2026-10-27T20:33:07.12880962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5971238f-cd3c-4fb7-bc17-de2de5a4f5e5",
  "code": "649121",
  "device_ref": "sandbox-25458"
}
```

```json
{
  "session_id": "e93b1c5f-fc58-4b40-82e8-267584ba685c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA4NywiaWF0IjoxNzkzMTMzMTg3LCJqdGkiOiI4YjJlMGE4OC1mZTU5LTQ1ODgtODg2Yy01OTgxNDU0MTYxMDEiLCJzaWQiOiJlOTNiMWM1Zi1mYzU4LTRiNDAtODJlOC0yNjc1ODRiYTY4NWMifQ.CctuXw7qdYXuQaw_9vCE01yqFUaH077i93Hrqdu-LnY",
  "access_expires_at": "2026-10-27T20:48:07.176595588Z",
  "refresh_token": "1yxXoP8Hdtcd7jmc6j2i8IRIrYvdyHkxbhMECZmHk24",
  "refresh_expires_at": "2026-11-26T20:33:07.176134776Z",
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
  "command_id": "32fa5a88-9931-4580-b154-e484f43ac656",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:07Z",
    "sequence": 1793133187220
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7d4000c2-3b00-47ca-9fb8-15bb0f84720f",
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
  "last_heartbeat_at": "2026-10-27T20:33:07.235318Z",
  "last_location_at": "2026-10-27T20:33:07.235318Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb",
      "short_number": 14,
      "pickup_at": "2026-10-27T23:33:06Z",
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

`POST /api/driver/v1/preorders/d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb/reserve` → **200**

```json
{
  "command_id": "e9c192df-e2b0-4a02-85f0-8c461f8ded87"
}
```

```json
{
  "id": "099ca836-1e39-4269-aa44-907e16d6783c",
  "state": "RESERVED",
  "order": {
    "order_id": "d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb",
    "short_number": 14,
    "pickup_at": "2026-10-27T23:33:06Z",
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
  "reserved_at": "2026-10-27T20:33:07.29172Z",
  "confirm_from": "2026-10-27T23:03:06Z",
  "confirm_until": "2026-10-27T23:13:06Z",
  "drop_until": "2026-10-27T22:33:06Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "099ca836-1e39-4269-aa44-907e16d6783c",
      "state": "RESERVED",
      "order": {
        "order_id": "d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb",
        "short_number": 14,
        "pickup_at": "2026-10-27T23:33:06Z",
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
      "reserved_at": "2026-10-27T20:33:07.29172Z",
      "confirm_from": "2026-10-27T23:03:06Z",
      "confirm_until": "2026-10-27T23:13:06Z",
      "drop_until": "2026-10-27T22:33:06Z"
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
      "id": "099ca836-1e39-4269-aa44-907e16d6783c",
      "state": "RESERVED",
      "order": {
        "order_id": "d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb",
        "short_number": 14,
        "pickup_at": "2026-10-27T23:33:06Z",
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
      "reserved_at": "2026-10-27T20:33:07.29172Z",
      "confirm_from": "2026-10-27T23:03:06Z",
      "confirm_until": "2026-10-27T23:13:06Z",
      "drop_until": "2026-10-27T22:33:06Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/099ca836-1e39-4269-aa44-907e16d6783c/confirm` → **409**

```json
{
  "command_id": "215e1646-b594-496d-a441-249278d97b64"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/099ca836-1e39-4269-aa44-907e16d6783c/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3957585d-fe41-47e3-996b-675847a0d2e6"
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
  "session_id": "3fb34e46-6845-40f4-ba93-8916579309f6",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODcsImlhdCI6MTc5MzEzMzE4NywianRpIjoiYTAxYzRjNmMtNGE5ZS00ZDU3LWE0ZjAtYTIxZGZjNTE1NDc4Iiwic2lkIjoiM2ZiMzRlNDYtNjg0NS00MGY0LWJhOTMtODkxNjU3OTMwOWY2In0.Xld5x-bAzIk9ziTTImb65BIeMaB5cY2K3z9LjdhbWJY",
  "access_expires_at": "2026-10-27T20:48:07.604270151Z",
  "refresh_token": "skVHdJcpxgA3Fw25JT19s-LQch4IyKPNIvOo5o9QyII",
  "refresh_expires_at": "2026-10-28T08:33:07.603875964Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb` → **200**

```json
{
  "id": "d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1603dd0a-e214-4fd7-abce-7b0c77ac044c",
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
  "created_at": "2026-10-27T20:33:07.099282Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T23:33:06Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "099ca836-1e39-4269-aa44-907e16d6783c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T20:33:07.29172Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T20:33:07.100166Z",
      "actor": {
        "type": "CLIENT",
        "id": "1603dd0a-e214-4fd7-abce-7b0c77ac044c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb",
        "preorder": true,
        "quote_id": "fa7194ed-ac39-485c-ad2c-2a909436a95e",
        "pickup_at": "2026-10-27T23:33:06Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T20:33:07.292637Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "099ca836-1e39-4269-aa44-907e16d6783c"
      }
    }
  ]
}
```

Done: pre-order d5bfe7cb-e0f5-4857-bb4a-a83eb01a6cbb, reservation 099ca836-1e39-4269-aa44-907e16d6783c.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24373"
}
```

```json
{
  "challenge_id": "09bf7ec4-9fa6-4e73-916c-f3595c9e6a57",
  "expires_at": "2026-10-27T20:38:07.683935727Z",
  "resend_available_at": "2026-10-27T20:33:08.683935727Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "327270",
  "sent_at": "2026-10-27T20:33:07.686011131Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09bf7ec4-9fa6-4e73-916c-f3595c9e6a57",
  "code": "327270",
  "device_ref": "sandbox-24373"
}
```

```json
{
  "session_id": "4493220a-9526-412b-81cd-ef2bc982f3c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA4NywiaWF0IjoxNzkzMTMzMTg3LCJqdGkiOiI3NzU5MGM2ZS0xYzA3LTQ1N2EtOGMzYS03ZjlkMzIwOTQwMzEiLCJzaWQiOiI0NDkzMjIwYS05NTI2LTQxMmItODFjZC1lZjJiYzk4MmYzYzUifQ.ycxH1-o4cVBtqQ20jvaMfRzwPUJ-keWggiaMir41ovY",
  "access_expires_at": "2026-10-27T20:48:07.736734251Z",
  "refresh_token": "pA2uvXh5OT5ToQqQzj3jRVUqJDy54c2XLLwq9cnv3uA",
  "refresh_expires_at": "2026-11-26T20:33:07.73628413Z",
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
  "command_id": "91d05640-8adf-4d1d-ba9b-c6165fbd54e3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:07Z",
    "sequence": 1793133187781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2bd89df-ee31-44b9-a262-a45d42016130",
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
  "last_heartbeat_at": "2026-10-27T20:33:07.798545Z",
  "last_location_at": "2026-10-27T20:33:07.798545Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675469611",
  "device_ref": "sandbox-10796"
}
```

```json
{
  "challenge_id": "1e090c87-952f-4f0f-8c5d-4c66c6c94a00",
  "expires_at": "2026-10-27T20:38:07.824316934Z",
  "resend_available_at": "2026-10-27T20:33:08.824316934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675469611` → **200**

```json
{
  "phone": "+380675469611",
  "audience": "CLIENT",
  "code": "676270",
  "sent_at": "2026-10-27T20:33:07.826336212Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e090c87-952f-4f0f-8c5d-4c66c6c94a00",
  "code": "676270",
  "device_ref": "sandbox-10796"
}
```

```json
{
  "session_id": "e3d1cba4-c25f-4d74-b38a-2a311b7dd411",
  "subject": {
    "type": "CLIENT",
    "id": "bc322d33-7671-4295-a232-6ced762f3e2e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzMyMmQzMy03NjcxLTQyOTUtYTIzMi02Y2VkNzYyZjNlMmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDg3LCJpYXQiOjE3OTMxMzMxODcsImp0aSI6IjZhZmYwMjYwLTcwNTctNDViOC04ZGEzLWE4M2Q3MjQ2OGQyMSIsInNpZCI6ImUzZDFjYmE0LWMyNWYtNGQ3NC1iMzhhLTJhMzExYjdkZDQxMSJ9.GfWZJCXmag9QakEz4o8ni9Un9-S61TFQjuNsvsaHS6o",
  "access_expires_at": "2026-10-27T20:48:07.876563781Z",
  "refresh_token": "SC0HX9xTDa-Nj3TbRkUK4nR2sd2-76iq2Z6W4KsV5D4",
  "refresh_expires_at": "2026-11-26T20:33:07.876151242Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a73b3cd4-3fe9-4154-bb54-c7ed533eeb08",
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
  "id": "5ef316d8-4359-4565-bac0-7a6ccc0e4480",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T20:38:07.909337Z",
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
  "command_id": "38b1791c-8e8d-4a33-92aa-c8f32055d7ac",
  "quote_id": "5ef316d8-4359-4565-bac0-7a6ccc0e4480",
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
  "id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc322d33-7671-4295-a232-6ced762f3e2e",
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
  "created_at": "2026-10-27T20:33:07.942852Z",
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
    "id": "3ac0a150-4752-41a6-92a9-76e01ea784d2",
    "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
    "expires_at": "2026-10-27T20:33:22.945282Z",
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

`POST /api/driver/v1/offers/3ac0a150-4752-41a6-92a9-76e01ea784d2/accept` → **200**

```json
{
  "command_id": "9570218e-a3dd-4161-bb5a-1603a68852b1"
}
```

```json
{
  "id": "68cb9729-8c73-4f24-83af-53e7c823b9cb",
  "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d11c75e2-5fc8-4520-a6b0-54d6d4064064",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d11c75e2-5fc8-4520-a6b0-54d6d4064064",
  "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "assignment_id": "68cb9729-8c73-4f24-83af-53e7c823b9cb",
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

`POST /api/driver/v1/work-sessions/f2bd89df-ee31-44b9-a262-a45d42016130/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:08Z",
    "sequence": 1793133188413
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2bd89df-ee31-44b9-a262-a45d42016130",
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
  "last_heartbeat_at": "2026-10-27T20:33:08.057358Z",
  "last_location_at": "2026-10-27T20:33:08.057358Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d11c75e2-5fc8-4520-a6b0-54d6d4064064",
  "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "assignment_id": "68cb9729-8c73-4f24-83af-53e7c823b9cb",
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

`POST /api/driver/v1/trips/d11c75e2-5fc8-4520-a6b0-54d6d4064064/arrive` → **200**

```json
{
  "command_id": "b258c7e7-d872-46bc-b797-b98ec314cc06",
  "expected_version": 0
}
```

```json
{
  "id": "d11c75e2-5fc8-4520-a6b0-54d6d4064064",
  "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "assignment_id": "68cb9729-8c73-4f24-83af-53e7c823b9cb",
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
  "arrived_at": "2026-10-27T20:33:08.106156Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d11c75e2-5fc8-4520-a6b0-54d6d4064064/start` → **200**

```json
{
  "command_id": "37bd8e2f-cf22-4b8b-b322-6d2638185c21",
  "expected_version": 1
}
```

```json
{
  "id": "d11c75e2-5fc8-4520-a6b0-54d6d4064064",
  "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "assignment_id": "68cb9729-8c73-4f24-83af-53e7c823b9cb",
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
  "arrived_at": "2026-10-27T20:33:08.106156Z",
  "started_at": "2026-10-27T20:33:08.136254Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f2bd89df-ee31-44b9-a262-a45d42016130/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:08Z",
    "sequence": 1793133188414
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2bd89df-ee31-44b9-a262-a45d42016130",
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
  "last_heartbeat_at": "2026-10-27T20:33:08.173333Z",
  "last_location_at": "2026-10-27T20:33:08.173333Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d11c75e2-5fc8-4520-a6b0-54d6d4064064/complete` → **200**

```json
{
  "command_id": "0d2bdbc0-c2a8-453e-bd7e-d9b56548cb8b",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:33:08Z",
  "cash_received": true
}
```

```json
{
  "id": "d11c75e2-5fc8-4520-a6b0-54d6d4064064",
  "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "assignment_id": "68cb9729-8c73-4f24-83af-53e7c823b9cb",
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
  "arrived_at": "2026-10-27T20:33:08.106156Z",
  "started_at": "2026-10-27T20:33:08.136254Z",
  "completed_at": "2026-10-27T20:33:08.202482Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/c8661e28-0f3c-4709-a3de-304ce074a74a/rating` → **200**

```json
{
  "command_id": "3b94413d-feda-4a1e-98a0-44602171b750",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "score": 5,
  "created_at": "2026-10-27T20:33:08.247189709Z"
}
```

`POST /api/driver/v1/orders/c8661e28-0f3c-4709-a3de-304ce074a74a/rating` → **200**

```json
{
  "command_id": "e429cf25-b4e4-4558-b3ed-b4d535261d70",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
  "score": 4,
  "created_at": "2026-10-27T20:33:08.281341449Z"
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
  "session_id": "ff996495-6f44-428d-9610-9a223e486754",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODgsImlhdCI6MTc5MzEzMzE4OCwianRpIjoiOTcxMmU5MTEtZmU5NC00ZmJiLWJlYWUtNTJlMjFkNGJmZWI4Iiwic2lkIjoiZmY5OTY0OTUtNmY0NC00MjhkLTk2MTAtOWEyMjNlNDg2NzU0In0.lGCF8_fFCsfN8_Z2KdTDwP9LYgCRnj1cRaQBZMyabz4",
  "access_expires_at": "2026-10-27T20:48:08.557469462Z",
  "refresh_token": "lYUMb_aMLCdNRq1CGXFUbcT4wS5hAspdYf9I7iABrzU",
  "refresh_expires_at": "2026-10-28T08:33:08.556952437Z",
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
  "session_id": "cd0fb759-f8d1-4c8b-a47f-b973d1fc3a3d",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODgsImlhdCI6MTc5MzEzMzE4OCwianRpIjoiYzIxZWIwYmEtY2IyOS00MjM1LWEzZTEtMWFlY2JjMDFmOTk2Iiwic2lkIjoiY2QwZmI3NTktZjhkMS00YzhiLWE0N2YtYjk3M2QxZmMzYTNkIn0.Gc6vEEmFW1v9av8Rtamt2s24fxsgGC50pvCVpTiwCPQ",
  "access_expires_at": "2026-10-27T20:48:08.791279029Z",
  "refresh_token": "34eW20MuklpgNSF3jYWyCG1oWtc45Yl332E8CeaDio8",
  "refresh_expires_at": "2026-10-28T08:33:08.79090741Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c8661e28-0f3c-4709-a3de-304ce074a74a/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
      "author_type": "RIDER",
      "author_id": "bc322d33-7671-4295-a232-6ced762f3e2e",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T20:33:08.24719Z"
    },
    {
      "order_id": "c8661e28-0f3c-4709-a3de-304ce074a74a",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "bc322d33-7671-4295-a232-6ced762f3e2e",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T20:33:08.281341Z"
    }
  ]
}
```

Done: ratings for order c8661e28-0f3c-4709-a3de-304ce074a74a.

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
  "session_id": "7fc06243-21c2-4528-9adb-eba1b0c76007",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwODksImlhdCI6MTc5MzEzMzE4OSwianRpIjoiZDU3NzAzNDMtMTg0ZS00NzM4LTkzNjItZjFiMmY4NThiNTNmIiwic2lkIjoiN2ZjMDYyNDMtMjFjMi00NTI4LTlhZGItZWJhMWIwYzc2MDA3In0.w4HP82XMiaQwqiaCc5eB01yQOC1VMN8vpzHmUvXrgcU",
  "access_expires_at": "2026-10-27T20:48:09.062233791Z",
  "refresh_token": "uLf8YTqgonDXM7O24GAEWunsxH7CyXKN7gXb33cJSAg",
  "refresh_expires_at": "2026-10-28T08:33:09.061899997Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "90513b09-9600-4792-9d5e-d6d359869e22",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27"
}
```

```json
{
  "id": "227ad337-d3a0-4f79-b75a-539e7a401a2b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T20:33:09.098185Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/227ad337-d3a0-4f79-b75a-539e7a401a2b` → **200**

```json
{
  "id": "227ad337-d3a0-4f79-b75a-539e7a401a2b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T20:33:09.098185Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/227ad337-d3a0-4f79-b75a-539e7a401a2b` → **200**

```json
{
  "id": "227ad337-d3a0-4f79-b75a-539e7a401a2b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-27.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-27T20:33:09.098185Z",
  "ready_at": "2026-10-27T20:33:10.05547Z",
  "expires_at": "2026-10-28T20:33:10.05547Z"
}
```

`GET /api/admin/v1/reports/exports/227ad337-d3a0-4f79-b75a-539e7a401a2b/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-27,14,6,8,0,0,11,3,0,12,1,0,1,4,1,3
total,14,6,8,0,0,11,3,0,12,1,0,1,4,1,3
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "40734aa6-a952-4fc3-abed-e34c5cb65bf2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27"
}
```

```json
{
  "id": "ccd5fd18-6249-4f94-91bd-7d055fac764a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T20:33:10.2223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ccd5fd18-6249-4f94-91bd-7d055fac764a` → **200**

```json
{
  "id": "ccd5fd18-6249-4f94-91bd-7d055fac764a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T20:33:10.2223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ccd5fd18-6249-4f94-91bd-7d055fac764a` → **200**

```json
{
  "id": "ccd5fd18-6249-4f94-91bd-7d055fac764a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T20:33:10.2223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ccd5fd18-6249-4f94-91bd-7d055fac764a` → **200**

```json
{
  "id": "ccd5fd18-6249-4f94-91bd-7d055fac764a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T20:33:10.2223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ccd5fd18-6249-4f94-91bd-7d055fac764a` → **200**

```json
{
  "id": "ccd5fd18-6249-4f94-91bd-7d055fac764a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T20:33:10.2223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ccd5fd18-6249-4f94-91bd-7d055fac764a` → **200**

```json
{
  "id": "ccd5fd18-6249-4f94-91bd-7d055fac764a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-27T20:33:10.2223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ccd5fd18-6249-4f94-91bd-7d055fac764a` → **200**

```json
{
  "id": "ccd5fd18-6249-4f94-91bd-7d055fac764a",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-27",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-27.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-27T20:33:10.2223Z",
  "ready_at": "2026-10-27T20:33:15.062041Z",
  "expires_at": "2026-10-28T20:33:15.062041Z"
}
```

`GET /api/admin/v1/reports/exports/ccd5fd18-6249-4f94-91bd-7d055fac764a/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-27,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9156a91f-70ed-4641-99fa-41a99a791140` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9156a91f-70ed-4641-99fa-41a99a791140",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ddc66a31-df25-4b2d-91a1-8b7307d2048a"
}
```

Done: both reports were built in the background and downloaded.

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
  "session_id": "81eea76a-a42e-447a-8d2d-eb472b6b3ea5",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwOTUsImlhdCI6MTc5MzEzMzE5NSwianRpIjoiZjdmMzRmNjAtMjEzOC00NGViLWIxNGEtM2M5M2QwNzg4MWYyIiwic2lkIjoiODFlZWE3NmEtYTQyZS00NDdhLThkMmQtZWI0NzJiNmIzZWE1In0.7tV6lLIbQ2BJrcxuuIb-EdIML-s64vsLbt_B6MmuIrs",
  "access_expires_at": "2026-10-27T20:48:15.651901827Z",
  "refresh_token": "u-nsBRLdc1PRCB4qgubM2OW-ZeQqOkmo-iDWUxA9Cv8",
  "refresh_expires_at": "2026-10-28T08:33:15.651554963Z",
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
  "command_id": "322bc10b-068f-433b-90ed-6bfb9af79a0d",
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
  "changed_by": "55bfc10e-71be-4097-822f-eab970f20c31",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T20:33:15.712064Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "322bc10b-068f-433b-90ed-6bfb9af79a0d",
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
  "changed_by": "55bfc10e-71be-4097-822f-eab970f20c31",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T20:33:15.712064Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48056227919",
  "device_ref": "sandbox-19777"
}
```

```json
{
  "challenge_id": "53990ed5-d859-412c-bed5-5f76e35fcf44",
  "expires_at": "2026-10-27T20:38:15.791293493Z",
  "resend_available_at": "2026-10-27T20:33:16.791293493Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48056227919` → **200**

```json
{
  "phone": "+48056227919",
  "audience": "CLIENT",
  "code": "867348",
  "sent_at": "2026-10-27T20:33:15.793210606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53990ed5-d859-412c-bed5-5f76e35fcf44",
  "code": "867348",
  "device_ref": "sandbox-19777"
}
```

```json
{
  "session_id": "9b5b94db-daf2-46fb-ba6d-85cfec936d9f",
  "subject": {
    "type": "CLIENT",
    "id": "c3ba8df2-204a-4807-aaed-d76a1d08c860"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjM2JhOGRmMi0yMDRhLTQ4MDctYWFlZC1kNzZhMWQwOGM4NjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDk1LCJpYXQiOjE3OTMxMzMxOTUsImp0aSI6ImM2ZTA5ZWIwLTg1ZmMtNDkxNi04MTE5LWM2N2JkYzBjZGU0MCIsInNpZCI6IjliNWI5NGRiLWRhZjItNDZmYi1iYTZkLTg1Y2ZlYzkzNmQ5ZiJ9.5BSb8SPzP_OQAHVUbfSn8jo0FmTrtV-B9IKQf1NtVJ4",
  "access_expires_at": "2026-10-27T20:48:15.839611146Z",
  "refresh_token": "pXf-vQT8T2H9POVfbAnRir-Cyrjc_pMCa_QBlKhATlY",
  "refresh_expires_at": "2026-11-26T20:33:15.839227547Z",
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
  "correlation_id": "385f03bd-f91c-4795-a9c2-80491036a3b5"
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
  "device_ref": "sandbox-32126"
}
```

```json
{
  "challenge_id": "a137713b-e52d-4e92-b59f-d3cc3dfdb687",
  "expires_at": "2026-10-27T20:38:15.909714438Z",
  "resend_available_at": "2026-10-27T20:33:16.909714438Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "114582",
  "sent_at": "2026-10-27T20:33:15.91612582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a137713b-e52d-4e92-b59f-d3cc3dfdb687",
  "code": "114582",
  "device_ref": "sandbox-32126"
}
```

```json
{
  "session_id": "a851eff2-485b-44ea-bc19-6ea74caf1bbf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA5NSwiaWF0IjoxNzkzMTMzMTk1LCJqdGkiOiJmNDQyNzU1YS00ODExLTRhNDktOGM2ZC01YTQwMzVlMjdhNzYiLCJzaWQiOiJhODUxZWZmMi00ODViLTQ0ZWEtYmMxOS02ZWE3NGNhZjFiYmYifQ.P7Slxf6-l0w8q6adAJ_fFQjMmG9Zfhvm6OcrP8MBzyE",
  "access_expires_at": "2026-10-27T20:48:15.970109219Z",
  "refresh_token": "NuyBY0qilJaaysI19cok5mdX2ymlsEtlUTt6YnKGN94",
  "refresh_expires_at": "2026-11-26T20:33:15.969770317Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7d4000c2-3b00-47ca-9fb8-15bb0f84720f",
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
  "last_heartbeat_at": "2026-10-27T20:33:07.235318Z",
  "last_location_at": "2026-10-27T20:33:07.235318Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d4000c2-3b00-47ca-9fb8-15bb0f84720f/handover` → **200**

```json
{
  "command_id": "21db7474-95b4-44f6-8928-a1519f478ec4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7d4000c2-3b00-47ca-9fb8-15bb0f84720f",
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
  "last_heartbeat_at": "2026-10-27T20:33:07.235318Z",
  "last_location_at": "2026-10-27T20:33:07.235318Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d4000c2-3b00-47ca-9fb8-15bb0f84720f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:16Z",
    "sequence": 1793133196402
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "7d4000c2-3b00-47ca-9fb8-15bb0f84720f",
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
  "last_heartbeat_at": "2026-10-27T20:33:16.056599Z",
  "last_location_at": "2026-10-27T20:33:16.056599Z",
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
  "session_id": "7d4000c2-3b00-47ca-9fb8-15bb0f84720f",
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
  "last_heartbeat_at": "2026-10-27T20:33:16.056599Z",
  "last_location_at": "2026-10-27T20:33:16.056599Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7d4000c2-3b00-47ca-9fb8-15bb0f84720f/close` → **200**

```json
{
  "command_id": "36b19ed9-f620-45a5-a8f3-427c07a3a30e",
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
  "correlation_id": "88eda8f1-2fc7-4b35-b6dc-3c1eefcbb559"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671190408",
  "device_ref": "sandbox-29194"
}
```

```json
{
  "challenge_id": "b6d08066-1080-4b2b-b0f4-57e759ab5617",
  "expires_at": "2026-10-27T20:38:16.204984122Z",
  "resend_available_at": "2026-10-27T20:33:17.204984122Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671190408` → **200**

```json
{
  "phone": "+380671190408",
  "audience": "CLIENT",
  "code": "623073",
  "sent_at": "2026-10-27T20:33:16.206758845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6d08066-1080-4b2b-b0f4-57e759ab5617",
  "code": "623073",
  "device_ref": "sandbox-29194"
}
```

```json
{
  "session_id": "256074c7-f3de-4134-b2eb-906ab23324cd",
  "subject": {
    "type": "CLIENT",
    "id": "572a2e70-bb27-429d-972c-1aa67836b18e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NzJhMmU3MC1iYjI3LTQyOWQtOTcyYy0xYWE2NzgzNmIxOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTM0MDk2LCJpYXQiOjE3OTMxMzMxOTYsImp0aSI6IjQ3N2VjMjAxLTdmOGMtNGVlYy1iZjFjLWUwNjVkZWUzMWY0NCIsInNpZCI6IjI1NjA3NGM3LWYzZGUtNDEzNC1iMmViLTkwNmFiMjMzMjRjZCJ9.UKQ9Ac28x6dimGeK4QT6UtUlWoqzEXSaqNcxK3yyE_4",
  "access_expires_at": "2026-10-27T20:48:16.258121689Z",
  "refresh_token": "xVLun5y4mf-B0BRwQ_PkNmrOmns7jLc3wONDighWyig",
  "refresh_expires_at": "2026-11-26T20:33:16.257627474Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "6afb9df5-7b89-45f1-85b8-99b3e13c199a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd",
  "upload_path": "/api/rider/v1/uploads/c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd",
  "expires_at": "2026-10-27T20:48:16.293015573Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd` → **200**

```json
{
  "file_id": "c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "98bf16f0-b458-4bec-bb9e-4b20324d6f9c",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd"
  ]
}
```

```json
{
  "id": "9c64bfdd-c055-44d5-a3c0-d9c480c146cf",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "572a2e70-bb27-429d-972c-1aa67836b18e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T20:33:16.363003Z",
  "updated_at": "2026-10-27T20:33:16.363003Z",
  "messages": [
    {
      "id": "4ac655a4-8400-4d03-b68f-065b615872b7",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "572a2e70-bb27-429d-972c-1aa67836b18e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T20:33:16.364275Z",
      "attachments": [
        {
          "file_id": "c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd",
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
  "session_id": "b71661fa-c939-44c0-a11d-a92c746b0a77",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwOTYsImlhdCI6MTc5MzEzMzE5NiwianRpIjoiYmQ4NjViOGUtMWFlYi00OWRmLWE5OTYtZDk1ZTk4NWM0OGFlIiwic2lkIjoiYjcxNjYxZmEtYzkzOS00NGMwLWExMWQtYTkyYzc0NmIwYTc3In0.-qK4JbfB5s3z6jVzznNcPxXltBoD1SFhmDQ89WAJ2EE",
  "access_expires_at": "2026-10-27T20:48:16.610335581Z",
  "refresh_token": "c8HYGXu06RZpP_PaPqkm_LkvqtrLfVLBMzCxjZITepI",
  "refresh_expires_at": "2026-10-28T08:33:16.609995352Z",
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
  "session_id": "ad507cda-04ae-4025-9240-8589a2209705",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwOTYsImlhdCI6MTc5MzEzMzE5NiwianRpIjoiMDhjMTEzYjMtOTdjNy00ZGY0LWIzNzctMDI0NTgyNTY4YTQ5Iiwic2lkIjoiYWQ1MDdjZGEtMDRhZS00MDI1LTkyNDAtODU4OWEyMjA5NzA1In0.WLx4HGYsQuZP4bJ6iqv9mobVtoSI_rnItvU9iQzP1fU",
  "access_expires_at": "2026-10-27T20:48:16.858763877Z",
  "refresh_token": "QWd3iHnkGrrZkZ0J76NtInm-TQ1AKAyiDiqfJRxoXeg",
  "refresh_expires_at": "2026-10-28T08:33:16.858342476Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/9c64bfdd-c055-44d5-a3c0-d9c480c146cf/attachments/c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "47cb3e56-9cdb-4548-ad94-2f83c6417b77",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "ad39479e-004e-4acc-9005-165e5ad62e9a",
  "upload_path": "/api/operator/v1/uploads/ad39479e-004e-4acc-9005-165e5ad62e9a",
  "expires_at": "2026-10-27T20:48:16.903418201Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/ad39479e-004e-4acc-9005-165e5ad62e9a` → **200**

```json
{
  "file_id": "ad39479e-004e-4acc-9005-165e5ad62e9a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/9c64bfdd-c055-44d5-a3c0-d9c480c146cf` → **200**

```json
{
  "id": "9c64bfdd-c055-44d5-a3c0-d9c480c146cf",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "572a2e70-bb27-429d-972c-1aa67836b18e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T20:33:16.363003Z",
  "updated_at": "2026-10-27T20:33:16.363003Z",
  "messages": [
    {
      "id": "4ac655a4-8400-4d03-b68f-065b615872b7",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "572a2e70-bb27-429d-972c-1aa67836b18e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T20:33:16.364275Z",
      "attachments": [
        {
          "file_id": "c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/9c64bfdd-c055-44d5-a3c0-d9c480c146cf/comments` → **200**

```json
{
  "command_id": "a66b6236-4a89-4a91-9ee0-61098ca186e8",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "ad39479e-004e-4acc-9005-165e5ad62e9a"
  ]
}
```

```json
{
  "id": "9c64bfdd-c055-44d5-a3c0-d9c480c146cf",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "572a2e70-bb27-429d-972c-1aa67836b18e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T20:33:16.363003Z",
  "updated_at": "2026-10-27T20:33:16.990662Z",
  "messages": [
    {
      "id": "4ac655a4-8400-4d03-b68f-065b615872b7",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "572a2e70-bb27-429d-972c-1aa67836b18e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T20:33:16.364275Z",
      "attachments": [
        {
          "file_id": "c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "078b95a0-2e41-43c3-818b-5d2e66a9e405",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "55bfc10e-71be-4097-822f-eab970f20c31",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T20:33:16.990294Z",
      "attachments": [
        {
          "file_id": "ad39479e-004e-4acc-9005-165e5ad62e9a",
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

`GET /api/rider/v1/support/cases/9c64bfdd-c055-44d5-a3c0-d9c480c146cf` → **200**

```json
{
  "id": "9c64bfdd-c055-44d5-a3c0-d9c480c146cf",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "572a2e70-bb27-429d-972c-1aa67836b18e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T20:33:16.363003Z",
  "updated_at": "2026-10-27T20:33:16.990662Z",
  "messages": [
    {
      "id": "4ac655a4-8400-4d03-b68f-065b615872b7",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "572a2e70-bb27-429d-972c-1aa67836b18e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T20:33:16.364275Z",
      "attachments": [
        {
          "file_id": "c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "078b95a0-2e41-43c3-818b-5d2e66a9e405",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T20:33:16.990294Z",
      "attachments": [
        {
          "file_id": "ad39479e-004e-4acc-9005-165e5ad62e9a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/9c64bfdd-c055-44d5-a3c0-d9c480c146cf/attachments/ad39479e-004e-4acc-9005-165e5ad62e9a` → **200**

Done: support case 9c64bfdd-c055-44d5-a3c0-d9c480c146cf, rider attachment c5635d2f-2dca-4ba7-ad14-c4fa4fb62afd, operator attachment ad39479e-004e-4acc-9005-165e5ad62e9a.

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
  "session_id": "69b9f648-c223-4a3c-9a64-3f6f742f60bb",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwOTcsImlhdCI6MTc5MzEzMzE5NywianRpIjoiNDNmYmM5ZTgtNDllOC00NDA5LWFkYWQtNDEzYjg0NGUxYzMyIiwic2lkIjoiNjliOWY2NDgtYzIyMy00YTNjLTlhNjQtM2Y2Zjc0MmY2MGJiIn0.arNFmQSKqwPtG9m5hiRZlpvB3DzW3aITtZyjj31oIU4",
  "access_expires_at": "2026-10-27T20:48:17.272600716Z",
  "refresh_token": "Yl6MrxWKXClwJZsj3rBn8UUMMfK9fICI_SOeawcr2SI",
  "refresh_expires_at": "2026-10-28T08:33:17.272230031Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5446"
}
```

```json
{
  "challenge_id": "be320e7d-c234-4795-a296-25c5292fbc25",
  "expires_at": "2026-10-27T20:38:17.295125048Z",
  "resend_available_at": "2026-10-27T20:33:18.295125048Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "140637",
  "sent_at": "2026-10-27T20:33:17.29700174Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be320e7d-c234-4795-a296-25c5292fbc25",
  "code": "140637",
  "device_ref": "sandbox-5446"
}
```

```json
{
  "session_id": "09301ef3-5b80-4a08-84c1-56abfc92bb7c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA5NywiaWF0IjoxNzkzMTMzMTk3LCJqdGkiOiIxZDkxMTEwYi1mZWUwLTQ4YzItODMxOC0zMzFiNmMyM2MzOWYiLCJzaWQiOiIwOTMwMWVmMy01YjgwLTRhMDgtODRjMS01NmFiZmM5MmJiN2MifQ.PSxoxvYAmN39uqOL_2Khzsx6q8_f1ZxPLwPEFnWewdw",
  "access_expires_at": "2026-10-27T20:48:17.34267596Z",
  "refresh_token": "7s9CpYSZSarN63ItdIfj5NhA_3J4UI6Fj3Zkgk5oyac",
  "refresh_expires_at": "2026-11-26T20:33:17.342297614Z",
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
  "command_id": "388fe59c-b143-4081-af2b-dfb83de47312",
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
  "device_ref": "sandbox-23503"
}
```

```json
{
  "challenge_id": "7bd61d86-c242-4096-a5e4-09835e11bc73",
  "expires_at": "2026-10-27T20:38:17.457574247Z",
  "resend_available_at": "2026-10-27T20:33:18.457574247Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "000471",
  "sent_at": "2026-10-27T20:33:17.459296259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bd61d86-c242-4096-a5e4-09835e11bc73",
  "code": "000471",
  "device_ref": "sandbox-23503"
}
```

```json
{
  "session_id": "2c060e70-947a-403c-bbc4-d47dce60a5bc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzNDA5NywiaWF0IjoxNzkzMTMzMTk3LCJqdGkiOiJlOWM4NGUwMC03ZTY0LTQ2NTAtYTFjOS03Zjg5ZDZhYTFkZTYiLCJzaWQiOiIyYzA2MGU3MC05NDdhLTQwM2MtYmJjNC1kNDdkY2U2MGE1YmMifQ.dpqVv31o1yM8cZbj1lozMCaKfVAuibBqiLgcwgUD89Q",
  "access_expires_at": "2026-10-27T20:48:17.515776312Z",
  "refresh_token": "704-2zQuTwq84QQFVoPqg5_H9ZfRJbxa6Edh-vxhc3Y",
  "refresh_expires_at": "2026-11-26T20:33:17.514813351Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2bd89df-ee31-44b9-a262-a45d42016130",
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
  "last_heartbeat_at": "2026-10-27T20:33:08.173333Z",
  "last_location_at": "2026-10-27T20:33:08.173333Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2bd89df-ee31-44b9-a262-a45d42016130/handover` → **200**

```json
{
  "command_id": "3e2d0796-42d3-4149-a455-cfbfd6e9f551",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2bd89df-ee31-44b9-a262-a45d42016130",
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
  "last_heartbeat_at": "2026-10-27T20:33:08.173333Z",
  "last_location_at": "2026-10-27T20:33:08.173333Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2bd89df-ee31-44b9-a262-a45d42016130/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:17Z",
    "sequence": 1793133197591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f2bd89df-ee31-44b9-a262-a45d42016130",
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
  "last_heartbeat_at": "2026-10-27T20:33:17.608623Z",
  "last_location_at": "2026-10-27T20:33:17.608623Z",
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
  "command_id": "68a09449-ea4f-449b-a554-31c0981b8e39",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:17Z",
    "sequence": 1793133197653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "958c4a05-9019-4bf6-91bc-ee546cca82a2",
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
  "last_heartbeat_at": "2026-10-27T20:33:17.669545Z",
  "last_location_at": "2026-10-27T20:33:17.669545Z",
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
  "session_id": "75456c75-3aa9-4369-a939-725e527c97db",
  "subject": {
    "type": "STAFF",
    "id": "55bfc10e-71be-4097-822f-eab970f20c31"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWJmYzEwZS03MWJlLTQwOTctODIyZi1lYWI5NzBmMjBjMzEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzQwOTcsImlhdCI6MTc5MzEzMzE5NywianRpIjoiZGI5NWRhMzYtNjA0ZC00MzMyLTlkZTktMjU3MTYwMmU1N2IxIiwic2lkIjoiNzU0NTZjNzUtM2FhOS00MzY5LWE5MzktNzI1ZTUyN2M5N2RiIn0.8BPT5-T9bTf6MJMQBSlRzDSB0emd4qopFAjqU9JUa7E",
  "access_expires_at": "2026-10-27T20:48:17.904833224Z",
  "refresh_token": "0X3DC82qFiUDn3GZTtciVW9kuBFUNeRDOm4Lmaz5fbE",
  "refresh_expires_at": "2026-10-28T08:33:17.904486595Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e04e8c37-9cb6-494a-ae70-9092d7d5e465",
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
  "id": "2e4c1c62-a38d-4c9b-9e0d-283e95ad40ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T20:38:17.931531Z",
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
  "command_id": "2bb96ccf-7e64-4557-9847-4fb4f3079f01",
  "quote_id": "2e4c1c62-a38d-4c9b-9e0d-283e95ad40ed",
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
  "id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
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
  "created_at": "2026-10-27T20:33:17.96353Z",
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
    "id": "44785ba6-4a03-4ddc-8983-2ee6ce67707f",
    "order_id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
    "expires_at": "2026-10-27T20:33:32.965974Z",
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

`POST /api/driver/v1/offers/44785ba6-4a03-4ddc-8983-2ee6ce67707f/accept` → **200**

```json
{
  "command_id": "e1867a54-9e23-4b0d-863f-062f28c498f6"
}
```

```json
{
  "id": "ca1851ba-906e-4010-bd4c-c21138710bb2",
  "order_id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b63ab7b-643c-4f33-ad01-a3f18428c077",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b63ab7b-643c-4f33-ad01-a3f18428c077",
  "order_id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
  "assignment_id": "ca1851ba-906e-4010-bd4c-c21138710bb2",
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

`POST /api/driver/v1/work-sessions/958c4a05-9019-4bf6-91bc-ee546cca82a2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T20:33:18Z",
    "sequence": 1793133198872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "958c4a05-9019-4bf6-91bc-ee546cca82a2",
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
  "last_heartbeat_at": "2026-10-27T20:33:18.104205Z",
  "last_location_at": "2026-10-27T20:33:18.104205Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3b63ab7b-643c-4f33-ad01-a3f18428c077/arrive` → **200**

```json
{
  "command_id": "f14742bc-c06c-4bc5-b470-46afcf947dda",
  "expected_version": 0
}
```

```json
{
  "id": "3b63ab7b-643c-4f33-ad01-a3f18428c077",
  "order_id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
  "assignment_id": "ca1851ba-906e-4010-bd4c-c21138710bb2",
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
  "arrived_at": "2026-10-27T20:33:18.138967Z",
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

`POST /api/driver/v1/trips/3b63ab7b-643c-4f33-ad01-a3f18428c077/start` → **200**

```json
{
  "command_id": "f9a63a15-8d30-49e7-a72e-d48334e3a494",
  "expected_version": 1
}
```

```json
{
  "id": "3b63ab7b-643c-4f33-ad01-a3f18428c077",
  "order_id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
  "assignment_id": "ca1851ba-906e-4010-bd4c-c21138710bb2",
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
  "arrived_at": "2026-10-27T20:33:18.138967Z",
  "started_at": "2026-10-27T20:33:18.174531Z",
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

`POST /api/driver/v1/trips/3b63ab7b-643c-4f33-ad01-a3f18428c077/complete` → **200**

```json
{
  "command_id": "d92e4018-18e1-45fb-b55f-10acaaa7888b",
  "expected_version": 2,
  "reported_at": "2026-10-27T20:33:18Z",
  "cash_received": true
}
```

```json
{
  "id": "3b63ab7b-643c-4f33-ad01-a3f18428c077",
  "order_id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
  "assignment_id": "ca1851ba-906e-4010-bd4c-c21138710bb2",
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
  "arrived_at": "2026-10-27T20:33:18.138967Z",
  "started_at": "2026-10-27T20:33:18.174531Z",
  "completed_at": "2026-10-27T20:33:18.214Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/38324db5-907b-4f6b-8dc8-c55a6944a4a5` → **200**

```json
{
  "id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
  "short_number": 16,
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
    "id": "ca1851ba-906e-4010-bd4c-c21138710bb2",
    "order_id": "38324db5-907b-4f6b-8dc8-c55a6944a4a5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b63ab7b-643c-4f33-ad01-a3f18428c077",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T20:33:17.96353Z",
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
  "session_id": "f2bd89df-ee31-44b9-a262-a45d42016130",
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
  "last_heartbeat_at": "2026-10-27T20:33:17.608623Z",
  "last_location_at": "2026-10-27T20:33:17.608623Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2bd89df-ee31-44b9-a262-a45d42016130/close` → **200**

```json
{
  "command_id": "566ec745-0eed-419d-ae13-8d5b65e25587",
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
  "session_id": "958c4a05-9019-4bf6-91bc-ee546cca82a2",
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
  "last_heartbeat_at": "2026-10-27T20:33:18.104205Z",
  "last_location_at": "2026-10-27T20:33:18.104205Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/958c4a05-9019-4bf6-91bc-ee546cca82a2/close` → **200**

```json
{
  "command_id": "11ec4185-d3cf-421b-912e-d475e0ed21c6",
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

Done: terminal order 38324db5-907b-4f6b-8dc8-c55a6944a4a5 by Andrii (5a000000-0000-4000-8000-000000000403).
