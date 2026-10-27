# Sandbox transcript (2026-10-27T13:45:40Z, 6fb8ef2)

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
  "correlation_id": "cfe6e426-6943-4cb9-8d26-7f057ec6da1f"
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
  "session_id": "d8415350-95a6-4719-8615-88840d249154",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NDEsImlhdCI6MTc5MzEwODc0MSwianRpIjoiYWJmMjlhYWItYzYyMy00ZjFiLTk5NzctYjc3M2RiYzEzNDNmIiwic2lkIjoiZDg0MTUzNTAtOTVhNi00NzE5LTg2MTUtODg4NDBkMjQ5MTU0In0.7V7w7Fz--8RX5I6b40RyIAnph444CxGMdhLdEKSbgQg",
  "access_expires_at": "2026-10-27T14:00:41.253330943Z",
  "refresh_token": "M9mgYmBdcXVPzwBRpsudQeZQgYt6NbT6pVJsEmxCVFk",
  "refresh_expires_at": "2026-10-28T01:45:41.251333191Z",
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
  "session_id": "b290dbce-76e5-4949-9772-75642e6d7161",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NDIsImlhdCI6MTc5MzEwODc0MiwianRpIjoiMTU3NjRmMjAtMGRlNC00NGQ4LTljNzUtMmRlY2FhYWVlMmNjIiwic2lkIjoiYjI5MGRiY2UtNzZlNS00OTQ5LTk3NzItNzU2NDJlNmQ3MTYxIn0.Ow_h66AG0mO0mPLirFc2irEQcJ7EWabhDOf3VNb-DeA",
  "access_expires_at": "2026-10-27T14:00:42.441241857Z",
  "refresh_token": "5K4l3DzvSL3_kkELZ1N06-q1d4EoxutJIUNtyEceD-I",
  "refresh_expires_at": "2026-10-28T01:45:42.440243298Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "dd620911-e62c-4579-941a-6c9ea190ca24",
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
  "id": "c983b182-97ab-4035-8ca7-03efc859c693",
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
  "created_by": "4a6a3be9-190a-4779-a572-c06ca0bd222f",
  "created_at": "2026-10-27T13:45:42.504686Z",
  "updated_at": "2026-10-27T13:45:42.504686Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630869365",
  "device_ref": "sandbox-13442"
}
```

```json
{
  "challenge_id": "0535d6b8-bc0e-40aa-9707-cf1136234293",
  "expires_at": "2026-10-27T13:50:42.546631567Z",
  "resend_available_at": "2026-10-27T13:45:43.546631567Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630869365` → **200**

```json
{
  "phone": "+380630869365",
  "audience": "CLIENT",
  "code": "162482",
  "sent_at": "2026-10-27T13:45:42.552705252Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0535d6b8-bc0e-40aa-9707-cf1136234293",
  "code": "162482",
  "device_ref": "sandbox-13442"
}
```

```json
{
  "session_id": "d9b22e75-caeb-4a55-83c8-c1b303b64eb3",
  "subject": {
    "type": "CLIENT",
    "id": "2a2eccdb-36c3-4ce4-a1e4-508969911015"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTJlY2NkYi0zNmMzLTRjZTQtYTFlNC01MDg5Njk5MTEwMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NjQyLCJpYXQiOjE3OTMxMDg3NDIsImp0aSI6ImJhOGRjNTIyLTU5YjYtNGEwNi04N2EyLTNlOTBmNmY5MmU4OSIsInNpZCI6ImQ5YjIyZTc1LWNhZWItNGE1NS04M2M4LWMxYjMwM2I2NGViMyJ9.rr0V0ePoGHEr5RTLKYuAbA14N7ZfRro2vEUA-bDqFf4",
  "access_expires_at": "2026-10-27T14:00:42.616968033Z",
  "refresh_token": "Uz90Qlg4lMDloPmbW38zC15i4a6f-1A5DGRVDiws8yU",
  "refresh_expires_at": "2026-11-26T13:45:42.615676386Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630869365` → **200**

```json
{
  "client_id": "2a2eccdb-36c3-4ce4-a1e4-508969911015"
}
```

`POST /api/admin/v1/rider-wallets/2a2eccdb-36c3-4ce4-a1e4-508969911015/top-ups` → **201**

```json
{
  "command_id": "02ee7208-6e38-4daf-acfa-8e1d1091ce52",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "2a2eccdb-36c3-4ce4-a1e4-508969911015",
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
      "id": "de0b5848-4dfd-43d6-93f3-831dc40da0d8",
      "at": "2026-10-27T13:45:42.689394Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4a6a3be9-190a-4779-a572-c06ca0bd222f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b826b77-44a1-4f5b-9813-c42cb2ffa494",
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
  "id": "b3e31b59-05f5-4667-99c0-82db1b8fe459",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T13:50:42.966959Z",
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
      "id": "c983b182-97ab-4035-8ca7-03efc859c693",
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
  "device_ref": "sandbox-2751"
}
```

```json
{
  "challenge_id": "eea5a9be-0f26-4e96-87eb-4e1a3f1763df",
  "expires_at": "2026-10-27T13:50:43.027096489Z",
  "resend_available_at": "2026-10-27T13:45:44.027096489Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "661338",
  "sent_at": "2026-10-27T13:45:43.04403962Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eea5a9be-0f26-4e96-87eb-4e1a3f1763df",
  "code": "661338",
  "device_ref": "sandbox-2751"
}
```

```json
{
  "session_id": "f6d1cddc-8eed-49cc-9431-a6958b9abccf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY0MywiaWF0IjoxNzkzMTA4NzQzLCJqdGkiOiIwMTIzYWQyZS0wMGUyLTQ1MGYtOWNhOS0zMWIwYjQ4ZGQzNjQiLCJzaWQiOiJmNmQxY2RkYy04ZWVkLTQ5Y2MtOTQzMS1hNjk1OGI5YWJjY2YifQ.7K-rG1-wHNDoh6wbjI7Pb61DyLCzmjQz1GWR173FGyE",
  "access_expires_at": "2026-10-27T14:00:43.095588388Z",
  "refresh_token": "upnv5L2ZzxLelVSZvqqKKw2KOwYDgBD39--pCP3Lq4s",
  "refresh_expires_at": "2026-11-26T13:45:43.094467171Z",
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
  "command_id": "f98b4f3d-97d0-471c-8302-e8fbc380365d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:43Z",
    "sequence": 1793108743164
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3045e86a-8b27-49e0-9c81-9dcfa9894e4a",
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
  "last_heartbeat_at": "2026-10-27T13:45:43.202266Z",
  "last_location_at": "2026-10-27T13:45:43.202266Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1d0bca31-f63b-459c-a043-e7474cb5b1fb",
  "quote_id": "b3e31b59-05f5-4667-99c0-82db1b8fe459",
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
  "id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a2eccdb-36c3-4ce4-a1e4-508969911015",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-27T13:45:43.273041Z",
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
  "client_id": "2a2eccdb-36c3-4ce4-a1e4-508969911015",
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
      "id": "de0b5848-4dfd-43d6-93f3-831dc40da0d8",
      "at": "2026-10-27T13:45:42.689394Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4a6a3be9-190a-4779-a572-c06ca0bd222f",
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
    "id": "d722a0c1-50cc-4dc0-a5d3-f22a33a190b9",
    "order_id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4",
    "expires_at": "2026-10-27T13:45:58.285816Z",
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

`POST /api/driver/v1/offers/d722a0c1-50cc-4dc0-a5d3-f22a33a190b9/accept` → **200**

```json
{
  "command_id": "045fd9be-ae0b-41d4-9588-186be9d933a3"
}
```

```json
{
  "id": "af055df4-18eb-4b46-bf91-1f59b12fd295",
  "order_id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93c5572c-023c-43a4-8037-f522f5095fce",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93c5572c-023c-43a4-8037-f522f5095fce",
  "order_id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4",
  "assignment_id": "af055df4-18eb-4b46-bf91-1f59b12fd295",
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

`POST /api/driver/v1/work-sessions/3045e86a-8b27-49e0-9c81-9dcfa9894e4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:43Z",
    "sequence": 1793108743449
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3045e86a-8b27-49e0-9c81-9dcfa9894e4a",
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
  "last_heartbeat_at": "2026-10-27T13:45:43.466863Z",
  "last_location_at": "2026-10-27T13:45:43.466863Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/93c5572c-023c-43a4-8037-f522f5095fce/arrive` → **200**

```json
{
  "command_id": "721d28c1-585c-4e83-863d-5f2c80ab8ff0",
  "expected_version": 0
}
```

```json
{
  "id": "93c5572c-023c-43a4-8037-f522f5095fce",
  "order_id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4",
  "assignment_id": "af055df4-18eb-4b46-bf91-1f59b12fd295",
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
  "arrived_at": "2026-10-27T13:45:43.506776Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/93c5572c-023c-43a4-8037-f522f5095fce/start` → **200**

```json
{
  "command_id": "f7c188ca-6965-48af-9042-bcf645c3b03a",
  "expected_version": 1
}
```

```json
{
  "id": "93c5572c-023c-43a4-8037-f522f5095fce",
  "order_id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4",
  "assignment_id": "af055df4-18eb-4b46-bf91-1f59b12fd295",
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
  "arrived_at": "2026-10-27T13:45:43.506776Z",
  "started_at": "2026-10-27T13:45:43.542056Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/93c5572c-023c-43a4-8037-f522f5095fce/complete` → **200**

```json
{
  "command_id": "b4286582-b2f4-428c-adb5-7e6585322b89",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:45:43Z",
  "cash_received": true
}
```

```json
{
  "id": "93c5572c-023c-43a4-8037-f522f5095fce",
  "order_id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4",
  "assignment_id": "af055df4-18eb-4b46-bf91-1f59b12fd295",
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
  "arrived_at": "2026-10-27T13:45:43.506776Z",
  "started_at": "2026-10-27T13:45:43.542056Z",
  "completed_at": "2026-10-27T13:45:43.597501Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2a2eccdb-36c3-4ce4-a1e4-508969911015",
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
      "id": "77e839bf-2011-4d38-b6f8-111f53581ac1",
      "at": "2026-10-27T13:45:44.357235Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4"
    },
    {
      "id": "de0b5848-4dfd-43d6-93f3-831dc40da0d8",
      "at": "2026-10-27T13:45:42.689394Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "4a6a3be9-190a-4779-a572-c06ca0bd222f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c983b182-97ab-4035-8ca7-03efc859c693/archive` → **200**

```json
{
  "command_id": "24b6e797-3cc2-4d2e-8f6b-45073798d6e1",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c983b182-97ab-4035-8ca7-03efc859c693",
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
  "created_by": "4a6a3be9-190a-4779-a572-c06ca0bd222f",
  "created_at": "2026-10-27T13:45:42.504686Z",
  "updated_at": "2026-10-27T13:45:46.688843Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3045e86a-8b27-49e0-9c81-9dcfa9894e4a",
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
  "last_heartbeat_at": "2026-10-27T13:45:43.466863Z",
  "last_location_at": "2026-10-27T13:45:43.466863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3045e86a-8b27-49e0-9c81-9dcfa9894e4a/close` → **200**

```json
{
  "command_id": "93db8ae5-0f38-43fb-b8b3-c8c3e40df0fe",
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

Done: order e729df6c-d1cc-4896-9d5c-31f1791ee2c4.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630481321",
  "device_ref": "sandbox-10746"
}
```

```json
{
  "challenge_id": "156582cf-14af-4422-ad2e-b3940768a7c9",
  "expires_at": "2026-10-27T13:50:46.787797097Z",
  "resend_available_at": "2026-10-27T13:45:47.787797097Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630481321` → **200**

```json
{
  "phone": "+380630481321",
  "audience": "CLIENT",
  "code": "937465",
  "sent_at": "2026-10-27T13:45:46.790721842Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "156582cf-14af-4422-ad2e-b3940768a7c9",
  "code": "937465",
  "device_ref": "sandbox-10746"
}
```

```json
{
  "session_id": "e913904f-2300-458d-8a32-27a03b1b418b",
  "subject": {
    "type": "CLIENT",
    "id": "d9eddf61-689c-40c9-8483-b0b768e07935"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOWVkZGY2MS02ODljLTQwYzktODQ4My1iMGI3NjhlMDc5MzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NjQ2LCJpYXQiOjE3OTMxMDg3NDYsImp0aSI6IjQ3NjAwMDUxLTRmMDgtNGJhOS05MDA2LTBlYTZjZDU0YWYzOSIsInNpZCI6ImU5MTM5MDRmLTIzMDAtNDU4ZC04YTMyLTI3YTAzYjFiNDE4YiJ9._oOJKF0xt4yt-kjHsvUhZyxMgg1T8s5nz7TUdXmf_Pg",
  "access_expires_at": "2026-10-27T14:00:46.835582413Z",
  "refresh_token": "DLNjaO4C0wnFAiKmW3tf6eZVZeYME6iB_4rcpxyYUMc",
  "refresh_expires_at": "2026-11-26T13:45:46.834710435Z",
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
  "device_ref": "sandbox-22687"
}
```

```json
{
  "challenge_id": "f4ec4645-ef45-4d30-97ee-d9c1268aa422",
  "expires_at": "2026-10-27T13:50:46.879987291Z",
  "resend_available_at": "2026-10-27T13:45:47.879987291Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "570111",
  "sent_at": "2026-10-27T13:45:46.882856136Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4ec4645-ef45-4d30-97ee-d9c1268aa422",
  "code": "570111",
  "device_ref": "sandbox-22687"
}
```

```json
{
  "session_id": "b88cc12e-1857-474d-a311-d11f681cdeed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY0NiwiaWF0IjoxNzkzMTA4NzQ2LCJqdGkiOiIxNTZkNzE0Zi1lODY3LTQ4Y2UtOWI5YS00OTVlZDcwNzhmY2IiLCJzaWQiOiJiODhjYzEyZS0xODU3LTQ3NGQtYTMxMS1kMTFmNjgxY2RlZWQifQ.VJ7T4y6fLJokNttVo_dSvRLwM-m6vV1a_8ZDPIv50i0",
  "access_expires_at": "2026-10-27T14:00:46.927438191Z",
  "refresh_token": "dgZ9lcsUIEhKr0ZeoTVTFkh2ZmfgND0F1Ndrx-dAc2c",
  "refresh_expires_at": "2026-11-26T13:45:46.926679078Z",
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
  "session_id": "df5f0e95-9c7a-43b4-acc1-29dde9df841c",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NDcsImlhdCI6MTc5MzEwODc0NywianRpIjoiNTQ4YTFlOTgtYWQ5NC00MDJlLTgzZDYtNDkzN2FiN2JlNWU1Iiwic2lkIjoiZGY1ZjBlOTUtOWM3YS00M2I0LWFjYzEtMjlkZGU5ZGY4NDFjIn0.YmR2AIUfIGl6vFL2cuolWLJOXkcL92pHxO9vlaBzyFc",
  "access_expires_at": "2026-10-27T14:00:47.242030761Z",
  "refresh_token": "e5pHCRt-aLo7lTC2x7ebdQbeCz078WDUrisswwM_XbA",
  "refresh_expires_at": "2026-10-28T01:45:47.241383516Z",
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
  "session_id": "c52ec7d0-15ed-4346-b12e-9bc482669654",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NDcsImlhdCI6MTc5MzEwODc0NywianRpIjoiNGQ5MTkwOTMtYTBlMC00YmNmLWFkZjQtYTYwYmVhNjllZjYwIiwic2lkIjoiYzUyZWM3ZDAtMTVlZC00MzQ2LWIxMmUtOWJjNDgyNjY5NjU0In0.uTNUTI55LPD9YX5AMBu46GVu3GmlHvhQWmIgTHroA6o",
  "access_expires_at": "2026-10-27T14:00:47.540762895Z",
  "refresh_token": "lSj3jTNDQu7p0WjUNFQ0zBhjig0OOp2rYiTNo929g9s",
  "refresh_expires_at": "2026-10-28T01:45:47.540008627Z",
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
  "command_id": "9e916b7d-aec7-49b1-8b49-e8051d905409",
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
  "id": "4f3e781c-67c3-4632-ba0a-8390dfdfe171",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T13:50:47.595796Z",
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
  "command_id": "7ebe2f47-19ed-44b8-b961-c0b70245f744",
  "quote_id": "4f3e781c-67c3-4632-ba0a-8390dfdfe171",
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
  "id": "16cd9f24-ce0c-4b5f-be6c-e2241ea50a49",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d9eddf61-689c-40c9-8483-b0b768e07935",
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
  "created_at": "2026-10-27T13:45:47.628437Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/16cd9f24-ce0c-4b5f-be6c-e2241ea50a49` → **200**

```json
{
  "id": "16cd9f24-ce0c-4b5f-be6c-e2241ea50a49",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d9eddf61-689c-40c9-8483-b0b768e07935",
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
  "created_at": "2026-10-27T13:45:47.628437Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/16cd9f24-ce0c-4b5f-be6c-e2241ea50a49/cancel` → **200**

```json
{
  "command_id": "cc254ed0-d8fc-41f5-b683-9150dd812eea",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "16cd9f24-ce0c-4b5f-be6c-e2241ea50a49",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d9eddf61-689c-40c9-8483-b0b768e07935",
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
  "created_at": "2026-10-27T13:45:47.628437Z",
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
  "command_id": "d80ba5f1-aea0-4de6-8c0e-231f2985e8b9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:47Z",
    "sequence": 1793108747734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a20315fc-f870-4c54-8e18-78889d964265",
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
  "last_heartbeat_at": "2026-10-27T13:45:47.745433Z",
  "last_location_at": "2026-10-27T13:45:47.745433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5485"
}
```

```json
{
  "challenge_id": "92248d9e-4aae-49af-adab-257a8193ada9",
  "expires_at": "2026-10-27T13:50:47.771598277Z",
  "resend_available_at": "2026-10-27T13:45:48.771598277Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "971164",
  "sent_at": "2026-10-27T13:45:47.773692589Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92248d9e-4aae-49af-adab-257a8193ada9",
  "code": "971164",
  "device_ref": "sandbox-5485"
}
```

```json
{
  "session_id": "6b026503-f19b-44e6-8bb7-b236a824c610",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY0NywiaWF0IjoxNzkzMTA4NzQ3LCJqdGkiOiIxNzI5MzgwMy1mNWFmLTQxOWUtOTc0OC0yYWI2N2M4M2EwNTIiLCJzaWQiOiI2YjAyNjUwMy1mMTliLTQ0ZTYtOGJiNy1iMjM2YTgyNGM2MTAifQ.Yg86ubLB5EST3L51JOf5EFayOD781W1ka_7iEz2o2So",
  "access_expires_at": "2026-10-27T14:00:47.815569089Z",
  "refresh_token": "MfWi5SeQ22IbzLJdANJDAIdep6JS2aYODuvHd0cmmXk",
  "refresh_expires_at": "2026-11-26T13:45:47.814867034Z",
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
  "command_id": "7a82b039-c09c-42c3-b157-c7e56b59bcee",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:47Z",
    "sequence": 1793108747855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:45:47.868662Z",
  "last_location_at": "2026-10-27T13:45:47.868662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "38765a99-cc99-4dc3-9488-6f2a419010b5",
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
  "id": "a626e58c-23db-46ae-8287-5c26033a3789",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T13:50:47.899607Z",
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
  "command_id": "65a656cc-bf40-44a9-ac38-5637d322063b",
  "quote_id": "a626e58c-23db-46ae-8287-5c26033a3789",
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
  "id": "41b429cc-570a-4ed4-8055-a0face0b4650",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d9eddf61-689c-40c9-8483-b0b768e07935",
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
  "created_at": "2026-10-27T13:45:47.930553Z",
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
    "id": "280e0b26-eac6-457a-8d10-27486c53371f",
    "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
    "expires_at": "2026-10-27T13:46:02.935288Z",
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

`POST /api/driver/v1/offers/280e0b26-eac6-457a-8d10-27486c53371f/accept` → **200**

```json
{
  "command_id": "2f33271e-e50a-48fe-9834-34e96ea30caa"
}
```

```json
{
  "id": "325d2754-a1e6-449b-99f4-15e15aec143d",
  "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f2c3462-ffc4-49e3-ab5e-7c3f6d4e66cb",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f2c3462-ffc4-49e3-ab5e-7c3f6d4e66cb",
  "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
  "assignment_id": "325d2754-a1e6-449b-99f4-15e15aec143d",
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

`POST /api/driver/v1/trips/1f2c3462-ffc4-49e3-ab5e-7c3f6d4e66cb/cancel` → **200**

```json
{
  "command_id": "28aea2c9-93ac-4e76-8733-9f9a480381ed",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "1f2c3462-ffc4-49e3-ab5e-7c3f6d4e66cb",
  "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
  "assignment_id": "325d2754-a1e6-449b-99f4-15e15aec143d",
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

`GET /api/rider/v1/orders/41b429cc-570a-4ed4-8055-a0face0b4650` → **200**

```json
{
  "id": "41b429cc-570a-4ed4-8055-a0face0b4650",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d9eddf61-689c-40c9-8483-b0b768e07935",
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
    "id": "325d2754-a1e6-449b-99f4-15e15aec143d",
    "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1f2c3462-ffc4-49e3-ab5e-7c3f6d4e66cb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T13:45:47.930553Z",
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
    "id": "298a772d-5fc7-4da0-9bee-b713e18df34a",
    "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
    "expires_at": "2026-10-27T13:46:03.054619Z",
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

`POST /api/driver/v1/offers/298a772d-5fc7-4da0-9bee-b713e18df34a/accept` → **200**

```json
{
  "command_id": "1db16a71-4de6-4173-9b59-c18340bfe2c4"
}
```

```json
{
  "id": "3f0695b2-2875-4bf5-977e-47e70948fb8e",
  "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc10d073-8c43-46c5-9b74-1f8a41ad223c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc10d073-8c43-46c5-9b74-1f8a41ad223c",
  "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
  "assignment_id": "3f0695b2-2875-4bf5-977e-47e70948fb8e",
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

`POST /api/driver/v1/trips/dc10d073-8c43-46c5-9b74-1f8a41ad223c/cancel` → **200**

```json
{
  "command_id": "9cf3fa72-fc8e-490b-b2e8-30229a1bae81",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "dc10d073-8c43-46c5-9b74-1f8a41ad223c",
  "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
  "assignment_id": "3f0695b2-2875-4bf5-977e-47e70948fb8e",
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
    "id": "41b429cc-570a-4ed4-8055-a0face0b4650",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T13:45:47.930553Z",
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
    "id": "16cd9f24-ce0c-4b5f-be6c-e2241ea50a49",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T13:45:47.628437Z",
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

`GET /api/operator/v1/orders/41b429cc-570a-4ed4-8055-a0face0b4650/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T13:45:47.931331Z",
      "actor": {
        "type": "CLIENT",
        "id": "d9eddf61-689c-40c9-8483-b0b768e07935",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
        "quote_id": "a626e58c-23db-46ae-8287-5c26033a3789",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T13:45:47.934127Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
        "attempt_id": "3ed8af9d-76b7-4f8a-bdb5-e065df691f91",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T13:45:47.940476Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "280e0b26-eac6-457a-8d10-27486c53371f",
        "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T13:45:47.993538Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "280e0b26-eac6-457a-8d10-27486c53371f",
        "order_id": "41b429cc-570a-4ed4-8055-a0face0b4650",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "325d2754-a1e6-449b-99f4-15e15aec143d"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 16cd9f24-ce0c-4b5f-be6c-e2241ea50a49, 41b429cc-570a-4ed4-8055-a0face0b4650.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734512813",
  "device_ref": "sandbox-5822"
}
```

```json
{
  "challenge_id": "b59b2a42-5938-464a-9b18-c52a504ab45b",
  "expires_at": "2026-10-27T13:50:48.255473594Z",
  "resend_available_at": "2026-10-27T13:45:49.255473594Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734512813` → **200**

```json
{
  "phone": "+380734512813",
  "audience": "CLIENT",
  "code": "592463",
  "sent_at": "2026-10-27T13:45:48.25774351Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b59b2a42-5938-464a-9b18-c52a504ab45b",
  "code": "592463",
  "device_ref": "sandbox-5822"
}
```

```json
{
  "session_id": "7cb5b109-8956-4d56-b5ae-604743f64589",
  "subject": {
    "type": "CLIENT",
    "id": "29a8c38a-22ff-4575-b2d3-b5c78e286860"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWE4YzM4YS0yMmZmLTQ1NzUtYjJkMy1iNWM3OGUyODY4NjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NjQ4LCJpYXQiOjE3OTMxMDg3NDgsImp0aSI6Ijg0ZmJmNDYyLWI5NzktNGFmZC05MTM3LTQxZDAyOTU2NDhkMCIsInNpZCI6IjdjYjViMTA5LTg5NTYtNGQ1Ni1iNWFlLTYwNDc0M2Y2NDU4OSJ9.e1QUNMYjPzyk0pqJCmilmohGOn28t9xDR2iezhLk2qE",
  "access_expires_at": "2026-10-27T14:00:48.300760276Z",
  "refresh_token": "xIlpAg7CtE9GOFRCZda0blGQhTUKZ0hn2y02Fw2gceI",
  "refresh_expires_at": "2026-11-26T13:45:48.300021118Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d1306d5d-cd4f-44b8-b89d-aee2edef3e18",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8131cfe2-3f68-47d2-b8cf-923ff7bc8ff6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8131cfe2-3f68-47d2-b8cf-923ff7bc8ff6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "617eb0deab7e5021b40cba03d08dd64e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8131cfe2-3f68-47d2-b8cf-923ff7bc8ff6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734512813"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8131cfe2-3f68-47d2-b8cf-923ff7bc8ff6",
  "expires_at": "2026-10-27T14:15:48.331223Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/8131cfe2-3f68-47d2-b8cf-923ff7bc8ff6` → **200**

```json
{
  "id": "8131cfe2-3f68-47d2-b8cf-923ff7bc8ff6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T14:15:48.331223Z",
  "card": {
    "id": "c8b6b78c-14b5-44a3-b32e-34c01a40b07b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5235",
    "card_type": "Visa",
    "created_at": "2026-10-27T13:45:48.368272Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "c8b6b78c-14b5-44a3-b32e-34c01a40b07b",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5235",
      "card_type": "Visa",
      "created_at": "2026-10-27T13:45:48.368272Z"
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
  "device_ref": "sandbox-14280"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "a3d74f36-0a51-4195-beec-464581705792",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14280"
}
```

```json
{
  "challenge_id": "da977b6e-959a-470a-b7ee-78e0ff77c76f",
  "expires_at": "2026-10-27T13:50:49.470315987Z",
  "resend_available_at": "2026-10-27T13:45:50.470315987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "346903",
  "sent_at": "2026-10-27T13:45:49.473974983Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da977b6e-959a-470a-b7ee-78e0ff77c76f",
  "code": "346903",
  "device_ref": "sandbox-14280"
}
```

```json
{
  "session_id": "9ba92e00-1329-4ebb-b873-33fb6a6a58e6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY0OSwiaWF0IjoxNzkzMTA4NzQ5LCJqdGkiOiJjNzUyMGUwNy0wZTNjLTRmMTAtYjEyNy1lZGY5ZGY4Y2RiM2EiLCJzaWQiOiI5YmE5MmUwMC0xMzI5LTRlYmItYjg3My0zM2ZiNmE2YTU4ZTYifQ.5S2ZglU-Q22tgGik5vtIOtAShH-5XD9zmwZSQT0DHuw",
  "access_expires_at": "2026-10-27T14:00:49.520872723Z",
  "refresh_token": "6aK82krM-IUG-0V8vvas767d55aO1EZIePMvxwWwiWw",
  "refresh_expires_at": "2026-11-26T13:45:49.520297138Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:45:47.868662Z",
  "last_location_at": "2026-10-27T13:45:47.868662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1a39610-dd35-4275-94d2-10f76cf4096d/handover` → **200**

```json
{
  "command_id": "ea2246a9-24b8-4abd-9dba-f9be3fca4e3d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:45:47.868662Z",
  "last_location_at": "2026-10-27T13:45:47.868662Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1a39610-dd35-4275-94d2-10f76cf4096d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:49Z",
    "sequence": 1793108749591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:45:49.604192Z",
  "last_location_at": "2026-10-27T13:45:49.604192Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a62f84af-0bdd-4b16-9395-5f0143097021",
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
  "id": "9a54d814-1ff7-4355-8c6b-ebb889eb77da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T13:50:49.633887Z",
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
  "command_id": "5424d5c0-c758-464e-b139-ab5d043bd61b",
  "quote_id": "9a54d814-1ff7-4355-8c6b-ebb889eb77da",
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
  "id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "29a8c38a-22ff-4575-b2d3-b5c78e286860",
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
  "created_at": "2026-10-27T13:45:49.663743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f7d71131-391c-4b70-b183-3870cf93a8a4` → **200**

```json
{
  "id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "29a8c38a-22ff-4575-b2d3-b5c78e286860",
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
  "created_at": "2026-10-27T13:45:49.663743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f7d71131-391c-4b70-b183-3870cf93a8a4` → **200**

```json
{
  "id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "29a8c38a-22ff-4575-b2d3-b5c78e286860",
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
  "created_at": "2026-10-27T13:45:49.663743Z",
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
    "id": "af8f670d-4382-4f9e-894a-6ec6303fa8a7",
    "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
    "expires_at": "2026-10-27T13:46:05.492354Z",
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

`POST /api/driver/v1/offers/af8f670d-4382-4f9e-894a-6ec6303fa8a7/accept` → **200**

```json
{
  "command_id": "d94d3adb-3e2d-41a1-879d-543a54ff04ff"
}
```

```json
{
  "id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
  "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
  "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "assignment_id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
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

`POST /api/driver/v1/work-sessions/e1a39610-dd35-4275-94d2-10f76cf4096d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:50Z",
    "sequence": 1793108750814
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:45:50.826166Z",
  "last_location_at": "2026-10-27T13:45:50.826166Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ae605556-0f05-4a07-8c83-54b7d5a8ff5b/arrive` → **200**

```json
{
  "command_id": "5fcc693b-751b-4946-8832-2165b3b5a638",
  "expected_version": 0
}
```

```json
{
  "id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
  "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "assignment_id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
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
  "arrived_at": "2026-10-27T13:45:50.85388Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/ae605556-0f05-4a07-8c83-54b7d5a8ff5b/start` → **200**

```json
{
  "command_id": "718d8816-f4dc-4ce8-adb2-0804a600888f",
  "expected_version": 1
}
```

```json
{
  "id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
  "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "assignment_id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
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
  "arrived_at": "2026-10-27T13:45:50.85388Z",
  "started_at": "2026-10-27T13:45:50.883241Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/ae605556-0f05-4a07-8c83-54b7d5a8ff5b/complete` → **200**

```json
{
  "command_id": "e1d2f9e0-2c4f-43fb-8d22-04e5cf1df666",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:45:50Z"
}
```

```json
{
  "id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
  "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "assignment_id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
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
  "arrived_at": "2026-10-27T13:45:50.85388Z",
  "started_at": "2026-10-27T13:45:50.883241Z",
  "completed_at": "2026-10-27T13:45:50.918352Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f7d71131-391c-4b70-b183-3870cf93a8a4` → **200**

```json
{
  "id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "29a8c38a-22ff-4575-b2d3-b5c78e286860",
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
    "id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
    "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:45:49.663743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f7d71131-391c-4b70-b183-3870cf93a8a4` → **200**

```json
{
  "id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "29a8c38a-22ff-4575-b2d3-b5c78e286860",
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
    "id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
    "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:45:49.663743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f7d71131-391c-4b70-b183-3870cf93a8a4` → **200**

```json
{
  "id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "29a8c38a-22ff-4575-b2d3-b5c78e286860",
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
    "id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
    "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:45:49.663743Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f7d71131-391c-4b70-b183-3870cf93a8a4` → **200**

```json
{
  "id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "29a8c38a-22ff-4575-b2d3-b5c78e286860",
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
    "id": "13627d95-22a4-4c66-9f98-48eb2e605c2a",
    "order_id": "f7d71131-391c-4b70-b183-3870cf93a8a4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ae605556-0f05-4a07-8c83-54b7d5a8ff5b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:45:49.663743Z",
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

Done: card order f7d71131-391c-4b70-b183-3870cf93a8a4.

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
  "device_ref": "sandbox-6482"
}
```

```json
{
  "challenge_id": "6ed6beaf-de66-4b42-a6aa-eb01894004e8",
  "expires_at": "2026-10-27T13:50:54.096626559Z",
  "resend_available_at": "2026-10-27T13:45:55.096626559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "705493",
  "sent_at": "2026-10-27T13:45:54.099163818Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ed6beaf-de66-4b42-a6aa-eb01894004e8",
  "code": "705493",
  "device_ref": "sandbox-6482"
}
```

```json
{
  "session_id": "f4969b95-2860-4d3e-b509-cda09f9a94a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY1NCwiaWF0IjoxNzkzMTA4NzU0LCJqdGkiOiJiYjAzOTk0YS1lYTliLTQ3MDUtODk4MC03MDc3MDk0M2Y5ZjQiLCJzaWQiOiJmNDk2OWI5NS0yODYwLTRkM2UtYjUwOS1jZGEwOWY5YTk0YTgifQ.pat-lIDKIdZCoP_ZemT8AuhoRVKoHQnuFQ0m8g8_R8E",
  "access_expires_at": "2026-10-27T14:00:54.140927799Z",
  "refresh_token": "Eb6CUCyRr9Dyw7klI1Ojnwggq5eEH5cJbCitsRVxm1U",
  "refresh_expires_at": "2026-11-26T13:45:54.140381988Z",
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
  "command_id": "0b57c6e3-78e0-4a0e-824d-8fc03e12fe78",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:54Z",
    "sequence": 1793108754179
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:54.191122Z",
  "last_location_at": "2026-10-27T13:45:54.191122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674175620",
  "device_ref": "sandbox-15386"
}
```

```json
{
  "challenge_id": "ed43d0fb-18c2-4b3a-b7d2-68a239a00354",
  "expires_at": "2026-10-27T13:50:54.215555855Z",
  "resend_available_at": "2026-10-27T13:45:55.215555855Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674175620` → **200**

```json
{
  "phone": "+380674175620",
  "audience": "CLIENT",
  "code": "307291",
  "sent_at": "2026-10-27T13:45:54.217562498Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed43d0fb-18c2-4b3a-b7d2-68a239a00354",
  "code": "307291",
  "device_ref": "sandbox-15386"
}
```

```json
{
  "session_id": "658097b5-d988-4cff-9808-0553f3758238",
  "subject": {
    "type": "CLIENT",
    "id": "ec149782-7ab7-4c6f-b7d3-9fe6a07e08b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYzE0OTc4Mi03YWI3LTRjNmYtYjdkMy05ZmU2YTA3ZTA4YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NjU0LCJpYXQiOjE3OTMxMDg3NTQsImp0aSI6IjVhYTE3MTI2LWMxMWUtNDc5MC05YTMwLTk0ZTg0ODdmMzIzOCIsInNpZCI6IjY1ODA5N2I1LWQ5ODgtNGNmZi05ODA4LTA1NTNmMzc1ODIzOCJ9.WtaeSe9d2OtbqU-3GQCvjt5bFNAXB8vHF5a_HRXVouI",
  "access_expires_at": "2026-10-27T14:00:54.259918775Z",
  "refresh_token": "Gw6WzNPPoN5ucCwN863lz1ebXsCwTn4jdUvLtFMKVRg",
  "refresh_expires_at": "2026-11-26T13:45:54.259237624Z",
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
  "command_id": "fa177682-1ad7-4f72-8d4d-cf0831fde226",
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
  "id": "943ce09f-8bc7-441f-85f4-510427865738",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T13:50:54.309194Z",
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
  "command_id": "9640afe4-ed64-4f66-9570-08e3069e4757",
  "quote_id": "943ce09f-8bc7-441f-85f4-510427865738",
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
  "id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec149782-7ab7-4c6f-b7d3-9fe6a07e08b6",
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
  "created_at": "2026-10-27T13:45:54.340684Z",
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
    "id": "e66d5cec-19fe-4e02-ab15-99327f66fc7d",
    "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
    "expires_at": "2026-10-27T13:46:09.34462Z",
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

`POST /api/driver/v1/offers/e66d5cec-19fe-4e02-ab15-99327f66fc7d/accept` → **200**

```json
{
  "command_id": "28fa5b27-749f-4f38-8d4e-626f540809aa"
}
```

```json
{
  "id": "15c9c73c-5c9f-41cd-ba6c-0b7af16c7a66",
  "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/74a0f167-a270-4cce-a51e-201063d9578e/messages` → **201**

```json
{
  "command_id": "a19c636f-eda9-4c64-a83e-e354b8713678",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "993e1818-4409-4230-839a-59970176b125",
  "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T13:45:54.427828567Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8",
  "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "assignment_id": "15c9c73c-5c9f-41cd-ba6c-0b7af16c7a66",
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

`POST /api/driver/v1/trips/9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8/messages` → **201**

```json
{
  "command_id": "477c7fcd-76c2-4e7b-96cb-b48a6c266e5f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "eb580878-2448-4cbc-9178-a011ab7863e0",
  "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T13:45:54.466114475Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/74a0f167-a270-4cce-a51e-201063d9578e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674175620"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:54Z",
    "sequence": 1793108754525
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:54.537777Z",
  "last_location_at": "2026-10-27T13:45:54.537777Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8",
  "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "assignment_id": "15c9c73c-5c9f-41cd-ba6c-0b7af16c7a66",
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

`POST /api/driver/v1/trips/9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8/arrive` → **200**

```json
{
  "command_id": "4779be5a-429d-4ce3-843d-8516c59cc1a6",
  "expected_version": 0
}
```

```json
{
  "id": "9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8",
  "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "assignment_id": "15c9c73c-5c9f-41cd-ba6c-0b7af16c7a66",
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
  "arrived_at": "2026-10-27T13:45:54.578307Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8/start` → **200**

```json
{
  "command_id": "babf05f5-18d2-4658-b7a0-f1bb9d50896d",
  "expected_version": 1
}
```

```json
{
  "id": "9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8",
  "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "assignment_id": "15c9c73c-5c9f-41cd-ba6c-0b7af16c7a66",
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
  "arrived_at": "2026-10-27T13:45:54.578307Z",
  "started_at": "2026-10-27T13:45:54.611836Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:54Z",
    "sequence": 1793108754632
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:54.64387Z",
  "last_location_at": "2026-10-27T13:45:54.64387Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8/complete` → **200**

```json
{
  "command_id": "8aac50d6-8009-4d1f-9018-64f222e867c4",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:45:54Z",
  "cash_received": true
}
```

```json
{
  "id": "9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8",
  "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "assignment_id": "15c9c73c-5c9f-41cd-ba6c-0b7af16c7a66",
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
  "arrived_at": "2026-10-27T13:45:54.578307Z",
  "started_at": "2026-10-27T13:45:54.611836Z",
  "completed_at": "2026-10-27T13:45:54.674723Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/74a0f167-a270-4cce-a51e-201063d9578e` → **200**

```json
{
  "id": "74a0f167-a270-4cce-a51e-201063d9578e",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ec149782-7ab7-4c6f-b7d3-9fe6a07e08b6",
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
    "id": "15c9c73c-5c9f-41cd-ba6c-0b7af16c7a66",
    "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:45:54.340684Z",
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
    "id": "74a0f167-a270-4cce-a51e-201063d9578e",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T13:45:54.340684Z",
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
    "id": "9a3c67a3-529a-42e8-bb5b-fa0ae43e28e8",
    "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
    "order_short_number": 5,
    "created_at": "2026-10-27T13:45:54.394753Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "93c5572c-023c-43a4-8037-f522f5095fce",
    "order_id": "e729df6c-d1cc-4896-9d5c-31f1791ee2c4",
    "order_short_number": 1,
    "created_at": "2026-10-27T13:45:43.407627Z",
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
  "session_id": "fb67fc23-58c5-450f-889d-aa8226134310",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NTgsImlhdCI6MTc5MzEwODc1OCwianRpIjoiZjEyZjczMzEtM2Q5YS00NjVlLWFmMWMtZTYwNzdiMTdkODUwIiwic2lkIjoiZmI2N2ZjMjMtNThjNS00NTBmLTg4OWQtYWE4MjI2MTM0MzEwIn0.a0e9CH37fNhce57SbCK9_ZRWuxnBvNlv8No--kBFJ_0",
  "access_expires_at": "2026-10-27T14:00:58.06888081Z",
  "refresh_token": "2YWn_87xpWG-9qhazU7qux7Mj0kIh7Fh3ooysKCUMdE",
  "refresh_expires_at": "2026-10-28T01:45:58.068281239Z",
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
  "session_id": "5f65593d-c176-4073-96c8-2ebb52729df0",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NTgsImlhdCI6MTc5MzEwODc1OCwianRpIjoiMWYxM2E5ZTctZmViNi00NTZhLTkwMDQtOWFkMGU5MTE0ZGFhIiwic2lkIjoiNWY2NTU5M2QtYzE3Ni00MDczLTk2YzgtMmViYjUyNzI5ZGYwIn0.AKOw4b6bmLlZppBqT5KpBJxJs7DIbf6HJOTtc_leeh8",
  "access_expires_at": "2026-10-27T14:00:58.364488543Z",
  "refresh_token": "yv2mCBRelnwoOoitUiks3WFjzPsvAy76aJCdQyXlMzY",
  "refresh_expires_at": "2026-10-28T01:45:58.363911698Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/74a0f167-a270-4cce-a51e-201063d9578e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T13:45:54.341477Z",
      "actor": {
        "type": "CLIENT",
        "id": "ec149782-7ab7-4c6f-b7d3-9fe6a07e08b6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
        "quote_id": "943ce09f-8bc7-441f-85f4-510427865738",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T13:45:54.343558Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
        "attempt_id": "154f6245-3828-4896-bbef-30d8c6f7e014",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T13:45:54.349081Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e66d5cec-19fe-4e02-ab15-99327f66fc7d",
        "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T13:45:54.39716Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e66d5cec-19fe-4e02-ab15-99327f66fc7d",
        "order_id": "74a0f167-a270-4cce-a51e-201063d9578e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "15c9c73c-5c9f-41cd-ba6c-0b7af16c7a66"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 74a0f167-a270-4cce-a51e-201063d9578e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29440"
}
```

```json
{
  "challenge_id": "93c53e0b-a798-4adf-bf9f-020a9a0f00c0",
  "expires_at": "2026-10-27T13:50:58.418745505Z",
  "resend_available_at": "2026-10-27T13:45:59.418745505Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "490488",
  "sent_at": "2026-10-27T13:45:58.421139416Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93c53e0b-a798-4adf-bf9f-020a9a0f00c0",
  "code": "490488",
  "device_ref": "sandbox-29440"
}
```

```json
{
  "session_id": "0e02e037-d6ea-48f8-8310-bc25a81e6795",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY1OCwiaWF0IjoxNzkzMTA4NzU4LCJqdGkiOiIwMDk0NTg4MS0yNmQwLTQ0OWItYTI2Yi05ZWNmMzAxYzE3MGIiLCJzaWQiOiIwZTAyZTAzNy1kNmVhLTQ4ZjgtODMxMC1iYzI1YTgxZTY3OTUifQ.kT56SACzq2YDL0jrMtMrWJqKTWcUaWpl5rD0-_-SwSQ",
  "access_expires_at": "2026-10-27T14:00:58.462699181Z",
  "refresh_token": "lQtJe4CzyEzrOJ5Ci5CI4PwUz1SnKXdTRLoqTlSinbE",
  "refresh_expires_at": "2026-11-26T13:45:58.462043054Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:54.64387Z",
  "last_location_at": "2026-10-27T13:45:54.64387Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/handover` → **200**

```json
{
  "command_id": "4b5305bf-cc73-409f-b710-8170d7582b7f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:54.64387Z",
  "last_location_at": "2026-10-27T13:45:54.64387Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:58Z",
    "sequence": 1793108758525
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:58.536663Z",
  "last_location_at": "2026-10-27T13:45:58.536663Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660081092",
  "device_ref": "sandbox-3596"
}
```

```json
{
  "challenge_id": "a678f4ec-30cf-4b6d-9444-5a934b7342df",
  "expires_at": "2026-10-27T13:50:58.556225415Z",
  "resend_available_at": "2026-10-27T13:45:59.556225415Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660081092` → **200**

```json
{
  "phone": "+380660081092",
  "audience": "CLIENT",
  "code": "977702",
  "sent_at": "2026-10-27T13:45:58.558494024Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a678f4ec-30cf-4b6d-9444-5a934b7342df",
  "code": "977702",
  "device_ref": "sandbox-3596"
}
```

```json
{
  "session_id": "e6590cc0-6500-4bea-85de-d762aba7b0b1",
  "subject": {
    "type": "CLIENT",
    "id": "05187aa8-55d5-43ec-aabd-3a6e5c7effa8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTE4N2FhOC01NWQ1LTQzZWMtYWFiZC0zYTZlNWM3ZWZmYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NjU4LCJpYXQiOjE3OTMxMDg3NTgsImp0aSI6ImFlNTk0N2QzLTJlMTctNGExNC04NmMzLWI5NTUzZTk5ZTBkZCIsInNpZCI6ImU2NTkwY2MwLTY1MDAtNGJlYS04NWRlLWQ3NjJhYmE3YjBiMSJ9.OVysy-P4q0_jfZn-YU-okxli5neVNpfkoQ5xPJ7KYOc",
  "access_expires_at": "2026-10-27T14:00:58.600925963Z",
  "refresh_token": "Jo-2npjfvKmDSlDhLiE0UfR9gK9taj0EMM6u0cuIzmE",
  "refresh_expires_at": "2026-11-26T13:45:58.600203472Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0391486c-8bb4-4eca-b7f6-03164060e1ac",
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
  "id": "18510a7f-e20b-40f8-81b9-42ccf5cc27b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T13:50:58.627605Z",
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
  "command_id": "2c04f37c-a817-439c-b2b0-be59d8d283c0",
  "quote_id": "18510a7f-e20b-40f8-81b9-42ccf5cc27b6",
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
  "id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "05187aa8-55d5-43ec-aabd-3a6e5c7effa8",
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
  "created_at": "2026-10-27T13:45:58.656614Z",
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
    "id": "13792e8f-9f72-44eb-8390-b155cb979291",
    "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
    "expires_at": "2026-10-27T13:46:13.660349Z",
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

`POST /api/driver/v1/offers/13792e8f-9f72-44eb-8390-b155cb979291/accept` → **200**

```json
{
  "command_id": "c665ccd1-b1ce-4449-9e5e-c08d699dbdb8"
}
```

```json
{
  "id": "6cd13a04-cb16-4dfd-abec-11dd3b8a4306",
  "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b77fb3f4-c3b7-434b-bd38-334464c3d8ae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b77fb3f4-c3b7-434b-bd38-334464c3d8ae",
  "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
  "assignment_id": "6cd13a04-cb16-4dfd-abec-11dd3b8a4306",
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

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:58Z",
    "sequence": 1793108758753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:58.764291Z",
  "last_location_at": "2026-10-27T13:45:58.764291Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b77fb3f4-c3b7-434b-bd38-334464c3d8ae/arrive` → **200**

```json
{
  "command_id": "4cbe46b1-63e2-40c7-9463-2b9dc24280ff",
  "expected_version": 0
}
```

```json
{
  "id": "b77fb3f4-c3b7-434b-bd38-334464c3d8ae",
  "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
  "assignment_id": "6cd13a04-cb16-4dfd-abec-11dd3b8a4306",
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
  "arrived_at": "2026-10-27T13:45:58.789614Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/b77fb3f4-c3b7-434b-bd38-334464c3d8ae/start` → **200**

```json
{
  "command_id": "83db1ebf-3762-4682-aa30-16159a69ee90",
  "expected_version": 1
}
```

```json
{
  "id": "b77fb3f4-c3b7-434b-bd38-334464c3d8ae",
  "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
  "assignment_id": "6cd13a04-cb16-4dfd-abec-11dd3b8a4306",
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
  "arrived_at": "2026-10-27T13:45:58.789614Z",
  "started_at": "2026-10-27T13:45:58.81757Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:58Z",
    "sequence": 1793108758837
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:58.847872Z",
  "last_location_at": "2026-10-27T13:45:58.847872Z",
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
  "device_ref": "sandbox-6734"
}
```

```json
{
  "challenge_id": "03031d08-957e-4aa3-ad9a-5b97252d29bc",
  "expires_at": "2026-10-27T13:50:58.865893556Z",
  "resend_available_at": "2026-10-27T13:45:59.865893556Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "769453",
  "sent_at": "2026-10-27T13:45:58.867751306Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03031d08-957e-4aa3-ad9a-5b97252d29bc",
  "code": "769453",
  "device_ref": "sandbox-6734"
}
```

```json
{
  "session_id": "bcce55a6-d89f-4926-bf91-338168377d9e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY1OCwiaWF0IjoxNzkzMTA4NzU4LCJqdGkiOiI5ZDNkMDE0Ny03M2UxLTQyMmQtYWJlMC1hNmJmYzE5ZmI3ZGQiLCJzaWQiOiJiY2NlNTVhNi1kODlmLTQ5MjYtYmY5MS0zMzgxNjgzNzdkOWUifQ.oy7S4p24Xzx8ZkQnUx43DX3HcD-fmd7BTvfDecjLL_w",
  "access_expires_at": "2026-10-27T14:00:58.907381869Z",
  "refresh_token": "63YzGb6Osv4SDhsXcf8KiR4H2lUxlhvOcfoL0572hok",
  "refresh_expires_at": "2026-11-26T13:45:58.906826762Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a20315fc-f870-4c54-8e18-78889d964265",
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
  "last_heartbeat_at": "2026-10-27T13:45:47.745433Z",
  "last_location_at": "2026-10-27T13:45:47.745433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a20315fc-f870-4c54-8e18-78889d964265/handover` → **200**

```json
{
  "command_id": "7445caf1-f47f-4123-97d1-26ebac7aa86a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a20315fc-f870-4c54-8e18-78889d964265",
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
  "last_heartbeat_at": "2026-10-27T13:45:47.745433Z",
  "last_location_at": "2026-10-27T13:45:47.745433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a20315fc-f870-4c54-8e18-78889d964265/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4150,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:58Z",
    "sequence": 1793108758968
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a20315fc-f870-4c54-8e18-78889d964265",
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
  "last_heartbeat_at": "2026-10-27T13:45:58.979296Z",
  "last_location_at": "2026-10-27T13:45:58.979296Z",
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
  "session_id": "ed991360-547b-417a-8795-fec4d94e9f11",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NTksImlhdCI6MTc5MzEwODc1OSwianRpIjoiZTBmODE1OTktMGZmMC00M2IxLWE1M2EtNDI0OTc5MGJjMjM2Iiwic2lkIjoiZWQ5OTEzNjAtNTQ3Yi00MTdhLTg3OTUtZmVjNGQ5NGU5ZjExIn0.zBTkOx6Bma3gCNrMMWxt2VzS_wv1RtqSqgY5ZFcm0ug",
  "access_expires_at": "2026-10-27T14:00:59.267258392Z",
  "refresh_token": "yjfCEs3bcygxXzvEcmnZnEZH3g-8WGzGngwG4i-XUBY",
  "refresh_expires_at": "2026-10-28T01:45:59.266827809Z",
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
  "session_id": "eaec6683-9272-4fd3-b4c0-ca6333f6d437",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NTksImlhdCI6MTc5MzEwODc1OSwianRpIjoiZGM5ZDdmZjctN2ZjNy00NTEwLTk3NWMtM2UwZGNhM2JjMzUyIiwic2lkIjoiZWFlYzY2ODMtOTI3Mi00ZmQzLWI0YzAtY2E2MzMzZjZkNDM3In0.vlRkOAkoYqt1RqCgOcR73PNgBmTFfB81bb8Rw_KjtqU",
  "access_expires_at": "2026-10-27T14:00:59.564304499Z",
  "refresh_token": "Q2rHNfrDf4MJSbWzMYZi5qGj48iCTYDHxaOYf90xEHE",
  "refresh_expires_at": "2026-10-28T01:45:59.563761199Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a4d535a2-c699-40fa-a28e-702866a56f1b` → **200**

```json
{
  "id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "05187aa8-55d5-43ec-aabd-3a6e5c7effa8",
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
    "id": "6cd13a04-cb16-4dfd-abec-11dd3b8a4306",
    "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b77fb3f4-c3b7-434b-bd38-334464c3d8ae",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T13:45:58.656614Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a4d535a2-c699-40fa-a28e-702866a56f1b/interrupt` → **200**

```json
{
  "command_id": "29f60612-685e-4bd7-a9cd-ae5b5daa5d39",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "05187aa8-55d5-43ec-aabd-3a6e5c7effa8",
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
      "id": "6cd13a04-cb16-4dfd-abec-11dd3b8a4306",
      "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b77fb3f4-c3b7-434b-bd38-334464c3d8ae",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T13:45:58.656614Z",
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
    "id": "31a22976-1f29-44e0-8688-c0da17366b35",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "05187aa8-55d5-43ec-aabd-3a6e5c7effa8",
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
    "id": "97e9d530-32f8-43f1-80bc-02437911f09a",
    "order_id": "31a22976-1f29-44e0-8688-c0da17366b35",
    "expires_at": "2026-10-27T13:46:14.643662Z",
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

`POST /api/driver/v1/offers/97e9d530-32f8-43f1-80bc-02437911f09a/accept` → **200**

```json
{
  "command_id": "ebc689cb-7388-4d99-b04d-7feb02ce3de4"
}
```

```json
{
  "id": "ee410fc1-2147-4771-b461-fb392fc2bd5e",
  "order_id": "31a22976-1f29-44e0-8688-c0da17366b35",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7af7bc9a-6ab9-462c-9acb-716b0d246f52",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7af7bc9a-6ab9-462c-9acb-716b0d246f52",
  "order_id": "31a22976-1f29-44e0-8688-c0da17366b35",
  "assignment_id": "ee410fc1-2147-4771-b461-fb392fc2bd5e",
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
  "session_id": "a20315fc-f870-4c54-8e18-78889d964265",
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
  "last_heartbeat_at": "2026-10-27T13:45:58.979296Z",
  "last_location_at": "2026-10-27T13:45:58.979296Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a20315fc-f870-4c54-8e18-78889d964265/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:45:59Z",
    "sequence": 1793108759753
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a20315fc-f870-4c54-8e18-78889d964265",
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
  "last_heartbeat_at": "2026-10-27T13:45:59.765728Z",
  "last_location_at": "2026-10-27T13:45:59.765728Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7af7bc9a-6ab9-462c-9acb-716b0d246f52/arrive` → **200**

```json
{
  "command_id": "cecf4917-20c0-4050-b572-8b15aae6ffb9",
  "expected_version": 0
}
```

```json
{
  "id": "7af7bc9a-6ab9-462c-9acb-716b0d246f52",
  "order_id": "31a22976-1f29-44e0-8688-c0da17366b35",
  "assignment_id": "ee410fc1-2147-4771-b461-fb392fc2bd5e",
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
  "arrived_at": "2026-10-27T13:45:59.792541Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7af7bc9a-6ab9-462c-9acb-716b0d246f52/start` → **200**

```json
{
  "command_id": "fed126e0-d6b1-4b87-b076-720c44b6404e",
  "expected_version": 1
}
```

```json
{
  "id": "7af7bc9a-6ab9-462c-9acb-716b0d246f52",
  "order_id": "31a22976-1f29-44e0-8688-c0da17366b35",
  "assignment_id": "ee410fc1-2147-4771-b461-fb392fc2bd5e",
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
  "arrived_at": "2026-10-27T13:45:59.792541Z",
  "started_at": "2026-10-27T13:45:59.820944Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7af7bc9a-6ab9-462c-9acb-716b0d246f52/complete` → **200**

```json
{
  "command_id": "35ae3722-a810-4d6f-ab33-0cfbfc8c0a1b",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:45:59Z"
}
```

```json
{
  "id": "7af7bc9a-6ab9-462c-9acb-716b0d246f52",
  "order_id": "31a22976-1f29-44e0-8688-c0da17366b35",
  "assignment_id": "ee410fc1-2147-4771-b461-fb392fc2bd5e",
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
  "arrived_at": "2026-10-27T13:45:59.792541Z",
  "started_at": "2026-10-27T13:45:59.820944Z",
  "completed_at": "2026-10-27T13:45:59.85116Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "31a22976-1f29-44e0-8688-c0da17366b35",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T13:45:59.633389Z",
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
    "id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T13:45:58.656614Z",
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

`GET /api/operator/v1/orders/a4d535a2-c699-40fa-a28e-702866a56f1b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T13:45:58.657194Z",
      "actor": {
        "type": "CLIENT",
        "id": "05187aa8-55d5-43ec-aabd-3a6e5c7effa8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
        "quote_id": "18510a7f-e20b-40f8-81b9-42ccf5cc27b6",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T13:45:58.659392Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
        "attempt_id": "7fe6c8a2-fc40-4bc0-b709-a86dc2d07b10",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T13:45:58.666455Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "13792e8f-9f72-44eb-8390-b155cb979291",
        "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T13:45:58.71058Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "13792e8f-9f72-44eb-8390-b155cb979291",
        "order_id": "a4d535a2-c699-40fa-a28e-702866a56f1b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6cd13a04-cb16-4dfd-abec-11dd3b8a4306"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted a4d535a2-c699-40fa-a28e-702866a56f1b, follow-up 31a22976-1f29-44e0-8688-c0da17366b35.

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
  "session_id": "6025a185-b79d-4478-af24-e64810df9ace",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NjMsImlhdCI6MTc5MzEwODc2MywianRpIjoiN2FiZDdmMjAtMTUwMi00MWVjLWI1MDQtNGM4ZjIwYmI3ZWFkIiwic2lkIjoiNjAyNWExODUtYjc5ZC00NDc4LWFmMjQtZTY0ODEwZGY5YWNlIn0.AwT1iWlCr2WmGN-yc85Y8EXqIPxaU0dfacBxxi5JRdU",
  "access_expires_at": "2026-10-27T14:01:03.223032759Z",
  "refresh_token": "MM6ViLH1V_bJp-lebo-_N9gcrBoX4W4K1baDOf70dao",
  "refresh_expires_at": "2026-10-28T01:46:03.222481767Z",
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
  "command_id": "560a498d-ee50-43f6-9237-853b6d15e4aa",
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
  "changed_by": "4a6a3be9-190a-4779-a572-c06ca0bd222f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T13:46:03.286162067Z"
}
```

## The rider books the airport for 2026-10-27T16:46:02Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600842084",
  "device_ref": "sandbox-16752"
}
```

```json
{
  "challenge_id": "1ca51947-317d-484f-945c-3f35d661027c",
  "expires_at": "2026-10-27T13:51:03.311286581Z",
  "resend_available_at": "2026-10-27T13:46:04.311286581Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600842084` → **200**

```json
{
  "phone": "+48600842084",
  "audience": "CLIENT",
  "code": "655609",
  "sent_at": "2026-10-27T13:46:03.313146634Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ca51947-317d-484f-945c-3f35d661027c",
  "code": "655609",
  "device_ref": "sandbox-16752"
}
```

```json
{
  "session_id": "5485213e-e162-486a-b9bc-446a05c21c64",
  "subject": {
    "type": "CLIENT",
    "id": "b648457d-5f70-4a93-8dc4-a559c4021b93"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjQ4NDU3ZC01ZjcwLTRhOTMtOGRjNC1hNTU5YzQwMjFiOTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NjYzLCJpYXQiOjE3OTMxMDg3NjMsImp0aSI6ImIzOTUzYmNlLTkwYjMtNGIxZS1hZWJiLWE3ZGFmN2I2NjdmMSIsInNpZCI6IjU0ODUyMTNlLWUxNjItNDg2YS1iOWJjLTQ0NmEwNWMyMWM2NCJ9.YDpm-Cp6oZlwkqI72A8KHNIZzDMwOtU0B67ivYNjkZI",
  "access_expires_at": "2026-10-27T14:01:03.353372083Z",
  "refresh_token": "-5UfNqJM0gMZaHX8Z_HXlu0ms3LaAnouQd6hg6HGvZI",
  "refresh_expires_at": "2026-11-26T13:46:03.352743801Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d2d86d32-7438-4582-8538-f9befb3f4820",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T16:46:02Z"
}
```

```json
{
  "id": "636e5e77-70e5-48c9-bc44-b9394666164f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T13:51:03.382009Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T16:46:02Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "878ff750-5043-49d2-8c15-c89701268264",
  "quote_id": "636e5e77-70e5-48c9-bc44-b9394666164f",
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
  "pickup_at": "2026-10-27T16:46:02Z"
}
```

```json
{
  "id": "d2b87bb8-c35a-4de8-9b23-a2c2083e3c62",
  "short_number": 8,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b648457d-5f70-4a93-8dc4-a559c4021b93",
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
  "created_at": "2026-10-27T13:46:03.411143Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T16:46:02Z",
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
  "device_ref": "sandbox-12296"
}
```

```json
{
  "challenge_id": "ca67d3a9-f4fd-41d5-bb7c-09e93384345f",
  "expires_at": "2026-10-27T13:51:03.451168527Z",
  "resend_available_at": "2026-10-27T13:46:04.451168527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "942212",
  "sent_at": "2026-10-27T13:46:03.452879292Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca67d3a9-f4fd-41d5-bb7c-09e93384345f",
  "code": "942212",
  "device_ref": "sandbox-12296"
}
```

```json
{
  "session_id": "2cfd6fc7-5e2c-449b-8c7e-9cd72eec6546",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY2MywiaWF0IjoxNzkzMTA4NzYzLCJqdGkiOiJlYjdmOTYwZC1hNWJmLTRmNGUtOWJhNi01YzlkNzJjMjhkZTciLCJzaWQiOiIyY2ZkNmZjNy01ZTJjLTQ0OWItOGM3ZS05Y2Q3MmVlYzY1NDYifQ.ijzcsYWAlMrPsIIu-FHUdTJI-UVurKcaMYLofTguZ34",
  "access_expires_at": "2026-10-27T14:01:03.495083712Z",
  "refresh_token": "KLkh0BJt0GblFCpGq78HZrrYNX1kMs1MjYtj2igOI4E",
  "refresh_expires_at": "2026-11-26T13:46:03.494532106Z",
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
  "command_id": "af037215-51c3-41db-aa30-e7bc20d39d3f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:46:03Z",
    "sequence": 1793108763531
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d37b69e-43fe-4364-abc3-984f5bb373d9",
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
  "last_heartbeat_at": "2026-10-27T13:46:03.543203Z",
  "last_location_at": "2026-10-27T13:46:03.543203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d2b87bb8-c35a-4de8-9b23-a2c2083e3c62",
      "short_number": 8,
      "pickup_at": "2026-10-27T16:46:02Z",
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

`POST /api/driver/v1/preorders/d2b87bb8-c35a-4de8-9b23-a2c2083e3c62/reserve` → **200**

```json
{
  "command_id": "fb50b9bd-5a2d-4396-8d2c-8b62a78f2e55"
}
```

```json
{
  "id": "290fb331-d7fc-4fb1-bf91-352e868b021f",
  "state": "RESERVED",
  "order": {
    "order_id": "d2b87bb8-c35a-4de8-9b23-a2c2083e3c62",
    "short_number": 8,
    "pickup_at": "2026-10-27T16:46:02Z",
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
  "reserved_at": "2026-10-27T13:46:03.595733Z",
  "confirm_from": "2026-10-27T16:16:02Z",
  "confirm_until": "2026-10-27T16:26:02Z",
  "drop_until": "2026-10-27T15:46:02Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "290fb331-d7fc-4fb1-bf91-352e868b021f",
      "state": "RESERVED",
      "order": {
        "order_id": "d2b87bb8-c35a-4de8-9b23-a2c2083e3c62",
        "short_number": 8,
        "pickup_at": "2026-10-27T16:46:02Z",
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
      "reserved_at": "2026-10-27T13:46:03.595733Z",
      "confirm_from": "2026-10-27T16:16:02Z",
      "confirm_until": "2026-10-27T16:26:02Z",
      "drop_until": "2026-10-27T15:46:02Z"
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
      "id": "290fb331-d7fc-4fb1-bf91-352e868b021f",
      "state": "RESERVED",
      "order": {
        "order_id": "d2b87bb8-c35a-4de8-9b23-a2c2083e3c62",
        "short_number": 8,
        "pickup_at": "2026-10-27T16:46:02Z",
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
      "reserved_at": "2026-10-27T13:46:03.595733Z",
      "confirm_from": "2026-10-27T16:16:02Z",
      "confirm_until": "2026-10-27T16:26:02Z",
      "drop_until": "2026-10-27T15:46:02Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/290fb331-d7fc-4fb1-bf91-352e868b021f/confirm` → **409**

```json
{
  "command_id": "36ad8eb6-dd5f-4cf7-b3d3-282300d44cb2"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/290fb331-d7fc-4fb1-bf91-352e868b021f/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f565d8b5-e457-45a0-9603-995c77b37be4"
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
  "session_id": "b5eddd88-422d-422f-a29d-415099b5b631",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NjMsImlhdCI6MTc5MzEwODc2MywianRpIjoiOGE5ZDEwNzQtMGY0Ni00NWQyLWJhYzEtZDA2ZWFlZDk5NTg5Iiwic2lkIjoiYjVlZGRkODgtNDIyZC00MjJmLWEyOWQtNDE1MDk5YjViNjMxIn0.5Jz2HCuA5HWDQG6EksLEtvt2y-bOmp-L699ZP-6ENSI",
  "access_expires_at": "2026-10-27T14:01:03.955208656Z",
  "refresh_token": "o3tv_geHpcniibeMWGiHejlyUbE-ONG-RDbwAY0AGkg",
  "refresh_expires_at": "2026-10-28T01:46:03.954742498Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d2b87bb8-c35a-4de8-9b23-a2c2083e3c62` → **200**

```json
{
  "id": "d2b87bb8-c35a-4de8-9b23-a2c2083e3c62",
  "short_number": 8,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b648457d-5f70-4a93-8dc4-a559c4021b93",
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
  "created_at": "2026-10-27T13:46:03.411143Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T16:46:02Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "290fb331-d7fc-4fb1-bf91-352e868b021f",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T13:46:03.595733Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d2b87bb8-c35a-4de8-9b23-a2c2083e3c62/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T13:46:03.412599Z",
      "actor": {
        "type": "CLIENT",
        "id": "b648457d-5f70-4a93-8dc4-a559c4021b93",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d2b87bb8-c35a-4de8-9b23-a2c2083e3c62",
        "preorder": true,
        "quote_id": "636e5e77-70e5-48c9-bc44-b9394666164f",
        "pickup_at": "2026-10-27T16:46:02Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T13:46:03.596706Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d2b87bb8-c35a-4de8-9b23-a2c2083e3c62",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "290fb331-d7fc-4fb1-bf91-352e868b021f"
      }
    }
  ]
}
```

Done: pre-order d2b87bb8-c35a-4de8-9b23-a2c2083e3c62, reservation 290fb331-d7fc-4fb1-bf91-352e868b021f.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30428"
}
```

```json
{
  "challenge_id": "78ae6615-39d5-4e3f-8838-7e99560bad7f",
  "expires_at": "2026-10-27T13:51:04.025108073Z",
  "resend_available_at": "2026-10-27T13:46:05.025108073Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "060785",
  "sent_at": "2026-10-27T13:46:04.026724915Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78ae6615-39d5-4e3f-8838-7e99560bad7f",
  "code": "060785",
  "device_ref": "sandbox-30428"
}
```

```json
{
  "session_id": "66e003a8-c08e-46f8-b770-6541b168304f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY2NCwiaWF0IjoxNzkzMTA4NzY0LCJqdGkiOiJmNGQwZTYyYy0xMmJlLTRhMzctOWU0ZS1mMDU4ODZlZjdjNWUiLCJzaWQiOiI2NmUwMDNhOC1jMDhlLTQ2ZjgtYjc3MC02NTQxYjE2ODMwNGYifQ.ZAZTOsElPcmgUojk3kQ8ZQM6kSzajCuMwIi_MbsSUBc",
  "access_expires_at": "2026-10-27T14:01:04.066763805Z",
  "refresh_token": "0mu_z08SGS1IjWjmLu17b1pAxkcSb47mi9FefEkZ4_g",
  "refresh_expires_at": "2026-11-26T13:46:04.066288181Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:58.847872Z",
  "last_location_at": "2026-10-27T13:45:58.847872Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/handover` → **200**

```json
{
  "command_id": "21b86a28-3816-4cb6-ab9c-450399e8d8dc",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:45:58.847872Z",
  "last_location_at": "2026-10-27T13:45:58.847872Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:46:04Z",
    "sequence": 1793108764146
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:46:04.157489Z",
  "last_location_at": "2026-10-27T13:46:04.157489Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677343954",
  "device_ref": "sandbox-25632"
}
```

```json
{
  "challenge_id": "4c00a49f-9220-47c6-bbf2-d443b08a237f",
  "expires_at": "2026-10-27T13:51:04.175839799Z",
  "resend_available_at": "2026-10-27T13:46:05.175839799Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677343954` → **200**

```json
{
  "phone": "+380677343954",
  "audience": "CLIENT",
  "code": "701214",
  "sent_at": "2026-10-27T13:46:04.177616909Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c00a49f-9220-47c6-bbf2-d443b08a237f",
  "code": "701214",
  "device_ref": "sandbox-25632"
}
```

```json
{
  "session_id": "5b1aaccd-1abe-4b4f-8b93-fec4a7cbfa8f",
  "subject": {
    "type": "CLIENT",
    "id": "7d2200b8-d62a-4e3a-a56d-65a91169799b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDIyMDBiOC1kNjJhLTRlM2EtYTU2ZC02NWE5MTE2OTc5OWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NjY0LCJpYXQiOjE3OTMxMDg3NjQsImp0aSI6ImVkZDIzMDc4LWE0NmEtNDZkZS1iZWI2LTY4NWEyMDE1OWI4OCIsInNpZCI6IjViMWFhY2NkLTFhYmUtNGI0Zi04YjkzLWZlYzRhN2NiZmE4ZiJ9.1PUBSyoSllGJdYtCzWUFd-_pqjebt45a9gawow6E8sE",
  "access_expires_at": "2026-10-27T14:01:04.216530734Z",
  "refresh_token": "Q_RXUOjV1i_foT3waZXN3vKMeoS8HW48_BGyJVoRLLw",
  "refresh_expires_at": "2026-11-26T13:46:04.215918563Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ce2c970b-336e-4028-a548-2307aa0b0147",
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
  "id": "37cbf14f-3a4a-4e42-9d6b-6d91e5a33846",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T13:51:04.245868Z",
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
  "command_id": "5b4c3198-8591-4d63-8240-66f2d25a2eb0",
  "quote_id": "37cbf14f-3a4a-4e42-9d6b-6d91e5a33846",
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
  "id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7d2200b8-d62a-4e3a-a56d-65a91169799b",
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
  "created_at": "2026-10-27T13:46:04.275237Z",
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
    "id": "19507f86-d1d7-4232-8872-69142649d5c1",
    "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
    "expires_at": "2026-10-27T13:46:19.278094Z",
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

`POST /api/driver/v1/offers/19507f86-d1d7-4232-8872-69142649d5c1/accept` → **200**

```json
{
  "command_id": "54b03667-08cb-417d-90f7-6b279771d180"
}
```

```json
{
  "id": "983fe985-6449-4597-a57e-a7afeff5c9f7",
  "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7c04c661-d761-4a7c-b51e-f859924dc6ef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c04c661-d761-4a7c-b51e-f859924dc6ef",
  "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "assignment_id": "983fe985-6449-4597-a57e-a7afeff5c9f7",
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

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:46:04Z",
    "sequence": 1793108764363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:46:04.374836Z",
  "last_location_at": "2026-10-27T13:46:04.374836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c04c661-d761-4a7c-b51e-f859924dc6ef",
  "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "assignment_id": "983fe985-6449-4597-a57e-a7afeff5c9f7",
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

`POST /api/driver/v1/trips/7c04c661-d761-4a7c-b51e-f859924dc6ef/arrive` → **200**

```json
{
  "command_id": "f869f1a6-a8c1-4fbe-9e90-f6f76b67a886",
  "expected_version": 0
}
```

```json
{
  "id": "7c04c661-d761-4a7c-b51e-f859924dc6ef",
  "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "assignment_id": "983fe985-6449-4597-a57e-a7afeff5c9f7",
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
  "arrived_at": "2026-10-27T13:46:04.414932Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7c04c661-d761-4a7c-b51e-f859924dc6ef/start` → **200**

```json
{
  "command_id": "13913619-a8a3-4b42-b671-8788c1959a88",
  "expected_version": 1
}
```

```json
{
  "id": "7c04c661-d761-4a7c-b51e-f859924dc6ef",
  "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "assignment_id": "983fe985-6449-4597-a57e-a7afeff5c9f7",
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
  "arrived_at": "2026-10-27T13:46:04.414932Z",
  "started_at": "2026-10-27T13:46:04.438731Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:46:04Z",
    "sequence": 1793108764454
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:46:04.465234Z",
  "last_location_at": "2026-10-27T13:46:04.465234Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/7c04c661-d761-4a7c-b51e-f859924dc6ef/complete` → **200**

```json
{
  "command_id": "5b60a4e0-15b4-4679-9b3e-60e6474246e2",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:46:04Z",
  "cash_received": true
}
```

```json
{
  "id": "7c04c661-d761-4a7c-b51e-f859924dc6ef",
  "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "assignment_id": "983fe985-6449-4597-a57e-a7afeff5c9f7",
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
  "arrived_at": "2026-10-27T13:46:04.414932Z",
  "started_at": "2026-10-27T13:46:04.438731Z",
  "completed_at": "2026-10-27T13:46:04.488967Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/dcb19905-cb6d-45cc-8d4c-65396d0dff86/rating` → **200**

```json
{
  "command_id": "62b0777e-9d3b-4014-860e-fe3d48bf0e14",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "score": 5,
  "created_at": "2026-10-27T13:46:04.52594899Z"
}
```

`POST /api/driver/v1/orders/dcb19905-cb6d-45cc-8d4c-65396d0dff86/rating` → **200**

```json
{
  "command_id": "e3ac4edc-cdcf-47a6-9a60-69e2ac62986e",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
  "score": 4,
  "created_at": "2026-10-27T13:46:04.552246523Z"
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
  "session_id": "8bf5aaf0-eeec-436c-bc2f-44935dc29380",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NjQsImlhdCI6MTc5MzEwODc2NCwianRpIjoiZGNhNjdmZmItMjZmYy00MTdjLWFjOTEtZjIwZjg2OWE3MzEyIiwic2lkIjoiOGJmNWFhZjAtZWVlYy00MzZjLWJjMmYtNDQ5MzVkYzI5MzgwIn0.C_lyXdY4Qh39RKHrL2lujgpOebSIPxYwA4_WjFS4rlA",
  "access_expires_at": "2026-10-27T14:01:04.871347979Z",
  "refresh_token": "noUYx6SP-dX-5N88VHyitgrQjW-WSqIuyD2ZcFxlT30",
  "refresh_expires_at": "2026-10-28T01:46:04.870853467Z",
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
  "session_id": "32692501-6255-498b-b633-97a9a1522902",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NjUsImlhdCI6MTc5MzEwODc2NSwianRpIjoiMDgzZjdlZGEtMDJmNS00MzQwLTllMmItZmRkMTdhYjFkYjU0Iiwic2lkIjoiMzI2OTI1MDEtNjI1NS00OThiLWI2MzMtOTdhOWExNTIyOTAyIn0.LgFB8Ht_G5-6Uhxu4mKk87jh5iU4qQ4wnjC6AUCaX5Q",
  "access_expires_at": "2026-10-27T14:01:05.163798751Z",
  "refresh_token": "9AhxR70Uj2WVQLB-vt78a2UOnZAM8p_JjabUc1nq__k",
  "refresh_expires_at": "2026-10-28T01:46:05.163336411Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dcb19905-cb6d-45cc-8d4c-65396d0dff86/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
      "author_type": "RIDER",
      "author_id": "7d2200b8-d62a-4e3a-a56d-65a91169799b",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T13:46:04.525949Z"
    },
    {
      "order_id": "dcb19905-cb6d-45cc-8d4c-65396d0dff86",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "7d2200b8-d62a-4e3a-a56d-65a91169799b",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T13:46:04.552247Z"
    }
  ]
}
```

Done: ratings for order dcb19905-cb6d-45cc-8d4c-65396d0dff86.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678080160",
  "device_ref": "sandbox-7833"
}
```

```json
{
  "challenge_id": "fb9ded28-18f2-4c13-b58e-d41b4a5007a0",
  "expires_at": "2026-10-27T13:51:05.229432961Z",
  "resend_available_at": "2026-10-27T13:46:06.229432961Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678080160` → **200**

```json
{
  "phone": "+380678080160",
  "audience": "CLIENT",
  "code": "541377",
  "sent_at": "2026-10-27T13:46:05.23160586Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb9ded28-18f2-4c13-b58e-d41b4a5007a0",
  "code": "541377",
  "device_ref": "sandbox-7833"
}
```

```json
{
  "session_id": "207e7b89-5122-4d1a-9196-5a7cd2218a12",
  "subject": {
    "type": "CLIENT",
    "id": "10d589af-d416-4286-991a-2a7a5a518df7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMGQ1ODlhZi1kNDE2LTQyODYtOTkxYS0yYTdhNWE1MThkZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA5NjY1LCJpYXQiOjE3OTMxMDg3NjUsImp0aSI6ImUwYmE1ZjNmLTJlMWEtNDFlNS05OGJlLTRhYTFiMzA3YjBhMiIsInNpZCI6IjIwN2U3Yjg5LTUxMjItNGQxYS05MTk2LTVhN2NkMjIxOGExMiJ9.9uUHFRGXwsq9wPijtwataAp5uhjL-dIoHnw9EiL5n7Y",
  "access_expires_at": "2026-10-27T14:01:05.273870164Z",
  "refresh_token": "szCb46GMOzN85VhlUcig2vKQDoSUNHJxYphXZ0H2yUU",
  "refresh_expires_at": "2026-11-26T13:46:05.273306693Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "409dcc19-a186-493d-97b7-1b4efaeaca37",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b95bd80c-a5f2-42ed-8ace-7823988f6466",
  "upload_path": "/api/rider/v1/uploads/b95bd80c-a5f2-42ed-8ace-7823988f6466",
  "expires_at": "2026-10-27T14:01:05.300931566Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b95bd80c-a5f2-42ed-8ace-7823988f6466` → **200**

```json
{
  "file_id": "b95bd80c-a5f2-42ed-8ace-7823988f6466",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "58e0f881-2208-42a7-8a83-8e089e258667",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b95bd80c-a5f2-42ed-8ace-7823988f6466"
  ]
}
```

```json
{
  "id": "1b2679ca-71be-4c1a-9262-441e0ae4246f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "10d589af-d416-4286-991a-2a7a5a518df7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T13:46:05.356204Z",
  "updated_at": "2026-10-27T13:46:05.356204Z",
  "messages": [
    {
      "id": "961a48b1-34de-48cc-a81f-fbd866610923",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "10d589af-d416-4286-991a-2a7a5a518df7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T13:46:05.357679Z",
      "attachments": [
        {
          "file_id": "b95bd80c-a5f2-42ed-8ace-7823988f6466",
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
  "session_id": "f840de10-38ff-4573-9f01-5be224b1c960",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NjUsImlhdCI6MTc5MzEwODc2NSwianRpIjoiN2Y3MTg2NjUtNTczMi00OWFlLWFkYTMtNzVhYjQ1YmFkOTgwIiwic2lkIjoiZjg0MGRlMTAtMzhmZi00NTczLTlmMDEtNWJlMjI0YjFjOTYwIn0.XixJmQ3pGuI4HbavBN4Sb6aqZqOc-Cta1oF5w8txv5A",
  "access_expires_at": "2026-10-27T14:01:05.674810036Z",
  "refresh_token": "4E_pRmVVuJT0prndN0gPUJOKhJiGg2lq37OX-qNCvA0",
  "refresh_expires_at": "2026-10-28T01:46:05.674261638Z",
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
  "session_id": "590ad4d9-840e-41c2-b477-9e0cbcc672b9",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NjUsImlhdCI6MTc5MzEwODc2NSwianRpIjoiMjY3Y2ZhMzItM2JmOS00NWIyLTk1NTAtY2U4ZDQyNjIxMTYxIiwic2lkIjoiNTkwYWQ0ZDktODQwZS00MWMyLWI0NzctOWUwY2JjYzY3MmI5In0.hTr9QF989bQjsIzKyYXsPylEkBaXrvx9H7suQHF-TOU",
  "access_expires_at": "2026-10-27T14:01:05.976640277Z",
  "refresh_token": "ypF27CnACr8ocGujecbkj9wlZCFCu31CMzBcKvhfvgM",
  "refresh_expires_at": "2026-10-28T01:46:05.976235591Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/1b2679ca-71be-4c1a-9262-441e0ae4246f/attachments/b95bd80c-a5f2-42ed-8ace-7823988f6466` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "010e3bd5-8efa-43cc-a324-1703db0cadea",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e333da71-d43d-403d-b48d-c24e92b25cf7",
  "upload_path": "/api/operator/v1/uploads/e333da71-d43d-403d-b48d-c24e92b25cf7",
  "expires_at": "2026-10-27T14:01:06.019475519Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/e333da71-d43d-403d-b48d-c24e92b25cf7` → **200**

```json
{
  "file_id": "e333da71-d43d-403d-b48d-c24e92b25cf7",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/1b2679ca-71be-4c1a-9262-441e0ae4246f` → **200**

```json
{
  "id": "1b2679ca-71be-4c1a-9262-441e0ae4246f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "10d589af-d416-4286-991a-2a7a5a518df7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T13:46:05.356204Z",
  "updated_at": "2026-10-27T13:46:05.356204Z",
  "messages": [
    {
      "id": "961a48b1-34de-48cc-a81f-fbd866610923",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "10d589af-d416-4286-991a-2a7a5a518df7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T13:46:05.357679Z",
      "attachments": [
        {
          "file_id": "b95bd80c-a5f2-42ed-8ace-7823988f6466",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/1b2679ca-71be-4c1a-9262-441e0ae4246f/comments` → **200**

```json
{
  "command_id": "251d6ffa-1a89-4565-9bb7-a14e904d85bb",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "e333da71-d43d-403d-b48d-c24e92b25cf7"
  ]
}
```

```json
{
  "id": "1b2679ca-71be-4c1a-9262-441e0ae4246f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "10d589af-d416-4286-991a-2a7a5a518df7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T13:46:05.356204Z",
  "updated_at": "2026-10-27T13:46:06.099755Z",
  "messages": [
    {
      "id": "961a48b1-34de-48cc-a81f-fbd866610923",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "10d589af-d416-4286-991a-2a7a5a518df7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T13:46:05.357679Z",
      "attachments": [
        {
          "file_id": "b95bd80c-a5f2-42ed-8ace-7823988f6466",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "dbbc2cdb-83e8-4bac-842f-eb181809e90d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "4a6a3be9-190a-4779-a572-c06ca0bd222f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T13:46:06.099395Z",
      "attachments": [
        {
          "file_id": "e333da71-d43d-403d-b48d-c24e92b25cf7",
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

`GET /api/rider/v1/support/cases/1b2679ca-71be-4c1a-9262-441e0ae4246f` → **200**

```json
{
  "id": "1b2679ca-71be-4c1a-9262-441e0ae4246f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "10d589af-d416-4286-991a-2a7a5a518df7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T13:46:05.356204Z",
  "updated_at": "2026-10-27T13:46:06.099755Z",
  "messages": [
    {
      "id": "961a48b1-34de-48cc-a81f-fbd866610923",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "10d589af-d416-4286-991a-2a7a5a518df7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T13:46:05.357679Z",
      "attachments": [
        {
          "file_id": "b95bd80c-a5f2-42ed-8ace-7823988f6466",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "dbbc2cdb-83e8-4bac-842f-eb181809e90d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T13:46:06.099395Z",
      "attachments": [
        {
          "file_id": "e333da71-d43d-403d-b48d-c24e92b25cf7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/1b2679ca-71be-4c1a-9262-441e0ae4246f/attachments/e333da71-d43d-403d-b48d-c24e92b25cf7` → **200**

Done: support case 1b2679ca-71be-4c1a-9262-441e0ae4246f, rider attachment b95bd80c-a5f2-42ed-8ace-7823988f6466, operator attachment e333da71-d43d-403d-b48d-c24e92b25cf7.

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
  "session_id": "961b0a95-2d84-4ce2-a85c-6f68693d23d7",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NjYsImlhdCI6MTc5MzEwODc2NiwianRpIjoiYzZjODY4ZWMtN2ZmMi00ZGI0LWFkN2UtZGI1MGIxZmE4N2NjIiwic2lkIjoiOTYxYjBhOTUtMmQ4NC00Y2UyLWE4NWMtNmY2ODY5M2QyM2Q3In0.ZGXUy_iRUzaybccgiC-H0sdckCT22BX2_pRK7M-s6Gc",
  "access_expires_at": "2026-10-27T14:01:06.459414792Z",
  "refresh_token": "gqweu7fuKNI4ynx1-VORO57fxrbzFDVKTcrsuI5MNUY",
  "refresh_expires_at": "2026-10-28T01:46:06.458883128Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24238"
}
```

```json
{
  "challenge_id": "00692d1e-71e2-4c06-876f-7dfc44c2c230",
  "expires_at": "2026-10-27T13:51:06.482524539Z",
  "resend_available_at": "2026-10-27T13:46:07.482524539Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "913210",
  "sent_at": "2026-10-27T13:46:06.484206546Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00692d1e-71e2-4c06-876f-7dfc44c2c230",
  "code": "913210",
  "device_ref": "sandbox-24238"
}
```

```json
{
  "session_id": "5e5f8668-ddc0-4223-ac22-ce39d40df86f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY2NiwiaWF0IjoxNzkzMTA4NzY2LCJqdGkiOiJjM2ZhY2E1Yi00YTBkLTRjMjctODFmNS01OGNkMWY2ZmNhYWQiLCJzaWQiOiI1ZTVmODY2OC1kZGMwLTQyMjMtYWMyMi1jZTM5ZDQwZGY4NmYifQ.p6MFiGNpbq4kvxiS16PeuAGcix5-BGe7uSCq9AvEEfo",
  "access_expires_at": "2026-10-27T14:01:06.526458598Z",
  "refresh_token": "D3AAhIGnfb4e5tnSdstHRonnN_lXHgLNgkdM7W31bVg",
  "refresh_expires_at": "2026-11-26T13:46:06.525962835Z",
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
  "command_id": "24d51ca3-b026-4657-b957-504f14881910",
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
  "device_ref": "sandbox-16946"
}
```

```json
{
  "challenge_id": "c92d02b0-5420-4ab0-817b-80497aea802c",
  "expires_at": "2026-10-27T13:51:06.626192675Z",
  "resend_available_at": "2026-10-27T13:46:07.626192675Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "315063",
  "sent_at": "2026-10-27T13:46:06.62820472Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c92d02b0-5420-4ab0-817b-80497aea802c",
  "code": "315063",
  "device_ref": "sandbox-16946"
}
```

```json
{
  "session_id": "7ddf5c18-9989-40a2-89db-6513e763a45f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwOTY2NiwiaWF0IjoxNzkzMTA4NzY2LCJqdGkiOiIwMGJjYzkxMS0yMjNhLTQ2YzAtOGFiNC05ODZlZTZlNmJiM2EiLCJzaWQiOiI3ZGRmNWMxOC05OTg5LTQwYTItODlkYi02NTEzZTc2M2E0NWYifQ.lfDULEH_kz762CuqcwImxQaJWkPB7x2pW3ovTSCWAzs",
  "access_expires_at": "2026-10-27T14:01:06.669425574Z",
  "refresh_token": "zMRymzE4_s8NOjDnQk9raEDp64IReZl0ENxonuN-uY4",
  "refresh_expires_at": "2026-11-26T13:46:06.668952276Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:46:04.465234Z",
  "last_location_at": "2026-10-27T13:46:04.465234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/handover` → **200**

```json
{
  "command_id": "f85f89f5-1d32-4cec-a5e5-65f31489f4ae",
  "expected_version": 2
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:46:04.465234Z",
  "last_location_at": "2026-10-27T13:46:04.465234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:46:06Z",
    "sequence": 1793108766737
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:46:06.748284Z",
  "last_location_at": "2026-10-27T13:46:06.748284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:45:50.826166Z",
  "last_location_at": "2026-10-27T13:45:50.826166Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e1a39610-dd35-4275-94d2-10f76cf4096d/handover` → **200**

```json
{
  "command_id": "814b9590-b7ce-4e9d-8a15-c4713187a21f",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:45:50.826166Z",
  "last_location_at": "2026-10-27T13:45:50.826166Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e1a39610-dd35-4275-94d2-10f76cf4096d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:46:06Z",
    "sequence": 1793108766826
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:46:06.837029Z",
  "last_location_at": "2026-10-27T13:46:06.837029Z",
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
  "session_id": "a72cbca2-0af5-4f54-99ed-0fde8160835d",
  "subject": {
    "type": "STAFF",
    "id": "4a6a3be9-190a-4779-a572-c06ca0bd222f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTZhM2JlOS0xOTBhLTQ3NzktYTU3Mi1jMDZjYTBiZDIyMmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDk2NjcsImlhdCI6MTc5MzEwODc2NywianRpIjoiYzc2NTNjOWQtNTE2MS00ZmRjLTkxNDQtMWZkMWY2MGI2NTlkIiwic2lkIjoiYTcyY2JjYTItMGFmNS00ZjU0LTk5ZWQtMGZkZTgxNjA4MzVkIn0.6NdbJRNKG81WznZLfSasXz0KykexGv566zPi8lNwVLc",
  "access_expires_at": "2026-10-27T14:01:07.122423254Z",
  "refresh_token": "zSt7j5bUvtkiW4n2XOrK8OV4QRlw6oOf9PHdmI3B5S8",
  "refresh_expires_at": "2026-10-28T01:46:07.121958126Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d4224e88-a16b-443a-9cd0-62b214ee8c79",
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
  "id": "78b1883a-25aa-434f-8518-2809c707cef7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T13:51:07.154267Z",
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
  "command_id": "3a415110-ea74-40e2-bc80-f4b0a4b26319",
  "quote_id": "78b1883a-25aa-434f-8518-2809c707cef7",
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
  "id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
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
  "created_at": "2026-10-27T13:46:07.191175Z",
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
    "id": "02494c9d-a2df-4785-ba94-d495d4af2840",
    "order_id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
    "expires_at": "2026-10-27T13:46:22.194201Z",
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

`POST /api/driver/v1/offers/02494c9d-a2df-4785-ba94-d495d4af2840/accept` → **200**

```json
{
  "command_id": "5a5e6588-ab22-4b05-a6dd-faf3338ee3a7"
}
```

```json
{
  "id": "51b3c4f8-8dad-41ab-a400-8bf7a80fba73",
  "order_id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7601fb89-4a74-49bd-a6fc-ed013b49feaf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7601fb89-4a74-49bd-a6fc-ed013b49feaf",
  "order_id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
  "assignment_id": "51b3c4f8-8dad-41ab-a400-8bf7a80fba73",
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

`POST /api/driver/v1/work-sessions/e1a39610-dd35-4275-94d2-10f76cf4096d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T13:46:07Z",
    "sequence": 1793108767290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:46:07.302412Z",
  "last_location_at": "2026-10-27T13:46:07.302412Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7601fb89-4a74-49bd-a6fc-ed013b49feaf/arrive` → **200**

```json
{
  "command_id": "eb640679-4b07-4039-a210-926672c71735",
  "expected_version": 0
}
```

```json
{
  "id": "7601fb89-4a74-49bd-a6fc-ed013b49feaf",
  "order_id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
  "assignment_id": "51b3c4f8-8dad-41ab-a400-8bf7a80fba73",
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
  "arrived_at": "2026-10-27T13:46:07.328416Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7601fb89-4a74-49bd-a6fc-ed013b49feaf/start` → **200**

```json
{
  "command_id": "c14af4e9-c9b7-4ecb-8122-5668486e9eca",
  "expected_version": 1
}
```

```json
{
  "id": "7601fb89-4a74-49bd-a6fc-ed013b49feaf",
  "order_id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
  "assignment_id": "51b3c4f8-8dad-41ab-a400-8bf7a80fba73",
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
  "arrived_at": "2026-10-27T13:46:07.328416Z",
  "started_at": "2026-10-27T13:46:07.357375Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7601fb89-4a74-49bd-a6fc-ed013b49feaf/complete` → **200**

```json
{
  "command_id": "3a34fd9a-523d-4105-a090-fcac542b131c",
  "expected_version": 2,
  "reported_at": "2026-10-27T13:46:07Z",
  "cash_received": true
}
```

```json
{
  "id": "7601fb89-4a74-49bd-a6fc-ed013b49feaf",
  "order_id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
  "assignment_id": "51b3c4f8-8dad-41ab-a400-8bf7a80fba73",
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
  "arrived_at": "2026-10-27T13:46:07.328416Z",
  "started_at": "2026-10-27T13:46:07.357375Z",
  "completed_at": "2026-10-27T13:46:07.386933Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/f8b7525e-d4c8-4a5e-ad3a-83673c361edc` → **200**

```json
{
  "id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
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
    "id": "51b3c4f8-8dad-41ab-a400-8bf7a80fba73",
    "order_id": "f8b7525e-d4c8-4a5e-ad3a-83673c361edc",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7601fb89-4a74-49bd-a6fc-ed013b49feaf",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T13:46:07.191175Z",
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
  "session_id": "96bbf8ea-e780-4b73-993d-535ea6b4bc23",
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
  "last_heartbeat_at": "2026-10-27T13:46:06.748284Z",
  "last_location_at": "2026-10-27T13:46:06.748284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/96bbf8ea-e780-4b73-993d-535ea6b4bc23/close` → **200**

```json
{
  "command_id": "21d67e69-5fd2-43cb-898d-945b94674787",
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
  "session_id": "e1a39610-dd35-4275-94d2-10f76cf4096d",
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
  "last_heartbeat_at": "2026-10-27T13:46:07.302412Z",
  "last_location_at": "2026-10-27T13:46:07.302412Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1a39610-dd35-4275-94d2-10f76cf4096d/close` → **200**

```json
{
  "command_id": "ea40933a-8b9e-4aae-aa0e-4f6e9559f020",
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

Done: terminal order f8b7525e-d4c8-4a5e-ad3a-83673c361edc by Andrii (5a000000-0000-4000-8000-000000000403).
