# Sandbox transcript (2026-10-27T19:42:48Z, 47c64d6)

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
  "correlation_id": "7f7f8da7-2fc7-476c-9b60-536ffa9e891a"
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
  "session_id": "2ac9eaa4-a314-4fc8-a498-90ec04a260c4",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwNjgsImlhdCI6MTc5MzEzMDE2OCwianRpIjoiOTI4NDRhY2QtZWUxOS00NWJhLWE3NTgtODU1Njc5ODA3ODViIiwic2lkIjoiMmFjOWVhYTQtYTMxNC00ZmM4LWE0OTgtOTBlYzA0YTI2MGM0In0.ZrYRymzNCWZTSigoZsdjK61MdVjiV7bNLq9kja6paeQ",
  "access_expires_at": "2026-10-27T19:57:48.89310093Z",
  "refresh_token": "v0qXJ1Na9zSNrYHqyP72o8Af5ilwKjRR0whhKodOnFA",
  "refresh_expires_at": "2026-10-28T07:42:48.891414294Z",
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
  "session_id": "bdf5a897-bf9f-47f4-86b9-47514caeb9cb",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwNjksImlhdCI6MTc5MzEzMDE2OSwianRpIjoiMzE4MWFjN2YtYTRlMy00MzM2LTg0MWEtNGU1MTU2MDE5NTMzIiwic2lkIjoiYmRmNWE4OTctYmY5Zi00N2Y0LTg2YjktNDc1MTRjYWViOWNiIn0.0LXqemBm9pYInjwGynyfAlfKNBSbv0ztKpqnyx8CVB0",
  "access_expires_at": "2026-10-27T19:57:49.922868655Z",
  "refresh_token": "USiLH68I6L-pQwQ1ml4nVZwRe221YDFsSPhI7EyXNU8",
  "refresh_expires_at": "2026-10-28T07:42:49.921876127Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "7467b7bd-304b-4f49-bc18-78d99fbc9afd",
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
  "id": "e458804a-b6a2-4f45-a9e6-e3f359025a3b",
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
  "created_by": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
  "created_at": "2026-10-27T19:42:50.004866Z",
  "updated_at": "2026-10-27T19:42:50.004866Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631864416",
  "device_ref": "sandbox-7213"
}
```

```json
{
  "challenge_id": "3b8f456e-9486-4cc0-8e8e-192a230aef8f",
  "expires_at": "2026-10-27T19:47:50.123703983Z",
  "resend_available_at": "2026-10-27T19:42:51.123703983Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631864416` → **200**

```json
{
  "phone": "+380631864416",
  "audience": "CLIENT",
  "code": "690099",
  "sent_at": "2026-10-27T19:42:50.172326894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b8f456e-9486-4cc0-8e8e-192a230aef8f",
  "code": "690099",
  "device_ref": "sandbox-7213"
}
```

```json
{
  "session_id": "4c6bfe18-858a-42fc-9485-0933ccf8d668",
  "subject": {
    "type": "CLIENT",
    "id": "6003a624-7d0f-4562-b7ea-c736989054a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDAzYTYyNC03ZDBmLTQ1NjItYjdlYS1jNzM2OTg5MDU0YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMDcwLCJpYXQiOjE3OTMxMzAxNzAsImp0aSI6ImIwMjkzYjM5LTM4YWYtNDM4Mi05YWY0LTMyOTlhYmViNjg3NiIsInNpZCI6IjRjNmJmZTE4LTg1OGEtNDJmYy05NDg1LTA5MzNjY2Y4ZDY2OCJ9.Ukkux0hDV4a09cyzI5lIjSm6nO2uVGXESN3VnZKEXY8",
  "access_expires_at": "2026-10-27T19:57:50.301827251Z",
  "refresh_token": "kXc4utpPWplErB40yGLtcseBwqTZNghsP7JJvVvnM6o",
  "refresh_expires_at": "2026-11-26T19:42:50.300860948Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631864416` → **200**

```json
{
  "client_id": "6003a624-7d0f-4562-b7ea-c736989054a7"
}
```

`POST /api/admin/v1/rider-wallets/6003a624-7d0f-4562-b7ea-c736989054a7/top-ups` → **201**

```json
{
  "command_id": "871c04af-a5c1-44cd-8efc-23daf385d39c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "6003a624-7d0f-4562-b7ea-c736989054a7",
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
      "id": "7f08c891-eb0f-460f-ae6c-b2e821acc755",
      "at": "2026-10-27T19:42:50.391058Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c6c74209-01de-4b2c-8d61-02f31bf0d6a6",
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
  "id": "069c3dd4-309d-44eb-98ab-312f1ea5e4c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:47:50.641386Z",
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
      "id": "e458804a-b6a2-4f45-a9e6-e3f359025a3b",
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
  "device_ref": "sandbox-10323"
}
```

```json
{
  "challenge_id": "9bd8a3fe-2a5f-46dc-a9b8-b14055a65284",
  "expires_at": "2026-10-27T19:47:50.691301159Z",
  "resend_available_at": "2026-10-27T19:42:51.691301159Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "112593",
  "sent_at": "2026-10-27T19:42:50.694249504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9bd8a3fe-2a5f-46dc-a9b8-b14055a65284",
  "code": "112593",
  "device_ref": "sandbox-10323"
}
```

```json
{
  "session_id": "5f74ada9-e4a0-4694-9fbe-9a61df72813f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTA3MCwiaWF0IjoxNzkzMTMwMTcwLCJqdGkiOiIxYWU0OTBhMC1hNTFlLTRkNjgtYTJhZi0zYTEwYzIzODI4MjAiLCJzaWQiOiI1Zjc0YWRhOS1lNGEwLTQ2OTQtOWZiZS05YTYxZGY3MjgxM2YifQ.U2bCEYD_YXyo3OPN-rvq85RRCuRfwqOiEET5wrvbp40",
  "access_expires_at": "2026-10-27T19:57:50.743472896Z",
  "refresh_token": "Zqxuje9bP8929WDDJuemLys-qUuMxsSFSII142z-fmY",
  "refresh_expires_at": "2026-11-26T19:42:50.742633675Z",
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
  "command_id": "0765cd5c-c9b1-4f23-b80e-3e54d15d1d9d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:42:50Z",
    "sequence": 1793130170794
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77788cd4-87eb-4f55-812e-e2395d5806df",
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
  "last_heartbeat_at": "2026-10-27T19:42:50.838046Z",
  "last_location_at": "2026-10-27T19:42:50.838046Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "54973f2c-408a-4ea8-bada-6256e8cc8e2c",
  "quote_id": "069c3dd4-309d-44eb-98ab-312f1ea5e4c4",
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
  "id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6003a624-7d0f-4562-b7ea-c736989054a7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:42:50.917247Z",
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
  "client_id": "6003a624-7d0f-4562-b7ea-c736989054a7",
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
      "id": "7f08c891-eb0f-460f-ae6c-b2e821acc755",
      "at": "2026-10-27T19:42:50.391058Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
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
    "id": "34d75160-5a50-4dfd-9ad3-e8bffb3eb031",
    "order_id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444",
    "expires_at": "2026-10-27T19:43:05.928682Z",
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

`POST /api/driver/v1/offers/34d75160-5a50-4dfd-9ad3-e8bffb3eb031/accept` → **200**

```json
{
  "command_id": "aa02bec6-840f-4766-85ba-4b47036403a2"
}
```

```json
{
  "id": "c96468ec-c2ae-4720-88d2-9d270a6c0ce8",
  "order_id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6614b59d-4c71-40b3-bee2-7dbfc8c6ff21",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6614b59d-4c71-40b3-bee2-7dbfc8c6ff21",
  "order_id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444",
  "assignment_id": "c96468ec-c2ae-4720-88d2-9d270a6c0ce8",
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

`POST /api/driver/v1/work-sessions/77788cd4-87eb-4f55-812e-e2395d5806df/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:42:51Z",
    "sequence": 1793130171788
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77788cd4-87eb-4f55-812e-e2395d5806df",
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
  "last_heartbeat_at": "2026-10-27T19:42:51.100798Z",
  "last_location_at": "2026-10-27T19:42:51.100798Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6614b59d-4c71-40b3-bee2-7dbfc8c6ff21/arrive` → **200**

```json
{
  "command_id": "b0d042b1-2dae-4e45-b503-db8d68c8e562",
  "expected_version": 0
}
```

```json
{
  "id": "6614b59d-4c71-40b3-bee2-7dbfc8c6ff21",
  "order_id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444",
  "assignment_id": "c96468ec-c2ae-4720-88d2-9d270a6c0ce8",
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
  "arrived_at": "2026-10-27T19:42:51.140971Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6614b59d-4c71-40b3-bee2-7dbfc8c6ff21/start` → **200**

```json
{
  "command_id": "349b4758-4a12-4a6d-a341-f4d855ea778f",
  "expected_version": 1
}
```

```json
{
  "id": "6614b59d-4c71-40b3-bee2-7dbfc8c6ff21",
  "order_id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444",
  "assignment_id": "c96468ec-c2ae-4720-88d2-9d270a6c0ce8",
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
  "arrived_at": "2026-10-27T19:42:51.140971Z",
  "started_at": "2026-10-27T19:42:51.180573Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/6614b59d-4c71-40b3-bee2-7dbfc8c6ff21/complete` → **200**

```json
{
  "command_id": "457bf543-e895-4798-8cfa-c4c5873a3fdb",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:42:51Z",
  "cash_received": true
}
```

```json
{
  "id": "6614b59d-4c71-40b3-bee2-7dbfc8c6ff21",
  "order_id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444",
  "assignment_id": "c96468ec-c2ae-4720-88d2-9d270a6c0ce8",
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
  "arrived_at": "2026-10-27T19:42:51.140971Z",
  "started_at": "2026-10-27T19:42:51.180573Z",
  "completed_at": "2026-10-27T19:42:51.235511Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6003a624-7d0f-4562-b7ea-c736989054a7",
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
      "id": "f076ae97-b2d5-4488-956f-43e4d9399e68",
      "at": "2026-10-27T19:42:52.288326Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444"
    },
    {
      "id": "7f08c891-eb0f-460f-ae6c-b2e821acc755",
      "at": "2026-10-27T19:42:50.391058Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/e458804a-b6a2-4f45-a9e6-e3f359025a3b/archive` → **200**

```json
{
  "command_id": "0724c480-2679-4232-b3d7-a25e8ce7d6ac",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "e458804a-b6a2-4f45-a9e6-e3f359025a3b",
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
  "created_by": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
  "created_at": "2026-10-27T19:42:50.004866Z",
  "updated_at": "2026-10-27T19:42:54.318968Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77788cd4-87eb-4f55-812e-e2395d5806df",
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
  "last_heartbeat_at": "2026-10-27T19:42:51.100798Z",
  "last_location_at": "2026-10-27T19:42:51.100798Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/77788cd4-87eb-4f55-812e-e2395d5806df/close` → **200**

```json
{
  "command_id": "0df187ea-bd50-4c25-81d0-72a7cc179c55",
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

Done: order 4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637791094",
  "device_ref": "sandbox-8816"
}
```

```json
{
  "challenge_id": "feb93685-ece3-437c-a61f-bfced95d7fb5",
  "expires_at": "2026-10-27T19:47:54.422006761Z",
  "resend_available_at": "2026-10-27T19:42:55.422006761Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637791094` → **200**

```json
{
  "phone": "+380637791094",
  "audience": "CLIENT",
  "code": "809324",
  "sent_at": "2026-10-27T19:42:54.424952578Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "feb93685-ece3-437c-a61f-bfced95d7fb5",
  "code": "809324",
  "device_ref": "sandbox-8816"
}
```

```json
{
  "session_id": "abeff940-e0a0-4a6f-a71c-23e40e4423e9",
  "subject": {
    "type": "CLIENT",
    "id": "a6ff1c07-7077-4688-97f1-2153e5d5c8a6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmZmMWMwNy03MDc3LTQ2ODgtOTdmMS0yMTUzZTVkNWM4YTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMDc0LCJpYXQiOjE3OTMxMzAxNzQsImp0aSI6ImNiMjRmZGIwLTA2MzctNGU4My1hZmE3LTUxYjEwZGU2NThiOCIsInNpZCI6ImFiZWZmOTQwLWUwYTAtNGE2Zi1hNzFjLTIzZTQwZTQ0MjNlOSJ9.PIWdILiGHYD-lUEbLIv2BfbJ9yu5M8tdwLZoOwFgCzg",
  "access_expires_at": "2026-10-27T19:57:54.473288215Z",
  "refresh_token": "OwIKXo42LsDOdzdyZtHBvRNbDCM4AEQOAag3CSBUdP8",
  "refresh_expires_at": "2026-11-26T19:42:54.472627738Z",
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
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
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
  "device_ref": "sandbox-3247"
}
```

```json
{
  "challenge_id": "67f4fbcd-3d72-4401-9042-bce2aac78434",
  "expires_at": "2026-10-27T19:47:54.520026992Z",
  "resend_available_at": "2026-10-27T19:42:55.520026992Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "054117",
  "sent_at": "2026-10-27T19:42:54.52325887Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67f4fbcd-3d72-4401-9042-bce2aac78434",
  "code": "054117",
  "device_ref": "sandbox-3247"
}
```

```json
{
  "session_id": "535f1495-8260-4980-a4b8-9b8a00cb7550",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTA3NCwiaWF0IjoxNzkzMTMwMTc0LCJqdGkiOiIyNzE2NmJkZS0wNjRiLTRkMjQtOWVhMy03ZDg1NjIzZGY2NTMiLCJzaWQiOiI1MzVmMTQ5NS04MjYwLTQ5ODAtYTRiOC05YjhhMDBjYjc1NTAifQ.IkdqTnEsyvOLJtl01HOA9-MCV5fg5hiV8XqUojKWgu4",
  "access_expires_at": "2026-10-27T19:57:54.570672906Z",
  "refresh_token": "G6132z89CDguQYdib-6kFCnlD7_N1cHQdYLDZPI050M",
  "refresh_expires_at": "2026-11-26T19:42:54.570165911Z",
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
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
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
  "session_id": "c1ac6295-482c-43f0-ac9a-41ce4b13aec7",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwNzQsImlhdCI6MTc5MzEzMDE3NCwianRpIjoiYzYyOTUxNWEtNGU2Ny00ODk4LTg3OGEtZTcwMmQxYjQ0YTAwIiwic2lkIjoiYzFhYzYyOTUtNDgyYy00M2YwLWFjOWEtNDFjZTRiMTNhZWM3In0.ZrZJHXCFITLrua4nuW0yHclzwDef_lZ9PZZt01s93cU",
  "access_expires_at": "2026-10-27T19:57:54.823791741Z",
  "refresh_token": "b4-zWHHHpj1KR_x4vjbis94Gwx80XMgYCmdiD5PXH94",
  "refresh_expires_at": "2026-10-28T07:42:54.822942629Z",
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
  "session_id": "62002931-d02d-4e2a-84e9-13448de99529",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwNzUsImlhdCI6MTc5MzEzMDE3NSwianRpIjoiOWM4NjcyYjgtODNlNS00ZWFhLTk1ZDYtMzVkNzdjODM2ZjQ4Iiwic2lkIjoiNjIwMDI5MzEtZDAyZC00ZTJhLTg0ZTktMTM0NDhkZTk5NTI5In0.kwqMs0qBnI4-6ix_bHpYGYbVPCkw1c66KbZtc-GOUyo",
  "access_expires_at": "2026-10-27T19:57:55.056763606Z",
  "refresh_token": "eTPw6ywzHJ8Qg_s6LVOKAKO1to5NeBFXUilEFTvCQgg",
  "refresh_expires_at": "2026-10-28T07:42:55.056212665Z",
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
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident",
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
  "command_id": "6fea66c6-a999-4bb8-a855-42b2529f5dcc",
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
  "id": "8b4a7a02-ff97-491a-bd90-13c95db3c4ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:47:55.113217Z",
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
  "command_id": "b5d62914-4d68-4b39-b490-d159e16051e8",
  "quote_id": "8b4a7a02-ff97-491a-bd90-13c95db3c4ef",
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
  "id": "42c4f82f-8500-4f82-9822-6af2f6691d46",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6ff1c07-7077-4688-97f1-2153e5d5c8a6",
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
  "created_at": "2026-10-27T19:42:55.148201Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/42c4f82f-8500-4f82-9822-6af2f6691d46` → **200**

```json
{
  "id": "42c4f82f-8500-4f82-9822-6af2f6691d46",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6ff1c07-7077-4688-97f1-2153e5d5c8a6",
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
  "created_at": "2026-10-27T19:42:55.148201Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/42c4f82f-8500-4f82-9822-6af2f6691d46/cancel` → **200**

```json
{
  "command_id": "325c59e2-9bc0-4634-8a4f-1aa6eed50377",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "42c4f82f-8500-4f82-9822-6af2f6691d46",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6ff1c07-7077-4688-97f1-2153e5d5c8a6",
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
  "created_at": "2026-10-27T19:42:55.148201Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
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
  "command_id": "6b752e08-0bf3-4ede-acef-dee437062856",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:42:55Z",
    "sequence": 1793130175265
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:42:55.281574Z",
  "last_location_at": "2026-10-27T19:42:55.281574Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8388"
}
```

```json
{
  "challenge_id": "76f4ae89-efd1-44d9-be05-48f6e4568842",
  "expires_at": "2026-10-27T19:47:55.306583086Z",
  "resend_available_at": "2026-10-27T19:42:56.306583086Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "233774",
  "sent_at": "2026-10-27T19:42:55.30925267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76f4ae89-efd1-44d9-be05-48f6e4568842",
  "code": "233774",
  "device_ref": "sandbox-8388"
}
```

```json
{
  "session_id": "46085838-afcc-4a73-a56c-b8eca7dad834",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTA3NSwiaWF0IjoxNzkzMTMwMTc1LCJqdGkiOiJlNWQzMjU3OC05MWQyLTRmNmEtYTQyOS01NjE2MThlMjAyOGYiLCJzaWQiOiI0NjA4NTgzOC1hZmNjLTRhNzMtYTU2Yy1iOGVjYTdkYWQ4MzQifQ.x9A7d9ZBm3AmQVhls4jXxipNDIVM4VNeLYWy1JHqnyQ",
  "access_expires_at": "2026-10-27T19:57:55.360493823Z",
  "refresh_token": "mOOKqQ4ki68Ucxz90tupEnqpgxehYHxwWIC6cHzp5Pc",
  "refresh_expires_at": "2026-11-26T19:42:55.360083714Z",
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
  "command_id": "c9d1baf2-59f8-4c6e-bb58-9e956c2338fc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:42:55Z",
    "sequence": 1793130175403
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18624c9f-52d1-4625-8ba1-1f4d4a3f84b3",
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
  "last_heartbeat_at": "2026-10-27T19:42:55.419233Z",
  "last_location_at": "2026-10-27T19:42:55.419233Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48338c5f-0c15-4b7a-a9be-e60489143627",
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
  "id": "c7e887e9-b22b-4ecc-b70f-fb5bd54c5bd6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:47:55.452343Z",
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
  "command_id": "37aff39e-4184-4070-906a-d7a4bd3a2d83",
  "quote_id": "c7e887e9-b22b-4ecc-b70f-fb5bd54c5bd6",
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
  "id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6ff1c07-7077-4688-97f1-2153e5d5c8a6",
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
  "created_at": "2026-10-27T19:42:55.48661Z",
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
    "id": "b5b0231a-866f-4dfe-87bd-f7b40850e9a9",
    "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
    "expires_at": "2026-10-27T19:43:10.489885Z",
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

`POST /api/driver/v1/offers/b5b0231a-866f-4dfe-87bd-f7b40850e9a9/accept` → **200**

```json
{
  "command_id": "8448de2f-5bcc-4531-af36-17dcf4ff841a"
}
```

```json
{
  "id": "90ef9b3f-8cd9-4ee2-a7d7-ecbe6a638c6c",
  "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "72b964d5-e94d-4079-b1e0-0161c337f30b",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "72b964d5-e94d-4079-b1e0-0161c337f30b",
  "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
  "assignment_id": "90ef9b3f-8cd9-4ee2-a7d7-ecbe6a638c6c",
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

`POST /api/driver/v1/trips/72b964d5-e94d-4079-b1e0-0161c337f30b/cancel` → **200**

```json
{
  "command_id": "4734e0a1-edf0-4e20-9d7b-6abb7f9119ce",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "72b964d5-e94d-4079-b1e0-0161c337f30b",
  "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
  "assignment_id": "90ef9b3f-8cd9-4ee2-a7d7-ecbe6a638c6c",
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

`GET /api/rider/v1/orders/a32b3175-1b05-44e2-8ac6-54ad4553b2dc` → **200**

```json
{
  "id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a6ff1c07-7077-4688-97f1-2153e5d5c8a6",
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
    "id": "90ef9b3f-8cd9-4ee2-a7d7-ecbe6a638c6c",
    "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "72b964d5-e94d-4079-b1e0-0161c337f30b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:42:55.48661Z",
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
    "id": "9bf5d531-716d-4a20-9528-b4dc9df60a3c",
    "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
    "expires_at": "2026-10-27T19:43:10.608702Z",
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

`POST /api/driver/v1/offers/9bf5d531-716d-4a20-9528-b4dc9df60a3c/accept` → **200**

```json
{
  "command_id": "0b0455bb-3869-44dd-af79-cf1d0c2b105e"
}
```

```json
{
  "id": "7d288ca6-2e58-4ea0-bff6-88e8f569e0fc",
  "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "10c80f9c-beea-4ae2-b7d0-ef62bda12b1d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "10c80f9c-beea-4ae2-b7d0-ef62bda12b1d",
  "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
  "assignment_id": "7d288ca6-2e58-4ea0-bff6-88e8f569e0fc",
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

`POST /api/driver/v1/trips/10c80f9c-beea-4ae2-b7d0-ef62bda12b1d/cancel` → **200**

```json
{
  "command_id": "f56a6522-857a-472a-b9f1-fcb138692946",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "10c80f9c-beea-4ae2-b7d0-ef62bda12b1d",
  "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
  "assignment_id": "7d288ca6-2e58-4ea0-bff6-88e8f569e0fc",
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
    "id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:42:55.48661Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "42c4f82f-8500-4f82-9822-6af2f6691d46",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:42:55.148201Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/a32b3175-1b05-44e2-8ac6-54ad4553b2dc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:42:55.4871Z",
      "actor": {
        "type": "CLIENT",
        "id": "a6ff1c07-7077-4688-97f1-2153e5d5c8a6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
        "quote_id": "c7e887e9-b22b-4ecc-b70f-fb5bd54c5bd6",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:42:55.488851Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
        "attempt_id": "3f8f9d01-3dee-4876-9995-9eb5a33e0637",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:42:55.494521Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b5b0231a-866f-4dfe-87bd-f7b40850e9a9",
        "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:42:55.545615Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b5b0231a-866f-4dfe-87bd-f7b40850e9a9",
        "order_id": "a32b3175-1b05-44e2-8ac6-54ad4553b2dc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "90ef9b3f-8cd9-4ee2-a7d7-ecbe6a638c6c"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 42c4f82f-8500-4f82-9822-6af2f6691d46, a32b3175-1b05-44e2-8ac6-54ad4553b2dc.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731625406",
  "device_ref": "sandbox-5717"
}
```

```json
{
  "challenge_id": "b973ad75-770a-4e6a-8a04-5ef2f3718088",
  "expires_at": "2026-10-27T19:47:55.823889687Z",
  "resend_available_at": "2026-10-27T19:42:56.823889687Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731625406` → **200**

```json
{
  "phone": "+380731625406",
  "audience": "CLIENT",
  "code": "538848",
  "sent_at": "2026-10-27T19:42:55.825823155Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b973ad75-770a-4e6a-8a04-5ef2f3718088",
  "code": "538848",
  "device_ref": "sandbox-5717"
}
```

```json
{
  "session_id": "d5872efa-3d7c-487b-8bef-300e42ef2846",
  "subject": {
    "type": "CLIENT",
    "id": "46ddaa5f-8d9b-438b-b897-8462078715ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NmRkYWE1Zi04ZDliLTQzOGItYjg5Ny04NDYyMDc4NzE1Y2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMDc1LCJpYXQiOjE3OTMxMzAxNzUsImp0aSI6ImQ0NDhjM2M2LTZhNzAtNDlmMy05ZmE2LTNmYTk4NTM4MzAzMiIsInNpZCI6ImQ1ODcyZWZhLTNkN2MtNDg3Yi04YmVmLTMwMGU0MmVmMjg0NiJ9.YyvR8PYUnizLbL69xRgqmgXLttISb6cbELJ65-0iQmY",
  "access_expires_at": "2026-10-27T19:57:55.872889076Z",
  "refresh_token": "6Hlf25Zm5U3xB6RKBhguN-ki32lqZQAjTf3fKjduNio",
  "refresh_expires_at": "2026-11-26T19:42:55.872391455Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "7cb3df78-c77a-42a8-b1f1-0e985464c714",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "094a0424-a6fc-47a4-8f15-9743f6ed08ff",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-094a0424-a6fc-47a4-8f15-9743f6ed08ff",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "80b05f4b8d41f9c20f73cbfcd5b1987a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=094a0424-a6fc-47a4-8f15-9743f6ed08ff",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731625406"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=094a0424-a6fc-47a4-8f15-9743f6ed08ff",
  "expires_at": "2026-10-27T20:12:55.903608Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/094a0424-a6fc-47a4-8f15-9743f6ed08ff` → **200**

```json
{
  "id": "094a0424-a6fc-47a4-8f15-9743f6ed08ff",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T20:12:55.903608Z",
  "card": {
    "id": "96b7367c-3c7e-4d4c-92d1-9e5eb4e462e1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7727",
    "card_type": "Visa",
    "created_at": "2026-10-27T19:42:55.946264Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "96b7367c-3c7e-4d4c-92d1-9e5eb4e462e1",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7727",
      "card_type": "Visa",
      "created_at": "2026-10-27T19:42:55.946264Z"
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
  "device_ref": "sandbox-2301"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "34230937-1e1a-438d-a759-b47d6e3f01cb",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-2301"
}
```

```json
{
  "challenge_id": "52eb1dbd-01f1-451d-b4c8-7ca2f2c4a78c",
  "expires_at": "2026-10-27T19:47:57.06816074Z",
  "resend_available_at": "2026-10-27T19:42:58.06816074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "547980",
  "sent_at": "2026-10-27T19:42:57.070227574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52eb1dbd-01f1-451d-b4c8-7ca2f2c4a78c",
  "code": "547980",
  "device_ref": "sandbox-2301"
}
```

```json
{
  "session_id": "35e9bcdc-b8ab-43e1-9c02-257f1d352b4f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTA3NywiaWF0IjoxNzkzMTMwMTc3LCJqdGkiOiIzNmZmYTE5YS1jN2VkLTQyNDMtYmZjNy1hZjYyMzNlOTY3MGEiLCJzaWQiOiIzNWU5YmNkYy1iOGFiLTQzZTEtOWMwMi0yNTdmMWQzNTJiNGYifQ.EsbmLLRDhWSuLWBlFNgb_wn3OQhk_KgKiNg7iwj59cU",
  "access_expires_at": "2026-10-27T19:57:57.116619858Z",
  "refresh_token": "VinIlC_NZhQO2bVGeLIEjCQpGAd10bhjW8PZU0vg7EY",
  "refresh_expires_at": "2026-11-26T19:42:57.116120625Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18624c9f-52d1-4625-8ba1-1f4d4a3f84b3",
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
  "last_heartbeat_at": "2026-10-27T19:42:55.419233Z",
  "last_location_at": "2026-10-27T19:42:55.419233Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/18624c9f-52d1-4625-8ba1-1f4d4a3f84b3/handover` → **200**

```json
{
  "command_id": "161013c4-76f4-42f0-9b82-f651cf8ba778",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18624c9f-52d1-4625-8ba1-1f4d4a3f84b3",
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
  "last_heartbeat_at": "2026-10-27T19:42:55.419233Z",
  "last_location_at": "2026-10-27T19:42:55.419233Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/18624c9f-52d1-4625-8ba1-1f4d4a3f84b3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:42:57Z",
    "sequence": 1793130177192
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18624c9f-52d1-4625-8ba1-1f4d4a3f84b3",
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
  "last_heartbeat_at": "2026-10-27T19:42:57.208762Z",
  "last_location_at": "2026-10-27T19:42:57.208762Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3cec3a48-4e1f-4b1b-86b2-cab14bf09aeb",
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
  "id": "2f129485-e2a2-4b6c-9696-819c30c16fd0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T19:47:57.239484Z",
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
  "command_id": "ce77ea52-7fea-4598-b44d-7a048454756d",
  "quote_id": "2f129485-e2a2-4b6c-9696-819c30c16fd0",
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
  "id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "46ddaa5f-8d9b-438b-b897-8462078715ca",
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
  "created_at": "2026-10-27T19:42:57.272768Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b` → **200**

```json
{
  "id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "46ddaa5f-8d9b-438b-b897-8462078715ca",
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
  "created_at": "2026-10-27T19:42:57.272768Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b` → **200**

```json
{
  "id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "46ddaa5f-8d9b-438b-b897-8462078715ca",
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
  "created_at": "2026-10-27T19:42:57.272768Z",
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
    "id": "91870ee1-1d62-47c9-892f-8c68b30ab50f",
    "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
    "expires_at": "2026-10-27T19:43:12.352942Z",
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

`POST /api/driver/v1/offers/91870ee1-1d62-47c9-892f-8c68b30ab50f/accept` → **200**

```json
{
  "command_id": "30846cd4-d2d6-4c60-882e-a1c47be0e38a"
}
```

```json
{
  "id": "92de6ab0-0887-4366-970f-a59430928920",
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "assignment_id": "92de6ab0-0887-4366-970f-a59430928920",
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

`POST /api/driver/v1/work-sessions/18624c9f-52d1-4625-8ba1-1f4d4a3f84b3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:42:58Z",
    "sequence": 1793130178427
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18624c9f-52d1-4625-8ba1-1f4d4a3f84b3",
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
  "last_heartbeat_at": "2026-10-27T19:42:58.444722Z",
  "last_location_at": "2026-10-27T19:42:58.444722Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2da8f97e-dce4-4abe-9e5f-91636045efdc/arrive` → **200**

```json
{
  "command_id": "433882f3-143c-4760-ab42-edc021f72453",
  "expected_version": 0
}
```

```json
{
  "id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "assignment_id": "92de6ab0-0887-4366-970f-a59430928920",
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
  "arrived_at": "2026-10-27T19:42:58.476938Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2da8f97e-dce4-4abe-9e5f-91636045efdc/start` → **200**

```json
{
  "command_id": "6b5b8a1d-52a3-47ad-aa3c-05a1f92aeff0",
  "expected_version": 1
}
```

```json
{
  "id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "assignment_id": "92de6ab0-0887-4366-970f-a59430928920",
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
  "arrived_at": "2026-10-27T19:42:58.476938Z",
  "started_at": "2026-10-27T19:42:58.513276Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2da8f97e-dce4-4abe-9e5f-91636045efdc/complete` → **200**

```json
{
  "command_id": "168b5345-7dbe-45a4-beb4-f341df9b0908",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:42:58Z"
}
```

```json
{
  "id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "assignment_id": "92de6ab0-0887-4366-970f-a59430928920",
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
  "arrived_at": "2026-10-27T19:42:58.476938Z",
  "started_at": "2026-10-27T19:42:58.513276Z",
  "completed_at": "2026-10-27T19:42:58.552844Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b` → **200**

```json
{
  "id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "46ddaa5f-8d9b-438b-b897-8462078715ca",
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
    "id": "92de6ab0-0887-4366-970f-a59430928920",
    "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:42:57.272768Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b` → **200**

```json
{
  "id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "46ddaa5f-8d9b-438b-b897-8462078715ca",
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
    "id": "92de6ab0-0887-4366-970f-a59430928920",
    "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:42:57.272768Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b` → **200**

```json
{
  "id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "46ddaa5f-8d9b-438b-b897-8462078715ca",
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
    "id": "92de6ab0-0887-4366-970f-a59430928920",
    "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:42:57.272768Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b` → **200**

```json
{
  "id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "46ddaa5f-8d9b-438b-b897-8462078715ca",
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
    "id": "92de6ab0-0887-4366-970f-a59430928920",
    "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2da8f97e-dce4-4abe-9e5f-91636045efdc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:42:57.272768Z",
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
      "id": "1d4be96e-6b47-4cb8-828c-cef314b71813",
      "at": "2026-10-27T19:42:59.380585Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b/tip` → **200**

```json
{
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
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
  "available_until": "2026-10-28T19:42:58.552844Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b/tip` → **201**

```json
{
  "command_id": "8e5996bf-8f36-4ecd-94b4-71b42145e98b",
  "amount_minor": 2500
}
```

```json
{
  "id": "33a0b76e-c379-4d69-b68a-d5bab5e8e2b6",
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T19:43:01.765195Z"
}
```

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b/tip` → **200**

```json
{
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
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
  "available_until": "2026-10-28T19:42:58.552844Z",
  "open": false,
  "tip": {
    "id": "33a0b76e-c379-4d69-b68a-d5bab5e8e2b6",
    "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T19:43:01.765195Z"
  }
}
```

`GET /api/rider/v1/orders/d8ccec02-caf2-4122-ba4f-2fe269da777b/tip` → **200**

```json
{
  "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
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
  "available_until": "2026-10-28T19:42:58.552844Z",
  "open": false,
  "tip": {
    "id": "33a0b76e-c379-4d69-b68a-d5bab5e8e2b6",
    "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T19:43:01.765195Z"
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
      "id": "1d4be96e-6b47-4cb8-828c-cef314b71813",
      "at": "2026-10-27T19:42:59.380585Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
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
      "id": "b7972b9f-402a-4298-ab77-737342838fe7",
      "at": "2026-10-27T19:43:03.434468Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
      "counterpart_id": null
    },
    {
      "id": "1d4be96e-6b47-4cb8-828c-cef314b71813",
      "at": "2026-10-27T19:42:59.380585Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d8ccec02-caf2-4122-ba4f-2fe269da777b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "18624c9f-52d1-4625-8ba1-1f4d4a3f84b3",
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
  "last_heartbeat_at": "2026-10-27T19:42:58.444722Z",
  "last_location_at": "2026-10-27T19:42:58.444722Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/18624c9f-52d1-4625-8ba1-1f4d4a3f84b3/close` → **200**

```json
{
  "command_id": "e05ed300-ea6d-4f79-99f6-cc4ebfd086c5",
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

Done: card order d8ccec02-caf2-4122-ba4f-2fe269da777b.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731860070",
  "device_ref": "sandbox-31126"
}
```

```json
{
  "challenge_id": "7f2508f2-5845-4df6-8415-4f2d7ccc74d4",
  "expires_at": "2026-10-27T19:48:03.955219719Z",
  "resend_available_at": "2026-10-27T19:43:04.955219719Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731860070` → **200**

```json
{
  "phone": "+380731860070",
  "audience": "CLIENT",
  "code": "155708",
  "sent_at": "2026-10-27T19:43:03.957512985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f2508f2-5845-4df6-8415-4f2d7ccc74d4",
  "code": "155708",
  "device_ref": "sandbox-31126"
}
```

```json
{
  "session_id": "51e04a6b-948b-4b22-abdb-9b83d4557a60",
  "subject": {
    "type": "CLIENT",
    "id": "77b44bda-bad8-4adb-8a30-a97fcb413467"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I0NGJkYS1iYWQ4LTRhZGItOGEzMC1hOTdmY2I0MTM0NjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMDg0LCJpYXQiOjE3OTMxMzAxODQsImp0aSI6IjhmYTFkOGI1LWNiOWQtNDg3NC05YWI3LWE4MGQwZmYyZTMxNCIsInNpZCI6IjUxZTA0YTZiLTk0OGItNGIyMi1hYmRiLTliODNkNDU1N2E2MCJ9.sNKwKgp3rP3ujQwbA1z2MAMsKKrxFMae8twqnnzRW_w",
  "access_expires_at": "2026-10-27T19:58:04.006441173Z",
  "refresh_token": "gFHvadqMsQinOt76Xpa88UwhFSuawrK-_iGADnE6KWE",
  "refresh_expires_at": "2026-11-26T19:43:04.005785894Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "2137c1a9-b306-4a1c-8734-d8b6a460117e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "2e877439-2ab5-4660-bc36-0fb050189452",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2e877439-2ab5-4660-bc36-0fb050189452",
    "orderDate": "1793130184",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "50776258ef0f80efe671bfd5a814763b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2e877439-2ab5-4660-bc36-0fb050189452",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731860070"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2e877439-2ab5-4660-bc36-0fb050189452",
  "created_at": "2026-10-27T19:43:04.040368Z",
  "expires_at": "2026-10-27T20:13:04.040368Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/2e877439-2ab5-4660-bc36-0fb050189452` → **200**

```json
{
  "id": "2e877439-2ab5-4660-bc36-0fb050189452",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:43:04.040368Z",
  "expires_at": "2026-10-27T20:13:04.040368Z",
  "completed_at": "2026-10-27T19:43:04.075211Z",
  "masked_pan": "41****3846",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "77b44bda-bad8-4adb-8a30-a97fcb413467",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "77b44bda-bad8-4adb-8a30-a97fcb413467",
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
      "id": "a8c00376-aa5f-49c4-864b-dc5933467472",
      "at": "2026-10-27T19:43:04.444499Z",
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
  "client_id": "77b44bda-bad8-4adb-8a30-a97fcb413467",
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
      "id": "a8c00376-aa5f-49c4-864b-dc5933467472",
      "at": "2026-10-27T19:43:04.444499Z",
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
  "device_ref": "sandbox-1846"
}
```

```json
{
  "challenge_id": "79d2074d-0446-4c1d-b12c-2164ffcff13b",
  "expires_at": "2026-10-27T19:48:05.196367532Z",
  "resend_available_at": "2026-10-27T19:43:06.196367532Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "822560",
  "sent_at": "2026-10-27T19:43:05.198841496Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79d2074d-0446-4c1d-b12c-2164ffcff13b",
  "code": "822560",
  "device_ref": "sandbox-1846"
}
```

```json
{
  "session_id": "d61486dc-56ed-4b5f-ac95-7778c760298e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTA4NSwiaWF0IjoxNzkzMTMwMTg1LCJqdGkiOiI0NTBjMTBlYS1lYTE5LTRlYTItOGFmYS0zY2Y1MGIxMDYzOGIiLCJzaWQiOiJkNjE0ODZkYy01NmVkLTRiNWYtYWM5NS03Nzc4Yzc2MDI5OGUifQ.V3vddOjNB-pE8PYcMMz7atW1JgAbomeJ-7OAVFodq6I",
  "access_expires_at": "2026-10-27T19:58:05.247950362Z",
  "refresh_token": "3WOuFsoM5XPJ65SNF7vl1wsH7iBUAq2ZFm_oxWaDlkk",
  "refresh_expires_at": "2026-11-26T19:43:05.247477338Z",
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
  "command_id": "7cdb1e4b-3986-4dd1-ae97-b1cc0b77b101",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "872ae9ba-a5b4-4d1f-85b7-f79a6ab79bd8",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-872ae9ba-a5b4-4d1f-85b7-f79a6ab79bd8",
    "orderDate": "1793130185",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "9bf37e190b77164631f261b7a02052dc",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=872ae9ba-a5b4-4d1f-85b7-f79a6ab79bd8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=872ae9ba-a5b4-4d1f-85b7-f79a6ab79bd8",
  "created_at": "2026-10-27T19:43:05.299089Z",
  "expires_at": "2026-10-27T20:13:05.299089Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/872ae9ba-a5b4-4d1f-85b7-f79a6ab79bd8` → **200**

```json
{
  "id": "872ae9ba-a5b4-4d1f-85b7-f79a6ab79bd8",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:43:05.299089Z",
  "expires_at": "2026-10-27T20:13:05.299089Z",
  "completed_at": "2026-10-27T19:43:05.327241Z",
  "masked_pan": "41****8689",
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
      "id": "553ec0ed-1435-4558-b15b-267ab51ec4f4",
      "at": "2026-10-27T19:43:05.452393Z",
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
  "command_id": "019838f0-3aad-48fd-9a90-467d400c1eb3",
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
  "correlation_id": "8eb37f68-4bec-4064-b6b5-312b53ed120e"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671302558",
  "device_ref": "sandbox-30958"
}
```

```json
{
  "challenge_id": "1e405f29-ec58-47a1-aa25-a5e95e0ecded",
  "expires_at": "2026-10-27T19:48:06.450264506Z",
  "resend_available_at": "2026-10-27T19:43:07.450264506Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671302558` → **200**

```json
{
  "phone": "+380671302558",
  "audience": "CLIENT",
  "code": "366322",
  "sent_at": "2026-10-27T19:43:06.45294694Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e405f29-ec58-47a1-aa25-a5e95e0ecded",
  "code": "366322",
  "device_ref": "sandbox-30958"
}
```

```json
{
  "session_id": "f55a9941-7386-4784-8eac-0d9b20eaf218",
  "subject": {
    "type": "CLIENT",
    "id": "2c024cf9-a972-43ab-90b5-24331e514016"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzAyNGNmOS1hOTcyLTQzYWItOTBiNS0yNDMzMWU1MTQwMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMDg2LCJpYXQiOjE3OTMxMzAxODYsImp0aSI6IjdlZmUyYmM1LTAxZjgtNGYxNS05NWQ2LWQwYTcyMWQ2YjZjMSIsInNpZCI6ImY1NWE5OTQxLTczODYtNDc4NC04ZWFjLTBkOWIyMGVhZjIxOCJ9.oMC6ExUfmhyFX_YqViQruEMuRz6Eng8NVyMJ0IwLks4",
  "access_expires_at": "2026-10-27T19:58:06.505623626Z",
  "refresh_token": "oHxv-0YxYhzxzIT-pGg6anENo-hmoRvdJbQ9jh0lfL0",
  "refresh_expires_at": "2026-11-26T19:43:06.505116055Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2c024cf9-a972-43ab-90b5-24331e514016",
  "session_id": "f55a9941-7386-4784-8eac-0d9b20eaf218",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "efc92bba-e438-4f95-83d6-32fa55c6e7f7",
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
  "id": "e19b8d4a-b925-408d-b2ab-de720e877a8c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:48:06.562061Z",
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
  "challenge_id": "8a6ef2ff-7005-4c37-ad66-e359bcb1a688",
  "expires_at": "2026-10-27T19:48:08.595962353Z",
  "resend_available_at": "2026-10-27T19:43:09.595962353Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671302558` → **200**

```json
{
  "phone": "+380671302558",
  "audience": "CLIENT",
  "code": "143418",
  "sent_at": "2026-10-27T19:43:08.597694061Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "a6ac2afb-df83-419e-a257-5e972192d83d",
  "challenge_id": "8a6ef2ff-7005-4c37-ad66-e359bcb1a688",
  "otp_code": "143418"
}
```

```json
{
  "client_id": "2c024cf9-a972-43ab-90b5-24331e514016",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T19:43:08.654338531Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "daa57655-9e6d-4d59-bdb3-ff4c3783e711",
  "quote_id": "e19b8d4a-b925-408d-b2ab-de720e877a8c",
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
  "correlation_id": "cb846865-e814-4a29-9e38-0f71c3d4a67c"
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
  "session_id": "27fe2dbd-653a-4897-88c7-6211d1f006dc",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwODgsImlhdCI6MTc5MzEzMDE4OCwianRpIjoiYmFlYmQ2YzctMjVmNC00NjUxLTg2ZTQtY2U4YzFiMjk2YTYyIiwic2lkIjoiMjdmZTJkYmQtNjUzYS00ODk3LTg4YzctNjIxMWQxZjAwNmRjIn0.unqUvZnFNVjnqo4hkrLD9BeNT2wOY1dkr8bz3SwwfuI",
  "access_expires_at": "2026-10-27T19:58:08.928204464Z",
  "refresh_token": "lzHc0UV1okMFNyL2nh1S1Ae3YFJbzhGBQyNKD_xT4Ug",
  "refresh_expires_at": "2026-10-28T07:43:08.927813664Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "2c024cf9-a972-43ab-90b5-24331e514016",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T19:43:08.654339Z",
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

`POST /api/admin/v1/client-deletions/2c024cf9-a972-43ab-90b5-24331e514016/complete` → **200**

```json
{
  "command_id": "58799d85-9cc3-4f50-850d-cab9412d1e57",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "2c024cf9-a972-43ab-90b5-24331e514016",
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
  "correlation_id": "2733e7cc-269e-486f-8633-8948f6360298"
}
```

Done: client 2c024cf9-a972-43ab-90b5-24331e514016 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661842334",
  "device_ref": "sandbox-10234"
}
```

```json
{
  "challenge_id": "b5a19b96-822e-4b8b-a7b6-9e2829d36c60",
  "expires_at": "2026-10-27T19:48:09.051585296Z",
  "resend_available_at": "2026-10-27T19:43:10.051585296Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661842334` → **200**

```json
{
  "phone": "+380661842334",
  "audience": "CLIENT",
  "code": "566736",
  "sent_at": "2026-10-27T19:43:09.05363181Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b5a19b96-822e-4b8b-a7b6-9e2829d36c60",
  "code": "566736",
  "device_ref": "sandbox-10234"
}
```

```json
{
  "session_id": "7a5ef766-7c22-46f9-96e5-7e88fedd6b0d",
  "subject": {
    "type": "CLIENT",
    "id": "37eb19e1-8498-4a68-8186-824bfecce544"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzN2ViMTllMS04NDk4LTRhNjgtODE4Ni04MjRiZmVjY2U1NDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMDg5LCJpYXQiOjE3OTMxMzAxODksImp0aSI6IjIxY2ZjMzVhLTI2MmQtNDQ4Mi1iOTk1LTNkZTBmOGNhNWZlMCIsInNpZCI6IjdhNWVmNzY2LTdjMjItNDZmOS05NmU1LTdlODhmZWRkNmIwZCJ9.ezGx6hlRwq03UcCPiH4T8Z1rgjAVzJgS-mLJXcKZOp4",
  "access_expires_at": "2026-10-27T19:58:09.100284098Z",
  "refresh_token": "tl_kJkgX-AvQsi4qeXs_B2VNLe7FDeC8mBD_OabdjNo",
  "refresh_expires_at": "2026-11-26T19:43:09.099792617Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "37eb19e1-8498-4a68-8186-824bfecce544",
  "session_id": "7a5ef766-7c22-46f9-96e5-7e88fedd6b0d",
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
  "session_id": "43bfd284-cb76-4026-a723-6484117a223e",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwODksImlhdCI6MTc5MzEzMDE4OSwianRpIjoiOGNlODYzYTYtODk3ZS00NDRmLTk4ZGEtNTIzOTE5ZDM1OTBkIiwic2lkIjoiNDNiZmQyODQtY2I3Ni00MDI2LWE3MjMtNjQ4NDExN2EyMjNlIn0.go7U0mSdHgT5UkuXB7cg8gPHIAvvu__lLg9_u8aRAWM",
  "access_expires_at": "2026-10-27T19:58:09.358179486Z",
  "refresh_token": "kbE5UNXcq5eSFUokYLZAialLkTIhmLdP6Bqiv8m1xtA",
  "refresh_expires_at": "2026-10-28T07:43:09.357728946Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1842334&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "37eb19e1-8498-4a68-8186-824bfecce544",
      "phone": "+380661842334",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-27T19:43:09.097777Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/37eb19e1-8498-4a68-8186-824bfecce544` → **200**

```json
{
  "client": {
    "id": "37eb19e1-8498-4a68-8186-824bfecce544",
    "phone": "+380661842334",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-27T19:43:09.097777Z",
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

`POST /api/admin/v1/clients/37eb19e1-8498-4a68-8186-824bfecce544/block` → **400**

```json
{
  "command_id": "1b5906ed-d3b0-4724-837b-2ebd7551acbd",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/37eb19e1-8498-4a68-8186-824bfecce544/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "728dc669-a245-4365-9eee-97d18d510c0e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/37eb19e1-8498-4a68-8186-824bfecce544/block` → **200**

```json
{
  "command_id": "72bac95f-9941-44d3-b3e5-4bf17041fe32",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "37eb19e1-8498-4a68-8186-824bfecce544",
  "phone": "+380661842334",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-27T19:43:09.097777Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-27T19:43:09.499475Z",
    "by": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
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
  "correlation_id": "ea61bd06-d27d-44da-a35f-e6bee075ed08"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661842334",
  "device_ref": "sandbox-23870"
}
```

```json
{
  "challenge_id": "ac3ec86d-73ae-49b4-8577-f961828055cb",
  "expires_at": "2026-10-27T19:48:11.553584368Z",
  "resend_available_at": "2026-10-27T19:43:12.553584368Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661842334` → **200**

```json
{
  "phone": "+380661842334",
  "audience": "CLIENT",
  "code": "035796",
  "sent_at": "2026-10-27T19:43:11.555785109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "ac3ec86d-73ae-49b4-8577-f961828055cb",
  "code": "035796",
  "device_ref": "sandbox-23870"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "37b5633e-2e7f-4387-82f5-62a9a6a766b3"
}
```

## Staff unblock the rider; the rider signs in again

`POST /api/admin/v1/clients/37eb19e1-8498-4a68-8186-824bfecce544/unblock` → **409**

```json
{
  "command_id": "296846ca-f429-46b4-b793-668e46e76b1a",
  "expected_version": 1,
  "reason": "Apologised"
}
```

```json
{
  "instance": "/api/admin/v1/clients/37eb19e1-8498-4a68-8186-824bfecce544/unblock",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "f53b7579-06ba-4c43-9ca8-eb108415821f"
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
  "device_ref": "sandbox-30731"
}
```

```json
{
  "challenge_id": "116e64fd-9cfc-413c-9ad3-1c862e4a782a",
  "expires_at": "2026-10-27T19:48:11.709849924Z",
  "resend_available_at": "2026-10-27T19:43:12.709849924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "930244",
  "sent_at": "2026-10-27T19:43:11.712711693Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "116e64fd-9cfc-413c-9ad3-1c862e4a782a",
  "code": "930244",
  "device_ref": "sandbox-30731"
}
```

```json
{
  "session_id": "a82a0795-e79c-45da-8c2d-320a996d1e0a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTA5MSwiaWF0IjoxNzkzMTMwMTkxLCJqdGkiOiIyZjdkNjY3My1mYjU3LTRiNWQtYWJjMC1mOTMzMTljMGU0YjUiLCJzaWQiOiJhODJhMDc5NS1lNzljLTQ1ZGEtOGMyZC0zMjBhOTk2ZDFlMGEifQ.KC6X7x8xrSY9lHBdjWdAEZPFUE0KDMS69Bt4WWhCDb0",
  "access_expires_at": "2026-10-27T19:58:11.762856788Z",
  "refresh_token": "73Q55ZgaBT1HcuUL_qAISX5m27jlxUAz63layATpYP0",
  "refresh_expires_at": "2026-11-26T19:43:11.762359147Z",
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
  "command_id": "c53a6515-83cf-4d81-8647-bfaf869c7e64",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:11Z",
    "sequence": 1793130191807
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:11.822918Z",
  "last_location_at": "2026-10-27T19:43:11.822918Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672310243",
  "device_ref": "sandbox-7046"
}
```

```json
{
  "challenge_id": "08e4a6c4-b916-471b-9c15-7089aa1a72ed",
  "expires_at": "2026-10-27T19:48:11.850222312Z",
  "resend_available_at": "2026-10-27T19:43:12.850222312Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672310243` → **200**

```json
{
  "phone": "+380672310243",
  "audience": "CLIENT",
  "code": "274501",
  "sent_at": "2026-10-27T19:43:11.852077832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08e4a6c4-b916-471b-9c15-7089aa1a72ed",
  "code": "274501",
  "device_ref": "sandbox-7046"
}
```

```json
{
  "session_id": "716b9ec7-7828-4b67-a449-7d197ef847db",
  "subject": {
    "type": "CLIENT",
    "id": "ee532043-327a-423a-acf4-a07cd2f93678"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTUzMjA0My0zMjdhLTQyM2EtYWNmNC1hMDdjZDJmOTM2NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMDkxLCJpYXQiOjE3OTMxMzAxOTEsImp0aSI6IjY0NTVhZDY5LTUyNWEtNDhjOS1hZjAyLTQ2Y2YxN2YyNjY0MiIsInNpZCI6IjcxNmI5ZWM3LTc4MjgtNGI2Ny1hNDQ5LTdkMTk3ZWY4NDdkYiJ9.3rlEKsUVR43WVrH1iffU23YgIWHo73lOW7jxZhrEo6Y",
  "access_expires_at": "2026-10-27T19:58:11.898623394Z",
  "refresh_token": "yS0e0eY530hHfw85S88M15bXDfuq7UKva45FEZSbmFk",
  "refresh_expires_at": "2026-11-26T19:43:11.898261919Z",
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
  "command_id": "442017eb-a438-493f-aa3e-eccb0708b4b8",
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
  "id": "0d7e12ec-1909-448d-92b8-eae61e109be2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:48:11.949635Z",
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
  "command_id": "f2ca0977-f9c3-47d7-8033-6949e5bc4edb",
  "platform": "ANDROID",
  "token": "sandbox-driver-fe6c8d4b-70e0-470d-879c-12aeb98292de"
}
```

```json
{
  "id": "1e11c0dc-aa58-456c-a0e3-3eb6fe0a971b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:43:11.987323Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "44d884d6-51cb-4afc-9f97-8b116ec787e2",
  "platform": "ANDROID",
  "token": "sandbox-rider-c5b2006c-bbd6-497c-afbd-d4b535df126c"
}
```

```json
{
  "id": "d1d6793e-3ec7-4c56-b676-b0cbbd0a2364",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:43:12.018992Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7659f823-ae87-49cc-8e68-caafe34202f6",
  "quote_id": "0d7e12ec-1909-448d-92b8-eae61e109be2",
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
  "id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ee532043-327a-423a-acf4-a07cd2f93678",
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
  "created_at": "2026-10-27T19:43:12.054494Z",
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
    "id": "b69f69a4-08a8-46f2-9f4e-9e46a1d59cd7",
    "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
    "expires_at": "2026-10-27T19:43:27.057307Z",
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

`POST /api/driver/v1/offers/b69f69a4-08a8-46f2-9f4e-9e46a1d59cd7/accept` → **200**

```json
{
  "command_id": "db8b3c90-fc62-400c-bb81-9da5db6a8861"
}
```

```json
{
  "id": "5885fd24-1df6-4c6f-891e-7dbf8b2a9f58",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fc359c84-c232-4d57-b254-4187e9389acd",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:43:12.348Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:43:12.348Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:43:12.348Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:43:13.295617529Z",
    "token_suffix": "8292de",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "9496b634-6a11-46ac-a37a-8826be6f8650",
      "order_version": "2",
      "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672310243&after=2026-10-27T19:43:12.348Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:43:13.296980366Z",
    "token_suffix": "df126c",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "1d351c6f-b8f4-4a8b-ba7c-9340681d1392",
      "order_version": "3",
      "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/bc705539-09c8-41d7-afe3-287acd1f47ba/messages` → **201**

```json
{
  "command_id": "0f042b8b-4cc6-45fd-8d70-695c4b167f4f",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "a03f84a2-ada3-40dd-a130-af61c8bb0529",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T19:43:14.24090052Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fc359c84-c232-4d57-b254-4187e9389acd",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "assignment_id": "5885fd24-1df6-4c6f-891e-7dbf8b2a9f58",
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

`POST /api/driver/v1/trips/fc359c84-c232-4d57-b254-4187e9389acd/messages` → **201**

```json
{
  "command_id": "dc094609-8e2b-4a1b-bd0f-43007c51d602",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "33b052e9-1a72-456e-831b-1806881c57ff",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T19:43:14.285416755Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/bc705539-09c8-41d7-afe3-287acd1f47ba/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/fc359c84-c232-4d57-b254-4187e9389acd/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672310243"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:14Z",
    "sequence": 1793130194347
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:14.366288Z",
  "last_location_at": "2026-10-27T19:43:14.366288Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fc359c84-c232-4d57-b254-4187e9389acd",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "assignment_id": "5885fd24-1df6-4c6f-891e-7dbf8b2a9f58",
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

`POST /api/driver/v1/trips/fc359c84-c232-4d57-b254-4187e9389acd/arrive` → **200**

```json
{
  "command_id": "88e05758-953f-4c19-9032-095cc4c90fd3",
  "expected_version": 0
}
```

```json
{
  "id": "fc359c84-c232-4d57-b254-4187e9389acd",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "assignment_id": "5885fd24-1df6-4c6f-891e-7dbf8b2a9f58",
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
  "arrived_at": "2026-10-27T19:43:14.414804Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fc359c84-c232-4d57-b254-4187e9389acd/start` → **200**

```json
{
  "command_id": "f983a904-c4dd-4c99-9be9-607c2b3c6c4a",
  "expected_version": 1
}
```

```json
{
  "id": "fc359c84-c232-4d57-b254-4187e9389acd",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "assignment_id": "5885fd24-1df6-4c6f-891e-7dbf8b2a9f58",
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
  "arrived_at": "2026-10-27T19:43:14.414804Z",
  "started_at": "2026-10-27T19:43:14.444307Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:14Z",
    "sequence": 1793130194466
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:14.482399Z",
  "last_location_at": "2026-10-27T19:43:14.482399Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/fc359c84-c232-4d57-b254-4187e9389acd/complete` → **200**

```json
{
  "command_id": "a9b863cd-76c1-4222-b72f-bb8f6c4fd817",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:43:14Z",
  "cash_received": true
}
```

```json
{
  "id": "fc359c84-c232-4d57-b254-4187e9389acd",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "assignment_id": "5885fd24-1df6-4c6f-891e-7dbf8b2a9f58",
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
  "arrived_at": "2026-10-27T19:43:14.414804Z",
  "started_at": "2026-10-27T19:43:14.444307Z",
  "completed_at": "2026-10-27T19:43:14.513392Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/bc705539-09c8-41d7-afe3-287acd1f47ba` → **200**

```json
{
  "id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ee532043-327a-423a-acf4-a07cd2f93678",
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
    "id": "5885fd24-1df6-4c6f-891e-7dbf8b2a9f58",
    "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fc359c84-c232-4d57-b254-4187e9389acd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:43:12.054494Z",
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
    "id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:43:12.054494Z",
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
    "id": "fc359c84-c232-4d57-b254-4187e9389acd",
    "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
    "order_short_number": 5,
    "created_at": "2026-10-27T19:43:12.113331Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6614b59d-4c71-40b3-bee2-7dbfc8c6ff21",
    "order_id": "4ec16f68-ccd3-4ba8-9dde-0cd1f9e32444",
    "order_short_number": 1,
    "created_at": "2026-10-27T19:42:51.035764Z",
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

`GET /api/rider/v1/orders/bc705539-09c8-41d7-afe3-287acd1f47ba/tip` → **200**

```json
{
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
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
  "available_until": "2026-10-28T19:43:14.513392Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/bc705539-09c8-41d7-afe3-287acd1f47ba/tip` → **201**

```json
{
  "command_id": "77cb6049-6d19-4387-a283-f4b3ff7d3a91",
  "amount_minor": 1100
}
```

```json
{
  "id": "3a4cc16d-d405-469d-a3a8-d789d054ce7a",
  "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T19:43:17.696457Z"
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
  "session_id": "cdff7a7c-a995-42a8-8922-eb07fc480e35",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwOTcsImlhdCI6MTc5MzEzMDE5NywianRpIjoiNjhlMzJiM2ItMDdkZC00NmY0LTg4MDUtOWVkOTgzYjc5ZjI0Iiwic2lkIjoiY2RmZjdhN2MtYTk5NS00MmE4LTg5MjItZWIwN2ZjNDgwZTM1In0.0tl8oshuo9nede_V1Sf-yrSTIRznhcIdBohEzk5Vy1o",
  "access_expires_at": "2026-10-27T19:58:17.930861573Z",
  "refresh_token": "IS1HyG6d2DwgDsQPhaKBRztHhlrqL-vecpUplqw29SY",
  "refresh_expires_at": "2026-10-28T07:43:17.930408529Z",
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
  "generated_at": "2026-10-27T19:43:17.959890268Z"
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
  "generated_at": "2026-10-27T19:43:17.989089295Z"
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
  "session_id": "0b3da222-f0b2-4b3e-b942-57e69ad65370",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwOTgsImlhdCI6MTc5MzEzMDE5OCwianRpIjoiODVhZTliNjQtZmQwYi00NGViLWE1OWQtNzZiMmQ5OTdiNmRjIiwic2lkIjoiMGIzZGEyMjItZjBiMi00YjNlLWI5NDItNTdlNjlhZDY1MzcwIn0.vtWsOjRmYLhkC2stLzBr7dnf3yfOXZalJ7ESvYuW68Y",
  "access_expires_at": "2026-10-27T19:58:18.225209119Z",
  "refresh_token": "cD_5Zk_Uxep711uBe0g6PtHQlyqEQyi-70j_MqeuArQ",
  "refresh_expires_at": "2026-10-28T07:43:18.224787979Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bc705539-09c8-41d7-afe3-287acd1f47ba/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:43:12.05512Z",
      "actor": {
        "type": "CLIENT",
        "id": "ee532043-327a-423a-acf4-a07cd2f93678",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
        "quote_id": "0d7e12ec-1909-448d-92b8-eae61e109be2",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:43:12.056591Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
        "attempt_id": "e3eddf0b-3971-46a3-a61a-8cc3fecfe35c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:43:12.060771Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b69f69a4-08a8-46f2-9f4e-9e46a1d59cd7",
        "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:43:12.114718Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b69f69a4-08a8-46f2-9f4e-9e46a1d59cd7",
        "order_id": "bc705539-09c8-41d7-afe3-287acd1f47ba",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5885fd24-1df6-4c6f-891e-7dbf8b2a9f58"
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
  "at": "2026-10-27T19:43:18.274819632Z",
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
      "last_location_at": "2026-10-27T19:43:14.482399Z",
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
      "last_location_at": "2026-10-27T19:42:55.281574Z",
      "order_id": null
    }
  ]
}
```

Done: order bc705539-09c8-41d7-afe3-287acd1f47ba.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11332"
}
```

```json
{
  "challenge_id": "f71d7650-252a-4c14-8c99-eb4403938f07",
  "expires_at": "2026-10-27T19:48:18.342136905Z",
  "resend_available_at": "2026-10-27T19:43:19.342136905Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "015723",
  "sent_at": "2026-10-27T19:43:18.347561461Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f71d7650-252a-4c14-8c99-eb4403938f07",
  "code": "015723",
  "device_ref": "sandbox-11332"
}
```

```json
{
  "session_id": "a2a037b2-96c7-4cb4-a4d3-3a43f7765791",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTA5OCwiaWF0IjoxNzkzMTMwMTk4LCJqdGkiOiI4MDhkYjdkYy0zM2U2LTQ3MWItOTA0Zi1hYzMyOWZhODJhMmEiLCJzaWQiOiJhMmEwMzdiMi05NmM3LTRjYjQtYTRkMy0zYTQzZjc3NjU3OTEifQ.eHHqMnM-aSSx6SFz6t7gPIrRZ_jycb1nWkAfvvaxhBc",
  "access_expires_at": "2026-10-27T19:58:18.406111299Z",
  "refresh_token": "QJDX1N9URND4Umy68Bh7DvV-QH0R1ArOGQ3350evFek",
  "refresh_expires_at": "2026-11-26T19:43:18.405652251Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:14.482399Z",
  "last_location_at": "2026-10-27T19:43:14.482399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/handover` → **200**

```json
{
  "command_id": "ba1daf00-ec0b-4e57-8072-7cf44c6272b5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:14.482399Z",
  "last_location_at": "2026-10-27T19:43:14.482399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:18Z",
    "sequence": 1793130198483
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:18.500401Z",
  "last_location_at": "2026-10-27T19:43:18.500401Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667381155",
  "device_ref": "sandbox-19141"
}
```

```json
{
  "challenge_id": "99930cad-bda9-4e11-a27c-495d7093a95a",
  "expires_at": "2026-10-27T19:48:18.522049487Z",
  "resend_available_at": "2026-10-27T19:43:19.522049487Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667381155` → **200**

```json
{
  "phone": "+380667381155",
  "audience": "CLIENT",
  "code": "135868",
  "sent_at": "2026-10-27T19:43:18.523928498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99930cad-bda9-4e11-a27c-495d7093a95a",
  "code": "135868",
  "device_ref": "sandbox-19141"
}
```

```json
{
  "session_id": "fb7380f0-52f7-485d-bd5e-bc915dace6d2",
  "subject": {
    "type": "CLIENT",
    "id": "3c945e37-bd49-4e30-bd01-f0e07a9db01f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzk0NWUzNy1iZDQ5LTRlMzAtYmQwMS1mMGUwN2E5ZGIwMWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMDk4LCJpYXQiOjE3OTMxMzAxOTgsImp0aSI6IjFjODZlMzhhLTg4NGYtNDg0Ny05YWMxLTQyMmJiNGU1OGYyNyIsInNpZCI6ImZiNzM4MGYwLTUyZjctNDg1ZC1iZDVlLWJjOTE1ZGFjZTZkMiJ9.aTG-dJ0A8bzlbHT3-zWXvM2YfudCils47ICp4EecGCQ",
  "access_expires_at": "2026-10-27T19:58:18.575090366Z",
  "refresh_token": "exHNNAoMzvetCphYOvpZBL88Bh2snFoobZ9-Cl_HzMU",
  "refresh_expires_at": "2026-11-26T19:43:18.574660383Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e5689707-c131-40aa-b0d4-c27f6683393c",
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
  "id": "da56547c-f380-40c9-b950-37e1c71816c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T19:48:18.606282Z",
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
  "command_id": "e8bcb5f9-53a8-445f-a251-8bbe5b550f5c",
  "quote_id": "da56547c-f380-40c9-b950-37e1c71816c2",
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
  "id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3c945e37-bd49-4e30-bd01-f0e07a9db01f",
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
  "created_at": "2026-10-27T19:43:18.63937Z",
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
    "id": "41ef772b-f83e-455e-b064-73f91e51d70a",
    "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
    "expires_at": "2026-10-27T19:43:33.642305Z",
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

`POST /api/driver/v1/offers/41ef772b-f83e-455e-b064-73f91e51d70a/accept` → **200**

```json
{
  "command_id": "0f5dd1d5-6a70-429b-b535-929f0b3fe29a"
}
```

```json
{
  "id": "8c61603d-9f8a-42a2-bcfb-3a41e12da0d0",
  "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0190fefb-620c-4119-90eb-10ef45ef74e6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0190fefb-620c-4119-90eb-10ef45ef74e6",
  "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
  "assignment_id": "8c61603d-9f8a-42a2-bcfb-3a41e12da0d0",
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

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:18Z",
    "sequence": 1793130198735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:18.752Z",
  "last_location_at": "2026-10-27T19:43:18.752Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0190fefb-620c-4119-90eb-10ef45ef74e6/arrive` → **200**

```json
{
  "command_id": "7aaf304d-9ba8-4eac-8f14-d31b172dd4ed",
  "expected_version": 0
}
```

```json
{
  "id": "0190fefb-620c-4119-90eb-10ef45ef74e6",
  "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
  "assignment_id": "8c61603d-9f8a-42a2-bcfb-3a41e12da0d0",
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
  "arrived_at": "2026-10-27T19:43:18.783456Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0190fefb-620c-4119-90eb-10ef45ef74e6/start` → **200**

```json
{
  "command_id": "eb218c62-9f8e-4d3f-81c0-b0546be7e9a5",
  "expected_version": 1
}
```

```json
{
  "id": "0190fefb-620c-4119-90eb-10ef45ef74e6",
  "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
  "assignment_id": "8c61603d-9f8a-42a2-bcfb-3a41e12da0d0",
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
  "arrived_at": "2026-10-27T19:43:18.783456Z",
  "started_at": "2026-10-27T19:43:18.817238Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:18Z",
    "sequence": 1793130198839
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:18.856243Z",
  "last_location_at": "2026-10-27T19:43:18.856243Z",
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
  "device_ref": "sandbox-29060"
}
```

```json
{
  "challenge_id": "c83291ac-9cf4-4723-9f8f-45db22178d60",
  "expires_at": "2026-10-27T19:48:18.879598761Z",
  "resend_available_at": "2026-10-27T19:43:19.879598761Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "870911",
  "sent_at": "2026-10-27T19:43:18.881518929Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c83291ac-9cf4-4723-9f8f-45db22178d60",
  "code": "870911",
  "device_ref": "sandbox-29060"
}
```

```json
{
  "session_id": "8b988a49-f3ef-461f-94ef-3bb2eb870b33",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTA5OCwiaWF0IjoxNzkzMTMwMTk4LCJqdGkiOiI4ODM0Y2U1ZS0zY2FkLTRlZjYtYjliYi1lMGRhNWRmYmYwM2UiLCJzaWQiOiI4Yjk4OGE0OS1mM2VmLTQ2MWYtOTRlZi0zYmIyZWI4NzBiMzMifQ.umhUKMy8e3tOdEpla1xotIkwRNOw8SsnHNWE--JWxHE",
  "access_expires_at": "2026-10-27T19:58:18.93072753Z",
  "refresh_token": "HKvhAh37TmLmH8l2z_jJDxFnVQAvocBXORsNYNmXTvA",
  "refresh_expires_at": "2026-11-26T19:43:18.930240124Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:42:55.281574Z",
  "last_location_at": "2026-10-27T19:42:55.281574Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e6ca2e2a-0abb-4dad-8e63-58b2beb1becd/handover` → **200**

```json
{
  "command_id": "7307d158-2ee5-4df4-9532-df1fa87871ff",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:42:55.281574Z",
  "last_location_at": "2026-10-27T19:42:55.281574Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e6ca2e2a-0abb-4dad-8e63-58b2beb1becd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:19Z",
    "sequence": 1793130199290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:43:19.019896Z",
  "last_location_at": "2026-10-27T19:43:19.019896Z",
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
  "session_id": "7af41fda-5972-44ec-be8b-7a51ebe4b31a",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwOTksImlhdCI6MTc5MzEzMDE5OSwianRpIjoiOWVlZWYwODAtMGM5YS00NWVkLWI0ZGQtMGYzMjE0MzMxZWYxIiwic2lkIjoiN2FmNDFmZGEtNTk3Mi00NGVjLWJlOGItN2E1MWViZTRiMzFhIn0.qJX07n3dxPyMTPgCoavDRcGDe2y3we-8_GAH2QK_TyI",
  "access_expires_at": "2026-10-27T19:58:19.252268547Z",
  "refresh_token": "n67_smShSbGXg31zzGs3L2GAHx5pD_Ah2NfnDiTYKxw",
  "refresh_expires_at": "2026-10-28T07:43:19.251855033Z",
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
  "session_id": "6a31b8e2-8901-4f5f-9ced-7e8bfbe82d8a",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzEwOTksImlhdCI6MTc5MzEzMDE5OSwianRpIjoiMjZjYTE4OTgtZDBmOC00NmM2LWEyYjQtOTc5ZDJiZjcyODM3Iiwic2lkIjoiNmEzMWI4ZTItODkwMS00ZjVmLTljZWQtN2U4YmZiZTgyZDhhIn0.ULfwQtH9qaiCyuwA0YX4zL-QN0W9uztTs4CLJq24iPA",
  "access_expires_at": "2026-10-27T19:58:19.485059377Z",
  "refresh_token": "oGiRt5O3cNnOj2jNfxsNiAKy3eE7KwlB3jwuEoYZdvk",
  "refresh_expires_at": "2026-10-28T07:43:19.484678292Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5c175dc5-de3f-4f95-8b39-45a040ac00fb` → **200**

```json
{
  "id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3c945e37-bd49-4e30-bd01-f0e07a9db01f",
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
    "id": "8c61603d-9f8a-42a2-bcfb-3a41e12da0d0",
    "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0190fefb-620c-4119-90eb-10ef45ef74e6",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T19:43:18.63937Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5c175dc5-de3f-4f95-8b39-45a040ac00fb/interrupt` → **200**

```json
{
  "command_id": "a0d61d75-34db-4dfd-9153-6d995530cf2b",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "3c945e37-bd49-4e30-bd01-f0e07a9db01f",
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
      "id": "8c61603d-9f8a-42a2-bcfb-3a41e12da0d0",
      "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "0190fefb-620c-4119-90eb-10ef45ef74e6",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T19:43:18.63937Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "630a1a6c-0286-4d33-aba8-923e208fe308",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "3c945e37-bd49-4e30-bd01-f0e07a9db01f",
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
    "id": "0df16e3b-ccfc-4310-992b-7043e28b5dcf",
    "order_id": "630a1a6c-0286-4d33-aba8-923e208fe308",
    "expires_at": "2026-10-27T19:43:34.558925Z",
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

`POST /api/driver/v1/offers/0df16e3b-ccfc-4310-992b-7043e28b5dcf/accept` → **200**

```json
{
  "command_id": "da99f26a-dd11-465f-b1ef-37e2d3979350"
}
```

```json
{
  "id": "99ffac12-820c-42a0-9d27-d7308a84439a",
  "order_id": "630a1a6c-0286-4d33-aba8-923e208fe308",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b7fac18a-9095-40c5-95dd-ff92f2f59a1d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b7fac18a-9095-40c5-95dd-ff92f2f59a1d",
  "order_id": "630a1a6c-0286-4d33-aba8-923e208fe308",
  "assignment_id": "99ffac12-820c-42a0-9d27-d7308a84439a",
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
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:43:19.019896Z",
  "last_location_at": "2026-10-27T19:43:19.019896Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/e6ca2e2a-0abb-4dad-8e63-58b2beb1becd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:19Z",
    "sequence": 1793130199676
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:43:19.692949Z",
  "last_location_at": "2026-10-27T19:43:19.692949Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b7fac18a-9095-40c5-95dd-ff92f2f59a1d/arrive` → **200**

```json
{
  "command_id": "6340d3bc-20bf-466d-bb6f-0bc21a696976",
  "expected_version": 0
}
```

```json
{
  "id": "b7fac18a-9095-40c5-95dd-ff92f2f59a1d",
  "order_id": "630a1a6c-0286-4d33-aba8-923e208fe308",
  "assignment_id": "99ffac12-820c-42a0-9d27-d7308a84439a",
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
  "arrived_at": "2026-10-27T19:43:19.72588Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b7fac18a-9095-40c5-95dd-ff92f2f59a1d/start` → **200**

```json
{
  "command_id": "57e446bb-7099-4032-8027-8c337a718231",
  "expected_version": 1
}
```

```json
{
  "id": "b7fac18a-9095-40c5-95dd-ff92f2f59a1d",
  "order_id": "630a1a6c-0286-4d33-aba8-923e208fe308",
  "assignment_id": "99ffac12-820c-42a0-9d27-d7308a84439a",
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
  "arrived_at": "2026-10-27T19:43:19.72588Z",
  "started_at": "2026-10-27T19:43:19.760514Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b7fac18a-9095-40c5-95dd-ff92f2f59a1d/complete` → **200**

```json
{
  "command_id": "9e4543ea-f014-44d1-bd16-0d2ce4c43f7b",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:43:19Z"
}
```

```json
{
  "id": "b7fac18a-9095-40c5-95dd-ff92f2f59a1d",
  "order_id": "630a1a6c-0286-4d33-aba8-923e208fe308",
  "assignment_id": "99ffac12-820c-42a0-9d27-d7308a84439a",
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
  "arrived_at": "2026-10-27T19:43:19.72588Z",
  "started_at": "2026-10-27T19:43:19.760514Z",
  "completed_at": "2026-10-27T19:43:19.797921Z",
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
    "id": "630a1a6c-0286-4d33-aba8-923e208fe308",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:43:19.55091Z",
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
    "id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:43:18.63937Z",
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
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
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

`GET /api/operator/v1/orders/5c175dc5-de3f-4f95-8b39-45a040ac00fb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:43:18.640036Z",
      "actor": {
        "type": "CLIENT",
        "id": "3c945e37-bd49-4e30-bd01-f0e07a9db01f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
        "quote_id": "da56547c-f380-40c9-b950-37e1c71816c2",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:43:18.64154Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
        "attempt_id": "8dce1820-c096-4d08-a380-eeaebaf655ae",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:43:18.646045Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "41ef772b-f83e-455e-b064-73f91e51d70a",
        "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:43:18.69853Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "41ef772b-f83e-455e-b064-73f91e51d70a",
        "order_id": "5c175dc5-de3f-4f95-8b39-45a040ac00fb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8c61603d-9f8a-42a2-bcfb-3a41e12da0d0"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 5c175dc5-de3f-4f95-8b39-45a040ac00fb, follow-up 630a1a6c-0286-4d33-aba8-923e208fe308.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-13184"
}
```

```json
{
  "challenge_id": "88c415b5-a06c-41a8-b64d-292003e7946e",
  "expires_at": "2026-10-27T19:48:22.910341096Z",
  "resend_available_at": "2026-10-27T19:43:23.910341096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "019864",
  "sent_at": "2026-10-27T19:43:22.912173211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88c415b5-a06c-41a8-b64d-292003e7946e",
  "code": "019864",
  "device_ref": "sandbox-13184"
}
```

```json
{
  "session_id": "4a1e026f-0786-45bb-b155-0947ee7ade1a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTEwMiwiaWF0IjoxNzkzMTMwMjAyLCJqdGkiOiJiYmEzZmQ1Zi1jOTUzLTQyZDEtYWRhNy1jMWU0OGRlNDM5OTMiLCJzaWQiOiI0YTFlMDI2Zi0wNzg2LTQ1YmItYjE1NS0wOTQ3ZWU3YWRlMWEifQ.2_mjsKmAyHkgF1xSwXnB8gNQmNeeVgpdQRg41t1A3eM",
  "access_expires_at": "2026-10-27T19:58:22.961276075Z",
  "refresh_token": "8MGk3AqcdUbOMIdIcgviLwD7nxOzQ2yxNgsP06N6OH4",
  "refresh_expires_at": "2026-11-26T19:43:22.96086216Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:43:19.692949Z",
  "last_location_at": "2026-10-27T19:43:19.692949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6ca2e2a-0abb-4dad-8e63-58b2beb1becd/handover` → **200**

```json
{
  "command_id": "3142e7d5-09f4-43d3-a24b-4a9ffe3af0d6",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:43:19.692949Z",
  "last_location_at": "2026-10-27T19:43:19.692949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6ca2e2a-0abb-4dad-8e63-58b2beb1becd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:23Z",
    "sequence": 1793130203360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:43:23.052212Z",
  "last_location_at": "2026-10-27T19:43:23.052212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670862951",
  "device_ref": "sandbox-28156"
}
```

```json
{
  "challenge_id": "d96d18af-7b18-4d74-a9ec-9f305261f9c2",
  "expires_at": "2026-10-27T19:48:23.076527066Z",
  "resend_available_at": "2026-10-27T19:43:24.076527066Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670862951` → **200**

```json
{
  "phone": "+380670862951",
  "audience": "CLIENT",
  "code": "554703",
  "sent_at": "2026-10-27T19:43:23.078462106Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d96d18af-7b18-4d74-a9ec-9f305261f9c2",
  "code": "554703",
  "device_ref": "sandbox-28156"
}
```

```json
{
  "session_id": "cb287f84-007d-4daa-bd96-8d5766e92676",
  "subject": {
    "type": "CLIENT",
    "id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTZiMWE4YS0yYWZiLTQwZDgtYjk1YS05YzEzMmU2MTM4YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMTAzLCJpYXQiOjE3OTMxMzAyMDMsImp0aSI6IjRlODM1MGY0LTk3ZjUtNDFhMS05MWI0LWE5ZmU1MGFiYjcxYSIsInNpZCI6ImNiMjg3Zjg0LTAwN2QtNGRhYS1iZDk2LThkNTc2NmU5MjY3NiJ9.ZajrPRKqwl63cVBxPwkmc_u5I2DPnpL_qHxDXv16FrI",
  "access_expires_at": "2026-10-27T19:58:23.128733954Z",
  "refresh_token": "tlmHyMZ5tb5OIGcnkEs83-8KV2yEqGfWpzMp_Wt9dOs",
  "refresh_expires_at": "2026-11-26T19:43:23.128285977Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7bc58f02-7046-439f-b34a-95232f1eb103",
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
  "id": "1ba1fe11-e545-4d44-ae31-35c9332f5e31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:48:23.160675Z",
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
  "command_id": "2bbb97ac-f5cc-4310-b23b-18f10a56681a",
  "quote_id": "1ba1fe11-e545-4d44-ae31-35c9332f5e31",
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
    "phone": "+380678402269"
  }
}
```

```json
{
  "id": "afaadec6-c68c-4067-a762-31c84a8db65c",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:43:23.195175Z",
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
    "id": "92820ec1-6c37-4b8f-bc07-8708faad1c3c",
    "order_id": "afaadec6-c68c-4067-a762-31c84a8db65c",
    "expires_at": "2026-10-27T19:43:38.197935Z",
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

`POST /api/driver/v1/offers/92820ec1-6c37-4b8f-bc07-8708faad1c3c/accept` → **200**

```json
{
  "command_id": "4ee7eabb-116e-4a11-9a1f-903fcb6d6a15"
}
```

```json
{
  "id": "ec8de738-9569-46c3-802b-706fa352a631",
  "order_id": "afaadec6-c68c-4067-a762-31c84a8db65c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f342bdbf-11b6-46d2-a644-9b49bf7e94ad",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f342bdbf-11b6-46d2-a644-9b49bf7e94ad",
  "order_id": "afaadec6-c68c-4067-a762-31c84a8db65c",
  "assignment_id": "ec8de738-9569-46c3-802b-706fa352a631",
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
    "phone": "+380678402269"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dad6ae1d-dcb4-492b-bb31-57ed57fc4670",
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
  "id": "b5587f73-30ff-4c09-8d36-e7aaf78c5458",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:48:23.328456Z",
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
  "command_id": "75d020d9-0230-4ea8-a141-051a2f8689c4",
  "quote_id": "b5587f73-30ff-4c09-8d36-e7aaf78c5458",
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
  "id": "08b2983a-93a5-4906-a008-323abf113488",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:43:23.365896Z",
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
  "command_id": "cae1fdae-855c-429b-99fe-da6ed72159f4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T22:43:23Z"
}
```

```json
{
  "id": "050513a8-fde5-4839-8967-a881e39aec6a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:48:23.415263Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:43:23Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5798b24f-6007-4d21-b747-37b633e04cff",
  "quote_id": "050513a8-fde5-4839-8967-a881e39aec6a",
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
  "pickup_at": "2026-10-27T22:43:23Z"
}
```

```json
{
  "id": "8a6a6ea1-30ff-4780-9f5d-165c7c28c0c4",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:43:23.453941Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:43:23Z",
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
  "command_id": "ceee1bf8-f947-4ec1-a379-b7aa3c9e67bd",
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
  "id": "eecad539-fd93-4906-bca3-6caea7b026ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:48:23.492006Z",
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
  "command_id": "877c99b6-7712-462a-931e-da3b98397a3a",
  "quote_id": "eecad539-fd93-4906-bca3-6caea7b026ff",
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
  "correlation_id": "5b624dae-7a92-4b88-8166-7c61cc6a3511"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "8a6a6ea1-30ff-4780-9f5d-165c7c28c0c4",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-27T19:43:23.453941Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T22:43:23Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "08b2983a-93a5-4906-a008-323abf113488",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-27T19:43:23.365896Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "afaadec6-c68c-4067-a762-31c84a8db65c",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "08b2983a-93a5-4906-a008-323abf113488",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:43:23.365896Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/afaadec6-c68c-4067-a762-31c84a8db65c` → **200**

```json
{
  "id": "afaadec6-c68c-4067-a762-31c84a8db65c",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "ec8de738-9569-46c3-802b-706fa352a631",
    "order_id": "afaadec6-c68c-4067-a762-31c84a8db65c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f342bdbf-11b6-46d2-a644-9b49bf7e94ad",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T19:43:23.195175Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/afaadec6-c68c-4067-a762-31c84a8db65c/cancel` → **200**

```json
{
  "command_id": "a60c5a82-4a33-477c-a261-9d49e4a64adc",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "afaadec6-c68c-4067-a762-31c84a8db65c",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
    "id": "ec8de738-9569-46c3-802b-706fa352a631",
    "order_id": "afaadec6-c68c-4067-a762-31c84a8db65c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f342bdbf-11b6-46d2-a644-9b49bf7e94ad",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:43:23.195175Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/08b2983a-93a5-4906-a008-323abf113488` → **200**

```json
{
  "id": "08b2983a-93a5-4906-a008-323abf113488",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:43:23.365896Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/08b2983a-93a5-4906-a008-323abf113488/cancel` → **200**

```json
{
  "command_id": "01837394-b408-4c11-8cfb-bf4443fab77d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "08b2983a-93a5-4906-a008-323abf113488",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:43:23.365896Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/8a6a6ea1-30ff-4780-9f5d-165c7c28c0c4` → **200**

```json
{
  "id": "8a6a6ea1-30ff-4780-9f5d-165c7c28c0c4",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:43:23.453941Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:43:23Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/8a6a6ea1-30ff-4780-9f5d-165c7c28c0c4/cancel` → **200**

```json
{
  "command_id": "2de56a58-eb9b-4fe0-86d5-f647f88e84e9",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8a6a6ea1-30ff-4780-9f5d-165c7c28c0c4",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ce6b1a8a-2afb-40d8-b95a-9c132e6138b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T19:43:23.453941Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-27T22:43:23Z",
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
  "session_id": "e6ca2e2a-0abb-4dad-8e63-58b2beb1becd",
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
  "last_heartbeat_at": "2026-10-27T19:43:23.052212Z",
  "last_location_at": "2026-10-27T19:43:23.052212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6ca2e2a-0abb-4dad-8e63-58b2beb1becd/close` → **200**

```json
{
  "command_id": "035a403c-720b-49ad-91a8-227cd05d3ede",
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

Done: orders afaadec6-c68c-4067-a762-31c84a8db65c, 08b2983a-93a5-4906-a008-323abf113488, 8a6a6ea1-30ff-4780-9f5d-165c7c28c0c4.

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
  "session_id": "99ce2ca7-8ad3-4939-831c-0a80466645ab",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMDQsImlhdCI6MTc5MzEzMDIwNCwianRpIjoiODZmMGVkMzQtMTY4NC00YmY4LWEyZTItNGFkZTRhZDNjYjNhIiwic2lkIjoiOTljZTJjYTctOGFkMy00OTM5LTgzMWMtMGE4MDQ2NjY0NWFiIn0.W-7rumtnRsF3eVnRG67sRW4V8z308G2_3ZpJnPmkPUM",
  "access_expires_at": "2026-10-27T19:58:24.036761142Z",
  "refresh_token": "DBWqKHh_uA2bWQp_qT_-ELw7HBH3_dEYgnwgRa6FJsA",
  "refresh_expires_at": "2026-10-28T07:43:24.036390312Z",
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
  "session_id": "360c5350-5f14-4a12-b574-7da644819abc",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMDQsImlhdCI6MTc5MzEzMDIwNCwianRpIjoiZjVjZWQ3ZTEtNGM3NS00Y2E4LTg0NzktNzNhMTYyYjhkMTRhIiwic2lkIjoiMzYwYzUzNTAtNWYxNC00YTEyLWI1NzQtN2RhNjQ0ODE5YWJjIn0.ucZuWl4BRQ5eGHUfFJHeeGk9SOu0v6hAxPaAtkwr0zk",
  "access_expires_at": "2026-10-27T19:58:24.266414634Z",
  "refresh_token": "dtxmBKcGDdEfmbUdqFx5zy9u-t0g_OxTFYeS2yKHXYo",
  "refresh_expires_at": "2026-10-28T07:43:24.265998605Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13068"
}
```

```json
{
  "challenge_id": "c78fcae8-02e5-4979-882f-ceb7d6a90af2",
  "expires_at": "2026-10-27T19:48:24.287643451Z",
  "resend_available_at": "2026-10-27T19:43:25.287643451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "676318",
  "sent_at": "2026-10-27T19:43:24.289331198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c78fcae8-02e5-4979-882f-ceb7d6a90af2",
  "code": "676318",
  "device_ref": "sandbox-13068"
}
```

```json
{
  "session_id": "f679f64f-fbae-4110-90e9-ede402b5f402",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTEwNCwiaWF0IjoxNzkzMTMwMjA0LCJqdGkiOiJkOTAyZDI5NS02NGZiLTRkMTUtOWFkNy01ZWZhZjkyMDcwN2IiLCJzaWQiOiJmNjc5ZjY0Zi1mYmFlLTQxMTAtOTBlOS1lZGU0MDJiNWY0MDIifQ.wqz8-T2VpCm0wbt-hvBYGlHT_SK7vV6H2JtrdGdoCpk",
  "access_expires_at": "2026-10-27T19:58:24.339742837Z",
  "refresh_token": "EKwKoOcQqWRIXeTyttvenaBaSxP_mFonRd4wGQ_exoo",
  "refresh_expires_at": "2026-11-26T19:43:24.339311456Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:18.856243Z",
  "last_location_at": "2026-10-27T19:43:18.856243Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/handover` → **200**

```json
{
  "command_id": "f6583449-a879-4b13-842c-771badf16edb",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:18.856243Z",
  "last_location_at": "2026-10-27T19:43:18.856243Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:24Z",
    "sequence": 1793130204413
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:24.429633Z",
  "last_location_at": "2026-10-27T19:43:24.429633Z",
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
  "command_id": "1212efb2-9add-4781-9255-247caa51d8a1",
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
  "effective_at": "2026-10-27T19:43:24.499533Z",
  "changed_by": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T19:43:24.527570797Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ae457ac8-e389-4655-bf16-357f8cb267e4",
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
  "id": "63d2d1ef-7f83-40a9-979c-251d18f62685",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:48:24.563699Z",
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
  "command_id": "d5f7e325-1ae2-4ae4-b21c-e79b2418a961",
  "quote_id": "63d2d1ef-7f83-40a9-979c-251d18f62685",
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
    "phone": "+380671113551"
  }
}
```

```json
{
  "id": "d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3",
  "short_number": 11,
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
  "created_at": "2026-10-27T19:43:24.605905Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113551"
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
    "id": "d65c51a7-1024-4c14-8bfd-6e7ba347afa6",
    "order_id": "d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3",
    "expires_at": "2026-10-27T19:43:39.609593Z",
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

`POST /api/driver/v1/offers/d65c51a7-1024-4c14-8bfd-6e7ba347afa6/accept` → **200**

```json
{
  "command_id": "2a38ed48-9cb0-43a2-97f0-7197b3ad5783"
}
```

```json
{
  "id": "adcb37c1-fb92-4172-9972-6e6f7c268abd",
  "order_id": "d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d7ffffc5-8ac6-49f4-81ba-1f43ad9cc143",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d7ffffc5-8ac6-49f4-81ba-1f43ad9cc143",
  "order_id": "d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3",
  "assignment_id": "adcb37c1-fb92-4172-9972-6e6f7c268abd",
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
    "phone": "+380671113551"
  }
}
```

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:24Z",
    "sequence": 1793130204703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:24.719819Z",
  "last_location_at": "2026-10-27T19:43:24.719819Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d7ffffc5-8ac6-49f4-81ba-1f43ad9cc143/arrive` → **200**

```json
{
  "command_id": "bffd77c1-6b78-463a-80ea-2fefbaaf8709",
  "expected_version": 0
}
```

```json
{
  "id": "d7ffffc5-8ac6-49f4-81ba-1f43ad9cc143",
  "order_id": "d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3",
  "assignment_id": "adcb37c1-fb92-4172-9972-6e6f7c268abd",
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
  "arrived_at": "2026-10-27T19:43:24.751141Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113551"
  }
}
```

`POST /api/driver/v1/trips/d7ffffc5-8ac6-49f4-81ba-1f43ad9cc143/start` → **200**

```json
{
  "command_id": "ca52baec-505f-482d-9339-42290755ef84",
  "expected_version": 1
}
```

```json
{
  "id": "d7ffffc5-8ac6-49f4-81ba-1f43ad9cc143",
  "order_id": "d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3",
  "assignment_id": "adcb37c1-fb92-4172-9972-6e6f7c268abd",
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
  "arrived_at": "2026-10-27T19:43:24.751141Z",
  "started_at": "2026-10-27T19:43:24.783707Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113551"
  }
}
```

`POST /api/driver/v1/trips/d7ffffc5-8ac6-49f4-81ba-1f43ad9cc143/complete` → **200**

```json
{
  "command_id": "01b07d20-cd26-4b99-871c-75f5c20c4c29",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:43:24Z",
  "cash_received": true
}
```

```json
{
  "id": "d7ffffc5-8ac6-49f4-81ba-1f43ad9cc143",
  "order_id": "d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3",
  "assignment_id": "adcb37c1-fb92-4172-9972-6e6f7c268abd",
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
  "arrived_at": "2026-10-27T19:43:24.751141Z",
  "started_at": "2026-10-27T19:43:24.783707Z",
  "completed_at": "2026-10-27T19:43:24.819732Z",
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
  "command_id": "fa067354-5c9a-41d0-8bdd-8f177368389d",
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
  "id": "d5aaea74-fe6d-4748-8723-1bfe883096ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:48:24.869266Z",
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
  "command_id": "dc637d58-a8a3-400c-b8e1-dd7447794fc5",
  "quote_id": "d5aaea74-fe6d-4748-8723-1bfe883096ed",
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
    "phone": "+3806711124720"
  }
}
```

```json
{
  "id": "8c9baabd-8046-4ef8-9844-dc9925a96400",
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
  "created_at": "2026-10-27T19:43:24.925488Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124720"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8c9baabd-8046-4ef8-9844-dc9925a96400` → **200**

```json
{
  "id": "8c9baabd-8046-4ef8-9844-dc9925a96400",
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
  "created_at": "2026-10-27T19:43:24.925488Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124720"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8c9baabd-8046-4ef8-9844-dc9925a96400/cancel` → **200**

```json
{
  "command_id": "f4947885-80a8-4fc3-af40-a3d91c65748f",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "8c9baabd-8046-4ef8-9844-dc9925a96400",
  "short_number": 12,
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
  "created_at": "2026-10-27T19:43:24.925488Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124720"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error",
      "uk": "Помилка оператора"
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
  "staff_id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T19:43:24.823081Z",
  "last_entries": [
    {
      "order_id": "8c9baabd-8046-4ef8-9844-dc9925a96400",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T19:43:24.989109Z"
    },
    {
      "order_id": "d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T19:43:24.823081Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e808e2a-4ad7-41ee-b7d4-37910cfc89ad",
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
  "last_heartbeat_at": "2026-10-27T19:43:24.719819Z",
  "last_location_at": "2026-10-27T19:43:24.719819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e808e2a-4ad7-41ee-b7d4-37910cfc89ad/close` → **200**

```json
{
  "command_id": "efc83365-ee98-40f7-8530-2e71cfe366e5",
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

Done: operator bonus for fulfilled d59d8ed3-cc9a-4930-8bb3-a9d56aab6cb3 and operator-fault cancellation 8c9baabd-8046-4ef8-9844-dc9925a96400.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676237933",
  "device_ref": "sandbox-2792"
}
```

```json
{
  "challenge_id": "2c419725-8f56-478a-9c56-cbb249b1a515",
  "expires_at": "2026-10-27T19:48:27.117596593Z",
  "resend_available_at": "2026-10-27T19:43:28.117596593Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676237933` → **200**

```json
{
  "phone": "+380676237933",
  "audience": "CLIENT",
  "code": "494156",
  "sent_at": "2026-10-27T19:43:27.119802657Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678283188",
  "device_ref": "sandbox-17603",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a4caf992-3626-44a5-b237-2555ee558062",
  "expires_at": "2026-10-27T19:48:27.166758691Z",
  "resend_available_at": "2026-10-27T19:43:28.166758691Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678283188` → **200**

```json
{
  "phone": "+380678283188",
  "audience": "CLIENT",
  "code": "361211",
  "sent_at": "2026-10-27T19:43:27.16842156Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674610000",
  "device_ref": "sandbox-19279"
}
```

```json
{
  "challenge_id": "d9bfdaaf-99a6-498d-b310-d48b3291a26e",
  "expires_at": "2026-10-27T19:48:27.21302944Z",
  "resend_available_at": "2026-10-27T19:43:28.21302944Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674610000` → **200**

```json
{
  "phone": "+380674610000",
  "audience": "CLIENT",
  "code": "970064",
  "sent_at": "2026-10-27T19:43:27.215156981Z",
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
  "session_id": "5ac19fe0-f477-44e3-9958-768cff9a54af",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMDcsImlhdCI6MTc5MzEzMDIwNywianRpIjoiMzgwZjZjNzEtZDY2YS00NWU4LWFlMGEtZTU0MDE2MmQ5N2U3Iiwic2lkIjoiNWFjMTlmZTAtZjQ3Ny00NGUzLTk5NTgtNzY4Y2ZmOWE1NGFmIn0.9DSiMbOZi4f5vPa4cOw5Ks4hAprjImlTkyEv_uDkCH4",
  "access_expires_at": "2026-10-27T19:58:27.467035658Z",
  "refresh_token": "8mJWlSVRi3tC-paxNGWNefZInouAwG1lddFwh50J7Lo",
  "refresh_expires_at": "2026-10-28T07:43:27.466697358Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674610000` → **200**

```json
{
  "deliveries": [
    {
      "id": "44b2671d-65f0-423f-9542-384155355738",
      "challenge_id": "d9bfdaaf-99a6-498d-b310-d48b3291a26e",
      "phone": "+380674610000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4fa6760c-88f3-4b63-bb4c-207e1e1d073c",
      "error": null,
      "attempted_at": "2026-10-27T19:43:27.215371Z"
    },
    {
      "id": "0e1f2748-677c-4339-ac0d-8ac94176b7f1",
      "challenge_id": "d9bfdaaf-99a6-498d-b310-d48b3291a26e",
      "phone": "+380674610000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-27T19:43:27.214749Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674610000` → **200**

```json
{
  "phone": "+380674610000",
  "audience": "CLIENT",
  "code": "970064",
  "sent_at": "2026-10-27T19:43:27.215156981Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678283188` → **200**

```json
{
  "deliveries": [
    {
      "id": "b6d75112-909a-473d-a65d-b0130155ec00",
      "challenge_id": "a4caf992-3626-44a5-b237-2555ee558062",
      "phone": "+380678283188",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0e62c26c-5f38-4af7-8885-6c02db878062",
      "error": null,
      "attempted_at": "2026-10-27T19:43:27.168697Z"
    }
  ]
}
```

Done: SMS to +380676237933, a call to +380678283188, SMS then a call to +380674610000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630519411",
  "device_ref": "sandbox-29655"
}
```

```json
{
  "challenge_id": "5059609b-9458-4d5e-b9c6-838a9c14ec50",
  "expires_at": "2026-10-27T19:48:27.582324342Z",
  "resend_available_at": "2026-10-27T19:43:28.582324342Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630519411` → **200**

```json
{
  "phone": "+380630519411",
  "audience": "CLIENT",
  "code": "073948",
  "sent_at": "2026-10-27T19:43:27.583997461Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5059609b-9458-4d5e-b9c6-838a9c14ec50",
  "code": "073948",
  "device_ref": "sandbox-29655"
}
```

```json
{
  "session_id": "661a1887-9037-41db-a82f-3cfb8f9aeb23",
  "subject": {
    "type": "CLIENT",
    "id": "5623463b-f5e0-4c5f-9d42-455451cae459"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NjIzNDYzYi1mNWUwLTRjNWYtOWQ0Mi00NTU0NTFjYWU0NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMTA3LCJpYXQiOjE3OTMxMzAyMDcsImp0aSI6IjY3OWFmNTY5LTU1MzktNDg2Yi1hMDQ3LWVlMmI4NGFiYjU2YyIsInNpZCI6IjY2MWExODg3LTkwMzctNDFkYi1hODJmLTNjZmI4ZjlhZWIyMyJ9.XV_TeToHAtJmZoD1gTR1BiUVMWTGu7V7BRTEnMu0rTM",
  "access_expires_at": "2026-10-27T19:58:27.632601983Z",
  "refresh_token": "PvC8L-1TsM2SgaS37-IaI2s2kEtgjicjaAxJqsPDiAc",
  "refresh_expires_at": "2026-11-26T19:43:27.632263552Z",
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
  "session_id": "2a19e66c-0a96-4738-9dfb-9b4c3a488166",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMDcsImlhdCI6MTc5MzEzMDIwNywianRpIjoiZjlhYmYyMWUtNGEzYi00OGU2LTk0NzEtNDUyMzM3ZDcxOTU0Iiwic2lkIjoiMmExOWU2NmMtMGE5Ni00NzM4LTlkZmItOWI0YzNhNDg4MTY2In0.jIBiqf7900dr5LT9lEAlgwnUX809qlt44m7KIBe3A-4",
  "access_expires_at": "2026-10-27T19:58:27.940207705Z",
  "refresh_token": "OeSCAwk30BEwyUGCgWvjY13nDJSkvIw0379joQimrbk",
  "refresh_expires_at": "2026-10-28T07:43:27.939818388Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630519411` → **200**

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
  "correlation_id": "b9af59a5-b1ce-4baf-a4a6-9603e3faffa2"
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
  "session_id": "08e0e307-dc93-467a-903a-bcdda054e4e4",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMDgsImlhdCI6MTc5MzEzMDIwOCwianRpIjoiYmM5Zjg4MTktODVkMi00Y2JlLThjMDktYTRlMTUxOWIyYjNhIiwic2lkIjoiMDhlMGUzMDctZGM5My00NjdhLTkwM2EtYmNkZGEwNTRlNGU0In0.4WRXkIPBtDkTKOwgKPZqmKeRXb2mONQT5Ja5QHOJ68k",
  "access_expires_at": "2026-10-27T19:58:28.235560977Z",
  "refresh_token": "IINY07nC9EAEo-4U_Ka_hraMdyM5nkxC2J0mvJcUlsU",
  "refresh_expires_at": "2026-10-28T07:43:28.235134233Z",
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
  "command_id": "2df74b8b-3f9b-476d-9846-e2814db26a7a",
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
  "changed_by": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T19:43:28.296702099Z"
}
```

## The rider books the airport for 2026-10-27T22:43:28Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600101389",
  "device_ref": "sandbox-11526"
}
```

```json
{
  "challenge_id": "d7affd91-aff1-4b72-a328-457e8fc27e39",
  "expires_at": "2026-10-27T19:48:28.32428438Z",
  "resend_available_at": "2026-10-27T19:43:29.32428438Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600101389` → **200**

```json
{
  "phone": "+48600101389",
  "audience": "CLIENT",
  "code": "336848",
  "sent_at": "2026-10-27T19:43:28.326215734Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7affd91-aff1-4b72-a328-457e8fc27e39",
  "code": "336848",
  "device_ref": "sandbox-11526"
}
```

```json
{
  "session_id": "8edcdd1c-4ae1-4036-acea-0267f098d776",
  "subject": {
    "type": "CLIENT",
    "id": "c33d1513-2166-4780-abd1-da2960d44401"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzNkMTUxMy0yMTY2LTQ3ODAtYWJkMS1kYTI5NjBkNDQ0MDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMTA4LCJpYXQiOjE3OTMxMzAyMDgsImp0aSI6IjVhNjIzNTNkLWFmNTYtNGQ4Ni05ZjIyLWMxNzUzZmEzOTRlNSIsInNpZCI6IjhlZGNkZDFjLTRhZTEtNDAzNi1hY2VhLTAyNjdmMDk4ZDc3NiJ9.XnEG97QtBrMD7JUWHs31IOlo2CAXGuo4HM-lY7aUxYU",
  "access_expires_at": "2026-10-27T19:58:28.373426838Z",
  "refresh_token": "SJDj0snEFFdjjVFUAE5AKK7Jh3JHSkvteKL1BXyjcME",
  "refresh_expires_at": "2026-11-26T19:43:28.373005152Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f630a40-ded1-4079-8aaf-14b01e636c29",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T22:43:28Z"
}
```

```json
{
  "id": "0d7033c8-24aa-4f1b-b44c-2884685b001b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T19:48:28.403023Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:43:28Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "af0e3ecf-6511-4677-ad87-df82ae158482",
  "quote_id": "0d7033c8-24aa-4f1b-b44c-2884685b001b",
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
  "pickup_at": "2026-10-27T22:43:28Z"
}
```

```json
{
  "id": "fe375ac9-2a8f-405a-a2c3-9af7d03c7542",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c33d1513-2166-4780-abd1-da2960d44401",
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
  "created_at": "2026-10-27T19:43:28.432908Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:43:28Z",
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
  "device_ref": "sandbox-28028"
}
```

```json
{
  "challenge_id": "ff5c23a1-e9eb-44f8-a4df-7a16b63915a8",
  "expires_at": "2026-10-27T19:48:28.459319177Z",
  "resend_available_at": "2026-10-27T19:43:29.459319177Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "072205",
  "sent_at": "2026-10-27T19:43:28.461168052Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ff5c23a1-e9eb-44f8-a4df-7a16b63915a8",
  "code": "072205",
  "device_ref": "sandbox-28028"
}
```

```json
{
  "session_id": "bd96c4c5-2299-4373-ab27-39aeaf625353",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTEwOCwiaWF0IjoxNzkzMTMwMjA4LCJqdGkiOiIxOGNmZGVhZi0zMTIwLTQ5YTQtYmQ3My00YzQ4MjFiZjIyYTIiLCJzaWQiOiJiZDk2YzRjNS0yMjk5LTQzNzMtYWIyNy0zOWFlYWY2MjUzNTMifQ.Z5lErOtVBy9OeZsfDrwvBFhLeOB1XyCWHZAztTYHn54",
  "access_expires_at": "2026-10-27T19:58:28.506997456Z",
  "refresh_token": "WgFORdCjLW46vIZC3SSjKsK8K3LXgk0Hj__SJ1OXgek",
  "refresh_expires_at": "2026-11-26T19:43:28.506573366Z",
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
  "command_id": "c0505e9b-5b1b-4a32-a788-3898d24a0746",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:28Z",
    "sequence": 1793130208549
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "10a2882a-c33a-4615-ae52-6064028dc1f4",
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
  "last_heartbeat_at": "2026-10-27T19:43:28.564253Z",
  "last_location_at": "2026-10-27T19:43:28.564253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "fe375ac9-2a8f-405a-a2c3-9af7d03c7542",
      "short_number": 13,
      "pickup_at": "2026-10-27T22:43:28Z",
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

`POST /api/driver/v1/preorders/fe375ac9-2a8f-405a-a2c3-9af7d03c7542/reserve` → **200**

```json
{
  "command_id": "138d81af-d1d5-454c-8a9a-39e5545d95c4"
}
```

```json
{
  "id": "3890f693-3462-4bb1-a4c4-2db6172bc17d",
  "state": "RESERVED",
  "order": {
    "order_id": "fe375ac9-2a8f-405a-a2c3-9af7d03c7542",
    "short_number": 13,
    "pickup_at": "2026-10-27T22:43:28Z",
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
  "reserved_at": "2026-10-27T19:43:28.620174Z",
  "confirm_from": "2026-10-27T22:13:28Z",
  "confirm_until": "2026-10-27T22:23:28Z",
  "drop_until": "2026-10-27T21:43:28Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "3890f693-3462-4bb1-a4c4-2db6172bc17d",
      "state": "RESERVED",
      "order": {
        "order_id": "fe375ac9-2a8f-405a-a2c3-9af7d03c7542",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:43:28Z",
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
      "reserved_at": "2026-10-27T19:43:28.620174Z",
      "confirm_from": "2026-10-27T22:13:28Z",
      "confirm_until": "2026-10-27T22:23:28Z",
      "drop_until": "2026-10-27T21:43:28Z"
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
      "id": "3890f693-3462-4bb1-a4c4-2db6172bc17d",
      "state": "RESERVED",
      "order": {
        "order_id": "fe375ac9-2a8f-405a-a2c3-9af7d03c7542",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:43:28Z",
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
      "reserved_at": "2026-10-27T19:43:28.620174Z",
      "confirm_from": "2026-10-27T22:13:28Z",
      "confirm_until": "2026-10-27T22:23:28Z",
      "drop_until": "2026-10-27T21:43:28Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/3890f693-3462-4bb1-a4c4-2db6172bc17d/confirm` → **409**

```json
{
  "command_id": "f32d7153-11cb-4dc2-a81f-b49238a672ad"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/3890f693-3462-4bb1-a4c4-2db6172bc17d/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "18b6e93f-66b3-423b-a5f2-90561e61b508"
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
  "session_id": "aa3c067d-70e7-4f78-a582-50f0d7281c69",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMDgsImlhdCI6MTc5MzEzMDIwOCwianRpIjoiNzQ5NThmMGEtMDUyYy00NTVhLTk4MmEtNDVjYTU5NzZmMDZjIiwic2lkIjoiYWEzYzA2N2QtNzBlNy00Zjc4LWE1ODItNTBmMGQ3MjgxYzY5In0.1jwIwttfJSEc4QhfXS3ilqyqaa_UuvtLz6lJ0RK9Ek8",
  "access_expires_at": "2026-10-27T19:58:28.921463937Z",
  "refresh_token": "YdtG45Td_vk-KZT7P-xi0kO1pkBmSiCQPZW8hvZvQT8",
  "refresh_expires_at": "2026-10-28T07:43:28.921033799Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fe375ac9-2a8f-405a-a2c3-9af7d03c7542` → **200**

```json
{
  "id": "fe375ac9-2a8f-405a-a2c3-9af7d03c7542",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c33d1513-2166-4780-abd1-da2960d44401",
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
  "created_at": "2026-10-27T19:43:28.432908Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T22:43:28Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "3890f693-3462-4bb1-a4c4-2db6172bc17d",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T19:43:28.620174Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/fe375ac9-2a8f-405a-a2c3-9af7d03c7542/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T19:43:28.433701Z",
      "actor": {
        "type": "CLIENT",
        "id": "c33d1513-2166-4780-abd1-da2960d44401",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "fe375ac9-2a8f-405a-a2c3-9af7d03c7542",
        "preorder": true,
        "quote_id": "0d7033c8-24aa-4f1b-b44c-2884685b001b",
        "pickup_at": "2026-10-27T22:43:28Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T19:43:28.62112Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fe375ac9-2a8f-405a-a2c3-9af7d03c7542",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "3890f693-3462-4bb1-a4c4-2db6172bc17d"
      }
    }
  ]
}
```

Done: pre-order fe375ac9-2a8f-405a-a2c3-9af7d03c7542, reservation 3890f693-3462-4bb1-a4c4-2db6172bc17d.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14493"
}
```

```json
{
  "challenge_id": "0cd4edb2-efb6-4058-b2dc-720053393ea1",
  "expires_at": "2026-10-27T19:48:28.997161341Z",
  "resend_available_at": "2026-10-27T19:43:29.997161341Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "320522",
  "sent_at": "2026-10-27T19:43:28.998786384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0cd4edb2-efb6-4058-b2dc-720053393ea1",
  "code": "320522",
  "device_ref": "sandbox-14493"
}
```

```json
{
  "session_id": "bebb38e6-a93c-436b-80b4-4d4d23dc2fc3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTEwOSwiaWF0IjoxNzkzMTMwMjA5LCJqdGkiOiI1ZjlmNzUwZS00ZWU5LTQ2OGMtYTc1My1jNWIyYzM1M2Q0YmQiLCJzaWQiOiJiZWJiMzhlNi1hOTNjLTQzNmItODBiNC00ZDRkMjNkYzJmYzMifQ.I1kUjo6vhejKTmeeC_seGSabufs4Ch3cWSkWiVie89Y",
  "access_expires_at": "2026-10-27T19:58:29.046848191Z",
  "refresh_token": "6cCbmor04itf_AmHKaGMAhXObwAltKo8IYbxSotcLLo",
  "refresh_expires_at": "2026-11-26T19:43:29.046421707Z",
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
  "command_id": "5ecf585c-833e-444d-9b46-80f484d159b7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:29Z",
    "sequence": 1793130209903
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85eac216-046a-41e9-9cd1-9dbf821ae8f6",
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
  "last_heartbeat_at": "2026-10-27T19:43:29.105411Z",
  "last_location_at": "2026-10-27T19:43:29.105411Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679907908",
  "device_ref": "sandbox-15173"
}
```

```json
{
  "challenge_id": "6f313604-5081-4e62-91e0-c6c5f169936b",
  "expires_at": "2026-10-27T19:48:29.130035027Z",
  "resend_available_at": "2026-10-27T19:43:30.130035027Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679907908` → **200**

```json
{
  "phone": "+380679907908",
  "audience": "CLIENT",
  "code": "069648",
  "sent_at": "2026-10-27T19:43:29.132473783Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f313604-5081-4e62-91e0-c6c5f169936b",
  "code": "069648",
  "device_ref": "sandbox-15173"
}
```

```json
{
  "session_id": "a44c3809-163d-4d79-b99a-459f341a37cc",
  "subject": {
    "type": "CLIENT",
    "id": "c7f4b612-8ebc-45bf-938d-5fabd40e8f59"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2Y0YjYxMi04ZWJjLTQ1YmYtOTM4ZC01ZmFiZDQwZThmNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMTA5LCJpYXQiOjE3OTMxMzAyMDksImp0aSI6ImJhZTFkMzU2LTdmYzctNDlkZS05OWVlLTE4M2VlMDUyNmYxOSIsInNpZCI6ImE0NGMzODA5LTE2M2QtNGQ3OS1iOTlhLTQ1OWYzNDFhMzdjYyJ9.aKVNJUKHm1snI_0qKj7anwJIponCLhPmS2nQhIzARZM",
  "access_expires_at": "2026-10-27T19:58:29.181659271Z",
  "refresh_token": "2MlKsnMMFg99aQ5709K2GeltjzwpEuDyVIYQYFR1rSU",
  "refresh_expires_at": "2026-11-26T19:43:29.181321842Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7fb6efb3-487d-4e5f-93c8-578afed8dded",
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
  "id": "b3eded90-b8dd-4cbd-9549-e6de0468e1d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:48:29.212011Z",
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
  "command_id": "efaab9a2-d79a-4212-a813-017f6936d842",
  "quote_id": "b3eded90-b8dd-4cbd-9549-e6de0468e1d7",
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
  "id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7f4b612-8ebc-45bf-938d-5fabd40e8f59",
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
  "created_at": "2026-10-27T19:43:29.242627Z",
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
    "id": "6430d863-7ed7-4e0a-9a47-c7b2fc43bf39",
    "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
    "expires_at": "2026-10-27T19:43:44.244675Z",
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

`POST /api/driver/v1/offers/6430d863-7ed7-4e0a-9a47-c7b2fc43bf39/accept` → **200**

```json
{
  "command_id": "4fbc8995-1053-4452-8236-10374fa8aa58"
}
```

```json
{
  "id": "ea6eeba1-96c4-4154-afdc-45c36877e7ad",
  "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d4f2c7a2-9564-4db9-8003-86714ccdb925",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d4f2c7a2-9564-4db9-8003-86714ccdb925",
  "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "assignment_id": "ea6eeba1-96c4-4154-afdc-45c36877e7ad",
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

`POST /api/driver/v1/work-sessions/85eac216-046a-41e9-9cd1-9dbf821ae8f6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:29Z",
    "sequence": 1793130209904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85eac216-046a-41e9-9cd1-9dbf821ae8f6",
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
  "last_heartbeat_at": "2026-10-27T19:43:29.350224Z",
  "last_location_at": "2026-10-27T19:43:29.350224Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d4f2c7a2-9564-4db9-8003-86714ccdb925",
  "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "assignment_id": "ea6eeba1-96c4-4154-afdc-45c36877e7ad",
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

`POST /api/driver/v1/trips/d4f2c7a2-9564-4db9-8003-86714ccdb925/arrive` → **200**

```json
{
  "command_id": "b38f4982-bde6-4d6e-8cb9-7116c8a913f3",
  "expected_version": 0
}
```

```json
{
  "id": "d4f2c7a2-9564-4db9-8003-86714ccdb925",
  "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "assignment_id": "ea6eeba1-96c4-4154-afdc-45c36877e7ad",
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
  "arrived_at": "2026-10-27T19:43:29.390178Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d4f2c7a2-9564-4db9-8003-86714ccdb925/start` → **200**

```json
{
  "command_id": "27da8bae-fcce-4372-ae0a-a5a6b80a60ae",
  "expected_version": 1
}
```

```json
{
  "id": "d4f2c7a2-9564-4db9-8003-86714ccdb925",
  "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "assignment_id": "ea6eeba1-96c4-4154-afdc-45c36877e7ad",
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
  "arrived_at": "2026-10-27T19:43:29.390178Z",
  "started_at": "2026-10-27T19:43:29.418019Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/85eac216-046a-41e9-9cd1-9dbf821ae8f6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:29Z",
    "sequence": 1793130209905
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85eac216-046a-41e9-9cd1-9dbf821ae8f6",
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
  "last_heartbeat_at": "2026-10-27T19:43:29.453974Z",
  "last_location_at": "2026-10-27T19:43:29.453974Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d4f2c7a2-9564-4db9-8003-86714ccdb925/complete` → **200**

```json
{
  "command_id": "366093c8-3ae5-440f-8c7b-f99610542a2a",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:43:29Z",
  "cash_received": true
}
```

```json
{
  "id": "d4f2c7a2-9564-4db9-8003-86714ccdb925",
  "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "assignment_id": "ea6eeba1-96c4-4154-afdc-45c36877e7ad",
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
  "arrived_at": "2026-10-27T19:43:29.390178Z",
  "started_at": "2026-10-27T19:43:29.418019Z",
  "completed_at": "2026-10-27T19:43:29.481361Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/15e3539b-030b-46a9-b44e-8d183e444aa8/rating` → **200**

```json
{
  "command_id": "d20e75f2-01c8-40ac-adfc-345c7d6b3a03",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "score": 5,
  "created_at": "2026-10-27T19:43:29.528985298Z"
}
```

`POST /api/driver/v1/orders/15e3539b-030b-46a9-b44e-8d183e444aa8/rating` → **200**

```json
{
  "command_id": "4be57cae-5a03-46cd-ae9e-db766f618c55",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
  "score": 4,
  "created_at": "2026-10-27T19:43:29.574294306Z"
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
  "session_id": "f436223f-2619-4124-8089-efd16b92494b",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMDksImlhdCI6MTc5MzEzMDIwOSwianRpIjoiYTZiY2FjMmItNGUyOS00MGExLWI5YjEtNDk2ZDZlODRlMjkxIiwic2lkIjoiZjQzNjIyM2YtMjYxOS00MTI0LTgwODktZWZkMTZiOTI0OTRiIn0.0iAT2m2WyuDbOt4vcNLw3iuC_F7tXFKuVS4zGGqm9Xc",
  "access_expires_at": "2026-10-27T19:58:29.836327847Z",
  "refresh_token": "TOSFku2H4UYVFB52mKDq713XHUVbz0FRr1HBhFzhVJg",
  "refresh_expires_at": "2026-10-28T07:43:29.835906972Z",
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
  "session_id": "6c43dea9-6422-4333-bb33-198abbd29b9a",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMTAsImlhdCI6MTc5MzEzMDIxMCwianRpIjoiMWM2MGQ5ZDgtNDA0YS00ZWE5LThlZTItODBkZjEyNTc5N2Q0Iiwic2lkIjoiNmM0M2RlYTktNjQyMi00MzMzLWJiMzMtMTk4YWJiZDI5YjlhIn0.cgBPxhaTpSVAoMfhqeCq2q_GrtZoaaX2yq_bu1it3l0",
  "access_expires_at": "2026-10-27T19:58:30.067652334Z",
  "refresh_token": "2cJURYPWlG7nVLN2HeTFOZkQAQg4x63q9ZxMplXqa98",
  "refresh_expires_at": "2026-10-28T07:43:30.067229236Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/15e3539b-030b-46a9-b44e-8d183e444aa8/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
      "author_type": "RIDER",
      "author_id": "c7f4b612-8ebc-45bf-938d-5fabd40e8f59",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T19:43:29.528985Z"
    },
    {
      "order_id": "15e3539b-030b-46a9-b44e-8d183e444aa8",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "c7f4b612-8ebc-45bf-938d-5fabd40e8f59",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T19:43:29.574294Z"
    }
  ]
}
```

Done: ratings for order 15e3539b-030b-46a9-b44e-8d183e444aa8.

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
  "session_id": "8af4c573-b21a-4d60-aa18-ddafbcd08752",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMTAsImlhdCI6MTc5MzEzMDIxMCwianRpIjoiZjYxZmUwZDEtMjliZS00NjI4LWIwNmEtN2RhMzU2NmM1NTg3Iiwic2lkIjoiOGFmNGM1NzMtYjIxYS00ZDYwLWFhMTgtZGRhZmJjZDA4NzUyIn0.MjdRYHYg7UXSVIxhrjxtGZMhHKVyEoMpRglVrBf9naE",
  "access_expires_at": "2026-10-27T19:58:30.358671339Z",
  "refresh_token": "AggkxSxzWG46BgPamcGt868RjdpdC9frlOci_ChNpuQ",
  "refresh_expires_at": "2026-10-28T07:43:30.358242527Z",
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
  "command_id": "b1487a1f-4116-4fe5-b59f-383ca5d271a5",
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
  "changed_by": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:43:30.423006Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "b1487a1f-4116-4fe5-b59f-383ca5d271a5",
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
  "changed_by": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:43:30.423006Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48908135920",
  "device_ref": "sandbox-30575"
}
```

```json
{
  "challenge_id": "4cfc8912-d8a7-4ccf-bbdc-d36ffb9f29bd",
  "expires_at": "2026-10-27T19:48:30.491133843Z",
  "resend_available_at": "2026-10-27T19:43:31.491133843Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48908135920` → **200**

```json
{
  "phone": "+48908135920",
  "audience": "CLIENT",
  "code": "644334",
  "sent_at": "2026-10-27T19:43:30.493092278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cfc8912-d8a7-4ccf-bbdc-d36ffb9f29bd",
  "code": "644334",
  "device_ref": "sandbox-30575"
}
```

```json
{
  "session_id": "2e686b60-bf1a-49b5-8fc7-efcc8cd55354",
  "subject": {
    "type": "CLIENT",
    "id": "d4b8affd-1fff-4536-8fd8-4f60ca015bd0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI4YWZmZC0xZmZmLTQ1MzYtOGZkOC00ZjYwY2EwMTViZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMTEwLCJpYXQiOjE3OTMxMzAyMTAsImp0aSI6IjAwNzVjNjA5LWU0MTctNDUzNS1hNTlkLWU3OWY2YWZiMjg0MiIsInNpZCI6IjJlNjg2YjYwLWJmMWEtNDliNS04ZmM3LWVmY2M4Y2Q1NTM1NCJ9.tQpEB74pSgdNI-OAc8ssmjiKYI-hKvOFfvLRDsT2PjQ",
  "access_expires_at": "2026-10-27T19:58:30.543162387Z",
  "refresh_token": "7E3Qa5NeOqt4u2VjlRM4ctRS0zpa_56iHpla6S3IusY",
  "refresh_expires_at": "2026-11-26T19:43:30.542746319Z",
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
  "correlation_id": "da080f0b-53e1-4228-a5be-99289aa74a65"
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
  "device_ref": "sandbox-24303"
}
```

```json
{
  "challenge_id": "7addf223-cafa-4290-b2dd-db31a11b7b2b",
  "expires_at": "2026-10-27T19:48:30.615814974Z",
  "resend_available_at": "2026-10-27T19:43:31.615814974Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "096408",
  "sent_at": "2026-10-27T19:43:30.617518074Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7addf223-cafa-4290-b2dd-db31a11b7b2b",
  "code": "096408",
  "device_ref": "sandbox-24303"
}
```

```json
{
  "session_id": "c5e90853-334b-4a1f-982e-9ec9e3a0b5d4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTExMCwiaWF0IjoxNzkzMTMwMjEwLCJqdGkiOiI5MGM0NGFmYi0xNWNjLTQ5Y2ItOTgyZC1kNWE4ZTgzNDg4MjQiLCJzaWQiOiJjNWU5MDg1My0zMzRiLTRhMWYtOTgyZS05ZWM5ZTNhMGI1ZDQifQ.6S2ps51zY3f-HavXbeh6YGEk99lkjHec0bxT-qWbbs0",
  "access_expires_at": "2026-10-27T19:58:30.667769977Z",
  "refresh_token": "3VcQ6rlBA-1ynOyhbPrXV1r2zHSXmouMuNK_nn7ZpCU",
  "refresh_expires_at": "2026-11-26T19:43:30.667231515Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "10a2882a-c33a-4615-ae52-6064028dc1f4",
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
  "last_heartbeat_at": "2026-10-27T19:43:28.564253Z",
  "last_location_at": "2026-10-27T19:43:28.564253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/10a2882a-c33a-4615-ae52-6064028dc1f4/handover` → **200**

```json
{
  "command_id": "c1d80db3-2a84-4ede-80f6-f248e33afbfa",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "10a2882a-c33a-4615-ae52-6064028dc1f4",
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
  "last_heartbeat_at": "2026-10-27T19:43:28.564253Z",
  "last_location_at": "2026-10-27T19:43:28.564253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/10a2882a-c33a-4615-ae52-6064028dc1f4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:30Z",
    "sequence": 1793130210742
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "10a2882a-c33a-4615-ae52-6064028dc1f4",
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
  "last_heartbeat_at": "2026-10-27T19:43:30.758998Z",
  "last_location_at": "2026-10-27T19:43:30.758998Z",
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
  "session_id": "10a2882a-c33a-4615-ae52-6064028dc1f4",
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
  "last_heartbeat_at": "2026-10-27T19:43:30.758998Z",
  "last_location_at": "2026-10-27T19:43:30.758998Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/10a2882a-c33a-4615-ae52-6064028dc1f4/close` → **200**

```json
{
  "command_id": "740d3f91-1330-4dc9-a645-f1cf19ea658a",
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
  "correlation_id": "f3087195-8f8b-4800-bdc9-54d92ab7b85a"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671254708",
  "device_ref": "sandbox-11101"
}
```

```json
{
  "challenge_id": "f054cda4-62fb-41e2-9625-c836884531ce",
  "expires_at": "2026-10-27T19:48:30.901636516Z",
  "resend_available_at": "2026-10-27T19:43:31.901636516Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671254708` → **200**

```json
{
  "phone": "+380671254708",
  "audience": "CLIENT",
  "code": "073956",
  "sent_at": "2026-10-27T19:43:30.903445511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f054cda4-62fb-41e2-9625-c836884531ce",
  "code": "073956",
  "device_ref": "sandbox-11101"
}
```

```json
{
  "session_id": "cbf8bd36-f9b9-4459-81a2-b882c59d19dd",
  "subject": {
    "type": "CLIENT",
    "id": "dd872dc9-fff2-4af3-891a-a226dd5c3483"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZDg3MmRjOS1mZmYyLTRhZjMtODkxYS1hMjI2ZGQ1YzM0ODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTMxMTEwLCJpYXQiOjE3OTMxMzAyMTAsImp0aSI6IjJlYjNmMGUxLWE4MWItNDVhZi1hYzI4LWRmNGE3ZTMzNDMwNCIsInNpZCI6ImNiZjhiZDM2LWY5YjktNDQ1OS04MWEyLWI4ODJjNTlkMTlkZCJ9.xLbAJSgmt-XFi0m0jum2l8ejth1uuVy91iFSW9AXL54",
  "access_expires_at": "2026-10-27T19:58:30.952675116Z",
  "refresh_token": "6pBcsQxHV3TGAGPmsL0mTNO2wfRPh8ucGnf76lvsybI",
  "refresh_expires_at": "2026-11-26T19:43:30.952229248Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "457126ca-e1f4-4f5d-bc30-190da74ce953",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7ca75c30-d816-4f75-87ec-68861bef9c36",
  "upload_path": "/api/rider/v1/uploads/7ca75c30-d816-4f75-87ec-68861bef9c36",
  "expires_at": "2026-10-27T19:58:30.984393141Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/7ca75c30-d816-4f75-87ec-68861bef9c36` → **200**

```json
{
  "file_id": "7ca75c30-d816-4f75-87ec-68861bef9c36",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "6ef45b9d-7368-4cf5-8e8c-c8ce8ceddb25",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "7ca75c30-d816-4f75-87ec-68861bef9c36"
  ]
}
```

```json
{
  "id": "c2093c8e-c590-4e99-bb3c-654a4030126d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "dd872dc9-fff2-4af3-891a-a226dd5c3483",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:43:31.049639Z",
  "updated_at": "2026-10-27T19:43:31.049639Z",
  "messages": [
    {
      "id": "1254f627-a7fa-4e34-8865-a4dc4bb6d272",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "dd872dc9-fff2-4af3-891a-a226dd5c3483",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:43:31.050818Z",
      "attachments": [
        {
          "file_id": "7ca75c30-d816-4f75-87ec-68861bef9c36",
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
  "session_id": "eab09e78-8cb3-47df-98b2-89ae221a0f45",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMTEsImlhdCI6MTc5MzEzMDIxMSwianRpIjoiNzJiZmUwY2QtOTI3YS00ZmExLTg3MzQtZmE3YWFlMzNmNTBkIiwic2lkIjoiZWFiMDllNzgtOGNiMy00N2RmLTk4YjItODlhZTIyMWEwZjQ1In0.Pi-9JKoO-n_InRe6wMkTSZRqviNGjgBrztsMl98tU_w",
  "access_expires_at": "2026-10-27T19:58:31.301310378Z",
  "refresh_token": "aiO5o_Bgi0cTb5JRJ0xbKB9OKCpzuJxlPoaHIzHlX-0",
  "refresh_expires_at": "2026-10-28T07:43:31.300977796Z",
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
  "session_id": "d95ea600-36d3-46fd-963f-b250fc4d80ad",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMTEsImlhdCI6MTc5MzEzMDIxMSwianRpIjoiYWZjYzgzY2ItN2Y0Yy00ZjA2LTg3MWYtNTg3MjU5MTFmYzA4Iiwic2lkIjoiZDk1ZWE2MDAtMzZkMy00NmZkLTk2M2YtYjI1MGZjNGQ4MGFkIn0.HFDkOksjncXWqDQxb_-ump6B5B9_eF3KJEl75jCgdGg",
  "access_expires_at": "2026-10-27T19:58:31.534265526Z",
  "refresh_token": "qm7tHf_aOi77sry0hJt_zAJrxvX8eLVs_EblxrILGBE",
  "refresh_expires_at": "2026-10-28T07:43:31.533881811Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/c2093c8e-c590-4e99-bb3c-654a4030126d/attachments/7ca75c30-d816-4f75-87ec-68861bef9c36` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "3c439454-113a-41a2-abc3-94d6c4864103",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7eac47ec-c073-46d4-9cf7-a88fdeaf2e37",
  "upload_path": "/api/operator/v1/uploads/7eac47ec-c073-46d4-9cf7-a88fdeaf2e37",
  "expires_at": "2026-10-27T19:58:31.577849771Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/7eac47ec-c073-46d4-9cf7-a88fdeaf2e37` → **200**

```json
{
  "file_id": "7eac47ec-c073-46d4-9cf7-a88fdeaf2e37",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/c2093c8e-c590-4e99-bb3c-654a4030126d` → **200**

```json
{
  "id": "c2093c8e-c590-4e99-bb3c-654a4030126d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "dd872dc9-fff2-4af3-891a-a226dd5c3483",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:43:31.049639Z",
  "updated_at": "2026-10-27T19:43:31.049639Z",
  "messages": [
    {
      "id": "1254f627-a7fa-4e34-8865-a4dc4bb6d272",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "dd872dc9-fff2-4af3-891a-a226dd5c3483",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:43:31.050818Z",
      "attachments": [
        {
          "file_id": "7ca75c30-d816-4f75-87ec-68861bef9c36",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/c2093c8e-c590-4e99-bb3c-654a4030126d/comments` → **200**

```json
{
  "command_id": "c66ac94f-a2c2-4ccc-bc94-dd7a4965ea6e",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "7eac47ec-c073-46d4-9cf7-a88fdeaf2e37"
  ]
}
```

```json
{
  "id": "c2093c8e-c590-4e99-bb3c-654a4030126d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "dd872dc9-fff2-4af3-891a-a226dd5c3483",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:43:31.049639Z",
  "updated_at": "2026-10-27T19:43:31.661397Z",
  "messages": [
    {
      "id": "1254f627-a7fa-4e34-8865-a4dc4bb6d272",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "dd872dc9-fff2-4af3-891a-a226dd5c3483",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:43:31.050818Z",
      "attachments": [
        {
          "file_id": "7ca75c30-d816-4f75-87ec-68861bef9c36",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "032ffbbd-b27e-4dbf-9a51-bade4c8ae0a8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:43:31.661127Z",
      "attachments": [
        {
          "file_id": "7eac47ec-c073-46d4-9cf7-a88fdeaf2e37",
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

`GET /api/rider/v1/support/cases/c2093c8e-c590-4e99-bb3c-654a4030126d` → **200**

```json
{
  "id": "c2093c8e-c590-4e99-bb3c-654a4030126d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "dd872dc9-fff2-4af3-891a-a226dd5c3483",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:43:31.049639Z",
  "updated_at": "2026-10-27T19:43:31.661397Z",
  "messages": [
    {
      "id": "1254f627-a7fa-4e34-8865-a4dc4bb6d272",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "dd872dc9-fff2-4af3-891a-a226dd5c3483",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:43:31.050818Z",
      "attachments": [
        {
          "file_id": "7ca75c30-d816-4f75-87ec-68861bef9c36",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "032ffbbd-b27e-4dbf-9a51-bade4c8ae0a8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:43:31.661127Z",
      "attachments": [
        {
          "file_id": "7eac47ec-c073-46d4-9cf7-a88fdeaf2e37",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/c2093c8e-c590-4e99-bb3c-654a4030126d/attachments/7eac47ec-c073-46d4-9cf7-a88fdeaf2e37` → **200**

Done: support case c2093c8e-c590-4e99-bb3c-654a4030126d, rider attachment 7ca75c30-d816-4f75-87ec-68861bef9c36, operator attachment 7eac47ec-c073-46d4-9cf7-a88fdeaf2e37.

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
  "session_id": "f6e343c5-4a63-4802-b647-0d336ab93cb1",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMTEsImlhdCI6MTc5MzEzMDIxMSwianRpIjoiZTFmNjVlMDMtMWVmYy00OTUyLWFkMmMtZjM4MDVmNGIzYzgxIiwic2lkIjoiZjZlMzQzYzUtNGE2My00ODAyLWI2NDctMGQzMzZhYjkzY2IxIn0.rd2JKykbNnbTPKib-s32POyjJwQXQxu3WDrDRUQ8s_o",
  "access_expires_at": "2026-10-27T19:58:31.951786289Z",
  "refresh_token": "VtYIcmB4lmNw_nLDhM3HfDOTyW8TTa62JZcnCVOfOGQ",
  "refresh_expires_at": "2026-10-28T07:43:31.951433707Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17301"
}
```

```json
{
  "challenge_id": "223df2f4-0ecb-41ad-8ff3-7f48f33900f3",
  "expires_at": "2026-10-27T19:48:31.975935692Z",
  "resend_available_at": "2026-10-27T19:43:32.975935692Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "445790",
  "sent_at": "2026-10-27T19:43:31.977574595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "223df2f4-0ecb-41ad-8ff3-7f48f33900f3",
  "code": "445790",
  "device_ref": "sandbox-17301"
}
```

```json
{
  "session_id": "2d30f985-18c6-44e5-b1f5-c056d673297c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTExMiwiaWF0IjoxNzkzMTMwMjEyLCJqdGkiOiI3NDlhYzA4MS04OTI5LTQ1NmEtOWYwYy1jOWJlNDkxMGNhYmMiLCJzaWQiOiIyZDMwZjk4NS0xOGM2LTQ0ZTUtYjFmNS1jMDU2ZDY3MzI5N2MifQ.gwQVYZqOe5NuJwefzHnJobBKCXhThhTjnNyjgpN9fxg",
  "access_expires_at": "2026-10-27T19:58:32.023993234Z",
  "refresh_token": "fCnnVql3KkviBqsVYOh9QGr8txvIOIraNeEBhxCmi-o",
  "refresh_expires_at": "2026-11-26T19:43:32.023636666Z",
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
  "command_id": "e2b67e6c-904e-4a0e-8d88-2e896c7df99c",
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
  "device_ref": "sandbox-15038"
}
```

```json
{
  "challenge_id": "1edcc726-de24-4a33-8678-0603c6b1b0bb",
  "expires_at": "2026-10-27T19:48:32.140712315Z",
  "resend_available_at": "2026-10-27T19:43:33.140712315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "084364",
  "sent_at": "2026-10-27T19:43:32.142602968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1edcc726-de24-4a33-8678-0603c6b1b0bb",
  "code": "084364",
  "device_ref": "sandbox-15038"
}
```

```json
{
  "session_id": "35059c74-366a-4708-a861-50db91319d81",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEzMTExMiwiaWF0IjoxNzkzMTMwMjEyLCJqdGkiOiJkMWIyZGIzYi1iY2IwLTQ2ZmQtOTRkMS1mOTlhYmJlYzQxNGQiLCJzaWQiOiIzNTA1OWM3NC0zNjZhLTQ3MDgtYTg2MS01MGRiOTEzMTlkODEifQ.wFB7jxMQDOiUQqLpvuI_SuWGMHxW1_y-hB-peZuLoaw",
  "access_expires_at": "2026-10-27T19:58:32.190491565Z",
  "refresh_token": "wfYx1gD79f2awqLjbH6KOAtg3RSUAXNBrz4IJIPaWE8",
  "refresh_expires_at": "2026-11-26T19:43:32.190114926Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85eac216-046a-41e9-9cd1-9dbf821ae8f6",
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
  "last_heartbeat_at": "2026-10-27T19:43:29.453974Z",
  "last_location_at": "2026-10-27T19:43:29.453974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/85eac216-046a-41e9-9cd1-9dbf821ae8f6/handover` → **200**

```json
{
  "command_id": "fb71aa2e-2f03-4578-a83a-161b4842cb4e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85eac216-046a-41e9-9cd1-9dbf821ae8f6",
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
  "last_heartbeat_at": "2026-10-27T19:43:29.453974Z",
  "last_location_at": "2026-10-27T19:43:29.453974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/85eac216-046a-41e9-9cd1-9dbf821ae8f6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:32Z",
    "sequence": 1793130212261
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "85eac216-046a-41e9-9cd1-9dbf821ae8f6",
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
  "last_heartbeat_at": "2026-10-27T19:43:32.282234Z",
  "last_location_at": "2026-10-27T19:43:32.282234Z",
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
  "command_id": "91f74bf7-f8c5-4828-8e24-715ebe165bb4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:32Z",
    "sequence": 1793130212367
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0274f209-eaf9-49b5-b7c1-8a3054cbd87e",
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
  "last_heartbeat_at": "2026-10-27T19:43:32.383469Z",
  "last_location_at": "2026-10-27T19:43:32.383469Z",
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
  "session_id": "06bb8322-6df7-43ef-9533-ad4d74c3e2a7",
  "subject": {
    "type": "STAFF",
    "id": "d3313143-fb0f-41ac-98d1-0815c53ae6b4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzMxMzE0My1mYjBmLTQxYWMtOThkMS0wODE1YzUzYWU2YjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMzExMTIsImlhdCI6MTc5MzEzMDIxMiwianRpIjoiYmM3ZDQ1OWMtYWE4MS00NWEzLWIzNTktNTYzZTZkOTA0YTYyIiwic2lkIjoiMDZiYjgzMjItNmRmNy00M2VmLTk1MzMtYWQ0ZDc0YzNlMmE3In0.Q4enTrhbixK63KCNSXw3AfR03n24zxFbjxPn-cDrGYQ",
  "access_expires_at": "2026-10-27T19:58:32.64522849Z",
  "refresh_token": "2LWn37zBIxEW4m3fcb4yG3-X-EN4SBRG5CMEkNW-Mm0",
  "refresh_expires_at": "2026-10-28T07:43:32.644842407Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "668249a5-db05-48c6-a474-e1369a537fb1",
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
  "id": "16212082-87e8-4498-ab72-57c1e284adde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:48:32.673947Z",
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
  "command_id": "5859d271-224e-4d11-a37c-1fd9b824a2cd",
  "quote_id": "16212082-87e8-4498-ab72-57c1e284adde",
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
  "id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
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
  "created_at": "2026-10-27T19:43:32.706413Z",
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
    "id": "378393ca-c992-4adf-a69a-b4b656045524",
    "order_id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
    "expires_at": "2026-10-27T19:43:47.708816Z",
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

`POST /api/driver/v1/offers/378393ca-c992-4adf-a69a-b4b656045524/accept` → **200**

```json
{
  "command_id": "2eb791b9-8eec-449a-b941-a9f8269e6653"
}
```

```json
{
  "id": "3313f251-e51d-4629-afd3-87ad6f05a9b1",
  "order_id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "10b35895-0d5e-41fc-aae1-72c08e023755",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "10b35895-0d5e-41fc-aae1-72c08e023755",
  "order_id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
  "assignment_id": "3313f251-e51d-4629-afd3-87ad6f05a9b1",
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

`POST /api/driver/v1/work-sessions/0274f209-eaf9-49b5-b7c1-8a3054cbd87e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:43:32Z",
    "sequence": 1793130212817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0274f209-eaf9-49b5-b7c1-8a3054cbd87e",
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
  "last_heartbeat_at": "2026-10-27T19:43:32.832921Z",
  "last_location_at": "2026-10-27T19:43:32.832921Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/10b35895-0d5e-41fc-aae1-72c08e023755/arrive` → **200**

```json
{
  "command_id": "7f71f1fe-6092-47c5-a4b8-fda945102ef0",
  "expected_version": 0
}
```

```json
{
  "id": "10b35895-0d5e-41fc-aae1-72c08e023755",
  "order_id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
  "assignment_id": "3313f251-e51d-4629-afd3-87ad6f05a9b1",
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
  "arrived_at": "2026-10-27T19:43:32.862725Z",
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

`POST /api/driver/v1/trips/10b35895-0d5e-41fc-aae1-72c08e023755/start` → **200**

```json
{
  "command_id": "717e77a6-a046-4529-a0e0-9fcd07a800a4",
  "expected_version": 1
}
```

```json
{
  "id": "10b35895-0d5e-41fc-aae1-72c08e023755",
  "order_id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
  "assignment_id": "3313f251-e51d-4629-afd3-87ad6f05a9b1",
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
  "arrived_at": "2026-10-27T19:43:32.862725Z",
  "started_at": "2026-10-27T19:43:32.895359Z",
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

`POST /api/driver/v1/trips/10b35895-0d5e-41fc-aae1-72c08e023755/complete` → **200**

```json
{
  "command_id": "699a3ce0-9017-4e67-960f-52f0b894db61",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:43:32Z",
  "cash_received": true
}
```

```json
{
  "id": "10b35895-0d5e-41fc-aae1-72c08e023755",
  "order_id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
  "assignment_id": "3313f251-e51d-4629-afd3-87ad6f05a9b1",
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
  "arrived_at": "2026-10-27T19:43:32.862725Z",
  "started_at": "2026-10-27T19:43:32.895359Z",
  "completed_at": "2026-10-27T19:43:32.931485Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/81432be2-4b18-4fce-a31a-6f76f898ea25` → **200**

```json
{
  "id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
  "short_number": 15,
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
    "id": "3313f251-e51d-4629-afd3-87ad6f05a9b1",
    "order_id": "81432be2-4b18-4fce-a31a-6f76f898ea25",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "10b35895-0d5e-41fc-aae1-72c08e023755",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:43:32.706413Z",
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
  "session_id": "85eac216-046a-41e9-9cd1-9dbf821ae8f6",
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
  "last_heartbeat_at": "2026-10-27T19:43:32.282234Z",
  "last_location_at": "2026-10-27T19:43:32.282234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/85eac216-046a-41e9-9cd1-9dbf821ae8f6/close` → **200**

```json
{
  "command_id": "204709ee-2ff3-432f-ae2a-76ee1f0869a2",
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
  "session_id": "0274f209-eaf9-49b5-b7c1-8a3054cbd87e",
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
  "last_heartbeat_at": "2026-10-27T19:43:32.832921Z",
  "last_location_at": "2026-10-27T19:43:32.832921Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0274f209-eaf9-49b5-b7c1-8a3054cbd87e/close` → **200**

```json
{
  "command_id": "bf3802df-5368-44a7-9d3b-4f545fbe26b2",
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

Done: terminal order 81432be2-4b18-4fce-a31a-6f76f898ea25 by Andrii (5a000000-0000-4000-8000-000000000403).
